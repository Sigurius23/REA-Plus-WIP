package i20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i20.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C17979u extends AbstractC17981v {
    public static final Parcelable.Creator<C17979u> CREATOR = new C17925a(9);

    /* JADX INFO: renamed from: w */
    public final C17928b f69810w;

    public C17979u(C17928b address) {
        AbstractC22676k.m65750j(address, "address");
        this.f69810w = address;
    }

    @Override // i20.AbstractC17981v
    /* JADX INFO: renamed from: b */
    public final int mo51591b() {
        return -1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17979u) && AbstractC22676k.m65745e(this.f69810w, ((C17979u) obj).f69810w);
    }

    public final int hashCode() {
        return this.f69810w.hashCode();
    }

    public final String toString() {
        return "Succeeded(address=" + this.f69810w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f69810w.writeToParcel(dest, i13);
    }
}
