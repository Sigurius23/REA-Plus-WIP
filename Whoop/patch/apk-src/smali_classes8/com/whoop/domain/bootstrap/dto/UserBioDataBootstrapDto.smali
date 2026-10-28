.class public final Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto$$serializer;,
        Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 *2\u00020\u0001:\u0002+,B/\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B;\u0008\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u0007\u0010\u000cJ\'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0017J8\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010\u0017J\u001a\u0010#\u001a\u00020\"2\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010%\u001a\u0004\u0008&\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010%\u001a\u0004\u0008\'\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010%\u001a\u0004\u0008(\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010%\u001a\u0004\u0008)\u0010\u0017\u00a8\u0006-"
    }
    d2 = {
        "Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;",
        "",
        "",
        "maxHeartRate",
        "minHeartRate",
        "restingHeartRate",
        "recoveryCount",
        "<init>",
        "(IIII)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()I",
        "component2",
        "component3",
        "component4",
        "copy",
        "(IIII)Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getMaxHeartRate",
        "getMinHeartRate",
        "getRestingHeartRate",
        "getRecoveryCount",
        "Companion",
        "$serializer",
        "a",
        "core_release"
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
.field public static final Companion:Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto$a;


# instance fields
.field private final maxHeartRate:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "max_heart_rate"
    .end annotation
.end field

.field private final minHeartRate:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "min_heart_rate"
    .end annotation
.end field

.field private final recoveryCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "recovery_count"
    .end annotation
.end field

.field private final restingHeartRate:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "resting_heart_rate"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->Companion:Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->maxHeartRate:I

    .line 4
    iput p2, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->minHeartRate:I

    .line 5
    iput p3, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->restingHeartRate:I

    .line 6
    iput p4, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->recoveryCount:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v0

    .line 8
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;-><init>(IIII)V

    return-void
.end method

.method public synthetic constructor <init>(IIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p6, p1, 0x1

    const/4 v0, 0x0

    if-nez p6, :cond_0

    iput v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->maxHeartRate:I

    goto :goto_0

    :cond_0
    iput p2, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->maxHeartRate:I

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->minHeartRate:I

    goto :goto_1

    :cond_1
    iput p3, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->minHeartRate:I

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->restingHeartRate:I

    goto :goto_2

    :cond_2
    iput p4, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->restingHeartRate:I

    :goto_2
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    iput v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->recoveryCount:I

    return-void

    :cond_3
    iput p5, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->recoveryCount:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;IIIIILjava/lang/Object;)Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->maxHeartRate:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->minHeartRate:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->restingHeartRate:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->recoveryCount:I

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->copy(IIII)Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->maxHeartRate:I

    if-eqz v1, :cond_1

    :goto_0
    iget v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->maxHeartRate:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->minHeartRate:I

    if-eqz v1, :cond_3

    :goto_1
    iget v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->minHeartRate:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->restingHeartRate:I

    if-eqz v1, :cond_5

    :goto_2
    iget v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->restingHeartRate:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->recoveryCount:I

    if-eqz v1, :cond_7

    :goto_3
    iget p0, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->recoveryCount:I

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->maxHeartRate:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->minHeartRate:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->restingHeartRate:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->recoveryCount:I

    return v0
.end method

.method public final copy(IIII)Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;
    .locals 1

    new-instance v0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;-><init>(IIII)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;

    iget v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->maxHeartRate:I

    iget v3, p1, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->maxHeartRate:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->minHeartRate:I

    iget v3, p1, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->minHeartRate:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->restingHeartRate:I

    iget v3, p1, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->restingHeartRate:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->recoveryCount:I

    iget p1, p1, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->recoveryCount:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getMaxHeartRate()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->maxHeartRate:I

    return v0
.end method

.method public final getMinHeartRate()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->minHeartRate:I

    return v0
.end method

.method public final getRecoveryCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->recoveryCount:I

    return v0
.end method

.method public final getRestingHeartRate()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->restingHeartRate:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->maxHeartRate:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->minHeartRate:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->restingHeartRate:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->recoveryCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->maxHeartRate:I

    iget v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->minHeartRate:I

    iget v2, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->restingHeartRate:I

    iget v3, p0, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->recoveryCount:I

    const-string v4, ", minHeartRate="

    const-string v5, ", restingHeartRate="

    const-string v6, "UserBioDataBootstrapDto(maxHeartRate="

    invoke-static {v0, v1, v6, v4, v5}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", recoveryCount="

    const-string v4, ")"

    invoke-static {v0, v2, v1, v3, v4}, Lnh3/a;->i(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
