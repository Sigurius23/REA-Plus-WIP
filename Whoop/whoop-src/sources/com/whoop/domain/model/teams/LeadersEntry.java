package com.whoop.domain.model.teams;

import androidx.core.app.FrameMetricsAggregator;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.domain.model.User;
import com.whoop.p069ui.AbstractC10538f;
import com.whoop.p069ui.teams.LeaderActivityDto;
import com.whoop.service.network.model.UserSessionDto;
import e50.C12723b;
import e93.AbstractC12889b;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import jh3.AbstractC21702c;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sc2.C32375n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010>\u001a\u00020?J\u0019\u0010@\u001a\u0004\u0018\u00010\u00032\b\u0010A\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010BJ\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010H\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010I\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010J\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010K\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010L\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010M\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010N\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010'J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u0010:J\u0010\u0010W\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u0010:J\u0010\u0010X\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u0010:J\u0094\u0002\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0002\u0010ZJ\u0014\u0010[\u001a\u00020\u001b2\b\u0010\\\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010]\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010^\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010(\u001a\u0004\b)\u0010'R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010(\u001a\u0004\b*\u0010'R\u0015\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010(\u001a\u0004\b+\u0010'R\u0015\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010(\u001a\u0004\b,\u0010'R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010(\u001a\u0004\b-\u0010'R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010(\u001a\u0004\b.\u0010'R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010(\u001a\u0004\b/\u0010'R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u0010;\u001a\u0004\b<\u0010:R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u0010;\u001a\u0004\b=\u0010:¨\u0006_"}, m65681d2 = {"Lcom/whoop/domain/model/teams/LeadersEntry;", "", "name", "", "id", "", "avatarUrl", "rank", "dayStrain", "", "activityStrain", "calories", "recoveryScore", "hrv", "rhr", "sleepDuration", "sleepPerformance", "activities", "", "Lcom/whoop/ui/teams/LeaderActivityDto;", "peakActivity", "createdAt", "updatedAt", "cycleDayJoined", "period", "during", "waitingForData", "", "hasData", "compliant", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getName", "()Ljava/lang/String;", "getId", "()I", "getAvatarUrl", "getRank", "getDayStrain", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getActivityStrain", "getCalories", "getRecoveryScore", "getHrv", "getRhr", "getSleepDuration", "getSleepPerformance", "getActivities", "()Ljava/util/List;", "getPeakActivity", "()Lcom/whoop/ui/teams/LeaderActivityDto;", "getCreatedAt", "getUpdatedAt", "getCycleDayJoined", "getPeriod", "getDuring", "getWaitingForData", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasData", "getCompliant", "toTeamUserListing", "Lcom/whoop/domain/model/teams/TeamUserListing;", "getSleepDurationString", AttachmentExtensionsKt.EXTRA_DURATION, "(Ljava/lang/Double;)Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/domain/model/teams/LeadersEntry;", "equals", "other", "hashCode", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class LeadersEntry {
    private final List<LeaderActivityDto> activities;
    private final Double activityStrain;
    private final String avatarUrl;
    private final Double calories;
    private final Boolean compliant;
    private final String createdAt;
    private final String cycleDayJoined;
    private final Double dayStrain;
    private final String during;
    private final Boolean hasData;
    private final Double hrv;
    private final int id;
    private final String name;
    private final LeaderActivityDto peakActivity;
    private final String period;
    private final int rank;
    private final Double recoveryScore;
    private final Double rhr;
    private final Double sleepDuration;
    private final Double sleepPerformance;
    private final String updatedAt;
    private final Boolean waitingForData;

    public LeadersEntry() {
        this(null, 0, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeadersEntry copy$default(LeadersEntry leadersEntry, String str, int i13, String str2, int i14, Double d3, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, List list, LeaderActivityDto leaderActivityDto, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Boolean bool3, int i15, Object obj) {
        Boolean bool4;
        Boolean bool5;
        String str8 = (i15 & 1) != 0 ? leadersEntry.name : str;
        int i16 = (i15 & 2) != 0 ? leadersEntry.id : i13;
        String str9 = (i15 & 4) != 0 ? leadersEntry.avatarUrl : str2;
        int i17 = (i15 & 8) != 0 ? leadersEntry.rank : i14;
        Double d25 = (i15 & 16) != 0 ? leadersEntry.dayStrain : d3;
        Double d26 = (i15 & 32) != 0 ? leadersEntry.activityStrain : d14;
        Double d27 = (i15 & 64) != 0 ? leadersEntry.calories : d15;
        Double d28 = (i15 & 128) != 0 ? leadersEntry.recoveryScore : d16;
        Double d29 = (i15 & 256) != 0 ? leadersEntry.hrv : d17;
        Double d32 = (i15 & 512) != 0 ? leadersEntry.rhr : d18;
        Double d34 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? leadersEntry.sleepDuration : d19;
        Double d35 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? leadersEntry.sleepPerformance : d24;
        List list2 = (i15 & 4096) != 0 ? leadersEntry.activities : list;
        LeaderActivityDto leaderActivityDto2 = (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? leadersEntry.peakActivity : leaderActivityDto;
        String str10 = str8;
        String str11 = (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? leadersEntry.createdAt : str3;
        String str12 = (i15 & 32768) != 0 ? leadersEntry.updatedAt : str4;
        String str13 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? leadersEntry.cycleDayJoined : str5;
        String str14 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? leadersEntry.period : str6;
        String str15 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? leadersEntry.during : str7;
        Boolean bool6 = (i15 & 524288) != 0 ? leadersEntry.waitingForData : bool;
        Boolean bool7 = (i15 & 1048576) != 0 ? leadersEntry.hasData : bool2;
        if ((i15 & 2097152) != 0) {
            bool5 = bool7;
            bool4 = leadersEntry.compliant;
        } else {
            bool4 = bool3;
            bool5 = bool7;
        }
        return leadersEntry.copy(str10, i16, str9, i17, d25, d26, d27, d28, d29, d32, d34, d35, list2, leaderActivityDto2, str11, str12, str13, str14, str15, bool6, bool5, bool4);
    }

    private final String getSleepDurationString(Double duration) {
        String strValueOf;
        Integer numValueOf = duration != null ? Integer.valueOf((int) duration.doubleValue()) : null;
        Long lValueOf = numValueOf != null ? Long.valueOf(((long) numValueOf.intValue()) / 3600000) : null;
        Long lValueOf2 = (numValueOf == null || lValueOf == null) ? null : Long.valueOf((((long) numValueOf.intValue()) - (lValueOf.longValue() * 3600000)) / 60000);
        if (lValueOf == null || lValueOf2 == null) {
            return null;
        }
        if (lValueOf2.longValue() < 10) {
            strValueOf = UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE + lValueOf2;
        } else {
            strValueOf = String.valueOf(lValueOf2.longValue());
        }
        return lValueOf + ":" + strValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toTeamUserListing$lambda$0(LeaderActivityDto it) {
        AbstractC22676k.m65750j(it, "it");
        return AbstractC18489d0.m53370k(it.getName(), " ", AbstractC10538f.m27183h(it.getStrain()));
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Double getRhr() {
        return this.rhr;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Double getSleepDuration() {
        return this.sleepDuration;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Double getSleepPerformance() {
        return this.sleepPerformance;
    }

    public final List<LeaderActivityDto> component13() {
        return this.activities;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final LeaderActivityDto getPeakActivity() {
        return this.peakActivity;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getCycleDayJoined() {
        return this.cycleDayJoined;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getDuring() {
        return this.during;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Boolean getWaitingForData() {
        return this.waitingForData;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getHasData() {
        return this.hasData;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Boolean getCompliant() {
        return this.compliant;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getDayStrain() {
        return this.dayStrain;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getActivityStrain() {
        return this.activityStrain;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getCalories() {
        return this.calories;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getRecoveryScore() {
        return this.recoveryScore;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getHrv() {
        return this.hrv;
    }

    public final LeadersEntry copy(String name, int id4, String avatarUrl, int rank, Double dayStrain, Double activityStrain, Double calories, Double recoveryScore, Double hrv, Double rhr, Double sleepDuration, Double sleepPerformance, List<LeaderActivityDto> activities, LeaderActivityDto peakActivity, String createdAt, String updatedAt, String cycleDayJoined, String period, String during, Boolean waitingForData, Boolean hasData, Boolean compliant) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(activities, "activities");
        return new LeadersEntry(name, id4, avatarUrl, rank, dayStrain, activityStrain, calories, recoveryScore, hrv, rhr, sleepDuration, sleepPerformance, activities, peakActivity, createdAt, updatedAt, cycleDayJoined, period, during, waitingForData, hasData, compliant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeadersEntry)) {
            return false;
        }
        LeadersEntry leadersEntry = (LeadersEntry) other;
        return AbstractC22676k.m65745e(this.name, leadersEntry.name) && this.id == leadersEntry.id && AbstractC22676k.m65745e(this.avatarUrl, leadersEntry.avatarUrl) && this.rank == leadersEntry.rank && AbstractC22676k.m65745e(this.dayStrain, leadersEntry.dayStrain) && AbstractC22676k.m65745e(this.activityStrain, leadersEntry.activityStrain) && AbstractC22676k.m65745e(this.calories, leadersEntry.calories) && AbstractC22676k.m65745e(this.recoveryScore, leadersEntry.recoveryScore) && AbstractC22676k.m65745e(this.hrv, leadersEntry.hrv) && AbstractC22676k.m65745e(this.rhr, leadersEntry.rhr) && AbstractC22676k.m65745e(this.sleepDuration, leadersEntry.sleepDuration) && AbstractC22676k.m65745e(this.sleepPerformance, leadersEntry.sleepPerformance) && AbstractC22676k.m65745e(this.activities, leadersEntry.activities) && AbstractC22676k.m65745e(this.peakActivity, leadersEntry.peakActivity) && AbstractC22676k.m65745e(this.createdAt, leadersEntry.createdAt) && AbstractC22676k.m65745e(this.updatedAt, leadersEntry.updatedAt) && AbstractC22676k.m65745e(this.cycleDayJoined, leadersEntry.cycleDayJoined) && AbstractC22676k.m65745e(this.period, leadersEntry.period) && AbstractC22676k.m65745e(this.during, leadersEntry.during) && AbstractC22676k.m65745e(this.waitingForData, leadersEntry.waitingForData) && AbstractC22676k.m65745e(this.hasData, leadersEntry.hasData) && AbstractC22676k.m65745e(this.compliant, leadersEntry.compliant);
    }

    public final List<LeaderActivityDto> getActivities() {
        return this.activities;
    }

    public final Double getActivityStrain() {
        return this.activityStrain;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final Double getCalories() {
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

    public final Double getDayStrain() {
        return this.dayStrain;
    }

    public final String getDuring() {
        return this.during;
    }

    public final Boolean getHasData() {
        return this.hasData;
    }

    public final Double getHrv() {
        return this.hrv;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final LeaderActivityDto getPeakActivity() {
        return this.peakActivity;
    }

    public final String getPeriod() {
        return this.period;
    }

    public final int getRank() {
        return this.rank;
    }

    public final Double getRecoveryScore() {
        return this.recoveryScore;
    }

    public final Double getRhr() {
        return this.rhr;
    }

    public final Double getSleepDuration() {
        return this.sleepDuration;
    }

    public final Double getSleepPerformance() {
        return this.sleepPerformance;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final Boolean getWaitingForData() {
        return this.waitingForData;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.id, this.name.hashCode() * 31, 31);
        String str = this.avatarUrl;
        int iM30448b2 = AbstractC11266d.m30448b(this.rank, (iM30448b + (str == null ? 0 : str.hashCode())) * 31, 31);
        Double d3 = this.dayStrain;
        int iHashCode = (iM30448b2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d14 = this.activityStrain;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.calories;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.recoveryScore;
        int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.hrv;
        int iHashCode5 = (iHashCode4 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.rhr;
        int iHashCode6 = (iHashCode5 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.sleepDuration;
        int iHashCode7 = (iHashCode6 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.sleepPerformance;
        int iM31983b = AbstractC11895b.m31983b((iHashCode7 + (d24 == null ? 0 : d24.hashCode())) * 31, 31, this.activities);
        LeaderActivityDto leaderActivityDto = this.peakActivity;
        int iHashCode8 = (iM31983b + (leaderActivityDto == null ? 0 : leaderActivityDto.hashCode())) * 31;
        String str2 = this.createdAt;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.updatedAt;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cycleDayJoined;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.period;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.during;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.waitingForData;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasData;
        int iHashCode15 = (iHashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.compliant;
        return iHashCode15 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        int i13 = this.id;
        String str2 = this.avatarUrl;
        int i14 = this.rank;
        Double d3 = this.dayStrain;
        Double d14 = this.activityStrain;
        Double d15 = this.calories;
        Double d16 = this.recoveryScore;
        Double d17 = this.hrv;
        Double d18 = this.rhr;
        Double d19 = this.sleepDuration;
        Double d24 = this.sleepPerformance;
        List<LeaderActivityDto> list = this.activities;
        LeaderActivityDto leaderActivityDto = this.peakActivity;
        String str3 = this.createdAt;
        String str4 = this.updatedAt;
        String str5 = this.cycleDayJoined;
        String str6 = this.period;
        String str7 = this.during;
        Boolean bool = this.waitingForData;
        Boolean bool2 = this.hasData;
        Boolean bool3 = this.compliant;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "LeadersEntry(name=", str, ", id=", ", avatarUrl=");
        AbstractC11266d.m30470x(i14, str2, ", rank=", ", dayStrain=", sbM30467u);
        AbstractC21702c.m61146q(sbM30467u, d3, ", activityStrain=", d14, ", calories=");
        AbstractC21702c.m61146q(sbM30467u, d15, ", recoveryScore=", d16, ", hrv=");
        AbstractC21702c.m61146q(sbM30467u, d17, ", rhr=", d18, ", sleepDuration=");
        AbstractC21702c.m61146q(sbM30467u, d19, ", sleepPerformance=", d24, ", activities=");
        sbM30467u.append(list);
        sbM30467u.append(", peakActivity=");
        sbM30467u.append(leaderActivityDto);
        sbM30467u.append(", createdAt=");
        AbstractC11266d.m30444B(sbM30467u, str3, ", updatedAt=", str4, ", cycleDayJoined=");
        AbstractC11266d.m30444B(sbM30467u, str5, ", period=", str6, ", during=");
        AbstractC36095b.m114692t(bool, str7, ", waitingForData=", ", hasData=", sbM30467u);
        sbM30467u.append(bool2);
        sbM30467u.append(", compliant=");
        sbM30467u.append(bool3);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    public final TeamUserListing toTeamUserListing() {
        String strM53370k;
        if (this.activities.isEmpty()) {
            LeaderActivityDto leaderActivityDto = this.peakActivity;
            strM53370k = leaderActivityDto != null ? AbstractC18489d0.m53370k(leaderActivityDto.getName(), " ", AbstractC10538f.m27183h(this.peakActivity.getStrain())) : "";
        } else {
            strM53370k = AbstractC25265s.m74110N0(this.activities, ", ", null, null, new C32375n(2), 30);
        }
        String str = strM53370k;
        TeamPrivacyProfile teamPrivacyProfile = new TeamPrivacyProfile(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
        int i13 = this.id;
        int i14 = this.rank;
        User userM84055f = C12723b.m35566a().m35572g().m84055f();
        boolean z4 = i13 == (userM84055f != null ? userM84055f.getId() : 0);
        String str2 = this.name;
        String str3 = this.avatarUrl;
        Double d3 = this.dayStrain;
        Float fValueOf = d3 != null ? Float.valueOf((float) d3.doubleValue()) : null;
        Double d14 = this.calories;
        int iM36257W = AbstractC12889b.m36257W(d14 != null ? d14.doubleValue() : 0.0d);
        Double d15 = this.recoveryScore;
        Double d16 = this.hrv;
        Integer numValueOf = d16 != null ? Integer.valueOf((int) (d16.doubleValue() * ((double) 1000))) : null;
        Double d17 = this.rhr;
        Integer numValueOf2 = d17 != null ? Integer.valueOf((int) d17.doubleValue()) : null;
        Double d18 = this.sleepPerformance;
        Double d19 = this.sleepDuration;
        Integer numValueOf3 = d19 != null ? Integer.valueOf((int) d19.doubleValue()) : null;
        String sleepDurationString = getSleepDurationString(this.sleepDuration);
        Double d24 = this.activityStrain;
        return new TeamUserListing(i13, i14, z4, str2, "???", str3, fValueOf, d24 != null ? Float.valueOf((float) d24.doubleValue()) : null, str, Integer.valueOf(iM36257W), d15, numValueOf, numValueOf2, d18, numValueOf3, sleepDurationString, teamPrivacyProfile, this.peakActivity, this.createdAt, this.updatedAt, this.cycleDayJoined, this.period, this.waitingForData, this.hasData, this.compliant);
    }

    public LeadersEntry(String name, int i13, String str, int i14, Double d3, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, List<LeaderActivityDto> activities, LeaderActivityDto leaderActivityDto, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(activities, "activities");
        this.name = name;
        this.id = i13;
        this.avatarUrl = str;
        this.rank = i14;
        this.dayStrain = d3;
        this.activityStrain = d14;
        this.calories = d15;
        this.recoveryScore = d16;
        this.hrv = d17;
        this.rhr = d18;
        this.sleepDuration = d19;
        this.sleepPerformance = d24;
        this.activities = activities;
        this.peakActivity = leaderActivityDto;
        this.createdAt = str2;
        this.updatedAt = str3;
        this.cycleDayJoined = str4;
        this.period = str5;
        this.during = str6;
        this.waitingForData = bool;
        this.hasData = bool2;
        this.compliant = bool3;
    }

    public /* synthetic */ LeadersEntry(String str, int i13, String str2, int i14, Double d3, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, List list, LeaderActivityDto leaderActivityDto, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Boolean bool3, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? -1 : i13, (i15 & 4) != 0 ? null : str2, (i15 & 8) != 0 ? 0 : i14, (i15 & 16) != 0 ? null : d3, (i15 & 32) != 0 ? null : d14, (i15 & 64) != 0 ? null : d15, (i15 & 128) != 0 ? null : d16, (i15 & 256) != 0 ? null : d17, (i15 & 512) != 0 ? null : d18, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : d19, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : d24, (i15 & 4096) != 0 ? new ArrayList() : list, (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : leaderActivityDto, (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str3, (i15 & 32768) != 0 ? null : str4, (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : str5, (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : str6, (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : str7, (i15 & 524288) != 0 ? Boolean.FALSE : bool, (i15 & 1048576) != 0 ? Boolean.FALSE : bool2, (i15 & 2097152) != 0 ? Boolean.FALSE : bool3);
    }
}
