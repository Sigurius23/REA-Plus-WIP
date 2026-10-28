package p200hs;

import androidx.glance.appwidget.protobuf.AbstractC1400l;
import java.security.InvalidKeyException;

/* JADX INFO: renamed from: hs.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C17597i extends AbstractC1400l {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f68171c;

    public C17597i(byte[] bArr, int i13, int i14) throws InvalidKeyException {
        this.f68171c = i14;
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f5934b = AbstractC17595g.m50111e(bArr);
        this.f5933a = i13;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: f */
    public final int[] mo4427f(int[] iArr, int i13) {
        switch (this.f68171c) {
            case 0:
                if (iArr.length != 3) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = (int[]) this.f5934b;
                int[] iArr4 = AbstractC17595g.f68169a;
                System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
                iArr2[12] = i13;
                System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                return iArr2;
            default:
                if (iArr.length != 6) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr5 = new int[16];
                int[] iArrM50108b = AbstractC17595g.m50108b((int[]) this.f5934b, iArr);
                int[] iArr6 = AbstractC17595g.f68169a;
                System.arraycopy(iArr6, 0, iArr5, 0, iArr6.length);
                System.arraycopy(iArrM50108b, 0, iArr5, iArr6.length, 8);
                iArr5[12] = i13;
                iArr5[13] = 0;
                iArr5[14] = iArr[4];
                iArr5[15] = iArr[5];
                return iArr5;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: l */
    public final int mo4429l() {
        switch (this.f68171c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
