package ss1;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32618h3;
import pt1.EnumC29515e;

/* JADX INFO: renamed from: ss1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\bJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\bJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\bJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0016\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\bJ\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\bJ\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\bJ\u001b\u0010\u001c\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0004\b\u001c\u0010\u0017J\r\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\bJ\r\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\bJ\r\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\bJ\r\u0010 \u001a\u00020\u0006¢\u0006\u0004\b \u0010\bJ\r\u0010!\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\bJ\r\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\bJ\r\u0010#\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\bJ\r\u0010$\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\bJ\r\u0010%\u001a\u00020\u0006¢\u0006\u0004\b%\u0010\bJ\u0015\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, m65681d2 = {"Lss1/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Ll83/a0;", "i", "()V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "", "selectedWrist", "m", "(Ljava/lang/String;)V", "b", "q", "r", "classification", "s", "", "Lpt1/e;", "reasons", "t", "(Ljava/util/List;)V", "l", "n", "d", "symptoms", "v", "k", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "j", "e", "p", "c", "o", "f", "Lss1/b;", "buttonType", "g", "(Lss1/b;)V", "a", "Lfi0/a;", "getAnalytics", "()Lfi0/a;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32948a {

    /* JADX INFO: renamed from: c */
    public static final int f137244c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: ss1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f137246a;

        static {
            int[] iArr = new int[EnumC32949b.values().length];
            try {
                iArr[EnumC32949b.IFU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32949b.LEARN_ABOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32949b.REG_DETAILS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f137246a = iArr;
        }
    }

    public C32948a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final CharSequence m104027u(EnumC29515e it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getAnalyticsLabel();
    }

    /* JADX INFO: renamed from: b */
    public final void m104028b() {
        InterfaceC14515a.m41418i(this.analytics, "ecg_reading", "start_ecg_reading", null, "ECG", null, null, 52, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m104029c() {
        this.analytics.mo41424f("ecg_past_results", "error", "could_not_clear_result", "ECG");
    }

    /* JADX INFO: renamed from: d */
    public final void m104030d() {
        InterfaceC14515a.m41418i(this.analytics, "ecg_results", "add_symptoms", null, "ECG", null, null, 52, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m104031e() {
        InterfaceC14515a.m41418i(this.analytics, "ecg_past_results", "clear_past_result", null, "ECG", null, null, 52, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m104032f() {
        InterfaceC14515a.m41418i(this.analytics, "learn_more", null, "learn_more_page", "ECG", null, null, 50, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m104033g(EnumC32949b buttonType) {
        String str;
        AbstractC22676k.m65750j(buttonType, "buttonType");
        int i13 = b.f137246a[buttonType.ordinal()];
        if (i13 == 1) {
            str = "IFU";
        } else if (i13 == 2) {
            str = "Learn_about";
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "Reg_details";
        }
        InterfaceC14515a.m41418i(this.analytics, "learn_more", null, str, "ECG", null, null, 50, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m104034h() {
        this.analytics.mo41424f("onboarding", "click", "final_screen", "ECG");
    }

    /* JADX INFO: renamed from: i */
    public final void m104035i() {
        this.analytics.mo41424f("onboarding", "click", "intro_screen", "ECG");
    }

    /* JADX INFO: renamed from: j */
    public final void m104036j() {
        InterfaceC14515a.m41418i(this.analytics, "ecg_past_results", "view_past_reading", null, "ECG", null, null, 52, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m104037k() {
        InterfaceC14515a.m41418i(this.analytics, "ecg_results", "save_reading", null, "ECG", null, null, 52, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m104038l() {
        InterfaceC14515a.m41418i(this.analytics, "ecg_results", "share_results", null, "ECG", null, null, 52, null);
    }

    /* JADX INFO: renamed from: m */
    public final void m104039m(String selectedWrist) {
        AbstractC22676k.m65750j(selectedWrist, "selectedWrist");
        this.analytics.mo41424f("ecg_reading", "click", selectedWrist.equals("RIGHT") ? "right_wrist" : "left_wrist", "ECG");
    }

    /* JADX INFO: renamed from: n */
    public final void m104040n() {
        InterfaceC14515a.m41418i(this.analytics, "ecg_results", "delete_reading", null, "ECG", null, null, 52, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m104041o() {
        InterfaceC14515a.m41418i(this.analytics, "ecg_details", ProfileAnalyticsKt.VIEW, null, "ECG", null, null, 52, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m104042p() {
        this.analytics.mo41424f("ecg_past_results", "error", "could_not_load_status", "ECG");
    }

    /* JADX INFO: renamed from: q */
    public final void m104043q() {
        this.analytics.mo41424f("ecg_reading", "error", "lost_contact", "ECG");
    }

    /* JADX INFO: renamed from: r */
    public final void m104044r() {
        this.analytics.mo41424f("ecg_reading", "error", "failure_after_three_attempts", "ECG");
    }

    /* JADX INFO: renamed from: s */
    public final void m104045s(String classification) {
        AbstractC22676k.m65750j(classification, "classification");
        this.analytics.mo41424f("ecg_reading", "successful_reading", classification, "ECG");
    }

    /* JADX INFO: renamed from: t */
    public final void m104046t(List<? extends EnumC29515e> reasons) {
        String analyticsLabel;
        AbstractC22676k.m65750j(reasons, "reasons");
        if (reasons.isEmpty()) {
            analyticsLabel = null;
        } else {
            analyticsLabel = reasons.size() == 1 ? reasons.get(0).getAnalyticsLabel() : AbstractC25265s.m74110N0(reasons, ", ", null, null, new C32618h3(18), 30);
        }
        this.analytics.mo41424f("ecg_reading", "unsuccessful_reading", analyticsLabel, "ECG");
    }

    /* JADX INFO: renamed from: v */
    public final void m104047v(List<String> symptoms) {
        AbstractC22676k.m65750j(symptoms, "symptoms");
        Iterator<T> it = symptoms.iterator();
        while (it.hasNext()) {
            this.analytics.mo41424f("add_symptoms", "ecg_results", (String) it.next(), "ECG");
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m104048w() {
        InterfaceC14515a.m41418i(this.analytics, "ecg_results", "save_fails", null, "ECG", null, null, 52, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m104049x() {
        InterfaceC14515a.m41418i(this.analytics, "ecg_reading", "save_success", null, "ECG", null, null, 52, null);
    }
}
