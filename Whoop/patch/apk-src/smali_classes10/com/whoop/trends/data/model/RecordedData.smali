.class public final Lcom/whoop/trends/data/model/RecordedData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/trends/data/model/RecordedData$$serializer;,
        Lcom/whoop/trends/data/model/RecordedData$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 @2\u00020\u0001:\u0002A@B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBW\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%JN\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010/\u0012\u0004\u00081\u00102\u001a\u0004\u00080\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010/\u0012\u0004\u00084\u00102\u001a\u0004\u00083\u0010\u001dR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010/\u0012\u0004\u00086\u00102\u001a\u0004\u00085\u0010\u001dR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00107\u0012\u0004\u00089\u00102\u001a\u0004\u00088\u0010!R\"\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010:\u0012\u0004\u0008<\u00102\u001a\u0004\u0008;\u0010#R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010=\u0012\u0004\u0008?\u00102\u001a\u0004\u0008>\u0010%\u00a8\u0006B"
    }
    d2 = {
        "Lcom/whoop/trends/data/model/RecordedData;",
        "",
        "",
        "navigationBarTitle",
        "title",
        "subtitle",
        "Lcom/whoop/trends/data/model/AddManualMeasurementButton;",
        "addManualMeasurement",
        "Lcom/whoop/trends/data/model/ManualMeasurementSheet;",
        "manualMeasurementUpdates",
        "Lcom/whoop/trends/data/model/Sections;",
        "sections",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/AddManualMeasurementButton;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/trends/data/model/Sections;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/AddManualMeasurementButton;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/trends/data/model/Sections;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$trends_release",
        "(Lcom/whoop/trends/data/model/RecordedData;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/trends/data/model/AddManualMeasurementButton;",
        "component5",
        "()Lcom/whoop/trends/data/model/ManualMeasurementSheet;",
        "component6",
        "()Lcom/whoop/trends/data/model/Sections;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/AddManualMeasurementButton;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/trends/data/model/Sections;)Lcom/whoop/trends/data/model/RecordedData;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getNavigationBarTitle",
        "getNavigationBarTitle$annotations",
        "()V",
        "getTitle",
        "getTitle$annotations",
        "getSubtitle",
        "getSubtitle$annotations",
        "Lcom/whoop/trends/data/model/AddManualMeasurementButton;",
        "getAddManualMeasurement",
        "getAddManualMeasurement$annotations",
        "Lcom/whoop/trends/data/model/ManualMeasurementSheet;",
        "getManualMeasurementUpdates",
        "getManualMeasurementUpdates$annotations",
        "Lcom/whoop/trends/data/model/Sections;",
        "getSections",
        "getSections$annotations",
        "Companion",
        "$serializer",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/trends/data/model/RecordedData$Companion;


# instance fields
.field private final addManualMeasurement:Lcom/whoop/trends/data/model/AddManualMeasurementButton;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "add_manual_measurement"
    .end annotation
.end field

.field private final manualMeasurementUpdates:Lcom/whoop/trends/data/model/ManualMeasurementSheet;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "manual_measurement_updates"
    .end annotation
.end field

.field private final navigationBarTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "navigation_bar_title"
    .end annotation
.end field

.field private final sections:Lcom/whoop/trends/data/model/Sections;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sections"
    .end annotation
.end field

.field private final subtitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "subtitle"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/trends/data/model/RecordedData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/trends/data/model/RecordedData$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/trends/data/model/RecordedData;->Companion:Lcom/whoop/trends/data/model/RecordedData$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/trends/data/model/RecordedData;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/AddManualMeasurementButton;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/trends/data/model/Sections;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/trends/data/model/RecordedData$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/RecordedData$$serializer;

    invoke-virtual {p8}, Lcom/whoop/trends/data/model/RecordedData$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/trends/data/model/RecordedData;->navigationBarTitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/trends/data/model/RecordedData;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/trends/data/model/RecordedData;->subtitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/trends/data/model/RecordedData;->addManualMeasurement:Lcom/whoop/trends/data/model/AddManualMeasurementButton;

    iput-object p6, p0, Lcom/whoop/trends/data/model/RecordedData;->manualMeasurementUpdates:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    iput-object p7, p0, Lcom/whoop/trends/data/model/RecordedData;->sections:Lcom/whoop/trends/data/model/Sections;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/AddManualMeasurementButton;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/trends/data/model/Sections;)V
    .locals 1

    const-string v0, "navigationBarTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addManualMeasurement"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/trends/data/model/RecordedData;->navigationBarTitle:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/trends/data/model/RecordedData;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/trends/data/model/RecordedData;->subtitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/trends/data/model/RecordedData;->addManualMeasurement:Lcom/whoop/trends/data/model/AddManualMeasurementButton;

    .line 7
    iput-object p5, p0, Lcom/whoop/trends/data/model/RecordedData;->manualMeasurementUpdates:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    .line 8
    iput-object p6, p0, Lcom/whoop/trends/data/model/RecordedData;->sections:Lcom/whoop/trends/data/model/Sections;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/trends/data/model/RecordedData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/AddManualMeasurementButton;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/trends/data/model/Sections;ILjava/lang/Object;)Lcom/whoop/trends/data/model/RecordedData;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/trends/data/model/RecordedData;->navigationBarTitle:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/trends/data/model/RecordedData;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/trends/data/model/RecordedData;->subtitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/trends/data/model/RecordedData;->addManualMeasurement:Lcom/whoop/trends/data/model/AddManualMeasurementButton;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/trends/data/model/RecordedData;->manualMeasurementUpdates:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/trends/data/model/RecordedData;->sections:Lcom/whoop/trends/data/model/Sections;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/trends/data/model/RecordedData;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/AddManualMeasurementButton;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/trends/data/model/Sections;)Lcom/whoop/trends/data/model/RecordedData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAddManualMeasurement$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "add_manual_measurement"
    .end annotation

    return-void
