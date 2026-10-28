.class public final synthetic Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "weightlifting_release"
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

.field public static final INSTANCE:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$$serializer;

    invoke-direct {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout"

    const/16 v3, 0xf

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "name"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "parentTemplateId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "workoutTemplateId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "groups"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "originalGroups"

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "idsOfExpandedExercises"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "startTime"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "positionInWorkout"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "currentSetState"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "completedSetData"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "strapLocation"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "strapLaterality"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "analytics"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "manuallyEditedSetIds"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "isSimpleStrengthLogging"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0xf

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    aput-object v3, v1, v2

    sget-object v2, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v1, v4

    const/4 v3, 0x2

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    aput-object v2, v1, v3

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

    sget-object v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

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

    sget-object v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics$$serializer;

    aput-object v3, v1, v2

    const/16 v2, 0xd

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v2

    const/16 v0, 0xe

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    aput-object v2, v1, v0

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 50

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/4 v6, 0x7

    const/4 v7, 0x2

    const/16 v10, 0xa

    const/16 v11, 0x9

    const/4 v12, 0x6

    const/4 v13, 0x5

    const/4 v14, 0x3

    const/16 v15, 0x8

    const/4 v4, 0x4

    const/16 v16, 0xd

    const/4 v8, 0x1

    const/4 v5, 0x0

    const/16 v18, 0xb

    const/4 v9, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    invoke-interface {v0, v1, v8, v5, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Long;

    invoke-interface {v0, v1, v7, v5, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    aget-object v7, v2, v14

    invoke-interface {v7}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lwc3/b;

    invoke-interface {v0, v1, v14, v7, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    aget-object v14, v2, v4

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/b;

    invoke-interface {v0, v1, v4, v14, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    aget-object v14, v2, v13

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/b;

    invoke-interface {v0, v1, v13, v14, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Set;

    aget-object v14, v2, v12

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/b;

    invoke-interface {v0, v1, v12, v14, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lorg/joda/time/DateTime;

    sget-object v14, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout$$serializer;

    invoke-interface {v0, v1, v6, v14, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    aget-object v14, v2, v15

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/b;

    invoke-interface {v0, v1, v15, v14, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    aget-object v15, v2, v11

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v11, v15, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map;

    aget-object v15, v2, v10

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v10, v15, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/weightlifting/data/domain/StrapLocation;

    aget-object v15, v2, v18

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v19, v2

    move/from16 v2, v18

    invoke-interface {v0, v1, v2, v15, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    sget-object v15, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics$$serializer;

    move-object/from16 v18, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v15, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    aget-object v15, v19, v16

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v17, v2

    move/from16 v2, v16

    invoke-interface {v0, v1, v2, v15, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    const/16 v9, 0xe

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v9

    const/16 v15, 0x7fff

    move-object/from16 v47, v2

    move-object/from16 v34, v3

    move-object/from16 v38, v4

    move-object/from16 v36, v5

    move-object/from16 v41, v6

    move-object/from16 v37, v7

    move-object/from16 v35, v8

    move/from16 v48, v9

    move-object/from16 v44, v10

    move-object/from16 v43, v11

    move-object/from16 v40, v12

    move-object/from16 v39, v13

    move-object/from16 v42, v14

    move/from16 v33, v15

    move-object/from16 v46, v17

    move-object/from16 v45, v18

    goto/16 :goto_a

    :cond_0
    move-object/from16 v19, v2

    const/16 v2, 0xe

    move/from16 v22, v4

    move/from16 v29, v5

    move/from16 v30, v29

    move/from16 v31, v8

    move-object v3, v9

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object/from16 v28, v8

    move/from16 v27, v10

    move/from16 v26, v11

    move/from16 v24, v12

    move/from16 v23, v13

    move/from16 v21, v14

    move/from16 v25, v15

    move-object/from16 v10, v28

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    :goto_0
    if-eqz v31, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v2}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    const/16 v2, 0xe

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v29

    move/from16 v2, v30

    or-int/lit16 v2, v2, 0x4000

    :goto_1
    move/from16 v30, v2

    const/16 v2, 0xe

    goto :goto_0

    :pswitch_1
    move/from16 v2, v30

    move-object/from16 v30, v9

    const/16 v9, 0xd

    aget-object v16, v19, v9

    invoke-interface/range {v16 .. v16}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v32, v3

    move-object/from16 v3, v16

    check-cast v3, Lwc3/b;

    move-object/from16 v16, v5

    move-object/from16 v5, v28

    invoke-interface {v0, v1, v9, v3, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v28, v3

    check-cast v28, Ljava/util/Set;

    or-int/lit16 v2, v2, 0x2000

    :goto_2
    move-object/from16 v5, v16

    move-object/from16 v9, v30

    move-object/from16 v3, v32

    goto :goto_1

    :pswitch_2
    move-object/from16 v32, v3

    move-object/from16 v16, v5

    move-object/from16 v5, v28

    move/from16 v2, v30

    move-object/from16 v30, v9

    const/16 v9, 0xd

    sget-object v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics$$serializer;

    const/16 v9, 0xc

    invoke-interface {v0, v1, v9, v3, v10}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    or-int/lit16 v2, v2, 0x1000

    goto :goto_2

    :pswitch_3
    move-object/from16 v32, v3

    move-object/from16 v16, v5

    move-object/from16 v5, v28

    move/from16 v2, v30

    const/16 v3, 0xb

    move-object/from16 v30, v9

    const/16 v9, 0xc

    aget-object v17, v19, v3

    invoke-interface/range {v17 .. v17}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v9, v17

    check-cast v9, Lwc3/b;

    invoke-interface {v0, v1, v3, v9, v11}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v11, v9

    check-cast v11, Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    or-int/lit16 v2, v2, 0x800

    goto :goto_2

    :pswitch_4
    move-object/from16 v32, v3

    move-object/from16 v16, v5

    move-object/from16 v5, v28

    move/from16 v2, v30

    const/16 v3, 0xb

    move-object/from16 v30, v9

    aget-object v9, v19, v27

    invoke-interface {v9}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lwc3/b;

    move/from16 v3, v27

    invoke-interface {v0, v1, v3, v9, v15}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v15, v9

    check-cast v15, Lcom/whoop/weightlifting/data/domain/StrapLocation;

    or-int/lit16 v2, v2, 0x400

    goto :goto_2

    :pswitch_5
    move-object/from16 v32, v3

    move-object/from16 v16, v5

    move/from16 v3, v27

    move-object/from16 v5, v28

    move/from16 v2, v30

    move-object/from16 v30, v9

    aget-object v9, v19, v26

    invoke-interface {v9}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lwc3/b;

    move/from16 v3, v26

    invoke-interface {v0, v1, v3, v9, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map;

    or-int/lit16 v2, v2, 0x200

    move-object/from16 v5, v16

    move-object/from16 v9, v30

    move-object/from16 v3, v32

    :goto_3
    const/16 v27, 0xa

    goto/16 :goto_1

    :pswitch_6
    move-object/from16 v32, v3

    move-object/from16 v16, v5

    move/from16 v3, v26

    move-object/from16 v5, v28

    move/from16 v2, v30

    move-object/from16 v30, v9

    aget-object v9, v19, v25

    invoke-interface {v9}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lwc3/b;

    move/from16 v3, v25

    invoke-interface {v0, v1, v3, v9, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v12, v9

    check-cast v12, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    or-int/lit16 v2, v2, 0x100

    move-object/from16 v5, v16

    move-object/from16 v9, v30

    move-object/from16 v3, v32

    :goto_4
    const/16 v26, 0x9

    goto :goto_3

    :pswitch_7
    move-object/from16 v32, v3

    move-object/from16 v16, v5

    move/from16 v3, v25

    move-object/from16 v5, v28

    move/from16 v2, v30

    move-object/from16 v30, v9

    sget-object v9, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout$$serializer;

    const/4 v3, 0x7

    invoke-interface {v0, v1, v3, v9, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v13, v9

    check-cast v13, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    or-int/lit16 v2, v2, 0x80

    :goto_5
    move-object/from16 v5, v16

    move-object/from16 v9, v30

    move-object/from16 v3, v32

    :goto_6
    const/16 v25, 0x8

    goto :goto_4

    :pswitch_8
    move-object/from16 v32, v3

    move-object/from16 v16, v5

    move-object/from16 v5, v28

    move/from16 v2, v30

    const/4 v3, 0x7

    move-object/from16 v30, v9

    aget-object v9, v19, v24

    invoke-interface {v9}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lwc3/b;

    move/from16 v3, v24

    invoke-interface {v0, v1, v3, v9, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/joda/time/DateTime;

    or-int/lit8 v2, v2, 0x40

    goto :goto_5

    :pswitch_9
    move-object/from16 v32, v3

    move-object/from16 v16, v5

    move/from16 v3, v24

    move-object/from16 v5, v28

    move/from16 v2, v30

    move-object/from16 v30, v9

    aget-object v9, v19, v23

    invoke-interface {v9}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lwc3/b;

    move/from16 v3, v23

    invoke-interface {v0, v1, v3, v9, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v14, v9

    check-cast v14, Ljava/util/Set;

    or-int/lit8 v2, v2, 0x20

    move-object/from16 v5, v16

    move-object/from16 v9, v30

    move-object/from16 v3, v32

    :goto_7
    const/16 v24, 0x6

    goto :goto_6

    :pswitch_a
    move-object/from16 v32, v3

    move-object/from16 v16, v5

    move/from16 v3, v23

    move-object/from16 v5, v28

    move/from16 v2, v30

    move-object/from16 v30, v9

    aget-object v9, v19, v22

    invoke-interface {v9}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lwc3/b;

    move/from16 v3, v22

    invoke-interface {v0, v1, v3, v9, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    or-int/lit8 v2, v2, 0x10

    move-object/from16 v5, v16

    move-object/from16 v9, v30

    move-object/from16 v3, v32

    :goto_8
    const/16 v23, 0x5

    goto :goto_7

    :pswitch_b
    move-object/from16 v32, v3

    move-object/from16 v16, v5

    move/from16 v3, v22

    move-object/from16 v5, v28

    move/from16 v2, v30

    move-object/from16 v30, v9

    aget-object v9, v19, v21

    invoke-interface {v9}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lwc3/b;

    move/from16 v3, v21

    invoke-interface {v0, v1, v3, v9, v8}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    or-int/lit8 v2, v2, 0x8

    move-object/from16 v5, v16

    move-object/from16 v9, v30

    move-object/from16 v3, v32

    const/16 v22, 0x4

    goto :goto_8

    :pswitch_c
    move-object/from16 v32, v3

    move-object/from16 v16, v5

    move/from16 v3, v21

    move-object/from16 v5, v28

    move/from16 v2, v30

    move-object/from16 v30, v9

    sget-object v9, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    move-object/from16 v3, v16

    move/from16 v16, v2

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2, v9, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    or-int/lit8 v9, v16, 0x4

    move-object/from16 v2, v30

    move/from16 v30, v9

    move-object v9, v2

    const/16 v2, 0xe

    const/16 v21, 0x3

    const/16 v22, 0x4

    const/16 v23, 0x5

    const/16 v24, 0x6

    const/16 v25, 0x8

    const/16 v26, 0x9

    const/16 v27, 0xa

    move-object v5, v3

    move-object/from16 v3, v32

    goto/16 :goto_0

    :pswitch_d
    move-object/from16 v32, v3

    move-object v3, v5

    move-object/from16 v5, v28

    move/from16 v16, v30

    const/4 v2, 0x2

    move-object/from16 v30, v9

    sget-object v9, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    move-object/from16 v20, v3

    move-object/from16 v2, v32

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3, v9, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    or-int/lit8 v9, v16, 0x2

    move-object/from16 v3, v30

    move/from16 v30, v9

    move-object v9, v3

    move-object v3, v2

    move-object/from16 v5, v20

    const/16 v2, 0xe

    const/16 v21, 0x3

    const/16 v22, 0x4

    const/16 v23, 0x5

    const/16 v24, 0x6

    const/16 v25, 0x8

    const/16 v26, 0x9

    const/16 v27, 0xa

    goto/16 :goto_0

    :pswitch_e
    move-object v2, v3

    move-object/from16 v20, v5

    move-object/from16 v5, v28

    move/from16 v16, v30

    const/4 v3, 0x1

    const/4 v9, 0x0

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v30

    or-int/lit8 v16, v16, 0x1

    move-object v3, v2

    :goto_9
    move-object/from16 v5, v20

    move-object/from16 v9, v30

    const/16 v2, 0xe

    const/16 v21, 0x3

    const/16 v22, 0x4

    const/16 v23, 0x5

    const/16 v24, 0x6

    const/16 v25, 0x8

    const/16 v26, 0x9

    const/16 v27, 0xa

    move/from16 v30, v16

    goto/16 :goto_0

    :pswitch_f
    move-object v2, v3

    move-object/from16 v20, v5

    move-object/from16 v5, v28

    move/from16 v16, v30

    const/4 v3, 0x1

    move-object/from16 v30, v9

    const/4 v9, 0x0

    move-object v3, v2

    move/from16 v31, v9

    goto :goto_9

    :cond_1
    move-object v2, v3

    move-object/from16 v20, v5

    move-object/from16 v5, v28

    move/from16 v16, v30

    move-object/from16 v30, v9

    move-object/from16 v35, v2

    move-object/from16 v40, v4

    move-object/from16 v47, v5

    move-object/from16 v43, v6

    move-object/from16 v38, v7

    move-object/from16 v37, v8

    move-object/from16 v46, v10

    move-object/from16 v45, v11

    move-object/from16 v42, v12

    move-object/from16 v41, v13

    move-object/from16 v39, v14

    move-object/from16 v44, v15

    move/from16 v33, v16

    move-object/from16 v36, v20

    move/from16 v48, v29

    move-object/from16 v34, v30

    :goto_a
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v32, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    const/16 v49, 0x0

    invoke-direct/range {v32 .. v49}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;-><init>(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/util/Set;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v32

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->write$Self$weightlifting_release(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$$serializer;->serialize(Lzc3/e;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)V

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
