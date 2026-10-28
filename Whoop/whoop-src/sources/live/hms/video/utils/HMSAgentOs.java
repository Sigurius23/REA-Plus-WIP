package live.hms.video.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.core.app.NotificationCompat;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FlavorConstantsKt;
import ih0.AbstractC18489d0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import l01.C23045q;
import l83.InterfaceC23462h;
import live.hms.video.events.AgentType;
import live.hms.video.events.AnalyticsEvent;
import live.hms.video.sdk.SignatureChecker;
import live.hms.video.sdk.models.FrameworkInfo;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\b0\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u001eR\u001b\u0010%\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\u001eR\u001b\u0010(\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u001eR\u001b\u0010+\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\u001e¨\u0006,"}, m65681d2 = {"Llive/hms/video/utils/HMSAgentOs;", "", "Llive/hms/video/sdk/models/FrameworkInfo;", "frameworkInfo", "Llive/hms/video/sdk/SignatureChecker;", "signatureChecker", "<init>", "(Llive/hms/video/sdk/models/FrameworkInfo;Llive/hms/video/sdk/SignatureChecker;)V", "", "agent", "kotlin.jvm.PlatformType", "getUrlEncodedAgent", "(Ljava/lang/String;)Ljava/lang/String;", "", "hash", "bytesToHex", "([B)Ljava/lang/String;", "Llive/hms/video/events/AnalyticsEvent;", NotificationCompat.CATEGORY_EVENT, "getUniqueEventId", "(Llive/hms/video/events/AnalyticsEvent;)Ljava/lang/String;", "Landroid/content/Context;", "context", "getDeviceId", "(Landroid/content/Context;)Ljava/lang/String;", "Llive/hms/video/sdk/models/FrameworkInfo;", "TAG", "Ljava/lang/String;", "USER_AGENT_V2_NAME", "getUSER_AGENT_V2_NAME", "()Ljava/lang/String;", "userAgentUrlEncoded$delegate", "Ll83/h;", "getUserAgentUrlEncoded", "userAgentUrlEncoded", "userAgent$delegate", "getUserAgent", "userAgent", "userAgentV2$delegate", "getUserAgentV2", "userAgentV2", "userAgentV2Encoded$delegate", "getUserAgentV2Encoded", "userAgentV2Encoded", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSAgentOs {
    private final String TAG;
    private final String USER_AGENT_V2_NAME;
    private final FrameworkInfo frameworkInfo;

    /* JADX INFO: renamed from: userAgent$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h userAgent;

    /* JADX INFO: renamed from: userAgentUrlEncoded$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h userAgentUrlEncoded;

    /* JADX INFO: renamed from: userAgentV2$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h userAgentV2;

    /* JADX INFO: renamed from: userAgentV2Encoded$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h userAgentV2Encoded;

    public HMSAgentOs(FrameworkInfo frameworkInfo, SignatureChecker signatureChecker) {
        AbstractC22676k.m65750j(frameworkInfo, "frameworkInfo");
        AbstractC22676k.m65750j(signatureChecker, "signatureChecker");
        this.frameworkInfo = frameworkInfo;
        this.TAG = "HMSAgentOs";
        this.USER_AGENT_V2_NAME = "user_agent_v2";
        final int i13 = 0;
        this.userAgentUrlEncoded = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: live.hms.video.utils.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ HMSAgentOs f95268x;

            {
                this.f95268x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return HMSAgentOs.userAgentUrlEncoded_delegate$lambda$0(this.f95268x);
                    case 1:
                        return HMSAgentOs.userAgent_delegate$lambda$1(this.f95268x);
                    default:
                        return HMSAgentOs.userAgentV2Encoded_delegate$lambda$3(this.f95268x);
                }
            }
        });
        final int i14 = 1;
        this.userAgent = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: live.hms.video.utils.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ HMSAgentOs f95268x;

            {
                this.f95268x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return HMSAgentOs.userAgentUrlEncoded_delegate$lambda$0(this.f95268x);
                    case 1:
                        return HMSAgentOs.userAgent_delegate$lambda$1(this.f95268x);
                    default:
                        return HMSAgentOs.userAgentV2Encoded_delegate$lambda$3(this.f95268x);
                }
            }
        });
        this.userAgentV2 = AbstractC30060g.m92088H(new C23045q(21, signatureChecker, this));
        final int i15 = 2;
        this.userAgentV2Encoded = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: live.hms.video.utils.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ HMSAgentOs f95268x;

            {
                this.f95268x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return HMSAgentOs.userAgentUrlEncoded_delegate$lambda$0(this.f95268x);
                    case 1:
                        return HMSAgentOs.userAgent_delegate$lambda$1(this.f95268x);
                    default:
                        return HMSAgentOs.userAgentV2Encoded_delegate$lambda$3(this.f95268x);
                }
            }
        });
    }

    private final String bytesToHex(byte[] hash) {
        StringBuilder sb4 = new StringBuilder(hash.length * 2);
        for (byte b : hash) {
            String hexString = Integer.toHexString(b & 255);
            AbstractC22676k.m65749i(hexString, "toHexString(...)");
            if (hexString.length() == 1) {
                sb4.append(0);
            }
            sb4.append(hexString);
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    private final String getUrlEncodedAgent(String agent) {
        try {
            return URLEncoder.encode(agent, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return AbstractC39421y.m125926K(agent, " ", "_", false);
        }
    }

    private final String getUserAgentV2() {
        return (String) this.userAgentV2.getValue();
    }

    private final String getUserAgentV2Encoded() {
        Object value = this.userAgentV2Encoded.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (String) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String userAgentUrlEncoded_delegate$lambda$0(HMSAgentOs this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return this$0.USER_AGENT_V2_NAME + '=' + this$0.getUserAgentV2Encoded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String userAgentV2Encoded_delegate$lambda$3(HMSAgentOs this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return this$0.getUrlEncodedAgent(this$0.getUserAgentV2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String userAgentV2_delegate$lambda$2(SignatureChecker signatureChecker, HMSAgentOs this$0) {
        String str;
        AbstractC22676k.m65750j(signatureChecker, "$signatureChecker");
        AbstractC22676k.m65750j(this$0, "this$0");
        int i13 = Build.VERSION.SDK_INT;
        String MODEL = Build.MODEL;
        AbstractC22676k.m65749i(MODEL, "MODEL");
        String strM125926K = AbstractC39421y.m125926K(MODEL, " ", "_", false);
        String str2 = signatureChecker.getIsReleaseSigned() ? FlavorConstantsKt.FLAVOR_PROD : "debug";
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "os:android,os_version:", ",sdk:android,sdk_version:2.9.87,device_model:", strM125926K, ",env:");
        sbM53373n.append(str2);
        sbM53373n.append(",is_prebuilt:");
        sbM53373n.append(this$0.frameworkInfo.isPrebuilt());
        if (this$0.frameworkInfo.getFramework() != AgentType.ANDROID_NATIVE) {
            str = ",framework:" + this$0.frameworkInfo.getFramework().getServerName() + ",framework_version:" + this$0.frameworkInfo.getFrameworkVersion() + ",framework_sdk_version:" + this$0.frameworkInfo.getFrameworkSdkVersion();
        } else {
            str = "";
        }
        sbM53373n.append(str);
        return sbM53373n.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String userAgent_delegate$lambda$1(HMSAgentOs this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return this$0.getUserAgentV2();
    }

    @SuppressLint({"HardwareIds"})
    public final String getDeviceId(Context context) {
        AbstractC22676k.m65750j(context, "context");
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(AbstractC39421y.m125919D(Settings.Secure.getString(context.getContentResolver(), "android_id").toString()));
        AbstractC22676k.m65749i(bArrDigest, "digest(...)");
        return bytesToHex(bArrDigest);
    }

    public final String getUSER_AGENT_V2_NAME() {
        return this.USER_AGENT_V2_NAME;
    }

    public final String getUniqueEventId(AnalyticsEvent event) {
        AbstractC22676k.m65750j(event, "event");
        return String.valueOf(Math.abs((event.getTimestamp() + event.getName()).hashCode()));
    }

    public final String getUserAgent() {
        return (String) this.userAgent.getValue();
    }

    public final String getUserAgentUrlEncoded() {
        return (String) this.userAgentUrlEncoded.getValue();
    }
}
