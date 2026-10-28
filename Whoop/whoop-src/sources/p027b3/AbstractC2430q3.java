package p027b3;

import androidx.lifecycle.EnumC1632v;

/* JADX INFO: renamed from: b3.q3 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2430q3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f9519a;

    static {
        int[] iArr = new int[EnumC1632v.values().length];
        try {
            iArr[EnumC1632v.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC1632v.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC1632v.ON_STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC1632v.ON_DESTROY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC1632v.ON_PAUSE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EnumC1632v.ON_RESUME.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[EnumC1632v.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f9519a = iArr;
    }
}
