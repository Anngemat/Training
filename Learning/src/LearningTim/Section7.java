package LearningTim;

public class Section7 {

	double width;
    double height;
    public Section7(){
        
    }
    public Section7(double width,double height){
        this.width = width;
        this.height = height;
    }
    
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
     public void setHeight(double height){
        if (height<0){
            height = 0;
        }
        this.height = height;
    }
    public void setWidth(double Width){
        if (width<0 ){
            width = 0;
        } 
        this.width = width;
    }
    public double getArea(){
        return width*height;
    }
}
