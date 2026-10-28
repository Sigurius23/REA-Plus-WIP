package io.getstream.chat.android.models;

import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import hc3.AbstractC17176i;
import io.getstream.chat.android.DeliveryReceipts;
import io.getstream.chat.android.PrivacySettings;
import io.getstream.chat.android.ReadReceipts;
import io.getstream.chat.android.TypingIndicators;
import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import m83.AbstractC25247g0;
import m83.C25271y;
import m83.C25272z;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b.\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001yBÉ\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001e\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000f\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020'0\u001e\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b)\u0010*J\u0016\u0010U\u001a\b\u0012\u0002\b\u0003\u0018\u00010V2\u0006\u0010W\u001a\u00020\u0004H\u0016J\b\u0010X\u001a\u00020YH\u0007J\t\u0010Z\u001a\u00020\u0004HÆ\u0003J\t\u0010[\u001a\u00020\u0004HÆ\u0003J\t\u0010\\\u001a\u00020\u0004HÆ\u0003J\t\u0010]\u001a\u00020\u0004HÆ\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00101J\u000b\u0010_\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010`\u001a\u00020\u0004HÆ\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00101J\u000f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\t\u0010c\u001a\u00020\tHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010g\u001a\u00020\u0017HÆ\u0003J\t\u0010h\u001a\u00020\u0017HÆ\u0003J\t\u0010i\u001a\u00020\u0017HÆ\u0003J\u000f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000fHÆ\u0003J\u000f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fHÆ\u0003J\u0015\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001eHÆ\u0003J\u000f\u0010m\u001a\b\u0012\u0004\u0012\u00020 0\u000fHÆ\u0003J\u000f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fHÆ\u0003J\u0010\u0010o\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0002\u0010JJ\u000b\u0010p\u001a\u0004\u0018\u00010%HÆ\u0003J\u0015\u0010q\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020'0\u001eHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0013HÆ\u0003JÐ\u0002\u0010s\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001e2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000f2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020'0\u001e2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010tJ\u0013\u0010u\u001a\u00020\t2\b\u0010v\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010w\u001a\u00020\u0017HÖ\u0001J\t\u0010x\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010,R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010,R\u0015\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00102\u001a\u0004\b6\u00101R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b=\u0010<R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b>\u0010<R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u0018\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bA\u0010@R\u0011\u0010\u0019\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bB\u0010@R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f¢\u0006\b\n\u0000\u001a\u0004\bC\u00108R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\b\n\u0000\u001a\u0004\bD\u00108R\u001d\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001e¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000f¢\u0006\b\n\u0000\u001a\u0004\bG\u00108R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\b\n\u0000\u001a\u0004\bH\u00108R\u0015\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\n\n\u0002\u0010K\u001a\u0004\bI\u0010JR\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020'0\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010FR\u0013\u0010(\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bO\u0010<R\u0011\u0010P\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bP\u0010:R\u0011\u0010Q\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bQ\u0010:R\u0011\u0010R\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bR\u0010:R\u0011\u0010S\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bS\u0010:R\u0011\u0010T\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bT\u0010:¨\u0006z"}, m65681d2 = {"Lio/getstream/chat/android/models/User;", "Lio/getstream/chat/android/models/CustomObject;", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", "id", "", "role", "name", "image", "invisible", "", "privacySettings", "Lio/getstream/chat/android/PrivacySettings;", "language", "banned", "devices", "", "Lio/getstream/chat/android/models/Device;", "online", "createdAt", "Ljava/util/Date;", "updatedAt", "lastActive", "totalUnreadCount", "", "unreadChannels", "unreadThreads", "mutes", "Lio/getstream/chat/android/models/Mute;", "teams", "teamsRole", "", "channelMutes", "Lio/getstream/chat/android/models/ChannelMute;", "blockedUserIds", "avgResponseTime", "", "pushPreference", "Lio/getstream/chat/android/models/PushPreference;", "extraData", "", "deactivatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;)V", "getId", "()Ljava/lang/String;", "getRole", "getName", "getImage", "getInvisible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPrivacySettings", "()Lio/getstream/chat/android/PrivacySettings;", "getLanguage", "getBanned", "getDevices", "()Ljava/util/List;", "getOnline", "()Z", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getLastActive", "getTotalUnreadCount", "()I", "getUnreadChannels", "getUnreadThreads", "getMutes", "getTeams", "getTeamsRole", "()Ljava/util/Map;", "getChannelMutes", "getBlockedUserIds", "getAvgResponseTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPushPreference", "()Lio/getstream/chat/android/models/PushPreference;", "getExtraData", "getDeactivatedAt", "isBanned", "isInvisible", "isTypingIndicatorsEnabled", "isReadReceiptsEnabled", "isDeliveryReceiptsEnabled", "getComparableField", "", "fieldName", "newBuilder", "Lio/getstream/chat/android/models/User$Builder;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;)Lio/getstream/chat/android/models/User;", "equals", "other", "hashCode", "toString", "Builder", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class User implements CustomObject, ComparableFieldProvider {
    private final Long avgResponseTime;
    private final Boolean banned;
    private final List<String> blockedUserIds;
    private final List<ChannelMute> channelMutes;
    private final Date createdAt;
    private final Date deactivatedAt;
    private final List<Device> devices;
    private final Map<String, Object> extraData;
    private final String id;
    private final String image;
    private final Boolean invisible;
    private final String language;
    private final Date lastActive;
    private final List<Mute> mutes;
    private final String name;
    private final boolean online;
    private final PrivacySettings privacySettings;
    private final PushPreference pushPreference;
    private final String role;
    private final List<String> teams;
    private final Map<String, String> teamsRole;
    private final int totalUnreadCount;
    private final int unreadChannels;
    private final int unreadThreads;
    private final Date updatedAt;

    public User() {
        this(null, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554431, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, String str4, Boolean bool, PrivacySettings privacySettings, String str5, Boolean bool2, List list, boolean z4, Date date, Date date2, Date date3, int i13, int i14, int i15, List list2, List list3, Map map, List list4, List list5, Long l7, PushPreference pushPreference, Map map2, Date date4, int i16, Object obj) {
        Date date5;
        Map map3;
        String str6 = (i16 & 1) != 0 ? user.id : str;
        String str7 = (i16 & 2) != 0 ? user.role : str2;
        String str8 = (i16 & 4) != 0 ? user.name : str3;
        String str9 = (i16 & 8) != 0 ? user.image : str4;
        Boolean bool3 = (i16 & 16) != 0 ? user.invisible : bool;
        PrivacySettings privacySettings2 = (i16 & 32) != 0 ? user.privacySettings : privacySettings;
        String str10 = (i16 & 64) != 0 ? user.language : str5;
        Boolean bool4 = (i16 & 128) != 0 ? user.banned : bool2;
        List list6 = (i16 & 256) != 0 ? user.devices : list;
        boolean z13 = (i16 & 512) != 0 ? user.online : z4;
        Date date6 = (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? user.createdAt : date;
        Date date7 = (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? user.updatedAt : date2;
        Date date8 = (i16 & 4096) != 0 ? user.lastActive : date3;
        int i17 = (i16 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? user.totalUnreadCount : i13;
        String str11 = str6;
        int i18 = (i16 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? user.unreadChannels : i14;
        int i19 = (i16 & 32768) != 0 ? user.unreadThreads : i15;
        List list7 = (i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? user.mutes : list2;
        List list8 = (i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? user.teams : list3;
        Map map4 = (i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? user.teamsRole : map;
        List list9 = (i16 & 524288) != 0 ? user.channelMutes : list4;
        List list10 = (i16 & 1048576) != 0 ? user.blockedUserIds : list5;
        Long l12 = (i16 & 2097152) != 0 ? user.avgResponseTime : l7;
        PushPreference pushPreference2 = (i16 & 4194304) != 0 ? user.pushPreference : pushPreference;
        Map map5 = (i16 & 8388608) != 0 ? user.extraData : map2;
        if ((i16 & 16777216) != 0) {
            map3 = map5;
            date5 = user.deactivatedAt;
        } else {
            date5 = date4;
            map3 = map5;
        }
        return user.copy(str11, str7, str8, str9, bool3, privacySettings2, str10, bool4, list6, z13, date6, date7, date8, i17, i18, i19, list7, list8, map4, list9, list10, l12, pushPreference2, map3, date5);
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
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Date getLastActive() {
        return this.lastActive;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getTotalUnreadCount() {
        return this.totalUnreadCount;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getUnreadChannels() {
        return this.unreadChannels;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getUnreadThreads() {
        return this.unreadThreads;
    }

    public final List<Mute> component17() {
        return this.mutes;
    }

    public final List<String> component18() {
        return this.teams;
    }

    public final Map<String, String> component19() {
        return this.teamsRole;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    public final List<ChannelMute> component20() {
        return this.channelMutes;
    }

    public final List<String> component21() {
        return this.blockedUserIds;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Long getAvgResponseTime() {
        return this.avgResponseTime;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final PushPreference getPushPreference() {
        return this.pushPreference;
    }

    public final Map<String, Object> component24() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Date getDeactivatedAt() {
        return this.deactivatedAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getInvisible() {
        return this.invisible;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PrivacySettings getPrivacySettings() {
        return this.privacySettings;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getBanned() {
        return this.banned;
    }

    public final List<Device> component9() {
        return this.devices;
    }

    public final User copy(String id4, String role, String name, String image, Boolean invisible, PrivacySettings privacySettings, String language, Boolean banned, List<Device> devices, boolean online, Date createdAt, Date updatedAt, Date lastActive, int totalUnreadCount, int unreadChannels, int unreadThreads, List<Mute> mutes, List<String> teams, Map<String, String> teamsRole, List<ChannelMute> channelMutes, List<String> blockedUserIds, Long avgResponseTime, PushPreference pushPreference, Map<String, ? extends Object> extraData, Date deactivatedAt) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(language, "language");
        AbstractC22676k.m65750j(devices, "devices");
        AbstractC22676k.m65750j(mutes, "mutes");
        AbstractC22676k.m65750j(teams, "teams");
        AbstractC22676k.m65750j(teamsRole, "teamsRole");
        AbstractC22676k.m65750j(channelMutes, "channelMutes");
        AbstractC22676k.m65750j(blockedUserIds, "blockedUserIds");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new User(id4, role, name, image, invisible, privacySettings, language, banned, devices, online, createdAt, updatedAt, lastActive, totalUnreadCount, unreadChannels, unreadThreads, mutes, teams, teamsRole, channelMutes, blockedUserIds, avgResponseTime, pushPreference, extraData, deactivatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return AbstractC22676k.m65745e(this.id, user.id) && AbstractC22676k.m65745e(this.role, user.role) && AbstractC22676k.m65745e(this.name, user.name) && AbstractC22676k.m65745e(this.image, user.image) && AbstractC22676k.m65745e(this.invisible, user.invisible) && AbstractC22676k.m65745e(this.privacySettings, user.privacySettings) && AbstractC22676k.m65745e(this.language, user.language) && AbstractC22676k.m65745e(this.banned, user.banned) && AbstractC22676k.m65745e(this.devices, user.devices) && this.online == user.online && AbstractC22676k.m65745e(this.createdAt, user.createdAt) && AbstractC22676k.m65745e(this.updatedAt, user.updatedAt) && AbstractC22676k.m65745e(this.lastActive, user.lastActive) && this.totalUnreadCount == user.totalUnreadCount && this.unreadChannels == user.unreadChannels && this.unreadThreads == user.unreadThreads && AbstractC22676k.m65745e(this.mutes, user.mutes) && AbstractC22676k.m65745e(this.teams, user.teams) && AbstractC22676k.m65745e(this.teamsRole, user.teamsRole) && AbstractC22676k.m65745e(this.channelMutes, user.channelMutes) && AbstractC22676k.m65745e(this.blockedUserIds, user.blockedUserIds) && AbstractC22676k.m65745e(this.avgResponseTime, user.avgResponseTime) && AbstractC22676k.m65745e(this.pushPreference, user.pushPreference) && AbstractC22676k.m65745e(this.extraData, user.extraData) && AbstractC22676k.m65745e(this.deactivatedAt, user.deactivatedAt);
    }

    public final Long getAvgResponseTime() {
        return this.avgResponseTime;
    }

    public final Boolean getBanned() {
        return this.banned;
    }

    public final List<String> getBlockedUserIds() {
        return this.blockedUserIds;
    }

    public final List<ChannelMute> getChannelMutes() {
        return this.channelMutes;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x013e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0120, code lost:
    
        if (r2.equals("total_unread_count") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0129, code lost:
    
        return java.lang.Integer.valueOf(r1.totalUnreadCount);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0130, code lost:
    
        if (r2.equals("updatedAt") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0145, code lost:
    
        return r1.updatedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r2.equals("lastActive") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        return r1.lastActive;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r2.equals("created_at") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r2.equals("totalUnreadCount") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if (r2.equals("createdAt") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return r1.createdAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r2.equals("deactivated_at") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0094, code lost:
    
        if (r2.equals("deactivatedAt") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009a, code lost:
    
        return r1.deactivatedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a1, code lost:
    
        if (r2.equals("updated_at") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ab, code lost:
    
        if (r2.equals("avg_response_time") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b1, code lost:
    
        return r1.avgResponseTime;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b8, code lost:
    
        if (r2.equals("unreadThreads") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r2.equals("avgResponseTime") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d3, code lost:
    
        if (r2.equals("unreadChannels") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f4, code lost:
    
        if (r2.equals("unread_threads") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00fd, code lost:
    
        return java.lang.Integer.valueOf(r1.unreadThreads);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0104, code lost:
    
        if (r2.equals("unread_channels") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x010d, code lost:
    
        return java.lang.Integer.valueOf(r1.unreadChannels);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r2.equals("last_active") == false) goto L106;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.getstream.chat.android.models.querysort.ComparableFieldProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Comparable<?> getComparableField(java.lang.String r2) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.models.User.getComparableField(java.lang.String):java.lang.Comparable");
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Date getDeactivatedAt() {
        return this.deactivatedAt;
    }

    public final List<Device> getDevices() {
        return this.devices;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public <T> T getExtraValue(String str, T t14) {
        return (T) super.getExtraValue(str, t14);
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

    public final Date getLastActive() {
        return this.lastActive;
    }

    public final List<Mute> getMutes() {
        return this.mutes;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getOnline() {
        return this.online;
    }

    public final PrivacySettings getPrivacySettings() {
        return this.privacySettings;
    }

    public final PushPreference getPushPreference() {
        return this.pushPreference;
    }

    public final String getRole() {
        return this.role;
    }

    public final List<String> getTeams() {
        return this.teams;
    }

    public final Map<String, String> getTeamsRole() {
        return this.teamsRole;
    }

    public final int getTotalUnreadCount() {
        return this.totalUnreadCount;
    }

    public final int getUnreadChannels() {
        return this.unreadChannels;
    }

    public final int getUnreadThreads() {
        return this.unreadThreads;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.role), 31, this.name), 31, this.image);
        Boolean bool = this.invisible;
        int iHashCode = (iM30450d + (bool == null ? 0 : bool.hashCode())) * 31;
        PrivacySettings privacySettings = this.privacySettings;
        int iM30450d2 = AbstractC11266d.m30450d((iHashCode + (privacySettings == null ? 0 : privacySettings.hashCode())) * 31, 31, this.language);
        Boolean bool2 = this.banned;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b((iM30450d2 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.devices), 31, this.online);
        Date date = this.createdAt;
        int iHashCode2 = (iM8289b + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.updatedAt;
        int iHashCode3 = (iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.lastActive;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC3855a.m11821e(this.teamsRole, AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.unreadThreads, AbstractC11266d.m30448b(this.unreadChannels, AbstractC11266d.m30448b(this.totalUnreadCount, (iHashCode3 + (date3 == null ? 0 : date3.hashCode())) * 31, 31), 31), 31), 31, this.mutes), 31, this.teams), 31), 31, this.channelMutes), 31, this.blockedUserIds);
        Long l7 = this.avgResponseTime;
        int iHashCode4 = (iM31983b + (l7 == null ? 0 : l7.hashCode())) * 31;
        PushPreference pushPreference = this.pushPreference;
        int iM11821e = AbstractC3855a.m11821e(this.extraData, (iHashCode4 + (pushPreference == null ? 0 : pushPreference.hashCode())) * 31, 31);
        Date date4 = this.deactivatedAt;
        return iM11821e + (date4 != null ? date4.hashCode() : 0);
    }

    public final boolean isBanned() {
        return AbstractC22676k.m65745e(this.banned, Boolean.TRUE);
    }

    public final boolean isDeliveryReceiptsEnabled() {
        DeliveryReceipts deliveryReceipts;
        PrivacySettings privacySettings = this.privacySettings;
        if (privacySettings == null || (deliveryReceipts = privacySettings.getDeliveryReceipts()) == null) {
            return true;
        }
        return deliveryReceipts.getEnabled();
    }

    public final boolean isInvisible() {
        return AbstractC22676k.m65745e(this.invisible, Boolean.TRUE);
    }

    public final boolean isReadReceiptsEnabled() {
        ReadReceipts readReceipts;
        PrivacySettings privacySettings = this.privacySettings;
        if (privacySettings == null || (readReceipts = privacySettings.getReadReceipts()) == null) {
            return true;
        }
        return readReceipts.getEnabled();
    }

    public final boolean isTypingIndicatorsEnabled() {
        TypingIndicators typingIndicators;
        PrivacySettings privacySettings = this.privacySettings;
        if (privacySettings == null || (typingIndicators = privacySettings.getTypingIndicators()) == null) {
            return true;
        }
        return typingIndicators.getEnabled();
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.role;
        String str3 = this.name;
        String str4 = this.image;
        Boolean bool = this.invisible;
        PrivacySettings privacySettings = this.privacySettings;
        String str5 = this.language;
        Boolean bool2 = this.banned;
        List<Device> list = this.devices;
        boolean z4 = this.online;
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        Date date3 = this.lastActive;
        int i13 = this.totalUnreadCount;
        int i14 = this.unreadChannels;
        int i15 = this.unreadThreads;
        List<Mute> list2 = this.mutes;
        List<String> list3 = this.teams;
        Map<String, String> map = this.teamsRole;
        List<ChannelMute> list4 = this.channelMutes;
        List<String> list5 = this.blockedUserIds;
        Long l7 = this.avgResponseTime;
        PushPreference pushPreference = this.pushPreference;
        Map<String, Object> map2 = this.extraData;
        Date date4 = this.deactivatedAt;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("User(id=", str, ", role=", str2, ", name=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", image=", str4, ", invisible=");
        sbM32001t.append(bool);
        sbM32001t.append(", privacySettings=");
        sbM32001t.append(privacySettings);
        sbM32001t.append(", language=");
        AbstractC36095b.m114692t(bool2, str5, ", banned=", ", devices=", sbM32001t);
        AbstractC26725a.m79512p(", online=", ", createdAt=", sbM32001t, list, z4);
        AbstractC17176i.m48512n(sbM32001t, date, ", updatedAt=", date2, ", lastActive=");
        sbM32001t.append(date3);
        sbM32001t.append(", totalUnreadCount=");
        sbM32001t.append(i13);
        sbM32001t.append(", unreadChannels=");
        AbstractC30802r.m94773v(sbM32001t, i14, ", unreadThreads=", i15, ", mutes=");
        AbstractC21702c.m61148s(sbM32001t, list2, ", teams=", list3, ", teamsRole=");
        sbM32001t.append(map);
        sbM32001t.append(", channelMutes=");
        sbM32001t.append(list4);
        sbM32001t.append(", blockedUserIds=");
        sbM32001t.append(list5);
        sbM32001t.append(", avgResponseTime=");
        sbM32001t.append(l7);
        sbM32001t.append(", pushPreference=");
        sbM32001t.append(pushPreference);
        sbM32001t.append(", extraData=");
        sbM32001t.append(map2);
        sbM32001t.append(", deactivatedAt=");
        return AbstractC13673n.m38564k(sbM32001t, date4, ")");
    }

    public User(String id4, String role, String name, String image, Boolean bool, PrivacySettings privacySettings, String language, Boolean bool2, List<Device> devices, boolean z4, Date date, Date date2, Date date3, int i13, int i14, int i15, List<Mute> mutes, List<String> teams, Map<String, String> teamsRole, List<ChannelMute> channelMutes, List<String> blockedUserIds, Long l7, PushPreference pushPreference, Map<String, ? extends Object> extraData, Date date4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(language, "language");
        AbstractC22676k.m65750j(devices, "devices");
        AbstractC22676k.m65750j(mutes, "mutes");
        AbstractC22676k.m65750j(teams, "teams");
        AbstractC22676k.m65750j(teamsRole, "teamsRole");
        AbstractC22676k.m65750j(channelMutes, "channelMutes");
        AbstractC22676k.m65750j(blockedUserIds, "blockedUserIds");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.id = id4;
        this.role = role;
        this.name = name;
        this.image = image;
        this.invisible = bool;
        this.privacySettings = privacySettings;
        this.language = language;
        this.banned = bool2;
        this.devices = devices;
        this.online = z4;
        this.createdAt = date;
        this.updatedAt = date2;
        this.lastActive = date3;
        this.totalUnreadCount = i13;
        this.unreadChannels = i14;
        this.unreadThreads = i15;
        this.mutes = mutes;
        this.teams = teams;
        this.teamsRole = teamsRole;
        this.channelMutes = channelMutes;
        this.blockedUserIds = blockedUserIds;
        this.avgResponseTime = l7;
        this.pushPreference = pushPreference;
        this.extraData = extraData;
        this.deactivatedAt = date4;
    }

    @Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u00100\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\bJ\u000e\u00101\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bJ\u0015\u00102\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u00103J\u0010\u00104\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000e\u00105\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\bJ\u0015\u00106\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u00103J\u0014\u00107\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u000e\u00108\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\rJ\u0010\u00109\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010:\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018J\u0010\u0010;\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010=\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010>\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001cJ\u0014\u0010?\u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0014J\u0014\u0010@\u001a\u00020\u00002\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0014J\u001a\u0010A\u001a\u00020\u00002\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0#J\u0014\u0010B\u001a\u00020\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0014J\u0014\u0010C\u001a\u00020\u00002\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0014J\u000e\u0010D\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(J\u0010\u0010E\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010+J\u001a\u0010F\u001a\u00020\u00002\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010#J\u0010\u0010G\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010\u0018J\u0006\u0010H\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0004\n\u0002\u0010)R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006I"}, m65681d2 = {"Lio/getstream/chat/android/models/User$Builder;", "", "<init>", "()V", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "(Lio/getstream/chat/android/models/User;)V", "id", "", "role", "name", "image", "invisible", "", "Ljava/lang/Boolean;", "privacySettings", "Lio/getstream/chat/android/PrivacySettings;", "language", "banned", "devices", "", "Lio/getstream/chat/android/models/Device;", "online", "createdAt", "Ljava/util/Date;", "updatedAt", "lastActive", "totalUnreadCount", "", "unreadChannels", "unreadThreads", "mutes", "Lio/getstream/chat/android/models/Mute;", "teams", "teamsRole", "", "channelMutes", "Lio/getstream/chat/android/models/ChannelMute;", "blockedUserIds", "avgResponseTime", "", "Ljava/lang/Long;", "pushPreference", "Lio/getstream/chat/android/models/PushPreference;", "extraData", "deactivatedAt", "withId", "withRole", "withName", "withImage", "withInvisible", "(Ljava/lang/Boolean;)Lio/getstream/chat/android/models/User$Builder;", "withPrivacySettings", "withLanguage", "withBanned", "withDevices", "withOnline", "withCreatedAt", "withUpdatedAt", "withLastActive", "withTotalUnreadCount", "withUnreadChannels", "withUnreadThreads", "withMutes", "withTeams", "withTeamsRole", "withChannelMutes", "withBlockedUserIds", "withAvgResponseTime", "withPushPreference", "withExtraData", "withDeactivatedAt", "build", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Builder {
        private Long avgResponseTime;
        private Boolean banned;
        private List<String> blockedUserIds;
        private List<ChannelMute> channelMutes;
        private Date createdAt;
        private Date deactivatedAt;
        private List<Device> devices;
        private Map<String, ? extends Object> extraData;
        private String id;
        private String image;
        private Boolean invisible;
        private String language;
        private Date lastActive;
        private List<Mute> mutes;
        private String name;
        private boolean online;
        private PrivacySettings privacySettings;
        private PushPreference pushPreference;
        private String role;
        private List<String> teams;
        private Map<String, String> teamsRole;
        private int totalUnreadCount;
        private int unreadChannels;
        private int unreadThreads;
        private Date updatedAt;

        public Builder() {
            this.id = "";
            this.role = "";
            this.name = "";
            this.image = "";
            this.language = "";
            C25271y c25271y = C25271y.f99162w;
            this.devices = c25271y;
            this.mutes = c25271y;
            this.teams = c25271y;
            this.teamsRole = C25272z.f99163w;
            this.channelMutes = c25271y;
            this.blockedUserIds = c25271y;
            this.extraData = new LinkedHashMap();
        }

        public final User build() {
            return new User(this.id, this.role, this.name, this.image, this.invisible, this.privacySettings, this.language, this.banned, this.devices, this.online, this.createdAt, this.updatedAt, this.lastActive, this.totalUnreadCount, this.unreadChannels, this.unreadThreads, this.mutes, this.teams, this.teamsRole, this.channelMutes, this.blockedUserIds, this.avgResponseTime, this.pushPreference, AbstractC25247g0.m74003l0(this.extraData), this.deactivatedAt);
        }

        public final Builder withAvgResponseTime(long avgResponseTime) {
            this.avgResponseTime = Long.valueOf(avgResponseTime);
            return this;
        }

        public final Builder withBanned(Boolean banned) {
            this.banned = banned;
            return this;
        }

        public final Builder withBlockedUserIds(List<String> blockedUserIds) {
            AbstractC22676k.m65750j(blockedUserIds, "blockedUserIds");
            this.blockedUserIds = blockedUserIds;
            return this;
        }

        public final Builder withChannelMutes(List<ChannelMute> channelMutes) {
            AbstractC22676k.m65750j(channelMutes, "channelMutes");
            this.channelMutes = channelMutes;
            return this;
        }

        public final Builder withCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public final Builder withDeactivatedAt(Date deactivatedAt) {
            this.deactivatedAt = deactivatedAt;
            return this;
        }

        public final Builder withDevices(List<Device> devices) {
            AbstractC22676k.m65750j(devices, "devices");
            this.devices = devices;
            return this;
        }

        public final Builder withExtraData(Map<String, ? extends Object> extraData) {
            AbstractC22676k.m65750j(extraData, "extraData");
            this.extraData = extraData;
            return this;
        }

        public final Builder withId(String id4) {
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
            return this;
        }

        public final Builder withImage(String image) {
            AbstractC22676k.m65750j(image, "image");
            this.image = image;
            return this;
        }

        public final Builder withInvisible(Boolean invisible) {
            this.invisible = invisible;
            return this;
        }

        public final Builder withLanguage(String language) {
            AbstractC22676k.m65750j(language, "language");
            this.language = language;
            return this;
        }

        public final Builder withLastActive(Date lastActive) {
            this.lastActive = lastActive;
            return this;
        }

        public final Builder withMutes(List<Mute> mutes) {
            AbstractC22676k.m65750j(mutes, "mutes");
            this.mutes = mutes;
            return this;
        }

        public final Builder withName(String name) {
            AbstractC22676k.m65750j(name, "name");
            this.name = name;
            return this;
        }

        public final Builder withOnline(boolean online) {
            this.online = online;
            return this;
        }

        public final Builder withPrivacySettings(PrivacySettings privacySettings) {
            this.privacySettings = privacySettings;
            return this;
        }

        public final Builder withPushPreference(PushPreference pushPreference) {
            this.pushPreference = pushPreference;
            return this;
        }

        public final Builder withRole(String role) {
            AbstractC22676k.m65750j(role, "role");
            this.role = role;
            return this;
        }

        public final Builder withTeams(List<String> teams) {
            AbstractC22676k.m65750j(teams, "teams");
            this.teams = teams;
            return this;
        }

        public final Builder withTeamsRole(Map<String, String> teamsRole) {
            AbstractC22676k.m65750j(teamsRole, "teamsRole");
            this.teamsRole = teamsRole;
            return this;
        }

        public final Builder withTotalUnreadCount(int totalUnreadCount) {
            this.totalUnreadCount = totalUnreadCount;
            return this;
        }

        public final Builder withUnreadChannels(int unreadChannels) {
            this.unreadChannels = unreadChannels;
            return this;
        }

        public final Builder withUnreadThreads(int unreadThreads) {
            this.unreadThreads = unreadThreads;
            return this;
        }

        public final Builder withUpdatedAt(Date updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(User user) {
            this();
            AbstractC22676k.m65750j(user, "user");
            this.id = user.getId();
            this.role = user.getRole();
            this.name = user.getName();
            this.image = user.getImage();
            this.invisible = user.getInvisible();
            this.privacySettings = user.getPrivacySettings();
            this.language = user.getLanguage();
            this.banned = user.getBanned();
            this.devices = user.getDevices();
            this.online = user.getOnline();
            this.createdAt = user.getCreatedAt();
            this.updatedAt = user.getUpdatedAt();
            this.lastActive = user.getLastActive();
            this.totalUnreadCount = user.getTotalUnreadCount();
            this.unreadChannels = user.getUnreadChannels();
            this.unreadThreads = user.getUnreadThreads();
            this.mutes = user.getMutes();
            this.teams = user.getTeams();
            this.teamsRole = user.getTeamsRole();
            this.channelMutes = user.getChannelMutes();
            this.blockedUserIds = user.getBlockedUserIds();
            this.avgResponseTime = user.getAvgResponseTime();
            this.pushPreference = user.getPushPreference();
            this.extraData = user.getExtraData();
            this.deactivatedAt = user.getDeactivatedAt();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ User(String str, String str2, String str3, String str4, Boolean bool, PrivacySettings privacySettings, String str5, Boolean bool2, List list, boolean z4, Date date, Date date2, Date date3, int i13, int i14, int i15, List list2, List list3, Map map, List list4, List list5, Long l7, PushPreference pushPreference, Map map2, Date date4, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        String str6 = (i16 & 1) != 0 ? "" : str;
        String str7 = (i16 & 2) != 0 ? "" : str2;
        String str8 = (i16 & 4) != 0 ? "" : str3;
        String str9 = (i16 & 8) != 0 ? "" : str4;
        Boolean bool3 = (i16 & 16) != 0 ? null : bool;
        PrivacySettings privacySettings2 = (i16 & 32) != 0 ? null : privacySettings;
        String str10 = (i16 & 64) == 0 ? str5 : "";
        Boolean bool4 = (i16 & 128) != 0 ? null : bool2;
        int i17 = i16 & 256;
        List list6 = C25271y.f99162w;
        List list7 = i17 != 0 ? list6 : list;
        boolean z13 = (i16 & 512) != 0 ? false : z4;
        Date date5 = (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : date;
        Date date6 = (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : date2;
        Date date7 = (i16 & 4096) != 0 ? null : date3;
        int i18 = (i16 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? 0 : i13;
        String str11 = str6;
        int i19 = (i16 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? 0 : i14;
        int i24 = (i16 & 32768) != 0 ? 0 : i15;
        List list8 = (i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? list6 : list2;
        List list9 = (i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? list6 : list3;
        int i25 = i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
        Map map3 = C25272z.f99163w;
        this(str11, str7, str8, str9, bool3, privacySettings2, str10, bool4, list7, z13, date5, date6, date7, i18, i19, i24, list8, list9, i25 != 0 ? map3 : map, (i16 & 524288) != 0 ? list6 : list4, (i16 & 1048576) == 0 ? list5 : list6, (i16 & 2097152) != 0 ? null : l7, (i16 & 4194304) != 0 ? null : pushPreference, (i16 & 8388608) == 0 ? map2 : map3, (i16 & 16777216) != 0 ? null : date4);
    }
}
