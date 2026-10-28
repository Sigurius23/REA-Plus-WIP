package y00;

import ge3.AbstractC15751g;
import m83.AbstractC25260n;
import p499t9.C33647p;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.v0[], still in use, count: 1, list:
  (r0v1 y00.v0[]) from 0x004c: INVOKE (r0v1 y00.v0[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: y00.v0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38974v0 {
    /* JADX INFO: Fake field, exist only in values array */
    Pass("PASS"),
    Fail("FAIL"),
    Unavailable("UNAVAILABLE"),
    Unchecked("UNCHECKED"),
    StateInvalid("STATE_INVALID"),
    Unknown("UNKNOWN");


    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ C33617b f167762I;

    /* JADX INFO: renamed from: x */
    public static final C33647p f167763x = new C33647p(19);

    /* JADX INFO: renamed from: w */
    public final String f167766w;

    static {
        f167762I = AbstractC15751g.m44468u(new EnumC38974v0[]{r0, r1, r2, r3, r4, r5});
    }

    public EnumC38974v0(String str) {
        super(str, i);
        this.f167766w = str;
    }

    public static EnumC38974v0 valueOf(String str) {
        return (EnumC38974v0) Enum.valueOf(EnumC38974v0.class, str);
    }

    public static EnumC38974v0[] values() {
        return (EnumC38974v0[]) f167761H.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m124400a() {
        return AbstractC25260n.m74059b1(new EnumC38974v0[]{Fail, Unavailable, Unchecked, StateInvalid}).contains(this);
    }
}
