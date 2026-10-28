package wk1;

import c93.InterfaceC4351m;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.helpcenter.data.network.HelpCenterApi;
import com.whoop.helpcenter.data.network.model.HelpCenterLandingBffDto;
import com.whoop.whoopaction.domain.models.Action;
import ec3.AbstractC13091v;
import ec3.C13054k;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qw2.AbstractC30694b;
import qw2.C30695c;
import qw2.C30698f;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import yk1.AbstractC39599a;
import yk1.AbstractC39600b;

/* JADX INFO: renamed from: wk1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lwk1/b;", "", "Lcom/whoop/helpcenter/data/network/HelpCenterApi;", "api", "Lqw2/c;", "actionInteractor", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/helpcenter/data/network/HelpCenterApi;Lqw2/c;Ltr2/n;)V", "argument", "Lec3/l;", "Lwk1/c;", "f", "(Ljava/lang/Object;)Lec3/l;", "d", "(Lq83/d;)Ljava/lang/Object;", "Lwk1/a;", "upstream", "e", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/helpcenter/data/network/HelpCenterApi;", "b", "Lqw2/c;", "c", "Ltr2/n;", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37338b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HelpCenterApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: wk1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.helpcenter.domain.HelpCenterDomainInteractor", m100430f = "HelpCenterDomainInteractor.kt", m100431l = {56}, m100432m = "fetchLandingScreenData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f159714w;

        /* JADX INFO: renamed from: y */
        int f159716y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f159714w = obj;
            this.f159716y |= Integer.MIN_VALUE;
            return C37338b.this.m119574d(this);
        }
    }

    /* JADX INFO: renamed from: wk1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.helpcenter.domain.HelpCenterDomainInteractor$interact$$inlined$flatMapLatest$1", m100430f = "HelpCenterDomainInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f159717w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f159718x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f159719y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C37338b f159720z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C37338b c37338b) {
            super(3, interfaceC30057d);
            this.f159720z = c37338b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC37337a abstractC37337a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f159720z);
            bVar.f159718x = interfaceC13062m;
            bVar.f159719y = abstractC37337a;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM119575f;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f159717w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f159718x;
                AbstractC37337a abstractC37337a = (AbstractC37337a) this.f159719y;
                if (AbstractC22676k.m65745e(abstractC37337a, AbstractC37337a.a.f159709a)) {
                    interfaceC13058lM119575f = new C13084s1(this.f159720z.new c(null));
                } else {
                    if (!(abstractC37337a instanceof AbstractC37337a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC13058lM119575f = this.f159720z.m119575f(((AbstractC37337a.b) abstractC37337a).getAction());
                }
                this.f159718x = null;
                this.f159719y = null;
                this.f159717w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM119575f, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC37337a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: wk1.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.helpcenter.domain.HelpCenterDomainInteractor$interact$1$1", m100430f = "HelpCenterDomainInteractor.kt", m100431l = {29, 29}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lwk1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f159721w;

        /* JADX INFO: renamed from: x */
        int f159722x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f159723y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C37338b.this.new c(interfaceC30057d);
            cVar.f159723y = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f159723y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f159722x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L25
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L44
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r0 = r6.f159721w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L37
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                wk1.b r7 = wk1.C37338b.this
                r6.f159723y = r5
                r6.f159721w = r0
                r6.f159722x = r4
                java.lang.Object r7 = wk1.C37338b.m119571a(r7, r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.f159723y = r5
                r6.f159721w = r5
                r6.f159722x = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L44
            L43:
                return r1
            L44:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: wk1.C37338b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: wk1.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.helpcenter.domain.HelpCenterDomainInteractor$performCallTileAction$$inlined$transform$1", m100430f = "HelpCenterDomainInteractor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f159725w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f159726x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f159727y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C37338b f159728z;

        /* JADX INFO: renamed from: wk1.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f159729w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37338b f159730x;

            public a(InterfaceC13062m interfaceC13062m, C37338b c37338b) {
                this.f159730x = c37338b;
                this.f159729w = interfaceC13062m;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            public final Object emit(T t14, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                AbstractC30694b abstractC30694b = (AbstractC30694b) t14;
                if (abstractC30694b instanceof AbstractC30694b.a) {
                    this.f159730x.logger.mo85222m(AbstractC11266d.m30461o("Error performing Help Center call tile action: ", ((AbstractC30694b.a) abstractC30694b).getMessage()), new AbstractC30556a.a[0]);
                } else if (abstractC30694b instanceof AbstractC30694b.b) {
                    this.f159730x.logger.mo85226q("Unhandled Help Center call tile interaction: " + ((AbstractC30694b.b) abstractC30694b).getInteraction(), new AbstractC30556a.a[0]);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d, C37338b c37338b) {
            super(2, interfaceC30057d);
            this.f159727y = interfaceC13058l;
            this.f159728z = c37338b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f159727y, interfaceC30057d, this.f159728z);
            dVar.f159726x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f159725w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f159726x;
                InterfaceC13058l interfaceC13058l = this.f159727y;
                a aVar = new a(interfaceC13062m, this.f159728z);
                this.f159726x = null;
                this.f159725w = 1;
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

    public C37338b(HelpCenterApi api, C30695c actionInteractor, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.actionInteractor = actionInteractor;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m119574d(InterfaceC30057d<? super AbstractC37339c> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f159716y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f159716y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object landingScreenData = aVar.f159714w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f159716y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(landingScreenData);
                HelpCenterApi helpCenterApi = this.api;
                aVar.f159716y = 1;
                landingScreenData = helpCenterApi.getLandingScreenData(aVar);
                if (landingScreenData == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(landingScreenData);
            }
            return new AbstractC37339c.b(AbstractC39600b.m126485c((HelpCenterLandingBffDto) landingScreenData, null, 1, null));
        } catch (Exception e5) {
            this.logger.mo85230v("Error fetching Help Center Landing Screen data", e5, new AbstractC30556a.a[0]);
            return AbstractC37339c.a.f159731a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m119575f(Object argument) {
        Action actionM126482b = AbstractC39599a.m126482b(argument);
        if (actionM126482b != null) {
            return new C13084s1(new d(this.actionInteractor.interact(new C0456u(new C30698f(actionM126482b), 1)), null, this));
        }
        if (!(argument instanceof DesignItemInteraction)) {
            this.logger.mo85226q(AbstractC11266d.m30461o("Ignoring call tile event without an action: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(argument.getClass()).getSimpleName()), new AbstractC30556a.a[0]);
        }
        return C13054k.f45116w;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC13058l m119576e(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new b(null, this));
    }
}
