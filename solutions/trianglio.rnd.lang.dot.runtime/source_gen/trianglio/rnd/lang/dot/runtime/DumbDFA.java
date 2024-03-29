package trianglio.rnd.lang.dot.runtime;

/*Generated by MPS */

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public abstract class DumbDFA {
  private List<Integer> acceptanceStates = new ArrayList();
  private Map<String, Integer> idToNum = new HashMap();
  private Map<Node, List<Edge>> outEdges = new HashMap();

  public DumbDFA() {
    initNodes();
  }

  public boolean run(String s) {
    int currentState = 0;
    for (int i = 0; i < s.length(); ++i) {
      char symb = s.charAt(i);
      try {
        currentState = makeTransition(currentState, symb);
      } catch (DFANoTransitionException e) {
        return false;
      }
    }
    return acceptanceStates.contains(currentState);
  }

  public int getState(String id) {
    return idToNum.get(id);
  }

  public void addState(String id) {
    idToNum.put(id, idToNum.size());
  }

  public void addAcceptanceState(String id) {
    acceptanceStates.add(getState(id));
  }

  public abstract void initNodes();

  public abstract int makeTransition(int currentState, char currentSymb) throws DFANoTransitionException;
}
