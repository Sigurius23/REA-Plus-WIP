package vm2;

import iy1.InterfaceC21030c;
import jy1.C22047a;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: vm2.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lvm2/l;", "", "Liy1/c;", "metricWriter", "Ltr2/n;", "logger", "<init>", "(Liy1/c;Ltr2/n;)V", "", "source", "Ll83/a0;", "b", "(Ljava/lang/String;)V", "tabId", "a", "Liy1/c;", "Ltr2/n;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36167l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C36167l(InterfaceC21030c metricWriter, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(logger, "logger");
        this.metricWriter = metricWriter;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    public final void m115108a(String tabId) {
        AbstractC22676k.m65750j(tabId, "tabId");
        this.metricWriter.mo58701b(new C22047a(0, "bff_bottom_nav.legacy_tab_mapping_used", null, AbstractC37056f.m118958J("tab:".concat(tabId)), null, 21, null));
    }

    /* JADX INFO: renamed from: b */
    public final void m115109b(String source) {
        InterfaceC34116n interfaceC34116n = this.logger;
        if (source == null) {
            source = "none";
        }
        interfaceC34116n.mo85226q("Unexpected home_fragment landing; redirecting to BFF default tab. source=".concat(source), new AbstractC30556a.a[0]);
        this.metricWriter.mo58701b(new C22047a(0, "bff_bottom_nav.unexpected_home_redirect", null, C25271y.f99162w, null, 21, null));
    }

    public /* synthetic */ C36167l(InterfaceC21030c interfaceC21030c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21030c, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("NavigationMetricsReporter") : interfaceC34116n);
    }
}
