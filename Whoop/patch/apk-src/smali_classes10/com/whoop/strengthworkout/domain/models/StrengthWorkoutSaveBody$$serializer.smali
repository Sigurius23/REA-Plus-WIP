.class public final synthetic Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "strength-workout_release"
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

.field public static final INSTANCE:Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$$serializer;

    invoke-direct {v0}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$$serializer;->INSTANCE:Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.strengthworkout.domain.models.StrengthWorkoutSaveBody"

    const/16 v3, 0xc

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "weightliftingWorkoutId"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "activityId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "during"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "timezone"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "name"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "workoutTemplateId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "rpe"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "mskTotalVolumeKg"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "rawMskStrainScore"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "mskIntensityPercent"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "scaledMskStrainScore"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "workoutGroups"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0xc

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

    move-result-object v2

    aput-object v2, v1, v3

    sget-object v2, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    sget-object v2, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    sget-object v2, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const/16 v3, 0x8

    aput-object v2, v1, v3

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const/16 v3, 0xa

    aput-object v2, v1, v3

    const/16 v2, 0xb

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;
    .locals 39

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v4, 0xa

    const/16 v5, 0x9

    const/4 v6, 0x7

    const/4 v7, 0x6

    const/4 v8, 0x5

    const/4 v9, 0x3

    const/16 v10, 0x8

    const/4 v11, 0x4

    const/4 v12, 0x2

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 p1, 0xb

    const/4 v13, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    sget-object v15, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v14, v15, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v1, v11, v15, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    sget-object v15, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    invoke-interface {v0, v1, v8, v15, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Long;

    sget-object v15, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-interface {v0, v1, v7, v15, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v6

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v10

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v5

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v4

    aget-object v2, v2, p1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    move/from16 v15, p1

    invoke-interface {v0, v1, v15, v2, v13}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/16 v13, 0xfff

    move-object/from16 v37, v2

    move-object/from16 v26, v3

    move/from16 v36, v4

    move/from16 v35, v5

    move/from16 v33, v6

    move-object/from16 v32, v7

    move-object/from16 v31, v8

    move-object/from16 v29, v9

    move/from16 v34, v10

    move-object/from16 v30, v11

    move-object/from16 v28, v12

    move/from16 v25, v13

    move-object/from16 v27, v14

    goto/16 :goto_5

    :cond_0
    const/4 v3, 0x0

    move/from16 v16, v3

    move/from16 v17, v16

    move-object v9, v13

    move-object v11, v9

    move-object v12, v11

    move-object/from16 v18, v12

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move/from16 v22, v14

    move/from16 v13, v17

    move-object/from16 v14, v21

    :goto_0
    if-eqz v22, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v8

    packed-switch v8, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v8}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    const/16 v8, 0xb

    aget-object v23, v2, v8

    invoke-interface/range {v23 .. v23}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v23

    move-object/from16 v7, v23

    check-cast v7, Lwc3/b;

    invoke-interface {v0, v1, v8, v7, v11}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v11, v7

    check-cast v11, Ljava/util/List;

    or-int/lit16 v15, v15, 0x800

    :goto_1
    const/4 v7, 0x6

    :goto_2
    const/4 v8, 0x5

    goto :goto_0

    :pswitch_1
    const/16 v8, 0xb

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v3

    or-int/lit16 v15, v15, 0x400

    goto :goto_1

    :pswitch_2
    const/16 v8, 0xb

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v13

    or-int/lit16 v15, v15, 0x200

    goto :goto_1

    :pswitch_3
    const/16 v8, 0xb

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v17

    or-int/lit16 v15, v15, 0x100

    goto :goto_1

    :pswitch_4
    const/16 v8, 0xb

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v16

    or-int/lit16 v15, v15, 0x80

    goto :goto_1

    :pswitch_5
    const/16 v8, 0xb

    sget-object v7, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/4 v4, 0x6

    invoke-interface {v0, v1, v4, v7, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, Ljava/lang/Integer;

    or-int/lit8 v15, v15, 0x40

    move v7, v4

    const/16 v4, 0xa

    goto :goto_2

    :pswitch_6
    move v4, v7

    const/16 v8, 0xb

    sget-object v7, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    const/4 v4, 0x5

    invoke-interface {v0, v1, v4, v7, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v12, v7

    check-cast v12, Ljava/lang/Long;

    or-int/lit8 v15, v15, 0x20

    move v8, v4

    const/16 v4, 0xa

    const/4 v7, 0x6

    goto :goto_0

    :pswitch_7
    const/4 v4, 0x5

    const/16 v8, 0xb

    sget-object v7, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v4, 0x4

    invoke-interface {v0, v1, v4, v7, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v14, v7

    check-cast v14, Ljava/lang/String;

    or-int/lit8 v15, v15, 0x10

    :goto_3
    const/16 v4, 0xa

    goto :goto_1

    :pswitch_8
    const/4 v4, 0x4

    const/4 v7, 0x3

    const/16 v8, 0xb

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v21

    or-int/lit8 v15, v15, 0x8

    goto :goto_3

    :pswitch_9
    const/4 v4, 0x2

    const/4 v7, 0x3

    const/16 v8, 0xb

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v20

    or-int/lit8 v15, v15, 0x4

    goto :goto_3

    :pswitch_a
    const/4 v7, 0x3

    const/16 v8, 0xb

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v5, v19

    const/4 v6, 0x1

    invoke-interface {v0, v1, v6, v4, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    or-int/lit8 v15, v15, 0x2

    move-object/from16 v19, v4

    :goto_4
    const/16 v4, 0xa

    const/16 v5, 0x9

    const/4 v6, 0x7

    goto/16 :goto_1

    :pswitch_b
    move-object/from16 v5, v19

    const/4 v4, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x3

    const/16 v8, 0xb

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v18

    or-int/lit8 v15, v15, 0x1

    goto :goto_4

    :pswitch_c
    move-object/from16 v5, v19

    const/4 v4, 0x0

    const/4 v7, 0x3

    const/16 v8, 0xb

    move/from16 v22, v4

    const/16 v4, 0xa

    const/16 v5, 0x9

    goto/16 :goto_1

    :cond_1
    move-object/from16 v5, v19

    move/from16 v36, v3

    move-object/from16 v27, v5

    move-object/from16 v32, v9

    move-object/from16 v37, v11

    move-object/from16 v31, v12

    move/from16 v35, v13

    move-object/from16 v30, v14

    move/from16 v25, v15

    move/from16 v33, v16

    move/from16 v34, v17

    move-object/from16 v26, v18

    move-object/from16 v28, v20

    move-object/from16 v29, v21

    :goto_5
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v24, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;

    const/16 v38, 0x0

    invoke-direct/range {v24 .. v38}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;FFFFLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v24

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->write$Self$strength_workout_release(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$$serializer;->serialize(Lzc3/e;Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;)V

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
