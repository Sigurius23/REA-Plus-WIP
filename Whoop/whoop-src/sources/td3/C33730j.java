package td3;

import android.os.ParcelUuid;

/* JADX INFO: renamed from: td3.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C33730j {

    /* JADX INFO: renamed from: a */
    public String f141064a;

    /* JADX INFO: renamed from: b */
    public String f141065b;

    /* JADX INFO: renamed from: c */
    public ParcelUuid f141066c;

    /* JADX INFO: renamed from: d */
    public ParcelUuid f141067d;

    /* JADX INFO: renamed from: e */
    public ParcelUuid f141068e;

    /* JADX INFO: renamed from: f */
    public byte[] f141069f;

    /* JADX INFO: renamed from: g */
    public byte[] f141070g;

    /* JADX INFO: renamed from: h */
    public int f141071h = -1;

    /* JADX INFO: renamed from: i */
    public byte[] f141072i;

    /* JADX INFO: renamed from: j */
    public byte[] f141073j;

    /* JADX INFO: renamed from: a */
    public final void m106613a(int i13, byte[] bArr, byte[] bArr2) {
        if (bArr != null && i13 < 0) {
            throw new IllegalArgumentException("invalid manufacture id");
        }
        if (bArr2 != null) {
            if (bArr == null) {
                throw new IllegalArgumentException("manufacturerData is null while manufacturerDataMask is not null");
            }
            if (bArr.length != bArr2.length) {
                throw new IllegalArgumentException("size mismatch for manufacturerData and manufacturerDataMask");
            }
        }
        this.f141071h = i13;
        this.f141072i = bArr;
        this.f141073j = bArr2;
    }

    /* JADX INFO: renamed from: b */
    public final void m106614b(ParcelUuid parcelUuid, byte[] bArr, byte[] bArr2) {
        if (parcelUuid == null) {
            throw new IllegalArgumentException("serviceDataUuid is null");
        }
        if (bArr2 != null) {
            if (bArr == null) {
                throw new IllegalArgumentException("serviceData is null while serviceDataMask is not null");
            }
            if (bArr.length != bArr2.length) {
                throw new IllegalArgumentException("size mismatch for service data and service data mask");
            }
        }
        this.f141068e = parcelUuid;
        this.f141069f = bArr;
        this.f141070g = bArr2;
    }
}
