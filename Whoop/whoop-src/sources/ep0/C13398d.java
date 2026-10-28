package ep0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p181h2.C16617b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ep0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001f\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b!\u0010\u0014R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010*\u001a\u0004\b%\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\b(\u0010-R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u001b\u00100¨\u00061"}, m65681d2 = {"Lep0/d;", "", "", "isBottomSheetVisible", "isFabVisible", "Lh2/b;", "lastFabPosition", "Lep0/j;", "currentScreenContext", "", "openConversationFingerprint", "Lep0/h;", "proactiveState", "Lep0/i;", "realtimeVoiceState", "", "coachBarNavClearancePx", "<init>", "(ZZJLep0/j;Ljava/lang/String;Lep0/h;Lep0/i;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "f", "()Z", "b", "g", "c", "J", "getLastFabPosition-F1C5BW0", "()J", "d", "Lep0/j;", "()Lep0/j;", "e", "Ljava/lang/String;", "Lep0/h;", "()Lep0/h;", "Lep0/i;", "()Lep0/i;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "F", "()F", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13398d {

    /* JADX INFO: renamed from: i */
    public static final int f46924i = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isBottomSheetVisible;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isFabVisible;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long lastFabPosition;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C13404j currentScreenContext;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String openConversationFingerprint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C13402h proactiveState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC13403i realtimeVoiceState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float coachBarNavClearancePx;

    public /* synthetic */ C13398d(boolean z4, boolean z13, long j7, C13404j c13404j, String str, C13402h c13402h, EnumC13403i enumC13403i, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, z13, j7, c13404j, str, c13402h, enumC13403i, f13);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getCoachBarNavClearancePx() {
        return this.coachBarNavClearancePx;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C13404j getCurrentScreenContext() {
        return this.currentScreenContext;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOpenConversationFingerprint() {
        return this.openConversationFingerprint;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C13402h getProactiveState() {
        return this.proactiveState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC13403i getRealtimeVoiceState() {
        return this.realtimeVoiceState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13398d)) {
            return false;
        }
        C13398d c13398d = (C13398d) other;
        return this.isBottomSheetVisible == c13398d.isBottomSheetVisible && this.isFabVisible == c13398d.isFabVisible && C16617b.m47187c(this.lastFabPosition, c13398d.lastFabPosition) && AbstractC22676k.m65745e(this.currentScreenContext, c13398d.currentScreenContext) && AbstractC22676k.m65745e(this.openConversationFingerprint, c13398d.openConversationFingerprint) && AbstractC22676k.m65745e(this.proactiveState, c13398d.proactiveState) && this.realtimeVoiceState == c13398d.realtimeVoiceState && Float.compare(this.coachBarNavClearancePx, c13398d.coachBarNavClearancePx) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsBottomSheetVisible() {
        return this.isBottomSheetVisible;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsFabVisible() {
        return this.isFabVisible;
    }

    public int hashCode() {
        int iM30451e = AbstractC11266d.m30451e(AbstractC2875y.m8289b(Boolean.hashCode(this.isBottomSheetVisible) * 31, 31, this.isFabVisible), this.lastFabPosition, 31);
        C13404j c13404j = this.currentScreenContext;
        int iHashCode = (iM30451e + (c13404j == null ? 0 : c13404j.hashCode())) * 31;
        String str = this.openConversationFingerprint;
        return Float.hashCode(this.coachBarNavClearancePx) + ((this.realtimeVoiceState.hashCode() + ((this.proactiveState.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public String toString() {
        boolean z4 = this.isBottomSheetVisible;
        boolean z13 = this.isFabVisible;
        String strM47194j = C16617b.m47194j(this.lastFabPosition);
        C13404j c13404j = this.currentScreenContext;
        String str = this.openConversationFingerprint;
        C13402h c13402h = this.proactiveState;
        EnumC13403i enumC13403i = this.realtimeVoiceState;
        float f13 = this.coachBarNavClearancePx;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("GlobalCoachState(isBottomSheetVisible=", ", isFabVisible=", ", lastFabPosition=", z4, z13);
        sbM32002u.append(strM47194j);
        sbM32002u.append(", currentScreenContext=");
        sbM32002u.append(c13404j);
        sbM32002u.append(", openConversationFingerprint=");
        sbM32002u.append(str);
        sbM32002u.append(", proactiveState=");
        sbM32002u.append(c13402h);
        sbM32002u.append(", realtimeVoiceState=");
        sbM32002u.append(enumC13403i);
        sbM32002u.append(", coachBarNavClearancePx=");
        sbM32002u.append(f13);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    private C13398d(boolean z4, boolean z13, long j7, C13404j c13404j, String str, C13402h proactiveState, EnumC13403i realtimeVoiceState, float f13) {
        AbstractC22676k.m65750j(proactiveState, "proactiveState");
        AbstractC22676k.m65750j(realtimeVoiceState, "realtimeVoiceState");
        this.isBottomSheetVisible = z4;
        this.isFabVisible = z13;
        this.lastFabPosition = j7;
        this.currentScreenContext = c13404j;
        this.openConversationFingerprint = str;
        this.proactiveState = proactiveState;
        this.realtimeVoiceState = realtimeVoiceState;
        this.coachBarNavClearancePx = f13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C13398d(boolean z4, boolean z13, long j7, C13404j c13404j, String str, C13402h c13402h, EnumC13403i enumC13403i, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        z4 = (i13 & 1) != 0 ? false : z4;
        z13 = (i13 & 2) != 0 ? false : z13;
        j7 = (i13 & 4) != 0 ? 0L : j7;
        this(z4, z13, j7, (i13 & 8) != 0 ? null : c13404j, (i13 & 16) != 0 ? null : str, (i13 & 32) != 0 ? new C13402h(false, null, 3, null) : c13402h, (i13 & 64) != 0 ? EnumC13403i.Inactive : enumC13403i, (i13 & 128) != 0 ? 0.0f : f13, null);
    }
}
