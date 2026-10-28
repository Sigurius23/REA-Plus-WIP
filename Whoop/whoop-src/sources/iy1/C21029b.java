package iy1;

import java.util.Set;
import jy1.C22047a;
import l83.C23454a0;
import p098dt.AbstractC12350b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: iy1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\tB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u000e"}, m65681d2 = {"Liy1/b;", "Liy1/c;", "Ltr2/n;", "logger", "<init>", "(Ltr2/n;)V", "Ljy1/a;", "metric", "Ll83/a0;", "a", "(Ljy1/a;Lq83/d;)Ljava/lang/Object;", "b", "(Ljy1/a;)V", "Ltr2/n;", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21029b implements InterfaceC21030c {

    /* JADX INFO: renamed from: c */
    private static final Set<String> f79617c = AbstractC12350b.m34570S("whoop.api.status_code");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C21029b(InterfaceC34116n logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.logger = logger;
    }

    @Override // iy1.InterfaceC21030c
    /* JADX INFO: renamed from: a */
    public Object mo58700a(C22047a c22047a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        if (!f79617c.contains(c22047a.getName())) {
            this.logger.mo85228t("insertMetricToCache " + c22047a, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    @Override // iy1.InterfaceC21030c
    /* JADX INFO: renamed from: b */
    public void mo58701b(C22047a metric) {
        AbstractC22676k.m65750j(metric, "metric");
        if (f79617c.contains(metric.getName())) {
            return;
        }
        this.logger.mo85228t("insertMetricToCacheAsync " + metric, new AbstractC30556a.a[0]);
    }

    public /* synthetic */ C21029b(InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MetricWriter") : interfaceC34116n);
    }
}
