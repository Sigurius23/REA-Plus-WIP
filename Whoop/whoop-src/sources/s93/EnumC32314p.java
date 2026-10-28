package s93;

import ge3.AbstractC15751g;
import java.util.ArrayList;
import java.util.HashMap;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p002a0.C0030i1;
import t83.C33617b;
import wb3.AbstractC37056f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v28 s93.p[], still in use, count: 1, list:
  (r0v28 s93.p[]) from 0x0234: INVOKE (r0v29 t83.b) = (r0v28 s93.p[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: s93.p */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC32314p {
    CLASS(true),
    ANNOTATION_CLASS(true),
    TYPE_PARAMETER(false),
    PROPERTY(true),
    FIELD(true),
    LOCAL_VARIABLE(true),
    VALUE_PARAMETER(true),
    CONSTRUCTOR(true),
    FUNCTION(true),
    PROPERTY_GETTER(true),
    PROPERTY_SETTER(true),
    TYPE(false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPRESSION(false),
    FILE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TYPEALIAS(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    /* JADX INFO: Fake field, exist only in values array */
    STAR_PROJECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    CLASS_ONLY(false),
    OBJECT(false),
    STANDALONE_OBJECT(false),
    COMPANION_OBJECT(false),
    INTERFACE(false),
    ENUM_CLASS(false),
    ENUM_ENTRY(false),
    LOCAL_CLASS(false),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    BACKING_FIELD(true),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZER(false),
    /* JADX INFO: Fake field, exist only in values array */
    DESTRUCTURING_DECLARATION(false),
    /* JADX INFO: Fake field, exist only in values array */
    LAMBDA_EXPRESSION(false),
    /* JADX INFO: Fake field, exist only in values array */
    ANONYMOUS_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT_LITERAL(false);


    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ C33617b f133718Y;

    /* JADX INFO: renamed from: x */
    public static final HashMap f133719x;

    /* JADX INFO: renamed from: w */
    public final boolean f133722w;

    static {
        C33617b c33617bM44468u = AbstractC15751g.m44468u(enumC32314pArr);
        f133718Y = c33617bM44468u;
        f133719x = new HashMap();
        C0030i1 c0030i1 = new C0030i1(c33617bM44468u, 2);
        while (c0030i1.hasNext()) {
            EnumC32314p enumC32314p = (EnumC32314p) c0030i1.next();
            f133719x.put(enumC32314p.name(), enumC32314p);
        }
        C33617b c33617b = f133718Y;
        ArrayList arrayList = new ArrayList();
        c33617b.getClass();
        C0030i1 c0030i2 = new C0030i1(c33617b, 2);
        while (c0030i2.hasNext()) {
            Object next = c0030i2.next();
            if (((EnumC32314p) next).f133722w) {
                arrayList.add(next);
            }
        }
        AbstractC25265s.m74103I1(arrayList);
        AbstractC25265s.m74103I1(f133718Y);
        EnumC32314p enumC32314p2 = ANNOTATION_CLASS;
        EnumC32314p enumC32314p3 = CLASS;
        AbstractC37056f.m118959K(enumC32314p2, enumC32314p3);
        AbstractC37056f.m118959K(LOCAL_CLASS, enumC32314p3);
        AbstractC37056f.m118959K(CLASS_ONLY, enumC32314p3);
        EnumC32314p enumC32314p4 = COMPANION_OBJECT;
        EnumC32314p enumC32314p5 = OBJECT;
        AbstractC37056f.m118959K(enumC32314p4, enumC32314p5, enumC32314p3);
        AbstractC37056f.m118959K(STANDALONE_OBJECT, enumC32314p5, enumC32314p3);
        AbstractC37056f.m118959K(INTERFACE, enumC32314p3);
        AbstractC37056f.m118959K(ENUM_CLASS, enumC32314p3);
        EnumC32314p enumC32314p6 = ENUM_ENTRY;
        EnumC32314p enumC32314p7 = PROPERTY;
        EnumC32314p enumC32314p8 = FIELD;
        AbstractC37056f.m118959K(enumC32314p6, enumC32314p7, enumC32314p8);
        EnumC32314p enumC32314p9 = PROPERTY_SETTER;
        AbstractC37056f.m118958J(enumC32314p9);
        EnumC32314p enumC32314p10 = PROPERTY_GETTER;
        AbstractC37056f.m118958J(enumC32314p10);
        AbstractC37056f.m118958J(FUNCTION);
        EnumC32314p enumC32314p11 = FILE;
        AbstractC37056f.m118958J(enumC32314p11);
        EnumC32302d enumC32302d = EnumC32302d.CONSTRUCTOR_PARAMETER;
        EnumC32314p enumC32314p12 = VALUE_PARAMETER;
        AbstractC25247g0.m73990Y(new C23465k(enumC32302d, enumC32314p12), new C23465k(EnumC32302d.FIELD, enumC32314p8), new C23465k(EnumC32302d.PROPERTY, enumC32314p7), new C23465k(EnumC32302d.FILE, enumC32314p11), new C23465k(EnumC32302d.PROPERTY_GETTER, enumC32314p10), new C23465k(EnumC32302d.PROPERTY_SETTER, enumC32314p9), new C23465k(EnumC32302d.RECEIVER, enumC32314p12), new C23465k(EnumC32302d.SETTER_PARAMETER, enumC32314p12), new C23465k(EnumC32302d.PROPERTY_DELEGATE_FIELD, enumC32314p8));
    }

    public EnumC32314p(boolean z4) {
        super(str, i);
        this.f133722w = z4;
    }

    public static EnumC32314p valueOf(String str) {
        return (EnumC32314p) Enum.valueOf(EnumC32314p.class, str);
    }

    public static EnumC32314p[] values() {
        return (EnumC32314p[]) f133717X.clone();
    }
}
