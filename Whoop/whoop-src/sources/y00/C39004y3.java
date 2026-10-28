package y00;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.y3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C39004y3 implements InterfaceC36562b {
    public static final Parcelable.Creator<C39004y3> CREATOR = new C38967u2(20);

    /* JADX INFO: renamed from: w */
    public final boolean f167887w;

    public C39004y3(boolean z4) {
        this.f167887w = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39004y3) && this.f167887w == ((C39004y3) obj).f167887w;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167887w);
    }

    public final String toString() {
        return AbstractC3855a.m11827k("ThreeDSecureUsage(isSupported=", ")", this.f167887w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f167887w ? 1 : 0);
    }
}
