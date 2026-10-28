package a32;

import fi0.InterfaceC14515a;
import java.util.Locale;
import java.util.Map;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: a32.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\u001a\u0019\u0010\u0002\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\n\u001a\u00020\u0005*\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\b¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\f\u001a\u00020\u0005*\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\b¢\u0006\u0004\b\f\u0010\u000b\u001a%\u0010\r\u001a\u00020\u0005*\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\b¢\u0006\u0004\b\r\u0010\u000b\u001a%\u0010\u000e\u001a\u00020\u0005*\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\b¢\u0006\u0004\b\u000e\u0010\u000b\u001a\u0011\u0010\u000f\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"", HMSTrackSource.SCREEN, "a", "(Ljava/lang/String;)Ljava/lang/String;", "Lfi0/a;", "Ll83/a0;", "g", "(Lfi0/a;Ljava/lang/String;)V", "", "otherProperties", "d", "(Lfi0/a;Ljava/util/Map;)V", "b", "f", "e", "c", "(Lfi0/a;)V", "payments_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0347b {
    /* JADX INFO: renamed from: a */
    public static final String m894a(String str) {
        String upperCase;
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        if (AbstractC22676k.m65745e(upperCase, "UNIVERSAL_PAYMENT_METHOD")) {
            return "Activation Flow";
        }
        AbstractC22676k.m65745e(upperCase, "PAYMENT_V2");
        return "Payment Methods";
    }

    /* JADX INFO: renamed from: b */
    public static final void m895b(InterfaceC14515a interfaceC14515a, Map<String, String> otherProperties) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(otherProperties, "otherProperties");
        InterfaceC14515a.m41418i(interfaceC14515a, "save_payment_method", "attempt_save_payment", null, m894a(otherProperties.get(HMSTrackSource.SCREEN)), null, otherProperties, 20, null);
    }

    /* JADX INFO: renamed from: c */
    public static final void m896c(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        InterfaceC14515a.m41418i(interfaceC14515a, "save_payment_method", "save_payment_cancelled", null, "Payment Methods", null, null, 52, null);
    }

    /* JADX INFO: renamed from: d */
    public static final void m897d(InterfaceC14515a interfaceC14515a, Map<String, String> otherProperties) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(otherProperties, "otherProperties");
        InterfaceC14515a.m41418i(interfaceC14515a, "save_payment_method", "click_save_payment", null, m894a(otherProperties.get(HMSTrackSource.SCREEN)), null, otherProperties, 20, null);
    }

    /* JADX INFO: renamed from: e */
    public static final void m898e(InterfaceC14515a interfaceC14515a, Map<String, String> otherProperties) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(otherProperties, "otherProperties");
        InterfaceC14515a.m41418i(interfaceC14515a, "save_payment_method", "save_payment_failed", null, m894a(otherProperties.get(HMSTrackSource.SCREEN)), null, otherProperties, 20, null);
    }

    /* JADX INFO: renamed from: f */
    public static final void m899f(InterfaceC14515a interfaceC14515a, Map<String, String> otherProperties) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(otherProperties, "otherProperties");
        InterfaceC14515a.m41418i(interfaceC14515a, "save_payment_method", "save_payment_success", null, m894a(otherProperties.get(HMSTrackSource.SCREEN)), null, otherProperties, 20, null);
    }

    /* JADX INFO: renamed from: g */
    public static final void m900g(InterfaceC14515a interfaceC14515a, String screen) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(screen, "screen");
        InterfaceC14515a.m41418i(interfaceC14515a, "save_payment_method", "view_payment_sheet", null, m894a(screen), null, AbstractC31061c.m95645u(HMSTrackSource.SCREEN, screen), 20, null);
    }
}
