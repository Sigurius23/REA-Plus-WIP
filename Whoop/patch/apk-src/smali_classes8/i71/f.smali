.class public final Li71/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li71/g;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\n\u0010\tJ=\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\r\"\u0008\u0008\u0000\u0010\u000c*\u00020\u000b2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u001f\u001a\u0004\u0008 \u0010\u0019\u00a8\u0006!"
    }
    d2 = {
        "Li71/f;",
        "Li71/g;",
        "",
        "windowSize",
        "<init>",
        "(I)V",
        "offsetIndex",
        "dataCount",
        "c",
        "(II)I",
        "b",
        "Lk61/b;",
        "T",
        "",
        "data",
        "Li71/h;",
        "position",
        "Li71/d;",
        "offset",
        "a",
        "(Ljava/util/List;Li71/h;Li71/d;)Ljava/util/List;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getWindowSize",
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
.field private final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0
    .param p1    # I
        .annotation runtime Lcom/google/android/gms/common/util/VisibleForTesting;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Li71/f;->a:I

    return-void
.end method

.method private final b(II)I
    .locals 1

    iget v0, p0, Li71/f;->a:I

    add-int/2addr p1, v0

    add-int/lit8 p1, p1, 0x1

    const/4 v0, 0x0

    invoke-static {p1, v0, p2}, Le93/b;->n(III)I

    move-result p1

    return p1
.end method

.method private final c(II)I
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0, p2}, Le93/b;->n(III)I

    move-result p1

    return p1
.end method


# virtual methods
.method public a(Ljava/util/List;Li71/h;Li71/d;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lk61/b;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Li71/h;",
            "Li71/d;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "position"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offset"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Li71/f;->a:I

    if-lez v0, :cond_2

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p3}, Li71/d;->b()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    invoke-virtual {p2}, Li71/h;->a()J

    move-result-wide v1

    const/16 p2, 0x20

    shr-long/2addr v1, p2

    long-to-int p2, v1

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    int-to-float v0, v0

    mul-float/2addr p2, v0

    float-to-double v0, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-float p2, v0

    float-to-int p2, p2

    invoke-virtual {p3}, Li71/d;->a()I

    move-result p3

    sub-int/2addr p2, p3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p3

    invoke-direct {p0, p2, p3}, Li71/f;->c(II)I

    move-result p3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p0, p2, v0}, Li71/f;->b(II)I

    move-result p2

    invoke-interface {p1, p3, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_1
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Li71/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Li71/f;

    iget v1, p0, Li71/f;->a:I

    iget p1, p1, Li71/f;->a:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Li71/f;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Li71/f;->a:I

    const-string v1, "FixedWindowDataScroller(windowSize="

    const-string v2, ")"

    invoke-static {v0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
