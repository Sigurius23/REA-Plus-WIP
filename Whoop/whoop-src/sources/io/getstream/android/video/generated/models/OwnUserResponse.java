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
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001Bû\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0016\b\u0003\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0016\b\u0003\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0003¢\u0006\u0004\b&\u0010%J\u001e\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001eJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010 J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001eJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b/\u0010 J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u001eJ\u0018\u00101\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b1\u0010%J\u0012\u00102\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b2\u00103J\u001e\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b4\u0010(J\u0084\u0002\u00105\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u00022\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0016\b\u0003\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0016\b\u0003\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b7\u0010 J\u0010\u00108\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bB\u0010 R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bC\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\bD\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bG\u0010%R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bK\u0010*R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\bL\u0010\u001eR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\bM\u0010\u001eR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bN\u0010 R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\bO\u0010\u001eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bP\u0010 R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010>\u001a\u0004\bQ\u0010\u001eR\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010E\u001a\u0004\bR\u0010%R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010S\u001a\u0004\bT\u00103R%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001a\u0010H\u001a\u0004\bU\u0010(¨\u0006V"}, m65681d2 = {"Lio/getstream/android/video/generated/models/OwnUserResponse;", "", "Ljg3/i;", "createdAt", "", "id", "language", "role", "updatedAt", "", "Lio/getstream/android/video/generated/models/DeviceResponse;", "devices", "teams", "", "custom", "", "avgResponseTime", "deactivatedAt", "deletedAt", "image", "lastActive", "name", "revokeTokensIssuedBefore", "blockedUserIds", "Lio/getstream/android/video/generated/models/PushPreferencesResponse;", "pushPreferences", "teamsRole", "<init>", "(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/util/List;Lio/getstream/android/video/generated/models/PushPreferencesResponse;Ljava/util/Map;)V", "component1", "()Ljg3/i;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "()Ljava/util/Map;", "component9", "()Ljava/lang/Integer;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "()Lio/getstream/android/video/generated/models/PushPreferencesResponse;", "component18", "copy", "(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/util/List;Lio/getstream/android/video/generated/models/PushPreferencesResponse;Ljava/util/Map;)Lio/getstream/android/video/generated/models/OwnUserResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljg3/i;", "getCreatedAt", "Ljava/lang/String;", "getId", "getLanguage", "getRole", "getUpdatedAt", "Ljava/util/List;", "getDevices", "getTeams", "Ljava/util/Map;", "getCustom", "Ljava/lang/Integer;", "getAvgResponseTime", "getDeactivatedAt", "getDeletedAt", "getImage", "getLastActive", "getName", "getRevokeTokensIssuedBefore", "getBlockedUserIds", "Lio/getstream/android/video/generated/models/PushPreferencesResponse;", "getPushPreferences", "getTeamsRole", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class OwnUserResponse {
    private final Integer avgResponseTime;
    private final List<String> blockedUserIds;
    private final C21682i createdAt;
    private final Map<String, Object> custom;
    private final C21682i deactivatedAt;
    private final C21682i deletedAt;
    private final List<DeviceResponse> devices;
    private final String id;
    private final String image;
    private final String language;
    private final C21682i lastActive;
    private final String name;
    private final PushPreferencesResponse pushPreferences;
    private final C21682i revokeTokensIssuedBefore;
    private final String role;
    private final List<String> teams;
    private final Map<String, String> teamsRole;
    private final C21682i updatedAt;

    public OwnUserResponse(@InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "language") String language, @InterfaceC30731q(name = "role") String role, @InterfaceC30731q(name = "updated_at") C21682i updatedAt, @InterfaceC30731q(name = "devices") List<DeviceResponse> devices, @InterfaceC30731q(name = "teams") List<String> teams, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom, @InterfaceC30731q(name = "avg_response_time") Integer num, @InterfaceC30731q(name = "deactivated_at") C21682i c21682i, @InterfaceC30731q(name = "deleted_at") C21682i c21682i2, @InterfaceC30731q(name = "image") String str, @InterfaceC30731q(name = "last_active") C21682i c21682i3, @InterfaceC30731q(name = "name") String str2, @InterfaceC30731q(name = "revoke_tokens_issued_before") C21682i c21682i4, @InterfaceC30731q(name = "blocked_user_ids") List<String> list, @InterfaceC30731q(name = "push_preferences") PushPreferencesResponse pushPreferencesResponse, @InterfaceC30731q(name = "teams_role") Map<String, String> map) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(language, "language");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(devices, "devices");
        AbstractC22676k.m65750j(teams, "teams");
        AbstractC22676k.m65750j(custom, "custom");
        this.createdAt = createdAt;
        this.id = id4;
        this.language = language;
        this.role = role;
        this.updatedAt = updatedAt;
        this.devices = devices;
        this.teams = teams;
        this.custom = custom;
        this.avgResponseTime = num;
        this.deactivatedAt = c21682i;
        this.deletedAt = c21682i2;
        this.image = str;
        this.lastActive = c21682i3;
        this.name = str2;
        this.revokeTokensIssuedBefore = c21682i4;
        this.blockedUserIds = list;
        this.pushPreferences = pushPreferencesResponse;
        this.teamsRole = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OwnUserResponse copy$default(OwnUserResponse ownUserResponse, C21682i c21682i, String str, String str2, String str3, C21682i c21682i2, List list, List list2, Map map, Integer num, C21682i c21682i3, C21682i c21682i4, String str4, C21682i c21682i5, String str5, C21682i c21682i6, List list3, PushPreferencesResponse pushPreferencesResponse, Map map2, int i13, Object obj) {
        Map map3;
        PushPreferencesResponse pushPreferencesResponse2;
        C21682i c21682i7 = (i13 & 1) != 0 ? ownUserResponse.createdAt : c21682i;
        String str6 = (i13 & 2) != 0 ? ownUserResponse.id : str;
        String str7 = (i13 & 4) != 0 ? ownUserResponse.language : str2;
        String str8 = (i13 & 8) != 0 ? ownUserResponse.role : str3;
        C21682i c21682i8 = (i13 & 16) != 0 ? ownUserResponse.updatedAt : c21682i2;
        List list4 = (i13 & 32) != 0 ? ownUserResponse.devices : list;
        List list5 = (i13 & 64) != 0 ? ownUserResponse.teams : list2;
        Map map4 = (i13 & 128) != 0 ? ownUserResponse.custom : map;
        Integer num2 = (i13 & 256) != 0 ? ownUserResponse.avgResponseTime : num;
        C21682i c21682i9 = (i13 & 512) != 0 ? ownUserResponse.deactivatedAt : c21682i3;
        C21682i c21682i10 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? ownUserResponse.deletedAt : c21682i4;
        String str9 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? ownUserResponse.image : str4;
        C21682i c21682i11 = (i13 & 4096) != 0 ? ownUserResponse.lastActive : c21682i5;
        String str10 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? ownUserResponse.name : str5;
        C21682i c21682i12 = c21682i7;
        C21682i c21682i13 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? ownUserResponse.revokeTokensIssuedBefore : c21682i6;
        List list6 = (i13 & 32768) != 0 ? ownUserResponse.blockedUserIds : list3;
        PushPreferencesResponse pushPreferencesResponse3 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? ownUserResponse.pushPreferences : pushPreferencesResponse;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            pushPreferencesResponse2 = pushPreferencesResponse3;
            map3 = ownUserResponse.teamsRole;
        } else {
            map3 = map2;
            pushPreferencesResponse2 = pushPreferencesResponse3;
        }
        return ownUserResponse.copy(c21682i12, str6, str7, str8, c21682i8, list4, list5, map4, num2, c21682i9, c21682i10, str9, c21682i11, str10, c21682i13, list6, pushPreferencesResponse2, map3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final C21682i getDeactivatedAt() {
        return this.deactivatedAt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final C21682i getDeletedAt() {
        return this.deletedAt;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final C21682i getLastActive() {
        return this.lastActive;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final C21682i getRevokeTokensIssuedBefore() {
        return this.revokeTokensIssuedBefore;
    }

    public final List<String> component16() {
        return this.blockedUserIds;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final PushPreferencesResponse getPushPreferences() {
        return this.pushPreferences;
    }

    public final Map<String, String> component18() {
        return this.teamsRole;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C21682i getUpdatedAt() {
        return this.updatedAt;
    }

    public final List<DeviceResponse> component6() {
        return this.devices;
    }

    public final List<String> component7() {
        return this.teams;
    }

    public final Map<String, Object> component8() {
        return this.custom;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getAvgResponseTime() {
        return this.avgResponseTime;
    }

    public final OwnUserResponse copy(@InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "language") String language, @InterfaceC30731q(name = "role") String role, @InterfaceC30731q(name = "updated_at") C21682i updatedAt, @InterfaceC30731q(name = "devices") List<DeviceResponse> devices, @InterfaceC30731q(name = "teams") List<String> teams, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom, @InterfaceC30731q(name = "avg_response_time") Integer avgResponseTime, @InterfaceC30731q(name = "deactivated_at") C21682i deactivatedAt, @InterfaceC30731q(name = "deleted_at") C21682i deletedAt, @InterfaceC30731q(name = "image") String image, @InterfaceC30731q(name = "last_active") C21682i lastActive, @InterfaceC30731q(name = "name") String name, @InterfaceC30731q(name = "revoke_tokens_issued_before") C21682i revokeTokensIssuedBefore, @InterfaceC30731q(name = "blocked_user_ids") List<String> blockedUserIds, @InterfaceC30731q(name = "push_preferences") PushPreferencesResponse pushPreferences, @InterfaceC30731q(name = "teams_role") Map<String, String> teamsRole) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(language, "language");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(devices, "devices");
        AbstractC22676k.m65750j(teams, "teams");
        AbstractC22676k.m65750j(custom, "custom");
        return new OwnUserResponse(createdAt, id4, language, role, updatedAt, devices, teams, custom, avgResponseTime, deactivatedAt, deletedAt, image, lastActive, name, revokeTokensIssuedBefore, blockedUserIds, pushPreferences, teamsRole);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OwnUserResponse)) {
            return false;
        }
        OwnUserResponse ownUserResponse = (OwnUserResponse) other;
        return AbstractC22676k.m65745e(this.createdAt, ownUserResponse.createdAt) && AbstractC22676k.m65745e(this.id, ownUserResponse.id) && AbstractC22676k.m65745e(this.language, ownUserResponse.language) && AbstractC22676k.m65745e(this.role, ownUserResponse.role) && AbstractC22676k.m65745e(this.updatedAt, ownUserResponse.updatedAt) && AbstractC22676k.m65745e(this.devices, ownUserResponse.devices) && AbstractC22676k.m65745e(this.teams, ownUserResponse.teams) && AbstractC22676k.m65745e(this.custom, ownUserResponse.custom) && AbstractC22676k.m65745e(this.avgResponseTime, ownUserResponse.avgResponseTime) && AbstractC22676k.m65745e(this.deactivatedAt, ownUserResponse.deactivatedAt) && AbstractC22676k.m65745e(this.deletedAt, ownUserResponse.deletedAt) && AbstractC22676k.m65745e(this.image, ownUserResponse.image) && AbstractC22676k.m65745e(this.lastActive, ownUserResponse.lastActive) && AbstractC22676k.m65745e(this.name, ownUserResponse.name) && AbstractC22676k.m65745e(this.revokeTokensIssuedBefore, ownUserResponse.revokeTokensIssuedBefore) && AbstractC22676k.m65745e(this.blockedUserIds, ownUserResponse.blockedUserIds) && AbstractC22676k.m65745e(this.pushPreferences, ownUserResponse.pushPreferences) && AbstractC22676k.m65745e(this.teamsRole, ownUserResponse.teamsRole);
    }

    public final Integer getAvgResponseTime() {
        return this.avgResponseTime;
    }

    public final List<String> getBlockedUserIds() {
        return this.blockedUserIds;
    }

    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public final C21682i getDeactivatedAt() {
        return this.deactivatedAt;
    }

    public final C21682i getDeletedAt() {
        return this.deletedAt;
    }

    public final List<DeviceResponse> getDevices() {
        return this.devices;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final C21682i getLastActive() {
        return this.lastActive;
    }

    public final String getName() {
        return this.name;
    }

    public final PushPreferencesResponse getPushPreferences() {
        return this.pushPreferences;
    }

    public final C21682i getRevokeTokensIssuedBefore() {
        return this.revokeTokensIssuedBefore;
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

    public final C21682i getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iM11821e = AbstractC3855a.m11821e(this.custom, AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC3855a.m11822f(this.updatedAt, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.createdAt.hashCode() * 31, 31, this.id), 31, this.language), 31, this.role), 31), 31, this.devices), 31, this.teams), 31);
        Integer num = this.avgResponseTime;
        int iHashCode = (iM11821e + (num == null ? 0 : num.hashCode())) * 31;
        C21682i c21682i = this.deactivatedAt;
        int iHashCode2 = (iHashCode + (c21682i == null ? 0 : c21682i.hashCode())) * 31;
        C21682i c21682i2 = this.deletedAt;
        int iHashCode3 = (iHashCode2 + (c21682i2 == null ? 0 : c21682i2.hashCode())) * 31;
        String str = this.image;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        C21682i c21682i3 = this.lastActive;
        int iHashCode5 = (iHashCode4 + (c21682i3 == null ? 0 : c21682i3.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C21682i c21682i4 = this.revokeTokensIssuedBefore;
        int iHashCode7 = (iHashCode6 + (c21682i4 == null ? 0 : c21682i4.hashCode())) * 31;
        List<String> list = this.blockedUserIds;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        PushPreferencesResponse pushPreferencesResponse = this.pushPreferences;
        int iHashCode9 = (iHashCode8 + (pushPreferencesResponse == null ? 0 : pushPreferencesResponse.hashCode())) * 31;
        Map<String, String> map = this.teamsRole;
        return iHashCode9 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        C21682i c21682i = this.createdAt;
        String str = this.id;
        String str2 = this.language;
        String str3 = this.role;
        C21682i c21682i2 = this.updatedAt;
        List<DeviceResponse> list = this.devices;
        List<String> list2 = this.teams;
        Map<String, Object> map = this.custom;
        Integer num = this.avgResponseTime;
        C21682i c21682i3 = this.deactivatedAt;
        C21682i c21682i4 = this.deletedAt;
        String str4 = this.image;
        C21682i c21682i5 = this.lastActive;
        String str5 = this.name;
        C21682i c21682i6 = this.revokeTokensIssuedBefore;
        List<String> list3 = this.blockedUserIds;
        PushPreferencesResponse pushPreferencesResponse = this.pushPreferences;
        Map<String, String> map2 = this.teamsRole;
        StringBuilder sb4 = new StringBuilder("OwnUserResponse(createdAt=");
        sb4.append(c21682i);
        sb4.append(", id=");
        sb4.append(str);
        sb4.append(", language=");
        AbstractC11266d.m30444B(sb4, str2, ", role=", str3, ", updatedAt=");
        sb4.append(c21682i2);
        sb4.append(", devices=");
        sb4.append(list);
        sb4.append(", teams=");
        sb4.append(list2);
        sb4.append(", custom=");
        sb4.append(map);
        sb4.append(", avgResponseTime=");
        sb4.append(num);
        sb4.append(", deactivatedAt=");
        sb4.append(c21682i3);
        sb4.append(", deletedAt=");
        sb4.append(c21682i4);
        sb4.append(", image=");
        sb4.append(str4);
        sb4.append(", lastActive=");
        sb4.append(c21682i5);
        sb4.append(", name=");
        sb4.append(str5);
        sb4.append(", revokeTokensIssuedBefore=");
        sb4.append(c21682i6);
        sb4.append(", blockedUserIds=");
        sb4.append(list3);
        sb4.append(", pushPreferences=");
        sb4.append(pushPreferencesResponse);
        sb4.append(", teamsRole=");
        sb4.append(map2);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OwnUserResponse(C21682i c21682i, String str, String str2, String str3, C21682i c21682i2, List list, List list2, Map map, Integer num, C21682i c21682i3, C21682i c21682i4, String str4, C21682i c21682i5, String str5, C21682i c21682i6, List list3, PushPreferencesResponse pushPreferencesResponse, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 32;
        C25271y c25271y = C25271y.f99162w;
        List list4 = i14 != 0 ? c25271y : list;
        List list5 = (i13 & 64) != 0 ? c25271y : list2;
        int i15 = i13 & 128;
        C25272z c25272z = C25272z.f99163w;
        this(c21682i, str, str2, str3, c21682i2, list4, list5, i15 != 0 ? c25272z : map, (i13 & 256) != 0 ? null : num, (i13 & 512) != 0 ? null : c21682i3, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c21682i4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str4, (i13 & 4096) != 0 ? null : c21682i5, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str5, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : c21682i6, (32768 & i13) != 0 ? c25271y : list3, (65536 & i13) != 0 ? null : pushPreferencesResponse, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c25272z : map2);
    }
}
