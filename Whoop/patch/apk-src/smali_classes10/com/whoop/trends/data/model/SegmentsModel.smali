.class public final Lcom/whoop/trends/data/model/SegmentsModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/trends/data/model/SegmentsModel$$serializer;,
        Lcom/whoop/trends/data/model/SegmentsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000287B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bBG\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\n\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001aJB\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001eJ\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010)\u0012\u0004\u0008+\u0010,\u001a\u0004\u0008*\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010-\u0012\u0004\u0008/\u0010,\u001a\u0004\u0008.\u0010\u001cR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00100\u0012\u0004\u00082\u0010,\u001a\u0004\u00081\u0010\u001eR \u0010\u0008\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00100\u0012\u0004\u00084\u0010,\u001a\u0004\u00083\u0010\u001eR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010)\u0012\u0004\u00086\u0010,\u001a\u0004\u00085\u0010\u001a\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/trends/data/model/SegmentsModel;",
        "",
        "",
        "style",
        "",
        "widthPercent",
        "",
        "lowerBound",
        "upperBound",
        "displayValue",
        "<init>",
        "(Ljava/lang/String;DIILjava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;DIILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$trends_release",
        "(Lcom/whoop/trends/data/model/SegmentsModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()D",
        "component3",
        "()I",
        "component4",
        "component5",
        "copy",
        "(Ljava/lang/String;DIILjava/lang/String;)Lcom/whoop/trends/data/model/SegmentsModel;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getStyle",
        "getStyle$annotations",
        "()V",
        "D",
        "getWidthPercent",
        "getWidthPercent$annotations",
        "I",
        "getLowerBound",
        "getLowerBound$annotations",
        "getUpperBound",
        "getUpperBound$annotations",
        "getDisplayValue",
        "getDisplayValue$annotations",
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

.field public static final Companion:Lcom/whoop/trends/data/model/SegmentsModel$Companion;


# instance fields
.field private final displayValue:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "display_value"
    .end annotation
.end field

.field private final lowerBound:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "lower_bound"
    .end annotation
.end field

.field private final style:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "style"
    .end annotation
.end field

.field private final upperBound:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "upper_bound"
    .end annotation
.end field

.field private final widthPercent:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "width_percent"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/trends/data/model/SegmentsModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/trends/data/model/SegmentsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/trends/data/model/SegmentsModel;->Companion:Lcom/whoop/trends/data/model/SegmentsModel$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;DIILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/trends/data/model/SegmentsModel$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/SegmentsModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/trends/data/model/SegmentsModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/trends/data/model/SegmentsModel;->style:Ljava/lang/String;

    iput-wide p3, p0, Lcom/whoop/trends/data/model/SegmentsModel;->widthPercent:D

    iput p5, p0, Lcom/whoop/trends/data/model/SegmentsModel;->lowerBound:I

    iput p6, p0, Lcom/whoop/trends/data/model/SegmentsModel;->upperBound:I

    iput-object p7, p0, Lcom/whoop/trends/data/model/SegmentsModel;->displayValue:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;DIILjava/lang/String;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayValue"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/trends/data/model/SegmentsModel;->style:Ljava/lang/String;

    .line 4
    iput-wide p2, p0, Lcom/whoop/trends/data/model/SegmentsModel;->widthPercent:D

    .line 5
    iput p4, p0, Lcom/whoop/trends/data/model/SegmentsModel;->lowerBound:I

    .line 6
    iput p5, p0, Lcom/whoop/trends/data/model/SegmentsModel;->upperBound:I

    .line 7
    iput-object p6, p0, Lcom/whoop/trends/data/model/SegmentsModel;->displayValue:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/trends/data/model/SegmentsModel;Ljava/lang/String;DIILjava/lang/String;ILjava/lang/Object;)Lcom/whoop/trends/data/model/SegmentsModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/trends/data/model/SegmentsModel;->style:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-wide p2, p0, Lcom/whoop/trends/data/model/SegmentsModel;->widthPercent:D

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget p4, p0, Lcom/whoop/trends/data/model/SegmentsModel;->lowerBound:I

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p5, p0, Lcom/whoop/trends/data/model/SegmentsModel;->upperBound:I

    :cond_3
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_4

    iget-object p6, p0, Lcom/whoop/trends/data/model/SegmentsModel;->displayValue:Ljava/lang/String;

    :cond_4
    move p7, p5

    move-object p8, p6

    move p6, p4

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/trends/data/model/SegmentsModel;->copy(Ljava/lang/String;DIILjava/lang/String;)Lcom/whoop/trends/data/model/SegmentsModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDisplayValue$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "display_value"
    .end annotation

    return-void
