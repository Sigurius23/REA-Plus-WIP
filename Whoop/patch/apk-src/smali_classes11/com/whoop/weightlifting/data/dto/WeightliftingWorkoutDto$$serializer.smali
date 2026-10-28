.class public final synthetic Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/weightlifting/data/dto/WeightliftingWorkoutDto.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;",
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

.field public static final INSTANCE:Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$$serializer;

    invoke-direct {v0}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.weightlifting.data.dto.WeightliftingWorkoutDto"

    const/16 v3, 0xd

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "source"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "during"

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "timezone"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "name"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "msk_total_volume_kg"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "raw_msk_strain_score"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "msk_intensity_percent"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "scaled_msk_strain_score"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "workout_template_id"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "rpe"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "workout_groups"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "is_simple_strength_logging"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "type"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    sget-object v3, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    sget-object v5, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    invoke-static {v5}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    sget-object v6, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-static {v6}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v6

    const/16 v7, 0xa

    aget-object v0, v0, v7

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v8, 0xd

    new-array v8, v8, [Lwc3/c;

    const/4 v9, 0x0

    aput-object v1, v8, v9

    const/4 v9, 0x1

    aput-object v1, v8, v9

    const/4 v9, 0x2

    aput-object v1, v8, v9

    const/4 v9, 0x3

    aput-object v2, v8, v9

    const/4 v2, 0x4

    aput-object v4, v8, v2

    const/4 v2, 0x5

    aput-object v3, v8, v2

    const/4 v2, 0x6

    aput-object v3, v8, v2

    const/4 v2, 0x7

    aput-object v3, v8, v2

    const/16 v2, 0x8

    aput-object v5, v8, v2

    const/16 v2, 0x9

    aput-object v6, v8, v2

    aput-object v0, v8, v7

    sget-object v0, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/16 v2, 0xb

    aput-object v0, v8, v2

    const/16 v0, 0xc

    aput-object v1, v8, v0

    return-object v8
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;
    .locals 42

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v6, 0x9

    const/4 v7, 0x7

    const/4 v8, 0x6

    const/4 v9, 0x5

    const/4 v10, 0x3

    const/16 v11, 0x8

    const/4 v12, 0x4

    const/4 v13, 0x2

    const/16 v14, 0xa

    const/4 v15, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v13

    sget-object v15, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v10, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    sget-object v15, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    invoke-interface {v0, v1, v12, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Float;

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v9

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v8

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v7

    sget-object v15, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    invoke-interface {v0, v1, v11, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Long;

    sget-object v15, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-interface {v0, v1, v6, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    aget-object v2, v2, v14

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-interface {v0, v1, v14, v2, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/16 v5, 0xb

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v5

    const/16 v14, 0xc

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v14

    const/16 v15, 0x1fff

    move-object/from16 v38, v2

    move-object/from16 v28, v3

    move-object/from16 v29, v4

    move/from16 v39, v5

    move-object/from16 v37, v6

    move/from16 v35, v7

    move/from16 v34, v8

    move/from16 v33, v9

    move-object/from16 v31, v10

    move-object/from16 v36, v11

    move-object/from16 v32, v12

    move-object/from16 v30, v13

    move-object/from16 v40, v14

    move/from16 v27, v15

    goto/16 :goto_4

    :cond_0
    const/16 v3, 0xc

    const/16 v17, 0x0

    move v9, v4

    move/from16 v20, v9

    move-object v4, v5

    move-object v10, v4

    move-object v12, v10

    move-object v13, v12

    move-object/from16 v18, v13

    move-object/from16 v21, v18

    move/from16 v25, v15

    move/from16 v22, v17

    move/from16 v23, v22

    move/from16 v24, v23

    move-object/from16 v15, v21

    move-object/from16 v17, v15

    :goto_0
    if-eqz v25, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v8

    packed-switch v8, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v8}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v21

    or-int/lit16 v9, v9, 0x1000

    :goto_1
    const/4 v8, 0x6

    goto :goto_0

    :pswitch_1
    const/16 v8, 0xb

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v20

    or-int/lit16 v9, v9, 0x800

    goto :goto_1

    :pswitch_2
    const/16 v8, 0xb

    aget-object v16, v2, v14

    invoke-interface/range {v16 .. v16}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v3, v16

    check-cast v3, Lwc3/b;

    invoke-interface {v0, v1, v14, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Ljava/util/List;

    or-int/lit16 v9, v9, 0x400

    :goto_2
    const/16 v3, 0xc

    goto :goto_1

    :pswitch_3
    const/16 v8, 0xb

    sget-object v3, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-interface {v0, v1, v6, v3, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Ljava/lang/Integer;

    or-int/lit16 v9, v9, 0x200

    goto :goto_2

    :pswitch_4
    const/16 v8, 0xb

    sget-object v3, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    invoke-interface {v0, v1, v11, v3, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Ljava/lang/Long;

    or-int/lit16 v9, v9, 0x100

    goto :goto_2

    :pswitch_5
    const/16 v8, 0xb

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v22

    or-int/lit16 v9, v9, 0x80

    goto :goto_2

    :pswitch_6
    const/4 v3, 0x6

    const/16 v8, 0xb

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v23

    or-int/lit8 v9, v9, 0x40

    move v8, v3

    const/16 v3, 0xc

    goto :goto_0

    :pswitch_7
    const/4 v3, 0x5

    const/16 v8, 0xb

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v24

    or-int/lit8 v9, v9, 0x20

    goto :goto_2

    :pswitch_8
    const/16 v8, 0xb

    sget-object v3, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    const/4 v6, 0x4

    invoke-interface {v0, v1, v6, v3, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Ljava/lang/Float;

    or-int/lit8 v9, v9, 0x10

    :goto_3
    const/16 v3, 0xc

    const/16 v6, 0x9

    goto :goto_1

    :pswitch_9
    const/4 v6, 0x4

    const/16 v8, 0xb

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v6, 0x3

    invoke-interface {v0, v1, v6, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    or-int/lit8 v9, v9, 0x8

    goto :goto_3

    :pswitch_a
    const/4 v3, 0x2

    const/4 v6, 0x3

    const/16 v8, 0xb

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v18

    or-int/lit8 v9, v9, 0x4

    goto :goto_3

    :pswitch_b
    const/4 v3, 0x1

    const/4 v6, 0x3

    const/16 v8, 0xb

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v17

    or-int/lit8 v9, v9, 0x2

    goto :goto_3

    :pswitch_c
    const/4 v3, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x3

    const/16 v8, 0xb

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v19

    or-int/lit8 v9, v9, 0x1

    move-object/from16 v5, v19

    goto :goto_3

    :pswitch_d
    const/4 v3, 0x1

    const/16 v19, 0x0

    move/from16 v25, v19

    goto/16 :goto_2

    :cond_1
    move-object/from16 v31, v4

    move-object/from16 v28, v5

    move/from16 v27, v9

    move-object/from16 v37, v10

    move-object/from16 v38, v12

    move-object/from16 v36, v13

    move-object/from16 v32, v15

    move-object/from16 v29, v17

    move-object/from16 v30, v18

    move/from16 v39, v20

    move-object/from16 v40, v21

    move/from16 v35, v22

    move/from16 v34, v23

    move/from16 v33, v24

    :goto_4
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v26, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    const/16 v41, 0x0

    invoke-direct/range {v26 .. v41}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FFFLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v26

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->write$Self$weightlifting_release(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$$serializer;->serialize(Lzc3/e;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;)V

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
