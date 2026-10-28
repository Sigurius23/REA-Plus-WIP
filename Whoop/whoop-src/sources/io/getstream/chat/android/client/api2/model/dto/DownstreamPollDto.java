package io.getstream.chat.android.client.api2.model.dto;

import androidx.profileinstaller.ProfileVerifier;
import d13.AbstractC11478a;
import java.util.Date;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import live.hms.video.utils.HMSFieldTrials;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b=\b\u0081\b\u0018\u00002\u00020\u0001Bû\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020 \u0018\u00010\u0015¢\u0006\u0004\b!\u0010\"J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0006HÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010G\u001a\u00020\fHÆ\u0003J\t\u0010H\u001a\u00020\fHÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\fHÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00101J\u0011\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u001d\u0010M\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0015HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00108J\t\u0010O\u001a\u00020\fHÆ\u0003J\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012HÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\t\u0010R\u001a\u00020\bHÆ\u0003J\t\u0010S\u001a\u00020\u0006HÆ\u0003J\u0017\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020 \u0018\u00010\u0015HÆ\u0003J¬\u0002\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0017\u001a\u00020\f2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00122\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u00062\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00152\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020 \u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010XJ\u0013\u0010Y\u001a\u00020\u00032\b\u0010Z\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010[\u001a\u00020\u0006HÖ\u0001J\t\u0010\\\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010-R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00102\u001a\u0004\b\u0010\u00101R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R%\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0011\u0010\u0017\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b:\u0010-R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012¢\u0006\b\n\u0000\u001a\u0004\b;\u00104R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b<\u00104R\u0011\u0010\u001b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b=\u0010)R\u0011\u0010\u001c\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b>\u0010'R\u001f\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b?\u00106R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010-R\u001f\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020 \u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bA\u00106¨\u0006]"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "allow_answers", "", "allow_user_suggested_options", "answers_count", "", "created_at", "Ljava/util/Date;", "created_by", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "created_by_id", "", "description", "enforce_unique_vote", "id", "is_closed", "latest_answers", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;", "latest_votes_by_option", "", "max_votes_allowed", "name", "options", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollOptionDto;", "own_votes", "updated_at", "vote_count", "vote_counts_by_option", "voting_visibility", "extraData", "", "<init>", "(ZZILjava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;ILjava/util/Map;Ljava/lang/String;Ljava/util/Map;)V", "getAllow_answers", "()Z", "getAllow_user_suggested_options", "getAnswers_count", "()I", "getCreated_at", "()Ljava/util/Date;", "getCreated_by", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getCreated_by_id", "()Ljava/lang/String;", "getDescription", "getEnforce_unique_vote", "getId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLatest_answers", "()Ljava/util/List;", "getLatest_votes_by_option", "()Ljava/util/Map;", "getMax_votes_allowed", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "getOptions", "getOwn_votes", "getUpdated_at", "getVote_count", "getVote_counts_by_option", "getVoting_visibility", "getExtraData", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(ZZILjava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;ILjava/util/Map;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamPollDto implements ExtraDataDto {
    private final boolean allow_answers;
    private final boolean allow_user_suggested_options;
    private final int answers_count;
    private final Date created_at;
    private final DownstreamUserDto created_by;
    private final String created_by_id;
    private final String description;
    private final boolean enforce_unique_vote;
    private final Map<String, Object> extraData;
    private final String id;
    private final Boolean is_closed;
    private final List<DownstreamVoteDto> latest_answers;
    private final Map<String, List<DownstreamVoteDto>> latest_votes_by_option;
    private final Integer max_votes_allowed;
    private final String name;
    private final List<DownstreamPollOptionDto> options;
    private final List<DownstreamVoteDto> own_votes;
    private final Date updated_at;
    private final int vote_count;
    private final Map<String, Integer> vote_counts_by_option;
    private final String voting_visibility;

    /* JADX WARN: Multi-variable type inference failed */
    public DownstreamPollDto(boolean z4, boolean z13, int i13, Date created_at, DownstreamUserDto downstreamUserDto, String created_by_id, String description, boolean z14, String id4, Boolean bool, List<DownstreamVoteDto> list, Map<String, ? extends List<DownstreamVoteDto>> map, Integer num, String name, List<DownstreamPollOptionDto> options, List<DownstreamVoteDto> own_votes, Date updated_at, int i14, Map<String, Integer> map2, String str, Map<String, ? extends Object> map3) {
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(created_by_id, "created_by_id");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(own_votes, "own_votes");
        AbstractC22676k.m65750j(updated_at, "updated_at");
        this.allow_answers = z4;
        this.allow_user_suggested_options = z13;
        this.answers_count = i13;
        this.created_at = created_at;
        this.created_by = downstreamUserDto;
        this.created_by_id = created_by_id;
        this.description = description;
        this.enforce_unique_vote = z14;
        this.id = id4;
        this.is_closed = bool;
        this.latest_answers = list;
        this.latest_votes_by_option = map;
        this.max_votes_allowed = num;
        this.name = name;
        this.options = options;
        this.own_votes = own_votes;
        this.updated_at = updated_at;
        this.vote_count = i14;
        this.vote_counts_by_option = map2;
        this.voting_visibility = str;
        this.extraData = map3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DownstreamPollDto copy$default(DownstreamPollDto downstreamPollDto, boolean z4, boolean z13, int i13, Date date, DownstreamUserDto downstreamUserDto, String str, String str2, boolean z14, String str3, Boolean bool, List list, Map map, Integer num, String str4, List list2, List list3, Date date2, int i14, Map map2, String str5, Map map3, int i15, Object obj) {
        Map map4;
        String str6;
        boolean z15 = (i15 & 1) != 0 ? downstreamPollDto.allow_answers : z4;
        boolean z16 = (i15 & 2) != 0 ? downstreamPollDto.allow_user_suggested_options : z13;
        int i16 = (i15 & 4) != 0 ? downstreamPollDto.answers_count : i13;
        Date date3 = (i15 & 8) != 0 ? downstreamPollDto.created_at : date;
        DownstreamUserDto downstreamUserDto2 = (i15 & 16) != 0 ? downstreamPollDto.created_by : downstreamUserDto;
        String str7 = (i15 & 32) != 0 ? downstreamPollDto.created_by_id : str;
        String str8 = (i15 & 64) != 0 ? downstreamPollDto.description : str2;
        boolean z17 = (i15 & 128) != 0 ? downstreamPollDto.enforce_unique_vote : z14;
        String str9 = (i15 & 256) != 0 ? downstreamPollDto.id : str3;
        Boolean bool2 = (i15 & 512) != 0 ? downstreamPollDto.is_closed : bool;
        List list4 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? downstreamPollDto.latest_answers : list;
        Map map5 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? downstreamPollDto.latest_votes_by_option : map;
        Integer num2 = (i15 & 4096) != 0 ? downstreamPollDto.max_votes_allowed : num;
        String str10 = (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? downstreamPollDto.name : str4;
        boolean z18 = z15;
        List list5 = (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? downstreamPollDto.options : list2;
        List list6 = (i15 & 32768) != 0 ? downstreamPollDto.own_votes : list3;
        Date date4 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? downstreamPollDto.updated_at : date2;
        int i17 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? downstreamPollDto.vote_count : i14;
        Map map6 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? downstreamPollDto.vote_counts_by_option : map2;
        String str11 = (i15 & 524288) != 0 ? downstreamPollDto.voting_visibility : str5;
        if ((i15 & 1048576) != 0) {
            str6 = str11;
            map4 = downstreamPollDto.extraData;
        } else {
            map4 = map3;
            str6 = str11;
        }
        return downstreamPollDto.copy(z18, z16, i16, date3, downstreamUserDto2, str7, str8, z17, str9, bool2, list4, map5, num2, str10, list5, list6, date4, i17, map6, str6, map4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAllow_answers() {
        return this.allow_answers;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getIs_closed() {
        return this.is_closed;
    }

    public final List<DownstreamVoteDto> component11() {
        return this.latest_answers;
    }

    public final Map<String, List<DownstreamVoteDto>> component12() {
        return this.latest_votes_by_option;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getMax_votes_allowed() {
        return this.max_votes_allowed;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<DownstreamPollOptionDto> component15() {
        return this.options;
    }

    public final List<DownstreamVoteDto> component16() {
        return this.own_votes;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getVote_count() {
        return this.vote_count;
    }

    public final Map<String, Integer> component19() {
        return this.vote_counts_by_option;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAllow_user_suggested_options() {
        return this.allow_user_suggested_options;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getVoting_visibility() {
        return this.voting_visibility;
    }

    public final Map<String, Object> component21() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAnswers_count() {
        return this.answers_count;
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
    public final String getCreated_by_id() {
        return this.created_by_id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getEnforce_unique_vote() {
        return this.enforce_unique_vote;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final DownstreamPollDto copy(boolean allow_answers, boolean allow_user_suggested_options, int answers_count, Date created_at, DownstreamUserDto created_by, String created_by_id, String description, boolean enforce_unique_vote, String id4, Boolean is_closed, List<DownstreamVoteDto> latest_answers, Map<String, ? extends List<DownstreamVoteDto>> latest_votes_by_option, Integer max_votes_allowed, String name, List<DownstreamPollOptionDto> options, List<DownstreamVoteDto> own_votes, Date updated_at, int vote_count, Map<String, Integer> vote_counts_by_option, String voting_visibility, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(created_by_id, "created_by_id");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(own_votes, "own_votes");
        AbstractC22676k.m65750j(updated_at, "updated_at");
        return new DownstreamPollDto(allow_answers, allow_user_suggested_options, answers_count, created_at, created_by, created_by_id, description, enforce_unique_vote, id4, is_closed, latest_answers, latest_votes_by_option, max_votes_allowed, name, options, own_votes, updated_at, vote_count, vote_counts_by_option, voting_visibility, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamPollDto)) {
            return false;
        }
        DownstreamPollDto downstreamPollDto = (DownstreamPollDto) other;
        return this.allow_answers == downstreamPollDto.allow_answers && this.allow_user_suggested_options == downstreamPollDto.allow_user_suggested_options && this.answers_count == downstreamPollDto.answers_count && AbstractC22676k.m65745e(this.created_at, downstreamPollDto.created_at) && AbstractC22676k.m65745e(this.created_by, downstreamPollDto.created_by) && AbstractC22676k.m65745e(this.created_by_id, downstreamPollDto.created_by_id) && AbstractC22676k.m65745e(this.description, downstreamPollDto.description) && this.enforce_unique_vote == downstreamPollDto.enforce_unique_vote && AbstractC22676k.m65745e(this.id, downstreamPollDto.id) && AbstractC22676k.m65745e(this.is_closed, downstreamPollDto.is_closed) && AbstractC22676k.m65745e(this.latest_answers, downstreamPollDto.latest_answers) && AbstractC22676k.m65745e(this.latest_votes_by_option, downstreamPollDto.latest_votes_by_option) && AbstractC22676k.m65745e(this.max_votes_allowed, downstreamPollDto.max_votes_allowed) && AbstractC22676k.m65745e(this.name, downstreamPollDto.name) && AbstractC22676k.m65745e(this.options, downstreamPollDto.options) && AbstractC22676k.m65745e(this.own_votes, downstreamPollDto.own_votes) && AbstractC22676k.m65745e(this.updated_at, downstreamPollDto.updated_at) && this.vote_count == downstreamPollDto.vote_count && AbstractC22676k.m65745e(this.vote_counts_by_option, downstreamPollDto.vote_counts_by_option) && AbstractC22676k.m65745e(this.voting_visibility, downstreamPollDto.voting_visibility) && AbstractC22676k.m65745e(this.extraData, downstreamPollDto.extraData);
    }

    public final boolean getAllow_answers() {
        return this.allow_answers;
    }

    public final boolean getAllow_user_suggested_options() {
        return this.allow_user_suggested_options;
    }

    public final int getAnswers_count() {
        return this.answers_count;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final DownstreamUserDto getCreated_by() {
        return this.created_by;
    }

    public final String getCreated_by_id() {
        return this.created_by_id;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnforce_unique_vote() {
        return this.enforce_unique_vote;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getId() {
        return this.id;
    }

    public final List<DownstreamVoteDto> getLatest_answers() {
        return this.latest_answers;
    }

    public final Map<String, List<DownstreamVoteDto>> getLatest_votes_by_option() {
        return this.latest_votes_by_option;
    }

    public final Integer getMax_votes_allowed() {
        return this.max_votes_allowed;
    }

    public final String getName() {
        return this.name;
    }

    public final List<DownstreamPollOptionDto> getOptions() {
        return this.options;
    }

    public final List<DownstreamVoteDto> getOwn_votes() {
        return this.own_votes;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final int getVote_count() {
        return this.vote_count;
    }

    public final Map<String, Integer> getVote_counts_by_option() {
        return this.vote_counts_by_option;
    }

    public final String getVoting_visibility() {
        return this.voting_visibility;
    }

    public int hashCode() {
        int iM124373c = AbstractC38963t7.m124373c(this.created_at, AbstractC11266d.m30448b(this.answers_count, AbstractC2875y.m8289b(Boolean.hashCode(this.allow_answers) * 31, 31, this.allow_user_suggested_options), 31), 31);
        DownstreamUserDto downstreamUserDto = this.created_by;
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM124373c + (downstreamUserDto == null ? 0 : downstreamUserDto.hashCode())) * 31, 31, this.created_by_id), 31, this.description), 31, this.enforce_unique_vote), 31, this.id);
        Boolean bool = this.is_closed;
        int iHashCode = (iM30450d + (bool == null ? 0 : bool.hashCode())) * 31;
        List<DownstreamVoteDto> list = this.latest_answers;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, List<DownstreamVoteDto>> map = this.latest_votes_by_option;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.max_votes_allowed;
        int iM30448b = AbstractC11266d.m30448b(this.vote_count, AbstractC38963t7.m124373c(this.updated_at, AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30450d((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.name), 31, this.options), 31, this.own_votes), 31), 31);
        Map<String, Integer> map2 = this.vote_counts_by_option;
        int iHashCode4 = (iM30448b + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str = this.voting_visibility;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map3 = this.extraData;
        return iHashCode5 + (map3 != null ? map3.hashCode() : 0);
    }

    public final Boolean is_closed() {
        return this.is_closed;
    }

    public String toString() {
        boolean z4 = this.allow_answers;
        boolean z13 = this.allow_user_suggested_options;
        int i13 = this.answers_count;
        Date date = this.created_at;
        DownstreamUserDto downstreamUserDto = this.created_by;
        String str = this.created_by_id;
        String str2 = this.description;
        boolean z14 = this.enforce_unique_vote;
        String str3 = this.id;
        Boolean bool = this.is_closed;
        List<DownstreamVoteDto> list = this.latest_answers;
        Map<String, List<DownstreamVoteDto>> map = this.latest_votes_by_option;
        Integer num = this.max_votes_allowed;
        String str4 = this.name;
        List<DownstreamPollOptionDto> list2 = this.options;
        List<DownstreamVoteDto> list3 = this.own_votes;
        Date date2 = this.updated_at;
        int i14 = this.vote_count;
        Map<String, Integer> map2 = this.vote_counts_by_option;
        String str5 = this.voting_visibility;
        Map<String, Object> map3 = this.extraData;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("DownstreamPollDto(allow_answers=", ", allow_user_suggested_options=", ", answers_count=", z4, z13);
        sbM32002u.append(i13);
        sbM32002u.append(", created_at=");
        sbM32002u.append(date);
        sbM32002u.append(", created_by=");
        AbstractC11478a.m30865q(sbM32002u, downstreamUserDto, ", created_by_id=", str, ", description=");
        AbstractC38963t7.m124390t(sbM32002u, str2, ", enforce_unique_vote=", z14, ", id=");
        AbstractC36095b.m114692t(bool, str3, ", is_closed=", ", latest_answers=", sbM32002u);
        sbM32002u.append(list);
        sbM32002u.append(", latest_votes_by_option=");
        sbM32002u.append(map);
        sbM32002u.append(", max_votes_allowed=");
        AbstractC13673n.m38577x(num, ", name=", str4, ", options=", sbM32002u);
        AbstractC21702c.m61148s(sbM32002u, list2, ", own_votes=", list3, ", updated_at=");
        sbM32002u.append(date2);
        sbM32002u.append(", vote_count=");
        sbM32002u.append(i14);
        sbM32002u.append(", vote_counts_by_option=");
        sbM32002u.append(map2);
        sbM32002u.append(", voting_visibility=");
        sbM32002u.append(str5);
        sbM32002u.append(", extraData=");
        return AbstractC13673n.m38565l(sbM32002u, map3, ")");
    }
}
