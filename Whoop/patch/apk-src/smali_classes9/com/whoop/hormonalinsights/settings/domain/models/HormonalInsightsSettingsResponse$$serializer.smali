.class public final synthetic Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;",
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

.field public static final INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$$serializer;

    invoke-direct {v0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsSettingsResponse"

    const/16 v3, 0xd

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "navigationBarTitle"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "tiles"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "hormonalInsightsModeDrawer"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "contraceptionTypeDrawer"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "disablingDialog"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "switchingModeDialog"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "switchingContraceptionTypeDialog"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "pregnancyDueDateDrawer"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "previousPregnancies"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "disableFertilityInsightsSurveyDrawer"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "enableFertilityInsightsDestination"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "enablePregnancyInsightsConfirmation"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "goalsDrawer"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$$serializer;->descriptor:Lyc3/g;

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

    invoke-static {}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/16 v1, 0xd

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    sget-object v2, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet$$serializer;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v3, 0x3

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    aput-object v4, v1, v3

    sget-object v3, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    const/4 v5, 0x4

    aput-object v4, v1, v5

    const/4 v4, 0x5

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    aput-object v5, v1, v4

    const/4 v4, 0x6

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v4

    sget-object v3, Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/4 v4, 0x7

    aput-object v3, v1, v4

    sget-object v3, Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel$$serializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    const/16 v4, 0x8

    aput-object v3, v1, v4

    const/16 v3, 0x9

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    aput-object v2, v1, v3

    const/16 v2, 0xa

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/c;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    aput-object v3, v1, v2

    const/16 v2, 0xb

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    aput-object v0, v1, v2

    sget-object v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v2, 0xc

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;
    .locals 38

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v5, 0x9

    const/4 v6, 0x7

    const/4 v7, 0x6

    const/4 v8, 0x5

    const/4 v9, 0x3

    const/16 v10, 0x8

    const/4 v11, 0x4

    const/4 v12, 0x2

    const/4 v15, 0x1

    const/4 v4, 0x0

    const/16 v16, 0xb

    const/4 v13, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    aget-object v4, v2, v15

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwc3/b;

    invoke-interface {v0, v1, v15, v4, v13}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    sget-object v15, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet$$serializer;

    invoke-interface {v0, v1, v12, v15, v13}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    invoke-interface {v0, v1, v9, v15, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    const/16 v17, 0xa

    sget-object v14, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog$$serializer;

    invoke-interface {v0, v1, v11, v14, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    invoke-interface {v0, v1, v8, v14, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    invoke-interface {v0, v1, v7, v14, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    sget-object v14, Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer$$serializer;

    invoke-interface {v0, v1, v6, v14, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;

    sget-object v14, Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel$$serializer;

    invoke-interface {v0, v1, v10, v14, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;

    invoke-interface {v0, v1, v5, v15, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    aget-object v14, v2, v17

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/b;

    move/from16 v15, v17

    invoke-interface {v0, v1, v15, v14, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/whoop/navigation/e;

    aget-object v2, v2, v16

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    move/from16 v15, v16

    invoke-interface {v0, v1, v15, v2, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/modal/AnyModal;

    sget-object v15, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer$$serializer;

    move-object/from16 v16, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v15, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;

    const/16 v13, 0x1fff

    move-object/from16 v36, v2

    move-object/from16 v24, v3

    move-object/from16 v25, v4

    move-object/from16 v33, v5

    move-object/from16 v31, v6

    move-object/from16 v30, v7

    move-object/from16 v29, v8

    move-object/from16 v27, v9

    move-object/from16 v32, v10

    move-object/from16 v28, v11

    move-object/from16 v26, v12

    move-object/from16 v34, v14

    move-object/from16 v35, v16

    :goto_0
    move/from16 v23, v13

    goto/16 :goto_4

    :cond_0
    move-object/from16 v20, v2

    move-object v2, v13

    move-object v3, v2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v14, v12

    move/from16 v19, v15

    move/from16 v21, v19

    move v13, v4

    move-object v4, v14

    move-object v15, v4

    :goto_1
    if-eqz v21, :cond_1

    move-object/from16 v22, v3

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v3}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v3, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer$$serializer;

    move-object/from16 v23, v14

    const/16 v14, 0xc

    invoke-interface {v0, v1, v14, v3, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;

    or-int/lit16 v13, v13, 0x1000

    :goto_2
    move-object/from16 v3, v22

    move-object/from16 v14, v23

    goto :goto_1

    :pswitch_1
    move-object/from16 v23, v14

    const/16 v3, 0xb

    const/16 v14, 0xc

    aget-object v16, v20, v3

    invoke-interface/range {v16 .. v16}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v14, v16

    check-cast v14, Lwc3/b;

    invoke-interface {v0, v1, v3, v14, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/modal/AnyModal;

    or-int/lit16 v13, v13, 0x800

    goto :goto_2

    :pswitch_2
    move-object/from16 v23, v14

    const/16 v3, 0xb

    const/16 v14, 0xa

    aget-object v16, v20, v14

    invoke-interface/range {v16 .. v16}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v3, v16

    check-cast v3, Lwc3/b;

    invoke-interface {v0, v1, v14, v3, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Lcom/whoop/navigation/e;

    or-int/lit16 v13, v13, 0x400

    goto :goto_2

    :pswitch_3
    move-object/from16 v23, v14

    const/16 v14, 0xa

    sget-object v3, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet$$serializer;

    const/16 v14, 0x9

    invoke-interface {v0, v1, v14, v3, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    or-int/lit16 v13, v13, 0x200

    goto :goto_2

    :pswitch_4
    move-object/from16 v23, v14

    const/16 v14, 0x9

    sget-object v3, Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel$$serializer;

    const/16 v14, 0x8

    invoke-interface {v0, v1, v14, v3, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;

    or-int/lit16 v13, v13, 0x100

    goto :goto_2

    :pswitch_5
    move-object/from16 v23, v14

    const/16 v14, 0x8

    sget-object v3, Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer$$serializer;

    const/4 v14, 0x7

    invoke-interface {v0, v1, v14, v3, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;

    or-int/lit16 v13, v13, 0x80

    goto :goto_2

    :pswitch_6
    move-object/from16 v23, v14

    const/4 v14, 0x7

    sget-object v3, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog$$serializer;

    const/4 v14, 0x6

    invoke-interface {v0, v1, v14, v3, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    or-int/lit8 v13, v13, 0x40

    goto :goto_2

    :pswitch_7
    move-object/from16 v23, v14

    const/4 v14, 0x6

    sget-object v3, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog$$serializer;

    const/4 v14, 0x5

    invoke-interface {v0, v1, v14, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    or-int/lit8 v13, v13, 0x20

    goto/16 :goto_2

    :pswitch_8
    move-object/from16 v23, v14

    const/4 v14, 0x5

    sget-object v3, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog$$serializer;

    const/4 v14, 0x4

    invoke-interface {v0, v1, v14, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    or-int/lit8 v13, v13, 0x10

    goto/16 :goto_2

    :pswitch_9
    move-object/from16 v23, v14

    const/4 v14, 0x4

    sget-object v3, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet$$serializer;

    const/4 v14, 0x3

    invoke-interface {v0, v1, v14, v3, v15}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    or-int/lit8 v13, v13, 0x8

    goto/16 :goto_2

    :pswitch_a
    move-object/from16 v23, v14

    const/4 v14, 0x3

    sget-object v3, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet$$serializer;

    const/4 v14, 0x2

    invoke-interface {v0, v1, v14, v3, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    or-int/lit8 v13, v13, 0x4

    goto/16 :goto_2

    :pswitch_b
    move-object/from16 v23, v14

    const/4 v14, 0x2

    aget-object v3, v20, v19

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/b;

    move/from16 v14, v19

    move-object/from16 v19, v2

    move v2, v14

    move-object/from16 v14, v23

    invoke-interface {v0, v1, v2, v3, v14}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Ljava/util/List;

    or-int/lit8 v13, v13, 0x2

    move-object/from16 v3, v19

    move/from16 v19, v2

    move-object v2, v3

    :goto_3
    move-object/from16 v3, v22

    goto/16 :goto_1

    :pswitch_c
    move/from16 v3, v19

    move-object/from16 v19, v2

    move v2, v3

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v18

    or-int/lit8 v13, v13, 0x1

    move-object/from16 v3, v19

    move/from16 v19, v2

    move-object v2, v3

    move-object/from16 v3, v18

    goto/16 :goto_1

    :pswitch_d
    move/from16 v3, v19

    move-object/from16 v19, v2

    move v2, v3

    const/4 v3, 0x0

    move-object/from16 v21, v19

    move/from16 v19, v2

    move-object/from16 v2, v21

    move/from16 v21, v3

    goto :goto_3

    :cond_1
    move-object/from16 v19, v2

    move-object/from16 v22, v3

    move-object/from16 v26, v4

    move-object/from16 v35, v5

    move-object/from16 v33, v6

    move-object/from16 v32, v7

    move-object/from16 v31, v8

    move-object/from16 v29, v9

    move-object/from16 v34, v10

    move-object/from16 v30, v11

    move-object/from16 v28, v12

    move-object/from16 v25, v14

    move-object/from16 v27, v15

    move-object/from16 v36, v19

    move-object/from16 v24, v22

    goto/16 :goto_0

    :goto_4
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v22, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;

    const/16 v37, 0x0

    invoke-direct/range {v22 .. v37}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;-><init>(ILjava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v22

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$$serializer;->serialize(Lzc3/e;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;)V

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
