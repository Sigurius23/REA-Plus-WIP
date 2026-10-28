.class public final Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown$$serializer;,
        Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 -2\u00020\u0001:\u0002.-B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tBC\u0008\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0008\u0010\rJ\'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0018JB\u0010\u001d\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u0018J\u001a\u0010%\u001a\u00020$2\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\'\u001a\u0004\u0008(\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\'\u001a\u0004\u0008)\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\'\u001a\u0004\u0008*\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\'\u001a\u0004\u0008+\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\'\u001a\u0004\u0008,\u0010\u0018\u00a8\u0006/"
    }
    d2 = {
        "Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;",
        "",
        "",
        "baseline",
        "debt",
        "naps",
        "strain",
        "total",
        "<init>",
        "(IIIII)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IIIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$sleep_coach_release",
        "(Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()I",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "(IIIII)Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getBaseline",
        "getDebt",
        "getNaps",
        "getStrain",
        "getTotal",
        "Companion",
        "$serializer",
        "sleep-coach_release"
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

.field public static final Companion:Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown$Companion;


# instance fields
.field private final baseline:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "baseline"
    .end annotation
.end field

.field private final debt:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "debt"
    .end annotation
.end field

.field private final naps:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "naps"
    .end annotation
.end field

.field private final strain:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "strain"
    .end annotation
.end field

.field private final total:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->Companion:Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown$Companion;

    return-void
.end method

.method public constructor <init>(IIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->baseline:I

    .line 3
    iput p2, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->debt:I

    .line 4
    iput p3, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->naps:I

    .line 5
    iput p4, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->strain:I

    .line 6
    iput p5, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->total:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 7
    sget-object p7, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown$$serializer;

    invoke-virtual {p7}, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->baseline:I

    iput p3, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->debt:I

    iput p4, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->naps:I

    iput p5, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->strain:I

    iput p6, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->total:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;IIIIIILjava/lang/Object;)Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->baseline:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->debt:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->naps:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->strain:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget p5, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->total:I

    :cond_4
    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->copy(IIIII)Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$sleep_coach_release(Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    iget v1, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->baseline:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x1

    iget v1, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->debt:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x2

    iget v1, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->naps:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x3

    iget v1, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->strain:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x4

    iget p0, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->total:I

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->baseline:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->debt:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->naps:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->strain:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->total:I

    return v0
.end method

.method public final copy(IIIII)Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;
    .locals 6

    new-instance v0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;-><init>(IIIII)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;

    iget v1, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->baseline:I

    iget v3, p1, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->baseline:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->debt:I

    iget v3, p1, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->debt:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->naps:I

    iget v3, p1, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->naps:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->strain:I

    iget v3, p1, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->strain:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->total:I

    iget p1, p1, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->total:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBaseline()I
    .locals 1

    iget v0, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->baseline:I

    return v0
.end method

.method public final getDebt()I
    .locals 1

    iget v0, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->debt:I

    return v0
.end method

.method public final getNaps()I
    .locals 1

    iget v0, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->naps:I

    return v0
.end method

.method public final getStrain()I
    .locals 1

    iget v0, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->strain:I

    return v0
.end method

.method public final getTotal()I
    .locals 1

    iget v0, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->total:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->baseline:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->debt:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->naps:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->strain:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->total:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->baseline:I

    iget v1, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->debt:I

    iget v2, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->naps:I

    iget v3, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->strain:I

    iget v4, p0, Lcom/whoop/sleep/coach/data/network/model/NeedBreakdown;->total:I

    const-string v5, ", debt="

    const-string v6, ", naps="

    const-string v7, "NeedBreakdown(baseline="

    invoke-static {v0, v1, v7, v5, v6}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", strain="

    const-string v5, ", total="

    invoke-static {v0, v2, v1, v3, v5}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ")"

    invoke-static {v0, v4, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
