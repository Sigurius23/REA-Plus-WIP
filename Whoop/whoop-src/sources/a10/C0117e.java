package a10;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a10.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C0117e extends AbstractC0122j {
    public static final Parcelable.Creator<C0117e> CREATOR = new C0113a(3);

    /* JADX INFO: renamed from: x */
    public final String f357x;

    public C0117e(String str) {
        super(EnumC0120h.Link);
        this.f357x = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0117e) && AbstractC22676k.m65745e(this.f357x, ((C0117e) obj).f357x);
    }

    public final int hashCode() {
        String str = this.f357x;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("LinkWallet(dynamicLast4=", this.f357x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f357x);
    }
}
