package oq0;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.commons.Resource;
import com.whoop.data.remote.commons.Status;
import com.whoop.domain.exception.InviteCodeException;
import com.whoop.domain.model.Invitation;
import com.whoop.domain.model.teams.DrawerDisplayInvite;
import com.whoop.domain.model.teams.Team;
import com.whoop.network.exception.DomainException;
import cq0.C11054b;
import cq0.C11059g;
import e50.C12724c;
import f93.InterfaceC14292d;
import ge3.AbstractC15751g;
import i92.InterfaceC18260e;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import java.util.Locale;
import l83.C23454a0;
import l83.C23465k;
import or2.C28196r0;
import or2.C28199s0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t83.InterfaceC33616a;
import tr2.InterfaceC34116n;
import xp0.AbstractC38505d0;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: oq0.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001PB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010\u001fJ\u0019\u0010#\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000eH\u0002¢\u0006\u0004\b%\u0010\u0010J\u0019\u0010'\u001a\u00020\u000e2\b\b\u0001\u0010&\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000eH\u0002¢\u0006\u0004\b)\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00102R\u0017\u00106\u001a\u0002038\u0006¢\u0006\f\n\u0004\b\u0018\u00104\u001a\u0004\b*\u00105R\u0017\u00108\u001a\u0002038\u0006¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b7\u00105R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020:098\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b.\u0010<R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020>098\u0006¢\u0006\f\n\u0004\b \u0010;\u001a\u0004\b0\u0010<R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\u0016098\u0006¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u0010<R\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020D0C8\u0006¢\u0006\f\n\u0004\b\u001e\u0010E\u001a\u0004\bF\u0010GR+\u0010O\u001a\u00020D2\u0006\u0010I\u001a\u00020D8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006Q"}, m65681d2 = {"Loq0/k;", "Landroidx/lifecycle/w1;", "Ltr2/n;", "logger", "Lcq0/b;", "invitationRepository", "Li92/e;", "networkMonitor", "Lcq0/g;", "teamsRepository", "", "pause", "<init>", "(Ltr2/n;Lcq0/b;Li92/e;Lcq0/g;Ljava/lang/Long;)V", "Ll83/a0;", "H", "()V", "", "inviteCode", "G", "(Ljava/lang/CharSequence;)V", "Ll83/k;", "", "Loq0/k$a;", "F", "(Ljava/lang/CharSequence;)Ll83/k;", "O", "", "E", "(Ljava/lang/CharSequence;)Ljava/lang/String;", "K", "(Ljava/lang/String;)V", "I", "Lcom/whoop/network/exception/DomainException$b;", "reason", "L", "(Lcom/whoop/network/exception/DomainException$b;)I", "u", "errorId", "N", "(I)V", "D", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltr2/n;", "x", "Lcq0/b;", "y", "Li92/e;", "z", "Lcq0/g;", "Ljava/lang/Long;", "Lor2/r0;", "Lor2/r0;", "()Lor2/r0;", "actionHideKeyboard", "v", "actionClearFocus", "Lor2/s0;", "Lcom/whoop/domain/model/Invitation;", "Lor2/s0;", "()Lor2/s0;", "actionNavigateToJoinTeamActivity", "Lcom/whoop/domain/model/teams/DrawerDisplayInvite;", "actionNavigateToTeamsShowInviteActivity", "J", "A", "actionShowToast", "Le50/c;", "Loq0/m;", "Le50/c;", "C", "()Le50/c;", "viewStateLiveData", "<set-?>", "Lf93/d;", "B", "()Loq0/m;", "M", "(Loq0/m;)V", "viewState", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28114k extends AbstractC1637w1 {

    /* JADX INFO: renamed from: M */
    static final /* synthetic */ InterfaceC21493z[] f113717M = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C28114k.class, "viewState", "getViewState()Lcom/whoop/community/presentation/login/JoinTeamLandingViewState;", 0))};

    /* JADX INFO: renamed from: N */
    public static final int f113718N = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final Long pause;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C28196r0 actionHideKeyboard;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C28196r0 actionClearFocus;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C28199s0<Invitation> actionNavigateToJoinTeamActivity;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C28199s0<DrawerDisplayInvite> actionNavigateToTeamsShowInviteActivity;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C28199s0<Integer> actionShowToast;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C12724c<C28116m> viewStateLiveData;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC14292d viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C11054b invitationRepository;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC18260e networkMonitor;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C11059g teamsRepository;

    /* JADX INFO: renamed from: oq0.k$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Loq0/k$a;", "", "<init>", "(Ljava/lang/String;I)V", "LEGACY_ELITE", "COMMUNITY", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum a {
        LEGACY_ELITE,
        COMMUNITY;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: oq0.k$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f113731a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.LEGACY_ELITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.COMMUNITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f113731a = iArr;
        }
    }

    /* JADX INFO: renamed from: oq0.k$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.login.JoinTeamLandingViewModel$processCommunityInvite$1", m100430f = "JoinTeamLandingViewModel.kt", m100431l = {131}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113732w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f113734y;

        /* JADX INFO: renamed from: oq0.k$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f113735a;

            static {
                int[] iArr = new int[Status.values().length];
                try {
                    iArr[Status.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Status.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Status.LOADING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f113735a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113734y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C28114k.this.new c(this.f113734y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113732w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C28114k c28114k = C28114k.this;
                c28114k.m84992M(C28116m.m85016b(c28114k.m84986B(), true, null, null, 0, null, null, false, 126, null));
                C11059g c11059g = C28114k.this.teamsRepository;
                String str = this.f113734y;
                Locale locale = Locale.getDefault();
                AbstractC22676k.m65749i(locale, "getDefault(...)");
                String upperCase = str.toUpperCase(locale);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                this.f113732w = 1;
                obj = c11059g.m29820x(upperCase, this);
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
            C28114k c28114k2 = C28114k.this;
            c28114k2.m84992M(C28116m.m85016b(c28114k2.m84986B(), false, null, null, 0, null, null, false, 126, null));
            int i14 = a.f113735a[resource.getStatus().ordinal()];
            if (i14 == 1) {
                Team team = (Team) resource.getData();
                if (team != null) {
                    C28114k.this.m85013z().m85347e(new DrawerDisplayInvite(0, "", team.getId(), team.getName(), team.getIconUrl(), team.getAdminId(), "", this.f113734y));
                } else {
                    C28114k.this.logger.mo85232x("Community_InviteCode_Create", "team data is null", new AbstractC30556a.a[0]);
                }
            } else if (i14 == 2) {
                InterfaceC34116n interfaceC34116n = C28114k.this.logger;
                DomainException exception = resource.getException();
                AbstractC22676k.m65747g(exception);
                interfaceC34116n.mo85224o("Community_InviteCode_Create", "Failed to verify invite code", exception, new AbstractC30556a.a[0]);
                C28114k c28114k3 = C28114k.this;
                DomainException exception2 = resource.getException();
                AbstractC22676k.m65747g(exception2);
                c28114k3.m84993N(c28114k3.m84991L(exception2.getReason()));
                if (!C28114k.this.networkMonitor.isConnected()) {
                    C28114k.this.m85005A().m85347e(new Integer(AbstractC38505d0.f165584H));
                }
            } else if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: oq0.k$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.login.JoinTeamLandingViewModel$processLegacyInvite$1", m100430f = "JoinTeamLandingViewModel.kt", m100431l = {104, 105}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f113736E;

        /* JADX INFO: renamed from: w */
        long f113737w;

        /* JADX INFO: renamed from: x */
        int f113738x;

        /* JADX INFO: renamed from: y */
        int f113739y;

        /* JADX INFO: renamed from: oq0.k$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f113741a;

            static {
                int[] iArr = new int[Status.values().length];
                try {
                    iArr[Status.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Status.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Status.LOADING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f113741a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113736E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C28114k.this.new d(this.f113736E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
        
            if (r2 == r1) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oq0.C28114k.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: oq0.k$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"oq0/k$e", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C28116m value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C28114k f113743x;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Object obj, C28114k c28114k) {
            this.f113743x = c28114k;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C28116m getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C28116m value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            this.f113743x.m85006C().postValue(this.f113743x.m84986B());
        }
    }

    public C28114k(InterfaceC34116n logger, C11054b invitationRepository, InterfaceC18260e networkMonitor, C11059g teamsRepository, Long l7) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(invitationRepository, "invitationRepository");
        AbstractC22676k.m65750j(networkMonitor, "networkMonitor");
        AbstractC22676k.m65750j(teamsRepository, "teamsRepository");
        this.logger = logger;
        this.invitationRepository = invitationRepository;
        this.networkMonitor = networkMonitor;
        this.teamsRepository = teamsRepository;
        this.pause = l7;
        this.actionHideKeyboard = new C28196r0();
        this.actionClearFocus = new C28196r0();
        this.actionNavigateToJoinTeamActivity = new C28199s0<>();
        this.actionNavigateToTeamsShowInviteActivity = new C28199s0<>();
        this.actionShowToast = new C28199s0<>();
        this.viewStateLiveData = new C12724c<>();
        this.viewState = new e(new C28116m(false, null, null, 0, null, null, false, 127, null), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final C28116m m84986B() {
        return (C28116m) this.viewState.getValue(this, f113717M[0]);
    }

    /* JADX INFO: renamed from: D */
    private final void m84987D() {
        m84992M(C28116m.m85016b(m84986B(), false, null, null, 8, null, null, false, 115, null));
    }

    /* JADX INFO: renamed from: E */
    private final String m84988E(CharSequence inviteCode) {
        String string = inviteCode.toString();
        if (string.length() == 5 && string.charAt(4) == '-') {
            return string;
        }
        String strM125926K = AbstractC39421y.m125926K(string, "-", "", false);
        if (strM125926K.length() <= 4) {
            return strM125926K;
        }
        String strSubstring = strM125926K.substring(0, 4);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        String strSubstring2 = strM125926K.substring(4);
        AbstractC22676k.m65749i(strSubstring2, "substring(...)");
        return AbstractC18489d0.m53370k(strSubstring, "-", strSubstring2);
    }

    /* JADX INFO: renamed from: I */
    private final void m84989I(String inviteCode) {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new c(inviteCode, null), 3);
    }

    /* JADX INFO: renamed from: K */
    private final void m84990K(String inviteCode) {
        m85004u();
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new d(inviteCode, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final int m84991L(DomainException.InterfaceC9606b reason) {
        if (reason == InviteCodeException.EnumC8700a.CODE_NOT_VALID) {
            return AbstractC38505d0.f165574D1;
        }
        if (reason == InviteCodeException.EnumC8700a.COMMUNITY_CODE_NOT_VALID) {
            return AbstractC38505d0.f165577E1;
        }
        if (reason == InviteCodeException.EnumC8700a.CODE_TYPE_MISMATCH) {
            return AbstractC38505d0.f165583G1;
        }
        return (reason == DomainException.EnumC9607c.NETWORK_ERROR || reason == DomainException.EnumC9607c.HTTP_ERROR) ? AbstractC38505d0.f165581G : AbstractC38505d0.f165587I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final void m84992M(C28116m c28116m) {
        this.viewState.setValue(this, f113717M[0], c28116m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public final void m84993N(int errorId) {
        m84992M(C28116m.m85016b(m84986B(), false, null, Integer.valueOf(errorId), 0, null, null, false, 115, null));
    }

    /* JADX INFO: renamed from: O */
    private final void m84994O() {
        String inviteCode = m84986B().getInviteCode();
        C23465k c23465kM85007F = m85007F(inviteCode);
        Integer num = (Integer) c23465kM85007F.f92937w;
        a aVar = (a) c23465kM85007F.f92938x;
        if (num != null) {
            m84993N(num.intValue());
            return;
        }
        int i13 = aVar == null ? -1 : b.f113731a[aVar.ordinal()];
        if (i13 != -1) {
            if (i13 == 1) {
                m84990K(inviteCode);
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                m84989I(inviteCode);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    private final void m85004u() {
        this.actionHideKeyboard.m85330e();
        m84987D();
        this.actionClearFocus.m85330e();
    }

    /* JADX INFO: renamed from: A */
    public final C28199s0<Integer> m85005A() {
        return this.actionShowToast;
    }

    /* JADX INFO: renamed from: C */
    public final C12724c<C28116m> m85006C() {
        return this.viewStateLiveData;
    }

    /* JADX INFO: renamed from: F */
    public final C23465k m85007F(CharSequence inviteCode) {
        AbstractC22676k.m65750j(inviteCode, "inviteCode");
        if (AbstractC28115l.f113744a.matcher(inviteCode).matches()) {
            return new C23465k(null, a.LEGACY_ELITE);
        }
        if (AbstractC28115l.f113745b.matcher(inviteCode).matches()) {
            return new C23465k(null, a.COMMUNITY);
        }
        return (inviteCode.length() == 9 || inviteCode.length() == 11) ? new C23465k(Integer.valueOf(AbstractC38505d0.f165571C1), null) : new C23465k(Integer.valueOf(AbstractC38505d0.f165580F1), null);
    }

    /* JADX INFO: renamed from: G */
    public final void m85008G(CharSequence inviteCode) {
        AbstractC22676k.m65750j(inviteCode, "inviteCode");
        m84992M(C28116m.m85016b(m84986B(), false, m84988E(inviteCode), null, 0, Integer.valueOf(m84988E(inviteCode).length()), null, false, 109, null));
        m84987D();
    }

    /* JADX INFO: renamed from: H */
    public final void m85009H() {
        m84994O();
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final C28196r0 getActionClearFocus() {
        return this.actionClearFocus;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final C28196r0 getActionHideKeyboard() {
        return this.actionHideKeyboard;
    }

    /* JADX INFO: renamed from: y */
    public final C28199s0<Invitation> m85012y() {
        return this.actionNavigateToJoinTeamActivity;
    }

    /* JADX INFO: renamed from: z */
    public final C28199s0<DrawerDisplayInvite> m85013z() {
        return this.actionNavigateToTeamsShowInviteActivity;
    }

    public /* synthetic */ C28114k(InterfaceC34116n interfaceC34116n, C11054b c11054b, InterfaceC18260e interfaceC18260e, C11059g c11059g, Long l7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC34116n, c11054b, interfaceC18260e, c11059g, (i13 & 16) != 0 ? null : l7);
    }
}
