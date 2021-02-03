package com.teamfinder.game.common.response;

import org.springframework.http.HttpStatus;

public class TfResponseEntity<T> {
    private final TfResult<T> result;
    private final HttpStatus httpStatus;

    public static <T>TfResponseEntity<T> ofSuccess(TfResult<T> result) {
        return new TfResponseEntity<>(result, HttpStatus.OK);
    }

    public static <T>TfResponseEntity<T> created(TfResult<T> result) {
        return new TfResponseEntity<>(result, HttpStatus.CREATED);
    }

    public TfResult<T> getResult() {
        return result;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    private TfResponseEntity(TfResult<T> result, HttpStatus httpStatus) {
        this.result = result;
        this.httpStatus = httpStatus;
    }
}
