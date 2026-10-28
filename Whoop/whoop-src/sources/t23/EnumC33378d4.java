package t23;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 t23.d4[], still in use, count: 1, list:
  (r0v1 t23.d4[]) from 0x0048: INVOKE (r0v1 t23.d4[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: t23.d4 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC33378d4 {
    /* JADX INFO: Fake field, exist only in values array */
    WEARABLE_REJECTED("Call rejected on wearable"),
    /* JADX INFO: Fake field, exist only in values array */
    WEARABLE_CANCEL("Canceled from wearable"),
    CALL_JOIN_ABORT("Call join aborted"),
    REJECTED_BY_SELF("Rejected by self"),
    /* JADX INFO: Fake field, exist only in values array */
    CANCELLED_BY_SELF("Cancelled the call"),
    LEAVE_FROM_NOTIFICATION("User left from notification action");

    static {
        AbstractC15751g.m44468u(enumC33378d4Arr);
    }

    public EnumC33378d4(String str) {
        super(str, i);
    }

    public static EnumC33378d4 valueOf(String str) {
        return (EnumC33378d4) Enum.valueOf(EnumC33378d4.class, str);
    }

    public static EnumC33378d4[] values() {
        return (EnumC33378d4[]) f139339z.clone();
    }
}
