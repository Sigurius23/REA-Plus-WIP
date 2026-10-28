package a10;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a10.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C0114b extends AbstractC0122j {
    public static final Parcelable.Creator<C0114b> CREATOR = new C0113a(0);

    /* JADX INFO: renamed from: x */
    public final String f354x;

    public C0114b(String str) {
        super(EnumC0120h.AmexExpressCheckout);
        this.f354x = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0114b) && AbstractC22676k.m65745e(this.f354x, ((C0114b) obj).f354x);
    }

    public final int hashCode() {
        String str = this.f354x;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("AmexExpressCheckoutWallet(dynamicLast4=", this.f354x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f354x);
    }
}
