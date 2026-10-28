package ar1;

import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ar1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lar1/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lar1/a;", "integrationsAnalyticEvent", "Ll83/a0;", "a", "(Lar1/a;)V", "Lfi0/a;", "b", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C1929b {

    /* JADX INFO: renamed from: c */
    public static final int f7653c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C1929b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m5911a(InterfaceC1928a integrationsAnalyticEvent) {
        AbstractC22676k.m65750j(integrationsAnalyticEvent, "integrationsAnalyticEvent");
        if (integrationsAnalyticEvent instanceof InterfaceC1928a.f) {
            this.analytics.mo41424f("Integrations", "Clicked Integration", ((InterfaceC1928a.f) integrationsAnalyticEvent).getReportingKey(), "Settings - Integrations");
            return;
        }
        if (integrationsAnalyticEvent instanceof InterfaceC1928a.a) {
            this.analytics.mo41424f("Integrations", "Connect", ((InterfaceC1928a.a) integrationsAnalyticEvent).getReportingKey(), "Settings - Integrations");
            return;
        }
        if (integrationsAnalyticEvent instanceof InterfaceC1928a.b) {
            this.analytics.mo41424f("Integrations", "Disconnect", ((InterfaceC1928a.b) integrationsAnalyticEvent).getReportingKey(), "Settings - Integrations");
            return;
        }
        if (integrationsAnalyticEvent instanceof InterfaceC1928a.c) {
            this.analytics.mo41424f("Integrations", "Disconnect Confirmed", ((InterfaceC1928a.c) integrationsAnalyticEvent).getReportingKey(), "Settings - Integrations");
            return;
        }
        if (integrationsAnalyticEvent instanceof InterfaceC1928a.d) {
            InterfaceC14515a interfaceC14515a = this.analytics;
            String source = ((InterfaceC1928a.d) integrationsAnalyticEvent).getSource();
            InterfaceC14515a.m41418i(interfaceC14515a, "healthex_auth", "initiate_connection", null, "HealthEx", null, source != null ? AbstractC31061c.m95645u("source", source) : null, 20, null);
        } else {
            if (!(integrationsAnalyticEvent instanceof InterfaceC1928a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC14515a interfaceC14515a2 = this.analytics;
            String source2 = ((InterfaceC1928a.e) integrationsAnalyticEvent).getSource();
            InterfaceC14515a.m41418i(interfaceC14515a2, "healthex_refresh", "manual_refresh", null, "HealthEx", null, source2 != null ? AbstractC31061c.m95645u("source", source2) : null, 20, null);
        }
    }
}
