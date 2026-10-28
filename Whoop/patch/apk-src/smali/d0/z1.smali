.class public final Ld0/z1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lal/a;

.field public final b:Ld0/z1;

.field public final c:Ljava/lang/String;

.field public final d:Lp1/k1;

.field public final e:Lp1/k1;

.field public final f:Lp1/i1;

.field public final g:Lp1/i1;

.field public final h:Lp1/k1;

.field public final i:Lz1/p;

.field public final j:Lz1/p;

.field public final k:Lp1/k1;

.field public final l:Lp1/f0;


# direct methods
.method public constructor <init>(Lal/a;Ld0/z1;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/z1;->a:Lal/a;

    iput-object p2, p0, Ld0/z1;->b:Ld0/z1;

    iput-object p3, p0, Ld0/z1;->c:Ljava/lang/String;

    invoke-virtual {p1}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Ld0/z1;->d:Lp1/k1;

    new-instance p2, Ld0/u1;

    invoke-virtual {p1}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p2, p3, v0}, Ld0/u1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Ld0/z1;->e:Lp1/k1;

    new-instance p2, Lp1/i1;

    const-wide/16 v0, 0x0

    invoke-direct {p2, v0, v1}, Lp1/i1;-><init>(J)V

    iput-object p2, p0, Ld0/z1;->f:Lp1/i1;

    new-instance p2, Lp1/i1;

    const-wide/high16 v0, -0x8000000000000000L

    invoke-direct {p2, v0, v1}, Lp1/i1;-><init>(J)V

    iput-object p2, p0, Ld0/z1;->g:Lp1/i1;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p3

    iput-object p3, p0, Ld0/z1;->h:Lp1/k1;

    new-instance p3, Lz1/p;

    invoke-direct {p3}, Lz1/p;-><init>()V

    iput-object p3, p0, Ld0/z1;->i:Lz1/p;

    new-instance p3, Lz1/p;

    invoke-direct {p3}, Lz1/p;-><init>()V

    iput-object p3, p0, Ld0/z1;->j:Lz1/p;

    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Ld0/z1;->k:Lp1/k1;

    new-instance p2, Ld0/q1;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, Ld0/q1;-><init>(Ld0/z1;I)V

    invoke-static {p2}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object p2

    iput-object p2, p0, Ld0/z1;->l:Lp1/f0;

    invoke-virtual {p1, p0}, Lal/a;->C0(Ld0/z1;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    check-cast p2, Lp1/q;

    const v0, -0x59064cff

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, p3

    goto :goto_2

    :cond_2
    move v0, p3

    :goto_2
    and-int/lit8 v1, p3, 0x30

    const/16 v2, 0x20

    if-nez v1, :cond_4

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    const/16 v1, 0x10

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    and-int/lit8 v1, v0, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v1, v3, :cond_5

    move v1, v4

    goto :goto_4

    :cond_5
    move v1, v5

    :goto_4
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p2, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-virtual {p0}, Ld0/z1;->g()Z

    move-result v1

    if-nez v1, :cond_e

    const v1, 0x1bc87041

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {p0, p1}, Ld0/z1;->p(Ljava/lang/Object;)V

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v2, :cond_6

    move v1, v4

    goto :goto_5

    :cond_6
    move v1, v5

    :goto_5
    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_7

    if-ne v3, v6, :cond_8

    :cond_7
    new-instance v1, Ld0/q1;

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3}, Ld0/q1;-><init>(Ld0/z1;I)V

    invoke-static {v1}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v3

    invoke-virtual {p2, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v3, Lp1/t2;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_d

    const v1, 0x1bceaa74    # 3.4189994E-22f

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_9

    invoke-static {p2}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v1

    invoke-virtual {p2, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v1, Lbc3/c0;

    invoke-virtual {p2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-ne v0, v2, :cond_a

    goto :goto_6

    :cond_a
    move v4, v5

    :goto_6
    or-int v0, v3, v4

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_b

    if-ne v2, v6, :cond_c

    :cond_b
    new-instance v2, Lbp0/n;

    const/16 v0, 0x9

    invoke-direct {v2, v0, v1, p0}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, p0, v2, p2}, Lp1/x;->d(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_d
    const v0, 0x1be1a041

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_e
    const v0, 0x1be1c701

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_f
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_10

    new-instance v0, La11/j;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, p3, v1}, La11/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method public final b()J
    .locals 8

    iget-object v0, p0, Ld0/z1;->i:Lz1/p;

    invoke-virtual {v0}, Lz1/p;->size()I

    move-result v1

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v1, :cond_0

    invoke-virtual {v0, v5}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ld0/v1;

    iget-object v6, v6, Ld0/v1;->L:Lp1/i1;

    invoke-virtual {v6}, Lp1/i1;->x()J

    move-result-wide v6

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ld0/z1;->j:Lz1/p;

    invoke-virtual {v0}, Lz1/p;->size()I

    move-result v1

    :goto_1
    if-ge v4, v1, :cond_1

    invoke-virtual {v0, v4}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ld0/z1;

    invoke-virtual {v5}, Ld0/z1;->b()J

    move-result-wide v5

    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    return-wide v2
.end method

.method public final c()V
    .locals 6

    iget-object v0, p0, Ld0/z1;->i:Lz1/p;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld0/v1;

    const/4 v5, 0x0

    iput-object v5, v4, Ld0/v1;->F:Ld0/p1;

    iput-object v5, v4, Ld0/v1;->E:Ld0/y0;

    iput-boolean v2, v4, Ld0/v1;->I:Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ld0/z1;->j:Lz1/p;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    :goto_1
    if-ge v2, v1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld0/z1;

    invoke-virtual {v3}, Ld0/z1;->c()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final d()Z
    .locals 5

    iget-object v0, p0, Ld0/z1;->i:Lz1/p;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld0/v1;

    iget-object v4, v4, Ld0/v1;->E:Ld0/y0;

    if-eqz v4, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ld0/z1;->j:Lz1/p;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld0/z1;

    invoke-virtual {v4}, Ld0/z1;->d()Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_2
    const/4 v0, 0x1

    return v0

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    return v2
.end method

.method public final e()J
    .locals 2

    iget-object v0, p0, Ld0/z1;->b:Ld0/z1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ld0/z1;->e()J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p0, Ld0/z1;->f:Lp1/i1;

    invoke-virtual {v0}, Lp1/i1;->x()J

    move-result-wide v0

    return-wide v0
.end method

.method public final f()Ld0/t1;
    .locals 1

    iget-object v0, p0, Ld0/z1;->e:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld0/t1;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-object v0, p0, Ld0/z1;->k:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final h(JZ)V
    .locals 10

    iget-object v0, p0, Ld0/z1;->g:Lp1/i1;

    invoke-virtual {v0}, Lp1/i1;->x()J

    move-result-wide v1

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v1, v1, v3

    iget-object v2, p0, Ld0/z1;->a:Lal/a;

    if-nez v1, :cond_0

    invoke-virtual {v0, p1, p2}, Lp1/i1;->y(J)V

    iget-object v0, v2, Lal/a;->x:Ljava/lang/Object;

    check-cast v0, Lp1/k1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, v2, Lal/a;->x:Ljava/lang/Object;

    check-cast v0, Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, v2, Lal/a;->x:Ljava/lang/Object;

    check-cast v0, Lp1/k1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Ld0/z1;->h:Lp1/k1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Ld0/z1;->i:Lz1/p;

    invoke-virtual {v0}, Lz1/p;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    move v4, v2

    :goto_1
    if-ge v4, v1, :cond_5

    invoke-virtual {v0, v4}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ld0/v1;

    iget-object v6, v5, Ld0/v1;->G:Lp1/k1;

    iget-object v7, v5, Ld0/v1;->G:Lp1/k1;

    invoke-virtual {v6}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-nez v6, :cond_3

    if-eqz p3, :cond_2

    invoke-virtual {v5}, Ld0/v1;->a()Ld0/p1;

    move-result-object v6

    invoke-virtual {v6}, Ld0/p1;->d()J

    move-result-wide v8

    goto :goto_2

    :cond_2
    move-wide v8, p1

    :goto_2
    invoke-virtual {v5}, Ld0/v1;->a()Ld0/p1;

    move-result-object v6

    invoke-virtual {v6, v8, v9}, Ld0/p1;->f(J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Ld0/v1;->d(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ld0/v1;->a()Ld0/p1;

    move-result-object v6

    invoke-virtual {v6, v8, v9}, Ld0/p1;->b(J)Ld0/r;

    move-result-object v6

    iput-object v6, v5, Ld0/v1;->K:Ld0/r;

    invoke-virtual {v5}, Ld0/v1;->a()Ld0/p1;

    move-result-object v5

    invoke-interface {v5, v8, v9}, Ld0/h;->c(J)Z

    move-result v5

    if-eqz v5, :cond_3

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v7, v5}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_3
    invoke-virtual {v7}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_4

    move v3, v2

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    iget-object v0, p0, Ld0/z1;->j:Lz1/p;

    invoke-virtual {v0}, Lz1/p;->size()I

    move-result v1

    move v4, v2

    :goto_3
    if-ge v4, v1, :cond_8

    invoke-virtual {v0, v4}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ld0/z1;

    iget-object v6, v5, Ld0/z1;->d:Lp1/k1;

    iget-object v7, v5, Ld0/z1;->a:Lal/a;

    invoke-virtual {v6}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v7}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    invoke-virtual {v5, p1, p2, p3}, Ld0/z1;->h(JZ)V

    :cond_6
    iget-object v5, v5, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v5}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v7}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    move v3, v2

    :cond_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_8
    if-eqz v3, :cond_9

    invoke-virtual {p0}, Ld0/z1;->i()V

    :cond_9
    return-void
