package com.whoop.p069ui.teams;

import androidx.profileinstaller.ProfileVerifier;
import com.google.gson.annotations.SerializedName;
import com.whoop.domain.model.teams.LeadersEntry;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hb1.C17089l;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u0000 y2\u00020\u0001:\u0002z{B\u008d\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001e\u0010\u001fBù\u0001\b\u0010\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010(J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b2\u00101J\u0012\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b3\u00101J\u0012\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b4\u00101J\u0012\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b5\u00101J\u0012\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b6\u00101J\u0012\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b7\u00101J\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010(J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010(J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010(J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u0010(J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010(J\u0012\u0010A\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bC\u0010BJ\u0012\u0010D\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bD\u0010BJ\u009a\u0002\u0010E\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bG\u0010(J\u0010\u0010H\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bH\u0010*J\u001a\u0010J\u001a\u00020\b2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bJ\u0010KJ'\u0010T\u001a\u00020Q2\u0006\u0010L\u001a\u00020\u00002\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020OH\u0001¢\u0006\u0004\bR\u0010SR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010U\u001a\u0004\bV\u0010(R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010W\u0012\u0004\bY\u0010Z\u001a\u0004\bX\u0010*R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010U\u001a\u0004\b[\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\\\u001a\u0004\b]\u0010-R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010^\u001a\u0004\b_\u0010/R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010`\u001a\u0004\ba\u00101R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010`\u001a\u0004\bb\u00101R\"\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010`\u0012\u0004\bd\u0010Z\u001a\u0004\bc\u00101R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010`\u001a\u0004\be\u00101R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010`\u001a\u0004\bf\u00101R\"\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010`\u0012\u0004\bh\u0010Z\u001a\u0004\bg\u00101R\"\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010`\u0012\u0004\bj\u0010Z\u001a\u0004\bi\u00101R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010k\u001a\u0004\bl\u00109R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010m\u001a\u0004\bn\u0010;R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010U\u001a\u0004\bo\u0010(R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010U\u001a\u0004\bp\u0010(R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010U\u001a\u0004\bq\u0010(R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010U\u001a\u0004\br\u0010(R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010U\u001a\u0004\bs\u0010(R\"\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010t\u0012\u0004\bv\u0010Z\u001a\u0004\bu\u0010BR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010t\u001a\u0004\bw\u0010BR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010t\u001a\u0004\bx\u0010B¨\u0006|"}, m65681d2 = {"Lcom/whoop/ui/teams/LeadersEntryDto;", "", "", "name", "", "id", "avatarUrl", "rank", "", "deleted", "", "dayStrain", "calories", "recoveryScore", "hrv", "rhr", "sleepDuration", "sleepPerformance", "", "Lcom/whoop/ui/teams/LeaderActivityDto;", "activities", "peakActivity", "createdAt", "updatedAt", "cycleDayJoined", "period", "during", "waitingForData", "compliant", "hasData", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/whoop/domain/model/teams/LeadersEntry;", "toLeadersEntry", "()Lcom/whoop/domain/model/teams/LeadersEntry;", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Ljava/lang/Integer;", "component5", "()Z", "component6", "()Ljava/lang/Double;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljava/util/List;", "component14", "()Lcom/whoop/ui/teams/LeaderActivityDto;", "component15", "component16", "component17", "component18", "component19", "component20", "()Ljava/lang/Boolean;", "component21", "component22", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/ui/teams/LeadersEntryDto;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/ui/teams/LeadersEntryDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getName", "I", "getId", "getId$annotations", "()V", "getAvatarUrl", "Ljava/lang/Integer;", "getRank", "Z", "getDeleted", "Ljava/lang/Double;", "getDayStrain", "getCalories", "getRecoveryScore", "getRecoveryScore$annotations", "getHrv", "getRhr", "getSleepDuration", "getSleepDuration$annotations", "getSleepPerformance", "getSleepPerformance$annotations", "Ljava/util/List;", "getActivities", "Lcom/whoop/ui/teams/LeaderActivityDto;", "getPeakActivity", "getCreatedAt", "getUpdatedAt", "getCycleDayJoined", "getPeriod", "getDuring", "Ljava/lang/Boolean;", "getWaitingForData", "getWaitingForData$annotations", "getCompliant", "getHasData", "Companion", "$serializer", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LeadersEntryDto {

    @SerializedName("activities")
    private final List<LeaderActivityDto> activities;

    @SerializedName("avatar_url")
    private final String avatarUrl;

    @SerializedName("calories")
    private final Double calories;

    @SerializedName("compliant")
    private final Boolean compliant;

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("cycle_day_joined")
    private final String cycleDayJoined;

    @SerializedName("day_strain")
    private final Double dayStrain;

    @SerializedName("deleted")
    private final boolean deleted;

    @SerializedName("during")
    private final String during;

    @SerializedName("has_data")
    private final Boolean hasData;

    @SerializedName("hrv")
    private final Double hrv;

    @SerializedName("user_id")
    private final int id;

    @SerializedName("name")
    private final String name;

    @SerializedName("peak_activity")
    private final LeaderActivityDto peakActivity;

    @SerializedName("period")
    private final String period;

    @SerializedName("rank")
    private final Integer rank;

    @SerializedName("score")
    private final Double recoveryScore;

    @SerializedName("rhr")
    private final Double rhr;

    @SerializedName(AttachmentExtensionsKt.EXTRA_DURATION)
    private final Double sleepDuration;

    @SerializedName("performance")
    private final Double sleepPerformance;

    @SerializedName("updated_at")
    private final String updatedAt;

    @SerializedName("is_waiting_for_data")
    private final Boolean waitingForData;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C17089l(12)), null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: com.whoop.ui.teams.LeadersEntryDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ui/teams/LeadersEntryDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ui/teams/LeadersEntryDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LeadersEntryDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LeadersEntryDto(int i13, String str, int i14, String str2, Integer num, boolean z4, Double d3, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, List list, LeaderActivityDto leaderActivityDto, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Boolean bool3, SerializationConstructorMarker serializationConstructorMarker) {
        if (18 != (i13 & 18)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 18, LeadersEntryDto$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        this.id = i14;
        if ((i13 & 4) == 0) {
            this.avatarUrl = null;
        } else {
            this.avatarUrl = str2;
        }
        if ((i13 & 8) == 0) {
            this.rank = null;
        } else {
            this.rank = num;
        }
        this.deleted = z4;
        if ((i13 & 32) == 0) {
            this.dayStrain = null;
        } else {
            this.dayStrain = d3;
        }
        if ((i13 & 64) == 0) {
            this.calories = null;
        } else {
            this.calories = d14;
        }
        if ((i13 & 128) == 0) {
            this.recoveryScore = null;
        } else {
            this.recoveryScore = d15;
        }
        if ((i13 & 256) == 0) {
            this.hrv = null;
        } else {
            this.hrv = d16;
        }
        if ((i13 & 512) == 0) {
            this.rhr = null;
        } else {
            this.rhr = d17;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.sleepDuration = null;
        } else {
            this.sleepDuration = d18;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.sleepPerformance = null;
        } else {
            this.sleepPerformance = d19;
        }
        this.activities = (i13 & 4096) == 0 ? new ArrayList() : list;
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.peakActivity = null;
        } else {
            this.peakActivity = leaderActivityDto;
        }
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = str3;
        }
        if ((32768 & i13) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = str4;
        }
        if ((65536 & i13) == 0) {
            this.cycleDayJoined = null;
        } else {
            this.cycleDayJoined = str5;
        }
        if ((131072 & i13) == 0) {
            this.period = null;
        } else {
            this.period = str6;
        }
        if ((262144 & i13) == 0) {
            this.during = null;
        } else {
            this.during = str7;
        }
        if ((524288 & i13) == 0) {
            this.waitingForData = null;
        } else {
            this.waitingForData = bool;
        }
        if ((1048576 & i13) == 0) {
            this.compliant = null;
        } else {
            this.compliant = bool2;
        }
        if ((i13 & 2097152) == 0) {
            this.hasData = null;
        } else {
            this.hasData = bool3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(LeaderActivityDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeadersEntryDto copy$default(LeadersEntryDto leadersEntryDto, String str, int i13, String str2, Integer num, boolean z4, Double d3, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, List list, LeaderActivityDto leaderActivityDto, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Boolean bool3, int i14, Object obj) {
        Boolean bool4;
        Boolean bool5;
        String str8 = (i14 & 1) != 0 ? leadersEntryDto.name : str;
        int i15 = (i14 & 2) != 0 ? leadersEntryDto.id : i13;
        String str9 = (i14 & 4) != 0 ? leadersEntryDto.avatarUrl : str2;
        Integer num2 = (i14 & 8) != 0 ? leadersEntryDto.rank : num;
        boolean z13 = (i14 & 16) != 0 ? leadersEntryDto.deleted : z4;
        Double d24 = (i14 & 32) != 0 ? leadersEntryDto.dayStrain : d3;
        Double d25 = (i14 & 64) != 0 ? leadersEntryDto.calories : d14;
        Double d26 = (i14 & 128) != 0 ? leadersEntryDto.recoveryScore : d15;
        Double d27 = (i14 & 256) != 0 ? leadersEntryDto.hrv : d16;
        Double d28 = (i14 & 512) != 0 ? leadersEntryDto.rhr : d17;
        Double d29 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? leadersEntryDto.sleepDuration : d18;
        Double d32 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? leadersEntryDto.sleepPerformance : d19;
        List list2 = (i14 & 4096) != 0 ? leadersEntryDto.activities : list;
        LeaderActivityDto leaderActivityDto2 = (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? leadersEntryDto.peakActivity : leaderActivityDto;
        String str10 = str8;
        String str11 = (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? leadersEntryDto.createdAt : str3;
        String str12 = (i14 & 32768) != 0 ? leadersEntryDto.updatedAt : str4;
        String str13 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? leadersEntryDto.cycleDayJoined : str5;
        String str14 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? leadersEntryDto.period : str6;
        String str15 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? leadersEntryDto.during : str7;
        Boolean bool6 = (i14 & 524288) != 0 ? leadersEntryDto.waitingForData : bool;
        Boolean bool7 = (i14 & 1048576) != 0 ? leadersEntryDto.compliant : bool2;
        if ((i14 & 2097152) != 0) {
            bool5 = bool7;
            bool4 = leadersEntryDto.hasData;
        } else {
            bool4 = bool3;
            bool5 = bool7;
        }
        return leadersEntryDto.copy(str10, i15, str9, num2, z13, d24, d25, d26, d27, d28, d29, d32, list2, leaderActivityDto2, str11, str12, str13, str14, str15, bool6, bool5, bool4);
    }

    @InterfaceC37143h("user_id")
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC37143h("score")
    public static /* synthetic */ void getRecoveryScore$annotations() {
    }

    @InterfaceC37143h(AttachmentExtensionsKt.EXTRA_DURATION)
    public static /* synthetic */ void getSleepDuration$annotations() {
    }

    @InterfaceC37143h("performance")
    public static /* synthetic */ void getSleepPerformance$annotations() {
    }

    @InterfaceC37143h("is_waiting_for_data")
    public static /* synthetic */ void getWaitingForData$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(LeadersEntryDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.name != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.name);
        }
        output.encodeIntElement(serialDesc, 1, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.avatarUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.avatarUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.rank != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.rank);
        }
        output.encodeBooleanElement(serialDesc, 4, self.deleted);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.dayStrain != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, DoubleSerializer.INSTANCE, self.dayStrain);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.calories != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, DoubleSerializer.INSTANCE, self.calories);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.recoveryScore != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, DoubleSerializer.INSTANCE, self.recoveryScore);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.hrv != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, DoubleSerializer.INSTANCE, self.hrv);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.rhr != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, DoubleSerializer.INSTANCE, self.rhr);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.sleepDuration != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, DoubleSerializer.INSTANCE, self.sleepDuration);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.sleepPerformance != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, DoubleSerializer.INSTANCE, self.sleepPerformance);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || !AbstractC22676k.m65745e(self.activities, new ArrayList())) {
            output.encodeNullableSerializableElement(serialDesc, 12, (InterfaceC37145j) interfaceC23462hArr[12].getValue(), self.activities);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.peakActivity != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, LeaderActivityDto$$serializer.INSTANCE, self.peakActivity);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.createdAt != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, self.createdAt);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.updatedAt != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, StringSerializer.INSTANCE, self.updatedAt);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.cycleDayJoined != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, StringSerializer.INSTANCE, self.cycleDayJoined);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.period != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, StringSerializer.INSTANCE, self.period);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.during != null) {
            output.encodeNullableSerializableElement(serialDesc, 18, StringSerializer.INSTANCE, self.during);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 19) || self.waitingForData != null) {
            output.encodeNullableSerializableElement(serialDesc, 19, BooleanSerializer.INSTANCE, self.waitingForData);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 20) || self.compliant != null) {
            output.encodeNullableSerializableElement(serialDesc, 20, BooleanSerializer.INSTANCE, self.compliant);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 21) && self.hasData == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 21, BooleanSerializer.INSTANCE, self.hasData);
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
    public final Boolean getCompliant() {
        return this.compliant;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Boolean getHasData() {
        return this.hasData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getDayStrain() {
        return this.dayStrain;
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

    public final LeadersEntryDto copy(String name, int id4, String avatarUrl, Integer rank, boolean deleted, Double dayStrain, Double calories, Double recoveryScore, Double hrv, Double rhr, Double sleepDuration, Double sleepPerformance, List<LeaderActivityDto> activities, LeaderActivityDto peakActivity, String createdAt, String updatedAt, String cycleDayJoined, String period, String during, Boolean waitingForData, Boolean compliant, Boolean hasData) {
        return new LeadersEntryDto(name, id4, avatarUrl, rank, deleted, dayStrain, calories, recoveryScore, hrv, rhr, sleepDuration, sleepPerformance, activities, peakActivity, createdAt, updatedAt, cycleDayJoined, period, during, waitingForData, compliant, hasData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeadersEntryDto)) {
            return false;
        }
        LeadersEntryDto leadersEntryDto = (LeadersEntryDto) other;
        return AbstractC22676k.m65745e(this.name, leadersEntryDto.name) && this.id == leadersEntryDto.id && AbstractC22676k.m65745e(this.avatarUrl, leadersEntryDto.avatarUrl) && AbstractC22676k.m65745e(this.rank, leadersEntryDto.rank) && this.deleted == leadersEntryDto.deleted && AbstractC22676k.m65745e(this.dayStrain, leadersEntryDto.dayStrain) && AbstractC22676k.m65745e(this.calories, leadersEntryDto.calories) && AbstractC22676k.m65745e(this.recoveryScore, leadersEntryDto.recoveryScore) && AbstractC22676k.m65745e(this.hrv, leadersEntryDto.hrv) && AbstractC22676k.m65745e(this.rhr, leadersEntryDto.rhr) && AbstractC22676k.m65745e(this.sleepDuration, leadersEntryDto.sleepDuration) && AbstractC22676k.m65745e(this.sleepPerformance, leadersEntryDto.sleepPerformance) && AbstractC22676k.m65745e(this.activities, leadersEntryDto.activities) && AbstractC22676k.m65745e(this.peakActivity, leadersEntryDto.peakActivity) && AbstractC22676k.m65745e(this.createdAt, leadersEntryDto.createdAt) && AbstractC22676k.m65745e(this.updatedAt, leadersEntryDto.updatedAt) && AbstractC22676k.m65745e(this.cycleDayJoined, leadersEntryDto.cycleDayJoined) && AbstractC22676k.m65745e(this.period, leadersEntryDto.period) && AbstractC22676k.m65745e(this.during, leadersEntryDto.during) && AbstractC22676k.m65745e(this.waitingForData, leadersEntryDto.waitingForData) && AbstractC22676k.m65745e(this.compliant, leadersEntryDto.compliant) && AbstractC22676k.m65745e(this.hasData, leadersEntryDto.hasData);
    }

    public final List<LeaderActivityDto> getActivities() {
        return this.activities;
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

    public final boolean getDeleted() {
        return this.deleted;
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

    public final Integer getRank() {
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
        String str = this.name;
        int iM30448b = AbstractC11266d.m30448b(this.id, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.avatarUrl;
        int iHashCode = (iM30448b + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.rank;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.deleted);
        Double d3 = this.dayStrain;
        int iHashCode2 = (iM8289b + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d14 = this.calories;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.recoveryScore;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.hrv;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.rhr;
        int iHashCode6 = (iHashCode5 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.sleepDuration;
        int iHashCode7 = (iHashCode6 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.sleepPerformance;
        int iHashCode8 = (iHashCode7 + (d19 == null ? 0 : d19.hashCode())) * 31;
        List<LeaderActivityDto> list = this.activities;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
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
        String str7 = this.during;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.waitingForData;
        int iHashCode16 = (iHashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.compliant;
        int iHashCode17 = (iHashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasData;
        return iHashCode17 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final LeadersEntry toLeadersEntry() {
        String str = this.name;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        int i13 = this.id;
        String str3 = this.avatarUrl;
        Integer num = this.rank;
        int iIntValue = num != null ? num.intValue() : 0;
        Double d3 = this.dayStrain;
        Double d14 = this.calories;
        Double d15 = this.recoveryScore;
        Double d16 = this.hrv;
        Double d17 = this.rhr;
        Double d18 = this.sleepDuration;
        Double d19 = this.sleepPerformance;
        List arrayList = this.activities;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        return new LeadersEntry(str2, i13, str3, iIntValue, d3, null, d14, d15, d16, d17, d18, d19, arrayList, this.peakActivity, this.createdAt, this.updatedAt, this.cycleDayJoined, this.period, null, this.waitingForData, this.hasData, this.compliant, 262176, null);
    }

    public String toString() {
        String str = this.name;
        int i13 = this.id;
        String str2 = this.avatarUrl;
        Integer num = this.rank;
        boolean z4 = this.deleted;
        Double d3 = this.dayStrain;
        Double d14 = this.calories;
        Double d15 = this.recoveryScore;
        Double d16 = this.hrv;
        Double d17 = this.rhr;
        Double d18 = this.sleepDuration;
        Double d19 = this.sleepPerformance;
        List<LeaderActivityDto> list = this.activities;
        LeaderActivityDto leaderActivityDto = this.peakActivity;
        String str3 = this.createdAt;
        String str4 = this.updatedAt;
        String str5 = this.cycleDayJoined;
        String str6 = this.period;
        String str7 = this.during;
        Boolean bool = this.waitingForData;
        Boolean bool2 = this.compliant;
        Boolean bool3 = this.hasData;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "LeadersEntryDto(name=", str, ", id=", ", avatarUrl=");
        AbstractC30007c.m91853w(num, str2, ", rank=", ", deleted=", sbM30467u);
        sbM30467u.append(z4);
        sbM30467u.append(", dayStrain=");
        sbM30467u.append(d3);
        sbM30467u.append(", calories=");
        AbstractC21702c.m61146q(sbM30467u, d14, ", recoveryScore=", d15, ", hrv=");
        AbstractC21702c.m61146q(sbM30467u, d16, ", rhr=", d17, ", sleepDuration=");
        AbstractC21702c.m61146q(sbM30467u, d18, ", sleepPerformance=", d19, ", activities=");
        sbM30467u.append(list);
        sbM30467u.append(", peakActivity=");
        sbM30467u.append(leaderActivityDto);
        sbM30467u.append(", createdAt=");
        AbstractC11266d.m30444B(sbM30467u, str3, ", updatedAt=", str4, ", cycleDayJoined=");
        AbstractC11266d.m30444B(sbM30467u, str5, ", period=", str6, ", during=");
        AbstractC36095b.m114692t(bool, str7, ", waitingForData=", ", compliant=", sbM30467u);
        sbM30467u.append(bool2);
        sbM30467u.append(", hasData=");
        sbM30467u.append(bool3);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    public LeadersEntryDto(String str, int i13, String str2, Integer num, boolean z4, Double d3, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, List<LeaderActivityDto> list, LeaderActivityDto leaderActivityDto, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Boolean bool3) {
        this.name = str;
        this.id = i13;
        this.avatarUrl = str2;
        this.rank = num;
        this.deleted = z4;
        this.dayStrain = d3;
        this.calories = d14;
        this.recoveryScore = d15;
        this.hrv = d16;
        this.rhr = d17;
        this.sleepDuration = d18;
        this.sleepPerformance = d19;
        this.activities = list;
        this.peakActivity = leaderActivityDto;
        this.createdAt = str3;
        this.updatedAt = str4;
        this.cycleDayJoined = str5;
        this.period = str6;
        this.during = str7;
        this.waitingForData = bool;
        this.compliant = bool2;
        this.hasData = bool3;
    }

    public /* synthetic */ LeadersEntryDto(String str, int i13, String str2, Integer num, boolean z4, Double d3, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, List list, LeaderActivityDto leaderActivityDto, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Boolean bool3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : str, i13, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : num, z4, (i14 & 32) != 0 ? null : d3, (i14 & 64) != 0 ? null : d14, (i14 & 128) != 0 ? null : d15, (i14 & 256) != 0 ? null : d16, (i14 & 512) != 0 ? null : d17, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : d18, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : d19, (i14 & 4096) != 0 ? new ArrayList() : list, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : leaderActivityDto, (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str3, (32768 & i14) != 0 ? null : str4, (65536 & i14) != 0 ? null : str5, (131072 & i14) != 0 ? null : str6, (262144 & i14) != 0 ? null : str7, (524288 & i14) != 0 ? null : bool, (1048576 & i14) != 0 ? null : bool2, (i14 & 2097152) != 0 ? null : bool3);
    }
}
