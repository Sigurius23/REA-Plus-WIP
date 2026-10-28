.class public final synthetic Lcom/whoop/stress/domain/model/StressMonitorDto$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/stress/domain/model/StressMonitorDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/stress/domain/model/StressMonitorDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/stress/domain/model/StressMonitorDto.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/stress/domain/model/StressMonitorDto;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/stress/domain/model/StressMonitorDto;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/stress/domain/model/StressMonitorDto;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "stress_release"
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

.field public static final INSTANCE:Lcom/whoop/stress/domain/model/StressMonitorDto$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/stress/domain/model/StressMonitorDto$$serializer;

    invoke-direct {v0}, Lcom/whoop/stress/domain/model/StressMonitorDto$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/stress/domain/model/StressMonitorDto$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressMonitorDto$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/stress/domain/model/StressMonitorDto$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.stress.domain.model.StressMonitorDto"

    const/16 v3, 0x18

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "title"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "loading_data"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "stress_state"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "show_connectivity_window"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "gauge"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "vow"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "whoop_coach_vow"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "stress_graph"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "typeform_url"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "last_updated_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "onboarding_carousel"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sessions"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "education_carousel"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "show_education"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "calibration_text_display"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "pending_activity_dialogue"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "onboarding_dismiss_dialogue"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "previous_stress_graph"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "trend"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "date_selector"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "extended24_hour_graph"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "trend_list"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "progress_stepper"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "metadata"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/stress/domain/model/StressMonitorDto$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/stress/domain/model/StressMonitorDto;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0x18

    new-array v1, v1, [Lwc3/c;

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v3, Lcom/whoop/stress/domain/model/LoadingData$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/LoadingData$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v1, v4

    const/4 v3, 0x2

    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v1, v3

    sget-object v3, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/4 v4, 0x3

    aput-object v3, v1, v4

    const/4 v4, 0x4

    sget-object v5, Lcom/whoop/stress/domain/model/StressMonitorMeterDto$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressMonitorMeterDto$$serializer;

    aput-object v5, v1, v4

    sget-object v4, Lcom/whoop/stress/domain/model/StressMonitorVow$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressMonitorVow$$serializer;

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    const/4 v5, 0x5

    aput-object v4, v1, v5

    sget-object v4, Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    const/4 v5, 0x6

    aput-object v4, v1, v5

    sget-object v4, Lcom/whoop/design/models/items/graph/StressGraphingCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/StressGraphingCardModel$$serializer;

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    const/4 v6, 0x7

    aput-object v5, v1, v6

    const/16 v5, 0x8

    aput-object v2, v1, v5

    const/16 v5, 0x9

    aput-object v2, v1, v5

    sget-object v5, Lcom/whoop/design/models/items/ArticleTileCarouselModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ArticleTileCarouselModel$$serializer;

    invoke-static {v5}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v6

    const/16 v7, 0xa

    aput-object v6, v1, v7

    const/16 v6, 0xb

    invoke-static {v5}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v7

    aput-object v7, v1, v6

    const/16 v6, 0xc

    invoke-static {v5}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    aput-object v5, v1, v6

    const/16 v5, 0xd

    aput-object v3, v1, v5

    const/16 v3, 0xe

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    aput-object v2, v1, v3

    sget-object v2, Lcom/whoop/stress/domain/model/PendingActivityDialogue$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/PendingActivityDialogue$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/16 v3, 0xf

    aput-object v2, v1, v3

    sget-object v2, Lcom/whoop/stress/domain/model/OnboardingDismissDialog$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/OnboardingDismissDialog$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/16 v3, 0x10

    aput-object v2, v1, v3

    const/16 v2, 0x11

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v2

    sget-object v2, Lcom/whoop/stress/domain/model/StressTrend$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressTrend$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/16 v3, 0x12

    aput-object v2, v1, v3

    sget-object v2, Lcom/whoop/stress/domain/model/StressDateSelector$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressDateSelector$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/16 v3, 0x13

    aput-object v2, v1, v3

    const/16 v2, 0x14

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0x15

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    aput-object v0, v1, v2

    sget-object v0, Lcom/whoop/design/models/items/StepperComponentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/StepperComponentModel$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v2, 0x16

    aput-object v0, v1, v2

    sget-object v0, Lcom/whoop/stress/domain/model/MetaData$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/MetaData$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v2, 0x17

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/stress/domain/model/StressMonitorDto;
    .locals 78

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/stress/domain/model/StressMonitorDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/stress/domain/model/StressMonitorDto;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v15, 0xa

    const/16 v4, 0x9

    const/4 v5, 0x7

    const/4 v6, 0x6

    const/4 v7, 0x5

    const/4 v8, 0x3

    const/16 v9, 0x8

    const/4 v10, 0x4

    const/16 v24, 0x15

    const/4 v11, 0x2

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    sget-object v13, Lcom/whoop/stress/domain/model/LoadingData$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/LoadingData$$serializer;

    invoke-interface {v0, v1, v12, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/whoop/stress/domain/model/LoadingData;

    aget-object v13, v2, v11

    invoke-interface {v13}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lwc3/b;

    invoke-interface {v0, v1, v11, v13, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/design/models/items/graph/stress/StressState;

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v8

    sget-object v13, Lcom/whoop/stress/domain/model/StressMonitorMeterDto$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressMonitorMeterDto$$serializer;

    invoke-interface {v0, v1, v10, v13, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;

    sget-object v13, Lcom/whoop/stress/domain/model/StressMonitorVow$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressMonitorVow$$serializer;

    invoke-interface {v0, v1, v7, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/stress/domain/model/StressMonitorVow;

    sget-object v13, Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;

    invoke-interface {v0, v1, v6, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/models/items/WhoopCoachVowModel;

    sget-object v13, Lcom/whoop/design/models/items/graph/StressGraphingCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/StressGraphingCardModel$$serializer;

    invoke-interface {v0, v1, v5, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    invoke-interface {v0, v1, v9}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v28, v2

    sget-object v2, Lcom/whoop/design/models/items/ArticleTileCarouselModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ArticleTileCarouselModel$$serializer;

    invoke-interface {v0, v1, v15, v2, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    move-object/from16 v29, v3

    const/16 v3, 0xb

    invoke-interface {v0, v1, v3, v2, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    move-object/from16 v27, v3

    const/16 v3, 0xc

    invoke-interface {v0, v1, v3, v2, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    const/16 v3, 0xd

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v3

    move-object/from16 v25, v2

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move/from16 v26, v3

    const/16 v3, 0xe

    invoke-interface {v0, v1, v3, v2, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v3, Lcom/whoop/stress/domain/model/PendingActivityDialogue$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/PendingActivityDialogue$$serializer;

    move-object/from16 v23, v2

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2, v3, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/stress/domain/model/PendingActivityDialogue;

    sget-object v3, Lcom/whoop/stress/domain/model/OnboardingDismissDialog$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/OnboardingDismissDialog$$serializer;

    move-object/from16 v22, v2

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2, v3, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/stress/domain/model/OnboardingDismissDialog;

    const/16 v3, 0x11

    invoke-interface {v0, v1, v3, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    move-object/from16 v20, v2

    sget-object v2, Lcom/whoop/stress/domain/model/StressTrend$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressTrend$$serializer;

    move-object/from16 v21, v3

    const/16 v3, 0x12

    invoke-interface {v0, v1, v3, v2, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/stress/domain/model/StressTrend;

    sget-object v3, Lcom/whoop/stress/domain/model/StressDateSelector$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressDateSelector$$serializer;

    move-object/from16 v19, v2

    const/16 v2, 0x13

    invoke-interface {v0, v1, v2, v3, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/stress/domain/model/StressDateSelector;

    const/16 v3, 0x14

    invoke-interface {v0, v1, v3, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    aget-object v13, v28, v24

    invoke-interface {v13}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lwc3/b;

    move-object/from16 v17, v2

    move/from16 v2, v24

    invoke-interface {v0, v1, v2, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v13, Lcom/whoop/design/models/items/StepperComponentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/StepperComponentModel$$serializer;

    move-object/from16 v18, v2

    const/16 v2, 0x16

    invoke-interface {v0, v1, v2, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/StepperComponentModel;

    sget-object v13, Lcom/whoop/stress/domain/model/MetaData$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/MetaData$$serializer;

    move-object/from16 v16, v2

    const/16 v2, 0x17

    invoke-interface {v0, v1, v2, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/stress/domain/model/MetaData;

    const v13, 0xffffff

    move-object/from16 v76, v2

    move-object/from16 v73, v3

    move-object/from16 v62, v4

    move-object/from16 v59, v6

    move-object/from16 v58, v7

    move/from16 v56, v8

    move-object/from16 v61, v9

    move-object/from16 v57, v10

    move-object/from16 v55, v11

    move-object/from16 v54, v12

    move/from16 v52, v13

    move-object/from16 v63, v15

    move-object/from16 v75, v16

    move-object/from16 v72, v17

    move-object/from16 v74, v18

    move-object/from16 v71, v19

    move-object/from16 v69, v20

    move-object/from16 v70, v21

    move-object/from16 v68, v22

    move-object/from16 v67, v23

    move-object/from16 v65, v25

    move/from16 v66, v26

    move-object/from16 v64, v27

    :goto_0
    move-object/from16 v60, v5

    move-object/from16 v53, v29

    goto/16 :goto_c

    :cond_0
    move-object/from16 v28, v2

    move/from16 v31, v11

    move/from16 v48, v12

    move/from16 v40, v13

    move/from16 v41, v40

    move-object v2, v14

    move-object v3, v2

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

    move-object/from16 v29, v15

    move-object/from16 v35, v29

    move-object/from16 v36, v35

    move-object/from16 v42, v36

    move-object/from16 v43, v42

    move-object/from16 v44, v43

    move-object/from16 v45, v44

    move-object/from16 v46, v45

    move-object/from16 v47, v46

    move/from16 v14, v41

    move-object/from16 v13, v47

    :goto_1
    if-eqz v48, :cond_1

    move-object/from16 v49, v6

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v6

    packed-switch v6, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v6}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v6, Lcom/whoop/stress/domain/model/MetaData$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/MetaData$$serializer;

    move-object/from16 v50, v5

    const/16 v5, 0x17

    invoke-interface {v0, v1, v5, v6, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lcom/whoop/stress/domain/model/MetaData;

    const/high16 v6, 0x800000

    :goto_2
    or-int/2addr v14, v6

    :goto_3
    move-object/from16 v6, v49

    move-object/from16 v5, v50

    goto :goto_1

    :pswitch_1
    move-object/from16 v50, v5

    const/16 v5, 0x17

    sget-object v6, Lcom/whoop/design/models/items/StepperComponentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/StepperComponentModel$$serializer;

    const/16 v5, 0x16

    invoke-interface {v0, v1, v5, v6, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Lcom/whoop/design/models/items/StepperComponentModel;

    const/high16 v6, 0x400000

    goto :goto_2

    :pswitch_2
    move-object/from16 v50, v5

    const/16 v5, 0x16

    const/16 v6, 0x15

    aget-object v16, v28, v6

    invoke-interface/range {v16 .. v16}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v5, v16

    check-cast v5, Lwc3/b;

    invoke-interface {v0, v1, v6, v5, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Ljava/util/List;

    const/high16 v5, 0x200000

    :goto_4
    or-int/2addr v14, v5

    goto :goto_3

    :pswitch_3
    move-object/from16 v50, v5

    const/16 v6, 0x15

    sget-object v5, Lcom/whoop/design/models/items/graph/StressGraphingCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/StressGraphingCardModel$$serializer;

    const/16 v6, 0x14

    invoke-interface {v0, v1, v6, v5, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v11, v5

    check-cast v11, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    const/high16 v5, 0x100000

    goto :goto_4

    :pswitch_4
    move-object/from16 v50, v5

    const/16 v6, 0x14

    sget-object v5, Lcom/whoop/stress/domain/model/StressDateSelector$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressDateSelector$$serializer;

    const/16 v6, 0x13

    invoke-interface {v0, v1, v6, v5, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v12, v5

    check-cast v12, Lcom/whoop/stress/domain/model/StressDateSelector;

    const/high16 v5, 0x80000

    goto :goto_4

    :pswitch_5
    move-object/from16 v50, v5

    const/16 v6, 0x13

    sget-object v5, Lcom/whoop/stress/domain/model/StressTrend$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressTrend$$serializer;

    const/16 v6, 0x12

    invoke-interface {v0, v1, v6, v5, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v13, v5

    check-cast v13, Lcom/whoop/stress/domain/model/StressTrend;

    const/high16 v5, 0x40000

    goto :goto_4

    :pswitch_6
    move-object/from16 v50, v5

    const/16 v6, 0x12

    sget-object v5, Lcom/whoop/design/models/items/graph/StressGraphingCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/StressGraphingCardModel$$serializer;

    const/16 v6, 0x11

    invoke-interface {v0, v1, v6, v5, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    const/high16 v5, 0x20000

    goto :goto_4

    :pswitch_7
    move-object/from16 v50, v5

    const/16 v6, 0x11

    sget-object v5, Lcom/whoop/stress/domain/model/OnboardingDismissDialog$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/OnboardingDismissDialog$$serializer;

    const/16 v6, 0x10

    invoke-interface {v0, v1, v6, v5, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/stress/domain/model/OnboardingDismissDialog;

    const/high16 v5, 0x10000

    goto :goto_4

    :pswitch_8
    move-object/from16 v50, v5

    const/16 v6, 0x10

    sget-object v5, Lcom/whoop/stress/domain/model/PendingActivityDialogue$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/PendingActivityDialogue$$serializer;

    const/16 v6, 0xf

    invoke-interface {v0, v1, v6, v5, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v15, v5

    check-cast v15, Lcom/whoop/stress/domain/model/PendingActivityDialogue;

    const v5, 0x8000

    goto :goto_4

    :pswitch_9
    move-object/from16 v50, v5

    const/16 v6, 0xf

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v6, 0xe

    invoke-interface {v0, v1, v6, v5, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    or-int/lit16 v14, v14, 0x4000

    goto/16 :goto_3

    :pswitch_a
    move-object/from16 v50, v5

    const/16 v5, 0xd

    const/16 v6, 0xe

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v41

    or-int/lit16 v14, v14, 0x2000

    goto/16 :goto_3

    :pswitch_b
    move-object/from16 v50, v5

    const/16 v6, 0xe

    sget-object v5, Lcom/whoop/design/models/items/ArticleTileCarouselModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ArticleTileCarouselModel$$serializer;

    const/16 v6, 0xc

    invoke-interface {v0, v1, v6, v5, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    or-int/lit16 v14, v14, 0x1000

    goto/16 :goto_3

    :pswitch_c
    move-object/from16 v50, v5

    const/16 v6, 0xc

    sget-object v5, Lcom/whoop/design/models/items/ArticleTileCarouselModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ArticleTileCarouselModel$$serializer;

    move-object/from16 v27, v2

    move-object/from16 v6, v50

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v5, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    or-int/lit16 v14, v14, 0x800

    move-object/from16 v2, v27

    move-object/from16 v6, v49

    goto/16 :goto_1

    :pswitch_d
    move-object/from16 v27, v2

    move-object v6, v5

    const/16 v2, 0xb

    sget-object v5, Lcom/whoop/design/models/items/ArticleTileCarouselModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ArticleTileCarouselModel$$serializer;

    move-object/from16 v39, v3

    move-object/from16 v2, v49

    const/16 v3, 0xa

    invoke-interface {v0, v1, v3, v5, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    or-int/lit16 v14, v14, 0x400

    :goto_5
    move-object v5, v6

    move-object/from16 v3, v39

    move-object v6, v2

    :goto_6
    move-object/from16 v2, v27

    goto/16 :goto_1

    :pswitch_e
    move-object/from16 v27, v2

    move-object/from16 v39, v3

    move-object v6, v5

    move-object/from16 v2, v49

    const/16 v3, 0xa

    const/16 v5, 0x9

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v36

    or-int/lit16 v14, v14, 0x200

    goto :goto_5

    :pswitch_f
    move-object/from16 v27, v2

    move-object/from16 v39, v3

    move-object v6, v5

    move-object/from16 v2, v49

    const/16 v3, 0x8

    const/16 v5, 0x9

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v35

    or-int/lit16 v14, v14, 0x100

    goto :goto_5

    :pswitch_10
    move-object/from16 v27, v2

    move-object/from16 v39, v3

    move-object v6, v5

    move-object/from16 v2, v49

    const/16 v5, 0x9

    sget-object v3, Lcom/whoop/design/models/items/graph/StressGraphingCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/StressGraphingCardModel$$serializer;

    move-object/from16 v38, v2

    move-object/from16 v5, v47

    const/4 v2, 0x7

    invoke-interface {v0, v1, v2, v3, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v47, v3

    check-cast v47, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    or-int/lit16 v14, v14, 0x80

    move-object v5, v6

    move-object/from16 v2, v27

    :goto_7
    move-object/from16 v6, v38

    move-object/from16 v3, v39

    goto/16 :goto_1

    :pswitch_11
    move-object/from16 v27, v2

    move-object/from16 v39, v3

    move-object v6, v5

    move-object/from16 v5, v47

    move-object/from16 v38, v49

    const/4 v2, 0x7

    sget-object v3, Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;

    move-object/from16 v37, v4

    move-object/from16 v2, v46

    const/4 v4, 0x6

    invoke-interface {v0, v1, v4, v3, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v46, v2

    check-cast v46, Lcom/whoop/design/models/items/WhoopCoachVowModel;

    or-int/lit8 v14, v14, 0x40

    :goto_8
    move-object v5, v6

    move-object/from16 v2, v27

    :goto_9
    move-object/from16 v4, v37

    goto :goto_7

    :pswitch_12
    move-object/from16 v27, v2

    move-object/from16 v39, v3

    move-object/from16 v37, v4

    move-object v6, v5

    move-object/from16 v2, v46

    move-object/from16 v5, v47

    move-object/from16 v38, v49

    const/4 v4, 0x6

    sget-object v3, Lcom/whoop/stress/domain/model/StressMonitorVow$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressMonitorVow$$serializer;

    move-object/from16 v34, v2

    move-object/from16 v4, v45

    const/4 v2, 0x5

    invoke-interface {v0, v1, v2, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v45, v3

    check-cast v45, Lcom/whoop/stress/domain/model/StressMonitorVow;

    or-int/lit8 v14, v14, 0x20

    move-object v5, v6

    move-object/from16 v2, v27

    move-object/from16 v46, v34

    goto :goto_9

    :pswitch_13
    move-object/from16 v27, v2

    move-object/from16 v39, v3

    move-object/from16 v37, v4

    move-object v6, v5

    move-object/from16 v4, v45

    move-object/from16 v34, v46

    move-object/from16 v5, v47

    move-object/from16 v38, v49

    const/4 v2, 0x5

    sget-object v3, Lcom/whoop/stress/domain/model/StressMonitorMeterDto$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressMonitorMeterDto$$serializer;

    move-object/from16 v33, v4

    move-object/from16 v2, v44

    const/4 v4, 0x4

    invoke-interface {v0, v1, v4, v3, v2}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v44, v2

    check-cast v44, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;

    or-int/lit8 v14, v14, 0x10

    move-object v5, v6

    move-object/from16 v2, v27

    move-object/from16 v45, v33

    goto :goto_9

    :pswitch_14
    move-object/from16 v27, v2

    move-object/from16 v39, v3

    move-object/from16 v37, v4

    move-object v6, v5

    move-object/from16 v2, v44

    move-object/from16 v33, v45

    move-object/from16 v34, v46

    move-object/from16 v5, v47

    move-object/from16 v38, v49

    const/4 v3, 0x3

    const/4 v4, 0x4

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v40

    or-int/lit8 v14, v14, 0x8

    goto :goto_8

    :pswitch_15
    move-object/from16 v27, v2

    move-object/from16 v39, v3

    move-object/from16 v37, v4

    move-object v6, v5

    move-object/from16 v2, v44

    move-object/from16 v33, v45

    move-object/from16 v34, v46

    move-object/from16 v5, v47

    move-object/from16 v38, v49

    const/4 v3, 0x3

    const/4 v4, 0x4

    aget-object v32, v28, v31

    invoke-interface/range {v32 .. v32}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v32

    move-object/from16 v3, v32

    check-cast v3, Lwc3/b;

    move/from16 v4, v31

    move-object/from16 v31, v2

    move v2, v4

    move-object/from16 v4, v43

    invoke-interface {v0, v1, v2, v3, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v43, v3

    check-cast v43, Lcom/whoop/design/models/items/graph/stress/StressState;

    or-int/lit8 v14, v14, 0x4

    move-object v5, v6

    move-object/from16 v44, v31

    move-object/from16 v4, v37

    move-object/from16 v6, v38

    move-object/from16 v3, v39

    move/from16 v31, v2

    goto/16 :goto_6

    :pswitch_16
    move-object/from16 v27, v2

    move-object/from16 v39, v3

    move-object/from16 v37, v4

    move-object v6, v5

    move/from16 v2, v31

    move-object/from16 v4, v43

    move-object/from16 v31, v44

    move-object/from16 v33, v45

    move-object/from16 v34, v46

    move-object/from16 v5, v47

    move-object/from16 v38, v49

    sget-object v3, Lcom/whoop/stress/domain/model/LoadingData$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/LoadingData$$serializer;

    move-object/from16 v30, v4

    move-object/from16 v2, v42

    const/4 v4, 0x1

    invoke-interface {v0, v1, v4, v3, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v42, v2

    check-cast v42, Lcom/whoop/stress/domain/model/LoadingData;

    or-int/lit8 v14, v14, 0x2

    move-object v5, v6

    move-object/from16 v2, v27

    move-object/from16 v43, v30

    :goto_a
    move-object/from16 v4, v37

    move-object/from16 v6, v38

    move-object/from16 v3, v39

    const/16 v31, 0x2

    goto/16 :goto_1

    :pswitch_17
    move-object/from16 v27, v2

    move-object/from16 v39, v3

    move-object/from16 v37, v4

    move-object v6, v5

    move-object/from16 v2, v42

    move-object/from16 v30, v43

    move-object/from16 v31, v44

    move-object/from16 v33, v45

    move-object/from16 v34, v46

    move-object/from16 v5, v47

    move-object/from16 v38, v49

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v29

    or-int/lit8 v14, v14, 0x1

    :goto_b
    move-object v5, v6

    move-object/from16 v2, v27

    goto :goto_a

    :pswitch_18
    move-object/from16 v27, v2

    move-object/from16 v39, v3

    move-object/from16 v37, v4

    move-object v6, v5

    move-object/from16 v2, v42

    move-object/from16 v30, v43

    move-object/from16 v31, v44

    move-object/from16 v33, v45

    move-object/from16 v34, v46

    move-object/from16 v5, v47

    move-object/from16 v38, v49

    const/4 v3, 0x0

    const/4 v4, 0x1

    move/from16 v48, v3

    goto :goto_b

    :cond_1
    move-object/from16 v27, v2

    move-object/from16 v39, v3

    move-object/from16 v37, v4

    move-object/from16 v38, v6

    move-object/from16 v2, v42

    move-object/from16 v30, v43

    move-object/from16 v31, v44

    move-object/from16 v33, v45

    move-object/from16 v34, v46

    move-object v6, v5

    move-object/from16 v5, v47

    move-object/from16 v54, v2

    move-object/from16 v64, v6

    move-object/from16 v76, v7

    move-object/from16 v74, v8

    move-object/from16 v65, v9

    move-object/from16 v75, v10

    move-object/from16 v73, v11

    move-object/from16 v72, v12

    move-object/from16 v71, v13

    move/from16 v52, v14

    move-object/from16 v68, v15

    move-object/from16 v69, v27

    move-object/from16 v55, v30

    move-object/from16 v57, v31

    move-object/from16 v58, v33

    move-object/from16 v59, v34

    move-object/from16 v61, v35

    move-object/from16 v62, v36

    move-object/from16 v67, v37

    move-object/from16 v63, v38

    move-object/from16 v70, v39

    move/from16 v56, v40

    move/from16 v66, v41

    goto/16 :goto_0

    :goto_c
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v51, Lcom/whoop/stress/domain/model/StressMonitorDto;

    const/16 v77, 0x0

    invoke-direct/range {v51 .. v77}, Lcom/whoop/stress/domain/model/StressMonitorDto;-><init>(ILjava/lang/String;Lcom/whoop/stress/domain/model/LoadingData;Lcom/whoop/design/models/items/graph/stress/StressState;ZLcom/whoop/stress/domain/model/StressMonitorMeterDto;Lcom/whoop/stress/domain/model/StressMonitorVow;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;ZLjava/lang/String;Lcom/whoop/stress/domain/model/PendingActivityDialogue;Lcom/whoop/stress/domain/model/OnboardingDismissDialog;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lcom/whoop/stress/domain/model/StressTrend;Lcom/whoop/stress/domain/model/StressDateSelector;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/util/List;Lcom/whoop/design/models/items/StepperComponentModel;Lcom/whoop/stress/domain/model/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v51

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/stress/domain/model/StressMonitorDto$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/stress/domain/model/StressMonitorDto;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/stress/domain/model/StressMonitorDto$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/stress/domain/model/StressMonitorDto;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/stress/domain/model/StressMonitorDto$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/stress/domain/model/StressMonitorDto;->write$Self$stress_release(Lcom/whoop/stress/domain/model/StressMonitorDto;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/stress/domain/model/StressMonitorDto;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/stress/domain/model/StressMonitorDto$$serializer;->serialize(Lzc3/e;Lcom/whoop/stress/domain/model/StressMonitorDto;)V

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
