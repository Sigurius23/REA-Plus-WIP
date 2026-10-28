package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
import com.whoop.data.remote.domain.dto.JournalMagnitudeDto;
import com.whoop.data.remote.domain.dto.JournalMagnitudeDto$$serializer;
import com.whoop.data.remote.domain.dto.WeeklyPlanGoalDto;
import com.whoop.data.remote.domain.dto.WeeklyPlanGoalDto$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import w91.C36954a;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0002`_B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aBµ\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010\"J\u0012\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b,\u0010(J\u0010\u0010-\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b/\u0010.J\u0012\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b0\u0010\"J\u0012\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b1\u0010\"J\u0012\u00102\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b4\u00105JÊ\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b8\u0010\"J\u0010\u00109\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010 J\u001a\u0010;\u001a\u00020\n2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<J'\u0010E\u001a\u00020B2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0001¢\u0006\u0004\bC\u0010DR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010 \"\u0004\bH\u0010IR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010J\u001a\u0004\bK\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010J\u001a\u0004\bL\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010J\u001a\u0004\bM\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010J\u001a\u0004\bN\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010J\u001a\u0004\bO\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010P\u001a\u0004\bQ\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010R\u001a\u0004\bS\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bT\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010P\u001a\u0004\bU\u0010(R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010V\u001a\u0004\bW\u0010.R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010V\u001a\u0004\bX\u0010.R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010J\u001a\u0004\bY\u0010\"R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010J\u001a\u0004\bZ\u0010\"R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010[\u001a\u0004\b\\\u00103R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010]\u001a\u0004\b^\u00105¨\u0006a"}, m65681d2 = {"Lcom/whoop/design/models/items/BehaviorTrackerModel;", "", "", "id", "", "questionType", "title", "questionText", "description", NotificationCompat.CATEGORY_STATUS, "", "sticky", "Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;", "magnitude", "category", "deprecated", "", "createdAt", "updatedAt", "timeLabel", "timeContextLabel", "Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;", "weeklyPlanGoal", "Lcom/whoop/navigation/e;", "destination", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/navigation/e;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "()Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;", "component9", "component10", "component11", "()D", "component12", "component13", "component14", "component15", "()Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;", "component16", "()Lcom/whoop/navigation/e;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/BehaviorTrackerModel;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/BehaviorTrackerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "I", "getId", "setId", "(I)V", "Ljava/lang/String;", "getQuestionType", "getTitle", "getQuestionText", "getDescription", "getStatus", "Ljava/lang/Boolean;", "getSticky", "Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;", "getMagnitude", "getCategory", "getDeprecated", "D", "getCreatedAt", "getUpdatedAt", "getTimeLabel", "getTimeContextLabel", "Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;", "getWeeklyPlanGoal", "Lcom/whoop/navigation/e;", "getDestination", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BehaviorTrackerModel {
    private final String category;
    private final double createdAt;
    private final Boolean deprecated;
    private final String description;
    private final C9598e destination;
    private int id;
    private final JournalMagnitudeDto magnitude;
    private final String questionText;
    private final String questionType;
    private final String status;
    private final Boolean sticky;
    private final String timeContextLabel;
    private final String timeLabel;
    private final String title;
    private final double updatedAt;
    private final WeeklyPlanGoalDto weeklyPlanGoal;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36954a(10))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/BehaviorTrackerModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/BehaviorTrackerModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BehaviorTrackerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BehaviorTrackerModel(int i13, int i14, String str, String str2, String str3, String str4, String str5, Boolean bool, JournalMagnitudeDto journalMagnitudeDto, String str6, Boolean bool2, double d3, double d14, String str7, String str8, WeeklyPlanGoalDto weeklyPlanGoalDto, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (65535 != (i13 & 65535)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 65535, BehaviorTrackerModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i14;
        this.questionType = str;
        this.title = str2;
        this.questionText = str3;
        this.description = str4;
        this.status = str5;
        this.sticky = bool;
        this.magnitude = journalMagnitudeDto;
        this.category = str6;
        this.deprecated = bool2;
        this.createdAt = d3;
        this.updatedAt = d14;
        this.timeLabel = str7;
        this.timeContextLabel = str8;
        this.weeklyPlanGoal = weeklyPlanGoalDto;
        this.destination = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BehaviorTrackerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.id);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.questionType);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.title);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.questionText);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.description);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.status);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 6, booleanSerializer, self.sticky);
        output.encodeNullableSerializableElement(serialDesc, 7, JournalMagnitudeDto$$serializer.INSTANCE, self.magnitude);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.category);
        output.encodeNullableSerializableElement(serialDesc, 9, booleanSerializer, self.deprecated);
        output.encodeDoubleElement(serialDesc, 10, self.createdAt);
        output.encodeDoubleElement(serialDesc, 11, self.updatedAt);
        output.encodeNullableSerializableElement(serialDesc, 12, stringSerializer, self.timeLabel);
        output.encodeNullableSerializableElement(serialDesc, 13, stringSerializer, self.timeContextLabel);
        output.encodeNullableSerializableElement(serialDesc, 14, WeeklyPlanGoalDto$$serializer.INSTANCE, self.weeklyPlanGoal);
        output.encodeNullableSerializableElement(serialDesc, 15, (InterfaceC37145j) interfaceC23462hArr[15].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getDeprecated() {
        return this.deprecated;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final double getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final double getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTimeLabel() {
        return this.timeLabel;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTimeContextLabel() {
        return this.timeContextLabel;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final WeeklyPlanGoalDto getWeeklyPlanGoal() {
        return this.weeklyPlanGoal;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQuestionType() {
        return this.questionType;
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
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getSticky() {
        return this.sticky;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final JournalMagnitudeDto getMagnitude() {
        return this.magnitude;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    public final BehaviorTrackerModel copy(int id4, String questionType, String title, String questionText, String description, String status, Boolean sticky, JournalMagnitudeDto magnitude, String category, Boolean deprecated, double createdAt, double updatedAt, String timeLabel, String timeContextLabel, WeeklyPlanGoalDto weeklyPlanGoal, C9598e destination) {
        return new BehaviorTrackerModel(id4, questionType, title, questionText, description, status, sticky, magnitude, category, deprecated, createdAt, updatedAt, timeLabel, timeContextLabel, weeklyPlanGoal, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BehaviorTrackerModel)) {
            return false;
        }
        BehaviorTrackerModel behaviorTrackerModel = (BehaviorTrackerModel) other;
        return this.id == behaviorTrackerModel.id && AbstractC22676k.m65745e(this.questionType, behaviorTrackerModel.questionType) && AbstractC22676k.m65745e(this.title, behaviorTrackerModel.title) && AbstractC22676k.m65745e(this.questionText, behaviorTrackerModel.questionText) && AbstractC22676k.m65745e(this.description, behaviorTrackerModel.description) && AbstractC22676k.m65745e(this.status, behaviorTrackerModel.status) && AbstractC22676k.m65745e(this.sticky, behaviorTrackerModel.sticky) && AbstractC22676k.m65745e(this.magnitude, behaviorTrackerModel.magnitude) && AbstractC22676k.m65745e(this.category, behaviorTrackerModel.category) && AbstractC22676k.m65745e(this.deprecated, behaviorTrackerModel.deprecated) && Double.compare(this.createdAt, behaviorTrackerModel.createdAt) == 0 && Double.compare(this.updatedAt, behaviorTrackerModel.updatedAt) == 0 && AbstractC22676k.m65745e(this.timeLabel, behaviorTrackerModel.timeLabel) && AbstractC22676k.m65745e(this.timeContextLabel, behaviorTrackerModel.timeContextLabel) && AbstractC22676k.m65745e(this.weeklyPlanGoal, behaviorTrackerModel.weeklyPlanGoal) && AbstractC22676k.m65745e(this.destination, behaviorTrackerModel.destination);
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

    public final C9598e getDestination() {
        return this.destination;
    }

    public final int getId() {
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
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.questionType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.questionText;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.status;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.sticky;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        JournalMagnitudeDto journalMagnitudeDto = this.magnitude;
        int iHashCode8 = (iHashCode7 + (journalMagnitudeDto == null ? 0 : journalMagnitudeDto.hashCode())) * 31;
        String str6 = this.category;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool2 = this.deprecated;
        int iM48499a = AbstractC17176i.m48499a(AbstractC17176i.m48499a((iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.createdAt), 31, this.updatedAt);
        String str7 = this.timeLabel;
        int iHashCode10 = (iM48499a + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.timeContextLabel;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        WeeklyPlanGoalDto weeklyPlanGoalDto = this.weeklyPlanGoal;
        int iHashCode12 = (iHashCode11 + (weeklyPlanGoalDto == null ? 0 : weeklyPlanGoalDto.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode12 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public final void setId(int i13) {
        this.id = i13;
    }

    public String toString() {
        int i13 = this.id;
        String str = this.questionType;
        String str2 = this.title;
        String str3 = this.questionText;
        String str4 = this.description;
        String str5 = this.status;
        Boolean bool = this.sticky;
        JournalMagnitudeDto journalMagnitudeDto = this.magnitude;
        String str6 = this.category;
        Boolean bool2 = this.deprecated;
        double d3 = this.createdAt;
        double d14 = this.updatedAt;
        String str7 = this.timeLabel;
        String str8 = this.timeContextLabel;
        WeeklyPlanGoalDto weeklyPlanGoalDto = this.weeklyPlanGoal;
        C9598e c9598e = this.destination;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "BehaviorTrackerModel(id=", ", questionType=", str, ", title=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", questionText=", str3, ", description=");
        AbstractC11266d.m30444B(sbM53373n, str4, ", status=", str5, ", sticky=");
        sbM53373n.append(bool);
        sbM53373n.append(", magnitude=");
        sbM53373n.append(journalMagnitudeDto);
        sbM53373n.append(", category=");
        AbstractC36095b.m114692t(bool2, str6, ", deprecated=", ", createdAt=", sbM53373n);
        sbM53373n.append(d3);
        AbstractC31061c.m95622B(sbM53373n, ", updatedAt=", d14, ", timeLabel=");
        AbstractC11266d.m30444B(sbM53373n, str7, ", timeContextLabel=", str8, ", weeklyPlanGoal=");
        sbM53373n.append(weeklyPlanGoalDto);
        sbM53373n.append(", destination=");
        sbM53373n.append(c9598e);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    public BehaviorTrackerModel(int i13, String str, String str2, String str3, String str4, String str5, Boolean bool, JournalMagnitudeDto journalMagnitudeDto, String str6, Boolean bool2, double d3, double d14, String str7, String str8, WeeklyPlanGoalDto weeklyPlanGoalDto, C9598e c9598e) {
        this.id = i13;
        this.questionType = str;
        this.title = str2;
        this.questionText = str3;
        this.description = str4;
        this.status = str5;
        this.sticky = bool;
        this.magnitude = journalMagnitudeDto;
        this.category = str6;
        this.deprecated = bool2;
        this.createdAt = d3;
        this.updatedAt = d14;
        this.timeLabel = str7;
        this.timeContextLabel = str8;
        this.weeklyPlanGoal = weeklyPlanGoalDto;
        this.destination = c9598e;
    }
}
