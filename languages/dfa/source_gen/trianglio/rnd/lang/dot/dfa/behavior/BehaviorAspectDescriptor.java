package trianglio.rnd.lang.dot.dfa.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"trianglio.rnd.lang.dot.dfa.structure.DFA", "trianglio.rnd.lang.dot.dfa.structure.State", "trianglio.rnd.lang.dot.dfa.structure.StateReference", "trianglio.rnd.lang.dot.dfa.structure.Symbol", "trianglio.rnd.lang.dot.dfa.structure.Transition"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 0:
        return new DFA_BehaviorDescriptor();
      case 1:
        return new State_BehaviorDescriptor();
      case 4:
        return new Transition_BehaviorDescriptor();
      case 2:
        return new StateReference_BehaviorDescriptor();
      case 3:
        return new Symbol_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }
}