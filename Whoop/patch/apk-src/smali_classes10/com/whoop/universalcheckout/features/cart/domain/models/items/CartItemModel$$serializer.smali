.class public final synthetic Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "universal-checkout_release"
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

.field public static final INSTANCE:Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.universalcheckout.features.cart.domain.models.items.CartItemModel"

    const/16 v3, 0xc

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "title"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "subtitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "image"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "stackedImages"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "price"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "strikethroughPrice"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "quantity"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "minQuantity"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "maxQuantity"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "hideQuantity"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "lineItemId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "analyticsLabel"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v2, 0x3

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/16 v4, 0xc

    new-array v4, v4, [Lwc3/c;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v5, 0x2

    aput-object v1, v4, v5

    aput-object v0, v4, v2

    const/4 v0, 0x4

    aput-object v1, v4, v0

    const/4 v0, 0x5

    aput-object v3, v4, v0

    sget-object v0, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/4 v2, 0x6

    aput-object v0, v4, v2

    const/4 v2, 0x7

    aput-object v0, v4, v2

    const/16 v2, 0x8

    aput-object v0, v4, v2

    sget-object v0, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/16 v2, 0x9

    aput-object v0, v4, v2

    const/16 v0, 0xa

    aput-object v1, v4, v0

    const/16 v0, 0xb

    aput-object v1, v4, v0

    return-object v4
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;
    .locals 43

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v5, 0xa

    const/16 v6, 0x9

    const/4 v7, 0x7

    const/4 v8, 0x6

    const/4 v9, 0x5

    const/16 v10, 0x8

    const/4 v11, 0x4

    const/4 v12, 0x2

    const/4 v13, 0x3

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v12

    aget-object v2, v2, v13

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-interface {v0, v1, v13, v2, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v11

    sget-object v13, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v9, v13, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v8

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v7

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v9

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v6

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v5

    const/16 v10, 0xb

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v10

    const/16 v13, 0xfff

    move-object/from16 v33, v2

    move-object/from16 v30, v3

    move-object/from16 v35, v4

    move-object/from16 v40, v5

    move/from16 v39, v6

    move/from16 v37, v7

    move/from16 v36, v8

    move/from16 v38, v9

    move-object/from16 v41, v10

    move-object/from16 v34, v11

    move-object/from16 v32, v12

    move/from16 v29, v13

    move-object/from16 v31, v14

    goto/16 :goto_4

    :cond_0
    const/16 v3, 0xb

    move-object/from16 v16, v4

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v20, v18

    move-object/from16 v21, v20

    move/from16 v26, v14

    move v12, v15

    move/from16 v22, v12

    move/from16 v23, v22

    move/from16 v24, v23

    move/from16 v25, v24

    move-object/from16 v14, v21

    move-object v15, v14

    :goto_0
    if-eqz v26, :cond_1

    move/from16 v27, v13

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v13

    packed-switch v13, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v13}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v21

    or-int/lit16 v12, v12, 0x800

    :goto_1
    move/from16 v13, v27

    goto :goto_0

    :pswitch_1
    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v20

    or-int/lit16 v12, v12, 0x400

    goto :goto_1

    :pswitch_2
    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v22

    or-int/lit16 v12, v12, 0x200

    goto :goto_1

    :pswitch_3
    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v25

    or-int/lit16 v12, v12, 0x100

    goto :goto_1

    :pswitch_4
    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v23

    or-int/lit16 v12, v12, 0x80

    goto :goto_1

    :pswitch_5
    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v24

    or-int/lit8 v12, v12, 0x40

    goto :goto_1

    :pswitch_6
    sget-object v13, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v9, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Ljava/lang/String;

    or-int/lit8 v12, v12, 0x20

    goto :goto_1

    :pswitch_7
    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v18

    or-int/lit8 v12, v12, 0x10

    goto :goto_1

    :pswitch_8
    aget-object v13, v2, v27

    invoke-interface {v13}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lwc3/b;

    move/from16 v3, v27

    invoke-interface {v0, v1, v3, v13, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    move-object v15, v13

    check-cast v15, Ljava/util/List;

    or-int/lit8 v12, v12, 0x8

    :goto_2
    move v13, v3

    const/16 v3, 0xb

    goto :goto_0

    :pswitch_9
    move/from16 v3, v27

    const/4 v13, 0x2

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v17

    or-int/lit8 v12, v12, 0x4

    goto :goto_2

    :pswitch_a
    const/4 v3, 0x1

    const/4 v13, 0x2

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v16

    or-int/lit8 v12, v12, 0x2

    :goto_3
    const/16 v3, 0xb

    const/4 v13, 0x3

    goto :goto_0

    :pswitch_b
    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v13, 0x2

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v19

    or-int/lit8 v12, v12, 0x1

    move-object/from16 v4, v19

    goto :goto_3

    :pswitch_c
    const/4 v3, 0x1

    const/16 v19, 0x0

    move/from16 v26, v19

    goto :goto_3

    :cond_1
    move-object/from16 v30, v4

    move/from16 v29, v12

    move-object/from16 v35, v14

    move-object/from16 v33, v15

    move-object/from16 v31, v16

    move-object/from16 v32, v17

    move-object/from16 v34, v18

    move-object/from16 v40, v20

    move-object/from16 v41, v21

    move/from16 v39, v22

    move/from16 v37, v23

    move/from16 v36, v24

    move/from16 v38, v25

    :goto_4
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v28, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;

    const/16 v42, 0x0

    invoke-direct/range {v28 .. v42}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIIZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v28

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
    invoke-virtual {p0, p1}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->write$Self$universal_checkout_release(Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;)V

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
