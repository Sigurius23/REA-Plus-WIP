.class public final synthetic Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
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

.annotation runtime Ll83/c;
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse$$serializer;

    invoke-direct {v0}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.weeklyplan.hubandspoke.domain.api.HubAndSpokeResponse"

    const/16 v3, 0x12

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "planId"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "currentPlanTitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "navigationTitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "headerDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "headerImageUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "subtitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "startPlanButtonText"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "initialSelection"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "metricSection"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "behaviorSection"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "activitiesSection"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "metricDetails"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "metricScreen"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "goalScreens"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "endPlanButtonText"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "endPlanDialog"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "unsavedChangesDialog"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "metadata"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0x12

    new-array v1, v1, [Lwc3/c;

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v3, 0x1

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v3, 0x4

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v3, 0x7

    sget-object v4, Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection$$serializer;

    aput-object v4, v1, v3

    const/16 v3, 0x8

    sget-object v4, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSection$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSection$$serializer;

    aput-object v4, v1, v3

    const/16 v3, 0x9

    sget-object v4, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSection$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSection$$serializer;

    aput-object v4, v1, v3

    const/16 v3, 0xa

    sget-object v4, Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSection$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSection$$serializer;

    aput-object v4, v1, v3

    const/16 v3, 0xb

    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0xc

    sget-object v4, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen$$serializer;

    aput-object v4, v1, v3

    const/16 v3, 0xd

    aget-object v0, v0, v3

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v3

    const/16 v0, 0xe

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    aput-object v2, v1, v0

    sget-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/16 v3, 0xf

    aput-object v2, v1, v3

    const/16 v2, 0x10

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    aput-object v0, v1, v2

    sget-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaData$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaData$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v2, 0x11

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;
    .locals 55

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v9, 0x9

    const/4 v10, 0x7

    const/4 v11, 0x6

    const/4 v12, 0x5

    const/4 v13, 0x3

    const/16 v15, 0x8

    const/4 v4, 0x4

    const/4 v14, 0x2

    const/16 v19, 0xd

    const/4 v5, 0x1

    const/4 v7, 0x0

    const/16 v21, 0xb

    const/4 v6, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    sget-object v7, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v5, v7, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v13

    invoke-interface {v0, v1, v4, v7, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v11

    sget-object v8, Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection$$serializer;

    invoke-interface {v0, v1, v10, v8, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;

    sget-object v10, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSection$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSection$$serializer;

    invoke-interface {v0, v1, v15, v10, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSection;

    sget-object v15, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSection$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSection$$serializer;

    invoke-interface {v0, v1, v9, v15, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSection;

    sget-object v15, Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSection$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSection$$serializer;

    move-object/from16 v23, v2

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2, v15, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSection;

    aget-object v15, v23, v21

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v22, v2

    move/from16 v2, v21

    invoke-interface {v0, v1, v2, v15, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v15, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen$$serializer;

    move-object/from16 v21, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v15, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;

    aget-object v15, v23, v19

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v20, v2

    move/from16 v2, v19

    invoke-interface {v0, v1, v2, v15, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/16 v15, 0xe

    invoke-interface {v0, v1, v15, v7, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    sget-object v15, Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride$$serializer;

    move-object/from16 v18, v2

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;

    move-object/from16 v17, v2

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;

    sget-object v15, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaData$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaData$$serializer;

    move-object/from16 v16, v2

    const/16 v2, 0x11

    invoke-interface {v0, v1, v2, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaData;

    const v6, 0x3ffff

    move-object/from16 v53, v2

    move-object/from16 v36, v3

    move-object/from16 v40, v4

    move-object/from16 v37, v5

    move-object/from16 v50, v7

    move-object/from16 v43, v8

    move-object/from16 v45, v9

    move-object/from16 v44, v10

    move-object/from16 v42, v11

    move-object/from16 v41, v12

    move-object/from16 v39, v13

    move-object/from16 v38, v14

    move-object/from16 v52, v16

    move-object/from16 v51, v17

    move-object/from16 v49, v18

    move-object/from16 v48, v20

    move-object/from16 v47, v21

    move-object/from16 v46, v22

    :goto_0
    move/from16 v35, v6

    goto/16 :goto_6

    :cond_0
    move-object/from16 v23, v2

    move/from16 v31, v5

    move-object v2, v6

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v8, v5

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v24, v15

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v29, v26

    move-object/from16 v30, v29

    move v6, v7

    move-object/from16 v7, v30

    :goto_1
    if-eqz v31, :cond_1

    move-object/from16 v32, v3

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v3}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v3, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaData$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaData$$serializer;

    move-object/from16 v33, v7

    const/16 v7, 0x11

    invoke-interface {v0, v1, v7, v3, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaData;

    const/high16 v3, 0x20000

    :goto_2
    or-int/2addr v6, v3

    :goto_3
    move-object/from16 v3, v32

    move-object/from16 v7, v33

    goto :goto_1

    :pswitch_1
    move-object/from16 v33, v7

    const/16 v7, 0x11

    sget-object v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride$$serializer;

    const/16 v7, 0x10

    invoke-interface {v0, v1, v7, v3, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;

    const/high16 v3, 0x10000

    goto :goto_2

    :pswitch_2
    move-object/from16 v33, v7

    const/16 v7, 0x10

    sget-object v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride$$serializer;

    const/16 v7, 0xf

    invoke-interface {v0, v1, v7, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;

    const v3, 0x8000

    goto :goto_2

    :pswitch_3
    move-object/from16 v33, v7

    const/16 v7, 0xf

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v7, 0xe

    invoke-interface {v0, v1, v7, v3, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Ljava/lang/String;

    or-int/lit16 v6, v6, 0x4000

    goto :goto_3

    :pswitch_4
    move-object/from16 v33, v7

    const/16 v3, 0xd

    const/16 v7, 0xe

    aget-object v18, v23, v3

    invoke-interface/range {v18 .. v18}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v7, v18

    check-cast v7, Lwc3/b;

    invoke-interface {v0, v1, v3, v7, v10}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v10, v7

    check-cast v10, Ljava/util/List;

    or-int/lit16 v6, v6, 0x2000

    goto :goto_3

    :pswitch_5
    move-object/from16 v33, v7

    const/16 v3, 0xd

    sget-object v7, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen$$serializer;

    const/16 v3, 0xc

    invoke-interface {v0, v1, v3, v7, v11}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v11, v7

    check-cast v11, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;

    or-int/lit16 v6, v6, 0x1000

    goto :goto_3

    :pswitch_6
    move-object/from16 v33, v7

    const/16 v3, 0xc

    const/16 v7, 0xb

    aget-object v20, v23, v7

    invoke-interface/range {v20 .. v20}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v3, v20

    check-cast v3, Lwc3/b;

    invoke-interface {v0, v1, v7, v3, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Ljava/util/List;

    or-int/lit16 v6, v6, 0x800

    goto/16 :goto_3

    :pswitch_7
    move-object/from16 v33, v7

    const/16 v7, 0xb

    sget-object v3, Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSection$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSection$$serializer;

    const/16 v7, 0xa

    invoke-interface {v0, v1, v7, v3, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSection;

    or-int/lit16 v6, v6, 0x400

    goto/16 :goto_3

    :pswitch_8
    move-object/from16 v33, v7

    const/16 v7, 0xa

    sget-object v3, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSection$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSection$$serializer;

    const/16 v7, 0x9

    invoke-interface {v0, v1, v7, v3, v13}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSection;

    or-int/lit16 v6, v6, 0x200

    goto/16 :goto_3

    :pswitch_9
    move-object/from16 v33, v7

    const/16 v7, 0x9

    sget-object v3, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSection$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSection$$serializer;

    const/16 v7, 0x8

    invoke-interface {v0, v1, v7, v3, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSection;

    or-int/lit16 v6, v6, 0x100

    goto/16 :goto_3

    :pswitch_a
    move-object/from16 v33, v7

    const/16 v7, 0x8

    sget-object v3, Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection$$serializer;

    const/4 v7, 0x7

    invoke-interface {v0, v1, v7, v3, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;

    or-int/lit16 v6, v6, 0x80

    goto/16 :goto_3

    :pswitch_b
    move-object/from16 v33, v7

    const/4 v3, 0x6

    const/4 v7, 0x7

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v26

    or-int/lit8 v6, v6, 0x40

    goto/16 :goto_3

    :pswitch_c
    move-object/from16 v33, v7

    const/4 v3, 0x5

    const/4 v7, 0x7

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v25

    or-int/lit8 v6, v6, 0x20

    goto/16 :goto_3

    :pswitch_d
    move-object/from16 v33, v7

    const/4 v7, 0x7

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v28, v2

    move-object/from16 v7, v33

    const/4 v2, 0x4

    invoke-interface {v0, v1, v2, v3, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ljava/lang/String;

    or-int/lit8 v6, v6, 0x10

    :goto_4
    move-object/from16 v2, v28

    move-object/from16 v3, v32

    goto/16 :goto_1

    :pswitch_e
    move-object/from16 v28, v2

    const/4 v2, 0x4

    const/4 v3, 0x3

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v24

    or-int/lit8 v6, v6, 0x8

    goto :goto_4

    :pswitch_f
    move-object/from16 v28, v2

    const/4 v2, 0x2

    const/4 v3, 0x3

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v30

    or-int/lit8 v6, v6, 0x4

    goto :goto_4

    :pswitch_10
    move-object/from16 v28, v2

    const/4 v3, 0x3

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v27, v4

    move-object/from16 v3, v32

    const/4 v4, 0x1

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    or-int/lit8 v6, v6, 0x2

    :goto_5
    move-object/from16 v4, v27

    move-object/from16 v2, v28

    goto/16 :goto_1

    :pswitch_11
    move-object/from16 v28, v2

    move-object/from16 v27, v4

    move-object/from16 v3, v32

    const/4 v2, 0x0

    const/4 v4, 0x1

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v29

    or-int/lit8 v6, v6, 0x1

    goto :goto_5

    :pswitch_12
    move-object/from16 v28, v2

    move-object/from16 v27, v4

    move-object/from16 v3, v32

    const/4 v2, 0x0

    const/4 v4, 0x1

    move/from16 v31, v2

    goto :goto_5

    :cond_1
    move-object/from16 v28, v2

    move-object/from16 v27, v4

    move-object/from16 v37, v3

    move-object/from16 v43, v5

    move-object/from16 v40, v7

    move-object/from16 v53, v8

    move-object/from16 v51, v9

    move-object/from16 v49, v10

    move-object/from16 v48, v11

    move-object/from16 v47, v12

    move-object/from16 v45, v13

    move-object/from16 v44, v14

    move-object/from16 v50, v15

    move-object/from16 v39, v24

    move-object/from16 v41, v25

    move-object/from16 v42, v26

    move-object/from16 v46, v27

    move-object/from16 v52, v28

    move-object/from16 v36, v29

    move-object/from16 v38, v30

    goto/16 :goto_0

    :goto_6
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v34, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    const/16 v54, 0x0

    invoke-direct/range {v34 .. v54}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSection;Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSection;Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSection;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v34

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->write$Self$weekly_plan_release(Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse$$serializer;->serialize(Lzc3/e;Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;)V

    return-void
.end method

.method public bridge typeParametersSerializers()[Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-super {p0}, Lkotlinx/serialization/internal/GeneratedSerializer;->typeParametersSerializers()[Lwc3/c;

    move-result-object v0

    return-object v0
.end method
