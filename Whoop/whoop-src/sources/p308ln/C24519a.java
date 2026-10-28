package p308ln;

import android.os.Parcel;
import android.os.Parcelable;
import ed3.C13117a;
import in.InterfaceC18714b;
import java.util.Arrays;
import p000.AbstractC11266d;
import p266jz.C22060h;
import p309lo.AbstractC24567y;
import p465rm.C31548l0;
import p658yr.AbstractC39717d;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: ln.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C24519a implements InterfaceC18714b {
    public static final Parcelable.Creator<C24519a> CREATOR = new C22060h(22);

    /* JADX INFO: renamed from: E */
    public final int f95672E;

    /* JADX INFO: renamed from: F */
    public final int f95673F;

    /* JADX INFO: renamed from: G */
    public final int f95674G;

    /* JADX INFO: renamed from: H */
    public final byte[] f95675H;

    /* JADX INFO: renamed from: w */
    public final int f95676w;

    /* JADX INFO: renamed from: x */
    public final String f95677x;

    /* JADX INFO: renamed from: y */
    public final String f95678y;

    /* JADX INFO: renamed from: z */
    public final int f95679z;

    public C24519a(int i13, String str, String str2, int i14, int i15, int i16, int i17, byte[] bArr) {
        this.f95676w = i13;
        this.f95677x = str;
        this.f95678y = str2;
        this.f95679z = i14;
        this.f95672E = i15;
        this.f95673F = i16;
        this.f95674G = i17;
        this.f95675H = bArr;
    }

    /* JADX INFO: renamed from: b */
    public static C24519a m71426b(C13117a c13117a) {
        int iM36699i = c13117a.m36699i();
        String strM36712v = c13117a.m36712v(c13117a.m36699i(), AbstractC39717d.f170956a);
        String strM36712v2 = c13117a.m36712v(c13117a.m36699i(), AbstractC39717d.f170958c);
        int iM36699i2 = c13117a.m36699i();
        int iM36699i3 = c13117a.m36699i();
        int iM36699i4 = c13117a.m36699i();
        int iM36699i5 = c13117a.m36699i();
        int iM36699i6 = c13117a.m36699i();
        byte[] bArr = new byte[iM36699i6];
        c13117a.m36697g(bArr, 0, iM36699i6);
        return new C24519a(iM36699i, strM36712v, strM36712v2, iM36699i2, iM36699i3, iM36699i4, iM36699i5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C24519a.class == obj.getClass()) {
            C24519a c24519a = (C24519a) obj;
            if (this.f95676w == c24519a.f95676w && this.f95677x.equals(c24519a.f95677x) && this.f95678y.equals(c24519a.f95678y) && this.f95679z == c24519a.f95679z && this.f95672E == c24519a.f95672E && this.f95673F == c24519a.f95673F && this.f95674G == c24519a.f95674G && Arrays.equals(this.f95675H, c24519a.f95675H)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f95675H) + ((((((((AbstractC11266d.m30450d(AbstractC11266d.m30450d((527 + this.f95676w) * 31, 31, this.f95677x), 31, this.f95678y) + this.f95679z) * 31) + this.f95672E) * 31) + this.f95673F) * 31) + this.f95674G) * 31);
    }

    public final String toString() {
        String str = this.f95677x;
        int iM91832b = AbstractC30007c.m91832b(32, str);
        String str2 = this.f95678y;
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(iM91832b, str2));
        sb4.append("Picture: mimeType=");
        sb4.append(str);
        sb4.append(", description=");
        sb4.append(str2);
        return sb4.toString();
    }

    @Override // in.InterfaceC18714b
    /* JADX INFO: renamed from: w */
    public final void mo54416w(C31548l0 c31548l0) {
        c31548l0.m97148a(this.f95676w, this.f95675H);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f95676w);
        parcel.writeString(this.f95677x);
        parcel.writeString(this.f95678y);
        parcel.writeInt(this.f95679z);
        parcel.writeInt(this.f95672E);
        parcel.writeInt(this.f95673F);
        parcel.writeInt(this.f95674G);
        parcel.writeByteArray(this.f95675H);
    }

    public C24519a(Parcel parcel) {
        this.f95676w = parcel.readInt();
        String string = parcel.readString();
        int i13 = AbstractC24567y.f95875a;
        this.f95677x = string;
        this.f95678y = parcel.readString();
        this.f95679z = parcel.readInt();
        this.f95672E = parcel.readInt();
        this.f95673F = parcel.readInt();
        this.f95674G = parcel.readInt();
        this.f95675H = parcel.createByteArray();
    }
}
