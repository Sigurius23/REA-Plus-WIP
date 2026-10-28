package mc0;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: mc0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lmc0/c;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "source", "Ll83/a0;", "c", "(Ljava/lang/String;)V", "a", "tier", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "Lfi0/a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25415c {

    /* JADX INFO: renamed from: c */
    public static final int f99518c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C25415c(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m74601a(String source) {
        AbstractC22676k.m65750j(source, "source");
        InterfaceC14515a.m41418i(this.analytics, null, "dismiss", null, "Product Recommendation Consent", null, AbstractC31061c.m95645u("source", source), 21, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m74602b(String source, String tier) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(tier, "tier");
        InterfaceC14515a.m41418i(this.analytics, null, "opt_in", null, "Product Recommendation Consent", null, AbstractC25247g0.m73990Y(new C23465k("source", source), new C23465k("tier", tier)), 21, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m74603c(String source) {
        AbstractC22676k.m65750j(source, "source");
        InterfaceC14515a.m41418i(this.analytics, null, ProfileAnalyticsKt.VIEW, null, "Product Recommendation Consent", null, AbstractC31061c.m95645u("source", source), 21, null);
    }
}
