package y00;

import android.os.Parcel;
import android.os.Parcelable;
import ge3.AbstractC15751g;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.h4[], still in use, count: 1, list:
  (r0v1 y00.h4[]) from 0x0026: INVOKE (r0v1 y00.h4[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: y00.h4 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38848h4 implements InterfaceC36562b {
    UNKNOWN("unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    INDIVIDUAL("individual"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPANY("company");

    public static final Parcelable.Creator<EnumC38848h4> CREATOR = new C38967u2(29);

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ C33617b f167224z;

    /* JADX INFO: renamed from: w */
    public final String f167225w;

    static {
        f167224z = AbstractC15751g.m44468u(new EnumC38848h4[]{r0, new EnumC38848h4("individual"), new EnumC38848h4("company")});
    }

    public EnumC38848h4(String str) {
        super(str, i);
        this.f167225w = str;
    }

    public static EnumC38848h4 valueOf(String str) {
        return (EnumC38848h4) Enum.valueOf(EnumC38848h4.class, str);
    }

    public static EnumC38848h4[] values() {
        return (EnumC38848h4[]) f167223y.clone();
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
