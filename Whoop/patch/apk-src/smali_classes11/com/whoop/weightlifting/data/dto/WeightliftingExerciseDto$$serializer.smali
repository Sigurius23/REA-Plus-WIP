.class public final synthetic Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/weightlifting/data/dto/WeightliftingExerciseDto.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;",
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

.field public static final INSTANCE:Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$$serializer;

    invoke-direct {v0}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.weightlifting.data.dto.WeightliftingExerciseDto"

    const/16 v3, 0x17

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "exercise_id"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "name"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "push_core_name"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "trackable"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "equipment"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "translated_equipment"

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "exercise_type"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "laterality"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "movement_pattern"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "translated_movement_pattern"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "image_url"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "video_url"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "instructions"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "training_types"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "muscle_groups"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "translated_muscle_groups"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "deleted"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "created_at"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "updated_at"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "volume_input_format"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "custom_exercise_info"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "volume_input_units"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "volume_input_value"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v6

    const/16 v7, 0xc

    aget-object v8, v0, v7

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/c;

    invoke-static {v8}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v8

    const/16 v9, 0xd

    aget-object v10, v0, v9

    invoke-interface {v10}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lwc3/c;

    invoke-static {v10}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v10

    const/16 v11, 0xe

    aget-object v0, v0, v11

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v12

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v13

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v14

    sget-object v15, Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto$$serializer;

    invoke-static {v15}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v15

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v16

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v17

    move/from16 v18, v7

    const/16 v7, 0x17

    new-array v7, v7, [Lwc3/c;

    const/16 v19, 0x0

    aput-object v1, v7, v19

    const/16 v19, 0x1

    aput-object v1, v7, v19

    const/16 v19, 0x2

    aput-object v1, v7, v19

    const/16 v19, 0x3

    aput-object v2, v7, v19

    const/4 v2, 0x4

    aput-object v1, v7, v2

    const/4 v2, 0x5

    aput-object v3, v7, v2

    const/4 v2, 0x6

    aput-object v1, v7, v2

    const/4 v2, 0x7

    aput-object v1, v7, v2

    const/16 v2, 0x8

    aput-object v1, v7, v2

    const/16 v2, 0x9

    aput-object v4, v7, v2

    const/16 v2, 0xa

    aput-object v5, v7, v2

    const/16 v2, 0xb

    aput-object v6, v7, v2

    aput-object v8, v7, v18

    aput-object v10, v7, v9

    aput-object v0, v7, v11

    const/16 v0, 0xf

    aput-object v12, v7, v0

    const/16 v0, 0x10

    aput-object v13, v7, v0

    const/16 v0, 0x11

    aput-object v1, v7, v0

    const/16 v0, 0x12

    aput-object v1, v7, v0

    const/16 v0, 0x13

    aput-object v14, v7, v0

    const/16 v0, 0x14

    aput-object v15, v7, v0

    const/16 v0, 0x15

    aput-object v16, v7, v0

    const/16 v0, 0x16

    aput-object v17, v7, v0

    return-object v7
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;
    .locals 73

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v12, 0xa

    const/16 v13, 0x9

    const/4 v14, 0x7

    const/4 v15, 0x6

    const/4 v4, 0x5

    const/4 v5, 0x3

    const/16 v7, 0x8

    const/4 v8, 0x4

    const/4 v9, 0x2

    const/16 v22, 0xe

    const/16 v23, 0xd

    const/4 v10, 0x1

    const/16 v24, 0xc

    const/4 v6, 0x0

    const/4 v11, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v5

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v8

    sget-object v10, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v4, v10, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v1, v13, v10, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-interface {v0, v1, v12, v10, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    move-object/from16 v26, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v10, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    aget-object v25, v26, v24

    invoke-interface/range {v25 .. v25}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v25

    move-object/from16 v27, v2

    move-object/from16 v2, v25

    check-cast v2, Lwc3/b;

    move-object/from16 v25, v3

    move/from16 v3, v24

    invoke-interface {v0, v1, v3, v2, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    aget-object v3, v26, v23

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move-object/from16 v24, v2

    move/from16 v2, v23

    invoke-interface {v0, v1, v2, v3, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    aget-object v3, v26, v22

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move-object/from16 v23, v2

    move/from16 v2, v22

    invoke-interface {v0, v1, v2, v3, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/16 v3, 0xf

    invoke-interface {v0, v1, v3, v10, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v21, v2

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    move-object/from16 v22, v3

    const/16 v3, 0x10

    invoke-interface {v0, v1, v3, v2, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    const/16 v3, 0x11

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v19, v2

    const/16 v2, 0x12

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v18, v2

    const/16 v2, 0x13

    invoke-interface {v0, v1, v2, v10, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v17, v2

    sget-object v2, Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto$$serializer;

    move-object/from16 v20, v3

    const/16 v3, 0x14

    invoke-interface {v0, v1, v3, v2, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    const/16 v3, 0x15

    invoke-interface {v0, v1, v3, v10, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v16, v2

    const/16 v2, 0x16

    invoke-interface {v0, v1, v2, v10, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const v10, 0x7fffff

    move-object/from16 v71, v2

    move-object/from16 v70, v3

    move-object/from16 v54, v4

    move/from16 v52, v5

    move-object/from16 v50, v6

    move-object/from16 v57, v7

    move-object/from16 v53, v8

    move-object/from16 v51, v9

    move/from16 v48, v10

    move-object/from16 v59, v12

    move-object/from16 v58, v13

    move-object/from16 v56, v14

    move-object/from16 v55, v15

    move-object/from16 v69, v16

    move-object/from16 v68, v17

    move-object/from16 v67, v18

    move-object/from16 v65, v19

    move-object/from16 v66, v20

    move-object/from16 v63, v21

    move-object/from16 v64, v22

    move-object/from16 v62, v23

    move-object/from16 v61, v24

    move-object/from16 v49, v25

    move-object/from16 v60, v27

    goto/16 :goto_7

    :cond_0
    move-object/from16 v26, v2

    move v3, v6

    move/from16 v42, v3

    move/from16 v44, v10

    move-object v2, v11

    move-object v4, v2

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v12, v10

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v27, v15

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v31, v29

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v39, v33

    move-object/from16 v40, v39

    move-object/from16 v43, v40

    :goto_0
    if-eqz v44, :cond_1

    move-object/from16 v45, v6

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v6

    packed-switch v6, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v6}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v46, v10

    const/16 v10, 0x16

    invoke-interface {v0, v1, v10, v6, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v11, v6

    check-cast v11, Ljava/lang/String;

    const/high16 v6, 0x400000

    :goto_1
    or-int/2addr v3, v6

    :goto_2
    move-object/from16 v6, v45

    move-object/from16 v10, v46

    goto :goto_0

    :pswitch_1
    move-object/from16 v46, v10

    const/16 v10, 0x16

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v10, 0x15

    invoke-interface {v0, v1, v10, v6, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/high16 v6, 0x200000

    goto :goto_1

    :pswitch_2
    move-object/from16 v46, v10

    const/16 v10, 0x15

    sget-object v6, Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto$$serializer;

    const/16 v10, 0x14

    invoke-interface {v0, v1, v10, v6, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v12, v6

    check-cast v12, Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    const/high16 v6, 0x100000

    goto :goto_1

    :pswitch_3
    move-object/from16 v46, v10

    const/16 v10, 0x14

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v10, 0x13

    invoke-interface {v0, v1, v10, v6, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v13, v6

    check-cast v13, Ljava/lang/String;

    const/high16 v6, 0x80000

    goto :goto_1

    :pswitch_4
    move-object/from16 v46, v10

    const/16 v6, 0x12

    const/16 v10, 0x13

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v40

    const/high16 v17, 0x40000

    :goto_3
    or-int v3, v3, v17

    goto :goto_2

    :pswitch_5
    move-object/from16 v46, v10

    const/16 v6, 0x11

    const/16 v10, 0x13

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v39

    const/high16 v17, 0x20000

    goto :goto_3

    :pswitch_6
    move-object/from16 v46, v10

    const/16 v10, 0x13

    sget-object v6, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/16 v10, 0x10

    invoke-interface {v0, v1, v10, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/lang/Boolean;

    const/high16 v6, 0x10000

    goto :goto_1

    :pswitch_7
    move-object/from16 v46, v10

    const/16 v10, 0x10

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v10, 0xf

    invoke-interface {v0, v1, v10, v6, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v14, v6

    check-cast v14, Ljava/lang/String;

    const v6, 0x8000

    goto :goto_1

    :pswitch_8
    move-object/from16 v46, v10

    const/16 v6, 0xe

    const/16 v10, 0xf

    aget-object v21, v26, v6

    invoke-interface/range {v21 .. v21}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v10, v21

    check-cast v10, Lwc3/b;

    invoke-interface {v0, v1, v6, v10, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    move-object v15, v10

    check-cast v15, Ljava/util/List;

    or-int/lit16 v3, v3, 0x4000

    goto/16 :goto_2

    :pswitch_9
    move-object/from16 v46, v10

    const/16 v6, 0xe

    const/16 v10, 0xd

    aget-object v21, v26, v10

    invoke-interface/range {v21 .. v21}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v6, v21

    check-cast v6, Lwc3/b;

    invoke-interface {v0, v1, v10, v6, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    or-int/lit16 v3, v3, 0x2000

    goto/16 :goto_2

    :pswitch_a
    move-object/from16 v46, v10

    const/16 v6, 0xc

    const/16 v10, 0xd

    aget-object v21, v26, v6

    invoke-interface/range {v21 .. v21}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v10, v21

    check-cast v10, Lwc3/b;

    invoke-interface {v0, v1, v6, v10, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    or-int/lit16 v3, v3, 0x1000

    goto/16 :goto_2

    :pswitch_b
    move-object/from16 v46, v10

    const/16 v6, 0xc

    sget-object v10, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v6, 0xb

    invoke-interface {v0, v1, v6, v10, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    or-int/lit16 v3, v3, 0x800

    goto/16 :goto_2

    :pswitch_c
    move-object/from16 v46, v10

    const/16 v6, 0xb

    sget-object v10, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v6, 0xa

    invoke-interface {v0, v1, v6, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    or-int/lit16 v3, v3, 0x400

    goto/16 :goto_2

    :pswitch_d
    move-object/from16 v46, v10

    const/16 v6, 0xa

    sget-object v10, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v41, v2

    move-object/from16 v6, v46

    const/16 v2, 0x9

    invoke-interface {v0, v1, v2, v10, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Ljava/lang/String;

    or-int/lit16 v3, v3, 0x200

    :goto_4
    move-object/from16 v2, v41

    move-object/from16 v6, v45

    goto/16 :goto_0

    :pswitch_e
    move-object/from16 v41, v2

    move-object v6, v10

    const/16 v2, 0x9

    const/16 v10, 0x8

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v33

    or-int/lit16 v3, v3, 0x100

    :goto_5
    move-object v10, v6

    goto :goto_4

    :pswitch_f
    move-object/from16 v41, v2

    move-object v6, v10

    const/4 v2, 0x7

    const/16 v10, 0x8

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v32

    or-int/lit16 v3, v3, 0x80

    goto :goto_5

    :pswitch_10
    move-object/from16 v41, v2

    move-object v6, v10

    const/4 v2, 0x6

    const/16 v10, 0x8

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v31

    or-int/lit8 v3, v3, 0x40

    goto :goto_5

    :pswitch_11
    move-object/from16 v41, v2

    move-object v6, v10

    const/16 v10, 0x8

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move/from16 v38, v3

    move-object/from16 v10, v45

    const/4 v3, 0x5

    invoke-interface {v0, v1, v3, v2, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit8 v10, v38, 0x20

    move v3, v10

    move-object v10, v6

    move-object v6, v2

    :goto_6
    move-object/from16 v2, v41

    goto/16 :goto_0

    :pswitch_12
    move-object/from16 v41, v2

    move/from16 v38, v3

    move-object v6, v10

    move-object/from16 v10, v45

    const/4 v2, 0x4

    const/4 v3, 0x5

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v29

    or-int/lit8 v37, v38, 0x10

    move-object v2, v10

    move-object v10, v6

    move-object v6, v2

    move/from16 v3, v37

    goto :goto_6

    :pswitch_13
    move-object/from16 v41, v2

    move/from16 v38, v3

    move-object v6, v10

    move-object/from16 v10, v45

    const/4 v2, 0x3

    const/4 v3, 0x5

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v42

    or-int/lit8 v36, v38, 0x8

    move-object v2, v10

    move-object v10, v6

    move-object v6, v2

    move/from16 v3, v36

    goto :goto_6

    :pswitch_14
    move-object/from16 v41, v2

    move/from16 v38, v3

    move-object v6, v10

    move-object/from16 v10, v45

    const/4 v2, 0x2

    const/4 v3, 0x5

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v28

    or-int/lit8 v35, v38, 0x4

    move-object v2, v10

    move-object v10, v6

    move-object v6, v2

    move/from16 v3, v35

    goto :goto_6

    :pswitch_15
    move-object/from16 v41, v2

    move/from16 v38, v3

    move-object v6, v10

    move-object/from16 v10, v45

    const/4 v2, 0x1

    const/4 v3, 0x5

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v27

    or-int/lit8 v34, v38, 0x2

    move-object v2, v10

    move-object v10, v6

    move-object v6, v2

    move/from16 v3, v34

    goto :goto_6

    :pswitch_16
    move-object/from16 v41, v2

    move/from16 v38, v3

    move-object v6, v10

    move-object/from16 v10, v45

    const/4 v2, 0x0

    const/4 v3, 0x5

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v43

    or-int/lit8 v30, v38, 0x1

    move-object v2, v10

    move-object v10, v6

    move-object v6, v2

    move/from16 v3, v30

    goto :goto_6

    :pswitch_17
    move-object/from16 v41, v2

    move/from16 v38, v3

    move-object v6, v10

    move-object/from16 v10, v45

    const/4 v2, 0x0

    const/4 v3, 0x5

    move-object v3, v10

    move-object v10, v6

    move-object v6, v3

    move/from16 v44, v2

    move/from16 v3, v38

    goto :goto_6

    :cond_1
    move-object/from16 v38, v10

    move-object v10, v6

    move-object/from16 v6, v38

    move-object/from16 v41, v2

    move/from16 v38, v3

    move-object/from16 v62, v4

    move-object/from16 v60, v5

    move-object/from16 v58, v6

    move-object/from16 v65, v7

    move-object/from16 v61, v8

    move-object/from16 v59, v9

    move-object/from16 v54, v10

    move-object/from16 v71, v11

    move-object/from16 v69, v12

    move-object/from16 v68, v13

    move-object/from16 v64, v14

    move-object/from16 v63, v15

    move-object/from16 v50, v27

    move-object/from16 v51, v28

    move-object/from16 v53, v29

    move-object/from16 v55, v31

    move-object/from16 v56, v32

    move-object/from16 v57, v33

    move/from16 v48, v38

    move-object/from16 v66, v39

    move-object/from16 v67, v40

    move-object/from16 v70, v41

    move/from16 v52, v42

    move-object/from16 v49, v43

    :goto_7
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v47, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    const/16 v72, 0x0

    invoke-direct/range {v47 .. v72}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v47

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
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
    invoke-virtual {p0, p1}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->write$Self$weightlifting_release(Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$$serializer;->serialize(Lzc3/e;Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;)V

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
