package io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal;

import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import d13.AbstractC11478a;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.member.internal.MemberEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.userread.internal.ChannelUserReadEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.LocationEntity;
import io.getstream.chat.android.models.SyncStatus;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import live.hms.video.utils.AndroidSDKConstants;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bQ\b\u0081\b\u0018\u00002\u00020\u0001B\u00ad\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0010\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0012\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\u0003\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030#\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0013\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u000b\u0012\b\u0010'\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b(\u0010)J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\bHÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\t\u0010]\u001a\u00020\rHÆ\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010_\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0015\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\t\u0010a\u001a\u00020\bHÆ\u0003J\u000f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\t\u0010c\u001a\u00020\bHÆ\u0003J\u0015\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u0012HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0015\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0012HÆ\u0003J\t\u0010k\u001a\u00020 HÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\u000f\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00030#HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000f\u0010o\u001a\b\u0012\u0004\u0012\u00020&0\u000bHÆ\u0003J\u0010\u0010p\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010PJê\u0002\u0010q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\b2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00122\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00032\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00132\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u000b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010rJ\u0013\u0010s\u001a\u00020\r2\b\u0010t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010u\u001a\u00020\bHÖ\u0001J\t\u0010v\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u0014\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b=\u00100R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b>\u00103R\u0011\u0010\u0016\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b?\u00100R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u0012¢\u0006\b\n\u0000\u001a\u0004\b@\u0010<R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bA\u0010:R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010+R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bC\u0010:R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bD\u0010:R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bE\u0010:R\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\bF\u0010<R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010+R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030#¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010$\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u000b¢\u0006\b\n\u0000\u001a\u0004\bN\u00103R\u0015\u0010'\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010Q\u001a\u0004\bO\u0010PR\u001e\u0010R\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010+\"\u0004\bT\u0010U¨\u0006w"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;", "", "type", "", "channelId", "name", "image", "cooldown", "", "createdByUserId", "filterTags", "", "frozen", "", "hidden", "hideMessagesBefore", "Ljava/util/Date;", QueryChannelRequest.KEY_MEMBERS, "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;", "memberCount", "watcherIds", "watcherCount", "reads", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;", "lastMessageAt", "lastMessageId", "createdAt", "updatedAt", "deletedAt", "extraData", "syncStatus", "Lio/getstream/chat/android/models/SyncStatus;", "team", "ownCapabilities", "", "membership", "activeLiveLocations", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;", "messageCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/util/Date;Ljava/util/Map;ILjava/util/List;ILjava/util/Map;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/Set;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;Ljava/util/List;Ljava/lang/Integer;)V", "getType", "()Ljava/lang/String;", "getChannelId", "getName", "getImage", "getCooldown", "()I", "getCreatedByUserId", "getFilterTags", "()Ljava/util/List;", "getFrozen", "()Z", "getHidden", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHideMessagesBefore", "()Ljava/util/Date;", "getMembers", "()Ljava/util/Map;", "getMemberCount", "getWatcherIds", "getWatcherCount", "getReads", "getLastMessageAt", "getLastMessageId", "getCreatedAt", "getUpdatedAt", "getDeletedAt", "getExtraData", "getSyncStatus", "()Lio/getstream/chat/android/models/SyncStatus;", "getTeam", "getOwnCapabilities", "()Ljava/util/Set;", "getMembership", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;", "getActiveLiveLocations", "getMessageCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "cid", "getCid", "setCid", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/util/Date;Ljava/util/Map;ILjava/util/List;ILjava/util/Map;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/Set;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;Ljava/util/List;Ljava/lang/Integer;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelEntity {
    private final List<LocationEntity> activeLiveLocations;
    private final String channelId;
    private String cid;
    private final int cooldown;
    private final Date createdAt;
    private final String createdByUserId;
    private final Date deletedAt;
    private final Map<String, Object> extraData;
    private final List<String> filterTags;
    private final boolean frozen;
    private final Boolean hidden;
    private final Date hideMessagesBefore;
    private final String image;
    private final Date lastMessageAt;
    private final String lastMessageId;
    private final int memberCount;
    private final Map<String, MemberEntity> members;
    private final MemberEntity membership;
    private final Integer messageCount;
    private final String name;
    private final Set<String> ownCapabilities;
    private final Map<String, ChannelUserReadEntity> reads;
    private final SyncStatus syncStatus;
    private final String team;
    private final String type;
    private final Date updatedAt;
    private final int watcherCount;
    private final List<String> watcherIds;

    public ChannelEntity(String type, String channelId, String name, String image, int i13, String createdByUserId, List<String> filterTags, boolean z4, Boolean bool, Date date, Map<String, MemberEntity> members, int i14, List<String> watcherIds, int i15, Map<String, ChannelUserReadEntity> reads, Date date2, String str, Date date3, Date date4, Date date5, Map<String, ? extends Object> extraData, SyncStatus syncStatus, String team, Set<String> ownCapabilities, MemberEntity memberEntity, List<LocationEntity> activeLiveLocations, Integer num) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(createdByUserId, "createdByUserId");
        AbstractC22676k.m65750j(filterTags, "filterTags");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(watcherIds, "watcherIds");
        AbstractC22676k.m65750j(reads, "reads");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(syncStatus, "syncStatus");
        AbstractC22676k.m65750j(team, "team");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(activeLiveLocations, "activeLiveLocations");
        this.type = type;
        this.channelId = channelId;
        this.name = name;
        this.image = image;
        this.cooldown = i13;
        this.createdByUserId = createdByUserId;
        this.filterTags = filterTags;
        this.frozen = z4;
        this.hidden = bool;
        this.hideMessagesBefore = date;
        this.members = members;
        this.memberCount = i14;
        this.watcherIds = watcherIds;
        this.watcherCount = i15;
        this.reads = reads;
        this.lastMessageAt = date2;
        this.lastMessageId = str;
        this.createdAt = date3;
        this.updatedAt = date4;
        this.deletedAt = date5;
        this.extraData = extraData;
        this.syncStatus = syncStatus;
        this.team = team;
        this.ownCapabilities = ownCapabilities;
        this.membership = memberEntity;
        this.activeLiveLocations = activeLiveLocations;
        this.messageCount = num;
        this.cid = String.format("%s:%s", Arrays.copyOf(new Object[]{type, channelId}, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelEntity copy$default(ChannelEntity channelEntity, String str, String str2, String str3, String str4, int i13, String str5, List list, boolean z4, Boolean bool, Date date, Map map, int i14, List list2, int i15, Map map2, Date date2, String str6, Date date3, Date date4, Date date5, Map map3, SyncStatus syncStatus, String str7, Set set, MemberEntity memberEntity, List list3, Integer num, int i16, Object obj) {
        Integer num2;
        List list4;
        String str8 = (i16 & 1) != 0 ? channelEntity.type : str;
        String str9 = (i16 & 2) != 0 ? channelEntity.channelId : str2;
        String str10 = (i16 & 4) != 0 ? channelEntity.name : str3;
        String str11 = (i16 & 8) != 0 ? channelEntity.image : str4;
        int i17 = (i16 & 16) != 0 ? channelEntity.cooldown : i13;
        String str12 = (i16 & 32) != 0 ? channelEntity.createdByUserId : str5;
        List list5 = (i16 & 64) != 0 ? channelEntity.filterTags : list;
        boolean z13 = (i16 & 128) != 0 ? channelEntity.frozen : z4;
        Boolean bool2 = (i16 & 256) != 0 ? channelEntity.hidden : bool;
        Date date6 = (i16 & 512) != 0 ? channelEntity.hideMessagesBefore : date;
        Map map4 = (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? channelEntity.members : map;
        int i18 = (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? channelEntity.memberCount : i14;
        List list6 = (i16 & 4096) != 0 ? channelEntity.watcherIds : list2;
        int i19 = (i16 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? channelEntity.watcherCount : i15;
        String str13 = str8;
        Map map5 = (i16 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? channelEntity.reads : map2;
        Date date7 = (i16 & 32768) != 0 ? channelEntity.lastMessageAt : date2;
        String str14 = (i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? channelEntity.lastMessageId : str6;
        Date date8 = (i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? channelEntity.createdAt : date3;
        Date date9 = (i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? channelEntity.updatedAt : date4;
        Date date10 = (i16 & 524288) != 0 ? channelEntity.deletedAt : date5;
        Map map6 = (i16 & 1048576) != 0 ? channelEntity.extraData : map3;
        SyncStatus syncStatus2 = (i16 & 2097152) != 0 ? channelEntity.syncStatus : syncStatus;
        String str15 = (i16 & 4194304) != 0 ? channelEntity.team : str7;
        Set set2 = (i16 & 8388608) != 0 ? channelEntity.ownCapabilities : set;
        MemberEntity memberEntity2 = (i16 & 16777216) != 0 ? channelEntity.membership : memberEntity;
        List list7 = (i16 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? channelEntity.activeLiveLocations : list3;
        if ((i16 & 67108864) != 0) {
            list4 = list7;
            num2 = channelEntity.messageCount;
        } else {
            num2 = num;
            list4 = list7;
        }
        return channelEntity.copy(str13, str9, str10, str11, i17, str12, list5, z13, bool2, date6, map4, i18, list6, i19, map5, date7, str14, date8, date9, date10, map6, syncStatus2, str15, set2, memberEntity2, list4, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Date getHideMessagesBefore() {
        return this.hideMessagesBefore;
    }

    public final Map<String, MemberEntity> component11() {
        return this.members;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getMemberCount() {
        return this.memberCount;
    }

    public final List<String> component13() {
        return this.watcherIds;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getWatcherCount() {
        return this.watcherCount;
    }

    public final Map<String, ChannelUserReadEntity> component15() {
        return this.reads;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Date getLastMessageAt() {
        return this.lastMessageAt;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getLastMessageId() {
        return this.lastMessageId;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    public final Map<String, Object> component21() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getTeam() {
        return this.team;
    }

    public final Set<String> component24() {
        return this.ownCapabilities;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final MemberEntity getMembership() {
        return this.membership;
    }

    public final List<LocationEntity> component26() {
        return this.activeLiveLocations;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Integer getMessageCount() {
        return this.messageCount;
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
    public final int getCooldown() {
        return this.cooldown;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCreatedByUserId() {
        return this.createdByUserId;
    }

    public final List<String> component7() {
        return this.filterTags;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getFrozen() {
        return this.frozen;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getHidden() {
        return this.hidden;
    }

    public final ChannelEntity copy(String type, String channelId, String name, String image, int cooldown, String createdByUserId, List<String> filterTags, boolean frozen, Boolean hidden, Date hideMessagesBefore, Map<String, MemberEntity> members, int memberCount, List<String> watcherIds, int watcherCount, Map<String, ChannelUserReadEntity> reads, Date lastMessageAt, String lastMessageId, Date createdAt, Date updatedAt, Date deletedAt, Map<String, ? extends Object> extraData, SyncStatus syncStatus, String team, Set<String> ownCapabilities, MemberEntity membership, List<LocationEntity> activeLiveLocations, Integer messageCount) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(createdByUserId, "createdByUserId");
        AbstractC22676k.m65750j(filterTags, "filterTags");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(watcherIds, "watcherIds");
        AbstractC22676k.m65750j(reads, "reads");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(syncStatus, "syncStatus");
        AbstractC22676k.m65750j(team, "team");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(activeLiveLocations, "activeLiveLocations");
        return new ChannelEntity(type, channelId, name, image, cooldown, createdByUserId, filterTags, frozen, hidden, hideMessagesBefore, members, memberCount, watcherIds, watcherCount, reads, lastMessageAt, lastMessageId, createdAt, updatedAt, deletedAt, extraData, syncStatus, team, ownCapabilities, membership, activeLiveLocations, messageCount);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelEntity)) {
            return false;
        }
        ChannelEntity channelEntity = (ChannelEntity) other;
        return AbstractC22676k.m65745e(this.type, channelEntity.type) && AbstractC22676k.m65745e(this.channelId, channelEntity.channelId) && AbstractC22676k.m65745e(this.name, channelEntity.name) && AbstractC22676k.m65745e(this.image, channelEntity.image) && this.cooldown == channelEntity.cooldown && AbstractC22676k.m65745e(this.createdByUserId, channelEntity.createdByUserId) && AbstractC22676k.m65745e(this.filterTags, channelEntity.filterTags) && this.frozen == channelEntity.frozen && AbstractC22676k.m65745e(this.hidden, channelEntity.hidden) && AbstractC22676k.m65745e(this.hideMessagesBefore, channelEntity.hideMessagesBefore) && AbstractC22676k.m65745e(this.members, channelEntity.members) && this.memberCount == channelEntity.memberCount && AbstractC22676k.m65745e(this.watcherIds, channelEntity.watcherIds) && this.watcherCount == channelEntity.watcherCount && AbstractC22676k.m65745e(this.reads, channelEntity.reads) && AbstractC22676k.m65745e(this.lastMessageAt, channelEntity.lastMessageAt) && AbstractC22676k.m65745e(this.lastMessageId, channelEntity.lastMessageId) && AbstractC22676k.m65745e(this.createdAt, channelEntity.createdAt) && AbstractC22676k.m65745e(this.updatedAt, channelEntity.updatedAt) && AbstractC22676k.m65745e(this.deletedAt, channelEntity.deletedAt) && AbstractC22676k.m65745e(this.extraData, channelEntity.extraData) && this.syncStatus == channelEntity.syncStatus && AbstractC22676k.m65745e(this.team, channelEntity.team) && AbstractC22676k.m65745e(this.ownCapabilities, channelEntity.ownCapabilities) && AbstractC22676k.m65745e(this.membership, channelEntity.membership) && AbstractC22676k.m65745e(this.activeLiveLocations, channelEntity.activeLiveLocations) && AbstractC22676k.m65745e(this.messageCount, channelEntity.messageCount);
    }

    public final List<LocationEntity> getActiveLiveLocations() {
        return this.activeLiveLocations;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getCid() {
        return this.cid;
    }

    public final int getCooldown() {
        return this.cooldown;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final String getCreatedByUserId() {
        return this.createdByUserId;
    }

    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final List<String> getFilterTags() {
        return this.filterTags;
    }

    public final boolean getFrozen() {
        return this.frozen;
    }

    public final Boolean getHidden() {
        return this.hidden;
    }

    public final Date getHideMessagesBefore() {
        return this.hideMessagesBefore;
    }

    public final String getImage() {
        return this.image;
    }

    public final Date getLastMessageAt() {
        return this.lastMessageAt;
    }

    public final String getLastMessageId() {
        return this.lastMessageId;
    }

    public final int getMemberCount() {
        return this.memberCount;
    }

    public final Map<String, MemberEntity> getMembers() {
        return this.members;
    }

    public final MemberEntity getMembership() {
        return this.membership;
    }

    public final Integer getMessageCount() {
        return this.messageCount;
    }

    public final String getName() {
        return this.name;
    }

    public final Set<String> getOwnCapabilities() {
        return this.ownCapabilities;
    }

    public final Map<String, ChannelUserReadEntity> getReads() {
        return this.reads;
    }

    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    public final String getTeam() {
        return this.team;
    }

    public final String getType() {
        return this.type;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final int getWatcherCount() {
        return this.watcherCount;
    }

    public final List<String> getWatcherIds() {
        return this.watcherIds;
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.cooldown, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.channelId), 31, this.name), 31, this.image), 31), 31, this.createdByUserId), 31, this.filterTags), 31, this.frozen);
        Boolean bool = this.hidden;
        int iHashCode = (iM8289b + (bool == null ? 0 : bool.hashCode())) * 31;
        Date date = this.hideMessagesBefore;
        int iM11821e = AbstractC3855a.m11821e(this.reads, AbstractC11266d.m30448b(this.watcherCount, AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.memberCount, AbstractC3855a.m11821e(this.members, (iHashCode + (date == null ? 0 : date.hashCode())) * 31, 31), 31), 31, this.watcherIds), 31), 31);
        Date date2 = this.lastMessageAt;
        int iHashCode2 = (iM11821e + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str = this.lastMessageId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Date date3 = this.createdAt;
        int iHashCode4 = (iHashCode3 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.updatedAt;
        int iHashCode5 = (iHashCode4 + (date4 == null ? 0 : date4.hashCode())) * 31;
        Date date5 = this.deletedAt;
        int iM73368a = AbstractC25012a.m73368a(this.ownCapabilities, AbstractC11266d.m30450d((this.syncStatus.hashCode() + AbstractC3855a.m11821e(this.extraData, (iHashCode5 + (date5 == null ? 0 : date5.hashCode())) * 31, 31)) * 31, 31, this.team), 31);
        MemberEntity memberEntity = this.membership;
        int iM31983b = AbstractC11895b.m31983b((iM73368a + (memberEntity == null ? 0 : memberEntity.hashCode())) * 31, 31, this.activeLiveLocations);
        Integer num = this.messageCount;
        return iM31983b + (num != null ? num.hashCode() : 0);
    }

    public final void setCid(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.cid = str;
    }

    public final String toString() {
        String str = this.type;
        String str2 = this.channelId;
        String str3 = this.name;
        String str4 = this.image;
        int i13 = this.cooldown;
        String str5 = this.createdByUserId;
        List<String> list = this.filterTags;
        boolean z4 = this.frozen;
        Boolean bool = this.hidden;
        Date date = this.hideMessagesBefore;
        Map<String, MemberEntity> map = this.members;
        int i14 = this.memberCount;
        List<String> list2 = this.watcherIds;
        int i15 = this.watcherCount;
        Map<String, ChannelUserReadEntity> map2 = this.reads;
        Date date2 = this.lastMessageAt;
        String str6 = this.lastMessageId;
        Date date3 = this.createdAt;
        Date date4 = this.updatedAt;
        Date date5 = this.deletedAt;
        Map<String, Object> map3 = this.extraData;
        SyncStatus syncStatus = this.syncStatus;
        String str7 = this.team;
        Set<String> set = this.ownCapabilities;
        MemberEntity memberEntity = this.membership;
        List<LocationEntity> list3 = this.activeLiveLocations;
        Integer num = this.messageCount;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ChannelEntity(type=", str, ", channelId=", str2, ", name=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", image=", str4, ", cooldown=");
        AbstractC11895b.m31979B(i13, ", createdByUserId=", str5, ", filterTags=", sbM32001t);
        AbstractC26725a.m79512p(", frozen=", ", hidden=", sbM32001t, list, z4);
        sbM32001t.append(bool);
        sbM32001t.append(", hideMessagesBefore=");
        sbM32001t.append(date);
        sbM32001t.append(", members=");
        sbM32001t.append(map);
        sbM32001t.append(", memberCount=");
        sbM32001t.append(i14);
        sbM32001t.append(", watcherIds=");
        sbM32001t.append(list2);
        sbM32001t.append(", watcherCount=");
        sbM32001t.append(i15);
        sbM32001t.append(", reads=");
        sbM32001t.append(map2);
        sbM32001t.append(", lastMessageAt=");
        sbM32001t.append(date2);
        sbM32001t.append(", lastMessageId=");
        AbstractC13673n.m38579z(sbM32001t, str6, ", createdAt=", date3, ", updatedAt=");
        AbstractC17176i.m48512n(sbM32001t, date4, ", deletedAt=", date5, ", extraData=");
        sbM32001t.append(map3);
        sbM32001t.append(", syncStatus=");
        sbM32001t.append(syncStatus);
        sbM32001t.append(", team=");
        sbM32001t.append(str7);
        sbM32001t.append(", ownCapabilities=");
        sbM32001t.append(set);
        sbM32001t.append(", membership=");
        sbM32001t.append(memberEntity);
        sbM32001t.append(", activeLiveLocations=");
        sbM32001t.append(list3);
        sbM32001t.append(", messageCount=");
        return AbstractC11478a.m30859k(sbM32001t, num, ")");
    }
}
