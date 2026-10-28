.class public final synthetic Lcom/whoop/design/models/items/NumericInputSliderModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/items/NumericInputSliderModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/design/models/items/NumericInputSliderModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/design/models/items/NumericInputSliderModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/design/models/items/NumericInputSliderModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/design/models/items/NumericInputSliderModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/design/models/items/NumericInputSliderModel;",
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

.field public static final INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/NumericInputSliderModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/design/models/items/NumericInputSliderModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/design/models/items/NumericInputSliderModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/design/models/items/NumericInputSliderModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.design.models.items.NumericInputSliderModel"

    const/16 v3, 0xb

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "upperBound"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "lowerBound"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "stepSize"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "barThickness"

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "barColor"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sliderValue"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "startLabel"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "endLabel"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "picker"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "bindings"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "aggregateBindings"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/design/models/items/NumericInputSliderModel$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/design/models/items/NumericInputSliderModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0xb

    new-array v1, v1, [Lwc3/c;

    sget-object v2, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v3, 0x1

    aput-object v2, v1, v3

    sget-object v3, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/4 v4, 0x2

    aput-object v3, v1, v4

    const/4 v4, 0x3

    aput-object v3, v1, v4

    const/4 v3, 0x4

    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v1, v3

    const/4 v3, 0x5

    aput-object v2, v1, v3

    sget-object v2, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    sget-object v2, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    sget-object v2, Lcom/whoop/design/models/items/MultiWheelPickerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MultiWheelPickerModel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/16 v3, 0x8

    aput-object v2, v1, v3

    const/16 v2, 0x9

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    aput-object v0, v1, v2

    sget-object v0, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v2, 0xa

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/design/models/items/NumericInputSliderModel;
    .locals 37

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/design/models/items/NumericInputSliderModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/design/models/items/NumericInputSliderModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v4, 0xa

    const/4 v5, 0x7

    const/4 v6, 0x6

    const/4 v7, 0x5

    const/4 v8, 0x3

    const/16 v9, 0x8

    const/4 v10, 0x2

    const/16 v11, 0x9

    const/4 v12, 0x4

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v3

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v13

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v10

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v8

    aget-object v14, v2, v12

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/b;

    invoke-interface {v0, v1, v12, v14, v15}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ly81/f;

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v7

    sget-object v14, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel$$serializer;

    invoke-interface {v0, v1, v6, v14, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    sget-object v14, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel$$serializer;

    invoke-interface {v0, v1, v5, v14, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    sget-object v14, Lcom/whoop/design/models/items/MultiWheelPickerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MultiWheelPickerModel$$serializer;

    invoke-interface {v0, v1, v9, v14, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/design/models/items/MultiWheelPickerModel;

    aget-object v2, v2, v11

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-interface {v0, v1, v11, v2, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    sget-object v11, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-interface {v0, v1, v4, v11, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    const/16 v11, 0x7ff

    move-object/from16 v34, v2

    move-object/from16 v35, v4

    move-object/from16 v32, v5

    move-object/from16 v31, v6

    move/from16 v30, v7

    move/from16 v28, v8

    move-object/from16 v33, v9

    move/from16 v27, v10

    move/from16 v24, v11

    move-object/from16 v29, v12

    move/from16 v26, v13

    :goto_0
    move/from16 v25, v3

    goto/16 :goto_4

    :cond_0
    const/4 v3, 0x0

    move/from16 v18, v3

    move/from16 v20, v12

    move/from16 v22, v13

    move/from16 v16, v14

    move/from16 v17, v16

    move-object v6, v15

    move-object v7, v6

    move-object v8, v7

    move-object v10, v8

    move-object v12, v10

    move-object v13, v12

    move/from16 v15, v18

    :goto_1
    if-eqz v22, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v5

    packed-switch v5, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v5}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v5, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-interface {v0, v1, v4, v5, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/util/Map;

    or-int/lit16 v14, v14, 0x400

    :goto_2
    const/4 v5, 0x7

    goto :goto_1

    :pswitch_1
    aget-object v5, v2, v11

    invoke-interface {v5}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwc3/b;

    invoke-interface {v0, v1, v11, v5, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ljava/util/Map;

    or-int/lit16 v14, v14, 0x200

    goto :goto_2

    :pswitch_2
    sget-object v5, Lcom/whoop/design/models/items/MultiWheelPickerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MultiWheelPickerModel$$serializer;

    invoke-interface {v0, v1, v9, v5, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v12, v5

    check-cast v12, Lcom/whoop/design/models/items/MultiWheelPickerModel;

    or-int/lit16 v14, v14, 0x100

    goto :goto_2

    :pswitch_3
    sget-object v5, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel$$serializer;

    const/4 v4, 0x7

    invoke-interface {v0, v1, v4, v5, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    or-int/lit16 v14, v14, 0x80

    move v5, v4

    const/16 v4, 0xa

    goto :goto_1

    :pswitch_4
    const/4 v4, 0x7

    sget-object v5, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel$$serializer;

    const/4 v4, 0x6

    invoke-interface {v0, v1, v4, v5, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    or-int/lit8 v14, v14, 0x40

    :goto_3
    const/16 v4, 0xa

    goto :goto_2

    :pswitch_5
    const/4 v4, 0x6

    const/4 v5, 0x5

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v15

    or-int/lit8 v14, v14, 0x20

    goto :goto_3

    :pswitch_6
    const/4 v4, 0x6

    const/4 v5, 0x5

    aget-object v21, v2, v20

    invoke-interface/range {v21 .. v21}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v4, v21

    check-cast v4, Lwc3/b;

    move/from16 v5, v20

    invoke-interface {v0, v1, v5, v4, v13}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Ly81/f;

    or-int/lit8 v14, v14, 0x10

    goto :goto_3

    :pswitch_7
    move/from16 v5, v20

    const/4 v4, 0x3

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v16

    or-int/lit8 v14, v14, 0x8

    goto :goto_3

    :pswitch_8
    move/from16 v5, v20

    const/4 v4, 0x2

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v17

    or-int/lit8 v14, v14, 0x4

    goto :goto_3

    :pswitch_9
    move/from16 v5, v20

    const/4 v4, 0x1

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v18

    or-int/lit8 v14, v14, 0x2

    goto :goto_3

    :pswitch_a
    move/from16 v5, v20

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v19

    or-int/lit8 v14, v14, 0x1

    move/from16 v3, v19

    goto :goto_3

    :pswitch_b
    const/4 v4, 0x1

    const/16 v19, 0x0

    move/from16 v22, v19

    goto :goto_3

    :cond_1
    move-object/from16 v35, v6

    move-object/from16 v34, v7

    move-object/from16 v32, v8

    move-object/from16 v31, v10

    move-object/from16 v33, v12

    move-object/from16 v29, v13

    move/from16 v24, v14

    move/from16 v30, v15

    move/from16 v28, v16

    move/from16 v27, v17

    move/from16 v26, v18

    goto/16 :goto_0

    :goto_4
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v23, Lcom/whoop/design/models/items/NumericInputSliderModel;

    const/16 v36, 0x0

    invoke-direct/range {v23 .. v36}, Lcom/whoop/design/models/items/NumericInputSliderModel;-><init>(IFFIILy81/f;FLcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;Lcom/whoop/design/models/items/MultiWheelPickerModel;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v23

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/items/NumericInputSliderModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/design/models/items/NumericInputSliderModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/NumericInputSliderModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/design/models/items/NumericInputSliderModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/NumericInputSliderModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->write$Self$design_models_release(Lcom/whoop/design/models/items/NumericInputSliderModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/design/models/items/NumericInputSliderModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/models/items/NumericInputSliderModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/design/models/items/NumericInputSliderModel;)V

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
