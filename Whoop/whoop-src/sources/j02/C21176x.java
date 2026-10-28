package j02;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.iterable.iterableapi.C5378v;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.domain.model.WhoopUri;
import com.whoop.navigation.LoginScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import j92.AbstractC21453u;
import j92.C21452t;
import java.util.ArrayList;
import java.util.Locale;
import l83.C23454a0;
import m83.AbstractC25265s;
import n83.C26460c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.C30064k;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ud3.C34810e0;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: j02.x */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lj02/x;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lz92/a;", "userInfoAccessor", "Lj92/t;", "topPrivateDomainHelper", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lz92/a;Lj92/t;)V", "Lcom/whoop/domain/model/WhoopUri;", "whoopUri", "Lcom/whoop/navigation/NavigationScreenModel;", "b", "(Lcom/whoop/domain/model/WhoopUri;)Lcom/whoop/navigation/NavigationScreenModel;", "a", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lz92/a;", "c", "Lj92/t;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21176x {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21452t topPrivateDomainHelper;

    /* JADX INFO: renamed from: j02.x$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.navigation.DynamicDeeplinkDetector$detect$signedIn$1", m100430f = "DynamicDeeplinkDetector.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f80714w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21176x.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f80714w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l user = C21176x.this.userInfoAccessor.getUser();
                this.f80714w = 1;
                obj = AbstractC13091v.m36575A(user, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return Boolean.valueOf(obj != null);
        }
    }

    public C21176x(FeatureFlagChecker featureFlagChecker, InterfaceC40205a userInfoAccessor, C21452t topPrivateDomainHelper) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(topPrivateDomainHelper, "topPrivateDomainHelper");
        this.featureFlagChecker = featureFlagChecker;
        this.userInfoAccessor = userInfoAccessor;
        this.topPrivateDomainHelper = topPrivateDomainHelper;
    }

    /* JADX INFO: renamed from: b */
    public final NavigationScreenModel m59419b(WhoopUri whoopUri) {
        C34810e0 c34810e0M16526b;
        AbstractC22676k.m65750j(whoopUri, "whoopUri");
        String string = whoopUri.toString();
        AbstractC22676k.m65750j(string, "<this>");
        try {
            C5378v c5378v = new C5378v(1);
            c5378v.m16528d(null, string);
            c34810e0M16526b = c5378v.m16526b();
        } catch (IllegalArgumentException unused) {
            c34810e0M16526b = null;
        }
        if (c34810e0M16526b != null) {
            ArrayList arrayList = c34810e0M16526b.f146567f;
            if (AbstractC21453u.m60389b(this.topPrivateDomainHelper, c34810e0M16526b) && (!this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.PASSWORD_RESET_FLOW) || arrayList.size() != 1 || !AbstractC39421y.m125921F((String) AbstractC25265s.m74096F0(arrayList), "reset-password-v2", true))) {
                if (!((Boolean) AbstractC3006f0.m8699E(C30064k.f122676w, new a(null))).booleanValue()) {
                    return new LoginScreenModel(false);
                }
                ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(arrayList);
                C26460c c26460cM119000x = AbstractC37056f.m119000x();
                String str = (String) AbstractC25265s.m74133k1(arrayListM74097F1);
                if (str != null) {
                    Locale locale = Locale.US;
                    c26460cM119000x.add(AbstractC31061c.m95641q(locale, "US", str, locale, "toLowerCase(...)"));
                }
                String str2 = (String) AbstractC25265s.m74133k1(arrayListM74097F1);
                if (str2 != null) {
                    Locale locale2 = Locale.US;
                    c26460cM119000x.add(AbstractC31061c.m95641q(locale2, "US", str2, locale2, "toLowerCase(...)"));
                }
                String str3 = (String) AbstractC25265s.m74133k1(arrayListM74097F1);
                if (str3 != null) {
                    Locale locale3 = Locale.US;
                    c26460cM119000x.add(AbstractC31061c.m95641q(locale3, "US", str3, locale3, "toLowerCase(...)"));
                }
                C26460c c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
                String str4 = (String) AbstractC25265s.m74133k1(arrayListM74097F1);
                if (str4 != null && str4.length() != 0 && arrayListM74097F1.isEmpty()) {
                    String strM109875d = c34810e0M16526b.m109875d();
                    if (strM109875d == null) {
                        strM109875d = "";
                    }
                    if (AbstractC22676k.m65745e(c26460cM118988k, AbstractC21178y.f80716a)) {
                        return AbstractC21129a0.m58962c(str4, strM109875d, this.featureFlagChecker.isFeatureEnabled("android-dynamic-deeplink-analytics"));
                    }
                }
            }
        }
        return null;
    }

    public /* synthetic */ C21176x(FeatureFlagChecker featureFlagChecker, InterfaceC40205a interfaceC40205a, C21452t c21452t, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureFlagChecker, interfaceC40205a, (i13 & 4) != 0 ? new C21452t() : c21452t);
    }
}
