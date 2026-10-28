package m42;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.entitlements.Entitlement;
import d13.AbstractC11478a;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import k42.C22191a;
import k42.C22192b;
import k42.C22193c;
import k42.C22194d;
import k42.C22196f;
import l83.C23454a0;
import m83.AbstractC25267u;
import n42.C26277a;
import n42.C26278b;
import n42.C26280d;
import n42.C26281e;
import n42.C26283g;
import n42.C26284h;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import we1.InterfaceC37217a;

/* JADX INFO: renamed from: m42.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b%\u0010&J!\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u001e¢\u0006\u0004\b*\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010-R\u0014\u00100\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010/¨\u00061"}, m65681d2 = {"Lm42/a;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lwe1/a;", "entitlementChecker", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lwe1/a;)V", "Lec3/l;", "Lk42/f;", "domainStateFlow", "Ln42/h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lec3/l;)Lec3/l;", "domainState", "i", "(Lk42/f;)Ln42/h;", "Ln42/g;", "g", "(Lk42/f;)Ln42/g;", "Lk42/d;", "dataSharingDomain", "Ln42/e;", "f", "(Lk42/d;)Ln42/e;", "Lk42/b;", "account", "Ln42/b;", "b", "(Lk42/b;)Ln42/b;", "", "accountListDomain", "d", "(Ljava/util/List;)Ljava/util/List;", "Lk42/a;", "accountDataSharing", "Ln42/a;", "c", "(Lk42/a;)Ln42/a;", "Lk42/c;", "dataSharingBoxes", "Ln42/d;", "e", "a", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lwe1/a;", "", "()Z", "isCommunityFollowersEnabled", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25054a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC37217a entitlementChecker;

    /* JADX INFO: renamed from: m42.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f98168w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25054a f98169x;

        /* JADX INFO: renamed from: m42.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41983a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f98170w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25054a f98171x;

            /* JADX INFO: renamed from: m42.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.reducer.PrivacyConsentViewStateReducer$reduce$$inlined$map$1$2", m100430f = "PrivacyConsentViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41984a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f98172E;

                /* JADX INFO: renamed from: F */
                Object f98173F;

                /* JADX INFO: renamed from: G */
                Object f98174G;

                /* JADX INFO: renamed from: H */
                int f98175H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f98176w;

                /* JADX INFO: renamed from: x */
                int f98177x;

                /* JADX INFO: renamed from: y */
                Object f98178y;

                public C41984a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f98176w = obj;
                    this.f98177x |= Integer.MIN_VALUE;
                    return C41983a.this.emit(null, this);
                }
            }

            public C41983a(InterfaceC13062m interfaceC13062m, C25054a c25054a) {
                this.f98170w = interfaceC13062m;
                this.f98171x = c25054a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41984a c41984a;
                if (interfaceC30057d instanceof C41984a) {
                    c41984a = (C41984a) interfaceC30057d;
                    int i13 = c41984a.f98177x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41984a.f98177x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41984a = new C41984a(interfaceC30057d);
                    }
                } else {
                    c41984a = new C41984a(interfaceC30057d);
                }
                Object obj2 = c41984a.f98176w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41984a.f98177x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f98170w;
                    C26284h c26284hM73533i = this.f98171x.m73533i((C22196f) obj);
                    c41984a.f98178y = null;
                    c41984a.f98172E = null;
                    c41984a.f98173F = null;
                    c41984a.f98174G = null;
                    c41984a.f98175H = 0;
                    c41984a.f98177x = 1;
                    if (interfaceC13062m.emit(c26284hM73533i, c41984a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l, C25054a c25054a) {
            this.f98168w = interfaceC13058l;
            this.f98169x = c25054a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f98168w.collect(new C41983a(interfaceC13062m, this.f98169x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C25054a(FeatureFlagChecker featureFlagChecker, InterfaceC37217a entitlementChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(entitlementChecker, "entitlementChecker");
        this.featureFlagChecker = featureFlagChecker;
        this.entitlementChecker = entitlementChecker;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m73525a() {
        return this.featureFlagChecker.isFeatureEnabled("community-followers-android") && this.entitlementChecker.mo119272b(Entitlement.FOLLOWERS);
    }

    /* JADX INFO: renamed from: b */
    public final C26278b m73526b(C22192b account) {
        EnumC16313m0 enumC16313m0 = null;
        if (account == null) {
            return null;
        }
        String accountName = account.getAccountName();
        Locale locale = Locale.ROOT;
        TextResource textResourceM30853e = AbstractC11478a.m30853e(locale, accountName, "toUpperCase(...)");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(account.getDataSharingStatus());
        String upperCase = account.getButtonText().toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(upperCase);
        String upperCase2 = account.getIconName().toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
        EnumC16313m0 enumC16313m1 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
        for (EnumC16313m0 enumC16313m2 : EnumC16313m0.values()) {
            if (AbstractC22676k.m65745e(enumC16313m2.name(), upperCase2)) {
                enumC16313m0 = enumC16313m2;
                break;
            }
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        return new C26278b(textResourceM30853e, textResourceM21278l, textResourceM21278l2, enumC16313m1.toWhoopIcon(), m73527c(account.getAccountDataSharing()));
    }

    /* JADX INFO: renamed from: c */
    public final C26277a m73527c(C22191a accountDataSharing) {
        AbstractC22676k.m65750j(accountDataSharing, "accountDataSharing");
        return new C26277a(AbstractC11478a.m30853e(Locale.ROOT, accountDataSharing.getTitle(), "toUpperCase(...)"), AbstractC8693b.m21278l(accountDataSharing.getSubtitle()), m73529e(accountDataSharing.m63547a()), AbstractC8693b.m21278l(accountDataSharing.getDisclaimer()));
    }

    /* JADX INFO: renamed from: d */
    public final List<C26278b> m73528d(List<C22192b> accountListDomain) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(accountListDomain, "accountListDomain");
        List<C22192b> list = accountListDomain;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C22192b c22192b : list) {
            String accountName = c22192b.getAccountName();
            Locale locale = Locale.ROOT;
            TextResource textResourceM30853e = AbstractC11478a.m30853e(locale, accountName, "toUpperCase(...)");
            TextResource textResourceM21278l = AbstractC8693b.m21278l(c22192b.getDataSharingStatus());
            String upperCase = c22192b.getButtonText().toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(upperCase);
            String upperCase2 = c22192b.getIconName().toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
            EnumC16313m0 enumC16313m1 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m0 = null;
                    break;
                }
                enumC16313m0 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m0.name(), upperCase2)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m0 != null) {
                enumC16313m1 = enumC16313m0;
            }
            arrayList.add(new C26278b(textResourceM30853e, textResourceM21278l, textResourceM21278l2, enumC16313m1.toWhoopIcon(), m73527c(c22192b.getAccountDataSharing())));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final List<C26280d> m73529e(List<C22193c> dataSharingBoxes) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(dataSharingBoxes, "dataSharingBoxes");
        List<C22193c> list = dataSharingBoxes;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C22193c c22193c : list) {
            String title = c22193c.getTitle();
            Locale locale = Locale.ROOT;
            TextResource textResourceM30853e = AbstractC11478a.m30853e(locale, title, "toUpperCase(...)");
            TextResource textResourceM21278l = AbstractC8693b.m21278l(c22193c.getSubtitle());
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(c22193c.getViewableBy());
            String upperCase = c22193c.getIconName().toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            EnumC16313m0 enumC16313m1 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m0 = null;
                    break;
                }
                enumC16313m0 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m0.name(), upperCase)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m0 != null) {
                enumC16313m1 = enumC16313m0;
            }
            arrayList.add(new C26280d(textResourceM30853e, textResourceM21278l, textResourceM21278l2, enumC16313m1.toWhoopIcon()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final C26281e m73530f(C22194d dataSharingDomain) {
        if (dataSharingDomain == null) {
            return null;
        }
        return new C26281e(AbstractC11478a.m30853e(Locale.ROOT, dataSharingDomain.getTitle(), "toUpperCase(...)"), AbstractC8693b.m21278l(dataSharingDomain.getSubtitle()), m73528d(dataSharingDomain.m63560a()), AbstractC8693b.m21278l(dataSharingDomain.getFooterText()), dataSharingDomain.getDisplay());
    }

    /* JADX INFO: renamed from: g */
    public final C26283g m73531g(C22196f domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        return new C26283g(m73525a(), domainState.getSearchable(), domainState.getIsMutualCommunitySharingEnabled(), domainState.getIsCommunityToggleSuccess(), domainState.getIsCommunityToggleError(), domainState.getIsRecommendationEnabled(), domainState.getIsRecommendationToggleSuccess(), domainState.getIsRecommendationToggleError(), m73530f(domainState.getDataSharingDomainState()), m73526b(domainState.getShowDataSharingSheet()));
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m73532h(InterfaceC13058l domainStateFlow) {
        AbstractC22676k.m65750j(domainStateFlow, "domainStateFlow");
        return new a(domainStateFlow, this);
    }

    /* JADX INFO: renamed from: i */
    public final C26284h m73533i(C22196f domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        return new C26284h(domainState.getIsGeneralError(), domainState.getIsLoading(), m73531g(domainState));
    }
}
