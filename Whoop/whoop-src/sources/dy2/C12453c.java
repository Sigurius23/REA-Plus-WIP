package dy2;

import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ex2.C13731b;
import l83.C23454a0;
import nz2.AbstractC27308b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: dy2.c */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Ldy2/c;", "", "Lex2/b;", "labsCampaignRepository", "Ltr2/n;", "logger", "<init>", "(Lex2/b;Ltr2/n;)V", "", "campaignId", "Lec3/l;", "Ldy2/b;", "e", "(ILq83/d;)Ljava/lang/Object;", "Ldy2/a;", "upstream", "d", "(Lec3/l;)Lec3/l;", "a", "Lex2/b;", "b", "Ltr2/n;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12453c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C13731b labsCampaignRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: dy2.c$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignschedule.interactor.CampaignScheduleInteractor$interact$$inlined$flatMapLatest$1", m100430f = "CampaignScheduleInteractor.kt", m100431l = {191, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f42508E;

        /* JADX INFO: renamed from: F */
        Object f42509F;

        /* JADX INFO: renamed from: G */
        Object f42510G;

        /* JADX INFO: renamed from: H */
        int f42511H;

        /* JADX INFO: renamed from: w */
        int f42512w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f42513x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f42514y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C12453c f42515z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C12453c c12453c) {
            super(3, interfaceC30057d);
            this.f42515z = c12453c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC12451a abstractC12451a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f42515z);
            aVar.f42513x = interfaceC13062m;
            aVar.f42514y = abstractC12451a;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, (ec3.InterfaceC13058l) r8, r7) == r0) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r7.f42512w
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L31
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r7.f42513x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L74
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                java.lang.Object r1 = r7.f42510G
                dy2.a r1 = (dy2.AbstractC12451a) r1
                java.lang.Object r1 = r7.f42509F
                q83.d r1 = (q83.InterfaceC30057d) r1
                java.lang.Object r1 = r7.f42508E
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r3 = r7.f42513x
                ec3.m r3 = (ec3.InterfaceC13062m) r3
                p505ts.AbstractC34132o.m107864I(r8)
                goto L5f
            L31:
                p505ts.AbstractC34132o.m107864I(r8)
                java.lang.Object r8 = r7.f42513x
                r1 = r8
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r8 = r7.f42514y
                dy2.a r8 = (dy2.AbstractC12451a) r8
                boolean r5 = r8 instanceof dy2.AbstractC12451a.a
                if (r5 == 0) goto L77
                dy2.c r5 = r7.f42515z
                dy2.a$a r8 = (dy2.AbstractC12451a.a) r8
                int r8 = r8.getCampaignId()
                r7.f42513x = r4
                r7.f42514y = r4
                r7.f42508E = r1
                r7.f42509F = r4
                r7.f42510G = r4
                r6 = 0
                r7.f42511H = r6
                r7.f42512w = r3
                java.lang.Object r8 = dy2.C12453c.m35089c(r5, r8, r7)
                if (r8 != r0) goto L5f
                goto L73
            L5f:
                ec3.l r8 = (ec3.InterfaceC13058l) r8
                r7.f42513x = r4
                r7.f42514y = r4
                r7.f42508E = r4
                r7.f42509F = r4
                r7.f42510G = r4
                r7.f42512w = r2
                java.lang.Object r8 = ec3.AbstractC13091v.m36613w(r1, r8, r7)
                if (r8 != r0) goto L74
            L73:
                return r0
            L74:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            L77:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: dy2.C12453c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC12451a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: dy2.c$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignschedule.interactor.CampaignScheduleInteractor$loadCampaignSchedule$2", m100430f = "CampaignScheduleInteractor.kt", m100431l = {24, 27, 26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldy2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ int f42516E;

        /* JADX INFO: renamed from: w */
        Object f42517w;

        /* JADX INFO: renamed from: x */
        int f42518x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f42519y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i13, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f42516E = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C12453c.this.new b(this.f42516E, interfaceC30057d);
            bVar.f42519y = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x006b  */
        /* JADX WARN: Code duplicated, block: B:21:0x0071  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
        
            if (r0.emit(r2, r7) == r1) goto L24;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f42519y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f42518x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2c
                if (r2 == r5) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                p505ts.AbstractC34132o.m107864I(r8)
                goto L84
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r0 = r7.f42517w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L65
            L28:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L3c
            L2c:
                p505ts.AbstractC34132o.m107864I(r8)
                dy2.b$c r8 = dy2.AbstractC12452b.c.f42505a
                r7.f42519y = r0
                r7.f42518x = r5
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L3c
                goto L83
            L3c:
                dy2.c r8 = dy2.C12453c.this
                tr2.n r8 = dy2.C12453c.m35088b(r8)
                int r2 = r7.f42516E
                java.lang.String r5 = "Loading campaign schedule for campaignId: "
                java.lang.String r2 = p031b9.AbstractC2875y.m8295h(r2, r5)
                r5 = 0
                qr2.a$a[] r5 = new qr2.AbstractC30556a.a[r5]
                r8.mo85216g(r2, r5)
                dy2.c r8 = dy2.C12453c.this
                ex2.b r8 = dy2.C12453c.m35087a(r8)
                int r2 = r7.f42516E
                r7.f42519y = r6
                r7.f42517w = r0
                r7.f42518x = r4
                java.lang.Object r8 = r8.m38974k(r2, r7)
                if (r8 != r1) goto L65
                goto L83
            L65:
                int r2 = r7.f42516E
                com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignScheduleScreenResponse r8 = (com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignScheduleScreenResponse) r8
                if (r8 == 0) goto L71
                dy2.b$a r2 = new dy2.b$a
                r2.<init>(r8)
                goto L77
            L71:
                dy2.b$b r8 = new dy2.b$b
                r8.<init>(r2)
                r2 = r8
            L77:
                r7.f42519y = r6
                r7.f42517w = r6
                r7.f42518x = r3
                java.lang.Object r8 = r0.emit(r2, r7)
                if (r8 != r1) goto L84
            L83:
                return r1
            L84:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: dy2.C12453c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C12453c(C13731b labsCampaignRepository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(labsCampaignRepository, "labsCampaignRepository");
        AbstractC22676k.m65750j(logger, "logger");
        this.labsCampaignRepository = labsCampaignRepository;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final Object m35090e(int i13, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new C13084s1(new b(i13, null));
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC13058l m35091d(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new a(null, this));
    }

    public /* synthetic */ C12453c(C13731b c13731b, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c13731b, (i13 & 2) != 0 ? AbstractC27308b.m82458a("CampaignScheduleInteractor") : interfaceC34116n);
    }
}
