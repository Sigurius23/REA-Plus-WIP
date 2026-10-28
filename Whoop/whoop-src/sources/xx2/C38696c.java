package xx2;

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

/* JADX INFO: renamed from: xx2.c */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lxx2/c;", "", "Lex2/b;", "labsCampaignRepository", "Ltr2/n;", "logger", "<init>", "(Lex2/b;Ltr2/n;)V", "Lec3/l;", "Lxx2/b;", "e", "(Lq83/d;)Ljava/lang/Object;", "Lxx2/a;", "upstream", "d", "(Lec3/l;)Lec3/l;", "a", "Lex2/b;", "b", "Ltr2/n;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38696c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C13731b labsCampaignRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: xx2.c$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignlist.interactor.CampaignListInteractor$interact$$inlined$flatMapLatest$1", m100430f = "CampaignListInteractor.kt", m100431l = {191, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f166509E;

        /* JADX INFO: renamed from: F */
        Object f166510F;

        /* JADX INFO: renamed from: G */
        Object f166511G;

        /* JADX INFO: renamed from: H */
        int f166512H;

        /* JADX INFO: renamed from: w */
        int f166513w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f166514x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f166515y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C38696c f166516z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C38696c c38696c) {
            super(3, interfaceC30057d);
            this.f166516z = c38696c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC38694a abstractC38694a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f166516z);
            aVar.f166514x = interfaceC13062m;
            aVar.f166515y = abstractC38694a;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, (ec3.InterfaceC13058l) r7, r6) == r0) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r6.f166513w
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L31
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r6.f166514x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L72
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r1 = r6.f166511G
                xx2.a r1 = (xx2.AbstractC38694a) r1
                java.lang.Object r1 = r6.f166510F
                q83.d r1 = (q83.InterfaceC30057d) r1
                java.lang.Object r1 = r6.f166509E
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r3 = r6.f166514x
                ec3.m r3 = (ec3.InterfaceC13062m) r3
                p505ts.AbstractC34132o.m107864I(r7)
                goto L5d
            L31:
                p505ts.AbstractC34132o.m107864I(r7)
                java.lang.Object r7 = r6.f166514x
                r1 = r7
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r7 = r6.f166515y
                xx2.a r7 = (xx2.AbstractC38694a) r7
                xx2.a$a r5 = xx2.AbstractC38694a.a.f166503a
                boolean r7 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r7, r5)
                if (r7 == 0) goto L75
                xx2.c r7 = r6.f166516z
                r6.f166514x = r4
                r6.f166515y = r4
                r6.f166509E = r1
                r6.f166510F = r4
                r6.f166511G = r4
                r5 = 0
                r6.f166512H = r5
                r6.f166513w = r3
                java.lang.Object r7 = xx2.C38696c.m124104c(r7, r6)
                if (r7 != r0) goto L5d
                goto L71
            L5d:
                ec3.l r7 = (ec3.InterfaceC13058l) r7
                r6.f166514x = r4
                r6.f166515y = r4
                r6.f166509E = r4
                r6.f166510F = r4
                r6.f166511G = r4
                r6.f166513w = r2
                java.lang.Object r7 = ec3.AbstractC13091v.m36613w(r1, r7, r6)
                if (r7 != r0) goto L72
            L71:
                return r0
            L72:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            L75:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: xx2.C38696c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC38694a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: xx2.c$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignlist.interactor.CampaignListInteractor$loadCampaigns$2", m100430f = "CampaignListInteractor.kt", m100431l = {24, 27, 26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lxx2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f166517w;

        /* JADX INFO: renamed from: x */
        int f166518x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f166519y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C38696c.this.new b(interfaceC30057d);
            bVar.f166519y = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0064  */
        /* JADX WARN: Code duplicated, block: B:21:0x0075  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
        
            if (r0.emit(r2, r8) == r1) goto L24;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f166519y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r8.f166518x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                r7 = 0
                if (r2 == 0) goto L2e
                if (r2 == r5) goto L2a
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1a
                p505ts.AbstractC34132o.m107864I(r9)
                goto L8f
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                java.lang.Object r0 = r8.f166517w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r9)
                goto L5e
            L2a:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L3e
            L2e:
                p505ts.AbstractC34132o.m107864I(r9)
                xx2.b$c r9 = xx2.AbstractC38695b.c.f166506a
                r8.f166519y = r0
                r8.f166518x = r5
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L3e
                goto L8e
            L3e:
                xx2.c r9 = xx2.C38696c.this
                tr2.n r9 = xx2.C38696c.m124103b(r9)
                java.lang.String r2 = "Loading campaign list"
                qr2.a$a[] r5 = new qr2.AbstractC30556a.a[r7]
                r9.mo85216g(r2, r5)
                xx2.c r9 = xx2.C38696c.this
                ex2.b r9 = xx2.C38696c.m124102a(r9)
                r8.f166519y = r6
                r8.f166517w = r0
                r8.f166518x = r4
                java.lang.Object r9 = r9.m38973j(r8)
                if (r9 != r1) goto L5e
                goto L8e
            L5e:
                xx2.c r2 = xx2.C38696c.this
                com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignListScreenResponse r9 = (com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignListScreenResponse) r9
                if (r9 == 0) goto L75
                tr2.n r2 = xx2.C38696c.m124103b(r2)
                java.lang.String r4 = "Campaign list loaded"
                qr2.a$a[] r5 = new qr2.AbstractC30556a.a[r7]
                r2.mo85216g(r4, r5)
                xx2.b$a r2 = new xx2.b$a
                r2.<init>(r9)
                goto L82
            L75:
                tr2.n r9 = xx2.C38696c.m124103b(r2)
                java.lang.String r2 = "Error loading campaign list"
                qr2.a$a[] r4 = new qr2.AbstractC30556a.a[r7]
                r9.mo85222m(r2, r4)
                xx2.b$b r2 = xx2.AbstractC38695b.b.f166505a
            L82:
                r8.f166519y = r6
                r8.f166517w = r6
                r8.f166518x = r3
                java.lang.Object r9 = r0.emit(r2, r8)
                if (r9 != r1) goto L8f
            L8e:
                return r1
            L8f:
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: xx2.C38696c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C38696c(C13731b labsCampaignRepository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(labsCampaignRepository, "labsCampaignRepository");
        AbstractC22676k.m65750j(logger, "logger");
        this.labsCampaignRepository = labsCampaignRepository;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final Object m124105e(InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new C13084s1(new b(null));
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC13058l m124106d(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new a(null, this));
    }

    public /* synthetic */ C38696c(C13731b c13731b, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c13731b, (i13 & 2) != 0 ? AbstractC27308b.m82458a("CampaignListInteractor") : interfaceC34116n);
    }
}
