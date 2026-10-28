package p189hb;

import androidx.lifecycle.EnumC1632v;

/* JADX INFO: renamed from: hb.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC17067c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f65595a;

    static {
        int[] iArr = new int[EnumC1632v.values().length];
        try {
            iArr[EnumC1632v.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC1632v.ON_RESUME.ordinal()] = 2;
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
        f65595a = iArr;
    }
}
