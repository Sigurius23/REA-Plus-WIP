package com.whoop.home.domain.models;

import mm1.C25697k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p741vn1.C36213q;
import z51.C40101l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b\t\u0010\u0013¨\u0006'"}, m65681d2 = {"Lcom/whoop/home/domain/models/DayOneTransitionViewState;", "Lm91/u;", "Lz51/l;", "overviewGaugeState", "Lvn1/q;", "notificationsCenterViewState", "Lmm1/k;", "welcomeCardState", "", "isDayOneAnimationCompleted", "<init>", "(Lz51/l;Lvn1/q;Lmm1/k;Z)V", "component1", "()Lz51/l;", "component2", "()Lvn1/q;", "component3", "()Lmm1/k;", "component4", "()Z", "copy", "(Lz51/l;Lvn1/q;Lmm1/k;Z)Lcom/whoop/home/domain/models/DayOneTransitionViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lz51/l;", "getOverviewGaugeState", "Lvn1/q;", "getNotificationsCenterViewState", "Lmm1/k;", "getWelcomeCardState", "Z", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class DayOneTransitionViewState implements InterfaceC25312u {
    public static final int $stable = C36213q.f155039g | C40101l.f173095t;
    private final boolean isDayOneAnimationCompleted;
    private final C36213q notificationsCenterViewState;
    private final C40101l overviewGaugeState;
    private final C25697k welcomeCardState;

    public DayOneTransitionViewState(C40101l overviewGaugeState, C36213q notificationsCenterViewState, C25697k welcomeCardState, boolean z4) {
        AbstractC22676k.m65750j(overviewGaugeState, "overviewGaugeState");
        AbstractC22676k.m65750j(notificationsCenterViewState, "notificationsCenterViewState");
        AbstractC22676k.m65750j(welcomeCardState, "welcomeCardState");
        this.overviewGaugeState = overviewGaugeState;
        this.notificationsCenterViewState = notificationsCenterViewState;
        this.welcomeCardState = welcomeCardState;
        this.isDayOneAnimationCompleted = z4;
    }

    public static /* synthetic */ DayOneTransitionViewState copy$default(DayOneTransitionViewState dayOneTransitionViewState, C40101l c40101l, C36213q c36213q, C25697k c25697k, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c40101l = dayOneTransitionViewState.overviewGaugeState;
        }
        if ((i13 & 2) != 0) {
            c36213q = dayOneTransitionViewState.notificationsCenterViewState;
        }
        if ((i13 & 4) != 0) {
            c25697k = dayOneTransitionViewState.welcomeCardState;
        }
        if ((i13 & 8) != 0) {
            z4 = dayOneTransitionViewState.isDayOneAnimationCompleted;
        }
        return dayOneTransitionViewState.copy(c40101l, c36213q, c25697k, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C40101l getOverviewGaugeState() {
        return this.overviewGaugeState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C36213q getNotificationsCenterViewState() {
        return this.notificationsCenterViewState;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C25697k getWelcomeCardState() {
        return this.welcomeCardState;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsDayOneAnimationCompleted() {
        return this.isDayOneAnimationCompleted;
    }

    public final DayOneTransitionViewState copy(C40101l overviewGaugeState, C36213q notificationsCenterViewState, C25697k welcomeCardState, boolean isDayOneAnimationCompleted) {
        AbstractC22676k.m65750j(overviewGaugeState, "overviewGaugeState");
        AbstractC22676k.m65750j(notificationsCenterViewState, "notificationsCenterViewState");
        AbstractC22676k.m65750j(welcomeCardState, "welcomeCardState");
        return new DayOneTransitionViewState(overviewGaugeState, notificationsCenterViewState, welcomeCardState, isDayOneAnimationCompleted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DayOneTransitionViewState)) {
            return false;
        }
        DayOneTransitionViewState dayOneTransitionViewState = (DayOneTransitionViewState) other;
        return AbstractC22676k.m65745e(this.overviewGaugeState, dayOneTransitionViewState.overviewGaugeState) && AbstractC22676k.m65745e(this.notificationsCenterViewState, dayOneTransitionViewState.notificationsCenterViewState) && AbstractC22676k.m65745e(this.welcomeCardState, dayOneTransitionViewState.welcomeCardState) && this.isDayOneAnimationCompleted == dayOneTransitionViewState.isDayOneAnimationCompleted;
    }

    @Override // p720m91.InterfaceC25312u
    /* JADX INFO: renamed from: getEvent */
    public /* bridge */ Object getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() {
        return super.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
    }

    public final C36213q getNotificationsCenterViewState() {
        return this.notificationsCenterViewState;
    }

    public final C40101l getOverviewGaugeState() {
        return this.overviewGaugeState;
    }

    public final C25697k getWelcomeCardState() {
        return this.welcomeCardState;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isDayOneAnimationCompleted) + ((this.welcomeCardState.hashCode() + ((this.notificationsCenterViewState.hashCode() + (this.overviewGaugeState.hashCode() * 31)) * 31)) * 31);
    }

    public final boolean isDayOneAnimationCompleted() {
        return this.isDayOneAnimationCompleted;
    }

    public String toString() {
        return "DayOneTransitionViewState(overviewGaugeState=" + this.overviewGaugeState + ", notificationsCenterViewState=" + this.notificationsCenterViewState + ", welcomeCardState=" + this.welcomeCardState + ", isDayOneAnimationCompleted=" + this.isDayOneAnimationCompleted + ")";
    }

    public /* synthetic */ DayOneTransitionViewState(C40101l c40101l, C36213q c36213q, C25697k c25697k, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c40101l, c36213q, c25697k, (i13 & 8) != 0 ? false : z4);
    }
}
