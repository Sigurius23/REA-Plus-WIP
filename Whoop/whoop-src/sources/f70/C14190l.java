package f70;

import com.whoop.data.remote.NewWhoopLoginInterceptor;
import com.whoop.domain.model.AuthMaterial;
import com.whoop.service.network.model.LoginResult;
import od1.C27847j;
import od1.C27853p;
import od1.InterfaceC27837a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pd1.C29104a;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: f70.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lf70/l;", "", "Lod1/p;", "sessionMgr", "Lcom/whoop/data/remote/NewWhoopLoginInterceptor;", "newWhoopLoginInterceptor", "Lod1/a0;", "userSessionManager", "Lpd1/a;", "bootstrapUserSignIn", "Lod1/j;", "pendingUserSession", "Ltr2/n;", "logger", "<init>", "(Lod1/p;Lcom/whoop/data/remote/NewWhoopLoginInterceptor;Lod1/a0;Lpd1/a;Lod1/j;Ltr2/n;)V", "Lcom/whoop/domain/model/AuthMaterial;", "authMaterial", "Lcom/whoop/service/network/model/LoginResult;", "a", "(Lcom/whoop/domain/model/AuthMaterial;Lq83/d;)Ljava/lang/Object;", "Lf70/k;", "b", "(Lq83/d;)Ljava/lang/Object;", "Lod1/p;", "Lcom/whoop/data/remote/NewWhoopLoginInterceptor;", "c", "Lod1/a0;", "d", "Lpd1/a;", "e", "Lod1/j;", "f", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14190l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27853p sessionMgr;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final NewWhoopLoginInterceptor newWhoopLoginInterceptor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC27837a0 userSessionManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C29104a bootstrapUserSignIn;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C27847j pendingUserSession;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.l$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.ActivationUserSessionCreator", m100430f = "ActivationUserSessionCreator.kt", m100431l = {33, 40}, m100432m = "createUserSession", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f51443E;

        /* JADX INFO: renamed from: w */
        Object f51444w;

        /* JADX INFO: renamed from: x */
        Object f51445x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f51446y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51446y = obj;
            this.f51443E |= Integer.MIN_VALUE;
            return C14190l.this.m40505b(this);
        }
    }

    public C14190l(C27853p sessionMgr, NewWhoopLoginInterceptor newWhoopLoginInterceptor, InterfaceC27837a0 userSessionManager, C29104a bootstrapUserSignIn, C27847j pendingUserSession, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(sessionMgr, "sessionMgr");
        AbstractC22676k.m65750j(newWhoopLoginInterceptor, "newWhoopLoginInterceptor");
        AbstractC22676k.m65750j(userSessionManager, "userSessionManager");
        AbstractC22676k.m65750j(bootstrapUserSignIn, "bootstrapUserSignIn");
        AbstractC22676k.m65750j(pendingUserSession, "pendingUserSession");
        AbstractC22676k.m65750j(logger, "logger");
        this.sessionMgr = sessionMgr;
        this.newWhoopLoginInterceptor = newWhoopLoginInterceptor;
        this.userSessionManager = userSessionManager;
        this.bootstrapUserSignIn = bootstrapUserSignIn;
        this.pendingUserSession = pendingUserSession;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    private final Object m40504a(AuthMaterial authMaterial, InterfaceC30057d<? super LoginResult> interfaceC30057d) {
        return this.bootstrapUserSignIn.m88435j(authMaterial, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (r1.interceptSuspend(r9, r3, r4, true, r6) == r0) goto L35;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m40505b(q83.InterfaceC30057d<? super f70.AbstractC14188k> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof f70.C14190l.a
            if (r0 == 0) goto L14
            r0 = r9
            f70.l$a r0 = (f70.C14190l.a) r0
            int r1 = r0.f51443E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f51443E = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            f70.l$a r0 = new f70.l$a
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.f51446y
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f51443E
            r7 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L4c
            if (r1 == r3) goto L41
            if (r1 != r2) goto L39
            java.lang.Object r0 = r6.f51445x
            com.whoop.service.network.model.LoginResult r0 = (com.whoop.service.network.model.LoginResult) r0
            java.lang.Object r0 = r6.f51444w
            com.whoop.domain.model.AuthMaterial r0 = (com.whoop.domain.model.AuthMaterial) r0
            p505ts.AbstractC34132o.m107864I(r9)     // Catch: java.lang.Exception -> L36
            goto L86
        L36:
            r0 = move-exception
            r9 = r0
            goto L89
        L39:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L41:
            java.lang.Object r1 = r6.f51444w
            com.whoop.domain.model.AuthMaterial r1 = (com.whoop.domain.model.AuthMaterial) r1
            p505ts.AbstractC34132o.m107864I(r9)     // Catch: java.lang.Exception -> L49
            goto L6a
        L49:
            r0 = move-exception
            r9 = r0
            goto L9e
        L4c:
            p505ts.AbstractC34132o.m107864I(r9)
            od1.j r9 = r8.pendingUserSession
            com.whoop.domain.model.AuthMaterial r9 = r9.getPendingAuthMaterial()
            if (r9 != 0) goto L5f
            f70.k$a r9 = new f70.k$a
            f70.j r0 = f70.EnumC14186j.IMPORTANT_APP_INFO_MISSING
            r9.<init>(r0)
            return r9
        L5f:
            r6.f51444w = r4     // Catch: java.lang.Exception -> L49
            r6.f51443E = r3     // Catch: java.lang.Exception -> L49
            java.lang.Object r9 = r8.m40504a(r9, r6)     // Catch: java.lang.Exception -> L49
            if (r9 != r0) goto L6a
            goto L85
        L6a:
            com.whoop.service.network.model.LoginResult r9 = (com.whoop.service.network.model.LoginResult) r9     // Catch: java.lang.Exception -> L49
            com.whoop.data.remote.NewWhoopLoginInterceptor r1 = r8.newWhoopLoginInterceptor     // Catch: java.lang.Exception -> L36
            com.whoop.domain.model.Session r9 = r9.getSession()     // Catch: java.lang.Exception -> L36
            od1.p r3 = r8.sessionMgr     // Catch: java.lang.Exception -> L36
            r5 = r4
            od1.a0 r4 = r8.userSessionManager     // Catch: java.lang.Exception -> L36
            r6.f51444w = r5     // Catch: java.lang.Exception -> L36
            r6.f51445x = r5     // Catch: java.lang.Exception -> L36
            r6.f51443E = r2     // Catch: java.lang.Exception -> L36
            r5 = 1
            r2 = r9
            java.lang.Object r9 = r1.interceptSuspend(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L36
            if (r9 != r0) goto L86
        L85:
            return r0
        L86:
            f70.k$b r9 = f70.AbstractC14188k.b.f51408a     // Catch: java.lang.Exception -> L36
            return r9
        L89:
            tr2.n r0 = r8.logger
            java.lang.String r1 = "Error fetching mission critical information: "
            java.lang.String r9 = p031b9.AbstractC2875y.m8297j(r9, r1)
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r7]
            r0.mo85228t(r9, r1)
            f70.k$a r9 = new f70.k$a
            f70.j r0 = f70.EnumC14186j.IMPORTANT_APP_INFO_MISSING
            r9.<init>(r0)
            return r9
        L9e:
            tr2.n r0 = r8.logger
            java.lang.String r1 = "Error creating login result: "
            java.lang.String r9 = p031b9.AbstractC2875y.m8297j(r9, r1)
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r7]
            r0.mo85228t(r9, r1)
            f70.k$a r9 = new f70.k$a
            f70.j r0 = f70.EnumC14186j.BOOTSTRAP_ERROR
            r9.<init>(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f70.C14190l.m40505b(q83.d):java.lang.Object");
    }

    public /* synthetic */ C14190l(C27853p c27853p, NewWhoopLoginInterceptor newWhoopLoginInterceptor, InterfaceC27837a0 interfaceC27837a0, C29104a c29104a, C27847j c27847j, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c27853p, newWhoopLoginInterceptor, interfaceC27837a0, c29104a, c27847j, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ActivationUserSessionCreator") : interfaceC34116n);
    }
}
