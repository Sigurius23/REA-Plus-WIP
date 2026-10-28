package j92;

import ae3.C0801i;
import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.featureFlags.CoreFeatureFlagsKt;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.repositories.DefaultLanguageDecider;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import i92.C18258c;
import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.TimeZone;
import l83.C23454a0;
import l83.InterfaceC23462h;
import or2.C28162g;
import or2.InterfaceC28197r1;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.C30064k;
import q83.InterfaceC30057d;
import q92.C30073e;
import q92.C30076h;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;

/* JADX INFO: renamed from: j92.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 F2\u00020\u0001:\u0001GB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\n¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u0014H\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010)\u001a\u00020(*\u00020\u0019H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010AR\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010;R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u00109¨\u0006H"}, m65681d2 = {"Lj92/b;", "Lud3/g0;", "Lq92/h;", "whoopStrapSharedPrefs", "Lq92/e;", "strapSignatureDataStoreHelper", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "Lor2/g;", "buildConfigProvider", "Ll83/h;", "Lcom/whoop/data/repositories/DefaultLanguageDecider;", "defaultLanguageDecider", "", "packageName", "appVersionName", "", "appVersionCode", "Li92/c;", "installationUuidProvider", "", "installTime", "clockFormat", "Lor2/r1;", "systemResources", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lq92/h;Lq92/e;Lcom/whoop/data/local/prefs/PreferenceHelper;Lor2/g;Ll83/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Li92/c;JLjava/lang/String;Lor2/r1;Ll83/h;)V", "Lud3/o0;", "request", "Lud3/n0;", "newRequest", "strapIdHeader", "Ll83/a0;", "b", "(Lud3/o0;Lud3/n0;Ljava/lang/String;)V", "value", "c", "(J)Ljava/lang/String;", "", "d", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)Z", "Lud3/f0;", "chain", "Lud3/x0;", "intercept", "(Lud3/f0;)Lud3/x0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lq92/h;", "x", "Lq92/e;", "y", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "z", "Lor2/g;", "E", "Ll83/h;", "F", "Ljava/lang/String;", "G", "H", "Ljava/lang/Number;", "I", "Li92/c;", "J", "K", "L", "Lor2/r1;", "M", "N", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21434b implements InterfaceC34816g0 {

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h defaultLanguageDecider;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final String packageName;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final String appVersionName;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final Number appVersionCode;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C18258c installationUuidProvider;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final long installTime;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final String clockFormat;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC28197r1 systemResources;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C30076h whoopStrapSharedPrefs;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C30073e strapSignatureDataStoreHelper;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final PreferenceHelper preferenceHelper;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C28162g buildConfigProvider;

    /* JADX INFO: renamed from: j92.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lj92/b$a;", "", "<init>", "()V", "Landroid/content/pm/PackageInfo;", "packageInfo", "", "sdkInt", "", "a", "(Landroid/content/pm/PackageInfo;I)Ljava/lang/Number;", "", "ADD_LOCALE_HEADER", "Ljava/lang/String;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"NewApi"})
        /* JADX INFO: renamed from: a */
        public final Number m60326a(PackageInfo packageInfo, int sdkInt) {
            AbstractC22676k.m65750j(packageInfo, "packageInfo");
            return sdkInt >= 28 ? Integer.valueOf((int) packageInfo.getLongVersionCode()) : Integer.valueOf(packageInfo.versionCode);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: j92.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.network.interceptor.AppInfoInterceptor$intercept$installationUuid$1", m100430f = "AppInfoInterceptor.kt", m100431l = {66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Ljava/lang/String;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f82275w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21434b.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super String> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f82275w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C18258c c18258c = C21434b.this.installationUuidProvider;
            this.f82275w = 1;
            Object objM52601f = c18258c.m52601f(this);
            return objM52601f == enumC31071a ? enumC31071a : objM52601f;
        }
    }

    public C21434b(C30076h whoopStrapSharedPrefs, C30073e strapSignatureDataStoreHelper, PreferenceHelper preferenceHelper, C28162g buildConfigProvider, InterfaceC23462h defaultLanguageDecider, String packageName, String appVersionName, Number appVersionCode, C18258c installationUuidProvider, long j7, String clockFormat, InterfaceC28197r1 systemResources, InterfaceC23462h featureFlagChecker) {
        AbstractC22676k.m65750j(whoopStrapSharedPrefs, "whoopStrapSharedPrefs");
        AbstractC22676k.m65750j(strapSignatureDataStoreHelper, "strapSignatureDataStoreHelper");
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        AbstractC22676k.m65750j(buildConfigProvider, "buildConfigProvider");
        AbstractC22676k.m65750j(defaultLanguageDecider, "defaultLanguageDecider");
        AbstractC22676k.m65750j(packageName, "packageName");
        AbstractC22676k.m65750j(appVersionName, "appVersionName");
        AbstractC22676k.m65750j(appVersionCode, "appVersionCode");
        AbstractC22676k.m65750j(installationUuidProvider, "installationUuidProvider");
        AbstractC22676k.m65750j(clockFormat, "clockFormat");
        AbstractC22676k.m65750j(systemResources, "systemResources");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.whoopStrapSharedPrefs = whoopStrapSharedPrefs;
        this.strapSignatureDataStoreHelper = strapSignatureDataStoreHelper;
        this.preferenceHelper = preferenceHelper;
        this.buildConfigProvider = buildConfigProvider;
        this.defaultLanguageDecider = defaultLanguageDecider;
        this.packageName = packageName;
        this.appVersionName = appVersionName;
        this.appVersionCode = appVersionCode;
        this.installationUuidProvider = installationUuidProvider;
        this.installTime = j7;
        this.clockFormat = clockFormat;
        this.systemResources = systemResources;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: b */
    private final void m60323b(C34832o0 request, C34830n0 newRequest, String strapIdHeader) {
        String strM92202h;
        String strM92183c;
        if ((strapIdHeader == null || strapIdHeader.length() == 0) && (strM92202h = this.whoopStrapSharedPrefs.m92202h()) != null) {
            if (strM92202h.length() <= 0) {
                strM92202h = null;
            }
            if (strM92202h != null) {
                newRequest.m109902c("X-WHOOP-Strap-Id", strM92202h);
            }
        }
        String strM109863a = request.f146714c.m109863a("X-WHOOP-Strap-Signature");
        if ((strM109863a == null || strM109863a.length() == 0) && (strM92183c = this.strapSignatureDataStoreHelper.m92183c()) != null) {
            String str = strM92183c.length() > 0 ? strM92183c : null;
            if (str != null) {
                newRequest.m109902c("X-WHOOP-Strap-Signature", str);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final String m60324c(long value) {
        String strPrint = DateTimeFormat.forPattern(StreamDateFormatter.DATE_FORMAT_WITHOUT_NANOSECONDS).print(new DateTime(value, DateTimeZone.UTC));
        AbstractC22676k.m65749i(strPrint, "print(...)");
        return strPrint;
    }

    /* JADX INFO: renamed from: d */
    private final boolean m60325d(FeatureFlagChecker featureFlagChecker) {
        return featureFlagChecker.isFeatureEnabled("add-locale-header-droid") || featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.LOCALE_HEADER);
    }

    @Override // ud3.InterfaceC34816g0
    public C34850x0 intercept(InterfaceC34813f0 chain) {
        AbstractC22676k.m65750j(chain, "chain");
        C0801i c0801i = (C0801i) chain;
        C34832o0 c34832o0 = c0801i.f2955e;
        String strM109863a = c34832o0.f146714c.m109863a("X-WHOOP-Strap-Id");
        String str = (String) AbstractC3006f0.m8699E(C30064k.f122676w, new b(null));
        C34830n0 c34830n0M109907b = c34832o0.m109907b();
        c34830n0M109907b.m109900a("X-WHOOP-Package-Name", this.packageName);
        c34830n0M109907b.m109900a("X-WHOOP-App-Version", this.appVersionName);
        c34830n0M109907b.m109900a("User-Agent", "Whoop-Android\\" + this.appVersionName);
        c34830n0M109907b.m109900a("X-WHOOP-Installation-Identifier", str);
        LanguageRepository.Companion companion = LanguageRepository.INSTANCE;
        c34830n0M109907b.m109900a("Accept-Language", companion.getAcceptLanguageHeaderValue(this.preferenceHelper, (DefaultLanguageDecider) this.defaultLanguageDecider.getValue()));
        c34830n0M109907b.m109900a("X-WHOOP-App-Install-Timestamp", m60324c(this.installTime));
        c34830n0M109907b.m109900a("X-WHOOP-Device-Platform", "ANDROID");
        String id4 = TimeZone.getDefault().getID();
        AbstractC22676k.m65749i(id4, "getID(...)");
        c34830n0M109907b.m109900a("X-WHOOP-Time-Zone", id4);
        c34830n0M109907b.m109900a("X-WHOOP-Clock-Format", this.clockFormat);
        if (this.buildConfigProvider.getDebuggable()) {
            c34830n0M109907b.m109900a("X-WHOOP-App-Version-Code", "2147483647");
        } else {
            c34830n0M109907b.m109900a("X-WHOOP-App-Version-Code", this.appVersionCode.toString());
        }
        if (m60325d((FeatureFlagChecker) this.featureFlagChecker.getValue())) {
            c34830n0M109907b.m109900a("Locale", companion.getFormattingLocaleHeaderValue(this.systemResources, this.preferenceHelper, (DefaultLanguageDecider) this.defaultLanguageDecider.getValue()));
        }
        if (((FeatureFlagChecker) this.featureFlagChecker.getValue()).isFeatureEnabled(CoreFeatureFlagsKt.ALWAYS_ATTACH_STRAP_HEADERS)) {
            m60323b(c34832o0, c34830n0M109907b, strM109863a);
        } else if (strM109863a == null || strM109863a.length() == 0) {
            String strM92202h = this.whoopStrapSharedPrefs.m92202h();
            if (strM92202h == null) {
                strM92202h = "";
            }
            c34830n0M109907b.m109900a("X-WHOOP-Strap-Id", strM92202h);
        }
        return c0801i.m1939b(new C34832o0(c34830n0M109907b));
    }
}
