.class public final Ld51/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u000b\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0018\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008\n\u0010\tJ\u0018\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002H\u0086\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u000eH\u0086\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001f\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010 \u001a\u0004\u0008!\u0010\u0015\u00a8\u0006\""
    }
    d2 = {
        "Ld51/f;",
        "",
        "",
        "x",
        "y",
        "<init>",
        "(DD)V",
        "other",
        "g",
        "(Ld51/f;)Ld51/f;",
        "d",
        "scalar",
        "h",
        "(D)Ld51/f;",
        "",
        "i",
        "(F)Ld51/f;",
        "e",
        "()Ld51/f;",
        "f",
        "c",
        "()D",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "D",
        "b",
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
.field private final a:D

.field private final b:D


# direct methods
.method public constructor <init>(DD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ld51/f;->a:D

    iput-wide p3, p0, Ld51/f;->b:D

    return-void
.end method


# virtual methods
.method public final a()D
    .locals 2

    iget-wide v0, p0, Ld51/f;->a:D

    return-wide v0
.end method

.method public final b()D
    .locals 2

    iget-wide v0, p0, Ld51/f;->b:D

    return-wide v0
.end method

.method public final c()D
    .locals 4

    iget-wide v0, p0, Ld51/f;->a:D

    mul-double/2addr v0, v0

    iget-wide v2, p0, Ld51/f;->b:D

    mul-double/2addr v2, v2

    add-double/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    return-wide v0
.end method

.method public final d(Ld51/f;)Ld51/f;
    .locals 7

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ld51/f;

    iget-wide v1, p0, Ld51/f;->a:D

    iget-wide v3, p1, Ld51/f;->a:D

    sub-double/2addr v1, v3

    iget-wide v3, p0, Ld51/f;->b:D

    iget-wide v5, p1, Ld51/f;->b:D

    sub-double/2addr v3, v5

    invoke-direct {v0, v1, v2, v3, v4}, Ld51/f;-><init>(DD)V

    return-object v0
.end method

.method public final e()Ld51/f;
    .locals 7

    invoke-virtual {p0}, Ld51/f;->c()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpg-double v4, v0, v2

    if-nez v4, :cond_0

    new-instance v0, Ld51/f;

    invoke-direct {v0, v2, v3, v2, v3}, Ld51/f;-><init>(DD)V

    return-object v0

    :cond_0
    new-instance v2, Ld51/f;

    iget-wide v3, p0, Ld51/f;->a:D

    div-double/2addr v3, v0

    iget-wide v5, p0, Ld51/f;->b:D

    div-double/2addr v5, v0

    invoke-direct {v2, v3, v4, v5, v6}, Ld51/f;-><init>(DD)V

    return-object v2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ld51/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ld51/f;

    iget-wide v3, p0, Ld51/f;->a:D

    iget-wide v5, p1, Ld51/f;->a:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Ld51/f;->b:D

    iget-wide v5, p1, Ld51/f;->b:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final f()Ld51/f;
    .locals 5

    new-instance v0, Ld51/f;

    iget-wide v1, p0, Ld51/f;->b:D

    neg-double v1, v1

    iget-wide v3, p0, Ld51/f;->a:D

    invoke-direct {v0, v1, v2, v3, v4}, Ld51/f;-><init>(DD)V

    return-object v0
.end method

.method public final g(Ld51/f;)Ld51/f;
    .locals 7

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ld51/f;

    iget-wide v1, p0, Ld51/f;->a:D

    iget-wide v3, p1, Ld51/f;->a:D

    add-double/2addr v1, v3

    iget-wide v3, p0, Ld51/f;->b:D

    iget-wide v5, p1, Ld51/f;->b:D

    add-double/2addr v3, v5

    invoke-direct {v0, v1, v2, v3, v4}, Ld51/f;-><init>(DD)V

    return-object v0
.end method

.method public final h(D)Ld51/f;
    .locals 5

    new-instance v0, Ld51/f;

    iget-wide v1, p0, Ld51/f;->a:D

    mul-double/2addr v1, p1

    iget-wide v3, p0, Ld51/f;->b:D

    mul-double/2addr v3, p1

    invoke-direct {v0, v1, v2, v3, v4}, Ld51/f;-><init>(DD)V

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Ld51/f;->a:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ld51/f;->b:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i(F)Ld51/f;
    .locals 7

    new-instance v0, Ld51/f;

    iget-wide v1, p0, Ld51/f;->a:D

    float-to-double v3, p1

    mul-double/2addr v1, v3

    iget-wide v5, p0, Ld51/f;->b:D

    mul-double/2addr v5, v3

    invoke-direct {v0, v1, v2, v5, v6}, Ld51/f;-><init>(DD)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-wide v0, p0, Ld51/f;->a:D

    iget-wide v2, p0, Ld51/f;->b:D

    const-string v4, "Vector2(x="

    const-string v5, ", y="

    invoke-static {v4, v0, v1, v5}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v2, v3, v1, v0}, Lq63/c;->f(DLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
