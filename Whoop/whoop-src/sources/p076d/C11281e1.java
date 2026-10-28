package p076d;

import java.io.IOException;
import p582wg.AbstractC37250c;
import ro.C31624i;

/* JADX INFO: renamed from: d.e1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11281e1 extends C11274c0 {
    @Override // p076d.C11274c0, p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        return C31624i.m97696b(m30492m().length, z4);
    }

    @Override // p076d.C11274c0, p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        c31624i.m97707f(24, z4, m30492m());
    }

    @Override // p076d.C11274c0, p076d.AbstractC11272b1
    /* JADX INFO: renamed from: j */
    public final AbstractC11272b1 mo30476j() {
        return this;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: k */
    public final AbstractC11272b1 mo30477k() {
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final byte[] m30492m() {
        byte[] bArr = this.f36190a;
        if (bArr[bArr.length - 1] != 90) {
            return bArr;
        }
        if (!m30485l(10) || !m30485l(11)) {
            byte[] bArr2 = new byte[bArr.length + 4];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length - 1);
            int i13 = AbstractC37250c.f159367a;
            byte[] bArr3 = new byte[5];
            for (int i14 = 0; i14 != 5; i14++) {
                bArr3[i14] = (byte) "0000Z".charAt(i14);
            }
            System.arraycopy(bArr3, 0, bArr2, bArr.length - 1, 5);
            return bArr2;
        }
        if (!m30485l(12) || !m30485l(13)) {
            byte[] bArr4 = new byte[bArr.length + 2];
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length - 1);
            int i15 = AbstractC37250c.f159367a;
            byte[] bArr5 = new byte[3];
            for (int i16 = 0; i16 != 3; i16++) {
                bArr5[i16] = (byte) "00Z".charAt(i16);
            }
            System.arraycopy(bArr5, 0, bArr4, bArr.length - 1, 3);
            return bArr4;
        }
        for (int i17 = 0; i17 != bArr.length; i17++) {
            if (bArr[i17] == 46 && i17 == 14) {
                int length = bArr.length - 2;
                while (length > 0 && bArr[length] == 48) {
                    length--;
                }
                if (bArr[length] == 46) {
                    byte[] bArr6 = new byte[length + 1];
                    System.arraycopy(bArr, 0, bArr6, 0, length);
                    bArr6[length] = 90;
                    return bArr6;
                }
                byte[] bArr7 = new byte[length + 2];
                int i18 = length + 1;
                System.arraycopy(bArr, 0, bArr7, 0, i18);
                bArr7[i18] = 90;
                return bArr7;
            }
        }
        return bArr;
    }
}
