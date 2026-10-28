.class public final synthetic Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/design/models/items/graph/plot/ProgressPlotModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;",
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

.field public static final INSTANCE:Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.design.models.items.graph.plot.ProgressPlotModel"

    const/16 v3, 0xa

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "style"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "rangeMin"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "rangeMax"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "currentValue"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "showAnnotation"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "height"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "yposition"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "id"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "hideWhileScrubbing"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "skipScrubbing"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0xa

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v2

    sget-object v0, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    const/4 v2, 0x1

    aput-object v0, v1, v2

    const/4 v2, 0x2

    aput-object v0, v1, v2

    const/4 v2, 0x3

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v2

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v3, 0x5

    aput-object v0, v1, v3

    const/4 v3, 0x6

    aput-object v0, v1, v3

    const/4 v0, 0x7

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    aput-object v3, v1, v0

    const/16 v0, 0x8

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v0

    const/16 v0, 0x9

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    aput-object v2, v1, v0

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;
    .locals 44

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/4 v5, 0x7

    const/4 v6, 0x6

    const/4 v7, 0x5

    const/4 v8, 0x3

    const/16 v9, 0x8

    const/4 v10, 0x4

    const/4 v11, 0x2

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    if-eqz v3, :cond_0

    aget-object v2, v2, v13

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-interface {v0, v1, v13, v2, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v12

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v15

    sget-object v3, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-interface {v0, v1, v8, v3, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Double;

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v8

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v10

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v6

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v5

    sget-object v4, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-interface {v0, v1, v9, v4, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    move-object/from16 v17, v2

    const/16 v2, 0x9

    invoke-interface {v0, v1, v2, v4, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    const/16 v4, 0x3ff

    move-object/from16 v42, v2

    move-object/from16 v34, v3

    move-object/from16 v40, v5

    move-wide/from16 v38, v6

    move/from16 v35, v8

    move-object/from16 v41, v9

    move-wide/from16 v36, v10

    move-wide/from16 v30, v12

    move-wide/from16 v32, v15

    move-object/from16 v29, v17

    :goto_0
    move/from16 v28, v4

    goto/16 :goto_6

    :cond_0
    const-wide/16 v3, 0x0

    move-wide/from16 v16, v3

    move-wide/from16 v18, v16

    move-wide/from16 v24, v18

    move/from16 v26, v12

    move/from16 v21, v13

    move-object v11, v14

    move-object v12, v11

    move-object/from16 v20, v12

    move-object/from16 v22, v20

    move-wide/from16 v14, v24

    move/from16 v3, v21

    move v4, v3

    move-object/from16 v13, v22

    :goto_1
    if-eqz v26, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v8

    packed-switch v8, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v8}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v8, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/16 v10, 0x9

    invoke-interface {v0, v1, v10, v8, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, Ljava/lang/Boolean;

    or-int/lit16 v4, v4, 0x200

    :goto_2
    const/4 v8, 0x3

    const/4 v10, 0x4

    goto :goto_1

    :pswitch_1
    const/16 v10, 0x9

    sget-object v8, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-interface {v0, v1, v9, v8, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v12, v8

    check-cast v12, Ljava/lang/Boolean;

    or-int/lit16 v4, v4, 0x100

    goto :goto_2

    :pswitch_2
    const/16 v10, 0x9

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v22

    or-int/lit16 v4, v4, 0x80

    goto :goto_2

    :pswitch_3
    const/16 v10, 0x9

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v14

    or-int/lit8 v4, v4, 0x40

    goto :goto_2

    :pswitch_4
    const/16 v10, 0x9

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v16

    or-int/lit8 v4, v4, 0x20

    goto :goto_2

    :pswitch_5
    move v8, v10

    const/16 v10, 0x9

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v3

    or-int/lit8 v4, v4, 0x10

    move v10, v8

    :goto_3
    const/4 v8, 0x3

    goto :goto_1

    :pswitch_6
    move v8, v10

    const/16 v10, 0x9

    sget-object v5, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    const/4 v6, 0x3

    invoke-interface {v0, v1, v6, v5, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v13, v5

    check-cast v13, Ljava/lang/Double;

    or-int/lit8 v4, v4, 0x8

    :goto_4
    move v10, v8

    const/4 v5, 0x7

    move v8, v6

    const/4 v6, 0x6

    goto :goto_1

    :pswitch_7
    move v8, v10

    const/4 v5, 0x2

    const/4 v6, 0x3

    const/16 v10, 0x9

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v24

    or-int/lit8 v4, v4, 0x4

    goto :goto_4

    :pswitch_8
    move v8, v10

    const/4 v5, 0x1

    const/4 v6, 0x3

    const/16 v10, 0x9

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v18

    or-int/lit8 v4, v4, 0x2

    goto :goto_4

    :pswitch_9
    move v8, v10

    const/4 v5, 0x1

    const/4 v6, 0x3

    const/16 v10, 0x9

    aget-object v23, v2, v21

    invoke-interface/range {v23 .. v23}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v23

    move-object/from16 v5, v23

    check-cast v5, Lwc3/b;

    move-object/from16 v6, v20

    move/from16 v7, v21

    invoke-interface {v0, v1, v7, v5, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    or-int/lit8 v4, v4, 0x1

    move-object/from16 v20, v5

    move v10, v8

    const/4 v5, 0x7

    :goto_5
    const/4 v6, 0x6

    const/4 v7, 0x5

    goto :goto_3

    :pswitch_a
    move v8, v10

    move-object/from16 v6, v20

    move/from16 v7, v21

    move/from16 v26, v21

    goto :goto_5

    :cond_1
    move-object/from16 v6, v20

    move/from16 v35, v3

    move-object/from16 v29, v6

    move-object/from16 v42, v11

    move-object/from16 v41, v12

    move-object/from16 v34, v13

    move-wide/from16 v38, v14

    move-wide/from16 v36, v16

    move-wide/from16 v30, v18

    move-object/from16 v40, v22

    move-wide/from16 v32, v24

    goto/16 :goto_0

    :goto_6
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v27, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;

    const/16 v43, 0x0

    invoke-direct/range {v27 .. v43}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;-><init>(ILcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;DDLjava/lang/Double;ZDDLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v27

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;)V

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
