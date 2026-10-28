package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.a1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38775a1 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38775a1> CREATOR = new C38873k(28);

    /* JADX INFO: renamed from: w */
    public final InterfaceC39010z0 f166898w;

    /* JADX INFO: renamed from: x */
    public final List f166899x;

    /* JADX INFO: renamed from: y */
    public final String f166900y;

    /* JADX INFO: renamed from: z */
    public final String f166901z;

    public C38775a1(InterfaceC39010z0 mode, List paymentMethodTypes, String str, String str2) {
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(paymentMethodTypes, "paymentMethodTypes");
        this.f166898w = mode;
        this.f166899x = paymentMethodTypes;
        this.f166900y = str;
        this.f166901z = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38775a1)) {
            return false;
        }
        C38775a1 c38775a1 = (C38775a1) obj;
        return AbstractC22676k.m65745e(this.f166898w, c38775a1.f166898w) && AbstractC22676k.m65745e(this.f166899x, c38775a1.f166899x) && AbstractC22676k.m65745e(this.f166900y, c38775a1.f166900y) && AbstractC22676k.m65745e(this.f166901z, c38775a1.f166901z);
    }

    public final int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.f166898w.hashCode() * 31, 31, this.f166899x);
        String str = this.f166900y;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f166901z;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("DeferredIntentParams(mode=");
        sb4.append(this.f166898w);
        sb4.append(", paymentMethodTypes=");
        sb4.append(this.f166899x);
        sb4.append(", paymentMethodConfigurationId=");
        return AbstractC11266d.m30464r(sb4, this.f166900y, ", onBehalfOf=", this.f166901z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f166898w, i13);
        dest.writeStringList(this.f166899x);
        dest.writeString(this.f166900y);
        dest.writeString(this.f166901z);
    }
}
