package ru.Smirnov.Spring_LR_2.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.Smirnov.Spring_LR_2.exception.ValidationFailedException;


@Service
public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException;

}
