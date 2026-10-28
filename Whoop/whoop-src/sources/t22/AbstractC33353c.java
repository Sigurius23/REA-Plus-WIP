package t22;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import java.util.Map;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t22.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0006\u001a%\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\b\u0010\u0006\u001a%\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\t\u0010\u0006\u001a\u0011\u0010\n\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u0011\u0010\r\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lfi0/a;", "", "", "analyticsProperties", "Ll83/a0;", "e", "(Lfi0/a;Ljava/util/Map;)V", "g", "f", "a", "d", "(Lfi0/a;)V", "c", "b", "payments_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33353c {
    /* JADX INFO: renamed from: a */
    public static final void m105778a(InterfaceC14515a interfaceC14515a, Map<String, String> analyticsProperties) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(analyticsProperties, "analyticsProperties");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "back", null, "Payment Methods", null, AbstractC25247g0.m74003l0(analyticsProperties), 21, null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m105779b(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        InterfaceC14515a.m41418i(interfaceC14515a, "are_you_sure_modal", "click_add_payment", null, "Payment Methods", null, null, 52, null);
    }

    /* JADX INFO: renamed from: c */
    public static final void m105780c(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        InterfaceC14515a.m41418i(interfaceC14515a, "are_you_sure_modal", "click_im_sure", null, "Payment Methods", null, null, 52, null);
    }

    /* JADX INFO: renamed from: d */
    public static final void m105781d(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        InterfaceC14515a.m41418i(interfaceC14515a, "are_you_sure_modal", "view_are_you_sure_modal", null, "Payment Methods", null, null, 52, null);
    }

    /* JADX INFO: renamed from: e */
    public static final void m105782e(InterfaceC14515a interfaceC14515a, Map<String, String> map) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "in app click", null, "Payment Methods", null, map != null ? AbstractC25247g0.m74003l0(map) : null, 21, null);
    }

    /* JADX INFO: renamed from: f */
    public static final void m105783f(InterfaceC14515a interfaceC14515a, Map<String, String> analyticsProperties) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(analyticsProperties, "analyticsProperties");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "click_change", null, "Payment Methods", null, AbstractC25247g0.m74003l0(analyticsProperties), 21, null);
    }

    /* JADX INFO: renamed from: g */
    public static final void m105784g(InterfaceC14515a interfaceC14515a, Map<String, String> analyticsProperties) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(analyticsProperties, "analyticsProperties");
        InterfaceC14515a.m41418i(interfaceC14515a, null, ProfileAnalyticsKt.VIEW, null, "Payment Methods", null, AbstractC25247g0.m74003l0(analyticsProperties), 21, null);
    }
}
