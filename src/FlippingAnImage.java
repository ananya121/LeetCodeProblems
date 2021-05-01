
public class FlippingAnImage {

	public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0,k=image[i].length-1;j<image[i].length/2;j++,k--)
            {
                //Swap
                int temp= image[i][j];
                image[i][j]=image[i][k];
                image[i][k]=temp;
                
            }
            
            for(int a=0;a<image[i].length;a++)
            {
                if(image[i][a]==0)
                    image[i][a]=1;
                else
                    image[i][a]=0;
            }
        }
        return image;
    }
}
