.class public final synthetic Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "core-details_release"
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

.field public static final INSTANCE:Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.core.details.network.model.recoveryv2.RecoveryDetailsModel"

    const/16 v3, 0xf

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "titleBar"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "horizontal_stats"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "keyMetricCarousel"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "segmentedControlDisplay"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "graphs"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "bar_graph_container"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "integrationPromoCard"

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "achievementProgressCard"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "map"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "tags"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "tagsV2"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "editable"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "detailsEditComponents"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "tiles"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "whoopCoachVow"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0xf

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    sget-object v3, Lcom/whoop/core/details/network/model/TitleBarModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/TitleBarModel$$serializer;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    sget-object v3, Lcom/whoop/design/models/items/KeyMetricCarouselModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/KeyMetricCarouselModel$$serializer;

    aput-object v3, v1, v2

    const/4 v2, 0x3

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x4

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    sget-object v2, Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

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

    sget-object v2, Lcom/whoop/design/models/items/AchievementProgressCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AchievementProgressCardModel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    sget-object v2, Lcom/whoop/design/models/items/MapModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MapModel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/16 v3, 0x8

    aput-object v2, v1, v3

    const/16 v2, 0x9

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0xa

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/c;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v2

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    const/16 v2, 0xc

    sget-object v3, Lcom/whoop/core/details/network/model/DetailsEditComponent$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/DetailsEditComponent$$serializer;

    aput-object v3, v1, v2

    const/16 v2, 0xd

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v2

    sget-object v0, Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v2, 0xe

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;
    .locals 51

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/4 v7, 0x7

    const/4 v8, 0x5

    const/16 v9, 0x8

    const/4 v10, 0x2

    const/16 v12, 0xa

    const/16 v13, 0x9

    const/4 v14, 0x6

    const/4 v15, 0x3

    const/4 v4, 0x4

    const/16 v16, 0xd

    const/4 v11, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v3, :cond_0

    sget-object v3, Lcom/whoop/core/details/network/model/TitleBarModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/TitleBarModel$$serializer;

    invoke-interface {v0, v1, v5, v3, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/core/details/network/model/TitleBarModel;

    aget-object v5, v2, v11

    invoke-interface {v5}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwc3/b;

    invoke-interface {v0, v1, v11, v5, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v11, Lcom/whoop/design/models/items/KeyMetricCarouselModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/KeyMetricCarouselModel$$serializer;

    invoke-interface {v0, v1, v10, v11, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    aget-object v11, v2, v15

    invoke-interface {v11}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lwc3/b;

    invoke-interface {v0, v1, v15, v11, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    aget-object v15, v2, v4

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v4, v15, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    sget-object v15, Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;

    invoke-interface {v0, v1, v8, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/design/models/items/BarGraphContainerModel;

    aget-object v15, v2, v14

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v14, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/whoop/design/models/DesignSystemModel;

    sget-object v15, Lcom/whoop/design/models/items/AchievementProgressCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AchievementProgressCardModel$$serializer;

    invoke-interface {v0, v1, v7, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/design/models/items/AchievementProgressCardModel;

    sget-object v15, Lcom/whoop/design/models/items/MapModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MapModel$$serializer;

    invoke-interface {v0, v1, v9, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/design/models/items/MapModel;

    aget-object v15, v2, v13

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v13, v15, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/List;

    aget-object v15, v2, v12

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v12, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    sget-object v15, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    move-object/from16 v19, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    sget-object v15, Lcom/whoop/core/details/network/model/DetailsEditComponent$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/DetailsEditComponent$$serializer;

    move-object/from16 v18, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v15, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/core/details/network/model/DetailsEditComponent;

    aget-object v15, v19, v16

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v17, v2

    move/from16 v2, v16

    invoke-interface {v0, v1, v2, v15, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v15, Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;

    move-object/from16 v16, v2

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2, v15, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/WhoopCoachVowModel;

    const/16 v6, 0x7fff

    move-object/from16 v49, v2

    move-object/from16 v35, v3

    move-object/from16 v39, v4

    move-object/from16 v36, v5

    move-object/from16 v42, v7

    move-object/from16 v40, v8

    move-object/from16 v43, v9

    move-object/from16 v37, v10

    move-object/from16 v38, v11

    move-object/from16 v45, v12

    move-object/from16 v44, v13

    move-object/from16 v41, v14

    move-object/from16 v48, v16

    move-object/from16 v47, v17

    move-object/from16 v46, v18

    :goto_0
    move/from16 v34, v6

    goto/16 :goto_b

    :cond_0
    move-object/from16 v19, v2

    move/from16 v24, v4

    move-object v2, v6

    move-object v3, v2

    move-object v4, v3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object/from16 v28, v10

    move-object/from16 v29, v28

    move/from16 v21, v11

    move/from16 v30, v21

    move/from16 v27, v12

    move/from16 v26, v13

    move/from16 v25, v14

    move/from16 v23, v15

    move v6, v5

    move-object/from16 v5, v29

    move-object v11, v5

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    :goto_1
    if-eqz v30, :cond_1

    move-object/from16 v31, v5

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v5

    packed-switch v5, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v5}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v5, Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;

    move-object/from16 v32, v11

    const/16 v11, 0xe

    invoke-interface {v0, v1, v11, v5, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/WhoopCoachVowModel;

    or-int/lit16 v6, v6, 0x4000

    :goto_2
    move-object/from16 v5, v31

    move-object/from16 v11, v32

    goto :goto_1

    :pswitch_1
    move-object/from16 v32, v11

    const/16 v5, 0xd

    const/16 v11, 0xe

    aget-object v16, v19, v5

    invoke-interface/range {v16 .. v16}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v11, v16

    check-cast v11, Lwc3/b;

    invoke-interface {v0, v1, v5, v11, v2}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    or-int/lit16 v6, v6, 0x2000

    goto :goto_2

    :pswitch_2
    move-object/from16 v32, v11

    const/16 v5, 0xd

    sget-object v11, Lcom/whoop/core/details/network/model/DetailsEditComponent$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/DetailsEditComponent$$serializer;

    const/16 v5, 0xc

    invoke-interface {v0, v1, v5, v11, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lcom/whoop/core/details/network/model/DetailsEditComponent;

    or-int/lit16 v6, v6, 0x1000

    goto :goto_2

    :pswitch_3
    move-object/from16 v32, v11

    const/16 v5, 0xc

    sget-object v11, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/16 v5, 0xb

    invoke-interface {v0, v1, v5, v11, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object v13, v11

    check-cast v13, Ljava/lang/Boolean;

    or-int/lit16 v6, v6, 0x800

    goto :goto_2

    :pswitch_4
    move-object/from16 v32, v11

    const/16 v5, 0xb

    aget-object v11, v19, v27

    invoke-interface {v11}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lwc3/b;

    move/from16 v5, v27

    invoke-interface {v0, v1, v5, v11, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    or-int/lit16 v6, v6, 0x400

    goto :goto_2

    :pswitch_5
    move-object/from16 v32, v11

    move/from16 v5, v27

    aget-object v11, v19, v26

    invoke-interface {v11}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lwc3/b;

    move/from16 v5, v26

    invoke-interface {v0, v1, v5, v11, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    or-int/lit16 v6, v6, 0x200

    move-object/from16 v5, v31

    move-object/from16 v11, v32

    :goto_3
    const/16 v27, 0xa

    goto/16 :goto_1

    :pswitch_6
    move-object/from16 v32, v11

    move/from16 v5, v26

    sget-object v11, Lcom/whoop/design/models/items/MapModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MapModel$$serializer;

    const/16 v5, 0x8

    invoke-interface {v0, v1, v5, v11, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object v14, v11

    check-cast v14, Lcom/whoop/design/models/items/MapModel;

    or-int/lit16 v6, v6, 0x100

    :goto_4
    move-object/from16 v5, v31

    move-object/from16 v11, v32

    :goto_5
    const/16 v26, 0x9

    goto :goto_3

    :pswitch_7
    move-object/from16 v32, v11

    const/16 v5, 0x8

    sget-object v11, Lcom/whoop/design/models/items/AchievementProgressCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AchievementProgressCardModel$$serializer;

    const/4 v5, 0x7

    invoke-interface {v0, v1, v5, v11, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/design/models/items/AchievementProgressCardModel;

    or-int/lit16 v6, v6, 0x80

    goto :goto_4

    :pswitch_8
    move-object/from16 v32, v11

    const/4 v5, 0x7

    aget-object v11, v19, v25

    invoke-interface {v11}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lwc3/b;

    move/from16 v5, v25

    invoke-interface {v0, v1, v5, v11, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    or-int/lit8 v6, v6, 0x40

    goto :goto_4

    :pswitch_9
    move-object/from16 v32, v11

    move/from16 v5, v25

    sget-object v11, Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;

    const/4 v5, 0x5

    invoke-interface {v0, v1, v5, v11, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object v15, v11

    check-cast v15, Lcom/whoop/design/models/items/BarGraphContainerModel;

    or-int/lit8 v6, v6, 0x20

    :goto_6
    move-object/from16 v5, v31

    move-object/from16 v11, v32

    :goto_7
    const/16 v25, 0x6

    goto :goto_5

    :pswitch_a
    move-object/from16 v32, v11

    const/4 v5, 0x5

    aget-object v11, v19, v24

    invoke-interface {v11}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lwc3/b;

    move/from16 v5, v24

    invoke-interface {v0, v1, v5, v11, v10}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    or-int/lit8 v6, v6, 0x10

    goto :goto_6

    :pswitch_b
    move-object/from16 v32, v11

    move/from16 v5, v24

    aget-object v11, v19, v23

    invoke-interface {v11}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lwc3/b;

    move/from16 v5, v23

    move-object/from16 v23, v2

    move v2, v5

    move-object/from16 v5, v32

    invoke-interface {v0, v1, v2, v11, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v11, v5

    check-cast v11, Ljava/util/List;

    or-int/lit8 v6, v6, 0x8

    move-object/from16 v5, v23

    move/from16 v23, v2

    move-object v2, v5

    move-object/from16 v5, v31

    :goto_8
    const/16 v24, 0x4

    goto :goto_7

    :pswitch_c
    move/from16 v5, v23

    move-object/from16 v23, v2

    move v2, v5

    move-object v5, v11

    sget-object v11, Lcom/whoop/design/models/items/KeyMetricCarouselModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/KeyMetricCarouselModel$$serializer;

    move-object/from16 v22, v3

    move-object/from16 v2, v31

    const/4 v3, 0x2

    invoke-interface {v0, v1, v3, v11, v2}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    or-int/lit8 v6, v6, 0x4

    move-object v11, v5

    move-object/from16 v3, v22

    const/16 v24, 0x4

    const/16 v25, 0x6

    const/16 v26, 0x9

    const/16 v27, 0xa

    move-object v5, v2

    :goto_9
    move-object/from16 v2, v23

    const/16 v23, 0x3

    goto/16 :goto_1

    :pswitch_d
    move-object/from16 v23, v2

    move-object/from16 v22, v3

    move-object v5, v11

    move-object/from16 v2, v31

    const/4 v3, 0x2

    aget-object v11, v19, v21

    invoke-interface {v11}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lwc3/b;

    move/from16 v3, v21

    move-object/from16 v21, v2

    move v2, v3

    move-object/from16 v3, v29

    invoke-interface {v0, v1, v2, v11, v3}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v29, v3

    check-cast v29, Ljava/util/List;

    or-int/lit8 v6, v6, 0x2

    move-object v11, v5

    move-object/from16 v5, v21

    move-object/from16 v3, v22

    const/16 v24, 0x4

    const/16 v25, 0x6

    const/16 v26, 0x9

    const/16 v27, 0xa

    move/from16 v21, v2

    goto :goto_9

    :pswitch_e
    move-object/from16 v23, v2

    move-object/from16 v22, v3

    move-object v5, v11

    move/from16 v2, v21

    move-object/from16 v3, v29

    move-object/from16 v21, v31

    sget-object v11, Lcom/whoop/core/details/network/model/TitleBarModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/TitleBarModel$$serializer;

    move-object/from16 v20, v3

    move-object/from16 v2, v28

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v11, v2}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v28, v2

    check-cast v28, Lcom/whoop/core/details/network/model/TitleBarModel;

    or-int/lit8 v6, v6, 0x1

    move-object v11, v5

    move-object/from16 v29, v20

    :goto_a
    move-object/from16 v5, v21

    move-object/from16 v3, v22

    move-object/from16 v2, v23

    const/16 v21, 0x1

    const/16 v23, 0x3

    goto/16 :goto_8

    :pswitch_f
    move-object/from16 v23, v2

    move-object/from16 v22, v3

    move-object v5, v11

    move-object/from16 v2, v28

    move-object/from16 v20, v29

    move-object/from16 v21, v31

    const/4 v3, 0x0

    move/from16 v30, v3

    goto :goto_a

    :cond_1
    move-object/from16 v23, v2

    move-object/from16 v22, v3

    move-object/from16 v21, v5

    move-object v5, v11

    move-object/from16 v2, v28

    move-object/from16 v20, v29

    move-object/from16 v35, v2

    move-object/from16 v41, v4

    move-object/from16 v38, v5

    move-object/from16 v44, v7

    move-object/from16 v42, v8

    move-object/from16 v45, v9

    move-object/from16 v39, v10

    move-object/from16 v47, v12

    move-object/from16 v46, v13

    move-object/from16 v43, v14

    move-object/from16 v40, v15

    move-object/from16 v36, v20

    move-object/from16 v37, v21

    move-object/from16 v49, v22

    move-object/from16 v48, v23

    goto/16 :goto_0

    :goto_b
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v33, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;

    const/16 v50, 0x0

    invoke-direct/range {v33 .. v50}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;-><init>(ILcom/whoop/core/details/network/model/TitleBarModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/items/MapModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v33

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->write$Self$core_details_release(Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;)V

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
