public class Main {
    public static void main(String[] args) {
        String[] kosucular = {"Kadir", "Gökan", "Hakan", "Suzan", "Pınar", "Mehmet", "Ali", "Emel", "Fırat", "James", "Jale", "Ersin", "Deniz", "Gözde", "Anıl", "Burak"};
        int[] dereceler = {341 , 273 , 278 , 329 , 445 , 402 , 388 , 270 , 243 , 334 , 412 , 393 , 299 , 343 , 317 , 265};

        Maraton yaris = new Maraton(dereceler , kosucular);
        yaris.Hizlilar();
        yaris.klasman();
    }
}