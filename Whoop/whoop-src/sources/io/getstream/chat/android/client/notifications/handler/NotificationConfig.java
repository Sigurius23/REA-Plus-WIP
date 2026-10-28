package io.getstream.chat.android.client.notifications.handler;

import a13.C0148f;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.token.TokenProvider;
import java.util.List;
import m83.C25271y;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p710im1.C18689p0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Bo\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJv\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0014R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0016R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0018R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b/\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b0\u0010\u0012R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u0010\u001c¨\u00063"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;", "", "", "pushNotificationsEnabled", "Lkotlin/Function1;", "", "ignorePushMessageWhenUserOnline", "", "pushDeviceGenerators", "Lkotlin/Function0;", "shouldShowNotificationOnPush", "requestPermissionOnAppLaunch", "autoTranslationEnabled", "Lio/getstream/chat/android/client/token/TokenProvider;", "tokenProvider", "<init>", "(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;ZLio/getstream/chat/android/client/token/TokenProvider;)V", "component1", "()Z", "component2", "()Lkotlin/jvm/functions/Function1;", "component3", "()Ljava/util/List;", "component4", "()Lc93/a;", "component5", "component6", "component7", "()Lio/getstream/chat/android/client/token/TokenProvider;", "copy", "(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;ZLio/getstream/chat/android/client/token/TokenProvider;)Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getPushNotificationsEnabled", "Lkotlin/jvm/functions/Function1;", "getIgnorePushMessageWhenUserOnline", "Ljava/util/List;", "getPushDeviceGenerators", "Lc93/a;", "getShouldShowNotificationOnPush", "getRequestPermissionOnAppLaunch", "getAutoTranslationEnabled", "Lio/getstream/chat/android/client/token/TokenProvider;", "getTokenProvider", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class NotificationConfig {
    private final boolean autoTranslationEnabled;
    private final Function1 ignorePushMessageWhenUserOnline;
    private final List<Object> pushDeviceGenerators;
    private final boolean pushNotificationsEnabled;
    private final InterfaceC4339a requestPermissionOnAppLaunch;
    private final InterfaceC4339a shouldShowNotificationOnPush;
    private final TokenProvider tokenProvider;

    public NotificationConfig() {
        this(false, null, null, null, null, false, null, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(String type) {
        String str;
        AbstractC22676k.m65750j(type, "type");
        switch (type.hashCode()) {
            case -1717161893:
                str = "reaction.new";
                break;
            case -934872620:
                str = "message.updated";
                break;
            case -874236103:
                str = "message.new";
                break;
            case -701520694:
                return !type.equals("notification.reminder_due");
            default:
                return true;
        }
        type.equals(str);
        return true;
    }

    private static final boolean _init_$lambda$1() {
        return true;
    }

    private static final boolean _init_$lambda$2() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationConfig copy$default(NotificationConfig notificationConfig, boolean z4, Function1 function1, List list, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, boolean z13, TokenProvider tokenProvider, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = notificationConfig.pushNotificationsEnabled;
        }
        if ((i13 & 2) != 0) {
            function1 = notificationConfig.ignorePushMessageWhenUserOnline;
        }
        if ((i13 & 4) != 0) {
            list = notificationConfig.pushDeviceGenerators;
        }
        if ((i13 & 8) != 0) {
            interfaceC4339a = notificationConfig.shouldShowNotificationOnPush;
        }
        if ((i13 & 16) != 0) {
            interfaceC4339a2 = notificationConfig.requestPermissionOnAppLaunch;
        }
        if ((i13 & 32) != 0) {
            z13 = notificationConfig.autoTranslationEnabled;
        }
        if ((i13 & 64) != 0) {
            tokenProvider = notificationConfig.tokenProvider;
        }
        boolean z14 = z13;
        TokenProvider tokenProvider2 = tokenProvider;
        InterfaceC4339a interfaceC4339a3 = interfaceC4339a2;
        List list2 = list;
        return notificationConfig.copy(z4, function1, list2, interfaceC4339a, interfaceC4339a3, z14, tokenProvider2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getPushNotificationsEnabled() {
        return this.pushNotificationsEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Function1 getIgnorePushMessageWhenUserOnline() {
        return this.ignorePushMessageWhenUserOnline;
    }

    public final List<Object> component3() {
        return this.pushDeviceGenerators;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final InterfaceC4339a getShouldShowNotificationOnPush() {
        return this.shouldShowNotificationOnPush;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final InterfaceC4339a getRequestPermissionOnAppLaunch() {
        return this.requestPermissionOnAppLaunch;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getAutoTranslationEnabled() {
        return this.autoTranslationEnabled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TokenProvider getTokenProvider() {
        return this.tokenProvider;
    }

    public final NotificationConfig copy(boolean pushNotificationsEnabled, Function1 ignorePushMessageWhenUserOnline, List<Object> pushDeviceGenerators, InterfaceC4339a shouldShowNotificationOnPush, InterfaceC4339a requestPermissionOnAppLaunch, boolean autoTranslationEnabled, TokenProvider tokenProvider) {
        AbstractC22676k.m65750j(ignorePushMessageWhenUserOnline, "ignorePushMessageWhenUserOnline");
        AbstractC22676k.m65750j(pushDeviceGenerators, "pushDeviceGenerators");
        AbstractC22676k.m65750j(shouldShowNotificationOnPush, "shouldShowNotificationOnPush");
        AbstractC22676k.m65750j(requestPermissionOnAppLaunch, "requestPermissionOnAppLaunch");
        return new NotificationConfig(pushNotificationsEnabled, ignorePushMessageWhenUserOnline, pushDeviceGenerators, shouldShowNotificationOnPush, requestPermissionOnAppLaunch, autoTranslationEnabled, tokenProvider);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationConfig)) {
            return false;
        }
        NotificationConfig notificationConfig = (NotificationConfig) other;
        return this.pushNotificationsEnabled == notificationConfig.pushNotificationsEnabled && AbstractC22676k.m65745e(this.ignorePushMessageWhenUserOnline, notificationConfig.ignorePushMessageWhenUserOnline) && AbstractC22676k.m65745e(this.pushDeviceGenerators, notificationConfig.pushDeviceGenerators) && AbstractC22676k.m65745e(this.shouldShowNotificationOnPush, notificationConfig.shouldShowNotificationOnPush) && AbstractC22676k.m65745e(this.requestPermissionOnAppLaunch, notificationConfig.requestPermissionOnAppLaunch) && this.autoTranslationEnabled == notificationConfig.autoTranslationEnabled && AbstractC22676k.m65745e(this.tokenProvider, notificationConfig.tokenProvider);
    }

    public final boolean getAutoTranslationEnabled() {
        return this.autoTranslationEnabled;
    }

    public final Function1 getIgnorePushMessageWhenUserOnline() {
        return this.ignorePushMessageWhenUserOnline;
    }

    public final List<Object> getPushDeviceGenerators() {
        return this.pushDeviceGenerators;
    }

    public final boolean getPushNotificationsEnabled() {
        return this.pushNotificationsEnabled;
    }

    public final InterfaceC4339a getRequestPermissionOnAppLaunch() {
        return this.requestPermissionOnAppLaunch;
    }

    public final InterfaceC4339a getShouldShowNotificationOnPush() {
        return this.shouldShowNotificationOnPush;
    }

    public final TokenProvider getTokenProvider() {
        return this.tokenProvider;
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC30802r.m94755d(AbstractC30802r.m94755d(AbstractC11895b.m31983b(AbstractC30802r.m94756e(this.ignorePushMessageWhenUserOnline, Boolean.hashCode(this.pushNotificationsEnabled) * 31, 31), 31, this.pushDeviceGenerators), 31, this.shouldShowNotificationOnPush), 31, this.requestPermissionOnAppLaunch), 31, this.autoTranslationEnabled);
        TokenProvider tokenProvider = this.tokenProvider;
        return iM8289b + (tokenProvider == null ? 0 : tokenProvider.hashCode());
    }

    public final String toString() {
        return "NotificationConfig(pushNotificationsEnabled=" + this.pushNotificationsEnabled + ", ignorePushMessageWhenUserOnline=" + this.ignorePushMessageWhenUserOnline + ", pushDeviceGenerators=" + this.pushDeviceGenerators + ", shouldShowNotificationOnPush=" + this.shouldShowNotificationOnPush + ", requestPermissionOnAppLaunch=" + this.requestPermissionOnAppLaunch + ", autoTranslationEnabled=" + this.autoTranslationEnabled + ", tokenProvider=" + this.tokenProvider + ")";
    }

    public NotificationConfig(boolean z4) {
        this(z4, null, null, null, null, false, null, 126, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationConfig(boolean z4, Function1 ignorePushMessageWhenUserOnline) {
        this(z4, ignorePushMessageWhenUserOnline, null, null, null, false, null, 124, null);
        AbstractC22676k.m65750j(ignorePushMessageWhenUserOnline, "ignorePushMessageWhenUserOnline");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationConfig(boolean z4, Function1 ignorePushMessageWhenUserOnline, List<Object> pushDeviceGenerators) {
        this(z4, ignorePushMessageWhenUserOnline, pushDeviceGenerators, null, null, false, null, 120, null);
        AbstractC22676k.m65750j(ignorePushMessageWhenUserOnline, "ignorePushMessageWhenUserOnline");
        AbstractC22676k.m65750j(pushDeviceGenerators, "pushDeviceGenerators");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationConfig(boolean z4, Function1 ignorePushMessageWhenUserOnline, List<Object> pushDeviceGenerators, InterfaceC4339a shouldShowNotificationOnPush) {
        this(z4, ignorePushMessageWhenUserOnline, pushDeviceGenerators, shouldShowNotificationOnPush, null, false, null, 112, null);
        AbstractC22676k.m65750j(ignorePushMessageWhenUserOnline, "ignorePushMessageWhenUserOnline");
        AbstractC22676k.m65750j(pushDeviceGenerators, "pushDeviceGenerators");
        AbstractC22676k.m65750j(shouldShowNotificationOnPush, "shouldShowNotificationOnPush");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationConfig(boolean z4, Function1 ignorePushMessageWhenUserOnline, List<Object> pushDeviceGenerators, InterfaceC4339a shouldShowNotificationOnPush, InterfaceC4339a requestPermissionOnAppLaunch) {
        this(z4, ignorePushMessageWhenUserOnline, pushDeviceGenerators, shouldShowNotificationOnPush, requestPermissionOnAppLaunch, false, null, 96, null);
        AbstractC22676k.m65750j(ignorePushMessageWhenUserOnline, "ignorePushMessageWhenUserOnline");
        AbstractC22676k.m65750j(pushDeviceGenerators, "pushDeviceGenerators");
        AbstractC22676k.m65750j(shouldShowNotificationOnPush, "shouldShowNotificationOnPush");
        AbstractC22676k.m65750j(requestPermissionOnAppLaunch, "requestPermissionOnAppLaunch");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationConfig(boolean z4, Function1 ignorePushMessageWhenUserOnline, List<Object> pushDeviceGenerators, InterfaceC4339a shouldShowNotificationOnPush, InterfaceC4339a requestPermissionOnAppLaunch, boolean z13) {
        this(z4, ignorePushMessageWhenUserOnline, pushDeviceGenerators, shouldShowNotificationOnPush, requestPermissionOnAppLaunch, z13, null, 64, null);
        AbstractC22676k.m65750j(ignorePushMessageWhenUserOnline, "ignorePushMessageWhenUserOnline");
        AbstractC22676k.m65750j(pushDeviceGenerators, "pushDeviceGenerators");
        AbstractC22676k.m65750j(shouldShowNotificationOnPush, "shouldShowNotificationOnPush");
        AbstractC22676k.m65750j(requestPermissionOnAppLaunch, "requestPermissionOnAppLaunch");
    }

    public NotificationConfig(boolean z4, Function1 ignorePushMessageWhenUserOnline, List<Object> pushDeviceGenerators, InterfaceC4339a shouldShowNotificationOnPush, InterfaceC4339a requestPermissionOnAppLaunch, boolean z13, TokenProvider tokenProvider) {
        AbstractC22676k.m65750j(ignorePushMessageWhenUserOnline, "ignorePushMessageWhenUserOnline");
        AbstractC22676k.m65750j(pushDeviceGenerators, "pushDeviceGenerators");
        AbstractC22676k.m65750j(shouldShowNotificationOnPush, "shouldShowNotificationOnPush");
        AbstractC22676k.m65750j(requestPermissionOnAppLaunch, "requestPermissionOnAppLaunch");
        this.pushNotificationsEnabled = z4;
        this.ignorePushMessageWhenUserOnline = ignorePushMessageWhenUserOnline;
        this.pushDeviceGenerators = pushDeviceGenerators;
        this.shouldShowNotificationOnPush = shouldShowNotificationOnPush;
        this.requestPermissionOnAppLaunch = requestPermissionOnAppLaunch;
        this.autoTranslationEnabled = z13;
        this.tokenProvider = tokenProvider;
    }

    public /* synthetic */ NotificationConfig(boolean z4, Function1 function1, List list, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, boolean z13, TokenProvider tokenProvider, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? new C18689p0(13) : function1, (i13 & 4) != 0 ? C25271y.f99162w : list, (i13 & 8) != 0 ? new C0148f(7) : interfaceC4339a, (i13 & 16) != 0 ? new C0148f(7) : interfaceC4339a2, (i13 & 32) != 0 ? true : z13, (i13 & 64) != 0 ? null : tokenProvider);
    }
}
