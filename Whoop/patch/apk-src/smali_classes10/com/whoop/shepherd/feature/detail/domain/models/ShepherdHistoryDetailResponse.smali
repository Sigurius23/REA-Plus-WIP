.class public final Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse$$serializer;,
        Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u000b\n\u0002\u0008\u0018\u0008\u0087\u0008\u0018\u0000 L2\u00020\u0001:\u0002MLBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012Bu\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0010\u0010&\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010$J\u0010\u0010\'\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/Jn\u00100\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0004\u00080\u00101J\u0010\u00102\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u00082\u0010$J\u0010\u00103\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u00083\u00104J\u001a\u00107\u001a\u0002062\u0008\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00087\u00108R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00109\u0012\u0004\u0008;\u0010<\u001a\u0004\u0008:\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010=\u001a\u0004\u0008>\u0010$R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010=\u001a\u0004\u0008?\u0010$R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010=\u001a\u0004\u0008@\u0010$R\u001a\u0010\u0008\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010=\u001a\u0004\u0008A\u0010$R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010B\u0012\u0004\u0008D\u0010<\u001a\u0004\u0008C\u0010)R \u0010\u000c\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010E\u0012\u0004\u0008G\u0010<\u001a\u0004\u0008F\u0010+R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010H\u001a\u0004\u0008I\u0010-R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010J\u001a\u0004\u0008K\u0010/\u00a8\u0006N"
    }
    d2 = {
        "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;",
        "",
        "Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;",
        "possibleShepherdTile",
        "",
        "icon",
        "pageTitle",
        "description",
        "advise",
        "Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;",
        "labradorItemInfo",
        "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;",
        "historyDetailBox",
        "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;",
        "clearButton",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;",
        "clearHistoryDialog",
        "<init>",
        "(Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$shepherd_release",
        "(Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;",
        "component7",
        "()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;",
        "component8",
        "()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;",
        "component9",
        "()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;",
        "copy",
        "(Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;",
        "getPossibleShepherdTile",
        "getPossibleShepherdTile$annotations",
        "()V",
        "Ljava/lang/String;",
        "getIcon",
        "getPageTitle",
        "getDescription",
        "getAdvise",
        "Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;",
        "getLabradorItemInfo",
        "getLabradorItemInfo$annotations",
        "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;",
        "getHistoryDetailBox",
        "getHistoryDetailBox$annotations",
        "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;",
        "getClearButton",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;",
        "getClearHistoryDialog",
        "Companion",
        "$serializer",
        "shepherd_release"
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

.field public static final Companion:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse$Companion;


# instance fields
.field private final advise:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "advise"
    .end annotation
.end field

.field private final clearButton:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "clear_button"
    .end annotation
.end field

.field private final clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "clear_history_dialog"
    .end annotation
.end field

.field private final description:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "description"
    .end annotation
.end field

.field private final historyDetailBox:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "afib_history_box"
    .end annotation
.end field

.field private final icon:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "icon"
    .end annotation
.end field

.field private final labradorItemInfo:Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "ecg_item_info"
    .end annotation
.end field

.field private final pageTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "page_title"
    .end annotation
.end field

.field private final possibleShepherdTile:Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "possible_afib_tile"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->Companion:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse$$serializer;

    invoke-virtual {p11}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->possibleShepherdTile:Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;

    iput-object p3, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->icon:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->pageTitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->description:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->advise:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->labradorItemInfo:Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;

    iput-object p8, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->historyDetailBox:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;

    iput-object p9, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->clearButton:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;

    iput-object p10, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)V
    .locals 1

    const-string v0, "possibleShepherdTile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pageTitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "advise"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "historyDetailBox"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clearButton"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->possibleShepherdTile:Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;

    .line 4
    iput-object p2, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->icon:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->pageTitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->description:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->advise:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->labradorItemInfo:Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;

    .line 9
    iput-object p7, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->historyDetailBox:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;

    .line 10
    iput-object p8, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->clearButton:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;

    .line 11
    iput-object p9, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;ILjava/lang/Object;)Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->possibleShepherdTile:Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->icon:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->pageTitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->description:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->advise:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->labradorItemInfo:Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->historyDetailBox:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->clearButton:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

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

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->copy(Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getHistoryDetailBox$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "afib_history_box"
    .end annotation

    return-void
.end method

.method public static synthetic getLabradorItemInfo$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "ecg_item_info"
    .end annotation

    return-void
.end method

.method public static synthetic getPossibleShepherdTile$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "possible_afib_tile"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$shepherd_release(Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse$$serializer;

    iget-object v1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->possibleShepherdTile:Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->pageTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->advise:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo$$serializer;

    iget-object v1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->labradorItemInfo:Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox$$serializer;

    iget-object v1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->historyDetailBox:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;

    const/4 v2, 0x6

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton$$serializer;

    iget-object v1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->clearButton:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;

    const/4 v2, 0x7

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse$$serializer;

    iget-object p0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    const/16 v1, 0x8

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->possibleShepherdTile:Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->pageTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->advise:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->labradorItemInfo:Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;

    return-object v0
.end method

.method public final component7()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->historyDetailBox:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;

    return-object v0
.end method

.method public final component8()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->clearButton:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;

    return-object v0
.end method

.method public final component9()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    return-object v0
.end method

.method public final copy(Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;
    .locals 11

    const-string v0, "possibleShepherdTile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pageTitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "advise"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "historyDetailBox"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clearButton"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v7, p6

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;-><init>(Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;

    iget-object v1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->possibleShepherdTile:Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;

    iget-object v3, p1, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->possibleShepherdTile:Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->pageTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->pageTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->advise:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->advise:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->labradorItemInfo:Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;

    iget-object v3, p1, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->labradorItemInfo:Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->historyDetailBox:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;

    iget-object v3, p1, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->historyDetailBox:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->clearButton:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;

    iget-object v3, p1, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->clearButton:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    iget-object p1, p1, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAdvise()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->advise:Ljava/lang/String;

    return-object v0
.end method

.method public final getClearButton()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->clearButton:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;

    return-object v0
.end method

.method public final getClearHistoryDialog()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getHistoryDetailBox()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->historyDetailBox:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabradorItemInfo()Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->labradorItemInfo:Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;

    return-object v0
.end method

.method public final getPageTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->pageTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getPossibleShepherdTile()Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->possibleShepherdTile:Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->possibleShepherdTile:Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;

    invoke-virtual {v0}, Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->icon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->pageTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->description:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->advise:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->labradorItemInfo:Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->historyDetailBox:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->clearButton:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;

    invoke-virtual {v0}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->possibleShepherdTile:Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;

    iget-object v1, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->icon:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->pageTitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->description:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->advise:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->labradorItemInfo:Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;

    iget-object v6, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->historyDetailBox:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;

    iget-object v7, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->clearButton:Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;

    iget-object v8, p0, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "ShepherdHistoryDetailResponse(possibleShepherdTile="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", icon="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", pageTitle="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", description="

    const-string v1, ", advise="

    invoke-static {v9, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", labradorItemInfo="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", historyDetailBox="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", clearButton="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", clearHistoryDialog="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
