package rq0;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.local.room.dao.wipeable.C6517d;
import com.whoop.data.remote.commons.Resource;
import com.whoop.domain.model.RecordsDto;
import com.whoop.domain.model.User;
import com.whoop.domain.model.teams.DrawerDisplayInvite;
import com.whoop.domain.model.teams.PrivacyType;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamPrivacyProfile;
import com.whoop.domain.model.teams.TeamType;
import com.whoop.domain.model.teams.TeamUser;
import com.whoop.p069ui.ScoreContext;
import cq0.C11059g;
import e50.C12723b;
import e50.C12724c;
import f93.InterfaceC14292d;
import hj0.AbstractC17356o;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import java.io.IOException;
import kh3.C22488a;
import l83.C23454a0;
import o52.C27566m0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p217ib.AbstractC18302a0;
import p217ib.AbstractC18313j;
import p217ib.AbstractC18324u;
import p217ib.AbstractC18327x;
import p217ib.C18316m;
import p217ib.C18326w;
import p217ib.C18329z;
import p505ts.AbstractC34132o;
import p619xl.C38445a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import retrofit2.HttpException;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import xg3.C38280g;

/* JADX INFO: renamed from: rq0.e1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0017\u0013B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u001eJ+\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010#0\"2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\f¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0012¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b0\u0010.R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u001a\u00108\u001a\u0002048\u0016X\u0096D¢\u0006\f\n\u0004\b/\u00105\u001a\u0004\b6\u00107R\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000f098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R+\u0010D\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010@\u001a\u0004\bA\u0010\u0011\"\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR0\u0010O\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0J\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010K\u001a\u0004\b:\u0010L\"\u0004\bM\u0010N¨\u0006P"}, m65681d2 = {"Lrq0/e1;", "Lhj0/o;", "Lrq0/a1$b;", "Lcq0/g;", "teamsRepository", "Ltr2/n;", "logger", "<init>", "(Lcq0/g;Ltr2/n;)V", "Ll83/a0;", "F", "()V", "", "S", "()I", "Lrq0/f1;", "P", "()Lrq0/f1;", "", "b", "()Z", "Lcom/whoop/ui/ScoreContext;", "scoreContext", "a", "(Lcom/whoop/ui/ScoreContext;)Z", "c", "(Lcom/whoop/ui/ScoreContext;)I", "Lcom/whoop/domain/model/teams/DrawerDisplayInvite;", "invite", "M", "(Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)V", "N", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "Lxg3/g;", "Lcom/whoop/domain/model/RecordsDto;", "Lcom/whoop/domain/model/teams/TeamUser;", "I", "(II)Lxg3/g;", "newSize", "R", "(I)V", "loaded", "Q", "(Z)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lq83/d;)Ljava/lang/Object;", "G", "y", "E", "Lcq0/g;", "Ltr2/n;", "", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Le50/c;", "H", "Le50/c;", "L", "()Le50/c;", "viewStateLiveData", "<set-?>", "Lf93/d;", "K", "O", "(Lrq0/f1;)V", "viewState", "Lrq0/e1$a;", "J", "Lrq0/e1$a;", "dataSourceFactory", "Landroidx/lifecycle/p0;", "Lib/n;", "Landroidx/lifecycle/p0;", "()Landroidx/lifecycle/p0;", "setDataSource", "(Landroidx/lifecycle/p0;)V", "dataSource", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31662e1 extends AbstractC17356o implements C31650a1.b {

    /* JADX INFO: renamed from: L */
    static final /* synthetic */ InterfaceC21493z[] f130963L = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C31662e1.class, "viewState", "getViewState()Lcom/whoop/community/presentation/teams/TeamsShowInviteViewState;", 0))};

    /* JADX INFO: renamed from: M */
    public static final int f130964M = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C11059g teamsRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C12724c<C31665f1> viewStateLiveData;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC14292d viewState;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final a dataSourceFactory;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private AbstractC1615p0 dataSource;

    /* JADX INFO: renamed from: rq0.e1$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lrq0/e1$a;", "Lcom/squareup/wire/n;", "", "Lcom/whoop/domain/model/teams/TeamUser;", "Lrq0/e1;", "viewModel", "<init>", "(Lrq0/e1;)V", "Lib/j;", "s", "()Lib/j;", "c", "Lrq0/e1;", "getViewModel", "()Lrq0/e1;", "Landroidx/lifecycle/u0;", "Lrq0/e1$b;", "d", "Landroidx/lifecycle/u0;", "liveData", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC5583n {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C31662e1 viewModel;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C1630u0 liveData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C31662e1 viewModel) {
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

    /* JADX INFO: renamed from: rq0.e1$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lrq0/e1$b;", "Lib/a0;", "Lcom/whoop/domain/model/teams/TeamUser;", "Lrq0/e1;", "viewModel", "<init>", "(Lrq0/e1;)V", "Lib/w;", "params", "Lib/u;", "callback", "Ll83/a0;", "i", "(Lib/w;Lib/u;)V", "Lib/z;", "Lib/x;", "j", "(Lib/z;Lib/x;)V", "c", "Lrq0/e1;", "getViewModel", "()Lrq0/e1;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC18302a0 {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C31662e1 viewModel;

        public b(C31662e1 viewModel) {
            AbstractC22676k.m65750j(viewModel, "viewModel");
            this.viewModel = viewModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public static final C23454a0 m97962p(AbstractC18324u abstractC18324u, int i13, b bVar, RecordsDto recordsDto) {
            if (recordsDto != null) {
                abstractC18324u.mo52741a(i13, recordsDto.getRecords().size(), recordsDto.getRecords());
                bVar.viewModel.m97955R(recordsDto.getTotalCount());
            }
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public static final void m97963q(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public static final C23454a0 m97964r(AbstractC18327x abstractC18327x, RecordsDto recordsDto) {
            if (recordsDto != null) {
                abstractC18327x.mo52742a(recordsDto.getRecords());
            }
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s */
        public static final void m97965s(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        @Override // p217ib.AbstractC18302a0
        /* JADX INFO: renamed from: i */
        public void mo52699i(C18326w params, AbstractC18324u callback) {
            AbstractC22676k.m65750j(params, "params");
            AbstractC22676k.m65750j(callback, "callback");
            int iM52694e = AbstractC18302a0.m52694e(params, 40);
            this.viewModel.m97949I(iM52694e, AbstractC18302a0.m52695f(params, iM52694e, 40)).m122652B(C22488a.m64989a().f88182b).m122661K(new C27566m0(new C6517d(callback, iM52694e, this, 13), 24));
        }

        @Override // p217ib.AbstractC18302a0
        /* JADX INFO: renamed from: j */
        public void mo52700j(C18329z params, AbstractC18327x callback) {
            AbstractC22676k.m65750j(params, "params");
            AbstractC22676k.m65750j(callback, "callback");
            this.viewModel.m97949I(params.f71341a, params.f71342b).m122652B(C22488a.m64989a().f88182b).m122661K(new C27566m0(new C31663f(callback, 4), 23));
        }
    }

    /* JADX INFO: renamed from: rq0.e1$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamsShowInviteViewModel$loadInvite$1", m100430f = "TeamsShowInviteViewModel.kt", m100431l = {78}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f130975w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ DrawerDisplayInvite f130977y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DrawerDisplayInvite drawerDisplayInvite, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f130977y = drawerDisplayInvite;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31662e1.this.new c(this.f130977y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM29819w;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f130975w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11059g c11059g = C31662e1.this.teamsRepository;
                    int communityId = this.f130977y.getCommunityId();
                    int iM97945S = C31662e1.this.m97945S();
                    TeamType teamType = TeamType.COMMUNITY;
                    this.f130975w = 1;
                    objM29819w = c11059g.m29819w(communityId, iM97945S, teamType, this);
                    if (objM29819w == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objM29819w = obj;
                }
                Team team = (Team) objM29819w;
                if (team != null) {
                    C31662e1 c31662e1 = C31662e1.this;
                    c31662e1.m97944O(C31665f1.m97966h(c31662e1.m97943K(), null, team, false, false, false, 0, false, 117, null));
                    c31662e1.m97942F();
                }
            } catch (IOException e5) {
                C31662e1.this.logger.mo85222m(AbstractC11266d.m30461o("Error occurred while fetching the community by id - Reason: network IO error ", e5.getMessage()), new AbstractC30556a.a[0]);
            } catch (NullPointerException e13) {
                e13.printStackTrace();
                C31662e1.this.logger.mo85222m("Error occurred while fetching the community by id - Reason: Parsing Error " + c23454a0, new AbstractC30556a.a[0]);
            } catch (HttpException e14) {
                C31662e1.this.logger.mo85222m(AbstractC2875y.m8295h(e14.f128920w, "Error occurred while fetching the community by id - Reason: Server Error "), new AbstractC30556a.a[0]);
            } catch (Exception e15) {
                C31662e1.this.logger.mo85230v("Error occurred while fetching the community by id - Reason: Unknown Error", e15, new AbstractC30556a.a[0]);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: rq0.e1$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamsShowInviteViewModel$loadInviteByInviteCode$1", m100430f = "TeamsShowInviteViewModel.kt", m100431l = {103}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f130978w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ DrawerDisplayInvite f130980y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(DrawerDisplayInvite drawerDisplayInvite, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f130980y = drawerDisplayInvite;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31662e1.this.new d(this.f130980y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM29820x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f130978w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11059g c11059g = C31662e1.this.teamsRepository;
                    String inviteCode = this.f130980y.getInviteCode();
                    AbstractC22676k.m65748h(inviteCode, "null cannot be cast to non-null type kotlin.String");
                    this.f130978w = 1;
                    objM29820x = c11059g.m29820x(inviteCode, this);
                    if (objM29820x == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objM29820x = obj;
                }
                Resource resource = (Resource) objM29820x;
                Team team = resource != null ? (Team) resource.getData() : null;
                C31662e1 c31662e1 = C31662e1.this;
                c31662e1.m97944O(C31665f1.m97966h(c31662e1.m97943K(), null, team, false, false, false, 0, false, 117, null));
                c31662e1.m97942F();
            } catch (IOException e5) {
                C31662e1.this.logger.mo85222m(AbstractC11266d.m30461o("Error occurred while fetching the community by invite code - Reason: network IO error ", e5.getMessage()), new AbstractC30556a.a[0]);
            } catch (NullPointerException e13) {
                e13.printStackTrace();
                C31662e1.this.logger.mo85222m("Error occurred while fetching the community by invite code - Reason: Parsing Error " + c23454a0, new AbstractC30556a.a[0]);
            } catch (HttpException e14) {
                C31662e1.this.logger.mo85222m(AbstractC2875y.m8295h(e14.f128920w, "Error occurred while fetching the community by invite code - Reason: Server Error "), new AbstractC30556a.a[0]);
            } catch (Exception e15) {
                C31662e1.this.logger.mo85230v("Error occurred while fetching the community by invite code - Reason: Unknown Error", e15, new AbstractC30556a.a[0]);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: rq0.e1$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"rq0/e1$e", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C31665f1 value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31662e1 f130982x;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Object obj, C31662e1 c31662e1) {
            this.f130982x = c31662e1;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C31665f1 getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C31665f1 value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            this.f130982x.m97950L().postValue(this.f130982x.m97943K());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C31662e1(C11059g teamsRepository, InterfaceC34116n logger) {
        super(null, 1, 0 == true ? 1 : 0);
        AbstractC22676k.m65750j(teamsRepository, "teamsRepository");
        AbstractC22676k.m65750j(logger, "logger");
        this.teamsRepository = teamsRepository;
        this.logger = logger;
        this.logTag = "TeamsShowInviteViewModel";
        this.viewStateLiveData = new C12724c<>();
        this.viewState = new e(new C31665f1(null, null, false, false, false, 0, false, 127, null), this);
        this.dataSourceFactory = new a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final void m97942F() {
        a aVar = this.dataSourceFactory;
        C18316m c18316m = new C18316m();
        c18316m.m52725d();
        c18316m.m52724c();
        c18316m.m52723b();
        this.dataSource = new C38445a(aVar, c18316m.m52722a()).m123174i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final C31665f1 m97943K() {
        return (C31665f1) this.viewState.getValue(this, f130963L[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public final void m97944O(C31665f1 c31665f1) {
        this.viewState.setValue(this, f130963L[0], c31665f1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public final int m97945S() {
        User userM84055f = C12723b.m35566a().m35572g().m84055f();
        if (userM84055f != null) {
            return userM84055f.getId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: G */
    public final Object m97947G(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C11059g c11059g = this.teamsRepository;
        DrawerDisplayInvite invite = m97943K().getInvite();
        return c11059g.m29813s(invite != null ? invite.getId() : 0, m97945S(), interfaceC30057d);
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final AbstractC1615p0 getDataSource() {
        return this.dataSource;
    }

    /* JADX INFO: renamed from: I */
    public final C38280g<RecordsDto<TeamUser>> m97949I(int offset, int limit) {
        C11059g c11059g = this.teamsRepository;
        Team team = m97943K().getTeam();
        return c11059g.m29794U(team != null ? team.getId() : 0, offset, limit, m97945S(), TeamType.COMMUNITY);
    }

    /* JADX INFO: renamed from: L */
    public final C12724c<C31665f1> m97950L() {
        return this.viewStateLiveData;
    }

    /* JADX INFO: renamed from: M */
    public final void m97951M(DrawerDisplayInvite invite) {
        AbstractC22676k.m65750j(invite, "invite");
        m97944O(C31665f1.m97966h(m97943K(), invite, null, false, true, false, 0, false, 118, null));
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new c(invite, null), 3);
    }

    /* JADX INFO: renamed from: N */
    public final void m97952N(DrawerDisplayInvite invite) {
        AbstractC22676k.m65750j(invite, "invite");
        m97944O(C31665f1.m97966h(m97943K(), invite, null, false, true, false, 0, false, 118, null));
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new d(invite, null), 3);
    }

    @Override // rq0.C31650a1.b
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public C31665f1 state() {
        return m97943K();
    }

    /* JADX INFO: renamed from: Q */
    public final void m97954Q(boolean loaded) {
        m97944O(C31665f1.m97966h(m97943K(), null, null, false, false, loaded, 0, false, 111, null));
    }

    /* JADX INFO: renamed from: R */
    public final void m97955R(int newSize) {
        m97944O(C31665f1.m97966h(m97943K(), null, null, false, false, false, newSize, false, 95, null));
    }

    @Override // rq0.C31650a1.b
    /* JADX INFO: renamed from: a */
    public boolean mo97828a(ScoreContext scoreContext) {
        TeamPrivacyProfile privacyProfile;
        PrivacyType privacyTypeForContext;
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        Team team = m97943K().getTeam();
        if (team == null || (privacyProfile = team.getPrivacyProfile()) == null || (privacyTypeForContext = privacyProfile.forContext(scoreContext)) == null) {
            return false;
        }
        return privacyTypeForContext.isAtLeast(PrivacyType.SUMMARY);
    }

    @Override // rq0.C31650a1.b
    /* JADX INFO: renamed from: b */
    public boolean mo97829b() {
        return false;
    }

    @Override // rq0.C31650a1.b
    /* JADX INFO: renamed from: c */
    public int mo97830c(ScoreContext scoreContext) {
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        if (scoreContext == ScoreContext.OVERVIEW) {
            return m97943K().getResultSize();
        }
        return 0;
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    /* JADX INFO: renamed from: w */
    public final Object m97956w(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C11059g c11059g = this.teamsRepository;
        DrawerDisplayInvite invite = m97943K().getInvite();
        return c11059g.m29802l(invite != null ? invite.getId() : 0, m97945S(), interfaceC30057d);
    }

    /* JADX INFO: renamed from: y */
    public final Object m97957y(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        String inviteCode;
        C11059g c11059g = this.teamsRepository;
        DrawerDisplayInvite invite = m97943K().getInvite();
        if (invite == null || (inviteCode = invite.getInviteCode()) == null) {
            inviteCode = "";
        }
        return c11059g.m29804m(inviteCode, interfaceC30057d);
    }
}
