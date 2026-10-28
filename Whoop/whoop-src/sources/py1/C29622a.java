package py1;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import jy1.C22047a;
import m83.C25271y;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import xy1.EnumC38702c;

/* JADX INFO: renamed from: py1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0010J%\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0010J%\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0010J%\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0010J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0017J%\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0010J5\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u0010J\u001d\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b(\u0010'J\u001d\u0010)\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b)\u0010'J\u0015\u0010*\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b*\u0010#J\u0015\u0010+\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b+\u0010#J\u0017\u0010,\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b,\u0010#J\u0015\u0010-\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b-\u0010#J\u0015\u0010.\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b.\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00100¨\u00061"}, m65681d2 = {"Lpy1/a;", "", "Lfi0/a;", "baseAnalytics", "Liy1/c;", "metricWriter", "<init>", "(Lfi0/a;Liy1/c;)V", "", "mfaType", "y", "(Ljava/lang/String;)Ljava/lang/String;", "source", "eventName", "Ll83/a0;", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "g", "d", "c", "o", "category", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "j", "p", "label", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "e", "Lxy1/c;", "mfaInputMode", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lxy1/c;Ljava/lang/String;)V", "v", "(Ljava/lang/String;)V", "b", "()V", "r", "(Ljava/lang/String;Ljava/lang/String;)V", "t", "x", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "u", "l", "i", "a", "Lfi0/a;", "Liy1/c;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29622a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    public C29622a(InterfaceC14515a baseAnalytics, InterfaceC21030c metricWriter) {
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        this.baseAnalytics = baseAnalytics;
        this.metricWriter = metricWriter;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m91009k(C29622a c29622a, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = "";
        }
        c29622a.m91022j(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m91010n(C29622a c29622a, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = "";
        }
        c29622a.m91024m(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m91011s(C29622a c29622a, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "";
        }
        c29622a.m91028r(str, str2);
    }

    /* JADX INFO: renamed from: y */
    private final String m91012y(String mfaType) {
        return AbstractC11266d.m30461o("mfa_type: ", mfaType);
    }

    /* JADX INFO: renamed from: a */
    public final void m91013a(String mfaType) {
        AbstractC22676k.m65750j(mfaType, "mfaType");
        this.baseAnalytics.mo41426h("settings_my_account", "error", "disable_mfa", "Auth Flow", m91012y(mfaType));
    }

    /* JADX INFO: renamed from: b */
    public final void m91014b() {
        this.metricWriter.mo58701b(new C22047a(0, "mfa.management.jwt_state_error", null, C25271y.f99162w, null, 21, null));
    }

    /* JADX INFO: renamed from: c */
    public final void m91015c(String mfaType, String source, String eventName) {
        AbstractC22676k.m65750j(mfaType, "mfaType");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(eventName, "eventName");
        this.baseAnalytics.mo41422d("challenge_screen", "error", "expired_code", eventName, m91012y(mfaType), AbstractC31061c.m95645u("source", source));
    }

    /* JADX INFO: renamed from: d */
    public final void m91016d(String mfaType, String source, String eventName) {
        AbstractC22676k.m65750j(mfaType, "mfaType");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(eventName, "eventName");
        this.baseAnalytics.mo41422d("challenge_screen", "error", "incorrect_code", eventName, m91012y(mfaType), AbstractC31061c.m95645u("source", source));
    }

    /* JADX INFO: renamed from: e */
    public final void m91017e(String category, String source, String eventName) {
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(eventName, "eventName");
        this.baseAnalytics.mo41422d(category, "error", "non_mfa", eventName, null, AbstractC31061c.m95645u("source", source));
    }

    /* JADX INFO: renamed from: f */
    public final void m91018f(String category, String label, String mfaType, String source, String eventName) {
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(mfaType, "mfaType");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(eventName, "eventName");
        this.baseAnalytics.mo41422d(category, "error", label, eventName, m91012y(mfaType), AbstractC31061c.m95645u("source", source));
    }

    /* JADX INFO: renamed from: g */
    public final void m91019g(String mfaType, String source, String eventName) {
        AbstractC22676k.m65750j(mfaType, "mfaType");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(eventName, "eventName");
        this.baseAnalytics.mo41422d("challenge_screen", "input_code", null, eventName, m91012y(mfaType), AbstractC31061c.m95645u("source", source));
    }

    /* JADX INFO: renamed from: h */
    public final void m91020h(EnumC38702c mfaInputMode, String source) {
        AbstractC22676k.m65750j(mfaInputMode, "mfaInputMode");
        AbstractC22676k.m65750j(source, "source");
        this.baseAnalytics.mo41422d("input_screen", "input_credentials", null, "MFA Setup Flow", m91012y(AbstractC29623b.m91036c(mfaInputMode)), AbstractC31061c.m95645u("source", source));
    }

    /* JADX INFO: renamed from: i */
    public final void m91021i(String mfaType) {
        AbstractC22676k.m65750j(mfaType, "mfaType");
        this.baseAnalytics.mo41426h("settings_my_account", "click", "disable_mfa", "Auth Flow", m91012y(mfaType));
    }

    /* JADX INFO: renamed from: j */
    public final void m91022j(String category, String mfaType, String source, String eventName) {
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(mfaType, "mfaType");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(eventName, "eventName");
        this.baseAnalytics.mo41422d(category, "toolbar_back", null, eventName, m91012y(mfaType), AbstractC31061c.m95645u("source", source));
    }

    /* JADX INFO: renamed from: l */
    public final void m91023l(String mfaType) {
        AbstractC22676k.m65750j(mfaType, "mfaType");
        this.baseAnalytics.mo41426h("settings_my_account", "tap", "edit_mfa", "Auth Flow", m91012y(mfaType));
    }

    /* JADX INFO: renamed from: m */
    public final void m91024m(String category, String mfaType, String source, String eventName) {
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(mfaType, "mfaType");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(eventName, "eventName");
        InterfaceC14515a interfaceC14515a = this.baseAnalytics;
        if (mfaType.length() == 0) {
            mfaType = "unknown";
        }
        interfaceC14515a.mo41422d(category, "toolbar_help", null, eventName, m91012y(mfaType), AbstractC31061c.m95645u("source", source));
    }

    /* JADX INFO: renamed from: o */
    public final void m91025o(String mfaType, String source, String eventName) {
        AbstractC22676k.m65750j(mfaType, "mfaType");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(eventName, "eventName");
        this.baseAnalytics.mo41422d("challenge_screen", "resend_code", null, eventName, m91012y(mfaType), AbstractC31061c.m95645u("source", source));
    }

    /* JADX INFO: renamed from: p */
    public final void m91026p(String mfaType, String source, String eventName) {
        AbstractC22676k.m65750j(mfaType, "mfaType");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(eventName, "eventName");
        this.baseAnalytics.mo41422d("challenge_screen", "error", "resend_rate_limit", eventName, m91012y(mfaType), AbstractC31061c.m95645u("source", source));
    }

    /* JADX INFO: renamed from: q */
    public final void m91027q(String mfaType, String source, String eventName) {
        AbstractC22676k.m65750j(mfaType, "mfaType");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(eventName, "eventName");
        this.baseAnalytics.mo41422d("challenge_screen", "view_challenge", null, eventName, m91012y(mfaType), AbstractC31061c.m95645u("source", source));
    }

    /* JADX INFO: renamed from: r */
    public final void m91028r(String mfaType, String source) {
        AbstractC22676k.m65750j(mfaType, "mfaType");
        AbstractC22676k.m65750j(source, "source");
        this.baseAnalytics.mo41422d("input_screen", ProfileAnalyticsKt.VIEW, null, "MFA Setup Flow", m91012y(mfaType), AbstractC31061c.m95645u("source", source));
    }

    /* JADX INFO: renamed from: t */
    public final void m91029t(String mfaType, String source) {
        AbstractC22676k.m65750j(mfaType, "mfaType");
        AbstractC22676k.m65750j(source, "source");
        this.baseAnalytics.mo41422d("challenge_screen", ProfileAnalyticsKt.VIEW, null, "MFA Setup Flow", m91012y(mfaType), AbstractC31061c.m95645u("source", source));
    }

    /* JADX INFO: renamed from: u */
    public final void m91030u(String mfaType) {
        AbstractC22676k.m65750j(mfaType, "mfaType");
        this.baseAnalytics.mo41426h("settings_my_account", ProfileAnalyticsKt.VIEW, null, "Auth Flow", m91012y(mfaType));
    }

    /* JADX INFO: renamed from: v */
    public final void m91031v(String source) {
        AbstractC22676k.m65750j(source, "source");
        if (source.equals("enforcement")) {
            this.metricWriter.mo58701b(new C22047a(0, "mfa.enforcement.navigation", null, C25271y.f99162w, null, 21, null));
        }
        this.baseAnalytics.mo41422d("welcome_screen", ProfileAnalyticsKt.VIEW, null, "MFA Setup Flow", null, AbstractC31061c.m95645u("source", source));
    }

    /* JADX INFO: renamed from: w */
    public final void m91032w(String source) {
        AbstractC22676k.m65750j(source, "source");
        this.baseAnalytics.mo41422d("outro_screen", ProfileAnalyticsKt.VIEW, null, "MFA Setup Flow", null, AbstractC31061c.m95645u("source", source));
    }

    /* JADX INFO: renamed from: x */
    public final void m91033x(String mfaType, String source) {
        AbstractC22676k.m65750j(mfaType, "mfaType");
        AbstractC22676k.m65750j(source, "source");
        this.baseAnalytics.mo41422d("challenge_screen", "enable", null, "MFA Setup Flow", m91012y(mfaType), AbstractC31061c.m95645u("source", source));
    }
}
