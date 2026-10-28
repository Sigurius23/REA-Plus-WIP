package zu1;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.service.network.HomeComponentDismissApi;
import com.whoop.service.network.model.DismissComponentRequestBody;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u92.C34659c;
import yb3.AbstractC39414r;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: zu1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lzu1/f;", "", "Lu92/c;", "ltoDismissStore", "Lcom/whoop/service/network/HomeComponentDismissApi;", "homeComponentDismissApi", "Lz92/a;", "userInfoAccessor", "Lbc3/c0;", "applicationScope", "Lbc3/z;", "ioDispatcher", "Ltr2/n;", "logger", "<init>", "(Lu92/c;Lcom/whoop/service/network/HomeComponentDismissApi;Lz92/a;Lbc3/c0;Lbc3/z;Ltr2/n;)V", "", "offerId", "Ll83/a0;", "e", "(Ljava/lang/String;)V", "a", "Lu92/c;", "b", "Lcom/whoop/service/network/HomeComponentDismissApi;", "c", "Lz92/a;", "d", "Lbc3/c0;", "Lbc3/z;", "f", "Ltr2/n;", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41153f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34659c ltoDismissStore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final HomeComponentDismissApi homeComponentDismissApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC2994c0 applicationScope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC3076z ioDispatcher;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: zu1.f$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.limitedtimeoffer.domain.LtoDismissHandler$dismiss$1", m100430f = "LtoDismissHandler.kt", m100431l = {37, 44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f177525w;

        /* JADX INFO: renamed from: x */
        int f177526x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f177528z;

        /* JADX INFO: renamed from: zu1.f$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.limitedtimeoffer.domain.LtoDismissHandler$dismiss$1$result$1", m100430f = "LtoDismissHandler.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42776a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f177529w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C41153f f177530x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f177531y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42776a(C41153f c41153f, String str, InterfaceC30057d<? super C42776a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f177530x = c41153f;
                this.f177531y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C42776a(this.f177530x, this.f177531y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f177529w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                HomeComponentDismissApi homeComponentDismissApi = this.f177530x.homeComponentDismissApi;
                DismissComponentRequestBody dismissComponentRequestBody = new DismissComponentRequestBody(this.f177531y);
                this.f177529w = 1;
                Object objDismissComponent = homeComponentDismissApi.dismissComponent(dismissComponentRequestBody, this);
                return objDismissComponent == enumC31071a ? enumC31071a : objDismissComponent;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((C42776a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f177528z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C41153f.this.new a(this.f177528z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
        
            if (r14 == r0) goto L19;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                r13 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r13.f177526x
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r13.f177525w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r14)
                r10 = r13
                goto L7b
            L16:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1e:
                p505ts.AbstractC34132o.m107864I(r14)
                r10 = r13
                goto L46
            L23:
                p505ts.AbstractC34132o.m107864I(r14)
                u02.a$a r5 = u02.InterfaceC34385a.INSTANCE
                zu1.f r14 = zu1.C41153f.this
                tr2.n r6 = zu1.C41153f.m133687b(r14)
                zu1.f$a$a r9 = new zu1.f$a$a
                zu1.f r14 = zu1.C41153f.this
                java.lang.String r1 = r13.f177528z
                r9.<init>(r14, r1, r4)
                r13.f177526x = r3
                r7 = 0
                java.lang.String r8 = "dismissHomeLtoTile"
                r11 = 2
                r12 = 0
                r10 = r13
                java.lang.Object r14 = u02.InterfaceC34385a.Companion.m108729b(r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L46
                goto L7a
            L46:
                u02.a r14 = (u02.InterfaceC34385a) r14
                boolean r1 = r14 instanceof u02.InterfaceC34385a.c
                if (r1 != 0) goto L9d
                boolean r1 = r14 instanceof u02.InterfaceC34385a.b
                if (r1 == 0) goto L97
                zu1.f r1 = zu1.C41153f.this
                tr2.n r1 = zu1.C41153f.m133687b(r1)
                java.lang.String r3 = r10.f177528z
                java.lang.String r5 = "Failed to dismiss LTO offer on server, offerId="
                java.lang.String r3 = p000.AbstractC11266d.m30461o(r5, r3)
                u02.a$b r14 = (u02.InterfaceC34385a.b) r14
                java.lang.Exception r14 = r14.getException()
                r5 = 0
                qr2.a$a[] r5 = new qr2.AbstractC30556a.a[r5]
                r1.mo85230v(r3, r14, r5)
                zu1.f r14 = zu1.C41153f.this
                z92.a r14 = zu1.C41153f.m133689d(r14)
                r10.f177525w = r4
                r10.f177526x = r2
                java.lang.Object r14 = r14.mo129089c(r13)
                if (r14 != r0) goto L7b
            L7a:
                return r0
            L7b:
                com.whoop.domain.model.User r14 = (com.whoop.domain.model.User) r14
                if (r14 == 0) goto L87
                int r14 = r14.getId()
                java.lang.String r4 = java.lang.String.valueOf(r14)
            L87:
                if (r4 != 0) goto L8b
                java.lang.String r4 = ""
            L8b:
                zu1.f r14 = zu1.C41153f.this
                u92.c r14 = zu1.C41153f.m133688c(r14)
                java.lang.String r0 = r10.f177528z
                r14.m109517c(r4, r0)
                goto L9d
            L97:
                kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
                r14.<init>()
                throw r14
            L9d:
                l83.a0 r14 = l83.C23454a0.f92919a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: zu1.C41153f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C41153f(C34659c ltoDismissStore, HomeComponentDismissApi homeComponentDismissApi, InterfaceC40205a userInfoAccessor, InterfaceC2994c0 applicationScope, AbstractC3076z ioDispatcher, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(ltoDismissStore, "ltoDismissStore");
        AbstractC22676k.m65750j(homeComponentDismissApi, "homeComponentDismissApi");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(applicationScope, "applicationScope");
        AbstractC22676k.m65750j(ioDispatcher, "ioDispatcher");
        AbstractC22676k.m65750j(logger, "logger");
        this.ltoDismissStore = ltoDismissStore;
        this.homeComponentDismissApi = homeComponentDismissApi;
        this.userInfoAccessor = userInfoAccessor;
        this.applicationScope = applicationScope;
        this.ioDispatcher = ioDispatcher;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: e */
    public final void m133690e(String offerId) {
        AbstractC22676k.m65750j(offerId, "offerId");
        if (AbstractC39414r.m125890i0(offerId)) {
            return;
        }
        AbstractC3006f0.m8732z(this.applicationScope, this.ioDispatcher, null, new a(offerId, null), 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C41153f(C34659c c34659c, HomeComponentDismissApi homeComponentDismissApi, InterfaceC40205a interfaceC40205a, InterfaceC2994c0 interfaceC2994c0, AbstractC3076z abstractC3076z, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 16) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            abstractC3076z = ExecutorC22364d.f87316w;
        }
        this(c34659c, homeComponentDismissApi, interfaceC40205a, interfaceC2994c0, abstractC3076z, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("LtoDismissHandler") : interfaceC34116n);
    }
}
