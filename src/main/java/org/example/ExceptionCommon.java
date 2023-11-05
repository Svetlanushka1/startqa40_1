package org.example;

public class ExceptionCommon {
    //psvm
    public static void main(String[] args) {//throws InterruptedException {
        try {// do code
            System.out.println(9 / 3);
        } catch (Exception e) {//if code is not ok , send error message but do not stop the code
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(1 / 0);
            Thread.sleep(500);
        } catch (NullPointerException e) {
            System.out.println(e.getStackTrace());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("finally");
        }
        pause();
        delimetr(5, 0);

    }

    public static void pause() {//throws InterruptedException it is necessary to 'throw' each method where pause will be used
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int delimetr(int a, int b) {
        int res = 0;
        try {
            res = a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }


}
