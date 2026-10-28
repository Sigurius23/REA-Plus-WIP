package rq0;

import com.whoop.data.local.room.dao.wipeable.C6517d;
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

/* JADX INFO: renamed from: rq0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lrq0/g;", "Lib/a0;", "Lcom/whoop/domain/model/teams/TeamUser;", "Lrq0/k;", "viewModel", "<init>", "(Lrq0/k;)V", "Lib/w;", "params", "Lib/u;", "callback", "Ll83/a0;", "i", "(Lib/w;Lib/u;)V", "Lib/z;", "Lib/x;", "j", "(Lib/z;Lib/x;)V", "c", "Lrq0/k;", "getViewModel", "()Lrq0/k;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31666g extends AbstractC18302a0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C31677k viewModel;

    public C31666g(C31677k viewModel) {
        AbstractC22676k.m65750j(viewModel, "viewModel");
        this.viewModel = viewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m97978p(AbstractC18324u abstractC18324u, int i13, C31666g c31666g, List list) {
        if (list != null) {
            abstractC18324u.mo52741a(i13, list.size(), list);
            c31666g.viewModel.m98155g0(list.size());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m97979q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m97980r(AbstractC18327x abstractC18327x, List list) {
        if (list != null) {
            abstractC18327x.mo52742a(list);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m97981s(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // p217ib.AbstractC18302a0
    /* JADX INFO: renamed from: i */
    public void mo52699i(C18326w params, AbstractC18324u callback) {
        AbstractC22676k.m65750j(params, "params");
        AbstractC22676k.m65750j(callback, "callback");
        int iM52694e = AbstractC18302a0.m52694e(params, 40);
        this.viewModel.m98151Z(iM52694e, AbstractC18302a0.m52695f(params, iM52694e, 40)).m122652B(C22488a.m64989a().f88182b).m122661K(new C27566m0(new C6517d(callback, iM52694e, this, 9), 15));
    }

    @Override // p217ib.AbstractC18302a0
    /* JADX INFO: renamed from: j */
    public void mo52700j(C18329z params, AbstractC18327x callback) {
        AbstractC22676k.m65750j(params, "params");
        AbstractC22676k.m65750j(callback, "callback");
        this.viewModel.m98151Z(params.f71341a, params.f71342b).m122652B(C22488a.m64989a().f88182b).m122661K(new C27566m0(new C31663f(callback, 0), 16));
    }
}
