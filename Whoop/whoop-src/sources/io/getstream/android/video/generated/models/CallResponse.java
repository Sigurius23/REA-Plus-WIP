package io.getstream.android.video.generated.models;

import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import java.util.List;
import java.util.Map;
import jg3.C21682i;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bV\b\u0086\b\u0018\u00002\u00020\u0001B¥\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0007\u0012\u000e\b\u0003\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\u0016\b\u0003\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b0\u0010-J\u0010\u00101\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b1\u0010-J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010*J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010*J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010*J\u0010\u00105\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b5\u0010-J\u0010\u00106\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b6\u0010/J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b9\u0010:J\u001e\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bC\u0010-J\u0012\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bD\u0010/J\u0012\u0010E\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bG\u0010-J\u0012\u0010H\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bH\u0010/J\u0012\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bI\u0010-J\u0012\u0010J\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bL\u0010MJ®\u0002\u0010N\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u00052\b\b\u0003\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\u00022\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0003\u0010\u000f\u001a\u00020\u00072\u000e\b\u0003\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0003\u0010\u0013\u001a\u00020\u00122\u0016\b\u0003\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00142\b\b\u0003\u0010\u0017\u001a\u00020\u00162\b\b\u0003\u0010\u0019\u001a\u00020\u00182\b\b\u0003\u0010\u001b\u001a\u00020\u001a2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0003\u0010&\u001a\u0004\u0018\u00010%HÆ\u0001¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bP\u0010-J\u0010\u0010Q\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\bQ\u0010RJ\u001a\u0010T\u001a\u00020\u00022\b\u0010S\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bT\u0010UR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010V\u001a\u0004\bW\u0010*R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010V\u001a\u0004\bX\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010Y\u001a\u0004\bZ\u0010-R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010[\u001a\u0004\b\\\u0010/R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010Y\u001a\u0004\b]\u0010-R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010Y\u001a\u0004\b^\u0010-R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010V\u001a\u0004\b_\u0010*R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010V\u001a\u0004\b`\u0010*R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010V\u001a\u0004\ba\u0010*R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010Y\u001a\u0004\bb\u0010-R\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010[\u001a\u0004\bc\u0010/R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010d\u001a\u0004\be\u00108R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010f\u001a\u0004\bg\u0010:R%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010h\u001a\u0004\bi\u0010<R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010j\u001a\u0004\bk\u0010>R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010l\u001a\u0004\bm\u0010@R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010n\u001a\u0004\bo\u0010BR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010Y\u001a\u0004\bp\u0010-R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010[\u001a\u0004\bq\u0010/R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010r\u001a\u0004\bs\u0010FR\u0019\u0010 \u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010Y\u001a\u0004\bt\u0010-R\u0019\u0010!\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010[\u001a\u0004\bu\u0010/R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010Y\u001a\u0004\bv\u0010-R\u0019\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b$\u0010w\u001a\u0004\bx\u0010KR\u0019\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010y\u001a\u0004\bz\u0010M¨\u0006{"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallResponse;", "", "", "backstage", "captioning", "", "cid", "Ljg3/i;", "createdAt", "currentSessionId", "id", "recording", "transcribing", "translating", "type", "updatedAt", "", "blockedUserIds", "Lio/getstream/android/video/generated/models/UserResponse;", "createdBy", "", "custom", "Lio/getstream/android/video/generated/models/EgressResponse;", "egress", "Lio/getstream/android/video/generated/models/CallIngressResponse;", "ingress", "Lio/getstream/android/video/generated/models/CallSettingsResponse;", "settings", "channelCid", "endedAt", "", "joinAheadTimeSeconds", "routingNumber", "startsAt", "team", "Lio/getstream/android/video/generated/models/CallSessionResponse;", "session", "Lio/getstream/android/video/generated/models/ThumbnailResponse;", "thumbnails", "<init>", "(ZZLjava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljg3/i;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;Ljava/util/Map;Lio/getstream/android/video/generated/models/EgressResponse;Lio/getstream/android/video/generated/models/CallIngressResponse;Lio/getstream/android/video/generated/models/CallSettingsResponse;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallSessionResponse;Lio/getstream/android/video/generated/models/ThumbnailResponse;)V", "component1", "()Z", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljg3/i;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Ljava/util/List;", "component13", "()Lio/getstream/android/video/generated/models/UserResponse;", "component14", "()Ljava/util/Map;", "component15", "()Lio/getstream/android/video/generated/models/EgressResponse;", "component16", "()Lio/getstream/android/video/generated/models/CallIngressResponse;", "component17", "()Lio/getstream/android/video/generated/models/CallSettingsResponse;", "component18", "component19", "component20", "()Ljava/lang/Integer;", "component21", "component22", "component23", "component24", "()Lio/getstream/android/video/generated/models/CallSessionResponse;", "component25", "()Lio/getstream/android/video/generated/models/ThumbnailResponse;", "copy", "(ZZLjava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljg3/i;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;Ljava/util/Map;Lio/getstream/android/video/generated/models/EgressResponse;Lio/getstream/android/video/generated/models/CallIngressResponse;Lio/getstream/android/video/generated/models/CallSettingsResponse;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallSessionResponse;Lio/getstream/android/video/generated/models/ThumbnailResponse;)Lio/getstream/android/video/generated/models/CallResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getBackstage", "getCaptioning", "Ljava/lang/String;", "getCid", "Ljg3/i;", "getCreatedAt", "getCurrentSessionId", "getId", "getRecording", "getTranscribing", "getTranslating", "getType", "getUpdatedAt", "Ljava/util/List;", "getBlockedUserIds", "Lio/getstream/android/video/generated/models/UserResponse;", "getCreatedBy", "Ljava/util/Map;", "getCustom", "Lio/getstream/android/video/generated/models/EgressResponse;", "getEgress", "Lio/getstream/android/video/generated/models/CallIngressResponse;", "getIngress", "Lio/getstream/android/video/generated/models/CallSettingsResponse;", "getSettings", "getChannelCid", "getEndedAt", "Ljava/lang/Integer;", "getJoinAheadTimeSeconds", "getRoutingNumber", "getStartsAt", "getTeam", "Lio/getstream/android/video/generated/models/CallSessionResponse;", "getSession", "Lio/getstream/android/video/generated/models/ThumbnailResponse;", "getThumbnails", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallResponse {
    private final boolean backstage;
    private final List<String> blockedUserIds;
    private final boolean captioning;
    private final String channelCid;
    private final String cid;
    private final C21682i createdAt;
    private final UserResponse createdBy;
    private final String currentSessionId;
    private final Map<String, Object> custom;
    private final EgressResponse egress;
    private final C21682i endedAt;
    private final String id;
    private final CallIngressResponse ingress;
    private final Integer joinAheadTimeSeconds;
    private final boolean recording;
    private final String routingNumber;
    private final CallSessionResponse session;
    private final CallSettingsResponse settings;
    private final C21682i startsAt;
    private final String team;
    private final ThumbnailResponse thumbnails;
    private final boolean transcribing;
    private final boolean translating;
    private final String type;
    private final C21682i updatedAt;

    public CallResponse(@InterfaceC30731q(name = "backstage") boolean z4, @InterfaceC30731q(name = "captioning") boolean z13, @InterfaceC30731q(name = "cid") String cid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "current_session_id") String currentSessionId, @InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "recording") boolean z14, @InterfaceC30731q(name = "transcribing") boolean z15, @InterfaceC30731q(name = "translating") boolean z16, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "updated_at") C21682i updatedAt, @InterfaceC30731q(name = "blocked_user_ids") List<String> blockedUserIds, @InterfaceC30731q(name = "created_by") UserResponse createdBy, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom, @InterfaceC30731q(name = "egress") EgressResponse egress, @InterfaceC30731q(name = "ingress") CallIngressResponse ingress, @InterfaceC30731q(name = "settings") CallSettingsResponse settings, @InterfaceC30731q(name = "channel_cid") String str, @InterfaceC30731q(name = "ended_at") C21682i c21682i, @InterfaceC30731q(name = "join_ahead_time_seconds") Integer num, @InterfaceC30731q(name = "routing_number") String str2, @InterfaceC30731q(name = "starts_at") C21682i c21682i2, @InterfaceC30731q(name = "team") String str3, @InterfaceC30731q(name = "session") CallSessionResponse callSessionResponse, @InterfaceC30731q(name = "thumbnails") ThumbnailResponse thumbnailResponse) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(currentSessionId, "currentSessionId");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(blockedUserIds, "blockedUserIds");
        AbstractC22676k.m65750j(createdBy, "createdBy");
        AbstractC22676k.m65750j(custom, "custom");
        AbstractC22676k.m65750j(egress, "egress");
        AbstractC22676k.m65750j(ingress, "ingress");
        AbstractC22676k.m65750j(settings, "settings");
        this.backstage = z4;
        this.captioning = z13;
        this.cid = cid;
        this.createdAt = createdAt;
        this.currentSessionId = currentSessionId;
        this.id = id4;
        this.recording = z14;
        this.transcribing = z15;
        this.translating = z16;
        this.type = type;
        this.updatedAt = updatedAt;
        this.blockedUserIds = blockedUserIds;
        this.createdBy = createdBy;
        this.custom = custom;
        this.egress = egress;
        this.ingress = ingress;
        this.settings = settings;
        this.channelCid = str;
        this.endedAt = c21682i;
        this.joinAheadTimeSeconds = num;
        this.routingNumber = str2;
        this.startsAt = c21682i2;
        this.team = str3;
        this.session = callSessionResponse;
        this.thumbnails = thumbnailResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallResponse copy$default(CallResponse callResponse, boolean z4, boolean z13, String str, C21682i c21682i, String str2, String str3, boolean z14, boolean z15, boolean z16, String str4, C21682i c21682i2, List list, UserResponse userResponse, Map map, EgressResponse egressResponse, CallIngressResponse callIngressResponse, CallSettingsResponse callSettingsResponse, String str5, C21682i c21682i3, Integer num, String str6, C21682i c21682i4, String str7, CallSessionResponse callSessionResponse, ThumbnailResponse thumbnailResponse, int i13, Object obj) {
        ThumbnailResponse thumbnailResponse2;
        CallSessionResponse callSessionResponse2;
        boolean z17 = (i13 & 1) != 0 ? callResponse.backstage : z4;
        boolean z18 = (i13 & 2) != 0 ? callResponse.captioning : z13;
        String str8 = (i13 & 4) != 0 ? callResponse.cid : str;
        C21682i c21682i5 = (i13 & 8) != 0 ? callResponse.createdAt : c21682i;
        String str9 = (i13 & 16) != 0 ? callResponse.currentSessionId : str2;
        String str10 = (i13 & 32) != 0 ? callResponse.id : str3;
        boolean z19 = (i13 & 64) != 0 ? callResponse.recording : z14;
        boolean z24 = (i13 & 128) != 0 ? callResponse.transcribing : z15;
        boolean z25 = (i13 & 256) != 0 ? callResponse.translating : z16;
        String str11 = (i13 & 512) != 0 ? callResponse.type : str4;
        C21682i c21682i6 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? callResponse.updatedAt : c21682i2;
        List list2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? callResponse.blockedUserIds : list;
        UserResponse userResponse2 = (i13 & 4096) != 0 ? callResponse.createdBy : userResponse;
        Map map2 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? callResponse.custom : map;
        boolean z26 = z17;
        EgressResponse egressResponse2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? callResponse.egress : egressResponse;
        CallIngressResponse callIngressResponse2 = (i13 & 32768) != 0 ? callResponse.ingress : callIngressResponse;
        CallSettingsResponse callSettingsResponse2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? callResponse.settings : callSettingsResponse;
        String str12 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? callResponse.channelCid : str5;
        C21682i c21682i7 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? callResponse.endedAt : c21682i3;
        Integer num2 = (i13 & 524288) != 0 ? callResponse.joinAheadTimeSeconds : num;
        String str13 = (i13 & 1048576) != 0 ? callResponse.routingNumber : str6;
        C21682i c21682i8 = (i13 & 2097152) != 0 ? callResponse.startsAt : c21682i4;
        String str14 = (i13 & 4194304) != 0 ? callResponse.team : str7;
        CallSessionResponse callSessionResponse3 = (i13 & 8388608) != 0 ? callResponse.session : callSessionResponse;
        if ((i13 & 16777216) != 0) {
            callSessionResponse2 = callSessionResponse3;
            thumbnailResponse2 = callResponse.thumbnails;
        } else {
            thumbnailResponse2 = thumbnailResponse;
            callSessionResponse2 = callSessionResponse3;
        }
        return callResponse.copy(z26, z18, str8, c21682i5, str9, str10, z19, z24, z25, str11, c21682i6, list2, userResponse2, map2, egressResponse2, callIngressResponse2, callSettingsResponse2, str12, c21682i7, num2, str13, c21682i8, str14, callSessionResponse2, thumbnailResponse2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getBackstage() {
        return this.backstage;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final C21682i getUpdatedAt() {
        return this.updatedAt;
    }

    public final List<String> component12() {
        return this.blockedUserIds;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final UserResponse getCreatedBy() {
        return this.createdBy;
    }

    public final Map<String, Object> component14() {
        return this.custom;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final EgressResponse getEgress() {
        return this.egress;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final CallIngressResponse getIngress() {
        return this.ingress;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final CallSettingsResponse getSettings() {
        return this.settings;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getChannelCid() {
        return this.channelCid;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final C21682i getEndedAt() {
        return this.endedAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCaptioning() {
        return this.captioning;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Integer getJoinAheadTimeSeconds() {
        return this.joinAheadTimeSeconds;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final C21682i getStartsAt() {
        return this.startsAt;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getTeam() {
        return this.team;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final CallSessionResponse getSession() {
        return this.session;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final ThumbnailResponse getThumbnails() {
        return this.thumbnails;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrentSessionId() {
        return this.currentSessionId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getRecording() {
        return this.recording;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getTranscribing() {
        return this.transcribing;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getTranslating() {
        return this.translating;
    }

    public final CallResponse copy(@InterfaceC30731q(name = "backstage") boolean backstage, @InterfaceC30731q(name = "captioning") boolean captioning, @InterfaceC30731q(name = "cid") String cid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "current_session_id") String currentSessionId, @InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "recording") boolean recording, @InterfaceC30731q(name = "transcribing") boolean transcribing, @InterfaceC30731q(name = "translating") boolean translating, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "updated_at") C21682i updatedAt, @InterfaceC30731q(name = "blocked_user_ids") List<String> blockedUserIds, @InterfaceC30731q(name = "created_by") UserResponse createdBy, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom, @InterfaceC30731q(name = "egress") EgressResponse egress, @InterfaceC30731q(name = "ingress") CallIngressResponse ingress, @InterfaceC30731q(name = "settings") CallSettingsResponse settings, @InterfaceC30731q(name = "channel_cid") String channelCid, @InterfaceC30731q(name = "ended_at") C21682i endedAt, @InterfaceC30731q(name = "join_ahead_time_seconds") Integer joinAheadTimeSeconds, @InterfaceC30731q(name = "routing_number") String routingNumber, @InterfaceC30731q(name = "starts_at") C21682i startsAt, @InterfaceC30731q(name = "team") String team, @InterfaceC30731q(name = "session") CallSessionResponse session, @InterfaceC30731q(name = "thumbnails") ThumbnailResponse thumbnails) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(currentSessionId, "currentSessionId");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(blockedUserIds, "blockedUserIds");
        AbstractC22676k.m65750j(createdBy, "createdBy");
        AbstractC22676k.m65750j(custom, "custom");
        AbstractC22676k.m65750j(egress, "egress");
        AbstractC22676k.m65750j(ingress, "ingress");
        AbstractC22676k.m65750j(settings, "settings");
        return new CallResponse(backstage, captioning, cid, createdAt, currentSessionId, id4, recording, transcribing, translating, type, updatedAt, blockedUserIds, createdBy, custom, egress, ingress, settings, channelCid, endedAt, joinAheadTimeSeconds, routingNumber, startsAt, team, session, thumbnails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallResponse)) {
            return false;
        }
        CallResponse callResponse = (CallResponse) other;
        return this.backstage == callResponse.backstage && this.captioning == callResponse.captioning && AbstractC22676k.m65745e(this.cid, callResponse.cid) && AbstractC22676k.m65745e(this.createdAt, callResponse.createdAt) && AbstractC22676k.m65745e(this.currentSessionId, callResponse.currentSessionId) && AbstractC22676k.m65745e(this.id, callResponse.id) && this.recording == callResponse.recording && this.transcribing == callResponse.transcribing && this.translating == callResponse.translating && AbstractC22676k.m65745e(this.type, callResponse.type) && AbstractC22676k.m65745e(this.updatedAt, callResponse.updatedAt) && AbstractC22676k.m65745e(this.blockedUserIds, callResponse.blockedUserIds) && AbstractC22676k.m65745e(this.createdBy, callResponse.createdBy) && AbstractC22676k.m65745e(this.custom, callResponse.custom) && AbstractC22676k.m65745e(this.egress, callResponse.egress) && AbstractC22676k.m65745e(this.ingress, callResponse.ingress) && AbstractC22676k.m65745e(this.settings, callResponse.settings) && AbstractC22676k.m65745e(this.channelCid, callResponse.channelCid) && AbstractC22676k.m65745e(this.endedAt, callResponse.endedAt) && AbstractC22676k.m65745e(this.joinAheadTimeSeconds, callResponse.joinAheadTimeSeconds) && AbstractC22676k.m65745e(this.routingNumber, callResponse.routingNumber) && AbstractC22676k.m65745e(this.startsAt, callResponse.startsAt) && AbstractC22676k.m65745e(this.team, callResponse.team) && AbstractC22676k.m65745e(this.session, callResponse.session) && AbstractC22676k.m65745e(this.thumbnails, callResponse.thumbnails);
    }

    public final boolean getBackstage() {
        return this.backstage;
    }

    public final List<String> getBlockedUserIds() {
        return this.blockedUserIds;
    }

    public final boolean getCaptioning() {
        return this.captioning;
    }

    public final String getChannelCid() {
        return this.channelCid;
    }

    public final String getCid() {
        return this.cid;
    }

    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    public final UserResponse getCreatedBy() {
        return this.createdBy;
    }

    public final String getCurrentSessionId() {
        return this.currentSessionId;
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public final EgressResponse getEgress() {
        return this.egress;
    }

    public final C21682i getEndedAt() {
        return this.endedAt;
    }

    public final String getId() {
        return this.id;
    }

    public final CallIngressResponse getIngress() {
        return this.ingress;
    }

    public final Integer getJoinAheadTimeSeconds() {
        return this.joinAheadTimeSeconds;
    }

    public final boolean getRecording() {
        return this.recording;
    }

    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    public final CallSessionResponse getSession() {
        return this.session;
    }

    public final CallSettingsResponse getSettings() {
        return this.settings;
    }

    public final C21682i getStartsAt() {
        return this.startsAt;
    }

    public final String getTeam() {
        return this.team;
    }

    public final ThumbnailResponse getThumbnails() {
        return this.thumbnails;
    }

    public final boolean getTranscribing() {
        return this.transcribing;
    }

    public final boolean getTranslating() {
        return this.translating;
    }

    public final String getType() {
        return this.type;
    }

    public final C21682i getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = (this.settings.hashCode() + ((this.ingress.hashCode() + ((this.egress.hashCode() + AbstractC3855a.m11821e(this.custom, (this.createdBy.hashCode() + AbstractC11895b.m31983b(AbstractC3855a.m11822f(this.updatedAt, AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC3855a.m11822f(this.createdAt, AbstractC11266d.m30450d(AbstractC2875y.m8289b(Boolean.hashCode(this.backstage) * 31, 31, this.captioning), 31, this.cid), 31), 31, this.currentSessionId), 31, this.id), 31, this.recording), 31, this.transcribing), 31, this.translating), 31, this.type), 31), 31, this.blockedUserIds)) * 31, 31)) * 31)) * 31)) * 31;
        String str = this.channelCid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C21682i c21682i = this.endedAt;
        int iHashCode3 = (iHashCode2 + (c21682i == null ? 0 : c21682i.hashCode())) * 31;
        Integer num = this.joinAheadTimeSeconds;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.routingNumber;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C21682i c21682i2 = this.startsAt;
        int iHashCode6 = (iHashCode5 + (c21682i2 == null ? 0 : c21682i2.hashCode())) * 31;
        String str3 = this.team;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CallSessionResponse callSessionResponse = this.session;
        int iHashCode8 = (iHashCode7 + (callSessionResponse == null ? 0 : callSessionResponse.hashCode())) * 31;
        ThumbnailResponse thumbnailResponse = this.thumbnails;
        return iHashCode8 + (thumbnailResponse != null ? thumbnailResponse.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.backstage;
        boolean z13 = this.captioning;
        String str = this.cid;
        C21682i c21682i = this.createdAt;
        String str2 = this.currentSessionId;
        String str3 = this.id;
        boolean z14 = this.recording;
        boolean z15 = this.transcribing;
        boolean z16 = this.translating;
        String str4 = this.type;
        C21682i c21682i2 = this.updatedAt;
        List<String> list = this.blockedUserIds;
        UserResponse userResponse = this.createdBy;
        Map<String, Object> map = this.custom;
        EgressResponse egressResponse = this.egress;
        CallIngressResponse callIngressResponse = this.ingress;
        CallSettingsResponse callSettingsResponse = this.settings;
        String str5 = this.channelCid;
        C21682i c21682i3 = this.endedAt;
        Integer num = this.joinAheadTimeSeconds;
        String str6 = this.routingNumber;
        C21682i c21682i4 = this.startsAt;
        String str7 = this.team;
        CallSessionResponse callSessionResponse = this.session;
        ThumbnailResponse thumbnailResponse = this.thumbnails;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("CallResponse(backstage=", ", captioning=", ", cid=", z4, z13);
        sbM32002u.append(str);
        sbM32002u.append(", createdAt=");
        sbM32002u.append(c21682i);
        sbM32002u.append(", currentSessionId=");
        AbstractC11266d.m30444B(sbM32002u, str2, ", id=", str3, ", recording=");
        AbstractC38963t7.m124392v(sbM32002u, z14, ", transcribing=", z15, ", translating=");
        AbstractC38963t7.m124391u(sbM32002u, z16, ", type=", str4, ", updatedAt=");
        sbM32002u.append(c21682i2);
        sbM32002u.append(", blockedUserIds=");
        sbM32002u.append(list);
        sbM32002u.append(", createdBy=");
        sbM32002u.append(userResponse);
        sbM32002u.append(", custom=");
        sbM32002u.append(map);
        sbM32002u.append(", egress=");
        sbM32002u.append(egressResponse);
        sbM32002u.append(", ingress=");
        sbM32002u.append(callIngressResponse);
        sbM32002u.append(", settings=");
        sbM32002u.append(callSettingsResponse);
        sbM32002u.append(", channelCid=");
        sbM32002u.append(str5);
        sbM32002u.append(", endedAt=");
        sbM32002u.append(c21682i3);
        sbM32002u.append(", joinAheadTimeSeconds=");
        sbM32002u.append(num);
        sbM32002u.append(", routingNumber=");
        sbM32002u.append(str6);
        sbM32002u.append(", startsAt=");
        sbM32002u.append(c21682i4);
        sbM32002u.append(", team=");
        sbM32002u.append(str7);
        sbM32002u.append(", session=");
        sbM32002u.append(callSessionResponse);
        sbM32002u.append(", thumbnails=");
        sbM32002u.append(thumbnailResponse);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ CallResponse(boolean z4, boolean z13, String str, C21682i c21682i, String str2, String str3, boolean z14, boolean z15, boolean z16, String str4, C21682i c21682i2, List list, UserResponse userResponse, Map map, EgressResponse egressResponse, CallIngressResponse callIngressResponse, CallSettingsResponse callSettingsResponse, String str5, C21682i c21682i3, Integer num, String str6, C21682i c21682i4, String str7, CallSessionResponse callSessionResponse, ThumbnailResponse thumbnailResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, z13, str, c21682i, str2, str3, z14, z15, z16, str4, c21682i2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? C25271y.f99162w : list, userResponse, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? C25272z.f99163w : map, egressResponse, callIngressResponse, callSettingsResponse, (131072 & i13) != 0 ? null : str5, (262144 & i13) != 0 ? null : c21682i3, (524288 & i13) != 0 ? null : num, (1048576 & i13) != 0 ? null : str6, (2097152 & i13) != 0 ? null : c21682i4, (4194304 & i13) != 0 ? null : str7, (8388608 & i13) != 0 ? null : callSessionResponse, (i13 & 16777216) != 0 ? null : thumbnailResponse);
    }
}
