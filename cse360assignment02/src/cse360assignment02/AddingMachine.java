/**
 * 
 */
package cse360assignment02;

/**
 * This program performs novel math operations and prints.
 * @author jessicahuber
 * @date 10/05/2020
 */
public class AddingMachine {
	private int total;
	private String history;
	  
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    history = "";
	  }
	  
	  /**
	   * Returns the current value of the machine.
	   * @return 	current value of type int
	   */
	  public int getTotal () {
	    return this.total;
	  }
	  
	  /**
	   * Adds the parameter to the total.
	   * @param value	the value to be added to the total
	   */
	  public void add (int value) {
		  if (total == 0 && history.length() == 0) {
			  history = "0 + " + value;
		  } else {
			  history = history + " + " + value;
		  }
		  total += value;
	  }
	  
	  /**
	   * Subtracts the parameter from the total.
	   * @param value	the value to be subtracted from the total
	   */
	  public void subtract (int value) {
		  if (total == 0 && history.length() == 0) {
			  history = "0 - " + value;
		  } else {
			  history = history + " - " + value;
		  }
		  total = total - value;
	  }
	  
	  /**
	   * Returns the history of the transactions of the machine as a formatted string.
	   * @return	the history of the transactions as a string
	   */
	  public String toString () {
	    return this.history;
	  }
	  
	  /**
	   * Clears the "memory"
	   */
	  public void clear() {
		  this.history = "";
		  this.total = 0;
	  }
}
