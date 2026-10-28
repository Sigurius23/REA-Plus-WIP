package com.google.crypto.tink.internal;

import java.math.BigInteger;
import java.security.spec.ECPoint;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C5084d {

    /* JADX INFO: renamed from: d */
    public static final C5084d f21401d;

    /* JADX INFO: renamed from: a */
    public final BigInteger f21402a;

    /* JADX INFO: renamed from: b */
    public final BigInteger f21403b;

    /* JADX INFO: renamed from: c */
    public final BigInteger f21404c;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        f21401d = new C5084d(bigInteger, bigInteger, BigInteger.ZERO);
    }

    public C5084d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f21402a = bigInteger;
        this.f21403b = bigInteger2;
        this.f21404c = bigInteger3;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m15957a() {
        return this.f21404c.equals(BigInteger.ZERO);
    }

    /* JADX INFO: renamed from: b */
    public final ECPoint m15958b(BigInteger bigInteger) {
        if (m15957a()) {
            return ECPoint.POINT_INFINITY;
        }
        BigInteger bigIntegerModInverse = this.f21404c.modInverse(bigInteger);
        BigInteger bigIntegerMod = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(bigInteger);
        return new ECPoint(this.f21402a.multiply(bigIntegerMod).mod(bigInteger), this.f21403b.multiply(bigIntegerMod).mod(bigInteger).multiply(bigIntegerModInverse).mod(bigInteger));
    }
}
