package wa3;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: wa3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C36988d extends OutputStream {

    /* JADX INFO: renamed from: F */
    public static final byte[] f158313F = new byte[0];

    /* JADX INFO: renamed from: E */
    public int f158314E;

    /* JADX INFO: renamed from: y */
    public int f158317y;

    /* JADX INFO: renamed from: w */
    public final int f158315w = 128;

    /* JADX INFO: renamed from: x */
    public final ArrayList f158316x = new ArrayList();

    /* JADX INFO: renamed from: z */
    public byte[] f158318z = new byte[128];

    /* JADX INFO: renamed from: b */
    public final void m118735b(int i13) {
        this.f158316x.add(new C37018u(this.f158318z));
        int length = this.f158317y + this.f158318z.length;
        this.f158317y = length;
        this.f158318z = new byte[Math.max(this.f158315w, Math.max(i13, length >>> 1))];
        this.f158314E = 0;
    }

    /* JADX INFO: renamed from: h */
    public final void m118736h() {
        int i13 = this.f158314E;
        byte[] bArr = this.f158318z;
        int length = bArr.length;
        ArrayList arrayList = this.f158316x;
        if (i13 >= length) {
            arrayList.add(new C37018u(this.f158318z));
            this.f158318z = f158313F;
        } else if (i13 > 0) {
            byte[] bArr2 = new byte[i13];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i13));
            arrayList.add(new C37018u(bArr2));
        }
        this.f158317y += this.f158314E;
        this.f158314E = 0;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized AbstractC36990e m118737i() {
        ArrayList arrayList;
        m118736h();
        arrayList = this.f158316x;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((AbstractC36990e) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? AbstractC36990e.f158321w : AbstractC36990e.m118741a(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i13;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i13 = this.f158317y + this.f158314E;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i13));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i13) {
        try {
            if (this.f158314E == this.f158318z.length) {
                m118735b(1);
            }
            byte[] bArr = this.f158318z;
            int i14 = this.f158314E;
            this.f158314E = i14 + 1;
            bArr[i14] = (byte) i13;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i13, int i14) {
        try {
            byte[] bArr2 = this.f158318z;
            int length = bArr2.length;
            int i15 = this.f158314E;
            if (i14 <= length - i15) {
                System.arraycopy(bArr, i13, bArr2, i15, i14);
                this.f158314E += i14;
            } else {
                int length2 = bArr2.length - i15;
                System.arraycopy(bArr, i13, bArr2, i15, length2);
                int i16 = i14 - length2;
                m118735b(i16);
                System.arraycopy(bArr, i13 + length2, this.f158318z, 0, i16);
                this.f158314E = i16;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
