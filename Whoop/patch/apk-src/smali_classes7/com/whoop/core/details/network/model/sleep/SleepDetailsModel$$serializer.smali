.class public final synthetic Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/core/details/network/model/sleep/SleepDetailsModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;",
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

.field public static final INSTANCE:Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.core.details.network.model.sleep.SleepDetailsModel"

    const/16 v3, 0xc

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "sleepMetricBreakdowns"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "graph"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "vowStrings"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sleep_details_labels"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "bar_graph_container"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "missingHrData"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "activityDisplayType"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sleep_details_edit_components"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sleepDetailsMetricModals"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "whoopCoachVow"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "additionalInfoText"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "metadata"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0xc

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    sget-object v2, Lcom/whoop/design/models/items/graph/GraphModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphModel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    sget-object v3, Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel$$serializer;

    aput-object v3, v1, v2

    const/4 v2, 0x3

    sget-object v3, Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel$$serializer;

    aput-object v3, v1, v2

    sget-object v2, Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    sget-object v2, Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const/4 v2, 0x6

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x7

    sget-object v3, Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel$$serializer;

    aput-object v3, v1, v2

    const/16 v2, 0x8

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v2

    sget-object v0, Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v2, 0x9

    aput-object v0, v1, v2

    sget-object v0, Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v2, 0xa

    aput-object v0, v1, v2

    sget-object v0, Lcom/whoop/core/details/network/model/MetaData$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/MetaData$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v2, 0xb

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;
    .locals 37

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v5, 0xa

    const/16 v6, 0x9

    const/4 v7, 0x7

    const/4 v8, 0x5

    const/4 v9, 0x3

    const/4 v10, 0x4

    const/4 v11, 0x2

    const/4 v12, 0x6

    const/16 v13, 0x8

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    aget-object v3, v2, v15

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    invoke-interface {v0, v1, v15, v3, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    sget-object v15, Lcom/whoop/design/models/items/graph/GraphModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphModel$$serializer;

    invoke-interface {v0, v1, v14, v15, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/whoop/design/models/items/graph/GraphModel;

    sget-object v15, Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel$$serializer;

    invoke-interface {v0, v1, v11, v15, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;

    sget-object v15, Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel$$serializer;

    invoke-interface {v0, v1, v9, v15, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

    sget-object v15, Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;

    invoke-interface {v0, v1, v10, v15, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/design/models/items/BarGraphContainerModel;

    sget-object v15, Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel$$serializer;

    invoke-interface {v0, v1, v8, v15, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;

    aget-object v15, v2, v12

    invoke-interface {v15}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v12, v15, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;

    sget-object v15, Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel$$serializer;

    invoke-interface {v0, v1, v7, v15, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;

    aget-object v2, v2, v13

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-interface {v0, v1, v13, v2, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v13, Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;

    invoke-interface {v0, v1, v6, v13, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/models/items/WhoopCoachVowModel;

    sget-object v13, Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;

    invoke-interface {v0, v1, v5, v13, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    sget-object v13, Lcom/whoop/core/details/network/model/MetaData$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/MetaData$$serializer;

    const/16 v15, 0xb

    invoke-interface {v0, v1, v15, v13, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/core/details/network/model/MetaData;

    const/16 v13, 0xfff

    move-object/from16 v31, v2

    move-object/from16 v23, v3

    move-object/from16 v34, v4

    move-object/from16 v33, v5

    move-object/from16 v32, v6

    move-object/from16 v30, v7

    move-object/from16 v28, v8

    move-object/from16 v26, v9

    move-object/from16 v27, v10

    move-object/from16 v25, v11

    move-object/from16 v29, v12

    move/from16 v22, v13

    move-object/from16 v24, v14

    goto/16 :goto_6

    :cond_0
    move-object v3, v4

    move-object v6, v3

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move/from16 v17, v12

    move/from16 v18, v13

    move/from16 v19, v14

    move v5, v15

    move/from16 v16, v5

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    :goto_0
    if-eqz v19, :cond_1

    move-object/from16 v20, v2

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v2}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v2, Lcom/whoop/core/details/network/model/MetaData$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/MetaData$$serializer;

    move-object/from16 v21, v4

    const/16 v4, 0xb

    invoke-interface {v0, v1, v4, v2, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/whoop/core/details/network/model/MetaData;

    or-int/lit16 v5, v5, 0x800

    :goto_1
    move-object/from16 v2, v20

    move-object/from16 v4, v21

    goto :goto_0

    :pswitch_1
    move-object/from16 v21, v4

    const/16 v4, 0xb

    sget-object v2, Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;

    const/16 v4, 0xa

    invoke-interface {v0, v1, v4, v2, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    or-int/lit16 v5, v5, 0x400

    goto :goto_1

    :pswitch_2
    move-object/from16 v21, v4

    const/16 v4, 0xa

    sget-object v2, Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;

    const/16 v4, 0x9

    invoke-interface {v0, v1, v4, v2, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/whoop/design/models/items/WhoopCoachVowModel;

    or-int/lit16 v5, v5, 0x200

    goto :goto_1

    :pswitch_3
    move-object/from16 v21, v4

    const/16 v4, 0x9

    aget-object v2, v20, v18

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    move/from16 v4, v18

    invoke-interface {v0, v1, v4, v2, v12}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Ljava/util/List;

    or-int/lit16 v5, v5, 0x100

    goto :goto_1

    :pswitch_4
    move-object/from16 v21, v4

    move/from16 v4, v18

    sget-object v2, Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel$$serializer;

    const/4 v4, 0x7

    invoke-interface {v0, v1, v4, v2, v8}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;

    or-int/lit16 v5, v5, 0x80

    :goto_2
    move-object/from16 v2, v20

    move-object/from16 v4, v21

    :goto_3
    const/16 v18, 0x8

    goto :goto_0

    :pswitch_5
    move-object/from16 v21, v4

    const/4 v4, 0x7

    aget-object v2, v20, v17

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    move/from16 v4, v17

    invoke-interface {v0, v1, v4, v2, v10}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;

    or-int/lit8 v5, v5, 0x40

    goto :goto_2

    :pswitch_6
    move-object/from16 v21, v4

    move/from16 v4, v17

    sget-object v2, Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel$$serializer;

    const/4 v4, 0x5

    invoke-interface {v0, v1, v4, v2, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;

    or-int/lit8 v5, v5, 0x20

    :goto_4
    move-object/from16 v2, v20

    move-object/from16 v4, v21

    :goto_5
    const/16 v17, 0x6

    goto :goto_3

    :pswitch_7
    move-object/from16 v21, v4

    const/4 v4, 0x5

    sget-object v2, Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;

    const/4 v4, 0x4

    invoke-interface {v0, v1, v4, v2, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lcom/whoop/design/models/items/BarGraphContainerModel;

    or-int/lit8 v5, v5, 0x10

    goto :goto_4

    :pswitch_8
    move-object/from16 v21, v4

    const/4 v4, 0x4

    sget-object v2, Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel$$serializer;

    const/4 v4, 0x3

    invoke-interface {v0, v1, v4, v2, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

    or-int/lit8 v5, v5, 0x8

    goto :goto_4

    :pswitch_9
    move-object/from16 v21, v4

    const/4 v4, 0x3

    sget-object v2, Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel$$serializer;

    const/4 v4, 0x2

    invoke-interface {v0, v1, v4, v2, v15}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;

    or-int/lit8 v5, v5, 0x4

    goto :goto_4

    :pswitch_a
    move-object/from16 v21, v4

    const/4 v4, 0x2

    sget-object v2, Lcom/whoop/design/models/items/graph/GraphModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphModel$$serializer;

    const/4 v4, 0x1

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/whoop/design/models/items/graph/GraphModel;

    or-int/lit8 v5, v5, 0x2

    goto :goto_4

    :pswitch_b
    move-object/from16 v21, v4

    const/4 v4, 0x1

    aget-object v2, v20, v16

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    move/from16 v4, v16

    move-object/from16 v16, v3

    move v3, v4

    move-object/from16 v4, v21

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/util/List;

    or-int/lit8 v5, v5, 0x1

    move-object/from16 v2, v16

    move/from16 v16, v3

    move-object v3, v2

    move-object/from16 v2, v20

    goto :goto_5

    :pswitch_c
    move/from16 v36, v16

    move-object/from16 v16, v3

    move/from16 v3, v36

    move/from16 v19, v3

    move-object/from16 v2, v20

    const/16 v17, 0x6

    const/16 v18, 0x8

    move-object/from16 v3, v16

    move/from16 v16, v19

    goto/16 :goto_0

    :cond_1
    move-object/from16 v16, v3

    move-object/from16 v23, v4

    move/from16 v22, v5

    move-object/from16 v34, v6

    move-object/from16 v32, v7

    move-object/from16 v30, v8

    move-object/from16 v28, v9

    move-object/from16 v29, v10

    move-object/from16 v27, v11

    move-object/from16 v31, v12

    move-object/from16 v33, v13

    move-object/from16 v26, v14

    move-object/from16 v25, v15

    move-object/from16 v24, v16

    :goto_6
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v21, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;

    const/16 v35, 0x0

    invoke-direct/range {v21 .. v35}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;-><init>(ILjava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/core/details/network/model/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v21

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
    invoke-virtual {p0, p1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->write$Self$core_details_release(Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;)V

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
