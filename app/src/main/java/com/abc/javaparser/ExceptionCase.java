package com.abc.javaparser;

/**
 * description：模拟异常类，包括空指针、数组业界和ANR
 * ===============================
 * creator：zhangzixu
 * create time：2018/8/31 下午2:48
 * ===============================
 * reasons for modification：
 * Modifier：
 * Modify time：
 */

public class ExceptionCase {

    /**
     * 模拟空指针
     */
    public static void nullPoint() {
        Integer i = null;
        i.toString();
    }

    /**
     * 模拟数组越界
     */
    public static void indexOutOfBounds() {
        int arr[] = new int[1];
        arr[1] = 0;
    }

    /**
     * 模拟ANR
     */
    public static void anr() {
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
