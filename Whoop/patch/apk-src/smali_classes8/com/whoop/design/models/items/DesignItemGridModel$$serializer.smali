.class public final synthetic Lcom/whoop/design/models/items/DesignItemGridModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/items/DesignItemGridModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/design/models/items/DesignItemGridModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/design/models/items/DesignItemGridModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/design/models/items/DesignItemGridModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/design/models/items/DesignItemGridModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/design/models/items/DesignItemGridModel;",
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

.field public static final INSTANCE:Lcom/whoop/design/models/items/DesignItemGridModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/DesignItemGridModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/design/models/items/DesignItemGridModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/design/models/items/DesignItemGridModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DesignItemGridModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/design/models/items/DesignItemGridModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.design.models.items.DesignItemGridModel"

    const/16 v3, 0x9

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "id"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "columnWidth"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "minHorizontalSpacing"

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "minVerticalSpacing"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "minHorizontalPadding"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "minVerticalPadding"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "verticalAlignment"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "numberOfColumns"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "items"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/design/models/items/DesignItemGridModel$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/design/models/items/DesignItemGridModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0x9

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    aput-object v3, v1, v2

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const/4 v2, 0x6

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/c;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v2

    sget-object v2, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const/16 v2, 0x8

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/design/models/items/DesignItemGridModel;
    .locals 44

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/design/models/items/DesignItemGridModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/design/models/items/DesignItemGridModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/4 v4, 0x7

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/4 v7, 0x4

    const/4 v8, 0x2

    const/4 v9, 0x6

    const/16 v10, 0x8

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v11

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v14

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v16

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v6

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v18

    aget-object v5, v2, v9

    invoke-interface {v5}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwc3/b;

    invoke-interface {v0, v1, v9, v5, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;

    sget-object v8, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-interface {v0, v1, v4, v8, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    aget-object v2, v2, v10

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-interface {v0, v1, v10, v2, v13}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/16 v8, 0x1ff

    move-object/from16 v42, v2

    move-object/from16 v29, v3

    move-object/from16 v41, v4

    move-object/from16 v40, v5

    move-wide/from16 v36, v6

    move/from16 v28, v8

    move-wide/from16 v30, v11

    move-wide/from16 v32, v14

    move-wide/from16 v34, v16

    move-wide/from16 v38, v18

    goto/16 :goto_3

    :cond_0
    const-wide/16 v14, 0x0

    move/from16 v26, v11

    move v3, v12

    move-object v11, v13

    move-object v12, v11

    move-object/from16 v19, v12

    move-wide/from16 v16, v14

    move-wide/from16 v20, v16

    move-wide/from16 v22, v20

    move-wide/from16 v24, v22

    :goto_0
    if-eqz v26, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v8

    packed-switch v8, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v8}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    aget-object v8, v2, v10

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/b;

    invoke-interface {v0, v1, v10, v8, v11}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, Ljava/util/List;

    or-int/lit16 v3, v3, 0x100

    :goto_1
    const/4 v8, 0x2

    goto :goto_0

    :pswitch_1
    sget-object v8, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-interface {v0, v1, v4, v8, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v12, v8

    check-cast v12, Ljava/lang/Integer;

    or-int/lit16 v3, v3, 0x80

    goto :goto_1

    :pswitch_2
    aget-object v8, v2, v9

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwc3/b;

    invoke-interface {v0, v1, v9, v8, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v13, v8

    check-cast v13, Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;

    or-int/lit8 v3, v3, 0x40

    goto :goto_1

    :pswitch_3
    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v24

    or-int/lit8 v3, v3, 0x20

    goto :goto_1

    :pswitch_4
    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v14

    or-int/lit8 v3, v3, 0x10

    goto :goto_1

    :pswitch_5
    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v22

    or-int/lit8 v3, v3, 0x8

    goto :goto_1

    :pswitch_6
    const/4 v8, 0x2

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v20

    or-int/lit8 v3, v3, 0x4

    goto :goto_0

    :pswitch_7
    const/4 v4, 0x1

    const/4 v8, 0x2

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v16

    or-int/lit8 v3, v3, 0x2

    :goto_2
    const/4 v4, 0x7

    goto :goto_0

    :pswitch_8
    const/4 v4, 0x0

    const/4 v8, 0x2

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v19

    or-int/lit8 v3, v3, 0x1

    goto :goto_2

    :pswitch_9
    const/4 v4, 0x0

    const/4 v8, 0x2

    move/from16 v26, v4

    goto :goto_2

    :cond_1
    move/from16 v28, v3

    move-object/from16 v42, v11

    move-object/from16 v41, v12

    move-object/from16 v40, v13

    move-wide/from16 v36, v14

    move-wide/from16 v30, v16

    move-object/from16 v29, v19

    move-wide/from16 v32, v20

    move-wide/from16 v34, v22

    move-wide/from16 v38, v24

    :goto_3
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v27, Lcom/whoop/design/models/items/DesignItemGridModel;

    const/16 v43, 0x0

    invoke-direct/range {v27 .. v43}, Lcom/whoop/design/models/items/DesignItemGridModel;-><init>(ILjava/lang/String;DDDDDLcom/whoop/design/models/items/DesignItemGridVerticalAlignment;Ljava/lang/Integer;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v27

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/items/DesignItemGridModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/design/models/items/DesignItemGridModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/DesignItemGridModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/design/models/items/DesignItemGridModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/DesignItemGridModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/design/models/items/DesignItemGridModel;->write$Self$design_models_release(Lcom/whoop/design/models/items/DesignItemGridModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/design/models/items/DesignItemGridModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/models/items/DesignItemGridModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/design/models/items/DesignItemGridModel;)V

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
