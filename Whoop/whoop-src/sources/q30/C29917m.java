package q30;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Arrays;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;
import s30.AbstractC32103e;

/* JADX INFO: renamed from: q30.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C29917m implements Serializable, Parcelable {
    public static final Parcelable.Creator<C29917m> CREATOR = new C29831p(18);

    /* JADX INFO: renamed from: w */
    public final byte[] f122208w;

    /* JADX INFO: renamed from: x */
    public final byte[] f122209x;

    public C29917m(byte[] sdkPrivateKeyEncoded, byte[] acsPublicKeyEncoded) {
        AbstractC22676k.m65750j(sdkPrivateKeyEncoded, "sdkPrivateKeyEncoded");
        AbstractC22676k.m65750j(acsPublicKeyEncoded, "acsPublicKeyEncoded");
        this.f122208w = sdkPrivateKeyEncoded;
        this.f122209x = acsPublicKeyEncoded;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C29917m) {
            C29917m c29917m = (C29917m) obj;
            if (Arrays.equals(this.f122208w, c29917m.f122208w) && Arrays.equals(this.f122209x, c29917m.f122209x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC32103e.m99885g(this.f122208w, this.f122209x);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("Keys(sdkPrivateKeyEncoded=", Arrays.toString(this.f122208w), ", acsPublicKeyEncoded=", Arrays.toString(this.f122209x), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeByteArray(this.f122208w);
        dest.writeByteArray(this.f122209x);
    }
}
