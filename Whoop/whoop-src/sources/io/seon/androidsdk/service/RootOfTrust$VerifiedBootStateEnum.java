package io.seon.androidsdk.service;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
enum RootOfTrust$VerifiedBootStateEnum {
    VERIFIED,
    SELF_SIGNED,
    UNVERIFIED,
    FAILED,
    ERROR;

    public static RootOfTrust$VerifiedBootStateEnum get(BigInteger bigInteger) {
        try {
            int iIntValue = bigInteger.intValue();
            if (iIntValue == 0) {
                return VERIFIED;
            }
            if (iIntValue == 1) {
                return SELF_SIGNED;
            }
            if (iIntValue != 2) {
                return iIntValue != 3 ? ERROR : FAILED;
            }
            return UNVERIFIED;
        } catch (Exception unused) {
        }
    }
}
