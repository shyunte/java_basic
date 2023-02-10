package Java_basic.Lambda;

public class ButtonExample {
    public static void main(String[] args) {
        //ok버튼 객체생성

        Button btnOk = new Button();

        //Ok버튼 객체에 람다식 주입
        btnOk.setClickListener(() ->{
            System.out.println(" OK 버튼을 클릭햇습니다");
        });


        btnOk.click();

        //cancel 버튼  생성
        Button btnCancel = new Button();

        btnCancel.setClickListener(()-> {
            System.out.println("Cancel 버튼을 클릭했습니다.");


            //Cancel 버튼 클릭하기
            btnCancel.click();
        });
    }
}
