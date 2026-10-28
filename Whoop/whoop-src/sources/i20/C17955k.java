package i20;

import android.os.Parcel;
import android.os.Parcelable;
import h20.C16760x0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i20.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C17955k implements InterfaceC17961m {
    public static final Parcelable.Creator<C17955k> CREATOR = new C17925a(3);

    /* JADX INFO: renamed from: w */
    public final C16760x0 f69760w;

    public C17955k(C16760x0 c16760x0) {
        this.f69760w = c16760x0;
    }

    @Override // i20.InterfaceC17961m
    /* JADX INFO: renamed from: a */
    public final C16760x0 mo51573a() {
        return this.f69760w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17955k) && AbstractC22676k.m65745e(this.f69760w, ((C17955k) obj).f69760w);
    }

    public final int hashCode() {
        C16760x0 c16760x0 = this.f69760w;
        if (c16760x0 == null) {
            return 0;
        }
        return c16760x0.hashCode();
    }

    public final String toString() {
        return "OnBack(address=" + this.f69760w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        C16760x0 c16760x0 = this.f69760w;
        if (c16760x0 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16760x0.writeToParcel(dest, i13);
        }
    }
}
