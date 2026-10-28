package eb0;

import com.whoop.advancedlabs.domain.AdvancedLabsApi;
import com.whoop.advancedlabs.domain.models.BiomarkerSummaryResponse;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.RequestExtensionsKt;
import com.whoop.whoopaction.domain.models.UpdateAction;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f63.AbstractC14155c;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.C34387c;
import u02.InterfaceC34385a;
import z02.InterfaceC39944a;

/* JADX INFO: renamed from: eb0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Leb0/c;", "Lod1/g;", "Leb0/a;", "Leb0/b;", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "api", "Lu02/c;", "apiClient", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lu02/c;Ltr2/n;)V", "i", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "j", "(Lcom/whoop/whoopaction/domain/models/Action;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/whoopaction/domain/models/UpdateAction;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/whoopaction/domain/models/UpdateAction;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "b", "Lu02/c;", "c", "Ltr2/n;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13004c implements InterfaceC27844g<AbstractC13002a, AbstractC13003b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AdvancedLabsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C34387c apiClient;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: eb0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.biomarkersummary.domain.BiomarkerSummaryInteractor", m100430f = "BiomarkerSummaryInteractor.kt", m100431l = {51, 56}, m100432m = "executeUpdateAction", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f44931E;

        /* JADX INFO: renamed from: w */
        Object f44932w;

        /* JADX INFO: renamed from: x */
        Object f44933x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f44934y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f44934y = obj;
            this.f44931E |= Integer.MIN_VALUE;
            return C13004c.this.m36522h(null, this);
        }
    }

    /* JADX INFO: renamed from: eb0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.biomarkersummary.domain.BiomarkerSummaryInteractor$executeUpdateAction$apiCall$1", m100430f = "BiomarkerSummaryInteractor.kt", m100431l = {52}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lf63/c;", "<anonymous>", "()Lf63/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f44936w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ UpdateAction f44938y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UpdateAction updateAction, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f44938y = updateAction;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C13004c.this.new b(this.f44938y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f44936w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C34387c c34387c = C13004c.this.apiClient;
            InterfaceC39944a actionApiRequest$default = RequestExtensionsKt.toActionApiRequest$default(this.f44938y.getRequest(), null, 1, null);
            InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(String.class);
            C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(String.class), interfaceC21456a0M65689b, AbstractC21478l0.m60396B(interfaceC21456a0M65689b));
            this.f44936w = 1;
            Object objM108748d = c34387c.m108748d(actionApiRequest$default, c32236aM44445Y, this);
            return objM108748d == enumC31071a ? enumC31071a : objM108748d;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AbstractC14155c> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: eb0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.biomarkersummary.domain.BiomarkerSummaryInteractor", m100430f = "BiomarkerSummaryInteractor.kt", m100431l = {36}, m100432m = "fetchData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f44939w;

        /* JADX INFO: renamed from: y */
        int f44941y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f44939w = obj;
            this.f44941y |= Integer.MIN_VALUE;
            return C13004c.this.m36523i(this);
        }
    }

    /* JADX INFO: renamed from: eb0.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.biomarkersummary.domain.BiomarkerSummaryInteractor$fetchData$response$1", m100430f = "BiomarkerSummaryInteractor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/domain/models/BiomarkerSummaryResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f44942w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C13004c.this.new d(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f44942w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AdvancedLabsApi advancedLabsApi = C13004c.this.api;
            this.f44942w = 1;
            Object biomarkerSummary = advancedLabsApi.getBiomarkerSummary(this);
            return biomarkerSummary == enumC31071a ? enumC31071a : biomarkerSummary;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super BiomarkerSummaryResponse> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: eb0.c$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f44944w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13004c f44945x;

        /* JADX INFO: renamed from: eb0.c$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f44946w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13004c f44947x;

            /* JADX INFO: renamed from: eb0.c$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.biomarkersummary.domain.BiomarkerSummaryInteractor$interact$$inlined$map$1$2", m100430f = "BiomarkerSummaryInteractor.kt", m100431l = {53, 57, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41518a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f44948E;

                /* JADX INFO: renamed from: F */
                Object f44949F;

                /* JADX INFO: renamed from: G */
                Object f44950G;

                /* JADX INFO: renamed from: H */
                Object f44951H;

                /* JADX INFO: renamed from: I */
                Object f44952I;

                /* JADX INFO: renamed from: J */
                Object f44953J;

                /* JADX INFO: renamed from: K */
                int f44954K;

                /* JADX INFO: renamed from: L */
                int f44955L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f44956w;

                /* JADX INFO: renamed from: x */
                int f44957x;

                /* JADX INFO: renamed from: y */
                Object f44958y;

                public C41518a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f44956w = obj;
                    this.f44957x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13004c c13004c) {
                this.f44946w = interfaceC13062m;
                this.f44947x = c13004c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
            
                if (r10 == r1) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
            
                r9 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
            
                if (r10 == r1) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00c1, code lost:
            
                if (r2.emit(r10, r0) == r1) goto L30;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, q83.InterfaceC30057d r10) {
                /*
                    Method dump skipped, instruction units count: 205
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: eb0.C13004c.e.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public e(InterfaceC13058l interfaceC13058l, C13004c c13004c) {
            this.f44944w = interfaceC13058l;
            this.f44945x = c13004c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f44944w.collect(new a(interfaceC13062m, this.f44945x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C13004c(AdvancedLabsApi api, C34387c apiClient, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.apiClient = apiClient;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: h */
    public final Object m36522h(UpdateAction updateAction, InterfaceC30057d<? super AbstractC13003b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f44931E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f44931E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f44934y;
        Object obj = EnumC31071a.f128113w;
        int i14 = aVar2.f44931E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(updateAction, null);
            aVar2.f44932w = null;
            aVar2.f44931E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "UpdateAction failed", bVar, aVar2, 2, null);
            if (objM108729b != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
            return objM108729b;
        }
        AbstractC34132o.m107864I(objM108729b);
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return AbstractC13003b.a.f44926a;
            }
            throw new NoWhenBranchMatchedException();
        }
        aVar2.f44932w = null;
        aVar2.f44933x = null;
        aVar2.f44931E = 2;
        Object objM36523i = m36523i(aVar2);
        return objM36523i == obj ? obj : objM36523i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: i */
    public final Object m36523i(InterfaceC30057d<? super AbstractC13003b> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f44941y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f44941y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM108729b = cVar2.f44939w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f44941y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(null);
            cVar2.f44941y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, dVar, cVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC13003b.b((BiomarkerSummaryResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC13003b.a.f44926a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final Object m36524j(Action action, InterfaceC30057d<? super AbstractC13003b> interfaceC30057d) {
        return action instanceof UpdateAction ? m36522h((UpdateAction) action, interfaceC30057d) : AbstractC13003b.a.f44926a;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new e(upstream, this);
    }

    public /* synthetic */ C13004c(AdvancedLabsApi advancedLabsApi, C34387c c34387c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(advancedLabsApi, c34387c, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("BiomarkerSummaryInteractor") : interfaceC34116n);
    }
}
