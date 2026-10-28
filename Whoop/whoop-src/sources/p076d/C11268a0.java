package p076d;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import ro.C31624i;

/* JADX INFO: renamed from: d.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11268a0 extends AbstractC11322x0 {

    /* JADX INFO: renamed from: d */
    public final int f36183d;

    /* JADX INFO: renamed from: e */
    public final AbstractC11322x0[] f36184e;

    public C11268a0(byte[] bArr, AbstractC11322x0[] abstractC11322x0Arr) {
        super(bArr);
        this.f36184e = abstractC11322x0Arr;
        this.f36183d = 1000;
    }

    /* JADX INFO: renamed from: m */
    public static byte[] m30478m(AbstractC11322x0[] abstractC11322x0Arr) {
        int length = abstractC11322x0Arr.length;
        if (length == 0) {
            return AbstractC11322x0.f36276c;
        }
        if (length == 1) {
            return abstractC11322x0Arr[0].f36277a;
        }
        int length2 = 0;
        for (AbstractC11322x0 abstractC11322x0 : abstractC11322x0Arr) {
            length2 += abstractC11322x0.f36277a.length;
        }
        byte[] bArr = new byte[length2];
        int length3 = 0;
        for (AbstractC11322x0 abstractC11322x1 : abstractC11322x0Arr) {
            byte[] bArr2 = abstractC11322x1.f36277a;
            System.arraycopy(bArr2, 0, bArr, length3, bArr2.length);
            length3 += bArr2.length;
        }
        return bArr;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        int iMo30479c = z4 ? 4 : 3;
        AbstractC11322x0[] abstractC11322x0Arr = this.f36184e;
        if (abstractC11322x0Arr != null) {
            for (AbstractC11322x0 abstractC11322x0 : abstractC11322x0Arr) {
                iMo30479c += abstractC11322x0.mo30479c(true);
            }
            return iMo30479c;
        }
        byte[] bArr = this.f36277a;
        int length = bArr.length;
        int i13 = this.f36183d;
        int i14 = length / i13;
        int iM97696b = (C31624i.m97696b(i13, true) * i14) + iMo30479c;
        int length2 = bArr.length - (i14 * i13);
        return length2 > 0 ? C31624i.m97696b(length2, true) + iM97696b : iM97696b;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        c31624i.m97709n(36, z4);
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) c31624i.f130665x;
        byteArrayOutputStream.write(128);
        AbstractC11322x0[] abstractC11322x0Arr = this.f36184e;
        if (abstractC11322x0Arr == null) {
            int i13 = 0;
            while (true) {
                byte[] bArr = this.f36277a;
                if (i13 >= bArr.length) {
                    break;
                }
                int iMin = Math.min(bArr.length - i13, this.f36183d);
                c31624i.m97709n(4, true);
                c31624i.m97705d(iMin);
                byteArrayOutputStream.write(bArr, i13, iMin);
                i13 += iMin;
            }
        } else {
            c31624i.mo30517j(abstractC11322x0Arr);
        }
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: h */
    public final boolean mo30475h() {
        return true;
    }
}
