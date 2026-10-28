.class public final Lcoil/compose/CrossfadePainter;
.super Ln2/a;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lcoil/compose/CrossfadePainter;",
        "Ln2/a;",
        "coil-compose-base_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public E:Ln2/a;

.field public final F:Ln2/a;

.field public final G:Ly2/k;

.field public final H:I

.field public final I:Z

.field public final J:Lp1/h1;

.field public K:J

.field public L:Z

.field public final M:Lp1/g1;

.field public final N:Lp1/k1;


# direct methods
.method public constructor <init>(Ln2/a;Ln2/a;Ly2/k;IZ)V
    .locals 0

    invoke-direct {p0}, Ln2/a;-><init>()V

    iput-object p1, p0, Lcoil/compose/CrossfadePainter;->E:Ln2/a;

    iput-object p2, p0, Lcoil/compose/CrossfadePainter;->F:Ln2/a;

    iput-object p3, p0, Lcoil/compose/CrossfadePainter;->G:Ly2/k;

    iput p4, p0, Lcoil/compose/CrossfadePainter;->H:I

    iput-boolean p5, p0, Lcoil/compose/CrossfadePainter;->I:Z

    new-instance p1, Lp1/h1;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lp1/h1;-><init>(I)V

    iput-object p1, p0, Lcoil/compose/CrossfadePainter;->J:Lp1/h1;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lcoil/compose/CrossfadePainter;->K:J

    new-instance p1, Lp1/g1;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-direct {p1, p2}, Lp1/g1;-><init>(F)V

    iput-object p1, p0, Lcoil/compose/CrossfadePainter;->M:Lp1/g1;

    const/4 p1, 0x0

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lcoil/compose/CrossfadePainter;->N:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final b(F)V
    .locals 1

    iget-object v0, p0, Lcoil/compose/CrossfadePainter;->M:Lp1/g1;

    invoke-virtual {v0, p1}, Lp1/g1;->y(F)V

    return-void
.end method

.method public final e(Li2/y;)V
    .locals 1

    iget-object v0, p0, Lcoil/compose/CrossfadePainter;->N:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final h()J
    .locals 10

    iget-object v0, p0, Lcoil/compose/CrossfadePainter;->E:Ln2/a;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln2/a;->h()J

    move-result-wide v3

    goto :goto_0

    :cond_0
    move-wide v3, v1

    :goto_0
    iget-object v0, p0, Lcoil/compose/CrossfadePainter;->F:Ln2/a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ln2/a;->h()J

    move-result-wide v1

    :cond_1
    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v0, v3, v5

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v0, :cond_2

    move v0, v8

    goto :goto_1

    :cond_2
    move v0, v7

    :goto_1
    cmp-long v9, v1, v5

    if-eqz v9, :cond_3

    move v7, v8

    :cond_3
    if-eqz v0, :cond_4

    if-eqz v7, :cond_4

    invoke-static {v3, v4}, Lh2/e;->e(J)F

    move-result v0

    invoke-static {v1, v2}, Lh2/e;->e(J)F

    move-result v5

    invoke-static {v0, v5}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v3, v4}, Lh2/e;->c(J)F

    move-result v3

    invoke-static {v1, v2}, Lh2/e;->c(J)F

    move-result v1

    invoke-static {v3, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-static {v0, v1}, Ljc/x;->b(FF)J

    move-result-wide v0

    return-wide v0

    :cond_4
    return-wide v5
.end method

.method public final i(Lk2/e;)V
    .locals 9

    iget-boolean v0, p0, Lcoil/compose/CrossfadePainter;->L:Z

    iget-object v1, p0, Lcoil/compose/CrossfadePainter;->M:Lp1/g1;

    iget-object v2, p0, Lcoil/compose/CrossfadePainter;->F:Ln2/a;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v0

    invoke-virtual {p0, p1, v2, v0}, Lcoil/compose/CrossfadePainter;->j(Lk2/e;Ln2/a;F)V

    return-void

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Lcoil/compose/CrossfadePainter;->K:J

    const-wide/16 v7, -0x1

    cmp-long v0, v5, v7

    if-nez v0, :cond_1

    iput-wide v3, p0, Lcoil/compose/CrossfadePainter;->K:J

    :cond_1
    iget-wide v5, p0, Lcoil/compose/CrossfadePainter;->K:J

    sub-long/2addr v3, v5

    long-to-float v0, v3

    iget v3, p0, Lcoil/compose/CrossfadePainter;->H:I

    int-to-float v3, v3

    div-float/2addr v0, v3

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v0, v3, v4}, Le93/b;->m(FFF)F

    move-result v3

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v5

    mul-float/2addr v5, v3

    iget-boolean v3, p0, Lcoil/compose/CrossfadePainter;->I:Z

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v1

    sub-float/2addr v1, v5

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v1

    :goto_0
    cmpl-float v0, v0, v4

    const/4 v3, 0x1

    if-ltz v0, :cond_3

    move v0, v3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcoil/compose/CrossfadePainter;->L:Z

    iget-object v0, p0, Lcoil/compose/CrossfadePainter;->E:Ln2/a;

    invoke-virtual {p0, p1, v0, v1}, Lcoil/compose/CrossfadePainter;->j(Lk2/e;Ln2/a;F)V

    invoke-virtual {p0, p1, v2, v5}, Lcoil/compose/CrossfadePainter;->j(Lk2/e;Ln2/a;F)V

    iget-boolean p1, p0, Lcoil/compose/CrossfadePainter;->L:Z

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    iput-object p1, p0, Lcoil/compose/CrossfadePainter;->E:Ln2/a;

    return-void

    :cond_4
    iget-object p1, p0, Lcoil/compose/CrossfadePainter;->J:Lp1/h1;

    invoke-virtual {p1}, Lp1/h1;->x()I

    move-result v0

    add-int/2addr v0, v3

    invoke-virtual {p1, v0}, Lp1/h1;->y(I)V

    return-void
