.class public final Lp1/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/Composer;


# instance fields
.field public A:I

.field public B:I

.field public C:Z

.field public final D:Lp1/p;

.field public final E:Ljava/util/ArrayList;

.field public F:Z

.field public G:Lp1/e2;

.field public H:Lp1/f2;

.field public I:Lp1/i2;

.field public J:Z

.field public K:Lp1/p1;

.field public L:Lq1/a;

.field public final M:Lq1/b;

.field public N:Lp1/a;

.field public O:Lq1/c;

.field public P:Lux/f0;

.field public final Q:La2/c;

.field public final R:Lq83/j;

.field public S:Z

.field public T:J

.field public U:Lp1/v;

.field public final a:Lhb3/a0;

.field public final b:Lp1/t;

.field public final c:Lp1/f2;

.field public final d:La0/y0;

.field public final e:Lq1/a;

.field public final f:Lq1/a;

.field public final g:Lbu/c;

.field public final h:Lp1/w;

.field public final i:Ljava/util/ArrayList;

.field public j:Lp1/o1;

.field public k:I

.field public l:I

.field public m:I

.field public final n:La3/x;

.field public o:[I

.field public p:La0/e0;

.field public q:Z

.field public r:Z

.field public final s:Ljava/util/ArrayList;

.field public final t:La3/x;

.field public u:Lp1/p1;

.field public v:La0/g0;

.field public w:Z

.field public final x:La3/x;

.field public y:Z

.field public z:I


# direct methods
.method public constructor <init>(Lhb3/a0;Lp1/t;Lp1/f2;La0/y0;Lq1/a;Lq1/a;Lbu/c;Lp1/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/q;->a:Lhb3/a0;

    iput-object p2, p0, Lp1/q;->b:Lp1/t;

    iput-object p3, p0, Lp1/q;->c:Lp1/f2;

    iput-object p4, p0, Lp1/q;->d:La0/y0;

    iput-object p5, p0, Lp1/q;->e:Lq1/a;

    iput-object p6, p0, Lp1/q;->f:Lq1/a;

    iput-object p7, p0, Lp1/q;->g:Lbu/c;

    iput-object p8, p0, Lp1/q;->h:Lp1/w;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lp1/q;->i:Ljava/util/ArrayList;

    new-instance p1, La3/x;

    invoke-direct {p1}, La3/x;-><init>()V

    iput-object p1, p0, Lp1/q;->n:La3/x;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lp1/q;->s:Ljava/util/ArrayList;

    new-instance p1, La3/x;

    invoke-direct {p1}, La3/x;-><init>()V

    iput-object p1, p0, Lp1/q;->t:La3/x;

    sget-object p1, Lx1/g;->z:Lx1/g;

    iput-object p1, p0, Lp1/q;->u:Lp1/p1;

    new-instance p1, La3/x;

    invoke-direct {p1}, La3/x;-><init>()V

    iput-object p1, p0, Lp1/q;->x:La3/x;

    const/4 p1, -0x1

    iput p1, p0, Lp1/q;->z:I

    invoke-virtual {p2}, Lp1/t;->f()Z

    move-result p1

    const/4 p4, 0x0

    const/4 p6, 0x1

    if-nez p1, :cond_1

    invoke-virtual {p2}, Lp1/t;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move p1, p4

    goto :goto_1

    :cond_1
    :goto_0
    move p1, p6

    :goto_1
    iput-boolean p1, p0, Lp1/q;->C:Z

    new-instance p1, Lp1/p;

    const/4 p7, 0x0

    invoke-direct {p1, p0, p7}, Lp1/p;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lp1/q;->D:Lp1/p;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lp1/q;->E:Ljava/util/ArrayList;

    invoke-virtual {p3}, Lp1/f2;->d()Lp1/e2;

    move-result-object p1

    invoke-virtual {p1}, Lp1/e2;->c()V

    iput-object p1, p0, Lp1/q;->G:Lp1/e2;

    new-instance p1, Lp1/f2;

    invoke-direct {p1}, Lp1/f2;-><init>()V

    invoke-virtual {p2}, Lp1/t;->f()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p1}, Lp1/f2;->c()V

    :cond_2
    invoke-virtual {p2}, Lp1/t;->d()Z

    move-result p3

    if-eqz p3, :cond_3

    new-instance p3, La0/g0;

    invoke-direct {p3}, La0/g0;-><init>()V

    iput-object p3, p1, Lp1/f2;->K:La0/g0;

    :cond_3
    iput-object p1, p0, Lp1/q;->H:Lp1/f2;

    invoke-virtual {p1}, Lp1/f2;->e()Lp1/i2;

    move-result-object p1

    invoke-virtual {p1, p6}, Lp1/i2;->e(Z)V

    iput-object p1, p0, Lp1/q;->I:Lp1/i2;

    new-instance p1, Lq1/b;

    invoke-direct {p1, p0, p5}, Lq1/b;-><init>(Lp1/q;Lq1/a;)V

    iput-object p1, p0, Lp1/q;->M:Lq1/b;

    iget-object p1, p0, Lp1/q;->H:Lp1/f2;

    invoke-virtual {p1}, Lp1/f2;->d()Lp1/e2;

    move-result-object p1

    :try_start_0
    invoke-virtual {p1, p4}, Lp1/e2;->a(I)Lp1/a;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Lp1/e2;->c()V

    iput-object p3, p0, Lp1/q;->N:Lp1/a;

    new-instance p1, Lq1/c;

    invoke-direct {p1}, Lq1/c;-><init>()V

    iput-object p1, p0, Lp1/q;->O:Lq1/c;

    new-instance p1, La2/c;

    invoke-direct {p1, p0}, La2/c;-><init>(Lp1/q;)V

    iput-object p1, p0, Lp1/q;->Q:La2/c;

    invoke-virtual {p2}, Lp1/t;->j()Lq83/j;

    move-result-object p1

    invoke-virtual {p0}, Lp1/q;->D()La2/c;

    move-result-object p2

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    sget-object p2, Lq83/k;->w:Lq83/k;

    :goto_2
    invoke-interface {p1, p2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    iput-object p1, p0, Lp1/q;->R:Lq83/j;

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Lp1/e2;->c()V

    throw p2
.end method

.method public static final T(Lp1/q;IZI)I
    .locals 9

    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v0, p1}, Lp1/e2;->j(I)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_6

    invoke-virtual {v0, p1}, Lp1/e2;->i(I)I

    move-result p2

    iget-object p3, v0, Lp1/e2;->b:[I

    invoke-virtual {v0, p3, p1}, Lp1/e2;->p([II)Ljava/lang/Object;

    move-result-object p3

    const/16 v1, 0xce

    if-ne p2, v1, :cond_4

    sget-object p2, Lp1/r;->e:Lp1/e1;

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {v0, p1, v2}, Lp1/e2;->h(II)Ljava/lang/Object;

    move-result-object p2

    instance-of p3, p2, Lp1/n;

    if-eqz p3, :cond_0

    check-cast p2, Lp1/n;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_3

    iget-object p2, p2, Lp1/n;->w:Lp1/o;

    iget-object p2, p2, Lp1/o;->e:Ljava/util/LinkedHashSet;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lp1/q;

    iget-object v1, p3, Lp1/q;->c:Lp1/f2;

    iget v4, v1, Lp1/f2;->x:I

    if-lez v4, :cond_2

    iget-object v1, v1, Lp1/f2;->w:[I

    aget v1, v1, v3

    const/high16 v4, 0x4000000

    and-int/2addr v1, v4

    if-eqz v1, :cond_2

    iget-object v1, p3, Lp1/q;->h:Lp1/w;

    iget-object v4, v1, Lp1/w;->z:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    invoke-virtual {v1}, Lp1/w;->o()V

    iget-object v5, v1, Lp1/w;->N:La0/v0;

    invoke-static {}, Ldt/b;->i()La0/v0;

    move-result-object v6

    iput-object v6, v1, Lp1/w;->N:La0/v0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    iget-object v6, v1, Lp1/w;->V:Lp1/q;

    invoke-virtual {v6, v5}, Lp1/q;->l0(La0/v0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    monitor-exit v4

    new-instance v1, Lq1/a;

    invoke-direct {v1}, Lq1/a;-><init>()V

    iput-object v1, p3, Lp1/q;->L:Lq1/a;

    iget-object v4, p3, Lp1/q;->c:Lp1/f2;

    invoke-virtual {v4}, Lp1/f2;->d()Lp1/e2;

    move-result-object v4

    :try_start_2
    iput-object v4, p3, Lp1/q;->G:Lp1/e2;

    iget-object v5, p3, Lp1/q;->M:Lq1/b;

    iget-object v6, v5, Lq1/b;->b:Lq1/a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iput-object v1, v5, Lq1/b;->b:Lq1/a;

    invoke-virtual {p3, v2}, Lp1/q;->S(I)V

    iget-object v1, p3, Lp1/q;->M:Lq1/b;

    invoke-virtual {v1}, Lq1/b;->b()V

    iget-boolean v7, v1, Lq1/b;->c:Z

    if-eqz v7, :cond_1

    iget-object v7, v1, Lq1/b;->b:Lq1/a;

    iget-object v7, v7, Lq1/a;->a:Lq1/l0;

    sget-object v8, Lq1/c0;->d:Lq1/c0;

    invoke-virtual {v7, v8}, Lq1/l0;->g0(Lq1/j0;)V

    iget-boolean v7, v1, Lq1/b;->c:Z

    if-eqz v7, :cond_1

    invoke-virtual {v1, v2}, Lq1/b;->d(Z)V

    invoke-virtual {v1, v2}, Lq1/b;->d(Z)V

    iget-object v7, v1, Lq1/b;->b:Lq1/a;

    iget-object v7, v7, Lq1/a;->a:Lq1/l0;

    sget-object v8, Lq1/m;->d:Lq1/m;

    invoke-virtual {v7, v8}, Lq1/l0;->g0(Lq1/j0;)V

    iput-boolean v2, v1, Lq1/b;->c:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_1
    :try_start_4
    iput-object v6, v5, Lq1/b;->b:Lq1/a;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual {v4}, Lp1/e2;->c()V

    goto :goto_3

    :catchall_0
    move-exception p0

    goto :goto_2

    :catchall_1
    move-exception p0

    :try_start_5
    iput-object v6, v5, Lq1/b;->b:Lq1/a;

    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_2
    invoke-virtual {v4}, Lp1/e2;->c()V

    throw p0

    :catchall_2
    move-exception p0

    :try_start_6
    iput-object v5, v1, Lp1/w;->N:La0/v0;

    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception p0

    monitor-exit v4

    throw p0

    :cond_2
    :goto_3
    iget-object v1, p0, Lp1/q;->b:Lp1/t;

    iget-object p3, p3, Lp1/q;->h:Lp1/w;

    invoke-virtual {v1, p3}, Lp1/t;->q(Lp1/w;)V

    goto/16 :goto_1

    :cond_3
    invoke-virtual {v0, p1}, Lp1/e2;->o(I)I

    move-result p0

    return p0

    :cond_4
    invoke-virtual {v0, p1}, Lp1/e2;->l(I)Z

    move-result p0

    if-eqz p0, :cond_5

    goto/16 :goto_8

    :cond_5
    invoke-virtual {v0, p1}, Lp1/e2;->o(I)I

    move-result p0

    return p0

    :cond_6
    invoke-virtual {v0, p1}, Lp1/e2;->d(I)Z

    move-result v1

    if-eqz v1, :cond_e

    iget-object v1, v0, Lp1/e2;->b:[I

    mul-int/lit8 v4, p1, 0x5

    add-int/lit8 v4, v4, 0x3

    aget v1, v1, v4

    add-int/2addr v1, p1

    add-int/lit8 v4, p1, 0x1

    move v5, v2

    :goto_4
    if-ge v4, v1, :cond_c

    invoke-virtual {v0, v4}, Lp1/e2;->l(I)Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v7, p0, Lp1/q;->M:Lq1/b;

    invoke-virtual {v7}, Lq1/b;->c()V

    iget-object v7, p0, Lp1/q;->M:Lq1/b;

    invoke-virtual {v0, v4}, Lp1/e2;->n(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7}, Lq1/b;->c()V

    iget-object v7, v7, Lq1/b;->h:Ljava/util/ArrayList;

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    if-nez v6, :cond_9

    if-eqz p2, :cond_8

    goto :goto_5

    :cond_8
    move v7, v2

    goto :goto_6

    :cond_9
    :goto_5
    move v7, v3

    :goto_6
    if-eqz v6, :cond_a

    move v8, v2

    goto :goto_7

    :cond_a
    add-int v8, p3, v5

    :goto_7
    invoke-static {p0, v4, v7, v8}, Lp1/q;->T(Lp1/q;IZI)I

    move-result v7

    add-int/2addr v5, v7

    if-eqz v6, :cond_b

    iget-object v6, p0, Lp1/q;->M:Lq1/b;

    invoke-virtual {v6}, Lq1/b;->c()V

    iget-object v6, p0, Lp1/q;->M:Lq1/b;

    invoke-virtual {v6}, Lq1/b;->a()V

    :cond_b
    iget-object v6, v0, Lp1/e2;->b:[I

    mul-int/lit8 v7, v4, 0x5

    add-int/lit8 v7, v7, 0x3

    aget v6, v6, v7

    add-int/2addr v4, v6

    goto :goto_4

    :cond_c
    invoke-virtual {v0, p1}, Lp1/e2;->l(I)Z

    move-result p0

    if-eqz p0, :cond_d

    goto :goto_8

    :cond_d
    return v5

    :cond_e
    invoke-virtual {v0, p1}, Lp1/e2;->l(I)Z

    move-result p0

    if-eqz p0, :cond_f

    :goto_8
    return v3

    :cond_f
    invoke-virtual {v0, p1}, Lp1/e2;->o(I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final A()Lp1/p1;
    .locals 1

    invoke-virtual {p0}, Lp1/q;->m()Lp1/p1;

    move-result-object v0

    return-object v0
.end method

.method public final B()Lp1/v1;
    .locals 2

    iget v0, p0, Lp1/q;->A:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lp1/q;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lm4/a;->d(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp1/v1;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final C()Z
    .locals 1

    invoke-virtual {p0}, Lp1/q;->F()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lp1/q;->w:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lp1/q;->B()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v0, v0, Lp1/v1;->b:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final D()La2/c;
    .locals 1

    iget-boolean v0, p0, Lp1/q;->C:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp1/q;->Q:La2/c;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final E()Z
    .locals 1

    iget-boolean v0, p0, Lp1/q;->S:Z

    return v0
.end method

.method public final F()Z
    .locals 1

    iget-boolean v0, p0, Lp1/q;->S:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lp1/q;->y:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lp1/q;->w:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lp1/q;->B()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v0, v0, Lp1/v1;->b:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final G(Ljava/util/ArrayList;)V
    .locals 16

    move-object/from16 v1, p0

    iget-object v0, v1, Lp1/q;->f:Lq1/a;

    iget-object v7, v1, Lp1/q;->M:Lq1/b;

    iget-object v8, v7, Lq1/b;->b:Lq1/a;

    :try_start_0
    iput-object v0, v7, Lq1/b;->b:Lq1/a;

    iget-object v0, v0, Lq1/a;->a:Lq1/l0;

    sget-object v2, Lq1/a0;->d:Lq1/a0;

    invoke-virtual {v0, v2}, Lq1/l0;->g0(Lq1/j0;)V

    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v9, 0x0

    move v10, v9

    :goto_0
    if-ge v10, v0, :cond_3

    move-object/from16 v11, p1

    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll83/k;

    iget-object v3, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Lp1/y0;

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v2, Lp1/y0;

    invoke-virtual {v3}, Lp1/y0;->a()Lp1/a;

    move-result-object v2

    invoke-virtual {v3}, Lp1/y0;->d()Lp1/f2;

    move-result-object v4

    invoke-virtual {v4, v2}, Lp1/f2;->a(Lp1/a;)I

    move-result v4

    new-instance v12, Lx1/d;

    invoke-direct {v12}, Lx1/d;-><init>()V

    invoke-virtual {v7}, Lq1/b;->b()V

    iget-object v5, v7, Lq1/b;->b:Lq1/a;

    iget-object v5, v5, Lq1/a;->a:Lq1/l0;

    sget-object v6, Lq1/j;->d:Lq1/j;

    invoke-virtual {v5, v6}, Lq1/l0;->g0(Lq1/j0;)V

    const/4 v13, 0x1

    invoke-static {v5, v9, v12, v13, v2}, Landroidx/room/c1;->P(Lq1/l0;ILjava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v3}, Lp1/y0;->d()Lp1/f2;

    move-result-object v2

    iget-object v5, v1, Lp1/q;->H:Lp1/f2;

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v1, Lp1/q;->I:Lp1/i2;

    iget-boolean v2, v2, Lp1/i2;->w:Z

    if-nez v2, :cond_0

    const-string v2, "Check failed"

    invoke-static {v2}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v1}, Lp1/q;->z()V

    :cond_1
    invoke-virtual {v3}, Lp1/y0;->d()Lp1/f2;

    move-result-object v2

    invoke-virtual {v2}, Lp1/f2;->d()Lp1/e2;

    move-result-object v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v14, v4}, Lp1/e2;->r(I)V

    iput v4, v7, Lq1/b;->f:I

    new-instance v15, Lq1/a;

    invoke-direct {v15}, Lq1/a;-><init>()V

    new-instance v6, Ln0/j;

    invoke-direct {v6, v1, v15, v14, v3}, Ln0/j;-><init>(Lp1/q;Lq1/a;Lp1/e2;Lp1/y0;)V

    sget-object v5, Lm83/y;->w:Lm83/y;

    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v1 .. v6}, Lp1/q;->M(Lp1/w;Lp1/w;Ljava/lang/Integer;Ljava/util/List;Lc93/a;)Ljava/lang/Object;

    iget-object v1, v7, Lq1/b;->b:Lq1/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v15, Lq1/a;->a:Lq1/l0;

    invoke-virtual {v2}, Lq1/l0;->f0()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v1, v1, Lq1/a;->a:Lq1/l0;

    sget-object v2, Lq1/f;->d:Lq1/f;

    invoke-virtual {v1, v2}, Lq1/l0;->g0(Lq1/j0;)V

    invoke-static {v1, v9, v15, v13, v12}, Landroidx/room/c1;->P(Lq1/l0;ILjava/lang/Object;ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_2
    :try_start_2
    invoke-virtual {v14}, Lp1/e2;->c()V

    iget-object v1, v7, Lq1/b;->b:Lq1/a;

    iget-object v1, v1, Lq1/a;->a:Lq1/l0;

    sget-object v2, Lq1/c0;->d:Lq1/c0;

    invoke-virtual {v1, v2}, Lq1/l0;->g0(Lq1/j0;)V

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, p0

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {v14}, Lp1/e2;->c()V

    throw v0

    :cond_3
    iget-object v0, v7, Lq1/b;->b:Lq1/a;

    iget-object v0, v0, Lq1/a;->a:Lq1/l0;

    sget-object v1, Lq1/n;->d:Lq1/n;

    invoke-virtual {v0, v1}, Lq1/l0;->g0(Lq1/j0;)V

    iput v9, v7, Lq1/b;->f:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iput-object v8, v7, Lq1/b;->b:Lq1/a;

    return-void

    :goto_1
    iput-object v8, v7, Lq1/b;->b:Lq1/a;

    throw v0
.end method

.method public final H(Lp1/p1;Ljava/lang/Object;)V
    .locals 8

    const v0, 0x78cc281

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lp1/q;->b0(ILjava/lang/Object;)V

    invoke-virtual {p0}, Lp1/q;->J()Ljava/lang/Object;

    invoke-virtual {p0, p2}, Lp1/q;->q0(Ljava/lang/Object;)V

    iget-wide v2, p0, Lp1/q;->T:J

    int-to-long v4, v0

    const/4 v0, 0x0

    :try_start_0
    iput-wide v4, p0, Lp1/q;->T:J

    iget-boolean v4, p0, Lp1/q;->S:Z

    if-eqz v4, :cond_0

    iget-object v4, p0, Lp1/q;->I:Lp1/i2;

    invoke-static {v4}, Lp1/i2;->y(Lp1/i2;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    iget-boolean v4, p0, Lp1/q;->S:Z

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    :cond_1
    move v4, v0

    goto :goto_1

    :cond_2
    iget-object v4, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v4}, Lp1/e2;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    move v4, v5

    :goto_1
    if-eqz v4, :cond_3

    invoke-virtual {p0, p1}, Lp1/q;->P(Lp1/p1;)V

    :cond_3
    sget-object v6, Lp1/r;->c:Lp1/e1;

    const/16 v7, 0xca

    invoke-virtual {p0, v6, v7, p1, v0}, Lp1/q;->Y(Ljava/lang/Object;ILjava/lang/Object;I)V

    iput-object v1, p0, Lp1/q;->K:Lp1/p1;

    iget-boolean p1, p0, Lp1/q;->w:Z

    iput-boolean v4, p0, Lp1/q;->w:Z

    new-instance v4, Lay/n;

    const/16 v6, 0x8

    invoke-direct {v4, p2, v6}, Lay/n;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const v6, 0x12d6006f

    invoke-direct {p2, v4, v5, v6}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p2}, Lx1/c;->d(Lp1/q;Lc93/m;)V

    iput-boolean p1, p0, Lp1/q;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    iput-object v1, p0, Lp1/q;->K:Lp1/p1;

    iput-wide v2, p0, Lp1/q;->T:J

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    return-void

    :goto_2
    :try_start_1
    new-instance p2, Lp1/m;

    invoke-direct {p2, p0}, Lp1/m;-><init>(Lp1/q;)V

    invoke-static {p1, p2}, Ldt/b;->Y(Ljava/lang/Throwable;Lc93/a;)Z

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p1

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    iput-object v1, p0, Lp1/q;->K:Lp1/p1;

    iput-wide v2, p0, Lp1/q;->T:J

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    throw p1
.end method

.method public final I(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    iget v1, v0, Lp1/e2;->g:I

    iget v2, v0, Lp1/e2;->h:I

    if-ge v1, v2, :cond_0

    iget-object v2, v0, Lp1/e2;->b:[I

    invoke-virtual {v0, v2, v1}, Lp1/e2;->p([II)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0, p1, p2}, Lp1/r;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lp1/q0;

    invoke-direct {v0, p1, p2}, Lp1/q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-object v0
.end method

.method public final J()Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, Lp1/q;->S:Z

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lp1/q;->r:Z

    if-eqz v0, :cond_1

    const-string v0, "A call to createNode(), emitNode() or useNode() expected"

    invoke-static {v0}, Lp1/r;->c(Ljava/lang/String;)V

    return-object v1

    :cond_0
    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v0}, Lp1/e2;->m()Ljava/lang/Object;

    move-result-object v0

    iget-boolean v2, p0, Lp1/q;->y:Z

    if-eqz v2, :cond_2

    instance-of v2, v0, Lp1/n;

    if-nez v2, :cond_2

    :cond_1
    return-object v1

    :cond_2
    return-object v0
.end method

.method public final K()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lp1/q;->b:Lp1/t;

    invoke-virtual {v0}, Lp1/t;->h()Lp1/s;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Lp1/w;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, v1, Lp1/w;->F:Lp1/f2;

    invoke-static {v1, v0}, Lce/w;->I(Lp1/f2;Lp1/t;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Lp1/f2;->d()Lp1/e2;

    move-result-object v1

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lce/w;->j0(Lp1/e2;ILjava/lang/Integer;)Ljava/util/ArrayList;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lp1/e2;->c()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lp1/e2;->c()V

    throw v0

    :cond_2
    :goto_1
    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method

.method public final L(I)I
    .locals 3

    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v0, p1}, Lp1/e2;->q(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    :goto_0
    if-ge v0, p1, :cond_1

    iget-object v2, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v2, v0}, Lp1/e2;->k(I)Z

    move-result v2

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    :cond_0
    iget-object v2, p0, Lp1/q;->G:Lp1/e2;

    iget-object v2, v2, Lp1/e2;->b:[I

    invoke-static {v2, v0}, Lp1/h2;->a([II)I

    move-result v2

    add-int/2addr v0, v2

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final M(Lp1/w;Lp1/w;Ljava/lang/Integer;Ljava/util/List;Lc93/a;)Ljava/lang/Object;
    .locals 8

    iget-boolean v0, p0, Lp1/q;->F:Z

    iget v1, p0, Lp1/q;->k:I

    const/4 v2, 0x1

    :try_start_0
    iput-boolean v2, p0, Lp1/q;->F:Z

    const/4 v2, 0x0

    iput v2, p0, Lp1/q;->k:I

    move-object v3, p4

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    move v4, v2

    :goto_0
    const/4 v5, 0x0

    if-ge v4, v3, :cond_1

    invoke-interface {p4, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll83/k;

    iget-object v7, v6, Ll83/k;->w:Ljava/lang/Object;

    check-cast v7, Lp1/v1;

    iget-object v6, v6, Ll83/k;->x:Ljava/lang/Object;

    if-eqz v6, :cond_0

    invoke-virtual {p0, v7, v6}, Lp1/q;->k0(Lp1/v1;Ljava/lang/Object;)Z

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_0
    invoke-virtual {p0, v7, v5}, Lp1/q;->k0(Lp1/v1;Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_4

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    goto :goto_2

    :cond_2
    const/4 p3, -0x1

    :goto_2
    if-eqz p2, :cond_3

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_3

    if-ltz p3, :cond_3

    iput-object p2, p1, Lp1/w;->R:Lp1/w;

    iput p3, p1, Lp1/w;->S:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {p5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iput-object v5, p1, Lp1/w;->R:Lp1/w;

    iput v2, p1, Lp1/w;->S:I

    goto :goto_3

    :catchall_1
    move-exception p2

    iput-object v5, p1, Lp1/w;->R:Lp1/w;

    iput v2, p1, Lp1/w;->S:I

    throw p2

    :cond_3
    invoke-interface {p5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    :goto_3
    if-nez p2, :cond_5

    :cond_4
    invoke-interface {p5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_5
    iput-boolean v0, p0, Lp1/q;->F:Z

    iput v1, p0, Lp1/q;->k:I

    return-object p2

    :goto_4
    iput-boolean v0, p0, Lp1/q;->F:Z

    iput v1, p0, Lp1/q;->k:I

    throw p1
.end method

.method public final N()V
    .locals 39

    move-object/from16 v1, p0

    iget-boolean v0, v1, Lp1/q;->F:Z

    const/4 v2, 0x1

    iput-boolean v2, v1, Lp1/q;->F:Z

    iget-object v3, v1, Lp1/q;->G:Lp1/e2;

    iget v4, v3, Lp1/e2;->i:I

    iget-object v5, v3, Lp1/e2;->b:[I

    mul-int/lit8 v6, v4, 0x5

    const/4 v7, 0x3

    add-int/2addr v6, v7

    aget v5, v5, v6

    add-int/2addr v5, v4

    iget v8, v1, Lp1/q;->k:I

    iget-wide v9, v1, Lp1/q;->T:J

    iget v11, v1, Lp1/q;->l:I

    iget v12, v1, Lp1/q;->m:I

    iget v3, v3, Lp1/e2;->g:I

    iget-object v13, v1, Lp1/q;->s:Ljava/util/ArrayList;

    invoke-static {v3, v13}, Lp1/r;->e(ILjava/util/List;)I

    move-result v3

    if-gez v3, :cond_0

    add-int/lit8 v3, v3, 0x1

    neg-int v3, v3

    :cond_0
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v14

    if-ge v3, v14, :cond_1

    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp1/o0;

    iget v14, v3, Lp1/o0;->b:I

    if-ge v14, v5, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    move/from16 v17, v7

    const/16 v16, 0x0

    move v7, v4

    :goto_1
    if-eqz v3, :cond_29

    move/from16 v18, v2

    iget-object v2, v3, Lp1/o0;->a:Lp1/v1;

    iget v15, v3, Lp1/o0;->b:I

    invoke-static {v15, v13}, Lp1/r;->e(ILjava/util/List;)I

    move-result v14

    if-ltz v14, :cond_2

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lp1/o0;

    :cond_2
    iget-object v3, v3, Lp1/o0;->c:Ljava/lang/Object;

    const-wide/16 v19, 0x80

    const-wide/16 v21, 0xff

    const/16 v23, 0x7

    const-wide v24, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    if-nez v3, :cond_5

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v27, v6

    :cond_3
    :goto_2
    move/from16 v32, v8

    move-wide/from16 v33, v9

    move/from16 v30, v11

    move/from16 v31, v12

    :cond_4
    :goto_3
    move/from16 v3, v18

    goto/16 :goto_6

    :cond_5
    const/16 v26, 0x8

    iget-object v14, v2, Lp1/v1;->g:La0/v0;

    if-nez v14, :cond_6

    move/from16 v27, v6

    goto :goto_2

    :cond_6
    move/from16 v27, v6

    instance-of v6, v3, Lp1/f0;

    if-eqz v6, :cond_7

    check-cast v3, Lp1/f0;

    invoke-static {v3, v14}, Lp1/v1;->a(Lp1/f0;La0/v0;)Z

    move-result v3

    move/from16 v32, v8

    move-wide/from16 v33, v9

    move/from16 v30, v11

    move/from16 v31, v12

    goto/16 :goto_6

    :cond_7
    instance-of v6, v3, La0/w0;

    if-eqz v6, :cond_3

    check-cast v3, La0/w0;

    invoke-virtual {v3}, La0/w0;->h()Z

    move-result v6

    if-eqz v6, :cond_c

    iget-object v6, v3, La0/w0;->b:[Ljava/lang/Object;

    iget-object v3, v3, La0/w0;->a:[J

    move-object/from16 v28, v6

    array-length v6, v3

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_c

    move-object/from16 v29, v3

    move/from16 v30, v11

    move/from16 v31, v12

    const/4 v3, 0x0

    :goto_4
    aget-wide v11, v29, v3

    move/from16 v32, v8

    move-wide/from16 v33, v9

    not-long v8, v11

    shl-long v8, v8, v23

    and-long/2addr v8, v11

    and-long v8, v8, v24

    cmp-long v8, v8, v24

    if-eqz v8, :cond_b

    sub-int v8, v3, v6

    not-int v8, v8

    ushr-int/lit8 v8, v8, 0x1f

    rsub-int/lit8 v8, v8, 0x8

    const/4 v9, 0x0

    :goto_5
    if-ge v9, v8, :cond_a

    and-long v35, v11, v21

    cmp-long v10, v35, v19

    if-gez v10, :cond_8

    shl-int/lit8 v10, v3, 0x3

    add-int/2addr v10, v9

    aget-object v10, v28, v10

    move/from16 v35, v9

    instance-of v9, v10, Lp1/f0;

    if-eqz v9, :cond_4

    check-cast v10, Lp1/f0;

    invoke-static {v10, v14}, Lp1/v1;->a(Lp1/f0;La0/v0;)Z

    move-result v9

    if-eqz v9, :cond_9

    goto :goto_3

    :cond_8
    move/from16 v35, v9

    :cond_9
    shr-long v11, v11, v26

    add-int/lit8 v9, v35, 0x1

    goto :goto_5

    :cond_a
    move/from16 v9, v26

    if-ne v8, v9, :cond_d

    :cond_b
    if-eq v3, v6, :cond_d

    add-int/lit8 v3, v3, 0x1

    move/from16 v8, v32

    move-wide/from16 v9, v33

    const/16 v26, 0x8

    goto :goto_4

    :cond_c
    move/from16 v32, v8

    move-wide/from16 v33, v9

    move/from16 v30, v11

    move/from16 v31, v12

    :cond_d
    const/4 v3, 0x0

    :goto_6
    if-eqz v3, :cond_20

    iget-object v3, v1, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v3, v15}, Lp1/e2;->r(I)V

    iget-object v3, v1, Lp1/q;->G:Lp1/e2;

    iget v3, v3, Lp1/e2;->g:I

    invoke-virtual {v1, v7, v3, v4}, Lp1/q;->Q(III)V

    iget-object v6, v1, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v6, v3}, Lp1/e2;->q(I)I

    move-result v6

    :goto_7
    if-eq v6, v4, :cond_e

    iget-object v7, v1, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v7, v6}, Lp1/e2;->l(I)Z

    move-result v7

    if-nez v7, :cond_e

    iget-object v7, v1, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v7, v6}, Lp1/e2;->q(I)I

    move-result v6

    goto :goto_7

    :cond_e
    iget-object v7, v1, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v7, v6}, Lp1/e2;->l(I)Z

    move-result v7

    if-eqz v7, :cond_f

    const/4 v7, 0x0

    goto :goto_8

    :cond_f
    move/from16 v7, v32

    :goto_8
    if-ne v6, v3, :cond_10

    goto :goto_b

    :cond_10
    invoke-virtual {v1, v6}, Lp1/q;->r0(I)I

    move-result v8

    iget-object v9, v1, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v9, v3}, Lp1/e2;->o(I)I

    move-result v9

    sub-int/2addr v8, v9

    add-int/2addr v8, v7

    :cond_11
    if-ge v7, v8, :cond_13

    if-eq v6, v15, :cond_13

    add-int/lit8 v6, v6, 0x1

    :goto_9
    if-ge v6, v15, :cond_13

    iget-object v9, v1, Lp1/q;->G:Lp1/e2;

    iget-object v10, v9, Lp1/e2;->b:[I

    mul-int/lit8 v11, v6, 0x5

    add-int/lit8 v11, v11, 0x3

    aget v10, v10, v11

    add-int/2addr v10, v6

    if-lt v15, v10, :cond_11

    invoke-virtual {v9, v6}, Lp1/e2;->l(I)Z

    move-result v9

    if-eqz v9, :cond_12

    move/from16 v6, v18

    goto :goto_a

    :cond_12
    invoke-virtual {v1, v6}, Lp1/q;->r0(I)I

    move-result v6

    :goto_a
    add-int/2addr v7, v6

    move v6, v10

    goto :goto_9

    :cond_13
    :goto_b
    iput v7, v1, Lp1/q;->k:I

    invoke-virtual {v1, v3}, Lp1/q;->L(I)I

    move-result v6

    iput v6, v1, Lp1/q;->m:I

    iget-object v6, v1, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v6, v3}, Lp1/e2;->q(I)I

    move-result v6

    const/4 v7, 0x0

    int-to-long v8, v7

    move/from16 v10, v17

    const/4 v7, 0x0

    :goto_c
    if-ltz v6, :cond_1c

    if-ne v6, v4, :cond_14

    move-wide/from16 v11, v33

    invoke-static {v11, v12, v7}, Ljava/lang/Long;->rotateLeft(JI)J

    move-result-wide v6

    xor-long/2addr v8, v6

    move/from16 v16, v3

    goto/16 :goto_11

    :cond_14
    move-wide/from16 v11, v33

    iget-object v14, v1, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v14, v6}, Lp1/e2;->k(I)Z

    move-result v15

    move/from16 v16, v3

    iget-object v3, v14, Lp1/e2;->b:[I

    if-eqz v15, :cond_17

    invoke-virtual {v14, v3, v6}, Lp1/e2;->p([II)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_16

    instance-of v14, v3, Ljava/lang/Enum;

    if-eqz v14, :cond_15

    check-cast v3, Ljava/lang/Enum;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    :goto_d
    move-wide/from16 v19, v8

    goto :goto_f

    :cond_15
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_d

    :cond_16
    move-wide/from16 v19, v8

    const/4 v3, 0x0

    goto :goto_f

    :cond_17
    invoke-virtual {v14, v6}, Lp1/e2;->i(I)I

    move-result v15

    move-wide/from16 v19, v8

    const/16 v8, 0xcf

    if-ne v15, v8, :cond_19

    invoke-virtual {v14, v3, v6}, Lp1/e2;->b([II)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_19

    sget-object v8, Lp1/l;->a:Lp1/v0;

    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_18

    goto :goto_e

    :cond_18
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_f

    :cond_19
    :goto_e
    move v3, v15

    :goto_f
    const v8, 0x78cc281

    if-ne v3, v8, :cond_1a

    int-to-long v8, v3

    invoke-static {v8, v9, v7}, Ljava/lang/Long;->rotateLeft(JI)J

    move-result-wide v6

    xor-long v8, v19, v6

    goto :goto_11

    :cond_1a
    iget-object v8, v1, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v8, v6}, Lp1/e2;->k(I)Z

    move-result v8

    if-eqz v8, :cond_1b

    const/4 v8, 0x0

    goto :goto_10

    :cond_1b
    invoke-virtual {v1, v6}, Lp1/q;->L(I)I

    move-result v8

    :goto_10
    int-to-long v14, v3

    invoke-static {v14, v15, v10}, Ljava/lang/Long;->rotateLeft(JI)J

    move-result-wide v14

    xor-long v14, v19, v14

    int-to-long v8, v8

    invoke-static {v8, v9, v7}, Ljava/lang/Long;->rotateLeft(JI)J

    move-result-wide v8

    xor-long/2addr v8, v14

    add-int/lit8 v10, v10, 0x6

    rem-int/lit8 v10, v10, 0x40

    add-int/lit8 v7, v7, 0x6

    rem-int/lit8 v7, v7, 0x40

    iget-object v3, v1, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v3, v6}, Lp1/e2;->q(I)I

    move-result v6

    move-wide/from16 v33, v11

    move/from16 v3, v16

    goto/16 :goto_c

    :cond_1c
    move/from16 v16, v3

    move-wide/from16 v19, v8

    move-wide/from16 v11, v33

    :goto_11
    iput-wide v8, v1, Lp1/q;->T:J

    const/4 v3, 0x0

    iput-object v3, v1, Lp1/q;->K:Lp1/p1;

    iget-object v2, v2, Lp1/v1;->d:Lc93/m;

    if-eqz v2, :cond_1f

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v2, v1, v6}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v3, v1, Lp1/q;->K:Lp1/p1;

    iget-object v2, v1, Lp1/q;->G:Lp1/e2;

    iget-object v6, v2, Lp1/e2;->b:[I

    aget v6, v6, v27

    add-int/2addr v6, v4

    iget v7, v2, Lp1/e2;->g:I

    if-lt v7, v4, :cond_1d

    if-gt v7, v6, :cond_1d

    move/from16 v8, v18

    goto :goto_12

    :cond_1d
    const/4 v8, 0x0

    :goto_12
    if-nez v8, :cond_1e

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Index "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, " is not a parent of "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_1e
    iput v4, v2, Lp1/e2;->i:I

    iput v6, v2, Lp1/e2;->h:I

    const/4 v7, 0x0

    iput v7, v2, Lp1/e2;->l:I

    iput v7, v2, Lp1/e2;->m:I

    move v3, v7

    move-wide/from16 v33, v11

    move/from16 v7, v16

    move/from16 v16, v18

    goto/16 :goto_1b

    :cond_1f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Invalid restart scope"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_20
    move-wide/from16 v11, v33

    const/4 v3, 0x0

    iget-object v6, v1, Lp1/q;->E:Ljava/util/ArrayList;

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v8, v1, Lp1/q;->g:Lbu/c;

    invoke-virtual {v8}, Lbu/c;->A()V

    iget-object v8, v2, Lp1/v1;->a:Lp1/w;

    if-eqz v8, :cond_26

    iget-object v9, v2, Lp1/v1;->f:La0/m0;

    if-eqz v9, :cond_26

    move/from16 v10, v18

    invoke-virtual {v2, v10}, Lp1/v1;->e(Z)V

    :try_start_0
    iget-object v10, v9, La0/m0;->b:[Ljava/lang/Object;

    iget-object v14, v9, La0/m0;->c:[I

    iget-object v9, v9, La0/m0;->a:[J

    array-length v15, v9

    add-int/lit8 v15, v15, -0x2

    if-ltz v15, :cond_25

    move-object/from16 v29, v9

    move-object/from16 v28, v10

    const/4 v3, 0x0

    :goto_13
    aget-wide v9, v29, v3

    move-wide/from16 v33, v11

    not-long v11, v9

    shl-long v11, v11, v23

    and-long/2addr v11, v9

    and-long v11, v11, v24

    cmp-long v11, v11, v24

    if-eqz v11, :cond_24

    sub-int v11, v3, v15

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v26, 0x8

    rsub-int/lit8 v11, v11, 0x8

    move-wide/from16 v35, v9

    const/4 v9, 0x0

    :goto_14
    if-ge v9, v11, :cond_22

    and-long v37, v35, v21

    cmp-long v10, v37, v19

    if-gez v10, :cond_21

    shl-int/lit8 v10, v3, 0x3

    add-int/2addr v10, v9

    aget-object v12, v28, v10

    aget v10, v14, v10

    invoke-virtual {v8, v12}, Lp1/w;->y(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_21
    const/16 v10, 0x8

    goto :goto_15

    :catchall_0
    move-exception v0

    const/4 v3, 0x0

    goto :goto_19

    :goto_15
    shr-long v35, v35, v10

    add-int/lit8 v9, v9, 0x1

    goto :goto_14

    :cond_22
    const/16 v10, 0x8

    if-ne v11, v10, :cond_23

    goto :goto_17

    :cond_23
    :goto_16
    const/4 v3, 0x0

    goto :goto_18

    :cond_24
    const/16 v10, 0x8

    :goto_17
    if-eq v3, v15, :cond_23

    add-int/lit8 v3, v3, 0x1

    move-wide/from16 v11, v33

    goto :goto_13

    :cond_25
    move-wide/from16 v33, v11

    goto :goto_16

    :goto_18
    invoke-virtual {v2, v3}, Lp1/v1;->e(Z)V

    goto :goto_1a

    :goto_19
    invoke-virtual {v2, v3}, Lp1/v1;->e(Z)V

    throw v0

    :cond_26
    move-wide/from16 v33, v11

    const/4 v3, 0x0

    :goto_1a
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v18, 0x1

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :goto_1b
    iget-object v2, v1, Lp1/q;->G:Lp1/e2;

    iget v2, v2, Lp1/e2;->g:I

    invoke-static {v2, v13}, Lp1/r;->e(ILjava/util/List;)I

    move-result v2

    if-gez v2, :cond_27

    add-int/lit8 v2, v2, 0x1

    neg-int v2, v2

    :cond_27
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v2, v6, :cond_28

    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp1/o0;

    iget v6, v2, Lp1/o0;->b:I

    if-ge v6, v5, :cond_28

    goto :goto_1c

    :cond_28
    const/4 v2, 0x0

    :goto_1c
    move-object v3, v2

    move/from16 v2, v18

    move/from16 v6, v27

    move/from16 v11, v30

    move/from16 v12, v31

    move/from16 v8, v32

    move-wide/from16 v9, v33

    goto/16 :goto_1

    :cond_29
    move/from16 v32, v8

    move-wide/from16 v33, v9

    move/from16 v30, v11

    move/from16 v31, v12

    if-eqz v16, :cond_2a

    invoke-virtual {v1, v7, v4, v4}, Lp1/q;->Q(III)V

    iget-object v2, v1, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v2}, Lp1/e2;->t()V

    invoke-virtual {v1, v4}, Lp1/q;->r0(I)I

    move-result v2

    add-int v8, v32, v2

    iput v8, v1, Lp1/q;->k:I

    add-int v11, v30, v2

    iput v11, v1, Lp1/q;->l:I

    move/from16 v2, v31

    iput v2, v1, Lp1/q;->m:I

    :goto_1d
    move-wide/from16 v11, v33

    goto :goto_1e

    :cond_2a
    invoke-virtual {v1}, Lp1/q;->W()V

    goto :goto_1d

    :goto_1e
    iput-wide v11, v1, Lp1/q;->T:J

    iput-boolean v0, v1, Lp1/q;->F:Z

    return-void
.end method

.method public final O()V
    .locals 9

    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    iget v0, v0, Lp1/e2;->g:I

    invoke-virtual {p0, v0}, Lp1/q;->S(I)V

    iget-object v0, p0, Lp1/q;->M:Lq1/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lq1/b;->d(Z)V

    iget-object v2, v0, Lq1/b;->d:La3/x;

    iget-object v3, v0, Lq1/b;->a:Lp1/q;

    iget-object v4, v3, Lp1/q;->G:Lp1/e2;

    iget v5, v4, Lp1/e2;->c:I

    if-lez v5, :cond_1

    iget v5, v4, Lp1/e2;->i:I

    const/4 v6, -0x2

    invoke-virtual {v2, v6}, La3/x;->a(I)I

    move-result v6

    if-eq v6, v5, :cond_1

    iget-boolean v6, v0, Lq1/b;->c:Z

    const/4 v7, 0x1

    if-nez v6, :cond_0

    iget-boolean v6, v0, Lq1/b;->e:Z

    if-eqz v6, :cond_0

    invoke-virtual {v0, v1}, Lq1/b;->d(Z)V

    iget-object v6, v0, Lq1/b;->b:Lq1/a;

    iget-object v6, v6, Lq1/a;->a:Lq1/l0;

    sget-object v8, Lq1/q;->d:Lq1/q;

    invoke-virtual {v6, v8}, Lq1/l0;->g0(Lq1/j0;)V

    iput-boolean v7, v0, Lq1/b;->c:Z

    :cond_0
    if-lez v5, :cond_1

    invoke-virtual {v4, v5}, Lp1/e2;->a(I)Lp1/a;

    move-result-object v4

    invoke-virtual {v2, v5}, La3/x;->c(I)V

    invoke-virtual {v0, v1}, Lq1/b;->d(Z)V

    iget-object v2, v0, Lq1/b;->b:Lq1/a;

    iget-object v2, v2, Lq1/a;->a:Lq1/l0;

    sget-object v5, Lq1/p;->d:Lq1/p;

    invoke-virtual {v2, v5}, Lq1/l0;->g0(Lq1/j0;)V

    invoke-static {v2, v1, v4}, Landroidx/room/c1;->O(Lq1/l0;ILjava/lang/Object;)V

    iput-boolean v7, v0, Lq1/b;->c:Z

    :cond_1
    iget-object v1, v0, Lq1/b;->b:Lq1/a;

    iget-object v1, v1, Lq1/a;->a:Lq1/l0;

    sget-object v2, Lq1/y;->d:Lq1/y;

    invoke-virtual {v1, v2}, Lq1/l0;->g0(Lq1/j0;)V

    iget v1, v0, Lq1/b;->f:I

    iget-object v2, v3, Lp1/q;->G:Lp1/e2;

    iget-object v3, v2, Lp1/e2;->b:[I

    iget v2, v2, Lp1/e2;->g:I

    mul-int/lit8 v2, v2, 0x5

    add-int/lit8 v2, v2, 0x3

    aget v2, v3, v2

    add-int/2addr v2, v1

    iput v2, v0, Lq1/b;->f:I

    return-void
.end method

.method public final P(Lp1/p1;)V
    .locals 2

    iget-object v0, p0, Lp1/q;->v:La0/g0;

    if-nez v0, :cond_0

    new-instance v0, La0/g0;

    invoke-direct {v0}, La0/g0;-><init>()V

    iput-object v0, p0, Lp1/q;->v:La0/g0;

    :cond_0
    iget-object v1, p0, Lp1/q;->G:Lp1/e2;

    iget v1, v1, Lp1/e2;->g:I

    invoke-virtual {v0, v1, p1}, La0/g0;->h(ILjava/lang/Object;)V

    return-void
.end method

.method public final Q(III)V
    .locals 6

    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    if-eq p1, p3, :cond_9

    if-ne p2, p3, :cond_1

    goto/16 :goto_6

    :cond_1
    invoke-virtual {v0, p1}, Lp1/e2;->q(I)I

    move-result v1

    if-ne v1, p2, :cond_2

    move p3, p2

    goto/16 :goto_6

    :cond_2
    invoke-virtual {v0, p2}, Lp1/e2;->q(I)I

    move-result v1

    if-ne v1, p1, :cond_3

    :goto_0
    move p3, p1

    goto :goto_6

    :cond_3
    invoke-virtual {v0, p1}, Lp1/e2;->q(I)I

    move-result v1

    invoke-virtual {v0, p2}, Lp1/e2;->q(I)I

    move-result v2

    if-ne v1, v2, :cond_4

    invoke-virtual {v0, p1}, Lp1/e2;->q(I)I

    move-result p3

    goto :goto_6

    :cond_4
    const/4 v1, 0x0

    move v2, p1

    move v3, v1

    :goto_1
    if-lez v2, :cond_5

    if-eq v2, p3, :cond_5

    invoke-virtual {v0, v2}, Lp1/e2;->q(I)I

    move-result v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    move v2, p2

    move v4, v1

    :goto_2
    if-lez v2, :cond_6

    if-eq v2, p3, :cond_6

    invoke-virtual {v0, v2}, Lp1/e2;->q(I)I

    move-result v2

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_6
    sub-int p3, v3, v4

    move v5, p1

    move v2, v1

    :goto_3
    if-ge v2, p3, :cond_7

    invoke-virtual {v0, v5}, Lp1/e2;->q(I)I

    move-result v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_7
    sub-int/2addr v4, v3

    move p3, p2

    :goto_4
    if-ge v1, v4, :cond_8

    invoke-virtual {v0, p3}, Lp1/e2;->q(I)I

    move-result p3

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_8
    move v1, p3

    move p3, v5

    :goto_5
    if-eq p3, v1, :cond_9

    invoke-virtual {v0, p3}, Lp1/e2;->q(I)I

    move-result p3

    invoke-virtual {v0, v1}, Lp1/e2;->q(I)I

    move-result v1

    goto :goto_5

    :cond_9
    :goto_6
    if-lez p1, :cond_b

    if-eq p1, p3, :cond_b

    invoke-virtual {v0, p1}, Lp1/e2;->l(I)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Lp1/q;->M:Lq1/b;

    invoke-virtual {v1}, Lq1/b;->a()V

    :cond_a
    invoke-virtual {v0, p1}, Lp1/e2;->q(I)I

    move-result p1

    goto :goto_6

    :cond_b
    invoke-virtual {p0, p2, p3}, Lp1/q;->p(II)V

    return-void
.end method

.method public final R()Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, Lp1/q;->S:Z

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lp1/q;->r:Z

    if-eqz v0, :cond_1

    const-string v0, "A call to createNode(), emitNode() or useNode() expected"

    invoke-static {v0}, Lp1/r;->c(Ljava/lang/String;)V

    return-object v1

    :cond_0
    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v0}, Lp1/e2;->m()Ljava/lang/Object;

    move-result-object v0

    iget-boolean v2, p0, Lp1/q;->y:Z

    if-eqz v2, :cond_2

    instance-of v2, v0, Lp1/n;

    if-nez v2, :cond_2

    :cond_1
    return-object v1

    :cond_2
    instance-of v1, v0, Lp1/a2;

    if-eqz v1, :cond_3

    check-cast v0, Lp1/a2;

    iget-object v0, v0, Lp1/a2;->a:Lp1/z1;

    :cond_3
    return-object v0
.end method

.method public final S(I)V
    .locals 4

    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v0, p1}, Lp1/e2;->l(I)Z

    move-result v0

    iget-object v1, p0, Lp1/q;->M:Lq1/b;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lq1/b;->c()V

    iget-object v2, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v2, p1}, Lp1/e2;->n(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1}, Lq1/b;->c()V

    iget-object v3, v1, Lq1/b;->h:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    const/4 v2, 0x0

    invoke-static {p0, p1, v0, v2}, Lp1/q;->T(Lp1/q;IZI)I

    invoke-virtual {v1}, Lq1/b;->c()V

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lq1/b;->a()V

    :cond_1
    return-void
.end method

.method public final U(IZ)Z
    .locals 3

    const/4 v0, 0x1

    and-int/2addr p1, v0

    const/4 v1, 0x0

    if-nez p1, :cond_5

    iget-boolean p1, p0, Lp1/q;->S:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lp1/q;->y:Z

    if-eqz p1, :cond_5

    :cond_0
    iget-object p1, p0, Lp1/q;->P:Lux/f0;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->B()Lp1/v1;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lux/f0;->f()Z

    move-result p1

    if-eqz p1, :cond_7

    iget p1, p2, Lp1/v1;->b:I

    and-int/lit16 v2, p1, 0x200

    if-eqz v2, :cond_3

    return v0

    :cond_3
    or-int/lit8 v0, p1, 0x1

    iput v0, p2, Lp1/v1;->b:I

    iget-boolean v2, p0, Lp1/q;->y:Z

    if-eqz v2, :cond_4

    or-int/lit16 p1, p1, 0x81

    goto :goto_0

    :cond_4
    and-int/lit16 p1, v0, -0x81

    :goto_0
    or-int/lit16 p1, p1, 0x100

    iput p1, p2, Lp1/v1;->b:I

    iget-object p1, p0, Lp1/q;->M:Lq1/b;

    iget-object p1, p1, Lq1/b;->b:Lq1/a;

    iget-object p1, p1, Lq1/a;->a:Lq1/l0;

    sget-object v0, Lq1/x;->d:Lq1/x;

    invoke-virtual {p1, v0}, Lq1/l0;->g0(Lq1/j0;)V

    invoke-static {p1, v1, p2}, Landroidx/room/c1;->O(Lq1/l0;ILjava/lang/Object;)V

    iget-object p1, p0, Lp1/q;->b:Lp1/t;

    invoke-virtual {p1, p2}, Lp1/t;->p(Lp1/v1;)V

    return v1

    :cond_5
    if-nez p2, :cond_7

    invoke-virtual {p0}, Lp1/q;->F()Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    return v1

    :cond_7
    :goto_1
    return v0
.end method

.method public final V()V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lp1/q;->s:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, v0, Lp1/q;->l:I

    iget-object v2, v0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v2}, Lp1/e2;->s()I

    move-result v2

    add-int/2addr v2, v1

    iput v2, v0, Lp1/q;->l:I

    return-void

    :cond_0
    iget-object v1, v0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v1}, Lp1/e2;->g()I

    move-result v2

    iget-object v3, v1, Lp1/e2;->b:[I

    iget v4, v1, Lp1/e2;->g:I

    iget v5, v1, Lp1/e2;->h:I

    const/4 v6, 0x0

    if-ge v4, v5, :cond_1

    invoke-virtual {v1, v3, v4}, Lp1/e2;->p([II)Ljava/lang/Object;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, v6

    :goto_0
    invoke-virtual {v1}, Lp1/e2;->f()Ljava/lang/Object;

    move-result-object v5

    iget v7, v0, Lp1/q;->m:I

    sget-object v8, Lp1/l;->a:Lp1/v0;

    const/16 v9, 0xcf

    const/4 v11, 0x3

    if-nez v4, :cond_3

    if-eqz v5, :cond_2

    if-ne v2, v9, :cond_2

    invoke-virtual {v5, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_2

    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v12

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14, v11}, Ljava/lang/Long;->rotateLeft(JI)J

    move-result-wide v13

    int-to-long v9, v12

    xor-long/2addr v9, v13

    invoke-static {v9, v10, v11}, Ljava/lang/Long;->rotateLeft(JI)J

    move-result-wide v9

    int-to-long v12, v7

    xor-long/2addr v9, v12

    iput-wide v9, v0, Lp1/q;->T:J

    goto :goto_3

    :cond_2
    iget-wide v9, v0, Lp1/q;->T:J

    invoke-static {v9, v10, v11}, Ljava/lang/Long;->rotateLeft(JI)J

    move-result-wide v9

    int-to-long v12, v2

    xor-long/2addr v9, v12

    invoke-static {v9, v10, v11}, Ljava/lang/Long;->rotateLeft(JI)J

    move-result-wide v9

    int-to-long v12, v7

    xor-long/2addr v9, v12

    :goto_1
    iput-wide v9, v0, Lp1/q;->T:J

    goto :goto_3

    :cond_3
    instance-of v9, v4, Ljava/lang/Enum;

    if-eqz v9, :cond_4

    move-object v9, v4

    check-cast v9, Ljava/lang/Enum;

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    iget-wide v12, v0, Lp1/q;->T:J

    invoke-static {v12, v13, v11}, Ljava/lang/Long;->rotateLeft(JI)J

    move-result-wide v12

    int-to-long v9, v9

    xor-long/2addr v9, v12

    invoke-static {v9, v10, v11}, Ljava/lang/Long;->rotateLeft(JI)J

    move-result-wide v9

    const/4 v12, 0x0

    :goto_2
    int-to-long v13, v12

    xor-long/2addr v9, v13

    goto :goto_1

    :cond_4
    const/4 v12, 0x0

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v9

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14, v11}, Ljava/lang/Long;->rotateLeft(JI)J

    move-result-wide v13

    int-to-long v9, v9

    xor-long/2addr v9, v13

    invoke-static {v9, v10, v11}, Ljava/lang/Long;->rotateLeft(JI)J

    move-result-wide v9

    goto :goto_2

    :goto_3
    iget v9, v1, Lp1/e2;->g:I

    mul-int/lit8 v9, v9, 0x5

    const/4 v12, 0x1

    add-int/2addr v9, v12

    aget v3, v3, v9

    const/high16 v9, 0x40000000    # 2.0f

    and-int/2addr v3, v9

    if-eqz v3, :cond_5

    goto :goto_4

    :cond_5
    const/4 v12, 0x0

    :goto_4
    invoke-virtual {v0, v6, v12}, Lp1/q;->d0(Ljava/lang/Object;Z)V

    invoke-virtual {v0}, Lp1/q;->N()V

    invoke-virtual {v1}, Lp1/e2;->e()V

    if-nez v4, :cond_7

    if-eqz v5, :cond_6

    const/16 v15, 0xcf

    if-ne v2, v15, :cond_6

    invoke-virtual {v5, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v1

    iget-wide v2, v0, Lp1/q;->T:J

    int-to-long v4, v7

    xor-long/2addr v2, v4

    invoke-static {v2, v3, v11}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v2

    int-to-long v4, v1

    xor-long v1, v2, v4

    invoke-static {v1, v2, v11}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v1

    iput-wide v1, v0, Lp1/q;->T:J

    return-void

    :cond_6
    iget-wide v3, v0, Lp1/q;->T:J

    int-to-long v5, v7

    xor-long/2addr v3, v5

    invoke-static {v3, v4, v11}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v3

    int-to-long v1, v2

    xor-long/2addr v1, v3

    invoke-static {v1, v2, v11}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v1

    iput-wide v1, v0, Lp1/q;->T:J

    return-void

    :cond_7
    instance-of v1, v4, Ljava/lang/Enum;

    if-eqz v1, :cond_8

    check-cast v4, Ljava/lang/Enum;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    iget-wide v2, v0, Lp1/q;->T:J

    const/4 v12, 0x0

    int-to-long v4, v12

    xor-long/2addr v2, v4

    invoke-static {v2, v3, v11}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v2

    int-to-long v4, v1

    xor-long v1, v2, v4

    invoke-static {v1, v2, v11}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v1

    iput-wide v1, v0, Lp1/q;->T:J

    return-void

    :cond_8
    const/4 v12, 0x0

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v1

    iget-wide v2, v0, Lp1/q;->T:J

    int-to-long v4, v12

    xor-long/2addr v2, v4

    invoke-static {v2, v3, v11}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v2

    int-to-long v4, v1

    xor-long v1, v2, v4

    invoke-static {v1, v2, v11}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v1

    iput-wide v1, v0, Lp1/q;->T:J

    return-void
.end method

.method public final W()V
    .locals 3

    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    iget v1, v0, Lp1/e2;->i:I

    if-ltz v1, :cond_0

    iget-object v2, v0, Lp1/e2;->b:[I

    mul-int/lit8 v1, v1, 0x5

    add-int/lit8 v1, v1, 0x1

    aget v1, v2, v1

    const v2, 0x3ffffff

    and-int/2addr v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput v1, p0, Lp1/q;->l:I

    invoke-virtual {v0}, Lp1/e2;->t()V

    return-void
.end method

.method public final X()V
    .locals 3

    iget v0, p0, Lp1/q;->l:I

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "No nodes can be emitted before calling skipAndEndGroup"

    invoke-static {v0}, Lp1/r;->c(Ljava/lang/String;)V

    :goto_0
    iget-boolean v0, p0, Lp1/q;->S:Z

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lp1/q;->B()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_2

    iget v1, v0, Lp1/v1;->b:I

    and-int/lit16 v2, v1, 0x80

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    or-int/lit8 v1, v1, 0x10

    iput v1, v0, Lp1/v1;->b:I

    :cond_2
    :goto_1
    iget-object v0, p0, Lp1/q;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lp1/q;->W()V

    return-void

    :cond_3
    invoke-virtual {p0}, Lp1/q;->N()V

    :cond_4
    return-void
.end method

.method public final Y(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    const/4 v5, -0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iget-boolean v7, v0, Lp1/q;->r:Z

    if-eqz v7, :cond_0

    const-string v7, "A call to createNode(), emitNode() or useNode() expected"

    invoke-static {v7}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_0
    iget v7, v0, Lp1/q;->m:I

    sget-object v8, Lp1/l;->a:Lp1/v0;

    const/4 v9, 0x3

    const/4 v10, 0x0

    if-nez v1, :cond_2

    if-eqz v3, :cond_1

    const/16 v11, 0xcf

    if-ne v2, v11, :cond_1

    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v11

    iget-wide v12, v0, Lp1/q;->T:J

    invoke-static {v12, v13, v9}, Ljava/lang/Long;->rotateLeft(JI)J

    move-result-wide v12

    int-to-long v14, v11

    xor-long v11, v12, v14

    invoke-static {v11, v12, v9}, Ljava/lang/Long;->rotateLeft(JI)J

    move-result-wide v11

    int-to-long v13, v7

    xor-long/2addr v11, v13

    iput-wide v11, v0, Lp1/q;->T:J

    goto :goto_2

    :cond_1
    iget-wide v11, v0, Lp1/q;->T:J

    invoke-static {v11, v12, v9}, Ljava/lang/Long;->rotateLeft(JI)J

    move-result-wide v11

    int-to-long v13, v2

    xor-long/2addr v11, v13

    invoke-static {v11, v12, v9}, Ljava/lang/Long;->rotateLeft(JI)J

    move-result-wide v11

    int-to-long v13, v7

    :goto_0
    xor-long/2addr v11, v13

    iput-wide v11, v0, Lp1/q;->T:J

    goto :goto_2

    :cond_2
    instance-of v7, v1, Ljava/lang/Enum;

    if-eqz v7, :cond_3

    move-object v7, v1

    check-cast v7, Ljava/lang/Enum;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    :goto_1
    iget-wide v11, v0, Lp1/q;->T:J

    invoke-static {v11, v12, v9}, Ljava/lang/Long;->rotateLeft(JI)J

    move-result-wide v11

    int-to-long v13, v7

    xor-long/2addr v11, v13

    invoke-static {v11, v12, v9}, Ljava/lang/Long;->rotateLeft(JI)J

    move-result-wide v11

    int-to-long v13, v10

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v7

    goto :goto_1

    :goto_2
    const/4 v7, 0x1

    if-nez v1, :cond_4

    iget v9, v0, Lp1/q;->m:I

    add-int/2addr v9, v7

    iput v9, v0, Lp1/q;->m:I

    :cond_4
    if-eqz v4, :cond_5

    move v9, v7

    goto :goto_3

    :cond_5
    move v9, v10

    :goto_3
    iget-boolean v11, v0, Lp1/q;->S:Z

    const/4 v12, -0x2

    const/4 v13, 0x0

    if-eqz v11, :cond_b

    iget-object v4, v0, Lp1/q;->G:Lp1/e2;

    iget v11, v4, Lp1/e2;->k:I

    add-int/2addr v11, v7

    iput v11, v4, Lp1/e2;->k:I

    iget-object v4, v0, Lp1/q;->I:Lp1/i2;

    iget v11, v4, Lp1/i2;->t:I

    if-eqz v9, :cond_6

    invoke-virtual {v4, v8, v8, v7, v2}, Lp1/i2;->P(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    goto :goto_4

    :cond_6
    if-eqz v3, :cond_8

    if-nez v1, :cond_7

    move-object v1, v8

    :cond_7
    invoke-virtual {v4, v1, v3, v10, v2}, Lp1/i2;->P(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    goto :goto_4

    :cond_8
    if-nez v1, :cond_9

    move-object v1, v8

    :cond_9
    invoke-virtual {v4, v1, v8, v10, v2}, Lp1/i2;->P(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    :goto_4
    iget-object v1, v0, Lp1/q;->j:Lp1/o1;

    if-eqz v1, :cond_a

    new-instance v3, Lp1/r0;

    sub-int/2addr v12, v11

    invoke-direct {v3, v6, v2, v12, v5}, Lp1/r0;-><init>(Ljava/lang/Object;III)V

    iget v2, v0, Lp1/q;->k:I

    iget v4, v1, Lp1/o1;->b:I

    sub-int/2addr v2, v4

    iget-object v4, v1, Lp1/o1;->e:La0/g0;

    new-instance v6, Lp1/l0;

    invoke-direct {v6, v5, v2, v10}, Lp1/l0;-><init>(III)V

    invoke-virtual {v4, v12, v6}, La0/g0;->h(ILjava/lang/Object;)V

    iget-object v1, v1, Lp1/o1;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    invoke-virtual {v0, v9, v13}, Lp1/q;->y(ZLp1/o1;)V

    return-void

    :cond_b
    if-eq v4, v7, :cond_c

    goto :goto_5

    :cond_c
    iget-boolean v4, v0, Lp1/q;->y:Z

    if-eqz v4, :cond_d

    move v4, v7

    goto :goto_6

    :cond_d
    :goto_5
    move v4, v10

    :goto_6
    iget-object v11, v0, Lp1/q;->j:Lp1/o1;

    if-nez v11, :cond_f

    iget-object v11, v0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v11}, Lp1/e2;->g()I

    move-result v11

    if-nez v4, :cond_10

    if-ne v11, v2, :cond_10

    iget-object v11, v0, Lp1/q;->G:Lp1/e2;

    iget v14, v11, Lp1/e2;->g:I

    iget v15, v11, Lp1/e2;->h:I

    if-ge v14, v15, :cond_e

    iget-object v15, v11, Lp1/e2;->b:[I

    invoke-virtual {v11, v15, v14}, Lp1/e2;->p([II)Ljava/lang/Object;

    move-result-object v11

    goto :goto_7

    :cond_e
    move-object v11, v13

    :goto_7
    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_10

    invoke-virtual {v0, v3, v9}, Lp1/q;->d0(Ljava/lang/Object;Z)V

    :cond_f
    move/from16 p4, v4

    goto :goto_b

    :cond_10
    new-instance v11, Lp1/o1;

    iget-object v14, v0, Lp1/q;->G:Lp1/e2;

    iget-object v15, v14, Lp1/e2;->b:[I

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iget v13, v14, Lp1/e2;->k:I

    if-lez v13, :cond_12

    :cond_11
    move/from16 p4, v4

    goto :goto_a

    :cond_12
    iget v13, v14, Lp1/e2;->g:I

    :goto_8
    iget v12, v14, Lp1/e2;->h:I

    if-ge v13, v12, :cond_11

    new-instance v12, Lp1/r0;

    mul-int/lit8 v18, v13, 0x5

    aget v7, v15, v18

    invoke-virtual {v14, v15, v13}, Lp1/e2;->p([II)Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v20, v18, 0x1

    aget v20, v15, v20

    const/high16 v21, 0x40000000    # 2.0f

    and-int v21, v20, v21

    if-eqz v21, :cond_13

    move/from16 p4, v4

    const/4 v4, 0x1

    goto :goto_9

    :cond_13
    const v21, 0x3ffffff

    and-int v20, v20, v21

    move/from16 p4, v4

    move/from16 v4, v20

    :goto_9
    invoke-direct {v12, v10, v7, v13, v4}, Lp1/r0;-><init>(Ljava/lang/Object;III)V

    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v18, v18, 0x3

    aget v4, v15, v18

    add-int/2addr v13, v4

    move/from16 v4, p4

    const/4 v7, 0x1

    const/4 v10, 0x0

    goto :goto_8

    :goto_a
    iget v4, v0, Lp1/q;->k:I

    invoke-direct {v11, v5, v4}, Lp1/o1;-><init>(Ljava/util/ArrayList;I)V

    iput-object v11, v0, Lp1/q;->j:Lp1/o1;

    :goto_b
    iget-object v4, v0, Lp1/q;->j:Lp1/o1;

    if-eqz v4, :cond_2b

    iget-object v5, v4, Lp1/o1;->d:Ljava/util/ArrayList;

    iget-object v7, v4, Lp1/o1;->e:La0/g0;

    iget v10, v4, Lp1/o1;->b:I

    if-eqz v1, :cond_14

    new-instance v11, Lp1/q0;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-direct {v11, v12, v1}, Lp1/q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_c

    :cond_14
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    :goto_c
    iget-object v12, v4, Lp1/o1;->f:Ll83/p;

    invoke-virtual {v12}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lr1/a;

    iget-object v12, v12, Lr1/a;->a:La0/v0;

    invoke-virtual {v12, v11}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_15

    const/4 v13, 0x0

    goto :goto_d

    :cond_15
    instance-of v14, v13, La0/q0;

    if-eqz v14, :cond_18

    check-cast v13, La0/q0;

    const/4 v14, 0x0

    invoke-virtual {v13, v14}, La0/q0;->j(I)Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v13}, La0/q0;->g()Z

    move-result v14

    if-eqz v14, :cond_16

    invoke-virtual {v12, v11}, La0/v0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_16
    iget v14, v13, La0/q0;->b:I

    const/4 v1, 0x1

    if-ne v14, v1, :cond_17

    invoke-virtual {v13}, La0/q0;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v12, v11, v1}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_17
    move-object v13, v15

    goto :goto_d

    :cond_18
    invoke-virtual {v12, v11}, La0/v0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_d
    check-cast v13, Lp1/r0;

    if-nez p4, :cond_2c

    if-eqz v13, :cond_2c

    iget v1, v13, Lp1/r0;->c:I

    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7, v1}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp1/l0;

    if-eqz v2, :cond_19

    iget v2, v2, Lp1/l0;->b:I

    goto :goto_e

    :cond_19
    const/4 v2, -0x1

    :goto_e
    add-int/2addr v2, v10

    iput v2, v0, Lp1/q;->k:I

    invoke-virtual {v7, v1}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp1/l0;

    if-eqz v2, :cond_1a

    iget v5, v2, Lp1/l0;->a:I

    goto :goto_f

    :cond_1a
    const/4 v5, -0x1

    :goto_f
    iget v2, v4, Lp1/o1;->c:I

    sub-int v4, v5, v2

    const/16 v8, 0x8

    if-le v5, v2, :cond_21

    const/16 p1, 0x7

    iget-object v6, v7, La0/s;->c:[Ljava/lang/Object;

    iget-object v7, v7, La0/s;->a:[J

    const-wide/16 v20, 0x80

    array-length v10, v7

    add-int/lit8 v10, v10, -0x2

    if-ltz v10, :cond_20

    const/4 v11, 0x0

    const-wide/16 v22, 0xff

    :goto_10
    aget-wide v12, v7, v11

    const-wide v24, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    not-long v14, v12

    shl-long v14, v14, p1

    and-long/2addr v14, v12

    and-long v14, v14, v24

    cmp-long v14, v14, v24

    if-eqz v14, :cond_1f

    sub-int v14, v11, v10

    not-int v14, v14

    ushr-int/lit8 v14, v14, 0x1f

    rsub-int/lit8 v14, v14, 0x8

    const/4 v15, 0x0

    :goto_11
    if-ge v15, v14, :cond_1e

    and-long v26, v12, v22

    cmp-long v16, v26, v20

    if-gez v16, :cond_1c

    shl-int/lit8 v16, v11, 0x3

    add-int v16, v16, v15

    aget-object v16, v6, v16

    move/from16 p2, v8

    move-object/from16 v8, v16

    check-cast v8, Lp1/l0;

    move/from16 p4, v4

    iget v4, v8, Lp1/l0;->a:I

    if-ne v4, v5, :cond_1b

    iput v2, v8, Lp1/l0;->a:I

    goto :goto_12

    :cond_1b
    if-gt v2, v4, :cond_1d

    if-ge v4, v5, :cond_1d

    add-int/lit8 v4, v4, 0x1

    iput v4, v8, Lp1/l0;->a:I

    goto :goto_12

    :cond_1c
    move/from16 p4, v4

    move/from16 p2, v8

    :cond_1d
    :goto_12
    shr-long v12, v12, p2

    add-int/lit8 v15, v15, 0x1

    move/from16 v8, p2

    move/from16 v4, p4

    goto :goto_11

    :cond_1e
    move/from16 p4, v4

    move v4, v8

    if-ne v14, v4, :cond_27

    goto :goto_13

    :cond_1f
    move/from16 p4, v4

    :goto_13
    if-eq v11, v10, :cond_27

    add-int/lit8 v11, v11, 0x1

    move/from16 v4, p4

    const/16 v8, 0x8

    goto :goto_10

    :cond_20
    move/from16 p4, v4

    goto/16 :goto_1a

    :cond_21
    move/from16 p4, v4

    const/16 p1, 0x7

    const-wide/16 v20, 0x80

    const-wide/16 v22, 0xff

    const-wide v24, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    if-le v2, v5, :cond_27

    iget-object v4, v7, La0/s;->c:[Ljava/lang/Object;

    iget-object v6, v7, La0/s;->a:[J

    array-length v7, v6

    add-int/lit8 v7, v7, -0x2

    if-ltz v7, :cond_27

    const/4 v8, 0x0

    :goto_14
    aget-wide v10, v6, v8

    not-long v12, v10

    shl-long v12, v12, p1

    and-long/2addr v12, v10

    and-long v12, v12, v24

    cmp-long v12, v12, v24

    if-eqz v12, :cond_26

    sub-int v12, v8, v7

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    const/4 v13, 0x0

    :goto_15
    if-ge v13, v12, :cond_25

    and-long v14, v10, v22

    cmp-long v14, v14, v20

    if-gez v14, :cond_24

    shl-int/lit8 v14, v8, 0x3

    add-int/2addr v14, v13

    aget-object v14, v4, v14

    check-cast v14, Lp1/l0;

    iget v15, v14, Lp1/l0;->a:I

    if-ne v15, v5, :cond_22

    iput v2, v14, Lp1/l0;->a:I

    goto :goto_17

    :cond_22
    move-object/from16 v16, v4

    add-int/lit8 v4, v5, 0x1

    if-gt v4, v15, :cond_23

    if-ge v15, v2, :cond_23

    add-int/lit8 v15, v15, -0x1

    iput v15, v14, Lp1/l0;->a:I

    :cond_23
    :goto_16
    const/16 v4, 0x8

    goto :goto_18

    :cond_24
    :goto_17
    move-object/from16 v16, v4

    goto :goto_16

    :goto_18
    shr-long/2addr v10, v4

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v4, v16

    goto :goto_15

    :cond_25
    move-object/from16 v16, v4

    const/16 v4, 0x8

    if-ne v12, v4, :cond_27

    goto :goto_19

    :cond_26
    move-object/from16 v16, v4

    const/16 v4, 0x8

    :goto_19
    if-eq v8, v7, :cond_27

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v4, v16

    goto :goto_14

    :cond_27
    :goto_1a
    iget-object v2, v0, Lp1/q;->M:Lq1/b;

    iget v4, v2, Lq1/b;->f:I

    iget-object v5, v2, Lq1/b;->a:Lp1/q;

    iget-object v6, v5, Lp1/q;->G:Lp1/e2;

    iget v6, v6, Lp1/e2;->g:I

    sub-int v6, v1, v6

    add-int/2addr v6, v4

    iput v6, v2, Lq1/b;->f:I

    iget-object v4, v0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v4, v1}, Lp1/e2;->r(I)V

    if-lez p4, :cond_2a

    const/4 v14, 0x0

    invoke-virtual {v2, v14}, Lq1/b;->d(Z)V

    iget-object v1, v2, Lq1/b;->d:La3/x;

    iget-object v4, v5, Lp1/q;->G:Lp1/e2;

    iget v5, v4, Lp1/e2;->c:I

    if-lez v5, :cond_29

    iget v5, v4, Lp1/e2;->i:I

    const/4 v6, -0x2

    invoke-virtual {v1, v6}, La3/x;->a(I)I

    move-result v6

    if-eq v6, v5, :cond_29

    iget-boolean v6, v2, Lq1/b;->c:Z

    if-nez v6, :cond_28

    iget-boolean v6, v2, Lq1/b;->e:Z

    if-eqz v6, :cond_28

    const/4 v14, 0x0

    invoke-virtual {v2, v14}, Lq1/b;->d(Z)V

    iget-object v6, v2, Lq1/b;->b:Lq1/a;

    iget-object v6, v6, Lq1/a;->a:Lq1/l0;

    sget-object v7, Lq1/q;->d:Lq1/q;

    invoke-virtual {v6, v7}, Lq1/l0;->g0(Lq1/j0;)V

    const/4 v6, 0x1

    iput-boolean v6, v2, Lq1/b;->c:Z

    :cond_28
    if-lez v5, :cond_29

    invoke-virtual {v4, v5}, Lp1/e2;->a(I)Lp1/a;

    move-result-object v4

    invoke-virtual {v1, v5}, La3/x;->c(I)V

    const/4 v14, 0x0

    invoke-virtual {v2, v14}, Lq1/b;->d(Z)V

    iget-object v1, v2, Lq1/b;->b:Lq1/a;

    iget-object v1, v1, Lq1/a;->a:Lq1/l0;

    sget-object v5, Lq1/p;->d:Lq1/p;

    invoke-virtual {v1, v5}, Lq1/l0;->g0(Lq1/j0;)V

    invoke-static {v1, v14, v4}, Landroidx/room/c1;->O(Lq1/l0;ILjava/lang/Object;)V

    const/4 v1, 0x1

    iput-boolean v1, v2, Lq1/b;->c:Z

    :cond_29
    iget-object v1, v2, Lq1/b;->b:Lq1/a;

    iget-object v1, v1, Lq1/a;->a:Lq1/l0;

    sget-object v2, Lq1/u;->d:Lq1/u;

    invoke-virtual {v1, v2}, Lq1/l0;->g0(Lq1/j0;)V

    iget-object v2, v1, Lq1/l0;->c:[I

    iget v4, v1, Lq1/l0;->d:I

    iget-object v5, v1, Lq1/l0;->a:[Lq1/j0;

    iget v1, v1, Lq1/l0;->b:I

    const/16 v19, 0x1

    add-int/lit8 v1, v1, -0x1

    aget-object v1, v5, v1

    iget v1, v1, Lq1/j0;->b:I

    sub-int/2addr v4, v1

    aput p4, v2, v4

    :cond_2a
    invoke-virtual {v0, v3, v9}, Lp1/q;->d0(Ljava/lang/Object;Z)V

    :cond_2b
    const/4 v1, 0x0

    goto/16 :goto_20

    :cond_2c
    iget-object v1, v0, Lp1/q;->G:Lp1/e2;

    iget v4, v1, Lp1/e2;->k:I

    const/4 v11, 0x1

    add-int/2addr v4, v11

    iput v4, v1, Lp1/e2;->k:I

    iput-boolean v11, v0, Lp1/q;->S:Z

    const/4 v1, 0x0

    iput-object v1, v0, Lp1/q;->K:Lp1/p1;

    iget-object v4, v0, Lp1/q;->I:Lp1/i2;

    iget-boolean v4, v4, Lp1/i2;->w:Z

    if-eqz v4, :cond_2d

    iget-object v4, v0, Lp1/q;->H:Lp1/f2;

    invoke-virtual {v4}, Lp1/f2;->e()Lp1/i2;

    move-result-object v4

    iput-object v4, v0, Lp1/q;->I:Lp1/i2;

    invoke-virtual {v4}, Lp1/i2;->L()V

    const/4 v14, 0x0

    iput-boolean v14, v0, Lp1/q;->J:Z

    iput-object v1, v0, Lp1/q;->K:Lp1/p1;

    :cond_2d
    iget-object v1, v0, Lp1/q;->I:Lp1/i2;

    invoke-virtual {v1}, Lp1/i2;->d()V

    iget-object v1, v0, Lp1/q;->I:Lp1/i2;

    iget v4, v1, Lp1/i2;->t:I

    if-eqz v9, :cond_2e

    const/4 v11, 0x1

    invoke-virtual {v1, v8, v8, v11, v2}, Lp1/i2;->P(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    const/4 v14, 0x0

    goto :goto_1e

    :cond_2e
    if-eqz v3, :cond_30

    if-nez p1, :cond_2f

    :goto_1b
    const/4 v14, 0x0

    goto :goto_1c

    :cond_2f
    move-object/from16 v8, p1

    goto :goto_1b

    :goto_1c
    invoke-virtual {v1, v8, v3, v14, v2}, Lp1/i2;->P(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    goto :goto_1e

    :cond_30
    const/4 v14, 0x0

    if-nez p1, :cond_31

    move-object v3, v8

    goto :goto_1d

    :cond_31
    move-object/from16 v3, p1

    :goto_1d
    invoke-virtual {v1, v3, v8, v14, v2}, Lp1/i2;->P(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    :goto_1e
    iget-object v1, v0, Lp1/q;->I:Lp1/i2;

    invoke-virtual {v1, v4}, Lp1/i2;->b(I)Lp1/a;

    move-result-object v1

    iput-object v1, v0, Lp1/q;->N:Lp1/a;

    new-instance v1, Lp1/r0;

    const/16 v17, -0x2

    rsub-int/lit8 v12, v4, -0x2

    const/4 v3, -0x1

    invoke-direct {v1, v6, v2, v12, v3}, Lp1/r0;-><init>(Ljava/lang/Object;III)V

    iget v2, v0, Lp1/q;->k:I

    sub-int/2addr v2, v10

    new-instance v4, Lp1/l0;

    invoke-direct {v4, v3, v2, v14}, Lp1/l0;-><init>(III)V

    invoke-virtual {v7, v12, v4}, La0/g0;->h(ILjava/lang/Object;)V

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v13, Lp1/o1;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-eqz v9, :cond_32

    move v10, v14

    goto :goto_1f

    :cond_32
    iget v10, v0, Lp1/q;->k:I

    :goto_1f
    invoke-direct {v13, v1, v10}, Lp1/o1;-><init>(Ljava/util/ArrayList;I)V

    goto :goto_21

    :goto_20
    move-object v13, v1

    :goto_21
    invoke-virtual {v0, v9, v13}, Lp1/q;->y(ZLp1/o1;)V

    return-void
.end method

.method public final Z()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v2, -0x7f

    invoke-virtual {p0, v0, v2, v0, v1}, Lp1/q;->Y(Ljava/lang/Object;ILjava/lang/Object;I)V

    return-void
.end method

.method public final a()V
    .locals 4

    invoke-virtual {p0}, Lp1/q;->j()V

    iget-object v0, p0, Lp1/q;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lp1/q;->n:La3/x;

    const/4 v1, 0x0

    iput v1, v0, La3/x;->b:I

    iget-object v0, p0, Lp1/q;->t:La3/x;

    iput v1, v0, La3/x;->b:I

    iget-object v0, p0, Lp1/q;->x:La3/x;

    iput v1, v0, La3/x;->b:I

    const/4 v0, 0x0

    iput-object v0, p0, Lp1/q;->v:La0/g0;

    iget-object v0, p0, Lp1/q;->O:Lq1/c;

    iget-object v2, v0, Lq1/c;->b:Lq1/l0;

    invoke-virtual {v2}, Lq1/l0;->c0()V

    iget-object v0, v0, Lq1/c;->a:Lq1/l0;

    invoke-virtual {v0}, Lq1/l0;->c0()V

    int-to-long v2, v1

    iput-wide v2, p0, Lp1/q;->T:J

    iput v1, p0, Lp1/q;->A:I

    iput-boolean v1, p0, Lp1/q;->r:Z

    iput-boolean v1, p0, Lp1/q;->S:Z

    iput-boolean v1, p0, Lp1/q;->y:Z

    iput-boolean v1, p0, Lp1/q;->F:Z

    const/4 v0, -0x1

    iput v0, p0, Lp1/q;->z:I

    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    iget-boolean v1, v0, Lp1/e2;->f:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lp1/e2;->c()V

    :cond_0
    iget-object v0, p0, Lp1/q;->I:Lp1/i2;

    iget-boolean v0, v0, Lp1/i2;->w:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lp1/q;->z()V

    :cond_1
    return-void
.end method

.method public final a0(ILp1/e1;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, p2, p1, v1, v0}, Lp1/q;->Y(Ljava/lang/Object;ILjava/lang/Object;I)V

    return-void
.end method

.method public final b(Ljava/lang/Object;Lc93/m;)V
    .locals 6

    iget-boolean v0, p0, Lp1/q;->S:Z

    const/4 v1, 0x2

    const-string v2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>"

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp1/q;->O:Lq1/c;

    iget-object v0, v0, Lq1/c;->a:Lq1/l0;

    sget-object v5, Lq1/g0;->d:Lq1/g0;

    invoke-virtual {v0, v5}, Lq1/l0;->g0(Lq1/j0;)V

    invoke-static {v0, v4, p1}, Landroidx/room/c1;->O(Lq1/l0;ILjava/lang/Object;)V

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, p2}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-static {v0, v3, p2}, Landroidx/room/c1;->O(Lq1/l0;ILjava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lp1/q;->M:Lq1/b;

    invoke-virtual {v0}, Lq1/b;->b()V

    iget-object v0, v0, Lq1/b;->b:Lq1/a;

    iget-object v0, v0, Lq1/a;->a:Lq1/l0;

    sget-object v5, Lq1/g0;->d:Lq1/g0;

    invoke-virtual {v0, v5}, Lq1/l0;->g0(Lq1/j0;)V

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, p2}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-static {v0, v4, p1, v3, p2}, Landroidx/room/c1;->P(Lq1/l0;ILjava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public final b0(ILjava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, p2, p1, v1, v0}, Lp1/q;->Y(Ljava/lang/Object;ILjava/lang/Object;I)V

    return-void
.end method

.method public final c(D)Z
    .locals 2

    invoke-virtual {p0}, Lp1/q;->J()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Double;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    cmpg-double v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp1/q;->q0(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final c0()V
    .locals 3

    const/4 v0, 0x0

    const/16 v1, 0x7d

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v0, v2}, Lp1/q;->Y(Ljava/lang/Object;ILjava/lang/Object;I)V

    iput-boolean v2, p0, Lp1/q;->r:Z

    return-void
.end method

.method public final d(F)Z
    .locals 2

    invoke-virtual {p0}, Lp1/q;->J()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Float;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    cmpg-float v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp1/q;->q0(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final d0(Ljava/lang/Object;Z)V
    .locals 2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lp1/q;->G:Lp1/e2;

    iget p2, p1, Lp1/e2;->k:I

    if-gtz p2, :cond_1

    iget-object p2, p1, Lp1/e2;->b:[I

    iget v0, p1, Lp1/e2;->g:I

    mul-int/lit8 v0, v0, 0x5

    add-int/lit8 v0, v0, 0x1

    aget p2, p2, v0

    const/high16 v0, 0x40000000    # 2.0f

    and-int/2addr p2, v0

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "Expected a node group"

    invoke-static {p2}, Lp1/q1;->a(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p1}, Lp1/e2;->u()V

    :cond_1
    return-void

    :cond_2
    if-eqz p1, :cond_3

    iget-object p2, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {p2}, Lp1/e2;->f()Ljava/lang/Object;

    move-result-object p2

    if-eq p2, p1, :cond_3

    iget-object p2, p0, Lp1/q;->M:Lq1/b;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lq1/b;->d(Z)V

    iget-object p2, p2, Lq1/b;->b:Lq1/a;

    iget-object p2, p2, Lq1/a;->a:Lq1/l0;

    sget-object v1, Lq1/f0;->d:Lq1/f0;

    invoke-virtual {p2, v1}, Lq1/l0;->g0(Lq1/j0;)V

    invoke-static {p2, v0, p1}, Landroidx/room/c1;->O(Lq1/l0;ILjava/lang/Object;)V

    :cond_3
    iget-object p1, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {p1}, Lp1/e2;->u()V

    return-void
.end method

.method public final e(I)Z
    .locals 2

    invoke-virtual {p0}, Lp1/q;->J()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp1/q;->q0(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final e0(I)V
    .locals 9

    iget-object v0, p0, Lp1/q;->j:Lp1/o1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v2, p1, v2, v1}, Lp1/q;->Y(Ljava/lang/Object;ILjava/lang/Object;I)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lp1/q;->r:Z

    if-eqz v0, :cond_1

    const-string v0, "A call to createNode(), emitNode() or useNode() expected"

    invoke-static {v0}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_1
    iget v0, p0, Lp1/q;->m:I

    iget-wide v3, p0, Lp1/q;->T:J

    const/4 v5, 0x3

    invoke-static {v3, v4, v5}, Ljava/lang/Long;->rotateLeft(JI)J

    move-result-wide v3

    int-to-long v6, p1

    xor-long/2addr v3, v6

    invoke-static {v3, v4, v5}, Ljava/lang/Long;->rotateLeft(JI)J

    move-result-wide v3

    int-to-long v5, v0

    xor-long/2addr v3, v5

    iput-wide v3, p0, Lp1/q;->T:J

    iget v0, p0, Lp1/q;->m:I

    const/4 v3, 0x1

    add-int/2addr v0, v3

    iput v0, p0, Lp1/q;->m:I

    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    iget-boolean v4, p0, Lp1/q;->S:Z

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_2

    iget v4, v0, Lp1/e2;->k:I

    add-int/2addr v4, v3

    iput v4, v0, Lp1/e2;->k:I

    iget-object v0, p0, Lp1/q;->I:Lp1/i2;

    invoke-virtual {v0, v5, v5, v1, p1}, Lp1/i2;->P(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-virtual {p0, v1, v2}, Lp1/q;->y(ZLp1/o1;)V

    return-void

    :cond_2
    invoke-virtual {v0}, Lp1/e2;->g()I

    move-result v4

    if-ne v4, p1, :cond_4

    iget v4, v0, Lp1/e2;->g:I

    iget v6, v0, Lp1/e2;->h:I

    if-ge v4, v6, :cond_3

    iget-object v6, v0, Lp1/e2;->b:[I

    mul-int/lit8 v4, v4, 0x5

    add-int/2addr v4, v3

    aget v4, v6, v4

    const/high16 v6, 0x20000000

    and-int/2addr v4, v6

    if-eqz v4, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lp1/e2;->u()V

    invoke-virtual {p0, v1, v2}, Lp1/q;->y(ZLp1/o1;)V

    return-void

    :cond_4
    :goto_0
    iget v4, v0, Lp1/e2;->k:I

    if-lez v4, :cond_5

    goto :goto_1

    :cond_5
    iget v4, v0, Lp1/e2;->g:I

    iget v6, v0, Lp1/e2;->h:I

    if-ne v4, v6, :cond_6

    goto :goto_1

    :cond_6
    iget v6, p0, Lp1/q;->k:I

    invoke-virtual {p0}, Lp1/q;->O()V

    invoke-virtual {v0}, Lp1/e2;->s()I

    move-result v7

    iget-object v8, p0, Lp1/q;->M:Lq1/b;

    invoke-virtual {v8, v6, v7}, Lq1/b;->e(II)V

    iget-object v6, p0, Lp1/q;->s:Ljava/util/ArrayList;

    iget v7, v0, Lp1/e2;->g:I

    invoke-static {v4, v7, v6}, Lp1/r;->a(IILjava/util/List;)V

    :goto_1
    iget v4, v0, Lp1/e2;->k:I

    add-int/2addr v4, v3

    iput v4, v0, Lp1/e2;->k:I

    iput-boolean v3, p0, Lp1/q;->S:Z

    iput-object v2, p0, Lp1/q;->K:Lp1/p1;

    iget-object v0, p0, Lp1/q;->I:Lp1/i2;

    iget-boolean v0, v0, Lp1/i2;->w:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Lp1/q;->H:Lp1/f2;

    invoke-virtual {v0}, Lp1/f2;->e()Lp1/i2;

    move-result-object v0

    iput-object v0, p0, Lp1/q;->I:Lp1/i2;

    invoke-virtual {v0}, Lp1/i2;->L()V

    iput-boolean v1, p0, Lp1/q;->J:Z

    iput-object v2, p0, Lp1/q;->K:Lp1/p1;

    :cond_7
    iget-object v0, p0, Lp1/q;->I:Lp1/i2;

    invoke-virtual {v0}, Lp1/i2;->d()V

    iget v3, v0, Lp1/i2;->t:I

    invoke-virtual {v0, v5, v5, v1, p1}, Lp1/i2;->P(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-virtual {v0, v3}, Lp1/i2;->b(I)Lp1/a;

    move-result-object p1

    iput-object p1, p0, Lp1/q;->N:Lp1/a;

    invoke-virtual {p0, v1, v2}, Lp1/q;->y(ZLp1/o1;)V

    return-void
.end method

.method public final f(J)Z
    .locals 2

    invoke-virtual {p0}, Lp1/q;->J()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Long;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp1/q;->q0(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final f0(I)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v0, v1}, Lp1/q;->Y(Ljava/lang/Object;ILjava/lang/Object;I)V

    return-void
.end method

.method public final g(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, Lp1/q;->J()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lp1/q;->q0(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final g0(I)Lp1/q;
    .locals 6

    invoke-virtual {p0, p1}, Lp1/q;->e0(I)V

    iget-boolean p1, p0, Lp1/q;->S:Z

    iget-object v0, p0, Lp1/q;->g:Lbu/c;

    iget-object v1, p0, Lp1/q;->E:Ljava/util/ArrayList;

    iget-object v2, p0, Lp1/q;->h:Lp1/w;

    if-eqz p1, :cond_0

    new-instance p1, Lp1/v1;

    invoke-direct {p1, v2}, Lp1/v1;-><init>(Lp1/w;)V

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p1}, Lp1/q;->q0(Ljava/lang/Object;)V

    iget v1, p0, Lp1/q;->B:I

    iput v1, p1, Lp1/v1;->e:I

    iget v1, p1, Lp1/v1;->b:I

    and-int/lit8 v1, v1, -0x11

    iput v1, p1, Lp1/v1;->b:I

    invoke-virtual {v0}, Lbu/c;->A()V

    return-object p0

    :cond_0
    iget-object p1, p0, Lp1/q;->G:Lp1/e2;

    iget p1, p1, Lp1/e2;->i:I

    iget-object v3, p0, Lp1/q;->s:Ljava/util/ArrayList;

    invoke-static {p1, v3}, Lp1/r;->e(ILjava/util/List;)I

    move-result p1

    if-ltz p1, :cond_1

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/o0;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iget-object v3, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v3}, Lp1/e2;->m()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    new-instance v3, Lp1/v1;

    invoke-direct {v3, v2}, Lp1/v1;-><init>(Lp1/w;)V

    invoke-virtual {p0, v3}, Lp1/q;->q0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lp1/v1;

    :goto_1
    const/4 v2, 0x0

    const/4 v4, 0x1

    if-nez p1, :cond_6

    iget p1, v3, Lp1/v1;->b:I

    and-int/lit8 v5, p1, 0x40

    if-eqz v5, :cond_3

    move v5, v4

    goto :goto_2

    :cond_3
    move v5, v2

    :goto_2
    if-eqz v5, :cond_4

    and-int/lit8 p1, p1, -0x41

    iput p1, v3, Lp1/v1;->b:I

    :cond_4
    if-eqz v5, :cond_5

    goto :goto_3

    :cond_5
    move p1, v2

    goto :goto_4

    :cond_6
    :goto_3
    move p1, v4

    :goto_4
    iget v5, v3, Lp1/v1;->b:I

    if-eqz p1, :cond_7

    or-int/lit8 p1, v5, 0x8

    goto :goto_5

    :cond_7
    and-int/lit8 p1, v5, -0x9

    :goto_5
    iput p1, v3, Lp1/v1;->b:I

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget p1, p0, Lp1/q;->B:I

    iput p1, v3, Lp1/v1;->e:I

    iget p1, v3, Lp1/v1;->b:I

    and-int/lit8 p1, p1, -0x11

    iput p1, v3, Lp1/v1;->b:I

    invoke-virtual {v0}, Lbu/c;->A()V

    iget p1, v3, Lp1/v1;->b:I

    and-int/lit16 v0, p1, 0x100

    if-eqz v0, :cond_8

    and-int/lit16 p1, p1, -0x101

    or-int/lit16 p1, p1, 0x200

    iput p1, v3, Lp1/v1;->b:I

    iget-object p1, p0, Lp1/q;->M:Lq1/b;

    iget-object p1, p1, Lq1/b;->b:Lq1/a;

    iget-object p1, p1, Lq1/a;->a:Lq1/l0;

    sget-object v0, Lq1/d0;->d:Lq1/d0;

    invoke-virtual {p1, v0}, Lq1/l0;->g0(Lq1/j0;)V

    invoke-static {p1, v2, v3}, Landroidx/room/c1;->O(Lq1/l0;ILjava/lang/Object;)V

    iget-boolean p1, p0, Lp1/q;->y:Z

    if-nez p1, :cond_8

    iget p1, v3, Lp1/v1;->b:I

    and-int/lit16 v0, p1, 0x80

    if-eqz v0, :cond_8

    iput-boolean v4, p0, Lp1/q;->y:Z

    or-int/lit16 p1, p1, 0x400

    iput p1, v3, Lp1/v1;->b:I

    :cond_8
    return-object p0
.end method

.method public final h(Z)Z
    .locals 2

    invoke-virtual {p0}, Lp1/q;->J()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp1/q;->q0(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final h0(Ljava/lang/Object;)V
    .locals 3

    iget-boolean v0, p0, Lp1/q;->S:Z

    const/16 v1, 0xcf

    if-nez v0, :cond_0

    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v0}, Lp1/e2;->g()I

    move-result v0

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v0}, Lp1/e2;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lp1/q;->z:I

    if-gez v0, :cond_0

    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    iget v0, v0, Lp1/e2;->g:I

    iput v0, p0, Lp1/q;->z:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lp1/q;->y:Z

    :cond_0
    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, p1, v2}, Lp1/q;->Y(Ljava/lang/Object;ILjava/lang/Object;I)V

    return-void
.end method

.method public final i(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, Lp1/q;->J()Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p1, :cond_0

    invoke-virtual {p0, p1}, Lp1/q;->q0(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final i0()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/16 v2, 0x7d

    invoke-virtual {p0, v0, v2, v0, v1}, Lp1/q;->Y(Ljava/lang/Object;ILjava/lang/Object;I)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lp1/q;->r:Z

    return-void
.end method

.method public final j()V
    .locals 4

    const/4 v0, 0x0

    iput-object v0, p0, Lp1/q;->j:Lp1/o1;

    const/4 v1, 0x0

    iput v1, p0, Lp1/q;->k:I

    iput v1, p0, Lp1/q;->l:I

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lp1/q;->T:J

    iput-boolean v1, p0, Lp1/q;->r:Z

    iget-object v2, p0, Lp1/q;->M:Lq1/b;

    iput-boolean v1, v2, Lq1/b;->c:Z

    iget-object v3, v2, Lq1/b;->d:La3/x;

    iput v1, v3, La3/x;->b:I

    iput v1, v2, Lq1/b;->f:I

    const/4 v3, 0x1

    iput-boolean v3, v2, Lq1/b;->e:Z

    iput v1, v2, Lq1/b;->g:I

    iget-object v3, v2, Lq1/b;->h:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    const/4 v3, -0x1

    iput v3, v2, Lq1/b;->i:I

    iput v3, v2, Lq1/b;->j:I

    iput v3, v2, Lq1/b;->k:I

    iput v1, v2, Lq1/b;->l:I

    iget-object v1, p0, Lp1/q;->E:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iput-object v0, p0, Lp1/q;->o:[I

    iput-object v0, p0, Lp1/q;->p:La0/e0;

    return-void
.end method

.method public final j0()V
    .locals 7

    const/4 v0, 0x0

    iput v0, p0, Lp1/q;->m:I

    iget-object v1, p0, Lp1/q;->c:Lp1/f2;

    invoke-virtual {v1}, Lp1/f2;->d()Lp1/e2;

    move-result-object v1

    iput-object v1, p0, Lp1/q;->G:Lp1/e2;

    const/4 v1, 0x0

    const/16 v2, 0x64

    invoke-virtual {p0, v1, v2, v1, v0}, Lp1/q;->Y(Ljava/lang/Object;ILjava/lang/Object;I)V

    iget-object v2, p0, Lp1/q;->b:Lp1/t;

    invoke-virtual {v2}, Lp1/t;->r()V

    invoke-virtual {v2}, Lp1/t;->i()Lp1/p1;

    move-result-object v3

    iget-object v4, p0, Lp1/q;->x:La3/x;

    iget-boolean v5, p0, Lp1/q;->w:Z

    invoke-virtual {v4, v5}, La3/x;->c(I)V

    invoke-virtual {p0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    iput-boolean v4, p0, Lp1/q;->w:Z

    iput-object v1, p0, Lp1/q;->K:Lp1/p1;

    iget-boolean v4, p0, Lp1/q;->q:Z

    if-nez v4, :cond_0

    invoke-virtual {v2}, Lp1/t;->e()Z

    move-result v4

    iput-boolean v4, p0, Lp1/q;->q:Z

    :cond_0
    iget-boolean v4, p0, Lp1/q;->C:Z

    if-nez v4, :cond_1

    invoke-virtual {v2}, Lp1/t;->f()Z

    move-result v4

    iput-boolean v4, p0, Lp1/q;->C:Z

    :cond_1
    iget-boolean v4, p0, Lp1/q;->C:Z

    if-eqz v4, :cond_2

    sget-object v4, La2/e;->a:Lp1/u2;

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lp1/v2;

    invoke-virtual {p0}, Lp1/q;->D()La2/c;

    move-result-object v6

    invoke-direct {v5, v6}, Lp1/v2;-><init>(Ljava/lang/Object;)V

    check-cast v3, Lx1/g;

    invoke-virtual {v3, v4, v5}, Lx1/g;->c(Lp1/t1;Lp1/w2;)Lx1/g;

    move-result-object v3

    :cond_2
    iput-object v3, p0, Lp1/q;->u:Lp1/p1;

    sget-object v4, La2/f;->a:Lp1/u2;

    invoke-static {v3, v4}, Lp1/x;->D(Lp1/p1;Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Set;

    if-eqz v3, :cond_4

    iget-object v4, p0, Lp1/q;->U:Lp1/v;

    if-nez v4, :cond_3

    new-instance v4, Lp1/v;

    iget-object v5, p0, Lp1/q;->h:Lp1/w;

    invoke-direct {v4, v5}, Lp1/v;-><init>(Lp1/s;)V

    iput-object v4, p0, Lp1/q;->U:Lp1/v;

    :cond_3
    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v3}, Lp1/t;->n(Ljava/util/Set;)V

    :cond_4
    invoke-virtual {v2}, Lp1/t;->g()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {p0, v1, v2, v1, v0}, Lp1/q;->Y(Ljava/lang/Object;ILjava/lang/Object;I)V

    return-void
.end method

.method public final k(Lp1/t1;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lp1/q;->m()Lp1/p1;

    move-result-object v0

    invoke-static {v0, p1}, Lp1/x;->D(Lp1/p1;Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k0(Lp1/v1;Ljava/lang/Object;)Z
    .locals 6

    iget-object v0, p1, Lp1/v1;->c:Lp1/a;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lp1/q;->G:Lp1/e2;

    iget-object v1, v1, Lp1/e2;->a:Lp1/f2;

    invoke-virtual {v1, v0}, Lp1/f2;->a(Lp1/a;)I

    move-result v0

    iget-boolean v1, p0, Lp1/q;->F:Z

    if-eqz v1, :cond_6

    iget-object v1, p0, Lp1/q;->G:Lp1/e2;

    iget v1, v1, Lp1/e2;->g:I

    if-lt v0, v1, :cond_6

    iget-object v1, p0, Lp1/q;->s:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lp1/r;->e(ILjava/util/List;)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-gez v2, :cond_2

    add-int/2addr v2, v3

    neg-int v2, v2

    instance-of v5, p2, Lp1/f0;

    if-eqz v5, :cond_1

    goto :goto_0

    :cond_1
    move-object p2, v4

    :goto_0
    new-instance v4, Lp1/o0;

    invoke-direct {v4, p1, v0, p2}, Lp1/o0;-><init>(Lp1/v1;ILjava/lang/Object;)V

    invoke-virtual {v1, v2, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return v3

    :cond_2
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/o0;

    instance-of v0, p2, Lp1/f0;

    if-eqz v0, :cond_5

    iget-object v0, p1, Lp1/o0;->c:Ljava/lang/Object;

    if-nez v0, :cond_3

    iput-object p2, p1, Lp1/o0;->c:Ljava/lang/Object;

    return v3

    :cond_3
    instance-of v1, v0, La0/w0;

    if-eqz v1, :cond_4

    check-cast v0, La0/w0;

    invoke-virtual {v0, p2}, La0/w0;->a(Ljava/lang/Object;)Z

    return v3

    :cond_4
    sget-object v1, La0/e1;->a:La0/w0;

    new-instance v1, La0/w0;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, La0/w0;-><init>(I)V

    invoke-virtual {v1, v0}, La0/w0;->k(Ljava/lang/Object;)V

    invoke-virtual {v1, p2}, La0/w0;->k(Ljava/lang/Object;)V

    iput-object v1, p1, Lp1/o0;->c:Ljava/lang/Object;

    return v3

    :cond_5
    iput-object v4, p1, Lp1/o0;->c:Ljava/lang/Object;

    return v3

    :cond_6
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final l(Lc93/a;)V
    .locals 9

    iget-boolean v0, p0, Lp1/q;->r:Z

    if-nez v0, :cond_0

    const-string v0, "A call to createNode(), emitNode() or useNode() expected was not expected"

    invoke-static {v0}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lp1/q;->r:Z

    iget-boolean v1, p0, Lp1/q;->S:Z

    if-nez v1, :cond_1

    const-string v1, "createNode() can only be called when inserting"

    invoke-static {v1}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_1
    iget-object v1, p0, Lp1/q;->n:La3/x;

    iget-object v2, v1, La3/x;->a:[I

    iget v1, v1, La3/x;->b:I

    const/4 v3, 0x1

    sub-int/2addr v1, v3

    aget v1, v2, v1

    iget-object v2, p0, Lp1/q;->I:Lp1/i2;

    iget v4, v2, Lp1/i2;->v:I

    invoke-virtual {v2, v4}, Lp1/i2;->b(I)Lp1/a;

    move-result-object v2

    iget v4, p0, Lp1/q;->l:I

    add-int/2addr v4, v3

    iput v4, p0, Lp1/q;->l:I

    iget-object v4, p0, Lp1/q;->O:Lq1/c;

    iget-object v5, v4, Lq1/c;->a:Lq1/l0;

    sget-object v6, Lq1/r;->e:Lq1/r;

    invoke-virtual {v5, v6}, Lq1/l0;->g0(Lq1/j0;)V

    invoke-static {v5, v0, p1}, Landroidx/room/c1;->O(Lq1/l0;ILjava/lang/Object;)V

    iget-object p1, v5, Lq1/l0;->c:[I

    iget v6, v5, Lq1/l0;->d:I

    iget-object v7, v5, Lq1/l0;->a:[Lq1/j0;

    iget v8, v5, Lq1/l0;->b:I

    sub-int/2addr v8, v3

    aget-object v7, v7, v8

    iget v7, v7, Lq1/j0;->b:I

    sub-int/2addr v6, v7

    aput v1, p1, v6

    invoke-static {v5, v3, v2}, Landroidx/room/c1;->O(Lq1/l0;ILjava/lang/Object;)V

    iget-object p1, v4, Lq1/c;->b:Lq1/l0;

    sget-object v4, Lq1/r;->f:Lq1/r;

    invoke-virtual {p1, v4}, Lq1/l0;->g0(Lq1/j0;)V

    iget-object v4, p1, Lq1/l0;->c:[I

    iget v5, p1, Lq1/l0;->d:I

    iget-object v6, p1, Lq1/l0;->a:[Lq1/j0;

    iget v7, p1, Lq1/l0;->b:I

    sub-int/2addr v7, v3

    aget-object v3, v6, v7

    iget v3, v3, Lq1/j0;->b:I

    sub-int/2addr v5, v3

    aput v1, v4, v5

    invoke-static {p1, v0, v2}, Landroidx/room/c1;->O(Lq1/l0;ILjava/lang/Object;)V

    return-void
.end method

.method public final l0(La0/v0;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lp1/q;->s:Ljava/util/ArrayList;

    invoke-static {v2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v3

    :goto_0
    const/4 v4, -0x1

    if-ge v4, v3, :cond_2

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp1/o0;

    iget-object v5, v4, Lp1/o0;->a:Lp1/v1;

    iget-object v5, v5, Lp1/v1;->c:Lp1/a;

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lp1/a;->a()Z

    move-result v6

    if-eqz v6, :cond_0

    iget v6, v4, Lp1/o0;->b:I

    iget v5, v5, Lp1/a;->a:I

    if-eq v6, v5, :cond_1

    iput v5, v4, Lp1/o0;->b:I

    goto :goto_1

    :cond_0
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_2
    iget-object v3, v1, La0/v0;->b:[Ljava/lang/Object;

    iget-object v4, v1, La0/v0;->c:[Ljava/lang/Object;

    iget-object v1, v1, La0/v0;->a:[J

    array-length v5, v1

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_7

    const/4 v7, 0x0

    :goto_2
    aget-wide v8, v1, v7

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_6

    sub-int v10, v7, v5

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    const/4 v12, 0x0

    :goto_3
    if-ge v12, v10, :cond_5

    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    const-wide/16 v15, 0x80

    cmp-long v13, v13, v15

    if-gez v13, :cond_4

    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    aget-object v14, v3, v13

    aget-object v13, v4, v13

    const-string v15, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v14, Lp1/v1;

    iget-object v15, v14, Lp1/v1;->c:Lp1/a;

    if-eqz v15, :cond_4

    iget v15, v15, Lp1/a;->a:I

    sget-object v6, Lp1/v0;->E:Lp1/v0;

    if-ne v13, v6, :cond_3

    const/4 v13, 0x0

    :cond_3
    new-instance v6, Lp1/o0;

    invoke-direct {v6, v14, v15, v13}, Lp1/o0;-><init>(Lp1/v1;ILjava/lang/Object;)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    shr-long/2addr v8, v11

    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    :cond_5
    if-ne v10, v11, :cond_7

    :cond_6
    if-eq v7, v5, :cond_7

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_7
    sget-object v1, Lp1/r;->f:La3/e0;

    invoke-static {v2, v1}, Lm83/w;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method

.method public final m()Lp1/p1;
    .locals 7

    iget-object v0, p0, Lp1/q;->K:Lp1/p1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    iget v0, v0, Lp1/e2;->i:I

    iget-boolean v1, p0, Lp1/q;->S:Z

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"

    sget-object v3, Lp1/r;->c:Lp1/e1;

    const/16 v4, 0xca

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lp1/q;->J:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lp1/q;->I:Lp1/i2;

    iget v1, v1, Lp1/i2;->v:I

    :goto_0
    if-lez v1, :cond_2

    iget-object v5, p0, Lp1/q;->I:Lp1/i2;

    iget-object v6, v5, Lp1/i2;->b:[I

    invoke-virtual {v5, v1}, Lp1/i2;->r(I)I

    move-result v5

    mul-int/lit8 v5, v5, 0x5

    aget v5, v6, v5

    if-ne v5, v4, :cond_1

    iget-object v5, p0, Lp1/q;->I:Lp1/i2;

    invoke-virtual {v5, v1}, Lp1/i2;->s(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v0, p0, Lp1/q;->I:Lp1/i2;

    invoke-virtual {v0, v1}, Lp1/i2;->q(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lp1/p1;

    iput-object v0, p0, Lp1/q;->K:Lp1/p1;

    return-object v0

    :cond_1
    iget-object v5, p0, Lp1/q;->I:Lp1/i2;

    iget-object v6, v5, Lp1/i2;->b:[I

    invoke-virtual {v5, v6, v1}, Lp1/i2;->D([II)I

    move-result v1

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lp1/q;->G:Lp1/e2;

    iget v1, v1, Lp1/e2;->c:I

    if-lez v1, :cond_6

    :goto_1
    if-lez v0, :cond_6

    iget-object v1, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v1, v0}, Lp1/e2;->i(I)I

    move-result v1

    if-ne v1, v4, :cond_5

    iget-object v1, p0, Lp1/q;->G:Lp1/e2;

    iget-object v5, v1, Lp1/e2;->b:[I

    invoke-virtual {v1, v5, v0}, Lp1/e2;->p([II)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lp1/q;->v:La0/g0;

    if-eqz v1, :cond_3

    invoke-virtual {v1, v0}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp1/p1;

    if-nez v1, :cond_4

    :cond_3
    iget-object v1, p0, Lp1/q;->G:Lp1/e2;

    iget-object v3, v1, Lp1/e2;->b:[I

    invoke-virtual {v1, v3, v0}, Lp1/e2;->b([II)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, Lp1/p1;

    :cond_4
    iput-object v1, p0, Lp1/q;->K:Lp1/p1;

    return-object v1

    :cond_5
    iget-object v1, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v1, v0}, Lp1/e2;->q(I)I

    move-result v0

    goto :goto_1

    :cond_6
    iget-object v0, p0, Lp1/q;->u:Lp1/p1;

    iput-object v0, p0, Lp1/q;->K:Lp1/p1;

    return-object v0
.end method

.method public final m0(II)V
    .locals 2

    invoke-virtual {p0, p1}, Lp1/q;->r0(I)I

    move-result v0

    if-eq v0, p2, :cond_3

    if-gez p1, :cond_1

    iget-object v0, p0, Lp1/q;->p:La0/e0;

    if-nez v0, :cond_0

    new-instance v0, La0/e0;

    invoke-direct {v0}, La0/e0;-><init>()V

    iput-object v0, p0, Lp1/q;->p:La0/e0;

    :cond_0
    invoke-virtual {v0, p1, p2}, La0/e0;->f(II)V

    return-void

    :cond_1
    iget-object v0, p0, Lp1/q;->o:[I

    if-nez v0, :cond_2

    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    iget v0, v0, Lp1/e2;->c:I

    new-array v0, v0, [I

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lm83/n;->o0([II)V

    iput-object v0, p0, Lp1/q;->o:[I

    :cond_2
    aput p2, v0, p1

    :cond_3
    return-void
.end method

.method public final n()Ljava/util/List;
    .locals 2

    iget-boolean v0, p0, Lp1/q;->C:Z

    if-nez v0, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lp1/q;->I:Lp1/i2;

    invoke-static {v1}, Lce/w;->u(Lp1/i2;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lp1/q;->G:Lp1/e2;

    invoke-static {v1}, Lce/w;->s(Lp1/e2;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lp1/q;->K()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public final n0(II)V
    .locals 6

    invoke-virtual {p0, p1}, Lp1/q;->r0(I)I

    move-result v0

    if-eq v0, p2, :cond_3

    sub-int/2addr p2, v0

    iget-object v0, p0, Lp1/q;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    const/4 v2, -0x1

    if-eq p1, v2, :cond_3

    invoke-virtual {p0, p1}, Lp1/q;->r0(I)I

    move-result v3

    add-int/2addr v3, p2

    invoke-virtual {p0, p1, v3}, Lp1/q;->m0(II)V

    move v4, v1

    :goto_1
    if-ge v2, v4, :cond_1

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp1/o1;

    if-eqz v5, :cond_0

    invoke-virtual {v5, p1, v3}, Lp1/o1;->a(II)Z

    move-result v5

    if-eqz v5, :cond_0

    add-int/lit8 v4, v4, -0x1

    move v1, v4

    goto :goto_2

    :cond_0
    add-int/lit8 v4, v4, -0x1

    goto :goto_1

    :cond_1
    :goto_2
    if-gez p1, :cond_2

    iget-object p1, p0, Lp1/q;->G:Lp1/e2;

    iget p1, p1, Lp1/e2;->i:I

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v2, p1}, Lp1/e2;->l(I)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v2, p1}, Lp1/e2;->q(I)I

    move-result p1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final o(La0/v0;Lc93/m;)V
    .locals 7

    const-string v0, "Check failed"

    iget-object v1, p0, Lp1/q;->s:Ljava/util/ArrayList;

    iget-boolean v2, p0, Lp1/q;->F:Z

    if-eqz v2, :cond_0

    const-string v2, "Reentrant composition is not supported"

    invoke-static {v2}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_0
    iget-object v2, p0, Lp1/q;->g:Lbu/c;

    invoke-virtual {v2}, Lbu/c;->A()V

    const-string v2, "Compose:recompose"

    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v2

    invoke-virtual {v2}, Lz1/f;->g()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    iput v2, p0, Lp1/q;->B:I

    const/4 v2, 0x0

    iput-object v2, p0, Lp1/q;->v:La0/g0;

    invoke-virtual {p0, p1}, Lp1/q;->l0(La0/v0;)V

    const/4 p1, 0x0

    iput p1, p0, Lp1/q;->k:I

    const/4 v2, 0x1

    iput-boolean v2, p0, Lp1/q;->F:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    invoke-virtual {p0}, Lp1/q;->j0()V

    invoke-virtual {p0}, Lp1/q;->J()Ljava/lang/Object;

    move-result-object v3

    if-eq v3, p2, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p0, p2}, Lp1/q;->q0(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    :goto_0
    iget-object v4, p0, Lp1/q;->D:Lp1/p;

    invoke-static {}, Lp1/x;->q()Lr1/c;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v5, v4}, Lr1/c;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    sget-object v4, Lp1/r;->a:Lp1/e1;

    const/16 v6, 0xc8

    if-eqz p2, :cond_2

    :try_start_3
    invoke-virtual {p0, v6, v4}, Lp1/q;->a0(ILp1/e1;)V

    invoke-static {p0, p2}, Lx1/c;->d(Lp1/q;Lc93/m;)V

    invoke-virtual {p0, p1}, Lp1/q;->q(Z)V

    goto :goto_1

    :catchall_1
    move-exception p2

    goto :goto_2

    :cond_2
    iget-boolean p2, p0, Lp1/q;->w:Z

    if-eqz p2, :cond_3

    if-eqz v3, :cond_3

    sget-object p2, Lp1/l;->a:Lp1/v0;

    invoke-virtual {v3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    invoke-virtual {p0, v6, v4}, Lp1/q;->a0(ILp1/e1;)V

    const/4 p2, 0x2

    invoke-static {p2, v3}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    check-cast v3, Lc93/m;

    invoke-static {p0, v3}, Lx1/c;->d(Lp1/q;Lc93/m;)V

    invoke-virtual {p0, p1}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lp1/q;->V()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_1
    :try_start_4
    iget p2, v5, Lr1/c;->y:I

    sub-int/2addr p2, v2

    invoke-virtual {v5, p2}, Lr1/c;->l(I)Ljava/lang/Object;

    invoke-virtual {p0}, Lp1/q;->w()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iput-boolean p1, p0, Lp1/q;->F:Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p0, Lp1/q;->I:Lp1/i2;

    iget-boolean p1, p1, Lp1/i2;->w:Z

    if-nez p1, :cond_4

    invoke-static {v0}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {p0}, Lp1/q;->z()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :catchall_2
    move-exception p1

    goto :goto_4

    :goto_2
    :try_start_6
    iget v3, v5, Lr1/c;->y:I

    sub-int/2addr v3, v2

    invoke-virtual {v5, v3}, Lr1/c;->l(I)Ljava/lang/Object;

    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_3
    :try_start_7
    new-instance v2, Lm83/p;

    const/4 v3, 0x7

    invoke-direct {v2, p0, v3}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-static {p2, v2}, Ldt/b;->Y(Ljava/lang/Throwable;Lc93/a;)Z

    throw p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    move-exception p2

    :try_start_8
    iput-boolean p1, p0, Lp1/q;->F:Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p0}, Lp1/q;->a()V

    iget-object p1, p0, Lp1/q;->I:Lp1/i2;

    iget-boolean p1, p1, Lp1/i2;->w:Z

    if-nez p1, :cond_5

    invoke-static {v0}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_5
    invoke-virtual {p0}, Lp1/q;->z()V

    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :goto_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public final o0(Lp1/p1;Lx1/g;)Lx1/g;
    .locals 2

    check-cast p1, Lx1/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lx1/f;

    invoke-direct {v0, p1}, Lu1/e;-><init>(Lu1/c;)V

    iput-object p1, v0, Lx1/f;->G:Lx1/g;

    invoke-virtual {v0, p2}, Lu1/e;->putAll(Ljava/util/Map;)V

    invoke-virtual {v0}, Lx1/f;->h()Lx1/g;

    move-result-object p1

    const/16 v0, 0xcc

    sget-object v1, Lp1/r;->d:Lp1/e1;

    invoke-virtual {p0, v0, v1}, Lp1/q;->a0(ILp1/e1;)V

    invoke-virtual {p0}, Lp1/q;->J()Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lp1/q;->q0(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lp1/q;->J()Ljava/lang/Object;

    invoke-virtual {p0, p2}, Lp1/q;->q0(Ljava/lang/Object;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Lp1/q;->q(Z)V

    return-object p1
.end method

.method public final p(II)V
    .locals 1

    if-lez p1, :cond_0

    if-eq p1, p2, :cond_0

    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v0, p1}, Lp1/e2;->q(I)I

    move-result v0

    invoke-virtual {p0, v0, p2}, Lp1/q;->p(II)V

    iget-object p2, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {p2, p1}, Lp1/e2;->l(I)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {p2, p1}, Lp1/e2;->n(I)Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p0, Lp1/q;->M:Lq1/b;

    invoke-virtual {p2}, Lq1/b;->c()V

    iget-object p2, p2, Lq1/b;->h:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final p0(Ljava/lang/Object;)V
    .locals 7

    instance-of v0, p1, Lp1/z1;

    if-eqz v0, :cond_5

    new-instance v0, Lp1/a2;

    move-object v1, p1

    check-cast v1, Lp1/z1;

    iget-boolean v2, p0, Lp1/q;->S:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    iget-object v2, p0, Lp1/q;->I:Lp1/i2;

    iget v4, v2, Lp1/i2;->t:I

    iget v5, v2, Lp1/i2;->v:I

    add-int/lit8 v5, v5, 0x1

    if-le v4, v5, :cond_3

    add-int/lit8 v4, v4, -0x1

    iget-object v3, v2, Lp1/i2;->b:[I

    invoke-virtual {v2, v3, v4}, Lp1/i2;->D([II)I

    move-result v2

    :goto_0
    move v6, v4

    move v4, v2

    move v2, v6

    iget-object v3, p0, Lp1/q;->I:Lp1/i2;

    iget v5, v3, Lp1/i2;->v:I

    if-eq v4, v5, :cond_0

    if-ltz v4, :cond_0

    iget-object v2, v3, Lp1/i2;->b:[I

    invoke-virtual {v3, v2, v4}, Lp1/i2;->D([II)I

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v2}, Lp1/i2;->b(I)Lp1/a;

    move-result-object v3

    goto :goto_2

    :cond_1
    iget-object v2, p0, Lp1/q;->G:Lp1/e2;

    iget v4, v2, Lp1/e2;->g:I

    iget v5, v2, Lp1/e2;->i:I

    add-int/lit8 v5, v5, 0x1

    if-le v4, v5, :cond_3

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v2, v4}, Lp1/e2;->q(I)I

    move-result v2

    :goto_1
    move v6, v4

    move v4, v2

    move v2, v6

    iget-object v3, p0, Lp1/q;->G:Lp1/e2;

    iget v5, v3, Lp1/e2;->i:I

    if-eq v4, v5, :cond_2

    if-ltz v4, :cond_2

    invoke-virtual {v3, v4}, Lp1/e2;->q(I)I

    move-result v2

    goto :goto_1

    :cond_2
    invoke-virtual {v3, v2}, Lp1/e2;->a(I)Lp1/a;

    move-result-object v3

    :cond_3
    :goto_2
    invoke-direct {v0, v1, v3}, Lp1/a2;-><init>(Lp1/z1;Lp1/a;)V

    iget-boolean v1, p0, Lp1/q;->S:Z

    if-eqz v1, :cond_4

    iget-object v1, p0, Lp1/q;->M:Lq1/b;

    iget-object v1, v1, Lq1/b;->b:Lq1/a;

    iget-object v1, v1, Lq1/a;->a:Lq1/l0;

    sget-object v2, Lq1/w;->d:Lq1/w;

    invoke-virtual {v1, v2}, Lq1/l0;->g0(Lq1/j0;)V

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Landroidx/room/c1;->O(Lq1/l0;ILjava/lang/Object;)V

    :cond_4
    iget-object v1, p0, Lp1/q;->d:La0/y0;

    invoke-virtual {v1, p1}, La0/y0;->add(Ljava/lang/Object;)Z

    move-object p1, v0

    :cond_5
    invoke-virtual {p0, p1}, Lp1/q;->q0(Ljava/lang/Object;)V

    return-void
.end method

.method public final q(Z)V
    .locals 42

    move-object/from16 v0, p0

    iget-object v1, v0, Lp1/q;->n:La3/x;

    iget-object v2, v1, La3/x;->a:[I

    iget v3, v1, La3/x;->b:I

    add-int/lit8 v3, v3, -0x2

    aget v2, v2, v3

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    iget-boolean v4, v0, Lp1/q;->S:Z

    sget-object v5, Lp1/l;->a:Lp1/v0;

    const/16 v6, 0xcf

    const/4 v7, 0x0

    const/4 v8, 0x3

    if-eqz v4, :cond_3

    iget-object v4, v0, Lp1/q;->I:Lp1/i2;

    iget v9, v4, Lp1/i2;->v:I

    iget-object v10, v4, Lp1/i2;->b:[I

    invoke-virtual {v4, v9}, Lp1/i2;->r(I)I

    move-result v4

    mul-int/lit8 v4, v4, 0x5

    aget v4, v10, v4

    iget-object v10, v0, Lp1/q;->I:Lp1/i2;

    invoke-virtual {v10, v9}, Lp1/i2;->s(I)Ljava/lang/Object;

    move-result-object v10

    iget-object v11, v0, Lp1/q;->I:Lp1/i2;

    invoke-virtual {v11, v9}, Lp1/i2;->q(I)Ljava/lang/Object;

    move-result-object v9

    if-nez v10, :cond_1

    if-eqz v9, :cond_0

    if-ne v4, v6, :cond_0

    invoke-virtual {v9, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v9}, Ljava/lang/Object;->hashCode()I

    move-result v4

    iget-wide v5, v0, Lp1/q;->T:J

    int-to-long v9, v2

    xor-long/2addr v5, v9

    invoke-static {v5, v6, v8}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v5

    int-to-long v9, v4

    xor-long v4, v5, v9

    invoke-static {v4, v5, v8}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v4

    iput-wide v4, v0, Lp1/q;->T:J

    goto/16 :goto_4

    :cond_0
    iget-wide v5, v0, Lp1/q;->T:J

    int-to-long v9, v2

    xor-long/2addr v5, v9

    invoke-static {v5, v6, v8}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v5

    int-to-long v9, v4

    xor-long v4, v5, v9

    :goto_0
    invoke-static {v4, v5, v8}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v4

    iput-wide v4, v0, Lp1/q;->T:J

    goto/16 :goto_4

    :cond_1
    instance-of v2, v10, Ljava/lang/Enum;

    if-eqz v2, :cond_2

    check-cast v10, Ljava/lang/Enum;

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    :goto_1
    iget-wide v4, v0, Lp1/q;->T:J

    int-to-long v9, v7

    xor-long/2addr v4, v9

    invoke-static {v4, v5, v8}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v4

    int-to-long v9, v2

    xor-long/2addr v4, v9

    goto :goto_0

    :cond_2
    invoke-virtual {v10}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_3
    iget-object v4, v0, Lp1/q;->G:Lp1/e2;

    iget v9, v4, Lp1/e2;->i:I

    invoke-virtual {v4, v9}, Lp1/e2;->i(I)I

    move-result v4

    iget-object v10, v0, Lp1/q;->G:Lp1/e2;

    iget-object v11, v10, Lp1/e2;->b:[I

    invoke-virtual {v10, v11, v9}, Lp1/e2;->p([II)Ljava/lang/Object;

    move-result-object v10

    iget-object v11, v0, Lp1/q;->G:Lp1/e2;

    iget-object v12, v11, Lp1/e2;->b:[I

    invoke-virtual {v11, v12, v9}, Lp1/e2;->b([II)Ljava/lang/Object;

    move-result-object v9

    if-nez v10, :cond_5

    if-eqz v9, :cond_4

    if-ne v4, v6, :cond_4

    invoke-virtual {v9, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-virtual {v9}, Ljava/lang/Object;->hashCode()I

    move-result v4

    iget-wide v5, v0, Lp1/q;->T:J

    int-to-long v9, v2

    xor-long/2addr v5, v9

    invoke-static {v5, v6, v8}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v5

    int-to-long v9, v4

    xor-long v4, v5, v9

    invoke-static {v4, v5, v8}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v4

    iput-wide v4, v0, Lp1/q;->T:J

    goto :goto_4

    :cond_4
    iget-wide v5, v0, Lp1/q;->T:J

    int-to-long v9, v2

    xor-long/2addr v5, v9

    invoke-static {v5, v6, v8}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v5

    int-to-long v9, v4

    xor-long v4, v5, v9

    :goto_2
    invoke-static {v4, v5, v8}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v4

    iput-wide v4, v0, Lp1/q;->T:J

    goto :goto_4

    :cond_5
    instance-of v2, v10, Ljava/lang/Enum;

    if-eqz v2, :cond_6

    check-cast v10, Ljava/lang/Enum;

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    :goto_3
    iget-wide v4, v0, Lp1/q;->T:J

    int-to-long v9, v7

    xor-long/2addr v4, v9

    invoke-static {v4, v5, v8}, Ljava/lang/Long;->rotateRight(JI)J

    move-result-wide v4

    int-to-long v9, v2

    xor-long/2addr v4, v9

    goto :goto_2

    :cond_6
    invoke-virtual {v10}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_3

    :goto_4
    iget v2, v0, Lp1/q;->l:I

    iget-object v4, v0, Lp1/q;->j:Lp1/o1;

    iget-object v5, v0, Lp1/q;->s:Ljava/util/ArrayList;

    iget-object v9, v0, Lp1/q;->M:Lq1/b;

    if-eqz v4, :cond_22

    iget-object v10, v4, Lp1/o1;->e:La0/g0;

    iget v11, v4, Lp1/o1;->b:I

    iget-object v12, v4, Lp1/o1;->a:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v13

    if-lez v13, :cond_22

    iget-object v13, v4, Lp1/o1;->d:Ljava/util/ArrayList;

    new-instance v14, Ljava/util/HashSet;

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/HashSet;-><init>(I)V

    invoke-interface {v13}, Ljava/util/Collection;->size()I

    move-result v15

    move/from16 v16, v8

    move v8, v7

    :goto_5
    if-ge v8, v15, :cond_7

    const/16 v17, -0x1

    invoke-interface {v13, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v14, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_7
    const/16 v17, -0x1

    new-instance v6, Ljava/util/LinkedHashSet;

    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v15

    move v3, v7

    move/from16 v19, v3

    move/from16 v20, v19

    :goto_6
    if-ge v3, v15, :cond_21

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v7, v21

    check-cast v7, Lp1/r0;

    invoke-virtual {v14, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v21

    if-nez v21, :cond_9

    move-object/from16 v21, v1

    iget v1, v7, Lp1/r0;->c:I

    invoke-virtual {v10, v1}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp1/l0;

    if-eqz v1, :cond_8

    iget v1, v1, Lp1/l0;->b:I

    move/from16 v22, v1

    goto :goto_7

    :cond_8
    move/from16 v22, v17

    :goto_7
    iget v1, v7, Lp1/r0;->c:I

    move/from16 v23, v3

    add-int v3, v22, v11

    iget v7, v7, Lp1/r0;->d:I

    invoke-virtual {v9, v3, v7}, Lq1/b;->e(II)V

    const/4 v3, 0x0

    invoke-virtual {v4, v1, v3}, Lp1/o1;->a(II)Z

    iget v3, v9, Lq1/b;->f:I

    iget-object v7, v9, Lq1/b;->a:Lp1/q;

    iget-object v7, v7, Lp1/q;->G:Lp1/e2;

    iget v7, v7, Lp1/e2;->g:I

    sub-int v7, v1, v7

    add-int/2addr v7, v3

    iput v7, v9, Lq1/b;->f:I

    iget-object v3, v0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v3, v1}, Lp1/e2;->r(I)V

    invoke-virtual {v0}, Lp1/q;->O()V

    iget-object v3, v0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v3}, Lp1/e2;->s()I

    iget-object v3, v0, Lp1/q;->G:Lp1/e2;

    iget-object v3, v3, Lp1/e2;->b:[I

    mul-int/lit8 v7, v1, 0x5

    add-int/lit8 v7, v7, 0x3

    aget v3, v3, v7

    add-int/2addr v3, v1

    invoke-static {v1, v3, v5}, Lp1/r;->a(IILjava/util/List;)V

    :goto_8
    add-int/lit8 v3, v23, 0x1

    move-object/from16 v1, v21

    :goto_9
    const/4 v7, 0x0

    goto :goto_6

    :cond_9
    move-object/from16 v21, v1

    move/from16 v23, v3

    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_8

    :cond_a
    move/from16 v1, v19

    if-ge v1, v8, :cond_20

    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp1/r0;

    if-eq v3, v7, :cond_1e

    iget v7, v3, Lp1/r0;->c:I

    invoke-virtual {v10, v7}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lp1/l0;

    if-eqz v7, :cond_b

    iget v7, v7, Lp1/l0;->b:I

    goto :goto_a

    :cond_b
    move/from16 v7, v17

    :goto_a
    invoke-interface {v6, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move/from16 v19, v1

    move/from16 v1, v20

    move-object/from16 v20, v4

    if-eq v7, v1, :cond_1c

    iget v4, v3, Lp1/r0;->c:I

    invoke-virtual {v10, v4}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp1/l0;

    if-eqz v4, :cond_c

    iget v4, v4, Lp1/l0;->c:I

    :goto_b
    move-object/from16 v22, v6

    goto :goto_c

    :cond_c
    iget v4, v3, Lp1/r0;->d:I

    goto :goto_b

    :goto_c
    add-int v6, v7, v11

    move/from16 v24, v8

    add-int v8, v1, v11

    if-lez v4, :cond_f

    move/from16 v25, v11

    iget v11, v9, Lq1/b;->l:I

    if-lez v11, :cond_d

    move/from16 v26, v11

    iget v11, v9, Lq1/b;->j:I

    move-object/from16 v27, v12

    sub-int v12, v6, v26

    if-ne v11, v12, :cond_e

    iget v11, v9, Lq1/b;->k:I

    sub-int v12, v8, v26

    if-ne v11, v12, :cond_e

    add-int v11, v26, v4

    iput v11, v9, Lq1/b;->l:I

    goto :goto_d

    :cond_d
    move-object/from16 v27, v12

    :cond_e
    invoke-virtual {v9}, Lq1/b;->c()V

    iput v6, v9, Lq1/b;->j:I

    iput v8, v9, Lq1/b;->k:I

    iput v4, v9, Lq1/b;->l:I

    goto :goto_d

    :cond_f
    move/from16 v25, v11

    move-object/from16 v27, v12

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_d
    const-wide/16 v28, 0xff

    const-wide v30, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    if-le v7, v1, :cond_16

    const/16 v26, 0x7

    iget-object v6, v10, La0/s;->c:[Ljava/lang/Object;

    const-wide/16 v32, 0x80

    iget-object v11, v10, La0/s;->a:[J

    array-length v12, v11

    add-int/lit8 v12, v12, -0x2

    if-ltz v12, :cond_15

    move-object/from16 v35, v13

    move-object/from16 v36, v14

    const/4 v8, 0x0

    :goto_e
    const/16 v34, 0x8

    aget-wide v13, v11, v8

    move/from16 v38, v4

    move-object/from16 v37, v5

    not-long v4, v13

    shl-long v4, v4, v26

    and-long/2addr v4, v13

    and-long v4, v4, v30

    cmp-long v4, v4, v30

    if-eqz v4, :cond_14

    sub-int v4, v8, v12

    not-int v4, v4

    ushr-int/lit8 v4, v4, 0x1f

    rsub-int/lit8 v4, v4, 0x8

    const/4 v5, 0x0

    :goto_f
    if-ge v5, v4, :cond_13

    and-long v39, v13, v28

    cmp-long v39, v39, v32

    if-gez v39, :cond_11

    shl-int/lit8 v39, v8, 0x3

    add-int v39, v39, v5

    aget-object v39, v6, v39

    move/from16 v40, v5

    move-object/from16 v5, v39

    check-cast v5, Lp1/l0;

    move-object/from16 v39, v6

    iget v6, v5, Lp1/l0;->b:I

    move-object/from16 v41, v11

    if-gt v7, v6, :cond_10

    add-int v11, v7, v38

    if-ge v6, v11, :cond_10

    sub-int/2addr v6, v7

    add-int/2addr v6, v1

    iput v6, v5, Lp1/l0;->b:I

    goto :goto_10

    :cond_10
    if-gt v1, v6, :cond_12

    if-ge v6, v7, :cond_12

    add-int v6, v6, v38

    iput v6, v5, Lp1/l0;->b:I

    goto :goto_10

    :cond_11
    move/from16 v40, v5

    move-object/from16 v39, v6

    move-object/from16 v41, v11

    :cond_12
    :goto_10
    shr-long v13, v13, v34

    add-int/lit8 v5, v40, 0x1

    move-object/from16 v6, v39

    move-object/from16 v11, v41

    goto :goto_f

    :cond_13
    move-object/from16 v39, v6

    move-object/from16 v41, v11

    move/from16 v5, v34

    if-ne v4, v5, :cond_1d

    goto :goto_11

    :cond_14
    move-object/from16 v39, v6

    move-object/from16 v41, v11

    :goto_11
    if-eq v8, v12, :cond_1d

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v5, v37

    move/from16 v4, v38

    move-object/from16 v6, v39

    move-object/from16 v11, v41

    goto :goto_e

    :cond_15
    move-object/from16 v37, v5

    goto/16 :goto_17

    :cond_16
    move/from16 v38, v4

    move-object/from16 v37, v5

    move-object/from16 v35, v13

    move-object/from16 v36, v14

    const/16 v26, 0x7

    const-wide/16 v32, 0x80

    if-le v1, v7, :cond_1d

    iget-object v4, v10, La0/s;->c:[Ljava/lang/Object;

    iget-object v5, v10, La0/s;->a:[J

    array-length v6, v5

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_1d

    const/4 v8, 0x0

    :goto_12
    aget-wide v11, v5, v8

    not-long v13, v11

    shl-long v13, v13, v26

    and-long/2addr v13, v11

    and-long v13, v13, v30

    cmp-long v13, v13, v30

    if-eqz v13, :cond_1b

    sub-int v13, v8, v6

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    const/16 v34, 0x8

    rsub-int/lit8 v13, v13, 0x8

    const/4 v14, 0x0

    :goto_13
    if-ge v14, v13, :cond_1a

    and-long v39, v11, v28

    cmp-long v39, v39, v32

    if-gez v39, :cond_19

    shl-int/lit8 v39, v8, 0x3

    add-int v39, v39, v14

    aget-object v39, v4, v39

    move-object/from16 v40, v4

    move-object/from16 v4, v39

    check-cast v4, Lp1/l0;

    move-object/from16 v39, v5

    iget v5, v4, Lp1/l0;->b:I

    move/from16 v41, v7

    if-gt v7, v5, :cond_17

    add-int v7, v41, v38

    if-ge v5, v7, :cond_17

    sub-int v5, v5, v41

    add-int/2addr v5, v1

    iput v5, v4, Lp1/l0;->b:I

    goto :goto_14

    :cond_17
    add-int/lit8 v7, v41, 0x1

    if-gt v7, v5, :cond_18

    if-ge v5, v1, :cond_18

    sub-int v5, v5, v38

    iput v5, v4, Lp1/l0;->b:I

    :cond_18
    :goto_14
    const/16 v5, 0x8

    goto :goto_15

    :cond_19
    move-object/from16 v40, v4

    move-object/from16 v39, v5

    move/from16 v41, v7

    goto :goto_14

    :goto_15
    shr-long/2addr v11, v5

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v5, v39

    move-object/from16 v4, v40

    move/from16 v7, v41

    goto :goto_13

    :cond_1a
    move-object/from16 v40, v4

    move-object/from16 v39, v5

    move/from16 v41, v7

    const/16 v5, 0x8

    if-ne v13, v5, :cond_1d

    goto :goto_16

    :cond_1b
    move-object/from16 v40, v4

    move-object/from16 v39, v5

    move/from16 v41, v7

    const/16 v5, 0x8

    :goto_16
    if-eq v8, v6, :cond_1d

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v5, v39

    move-object/from16 v4, v40

    move/from16 v7, v41

    goto :goto_12

    :cond_1c
    move-object/from16 v37, v5

    move-object/from16 v22, v6

    move/from16 v24, v8

    move/from16 v25, v11

    move-object/from16 v27, v12

    :goto_17
    move-object/from16 v35, v13

    move-object/from16 v36, v14

    :cond_1d
    move/from16 v4, v23

    goto :goto_18

    :cond_1e
    move/from16 v19, v1

    move-object/from16 v37, v5

    move-object/from16 v22, v6

    move/from16 v24, v8

    move/from16 v25, v11

    move-object/from16 v27, v12

    move-object/from16 v35, v13

    move-object/from16 v36, v14

    move/from16 v1, v20

    move-object/from16 v20, v4

    add-int/lit8 v4, v23, 0x1

    :goto_18
    add-int/lit8 v19, v19, 0x1

    iget v5, v3, Lp1/r0;->c:I

    invoke-virtual {v10, v5}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp1/l0;

    if-eqz v5, :cond_1f

    iget v3, v5, Lp1/l0;->c:I

    goto :goto_19

    :cond_1f
    iget v3, v3, Lp1/r0;->d:I

    :goto_19
    add-int/2addr v1, v3

    move v3, v4

    move-object/from16 v4, v20

    move-object/from16 v6, v22

    move/from16 v8, v24

    move/from16 v11, v25

    move-object/from16 v12, v27

    move-object/from16 v13, v35

    move-object/from16 v14, v36

    move-object/from16 v5, v37

    const/4 v7, 0x0

    move/from16 v20, v1

    move-object/from16 v1, v21

    goto/16 :goto_6

    :cond_20
    move/from16 v19, v1

    move/from16 v1, v20

    move-object/from16 v1, v21

    move/from16 v3, v23

    goto/16 :goto_9

    :cond_21
    move-object/from16 v21, v1

    move-object/from16 v37, v5

    move-object/from16 v27, v12

    invoke-virtual {v9}, Lq1/b;->c()V

    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_23

    iget-object v1, v0, Lp1/q;->G:Lp1/e2;

    iget v3, v1, Lp1/e2;->h:I

    iget v4, v9, Lq1/b;->f:I

    iget-object v5, v9, Lq1/b;->a:Lp1/q;

    iget-object v5, v5, Lp1/q;->G:Lp1/e2;

    iget v5, v5, Lp1/e2;->g:I

    sub-int/2addr v3, v5

    add-int/2addr v3, v4

    iput v3, v9, Lq1/b;->f:I

    invoke-virtual {v1}, Lp1/e2;->t()V

    goto :goto_1a

    :cond_22
    move-object/from16 v21, v1

    move-object/from16 v37, v5

    const/16 v17, -0x1

    :cond_23
    :goto_1a
    iget-boolean v1, v0, Lp1/q;->S:Z

    const/4 v3, -0x2

    if-nez v1, :cond_27

    iget-object v4, v0, Lp1/q;->G:Lp1/e2;

    iget v5, v4, Lp1/e2;->m:I

    iget v4, v4, Lp1/e2;->l:I

    sub-int/2addr v5, v4

    if-lez v5, :cond_27

    if-lez v5, :cond_26

    const/4 v4, 0x0

    invoke-virtual {v9, v4}, Lq1/b;->d(Z)V

    iget-object v4, v9, Lq1/b;->d:La3/x;

    iget-object v6, v9, Lq1/b;->a:Lp1/q;

    iget-object v6, v6, Lp1/q;->G:Lp1/e2;

    iget v7, v6, Lp1/e2;->c:I

    if-lez v7, :cond_25

    iget v7, v6, Lp1/e2;->i:I

    invoke-virtual {v4, v3}, La3/x;->a(I)I

    move-result v8

    if-eq v8, v7, :cond_25

    iget-boolean v8, v9, Lq1/b;->c:Z

    if-nez v8, :cond_24

    iget-boolean v8, v9, Lq1/b;->e:Z

    if-eqz v8, :cond_24

    const/4 v8, 0x0

    invoke-virtual {v9, v8}, Lq1/b;->d(Z)V

    iget-object v8, v9, Lq1/b;->b:Lq1/a;

    iget-object v8, v8, Lq1/a;->a:Lq1/l0;

    sget-object v10, Lq1/q;->d:Lq1/q;

    invoke-virtual {v8, v10}, Lq1/l0;->g0(Lq1/j0;)V

    const/4 v8, 0x1

    iput-boolean v8, v9, Lq1/b;->c:Z

    :cond_24
    if-lez v7, :cond_25

    invoke-virtual {v6, v7}, Lp1/e2;->a(I)Lp1/a;

    move-result-object v6

    invoke-virtual {v4, v7}, La3/x;->c(I)V

    const/4 v4, 0x0

    invoke-virtual {v9, v4}, Lq1/b;->d(Z)V

    iget-object v7, v9, Lq1/b;->b:Lq1/a;

    iget-object v7, v7, Lq1/a;->a:Lq1/l0;

    sget-object v8, Lq1/p;->d:Lq1/p;

    invoke-virtual {v7, v8}, Lq1/l0;->g0(Lq1/j0;)V

    invoke-static {v7, v4, v6}, Landroidx/room/c1;->O(Lq1/l0;ILjava/lang/Object;)V

    const/4 v8, 0x1

    iput-boolean v8, v9, Lq1/b;->c:Z

    :cond_25
    iget-object v4, v9, Lq1/b;->b:Lq1/a;

    iget-object v4, v4, Lq1/a;->a:Lq1/l0;

    sget-object v6, Lq1/e0;->d:Lq1/e0;

    invoke-virtual {v4, v6}, Lq1/l0;->g0(Lq1/j0;)V

    iget-object v6, v4, Lq1/l0;->c:[I

    iget v7, v4, Lq1/l0;->d:I

    iget-object v8, v4, Lq1/l0;->a:[Lq1/j0;

    iget v4, v4, Lq1/l0;->b:I

    const/16 v18, 0x1

    add-int/lit8 v4, v4, -0x1

    aget-object v4, v8, v4

    iget v4, v4, Lq1/j0;->b:I

    sub-int/2addr v7, v4

    aput v5, v6, v7

    goto :goto_1b

    :cond_26
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_27
    :goto_1b
    iget v4, v0, Lp1/q;->k:I

    :goto_1c
    iget-object v5, v0, Lp1/q;->G:Lp1/e2;

    iget v6, v5, Lp1/e2;->k:I

    if-lez v6, :cond_28

    goto :goto_1d

    :cond_28
    iget v6, v5, Lp1/e2;->g:I

    iget v5, v5, Lp1/e2;->h:I

    if-ne v6, v5, :cond_3a

    :goto_1d
    if-eqz v1, :cond_33

    if-eqz p1, :cond_2a

    iget-object v2, v0, Lp1/q;->O:Lq1/c;

    iget-object v4, v2, Lq1/c;->b:Lq1/l0;

    invoke-virtual {v4}, Lq1/l0;->f0()Z

    move-result v5

    if-nez v5, :cond_29

    const-string v5, "Cannot end node insertion, there are no pending operations that can be realized."

    invoke-static {v5}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_29
    iget-object v2, v2, Lq1/c;->a:Lq1/l0;

    iget-object v5, v4, Lq1/l0;->a:[Lq1/j0;

    iget v6, v4, Lq1/l0;->b:I

    add-int/lit8 v6, v6, -0x1

    iput v6, v4, Lq1/l0;->b:I

    aget-object v7, v5, v6

    const/4 v8, 0x0

    aput-object v8, v5, v6

    invoke-virtual {v2, v7}, Lq1/l0;->g0(Lq1/j0;)V

    iget-object v5, v4, Lq1/l0;->e:[Ljava/lang/Object;

    iget-object v6, v2, Lq1/l0;->e:[Ljava/lang/Object;

    iget v10, v2, Lq1/l0;->f:I

    iget v11, v7, Lq1/j0;->c:I

    sub-int/2addr v10, v11

    iget v12, v4, Lq1/l0;->f:I

    sub-int v13, v12, v11

    sub-int/2addr v12, v13

    invoke-static {v5, v13, v6, v10, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v5, v4, Lq1/l0;->e:[Ljava/lang/Object;

    iget v6, v4, Lq1/l0;->f:I

    sub-int v10, v6, v11

    invoke-static {v5, v10, v6, v8}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    iget-object v5, v4, Lq1/l0;->c:[I

    iget-object v6, v2, Lq1/l0;->c:[I

    iget v2, v2, Lq1/l0;->d:I

    iget v7, v7, Lq1/j0;->b:I

    sub-int/2addr v2, v7

    iget v8, v4, Lq1/l0;->d:I

    sub-int v10, v8, v7

    invoke-static {v2, v10, v5, v6, v8}, Lm83/n;->e0(II[I[II)V

    iget v2, v4, Lq1/l0;->f:I

    sub-int/2addr v2, v11

    iput v2, v4, Lq1/l0;->f:I

    iget v2, v4, Lq1/l0;->d:I

    sub-int/2addr v2, v7

    iput v2, v4, Lq1/l0;->d:I

    const/4 v2, 0x1

    :cond_2a
    iget-object v4, v0, Lp1/q;->G:Lp1/e2;

    iget v5, v4, Lp1/e2;->k:I

    if-lez v5, :cond_2b

    goto :goto_1e

    :cond_2b
    const-string v5, "Unbalanced begin/end empty"

    invoke-static {v5}, Lp1/q1;->a(Ljava/lang/String;)V

    :goto_1e
    iget v5, v4, Lp1/e2;->k:I

    add-int/lit8 v5, v5, -0x1

    iput v5, v4, Lp1/e2;->k:I

    iget-object v4, v0, Lp1/q;->I:Lp1/i2;

    iget v5, v4, Lp1/i2;->v:I

    invoke-virtual {v4}, Lp1/i2;->j()V

    iget-object v4, v0, Lp1/q;->G:Lp1/e2;

    iget v4, v4, Lp1/e2;->k:I

    if-lez v4, :cond_2c

    goto/16 :goto_22

    :cond_2c
    rsub-int/lit8 v4, v5, -0x2

    iget-object v5, v0, Lp1/q;->I:Lp1/i2;

    invoke-virtual {v5}, Lp1/i2;->k()V

    iget-object v5, v0, Lp1/q;->I:Lp1/i2;

    const/4 v8, 0x1

    invoke-virtual {v5, v8}, Lp1/i2;->e(Z)V

    iget-object v5, v0, Lp1/q;->N:Lp1/a;

    iget-object v6, v0, Lp1/q;->O:Lq1/c;

    iget-object v6, v6, Lq1/c;->a:Lq1/l0;

    invoke-virtual {v6}, Lq1/l0;->e0()Z

    move-result v6

    if-eqz v6, :cond_2f

    iget-object v6, v0, Lp1/q;->H:Lp1/f2;

    invoke-virtual {v9}, Lq1/b;->b()V

    const/4 v8, 0x0

    invoke-virtual {v9, v8}, Lq1/b;->d(Z)V

    iget-object v7, v9, Lq1/b;->d:La3/x;

    iget-object v8, v9, Lq1/b;->a:Lp1/q;

    iget-object v8, v8, Lp1/q;->G:Lp1/e2;

    iget v10, v8, Lp1/e2;->c:I

    if-lez v10, :cond_2e

    iget v10, v8, Lp1/e2;->i:I

    invoke-virtual {v7, v3}, La3/x;->a(I)I

    move-result v3

    if-eq v3, v10, :cond_2e

    iget-boolean v3, v9, Lq1/b;->c:Z

    if-nez v3, :cond_2d

    iget-boolean v3, v9, Lq1/b;->e:Z

    if-eqz v3, :cond_2d

    const/4 v3, 0x0

    invoke-virtual {v9, v3}, Lq1/b;->d(Z)V

    iget-object v3, v9, Lq1/b;->b:Lq1/a;

    iget-object v3, v3, Lq1/a;->a:Lq1/l0;

    sget-object v11, Lq1/q;->d:Lq1/q;

    invoke-virtual {v3, v11}, Lq1/l0;->g0(Lq1/j0;)V

    const/4 v3, 0x1

    iput-boolean v3, v9, Lq1/b;->c:Z

    :cond_2d
    if-lez v10, :cond_2e

    invoke-virtual {v8, v10}, Lp1/e2;->a(I)Lp1/a;

    move-result-object v3

    invoke-virtual {v7, v10}, La3/x;->c(I)V

    const/4 v8, 0x0

    invoke-virtual {v9, v8}, Lq1/b;->d(Z)V

    iget-object v7, v9, Lq1/b;->b:Lq1/a;

    iget-object v7, v7, Lq1/a;->a:Lq1/l0;

    sget-object v10, Lq1/p;->d:Lq1/p;

    invoke-virtual {v7, v10}, Lq1/l0;->g0(Lq1/j0;)V

    invoke-static {v7, v8, v3}, Landroidx/room/c1;->O(Lq1/l0;ILjava/lang/Object;)V

    const/4 v8, 0x1

    iput-boolean v8, v9, Lq1/b;->c:Z

    goto :goto_1f

    :cond_2e
    const/4 v8, 0x1

    :goto_1f
    invoke-virtual {v9}, Lq1/b;->c()V

    iget-object v3, v9, Lq1/b;->b:Lq1/a;

    iget-object v3, v3, Lq1/a;->a:Lq1/l0;

    sget-object v7, Lq1/s;->d:Lq1/s;

    invoke-virtual {v3, v7}, Lq1/l0;->g0(Lq1/j0;)V

    const/4 v7, 0x0

    invoke-static {v3, v7, v5, v8, v6}, Landroidx/room/c1;->P(Lq1/l0;ILjava/lang/Object;ILjava/lang/Object;)V

    move v3, v7

    goto/16 :goto_20

    :cond_2f
    const/4 v7, 0x0

    iget-object v6, v0, Lp1/q;->H:Lp1/f2;

    iget-object v8, v0, Lp1/q;->O:Lq1/c;

    invoke-virtual {v9}, Lq1/b;->b()V

    invoke-virtual {v9, v7}, Lq1/b;->d(Z)V

    iget-object v7, v9, Lq1/b;->d:La3/x;

    iget-object v10, v9, Lq1/b;->a:Lp1/q;

    iget-object v10, v10, Lp1/q;->G:Lp1/e2;

    iget v11, v10, Lp1/e2;->c:I

    if-lez v11, :cond_31

    iget v11, v10, Lp1/e2;->i:I

    invoke-virtual {v7, v3}, La3/x;->a(I)I

    move-result v3

    if-eq v3, v11, :cond_31

    iget-boolean v3, v9, Lq1/b;->c:Z

    if-nez v3, :cond_30

    iget-boolean v3, v9, Lq1/b;->e:Z

    if-eqz v3, :cond_30

    const/4 v3, 0x0

    invoke-virtual {v9, v3}, Lq1/b;->d(Z)V

    iget-object v3, v9, Lq1/b;->b:Lq1/a;

    iget-object v3, v3, Lq1/a;->a:Lq1/l0;

    sget-object v12, Lq1/q;->d:Lq1/q;

    invoke-virtual {v3, v12}, Lq1/l0;->g0(Lq1/j0;)V

    const/4 v3, 0x1

    iput-boolean v3, v9, Lq1/b;->c:Z

    :cond_30
    if-lez v11, :cond_31

    invoke-virtual {v10, v11}, Lp1/e2;->a(I)Lp1/a;

    move-result-object v3

    invoke-virtual {v7, v11}, La3/x;->c(I)V

    const/4 v7, 0x0

    invoke-virtual {v9, v7}, Lq1/b;->d(Z)V

    iget-object v10, v9, Lq1/b;->b:Lq1/a;

    iget-object v10, v10, Lq1/a;->a:Lq1/l0;

    sget-object v11, Lq1/p;->d:Lq1/p;

    invoke-virtual {v10, v11}, Lq1/l0;->g0(Lq1/j0;)V

    invoke-static {v10, v7, v3}, Landroidx/room/c1;->O(Lq1/l0;ILjava/lang/Object;)V

    const/4 v3, 0x1

    iput-boolean v3, v9, Lq1/b;->c:Z

    :cond_31
    invoke-virtual {v9}, Lq1/b;->c()V

    iget-object v3, v9, Lq1/b;->b:Lq1/a;

    iget-object v3, v3, Lq1/a;->a:Lq1/l0;

    sget-object v7, Lq1/t;->d:Lq1/t;

    invoke-virtual {v3, v7}, Lq1/l0;->g0(Lq1/j0;)V

    iget v7, v3, Lq1/l0;->f:I

    iget-object v9, v3, Lq1/l0;->a:[Lq1/j0;

    iget v10, v3, Lq1/l0;->b:I

    const/16 v18, 0x1

    add-int/lit8 v10, v10, -0x1

    aget-object v9, v9, v10

    iget v9, v9, Lq1/j0;->c:I

    sub-int/2addr v7, v9

    iget-object v3, v3, Lq1/l0;->e:[Ljava/lang/Object;

    aput-object v5, v3, v7

    add-int/lit8 v5, v7, 0x1

    aput-object v6, v3, v5

    add-int/lit8 v7, v7, 0x2

    aput-object v8, v3, v7

    new-instance v3, Lq1/c;

    invoke-direct {v3}, Lq1/c;-><init>()V

    iput-object v3, v0, Lp1/q;->O:Lq1/c;

    const/4 v3, 0x0

    :goto_20
    iput-boolean v3, v0, Lp1/q;->S:Z

    iget-object v5, v0, Lp1/q;->c:Lp1/f2;

    iget v5, v5, Lp1/f2;->x:I

    if-nez v5, :cond_32

    goto :goto_22

    :cond_32
    invoke-virtual {v0, v4, v3}, Lp1/q;->m0(II)V

    invoke-virtual {v0, v4, v2}, Lp1/q;->n0(II)V

    goto :goto_22

    :cond_33
    if-eqz p1, :cond_34

    invoke-virtual {v9}, Lq1/b;->a()V

    :cond_34
    iget-object v3, v9, Lq1/b;->a:Lp1/q;

    iget-object v3, v3, Lp1/q;->G:Lp1/e2;

    iget v3, v3, Lp1/e2;->i:I

    iget-object v4, v9, Lq1/b;->d:La3/x;

    move/from16 v5, v17

    invoke-virtual {v4, v5}, La3/x;->a(I)I

    move-result v6

    if-gt v6, v3, :cond_35

    goto :goto_21

    :cond_35
    const-string v6, "Missed recording an endGroup"

    invoke-static {v6}, Lp1/r;->c(Ljava/lang/String;)V

    :goto_21
    invoke-virtual {v4, v5}, La3/x;->a(I)I

    move-result v5

    if-ne v5, v3, :cond_36

    const/4 v8, 0x0

    invoke-virtual {v9, v8}, Lq1/b;->d(Z)V

    invoke-virtual {v4}, La3/x;->b()I

    iget-object v3, v9, Lq1/b;->b:Lq1/a;

    iget-object v3, v3, Lq1/a;->a:Lq1/l0;

    sget-object v4, Lq1/m;->d:Lq1/m;

    invoke-virtual {v3, v4}, Lq1/l0;->g0(Lq1/j0;)V

    :cond_36
    iget-object v3, v0, Lp1/q;->G:Lp1/e2;

    iget v3, v3, Lp1/e2;->i:I

    invoke-virtual {v0, v3}, Lp1/q;->r0(I)I

    move-result v4

    if-eq v2, v4, :cond_37

    invoke-virtual {v0, v3, v2}, Lp1/q;->n0(II)V

    :cond_37
    if-eqz p1, :cond_38

    const/4 v2, 0x1

    :cond_38
    iget-object v3, v0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v3}, Lp1/e2;->e()V

    invoke-virtual {v9}, Lq1/b;->c()V

    :goto_22
    iget-object v3, v0, Lp1/q;->i:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/16 v18, 0x1

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp1/o1;

    if-eqz v3, :cond_39

    if-nez v1, :cond_39

    iget v1, v3, Lp1/o1;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v3, Lp1/o1;->c:I

    :cond_39
    iput-object v3, v0, Lp1/q;->j:Lp1/o1;

    invoke-virtual/range {v21 .. v21}, La3/x;->b()I

    move-result v1

    add-int/2addr v1, v2

    iput v1, v0, Lp1/q;->k:I

    invoke-virtual/range {v21 .. v21}, La3/x;->b()I

    move-result v1

    iput v1, v0, Lp1/q;->m:I

    invoke-virtual/range {v21 .. v21}, La3/x;->b()I

    move-result v1

    add-int/2addr v1, v2

    iput v1, v0, Lp1/q;->l:I

    return-void

    :cond_3a
    move/from16 v5, v17

    const/4 v8, 0x0

    const/16 v18, 0x1

    invoke-virtual {v0}, Lp1/q;->O()V

    iget-object v7, v0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v7}, Lp1/e2;->s()I

    move-result v7

    invoke-virtual {v9, v4, v7}, Lq1/b;->e(II)V

    iget-object v7, v0, Lp1/q;->G:Lp1/e2;

    iget v7, v7, Lp1/e2;->g:I

    move-object/from16 v10, v37

    invoke-static {v6, v7, v10}, Lp1/r;->a(IILjava/util/List;)V

    goto/16 :goto_1c
.end method

.method public final q0(Ljava/lang/Object;)V
    .locals 6

    iget-boolean v0, p0, Lp1/q;->S:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lp1/q;->I:Lp1/i2;

    iget v1, v0, Lp1/i2;->n:I

    if-lez v1, :cond_2

    iget v1, v0, Lp1/i2;->i:I

    iget v2, v0, Lp1/i2;->k:I

    if-eq v1, v2, :cond_2

    iget-object v1, v0, Lp1/i2;->s:La0/g0;

    if-nez v1, :cond_0

    new-instance v1, La0/g0;

    invoke-direct {v1}, La0/g0;-><init>()V

    :cond_0
    iput-object v1, v0, Lp1/i2;->s:La0/g0;

    iget v0, v0, Lp1/i2;->v:I

    invoke-virtual {v1, v0}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    new-instance v2, La0/q0;

    invoke-direct {v2}, La0/q0;-><init>()V

    invoke-virtual {v1, v0, v2}, La0/g0;->h(ILjava/lang/Object;)V

    :cond_1
    check-cast v2, La0/q0;

    invoke-virtual {v2, p1}, La0/q0;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0, p1}, Lp1/i2;->E(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void

    :cond_3
    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    iget-boolean v1, v0, Lp1/e2;->n:Z

    iget-object v2, p0, Lp1/q;->M:Lq1/b;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_5

    iget v1, v0, Lp1/e2;->l:I

    iget-object v5, v0, Lp1/e2;->b:[I

    iget v0, v0, Lp1/e2;->i:I

    invoke-static {v5, v0}, Lp1/h2;->c([II)I

    move-result v0

    sub-int/2addr v1, v0

    sub-int/2addr v1, v4

    iget-object v0, v2, Lq1/b;->a:Lp1/q;

    iget-object v0, v0, Lp1/q;->G:Lp1/e2;

    iget v0, v0, Lp1/e2;->i:I

    iget v5, v2, Lq1/b;->f:I

    sub-int/2addr v0, v5

    if-gez v0, :cond_4

    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    iget v5, v0, Lp1/e2;->i:I

    invoke-virtual {v0, v5}, Lp1/e2;->a(I)Lp1/a;

    move-result-object v0

    iget-object v2, v2, Lq1/b;->b:Lq1/a;

    iget-object v2, v2, Lq1/a;->a:Lq1/l0;

    sget-object v5, Lq1/r;->g:Lq1/r;

    invoke-virtual {v2, v5}, Lq1/l0;->g0(Lq1/j0;)V

    invoke-static {v2, v3, p1, v4, v0}, Landroidx/room/c1;->P(Lq1/l0;ILjava/lang/Object;ILjava/lang/Object;)V

    iget-object p1, v2, Lq1/l0;->c:[I

    iget v0, v2, Lq1/l0;->d:I

    iget-object v3, v2, Lq1/l0;->a:[Lq1/j0;

    iget v2, v2, Lq1/l0;->b:I

    sub-int/2addr v2, v4

    aget-object v2, v3, v2

    iget v2, v2, Lq1/j0;->b:I

    sub-int/2addr v0, v2

    aput v1, p1, v0

    return-void

    :cond_4
    invoke-virtual {v2, v4}, Lq1/b;->d(Z)V

    iget-object v0, v2, Lq1/b;->b:Lq1/a;

    iget-object v0, v0, Lq1/a;->a:Lq1/l0;

    sget-object v2, Lq1/r;->h:Lq1/r;

    invoke-virtual {v0, v2}, Lq1/l0;->g0(Lq1/j0;)V

    invoke-static {v0, v3, p1}, Landroidx/room/c1;->O(Lq1/l0;ILjava/lang/Object;)V

    iget-object p1, v0, Lq1/l0;->c:[I

    iget v2, v0, Lq1/l0;->d:I

    iget-object v3, v0, Lq1/l0;->a:[Lq1/j0;

    iget v0, v0, Lq1/l0;->b:I

    sub-int/2addr v0, v4

    aget-object v0, v3, v0

    iget v0, v0, Lq1/j0;->b:I

    sub-int/2addr v2, v0

    aput v1, p1, v2

    return-void

    :cond_5
    iget v1, v0, Lp1/e2;->i:I

    invoke-virtual {v0, v1}, Lp1/e2;->a(I)Lp1/a;

    move-result-object v0

    iget-object v1, v2, Lq1/b;->b:Lq1/a;

    iget-object v1, v1, Lq1/a;->a:Lq1/l0;

    sget-object v2, Lq1/e;->d:Lq1/e;

    invoke-virtual {v1, v2}, Lq1/l0;->g0(Lq1/j0;)V

    invoke-static {v1, v3, v0, v4, p1}, Landroidx/room/c1;->P(Lq1/l0;ILjava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public final r()V
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    invoke-virtual {p0}, Lp1/q;->B()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v1, v0, Lp1/v1;->b:I

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v1, v1, 0x2

    iput v1, v0, Lp1/v1;->b:I

    :cond_0
    return-void
.end method

.method public final r0(I)I
    .locals 3

    if-gez p1, :cond_2

    iget-object v0, p0, Lp1/q;->p:La0/e0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, La0/e0;->c(I)I

    move-result v2

    if-ltz v2, :cond_1

    invoke-virtual {v0, p1}, La0/e0;->c(I)I

    move-result v1

    if-ltz v1, :cond_0

    iget-object p1, v0, La0/e0;->c:[I

    aget p1, p1, v1

    return p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot find value for key "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lug/m;->R(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    return v1

    :cond_2
    iget-object v0, p0, Lp1/q;->o:[I

    if-eqz v0, :cond_3

    aget v0, v0, p1

    if-ltz v0, :cond_3

    return v0

    :cond_3
    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v0, p1}, Lp1/e2;->o(I)I

    move-result p1

    return p1
.end method

.method public final s()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    return-void
.end method

.method public final s0()V
    .locals 3

    iget-boolean v0, p0, Lp1/q;->r:Z

    if-nez v0, :cond_0

    const-string v0, "A call to createNode(), emitNode() or useNode() expected was not expected"

    invoke-static {v0}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lp1/q;->r:Z

    iget-boolean v0, p0, Lp1/q;->S:Z

    if-eqz v0, :cond_1

    const-string v0, "useNode() called while inserting"

    invoke-static {v0}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    iget v1, v0, Lp1/e2;->i:I

    invoke-virtual {v0, v1}, Lp1/e2;->n(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lp1/q;->M:Lq1/b;

    invoke-virtual {v1}, Lq1/b;->c()V

    iget-object v2, v1, Lq1/b;->h:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-boolean v2, p0, Lp1/q;->y:Z

    if-eqz v2, :cond_2

    instance-of v0, v0, Lp1/i;

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Lq1/b;->b()V

    iget-object v0, v1, Lq1/b;->b:Lq1/a;

    iget-object v0, v0, Lq1/a;->a:Lq1/l0;

    sget-object v1, Lq1/i0;->d:Lq1/i0;

    invoke-virtual {v0, v1}, Lq1/l0;->g0(Lq1/j0;)V

    :cond_2
    return-void
.end method

.method public final t()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    return-void
.end method

.method public final u()Lp1/v1;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lp1/q;->E:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp1/v1;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_7

    iget v5, v1, Lp1/v1;->b:I

    and-int/lit8 v5, v5, -0x9

    iput v5, v1, Lp1/v1;->b:I

    iget-object v5, v0, Lp1/q;->g:Lbu/c;

    invoke-virtual {v5}, Lbu/c;->A()V

    iget v5, v0, Lp1/q;->B:I

    iget-object v6, v1, Lp1/v1;->f:La0/m0;

    if-eqz v6, :cond_5

    iget v7, v1, Lp1/v1;->b:I

    and-int/lit8 v7, v7, 0x10

    if-eqz v7, :cond_1

    goto :goto_3

    :cond_1
    iget-object v7, v6, La0/m0;->b:[Ljava/lang/Object;

    iget-object v8, v6, La0/m0;->c:[I

    iget-object v9, v6, La0/m0;->a:[J

    array-length v10, v9

    add-int/lit8 v10, v10, -0x2

    if-ltz v10, :cond_5

    const/4 v11, 0x0

    :goto_1
    aget-wide v12, v9, v11

    not-long v14, v12

    const/16 v16, 0x7

    shl-long v14, v14, v16

    and-long/2addr v14, v12

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v14, v14, v16

    cmp-long v14, v14, v16

    if-eqz v14, :cond_4

    sub-int v14, v11, v10

    not-int v14, v14

    ushr-int/lit8 v14, v14, 0x1f

    const/16 v15, 0x8

    rsub-int/lit8 v14, v14, 0x8

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v14, :cond_3

    const-wide/16 v17, 0xff

    and-long v17, v12, v17

    const-wide/16 v19, 0x80

    cmp-long v17, v17, v19

    if-gez v17, :cond_2

    shl-int/lit8 v17, v11, 0x3

    add-int v17, v17, v4

    aget-object v18, v7, v17

    aget v2, v8, v17

    if-eq v2, v5, :cond_2

    new-instance v2, Lf0/m1;

    const/4 v4, 0x1

    invoke-direct {v2, v1, v5, v6, v4}, Lf0/m1;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    goto :goto_4

    :cond_2
    shr-long/2addr v12, v15

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_3
    if-ne v14, v15, :cond_5

    :cond_4
    if-eq v11, v10, :cond_5

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_5
    :goto_3
    const/4 v2, 0x0

    :goto_4
    iget-object v4, v0, Lp1/q;->M:Lq1/b;

    if-eqz v2, :cond_6

    iget-object v5, v4, Lq1/b;->b:Lq1/a;

    iget-object v5, v5, Lq1/a;->a:Lq1/l0;

    sget-object v6, Lq1/l;->d:Lq1/l;

    invoke-virtual {v5, v6}, Lq1/l0;->g0(Lq1/j0;)V

    iget-object v6, v0, Lp1/q;->h:Lp1/w;

    const/4 v7, 0x0

    invoke-static {v5, v7, v2, v3, v6}, Landroidx/room/c1;->P(Lq1/l0;ILjava/lang/Object;ILjava/lang/Object;)V

    :cond_6
    iget v2, v1, Lp1/v1;->b:I

    and-int/lit16 v5, v2, 0x200

    if-eqz v5, :cond_7

    and-int/lit16 v2, v2, -0x201

    iput v2, v1, Lp1/v1;->b:I

    iget-object v2, v4, Lq1/b;->b:Lq1/a;

    iget-object v2, v2, Lq1/a;->a:Lq1/l0;

    sget-object v4, Lq1/o;->d:Lq1/o;

    invoke-virtual {v2, v4}, Lq1/l0;->g0(Lq1/j0;)V

    const/4 v7, 0x0

    invoke-static {v2, v7, v1}, Landroidx/room/c1;->O(Lq1/l0;ILjava/lang/Object;)V

    iget v2, v1, Lp1/v1;->b:I

    and-int/lit16 v4, v2, -0x81

    iput v4, v1, Lp1/v1;->b:I

    and-int/lit16 v4, v2, 0x400

    if-eqz v4, :cond_7

    and-int/lit16 v2, v2, -0x481

    iput v2, v1, Lp1/v1;->b:I

    iput-boolean v7, v0, Lp1/q;->y:Z

    :cond_7
    if-eqz v1, :cond_c

    iget v2, v1, Lp1/v1;->b:I

    and-int/lit8 v4, v2, 0x10

    if-eqz v4, :cond_8

    goto :goto_8

    :cond_8
    and-int/2addr v2, v3

    if-eqz v2, :cond_9

    goto :goto_5

    :cond_9
    iget-boolean v2, v0, Lp1/q;->q:Z

    if-eqz v2, :cond_c

    :goto_5
    iget-object v2, v1, Lp1/v1;->c:Lp1/a;

    if-nez v2, :cond_b

    iget-boolean v2, v0, Lp1/q;->S:Z

    if-eqz v2, :cond_a

    iget-object v2, v0, Lp1/q;->I:Lp1/i2;

    iget v3, v2, Lp1/i2;->v:I

    invoke-virtual {v2, v3}, Lp1/i2;->b(I)Lp1/a;

    move-result-object v2

    goto :goto_6

    :cond_a
    iget-object v2, v0, Lp1/q;->G:Lp1/e2;

    iget v3, v2, Lp1/e2;->i:I

    invoke-virtual {v2, v3}, Lp1/e2;->a(I)Lp1/a;

    move-result-object v2

    :goto_6
    iput-object v2, v1, Lp1/v1;->c:Lp1/a;

    :cond_b
    iget v2, v1, Lp1/v1;->b:I

    and-int/lit8 v2, v2, -0x5

    iput v2, v1, Lp1/v1;->b:I

    move-object v4, v1

    :goto_7
    const/4 v7, 0x0

    goto :goto_9

    :cond_c
    :goto_8
    const/4 v4, 0x0

    goto :goto_7

    :goto_9
    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    return-object v4
.end method

.method public final v()V
    .locals 2

    iget-boolean v0, p0, Lp1/q;->F:Z

    if-nez v0, :cond_0

    iget v0, p0, Lp1/q;->z:I

    const/16 v1, 0x64

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Cannot disable reuse from root if it was caused by other groups"

    invoke-static {v0}, Lp1/q1;->a(Ljava/lang/String;)V

    :goto_0
    const/4 v0, -0x1

    iput v0, p0, Lp1/q;->z:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lp1/q;->y:Z

    return-void
.end method

.method public final w()V
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    iget-object v1, p0, Lp1/q;->b:Lp1/t;

    invoke-virtual {v1}, Lp1/t;->c()V

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    iget-object v1, p0, Lp1/q;->M:Lq1/b;

    iget-boolean v2, v1, Lq1/b;->c:Z

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Lq1/b;->d(Z)V

    invoke-virtual {v1, v0}, Lq1/b;->d(Z)V

    iget-object v2, v1, Lq1/b;->b:Lq1/a;

    iget-object v2, v2, Lq1/a;->a:Lq1/l0;

    sget-object v3, Lq1/m;->d:Lq1/m;

    invoke-virtual {v2, v3}, Lq1/l0;->g0(Lq1/j0;)V

    iput-boolean v0, v1, Lq1/b;->c:Z

    :cond_0
    invoke-virtual {v1}, Lq1/b;->b()V

    iget-object v1, v1, Lq1/b;->d:La3/x;

    iget v1, v1, La3/x;->b:I

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "Missed recording an endGroup()"

    invoke-static {v1}, Lp1/r;->c(Ljava/lang/String;)V

    :goto_0
    iget-object v1, p0, Lp1/q;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "Start/end imbalance"

    invoke-static {v1}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0}, Lp1/q;->j()V

    iget-object v1, p0, Lp1/q;->G:Lp1/e2;

    invoke-virtual {v1}, Lp1/e2;->c()V

    iget-object v1, p0, Lp1/q;->x:La3/x;

    invoke-virtual {v1}, La3/x;->b()I

    move-result v1

    if-eqz v1, :cond_3

    const/4 v0, 0x1

    :cond_3
    iput-boolean v0, p0, Lp1/q;->w:Z

    return-void
.end method

.method public final x(I)V
    .locals 2

    if-gez p1, :cond_0

    neg-int p1, p1

    iget-object v0, p0, Lp1/q;->I:Lp1/i2;

    :goto_0
    iget v1, v0, Lp1/i2;->v:I

    if-le v1, p1, :cond_2

    invoke-virtual {v0, v1}, Lp1/i2;->x(I)Z

    move-result v1

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lp1/q;->S:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lp1/q;->I:Lp1/i2;

    :goto_1
    iget-boolean v1, p0, Lp1/q;->S:Z

    if-eqz v1, :cond_1

    iget v1, v0, Lp1/i2;->v:I

    invoke-virtual {v0, v1}, Lp1/i2;->x(I)Z

    move-result v1

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lp1/q;->G:Lp1/e2;

    :goto_2
    iget v1, v0, Lp1/e2;->i:I

    if-le v1, p1, :cond_2

    invoke-virtual {v0, v1}, Lp1/e2;->l(I)Z

    move-result v1

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final y(ZLp1/o1;)V
    .locals 2

    iget-object v0, p0, Lp1/q;->i:Ljava/util/ArrayList;

    iget-object v1, p0, Lp1/q;->j:Lp1/o1;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p2, p0, Lp1/q;->j:Lp1/o1;

    iget p2, p0, Lp1/q;->l:I

    iget-object v0, p0, Lp1/q;->n:La3/x;

    invoke-virtual {v0, p2}, La3/x;->c(I)V

    iget p2, p0, Lp1/q;->m:I

    invoke-virtual {v0, p2}, La3/x;->c(I)V

    iget p2, p0, Lp1/q;->k:I

    invoke-virtual {v0, p2}, La3/x;->c(I)V

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    iput p2, p0, Lp1/q;->k:I

    :cond_0
    iput p2, p0, Lp1/q;->l:I

    iput p2, p0, Lp1/q;->m:I

    return-void
.end method

.method public final z()V
    .locals 2

    new-instance v0, Lp1/f2;

    invoke-direct {v0}, Lp1/f2;-><init>()V

    iget-boolean v1, p0, Lp1/q;->C:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lp1/f2;->c()V

    :cond_0
    iget-object v1, p0, Lp1/q;->b:Lp1/t;

    invoke-virtual {v1}, Lp1/t;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, La0/g0;

    invoke-direct {v1}, La0/g0;-><init>()V

    iput-object v1, v0, Lp1/f2;->K:La0/g0;

    :cond_1
    iput-object v0, p0, Lp1/q;->H:Lp1/f2;

    invoke-virtual {v0}, Lp1/f2;->e()Lp1/i2;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lp1/i2;->e(Z)V

    iput-object v0, p0, Lp1/q;->I:Lp1/i2;

    return-void
.end method
