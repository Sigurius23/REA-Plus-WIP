package gt0;

import com.whoop.connectivityCore.firmware.models.WhoopFwDevice;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: gt0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JK\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, m65681d2 = {"Lgt0/d;", "", "Lgt0/b;", "category", "Lgt0/c;", "value", "Lgt0/a;", "action", "", "deviceName", "targetFwVersion", "errorCause", "Ll83/a0;", "b", "(Lgt0/b;Lgt0/c;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "userAcceptanceRequired", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "device", "c", "(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V", "", AttachmentExtensionsKt.EXTRA_DURATION, "d", "(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;J)V", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC16182d {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m45716a(InterfaceC16182d interfaceC16182d, EnumC16180b enumC16180b, EnumC16181c enumC16181c, EnumC16179a enumC16179a, String str, String str2, String str3, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendFwUpdateSegmentEvent");
        }
        if ((i13 & 16) != 0) {
            str2 = "";
        }
        String str4 = str2;
        if ((i13 & 32) != 0) {
            str3 = null;
        }
        interfaceC16182d.mo45717b(enumC16180b, enumC16181c, enumC16179a, str, str4, str3);
    }

    /* JADX INFO: renamed from: b */
    void mo45717b(EnumC16180b category, EnumC16181c value, EnumC16179a action, String deviceName, String targetFwVersion, String errorCause);

    /* JADX INFO: renamed from: c */
    void mo45718c(boolean userAcceptanceRequired, WhoopFwDevice device);

    /* JADX INFO: renamed from: d */
    void mo45719d(boolean userAcceptanceRequired, WhoopFwDevice device, long duration);
}
