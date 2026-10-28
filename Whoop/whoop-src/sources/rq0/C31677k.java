package rq0;

import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import com.whoop.data.repositories.StringsRepository;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamInviteDto;
import com.whoop.domain.model.teams.TeamType;
import com.whoop.domain.model.teams.TeamUser;
import com.whoop.service.network.model.WhoopOffer;
import cq0.C11059g;
import f83.AbstractC14258f;
import f93.InterfaceC14292d;
import hj0.AbstractC17356o;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import l73.AbstractC23416g;
import l83.C23454a0;
import n73.InterfaceC26443b;
import or2.C28180m;
import or2.C28212w1;
import p217ib.C18316m;
import p249jc.AbstractC21598x;
import p299l9.C23494e0;
import p505ts.AbstractC34132o;
import p619xl.C38445a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q73.EnumC30024c;
import q83.InterfaceC30057d;
import r73.AbstractC31056a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import rv1.C31842a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import u73.RunnableC34579a;
import w73.C36919e;
import xg3.C38280g;
import xp0.AbstractC38505d0;
import z82.C40191e;

/* JADX INFO: renamed from: rq0.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u001d2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0017¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0017¢\u0006\u0004\b&\u0010%J\u001d\u0010)\u001a\u00020#2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0017¢\u0006\u0004\b)\u0010*J+\u0010/\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00132\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100-¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0010¢\u0006\u0004\b1\u00102J+\u00104\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u00132\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100-¢\u0006\u0004\b4\u00100J\r\u00105\u001a\u00020\u0010¢\u0006\u0004\b5\u00102J5\u00109\u001a\u00020\u00102\u0018\u00107\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0010062\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00100-¢\u0006\u0004\b9\u0010:J1\u0010;\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u00132\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010-H\u0002¢\u0006\u0004\b;\u00100J\u000f\u0010<\u001a\u00020\u0010H\u0002¢\u0006\u0004\b<\u00102J\u0010\u0010=\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b?\u0010>J\u0010\u0010@\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b@\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020J0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR+\u0010U\u001a\u00020J2\u0006\u0010N\u001a\u00020J8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010WR0\u0010a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0Z\u0018\u00010Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001a\u0010e\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b<\u0010b\u001a\u0004\bc\u0010dR\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020J0Y8F¢\u0006\u0006\u001a\u0004\bf\u0010^R\u001b\u0010\"\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\bh\u0010i*\u0004\bj\u0010k¨\u0006l"}, m65681d2 = {"Lrq0/k;", "Lhj0/o;", "Lcq0/g;", "teamsRepository", "Lrv1/a;", "membershipRepository", "Lz82/e;", "eventDispatcher", "Lcom/whoop/data/repositories/StringsRepository;", "stringsRepository", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcq0/g;Lrv1/a;Lz82/e;Lcom/whoop/data/repositories/StringsRepository;Lbc3/c0;)V", "Lcom/whoop/domain/model/teams/Team;", "newTeam", "Ll83/a0;", "Y", "(Lcom/whoop/domain/model/teams/Team;)V", "", "newSearch", "h0", "(Ljava/lang/String;)V", "", "newSize", "g0", "(I)V", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "Lxg3/g;", "", "Lcom/whoop/domain/model/teams/TeamUser;", "Z", "(II)Lxg3/g;", "userId", "", "U", "(I)Z", "S", "toId", "fromId", "i0", "(II)Z", "toUserId", "toUserName", "Lkotlin/Function0;", "onFinish", "e0", "(ILjava/lang/String;Lc93/a;)V", "b0", "()V", "toName", "j0", "N", "Lkotlin/Function2;", "showShareActionToUser", "showMessageToUser", "d0", "(Lc93/m;Lc93/a;)V", "K", "M", "W", "(Lq83/d;)Ljava/lang/Object;", "V", "X", "E", "Lcq0/g;", "F", "Lrv1/a;", "G", "Lz82/e;", "H", "Lcom/whoop/data/repositories/StringsRepository;", "Landroidx/lifecycle/u0;", "Lrq0/l;", "I", "Landroidx/lifecycle/u0;", "_viewStateLiveData", "<set-?>", "J", "Lf93/d;", "P", "()Lrq0/l;", "c0", "(Lrq0/l;)V", "internalViewState", "Lrq0/h;", "Lrq0/h;", "dataSourceFactory", "Landroidx/lifecycle/p0;", "Lib/n;", "L", "Landroidx/lifecycle/p0;", "O", "()Landroidx/lifecycle/p0;", "setDataSource", "(Landroidx/lifecycle/p0;)V", "dataSource", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "R", "viewStateLiveData", "Q", "()I", "getUserId$delegate", "(Lrq0/k;)Ljava/lang/Object;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31677k extends AbstractC17356o {

    /* JADX INFO: renamed from: N */
    static final /* synthetic */ InterfaceC21493z[] f131119N;

    /* JADX INFO: renamed from: O */
    public static final int f131120O;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C11059g teamsRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C31842a membershipRepository;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final StringsRepository stringsRepository;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C1630u0 _viewStateLiveData;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC14292d internalViewState;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C31669h dataSourceFactory;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private AbstractC1615p0 dataSource;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: rq0.k$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamAddMembersViewModel$actuallySendInviteTo$1", m100430f = "TeamAddMembersViewModel.kt", m100431l = {115, 118}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ int f131130E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC4339a f131131F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f131132G;

        /* JADX INFO: renamed from: w */
        Object f131133w;

        /* JADX INFO: renamed from: x */
        Object f131134x;

        /* JADX INFO: renamed from: y */
        int f131135y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i13, InterfaceC4339a interfaceC4339a, String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f131130E = i13;
            this.f131131F = interfaceC4339a;
            this.f131132G = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31677k.this.new a(this.f131130E, this.f131131F, this.f131132G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x008f  */
        /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM29799j0;
            C31677k c31677k;
            C31679l c31679lM98167b;
            C31677k c31677k2;
            InterfaceC4339a interfaceC4339a;
            Team team;
            String name;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131135y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11059g c11059g = C31677k.this.teamsRepository;
                Team team2 = C31677k.this.m98135P().getTeam();
                int id4 = team2 != null ? team2.getId() : 0;
                int i14 = this.f131130E;
                int iM98136Q = C31677k.this.m98136Q();
                this.f131135y = 1;
                objM29799j0 = c11059g.m29799j0(id4, i14, iM98136Q, this);
                if (objM29799j0 != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i13 == 1) {
                AbstractC34132o.m107864I(obj);
                objM29799j0 = obj;
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c31677k2 = (C31677k) this.f131134x;
                AbstractC34132o.m107864I(obj);
            }
            interfaceC4339a = this.f131131F;
            if (interfaceC4339a != null) {
                interfaceC4339a.invoke();
            }
            C31679l c31679lM98135P = C31677k.this.m98135P();
            StringsRepository stringsRepository = C31677k.this.stringsRepository;
            int i15 = AbstractC38505d0.f165679j1;
            String str = this.f131132G;
            team = C31677k.this.m98135P().getTeam();
            if (team != null || (name = team.getName()) == null) {
                name = "";
            }
            c31679lM98167b = C31679l.m98167b(c31679lM98135P, null, null, 0, null, null, null, null, null, stringsRepository.getString(i15, str, name), 255, null);
            c31677k = c31677k2;
            c31677k.m98140c0(c31679lM98167b);
            return C23454a0.f92919a;
            TeamInviteDto teamInviteDto = (TeamInviteDto) objM29799j0;
            C31677k c31677k3 = C31677k.this;
            c31677k3.m98140c0(C31679l.m98167b(c31677k3.m98135P().m98180n(this.f131130E), null, null, 0, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null));
            c31677k = C31677k.this;
            if (teamInviteDto != null) {
                this.f131133w = null;
                this.f131134x = c31677k;
                this.f131135y = 2;
                if (c31677k.m98137V(this) != enumC31071a) {
                    c31677k2 = c31677k;
                    interfaceC4339a = this.f131131F;
                    if (interfaceC4339a != null) {
                        interfaceC4339a.invoke();
                    }
                    C31679l c31679lM98135P2 = C31677k.this.m98135P();
                    StringsRepository stringsRepository2 = C31677k.this.stringsRepository;
                    int i16 = AbstractC38505d0.f165679j1;
                    String str2 = this.f131132G;
                    team = C31677k.this.m98135P().getTeam();
                    if (team != null) {
                        name = "";
                    } else {
                        name = "";
                    }
                    c31679lM98167b = C31679l.m98167b(c31679lM98135P2, null, null, 0, null, null, null, null, null, stringsRepository2.getString(i16, str2, name), 255, null);
                    c31677k = c31677k2;
                }
                return enumC31071a;
            }
            c31679lM98167b = C31679l.m98167b(c31677k.m98135P(), null, null, 0, null, null, null, null, null, C31677k.this.stringsRepository.getString(AbstractC38505d0.f165671h1), 255, null);
            c31677k.m98140c0(c31679lM98167b);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rq0.k$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamAddMembersViewModel", m100430f = "TeamAddMembersViewModel.kt", m100431l = {180}, m100432m = "loadInvites", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f131137w;

        /* JADX INFO: renamed from: y */
        int f131139y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f131137w = obj;
            this.f131139y |= Integer.MIN_VALUE;
            return C31677k.this.m98137V(this);
        }
    }

    /* JADX INFO: renamed from: rq0.k$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamAddMembersViewModel", m100430f = "TeamAddMembersViewModel.kt", m100431l = {174}, m100432m = "loadMembers", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f131140E;

        /* JADX INFO: renamed from: w */
        Object f131141w;

        /* JADX INFO: renamed from: x */
        int f131142x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f131143y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f131143y = obj;
            this.f131140E |= Integer.MIN_VALUE;
            return C31677k.this.m98138W(this);
        }
    }

    /* JADX INFO: renamed from: rq0.k$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamAddMembersViewModel", m100430f = "TeamAddMembersViewModel.kt", m100431l = {186}, m100432m = "loadShareCode", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f131145w;

        /* JADX INFO: renamed from: y */
        int f131147y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f131145w = obj;
            this.f131147y |= Integer.MIN_VALUE;
            return C31677k.this.m98139X(this);
        }
    }

    /* JADX INFO: renamed from: rq0.k$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamAddMembersViewModel$loadTeam$1", m100430f = "TeamAddMembersViewModel.kt", m100431l = {57, 58, 59}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f131148w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31677k.this.new e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        
            if (r6.m98139X(r5) == r0) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.f131148w
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                p505ts.AbstractC34132o.m107864I(r6)
                goto L47
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L3c
            L1f:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L31
            L23:
                p505ts.AbstractC34132o.m107864I(r6)
                rq0.k r6 = rq0.C31677k.this
                r5.f131148w = r4
                java.lang.Object r6 = rq0.C31677k.m98129G(r6, r5)
                if (r6 != r0) goto L31
                goto L46
            L31:
                rq0.k r6 = rq0.C31677k.this
                r5.f131148w = r3
                java.lang.Object r6 = rq0.C31677k.m98128F(r6, r5)
                if (r6 != r0) goto L3c
                goto L46
            L3c:
                rq0.k r6 = rq0.C31677k.this
                r5.f131148w = r2
                java.lang.Object r6 = rq0.C31677k.m98130H(r6, r5)
                if (r6 != r0) goto L47
            L46:
                return r0
            L47:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: rq0.C31677k.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: rq0.k$f */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"rq0/k$f", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C31679l value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31677k f131151x;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Object obj, C31677k c31677k) {
            this.f131151x = c31677k;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C31679l getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C31679l value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            this.f131151x._viewStateLiveData.postValue(this.f131151x.m98135P());
        }
    }

    /* JADX INFO: renamed from: rq0.k$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamAddMembersViewModel$startInviteFriend$1", m100430f = "TeamAddMembersViewModel.kt", m100431l = {194}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f131152E;

        /* JADX INFO: renamed from: F */
        int f131153F;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC4351m f131155H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC4339a f131156I;

        /* JADX INFO: renamed from: w */
        Object f131157w;

        /* JADX INFO: renamed from: x */
        Object f131158x;

        /* JADX INFO: renamed from: y */
        Object f131159y;

        /* JADX INFO: renamed from: z */
        int f131160z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f131155H = interfaceC4351m;
            this.f131156I = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31677k.this.new g(this.f131155H, this.f131156I, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C31677k c31677k;
            int i13;
            InterfaceC4351m interfaceC4351m;
            InterfaceC4339a interfaceC4339a;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.f131153F;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                Team team = C31677k.this.m98135P().getTeam();
                if (team != null) {
                    int id4 = team.getId();
                    C31677k c31677k2 = C31677k.this;
                    InterfaceC4351m interfaceC4351m2 = this.f131155H;
                    InterfaceC4339a interfaceC4339a2 = this.f131156I;
                    C31842a c31842a = c31677k2.membershipRepository;
                    this.f131157w = c31677k2;
                    this.f131158x = interfaceC4351m2;
                    this.f131159y = interfaceC4339a2;
                    this.f131160z = id4;
                    this.f131152E = 0;
                    this.f131153F = 1;
                    Object objM98915C = C31842a.m98915C(c31842a, id4, null, this, 2, null);
                    if (objM98915C == enumC31071a) {
                        return enumC31071a;
                    }
                    c31677k = c31677k2;
                    obj = objM98915C;
                    i13 = id4;
                    interfaceC4351m = interfaceC4351m2;
                    interfaceC4339a = interfaceC4339a2;
                }
                return C23454a0.f92919a;
            }
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = this.f131160z;
            interfaceC4339a = (InterfaceC4339a) this.f131159y;
            interfaceC4351m = (InterfaceC4351m) this.f131158x;
            c31677k = (C31677k) this.f131157w;
            AbstractC34132o.m107864I(obj);
            WhoopOffer whoopOffer = (WhoopOffer) obj;
            if (whoopOffer != null) {
                c31677k.eventDispatcher.m129002M0(i13);
                interfaceC4351m.invoke("", whoopOffer.getMessage());
            } else {
                interfaceC4339a.invoke();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rq0.k$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamAddMembersViewModel$withdrawInvite$1", m100430f = "TeamAddMembersViewModel.kt", m100431l = {145, 146}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f131161E;

        /* JADX INFO: renamed from: F */
        Object f131162F;

        /* JADX INFO: renamed from: G */
        int f131163G;

        /* JADX INFO: renamed from: H */
        int f131164H;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ int f131166J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ InterfaceC4339a f131167K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ String f131168L;

        /* JADX INFO: renamed from: w */
        Object f131169w;

        /* JADX INFO: renamed from: x */
        Object f131170x;

        /* JADX INFO: renamed from: y */
        Object f131171y;

        /* JADX INFO: renamed from: z */
        Object f131172z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i13, InterfaceC4339a interfaceC4339a, String str, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f131166J = i13;
            this.f131167K = interfaceC4339a;
            this.f131168L = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31677k.this.new h(this.f131166J, this.f131167K, this.f131168L, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object next;
            TeamInviteDto teamInviteDto;
            C31677k c31677k;
            int i13;
            Object objM29817u0;
            InterfaceC4339a interfaceC4339a;
            String str;
            C31677k c31677k2;
            C31679l c31679lM98167b;
            C31677k c31677k3;
            String str2;
            InterfaceC4339a interfaceC4339a2;
            C31677k c31677k4;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.f131164H;
            if (i14 != 0) {
                if (i14 == 1) {
                    int i15 = this.f131163G;
                    C31677k c31677k5 = (C31677k) this.f131162F;
                    str = (String) this.f131172z;
                    interfaceC4339a = (InterfaceC4339a) this.f131171y;
                    c31677k2 = (C31677k) this.f131170x;
                    teamInviteDto = (TeamInviteDto) this.f131169w;
                    AbstractC34132o.m107864I(obj);
                    i13 = i15;
                    c31677k = c31677k5;
                    objM29817u0 = obj;
                } else {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c31677k3 = (C31677k) this.f131162F;
                    str2 = (String) this.f131172z;
                    interfaceC4339a2 = (InterfaceC4339a) this.f131171y;
                    c31677k4 = (C31677k) this.f131170x;
                    AbstractC34132o.m107864I(obj);
                }
                interfaceC4339a2.invoke();
                C31679l c31679lM98167b2 = C31679l.m98167b(c31677k4.m98135P(), null, null, 0, null, null, null, null, null, c31677k4.stringsRepository.getString(AbstractC38505d0.f165683k1, str2), 255, null);
                c31677k = c31677k3;
                c31679lM98167b = c31679lM98167b2;
                c31677k.m98140c0(c31679lM98167b);
                return C23454a0.f92919a;
            }
            AbstractC34132o.m107864I(obj);
            List<TeamInviteDto> listM98171e = C31677k.this.m98135P().m98171e();
            int i16 = this.f131166J;
            Iterator<T> it = listM98171e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((TeamInviteDto) next).getRecipientId() != i16);
            teamInviteDto = (TeamInviteDto) next;
            if (teamInviteDto != null) {
                c31677k = C31677k.this;
                InterfaceC4339a interfaceC4339a3 = this.f131167K;
                String str3 = this.f131168L;
                C11059g c11059g = c31677k.teamsRepository;
                int id4 = teamInviteDto.getId();
                int iM98136Q = c31677k.m98136Q();
                this.f131169w = teamInviteDto;
                this.f131170x = c31677k;
                this.f131171y = interfaceC4339a3;
                this.f131172z = str3;
                this.f131161E = null;
                this.f131162F = c31677k;
                i13 = 0;
                this.f131163G = 0;
                this.f131164H = 1;
                objM29817u0 = c11059g.m29817u0(id4, iM98136Q, this);
                if (objM29817u0 != enumC31071a) {
                    interfaceC4339a = interfaceC4339a3;
                    str = str3;
                    c31677k2 = c31677k;
                }
                return enumC31071a;
            }
            return C23454a0.f92919a;
            if (((Boolean) objM29817u0).booleanValue()) {
                this.f131169w = teamInviteDto;
                this.f131170x = c31677k2;
                this.f131171y = interfaceC4339a;
                this.f131172z = str;
                this.f131161E = null;
                this.f131162F = c31677k;
                this.f131163G = i13;
                this.f131164H = 2;
                if (c31677k2.m98137V(this) != enumC31071a) {
                    c31677k3 = c31677k;
                    str2 = str;
                    interfaceC4339a2 = interfaceC4339a;
                    c31677k4 = c31677k2;
                    interfaceC4339a2.invoke();
                    C31679l c31679lM98167b3 = C31679l.m98167b(c31677k4.m98135P(), null, null, 0, null, null, null, null, null, c31677k4.stringsRepository.getString(AbstractC38505d0.f165683k1, str2), 255, null);
                    c31677k = c31677k3;
                    c31679lM98167b = c31679lM98167b3;
                }
                return enumC31071a;
            }
            c31679lM98167b = C31679l.m98167b(c31677k2.m98135P(), null, null, 0, null, null, null, null, null, c31677k2.stringsRepository.getString(AbstractC38505d0.f165711r1), 255, null);
            c31677k.m98140c0(c31679lM98167b);
            return C23454a0.f92919a;
        }
    }

    static {
        C22686q c22686q = new C22686q(C31677k.class, "internalViewState", "getInternalViewState()Lcom/whoop/community/presentation/teams/TeamAddMembersViewState;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f131119N = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC31061c.m95632h(C31677k.class, "userId", "getUserId()I", 0, c22673i0)};
        f131120O = 8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31677k(C11059g teamsRepository, C31842a membershipRepository, C40191e eventDispatcher, StringsRepository stringsRepository, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(teamsRepository, "teamsRepository");
        AbstractC22676k.m65750j(membershipRepository, "membershipRepository");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(stringsRepository, "stringsRepository");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.teamsRepository = teamsRepository;
        this.membershipRepository = membershipRepository;
        this.eventDispatcher = eventDispatcher;
        this.stringsRepository = stringsRepository;
        this._viewStateLiveData = new C1630u0();
        this.internalViewState = new f(new C31679l(null, null, 0, null, null, null, stringsRepository.getString(AbstractC38505d0.f165706q0), null, null, 447, null), this);
        C28212w1 c28212w1 = C28212w1.f113986w;
        this.dataSourceFactory = new C31669h(this);
        this.logTag = "TeamAddMembersViewModel";
        m98134M();
    }

    /* JADX INFO: renamed from: K */
    private final void m98132K(int toUserId, String toName, InterfaceC4339a onFinish) {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new a(toUserId, onFinish, toName, null), 3);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m98133L(C31677k c31677k, int i13, String str, InterfaceC4339a interfaceC4339a, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            interfaceC4339a = null;
        }
        c31677k.m98132K(i13, str, interfaceC4339a);
    }

    /* JADX INFO: renamed from: M */
    private final void m98134M() {
        C31669h c31669h = this.dataSourceFactory;
        C18316m c18316m = new C18316m();
        c18316m.m52725d();
        c18316m.m52724c();
        c18316m.m52723b();
        this.dataSource = new C38445a(c31669h, c18316m.m52722a()).m123174i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public final C31679l m98135P() {
        return (C31679l) this.internalViewState.getValue(this, f131119N[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public final int m98136Q() {
        return C28212w1.f113986w.getValue(this, f131119N[1]).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: V */
    public final Object m98137V(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f131139y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f131139y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM29783J = bVar.f131137w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f131139y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM29783J);
            C11059g c11059g = this.teamsRepository;
            Team team = m98135P().getTeam();
            AbstractC22676k.m65747g(team);
            int id4 = team.getId();
            bVar.f131139y = 1;
            objM29783J = c11059g.m29783J(id4, bVar);
            if (objM29783J == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM29783J);
        }
        List list = (List) objM29783J;
        if (list != null) {
            m98140c0(C31679l.m98167b(m98135P(), null, null, 0, null, list, null, null, null, null, 495, null));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: W */
    public final Object m98138W(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f131140E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f131140E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM29774A = cVar.f131143y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f131140E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM29774A);
            Team team = m98135P().getTeam();
            if (team != null) {
                C11059g c11059g = this.teamsRepository;
                int id4 = team.getId();
                int iM98136Q = m98136Q();
                TeamType teamType = team.getTeamType();
                cVar.f131141w = null;
                cVar.f131142x = 0;
                cVar.f131140E = 1;
                objM29774A = c11059g.m29774A(id4, iM98136Q, teamType, cVar);
                if (objM29774A == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM29774A);
        m98140c0(C31679l.m98167b(m98135P(), null, null, 0, null, null, (List) objM29774A, null, null, null, 479, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: X */
    public final Object m98139X(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f131147y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f131147y = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM29787N = dVar.f131145w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f131147y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM29787N);
            C11059g c11059g = this.teamsRepository;
            Team team = m98135P().getTeam();
            AbstractC22676k.m65747g(team);
            int id4 = team.getId();
            dVar.f131147y = 1;
            objM29787N = c11059g.m29787N(id4, dVar);
            if (objM29787N == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM29787N);
        }
        String str = (String) objM29787N;
        if (str != null) {
            m98140c0(C31679l.m98167b(m98135P(), null, null, 0, null, null, null, null, str, null, 383, null));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public final void m98140c0(C31679l c31679l) {
        this.internalViewState.setValue(this, f131119N[0], c31679l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final void m98141f0(C31677k c31677k, int i13, String str, InterfaceC4339a interfaceC4339a) {
        c31677k.m98132K(i13, str, interfaceC4339a);
    }

    /* JADX INFO: renamed from: N */
    public final void m98145N() {
        m98140c0(C31679l.m98167b(m98135P(), null, null, 0, null, null, null, null, null, null, 255, null));
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final AbstractC1615p0 getDataSource() {
        return this.dataSource;
    }

    /* JADX INFO: renamed from: R */
    public final AbstractC1615p0 m98147R() {
        return this._viewStateLiveData;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m98148S(int userId) {
        Object next;
        Iterator<T> it = m98135P().m98171e().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((TeamInviteDto) next).getRecipientId() != userId);
        return ((TeamInviteDto) next) != null || m98135P().m98170d().containsKey(Integer.valueOf(userId));
    }

    /* JADX INFO: renamed from: U */
    public final boolean m98149U(int userId) {
        Object next;
        Iterator<T> it = m98135P().m98169c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((TeamUser) next).getId() != userId);
        return ((TeamUser) next) != null;
    }

    /* JADX INFO: renamed from: Y */
    public final void m98150Y(Team newTeam) {
        AbstractC22676k.m65750j(newTeam, "newTeam");
        m98140c0(C31679l.m98167b(m98135P(), newTeam, null, 0, null, null, null, null, null, null, 510, null));
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new e(null), 3);
    }

    /* JADX INFO: renamed from: Z */
    public final C38280g<List<TeamUser>> m98151Z(int offset, int limit) {
        C11059g c11059g = this.teamsRepository;
        Team team = m98135P().getTeam();
        return c11059g.m29798g0(team != null ? team.getId() : 0, m98135P().getSearchText(), offset, limit);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m98152b0() {
        InterfaceC26443b interfaceC26443bM97935b;
        Set<Integer> setKeySet = m98135P().m98170d().keySet();
        AbstractC22676k.m65749i(setKeySet, "<get-keys>(...)");
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            C31660e c31660e = m98135P().m98170d().get((Integer) it.next());
            if (c31660e != null && (interfaceC26443bM97935b = c31660e.getTask()) != null) {
                interfaceC26443bM97935b.dispose();
            }
            AbstractC22676k.m65747g(c31660e);
            m98133L(this, c31660e.getUserId(), c31660e.getName(), null, 4, null);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m98153d0(InterfaceC4351m showShareActionToUser, InterfaceC4339a showMessageToUser) {
        AbstractC22676k.m65750j(showShareActionToUser, "showShareActionToUser");
        AbstractC22676k.m65750j(showMessageToUser, "showMessageToUser");
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new g(showShareActionToUser, showMessageToUser, null), 3);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m98154e0(int toUserId, String toUserName, InterfaceC4339a onFinish) {
        AbstractC22676k.m65750j(toUserName, "toUserName");
        AbstractC22676k.m65750j(onFinish, "onFinish");
        this.eventDispatcher.m129048o();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AbstractC23416g abstractC23416g = AbstractC14258f.f52051b;
        AbstractC31056a.m95616a(timeUnit, "unit is null");
        AbstractC31056a.m95616a(abstractC23416g, "scheduler is null");
        C36919e c36919e = new C36919e(new C23494e0(this, toUserId, toUserName, onFinish), 1);
        try {
            RunnableC34579a runnableC34579a = new RunnableC34579a(c36919e);
            EnumC30024c.m91916b(c36919e, runnableC34579a);
            InterfaceC26443b interfaceC26443bMo67909b = abstractC23416g.mo67909b(runnableC34579a);
            loop0: while (true) {
                InterfaceC26443b interfaceC26443b = (InterfaceC26443b) runnableC34579a.get();
                if (interfaceC26443b == EnumC30024c.f122536w) {
                    interfaceC26443bMo67909b.dispose();
                    break;
                } else {
                    do {
                        if (runnableC34579a.compareAndSet(interfaceC26443b, interfaceC26443bMo67909b)) {
                            break loop0;
                        }
                    } while (runnableC34579a.get() == interfaceC26443b);
                }
            }
            m98140c0(C31679l.m98167b(m98135P().m98178l(toUserId, toUserName, c36919e), null, null, 0, null, null, null, null, null, this.stringsRepository.getString(AbstractC38505d0.f165675i1), 255, null));
            onFinish.invoke();
        } catch (NullPointerException e5) {
            throw e5;
        } catch (Throwable th3) {
            AbstractC3269g.m9495a0(th3);
            AbstractC21598x.m60677d0(th3);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th3);
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m98155g0(int newSize) {
        m98140c0(C31679l.m98167b(m98135P(), null, null, newSize, null, null, null, null, null, null, 507, null));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m98156h0(String newSearch) {
        AbstractC22676k.m65750j(newSearch, "newSearch");
        if (newSearch.equals(m98135P().getSearchText())) {
            return;
        }
        m98140c0(C31679l.m98167b(m98135P(), null, newSearch, 0, null, null, null, null, null, null, 509, null));
        m98134M();
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m98157i0(int toId, int fromId) {
        Object next;
        Iterator<T> it = m98135P().m98171e().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            TeamInviteDto teamInviteDto = (TeamInviteDto) next;
            if (!teamInviteDto.getDeleted() && teamInviteDto.getSenderId() == fromId && teamInviteDto.getRecipientId() == toId) {
                break;
            }
        }
        return next != null || m98135P().m98170d().containsKey(Integer.valueOf(toId));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m98158j0(int toUserId, String toName, InterfaceC4339a onFinish) {
        AbstractC22676k.m65750j(toName, "toName");
        AbstractC22676k.m65750j(onFinish, "onFinish");
        if (!m98135P().m98170d().containsKey(Integer.valueOf(toUserId))) {
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new h(toUserId, onFinish, toName, null), 3);
            return;
        }
        m98140c0(C31679l.m98167b(m98135P().m98179m(toUserId), null, null, 0, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null));
        onFinish.invoke();
        m98140c0(C31679l.m98167b(m98135P(), null, null, 0, null, null, null, null, null, this.stringsRepository.getString(AbstractC38505d0.f165683k1, toName), 255, null));
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    public /* synthetic */ C31677k(C11059g c11059g, C31842a c31842a, C40191e c40191e, StringsRepository stringsRepository, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11059g, c31842a, c40191e, stringsRepository, (i13 & 16) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
