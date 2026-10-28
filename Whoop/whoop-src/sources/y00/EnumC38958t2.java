package y00;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.t2[], still in use, count: 1, list:
  (r0v1 y00.t2[]) from 0x0040: INVOKE (r0v1 y00.t2[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: y00.t2 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38958t2 {
    LinkCardNotSupported("link_card_not_supported"),
    DisabledInElementsSession("disabled_in_elements_session"),
    SignupOptInFeatureNoEmailProvided("signup_opt_in_feature_no_email_provided"),
    /* JADX INFO: Fake field, exist only in values array */
    AttestationIssues("attestation_issues"),
    LinkUsedBefore("link_used_before");


    /* JADX INFO: renamed from: w */
    public final String f167699w;

    static {
        AbstractC15751g.m44468u(enumC38958t2Arr);
    }

    public EnumC38958t2(String str) {
        super(str, i);
        this.f167699w = str;
    }

    public static EnumC38958t2 valueOf(String str) {
        return (EnumC38958t2) Enum.valueOf(EnumC38958t2.class, str);
    }

    public static EnumC38958t2[] values() {
        return (EnumC38958t2[]) f167695F.clone();
    }
}
