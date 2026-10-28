package p60;

import com.whoop.achievements.celebration.AbstractC5739d;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.models.celebration.CelebrationOverlayModel;
import com.whoop.metrics.domain.models.MetricPostType;
import i51.C18118o;
import iy1.InterfaceC21030c;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jy1.C22047a;
import m83.C25271y;
import n60.AbstractC26404b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: p60.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lp60/a;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Liy1/c;", "metricWriter", "Ljb1/a;", "itemReducer", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Liy1/c;Ljb1/a;)V", "Ll83/a0;", "c", "()V", "Lcom/whoop/design/models/celebration/CelebrationOverlayModel;", "model", "Li51/o;", "b", "(Lcom/whoop/design/models/celebration/CelebrationOverlayModel;)Li51/o;", "Ln60/b;", "domainState", "Lcom/whoop/achievements/celebration/d;", "a", "(Ln60/b;)Lcom/whoop/achievements/celebration/d;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Liy1/c;", "Ljb1/a;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28937a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21535a itemReducer;

    public C28937a(FeatureFlagChecker featureFlagChecker, InterfaceC21030c metricWriter, C21535a itemReducer) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(itemReducer, "itemReducer");
        this.featureFlagChecker = featureFlagChecker;
        this.metricWriter = metricWriter;
        this.itemReducer = itemReducer;
    }

    /* JADX INFO: renamed from: b */
    private final C18118o m87844b(CelebrationOverlayModel model) {
        InterfaceC25312u interfaceC25312uM60544l = this.itemReducer.m60544l(model);
        if (interfaceC25312uM60544l instanceof C18118o) {
            return (C18118o) interfaceC25312uM60544l;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private final void m87845c() {
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.CELEBRATION_RENDER_FAILURE_METRIC)) {
            this.metricWriter.mo58701b(new C22047a(0, "whoop.achievements.celebration_render_failure", null, C25271y.f99162w, MetricPostType.COUNT, 5, null));
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC5739d m87846a(AbstractC26404b domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState instanceof AbstractC26404b.b) {
            return AbstractC5739d.b.f22730a;
        }
        if (domainState instanceof AbstractC26404b.a) {
            return AbstractC5739d.a.f22729a;
        }
        if (!(domainState instanceof AbstractC26404b.c)) {
            throw new NoWhenBranchMatchedException();
        }
        C18118o c18118oM87844b = m87844b(((AbstractC26404b.c) domainState).getCelebrationOverlay());
        if (c18118oM87844b != null) {
            return new AbstractC5739d.c(c18118oM87844b);
        }
        m87845c();
        return AbstractC5739d.a.f22729a;
    }

    public /* synthetic */ C28937a(FeatureFlagChecker featureFlagChecker, InterfaceC21030c interfaceC21030c, C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureFlagChecker, interfaceC21030c, (i13 & 4) != 0 ? AbstractC21537c.m60555e(null, 1, null) : c21535a);
    }
}
