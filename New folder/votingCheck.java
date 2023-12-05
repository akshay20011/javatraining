class VotingCheck{
   public static void main(String[] args) {
    int age =40;
    String nationality="Indian";
    boolean checkage=ageChecker(age);
    boolean votingCheck=checkNationalty(nationalty);
        
        if (checkage && votingCheck){
            System.err.println("you are  eligible for voting");
        }else{
            System.out.println("you are eligible for voting");
       
    }
   } 
     public static boolean ageChecker(int age){
        return age>18;
     }
     public static boolean checknationality(String inputNationality){
        return inputNationality=="Indian";

     }
}