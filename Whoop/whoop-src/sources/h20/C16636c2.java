package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.c2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16636c2 implements Parcelable {
    public static final Parcelable.Creator<C16636c2> CREATOR = new C16699n(29);

    /* JADX INFO: renamed from: w */
    public final String f63983w;

    /* JADX INFO: renamed from: x */
    public final String f63984x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC16630b2 f63985y;

    public C16636c2(String id4, String ephemeralKeySecret, InterfaceC16630b2 accessType) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(ephemeralKeySecret, "ephemeralKeySecret");
        AbstractC22676k.m65750j(accessType, "accessType");
        this.f63983w = id4;
        this.f63984x = ephemeralKeySecret;
        this.f63985y = accessType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16636c2)) {
            return false;
        }
        C16636c2 c16636c2 = (C16636c2) obj;
        return AbstractC22676k.m65745e(this.f63983w, c16636c2.f63983w) && AbstractC22676k.m65745e(this.f63984x, c16636c2.f63984x) && AbstractC22676k.m65745e(this.f63985y, c16636c2.f63985y);
    }

    public final int hashCode() {
        return this.f63985y.hashCode() + AbstractC11266d.m30450d(this.f63983w.hashCode() * 31, 31, this.f63984x);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CustomerConfiguration(id=", this.f63983w, ", ephemeralKeySecret=", this.f63984x, ", accessType=");
        sbM32001t.append(this.f63985y);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f63983w);
        dest.writeString(this.f63984x);
        dest.writeParcelable(this.f63985y, i13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16636c2(String id4, String ephemeralKeySecret) {
        this(id4, ephemeralKeySecret, new C16624a2(ephemeralKeySecret));
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(ephemeralKeySecret, "ephemeralKeySecret");
    }
}
