public class multiLevelInheritance {
    public static void main(String[] args) {
        
        MobAppDev m = new MobAppDev();
        m.positionAtWappnet();
        
        System.out.println(m.numOfTrainee);

//System.out.println(m.stipend); can't be acessible due to private modifier used.
        m.RoleAt();

        m.Technology();

        

    }
    
}
