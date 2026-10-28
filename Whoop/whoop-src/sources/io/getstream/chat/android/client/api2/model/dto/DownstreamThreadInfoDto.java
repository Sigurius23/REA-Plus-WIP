package io.getstream.chat.android.client.api2.model.dto;

import hc3.AbstractC17176i;
import java.util.Date;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010>\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010?\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010)J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010B\u001a\u00020\u0014HÆ\u0003J\t\u0010C\u001a\u00020\u0014HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\u0015\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0003JÒ\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00032\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010L\u001a\u00020\rHÖ\u0001J\t\u0010M\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010*\u001a\u0004\b+\u0010)R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010*\u001a\u0004\b,\u0010)R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0011\u0010\u0016\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b3\u00100R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b5\u00106¨\u0006N"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadInfoDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "channel_cid", "", "channel", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "parent_message_id", "parent_message", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "created_by_user_id", "created_by", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "reply_count", "", "participant_count", "active_participant_count", "thread_participants", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadParticipantDto;", "last_message_at", "Ljava/util/Date;", "created_at", "updated_at", "deleted_at", "title", "extraData", "", "", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Map;)V", "getChannel_cid", "()Ljava/lang/String;", "getChannel", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "getParent_message_id", "getParent_message", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "getCreated_by_user_id", "getCreated_by", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getReply_count", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getParticipant_count", "getActive_participant_count", "getThread_participants", "()Ljava/util/List;", "getLast_message_at", "()Ljava/util/Date;", "getCreated_at", "getUpdated_at", "getDeleted_at", "getTitle", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadInfoDto;", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamThreadInfoDto implements ExtraDataDto {
    private final Integer active_participant_count;
    private final DownstreamChannelDto channel;
    private final String channel_cid;
    private final Date created_at;
    private final DownstreamUserDto created_by;
    private final String created_by_user_id;
    private final Date deleted_at;
    private final Map<String, Object> extraData;
    private final Date last_message_at;
    private final DownstreamMessageDto parent_message;
    private final String parent_message_id;
    private final Integer participant_count;
    private final Integer reply_count;
    private final List<DownstreamThreadParticipantDto> thread_participants;
    private final String title;
    private final Date updated_at;

    public DownstreamThreadInfoDto(String channel_cid, DownstreamChannelDto downstreamChannelDto, String parent_message_id, DownstreamMessageDto downstreamMessageDto, String created_by_user_id, DownstreamUserDto downstreamUserDto, Integer num, Integer num2, Integer num3, List<DownstreamThreadParticipantDto> list, Date date, Date created_at, Date updated_at, Date date2, String title, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(channel_cid, "channel_cid");
        AbstractC22676k.m65750j(parent_message_id, "parent_message_id");
        AbstractC22676k.m65750j(created_by_user_id, "created_by_user_id");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(updated_at, "updated_at");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.channel_cid = channel_cid;
        this.channel = downstreamChannelDto;
        this.parent_message_id = parent_message_id;
        this.parent_message = downstreamMessageDto;
        this.created_by_user_id = created_by_user_id;
        this.created_by = downstreamUserDto;
        this.reply_count = num;
        this.participant_count = num2;
        this.active_participant_count = num3;
        this.thread_participants = list;
        this.last_message_at = date;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.deleted_at = date2;
        this.title = title;
        this.extraData = extraData;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel_cid() {
        return this.channel_cid;
    }

    public final List<DownstreamThreadParticipantDto> component10() {
        return this.thread_participants;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Date getLast_message_at() {
        return this.last_message_at;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Date getDeleted_at() {
        return this.deleted_at;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, Object> component16() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DownstreamChannelDto getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getParent_message_id() {
        return this.parent_message_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DownstreamMessageDto getParent_message() {
        return this.parent_message;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCreated_by_user_id() {
        return this.created_by_user_id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DownstreamUserDto getCreated_by() {
        return this.created_by;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getReply_count() {
        return this.reply_count;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getParticipant_count() {
        return this.participant_count;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getActive_participant_count() {
        return this.active_participant_count;
    }

    public final DownstreamThreadInfoDto copy(String channel_cid, DownstreamChannelDto channel, String parent_message_id, DownstreamMessageDto parent_message, String created_by_user_id, DownstreamUserDto created_by, Integer reply_count, Integer participant_count, Integer active_participant_count, List<DownstreamThreadParticipantDto> thread_participants, Date last_message_at, Date created_at, Date updated_at, Date deleted_at, String title, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(channel_cid, "channel_cid");
        AbstractC22676k.m65750j(parent_message_id, "parent_message_id");
        AbstractC22676k.m65750j(created_by_user_id, "created_by_user_id");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(updated_at, "updated_at");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new DownstreamThreadInfoDto(channel_cid, channel, parent_message_id, parent_message, created_by_user_id, created_by, reply_count, participant_count, active_participant_count, thread_participants, last_message_at, created_at, updated_at, deleted_at, title, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamThreadInfoDto)) {
            return false;
        }
        DownstreamThreadInfoDto downstreamThreadInfoDto = (DownstreamThreadInfoDto) other;
        return AbstractC22676k.m65745e(this.channel_cid, downstreamThreadInfoDto.channel_cid) && AbstractC22676k.m65745e(this.channel, downstreamThreadInfoDto.channel) && AbstractC22676k.m65745e(this.parent_message_id, downstreamThreadInfoDto.parent_message_id) && AbstractC22676k.m65745e(this.parent_message, downstreamThreadInfoDto.parent_message) && AbstractC22676k.m65745e(this.created_by_user_id, downstreamThreadInfoDto.created_by_user_id) && AbstractC22676k.m65745e(this.created_by, downstreamThreadInfoDto.created_by) && AbstractC22676k.m65745e(this.reply_count, downstreamThreadInfoDto.reply_count) && AbstractC22676k.m65745e(this.participant_count, downstreamThreadInfoDto.participant_count) && AbstractC22676k.m65745e(this.active_participant_count, downstreamThreadInfoDto.active_participant_count) && AbstractC22676k.m65745e(this.thread_participants, downstreamThreadInfoDto.thread_participants) && AbstractC22676k.m65745e(this.last_message_at, downstreamThreadInfoDto.last_message_at) && AbstractC22676k.m65745e(this.created_at, downstreamThreadInfoDto.created_at) && AbstractC22676k.m65745e(this.updated_at, downstreamThreadInfoDto.updated_at) && AbstractC22676k.m65745e(this.deleted_at, downstreamThreadInfoDto.deleted_at) && AbstractC22676k.m65745e(this.title, downstreamThreadInfoDto.title) && AbstractC22676k.m65745e(this.extraData, downstreamThreadInfoDto.extraData);
    }

    public final Integer getActive_participant_count() {
        return this.active_participant_count;
    }

    public final DownstreamChannelDto getChannel() {
        return this.channel;
    }

    public final String getChannel_cid() {
        return this.channel_cid;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final DownstreamUserDto getCreated_by() {
        return this.created_by;
    }

    public final String getCreated_by_user_id() {
        return this.created_by_user_id;
    }

    public final Date getDeleted_at() {
        return this.deleted_at;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final Date getLast_message_at() {
        return this.last_message_at;
    }

    public final DownstreamMessageDto getParent_message() {
        return this.parent_message;
    }

    public final String getParent_message_id() {
        return this.parent_message_id;
    }

    public final Integer getParticipant_count() {
        return this.participant_count;
    }

    public final Integer getReply_count() {
        return this.reply_count;
    }

    public final List<DownstreamThreadParticipantDto> getThread_participants() {
        return this.thread_participants;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public int hashCode() {
        int iHashCode = this.channel_cid.hashCode() * 31;
        DownstreamChannelDto downstreamChannelDto = this.channel;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (downstreamChannelDto == null ? 0 : downstreamChannelDto.hashCode())) * 31, 31, this.parent_message_id);
        DownstreamMessageDto downstreamMessageDto = this.parent_message;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (downstreamMessageDto == null ? 0 : downstreamMessageDto.hashCode())) * 31, 31, this.created_by_user_id);
        DownstreamUserDto downstreamUserDto = this.created_by;
        int iHashCode2 = (iM30450d2 + (downstreamUserDto == null ? 0 : downstreamUserDto.hashCode())) * 31;
        Integer num = this.reply_count;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.participant_count;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.active_participant_count;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<DownstreamThreadParticipantDto> list = this.thread_participants;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Date date = this.last_message_at;
        int iM124373c = AbstractC38963t7.m124373c(this.updated_at, AbstractC38963t7.m124373c(this.created_at, (iHashCode6 + (date == null ? 0 : date.hashCode())) * 31, 31), 31);
        Date date2 = this.deleted_at;
        return this.extraData.hashCode() + AbstractC11266d.m30450d((iM124373c + (date2 != null ? date2.hashCode() : 0)) * 31, 31, this.title);
    }

    public String toString() {
        String str = this.channel_cid;
        DownstreamChannelDto downstreamChannelDto = this.channel;
        String str2 = this.parent_message_id;
        DownstreamMessageDto downstreamMessageDto = this.parent_message;
        String str3 = this.created_by_user_id;
        DownstreamUserDto downstreamUserDto = this.created_by;
        Integer num = this.reply_count;
        Integer num2 = this.participant_count;
        Integer num3 = this.active_participant_count;
        List<DownstreamThreadParticipantDto> list = this.thread_participants;
        Date date = this.last_message_at;
        Date date2 = this.created_at;
        Date date3 = this.updated_at;
        Date date4 = this.deleted_at;
        String str4 = this.title;
        Map<String, Object> map = this.extraData;
        StringBuilder sb4 = new StringBuilder("DownstreamThreadInfoDto(channel_cid=");
        sb4.append(str);
        sb4.append(", channel=");
        sb4.append(downstreamChannelDto);
        sb4.append(", parent_message_id=");
        sb4.append(str2);
        sb4.append(", parent_message=");
        sb4.append(downstreamMessageDto);
        sb4.append(", created_by_user_id=");
        sb4.append(str3);
        sb4.append(", created_by=");
        sb4.append(downstreamUserDto);
        sb4.append(", reply_count=");
        AbstractC31061c.m95621A(sb4, num, ", participant_count=", num2, ", active_participant_count=");
        sb4.append(num3);
        sb4.append(", thread_participants=");
        sb4.append(list);
        sb4.append(", last_message_at=");
        AbstractC17176i.m48512n(sb4, date, ", created_at=", date2, ", updated_at=");
        AbstractC17176i.m48512n(sb4, date3, ", deleted_at=", date4, ", title=");
        return AbstractC30007c.m91842l(sb4, str4, ", extraData=", map, ")");
    }
}
