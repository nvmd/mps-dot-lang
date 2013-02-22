package trianglio.rnd.lang.dot.dfa.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;

public class QueriesGenerated {
  public static Object propertyMacro_GetPropertyValue_8637771344785865850(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_8637771344785866344(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_8637771344785817160(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + "DFAGraph";
  }

  public static boolean ifMacro_Condition_8637771344785866229(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SModelOperations.getRoots(_context.getOriginalInputModel(), "trianglio.rnd.lang.dot.dfa.structure.DFA")).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return SLinkOperations.getTargets(it, "finalStates", true);
      }
    }).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.hasValue(SLinkOperations.getTarget(it, "state", false), "name", SPropertyOperations.getString(_context.getNode(), "name"));
      }
    });
  }

  public static boolean ifMacro_Condition_8637771344785865847(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SModelOperations.getRoots(_context.getOriginalInputModel(), "trianglio.rnd.lang.dot.dfa.structure.DFA")).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (SLinkOperations.getTarget(it, "startState", false) != null);
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, "startState", false);
      }
    }).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.hasValue(it, "name", SPropertyOperations.getString(_context.getNode(), "name"));
      }
    });
  }

  public static boolean ifMacro_Condition_8637771344785866283(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SModelOperations.getRoots(_context.getOriginalInputModel(), "trianglio.rnd.lang.dot.dfa.structure.DFA")).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return SLinkOperations.getTargets(it, "finalStates", true);
      }
    }).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.hasValue(SLinkOperations.getTarget(it, "state", false), "name", SPropertyOperations.getString(_context.getNode(), "name"));
      }
    });
  }

  public static boolean ifMacro_Condition_8637771344785866318(final IOperationContext operationContext, final IfMacroContext _context) {
    return !(ListSequence.fromList(SModelOperations.getRoots(_context.getOriginalInputModel(), "trianglio.rnd.lang.dot.dfa.structure.DFA")).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (SLinkOperations.getTarget(it, "startState", false) != null);
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, "startState", false);
      }
    }).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.hasValue(it, "name", SPropertyOperations.getString(_context.getNode(), "name"));
      }
    }));
  }

  public static Iterable sourceNodesQuery_8637771344785865781(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "states", true);
  }

  public static Iterable sourceNodesQuery_8637771344785866311(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "states", true);
  }
}
