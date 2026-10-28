package na0;

import c93.InterfaceC4351m;
import com.whoop.advancedlabs.actionplan.domain.models.ActionPlanResponse;
import com.whoop.advancedlabs.domain.AdvancedLabsApi;
import com.whoop.advancedlabs.domain.GetActionPlanRequest;
import com.whoop.data.repositories.FeatureFlagChecker;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: na0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lna0/d;", "Lod1/g;", "Lna0/b;", "Lna0/c;", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "api", "Lnm0/e;", "cachedApiSource", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lnm0/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "state", "action", "j", "(Lna0/c;Lna0/b;)Lna0/c;", "", "testId", "Lec3/l;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)Lec3/l;", "g", "i", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "b", "Lnm0/e;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "d", "Ltr2/n;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26508d implements InterfaceC27844g<AbstractC26506b, AbstractC26507c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AdvancedLabsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: na0.d$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.domain.ActionPlanInteractor$fetchCachedData$$inlined$cacheAPI$1", m100430f = "ActionPlanInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f105348w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f105349x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f105350y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f105351z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f105351z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f105351z);
            aVar.f105349x = interfaceC13062m;
            aVar.f105350y = c26832c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f105348w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f105349x;
                C26832c c26832c = (C26832c) this.f105350y;
                InterfaceC26834e interfaceC26834e = this.f105351z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(ActionPlanResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(ActionPlanResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f105349x = null;
                this.f105350y = null;
                this.f105348w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: na0.d$b */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f105352w;

        /* JADX INFO: renamed from: na0.d$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f105353w;

            /* JADX INFO: renamed from: na0.d$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.domain.ActionPlanInteractor$fetchCachedData$$inlined$map$1$2", m100430f = "ActionPlanInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42042a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f105354E;

                /* JADX INFO: renamed from: F */
                Object f105355F;

                /* JADX INFO: renamed from: G */
                Object f105356G;

                /* JADX INFO: renamed from: H */
                int f105357H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f105358w;

                /* JADX INFO: renamed from: x */
                int f105359x;

                /* JADX INFO: renamed from: y */
                Object f105360y;

                public C42042a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f105358w = obj;
                    this.f105359x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f105353w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42042a c42042a;
                Object obj2;
                AbstractC26507c.c cVar;
                if (interfaceC30057d instanceof C42042a) {
                    c42042a = (C42042a) interfaceC30057d;
                    int i13 = c42042a.f105359x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42042a.f105359x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42042a = new C42042a(interfaceC30057d);
                    }
                } else {
                    c42042a = new C42042a(interfaceC30057d);
                }
                Object obj3 = c42042a.f105358w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42042a.f105359x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj3);
                    InterfaceC13062m interfaceC13062m = this.f105353w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        obj2 = AbstractC26507c.b.f105341a;
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                            cVar = new AbstractC26507c.c((ActionPlanResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), true);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                            cVar = new AbstractC26507c.c((ActionPlanResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData(), false, 2, null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                            cVar = new AbstractC26507c.c((ActionPlanResponse) ((InterfaceC29354a.d) interfaceC29354a).getData(), false, 2, null);
                        } else {
                            if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            obj2 = AbstractC26507c.a.f105340a;
                        }
                        obj2 = cVar;
                    }
                    c42042a.f105360y = null;
                    c42042a.f105354E = null;
                    c42042a.f105355F = null;
                    c42042a.f105356G = null;
                    c42042a.f105357H = 0;
                    c42042a.f105359x = 1;
                    if (interfaceC13062m.emit(obj2, c42042a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj3);
                }
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC13058l interfaceC13058l) {
            this.f105352w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f105352w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: na0.d$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.domain.ActionPlanInteractor$fetchRemoteData$1", m100430f = "ActionPlanInteractor.kt", m100431l = {114, 117}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lna0/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f105362E;

        /* JADX INFO: renamed from: w */
        Object f105363w;

        /* JADX INFO: renamed from: x */
        int f105364x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f105365y;

        /* JADX INFO: renamed from: na0.d$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.domain.ActionPlanInteractor$fetchRemoteData$1$response$1", m100430f = "ActionPlanInteractor.kt", m100431l = {115}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/actionplan/domain/models/ActionPlanResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f105367w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C26508d f105368x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f105369y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C26508d c26508d, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f105368x = c26508d;
                this.f105369y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f105368x, this.f105369y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f105367w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AdvancedLabsApi advancedLabsApi = this.f105368x.api;
                String str = this.f105369y;
                this.f105367w = 1;
                Object actionPlan = advancedLabsApi.getActionPlan(str, this);
                return actionPlan == enumC31071a ? enumC31071a : actionPlan;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super ActionPlanResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f105362E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C26508d.this.new c(this.f105362E, interfaceC30057d);
            cVar.f105365y = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
        
            if (r0.emit(r2, r14) == r1) goto L21;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f105365y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r14.f105364x
                r3 = 1
                r4 = 2
                r5 = 0
                if (r2 == 0) goto L27
                if (r2 == r3) goto L22
                if (r2 != r4) goto L1a
                java.lang.Object r0 = r14.f105363w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r15)
                r11 = r14
                goto L74
            L1a:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L22:
                p505ts.AbstractC34132o.m107864I(r15)
                r11 = r14
                goto L4c
            L27:
                p505ts.AbstractC34132o.m107864I(r15)
                u02.a$a r6 = u02.InterfaceC34385a.INSTANCE
                na0.d r15 = na0.C26508d.this
                tr2.n r7 = na0.C26508d.m78577e(r15)
                na0.d$c$a r10 = new na0.d$c$a
                na0.d r15 = na0.C26508d.this
                java.lang.String r2 = r14.f105362E
                r10.<init>(r15, r2, r5)
                r14.f105365y = r0
                r14.f105364x = r3
                r8 = 0
                java.lang.String r9 = "Failed to fetch action plan data"
                r12 = 2
                r13 = 0
                r11 = r14
                java.lang.Object r15 = u02.InterfaceC34385a.Companion.m108729b(r6, r7, r8, r9, r10, r11, r12, r13)
                if (r15 != r1) goto L4c
                goto L73
            L4c:
                u02.a r15 = (u02.InterfaceC34385a) r15
                boolean r2 = r15 instanceof u02.InterfaceC34385a.c
                if (r2 == 0) goto L61
                na0.c$c r2 = new na0.c$c
                u02.a$c r15 = (u02.InterfaceC34385a.c) r15
                java.lang.Object r15 = r15.m108735a()
                com.whoop.advancedlabs.actionplan.domain.models.ActionPlanResponse r15 = (com.whoop.advancedlabs.actionplan.domain.models.ActionPlanResponse) r15
                r3 = 0
                r2.<init>(r15, r3, r4, r5)
                goto L67
            L61:
                boolean r15 = r15 instanceof u02.InterfaceC34385a.b
                if (r15 == 0) goto L77
                na0.c$a r2 = na0.AbstractC26507c.a.f105340a
            L67:
                r11.f105365y = r5
                r11.f105363w = r5
                r11.f105364x = r4
                java.lang.Object r15 = r0.emit(r2, r14)
                if (r15 != r1) goto L74
            L73:
                return r1
            L74:
                l83.a0 r15 = l83.C23454a0.f92919a
                return r15
            L77:
                kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
                r15.<init>()
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: na0.C26508d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: na0.d$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.domain.ActionPlanInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ActionPlanInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f105370w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f105371x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f105372y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C26508d f105373z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C26508d c26508d) {
            super(3, interfaceC30057d);
            this.f105373z = c26508d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26510f c26510f, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f105373z);
            dVar.f105371x = interfaceC13062m;
            dVar.f105372y = c26510f;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l iVar;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f105370w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f105371x;
                C26510f c26510f = (C26510f) this.f105372y;
                String testId = c26510f.getTestId();
                AbstractC26506b action = c26510f.getAction();
                if (action instanceof AbstractC26506b.b) {
                    iVar = new h(this.f105373z.m78580h(((AbstractC26506b.b) action).getTestId()));
                } else {
                    iVar = action instanceof AbstractC26506b.d ? new i(this.f105373z.m78580h(testId)) : new C0456u(new AbstractC26509e.b(action), 1);
                }
                this.f105371x = null;
                this.f105372y = null;
                this.f105370w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, iVar, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C26510f) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: na0.d$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.domain.ActionPlanInteractor$interact$$inlined$transform$1", m100430f = "ActionPlanInteractor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f105374w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f105375x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f105376y;

        /* JADX INFO: renamed from: na0.d$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f105377w;

            /* JADX INFO: renamed from: na0.d$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.domain.ActionPlanInteractor$interact$$inlined$transform$1$1", m100430f = "ActionPlanInteractor.kt", m100431l = {40, 42}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42043a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f105378E;

                /* JADX INFO: renamed from: F */
                Object f105379F;

                /* JADX INFO: renamed from: G */
                Object f105380G;

                /* JADX INFO: renamed from: H */
                int f105381H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f105382w;

                /* JADX INFO: renamed from: x */
                int f105383x;

                /* JADX INFO: renamed from: z */
                Object f105385z;

                public C42043a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f105382w = obj;
                    this.f105383x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f105377w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
            
                if (r2.emit(r8, r0) == r1) goto L27;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, q83.InterfaceC30057d<? super l83.C23454a0> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof na0.C26508d.e.a.C42043a
                    if (r0 == 0) goto L13
                    r0 = r9
                    na0.d$e$a$a r0 = (na0.C26508d.e.a.C42043a) r0
                    int r1 = r0.f105383x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f105383x = r1
                    goto L18
                L13:
                    na0.d$e$a$a r0 = new na0.d$e$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f105382w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f105383x
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L51
                    if (r2 == r4) goto L3f
                    if (r2 != r3) goto L37
                    java.lang.Object r8 = r0.f105380G
                    ec3.m r8 = (ec3.InterfaceC13062m) r8
                    java.lang.Object r8 = r0.f105379F
                    na0.b r8 = (na0.AbstractC26506b) r8
                    java.lang.Object r8 = r0.f105378E
                    q83.d r8 = (q83.InterfaceC30057d) r8
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L8d
                L37:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3f:
                    int r8 = r0.f105381H
                    java.lang.Object r2 = r0.f105380G
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r4 = r0.f105379F
                    na0.b r4 = (na0.AbstractC26506b) r4
                    java.lang.Object r6 = r0.f105378E
                    q83.d r6 = (q83.InterfaceC30057d) r6
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L78
                L51:
                    p505ts.AbstractC34132o.m107864I(r9)
                    ec3.m r2 = r7.f105377w
                    na0.b r8 = (na0.AbstractC26506b) r8
                    boolean r9 = r8 instanceof na0.AbstractC26506b.b
                    r6 = 0
                    if (r9 != 0) goto L61
                    boolean r9 = r8 instanceof na0.AbstractC26506b.d
                    if (r9 == 0) goto L7a
                L61:
                    na0.b$c r9 = na0.AbstractC26506b.c.f105338a
                    r0.f105385z = r5
                    r0.f105378E = r5
                    r0.f105379F = r8
                    r0.f105380G = r2
                    r0.f105381H = r6
                    r0.f105383x = r4
                    java.lang.Object r9 = r2.emit(r9, r0)
                    if (r9 != r1) goto L76
                    goto L8c
                L76:
                    r4 = r8
                    r8 = r6
                L78:
                    r6 = r8
                    r8 = r4
                L7a:
                    r0.f105385z = r5
                    r0.f105378E = r5
                    r0.f105379F = r5
                    r0.f105380G = r5
                    r0.f105381H = r6
                    r0.f105383x = r3
                    java.lang.Object r8 = r2.emit(r8, r0)
                    if (r8 != r1) goto L8d
                L8c:
                    return r1
                L8d:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: na0.C26508d.e.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f105376y = interfaceC13058l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f105376y, interfaceC30057d);
            eVar.f105375x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f105374w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f105375x;
                InterfaceC13058l interfaceC13058l = this.f105376y;
                a aVar = new a(interfaceC13062m);
                this.f105375x = null;
                this.f105374w = 1;
                if (interfaceC13058l.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: na0.d$f */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.domain.ActionPlanInteractor$interact$2", m100430f = "ActionPlanInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lna0/f;", "prev", "Lna0/b;", "action", "<anonymous>", "(Lna0/f;Lna0/b;)Lna0/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f105386w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f105387x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f105388y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C26510f c26510f, AbstractC26506b abstractC26506b, InterfaceC30057d<? super C26510f> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f105387x = c26510f;
            fVar.f105388y = abstractC26506b;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C26510f c26510f = (C26510f) this.f105387x;
            AbstractC26506b abstractC26506b = (AbstractC26506b) this.f105388y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f105386w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C26510f(abstractC26506b instanceof AbstractC26506b.b ? ((AbstractC26506b.b) abstractC26506b).getTestId() : c26510f.m78589c(), abstractC26506b);
        }
    }

    /* JADX INFO: renamed from: na0.d$g */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.domain.ActionPlanInteractor$interact$4", m100430f = "ActionPlanInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lna0/c;", "state", "Lna0/e;", "internalAction", "<anonymous>", "(Lna0/c;Lna0/e;)Lna0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f105389w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f105390x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f105391y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC26507c abstractC26507c, AbstractC26509e abstractC26509e, InterfaceC30057d<? super AbstractC26507c> interfaceC30057d) {
            g gVar = C26508d.this.new g(interfaceC30057d);
            gVar.f105390x = abstractC26507c;
            gVar.f105391y = abstractC26509e;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC26507c abstractC26507c = (AbstractC26507c) this.f105390x;
            AbstractC26509e abstractC26509e = (AbstractC26509e) this.f105391y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f105389w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC26509e instanceof AbstractC26509e.a) {
                return ((AbstractC26509e.a) abstractC26509e).getResult();
            }
            if (abstractC26509e instanceof AbstractC26509e.b) {
                return C26508d.this.m78582j(abstractC26507c, ((AbstractC26509e.b) abstractC26509e).getAction());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: na0.d$h */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f105393w;

        /* JADX INFO: renamed from: na0.d$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f105394w;

            /* JADX INFO: renamed from: na0.d$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.domain.ActionPlanInteractor$interact$lambda$1$$inlined$map$1$2", m100430f = "ActionPlanInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42044a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f105395E;

                /* JADX INFO: renamed from: F */
                Object f105396F;

                /* JADX INFO: renamed from: G */
                Object f105397G;

                /* JADX INFO: renamed from: H */
                int f105398H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f105399w;

                /* JADX INFO: renamed from: x */
                int f105400x;

                /* JADX INFO: renamed from: y */
                Object f105401y;

                public C42044a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f105399w = obj;
                    this.f105400x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f105394w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42044a c42044a;
                if (interfaceC30057d instanceof C42044a) {
                    c42044a = (C42044a) interfaceC30057d;
                    int i13 = c42044a.f105400x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42044a.f105400x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42044a = new C42044a(interfaceC30057d);
                    }
                } else {
                    c42044a = new C42044a(interfaceC30057d);
                }
                Object obj2 = c42044a.f105399w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42044a.f105400x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f105394w;
                    AbstractC26509e.a aVar = new AbstractC26509e.a((AbstractC26507c) obj);
                    c42044a.f105401y = null;
                    c42044a.f105395E = null;
                    c42044a.f105396F = null;
                    c42044a.f105397G = null;
                    c42044a.f105398H = 0;
                    c42044a.f105400x = 1;
                    if (interfaceC13062m.emit(aVar, c42044a) == enumC31071a) {
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
            this.f105393w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f105393w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: na0.d$i */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f105403w;

        /* JADX INFO: renamed from: na0.d$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f105404w;

            /* JADX INFO: renamed from: na0.d$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.domain.ActionPlanInteractor$interact$lambda$1$$inlined$map$2$2", m100430f = "ActionPlanInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42045a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f105405E;

                /* JADX INFO: renamed from: F */
                Object f105406F;

                /* JADX INFO: renamed from: G */
                Object f105407G;

                /* JADX INFO: renamed from: H */
                int f105408H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f105409w;

                /* JADX INFO: renamed from: x */
                int f105410x;

                /* JADX INFO: renamed from: y */
                Object f105411y;

                public C42045a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f105409w = obj;
                    this.f105410x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f105404w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42045a c42045a;
                if (interfaceC30057d instanceof C42045a) {
                    c42045a = (C42045a) interfaceC30057d;
                    int i13 = c42045a.f105410x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42045a.f105410x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42045a = new C42045a(interfaceC30057d);
                    }
                } else {
                    c42045a = new C42045a(interfaceC30057d);
                }
                Object obj2 = c42045a.f105409w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42045a.f105410x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f105404w;
                    AbstractC26509e.a aVar = new AbstractC26509e.a((AbstractC26507c) obj);
                    c42045a.f105411y = null;
                    c42045a.f105405E = null;
                    c42045a.f105406F = null;
                    c42045a.f105407G = null;
                    c42045a.f105408H = 0;
                    c42045a.f105410x = 1;
                    if (interfaceC13062m.emit(aVar, c42045a) == enumC31071a) {
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

        public i(InterfaceC13058l interfaceC13058l) {
            this.f105403w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f105403w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C26508d(AdvancedLabsApi api, InterfaceC26834e cachedApiSource, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.cachedApiSource = cachedApiSource;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC13058l m78579g(String testId) {
        return new b(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetActionPlanRequest(testId), 1), AbstractC12350b.m34570S("AdvancedLabsScope"), null, 2, null), new a(null, this.cachedApiSource)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m78580h(String testId) {
        return this.featureFlagChecker.isFeatureEnabled("advanced-labs-android-caching") ? m78579g(testId) : m78581i(testId);
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC13058l m78581i(String testId) {
        return new C13084s1(new c(testId, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final AbstractC26507c m78582j(AbstractC26507c state, AbstractC26506b action) {
        AbstractC26507c.c cVarM78571b;
        if (action instanceof AbstractC26506b.c) {
            AbstractC26507c.c cVar = state instanceof AbstractC26507c.c ? (AbstractC26507c.c) state : null;
            return (cVar == null || (cVarM78571b = AbstractC26507c.c.m78571b(cVar, null, true, 1, null)) == null) ? AbstractC26507c.b.f105341a : cVarM78571b;
        }
        if (!(action instanceof AbstractC26506b.a)) {
            return state;
        }
        this.logger.mo85222m(((AbstractC26506b.a) action).getMessage(), new AbstractC30556a.a[0]);
        return AbstractC26507c.a.f105340a;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36612v(new C13060l1(AbstractC26507c.b.f105341a, AbstractC13091v.m36590P(AbstractC13091v.m36612v(new C13060l1(new C26510f(null, null, 3, null), new C13084s1(new e(upstream, null)), new f(null)), 1), new d(null, this)), new g(null)), 1);
    }

    public /* synthetic */ C26508d(AdvancedLabsApi advancedLabsApi, InterfaceC26834e interfaceC26834e, FeatureFlagChecker featureFlagChecker, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(advancedLabsApi, interfaceC26834e, featureFlagChecker, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ActionPlanInteractor") : interfaceC34116n);
    }
}
