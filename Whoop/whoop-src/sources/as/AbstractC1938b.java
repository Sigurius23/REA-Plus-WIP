package as;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import no.nordicsemi.android.dfu.DfuBaseService;
import p550vd.AbstractC35903f;

/* JADX INFO: renamed from: as.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC1938b {
    static {
        new C1937a(0);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m5939a(ArrayDeque arrayDeque, int i13) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i13) {
            return bArr;
        }
        int length = i13 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i13);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i13 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m5940b(InputStream inputStream) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(DfuBaseService.ERROR_REMOTE_MASK, Math.max(128, Integer.highestOneBit(0) * 2));
        int i13 = 0;
        while (i13 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i13);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i14 = 0;
            while (i14 < iMin2) {
                int i15 = inputStream.read(bArr, i14, iMin2 - i14);
                if (i15 == -1) {
                    return m5939a(arrayDeque, i13);
                }
                i14 += i15;
                i13 += i15;
            }
            iMin = AbstractC35903f.m113994L(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return m5939a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
