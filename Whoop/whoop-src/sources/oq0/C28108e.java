package oq0;

import android.net.Uri;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.commons.Resource;
import com.whoop.data.remote.commons.Status;
import com.whoop.data.repositories.StringsRepository;
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
import nf1.AbstractC26666g;
import or2.C28180m;
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
import xp0.AbstractC38529z;
import yb3.AbstractC39421y;
import z82.C40191e;

/* JADX INFO: renamed from: oq0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001lBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010\u0016J\u0015\u0010\"\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J'\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0006\u0012\u0004\u0018\u00010&0$2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0014H\u0002¢\u0006\u0004\b+\u0010\u0016J\u0017\u0010,\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0017H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0017H\u0002¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020\u0014H\u0002¢\u0006\u0004\b/\u0010\u0016J\u0019\u00102\u001a\u00020%2\b\u00101\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u00020\u00142\b\b\u0001\u00104\u001a\u00020%H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0014H\u0002¢\u0006\u0004\b7\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010@R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010ER\"\u0010L\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0017\u0010Q\u001a\u00020M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\b<\u0010PR\u0017\u0010R\u001a\u00020M8\u0006¢\u0006\f\n\u0004\b'\u0010O\u001a\u0004\b8\u0010PR\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020%0S8\u0006¢\u0006\f\n\u0004\bH\u0010T\u001a\u0004\bU\u0010VR\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00190S8\u0006¢\u0006\f\n\u0004\b\u0015\u0010T\u001a\u0004\b>\u0010VR\u001d\u0010[\u001a\b\u0012\u0004\u0012\u00020Y0S8\u0006¢\u0006\f\n\u0004\b\u001b\u0010T\u001a\u0004\bZ\u0010VR\u001d\u0010^\u001a\b\u0012\u0004\u0012\u00020\\0S8\u0006¢\u0006\f\n\u0004\b\"\u0010T\u001a\u0004\b]\u0010VR\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020\\0S8\u0006¢\u0006\f\n\u0004\b\u001f\u0010T\u001a\u0004\b_\u0010VR\u001d\u0010e\u001a\b\u0012\u0004\u0012\u00020b0a8\u0006¢\u0006\f\n\u0004\b.\u0010c\u001a\u0004\bC\u0010dR+\u0010k\u001a\u00020b2\u0006\u0010f\u001a\u00020b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010g\u001a\u0004\bA\u0010h\"\u0004\bi\u0010j¨\u0006m"}, m65681d2 = {"Loq0/e;", "Landroidx/lifecycle/w1;", "Lz82/e;", "eventDispatcher", "Ltr2/n;", "logger", "Lcom/whoop/data/repositories/StringsRepository;", "stringRepo", "Lcq0/b;", "invitationRepository", "Li92/e;", "networkMonitor", "Lcq0/g;", "teamsRepository", "", "pause", "Lbc3/c0;", "coroutineScope", "<init>", "(Lz82/e;Ltr2/n;Lcom/whoop/data/repositories/StringsRepository;Lcq0/b;Li92/e;Lcq0/g;Ljava/lang/Long;Lbc3/c0;)V", "Ll83/a0;", "M", "()V", "", "action", "Landroid/net/Uri;", "uri", "N", "(Ljava/lang/String;Landroid/net/Uri;)V", "E", "(Landroid/net/Uri;)Ljava/lang/String;", "P", "", "inviteCode", "O", "(Ljava/lang/CharSequence;)V", "Ll83/k;", "", "Loq0/e$a;", "K", "(Ljava/lang/CharSequence;)Ll83/k;", "I", "(Ljava/lang/CharSequence;)Ljava/lang/String;", "X", "R", "(Ljava/lang/String;)V", "Q", "v", "Lcom/whoop/network/exception/DomainException$b;", "reason", "S", "(Lcom/whoop/network/exception/DomainException$b;)I", "errorId", "W", "(I)V", "H", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lz82/e;", "x", "Ltr2/n;", "y", "Lcom/whoop/data/repositories/StringsRepository;", "z", "Lcq0/b;", "Li92/e;", "F", "Lcq0/g;", "G", "Ljava/lang/Long;", "Lbc3/c0;", "", "Z", "L", "()Z", "U", "(Z)V", "isInAppMessage", "Lor2/r0;", "J", "Lor2/r0;", "()Lor2/r0;", "actionHideKeyboard", "actionClearFocus", "Lor2/s0;", "Lor2/s0;", "D", "()Lor2/s0;", "actionShowToast", "actionLaunchViewUri", "Lcom/whoop/domain/model/Invitation;", "B", "actionNavigateToJoinTeamActivity", "Lcom/whoop/domain/model/teams/DrawerDisplayInvite;", "A", "actionNavigateToHomeActivity", "C", "actionNavigateToTeamsShowInviteActivity", "Le50/c;", "Loq0/g;", "Le50/c;", "()Le50/c;", "viewStateLiveData", "<set-?>", "Lf93/d;", "()Loq0/g;", "V", "(Loq0/g;)V", "viewState", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28108e extends AbstractC1637w1 {

    /* JADX INFO: renamed from: S */
    static final /* synthetic */ InterfaceC21493z[] f113668S = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C28108e.class, "viewState", "getViewState()Lcom/whoop/community/presentation/login/InviteCodeViewState;", 0))};

    /* JADX INFO: renamed from: T */
    public static final int f113669T = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC18260e networkMonitor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C11059g teamsRepository;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final Long pause;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean isInAppMessage;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C28196r0 actionHideKeyboard;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C28196r0 actionClearFocus;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final C28199s0<Integer> actionShowToast;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final C28199s0<Uri> actionLaunchViewUri;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final C28199s0<Invitation> actionNavigateToJoinTeamActivity;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final C28199s0<DrawerDisplayInvite> actionNavigateToHomeActivity;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final C28199s0<DrawerDisplayInvite> actionNavigateToTeamsShowInviteActivity;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final C12724c<C28110g> viewStateLiveData;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final InterfaceC14292d viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final StringsRepository stringRepo;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C11054b invitationRepository;

    /* JADX INFO: renamed from: oq0.e$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Loq0/e$a;", "", "<init>", "(Ljava/lang/String;I)V", "LEGACY_ELITE", "COMMUNITY", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum a {
        LEGACY_ELITE,
        COMMUNITY;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: oq0.e$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f113688a;

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
            f113688a = iArr;
        }
    }

    /* JADX INFO: renamed from: oq0.e$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.login.InviteCodeViewModel$processCommunityInvite$1", m100430f = "InviteCodeViewModel.kt", m100431l = {203}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113689w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f113691y;

        /* JADX INFO: renamed from: oq0.e$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f113692a;

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
                f113692a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113691y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C28108e.this.new c(this.f113691y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113689w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C28108e c28108e = C28108e.this;
                c28108e.m84947V(C28110g.m84979b(c28108e.m84941F(), true, null, null, 0, null, 0, 62, null));
                C11059g c11059g = C28108e.this.teamsRepository;
                String str = this.f113691y;
                Locale locale = Locale.getDefault();
                AbstractC22676k.m65749i(locale, "getDefault(...)");
                String upperCase = str.toUpperCase(locale);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                this.f113689w = 1;
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
            C28108e c28108e2 = C28108e.this;
            c28108e2.m84947V(C28110g.m84979b(c28108e2.m84941F(), false, null, null, 0, null, 0, 62, null));
            int i14 = a.f113692a[resource.getStatus().ordinal()];
            if (i14 == 1) {
                Object data = resource.getData();
                AbstractC22676k.m65747g(data);
                Team team = (Team) data;
                DrawerDisplayInvite drawerDisplayInvite = new DrawerDisplayInvite(0, "", team.getId(), team.getName(), team.getIconUrl(), team.getAdminId(), "", this.f113691y);
                if (C28108e.this.getIsInAppMessage()) {
                    C28108e.this.m84963C().m85347e(drawerDisplayInvite);
                } else {
                    C28108e.this.m84961A().m85347e(drawerDisplayInvite);
                }
            } else if (i14 == 2) {
                InterfaceC34116n interfaceC34116n = C28108e.this.logger;
                DomainException exception = resource.getException();
                AbstractC22676k.m65747g(exception);
                interfaceC34116n.mo85224o("Community_InviteCode_Create", "Failed to verify invite code", exception, new AbstractC30556a.a[0]);
                C28108e c28108e3 = C28108e.this;
                DomainException exception2 = resource.getException();
                AbstractC22676k.m65747g(exception2);
                c28108e3.m84948W(c28108e3.m84946S(exception2.getReason()));
                if (!C28108e.this.networkMonitor.isConnected()) {
                    C28108e.this.m84964D().m85347e(new Integer(AbstractC38505d0.f165584H));
                }
            } else if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: oq0.e$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.login.InviteCodeViewModel$processLegacyInvite$1", m100430f = "InviteCodeViewModel.kt", m100431l = {175, 176}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f113693E;

        /* JADX INFO: renamed from: w */
        long f113694w;

        /* JADX INFO: renamed from: x */
        int f113695x;

        /* JADX INFO: renamed from: y */
        int f113696y;

        /* JADX INFO: renamed from: oq0.e$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f113698a;

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
                f113698a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113693E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C28108e.this.new d(this.f113693E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        
            if (r14 == r0) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 226
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oq0.C28108e.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: oq0.e$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"oq0/e$e", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C28110g value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C28108e f113700x;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Object obj, C28108e c28108e) {
            this.f113700x = c28108e;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C28110g getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C28110g value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            this.f113700x.m84966G().postValue(this.f113700x.m84941F());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28108e(C40191e eventDispatcher, InterfaceC34116n logger, StringsRepository stringRepo, C11054b invitationRepository, InterfaceC18260e networkMonitor, C11059g teamsRepository, Long l7, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(stringRepo, "stringRepo");
        AbstractC22676k.m65750j(invitationRepository, "invitationRepository");
        AbstractC22676k.m65750j(networkMonitor, "networkMonitor");
        AbstractC22676k.m65750j(teamsRepository, "teamsRepository");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.eventDispatcher = eventDispatcher;
        this.logger = logger;
        this.stringRepo = stringRepo;
        this.invitationRepository = invitationRepository;
        this.networkMonitor = networkMonitor;
        this.teamsRepository = teamsRepository;
        this.pause = l7;
        this.coroutineScope = coroutineScope;
        this.actionHideKeyboard = new C28196r0();
        this.actionClearFocus = new C28196r0();
        this.actionShowToast = new C28199s0<>();
        this.actionLaunchViewUri = new C28199s0<>();
        this.actionNavigateToJoinTeamActivity = new C28199s0<>();
        this.actionNavigateToHomeActivity = new C28199s0<>();
        this.actionNavigateToTeamsShowInviteActivity = new C28199s0<>();
        this.viewStateLiveData = new C12724c<>();
        this.viewState = new e(new C28110g(false, null, null, 0, null, 0, 63, null), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final C28110g m84941F() {
        return (C28110g) this.viewState.getValue(this, f113668S[0]);
    }

    /* JADX INFO: renamed from: H */
    private final void m84942H() {
        m84947V(C28110g.m84979b(m84941F(), false, null, null, 8, null, 0, 51, null));
    }

    /* JADX INFO: renamed from: I */
    private final String m84943I(CharSequence inviteCode) {
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

    /* JADX INFO: renamed from: Q */
    private final void m84944Q(String inviteCode) {
        this.eventDispatcher.m129009Q("Settings");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(inviteCode, null), 3);
    }

    /* JADX INFO: renamed from: R */
    private final void m84945R(String inviteCode) {
        m84960v();
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new d(inviteCode, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public final int m84946S(DomainException.InterfaceC9606b reason) {
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
    /* JADX INFO: renamed from: V */
    public final void m84947V(C28110g c28110g) {
        this.viewState.setValue(this, f113668S[0], c28110g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public final void m84948W(int errorId) {
        m84947V(C28110g.m84979b(m84941F(), false, null, Integer.valueOf(errorId), 0, null, 0, 51, null));
    }

    /* JADX INFO: renamed from: X */
    private final void m84949X() {
        String inviteCode = m84941F().getInviteCode();
        C23465k c23465kM84967K = m84967K(inviteCode);
        Integer num = (Integer) c23465kM84967K.f92937w;
        a aVar = (a) c23465kM84967K.f92938x;
        if (num != null) {
            m84948W(num.intValue());
            return;
        }
        this.eventDispatcher.m129018U0("Empty State", "Submit");
        int i13 = aVar == null ? -1 : b.f113688a[aVar.ordinal()];
        if (i13 != -1) {
            if (i13 == 1) {
                m84945R(inviteCode);
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                m84944Q(inviteCode);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    private final void m84960v() {
        this.actionHideKeyboard.m85330e();
        m84942H();
        this.actionClearFocus.m85330e();
    }

    /* JADX INFO: renamed from: A */
    public final C28199s0<DrawerDisplayInvite> m84961A() {
        return this.actionNavigateToHomeActivity;
    }

    /* JADX INFO: renamed from: B */
    public final C28199s0<Invitation> m84962B() {
        return this.actionNavigateToJoinTeamActivity;
    }

    /* JADX INFO: renamed from: C */
    public final C28199s0<DrawerDisplayInvite> m84963C() {
        return this.actionNavigateToTeamsShowInviteActivity;
    }

    /* JADX INFO: renamed from: D */
    public final C28199s0<Integer> m84964D() {
        return this.actionShowToast;
    }

    /* JADX INFO: renamed from: E */
    public final String m84965E(Uri uri) {
        AbstractC22676k.m65750j(uri, "uri");
        String queryParameter = uri.getQueryParameter("code");
        if (queryParameter != null && queryParameter.length() > 0) {
            return queryParameter;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null || lastPathSegment.length() <= 0) {
            return "";
        }
        Locale locale = Locale.getDefault();
        AbstractC22676k.m65749i(locale, "getDefault(...)");
        String lowerCase = lastPathSegment.toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return AbstractC39421y.m125930O(lowerCase, "comm", false) ? lastPathSegment : "";
    }

    /* JADX INFO: renamed from: G */
    public final C12724c<C28110g> m84966G() {
        return this.viewStateLiveData;
    }

    /* JADX INFO: renamed from: K */
    public final C23465k m84967K(CharSequence inviteCode) {
        AbstractC22676k.m65750j(inviteCode, "inviteCode");
        if (AbstractC28109f.f113701a.matcher(inviteCode).matches()) {
            return new C23465k(null, a.LEGACY_ELITE);
        }
        if (AbstractC28109f.f113702b.matcher(inviteCode).matches()) {
            return new C23465k(null, a.COMMUNITY);
        }
        return (inviteCode.length() == 9 || inviteCode.length() == 11) ? new C23465k(Integer.valueOf(AbstractC38505d0.f165571C1), null) : new C23465k(Integer.valueOf(AbstractC38505d0.f165580F1), null);
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final boolean getIsInAppMessage() {
        return this.isInAppMessage;
    }

    /* JADX INFO: renamed from: M */
    public final void m84969M() {
        this.eventDispatcher.m128985E();
    }

    /* JADX INFO: renamed from: N */
    public final void m84970N(String action, Uri uri) {
        if (AbstractC22676k.m65745e(action, "android.intent.action.VIEW") && uri != null && AbstractC22676k.m65745e(uri.getPath(), this.stringRepo.getString(AbstractC26666g.f106019j))) {
            String strM84965E = m84965E(uri);
            if (strM84965E.length() <= 0) {
                this.actionShowToast.m85347e(Integer.valueOf(AbstractC38505d0.f165578F));
                this.actionLaunchViewUri.m85347e(uri);
                return;
            } else {
                m84947V(C28110g.m84979b(m84941F(), false, strM84965E, null, 0, null, 0, 61, null));
                m84949X();
            }
        }
        m84947V(C28110g.m84979b(m84941F(), false, null, null, 0, null, AbstractC38529z.f165808a, 31, null));
    }

    /* JADX INFO: renamed from: O */
    public final void m84971O(CharSequence inviteCode) {
        AbstractC22676k.m65750j(inviteCode, "inviteCode");
        m84947V(C28110g.m84979b(m84941F(), false, m84943I(inviteCode), null, 0, Integer.valueOf(m84943I(inviteCode).length()), 0, 45, null));
        m84942H();
    }

    /* JADX INFO: renamed from: P */
    public final void m84972P() {
        m84949X();
    }

    /* JADX INFO: renamed from: U */
    public final void m84973U(boolean z4) {
        this.isInAppMessage = z4;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final C28196r0 getActionClearFocus() {
        return this.actionClearFocus;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final C28196r0 getActionHideKeyboard() {
        return this.actionHideKeyboard;
    }

    /* JADX INFO: renamed from: z */
    public final C28199s0<Uri> m84976z() {
        return this.actionLaunchViewUri;
    }

    public /* synthetic */ C28108e(C40191e c40191e, InterfaceC34116n interfaceC34116n, StringsRepository stringsRepository, C11054b c11054b, InterfaceC18260e interfaceC18260e, C11059g c11059g, Long l7, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c40191e, interfaceC34116n, stringsRepository, c11054b, interfaceC18260e, c11059g, (i13 & 64) != 0 ? null : l7, (i13 & 128) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
