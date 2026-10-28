package io.getstream.chat.android.client.api2.model.dto;

import androidx.profileinstaller.ProfileVerifier;
import d13.AbstractC11478a;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import live.hms.video.utils.AndroidSDKConstants;
import live.hms.video.utils.HMSFieldTrials;
import m83.C25271y;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\bJ\b\u0081\b\u0018\u00002\u00020\u0001BÇ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\t\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0017\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)0(¢\u0006\u0004\b*\u0010+J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010W\u001a\u00020\tHÆ\u0003J\u0011\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\t\u0010Y\u001a\u00020\rHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010^\u001a\u00020\tHÆ\u0003J\u000f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bHÆ\u0003J\u000f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00170\u000bHÆ\u0003J\u000f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000bHÆ\u0003J\u000f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000bHÆ\u0003J\t\u0010c\u001a\u00020\u001dHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\tHÆ\u0003J\u000f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bHÆ\u0003J\u000f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000f\u0010j\u001a\b\u0012\u0004\u0012\u00020%0\u000bHÆ\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010NJ\u0015\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)0(HÆ\u0003Jì\u0002\u0010m\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\t2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\t2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)0(HÆ\u0001¢\u0006\u0002\u0010nJ\u0013\u0010o\u001a\u00020\r2\b\u0010p\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010q\u001a\u00020\tHÖ\u0001J\t\u0010r\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010-R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010-R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b:\u00109R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b;\u00109R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b<\u00109R\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b=\u00103R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b¢\u0006\b\n\u0000\u001a\u0004\b>\u00105R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b¢\u0006\b\n\u0000\u001a\u0004\b?\u00105R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b¢\u0006\b\n\u0000\u001a\u0004\b@\u00105R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b¢\u0006\b\n\u0000\u001a\u0004\bA\u00105R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010-R\u0011\u0010 \u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bG\u00103R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b¢\u0006\b\n\u0000\u001a\u0004\bH\u00105R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\bI\u00105R\u0013\u0010#\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000b¢\u0006\b\n\u0000\u001a\u0004\bL\u00105R\u0015\u0010&\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010O\u001a\u0004\bM\u0010NR\u001d\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)0(¢\u0006\b\n\u0000\u001a\u0004\bP\u0010Q¨\u0006s"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "cid", "", "id", "type", "name", "image", "watcher_count", "", "filter_tags", "", "frozen", "", "last_message_at", "Ljava/util/Date;", "created_at", "deleted_at", "updated_at", "member_count", "messages", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", QueryChannelRequest.KEY_MEMBERS, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;", "watchers", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "read", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;", "config", "Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;", "created_by", "team", "cooldown", "pinned_messages", "own_capabilities", "membership", "active_live_locations", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;", "message_count", "extraData", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)V", "getCid", "()Ljava/lang/String;", "getId", "getType", "getName", "getImage", "getWatcher_count", "()I", "getFilter_tags", "()Ljava/util/List;", "getFrozen", "()Z", "getLast_message_at", "()Ljava/util/Date;", "getCreated_at", "getDeleted_at", "getUpdated_at", "getMember_count", "getMessages", "getMembers", "getWatchers", "getRead", "getConfig", "()Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;", "getCreated_by", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getTeam", "getCooldown", "getPinned_messages", "getOwn_capabilities", "getMembership", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;", "getActive_live_locations", "getMessage_count", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamChannelDto implements ExtraDataDto {
    private final List<DownstreamLocationDto> active_live_locations;
    private final String cid;
    private final ConfigDto config;
    private final int cooldown;
    private final Date created_at;
    private final DownstreamUserDto created_by;
    private final Date deleted_at;
    private final Map<String, Object> extraData;
    private final List<String> filter_tags;
    private final boolean frozen;
    private final String id;
    private final String image;
    private final Date last_message_at;
    private final int member_count;
    private final List<DownstreamMemberDto> members;
    private final DownstreamMemberDto membership;
    private final Integer message_count;
    private final List<DownstreamMessageDto> messages;
    private final String name;
    private final List<String> own_capabilities;
    private final List<DownstreamMessageDto> pinned_messages;
    private final List<DownstreamChannelUserRead> read;
    private final String team;
    private final String type;
    private final Date updated_at;
    private final int watcher_count;
    private final List<DownstreamUserDto> watchers;

    public DownstreamChannelDto(String cid, String id4, String type, String str, String str2, int i13, List<String> list, boolean z4, Date date, Date date2, Date date3, Date date4, int i14, List<DownstreamMessageDto> messages, List<DownstreamMemberDto> members, List<DownstreamUserDto> watchers, List<DownstreamChannelUserRead> read, ConfigDto config, DownstreamUserDto downstreamUserDto, String team, int i15, List<DownstreamMessageDto> pinned_messages, List<String> own_capabilities, DownstreamMemberDto downstreamMemberDto, List<DownstreamLocationDto> active_live_locations, Integer num, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(messages, "messages");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(watchers, "watchers");
        AbstractC22676k.m65750j(read, "read");
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(team, "team");
        AbstractC22676k.m65750j(pinned_messages, "pinned_messages");
        AbstractC22676k.m65750j(own_capabilities, "own_capabilities");
        AbstractC22676k.m65750j(active_live_locations, "active_live_locations");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.cid = cid;
        this.id = id4;
        this.type = type;
        this.name = str;
        this.image = str2;
        this.watcher_count = i13;
        this.filter_tags = list;
        this.frozen = z4;
        this.last_message_at = date;
        this.created_at = date2;
        this.deleted_at = date3;
        this.updated_at = date4;
        this.member_count = i14;
        this.messages = messages;
        this.members = members;
        this.watchers = watchers;
        this.read = read;
        this.config = config;
        this.created_by = downstreamUserDto;
        this.team = team;
        this.cooldown = i15;
        this.pinned_messages = pinned_messages;
        this.own_capabilities = own_capabilities;
        this.membership = downstreamMemberDto;
        this.active_live_locations = active_live_locations;
        this.message_count = num;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DownstreamChannelDto copy$default(DownstreamChannelDto downstreamChannelDto, String str, String str2, String str3, String str4, String str5, int i13, List list, boolean z4, Date date, Date date2, Date date3, Date date4, int i14, List list2, List list3, List list4, List list5, ConfigDto configDto, DownstreamUserDto downstreamUserDto, String str6, int i15, List list6, List list7, DownstreamMemberDto downstreamMemberDto, List list8, Integer num, Map map, int i16, Object obj) {
        Map map2;
        Integer num2;
        String str7 = (i16 & 1) != 0 ? downstreamChannelDto.cid : str;
        String str8 = (i16 & 2) != 0 ? downstreamChannelDto.id : str2;
        String str9 = (i16 & 4) != 0 ? downstreamChannelDto.type : str3;
        String str10 = (i16 & 8) != 0 ? downstreamChannelDto.name : str4;
        String str11 = (i16 & 16) != 0 ? downstreamChannelDto.image : str5;
        int i17 = (i16 & 32) != 0 ? downstreamChannelDto.watcher_count : i13;
        List list9 = (i16 & 64) != 0 ? downstreamChannelDto.filter_tags : list;
        boolean z13 = (i16 & 128) != 0 ? downstreamChannelDto.frozen : z4;
        Date date5 = (i16 & 256) != 0 ? downstreamChannelDto.last_message_at : date;
        Date date6 = (i16 & 512) != 0 ? downstreamChannelDto.created_at : date2;
        Date date7 = (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? downstreamChannelDto.deleted_at : date3;
        Date date8 = (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? downstreamChannelDto.updated_at : date4;
        int i18 = (i16 & 4096) != 0 ? downstreamChannelDto.member_count : i14;
        List list10 = (i16 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? downstreamChannelDto.messages : list2;
        String str12 = str7;
        List list11 = (i16 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? downstreamChannelDto.members : list3;
        List list12 = (i16 & 32768) != 0 ? downstreamChannelDto.watchers : list4;
        List list13 = (i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? downstreamChannelDto.read : list5;
        ConfigDto configDto2 = (i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? downstreamChannelDto.config : configDto;
        DownstreamUserDto downstreamUserDto2 = (i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? downstreamChannelDto.created_by : downstreamUserDto;
        String str13 = (i16 & 524288) != 0 ? downstreamChannelDto.team : str6;
        int i19 = (i16 & 1048576) != 0 ? downstreamChannelDto.cooldown : i15;
        List list14 = (i16 & 2097152) != 0 ? downstreamChannelDto.pinned_messages : list6;
        List list15 = (i16 & 4194304) != 0 ? downstreamChannelDto.own_capabilities : list7;
        DownstreamMemberDto downstreamMemberDto2 = (i16 & 8388608) != 0 ? downstreamChannelDto.membership : downstreamMemberDto;
        List list16 = (i16 & 16777216) != 0 ? downstreamChannelDto.active_live_locations : list8;
        Integer num3 = (i16 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? downstreamChannelDto.message_count : num;
        if ((i16 & 67108864) != 0) {
            num2 = num3;
            map2 = downstreamChannelDto.extraData;
        } else {
            map2 = map;
            num2 = num3;
        }
        return downstreamChannelDto.copy(str12, str8, str9, str10, str11, i17, list9, z13, date5, date6, date7, date8, i18, list10, list11, list12, list13, configDto2, downstreamUserDto2, str13, i19, list14, list15, downstreamMemberDto2, list16, num2, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Date getDeleted_at() {
        return this.deleted_at;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getMember_count() {
        return this.member_count;
    }

    public final List<DownstreamMessageDto> component14() {
        return this.messages;
    }

    public final List<DownstreamMemberDto> component15() {
        return this.members;
    }

    public final List<DownstreamUserDto> component16() {
        return this.watchers;
    }

    public final List<DownstreamChannelUserRead> component17() {
        return this.read;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final ConfigDto getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final DownstreamUserDto getCreated_by() {
        return this.created_by;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getTeam() {
        return this.team;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getCooldown() {
        return this.cooldown;
    }

    public final List<DownstreamMessageDto> component22() {
        return this.pinned_messages;
    }

    public final List<String> component23() {
        return this.own_capabilities;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final DownstreamMemberDto getMembership() {
        return this.membership;
    }

    public final List<DownstreamLocationDto> component25() {
        return this.active_live_locations;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Integer getMessage_count() {
        return this.message_count;
    }

    public final Map<String, Object> component27() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getWatcher_count() {
        return this.watcher_count;
    }

    public final List<String> component7() {
        return this.filter_tags;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getFrozen() {
        return this.frozen;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Date getLast_message_at() {
        return this.last_message_at;
    }

    public final DownstreamChannelDto copy(String cid, String id4, String type, String name, String image, int watcher_count, List<String> filter_tags, boolean frozen, Date last_message_at, Date created_at, Date deleted_at, Date updated_at, int member_count, List<DownstreamMessageDto> messages, List<DownstreamMemberDto> members, List<DownstreamUserDto> watchers, List<DownstreamChannelUserRead> read, ConfigDto config, DownstreamUserDto created_by, String team, int cooldown, List<DownstreamMessageDto> pinned_messages, List<String> own_capabilities, DownstreamMemberDto membership, List<DownstreamLocationDto> active_live_locations, Integer message_count, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(messages, "messages");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(watchers, "watchers");
        AbstractC22676k.m65750j(read, "read");
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(team, "team");
        AbstractC22676k.m65750j(pinned_messages, "pinned_messages");
        AbstractC22676k.m65750j(own_capabilities, "own_capabilities");
        AbstractC22676k.m65750j(active_live_locations, "active_live_locations");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new DownstreamChannelDto(cid, id4, type, name, image, watcher_count, filter_tags, frozen, last_message_at, created_at, deleted_at, updated_at, member_count, messages, members, watchers, read, config, created_by, team, cooldown, pinned_messages, own_capabilities, membership, active_live_locations, message_count, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamChannelDto)) {
            return false;
        }
        DownstreamChannelDto downstreamChannelDto = (DownstreamChannelDto) other;
        return AbstractC22676k.m65745e(this.cid, downstreamChannelDto.cid) && AbstractC22676k.m65745e(this.id, downstreamChannelDto.id) && AbstractC22676k.m65745e(this.type, downstreamChannelDto.type) && AbstractC22676k.m65745e(this.name, downstreamChannelDto.name) && AbstractC22676k.m65745e(this.image, downstreamChannelDto.image) && this.watcher_count == downstreamChannelDto.watcher_count && AbstractC22676k.m65745e(this.filter_tags, downstreamChannelDto.filter_tags) && this.frozen == downstreamChannelDto.frozen && AbstractC22676k.m65745e(this.last_message_at, downstreamChannelDto.last_message_at) && AbstractC22676k.m65745e(this.created_at, downstreamChannelDto.created_at) && AbstractC22676k.m65745e(this.deleted_at, downstreamChannelDto.deleted_at) && AbstractC22676k.m65745e(this.updated_at, downstreamChannelDto.updated_at) && this.member_count == downstreamChannelDto.member_count && AbstractC22676k.m65745e(this.messages, downstreamChannelDto.messages) && AbstractC22676k.m65745e(this.members, downstreamChannelDto.members) && AbstractC22676k.m65745e(this.watchers, downstreamChannelDto.watchers) && AbstractC22676k.m65745e(this.read, downstreamChannelDto.read) && AbstractC22676k.m65745e(this.config, downstreamChannelDto.config) && AbstractC22676k.m65745e(this.created_by, downstreamChannelDto.created_by) && AbstractC22676k.m65745e(this.team, downstreamChannelDto.team) && this.cooldown == downstreamChannelDto.cooldown && AbstractC22676k.m65745e(this.pinned_messages, downstreamChannelDto.pinned_messages) && AbstractC22676k.m65745e(this.own_capabilities, downstreamChannelDto.own_capabilities) && AbstractC22676k.m65745e(this.membership, downstreamChannelDto.membership) && AbstractC22676k.m65745e(this.active_live_locations, downstreamChannelDto.active_live_locations) && AbstractC22676k.m65745e(this.message_count, downstreamChannelDto.message_count) && AbstractC22676k.m65745e(this.extraData, downstreamChannelDto.extraData);
    }

    public final List<DownstreamLocationDto> getActive_live_locations() {
        return this.active_live_locations;
    }

    public final String getCid() {
        return this.cid;
    }

    public final ConfigDto getConfig() {
        return this.config;
    }

    public final int getCooldown() {
        return this.cooldown;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final DownstreamUserDto getCreated_by() {
        return this.created_by;
    }

    public final Date getDeleted_at() {
        return this.deleted_at;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final List<String> getFilter_tags() {
        return this.filter_tags;
    }

    public final boolean getFrozen() {
        return this.frozen;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final Date getLast_message_at() {
        return this.last_message_at;
    }

    public final int getMember_count() {
        return this.member_count;
    }

    public final List<DownstreamMemberDto> getMembers() {
        return this.members;
    }

    public final DownstreamMemberDto getMembership() {
        return this.membership;
    }

    public final Integer getMessage_count() {
        return this.message_count;
    }

    public final List<DownstreamMessageDto> getMessages() {
        return this.messages;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getOwn_capabilities() {
        return this.own_capabilities;
    }

    public final List<DownstreamMessageDto> getPinned_messages() {
        return this.pinned_messages;
    }

    public final List<DownstreamChannelUserRead> getRead() {
        return this.read;
    }

    public final String getTeam() {
        return this.team;
    }

    public final String getType() {
        return this.type;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final int getWatcher_count() {
        return this.watcher_count;
    }

    public final List<DownstreamUserDto> getWatchers() {
        return this.watchers;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.cid.hashCode() * 31, 31, this.id), 31, this.type);
        String str = this.name;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.image;
        int iM30448b = AbstractC11266d.m30448b(this.watcher_count, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        List<String> list = this.filter_tags;
        int iM8289b = AbstractC2875y.m8289b((iM30448b + (list == null ? 0 : list.hashCode())) * 31, 31, this.frozen);
        Date date = this.last_message_at;
        int iHashCode2 = (iM8289b + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.created_at;
        int iHashCode3 = (iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.deleted_at;
        int iHashCode4 = (iHashCode3 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.updated_at;
        int iHashCode5 = (this.config.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.member_count, (iHashCode4 + (date4 == null ? 0 : date4.hashCode())) * 31, 31), 31, this.messages), 31, this.members), 31, this.watchers), 31, this.read)) * 31;
        DownstreamUserDto downstreamUserDto = this.created_by;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.cooldown, AbstractC11266d.m30450d((iHashCode5 + (downstreamUserDto == null ? 0 : downstreamUserDto.hashCode())) * 31, 31, this.team), 31), 31, this.pinned_messages), 31, this.own_capabilities);
        DownstreamMemberDto downstreamMemberDto = this.membership;
        int iM31983b2 = AbstractC11895b.m31983b((iM31983b + (downstreamMemberDto == null ? 0 : downstreamMemberDto.hashCode())) * 31, 31, this.active_live_locations);
        Integer num = this.message_count;
        return this.extraData.hashCode() + ((iM31983b2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.cid;
        String str2 = this.id;
        String str3 = this.type;
        String str4 = this.name;
        String str5 = this.image;
        int i13 = this.watcher_count;
        List<String> list = this.filter_tags;
        boolean z4 = this.frozen;
        Date date = this.last_message_at;
        Date date2 = this.created_at;
        Date date3 = this.deleted_at;
        Date date4 = this.updated_at;
        int i14 = this.member_count;
        List<DownstreamMessageDto> list2 = this.messages;
        List<DownstreamMemberDto> list3 = this.members;
        List<DownstreamUserDto> list4 = this.watchers;
        List<DownstreamChannelUserRead> list5 = this.read;
        ConfigDto configDto = this.config;
        DownstreamUserDto downstreamUserDto = this.created_by;
        String str6 = this.team;
        int i15 = this.cooldown;
        List<DownstreamMessageDto> list6 = this.pinned_messages;
        List<String> list7 = this.own_capabilities;
        DownstreamMemberDto downstreamMemberDto = this.membership;
        List<DownstreamLocationDto> list8 = this.active_live_locations;
        Integer num = this.message_count;
        Map<String, Object> map = this.extraData;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DownstreamChannelDto(cid=", str, ", id=", str2, ", type=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", name=", str4, ", image=");
        AbstractC11266d.m30470x(i13, str5, ", watcher_count=", ", filter_tags=", sbM32001t);
        AbstractC26725a.m79512p(", frozen=", ", last_message_at=", sbM32001t, list, z4);
        AbstractC17176i.m48512n(sbM32001t, date, ", created_at=", date2, ", deleted_at=");
        AbstractC17176i.m48512n(sbM32001t, date3, ", updated_at=", date4, ", member_count=");
        sbM32001t.append(i14);
        sbM32001t.append(", messages=");
        sbM32001t.append(list2);
        sbM32001t.append(", members=");
        AbstractC21702c.m61148s(sbM32001t, list3, ", watchers=", list4, ", read=");
        sbM32001t.append(list5);
        sbM32001t.append(", config=");
        sbM32001t.append(configDto);
        sbM32001t.append(", created_by=");
        AbstractC11478a.m30865q(sbM32001t, downstreamUserDto, ", team=", str6, ", cooldown=");
        sbM32001t.append(i15);
        sbM32001t.append(", pinned_messages=");
        sbM32001t.append(list6);
        sbM32001t.append(", own_capabilities=");
        sbM32001t.append(list7);
        sbM32001t.append(", membership=");
        sbM32001t.append(downstreamMemberDto);
        sbM32001t.append(", active_live_locations=");
        sbM32001t.append(list8);
        sbM32001t.append(", message_count=");
        sbM32001t.append(num);
        sbM32001t.append(", extraData=");
        return AbstractC13673n.m38565l(sbM32001t, map, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DownstreamChannelDto(String str, String str2, String str3, String str4, String str5, int i13, List list, boolean z4, Date date, Date date2, Date date3, Date date4, int i14, List list2, List list3, List list4, List list5, ConfigDto configDto, DownstreamUserDto downstreamUserDto, String str6, int i15, List list6, List list7, DownstreamMemberDto downstreamMemberDto, List list8, Integer num, Map map, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        int i17 = (i16 & 32) != 0 ? 0 : i13;
        int i18 = (i16 & 4096) != 0 ? 0 : i14;
        int i19 = i16 & DfuBaseService.ERROR_REMOTE_MASK;
        C25271y c25271y = C25271y.f99162w;
        this(str, str2, str3, str4, str5, i17, list, z4, date, date2, date3, date4, i18, i19 != 0 ? c25271y : list2, (i16 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c25271y : list3, (32768 & i16) != 0 ? c25271y : list4, (65536 & i16) != 0 ? c25271y : list5, configDto, downstreamUserDto, (524288 & i16) != 0 ? "" : str6, (1048576 & i16) != 0 ? 0 : i15, (2097152 & i16) != 0 ? c25271y : list6, (4194304 & i16) != 0 ? c25271y : list7, downstreamMemberDto, (16777216 & i16) != 0 ? c25271y : list8, (i16 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? null : num, map);
    }
}
