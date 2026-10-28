package io.getstream.chat.android.client.api;

import io.getstream.chat.android.client.logger.ChatLoggerConfig;
import io.getstream.chat.android.client.notifications.handler.NotificationConfig;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001B]\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0013\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u001a\u0010&\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010!¨\u0006("}, m65681d2 = {"Lio/getstream/chat/android/client/api/ChatApiConfig;", "", "apiKey", "", "httpUrl", "cdnHttpUrl", "wssUrl", "warmUp", "", "loggerConfig", "Lio/getstream/chat/android/client/logger/ChatLoggerConfig;", "distinctApiCalls", "debugRequests", "notificationConfig", "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;", "fastEventParsing", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/getstream/chat/android/client/logger/ChatLoggerConfig;ZZLio/getstream/chat/android/client/notifications/handler/NotificationConfig;Z)V", "getApiKey", "()Ljava/lang/String;", "getHttpUrl", "setHttpUrl", "(Ljava/lang/String;)V", "getCdnHttpUrl", "setCdnHttpUrl", "getWssUrl", "setWssUrl", "getWarmUp", "()Z", "getLoggerConfig", "()Lio/getstream/chat/android/client/logger/ChatLoggerConfig;", "getDistinctApiCalls", "setDistinctApiCalls", "(Z)V", "getDebugRequests", "getNotificationConfig", "()Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;", "getFastEventParsing", "isAnonymous", "setAnonymous", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatApiConfig {
    private final String apiKey;
    private String cdnHttpUrl;
    private final boolean debugRequests;
    private boolean distinctApiCalls;
    private final boolean fastEventParsing;
    private String httpUrl;
    private boolean isAnonymous;
    private final ChatLoggerConfig loggerConfig;
    private final NotificationConfig notificationConfig;
    private final boolean warmUp;
    private String wssUrl;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatApiConfig(String apiKey, String httpUrl, String cdnHttpUrl, String wssUrl, boolean z4, ChatLoggerConfig loggerConfig, boolean z13, NotificationConfig notificationConfig) {
        this(apiKey, httpUrl, cdnHttpUrl, wssUrl, z4, loggerConfig, false, z13, notificationConfig, false, 576, null);
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(httpUrl, "httpUrl");
        AbstractC22676k.m65750j(cdnHttpUrl, "cdnHttpUrl");
        AbstractC22676k.m65750j(wssUrl, "wssUrl");
        AbstractC22676k.m65750j(loggerConfig, "loggerConfig");
        AbstractC22676k.m65750j(notificationConfig, "notificationConfig");
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getCdnHttpUrl() {
        return this.cdnHttpUrl;
    }

    public final boolean getDebugRequests() {
        return this.debugRequests;
    }

    public final boolean getDistinctApiCalls() {
        return this.distinctApiCalls;
    }

    public final boolean getFastEventParsing() {
        return this.fastEventParsing;
    }

    public final String getHttpUrl() {
        return this.httpUrl;
    }

    public final ChatLoggerConfig getLoggerConfig() {
        return this.loggerConfig;
    }

    public final NotificationConfig getNotificationConfig() {
        return this.notificationConfig;
    }

    public final boolean getWarmUp() {
        return this.warmUp;
    }

    public final String getWssUrl() {
        return this.wssUrl;
    }

    /* JADX INFO: renamed from: isAnonymous, reason: from getter */
    public final boolean getIsAnonymous() {
        return this.isAnonymous;
    }

    public final void setAnonymous(boolean z4) {
        this.isAnonymous = z4;
    }

    public final void setCdnHttpUrl(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.cdnHttpUrl = str;
    }

    public final void setDistinctApiCalls(boolean z4) {
        this.distinctApiCalls = z4;
    }

    public final void setHttpUrl(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.httpUrl = str;
    }

    public final void setWssUrl(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.wssUrl = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatApiConfig(String apiKey, String httpUrl, String cdnHttpUrl, String wssUrl, boolean z4, ChatLoggerConfig loggerConfig, boolean z13, boolean z14, NotificationConfig notificationConfig) {
        this(apiKey, httpUrl, cdnHttpUrl, wssUrl, z4, loggerConfig, z13, z14, notificationConfig, false, 512, null);
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(httpUrl, "httpUrl");
        AbstractC22676k.m65750j(cdnHttpUrl, "cdnHttpUrl");
        AbstractC22676k.m65750j(wssUrl, "wssUrl");
        AbstractC22676k.m65750j(loggerConfig, "loggerConfig");
        AbstractC22676k.m65750j(notificationConfig, "notificationConfig");
    }

    public ChatApiConfig(String apiKey, String httpUrl, String cdnHttpUrl, String wssUrl, boolean z4, ChatLoggerConfig loggerConfig, boolean z13, boolean z14, NotificationConfig notificationConfig, boolean z15) {
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(httpUrl, "httpUrl");
        AbstractC22676k.m65750j(cdnHttpUrl, "cdnHttpUrl");
        AbstractC22676k.m65750j(wssUrl, "wssUrl");
        AbstractC22676k.m65750j(loggerConfig, "loggerConfig");
        AbstractC22676k.m65750j(notificationConfig, "notificationConfig");
        this.apiKey = apiKey;
        this.httpUrl = httpUrl;
        this.cdnHttpUrl = cdnHttpUrl;
        this.wssUrl = wssUrl;
        this.warmUp = z4;
        this.loggerConfig = loggerConfig;
        this.distinctApiCalls = z13;
        this.debugRequests = z14;
        this.notificationConfig = notificationConfig;
        this.fastEventParsing = z15;
    }

    public /* synthetic */ ChatApiConfig(String str, String str2, String str3, String str4, boolean z4, ChatLoggerConfig chatLoggerConfig, boolean z13, boolean z14, NotificationConfig notificationConfig, boolean z15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z4, chatLoggerConfig, (i13 & 64) != 0 ? true : z13, z14, notificationConfig, (i13 & 512) != 0 ? false : z15);
    }
}
