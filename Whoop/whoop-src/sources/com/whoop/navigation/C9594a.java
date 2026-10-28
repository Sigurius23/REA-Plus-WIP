package com.whoop.navigation;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.domain.model.WhoopUri;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import j02.AbstractC21154m;
import j02.AbstractC21155m0;
import j02.C21131b;
import j02.C21139e0;
import j02.C21141f0;
import j02.C21143g0;
import j02.C21163q0;
import j02.C21173v0;
import j02.C21176x;
import j02.InterfaceC21152l;
import java.util.List;
import jy1.C22047a;
import l02.C23050a;
import m83.AbstractC25265s;
import o02.InterfaceC27353d;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: com.whoop.navigation.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\"\u0010*\u001a\u0004\u0018\u00010\u001a2\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b*\u0010+J\u0018\u0010-\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00104R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00105R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00106R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, m65681d2 = {"Lcom/whoop/navigation/a;", "", "Ll02/a;", "navigationQueryParamDeserializer", "Lcom/whoop/navigation/f;", "navigationQueryParamParser", "Lo02/d;", "navigationReducer", "Lj02/x;", "dynamicDeeplinkDetector", "Lcom/whoop/navigation/b;", "migrationGate", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Liy1/c;", "metricWriter", "Lj02/g0;", "legacyIntegrationsDeepLinkNormalizer", "<init>", "(Ll02/a;Lcom/whoop/navigation/f;Lo02/d;Lj02/x;Lcom/whoop/navigation/b;Lcom/whoop/data/repositories/FeatureFlagChecker;Liy1/c;Lj02/g0;)V", "Lcom/whoop/navigation/AppScreen;", "appScreen", "", "firstSegment", "Lcom/whoop/domain/model/WhoopUri;", "whoopUri", "Lj02/l;", "d", "(Lcom/whoop/navigation/AppScreen;Ljava/lang/String;Lcom/whoop/domain/model/WhoopUri;)Lj02/l;", "segment", "via", "Ll83/a0;", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "e", "(Lcom/whoop/domain/model/WhoopUri;)Lj02/l;", "Lcom/whoop/navigation/NavigationScreenModel;", "dynamicDeeplink", "c", "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/l;", "name", "query", "g", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "uri", "b", "(Lcom/whoop/domain/model/WhoopUri;Lq83/d;)Ljava/lang/Object;", "a", "Ll02/a;", "Lcom/whoop/navigation/f;", "Lo02/d;", "Lj02/x;", "Lcom/whoop/navigation/b;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Liy1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lj02/g0;", "Ltr2/n;", "i", "Ltr2/n;", "logger", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9594a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23050a navigationQueryParamDeserializer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C9600f navigationQueryParamParser;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC27353d navigationReducer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C21176x dynamicDeeplinkDetector;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C9595b migrationGate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C21143g0 legacyIntegrationsDeepLinkNormalizer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.navigation.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.navigation.DeepLinkNavigationParser", m100430f = "DeepLinkNavigationParser.kt", m100431l = {49}, m100432m = "parseAppScreenDeepLink", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f28109E;

        /* JADX INFO: renamed from: F */
        Object f28110F;

        /* JADX INFO: renamed from: G */
        Object f28111G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f28112H;

        /* JADX INFO: renamed from: J */
        int f28114J;

        /* JADX INFO: renamed from: w */
        Object f28115w;

        /* JADX INFO: renamed from: x */
        Object f28116x;

        /* JADX INFO: renamed from: y */
        Object f28117y;

        /* JADX INFO: renamed from: z */
        Object f28118z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f28112H = obj;
            this.f28114J |= Integer.MIN_VALUE;
            return C9594a.this.m23105b(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.navigation.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.navigation.DeepLinkNavigationParser", m100430f = "DeepLinkNavigationParser.kt", m100431l = {110}, m100432m = "resolveRemotely", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f28119E;

        /* JADX INFO: renamed from: w */
        Object f28120w;

        /* JADX INFO: renamed from: x */
        Object f28121x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f28122y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f28122y = obj;
            this.f28119E |= Integer.MIN_VALUE;
            return C9594a.this.m23104g(null, null, this);
        }
    }

    public C9594a(C23050a navigationQueryParamDeserializer, C9600f navigationQueryParamParser, InterfaceC27353d navigationReducer, C21176x dynamicDeeplinkDetector, C9595b migrationGate, FeatureFlagChecker featureFlagChecker, InterfaceC21030c metricWriter, C21143g0 legacyIntegrationsDeepLinkNormalizer) {
        AbstractC22676k.m65750j(navigationQueryParamDeserializer, "navigationQueryParamDeserializer");
        AbstractC22676k.m65750j(navigationQueryParamParser, "navigationQueryParamParser");
        AbstractC22676k.m65750j(navigationReducer, "navigationReducer");
        AbstractC22676k.m65750j(dynamicDeeplinkDetector, "dynamicDeeplinkDetector");
        AbstractC22676k.m65750j(migrationGate, "migrationGate");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(legacyIntegrationsDeepLinkNormalizer, "legacyIntegrationsDeepLinkNormalizer");
        this.navigationQueryParamDeserializer = navigationQueryParamDeserializer;
        this.navigationQueryParamParser = navigationQueryParamParser;
        this.navigationReducer = navigationReducer;
        this.dynamicDeeplinkDetector = dynamicDeeplinkDetector;
        this.migrationGate = migrationGate;
        this.featureFlagChecker = featureFlagChecker;
        this.metricWriter = metricWriter;
        this.legacyIntegrationsDeepLinkNormalizer = legacyIntegrationsDeepLinkNormalizer;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("DeepLinkNavigationParser");
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC21152l m23100c(NavigationScreenModel dynamicDeeplink) {
        return new C21131b(new C9598e(null, dynamicDeeplink, null, 5, null));
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC21152l m23101d(AppScreen appScreen, String firstSegment, WhoopUri whoopUri) {
        if (appScreen instanceof FeatureSpecificAppScreen) {
            return new C21163q0(firstSegment);
        }
        try {
            C9598e c9598e = new C9598e(appScreen, this.navigationQueryParamParser.m23135a(appScreen, whoopUri.getQuery()), null, 4, null);
            return this.navigationReducer.mo67681a(c9598e.getParameters()) instanceof AbstractC21155m0 ? new C21131b(c9598e) : new C21163q0(firstSegment);
        } catch (IllegalArgumentException e5) {
            this.logger.mo85230v("Failed to parse deep link for screen=" + firstSegment + " uri=" + whoopUri, e5, new AbstractC30556a.a[0]);
            return C21139e0.f80216a;
        }
    }

    /* JADX INFO: renamed from: e */
    private final InterfaceC21152l m23102e(WhoopUri whoopUri) {
        String str = whoopUri.getPathSegments().get(0);
        if (!AbstractC22676k.m65745e(str, "mobile-redir")) {
            return this.featureFlagChecker.isFeatureEnabled("android-settings-item-deeplinks") ? new C21163q0(whoopUri.toString()) : new C21163q0(str);
        }
        String queryParameter = whoopUri.getQueryParameter("code");
        if (queryParameter == null) {
            queryParameter = "";
        }
        return new C21141f0(queryParameter);
    }

    /* JADX INFO: renamed from: f */
    private final void m23103f(String segment, String via) {
        this.metricWriter.mo58701b(new C22047a(0, "deeplink_migration.routed", null, AbstractC37056f.m118959K(AbstractC11266d.m30461o("name:", AbstractC21154m.m59008a(segment)), AbstractC11266d.m30461o("via:", via)), null, 21, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m23104g(String str, String str2, InterfaceC30057d<? super InterfaceC21152l> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f28119E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f28119E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM23106a = bVar.f28122y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f28119E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM23106a);
            C9595b c9595b = this.migrationGate;
            bVar.f28120w = str;
            bVar.f28121x = null;
            bVar.f28119E = 1;
            objM23106a = c9595b.m23106a(str, str2, bVar);
            if (objM23106a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) bVar.f28120w;
            AbstractC34132o.m107864I(objM23106a);
        }
        InterfaceC9596c interfaceC9596c = (InterfaceC9596c) objM23106a;
        if (interfaceC9596c instanceof InterfaceC9596c.d) {
            C9598e destination = ((InterfaceC9596c.d) interfaceC9596c).getDestination();
            InterfaceC34116n interfaceC34116n = this.logger;
            AppScreen appScreen = destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String();
            C21173v0 tab = destination.getTab();
            interfaceC34116n.mo85216g("deeplink-migration: " + str + " routed by navigation-service: screen=" + appScreen + " tab=" + (tab != null ? tab.getId() : null), new AbstractC30556a.a[0]);
            return new C21131b(destination);
        }
        if (interfaceC9596c instanceof InterfaceC9596c.e) {
            this.logger.mo85222m(AbstractC11895b.m31993l(((InterfaceC9596c.e) interfaceC9596c).getStatusCode(), "deeplink-migration: ", str, " failed to resolve with ", ", falling back to AppScreen.fromString"), new AbstractC30556a.a[0]);
            return null;
        }
        if (AbstractC22676k.m65745e(interfaceC9596c, InterfaceC9596c.c.f28129a)) {
            return null;
        }
        if (!AbstractC22676k.m65745e(interfaceC9596c, InterfaceC9596c.b.f28128a) && !AbstractC22676k.m65745e(interfaceC9596c, InterfaceC9596c.f.f28132a) && !AbstractC22676k.m65745e(interfaceC9596c, InterfaceC9596c.a.f28127a)) {
            throw new NoWhenBranchMatchedException();
        }
        this.logger.mo85216g("deeplink-migration: " + str + " resolved to " + interfaceC9596c + ", falling back to AppScreen.fromString", new AbstractC30556a.a[0]);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m23105b(WhoopUri whoopUri, InterfaceC30057d<? super InterfaceC21152l> interfaceC30057d) {
        a aVar;
        WhoopUri whoopUri2;
        String str;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f28114J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f28114J = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f28112H;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = aVar.f28114J;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            WhoopUri whoopUriM58991c = this.legacyIntegrationsDeepLinkNormalizer.m58991c(whoopUri);
            String scheme = whoopUriM58991c.getScheme();
            String host = whoopUriM58991c.getHost();
            List<String> pathSegments = whoopUriM58991c.getPathSegments();
            if (scheme == null || host == null || pathSegments.isEmpty()) {
                InterfaceC34116n interfaceC34116n = this.logger;
                StringBuilder sbM32001t = AbstractC11895b.m32001t("Deep link missing required fields: scheme=", scheme, " host=", host, " pathSegments=");
                sbM32001t.append(pathSegments);
                sbM32001t.append(" uri=");
                sbM32001t.append(whoopUriM58991c);
                interfaceC34116n.mo85222m(sbM32001t.toString(), new AbstractC30556a.a[0]);
                return C21139e0.f80216a;
            }
            NavigationScreenModel navigationScreenModelM59419b = this.dynamicDeeplinkDetector.m59419b(whoopUriM58991c);
            if (navigationScreenModelM59419b != null) {
                return m23100c(navigationScreenModelM59419b);
            }
            String str2 = pathSegments.get(0);
            String strM74110N0 = AbstractC25265s.m74110N0(pathSegments, "/", null, null, null, 62);
            String query = whoopUriM58991c.getQuery();
            if (query == null) {
                query = "";
            }
            aVar.f28115w = null;
            aVar.f28116x = whoopUriM58991c;
            aVar.f28117y = null;
            aVar.f28118z = null;
            aVar.f28109E = null;
            aVar.f28110F = null;
            aVar.f28111G = str2;
            aVar.f28114J = 1;
            Object objM23104g = m23104g(strM74110N0, query, aVar);
            if (objM23104g == obj2) {
                return obj2;
            }
            whoopUri2 = whoopUriM58991c;
            str = str2;
            obj = objM23104g;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) aVar.f28111G;
            whoopUri2 = (WhoopUri) aVar.f28116x;
            AbstractC34132o.m107864I(obj);
        }
        InterfaceC21152l interfaceC21152l = (InterfaceC21152l) obj;
        if (interfaceC21152l != null) {
            m23103f(str, "navigation_service");
            return interfaceC21152l;
        }
        AppScreen appScreenM23028b = AppScreen.Companion.m23028b(AppScreen.INSTANCE, str, null, 2, null);
        if (AbstractC22676k.m65745e(appScreenM23028b, AppScreen.C9318g6.f27632w)) {
            return m23102e(whoopUri2);
        }
        InterfaceC21152l interfaceC21152lM23101d = m23101d(appScreenM23028b, str, whoopUri2);
        if (!(interfaceC21152lM23101d instanceof C21139e0)) {
            m23103f(str, "app_screen");
        }
        return interfaceC21152lM23101d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C9594a(C23050a c23050a, C9600f c9600f, InterfaceC27353d interfaceC27353d, C21176x c21176x, C9595b c9595b, FeatureFlagChecker featureFlagChecker, InterfaceC21030c interfaceC21030c, C21143g0 c21143g0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        C23050a c23050a2 = (i13 & 1) != 0 ? new C23050a(null, 1, null) : c23050a;
        this(c23050a2, (i13 & 2) != 0 ? new C9600f(c23050a2) : c9600f, interfaceC27353d, c21176x, c9595b, featureFlagChecker, interfaceC21030c, (i13 & 128) != 0 ? new C21143g0() : c21143g0);
    }
}
