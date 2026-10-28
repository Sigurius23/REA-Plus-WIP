.class public final Lcom/whoop/trends/data/model/MeasurementRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/trends/data/model/MeasurementRecord$$serializer;,
        Lcom/whoop/trends/data/model/MeasurementRecord$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u0002:9B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBM\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!JB\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010+\u0012\u0004\u0008-\u0010.\u001a\u0004\u0008,\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010+\u0012\u0004\u00080\u0010.\u001a\u0004\u0008/\u0010\u001bR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010+\u0012\u0004\u00082\u0010.\u001a\u0004\u00081\u0010\u001bR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00103\u0012\u0004\u00085\u0010.\u001a\u0004\u00084\u0010\u001fR \u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u00106\u0012\u0004\u00088\u0010.\u001a\u0004\u00087\u0010!\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/trends/data/model/MeasurementRecord;",
        "",
        "",
        "navigationBarTitle",
        "title",
        "subtitle",
        "Lcom/whoop/trends/data/model/TrendMenuItemModel;",
        "addManualMeasurement",
        "Lcom/whoop/trends/data/model/MeasurementSections;",
        "sections",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuItemModel;Lcom/whoop/trends/data/model/MeasurementSections;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuItemModel;Lcom/whoop/trends/data/model/MeasurementSections;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$trends_release",
        "(Lcom/whoop/trends/data/model/MeasurementRecord;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/trends/data/model/TrendMenuItemModel;",
        "component5",
        "()Lcom/whoop/trends/data/model/MeasurementSections;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuItemModel;Lcom/whoop/trends/data/model/MeasurementSections;)Lcom/whoop/trends/data/model/MeasurementRecord;",
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
        "Lcom/whoop/trends/data/model/TrendMenuItemModel;",
        "getAddManualMeasurement",
        "getAddManualMeasurement$annotations",
        "Lcom/whoop/trends/data/model/MeasurementSections;",
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

.field public static final Companion:Lcom/whoop/trends/data/model/MeasurementRecord$Companion;


# instance fields
.field private final addManualMeasurement:Lcom/whoop/trends/data/model/TrendMenuItemModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "add_manual_measurement"
    .end annotation
.end field

.field private final navigationBarTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "navigation_bar_title"
    .end annotation
.end field

.field private final sections:Lcom/whoop/trends/data/model/MeasurementSections;
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

    new-instance v0, Lcom/whoop/trends/data/model/MeasurementRecord$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/trends/data/model/MeasurementRecord$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/trends/data/model/MeasurementRecord;->Companion:Lcom/whoop/trends/data/model/MeasurementRecord$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/trends/data/model/MeasurementRecord;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuItemModel;Lcom/whoop/trends/data/model/MeasurementSections;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/trends/data/model/MeasurementRecord$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/MeasurementRecord$$serializer;

    invoke-virtual {p7}, Lcom/whoop/trends/data/model/MeasurementRecord$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->navigationBarTitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->subtitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->addManualMeasurement:Lcom/whoop/trends/data/model/TrendMenuItemModel;

    iput-object p6, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->sections:Lcom/whoop/trends/data/model/MeasurementSections;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuItemModel;Lcom/whoop/trends/data/model/MeasurementSections;)V
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

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->navigationBarTitle:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->subtitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->addManualMeasurement:Lcom/whoop/trends/data/model/TrendMenuItemModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->sections:Lcom/whoop/trends/data/model/MeasurementSections;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/trends/data/model/MeasurementRecord;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuItemModel;Lcom/whoop/trends/data/model/MeasurementSections;ILjava/lang/Object;)Lcom/whoop/trends/data/model/MeasurementRecord;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->navigationBarTitle:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->subtitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->addManualMeasurement:Lcom/whoop/trends/data/model/TrendMenuItemModel;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->sections:Lcom/whoop/trends/data/model/MeasurementSections;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/trends/data/model/MeasurementRecord;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuItemModel;Lcom/whoop/trends/data/model/MeasurementSections;)Lcom/whoop/trends/data/model/MeasurementRecord;

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

.method public static final synthetic write$Self$trends_release(Lcom/whoop/trends/data/model/MeasurementRecord;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->navigationBarTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/trends/data/model/TrendMenuItemModel$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TrendMenuItemModel$$serializer;

    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->addManualMeasurement:Lcom/whoop/trends/data/model/TrendMenuItemModel;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/trends/data/model/MeasurementSections$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/MeasurementSections$$serializer;

    iget-object p0, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->sections:Lcom/whoop/trends/data/model/MeasurementSections;

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->navigationBarTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/trends/data/model/TrendMenuItemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->addManualMeasurement:Lcom/whoop/trends/data/model/TrendMenuItemModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/trends/data/model/MeasurementSections;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->sections:Lcom/whoop/trends/data/model/MeasurementSections;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuItemModel;Lcom/whoop/trends/data/model/MeasurementSections;)Lcom/whoop/trends/data/model/MeasurementRecord;
    .locals 7

    const-string v0, "navigationBarTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addManualMeasurement"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/trends/data/model/MeasurementRecord;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/trends/data/model/MeasurementRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuItemModel;Lcom/whoop/trends/data/model/MeasurementSections;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/trends/data/model/MeasurementRecord;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/trends/data/model/MeasurementRecord;

    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->navigationBarTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/MeasurementRecord;->navigationBarTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/MeasurementRecord;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/MeasurementRecord;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->addManualMeasurement:Lcom/whoop/trends/data/model/TrendMenuItemModel;

    iget-object v3, p1, Lcom/whoop/trends/data/model/MeasurementRecord;->addManualMeasurement:Lcom/whoop/trends/data/model/TrendMenuItemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->sections:Lcom/whoop/trends/data/model/MeasurementSections;

    iget-object p1, p1, Lcom/whoop/trends/data/model/MeasurementRecord;->sections:Lcom/whoop/trends/data/model/MeasurementSections;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAddManualMeasurement()Lcom/whoop/trends/data/model/TrendMenuItemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->addManualMeasurement:Lcom/whoop/trends/data/model/TrendMenuItemModel;

    return-object v0
.end method

.method public final getNavigationBarTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->navigationBarTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSections()Lcom/whoop/trends/data/model/MeasurementSections;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->sections:Lcom/whoop/trends/data/model/MeasurementSections;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->navigationBarTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->addManualMeasurement:Lcom/whoop/trends/data/model/TrendMenuItemModel;

    invoke-virtual {v2}, Lcom/whoop/trends/data/model/TrendMenuItemModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->sections:Lcom/whoop/trends/data/model/MeasurementSections;

    invoke-virtual {v0}, Lcom/whoop/trends/data/model/MeasurementSections;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->navigationBarTitle:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->subtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->addManualMeasurement:Lcom/whoop/trends/data/model/TrendMenuItemModel;

    iget-object v4, p0, Lcom/whoop/trends/data/model/MeasurementRecord;->sections:Lcom/whoop/trends/data/model/MeasurementSections;

    const-string v5, ", title="

    const-string v6, ", subtitle="

    const-string v7, "MeasurementRecord(navigationBarTitle="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", addManualMeasurement="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sections="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
