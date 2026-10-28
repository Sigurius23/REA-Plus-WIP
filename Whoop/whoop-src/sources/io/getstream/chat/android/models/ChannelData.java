package io.getstream.chat.android.models;

import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import d13.AbstractC11478a;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m83.C25235a0;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bó\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0014\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b!\u0010\"J\\\u0010F\u001a\u00020G2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u001f2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u001f2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00180\u001f2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u001f2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\b0\u001f2\u0006\u0010O\u001a\u00020\n2\u0006\u0010P\u001a\u00020\fJ\u000e\u0010Q\u001a\u00020\f2\u0006\u0010R\u001a\u00020\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\bHÆ\u0003J\t\u0010X\u001a\u00020\nHÆ\u0003J\t\u0010Y\u001a\u00020\fHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010]\u001a\u00020\nHÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\u0015\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0014HÆ\u0003J\u000f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u0010\u0010c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010=J\u000b\u0010d\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001fHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jþ\u0001\u0010g\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010hJ\u0013\u0010i\u001a\u00020\f2\b\u0010j\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010k\u001a\u00020\nHÖ\u0001J\t\u0010l\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u0010/R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010>\u001a\u0004\b<\u0010=R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010 \u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bC\u0010/R\u0011\u0010D\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bE\u0010$¨\u0006m"}, m65681d2 = {"Lio/getstream/chat/android/models/ChannelData;", "", "id", "", "type", "name", "image", "createdBy", "Lio/getstream/chat/android/models/User;", "cooldown", "", "frozen", "", "createdAt", "Ljava/util/Date;", "updatedAt", "deletedAt", "memberCount", "team", "extraData", "", "ownCapabilities", "", "membership", "Lio/getstream/chat/android/models/Member;", "draft", "Lio/getstream/chat/android/models/DraftMessage;", "messageCount", "pushPreference", "Lio/getstream/chat/android/models/PushPreference;", "filterTags", "", "lastMessageAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;)V", "getId", "()Ljava/lang/String;", "getType", "getName", "getImage", "getCreatedBy", "()Lio/getstream/chat/android/models/User;", "getCooldown", "()I", "getFrozen", "()Z", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getDeletedAt", "getMemberCount", "getTeam", "getExtraData", "()Ljava/util/Map;", "getOwnCapabilities", "()Ljava/util/Set;", "getMembership", "()Lio/getstream/chat/android/models/Member;", "getDraft", "()Lio/getstream/chat/android/models/DraftMessage;", "getMessageCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPushPreference", "()Lio/getstream/chat/android/models/PushPreference;", "getFilterTags", "()Ljava/util/List;", "getLastMessageAt", "cid", "getCid", "toChannel", "Lio/getstream/chat/android/models/Channel;", "messages", "Lio/getstream/chat/android/models/Message;", "cachedLatestMessages", QueryChannelRequest.KEY_MEMBERS, "reads", "Lio/getstream/chat/android/models/ChannelUserRead;", "watchers", "watcherCount", "insideSearch", "isUserAbleTo", "channelCapability", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;)Lio/getstream/chat/android/models/ChannelData;", "equals", "other", "hashCode", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelData {
    private final int cooldown;
    private final Date createdAt;
    private final User createdBy;
    private final Date deletedAt;
    private final DraftMessage draft;
    private final Map<String, Object> extraData;
    private final List<String> filterTags;
    private final boolean frozen;
    private final String id;
    private final String image;
    private final Date lastMessageAt;
    private final int memberCount;
    private final Member membership;
    private final Integer messageCount;
    private final String name;
    private final Set<String> ownCapabilities;
    private final PushPreference pushPreference;
    private final String team;
    private final String type;
    private final Date updatedAt;

    public ChannelData(String id4, String type, String name, String image, User createdBy, int i13, boolean z4, Date date, Date date2, Date date3, int i14, String team, Map<String, ? extends Object> extraData, Set<String> ownCapabilities, Member member, DraftMessage draftMessage, Integer num, PushPreference pushPreference, List<String> filterTags, Date date4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(createdBy, "createdBy");
        AbstractC22676k.m65750j(team, "team");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(filterTags, "filterTags");
        this.id = id4;
        this.type = type;
        this.name = name;
        this.image = image;
        this.createdBy = createdBy;
        this.cooldown = i13;
        this.frozen = z4;
        this.createdAt = date;
        this.updatedAt = date2;
        this.deletedAt = date3;
        this.memberCount = i14;
        this.team = team;
        this.extraData = extraData;
        this.ownCapabilities = ownCapabilities;
        this.membership = member;
        this.draft = draftMessage;
        this.messageCount = num;
        this.pushPreference = pushPreference;
        this.filterTags = filterTags;
        this.lastMessageAt = date4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelData copy$default(ChannelData channelData, String str, String str2, String str3, String str4, User user, int i13, boolean z4, Date date, Date date2, Date date3, int i14, String str5, Map map, Set set, Member member, DraftMessage draftMessage, Integer num, PushPreference pushPreference, List list, Date date4, int i15, Object obj) {
        Date date5;
        List list2;
        String str6 = (i15 & 1) != 0 ? channelData.id : str;
        String str7 = (i15 & 2) != 0 ? channelData.type : str2;
        String str8 = (i15 & 4) != 0 ? channelData.name : str3;
        String str9 = (i15 & 8) != 0 ? channelData.image : str4;
        User user2 = (i15 & 16) != 0 ? channelData.createdBy : user;
        int i16 = (i15 & 32) != 0 ? channelData.cooldown : i13;
        boolean z13 = (i15 & 64) != 0 ? channelData.frozen : z4;
        Date date6 = (i15 & 128) != 0 ? channelData.createdAt : date;
        Date date7 = (i15 & 256) != 0 ? channelData.updatedAt : date2;
        Date date8 = (i15 & 512) != 0 ? channelData.deletedAt : date3;
        int i17 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? channelData.memberCount : i14;
        String str10 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? channelData.team : str5;
        Map map2 = (i15 & 4096) != 0 ? channelData.extraData : map;
        Set set2 = (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? channelData.ownCapabilities : set;
        String str11 = str6;
        Member member2 = (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? channelData.membership : member;
        DraftMessage draftMessage2 = (i15 & 32768) != 0 ? channelData.draft : draftMessage;
        Integer num2 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? channelData.messageCount : num;
        PushPreference pushPreference2 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? channelData.pushPreference : pushPreference;
        List list3 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? channelData.filterTags : list;
        if ((i15 & 524288) != 0) {
            list2 = list3;
            date5 = channelData.lastMessageAt;
        } else {
            date5 = date4;
            list2 = list3;
        }
        return channelData.copy(str11, str7, str8, str9, user2, i16, z13, date6, date7, date8, i17, str10, map2, set2, member2, draftMessage2, num2, pushPreference2, list2, date5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getMemberCount() {
        return this.memberCount;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTeam() {
        return this.team;
    }

    public final Map<String, Object> component13() {
        return this.extraData;
    }

    public final Set<String> component14() {
        return this.ownCapabilities;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Member getMembership() {
        return this.membership;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final DraftMessage getDraft() {
        return this.draft;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getMessageCount() {
        return this.messageCount;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final PushPreference getPushPreference() {
        return this.pushPreference;
    }

    public final List<String> component19() {
        return this.filterTags;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Date getLastMessageAt() {
        return this.lastMessageAt;
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
    public final User getCreatedBy() {
        return this.createdBy;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getCooldown() {
        return this.cooldown;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getFrozen() {
        return this.frozen;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final ChannelData copy(String id4, String type, String name, String image, User createdBy, int cooldown, boolean frozen, Date createdAt, Date updatedAt, Date deletedAt, int memberCount, String team, Map<String, ? extends Object> extraData, Set<String> ownCapabilities, Member membership, DraftMessage draft, Integer messageCount, PushPreference pushPreference, List<String> filterTags, Date lastMessageAt) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(createdBy, "createdBy");
        AbstractC22676k.m65750j(team, "team");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(filterTags, "filterTags");
        return new ChannelData(id4, type, name, image, createdBy, cooldown, frozen, createdAt, updatedAt, deletedAt, memberCount, team, extraData, ownCapabilities, membership, draft, messageCount, pushPreference, filterTags, lastMessageAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelData)) {
            return false;
        }
        ChannelData channelData = (ChannelData) other;
        return AbstractC22676k.m65745e(this.id, channelData.id) && AbstractC22676k.m65745e(this.type, channelData.type) && AbstractC22676k.m65745e(this.name, channelData.name) && AbstractC22676k.m65745e(this.image, channelData.image) && AbstractC22676k.m65745e(this.createdBy, channelData.createdBy) && this.cooldown == channelData.cooldown && this.frozen == channelData.frozen && AbstractC22676k.m65745e(this.createdAt, channelData.createdAt) && AbstractC22676k.m65745e(this.updatedAt, channelData.updatedAt) && AbstractC22676k.m65745e(this.deletedAt, channelData.deletedAt) && this.memberCount == channelData.memberCount && AbstractC22676k.m65745e(this.team, channelData.team) && AbstractC22676k.m65745e(this.extraData, channelData.extraData) && AbstractC22676k.m65745e(this.ownCapabilities, channelData.ownCapabilities) && AbstractC22676k.m65745e(this.membership, channelData.membership) && AbstractC22676k.m65745e(this.draft, channelData.draft) && AbstractC22676k.m65745e(this.messageCount, channelData.messageCount) && AbstractC22676k.m65745e(this.pushPreference, channelData.pushPreference) && AbstractC22676k.m65745e(this.filterTags, channelData.filterTags) && AbstractC22676k.m65745e(this.lastMessageAt, channelData.lastMessageAt);
    }

    public final String getCid() {
        return (this.id.length() == 0 || this.type.length() == 0) ? "" : AbstractC18489d0.m53370k(this.type, ":", this.id);
    }

    public final int getCooldown() {
        return this.cooldown;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final User getCreatedBy() {
        return this.createdBy;
    }

    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    public final DraftMessage getDraft() {
        return this.draft;
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

    public final String getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final Date getLastMessageAt() {
        return this.lastMessageAt;
    }

    public final int getMemberCount() {
        return this.memberCount;
    }

    public final Member getMembership() {
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

    public final PushPreference getPushPreference() {
        return this.pushPreference;
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

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.cooldown, AbstractC11478a.m30850b(this.createdBy, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.type), 31, this.name), 31, this.image), 31), 31), 31, this.frozen);
        Date date = this.createdAt;
        int iHashCode = (iM8289b + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.updatedAt;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.deletedAt;
        int iM73368a = AbstractC25012a.m73368a(this.ownCapabilities, AbstractC3855a.m11821e(this.extraData, AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.memberCount, (iHashCode2 + (date3 == null ? 0 : date3.hashCode())) * 31, 31), 31, this.team), 31), 31);
        Member member = this.membership;
        int iHashCode3 = (iM73368a + (member == null ? 0 : member.hashCode())) * 31;
        DraftMessage draftMessage = this.draft;
        int iHashCode4 = (iHashCode3 + (draftMessage == null ? 0 : draftMessage.hashCode())) * 31;
        Integer num = this.messageCount;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        PushPreference pushPreference = this.pushPreference;
        int iM31983b = AbstractC11895b.m31983b((iHashCode5 + (pushPreference == null ? 0 : pushPreference.hashCode())) * 31, 31, this.filterTags);
        Date date4 = this.lastMessageAt;
        return iM31983b + (date4 != null ? date4.hashCode() : 0);
    }

    public final boolean isUserAbleTo(String channelCapability) {
        AbstractC22676k.m65750j(channelCapability, "channelCapability");
        return this.ownCapabilities.contains(channelCapability);
    }

    public final Channel toChannel(List<Message> messages, List<Message> cachedLatestMessages, List<Member> members, List<ChannelUserRead> reads, List<User> watchers, int watcherCount, boolean insideSearch) {
        AbstractC22676k.m65750j(messages, "messages");
        AbstractC22676k.m65750j(cachedLatestMessages, "cachedLatestMessages");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(reads, "reads");
        AbstractC22676k.m65750j(watchers, "watchers");
        String str = this.type;
        String str2 = this.id;
        String str3 = this.name;
        String str4 = this.image;
        List<String> list = this.filterTags;
        boolean z4 = this.frozen;
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        Date date3 = this.deletedAt;
        Map<String, Object> map = this.extraData;
        int i13 = this.cooldown;
        return new Channel(str2, str, str3, str4, watcherCount, z4, date, date3, date2, null, this.memberCount, messages, members, watchers, reads, null, this.createdBy, 0, this.team, null, null, i13, null, null, this.ownCapabilities, this.membership, cachedLatestMessages, insideSearch, this.draft, C25271y.f99162w, this.messageCount, this.pushPreference, list, this.lastMessageAt, map, 14320128, 0, null);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.type;
        String str3 = this.name;
        String str4 = this.image;
        User user = this.createdBy;
        int i13 = this.cooldown;
        boolean z4 = this.frozen;
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        Date date3 = this.deletedAt;
        int i14 = this.memberCount;
        String str5 = this.team;
        Map<String, Object> map = this.extraData;
        Set<String> set = this.ownCapabilities;
        Member member = this.membership;
        DraftMessage draftMessage = this.draft;
        Integer num = this.messageCount;
        PushPreference pushPreference = this.pushPreference;
        List<String> list = this.filterTags;
        Date date4 = this.lastMessageAt;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ChannelData(id=", str, ", type=", str2, ", name=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", image=", str4, ", createdBy=");
        sbM32001t.append(user);
        sbM32001t.append(", cooldown=");
        sbM32001t.append(i13);
        sbM32001t.append(", frozen=");
        sbM32001t.append(z4);
        sbM32001t.append(", createdAt=");
        sbM32001t.append(date);
        sbM32001t.append(", updatedAt=");
        AbstractC17176i.m48512n(sbM32001t, date2, ", deletedAt=", date3, ", memberCount=");
        AbstractC11895b.m31979B(i14, ", team=", str5, ", extraData=", sbM32001t);
        sbM32001t.append(map);
        sbM32001t.append(", ownCapabilities=");
        sbM32001t.append(set);
        sbM32001t.append(", membership=");
        sbM32001t.append(member);
        sbM32001t.append(", draft=");
        sbM32001t.append(draftMessage);
        sbM32001t.append(", messageCount=");
        sbM32001t.append(num);
        sbM32001t.append(", pushPreference=");
        sbM32001t.append(pushPreference);
        sbM32001t.append(", filterTags=");
        sbM32001t.append(list);
        sbM32001t.append(", lastMessageAt=");
        sbM32001t.append(date4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ ChannelData(String str, String str2, String str3, String str4, User user, int i13, boolean z4, Date date, Date date2, Date date3, int i14, String str5, Map map, Set set, Member member, DraftMessage draftMessage, Integer num, PushPreference pushPreference, List list, Date date4, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i15 & 4) != 0 ? "" : str3, (i15 & 8) != 0 ? "" : str4, (i15 & 16) != 0 ? new User(null, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554431, null) : user, (i15 & 32) != 0 ? 0 : i13, (i15 & 64) != 0 ? false : z4, (i15 & 128) != 0 ? null : date, (i15 & 256) != 0 ? null : date2, (i15 & 512) != 0 ? null : date3, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 0 : i14, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? "" : str5, (i15 & 4096) != 0 ? C25272z.f99163w : map, (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? C25235a0.f99113w : set, (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : member, (32768 & i15) != 0 ? null : draftMessage, (65536 & i15) != 0 ? null : num, (131072 & i15) != 0 ? null : pushPreference, (262144 & i15) != 0 ? C25271y.f99162w : list, (i15 & 524288) != 0 ? null : date4);
    }
}
