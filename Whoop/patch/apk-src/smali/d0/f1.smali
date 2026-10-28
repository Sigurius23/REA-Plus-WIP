.class public final Ld0/f1;
.super Lal/a;
.source "SourceFile"


# static fields
.field public static final S:Ld0/n;

.field public static final T:Ld0/n;


# instance fields
.field public E:Ljava/lang/Object;

.field public F:Ld0/z1;

.field public G:J

.field public final H:La6/l0;

.field public final I:Lp1/g1;

.field public J:Lbc3/m;

.field public final K:Lmc3/c;

.field public final L:Ld0/t0;

.field public M:J

.field public final N:La0/q0;

.field public O:Ld0/y0;

.field public final P:Ld0/x0;

.field public Q:F

.field public final R:Ld0/x0;

.field public final y:Lp1/k1;

.field public final z:Lp1/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld0/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld0/n;-><init>(F)V

    sput-object v0, Ld0/f1;->S:Ld0/n;

    new-instance v0, Ld0/n;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1}, Ld0/n;-><init>(F)V

    sput-object v0, Ld0/f1;->T:Ld0/n;

    return-void
.end method

.method public constructor <init>(Leb/q;)V
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lal/a;-><init>(I)V

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Ld0/f1;->y:Lp1/k1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Ld0/f1;->z:Lp1/k1;

    iput-object p1, p0, Ld0/f1;->E:Ljava/lang/Object;

    new-instance p1, La6/l0;

    const/4 v0, 0x7

    invoke-direct {p1, p0, v0}, La6/l0;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Ld0/f1;->H:La6/l0;

    new-instance p1, Lp1/g1;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lp1/g1;-><init>(F)V

    iput-object p1, p0, Ld0/f1;->I:Lp1/g1;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Ld0/f1;->K:Lmc3/c;

    new-instance p1, Ld0/t0;

    invoke-direct {p1}, Ld0/t0;-><init>()V

    iput-object p1, p0, Ld0/f1;->L:Ld0/t0;

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Ld0/f1;->M:J

    new-instance p1, La0/q0;

    invoke-direct {p1}, La0/q0;-><init>()V

    iput-object p1, p0, Ld0/f1;->N:La0/q0;

    new-instance p1, Ld0/x0;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Ld0/x0;-><init>(Ld0/f1;I)V

    iput-object p1, p0, Ld0/f1;->P:Ld0/x0;

    new-instance p1, Ld0/x0;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Ld0/x0;-><init>(Ld0/f1;I)V

    iput-object p1, p0, Ld0/f1;->R:Ld0/x0;

    return-void
.end method

