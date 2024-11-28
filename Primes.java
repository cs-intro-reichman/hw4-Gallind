public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args[0]);
        //int n = 30;
        System.out.println("Prime numbers up to " + n + ":");
        boolean[] primes = new boolean[n+1];
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i <= n; i++){
            primes[i] = true;
        }
        int i = 0;
        while (i < n){
            while (i <= n && !primes[i]){
                i++;
            }
            int j = i + 1;
            while (j <= n){
                if (j % i == 0){
                    primes[j] = false;
                }
                j++;
            }
            i++;
        }
        int count = 0;
        for (int l = 0; l <= n; l++){
            if (primes[l]){
                System.out.println(l);
                count++;
            }
        }
        System.out.println("There are " + count + " primes between 2 and " + n 
                           + " (" + (int)(((double)count / n) * 100) + "% are primes)");
    }
}