public class myMath {

    public boolean longIsPrim(long input) {
        for (long i = 2; i < input; i++) {
            if ((input % i) == 0) {
                return false;
            }
        }
        return true;
    }

}
