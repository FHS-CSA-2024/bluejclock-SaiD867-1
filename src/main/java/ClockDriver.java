package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        System.out.println("Testing the display");
       ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("\tEmpty Con. Test - " +test1Output);
        
        ClockDisplay test2 = new ClockDisplay(2,45);
        String test2Output = test2.getTime();
        System.out.println("Arg Con. Test - " + test2Output);
        
        
        ClockDisplay tick_Test1 = new ClockDisplay(3,32);
        String tick_Test1_Output = tick_Test1.getTime();
        System.out.println("TickTest1 Before increment - " +tick_Test1_Output);
        tick_Test1.timeTick();
        tick_Test1_Output = tick_Test1.getTime();
        System.out.println("TickTest1 After Increment - " +tick_Test1_Output);
        
        ClockDisplay tick_Test2 = new ClockDisplay(3,32);
        System.out.println("TickTest1 Before increment - " +tick_Test2.getTime());
        tick_Test2.timeTick();
        System.out.println("TickTest1 After Increment - " +tick_Test2.getTime());
        
             ClockDisplay tick_Test3 = new ClockDisplay(3,9);
        System.out.println("TickTest1 Before increment - " +tick_Test3.getTime());
        tick_Test3.timeTick();
        System.out.println("TickTest1 After Increment - " +tick_Test3.getTime());
        
             ClockDisplay tick_Test4 = new ClockDisplay(1,59);
        System.out.println("TickTest1 Before increment - " +tick_Test4.getTime());
        tick_Test4.timeTick();
        System.out.println("TickTest1 After Increment - " +tick_Test4.getTime());
             ClockDisplay tick_Test5 = new ClockDisplay(9,59);
        System.out.println("TickTest1 Before increment - " +tick_Test5.getTime());
        tick_Test5.timeTick();
        System.out.println("TickTest1 After Increment - " +tick_Test5.getTime());
             ClockDisplay tick_Test6 = new ClockDisplay(23,59);
        System.out.println("TickTest1 Before increment - " +tick_Test6.getTime());
        tick_Test6.timeTick();
        System.out.println("TickTest1 After Increment - " +tick_Test6.getTime());
                //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        
                System.out.println("Testing the display");
       ClockDisplaySeconds  test3 = new ClockDisplaySeconds ();
        String test3Output = test3.getTime();
        System.out.println("\tEmpty Con. Test - " +test1Output);
        
        ClockDisplaySeconds  test4 = new ClockDisplaySeconds (3,45,15);
        String test4Output = test4.getTime();
        System.out.println("Arg Con. Test - " + test2Output);
        
        
        ClockDisplaySeconds  sec_tick_Test1 = new ClockDisplaySeconds (3,32,59);
        String sec_tick_Test1_Output = sec_tick_Test1.getTime();
        System.out.println("TickTest1 Before increment - " +sec_tick_Test1_Output);
        sec_tick_Test1.timeTick();
        sec_tick_Test1_Output = sec_tick_Test1.getTime();
        System.out.println("TickTest1 After Increment - " +sec_tick_Test1_Output);
        
        ClockDisplaySeconds  sec_tick_Test2 = new ClockDisplaySeconds (1,00,59);
        System.out.println("TickTest1 Before increment - " +sec_tick_Test2.getTime());
        sec_tick_Test2.timeTick();
        System.out.println("TickTest1 After Increment - " +sec_tick_Test2.getTime());
        
             ClockDisplaySeconds  sec_tick_Test3 = new ClockDisplaySeconds (1,59,59);
        System.out.println("TickTest1 Before increment - " +sec_tick_Test3.getTime());
        sec_tick_Test3.timeTick();
        System.out.println("TickTest1 After Increment - " +sec_tick_Test3.getTime());
        
             ClockDisplaySeconds  sec_tick_Test4 = new ClockDisplaySeconds (23,59,59);
        System.out.println("TickTest1 Before increment - " +sec_tick_Test4.getTime());
        sec_tick_Test4.timeTick();
        System.out.println("TickTest1 After Increment - " +sec_tick_Test4.getTime());

        
        
        
        
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplaySeconds 12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
    }
}
