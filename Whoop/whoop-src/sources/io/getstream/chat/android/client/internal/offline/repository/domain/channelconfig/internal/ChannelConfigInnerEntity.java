package io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal;

import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import ih0.AbstractC18489d0;
import java.util.Date;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b8\b\u0081\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\u0006\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\tHÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\t\u0010?\u001a\u00020\tHÆ\u0003J\t\u0010@\u001a\u00020\tHÆ\u0003J\t\u0010A\u001a\u00020\tHÆ\u0003J\t\u0010B\u001a\u00020\tHÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0017HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\tHÆ\u0003J\t\u0010I\u001a\u00020\tHÆ\u0003Jó\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\tHÆ\u0001J\u0013\u0010K\u001a\u00020\t2\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020\u0017HÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010%R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010%R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010%R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010%R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010%R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010%R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010%R\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0011\u0010\u0014\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0011\u0010\u001b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0011\u0010\u001c\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%¨\u0006O"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;", "", "channelType", "", "createdAt", "Ljava/util/Date;", "updatedAt", "name", "isTypingEvents", "", "isReadEvents", "deliveryEventsEnabled", "isConnectEvents", "isSearch", "isReactionsEnabled", "isThreadEnabled", "isMutes", "uploadsEnabled", "urlEnrichmentEnabled", "customEventsEnabled", "pushNotificationsEnabled", "messageRetention", "maxMessageLength", "", "automod", "automodBehavior", "blocklistBehavior", "messageRemindersEnabled", "markMessagesPending", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getChannelType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getName", "()Z", "getDeliveryEventsEnabled", "getUploadsEnabled", "getUrlEnrichmentEnabled", "getCustomEventsEnabled", "getPushNotificationsEnabled", "getMessageRetention", "getMaxMessageLength", "()I", "getAutomod", "getAutomodBehavior", "getBlocklistBehavior", "getMessageRemindersEnabled", "getMarkMessagesPending", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelConfigInnerEntity {
    private final String automod;
    private final String automodBehavior;
    private final String blocklistBehavior;
    private final String channelType;
    private final Date createdAt;
    private final boolean customEventsEnabled;
    private final boolean deliveryEventsEnabled;
    private final boolean isConnectEvents;
    private final boolean isMutes;
    private final boolean isReactionsEnabled;
    private final boolean isReadEvents;
    private final boolean isSearch;
    private final boolean isThreadEnabled;
    private final boolean isTypingEvents;
    private final boolean markMessagesPending;
    private final int maxMessageLength;
    private final boolean messageRemindersEnabled;
    private final String messageRetention;
    private final String name;
    private final boolean pushNotificationsEnabled;
    private final Date updatedAt;
    private final boolean uploadsEnabled;
    private final boolean urlEnrichmentEnabled;

    public ChannelConfigInnerEntity(String channelType, Date date, Date date2, String name, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, String messageRetention, int i13, String automod, String automodBehavior, String blocklistBehavior, boolean z28, boolean z29) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(messageRetention, "messageRetention");
        AbstractC22676k.m65750j(automod, "automod");
        AbstractC22676k.m65750j(automodBehavior, "automodBehavior");
        AbstractC22676k.m65750j(blocklistBehavior, "blocklistBehavior");
        this.channelType = channelType;
        this.createdAt = date;
        this.updatedAt = date2;
        this.name = name;
        this.isTypingEvents = z4;
        this.isReadEvents = z13;
        this.deliveryEventsEnabled = z14;
        this.isConnectEvents = z15;
        this.isSearch = z16;
        this.isReactionsEnabled = z17;
        this.isThreadEnabled = z18;
        this.isMutes = z19;
        this.uploadsEnabled = z24;
        this.urlEnrichmentEnabled = z25;
        this.customEventsEnabled = z26;
        this.pushNotificationsEnabled = z27;
        this.messageRetention = messageRetention;
        this.maxMessageLength = i13;
        this.automod = automod;
        this.automodBehavior = automodBehavior;
        this.blocklistBehavior = blocklistBehavior;
        this.messageRemindersEnabled = z28;
        this.markMessagesPending = z29;
    }

    public static /* synthetic */ ChannelConfigInnerEntity copy$default(ChannelConfigInnerEntity channelConfigInnerEntity, String str, Date date, Date date2, String str2, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, String str3, int i13, String str4, String str5, String str6, boolean z28, boolean z29, int i14, Object obj) {
        boolean z34;
        boolean z35;
        String str7 = (i14 & 1) != 0 ? channelConfigInnerEntity.channelType : str;
        Date date3 = (i14 & 2) != 0 ? channelConfigInnerEntity.createdAt : date;
        Date date4 = (i14 & 4) != 0 ? channelConfigInnerEntity.updatedAt : date2;
        String str8 = (i14 & 8) != 0 ? channelConfigInnerEntity.name : str2;
        boolean z36 = (i14 & 16) != 0 ? channelConfigInnerEntity.isTypingEvents : z4;
        boolean z37 = (i14 & 32) != 0 ? channelConfigInnerEntity.isReadEvents : z13;
        boolean z38 = (i14 & 64) != 0 ? channelConfigInnerEntity.deliveryEventsEnabled : z14;
        boolean z39 = (i14 & 128) != 0 ? channelConfigInnerEntity.isConnectEvents : z15;
        boolean z44 = (i14 & 256) != 0 ? channelConfigInnerEntity.isSearch : z16;
        boolean z45 = (i14 & 512) != 0 ? channelConfigInnerEntity.isReactionsEnabled : z17;
        boolean z46 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? channelConfigInnerEntity.isThreadEnabled : z18;
        boolean z47 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? channelConfigInnerEntity.isMutes : z19;
        boolean z48 = (i14 & 4096) != 0 ? channelConfigInnerEntity.uploadsEnabled : z24;
        boolean z49 = (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? channelConfigInnerEntity.urlEnrichmentEnabled : z25;
        String str9 = str7;
        boolean z52 = (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? channelConfigInnerEntity.customEventsEnabled : z26;
        boolean z54 = (i14 & 32768) != 0 ? channelConfigInnerEntity.pushNotificationsEnabled : z27;
        String str10 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? channelConfigInnerEntity.messageRetention : str3;
        int i15 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? channelConfigInnerEntity.maxMessageLength : i13;
        String str11 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? channelConfigInnerEntity.automod : str4;
        String str12 = (i14 & 524288) != 0 ? channelConfigInnerEntity.automodBehavior : str5;
        String str13 = (i14 & 1048576) != 0 ? channelConfigInnerEntity.blocklistBehavior : str6;
        boolean z55 = (i14 & 2097152) != 0 ? channelConfigInnerEntity.messageRemindersEnabled : z28;
        if ((i14 & 4194304) != 0) {
            z35 = z55;
            z34 = channelConfigInnerEntity.markMessagesPending;
        } else {
            z34 = z29;
            z35 = z55;
        }
        return channelConfigInnerEntity.copy(str9, date3, date4, str8, z36, z37, z38, z39, z44, z45, z46, z47, z48, z49, z52, z54, str10, i15, str11, str12, str13, z35, z34);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsReactionsEnabled() {
        return this.isReactionsEnabled;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsThreadEnabled() {
        return this.isThreadEnabled;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsMutes() {
        return this.isMutes;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getUploadsEnabled() {
        return this.uploadsEnabled;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getUrlEnrichmentEnabled() {
        return this.urlEnrichmentEnabled;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getCustomEventsEnabled() {
        return this.customEventsEnabled;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getPushNotificationsEnabled() {
        return this.pushNotificationsEnabled;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getMessageRetention() {
        return this.messageRetention;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getMaxMessageLength() {
        return this.maxMessageLength;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getAutomod() {
        return this.automod;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getAutomodBehavior() {
        return this.automodBehavior;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getBlocklistBehavior() {
        return this.blocklistBehavior;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getMessageRemindersEnabled() {
        return this.messageRemindersEnabled;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getMarkMessagesPending() {
        return this.markMessagesPending;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsTypingEvents() {
        return this.isTypingEvents;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsReadEvents() {
        return this.isReadEvents;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getDeliveryEventsEnabled() {
        return this.deliveryEventsEnabled;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsConnectEvents() {
        return this.isConnectEvents;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsSearch() {
        return this.isSearch;
    }

    public final ChannelConfigInnerEntity copy(String channelType, Date createdAt, Date updatedAt, String name, boolean isTypingEvents, boolean isReadEvents, boolean deliveryEventsEnabled, boolean isConnectEvents, boolean isSearch, boolean isReactionsEnabled, boolean isThreadEnabled, boolean isMutes, boolean uploadsEnabled, boolean urlEnrichmentEnabled, boolean customEventsEnabled, boolean pushNotificationsEnabled, String messageRetention, int maxMessageLength, String automod, String automodBehavior, String blocklistBehavior, boolean messageRemindersEnabled, boolean markMessagesPending) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(messageRetention, "messageRetention");
        AbstractC22676k.m65750j(automod, "automod");
        AbstractC22676k.m65750j(automodBehavior, "automodBehavior");
        AbstractC22676k.m65750j(blocklistBehavior, "blocklistBehavior");
        return new ChannelConfigInnerEntity(channelType, createdAt, updatedAt, name, isTypingEvents, isReadEvents, deliveryEventsEnabled, isConnectEvents, isSearch, isReactionsEnabled, isThreadEnabled, isMutes, uploadsEnabled, urlEnrichmentEnabled, customEventsEnabled, pushNotificationsEnabled, messageRetention, maxMessageLength, automod, automodBehavior, blocklistBehavior, messageRemindersEnabled, markMessagesPending);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelConfigInnerEntity)) {
            return false;
        }
        ChannelConfigInnerEntity channelConfigInnerEntity = (ChannelConfigInnerEntity) other;
        return AbstractC22676k.m65745e(this.channelType, channelConfigInnerEntity.channelType) && AbstractC22676k.m65745e(this.createdAt, channelConfigInnerEntity.createdAt) && AbstractC22676k.m65745e(this.updatedAt, channelConfigInnerEntity.updatedAt) && AbstractC22676k.m65745e(this.name, channelConfigInnerEntity.name) && this.isTypingEvents == channelConfigInnerEntity.isTypingEvents && this.isReadEvents == channelConfigInnerEntity.isReadEvents && this.deliveryEventsEnabled == channelConfigInnerEntity.deliveryEventsEnabled && this.isConnectEvents == channelConfigInnerEntity.isConnectEvents && this.isSearch == channelConfigInnerEntity.isSearch && this.isReactionsEnabled == channelConfigInnerEntity.isReactionsEnabled && this.isThreadEnabled == channelConfigInnerEntity.isThreadEnabled && this.isMutes == channelConfigInnerEntity.isMutes && this.uploadsEnabled == channelConfigInnerEntity.uploadsEnabled && this.urlEnrichmentEnabled == channelConfigInnerEntity.urlEnrichmentEnabled && this.customEventsEnabled == channelConfigInnerEntity.customEventsEnabled && this.pushNotificationsEnabled == channelConfigInnerEntity.pushNotificationsEnabled && AbstractC22676k.m65745e(this.messageRetention, channelConfigInnerEntity.messageRetention) && this.maxMessageLength == channelConfigInnerEntity.maxMessageLength && AbstractC22676k.m65745e(this.automod, channelConfigInnerEntity.automod) && AbstractC22676k.m65745e(this.automodBehavior, channelConfigInnerEntity.automodBehavior) && AbstractC22676k.m65745e(this.blocklistBehavior, channelConfigInnerEntity.blocklistBehavior) && this.messageRemindersEnabled == channelConfigInnerEntity.messageRemindersEnabled && this.markMessagesPending == channelConfigInnerEntity.markMessagesPending;
    }

    public final String getAutomod() {
        return this.automod;
    }

    public final String getAutomodBehavior() {
        return this.automodBehavior;
    }

    public final String getBlocklistBehavior() {
        return this.blocklistBehavior;
    }

    public final String getChannelType() {
        return this.channelType;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final boolean getCustomEventsEnabled() {
        return this.customEventsEnabled;
    }

    public final boolean getDeliveryEventsEnabled() {
        return this.deliveryEventsEnabled;
    }

    public final boolean getMarkMessagesPending() {
        return this.markMessagesPending;
    }

    public final int getMaxMessageLength() {
        return this.maxMessageLength;
    }

    public final boolean getMessageRemindersEnabled() {
        return this.messageRemindersEnabled;
    }

    public final String getMessageRetention() {
        return this.messageRetention;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getPushNotificationsEnabled() {
        return this.pushNotificationsEnabled;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final boolean getUploadsEnabled() {
        return this.uploadsEnabled;
    }

    public final boolean getUrlEnrichmentEnabled() {
        return this.urlEnrichmentEnabled;
    }

    public final int hashCode() {
        int iHashCode = this.channelType.hashCode() * 31;
        Date date = this.createdAt;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.updatedAt;
        return Boolean.hashCode(this.markMessagesPending) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.maxMessageLength, AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d((iHashCode2 + (date2 != null ? date2.hashCode() : 0)) * 31, 31, this.name), 31, this.isTypingEvents), 31, this.isReadEvents), 31, this.deliveryEventsEnabled), 31, this.isConnectEvents), 31, this.isSearch), 31, this.isReactionsEnabled), 31, this.isThreadEnabled), 31, this.isMutes), 31, this.uploadsEnabled), 31, this.urlEnrichmentEnabled), 31, this.customEventsEnabled), 31, this.pushNotificationsEnabled), 31, this.messageRetention), 31), 31, this.automod), 31, this.automodBehavior), 31, this.blocklistBehavior), 31, this.messageRemindersEnabled);
    }

    public final boolean isConnectEvents() {
        return this.isConnectEvents;
    }

    public final boolean isMutes() {
        return this.isMutes;
    }

    public final boolean isReactionsEnabled() {
        return this.isReactionsEnabled;
    }

    public final boolean isReadEvents() {
        return this.isReadEvents;
    }

    public final boolean isSearch() {
        return this.isSearch;
    }

    public final boolean isThreadEnabled() {
        return this.isThreadEnabled;
    }

    public final boolean isTypingEvents() {
        return this.isTypingEvents;
    }

    public final String toString() {
        String str = this.channelType;
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        String str2 = this.name;
        boolean z4 = this.isTypingEvents;
        boolean z13 = this.isReadEvents;
        boolean z14 = this.deliveryEventsEnabled;
        boolean z15 = this.isConnectEvents;
        boolean z16 = this.isSearch;
        boolean z17 = this.isReactionsEnabled;
        boolean z18 = this.isThreadEnabled;
        boolean z19 = this.isMutes;
        boolean z24 = this.uploadsEnabled;
        boolean z25 = this.urlEnrichmentEnabled;
        boolean z26 = this.customEventsEnabled;
        boolean z27 = this.pushNotificationsEnabled;
        String str3 = this.messageRetention;
        int i13 = this.maxMessageLength;
        String str4 = this.automod;
        String str5 = this.automodBehavior;
        String str6 = this.blocklistBehavior;
        boolean z28 = this.messageRemindersEnabled;
        boolean z29 = this.markMessagesPending;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("ChannelConfigInnerEntity(channelType=", str, ", createdAt=", date, ", updatedAt=");
        sbM11830n.append(date2);
        sbM11830n.append(", name=");
        sbM11830n.append(str2);
        sbM11830n.append(", isTypingEvents=");
        AbstractC38963t7.m124392v(sbM11830n, z4, ", isReadEvents=", z13, ", deliveryEventsEnabled=");
        AbstractC38963t7.m124392v(sbM11830n, z14, ", isConnectEvents=", z15, ", isSearch=");
        AbstractC38963t7.m124392v(sbM11830n, z16, ", isReactionsEnabled=", z17, ", isThreadEnabled=");
        AbstractC38963t7.m124392v(sbM11830n, z18, ", isMutes=", z19, ", uploadsEnabled=");
        AbstractC38963t7.m124392v(sbM11830n, z24, ", urlEnrichmentEnabled=", z25, ", customEventsEnabled=");
        AbstractC38963t7.m124392v(sbM11830n, z26, ", pushNotificationsEnabled=", z27, ", messageRetention=");
        AbstractC11266d.m30470x(i13, str3, ", maxMessageLength=", ", automod=", sbM11830n);
        AbstractC11266d.m30444B(sbM11830n, str4, ", automodBehavior=", str5, ", blocklistBehavior=");
        AbstractC38963t7.m124390t(sbM11830n, str6, ", messageRemindersEnabled=", z28, ", markMessagesPending=");
        return AbstractC18489d0.m53372m(sbM11830n, z29, ")");
    }
}
