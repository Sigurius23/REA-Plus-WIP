package tg;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tg.f */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC33774f {

    /* JADX INFO: renamed from: a */
    public static final char[] f141356a;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        AbstractC22676k.m65749i(charArray, "toCharArray(...)");
        f141356a = charArray;
    }

    /* JADX INFO: renamed from: a */
    public static final String m106780a(byte[] bArr) {
        AbstractC22676k.m65750j(bArr, "<this>");
        StringBuilder sb4 = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = f141356a;
            sb4.append(cArr[(b & 255) >> 4]);
            sb4.append(cArr[b & 15]);
        }
        return sb4.toString();
    }
}
