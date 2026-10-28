.class public final Le1/s;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/c0;
.implements La3/r;
.implements La3/j2;


# instance fields
.field public O:Ljava/lang/String;

.field public P:Ll3/v0;

.field public Q:Lp3/h;

.field public R:I

.field public S:Z

.field public T:I

.field public U:I

.field public V:Li2/a0;

.field public W:Ljava/util/HashMap;

.field public X:Le1/g;

.field public Y:Le1/q;

.field public Z:Le1/r;


# virtual methods
.method public final E(La3/w0;Ly2/q0;I)I
    .locals 1

    iget-object p2, p0, Le1/s;->Z:Le1/r;

    if-eqz p2, :cond_1

    iget-boolean v0, p2, Le1/r;->c:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    iget-object p2, p2, Le1/r;->d:Le1/g;

    if-nez p2, :cond_2

    :cond_1
    invoke-virtual {p0}, Le1/s;->X0()Le1/g;

    move-result-object p2

    :cond_2
    invoke-virtual {p2, p1}, Le1/g;->d(Ly3/c;)V

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Le1/g;->a(ILy3/m;)I

    move-result p1

    return p1
.end method

.method public final M0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final O(La3/p0;)V
    .locals 10

    iget-boolean v0, p0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v0, p0, Le1/s;->Z:Le1/r;

    if-eqz v0, :cond_2

    iget-boolean v1, v0, Le1/r;->c:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, v0, Le1/r;->d:Le1/g;

    if-nez v0, :cond_3

    :cond_2
    invoke-virtual {p0}, Le1/s;->X0()Le1/g;

    move-result-object v0

    :cond_3
    iget-object v1, v0, Le1/g;->j:Ll3/a;

    if-eqz v1, :cond_e

    iget-object p1, p1, La3/p0;->w:Lk2/b;

    iget-object p1, p1, Lk2/b;->x:La3/p;

    invoke-virtual {p1}, La3/p;->w()Li2/v;

    move-result-object v2

    iget-boolean p1, v0, Le1/g;->k:Z

    if-eqz p1, :cond_4

    iget-wide v3, v0, Le1/g;->l:J

    const/16 v0, 0x20

    shr-long v5, v3, v0

    long-to-int v0, v5

    int-to-float v5, v0

    const-wide v6, 0xffffffffL

    and-long/2addr v3, v6

    long-to-int v0, v3

    int-to-float v6, v0

    invoke-interface {v2}, Li2/v;->q()V

    const/4 v4, 0x0

    const/4 v7, 0x1

    const/4 v3, 0x0

    invoke-interface/range {v2 .. v7}, Li2/v;->e(FFFFI)V

    :cond_4
    :try_start_0
    iget-object v0, p0, Le1/s;->P:Ll3/v0;

    iget-object v0, v0, Ll3/v0;->a:Ll3/m0;

    iget-object v3, v0, Ll3/m0;->m:Lw3/l;

    if-nez v3, :cond_5

    sget-object v3, Lw3/l;->b:Lw3/l;

    :cond_5
    move-object v6, v3

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_6

    :goto_1
    iget-object v3, v0, Ll3/m0;->n:Li2/z0;

    if-nez v3, :cond_6

    sget-object v3, Li2/z0;->d:Li2/z0;

    :cond_6
    move-object v5, v3

    iget-object v3, v0, Ll3/m0;->p:Lk2/f;

    if-nez v3, :cond_7

    sget-object v3, Lk2/h;->a:Lk2/h;

    :cond_7
    move-object v7, v3

    iget-object v0, v0, Ll3/m0;->a:Lw3/o;

    invoke-interface {v0}, Lw3/o;->c()Li2/t;

    move-result-object v3

    if-eqz v3, :cond_8

    iget-object v0, p0, Le1/s;->P:Ll3/v0;

    iget-object v0, v0, Ll3/v0;->a:Ll3/m0;

    iget-object v0, v0, Ll3/m0;->a:Lw3/o;

    invoke-interface {v0}, Lw3/o;->a()F

    move-result v4

    invoke-virtual/range {v1 .. v7}, Ll3/a;->g(Li2/v;Li2/t;FLi2/z0;Lw3/l;Lk2/f;)V

    goto :goto_4

    :cond_8
    iget-object v0, p0, Le1/s;->V:Li2/a0;

    if-eqz v0, :cond_9

    invoke-interface {v0}, Li2/a0;->a()J

    move-result-wide v3

    goto :goto_2

    :cond_9
    sget-wide v3, Li2/x;->n:J

    :goto_2
    const-wide/16 v8, 0x10

    cmp-long v0, v3, v8

    if-eqz v0, :cond_a

    goto :goto_3

    :cond_a
    iget-object v0, p0, Le1/s;->P:Ll3/v0;

    invoke-virtual {v0}, Ll3/v0;->c()J

    move-result-wide v3

    cmp-long v0, v3, v8

    if-eqz v0, :cond_b

    iget-object v0, p0, Le1/s;->P:Ll3/v0;

    invoke-virtual {v0}, Ll3/v0;->c()J

    move-result-wide v3

    goto :goto_3

    :cond_b
    sget-wide v3, Li2/x;->b:J

    :goto_3
    invoke-virtual/range {v1 .. v7}, Ll3/a;->f(Li2/v;JLi2/z0;Lw3/l;Lk2/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_4
    if-eqz p1, :cond_c

    invoke-interface {v2}, Li2/v;->g()V

    :cond_c
    :goto_5
    return-void

    :goto_6
    if-eqz p1, :cond_d

    invoke-interface {v2}, Li2/v;->g()V

    :cond_d
    throw v0

    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache="

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Le1/s;->X:Le1/g;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", textSubstitution="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Le1/s;->Z:Le1/r;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lk0/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final X0()Le1/g;
    .locals 9

    iget-object v0, p0, Le1/s;->X:Le1/g;

    if-nez v0, :cond_0

    new-instance v1, Le1/g;

    iget-object v2, p0, Le1/s;->O:Ljava/lang/String;

    iget-object v3, p0, Le1/s;->P:Ll3/v0;

    iget-object v4, p0, Le1/s;->Q:Lp3/h;

    iget v5, p0, Le1/s;->R:I

    iget-boolean v6, p0, Le1/s;->S:Z

    iget v7, p0, Le1/s;->T:I

    iget v8, p0, Le1/s;->U:I

    invoke-direct/range {v1 .. v8}, Le1/g;-><init>(Ljava/lang/String;Ll3/v0;Lp3/h;IZII)V

    iput-object v1, p0, Le1/s;->X:Le1/g;

    :cond_0
    iget-object v0, p0, Le1/s;->X:Le1/g;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 4

    const-string v0, "TextStringSimpleNode::measure"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Le1/s;->Z:Le1/r;

    if-eqz v0, :cond_1

    iget-boolean v1, v0, Le1/r;->c:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Le1/r;->d:Le1/g;

    if-nez v0, :cond_2

    :cond_1
    invoke-virtual {p0}, Le1/s;->X0()Le1/g;

    move-result-object v0

    :cond_2
    invoke-virtual {v0, p1}, Le1/g;->d(Ly3/c;)V

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v1

    invoke-virtual {v0, p3, p4, v1}, Le1/g;->b(JLy3/m;)Z

    move-result p3

    iget-object p4, v0, Le1/g;->n:Ll3/a0;

    if-eqz p4, :cond_3

    invoke-interface {p4}, Ll3/a0;->b()Z

    :cond_3
    iget-object p4, v0, Le1/g;->j:Ll3/a;

    invoke-static {p4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p4, p4, Ll3/a;->d:Lm3/m;

    iget-wide v0, v0, Le1/g;->l:J

    if-eqz p3, :cond_5

    const/4 p3, 0x2

    invoke-static {p0, p3}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeCoordinator;->n1()V

    iget-object v2, p0, Le1/s;->W:Ljava/util/HashMap;

    if-nez v2, :cond_4

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, p3}, Ljava/util/HashMap;-><init>(I)V

    iput-object v2, p0, Le1/s;->W:Ljava/util/HashMap;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_4
    :goto_1
    sget-object p3, Ly2/d;->a:Ly2/m;

    const/4 v3, 0x0

    invoke-virtual {p4, v3}, Lm3/m;->d(I)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, p3, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p3, Ly2/d;->b:Ly2/m;

    iget v3, p4, Lm3/m;->g:I

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {p4, v3}, Lm3/m;->d(I)F

    move-result p4

    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    move-result p4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {v2, p3, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    const/16 p3, 0x20

    shr-long p3, v0, p3

    long-to-int p3, p3

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p4, v0

    invoke-static {p3, p3, p4, p4}, Lva3/l;->n(IIII)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget-object v0, p0, Le1/s;->W:Ljava/util/HashMap;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v1, Le1/m;

    const/4 v2, 0x1

    invoke-direct {v1, p2, v2}, Le1/m;-><init>(Ly2/j1;I)V

    invoke-interface {p1, p3, p4, v0, v1}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object p1

    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public final g0(La3/w0;Ly2/q0;I)I
    .locals 0

    iget-object p2, p0, Le1/s;->Z:Le1/r;

    if-eqz p2, :cond_1

    iget-boolean p3, p2, Le1/r;->c:Z

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    iget-object p2, p2, Le1/r;->d:Le1/g;

    if-nez p2, :cond_2

    :cond_1
    invoke-virtual {p0}, Le1/s;->X0()Le1/g;

    move-result-object p2

    :cond_2
    invoke-virtual {p2, p1}, Le1/g;->d(Ly3/c;)V

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object p1

    invoke-virtual {p2, p1}, Le1/g;->e(Ly3/m;)Ll3/a0;

    move-result-object p1

    invoke-interface {p1}, Ll3/a0;->g()F

    move-result p1

    invoke-static {p1}, Lwb3/f;->l(F)I

    move-result p1

    return p1
.end method

.method public final n(Li3/z;)V
    .locals 6

    iget-object v0, p0, Le1/s;->Y:Le1/q;

    if-nez v0, :cond_0

    new-instance v0, Le1/q;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Le1/q;-><init>(Le1/s;I)V

    iput-object v0, p0, Le1/s;->Y:Le1/q;

    :cond_0
    new-instance v1, Ll3/g;

    iget-object v2, p0, Le1/s;->O:Ljava/lang/String;

    invoke-direct {v1, v2}, Ll3/g;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Li3/w;->l(Li3/z;Ll3/g;)V

    iget-object v1, p0, Le1/s;->Z:Le1/r;

    if-eqz v1, :cond_1

    iget-boolean v2, v1, Le1/r;->c:Z

    sget-object v3, Li3/u;->C:Li3/y;

    sget-object v4, Li3/w;->a:[Lj93/z;

    const/16 v5, 0x10

    aget-object v5, v4, v5

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v3, p1, v2}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    new-instance v2, Ll3/g;

    iget-object v1, v1, Le1/r;->b:Ljava/lang/String;

    invoke-direct {v2, v1}, Ll3/g;-><init>(Ljava/lang/String;)V

    sget-object v1, Li3/u;->B:Li3/y;

    const/16 v3, 0xf

    aget-object v3, v4, v3

    invoke-virtual {v1, p1, v2}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    :cond_1
    new-instance v1, Le1/q;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Le1/q;-><init>(Le1/s;I)V

    sget-object v2, Li3/k;->k:Li3/y;

    new-instance v3, Li3/a;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v1}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    move-object v1, p1

    check-cast v1, Li3/l;

    invoke-virtual {v1, v2, v3}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    new-instance v2, Le1/q;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Le1/q;-><init>(Le1/s;I)V

    sget-object v3, Li3/k;->l:Li3/y;

    new-instance v5, Li3/a;

    invoke-direct {v5, v4, v2}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    invoke-virtual {v1, v3, v5}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    new-instance v2, La6/l0;

    const/16 v3, 0xb

    invoke-direct {v2, p0, v3}, La6/l0;-><init>(Ljava/lang/Object;I)V

    sget-object v3, Li3/k;->m:Li3/y;

    new-instance v5, Li3/a;

    invoke-direct {v5, v4, v2}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    invoke-virtual {v1, v3, v5}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    invoke-static {p1, v0}, Li3/w;->b(Li3/z;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final o(La3/w0;Ly2/q0;I)I
    .locals 0

    iget-object p2, p0, Le1/s;->Z:Le1/r;

    if-eqz p2, :cond_1

    iget-boolean p3, p2, Le1/r;->c:Z

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    iget-object p2, p2, Le1/r;->d:Le1/g;

    if-nez p2, :cond_2

    :cond_1
    invoke-virtual {p0}, Le1/s;->X0()Le1/g;

    move-result-object p2

    :cond_2
    invoke-virtual {p2, p1}, Le1/g;->d(Ly3/c;)V

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object p1

    invoke-virtual {p2, p1}, Le1/g;->e(Ly3/m;)Ll3/a0;

    move-result-object p1

    invoke-interface {p1}, Ll3/a0;->c()F

    move-result p1

    invoke-static {p1}, Lwb3/f;->l(F)I

    move-result p1

    return p1
.end method

.method public final y(La3/w0;Ly2/q0;I)I
    .locals 1

    iget-object p2, p0, Le1/s;->Z:Le1/r;

    if-eqz p2, :cond_1

    iget-boolean v0, p2, Le1/r;->c:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    iget-object p2, p2, Le1/r;->d:Le1/g;

    if-nez p2, :cond_2

    :cond_1
    invoke-virtual {p0}, Le1/s;->X0()Le1/g;

    move-result-object p2

    :cond_2
    invoke-virtual {p2, p1}, Le1/g;->d(Ly3/c;)V

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Le1/g;->a(ILy3/m;)I

    move-result p1

    return p1
.end method
