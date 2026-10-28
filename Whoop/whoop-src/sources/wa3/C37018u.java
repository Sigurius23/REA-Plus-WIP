package wa3;

import androidx.datastore.preferences.protobuf.C1209e;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: wa3.u */
/* JADX INFO: loaded from: classes5.dex */
public class C37018u extends AbstractC36990e {

    /* JADX INFO: renamed from: x */
    public final byte[] f158387x;

    /* JADX INFO: renamed from: y */
    public int f158388y = 0;

    public C37018u(byte[] bArr) {
        this.f158387x = bArr;
    }

    @Override // wa3.AbstractC36990e
    /* JADX INFO: renamed from: e */
    public void mo118745e(int i13, int i14, int i15, byte[] bArr) {
        System.arraycopy(this.f158387x, i13, bArr, i14, i15);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC36990e) || size() != ((AbstractC36990e) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C37018u) {
            return m118831t((C37018u) obj, 0, size());
        }
        if (obj instanceof C37023z) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(AbstractC25012a.m73376i("Has a new type of ByteString been created? Found ", strValueOf, new StringBuilder(strValueOf.length() + 49)));
    }

    @Override // wa3.AbstractC36990e
    /* JADX INFO: renamed from: f */
    public final int mo118746f() {
        return 0;
    }

    @Override // wa3.AbstractC36990e
    /* JADX INFO: renamed from: g */
    public final boolean mo118747g() {
        return true;
    }

    public final int hashCode() {
        int iMo118749m = this.f158388y;
        if (iMo118749m == 0) {
            int size = size();
            iMo118749m = mo118749m(size, 0, size);
            if (iMo118749m == 0) {
                iMo118749m = 1;
            }
            this.f158388y = iMo118749m;
        }
        return iMo118749m;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C1209e(this);
    }

    @Override // wa3.AbstractC36990e
    /* JADX INFO: renamed from: j */
    public final boolean mo118748j() {
        byte[] bArr = this.f158387x;
        return AbstractC36989d0.m118740c(bArr, 0, bArr.length) == 0;
    }

    @Override // wa3.AbstractC36990e
    /* JADX INFO: renamed from: m */
    public final int mo118749m(int i13, int i14, int i15) {
        for (int i16 = i14; i16 < i14 + i15; i16++) {
            i13 = (i13 * 31) + this.f158387x[i16];
        }
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        if (r0[r8] > (-65)) goto L59;
     */
    @Override // wa3.AbstractC36990e
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo118750n(int r8, int r9, int r10) {
        /*
            r7 = this;
            int r10 = r10 + r9
            byte[] r0 = r7.f158387x
            if (r8 == 0) goto L95
            if (r9 < r10) goto L8
            return r8
        L8:
            byte r1 = (byte) r8
            r2 = -32
            r3 = -1
            r4 = -65
            if (r1 >= r2) goto L1f
            r8 = -62
            if (r1 < r8) goto L94
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r4) goto L1c
            goto L94
        L1c:
            r9 = r8
            goto L95
        L1f:
            r5 = -16
            if (r1 >= r5) goto L4c
            int r8 = r8 >> 8
            int r8 = ~r8
            byte r8 = (byte) r8
            if (r8 != 0) goto L37
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r8 < r10) goto L34
            int r8 = wa3.AbstractC36989d0.m118738a(r1, r9)
            return r8
        L34:
            r6 = r9
            r9 = r8
            r8 = r6
        L37:
            if (r8 > r4) goto L94
            r5 = -96
            if (r1 != r2) goto L3f
            if (r8 < r5) goto L94
        L3f:
            r2 = -19
            if (r1 != r2) goto L45
            if (r8 >= r5) goto L94
        L45:
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r4) goto L1c
            goto L94
        L4c:
            int r2 = r8 >> 8
            int r2 = ~r2
            byte r2 = (byte) r2
            if (r2 != 0) goto L5f
            int r8 = r9 + 1
            r2 = r0[r9]
            if (r8 < r10) goto L5d
            int r8 = wa3.AbstractC36989d0.m118738a(r1, r2)
            return r8
        L5d:
            r9 = 0
            goto L65
        L5f:
            int r8 = r8 >> 16
            byte r8 = (byte) r8
            r6 = r9
            r9 = r8
            r8 = r6
        L65:
            if (r9 != 0) goto L81
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r9 < r10) goto L7e
            r9 = -12
            if (r1 > r9) goto L7d
            if (r2 > r4) goto L7d
            if (r8 <= r4) goto L76
            goto L7d
        L76:
            int r9 = r2 << 8
            r9 = r9 ^ r1
            int r8 = r8 << 16
            r8 = r8 ^ r9
            return r8
        L7d:
            return r3
        L7e:
            r6 = r9
            r9 = r8
            r8 = r6
        L81:
            if (r2 > r4) goto L94
            int r1 = r1 << 28
            int r2 = r2 + 112
            int r2 = r2 + r1
            int r1 = r2 >> 30
            if (r1 != 0) goto L94
            if (r9 > r4) goto L94
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r8 <= r4) goto L95
        L94:
            return r3
        L95:
            int r8 = wa3.AbstractC36989d0.m118740c(r0, r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wa3.C37018u.mo118750n(int, int, int):int");
    }

    @Override // wa3.AbstractC36990e
    /* JADX INFO: renamed from: o */
    public final int mo118751o() {
        return this.f158388y;
    }

    @Override // wa3.AbstractC36990e
    /* JADX INFO: renamed from: p */
    public final String mo118752p() {
        byte[] bArr = this.f158387x;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // wa3.AbstractC36990e
    /* JADX INFO: renamed from: r */
    public final void mo118754r(OutputStream outputStream, int i13, int i14) throws IOException {
        outputStream.write(this.f158387x, i13, i14);
    }

    @Override // wa3.AbstractC36990e
    public int size() {
        return this.f158387x.length;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m118831t(C37018u c37018u, int i13, int i14) {
        byte[] bArr = c37018u.f158387x;
        int length = bArr.length;
        byte[] bArr2 = this.f158387x;
        if (i14 > length) {
            int length2 = bArr2.length;
            StringBuilder sb4 = new StringBuilder(40);
            sb4.append("Length too large: ");
            sb4.append(i14);
            sb4.append(length2);
            throw new IllegalArgumentException(sb4.toString());
        }
        if (i13 + i14 <= bArr.length) {
            int i15 = 0;
            while (i15 < i14) {
                if (bArr2[i15] != bArr[i13]) {
                    return false;
                }
                i15++;
                i13++;
            }
            return true;
        }
        int length3 = c37018u.f158387x.length;
        StringBuilder sb5 = new StringBuilder(59);
        sb5.append("Ran off end of other: ");
        sb5.append(i13);
        sb5.append(", ");
        sb5.append(i14);
        sb5.append(", ");
        sb5.append(length3);
        throw new IllegalArgumentException(sb5.toString());
    }
}
