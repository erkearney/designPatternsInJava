final class Captain {
    private static Captain captain;
    //Make the constructor private to prevent the use of "new"
    private Captain() {

    }
    
    public static synchronized Captain getCaptain() {
        //Delay the initialization of the object until it's explicitly needed,
        //this is especially useful for obejcts that are 'expensive' to create
        if(captain == null) {
            captain = new Captain();
            System.out.println("A new captain has been elected.");
        } else {
            System.out.println("There is already a captain.");
        }
        return captain;
    }
}
