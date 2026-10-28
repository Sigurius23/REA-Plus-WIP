package p076d;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import ro.C31624i;

/* JADX INFO: renamed from: d.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C11313t extends AbstractC11285g {

    /* JADX INFO: renamed from: d */
    public final int f36250d;

    /* JADX INFO: renamed from: e */
    public final AbstractC11285g[] f36251e;

    public C11313t(byte[] bArr, int i13) {
        super(bArr, i13);
        this.f36251e = null;
        this.f36250d = 1000;
    }

    /* JADX INFO: renamed from: m */
    public static byte[] m30527m(AbstractC11285g[] abstractC11285gArr) {
        int length = abstractC11285gArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return abstractC11285gArr[0].f36207a;
        }
        int i13 = length - 1;
        int length2 = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            byte[] bArr = abstractC11285gArr[i14].f36207a;
            if (bArr[0] != 0) {
                throw new IllegalArgumentException("only the last nested bitstring can have padding");
            }
            length2 += bArr.length - 1;
        }
        byte[] bArr2 = abstractC11285gArr[i13].f36207a;
        byte b = bArr2[0];
        byte[] bArr3 = new byte[length2 + bArr2.length];
        bArr3[0] = b;
        int i15 = 1;
        for (AbstractC11285g abstractC11285g : abstractC11285gArr) {
            byte[] bArr4 = abstractC11285g.f36207a;
            int length3 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i15, length3);
            i15 += length3;
        }
        return bArr3;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        boolean zMo30475h = mo30475h();
        byte[] bArr = this.f36207a;
        if (!zMo30475h) {
            return C31624i.m97696b(bArr.length, z4);
        }
        int iMo30479c = z4 ? 4 : 3;
        AbstractC11285g[] abstractC11285gArr = this.f36251e;
        if (abstractC11285gArr != null) {
            for (AbstractC11285g abstractC11285g : abstractC11285gArr) {
                iMo30479c += abstractC11285g.mo30479c(true);
            }
            return iMo30479c;
        }
        if (bArr.length < 2) {
            return iMo30479c;
        }
        int length = bArr.length - 2;
        int i13 = this.f36250d;
        int i14 = i13 - 1;
        int i15 = length / i14;
        return C31624i.m97696b(bArr.length - (i14 * i15), true) + (C31624i.m97696b(i13, true) * i15) + iMo30479c;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        boolean zMo30475h = mo30475h();
        byte[] bArr = this.f36207a;
        if (!zMo30475h) {
            int length = bArr.length;
            c31624i.m97709n(3, z4);
            c31624i.m97705d(length);
            ((ByteArrayOutputStream) c31624i.f130665x).write(bArr, 0, length);
            return;
        }
        c31624i.m97709n(35, z4);
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) c31624i.f130665x;
        byteArrayOutputStream.write(128);
        AbstractC11285g[] abstractC11285gArr = this.f36251e;
        if (abstractC11285gArr != null) {
            c31624i.mo30517j(abstractC11285gArr);
        } else if (bArr.length >= 2) {
            byte b = bArr[0];
            int length2 = bArr.length;
            int i13 = length2 - 1;
            int i14 = this.f36250d;
            int i15 = i14 - 1;
            while (i13 > i15) {
                c31624i.m97709n(3, true);
                c31624i.m97705d(i14);
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(bArr, length2 - i13, i15);
                i13 -= i15;
            }
            c31624i.m97709n(3, true);
            c31624i.m97705d(i13 + 1);
            byteArrayOutputStream.write(b);
            byteArrayOutputStream.write(bArr, length2 - i13, i13);
        }
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: h */
    public final boolean mo30475h() {
        return this.f36251e != null || this.f36207a.length > this.f36250d;
    }

    public C11313t(AbstractC11285g[] abstractC11285gArr) {
        super(m30527m(abstractC11285gArr));
        this.f36251e = abstractC11285gArr;
        this.f36250d = 1000;
    }
}
