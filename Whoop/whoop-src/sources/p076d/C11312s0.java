package p076d;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import ro.C31624i;
import s30.AbstractC32103e;

/* JADX INFO: renamed from: d.s0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11312s0 extends AbstractC11272b1 {

    /* JADX INFO: renamed from: c */
    public static final HashMap f36247c = new HashMap();

    /* JADX INFO: renamed from: a */
    public final byte[] f36248a;

    /* JADX INFO: renamed from: b */
    public String f36249b = null;

    public C11312s0(byte[] bArr) {
        this.f36248a = bArr;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        return C31624i.m97696b(this.f36248a.length, z4);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        c31624i.m97707f(6, z4, this.f36248a);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: g */
    public final boolean mo30474g(AbstractC11272b1 abstractC11272b1) {
        if (this == abstractC11272b1) {
            return true;
        }
        if (abstractC11272b1 instanceof C11312s0) {
            return Arrays.equals(this.f36248a, ((C11312s0) abstractC11272b1).f36248a);
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
        return AbstractC32103e.m99883e(this.f36248a);
    }

    public final String toString() {
        String str;
        synchronized (this) {
            try {
                if (this.f36249b == null) {
                    byte[] bArr = this.f36248a;
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
                                    if (j13 < 40) {
                                        stringBuffer.append('0');
                                    } else if (j13 < 80) {
                                        stringBuffer.append('1');
                                        j13 -= 40;
                                    } else {
                                        stringBuffer.append('2');
                                        j13 -= 80;
                                    }
                                    z4 = false;
                                }
                                stringBuffer.append('.');
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
                                    stringBuffer.append('2');
                                    bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                                    z4 = false;
                                }
                                stringBuffer.append('.');
                                stringBuffer.append(bigIntegerOr);
                                j7 = 0;
                                bigIntegerShiftLeft = null;
                            } else {
                                bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                            }
                        }
                    }
                    this.f36249b = stringBuffer.toString();
                }
                str = this.f36249b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return str;
    }
}
