package ha2;

import fi0.InterfaceC14515a;
import l83.C23465k;
import live.hms.video.factories.MediaConstraintsFactory;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ha2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lha2/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "billingOffer", "Ll83/a0;", "b", "(Ljava/lang/String;)V", "ctaText", "a", "Lfi0/a;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17057a {

    /* JADX INFO: renamed from: c */
    public static final int f65583c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C17057a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m48172a(String ctaText) {
        AbstractC22676k.m65750j(ctaText, "ctaText");
        InterfaceC14515a.m41418i(this.analytics, null, "Click", null, "My Account Header", null, AbstractC31061c.m95645u("CTA Text", ctaText), 21, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m48173b(String billingOffer) {
        if (billingOffer != null) {
            InterfaceC14515a.m41418i(this.analytics, null, "View", null, "My Account Header", null, AbstractC25247g0.m73990Y(new C23465k("Billing offer", billingOffer), new C23465k("isV2", MediaConstraintsFactory.kValueTrue)), 21, null);
        }
    }
}
