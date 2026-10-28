package ql1;

import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ql1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lql1/b;", "", "Lfi0/a;", "baseAnalytics", "<init>", "(Lfi0/a;)V", "", "batteryPercentage", "Ll83/a0;", "b", "(Ljava/lang/String;)V", "a", "Lfi0/a;", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30471b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    public C30471b(InterfaceC14515a baseAnalytics) {
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        this.baseAnalytics = baseAnalytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m93243a(String batteryPercentage) {
        AbstractC22676k.m65750j(batteryPercentage, "batteryPercentage");
        InterfaceC14515a.m41418i(this.baseAnalytics, "Overview Screen", "Banner Dismissed", null, "Homepage Alert", batteryPercentage, AbstractC31061c.m95645u("Banner Message", "CHARGE_REMAINING"), 4, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m93244b(String batteryPercentage) {
        AbstractC22676k.m65750j(batteryPercentage, "batteryPercentage");
        InterfaceC14515a.m41418i(this.baseAnalytics, "Overview Screen", "Banner Viewable", null, "Homepage Alert", batteryPercentage, AbstractC31061c.m95645u("Banner Message", "CHARGE_REMAINING"), 4, null);
    }
}
