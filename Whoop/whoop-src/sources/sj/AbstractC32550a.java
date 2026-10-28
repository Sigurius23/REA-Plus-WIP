package sj;

import com.amplitude.android.engagement.types.ContentAlignment;

/* JADX INFO: renamed from: sj.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC32550a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f134866a;

    static {
        int[] iArr = new int[ContentAlignment.values().length];
        try {
            iArr[ContentAlignment.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ContentAlignment.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ContentAlignment.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f134866a = iArr;
    }
}
