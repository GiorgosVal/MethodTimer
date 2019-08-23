/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodtimer;

/**
 * This functional interface can be used to measure the execution time of any
 * block of code that will be imported inside the implementation of it's
 * measurable() method.
 *
 * @author giorgos
 */
@FunctionalInterface
public interface MethodTimer {

    /**
     * The implementation of this method should contain the piece of code that
     * is about to be time measured.
     */
    abstract void measurable();

    /**
     * This method executes the implemented measurable() method an returns the
     * execution time in seconds.
     *
     * @return The seconds in long.
     */
    default long stopwatchSeconds() {
        long t0 = System.currentTimeMillis();
        measurable();
        long t1 = System.currentTimeMillis();
        return (t1 - t0) / 1000;
    }

    /**
     * This method executes the implemented measurable() method an returns the
     * execution time in milliseconds.
     *
     * @return The milliseconds in long.
     */
    default long stopwatchMillis() {
        long t0 = System.currentTimeMillis();
        measurable();
        long t1 = System.currentTimeMillis();
        return t1 - t0;
    }

    /**
     * This method executes the implemented measurable() method an returns the
     * execution time in nanoseconds.
     *
     * @return The nanoseconds in long.
     */
    default long stopwatchNano() {
        long t0 = System.nanoTime();
        measurable();
        long t1 = System.nanoTime();
        return t1 - t0;
    }

    /**
     * This method executes the stopwatchSeconds() method and prints a message
     * with the execution time in seconds.
     */
    default void printSeconds() {
        System.out.println("Time to excecute: " + stopwatchSeconds() + "sec");
    }

    /**
     * This method executes the stopwatchMillis() method and prints a message
     * with the execution time in milliseconds.
     */
    default void printMillis() {
        System.out.println("Time to excecute: " + stopwatchMillis() + "ms");
    }

    /**
     * This method executes the stopwatchMillis() method and prints a message
     * with the execution time in nanoseconds.
     */
    default void printNano() {
        System.out.println("Time to excecute: " + stopwatchNano() + "ns");
    }
}
