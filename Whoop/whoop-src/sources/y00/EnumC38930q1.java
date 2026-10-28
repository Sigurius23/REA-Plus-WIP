package y00;

import ge3.AbstractC15751g;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.q1[], still in use, count: 1, list:
  (r0v1 y00.q1[]) from 0x004e: INVOKE (r0v1 y00.q1[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: y00.q1 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38930q1 {
    LINK_GLOBAL_HOLD_BACK("link_global_holdback"),
    LINK_GLOBAL_HOLD_BACK_AA("link_global_holdback_aa"),
    LINK_AB_TEST("link_ab_test"),
    OCS_MOBILE_HORIZONTAL_MODE_ANDROID_AA("ocs_mobile_horizontal_mode_android_aa"),
    OCS_MOBILE_HORIZONTAL_MODE_AA("ocs_mobile_horizontal_mode_aa"),
    OCS_MOBILE_HORIZONTAL_MODE("ocs_mobile_horizontal_mode");


    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ C33617b f167594I;

    /* JADX INFO: renamed from: w */
    public final String f167598w;

    static {
        f167594I = AbstractC15751g.m44468u(enumC38930q1Arr);
    }

    public EnumC38930q1(String str) {
        super(str, i);
        this.f167598w = str;
    }

    public static EnumC38930q1 valueOf(String str) {
        return (EnumC38930q1) Enum.valueOf(EnumC38930q1.class, str);
    }

    public static EnumC38930q1[] values() {
        return (EnumC38930q1[]) f167593H.clone();
    }
}
