public class Lesson2 {
    public static void main(String[] args) {
        int num_1 = 10, num_2 = 35;
        int summary = num_1 + num_2;
        num_1++;
        System.out.println(summary);
        int subtract = num_1 - num_2;
        num_2-=5;
        System.out.println(subtract);
        int multiply = ++num_1 * num_2;
        System.out.println(multiply);
        int divide = multiply/subtract;
        System.out.println(divide);
        float divide_float = multiply/summary;
        System.out.println(divide_float);
        double divide_by_module = divide_float/divide_float;
        System.out.println(--divide_by_module);

        if (summary >= subtract){
            System.out.println("Summary is " + summary);
        }else {
            System.out.println("Subtract is " + subtract );
        }

        boolean bool = divide_float<=divide_by_module?false:true;
        System.out.println(bool);

        int[] arr = new int[4];
        arr[0] = arr[1];
        arr[1] += 1;
        arr[0] = arr[1];
        System.out.println(arr[0]);
        boolean statement = (arr[0] == arr[1]) || (arr[2] >= arr[3]);
        if (statement){
            System.out.println("First element is " + arr[0] + ",\n" + "Second is " + arr[1]);
        }else {
            System.out.println("Statement is False");
        }

        float[] arr_float = {2.1f, 1, 25.567f, 470};
        System.out.println(arr_float[2]);

        int xor_num = num_1^num_2;
        System.out.println(num_1^num_2);
        System.out.println(summary&subtract);
        int value = divide|arr[1];
        System.out.println(value);
        System.out.println(~value);
        System.out.println(xor_num>>>3);
        System.out.println(multiply<<4);
        System.out.println(summary>>>4);
    }
}
