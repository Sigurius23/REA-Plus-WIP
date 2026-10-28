.class public final synthetic Lcom/whoop/design/models/items/BehaviorTrackerModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/items/BehaviorTrackerModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/design/models/items/BehaviorTrackerModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/design/models/items/BehaviorTrackerModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/design/models/items/BehaviorTrackerModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/design/models/items/BehaviorTrackerModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/design/models/items/BehaviorTrackerModel;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "design-models_release"
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

.field public static final INSTANCE:Lcom/whoop/design/models/items/BehaviorTrackerModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/BehaviorTrackerModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/design/models/items/BehaviorTrackerModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/design/models/items/BehaviorTrackerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/BehaviorTrackerModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/design/models/items/BehaviorTrackerModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.design.models.items.BehaviorTrackerModel"

    const/16 v3, 0x10

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "id"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "questionType"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "title"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "questionText"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "description"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "status"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sticky"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "magnitude"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "category"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "deprecated"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "createdAt"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "updatedAt"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "timeLabel"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "timeContextLabel"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "weeklyPlanGoal"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "destination"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/design/models/items/BehaviorTrackerModel$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/design/models/items/BehaviorTrackerModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v6

    sget-object v7, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-static {v7}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v8

    sget-object v9, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto$$serializer;

    invoke-static {v9}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v9

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v10

    invoke-static {v7}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v7

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v11

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    sget-object v12, Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto$$serializer;

    invoke-static {v12}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v12

    const/16 v13, 0xf

    aget-object v0, v0, v13

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v14, 0x10

    new-array v14, v14, [Lwc3/c;

    sget-object v15, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/16 v16, 0x0

    aput-object v15, v14, v16

    const/4 v15, 0x1

    aput-object v2, v14, v15

    const/4 v2, 0x2

    aput-object v3, v14, v2

    const/4 v2, 0x3

    aput-object v4, v14, v2

    const/4 v2, 0x4

    aput-object v5, v14, v2

    const/4 v2, 0x5

    aput-object v6, v14, v2

    const/4 v2, 0x6

    aput-object v8, v14, v2

    const/4 v2, 0x7

    aput-object v9, v14, v2

    const/16 v2, 0x8

    aput-object v10, v14, v2

    const/16 v2, 0x9

    aput-object v7, v14, v2

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    const/16 v3, 0xa

    aput-object v2, v14, v3

    const/16 v3, 0xb

    aput-object v2, v14, v3

    const/16 v2, 0xc

    aput-object v11, v14, v2

    const/16 v2, 0xd

    aput-object v1, v14, v2

    const/16 v1, 0xe

    aput-object v12, v14, v1

    aput-object v0, v14, v13

    return-object v14
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/design/models/items/BehaviorTrackerModel;
    .locals 53

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/design/models/items/BehaviorTrackerModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/design/models/items/BehaviorTrackerModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/4 v10, 0x7

    const/4 v11, 0x6

    const/4 v12, 0x5

    const/4 v13, 0x3

    const/16 v14, 0x8

    const/4 v15, 0x4

    const/4 v4, 0x2

    const/16 v17, 0xf

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v3

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v5, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v0, v1, v4, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v0, v1, v13, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-interface {v0, v1, v15, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-interface {v0, v1, v12, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    sget-object v8, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-interface {v0, v1, v11, v8, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    sget-object v9, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto$$serializer;

    invoke-interface {v0, v1, v10, v9, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    invoke-interface {v0, v1, v14, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    const/16 v14, 0x9

    invoke-interface {v0, v1, v14, v8, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    const/16 v14, 0xa

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v18

    const/16 v14, 0xb

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v20

    const/16 v14, 0xc

    invoke-interface {v0, v1, v14, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    move-object/from16 v22, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v6, Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto$$serializer;

    move-object/from16 v16, v2

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    aget-object v6, v22, v17

    invoke-interface {v6}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lwc3/b;

    move-object/from16 p1, v2

    move/from16 v2, v17

    invoke-interface {v0, v1, v2, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/navigation/e;

    const v6, 0xffff

    move-object/from16 v50, p1

    move-object/from16 v51, v2

    move/from16 v34, v3

    move-object/from16 v36, v4

    move-object/from16 v35, v5

    move/from16 v33, v6

    move-object/from16 v43, v8

    move-object/from16 v41, v9

    move-object/from16 v42, v10

    move-object/from16 v40, v11

    move-object/from16 v39, v12

    move-object/from16 v37, v13

    move-object/from16 v48, v14

    move-object/from16 v38, v15

    move-object/from16 v49, v16

    move-wide/from16 v44, v18

    move-wide/from16 v46, v20

    goto/16 :goto_3

    :cond_0
    move-object/from16 v22, v2

    const-wide/16 v2, 0x0

    move-wide/from16 v25, v2

    move-wide/from16 v27, v25

    move/from16 v29, v5

    move v2, v6

    move/from16 v24, v2

    move-object v3, v7

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v8, v6

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    :goto_0
    if-eqz v29, :cond_1

    move-object/from16 v30, v7

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v7

    packed-switch v7, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v7}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    const/16 v7, 0xf

    aget-object v17, v22, v7

    invoke-interface/range {v17 .. v17}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v31, v8

    move-object/from16 v8, v17

    check-cast v8, Lwc3/b;

    invoke-interface {v0, v1, v7, v8, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/navigation/e;

    const v8, 0x8000

    or-int/2addr v2, v8

    :goto_1
    move-object/from16 v7, v30

    move-object/from16 v8, v31

    goto :goto_0

    :pswitch_1
    move-object/from16 v31, v8

    const/16 v7, 0xf

    sget-object v8, Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto$$serializer;

    const/16 v7, 0xe

    invoke-interface {v0, v1, v7, v8, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v14, v8

    check-cast v14, Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    or-int/lit16 v2, v2, 0x4000

    goto :goto_1

    :pswitch_2
    move-object/from16 v31, v8

    const/16 v7, 0xe

    sget-object v8, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v7, 0xd

    invoke-interface {v0, v1, v7, v8, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Ljava/lang/String;

    or-int/lit16 v2, v2, 0x2000

    goto :goto_1

    :pswitch_3
    move-object/from16 v31, v8

    const/16 v7, 0xd

    sget-object v8, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v7, 0xc

    invoke-interface {v0, v1, v7, v8, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, Ljava/lang/String;

    or-int/lit16 v2, v2, 0x1000

    goto :goto_1

    :pswitch_4
    move-object/from16 v31, v8

    const/16 v7, 0xc

    const/16 v8, 0xb

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v27

    or-int/lit16 v2, v2, 0x800

    goto :goto_1

    :pswitch_5
    move-object/from16 v31, v8

    const/16 v7, 0xa

    const/16 v8, 0xb

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v25

    or-int/lit16 v2, v2, 0x400

    goto :goto_1

    :pswitch_6
    move-object/from16 v31, v8

    const/16 v8, 0xb

    sget-object v7, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/16 v8, 0x9

    invoke-interface {v0, v1, v8, v7, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v12, v7

    check-cast v12, Ljava/lang/Boolean;

    or-int/lit16 v2, v2, 0x200

    goto :goto_1

    :pswitch_7
    move-object/from16 v31, v8

    const/16 v8, 0x9

    sget-object v7, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v8, 0x8

    invoke-interface {v0, v1, v8, v7, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v15, v7

    check-cast v15, Ljava/lang/String;

    or-int/lit16 v2, v2, 0x100

    goto :goto_1

    :pswitch_8
    move-object/from16 v31, v8

    const/16 v8, 0x8

    sget-object v7, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto$$serializer;

    const/4 v8, 0x7

    invoke-interface {v0, v1, v8, v7, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v13, v7

    check-cast v13, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    or-int/lit16 v2, v2, 0x80

    goto/16 :goto_1

    :pswitch_9
    move-object/from16 v31, v8

    const/4 v8, 0x7

    sget-object v7, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/4 v8, 0x6

    invoke-interface {v0, v1, v8, v7, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    or-int/lit8 v2, v2, 0x40

    goto/16 :goto_1

    :pswitch_a
    move-object/from16 v31, v8

    const/4 v8, 0x6

    sget-object v7, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v8, 0x5

    invoke-interface {v0, v1, v8, v7, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    or-int/lit8 v2, v2, 0x20

    goto/16 :goto_1

    :pswitch_b
    move-object/from16 v31, v8

    const/4 v8, 0x5

    sget-object v7, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v8, 0x4

    invoke-interface {v0, v1, v8, v7, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    or-int/lit8 v2, v2, 0x10

    goto/16 :goto_1

    :pswitch_c
    move-object/from16 v31, v8

    const/4 v8, 0x4

    sget-object v7, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v8, 0x3

    invoke-interface {v0, v1, v8, v7, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, Ljava/lang/String;

    or-int/lit8 v2, v2, 0x8

    goto/16 :goto_1

    :pswitch_d
    move-object/from16 v31, v8

    const/4 v8, 0x3

    sget-object v7, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move/from16 v23, v2

    move-object/from16 v8, v31

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2, v7, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    or-int/lit8 v7, v23, 0x4

    move v2, v7

    move-object/from16 v7, v30

    goto/16 :goto_0

    :pswitch_e
    move/from16 v23, v2

    const/4 v2, 0x2

    sget-object v7, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v21, v3

    move-object/from16 v2, v30

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3, v7, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    or-int/lit8 v2, v23, 0x2

    :goto_2
    move-object/from16 v3, v21

    goto/16 :goto_0

    :pswitch_f
    move/from16 v23, v2

    move-object/from16 v21, v3

    move-object/from16 v2, v30

    const/4 v3, 0x1

    const/4 v7, 0x0

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v24

    or-int/lit8 v20, v23, 0x1

    move-object v7, v2

    move/from16 v2, v20

    goto :goto_2

    :pswitch_10
    move/from16 v23, v2

    move-object/from16 v21, v3

    move-object/from16 v2, v30

    const/4 v3, 0x1

    const/4 v7, 0x0

    move/from16 v29, v7

    move-object/from16 v3, v21

    move-object v7, v2

    move/from16 v2, v23

    goto/16 :goto_0

    :cond_1
    move/from16 v23, v2

    move-object/from16 v21, v3

    move-object v2, v7

    move-object/from16 v35, v2

    move-object/from16 v40, v4

    move-object/from16 v39, v5

    move-object/from16 v38, v6

    move-object/from16 v36, v8

    move-object/from16 v37, v9

    move-object/from16 v49, v10

    move-object/from16 v48, v11

    move-object/from16 v43, v12

    move-object/from16 v41, v13

    move-object/from16 v50, v14

    move-object/from16 v42, v15

    move-object/from16 v51, v21

    move/from16 v33, v23

    move/from16 v34, v24

    move-wide/from16 v44, v25

    move-wide/from16 v46, v27

    :goto_3
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v32, Lcom/whoop/design/models/items/BehaviorTrackerModel;

    const/16 v52, 0x0

    invoke-direct/range {v32 .. v52}, Lcom/whoop/design/models/items/BehaviorTrackerModel;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v32

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/items/BehaviorTrackerModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/design/models/items/BehaviorTrackerModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/BehaviorTrackerModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/design/models/items/BehaviorTrackerModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/BehaviorTrackerModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/design/models/items/BehaviorTrackerModel;->write$Self$design_models_release(Lcom/whoop/design/models/items/BehaviorTrackerModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/design/models/items/BehaviorTrackerModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/models/items/BehaviorTrackerModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/design/models/items/BehaviorTrackerModel;)V

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
