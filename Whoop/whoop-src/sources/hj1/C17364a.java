package hj1;

import fi0.InterfaceC14515a;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: hj1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lhj1/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "source", "Ll83/a0;", "f", "(Ljava/lang/String;)V", "c", "b", "a", "d", "e", "Lfi0/a;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17364a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C17364a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m49166a(String source) {
        AbstractC22676k.m65750j(source, "source");
        InterfaceC14515a.m41418i(this.analytics, null, "Learn More", null, "Health Connect", null, AbstractC31061c.m95645u("Source", source), 21, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m49167b(String source) {
        AbstractC22676k.m65750j(source, "source");
        InterfaceC14515a.m41418i(this.analytics, null, "Clicked Manage Access", null, "Health Connect", null, AbstractC31061c.m95645u("Source", source), 21, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m49168c(String source) {
        AbstractC22676k.m65750j(source, "source");
        InterfaceC14515a.m41418i(this.analytics, null, "Clicked Set Up", null, "Health Connect", null, AbstractC31061c.m95645u("Source", source), 21, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m49169d(String source) {
        AbstractC22676k.m65750j(source, "source");
        InterfaceC14515a.m41418i(this.analytics, null, "Clicked Set Up", null, "Successful connection", null, AbstractC31061c.m95645u("Source", source), 21, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m49170e(String source) {
        AbstractC22676k.m65750j(source, "source");
        InterfaceC14515a.m41418i(this.analytics, null, "Clicked Set Up", null, "Unsuccessful connection", null, AbstractC31061c.m95645u("Source", source), 21, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m49171f(String source) {
        AbstractC22676k.m65750j(source, "source");
        this.analytics.mo41423e("Health Connect Primer", AbstractC25247g0.m73989X(new C23465k("Source", source)));
    }
}
