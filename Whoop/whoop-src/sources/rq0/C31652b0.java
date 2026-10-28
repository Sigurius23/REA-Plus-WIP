package rq0;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import androidx.lifecycle.InterfaceC1633v0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.commons.Resource;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.StringsRepository;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamType;
import com.whoop.service.network.model.DefaultImages;
import cq0.C11059g;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f93.InterfaceC14292d;
import i92.AbstractC18263h;
import i92.InterfaceC18260e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23459e;
import no.nordicsemi.android.dfu.DfuBaseService;
import od1.C27858u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.InterfaceC22666f;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import vq0.AbstractC36279c;
import wb3.AbstractC37056f;
import xp0.AbstractC38505d0;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: rq0.b0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 `2\u00020\u0001:\u0001aB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010\u0018J\r\u0010 \u001a\u00020\u0014¢\u0006\u0004\b \u0010\u0018J\r\u0010!\u001a\u00020\u0014¢\u0006\u0004\b!\u0010\u0018J\u0015\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0010¢\u0006\u0004\b&\u0010$J\u0015\u0010(\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0010¢\u0006\u0004\b(\u0010$J\u0015\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b-\u0010,J\u0015\u00100\u001a\u00020\u00142\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00142\u0006\u00102\u001a\u00020.¢\u0006\u0004\b3\u00101J\u0015\u00105\u001a\u00020\u00142\u0006\u00104\u001a\u00020\u001a¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u001a¢\u0006\u0004\b8\u00106J\r\u00109\u001a\u00020\u0014¢\u0006\u0004\b9\u0010\u0018J\r\u0010:\u001a\u00020\u0014¢\u0006\u0004\b:\u0010\u0018J\r\u0010;\u001a\u00020\u0014¢\u0006\u0004\b;\u0010\u0018J\r\u0010<\u001a\u00020\u0014¢\u0006\u0004\b<\u0010\u0018J\u0015\u0010?\u001a\u00020\u00142\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u00142\u0006\u0010A\u001a\u00020=H\u0002¢\u0006\u0004\bB\u0010@J\u000f\u0010C\u001a\u00020\u0014H\u0002¢\u0006\u0004\bC\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010DR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010HR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010IR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00020M0L8\u0006¢\u0006\f\n\u0004\b\u001f\u0010N\u001a\u0004\bO\u0010PR$\u0010X\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR+\u0010_\u001a\u00020M2\u0006\u0010Y\u001a\u00020M8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^¨\u0006b"}, m65681d2 = {"Lrq0/b0;", "Landroidx/lifecycle/w1;", "Lcom/whoop/data/repositories/StringsRepository;", "stringsRepository", "Lcq0/g;", "teamsRepository", "Ltr2/n;", "logger", "Lod1/u;", "userContext", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Li92/e;", "networkMonitor", "<init>", "(Lcom/whoop/data/repositories/StringsRepository;Lcq0/g;Ltr2/n;Lod1/u;Lcom/whoop/data/repositories/FeatureFlagRepository;Li92/e;)V", "", "newId", "Lcom/whoop/domain/model/teams/TeamType;", "teamType", "Ll83/a0;", "I", "(ILcom/whoop/domain/model/teams/TeamType;)V", "E", "()V", "L", "", "bannerUrl", "logoUrl", "H", "(Ljava/lang/String;Ljava/lang/String;)V", "G", "z", "A", "newLogoIndex", "O", "(I)V", "newLogoVariantIndex", "P", "direction", "u", "Landroid/graphics/Bitmap;", "photo", "v", "(Landroid/graphics/Bitmap;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroid/graphics/drawable/Drawable;", "newBanner", "M", "(Landroid/graphics/drawable/Drawable;)V", "newLogo", "N", "newName", "V", "(Ljava/lang/String;)V", "newDescription", "U", "Y", "Z", "y", "K", "", "chatEnabled", "X", "(Z)V", "isConnected", "S", "W", "Lcom/whoop/data/repositories/StringsRepository;", "x", "Lcq0/g;", "Ltr2/n;", "Lod1/u;", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "F", "Li92/e;", "Landroidx/lifecycle/u0;", "Lrq0/c0;", "Landroidx/lifecycle/u0;", "D", "()Landroidx/lifecycle/u0;", "viewStateLiveData", "Lcom/whoop/domain/model/teams/Team;", "Lcom/whoop/domain/model/teams/Team;", "B", "()Lcom/whoop/domain/model/teams/Team;", "Q", "(Lcom/whoop/domain/model/teams/Team;)V", "manageTeam", "<set-?>", "Lf93/d;", "C", "()Lrq0/c0;", "R", "(Lrq0/c0;)V", "viewState", "J", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31652b0 extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final FeatureFlagRepository featureFlagRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC18260e networkMonitor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C1630u0 viewStateLiveData;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private Team manageTeam;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC14292d viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final StringsRepository stringsRepository;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C11059g teamsRepository;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: K */
    static final /* synthetic */ InterfaceC21493z[] f130844K = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C31652b0.class, "viewState", "getViewState()Lcom/whoop/community/presentation/teams/TeamManageViewState;", 0))};

    /* JADX INFO: renamed from: L */
    public static final int f130845L = 8;

    /* JADX INFO: renamed from: rq0.b0$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamManageViewModel$deleteTeam$1", m100430f = "TeamManageViewModel.kt", m100431l = {248}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f130855w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31652b0.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM29793T;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f130855w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11059g c11059g = C31652b0.this.teamsRepository;
                Integer id4 = C31652b0.this.m97841C().getId();
                int iIntValue = id4 != null ? id4.intValue() : 0;
                int iM84056g = C31652b0.this.userContext.m84056g();
                this.f130855w = 1;
                objM29793T = c11059g.m29793T(iIntValue, iM84056g, this);
                if (objM29793T == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM29793T = obj;
            }
            boolean zBooleanValue = ((Boolean) objM29793T).booleanValue();
            C31652b0 c31652b0 = C31652b0.this;
            c31652b0.m97843R(C31655c0.m97882d(c31652b0.m97841C(), null, null, false, null, false, null, 0, 0, 0, null, null, null, null, null, null, null, 0, C31652b0.this.stringsRepository.getString(zBooleanValue ? AbstractC38505d0.f165579F0 : AbstractC38505d0.f165576E0, C31652b0.this.m97841C().getName()), zBooleanValue ? 201 : 202, false, 655359, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rq0.b0$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamManageViewModel$loadTeam$1", m100430f = "TeamManageViewModel.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ TeamType f130857E;

        /* JADX INFO: renamed from: w */
        int f130858w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f130859x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f130861z;

        /* JADX INFO: renamed from: rq0.b0$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamManageViewModel$loadTeam$1$1", m100430f = "TeamManageViewModel.kt", m100431l = {68}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f130862w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31652b0 f130863x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ int f130864y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ TeamType f130865z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C31652b0 c31652b0, int i13, TeamType teamType, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f130863x = c31652b0;
                this.f130864y = i13;
                this.f130865z = teamType;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f130863x, this.f130864y, this.f130865z, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                Object objM29822z;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f130862w;
                try {
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        C11059g c11059g = this.f130863x.teamsRepository;
                        int i14 = this.f130864y;
                        int iM84056g = this.f130863x.userContext.m84056g();
                        TeamType teamType = this.f130865z;
                        this.f130862w = 1;
                        objM29822z = c11059g.m29822z(i14, iM84056g, teamType, this);
                        if (objM29822z == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        objM29822z = obj;
                    }
                    int iIntValue = ((Number) objM29822z).intValue();
                    C31652b0 c31652b0 = this.f130863x;
                    c31652b0.m97843R(C31655c0.m97882d(c31652b0.m97841C(), null, null, false, null, false, null, 0, 0, 0, null, null, null, null, null, null, null, iIntValue, null, 0, false, 983039, null));
                } catch (Throwable th3) {
                    this.f130863x.logger.mo85230v("Error getting community members: ", th3, new AbstractC30556a.a[0]);
                    this.f130863x.m97844S(false);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i13, TeamType teamType, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f130861z = i13;
            this.f130857E = teamType;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C31652b0.this.new c(this.f130861z, this.f130857E, interfaceC30057d);
            cVar.f130859x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM29819w;
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f130859x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f130858w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11059g c11059g = C31652b0.this.teamsRepository;
                    int i14 = this.f130861z;
                    int iM84056g = C31652b0.this.userContext.m84056g();
                    TeamType teamType = this.f130857E;
                    this.f130859x = interfaceC2994c0;
                    this.f130858w = 1;
                    objM29819w = c11059g.m29819w(i14, iM84056g, teamType, this);
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
                    C31652b0 c31652b0 = C31652b0.this;
                    C31655c0 c31655c0M97841C = c31652b0.m97841C();
                    Integer num = new Integer(team.getId());
                    String name = team.getName();
                    String description = team.getDescription();
                    if (description == null) {
                        description = "";
                    }
                    c31652b0.m97843R(C31655c0.m97882d(c31655c0M97841C, num, name, false, team, false, description, 0, 0, 0, null, null, null, null, null, team.getBannerUrl(), team.getIconUrl(), 0, null, 0, team.getChatEnabled(), 475092, null));
                    AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(C31652b0.this, this.f130861z, this.f130857E, null), 3);
                    C31652b0.this.m97868Q(team);
                }
            } catch (Throwable th3) {
                C31652b0.this.logger.mo85230v("Error getting community: ", th3, new AbstractC30556a.a[0]);
                C31652b0.this.m97844S(false);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rq0.b0$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamManageViewModel$observeConnectivity$1", m100430f = "TeamManageViewModel.kt", m100431l = {275}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f130866w;

        /* JADX INFO: renamed from: rq0.b0$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C31652b0 f130868w;

            public a(C31652b0 c31652b0) {
                this.f130868w = c31652b0;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC18263h abstractC18263h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f130868w.m97844S(abstractC18263h.m52614a());
                return C23454a0.f92919a;
            }
        }

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31652b0.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f130866w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lMo52604a = C31652b0.this.networkMonitor.getNetworkFlow();
                a aVar = new a(C31652b0.this);
                this.f130866w = 1;
                if (interfaceC13058lMo52604a.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rq0.b0$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f130869w;

        public e(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f130869w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f130869w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f130869w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: rq0.b0$f */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"rq0/b0$f", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C31655c0 value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31652b0 f130871x;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Object obj, C31652b0 c31652b0) {
            this.f130871x = c31652b0;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C31655c0 getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C31655c0 value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            this.f130871x.getViewStateLiveData().postValue(this.f130871x.m97841C());
        }
    }

    /* JADX INFO: renamed from: rq0.b0$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamManageViewModel$updateOnServer$1$1", m100430f = "TeamManageViewModel.kt", m100431l = {262}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f130872w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Team f130874y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Team team, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f130874y = team;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31652b0.this.new g(this.f130874y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f130872w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11059g c11059g = C31652b0.this.teamsRepository;
                Team team = this.f130874y;
                Team teamCopy = team.copy((32761 & 1) != 0 ? team.id : 0, (32761 & 2) != 0 ? team.name : AbstractC39414r.m125869O0(C31652b0.this.m97841C().getName()).toString(), (32761 & 4) != 0 ? team.description : AbstractC39414r.m125869O0(C31652b0.this.m97841C().getDescription()).toString(), (32761 & 8) != 0 ? team.iconUrl : null, (32761 & 16) != 0 ? team.bannerUrl : null, (32761 & 32) != 0 ? team.athletePrivacyId : 0, (32761 & 64) != 0 ? team.privacyProfile : null, (32761 & 128) != 0 ? team.enabledTabs : null, (32761 & 256) != 0 ? team.adminId : 0, (32761 & 512) != 0 ? team.teamType : null, (32761 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? team.memberCount : 0, (32761 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? team.rank : 0, (32761 & 4096) != 0 ? team.chatChannel : null, (32761 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? team.chatEnabled : false, (32761 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? team.unreadCount : 0);
                int iM84056g = C31652b0.this.userContext.m84056g();
                this.f130872w = 1;
                if (c11059g.m29812r0(teamCopy, iM84056g, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rq0.b0$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamManageViewModel$updateTeamChatSettings$1$1", m100430f = "TeamManageViewModel.kt", m100431l = {284}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f130875w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Team f130877y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f130878z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Team team, boolean z4, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f130877y = team;
            this.f130878z = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31652b0.this.new h(this.f130877y, this.f130878z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM29814s0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f130875w;
            boolean z4 = true;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11059g c11059g = C31652b0.this.teamsRepository;
                int id4 = this.f130877y.getId();
                boolean z13 = this.f130878z;
                this.f130875w = 1;
                objM29814s0 = c11059g.m29814s0(id4, z13, this);
                if (objM29814s0 == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM29814s0 = obj;
            }
            boolean zBooleanValue = ((Boolean) objM29814s0).booleanValue();
            C31652b0 c31652b0 = C31652b0.this;
            C31655c0 c31655c0M97841C = c31652b0.m97841C();
            if (zBooleanValue) {
                z4 = this.f130878z;
            } else if (this.f130878z) {
                z4 = false;
            }
            c31652b0.m97843R(C31655c0.m97882d(c31655c0M97841C, null, null, false, null, false, null, 0, 0, 0, null, null, null, null, null, null, null, 0, null, 0, z4, 524287, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rq0.b0$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamManageViewModel$uploadBanner$1", m100430f = "TeamManageViewModel.kt", m100431l = {198}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f130879w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Drawable f130881y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Drawable drawable, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f130881y = drawable;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31652b0.this.new i(this.f130881y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f130879w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11059g c11059g = C31652b0.this.teamsRepository;
                Integer id4 = C31652b0.this.m97841C().getId();
                int iIntValue = id4 != null ? id4.intValue() : 0;
                int iM84056g = C31652b0.this.userContext.m84056g();
                Bitmap bitmap = ((BitmapDrawable) this.f130881y).getBitmap();
                AbstractC22676k.m65749i(bitmap, "getBitmap(...)");
                this.f130879w = 1;
                if (c11059g.m29806n0(iIntValue, iM84056g, bitmap, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C31652b0 c31652b0 = C31652b0.this;
            c31652b0.m97843R(C31655c0.m97882d(c31652b0.m97841C(), null, null, false, null, false, null, 0, 0, 0, null, null, null, null, EnumC31649a0.MAIN, null, null, 0, null, 0, false, 1040379, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rq0.b0$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamManageViewModel$uploadBanner$2", m100430f = "TeamManageViewModel.kt", m100431l = {208}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f130882E;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC31687p f130884G;

        /* JADX INFO: renamed from: w */
        Object f130885w;

        /* JADX INFO: renamed from: x */
        Object f130886x;

        /* JADX INFO: renamed from: y */
        Object f130887y;

        /* JADX INFO: renamed from: z */
        int f130888z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC31687p interfaceC31687p, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f130884G = interfaceC31687p;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31652b0.this.new j(this.f130884G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C31652b0 c31652b0;
            Team team;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f130882E;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Team loadedTeam = C31652b0.this.m97841C().getLoadedTeam();
                if (loadedTeam != null) {
                    InterfaceC31687p interfaceC31687p = this.f130884G;
                    C31652b0 c31652b1 = C31652b0.this;
                    String url = ((C31691r) interfaceC31687p).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String();
                    c31652b0 = c31652b1;
                    Team teamCopy = loadedTeam.copy((32761 & 1) != 0 ? loadedTeam.id : 0, (32761 & 2) != 0 ? loadedTeam.name : null, (32761 & 4) != 0 ? loadedTeam.description : null, (32761 & 8) != 0 ? loadedTeam.iconUrl : null, (32761 & 16) != 0 ? loadedTeam.bannerUrl : url, (32761 & 32) != 0 ? loadedTeam.athletePrivacyId : 0, (32761 & 64) != 0 ? loadedTeam.privacyProfile : null, (32761 & 128) != 0 ? loadedTeam.enabledTabs : null, (32761 & 256) != 0 ? loadedTeam.adminId : 0, (32761 & 512) != 0 ? loadedTeam.teamType : null, (32761 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? loadedTeam.memberCount : 0, (32761 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? loadedTeam.rank : 0, (32761 & 4096) != 0 ? loadedTeam.chatChannel : null, (32761 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? loadedTeam.chatEnabled : false, (32761 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? loadedTeam.unreadCount : 0);
                    C11059g c11059g = c31652b0.teamsRepository;
                    int iM84056g = c31652b0.userContext.m84056g();
                    this.f130885w = c31652b0;
                    this.f130886x = null;
                    this.f130887y = teamCopy;
                    this.f130888z = 0;
                    this.f130882E = 1;
                    if (c11059g.m29812r0(teamCopy, iM84056g, this) == enumC31071a) {
                        return enumC31071a;
                    }
                    team = teamCopy;
                }
                C31652b0 c31652b2 = C31652b0.this;
                c31652b2.m97843R(C31655c0.m97882d(c31652b2.m97841C(), null, null, false, null, false, null, 0, 0, 0, null, null, null, null, EnumC31649a0.MAIN, null, null, 0, null, 0, false, 1040379, null));
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Team team2 = (Team) this.f130887y;
            c31652b0 = (C31652b0) this.f130885w;
            AbstractC34132o.m107864I(obj);
            team = team2;
            c31652b0.m97843R(C31655c0.m97882d(c31652b0.m97841C(), null, null, false, team, false, null, 0, 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048567, null));
            C31652b0 c31652b3 = C31652b0.this;
            c31652b3.m97843R(C31655c0.m97882d(c31652b3.m97841C(), null, null, false, null, false, null, 0, 0, 0, null, null, null, null, EnumC31649a0.MAIN, null, null, 0, null, 0, false, 1040379, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rq0.b0$k */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamManageViewModel$uploadLogo$1", m100430f = "TeamManageViewModel.kt", m100431l = {225}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f130889w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Drawable f130891y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Drawable drawable, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f130891y = drawable;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31652b0.this.new k(this.f130891y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f130889w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11059g c11059g = C31652b0.this.teamsRepository;
                Integer id4 = C31652b0.this.m97841C().getId();
                int iIntValue = id4 != null ? id4.intValue() : 0;
                int iM84056g = C31652b0.this.userContext.m84056g();
                Bitmap bitmap = ((BitmapDrawable) this.f130891y).getBitmap();
                AbstractC22676k.m65749i(bitmap, "getBitmap(...)");
                this.f130889w = 1;
                if (c11059g.m29810q0(iIntValue, iM84056g, bitmap, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C31652b0 c31652b0 = C31652b0.this;
            c31652b0.m97843R(C31655c0.m97882d(c31652b0.m97841C(), null, null, false, null, false, null, 0, 0, 0, null, null, null, null, EnumC31649a0.MAIN, null, null, 0, null, 0, false, 1040379, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rq0.b0$l */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamManageViewModel$uploadLogo$2", m100430f = "TeamManageViewModel.kt", m100431l = {235}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f130892E;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC31687p f130894G;

        /* JADX INFO: renamed from: w */
        Object f130895w;

        /* JADX INFO: renamed from: x */
        Object f130896x;

        /* JADX INFO: renamed from: y */
        Object f130897y;

        /* JADX INFO: renamed from: z */
        int f130898z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC31687p interfaceC31687p, InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f130894G = interfaceC31687p;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31652b0.this.new l(this.f130894G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C31652b0 c31652b0;
            Team team;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f130892E;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Team loadedTeam = C31652b0.this.m97841C().getLoadedTeam();
                if (loadedTeam != null) {
                    InterfaceC31687p interfaceC31687p = this.f130894G;
                    C31652b0 c31652b1 = C31652b0.this;
                    String url = ((C31691r) interfaceC31687p).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String();
                    c31652b0 = c31652b1;
                    Team teamCopy = loadedTeam.copy((32761 & 1) != 0 ? loadedTeam.id : 0, (32761 & 2) != 0 ? loadedTeam.name : null, (32761 & 4) != 0 ? loadedTeam.description : null, (32761 & 8) != 0 ? loadedTeam.iconUrl : url, (32761 & 16) != 0 ? loadedTeam.bannerUrl : null, (32761 & 32) != 0 ? loadedTeam.athletePrivacyId : 0, (32761 & 64) != 0 ? loadedTeam.privacyProfile : null, (32761 & 128) != 0 ? loadedTeam.enabledTabs : null, (32761 & 256) != 0 ? loadedTeam.adminId : 0, (32761 & 512) != 0 ? loadedTeam.teamType : null, (32761 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? loadedTeam.memberCount : 0, (32761 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? loadedTeam.rank : 0, (32761 & 4096) != 0 ? loadedTeam.chatChannel : null, (32761 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? loadedTeam.chatEnabled : false, (32761 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? loadedTeam.unreadCount : 0);
                    C11059g c11059g = c31652b0.teamsRepository;
                    int iM84056g = c31652b0.userContext.m84056g();
                    this.f130895w = c31652b0;
                    this.f130896x = null;
                    this.f130897y = teamCopy;
                    this.f130898z = 0;
                    this.f130892E = 1;
                    if (c11059g.m29812r0(teamCopy, iM84056g, this) == enumC31071a) {
                        return enumC31071a;
                    }
                    team = teamCopy;
                }
                C31652b0 c31652b2 = C31652b0.this;
                c31652b2.m97843R(C31655c0.m97882d(c31652b2.m97841C(), null, null, false, null, false, null, 0, 0, 0, null, null, null, null, EnumC31649a0.MAIN, null, null, 0, null, 0, false, 1040379, null));
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Team team2 = (Team) this.f130897y;
            c31652b0 = (C31652b0) this.f130895w;
            AbstractC34132o.m107864I(obj);
            team = team2;
            c31652b0.m97843R(C31655c0.m97882d(c31652b0.m97841C(), null, null, false, team, false, null, 0, 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048567, null));
            C31652b0 c31652b3 = C31652b0.this;
            c31652b3.m97843R(C31655c0.m97882d(c31652b3.m97841C(), null, null, false, null, false, null, 0, 0, 0, null, null, null, null, EnumC31649a0.MAIN, null, null, 0, null, 0, false, 1040379, null));
            return C23454a0.f92919a;
        }
    }

    public C31652b0(StringsRepository stringsRepository, C11059g teamsRepository, InterfaceC34116n logger, C27858u userContext, FeatureFlagRepository featureFlagRepository, InterfaceC18260e networkMonitor) {
        AbstractC22676k.m65750j(stringsRepository, "stringsRepository");
        AbstractC22676k.m65750j(teamsRepository, "teamsRepository");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        AbstractC22676k.m65750j(networkMonitor, "networkMonitor");
        this.stringsRepository = stringsRepository;
        this.teamsRepository = teamsRepository;
        this.logger = logger;
        this.userContext = userContext;
        this.featureFlagRepository = featureFlagRepository;
        this.networkMonitor = networkMonitor;
        this.viewStateLiveData = new C1630u0();
        this.viewState = new f(new C31655c0(null, null, false, null, false, null, 0, 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048575, null), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final C31655c0 m97841C() {
        return (C31655c0) this.viewState.getValue(this, f130844K[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m97842F(C31652b0 c31652b0, Resource resource) {
        DefaultImages defaultImages = (DefaultImages) resource.getData();
        if (defaultImages != null) {
            c31652b0.m97843R(C31655c0.m97882d(c31652b0.m97841C(), null, null, false, null, false, null, 0, 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048575, null).m97884A(defaultImages.getBanners()).m97885B(defaultImages.getAvatars()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public final void m97843R(C31655c0 c31655c0) {
        this.viewState.setValue(this, f130844K[0], c31655c0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public final void m97844S(boolean isConnected) {
        Integer id4;
        TeamType teamType;
        if (isConnected != m97841C().getIsConnected()) {
            m97843R(C31655c0.m97882d(m97841C(), null, null, isConnected, null, isConnected, null, 0, 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048555, null));
            if (!isConnected || (id4 = m97841C().getId()) == null) {
                return;
            }
            int iIntValue = id4.intValue();
            Team loadedTeam = m97841C().getLoadedTeam();
            if (loadedTeam == null || (teamType = loadedTeam.getTeamType()) == null) {
                teamType = TeamType.COMMUNITY;
            }
            m97861I(iIntValue, teamType);
        }
    }

    /* JADX INFO: renamed from: W */
    private final void m97845W() {
        Team loadedTeam = m97841C().getLoadedTeam();
        if (loadedTeam != null) {
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new g(loadedTeam, null), 3);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m97855A() {
        m97843R(C31655c0.m97882d(m97841C(), null, null, false, null, false, null, 0, 0, 0, null, null, null, null, EnumC31649a0.LOGO_PICK, null, null, 0, null, 0, false, 1040383, null));
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final Team getManageTeam() {
        return this.manageTeam;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final C1630u0 getViewStateLiveData() {
        return this.viewStateLiveData;
    }

    /* JADX INFO: renamed from: E */
    public final void m97858E() {
        this.teamsRepository.m29776C().observeForever(new e(new C31703x(this, 1)));
    }

    /* JADX INFO: renamed from: G */
    public final void m97859G() {
        m97843R(C31655c0.m97882d(m97841C(), null, null, false, null, false, null, 0, 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048379, null));
    }

    /* JADX INFO: renamed from: H */
    public final void m97860H(String bannerUrl, String logoUrl) {
        AbstractC22676k.m65750j(bannerUrl, "bannerUrl");
        AbstractC22676k.m65750j(logoUrl, "logoUrl");
        C31655c0 c31655c0M97882d = C31655c0.m97882d(m97841C(), null, null, false, null, false, null, 0, 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048571, null);
        int i13 = -1;
        int i14 = 0;
        for (Object obj : m97841C().m97892h()) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            InterfaceC31687p interfaceC31687p = (InterfaceC31687p) obj;
            if ((interfaceC31687p instanceof C31691r) && AbstractC22676k.m65745e(((C31691r) interfaceC31687p).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String(), bannerUrl)) {
                i13 = i14;
            }
            i14 = i15;
        }
        C31655c0 c31655c0M97882d2 = i13 >= 0 ? C31655c0.m97882d(c31655c0M97882d, null, null, false, null, false, null, i13, 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048511, null) : C31655c0.m97882d(c31655c0M97882d, null, null, false, null, false, null, 0, 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048575, null).m97909z(bannerUrl);
        int i16 = -1;
        int i17 = -1;
        int i18 = 0;
        for (Object obj2 : m97841C().m97903s()) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            int i24 = 0;
            for (Object obj3 : (List) obj2) {
                int i25 = i24 + 1;
                if (i24 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                InterfaceC31687p interfaceC31687p2 = (InterfaceC31687p) obj3;
                if ((interfaceC31687p2 instanceof C31691r) && AbstractC22676k.m65745e(((C31691r) interfaceC31687p2).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String(), logoUrl)) {
                    i16 = i18;
                    i17 = i24;
                }
                i24 = i25;
            }
            i18 = i19;
        }
        m97843R(i16 >= 0 ? C31655c0.m97882d(c31655c0M97882d2, null, null, false, null, false, null, 0, i16, i17, null, null, null, null, null, null, null, 0, null, 0, false, 1048191, null) : C31655c0.m97882d(c31655c0M97882d2, null, null, false, null, false, null, 0, 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048575, null).m97887D(logoUrl));
    }

    /* JADX INFO: renamed from: I */
    public final void m97861I(int newId, TeamType teamType) {
        AbstractC22676k.m65750j(teamType, "teamType");
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new c(newId, teamType, null), 3);
    }

    /* JADX INFO: renamed from: K */
    public final void m97862K() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new d(null), 3);
    }

    /* JADX INFO: renamed from: L */
    public final void m97863L() {
        m97843R(C31655c0.m97882d(m97841C(), null, null, true, null, false, null, 0, 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 999419, null));
    }

    /* JADX INFO: renamed from: M */
    public final void m97864M(Drawable newBanner) {
        AbstractC22676k.m65750j(newBanner, "newBanner");
        m97843R(C31655c0.m97882d(m97841C().m97908y(newBanner), null, null, false, null, false, null, 0, 0, 0, null, null, null, null, EnumC31649a0.BANNER_PICK, null, null, 0, null, 0, false, 1038335, null));
    }

    /* JADX INFO: renamed from: N */
    public final void m97865N(Drawable newLogo) {
        AbstractC22676k.m65750j(newLogo, "newLogo");
        m97843R(C31655c0.m97882d(m97841C().m97886C(newLogo), null, null, false, null, false, null, 0, 0, 0, null, null, null, null, EnumC31649a0.LOGO_PICK, null, null, 0, null, 0, false, 1036287, null));
    }

    /* JADX INFO: renamed from: O */
    public final void m97866O(int newLogoIndex) {
        m97843R(C31655c0.m97882d(m97841C(), null, null, false, null, false, null, 0, newLogoIndex, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048447, null));
    }

    /* JADX INFO: renamed from: P */
    public final void m97867P(int newLogoVariantIndex) {
        m97843R(C31655c0.m97882d(m97841C(), null, null, false, null, false, null, 0, 0, newLogoVariantIndex, null, null, null, null, null, null, null, 0, null, 0, false, 1048319, null));
    }

    /* JADX INFO: renamed from: Q */
    public final void m97868Q(Team team) {
        this.manageTeam = team;
    }

    /* JADX INFO: renamed from: U */
    public final void m97869U(String newDescription) {
        AbstractC22676k.m65750j(newDescription, "newDescription");
        m97843R(C31655c0.m97882d(m97841C(), null, null, false, null, false, newDescription, 0, 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048543, null));
        m97845W();
    }

    /* JADX INFO: renamed from: V */
    public final void m97870V(String newName) {
        AbstractC22676k.m65750j(newName, "newName");
        m97843R(C31655c0.m97882d(m97841C(), null, newName, false, null, false, null, 0, 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048573, null));
        m97845W();
    }

    /* JADX INFO: renamed from: X */
    public final void m97871X(boolean chatEnabled) {
        Team loadedTeam = m97841C().getLoadedTeam();
        if (loadedTeam != null) {
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new h(loadedTeam, chatEnabled, null), 3);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m97872Y() {
        InterfaceC31687p interfaceC31687p = m97841C().m97892h().get(m97841C().getBannerIndex());
        AbstractC22676k.m65749i(interfaceC31687p, "get(...)");
        InterfaceC31687p interfaceC31687p2 = interfaceC31687p;
        if (!(interfaceC31687p2 instanceof C31689q)) {
            if (!(interfaceC31687p2 instanceof C31691r)) {
                throw new IllegalArgumentException("team banner could not be uploaded");
            }
            m97843R(C31655c0.m97882d(m97841C(), null, null, true, null, false, null, 0, 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048571, null));
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new j(interfaceC31687p2, null), 3);
            return;
        }
        Drawable drawable = ((C31689q) interfaceC31687p2).getDrawable();
        if (drawable instanceof BitmapDrawable) {
            m97843R(C31655c0.m97882d(m97841C(), null, null, true, null, false, null, 0, 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048571, null));
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new i(drawable, null), 3);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m97873Z() {
        InterfaceC31687p interfaceC31687p = m97841C().m97903s().get(m97841C().getLogoIndex()).get(m97841C().getLogoVariantIndex());
        if (!(interfaceC31687p instanceof C31689q)) {
            if (!(interfaceC31687p instanceof C31691r)) {
                throw new IllegalArgumentException("team logo could not be uploaded");
            }
            m97843R(C31655c0.m97882d(m97841C(), null, null, true, null, false, null, 0, 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048571, null));
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new l(interfaceC31687p, null), 3);
            return;
        }
        Drawable drawable = ((C31689q) interfaceC31687p).getDrawable();
        if (drawable instanceof BitmapDrawable) {
            m97843R(C31655c0.m97882d(m97841C(), null, null, true, null, false, null, 0, 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048571, null));
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new k(drawable, null), 3);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m97874u(int direction) {
        int bannerIndex = m97841C().getBannerIndex() + direction;
        if (bannerIndex > AbstractC37056f.m118951C(m97841C().m97892h())) {
            bannerIndex = 0;
        }
        if (bannerIndex < 0) {
            bannerIndex = AbstractC37056f.m118951C(m97841C().m97892h());
        }
        m97843R(C31655c0.m97882d(m97841C(), null, null, false, null, false, null, bannerIndex, 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048511, null));
    }

    /* JADX INFO: renamed from: v */
    public final void m97875v(Bitmap photo) {
        C31655c0 c31655c0M97882d;
        AbstractC22676k.m65750j(photo, "photo");
        if (this.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.DROID_COMPRESS_IMAGE)) {
            c31655c0M97882d = C31655c0.m97882d(m97841C(), null, null, false, null, false, null, 0, 0, 0, null, null, AbstractC36279c.m115966a(photo), null, EnumC31649a0.BANNER_CROP, null, null, 0, null, 0, false, 1038335, null);
        } else {
            c31655c0M97882d = C31655c0.m97882d(m97841C(), null, null, false, null, false, null, 0, 0, 0, null, null, photo, null, EnumC31649a0.BANNER_CROP, null, null, 0, null, 0, false, 1038335, null);
        }
        m97843R(c31655c0M97882d);
    }

    /* JADX INFO: renamed from: w */
    public final void m97876w(Bitmap photo) {
        C31655c0 c31655c0M97882d;
        AbstractC22676k.m65750j(photo, "photo");
        if (this.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.DROID_COMPRESS_IMAGE)) {
            c31655c0M97882d = C31655c0.m97882d(m97841C(), null, null, false, null, false, null, 0, 0, 0, null, null, null, AbstractC36279c.m115966a(photo), EnumC31649a0.LOGO_CROP, null, null, 0, null, 0, false, 1036287, null);
        } else {
            c31655c0M97882d = C31655c0.m97882d(m97841C(), null, null, false, null, false, null, 0, 0, 0, null, null, null, photo, EnumC31649a0.LOGO_CROP, null, null, 0, null, 0, false, 1036287, null);
        }
        m97843R(c31655c0M97882d);
    }

    /* JADX INFO: renamed from: y */
    public final void m97877y() {
        m97843R(C31655c0.m97882d(m97841C(), null, null, true, null, false, null, 0, 0, 0, null, null, null, null, null, null, null, 0, null, 0, false, 1048571, null));
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new b(null), 3);
    }

    /* JADX INFO: renamed from: z */
    public final void m97878z() {
        m97843R(C31655c0.m97882d(m97841C(), null, null, false, null, false, null, 0, 0, 0, null, null, null, null, EnumC31649a0.BANNER_PICK, null, null, 0, null, 0, false, 1040383, null));
    }
}
