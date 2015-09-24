package bridge;

class JPEGImpl extends ImageImpl{
    
    
    public void compress(String pathToCompressedFile){
        //JPEG compression algorithm
        System.out.println("Compressing JPEG");
        //save into file
        System.out.println("Saving: " + pathToCompressedFile  + ".jpg");
    }
    
    public void load(String path){
        //save into file
        System.out.println("Loading from " + path  + ".jpg");
    }
}