package pl.edu.pw.elka.prm2t.lab4.zad1;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class main {

    public static int[][] readImage(String pathName) throws IOException {
        BufferedImage img = ImageIO.read(new File(pathName));
        int width = img.getWidth();
        int height = img.getHeight();
        int[][] pixels = new int[height][width];

        for(int y=0; y<height; y++){
            for(int x=0; x<width; x++){
                pixels[x][y]=img.getRGB(x,y);
                if(pixels[y][x]==(-1)){
                    pixels[y][x]=1;
                }
                else{
                    pixels[y][x]=0;
                }
            }
        }
        return pixels;
    }

    public static void main(String[] arg) throws IOException {

        int[][] pixels = readImage("D:\\prm2t22l_slepowronska_318847\\src\\pl\\edu\\pw\\elka\\prm2t\\zad4\\obrazek3.png");

        for(int i=0; i<pixels.length; i++){
            for(int j=0; j<pixels[i].length; j++){
                System.out.println(pixels[i][j]);
            }
        }

        int l;

        for(int i=0; i<pixels.length; i++){
            for(int j=0; j<pixels[i].length; j++){
                if(pixels[i][j]==0){
                    continue;
                }
                else{
                    l=1;
                    pixels[i][j]=0;

                }
            }
        }
    }
}
