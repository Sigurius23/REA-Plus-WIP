.class public final Lhy0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/a1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\'\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lhy0/h;",
        "Li2/a1;",
        "Ly3/f;",
        "step",
        "<init>",
        "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "Lh2/e;",
        "size",
        "Ly3/m;",
        "layoutDirection",
        "Ly3/c;",
        "density",
        "Li2/m0;",
        "b",
        "(JLy3/m;Ly3/c;)Li2/m0;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "F",
        "getStep-D9Ej5fM",
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
.field private final a:F


# direct methods
.method private constructor <init>(F)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lhy0/h;->a:F

    const/4 v0, 0x0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "dotted step size was 0, use a solid line instead"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(FLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lhy0/h;-><init>(F)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(JLy3/m;Ly3/c;)Li2/p0;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lhy0/h;->b(JLy3/m;Ly3/c;)Li2/m0;

    move-result-object p1

    return-object p1
.end method

.method public b(JLy3/m;Ly3/c;)Li2/m0;
    .locals 9

    const-string v0, "layoutDirection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "density"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object p3

    iget v0, p0, Lhy0/h;->a:F

    invoke-interface {p4, v0}, Ly3/c;->q0(F)F

    move-result p4

    const/16 v0, 0x20

    shr-long v1, p1, v0

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    div-float/2addr v2, p4

    invoke-static {v2}, Le93/b;->X(F)I

    move-result p4

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    int-to-float v2, p4

    div-float/2addr v1, v2

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float v2, v1, v2

    const-wide v3, 0xffffffffL

    and-long/2addr p1, v3

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long v5, p2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    shl-long/2addr v5, v0

    and-long/2addr p1, v3

    or-long/2addr p1, v5

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p4, :cond_0

    int-to-float v5, v2

    mul-float/2addr v5, v1

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    shl-long/2addr v5, v0

    and-long/2addr v7, v3

    or-long/2addr v5, v7

    invoke-static {v5, v6, p1, p2}, Lhg3/i;->j(JJ)Lh2/c;

    move-result-object v5

    invoke-static {p3, v5}, Li2/s0;->a(Li2/s0;Lh2/c;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Li2/j;->f()V

    new-instance p1, Li2/m0;

    invoke-direct {p1, p3}, Li2/m0;-><init>(Li2/s0;)V

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lhy0/h;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lhy0/h;

    iget v0, p0, Lhy0/h;->a:F

    iget p1, p1, Lhy0/h;->a:F

    invoke-static {v0, p1}, Ly3/f;->b(FF)Z

    move-result p1

    if-nez p1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lhy0/h;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lhy0/h;->a:F

    invoke-static {v0}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v0

    const-string v1, "DottedShape(step="

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
