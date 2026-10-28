.class public final synthetic Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/design/models/items/graph/plane/axis/GraphAxisModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;",
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

.field public static final INSTANCE:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.design.models.items.graph.plane.axis.GraphAxisModel"

    const/4 v3, 0x7

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "type"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "style"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "labels"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "offset"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "axisDescription"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "scrimPresent"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "theme"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/4 v1, 0x7

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/c;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v2

    const/4 v0, 0x3

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    aput-object v2, v1, v0

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/4 v2, 0x4

    aput-object v0, v1, v2

    const/4 v0, 0x5

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    aput-object v2, v1, v0

    sget-object v0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/4 v2, 0x6

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;
    .locals 31

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/4 v4, 0x6

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/4 v7, 0x4

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    if-eqz v3, :cond_0

    aget-object v3, v2, v10

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    invoke-interface {v0, v1, v10, v3, v11}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg61/d;

    aget-object v10, v2, v9

    invoke-interface {v10}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lwc3/b;

    invoke-interface {v0, v1, v9, v10, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg61/c;

    aget-object v2, v2, v8

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-interface {v0, v1, v8, v2, v11}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v12

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v7, v6, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v5

    sget-object v7, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme$$serializer;

    invoke-interface {v0, v1, v4, v7, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;

    const/16 v7, 0x7f

    move-object/from16 v24, v2

    move-object/from16 v22, v3

    move-object/from16 v29, v4

    move/from16 v28, v5

    move-object/from16 v27, v6

    move/from16 v21, v7

    move-object/from16 v23, v9

    move-wide/from16 v25, v12

    goto/16 :goto_3

    :cond_0
    const-wide/16 v12, 0x0

    move/from16 v18, v9

    move/from16 p1, v10

    move/from16 v3, p1

    move-object v14, v11

    move-object v15, v14

    move-wide/from16 v16, v12

    move v11, v3

    move-object v10, v15

    move-object v12, v10

    move-object v13, v12

    :goto_0
    if-eqz v18, :cond_1

    move/from16 v19, v9

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v9

    packed-switch v9, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v9}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v9, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme$$serializer;

    invoke-interface {v0, v1, v4, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;

    or-int/lit8 v11, v11, 0x40

    :goto_1
    move/from16 v9, v19

    goto :goto_0

    :pswitch_1
    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v3

    or-int/lit8 v11, v11, 0x20

    goto :goto_1

    :pswitch_2
    sget-object v9, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v7, v9, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v15, v9

    check-cast v15, Ljava/lang/String;

    or-int/lit8 v11, v11, 0x10

    goto :goto_1

    :pswitch_3
    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeDoubleElement(Lyc3/g;I)D

    move-result-wide v16

    or-int/lit8 v11, v11, 0x8

    goto :goto_1

    :pswitch_4
    aget-object v9, v2, v8

    invoke-interface {v9}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lwc3/b;

    invoke-interface {v0, v1, v8, v9, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v14, v9

    check-cast v14, Ljava/util/List;

    or-int/lit8 v11, v11, 0x4

    goto :goto_1

    :pswitch_5
    aget-object v9, v2, v19

    invoke-interface {v9}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lwc3/b;

    move/from16 v4, v19

    invoke-interface {v0, v1, v4, v9, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v13, v9

    check-cast v13, Lg61/c;

    or-int/lit8 v11, v11, 0x2

    move v9, v4

    const/4 v4, 0x6

    goto :goto_0

    :pswitch_6
    move/from16 v4, v19

    aget-object v9, v2, p1

    invoke-interface {v9}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lwc3/b;

    move/from16 v4, p1

    invoke-interface {v0, v1, v4, v9, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v12, v9

    check-cast v12, Lg61/d;

    or-int/lit8 v11, v11, 0x1

    :goto_2
    const/4 v4, 0x6

    const/4 v9, 0x1

    goto :goto_0

    :pswitch_7
    move/from16 v4, p1

    move/from16 v18, p1

    goto :goto_2

    :cond_1
    move/from16 v28, v3

    move-object/from16 v29, v10

    move/from16 v21, v11

    move-object/from16 v22, v12

    move-object/from16 v23, v13

    move-object/from16 v24, v14

    move-object/from16 v27, v15

    move-wide/from16 v25, v16

    :goto_3
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v20, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    const/16 v30, 0x0

    invoke-direct/range {v20 .. v30}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;-><init>(ILg61/d;Lg61/c;Ljava/util/List;DLjava/lang/String;ZLcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v20

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;)V

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
