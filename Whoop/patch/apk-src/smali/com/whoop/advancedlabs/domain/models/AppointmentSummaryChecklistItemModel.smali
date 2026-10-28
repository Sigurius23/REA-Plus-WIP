.class public final Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$$serializer;,
        Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 <2\u00020\u0001:\u0002=<BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBW\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%JV\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010)\u001a\u00020(H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u00100\u001a\u00020/2\u0008\u0010.\u001a\u0004\u0018\u00010-H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00102\u001a\u0004\u00083\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00104\u001a\u0004\u00085\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00106\u001a\u0004\u00087\u0010!R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00104\u001a\u0004\u00088\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00104\u001a\u0004\u00089\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010:\u001a\u0004\u0008;\u0010%\u00a8\u0006>"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;",
        "appointmentSummary",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "addToCalendarButton",
        "Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;",
        "addToCalendarData",
        "cancelRescheduleButton",
        "downloadLabOrderButton",
        "Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;",
        "cancelRescheduleDialog",
        "<init>",
        "(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$advanced_labs_release",
        "(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;",
        "component2",
        "()Lcom/whoop/design/models/items/CardButtonModel;",
        "component3",
        "()Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;",
        "component4",
        "component5",
        "component6",
        "()Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;",
        "copy",
        "(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;)Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;",
        "getAppointmentSummary",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "getAddToCalendarButton",
        "Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;",
        "getAddToCalendarData",
        "getCancelRescheduleButton",
        "getDownloadLabOrderButton",
        "Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;",
        "getCancelRescheduleDialog",
        "Companion",
        "$serializer",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$Companion;


# instance fields
.field private final addToCalendarButton:Lcom/whoop/design/models/items/CardButtonModel;

.field private final addToCalendarData:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;

.field private final appointmentSummary:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;

.field private final cancelRescheduleButton:Lcom/whoop/design/models/items/CardButtonModel;

.field private final cancelRescheduleDialog:Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;

.field private final downloadLabOrderButton:Lcom/whoop/design/models/items/CardButtonModel;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->Companion:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$Companion;

    sget v0, Lcom/whoop/design/models/items/CardButtonModel;->$stable:I

    sput v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->appointmentSummary:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;

    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->addToCalendarButton:Lcom/whoop/design/models/items/CardButtonModel;

    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->addToCalendarData:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;

    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->cancelRescheduleButton:Lcom/whoop/design/models/items/CardButtonModel;

    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->downloadLabOrderButton:Lcom/whoop/design/models/items/CardButtonModel;

    iput-object p7, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->cancelRescheduleDialog:Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;)V
    .locals 1

    const-string v0, "appointmentSummary"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->appointmentSummary:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->addToCalendarButton:Lcom/whoop/design/models/items/CardButtonModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->addToCalendarData:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->cancelRescheduleButton:Lcom/whoop/design/models/items/CardButtonModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->downloadLabOrderButton:Lcom/whoop/design/models/items/CardButtonModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->cancelRescheduleDialog:Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;ILjava/lang/Object;)Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->appointmentSummary:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->addToCalendarButton:Lcom/whoop/design/models/items/CardButtonModel;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->addToCalendarData:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->cancelRescheduleButton:Lcom/whoop/design/models/items/CardButtonModel;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->downloadLabOrderButton:Lcom/whoop/design/models/items/CardButtonModel;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->cancelRescheduleDialog:Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->copy(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;)Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel$$serializer;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->appointmentSummary:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->addToCalendarButton:Lcom/whoop/design/models/items/CardButtonModel;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel$$serializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->addToCalendarData:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->cancelRescheduleButton:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->downloadLabOrderButton:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel$$serializer;

    iget-object p0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->cancelRescheduleDialog:Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->appointmentSummary:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->addToCalendarButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final component3()Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->addToCalendarData:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->cancelRescheduleButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->downloadLabOrderButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->cancelRescheduleDialog:Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;

    return-object v0
.end method

.method public final copy(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;)Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;
    .locals 8

    const-string v0, "appointmentSummary"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;-><init>(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->appointmentSummary:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->appointmentSummary:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->addToCalendarButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->addToCalendarButton:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->addToCalendarData:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->addToCalendarData:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->cancelRescheduleButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->cancelRescheduleButton:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->downloadLabOrderButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->downloadLabOrderButton:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->cancelRescheduleDialog:Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;

    iget-object p1, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->cancelRescheduleDialog:Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAddToCalendarButton()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->addToCalendarButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final getAddToCalendarData()Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->addToCalendarData:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;

    return-object v0
.end method

.method public final getAppointmentSummary()Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->appointmentSummary:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;

    return-object v0
.end method

.method public final getCancelRescheduleButton()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->cancelRescheduleButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final getCancelRescheduleDialog()Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->cancelRescheduleDialog:Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;

    return-object v0
.end method

.method public final getDownloadLabOrderButton()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->downloadLabOrderButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->appointmentSummary:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->addToCalendarButton:Lcom/whoop/design/models/items/CardButtonModel;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CardButtonModel;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->addToCalendarData:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->cancelRescheduleButton:Lcom/whoop/design/models/items/CardButtonModel;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CardButtonModel;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->downloadLabOrderButton:Lcom/whoop/design/models/items/CardButtonModel;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CardButtonModel;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->cancelRescheduleDialog:Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->appointmentSummary:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->addToCalendarButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->addToCalendarData:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryAddToCalendarDataModel;

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->cancelRescheduleButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v4, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->downloadLabOrderButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v5, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryChecklistItemModel;->cancelRescheduleDialog:Lcom/whoop/advancedlabs/domain/models/CancelRescheduleDialogModel;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "AppointmentSummaryChecklistItemModel(appointmentSummary="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", addToCalendarButton="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", addToCalendarData="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cancelRescheduleButton="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", downloadLabOrderButton="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cancelRescheduleDialog="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
