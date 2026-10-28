.class public final synthetic Lcom/whoop/trends/data/model/TrendsDtoV3$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/trends/data/model/TrendsDtoV3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/trends/data/model/TrendsDtoV3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/trends/data/model/TrendsDtoV3.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/trends/data/model/TrendsDtoV3;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/trends/data/model/TrendsDtoV3;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/trends/data/model/TrendsDtoV3;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "trends_release"
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

.field public static final INSTANCE:Lcom/whoop/trends/data/model/TrendsDtoV3$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/trends/data/model/TrendsDtoV3$$serializer;

    invoke-direct {v0}, Lcom/whoop/trends/data/model/TrendsDtoV3$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/trends/data/model/TrendsDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TrendsDtoV3$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/trends/data/model/TrendsDtoV3$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.trends.data.model.TrendsDtoV3"

    const/16 v3, 0x1a

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "header_name_display"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "segment_controller"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "week_time_segment"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "month_time_segment"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "six_month_time_segment"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "all_time_segment"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "no_data_name_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "no_data_subtext_name_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "metric_education"

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "navigation_sections"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "education_carousel"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "integrations_upsell"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "info_callout_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "manual_measurement_item"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "see_all_data_item"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "manual_measurement_sheet"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "upsell_card"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "trend_menu_list"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "cardio_fitness_level"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "metric_education_list"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "info_callouts"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "manual_measurement_text_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "trend_menus"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "additional_info_text"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "designItems"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "metadata"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/trends/data/model/TrendsDtoV3$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/trends/data/model/TrendsDtoV3;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0x1a

    new-array v1, v1, [Lwc3/c;

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v3, 0x1

    sget-object v4, Lcom/whoop/trends/data/model/SegmentControllerDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/SegmentControllerDtoV3$$serializer;

    aput-object v4, v1, v3

    sget-object v3, Lcom/whoop/trends/data/model/TimeSegmentDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TimeSegmentDtoV3$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    const/4 v5, 0x2

    aput-object v4, v1, v5

    const/4 v4, 0x3

    aput-object v3, v1, v4

    const/4 v4, 0x4

    aput-object v3, v1, v4

    const/4 v4, 0x5

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v4

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v3, 0x7

    aput-object v2, v1, v3

    sget-object v3, Lcom/whoop/trends/data/model/MetricEducationV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/MetricEducationV3$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/16 v4, 0x8

    aput-object v3, v1, v4

    const/16 v3, 0x9

    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v1, v3

    sget-object v3, Lcom/whoop/design/models/items/ArticleTileCarouselModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ArticleTileCarouselModel$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/16 v4, 0xa

    aput-object v3, v1, v4

    sget-object v3, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/16 v4, 0xb

    aput-object v3, v1, v4

    const/16 v3, 0xc

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    sget-object v3, Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    const/16 v5, 0xd

    aput-object v4, v1, v5

    const/16 v4, 0xe

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v4

    sget-object v3, Lcom/whoop/trends/data/model/ManualMeasurementSheet$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/ManualMeasurementSheet$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/16 v4, 0xf

    aput-object v3, v1, v4

    sget-object v3, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/cards/TextWithIllustrationCardModel$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/16 v4, 0x10

    aput-object v3, v1, v4

    const/16 v3, 0x11

    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v1, v3

    sget-object v3, Lcom/whoop/trends/data/model/CardioFitnessLevelModel$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/CardioFitnessLevelModel$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/16 v4, 0x12

    aput-object v3, v1, v4

    const/16 v3, 0x13

    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwc3/c;

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0x14

    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwc3/c;

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    const/16 v3, 0x15

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    aput-object v2, v1, v3

    const/16 v2, 0x16

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/c;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v2

    sget-object v2, Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/16 v3, 0x17

    aput-object v2, v1, v3

    const/16 v2, 0x18

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    aput-object v0, v1, v2

    sget-object v0, Lcom/whoop/trends/data/model/MetaData$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/MetaData$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v2, 0x19

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/trends/data/model/TrendsDtoV3;
    .locals 85

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/trends/data/model/TrendsDtoV3$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/trends/data/model/TrendsDtoV3;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v13, 0xa

    const/4 v14, 0x7

    const/4 v15, 0x6

    const/4 v4, 0x5

    const/4 v5, 0x3

    const/16 v7, 0x8

    const/4 v6, 0x4

    const/4 v8, 0x2

    const/16 v22, 0x18

    const/16 v23, 0x16

    const/16 v24, 0x14

    const/16 v25, 0x13

    const/16 v26, 0x11

    const/16 v9, 0x9

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v11}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    sget-object v11, Lcom/whoop/trends/data/model/SegmentControllerDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/SegmentControllerDtoV3$$serializer;

    invoke-interface {v0, v1, v10, v11, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/trends/data/model/SegmentControllerDtoV3;

    sget-object v11, Lcom/whoop/trends/data/model/TimeSegmentDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TimeSegmentDtoV3$$serializer;

    invoke-interface {v0, v1, v8, v11, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    invoke-interface {v0, v1, v5, v11, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    invoke-interface {v0, v1, v6, v11, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    invoke-interface {v0, v1, v4, v11, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v14

    sget-object v15, Lcom/whoop/trends/data/model/MetricEducationV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/MetricEducationV3$$serializer;

    invoke-interface {v0, v1, v7, v15, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/trends/data/model/MetricEducationV3;

    aget-object v15, v2, v9

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v9, v15, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    sget-object v15, Lcom/whoop/design/models/items/ArticleTileCarouselModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ArticleTileCarouselModel$$serializer;

    invoke-interface {v0, v1, v13, v15, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    sget-object v15, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3$$serializer;

    move-object/from16 v30, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v15, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;

    sget-object v15, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v29, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v15, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v28, v2

    sget-object v2, Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3$$serializer;

    move-object/from16 v31, v3

    const/16 v3, 0xd

    invoke-interface {v0, v1, v3, v2, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    move-object/from16 v27, v3

    const/16 v3, 0xe

    invoke-interface {v0, v1, v3, v2, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    sget-object v3, Lcom/whoop/trends/data/model/ManualMeasurementSheet$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/ManualMeasurementSheet$$serializer;

    move-object/from16 v21, v2

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    sget-object v3, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/cards/TextWithIllustrationCardModel$$serializer;

    move-object/from16 v20, v2

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;

    aget-object v3, v30, v26

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move-object/from16 v19, v2

    move/from16 v2, v26

    invoke-interface {v0, v1, v2, v3, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v3, Lcom/whoop/trends/data/model/CardioFitnessLevelModel$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/CardioFitnessLevelModel$$serializer;

    move-object/from16 v26, v2

    const/16 v2, 0x12

    invoke-interface {v0, v1, v2, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;

    aget-object v3, v30, v25

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move-object/from16 v18, v2

    move/from16 v2, v25

    invoke-interface {v0, v1, v2, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    aget-object v3, v30, v24

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move-object/from16 v25, v2

    move/from16 v2, v24

    invoke-interface {v0, v1, v2, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/16 v3, 0x15

    invoke-interface {v0, v1, v3, v15, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    aget-object v15, v30, v23

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v17, v2

    move/from16 v2, v23

    invoke-interface {v0, v1, v2, v15, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v15, Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;

    move-object/from16 v23, v2

    const/16 v2, 0x17

    invoke-interface {v0, v1, v2, v15, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    aget-object v15, v30, v22

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v16, v2

    move/from16 v2, v22

    invoke-interface {v0, v1, v2, v15, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v15, Lcom/whoop/trends/data/model/MetaData$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/MetaData$$serializer;

    move-object/from16 v22, v2

    const/16 v2, 0x19

    invoke-interface {v0, v1, v2, v15, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/trends/data/model/MetaData;

    const v12, 0x3ffffff

    move-object/from16 v83, v2

    move-object/from16 v79, v3

    move-object/from16 v63, v4

    move-object/from16 v61, v5

    move-object/from16 v62, v6

    move-object/from16 v66, v7

    move-object/from16 v60, v8

    move-object/from16 v67, v9

    move-object/from16 v59, v10

    move-object/from16 v64, v11

    move-object/from16 v68, v13

    move-object/from16 v65, v14

    move-object/from16 v81, v16

    move-object/from16 v78, v17

    move-object/from16 v76, v18

    move-object/from16 v74, v19

    move-object/from16 v73, v20

    move-object/from16 v72, v21

    move-object/from16 v82, v22

    move-object/from16 v80, v23

    move-object/from16 v77, v25

    move-object/from16 v75, v26

    move-object/from16 v71, v27

    move-object/from16 v70, v28

    move-object/from16 v69, v29

    move-object/from16 v58, v31

    :goto_0
    move/from16 v57, v12

    goto/16 :goto_a

    :cond_0
    move-object/from16 v30, v2

    move/from16 v40, v9

    move/from16 v53, v10

    move-object v2, v12

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v13, v10

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v35, v15

    move-object/from16 v36, v35

    move-object/from16 v42, v36

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

    move v12, v11

    move-object/from16 v11, v52

    :goto_1
    if-eqz v53, :cond_1

    move-object/from16 v54, v9

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v9

    packed-switch v9, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v9}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v9, Lcom/whoop/trends/data/model/MetaData$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/MetaData$$serializer;

    move/from16 v55, v12

    const/16 v12, 0x19

    invoke-interface {v0, v1, v12, v9, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/trends/data/model/MetaData;

    const/high16 v9, 0x2000000

    :goto_2
    or-int v9, v55, v9

    move v12, v9

    :goto_3
    move-object/from16 v9, v54

    goto :goto_1

    :pswitch_1
    move/from16 v55, v12

    const/16 v9, 0x18

    const/16 v12, 0x19

    aget-object v22, v30, v9

    invoke-interface/range {v22 .. v22}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v22

    move-object/from16 v12, v22

    check-cast v12, Lwc3/b;

    invoke-interface {v0, v1, v9, v12, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    move-object v14, v12

    check-cast v14, Ljava/util/List;

    const/high16 v12, 0x1000000

    :goto_4
    or-int v12, v55, v12

    goto :goto_3

    :pswitch_2
    move/from16 v55, v12

    const/16 v9, 0x18

    sget-object v12, Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;

    const/16 v9, 0x17

    invoke-interface {v0, v1, v9, v12, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    move-object v15, v12

    check-cast v15, Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    const/high16 v12, 0x800000

    goto :goto_4

    :pswitch_3
    move/from16 v55, v12

    const/16 v9, 0x17

    const/16 v12, 0x16

    aget-object v16, v30, v12

    invoke-interface/range {v16 .. v16}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v9, v16

    check-cast v9, Lwc3/b;

    invoke-interface {v0, v1, v12, v9, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    const/high16 v9, 0x400000

    goto :goto_2

    :pswitch_4
    move/from16 v55, v12

    const/16 v12, 0x16

    sget-object v9, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v12, 0x15

    invoke-interface {v0, v1, v12, v9, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const/high16 v9, 0x200000

    goto :goto_2

    :pswitch_5
    move/from16 v55, v12

    const/16 v9, 0x14

    const/16 v12, 0x15

    aget-object v17, v30, v9

    invoke-interface/range {v17 .. v17}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v12, v17

    check-cast v12, Lwc3/b;

    invoke-interface {v0, v1, v9, v12, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    const/high16 v12, 0x100000

    goto :goto_4

    :pswitch_6
    move/from16 v55, v12

    const/16 v9, 0x14

    const/16 v12, 0x13

    aget-object v17, v30, v12

    invoke-interface/range {v17 .. v17}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v9, v17

    check-cast v9, Lwc3/b;

    invoke-interface {v0, v1, v12, v9, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    const/high16 v9, 0x80000

    goto/16 :goto_2

    :pswitch_7
    move/from16 v55, v12

    const/16 v12, 0x13

    sget-object v9, Lcom/whoop/trends/data/model/CardioFitnessLevelModel$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/CardioFitnessLevelModel$$serializer;

    const/16 v12, 0x12

    invoke-interface {v0, v1, v12, v9, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;

    const/high16 v9, 0x40000

    goto/16 :goto_2

    :pswitch_8
    move/from16 v55, v12

    const/16 v9, 0x11

    const/16 v12, 0x12

    aget-object v18, v30, v9

    invoke-interface/range {v18 .. v18}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v12, v18

    check-cast v12, Lwc3/b;

    invoke-interface {v0, v1, v9, v12, v11}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    const/high16 v12, 0x20000

    goto/16 :goto_4

    :pswitch_9
    move/from16 v55, v12

    const/16 v9, 0x11

    sget-object v12, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/cards/TextWithIllustrationCardModel$$serializer;

    const/16 v9, 0x10

    invoke-interface {v0, v1, v9, v12, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;

    const/high16 v12, 0x10000

    goto/16 :goto_4

    :pswitch_a
    move/from16 v55, v12

    const/16 v9, 0x10

    sget-object v12, Lcom/whoop/trends/data/model/ManualMeasurementSheet$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/ManualMeasurementSheet$$serializer;

    const/16 v9, 0xf

    invoke-interface {v0, v1, v9, v12, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    const v12, 0x8000

    goto/16 :goto_4

    :pswitch_b
    move/from16 v55, v12

    const/16 v9, 0xf

    sget-object v12, Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3$$serializer;

    const/16 v9, 0xe

    invoke-interface {v0, v1, v9, v12, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    move/from16 v12, v55

    or-int/lit16 v12, v12, 0x4000

    goto/16 :goto_3

    :pswitch_c
    sget-object v9, Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3$$serializer;

    move-object/from16 v55, v2

    move-object/from16 v27, v3

    move-object/from16 v2, v54

    const/16 v3, 0xd

    invoke-interface {v0, v1, v3, v9, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    or-int/lit16 v12, v12, 0x2000

    move-object/from16 v3, v27

    :goto_5
    move-object/from16 v2, v55

    goto/16 :goto_1

    :pswitch_d
    move-object/from16 v55, v2

    move-object/from16 v27, v3

    move-object/from16 v2, v54

    const/16 v3, 0xd

    sget-object v9, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v28, v2

    move-object/from16 v3, v52

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v9, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v52, v3

    check-cast v52, Ljava/lang/String;

    or-int/lit16 v12, v12, 0x1000

    move-object/from16 v3, v27

    move-object/from16 v9, v28

    goto :goto_5

    :pswitch_e
    move-object/from16 v55, v2

    move-object/from16 v27, v3

    move-object/from16 v3, v52

    move-object/from16 v28, v54

    const/16 v2, 0xc

    sget-object v9, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3$$serializer;

    move-object/from16 v29, v3

    move-object/from16 v2, v51

    const/16 v3, 0xb

    invoke-interface {v0, v1, v3, v9, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v51, v2

    check-cast v51, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;

    or-int/lit16 v12, v12, 0x800

    move-object/from16 v3, v27

    move-object/from16 v9, v28

    move-object/from16 v52, v29

    goto :goto_5

    :pswitch_f
    move-object/from16 v55, v2

    move-object/from16 v27, v3

    move-object/from16 v2, v51

    move-object/from16 v29, v52

    move-object/from16 v28, v54

    const/16 v3, 0xb

    sget-object v9, Lcom/whoop/design/models/items/ArticleTileCarouselModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ArticleTileCarouselModel$$serializer;

    move-object/from16 v41, v2

    move-object/from16 v3, v50

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2, v9, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v50, v3

    check-cast v50, Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    or-int/lit16 v12, v12, 0x400

    move-object/from16 v3, v27

    move-object/from16 v9, v28

    move-object/from16 v51, v41

    goto :goto_5

    :pswitch_10
    move-object/from16 v55, v2

    move-object/from16 v27, v3

    move-object/from16 v3, v50

    move-object/from16 v41, v51

    move-object/from16 v29, v52

    move-object/from16 v28, v54

    const/16 v2, 0xa

    aget-object v9, v30, v40

    invoke-interface {v9}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lwc3/b;

    move/from16 v2, v40

    move-object/from16 v40, v3

    move v3, v2

    move-object/from16 v2, v49

    invoke-interface {v0, v1, v3, v9, v2}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v49, v2

    check-cast v49, Ljava/util/List;

    or-int/lit16 v12, v12, 0x200

    move-object/from16 v9, v28

    move-object/from16 v50, v40

    move-object/from16 v2, v55

    move/from16 v40, v3

    move-object/from16 v3, v27

    goto/16 :goto_1

    :pswitch_11
    move-object/from16 v55, v2

    move-object/from16 v27, v3

    move/from16 v3, v40

    move-object/from16 v2, v49

    move-object/from16 v40, v50

    move-object/from16 v41, v51

    move-object/from16 v29, v52

    move-object/from16 v28, v54

    sget-object v9, Lcom/whoop/trends/data/model/MetricEducationV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/MetricEducationV3$$serializer;

    move-object/from16 v39, v2

    move-object/from16 v3, v48

    const/16 v2, 0x8

    invoke-interface {v0, v1, v2, v9, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v48, v3

    check-cast v48, Lcom/whoop/trends/data/model/MetricEducationV3;

    or-int/lit16 v12, v12, 0x100

    move-object/from16 v3, v27

    move-object/from16 v9, v28

    move-object/from16 v49, v39

    :goto_6
    move-object/from16 v2, v55

    const/16 v40, 0x9

    goto/16 :goto_1

    :pswitch_12
    move-object/from16 v55, v2

    move-object/from16 v27, v3

    move-object/from16 v3, v48

    move-object/from16 v39, v49

    move-object/from16 v40, v50

    move-object/from16 v41, v51

    move-object/from16 v29, v52

    move-object/from16 v28, v54

    const/16 v2, 0x8

    const/4 v9, 0x7

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v36

    or-int/lit16 v12, v12, 0x80

    :goto_7
    move-object/from16 v3, v27

    move-object/from16 v9, v28

    goto :goto_6

    :pswitch_13
    move-object/from16 v55, v2

    move-object/from16 v27, v3

    move-object/from16 v3, v48

    move-object/from16 v39, v49

    move-object/from16 v40, v50

    move-object/from16 v41, v51

    move-object/from16 v29, v52

    move-object/from16 v28, v54

    const/4 v2, 0x6

    const/4 v9, 0x7

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v35

    or-int/lit8 v12, v12, 0x40

    goto :goto_7

    :pswitch_14
    move-object/from16 v55, v2

    move-object/from16 v27, v3

    move-object/from16 v3, v48

    move-object/from16 v39, v49

    move-object/from16 v40, v50

    move-object/from16 v41, v51

    move-object/from16 v29, v52

    move-object/from16 v28, v54

    const/4 v9, 0x7

    sget-object v2, Lcom/whoop/trends/data/model/TimeSegmentDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TimeSegmentDtoV3$$serializer;

    move-object/from16 v38, v3

    move-object/from16 v9, v47

    const/4 v3, 0x5

    invoke-interface {v0, v1, v3, v2, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v47, v2

    check-cast v47, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    or-int/lit8 v12, v12, 0x20

    move-object/from16 v3, v27

    move-object/from16 v9, v28

    move-object/from16 v48, v38

    goto :goto_6

    :pswitch_15
    move-object/from16 v55, v2

    move-object/from16 v27, v3

    move-object/from16 v9, v47

    move-object/from16 v38, v48

    move-object/from16 v39, v49

    move-object/from16 v40, v50

    move-object/from16 v41, v51

    move-object/from16 v29, v52

    move-object/from16 v28, v54

    const/4 v3, 0x5

    sget-object v2, Lcom/whoop/trends/data/model/TimeSegmentDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TimeSegmentDtoV3$$serializer;

    move-object/from16 v37, v4

    move-object/from16 v3, v46

    const/4 v4, 0x4

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v46, v2

    check-cast v46, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    or-int/lit8 v12, v12, 0x10

    :goto_8
    move-object/from16 v3, v27

    move-object/from16 v9, v28

    :goto_9
    move-object/from16 v4, v37

    goto/16 :goto_6

    :pswitch_16
    move-object/from16 v55, v2

    move-object/from16 v27, v3

    move-object/from16 v37, v4

    move-object/from16 v3, v46

    move-object/from16 v9, v47

    move-object/from16 v38, v48

    move-object/from16 v39, v49

    move-object/from16 v40, v50

    move-object/from16 v41, v51

    move-object/from16 v29, v52

    move-object/from16 v28, v54

    const/4 v4, 0x4

    sget-object v2, Lcom/whoop/trends/data/model/TimeSegmentDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TimeSegmentDtoV3$$serializer;

    move-object/from16 v34, v3

    move-object/from16 v4, v45

    const/4 v3, 0x3

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v45, v2

    check-cast v45, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    or-int/lit8 v12, v12, 0x8

    move-object/from16 v3, v27

    move-object/from16 v9, v28

    move-object/from16 v46, v34

    goto :goto_9

    :pswitch_17
    move-object/from16 v55, v2

    move-object/from16 v27, v3

    move-object/from16 v37, v4

    move-object/from16 v4, v45

    move-object/from16 v34, v46

    move-object/from16 v9, v47

    move-object/from16 v38, v48

    move-object/from16 v39, v49

    move-object/from16 v40, v50

    move-object/from16 v41, v51

    move-object/from16 v29, v52

    move-object/from16 v28, v54

    const/4 v3, 0x3

    sget-object v2, Lcom/whoop/trends/data/model/TimeSegmentDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TimeSegmentDtoV3$$serializer;

    move-object/from16 v33, v4

    move-object/from16 v3, v44

    const/4 v4, 0x2

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v44, v2

    check-cast v44, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    or-int/lit8 v12, v12, 0x4

    move-object/from16 v3, v27

    move-object/from16 v9, v28

    move-object/from16 v45, v33

    goto :goto_9

    :pswitch_18
    move-object/from16 v55, v2

    move-object/from16 v27, v3

    move-object/from16 v37, v4

    move-object/from16 v3, v44

    move-object/from16 v33, v45

    move-object/from16 v34, v46

    move-object/from16 v9, v47

    move-object/from16 v38, v48

    move-object/from16 v39, v49

    move-object/from16 v40, v50

    move-object/from16 v41, v51

    move-object/from16 v29, v52

    move-object/from16 v28, v54

    const/4 v4, 0x2

    sget-object v2, Lcom/whoop/trends/data/model/SegmentControllerDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/SegmentControllerDtoV3$$serializer;

    move-object/from16 v32, v3

    move-object/from16 v4, v43

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v43, v2

    check-cast v43, Lcom/whoop/trends/data/model/SegmentControllerDtoV3;

    or-int/lit8 v12, v12, 0x2

    move-object/from16 v3, v27

    move-object/from16 v9, v28

    move-object/from16 v44, v32

    goto/16 :goto_9

    :pswitch_19
    move-object/from16 v55, v2

    move-object/from16 v27, v3

    move-object/from16 v37, v4

    move-object/from16 v4, v43

    move-object/from16 v32, v44

    move-object/from16 v33, v45

    move-object/from16 v34, v46

    move-object/from16 v9, v47

    move-object/from16 v38, v48

    move-object/from16 v39, v49

    move-object/from16 v40, v50

    move-object/from16 v41, v51

    move-object/from16 v29, v52

    move-object/from16 v28, v54

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v42

    or-int/lit8 v12, v12, 0x1

    goto/16 :goto_8

    :pswitch_1a
    move-object/from16 v55, v2

    move-object/from16 v27, v3

    move-object/from16 v37, v4

    move-object/from16 v4, v43

    move-object/from16 v32, v44

    move-object/from16 v33, v45

    move-object/from16 v34, v46

    move-object/from16 v9, v47

    move-object/from16 v38, v48

    move-object/from16 v39, v49

    move-object/from16 v40, v50

    move-object/from16 v41, v51

    move-object/from16 v29, v52

    move-object/from16 v28, v54

    const/4 v2, 0x0

    const/4 v3, 0x1

    move/from16 v53, v2

    goto/16 :goto_8

    :cond_1
    move-object/from16 v55, v2

    move-object/from16 v27, v3

    move-object/from16 v37, v4

    move-object/from16 v28, v9

    move-object/from16 v4, v43

    move-object/from16 v32, v44

    move-object/from16 v33, v45

    move-object/from16 v34, v46

    move-object/from16 v9, v47

    move-object/from16 v38, v48

    move-object/from16 v39, v49

    move-object/from16 v40, v50

    move-object/from16 v41, v51

    move-object/from16 v29, v52

    move-object/from16 v59, v4

    move-object/from16 v78, v5

    move-object/from16 v79, v6

    move-object/from16 v83, v7

    move-object/from16 v77, v8

    move-object/from16 v63, v9

    move-object/from16 v76, v10

    move-object/from16 v75, v11

    move-object/from16 v72, v13

    move-object/from16 v82, v14

    move-object/from16 v81, v15

    move-object/from16 v74, v27

    move-object/from16 v71, v28

    move-object/from16 v70, v29

    move-object/from16 v60, v32

    move-object/from16 v61, v33

    move-object/from16 v62, v34

    move-object/from16 v64, v35

    move-object/from16 v65, v36

    move-object/from16 v80, v37

    move-object/from16 v66, v38

    move-object/from16 v67, v39

    move-object/from16 v68, v40

    move-object/from16 v69, v41

    move-object/from16 v58, v42

    move-object/from16 v73, v55

    goto/16 :goto_0

    :goto_a
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v56, Lcom/whoop/trends/data/model/TrendsDtoV3;

    const/16 v84, 0x0

    invoke-direct/range {v56 .. v84}, Lcom/whoop/trends/data/model/TrendsDtoV3;-><init>(ILjava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Ljava/util/List;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v56

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/trends/data/model/TrendsDtoV3$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/trends/data/model/TrendsDtoV3;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/trends/data/model/TrendsDtoV3$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/trends/data/model/TrendsDtoV3;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/trends/data/model/TrendsDtoV3$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/trends/data/model/TrendsDtoV3;->write$Self$trends_release(Lcom/whoop/trends/data/model/TrendsDtoV3;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/trends/data/model/TrendsDtoV3;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/trends/data/model/TrendsDtoV3$$serializer;->serialize(Lzc3/e;Lcom/whoop/trends/data/model/TrendsDtoV3;)V

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
