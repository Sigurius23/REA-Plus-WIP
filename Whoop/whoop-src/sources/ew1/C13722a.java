package ew1;

import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.remote.domain.response.growth.MembershipStatus;
import ev2.C13693b;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.HashMap;
import java.util.Locale;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import lw1.C24774j;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ew1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u00018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Ju\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2,\b\u0002\u0010\u0010\u001a&\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000ej\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JQ\u0010\u0014\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2,\b\u0002\u0010\u0010\u001a&\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000ej\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0011¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010!J\u0015\u0010#\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b#\u0010\u001fJ\u0015\u0010$\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b$\u0010\u001fJ\u0015\u0010%\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b%\u0010\u001fJ\u001d\u0010(\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\b¢\u0006\u0004\b+\u0010\u001fJ\u0015\u0010,\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\b¢\u0006\u0004\b,\u0010\u001fJ\r\u0010-\u001a\u00020\u0011¢\u0006\u0004\b-\u0010!J\u0017\u0010/\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b/\u0010\u001fJ+\u00101\u001a\u00020\u00112\u0006\u00100\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\u00112\u0006\u00103\u001a\u00020\b¢\u0006\u0004\b4\u0010\u001fJ\u001d\u00106\u001a\u00020\u00112\u0006\u00103\u001a\u00020\b2\u0006\u00105\u001a\u00020\b¢\u0006\u0004\b6\u0010\u001aJ%\u00107\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b7\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010;¨\u0006="}, m65681d2 = {"Lew1/a;", "", "Lfi0/a;", "analytics", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "<init>", "(Lfi0/a;Lcom/whoop/data/local/prefs/PreferenceHelper;)V", "", "eventName", "category", "action", "label", "value", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "otherProperties", "Ll83/a0;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V", "d", "()Ljava/lang/String;", "sku", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Ljava/lang/String;)V", "m", "(Ljava/lang/String;)Ljava/lang/String;", "plan", "p", "(Ljava/lang/String;)V", "u", "()V", "t", "i", "b", "c", "Llw1/j;", "paymentOption", "j", "(Ljava/lang/String;Llw1/j;)V", "optionSelected", "s", "r", "v", "ctaValue", "k", "defaultSelected", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "selected", "q", "tierSelected", "o", "l", "a", "Lfi0/a;", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "Ljava/lang/String;", "trackingLabel", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13722a {

    /* JADX INFO: renamed from: e */
    public static final int f48726e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final PreferenceHelper preferenceHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String trackingLabel;

    public C13722a(InterfaceC14515a analytics, PreferenceHelper preferenceHelper) {
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        this.analytics = analytics;
        this.preferenceHelper = preferenceHelper;
    }

    /* JADX INFO: renamed from: d */
    private final String m38875d() {
        return MembershipStatus.INSTANCE.fromStringOrDefault(PreferenceHelper.getStringValueFromMainPrefs$default(this.preferenceHelper, SharedPreferenceConstants.KEY_MEMBERSHIP_STATUS, null, 2, null)) == MembershipStatus.CANCELED ? "Reactivations" : "Native Extensions";
    }

    /* JADX INFO: renamed from: e */
    private final void m38876e(String eventName, String category, String action, String label, String value, HashMap<String, Object> otherProperties) {
        this.analytics.mo41422d(category, action, label, eventName, value, otherProperties);
    }

    /* JADX INFO: renamed from: f */
    private final void m38877f(String eventName, String action, HashMap<String, Object> otherProperties) {
        this.analytics.mo41422d(null, action, null, eventName, null, otherProperties);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m38878g(C13722a c13722a, String str, String str2, String str3, String str4, String str5, HashMap map, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        if ((i13 & 8) != 0) {
            str4 = null;
        }
        if ((i13 & 16) != 0) {
            str5 = null;
        }
        if ((i13 & 32) != 0) {
            map = new HashMap();
        }
        c13722a.m38876e(str, str2, str3, str4, str5, map);
    }

    /* JADX INFO: renamed from: h */
    private final void m38879h(String action, String sku) {
        this.trackingLabel = sku;
        m38878g(this, "Native Extensions", "Extensions", action, null, null, AbstractC25247g0.m73987V(new C23465k("sku", sku), new C23465k("description", "click")), 24, null);
    }

    /* JADX INFO: renamed from: m */
    private final String m38880m(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return AbstractC25265s.m74110N0(AbstractC39414r.m125906y0(lowerCase, new String[]{" "}, 6), " ", null, null, new C13693b(6), 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final CharSequence m38881n(String it) {
        AbstractC22676k.m65750j(it, "it");
        if (it.length() <= 0) {
            return it;
        }
        StringBuilder sb4 = new StringBuilder();
        String strValueOf = String.valueOf(it.charAt(0));
        AbstractC22676k.m65748h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        sb4.append((Object) upperCase);
        String strSubstring = it.substring(1);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        sb4.append(strSubstring);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: b */
    public final void m38882b(String sku) {
        AbstractC22676k.m65750j(sku, "sku");
        m38879h("click add accessories", sku);
    }

    /* JADX INFO: renamed from: c */
    public final void m38883c(String sku) {
        AbstractC22676k.m65750j(sku, "sku");
        m38879h("click continue to checkout", sku);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX INFO: renamed from: i */
    public final void m38884i(String plan) {
        int i13;
        AbstractC22676k.m65750j(plan, "plan");
        this.trackingLabel = plan;
        String strM38875d = m38875d();
        C23465k c23465k = new C23465k("description", "Click");
        C23465k c23465k2 = new C23465k(HMSTrackSource.SCREEN, "reactivation_selection_page");
        C23465k c23465k3 = new C23465k("platform", "mobile");
        C23465k c23465k4 = new C23465k("plan", plan);
        int iHashCode = plan.hashCode();
        if (iHashCode != -1412959777) {
            if (iHashCode != 3151468) {
                if (iHashCode == 1236635661 && plan.equals("monthly")) {
                    i13 = 30;
                } else {
                    i13 = 0;
                }
            } else if (plan.equals("free")) {
                i13 = 14;
            } else {
                i13 = 0;
            }
        } else if (plan.equals("annual")) {
            i13 = 365;
        } else {
            i13 = 0;
        }
        m38877f(strM38875d, "Click Continue", AbstractC25247g0.m73987V(c23465k, c23465k2, c23465k3, c23465k4, new C23465k("membership", Integer.valueOf(i13))));
    }

    /* JADX INFO: renamed from: j */
    public final void m38885j(String sku, C24774j paymentOption) {
        AbstractC22676k.m65750j(sku, "sku");
        AbstractC22676k.m65750j(paymentOption, "paymentOption");
        String strM38875d = m38875d();
        C23465k c23465k = new C23465k(HMSTrackSource.SCREEN, "confirmation_page");
        C23465k c23465k2 = new C23465k("platform", "mobile");
        C23465k c23465k3 = new C23465k("plan", this.trackingLabel);
        C23465k c23465k4 = new C23465k("reactivationBilling", sku);
        String str = paymentOption.getOptionSelected() == 0 ? "Use existing card" : null;
        if (str == null) {
            str = "enter new card";
        }
        m38877f(strM38875d, "Click confirm reactivation", AbstractC25247g0.m73987V(c23465k, c23465k2, c23465k3, c23465k4, new C23465k("paymentMethod", str)));
    }

    /* JADX INFO: renamed from: k */
    public final void m38886k(String ctaValue) {
        this.analytics.mo41426h("Pop Up Sheet", "In App Click", "Home", "Reactivations", ctaValue != null ? m38880m(ctaValue) : null);
    }

    /* JADX INFO: renamed from: l */
    public final void m38887l(String label, String value, String category) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(category, "category");
        InterfaceC14515a interfaceC14515a = this.analytics;
        String strM38880m = m38880m(label);
        String strM38880m2 = m38880m(value);
        String lowerCase = category.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        interfaceC14515a.mo41426h(lowerCase, "Click CTA", strM38880m, "Reactivations", strM38880m2);
    }

    /* JADX INFO: renamed from: o */
    public final void m38888o(String selected, String tierSelected) {
        AbstractC22676k.m65750j(selected, "selected");
        AbstractC22676k.m65750j(tierSelected, "tierSelected");
        InterfaceC14515a interfaceC14515a = this.analytics;
        String lowerCase = selected.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        InterfaceC14515a.m41418i(interfaceC14515a, lowerCase, "Toggle Billing Plan", null, "Reactivations", m38880m(tierSelected), null, 36, null);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX INFO: renamed from: p */
    public final void m38889p(String plan) {
        int i13;
        AbstractC22676k.m65750j(plan, "plan");
        String strM38875d = m38875d();
        C23465k c23465k = new C23465k("platform", "mobile");
        C23465k c23465k2 = new C23465k(HMSTrackSource.SCREEN, "reactivation_selection_page");
        C23465k c23465k3 = new C23465k("plan", plan);
        int iHashCode = plan.hashCode();
        if (iHashCode != -1412959777) {
            if (iHashCode != 3151468) {
                if (iHashCode == 1236635661 && plan.equals("monthly")) {
                    i13 = 30;
                } else {
                    i13 = 0;
                }
            } else if (plan.equals("free")) {
                i13 = 14;
            } else {
                i13 = 0;
            }
        } else if (plan.equals("annual")) {
            i13 = 365;
        } else {
            i13 = 0;
        }
        m38877f(strM38875d, "Toggle", AbstractC25247g0.m73987V(c23465k, c23465k2, c23465k3, new C23465k("membership", Integer.valueOf(i13))));
    }

    /* JADX INFO: renamed from: q */
    public final void m38890q(String selected) {
        AbstractC22676k.m65750j(selected, "selected");
        InterfaceC14515a.m41418i(this.analytics, null, "Toggle Membership Tier", null, "Reactivations", m38880m(selected), null, 37, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m38891r(String optionSelected) {
        AbstractC22676k.m65750j(optionSelected, "optionSelected");
        m38878g(this, "Checkout", "Extensions Checkout", "View Error State", null, null, AbstractC25247g0.m73987V(new C23465k("sku", optionSelected)), 24, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m38892s(String optionSelected) {
        AbstractC22676k.m65750j(optionSelected, "optionSelected");
        m38878g(this, "Checkout", "Extensions Checkout", "View", null, null, AbstractC25247g0.m73987V(new C23465k("sku", optionSelected)), 24, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m38893t() {
        m38877f(m38875d(), "View", AbstractC25247g0.m73987V(new C23465k("description", "View Screen"), new C23465k(HMSTrackSource.SCREEN, "confirmation_page"), new C23465k("platform", "mobile")));
    }

    /* JADX INFO: renamed from: u */
    public final void m38894u() {
        m38877f(m38875d(), "View", AbstractC25247g0.m73987V(new C23465k("description", "View Screen"), new C23465k(HMSTrackSource.SCREEN, "reactivation_selection_page"), new C23465k("platform", "mobile")));
    }

    /* JADX INFO: renamed from: v */
    public final void m38895v() {
        this.analytics.mo41426h("Pop Up Sheet", "View Pop Up Sheet", "Home", "Reactivations", "Check Out New Devices");
    }

    /* JADX INFO: renamed from: w */
    public final void m38896w(String defaultSelected, String label, String value) {
        AbstractC22676k.m65750j(defaultSelected, "defaultSelected");
        AbstractC22676k.m65750j(label, "label");
        InterfaceC14515a.m41418i(this.analytics, null, "View", label, "Reactivations", value, AbstractC25247g0.m73987V(new C23465k("default_selected", m38880m(defaultSelected))), 1, null);
    }
}
