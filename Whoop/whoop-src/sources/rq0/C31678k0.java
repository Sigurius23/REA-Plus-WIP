package rq0;

import com.whoop.community.domain.model.teams.TimePeriod;
import com.whoop.data.local.room.dao.wipeable.C6517d;
import com.whoop.domain.model.teams.LeadersEntry;
import com.whoop.p069ui.ScoreContext;
import hq0.C17561a;
import java.util.List;
import kh3.C22488a;
import l83.C23454a0;
import o52.C27566m0;
import p217ib.AbstractC18302a0;
import p217ib.AbstractC18324u;
import p217ib.AbstractC18327x;
import p217ib.C18326w;
import p217ib.C18329z;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rq0.k0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lrq0/k0;", "Lib/a0;", "Lcom/whoop/domain/model/teams/LeadersEntry;", "Lcom/whoop/ui/ScoreContext;", "scoreContext", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "timePeriod", "Lrq0/h1;", "viewModel", "<init>", "(Lcom/whoop/ui/ScoreContext;Lcom/whoop/community/domain/model/teams/TimePeriod;Lrq0/h1;)V", "Lib/w;", "params", "Lib/u;", "callback", "Ll83/a0;", "i", "(Lib/w;Lib/u;)V", "Lib/z;", "Lib/x;", "j", "(Lib/z;Lib/x;)V", "c", "Lcom/whoop/ui/ScoreContext;", "getScoreContext", "()Lcom/whoop/ui/ScoreContext;", "d", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "getTimePeriod", "()Lcom/whoop/community/domain/model/teams/TimePeriod;", "e", "Lrq0/h1;", "getViewModel", "()Lrq0/h1;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31678k0 extends AbstractC18302a0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ScoreContext scoreContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TimePeriod timePeriod;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C31671h1 viewModel;

    public C31678k0(ScoreContext scoreContext, TimePeriod timePeriod, C31671h1 viewModel) {
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        AbstractC22676k.m65750j(timePeriod, "timePeriod");
        AbstractC22676k.m65750j(viewModel, "viewModel");
        this.scoreContext = scoreContext;
        this.timePeriod = timePeriod;
        this.viewModel = viewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m98163p(AbstractC18324u abstractC18324u, int i13, C31678k0 c31678k0, C17561a c17561a) {
        List<LeadersEntry> listM49977b = c17561a != null ? c17561a.m49977b() : null;
        if (listM49977b != null) {
            abstractC18324u.mo52741a(i13, listM49977b.size(), listM49977b);
            c31678k0.viewModel.m98020B0(c31678k0.scoreContext, listM49977b.size());
        } else {
            c31678k0.viewModel.m98020B0(c31678k0.scoreContext, 0);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m98164q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m98165r(AbstractC18327x abstractC18327x, C17561a c17561a) {
        List<LeadersEntry> listM49977b = c17561a != null ? c17561a.m49977b() : null;
        if (listM49977b != null) {
            abstractC18327x.mo52742a(listM49977b);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m98166s(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // p217ib.AbstractC18302a0
    /* JADX INFO: renamed from: i */
    public void mo52699i(C18326w params, AbstractC18324u callback) {
        AbstractC22676k.m65750j(params, "params");
        AbstractC22676k.m65750j(callback, "callback");
        int iM52694e = AbstractC18302a0.m52694e(params, 40);
        this.viewModel.m98027Q(this.scoreContext, this.timePeriod, iM52694e, AbstractC18302a0.m52695f(params, iM52694e, 40)).m122652B(C22488a.m64989a().f88182b).m122661K(new C27566m0(new C6517d(callback, iM52694e, this, 11), 20));
    }

    @Override // p217ib.AbstractC18302a0
    /* JADX INFO: renamed from: j */
    public void mo52700j(C18329z params, AbstractC18327x callback) {
        AbstractC22676k.m65750j(params, "params");
        AbstractC22676k.m65750j(callback, "callback");
        this.viewModel.m98027Q(this.scoreContext, this.timePeriod, params.f71341a, params.f71342b).m122652B(C22488a.m64989a().f88182b).m122661K(new C27566m0(new C31663f(callback, 2), 19));
    }
}
