package rq0;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.AbstractC1615p0;
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
import com.whoop.domain.model.User;
import com.whoop.p069ui.ScoreContext;
import com.whoop.service.network.model.DefaultImages;
import cq0.C11059g;
import f93.InterfaceC14292d;
import hj0.AbstractC17356o;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import l83.C23454a0;
import l83.InterfaceC23459e;
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
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import vq0.AbstractC36279c;
import z82.C40191e;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: rq0.y */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u0017J\u0015\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\u001fJ\u0015\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u001c¢\u0006\u0004\b#\u0010\u001fJ\u001d\u0010(\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00132\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00132\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b.\u0010-J\u0015\u00101\u001a\u00020\u00132\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\u00132\u0006\u00103\u001a\u00020/¢\u0006\u0004\b4\u00102J\u0017\u00107\u001a\u00020\u00132\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0013H\u0002¢\u0006\u0004\b9\u0010\u0017J\u0010\u0010:\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010H\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bF\u0010GR\"\u0010J\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010\u0019\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010N\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0019\u001a\u0004\bN\u0010K\"\u0004\bO\u0010MR\u001d\u0010T\u001a\b\u0012\u0004\u0012\u00020Q0P8\u0006¢\u0006\f\n\u0004\b7\u0010R\u001a\u0004\bA\u0010SR+\u0010Z\u001a\u00020Q2\u0006\u0010U\u001a\u00020Q8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010V\u001a\u0004\b?\u0010W\"\u0004\bX\u0010Y¨\u0006["}, m65681d2 = {"Lrq0/y;", "Lhj0/o;", "Lcq0/g;", "teamsRepository", "Lz82/e;", "eventDispatcher", "Ltr2/n;", "logger", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Lcom/whoop/data/repositories/StringsRepository;", "stringsRepository", "Lz92/a;", "userInfoAccessor", "<init>", "(Lcq0/g;Lz82/e;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagRepository;Lcom/whoop/data/repositories/StringsRepository;Lz92/a;)V", "", "analyticsAction", "analyticsLabel", "Ll83/a0;", "K", "(Ljava/lang/String;Ljava/lang/String;)V", "M", "()V", "newName", "Z", "(Ljava/lang/String;)V", "O", "", "newLogoIndex", "V", "(I)V", "newLogoVariantIndex", "X", "newBannerIndex", "S", "Lcom/whoop/ui/ScoreContext;", "type", "", "value", "b0", "(Lcom/whoop/ui/ScoreContext;Z)V", "Landroid/graphics/Bitmap;", "photo", "F", "(Landroid/graphics/Bitmap;)V", "G", "Landroid/graphics/drawable/Drawable;", "newBanner", "Q", "(Landroid/graphics/drawable/Drawable;)V", "newLogo", "R", "Lrq0/w;", "newStep", "N", "(Lrq0/w;)V", "E", "c0", "(Lq83/d;)Ljava/lang/Object;", "Lcq0/g;", "Lz82/e;", "Ltr2/n;", "H", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "I", "Lcom/whoop/data/repositories/StringsRepository;", "J", "Lz92/a;", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "L", "isBannerUpload", "()Z", "U", "(Z)V", "isLogoUpload", "W", "Landroidx/lifecycle/p0;", "Lrq0/z;", "Landroidx/lifecycle/p0;", "()Landroidx/lifecycle/p0;", "viewStateLiveData", "<set-?>", "Lf93/d;", "()Lrq0/z;", "Y", "(Lrq0/z;)V", "viewState", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31705y extends AbstractC17356o {

    /* JADX INFO: renamed from: P */
    static final /* synthetic */ InterfaceC21493z[] f131273P = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C31705y.class, "viewState", "getViewState()Lcom/whoop/community/presentation/teams/TeamCreateViewState;", 0))};

    /* JADX INFO: renamed from: Q */
    public static final int f131274Q = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C11059g teamsRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final FeatureFlagRepository featureFlagRepository;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final StringsRepository stringsRepository;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private boolean isBannerUpload;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private boolean isLogoUpload;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final AbstractC1615p0 viewStateLiveData;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC14292d viewState;

    /* JADX INFO: renamed from: rq0.y$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f131286a;

        static {
            int[] iArr = new int[ScoreContext.values().length];
            try {
                iArr[ScoreContext.STRAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScoreContext.RECOVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScoreContext.SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f131286a = iArr;
        }
    }

    /* JADX INFO: renamed from: rq0.y$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamCreateViewModel$createTeam$1", m100430f = "TeamCreateViewModel.kt", m100431l = {191, 188}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f131288F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f131289G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ Bitmap f131290H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ Bitmap f131291I;

        /* JADX INFO: renamed from: w */
        Object f131292w;

        /* JADX INFO: renamed from: x */
        Object f131293x;

        /* JADX INFO: renamed from: y */
        Object f131294y;

        /* JADX INFO: renamed from: z */
        int f131295z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, Bitmap bitmap, Bitmap bitmap2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f131288F = str;
            this.f131289G = str2;
            this.f131290H = bitmap;
            this.f131291I = bitmap2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31705y.this.new b(this.f131288F, this.f131289G, this.f131290H, this.f131291I, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x00a6, code lost:
        
            if (r0 == r12) goto L16;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r32) {
            /*
                Method dump skipped, instruction units count: 300
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rq0.C31705y.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: rq0.y$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f131296w;

        public c(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f131296w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f131296w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f131296w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: rq0.y$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"rq0/y$d", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C31707z value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31705y f131298x;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Object obj, C31705y c31705y) {
            this.f131298x = c31705y;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C31707z getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C31707z value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            C31705y c31705y = this.f131298x;
            c31705y.m49138t(c31705y.getViewStateLiveData(), this.f131298x.m98290H());
        }
    }

    /* JADX INFO: renamed from: rq0.y$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamCreateViewModel", m100430f = "TeamCreateViewModel.kt", m100431l = {216}, m100432m = "userId", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f131299w;

        /* JADX INFO: renamed from: y */
        int f131301y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f131299w = obj;
            this.f131301y |= Integer.MIN_VALUE;
            return C31705y.this.m98295c0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C31705y(C11059g teamsRepository, C40191e eventDispatcher, InterfaceC34116n logger, FeatureFlagRepository featureFlagRepository, StringsRepository stringsRepository, InterfaceC40205a userInfoAccessor) {
        super(null, 1, 0 == true ? 1 : 0);
        AbstractC22676k.m65750j(teamsRepository, "teamsRepository");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        AbstractC22676k.m65750j(stringsRepository, "stringsRepository");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        this.teamsRepository = teamsRepository;
        this.eventDispatcher = eventDispatcher;
        this.logger = logger;
        this.featureFlagRepository = featureFlagRepository;
        this.stringsRepository = stringsRepository;
        this.userInfoAccessor = userInfoAccessor;
        this.logTag = "TeamCreateViewModel";
        this.viewStateLiveData = new C1630u0();
        this.viewState = new d(new C31707z(null, null, 0, 0, 0, null, null, null, null, false, false, false, false, null, 0, null, 65535, null), this);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:20:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:23:0x0101  */
    /* JADX WARN: Code duplicated, block: B:24:0x0109  */
    /* JADX WARN: Code duplicated, block: B:27:0x0110  */
    /* JADX WARN: Code duplicated, block: B:28:0x0120  */
    /* JADX WARN: Code duplicated, block: B:31:0x0125  */
    /* JADX WARN: Code duplicated, block: B:32:0x0136  */
    /* JADX INFO: renamed from: E */
    private final void m98289E() {
        InterfaceC31687p interfaceC31687p;
        InterfaceC31687p interfaceC31687p2;
        String url;
        String url2;
        Bitmap bitmap;
        Bitmap bitmap2;
        m98294Y(C31707z.m98316d(m98290H(), null, null, 0, 0, 0, null, null, null, null, false, false, false, true, null, 0, null, 61439, null));
        if (m98290H().m98322g().size() > m98290H().getBannerIndex()) {
            interfaceC31687p = m98290H().m98322g().get(m98290H().getBannerIndex());
        } else {
            this.logger.mo85216g("Banner index is greater than banner list size", new AbstractC30556a.a[0]);
            interfaceC31687p = null;
        }
        if (m98290H().m98330o().size() > m98290H().getLogoIndex()) {
            if (m98290H().m98330o().get(m98290H().getLogoIndex()).size() > m98290H().getLogoVariantIndex()) {
                interfaceC31687p2 = m98290H().m98330o().get(m98290H().getLogoIndex()).get(m98290H().getLogoVariantIndex());
            } else {
                try {
                    interfaceC31687p2 = m98290H().m98330o().get(m98290H().getLogoIndex()).get(0);
                } catch (Exception e5) {
                    this.logger.mo85230v("Exception occurred selecting the correct logo variant", e5, new AbstractC30556a.a[0]);
                    interfaceC31687p2 = null;
                }
            }
            if (interfaceC31687p instanceof C31691r) {
                url = ((C31691r) interfaceC31687p).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String();
            } else {
                url = null;
            }
            if (interfaceC31687p2 instanceof C31691r) {
                url2 = ((C31691r) interfaceC31687p2).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String();
            } else {
                url2 = null;
            }
            if (interfaceC31687p instanceof C31689q) {
                Drawable drawable = ((C31689q) interfaceC31687p).getDrawable();
                AbstractC22676k.m65748h(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                bitmap = null;
            }
            if (interfaceC31687p2 instanceof C31689q) {
                Drawable drawable2 = ((C31689q) interfaceC31687p2).getDrawable();
                AbstractC22676k.m65748h(drawable2, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                bitmap2 = ((BitmapDrawable) drawable2).getBitmap();
            } else {
                bitmap2 = null;
            }
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new b(url, url2, bitmap, bitmap2, null), 3);
        }
        this.logger.mo85216g("logo index is greater than logos list size", new AbstractC30556a.a[0]);
        interfaceC31687p2 = null;
        if (interfaceC31687p instanceof C31691r) {
            url = ((C31691r) interfaceC31687p).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String();
        } else {
            url = null;
        }
        if (interfaceC31687p2 instanceof C31691r) {
            url2 = ((C31691r) interfaceC31687p2).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String();
        } else {
            url2 = null;
        }
        if (interfaceC31687p instanceof C31689q) {
            Drawable drawable3 = ((C31689q) interfaceC31687p).getDrawable();
            AbstractC22676k.m65748h(drawable3, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            bitmap = ((BitmapDrawable) drawable3).getBitmap();
        } else {
            bitmap = null;
        }
        if (interfaceC31687p2 instanceof C31689q) {
            Drawable drawable4 = ((C31689q) interfaceC31687p2).getDrawable();
            AbstractC22676k.m65748h(drawable4, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            bitmap2 = ((BitmapDrawable) drawable4).getBitmap();
        } else {
            bitmap2 = null;
        }
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new b(url, url2, bitmap, bitmap2, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final C31707z m98290H() {
        return (C31707z) this.viewState.getValue(this, f131273P[0]);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m98291L(C31705y c31705y, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        c31705y.m98302K(str, str2);
    }

    /* JADX INFO: renamed from: N */
    private final void m98292N(EnumC31701w newStep) {
        m98294Y(C31707z.m98316d(m98290H(), newStep, null, 0, 0, 0, null, null, null, null, false, false, false, false, null, 0, null, 65534, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m98293P(C31705y c31705y, Resource resource) {
        DefaultImages defaultImages = (DefaultImages) resource.getData();
        if (defaultImages != null) {
            c31705y.m98294Y(C31707z.m98316d(c31705y.m98290H(), null, null, 0, 0, 0, null, null, null, null, false, false, false, false, null, 0, null, 65535, null).m98337v(defaultImages.getBanners()).m98338x(defaultImages.getAvatars()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public final void m98294Y(C31707z c31707z) {
        this.viewState.setValue(this, f131273P[0], c31707z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c0 */
    public final Object m98295c0(InterfaceC30057d<? super Integer> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f131301y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f131301y = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objMo129089c = eVar.f131299w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f131301y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo129089c);
            InterfaceC40205a interfaceC40205a = this.userInfoAccessor;
            eVar.f131301y = 1;
            objMo129089c = interfaceC40205a.mo129089c(eVar);
            if (objMo129089c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo129089c);
        }
        User user = (User) objMo129089c;
        return new Integer(user != null ? user.getId() : 0);
    }

    /* JADX INFO: renamed from: F */
    public final void m98299F(Bitmap photo) {
        AbstractC22676k.m65750j(photo, "photo");
        m98294Y(C31707z.m98316d(m98290H(), null, null, 0, 0, 0, null, null, this.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.DROID_COMPRESS_IMAGE) ? AbstractC36279c.m115966a(photo) : photo, null, false, false, false, false, null, 0, null, 65407, null));
    }

    /* JADX INFO: renamed from: G */
    public final void m98300G(Bitmap photo) {
        AbstractC22676k.m65750j(photo, "photo");
        m98294Y(C31707z.m98316d(m98290H(), null, null, 0, 0, 0, null, null, null, this.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.DROID_COMPRESS_IMAGE) ? AbstractC36279c.m115966a(photo) : photo, false, false, false, false, null, 0, null, 65279, null));
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final AbstractC1615p0 getViewStateLiveData() {
        return this.viewStateLiveData;
    }

    /* JADX INFO: renamed from: K */
    public final void m98302K(String analyticsAction, String analyticsLabel) {
        if (m98290H().getStep() == null) {
            m98292N(EnumC31701w.SPLASH);
            return;
        }
        if (analyticsAction != null && analyticsLabel != null) {
            this.eventDispatcher.m128984D0(analyticsAction, analyticsLabel);
        }
        EnumC31701w step = m98290H().getStep();
        int iOrdinal = (step != null ? step.ordinal() : 0) + 1;
        if (iOrdinal < EnumC31701w.values().length) {
            m98292N(EnumC31701w.values()[iOrdinal]);
        } else {
            m98289E();
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m98303M() {
        EnumC31701w step = m98290H().getStep();
        int iOrdinal = (step != null ? step.ordinal() : 0) - 1;
        if (iOrdinal >= 0) {
            m98292N(EnumC31701w.values()[iOrdinal]);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m98304O() {
        this.teamsRepository.m29776C().observeForever(new c(new C31703x(this, 0)));
    }

    /* JADX INFO: renamed from: Q */
    public final void m98305Q(Drawable newBanner) {
        AbstractC22676k.m65750j(newBanner, "newBanner");
        m98294Y(C31707z.m98316d(m98290H().m98336u(newBanner), null, null, 0, 0, 0, null, null, null, null, false, false, false, false, null, 0, null, 65407, null));
    }

    /* JADX INFO: renamed from: R */
    public final void m98306R(Drawable newLogo) {
        AbstractC22676k.m65750j(newLogo, "newLogo");
        m98294Y(C31707z.m98316d(m98290H().m98339z(newLogo), null, null, 0, 0, 0, null, null, null, null, false, false, false, false, null, 0, null, 65279, null));
    }

    /* JADX INFO: renamed from: S */
    public final void m98307S(int newBannerIndex) {
        C31707z c31707zM98316d;
        if (this.isBannerUpload) {
            this.isBannerUpload = false;
            c31707zM98316d = C31707z.m98316d(m98290H(), null, null, m98290H().m98322g().size() - 1, 0, 0, null, null, null, null, false, false, false, false, null, 0, null, 65531, null);
        } else {
            c31707zM98316d = C31707z.m98316d(m98290H(), null, null, newBannerIndex % m98290H().m98322g().size(), 0, 0, null, null, null, null, false, false, false, false, null, 0, null, 65531, null);
        }
        m98294Y(c31707zM98316d);
    }

    /* JADX INFO: renamed from: U */
    public final void m98308U(boolean z4) {
        this.isBannerUpload = z4;
    }

    /* JADX INFO: renamed from: V */
    public final void m98309V(int newLogoIndex) {
        C31707z c31707zM98316d;
        if (this.isLogoUpload) {
            this.isLogoUpload = false;
            c31707zM98316d = C31707z.m98316d(m98290H(), null, null, 0, m98290H().m98330o().size() - 1, 0, null, null, null, null, false, false, false, false, null, 0, null, 65527, null);
        } else {
            c31707zM98316d = C31707z.m98316d(m98290H(), null, null, 0, newLogoIndex % m98290H().m98330o().size(), 0, null, null, null, null, false, false, false, false, null, 0, null, 65527, null);
        }
        m98294Y(c31707zM98316d);
    }

    /* JADX INFO: renamed from: W */
    public final void m98310W(boolean z4) {
        this.isLogoUpload = z4;
    }

    /* JADX INFO: renamed from: X */
    public final void m98311X(int newLogoVariantIndex) {
        m98294Y(C31707z.m98316d(m98290H(), null, null, 0, 0, newLogoVariantIndex, null, null, null, null, false, false, false, false, null, 0, null, 65519, null));
    }

    /* JADX INFO: renamed from: Z */
    public final void m98312Z(String newName) {
        AbstractC22676k.m65750j(newName, "newName");
        m98294Y(C31707z.m98316d(m98290H(), null, newName, 0, 0, 0, null, null, null, null, false, false, false, false, null, 0, null, 65533, null));
    }

    /* JADX INFO: renamed from: b0 */
    public final void m98313b0(ScoreContext type, boolean value) {
        C31707z c31707zM98316d;
        AbstractC22676k.m65750j(type, "type");
        int i13 = a.f131286a[type.ordinal()];
        if (i13 == 1) {
            c31707zM98316d = C31707z.m98316d(m98290H(), null, null, 0, 0, 0, null, null, null, null, value, false, false, false, null, 0, null, 65023, null);
        } else if (i13 == 2) {
            c31707zM98316d = C31707z.m98316d(m98290H(), null, null, 0, 0, 0, null, null, null, null, false, value, false, false, null, 0, null, 64511, null);
        } else {
            if (i13 != 3) {
                throw new IllegalArgumentException();
            }
            c31707zM98316d = C31707z.m98316d(m98290H(), null, null, 0, 0, 0, null, null, null, null, false, false, value, false, null, 0, null, 63487, null);
        }
        m98294Y(c31707zM98316d);
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
