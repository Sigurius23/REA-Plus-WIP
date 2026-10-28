.class public final synthetic Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "hormonal-insights_release"
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

.field public static final INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$$serializer;

    invoke-direct {v0}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.hormonalinsights.pregnancyinsights.domain.models.PregnancyInsightsResponse"

    const/16 v3, 0x12

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "pregnancyId"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "navigationTitle"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "datePicker"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "header"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "congratulationsHeader"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "style"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "buttons"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "segmentedControlDisplays"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "selectedButtonId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "segmentedControlDisplayId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "currentTrimesterGraphs"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "overviewGraphs"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "currentTrimesterVows"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "overviewVows"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "belowGraphContent"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "bottomSheet"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "haveYouDeliveredDialog"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "deletePregnancyDialog"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0x12

    new-array v1, v1, [Lwc3/c;

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v3, 0x1

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    sget-object v3, Lcom/whoop/design/models/items/DateSelectorModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DateSelectorModel$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v1, v4

    sget-object v3, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v1, v4

    sget-object v3, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/4 v4, 0x4

    aput-object v3, v1, v4

    const/4 v3, 0x5

    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v1, v3

    const/4 v3, 0x6

    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v1, v3

    const/4 v3, 0x7

    aget-object v4, v0, v3

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwc3/c;

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

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

    aput-object v3, v1, v2

    const/16 v2, 0xb

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

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

    check-cast v3, Lwc3/c;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0xe

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v2

    sget-object v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v2, 0xf

    aput-object v0, v1, v2

    const/16 v0, 0x10

    sget-object v2, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel$$serializer;

    aput-object v2, v1, v0

    sget-object v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v2, 0x11

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;
    .locals 62

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/4 v6, 0x3

    const/16 v8, 0x8

    const/4 v9, 0x4

    const/4 v10, 0x2

    const/16 v15, 0xa

    const/16 v4, 0x9

    const/4 v7, 0x7

    const/4 v5, 0x6

    const/16 v18, 0xe

    const/4 v11, 0x5

    const/16 v19, 0xd

    const/4 v12, 0x1

    const/16 v20, 0xc

    const/4 v13, 0x0

    const/16 v21, 0xb

    const/4 v14, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    sget-object v13, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v12, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    sget-object v13, Lcom/whoop/design/models/items/DateSelectorModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DateSelectorModel$$serializer;

    invoke-interface {v0, v1, v10, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/design/models/items/DateSelectorModel;

    sget-object v13, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader$$serializer;

    invoke-interface {v0, v1, v6, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;

    sget-object v13, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader$$serializer;

    invoke-interface {v0, v1, v9, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;

    aget-object v13, v2, v11

    invoke-interface {v13}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lwc3/b;

    invoke-interface {v0, v1, v11, v13, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;

    aget-object v13, v2, v5

    invoke-interface {v13}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lwc3/b;

    invoke-interface {v0, v1, v5, v13, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    aget-object v13, v2, v7

    invoke-interface {v13}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lwc3/b;

    invoke-interface {v0, v1, v7, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v8

    aget-object v13, v2, v4

    invoke-interface {v13}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lwc3/b;

    invoke-interface {v0, v1, v4, v13, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;

    aget-object v13, v2, v15

    invoke-interface {v13}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lwc3/b;

    invoke-interface {v0, v1, v15, v13, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map;

    aget-object v15, v2, v21

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v22, v2

    move/from16 v2, v21

    invoke-interface {v0, v1, v2, v15, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    aget-object v15, v22, v20

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v21, v2

    move/from16 v2, v20

    invoke-interface {v0, v1, v2, v15, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    aget-object v15, v22, v19

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v20, v2

    move/from16 v2, v19

    invoke-interface {v0, v1, v2, v15, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    aget-object v15, v22, v18

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    move-object/from16 v19, v2

    move/from16 v2, v18

    invoke-interface {v0, v1, v2, v15, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v15, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet$$serializer;

    move-object/from16 v18, v2

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2, v15, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;

    sget-object v15, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel$$serializer;

    move-object/from16 v17, v2

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2, v15, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;

    sget-object v15, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog$$serializer;

    move-object/from16 v16, v2

    const/16 v2, 0x11

    invoke-interface {v0, v1, v2, v15, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;

    const v14, 0x3ffff

    move-object/from16 v60, v2

    move-object/from16 v43, v3

    move-object/from16 v52, v4

    move-object/from16 v49, v5

    move-object/from16 v46, v6

    move-object/from16 v50, v7

    move-object/from16 v51, v8

    move-object/from16 v47, v9

    move-object/from16 v45, v10

    move-object/from16 v48, v11

    move-object/from16 v44, v12

    move-object/from16 v53, v13

    move-object/from16 v59, v16

    move-object/from16 v58, v17

    move-object/from16 v57, v18

    move-object/from16 v56, v19

    move-object/from16 v55, v20

    move-object/from16 v54, v21

    :goto_0
    move/from16 v42, v14

    goto/16 :goto_b

    :cond_0
    move-object/from16 v22, v2

    move/from16 v32, v4

    move/from16 v29, v5

    move/from16 v30, v7

    move/from16 v27, v11

    move/from16 v38, v12

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

    move-object/from16 v28, v12

    move-object/from16 v34, v28

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move/from16 v33, v15

    move v14, v13

    move-object/from16 v13, v37

    move-object v15, v13

    :goto_1
    if-eqz v38, :cond_1

    move-object/from16 v39, v10

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v10

    packed-switch v10, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v10}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v10, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog$$serializer;

    move-object/from16 v40, v6

    const/16 v6, 0x11

    invoke-interface {v0, v1, v6, v10, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;

    const/high16 v10, 0x20000

    :goto_2
    or-int/2addr v14, v10

    :goto_3
    move-object/from16 v10, v39

    move-object/from16 v6, v40

    goto :goto_1

    :pswitch_1
    move-object/from16 v40, v6

    const/16 v6, 0x11

    sget-object v10, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel$$serializer;

    const/16 v6, 0x10

    invoke-interface {v0, v1, v6, v10, v13}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    move-object v13, v10

    check-cast v13, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;

    const/high16 v10, 0x10000

    goto :goto_2

    :pswitch_2
    move-object/from16 v40, v6

    const/16 v6, 0x10

    sget-object v10, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet$$serializer;

    const/16 v6, 0xf

    invoke-interface {v0, v1, v6, v10, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;

    const v10, 0x8000

    goto :goto_2

    :pswitch_3
    move-object/from16 v40, v6

    const/16 v6, 0xf

    const/16 v10, 0xe

    aget-object v17, v22, v10

    invoke-interface/range {v17 .. v17}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v6, v17

    check-cast v6, Lwc3/b;

    invoke-interface {v0, v1, v10, v6, v2}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    or-int/lit16 v14, v14, 0x4000

    goto :goto_3

    :pswitch_4
    move-object/from16 v40, v6

    const/16 v6, 0xd

    const/16 v10, 0xe

    aget-object v17, v22, v6

    invoke-interface/range {v17 .. v17}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v10, v17

    check-cast v10, Lwc3/b;

    invoke-interface {v0, v1, v6, v10, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    move-object v15, v10

    check-cast v15, Ljava/util/Map;

    or-int/lit16 v14, v14, 0x2000

    goto :goto_3

    :pswitch_5
    move-object/from16 v40, v6

    const/16 v6, 0xd

    const/16 v10, 0xc

    aget-object v17, v22, v10

    invoke-interface/range {v17 .. v17}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v6, v17

    check-cast v6, Lwc3/b;

    invoke-interface {v0, v1, v10, v6, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    or-int/lit16 v14, v14, 0x1000

    goto :goto_3

    :pswitch_6
    move-object/from16 v40, v6

    const/16 v6, 0xb

    const/16 v10, 0xc

    aget-object v17, v22, v6

    invoke-interface/range {v17 .. v17}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v10, v17

    check-cast v10, Lwc3/b;

    invoke-interface {v0, v1, v6, v10, v8}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map;

    or-int/lit16 v14, v14, 0x800

    goto/16 :goto_3

    :pswitch_7
    move-object/from16 v40, v6

    const/16 v6, 0xb

    aget-object v10, v22, v33

    invoke-interface {v10}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lwc3/b;

    move/from16 v6, v33

    invoke-interface {v0, v1, v6, v10, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map;

    or-int/lit16 v14, v14, 0x400

    goto/16 :goto_3

    :pswitch_8
    move-object/from16 v40, v6

    move/from16 v6, v33

    aget-object v10, v22, v32

    invoke-interface {v10}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lwc3/b;

    move/from16 v6, v32

    invoke-interface {v0, v1, v6, v10, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;

    or-int/lit16 v14, v14, 0x200

    :goto_4
    move-object/from16 v10, v39

    move-object/from16 v6, v40

    :goto_5
    const/16 v33, 0xa

    goto/16 :goto_1

    :pswitch_9
    move-object/from16 v40, v6

    move/from16 v6, v32

    const/16 v10, 0x8

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v28

    or-int/lit16 v14, v14, 0x100

    goto :goto_4

    :pswitch_a
    move-object/from16 v40, v6

    move/from16 v6, v32

    const/16 v10, 0x8

    aget-object v31, v22, v30

    invoke-interface/range {v31 .. v31}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v31

    move-object/from16 v6, v31

    check-cast v6, Lwc3/b;

    move/from16 v10, v30

    invoke-interface {v0, v1, v10, v6, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v11, v6

    check-cast v11, Ljava/util/List;

    or-int/lit16 v14, v14, 0x80

    move-object/from16 v10, v39

    move-object/from16 v6, v40

    :goto_6
    const/16 v32, 0x9

    goto :goto_5

    :pswitch_b
    move-object/from16 v40, v6

    move/from16 v10, v30

    aget-object v6, v22, v29

    invoke-interface {v6}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lwc3/b;

    move/from16 v10, v29

    invoke-interface {v0, v1, v10, v6, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Ljava/util/List;

    or-int/lit8 v14, v14, 0x40

    move-object/from16 v10, v39

    move-object/from16 v6, v40

    :goto_7
    const/16 v30, 0x7

    goto :goto_6

    :pswitch_c
    move-object/from16 v40, v6

    move/from16 v10, v29

    aget-object v6, v22, v27

    invoke-interface {v6}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lwc3/b;

    move/from16 v10, v27

    move-object/from16 v27, v2

    move v2, v10

    move-object/from16 v10, v40

    invoke-interface {v0, v1, v2, v6, v10}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;

    or-int/lit8 v14, v14, 0x20

    move-object/from16 v10, v27

    move/from16 v27, v2

    move-object v2, v10

    move-object/from16 v10, v39

    :goto_8
    const/16 v29, 0x6

    goto :goto_7

    :pswitch_d
    move/from16 v10, v27

    move-object/from16 v27, v2

    move v2, v10

    move-object v10, v6

    sget-object v6, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader$$serializer;

    move-object/from16 v26, v3

    move-object/from16 v2, v39

    const/4 v3, 0x4

    invoke-interface {v0, v1, v3, v6, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;

    or-int/lit8 v14, v14, 0x10

    move-object v6, v10

    move-object/from16 v3, v26

    const/16 v29, 0x6

    const/16 v30, 0x7

    const/16 v32, 0x9

    const/16 v33, 0xa

    move-object v10, v2

    move-object/from16 v2, v27

    const/16 v27, 0x5

    goto/16 :goto_1

    :pswitch_e
    move-object/from16 v27, v2

    move-object/from16 v26, v3

    move-object v10, v6

    move-object/from16 v2, v39

    const/4 v3, 0x4

    sget-object v6, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader$$serializer;

    move-object/from16 v25, v2

    move-object/from16 v3, v37

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2, v6, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v37, v3

    check-cast v37, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;

    or-int/lit8 v14, v14, 0x8

    :goto_9
    move-object v6, v10

    :goto_a
    move-object/from16 v10, v25

    move-object/from16 v3, v26

    move-object/from16 v2, v27

    const/16 v27, 0x5

    goto :goto_8

    :pswitch_f
    move-object/from16 v27, v2

    move-object/from16 v26, v3

    move-object v10, v6

    move-object/from16 v3, v37

    move-object/from16 v25, v39

    const/4 v2, 0x3

    sget-object v6, Lcom/whoop/design/models/items/DateSelectorModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DateSelectorModel$$serializer;

    move-object/from16 v24, v3

    move-object/from16 v2, v36

    const/4 v3, 0x2

    invoke-interface {v0, v1, v3, v6, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v36, v2

    check-cast v36, Lcom/whoop/design/models/items/DateSelectorModel;

    or-int/lit8 v14, v14, 0x4

    move-object v6, v10

    move-object/from16 v37, v24

    goto :goto_a

    :pswitch_10
    move-object/from16 v27, v2

    move-object/from16 v26, v3

    move-object v10, v6

    move-object/from16 v2, v36

    move-object/from16 v24, v37

    move-object/from16 v25, v39

    const/4 v3, 0x2

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v23, v2

    move-object/from16 v3, v35

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2, v6, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v35, v3

    check-cast v35, Ljava/lang/String;

    or-int/lit8 v14, v14, 0x2

    move-object v6, v10

    move-object/from16 v36, v23

    goto :goto_a

    :pswitch_11
    move-object/from16 v27, v2

    move-object/from16 v26, v3

    move-object v10, v6

    move-object/from16 v3, v35

    move-object/from16 v23, v36

    move-object/from16 v24, v37

    move-object/from16 v25, v39

    const/4 v2, 0x1

    const/4 v6, 0x0

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v34

    or-int/lit8 v14, v14, 0x1

    goto :goto_9

    :pswitch_12
    move-object/from16 v27, v2

    move-object/from16 v26, v3

    move-object v10, v6

    move-object/from16 v3, v35

    move-object/from16 v23, v36

    move-object/from16 v24, v37

    move-object/from16 v25, v39

    const/4 v2, 0x1

    const/4 v6, 0x0

    move/from16 v38, v6

    goto :goto_9

    :cond_1
    move-object/from16 v27, v2

    move-object/from16 v26, v3

    move-object/from16 v25, v10

    move-object/from16 v3, v35

    move-object/from16 v23, v36

    move-object/from16 v24, v37

    move-object v10, v6

    move-object/from16 v44, v3

    move-object/from16 v55, v4

    move-object/from16 v52, v5

    move-object/from16 v53, v7

    move-object/from16 v54, v8

    move-object/from16 v49, v9

    move-object/from16 v48, v10

    move-object/from16 v50, v11

    move-object/from16 v60, v12

    move-object/from16 v59, v13

    move-object/from16 v56, v15

    move-object/from16 v45, v23

    move-object/from16 v46, v24

    move-object/from16 v47, v25

    move-object/from16 v58, v26

    move-object/from16 v57, v27

    move-object/from16 v51, v28

    move-object/from16 v43, v34

    goto/16 :goto_0

    :goto_b
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v41, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;

    const/16 v61, 0x0

    invoke-direct/range {v41 .. v61}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v41

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$$serializer;->serialize(Lzc3/e;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;)V

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
