package y00;

import android.os.Parcel;
import android.os.Parcelable;
import ge3.AbstractC15751g;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.r3[], still in use, count: 1, list:
  (r0v1 y00.r3[]) from 0x002a: INVOKE (r0v1 y00.r3[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: y00.r3 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38941r3 implements InterfaceC36562b {
    UNSPECIFIED("unspecified"),
    LIMITED("limited"),
    ALWAYS("always");

    public static final Parcelable.Creator<EnumC38941r3> CREATOR = new C38967u2(13);

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ C33617b f167632F;

    /* JADX INFO: renamed from: w */
    public final String f167636w;

    static {
        f167632F = AbstractC15751g.m44468u(new EnumC38941r3[]{r0, r1, r2});
    }

    public EnumC38941r3(String str) {
        super(str, i);
        this.f167636w = str;
    }

    public static EnumC38941r3 valueOf(String str) {
        return (EnumC38941r3) Enum.valueOf(EnumC38941r3.class, str);
    }

    public static EnumC38941r3[] values() {
        return (EnumC38941r3[]) f167631E.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(name());
    }
}
