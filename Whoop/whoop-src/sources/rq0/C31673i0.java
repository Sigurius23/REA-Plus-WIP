package rq0;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1630u0;
import com.mapbox.maps.MapboxMap;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.local.room.dao.wipeable.C6517d;
import com.whoop.domain.model.RecordsDto;
import com.whoop.domain.model.User;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamUser;
import cq0.C11059g;
import e50.C12723b;
import e50.C12724c;
import f93.InterfaceC14292d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import kh3.C22488a;
import l83.C23454a0;
import o52.C27566m0;
import p217ib.AbstractC18302a0;
import p217ib.AbstractC18313j;
import p217ib.AbstractC18324u;
import p217ib.AbstractC18327x;
import p217ib.C18316m;
import p217ib.C18326w;
import p217ib.C18329z;
import p619xl.C38445a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import q83.InterfaceC30057d;
import xg3.C38280g;

/* JADX INFO: renamed from: rq0.i0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002@AB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\bJ\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u001a2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\tH\u0086@¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020 2\u0006\u0010#\u001a\u00020\tH\u0086@¢\u0006\u0004\b$\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010%R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R+\u00103\u001a\u00020'2\u0006\u0010-\u001a\u00020'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R0\u0010?\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c08\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006B"}, m65681d2 = {"Lrq0/i0;", "Landroidx/lifecycle/w1;", "Lcq0/g;", "teamsRepository", "<init>", "(Lcq0/g;)V", "Ll83/a0;", "j", "()V", "", "z", "()I", "Lcom/whoop/domain/model/teams/Team;", "newTeam", "p", "(Lcom/whoop/domain/model/teams/Team;)V", "", "newSearch", "y", "(Ljava/lang/String;)V", "q", "newSize", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(I)V", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "Lxg3/g;", "Lcom/whoop/domain/model/RecordsDto;", "Lcom/whoop/domain/model/teams/TeamUser;", "t", "(II)Lxg3/g;", "toRemoveId", "", "r", "(ILq83/d;)Ljava/lang/Object;", "newOwnerId", "v", "Lcq0/g;", "Le50/c;", "Lrq0/j0;", "x", "Le50/c;", "o", "()Le50/c;", "viewStateLiveData", "<set-?>", "Lf93/d;", "n", "()Lrq0/j0;", "u", "(Lrq0/j0;)V", "viewState", "Lrq0/i0$a;", "Lrq0/i0$a;", "dataSourceFactory", "Landroidx/lifecycle/p0;", "Lib/n;", "E", "Landroidx/lifecycle/p0;", "l", "()Landroidx/lifecycle/p0;", "setDataSource", "(Landroidx/lifecycle/p0;)V", "dataSource", "b", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31673i0 extends AbstractC1637w1 {

    /* JADX INFO: renamed from: F */
    static final /* synthetic */ InterfaceC21493z[] f131082F = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C31673i0.class, "viewState", "getViewState()Lcom/whoop/community/presentation/teams/TeamRemoveMembersViewState;", 0))};

    /* JADX INFO: renamed from: G */
    public static final int f131083G = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private AbstractC1615p0 dataSource;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C11059g teamsRepository;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C12724c<C31676j0> viewStateLiveData;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC14292d viewState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final a dataSourceFactory;

    /* JADX INFO: renamed from: rq0.i0$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lrq0/i0$a;", "Lcom/squareup/wire/n;", "", "Lcom/whoop/domain/model/teams/TeamUser;", "Lrq0/i0;", "viewModel", "<init>", "(Lrq0/i0;)V", "Lib/j;", "s", "()Lib/j;", "c", "Lrq0/i0;", "getViewModel", "()Lrq0/i0;", "Landroidx/lifecycle/u0;", "Lrq0/i0$b;", "d", "Landroidx/lifecycle/u0;", "liveData", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC5583n {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C31673i0 viewModel;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C1630u0 liveData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C31673i0 viewModel) {
            super(16);
            AbstractC22676k.m65750j(viewModel, "viewModel");
            this.viewModel = viewModel;
            this.liveData = new C1630u0();
        }

        @Override // com.squareup.wire.AbstractC5583n
        /* JADX INFO: renamed from: s */
        public AbstractC18313j mo16801s() {
            b bVar = new b(this.viewModel);
            this.liveData.postValue(bVar);
            return bVar;
        }
    }

    /* JADX INFO: renamed from: rq0.i0$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lrq0/i0$b;", "Lib/a0;", "Lcom/whoop/domain/model/teams/TeamUser;", "Lrq0/i0;", "viewModel", "<init>", "(Lrq0/i0;)V", "Lib/w;", "params", "Lib/u;", "callback", "Ll83/a0;", "i", "(Lib/w;Lib/u;)V", "Lib/z;", "Lib/x;", "j", "(Lib/z;Lib/x;)V", "c", "Lrq0/i0;", "getViewModel", "()Lrq0/i0;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC18302a0 {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C31673i0 viewModel;

        public b(C31673i0 viewModel) {
            AbstractC22676k.m65750j(viewModel, "viewModel");
            this.viewModel = viewModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public static final C23454a0 m98086p(AbstractC18324u abstractC18324u, int i13, b bVar, RecordsDto recordsDto) {
            if (recordsDto != null) {
                abstractC18324u.mo52741a(i13, recordsDto.getRecords().size(), recordsDto.getRecords());
                bVar.viewModel.m98080w(recordsDto.getTotalCount());
            }
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public static final void m98087q(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public static final C23454a0 m98088r(AbstractC18327x abstractC18327x, RecordsDto recordsDto) {
            if (recordsDto != null) {
                abstractC18327x.mo52742a(recordsDto.getRecords());
            }
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s */
        public static final void m98089s(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        @Override // p217ib.AbstractC18302a0
        /* JADX INFO: renamed from: i */
        public void mo52699i(C18326w params, AbstractC18324u callback) {
            AbstractC22676k.m65750j(params, "params");
            AbstractC22676k.m65750j(callback, "callback");
            int iM52694e = AbstractC18302a0.m52694e(params, 40);
            this.viewModel.m98078t(iM52694e, AbstractC18302a0.m52695f(params, iM52694e, 40)).m122652B(C22488a.m64989a().f88182b).m122661K(new C27566m0(new C6517d(callback, iM52694e, this, 10), 18));
        }

        @Override // p217ib.AbstractC18302a0
        /* JADX INFO: renamed from: j */
        public void mo52700j(C18329z params, AbstractC18327x callback) {
            AbstractC22676k.m65750j(params, "params");
            AbstractC22676k.m65750j(callback, "callback");
            this.viewModel.m98078t(params.f71341a, params.f71342b).m122652B(C22488a.m64989a().f88182b).m122661K(new C27566m0(new C31663f(callback, 1), 17));
        }
    }

    /* JADX INFO: renamed from: rq0.i0$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"rq0/i0$c", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C31676j0 value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31673i0 f131093x;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Object obj, C31673i0 c31673i0) {
            this.f131093x = c31673i0;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C31676j0 getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C31676j0 value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            this.f131093x.m98074o().postValue(this.f131093x.m98070n());
        }
    }

    public C31673i0(C11059g teamsRepository) {
        AbstractC22676k.m65750j(teamsRepository, "teamsRepository");
        this.teamsRepository = teamsRepository;
        this.viewStateLiveData = new C12724c<>();
        this.viewState = new c(new C31676j0(null, null, 0, false, 15, null), this);
        this.dataSourceFactory = new a(this);
        m98069j();
    }

    /* JADX INFO: renamed from: j */
    private final void m98069j() {
        a aVar = this.dataSourceFactory;
        C18316m c18316m = new C18316m();
        c18316m.m52725d();
        c18316m.m52724c();
        c18316m.m52723b();
        this.dataSource = new C38445a(aVar, c18316m.m52722a()).m123174i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final C31676j0 m98070n() {
        return (C31676j0) this.viewState.getValue(this, f131082F[0]);
    }

    /* JADX INFO: renamed from: u */
    private final void m98071u(C31676j0 c31676j0) {
        this.viewState.setValue(this, f131082F[0], c31676j0);
    }

    /* JADX INFO: renamed from: z */
    private final int m98072z() {
        User userM84055f = C12723b.m35566a().m35572g().m84055f();
        if (userM84055f != null) {
            return userM84055f.getId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final AbstractC1615p0 getDataSource() {
        return this.dataSource;
    }

    /* JADX INFO: renamed from: o */
    public final C12724c<C31676j0> m98074o() {
        return this.viewStateLiveData;
    }

    /* JADX INFO: renamed from: p */
    public final void m98075p(Team newTeam) {
        AbstractC22676k.m65750j(newTeam, "newTeam");
        m98071u(C31676j0.m98118b(m98070n(), newTeam, null, 0, false, 14, null));
    }

    /* JADX INFO: renamed from: q */
    public final void m98076q() {
        m98071u(C31676j0.m98118b(m98070n(), null, null, 0, true, 7, null));
        m98069j();
    }

    /* JADX INFO: renamed from: r */
    public final Object m98077r(int i13, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C11059g c11059g = this.teamsRepository;
        Team team = m98070n().getTeam();
        return c11059g.m29792S(team != null ? team.getId() : 0, i13, m98072z(), interfaceC30057d);
    }

    /* JADX INFO: renamed from: t */
    public final C38280g<RecordsDto<TeamUser>> m98078t(int offset, int limit) {
        C11059g c11059g = this.teamsRepository;
        Team team = m98070n().getTeam();
        return c11059g.m29797d0(team != null ? team.getId() : 0, offset, limit, m98072z(), m98070n().getSearchText(), m98072z());
    }

    /* JADX INFO: renamed from: v */
    public final Object m98079v(int i13, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C11059g c11059g = this.teamsRepository;
        Team team = m98070n().getTeam();
        return c11059g.m29803l0(team != null ? team.getId() : 0, i13, m98072z(), interfaceC30057d);
    }

    /* JADX INFO: renamed from: w */
    public final void m98080w(int newSize) {
        m98071u(C31676j0.m98118b(m98070n(), null, null, newSize, false, 3, null));
    }

    /* JADX INFO: renamed from: y */
    public final void m98081y(String newSearch) {
        AbstractC22676k.m65750j(newSearch, "newSearch");
        if (newSearch.equals(m98070n().getSearchText())) {
            return;
        }
        m98071u(C31676j0.m98118b(m98070n(), null, newSearch, 0, true, 5, null));
        m98069j();
    }
}
