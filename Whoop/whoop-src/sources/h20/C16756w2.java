package h20;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;
import p031b9.AbstractC2875y;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: h20.w2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16756w2 implements Parcelable {
    public static final Parcelable.Creator<C16756w2> CREATOR = new C16654f2(9);

    /* JADX INFO: renamed from: E */
    public final Object f64376E;

    /* JADX INFO: renamed from: w */
    public final EnumC16750v2 f64377w;

    /* JADX INFO: renamed from: x */
    public final boolean f64378x;

    /* JADX INFO: renamed from: y */
    public final boolean f64379y;

    /* JADX INFO: renamed from: z */
    public final boolean f64380z;

    public C16756w2(EnumC16750v2 display, boolean z4, boolean z13, boolean z14, Set set) {
        AbstractC22676k.m65750j(display, "display");
        this.f64377w = display;
        this.f64378x = z4;
        this.f64379y = z13;
        this.f64380z = z14;
        this.f64376E = set;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m47275b() {
        int iOrdinal = this.f64377w.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16756w2)) {
            return false;
        }
        C16756w2 c16756w2 = (C16756w2) obj;
        return this.f64377w == c16756w2.f64377w && this.f64378x == c16756w2.f64378x && this.f64379y == c16756w2.f64379y && this.f64380z == c16756w2.f64380z && AbstractC22676k.m65745e(this.f64376E, c16756w2.f64376E);
    }

    public final int hashCode() {
        return this.f64376E.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.f64377w.hashCode() * 31, 31, this.f64378x), 31, this.f64379y), 31, this.f64380z);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("LinkConfiguration(display=");
        sb4.append(this.f64377w);
        sb4.append(", collectMissingBillingDetailsForExistingPaymentMethods=");
        sb4.append(this.f64378x);
        sb4.append(", allowUserEmailEdits=");
        AbstractC38963t7.m124392v(sb4, this.f64379y, ", allowLogOut=", this.f64380z, ", disallowFundingSourceCreation=");
        return AbstractC2875y.m8303p(sb4, ")", this.f64376E);
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Set] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f64377w.name());
        dest.writeInt(this.f64378x ? 1 : 0);
        dest.writeInt(this.f64379y ? 1 : 0);
        dest.writeInt(this.f64380z ? 1 : 0);
        ?? r10 = this.f64376E;
        dest.writeInt(r10.size());
        Iterator it = r10.iterator();
        while (it.hasNext()) {
            dest.writeString((String) it.next());
        }
    }
}
