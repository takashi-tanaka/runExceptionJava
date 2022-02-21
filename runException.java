

class runException  {
    public static void main(String[] args) {
        Exception2 Exception2 = new  Exception2();
        Exception2.callClass();
    }
}

class Exception2 {

    public void callClass() {
        Exception3 Exception3 = new  Exception3();
        Exception3.callClass();
    }
}

class Exception3 {

    public void callClass() {
        Exception4 Exception4 = new  Exception4();
        Exception4.callClass();
    }
}

class Exception4 {

    public void callClass() {
        Exception5 Exception5 = new  Exception5();
        Exception5.callClass();
    }
}

class Exception5 {

    public void callClass() {
        Exception6 Exception6 = new Exception6();
        Exception6.callClass();
    }
}

class Exception6 {

    public void callClass() {
        Exception7 Exception7 = new Exception7();
        Exception7.callClass();
    }
}
class Exception7 {

    public void callClass() {
        Exception8 Exception8 = new Exception8();
        Exception8.callClass();
    }
}
class Exception8 {

    public void callClass() {
        Exception9 Exception9 = new Exception9();
        Exception9.callClass();
    }
}
class Exception9 {

    public void callClass() {
        Exception10 Exception10 = new Exception10();
        Exception10.runExeption();
    }
}

class Exception10 {
    public void runExeption() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}