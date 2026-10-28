package g42;

import fi0.InterfaceC14515a;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g42.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lg42/a;", "", "Lfi0/a;", "baseAnalytics", "<init>", "(Lfi0/a;)V", "Ll83/a0;", "b", "()V", "", "isEnabled", "a", "(Z)V", "Lfi0/a;", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15462a {

    /* JADX INFO: renamed from: c */
    public static final int f58082c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    public C15462a(InterfaceC14515a baseAnalytics) {
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        this.baseAnalytics = baseAnalytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m43656a(boolean isEnabled) {
        InterfaceC14515a.m41418i(this.baseAnalytics, null, isEnabled ? "opt_in" : "opt_out", null, "Product Recommendation Consent", null, AbstractC25247g0.m73990Y(new C23465k("source", "settings"), new C23465k("tier", "restricted")), 21, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m43657b() {
    }
}
