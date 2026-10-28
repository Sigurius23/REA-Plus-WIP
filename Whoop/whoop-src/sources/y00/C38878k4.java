package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p555vl.AbstractC36095b;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.k4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38878k4 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38878k4> CREATOR = new C38858i4(1);

    /* JADX INFO: renamed from: w */
    public final String f167325w;

    /* JADX INFO: renamed from: x */
    public final List f167326x;

    public C38878k4(String str, ArrayList supported) {
        AbstractC22676k.m65750j(supported, "supported");
        this.f167325w = str;
        this.f167326x = supported;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38878k4)) {
            return false;
        }
        C38878k4 c38878k4 = (C38878k4) obj;
        return AbstractC22676k.m65745e(this.f167325w, c38878k4.f167325w) && AbstractC22676k.m65745e(this.f167326x, c38878k4.f167326x);
    }

    public final int hashCode() {
        String str = this.f167325w;
        return this.f167326x.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return AbstractC36095b.m114679g("USBankNetworks(preferred=", this.f167325w, ", supported=", ")", this.f167326x);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167325w);
        dest.writeStringList(this.f167326x);
    }
}
