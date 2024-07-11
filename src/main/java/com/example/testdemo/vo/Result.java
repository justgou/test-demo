package com.example.testdemo.vo;

/**
 * 结果封装
 *
 * @param <T>
 */
public class Result<T> {
    private boolean success;
    private String errorMessage;
    private T data;

    // 私有构造函数，确保只能通过静态方法创建实例
    private Result(boolean success, String errorMessage, T data) {
        this.success = success;
        this.errorMessage = errorMessage;
        this.data = data;
    }

    // 创建成功结果的静态方法
    public static <T> Result<T> success(T data) {
        return new Result<>(true, null, data);
    }

    // 创建失败结果的静态方法
    public static <T> Result<T> error(String errorMessage) {
        return new Result<>(false, errorMessage, null);
    }

    // 判断是否成功
    public boolean isSuccess() {
        return success;
    }

    // 获取错误信息
    public String getErrorMessage() {
        return errorMessage;
    }

    // 获取数据
    public T getData() {
        return data;
    }
}
