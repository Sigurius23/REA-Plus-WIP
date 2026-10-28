package my;

import com.whoop.android.R;
import ge3.AbstractC15751g;
import m83.C25271y;
import p479s4.AbstractC32128i;
import p696zy.C41210b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 my.b[], still in use, count: 1, list:
  (r0v1 my.b[]) from 0x002c: INVOKE (r0v1 my.b[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: my.b */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC26028b {
    Full(null),
    Partial(Integer.valueOf(R.string.stripe_paymentsheet_remove_partial_description)),
    None(null);


    /* JADX INFO: renamed from: w */
    public final Integer f102978w;

    static {
        AbstractC15751g.m44468u(enumC26028bArr);
    }

    public EnumC26028b(Integer num) {
        super(str, i);
        this.f102978w = num;
    }

    public static EnumC26028b valueOf(String str) {
        return (EnumC26028b) Enum.valueOf(EnumC26028b.class, str);
    }

    public static EnumC26028b[] values() {
        return (EnumC26028b[]) f102974E.clone();
    }

    /* JADX INFO: renamed from: a */
    public final C41210b m77436a(String merchantDisplayName) {
        AbstractC22676k.m65750j(merchantDisplayName, "merchantDisplayName");
        Integer num = this.f102978w;
        if (num != null) {
            return AbstractC32128i.m100064s(num.intValue(), new Object[]{merchantDisplayName}, C25271y.f99162w);
        }
        return null;
    }
}
