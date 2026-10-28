package jg1;

import com.whoop.connectivityCore.firmware.models.WhoopDeviceName;
import com.whoop.connectivityCore.firmware.models.WhoopFwDevice;
import fi0.InterfaceC14515a;
import gt0.EnumC16179a;
import gt0.EnumC16180b;
import gt0.EnumC16181c;
import gt0.InterfaceC16182d;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.LinkedHashMap;
import java.util.Locale;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jg1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JG\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JG\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00182\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Ljg1/a;", "Lgt0/d;", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lgt0/b;", "category", "", "value", "Lgt0/a;", "action", "deviceName", "targetFwVersion", "errorCause", "Ll83/a0;", "f", "(Lgt0/b;Ljava/lang/String;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "userAcceptanceRequired", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "device", "e", "(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lgt0/a;", "Lgt0/c;", "b", "(Lgt0/b;Lgt0/c;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "c", "(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V", "", AttachmentExtensionsKt.EXTRA_DURATION, "d", "(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;J)V", "a", "Lfi0/a;", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21668a implements InterfaceC16182d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C21668a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: e */
    private final EnumC16179a m60928e(boolean userAcceptanceRequired, WhoopFwDevice device) {
        return (userAcceptanceRequired || device.getDeviceName() == WhoopDeviceName.PUFFIN) ? EnumC16179a.APP_INITIATED : EnumC16179a.USER_INITIATED;
    }

    /* JADX INFO: renamed from: f */
    private final void m60929f(EnumC16180b category, String value, EnumC16179a action, String deviceName, String targetFwVersion, String errorCause) {
        String lowerCase;
        if (deviceName != null) {
            Locale locale = Locale.ROOT;
            lowerCase = deviceName.toLowerCase(locale);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            if (lowerCase.length() > 0) {
                StringBuilder sb4 = new StringBuilder();
                String strValueOf = String.valueOf(lowerCase.charAt(0));
                AbstractC22676k.m65748h(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(locale);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                sb4.append((Object) upperCase);
                String strSubstring = lowerCase.substring(1);
                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                sb4.append(strSubstring);
                lowerCase = sb4.toString();
            }
        } else {
            lowerCase = null;
        }
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("Whoop Device", lowerCase), new C23465k("Strap Generation", deviceName), new C23465k("Target FW version", targetFwVersion));
        if (errorCause != null) {
            linkedHashMapM73993b0.put("Error", errorCause);
        }
        InterfaceC14515a.m41418i(this.analytics, category.getCategory(), action != null ? action.getAction() : null, null, "FW Update", value, linkedHashMapM73993b0, 4, null);
    }

    @Override // gt0.InterfaceC16182d
    /* JADX INFO: renamed from: b */
    public void mo45717b(EnumC16180b category, EnumC16181c value, EnumC16179a action, String deviceName, String targetFwVersion, String errorCause) {
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(targetFwVersion, "targetFwVersion");
        m60929f(category, value != null ? value.getValue() : null, action, deviceName, targetFwVersion, errorCause);
    }

    @Override // gt0.InterfaceC16182d
    /* JADX INFO: renamed from: c */
    public void mo45718c(boolean userAcceptanceRequired, WhoopFwDevice device) {
        AbstractC22676k.m65750j(device, "device");
        InterfaceC16182d.m45716a(this, EnumC16180b.FW_UPDATE_TIME, EnumC16181c.TRIGGERED, m60928e(userAcceptanceRequired, device), device.getDeviceName().name(), "", null, 32, null);
    }

    @Override // gt0.InterfaceC16182d
    /* JADX INFO: renamed from: d */
    public void mo45719d(boolean userAcceptanceRequired, WhoopFwDevice device, long duration) {
        AbstractC22676k.m65750j(device, "device");
        m60929f(EnumC16180b.FW_UPDATE_TIME, String.valueOf(duration), m60928e(userAcceptanceRequired, device), device.getDeviceName().name(), "", null);
    }
}
