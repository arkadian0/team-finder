package com.teamfinder.game.common.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TfResult<T> implements Serializable {
    private List<String> errors = new ArrayList<>();
    private T value;

    public TfResult() {}

    public TfResult(T value) {
        this.value = value;
    }
    public TfResult(List<String> errors) {
        this.errors = errors;
    }

    public List<String> getErrors() {
        return errors;
    }

    public T getValue() {
        return value;
    }

    public boolean failed() {
        return !ok();
    }

    public boolean ok() {
        return errors.isEmpty();
    }
}