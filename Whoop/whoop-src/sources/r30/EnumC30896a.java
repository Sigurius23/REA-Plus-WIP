package r30;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 r30.a[], still in use, count: 1, list:
  (r0v1 r30.a[]) from 0x004e: INVOKE (r0v1 r30.a[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: r30.a */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC30896a {
    UserSelected("01"),
    /* JADX INFO: Fake field, exist only in values array */
    Reserved("02"),
    /* JADX INFO: Fake field, exist only in values array */
    TransactionTimedOutDecoupled("03"),
    /* JADX INFO: Fake field, exist only in values array */
    TransactionTimedOutOther("04"),
    /* JADX INFO: Fake field, exist only in values array */
    TransactionTimedOutFirstCreq("05"),
    /* JADX INFO: Fake field, exist only in values array */
    TransactionError("06"),
    /* JADX INFO: Fake field, exist only in values array */
    Unknown("07");


    /* JADX INFO: renamed from: w */
    public final String f127384w;

    static {
        AbstractC15751g.m44468u(enumC30896aArr);
    }

    public EnumC30896a(String str) {
        super(str, i);
        this.f127384w = str;
    }

    public static EnumC30896a valueOf(String str) {
        return (EnumC30896a) Enum.valueOf(EnumC30896a.class, str);
    }

    public static EnumC30896a[] values() {
        return (EnumC30896a[]) f127383y.clone();
    }
}
