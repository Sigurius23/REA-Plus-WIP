package bm1;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.home.domain.models.StreakMetadata;
import com.whoop.home.domain.streaks.api.StreaksHomeApi;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fm1.EnumC14604h;
import gl1.C15970e;
import hf1.InterfaceC17235b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import lf1.C24005o;
import od1.InterfaceC27844g;
import or2.AbstractC28157e0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wm0.C37378a;

/* JADX INFO: renamed from: bm1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b!\u0010\"J#\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002030#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00104¨\u00066"}, m65681d2 = {"Lbm1/d;", "Lod1/g;", "Lbm1/b;", "Lbm1/c;", "Lcom/whoop/home/domain/streaks/api/StreaksHomeApi;", "api", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "ffChecker", "Lhf1/b;", "experimentsChecker", "Lgl1/e;", "analyticsHelper", "Ltr2/n;", "logger", "Lbm1/e;", "previousStreakDataStoreHandler", "Lwm0/a;", "scopeCoordinator", "<init>", "(Lcom/whoop/home/domain/streaks/api/StreaksHomeApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Lhf1/b;Lgl1/e;Ltr2/n;Lbm1/e;Lwm0/a;)V", "prevDomainState", "g", "(Lbm1/c;Lq83/d;)Ljava/lang/Object;", "", "previousStreakValue", "currentStreakValue", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Ljava/lang/String;)Z", "Lbm1/b$a;", "action", "j", "(Lbm1/c;Lbm1/b$a;)Lbm1/c;", "i", "(Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/home/domain/streaks/api/StreaksHomeApi;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "c", "Lhf1/b;", "d", "Lgl1/e;", "e", "Ltr2/n;", "f", "Lbm1/e;", "Lbm1/b$b;", "Lec3/l;", "scopeActions", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3421d implements InterfaceC27844g<InterfaceC3419b, InterfaceC3420c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final StreaksHomeApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker ffChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC17235b experimentsChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C15970e analyticsHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C3422e previousStreakDataStoreHandler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC13058l scopeActions;

    /* JADX INFO: renamed from: bm1.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.streaks.StreaksHomeInteractor", m100430f = "StreaksHomeInteractor.kt", m100431l = {67, 78, 81, 92}, m100432m = "fetchStreaks", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f13345E;

        /* JADX INFO: renamed from: F */
        Object f13346F;

        /* JADX INFO: renamed from: G */
        boolean f13347G;

        /* JADX INFO: renamed from: H */
        boolean f13348H;

        /* JADX INFO: renamed from: I */
        /* synthetic */ Object f13349I;

        /* JADX INFO: renamed from: K */
        int f13351K;

        /* JADX INFO: renamed from: w */
        Object f13352w;

        /* JADX INFO: renamed from: x */
        Object f13353x;

        /* JADX INFO: renamed from: y */
        Object f13354y;

        /* JADX INFO: renamed from: z */
        Object f13355z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f13349I = obj;
            this.f13351K |= Integer.MIN_VALUE;
            return C3421d.this.m9885g(null, this);
        }
    }

    /* JADX INFO: renamed from: bm1.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.streaks.StreaksHomeInteractor$fetchStreaks$result$1", m100430f = "StreaksHomeInteractor.kt", m100431l = {68}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/home/domain/models/StreakMetadata;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f13356w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C3421d.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f13356w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            StreaksHomeApi streaksHomeApi = C3421d.this.api;
            this.f13356w = 1;
            Object objFetchStreaks = streaksHomeApi.fetchStreaks(this);
            return objFetchStreaks == enumC31071a ? enumC31071a : objFetchStreaks;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super StreakMetadata> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: bm1.d$c */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.streaks.StreaksHomeInteractor$interact$1", m100430f = "StreaksHomeInteractor.kt", m100431l = {48}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbm1/c;", "prevDomainState", "Lbm1/b;", "action", "<anonymous>", "(Lbm1/c;Lbm1/b;)Lbm1/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f13358w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f13359x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f13360y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3420c interfaceC3420c, InterfaceC3419b interfaceC3419b, InterfaceC30057d<? super InterfaceC3420c> interfaceC30057d) {
            c cVar = C3421d.this.new c(interfaceC30057d);
            cVar.f13359x = interfaceC3420c;
            cVar.f13360y = interfaceC3419b;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3420c interfaceC3420c = (InterfaceC3420c) this.f13359x;
            InterfaceC3419b interfaceC3419b = (InterfaceC3419b) this.f13360y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f13358w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(interfaceC3419b instanceof InterfaceC3419b.b)) {
                    if (interfaceC3419b instanceof InterfaceC3419b.c) {
                        return interfaceC3420c instanceof InterfaceC3420c.d ? InterfaceC3420c.d.m9875b((InterfaceC3420c.d) interfaceC3420c, null, null, false, false, 11, null) : interfaceC3420c;
                    }
                    if (interfaceC3419b instanceof InterfaceC3419b.a) {
                        return C3421d.this.m9888j(interfaceC3420c, (InterfaceC3419b.a) interfaceC3419b);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                C3421d c3421d = C3421d.this;
                this.f13359x = null;
                this.f13360y = null;
                this.f13358w = 1;
                obj = c3421d.m9885g(interfaceC3420c, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (InterfaceC3420c) obj;
        }
    }

    /* JADX INFO: renamed from: bm1.d$d */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.streaks.StreaksHomeInteractor", m100430f = "StreaksHomeInteractor.kt", m100431l = {156}, m100432m = "isInTestVariantStreaksAnimation", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f13362w;

        /* JADX INFO: renamed from: y */
        int f13364y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f13362w = obj;
            this.f13364y |= Integer.MIN_VALUE;
            return C3421d.this.m9887i(this);
        }
    }

    /* JADX INFO: renamed from: bm1.d$e */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f13365w;

        /* JADX INFO: renamed from: bm1.d$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f13366w;

            /* JADX INFO: renamed from: bm1.d$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.domain.streaks.StreaksHomeInteractor$special$$inlined$filter$1$2", m100430f = "StreaksHomeInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41313a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f13368F;

                /* JADX INFO: renamed from: G */
                Object f13369G;

                /* JADX INFO: renamed from: H */
                int f13370H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f13371w;

                /* JADX INFO: renamed from: x */
                int f13372x;

                /* JADX INFO: renamed from: y */
                Object f13373y;

                /* JADX INFO: renamed from: z */
                Object f13374z;

                public C41313a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f13371w = obj;
                    this.f13372x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f13366w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41313a c41313a;
                if (interfaceC30057d instanceof C41313a) {
                    c41313a = (C41313a) interfaceC30057d;
                    int i13 = c41313a.f13372x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41313a.f13372x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41313a = new C41313a(interfaceC30057d);
                    }
                } else {
                    c41313a = new C41313a(interfaceC30057d);
                }
                Object obj2 = c41313a.f13371w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41313a.f13372x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f13366w;
                    if (AbstractC22676k.m65745e((String) obj, "streaksHome")) {
                        c41313a.f13373y = null;
                        c41313a.f13374z = null;
                        c41313a.f13368F = null;
                        c41313a.f13369G = null;
                        c41313a.f13370H = 0;
                        c41313a.f13372x = 1;
                        if (interfaceC13062m.emit(obj, c41313a) == enumC31071a) {
                            return enumC31071a;
                        }
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
            this.f13365w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f13365w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bm1.d$f */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f13375w;

        /* JADX INFO: renamed from: bm1.d$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f13376w;

            /* JADX INFO: renamed from: bm1.d$f$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes9.dex */
            @InterfaceC32271e(m100429c = "com.whoop.home.domain.streaks.StreaksHomeInteractor$special$$inlined$map$1$2", m100430f = "StreaksHomeInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41314a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f13377E;

                /* JADX INFO: renamed from: F */
                Object f13378F;

                /* JADX INFO: renamed from: G */
                Object f13379G;

                /* JADX INFO: renamed from: H */
                int f13380H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f13381w;

                /* JADX INFO: renamed from: x */
                int f13382x;

                /* JADX INFO: renamed from: y */
                Object f13383y;

                public C41314a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f13381w = obj;
                    this.f13382x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f13376w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41314a c41314a;
                if (interfaceC30057d instanceof C41314a) {
                    c41314a = (C41314a) interfaceC30057d;
                    int i13 = c41314a.f13382x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41314a.f13382x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41314a = new C41314a(interfaceC30057d);
                    }
                } else {
                    c41314a = new C41314a(interfaceC30057d);
                }
                Object obj2 = c41314a.f13381w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41314a.f13382x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f13376w;
                    InterfaceC3419b.b bVar = InterfaceC3419b.b.f13328a;
                    c41314a.f13383y = null;
                    c41314a.f13377E = null;
                    c41314a.f13378F = null;
                    c41314a.f13379G = null;
                    c41314a.f13380H = 0;
                    c41314a.f13382x = 1;
                    if (interfaceC13062m.emit(bVar, c41314a) == enumC31071a) {
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
            this.f13375w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f13375w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C3421d(StreaksHomeApi api, FeatureFlagChecker ffChecker, InterfaceC17235b experimentsChecker, C15970e analyticsHelper, InterfaceC34116n logger, C3422e previousStreakDataStoreHandler, C37378a scopeCoordinator) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(ffChecker, "ffChecker");
        AbstractC22676k.m65750j(experimentsChecker, "experimentsChecker");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(previousStreakDataStoreHandler, "previousStreakDataStoreHandler");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        this.api = api;
        this.ffChecker = ffChecker;
        this.experimentsChecker = experimentsChecker;
        this.analyticsHelper = analyticsHelper;
        this.logger = logger;
        this.previousStreakDataStoreHandler = previousStreakDataStoreHandler;
        this.scopeActions = new f(new e(scopeCoordinator.getScopeUpdateEvents()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:43:0x0113  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        if (r1 == r2) goto L42;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9885g(bm1.InterfaceC3420c r17, q83.InterfaceC30057d<? super bm1.InterfaceC3420c> r18) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bm1.C3421d.m9885g(bm1.c, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: h */
    private final boolean m9886h(String previousStreakValue, String currentStreakValue) {
        return previousStreakValue != null && previousStreakValue.equals(currentStreakValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: i */
    public final Object m9887i(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f13364y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f13364y = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM48741d = dVar2.f13362w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f13364y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM48741d);
            if (!this.ffChecker.isFeatureEnabled("streaks-animation-android")) {
                return Boolean.FALSE;
            }
            InterfaceC17235b interfaceC17235b = this.experimentsChecker;
            C24005o c24005o = new C24005o(null, null, null, null, 15, null);
            dVar2.f13364y = 1;
            objM48741d = InterfaceC17235b.m48741d(interfaceC17235b, c24005o, 0L, true, true, dVar2, 2, null);
            if (objM48741d == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM48741d);
        }
        return Boolean.valueOf(AbstractC22676k.m65745e((String) objM48741d, "test"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX INFO: renamed from: j */
    public final InterfaceC3420c m9888j(InterfaceC3420c prevDomainState, InterfaceC3419b.a action) {
        EnumC14604h enumC14604h;
        EnumC14604h enumC14604h2;
        String streakState;
        EnumC14604h enumC14604h3;
        String streakState2;
        EnumC14604h enumC14604h4;
        if (!(prevDomainState instanceof InterfaceC3420c.d)) {
            return prevDomainState;
        }
        C15970e c15970e = this.analyticsHelper;
        InterfaceC3420c.d dVar = (InterfaceC3420c.d) prevDomainState;
        StreakMetadata previousStreakData = dVar.getPreviousStreakData();
        int i13 = 0;
        if (previousStreakData == null || (streakState2 = previousStreakData.getStreakState()) == null) {
            enumC14604h = EnumC14604h.ACTIVE;
        } else {
            enumC14604h = EnumC14604h.ACTIVE;
            EnumC14604h[] enumC14604hArrValues = EnumC14604h.values();
            int length = enumC14604hArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    enumC14604h4 = null;
                    break;
                }
                enumC14604h4 = enumC14604hArrValues[i14];
                if (AbstractC22676k.m65745e(enumC14604h4.name(), streakState2)) {
                    break;
                }
                i14++;
            }
            if (enumC14604h4 != null) {
                enumC14604h = enumC14604h4;
            }
            if (enumC14604h == null) {
                enumC14604h = EnumC14604h.ACTIVE;
            }
        }
        StreakMetadata currentStreakData = dVar.getCurrentStreakData();
        if (currentStreakData == null || (streakState = currentStreakData.getStreakState()) == null) {
            enumC14604h2 = EnumC14604h.ACTIVE;
        } else {
            enumC14604h2 = EnumC14604h.ACTIVE;
            EnumC14604h[] enumC14604hArrValues2 = EnumC14604h.values();
            int length2 = enumC14604hArrValues2.length;
            while (true) {
                if (i13 >= length2) {
                    enumC14604h3 = null;
                    break;
                }
                enumC14604h3 = enumC14604hArrValues2[i13];
                if (AbstractC22676k.m65745e(enumC14604h3.name(), streakState)) {
                    break;
                }
                i13++;
            }
            if (enumC14604h3 != null) {
                enumC14604h2 = enumC14604h3;
            }
            if (enumC14604h2 == null) {
                enumC14604h2 = EnumC14604h.ACTIVE;
            }
        }
        c15970e.m45108b(enumC14604h, enumC14604h2);
        StreakMetadata currentStreakData2 = dVar.getCurrentStreakData();
        return InterfaceC3420c.d.m9875b(dVar, null, null, m9886h(currentStreakData2 != null ? currentStreakData2.getStreakValue() : null, action.getStreakValue()), false, 11, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(InterfaceC3420c.c.f13332a, AbstractC28157e0.m85207a(upstream, this.scopeActions), new c(null));
    }

    public /* synthetic */ C3421d(StreaksHomeApi streaksHomeApi, FeatureFlagChecker featureFlagChecker, InterfaceC17235b interfaceC17235b, C15970e c15970e, InterfaceC34116n interfaceC34116n, C3422e c3422e, C37378a c37378a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(streaksHomeApi, featureFlagChecker, interfaceC17235b, c15970e, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("StreaksHomeInteractor") : interfaceC34116n, c3422e, c37378a);
    }
}
