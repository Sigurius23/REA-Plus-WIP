package p076d;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import ro.C31624i;
import s30.AbstractC32103e;

/* JADX INFO: renamed from: d.d1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11278d1 extends AbstractC11272b1 {

    /* JADX INFO: renamed from: c */
    public static final HashMap f36198c = new HashMap();

    /* JADX INFO: renamed from: a */
    public final byte[] f36199a;

    /* JADX INFO: renamed from: b */
    public String f36200b = null;

    public C11278d1(byte[] bArr) {
        this.f36199a = bArr;
    }

    /* JADX INFO: renamed from: l */
    public static C11278d1 m30488l(byte[] bArr) {
        if (bArr.length > 4096) {
            throw new IllegalArgumentException("exceeded relative OID contents length limit");
        }
        C11306p0 c11306p0 = new C11306p0(bArr);
        HashMap map = f36198c;
        synchronized (map) {
            try {
                C11278d1 c11278d1 = (C11278d1) map.get(c11306p0);
                if (c11278d1 != null) {
                    return c11278d1;
                }
                if (m30489m(bArr)) {
                    return new C11278d1((byte[]) bArr.clone());
                }
                throw new IllegalArgumentException("invalid relative OID contents");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m30489m(byte[] bArr) {
        if (bArr.length >= 1) {
            boolean z4 = true;
            for (int i13 = 0; i13 < bArr.length; i13++) {
                if (!z4 || (bArr[i13] & 255) != 128) {
                    z4 = (bArr[i13] & 128) == 0;
                }
            }
            return z4;
        }
        return false;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        return C31624i.m97696b(this.f36199a.length, z4);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        c31624i.m97707f(13, z4, this.f36199a);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: g */
    public final boolean mo30474g(AbstractC11272b1 abstractC11272b1) {
        if (this == abstractC11272b1) {
            return true;
        }
        if (abstractC11272b1 instanceof C11278d1) {
            return Arrays.equals(this.f36199a, ((C11278d1) abstractC11272b1).f36199a);
        }
        return false;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: h */
    public final boolean mo30475h() {
        return false;
    }

    @Override // p076d.AbstractC11272b1
    public final int hashCode() {
        return AbstractC32103e.m99883e(this.f36199a);
    }

    public final String toString() {
        String str;
        synchronized (this) {
            try {
                if (this.f36200b == null) {
                    byte[] bArr = this.f36199a;
                    StringBuffer stringBuffer = new StringBuffer();
                    boolean z4 = true;
                    long j7 = 0;
                    BigInteger bigIntegerShiftLeft = null;
                    for (int i13 = 0; i13 != bArr.length; i13++) {
                        byte b = bArr[i13];
                        if (j7 <= 72057594037927808L) {
                            long j13 = j7 + ((long) (b & 127));
                            if ((b & 128) == 0) {
                                if (z4) {
                                    z4 = false;
                                } else {
                                    stringBuffer.append('.');
                                }
                                stringBuffer.append(j13);
                                j7 = 0;
                            } else {
                                j7 = j13 << 7;
                            }
                        } else {
                            if (bigIntegerShiftLeft == null) {
                                bigIntegerShiftLeft = BigInteger.valueOf(j7);
                            }
                            BigInteger bigIntegerOr = bigIntegerShiftLeft.or(BigInteger.valueOf(b & 127));
                            if ((b & 128) == 0) {
                                if (z4) {
                                    z4 = false;
                                } else {
                                    stringBuffer.append('.');
                                }
                                stringBuffer.append(bigIntegerOr);
                                j7 = 0;
                                bigIntegerShiftLeft = null;
                            } else {
                                bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                            }
                        }
                    }
                    this.f36200b = stringBuffer.toString();
                }
                str = this.f36200b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return str;
    }
}
