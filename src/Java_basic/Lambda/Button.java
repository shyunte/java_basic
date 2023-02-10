package Java_basic.Lambda;

public class Button {

    public static interface  ClickListener{
        void Onclick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    public void click(){
        this.clickListener.Onclick();
    }
}