.method public static final H0(Ld0/f1;)V
    .locals 10

    iget-object v0, p0, Ld0/f1;->F:Ld0/z1;

    iget-object v1, p0, Ld0/f1;->I:Lp1/g1;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, Ld0/f1;->O:Ld0/y0;

    const/4 v3, 0x0

    if-nez v2, :cond_4

    iget-wide v4, p0, Ld0/f1;->G:J

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    if-lez v2, :cond_3

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v2

    const/high16 v4, 0x3f800000    # 1.0f

    cmpg-float v2, v2, v4

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Ld0/f1;->z:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    iget-object v4, p0, Ld0/f1;->y:Lp1/k1;

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    new-instance v2, Ld0/y0;

    invoke-direct {v2}, Ld0/y0;-><init>()V

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v4

    invoke-virtual {v2, v4}, Ld0/y0;->m(F)V

    iget-wide v4, p0, Ld0/f1;->G:J

    invoke-virtual {v2, v4, v5}, Ld0/y0;->k(J)V

    long-to-double v4, v4

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v6

    float-to-double v6, v6

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v8, v6

    mul-double/2addr v8, v4

    invoke-static {v8, v9}, Le93/b;->Y(D)J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ld0/y0;->i(J)V

    invoke-virtual {v2}, Ld0/y0;->f()Ld0/n;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v1

    invoke-virtual {v4, v1, v5}, Ld0/n;->e(FI)V

    goto :goto_1

    :cond_3
    :goto_0
    move-object v2, v3

    :cond_4
    :goto_1
    if-eqz v2, :cond_5

    iget-wide v4, p0, Ld0/f1;->G:J

    invoke-virtual {v2, v4, v5}, Ld0/y0;->k(J)V

    iget-object v1, p0, Ld0/f1;->N:La0/q0;

    invoke-virtual {v1, v2}, La0/q0;->a(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ld0/z1;->m(Ld0/y0;)V

    :cond_5
    iput-object v3, p0, Ld0/f1;->O:Ld0/y0;

    return-void
.end method

.method public static final I0(Ld0/f1;Ls83/c;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Ld0/f1;->N:La0/q0;

    instance-of v1, p1, Ld0/a1;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Ld0/a1;

    iget v2, v1, Ld0/a1;->y:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Ld0/a1;->y:I

    goto :goto_0

    :cond_0
    new-instance v1, Ld0/a1;

    invoke-direct {v1, p0, p1}, Ld0/a1;-><init>(Ld0/f1;Ls83/c;)V

    :goto_0
    iget-object p1, v1, Ld0/a1;->w:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Ld0/a1;->y:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    const-wide/high16 v6, -0x8000000000000000L

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    if-eqz v3, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, La0/q0;->g()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Ld0/f1;->O:Ld0/y0;

    if-nez p1, :cond_4

    return-object v8

    :cond_4
    invoke-interface {v1}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Ld0/f;->p(Lq83/j;)F

    move-result p1

    const/4 v3, 0x0

    cmpg-float p1, p1, v3

    if-nez p1, :cond_5

    invoke-virtual {p0}, Ld0/f1;->M0()V

    iput-wide v6, p0, Ld0/f1;->M:J

    return-object v8

    :cond_5
    iget-wide v9, p0, Ld0/f1;->M:J

    cmp-long p1, v9, v6

    if-nez p1, :cond_6

    iget-object p1, p0, Ld0/f1;->P:Ld0/x0;

    iput v5, v1, Ld0/a1;->y:I

    invoke-interface {v1}, Lq83/d;->getContext()Lq83/j;

    move-result-object v3

    invoke-static {v3}, Lp1/x;->v(Lq83/j;)Lp1/w0;

    move-result-object v3

    invoke-interface {v3, p1, v1}, Lp1/w0;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_6

    goto :goto_4

    :cond_6
    :goto_2
    invoke-virtual {v0}, La0/q0;->h()Z

    move-result p1

    if-nez p1, :cond_8

    iget-object p1, p0, Ld0/f1;->O:Ld0/y0;

    if-eqz p1, :cond_7

    goto :goto_3

    :cond_7
    iput-wide v6, p0, Ld0/f1;->M:J

    return-object v8

    :cond_8
    :goto_3
    iput v4, v1, Ld0/a1;->y:I

    invoke-virtual {p0, v1}, Ld0/f1;->L0(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_6

    :goto_4
    return-object v2
.end method

.method public static final J0(Ld0/f1;Ls83/c;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Ld0/f1;->K:Lmc3/c;

    instance-of v1, p1, Ld0/d1;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Ld0/d1;

    iget v2, v1, Ld0/d1;->z:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Ld0/d1;->z:I

    goto :goto_0

    :cond_0
    new-instance v1, Ld0/d1;

    invoke-direct {v1, p0, p1}, Ld0/d1;-><init>(Ld0/f1;Ls83/c;)V

    :goto_0
    iget-object p1, v1, Ld0/d1;->x:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Ld0/d1;->z:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v0, v1, Ld0/d1;->w:Ljava/lang/Object;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object v3, v1, Ld0/d1;->w:Ljava/lang/Object;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v3

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld0/f1;->y:Lp1/k1;

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v1, Ld0/d1;->w:Ljava/lang/Object;

    iput v5, v1, Ld0/d1;->z:I

    invoke-virtual {v0, v1}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iput-object p1, v1, Ld0/d1;->w:Ljava/lang/Object;

    iput v4, v1, Ld0/d1;->z:I

    new-instance v3, Lbc3/m;

    invoke-static {v1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v1

    invoke-direct {v3, v5, v1}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v3}, Lbc3/m;->s()V

    iput-object v3, p0, Ld0/f1;->J:Lbc3/m;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lmc3/c;->i(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_5

    :goto_2
    return-object v2

    :cond_5
    move-object v6, v0

    move-object v0, p1

    move-object p1, v6

    :goto_3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_6
    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Ld0/f1;->M:J

    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string p1, "targetState while waiting for composition"

    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final K0(Ld0/f1;Ls83/c;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Ld0/f1;->K:Lmc3/c;

    instance-of v1, p1, Ld0/e1;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Ld0/e1;

    iget v2, v1, Ld0/e1;->z:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Ld0/e1;->z:I

    goto :goto_0

    :cond_0
    new-instance v1, Ld0/e1;

    invoke-direct {v1, p0, p1}, Ld0/e1;-><init>(Ld0/f1;Ls83/c;)V

    :goto_0
    iget-object p1, v1, Ld0/e1;->x:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Ld0/e1;->z:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v0, v1, Ld0/e1;->w:Ljava/lang/Object;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object v3, v1, Ld0/e1;->w:Ljava/lang/Object;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v3

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld0/f1;->y:Lp1/k1;

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v1, Ld0/e1;->w:Ljava/lang/Object;

    iput v5, v1, Ld0/e1;->z:I

    invoke-virtual {v0, v1}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object v3, p0, Ld0/f1;->E:Ljava/lang/Object;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v6, 0x0

    if-eqz v3, :cond_5

    invoke-virtual {v0, v6}, Lmc3/c;->i(Ljava/lang/Object;)V

    goto :goto_4

    :cond_5
    iput-object p1, v1, Ld0/e1;->w:Ljava/lang/Object;

    iput v4, v1, Ld0/e1;->z:I

    new-instance v3, Lbc3/m;

    invoke-static {v1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v1

    invoke-direct {v3, v5, v1}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v3}, Lbc3/m;->s()V

    iput-object v3, p0, Ld0/f1;->J:Lbc3/m;

    invoke-virtual {v0, v6}, Lmc3/c;->i(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_6

    :goto_2
    return-object v2

    :cond_6
    move-object v7, v0

    move-object v0, p1

    move-object p1, v7

    :goto_3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_7
    const-wide/high16 v1, -0x8000000000000000L

    iput-wide v1, p0, Ld0/f1;->M:J

    new-instance p0, Ljava/util/concurrent/CancellationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "snapTo() was canceled because state was changed to "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " instead of "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static N0(Ld0/y0;J)V
    .locals 8

    invoke-virtual {p0}, Ld0/y0;->e()J

    move-result-wide v0

    add-long v3, v0, p1

    invoke-virtual {p0, v3, v4}, Ld0/y0;->l(J)V

    invoke-virtual {p0}, Ld0/y0;->b()J

    move-result-wide p1

    cmp-long v0, v3, p1

    const/high16 v1, 0x3f800000    # 1.0f

    if-ltz v0, :cond_0

    invoke-virtual {p0, v1}, Ld0/y0;->m(F)V

    return-void

    :cond_0
    invoke-virtual {p0}, Ld0/y0;->a()Ld0/g2;

    move-result-object v2

    const/4 v0, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Ld0/y0;->f()Ld0/n;

    move-result-object v5

    invoke-virtual {p0}, Ld0/y0;->d()Ld0/n;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, Ld0/f1;->S:Ld0/n;

    :cond_1
    move-object v7, p1

    sget-object v6, Ld0/f1;->T:Ld0/n;

    invoke-interface/range {v2 .. v7}, Ld0/g2;->h(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object p1

    check-cast p1, Ld0/n;

    invoke-virtual {p1, v0}, Ld0/n;->a(I)F

    move-result p1

    const/4 p2, 0x0

    invoke-static {p1, p2, v1}, Le93/b;->m(FFF)F

    move-result p1

    invoke-virtual {p0, p1}, Ld0/y0;->m(F)V

    return-void

    :cond_2
    invoke-virtual {p0}, Ld0/y0;->f()Ld0/n;

    move-result-object v2

    invoke-virtual {v2, v0}, Ld0/n;->a(I)F

    move-result v0

    long-to-float v2, v3

    long-to-float p1, p1

    div-float/2addr v2, p1

    const/4 p1, 0x1

    int-to-float p1, p1

    sub-float/2addr p1, v2

    mul-float/2addr p1, v0

    mul-float/2addr v2, v1

    add-float/2addr v2, p1

    invoke-virtual {p0, v2}, Ld0/y0;->m(F)V

    return-void
.end method


# virtual methods
.method public final B0(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ld0/f1;->z:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final C0(Ld0/z1;)V
    .locals 2

    iget-object v0, p0, Ld0/f1;->F:Ld0/z1;

    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "An instance of SeekableTransitionState has been used in different Transitions. Previous instance: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ld0/f1;->F:Ld0/z1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", new instance: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ld0/u0;->b(Ljava/lang/String;)V

    :cond_1
    :goto_0
    iput-object p1, p0, Ld0/f1;->F:Ld0/z1;

    return-void
.end method

.method public final D0()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ld0/f1;->F:Ld0/z1;

    sget-object v0, Ld0/d2;->b:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz1/v;

    invoke-virtual {v0, p0}, Lz1/v;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final L0(Ls83/c;)Ljava/lang/Object;
    .locals 3

    invoke-interface {p1}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Ld0/f;->p(Lq83/j;)F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v1, v0, v1

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-gtz v1, :cond_0

    invoke-virtual {p0}, Ld0/f1;->M0()V

    return-object v2

    :cond_0
    iput v0, p0, Ld0/f1;->Q:F

    invoke-interface {p1}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lp1/x;->v(Lq83/j;)Lp1/w0;

    move-result-object v0

    iget-object v1, p0, Ld0/f1;->R:Ld0/x0;

    invoke-interface {v0, v1, p1}, Lp1/w0;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    return-object v2
.end method

.method public final M0()V
    .locals 1

    iget-object v0, p0, Ld0/f1;->F:Ld0/z1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ld0/z1;->c()V

    :cond_0
    iget-object v0, p0, Ld0/f1;->N:La0/q0;

    invoke-virtual {v0}, La0/q0;->c()V

    iget-object v0, p0, Ld0/f1;->O:Ld0/y0;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-object v0, p0, Ld0/f1;->O:Ld0/y0;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Ld0/f1;->Q0(F)V

    invoke-virtual {p0}, Ld0/f1;->P0()V

    :cond_1
    return-void
.end method

.method public final O0(FLjava/lang/Object;Ls83/i;)Ljava/lang/Object;
    .locals 8

    const/4 v0, 0x0

    cmpg-float v0, v0, p1

    if-gtz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Expecting fraction between 0 and 1. Got "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ld0/u0;->a(Ljava/lang/String;)V

    :goto_0
    iget-object v5, p0, Ld0/f1;->F:Ld0/z1;

    if-nez v5, :cond_1

    move-object v4, p0

    goto :goto_1

    :cond_1
    iget-object v0, p0, Ld0/f1;->y:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    new-instance v1, Ld0/c1;

    const/4 v7, 0x0

    move-object v4, p0

    move v6, p1

    move-object v2, p2

    invoke-direct/range {v1 .. v7}, Ld0/c1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ld0/f1;Ld0/z1;FLq83/d;)V

    iget-object p1, v4, Ld0/f1;->L:Ld0/t0;

    invoke-static {p1, v1, p3}, Ld0/t0;->a(Ld0/t0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final P0()V
    .locals 5

    iget-object v0, p0, Ld0/f1;->F:Ld0/z1;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Ld0/f1;->I:Lp1/g1;

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v1

    float-to-double v1, v1

    iget-object v3, v0, Ld0/z1;->l:Lp1/f0;

    invoke-virtual {v3}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    long-to-double v3, v3

    mul-double/2addr v1, v3

    invoke-static {v1, v2}, Le93/b;->Y(D)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ld0/z1;->l(J)V

    return-void
.end method

.method public final Q0(F)V
    .locals 1

    iget-object v0, p0, Ld0/f1;->I:Lp1/g1;

    invoke-virtual {v0, p1}, Lp1/g1;->y(F)V

    return-void
.end method

.method public final y0()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld0/f1;->z:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final z0()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld0/f1;->y:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
