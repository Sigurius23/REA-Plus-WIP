package io.getstream.chat.android.client.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.BuildConfig;
import io.getstream.chat.android.client.ChatClient;
import java.text.Normalizer;
import java.util.regex.Pattern;
import l83.C23467m;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0005H\u0002J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\r\u0010\u0011\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u0006\u0010\u0013\u001a\u00020\u0005J\f\u0010\u0014\u001a\u00020\u0005*\u00020\u0005H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/utils/HeadersUtil;", "", "context", "Landroid/content/Context;", "appName", "", "appVersion", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getAppVersionName", "getAppVersionCode", "getAppName", "getInstallerName", "buildSdkTrackingHeaders", "buildSdkTrackingHeaders$stream_chat_android_client_release", "buildUserAgent", "sanitize", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class HeadersUtil {
    private String appName;
    private String appVersion;
    private Context context;

    public HeadersUtil(Context context, String str, String str2) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
        this.appName = str;
        this.appVersion = str2;
    }

    private final String getAppName() {
        String string;
        ApplicationInfo applicationInfo = this.context.getApplicationInfo();
        if (applicationInfo == null) {
            return "UnknownApp";
        }
        int i13 = applicationInfo.labelRes;
        if (i13 == 0) {
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return (charSequence == null || (string = charSequence.toString()) == null) ? "UnknownApp" : string;
        }
        String string2 = this.context.getString(i13);
        return string2 == null ? "UnknownApp" : string2;
    }

    private final String getAppVersionCode() {
        Object objM107888l;
        try {
            objM107888l = String.valueOf(this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).getLongVersionCode());
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if (objM107888l instanceof C23467m) {
            objM107888l = null;
        }
        String str = (String) objM107888l;
        return str == null ? "versionCodeNotFound" : str;
    }

    private final String getAppVersionName() {
        Object objM107888l;
        try {
            objM107888l = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if (objM107888l instanceof C23467m) {
            objM107888l = null;
        }
        String str = (String) objM107888l;
        return str == null ? "nameNotFound" : str;
    }

    private final String getInstallerName() {
        Object objM107888l;
        try {
            objM107888l = Build.VERSION.SDK_INT >= 30 ? this.context.getPackageManager().getInstallSourceInfo(this.context.getPackageName()).getInstallingPackageName() : this.context.getPackageManager().getInstallerPackageName(this.context.getPackageName());
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if (objM107888l instanceof C23467m) {
            objM107888l = null;
        }
        String str = (String) objM107888l;
        return str == null ? "StandAloneInstall" : str;
    }

    private final String sanitize(String str) {
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        AbstractC22676k.m65749i(strNormalize, "normalize(...)");
        Pattern patternCompile = Pattern.compile("[^\\p{ASCII}]");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(strNormalize).replaceAll("");
        AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String buildSdkTrackingHeaders$stream_chat_android_client_release() {
        ChatClient.INSTANCE.getClass();
        String strM8299l = AbstractC2875y.m8299l(ChatClient.VERSION_PREFIX_HEADER.getPrefix(), BuildConfig.STREAM_CHAT_VERSION);
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        int i13 = Build.VERSION.SDK_INT;
        String strM30461o = AbstractC11266d.m30461o("Android ", Build.VERSION.RELEASE);
        String appName = this.appName;
        if (appName == null) {
            appName = getAppName();
        }
        String appVersionName = this.appVersion;
        if (appVersionName == null) {
            appVersionName = getAppVersionName();
        }
        StringBuilder sbM53374o = AbstractC18489d0.m53374o(strM8299l);
        sbM53374o.append("|os=" + strM30461o);
        sbM53374o.append("|api_version=" + i13);
        sbM53374o.append("|device_model=" + str2 + " " + str);
        boolean z4 = ChatClient.OFFLINE_SUPPORT_ENABLED;
        StringBuilder sb4 = new StringBuilder("|offline_enabled=");
        sb4.append(z4);
        sbM53374o.append(sb4.toString());
        sbM53374o.append("|app=".concat(appName));
        sbM53374o.append("|app_version=".concat(appVersionName));
        return sanitize(sbM53374o.toString());
    }

    public final String buildUserAgent() {
        this.context.getPackageManager();
        String appVersionName = this.appVersion;
        if (appVersionName == null) {
            appVersionName = getAppVersionName();
        }
        String appVersionCode = getAppVersionCode();
        String appName = this.appName;
        if (appName == null) {
            appName = getAppName();
        }
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        int i13 = Build.VERSION.SDK_INT;
        String str3 = Build.VERSION.RELEASE;
        String installerName = getInstallerName();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(appName);
        sb4.append(" / ");
        sb4.append(appVersionName);
        sb4.append("(");
        sb4.append(appVersionCode);
        AbstractC11266d.m30444B(sb4, "); ", installerName, "; (", str);
        sb4.append("; ");
        sb4.append(str2);
        sb4.append("; SDK ");
        sb4.append(i13);
        return sanitize(AbstractC2875y.m8304q(sb4, "; Android ", str3, ")"));
    }

    public final Context getContext() {
        return this.context;
    }

    public final void setContext(Context context) {
        AbstractC22676k.m65750j(context, "<set-?>");
        this.context = context;
    }
}
