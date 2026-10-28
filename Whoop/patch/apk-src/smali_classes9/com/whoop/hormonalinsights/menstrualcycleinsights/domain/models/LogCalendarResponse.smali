.class public final Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse$$serializer;,
        Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 B2\u00020\u0001:\u0002CBBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Bu\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010 J\u0010\u0010#\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010 J\u0010\u0010&\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010)J\u0010\u0010+\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010)Jj\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010 J\u0010\u0010/\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00103\u001a\u0002022\u0008\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00083\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00105\u001a\u0004\u00086\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00105\u001a\u0004\u00087\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00105\u001a\u0004\u00088\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00109\u001a\u0004\u0008:\u0010$R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00105\u001a\u0004\u0008;\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010<\u001a\u0004\u0008=\u0010\'R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010>\u001a\u0004\u0008?\u0010)R\u0017\u0010\r\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010>\u001a\u0004\u0008@\u0010)R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010>\u001a\u0004\u0008A\u0010)\u00a8\u0006D"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;",
        "",
        "",
        "navigationTitle",
        "titleDisplay",
        "descriptionDisplay",
        "Lcom/whoop/design/models/items/DateSelectorModel;",
        "monthPicker",
        "buttonTitle",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;",
        "calendar",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;",
        "editingHiddenCycleModal",
        "editingCycleModal",
        "hidingCycleModal",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/design/models/items/DateSelectorModel;",
        "component5",
        "component6",
        "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;",
        "component7",
        "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getNavigationTitle",
        "getTitleDisplay",
        "getDescriptionDisplay",
        "Lcom/whoop/design/models/items/DateSelectorModel;",
        "getMonthPicker",
        "getButtonTitle",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;",
        "getCalendar",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;",
        "getEditingHiddenCycleModal",
        "getEditingCycleModal",
        "getHidingCycleModal",
        "Companion",
        "$serializer",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse$Companion;


# instance fields
.field private final buttonTitle:Ljava/lang/String;

.field private final calendar:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;

.field private final descriptionDisplay:Ljava/lang/String;

.field private final editingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

.field private final editingHiddenCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

.field private final hidingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

.field private final monthPicker:Lcom/whoop/design/models/items/DateSelectorModel;

.field private final navigationTitle:Ljava/lang/String;

.field private final titleDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->Companion:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse$$serializer;

    invoke-virtual {p11}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->navigationTitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->titleDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->descriptionDisplay:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->monthPicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iput-object p6, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->buttonTitle:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->calendar:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;

    iput-object p8, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->editingHiddenCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    iput-object p9, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->editingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    iput-object p10, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->hidingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;)V
    .locals 1

    const-string v0, "navigationTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "monthPicker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonTitle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "calendar"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editingHiddenCycleModal"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editingCycleModal"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hidingCycleModal"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->navigationTitle:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->titleDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->descriptionDisplay:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->monthPicker:Lcom/whoop/design/models/items/DateSelectorModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->buttonTitle:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->calendar:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;

    .line 9
    iput-object p7, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->editingHiddenCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    .line 10
    iput-object p8, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->editingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    .line 11
    iput-object p9, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->hidingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->navigationTitle:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->titleDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->descriptionDisplay:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->monthPicker:Lcom/whoop/design/models/items/DateSelectorModel;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->buttonTitle:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->calendar:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->editingHiddenCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->editingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->hidingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->navigationTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->titleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->descriptionDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/DateSelectorModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DateSelectorModel$$serializer;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->monthPicker:Lcom/whoop/design/models/items/DateSelectorModel;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->buttonTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar$$serializer;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->calendar:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog$$serializer;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->editingHiddenCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    const/4 v2, 0x6

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->editingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    iget-object p0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->hidingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->descriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->monthPicker:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->buttonTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->calendar:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;

    return-object v0
.end method

.method public final component7()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->editingHiddenCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    return-object v0
.end method

.method public final component8()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->editingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    return-object v0
.end method

.method public final component9()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->hidingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;
    .locals 11

    const-string v0, "navigationTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "monthPicker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonTitle"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "calendar"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editingHiddenCycleModal"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editingCycleModal"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hidingCycleModal"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v10}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->navigationTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->navigationTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->titleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->titleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->descriptionDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->descriptionDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->monthPicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->monthPicker:Lcom/whoop/design/models/items/DateSelectorModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->buttonTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->buttonTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->calendar:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->calendar:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->editingHiddenCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->editingHiddenCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->editingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->editingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->hidingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    iget-object p1, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->hidingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getButtonTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->buttonTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getCalendar()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->calendar:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;

    return-object v0
.end method

.method public final getDescriptionDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->descriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getEditingCycleModal()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->editingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    return-object v0
.end method

.method public final getEditingHiddenCycleModal()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->editingHiddenCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    return-object v0
.end method

.method public final getHidingCycleModal()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->hidingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    return-object v0
.end method

.method public final getMonthPicker()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->monthPicker:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final getNavigationTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->navigationTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->titleDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->descriptionDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->monthPicker:Lcom/whoop/design/models/items/DateSelectorModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/DateSelectorModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->buttonTitle:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->calendar:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->editingHiddenCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->editingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->hidingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->navigationTitle:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->titleDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->descriptionDisplay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->monthPicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->buttonTitle:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->calendar:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCalendar;

    iget-object v6, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->editingHiddenCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    iget-object v7, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->editingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    iget-object v8, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->hidingCycleModal:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    const-string v9, ", titleDisplay="

    const-string v10, ", descriptionDisplay="

    const-string v11, "LogCalendarResponse(navigationTitle="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", monthPicker="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", buttonTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", calendar="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", editingHiddenCycleModal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", editingCycleModal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hidingCycleModal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
