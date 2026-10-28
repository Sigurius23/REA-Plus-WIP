.class final Lvy0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0082\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0014\u001a\u0004\u0008\u0013\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lvy0/a;",
        "",
        "Lh2/b;",
        "startOffset",
        "endOffset",
        "",
        "intensity",
        "<init>",
        "(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "J",
        "c",
        "()J",
        "b",
        "F",
        "()F",
        "design_release"
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
.field private final a:J

.field private final b:J

.field private final c:F


# direct methods
.method private constructor <init>(JJF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lvy0/a;->a:J

    .line 4
    iput-wide p3, p0, Lvy0/a;->b:J

    .line 5
    iput p5, p0, Lvy0/a;->c:F

    return-void
.end method

.method public synthetic constructor <init>(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lvy0/a;-><init>(JJF)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lvy0/a;->b:J

    return-wide v0
.end method

.method public final b()F
    .locals 1

    iget v0, p0, Lvy0/a;->c:F

    return v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lvy0/a;->a:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lvy0/a;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lvy0/a;

    iget-wide v0, p0, Lvy0/a;->a:J

    iget-wide v2, p1, Lvy0/a;->a:J

    invoke-static {v0, v1, v2, v3}, Lh2/b;->c(JJ)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-wide v0, p0, Lvy0/a;->b:J

    iget-wide v2, p1, Lvy0/a;->b:J

    invoke-static {v0, v1, v2, v3}, Lh2/b;->c(JJ)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget v0, p0, Lvy0/a;->c:F

    iget p1, p1, Lvy0/a;->c:F

    invoke-static {v0, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_4

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lvy0/a;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lvy0/a;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v1, p0, Lvy0/a;->c:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-wide v0, p0, Lvy0/a;->a:J

    invoke-static {v0, v1}, Lh2/b;->j(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Lvy0/a;->b:J

    invoke-static {v1, v2}, Lh2/b;->j(J)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lvy0/a;->c:F

    const-string v3, ", endOffset="

    const-string v4, ", intensity="

    const-string v5, "BorderGradientAnimation(startOffset="

    invoke-static {v5, v0, v3, v1, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v2, v1, v0}, Lq63/c;->g(FLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
