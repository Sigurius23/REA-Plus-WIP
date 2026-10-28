.class public final synthetic Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/healthconnect/domain/models/HealthConnectEventsResponse.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "health-connect_release"
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

.field public static final INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$$serializer;

    invoke-direct {v0}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.healthconnect.domain.models.HealthConnectEventsResponse"

    const/16 v3, 0x12

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "token"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "exerciseSessionRecords"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "activeCaloriesBurnedRecords"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sleepSessionRecords"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "respiratoryRateRecords"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "restingHeartRateRecords"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "oxygenSaturationRecords"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "heartRateRecords"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "stepRecords"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "deletedExerciseSessionRecords"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "deletedActiveCaloriesBurnedRecords"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "deletedSleepSessionRecords"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "deletedSleepStageRecords"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "deletedRespiratoryRateRecords"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "deletedRestingHeartRateRecords"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "deletedOxygenSaturationRecords"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "deletedHeartRateRecords"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "deletedStepRecords"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0x12

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x4

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x5

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x6

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x7

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0x8

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0x9

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0xa

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0xb

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0xc

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0xd

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0xe

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0xf

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0x10

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0x11

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;
    .locals 62

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v10, 0xa

    const/16 v11, 0x9

    const/4 v12, 0x7

    const/4 v13, 0x6

    const/4 v14, 0x5

    const/4 v15, 0x3

    const/16 p1, 0x11

    const/16 v16, 0x10

    const/16 v4, 0x8

    const/16 v17, 0xf

    const/4 v5, 0x4

    const/16 v18, 0xe

    const/4 v6, 0x2

    const/16 v19, 0xd

    const/4 v7, 0x1

    const/16 v20, 0xc

    const/4 v8, 0x0

    const/16 v21, 0xb

    const/4 v9, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    aget-object v8, v2, v7

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/b;

    invoke-interface {v0, v1, v7, v8, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    aget-object v8, v2, v6

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/b;

    invoke-interface {v0, v1, v6, v8, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    aget-object v8, v2, v15

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/b;

    invoke-interface {v0, v1, v15, v8, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    aget-object v15, v2, v5

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v5, v15, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    aget-object v15, v2, v14

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v14, v15, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/List;

    aget-object v15, v2, v13

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v13, v15, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/List;

    aget-object v15, v2, v12

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v12, v15, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    aget-object v15, v2, v4

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v4, v15, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    aget-object v15, v2, v11

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v11, v15, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    aget-object v15, v2, v10

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v10, v15, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    aget-object v15, v2, v21

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v22, v2

    move/from16 v2, v21

    invoke-interface {v0, v1, v2, v15, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    aget-object v15, v22, v20

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v21, v2

    move/from16 v2, v20

    invoke-interface {v0, v1, v2, v15, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    aget-object v15, v22, v19

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v20, v2

    move/from16 v2, v19

    invoke-interface {v0, v1, v2, v15, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    aget-object v15, v22, v18

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v19, v2

    move/from16 v2, v18

    invoke-interface {v0, v1, v2, v15, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    aget-object v15, v22, v17

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v18, v2

    move/from16 v2, v17

    invoke-interface {v0, v1, v2, v15, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    aget-object v15, v22, v16

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v17, v2

    move/from16 v2, v16

    invoke-interface {v0, v1, v2, v15, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    aget-object v15, v22, p1

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v16, v8

    move/from16 v8, p1

    invoke-interface {v0, v1, v8, v15, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    const v9, 0x3ffff

    move-object/from16 v59, v2

    move-object/from16 v43, v3

    move-object/from16 v51, v4

    move-object/from16 v47, v5

    move-object/from16 v45, v6

    move-object/from16 v44, v7

    move-object/from16 v60, v8

    move-object/from16 v53, v10

    move-object/from16 v52, v11

    move-object/from16 v50, v12

    move-object/from16 v49, v13

    move-object/from16 v48, v14

    move-object/from16 v46, v16

    move-object/from16 v58, v17

    move-object/from16 v57, v18

    move-object/from16 v56, v19

    move-object/from16 v55, v20

    move-object/from16 v54, v21

    :goto_0
    move/from16 v42, v9

    goto/16 :goto_c

    :cond_0
    move-object/from16 v22, v2

    move v2, v8

    move/from16 v8, p1

    move/from16 v30, v4

    move/from16 v26, v5

    move/from16 v24, v6

    move/from16 v23, v7

    move/from16 v39, v23

    move-object v3, v9

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object/from16 v33, v7

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move/from16 v32, v10

    move/from16 v31, v11

    move/from16 v29, v12

    move/from16 v28, v13

    move/from16 v27, v14

    move/from16 v25, v15

    move v9, v2

    move-object/from16 v2, v38

    move-object v10, v2

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    :goto_1
    if-eqz v39, :cond_1

    move/from16 v40, v8

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v8

    packed-switch v8, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v8}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    aget-object v8, v22, v40

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/b;

    move-object/from16 v41, v2

    move/from16 v2, v40

    invoke-interface {v0, v1, v2, v8, v3}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/high16 v8, 0x20000

    or-int/2addr v9, v8

    move v8, v2

    move-object/from16 v2, v41

    goto :goto_1

    :pswitch_1
    move-object/from16 v41, v2

    move/from16 v2, v40

    const/16 v8, 0x10

    aget-object v16, v22, v8

    invoke-interface/range {v16 .. v16}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v2, v16

    check-cast v2, Lwc3/b;

    move-object/from16 v16, v3

    move-object/from16 v3, v37

    invoke-interface {v0, v1, v8, v2, v3}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v37, v2

    check-cast v37, Ljava/util/List;

    const/high16 v2, 0x10000

    or-int/2addr v9, v2

    :goto_2
    move-object/from16 v3, v16

    :goto_3
    move-object/from16 v2, v41

    const/16 v8, 0x11

    goto :goto_1

    :pswitch_2
    move-object/from16 v41, v2

    move-object/from16 v16, v3

    move-object/from16 v3, v37

    const/16 v2, 0xf

    const/16 v8, 0x10

    aget-object v17, v22, v2

    invoke-interface/range {v17 .. v17}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v8, v17

    check-cast v8, Lwc3/b;

    move-object/from16 v17, v3

    move-object/from16 v3, v36

    invoke-interface {v0, v1, v2, v8, v3}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v36, v3

    check-cast v36, Ljava/util/List;

    const v3, 0x8000

    or-int/2addr v9, v3

    move-object/from16 v3, v16

    move-object/from16 v37, v17

    goto :goto_3

    :pswitch_3
    move-object/from16 v41, v2

    move-object/from16 v16, v3

    move-object/from16 v3, v36

    move-object/from16 v17, v37

    const/16 v2, 0xf

    const/16 v8, 0xe

    aget-object v18, v22, v8

    invoke-interface/range {v18 .. v18}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v2, v18

    check-cast v2, Lwc3/b;

    move-object/from16 v18, v3

    move-object/from16 v3, v35

    invoke-interface {v0, v1, v8, v2, v3}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v35, v2

    check-cast v35, Ljava/util/List;

    or-int/lit16 v9, v9, 0x4000

    move-object/from16 v3, v16

    move-object/from16 v36, v18

    goto :goto_3

    :pswitch_4
    move-object/from16 v41, v2

    move-object/from16 v16, v3

    move-object/from16 v3, v35

    move-object/from16 v18, v36

    move-object/from16 v17, v37

    const/16 v2, 0xd

    const/16 v8, 0xe

    aget-object v19, v22, v2

    invoke-interface/range {v19 .. v19}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v8, v19

    check-cast v8, Lwc3/b;

    move-object/from16 v19, v3

    move-object/from16 v3, v34

    invoke-interface {v0, v1, v2, v8, v3}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v34, v3

    check-cast v34, Ljava/util/List;

    or-int/lit16 v9, v9, 0x2000

    move-object/from16 v3, v16

    move-object/from16 v35, v19

    goto/16 :goto_3

    :pswitch_5
    move-object/from16 v41, v2

    move-object/from16 v16, v3

    move-object/from16 v3, v34

    move-object/from16 v19, v35

    move-object/from16 v18, v36

    move-object/from16 v17, v37

    const/16 v2, 0xd

    const/16 v8, 0xc

    aget-object v20, v22, v8

    invoke-interface/range {v20 .. v20}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v2, v20

    check-cast v2, Lwc3/b;

    move-object/from16 v20, v3

    move-object/from16 v3, v33

    invoke-interface {v0, v1, v8, v2, v3}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v33, v2

    check-cast v33, Ljava/util/List;

    or-int/lit16 v9, v9, 0x1000

    move-object/from16 v3, v16

    move-object/from16 v34, v20

    goto/16 :goto_3

    :pswitch_6
    move-object/from16 v41, v2

    move-object/from16 v16, v3

    move-object/from16 v3, v33

    move-object/from16 v20, v34

    move-object/from16 v19, v35

    move-object/from16 v18, v36

    move-object/from16 v17, v37

    const/16 v2, 0xb

    const/16 v8, 0xc

    aget-object v21, v22, v2

    invoke-interface/range {v21 .. v21}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v8, v21

    check-cast v8, Lwc3/b;

    invoke-interface {v0, v1, v2, v8, v10}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Ljava/util/List;

    or-int/lit16 v9, v9, 0x800

    goto/16 :goto_2

    :pswitch_7
    move-object/from16 v41, v2

    move-object/from16 v16, v3

    move-object/from16 v3, v33

    move-object/from16 v20, v34

    move-object/from16 v19, v35

    move-object/from16 v18, v36

    move-object/from16 v17, v37

    const/16 v2, 0xb

    aget-object v8, v22, v32

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/b;

    move/from16 v2, v32

    invoke-interface {v0, v1, v2, v8, v11}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, Ljava/util/List;

    or-int/lit16 v9, v9, 0x400

    goto/16 :goto_2

    :pswitch_8
    move-object/from16 v41, v2

    move-object/from16 v16, v3

    move/from16 v2, v32

    move-object/from16 v3, v33

    move-object/from16 v20, v34

    move-object/from16 v19, v35

    move-object/from16 v18, v36

    move-object/from16 v17, v37

    aget-object v8, v22, v31

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/b;

    move/from16 v2, v31

    invoke-interface {v0, v1, v2, v8, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    or-int/lit16 v9, v9, 0x200

    move-object/from16 v3, v16

    move-object/from16 v2, v41

    const/16 v8, 0x11

    :goto_4
    const/16 v32, 0xa

    goto/16 :goto_1

    :pswitch_9
    move-object/from16 v41, v2

    move-object/from16 v16, v3

    move/from16 v2, v31

    move-object/from16 v3, v33

    move-object/from16 v20, v34

    move-object/from16 v19, v35

    move-object/from16 v18, v36

    move-object/from16 v17, v37

    aget-object v8, v22, v30

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/b;

    move/from16 v2, v30

    invoke-interface {v0, v1, v2, v8, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v12, v8

    check-cast v12, Ljava/util/List;

    or-int/lit16 v9, v9, 0x100

    move-object/from16 v3, v16

    move-object/from16 v2, v41

    const/16 v8, 0x11

    :goto_5
    const/16 v31, 0x9

    goto :goto_4

    :pswitch_a
    move-object/from16 v41, v2

    move-object/from16 v16, v3

    move/from16 v2, v30

    move-object/from16 v3, v33

    move-object/from16 v20, v34

    move-object/from16 v19, v35

    move-object/from16 v18, v36

    move-object/from16 v17, v37

    aget-object v8, v22, v29

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/b;

    move/from16 v2, v29

    invoke-interface {v0, v1, v2, v8, v13}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v13, v8

    check-cast v13, Ljava/util/List;

    or-int/lit16 v9, v9, 0x80

    move-object/from16 v3, v16

    move-object/from16 v2, v41

    const/16 v8, 0x11

    :goto_6
    const/16 v30, 0x8

    goto :goto_5

    :pswitch_b
    move-object/from16 v41, v2

    move-object/from16 v16, v3

    move/from16 v2, v29

    move-object/from16 v3, v33

    move-object/from16 v20, v34

    move-object/from16 v19, v35

    move-object/from16 v18, v36

    move-object/from16 v17, v37

    aget-object v8, v22, v28

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/b;

    move/from16 v2, v28

    invoke-interface {v0, v1, v2, v8, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v14, v8

    check-cast v14, Ljava/util/List;

    or-int/lit8 v9, v9, 0x40

    move-object/from16 v3, v16

    move-object/from16 v2, v41

    const/16 v8, 0x11

    :goto_7
    const/16 v29, 0x7

    goto :goto_6

    :pswitch_c
    move-object/from16 v41, v2

    move-object/from16 v16, v3

    move/from16 v2, v28

    move-object/from16 v3, v33

    move-object/from16 v20, v34

    move-object/from16 v19, v35

    move-object/from16 v18, v36

    move-object/from16 v17, v37

    aget-object v8, v22, v27

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/b;

    move/from16 v2, v27

    invoke-interface {v0, v1, v2, v8, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    or-int/lit8 v9, v9, 0x20

    move-object/from16 v3, v16

    move-object/from16 v2, v41

    const/16 v8, 0x11

    :goto_8
    const/16 v28, 0x6

    goto :goto_7

    :pswitch_d
    move-object/from16 v41, v2

    move-object/from16 v16, v3

    move/from16 v2, v27

    move-object/from16 v3, v33

    move-object/from16 v20, v34

    move-object/from16 v19, v35

    move-object/from16 v18, v36

    move-object/from16 v17, v37

    aget-object v8, v22, v26

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/b;

    move/from16 v2, v26

    invoke-interface {v0, v1, v2, v8, v15}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v15, v8

    check-cast v15, Ljava/util/List;

    or-int/lit8 v9, v9, 0x10

    move-object/from16 v3, v16

    move-object/from16 v2, v41

    const/16 v8, 0x11

    :goto_9
    const/16 v27, 0x5

    goto :goto_8

    :pswitch_e
    move-object/from16 v41, v2

    move-object/from16 v16, v3

    move/from16 v2, v26

    move-object/from16 v3, v33

    move-object/from16 v20, v34

    move-object/from16 v19, v35

    move-object/from16 v18, v36

    move-object/from16 v17, v37

    aget-object v8, v22, v25

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/b;

    move/from16 v2, v25

    invoke-interface {v0, v1, v2, v8, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    or-int/lit8 v9, v9, 0x8

    move-object/from16 v3, v16

    move-object/from16 v2, v41

    const/16 v8, 0x11

    :goto_a
    const/16 v26, 0x4

    goto :goto_9

    :pswitch_f
    move-object/from16 v41, v2

    move-object/from16 v16, v3

    move/from16 v2, v25

    move-object/from16 v3, v33

    move-object/from16 v20, v34

    move-object/from16 v19, v35

    move-object/from16 v18, v36

    move-object/from16 v17, v37

    aget-object v8, v22, v24

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/b;

    move/from16 v2, v24

    invoke-interface {v0, v1, v2, v8, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    or-int/lit8 v9, v9, 0x4

    move-object/from16 v3, v16

    move-object/from16 v2, v41

    const/16 v8, 0x11

    const/16 v25, 0x3

    goto :goto_a

    :pswitch_10
    move-object/from16 v41, v2

    move-object/from16 v16, v3

    move/from16 v2, v24

    move-object/from16 v3, v33

    move-object/from16 v20, v34

    move-object/from16 v19, v35

    move-object/from16 v18, v36

    move-object/from16 v17, v37

    aget-object v8, v22, v23

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/b;

    move/from16 v2, v23

    move-object/from16 v23, v3

    move v3, v2

    move-object/from16 v2, v41

    invoke-interface {v0, v1, v3, v8, v2}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    or-int/lit8 v9, v9, 0x2

    move-object/from16 v33, v23

    :goto_b
    const/16 v8, 0x11

    const/16 v24, 0x2

    const/16 v25, 0x3

    const/16 v26, 0x4

    const/16 v27, 0x5

    const/16 v28, 0x6

    const/16 v29, 0x7

    const/16 v30, 0x8

    const/16 v31, 0x9

    const/16 v32, 0xa

    move/from16 v23, v3

    move-object/from16 v3, v16

    goto/16 :goto_1

    :pswitch_11
    move-object/from16 v16, v3

    move/from16 v3, v23

    move-object/from16 v23, v33

    move-object/from16 v20, v34

    move-object/from16 v19, v35

    move-object/from16 v18, v36

    move-object/from16 v17, v37

    const/4 v8, 0x0

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v38

    or-int/lit8 v9, v9, 0x1

    goto :goto_b

    :pswitch_12
    move-object/from16 v16, v3

    move/from16 v3, v23

    move-object/from16 v23, v33

    move-object/from16 v20, v34

    move-object/from16 v19, v35

    move-object/from16 v18, v36

    move-object/from16 v17, v37

    const/4 v8, 0x0

    move/from16 v39, v8

    goto :goto_b

    :cond_1
    move-object/from16 v16, v3

    move-object/from16 v23, v33

    move-object/from16 v20, v34

    move-object/from16 v19, v35

    move-object/from16 v18, v36

    move-object/from16 v17, v37

    move-object/from16 v44, v2

    move-object/from16 v52, v4

    move-object/from16 v48, v5

    move-object/from16 v46, v6

    move-object/from16 v45, v7

    move-object/from16 v54, v10

    move-object/from16 v53, v11

    move-object/from16 v51, v12

    move-object/from16 v50, v13

    move-object/from16 v49, v14

    move-object/from16 v47, v15

    move-object/from16 v60, v16

    move-object/from16 v59, v17

    move-object/from16 v58, v18

    move-object/from16 v57, v19

    move-object/from16 v56, v20

    move-object/from16 v55, v23

    move-object/from16 v43, v38

    goto/16 :goto_0

    :goto_c
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v41, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    const/16 v61, 0x0

    invoke-direct/range {v41 .. v61}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;-><init>(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v41

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
    invoke-virtual {p0, p1}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->write$Self$health_connect_release(Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$$serializer;->serialize(Lzc3/e;Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;)V

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
