.class public final synthetic Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "native-store_release"
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

.field public static final INSTANCE:Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel$$serializer;->INSTANCE:Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.nativestore.pdp.domain.model.ProductVariantSelectorModel"

    const/16 v3, 0x9

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "level"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "title"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "type"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "options"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sizeChart"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "selectedOption"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "variantSelectorIndex"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "packItemId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "packItemProductKey"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0x9

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v3, 0x2

    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v1, v3

    const/4 v3, 0x3

    aget-object v0, v0, v3

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v3

    sget-object v0, Lcom/whoop/nativestore/pdp/domain/model/SizeChart$$serializer;->INSTANCE:Lcom/whoop/nativestore/pdp/domain/model/SizeChart$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/4 v3, 0x4

    aput-object v0, v1, v3

    sget-object v0, Lcom/whoop/nativestore/pdp/domain/model/SelectorOption$$serializer;->INSTANCE:Lcom/whoop/nativestore/pdp/domain/model/SelectorOption$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/4 v3, 0x5

    aput-object v0, v1, v3

    const/4 v0, 0x6

    sget-object v3, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    aput-object v3, v1, v0

    const/4 v0, 0x7

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v0

    const/16 v0, 0x8

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    aput-object v2, v1, v0

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;
    .locals 32

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/4 v4, 0x7

    const/4 v5, 0x6

    const/4 v6, 0x5

    const/16 v7, 0x8

    const/4 v8, 0x4

    const/4 v9, 0x3

    const/4 v10, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    if-eqz v3, :cond_0

    aget-object v3, v2, v12

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    invoke-interface {v0, v1, v12, v3, v13}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v11

    aget-object v12, v2, v10

    invoke-interface {v12}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lwc3/b;

    invoke-interface {v0, v1, v10, v12, v13}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    aget-object v2, v2, v9

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-interface {v0, v1, v9, v2, v13}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v9, Lcom/whoop/nativestore/pdp/domain/model/SizeChart$$serializer;->INSTANCE:Lcom/whoop/nativestore/pdp/domain/model/SizeChart$$serializer;

    invoke-interface {v0, v1, v8, v9, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    sget-object v9, Lcom/whoop/nativestore/pdp/domain/model/SelectorOption$$serializer;->INSTANCE:Lcom/whoop/nativestore/pdp/domain/model/SelectorOption$$serializer;

    invoke-interface {v0, v1, v6, v9, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v5

    sget-object v9, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v4, v9, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v0, v1, v7, v9, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const/16 v9, 0x1ff

    move-object/from16 v25, v2

    move-object/from16 v22, v3

    move-object/from16 v29, v4

    move/from16 v28, v5

    move-object/from16 v27, v6

    move-object/from16 v30, v7

    move-object/from16 v26, v8

    move/from16 v21, v9

    move-object/from16 v24, v10

    move-object/from16 v23, v11

    goto/16 :goto_6

    :cond_0
    move/from16 v18, v9

    move/from16 v17, v10

    move/from16 v19, v11

    move/from16 p1, v12

    move/from16 v3, p1

    move-object v6, v13

    move-object v8, v6

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v14, v11

    move-object v15, v14

    move v13, v3

    move-object v12, v15

    :goto_0
    if-eqz v19, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v5

    packed-switch v5, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v5}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v7, v5, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/lang/String;

    or-int/lit16 v13, v13, 0x100

    :goto_1
    const/4 v5, 0x6

    goto :goto_0

    :pswitch_1
    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v4, v5, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Ljava/lang/String;

    or-int/lit16 v13, v13, 0x80

    goto :goto_1

    :pswitch_2
    const/4 v5, 0x6

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v3

    or-int/lit8 v13, v13, 0x40

    goto :goto_0

    :pswitch_3
    const/4 v5, 0x6

    sget-object v4, Lcom/whoop/nativestore/pdp/domain/model/SelectorOption$$serializer;->INSTANCE:Lcom/whoop/nativestore/pdp/domain/model/SelectorOption$$serializer;

    const/4 v5, 0x5

    invoke-interface {v0, v1, v5, v4, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;

    or-int/lit8 v13, v13, 0x20

    :goto_2
    const/4 v4, 0x7

    goto :goto_1

    :pswitch_4
    const/4 v5, 0x5

    sget-object v4, Lcom/whoop/nativestore/pdp/domain/model/SizeChart$$serializer;->INSTANCE:Lcom/whoop/nativestore/pdp/domain/model/SizeChart$$serializer;

    const/4 v5, 0x4

    invoke-interface {v0, v1, v5, v4, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    or-int/lit8 v13, v13, 0x10

    goto :goto_2

    :pswitch_5
    const/4 v5, 0x4

    aget-object v4, v2, v18

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwc3/b;

    move/from16 v5, v18

    invoke-interface {v0, v1, v5, v4, v11}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Ljava/util/List;

    or-int/lit8 v13, v13, 0x8

    goto :goto_2

    :pswitch_6
    move/from16 v5, v18

    aget-object v4, v2, v17

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwc3/b;

    move/from16 v5, v17

    invoke-interface {v0, v1, v5, v4, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    or-int/lit8 v13, v13, 0x4

    :goto_3
    const/4 v4, 0x7

    const/4 v5, 0x6

    :goto_4
    const/16 v18, 0x3

    goto :goto_0

    :pswitch_7
    move/from16 v5, v17

    const/4 v4, 0x1

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v15

    or-int/lit8 v13, v13, 0x2

    goto :goto_3

    :pswitch_8
    move/from16 v5, v17

    const/4 v4, 0x1

    aget-object v16, v2, p1

    invoke-interface/range {v16 .. v16}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v4, v16

    check-cast v4, Lwc3/b;

    move/from16 v5, p1

    invoke-interface {v0, v1, v5, v4, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v14, v4

    check-cast v14, Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    or-int/lit8 v13, v13, 0x1

    const/4 v4, 0x7

    :goto_5
    const/4 v5, 0x6

    const/16 v17, 0x2

    goto :goto_4

    :pswitch_9
    move/from16 v5, p1

    move/from16 v19, p1

    goto :goto_5

    :cond_1
    move/from16 v28, v3

    move-object/from16 v30, v6

    move-object/from16 v29, v8

    move-object/from16 v27, v9

    move-object/from16 v26, v10

    move-object/from16 v25, v11

    move-object/from16 v24, v12

    move/from16 v21, v13

    move-object/from16 v22, v14

    move-object/from16 v23, v15

    :goto_6
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v20, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;

    const/16 v31, 0x0

    invoke-direct/range {v20 .. v31}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;-><init>(ILcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v20

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
    invoke-virtual {p0, p1}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->write$Self$native_store_release(Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;)V

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
