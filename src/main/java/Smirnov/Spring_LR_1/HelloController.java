package Smirnov.Spring_LR_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    private List<String> stringList;
    private Map<Integer, String> stringMap;

    static int key = 0;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name",
            defaultValue = "World") String name) {
        return String.format("Hello %s", name);
    }

    @GetMapping("/update-array")
    public String updateArrayList(@RequestParam String s) {
        if (stringList == null) {
            stringList = new ArrayList<>();
            stringList.add(s);
            return "Создан новый список и добавлен элемент: " + s;
        }
        stringList.add(s);
        return "Добавлен элемент: " + s;
    }

    @GetMapping("/show-array")
    public String showArrayList() {
        String stringOfList = String.join(", ", stringList);
        return "Элементы списка: " + stringOfList;
    }

    @GetMapping("/update-map")
    public String updateHashMap(@RequestParam String s) {
        if (stringMap == null) {
            stringMap = new HashMap<>();
            stringMap.put(key++, s);
            return "Создан новая мапа и добавлено значение: " + s + " по ключу: " + (key - 1);
        }
        stringMap.put(key++, s);
        return "Добавлен элемент: " + s;
    }

    @GetMapping("/show-map")
    public String showHashMap() {
        return stringMap.toString();
    }

    @GetMapping("/show-all-lenght")
    public String showAllLenght() {
        return "Кол-во элементов в списке: " + stringList.size() + "\nКол-во элементов в мапе: " + stringMap.size();
    }
}
