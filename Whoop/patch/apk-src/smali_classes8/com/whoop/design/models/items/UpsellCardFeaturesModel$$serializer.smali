.class public final synthetic Lcom/whoop/design/models/items/UpsellCardFeaturesModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/items/UpsellCardFeaturesModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/design/models/items/UpsellCardFeaturesModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/design/models/items/UpsellCardFeaturesModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/design/models/items/UpsellCardFeaturesModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/design/models/items/UpsellCardFeaturesModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/design/models/items/UpsellCardFeaturesModel;",
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

.field public static final INSTANCE:Lcom/whoop/design/models/items/UpsellCardFeaturesModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/design/models/items/UpsellCardFeaturesModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/UpsellCardFeaturesModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.design.models.items.UpsellCardFeaturesModel"

    const/16 v3, 0x13

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "id"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "endIcon"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "titleImage"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "header"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "title"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "titleTypography"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "tierImage"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "style"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "category"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "trackingValue"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "cardButton"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "secondCardButton"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "featureList"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "descriptionCard"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "items"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sectionTopPadding"

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sectionBottomPadding"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "interItemPadding"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "badge"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v6

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v7

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v8

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v9

    sget-object v10, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    invoke-static {v10}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v11

    invoke-static {v10}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v10

    sget-object v12, Lcom/whoop/design/models/items/FeatureListModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/FeatureListModel$$serializer;

    invoke-static {v12}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v12

    sget-object v13, Lcom/whoop/design/models/items/DescriptionCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DescriptionCardModel$$serializer;

    invoke-static {v13}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v13

    const/16 v14, 0xe

    aget-object v0, v0, v14

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    sget-object v15, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    invoke-static {v15}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v15

    move/from16 v16, v14

    const/16 v14, 0x13

    new-array v14, v14, [Lwc3/c;

    const/16 v17, 0x0

    aput-object v2, v14, v17

    const/4 v2, 0x1

    aput-object v3, v14, v2

    const/4 v2, 0x2

    aput-object v1, v14, v2

    const/4 v2, 0x3

    aput-object v4, v14, v2

    const/4 v2, 0x4

    aput-object v5, v14, v2

    const/4 v2, 0x5

    aput-object v6, v14, v2

    const/4 v2, 0x6

    aput-object v7, v14, v2

    const/4 v2, 0x7

    aput-object v1, v14, v2

    const/16 v1, 0x8

    aput-object v8, v14, v1

    const/16 v1, 0x9

    aput-object v9, v14, v1

    const/16 v1, 0xa

    aput-object v11, v14, v1

    const/16 v1, 0xb

    aput-object v10, v14, v1

    const/16 v1, 0xc

    aput-object v12, v14, v1

    const/16 v1, 0xd

    aput-object v13, v14, v1

    aput-object v0, v14, v16

    sget-object v0, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    const/16 v1, 0xf

    aput-object v0, v14, v1

    const/16 v1, 0x10

    aput-object v0, v14, v1

    const/16 v1, 0x11

    aput-object v0, v14, v1

    const/16 v0, 0x12

    aput-object v15, v14, v0

    return-object v14
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/design/models/items/UpsellCardFeaturesModel;
    .locals 58

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v10, 0xa

    const/16 v11, 0x9

    const/4 v12, 0x7

    const/4 v13, 0x6

    const/4 v14, 0x5

    const/4 v15, 0x3

    const/16 v5, 0x8

    const/4 v4, 0x4

    const/4 v6, 0x2

    const/16 v20, 0xe

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v3, :cond_0

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v8, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v0, v1, v7, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v1, v15, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-interface {v0, v1, v4, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v0, v1, v14, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-interface {v0, v1, v13, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v0, v1, v5, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v0, v1, v11, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sget-object v11, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    invoke-interface {v0, v1, v10, v11, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/design/models/items/CardButtonModel;

    move-object/from16 v23, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v11, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/CardButtonModel;

    sget-object v11, Lcom/whoop/design/models/items/FeatureListModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/FeatureListModel$$serializer;

    move-object/from16 v22, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v11, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/FeatureListModel;

    sget-object v11, Lcom/whoop/design/models/items/DescriptionCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DescriptionCardModel$$serializer;

    move-object/from16 v21, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v11, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/DescriptionCardModel;

    aget-object v11, v23, v20

    invoke-interface {v11}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lwc3/b;

    move-object/from16 v19, v2

    move/from16 v2, v20

    invoke-interface {v0, v1, v2, v11, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/16 v11, 0xf

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v11

    const/16 v9, 0x10

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v9

    move-object/from16 v17, v2

    const/16 v2, 0x11

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v2

    move/from16 v16, v2

    sget-object v2, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    move-object/from16 v18, v3

    move-object/from16 p1, v8

    const/16 v3, 0x12

    const/4 v8, 0x0

    invoke-interface {v0, v1, v3, v2, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/TagModel;

    const v3, 0x7ffff

    move-object/from16 v38, p1

    move-object/from16 v56, v2

    move/from16 v37, v3

    move-object/from16 v42, v4

    move-object/from16 v46, v5

    move-object/from16 v40, v6

    move-object/from16 v39, v7

    move/from16 v54, v9

    move-object/from16 v48, v10

    move/from16 v53, v11

    move-object/from16 v45, v12

    move-object/from16 v44, v13

    move-object/from16 v43, v14

    move-object/from16 v41, v15

    move/from16 v55, v16

    move-object/from16 v52, v17

    move-object/from16 v47, v18

    move-object/from16 v51, v19

    move-object/from16 v50, v21

    move-object/from16 v49, v22

    goto/16 :goto_5

    :cond_0
    move-object/from16 v23, v2

    move v2, v8

    move-object v8, v9

    const/4 v3, 0x0

    move/from16 v29, v3

    move/from16 v30, v29

    move/from16 v32, v30

    move/from16 v33, v7

    move-object v3, v8

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v9, v7

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v25, v15

    move-object/from16 v28, v25

    move-object/from16 v31, v28

    move v8, v2

    move-object/from16 v2, v31

    :goto_0
    if-eqz v33, :cond_1

    move-object/from16 v34, v2

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v2}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v2, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    move-object/from16 v35, v7

    const/16 v7, 0x12

    invoke-interface {v0, v1, v7, v2, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lcom/whoop/design/models/items/TagModel;

    const/high16 v2, 0x40000

    or-int/2addr v8, v2

    :goto_1
    move-object/from16 v2, v34

    move-object/from16 v7, v35

    goto :goto_0

    :pswitch_1
    move-object/from16 v35, v7

    const/16 v2, 0x11

    const/16 v7, 0x12

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v29

    const/high16 v16, 0x20000

    or-int v8, v8, v16

    goto :goto_1

    :pswitch_2
    move-object/from16 v35, v7

    const/16 v2, 0x10

    const/16 v7, 0x12

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v30

    const/high16 v17, 0x10000

    or-int v8, v8, v17

    goto :goto_1

    :pswitch_3
    move-object/from16 v35, v7

    const/16 v2, 0xf

    const/16 v7, 0x12

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeFloatElement(Lyc3/g;I)F

    move-result v32

    const v18, 0x8000

    or-int v8, v8, v18

    goto :goto_1

    :pswitch_4
    move-object/from16 v35, v7

    const/16 v2, 0xe

    const/16 v7, 0x12

    aget-object v20, v23, v2

    invoke-interface/range {v20 .. v20}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v7, v20

    check-cast v7, Lwc3/b;

    invoke-interface {v0, v1, v2, v7, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    or-int/lit16 v8, v8, 0x4000

    goto :goto_1

    :pswitch_5
    move-object/from16 v35, v7

    const/16 v2, 0xe

    sget-object v7, Lcom/whoop/design/models/items/DescriptionCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DescriptionCardModel$$serializer;

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v7, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v10, v7

    check-cast v10, Lcom/whoop/design/models/items/DescriptionCardModel;

    or-int/lit16 v8, v8, 0x2000

    goto :goto_1

    :pswitch_6
    move-object/from16 v35, v7

    const/16 v2, 0xd

    sget-object v7, Lcom/whoop/design/models/items/FeatureListModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/FeatureListModel$$serializer;

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v7, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v11, v7

    check-cast v11, Lcom/whoop/design/models/items/FeatureListModel;

    or-int/lit16 v8, v8, 0x1000

    goto :goto_1

    :pswitch_7
    move-object/from16 v35, v7

    const/16 v2, 0xc

    sget-object v7, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v7, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/CardButtonModel;

    or-int/lit16 v8, v8, 0x800

    goto/16 :goto_1

    :pswitch_8
    move-object/from16 v35, v7

    const/16 v2, 0xb

    sget-object v7, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2, v7, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v12, v7

    check-cast v12, Lcom/whoop/design/models/items/CardButtonModel;

    or-int/lit16 v8, v8, 0x400

    goto/16 :goto_1

    :pswitch_9
    move-object/from16 v35, v7

    const/16 v2, 0xa

    sget-object v7, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v2, 0x9

    invoke-interface {v0, v1, v2, v7, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v13, v7

    check-cast v13, Ljava/lang/String;

    or-int/lit16 v8, v8, 0x200

    goto/16 :goto_1

    :pswitch_a
    move-object/from16 v35, v7

    const/16 v2, 0x9

    sget-object v7, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v2, 0x8

    invoke-interface {v0, v1, v2, v7, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v14, v7

    check-cast v14, Ljava/lang/String;

    or-int/lit16 v8, v8, 0x100

    goto/16 :goto_1

    :pswitch_b
    move-object/from16 v35, v7

    const/16 v2, 0x8

    const/4 v7, 0x7

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v28

    or-int/lit16 v8, v8, 0x80

    goto/16 :goto_1

    :pswitch_c
    move-object/from16 v35, v7

    const/4 v7, 0x7

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v7, 0x6

    invoke-interface {v0, v1, v7, v2, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    or-int/lit8 v8, v8, 0x40

    goto/16 :goto_1

    :pswitch_d
    move-object/from16 v35, v7

    const/4 v7, 0x6

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v7, 0x5

    invoke-interface {v0, v1, v7, v2, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Ljava/lang/String;

    or-int/lit8 v8, v8, 0x20

    goto/16 :goto_1

    :pswitch_e
    move-object/from16 v35, v7

    const/4 v7, 0x5

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v7, 0x4

    invoke-interface {v0, v1, v7, v2, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/lang/String;

    or-int/lit8 v8, v8, 0x10

    goto/16 :goto_1

    :pswitch_f
    move-object/from16 v35, v7

    const/4 v7, 0x4

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v27, v3

    move-object/from16 v7, v35

    const/4 v3, 0x3

    invoke-interface {v0, v1, v3, v2, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    or-int/lit8 v8, v8, 0x8

    :goto_2
    move-object/from16 v3, v27

    move-object/from16 v2, v34

    goto/16 :goto_0

    :pswitch_10
    move-object/from16 v27, v3

    const/4 v2, 0x2

    const/4 v3, 0x3

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v25

    or-int/lit8 v8, v8, 0x4

    goto :goto_2

    :pswitch_11
    move-object/from16 v27, v3

    const/4 v3, 0x3

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v26, v4

    move-object/from16 v3, v34

    const/4 v4, 0x1

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit8 v8, v8, 0x2

    :goto_3
    move-object/from16 v4, v26

    move-object/from16 v3, v27

    goto/16 :goto_0

    :pswitch_12
    move-object/from16 v27, v3

    move-object/from16 v26, v4

    move-object/from16 v3, v34

    const/4 v4, 0x1

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v24, v3

    move-object/from16 v4, v31

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v31, v2

    check-cast v31, Ljava/lang/String;

    or-int/lit8 v8, v8, 0x1

    :goto_4
    move-object/from16 v2, v24

    goto :goto_3

    :pswitch_13
    move-object/from16 v27, v3

    move-object/from16 v26, v4

    move-object/from16 v4, v31

    move-object/from16 v24, v34

    const/4 v3, 0x0

    move/from16 v33, v3

    goto :goto_4

    :cond_1
    move-object/from16 v24, v2

    move-object/from16 v27, v3

    move-object/from16 v26, v4

    move-object/from16 v4, v31

    move-object/from16 v38, v4

    move-object/from16 v49, v5

    move-object/from16 v42, v6

    move-object/from16 v41, v7

    move/from16 v37, v8

    move-object/from16 v56, v9

    move-object/from16 v51, v10

    move-object/from16 v50, v11

    move-object/from16 v48, v12

    move-object/from16 v47, v13

    move-object/from16 v46, v14

    move-object/from16 v43, v15

    move-object/from16 v39, v24

    move-object/from16 v40, v25

    move-object/from16 v44, v26

    move-object/from16 v52, v27

    move-object/from16 v45, v28

    move/from16 v55, v29

    move/from16 v54, v30

    move/from16 v53, v32

    :goto_5
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v36, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;

    const/16 v57, 0x0

    invoke-direct/range {v36 .. v57}, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/DescriptionCardModel;Ljava/util/List;FFFLcom/whoop/design/models/items/TagModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v36

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/items/UpsellCardFeaturesModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/design/models/items/UpsellCardFeaturesModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/design/models/items/UpsellCardFeaturesModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->write$Self$design_models_release(Lcom/whoop/design/models/items/UpsellCardFeaturesModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/models/items/UpsellCardFeaturesModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/design/models/items/UpsellCardFeaturesModel;)V

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
