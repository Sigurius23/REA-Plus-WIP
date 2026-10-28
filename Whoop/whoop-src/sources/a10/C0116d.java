package a10;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a10.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C0116d extends AbstractC0122j {
    public static final Parcelable.Creator<C0116d> CREATOR = new C0113a(2);

    /* JADX INFO: renamed from: x */
    public final String f356x;

    public C0116d(String str) {
        super(EnumC0120h.GooglePay);
        this.f356x = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0116d) && AbstractC22676k.m65745e(this.f356x, ((C0116d) obj).f356x);
    }

    public final int hashCode() {
        String str = this.f356x;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("GooglePayWallet(dynamicLast4=", this.f356x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f356x);
    }
}
