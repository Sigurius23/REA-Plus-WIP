package a10;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a10.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C0115c extends AbstractC0122j {
    public static final Parcelable.Creator<C0115c> CREATOR = new C0113a(1);

    /* JADX INFO: renamed from: x */
    public final String f355x;

    public C0115c(String str) {
        super(EnumC0120h.ApplePay);
        this.f355x = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0115c) && AbstractC22676k.m65745e(this.f355x, ((C0115c) obj).f355x);
    }

    public final int hashCode() {
        String str = this.f355x;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("ApplePayWallet(dynamicLast4=", this.f355x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f355x);
    }
}
