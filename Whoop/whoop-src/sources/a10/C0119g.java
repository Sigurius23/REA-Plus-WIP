package a10;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a10.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C0119g extends AbstractC0122j {
    public static final Parcelable.Creator<C0119g> CREATOR = new C0113a(5);

    /* JADX INFO: renamed from: x */
    public final String f362x;

    public C0119g(String str) {
        super(EnumC0120h.SamsungPay);
        this.f362x = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0119g) && AbstractC22676k.m65745e(this.f362x, ((C0119g) obj).f362x);
    }

    public final int hashCode() {
        String str = this.f362x;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SamsungPayWallet(dynamicLast4=", this.f362x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f362x);
    }
}
