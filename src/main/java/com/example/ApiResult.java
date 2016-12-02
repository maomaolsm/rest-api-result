package com.example;


public class ApiResult {

  private static final String SUCCESS = "SUCCESS";

  private static final String ERROR = "ERROR";

  private static final String NO_LOGIN = "NO_LOGIN";

  private String result;

  private Object data;

  private String message;

//  private int page;
//
//  private int pageSize;
//
//  private int totalPage;
//
//  private int count;

  public static ApiResult createSuccessResult(Object data) {
    ApiResult result = new ApiResult();
    result.setData(data);
    result.setResult(SUCCESS);
    return result;
  }

  public static ApiResult createSuccessResult() {
    ApiResult result = new ApiResult();
    result.setResult(SUCCESS);
    return result;
  }

  public static ApiResult createNoLoginResult() {
    ApiResult result = new ApiResult();
    result.setResult(NO_LOGIN);
    result.setMessage("请重新登录");
    return result;
  }

  public static ApiResult createSuccessResult(String message) {
    ApiResult result = new ApiResult();
    result.setResult(SUCCESS);
    result.setMessage(message);
    return result;
  }

  public static ApiResult createErrorResult(String message) {
    ApiResult result = new ApiResult();
    result.setMessage(message);
    result.setResult(ERROR);
    return result;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public static String getNoLogin() {
    return NO_LOGIN;
  }

//  public int getPage() {
//    return page;
//  }
//
//  public void setPage(int page) {
//    this.page = page;
//  }
//
//  public int getTotalPage() {
//    return totalPage;
//  }
//
//  public void setTotalPage(int totalPage) {
//    this.totalPage = totalPage;
//  }
//
//  public int getCount() {
//    return count;
//  }
//
//  public void setCount(int count) {
//    this.count = count;
//  }
//
//  public int getPageSize() {
//    return pageSize;
//  }
//
//  public void setPageSize(int pageSize) {
//    this.pageSize = pageSize;
//  }

}
