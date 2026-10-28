package com.google.crypto.tink.internal;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.i */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5094i {
    static {
        new JsonParser$JsonElementTypeAdapter(0);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m15970a(String str) {
        int length = str.length();
        int i13 = 0;
        while (i13 != length) {
            char cCharAt = str.charAt(i13);
            int i14 = i13 + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i13 = i14;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i14 == length || !Character.isLowSurrogate(str.charAt(i14))) {
                    return false;
                }
                i13 += 2;
            }
        }
        return true;
    }
}
