package t23;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 t23.g[], still in use, count: 1, list:
  (r0v1 t23.g[]) from 0x004a: INVOKE (r0v1 t23.g[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: t23.g */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC33389g {
    LEAVE_TIMEOUT_AFTER_DISCONNECT("Leave timeout after disconnect"),
    SFU_DISCONNECT("SFU:DISCONNECT"),
    CALL_ENDED_EVENT("CallEndedEvent"),
    CALL_ENDED_SFU_EVENT("CallEndedSfuEvent"),
    /* JADX INFO: Fake field, exist only in values array */
    CALL_SESSION_ENDED_EVENT("CallSessionEndedEvent"),
    /* JADX INFO: Fake field, exist only in values array */
    RING_FAILED("Ring failed");


    /* JADX INFO: renamed from: w */
    public final String f139395w;

    static {
        AbstractC15751g.m44468u(enumC33389gArr);
    }

    public EnumC33389g(String str) {
        super(str, i);
        this.f139395w = str;
    }

    public static EnumC33389g valueOf(String str) {
        return (EnumC33389g) Enum.valueOf(EnumC33389g.class, str);
    }

    public static EnumC33389g[] values() {
        return (EnumC33389g[]) f139391F.clone();
    }
}
