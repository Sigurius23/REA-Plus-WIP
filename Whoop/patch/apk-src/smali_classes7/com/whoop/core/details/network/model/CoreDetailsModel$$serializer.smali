.class public final synthetic Lcom/whoop/core/details/network/model/CoreDetailsModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/core/details/network/model/CoreDetailsModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/core/details/network/model/CoreDetailsModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/core/details/network/model/CoreDetailsModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/core/details/network/model/CoreDetailsModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/core/details/network/model/CoreDetailsModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/core/details/network/model/CoreDetailsModel;",
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

.field public static final INSTANCE:Lcom/whoop/core/details/network/model/CoreDetailsModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/core/details/network/model/CoreDetailsModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/core/details/network/model/CoreDetailsModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/core/details/network/model/CoreDetailsModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/CoreDetailsModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/core/details/network/model/CoreDetailsModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.core.details.network.model.CoreDetailsModel"

    const/16 v3, 0x1e

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "titleBar"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "linkWorkoutCtaTile"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "onboardingOverlays"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "strain_breakdown"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "linkWorkoutOptionEnabled"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "horizontalStat"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "horizontalStats"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "keyMetricCarousel"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "graphResponse"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "vowResponseString"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "whoopCoachVow"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "bar_graph_container"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "achievementProgressCard"

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "integrationPromoCard"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "momentEntryPointTile"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "additionalInfoText"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "map"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "detailsEditComponents"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "graphId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "initialGraphId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "graphTitleBar"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "supplementalData"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "editable"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "tags"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "tagsV2"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "weightliftingCardioDetails"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "menuOptions"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "metadata"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "activity_targets_mini_arch"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "design_items"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/core/details/network/model/CoreDetailsModel$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/core/details/network/model/CoreDetailsModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0x1e

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    sget-object v3, Lcom/whoop/core/details/network/model/TitleBarModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/TitleBarModel$$serializer;

    aput-object v3, v1, v2

    sget-object v2, Lcom/whoop/design/models/items/CtaTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CtaTileModel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/c;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v2

    sget-object v2, Lcom/whoop/design/models/items/StrainBreakDownModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/StrainBreakDownModel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/4 v4, 0x4

    aput-object v3, v1, v4

    const/4 v3, 0x5

    sget-object v4, Lcom/whoop/design/models/items/HorizontalStatModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/HorizontalStatModel$$serializer;

    aput-object v4, v1, v3

    const/4 v3, 0x6

    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v1, v3

    const/4 v3, 0x7

    sget-object v4, Lcom/whoop/design/models/items/KeyMetricCarouselModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/KeyMetricCarouselModel$$serializer;

    aput-object v4, v1, v3

    const/16 v3, 0x8

    sget-object v4, Lcom/whoop/design/models/items/graph/GraphModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphModel$$serializer;

    aput-object v4, v1, v3

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    const/16 v5, 0x9

    aput-object v4, v1, v5

    sget-object v4, Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    const/16 v5, 0xa

    aput-object v4, v1, v5

    sget-object v4, Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    const/16 v5, 0xb

    aput-object v4, v1, v5

    sget-object v4, Lcom/whoop/design/models/items/AchievementProgressCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AchievementProgressCardModel$$serializer;

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    const/16 v5, 0xc

    aput-object v4, v1, v5

    const/16 v4, 0xd

    aget-object v5, v0, v4

    invoke-interface {v5}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwc3/c;

    invoke-static {v5}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    aput-object v5, v1, v4

    const/16 v4, 0xe

    aget-object v5, v0, v4

    invoke-interface {v5}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwc3/c;

    invoke-static {v5}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    aput-object v5, v1, v4

    sget-object v4, Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    const/16 v5, 0xf

    aput-object v4, v1, v5

    sget-object v4, Lcom/whoop/design/models/items/MapModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MapModel$$serializer;

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    const/16 v5, 0x10

    aput-object v4, v1, v5

    const/16 v4, 0x11

    sget-object v5, Lcom/whoop/core/details/network/model/DetailsEditComponent$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/DetailsEditComponent$$serializer;

    aput-object v5, v1, v4

    const/16 v4, 0x12

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    aput-object v5, v1, v4

    const/16 v4, 0x13

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v4

    sget-object v3, Lcom/whoop/core/details/network/model/GraphTitleBar$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/GraphTitleBar$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/16 v4, 0x14

    aput-object v3, v1, v4

    sget-object v3, Lcom/whoop/core/details/network/model/SupplementalData$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/SupplementalData$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/16 v4, 0x15

    aput-object v3, v1, v4

    const/16 v3, 0x16

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    aput-object v2, v1, v3

    const/16 v2, 0x17

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0x18

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/c;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v2

    sget-object v2, Lcom/whoop/core/details/network/model/WeightliftingCardioDetails$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/WeightliftingCardioDetails$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/16 v3, 0x19

    aput-object v2, v1, v3

    const/16 v2, 0x1a

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/c;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v2

    sget-object v2, Lcom/whoop/core/details/network/model/MetaData$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/MetaData$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/16 v3, 0x1b

    aput-object v2, v1, v3

    const/16 v2, 0x1c

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/c;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0x1d

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/core/details/network/model/CoreDetailsModel;
    .locals 93

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/core/details/network/model/CoreDetailsModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/core/details/network/model/CoreDetailsModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v4, 0x9

    const/4 v5, 0x7

    const/4 v6, 0x5

    const/4 v7, 0x3

    const/16 v9, 0x8

    const/4 v10, 0x4

    const/16 v23, 0x1d

    const/16 v24, 0x1c

    const/16 v25, 0x1a

    const/16 v26, 0x18

    const/16 v27, 0x17

    const/4 v12, 0x6

    const/16 v30, 0xe

    const/4 v11, 0x2

    const/16 v31, 0xd

    const/4 v8, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    if-eqz v3, :cond_0

    sget-object v3, Lcom/whoop/core/details/network/model/TitleBarModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/TitleBarModel$$serializer;

    invoke-interface {v0, v1, v13, v3, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/core/details/network/model/TitleBarModel;

    sget-object v13, Lcom/whoop/design/models/items/CtaTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CtaTileModel$$serializer;

    invoke-interface {v0, v1, v8, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/design/models/items/CtaTileModel;

    aget-object v13, v2, v11

    invoke-interface {v13}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lwc3/b;

    invoke-interface {v0, v1, v11, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    sget-object v13, Lcom/whoop/design/models/items/StrainBreakDownModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/StrainBreakDownModel$$serializer;

    invoke-interface {v0, v1, v7, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/design/models/items/StrainBreakDownModel;

    sget-object v13, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-interface {v0, v1, v10, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    sget-object v15, Lcom/whoop/design/models/items/HorizontalStatModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/HorizontalStatModel$$serializer;

    invoke-interface {v0, v1, v6, v15, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/models/items/HorizontalStatModel;

    aget-object v15, v2, v12

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v12, v15, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    sget-object v15, Lcom/whoop/design/models/items/KeyMetricCarouselModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/KeyMetricCarouselModel$$serializer;

    invoke-interface {v0, v1, v5, v15, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    sget-object v15, Lcom/whoop/design/models/items/graph/GraphModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphModel$$serializer;

    invoke-interface {v0, v1, v9, v15, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/design/models/items/graph/GraphModel;

    sget-object v15, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v4, v15, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    move-object/from16 v35, v2

    sget-object v2, Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;

    move-object/from16 v36, v3

    const/16 v3, 0xa

    invoke-interface {v0, v1, v3, v2, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/WhoopCoachVowModel;

    sget-object v3, Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;

    move-object/from16 v34, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v3, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/BarGraphContainerModel;

    sget-object v3, Lcom/whoop/design/models/items/AchievementProgressCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AchievementProgressCardModel$$serializer;

    move-object/from16 v33, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v3, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/AchievementProgressCardModel;

    aget-object v3, v35, v31

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move-object/from16 v32, v2

    move/from16 v2, v31

    invoke-interface {v0, v1, v2, v3, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    aget-object v3, v35, v30

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move-object/from16 v31, v2

    move/from16 v2, v30

    invoke-interface {v0, v1, v2, v3, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    sget-object v3, Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;

    move-object/from16 v30, v2

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2, v3, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    sget-object v3, Lcom/whoop/design/models/items/MapModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MapModel$$serializer;

    move-object/from16 v29, v2

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2, v3, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/MapModel;

    sget-object v3, Lcom/whoop/core/details/network/model/DetailsEditComponent$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/DetailsEditComponent$$serializer;

    move-object/from16 v28, v2

    const/16 v2, 0x11

    invoke-interface {v0, v1, v2, v3, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/core/details/network/model/DetailsEditComponent;

    const/16 v3, 0x12

    invoke-interface {v0, v1, v3, v15, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v21, v2

    const/16 v2, 0x13

    invoke-interface {v0, v1, v2, v15, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v15, Lcom/whoop/core/details/network/model/GraphTitleBar$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/GraphTitleBar$$serializer;

    move-object/from16 v20, v2

    const/16 v2, 0x14

    invoke-interface {v0, v1, v2, v15, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/core/details/network/model/GraphTitleBar;

    sget-object v15, Lcom/whoop/core/details/network/model/SupplementalData$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/SupplementalData$$serializer;

    move-object/from16 v19, v2

    const/16 v2, 0x15

    invoke-interface {v0, v1, v2, v15, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/core/details/network/model/SupplementalData;

    const/16 v15, 0x16

    invoke-interface {v0, v1, v15, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    aget-object v15, v35, v27

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v17, v2

    move/from16 v2, v27

    invoke-interface {v0, v1, v2, v15, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    aget-object v15, v35, v26

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v18, v2

    move/from16 v2, v26

    invoke-interface {v0, v1, v2, v15, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v15, Lcom/whoop/core/details/network/model/WeightliftingCardioDetails$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/WeightliftingCardioDetails$$serializer;

    move-object/from16 v22, v2

    const/16 v2, 0x19

    invoke-interface {v0, v1, v2, v15, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;

    aget-object v15, v35, v25

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v16, v2

    move/from16 v2, v25

    invoke-interface {v0, v1, v2, v15, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v15, Lcom/whoop/core/details/network/model/MetaData$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/MetaData$$serializer;

    move-object/from16 v25, v2

    const/16 v2, 0x1b

    invoke-interface {v0, v1, v2, v15, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/core/details/network/model/MetaData;

    aget-object v15, v35, v24

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 p1, v2

    move/from16 v2, v24

    invoke-interface {v0, v1, v2, v15, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    aget-object v15, v35, v23

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v24, v13

    move/from16 v13, v23

    invoke-interface {v0, v1, v13, v15, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/List;

    const v14, 0x3fffffff    # 1.9999999f

    move-object/from16 v89, p1

    move-object/from16 v90, v2

    move-object/from16 v80, v3

    move-object/from16 v71, v4

    move-object/from16 v69, v5

    move-object/from16 v67, v6

    move-object/from16 v65, v7

    move-object/from16 v63, v8

    move-object/from16 v70, v9

    move-object/from16 v66, v10

    move-object/from16 v64, v11

    move-object/from16 v68, v12

    move-object/from16 v91, v13

    move-object/from16 v87, v16

    move-object/from16 v83, v17

    move-object/from16 v85, v18

    move-object/from16 v82, v19

    move-object/from16 v81, v20

    move-object/from16 v79, v21

    move-object/from16 v86, v22

    move-object/from16 v84, v24

    move-object/from16 v88, v25

    move-object/from16 v78, v28

    move-object/from16 v77, v29

    move-object/from16 v76, v30

    move-object/from16 v75, v31

    move-object/from16 v74, v32

    move-object/from16 v73, v33

    move-object/from16 v72, v34

    move-object/from16 v62, v36

    :goto_0
    move/from16 v61, v14

    goto/16 :goto_a

    :cond_0
    move-object/from16 v35, v2

    move v2, v13

    move/from16 v13, v23

    move/from16 v57, v8

    move/from16 v37, v11

    move/from16 v38, v12

    move-object v3, v14

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v15, v12

    move-object/from16 v39, v15

    move-object/from16 v40, v39

    move-object/from16 v41, v40

    move-object/from16 v42, v41

    move-object/from16 v43, v42

    move-object/from16 v44, v43

    move-object/from16 v45, v44

    move-object/from16 v46, v45

    move-object/from16 v47, v46

    move-object/from16 v48, v47

    move-object/from16 v49, v48

    move-object/from16 v50, v49

    move-object/from16 v51, v50

    move-object/from16 v52, v51

    move-object/from16 v53, v52

    move-object/from16 v54, v53

    move-object/from16 v55, v54

    move-object/from16 v56, v55

    move v14, v2

    move-object/from16 v2, v56

    :goto_1
    if-eqz v57, :cond_1

    move/from16 v58, v13

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v13

    packed-switch v13, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v13}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    aget-object v13, v35, v58

    invoke-interface {v13}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lwc3/b;

    move-object/from16 v59, v15

    move/from16 v15, v58

    invoke-interface {v0, v1, v15, v13, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/high16 v13, 0x20000000

    or-int/2addr v14, v13

    move-object/from16 v23, v4

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v24, v55

    :goto_2
    move-object/from16 v15, v59

    const/4 v4, 0x0

    goto/16 :goto_9

    :pswitch_1
    move-object/from16 v59, v15

    move/from16 v15, v58

    const/16 v13, 0x1c

    aget-object v24, v35, v13

    invoke-interface/range {v24 .. v24}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v24

    move-object/from16 v15, v24

    check-cast v15, Lwc3/b;

    move-object/from16 v24, v3

    move-object/from16 v3, v55

    invoke-interface {v0, v1, v13, v15, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/DesignSystemModel;

    const/high16 v15, 0x10000000

    or-int/2addr v14, v15

    move-object/from16 v13, v24

    move-object/from16 v24, v3

    move-object v3, v13

    move-object/from16 v23, v4

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    goto :goto_2

    :pswitch_2
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v3, v55

    const/16 v13, 0x1c

    sget-object v15, Lcom/whoop/core/details/network/model/MetaData$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/MetaData$$serializer;

    move-object/from16 v13, v54

    move-object/from16 v54, v3

    const/16 v3, 0x1b

    invoke-interface {v0, v1, v3, v15, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/core/details/network/model/MetaData;

    const/high16 v15, 0x8000000

    or-int/2addr v14, v15

    move-object/from16 v23, v4

    move-object/from16 v3, v24

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v24, v54

    move-object/from16 v15, v59

    const/4 v4, 0x0

    move-object/from16 v54, v13

    move-object/from16 v13, v39

    goto/16 :goto_9

    :pswitch_3
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v13, v54

    move-object/from16 v54, v55

    const/16 v3, 0x1b

    const/16 v15, 0x1a

    aget-object v25, v35, v15

    invoke-interface/range {v25 .. v25}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v25

    move-object/from16 v3, v25

    check-cast v3, Lwc3/b;

    move-object/from16 v25, v13

    move-object/from16 v13, v53

    invoke-interface {v0, v1, v15, v3, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/high16 v13, 0x4000000

    or-int/2addr v14, v13

    move-object/from16 v16, v3

    move-object/from16 v23, v4

    move-object/from16 v3, v24

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    :goto_3
    move-object/from16 v24, v54

    move-object/from16 v15, v59

    :goto_4
    const/4 v4, 0x0

    :goto_5
    move-object/from16 v54, v25

    goto/16 :goto_9

    :pswitch_4
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v13, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/16 v15, 0x1a

    sget-object v3, Lcom/whoop/core/details/network/model/WeightliftingCardioDetails$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/WeightliftingCardioDetails$$serializer;

    move-object/from16 v16, v13

    move-object/from16 v15, v52

    const/16 v13, 0x19

    invoke-interface {v0, v1, v13, v3, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;

    const/high16 v15, 0x2000000

    or-int/2addr v14, v15

    move-object/from16 v26, v3

    move-object/from16 v23, v4

    move-object/from16 v3, v24

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    goto :goto_3

    :pswitch_5
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v15, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/16 v3, 0x18

    const/16 v13, 0x19

    aget-object v26, v35, v3

    invoke-interface/range {v26 .. v26}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v26

    move-object/from16 v13, v26

    check-cast v13, Lwc3/b;

    move-object/from16 v26, v15

    move-object/from16 v15, v51

    invoke-interface {v0, v1, v3, v13, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/List;

    const/high16 v15, 0x1000000

    or-int/2addr v14, v15

    move-object/from16 v23, v4

    move-object/from16 v27, v13

    move-object/from16 v3, v24

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    goto/16 :goto_3

    :pswitch_6
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v15, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/16 v3, 0x18

    const/16 v13, 0x17

    aget-object v27, v35, v13

    invoke-interface/range {v27 .. v27}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v27

    move-object/from16 v3, v27

    check-cast v3, Lwc3/b;

    move-object/from16 v27, v15

    move-object/from16 v15, v50

    invoke-interface {v0, v1, v13, v3, v15}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/high16 v15, 0x800000

    or-int/2addr v14, v15

    move-object/from16 v17, v3

    move-object/from16 v23, v4

    move-object/from16 v3, v24

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    goto/16 :goto_3

    :pswitch_7
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v15, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/16 v13, 0x17

    sget-object v3, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    move-object/from16 v17, v15

    move-object/from16 v13, v49

    const/16 v15, 0x16

    invoke-interface {v0, v1, v15, v3, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    const/high16 v13, 0x400000

    or-int/2addr v14, v13

    move-object/from16 v18, v3

    move-object/from16 v23, v4

    move-object/from16 v3, v24

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    goto/16 :goto_3

    :pswitch_8
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v13, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/16 v15, 0x16

    sget-object v3, Lcom/whoop/core/details/network/model/SupplementalData$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/SupplementalData$$serializer;

    move-object/from16 v18, v13

    move-object/from16 v15, v48

    const/16 v13, 0x15

    invoke-interface {v0, v1, v13, v3, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/core/details/network/model/SupplementalData;

    const/high16 v15, 0x200000

    or-int/2addr v14, v15

    move-object/from16 v19, v3

    move-object/from16 v23, v4

    move-object/from16 v3, v24

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    goto/16 :goto_3

    :pswitch_9
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v15, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/16 v13, 0x15

    sget-object v3, Lcom/whoop/core/details/network/model/GraphTitleBar$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/GraphTitleBar$$serializer;

    move-object/from16 v19, v15

    move-object/from16 v13, v47

    const/16 v15, 0x14

    invoke-interface {v0, v1, v15, v3, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/core/details/network/model/GraphTitleBar;

    const/high16 v13, 0x100000

    or-int/2addr v14, v13

    move-object/from16 v20, v3

    move-object/from16 v23, v4

    move-object/from16 v3, v24

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    goto/16 :goto_3

    :pswitch_a
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v13, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/16 v15, 0x14

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v20, v13

    move-object/from16 v15, v46

    const/16 v13, 0x13

    invoke-interface {v0, v1, v13, v3, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/high16 v15, 0x80000

    or-int/2addr v14, v15

    move-object/from16 v21, v3

    move-object/from16 v23, v4

    move-object/from16 v3, v24

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    goto/16 :goto_3

    :pswitch_b
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v15, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/16 v13, 0x13

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v21, v15

    move-object/from16 v13, v45

    const/16 v15, 0x12

    invoke-interface {v0, v1, v15, v3, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/high16 v13, 0x40000

    or-int/2addr v14, v13

    move-object/from16 v22, v3

    move-object/from16 v23, v4

    move-object/from16 v3, v24

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    goto/16 :goto_3

    :pswitch_c
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v13, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/16 v15, 0x12

    sget-object v3, Lcom/whoop/core/details/network/model/DetailsEditComponent$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/DetailsEditComponent$$serializer;

    move-object/from16 v22, v13

    move-object/from16 v15, v44

    const/16 v13, 0x11

    invoke-interface {v0, v1, v13, v3, v15}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/core/details/network/model/DetailsEditComponent;

    const/high16 v15, 0x20000

    or-int/2addr v14, v15

    move-object/from16 v28, v3

    move-object/from16 v23, v4

    move-object/from16 v3, v24

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    goto/16 :goto_3

    :pswitch_d
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v15, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/16 v13, 0x11

    sget-object v3, Lcom/whoop/design/models/items/MapModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MapModel$$serializer;

    move-object/from16 v28, v15

    move-object/from16 v13, v43

    const/16 v15, 0x10

    invoke-interface {v0, v1, v15, v3, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/MapModel;

    const/high16 v13, 0x10000

    or-int/2addr v14, v13

    move-object/from16 v29, v3

    move-object/from16 v23, v4

    move-object/from16 v3, v24

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    goto/16 :goto_3

    :pswitch_e
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v13, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/16 v15, 0x10

    sget-object v3, Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;

    move-object/from16 v29, v13

    move-object/from16 v15, v42

    const/16 v13, 0xf

    invoke-interface {v0, v1, v13, v3, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    const v15, 0x8000

    or-int/2addr v14, v15

    move-object/from16 v30, v3

    move-object/from16 v23, v4

    move-object/from16 v3, v24

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    goto/16 :goto_3

    :pswitch_f
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v15, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/16 v3, 0xe

    const/16 v13, 0xf

    aget-object v30, v35, v3

    invoke-interface/range {v30 .. v30}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v30

    move-object/from16 v13, v30

    check-cast v13, Lwc3/b;

    move-object/from16 v30, v15

    move-object/from16 v15, v41

    invoke-interface {v0, v1, v3, v13, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/design/models/DesignSystemModel;

    or-int/lit16 v14, v14, 0x4000

    move-object/from16 v23, v4

    move-object/from16 v31, v13

    move-object/from16 v3, v24

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    goto/16 :goto_3

    :pswitch_10
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v15, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/16 v3, 0xe

    const/16 v13, 0xd

    aget-object v31, v35, v13

    invoke-interface/range {v31 .. v31}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v31

    move-object/from16 v3, v31

    check-cast v3, Lwc3/b;

    move-object/from16 v31, v15

    move-object/from16 v15, v40

    invoke-interface {v0, v1, v13, v3, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/DesignSystemModel;

    or-int/lit16 v14, v14, 0x2000

    move-object/from16 v32, v3

    move-object/from16 v23, v4

    move-object/from16 v3, v24

    move-object/from16 v13, v39

    goto/16 :goto_3

    :pswitch_11
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v15, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/16 v13, 0xd

    sget-object v3, Lcom/whoop/design/models/items/AchievementProgressCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AchievementProgressCardModel$$serializer;

    move-object/from16 v32, v15

    move-object/from16 v13, v39

    const/16 v15, 0xc

    invoke-interface {v0, v1, v15, v3, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/AchievementProgressCardModel;

    or-int/lit16 v14, v14, 0x1000

    move-object v13, v3

    :goto_6
    move-object/from16 v23, v4

    :goto_7
    move-object/from16 v3, v24

    goto/16 :goto_3

    :pswitch_12
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/16 v15, 0xc

    sget-object v3, Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;

    const/16 v15, 0xb

    invoke-interface {v0, v1, v15, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/BarGraphContainerModel;

    or-int/lit16 v14, v14, 0x800

    move-object/from16 v23, v3

    goto :goto_7

    :pswitch_13
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/16 v15, 0xb

    sget-object v3, Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;

    const/16 v15, 0xa

    invoke-interface {v0, v1, v15, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/WhoopCoachVowModel;

    or-int/lit16 v14, v14, 0x400

    move-object v9, v3

    goto :goto_6

    :pswitch_14
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/16 v15, 0xa

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v15, 0x9

    invoke-interface {v0, v1, v15, v3, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    or-int/lit16 v14, v14, 0x200

    move-object v5, v3

    goto/16 :goto_6

    :pswitch_15
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/16 v15, 0x9

    sget-object v3, Lcom/whoop/design/models/items/graph/GraphModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphModel$$serializer;

    const/16 v15, 0x8

    invoke-interface {v0, v1, v15, v3, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/graph/GraphModel;

    or-int/lit16 v14, v14, 0x100

    move-object v12, v3

    goto/16 :goto_6

    :pswitch_16
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/16 v15, 0x8

    sget-object v3, Lcom/whoop/design/models/items/KeyMetricCarouselModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/KeyMetricCarouselModel$$serializer;

    const/4 v15, 0x7

    invoke-interface {v0, v1, v15, v3, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    or-int/lit16 v14, v14, 0x80

    move-object v6, v3

    goto/16 :goto_6

    :pswitch_17
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/4 v15, 0x7

    aget-object v3, v35, v38

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move/from16 v15, v38

    invoke-interface {v0, v1, v15, v3, v10}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    or-int/lit8 v14, v14, 0x40

    move-object v10, v3

    goto/16 :goto_6

    :pswitch_18
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move/from16 v15, v38

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    sget-object v3, Lcom/whoop/design/models/items/HorizontalStatModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/HorizontalStatModel$$serializer;

    const/4 v15, 0x5

    invoke-interface {v0, v1, v15, v3, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/HorizontalStatModel;

    or-int/lit8 v14, v14, 0x20

    move-object v7, v3

    goto/16 :goto_6

    :pswitch_19
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/4 v15, 0x5

    sget-object v3, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/4 v15, 0x4

    invoke-interface {v0, v1, v15, v3, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    or-int/lit8 v14, v14, 0x10

    move-object v11, v3

    goto/16 :goto_6

    :pswitch_1a
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/4 v15, 0x4

    sget-object v3, Lcom/whoop/design/models/items/StrainBreakDownModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/StrainBreakDownModel$$serializer;

    const/4 v15, 0x3

    invoke-interface {v0, v1, v15, v3, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/StrainBreakDownModel;

    or-int/lit8 v14, v14, 0x8

    move-object v8, v3

    goto/16 :goto_6

    :pswitch_1b
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/4 v15, 0x3

    aget-object v3, v35, v37

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move/from16 v15, v37

    invoke-interface {v0, v1, v15, v3, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    or-int/lit8 v14, v14, 0x4

    goto/16 :goto_6

    :pswitch_1c
    move-object/from16 v24, v3

    move-object/from16 v59, v15

    move/from16 v15, v37

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    sget-object v3, Lcom/whoop/design/models/items/CtaTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CtaTileModel$$serializer;

    move-object/from16 v36, v2

    move-object/from16 v15, v59

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2, v3, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/CtaTileModel;

    or-int/lit8 v14, v14, 0x2

    move-object v15, v3

    move-object/from16 v23, v4

    move-object/from16 v3, v24

    move-object/from16 v2, v36

    move-object/from16 v24, v54

    goto/16 :goto_4

    :pswitch_1d
    move-object/from16 v36, v2

    move-object/from16 v24, v3

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    const/4 v2, 0x1

    sget-object v3, Lcom/whoop/core/details/network/model/TitleBarModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/TitleBarModel$$serializer;

    move-object/from16 v23, v4

    move-object/from16 v2, v56

    const/4 v4, 0x0

    invoke-interface {v0, v1, v4, v3, v2}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/core/details/network/model/TitleBarModel;

    or-int/lit8 v14, v14, 0x1

    move-object/from16 v56, v2

    move-object/from16 v3, v24

    :goto_8
    move-object/from16 v2, v36

    move-object/from16 v24, v54

    goto/16 :goto_5

    :pswitch_1e
    move-object/from16 v36, v2

    move-object/from16 v24, v3

    move-object/from16 v23, v4

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    move-object/from16 v2, v56

    const/4 v4, 0x0

    move/from16 v57, v4

    goto :goto_8

    :goto_9
    move-object/from16 v39, v13

    move-object/from16 v53, v16

    move-object/from16 v50, v17

    move-object/from16 v49, v18

    move-object/from16 v48, v19

    move-object/from16 v47, v20

    move-object/from16 v46, v21

    move-object/from16 v45, v22

    move-object/from16 v4, v23

    move-object/from16 v55, v24

    move-object/from16 v52, v26

    move-object/from16 v51, v27

    move-object/from16 v44, v28

    move-object/from16 v43, v29

    move-object/from16 v42, v30

    move-object/from16 v41, v31

    move-object/from16 v40, v32

    const/16 v13, 0x1d

    const/16 v37, 0x2

    const/16 v38, 0x6

    goto/16 :goto_1

    :cond_1
    move-object/from16 v36, v2

    move-object/from16 v24, v3

    move-object/from16 v23, v4

    move-object/from16 v13, v39

    move-object/from16 v32, v40

    move-object/from16 v31, v41

    move-object/from16 v30, v42

    move-object/from16 v29, v43

    move-object/from16 v28, v44

    move-object/from16 v22, v45

    move-object/from16 v21, v46

    move-object/from16 v20, v47

    move-object/from16 v19, v48

    move-object/from16 v18, v49

    move-object/from16 v17, v50

    move-object/from16 v27, v51

    move-object/from16 v26, v52

    move-object/from16 v16, v53

    move-object/from16 v25, v54

    move-object/from16 v54, v55

    move-object/from16 v2, v56

    move-object/from16 v62, v2

    move-object/from16 v71, v5

    move-object/from16 v69, v6

    move-object/from16 v67, v7

    move-object/from16 v65, v8

    move-object/from16 v72, v9

    move-object/from16 v68, v10

    move-object/from16 v66, v11

    move-object/from16 v70, v12

    move-object/from16 v74, v13

    move-object/from16 v63, v15

    move-object/from16 v88, v16

    move-object/from16 v85, v17

    move-object/from16 v84, v18

    move-object/from16 v83, v19

    move-object/from16 v82, v20

    move-object/from16 v81, v21

    move-object/from16 v80, v22

    move-object/from16 v73, v23

    move-object/from16 v91, v24

    move-object/from16 v89, v25

    move-object/from16 v87, v26

    move-object/from16 v86, v27

    move-object/from16 v79, v28

    move-object/from16 v78, v29

    move-object/from16 v77, v30

    move-object/from16 v76, v31

    move-object/from16 v75, v32

    move-object/from16 v64, v36

    move-object/from16 v90, v54

    goto/16 :goto_0

    :goto_a
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v60, Lcom/whoop/core/details/network/model/CoreDetailsModel;

    const/16 v92, 0x0

    invoke-direct/range {v60 .. v92}, Lcom/whoop/core/details/network/model/CoreDetailsModel;-><init>(ILcom/whoop/core/details/network/model/TitleBarModel;Lcom/whoop/design/models/items/CtaTileModel;Ljava/util/List;Lcom/whoop/design/models/items/StrainBreakDownModel;Ljava/lang/Boolean;Lcom/whoop/design/models/items/HorizontalStatModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/design/models/items/MapModel;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/GraphTitleBar;Lcom/whoop/core/details/network/model/SupplementalData;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;Ljava/util/List;Lcom/whoop/core/details/network/model/MetaData;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v60

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
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
    invoke-virtual {p0, p1}, Lcom/whoop/core/details/network/model/CoreDetailsModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/core/details/network/model/CoreDetailsModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/network/model/CoreDetailsModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/core/details/network/model/CoreDetailsModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/core/details/network/model/CoreDetailsModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/core/details/network/model/CoreDetailsModel;->write$Self$core_details_release(Lcom/whoop/core/details/network/model/CoreDetailsModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/core/details/network/model/CoreDetailsModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/core/details/network/model/CoreDetailsModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/core/details/network/model/CoreDetailsModel;)V

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
