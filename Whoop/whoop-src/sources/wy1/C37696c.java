package wy1;

import com.whoop.data.repositories.FeatureFlagChecker;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import uy1.C35377a;
import uy1.C35385i;

/* JADX INFO: renamed from: wy1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lwy1/c;", "", "Luy1/a;", "jwtClaimProvider", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Luy1/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "", "a", "(Lq83/d;)Ljava/lang/Object;", "Luy1/a;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "c", "Ltr2/n;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37696c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C35377a jwtClaimProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: wy1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.setup.MfaRequirementChecker", m100430f = "MfaRequirementChecker.kt", m100431l = {20}, m100432m = "shouldSetupMFA", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f161538w;

        /* JADX INFO: renamed from: y */
        int f161540y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f161538w = obj;
            this.f161540y |= Integer.MIN_VALUE;
            return C37696c.this.m121138a(this);
        }
    }

    public C37696c(C35377a jwtClaimProvider, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(jwtClaimProvider, "jwtClaimProvider");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.jwtClaimProvider = jwtClaimProvider;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m121138a(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        boolean z4;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f161540y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f161540y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM112271a = aVar.f161538w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f161540y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM112271a);
                if (!this.featureFlagChecker.isFeatureEnabled("mobile-mfa-advanced-labs-integration")) {
                    return Boolean.FALSE;
                }
                C35377a c35377a = this.jwtClaimProvider;
                aVar.f161540y = 1;
                objM112271a = c35377a.m112271a(aVar);
                if (objM112271a == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM112271a);
            }
            z4 = !((C35385i) objM112271a).getMfaConfigured();
        } catch (IllegalStateException e5) {
            this.logger.mo85230v("Failed to get MFA state from JWT", e5, new AbstractC30556a.a[0]);
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    public /* synthetic */ C37696c(C35377a c35377a, FeatureFlagChecker featureFlagChecker, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c35377a, featureFlagChecker, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MfaRequirementChecker") : interfaceC34116n);
    }
}
