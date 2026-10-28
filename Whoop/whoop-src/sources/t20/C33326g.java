package t20;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t20.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C33326g implements Parcelable {
    public static final Parcelable.Creator<C33326g> CREATOR = new C33320a(0);

    /* JADX INFO: renamed from: E */
    public final InterfaceC41211c f139007E;

    /* JADX INFO: renamed from: w */
    public final boolean f139008w;

    /* JADX INFO: renamed from: x */
    public final String f139009x;

    /* JADX INFO: renamed from: y */
    public final boolean f139010y;

    /* JADX INFO: renamed from: z */
    public final C33321b f139011z;

    public C33326g(boolean z4, String str, boolean z13, C33321b c33321b, InterfaceC41211c interfaceC41211c) {
        this.f139008w = z4;
        this.f139009x = str;
        this.f139010y = z13;
        this.f139011z = c33321b;
        this.f139007E = interfaceC41211c;
    }

    /* JADX INFO: renamed from: b */
    public static C33326g m105694b(C33326g c33326g, boolean z4, C33321b c33321b, int i13) {
        boolean z13 = c33326g.f139008w;
        String str = c33326g.f139009x;
        if ((i13 & 4) != 0) {
            z4 = c33326g.f139010y;
        }
        boolean z14 = z4;
        if ((i13 & 8) != 0) {
            c33321b = c33326g.f139011z;
        }
        C33321b c33321b2 = c33321b;
        InterfaceC41211c interfaceC41211c = (i13 & 16) != 0 ? c33326g.f139007E : null;
        c33326g.getClass();
        return new C33326g(z13, str, z14, c33321b2, interfaceC41211c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33326g)) {
            return false;
        }
        C33326g c33326g = (C33326g) obj;
        return this.f139008w == c33326g.f139008w && AbstractC22676k.m65745e(this.f139009x, c33326g.f139009x) && this.f139010y == c33326g.f139010y && AbstractC22676k.m65745e(this.f139011z, c33326g.f139011z) && AbstractC22676k.m65745e(this.f139007E, c33326g.f139007E);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f139008w) * 31;
        String str = this.f139009x;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f139010y);
        C33321b c33321b = this.f139011z;
        int iHashCode2 = (iM8289b + (c33321b == null ? 0 : c33321b.hashCode())) * 31;
        InterfaceC41211c interfaceC41211c = this.f139007E;
        return iHashCode2 + (interfaceC41211c != null ? interfaceC41211c.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM38567n = AbstractC13673n.m38567n("BankFormScreenState(isPaymentFlow=", ", promoText=", this.f139009x, ", _isProcessing=", this.f139008w);
        sbM38567n.append(this.f139010y);
        sbM38567n.append(", linkedBankAccount=");
        sbM38567n.append(this.f139011z);
        sbM38567n.append(", error=");
        sbM38567n.append(this.f139007E);
        sbM38567n.append(")");
        return sbM38567n.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f139008w ? 1 : 0);
        dest.writeString(this.f139009x);
        dest.writeInt(this.f139010y ? 1 : 0);
        C33321b c33321b = this.f139011z;
        if (c33321b == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c33321b.writeToParcel(dest, i13);
        }
        dest.writeParcelable(this.f139007E, i13);
    }
}
