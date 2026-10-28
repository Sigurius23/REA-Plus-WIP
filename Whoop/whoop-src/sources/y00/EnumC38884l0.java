package y00;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.l0[], still in use, count: 1, list:
  (r0v1 y00.l0[]) from 0x008b: INVOKE (r0v1 y00.l0[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: y00.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38884l0 {
    Checkbox("clicked_checkbox_nospm_mobile_v0"),
    CheckboxWithPrefilledEmail("clicked_checkbox_nospm_mobile_v0_0"),
    CheckboxWithPrefilledEmailAndPhone("clicked_checkbox_nospm_mobile_v0_1"),
    Implied("implied_consent_withspm_mobile_v0"),
    ImpliedWithPrefilledEmail("implied_consent_withspm_mobile_v0_0"),
    PrecheckedOptInBoxPrefilledAll("prechecked_opt_in_box_prefilled_all"),
    PrecheckedOptInBoxPrefilledSome("prechecked_opt_in_box_prefilled_some"),
    PrecheckedOptInBoxPrefilledNone("prechecked_opt_in_box_prefilled_none"),
    SignUpOptInMobileChecked("sign_up_opt_in_mobile_checked"),
    SignUpOptInMobilePrechecked("sign_up_opt_in_mobile_prechecked"),
    /* JADX INFO: Fake field, exist only in values array */
    EnteredPhoneNumberClickedSaveToLink("entered_phone_number_clicked_save_to_link");


    /* JADX INFO: renamed from: w */
    public final String f167364w;

    static {
        AbstractC15751g.m44468u(enumC38884l0Arr);
    }

    public EnumC38884l0(String str) {
        super(str, i);
        this.f167364w = str;
    }

    public static EnumC38884l0 valueOf(String str) {
        return (EnumC38884l0) Enum.valueOf(EnumC38884l0.class, str);
    }

    public static EnumC38884l0[] values() {
        return (EnumC38884l0[]) f167360L.clone();
    }
}
