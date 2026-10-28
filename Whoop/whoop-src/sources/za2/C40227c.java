package za2;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.coordinator.BannerInvalidator;
import com.whoop.design.models.items.UpsellCardFeaturesModel;
import com.whoop.settings.banner.api.BannersApi;
import com.whoop.settings.banner.models.SettingsBannerDtoV3;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13045h2;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25271y;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: za2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001dB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\r0.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, m65681d2 = {"Lza2/c;", "Lcom/whoop/data/coordinator/BannerInvalidator;", "Lbc3/c0;", "scope", "Lcom/whoop/settings/banner/api/BannersApi;", "bannersApi", "La6/g;", "Lf6/f;", "prefsDataStore", "Ltr2/n;", "logger", "<init>", "(Lbc3/c0;Lcom/whoop/settings/banner/api/BannersApi;La6/g;Ltr2/n;)V", "Lza2/f;", "j", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/design/models/items/UpsellCardFeaturesModel;", "upsellCardFeatures", "i", "(Lcom/whoop/design/models/items/UpsellCardFeaturesModel;Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "l", "()V", "m", "invalidateBanners", "", "screenId", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)V", "a", "Lbc3/c0;", "b", "Lcom/whoop/settings/banner/api/BannersApi;", "c", "La6/g;", "d", "Ltr2/n;", "Lec3/p1;", "e", "Lec3/p1;", "_stateFlow", "Lec3/l;", "", "f", "Lec3/l;", "stringListFlow", "Lec3/f2;", "g", "Lec3/f2;", "k", "()Lec3/f2;", "stateFlow", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40227c implements BannerInvalidator {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i */
    public static final int f173735i = 8;

    /* JADX INFO: renamed from: j */
    private static final C14132d f173736j = AbstractC15751g.m44441U("upsellRemovedScreens");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final BannersApi bannersApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC0422g prefsDataStore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13075p1 _stateFlow;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC13058l stringListFlow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC13037f2 stateFlow;

    /* JADX INFO: renamed from: za2.c$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lza2/c$a;", "", "<init>", "()V", "Lf6/d;", "", "UPSELL_REMOVED_SCREENS", "Lf6/d;", "a", "()Lf6/d;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C14132d m129156a() {
            return C40227c.f173736j;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: za2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerCoordinator$addRemovedScreen$1", m100430f = "SettingsBannerCoordinator.kt", m100431l = {80, 83, 90}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f173744E;

        /* JADX INFO: renamed from: F */
        Object f173745F;

        /* JADX INFO: renamed from: G */
        int f173746G;

        /* JADX INFO: renamed from: H */
        int f173747H;

        /* JADX INFO: renamed from: I */
        int f173748I;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ String f173750K;

        /* JADX INFO: renamed from: w */
        Object f173751w;

        /* JADX INFO: renamed from: x */
        Object f173752x;

        /* JADX INFO: renamed from: y */
        Object f173753y;

        /* JADX INFO: renamed from: z */
        Object f173754z;

        /* JADX INFO: renamed from: za2.c$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerCoordinator$addRemovedScreen$1$1", m100430f = "SettingsBannerCoordinator.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lf6/f;", "preferences", "<anonymous>", "(Lf6/f;)Lf6/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f173755w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f173756x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ List<String> f173757y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<String> list, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f173757y = list;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f173757y, interfaceC30057d);
                aVar.f173756x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC14134f abstractC14134f, InterfaceC30057d<? super AbstractC14134f> interfaceC30057d) {
                return ((a) create(abstractC14134f, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                AbstractC14134f abstractC14134f = (AbstractC14134f) this.f173756x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f173755w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                C14129a c14129aM40233c = abstractC14134f.m40233c();
                c14129aM40233c.m40230g(C40227c.INSTANCE.m129156a(), AbstractC25265s.m74110N0(this.f173757y, ",", null, null, null, 62));
                return c14129aM40233c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f173750K = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40227c.this.new b(this.f173750K, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:30:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:35:0x00e5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a4 -> B:32:0x00dc). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c5 -> B:31:0x00c7). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 234
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: za2.C40227c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: za2.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerCoordinator", m100430f = "SettingsBannerCoordinator.kt", m100431l = {74}, m100432m = "checkForRemovedScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f173758w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f173759x;

        /* JADX INFO: renamed from: z */
        int f173761z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f173759x = obj;
            this.f173761z |= Integer.MIN_VALUE;
            return C40227c.this.m129150i(null, this);
        }
    }

    /* JADX INFO: renamed from: za2.c$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerCoordinator", m100430f = "SettingsBannerCoordinator.kt", m100431l = {64, 68}, m100432m = "fetchBannerItems", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f173762E;

        /* JADX INFO: renamed from: G */
        int f173764G;

        /* JADX INFO: renamed from: w */
        Object f173765w;

        /* JADX INFO: renamed from: x */
        Object f173766x;

        /* JADX INFO: renamed from: y */
        Object f173767y;

        /* JADX INFO: renamed from: z */
        int f173768z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f173762E = obj;
            this.f173764G |= Integer.MIN_VALUE;
            return C40227c.this.m129151j(this);
        }
    }

    /* JADX INFO: renamed from: za2.c$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerCoordinator$fetchBannerItems$response$1", m100430f = "SettingsBannerCoordinator.kt", m100431l = {64}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/settings/banner/models/SettingsBannerDtoV3;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f173769w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C40227c.this.new e(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f173769w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            BannersApi bannersApi = C40227c.this.bannersApi;
            this.f173769w = 1;
            Object objFetchBannersV3 = bannersApi.fetchBannersV3(this);
            return objFetchBannersV3 == enumC31071a ? enumC31071a : objFetchBannersV3;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super SettingsBannerDtoV3> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: za2.c$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerCoordinator$initializeStateFlow$1", m100430f = "SettingsBannerCoordinator.kt", m100431l = {45, 45}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f173771w;

        /* JADX INFO: renamed from: x */
        int f173772x;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40227c.this.new f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13075p1 interfaceC13075p1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f173772x;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 == 1) {
                    interfaceC13075p1 = (InterfaceC13075p1) this.f173771w;
                    AbstractC34132o.m107864I(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
            }
            AbstractC34132o.m107864I(obj);
            interfaceC13075p1 = C40227c.this._stateFlow;
            C40227c c40227c = C40227c.this;
            this.f173771w = interfaceC13075p1;
            this.f173772x = 1;
            obj = c40227c.m129151j(this);
            if (obj != enumC31071a) {
            }
            this.f173771w = null;
            this.f173772x = 2;
            ((C13045h2) interfaceC13075p1).emit(obj, this);
            return c23454a0 == enumC31071a ? enumC31071a : c23454a0;
        }
    }

    /* JADX INFO: renamed from: za2.c$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerCoordinator$invalidateInfo$1", m100430f = "SettingsBannerCoordinator.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f173774w;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40227c.this.new g(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13045h2 c13045h2;
            Object value;
            Object objM129180b;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f173774w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC13075p1 interfaceC13075p1 = C40227c.this._stateFlow;
            do {
                c13045h2 = (C13045h2) interfaceC13075p1;
                value = c13045h2.getValue();
                objM129180b = (AbstractC40230f) value;
                if (objM129180b instanceof AbstractC40230f.c) {
                    objM129180b = AbstractC40230f.c.m129180b((AbstractC40230f.c) objM129180b, null, null, null, true, null, 23, null);
                }
            } while (!c13045h2.m36569i(value, objM129180b));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: za2.c$h */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f173776w;

        /* JADX INFO: renamed from: za2.c$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f173777w;

            /* JADX INFO: renamed from: za2.c$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerCoordinator$special$$inlined$map$1$2", m100430f = "SettingsBannerCoordinator.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42727a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f173778E;

                /* JADX INFO: renamed from: F */
                Object f173779F;

                /* JADX INFO: renamed from: G */
                Object f173780G;

                /* JADX INFO: renamed from: H */
                int f173781H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f173782w;

                /* JADX INFO: renamed from: x */
                int f173783x;

                /* JADX INFO: renamed from: y */
                Object f173784y;

                public C42727a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f173782w = obj;
                    this.f173783x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f173777w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42727a c42727a;
                if (interfaceC30057d instanceof C42727a) {
                    c42727a = (C42727a) interfaceC30057d;
                    int i13 = c42727a.f173783x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42727a.f173783x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42727a = new C42727a(interfaceC30057d);
                    }
                } else {
                    c42727a = new C42727a(interfaceC30057d);
                }
                Object obj2 = c42727a.f173782w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42727a.f173783x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f173777w;
                    String str = (String) ((AbstractC14134f) obj).mo40227b(C40227c.f173736j);
                    Object objM125906y0 = str != null ? AbstractC39414r.m125906y0(str, new String[]{","}, 6) : C25271y.f99162w;
                    c42727a.f173784y = null;
                    c42727a.f173778E = null;
                    c42727a.f173779F = null;
                    c42727a.f173780G = null;
                    c42727a.f173781H = 0;
                    c42727a.f173783x = 1;
                    if (interfaceC13062m.emit(objM125906y0, c42727a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public h(InterfaceC13058l interfaceC13058l) {
            this.f173776w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f173776w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: za2.c$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerCoordinator$stateFlow$1", m100430f = "SettingsBannerCoordinator.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lza2/f;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f173786w;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40227c.this.new i(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f173786w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C40227c.this.m129154l();
            return C23454a0.f92919a;
        }
    }

    public C40227c(InterfaceC2994c0 scope, BannersApi bannersApi, InterfaceC0422g prefsDataStore, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(bannersApi, "bannersApi");
        AbstractC22676k.m65750j(prefsDataStore, "prefsDataStore");
        AbstractC22676k.m65750j(logger, "logger");
        this.scope = scope;
        this.bannersApi = bannersApi;
        this.prefsDataStore = prefsDataStore;
        this.logger = logger;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(AbstractC40230f.b.f173883a);
        this._stateFlow = c13045h2M36593c;
        this.stringListFlow = new h(prefsDataStore.getData());
        this.stateFlow = AbstractC13091v.m36587M(new C13015a0(new i(null), c13045h2M36593c), scope, C13105z1.f45288a, c13045h2M36593c.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m129150i(UpsellCardFeaturesModel upsellCardFeaturesModel, InterfaceC30057d<? super UpsellCardFeaturesModel> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f173761z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f173761z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM36577C = cVar.f173759x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f173761z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36577C);
            InterfaceC13058l interfaceC13058l = this.stringListFlow;
            cVar.f173758w = upsellCardFeaturesModel;
            cVar.f173761z = 1;
            objM36577C = AbstractC13091v.m36577C(interfaceC13058l, cVar);
            if (objM36577C == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            upsellCardFeaturesModel = (UpsellCardFeaturesModel) cVar.f173758w;
            AbstractC34132o.m107864I(objM36577C);
        }
        List list = (List) objM36577C;
        if (list == null) {
            return upsellCardFeaturesModel;
        }
        if (upsellCardFeaturesModel == null || AbstractC25265s.m74155w0(list, upsellCardFeaturesModel.getId())) {
            return null;
        }
        return upsellCardFeaturesModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (r12 == r0) goto L28;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m129151j(q83.InterfaceC30057d<? super za2.AbstractC40230f> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof za2.C40227c.d
            if (r0 == 0) goto L14
            r0 = r12
            za2.c$d r0 = (za2.C40227c.d) r0
            int r1 = r0.f173764G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f173764G = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            za2.c$d r0 = new za2.c$d
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f173762E
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f173764G
            r9 = 2
            r2 = 1
            r10 = 0
            if (r1 == 0) goto L46
            if (r1 == r2) goto L42
            if (r1 != r9) goto L3a
            java.lang.Object r0 = r6.f173767y
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r6.f173766x
            com.whoop.settings.banner.models.SettingsBannerDtoV3 r1 = (com.whoop.settings.banner.models.SettingsBannerDtoV3) r1
            java.lang.Object r1 = r6.f173765w
            u02.a r1 = (u02.InterfaceC34385a) r1
            p505ts.AbstractC34132o.m107864I(r12)
            r1 = r0
            goto L8c
        L3a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L42:
            p505ts.AbstractC34132o.m107864I(r12)
            goto L60
        L46:
            p505ts.AbstractC34132o.m107864I(r12)
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            r12 = r2
            tr2.n r2 = r11.logger
            za2.c$e r5 = new za2.c$e
            r5.<init>(r10)
            r6.f173764G = r12
            r3 = 0
            r4 = 0
            r7 = 6
            r8 = 0
            java.lang.Object r12 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L60
            goto L8b
        L60:
            u02.a r12 = (u02.InterfaceC34385a) r12
            java.lang.Object r12 = u02.AbstractC34386b.m108737b(r12)
            com.whoop.settings.banner.models.SettingsBannerDtoV3 r12 = (com.whoop.settings.banner.models.SettingsBannerDtoV3) r12
            if (r12 == 0) goto L9b
            java.util.List r1 = r12.getBanners()
            com.whoop.settings.banner.models.OverlayUpsellCard r12 = r12.getOverlayCard()
            if (r12 == 0) goto L79
            com.whoop.design.models.items.UpsellCardFeaturesModel r12 = r12.getContent()
            goto L7a
        L79:
            r12 = r10
        L7a:
            r6.f173765w = r10
            r6.f173766x = r10
            r6.f173767y = r1
            r2 = 0
            r6.f173768z = r2
            r6.f173764G = r9
            java.lang.Object r12 = r11.m129150i(r12, r6)
            if (r12 != r0) goto L8c
        L8b:
            return r0
        L8c:
            r3 = r12
            com.whoop.design.models.items.UpsellCardFeaturesModel r3 = (com.whoop.design.models.items.UpsellCardFeaturesModel) r3
            za2.f$c r0 = new za2.f$c
            r4 = 0
            r2 = 0
            r5 = 0
            r6 = 26
            r7 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L9b:
            za2.f$a r12 = za2.AbstractC40230f.a.f173882a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: za2.C40227c.m129151j(q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: h */
    public final void m129152h(String screenId) {
        AbstractC22676k.m65750j(screenId, "screenId");
        AbstractC3006f0.m8732z(this.scope, null, null, new b(screenId, null), 3);
    }

    @Override // com.whoop.data.coordinator.BannerInvalidator
    public void invalidateBanners() {
        m129155m();
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final InterfaceC13037f2 getStateFlow() {
        return this.stateFlow;
    }

    /* JADX INFO: renamed from: l */
    public final void m129154l() {
        AbstractC3006f0.m8732z(this.scope, null, null, new f(null), 3);
    }

    /* JADX INFO: renamed from: m */
    public final void m129155m() {
        AbstractC3006f0.m8732z(this.scope, null, null, new g(null), 3);
    }

    public /* synthetic */ C40227c(InterfaceC2994c0 interfaceC2994c0, BannersApi bannersApi, InterfaceC0422g interfaceC0422g, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2994c0, bannersApi, interfaceC0422g, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SettingsBannerCoordinator") : interfaceC34116n);
    }
}
