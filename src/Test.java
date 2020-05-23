public class Test<emailExample> {
    private static EmailExample emailExample;
    public static final String[] validEmail=new String[]{ "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        emailExample=new EmailExample();
        for (int i=0;i<validEmail.length;i++ ){
            boolean isValid=emailExample.validate(validEmail[i]);
            System.out.println("email "+validEmail[i]+" "+ isValid);
        }
    }

}
