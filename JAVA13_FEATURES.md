**JAVA 13 FEATURES** :

What is new in 
<a href="https://openjdk.java.net/projects/jdk/13/">Java 13</a> reached General Availability on 17 September 2019, <a href="https://jdk.java.net/java-se-ri/13">download Java 13 here</a> or this <a href="https://jdk.java.net/archive/">openJDK archived</a>.

<li><a href="https://openjdk.java.net/jeps/350">JEP 350: Dynamic CDS Archives</a></li>
<li><a href="https://openjdk.java.net/jeps/351">JEP 351: ZGC: Uncommit Unused Memory</a></li>
<li><a href="https://openjdk.java.net/jeps/353">JEP 353: Reimplement the Legacy Socket API</a></li>
<li><a href="https://openjdk.java.net/jeps/354">JEP 354: Switch Expressions (Preview)</a> (developer can use this feature)</li>
<li><a href="https://openjdk.java.net/jeps/355">JEP 355: Text Blocks (Preview)</a> (developer can use this feature)</li>

I'm covering developer used features, if you need detail information about other features you can visit openJDK website

<li><a href="https://openjdk.java.net/jeps/354">JEP 354: Switch Expressions (Preview)</a> (developer can use this feature)</li>

This is preview language feature in Java 13.

The traditional switch statement we can return a value like this:
   
    private static String getNumber(int number) {
          String result = "";
          switch (number) {
              case 1:
              case 2:
                  result = "one or two";
                  break;
              case 3:
                  result = "three";
                  break;
              case 4:
              case 5:
              case 6:
                  result = "four or five or six";
                  break;
              default:
                  result = "unknown";
          }
          ;
          return result;
    }	  
  
In Java 12, we can use break to return a value from a switch.
        

    private static String getNumberViaBreak(int number) {
                 String result = switch (number) {
                        case 1, 2:
                            break "one or two";
                        case 3:
                            break "three";
                        case 4, 5, 6:
                            break "four or five or six";
                        default:
                            break "unknown";
                    };
                    return result;
                }
 
In Java 13, the above Java 12 value break is dropped in favor of yield keyword to return a value.


        private static String getNumberViaYield(int number) {
            return switch (number) {
                case 1, 2:
                    yield "one or two";
                case 3:
                    yield "three";
                case 4, 5, 6:
                    yield "four or five or six";
                default:
                    yield "unknown";
            };
        }

or like this



    private static String getNumberViaYield2(int number) {
        return switch (number) {
            case 1, 2:
                yield "one or two";
            case 3:
                yield "three";
            case 4, 5, 6:
                int i = 0;
                i++;
                yield "four or five or six : " + i;
            default:
                yield "unknown";
        };
    }

The rule labels or arrow or case L is still supported in Java 13.



    private static String getNumberViaCaseL(int number) {
        return switch (number) {
            case 1, 2 -> "one or two";
            case 3 -> "three";
            case 4, 5, 6 -> "four or five or six";
            default -> "unknown";
        };
    }
    
Or like this, mixed the use of arrow syntax and yield.



    private static String getNumberViaCaseL2(int number) {
        return switch (number) {
            case 1, 2 -> "one or two";
            case 3 -> "three";
            case 4, 5, 6 -> {
                int i = 0;
                i++;
                yield "four or five or six :" + 1;
            }
            default -> "unknown";
        };
    }
 
 In Java 13, the JEP 354: Switch Expressions extends the previous Java 12 Switch Expressions by adding a new yield keyword to return a value from the switch expression.

 P.S Switch expressions are a preview feature and are disabled by default.
 
** 3.2 We need to enable the preview feature manually:**

```java
javac --enable-preview --release 13 Example.java
java --enable-preview Example
```

<li><a href="https://openjdk.java.net/jeps/355">JEP 355: Text Blocks (Preview)</a> (developer can use this feature)</li>

....

