interface Height{
    public void setHeight();
}
interface Width{
    public void setWidth();
}
class Rectangle implements Height,Width{
    private double height;
    private double width;


    @Override
    public void setHeight() {

    }


    @Override
    public void setWidth() {

    }
}
class Square implements Height,Width{

    @Override
    public void setWidth() {

    }

    @Override
    public void setHeight() {

    }
}
