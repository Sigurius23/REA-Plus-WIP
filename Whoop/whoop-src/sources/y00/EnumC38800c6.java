package y00;

import ge3.AbstractC15751g;
import p499t9.C33647p;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.c6[], still in use, count: 1, list:
  (r0v1 y00.c6[]) from 0x0024: INVOKE (r0v1 y00.c6[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: y00.c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38800c6 {
    /* JADX INFO: Fake field, exist only in values array */
    Duplicate("duplicate"),
    /* JADX INFO: Fake field, exist only in values array */
    RequestedByCustomer("requested_by_customer"),
    /* JADX INFO: Fake field, exist only in values array */
    Abandoned("abandoned");


    /* JADX INFO: renamed from: x */
    public static final C33647p f166978x = new C33647p(23);

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ C33617b f166980z = AbstractC15751g.m44468u(new EnumC38800c6[]{new EnumC38800c6("duplicate"), new EnumC38800c6("requested_by_customer"), new EnumC38800c6("abandoned")});

    /* JADX INFO: renamed from: w */
    public final String f166981w;

    static {
    }

    public EnumC38800c6(String str) {
        super(str, i);
        this.f166981w = str;
    }

    public static EnumC38800c6 valueOf(String str) {
        return (EnumC38800c6) Enum.valueOf(EnumC38800c6.class, str);
    }

    public static EnumC38800c6[] values() {
        return (EnumC38800c6[]) f166979y.clone();
    }
}
