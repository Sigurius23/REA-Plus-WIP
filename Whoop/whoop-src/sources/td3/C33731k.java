package td3;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.Arrays;
import p474s.AbstractC32004s;
import p486sp.C32854e;

/* JADX INFO: renamed from: td3.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C33731k implements Parcelable {
    public static final Parcelable.Creator<C33731k> CREATOR = new C32854e(8);

    /* JADX INFO: renamed from: E */
    public final ParcelUuid f141074E;

    /* JADX INFO: renamed from: F */
    public final byte[] f141075F;

    /* JADX INFO: renamed from: G */
    public final byte[] f141076G;

    /* JADX INFO: renamed from: H */
    public final int f141077H;

    /* JADX INFO: renamed from: I */
    public final byte[] f141078I;

    /* JADX INFO: renamed from: J */
    public final byte[] f141079J;

    /* JADX INFO: renamed from: w */
    public final String f141080w;

    /* JADX INFO: renamed from: x */
    public final String f141081x;

    /* JADX INFO: renamed from: y */
    public final ParcelUuid f141082y;

    /* JADX INFO: renamed from: z */
    public final ParcelUuid f141083z;

    public C33731k(String str, String str2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i13, byte[] bArr3, byte[] bArr4) {
        this.f141080w = str;
        this.f141082y = parcelUuid;
        this.f141083z = parcelUuid2;
        this.f141081x = str2;
        this.f141074E = parcelUuid3;
        this.f141075F = bArr;
        this.f141076G = bArr2;
        this.f141077H = i13;
        this.f141078I = bArr3;
        this.f141079J = bArr4;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m106615b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            if (bArr3 != null) {
                return true;
            }
        } else if (bArr3 != null && bArr3.length >= bArr.length) {
            if (bArr2 == null) {
                for (int i13 = 0; i13 < bArr.length; i13++) {
                    if (bArr3[i13] == bArr[i13]) {
                    }
                }
                return true;
            }
            for (int i14 = 0; i14 < bArr.length; i14++) {
                byte b = bArr2[i14];
                if ((bArr3[i14] & b) == (b & bArr[i14])) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C33731k.class == obj.getClass()) {
            C33731k c33731k = (C33731k) obj;
            if (AbstractC32004s.m99541j(this.f141080w, c33731k.f141080w) && AbstractC32004s.m99541j(this.f141081x, c33731k.f141081x) && this.f141077H == c33731k.f141077H && AbstractC32004s.m99540i(this.f141078I, c33731k.f141078I) && AbstractC32004s.m99540i(this.f141079J, c33731k.f141079J) && AbstractC32004s.m99541j(this.f141074E, c33731k.f141074E) && AbstractC32004s.m99540i(this.f141075F, c33731k.f141075F) && AbstractC32004s.m99540i(this.f141076G, c33731k.f141076G) && AbstractC32004s.m99541j(this.f141082y, c33731k.f141082y) && AbstractC32004s.m99541j(this.f141083z, c33731k.f141083z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f141080w, this.f141081x, Integer.valueOf(this.f141077H), Integer.valueOf(Arrays.hashCode(this.f141078I)), Integer.valueOf(Arrays.hashCode(this.f141079J)), this.f141074E, Integer.valueOf(Arrays.hashCode(this.f141075F)), Integer.valueOf(Arrays.hashCode(this.f141076G)), this.f141082y, this.f141083z});
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("BluetoothLeScanFilter [deviceName=");
        sb4.append(this.f141080w);
        sb4.append(", deviceAddress=");
        sb4.append(this.f141081x);
        sb4.append(", mUuid=");
        sb4.append(this.f141082y);
        sb4.append(", uuidMask=");
        sb4.append(this.f141083z);
        sb4.append(", serviceDataUuid=");
        ParcelUuid parcelUuid = this.f141074E;
        sb4.append(parcelUuid == null ? "null" : parcelUuid.toString());
        sb4.append(", serviceData=");
        sb4.append(Arrays.toString(this.f141075F));
        sb4.append(", serviceDataMask=");
        sb4.append(Arrays.toString(this.f141076G));
        sb4.append(", manufacturerId=");
        sb4.append(this.f141077H);
        sb4.append(", manufacturerData=");
        sb4.append(Arrays.toString(this.f141078I));
        sb4.append(", manufacturerDataMask=");
        sb4.append(Arrays.toString(this.f141079J));
        sb4.append("]");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        String str = this.f141080w;
        parcel.writeInt(str == null ? 0 : 1);
        if (str != null) {
            parcel.writeString(str);
        }
        String str2 = this.f141081x;
        parcel.writeInt(str2 == null ? 0 : 1);
        if (str2 != null) {
            parcel.writeString(str2);
        }
        ParcelUuid parcelUuid = this.f141082y;
        parcel.writeInt(parcelUuid == null ? 0 : 1);
        if (parcelUuid != null) {
            parcel.writeParcelable(parcelUuid, i13);
            ParcelUuid parcelUuid2 = this.f141083z;
            parcel.writeInt(parcelUuid2 == null ? 0 : 1);
            if (parcelUuid2 != null) {
                parcel.writeParcelable(parcelUuid2, i13);
            }
        }
        ParcelUuid parcelUuid3 = this.f141074E;
        parcel.writeInt(parcelUuid3 == null ? 0 : 1);
        if (parcelUuid3 != null) {
            parcel.writeParcelable(parcelUuid3, i13);
            byte[] bArr = this.f141075F;
            parcel.writeInt(bArr == null ? 0 : 1);
            if (bArr != null) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(bArr);
                byte[] bArr2 = this.f141076G;
                parcel.writeInt(bArr2 == null ? 0 : 1);
                if (bArr2 != null) {
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(bArr2);
                }
            }
        }
        parcel.writeInt(this.f141077H);
        byte[] bArr3 = this.f141078I;
        parcel.writeInt(bArr3 == null ? 0 : 1);
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            parcel.writeByteArray(bArr3);
            byte[] bArr4 = this.f141079J;
            parcel.writeInt(bArr4 == null ? 0 : 1);
            if (bArr4 != null) {
                parcel.writeInt(bArr4.length);
                parcel.writeByteArray(bArr4);
            }
        }
    }
}
