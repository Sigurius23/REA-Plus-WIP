package com.whoop.data.remote.domain.dto.growth;

import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/growth/SubscriptionInfo;", "", "requirePostalCode", "", "header", "", "monthlyPlan", "Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlan;", "<init>", "(ZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlan;)V", "getRequirePostalCode", "()Z", "getHeader", "()Ljava/lang/String;", "getMonthlyPlan", "()Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlan;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class SubscriptionInfo {
    private final String header;
    private final SubscriptionPlan monthlyPlan;
    private final boolean requirePostalCode;

    public SubscriptionInfo(boolean z4, String header, SubscriptionPlan monthlyPlan) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(monthlyPlan, "monthlyPlan");
        this.requirePostalCode = z4;
        this.header = header;
        this.monthlyPlan = monthlyPlan;
    }

    public static /* synthetic */ SubscriptionInfo copy$default(SubscriptionInfo subscriptionInfo, boolean z4, String str, SubscriptionPlan subscriptionPlan, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = subscriptionInfo.requirePostalCode;
        }
        if ((i13 & 2) != 0) {
            str = subscriptionInfo.header;
        }
        if ((i13 & 4) != 0) {
            subscriptionPlan = subscriptionInfo.monthlyPlan;
        }
        return subscriptionInfo.copy(z4, str, subscriptionPlan);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getRequirePostalCode() {
        return this.requirePostalCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SubscriptionPlan getMonthlyPlan() {
        return this.monthlyPlan;
    }

    public final SubscriptionInfo copy(boolean requirePostalCode, String header, SubscriptionPlan monthlyPlan) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(monthlyPlan, "monthlyPlan");
        return new SubscriptionInfo(requirePostalCode, header, monthlyPlan);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionInfo)) {
            return false;
        }
        SubscriptionInfo subscriptionInfo = (SubscriptionInfo) other;
        return this.requirePostalCode == subscriptionInfo.requirePostalCode && AbstractC22676k.m65745e(this.header, subscriptionInfo.header) && AbstractC22676k.m65745e(this.monthlyPlan, subscriptionInfo.monthlyPlan);
    }

    public final String getHeader() {
        return this.header;
    }

    public final SubscriptionPlan getMonthlyPlan() {
        return this.monthlyPlan;
    }

    public final boolean getRequirePostalCode() {
        return this.requirePostalCode;
    }

    public int hashCode() {
        return this.monthlyPlan.hashCode() + AbstractC11266d.m30450d(Boolean.hashCode(this.requirePostalCode) * 31, 31, this.header);
    }

    public String toString() {
        boolean z4 = this.requirePostalCode;
        String str = this.header;
        SubscriptionPlan subscriptionPlan = this.monthlyPlan;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("SubscriptionInfo(requirePostalCode=", ", header=", str, ", monthlyPlan=", z4);
        sbM38567n.append(subscriptionPlan);
        sbM38567n.append(")");
        return sbM38567n.toString();
    }
}
