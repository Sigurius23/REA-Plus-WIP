package io.getstream.chat.android.client.internal.offline.repository.domain.user.internal;

import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.internal.offline.repository.domain.push.internal.PushPreferenceEntity;
import java.util.Date;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B×\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0016\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010@\u001a\u00020\rHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010B\u001a\u00020\rHÆ\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012HÆ\u0003J\u0015\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0016HÆ\u0003J\u0015\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0016HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010H\u001a\u0004\u0018\u00010\u001bHÆ\u0003Jè\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00162\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020\r2\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020NHÖ\u0001J\t\u0010O\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006P"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;", "", "id", "", "originalId", "name", "image", "role", "createdAt", "Ljava/util/Date;", "updatedAt", "lastActive", "invisible", "", "privacySettings", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;", "banned", "mutes", "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;", "teams", "teamsRole", "", "extraData", "avgResponseTime", "", "pushPreference", "Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZLio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;ZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;)V", "getId", "()Ljava/lang/String;", "getOriginalId", "getName", "getImage", "getRole", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getLastActive", "getInvisible", "()Z", "getPrivacySettings", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;", "getBanned", "getMutes", "()Ljava/util/List;", "getTeams", "getTeamsRole", "()Ljava/util/Map;", "getExtraData", "getAvgResponseTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPushPreference", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZLio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;ZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UserEntity {
    private final Long avgResponseTime;
    private final boolean banned;
    private final Date createdAt;
    private final Map<String, Object> extraData;
    private final String id;
    private final String image;
    private final boolean invisible;
    private final Date lastActive;
    private final List<UserMuteEntity> mutes;
    private final String name;
    private final String originalId;
    private final PrivacySettingsEntity privacySettings;
    private final PushPreferenceEntity pushPreference;
    private final String role;
    private final List<String> teams;
    private final Map<String, String> teamsRole;
    private final Date updatedAt;

    public UserEntity(String id4, String originalId, String name, String image, String role, Date date, Date date2, Date date3, boolean z4, PrivacySettingsEntity privacySettingsEntity, boolean z13, List<UserMuteEntity> mutes, List<String> teams, Map<String, String> teamsRole, Map<String, ? extends Object> extraData, Long l7, PushPreferenceEntity pushPreferenceEntity) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(originalId, "originalId");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(mutes, "mutes");
        AbstractC22676k.m65750j(teams, "teams");
        AbstractC22676k.m65750j(teamsRole, "teamsRole");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.id = id4;
        this.originalId = originalId;
        this.name = name;
        this.image = image;
        this.role = role;
        this.createdAt = date;
        this.updatedAt = date2;
        this.lastActive = date3;
        this.invisible = z4;
        this.privacySettings = privacySettingsEntity;
        this.banned = z13;
        this.mutes = mutes;
        this.teams = teams;
        this.teamsRole = teamsRole;
        this.extraData = extraData;
        this.avgResponseTime = l7;
        this.pushPreference = pushPreferenceEntity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserEntity copy$default(UserEntity userEntity, String str, String str2, String str3, String str4, String str5, Date date, Date date2, Date date3, boolean z4, PrivacySettingsEntity privacySettingsEntity, boolean z13, List list, List list2, Map map, Map map2, Long l7, PushPreferenceEntity pushPreferenceEntity, int i13, Object obj) {
        PushPreferenceEntity pushPreferenceEntity2;
        Long l12;
        String str6 = (i13 & 1) != 0 ? userEntity.id : str;
        String str7 = (i13 & 2) != 0 ? userEntity.originalId : str2;
        String str8 = (i13 & 4) != 0 ? userEntity.name : str3;
        String str9 = (i13 & 8) != 0 ? userEntity.image : str4;
        String str10 = (i13 & 16) != 0 ? userEntity.role : str5;
        Date date4 = (i13 & 32) != 0 ? userEntity.createdAt : date;
        Date date5 = (i13 & 64) != 0 ? userEntity.updatedAt : date2;
        Date date6 = (i13 & 128) != 0 ? userEntity.lastActive : date3;
        boolean z14 = (i13 & 256) != 0 ? userEntity.invisible : z4;
        PrivacySettingsEntity privacySettingsEntity2 = (i13 & 512) != 0 ? userEntity.privacySettings : privacySettingsEntity;
        boolean z15 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? userEntity.banned : z13;
        List list3 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? userEntity.mutes : list;
        List list4 = (i13 & 4096) != 0 ? userEntity.teams : list2;
        Map map3 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? userEntity.teamsRole : map;
        String str11 = str6;
        Map map4 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? userEntity.extraData : map2;
        Long l13 = (i13 & 32768) != 0 ? userEntity.avgResponseTime : l7;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
            l12 = l13;
            pushPreferenceEntity2 = userEntity.pushPreference;
        } else {
            pushPreferenceEntity2 = pushPreferenceEntity;
            l12 = l13;
        }
        return userEntity.copy(str11, str7, str8, str9, str10, date4, date5, date6, z14, privacySettingsEntity2, z15, list3, list4, map3, map4, l12, pushPreferenceEntity2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final PrivacySettingsEntity getPrivacySettings() {
        return this.privacySettings;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getBanned() {
        return this.banned;
    }

    public final List<UserMuteEntity> component12() {
        return this.mutes;
    }

    public final List<String> component13() {
        return this.teams;
    }

    public final Map<String, String> component14() {
        return this.teamsRole;
    }

    public final Map<String, Object> component15() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Long getAvgResponseTime() {
        return this.avgResponseTime;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final PushPreferenceEntity getPushPreference() {
        return this.pushPreference;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOriginalId() {
        return this.originalId;
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
    public final String getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getLastActive() {
        return this.lastActive;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getInvisible() {
        return this.invisible;
    }

    public final UserEntity copy(String id4, String originalId, String name, String image, String role, Date createdAt, Date updatedAt, Date lastActive, boolean invisible, PrivacySettingsEntity privacySettings, boolean banned, List<UserMuteEntity> mutes, List<String> teams, Map<String, String> teamsRole, Map<String, ? extends Object> extraData, Long avgResponseTime, PushPreferenceEntity pushPreference) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(originalId, "originalId");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(mutes, "mutes");
        AbstractC22676k.m65750j(teams, "teams");
        AbstractC22676k.m65750j(teamsRole, "teamsRole");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new UserEntity(id4, originalId, name, image, role, createdAt, updatedAt, lastActive, invisible, privacySettings, banned, mutes, teams, teamsRole, extraData, avgResponseTime, pushPreference);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserEntity)) {
            return false;
        }
        UserEntity userEntity = (UserEntity) other;
        return AbstractC22676k.m65745e(this.id, userEntity.id) && AbstractC22676k.m65745e(this.originalId, userEntity.originalId) && AbstractC22676k.m65745e(this.name, userEntity.name) && AbstractC22676k.m65745e(this.image, userEntity.image) && AbstractC22676k.m65745e(this.role, userEntity.role) && AbstractC22676k.m65745e(this.createdAt, userEntity.createdAt) && AbstractC22676k.m65745e(this.updatedAt, userEntity.updatedAt) && AbstractC22676k.m65745e(this.lastActive, userEntity.lastActive) && this.invisible == userEntity.invisible && AbstractC22676k.m65745e(this.privacySettings, userEntity.privacySettings) && this.banned == userEntity.banned && AbstractC22676k.m65745e(this.mutes, userEntity.mutes) && AbstractC22676k.m65745e(this.teams, userEntity.teams) && AbstractC22676k.m65745e(this.teamsRole, userEntity.teamsRole) && AbstractC22676k.m65745e(this.extraData, userEntity.extraData) && AbstractC22676k.m65745e(this.avgResponseTime, userEntity.avgResponseTime) && AbstractC22676k.m65745e(this.pushPreference, userEntity.pushPreference);
    }

    public final Long getAvgResponseTime() {
        return this.avgResponseTime;
    }

    public final boolean getBanned() {
        return this.banned;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
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

    public final boolean getInvisible() {
        return this.invisible;
    }

    public final Date getLastActive() {
        return this.lastActive;
    }

    public final List<UserMuteEntity> getMutes() {
        return this.mutes;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOriginalId() {
        return this.originalId;
    }

    public final PrivacySettingsEntity getPrivacySettings() {
        return this.privacySettings;
    }

    public final PushPreferenceEntity getPushPreference() {
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

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.originalId), 31, this.name), 31, this.image), 31, this.role);
        Date date = this.createdAt;
        int iHashCode = (iM30450d + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.updatedAt;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.lastActive;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (date3 == null ? 0 : date3.hashCode())) * 31, 31, this.invisible);
        PrivacySettingsEntity privacySettingsEntity = this.privacySettings;
        int iM11821e = AbstractC3855a.m11821e(this.extraData, AbstractC3855a.m11821e(this.teamsRole, AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC2875y.m8289b((iM8289b + (privacySettingsEntity == null ? 0 : privacySettingsEntity.hashCode())) * 31, 31, this.banned), 31, this.mutes), 31, this.teams), 31), 31);
        Long l7 = this.avgResponseTime;
        int iHashCode3 = (iM11821e + (l7 == null ? 0 : l7.hashCode())) * 31;
        PushPreferenceEntity pushPreferenceEntity = this.pushPreference;
        return iHashCode3 + (pushPreferenceEntity != null ? pushPreferenceEntity.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.originalId;
        String str3 = this.name;
        String str4 = this.image;
        String str5 = this.role;
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        Date date3 = this.lastActive;
        boolean z4 = this.invisible;
        PrivacySettingsEntity privacySettingsEntity = this.privacySettings;
        boolean z13 = this.banned;
        List<UserMuteEntity> list = this.mutes;
        List<String> list2 = this.teams;
        Map<String, String> map = this.teamsRole;
        Map<String, Object> map2 = this.extraData;
        Long l7 = this.avgResponseTime;
        PushPreferenceEntity pushPreferenceEntity = this.pushPreference;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("UserEntity(id=", str, ", originalId=", str2, ", name=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", image=", str4, ", role=");
        AbstractC13673n.m38579z(sbM32001t, str5, ", createdAt=", date, ", updatedAt=");
        AbstractC17176i.m48512n(sbM32001t, date2, ", lastActive=", date3, ", invisible=");
        sbM32001t.append(z4);
        sbM32001t.append(", privacySettings=");
        sbM32001t.append(privacySettingsEntity);
        sbM32001t.append(", banned=");
        AbstractC25012a.m73391x(", mutes=", ", teams=", sbM32001t, list, z13);
        sbM32001t.append(list2);
        sbM32001t.append(", teamsRole=");
        sbM32001t.append(map);
        sbM32001t.append(", extraData=");
        sbM32001t.append(map2);
        sbM32001t.append(", avgResponseTime=");
        sbM32001t.append(l7);
        sbM32001t.append(", pushPreference=");
        sbM32001t.append(pushPreferenceEntity);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UserEntity(String str, String str2, String str3, String str4, String str5, Date date, Date date2, Date date3, boolean z4, PrivacySettingsEntity privacySettingsEntity, boolean z13, List list, List list2, Map map, Map map2, Long l7, PushPreferenceEntity pushPreferenceEntity, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        String str6 = (i13 & 2) != 0 ? "" : str2;
        String str7 = (i13 & 16) != 0 ? "" : str5;
        Date date4 = (i13 & 32) != 0 ? null : date;
        Date date5 = (i13 & 64) != 0 ? null : date2;
        Date date6 = (i13 & 128) != 0 ? null : date3;
        boolean z14 = (i13 & 256) != 0 ? false : z4;
        boolean z15 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z13;
        List list3 = (i13 & 4096) != 0 ? C25271y.f99162w : list2;
        int i14 = i13 & DfuBaseService.ERROR_REMOTE_MASK;
        C25272z c25272z = C25272z.f99163w;
        this(str, str6, str3, str4, str7, date4, date5, date6, z14, privacySettingsEntity, z15, list, list3, i14 != 0 ? c25272z : map, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c25272z : map2, (32768 & i13) != 0 ? null : l7, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : pushPreferenceEntity);
    }
}
