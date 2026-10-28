package rm1;

import mm1.C25697k;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import z51.C40101l;

/* JADX INFO: renamed from: rm1.k */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001d\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010)\u001a\u0004\b\u0019\u0010*¨\u0006+"}, m65681d2 = {"Lrm1/k;", "Lm91/u;", "Lz51/l;", "overviewGaugeState", "Lmm1/k;", "welcomeCardItemState", "", "durationMillis", "", "delayMillis", "", "initialize", "Lrm1/c;", "animationState", "<init>", "(Lz51/l;Lmm1/k;IJZLrm1/c;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lz51/l;", "f", "()Lz51/l;", "b", "Lmm1/k;", "g", "()Lmm1/k;", "c", "I", "d", "J", "()J", "e", "Z", "()Z", "Lrm1/c;", "()Lrm1/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31597k implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f130573g = C40101l.f173095t;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C40101l overviewGaugeState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C25697k welcomeCardItemState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int durationMillis;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long delayMillis;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean initialize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC31589c animationState;

    public C31597k(C40101l overviewGaugeState, C25697k welcomeCardItemState, int i13, long j7, boolean z4, EnumC31589c animationState) {
        AbstractC22676k.m65750j(overviewGaugeState, "overviewGaugeState");
        AbstractC22676k.m65750j(welcomeCardItemState, "welcomeCardItemState");
        AbstractC22676k.m65750j(animationState, "animationState");
        this.overviewGaugeState = overviewGaugeState;
        this.welcomeCardItemState = welcomeCardItemState;
        this.durationMillis = i13;
        this.delayMillis = j7;
        this.initialize = z4;
        this.animationState = animationState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC31589c getAnimationState() {
        return this.animationState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getDelayMillis() {
        return this.delayMillis;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getInitialize() {
        return this.initialize;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31597k)) {
            return false;
        }
        C31597k c31597k = (C31597k) other;
        return AbstractC22676k.m65745e(this.overviewGaugeState, c31597k.overviewGaugeState) && AbstractC22676k.m65745e(this.welcomeCardItemState, c31597k.welcomeCardItemState) && this.durationMillis == c31597k.durationMillis && this.delayMillis == c31597k.delayMillis && this.initialize == c31597k.initialize && this.animationState == c31597k.animationState;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C40101l getOverviewGaugeState() {
        return this.overviewGaugeState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C25697k getWelcomeCardItemState() {
        return this.welcomeCardItemState;
    }

    public int hashCode() {
        return this.animationState.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.durationMillis, (this.welcomeCardItemState.hashCode() + (this.overviewGaugeState.hashCode() * 31)) * 31, 31), this.delayMillis, 31), 31, this.initialize);
    }

    public String toString() {
        return "DayOneWelcomeOverviewGaugeItemState(overviewGaugeState=" + this.overviewGaugeState + ", welcomeCardItemState=" + this.welcomeCardItemState + ", durationMillis=" + this.durationMillis + ", delayMillis=" + this.delayMillis + ", initialize=" + this.initialize + ", animationState=" + this.animationState + ")";
    }

    public /* synthetic */ C31597k(C40101l c40101l, C25697k c25697k, int i13, long j7, boolean z4, EnumC31589c enumC31589c, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(c40101l, c25697k, (i14 & 4) != 0 ? 600 : i13, (i14 & 8) != 0 ? 300L : j7, (i14 & 16) != 0 ? false : z4, (i14 & 32) != 0 ? EnumC31589c.INITIAL : enumC31589c);
    }
}
