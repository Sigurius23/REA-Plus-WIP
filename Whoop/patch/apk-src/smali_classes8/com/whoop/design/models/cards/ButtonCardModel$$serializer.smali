.class public final synthetic Lcom/whoop/design/models/cards/ButtonCardModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/cards/ButtonCardModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/design/models/cards/ButtonCardModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/design/models/cards/ButtonCardModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/design/models/cards/ButtonCardModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/design/models/cards/ButtonCardModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/design/models/cards/ButtonCardModel;",
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

.field public static final INSTANCE:Lcom/whoop/design/models/cards/ButtonCardModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/cards/ButtonCardModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/design/models/cards/ButtonCardModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/design/models/cards/ButtonCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/cards/ButtonCardModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/design/models/cards/ButtonCardModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.design.models.cards.ButtonCardModel"

    const/16 v3, 0x10

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "id"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "title"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "body"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "imageUrl"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "imageUrlAlignment"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "imageSize"

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "button"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "tag"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "items"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "expandedItems"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "isExpanded"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "dismissIcon"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "dismissAction"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "style"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "price"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "titleColor"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/design/models/cards/ButtonCardModel$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/design/models/cards/ButtonCardModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0x10

    new-array v1, v1, [Lwc3/c;

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v3, 0x3

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/4 v3, 0x4

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    sget-object v3, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/4 v4, 0x5

    aput-object v3, v1, v4

    sget-object v3, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/4 v4, 0x6

    aput-object v3, v1, v4

    sget-object v3, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/4 v4, 0x7

    aput-object v3, v1, v4

    const/16 v3, 0x8

    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwc3/c;

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0x9

    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwc3/c;

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    sget-object v3, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/16 v4, 0xa

    aput-object v3, v1, v4

    const/16 v3, 0xb

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    aput-object v2, v1, v3

    const/16 v2, 0xc

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/c;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0xd

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    sget-object v2, Lcom/whoop/design/models/cards/ButtonCardPriceModel$$serializer;->INSTANCE:Lcom/whoop/design/models/cards/ButtonCardPriceModel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/16 v3, 0xe

    aput-object v2, v1, v3

    const/16 v2, 0xf

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/design/models/cards/ButtonCardModel;
    .locals 49

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/design/models/cards/ButtonCardModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/design/models/cards/ButtonCardModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/4 v7, 0x7

    const/4 v8, 0x6

    const/4 v9, 0x5

    const/4 v10, 0x3

    const/4 v11, 0x4

    const/4 v12, 0x2

    const/16 p1, 0xf

    const/16 v13, 0x9

    const/16 v4, 0x8

    const/16 v17, 0xd

    const/4 v14, 0x1

    const/16 v18, 0xc

    const/4 v15, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v12

    sget-object v15, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v10, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v0, v1, v11, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    sget-object v6, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-interface {v0, v1, v9, v6, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    sget-object v9, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    invoke-interface {v0, v1, v8, v9, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/design/models/items/CardButtonModel;

    sget-object v9, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    invoke-interface {v0, v1, v7, v9, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/design/models/items/TagModel;

    aget-object v9, v2, v4

    invoke-interface {v9}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lwc3/b;

    invoke-interface {v0, v1, v4, v9, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    aget-object v9, v2, v13

    invoke-interface {v9}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lwc3/b;

    invoke-interface {v0, v1, v13, v9, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    sget-object v13, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    move-object/from16 v20, v2

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2, v13, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    const/16 v13, 0xb

    invoke-interface {v0, v1, v13, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    aget-object v15, v20, v18

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v19, v2

    move/from16 v2, v18

    invoke-interface {v0, v1, v2, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/whoopaction/domain/models/Action;

    aget-object v15, v20, v17

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v18, v2

    move/from16 v2, v17

    invoke-interface {v0, v1, v2, v15, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    sget-object v15, Lcom/whoop/design/models/cards/ButtonCardPriceModel$$serializer;->INSTANCE:Lcom/whoop/design/models/cards/ButtonCardPriceModel$$serializer;

    move-object/from16 v17, v2

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/cards/ButtonCardPriceModel;

    aget-object v15, v20, p1

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v16, v14

    move/from16 v14, p1

    invoke-interface {v0, v1, v14, v15, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly81/f;

    const v14, 0xffff

    move-object/from16 v46, v2

    move-object/from16 v32, v3

    move-object/from16 v40, v4

    move-object/from16 v47, v5

    move-object/from16 v37, v6

    move-object/from16 v39, v7

    move-object/from16 v38, v8

    move-object/from16 v41, v9

    move-object/from16 v35, v10

    move-object/from16 v36, v11

    move-object/from16 v34, v12

    move-object/from16 v43, v13

    move/from16 v31, v14

    move-object/from16 v33, v16

    move-object/from16 v45, v17

    move-object/from16 v44, v18

    move-object/from16 v42, v19

    goto/16 :goto_6

    :cond_0
    move-object/from16 v20, v2

    move v2, v14

    move/from16 v14, p1

    move/from16 v28, v2

    move/from16 v22, v4

    move-object v2, v5

    move-object v3, v2

    move-object v4, v3

    move-object v6, v4

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object/from16 v24, v12

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move/from16 v23, v13

    move/from16 v27, v15

    move-object/from16 v13, v26

    move-object v15, v13

    :goto_0
    if-eqz v28, :cond_1

    move/from16 v29, v14

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v14

    packed-switch v14, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v14}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    aget-object v14, v20, v29

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/b;

    move-object/from16 v30, v5

    move/from16 v5, v29

    invoke-interface {v0, v1, v5, v14, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly81/f;

    const v14, 0x8000

    move/from16 v5, v27

    or-int v27, v5, v14

    :goto_1
    move-object/from16 v5, v30

    const/16 v14, 0xf

    goto :goto_0

    :pswitch_1
    move-object/from16 v30, v5

    move/from16 v5, v27

    sget-object v14, Lcom/whoop/design/models/cards/ButtonCardPriceModel$$serializer;->INSTANCE:Lcom/whoop/design/models/cards/ButtonCardPriceModel$$serializer;

    move-object/from16 v27, v3

    move-object/from16 v16, v6

    move-object/from16 v3, v25

    const/16 v6, 0xe

    invoke-interface {v0, v1, v6, v14, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v25, v3

    check-cast v25, Lcom/whoop/design/models/cards/ButtonCardPriceModel;

    or-int/lit16 v3, v5, 0x4000

    move-object/from16 v5, v27

    move/from16 v27, v3

    move-object v3, v5

    move-object/from16 v6, v16

    goto :goto_1

    :pswitch_2
    move-object/from16 v30, v5

    move-object/from16 v16, v6

    move/from16 v5, v27

    const/16 v6, 0xe

    const/16 v14, 0xd

    move-object/from16 v27, v3

    move-object/from16 v3, v25

    aget-object v17, v20, v14

    invoke-interface/range {v17 .. v17}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v6, v17

    check-cast v6, Lwc3/b;

    move-object/from16 v17, v3

    move-object/from16 v3, v24

    invoke-interface {v0, v1, v14, v6, v3}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v24, v3

    check-cast v24, Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    or-int/lit16 v3, v5, 0x2000

    move-object/from16 v5, v27

    move/from16 v27, v3

    move-object v3, v5

    move-object/from16 v6, v16

    move-object/from16 v25, v17

    goto :goto_1

    :pswitch_3
    move-object/from16 v30, v5

    move-object/from16 v16, v6

    move-object/from16 v17, v25

    move/from16 v5, v27

    const/16 v6, 0xc

    const/16 v14, 0xd

    move-object/from16 v27, v3

    move-object/from16 v3, v24

    aget-object v18, v20, v6

    invoke-interface/range {v18 .. v18}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v14, v18

    check-cast v14, Lwc3/b;

    invoke-interface {v0, v1, v6, v14, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/whoopaction/domain/models/Action;

    or-int/lit16 v5, v5, 0x1000

    :goto_2
    move-object/from16 v6, v16

    move-object/from16 v3, v27

    const/16 v14, 0xf

    :goto_3
    move/from16 v27, v5

    move-object/from16 v5, v30

    goto/16 :goto_0

    :pswitch_4
    move-object/from16 v30, v5

    move-object/from16 v16, v6

    move-object/from16 v17, v25

    move/from16 v5, v27

    const/16 v6, 0xc

    move-object/from16 v27, v3

    move-object/from16 v3, v24

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v6, 0xb

    invoke-interface {v0, v1, v6, v14, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    or-int/lit16 v5, v5, 0x800

    goto :goto_2

    :pswitch_5
    move-object/from16 v30, v5

    move-object/from16 v16, v6

    move-object/from16 v17, v25

    move/from16 v5, v27

    const/16 v6, 0xb

    move-object/from16 v27, v3

    move-object/from16 v3, v24

    sget-object v14, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/16 v6, 0xa

    invoke-interface {v0, v1, v6, v14, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    or-int/lit16 v5, v5, 0x400

    goto :goto_2

    :pswitch_6
    move-object/from16 v30, v5

    move-object/from16 v16, v6

    move-object/from16 v17, v25

    move/from16 v5, v27

    const/16 v6, 0xa

    move-object/from16 v27, v3

    move-object/from16 v3, v24

    aget-object v14, v20, v23

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/b;

    move/from16 v6, v23

    invoke-interface {v0, v1, v6, v14, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    or-int/lit16 v5, v5, 0x200

    goto :goto_2

    :pswitch_7
    move-object/from16 v30, v5

    move-object/from16 v16, v6

    move/from16 v6, v23

    move-object/from16 v17, v25

    move/from16 v5, v27

    move-object/from16 v27, v3

    move-object/from16 v3, v24

    aget-object v14, v20, v22

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/b;

    move/from16 v6, v22

    invoke-interface {v0, v1, v6, v14, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    or-int/lit16 v5, v5, 0x100

    move-object/from16 v6, v16

    move-object/from16 v3, v27

    const/16 v14, 0xf

    :goto_4
    const/16 v23, 0x9

    goto/16 :goto_3

    :pswitch_8
    move-object/from16 v30, v5

    move-object/from16 v16, v6

    move/from16 v6, v22

    move-object/from16 v17, v25

    move/from16 v5, v27

    move-object/from16 v27, v3

    move-object/from16 v3, v24

    sget-object v14, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    const/4 v6, 0x7

    invoke-interface {v0, v1, v6, v14, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/design/models/items/TagModel;

    or-int/lit16 v5, v5, 0x80

    :goto_5
    move-object/from16 v6, v16

    move-object/from16 v3, v27

    const/16 v14, 0xf

    const/16 v22, 0x8

    goto :goto_4

    :pswitch_9
    move-object/from16 v30, v5

    move-object/from16 v16, v6

    move-object/from16 v17, v25

    move/from16 v5, v27

    const/4 v6, 0x7

    move-object/from16 v27, v3

    move-object/from16 v3, v24

    sget-object v14, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    const/4 v6, 0x6

    invoke-interface {v0, v1, v6, v14, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/design/models/items/CardButtonModel;

    or-int/lit8 v5, v5, 0x40

    goto :goto_5

    :pswitch_a
    move-object/from16 v30, v5

    move-object/from16 v16, v6

    move-object/from16 v17, v25

    move/from16 v5, v27

    const/4 v6, 0x6

    move-object/from16 v27, v3

    move-object/from16 v3, v24

    sget-object v14, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/4 v6, 0x5

    invoke-interface {v0, v1, v6, v14, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    or-int/lit8 v5, v5, 0x20

    goto :goto_5

    :pswitch_b
    move-object/from16 v30, v5

    move-object/from16 v16, v6

    move-object/from16 v17, v25

    move/from16 v5, v27

    const/4 v6, 0x5

    move-object/from16 v27, v3

    move-object/from16 v3, v24

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v6, 0x4

    invoke-interface {v0, v1, v6, v14, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit8 v5, v5, 0x10

    goto :goto_5

    :pswitch_c
    move-object/from16 v30, v5

    move-object/from16 v16, v6

    move-object/from16 v17, v25

    move/from16 v5, v27

    const/4 v6, 0x4

    move-object/from16 v27, v3

    move-object/from16 v3, v24

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v6, 0x3

    invoke-interface {v0, v1, v6, v14, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Ljava/lang/String;

    or-int/lit8 v5, v5, 0x8

    goto :goto_5

    :pswitch_d
    move-object/from16 v30, v5

    move-object/from16 v17, v25

    move/from16 v5, v27

    const/4 v6, 0x3

    const/4 v14, 0x2

    move-object/from16 v27, v3

    move-object/from16 v3, v24

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v16

    or-int/lit8 v5, v5, 0x4

    goto/16 :goto_5

    :pswitch_e
    move-object/from16 v30, v5

    move-object/from16 v16, v6

    move-object/from16 v17, v25

    move/from16 v5, v27

    const/4 v6, 0x1

    const/4 v14, 0x2

    move-object/from16 v27, v3

    move-object/from16 v3, v24

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v26

    or-int/lit8 v5, v5, 0x2

    goto/16 :goto_5

    :pswitch_f
    move-object/from16 v16, v6

    move-object/from16 v17, v25

    move/from16 v5, v27

    const/4 v6, 0x0

    const/4 v14, 0x2

    move-object/from16 v27, v3

    move-object/from16 v3, v24

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v21

    or-int/lit8 v5, v5, 0x1

    move-object/from16 v6, v16

    move-object/from16 v3, v27

    const/16 v14, 0xf

    const/16 v22, 0x8

    const/16 v23, 0x9

    move/from16 v27, v5

    move-object/from16 v5, v21

    goto/16 :goto_0

    :pswitch_10
    move-object/from16 v30, v5

    move-object/from16 v16, v6

    move-object/from16 v17, v25

    move/from16 v5, v27

    const/4 v6, 0x0

    move-object/from16 v27, v3

    move-object/from16 v3, v24

    move/from16 v28, v6

    goto/16 :goto_5

    :cond_1
    move-object/from16 v30, v5

    move-object/from16 v16, v6

    move-object/from16 v17, v25

    move/from16 v5, v27

    move-object/from16 v27, v3

    move-object/from16 v3, v24

    move-object/from16 v36, v2

    move-object/from16 v45, v3

    move-object/from16 v43, v4

    move/from16 v31, v5

    move-object/from16 v42, v7

    move-object/from16 v41, v8

    move-object/from16 v40, v9

    move-object/from16 v38, v10

    move-object/from16 v39, v11

    move-object/from16 v37, v12

    move-object/from16 v44, v13

    move-object/from16 v35, v15

    move-object/from16 v34, v16

    move-object/from16 v46, v17

    move-object/from16 v33, v26

    move-object/from16 v47, v27

    move-object/from16 v32, v30

    :goto_6
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v30, Lcom/whoop/design/models/cards/ButtonCardModel;

    const/16 v48, 0x0

    invoke-direct/range {v30 .. v48}, Lcom/whoop/design/models/cards/ButtonCardModel;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/TagModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;Lcom/whoop/design/models/cards/ButtonCardPriceModel;Ly81/f;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v30

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/cards/ButtonCardModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/design/models/cards/ButtonCardModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/cards/ButtonCardModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/design/models/cards/ButtonCardModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/design/models/cards/ButtonCardModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/design/models/cards/ButtonCardModel;->write$Self$design_models_release(Lcom/whoop/design/models/cards/ButtonCardModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/design/models/cards/ButtonCardModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/models/cards/ButtonCardModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/design/models/cards/ButtonCardModel;)V

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
