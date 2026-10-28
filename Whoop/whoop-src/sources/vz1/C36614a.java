package vz1;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import ao2.C1876a;
import ao2.C1877b;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.C13060l1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import mz1.AbstractC26041d;
import od1.AbstractC27845h;
import or2.C28180m;
import oz1.C28498a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pz1.AbstractC29643a;
import pz1.C29644b;
import pz1.C29646d;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tz1.C34284f;
import tz1.C34285g;
import tz1.InterfaceC34282d;

/* JADX INFO: renamed from: vz1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020+0*8\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u00101¨\u00063"}, m65681d2 = {"Lvz1/a;", "Landroidx/lifecycle/w1;", "Lpz1/d;", "interactor", "Ltz1/g;", "reducer", "Loz1/a;", "analyticsHelper", "Lao2/a;", "cartIndicatorRepository", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lbc3/c0;", "coroutineScope", "<init>", "(Lpz1/d;Ltz1/g;Loz1/a;Lao2/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V", "Ltz1/d$m;", "u", "(Ltz1/d$m;)Ltz1/d$m;", "Lpz1/a;", "t", "(Ltz1/d$m;)Lpz1/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "r", "(Ltz1/d$m;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltz1/g;", "x", "Loz1/a;", "y", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "z", "Lbc3/c0;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "", "F", "Ljava/lang/String;", "currentSource", "Lec3/l;", "Ltz1/f;", "G", "Lec3/l;", "reducedViewStateFlow", "H", "getViewState", "()Lec3/l;", "viewState", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36614a extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private String currentSource;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l reducedViewStateFlow;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C34285g reducer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C28498a analyticsHelper;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: vz1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.home.viewmodel.NativeStoreViewModel$reducedViewStateFlow$2", m100430f = "NativeStoreViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ltz1/d$m;", "it", "Ll83/a0;", "<anonymous>", "(Ltz1/d$m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f156847w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f156848x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C36614a.this.new a(interfaceC30057d);
            aVar.f156848x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC34282d.m mVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(mVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC34282d.m mVar = (InterfaceC34282d.m) this.f156848x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f156847w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (mVar instanceof InterfaceC34282d.a) {
                C36614a.this.analyticsHelper.m86809k((InterfaceC34282d.a) mVar, C36614a.this.currentSource);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vz1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.home.viewmodel.NativeStoreViewModel$sendViewEvent$1", m100430f = "NativeStoreViewModel.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f156850w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC34282d.m f156852y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC34282d.m mVar, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f156852y = mVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36614a.this.new b(this.f156852y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f156850w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C36614a.this.eventFlow;
                InterfaceC34282d.m mVar = this.f156852y;
                this.f156850w = 1;
                if (interfaceC13072o1.emit(mVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: vz1.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f156853w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36614a f156854x;

        /* JADX INFO: renamed from: vz1.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f156855w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C36614a f156856x;

            /* JADX INFO: renamed from: vz1.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.nativestore.home.viewmodel.NativeStoreViewModel$special$$inlined$map$1$2", m100430f = "NativeStoreViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42572a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f156857E;

                /* JADX INFO: renamed from: F */
                Object f156858F;

                /* JADX INFO: renamed from: G */
                Object f156859G;

                /* JADX INFO: renamed from: H */
                int f156860H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f156861w;

                /* JADX INFO: renamed from: x */
                int f156862x;

                /* JADX INFO: renamed from: y */
                Object f156863y;

                public C42572a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f156861w = obj;
                    this.f156862x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C36614a c36614a) {
                this.f156855w = interfaceC13062m;
                this.f156856x = c36614a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42572a c42572a;
                if (interfaceC30057d instanceof C42572a) {
                    c42572a = (C42572a) interfaceC30057d;
                    int i13 = c42572a.f156862x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42572a.f156862x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42572a = new C42572a(interfaceC30057d);
                    }
                } else {
                    c42572a = new C42572a(interfaceC30057d);
                }
                Object obj2 = c42572a.f156861w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42572a.f156862x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f156855w;
                    InterfaceC34282d.m mVarM117622u = this.f156856x.m117622u((InterfaceC34282d.m) obj);
                    c42572a.f156863y = null;
                    c42572a.f156857E = null;
                    c42572a.f156858F = null;
                    c42572a.f156859G = null;
                    c42572a.f156860H = 0;
                    c42572a.f156862x = 1;
                    if (interfaceC13062m.emit(mVarM117622u, c42572a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C36614a c36614a) {
            this.f156853w = interfaceC13058l;
            this.f156854x = c36614a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f156853w.collect(new a(interfaceC13062m, this.f156854x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vz1.a$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f156865w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36614a f156866x;

        /* JADX INFO: renamed from: vz1.a$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f156867w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C36614a f156868x;

            /* JADX INFO: renamed from: vz1.a$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.nativestore.home.viewmodel.NativeStoreViewModel$special$$inlined$map$2$2", m100430f = "NativeStoreViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42573a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f156869E;

                /* JADX INFO: renamed from: F */
                Object f156870F;

                /* JADX INFO: renamed from: G */
                Object f156871G;

                /* JADX INFO: renamed from: H */
                int f156872H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f156873w;

                /* JADX INFO: renamed from: x */
                int f156874x;

                /* JADX INFO: renamed from: y */
                Object f156875y;

                public C42573a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f156873w = obj;
                    this.f156874x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C36614a c36614a) {
                this.f156867w = interfaceC13062m;
                this.f156868x = c36614a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42573a c42573a;
                if (interfaceC30057d instanceof C42573a) {
                    c42573a = (C42573a) interfaceC30057d;
                    int i13 = c42573a.f156874x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42573a.f156874x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42573a = new C42573a(interfaceC30057d);
                    }
                } else {
                    c42573a = new C42573a(interfaceC30057d);
                }
                Object obj2 = c42573a.f156873w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42573a.f156874x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f156867w;
                    AbstractC29643a abstractC29643aM117621t = this.f156868x.m117621t((InterfaceC34282d.m) obj);
                    c42573a.f156875y = null;
                    c42573a.f156869E = null;
                    c42573a.f156870F = null;
                    c42573a.f156871G = null;
                    c42573a.f156872H = 0;
                    c42573a.f156874x = 1;
                    if (interfaceC13062m.emit(abstractC29643aM117621t, c42573a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C36614a c36614a) {
            this.f156865w = interfaceC13058l;
            this.f156866x = c36614a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f156865w.collect(new a(interfaceC13062m, this.f156866x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vz1.a$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f156877w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36614a f156878x;

        /* JADX INFO: renamed from: vz1.a$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f156879w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C36614a f156880x;

            /* JADX INFO: renamed from: vz1.a$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.nativestore.home.viewmodel.NativeStoreViewModel$special$$inlined$map$3$2", m100430f = "NativeStoreViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42574a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f156881E;

                /* JADX INFO: renamed from: F */
                Object f156882F;

                /* JADX INFO: renamed from: G */
                Object f156883G;

                /* JADX INFO: renamed from: H */
                int f156884H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f156885w;

                /* JADX INFO: renamed from: x */
                int f156886x;

                /* JADX INFO: renamed from: y */
                Object f156887y;

                public C42574a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f156885w = obj;
                    this.f156886x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C36614a c36614a) {
                this.f156879w = interfaceC13062m;
                this.f156880x = c36614a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42574a c42574a;
                if (interfaceC30057d instanceof C42574a) {
                    c42574a = (C42574a) interfaceC30057d;
                    int i13 = c42574a.f156886x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42574a.f156886x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42574a = new C42574a(interfaceC30057d);
                    }
                } else {
                    c42574a = new C42574a(interfaceC30057d);
                }
                Object obj2 = c42574a.f156885w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42574a.f156886x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f156879w;
                    C34284f c34284fM108592a = this.f156880x.reducer.m108592a((C29644b) obj);
                    c42574a.f156887y = null;
                    c42574a.f156881E = null;
                    c42574a.f156882F = null;
                    c42574a.f156883G = null;
                    c42574a.f156884H = 0;
                    c42574a.f156886x = 1;
                    if (interfaceC13062m.emit(c34284fM108592a, c42574a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l, C36614a c36614a) {
            this.f156877w = interfaceC13058l;
            this.f156878x = c36614a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f156877w.collect(new a(interfaceC13062m, this.f156878x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vz1.a$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.home.viewmodel.NativeStoreViewModel$viewState$1", m100430f = "NativeStoreViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ltz1/f;", "viewState", "Lao2/b;", "cartIndicator", "<anonymous>", "(Ltz1/f;Lao2/b;)Ltz1/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f156889w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f156890x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f156891y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C34284f c34284f, C1877b c1877b, InterfaceC30057d<? super C34284f> interfaceC30057d) {
            f fVar = C36614a.this.new f(interfaceC30057d);
            fVar.f156890x = c34284f;
            fVar.f156891y = c1877b;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C34284f c34284f = (C34284f) this.f156890x;
            C1877b c1877b = (C1877b) this.f156891y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f156889w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C34284f.m108584b(c34284f, false, false, null, c1877b, AbstractC26041d.m77465c(C36614a.this.currentSource, C36614a.this.featureFlagChecker), 7, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36614a(C29646d interactor, C34285g reducer, C28498a analyticsHelper, C1876a cartIndicatorRepository, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(cartIndicatorRepository, "cartIndicatorRepository");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.analyticsHelper = analyticsHelper;
        this.featureFlagChecker = featureFlagChecker;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        e eVar = new e(AbstractC27845h.m83945a(new d(new C13052j1(new c(c13096w1M36592b, this), new a(null), 0), this), interactor), this);
        this.reducedViewStateFlow = eVar;
        this.viewState = AbstractC13091v.m36586L(new C13060l1(eVar, cartIndicatorRepository.getState(), new f(null), 1), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final AbstractC29643a m117621t(InterfaceC34282d.m mVar) {
        if (mVar instanceof InterfaceC34282d.g) {
            return new AbstractC29643a.b(((InterfaceC34282d.g) mVar).getSource());
        }
        if (mVar instanceof InterfaceC34282d.k) {
            return new AbstractC29643a.b(((InterfaceC34282d.k) mVar).getSource());
        }
        if (mVar instanceof InterfaceC34282d.j) {
            return new AbstractC29643a.b(((InterfaceC34282d.j) mVar).getSource());
        }
        if (mVar instanceof InterfaceC34282d.e) {
            return new AbstractC29643a.a(((InterfaceC34282d.e) mVar).getCountry(), this.currentSource);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final InterfaceC34282d.m m117622u(InterfaceC34282d.m mVar) {
        if (mVar instanceof InterfaceC34282d.g) {
            this.currentSource = ((InterfaceC34282d.g) mVar).getSource();
            return mVar;
        }
        if (mVar instanceof InterfaceC34282d.k) {
            this.currentSource = ((InterfaceC34282d.k) mVar).getSource();
            return mVar;
        }
        if (mVar instanceof InterfaceC34282d.j) {
            return new InterfaceC34282d.j(this.currentSource);
        }
        if (mVar instanceof InterfaceC34282d.e) {
            return mVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: r */
    public final void m117623r(InterfaceC34282d.m event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(event, null), 3);
    }

    public /* synthetic */ C36614a(C29646d c29646d, C34285g c34285g, C28498a c28498a, C1876a c1876a, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c29646d, c34285g, c28498a, c1876a, featureFlagChecker, (i13 & 32) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
