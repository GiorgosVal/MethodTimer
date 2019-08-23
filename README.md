# MethodTimer Interface
This functional interface can be used to measure the execution time of any block of code that will be imported inside the implementation of it's measurable() method.

## Methods
### To implement
##### abstract void measurable()
The implementation of this method should contain the piece of code that is about to be time measured.

### To get the value
The methods below return the execution time in seconds, milliseconds, nanoseconds.
##### default long stopwatchSeconds()
##### default long stopwatchMillis()
##### default long stopwatchNano()

### Printing methods
The methods below use the ```System.out``` to print the execution time in seconds, milliseconds, nanoseconds.
##### default void printSeconds()
##### default void printMillis()
##### default void printNano()

## Examples

```
MethodTimer timer = new MethodTimer() {
  @Override
  public void measurable() {
      // code to be measured
  }
};
      
timer.printMillis();
```

The same with lambda expressions:
```
MethodTimer timer = () -> {
  // code to be measured
};
      
timer.printMillis();
```
