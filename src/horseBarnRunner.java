public class horseBarnRunner {
    public static void main (String[] args) {
        Horse horse1 = new theHorse("century",4000);
        Horse horse2 = new theHorse("flame",6000);
        Horse horse3 = new theHorse("aura",5000);
        Horse[] horses = new Horse[6];

        horses[1] = horse1;
        horses[3] = horse2;
        horses[5] = horse3;
        HorseBarn barn = new HorseBarn(horses);

        System.out.println(barn);
        System.out.println(" Flame is at space" + barn.findHorseSpace("flame"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println(" Flame is now at space" + barn.findHorseSpace("flame"));
    }
}
