package com.google.crypto.tink.internal;

import java.nio.charset.Charset;
import java.security.SecureRandom;
import p075ct.C11105a;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.r0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5113r0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f21461a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static boolean m16077a(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i13 = 0; i13 < bArr.length; i13++) {
            if (bArr2[i13] != bArr[i13]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static int m16078b() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i13 = 0;
        while (i13 == 0) {
            secureRandom.nextBytes(bArr);
            i13 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i13;
    }

    /* JADX INFO: renamed from: c */
    public static final C11105a m16079c(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new TinkBugException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i13] = (byte) cCharAt;
        }
        return C11105a.m30034a(bArr);
    }
}
