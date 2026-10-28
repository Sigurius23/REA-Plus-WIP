package l80;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.lifecycle.C1601k1;
import com.whoop.activation.domain.models.ActivationFlowCtaDestinations;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.appconfiguration.TabConfiguration;
import com.whoop.data.repositories.MfaSupportUrl;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.HomeScreenModel;
import com.whoop.navigation.ReferAFriendScreenModel;
import in2.AbstractC18737i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import j02.AbstractC21155m0;
import j02.AbstractC21161p0;
import j02.InterfaceC21159o0;
import j93.InterfaceC21461d;
import java.util.Map;
import ji0.C21717e;
import js0.AbstractC21909c;
import js0.C21908b;
import jy1.C22047a;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p030b7.C2772a;
import p030b7.InterfaceC2773b;
import p114eb.AbstractC12939a0;
import p114eb.C12982q;
import p114eb.C12991u0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import py1.C29622a;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import sr2.AbstractC32943y;
import tr2.InterfaceC34116n;
import ur2.C35199a;
import x60.AbstractC38022b;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: l80.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001Bc\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, m65681d2 = {"Ll80/p;", "", "Leb/u0;", "navHostController", "Lj02/o0;", "navigator", "Lsr2/y;", "urlProvider", "Landroidx/fragment/app/r0;", "activity", "Lur2/a;", "localLogExporter", "Ll80/s;", "healthConnectWrapper", "Ljs0/c;", "configurationRepository", "Liy1/c;", "metricWriter", "Lpy1/a;", "mfaAnalyticsHelper", "Lji0/e;", "appConfigurationRepository", "Ltr2/n;", "logger", "<init>", "(Leb/u0;Lj02/o0;Lsr2/y;Landroidx/fragment/app/r0;Lur2/a;Ll80/s;Ljs0/c;Liy1/c;Lpy1/a;Lji0/e;Ltr2/n;)V", "Ll83/a0;", "b", "()V", "Lcom/whoop/navigation/e;", "a", "()Lcom/whoop/navigation/e;", "Ll80/o;", "navEvent", "", "c", "(Ll80/o;)Z", "Leb/u0;", "Lj02/o0;", "Lsr2/y;", "d", "Landroidx/fragment/app/r0;", "e", "Lur2/a;", "f", "Ll80/s;", "g", "Ljs0/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Liy1/c;", "i", "Lpy1/a;", "j", "Lji0/e;", "k", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23439p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C12991u0 navHostController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC32943y urlProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractActivityC1340r0 activity;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C35199a localLogExporter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC23442s healthConnectWrapper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C29622a mfaAnalyticsHelper;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C21717e appConfigurationRepository;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: l80.p$a */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f92897a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f92898b;

        static {
            int[] iArr = new int[EnumC23445v.values().length];
            try {
                iArr[EnumC23445v.GETTING_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC23445v.MFA_HELP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f92897a = iArr;
            int[] iArr2 = new int[ActivationFlowCtaDestinations.values().length];
            try {
                iArr2[ActivationFlowCtaDestinations.START_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ActivationFlowCtaDestinations.FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f92898b = iArr2;
        }
    }

    public C23439p(C12991u0 navHostController, InterfaceC21159o0 navigator, AbstractC32943y urlProvider, AbstractActivityC1340r0 activity, C35199a localLogExporter, InterfaceC23442s healthConnectWrapper, AbstractC21909c configurationRepository, InterfaceC21030c metricWriter, C29622a mfaAnalyticsHelper, C21717e appConfigurationRepository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(navHostController, "navHostController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(urlProvider, "urlProvider");
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(localLogExporter, "localLogExporter");
        AbstractC22676k.m65750j(healthConnectWrapper, "healthConnectWrapper");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(mfaAnalyticsHelper, "mfaAnalyticsHelper");
        AbstractC22676k.m65750j(appConfigurationRepository, "appConfigurationRepository");
        AbstractC22676k.m65750j(logger, "logger");
        this.navHostController = navHostController;
        this.navigator = navigator;
        this.urlProvider = urlProvider;
        this.activity = activity;
        this.localLogExporter = localLogExporter;
        this.healthConnectWrapper = healthConnectWrapper;
        this.configurationRepository = configurationRepository;
        this.metricWriter = metricWriter;
        this.mfaAnalyticsHelper = mfaAnalyticsHelper;
        this.appConfigurationRepository = appConfigurationRepository;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    private final C9598e m67998a() {
        C9598e destination;
        C9598e c9598e = new C9598e(AppScreen.C9426u2.f27963w, new HomeScreenModel((String) null, (AiAction) null, 3, (DefaultConstructorMarker) null), null, 4, null);
        TabConfiguration tabConfigurationMo61186b = this.appConfigurationRepository.mo61186b();
        return (tabConfigurationMo61186b == null || (destination = tabConfigurationMo61186b.getDestination()) == null) ? c9598e : destination;
    }

    /* JADX INFO: renamed from: b */
    private final void m67999b() {
        AbstractC21161p0 abstractC21161p0Mo59392a = this.navigator.mo59392a(m67998a());
        if ((abstractC21161p0Mo59392a instanceof AbstractC21161p0.h) || (abstractC21161p0Mo59392a instanceof AbstractC21161p0.c)) {
            this.logger.mo85226q("Default tab navigation failed (" + abstractC21161p0Mo59392a + "); falling back to native home", new AbstractC30556a.a[0]);
            this.navigator.mo59393b(new AbstractC21155m0.z1(null, 1, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.Map] */
    /* JADX INFO: renamed from: c */
    public final boolean m68000c(AbstractC23438o navEvent) {
        C1601k1 c1601k1M36480b;
        String string;
        AbstractC22676k.m65750j(navEvent, "navEvent");
        Object objM125868N0 = null;
        if (navEvent instanceof AbstractC23438o.g) {
            AbstractC23438o.g gVar = (AbstractC23438o.g) navEvent;
            AbstractC12939a0.m36374y(this.navHostController, AbstractC23440q.m68002b(gVar.getRoute(), gVar.m67992a()), null, 6);
        } else if (navEvent instanceof AbstractC23438o.k) {
            int i13 = a.f92897a[((AbstractC23438o.k) navEvent).getPage().ordinal()];
            if (i13 == 1) {
                string = this.activity.getString(AbstractC38022b.f162893d0);
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                this.metricWriter.mo58701b(new C22047a(0, "auth.cognito.user.help", null, C25271y.f99162w, null, 21, null));
                C29622a.m91010n(this.mfaAnalyticsHelper, "welcome_screen", null, "sign_in", "Auth Flow", 2, null);
                AbstractC21909c abstractC21909c = this.configurationRepository;
                MfaSupportUrl mfaSupportUrl = MfaSupportUrl.INSTANCE;
                C21908b configurations = abstractC21909c.getConfigurations();
                String name = mfaSupportUrl.getName();
                Object defaultValue = mfaSupportUrl.getDefaultValue();
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    String str = (String) configurations.get(name);
                    if (str != null) {
                        objM125868N0 = AbstractC39421y.m125932Q(str);
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    String str2 = (String) configurations.get(name);
                    if (str2 != null) {
                        objM125868N0 = AbstractC39421y.m125933R(str2);
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    String str3 = (String) configurations.get(name);
                    if (str3 != null) {
                        objM125868N0 = AbstractC39420x.m125915y(str3);
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    String str4 = (String) configurations.get(name);
                    if (str4 != null) {
                        objM125868N0 = AbstractC39420x.m125914x(str4);
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
                    String str5 = (String) configurations.get(name);
                    if (str5 != null) {
                        objM125868N0 = AbstractC39414r.m125868N0(str5);
                    }
                } else {
                    objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
                }
                if (objM125868N0 != null) {
                    defaultValue = objM125868N0;
                }
                if (defaultValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) defaultValue;
            }
            AbstractC22676k.m65747g(string);
            this.navigator.mo59393b(new AbstractC21155m0.g1(string));
        } else if (navEvent instanceof AbstractC23438o.b) {
            AbstractC23438o.b bVar = (AbstractC23438o.b) navEvent;
            if (bVar.getFrom() == ActivationFlowDestination.MFA_CHALLENGE) {
                C29622a.m91009k(this.mfaAnalyticsHelper, "welcome_screen", null, "sign_in", "Auth Flow", 2, null);
            }
            ActivationFlowDestination destination = bVar.getDestination();
            if (destination != null) {
                AbstractC12939a0.m36371B(this.navHostController, destination.name(), false);
            } else {
                this.navHostController.m36410z();
            }
        } else if (navEvent instanceof AbstractC23438o.c) {
            C12982q c12982qM36398m = this.navHostController.m36398m();
            if (c12982qM36398m != null && (c1601k1M36480b = c12982qM36398m.m36480b()) != null) {
                AbstractC23438o.c cVar = (AbstractC23438o.c) navEvent;
                c1601k1M36480b.m5004e(cVar.getValue(), cVar.getKey());
            }
            this.navHostController.m36410z();
        } else if (navEvent instanceof AbstractC23438o.f) {
            AbstractC12939a0.m36371B(this.navHostController, ((AbstractC23438o.f) navEvent).getRoute().name(), false);
        } else if (navEvent.equals(AbstractC23438o.i.f92881a)) {
            if (this.healthConnectWrapper.mo68006a()) {
                AbstractActivityC1340r0 abstractActivityC1340r0 = this.activity;
                InterfaceC2773b.f10911a.getClass();
                Intent intent = new Intent(C2772a.f10910b);
                intent.addFlags(268435456);
                if (Build.VERSION.SDK_INT < 34) {
                    intent.setPackage("com.google.android.apps.healthdata");
                }
                abstractActivityC1340r0.startActivity(intent);
            }
        } else if (navEvent instanceof AbstractC23438o.m) {
            AbstractC23438o.m mVar = (AbstractC23438o.m) navEvent;
            if (mVar.getPasswordNeedsReset()) {
                AbstractC12939a0.m36374y(this.navHostController, AbstractC23440q.m68002b(ActivationFlowDestination.FORGOT_PASSWORD, AbstractC25247g0.m73990Y(new C23465k(NotificationCompat.CATEGORY_EMAIL, mVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String()), new C23465k("fromPostPairing", Boolean.FALSE))), null, 6);
            } else {
                m67999b();
            }
        } else if (navEvent instanceof AbstractC23438o.a) {
            AbstractC23438o.a aVar = (AbstractC23438o.a) navEvent;
            if (AbstractC22676k.m65745e(aVar.getAction().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9426u2.f27963w)) {
                m67999b();
            } else {
                this.navigator.mo59392a(aVar.getAction());
            }
        } else if (navEvent instanceof AbstractC23438o.j) {
            this.navigator.mo59393b(new AbstractC21155m0.g1(this.urlProvider.getCheckoutBaseUrl()));
        } else if (navEvent instanceof AbstractC23438o.e) {
            InterfaceC21159o0 interfaceC21159o0 = this.navigator;
            AppScreen.C9436v4 c9436v4 = AppScreen.C9436v4.f27993w;
            AbstractC23438o.e eVar = (AbstractC23438o.e) navEvent;
            String message = eVar.getMessage();
            String referralType = eVar.getReferralType();
            interfaceC21159o0.mo59392a(new C9598e(c9436v4, new ReferAFriendScreenModel(message, "Activation Flow", (String) null, (Map) (referralType != null ? AbstractC31061c.m95645u("referral_type", referralType) : null), (Boolean) null, 20, (DefaultConstructorMarker) null), null, 4, null));
        } else if (navEvent instanceof AbstractC23438o.d) {
            this.localLogExporter.m111535n(this.activity);
        } else if (navEvent instanceof AbstractC23438o.l) {
            try {
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.addCategory("android.intent.category.APP_EMAIL");
                String string2 = this.activity.getString(AbstractC38022b.f162875P);
                AbstractC22676k.m65749i(string2, "getString(...)");
                this.activity.startActivity(Intent.createChooser(intent2, string2));
            } catch (ActivityNotFoundException e5) {
                this.logger.mo85213c("No email app found to handle intent", e5, new AbstractC30556a.a[0]);
                AbstractC18737i.m54481f(this.activity, AbstractC38022b.f162872M);
            }
        } else {
            if (!(navEvent instanceof AbstractC23438o.h)) {
                throw new NoWhenBranchMatchedException();
            }
            int i14 = a.f92898b[((AbstractC23438o.h) navEvent).getCtaDestination().ordinal()];
            if (i14 == 1) {
                AbstractC12939a0.m36371B(this.navHostController, "START_SCREEN", false);
            } else if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.logger.mo85228t("Navigating to " + navEvent, new AbstractC30556a.a[0]);
        return true;
    }

    public /* synthetic */ C23439p(C12991u0 c12991u0, InterfaceC21159o0 interfaceC21159o0, AbstractC32943y abstractC32943y, AbstractActivityC1340r0 abstractActivityC1340r0, C35199a c35199a, InterfaceC23442s interfaceC23442s, AbstractC21909c abstractC21909c, InterfaceC21030c interfaceC21030c, C29622a c29622a, C21717e c21717e, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12991u0, interfaceC21159o0, abstractC32943y, abstractActivityC1340r0, c35199a, interfaceC23442s, abstractC21909c, interfaceC21030c, c29622a, c21717e, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ActivationFlowNavigationRouter") : interfaceC34116n);
    }
}
