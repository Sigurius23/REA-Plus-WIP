package com.whoop.domain.model.teams;

import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.whoop.p069ui.teams.LeaderActivityDto;
import d13.AbstractC11478a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bN\b\u0086\b\u0018\u00002\u00020\u0001Bó\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\"\u0010#J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0006HÆ\u0003J\t\u0010L\u001a\u00020\bHÆ\u0003J\t\u0010M\u001a\u00020\bHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010P\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010-J\t\u0010Q\u001a\u00020\bHÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00102J\u0010\u0010S\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00102J\u0010\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00102J\u0010\u0010V\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00102J\u000b\u0010X\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010Y\u001a\u00020\u0018HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010EJ\u0010\u0010`\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010EJ\u0010\u0010a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010EJ¬\u0002\u0010b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010cJ\u0014\u0010d\u001a\u00020\u00062\b\u0010e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010f\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010g\u001a\u00020\bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010'R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010.\u001a\u0004\b/\u0010-R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00103\u001a\u0004\b7\u00102R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00103\u001a\u0004\b8\u00102R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00106\u001a\u0004\b9\u00105R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00103\u001a\u0004\b:\u00102R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b;\u0010)R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b@\u0010)R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bA\u0010)R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bB\u0010)R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bC\u0010)R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010F\u001a\u0004\bD\u0010ER\u0015\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010F\u001a\u0004\bG\u0010ER\u0015\u0010!\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010F\u001a\u0004\bH\u0010E¨\u0006h"}, m65681d2 = {"Lcom/whoop/domain/model/teams/TeamUserListing;", "", "id", "", "rank", "isCurrentUser", "", "fullName", "", "userName", "avatarUrl", "dayStrain", "", "activity", "activityString", "calories", "recovery", "", "HRV", "RHR", "sleepPerf", "sleepDuration", "sleepDurationString", "privacyProfile", "Lcom/whoop/domain/model/teams/TeamPrivacyProfile;", "peakActivity", "Lcom/whoop/ui/teams/LeaderActivityDto;", "createdAt", "updatedAt", "cycleDayJoined", "period", "waitingForData", "hasData", "compliant", "<init>", "(IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Lcom/whoop/domain/model/teams/TeamPrivacyProfile;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getId", "()I", "getRank", "()Z", "getFullName", "()Ljava/lang/String;", "getUserName", "getAvatarUrl", "getDayStrain", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getActivity", "getActivityString", "getCalories", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRecovery", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getHRV", "getRHR", "getSleepPerf", "getSleepDuration", "getSleepDurationString", "getPrivacyProfile", "()Lcom/whoop/domain/model/teams/TeamPrivacyProfile;", "getPeakActivity", "()Lcom/whoop/ui/teams/LeaderActivityDto;", "getCreatedAt", "getUpdatedAt", "getCycleDayJoined", "getPeriod", "getWaitingForData", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasData", "getCompliant", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "(IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Lcom/whoop/domain/model/teams/TeamPrivacyProfile;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/domain/model/teams/TeamUserListing;", "equals", "other", "hashCode", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class TeamUserListing {
    private final Integer HRV;
    private final Integer RHR;
    private final Float activity;
    private final String activityString;
    private final String avatarUrl;
    private final Integer calories;
    private final Boolean compliant;
    private final String createdAt;
    private final String cycleDayJoined;
    private final Float dayStrain;
    private final String fullName;
    private final Boolean hasData;
    private final int id;
    private final boolean isCurrentUser;
    private final LeaderActivityDto peakActivity;
    private final String period;
    private final TeamPrivacyProfile privacyProfile;
    private final int rank;
    private final Double recovery;
    private final Integer sleepDuration;
    private final String sleepDurationString;
    private final Double sleepPerf;
    private final String updatedAt;
    private final String userName;
    private final Boolean waitingForData;

    public TeamUserListing(int i13, int i14, boolean z4, String fullName, String userName, String str, Float f13, Float f14, String activityString, Integer num, Double d3, Integer num2, Integer num3, Double d14, Integer num4, String str2, TeamPrivacyProfile privacyProfile, LeaderActivityDto leaderActivityDto, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3) {
        AbstractC22676k.m65750j(fullName, "fullName");
        AbstractC22676k.m65750j(userName, "userName");
        AbstractC22676k.m65750j(activityString, "activityString");
        AbstractC22676k.m65750j(privacyProfile, "privacyProfile");
        this.id = i13;
        this.rank = i14;
        this.isCurrentUser = z4;
        this.fullName = fullName;
        this.userName = userName;
        this.avatarUrl = str;
        this.dayStrain = f13;
        this.activity = f14;
        this.activityString = activityString;
        this.calories = num;
        this.recovery = d3;
        this.HRV = num2;
        this.RHR = num3;
        this.sleepPerf = d14;
        this.sleepDuration = num4;
        this.sleepDurationString = str2;
        this.privacyProfile = privacyProfile;
        this.peakActivity = leaderActivityDto;
        this.createdAt = str3;
        this.updatedAt = str4;
        this.cycleDayJoined = str5;
        this.period = str6;
        this.waitingForData = bool;
        this.hasData = bool2;
        this.compliant = bool3;
    }

    public static /* synthetic */ TeamUserListing copy$default(TeamUserListing teamUserListing, int i13, int i14, boolean z4, String str, String str2, String str3, Float f13, Float f14, String str4, Integer num, Double d3, Integer num2, Integer num3, Double d14, Integer num4, String str5, TeamPrivacyProfile teamPrivacyProfile, LeaderActivityDto leaderActivityDto, String str6, String str7, String str8, String str9, Boolean bool, Boolean bool2, Boolean bool3, int i15, Object obj) {
        Boolean bool4;
        Boolean bool5;
        int i16 = (i15 & 1) != 0 ? teamUserListing.id : i13;
        int i17 = (i15 & 2) != 0 ? teamUserListing.rank : i14;
        boolean z13 = (i15 & 4) != 0 ? teamUserListing.isCurrentUser : z4;
        String str10 = (i15 & 8) != 0 ? teamUserListing.fullName : str;
        String str11 = (i15 & 16) != 0 ? teamUserListing.userName : str2;
        String str12 = (i15 & 32) != 0 ? teamUserListing.avatarUrl : str3;
        Float f15 = (i15 & 64) != 0 ? teamUserListing.dayStrain : f13;
        Float f16 = (i15 & 128) != 0 ? teamUserListing.activity : f14;
        String str13 = (i15 & 256) != 0 ? teamUserListing.activityString : str4;
        Integer num5 = (i15 & 512) != 0 ? teamUserListing.calories : num;
        Double d15 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? teamUserListing.recovery : d3;
        Integer num6 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? teamUserListing.HRV : num2;
        Integer num7 = (i15 & 4096) != 0 ? teamUserListing.RHR : num3;
        Double d16 = (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? teamUserListing.sleepPerf : d14;
        int i18 = i16;
        Integer num8 = (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? teamUserListing.sleepDuration : num4;
        String str14 = (i15 & 32768) != 0 ? teamUserListing.sleepDurationString : str5;
        TeamPrivacyProfile teamPrivacyProfile2 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? teamUserListing.privacyProfile : teamPrivacyProfile;
        LeaderActivityDto leaderActivityDto2 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? teamUserListing.peakActivity : leaderActivityDto;
        String str15 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? teamUserListing.createdAt : str6;
        String str16 = (i15 & 524288) != 0 ? teamUserListing.updatedAt : str7;
        String str17 = (i15 & 1048576) != 0 ? teamUserListing.cycleDayJoined : str8;
        String str18 = (i15 & 2097152) != 0 ? teamUserListing.period : str9;
        Boolean bool6 = (i15 & 4194304) != 0 ? teamUserListing.waitingForData : bool;
        Boolean bool7 = (i15 & 8388608) != 0 ? teamUserListing.hasData : bool2;
        if ((i15 & 16777216) != 0) {
            bool5 = bool7;
            bool4 = teamUserListing.compliant;
        } else {
            bool4 = bool3;
            bool5 = bool7;
        }
        return teamUserListing.copy(i18, i17, z13, str10, str11, str12, f15, f16, str13, num5, d15, num6, num7, d16, num8, str14, teamPrivacyProfile2, leaderActivityDto2, str15, str16, str17, str18, bool6, bool5, bool4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getCalories() {
        return this.calories;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Double getRecovery() {
        return this.recovery;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getHRV() {
        return this.HRV;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getRHR() {
        return this.RHR;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Double getSleepPerf() {
        return this.sleepPerf;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getSleepDuration() {
        return this.sleepDuration;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSleepDurationString() {
        return this.sleepDurationString;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final TeamPrivacyProfile getPrivacyProfile() {
        return this.privacyProfile;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final LeaderActivityDto getPeakActivity() {
        return this.peakActivity;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getCycleDayJoined() {
        return this.cycleDayJoined;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Boolean getWaitingForData() {
        return this.waitingForData;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Boolean getHasData() {
        return this.hasData;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Boolean getCompliant() {
        return this.compliant;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsCurrentUser() {
        return this.isCurrentUser;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Float getDayStrain() {
        return this.dayStrain;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Float getActivity() {
        return this.activity;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getActivityString() {
        return this.activityString;
    }

    public final TeamUserListing copy(int id4, int rank, boolean isCurrentUser, String fullName, String userName, String avatarUrl, Float dayStrain, Float activity, String activityString, Integer calories, Double recovery, Integer HRV, Integer RHR, Double sleepPerf, Integer sleepDuration, String sleepDurationString, TeamPrivacyProfile privacyProfile, LeaderActivityDto peakActivity, String createdAt, String updatedAt, String cycleDayJoined, String period, Boolean waitingForData, Boolean hasData, Boolean compliant) {
        AbstractC22676k.m65750j(fullName, "fullName");
        AbstractC22676k.m65750j(userName, "userName");
        AbstractC22676k.m65750j(activityString, "activityString");
        AbstractC22676k.m65750j(privacyProfile, "privacyProfile");
        return new TeamUserListing(id4, rank, isCurrentUser, fullName, userName, avatarUrl, dayStrain, activity, activityString, calories, recovery, HRV, RHR, sleepPerf, sleepDuration, sleepDurationString, privacyProfile, peakActivity, createdAt, updatedAt, cycleDayJoined, period, waitingForData, hasData, compliant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamUserListing)) {
            return false;
        }
        TeamUserListing teamUserListing = (TeamUserListing) other;
        return this.id == teamUserListing.id && this.rank == teamUserListing.rank && this.isCurrentUser == teamUserListing.isCurrentUser && AbstractC22676k.m65745e(this.fullName, teamUserListing.fullName) && AbstractC22676k.m65745e(this.userName, teamUserListing.userName) && AbstractC22676k.m65745e(this.avatarUrl, teamUserListing.avatarUrl) && AbstractC22676k.m65745e(this.dayStrain, teamUserListing.dayStrain) && AbstractC22676k.m65745e(this.activity, teamUserListing.activity) && AbstractC22676k.m65745e(this.activityString, teamUserListing.activityString) && AbstractC22676k.m65745e(this.calories, teamUserListing.calories) && AbstractC22676k.m65745e(this.recovery, teamUserListing.recovery) && AbstractC22676k.m65745e(this.HRV, teamUserListing.HRV) && AbstractC22676k.m65745e(this.RHR, teamUserListing.RHR) && AbstractC22676k.m65745e(this.sleepPerf, teamUserListing.sleepPerf) && AbstractC22676k.m65745e(this.sleepDuration, teamUserListing.sleepDuration) && AbstractC22676k.m65745e(this.sleepDurationString, teamUserListing.sleepDurationString) && AbstractC22676k.m65745e(this.privacyProfile, teamUserListing.privacyProfile) && AbstractC22676k.m65745e(this.peakActivity, teamUserListing.peakActivity) && AbstractC22676k.m65745e(this.createdAt, teamUserListing.createdAt) && AbstractC22676k.m65745e(this.updatedAt, teamUserListing.updatedAt) && AbstractC22676k.m65745e(this.cycleDayJoined, teamUserListing.cycleDayJoined) && AbstractC22676k.m65745e(this.period, teamUserListing.period) && AbstractC22676k.m65745e(this.waitingForData, teamUserListing.waitingForData) && AbstractC22676k.m65745e(this.hasData, teamUserListing.hasData) && AbstractC22676k.m65745e(this.compliant, teamUserListing.compliant);
    }

    public final Float getActivity() {
        return this.activity;
    }

    public final String getActivityString() {
        return this.activityString;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final Integer getCalories() {
        return this.calories;
    }

    public final Boolean getCompliant() {
        return this.compliant;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getCycleDayJoined() {
        return this.cycleDayJoined;
    }

    public final Float getDayStrain() {
        return this.dayStrain;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final Integer getHRV() {
        return this.HRV;
    }

    public final Boolean getHasData() {
        return this.hasData;
    }

    public final int getId() {
        return this.id;
    }

    public final LeaderActivityDto getPeakActivity() {
        return this.peakActivity;
    }

    public final String getPeriod() {
        return this.period;
    }

    public final TeamPrivacyProfile getPrivacyProfile() {
        return this.privacyProfile;
    }

    public final Integer getRHR() {
        return this.RHR;
    }

    public final int getRank() {
        return this.rank;
    }

    public final Double getRecovery() {
        return this.recovery;
    }

    public final Integer getSleepDuration() {
        return this.sleepDuration;
    }

    public final String getSleepDurationString() {
        return this.sleepDurationString;
    }

    public final Double getSleepPerf() {
        return this.sleepPerf;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final Boolean getWaitingForData() {
        return this.waitingForData;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.rank, Integer.hashCode(this.id) * 31, 31), 31, this.isCurrentUser), 31, this.fullName), 31, this.userName);
        String str = this.avatarUrl;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        Float f13 = this.dayStrain;
        int iHashCode2 = (iHashCode + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.activity;
        int iM30450d2 = AbstractC11266d.m30450d((iHashCode2 + (f14 == null ? 0 : f14.hashCode())) * 31, 31, this.activityString);
        Integer num = this.calories;
        int iHashCode3 = (iM30450d2 + (num == null ? 0 : num.hashCode())) * 31;
        Double d3 = this.recovery;
        int iHashCode4 = (iHashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num2 = this.HRV;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.RHR;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d14 = this.sleepPerf;
        int iHashCode7 = (iHashCode6 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Integer num4 = this.sleepDuration;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.sleepDurationString;
        int iHashCode9 = (this.privacyProfile.hashCode() + ((iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        LeaderActivityDto leaderActivityDto = this.peakActivity;
        int iHashCode10 = (iHashCode9 + (leaderActivityDto == null ? 0 : leaderActivityDto.hashCode())) * 31;
        String str3 = this.createdAt;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.updatedAt;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cycleDayJoined;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.period;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.waitingForData;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasData;
        int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.compliant;
        return iHashCode16 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final boolean isCurrentUser() {
        return this.isCurrentUser;
    }

    public String toString() {
        int i13 = this.id;
        int i14 = this.rank;
        boolean z4 = this.isCurrentUser;
        String str = this.fullName;
        String str2 = this.userName;
        String str3 = this.avatarUrl;
        Float f13 = this.dayStrain;
        Float f14 = this.activity;
        String str4 = this.activityString;
        Integer num = this.calories;
        Double d3 = this.recovery;
        Integer num2 = this.HRV;
        Integer num3 = this.RHR;
        Double d14 = this.sleepPerf;
        Integer num4 = this.sleepDuration;
        String str5 = this.sleepDurationString;
        TeamPrivacyProfile teamPrivacyProfile = this.privacyProfile;
        LeaderActivityDto leaderActivityDto = this.peakActivity;
        String str6 = this.createdAt;
        String str7 = this.updatedAt;
        String str8 = this.cycleDayJoined;
        String str9 = this.period;
        Boolean bool = this.waitingForData;
        Boolean bool2 = this.hasData;
        Boolean bool3 = this.compliant;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "TeamUserListing(id=", ", rank=", ", isCurrentUser=");
        AbstractC38963t7.m124391u(sbM30465s, z4, ", fullName=", str, ", userName=");
        AbstractC11266d.m30444B(sbM30465s, str2, ", avatarUrl=", str3, ", dayStrain=");
        sbM30465s.append(f13);
        sbM30465s.append(", activity=");
        sbM30465s.append(f14);
        sbM30465s.append(", activityString=");
        AbstractC30007c.m91853w(num, str4, ", calories=", ", recovery=", sbM30465s);
        sbM30465s.append(d3);
        sbM30465s.append(", HRV=");
        sbM30465s.append(num2);
        sbM30465s.append(", RHR=");
        sbM30465s.append(num3);
        sbM30465s.append(", sleepPerf=");
        sbM30465s.append(d14);
        sbM30465s.append(", sleepDuration=");
        AbstractC13673n.m38577x(num4, ", sleepDurationString=", str5, ", privacyProfile=", sbM30465s);
        sbM30465s.append(teamPrivacyProfile);
        sbM30465s.append(", peakActivity=");
        sbM30465s.append(leaderActivityDto);
        sbM30465s.append(", createdAt=");
        AbstractC11266d.m30444B(sbM30465s, str6, ", updatedAt=", str7, ", cycleDayJoined=");
        AbstractC11266d.m30444B(sbM30465s, str8, ", period=", str9, ", waitingForData=");
        AbstractC3855a.m11839w(sbM30465s, bool, ", hasData=", bool2, ", compliant=");
        return AbstractC11478a.m30858j(sbM30465s, bool3, ")");
    }
}
