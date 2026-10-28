package y00;

import ge3.AbstractC15751g;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.s1[], still in use, count: 1, list:
  (r0v1 y00.s1[]) from 0x0066: INVOKE (r0v1 y00.s1[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: y00.s1 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38948s1 {
    ELEMENTS_DISABLE_FC_LITE("elements_disable_fc_lite"),
    ELEMENTS_PREFER_FC_LITE("elements_prefer_fc_lite"),
    ELEMENTS_DISABLE_LINK_GLOBAL_HOLDBACK_LOOKUP("elements_disable_link_global_holdback_lookup"),
    ELEMENTS_ENABLE_LINK_SPM("elements_enable_link_spm"),
    ELEMENTS_ENABLE_PASSIVE_CAPTCHA("elements_enable_passive_captcha"),
    ELEMENTS_MOBILE_FORCE_SETUP_FUTURE_USE_BEHAVIOR_AND_NEW_MANDATE_TEXT("elements_mobile_force_setup_future_use_behavior_and_new_mandate_text"),
    ELEMENTS_MOBILE_ATTEST_ON_INTENT_CONFIRMATION("elements_mobile_attest_on_intent_confirmation"),
    ELEMENTS_MOBILE_CARD_FUND_FILTERING("elements_mobile_card_funding_filtering");


    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ C33617b f167650K;

    /* JADX INFO: renamed from: w */
    public final String f167654w;

    static {
        f167650K = AbstractC15751g.m44468u(enumC38948s1Arr);
    }

    public EnumC38948s1(String str) {
        super(str, i);
        this.f167654w = str;
    }

    public static EnumC38948s1 valueOf(String str) {
        return (EnumC38948s1) Enum.valueOf(EnumC38948s1.class, str);
    }

    public static EnumC38948s1[] values() {
        return (EnumC38948s1[]) f167649J.clone();
    }
}
