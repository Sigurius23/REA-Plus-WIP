.class public final Lz41/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\r\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ>\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u000cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001c\u001a\u0004\u0008\u001f\u0010\u000cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010 \u001a\u0004\u0008!\u0010\"R\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010#\u001a\u0004\u0008$\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lz41/f;",
        "",
        "",
        "baseValue",
        "endOfLifeMultiplier",
        "Ld0/z;",
        "changeOverLifeEasing",
        "Li93/f;",
        "randomRangeMultiplier",
        "<init>",
        "(FFLd0/z;Li93/f;)V",
        "d",
        "()F",
        "Lz41/c;",
        "e",
        "()Lz41/c;",
        "a",
        "(FFLd0/z;Li93/f;)Lz41/f;",
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
        "F",
        "c",
        "b",
        "getEndOfLifeMultiplier",
        "Ld0/z;",
        "getChangeOverLifeEasing",
        "()Ld0/z;",
        "Li93/f;",
        "getRandomRangeMultiplier",
        "()Li93/f;",
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
.field private final a:F

.field private final b:F

.field private final c:Ld0/z;

.field private final d:Li93/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li93/f;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(FFLd0/z;Li93/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FF",
            "Ld0/z;",
            "Li93/f;",
            ")V"
        }
    .end annotation

    const-string v0, "changeOverLifeEasing"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "randomRangeMultiplier"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lz41/f;->a:F

    .line 3
    iput p2, p0, Lz41/f;->b:F

    .line 4
    iput-object p3, p0, Lz41/f;->c:Ld0/z;

    .line 5
    iput-object p4, p0, Lz41/f;->d:Li93/f;

    return-void
.end method

.method public constructor <init>(FFLd0/z;Li93/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/high16 v0, 0x3f800000    # 1.0f

    if-eqz p6, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    .line 6
    sget-object p3, Ld0/b0;->c:Lb23/h;

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 7
    new-instance p4, Li93/e;

    invoke-direct {p4, v0, v0}, Li93/e;-><init>(FF)V

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lz41/f;-><init>(FFLd0/z;Li93/f;)V

    return-void
.end method

.method public static synthetic b(Lz41/f;FFLd0/z;Li93/f;ILjava/lang/Object;)Lz41/f;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lz41/f;->a:F

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lz41/f;->b:F

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lz41/f;->c:Ld0/z;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lz41/f;->d:Li93/f;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lz41/f;->a(FFLd0/z;Li93/f;)Lz41/f;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(FFLd0/z;Li93/f;)Lz41/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FF",
            "Ld0/z;",
            "Li93/f;",
            ")",
            "Lz41/f;"
        }
    .end annotation

    const-string v0, "changeOverLifeEasing"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "randomRangeMultiplier"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz41/f;

    invoke-direct {v0, p1, p2, p3, p4}, Lz41/f;-><init>(FFLd0/z;Li93/f;)V

    return-object v0
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Lz41/f;->a:F

    return v0
.end method

.method public final d()F
    .locals 4

    iget v0, p0, Lz41/f;->a:F

    iget-object v1, p0, Lz41/f;->d:Li93/f;

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-static {v1, v2}, Ld51/e;->b(Li93/f;F)F

    move-result v1

    mul-float/2addr v1, v0

    return v1
.end method

.method public final e()Lz41/c;
    .locals 4

    new-instance v0, Lz41/c;

    invoke-virtual {p0}, Lz41/f;->d()F

    move-result v1

    iget v2, p0, Lz41/f;->b:F

    iget-object v3, p0, Lz41/f;->c:Ld0/z;

    invoke-direct {v0, v1, v2, v3}, Lz41/c;-><init>(FFLd0/z;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lz41/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lz41/f;

    iget v1, p0, Lz41/f;->a:F

    iget v3, p1, Lz41/f;->a:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lz41/f;->b:F

    iget v3, p1, Lz41/f;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lz41/f;->c:Ld0/z;

    iget-object v3, p1, Lz41/f;->c:Ld0/z;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lz41/f;->d:Li93/f;

    iget-object p1, p1, Lz41/f;->d:Li93/f;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lz41/f;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lz41/f;->b:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lz41/f;->c:Ld0/z;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lz41/f;->d:Li93/f;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lz41/f;->a:F

    iget v1, p0, Lz41/f;->b:F

    iget-object v2, p0, Lz41/f;->c:Ld0/z;

    iget-object v3, p0, Lz41/f;->d:Li93/f;

    const-string v4, ", endOfLifeMultiplier="

    const-string v5, ", changeOverLifeEasing="

    const-string v6, "ParticleSystemAttribute(baseValue="

    invoke-static {v6, v0, v4, v1, v5}, Lb9/y;->t(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", randomRangeMultiplier="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
