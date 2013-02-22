package trianglio.rnd.lang.dot.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.CompiledConceptDescriptor;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"trianglio.rnd.lang.dot.structure.Attribute", "trianglio.rnd.lang.dot.structure.AttributeList", "trianglio.rnd.lang.dot.structure.Dot", "trianglio.rnd.lang.dot.structure.Edge", "trianglio.rnd.lang.dot.structure.EdgeAttribute", "trianglio.rnd.lang.dot.structure.Graph", "trianglio.rnd.lang.dot.structure.GraphAttribute", "trianglio.rnd.lang.dot.structure.Node", "trianglio.rnd.lang.dot.structure.NodeAttribute"};

  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new CompiledConceptDescriptor("trianglio.rnd.lang.dot.structure.Attribute", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"value"}, new String[]{});
      case 1:
        return new CompiledConceptDescriptor("trianglio.rnd.lang.dot.structure.AttributeList", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      case 2:
        return new CompiledConceptDescriptor("trianglio.rnd.lang.dot.structure.Dot", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.execution.util.structure.IMainClass"}, new String[]{}, new String[]{});
      case 3:
        return new CompiledConceptDescriptor("trianglio.rnd.lang.dot.structure.Edge", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"source", "target"});
      case 4:
        return new CompiledConceptDescriptor("trianglio.rnd.lang.dot.structure.EdgeAttribute", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      case 5:
        return new CompiledConceptDescriptor("trianglio.rnd.lang.dot.structure.Graph", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 6:
        return new CompiledConceptDescriptor("trianglio.rnd.lang.dot.structure.GraphAttribute", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      case 7:
        return new CompiledConceptDescriptor("trianglio.rnd.lang.dot.structure.Node", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 8:
        return new CompiledConceptDescriptor("trianglio.rnd.lang.dot.structure.NodeAttribute", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }
}
