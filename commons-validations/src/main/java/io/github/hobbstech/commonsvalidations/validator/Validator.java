package io.github.hobbstech.commonsvalidations.validator;

public interface Validator<T> {

    void validate(T target);

}
