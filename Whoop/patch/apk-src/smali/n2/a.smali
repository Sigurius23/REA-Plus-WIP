.class public abstract Ln2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public w:Li2/h;

.field public x:Li2/y;

.field public y:F

.field public z:Ly3/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Ln2/a;->y:F

    sget-object v0, Ly3/m;->w:Ly3/m;

    iput-object v0, p0, Ln2/a;->z:Ly3/m;

    return-void
.end method


# virtual methods
.method public abstract b(F)V
.end method

.method public abstract e(Li2/y;)V
.end method

.method public f(Ly3/m;)V
    .locals 0

    return-void
.end method

.method public final g(Lk2/e;JFLi2/y;)V
    .locals 5

    iget v0, p0, Ln2/a;->y:F

    cmpg-float v0, v0, p4

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p4}, Ln2/a;->b(F)V

    iput p4, p0, Ln2/a;->y:F

    :goto_0
    iget-object v0, p0, Ln2/a;->x:Li2/y;

    invoke-static {v0, p5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p5}, Ln2/a;->e(Li2/y;)V

    iput-object p5, p0, Ln2/a;->x:Li2/y;

    :cond_1
    invoke-interface {p1}, Lk2/e;->getLayoutDirection()Ly3/m;

    move-result-object p5

    iget-object v0, p0, Ln2/a;->z:Ly3/m;

    if-eq v0, p5, :cond_2

    invoke-virtual {p0, p5}, Ln2/a;->f(Ly3/m;)V

    iput-object p5, p0, Ln2/a;->z:Ly3/m;

    :cond_2
    invoke-interface {p1}, Lk2/e;->d()J

    move-result-wide v0

    const/16 p5, 0x20

    shr-long/2addr v0, p5

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    shr-long v1, p2, p5

    long-to-int p5, v1

    invoke-static {p5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-interface {p1}, Lk2/e;->d()J

    move-result-wide v1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    and-long/2addr p2, v3

    long-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    sub-float/2addr v1, p3

    invoke-interface {p1}, Lk2/e;->t0()La3/p;

    move-result-object p3

    iget-object p3, p3, La3/p;->x:Ljava/lang/Object;

    check-cast p3, Laj/d;

    const/4 v2, 0x0

    invoke-virtual {p3, v2, v2, v0, v1}, Laj/d;->o(FFFF)V

    cmpl-float p3, p4, v2

    const/high16 p4, -0x80000000

    if-lez p3, :cond_3

    :try_start_0
    invoke-static {p5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    cmpl-float p3, p3, v2

    if-lez p3, :cond_3

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    cmpl-float p2, p2, v2

    if-lez p2, :cond_3

    invoke-virtual {p0, p1}, Ln2/a;->i(Lk2/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Lk2/e;->t0()La3/p;

    move-result-object p1

    iget-object p1, p1, La3/p;->x:Ljava/lang/Object;

    check-cast p1, Laj/d;

    neg-float p3, v0

    neg-float p5, v1

    invoke-virtual {p1, p4, p4, p3, p5}, Laj/d;->o(FFFF)V

    throw p2

    :cond_3
    :goto_1
    invoke-interface {p1}, Lk2/e;->t0()La3/p;

    move-result-object p1

    iget-object p1, p1, La3/p;->x:Ljava/lang/Object;

    check-cast p1, Laj/d;

    neg-float p2, v0

    neg-float p3, v1

    invoke-virtual {p1, p4, p4, p2, p3}, Laj/d;->o(FFFF)V

    return-void
.end method

.method public abstract h()J
.end method

.method public abstract i(Lk2/e;)V
.end method
