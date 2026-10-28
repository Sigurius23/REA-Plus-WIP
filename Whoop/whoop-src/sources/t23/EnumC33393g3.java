package t23;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 t23.g3[], still in use, count: 1, list:
  (r0v1 t23.g3[]) from 0x0097: INVOKE (r0v1 t23.g3[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: t23.g3 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC33393g3 {
    TASK_REMOVED("App removed from recents"),
    /* JADX INFO: Fake field, exist only in values array */
    CALL_ON_HOLD("Call put on hold"),
    CLIENT_CLEANUP("client-cleanup"),
    RING_TIMEOUT("RingTimeout"),
    ACCEPTED_ON_OTHER_DEVICE("accepted-on-another-device"),
    LOCAL_CALL_MISSED_EVENT("LocalCallMissedEvent"),
    REJECTED_BY_ALL("All participants rejected the call"),
    /* JADX INFO: Fake field, exist only in values array */
    END_CALL("CALL_ENDED"),
    /* JADX INFO: Fake field, exist only in values array */
    PIP_ERROR("Error in Pip"),
    /* JADX INFO: Fake field, exist only in values array */
    PIP_STOPPED("PIP stopped"),
    /* JADX INFO: Fake field, exist only in values array */
    ACTIVITY_DESTROYED("Activity destroyed"),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM_CALL_ACTIVITY_EXCEPTION("STREAM_CALL_ACTIVITY_EXCEPTION"),
    /* JADX INFO: Fake field, exist only in values array */
    LEAVE_PREVIOUS_CALL_TO_ACCEPT_NEW_CALL("Leave previous call to accept new call");

    static {
        AbstractC15751g.m44468u(enumC33393g3Arr);
    }

    public EnumC33393g3(String str) {
        super(str, i);
    }

    public static EnumC33393g3 valueOf(String str) {
        return (EnumC33393g3) Enum.valueOf(EnumC33393g3.class, str);
    }

    public static EnumC33393g3[] values() {
        return (EnumC33393g3[]) f139450G.clone();
    }
}
