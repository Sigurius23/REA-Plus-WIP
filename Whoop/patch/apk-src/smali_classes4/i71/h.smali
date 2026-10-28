.class public final Li71/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001a\u001a\u0004\u0008\u001e\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001a\u001a\u0004\u0008\u001f\u0010\u001cR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0011\u0010#\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001cR\u0011\u0010$\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001c\u00a8\u0006%"
    }
    d2 = {
        "Li71/h;",
        "",
        "Lh2/b;",
        "position",
        "Lh2/e;",
        "scrollContentSize",
        "scrollViewSize",
        "",
        "zoomScale",
        "<init>",
        "(JJJFLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "numerator",
        "denominator",
        "f",
        "(FF)F",
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
        "getScrollContentSize-NH-jbRc",
        "d",
        "F",
        "e",
        "()F",
        "normalized",
        "normalizedEnd",
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

.field private final c:J

.field private final d:F


# direct methods
.method private constructor <init>(JJJF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Li71/h;->a:J

    .line 4
    iput-wide p3, p0, Li71/h;->b:J

    .line 5
    iput-wide p5, p0, Li71/h;->c:J

    .line 6
    iput p7, p0, Li71/h;->d:F

    return-void
.end method

.method public synthetic constructor <init>(JJJFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 v0, p8, 0x1

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    move-wide p1, v1

    :cond_0
    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_1

    move-wide p3, v1

    :cond_1
    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    move-wide v1, p5

    :goto_0
    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_3

    const/16 v0, 0x20

    shr-long v3, p3, v0

    long-to-int v3, v3

    .line 7
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    shr-long v4, v1, v0

    long-to-int v0, v4

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    div-float v0, v3, v0

    goto :goto_1

    :cond_3
    move v0, p7

    :goto_1
    const/4 v3, 0x0

    move-wide p4, p3

    move p8, v0

    move-wide p6, v1

    move-object p9, v3

    move-wide p2, p1

    move-object p1, p0

    .line 8
    invoke-direct/range {p1 .. p9}, Li71/h;-><init>(JJJFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(JJJFLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Li71/h;-><init>(JJJF)V

    return-void
.end method

.method private final f(FF)F
    .locals 2

    const/4 v0, 0x0

    cmpl-float v1, p2, v0

    if-lez v1, :cond_0

    div-float/2addr p1, p2

    return p1

    :cond_0
    return v0
.end method


# virtual methods
.method public final a()J
    .locals 7

    iget-wide v0, p0, Li71/h;->a:J

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    iget-wide v3, p0, Li71/h;->b:J

    shr-long/2addr v3, v2

    long-to-int v1, v3

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-direct {p0, v0, v1}, Li71/h;->f(FF)F

    move-result v0

    iget-wide v3, p0, Li71/h;->a:J

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int v1, v3

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    iget-wide v3, p0, Li71/h;->b:J

    and-long/2addr v3, v5

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-direct {p0, v1, v3}, Li71/h;->f(FF)F

    move-result v1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v3, v0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    shl-long v2, v3, v2

    and-long/2addr v0, v5

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final b()J
    .locals 7

    iget-wide v0, p0, Li71/h;->a:J

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    iget-wide v3, p0, Li71/h;->c:J

    shr-long/2addr v3, v2

    long-to-int v1, v3

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    add-float/2addr v1, v0

    iget-wide v3, p0, Li71/h;->b:J

    shr-long/2addr v3, v2

    long-to-int v0, v3

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-direct {p0, v1, v0}, Li71/h;->f(FF)F

    move-result v0

    iget-wide v3, p0, Li71/h;->a:J

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int v1, v3

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    iget-wide v3, p0, Li71/h;->b:J

    and-long/2addr v3, v5

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-direct {p0, v1, v3}, Li71/h;->f(FF)F

    move-result v1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v3, v0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    shl-long v2, v3, v2

    and-long/2addr v0, v5

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Li71/h;->a:J

    return-wide v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Li71/h;->c:J

    return-wide v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Li71/h;->d:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Li71/h;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Li71/h;

    iget-wide v0, p0, Li71/h;->a:J

    iget-wide v2, p1, Li71/h;->a:J

    invoke-static {v0, v1, v2, v3}, Lh2/b;->c(JJ)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-wide v0, p0, Li71/h;->b:J

    iget-wide v2, p1, Li71/h;->b:J

    invoke-static {v0, v1, v2, v3}, Lh2/e;->b(JJ)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-wide v0, p0, Li71/h;->c:J

    iget-wide v2, p1, Li71/h;->c:J

    invoke-static {v0, v1, v2, v3}, Lh2/e;->b(JJ)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget v0, p0, Li71/h;->d:F

    iget p1, p1, Li71/h;->d:F

    invoke-static {v0, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_5

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_5
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Li71/h;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Li71/h;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Li71/h;->c:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v1, p0, Li71/h;->d:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-wide v0, p0, Li71/h;->a:J

    invoke-static {v0, v1}, Lh2/b;->j(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Li71/h;->b:J

    invoke-static {v1, v2}, Lh2/e;->h(J)Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Li71/h;->c:J

    invoke-static {v2, v3}, Lh2/e;->h(J)Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Li71/h;->d:F

    const-string v4, ", scrollContentSize="

    const-string v5, ", scrollViewSize="

    const-string v6, "GraphScrollPosition(position="

    invoke-static {v6, v0, v4, v1, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", zoomScale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
