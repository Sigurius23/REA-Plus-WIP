package yr1;

import cs1.AbstractC11103c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import tr1.AbstractC34099c;
import ur1.AbstractC35185b;
import ur1.AbstractC35188e;
import ur1.AbstractC35192i;
import ur1.AbstractC35195l;
import ur1.InterfaceC35190g;
import vr1.AbstractC36305c;
import wr1.AbstractC37568b;

/* JADX INFO: renamed from: yr1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lyr1/f;", "", "Lyr1/e;", "questionTypeMapper", "<init>", "(Lyr1/e;)V", "Lcs1/c;", "viewEvent", "Lur1/g;", "a", "(Lcs1/c;)Lur1/g;", "Lyr1/e;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39735f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39734e questionTypeMapper;

    public C39735f(C39734e questionTypeMapper) {
        AbstractC22676k.m65750j(questionTypeMapper, "questionTypeMapper");
        this.questionTypeMapper = questionTypeMapper;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC35190g m127147a(AbstractC11103c viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        if (viewEvent instanceof AbstractC11103c.j) {
            AbstractC11103c.j jVar = (AbstractC11103c.j) viewEvent;
            return new AbstractC35195l.d(jVar.getRequestDate(), jVar.getCycleId(), jVar.getIsAutoPop(), jVar.getSource(), jVar.getLabel(), jVar.getShouldSaveCurrentEntryFirst(), jVar.getShouldSaveCurrentEntryFirst(), jVar.getDateNavigationType());
        }
        if (viewEvent instanceof AbstractC11103c.p) {
            AbstractC34099c abstractC34099cM127146e = this.questionTypeMapper.m127146e(((AbstractC11103c.p) viewEvent).getJournalQuestionViewEvent());
            if (abstractC34099cM127146e != null) {
                return new AbstractC35192i.a(abstractC34099cM127146e);
            }
            return null;
        }
        if (viewEvent instanceof AbstractC11103c.l) {
            return AbstractC35195l.e.f149547a;
        }
        if (viewEvent instanceof AbstractC11103c.a) {
            return AbstractC35195l.a.f149536a;
        }
        if (viewEvent instanceof AbstractC11103c.n) {
            return AbstractC35188e.c.f149403a;
        }
        if (viewEvent instanceof AbstractC11103c.e) {
            return new AbstractC35188e.b(false, 1, null);
        }
        if (viewEvent instanceof AbstractC11103c.f) {
            return new AbstractC35188e.b(true);
        }
        if (viewEvent instanceof AbstractC11103c.q) {
            return new AbstractC35192i.b(((AbstractC11103c.q) viewEvent).getDefaultToggleStatus());
        }
        if (viewEvent instanceof AbstractC11103c.b) {
            return new AbstractC36305c.a(((AbstractC11103c.b) viewEvent).getCom.mapbox.maps.MapboxMap.QFE_OFFSET java.lang.String());
        }
        if (viewEvent instanceof AbstractC11103c.k) {
            return new AbstractC36305c.c(((AbstractC11103c.k) viewEvent).getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
        }
        if (viewEvent.equals(AbstractC11103c.g.f35272a)) {
            return AbstractC35195l.b.f149537a;
        }
        if (viewEvent instanceof AbstractC11103c.c) {
            return new AbstractC35185b.a(((AbstractC11103c.c) viewEvent).getCategoryIndex());
        }
        if (viewEvent instanceof AbstractC11103c.o) {
            return new AbstractC35185b.b(((AbstractC11103c.o) viewEvent).getId());
        }
        if (viewEvent instanceof AbstractC11103c.r) {
            return new AbstractC35185b.c(((AbstractC11103c.r) viewEvent).getQuery());
        }
        if (viewEvent instanceof AbstractC11103c.m) {
            return new AbstractC35195l.f(((AbstractC11103c.m) viewEvent).m30020b());
        }
        if (viewEvent instanceof AbstractC11103c.i) {
            AbstractC11103c.i iVar = (AbstractC11103c.i) viewEvent;
            return new AbstractC37568b.a(iVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), iVar.getDisplayLoading());
        }
        if (viewEvent instanceof AbstractC11103c.s) {
            AbstractC11103c.s sVar = (AbstractC11103c.s) viewEvent;
            return new AbstractC37568b.b(sVar.getSelectedDate(), sVar.getCurrentDate(), sVar.getHasUserEditJournal());
        }
        if (viewEvent instanceof AbstractC11103c.h) {
            return new AbstractC35195l.c(((AbstractC11103c.h) viewEvent).getSearchTerm());
        }
        if (viewEvent instanceof AbstractC11103c.d) {
            return AbstractC35188e.a.f149401a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
