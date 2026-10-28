package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p319m4.AbstractC25012a;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wz.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37700a0 implements Parcelable {
    public static final Parcelable.Creator<C37700a0> CREATOR = new C37677f(7);

    /* JADX INFO: renamed from: w */
    public final long f161555w;

    /* JADX INFO: renamed from: x */
    public final long f161556x;

    /* JADX INFO: renamed from: y */
    public final long f161557y;

    public C37700a0(long j7, long j13, long j14) {
        this.f161555w = j7;
        this.f161556x = j13;
        this.f161557y = j14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37700a0)) {
            return false;
        }
        C37700a0 c37700a0 = (C37700a0) obj;
        return C17919x.m51542d(this.f161555w, c37700a0.f161555w) && C17919x.m51542d(this.f161556x, c37700a0.f161556x) && C17919x.m51542d(this.f161557y, c37700a0.f161557y);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f161557y) + AbstractC11266d.m30451e(Long.hashCode(this.f161555w) * 31, this.f161556x, 31);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(C17919x.m51548j(this.f161557y), ")", AbstractC11895b.m32001t("Colors(primary=", C17919x.m51548j(this.f161555w), ", contentOnPrimary=", C17919x.m51548j(this.f161556x), ", borderSelected="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(AbstractC17918w0.m51506H(this.f161555w));
        dest.writeInt(AbstractC17918w0.m51506H(this.f161556x));
        dest.writeInt(AbstractC17918w0.m51506H(this.f161557y));
    }
}
