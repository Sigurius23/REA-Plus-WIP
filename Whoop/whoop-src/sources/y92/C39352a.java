package y92;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.domain.model.AuthMaterial;
import com.whoop.domain.model.User;
import com.whoop.service.network.model.UserState;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import v92.InterfaceC35831a;
import z92.InterfaceC40208d;

/* JADX INFO: renamed from: y92.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0004\b\u0017\u0010\u000eJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0086@¢\u0006\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Ly92/a;", "", "Lz92/d;", "userInfoUpdater", "Lv92/a;", "authMaterialHandler", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Lz92/d;Lv92/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "Ll83/a0;", "d", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/domain/model/AuthMaterial;", "material", "c", "(Lcom/whoop/domain/model/AuthMaterial;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/domain/model/User;", UserState.Sources.USER, "e", "(Lcom/whoop/domain/model/User;Lq83/d;)Ljava/lang/Object;", "a", "b", "Lz92/d;", "Lv92/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ltr2/n;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39352a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC40208d userInfoUpdater;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC35831a authMaterialHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: y92.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.user.AuthManager", m100430f = "AuthManager.kt", m100431l = {30, 31}, m100432m = "signOut", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f169381w;

        /* JADX INFO: renamed from: y */
        int f169383y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f169381w = obj;
            this.f169383y |= Integer.MIN_VALUE;
            return C39352a.this.m125481d(this);
        }
    }

    public C39352a(InterfaceC40208d userInfoUpdater, InterfaceC35831a authMaterialHandler, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(userInfoUpdater, "userInfoUpdater");
        AbstractC22676k.m65750j(authMaterialHandler, "authMaterialHandler");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.userInfoUpdater = userInfoUpdater;
        this.authMaterialHandler = authMaterialHandler;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    public final Object m125478a(InterfaceC30057d<? super AuthMaterial> interfaceC30057d) {
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.NEW_AUTH_USER_STORAGE)) {
            return this.authMaterialHandler.mo113721b(interfaceC30057d);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Object m125479b(InterfaceC30057d<? super User> interfaceC30057d) {
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.NEW_AUTH_USER_STORAGE)) {
            return this.userInfoUpdater.mo129089c(interfaceC30057d);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final Object m125480c(AuthMaterial authMaterial, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.NEW_AUTH_USER_STORAGE);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (zIsFeatureEnabled) {
            this.logger.mo85228t("Storing auth material", new AbstractC30556a.a[0]);
            Object objMo113722c = this.authMaterialHandler.mo113722c(authMaterial, interfaceC30057d);
            if (objMo113722c == EnumC31071a.f128113w) {
                return objMo113722c;
            }
        }
        return c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r7.mo113720a(r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m125481d(q83.InterfaceC30057d<? super l83.C23454a0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof y92.C39352a.a
            if (r0 == 0) goto L13
            r0 = r7
            y92.a$a r0 = (y92.C39352a.a) r0
            int r1 = r0.f169383y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f169383y = r1
            goto L18
        L13:
            y92.a$a r0 = new y92.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f169381w
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f169383y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p505ts.AbstractC34132o.m107864I(r7)
            goto L59
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            p505ts.AbstractC34132o.m107864I(r7)
            goto L4e
        L36:
            p505ts.AbstractC34132o.m107864I(r7)
            tr2.n r7 = r6.logger
            r2 = 0
            qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r2]
            java.lang.String r5 = "Signing out user"
            r7.mo85228t(r5, r2)
            z92.d r7 = r6.userInfoUpdater
            r0.f169383y = r4
            java.lang.Object r7 = r7.mo129094a(r0)
            if (r7 != r1) goto L4e
            goto L58
        L4e:
            v92.a r7 = r6.authMaterialHandler
            r0.f169383y = r3
            java.lang.Object r7 = r7.mo113720a(r0)
            if (r7 != r1) goto L59
        L58:
            return r1
        L59:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y92.C39352a.m125481d(q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: e */
    public final Object m125482e(User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.NEW_AUTH_USER_STORAGE);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (zIsFeatureEnabled) {
            this.logger.mo85228t("Updating user", new AbstractC30556a.a[0]);
            Object objMo129095b = this.userInfoUpdater.mo129095b(user, interfaceC30057d);
            if (objMo129095b == EnumC31071a.f128113w) {
                return objMo129095b;
            }
        }
        return c23454a0;
    }

    public /* synthetic */ C39352a(InterfaceC40208d interfaceC40208d, InterfaceC35831a interfaceC35831a, FeatureFlagChecker featureFlagChecker, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC40208d, interfaceC35831a, featureFlagChecker, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AuthManager") : interfaceC34116n);
    }
}