.end method

.method public static synthetic getLowerBound$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "lower_bound"
    .end annotation

    return-void
.end method

.method public static synthetic getStyle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "style"
    .end annotation

    return-void
.end method

.method public static synthetic getUpperBound$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "upper_bound"
    .end annotation

    return-void
.end method

.method public static synthetic getWidthPercent$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "width_percent"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$trends_release(Lcom/whoop/trends/data/model/SegmentsModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/trends/data/model/SegmentsModel;->style:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-wide v1, p0, Lcom/whoop/trends/data/model/SegmentsModel;->widthPercent:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x2

    iget v1, p0, Lcom/whoop/trends/data/model/SegmentsModel;->lowerBound:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x3

    iget v1, p0, Lcom/whoop/trends/data/model/SegmentsModel;->upperBound:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x4

    iget-object p0, p0, Lcom/whoop/trends/data/model/SegmentsModel;->displayValue:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/SegmentsModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/trends/data/model/SegmentsModel;->widthPercent:D

    return-wide v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/trends/data/model/SegmentsModel;->lowerBound:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/trends/data/model/SegmentsModel;->upperBound:I

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/SegmentsModel;->displayValue:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;DIILjava/lang/String;)Lcom/whoop/trends/data/model/SegmentsModel;
    .locals 8

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayValue"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/trends/data/model/SegmentsModel;

    move-object v2, p1

    move-wide v3, p2

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/trends/data/model/SegmentsModel;-><init>(Ljava/lang/String;DIILjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/trends/data/model/SegmentsModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/trends/data/model/SegmentsModel;

    iget-object v1, p0, Lcom/whoop/trends/data/model/SegmentsModel;->style:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/SegmentsModel;->style:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/trends/data/model/SegmentsModel;->widthPercent:D

    iget-wide v5, p1, Lcom/whoop/trends/data/model/SegmentsModel;->widthPercent:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/trends/data/model/SegmentsModel;->lowerBound:I

    iget v3, p1, Lcom/whoop/trends/data/model/SegmentsModel;->lowerBound:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/trends/data/model/SegmentsModel;->upperBound:I

    iget v3, p1, Lcom/whoop/trends/data/model/SegmentsModel;->upperBound:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/trends/data/model/SegmentsModel;->displayValue:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/trends/data/model/SegmentsModel;->displayValue:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDisplayValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/SegmentsModel;->displayValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getLowerBound()I
    .locals 1

    iget v0, p0, Lcom/whoop/trends/data/model/SegmentsModel;->lowerBound:I

    return v0
.end method

.method public final getStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/SegmentsModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpperBound()I
    .locals 1

    iget v0, p0, Lcom/whoop/trends/data/model/SegmentsModel;->upperBound:I

    return v0
.end method

.method public final getWidthPercent()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/trends/data/model/SegmentsModel;->widthPercent:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/trends/data/model/SegmentsModel;->style:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/trends/data/model/SegmentsModel;->widthPercent:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget v2, p0, Lcom/whoop/trends/data/model/SegmentsModel;->lowerBound:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/trends/data/model/SegmentsModel;->upperBound:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/trends/data/model/SegmentsModel;->displayValue:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/trends/data/model/SegmentsModel;->style:Ljava/lang/String;

    iget-wide v1, p0, Lcom/whoop/trends/data/model/SegmentsModel;->widthPercent:D

    iget v3, p0, Lcom/whoop/trends/data/model/SegmentsModel;->lowerBound:I

    iget v4, p0, Lcom/whoop/trends/data/model/SegmentsModel;->upperBound:I

    iget-object v5, p0, Lcom/whoop/trends/data/model/SegmentsModel;->displayValue:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "SegmentsModel(style="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", widthPercent="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", lowerBound="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", upperBound="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", displayValue="

    const-string v1, ")"

    invoke-static {v6, v0, v5, v1}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
