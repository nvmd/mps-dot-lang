<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:eb7e4582-3925-4880-8d06-1bf4ce3c47c8(trianglio.rnd.lang.dot.sandbox.sandbox)">
  <persistence version="7" />
  <language namespace="20a363b0-2d4e-4f48-8e60-37bc0b79373c(trianglio.rnd.lang.dot)" />
  <language namespace="26f629dc-8cf8-42fd-a54e-2851bdb38b33(trianglio.rnd.lang.dot.dfa)" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="u625" modelUID="r:1b9fbac8-82d6-4076-b483-e56d245226fe(trianglio.rnd.lang.dot.structure)" version="-1" implicit="yes" />
  <import index="v4hd" modelUID="r:b11642e0-f453-4e35-aabc-cc44eaee5ae0(trianglio.rnd.lang.dot.dfa.structure)" version="-1" implicit="yes" />
  <roots>
    <node type="u625.Dot" typeId="u625.3395969331296619491" id="4697298013209769534">
      <property name="name" nameId="tpck.1169194664001" value="test" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="graph" />
    </node>
    <node type="u625.Dot" typeId="u625.3395969331296619491" id="761994931155401644">
      <property name="name" nameId="tpck.1169194664001" value="evenNumberOfZeros" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="dfa" />
    </node>
    <node type="v4hd.DFA" typeId="v4hd.8637771344785778674" id="8637771344785801910">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="dfa" />
      <property name="name" nameId="tpck.1169194664001" value="evenNumberOfZerosDFA" />
      <link role="startState" roleId="v4hd.8637771344785778705" targetNodeId="8637771344785801917" resolveInfo="s0" />
    </node>
  </roots>
  <root id="4697298013209769534">
    <node role="graph" roleId="u625.3395969331296619507" type="u625.Graph" typeId="u625.3395969331296619487" id="4697298013209769535">
      <property name="name" nameId="tpck.1169194664001" value="G" />
      <node role="nodes" roleId="u625.3395969331296619502" type="u625.Node" typeId="u625.3395969331296619493" id="4697298013209770315">
        <property name="name" nameId="tpck.1169194664001" value="0" />
        <node role="attributes" roleId="u625.3395969331296628643" type="u625.AttributeList" typeId="u625.3395969331296619513" id="4697298013209772989">
          <node role="attributes" roleId="u625.3395969331296619515" type="u625.Attribute" typeId="u625.3395969331296619498" id="4697298013209772990">
            <property name="name" nameId="tpck.1169194664001" value="name" />
            <property name="value" nameId="u625.3395969331296619511" value="s0" />
          </node>
        </node>
      </node>
      <node role="nodes" roleId="u625.3395969331296619502" type="u625.Node" typeId="u625.3395969331296619493" id="4697298013209772992">
        <property name="name" nameId="tpck.1169194664001" value="1" />
        <node role="attributes" roleId="u625.3395969331296628643" type="u625.AttributeList" typeId="u625.3395969331296619513" id="4697298013209772994">
          <node role="attributes" roleId="u625.3395969331296619515" type="u625.Attribute" typeId="u625.3395969331296619498" id="4697298013209772995">
            <property name="name" nameId="tpck.1169194664001" value="name" />
            <property name="value" nameId="u625.3395969331296619511" value="s1" />
          </node>
          <node role="attributes" roleId="u625.3395969331296619515" type="u625.Attribute" typeId="u625.3395969331296619498" id="761994931155147016">
            <property name="name" nameId="tpck.1169194664001" value="label" />
            <property name="value" nameId="u625.3395969331296619511" value="test" />
          </node>
        </node>
      </node>
      <node role="nodes" roleId="u625.3395969331296619502" type="u625.Node" typeId="u625.3395969331296619493" id="761994931155152476">
        <property name="name" nameId="tpck.1169194664001" value="2" />
        <node role="attributes" roleId="u625.3395969331296628643" type="u625.AttributeList" typeId="u625.3395969331296619513" id="761994931155152478">
          <node role="attributes" roleId="u625.3395969331296619515" type="u625.Attribute" typeId="u625.3395969331296619498" id="761994931155152479">
            <property name="name" nameId="tpck.1169194664001" value="name" />
            <property name="value" nameId="u625.3395969331296619511" value="s3" />
          </node>
          <node role="attributes" roleId="u625.3395969331296619515" type="u625.Attribute" typeId="u625.3395969331296619498" id="761994931155152480">
            <property name="name" nameId="tpck.1169194664001" value="label" />
            <property name="value" nameId="u625.3395969331296619511" value="test2" />
          </node>
        </node>
      </node>
      <node role="edges" roleId="u625.3395969331296619503" type="u625.Edge" typeId="u625.3395969331296619495" id="4697298013209770314">
        <link role="source" roleId="u625.3395969331296619505" targetNodeId="4697298013209770315" resolveInfo="0" />
        <link role="target" roleId="u625.3395969331296619506" targetNodeId="4697298013209772992" resolveInfo="1" />
        <node role="attributes" roleId="u625.3395969331296619516" type="u625.AttributeList" typeId="u625.3395969331296619513" id="4697298013209770317">
          <node role="attributes" roleId="u625.3395969331296619515" type="u625.Attribute" typeId="u625.3395969331296619498" id="4697298013209770318">
            <property name="name" nameId="tpck.1169194664001" value="weight" />
            <property name="value" nameId="u625.3395969331296619511" value="1" />
          </node>
          <node role="attributes" roleId="u625.3395969331296619515" type="u625.Attribute" typeId="u625.3395969331296619498" id="4697298013209770320">
            <property name="name" nameId="tpck.1169194664001" value="label" />
            <property name="value" nameId="u625.3395969331296619511" value="hahaha" />
          </node>
        </node>
      </node>
      <node role="edges" roleId="u625.3395969331296619503" type="u625.Edge" typeId="u625.3395969331296619495" id="761994931155152471">
        <link role="source" roleId="u625.3395969331296619505" targetNodeId="4697298013209772992" resolveInfo="1" />
        <link role="target" roleId="u625.3395969331296619506" targetNodeId="761994931155152476" resolveInfo="2" />
        <node role="attributes" roleId="u625.3395969331296619516" type="u625.AttributeList" typeId="u625.3395969331296619513" id="761994931155152473">
          <node role="attributes" roleId="u625.3395969331296619515" type="u625.Attribute" typeId="u625.3395969331296619498" id="761994931155152474">
            <property name="name" nameId="tpck.1169194664001" value="weight" />
            <property name="value" nameId="u625.3395969331296619511" value="2" />
          </node>
          <node role="attributes" roleId="u625.3395969331296619515" type="u625.Attribute" typeId="u625.3395969331296619498" id="761994931155152475">
            <property name="name" nameId="tpck.1169194664001" value="label" />
            <property name="value" nameId="u625.3395969331296619511" value="atata" />
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="761994931155401644">
    <node role="graph" roleId="u625.3395969331296619507" type="u625.Graph" typeId="u625.3395969331296619487" id="761994931155401647">
      <property name="name" nameId="tpck.1169194664001" value="EvenNumberOfZeros" />
      <node role="edges" roleId="u625.3395969331296619503" type="u625.Edge" typeId="u625.3395969331296619495" id="761994931155401678">
        <link role="source" roleId="u625.3395969331296619505" targetNodeId="761994931155401648" resolveInfo="s0" />
        <link role="target" roleId="u625.3395969331296619506" targetNodeId="761994931155401676" resolveInfo="s1" />
        <node role="attributes" roleId="u625.3395969331296619516" type="u625.AttributeList" typeId="u625.3395969331296619513" id="761994931155401683">
          <node role="attributes" roleId="u625.3395969331296619515" type="u625.Attribute" typeId="u625.3395969331296619498" id="761994931155401684">
            <property name="name" nameId="tpck.1169194664001" value="label" />
            <property name="value" nameId="u625.3395969331296619511" value="0" />
          </node>
        </node>
      </node>
      <node role="edges" roleId="u625.3395969331296619503" type="u625.Edge" typeId="u625.3395969331296619495" id="761994931155401685">
        <link role="source" roleId="u625.3395969331296619505" targetNodeId="761994931155401676" resolveInfo="s1" />
        <link role="target" roleId="u625.3395969331296619506" targetNodeId="761994931155401648" resolveInfo="s0" />
        <node role="attributes" roleId="u625.3395969331296619516" type="u625.AttributeList" typeId="u625.3395969331296619513" id="761994931155401691">
          <node role="attributes" roleId="u625.3395969331296619515" type="u625.Attribute" typeId="u625.3395969331296619498" id="761994931155401692">
            <property name="name" nameId="tpck.1169194664001" value="label" />
            <property name="value" nameId="u625.3395969331296619511" value="0" />
          </node>
        </node>
      </node>
      <node role="edges" roleId="u625.3395969331296619503" type="u625.Edge" typeId="u625.3395969331296619495" id="761994931155401708">
        <link role="source" roleId="u625.3395969331296619505" targetNodeId="761994931155401648" resolveInfo="s0" />
        <link role="target" roleId="u625.3395969331296619506" targetNodeId="761994931155401648" resolveInfo="s0" />
        <node role="attributes" roleId="u625.3395969331296619516" type="u625.AttributeList" typeId="u625.3395969331296619513" id="761994931155401711">
          <node role="attributes" roleId="u625.3395969331296619515" type="u625.Attribute" typeId="u625.3395969331296619498" id="761994931155401712">
            <property name="name" nameId="tpck.1169194664001" value="label" />
            <property name="value" nameId="u625.3395969331296619511" value="1" />
          </node>
        </node>
      </node>
      <node role="edges" roleId="u625.3395969331296619503" type="u625.Edge" typeId="u625.3395969331296619495" id="761994931155401710">
        <link role="target" roleId="u625.3395969331296619506" targetNodeId="761994931155401676" resolveInfo="s1" />
        <link role="source" roleId="u625.3395969331296619505" targetNodeId="761994931155401676" resolveInfo="s1" />
        <node role="attributes" roleId="u625.3395969331296619516" type="u625.AttributeList" typeId="u625.3395969331296619513" id="761994931155401714">
          <node role="attributes" roleId="u625.3395969331296619515" type="u625.Attribute" typeId="u625.3395969331296619498" id="761994931155401715">
            <property name="name" nameId="tpck.1169194664001" value="label" />
            <property name="value" nameId="u625.3395969331296619511" value="1" />
          </node>
        </node>
      </node>
      <node role="nodes" roleId="u625.3395969331296619502" type="u625.Node" typeId="u625.3395969331296619493" id="761994931155401648">
        <property name="name" nameId="tpck.1169194664001" value="s0" />
        <node role="attributes" roleId="u625.3395969331296628643" type="u625.AttributeList" typeId="u625.3395969331296619513" id="761994931155401654">
          <node role="attributes" roleId="u625.3395969331296619515" type="u625.Attribute" typeId="u625.3395969331296619498" id="761994931155401655">
            <property name="name" nameId="tpck.1169194664001" value="acceptance" />
            <property name="value" nameId="u625.3395969331296619511" value="1" />
          </node>
        </node>
      </node>
      <node role="nodes" roleId="u625.3395969331296619502" type="u625.Node" typeId="u625.3395969331296619493" id="761994931155401676">
        <property name="name" nameId="tpck.1169194664001" value="s1" />
        <node role="attributes" roleId="u625.3395969331296628643" type="u625.AttributeList" typeId="u625.3395969331296619513" id="761994931155401677">
          <node role="attributes" roleId="u625.3395969331296619515" type="u625.Attribute" typeId="u625.3395969331296619498" id="761994931155401686">
            <property name="name" nameId="tpck.1169194664001" value="acceptance" />
            <property name="value" nameId="u625.3395969331296619511" value="0" />
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="8637771344785801910">
    <node role="finalStates" roleId="v4hd.8637771344785778707" type="v4hd.StateReference" typeId="v4hd.8637771344785778703" id="8637771344785801928">
      <link role="state" roleId="v4hd.8637771344785778710" targetNodeId="8637771344785801917" resolveInfo="s0" />
    </node>
    <node role="transitions" roleId="v4hd.8637771344785778687" type="v4hd.Transition" typeId="v4hd.8637771344785778678" id="8637771344785801919">
      <link role="source" roleId="v4hd.8637771344785778683" targetNodeId="8637771344785801917" resolveInfo="s0" />
      <link role="target" roleId="v4hd.8637771344785778684" targetNodeId="8637771344785801918" resolveInfo="s1" />
      <node role="symbols" roleId="v4hd.8637771344785779371" type="v4hd.Symbol" typeId="v4hd.8637771344785779368" id="8637771344785801920">
        <property name="name" nameId="tpck.1169194664001" value="0" />
      </node>
    </node>
    <node role="transitions" roleId="v4hd.8637771344785778687" type="v4hd.Transition" typeId="v4hd.8637771344785778678" id="8637771344785801921">
      <link role="source" roleId="v4hd.8637771344785778683" targetNodeId="8637771344785801917" resolveInfo="s0" />
      <link role="target" roleId="v4hd.8637771344785778684" targetNodeId="8637771344785801917" resolveInfo="s0" />
      <node role="symbols" roleId="v4hd.8637771344785779371" type="v4hd.Symbol" typeId="v4hd.8637771344785779368" id="8637771344785801922">
        <property name="name" nameId="tpck.1169194664001" value="1" />
      </node>
    </node>
    <node role="states" roleId="v4hd.8637771344785778686" type="v4hd.State" typeId="v4hd.8637771344785778676" id="8637771344785801917">
      <property name="name" nameId="tpck.1169194664001" value="s0" />
    </node>
    <node role="states" roleId="v4hd.8637771344785778686" type="v4hd.State" typeId="v4hd.8637771344785778676" id="8637771344785801918">
      <property name="name" nameId="tpck.1169194664001" value="s1" />
    </node>
    <node role="transitions" roleId="v4hd.8637771344785778687" type="v4hd.Transition" typeId="v4hd.8637771344785778678" id="8637771344785801923">
      <link role="source" roleId="v4hd.8637771344785778683" targetNodeId="8637771344785801918" resolveInfo="s1" />
      <link role="target" roleId="v4hd.8637771344785778684" targetNodeId="8637771344785801917" resolveInfo="s0" />
      <node role="symbols" roleId="v4hd.8637771344785779371" type="v4hd.Symbol" typeId="v4hd.8637771344785779368" id="8637771344785801924">
        <property name="name" nameId="tpck.1169194664001" value="0" />
      </node>
    </node>
    <node role="transitions" roleId="v4hd.8637771344785778687" type="v4hd.Transition" typeId="v4hd.8637771344785778678" id="8637771344785801926">
      <link role="source" roleId="v4hd.8637771344785778683" targetNodeId="8637771344785801918" resolveInfo="s1" />
      <link role="target" roleId="v4hd.8637771344785778684" targetNodeId="8637771344785801918" resolveInfo="s1" />
      <node role="symbols" roleId="v4hd.8637771344785779371" type="v4hd.Symbol" typeId="v4hd.8637771344785779368" id="8637771344785801927">
        <property name="name" nameId="tpck.1169194664001" value="1" />
      </node>
    </node>
  </root>
</model>

