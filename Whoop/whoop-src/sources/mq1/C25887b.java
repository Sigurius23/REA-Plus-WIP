package mq1;

import com.whoop.impacts.details.domain.requests.JournalTrendsMiniArchResponse;
import com.whoop.impacts.details.domain.requests.JournalTrendsSectionModel;
import e31.C12612d;
import iq1.C20848a;
import iq1.C20853f;
import iq1.InterfaceC20850c;
import iq1.InterfaceC20852e;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import mm1.C25694h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import zz0.C41252m;

/* JADX INFO: renamed from: mq1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0007*\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lmq1/b;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Liq1/e$b;", "Liq1/a;", "e", "(Liq1/e$b;)Liq1/a;", "Liq1/f;", "f", "(Liq1/f;)Liq1/a;", "d", "domainState", "c", "a", "Ljb1/a;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25887b {

    /* JADX INFO: renamed from: b */
    public static final int f102154b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    public C25887b(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m76538b(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    private final C20848a m76539d(C20853f c20853f) {
        C20848a.b screenContent = m76541f(c20853f).getScreenContent();
        if (screenContent == null) {
            screenContent = new C20848a.b(null, 1, null);
        }
        List<C20848a.c> listM57581b = screenContent.m57581b();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM57581b, 10));
        for (C20848a.c cVar : listM57581b) {
            List<InterfaceC25312u> listM57584c = cVar.m57584c();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM57584c, 10));
            for (Object objM134013b : listM57584c) {
                if (objM134013b instanceof C41252m) {
                    objM134013b = C41252m.m134013b((C41252m) objM134013b, null, true, null, null, null, null, 61, null);
                }
                arrayList2.add(objM134013b);
            }
            arrayList.add(C20848a.c.m57582b(cVar, arrayList2, null, 2, null));
        }
        return new C20848a(null, screenContent.m57580a(arrayList), 1, null);
    }

    /* JADX INFO: renamed from: e */
    private final C20848a m76540e(InterfaceC20852e.b bVar) {
        if (bVar instanceof InterfaceC20852e.a) {
            return new C20848a(new C20848a.a(C12612d.f43056a.m35366a(), null, null, 6, null), null, 2, null);
        }
        if (bVar instanceof InterfaceC20852e.c) {
            return new C20848a(new C20848a.a(C12612d.f43056a.m35367b(), InterfaceC20850c.e.f78391a, null, 4, null), null, 2, null);
        }
        if (bVar instanceof InterfaceC20852e.d) {
            return new C20848a(new C20848a.a(C12612d.f43056a.m35368c(), null, InterfaceC20850c.e.f78391a, 2, null), null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: f */
    private final C20848a m76541f(C20853f c20853f) {
        List arrayList;
        List<JournalTrendsSectionModel> sections;
        JournalTrendsMiniArchResponse response = c20853f.getResponse();
        if (response == null || (sections = response.getSections()) == null) {
            arrayList = C25271y.f99162w;
        } else {
            List<JournalTrendsSectionModel> list = sections;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (JournalTrendsSectionModel journalTrendsSectionModel : list) {
                arrayList.add(new C20848a.c(this.reducer.m60540g(journalTrendsSectionModel.getItems()), journalTrendsSectionModel.getSectionType()));
            }
        }
        return new C20848a(null, new C20848a.b(arrayList), 1, null);
    }

    /* JADX INFO: renamed from: c */
    public final C20848a m76542c(C20853f domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (!(domainState.getCurrentDialogType() instanceof InterfaceC20852e.a) || domainState.getResponse() == null) {
            return domainState.getCurrentDialogType() instanceof InterfaceC20852e.b ? m76540e((InterfaceC20852e.b) domainState.getCurrentDialogType()) : m76541f(domainState);
        }
        return m76539d(domainState);
    }

    public /* synthetic */ C25887b(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC21537c.m60554d(new C25694h(22)) : c21535a);
    }
}
