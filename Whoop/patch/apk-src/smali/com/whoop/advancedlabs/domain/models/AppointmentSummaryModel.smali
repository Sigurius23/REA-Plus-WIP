.class public final Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel$$serializer;,
        Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008\u0087\u0008\u0018\u0000 R2\u00020\u0001:\u0002SRB\u0083\u0001\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u000c\u001a\u00020\u0004\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015B\u00a7\u0001\u0008\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u0014\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001eJ\u0010\u0010%\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001eJ\u0012\u0010\'\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010)J\u0010\u0010+\u001a\u00020\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u00a6\u0001\u0010-\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00042\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012H\u00c6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010\u001eJ\u0010\u00100\u001a\u00020\u0016H\u00d6\u0001\u00a2\u0006\u0004\u00080\u00101J\u001a\u00105\u001a\u0002042\u0008\u00103\u001a\u0004\u0018\u000102H\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106J\'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001\u00a2\u0006\u0004\u0008=\u0010>R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010@\u001a\u0004\u0008A\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010B\u001a\u0004\u0008C\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010B\u001a\u0004\u0008D\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010B\u001a\u0004\u0008E\u0010\u001eR\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010B\u001a\u0004\u0008F\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010B\u001a\u0004\u0008G\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010B\u001a\u0004\u0008H\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010B\u001a\u0004\u0008I\u0010\u001eR\u0017\u0010\u000c\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010B\u001a\u0004\u0008J\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010B\u001a\u0004\u0008K\u0010\u001eR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010B\u001a\u0004\u0008L\u0010\u001eR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010M\u001a\u0004\u0008N\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010M\u001a\u0004\u0008O\u0010)R\u0017\u0010\u0013\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010P\u001a\u0004\u0008Q\u0010,\u00a8\u0006T"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;",
        "header",
        "",
        "dateLabel",
        "dateValue",
        "timeLabel",
        "timeValue",
        "locationLabel",
        "locationValue",
        "confirmationLabel",
        "confirmationValue",
        "referenceIdLabel",
        "referenceIdValue",
        "Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;",
        "referenceNumberBottomSheet",
        "confirmationNumberBottomSheet",
        "Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;",
        "referenceIdStyle",
        "<init>",
        "(Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/advancedlabs/domain/models/TestHeaderModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "()Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;",
        "component13",
        "component14",
        "()Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;",
        "copy",
        "(Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;)Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$advanced_labs_release",
        "(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;",
        "getHeader",
        "Ljava/lang/String;",
        "getDateLabel",
        "getDateValue",
        "getTimeLabel",
        "getTimeValue",
        "getLocationLabel",
        "getLocationValue",
        "getConfirmationLabel",
        "getConfirmationValue",
        "getReferenceIdLabel",
        "getReferenceIdValue",
        "Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;",
        "getReferenceNumberBottomSheet",
        "getConfirmationNumberBottomSheet",
        "Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;",
        "getReferenceIdStyle",
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel$Companion;


# instance fields
.field private final confirmationLabel:Ljava/lang/String;

.field private final confirmationNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

.field private final confirmationValue:Ljava/lang/String;

.field private final dateLabel:Ljava/lang/String;

.field private final dateValue:Ljava/lang/String;

.field private final header:Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;

.field private final locationLabel:Ljava/lang/String;

.field private final locationValue:Ljava/lang/String;

.field private final referenceIdLabel:Ljava/lang/String;

.field private final referenceIdStyle:Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;

.field private final referenceIdValue:Ljava/lang/String;

.field private final referenceNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

.field private final timeLabel:Ljava/lang/String;

.field private final timeValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->Companion:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lt91/a;

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Lt91/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v2, 0xe

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v1, v2, v3

    const/4 v3, 0x5

    aput-object v1, v2, v3

    const/4 v3, 0x6

    aput-object v1, v2, v3

    const/4 v3, 0x7

    aput-object v1, v2, v3

    const/16 v3, 0x8

    aput-object v1, v2, v3

    const/16 v3, 0x9

    aput-object v1, v2, v3

    const/16 v3, 0xa

    aput-object v1, v2, v3

    const/16 v3, 0xb

    aput-object v1, v2, v3

    const/16 v3, 0xc

    aput-object v1, v2, v3

    const/16 v1, 0xd

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/advancedlabs/domain/models/TestHeaderModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x1fff

    const/16 v1, 0x1fff

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->header:Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;

    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->dateLabel:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->dateValue:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->timeLabel:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->timeValue:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->locationLabel:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->locationValue:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationLabel:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationValue:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdLabel:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdValue:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    and-int/lit16 p1, p1, 0x2000

    if-nez p1, :cond_1

    .line 2
    sget-object p1, Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;->NONE:Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;

    .line 3
    :goto_0
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdStyle:Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;

    return-void

    :cond_1
    move-object/from16 p1, p15

    goto :goto_0
.end method

