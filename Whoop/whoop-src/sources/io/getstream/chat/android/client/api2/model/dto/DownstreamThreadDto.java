package io.getstream.chat.android.client.api2.model.dto;

import androidx.profileinstaller.ProfileVerifier;
import d13.AbstractC11478a;
import java.util.Date;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b!\u0010\"J\u0010\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0007HÆ\u0003J\t\u0010D\u001a\u00020\tHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010F\u001a\u00020\u0007HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010I\u001a\u00020\tHÆ\u0003J\u000f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\t\u0010K\u001a\u00020\u0013HÆ\u0003J\t\u0010L\u001a\u00020\u0007HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012HÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010$J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0012HÆ\u0003J\t\u0010Q\u001a\u00020\u0007HÆ\u0003J\t\u0010R\u001a\u00020\tHÆ\u0003J\u0015\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u001fHÆ\u0003Jú\u0001\u0010T\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00032\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\t2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u001fHÆ\u0001¢\u0006\u0002\u0010UJ\u0013\u0010V\u001a\u00020W2\b\u0010X\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010Y\u001a\u00020\u0003HÖ\u0001J\t\u0010Z\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0013\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b:\u00104R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010%\u001a\u0004\b;\u0010$R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b<\u00104R\u0011\u0010\u001c\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b=\u0010)R\u0011\u0010\u001d\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b>\u0010+R\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u001f¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@¨\u0006["}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "active_participant_count", "", "channel", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "channel_cid", "", "created_at", "Ljava/util/Date;", "created_by", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "created_by_user_id", "deleted_at", "draft", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;", "last_message_at", "latest_replies", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "parent_message", "parent_message_id", "participant_count", "read", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;", "reply_count", "thread_participants", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadParticipantDto;", "title", "updated_at", "extraData", "", "", "<init>", "(Ljava/lang/Integer;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;Ljava/util/Date;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;ILjava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)V", "getActive_participant_count", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChannel", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "getChannel_cid", "()Ljava/lang/String;", "getCreated_at", "()Ljava/util/Date;", "getCreated_by", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getCreated_by_user_id", "getDeleted_at", "getDraft", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;", "getLast_message_at", "getLatest_replies", "()Ljava/util/List;", "getParent_message", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "getParent_message_id", "getParticipant_count", "()I", "getRead", "getReply_count", "getThread_participants", "getTitle", "getUpdated_at", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/Integer;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;Ljava/util/Date;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;ILjava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamThreadDto implements ExtraDataDto {
    private final Integer active_participant_count;
    private final DownstreamChannelDto channel;
    private final String channel_cid;
    private final Date created_at;
    private final DownstreamUserDto created_by;
    private final String created_by_user_id;
    private final Date deleted_at;
    private final DownstreamDraftDto draft;
    private final Map<String, Object> extraData;
    private final Date last_message_at;
    private final List<DownstreamMessageDto> latest_replies;
    private final DownstreamMessageDto parent_message;
    private final String parent_message_id;
    private final int participant_count;
    private final List<DownstreamChannelUserRead> read;
    private final Integer reply_count;
    private final List<DownstreamThreadParticipantDto> thread_participants;
    private final String title;
    private final Date updated_at;

    public DownstreamThreadDto(Integer num, DownstreamChannelDto downstreamChannelDto, String channel_cid, Date created_at, DownstreamUserDto downstreamUserDto, String created_by_user_id, Date date, DownstreamDraftDto downstreamDraftDto, Date last_message_at, List<DownstreamMessageDto> latest_replies, DownstreamMessageDto parent_message, String parent_message_id, int i13, List<DownstreamChannelUserRead> list, Integer num2, List<DownstreamThreadParticipantDto> list2, String title, Date updated_at, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(channel_cid, "channel_cid");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(created_by_user_id, "created_by_user_id");
        AbstractC22676k.m65750j(last_message_at, "last_message_at");
        AbstractC22676k.m65750j(latest_replies, "latest_replies");
        AbstractC22676k.m65750j(parent_message, "parent_message");
        AbstractC22676k.m65750j(parent_message_id, "parent_message_id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(updated_at, "updated_at");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.active_participant_count = num;
        this.channel = downstreamChannelDto;
        this.channel_cid = channel_cid;
        this.created_at = created_at;
        this.created_by = downstreamUserDto;
        this.created_by_user_id = created_by_user_id;
        this.deleted_at = date;
        this.draft = downstreamDraftDto;
        this.last_message_at = last_message_at;
        this.latest_replies = latest_replies;
        this.parent_message = parent_message;
        this.parent_message_id = parent_message_id;
        this.participant_count = i13;
        this.read = list;
        this.reply_count = num2;
        this.thread_participants = list2;
        this.title = title;
        this.updated_at = updated_at;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DownstreamThreadDto copy$default(DownstreamThreadDto downstreamThreadDto, Integer num, DownstreamChannelDto downstreamChannelDto, String str, Date date, DownstreamUserDto downstreamUserDto, String str2, Date date2, DownstreamDraftDto downstreamDraftDto, Date date3, List list, DownstreamMessageDto downstreamMessageDto, String str3, int i13, List list2, Integer num2, List list3, String str4, Date date4, Map map, int i14, Object obj) {
        Map map2;
        Date date5;
        Integer num3 = (i14 & 1) != 0 ? downstreamThreadDto.active_participant_count : num;
        DownstreamChannelDto downstreamChannelDto2 = (i14 & 2) != 0 ? downstreamThreadDto.channel : downstreamChannelDto;
        String str5 = (i14 & 4) != 0 ? downstreamThreadDto.channel_cid : str;
        Date date6 = (i14 & 8) != 0 ? downstreamThreadDto.created_at : date;
        DownstreamUserDto downstreamUserDto2 = (i14 & 16) != 0 ? downstreamThreadDto.created_by : downstreamUserDto;
        String str6 = (i14 & 32) != 0 ? downstreamThreadDto.created_by_user_id : str2;
        Date date7 = (i14 & 64) != 0 ? downstreamThreadDto.deleted_at : date2;
        DownstreamDraftDto downstreamDraftDto2 = (i14 & 128) != 0 ? downstreamThreadDto.draft : downstreamDraftDto;
        Date date8 = (i14 & 256) != 0 ? downstreamThreadDto.last_message_at : date3;
        List list4 = (i14 & 512) != 0 ? downstreamThreadDto.latest_replies : list;
        DownstreamMessageDto downstreamMessageDto2 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? downstreamThreadDto.parent_message : downstreamMessageDto;
        String str7 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? downstreamThreadDto.parent_message_id : str3;
        int i15 = (i14 & 4096) != 0 ? downstreamThreadDto.participant_count : i13;
        List list5 = (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? downstreamThreadDto.read : list2;
        Integer num4 = num3;
        Integer num5 = (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? downstreamThreadDto.reply_count : num2;
        List list6 = (i14 & 32768) != 0 ? downstreamThreadDto.thread_participants : list3;
        String str8 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? downstreamThreadDto.title : str4;
        Date date9 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? downstreamThreadDto.updated_at : date4;
        if ((i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
            date5 = date9;
            map2 = downstreamThreadDto.extraData;
        } else {
            map2 = map;
            date5 = date9;
        }
        return downstreamThreadDto.copy(num4, downstreamChannelDto2, str5, date6, downstreamUserDto2, str6, date7, downstreamDraftDto2, date8, list4, downstreamMessageDto2, str7, i15, list5, num5, list6, str8, date5, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getActive_participant_count() {
        return this.active_participant_count;
    }

    public final List<DownstreamMessageDto> component10() {
        return this.latest_replies;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final DownstreamMessageDto getParent_message() {
        return this.parent_message;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getParent_message_id() {
        return this.parent_message_id;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getParticipant_count() {
        return this.participant_count;
    }

    public final List<DownstreamChannelUserRead> component14() {
        return this.read;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getReply_count() {
        return this.reply_count;
    }

    public final List<DownstreamThreadParticipantDto> component16() {
        return this.thread_participants;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final Map<String, Object> component19() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DownstreamChannelDto getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChannel_cid() {
        return this.channel_cid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DownstreamUserDto getCreated_by() {
        return this.created_by;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCreated_by_user_id() {
        return this.created_by_user_id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getDeleted_at() {
        return this.deleted_at;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DownstreamDraftDto getDraft() {
        return this.draft;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Date getLast_message_at() {
        return this.last_message_at;
    }

    public final DownstreamThreadDto copy(Integer active_participant_count, DownstreamChannelDto channel, String channel_cid, Date created_at, DownstreamUserDto created_by, String created_by_user_id, Date deleted_at, DownstreamDraftDto draft, Date last_message_at, List<DownstreamMessageDto> latest_replies, DownstreamMessageDto parent_message, String parent_message_id, int participant_count, List<DownstreamChannelUserRead> read, Integer reply_count, List<DownstreamThreadParticipantDto> thread_participants, String title, Date updated_at, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(channel_cid, "channel_cid");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(created_by_user_id, "created_by_user_id");
        AbstractC22676k.m65750j(last_message_at, "last_message_at");
        AbstractC22676k.m65750j(latest_replies, "latest_replies");
        AbstractC22676k.m65750j(parent_message, "parent_message");
        AbstractC22676k.m65750j(parent_message_id, "parent_message_id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(updated_at, "updated_at");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new DownstreamThreadDto(active_participant_count, channel, channel_cid, created_at, created_by, created_by_user_id, deleted_at, draft, last_message_at, latest_replies, parent_message, parent_message_id, participant_count, read, reply_count, thread_participants, title, updated_at, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamThreadDto)) {
            return false;
        }
        DownstreamThreadDto downstreamThreadDto = (DownstreamThreadDto) other;
        return AbstractC22676k.m65745e(this.active_participant_count, downstreamThreadDto.active_participant_count) && AbstractC22676k.m65745e(this.channel, downstreamThreadDto.channel) && AbstractC22676k.m65745e(this.channel_cid, downstreamThreadDto.channel_cid) && AbstractC22676k.m65745e(this.created_at, downstreamThreadDto.created_at) && AbstractC22676k.m65745e(this.created_by, downstreamThreadDto.created_by) && AbstractC22676k.m65745e(this.created_by_user_id, downstreamThreadDto.created_by_user_id) && AbstractC22676k.m65745e(this.deleted_at, downstreamThreadDto.deleted_at) && AbstractC22676k.m65745e(this.draft, downstreamThreadDto.draft) && AbstractC22676k.m65745e(this.last_message_at, downstreamThreadDto.last_message_at) && AbstractC22676k.m65745e(this.latest_replies, downstreamThreadDto.latest_replies) && AbstractC22676k.m65745e(this.parent_message, downstreamThreadDto.parent_message) && AbstractC22676k.m65745e(this.parent_message_id, downstreamThreadDto.parent_message_id) && this.participant_count == downstreamThreadDto.participant_count && AbstractC22676k.m65745e(this.read, downstreamThreadDto.read) && AbstractC22676k.m65745e(this.reply_count, downstreamThreadDto.reply_count) && AbstractC22676k.m65745e(this.thread_participants, downstreamThreadDto.thread_participants) && AbstractC22676k.m65745e(this.title, downstreamThreadDto.title) && AbstractC22676k.m65745e(this.updated_at, downstreamThreadDto.updated_at) && AbstractC22676k.m65745e(this.extraData, downstreamThreadDto.extraData);
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

    public final DownstreamDraftDto getDraft() {
        return this.draft;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final Date getLast_message_at() {
        return this.last_message_at;
    }

    public final List<DownstreamMessageDto> getLatest_replies() {
        return this.latest_replies;
    }

    public final DownstreamMessageDto getParent_message() {
        return this.parent_message;
    }

    public final String getParent_message_id() {
        return this.parent_message_id;
    }

    public final int getParticipant_count() {
        return this.participant_count;
    }

    public final List<DownstreamChannelUserRead> getRead() {
        return this.read;
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
        Integer num = this.active_participant_count;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        DownstreamChannelDto downstreamChannelDto = this.channel;
        int iM124373c = AbstractC38963t7.m124373c(this.created_at, AbstractC11266d.m30450d((iHashCode + (downstreamChannelDto == null ? 0 : downstreamChannelDto.hashCode())) * 31, 31, this.channel_cid), 31);
        DownstreamUserDto downstreamUserDto = this.created_by;
        int iM30450d = AbstractC11266d.m30450d((iM124373c + (downstreamUserDto == null ? 0 : downstreamUserDto.hashCode())) * 31, 31, this.created_by_user_id);
        Date date = this.deleted_at;
        int iHashCode2 = (iM30450d + (date == null ? 0 : date.hashCode())) * 31;
        DownstreamDraftDto downstreamDraftDto = this.draft;
        int iM30448b = AbstractC11266d.m30448b(this.participant_count, AbstractC11266d.m30450d((this.parent_message.hashCode() + AbstractC11895b.m31983b(AbstractC38963t7.m124373c(this.last_message_at, (iHashCode2 + (downstreamDraftDto == null ? 0 : downstreamDraftDto.hashCode())) * 31, 31), 31, this.latest_replies)) * 31, 31, this.parent_message_id), 31);
        List<DownstreamChannelUserRead> list = this.read;
        int iHashCode3 = (iM30448b + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.reply_count;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<DownstreamThreadParticipantDto> list2 = this.thread_participants;
        return this.extraData.hashCode() + AbstractC38963t7.m124373c(this.updated_at, AbstractC11266d.m30450d((iHashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31, 31, this.title), 31);
    }

    public String toString() {
        Integer num = this.active_participant_count;
        DownstreamChannelDto downstreamChannelDto = this.channel;
        String str = this.channel_cid;
        Date date = this.created_at;
        DownstreamUserDto downstreamUserDto = this.created_by;
        String str2 = this.created_by_user_id;
        Date date2 = this.deleted_at;
        DownstreamDraftDto downstreamDraftDto = this.draft;
        Date date3 = this.last_message_at;
        List<DownstreamMessageDto> list = this.latest_replies;
        DownstreamMessageDto downstreamMessageDto = this.parent_message;
        String str3 = this.parent_message_id;
        int i13 = this.participant_count;
        List<DownstreamChannelUserRead> list2 = this.read;
        Integer num2 = this.reply_count;
        List<DownstreamThreadParticipantDto> list3 = this.thread_participants;
        String str4 = this.title;
        Date date4 = this.updated_at;
        Map<String, Object> map = this.extraData;
        StringBuilder sb4 = new StringBuilder("DownstreamThreadDto(active_participant_count=");
        sb4.append(num);
        sb4.append(", channel=");
        sb4.append(downstreamChannelDto);
        sb4.append(", channel_cid=");
        AbstractC13673n.m38579z(sb4, str, ", created_at=", date, ", created_by=");
        AbstractC11478a.m30865q(sb4, downstreamUserDto, ", created_by_user_id=", str2, ", deleted_at=");
        sb4.append(date2);
        sb4.append(", draft=");
        sb4.append(downstreamDraftDto);
        sb4.append(", last_message_at=");
        sb4.append(date3);
        sb4.append(", latest_replies=");
        sb4.append(list);
        sb4.append(", parent_message=");
        sb4.append(downstreamMessageDto);
        sb4.append(", parent_message_id=");
        sb4.append(str3);
        sb4.append(", participant_count=");
        sb4.append(i13);
        sb4.append(", read=");
        sb4.append(list2);
        sb4.append(", reply_count=");
        sb4.append(num2);
        sb4.append(", thread_participants=");
        sb4.append(list3);
        sb4.append(", title=");
        AbstractC13673n.m38579z(sb4, str4, ", updated_at=", date4, ", extraData=");
        return AbstractC13673n.m38565l(sb4, map, ")");
    }
}
