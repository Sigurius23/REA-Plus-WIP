package dm0;

import iy1.InterfaceC21030c;
import jy1.C22047a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: dm0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Ldm0/a;", "", "Liy1/c;", "metricWriter", "<init>", "(Liy1/c;)V", "", "tabId", "Ll83/a0;", "a", "(Ljava/lang/String;)V", "Liy1/c;", "bottom-navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12176a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    public C12176a(InterfaceC21030c metricWriter) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        this.metricWriter = metricWriter;
    }

    /* JADX INFO: renamed from: a */
    public final void m33680a(String tabId) {
        AbstractC22676k.m65750j(tabId, "tabId");
        this.metricWriter.mo58701b(new C22047a(0, "bff_nav_unknown_tab", null, AbstractC37056f.m118958J("tab_id:".concat(tabId)), null, 21, null));
    }
}
