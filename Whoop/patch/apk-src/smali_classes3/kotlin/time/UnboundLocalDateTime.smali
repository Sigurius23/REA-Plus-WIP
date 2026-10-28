.class final Lkotlin/time/UnboundLocalDateTime;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/time/UnboundLocalDateTime$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ;\u0010\u0011\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u000c2\u0006\u0010\r\u001a\u00020\u00022\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0016\u001a\u0004\u0008\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0016\u001a\u0004\u0008\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0016\u001a\u0004\u0008\u001b\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0016\u001a\u0004\u0008\u001c\u0010\u0018R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0016\u001a\u0004\u0008\u001d\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0016\u001a\u0004\u0008\u001e\u0010\u0018\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006 "
    }
    d2 = {
        "Lkotlin/time/UnboundLocalDateTime;",
        "",
        "",
        "year",
        "month",
        "day",
        "hour",
        "minute",
        "second",
        "nanosecond",
        "<init>",
        "(IIIIIII)V",
        "T",
        "offsetSeconds",
        "Lkotlin/Function2;",
        "",
        "buildInstant",
        "toInstant",
        "(ILc93/m;)Ljava/lang/Object;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "I",
        "getYear",
        "()I",
        "getMonth",
        "getDay",
        "getHour",
        "getMinute",
        "getSecond",
        "getNanosecond",
        "Companion",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lkotlin/time/UnboundLocalDateTime$Companion;


# instance fields
.field private final day:I

.field private final hour:I

.field private final minute:I

.field private final month:I

.field private final nanosecond:I

.field private final second:I

.field private final year:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlin/time/UnboundLocalDateTime$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/time/UnboundLocalDateTime$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/time/UnboundLocalDateTime;->Companion:Lkotlin/time/UnboundLocalDateTime$Companion;

    return-void
.end method

.method public constructor <init>(IIIIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lkotlin/time/UnboundLocalDateTime;->year:I

    iput p2, p0, Lkotlin/time/UnboundLocalDateTime;->month:I

    iput p3, p0, Lkotlin/time/UnboundLocalDateTime;->day:I

    iput p4, p0, Lkotlin/time/UnboundLocalDateTime;->hour:I

    iput p5, p0, Lkotlin/time/UnboundLocalDateTime;->minute:I

    iput p6, p0, Lkotlin/time/UnboundLocalDateTime;->second:I

    iput p7, p0, Lkotlin/time/UnboundLocalDateTime;->nanosecond:I

    return-void
.end method


# virtual methods
.method public final getDay()I
    .locals 1

    iget v0, p0, Lkotlin/time/UnboundLocalDateTime;->day:I

    return v0
.end method

.method public final getHour()I
    .locals 1

    iget v0, p0, Lkotlin/time/UnboundLocalDateTime;->hour:I

    return v0
.end method

.method public final getMinute()I
    .locals 1

    iget v0, p0, Lkotlin/time/UnboundLocalDateTime;->minute:I

    return v0
.end method

.method public final getMonth()I
    .locals 1

    iget v0, p0, Lkotlin/time/UnboundLocalDateTime;->month:I

    return v0
.end method

.method public final getNanosecond()I
    .locals 1

    iget v0, p0, Lkotlin/time/UnboundLocalDateTime;->nanosecond:I

    return v0
.end method

.method public final getSecond()I
    .locals 1

    iget v0, p0, Lkotlin/time/UnboundLocalDateTime;->second:I

    return v0
.end method

.method public final getYear()I
    .locals 1

    iget v0, p0, Lkotlin/time/UnboundLocalDateTime;->year:I

    return v0
.end method

.method public final toInstant(ILc93/m;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lc93/m;",
            ")TT;"
        }
    .end annotation

    const-string v0, "buildInstant"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/time/UnboundLocalDateTime;->getYear()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x16d

    int-to-long v2, v2

    mul-long/2addr v2, v0

    const-wide/16 v4, 0x0

    cmp-long v4, v0, v4

    if-ltz v4, :cond_0

    const/4 v4, 0x3

    int-to-long v4, v4

    add-long/2addr v4, v0

    const/4 v6, 0x4

    int-to-long v6, v6

    div-long/2addr v4, v6

    const/16 v6, 0x63

    int-to-long v6, v6

    add-long/2addr v6, v0

    const/16 v8, 0x64

    int-to-long v8, v8

    div-long/2addr v6, v8

    sub-long/2addr v4, v6

    const/16 v6, 0x18f

    int-to-long v6, v6

    add-long/2addr v0, v6

    const/16 v6, 0x190

    int-to-long v6, v6

    div-long/2addr v0, v6

    add-long/2addr v0, v4

    add-long/2addr v0, v2

    goto :goto_0

    :cond_0
    const/4 v4, -0x4

    int-to-long v4, v4

    div-long v4, v0, v4

    const/16 v6, -0x64

    int-to-long v6, v6

    div-long v6, v0, v6

    sub-long/2addr v4, v6

    const/16 v6, -0x190

    int-to-long v6, v6

    div-long/2addr v0, v6

    add-long/2addr v0, v4

    sub-long v0, v2, v0

    :goto_0
    invoke-virtual {p0}, Lkotlin/time/UnboundLocalDateTime;->getMonth()I

    move-result v2

    mul-int/lit16 v2, v2, 0x16f

    add-int/lit16 v2, v2, -0x16a

    div-int/lit8 v2, v2, 0xc

    int-to-long v2, v2

    add-long/2addr v0, v2

    invoke-virtual {p0}, Lkotlin/time/UnboundLocalDateTime;->getDay()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    int-to-long v2, v2

    add-long/2addr v0, v2

    invoke-virtual {p0}, Lkotlin/time/UnboundLocalDateTime;->getMonth()I

    move-result v2

    const/4 v3, 0x2

    if-le v2, v3, :cond_2

    const-wide/16 v2, -0x1

    add-long/2addr v2, v0

    invoke-virtual {p0}, Lkotlin/time/UnboundLocalDateTime;->getYear()I

    move-result v4

    invoke-static {v4}, Lkotlin/time/InstantKt;->isLeapYear(I)Z

    move-result v4

    if-nez v4, :cond_1

    const-wide/16 v2, -0x2

    add-long/2addr v0, v2

    goto :goto_1

    :cond_1
    move-wide v0, v2

    :cond_2
    :goto_1
    const v2, 0xafaa8

    int-to-long v2, v2

    sub-long/2addr v0, v2

    invoke-virtual {p0}, Lkotlin/time/UnboundLocalDateTime;->getHour()I

    move-result v2

    mul-int/lit16 v2, v2, 0xe10

    invoke-virtual {p0}, Lkotlin/time/UnboundLocalDateTime;->getMinute()I

    move-result v3

    mul-int/lit8 v3, v3, 0x3c

    add-int/2addr v3, v2

    invoke-virtual {p0}, Lkotlin/time/UnboundLocalDateTime;->getSecond()I

    move-result v2

    add-int/2addr v3, v2

    const v2, 0x15180

    int-to-long v4, v2

    mul-long/2addr v0, v4

    int-to-long v2, v3

    add-long/2addr v0, v2

    int-to-long v2, p1

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0}, Lkotlin/time/UnboundLocalDateTime;->getNanosecond()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UnboundLocalDateTime("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lkotlin/time/UnboundLocalDateTime;->year:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, p0, Lkotlin/time/UnboundLocalDateTime;->month:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Lkotlin/time/UnboundLocalDateTime;->day:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Lkotlin/time/UnboundLocalDateTime;->hour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, p0, Lkotlin/time/UnboundLocalDateTime;->minute:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Lkotlin/time/UnboundLocalDateTime;->second:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Lkotlin/time/UnboundLocalDateTime;->nanosecond:I

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Ldc/b;->r(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
