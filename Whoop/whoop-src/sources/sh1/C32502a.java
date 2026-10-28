package sh1;

import iy1.InterfaceC21030c;
import jy1.C22047a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sh1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lsh1/a;", "", "Liy1/c;", "metricWriter", "<init>", "(Liy1/c;)V", "", "attributionTag", "Ll83/a0;", "a", "(Ljava/lang/String;)V", "Liy1/c;", "b", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32502a {

    /* JADX INFO: renamed from: c */
    public static final int f134589c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    public C32502a(InterfaceC21030c metricWriter) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        this.metricWriter = metricWriter;
    }

    /* JADX INFO: renamed from: a */
    public final void m101484a(String attributionTag) {
        this.metricWriter.mo58701b(new C22047a(0, "whoop.gps.access.requested", null, AbstractC37056f.m118958J(AbstractC22676k.m65745e(attributionTag, "gpsTracking") ? "event:gpsTracking" : "event:other"), null, 17, null));
    }
}
