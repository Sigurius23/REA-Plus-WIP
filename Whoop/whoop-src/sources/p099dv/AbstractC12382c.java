package p099dv;

import com.mapbox.maps.StylePropertyValueKind;

/* JADX INFO: renamed from: dv.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC12382c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f41844a;

    static {
        int[] iArr = new int[StylePropertyValueKind.values().length];
        try {
            iArr[StylePropertyValueKind.CONSTANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StylePropertyValueKind.TRANSITION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StylePropertyValueKind.EXPRESSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StylePropertyValueKind.UNDEFINED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f41844a = iArr;
    }
}