.end method

.method public static synthetic getManualMeasurementUpdates$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "manual_measurement_updates"
    .end annotation

    return-void
.end method

.method public static synthetic getNavigationBarTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "navigation_bar_title"
    .end annotation

    return-void
.end method

.method public static synthetic getSections$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "sections"
    .end annotation

    return-void
.end method

.method public static synthetic getSubtitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "subtitle"
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "title"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$trends_release(Lcom/whoop/trends/data/model/RecordedData;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/trends/data/model/RecordedData;->navigationBarTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/trends/data/model/RecordedData;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/trends/data/model/RecordedData;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/trends/data/model/AddManualMeasurementButton$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/AddManualMeasurementButton$$serializer;

    iget-object v1, p0, Lcom/whoop/trends/data/model/RecordedData;->addManualMeasurement:Lcom/whoop/trends/data/model/AddManualMeasurementButton;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/trends/data/model/ManualMeasurementSheet$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/ManualMeasurementSheet$$serializer;

    iget-object v1, p0, Lcom/whoop/trends/data/model/RecordedData;->manualMeasurementUpdates:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/trends/data/model/Sections$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/Sections$$serializer;

    iget-object p0, p0, Lcom/whoop/trends/data/model/RecordedData;->sections:Lcom/whoop/trends/data/model/Sections;

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/RecordedData;->navigationBarTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/RecordedData;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/RecordedData;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/trends/data/model/AddManualMeasurementButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/RecordedData;->addManualMeasurement:Lcom/whoop/trends/data/model/AddManualMeasurementButton;

    return-object v0
.end method

.method public final component5()Lcom/whoop/trends/data/model/ManualMeasurementSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/RecordedData;->manualMeasurementUpdates:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    return-object v0
.end method

.method public final component6()Lcom/whoop/trends/data/model/Sections;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/RecordedData;->sections:Lcom/whoop/trends/data/model/Sections;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/AddManualMeasurementButton;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/trends/data/model/Sections;)Lcom/whoop/trends/data/model/RecordedData;
    .locals 8

    const-string v0, "navigationBarTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addManualMeasurement"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/trends/data/model/RecordedData;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/trends/data/model/RecordedData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/AddManualMeasurementButton;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/trends/data/model/Sections;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/trends/data/model/RecordedData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/trends/data/model/RecordedData;

    iget-object v1, p0, Lcom/whoop/trends/data/model/RecordedData;->navigationBarTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/RecordedData;->navigationBarTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/trends/data/model/RecordedData;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/RecordedData;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/trends/data/model/RecordedData;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/RecordedData;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/trends/data/model/RecordedData;->addManualMeasurement:Lcom/whoop/trends/data/model/AddManualMeasurementButton;

    iget-object v3, p1, Lcom/whoop/trends/data/model/RecordedData;->addManualMeasurement:Lcom/whoop/trends/data/model/AddManualMeasurementButton;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/trends/data/model/RecordedData;->manualMeasurementUpdates:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    iget-object v3, p1, Lcom/whoop/trends/data/model/RecordedData;->manualMeasurementUpdates:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/trends/data/model/RecordedData;->sections:Lcom/whoop/trends/data/model/Sections;

    iget-object p1, p1, Lcom/whoop/trends/data/model/RecordedData;->sections:Lcom/whoop/trends/data/model/Sections;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAddManualMeasurement()Lcom/whoop/trends/data/model/AddManualMeasurementButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/RecordedData;->addManualMeasurement:Lcom/whoop/trends/data/model/AddManualMeasurementButton;

    return-object v0
.end method

.method public final getManualMeasurementUpdates()Lcom/whoop/trends/data/model/ManualMeasurementSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/RecordedData;->manualMeasurementUpdates:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    return-object v0
.end method

.method public final getNavigationBarTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/RecordedData;->navigationBarTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSections()Lcom/whoop/trends/data/model/Sections;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/RecordedData;->sections:Lcom/whoop/trends/data/model/Sections;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/RecordedData;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/RecordedData;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/trends/data/model/RecordedData;->navigationBarTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/RecordedData;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/RecordedData;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/RecordedData;->addManualMeasurement:Lcom/whoop/trends/data/model/AddManualMeasurementButton;

    invoke-virtual {v2}, Lcom/whoop/trends/data/model/AddManualMeasurementButton;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/trends/data/model/RecordedData;->manualMeasurementUpdates:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/trends/data/model/RecordedData;->sections:Lcom/whoop/trends/data/model/Sections;

    invoke-virtual {v0}, Lcom/whoop/trends/data/model/Sections;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/trends/data/model/RecordedData;->navigationBarTitle:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/trends/data/model/RecordedData;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/trends/data/model/RecordedData;->subtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/trends/data/model/RecordedData;->addManualMeasurement:Lcom/whoop/trends/data/model/AddManualMeasurementButton;

    iget-object v4, p0, Lcom/whoop/trends/data/model/RecordedData;->manualMeasurementUpdates:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    iget-object v5, p0, Lcom/whoop/trends/data/model/RecordedData;->sections:Lcom/whoop/trends/data/model/Sections;

    const-string v6, ", title="

    const-string v7, ", subtitle="

    const-string v8, "RecordedData(navigationBarTitle="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", addManualMeasurement="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", manualMeasurementUpdates="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sections="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
