package nd3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1337q1;

/* JADX INFO: renamed from: nd3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C26591a implements Parcelable {

    /* JADX INFO: renamed from: w */
    public byte[] f105756w;

    /* JADX INFO: renamed from: x */
    public static final char[] f105755x = "0123456789ABCDEF".toCharArray();
    public static final Parcelable.Creator<C26591a> CREATOR = new C1337q1(7);

    public C26591a(byte[] bArr) {
        this.f105756w = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        byte[] bArr = this.f105756w;
        if ((bArr != null ? bArr.length : 0) == 0) {
            return "";
        }
        char[] cArr = new char[(bArr.length * 3) - 1];
        for (int i13 = 0; i13 < bArr.length; i13++) {
            byte b = bArr[i13];
            int i14 = i13 * 3;
            char[] cArr2 = f105755x;
            cArr[i14] = cArr2[(b & 255) >>> 4];
            cArr[i14 + 1] = cArr2[b & 15];
            if (i13 != bArr.length - 1) {
                cArr[i14 + 2] = '-';
            }
        }
        return "(0x) ".concat(new String(cArr));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeByteArray(this.f105756w);
    }
}
