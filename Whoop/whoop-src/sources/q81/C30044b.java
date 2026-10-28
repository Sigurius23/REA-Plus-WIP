package q81;

import c93.InterfaceC4339a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q80.C30034f;

/* JADX INFO: renamed from: q81.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015Jj\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b)\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b-\u0010!¨\u0006."}, m65681d2 = {"Lq81/b;", "", "", "initialValueInSeconds", "", "isPaused", "Lkotlin/Function1;", "Ll83/a0;", "onTimeChanged", "Lkotlin/Function0;", "getUpdatedDisplayTimeInSecondsOnResume", "includeHours", "", "updateToTriggerTimeRefresh", "isCountDown", "<init>", "(IZLkotlin/jvm/functions/Function1;Lc93/a;ZLjava/lang/Long;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "c", "(IZLkotlin/jvm/functions/Function1;Lc93/a;ZLjava/lang/Long;Z)Lq81/b;", "", "toString", "()Ljava/lang/String;", "a", "I", "g", "b", "Z", "k", "()Z", "Lkotlin/jvm/functions/Function1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lkotlin/jvm/functions/Function1;", "d", "Lc93/a;", "e", "()Lc93/a;", "f", "Ljava/lang/Long;", "i", "()Ljava/lang/Long;", "j", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30044b {

    /* JADX INFO: renamed from: h */
    public static final int f122627h = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int initialValueInSeconds;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isPaused;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function1 onTimeChanged;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC4339a getUpdatedDisplayTimeInSecondsOnResume;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean includeHours;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Long updateToTriggerTimeRefresh;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isCountDown;

    public C30044b(int i13, boolean z4, Function1 onTimeChanged, InterfaceC4339a getUpdatedDisplayTimeInSecondsOnResume, boolean z13, Long l7, boolean z14) {
        AbstractC22676k.m65750j(onTimeChanged, "onTimeChanged");
        AbstractC22676k.m65750j(getUpdatedDisplayTimeInSecondsOnResume, "getUpdatedDisplayTimeInSecondsOnResume");
        this.initialValueInSeconds = i13;
        this.isPaused = z4;
        this.onTimeChanged = onTimeChanged;
        this.getUpdatedDisplayTimeInSecondsOnResume = getUpdatedDisplayTimeInSecondsOnResume;
        this.includeHours = z13;
        this.updateToTriggerTimeRefresh = l7;
        this.isCountDown = z14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m91999b(int i13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C30044b m92000d(C30044b c30044b, int i13, boolean z4, Function1 function1, InterfaceC4339a interfaceC4339a, boolean z13, Long l7, boolean z14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = c30044b.initialValueInSeconds;
        }
        if ((i14 & 2) != 0) {
            z4 = c30044b.isPaused;
        }
        if ((i14 & 4) != 0) {
            function1 = c30044b.onTimeChanged;
        }
        if ((i14 & 8) != 0) {
            interfaceC4339a = c30044b.getUpdatedDisplayTimeInSecondsOnResume;
        }
        if ((i14 & 16) != 0) {
            z13 = c30044b.includeHours;
        }
        if ((i14 & 32) != 0) {
            l7 = c30044b.updateToTriggerTimeRefresh;
        }
        if ((i14 & 64) != 0) {
            z14 = c30044b.isCountDown;
        }
        Long l12 = l7;
        boolean z15 = z14;
        boolean z16 = z13;
        Function1 function2 = function1;
        return c30044b.m92001c(i13, z4, function2, interfaceC4339a, z16, l12, z15);
    }

    /* JADX INFO: renamed from: c */
    public final C30044b m92001c(int initialValueInSeconds, boolean isPaused, Function1 onTimeChanged, InterfaceC4339a getUpdatedDisplayTimeInSecondsOnResume, boolean includeHours, Long updateToTriggerTimeRefresh, boolean isCountDown) {
        AbstractC22676k.m65750j(onTimeChanged, "onTimeChanged");
        AbstractC22676k.m65750j(getUpdatedDisplayTimeInSecondsOnResume, "getUpdatedDisplayTimeInSecondsOnResume");
        return new C30044b(initialValueInSeconds, isPaused, onTimeChanged, getUpdatedDisplayTimeInSecondsOnResume, includeHours, updateToTriggerTimeRefresh, isCountDown);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC4339a getGetUpdatedDisplayTimeInSecondsOnResume() {
        return this.getUpdatedDisplayTimeInSecondsOnResume;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!C30044b.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(other, "null cannot be cast to non-null type com.whoop.design.atomic.organism.weightliftingtimer.BaseTimerState");
        C30044b c30044b = (C30044b) other;
        return this.initialValueInSeconds == c30044b.initialValueInSeconds && this.isPaused == c30044b.isPaused && this.includeHours == c30044b.includeHours && AbstractC22676k.m65745e(this.updateToTriggerTimeRefresh, c30044b.updateToTriggerTimeRefresh);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIncludeHours() {
        return this.includeHours;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getInitialValueInSeconds() {
        return this.initialValueInSeconds;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Function1 getOnTimeChanged() {
        return this.onTimeChanged;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.initialValueInSeconds * 31, 31, this.isPaused), 31, this.includeHours);
        Long l7 = this.updateToTriggerTimeRefresh;
        return iM8289b + (l7 != null ? l7.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getUpdateToTriggerTimeRefresh() {
        return this.updateToTriggerTimeRefresh;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsCountDown() {
        return this.isCountDown;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsPaused() {
        return this.isPaused;
    }

    public String toString() {
        int i13 = this.initialValueInSeconds;
        boolean z4 = this.isPaused;
        Function1 function1 = this.onTimeChanged;
        InterfaceC4339a interfaceC4339a = this.getUpdatedDisplayTimeInSecondsOnResume;
        boolean z13 = this.includeHours;
        Long l7 = this.updateToTriggerTimeRefresh;
        boolean z14 = this.isCountDown;
        StringBuilder sb4 = new StringBuilder("BaseTimerState(initialValueInSeconds=");
        sb4.append(i13);
        sb4.append(", isPaused=");
        sb4.append(z4);
        sb4.append(", onTimeChanged=");
        sb4.append(function1);
        sb4.append(", getUpdatedDisplayTimeInSecondsOnResume=");
        sb4.append(interfaceC4339a);
        sb4.append(", includeHours=");
        sb4.append(z13);
        sb4.append(", updateToTriggerTimeRefresh=");
        sb4.append(l7);
        sb4.append(", isCountDown=");
        return AbstractC18489d0.m53372m(sb4, z14, ")");
    }

    public /* synthetic */ C30044b(int i13, boolean z4, Function1 function1, InterfaceC4339a interfaceC4339a, boolean z13, Long l7, boolean z14, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? false : z4, (i14 & 4) != 0 ? new C30034f(5) : function1, interfaceC4339a, (i14 & 16) != 0 ? false : z13, (i14 & 32) != 0 ? null : l7, (i14 & 64) != 0 ? false : z14);
    }
}
