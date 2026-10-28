package j03;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: j03.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m65681d2 = {"Lj03/a;", "", "", "segmentName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getSegmentName", "()Ljava/lang/String;", "SMALL_RECOVERY", "SMALL_SLEEP", "SMALL_STRAIN", "SMALL_STEPS", "SMALL_STRAP_BATTERY", "SMALL_STRESS", "OVERVIEW", "HEALTHSPAN", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC21182a {
    SMALL_RECOVERY("recoverySmall"),
    SMALL_SLEEP("sleepSmall"),
    SMALL_STRAIN("strainSmall"),
    SMALL_STEPS("stepsSmall"),
    SMALL_STRAP_BATTERY("strapBatterySmall"),
    SMALL_STRESS("stressSmall"),
    OVERVIEW("overview"),
    HEALTHSPAN("whoopHealthspan");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String segmentName;

    EnumC21182a(String str) {
        this.segmentName = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getSegmentName() {
        return this.segmentName;
    }
}
