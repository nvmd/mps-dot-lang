package trianglio.rnd.lang.dot.dfa.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.CompiledConceptDescriptor;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"trianglio.rnd.lang.dot.dfa.structure.DFA", "trianglio.rnd.lang.dot.dfa.structure.State", "trianglio.rnd.lang.dot.dfa.structure.StateReference", "trianglio.rnd.lang.dot.dfa.structure.Symbol", "trianglio.rnd.lang.dot.dfa.structure.Transition"};

  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new CompiledConceptDescriptor("trianglio.rnd.lang.dot.dfa.structure.DFA", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"startState"});
      case 1:
        return new CompiledConceptDescriptor("trianglio.rnd.lang.dot.dfa.structure.State", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 2:
        return new CompiledConceptDescriptor("trianglio.rnd.lang.dot.dfa.structure.StateReference", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"state"});
      case 3:
        return new CompiledConceptDescriptor("trianglio.rnd.lang.dot.dfa.structure.Symbol", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 4:
        return new CompiledConceptDescriptor("trianglio.rnd.lang.dot.dfa.structure.Transition", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"source", "target"});
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }
}
