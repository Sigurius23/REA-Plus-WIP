package dz2;

import c93.InterfaceC4351m;
import com.whoop.whooplabs.data.domain.DwlLanding;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ex2.C13730a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: dz2.c */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ldz2/c;", "Lod1/g;", "Ldz2/a;", "Ldz2/b;", "Lex2/a;", "repository", "Ltr2/n;", "logger", "<init>", "(Lex2/a;Ltr2/n;)V", "Lec3/l;", "g", "()Lec3/l;", "Lcom/whoop/whooplabs/data/domain/DwlLanding;", "landing", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/whooplabs/data/domain/DwlLanding;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lex2/a;", "b", "Ltr2/n;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12472c implements InterfaceC27844g<InterfaceC12470a, InterfaceC12471b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C13730a repository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: dz2.c$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.landing.interactor.DwlLandingInteractor$interact$$inlined$flatMapLatest$1", m100430f = "DwlLandingInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f42557w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f42558x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f42559y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C12472c f42560z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C12472c c12472c) {
            super(3, interfaceC30057d);
            this.f42560z = c12472c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC12470a interfaceC12470a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f42560z);
            aVar.f42558x = interfaceC13062m;
            aVar.f42559y = interfaceC12470a;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42557w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f42558x;
                if (!AbstractC22676k.m65745e((InterfaceC12470a) this.f42559y, InterfaceC12470a.a.f42551a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC13058l interfaceC13058lM35111g = this.f42560z.m35111g();
                this.f42558x = null;
                this.f42559y = null;
                this.f42557w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM35111g, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC12470a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: dz2.c$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.landing.interactor.DwlLandingInteractor$loadDwlLanding$1", m100430f = "DwlLandingInteractor.kt", m100431l = {28, 31, 32, 35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldz2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f42562w;

        /* JADX INFO: renamed from: x */
        Object f42563x;

        /* JADX INFO: renamed from: y */
        int f42564y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f42565z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C12472c.this.new b(interfaceC30057d);
            bVar.f42565z = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0075  */
        /* JADX WARN: Code duplicated, block: B:25:0x0092  */
        /* JADX WARN: Code duplicated, block: B:27:0x009a  */
        /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r0, r10, r9) == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L29;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f42565z
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r9.f42564y
                r3 = 0
                r4 = 4
                r5 = 3
                r6 = 1
                r7 = 2
                r8 = 0
                if (r2 == 0) goto L3a
                if (r2 == r6) goto L36
                if (r2 == r7) goto L2e
                if (r2 == r5) goto L21
                if (r2 != r4) goto L19
                goto L21
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                java.lang.Object r0 = r9.f42563x
                ax2.b r0 = (ax2.InterfaceC2122b) r0
                java.lang.Object r0 = r9.f42562w
                bz2.a r0 = (bz2.C3716a) r0
                p505ts.AbstractC34132o.m107864I(r10)
                goto Lb8
            L2e:
                java.lang.Object r2 = r9.f42562w
                bz2.a r2 = (bz2.C3716a) r2
                p505ts.AbstractC34132o.m107864I(r10)
                goto L6f
            L36:
                p505ts.AbstractC34132o.m107864I(r10)
                goto L4a
            L3a:
                p505ts.AbstractC34132o.m107864I(r10)
                dz2.b$c r10 = dz2.InterfaceC12471b.c.f42554a
                r9.f42565z = r0
                r9.f42564y = r6
                java.lang.Object r10 = r0.emit(r10, r9)
                if (r10 != r1) goto L4a
                goto Lb7
            L4a:
                dz2.c r10 = dz2.C12472c.this
                tr2.n r10 = dz2.C12472c.m35107c(r10)
                java.lang.String r2 = "Loading Dwl landing"
                qr2.a$a[] r6 = new qr2.AbstractC30556a.a[r3]
                r10.mo85216g(r2, r6)
                bz2.a r10 = new bz2.a
                dz2.c r2 = dz2.C12472c.this
                ex2.a r2 = dz2.C12472c.m35108d(r2)
                r10.<init>(r2, r8, r7, r8)
                r9.f42565z = r0
                r9.f42562w = r8
                r9.f42564y = r7
                java.lang.Object r10 = r10.mo6691a(r9)
                if (r10 != r1) goto L6f
                goto Lb7
            L6f:
                ax2.b r10 = (ax2.InterfaceC2122b) r10
                boolean r2 = r10 instanceof ax2.InterfaceC2122b.b
                if (r2 == 0) goto L92
                dz2.c r2 = dz2.C12472c.this
                ax2.b$b r10 = (ax2.InterfaceC2122b.b) r10
                java.lang.Object r10 = r10.m6692a()
                com.whoop.whooplabs.data.domain.DwlLanding r10 = (com.whoop.whooplabs.data.domain.DwlLanding) r10
                ec3.l r10 = dz2.C12472c.m35110f(r2, r10)
                r9.f42565z = r8
                r9.f42562w = r8
                r9.f42563x = r8
                r9.f42564y = r5
                java.lang.Object r10 = ec3.AbstractC13091v.m36613w(r0, r10, r9)
                if (r10 != r1) goto Lb8
                goto Lb7
            L92:
                ax2.b$a r2 = ax2.InterfaceC2122b.a.f8494a
                boolean r10 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r10, r2)
                if (r10 == 0) goto Lbb
                dz2.c r10 = dz2.C12472c.this
                tr2.n r10 = dz2.C12472c.m35107c(r10)
                java.lang.String r2 = "Error loading Dwl landing"
                qr2.a$a[] r3 = new qr2.AbstractC30556a.a[r3]
                r10.mo85222m(r2, r3)
                dz2.b$a r10 = dz2.InterfaceC12471b.a.f42552a
                r9.f42565z = r8
                r9.f42562w = r8
                r9.f42563x = r8
                r9.f42564y = r4
                java.lang.Object r10 = r0.emit(r10, r9)
                if (r10 != r1) goto Lb8
            Lb7:
                return r1
            Lb8:
                l83.a0 r10 = l83.C23454a0.f92919a
                return r10
            Lbb:
                kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: dz2.C12472c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: dz2.c$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.landing.interactor.DwlLandingInteractor$saveCampaigns$1", m100430f = "DwlLandingInteractor.kt", m100431l = {42, 45, 49}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldz2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C12472c f42566E;

        /* JADX INFO: renamed from: w */
        Object f42567w;

        /* JADX INFO: renamed from: x */
        int f42568x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f42569y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ DwlLanding f42570z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DwlLanding dwlLanding, C12472c c12472c, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f42570z = dwlLanding;
            this.f42566E = c12472c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f42570z, this.f42566E, interfaceC30057d);
            cVar.f42569y = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
        
            if (r0.emit(r14, r13) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
        
            if (r0.emit(r14, r13) == r1) goto L24;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f42569y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r13.f42568x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2e
                if (r2 == r5) goto L26
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1d:
                java.lang.Object r0 = r13.f42567w
                bz2.b r0 = (bz2.C3717b) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto L9a
            L26:
                java.lang.Object r2 = r13.f42567w
                bz2.b r2 = (bz2.C3717b) r2
                p505ts.AbstractC34132o.m107864I(r14)
                goto L4e
            L2e:
                p505ts.AbstractC34132o.m107864I(r14)
                bz2.b r7 = new bz2.b
                com.whoop.whooplabs.data.domain.DwlLanding r8 = r13.f42570z
                dz2.c r14 = r13.f42566E
                ex2.a r9 = dz2.C12472c.m35108d(r14)
                r11 = 4
                r12 = 0
                r10 = 0
                r7.<init>(r8, r9, r10, r11, r12)
                r13.f42569y = r0
                r13.f42567w = r6
                r13.f42568x = r5
                java.lang.Object r14 = r7.mo6691a(r13)
                if (r14 != r1) goto L4e
                goto L99
            L4e:
                ax2.b r14 = (ax2.InterfaceC2122b) r14
                boolean r2 = r14 instanceof ax2.InterfaceC2122b.b
                r5 = 0
                if (r2 == 0) goto L76
                dz2.c r14 = r13.f42566E
                tr2.n r14 = dz2.C12472c.m35107c(r14)
                java.lang.String r2 = "Dwl landing loaded"
                qr2.a$a[] r3 = new qr2.AbstractC30556a.a[r5]
                r14.mo85216g(r2, r3)
                dz2.b$b r14 = new dz2.b$b
                com.whoop.whooplabs.data.domain.DwlLanding r2 = r13.f42570z
                r14.<init>(r2)
                r13.f42569y = r6
                r13.f42567w = r6
                r13.f42568x = r4
                java.lang.Object r14 = r0.emit(r14, r13)
                if (r14 != r1) goto L9a
                goto L99
            L76:
                ax2.b$a r2 = ax2.InterfaceC2122b.a.f8494a
                boolean r14 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r14, r2)
                if (r14 == 0) goto L9d
                dz2.c r14 = r13.f42566E
                tr2.n r14 = dz2.C12472c.m35107c(r14)
                java.lang.String r2 = "Error persisting Dwl landing campaigns"
                qr2.a$a[] r4 = new qr2.AbstractC30556a.a[r5]
                r14.mo85222m(r2, r4)
                dz2.b$a r14 = dz2.InterfaceC12471b.a.f42552a
                r13.f42569y = r6
                r13.f42567w = r6
                r13.f42568x = r3
                java.lang.Object r14 = r0.emit(r14, r13)
                if (r14 != r1) goto L9a
            L99:
                return r1
            L9a:
                l83.a0 r14 = l83.C23454a0.f92919a
                return r14
            L9d:
                kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
                r14.<init>()
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: dz2.C12472c.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C12472c(C13730a repository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(repository, "repository");
        AbstractC22676k.m65750j(logger, "logger");
        this.repository = repository;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m35111g() {
        return new C13084s1(new b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m35112h(DwlLanding landing) {
        return new C13084s1(new c(landing, this, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new a(null, this));
    }
}
