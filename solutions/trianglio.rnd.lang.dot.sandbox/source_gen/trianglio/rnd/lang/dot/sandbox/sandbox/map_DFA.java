package trianglio.rnd.lang.dot.sandbox.sandbox;

/*Generated by MPS */

import trianglio.rnd.lang.dot.runtime.DumbDFA;
import trianglio.rnd.lang.dot.runtime.DFANoTransitionException;

public class map_DFA extends DumbDFA {
  public map_DFA() {
  }

  public int makeTransition(int currentState, char currentSymb) throws DFANoTransitionException {
    if (getState("s0") == currentState && "0".charAt(0) == currentSymb) {
      return getState("s1");
    }
    if (getState("s0") == currentState && "1".charAt(0) == currentSymb) {
      return getState("s0");
    }
    if (getState("s1") == currentState && "0".charAt(0) == currentSymb) {
      return getState("s0");
    }
    if (getState("s1") == currentState && "1".charAt(0) == currentSymb) {
      return getState("s1");
    }
    throw new DFANoTransitionException();
  }

  public void initNodes() {
    addState("s0");
    if (true) {
      addAcceptanceState("s0");
    }
    addState("s1");
    if (false) {
      addAcceptanceState("s1");
    }
  }

  public static void main(String[] args) {
    map_DFA dot = new map_DFA();
    System.out.println(dot.run(args[0]));
  }
}
