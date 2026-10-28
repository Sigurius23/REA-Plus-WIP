package com.whoop.data.remote.domain.dto;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 c2\u00020\u0001:\u0002dcB£\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aB·\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010%J\u0012\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b.\u0010*J\u0010\u0010/\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b1\u0010%J\u0010\u00102\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b2\u00100J\u0012\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b3\u0010%J\u0012\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b4\u0010%J\u0012\u00105\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b7\u00108JÌ\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b;\u0010%J\u0010\u0010<\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010?\u001a\u00020\t2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b?\u0010@J'\u0010I\u001a\u00020F2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0001¢\u0006\u0004\bG\u0010HR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010#\"\u0004\bL\u0010MR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010N\u001a\u0004\bO\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010N\u001a\u0004\bP\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bQ\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010N\u001a\u0004\bR\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010S\u001a\u0004\bT\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010U\u001a\u0004\bV\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010N\u001a\u0004\bW\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010S\u001a\u0004\bX\u0010*R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010Y\u001a\u0004\bZ\u00100R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010N\u001a\u0004\b[\u0010%R\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010Y\u001a\u0004\b\\\u00100R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010N\u001a\u0004\b]\u0010%R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010N\u001a\u0004\b^\u0010%R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010_\u001a\u0004\b`\u00106R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010a\u001a\u0004\bb\u00108¨\u0006e"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;", "", "", "id", "", "description", "title", "questionText", NotificationCompat.CATEGORY_STATUS, "", "sticky", "Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;", "magnitude", "category", "deprecated", "", "createdAt", "timeLabel", "updatedAt", "timeContextLabel", "questionType", "Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;", "weeklyPlanGoal", "Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;", "destination", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;", "toJournalBehaviorTracker", "()Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "()Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;", "component8", "component9", "component10", "()D", "component11", "component12", "component13", "component14", "component15", "()Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;", "component16", "()Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;)Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/Integer;", "getId", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "getDescription", "getTitle", "getQuestionText", "getStatus", "Ljava/lang/Boolean;", "getSticky", "Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;", "getMagnitude", "getCategory", "getDeprecated", "D", "getCreatedAt", "getTimeLabel", "getUpdatedAt", "getTimeContextLabel", "getQuestionType", "Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;", "getWeeklyPlanGoal", "Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;", "getDestination", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class JournalBehaviorTrackerDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("category")
    private final String category;

    @SerializedName("created_at")
    private final double createdAt;

    @SerializedName("deprecated")
    private final Boolean deprecated;

    @SerializedName("description")
    private final String description;

    @SerializedName("destination")
    private final BehaviorTrackerDestinationDto destination;

    @SerializedName("id")
    private Integer id;

    @SerializedName("magnitude")
    private final JournalMagnitudeDto magnitude;

    @SerializedName("question_text")
    private final String questionText;

    @SerializedName("question_type")
    private final String questionType;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    @SerializedName("sticky")
    private final Boolean sticky;

    @SerializedName("time_context_label")
    private final String timeContextLabel;

    @SerializedName("time_label")
    private final String timeLabel;

    @SerializedName("title")
    private final String title;

    @SerializedName("updated_at")
    private final double updatedAt;

    @SerializedName("weekly_plan_goal")
    private final WeeklyPlanGoalDto weeklyPlanGoal;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return JournalBehaviorTrackerDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ JournalBehaviorTrackerDto(int i13, Integer num, String str, String str2, String str3, String str4, Boolean bool, JournalMagnitudeDto journalMagnitudeDto, String str5, Boolean bool2, double d3, String str6, double d14, String str7, String str8, WeeklyPlanGoalDto weeklyPlanGoalDto, BehaviorTrackerDestinationDto behaviorTrackerDestinationDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (65535 != (i13 & 65535)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 65535, JournalBehaviorTrackerDto$$serializer.INSTANCE.getDescriptor());
        }
        this.id = num;
        this.description = str;
        this.title = str2;
        this.questionText = str3;
        this.status = str4;
        this.sticky = bool;
        this.magnitude = journalMagnitudeDto;
        this.category = str5;
        this.deprecated = bool2;
        this.createdAt = d3;
        this.timeLabel = str6;
        this.updatedAt = d14;
        this.timeContextLabel = str7;
        this.questionType = str8;
        this.weeklyPlanGoal = weeklyPlanGoalDto;
        this.destination = behaviorTrackerDestinationDto;
    }

    public static final /* synthetic */ void write$Self$core_release(JournalBehaviorTrackerDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.id);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.description);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.title);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.questionText);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.status);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 5, booleanSerializer, self.sticky);
        output.encodeNullableSerializableElement(serialDesc, 6, JournalMagnitudeDto$$serializer.INSTANCE, self.magnitude);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.category);
        output.encodeNullableSerializableElement(serialDesc, 8, booleanSerializer, self.deprecated);
        output.encodeDoubleElement(serialDesc, 9, self.createdAt);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.timeLabel);
        output.encodeDoubleElement(serialDesc, 11, self.updatedAt);
        output.encodeNullableSerializableElement(serialDesc, 12, stringSerializer, self.timeContextLabel);
        output.encodeNullableSerializableElement(serialDesc, 13, stringSerializer, self.questionType);
        output.encodeNullableSerializableElement(serialDesc, 14, WeeklyPlanGoalDto$$serializer.INSTANCE, self.weeklyPlanGoal);
        output.encodeNullableSerializableElement(serialDesc, 15, BehaviorTrackerDestinationDto$$serializer.INSTANCE, self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final double getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTimeLabel() {
        return this.timeLabel;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final double getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTimeContextLabel() {
        return this.timeContextLabel;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getQuestionType() {
        return this.questionType;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final WeeklyPlanGoalDto getWeeklyPlanGoal() {
        return this.weeklyPlanGoal;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BehaviorTrackerDestinationDto getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getQuestionText() {
        return this.questionText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getSticky() {
        return this.sticky;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final JournalMagnitudeDto getMagnitude() {
        return this.magnitude;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getDeprecated() {
        return this.deprecated;
    }

    public final JournalBehaviorTrackerDto copy(Integer id4, String description, String title, String questionText, String status, Boolean sticky, JournalMagnitudeDto magnitude, String category, Boolean deprecated, double createdAt, String timeLabel, double updatedAt, String timeContextLabel, String questionType, WeeklyPlanGoalDto weeklyPlanGoal, BehaviorTrackerDestinationDto destination) {
        return new JournalBehaviorTrackerDto(id4, description, title, questionText, status, sticky, magnitude, category, deprecated, createdAt, timeLabel, updatedAt, timeContextLabel, questionType, weeklyPlanGoal, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalBehaviorTrackerDto)) {
            return false;
        }
        JournalBehaviorTrackerDto journalBehaviorTrackerDto = (JournalBehaviorTrackerDto) other;
        return AbstractC22676k.m65745e(this.id, journalBehaviorTrackerDto.id) && AbstractC22676k.m65745e(this.description, journalBehaviorTrackerDto.description) && AbstractC22676k.m65745e(this.title, journalBehaviorTrackerDto.title) && AbstractC22676k.m65745e(this.questionText, journalBehaviorTrackerDto.questionText) && AbstractC22676k.m65745e(this.status, journalBehaviorTrackerDto.status) && AbstractC22676k.m65745e(this.sticky, journalBehaviorTrackerDto.sticky) && AbstractC22676k.m65745e(this.magnitude, journalBehaviorTrackerDto.magnitude) && AbstractC22676k.m65745e(this.category, journalBehaviorTrackerDto.category) && AbstractC22676k.m65745e(this.deprecated, journalBehaviorTrackerDto.deprecated) && Double.compare(this.createdAt, journalBehaviorTrackerDto.createdAt) == 0 && AbstractC22676k.m65745e(this.timeLabel, journalBehaviorTrackerDto.timeLabel) && Double.compare(this.updatedAt, journalBehaviorTrackerDto.updatedAt) == 0 && AbstractC22676k.m65745e(this.timeContextLabel, journalBehaviorTrackerDto.timeContextLabel) && AbstractC22676k.m65745e(this.questionType, journalBehaviorTrackerDto.questionType) && AbstractC22676k.m65745e(this.weeklyPlanGoal, journalBehaviorTrackerDto.weeklyPlanGoal) && AbstractC22676k.m65745e(this.destination, journalBehaviorTrackerDto.destination);
    }

    public final String getCategory() {
        return this.category;
    }

    public final double getCreatedAt() {
        return this.createdAt;
    }

    public final Boolean getDeprecated() {
        return this.deprecated;
    }

    public final String getDescription() {
        return this.description;
    }

    public final BehaviorTrackerDestinationDto getDestination() {
        return this.destination;
    }

    public final Integer getId() {
        return this.id;
    }

    public final JournalMagnitudeDto getMagnitude() {
        return this.magnitude;
    }

    public final String getQuestionText() {
        return this.questionText;
    }

    public final String getQuestionType() {
        return this.questionType;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Boolean getSticky() {
        return this.sticky;
    }

    public final String getTimeContextLabel() {
        return this.timeContextLabel;
    }

    public final String getTimeLabel() {
        return this.timeLabel;
    }

    public final String getTitle() {
        return this.title;
    }

    public final double getUpdatedAt() {
        return this.updatedAt;
    }

    public final WeeklyPlanGoalDto getWeeklyPlanGoal() {
        return this.weeklyPlanGoal;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.questionText;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.status;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.sticky;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        JournalMagnitudeDto journalMagnitudeDto = this.magnitude;
        int iHashCode7 = (iHashCode6 + (journalMagnitudeDto == null ? 0 : journalMagnitudeDto.hashCode())) * 31;
        String str5 = this.category;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.deprecated;
        int iM48499a = AbstractC17176i.m48499a((iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.createdAt);
        String str6 = this.timeLabel;
        int iM48499a2 = AbstractC17176i.m48499a((iM48499a + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.updatedAt);
        String str7 = this.timeContextLabel;
        int iHashCode9 = (iM48499a2 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.questionType;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        WeeklyPlanGoalDto weeklyPlanGoalDto = this.weeklyPlanGoal;
        int iHashCode11 = (iHashCode10 + (weeklyPlanGoalDto == null ? 0 : weeklyPlanGoalDto.hashCode())) * 31;
        BehaviorTrackerDestinationDto behaviorTrackerDestinationDto = this.destination;
        return iHashCode11 + (behaviorTrackerDestinationDto != null ? behaviorTrackerDestinationDto.hashCode() : 0);
    }

    public final void setId(Integer num) {
        this.id = num;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
          (r1v0 ?? I:??[OBJECT, ARRAY]) from 0x00a2: RETURN (r1v0 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final com.whoop.data.remote.domain.response.journal.JournalBehaviorTracker toJournalBehaviorTracker() {
        /*
            r21 = this;
            r0 = r21
            com.whoop.data.remote.domain.response.journal.JournalBehaviorTracker r1 = new com.whoop.data.remote.domain.response.journal.JournalBehaviorTracker
            java.lang.Integer r2 = r0.id
            r3 = 0
            if (r2 == 0) goto Lf
            int r2 = r2.intValue()
            r4 = r3
            goto L11
        Lf:
            r2 = r3
            r4 = r2
        L11:
            java.lang.String r3 = r0.description
            r5 = r4
            java.lang.String r4 = r0.questionText
            r6 = r5
            java.lang.String r5 = r0.title
            p715kotlin.jvm.internal.AbstractC22676k.m65747g(r5)
            java.lang.String r7 = r0.status
            if (r7 != 0) goto L22
            java.lang.String r7 = ""
        L22:
            java.lang.Boolean r8 = r0.sticky
            if (r8 == 0) goto L2b
            boolean r8 = r8.booleanValue()
            goto L2c
        L2b:
            r8 = r6
        L2c:
            com.whoop.data.remote.domain.dto.JournalMagnitudeDto r9 = r0.magnitude
            r10 = 0
            if (r9 == 0) goto L36
            com.whoop.data.remote.domain.response.journal.JournalMagnitude r9 = r9.toJournalMagnitude()
            goto L37
        L36:
            r9 = r10
        L37:
            java.lang.String r11 = r0.timeLabel
            java.lang.String r12 = r0.category
            p715kotlin.jvm.internal.AbstractC22676k.m65747g(r12)
            java.lang.CharSequence r12 = yb3.AbstractC39414r.m125869O0(r12)
            java.lang.String r12 = r12.toString()
            java.lang.Boolean r13 = r0.deprecated
            if (r13 == 0) goto L4e
            boolean r6 = r13.booleanValue()
        L4e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r14 = r10
            r10 = r12
            double r12 = r0.createdAt
            r16 = r14
            double r14 = r0.updatedAt
            r17 = r1
            java.lang.String r1 = r0.timeContextLabel
            r18 = r1
            java.lang.String r1 = r0.questionType
            com.whoop.data.remote.domain.dto.QuestionType r1 = com.whoop.data.remote.domain.dto.JournalResponseDtoKt.access$convertToQuestionTypeEnum(r1)
            r19 = r1
            com.whoop.data.remote.domain.dto.WeeklyPlanGoalDto r1 = r0.weeklyPlanGoal
            if (r1 == 0) goto L73
            com.whoop.data.remote.domain.response.journal.WeeklyPlanGoal r1 = r1.toWeeklyPlanGoal()
            r20 = r1
            goto L75
        L73:
            r20 = r16
        L75:
            com.whoop.data.remote.domain.dto.BehaviorTrackerDestinationDto r1 = r0.destination
            if (r1 == 0) goto L92
            com.whoop.data.remote.domain.response.journal.BehaviorTrackerDestination r1 = r1.toBehaviorTrackerDestination()
            r16 = r19
            r19 = r1
            r1 = r17
            r17 = r16
            r16 = r11
            r11 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r16
        L8d:
            r16 = r18
            r18 = r20
            goto L9f
        L92:
            r1 = r11
            r11 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r1
            r1 = r17
            r17 = r19
            r19 = r16
            goto L8d
        L9f:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.remote.domain.dto.JournalBehaviorTrackerDto.toJournalBehaviorTracker():com.whoop.data.remote.domain.response.journal.JournalBehaviorTracker");
    }

    public String toString() {
        Integer num = this.id;
        String str = this.description;
        String str2 = this.title;
        String str3 = this.questionText;
        String str4 = this.status;
        Boolean bool = this.sticky;
        JournalMagnitudeDto journalMagnitudeDto = this.magnitude;
        String str5 = this.category;
        Boolean bool2 = this.deprecated;
        double d3 = this.createdAt;
        String str6 = this.timeLabel;
        double d14 = this.updatedAt;
        String str7 = this.timeContextLabel;
        String str8 = this.questionType;
        WeeklyPlanGoalDto weeklyPlanGoalDto = this.weeklyPlanGoal;
        BehaviorTrackerDestinationDto behaviorTrackerDestinationDto = this.destination;
        StringBuilder sbM95643s = AbstractC31061c.m95643s("JournalBehaviorTrackerDto(id=", ", description=", num, str, ", title=");
        AbstractC11266d.m30444B(sbM95643s, str2, ", questionText=", str3, ", status=");
        AbstractC36095b.m114692t(bool, str4, ", sticky=", ", magnitude=", sbM95643s);
        sbM95643s.append(journalMagnitudeDto);
        sbM95643s.append(", category=");
        sbM95643s.append(str5);
        sbM95643s.append(", deprecated=");
        sbM95643s.append(bool2);
        sbM95643s.append(", createdAt=");
        sbM95643s.append(d3);
        sbM95643s.append(", timeLabel=");
        sbM95643s.append(str6);
        sbM95643s.append(", updatedAt=");
        sbM95643s.append(d14);
        sbM95643s.append(", timeContextLabel=");
        sbM95643s.append(str7);
        sbM95643s.append(", questionType=");
        sbM95643s.append(str8);
        sbM95643s.append(", weeklyPlanGoal=");
        sbM95643s.append(weeklyPlanGoalDto);
        sbM95643s.append(", destination=");
        sbM95643s.append(behaviorTrackerDestinationDto);
        sbM95643s.append(")");
        return sbM95643s.toString();
    }

    public JournalBehaviorTrackerDto(Integer num, String str, String str2, String str3, String str4, Boolean bool, JournalMagnitudeDto journalMagnitudeDto, String str5, Boolean bool2, double d3, String str6, double d14, String str7, String str8, WeeklyPlanGoalDto weeklyPlanGoalDto, BehaviorTrackerDestinationDto behaviorTrackerDestinationDto) {
        this.id = num;
        this.description = str;
        this.title = str2;
        this.questionText = str3;
        this.status = str4;
        this.sticky = bool;
        this.magnitude = journalMagnitudeDto;
        this.category = str5;
        this.deprecated = bool2;
        this.createdAt = d3;
        this.timeLabel = str6;
        this.updatedAt = d14;
        this.timeContextLabel = str7;
        this.questionType = str8;
        this.weeklyPlanGoal = weeklyPlanGoalDto;
        this.destination = behaviorTrackerDestinationDto;
    }
}
