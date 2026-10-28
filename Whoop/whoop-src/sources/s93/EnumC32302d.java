package s93;

import ge3.AbstractC15751g;
import sb3.AbstractC32350a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 s93.d[], still in use, count: 1, list:
  (r0v1 s93.d[]) from 0x0079: INVOKE (r0v1 s93.d[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: s93.d */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC32302d {
    /* JADX INFO: Fake field, exist only in values array */
    ALL(null),
    FIELD(null),
    FILE(null),
    PROPERTY(null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");


    /* JADX INFO: renamed from: w */
    public final String f133678w;

    static {
        AbstractC15751g.m44468u(enumC32302dArr);
    }

    public EnumC32302d(String str) {
        super(str, i);
        this.f133678w = str == null ? AbstractC32350a.m100713u(name()) : str;
    }

    public static EnumC32302d valueOf(String str) {
        return (EnumC32302d) Enum.valueOf(EnumC32302d.class, str);
    }

    public static EnumC32302d[] values() {
        return (EnumC32302d[]) f133674K.clone();
    }

    /* JADX INFO: renamed from: a */
    public final String m100550a() {
        return this.f133678w;
    }
}
