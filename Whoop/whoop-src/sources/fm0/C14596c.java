package fm0;

import c93.InterfaceC4351m;
import com.whoop.appconfiguration.TabConfiguration;
import com.whoop.bottomnavigation.domain.BottomNavCoachApi;
import com.whoop.bottomnavigation.domain.models.BottomNavCoachConfig;
import com.whoop.bottomnavigation.domain.models.BottomNavCoachTab;
import com.whoop.coacheverywherecommon.models.AiContextMetadataBottomRow;
import com.whoop.coacheverywherecommon.models.BottomNavOverride;
import com.whoop.coacheverywherecommon.models.CoachEducationType;
import com.whoop.coacheverywherecommon.models.CoachEntry;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.C9598e;
import dp0.InterfaceC12251g;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13054k;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.C21138e;
import j02.C21140f;
import j02.InterfaceC21142g;
import java.util.ArrayList;
import java.util.List;
import ji0.InterfaceC21718f;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: fm0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010'¨\u0006("}, m65681d2 = {"Lfm0/c;", "", "Lji0/f;", "configSource", "Lj02/g;", "communityBadgeSource", "Lj02/e;", "tabEventPublisher", "Lcom/whoop/bottomnavigation/domain/BottomNavCoachApi;", "coachApi", "Ldp0/g;", "globalCoachManager", "Ltr2/n;", "logger", "<init>", "(Lji0/f;Lj02/g;Lj02/e;Lcom/whoop/bottomnavigation/domain/BottomNavCoachApi;Ldp0/g;Ltr2/n;)V", "Lec3/l;", "Lfm0/a;", "g", "()Lec3/l;", "f", "Lcom/whoop/bottomnavigation/domain/models/BottomNavCoachConfig;", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;", "i", "(Lcom/whoop/bottomnavigation/domain/models/BottomNavCoachConfig;)Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;", "upstream", "Lfm0/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lec3/l;)Lec3/l;", "a", "Lji0/f;", "b", "Lj02/g;", "c", "Lj02/e;", "d", "Lcom/whoop/bottomnavigation/domain/BottomNavCoachApi;", "e", "Ldp0/g;", "Ltr2/n;", "bottom-navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14596c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21718f configSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21142g communityBadgeSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21138e tabEventPublisher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final BottomNavCoachApi coachApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC12251g globalCoachManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: fm0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bottomnavigation.domain.BottomNavInteractor$coachContextActions$$inlined$flatMapLatest$1", m100430f = "BottomNavInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f53685w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f53686x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f53687y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C14596c f53688z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C14596c c14596c) {
            super(3, interfaceC30057d);
            this.f53688z = c14596c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, Boolean bool, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f53688z);
            aVar.f53686x = interfaceC13062m;
            aVar.f53687y = bool;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53685w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f53686x;
                InterfaceC13058l c13084s1 = !((Boolean) this.f53687y).booleanValue() ? C13054k.f45116w : new C13084s1(this.f53688z.new b(null));
                this.f53686x = null;
                this.f53687y = null;
                this.f53685w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (Boolean) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: fm0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bottomnavigation.domain.BottomNavInteractor$coachContextActions$1$1", m100430f = "BottomNavInteractor.kt", m100431l = {57, 61}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfm0/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f53689w;

        /* JADX INFO: renamed from: x */
        int f53690x;

        /* JADX INFO: renamed from: fm0.c$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.bottomnavigation.domain.BottomNavInteractor$coachContextActions$1$1$result$1", m100430f = "BottomNavInteractor.kt", m100431l = {58}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/bottomnavigation/domain/models/BottomNavCoachConfig;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f53692w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14596c f53693x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C14596c c14596c, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f53693x = c14596c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f53693x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f53692w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                BottomNavCoachApi bottomNavCoachApi = this.f53693x.coachApi;
                this.f53692w = 1;
                Object coachConfig = bottomNavCoachApi.getCoachConfig(this);
                return coachConfig == enumC31071a ? enumC31071a : coachConfig;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super BottomNavCoachConfig> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14596c.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
        
            if (r1.mo34142q(r13, r12) == r0) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r12.f53690x
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1e
                if (r1 != r3) goto L16
                java.lang.Object r0 = r12.f53689w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r13)
                r9 = r12
                goto L6a
            L16:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1e:
                p505ts.AbstractC34132o.m107864I(r13)
                r9 = r12
                goto L45
            L23:
                p505ts.AbstractC34132o.m107864I(r13)
                r13 = r4
                u02.a$a r4 = u02.InterfaceC34385a.INSTANCE
                fm0.c r1 = fm0.C14596c.this
                tr2.n r5 = fm0.C14596c.m41757d(r1)
                fm0.c$b$a r8 = new fm0.c$b$a
                fm0.c r1 = fm0.C14596c.this
                r8.<init>(r1, r2)
                r12.f53690x = r13
                r6 = 0
                java.lang.String r7 = "failed to fetch bottom nav coach config"
                r10 = 2
                r11 = 0
                r9 = r12
                java.lang.Object r13 = u02.InterfaceC34385a.Companion.m108729b(r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L45
                goto L69
            L45:
                u02.a r13 = (u02.InterfaceC34385a) r13
                boolean r1 = r13 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L6a
                fm0.c r1 = fm0.C14596c.this
                dp0.g r1 = fm0.C14596c.m41756c(r1)
                fm0.c r4 = fm0.C14596c.this
                u02.a$c r13 = (u02.InterfaceC34385a.c) r13
                java.lang.Object r13 = r13.m108735a()
                com.whoop.bottomnavigation.domain.models.BottomNavCoachConfig r13 = (com.whoop.bottomnavigation.domain.models.BottomNavCoachConfig) r13
                com.whoop.coacheverywherecommon.models.AiContextMetadataBottomRow r13 = fm0.C14596c.m41758e(r4, r13)
                r9.f53689w = r2
                r9.f53690x = r3
                java.lang.Object r13 = r1.mo34142q(r13, r12)
                if (r13 != r0) goto L6a
            L69:
                return r0
            L6a:
                l83.a0 r13 = l83.C23454a0.f92919a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: fm0.C14596c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: fm0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bottomnavigation.domain.BottomNavInteractor$coachContextActions$2", m100430f = "BottomNavInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lfm0/a;", "", "e", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f53694w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f53695x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = C14596c.this.new c(interfaceC30057d);
            cVar.f53695x = th3;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = (Throwable) this.f53695x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f53694w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C14596c.this.logger.mo85230v("bottom nav coach context failed", th3, new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: fm0.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f53697w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C14596c f53698x;

        /* JADX INFO: renamed from: fm0.c$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f53699w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14596c f53700x;

            /* JADX INFO: renamed from: fm0.c$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bottomnavigation.domain.BottomNavInteractor$configActions$$inlined$map$1$2", m100430f = "BottomNavInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41595a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f53701E;

                /* JADX INFO: renamed from: F */
                Object f53702F;

                /* JADX INFO: renamed from: G */
                Object f53703G;

                /* JADX INFO: renamed from: H */
                int f53704H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f53705w;

                /* JADX INFO: renamed from: x */
                int f53706x;

                /* JADX INFO: renamed from: y */
                Object f53707y;

                public C41595a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f53705w = obj;
                    this.f53706x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C14596c c14596c) {
                this.f53699w = interfaceC13062m;
                this.f53700x = c14596c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41595a c41595a;
                if (interfaceC30057d instanceof C41595a) {
                    c41595a = (C41595a) interfaceC30057d;
                    int i13 = c41595a.f53706x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41595a.f53706x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41595a = new C41595a(interfaceC30057d);
                    }
                } else {
                    c41595a = new C41595a(interfaceC30057d);
                }
                Object obj2 = c41595a.f53705w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41595a.f53706x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f53699w;
                    List list = (List) obj;
                    TabConfiguration tabConfigurationMo61186b = this.f53700x.configSource.mo61186b();
                    InterfaceC14594a.c cVar = new InterfaceC14594a.c(list, tabConfigurationMo61186b != null ? tabConfigurationMo61186b.getId() : null);
                    c41595a.f53707y = null;
                    c41595a.f53701E = null;
                    c41595a.f53702F = null;
                    c41595a.f53703G = null;
                    c41595a.f53704H = 0;
                    c41595a.f53706x = 1;
                    if (interfaceC13062m.emit(cVar, c41595a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C14596c c14596c) {
            this.f53697w = interfaceC13058l;
            this.f53698x = c14596c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f53697w.collect(new a(interfaceC13062m, this.f53698x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: fm0.c$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f53709w;

        /* JADX INFO: renamed from: fm0.c$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f53710w;

            /* JADX INFO: renamed from: fm0.c$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bottomnavigation.domain.BottomNavInteractor$configActions$$inlined$map$2$2", m100430f = "BottomNavInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41596a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f53711E;

                /* JADX INFO: renamed from: F */
                Object f53712F;

                /* JADX INFO: renamed from: G */
                Object f53713G;

                /* JADX INFO: renamed from: H */
                int f53714H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f53715w;

                /* JADX INFO: renamed from: x */
                int f53716x;

                /* JADX INFO: renamed from: y */
                Object f53717y;

                public C41596a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f53715w = obj;
                    this.f53716x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f53710w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41596a c41596a;
                if (interfaceC30057d instanceof C41596a) {
                    c41596a = (C41596a) interfaceC30057d;
                    int i13 = c41596a.f53716x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41596a.f53716x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41596a = new C41596a(interfaceC30057d);
                    }
                } else {
                    c41596a = new C41596a(interfaceC30057d);
                }
                Object obj2 = c41596a.f53715w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41596a.f53716x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f53710w;
                    InterfaceC14594a.a aVar = new InterfaceC14594a.a(((Boolean) obj).booleanValue());
                    c41596a.f53717y = null;
                    c41596a.f53711E = null;
                    c41596a.f53712F = null;
                    c41596a.f53713G = null;
                    c41596a.f53714H = 0;
                    c41596a.f53716x = 1;
                    if (interfaceC13062m.emit(aVar, c41596a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l) {
            this.f53709w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f53709w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: fm0.c$f */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f53719w;

        /* JADX INFO: renamed from: fm0.c$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f53720w;

            /* JADX INFO: renamed from: fm0.c$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bottomnavigation.domain.BottomNavInteractor$configActions$$inlined$map$3$2", m100430f = "BottomNavInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41597a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f53721E;

                /* JADX INFO: renamed from: F */
                Object f53722F;

                /* JADX INFO: renamed from: G */
                Object f53723G;

                /* JADX INFO: renamed from: H */
                int f53724H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f53725w;

                /* JADX INFO: renamed from: x */
                int f53726x;

                /* JADX INFO: renamed from: y */
                Object f53727y;

                public C41597a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f53725w = obj;
                    this.f53726x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f53720w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41597a c41597a;
                if (interfaceC30057d instanceof C41597a) {
                    c41597a = (C41597a) interfaceC30057d;
                    int i13 = c41597a.f53726x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41597a.f53726x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41597a = new C41597a(interfaceC30057d);
                    }
                } else {
                    c41597a = new C41597a(interfaceC30057d);
                }
                Object obj2 = c41597a.f53725w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41597a.f53726x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f53720w;
                    InterfaceC14594a.b bVar = new InterfaceC14594a.b((C21140f) obj);
                    c41597a.f53727y = null;
                    c41597a.f53721E = null;
                    c41597a.f53722F = null;
                    c41597a.f53723G = null;
                    c41597a.f53724H = 0;
                    c41597a.f53726x = 1;
                    if (interfaceC13062m.emit(bVar, c41597a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l) {
            this.f53719w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f53719w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: fm0.c$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bottomnavigation.domain.BottomNavInteractor$interact$1", m100430f = "BottomNavInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lfm0/b;", "state", "Lfm0/a;", "action", "<anonymous>", "(Lfm0/b;Lfm0/a;)Lfm0/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f53729w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f53730x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f53731y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C14595b c14595b, InterfaceC14594a interfaceC14594a, InterfaceC30057d<? super C14595b> interfaceC30057d) {
            g gVar = new g(interfaceC30057d);
            gVar.f53730x = c14595b;
            gVar.f53731y = interfaceC14594a;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14595b c14595b = (C14595b) this.f53730x;
            InterfaceC14594a interfaceC14594a = (InterfaceC14594a) this.f53731y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f53729w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c14595b.m41753i(interfaceC14594a);
        }
    }

    public C14596c(InterfaceC21718f configSource, InterfaceC21142g communityBadgeSource, C21138e tabEventPublisher, BottomNavCoachApi coachApi, InterfaceC12251g globalCoachManager, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(configSource, "configSource");
        AbstractC22676k.m65750j(communityBadgeSource, "communityBadgeSource");
        AbstractC22676k.m65750j(tabEventPublisher, "tabEventPublisher");
        AbstractC22676k.m65750j(coachApi, "coachApi");
        AbstractC22676k.m65750j(globalCoachManager, "globalCoachManager");
        AbstractC22676k.m65750j(logger, "logger");
        this.configSource = configSource;
        this.communityBadgeSource = communityBadgeSource;
        this.tabEventPublisher = tabEventPublisher;
        this.coachApi = coachApi;
        this.globalCoachManager = globalCoachManager;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC13058l m41759f() {
        return new C13015a0(AbstractC13091v.m36590P(AbstractC13091v.m36610t(this.configSource.getShouldFetchAiContextFlow()), new a(null, this)), new c(null));
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC13058l m41760g() {
        return AbstractC13091v.m36584J(new d(this.configSource.getTabsFlow(), this), new e(this.communityBadgeSource.mo45429a()), new f(this.tabEventPublisher.getNavInput()), m41759f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final AiContextMetadataBottomRow m41761i(BottomNavCoachConfig bottomNavCoachConfig) {
        List<BottomNavCoachTab> tabs = bottomNavCoachConfig.getTabs();
        ArrayList arrayList = new ArrayList();
        for (BottomNavCoachTab bottomNavCoachTab : tabs) {
            AiAction aiAction = bottomNavCoachTab.getAiAction();
            BottomNavOverride bottomNavOverride = aiAction != null ? new BottomNavOverride(bottomNavCoachTab.getId(), (C9598e) null, aiAction, bottomNavCoachTab.getCoachEntry(), (Boolean) null, 16, (DefaultConstructorMarker) null) : null;
            if (bottomNavOverride != null) {
                arrayList.add(bottomNavOverride);
            }
        }
        return new AiContextMetadataBottomRow((List) arrayList, false, (CoachEducationType) null, (CoachEntry) null, 14, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m41762h(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C14595b(null, null, false, false, false, 31, null), AbstractC13091v.m36584J(upstream, m41760g()), new g(null));
    }

    public /* synthetic */ C14596c(InterfaceC21718f interfaceC21718f, InterfaceC21142g interfaceC21142g, C21138e c21138e, BottomNavCoachApi bottomNavCoachApi, InterfaceC12251g interfaceC12251g, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21718f, interfaceC21142g, c21138e, bottomNavCoachApi, interfaceC12251g, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("BottomNavInteractor") : interfaceC34116n);
    }
}
