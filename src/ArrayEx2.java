public class ArrayEx2 {
    
    public static void main(String args[]) {
        String[] browsers = new String[4];// criacao de uma matriz
        browsers[0] = "explorer";
        browsers[1] = "chrome";
        browsers[2] = "opera";
        browsers[3] = "firefox";
        
        System.out.println("Navegadores: ");
        for(String i : browsers)// loop for-each para exibir
        {
            
            System.out.println(i);
        }
    }
    
}
