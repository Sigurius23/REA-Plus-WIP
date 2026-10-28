package y92;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.domain.model.AuthMaterial;
import com.whoop.domain.model.Session;
import com.whoop.domain.model.User;
import com.whoop.service.network.model.UserState;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: y92.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Ly92/b;", "", "Ly92/a;", "authManager", "Lbc3/c0;", "scope", "Lq83/j;", "coroutineContext", "Ltr2/n;", "logger", "<init>", "(Ly92/a;Lbc3/c0;Lq83/j;Ltr2/n;)V", "Lcom/whoop/domain/model/AuthMaterial;", "authMaterial", "Ll83/a0;", "c", "(Lcom/whoop/domain/model/AuthMaterial;)V", "Lcom/whoop/domain/model/User;", UserState.Sources.USER, "e", "(Lcom/whoop/domain/model/User;)V", "Lcom/whoop/domain/model/Session;", "session", "d", "(Lcom/whoop/domain/model/Session;)V", "a", "Ly92/a;", "b", "Lbc3/c0;", "Lq83/j;", "Ltr2/n;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39353b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39352a authManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC30063j coroutineContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: y92.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.user.AuthManagerBridge$submitAuthMaterialOffOfMainThread$1", m100430f = "AuthManagerBridge.kt", m100431l = {54, 58}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f169388w;

        /* JADX INFO: renamed from: x */
        int f169389x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AuthMaterial f169391z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AuthMaterial authMaterial, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169391z = authMaterial;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39353b.this.new a(this.f169391z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (r5.m125480c(r1, r4) == r0) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f169389x
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r4.f169388w
                com.whoop.domain.model.AuthMaterial r0 = (com.whoop.domain.model.AuthMaterial) r0
                p505ts.AbstractC34132o.m107864I(r5)
                goto L65
            L14:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L32
            L20:
                p505ts.AbstractC34132o.m107864I(r5)
                y92.b r5 = y92.C39353b.this
                y92.a r5 = y92.C39353b.m125483a(r5)
                r4.f169389x = r3
                java.lang.Object r5 = r5.m125478a(r4)
                if (r5 != r0) goto L32
                goto L57
            L32:
                com.whoop.domain.model.AuthMaterial r5 = (com.whoop.domain.model.AuthMaterial) r5
                r1 = 0
                if (r5 != 0) goto L58
                y92.b r5 = y92.C39353b.this
                tr2.n r5 = y92.C39353b.m125484b(r5)
                java.lang.String r3 = "Existing auth material was null, submitting new ones"
                qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r1]
                r5.mo85228t(r3, r1)
                y92.b r5 = y92.C39353b.this
                y92.a r5 = y92.C39353b.m125483a(r5)
                com.whoop.domain.model.AuthMaterial r1 = r4.f169391z
                r3 = 0
                r4.f169388w = r3
                r4.f169389x = r2
                java.lang.Object r5 = r5.m125480c(r1, r4)
                if (r5 != r0) goto L65
            L57:
                return r0
            L58:
                y92.b r5 = y92.C39353b.this
                tr2.n r5 = y92.C39353b.m125484b(r5)
                java.lang.String r0 = "There was auth material, no need to submit again"
                qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r1]
                r5.mo85228t(r0, r1)
            L65:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: y92.C39353b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: y92.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.user.AuthManagerBridge$submitUserInfoOffOfMainThread$1", m100430f = "AuthManagerBridge.kt", m100431l = {67, 71}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f169392w;

        /* JADX INFO: renamed from: x */
        int f169393x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ User f169395z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(User user, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169395z = user;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39353b.this.new b(this.f169395z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (r5.m125482e(r1, r4) == r0) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f169393x
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r4.f169392w
                com.whoop.domain.model.User r0 = (com.whoop.domain.model.User) r0
                p505ts.AbstractC34132o.m107864I(r5)
                goto L65
            L14:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L32
            L20:
                p505ts.AbstractC34132o.m107864I(r5)
                y92.b r5 = y92.C39353b.this
                y92.a r5 = y92.C39353b.m125483a(r5)
                r4.f169393x = r3
                java.lang.Object r5 = r5.m125479b(r4)
                if (r5 != r0) goto L32
                goto L57
            L32:
                com.whoop.domain.model.User r5 = (com.whoop.domain.model.User) r5
                r1 = 0
                if (r5 != 0) goto L58
                y92.b r5 = y92.C39353b.this
                tr2.n r5 = y92.C39353b.m125484b(r5)
                java.lang.String r3 = "Existing user was null, submitting new one"
                qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r1]
                r5.mo85228t(r3, r1)
                y92.b r5 = y92.C39353b.this
                y92.a r5 = y92.C39353b.m125483a(r5)
                com.whoop.domain.model.User r1 = r4.f169395z
                r3 = 0
                r4.f169392w = r3
                r4.f169393x = r2
                java.lang.Object r5 = r5.m125482e(r1, r4)
                if (r5 != r0) goto L65
            L57:
                return r0
            L58:
                y92.b r5 = y92.C39353b.this
                tr2.n r5 = y92.C39353b.m125484b(r5)
                java.lang.String r0 = "There was a user, no need to submit again"
                qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r1]
                r5.mo85228t(r0, r1)
            L65:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: y92.C39353b.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C39353b(C39352a authManager, InterfaceC2994c0 scope, InterfaceC30063j coroutineContext, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(authManager, "authManager");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(coroutineContext, "coroutineContext");
        AbstractC22676k.m65750j(logger, "logger");
        this.authManager = authManager;
        this.scope = scope;
        this.coroutineContext = coroutineContext;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: c */
    private final void m125485c(AuthMaterial authMaterial) {
        AbstractC3006f0.m8732z(this.scope, this.coroutineContext, null, new a(authMaterial, null), 2);
    }

    /* JADX INFO: renamed from: e */
    private final void m125486e(User user) {
        AbstractC3006f0.m8732z(this.scope, this.coroutineContext, null, new b(user, null), 2);
    }

    /* JADX INFO: renamed from: d */
    public final void m125487d(Session session) {
        AbstractC22676k.m65750j(session, "session");
        this.logger.mo85228t("Submitting Session information", new AbstractC30556a.a[0]);
        m125485c(session.getAuthToken().toAuthMaterial());
        m125486e(session.getUser());
    }

    public /* synthetic */ C39353b(C39352a c39352a, InterfaceC2994c0 interfaceC2994c0, InterfaceC30063j interfaceC30063j, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c39352a, interfaceC2994c0, (i13 & 4) != 0 ? C30064k.f122676w : interfaceC30063j, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AuthManagerBridge") : interfaceC34116n);
    }
}
