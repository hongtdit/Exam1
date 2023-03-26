public class IllegalTriangleCheck {
    public void checkIllegalTriangle(double a, double b, double c) throws IllegalTriangleException{
        if(a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("lÕI Tam giá không hợp lệ");
        } else {
            System.out.println("Tam giac hop le!");
        }

    }
}