.method public constructor <init>(Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;)V
    .locals 1

    const-string v0, "dateLabel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateValue"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeLabel"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeValue"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationLabel"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationValue"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationLabel"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationValue"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "referenceIdStyle"

    invoke-static {p14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->header:Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;

    .line 6
    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->dateLabel:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->dateValue:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->timeLabel:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->timeValue:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->locationLabel:Ljava/lang/String;

    .line 11
    iput-object p7, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->locationValue:Ljava/lang/String;

    .line 12
    iput-object p8, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationLabel:Ljava/lang/String;

    .line 13
    iput-object p9, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationValue:Ljava/lang/String;

    .line 14
    iput-object p10, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdLabel:Ljava/lang/String;

    .line 15
    iput-object p11, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdValue:Ljava/lang/String;

    .line 16
    iput-object p12, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    .line 17
    iput-object p13, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    .line 18
    iput-object p14, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdStyle:Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p15

    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_0

    .line 19
    sget-object v0, Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;->NONE:Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;

    move-object v15, v0

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    goto :goto_1

    :cond_0
    move-object/from16 v15, p14

    goto :goto_0

    .line 20
    :goto_1
    invoke-direct/range {v1 .. v15}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;-><init>(Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.advancedlabs.domain.models.ReferenceIdStyle"

    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;->values()[Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;ILjava/lang/Object;)Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->header:Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->dateLabel:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->dateValue:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->timeLabel:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget-object v5, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->timeValue:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget-object v6, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->locationLabel:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget-object v7, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->locationValue:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget-object v8, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationLabel:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget-object v9, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationValue:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget-object v10, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdLabel:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget-object v11, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdValue:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    iget-object v12, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    goto :goto_b

    :cond_b
    move-object/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    iget-object v13, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    goto :goto_c

    :cond_c
    move-object/from16 v13, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdStyle:Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;

    move-object/from16 p15, v0

    :goto_d
    move-object p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    move-object/from16 p12, v11

    move-object/from16 p13, v12

    move-object/from16 p14, v13

    goto :goto_e

    :cond_d
    move-object/from16 p15, p14

    goto :goto_d

    :goto_e
    invoke-virtual/range {p1 .. p15}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->copy(Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;)Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/advancedlabs/domain/models/TestHeaderModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/TestHeaderModel$$serializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->header:Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->dateLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->dateValue:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->timeLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->timeValue:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->locationLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->locationValue:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationValue:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdLabel:Ljava/lang/String;

    const/16 v3, 0x9

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xa

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdValue:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet$$serializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    const/16 v3, 0xb

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xc

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xd

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdStyle:Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;

    sget-object v3, Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;->NONE:Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;

    if-eq v2, v3, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdStyle:Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->header:Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    return-object v0
.end method

.method public final component13()Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    return-object v0
.end method

.method public final component14()Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdStyle:Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->dateLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->dateValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->timeLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->timeValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->locationLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->locationValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationValue:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;)Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;
    .locals 16

    const-string v0, "dateLabel"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateValue"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeLabel"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeValue"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationLabel"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationValue"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationLabel"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationValue"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "referenceIdStyle"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;

    move-object/from16 v2, p1

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v15}, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;-><init>(Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->header:Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->header:Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->dateLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->dateLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->dateValue:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->dateValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->timeLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->timeLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->timeValue:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->timeValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->locationLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->locationLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->locationValue:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->locationValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationValue:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdValue:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdStyle:Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;

    iget-object p1, p1, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdStyle:Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;

    if-eq v1, p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final getConfirmationLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getConfirmationNumberBottomSheet()Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    return-object v0
.end method

.method public final getConfirmationValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getDateLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->dateLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getDateValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->dateValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeader()Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->header:Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;

    return-object v0
.end method

.method public final getLocationLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->locationLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getLocationValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->locationValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getReferenceIdLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getReferenceIdStyle()Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdStyle:Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;

    return-object v0
.end method

.method public final getReferenceIdValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getReferenceNumberBottomSheet()Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    return-object v0
.end method

.method public final getTimeLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->timeLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimeValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->timeValue:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->header:Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->dateLabel:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->dateValue:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->timeLabel:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->timeValue:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->locationLabel:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->locationValue:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationLabel:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationValue:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdLabel:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdValue:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    if-nez v3, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdStyle:Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->header:Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;

    iget-object v2, v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->dateLabel:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->dateValue:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->timeLabel:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->timeValue:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->locationLabel:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->locationValue:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationLabel:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationValue:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdLabel:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdValue:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    iget-object v13, v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->confirmationNumberBottomSheet:Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    iget-object v14, v0, Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;->referenceIdStyle:Lcom/whoop/advancedlabs/domain/models/ReferenceIdStyle;

    new-instance v15, Ljava/lang/StringBuilder;

    const-string v0, "AppointmentSummaryModel(header="

    invoke-direct {v15, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dateLabel="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", dateValue="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", timeLabel="

    const-string v1, ", timeValue="

    invoke-static {v15, v3, v0, v4, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", locationLabel="

    const-string v1, ", locationValue="

    invoke-static {v15, v5, v0, v6, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", confirmationLabel="

    const-string v1, ", confirmationValue="

    invoke-static {v15, v7, v0, v8, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", referenceIdLabel="

    const-string v1, ", referenceIdValue="

    invoke-static {v15, v9, v0, v10, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", referenceNumberBottomSheet="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", confirmationNumberBottomSheet="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", referenceIdStyle="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
