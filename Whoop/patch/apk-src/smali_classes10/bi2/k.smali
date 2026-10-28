.class public final Lbi2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ8\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0015\u001a\u0004\u0008\u0018\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0015\u001a\u0004\u0008\u0017\u0010\u0010R\u0011\u0010\u001d\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u0010R\u0011\u0010 \u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lbi2/k;",
        "",
        "",
        "intraBurstGapCount",
        "crossBurstGapCount",
        "",
        "estimatedMissingPackets",
        "backwardPacketCount",
        "<init>",
        "(IIJI)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "a",
        "(IIJI)Lbi2/k;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "f",
        "b",
        "c",
        "J",
        "d",
        "()J",
        "g",
        "totalGapCount",
        "e",
        "()Z",
        "hasGaps",
        "strap-history-sync_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:J

.field private final d:I


# direct methods
.method public constructor <init>(IIJI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lbi2/k;->a:I

    .line 3
    iput p2, p0, Lbi2/k;->b:I

    .line 4
    iput-wide p3, p0, Lbi2/k;->c:J

    .line 5
    iput p5, p0, Lbi2/k;->d:I

    return-void
.end method

.method public synthetic constructor <init>(IIJIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    const-wide/16 p3, 0x0

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    move p6, v0

    :goto_0
    move-wide p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_3
    move p6, p5

    goto :goto_0

    .line 6
    :goto_1
    invoke-direct/range {p1 .. p6}, Lbi2/k;-><init>(IIJI)V

    return-void
.end method


# virtual methods
.method public final a(IIJI)Lbi2/k;
    .locals 6

    new-instance v0, Lbi2/k;

    move v1, p1

    move v2, p2

    move-wide v3, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lbi2/k;-><init>(IIJI)V

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lbi2/k;->d:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lbi2/k;->b:I

    return v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Lbi2/k;->c:J

    return-wide v0
.end method

.method public final e()Z
    .locals 1

    invoke-virtual {p0}, Lbi2/k;->g()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lbi2/k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lbi2/k;

    iget v1, p0, Lbi2/k;->a:I

    iget v3, p1, Lbi2/k;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lbi2/k;->b:I

    iget v3, p1, Lbi2/k;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lbi2/k;->c:J

    iget-wide v5, p1, Lbi2/k;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lbi2/k;->d:I

    iget p1, p1, Lbi2/k;->d:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lbi2/k;->a:I

    return v0
.end method

.method public final g()I
    .locals 2

    iget v0, p0, Lbi2/k;->a:I

    iget v1, p0, Lbi2/k;->b:I

    add-int/2addr v0, v1

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lbi2/k;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lbi2/k;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-wide v2, p0, Lbi2/k;->c:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v1, p0, Lbi2/k;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    invoke-virtual {p0}, Lbi2/k;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lbi2/k;->d:I

    if-nez v0, :cond_0

    const-string v0, "none"

    return-object v0

    :cond_0
    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    iget v1, p0, Lbi2/k;->a:I

    if-lez v1, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "intraBurst="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_1
    iget v1, p0, Lbi2/k;->b:I

    if-lez v1, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "crossBurst="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-wide v1, p0, Lbi2/k;->c:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-lez v3, :cond_3

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "missing="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_3
    iget v1, p0, Lbi2/k;->d:I

    if-lez v1, :cond_4

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "backward="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v2

    const/4 v6, 0x0

    const/16 v7, 0x38

    const-string v3, ", "

    const-string v4, "{"

    const-string v5, "}"

    invoke-static/range {v2 .. v7}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
