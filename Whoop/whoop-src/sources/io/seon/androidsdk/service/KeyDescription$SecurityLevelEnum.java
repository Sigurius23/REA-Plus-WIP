package io.seon.androidsdk.service;

/* JADX INFO: loaded from: classes3.dex */
enum KeyDescription$SecurityLevelEnum {
    SOFTWARE,
    TRUSTED_ENVIRONMENT,
    STRONGBOX,
    ERROR;

    public static KeyDescription$SecurityLevelEnum get(Integer num) {
        try {
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                return SOFTWARE;
            }
            if (iIntValue != 1) {
                return iIntValue != 2 ? ERROR : STRONGBOX;
            }
            return TRUSTED_ENVIRONMENT;
        } catch (Exception unused) {
        }
    }
}
