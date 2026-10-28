package i20;

import android.os.Parcel;
import android.os.Parcelable;
import h20.C16760x0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i20.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17944g0 implements InterfaceC17950i0 {
    public static final Parcelable.Creator<C17944g0> CREATOR = new C17925a(15);

    /* JADX INFO: renamed from: w */
    public final C16760x0 f69725w;

    public C17944g0(C16760x0 c16760x0) {
        this.f69725w = c16760x0;
    }

    @Override // i20.InterfaceC17950i0
    /* JADX INFO: renamed from: a */
    public final C16760x0 mo51571a() {
        return this.f69725w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17944g0) && AbstractC22676k.m65745e(this.f69725w, ((C17944g0) obj).f69725w);
    }

    public final int hashCode() {
        C16760x0 c16760x0 = this.f69725w;
        if (c16760x0 == null) {
            return 0;
        }
        return c16760x0.hashCode();
    }

    public final String toString() {
        return "EnterManually(address=" + this.f69725w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        C16760x0 c16760x0 = this.f69725w;
        if (c16760x0 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16760x0.writeToParcel(dest, i13);
        }
    }
}
