package p401pj;

import com.amplitude.android.engagement.types.PopoverPosition;

/* JADX INFO: renamed from: pj.a0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC29258a0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f118395a;

    static {
        int[] iArr = new int[PopoverPosition.values().length];
        try {
            iArr[PopoverPosition.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PopoverPosition.TOP_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PopoverPosition.TOP_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PopoverPosition.BOTTOM_LEFT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PopoverPosition.BOTTOM_RIGHT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PopoverPosition.BOTTOM_CENTER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PopoverPosition.LEFT_CENTER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[PopoverPosition.RIGHT_CENTER.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[PopoverPosition.CENTER.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f118395a = iArr;
    }
}
