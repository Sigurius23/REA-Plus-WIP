package io.getstream.chat.android.models;

import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import live.hms.video.error.ErrorCodes;
import live.hms.video.utils.AndroidSDKConstants;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bB\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\b\b\u0002\u0010 \u001a\u00020\b\u0012\b\b\u0002\u0010!\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0006HÆ\u0003J\t\u0010D\u001a\u00020\bHÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\t\u0010G\u001a\u00020\bHÆ\u0003J\t\u0010H\u001a\u00020\bHÆ\u0003J\t\u0010I\u001a\u00020\bHÆ\u0003J\t\u0010J\u001a\u00020\bHÆ\u0003J\t\u0010K\u001a\u00020\bHÆ\u0003J\t\u0010L\u001a\u00020\bHÆ\u0003J\t\u0010M\u001a\u00020\bHÆ\u0003J\t\u0010N\u001a\u00020\bHÆ\u0003J\t\u0010O\u001a\u00020\bHÆ\u0003J\t\u0010P\u001a\u00020\bHÆ\u0003J\t\u0010Q\u001a\u00020\bHÆ\u0003J\t\u0010R\u001a\u00020\u0006HÆ\u0003J\t\u0010S\u001a\u00020\u0018HÆ\u0003J\t\u0010T\u001a\u00020\u0006HÆ\u0003J\t\u0010U\u001a\u00020\u0006HÆ\u0003J\t\u0010V\u001a\u00020\u0006HÆ\u0003J\u000f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dHÆ\u0003J\t\u0010X\u001a\u00020\bHÆ\u0003J\t\u0010Y\u001a\u00020\bHÆ\u0003J\t\u0010Z\u001a\u00020\bHÆ\u0003J\u0097\u0002\u0010[\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\bHÆ\u0001J\u0013\u0010\\\u001a\u00020\b2\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010^\u001a\u00020\u0018HÖ\u0001J\t\u0010_\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010*R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010*R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010*R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010*R\u0011\u0010\u0014\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b5\u0010*R\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b6\u0010(R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0019\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b9\u0010(R\u0011\u0010\u001a\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b:\u0010(R\u0011\u0010\u001b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b;\u0010(R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u001f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b>\u0010*R\u0011\u0010 \u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b?\u0010*R\u0011\u0010!\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b@\u0010*¨\u0006`"}, m65681d2 = {"Lio/getstream/chat/android/models/Config;", "", "createdAt", "Ljava/util/Date;", "updatedAt", "name", "", "typingEventsEnabled", "", "readEventsEnabled", "deliveryEventsEnabled", "connectEventsEnabled", "searchEnabled", "isReactionsEnabled", "isThreadEnabled", "muteEnabled", "uploadsEnabled", "urlEnrichmentEnabled", "customEventsEnabled", "pushNotificationsEnabled", "skipLastMsgUpdateForSystemMsgs", "pollsEnabled", "messageRetention", "maxMessageLength", "", "automod", "automodBehavior", "blocklistBehavior", "commands", "", "Lio/getstream/chat/android/models/Command;", "messageRemindersEnabled", "sharedLocationsEnabled", "markMessagesPending", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZ)V", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getName", "()Ljava/lang/String;", "getTypingEventsEnabled", "()Z", "getReadEventsEnabled", "getDeliveryEventsEnabled", "getConnectEventsEnabled", "getSearchEnabled", "getMuteEnabled", "getUploadsEnabled", "getUrlEnrichmentEnabled", "getCustomEventsEnabled", "getPushNotificationsEnabled", "getSkipLastMsgUpdateForSystemMsgs", "getPollsEnabled", "getMessageRetention", "getMaxMessageLength", "()I", "getAutomod", "getAutomodBehavior", "getBlocklistBehavior", "getCommands", "()Ljava/util/List;", "getMessageRemindersEnabled", "getSharedLocationsEnabled", "getMarkMessagesPending", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "equals", "other", "hashCode", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class Config {
    private final String automod;
    private final String automodBehavior;
    private final String blocklistBehavior;
    private final List<Command> commands;
    private final boolean connectEventsEnabled;
    private final Date createdAt;
    private final boolean customEventsEnabled;
    private final boolean deliveryEventsEnabled;
    private final boolean isReactionsEnabled;
    private final boolean isThreadEnabled;
    private final boolean markMessagesPending;
    private final int maxMessageLength;
    private final boolean messageRemindersEnabled;
    private final String messageRetention;
    private final boolean muteEnabled;
    private final String name;
    private final boolean pollsEnabled;
    private final boolean pushNotificationsEnabled;
    private final boolean readEventsEnabled;
    private final boolean searchEnabled;
    private final boolean sharedLocationsEnabled;
    private final boolean skipLastMsgUpdateForSystemMsgs;
    private final boolean typingEventsEnabled;
    private final Date updatedAt;
    private final boolean uploadsEnabled;
    private final boolean urlEnrichmentEnabled;

    public Config() {
        this(null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, 0, null, null, null, null, false, false, false, 67108863, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Config copy$default(Config config, Date date, Date date2, String str, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, String str2, int i13, String str3, String str4, String str5, List list, boolean z34, boolean z35, boolean z36, int i14, Object obj) {
        boolean z37;
        boolean z38;
        Date date3 = (i14 & 1) != 0 ? config.createdAt : date;
        Date date4 = (i14 & 2) != 0 ? config.updatedAt : date2;
        String str6 = (i14 & 4) != 0 ? config.name : str;
        boolean z39 = (i14 & 8) != 0 ? config.typingEventsEnabled : z4;
        boolean z44 = (i14 & 16) != 0 ? config.readEventsEnabled : z13;
        boolean z45 = (i14 & 32) != 0 ? config.deliveryEventsEnabled : z14;
        boolean z46 = (i14 & 64) != 0 ? config.connectEventsEnabled : z15;
        boolean z47 = (i14 & 128) != 0 ? config.searchEnabled : z16;
        boolean z48 = (i14 & 256) != 0 ? config.isReactionsEnabled : z17;
        boolean z49 = (i14 & 512) != 0 ? config.isThreadEnabled : z18;
        boolean z52 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? config.muteEnabled : z19;
        boolean z54 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? config.uploadsEnabled : z24;
        boolean z55 = (i14 & 4096) != 0 ? config.urlEnrichmentEnabled : z25;
        boolean z56 = (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? config.customEventsEnabled : z26;
        Date date5 = date3;
        boolean z57 = (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? config.pushNotificationsEnabled : z27;
        boolean z58 = (i14 & 32768) != 0 ? config.skipLastMsgUpdateForSystemMsgs : z28;
        boolean z59 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? config.pollsEnabled : z29;
        String str7 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? config.messageRetention : str2;
        int i15 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? config.maxMessageLength : i13;
        String str8 = (i14 & 524288) != 0 ? config.automod : str3;
        String str9 = (i14 & 1048576) != 0 ? config.automodBehavior : str4;
        String str10 = (i14 & 2097152) != 0 ? config.blocklistBehavior : str5;
        List list2 = (i14 & 4194304) != 0 ? config.commands : list;
        boolean z60 = (i14 & 8388608) != 0 ? config.messageRemindersEnabled : z34;
        boolean z64 = (i14 & 16777216) != 0 ? config.sharedLocationsEnabled : z35;
        if ((i14 & AndroidSDKConstants.FLAG_MUTABLE) != 0) {
            z38 = z64;
            z37 = config.markMessagesPending;
        } else {
            z37 = z36;
            z38 = z64;
        }
        return config.copy(date5, date4, str6, z39, z44, z45, z46, z47, z48, z49, z52, z54, z55, z56, z57, z58, z59, str7, i15, str8, str9, str10, list2, z60, z38, z37);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsThreadEnabled() {
        return this.isThreadEnabled;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getMuteEnabled() {
        return this.muteEnabled;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getUploadsEnabled() {
        return this.uploadsEnabled;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getUrlEnrichmentEnabled() {
        return this.urlEnrichmentEnabled;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getCustomEventsEnabled() {
        return this.customEventsEnabled;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getPushNotificationsEnabled() {
        return this.pushNotificationsEnabled;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getSkipLastMsgUpdateForSystemMsgs() {
        return this.skipLastMsgUpdateForSystemMsgs;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getPollsEnabled() {
        return this.pollsEnabled;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getMessageRetention() {
        return this.messageRetention;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getMaxMessageLength() {
        return this.maxMessageLength;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getAutomod() {
        return this.automod;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getAutomodBehavior() {
        return this.automodBehavior;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getBlocklistBehavior() {
        return this.blocklistBehavior;
    }

    public final List<Command> component23() {
        return this.commands;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final boolean getMessageRemindersEnabled() {
        return this.messageRemindersEnabled;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final boolean getSharedLocationsEnabled() {
        return this.sharedLocationsEnabled;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getMarkMessagesPending() {
        return this.markMessagesPending;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getTypingEventsEnabled() {
        return this.typingEventsEnabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getReadEventsEnabled() {
        return this.readEventsEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getDeliveryEventsEnabled() {
        return this.deliveryEventsEnabled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getConnectEventsEnabled() {
        return this.connectEventsEnabled;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getSearchEnabled() {
        return this.searchEnabled;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsReactionsEnabled() {
        return this.isReactionsEnabled;
    }

    public final Config copy(Date createdAt, Date updatedAt, String name, boolean typingEventsEnabled, boolean readEventsEnabled, boolean deliveryEventsEnabled, boolean connectEventsEnabled, boolean searchEnabled, boolean isReactionsEnabled, boolean isThreadEnabled, boolean muteEnabled, boolean uploadsEnabled, boolean urlEnrichmentEnabled, boolean customEventsEnabled, boolean pushNotificationsEnabled, boolean skipLastMsgUpdateForSystemMsgs, boolean pollsEnabled, String messageRetention, int maxMessageLength, String automod, String automodBehavior, String blocklistBehavior, List<Command> commands, boolean messageRemindersEnabled, boolean sharedLocationsEnabled, boolean markMessagesPending) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(messageRetention, "messageRetention");
        AbstractC22676k.m65750j(automod, "automod");
        AbstractC22676k.m65750j(automodBehavior, "automodBehavior");
        AbstractC22676k.m65750j(blocklistBehavior, "blocklistBehavior");
        AbstractC22676k.m65750j(commands, "commands");
        return new Config(createdAt, updatedAt, name, typingEventsEnabled, readEventsEnabled, deliveryEventsEnabled, connectEventsEnabled, searchEnabled, isReactionsEnabled, isThreadEnabled, muteEnabled, uploadsEnabled, urlEnrichmentEnabled, customEventsEnabled, pushNotificationsEnabled, skipLastMsgUpdateForSystemMsgs, pollsEnabled, messageRetention, maxMessageLength, automod, automodBehavior, blocklistBehavior, commands, messageRemindersEnabled, sharedLocationsEnabled, markMessagesPending);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Config)) {
            return false;
        }
        Config config = (Config) other;
        return AbstractC22676k.m65745e(this.createdAt, config.createdAt) && AbstractC22676k.m65745e(this.updatedAt, config.updatedAt) && AbstractC22676k.m65745e(this.name, config.name) && this.typingEventsEnabled == config.typingEventsEnabled && this.readEventsEnabled == config.readEventsEnabled && this.deliveryEventsEnabled == config.deliveryEventsEnabled && this.connectEventsEnabled == config.connectEventsEnabled && this.searchEnabled == config.searchEnabled && this.isReactionsEnabled == config.isReactionsEnabled && this.isThreadEnabled == config.isThreadEnabled && this.muteEnabled == config.muteEnabled && this.uploadsEnabled == config.uploadsEnabled && this.urlEnrichmentEnabled == config.urlEnrichmentEnabled && this.customEventsEnabled == config.customEventsEnabled && this.pushNotificationsEnabled == config.pushNotificationsEnabled && this.skipLastMsgUpdateForSystemMsgs == config.skipLastMsgUpdateForSystemMsgs && this.pollsEnabled == config.pollsEnabled && AbstractC22676k.m65745e(this.messageRetention, config.messageRetention) && this.maxMessageLength == config.maxMessageLength && AbstractC22676k.m65745e(this.automod, config.automod) && AbstractC22676k.m65745e(this.automodBehavior, config.automodBehavior) && AbstractC22676k.m65745e(this.blocklistBehavior, config.blocklistBehavior) && AbstractC22676k.m65745e(this.commands, config.commands) && this.messageRemindersEnabled == config.messageRemindersEnabled && this.sharedLocationsEnabled == config.sharedLocationsEnabled && this.markMessagesPending == config.markMessagesPending;
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

    public final List<Command> getCommands() {
        return this.commands;
    }

    public final boolean getConnectEventsEnabled() {
        return this.connectEventsEnabled;
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

    public final boolean getMuteEnabled() {
        return this.muteEnabled;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getPollsEnabled() {
        return this.pollsEnabled;
    }

    public final boolean getPushNotificationsEnabled() {
        return this.pushNotificationsEnabled;
    }

    public final boolean getReadEventsEnabled() {
        return this.readEventsEnabled;
    }

    public final boolean getSearchEnabled() {
        return this.searchEnabled;
    }

    public final boolean getSharedLocationsEnabled() {
        return this.sharedLocationsEnabled;
    }

    public final boolean getSkipLastMsgUpdateForSystemMsgs() {
        return this.skipLastMsgUpdateForSystemMsgs;
    }

    public final boolean getTypingEventsEnabled() {
        return this.typingEventsEnabled;
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

    public int hashCode() {
        Date date = this.createdAt;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.updatedAt;
        return Boolean.hashCode(this.markMessagesPending) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.maxMessageLength, AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d((iHashCode + (date2 != null ? date2.hashCode() : 0)) * 31, 31, this.name), 31, this.typingEventsEnabled), 31, this.readEventsEnabled), 31, this.deliveryEventsEnabled), 31, this.connectEventsEnabled), 31, this.searchEnabled), 31, this.isReactionsEnabled), 31, this.isThreadEnabled), 31, this.muteEnabled), 31, this.uploadsEnabled), 31, this.urlEnrichmentEnabled), 31, this.customEventsEnabled), 31, this.pushNotificationsEnabled), 31, this.skipLastMsgUpdateForSystemMsgs), 31, this.pollsEnabled), 31, this.messageRetention), 31), 31, this.automod), 31, this.automodBehavior), 31, this.blocklistBehavior), 31, this.commands), 31, this.messageRemindersEnabled), 31, this.sharedLocationsEnabled);
    }

    public final boolean isReactionsEnabled() {
        return this.isReactionsEnabled;
    }

    public final boolean isThreadEnabled() {
        return this.isThreadEnabled;
    }

    public String toString() {
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        String str = this.name;
        boolean z4 = this.typingEventsEnabled;
        boolean z13 = this.readEventsEnabled;
        boolean z14 = this.deliveryEventsEnabled;
        boolean z15 = this.connectEventsEnabled;
        boolean z16 = this.searchEnabled;
        boolean z17 = this.isReactionsEnabled;
        boolean z18 = this.isThreadEnabled;
        boolean z19 = this.muteEnabled;
        boolean z24 = this.uploadsEnabled;
        boolean z25 = this.urlEnrichmentEnabled;
        boolean z26 = this.customEventsEnabled;
        boolean z27 = this.pushNotificationsEnabled;
        boolean z28 = this.skipLastMsgUpdateForSystemMsgs;
        boolean z29 = this.pollsEnabled;
        String str2 = this.messageRetention;
        int i13 = this.maxMessageLength;
        String str3 = this.automod;
        String str4 = this.automodBehavior;
        String str5 = this.blocklistBehavior;
        List<Command> list = this.commands;
        boolean z34 = this.messageRemindersEnabled;
        boolean z35 = this.sharedLocationsEnabled;
        boolean z36 = this.markMessagesPending;
        StringBuilder sb4 = new StringBuilder("Config(createdAt=");
        sb4.append(date);
        sb4.append(", updatedAt=");
        sb4.append(date2);
        sb4.append(", name=");
        AbstractC38963t7.m124390t(sb4, str, ", typingEventsEnabled=", z4, ", readEventsEnabled=");
        AbstractC38963t7.m124392v(sb4, z13, ", deliveryEventsEnabled=", z14, ", connectEventsEnabled=");
        AbstractC38963t7.m124392v(sb4, z15, ", searchEnabled=", z16, ", isReactionsEnabled=");
        AbstractC38963t7.m124392v(sb4, z17, ", isThreadEnabled=", z18, ", muteEnabled=");
        AbstractC38963t7.m124392v(sb4, z19, ", uploadsEnabled=", z24, ", urlEnrichmentEnabled=");
        AbstractC38963t7.m124392v(sb4, z25, ", customEventsEnabled=", z26, ", pushNotificationsEnabled=");
        AbstractC38963t7.m124392v(sb4, z27, ", skipLastMsgUpdateForSystemMsgs=", z28, ", pollsEnabled=");
        AbstractC38963t7.m124391u(sb4, z29, ", messageRetention=", str2, ", maxMessageLength=");
        AbstractC11895b.m31979B(i13, ", automod=", str3, ", automodBehavior=", sb4);
        AbstractC11266d.m30444B(sb4, str4, ", blocklistBehavior=", str5, ", commands=");
        AbstractC26725a.m79512p(", messageRemindersEnabled=", ", sharedLocationsEnabled=", sb4, list, z34);
        return AbstractC36095b.m114682j(sb4, z35, ", markMessagesPending=", z36, ")");
    }

    public Config(Date date, Date date2, String name, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, String messageRetention, int i13, String automod, String automodBehavior, String blocklistBehavior, List<Command> commands, boolean z34, boolean z35, boolean z36) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(messageRetention, "messageRetention");
        AbstractC22676k.m65750j(automod, "automod");
        AbstractC22676k.m65750j(automodBehavior, "automodBehavior");
        AbstractC22676k.m65750j(blocklistBehavior, "blocklistBehavior");
        AbstractC22676k.m65750j(commands, "commands");
        this.createdAt = date;
        this.updatedAt = date2;
        this.name = name;
        this.typingEventsEnabled = z4;
        this.readEventsEnabled = z13;
        this.deliveryEventsEnabled = z14;
        this.connectEventsEnabled = z15;
        this.searchEnabled = z16;
        this.isReactionsEnabled = z17;
        this.isThreadEnabled = z18;
        this.muteEnabled = z19;
        this.uploadsEnabled = z24;
        this.urlEnrichmentEnabled = z25;
        this.customEventsEnabled = z26;
        this.pushNotificationsEnabled = z27;
        this.skipLastMsgUpdateForSystemMsgs = z28;
        this.pollsEnabled = z29;
        this.messageRetention = messageRetention;
        this.maxMessageLength = i13;
        this.automod = automod;
        this.automodBehavior = automodBehavior;
        this.blocklistBehavior = blocklistBehavior;
        this.commands = commands;
        this.messageRemindersEnabled = z34;
        this.sharedLocationsEnabled = z35;
        this.markMessagesPending = z36;
    }

    public /* synthetic */ Config(Date date, Date date2, String str, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, String str2, int i13, String str3, String str4, String str5, List list, boolean z34, boolean z35, boolean z36, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : date, (i14 & 2) == 0 ? date2 : null, (i14 & 4) != 0 ? "" : str, (i14 & 8) != 0 ? true : z4, (i14 & 16) != 0 ? true : z13, (i14 & 32) != 0 ? true : z14, (i14 & 64) != 0 ? true : z15, (i14 & 128) != 0 ? true : z16, (i14 & 256) != 0 ? true : z17, (i14 & 512) != 0 ? true : z18, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? true : z19, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? true : z24, (i14 & 4096) != 0 ? true : z25, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z26, (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? true : z27, (i14 & 32768) != 0 ? false : z28, (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? false : z29, (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? "infinite" : str2, (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? ErrorCodes.WebsocketMethodErrors.cServerErrors : i13, (i14 & 524288) != 0 ? "disabled" : str3, (i14 & 1048576) != 0 ? "" : str4, (i14 & 2097152) == 0 ? str5 : "", (i14 & 4194304) != 0 ? new ArrayList() : list, (i14 & 8388608) != 0 ? false : z34, (i14 & 16777216) != 0 ? false : z35, (i14 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? false : z36);
    }
}
