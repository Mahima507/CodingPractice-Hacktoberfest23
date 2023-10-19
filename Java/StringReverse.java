public class StringReverse {
        public static void main(String args[]){
            var original = "aditi";
            var reversed = new StringBuilder(original).reverse().toString();
            System.out.println(reversed);
        }
    }
