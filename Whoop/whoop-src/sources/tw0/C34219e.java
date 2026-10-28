package tw0;

import com.whoop.design.util.AbstractC8693b;
import java.util.List;
import km0.C22581e;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33208p0;
import pw0.AbstractC29584a;
import sw0.C33048e;
import sw0.C33050g;
import sw0.C33053j;
import sw0.InterfaceC33046c;
import uw0.C35306p;

/* JADX INFO: renamed from: tw0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Ltw0/e;", "", "Ltw0/a;", "bottomSheetReducer", "<init>", "(Ltw0/a;)V", "Lsw0/e;", "domainState", "Luw0/p;", "d", "(Lsw0/e;)Luw0/p;", "Lsw0/g;", "result", "", "performFuzzySearch", "", "Lsw0/j;", "removedWeeklyPlanBehaviors", "c", "(Lsw0/g;Ljava/lang/String;Ljava/util/List;)Luw0/p;", "bottomSheet", "Lkm0/e;", "b", "(Lsw0/g;Ljava/lang/String;Ljava/util/List;)Lkm0/e;", "Lsw0/c;", "fullScreenModal", "e", "(Lsw0/c;)Luw0/p;", "a", "Ltw0/a;", "custombottomsheet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34219e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34215a bottomSheetReducer;

    public C34219e(C34215a bottomSheetReducer) {
        AbstractC22676k.m65750j(bottomSheetReducer, "bottomSheetReducer");
        this.bottomSheetReducer = bottomSheetReducer;
    }

    /* JADX INFO: renamed from: b */
    private final C22581e m108163b(C33050g bottomSheet, String performFuzzySearch, List<C33053j> removedWeeklyPlanBehaviors) {
        return this.bottomSheetReducer.m108147e(bottomSheet, this.bottomSheetReducer.m108145b(bottomSheet), this.bottomSheetReducer.m108146c(bottomSheet), performFuzzySearch, removedWeeklyPlanBehaviors);
    }

    /* JADX INFO: renamed from: c */
    private final C35306p m108164c(C33050g result, String performFuzzySearch, List<C33053j> removedWeeklyPlanBehaviors) {
        return new C35306p(null, m108163b(result, performFuzzySearch, removedWeeklyPlanBehaviors), 1, null);
    }

    /* JADX INFO: renamed from: d */
    private final C35306p m108165d(C33048e domainState) {
        return domainState.getBottomSheetDomainState() == null ? m108166e(InterfaceC33046c.c.f137735a) : m108164c(domainState.getBottomSheetDomainState(), domainState.getPerformFuzzySearch(), domainState.m104604f());
    }

    /* JADX INFO: renamed from: e */
    private final C35306p m108166e(InterfaceC33046c fullScreenModal) {
        if (AbstractC22676k.m65745e(fullScreenModal, InterfaceC33046c.a.f137733a)) {
            return new C35306p(new C35306p.a(AbstractC33208p0.c.f138471e, null, null, false, 14, null), null, 2, null);
        }
        if (AbstractC22676k.m65745e(fullScreenModal, InterfaceC33046c.b.f137734a) || AbstractC22676k.m65745e(fullScreenModal, InterfaceC33046c.c.f137735a)) {
            return new C35306p(new C35306p.a(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC29584a.f120744d), false, null, 6, null), AbstractC8693b.m21277k(AbstractC29584a.f120743c), null, false, 12, null), null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public final C35306p m108167a(C33048e domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        return domainState.getCurrentDialogType() != null ? m108166e(domainState.getCurrentDialogType()) : m108165d(domainState);
    }
}
