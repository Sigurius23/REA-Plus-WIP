package p076d;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import ro.C31624i;

/* JADX INFO: renamed from: d.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11324y0 extends AbstractC11272b1 {

    /* JADX INFO: renamed from: a */
    public final char[] f36279a;

    public C11324y0(char[] cArr) {
        this.f36279a = cArr;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        return C31624i.m97696b(this.f36279a.length * 2, z4);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        char[] cArr = this.f36279a;
        int length = cArr.length;
        c31624i.m97709n(30, z4);
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) c31624i.f130665x;
        c31624i.m97705d(length * 2);
        byte[] bArr = new byte[8];
        int i13 = length & (-4);
        int i14 = 0;
        while (i14 < i13) {
            char c3 = cArr[i14];
            char c7 = cArr[i14 + 1];
            char c14 = cArr[i14 + 2];
            char c15 = cArr[i14 + 3];
            i14 += 4;
            bArr[0] = (byte) (c3 >> '\b');
            bArr[1] = (byte) c3;
            bArr[2] = (byte) (c7 >> '\b');
            bArr[3] = (byte) c7;
            bArr[4] = (byte) (c14 >> '\b');
            bArr[5] = (byte) c14;
            bArr[6] = (byte) (c15 >> '\b');
            bArr[7] = (byte) c15;
            byteArrayOutputStream.write(bArr, 0, 8);
        }
        if (i14 < length) {
            int i15 = 0;
            do {
                char c16 = cArr[i14];
                i14++;
                int i16 = i15 + 1;
                bArr[i15] = (byte) (c16 >> '\b');
                i15 += 2;
                bArr[i16] = (byte) c16;
            } while (i14 < length);
            byteArrayOutputStream.write(bArr, 0, i15);
        }
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: g */
    public final boolean mo30474g(AbstractC11272b1 abstractC11272b1) {
        if (abstractC11272b1 instanceof C11324y0) {
            return Arrays.equals(this.f36279a, ((C11324y0) abstractC11272b1).f36279a);
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
        char[] cArr = this.f36279a;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i13 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i13;
            }
            i13 = (i13 * 257) ^ cArr[length];
        }
    }

    public final String toString() {
        return new String(this.f36279a);
    }
}
