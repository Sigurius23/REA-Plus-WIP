package s12;

import com.whoop.metrics.domain.models.MetricPostType;
import fi0.InterfaceC14515a;
import iy1.InterfaceC21030c;
import jy1.C22047a;
import l83.C23465k;
import m83.AbstractC25247g0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r12.EnumC30858c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: s12.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Ls12/a;", "", "Lfi0/a;", "analytics", "Liy1/c;", "metricWriter", "<init>", "(Lfi0/a;Liy1/c;)V", "", "source", "Ll83/a0;", "a", "(Ljava/lang/String;)V", "Lr12/c;", "failure", "b", "(Lr12/c;)V", "Lfi0/a;", "Liy1/c;", "c", "onboarding-personalization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32068a {

    /* JADX INFO: renamed from: d */
    public static final int f132998d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    public C32068a(InterfaceC14515a analytics, InterfaceC21030c metricWriter) {
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        this.analytics = analytics;
        this.metricWriter = metricWriter;
    }

    /* JADX INFO: renamed from: a */
    public final void m99657a(String source) {
        InterfaceC14515a interfaceC14515a = this.analytics;
        if (source == null) {
            source = "day_zero_personalization";
        }
        interfaceC14515a.mo41423e("day_zero_personalization", AbstractC25247g0.m73989X(new C23465k("source", source)));
    }

    /* JADX INFO: renamed from: b */
    public final void m99658b(EnumC30858c failure) {
        AbstractC22676k.m65750j(failure, "failure");
        this.metricWriter.mo58701b(new C22047a(0, "whoop.ai.day_zero.header_metadata_unusable", null, AbstractC37056f.m118959K("platform:android", AbstractC11266d.m30461o("reason:", failure.getTag())), MetricPostType.COUNT, 5, null));
    }
}
