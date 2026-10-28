package p076d;

import java.io.IOException;
import java.util.Arrays;
import ro.C31624i;
import s30.AbstractC32103e;

/* JADX INFO: renamed from: d.i0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11292i0 extends AbstractC11272b1 {

    /* JADX INFO: renamed from: b */
    public static final char[] f36220b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public final byte[] f36221a;

    public C11292i0(byte[] bArr) {
        this.f36221a = bArr;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        return C31624i.m97696b(this.f36221a.length, z4);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        c31624i.m97707f(28, z4, this.f36221a);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: g */
    public final boolean mo30474g(AbstractC11272b1 abstractC11272b1) {
        if (abstractC11272b1 instanceof C11292i0) {
            return Arrays.equals(this.f36221a, ((C11292i0) abstractC11272b1).f36221a);
        }
        return false;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ boolean mo30475h() {
        return false;
    }

    @Override // p076d.AbstractC11272b1
    public final int hashCode() {
        return AbstractC32103e.m99883e(this.f36221a);
    }

    public final String toString() {
        int i13;
        int i14;
        byte[] bArr = this.f36221a;
        int length = bArr.length;
        if (length >= 128) {
            int i15 = length;
            i13 = 2;
            while (true) {
                i15 >>>= 8;
                if (i15 == 0) {
                    break;
                }
                i13++;
            }
        } else {
            i13 = 1;
        }
        StringBuffer stringBuffer = new StringBuffer(((i13 + length) * 2) + 3);
        stringBuffer.append("#1C");
        char[] cArr = f36220b;
        if (length < 128) {
            stringBuffer.append(cArr[(length >>> 4) & 15]);
            stringBuffer.append(cArr[length & 15]);
        } else {
            byte[] bArr2 = new byte[5];
            int i16 = length;
            int i17 = 5;
            while (true) {
                i14 = i17 - 1;
                bArr2[i14] = (byte) i16;
                i16 >>>= 8;
                if (i16 == 0) {
                    break;
                }
                i17 = i14;
            }
            int i18 = i17 - 2;
            bArr2[i18] = (byte) (128 | (5 - i14));
            while (true) {
                int i19 = i18 + 1;
                byte b = bArr2[i18];
                stringBuffer.append(cArr[(b >>> 4) & 15]);
                stringBuffer.append(cArr[b & 15]);
                if (i19 >= 5) {
                    break;
                }
                i18 = i19;
            }
        }
        for (byte b6 : bArr) {
            stringBuffer.append(cArr[(b6 >>> 4) & 15]);
            stringBuffer.append(cArr[b6 & 15]);
        }
        return stringBuffer.toString();
    }
}
