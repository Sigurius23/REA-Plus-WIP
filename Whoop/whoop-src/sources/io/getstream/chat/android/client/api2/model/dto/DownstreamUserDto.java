package io.getstream.chat.android.client.api2.model.dto;

import androidx.profileinstaller.ProfileVerifier;
import hc3.AbstractC17176i;
import io.getstream.chat.android.core.internal.StreamHandsOff;
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
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@StreamHandsOff(reason = "Field names can't be changed because [CustomObjectDtoAdapter] class uses reflections to add/remove content of [extraData] map")
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\bI\b\u0081\b\u0018\u00002\u00020\u0001B¹\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000e\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\b\u0010%\u001a\u0004\u0018\u00010&\u0012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0\u001f¢\u0006\u0004\b)\u0010*J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00101J\u000b\u0010V\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010X\u001a\u00020\bHÆ\u0003J\u0011\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\t\u0010Z\u001a\u00020\bHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010_\u001a\u00020\u0017HÆ\u0003J\t\u0010`\u001a\u00020\u0017HÆ\u0003J\t\u0010a\u001a\u00020\u0017HÆ\u0003J\t\u0010b\u001a\u00020\u0017HÆ\u0003J\u0011\u0010c\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000eHÆ\u0003J\u000f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003J\u0017\u0010e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001fHÆ\u0003J\u0011\u0010f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000eHÆ\u0003J\u0011\u0010g\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u0010\u0010h\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0002\u0010LJ\u000b\u0010i\u001a\u0004\u0018\u00010&HÆ\u0003J\u0015\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0\u001fHÆ\u0003Jè\u0002\u0010k\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00172\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000e2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000e2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0\u001fHÆ\u0001¢\u0006\u0002\u0010lJ\u0013\u0010m\u001a\u00020\b2\b\u0010n\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010o\u001a\u00020\u0017HÖ\u0001J\t\u0010p\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010,R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010,R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b:\u00107R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b=\u0010<R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b>\u0010<R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b?\u0010<R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u0018\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bB\u0010AR\u0011\u0010\u0019\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bC\u0010AR\u0011\u0010\u001a\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bD\u0010AR\u0019\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bE\u00109R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\b\n\u0000\u001a\u0004\bF\u00109R\u001f\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0019\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bI\u00109R\u0019\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bJ\u00109R\u0015\u0010#\u001a\u0004\u0018\u00010$¢\u0006\n\n\u0002\u0010M\u001a\u0004\bK\u0010LR\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u001d\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0\u001f¢\u0006\b\n\u0000\u001a\u0004\bP\u0010H¨\u0006q"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "id", "", "name", "image", "role", "invisible", "", "privacy_settings", "Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;", "language", "banned", "devices", "", "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;", "online", "created_at", "Ljava/util/Date;", "deactivated_at", "updated_at", "last_active", "total_unread_count", "", "unread_channels", "unread_count", "unread_threads", "mutes", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMuteDto;", "teams", "teams_role", "", "channel_mutes", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;", "blocked_user_ids", "avg_response_time", "", "push_preferences", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;", "extraData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;ZLjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;IIIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getName", "getImage", "getRole", "getInvisible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPrivacy_settings", "()Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;", "getLanguage", "getBanned", "()Z", "getDevices", "()Ljava/util/List;", "getOnline", "getCreated_at", "()Ljava/util/Date;", "getDeactivated_at", "getUpdated_at", "getLast_active", "getTotal_unread_count", "()I", "getUnread_channels", "getUnread_count", "getUnread_threads", "getMutes", "getTeams", "getTeams_role", "()Ljava/util/Map;", "getChannel_mutes", "getBlocked_user_ids", "getAvg_response_time", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPush_preferences", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;", "getExtraData", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;ZLjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;IIIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamUserDto implements ExtraDataDto {
    private final Long avg_response_time;
    private final boolean banned;
    private final List<String> blocked_user_ids;
    private final List<DownstreamChannelMuteDto> channel_mutes;
    private final Date created_at;
    private final Date deactivated_at;
    private final List<DeviceDto> devices;
    private final Map<String, Object> extraData;
    private final String id;
    private final String image;
    private final Boolean invisible;
    private final String language;
    private final Date last_active;
    private final List<DownstreamMuteDto> mutes;
    private final String name;
    private final boolean online;
    private final PrivacySettingsDto privacy_settings;
    private final DownstreamPushPreferenceDto push_preferences;
    private final String role;
    private final List<String> teams;
    private final Map<String, String> teams_role;
    private final int total_unread_count;
    private final int unread_channels;
    private final int unread_count;
    private final int unread_threads;
    private final Date updated_at;

    public DownstreamUserDto(String id4, String str, String str2, String role, Boolean bool, PrivacySettingsDto privacySettingsDto, String str3, boolean z4, List<DeviceDto> list, boolean z13, Date date, Date date2, Date date3, Date date4, int i13, int i14, int i15, int i16, List<DownstreamMuteDto> list2, List<String> teams, Map<String, String> map, List<DownstreamChannelMuteDto> list3, List<String> list4, Long l7, DownstreamPushPreferenceDto downstreamPushPreferenceDto, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(teams, "teams");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.id = id4;
        this.name = str;
        this.image = str2;
        this.role = role;
        this.invisible = bool;
        this.privacy_settings = privacySettingsDto;
        this.language = str3;
        this.banned = z4;
        this.devices = list;
        this.online = z13;
        this.created_at = date;
        this.deactivated_at = date2;
        this.updated_at = date3;
        this.last_active = date4;
        this.total_unread_count = i13;
        this.unread_channels = i14;
        this.unread_count = i15;
        this.unread_threads = i16;
        this.mutes = list2;
        this.teams = teams;
        this.teams_role = map;
        this.channel_mutes = list3;
        this.blocked_user_ids = list4;
        this.avg_response_time = l7;
        this.push_preferences = downstreamPushPreferenceDto;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DownstreamUserDto copy$default(DownstreamUserDto downstreamUserDto, String str, String str2, String str3, String str4, Boolean bool, PrivacySettingsDto privacySettingsDto, String str5, boolean z4, List list, boolean z13, Date date, Date date2, Date date3, Date date4, int i13, int i14, int i15, int i16, List list2, List list3, Map map, List list4, List list5, Long l7, DownstreamPushPreferenceDto downstreamPushPreferenceDto, Map map2, int i17, Object obj) {
        Map map3;
        DownstreamPushPreferenceDto downstreamPushPreferenceDto2;
        String str6 = (i17 & 1) != 0 ? downstreamUserDto.id : str;
        String str7 = (i17 & 2) != 0 ? downstreamUserDto.name : str2;
        String str8 = (i17 & 4) != 0 ? downstreamUserDto.image : str3;
        String str9 = (i17 & 8) != 0 ? downstreamUserDto.role : str4;
        Boolean bool2 = (i17 & 16) != 0 ? downstreamUserDto.invisible : bool;
        PrivacySettingsDto privacySettingsDto2 = (i17 & 32) != 0 ? downstreamUserDto.privacy_settings : privacySettingsDto;
        String str10 = (i17 & 64) != 0 ? downstreamUserDto.language : str5;
        boolean z14 = (i17 & 128) != 0 ? downstreamUserDto.banned : z4;
        List list6 = (i17 & 256) != 0 ? downstreamUserDto.devices : list;
        boolean z15 = (i17 & 512) != 0 ? downstreamUserDto.online : z13;
        Date date5 = (i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? downstreamUserDto.created_at : date;
        Date date6 = (i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? downstreamUserDto.deactivated_at : date2;
        Date date7 = (i17 & 4096) != 0 ? downstreamUserDto.updated_at : date3;
        Date date8 = (i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? downstreamUserDto.last_active : date4;
        String str11 = str6;
        int i18 = (i17 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? downstreamUserDto.total_unread_count : i13;
        int i19 = (i17 & 32768) != 0 ? downstreamUserDto.unread_channels : i14;
        int i24 = (i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? downstreamUserDto.unread_count : i15;
        int i25 = (i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? downstreamUserDto.unread_threads : i16;
        List list7 = (i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? downstreamUserDto.mutes : list2;
        List list8 = (i17 & 524288) != 0 ? downstreamUserDto.teams : list3;
        Map map4 = (i17 & 1048576) != 0 ? downstreamUserDto.teams_role : map;
        List list9 = (i17 & 2097152) != 0 ? downstreamUserDto.channel_mutes : list4;
        List list10 = (i17 & 4194304) != 0 ? downstreamUserDto.blocked_user_ids : list5;
        Long l12 = (i17 & 8388608) != 0 ? downstreamUserDto.avg_response_time : l7;
        DownstreamPushPreferenceDto downstreamPushPreferenceDto3 = (i17 & 16777216) != 0 ? downstreamUserDto.push_preferences : downstreamPushPreferenceDto;
        if ((i17 & AndroidSDKConstants.FLAG_MUTABLE) != 0) {
            downstreamPushPreferenceDto2 = downstreamPushPreferenceDto3;
            map3 = downstreamUserDto.extraData;
        } else {
            map3 = map2;
            downstreamPushPreferenceDto2 = downstreamPushPreferenceDto3;
        }
        return downstreamUserDto.copy(str11, str7, str8, str9, bool2, privacySettingsDto2, str10, z14, list6, z15, date5, date6, date7, date8, i18, i19, i24, i25, list7, list8, map4, list9, list10, l12, downstreamPushPreferenceDto2, map3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getOnline() {
        return this.online;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Date getDeactivated_at() {
        return this.deactivated_at;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Date getLast_active() {
        return this.last_active;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getTotal_unread_count() {
        return this.total_unread_count;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getUnread_channels() {
        return this.unread_channels;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getUnread_count() {
        return this.unread_count;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getUnread_threads() {
        return this.unread_threads;
    }

    public final List<DownstreamMuteDto> component19() {
        return this.mutes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<String> component20() {
        return this.teams;
    }

    public final Map<String, String> component21() {
        return this.teams_role;
    }

    public final List<DownstreamChannelMuteDto> component22() {
        return this.channel_mutes;
    }

    public final List<String> component23() {
        return this.blocked_user_ids;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Long getAvg_response_time() {
        return this.avg_response_time;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final DownstreamPushPreferenceDto getPush_preferences() {
        return this.push_preferences;
    }

    public final Map<String, Object> component26() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getInvisible() {
        return this.invisible;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PrivacySettingsDto getPrivacy_settings() {
        return this.privacy_settings;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getBanned() {
        return this.banned;
    }

    public final List<DeviceDto> component9() {
        return this.devices;
    }

    public final DownstreamUserDto copy(String id4, String name, String image, String role, Boolean invisible, PrivacySettingsDto privacy_settings, String language, boolean banned, List<DeviceDto> devices, boolean online, Date created_at, Date deactivated_at, Date updated_at, Date last_active, int total_unread_count, int unread_channels, int unread_count, int unread_threads, List<DownstreamMuteDto> mutes, List<String> teams, Map<String, String> teams_role, List<DownstreamChannelMuteDto> channel_mutes, List<String> blocked_user_ids, Long avg_response_time, DownstreamPushPreferenceDto push_preferences, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(teams, "teams");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new DownstreamUserDto(id4, name, image, role, invisible, privacy_settings, language, banned, devices, online, created_at, deactivated_at, updated_at, last_active, total_unread_count, unread_channels, unread_count, unread_threads, mutes, teams, teams_role, channel_mutes, blocked_user_ids, avg_response_time, push_preferences, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamUserDto)) {
            return false;
        }
        DownstreamUserDto downstreamUserDto = (DownstreamUserDto) other;
        return AbstractC22676k.m65745e(this.id, downstreamUserDto.id) && AbstractC22676k.m65745e(this.name, downstreamUserDto.name) && AbstractC22676k.m65745e(this.image, downstreamUserDto.image) && AbstractC22676k.m65745e(this.role, downstreamUserDto.role) && AbstractC22676k.m65745e(this.invisible, downstreamUserDto.invisible) && AbstractC22676k.m65745e(this.privacy_settings, downstreamUserDto.privacy_settings) && AbstractC22676k.m65745e(this.language, downstreamUserDto.language) && this.banned == downstreamUserDto.banned && AbstractC22676k.m65745e(this.devices, downstreamUserDto.devices) && this.online == downstreamUserDto.online && AbstractC22676k.m65745e(this.created_at, downstreamUserDto.created_at) && AbstractC22676k.m65745e(this.deactivated_at, downstreamUserDto.deactivated_at) && AbstractC22676k.m65745e(this.updated_at, downstreamUserDto.updated_at) && AbstractC22676k.m65745e(this.last_active, downstreamUserDto.last_active) && this.total_unread_count == downstreamUserDto.total_unread_count && this.unread_channels == downstreamUserDto.unread_channels && this.unread_count == downstreamUserDto.unread_count && this.unread_threads == downstreamUserDto.unread_threads && AbstractC22676k.m65745e(this.mutes, downstreamUserDto.mutes) && AbstractC22676k.m65745e(this.teams, downstreamUserDto.teams) && AbstractC22676k.m65745e(this.teams_role, downstreamUserDto.teams_role) && AbstractC22676k.m65745e(this.channel_mutes, downstreamUserDto.channel_mutes) && AbstractC22676k.m65745e(this.blocked_user_ids, downstreamUserDto.blocked_user_ids) && AbstractC22676k.m65745e(this.avg_response_time, downstreamUserDto.avg_response_time) && AbstractC22676k.m65745e(this.push_preferences, downstreamUserDto.push_preferences) && AbstractC22676k.m65745e(this.extraData, downstreamUserDto.extraData);
    }

    public final Long getAvg_response_time() {
        return this.avg_response_time;
    }

    public final boolean getBanned() {
        return this.banned;
    }

    public final List<String> getBlocked_user_ids() {
        return this.blocked_user_ids;
    }

    public final List<DownstreamChannelMuteDto> getChannel_mutes() {
        return this.channel_mutes;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final Date getDeactivated_at() {
        return this.deactivated_at;
    }

    public final List<DeviceDto> getDevices() {
        return this.devices;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final Boolean getInvisible() {
        return this.invisible;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Date getLast_active() {
        return this.last_active;
    }

    public final List<DownstreamMuteDto> getMutes() {
        return this.mutes;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getOnline() {
        return this.online;
    }

    public final PrivacySettingsDto getPrivacy_settings() {
        return this.privacy_settings;
    }

    public final DownstreamPushPreferenceDto getPush_preferences() {
        return this.push_preferences;
    }

    public final String getRole() {
        return this.role;
    }

    public final List<String> getTeams() {
        return this.teams;
    }

    public final Map<String, String> getTeams_role() {
        return this.teams_role;
    }

    public final int getTotal_unread_count() {
        return this.total_unread_count;
    }

    public final int getUnread_channels() {
        return this.unread_channels;
    }

    public final int getUnread_count() {
        return this.unread_count;
    }

    public final int getUnread_threads() {
        return this.unread_threads;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.image;
        int iM30450d = AbstractC11266d.m30450d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.role);
        Boolean bool = this.invisible;
        int iHashCode3 = (iM30450d + (bool == null ? 0 : bool.hashCode())) * 31;
        PrivacySettingsDto privacySettingsDto = this.privacy_settings;
        int iHashCode4 = (iHashCode3 + (privacySettingsDto == null ? 0 : privacySettingsDto.hashCode())) * 31;
        String str3 = this.language;
        int iM8289b = AbstractC2875y.m8289b((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.banned);
        List<DeviceDto> list = this.devices;
        int iM8289b2 = AbstractC2875y.m8289b((iM8289b + (list == null ? 0 : list.hashCode())) * 31, 31, this.online);
        Date date = this.created_at;
        int iHashCode5 = (iM8289b2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.deactivated_at;
        int iHashCode6 = (iHashCode5 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.updated_at;
        int iHashCode7 = (iHashCode6 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.last_active;
        int iM30448b = AbstractC11266d.m30448b(this.unread_threads, AbstractC11266d.m30448b(this.unread_count, AbstractC11266d.m30448b(this.unread_channels, AbstractC11266d.m30448b(this.total_unread_count, (iHashCode7 + (date4 == null ? 0 : date4.hashCode())) * 31, 31), 31), 31), 31);
        List<DownstreamMuteDto> list2 = this.mutes;
        int iM31983b = AbstractC11895b.m31983b((iM30448b + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.teams);
        Map<String, String> map = this.teams_role;
        int iHashCode8 = (iM31983b + (map == null ? 0 : map.hashCode())) * 31;
        List<DownstreamChannelMuteDto> list3 = this.channel_mutes;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.blocked_user_ids;
        int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Long l7 = this.avg_response_time;
        int iHashCode11 = (iHashCode10 + (l7 == null ? 0 : l7.hashCode())) * 31;
        DownstreamPushPreferenceDto downstreamPushPreferenceDto = this.push_preferences;
        return this.extraData.hashCode() + ((iHashCode11 + (downstreamPushPreferenceDto != null ? downstreamPushPreferenceDto.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.image;
        String str4 = this.role;
        Boolean bool = this.invisible;
        PrivacySettingsDto privacySettingsDto = this.privacy_settings;
        String str5 = this.language;
        boolean z4 = this.banned;
        List<DeviceDto> list = this.devices;
        boolean z13 = this.online;
        Date date = this.created_at;
        Date date2 = this.deactivated_at;
        Date date3 = this.updated_at;
        Date date4 = this.last_active;
        int i13 = this.total_unread_count;
        int i14 = this.unread_channels;
        int i15 = this.unread_count;
        int i16 = this.unread_threads;
        List<DownstreamMuteDto> list2 = this.mutes;
        List<String> list3 = this.teams;
        Map<String, String> map = this.teams_role;
        List<DownstreamChannelMuteDto> list4 = this.channel_mutes;
        List<String> list5 = this.blocked_user_ids;
        Long l7 = this.avg_response_time;
        DownstreamPushPreferenceDto downstreamPushPreferenceDto = this.push_preferences;
        Map<String, Object> map2 = this.extraData;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DownstreamUserDto(id=", str, ", name=", str2, ", image=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", role=", str4, ", invisible=");
        sbM32001t.append(bool);
        sbM32001t.append(", privacy_settings=");
        sbM32001t.append(privacySettingsDto);
        sbM32001t.append(", language=");
        AbstractC38963t7.m124390t(sbM32001t, str5, ", banned=", z4, ", devices=");
        AbstractC26725a.m79512p(", online=", ", created_at=", sbM32001t, list, z13);
        AbstractC17176i.m48512n(sbM32001t, date, ", deactivated_at=", date2, ", updated_at=");
        AbstractC17176i.m48512n(sbM32001t, date3, ", last_active=", date4, ", total_unread_count=");
        AbstractC30802r.m94773v(sbM32001t, i13, ", unread_channels=", i14, ", unread_count=");
        AbstractC30802r.m94773v(sbM32001t, i15, ", unread_threads=", i16, ", mutes=");
        AbstractC21702c.m61148s(sbM32001t, list2, ", teams=", list3, ", teams_role=");
        sbM32001t.append(map);
        sbM32001t.append(", channel_mutes=");
        sbM32001t.append(list4);
        sbM32001t.append(", blocked_user_ids=");
        sbM32001t.append(list5);
        sbM32001t.append(", avg_response_time=");
        sbM32001t.append(l7);
        sbM32001t.append(", push_preferences=");
        sbM32001t.append(downstreamPushPreferenceDto);
        sbM32001t.append(", extraData=");
        sbM32001t.append(map2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ DownstreamUserDto(String str, String str2, String str3, String str4, Boolean bool, PrivacySettingsDto privacySettingsDto, String str5, boolean z4, List list, boolean z13, Date date, Date date2, Date date3, Date date4, int i13, int i14, int i15, int i16, List list2, List list3, Map map, List list4, List list5, Long l7, DownstreamPushPreferenceDto downstreamPushPreferenceDto, Map map2, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i17 & 16) != 0 ? Boolean.FALSE : bool, privacySettingsDto, str5, z4, list, z13, date, date2, date3, date4, (i17 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? 0 : i13, (32768 & i17) != 0 ? 0 : i14, (65536 & i17) != 0 ? 0 : i15, (131072 & i17) != 0 ? 0 : i16, list2, (i17 & 524288) != 0 ? C25271y.f99162w : list3, map, list4, list5, l7, downstreamPushPreferenceDto, map2);
    }
}