.end method

.method public final j(Lk2/e;Ln2/a;F)V
    .locals 12

    if-eqz p2, :cond_7

    const/4 v0, 0x0

    cmpg-float v0, p3, v0

    if-gtz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-interface {p1}, Lk2/e;->d()J

    move-result-wide v0

    invoke-virtual {p2}, Ln2/a;->h()J

    move-result-wide v2

    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v6, v2, v4

    if-nez v6, :cond_1

    :goto_0
    move-wide v8, v0

    goto :goto_2

    :cond_1
    invoke-static {v2, v3}, Lh2/e;->f(J)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    cmp-long v6, v0, v4

    if-nez v6, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {v0, v1}, Lh2/e;->f(J)Z

    move-result v6

    if-eqz v6, :cond_4

    :goto_1
    goto :goto_0

    :cond_4
    iget-object v6, p0, Lcoil/compose/CrossfadePainter;->G:Ly2/k;

    invoke-interface {v6, v2, v3, v0, v1}, Ly2/k;->a(JJ)J

    move-result-wide v6

    invoke-static {v2, v3, v6, v7}, Ly2/q1;->i(JJ)J

    move-result-wide v2

    move-wide v8, v2

    :goto_2
    cmp-long v2, v0, v4

    iget-object v3, p0, Lcoil/compose/CrossfadePainter;->N:Lp1/k1;

    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {v0, v1}, Lh2/e;->f(J)Z

    move-result v2

    if-eqz v2, :cond_6

    :goto_3
    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Li2/y;

    move-object v7, p1

    move-object v6, p2

    move v10, p3

    invoke-virtual/range {v6 .. v11}, Ln2/a;->g(Lk2/e;JFLi2/y;)V

    return-void

    :cond_6
    move-object v7, p1

    move-object v6, p2

    move v10, p3

    invoke-static {v0, v1}, Lh2/e;->e(J)F

    move-result p1

    invoke-static {v8, v9}, Lh2/e;->e(J)F

    move-result p2

    sub-float/2addr p1, p2

    const/4 p2, 0x2

    int-to-float p2, p2

    div-float/2addr p1, p2

    invoke-static {v0, v1}, Lh2/e;->c(J)F

    move-result p3

    invoke-static {v8, v9}, Lh2/e;->c(J)F

    move-result v0

    sub-float/2addr p3, v0

    div-float/2addr p3, p2

    invoke-interface {v7}, Lk2/e;->t0()La3/p;

    move-result-object p2

    iget-object p2, p2, La3/p;->x:Ljava/lang/Object;

    check-cast p2, Laj/d;

    invoke-virtual {p2, p1, p3, p1, p3}, Laj/d;->o(FFFF)V

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v11, p2

    check-cast v11, Li2/y;

    invoke-virtual/range {v6 .. v11}, Ln2/a;->g(Lk2/e;JFLi2/y;)V

    invoke-interface {v7}, Lk2/e;->t0()La3/p;

    move-result-object p2

    iget-object p2, p2, La3/p;->x:Ljava/lang/Object;

    check-cast p2, Laj/d;

    neg-float p1, p1

    neg-float p3, p3

    invoke-virtual {p2, p1, p3, p1, p3}, Laj/d;->o(FFFF)V

    :cond_7
    :goto_4
    return-void
.end method
