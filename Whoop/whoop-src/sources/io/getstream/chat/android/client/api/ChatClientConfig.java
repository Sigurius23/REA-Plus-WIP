package io.getstream.chat.android.client.api;

import androidx.core.app.FrameMetricsAggregator;
import c93.InterfaceC4339a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.models.TimeDuration;
import java.util.Set;
import m83.C25235a0;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p710im1.C18681l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001Bo\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0015J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0015Jv\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b0\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b\b\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b7\u0010\u0015R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b8\u0010\u0015¨\u00069"}, m65681d2 = {"Lio/getstream/chat/android/client/api/ChatClientConfig;", "", "", "offlineEnabled", "", "", "ignoredOfflineChannelTypes", "userPresence", "isAutomaticSyncOnReconnectEnabled", "Lio/getstream/chat/android/models/TimeDuration;", "syncMaxThreshold", "Lkotlin/Function0;", "", "now", "Lio/getstream/chat/android/client/api/MessageLimitConfig;", "messageLimitConfig", "useLegacyChannelLogic", "fastEventParsing", "<init>", "(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZ)V", "component1", "()Z", "component2", "()Ljava/util/Set;", "component3", "component4", "component5", "()Lio/getstream/chat/android/models/TimeDuration;", "component6", "()Lc93/a;", "component7", "()Lio/getstream/chat/android/client/api/MessageLimitConfig;", "component8", "component9", "copy", "(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZ)Lio/getstream/chat/android/client/api/ChatClientConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getOfflineEnabled", "Ljava/util/Set;", "getIgnoredOfflineChannelTypes", "getUserPresence", "Lio/getstream/chat/android/models/TimeDuration;", "getSyncMaxThreshold", "Lc93/a;", "getNow", "Lio/getstream/chat/android/client/api/MessageLimitConfig;", "getMessageLimitConfig", "getUseLegacyChannelLogic", "getFastEventParsing", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChatClientConfig {
    private final boolean fastEventParsing;
    private final Set<String> ignoredOfflineChannelTypes;
    private final boolean isAutomaticSyncOnReconnectEnabled;
    private final MessageLimitConfig messageLimitConfig;
    private final InterfaceC4339a now;
    private final boolean offlineEnabled;
    private final TimeDuration syncMaxThreshold;
    private final boolean useLegacyChannelLogic;
    private final boolean userPresence;

    public ChatClientConfig() {
        this(false, null, false, false, null, null, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatClientConfig copy$default(ChatClientConfig chatClientConfig, boolean z4, Set set, boolean z13, boolean z14, TimeDuration timeDuration, InterfaceC4339a interfaceC4339a, MessageLimitConfig messageLimitConfig, boolean z15, boolean z16, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = chatClientConfig.offlineEnabled;
        }
        if ((i13 & 2) != 0) {
            set = chatClientConfig.ignoredOfflineChannelTypes;
        }
        if ((i13 & 4) != 0) {
            z13 = chatClientConfig.userPresence;
        }
        if ((i13 & 8) != 0) {
            z14 = chatClientConfig.isAutomaticSyncOnReconnectEnabled;
        }
        if ((i13 & 16) != 0) {
            timeDuration = chatClientConfig.syncMaxThreshold;
        }
        if ((i13 & 32) != 0) {
            interfaceC4339a = chatClientConfig.now;
        }
        if ((i13 & 64) != 0) {
            messageLimitConfig = chatClientConfig.messageLimitConfig;
        }
        if ((i13 & 128) != 0) {
            z15 = chatClientConfig.useLegacyChannelLogic;
        }
        if ((i13 & 256) != 0) {
            z16 = chatClientConfig.fastEventParsing;
        }
        boolean z17 = z15;
        boolean z18 = z16;
        InterfaceC4339a interfaceC4339a2 = interfaceC4339a;
        MessageLimitConfig messageLimitConfig2 = messageLimitConfig;
        TimeDuration timeDuration2 = timeDuration;
        boolean z19 = z13;
        return chatClientConfig.copy(z4, set, z19, z14, timeDuration2, interfaceC4339a2, messageLimitConfig2, z17, z18);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getOfflineEnabled() {
        return this.offlineEnabled;
    }

    public final Set<String> component2() {
        return this.ignoredOfflineChannelTypes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getUserPresence() {
        return this.userPresence;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsAutomaticSyncOnReconnectEnabled() {
        return this.isAutomaticSyncOnReconnectEnabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TimeDuration getSyncMaxThreshold() {
        return this.syncMaxThreshold;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final InterfaceC4339a getNow() {
        return this.now;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final MessageLimitConfig getMessageLimitConfig() {
        return this.messageLimitConfig;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getUseLegacyChannelLogic() {
        return this.useLegacyChannelLogic;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getFastEventParsing() {
        return this.fastEventParsing;
    }

    public final ChatClientConfig copy(boolean offlineEnabled, Set<String> ignoredOfflineChannelTypes, boolean userPresence, boolean isAutomaticSyncOnReconnectEnabled, TimeDuration syncMaxThreshold, InterfaceC4339a now, MessageLimitConfig messageLimitConfig, boolean useLegacyChannelLogic, boolean fastEventParsing) {
        AbstractC22676k.m65750j(ignoredOfflineChannelTypes, "ignoredOfflineChannelTypes");
        AbstractC22676k.m65750j(syncMaxThreshold, "syncMaxThreshold");
        AbstractC22676k.m65750j(now, "now");
        AbstractC22676k.m65750j(messageLimitConfig, "messageLimitConfig");
        return new ChatClientConfig(offlineEnabled, ignoredOfflineChannelTypes, userPresence, isAutomaticSyncOnReconnectEnabled, syncMaxThreshold, now, messageLimitConfig, useLegacyChannelLogic, fastEventParsing);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatClientConfig)) {
            return false;
        }
        ChatClientConfig chatClientConfig = (ChatClientConfig) other;
        return this.offlineEnabled == chatClientConfig.offlineEnabled && AbstractC22676k.m65745e(this.ignoredOfflineChannelTypes, chatClientConfig.ignoredOfflineChannelTypes) && this.userPresence == chatClientConfig.userPresence && this.isAutomaticSyncOnReconnectEnabled == chatClientConfig.isAutomaticSyncOnReconnectEnabled && AbstractC22676k.m65745e(this.syncMaxThreshold, chatClientConfig.syncMaxThreshold) && AbstractC22676k.m65745e(this.now, chatClientConfig.now) && AbstractC22676k.m65745e(this.messageLimitConfig, chatClientConfig.messageLimitConfig) && this.useLegacyChannelLogic == chatClientConfig.useLegacyChannelLogic && this.fastEventParsing == chatClientConfig.fastEventParsing;
    }

    public final boolean getFastEventParsing() {
        return this.fastEventParsing;
    }

    public final Set<String> getIgnoredOfflineChannelTypes() {
        return this.ignoredOfflineChannelTypes;
    }

    public final MessageLimitConfig getMessageLimitConfig() {
        return this.messageLimitConfig;
    }

    public final InterfaceC4339a getNow() {
        return this.now;
    }

    public final boolean getOfflineEnabled() {
        return this.offlineEnabled;
    }

    public final TimeDuration getSyncMaxThreshold() {
        return this.syncMaxThreshold;
    }

    public final boolean getUseLegacyChannelLogic() {
        return this.useLegacyChannelLogic;
    }

    public final boolean getUserPresence() {
        return this.userPresence;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.fastEventParsing) + AbstractC2875y.m8289b((this.messageLimitConfig.hashCode() + AbstractC30802r.m94755d((this.syncMaxThreshold.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC25012a.m73368a(this.ignoredOfflineChannelTypes, Boolean.hashCode(this.offlineEnabled) * 31, 31), 31, this.userPresence), 31, this.isAutomaticSyncOnReconnectEnabled)) * 31, 31, this.now)) * 31, 31, this.useLegacyChannelLogic);
    }

    public final boolean isAutomaticSyncOnReconnectEnabled() {
        return this.isAutomaticSyncOnReconnectEnabled;
    }

    public final String toString() {
        boolean z4 = this.offlineEnabled;
        Set<String> set = this.ignoredOfflineChannelTypes;
        boolean z13 = this.userPresence;
        boolean z14 = this.isAutomaticSyncOnReconnectEnabled;
        TimeDuration timeDuration = this.syncMaxThreshold;
        InterfaceC4339a interfaceC4339a = this.now;
        MessageLimitConfig messageLimitConfig = this.messageLimitConfig;
        boolean z15 = this.useLegacyChannelLogic;
        boolean z16 = this.fastEventParsing;
        StringBuilder sb4 = new StringBuilder("ChatClientConfig(offlineEnabled=");
        sb4.append(z4);
        sb4.append(", ignoredOfflineChannelTypes=");
        sb4.append(set);
        sb4.append(", userPresence=");
        AbstractC38963t7.m124392v(sb4, z13, ", isAutomaticSyncOnReconnectEnabled=", z14, ", syncMaxThreshold=");
        sb4.append(timeDuration);
        sb4.append(", now=");
        sb4.append(interfaceC4339a);
        sb4.append(", messageLimitConfig=");
        sb4.append(messageLimitConfig);
        sb4.append(", useLegacyChannelLogic=");
        sb4.append(z15);
        sb4.append(", fastEventParsing=");
        return AbstractC18489d0.m53372m(sb4, z16, ")");
    }

    public ChatClientConfig(boolean z4) {
        this(z4, null, false, false, null, null, null, false, false, 510, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatClientConfig(boolean z4, Set<String> ignoredOfflineChannelTypes) {
        this(z4, ignoredOfflineChannelTypes, false, false, null, null, null, false, false, 508, null);
        AbstractC22676k.m65750j(ignoredOfflineChannelTypes, "ignoredOfflineChannelTypes");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatClientConfig(boolean z4, Set<String> ignoredOfflineChannelTypes, boolean z13) {
        this(z4, ignoredOfflineChannelTypes, z13, false, null, null, null, false, false, 504, null);
        AbstractC22676k.m65750j(ignoredOfflineChannelTypes, "ignoredOfflineChannelTypes");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatClientConfig(boolean z4, Set<String> ignoredOfflineChannelTypes, boolean z13, boolean z14) {
        this(z4, ignoredOfflineChannelTypes, z13, z14, null, null, null, false, false, 496, null);
        AbstractC22676k.m65750j(ignoredOfflineChannelTypes, "ignoredOfflineChannelTypes");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatClientConfig(boolean z4, Set<String> ignoredOfflineChannelTypes, boolean z13, boolean z14, TimeDuration syncMaxThreshold) {
        this(z4, ignoredOfflineChannelTypes, z13, z14, syncMaxThreshold, null, null, false, false, 480, null);
        AbstractC22676k.m65750j(ignoredOfflineChannelTypes, "ignoredOfflineChannelTypes");
        AbstractC22676k.m65750j(syncMaxThreshold, "syncMaxThreshold");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatClientConfig(boolean z4, Set<String> ignoredOfflineChannelTypes, boolean z13, boolean z14, TimeDuration syncMaxThreshold, InterfaceC4339a now) {
        this(z4, ignoredOfflineChannelTypes, z13, z14, syncMaxThreshold, now, null, false, false, 448, null);
        AbstractC22676k.m65750j(ignoredOfflineChannelTypes, "ignoredOfflineChannelTypes");
        AbstractC22676k.m65750j(syncMaxThreshold, "syncMaxThreshold");
        AbstractC22676k.m65750j(now, "now");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatClientConfig(boolean z4, Set<String> ignoredOfflineChannelTypes, boolean z13, boolean z14, TimeDuration syncMaxThreshold, InterfaceC4339a now, MessageLimitConfig messageLimitConfig) {
        this(z4, ignoredOfflineChannelTypes, z13, z14, syncMaxThreshold, now, messageLimitConfig, false, false, 384, null);
        AbstractC22676k.m65750j(ignoredOfflineChannelTypes, "ignoredOfflineChannelTypes");
        AbstractC22676k.m65750j(syncMaxThreshold, "syncMaxThreshold");
        AbstractC22676k.m65750j(now, "now");
        AbstractC22676k.m65750j(messageLimitConfig, "messageLimitConfig");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatClientConfig(boolean z4, Set<String> ignoredOfflineChannelTypes, boolean z13, boolean z14, TimeDuration syncMaxThreshold, InterfaceC4339a now, MessageLimitConfig messageLimitConfig, boolean z15) {
        this(z4, ignoredOfflineChannelTypes, z13, z14, syncMaxThreshold, now, messageLimitConfig, z15, false, 256, null);
        AbstractC22676k.m65750j(ignoredOfflineChannelTypes, "ignoredOfflineChannelTypes");
        AbstractC22676k.m65750j(syncMaxThreshold, "syncMaxThreshold");
        AbstractC22676k.m65750j(now, "now");
        AbstractC22676k.m65750j(messageLimitConfig, "messageLimitConfig");
    }

    public ChatClientConfig(boolean z4, Set<String> ignoredOfflineChannelTypes, boolean z13, boolean z14, TimeDuration syncMaxThreshold, InterfaceC4339a now, MessageLimitConfig messageLimitConfig, boolean z15, boolean z16) {
        AbstractC22676k.m65750j(ignoredOfflineChannelTypes, "ignoredOfflineChannelTypes");
        AbstractC22676k.m65750j(syncMaxThreshold, "syncMaxThreshold");
        AbstractC22676k.m65750j(now, "now");
        AbstractC22676k.m65750j(messageLimitConfig, "messageLimitConfig");
        this.offlineEnabled = z4;
        this.ignoredOfflineChannelTypes = ignoredOfflineChannelTypes;
        this.userPresence = z13;
        this.isAutomaticSyncOnReconnectEnabled = z14;
        this.syncMaxThreshold = syncMaxThreshold;
        this.now = now;
        this.messageLimitConfig = messageLimitConfig;
        this.useLegacyChannelLogic = z15;
        this.fastEventParsing = z16;
    }

    public /* synthetic */ ChatClientConfig(boolean z4, Set set, boolean z13, boolean z14, TimeDuration timeDuration, InterfaceC4339a interfaceC4339a, MessageLimitConfig messageLimitConfig, boolean z15, boolean z16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? C25235a0.f99113w : set, (i13 & 4) != 0 ? true : z13, (i13 & 8) != 0 ? true : z14, (i13 & 16) != 0 ? TimeDuration.INSTANCE.hours(12) : timeDuration, (i13 & 32) != 0 ? new C18681l0(6) : interfaceC4339a, (i13 & 64) != 0 ? new MessageLimitConfig(null, null, 3, null) : messageLimitConfig, (i13 & 128) != 0 ? false : z15, (i13 & 256) != 0 ? false : z16);
    }
}
