.class public final Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx$$serializer;,
        Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008#\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008!\u0008\u0087\u0008\u0018\u0000 n2\u00020\u0001:\u0002onB\u00b1\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0012\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 B\u00db\u0001\u0008\u0010\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0008\u0010$\u001a\u0004\u0018\u00010#\u00a2\u0006\u0004\u0008\u001f\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\'J\u0010\u0010)\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010\'J\u0010\u0010*\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010\'J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010\'J\u0010\u0010,\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010\'J\u0010\u0010-\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010\'J\u0010\u0010.\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u0010\u00102\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u00082\u00103J\u0010\u00104\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u00084\u00105J\u0016\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003\u00a2\u0006\u0004\u00086\u00107J\u0010\u00108\u001a\u00020\u0015H\u00c6\u0003\u00a2\u0006\u0004\u00088\u00109J\u0016\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u00107J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008;\u0010\'J\u0012\u0010<\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0004\u0008<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0004\u0008>\u0010=J\u0012\u0010?\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003\u00a2\u0006\u0004\u0008?\u0010@J\u00dc\u0001\u0010A\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00152\u000e\u0008\u0002\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00122\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u00c6\u0001\u00a2\u0006\u0004\u0008A\u0010BJ\u0010\u0010C\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008C\u0010\'J\u0010\u0010D\u001a\u00020!H\u00d6\u0001\u00a2\u0006\u0004\u0008D\u0010EJ\u001a\u0010H\u001a\u00020G2\u0008\u0010F\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008H\u0010IJ\'\u0010R\u001a\u00020O2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0001\u00a2\u0006\u0004\u0008P\u0010QR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010S\u001a\u0004\u0008T\u0010\'R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010S\u001a\u0004\u0008U\u0010\'R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010S\u001a\u0004\u0008V\u0010\'R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010S\u001a\u0004\u0008W\u0010\'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010S\u001a\u0004\u0008X\u0010\'R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010S\u001a\u0004\u0008Y\u0010\'R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010S\u001a\u0004\u0008Z\u0010\'R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010[\u001a\u0004\u0008\\\u0010/R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010]\u001a\u0004\u0008^\u00101R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010_\u001a\u0004\u0008`\u00103R\u0017\u0010\u0011\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010a\u001a\u0004\u0008b\u00105R\u001d\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010c\u001a\u0004\u0008d\u00107R\u0017\u0010\u0016\u001a\u00020\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010e\u001a\u0004\u0008f\u00109R\u001d\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010c\u001a\u0004\u0008g\u00107R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010S\u001a\u0004\u0008h\u0010\'R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010i\u001a\u0004\u0008j\u0010=R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010i\u001a\u0004\u0008k\u0010=R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010l\u001a\u0004\u0008m\u0010@\u00a8\u0006p"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;",
        "",
        "",
        "planId",
        "currentPlanTitle",
        "navigationTitle",
        "headerDisplay",
        "headerImageUrl",
        "subtitle",
        "startPlanButtonText",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;",
        "initialSelection",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;",
        "metricSection",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;",
        "behaviorSection",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;",
        "activitiesSection",
        "",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;",
        "metricDetails",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;",
        "metricScreen",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;",
        "goalScreens",
        "endPlanButtonText",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;",
        "endPlanDialog",
        "unsavedChangesDialog",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;",
        "metadata",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;",
        "component9",
        "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;",
        "component10",
        "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;",
        "component11",
        "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;",
        "component12",
        "()Ljava/util/List;",
        "component13",
        "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;",
        "component14",
        "component15",
        "component16",
        "()Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;",
        "component17",
        "component18",
        "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weekly_plan_release",
        "(Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getPlanId",
        "getCurrentPlanTitle",
        "getNavigationTitle",
        "getHeaderDisplay",
        "getHeaderImageUrl",
        "getSubtitle",
        "getStartPlanButtonText",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;",
        "getInitialSelection",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;",
        "getMetricSection",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;",
        "getBehaviorSection",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;",
        "getActivitiesSection",
        "Ljava/util/List;",
        "getMetricDetails",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;",
        "getMetricScreen",
        "getGoalScreens",
        "getEndPlanButtonText",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;",
        "getEndPlanDialog",
        "getUnsavedChangesDialog",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;",
        "getMetadata",
        "Companion",
        "$serializer",
        "weekly-plan_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx$Companion;


# instance fields
.field private final activitiesSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;

.field private final behaviorSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;

.field private final currentPlanTitle:Ljava/lang/String;

.field private final endPlanButtonText:Ljava/lang/String;

.field private final endPlanDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

.field private final goalScreens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;",
            ">;"
        }
    .end annotation
.end field

.field private final headerDisplay:Ljava/lang/String;

.field private final headerImageUrl:Ljava/lang/String;

.field private final initialSelection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;

.field private final metadata:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;

.field private final metricDetails:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;",
            ">;"
        }
    .end annotation
.end field

.field private final metricScreen:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;

.field private final metricSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;

.field private final navigationTitle:Ljava/lang/String;

.field private final planId:Ljava/lang/String;

.field private final startPlanButtonText:Ljava/lang/String;

