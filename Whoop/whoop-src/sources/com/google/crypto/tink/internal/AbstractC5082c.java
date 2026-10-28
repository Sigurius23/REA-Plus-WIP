package com.google.crypto.tink.internal;

import java.lang.reflect.Array;
import java.math.BigInteger;
import p078d1.C11457j;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5082c {

    /* JADX INFO: renamed from: a */
    public static final long[] f21395a;

    /* JADX INFO: renamed from: b */
    public static final C5080b[][] f21396b;

    /* JADX INFO: renamed from: c */
    public static final C5080b[] f21397c;

    /* JADX INFO: renamed from: d */
    public static final BigInteger f21398d;

    /* JADX INFO: renamed from: e */
    public static final BigInteger f21399e;

    /* JADX INFO: renamed from: f */
    public static final BigInteger f21400f;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f21398d = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        f21399e = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f21400f = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        C11457j c11457j = new C11457j(8, false);
        BigInteger bigIntegerMod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        c11457j.f36754y = bigIntegerMod3;
        BigInteger bigIntegerMultiply = bigIntegerMod3.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerMod3.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        c11457j.f36753x = bigIntegerModPow2;
        f21395a = AbstractC5078a.m15933f(m15956c(bigIntegerMod));
        AbstractC5078a.m15933f(m15956c(bigIntegerMod2));
        AbstractC5078a.m15933f(m15956c(bigIntegerModPow));
        f21396b = (C5080b[][]) Array.newInstance((Class<?>) C5080b.class, 32, 8);
        C11457j c11457jM15954a = c11457j;
        for (int i13 = 0; i13 < 32; i13++) {
            C11457j c11457jM15954a2 = c11457jM15954a;
            for (int i14 = 0; i14 < 8; i14++) {
                f21396b[i13][i14] = m15955b(c11457jM15954a2);
                c11457jM15954a2 = m15954a(c11457jM15954a2, c11457jM15954a);
            }
            for (int i15 = 0; i15 < 8; i15++) {
                c11457jM15954a = m15954a(c11457jM15954a, c11457jM15954a);
            }
        }
        C11457j c11457jM15954a3 = m15954a(c11457j, c11457j);
        f21397c = new C5080b[8];
        for (int i16 = 0; i16 < 8; i16++) {
            f21397c[i16] = m15955b(c11457j);
            c11457j = m15954a(c11457j, c11457jM15954a3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C11457j m15954a(C11457j c11457j, C11457j c11457j2) {
        C11457j c11457j3 = new C11457j(8, false);
        BigInteger bigIntegerMultiply = f21399e.multiply(((BigInteger) c11457j.f36753x).multiply((BigInteger) c11457j2.f36753x).multiply((BigInteger) c11457j.f36754y).multiply((BigInteger) c11457j2.f36754y));
        BigInteger bigInteger = f21398d;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = ((BigInteger) c11457j.f36753x).multiply((BigInteger) c11457j2.f36754y).add(((BigInteger) c11457j2.f36753x).multiply((BigInteger) c11457j.f36754y));
        BigInteger bigInteger2 = BigInteger.ONE;
        c11457j3.f36753x = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        c11457j3.f36754y = ((BigInteger) c11457j.f36754y).multiply((BigInteger) c11457j2.f36754y).add(((BigInteger) c11457j.f36753x).multiply((BigInteger) c11457j2.f36753x)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return c11457j3;
    }

    /* JADX INFO: renamed from: b */
    public static C5080b m15955b(C11457j c11457j) {
        BigInteger bigIntegerAdd = ((BigInteger) c11457j.f36754y).add((BigInteger) c11457j.f36753x);
        BigInteger bigInteger = f21398d;
        return new C5080b(AbstractC5078a.m15933f(m15956c(bigIntegerAdd.mod(bigInteger))), AbstractC5078a.m15933f(m15956c(((BigInteger) c11457j.f36754y).subtract((BigInteger) c11457j.f36753x).mod(bigInteger))), AbstractC5078a.m15933f(m15956c(f21400f.multiply((BigInteger) c11457j.f36753x).multiply((BigInteger) c11457j.f36754y).mod(bigInteger))));
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m15956c(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i13 = 0; i13 < 16; i13++) {
            byte b = bArr[i13];
            int i14 = 31 - i13;
            bArr[i13] = bArr[i14];
            bArr[i14] = b;
        }
        return bArr;
    }
}
