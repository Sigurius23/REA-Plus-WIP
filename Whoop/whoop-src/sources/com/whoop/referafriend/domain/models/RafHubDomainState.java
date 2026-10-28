package com.whoop.referafriend.domain.models;

import j62.C21383h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006\""}, m65681d2 = {"Lcom/whoop/referafriend/domain/models/RafHubDomainState;", "", "Lcom/whoop/referafriend/domain/models/RafHubType$Basic;", "basic", "Lcom/whoop/referafriend/domain/models/RafHubType$Full;", "full", "Lj62/h;", "trials", "<init>", "(Lcom/whoop/referafriend/domain/models/RafHubType$Basic;Lcom/whoop/referafriend/domain/models/RafHubType$Full;Lj62/h;)V", "component1", "()Lcom/whoop/referafriend/domain/models/RafHubType$Basic;", "component2", "()Lcom/whoop/referafriend/domain/models/RafHubType$Full;", "component3", "()Lj62/h;", "copy", "(Lcom/whoop/referafriend/domain/models/RafHubType$Basic;Lcom/whoop/referafriend/domain/models/RafHubType$Full;Lj62/h;)Lcom/whoop/referafriend/domain/models/RafHubDomainState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/referafriend/domain/models/RafHubType$Basic;", "getBasic", "Lcom/whoop/referafriend/domain/models/RafHubType$Full;", "getFull", "Lj62/h;", "getTrials", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class RafHubDomainState {
    public static final int $stable = 8;
    private final RafHubType.Basic basic;
    private final RafHubType.Full full;
    private final C21383h trials;

    public RafHubDomainState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ RafHubDomainState copy$default(RafHubDomainState rafHubDomainState, RafHubType.Basic basic, RafHubType.Full full, C21383h c21383h, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            basic = rafHubDomainState.basic;
        }
        if ((i13 & 2) != 0) {
            full = rafHubDomainState.full;
        }
        if ((i13 & 4) != 0) {
            c21383h = rafHubDomainState.trials;
        }
        return rafHubDomainState.copy(basic, full, c21383h);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RafHubType.Basic getBasic() {
        return this.basic;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RafHubType.Full getFull() {
        return this.full;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C21383h getTrials() {
        return this.trials;
    }

    public final RafHubDomainState copy(RafHubType.Basic basic, RafHubType.Full full, C21383h trials) {
        return new RafHubDomainState(basic, full, trials);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RafHubDomainState)) {
            return false;
        }
        RafHubDomainState rafHubDomainState = (RafHubDomainState) other;
        return AbstractC22676k.m65745e(this.basic, rafHubDomainState.basic) && AbstractC22676k.m65745e(this.full, rafHubDomainState.full) && AbstractC22676k.m65745e(this.trials, rafHubDomainState.trials);
    }

    public final RafHubType.Basic getBasic() {
        return this.basic;
    }

    public final RafHubType.Full getFull() {
        return this.full;
    }

    public final C21383h getTrials() {
        return this.trials;
    }

    public int hashCode() {
        RafHubType.Basic basic = this.basic;
        int iHashCode = (basic == null ? 0 : basic.hashCode()) * 31;
        RafHubType.Full full = this.full;
        int iHashCode2 = (iHashCode + (full == null ? 0 : full.hashCode())) * 31;
        C21383h c21383h = this.trials;
        return iHashCode2 + (c21383h != null ? c21383h.hashCode() : 0);
    }

    public String toString() {
        return "RafHubDomainState(basic=" + this.basic + ", full=" + this.full + ", trials=" + this.trials + ")";
    }

    public RafHubDomainState(RafHubType.Basic basic, RafHubType.Full full, C21383h c21383h) {
        this.basic = basic;
        this.full = full;
        this.trials = c21383h;
    }

    public /* synthetic */ RafHubDomainState(RafHubType.Basic basic, RafHubType.Full full, C21383h c21383h, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : basic, (i13 & 2) != 0 ? null : full, (i13 & 4) != 0 ? null : c21383h);
    }
}
