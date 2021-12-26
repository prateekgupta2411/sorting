public class Question10 {

        public static void Activities(int s[], int f[]) {

        int i, j;
        System.out.print("Selected Activities: ");
        i = 0;
        System.out.print(i + " ");
        for (j = 1; j < s.length; j++) {
        if (s[j] >= f[i]) {
        System.out.print(j + " ");
        i = j;

        }

        }

        System.out.println();

    }
        static void detail()

        {
        System.out.println("Prateek gupta");
        System.out.println("24");

        }
        public static void main(String[] args) {
        int[] s = {1,2,3,4,7,8,9,9,11,12};
        int[] f = {3,5,4,7,10,9,11,13,12,14};
        Activities(s,f);
        detail();
        }
     }
    

