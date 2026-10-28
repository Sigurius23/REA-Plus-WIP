package p370oj;

import com.amplitude.android.engagement.types.DebugStatus;
import com.amplitude.android.engagement.types.SimpleNudgeTriggerType;

/* JADX INFO: renamed from: oj.u */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC27974u {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f112807a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f112808b;

    static {
        int[] iArr = new int[SimpleNudgeTriggerType.values().length];
        try {
            iArr[SimpleNudgeTriggerType.IMMEDIATELY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SimpleNudgeTriggerType.SMART_DELAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SimpleNudgeTriggerType.RAGE_CLICK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SimpleNudgeTriggerType.USER_CONFUSION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SimpleNudgeTriggerType.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f112807a = iArr;
        int[] iArr2 = new int[DebugStatus.values().length];
        try {
            iArr2[DebugStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DebugStatus.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DebugStatus.INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[DebugStatus.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        f112808b = iArr2;
    }
}
