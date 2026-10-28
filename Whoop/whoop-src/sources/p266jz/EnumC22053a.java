package p266jz;

import android.os.Parcel;
import android.os.Parcelable;
import ge3.AbstractC15751g;
import gp.C16054r0;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 jz.a[], still in use, count: 1, list:
  (r0v1 jz.a[]) from 0x002a: INVOKE (r0v1 jz.a[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: jz.a */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC22053a implements InterfaceC36562b {
    Unspecified("unspecified"),
    Limited("limited"),
    Always("always");

    public static final Parcelable.Creator<EnumC22053a> CREATOR;

    /* JADX INFO: renamed from: w */
    public final String f85547w;

    static {
        AbstractC15751g.m44468u(enumC22053aArr);
        CREATOR = new C16054r0(23);
    }

    public EnumC22053a(String str) {
        super(str, i);
        this.f85547w = str;
    }

    public static EnumC22053a valueOf(String str) {
        return (EnumC22053a) Enum.valueOf(EnumC22053a.class, str);
    }

    public static EnumC22053a[] values() {
        return (EnumC22053a[]) f85543E.clone();
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
