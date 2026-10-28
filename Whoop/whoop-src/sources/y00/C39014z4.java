package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y00.z4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C39014z4 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C39014z4> CREATOR = new C38858i4(14);

    /* JADX INFO: renamed from: w */
    public String f167922w;

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        return AbstractC31061c.m95645u("external_source_id", this.f167922w);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39014z4) && AbstractC22676k.m65745e(this.f167922w, ((C39014z4) obj).f167922w);
    }

    public final int hashCode() {
        return this.f167922w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("ShopPay(externalSourceId=", this.f167922w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167922w);
    }
}
