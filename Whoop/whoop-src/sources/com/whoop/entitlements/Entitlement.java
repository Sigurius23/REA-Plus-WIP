package com.whoop.entitlements;

import com.whoop.whooplabs.data.domain.LabsCampaign;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/entitlements/Entitlement;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "a", "COMMUNITY", "DEVICE", "DEVICE_SUBSCRIPTION_MANAGEMENT", "DIGITAL_WHOOP_LABS", "HEALTHSPAN", "HEALTH_MONITOR", "FOLLOWERS", "GIFTING", "HORMONAL_INSIGHTS", "JOURNAL", "LABRADOR", "LOON", "REFER_A_FRIEND", "SAGE", "SHEPHERD", "SHOP", "STRESS_MONITOR", "entitlements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum Entitlement {
    COMMUNITY("community"),
    DEVICE("device"),
    DEVICE_SUBSCRIPTION_MANAGEMENT("device-subscription-management"),
    DIGITAL_WHOOP_LABS("digital-whoop-labs"),
    HEALTHSPAN("tortoise"),
    HEALTH_MONITOR("health-monitor"),
    FOLLOWERS("followers"),
    GIFTING("gifting"),
    HORMONAL_INSIGHTS("hormonal-insights"),
    JOURNAL("journal"),
    LABRADOR(LabsCampaign.LABRADOR_ENTRY),
    LOON("loon"),
    REFER_A_FRIEND("refer-a-friend"),
    SAGE("sage"),
    SHEPHERD("shepherd"),
    SHOP("shop"),
    STRESS_MONITOR("stress-monitor");

    private final String value;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    Entitlement(String str) {
        this.value = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
