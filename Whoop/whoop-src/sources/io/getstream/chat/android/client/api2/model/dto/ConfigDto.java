package io.getstream.chat.android.client.api2.model.dto;

import androidx.profileinstaller.ProfileVerifier;
import com.mapbox.common.MapboxServices;
import java.util.Date;
import java.util.List;
import live.hms.video.utils.AndroidSDKConstants;
import live.hms.video.utils.HMSFieldTrials;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bG\b\u0081\b\u0018\u00002\u00020\u0001Bí\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\b\u0012\u0006\u0010!\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010H\u001a\u00020\bHÆ\u0003J\t\u0010I\u001a\u00020\bHÆ\u0003J\t\u0010J\u001a\u00020\bHÆ\u0003J\t\u0010K\u001a\u00020\bHÆ\u0003J\t\u0010L\u001a\u00020\bHÆ\u0003J\t\u0010M\u001a\u00020\bHÆ\u0003J\t\u0010N\u001a\u00020\bHÆ\u0003J\t\u0010O\u001a\u00020\bHÆ\u0003J\t\u0010P\u001a\u00020\bHÆ\u0003J\t\u0010Q\u001a\u00020\bHÆ\u0003J\t\u0010R\u001a\u00020\bHÆ\u0003J\t\u0010S\u001a\u00020\bHÆ\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00107J\t\u0010U\u001a\u00020\bHÆ\u0003J\t\u0010V\u001a\u00020\u0006HÆ\u0003J\t\u0010W\u001a\u00020\u0018HÆ\u0003J\t\u0010X\u001a\u00020\u0006HÆ\u0003J\t\u0010Y\u001a\u00020\u0006HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dHÆ\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010]\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00107J\t\u0010^\u001a\u00020\bHÆ\u0003J¦\u0002\u0010_\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010!\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010`J\u0013\u0010a\u001a\u00020\b2\b\u0010b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010c\u001a\u00020\u0018HÖ\u0001J\t\u0010d\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010*R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010*R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b5\u0010*R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010*R\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b:\u0010(R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u0019\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b=\u0010(R\u0011\u0010\u001a\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b>\u0010(R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b?\u0010(R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0015\u0010\u001f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\bB\u00107R\u0015\u0010 \u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\bC\u00107R\u0011\u0010!\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bD\u0010*¨\u0006e"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;", "", "created_at", "Ljava/util/Date;", "updated_at", "name", "", "typing_events", "", "read_events", "delivery_events", "connect_events", MapboxServices.SEARCH, "reactions", "replies", "mutes", "uploads", "url_enrichment", "custom_events", "push_notifications", "skip_last_msg_update_for_system_msgs", "polls", "message_retention", "max_message_length", "", "automod", "automod_behavior", "blocklist_behavior", "commands", "", "Lio/getstream/chat/android/client/api2/model/dto/CommandDto;", "user_message_reminders", "shared_locations", "mark_messages_pending", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZLjava/lang/Boolean;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V", "getCreated_at", "()Ljava/util/Date;", "getUpdated_at", "getName", "()Ljava/lang/String;", "getTyping_events", "()Z", "getRead_events", "getDelivery_events", "getConnect_events", "getSearch", "getReactions", "getReplies", "getMutes", "getUploads", "getUrl_enrichment", "getCustom_events", "getPush_notifications", "getSkip_last_msg_update_for_system_msgs", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPolls", "getMessage_retention", "getMax_message_length", "()I", "getAutomod", "getAutomod_behavior", "getBlocklist_behavior", "getCommands", "()Ljava/util/List;", "getUser_message_reminders", "getShared_locations", "getMark_messages_pending", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZLjava/lang/Boolean;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ConfigDto {
    private final String automod;
    private final String automod_behavior;
    private final String blocklist_behavior;
    private final List<CommandDto> commands;
    private final boolean connect_events;
    private final Date created_at;
    private final boolean custom_events;
    private final boolean delivery_events;
    private final boolean mark_messages_pending;
    private final int max_message_length;
    private final String message_retention;
    private final boolean mutes;
    private final String name;
    private final boolean polls;
    private final boolean push_notifications;
    private final boolean reactions;
    private final boolean read_events;
    private final boolean replies;
    private final boolean search;
    private final Boolean shared_locations;
    private final Boolean skip_last_msg_update_for_system_msgs;
    private final boolean typing_events;
    private final Date updated_at;
    private final boolean uploads;
    private final boolean url_enrichment;
    private final Boolean user_message_reminders;

    public ConfigDto(Date date, Date date2, String str, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, Boolean bool, boolean z28, String message_retention, int i13, String automod, String automod_behavior, String str2, List<CommandDto> commands, Boolean bool2, Boolean bool3, boolean z29) {
        AbstractC22676k.m65750j(message_retention, "message_retention");
        AbstractC22676k.m65750j(automod, "automod");
        AbstractC22676k.m65750j(automod_behavior, "automod_behavior");
        AbstractC22676k.m65750j(commands, "commands");
        this.created_at = date;
        this.updated_at = date2;
        this.name = str;
        this.typing_events = z4;
        this.read_events = z13;
        this.delivery_events = z14;
        this.connect_events = z15;
        this.search = z16;
        this.reactions = z17;
        this.replies = z18;
        this.mutes = z19;
        this.uploads = z24;
        this.url_enrichment = z25;
        this.custom_events = z26;
        this.push_notifications = z27;
        this.skip_last_msg_update_for_system_msgs = bool;
        this.polls = z28;
        this.message_retention = message_retention;
        this.max_message_length = i13;
        this.automod = automod;
        this.automod_behavior = automod_behavior;
        this.blocklist_behavior = str2;
        this.commands = commands;
        this.user_message_reminders = bool2;
        this.shared_locations = bool3;
        this.mark_messages_pending = z29;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfigDto copy$default(ConfigDto configDto, Date date, Date date2, String str, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, Boolean bool, boolean z28, String str2, int i13, String str3, String str4, String str5, List list, Boolean bool2, Boolean bool3, boolean z29, int i14, Object obj) {
        boolean z34;
        Boolean bool4;
        Date date3 = (i14 & 1) != 0 ? configDto.created_at : date;
        Date date4 = (i14 & 2) != 0 ? configDto.updated_at : date2;
        String str6 = (i14 & 4) != 0 ? configDto.name : str;
        boolean z35 = (i14 & 8) != 0 ? configDto.typing_events : z4;
        boolean z36 = (i14 & 16) != 0 ? configDto.read_events : z13;
        boolean z37 = (i14 & 32) != 0 ? configDto.delivery_events : z14;
        boolean z38 = (i14 & 64) != 0 ? configDto.connect_events : z15;
        boolean z39 = (i14 & 128) != 0 ? configDto.search : z16;
        boolean z44 = (i14 & 256) != 0 ? configDto.reactions : z17;
        boolean z45 = (i14 & 512) != 0 ? configDto.replies : z18;
        boolean z46 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? configDto.mutes : z19;
        boolean z47 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? configDto.uploads : z24;
        boolean z48 = (i14 & 4096) != 0 ? configDto.url_enrichment : z25;
        boolean z49 = (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? configDto.custom_events : z26;
        Date date5 = date3;
        boolean z52 = (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? configDto.push_notifications : z27;
        Boolean bool5 = (i14 & 32768) != 0 ? configDto.skip_last_msg_update_for_system_msgs : bool;
        boolean z54 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? configDto.polls : z28;
        String str7 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? configDto.message_retention : str2;
        int i15 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? configDto.max_message_length : i13;
        String str8 = (i14 & 524288) != 0 ? configDto.automod : str3;
        String str9 = (i14 & 1048576) != 0 ? configDto.automod_behavior : str4;
        String str10 = (i14 & 2097152) != 0 ? configDto.blocklist_behavior : str5;
        List list2 = (i14 & 4194304) != 0 ? configDto.commands : list;
        Boolean bool6 = (i14 & 8388608) != 0 ? configDto.user_message_reminders : bool2;
        Boolean bool7 = (i14 & 16777216) != 0 ? configDto.shared_locations : bool3;
        if ((i14 & AndroidSDKConstants.FLAG_MUTABLE) != 0) {
            bool4 = bool7;
            z34 = configDto.mark_messages_pending;
        } else {
            z34 = z29;
            bool4 = bool7;
        }
        return configDto.copy(date5, date4, str6, z35, z36, z37, z38, z39, z44, z45, z46, z47, z48, z49, z52, bool5, z54, str7, i15, str8, str9, str10, list2, bool6, bool4, z34);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getReplies() {
        return this.replies;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getMutes() {
        return this.mutes;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getUploads() {
        return this.uploads;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getUrl_enrichment() {
        return this.url_enrichment;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getCustom_events() {
        return this.custom_events;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getPush_notifications() {
        return this.push_notifications;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getSkip_last_msg_update_for_system_msgs() {
        return this.skip_last_msg_update_for_system_msgs;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getPolls() {
        return this.polls;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getMessage_retention() {
        return this.message_retention;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getMax_message_length() {
        return this.max_message_length;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getAutomod() {
        return this.automod;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getAutomod_behavior() {
        return this.automod_behavior;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getBlocklist_behavior() {
        return this.blocklist_behavior;
    }

    public final List<CommandDto> component23() {
        return this.commands;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Boolean getUser_message_reminders() {
        return this.user_message_reminders;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Boolean getShared_locations() {
        return this.shared_locations;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getMark_messages_pending() {
        return this.mark_messages_pending;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getTyping_events() {
        return this.typing_events;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getRead_events() {
        return this.read_events;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getDelivery_events() {
        return this.delivery_events;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getConnect_events() {
        return this.connect_events;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getSearch() {
        return this.search;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getReactions() {
        return this.reactions;
    }

    public final ConfigDto copy(Date created_at, Date updated_at, String name, boolean typing_events, boolean read_events, boolean delivery_events, boolean connect_events, boolean search, boolean reactions, boolean replies, boolean mutes, boolean uploads, boolean url_enrichment, boolean custom_events, boolean push_notifications, Boolean skip_last_msg_update_for_system_msgs, boolean polls, String message_retention, int max_message_length, String automod, String automod_behavior, String blocklist_behavior, List<CommandDto> commands, Boolean user_message_reminders, Boolean shared_locations, boolean mark_messages_pending) {
        AbstractC22676k.m65750j(message_retention, "message_retention");
        AbstractC22676k.m65750j(automod, "automod");
        AbstractC22676k.m65750j(automod_behavior, "automod_behavior");
        AbstractC22676k.m65750j(commands, "commands");
        return new ConfigDto(created_at, updated_at, name, typing_events, read_events, delivery_events, connect_events, search, reactions, replies, mutes, uploads, url_enrichment, custom_events, push_notifications, skip_last_msg_update_for_system_msgs, polls, message_retention, max_message_length, automod, automod_behavior, blocklist_behavior, commands, user_message_reminders, shared_locations, mark_messages_pending);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigDto)) {
            return false;
        }
        ConfigDto configDto = (ConfigDto) other;
        return AbstractC22676k.m65745e(this.created_at, configDto.created_at) && AbstractC22676k.m65745e(this.updated_at, configDto.updated_at) && AbstractC22676k.m65745e(this.name, configDto.name) && this.typing_events == configDto.typing_events && this.read_events == configDto.read_events && this.delivery_events == configDto.delivery_events && this.connect_events == configDto.connect_events && this.search == configDto.search && this.reactions == configDto.reactions && this.replies == configDto.replies && this.mutes == configDto.mutes && this.uploads == configDto.uploads && this.url_enrichment == configDto.url_enrichment && this.custom_events == configDto.custom_events && this.push_notifications == configDto.push_notifications && AbstractC22676k.m65745e(this.skip_last_msg_update_for_system_msgs, configDto.skip_last_msg_update_for_system_msgs) && this.polls == configDto.polls && AbstractC22676k.m65745e(this.message_retention, configDto.message_retention) && this.max_message_length == configDto.max_message_length && AbstractC22676k.m65745e(this.automod, configDto.automod) && AbstractC22676k.m65745e(this.automod_behavior, configDto.automod_behavior) && AbstractC22676k.m65745e(this.blocklist_behavior, configDto.blocklist_behavior) && AbstractC22676k.m65745e(this.commands, configDto.commands) && AbstractC22676k.m65745e(this.user_message_reminders, configDto.user_message_reminders) && AbstractC22676k.m65745e(this.shared_locations, configDto.shared_locations) && this.mark_messages_pending == configDto.mark_messages_pending;
    }

    public final String getAutomod() {
        return this.automod;
    }

    public final String getAutomod_behavior() {
        return this.automod_behavior;
    }

    public final String getBlocklist_behavior() {
        return this.blocklist_behavior;
    }

    public final List<CommandDto> getCommands() {
        return this.commands;
    }

    public final boolean getConnect_events() {
        return this.connect_events;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final boolean getCustom_events() {
        return this.custom_events;
    }

    public final boolean getDelivery_events() {
        return this.delivery_events;
    }

    public final boolean getMark_messages_pending() {
        return this.mark_messages_pending;
    }

    public final int getMax_message_length() {
        return this.max_message_length;
    }

    public final String getMessage_retention() {
        return this.message_retention;
    }

    public final boolean getMutes() {
        return this.mutes;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getPolls() {
        return this.polls;
    }

    public final boolean getPush_notifications() {
        return this.push_notifications;
    }

    public final boolean getReactions() {
        return this.reactions;
    }

    public final boolean getRead_events() {
        return this.read_events;
    }

    public final boolean getReplies() {
        return this.replies;
    }

    public final boolean getSearch() {
        return this.search;
    }

    public final Boolean getShared_locations() {
        return this.shared_locations;
    }

    public final Boolean getSkip_last_msg_update_for_system_msgs() {
        return this.skip_last_msg_update_for_system_msgs;
    }

    public final boolean getTyping_events() {
        return this.typing_events;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final boolean getUploads() {
        return this.uploads;
    }

    public final boolean getUrl_enrichment() {
        return this.url_enrichment;
    }

    public final Boolean getUser_message_reminders() {
        return this.user_message_reminders;
    }

    public int hashCode() {
        Date date = this.created_at;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.updated_at;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str = this.name;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.typing_events), 31, this.read_events), 31, this.delivery_events), 31, this.connect_events), 31, this.search), 31, this.reactions), 31, this.replies), 31, this.mutes), 31, this.uploads), 31, this.url_enrichment), 31, this.custom_events), 31, this.push_notifications);
        Boolean bool = this.skip_last_msg_update_for_system_msgs;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.max_message_length, AbstractC11266d.m30450d(AbstractC2875y.m8289b((iM8289b + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.polls), 31, this.message_retention), 31), 31, this.automod), 31, this.automod_behavior);
        String str2 = this.blocklist_behavior;
        int iM31983b = AbstractC11895b.m31983b((iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.commands);
        Boolean bool2 = this.user_message_reminders;
        int iHashCode3 = (iM31983b + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.shared_locations;
        return Boolean.hashCode(this.mark_messages_pending) + ((iHashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31);
    }

    public String toString() {
        Date date = this.created_at;
        Date date2 = this.updated_at;
        String str = this.name;
        boolean z4 = this.typing_events;
        boolean z13 = this.read_events;
        boolean z14 = this.delivery_events;
        boolean z15 = this.connect_events;
        boolean z16 = this.search;
        boolean z17 = this.reactions;
        boolean z18 = this.replies;
        boolean z19 = this.mutes;
        boolean z24 = this.uploads;
        boolean z25 = this.url_enrichment;
        boolean z26 = this.custom_events;
        boolean z27 = this.push_notifications;
        Boolean bool = this.skip_last_msg_update_for_system_msgs;
        boolean z28 = this.polls;
        String str2 = this.message_retention;
        int i13 = this.max_message_length;
        String str3 = this.automod;
        String str4 = this.automod_behavior;
        String str5 = this.blocklist_behavior;
        List<CommandDto> list = this.commands;
        Boolean bool2 = this.user_message_reminders;
        Boolean bool3 = this.shared_locations;
        boolean z29 = this.mark_messages_pending;
        StringBuilder sb4 = new StringBuilder("ConfigDto(created_at=");
        sb4.append(date);
        sb4.append(", updated_at=");
        sb4.append(date2);
        sb4.append(", name=");
        AbstractC38963t7.m124390t(sb4, str, ", typing_events=", z4, ", read_events=");
        AbstractC38963t7.m124392v(sb4, z13, ", delivery_events=", z14, ", connect_events=");
        AbstractC38963t7.m124392v(sb4, z15, ", search=", z16, ", reactions=");
        AbstractC38963t7.m124392v(sb4, z17, ", replies=", z18, ", mutes=");
        AbstractC38963t7.m124392v(sb4, z19, ", uploads=", z24, ", url_enrichment=");
        AbstractC38963t7.m124392v(sb4, z25, ", custom_events=", z26, ", push_notifications=");
        sb4.append(z27);
        sb4.append(", skip_last_msg_update_for_system_msgs=");
        sb4.append(bool);
        sb4.append(", polls=");
        AbstractC38963t7.m124391u(sb4, z28, ", message_retention=", str2, ", max_message_length=");
        AbstractC11895b.m31979B(i13, ", automod=", str3, ", automod_behavior=", sb4);
        AbstractC11266d.m30444B(sb4, str4, ", blocklist_behavior=", str5, ", commands=");
        sb4.append(list);
        sb4.append(", user_message_reminders=");
        sb4.append(bool2);
        sb4.append(", shared_locations=");
        sb4.append(bool3);
        sb4.append(", mark_messages_pending=");
        sb4.append(z29);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ ConfigDto(Date date, Date date2, String str, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, Boolean bool, boolean z28, String str2, int i13, String str3, String str4, String str5, List list, Boolean bool2, Boolean bool3, boolean z29, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(date, date2, str, z4, z13, (i14 & 32) != 0 ? true : z14, z15, z16, z17, z18, z19, z24, z25, z26, z27, bool, z28, str2, i13, str3, str4, str5, list, bool2, bool3, z29);
    }
}
