import java.io.*;
class test{
    public static void main(String args[]) throws IOException{
        File file = new File("qqq.jpg");
        FileInputStream fis = new FileInputStream(file);

        File copyFile = new File("copy_qqq.jpg");
        FileOutputStream fos = new FileOutputStream(copyFile);

        int x = 0;
        byte[] buffer = new byte[100];
        while((x = fis.read(buffer)) != -1){
            if(x ==100){
                fos.write(buffer);
            }
            else{
                for(int i = 0; i < x; i++){
                    fos.write(buffer[i]);
                }
            }
            System.out.println("x : " + x);

        }
        fos.close();
        fis.close();
    }
}