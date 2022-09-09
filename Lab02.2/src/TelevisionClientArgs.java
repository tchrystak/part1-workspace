/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/**
 * Intended usage (by human):
 *  $ java TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
            String note = "Note: supported displays are LED, OLED, LCD, CRT, PLASMA";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;  // early return from main(), application exits
        }

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");
        // TODO: 9/9/2022 create an instance of Television using args[0] as the brand, the parsed
        //  int value of args[1] as the volume, and the DisplayType value of args[2] as the display.
        //  After creating the instance, print it out.

        Television tv1 = new Television();
        tv1.setBrand(args[0]);
        tv1.setVolume(Integer.parseInt(args[1]));
        tv1.setDisplay(DisplayType.valueOf(args[2]));
        System.out.println(tv1);

    }
}

// TODO: 9/9/2022 Nick's Version
//  String brand = args[0]
//  int volume = Integer.parseInt(args[1]);
//  DisplayType display = DisplayType.valueOf(args[2]);
//  Television tv = new Television(brand, volume, DisplayType)
//  System.out.println(tv);