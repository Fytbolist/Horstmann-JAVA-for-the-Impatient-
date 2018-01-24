public class Task10 {

        public static void main(String[] args) throws Exception {
            new Task10().factorial(6);//если ставим отриц число то сгенерим обьект исключения
        }

        public int factorial(int n) throws Exception {
            if (n == 0 || n == 1) {
                return 1;
            }

            {
                //return factorial(n - 1) * n;
                throw new Exception("exeption");
            }


        }
    }

