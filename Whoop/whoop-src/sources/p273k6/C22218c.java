package p273k6;

import android.util.Log;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: k6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C22218c {

    /* JADX INFO: renamed from: a */
    public final int f86577a;

    /* JADX INFO: renamed from: b */
    public final int f86578b;

    /* JADX INFO: renamed from: c */
    public final long f86579c;

    /* JADX INFO: renamed from: d */
    public final byte[] f86580d;

    public C22218c(byte[] bArr, int i13, int i14) {
        this(-1L, bArr, i13, i14);
    }

    /* JADX INFO: renamed from: a */
    public static C22218c m63678a(long j7, ByteOrder byteOrder) {
        long[] jArr = {j7};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C22222g.f86589C[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C22218c(byteBufferWrap.array(), 4, 1);
    }

    /* JADX INFO: renamed from: b */
    public static C22218c m63679b(C22220e c22220e, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C22222g.f86589C[5]]);
        byteBufferWrap.order(byteOrder);
        C22220e c22220e2 = new C22220e[]{c22220e}[0];
        byteBufferWrap.putInt((int) c22220e2.f86585a);
        byteBufferWrap.putInt((int) c22220e2.f86586b);
        return new C22218c(byteBufferWrap.array(), 5, 1);
    }

    /* JADX INFO: renamed from: c */
    public static C22218c m63680c(int i13, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C22222g.f86589C[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i13}[0]);
        return new C22218c(byteBufferWrap.array(), 3, 1);
    }

    /* JADX INFO: renamed from: d */
    public final double m63681d(ByteOrder byteOrder) throws Throwable {
        Object objM63684g = m63684g(byteOrder);
        if (objM63684g == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM63684g instanceof String) {
            return Double.parseDouble((String) objM63684g);
        }
        if (objM63684g instanceof long[]) {
            long[] jArr = (long[]) objM63684g;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM63684g instanceof int[]) {
            int[] iArr = (int[]) objM63684g;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM63684g instanceof double[]) {
            double[] dArr = (double[]) objM63684g;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM63684g instanceof C22220e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C22220e[] c22220eArr = (C22220e[]) objM63684g;
        if (c22220eArr.length == 1) {
            return c22220eArr[0].m63685a();
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: e */
    public final int m63682e(ByteOrder byteOrder) throws Throwable {
        Object objM63684g = m63684g(byteOrder);
        if (objM63684g == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM63684g instanceof String) {
            return Integer.parseInt((String) objM63684g);
        }
        if (objM63684g instanceof long[]) {
            long[] jArr = (long[]) objM63684g;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM63684g instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM63684g;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: f */
    public final String m63683f(ByteOrder byteOrder) throws Throwable {
        Object objM63684g = m63684g(byteOrder);
        if (objM63684g == null) {
            return null;
        }
        if (objM63684g instanceof String) {
            return (String) objM63684g;
        }
        StringBuilder sb4 = new StringBuilder();
        int i13 = 0;
        if (objM63684g instanceof long[]) {
            long[] jArr = (long[]) objM63684g;
            while (i13 < jArr.length) {
                sb4.append(jArr[i13]);
                i13++;
                if (i13 != jArr.length) {
                    sb4.append(",");
                }
            }
            return sb4.toString();
        }
        if (objM63684g instanceof int[]) {
            int[] iArr = (int[]) objM63684g;
            while (i13 < iArr.length) {
                sb4.append(iArr[i13]);
                i13++;
                if (i13 != iArr.length) {
                    sb4.append(",");
                }
            }
            return sb4.toString();
        }
        if (objM63684g instanceof double[]) {
            double[] dArr = (double[]) objM63684g;
            while (i13 < dArr.length) {
                sb4.append(dArr[i13]);
                i13++;
                if (i13 != dArr.length) {
                    sb4.append(",");
                }
            }
            return sb4.toString();
        }
        if (!(objM63684g instanceof C22220e[])) {
            return null;
        }
        C22220e[] c22220eArr = (C22220e[]) objM63684g;
        while (i13 < c22220eArr.length) {
            sb4.append(c22220eArr[i13].f86585a);
            sb4.append('/');
            sb4.append(c22220eArr[i13].f86586b);
            i13++;
            if (i13 != c22220eArr.length) {
                sb4.append(",");
            }
        }
        return sb4.toString();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:17:0x0032 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r14v25, types: [k6.e[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [k6.e[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    /* JADX INFO: renamed from: g */
    public final Serializable m63684g(ByteOrder byteOrder) throws Throwable {
        C22217b c22217b;
        InputStream inputStream;
        ?? str;
        byte b;
        byte[] bArr = this.f86580d;
        InputStream inputStream2 = null;
        try {
            try {
                c22217b = new C22217b(bArr);
                try {
                    c22217b.f86575y = byteOrder;
                    int i13 = this.f86577a;
                    int length = 0;
                    int i14 = this.f86578b;
                    switch (i13) {
                        case 1:
                        case 6:
                            if (bArr.length == 1 && (b = bArr[0]) >= 0 && b <= 1) {
                                String str2 = new String(new char[]{(char) (b + 48)});
                                try {
                                    c22217b.close();
                                    return str2;
                                } catch (IOException e5) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                                    return str2;
                                }
                            }
                            str = new String(bArr, C22222g.f86598L);
                            break;
                            break;
                        case 2:
                        case 7:
                            if (i14 >= C22222g.f86590D.length) {
                                int i15 = 0;
                                while (true) {
                                    byte[] bArr2 = C22222g.f86590D;
                                    if (i15 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i15] == bArr2[i15]) {
                                        i15++;
                                    }
                                }
                            }
                            StringBuilder sb4 = new StringBuilder();
                            while (length < i14) {
                                byte b6 = bArr[length];
                                if (b6 == 0) {
                                    str = sb4.toString();
                                } else {
                                    if (b6 >= 32) {
                                        sb4.append((char) b6);
                                    } else {
                                        sb4.append('?');
                                    }
                                    length++;
                                }
                                break;
                            }
                            str = sb4.toString();
                            break;
                        case 3:
                            str = new int[i14];
                            while (length < i14) {
                                str[length] = c22217b.readUnsignedShort();
                                length++;
                            }
                            break;
                        case 4:
                            str = new long[i14];
                            while (length < i14) {
                                str[length] = ((long) c22217b.readInt()) & 4294967295L;
                                length++;
                            }
                            break;
                        case 5:
                            str = new C22220e[i14];
                            while (length < i14) {
                                str[length] = new C22220e(((long) c22217b.readInt()) & 4294967295L, ((long) c22217b.readInt()) & 4294967295L);
                                length++;
                            }
                            break;
                        case 8:
                            str = new int[i14];
                            while (length < i14) {
                                str[length] = c22217b.readShort();
                                length++;
                            }
                            break;
                        case 9:
                            str = new int[i14];
                            while (length < i14) {
                                str[length] = c22217b.readInt();
                                length++;
                            }
                            break;
                        case 10:
                            str = new C22220e[i14];
                            while (length < i14) {
                                str[length] = new C22220e(c22217b.readInt(), c22217b.readInt());
                                length++;
                            }
                            break;
                        case 11:
                            str = new double[i14];
                            while (length < i14) {
                                str[length] = c22217b.readFloat();
                                length++;
                            }
                            break;
                        case 12:
                            str = new double[i14];
                            while (length < i14) {
                                str[length] = c22217b.readDouble();
                                length++;
                            }
                            break;
                        default:
                            try {
                                c22217b.close();
                                return null;
                            } catch (IOException e13) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                return null;
                            }
                    }
                    try {
                        c22217b.close();
                        return str;
                    } catch (IOException e14) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                        return str;
                    }
                } catch (IOException e15) {
                    e = e15;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (c22217b != null) {
                        try {
                            c22217b.close();
                        } catch (IOException e16) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                        }
                    }
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e17) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                    }
                }
                throw th;
            }
        } catch (IOException e18) {
            e = e18;
            c22217b = null;
        } catch (Throwable th4) {
            th = th4;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("(");
        sb4.append(C22222g.f86588B[this.f86577a]);
        sb4.append(", data length:");
        return AbstractC18489d0.m53371l(sb4, this.f86580d.length, ")");
    }

    public C22218c(long j7, byte[] bArr, int i13, int i14) {
        this.f86577a = i13;
        this.f86578b = i14;
        this.f86579c = j7;
        this.f86580d = bArr;
    }
}
