public class Demo_30以内的奇数 {
    public static void main(String[] args) {
        //创建长度为12的数组
        int[] arr = new int[12];
        int j = 0;
        for (int i = 30; i >= 0; i--) {
            if (i % 2 == 1 && j < 12) {
                arr[j] = i;
                j++;
            }
        }
        //遍历输出
        for (int i = 0; i < 12; i++) {
            System.out.println(arr[i]);
        }
    }
}
