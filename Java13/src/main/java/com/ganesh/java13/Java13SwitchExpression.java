package com.ganesh.java13;

public class Java13SwitchExpression {

	public static void main(String[] args) {

		System.out.println(getValueBefore12("a"));
		System.out.println(getValueBefore12("c"));
		System.out.println(getValueBefore12("e"));
		System.out.println(getValueBefore12("default"));

		System.out.println(getValueMultipleLabels("a"));
		System.out.println(getValueMultipleLabels("c"));
		System.out.println(getValueMultipleLabels("e"));
		System.out.println(getValueMultipleLabels("default"));

		System.out.println(getValueViaArrow("a"));
		System.out.println(getValueViaArrow("b"));
		System.out.println(getValueViaArrow("c"));
		System.out.println(getValueViaArrow("default"));

		System.out.println(getValueViaYield("a"));
		System.out.println(getValueViaYield("c"));
		System.out.println(getValueViaYield("e"));
		System.out.println(getValueViaYield("default"));

	}

	// Traditional switch
	private static int getValueBefore12(String mode) {
		int result;
		switch (mode) {
		case "a":
		case "b":
			result = 1;
			break;
		case "c":
			result = 2;
			break;
		case "d":
		case "e":
		case "f":
			result = 3;
			break;
		default:
			result = -1;
		}
		;
		return result;
	}

	// Java 12, multiple comma-separated labels
	private static int getValueMultipleLabels(String mode) {
		int result;
		switch (mode) {
		case "a", "b":
			result = 1;
			break;
		case "c":
			result = 2;
			break;
		case "d", "e", "f":
			result = 3;
			break;
		default:
			result = -1;
		}
		;
		return result;
	}

	// Java 12, switch expression returns a value via label rules (arrow)
	private static int getValueViaArrow(String mode) {
        int result = switch (mode) {
            case "a", "b" -> 1;
            case "c" -> 2;
            case "d", "e", "f" -> {
                // do something here...
                System.out.println("Supports multi line block!");
                yield 3;
            }
            default -> -1;
        };
        return result;
    }

	// Java 13, switch expression returns a value via yield
	private static int getValueViaYield(String mode) {
        int result = switch (mode) {
            case "a", "b":
                yield 1;
            case "c":
                yield 2;
            case "d", "e", "f":
                // do something here...
                System.out.println("Supports multi line block!");
                yield 3;
            default:
                yield -1;
        };
        return result;
    }

}