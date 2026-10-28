package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.Objects;
import m83.C25272z;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y00.w5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38988w5 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38988w5> CREATOR = new C38943r5(3);

    /* JADX INFO: renamed from: w */
    public final String f167826w;

    public C38988w5(String str) {
        this.f167826w = str;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        String str = this.f167826w;
        return str != null ? AbstractC31061c.m95645u("preferred", str) : C25272z.f99163w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C38988w5) && AbstractC22676k.m65745e(((C38988w5) obj).f167826w, this.f167826w);
    }

    public final int hashCode() {
        return Objects.hash(this.f167826w);
    }

    public final String toString() {
        return AbstractC11895b.m31996o("PaymentMethodCreateParams.Card.Networks(preferred=", this.f167826w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167826w);
    }
}
