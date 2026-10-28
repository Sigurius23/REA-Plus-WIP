package nb3;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 nb3.h[], still in use, count: 1, list:
  (r0v1 nb3.h[]) from 0x0076: INVOKE (r0v1 nb3.h[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: nb3.h */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC26551h {
    CAPTURED_TYPE_SCOPE("No member resolution should be done on captured type, it used only during constraint system resolution"),
    INTEGER_LITERAL_TYPE_SCOPE("Scope for integer literal type (%s)"),
    /* JADX INFO: Fake field, exist only in values array */
    ERASED_RECEIVER_TYPE_SCOPE("Error scope for erased receiver type"),
    SCOPE_FOR_ABBREVIATION_TYPE("Scope for abbreviation %s"),
    /* JADX INFO: Fake field, exist only in values array */
    STUB_TYPE_SCOPE("Scope for stub type %s"),
    /* JADX INFO: Fake field, exist only in values array */
    NON_CLASSIFIER_SUPER_TYPE_SCOPE("A scope for common supertype which is not a normal classifier"),
    ERROR_TYPE_SCOPE("Scope for error type %s"),
    /* JADX INFO: Fake field, exist only in values array */
    UNSUPPORTED_TYPE_SCOPE("Scope for unsupported type %s"),
    SCOPE_FOR_ERROR_CLASS("Error scope for class %s with arguments: %s"),
    /* JADX INFO: Fake field, exist only in values array */
    SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE("Error resolution candidate for call %s");


    /* JADX INFO: renamed from: w */
    public final String f105521w;

    static {
        AbstractC15751g.m44468u(enumC26551hArr);
    }

    public EnumC26551h(String str) {
        super(str, i);
        this.f105521w = str;
    }

    public static EnumC26551h valueOf(String str) {
        return (EnumC26551h) Enum.valueOf(EnumC26551h.class, str);
    }

    public static EnumC26551h[] values() {
        return (EnumC26551h[]) f105517G.clone();
    }
}
