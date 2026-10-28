package qq0;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.commons.Resource;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamType;
import com.whoop.domain.model.teams.share.SelectTeam;
import com.whoop.domain.model.teams.share.TeamResponse;
import com.whoop.profile.domain.ProfileApiKt;
import cq0.C11059g;
import cq0.C11060h;
import hj0.AbstractC17356o;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import od1.C27858u;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: qq0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001*B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0015\u0010'¨\u0006+"}, m65681d2 = {"Lqq0/d;", "Lhj0/o;", "Lcq0/h;", "widgetRepository", "Lcq0/g;", "teamsRepository", "Ltr2/n;", "logger", "Lod1/u;", "userContext", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcq0/h;Lcq0/g;Ltr2/n;Lod1/u;Lbc3/c0;)V", "Ll83/a0;", "C", "()V", "", ProfileApiKt.COMMUNITY_ID_PARAM, "D", "(I)V", "E", "Lcq0/h;", "F", "Lcq0/g;", "G", "Ltr2/n;", "H", "Lod1/u;", "", "I", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Landroidx/lifecycle/p0;", "Lqq0/e;", "J", "Landroidx/lifecycle/p0;", "()Landroidx/lifecycle/p0;", "selectTeamViewStateLiveData", "K", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30548d extends AbstractC17356o {

    /* JADX INFO: renamed from: L */
    public static final int f125711L = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C11060h widgetRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C11059g teamsRepository;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final AbstractC1615p0 selectTeamViewStateLiveData;

    /* JADX INFO: renamed from: qq0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.share.selectteam.SelectTeamViewModel$fetchTeams$1", m100430f = "SelectTeamViewModel.kt", m100431l = {29}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f125718w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30548d.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            List<SelectTeam> records;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125718w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11060h c11060h = C30548d.this.widgetRepository;
                this.f125718w = 1;
                obj = c11060h.m29835e(0, 50, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            Resource resource = (Resource) obj;
            if (resource.getSuccess()) {
                TeamResponse teamResponse = (TeamResponse) resource.getData();
                if (teamResponse == null || (records = teamResponse.getRecords()) == null) {
                    records = C25271y.f99162w;
                }
                C30548d c30548d = C30548d.this;
                c30548d.m49140v(c30548d.getSelectTeamViewStateLiveData(), new C30549e(records, null, records.isEmpty()));
            } else {
                C30548d.this.logger.mo85216g("fetch teams api call failed", new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qq0.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.share.selectteam.SelectTeamViewModel$getCommunity$1", m100430f = "SelectTeamViewModel.kt", m100431l = {45}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f125720w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f125722y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i13, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f125722y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30548d.this.new c(this.f125722y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125720w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11059g c11059g = C30548d.this.teamsRepository;
                int i14 = this.f125722y;
                int iM84056g = C30548d.this.userContext.m84056g();
                TeamType teamType = TeamType.COMMUNITY;
                this.f125720w = 1;
                obj = c11059g.m29819w(i14, iM84056g, teamType, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            Team team = (Team) obj;
            if (team != null) {
                C30548d c30548d = C30548d.this;
                c30548d.m49140v(c30548d.getSelectTeamViewStateLiveData(), new C30549e(null, team, false, 5, null));
            } else {
                C30548d.this.logger.mo85216g("get community returned a null", new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30548d(C11060h widgetRepository, C11059g teamsRepository, InterfaceC34116n logger, C27858u userContext, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(widgetRepository, "widgetRepository");
        AbstractC22676k.m65750j(teamsRepository, "teamsRepository");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.widgetRepository = widgetRepository;
        this.teamsRepository = teamsRepository;
        this.logger = logger;
        this.userContext = userContext;
        this.logTag = "SelectTeamViewModel";
        this.selectTeamViewStateLiveData = new C1630u0();
    }

    /* JADX INFO: renamed from: C */
    public final void m93646C() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new b(null), 3);
    }

    /* JADX INFO: renamed from: D */
    public final void m93647D(int communityId) {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new c(communityId, null), 3);
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final AbstractC1615p0 getSelectTeamViewStateLiveData() {
        return this.selectTeamViewStateLiveData;
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    public /* synthetic */ C30548d(C11060h c11060h, C11059g c11059g, InterfaceC34116n interfaceC34116n, C27858u c27858u, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11060h, c11059g, interfaceC34116n, c27858u, (i13 & 16) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
