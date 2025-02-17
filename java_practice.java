public class java_practice {
    private String name;

    java_practice(String value1) {
        name = value1;
    }

    public void showName() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        java_practice obj1 = new java_practice("ou");
        obj1.showName();
    }

}
