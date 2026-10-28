package com.whoop.healthconnect.domain.models;

import androidx.profileinstaller.ProfileVerifier;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lh1.C24069a;
import lj1.C24474b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0002`_Bý\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fBµ\u0002\b\u0010\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0004\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001e\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004HÆ\u0003¢\u0006\u0004\b+\u0010(J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\u0004HÆ\u0003¢\u0006\u0004\b,\u0010(J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004HÆ\u0003¢\u0006\u0004\b-\u0010(J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004HÆ\u0003¢\u0006\u0004\b.\u0010(J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004HÆ\u0003¢\u0006\u0004\b/\u0010(J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b0\u0010(J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b1\u0010(J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b2\u0010(J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b3\u0010(J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b4\u0010(J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b5\u0010(J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b6\u0010(J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b7\u0010(J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b8\u0010(Jª\u0002\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010&J\u0010\u0010<\u001a\u00020 HÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b@\u0010AJ'\u0010J\u001a\u00020G2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020EH\u0001¢\u0006\u0004\bH\u0010IR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010K\u001a\u0004\bL\u0010&R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010M\u001a\u0004\bN\u0010(R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010M\u001a\u0004\bO\u0010(R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010M\u001a\u0004\bP\u0010(R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010M\u001a\u0004\bQ\u0010(R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bR\u0010(R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010M\u001a\u0004\bS\u0010(R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010M\u001a\u0004\bT\u0010(R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bU\u0010(R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010M\u001a\u0004\bV\u0010(R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010M\u001a\u0004\bW\u0010(R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010M\u001a\u0004\bX\u0010(R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010M\u001a\u0004\bY\u0010(R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010M\u001a\u0004\bZ\u0010(R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010M\u001a\u0004\b[\u0010(R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010M\u001a\u0004\b\\\u0010(R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010M\u001a\u0004\b]\u0010(R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010M\u001a\u0004\b^\u0010(¨\u0006a"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;", "", "", "token", "", "Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;", "exerciseSessionRecords", "Lcom/whoop/healthconnect/domain/models/HealthConnectActiveCaloriesBurnedModel;", "activeCaloriesBurnedRecords", "Lcom/whoop/healthconnect/domain/models/HealthConnectSleepSessionModel;", "sleepSessionRecords", "Lcom/whoop/healthconnect/domain/models/HealthConnectRespiratoryRateModel;", "respiratoryRateRecords", "Lcom/whoop/healthconnect/domain/models/HealthConnectRestingHeartRateModel;", "restingHeartRateRecords", "Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;", "oxygenSaturationRecords", "Lcom/whoop/healthconnect/domain/models/HealthConnectHeartRateModel;", "heartRateRecords", "Lcom/whoop/healthconnect/domain/models/StepsRecordModel;", "stepRecords", "deletedExerciseSessionRecords", "deletedActiveCaloriesBurnedRecords", "deletedSleepSessionRecords", "deletedSleepStageRecords", "deletedRespiratoryRateRecords", "deletedRestingHeartRateRecords", "deletedOxygenSaturationRecords", "deletedHeartRateRecords", "deletedStepRecords", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_connect_release", "(Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getToken", "Ljava/util/List;", "getExerciseSessionRecords", "getActiveCaloriesBurnedRecords", "getSleepSessionRecords", "getRespiratoryRateRecords", "getRestingHeartRateRecords", "getOxygenSaturationRecords", "getHeartRateRecords", "getStepRecords", "getDeletedExerciseSessionRecords", "getDeletedActiveCaloriesBurnedRecords", "getDeletedSleepSessionRecords", "getDeletedSleepStageRecords", "getDeletedRespiratoryRateRecords", "getDeletedRestingHeartRateRecords", "getDeletedOxygenSaturationRecords", "getDeletedHeartRateRecords", "getDeletedStepRecords", "Companion", "$serializer", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HealthConnectEventsResponse {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("active_calories_burned_records")
    private final List<HealthConnectActiveCaloriesBurnedModel> activeCaloriesBurnedRecords;

    @SerializedName("deleted_active_calories_burned_records")
    private final List<String> deletedActiveCaloriesBurnedRecords;

    @SerializedName("deleted_exercise_session_records")
    private final List<String> deletedExerciseSessionRecords;

    @SerializedName("deleted_heart_rate_records")
    private final List<String> deletedHeartRateRecords;

    @SerializedName("deleted_oxygen_saturation_records")
    private final List<String> deletedOxygenSaturationRecords;

    @SerializedName("deleted_respiratory_rate_records")
    private final List<String> deletedRespiratoryRateRecords;

    @SerializedName("deleted_resting_heart_rate_records")
    private final List<String> deletedRestingHeartRateRecords;

    @SerializedName("deleted_sleep_session_records")
    private final List<String> deletedSleepSessionRecords;

    @SerializedName("deleted_sleep_stage_records")
    private final List<String> deletedSleepStageRecords;

    @SerializedName("deleted_step_records")
    private final List<String> deletedStepRecords;

    @SerializedName("exercise_session_records")
    private final List<HealthConnectExerciseSessionModel> exerciseSessionRecords;

    @SerializedName("heart_rate_records")
    private final List<HealthConnectHeartRateModel> heartRateRecords;

    @SerializedName("oxygen_saturation_records")
    private final List<HealthConnectOxygenSaturationModel> oxygenSaturationRecords;

    @SerializedName("respiratory_rate_records")
    private final List<HealthConnectRespiratoryRateModel> respiratoryRateRecords;

    @SerializedName("resting_heart_rate_records")
    private final List<HealthConnectRestingHeartRateModel> restingHeartRateRecords;

    @SerializedName("sleep_session_records")
    private final List<HealthConnectSleepSessionModel> sleepSessionRecords;

    @SerializedName("step_records")
    private final List<StepsRecordModel> stepRecords;

    @SerializedName("token")
    private final String token;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;", "serializer", "()Lwc3/c;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HealthConnectEventsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C24069a(15)), AbstractC30060g.m92087G(enumC23463i, new C24474b(0)), AbstractC30060g.m92087G(enumC23463i, new C24474b(1)), AbstractC30060g.m92087G(enumC23463i, new C24069a(16)), AbstractC30060g.m92087G(enumC23463i, new C24069a(17)), AbstractC30060g.m92087G(enumC23463i, new C24069a(18)), AbstractC30060g.m92087G(enumC23463i, new C24069a(19)), AbstractC30060g.m92087G(enumC23463i, new C24069a(20)), AbstractC30060g.m92087G(enumC23463i, new C24069a(21)), AbstractC30060g.m92087G(enumC23463i, new C24069a(22)), AbstractC30060g.m92087G(enumC23463i, new C24069a(23)), AbstractC30060g.m92087G(enumC23463i, new C24069a(24)), AbstractC30060g.m92087G(enumC23463i, new C24069a(25)), AbstractC30060g.m92087G(enumC23463i, new C24069a(26)), AbstractC30060g.m92087G(enumC23463i, new C24069a(27)), AbstractC30060g.m92087G(enumC23463i, new C24069a(28)), AbstractC30060g.m92087G(enumC23463i, new C24069a(29))};
    }

    public /* synthetic */ HealthConnectEventsResponse(int i13, String str, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, SerializationConstructorMarker serializationConstructorMarker) {
        if (262143 != (i13 & 262143)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 262143, HealthConnectEventsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.token = str;
        this.exerciseSessionRecords = list;
        this.activeCaloriesBurnedRecords = list2;
        this.sleepSessionRecords = list3;
        this.respiratoryRateRecords = list4;
        this.restingHeartRateRecords = list5;
        this.oxygenSaturationRecords = list6;
        this.heartRateRecords = list7;
        this.stepRecords = list8;
        this.deletedExerciseSessionRecords = list9;
        this.deletedActiveCaloriesBurnedRecords = list10;
        this.deletedSleepSessionRecords = list11;
        this.deletedSleepStageRecords = list12;
        this.deletedRespiratoryRateRecords = list13;
        this.deletedRestingHeartRateRecords = list14;
        this.deletedOxygenSaturationRecords = list15;
        this.deletedHeartRateRecords = list16;
        this.deletedStepRecords = list17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(HealthConnectExerciseSessionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(HealthConnectActiveCaloriesBurnedModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(HealthConnectSleepSessionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$10() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$11() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$12() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$13() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$14() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$15() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return new ArrayListSerializer(HealthConnectRespiratoryRateModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        return new ArrayListSerializer(HealthConnectRestingHeartRateModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$4() {
        return new ArrayListSerializer(HealthConnectOxygenSaturationModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$5() {
        return new ArrayListSerializer(HealthConnectHeartRateModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$6() {
        return new ArrayListSerializer(StepsRecordModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$7() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$8() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$9() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthConnectEventsResponse copy$default(HealthConnectEventsResponse healthConnectEventsResponse, String str, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, int i13, Object obj) {
        List list18;
        List list19;
        String str2 = (i13 & 1) != 0 ? healthConnectEventsResponse.token : str;
        List list20 = (i13 & 2) != 0 ? healthConnectEventsResponse.exerciseSessionRecords : list;
        List list21 = (i13 & 4) != 0 ? healthConnectEventsResponse.activeCaloriesBurnedRecords : list2;
        List list22 = (i13 & 8) != 0 ? healthConnectEventsResponse.sleepSessionRecords : list3;
        List list23 = (i13 & 16) != 0 ? healthConnectEventsResponse.respiratoryRateRecords : list4;
        List list24 = (i13 & 32) != 0 ? healthConnectEventsResponse.restingHeartRateRecords : list5;
        List list25 = (i13 & 64) != 0 ? healthConnectEventsResponse.oxygenSaturationRecords : list6;
        List list26 = (i13 & 128) != 0 ? healthConnectEventsResponse.heartRateRecords : list7;
        List list27 = (i13 & 256) != 0 ? healthConnectEventsResponse.stepRecords : list8;
        List list28 = (i13 & 512) != 0 ? healthConnectEventsResponse.deletedExerciseSessionRecords : list9;
        List list29 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? healthConnectEventsResponse.deletedActiveCaloriesBurnedRecords : list10;
        List list30 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? healthConnectEventsResponse.deletedSleepSessionRecords : list11;
        List list31 = (i13 & 4096) != 0 ? healthConnectEventsResponse.deletedSleepStageRecords : list12;
        List list32 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? healthConnectEventsResponse.deletedRespiratoryRateRecords : list13;
        String str3 = str2;
        List list33 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? healthConnectEventsResponse.deletedRestingHeartRateRecords : list14;
        List list34 = (i13 & 32768) != 0 ? healthConnectEventsResponse.deletedOxygenSaturationRecords : list15;
        List list35 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? healthConnectEventsResponse.deletedHeartRateRecords : list16;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            list19 = list35;
            list18 = healthConnectEventsResponse.deletedStepRecords;
        } else {
            list18 = list17;
            list19 = list35;
        }
        return healthConnectEventsResponse.copy(str3, list20, list21, list22, list23, list24, list25, list26, list27, list28, list29, list30, list31, list32, list33, list34, list19, list18);
    }

    public static final /* synthetic */ void write$Self$health_connect_release(HealthConnectEventsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.token);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.exerciseSessionRecords);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.activeCaloriesBurnedRecords);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.sleepSessionRecords);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.respiratoryRateRecords);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.restingHeartRateRecords);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.oxygenSaturationRecords);
        output.encodeSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.heartRateRecords);
        output.encodeSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.stepRecords);
        output.encodeSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.deletedExerciseSessionRecords);
        output.encodeSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.deletedActiveCaloriesBurnedRecords);
        output.encodeSerializableElement(serialDesc, 11, (InterfaceC37145j) interfaceC23462hArr[11].getValue(), self.deletedSleepSessionRecords);
        output.encodeSerializableElement(serialDesc, 12, (InterfaceC37145j) interfaceC23462hArr[12].getValue(), self.deletedSleepStageRecords);
        output.encodeSerializableElement(serialDesc, 13, (InterfaceC37145j) interfaceC23462hArr[13].getValue(), self.deletedRespiratoryRateRecords);
        output.encodeSerializableElement(serialDesc, 14, (InterfaceC37145j) interfaceC23462hArr[14].getValue(), self.deletedRestingHeartRateRecords);
        output.encodeSerializableElement(serialDesc, 15, (InterfaceC37145j) interfaceC23462hArr[15].getValue(), self.deletedOxygenSaturationRecords);
        output.encodeSerializableElement(serialDesc, 16, (InterfaceC37145j) interfaceC23462hArr[16].getValue(), self.deletedHeartRateRecords);
        output.encodeSerializableElement(serialDesc, 17, (InterfaceC37145j) interfaceC23462hArr[17].getValue(), self.deletedStepRecords);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final List<String> component10() {
        return this.deletedExerciseSessionRecords;
    }

    public final List<String> component11() {
        return this.deletedActiveCaloriesBurnedRecords;
    }

    public final List<String> component12() {
        return this.deletedSleepSessionRecords;
    }

    public final List<String> component13() {
        return this.deletedSleepStageRecords;
    }

    public final List<String> component14() {
        return this.deletedRespiratoryRateRecords;
    }

    public final List<String> component15() {
        return this.deletedRestingHeartRateRecords;
    }

    public final List<String> component16() {
        return this.deletedOxygenSaturationRecords;
    }

    public final List<String> component17() {
        return this.deletedHeartRateRecords;
    }

    public final List<String> component18() {
        return this.deletedStepRecords;
    }

    public final List<HealthConnectExerciseSessionModel> component2() {
        return this.exerciseSessionRecords;
    }

    public final List<HealthConnectActiveCaloriesBurnedModel> component3() {
        return this.activeCaloriesBurnedRecords;
    }

    public final List<HealthConnectSleepSessionModel> component4() {
        return this.sleepSessionRecords;
    }

    public final List<HealthConnectRespiratoryRateModel> component5() {
        return this.respiratoryRateRecords;
    }

    public final List<HealthConnectRestingHeartRateModel> component6() {
        return this.restingHeartRateRecords;
    }

    public final List<HealthConnectOxygenSaturationModel> component7() {
        return this.oxygenSaturationRecords;
    }

    public final List<HealthConnectHeartRateModel> component8() {
        return this.heartRateRecords;
    }

    public final List<StepsRecordModel> component9() {
        return this.stepRecords;
    }

    public final HealthConnectEventsResponse copy(String token, List<HealthConnectExerciseSessionModel> exerciseSessionRecords, List<HealthConnectActiveCaloriesBurnedModel> activeCaloriesBurnedRecords, List<HealthConnectSleepSessionModel> sleepSessionRecords, List<HealthConnectRespiratoryRateModel> respiratoryRateRecords, List<HealthConnectRestingHeartRateModel> restingHeartRateRecords, List<HealthConnectOxygenSaturationModel> oxygenSaturationRecords, List<HealthConnectHeartRateModel> heartRateRecords, List<StepsRecordModel> stepRecords, List<String> deletedExerciseSessionRecords, List<String> deletedActiveCaloriesBurnedRecords, List<String> deletedSleepSessionRecords, List<String> deletedSleepStageRecords, List<String> deletedRespiratoryRateRecords, List<String> deletedRestingHeartRateRecords, List<String> deletedOxygenSaturationRecords, List<String> deletedHeartRateRecords, List<String> deletedStepRecords) {
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(exerciseSessionRecords, "exerciseSessionRecords");
        AbstractC22676k.m65750j(activeCaloriesBurnedRecords, "activeCaloriesBurnedRecords");
        AbstractC22676k.m65750j(sleepSessionRecords, "sleepSessionRecords");
        AbstractC22676k.m65750j(respiratoryRateRecords, "respiratoryRateRecords");
        AbstractC22676k.m65750j(restingHeartRateRecords, "restingHeartRateRecords");
        AbstractC22676k.m65750j(oxygenSaturationRecords, "oxygenSaturationRecords");
        AbstractC22676k.m65750j(heartRateRecords, "heartRateRecords");
        AbstractC22676k.m65750j(stepRecords, "stepRecords");
        AbstractC22676k.m65750j(deletedExerciseSessionRecords, "deletedExerciseSessionRecords");
        AbstractC22676k.m65750j(deletedActiveCaloriesBurnedRecords, "deletedActiveCaloriesBurnedRecords");
        AbstractC22676k.m65750j(deletedSleepSessionRecords, "deletedSleepSessionRecords");
        AbstractC22676k.m65750j(deletedSleepStageRecords, "deletedSleepStageRecords");
        AbstractC22676k.m65750j(deletedRespiratoryRateRecords, "deletedRespiratoryRateRecords");
        AbstractC22676k.m65750j(deletedRestingHeartRateRecords, "deletedRestingHeartRateRecords");
        AbstractC22676k.m65750j(deletedOxygenSaturationRecords, "deletedOxygenSaturationRecords");
        AbstractC22676k.m65750j(deletedHeartRateRecords, "deletedHeartRateRecords");
        AbstractC22676k.m65750j(deletedStepRecords, "deletedStepRecords");
        return new HealthConnectEventsResponse(token, exerciseSessionRecords, activeCaloriesBurnedRecords, sleepSessionRecords, respiratoryRateRecords, restingHeartRateRecords, oxygenSaturationRecords, heartRateRecords, stepRecords, deletedExerciseSessionRecords, deletedActiveCaloriesBurnedRecords, deletedSleepSessionRecords, deletedSleepStageRecords, deletedRespiratoryRateRecords, deletedRestingHeartRateRecords, deletedOxygenSaturationRecords, deletedHeartRateRecords, deletedStepRecords);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectEventsResponse)) {
            return false;
        }
        HealthConnectEventsResponse healthConnectEventsResponse = (HealthConnectEventsResponse) other;
        return AbstractC22676k.m65745e(this.token, healthConnectEventsResponse.token) && AbstractC22676k.m65745e(this.exerciseSessionRecords, healthConnectEventsResponse.exerciseSessionRecords) && AbstractC22676k.m65745e(this.activeCaloriesBurnedRecords, healthConnectEventsResponse.activeCaloriesBurnedRecords) && AbstractC22676k.m65745e(this.sleepSessionRecords, healthConnectEventsResponse.sleepSessionRecords) && AbstractC22676k.m65745e(this.respiratoryRateRecords, healthConnectEventsResponse.respiratoryRateRecords) && AbstractC22676k.m65745e(this.restingHeartRateRecords, healthConnectEventsResponse.restingHeartRateRecords) && AbstractC22676k.m65745e(this.oxygenSaturationRecords, healthConnectEventsResponse.oxygenSaturationRecords) && AbstractC22676k.m65745e(this.heartRateRecords, healthConnectEventsResponse.heartRateRecords) && AbstractC22676k.m65745e(this.stepRecords, healthConnectEventsResponse.stepRecords) && AbstractC22676k.m65745e(this.deletedExerciseSessionRecords, healthConnectEventsResponse.deletedExerciseSessionRecords) && AbstractC22676k.m65745e(this.deletedActiveCaloriesBurnedRecords, healthConnectEventsResponse.deletedActiveCaloriesBurnedRecords) && AbstractC22676k.m65745e(this.deletedSleepSessionRecords, healthConnectEventsResponse.deletedSleepSessionRecords) && AbstractC22676k.m65745e(this.deletedSleepStageRecords, healthConnectEventsResponse.deletedSleepStageRecords) && AbstractC22676k.m65745e(this.deletedRespiratoryRateRecords, healthConnectEventsResponse.deletedRespiratoryRateRecords) && AbstractC22676k.m65745e(this.deletedRestingHeartRateRecords, healthConnectEventsResponse.deletedRestingHeartRateRecords) && AbstractC22676k.m65745e(this.deletedOxygenSaturationRecords, healthConnectEventsResponse.deletedOxygenSaturationRecords) && AbstractC22676k.m65745e(this.deletedHeartRateRecords, healthConnectEventsResponse.deletedHeartRateRecords) && AbstractC22676k.m65745e(this.deletedStepRecords, healthConnectEventsResponse.deletedStepRecords);
    }

    public final List<HealthConnectActiveCaloriesBurnedModel> getActiveCaloriesBurnedRecords() {
        return this.activeCaloriesBurnedRecords;
    }

    public final List<String> getDeletedActiveCaloriesBurnedRecords() {
        return this.deletedActiveCaloriesBurnedRecords;
    }

    public final List<String> getDeletedExerciseSessionRecords() {
        return this.deletedExerciseSessionRecords;
    }

    public final List<String> getDeletedHeartRateRecords() {
        return this.deletedHeartRateRecords;
    }

    public final List<String> getDeletedOxygenSaturationRecords() {
        return this.deletedOxygenSaturationRecords;
    }

    public final List<String> getDeletedRespiratoryRateRecords() {
        return this.deletedRespiratoryRateRecords;
    }

    public final List<String> getDeletedRestingHeartRateRecords() {
        return this.deletedRestingHeartRateRecords;
    }

    public final List<String> getDeletedSleepSessionRecords() {
        return this.deletedSleepSessionRecords;
    }

    public final List<String> getDeletedSleepStageRecords() {
        return this.deletedSleepStageRecords;
    }

    public final List<String> getDeletedStepRecords() {
        return this.deletedStepRecords;
    }

    public final List<HealthConnectExerciseSessionModel> getExerciseSessionRecords() {
        return this.exerciseSessionRecords;
    }

    public final List<HealthConnectHeartRateModel> getHeartRateRecords() {
        return this.heartRateRecords;
    }

    public final List<HealthConnectOxygenSaturationModel> getOxygenSaturationRecords() {
        return this.oxygenSaturationRecords;
    }

    public final List<HealthConnectRespiratoryRateModel> getRespiratoryRateRecords() {
        return this.respiratoryRateRecords;
    }

    public final List<HealthConnectRestingHeartRateModel> getRestingHeartRateRecords() {
        return this.restingHeartRateRecords;
    }

    public final List<HealthConnectSleepSessionModel> getSleepSessionRecords() {
        return this.sleepSessionRecords;
    }

    public final List<StepsRecordModel> getStepRecords() {
        return this.stepRecords;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.deletedStepRecords.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.token.hashCode() * 31, 31, this.exerciseSessionRecords), 31, this.activeCaloriesBurnedRecords), 31, this.sleepSessionRecords), 31, this.respiratoryRateRecords), 31, this.restingHeartRateRecords), 31, this.oxygenSaturationRecords), 31, this.heartRateRecords), 31, this.stepRecords), 31, this.deletedExerciseSessionRecords), 31, this.deletedActiveCaloriesBurnedRecords), 31, this.deletedSleepSessionRecords), 31, this.deletedSleepStageRecords), 31, this.deletedRespiratoryRateRecords), 31, this.deletedRestingHeartRateRecords), 31, this.deletedOxygenSaturationRecords), 31, this.deletedHeartRateRecords);
    }

    public String toString() {
        String str = this.token;
        List<HealthConnectExerciseSessionModel> list = this.exerciseSessionRecords;
        List<HealthConnectActiveCaloriesBurnedModel> list2 = this.activeCaloriesBurnedRecords;
        List<HealthConnectSleepSessionModel> list3 = this.sleepSessionRecords;
        List<HealthConnectRespiratoryRateModel> list4 = this.respiratoryRateRecords;
        List<HealthConnectRestingHeartRateModel> list5 = this.restingHeartRateRecords;
        List<HealthConnectOxygenSaturationModel> list6 = this.oxygenSaturationRecords;
        List<HealthConnectHeartRateModel> list7 = this.heartRateRecords;
        List<StepsRecordModel> list8 = this.stepRecords;
        List<String> list9 = this.deletedExerciseSessionRecords;
        List<String> list10 = this.deletedActiveCaloriesBurnedRecords;
        List<String> list11 = this.deletedSleepSessionRecords;
        List<String> list12 = this.deletedSleepStageRecords;
        List<String> list13 = this.deletedRespiratoryRateRecords;
        List<String> list14 = this.deletedRestingHeartRateRecords;
        List<String> list15 = this.deletedOxygenSaturationRecords;
        List<String> list16 = this.deletedHeartRateRecords;
        List<String> list17 = this.deletedStepRecords;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("HealthConnectEventsResponse(token=", str, ", exerciseSessionRecords=", ", activeCaloriesBurnedRecords=", list);
        AbstractC21702c.m61148s(sbM94766o, list2, ", sleepSessionRecords=", list3, ", respiratoryRateRecords=");
        AbstractC21702c.m61148s(sbM94766o, list4, ", restingHeartRateRecords=", list5, ", oxygenSaturationRecords=");
        AbstractC21702c.m61148s(sbM94766o, list6, ", heartRateRecords=", list7, ", stepRecords=");
        AbstractC21702c.m61148s(sbM94766o, list8, ", deletedExerciseSessionRecords=", list9, ", deletedActiveCaloriesBurnedRecords=");
        AbstractC21702c.m61148s(sbM94766o, list10, ", deletedSleepSessionRecords=", list11, ", deletedSleepStageRecords=");
        AbstractC21702c.m61148s(sbM94766o, list12, ", deletedRespiratoryRateRecords=", list13, ", deletedRestingHeartRateRecords=");
        AbstractC21702c.m61148s(sbM94766o, list14, ", deletedOxygenSaturationRecords=", list15, ", deletedHeartRateRecords=");
        return AbstractC30007c.m91843m(sbM94766o, list16, ", deletedStepRecords=", list17, ")");
    }

    public HealthConnectEventsResponse(String token, List<HealthConnectExerciseSessionModel> exerciseSessionRecords, List<HealthConnectActiveCaloriesBurnedModel> activeCaloriesBurnedRecords, List<HealthConnectSleepSessionModel> sleepSessionRecords, List<HealthConnectRespiratoryRateModel> respiratoryRateRecords, List<HealthConnectRestingHeartRateModel> restingHeartRateRecords, List<HealthConnectOxygenSaturationModel> oxygenSaturationRecords, List<HealthConnectHeartRateModel> heartRateRecords, List<StepsRecordModel> stepRecords, List<String> deletedExerciseSessionRecords, List<String> deletedActiveCaloriesBurnedRecords, List<String> deletedSleepSessionRecords, List<String> deletedSleepStageRecords, List<String> deletedRespiratoryRateRecords, List<String> deletedRestingHeartRateRecords, List<String> deletedOxygenSaturationRecords, List<String> deletedHeartRateRecords, List<String> deletedStepRecords) {
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(exerciseSessionRecords, "exerciseSessionRecords");
        AbstractC22676k.m65750j(activeCaloriesBurnedRecords, "activeCaloriesBurnedRecords");
        AbstractC22676k.m65750j(sleepSessionRecords, "sleepSessionRecords");
        AbstractC22676k.m65750j(respiratoryRateRecords, "respiratoryRateRecords");
        AbstractC22676k.m65750j(restingHeartRateRecords, "restingHeartRateRecords");
        AbstractC22676k.m65750j(oxygenSaturationRecords, "oxygenSaturationRecords");
        AbstractC22676k.m65750j(heartRateRecords, "heartRateRecords");
        AbstractC22676k.m65750j(stepRecords, "stepRecords");
        AbstractC22676k.m65750j(deletedExerciseSessionRecords, "deletedExerciseSessionRecords");
        AbstractC22676k.m65750j(deletedActiveCaloriesBurnedRecords, "deletedActiveCaloriesBurnedRecords");
        AbstractC22676k.m65750j(deletedSleepSessionRecords, "deletedSleepSessionRecords");
        AbstractC22676k.m65750j(deletedSleepStageRecords, "deletedSleepStageRecords");
        AbstractC22676k.m65750j(deletedRespiratoryRateRecords, "deletedRespiratoryRateRecords");
        AbstractC22676k.m65750j(deletedRestingHeartRateRecords, "deletedRestingHeartRateRecords");
        AbstractC22676k.m65750j(deletedOxygenSaturationRecords, "deletedOxygenSaturationRecords");
        AbstractC22676k.m65750j(deletedHeartRateRecords, "deletedHeartRateRecords");
        AbstractC22676k.m65750j(deletedStepRecords, "deletedStepRecords");
        this.token = token;
        this.exerciseSessionRecords = exerciseSessionRecords;
        this.activeCaloriesBurnedRecords = activeCaloriesBurnedRecords;
        this.sleepSessionRecords = sleepSessionRecords;
        this.respiratoryRateRecords = respiratoryRateRecords;
        this.restingHeartRateRecords = restingHeartRateRecords;
        this.oxygenSaturationRecords = oxygenSaturationRecords;
        this.heartRateRecords = heartRateRecords;
        this.stepRecords = stepRecords;
        this.deletedExerciseSessionRecords = deletedExerciseSessionRecords;
        this.deletedActiveCaloriesBurnedRecords = deletedActiveCaloriesBurnedRecords;
        this.deletedSleepSessionRecords = deletedSleepSessionRecords;
        this.deletedSleepStageRecords = deletedSleepStageRecords;
        this.deletedRespiratoryRateRecords = deletedRespiratoryRateRecords;
        this.deletedRestingHeartRateRecords = deletedRestingHeartRateRecords;
        this.deletedOxygenSaturationRecords = deletedOxygenSaturationRecords;
        this.deletedHeartRateRecords = deletedHeartRateRecords;
        this.deletedStepRecords = deletedStepRecords;
    }
}