.end method

.method public final i()V
    .locals 4

    const-wide/high16 v0, -0x8000000000000000L

    iget-object v2, p0, Ld0/z1;->g:Lp1/i1;

    invoke-virtual {v2, v0, v1}, Lp1/i1;->y(J)V

    iget-object v0, p0, Ld0/z1;->a:Lal/a;

    instance-of v1, v0, Ld0/q0;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ld0/q0;

    iget-object v2, p0, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ld0/q0;->B0(Ljava/lang/Object;)V

    :cond_0
    const-wide/16 v1, 0x0

    invoke-virtual {p0, v1, v2}, Ld0/z1;->n(J)V

    iget-object v0, v0, Lal/a;->x:Ljava/lang/Object;

    check-cast v0, Lp1/k1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Ld0/z1;->j:Lz1/p;

    invoke-virtual {v0}, Lz1/p;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld0/z1;

    invoke-virtual {v3}, Ld0/z1;->i()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final j(F)V
    .locals 8

    iget-object v0, p0, Ld0/z1;->i:Lz1/p;

    invoke-virtual {v0}, Lz1/p;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_4

    invoke-virtual {v0, v3}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld0/v1;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v5, -0x3f800000    # -4.0f

    cmpg-float v5, p1, v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    const/high16 v6, -0x3f600000    # -5.0f

    cmpg-float v6, p1, v6

    if-nez v6, :cond_3

    :goto_1
    iget-object v6, v4, Ld0/v1;->F:Ld0/p1;

    if-eqz v6, :cond_1

    invoke-virtual {v4}, Ld0/v1;->a()Ld0/p1;

    move-result-object v7

    iget-object v6, v6, Ld0/p1;->c:Ljava/lang/Object;

    invoke-virtual {v7, v6}, Ld0/p1;->h(Ljava/lang/Object;)V

    const/4 v6, 0x0

    iput-object v6, v4, Ld0/v1;->E:Ld0/y0;

    iput-object v6, v4, Ld0/v1;->F:Ld0/p1;

    :cond_1
    if-nez v5, :cond_2

    invoke-virtual {v4}, Ld0/v1;->a()Ld0/p1;

    move-result-object v5

    iget-object v5, v5, Ld0/p1;->d:Ljava/lang/Object;

    goto :goto_2

    :cond_2
    invoke-virtual {v4}, Ld0/v1;->a()Ld0/p1;

    move-result-object v5

    iget-object v5, v5, Ld0/p1;->c:Ljava/lang/Object;

    :goto_2
    invoke-virtual {v4}, Ld0/v1;->a()Ld0/p1;

    move-result-object v6

    invoke-virtual {v6, v5}, Ld0/p1;->h(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ld0/v1;->a()Ld0/p1;

    move-result-object v6

    invoke-virtual {v6, v5}, Ld0/p1;->i(Ljava/lang/Object;)V

    invoke-virtual {v4, v5}, Ld0/v1;->d(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ld0/v1;->a()Ld0/p1;

    move-result-object v5

    invoke-virtual {v5}, Ld0/p1;->d()J

    move-result-wide v5

    iget-object v4, v4, Ld0/v1;->L:Lp1/i1;

    invoke-virtual {v4, v5, v6}, Lp1/i1;->y(J)V

    goto :goto_3

    :cond_3
    iget-object v4, v4, Ld0/v1;->H:Lp1/g1;

    invoke-virtual {v4, p1}, Lp1/g1;->y(F)V

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    iget-object v0, p0, Ld0/z1;->j:Lz1/p;

    invoke-virtual {v0}, Lz1/p;->size()I

    move-result v1

    :goto_4
    if-ge v2, v1, :cond_5

    invoke-virtual {v0, v2}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld0/z1;

    invoke-virtual {v3, p1}, Ld0/z1;->j(F)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_5
    return-void
.end method

.method public final k(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    const-wide/high16 v0, -0x8000000000000000L

    iget-object v2, p0, Ld0/z1;->g:Lp1/i1;

    invoke-virtual {v2, v0, v1}, Lp1/i1;->y(J)V

    iget-object v0, p0, Ld0/z1;->a:Lal/a;

    iget-object v1, v0, Lal/a;->x:Ljava/lang/Object;

    check-cast v1, Lp1/k1;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ld0/z1;->g()Z

    move-result v1

    iget-object v2, p0, Ld0/z1;->d:Lp1/k1;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    invoke-virtual {v0}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    instance-of v1, v0, Ld0/q0;

    if-eqz v1, :cond_1

    check-cast v0, Ld0/q0;

    invoke-virtual {v0, p1}, Ld0/q0;->B0(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v2, p2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Ld0/z1;->k:Lp1/k1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    new-instance v0, Ld0/u1;

    invoke-direct {v0, p1, p2}, Ld0/u1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Ld0/z1;->e:Lp1/k1;

    invoke-virtual {p1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_2
    iget-object p1, p0, Ld0/z1;->j:Lz1/p;

    invoke-virtual {p1}, Lz1/p;->size()I

    move-result p2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_4

    invoke-virtual {p1, v1}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld0/z1;

    const-string v3, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ld0/z1;->g()Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, v2, Ld0/z1;->a:Lal/a;

    invoke-virtual {v3}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, v2, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ld0/z1;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    iget-object p1, p0, Ld0/z1;->i:Lz1/p;

    invoke-virtual {p1}, Lz1/p;->size()I

    move-result p2

    :goto_1
    if-ge v0, p2, :cond_5

    invoke-virtual {p1, v0}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld0/v1;

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v2, v3}, Ld0/v1;->c(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    return-void
.end method

.method public final l(J)V
    .locals 6

    iget-object v0, p0, Ld0/z1;->g:Lp1/i1;

    invoke-virtual {v0}, Lp1/i1;->x()J

    move-result-wide v1

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    invoke-virtual {v0, p1, p2}, Lp1/i1;->y(J)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Ld0/z1;->n(J)V

    iget-object v0, p0, Ld0/z1;->h:Lp1/k1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Ld0/z1;->i:Lz1/p;

    invoke-virtual {v0}, Lz1/p;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v3}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld0/v1;

    invoke-virtual {v4, p1, p2}, Ld0/v1;->c(J)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ld0/z1;->j:Lz1/p;

    invoke-virtual {v0}, Lz1/p;->size()I

    move-result v1

    :goto_1
    if-ge v2, v1, :cond_3

    invoke-virtual {v0, v2}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld0/z1;

    iget-object v4, v3, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    iget-object v5, v3, Ld0/z1;->a:Lal/a;

    invoke-virtual {v5}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v3, p1, p2}, Ld0/z1;->l(J)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final m(Ld0/y0;)V
    .locals 13

    iget-object v0, p0, Ld0/z1;->i:Lz1/p;

    invoke-virtual {v0}, Lz1/p;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v3}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld0/v1;

    iget-object v5, v4, Ld0/v1;->J:Lp1/k1;

    invoke-virtual {v4}, Ld0/v1;->a()Ld0/p1;

    move-result-object v6

    iget-object v6, v6, Ld0/p1;->c:Ljava/lang/Object;

    invoke-virtual {v4}, Ld0/v1;->a()Ld0/p1;

    move-result-object v7

    iget-object v7, v7, Ld0/p1;->d:Ljava/lang/Object;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    invoke-virtual {v4}, Ld0/v1;->a()Ld0/p1;

    move-result-object v6

    iput-object v6, v4, Ld0/v1;->F:Ld0/p1;

    iput-object p1, v4, Ld0/v1;->E:Ld0/y0;

    :cond_0
    new-instance v7, Ld0/p1;

    iget-object v8, v4, Ld0/v1;->N:Ld0/i1;

    iget-object v9, v4, Ld0/v1;->w:Ld0/f2;

    invoke-virtual {v5}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v5}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v11

    iget-object v5, v4, Ld0/v1;->K:Ld0/r;

    invoke-virtual {v5}, Ld0/r;->c()Ld0/r;

    move-result-object v12

    invoke-direct/range {v7 .. v12}, Ld0/p1;-><init>(Ld0/l;Ld0/f2;Ljava/lang/Object;Ljava/lang/Object;Ld0/r;)V

    iget-object v5, v4, Ld0/v1;->z:Lp1/k1;

    invoke-virtual {v5, v7}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ld0/v1;->a()Ld0/p1;

    move-result-object v5

    invoke-virtual {v5}, Ld0/p1;->d()J

    move-result-wide v5

    iget-object v7, v4, Ld0/v1;->L:Lp1/i1;

    invoke-virtual {v7, v5, v6}, Lp1/i1;->y(J)V

    const/4 v5, 0x1

    iput-boolean v5, v4, Ld0/v1;->I:Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ld0/z1;->j:Lz1/p;

    invoke-virtual {v0}, Lz1/p;->size()I

    move-result v1

    :goto_1
    if-ge v2, v1, :cond_2

    invoke-virtual {v0, v2}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld0/z1;

    invoke-virtual {v3, p1}, Ld0/z1;->m(Ld0/y0;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final n(J)V
    .locals 1

    iget-object v0, p0, Ld0/z1;->b:Ld0/z1;

    if-nez v0, :cond_0

    iget-object v0, p0, Ld0/z1;->f:Lp1/i1;

    invoke-virtual {v0, p1, p2}, Lp1/i1;->y(J)V

    :cond_0
    return-void
.end method

.method public final o()V
    .locals 12

    iget-object v0, p0, Ld0/z1;->i:Lz1/p;

    invoke-virtual {v0}, Lz1/p;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_6

    invoke-virtual {v0, v3}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld0/v1;

    iget-object v5, v4, Ld0/v1;->E:Ld0/y0;

    if-nez v5, :cond_0

    goto :goto_3

    :cond_0
    iget-object v6, v4, Ld0/v1;->F:Ld0/p1;

    if-nez v6, :cond_1

    goto :goto_3

    :cond_1
    invoke-virtual {v5}, Ld0/y0;->c()J

    move-result-wide v7

    long-to-double v7, v7

    invoke-virtual {v5}, Ld0/y0;->g()F

    move-result v9

    float-to-double v9, v9

    mul-double/2addr v7, v9

    invoke-static {v7, v8}, Le93/b;->Y(D)J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Ld0/p1;->f(J)Ljava/lang/Object;

    move-result-object v6

    iget-boolean v9, v4, Ld0/v1;->I:Z

    if-eqz v9, :cond_2

    invoke-virtual {v4}, Ld0/v1;->a()Ld0/p1;

    move-result-object v9

    invoke-virtual {v9, v6}, Ld0/p1;->i(Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {v4}, Ld0/v1;->a()Ld0/p1;

    move-result-object v9

    invoke-virtual {v9, v6}, Ld0/p1;->h(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ld0/v1;->a()Ld0/p1;

    move-result-object v9

    invoke-virtual {v9}, Ld0/p1;->d()J

    move-result-wide v9

    iget-object v11, v4, Ld0/v1;->L:Lp1/i1;

    invoke-virtual {v11, v9, v10}, Lp1/i1;->y(J)V

    iget-object v9, v4, Ld0/v1;->H:Lp1/g1;

    invoke-virtual {v9}, Lp1/g1;->x()F

    move-result v9

    const/high16 v10, -0x40000000    # -2.0f

    cmpg-float v9, v9, v10

    if-nez v9, :cond_3

    goto :goto_1

    :cond_3
    iget-boolean v9, v4, Ld0/v1;->I:Z

    if-eqz v9, :cond_4

    :goto_1
    invoke-virtual {v4, v6}, Ld0/v1;->d(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget-object v6, v4, Ld0/v1;->O:Ld0/z1;

    invoke-virtual {v6}, Ld0/z1;->e()J

    move-result-wide v9

    invoke-virtual {v4, v9, v10}, Ld0/v1;->c(J)V

    :goto_2
    invoke-virtual {v5}, Ld0/y0;->c()J

    move-result-wide v9

    cmp-long v6, v7, v9

    if-ltz v6, :cond_5

    const/4 v5, 0x0

    iput-object v5, v4, Ld0/v1;->E:Ld0/y0;

    iput-object v5, v4, Ld0/v1;->F:Ld0/p1;

    goto :goto_3

    :cond_5
    invoke-virtual {v5, v2}, Ld0/y0;->j(Z)V

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    iget-object v0, p0, Ld0/z1;->j:Lz1/p;

    invoke-virtual {v0}, Lz1/p;->size()I

    move-result v1

    :goto_4
    if-ge v2, v1, :cond_7

    invoke-virtual {v0, v2}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld0/z1;

    invoke-virtual {v3}, Ld0/z1;->o()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_7
    return-void
.end method

.method public final p(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Ld0/u1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Ld0/u1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, p0, Ld0/z1;->e:Lp1/k1;

    invoke-virtual {v2, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v1, p0, Ld0/z1;->a:Lal/a;

    invoke-virtual {v1}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Lal/a;->B0(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Ld0/z1;->g:Lp1/i1;

    invoke-virtual {p1}, Lp1/i1;->x()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long p1, v0, v2

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Ld0/z1;->h:Lp1/k1;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :goto_0
    iget-object p1, p0, Ld0/z1;->i:Lz1/p;

    invoke-virtual {p1}, Lz1/p;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_2

    invoke-virtual {p1, v1}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld0/v1;

    const/high16 v3, -0x40000000    # -2.0f

    iget-object v2, v2, Ld0/v1;->H:Lp1/g1;

    invoke-virtual {v2, v3}, Lp1/g1;->y(F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Ld0/z1;->i:Lz1/p;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    const-string v2, "Transition animation values: "

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-virtual {v0, v3}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld0/v1;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v2
.end method
