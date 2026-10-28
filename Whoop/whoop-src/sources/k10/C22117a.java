package k10;

import android.os.Parcel;
import android.os.Parcelable;
import e10.InterfaceC12555l;
import p266jz.C22060h;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38977v3;

/* JADX INFO: renamed from: k10.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C22117a implements InterfaceC12555l {
    public static final Parcelable.Creator<C22117a> CREATOR = new C22060h(5);

    /* JADX INFO: renamed from: w */
    public final String f85812w;

    /* JADX INFO: renamed from: x */
    public final C38977v3 f85813x;

    public C22117a(String type, C38977v3 c38977v3) {
        AbstractC22676k.m65750j(type, "type");
        this.f85812w = type;
        this.f85813x = c38977v3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22117a)) {
            return false;
        }
        C22117a c22117a = (C22117a) obj;
        return AbstractC22676k.m65745e(this.f85812w, c22117a.f85812w) && AbstractC22676k.m65745e(this.f85813x, c22117a.f85813x);
    }

    public final int hashCode() {
        int iHashCode = this.f85812w.hashCode() * 31;
        C38977v3 c38977v3 = this.f85813x;
        return iHashCode + (c38977v3 == null ? 0 : c38977v3.hashCode());
    }

    public final String toString() {
        return "ExternalPaymentMethodConfirmationOption(type=" + this.f85812w + ", billingDetails=" + this.f85813x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f85812w);
        dest.writeParcelable(this.f85813x, i13);
    }
}
