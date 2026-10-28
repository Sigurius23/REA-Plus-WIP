package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.Objects;
import m83.C25272z;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y00.r4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38942r4 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38942r4> CREATOR = new C38858i4(6);

    /* JADX INFO: renamed from: w */
    public final String f167637w;

    public C38942r4(String str) {
        this.f167637w = str;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        String str = this.f167637w;
        return str != null ? AbstractC31061c.m95645u("preferred", str) : C25272z.f99163w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C38942r4) && AbstractC22676k.m65745e(((C38942r4) obj).f167637w, this.f167637w);
    }

    public final int hashCode() {
        return Objects.hash(this.f167637w);
    }

    public final String toString() {
        return AbstractC11895b.m31996o("PaymentMethodCreateParams.Card.Networks(preferred=", this.f167637w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167637w);
    }
}
