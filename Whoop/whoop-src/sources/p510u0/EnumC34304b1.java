package p510u0;

import android.R;
import ge3.AbstractC15751g;
import p601x0.AbstractC37794e;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 u0.b1[], still in use, count: 1, list:
  (r0v1 u0.b1[]) from 0x0054: INVOKE (r0v1 u0.b1[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: u0.b1 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC34304b1 {
    /* JADX INFO: Fake field, exist only in values array */
    Cut(R.string.cut, R.attr.actionModeCutDrawable, AbstractC37794e.f161896a),
    /* JADX INFO: Fake field, exist only in values array */
    Copy(R.string.copy, R.attr.actionModeCopyDrawable, AbstractC37794e.f161897b),
    /* JADX INFO: Fake field, exist only in values array */
    Paste(R.string.paste, R.attr.actionModePasteDrawable, AbstractC37794e.f161898c),
    /* JADX INFO: Fake field, exist only in values array */
    SelectAll(R.string.selectAll, R.attr.actionModeSelectAllDrawable, AbstractC37794e.f161899d),
    /* JADX INFO: Fake field, exist only in values array */
    Autofill(R.string.autofill, 0, AbstractC37794e.f161900e);


    /* JADX INFO: renamed from: w */
    public final Object f144054w;

    static {
        AbstractC15751g.m44468u(enumC34304b1Arr);
    }

    public EnumC34304b1(int i13, int i14, Object obj) {
        super(str, i);
        this.f144054w = obj;
    }

    public static EnumC34304b1 valueOf(String str) {
        return (EnumC34304b1) Enum.valueOf(EnumC34304b1.class, str);
    }

    public static EnumC34304b1[] values() {
        return (EnumC34304b1[]) f144053x.clone();
    }
}
