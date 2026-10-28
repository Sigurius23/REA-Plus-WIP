package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.r2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38940r2 implements InterfaceC38949s2 {
    public static final Parcelable.Creator<C38940r2> CREATOR = new C38992x0(29);

    /* JADX INFO: renamed from: E */
    public final EnumC38853i f167625E;

    /* JADX INFO: renamed from: F */
    public final String f167626F;

    /* JADX INFO: renamed from: w */
    public final String f167627w;

    /* JADX INFO: renamed from: x */
    public final int f167628x;

    /* JADX INFO: renamed from: y */
    public final int f167629y;

    /* JADX INFO: renamed from: z */
    public final String f167630z;

    public C38940r2(String str, int i13, int i14, String last4, EnumC38853i brand, String funding) {
        AbstractC22676k.m65750j(last4, "last4");
        AbstractC22676k.m65750j(brand, "brand");
        AbstractC22676k.m65750j(funding, "funding");
        this.f167627w = str;
        this.f167628x = i13;
        this.f167629y = i14;
        this.f167630z = last4;
        this.f167625E = brand;
        this.f167626F = funding;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38940r2)) {
            return false;
        }
        C38940r2 c38940r2 = (C38940r2) obj;
        return AbstractC22676k.m65745e(this.f167627w, c38940r2.f167627w) && this.f167628x == c38940r2.f167628x && this.f167629y == c38940r2.f167629y && AbstractC22676k.m65745e(this.f167630z, c38940r2.f167630z) && this.f167625E == c38940r2.f167625E && AbstractC22676k.m65745e(this.f167626F, c38940r2.f167626F);
    }

    @Override // y00.InterfaceC38949s2
    public final String getLast4() {
        return this.f167630z;
    }

    public final int hashCode() {
        String str = this.f167627w;
        return this.f167626F.hashCode() + ((this.f167625E.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.f167629y, AbstractC11266d.m30448b(this.f167628x, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31, this.f167630z)) * 31);
    }

    public final String toString() {
        StringBuilder sbM30467u = AbstractC11266d.m30467u(this.f167628x, "Card(nickname=", this.f167627w, ", expMonth=", ", expYear=");
        AbstractC11895b.m31979B(this.f167629y, ", last4=", this.f167630z, ", brand=", sbM30467u);
        sbM30467u.append(this.f167625E);
        sbM30467u.append(", funding=");
        sbM30467u.append(this.f167626F);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167627w);
        dest.writeInt(this.f167628x);
        dest.writeInt(this.f167629y);
        dest.writeString(this.f167630z);
        dest.writeString(this.f167625E.name());
        dest.writeString(this.f167626F);
    }
}
