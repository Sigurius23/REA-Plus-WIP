.class public final synthetic Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "advanced-labs_release"
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

.field public static final INSTANCE:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.advancedlabs.domain.models.AppointmentSummaryChecklistItemModel"

    const/4 v3, 0x6

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "appointmentSummary"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "addToCalendarButton"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "addToCalendarData"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "cancelRescheduleButton"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "downloadLabOrderButton"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "cancelRescheduleDialog"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$$serializer;->descriptor:Lyc3/g;

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

    sget-object v0, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    sget-object v2, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    sget-object v4, Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel$$serializer;

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    const/4 v5, 0x6

    new-array v5, v5, [Lwc3/c;

    sget-object v6, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel$$serializer;

    const/4 v7, 0x0

    aput-object v6, v5, v7

    const/4 v6, 0x1

    aput-object v1, v5, v6

    const/4 v1, 0x2

    aput-object v2, v5, v1

    const/4 v1, 0x3

    aput-object v3, v5, v1

    const/4 v1, 0x4

    aput-object v0, v5, v1

    const/4 v0, 0x5

    aput-object v4, v5, v0

    return-object v5
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;
    .locals 25

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v2

    const/4 v3, 0x5

    const/4 v4, 0x3

    const/4 v5, 0x4

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v2, :cond_0

    sget-object v2, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel$$serializer;

    invoke-interface {v0, v1, v8, v2, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;

    sget-object v8, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    invoke-interface {v0, v1, v7, v8, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/design/models/items/CardButtonModel;

    sget-object v10, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel$$serializer;

    invoke-interface {v0, v1, v6, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;

    invoke-interface {v0, v1, v4, v8, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/CardButtonModel;

    invoke-interface {v0, v1, v5, v8, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/CardButtonModel;

    sget-object v8, Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel$$serializer;

    invoke-interface {v0, v1, v3, v8, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;

    const/16 v8, 0x3f

    move-object/from16 v18, v2

    move-object/from16 v23, v3

    move-object/from16 v21, v4

    move-object/from16 v22, v5

    move-object/from16 v20, v6

    move-object/from16 v19, v7

    move/from16 v17, v8

    goto/16 :goto_3

    :cond_0
    move v15, v7

    move v2, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    :goto_0
    if-eqz v15, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v8

    packed-switch v8, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v8}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v8, Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel$$serializer;

    invoke-interface {v0, v1, v3, v8, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v14, v8

    check-cast v14, Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;

    or-int/lit8 v2, v2, 0x20

    :goto_1
    const/4 v8, 0x0

    goto :goto_0

    :pswitch_1
    sget-object v8, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    invoke-interface {v0, v1, v5, v8, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v13, v8

    check-cast v13, Lcom/whoop/design/models/items/CardButtonModel;

    or-int/lit8 v2, v2, 0x10

    goto :goto_1

    :pswitch_2
    sget-object v8, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    invoke-interface {v0, v1, v4, v8, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v12, v8

    check-cast v12, Lcom/whoop/design/models/items/CardButtonModel;

    or-int/lit8 v2, v2, 0x8

    goto :goto_1

    :pswitch_3
    sget-object v8, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel$$serializer;

    invoke-interface {v0, v1, v6, v8, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;

    or-int/lit8 v2, v2, 0x4

    goto :goto_1

    :pswitch_4
    sget-object v8, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    invoke-interface {v0, v1, v7, v8, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Lcom/whoop/design/models/items/CardButtonModel;

    or-int/lit8 v2, v2, 0x2

    goto :goto_1

    :pswitch_5
    sget-object v8, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel$$serializer;

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v8, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;

    or-int/lit8 v2, v2, 0x1

    move v8, v3

    :goto_2
    const/4 v3, 0x5

    goto :goto_0

    :pswitch_6
    const/4 v3, 0x0

    move v8, v3

    move v15, v8

    goto :goto_2

    :cond_1
    move/from16 v17, v2

    move-object/from16 v18, v9

    move-object/from16 v19, v10

    move-object/from16 v20, v11

    move-object/from16 v21, v12

    move-object/from16 v22, v13

    move-object/from16 v23, v14

    :goto_3
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v16, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;

    const/16 v24, 0x0

    invoke-direct/range {v16 .. v24}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;-><init>(ILcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v16

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;)V

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