.field private final subtitle:Ljava/lang/String;

.field private final unsavedChangesDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->Companion:Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lkg2/d;

    const/16 v4, 0x1c

    invoke-direct {v3, v4}, Lkg2/d;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lkg2/d;

    const/16 v5, 0x1d

    invoke-direct {v4, v5}, Lkg2/d;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v4, 0x12

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v5, 0x2

    aput-object v1, v4, v5

    const/4 v5, 0x3

    aput-object v1, v4, v5

    const/4 v5, 0x4

    aput-object v1, v4, v5

    const/4 v5, 0x5

    aput-object v1, v4, v5

    const/4 v5, 0x6

    aput-object v1, v4, v5

    const/4 v5, 0x7

    aput-object v1, v4, v5

    aput-object v1, v4, v0

    const/16 v0, 0x9

    aput-object v1, v4, v0

    const/16 v0, 0xa

    aput-object v1, v4, v0

    const/16 v0, 0xb

    aput-object v3, v4, v0

    const/16 v0, 0xc

    aput-object v1, v4, v0

    const/16 v0, 0xd

    aput-object v2, v4, v0

    const/16 v0, 0xe

    aput-object v1, v4, v0

    const/16 v0, 0xf

    aput-object v1, v4, v0

    const/16 v0, 0x10

    aput-object v1, v4, v0

    const/16 v0, 0x11

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0x1ffff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx$$serializer;

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->planId:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->currentPlanTitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->navigationTitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->headerDisplay:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->headerImageUrl:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->subtitle:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->startPlanButtonText:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->initialSelection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;

    iput-object p10, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;

    iput-object p11, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->behaviorSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;

    iput-object p12, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->activitiesSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;

    iput-object p13, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricDetails:Ljava/util/List;

    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricScreen:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;

    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->goalScreens:Ljava/util/List;

    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->endPlanButtonText:Ljava/lang/String;

    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->endPlanDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    move-object/from16 p2, p18

    iput-object p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->unsavedChangesDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    const/high16 p2, 0x20000

    and-int/2addr p1, p2

    if-nez p1, :cond_1

    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metadata:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;

    return-void

    :cond_1
    move-object/from16 p1, p19

    goto :goto_0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;",
            ">;",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;",
            ")V"
        }
    .end annotation

    move-object v0, p4

    move-object/from16 v1, p6

    move-object/from16 v2, p7

    move-object/from16 v3, p8

    move-object/from16 v4, p9

    move-object/from16 v5, p10

    move-object/from16 v6, p11

    move-object/from16 v7, p12

    move-object/from16 v8, p13

    move-object/from16 v9, p14

    const-string v10, "planId"

    invoke-static {p1, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "navigationTitle"

    invoke-static {p3, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "headerDisplay"

    invoke-static {p4, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "subtitle"

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "startPlanButtonText"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "initialSelection"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "metricSection"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "behaviorSection"

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "activitiesSection"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "metricDetails"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "metricScreen"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "goalScreens"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->planId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->currentPlanTitle:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->navigationTitle:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->headerDisplay:Ljava/lang/String;

    move-object/from16 p1, p5

    .line 7
    iput-object p1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->headerImageUrl:Ljava/lang/String;

    .line 8
    iput-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->subtitle:Ljava/lang/String;

    .line 9
    iput-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->startPlanButtonText:Ljava/lang/String;

    .line 10
    iput-object v3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->initialSelection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;

    .line 11
    iput-object v4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;

    .line 12
    iput-object v5, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->behaviorSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;

    .line 13
    iput-object v6, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->activitiesSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;

    .line 14
    iput-object v7, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricDetails:Ljava/util/List;

    .line 15
    iput-object v8, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricScreen:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;

    .line 16
    iput-object v9, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->goalScreens:Ljava/util/List;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->endPlanButtonText:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->endPlanDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->unsavedChangesDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metadata:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    const/high16 v0, 0x20000

    and-int v0, p19, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object/from16 v19, v0

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    goto :goto_1

    :cond_0
    move-object/from16 v19, p18

    goto :goto_0

    .line 21
    :goto_1
    invoke-direct/range {v1 .. v19}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;ILjava/lang/Object;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->planId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->currentPlanTitle:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->navigationTitle:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->headerDisplay:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->headerImageUrl:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->subtitle:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->startPlanButtonText:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->initialSelection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->behaviorSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->activitiesSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricDetails:Ljava/util/List;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricScreen:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->goalScreens:Ljava/util/List;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->endPlanButtonText:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->endPlanDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p19, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->unsavedChangesDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p19, v16

    if-eqz v16, :cond_11

    move-object/from16 p3, v1

    iget-object v1, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metadata:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;

    move-object/from16 p18, p3

    move-object/from16 p19, v1

    :goto_11
    move-object/from16 p17, p2

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_12

    :cond_11
    move-object/from16 p19, p18

    move-object/from16 p18, v1

    goto :goto_11

    :goto_12
    invoke-virtual/range {p1 .. p19}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$weekly_plan_release(Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->planId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->currentPlanTitle:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->navigationTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->headerDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->headerImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->startPlanButtonText:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v2, Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx$$serializer;

    iget-object v3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->initialSelection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;

    const/4 v4, 0x7

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx$$serializer;

    iget-object v3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;

    const/16 v4, 0x8

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx$$serializer;

    iget-object v3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->behaviorSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;

    const/16 v4, 0x9

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx$$serializer;

    iget-object v3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->activitiesSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;

    const/16 v4, 0xa

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xb

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricDetails:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx$$serializer;

    iget-object v3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricScreen:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;

    const/16 v4, 0xc

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xd

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->goalScreens:Ljava/util/List;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xe

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->endPlanButtonText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2$$serializer;

    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->endPlanDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    const/16 v2, 0xf

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x10

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->unsavedChangesDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x11

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metadata:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx$$serializer;

    iget-object p0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metadata:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->planId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->behaviorSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;

    return-object v0
.end method

.method public final component11()Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->activitiesSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;

    return-object v0
.end method

.method public final component12()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricDetails:Ljava/util/List;

    return-object v0
.end method

.method public final component13()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricScreen:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;

    return-object v0
.end method

.method public final component14()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->goalScreens:Ljava/util/List;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->endPlanButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->endPlanDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    return-object v0
.end method

.method public final component17()Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->unsavedChangesDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    return-object v0
.end method

.method public final component18()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metadata:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->currentPlanTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->headerDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->headerImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->startPlanButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->initialSelection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;

    return-object v0
.end method

.method public final component9()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;",
            ">;",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;",
            ")",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;"
        }
    .end annotation

    const-string v0, "planId"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationTitle"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerDisplay"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startPlanButtonText"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialSelection"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricSection"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "behaviorSection"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activitiesSection"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricDetails"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricScreen"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalScreens"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    invoke-direct/range {v1 .. v19}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;

    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->planId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->planId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->currentPlanTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->currentPlanTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->navigationTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->navigationTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->headerDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->headerDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->headerImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->headerImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->startPlanButtonText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->startPlanButtonText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->initialSelection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->initialSelection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->behaviorSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->behaviorSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->activitiesSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->activitiesSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricDetails:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricDetails:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricScreen:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricScreen:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->goalScreens:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->goalScreens:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->endPlanButtonText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->endPlanButtonText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->endPlanDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->endPlanDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->unsavedChangesDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->unsavedChangesDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metadata:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;

    iget-object p1, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metadata:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final getActivitiesSection()Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->activitiesSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;

    return-object v0
.end method

.method public final getBehaviorSection()Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->behaviorSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;

    return-object v0
.end method

.method public final getCurrentPlanTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->currentPlanTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getEndPlanButtonText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->endPlanButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final getEndPlanDialog()Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->endPlanDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    return-object v0
.end method

.method public final getGoalScreens()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->goalScreens:Ljava/util/List;

    return-object v0
.end method

.method public final getHeaderDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->headerDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeaderImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->headerImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getInitialSelection()Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->initialSelection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;

    return-object v0
.end method

.method public final getMetadata()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metadata:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;

    return-object v0
.end method

.method public final getMetricDetails()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricDetails:Ljava/util/List;

    return-object v0
.end method

.method public final getMetricScreen()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricScreen:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;

    return-object v0
.end method

.method public final getMetricSection()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;

    return-object v0
.end method

.method public final getNavigationTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getPlanId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->planId:Ljava/lang/String;

    return-object v0
.end method

.method public final getStartPlanButtonText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->startPlanButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnsavedChangesDialog()Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->unsavedChangesDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->planId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->currentPlanTitle:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->navigationTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->headerDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->headerImageUrl:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->startPlanButtonText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->initialSelection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->behaviorSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->activitiesSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricDetails:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricScreen:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->goalScreens:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->endPlanButtonText:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->endPlanDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->unsavedChangesDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metadata:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->planId:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->currentPlanTitle:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->navigationTitle:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->headerDisplay:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->headerImageUrl:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->subtitle:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->startPlanButtonText:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->initialSelection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;

    iget-object v9, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;

    iget-object v10, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->behaviorSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;

    iget-object v11, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->activitiesSection:Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;

    iget-object v12, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricDetails:Ljava/util/List;

    iget-object v13, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metricScreen:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;

    iget-object v14, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->goalScreens:Ljava/util/List;

    iget-object v15, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->endPlanButtonText:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->endPlanDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->unsavedChangesDialog:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->metadata:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;

    const-string v0, ", currentPlanTitle="

    move-object/from16 v19, v15

    const-string v15, ", navigationTitle="

    move-object/from16 v20, v14

    const-string v14, "HubAndSpokeResponseKotlinx(planId="

    invoke-static {v14, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", headerDisplay="

    const-string v2, ", headerImageUrl="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", subtitle="

    const-string v2, ", startPlanButtonText="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", initialSelection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", metricSection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", behaviorSection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", activitiesSection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", metricDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", metricScreen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", goalScreens="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", endPlanButtonText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", endPlanDialog="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", unsavedChangesDialog="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", metadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
