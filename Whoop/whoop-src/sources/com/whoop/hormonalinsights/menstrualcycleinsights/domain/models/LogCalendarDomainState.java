package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import ih0.AbstractC18489d0;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0004HÖ\u0081\u0004R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000f¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;", "", "periodOverrides", "", "", "", "networkState", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;", "isSaveEnabled", "<init>", "(Ljava/util/Map;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;Z)V", "getPeriodOverrides", "()Ljava/util/Map;", "getNetworkState", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class LogCalendarDomainState {
    public static final int $stable = 8;
    private final boolean isSaveEnabled;
    private final LogCalendarNetworkState networkState;
    private final Map<String, Boolean> periodOverrides;

    public LogCalendarDomainState(Map<String, Boolean> periodOverrides, LogCalendarNetworkState networkState, boolean z4) {
        AbstractC22676k.m65750j(periodOverrides, "periodOverrides");
        AbstractC22676k.m65750j(networkState, "networkState");
        this.periodOverrides = periodOverrides;
        this.networkState = networkState;
        this.isSaveEnabled = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LogCalendarDomainState copy$default(LogCalendarDomainState logCalendarDomainState, Map map, LogCalendarNetworkState logCalendarNetworkState, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = logCalendarDomainState.periodOverrides;
        }
        if ((i13 & 2) != 0) {
            logCalendarNetworkState = logCalendarDomainState.networkState;
        }
        if ((i13 & 4) != 0) {
            z4 = logCalendarDomainState.isSaveEnabled;
        }
        return logCalendarDomainState.copy(map, logCalendarNetworkState, z4);
    }

    public final Map<String, Boolean> component1() {
        return this.periodOverrides;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LogCalendarNetworkState getNetworkState() {
        return this.networkState;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSaveEnabled() {
        return this.isSaveEnabled;
    }

    public final LogCalendarDomainState copy(Map<String, Boolean> periodOverrides, LogCalendarNetworkState networkState, boolean isSaveEnabled) {
        AbstractC22676k.m65750j(periodOverrides, "periodOverrides");
        AbstractC22676k.m65750j(networkState, "networkState");
        return new LogCalendarDomainState(periodOverrides, networkState, isSaveEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogCalendarDomainState)) {
            return false;
        }
        LogCalendarDomainState logCalendarDomainState = (LogCalendarDomainState) other;
        return AbstractC22676k.m65745e(this.periodOverrides, logCalendarDomainState.periodOverrides) && AbstractC22676k.m65745e(this.networkState, logCalendarDomainState.networkState) && this.isSaveEnabled == logCalendarDomainState.isSaveEnabled;
    }

    public final LogCalendarNetworkState getNetworkState() {
        return this.networkState;
    }

    public final Map<String, Boolean> getPeriodOverrides() {
        return this.periodOverrides;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSaveEnabled) + ((this.networkState.hashCode() + (this.periodOverrides.hashCode() * 31)) * 31);
    }

    public final boolean isSaveEnabled() {
        return this.isSaveEnabled;
    }

    public String toString() {
        Map<String, Boolean> map = this.periodOverrides;
        LogCalendarNetworkState logCalendarNetworkState = this.networkState;
        boolean z4 = this.isSaveEnabled;
        StringBuilder sb4 = new StringBuilder("LogCalendarDomainState(periodOverrides=");
        sb4.append(map);
        sb4.append(", networkState=");
        sb4.append(logCalendarNetworkState);
        sb4.append(", isSaveEnabled=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }
}
