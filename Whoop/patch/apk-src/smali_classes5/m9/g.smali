.class public final Lm9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/z0;
.implements Ll9/b1;
.implements Lp9/g;
.implements Lp9/j;


# instance fields
.field public final E:Le9/l;

.field public final F:Le9/b;

.field public final G:Lg9/d;

.field public final H:Ljc/b;

.field public final I:Lp9/k;

.field public final J:Lcom/iterable/iterableapi/g1;

.field public final K:Ljava/util/ArrayList;

.field public final L:Ljava/util/List;

.field public final M:Ll9/y0;

.field public final N:[Ll9/y0;

.field public final O:Lxl/a;

.field public P:Lm9/d;

.field public Q:Lu8/p;

.field public R:Lm9/f;

.field public S:J

.field public T:J

.field public U:I

.field public V:Lm9/a;

.field public W:Z

.field public X:Z

.field public Y:Z

.field public final w:I

.field public final x:[I

.field public final y:[Lu8/p;

.field public final z:[Z


# direct methods
.method public constructor <init>(I[I[Lu8/p;Le9/l;Le9/b;Lko/o;JLg9/h;Lg9/d;Ljc/b;Lg9/d;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lm9/g;->w:I

    iput-object p2, p0, Lm9/g;->x:[I

    iput-object p3, p0, Lm9/g;->y:[Lu8/p;

    iput-object p4, p0, Lm9/g;->E:Le9/l;

    iput-object p5, p0, Lm9/g;->F:Le9/b;

    iput-object p12, p0, Lm9/g;->G:Lg9/d;

    iput-object p11, p0, Lm9/g;->H:Ljc/b;

    iput-boolean p13, p0, Lm9/g;->W:Z

    new-instance p3, Lp9/k;

    const-string p4, "ChunkSampleStream"

    invoke-direct {p3, p4}, Lp9/k;-><init>(Ljava/lang/String;)V

    iput-object p3, p0, Lm9/g;->I:Lp9/k;

    new-instance p3, Lcom/iterable/iterableapi/g1;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lm9/g;->J:Lcom/iterable/iterableapi/g1;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lm9/g;->K:Ljava/util/ArrayList;

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p3

    iput-object p3, p0, Lm9/g;->L:Ljava/util/List;

    array-length p2, p2

    new-array p3, p2, [Ll9/y0;

    iput-object p3, p0, Lm9/g;->N:[Ll9/y0;

    new-array p3, p2, [Z

    iput-object p3, p0, Lm9/g;->z:[Z

    add-int/lit8 p3, p2, 0x1

    new-array p4, p3, [I

    new-array p3, p3, [Ll9/y0;

    new-instance p5, Ll9/y0;

    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p5, p6, p9, p10}, Ll9/y0;-><init>(Lko/o;Lg9/h;Lg9/d;)V

    iput-object p5, p0, Lm9/g;->M:Ll9/y0;

    const/4 p9, 0x0

    aput p1, p4, p9

    aput-object p5, p3, p9

    :goto_0
    if-ge p9, p2, :cond_0

    new-instance p1, Ll9/y0;

    const/4 p5, 0x0

    invoke-direct {p1, p6, p5, p5}, Ll9/y0;-><init>(Lko/o;Lg9/h;Lg9/d;)V

    iget-object p5, p0, Lm9/g;->N:[Ll9/y0;

    aput-object p1, p5, p9

    add-int/lit8 p5, p9, 0x1

    aput-object p1, p3, p5

    iget-object p1, p0, Lm9/g;->x:[I

    aget p1, p1, p9

    aput p1, p4, p5

    move p9, p5

    goto :goto_0

    :cond_0
    new-instance p1, Lxl/a;

    const/16 p2, 0x14

    invoke-direct {p1, p2, p4, p3}, Lxl/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lm9/g;->O:Lxl/a;

    iput-wide p7, p0, Lm9/g;->S:J

    iput-wide p7, p0, Lm9/g;->T:J

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 9

    iget-object v0, p0, Lm9/g;->M:Ll9/y0;

    invoke-virtual {v0}, Ll9/y0;->l()I

    move-result v0

    iget v1, p0, Lm9/g;->U:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v0, v1}, Lm9/g;->B(II)I

    move-result v0

    :goto_0
    iget v1, p0, Lm9/g;->U:I

    if-gt v1, v0, :cond_1

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lm9/g;->U:I

    iget-object v2, p0, Lm9/g;->K:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm9/a;

    iget-object v4, v1, Lm9/d;->z:Lu8/p;

    iget-object v2, p0, Lm9/g;->Q:Lu8/p;

    invoke-virtual {v4, v2}, Lu8/p;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget v5, v1, Lm9/d;->E:I

    iget-object v6, v1, Lm9/d;->F:Ljava/lang/Object;

    iget-wide v7, v1, Lm9/d;->G:J

    iget-object v2, p0, Lm9/g;->G:Lg9/d;

    iget v3, p0, Lm9/g;->w:I

    invoke-virtual/range {v2 .. v8}, Lg9/d;->b(ILu8/p;ILjava/lang/Object;J)V

    :cond_0
    iput-object v4, p0, Lm9/g;->Q:Lu8/p;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final B(II)I
    .locals 2

    :cond_0
    add-int/lit8 p2, p2, 0x1

    iget-object v0, p0, Lm9/g;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p2, v1, :cond_1

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm9/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lm9/a;->a(I)I

    move-result v0

    if-le v0, p1, :cond_0

    add-int/lit8 p2, p2, -0x1

    return p2

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public final C(Le9/b;)V
    .locals 6

    iput-object p1, p0, Lm9/g;->R:Lm9/f;

    iget-object p1, p0, Lm9/g;->M:Ll9/y0;

    invoke-virtual {p1}, Ll9/y0;->g()V

    iget-object v0, p1, Ll9/y0;->h:Le10/k0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p1, Ll9/y0;->e:Lg9/d;

    invoke-virtual {v0, v2}, Le10/k0;->K(Lg9/d;)V

    iput-object v1, p1, Ll9/y0;->h:Le10/k0;

    iput-object v1, p1, Ll9/y0;->g:Lu8/p;

    :cond_0
    iget-object p1, p0, Lm9/g;->N:[Ll9/y0;

    array-length v0, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p1, v2

    invoke-virtual {v3}, Ll9/y0;->g()V

    iget-object v4, v3, Ll9/y0;->h:Le10/k0;

    if-eqz v4, :cond_1

    iget-object v5, v3, Ll9/y0;->e:Lg9/d;

    invoke-virtual {v4, v5}, Le10/k0;->K(Lg9/d;)V

    iput-object v1, v3, Ll9/y0;->h:Le10/k0;

    iput-object v1, v3, Ll9/y0;->g:Lu8/p;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lm9/g;->I:Lp9/k;

    invoke-virtual {p1, p0}, Lp9/k;->b(Lp9/j;)V

    return-void
.end method

.method public final a()Z
    .locals 1

    iget-object v0, p0, Lm9/g;->I:Lp9/k;

    invoke-virtual {v0}, Lp9/k;->a()Z

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 2

    invoke-virtual {p0}, Lm9/g;->z()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lm9/g;->M:Ll9/y0;

    iget-boolean v1, p0, Lm9/g;->Y:Z

    invoke-virtual {v0, v1}, Ll9/y0;->o(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Lm9/g;->I:Lp9/k;

    invoke-virtual {v0}, Lp9/k;->c()V

    iget-object v1, p0, Lm9/g;->M:Ll9/y0;

    iget-object v2, v1, Ll9/y0;->h:Le10/k0;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Le10/k0;->G()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, v1, Ll9/y0;->h:Le10/k0;

    invoke-virtual {v0}, Le10/k0;->C()Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lp9/k;->a()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lm9/g;->E:Le9/l;

    iget-object v1, v0, Le9/l;->m:Landroidx/media3/exoplayer/source/BehindLiveWindowException;

    if-nez v1, :cond_2

    iget-object v0, v0, Le9/l;->a:Lp9/l;

    invoke-interface {v0}, Lp9/l;->c()V

    return-void

    :cond_2
    throw v1

    :cond_3
    return-void
.end method

.method public final d()J
    .locals 2

    invoke-virtual {p0}, Lm9/g;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lm9/g;->S:J

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Lm9/g;->Y:Z

    if-eqz v0, :cond_1

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_1
    invoke-virtual {p0}, Lm9/g;->v()Lm9/a;

    move-result-object v0

    iget-wide v0, v0, Lm9/d;->H:J

    return-wide v0
.end method

.method public final g()V
    .locals 9

    iget-object v0, p0, Lm9/g;->M:Ll9/y0;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll9/y0;->s(Z)V

    iget-object v2, v0, Ll9/y0;->h:Le10/k0;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v4, v0, Ll9/y0;->e:Lg9/d;

    invoke-virtual {v2, v4}, Le10/k0;->K(Lg9/d;)V

    iput-object v3, v0, Ll9/y0;->h:Le10/k0;

    iput-object v3, v0, Ll9/y0;->g:Lu8/p;

    :cond_0
    iget-object v0, p0, Lm9/g;->N:[Ll9/y0;

    array-length v2, v0

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v2, :cond_2

    aget-object v6, v0, v5

    invoke-virtual {v6, v1}, Ll9/y0;->s(Z)V

    iget-object v7, v6, Ll9/y0;->h:Le10/k0;

    if-eqz v7, :cond_1

    iget-object v8, v6, Ll9/y0;->e:Lg9/d;

    invoke-virtual {v7, v8}, Le10/k0;->K(Lg9/d;)V

    iput-object v3, v6, Ll9/y0;->h:Le10/k0;

    iput-object v3, v6, Ll9/y0;->g:Lu8/p;

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lm9/g;->E:Le9/l;

    iget-object v0, v0, Le9/l;->i:[Le9/j;

    array-length v2, v0

    :goto_1
    if-ge v4, v2, :cond_4

    aget-object v5, v0, v4

    iget-object v5, v5, Le9/j;->a:Lm9/c;

    if-eqz v5, :cond_3

    iget-object v5, v5, Lm9/c;->w:Lt9/n;

    invoke-interface {v5}, Lt9/n;->release()V

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lm9/g;->R:Lm9/f;

    if-eqz v0, :cond_6

    check-cast v0, Le9/b;

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Le9/b;->N:Ljava/util/IdentityHashMap;

    invoke-virtual {v2, p0}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le9/o;

    if-eqz v2, :cond_5

    iget-object v2, v2, Le9/o;->a:Ll9/y0;

    invoke-virtual {v2, v1}, Ll9/y0;->s(Z)V

    iget-object v1, v2, Ll9/y0;->h:Le10/k0;

    if-eqz v1, :cond_5

    iget-object v4, v2, Ll9/y0;->e:Lg9/d;

    invoke-virtual {v1, v4}, Le10/k0;->K(Lg9/d;)V

    iput-object v3, v2, Ll9/y0;->h:Le10/k0;

    iput-object v3, v2, Ll9/y0;->g:Lu8/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_6
    return-void
.end method

.method public final j(J)I
    .locals 3

    invoke-virtual {p0}, Lm9/g;->z()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lm9/g;->Y:Z

    iget-object v2, p0, Lm9/g;->M:Ll9/y0;

    invoke-virtual {v2, p1, p2, v0}, Ll9/y0;->n(JZ)I

    move-result p1

    iget-object p2, p0, Lm9/g;->V:Lm9/a;

    if-eqz p2, :cond_1

    invoke-virtual {p2, v1}, Lm9/a;->a(I)I

    move-result p2

    invoke-virtual {v2}, Ll9/y0;->l()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :cond_1
    invoke-virtual {v2, p1}, Ll9/y0;->v(I)V

    invoke-virtual {p0}, Lm9/g;->A()V

    return p1
.end method

.method public final l(Lqg3/d;La9/e;I)I
    .locals 3

    invoke-virtual {p0}, Lm9/g;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lm9/g;->V:Lm9/a;

    iget-object v1, p0, Lm9/g;->M:Ll9/y0;

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lm9/a;->a(I)I

    move-result v0

    invoke-virtual {v1}, Ll9/y0;->l()I

    move-result v2

    if-gt v0, v2, :cond_1

    :goto_0
    const/4 p1, -0x3

    return p1

    :cond_1
    invoke-virtual {p0}, Lm9/g;->A()V

    iget-boolean v0, p0, Lm9/g;->Y:Z

    invoke-virtual {v1, p1, p2, p3, v0}, Ll9/y0;->r(Lqg3/d;La9/e;IZ)I

    move-result p1

    return p1
.end method

.method public final m()J
    .locals 5

    iget-object v0, p0, Lm9/g;->K:Ljava/util/ArrayList;

    iget-boolean v1, p0, Lm9/g;->Y:Z

    if-eqz v1, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lm9/g;->z()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-wide v0, p0, Lm9/g;->S:J

    return-wide v0

    :cond_1
    iget-wide v1, p0, Lm9/g;->T:J

    invoke-virtual {p0}, Lm9/g;->v()Lm9/a;

    move-result-object v3

    invoke-virtual {v3}, Lm9/a;->e()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x1

    if-le v3, v4, :cond_3

    const/4 v3, 0x2

    invoke-static {v0, v3}, Lm4/a;->d(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lm9/a;

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_4

    iget-wide v3, v3, Lm9/d;->H:J

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    :cond_4
    iget-object v0, p0, Lm9/g;->M:Ll9/y0;

    monitor-enter v0

    :try_start_0
    iget-wide v3, v0, Ll9/y0;->v:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    return-wide v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final n(J)V
    .locals 12

    iget-object v0, p0, Lm9/g;->I:Lp9/k;

    iget-object v1, v0, Lp9/k;->y:Ljava/io/IOException;

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lm9/g;->z()Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_5

    :cond_1
    invoke-virtual {v0}, Lp9/k;->a()Z

    move-result v1

    const/4 v2, 0x0

    iget-object v3, p0, Lm9/g;->L:Ljava/util/List;

    iget-object v4, p0, Lm9/g;->E:Le9/l;

    iget-object v5, p0, Lm9/g;->K:Ljava/util/ArrayList;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lm9/g;->P:Lm9/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v6, v1, Lm9/a;

    if-eqz v6, :cond_2

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {p0, v5}, Lm9/g;->y(I)Z

    move-result v5

    if-eqz v5, :cond_2

    goto/16 :goto_5

    :cond_2
    iget-object v5, v4, Le9/l;->m:Landroidx/media3/exoplayer/source/BehindLiveWindowException;

    if-eqz v5, :cond_3

    move p1, v2

    goto :goto_0

    :cond_3
    iget-object v4, v4, Le9/l;->j:Lo9/s;

    invoke-interface {v4, p1, p2, v1, v3}, Lo9/s;->u(JLm9/d;Ljava/util/List;)Z

    move-result p1

    :goto_0
    if-eqz p1, :cond_b

    iget-object p1, v0, Lp9/k;->x:Lp9/h;

    invoke-static {p1}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {p1, v2}, Lp9/h;->a(Z)V

    if-eqz v6, :cond_b

    check-cast v1, Lm9/a;

    iput-object v1, p0, Lm9/g;->V:Lm9/a;

    return-void

    :cond_4
    iget-object v1, v4, Le9/l;->m:Landroidx/media3/exoplayer/source/BehindLiveWindowException;

    if-nez v1, :cond_6

    iget-object v1, v4, Le9/l;->j:Lo9/s;

    invoke-interface {v1}, Lo9/s;->length()I

    move-result v1

    const/4 v6, 0x2

    if-ge v1, v6, :cond_5

    goto :goto_1

    :cond_5
    iget-object v1, v4, Le9/l;->j:Lo9/s;

    invoke-interface {v1, p1, p2, v3}, Lo9/s;->l(JLjava/util/List;)I

    move-result p1

    goto :goto_2

    :cond_6
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p1

    :goto_2
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p1, p2, :cond_b

    invoke-virtual {v0}, Lp9/k;->a()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lva3/g;->i(Z)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result p2

    :goto_3
    const/4 v0, -0x1

    if-ge p1, p2, :cond_8

    invoke-virtual {p0, p1}, Lm9/g;->y(I)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_4

    :cond_7
    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_8
    move p1, v0

    :goto_4
    if-ne p1, v0, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {p0}, Lm9/g;->v()Lm9/a;

    move-result-object p2

    iget-wide v0, p2, Lm9/d;->H:J

    invoke-virtual {p0, p1}, Lm9/g;->o(I)Lm9/a;

    move-result-object p1

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_a

    iget-wide v3, p0, Lm9/g;->T:J

    iput-wide v3, p0, Lm9/g;->S:J

    :cond_a
    iput-boolean v2, p0, Lm9/g;->Y:Z

    iget-wide p1, p1, Lm9/d;->G:J

    new-instance v2, Ll9/y;

    invoke-static {p1, p2}, Lx8/t;->U(J)J

    move-result-wide v8

    invoke-static {v0, v1}, Lx8/t;->U(J)J

    move-result-wide v10

    const/4 v3, 0x1

    iget v4, p0, Lm9/g;->w:I

    const/4 v5, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v11}, Ll9/y;-><init>(IILjava/lang/Object;ILjava/lang/Object;JJ)V

    iget-object p1, p0, Lm9/g;->G:Lg9/d;

    iget-object p2, p1, Lg9/d;->b:Ll9/c0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lbc/i;

    const/16 v1, 0x8

    invoke-direct {v0, p1, p2, v2, v1}, Lbc/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lg9/d;->a(Lx8/d;)V

    :cond_b
    :goto_5
    return-void
.end method

.method public final o(I)Lm9/a;
    .locals 4

    iget-object v0, p0, Lm9/g;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm9/a;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    sget v3, Lx8/t;->a:I

    if-ltz p1, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-gt v2, v3, :cond_2

    if-gt p1, v2, :cond_2

    if-eq p1, v2, :cond_0

    invoke-virtual {v0, p1, v2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :cond_0
    iget p1, p0, Lm9/g;->U:I

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lm9/g;->U:I

    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Lm9/a;->a(I)I

    move-result v0

    iget-object v2, p0, Lm9/g;->M:Ll9/y0;

    invoke-virtual {v2, v0}, Ll9/y0;->i(I)V

    :goto_0
    iget-object v0, p0, Lm9/g;->N:[Ll9/y0;

    array-length v2, v0

    if-ge p1, v2, :cond_1

    aget-object v0, v0, p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v1, p1}, Lm9/a;->a(I)I

    move-result v2

    invoke-virtual {v0, v2}, Ll9/y0;->i(I)V

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final p(Lp9/i;JJ)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lm9/d;

    const/4 v2, 0x0

    iput-object v2, v0, Lm9/g;->P:Lm9/d;

    iget-object v3, v0, Lm9/g;->E:Le9/l;

    iget-object v4, v3, Le9/l;->i:[Le9/j;

    instance-of v5, v1, Lm9/i;

    if-eqz v5, :cond_1

    move-object v5, v1

    check-cast v5, Lm9/i;

    iget-object v6, v3, Le9/l;->j:Lo9/s;

    iget-object v5, v5, Lm9/d;->z:Lu8/p;

    invoke-interface {v6, v5}, Lo9/s;->s(Lu8/p;)I

    move-result v5

    aget-object v6, v4, v5

    iget-object v7, v6, Le9/j;->d:Le9/i;

    if-nez v7, :cond_1

    iget-object v7, v6, Le9/j;->a:Lm9/c;

    invoke-static {v7}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v7, v7, Lm9/c;->H:Lt9/e0;

    instance-of v8, v7, Lt9/i;

    if-eqz v8, :cond_0

    move-object v2, v7

    check-cast v2, Lt9/i;

    :cond_0
    if-eqz v2, :cond_1

    new-instance v15, Lan/d;

    iget-object v10, v6, Le9/j;->b:Lf9/m;

    iget-wide v7, v10, Lf9/m;->y:J

    const/4 v9, 0x7

    invoke-direct {v15, v2, v7, v8, v9}, Lan/d;-><init>(Ljava/lang/Object;JI)V

    new-instance v7, Le9/j;

    iget-wide v8, v6, Le9/j;->e:J

    iget-object v11, v6, Le9/j;->c:Lf9/b;

    iget-object v12, v6, Le9/j;->a:Lm9/c;

    iget-wide v13, v6, Le9/j;->f:J

    invoke-direct/range {v7 .. v15}, Le9/j;-><init>(JLf9/m;Lf9/b;Lm9/c;JLe9/i;)V

    aput-object v7, v4, v5

    :cond_1
    iget-object v2, v3, Le9/l;->h:Le9/o;

    if-eqz v2, :cond_4

    iget-wide v3, v2, Le9/o;->d:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v3, v5

    if-eqz v5, :cond_2

    iget-wide v5, v1, Lm9/d;->H:J

    cmp-long v3, v5, v3

    if-lez v3, :cond_3

    :cond_2
    iget-wide v3, v1, Lm9/d;->H:J

    iput-wide v3, v2, Le9/o;->d:J

    :cond_3
    iget-object v2, v2, Le9/o;->e:Le9/p;

    const/4 v3, 0x1

    iput-boolean v3, v2, Le9/p;->G:Z

    :cond_4
    new-instance v5, Ll9/t;

    iget-wide v2, v1, Lm9/d;->w:J

    iget-object v2, v1, Lm9/d;->I:Lz8/m;

    iget-object v2, v2, Lz8/m;->y:Landroid/net/Uri;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    iget-object v2, v0, Lm9/g;->H:Ljc/b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v6, v1, Lm9/d;->y:I

    iget-object v8, v1, Lm9/d;->z:Lu8/p;

    iget v9, v1, Lm9/d;->E:I

    iget-object v10, v1, Lm9/d;->F:Ljava/lang/Object;

    iget-wide v11, v1, Lm9/d;->G:J

    iget-wide v13, v1, Lm9/d;->H:J

    iget-object v4, v0, Lm9/g;->G:Lg9/d;

    iget v7, v0, Lm9/g;->w:I

    invoke-virtual/range {v4 .. v14}, Lg9/d;->d(Ll9/t;IILu8/p;ILjava/lang/Object;JJ)V

    iget-object v1, v0, Lm9/g;->F:Le9/b;

    invoke-virtual {v1, v0}, Le9/b;->b(Ll9/b1;)V

    return-void
.end method

.method public final q(Lp9/i;JJZ)V
    .locals 12

    check-cast p1, Lm9/d;

    const/4 v0, 0x0

    iput-object v0, p0, Lm9/g;->P:Lm9/d;

    iput-object v0, p0, Lm9/g;->V:Lm9/a;

    new-instance v2, Ll9/t;

    iget-wide v0, p1, Lm9/d;->w:J

    iget-object v0, p1, Lm9/d;->I:Lz8/m;

    iget-object v0, v0, Lz8/m;->y:Landroid/net/Uri;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v0, p0, Lm9/g;->H:Ljc/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, p1, Lm9/d;->y:I

    iget-object v5, p1, Lm9/d;->z:Lu8/p;

    iget v6, p1, Lm9/d;->E:I

    iget-object v7, p1, Lm9/d;->F:Ljava/lang/Object;

    iget-wide v8, p1, Lm9/d;->G:J

    iget-wide v10, p1, Lm9/d;->H:J

    iget-object v1, p0, Lm9/g;->G:Lg9/d;

    iget v4, p0, Lm9/g;->w:I

    invoke-virtual/range {v1 .. v11}, Lg9/d;->c(Ll9/t;IILu8/p;ILjava/lang/Object;JJ)V

    if-nez p6, :cond_2

    invoke-virtual {p0}, Lm9/g;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lm9/g;->M:Ll9/y0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll9/y0;->s(Z)V

    iget-object p1, p0, Lm9/g;->N:[Ll9/y0;

    array-length v1, p1

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    invoke-virtual {v3, v0}, Ll9/y0;->s(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lm9/a;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lm9/g;->K:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lm9/g;->o(I)Lm9/a;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-wide v0, p0, Lm9/g;->T:J

    iput-wide v0, p0, Lm9/g;->S:J

    :cond_1
    iget-object p1, p0, Lm9/g;->F:Le9/b;

    invoke-virtual {p1, p0}, Le9/b;->b(Ll9/b1;)V

    :cond_2
    return-void
.end method

.method public final r(Lp9/i;Ljava/io/IOException;I)Lbb/f;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v12, p2

    move-object/from16 v1, p1

    check-cast v1, Lm9/d;

    iget-object v2, v1, Lm9/d;->I:Lz8/m;

    iget-wide v3, v1, Lm9/d;->G:J

    iget-object v5, v1, Lm9/d;->z:Lu8/p;

    iget-wide v6, v2, Lz8/m;->x:J

    instance-of v2, v1, Lm9/a;

    iget-object v8, v0, Lm9/g;->K:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v10, 0x1

    sub-int/2addr v9, v10

    const-wide/16 v13, 0x0

    cmp-long v6, v6, v13

    if-eqz v6, :cond_1

    if-eqz v2, :cond_1

    invoke-virtual {v0, v9}, Lm9/g;->y(I)Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_0
    move v11, v2

    goto :goto_2

    :cond_1
    :goto_1
    move v6, v10

    goto :goto_0

    :goto_2
    new-instance v2, Ll9/t;

    iget-object v15, v1, Lm9/d;->I:Lz8/m;

    iget-object v15, v15, Lz8/m;->y:Landroid/net/Uri;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    sget v15, Lx8/t;->a:I

    iget-object v15, v0, Lm9/g;->E:Le9/l;

    move-wide/from16 v16, v13

    iget-object v13, v15, Le9/l;->i:[Le9/j;

    iget-object v14, v15, Le9/l;->b:La00/g;

    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    iget-object v7, v0, Lm9/g;->H:Ljc/b;

    if-nez v6, :cond_3

    move-object/from16 v21, v2

    move v13, v6

    move-object/from16 v16, v7

    move-object/from16 v17, v8

    :cond_2
    const/4 v2, 0x0

    goto/16 :goto_12

    :cond_3
    iget-object v10, v15, Le9/l;->h:Le9/o;

    if-eqz v10, :cond_9

    move-wide/from16 v21, v3

    move-object v4, v2

    iget-wide v2, v10, Le9/o;->d:J

    cmp-long v23, v2, v18

    if-eqz v23, :cond_4

    cmp-long v2, v2, v21

    if-gez v2, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    iget-object v3, v10, Le9/o;->e:Le9/p;

    iget-object v10, v3, Le9/p;->F:Lf9/c;

    iget-boolean v10, v10, Lf9/c;->d:Z

    if-nez v10, :cond_5

    goto :goto_6

    :cond_5
    iget-boolean v10, v3, Le9/p;->H:Z

    if-eqz v10, :cond_6

    goto :goto_4

    :cond_6
    if-eqz v2, :cond_a

    iget-boolean v2, v3, Le9/p;->G:Z

    if-nez v2, :cond_7

    goto :goto_4

    :cond_7
    const/4 v2, 0x1

    iput-boolean v2, v3, Le9/p;->H:Z

    const/4 v2, 0x0

    iput-boolean v2, v3, Le9/p;->G:Z

    iget-object v2, v3, Le9/p;->x:Le9/d;

    iget-object v2, v2, Le9/d;->w:Le9/h;

    iget-object v3, v2, Le9/h;->D:Landroid/os/Handler;

    iget-object v5, v2, Le9/h;->w:Le9/c;

    invoke-virtual {v3, v5}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Le9/h;->y()V

    :goto_4
    move-object/from16 v21, v4

    move v13, v6

    move-object/from16 v16, v7

    move-object/from16 v17, v8

    :cond_8
    :goto_5
    const/4 v2, 0x1

    goto/16 :goto_12

    :cond_9
    move-object v4, v2

    :cond_a
    :goto_6
    iget-object v2, v15, Le9/l;->k:Lf9/c;

    iget-boolean v2, v2, Lf9/c;->d:Z

    const/16 v3, 0x194

    if-nez v2, :cond_b

    if-eqz v11, :cond_b

    instance-of v2, v12, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;

    if-eqz v2, :cond_b

    move-object v2, v12

    check-cast v2, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;

    iget v2, v2, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;->y:I

    if-ne v2, v3, :cond_b

    iget-object v2, v15, Le9/l;->j:Lo9/s;

    invoke-interface {v2, v5}, Lo9/s;->s(Lu8/p;)I

    move-result v2

    aget-object v2, v13, v2

    invoke-virtual {v2}, Le9/j;->d()J

    move-result-wide v21

    const-wide/16 v23, -0x1

    cmp-long v10, v21, v23

    if-eqz v10, :cond_b

    cmp-long v10, v21, v16

    if-eqz v10, :cond_b

    iget-object v10, v2, Le9/j;->d:Le9/i;

    invoke-static {v10}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-interface {v10}, Le9/i;->B()J

    move-result-wide v16

    move-object v10, v4

    iget-wide v3, v2, Le9/j;->f:J

    add-long v16, v16, v3

    add-long v16, v16, v21

    const-wide/16 v2, 0x1

    sub-long v16, v16, v2

    move-object v2, v1

    check-cast v2, Lm9/a;

    invoke-virtual {v2}, Lm9/a;->d()J

    move-result-wide v2

    cmp-long v2, v2, v16

    if-lez v2, :cond_c

    const/4 v2, 0x1

    iput-boolean v2, v15, Le9/l;->n:Z

    :goto_7
    move v13, v6

    move-object/from16 v16, v7

    move-object/from16 v17, v8

    move-object/from16 v21, v10

    goto :goto_5

    :cond_b
    move-object v10, v4

    :cond_c
    iget-object v2, v15, Le9/l;->j:Lo9/s;

    invoke-interface {v2, v5}, Lo9/s;->s(Lu8/p;)I

    move-result v2

    aget-object v2, v13, v2

    iget-object v3, v2, Le9/j;->b:Lf9/m;

    iget-object v4, v2, Le9/j;->c:Lf9/b;

    iget-object v3, v3, Lf9/m;->x:Lzr/g0;

    invoke-virtual {v14, v3}, La00/g;->C(Ljava/util/List;)Lf9/b;

    move-result-object v3

    if-eqz v3, :cond_d

    invoke-virtual {v4, v3}, Lf9/b;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    goto :goto_7

    :cond_d
    iget-object v3, v15, Le9/l;->j:Lo9/s;

    iget-object v2, v2, Le9/j;->b:Lf9/m;

    iget-object v2, v2, Lf9/m;->x:Lzr/g0;

    move v13, v6

    move-object/from16 v16, v7

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    move-object/from16 v17, v8

    invoke-interface {v3}, Lo9/s;->length()I

    move-result v8

    move-object/from16 v21, v10

    const/4 v10, 0x0

    const/16 v22, 0x0

    :goto_8
    if-ge v10, v8, :cond_f

    invoke-interface {v3, v10, v6, v7}, Lo9/s;->q(IJ)Z

    move-result v24

    if-eqz v24, :cond_e

    add-int/lit8 v22, v22, 0x1

    :cond_e
    add-int/lit8 v10, v10, 0x1

    goto :goto_8

    :cond_f
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    const/4 v6, 0x0

    :goto_9
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_10

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lf9/b;

    iget v7, v7, Lf9/b;->c:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_9

    :cond_10
    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    move-result v3

    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v14, v2}, La00/g;->e(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v2

    const/4 v7, 0x0

    :goto_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v7, v10, :cond_11

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lf9/b;

    iget v10, v10, Lf9/b;->c:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v6, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_a

    :cond_11
    invoke-virtual {v6}, Ljava/util/HashSet;->size()I

    move-result v2

    sub-int v2, v3, v2

    sub-int v8, v8, v22

    const/4 v6, 0x1

    if-le v8, v6, :cond_12

    goto :goto_b

    :cond_12
    sub-int v7, v3, v2

    if-le v7, v6, :cond_2

    :goto_b
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v6, v12, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;

    if-nez v6, :cond_13

    goto :goto_c

    :cond_13
    move-object v6, v12

    check-cast v6, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;

    iget v6, v6, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;->y:I

    const/16 v10, 0x193

    if-eq v6, v10, :cond_16

    const/16 v10, 0x194

    if-eq v6, v10, :cond_16

    const/16 v10, 0x19a

    if-eq v6, v10, :cond_16

    const/16 v10, 0x1a0

    if-eq v6, v10, :cond_16

    const/16 v10, 0x1f4

    if-eq v6, v10, :cond_16

    const/16 v10, 0x1f7

    if-ne v6, v10, :cond_14

    goto :goto_d

    :cond_14
    :goto_c
    move/from16 v23, v2

    move/from16 v20, v3

    :cond_15
    const/4 v6, 0x0

    goto :goto_e

    :cond_16
    :goto_d
    sub-int v6, v3, v2

    const/4 v10, 0x4

    const/4 v7, 0x1

    if-le v6, v7, :cond_17

    new-instance v6, Lbb/f;

    move/from16 v23, v2

    move/from16 v20, v3

    const-wide/32 v2, 0x493e0

    invoke-direct {v6, v7, v2, v3, v10}, Lbb/f;-><init>(IJI)V

    goto :goto_e

    :cond_17
    move/from16 v23, v2

    move/from16 v20, v3

    if-le v8, v7, :cond_15

    new-instance v6, Lbb/f;

    const-wide/32 v2, 0xea60

    const/4 v7, 0x2

    invoke-direct {v6, v7, v2, v3, v10}, Lbb/f;-><init>(IJI)V

    :goto_e
    if-eqz v6, :cond_2

    iget-wide v2, v6, Lbb/f;->b:J

    iget v6, v6, Lbb/f;->a:I

    const/4 v7, 0x1

    if-ne v6, v7, :cond_18

    sub-int v8, v20, v23

    if-le v8, v7, :cond_2

    :goto_f
    const/4 v8, 0x2

    goto :goto_10

    :cond_18
    if-le v8, v7, :cond_2

    goto :goto_f

    :goto_10
    if-ne v6, v8, :cond_19

    iget-object v4, v15, Le9/l;->j:Lo9/s;

    invoke-interface {v4, v5}, Lo9/s;->s(Lu8/p;)I

    move-result v5

    invoke-interface {v4, v5, v2, v3}, Lo9/s;->t(IJ)Z

    move-result v20

    move/from16 v2, v20

    goto :goto_12

    :cond_19
    if-ne v6, v7, :cond_2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    add-long/2addr v5, v2

    iget-object v2, v4, Lf9/b;->b:Ljava/lang/String;

    iget-object v3, v14, La00/g;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1a

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    sget v8, Lx8/t;->a:I

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    goto :goto_11

    :cond_1a
    move-wide v7, v5

    :goto_11
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v3, v2, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v2, v4, Lf9/b;->c:I

    const/high16 v3, -0x80000000

    if-eq v2, v3, :cond_8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, v14, La00/g;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1b

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    sget v7, Lx8/t;->a:I

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    :cond_1b
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_5

    :goto_12
    if-eqz v2, :cond_1f

    if-eqz v13, :cond_1e

    if-eqz v11, :cond_1d

    invoke-virtual {v0, v9}, Lm9/g;->o(I)Lm9/a;

    move-result-object v2

    if-ne v2, v1, :cond_1c

    const/4 v2, 0x1

    goto :goto_13

    :cond_1c
    const/4 v2, 0x0

    :goto_13
    invoke-static {v2}, Lva3/g;->i(Z)V

    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1d

    iget-wide v2, v0, Lm9/g;->T:J

    iput-wide v2, v0, Lm9/g;->S:J

    :cond_1d
    sget-object v2, Lp9/k;->z:Lbb/f;

    goto :goto_14

    :cond_1e
    const-string v2, "ChunkSampleStream"

    const-string v3, "Ignoring attempt to cancel non-cancelable load."

    invoke-static {v2, v3}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1f
    const/4 v2, 0x0

    :goto_14
    if-nez v2, :cond_23

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v2, v12, Landroidx/media3/common/ParserException;

    if-nez v2, :cond_21

    instance-of v2, v12, Ljava/io/FileNotFoundException;

    if-nez v2, :cond_21

    instance-of v2, v12, Landroidx/media3/datasource/HttpDataSource$CleartextNotPermittedException;

    if-nez v2, :cond_21

    instance-of v2, v12, Landroidx/media3/exoplayer/upstream/Loader$UnexpectedLoaderException;

    if-nez v2, :cond_21

    invoke-static {v12}, Landroidx/media3/datasource/DataSourceException;->a(Ljava/io/IOException;)Z

    move-result v2

    if-eqz v2, :cond_20

    goto :goto_15

    :cond_20
    const/16 v20, 0x1

    add-int/lit8 v2, p3, -0x1

    mul-int/lit16 v2, v2, 0x3e8

    const/16 v3, 0x1388

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-long v2, v2

    goto :goto_16

    :cond_21
    :goto_15
    move-wide/from16 v2, v18

    :goto_16
    cmp-long v4, v2, v18

    if-eqz v4, :cond_22

    new-instance v4, Lbb/f;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v2, v3, v5}, Lbb/f;-><init>(IJB)V

    move-object v2, v4

    goto :goto_17

    :cond_22
    const/4 v5, 0x0

    sget-object v2, Lp9/k;->E:Lbb/f;

    :goto_17
    move-object v14, v2

    goto :goto_18

    :cond_23
    const/4 v5, 0x0

    goto :goto_17

    :goto_18
    iget v2, v14, Lbb/f;->a:I

    const/4 v7, 0x1

    if-eqz v2, :cond_25

    if-ne v2, v7, :cond_24

    goto :goto_19

    :cond_24
    move v15, v5

    goto :goto_1a

    :cond_25
    :goto_19
    move v15, v7

    :goto_1a
    xor-int/lit8 v13, v15, 0x1

    iget v3, v1, Lm9/d;->y:I

    iget-object v5, v1, Lm9/d;->z:Lu8/p;

    iget v6, v1, Lm9/d;->E:I

    iget-object v7, v1, Lm9/d;->F:Ljava/lang/Object;

    iget-wide v8, v1, Lm9/d;->G:J

    iget-wide v10, v1, Lm9/d;->H:J

    iget-object v1, v0, Lm9/g;->G:Lg9/d;

    iget v4, v0, Lm9/g;->w:I

    move-object/from16 v17, v14

    move-object/from16 v2, v21

    const/4 v14, 0x0

    invoke-virtual/range {v1 .. v13}, Lg9/d;->e(Ll9/t;IILu8/p;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-nez v15, :cond_26

    iput-object v14, v0, Lm9/g;->P:Lm9/d;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lm9/g;->F:Le9/b;

    invoke-virtual {v1, v0}, Le9/b;->b(Ll9/b1;)V

    :cond_26
    return-object v17
.end method

.method public final v()Lm9/a;
    .locals 2

    iget-object v0, p0, Lm9/g;->K:Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lm4/a;->d(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm9/a;

    return-object v0
.end method

.method public final w(Lp9/i;JI)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lm9/d;

    if-nez p4, :cond_0

    new-instance v2, Ll9/t;

    iget-wide v3, v1, Lm9/d;->w:J

    iget-object v3, v1, Lm9/d;->x:Lz8/g;

    invoke-direct {v2, v3}, Ll9/t;-><init>(Lz8/g;)V

    :goto_0
    move-object v5, v2

    goto :goto_1

    :cond_0
    new-instance v2, Ll9/t;

    iget-wide v3, v1, Lm9/d;->w:J

    iget-object v3, v1, Lm9/d;->I:Lz8/m;

    iget-object v3, v3, Lz8/m;->y:Landroid/net/Uri;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :goto_1
    iget v6, v1, Lm9/d;->y:I

    iget-object v8, v1, Lm9/d;->z:Lu8/p;

    iget v9, v1, Lm9/d;->E:I

    iget-object v10, v1, Lm9/d;->F:Ljava/lang/Object;

    iget-wide v11, v1, Lm9/d;->G:J

    iget-wide v13, v1, Lm9/d;->H:J

    iget-object v4, v0, Lm9/g;->G:Lg9/d;

    iget v7, v0, Lm9/g;->w:I

    move/from16 v15, p4

    invoke-virtual/range {v4 .. v15}, Lg9/d;->f(Ll9/t;IILu8/p;ILjava/lang/Object;JJI)V

    return-void
.end method

.method public final x(Lb9/o0;)Z
    .locals 55

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lm9/g;->Y:Z

    const/4 v2, 0x0

    if-nez v1, :cond_38

    iget-object v1, v0, Lm9/g;->I:Lp9/k;

    invoke-virtual {v1}, Lp9/k;->a()Z

    move-result v3

    if-nez v3, :cond_38

    iget-object v3, v1, Lp9/k;->y:Ljava/io/IOException;

    if-eqz v3, :cond_0

    return v2

    :cond_0
    invoke-virtual {v0}, Lm9/g;->z()Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iget-wide v5, v0, Lm9/g;->S:J

    :goto_0
    move-object v14, v4

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lm9/g;->v()Lm9/a;

    move-result-object v4

    iget-wide v5, v4, Lm9/d;->H:J

    iget-object v4, v0, Lm9/g;->L:Ljava/util/List;

    goto :goto_0

    :goto_1
    iget-object v4, v0, Lm9/g;->E:Le9/l;

    iget-object v7, v4, Le9/l;->i:[Le9/j;

    iget-object v8, v4, Le9/l;->m:Landroidx/media3/exoplayer/source/BehindLiveWindowException;

    iget-object v10, v0, Lm9/g;->J:Lcom/iterable/iterableapi/g1;

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v8, :cond_2

    move/from16 v20, v3

    move-object/from16 v16, v10

    move-wide/from16 v17, v11

    goto/16 :goto_4

    :cond_2
    move-object/from16 v8, p1

    move-object/from16 v16, v10

    iget-wide v9, v8, Lb9/o0;->a:J

    move-wide v8, v9

    move-wide/from16 v17, v11

    sub-long v10, v5, v8

    iget-object v12, v4, Le9/l;->k:Lf9/c;

    move/from16 v20, v3

    iget-wide v2, v12, Lf9/c;->a:J

    invoke-static {v2, v3}, Lx8/t;->J(J)J

    move-result-wide v2

    iget-object v12, v4, Le9/l;->k:Lf9/c;

    iget v15, v4, Le9/l;->l:I

    invoke-virtual {v12, v15}, Lf9/c;->a(I)Lf9/h;

    move-result-object v12

    move-object v15, v14

    iget-wide v13, v12, Lf9/h;->b:J

    invoke-static {v13, v14}, Lx8/t;->J(J)J

    move-result-wide v12

    add-long/2addr v12, v2

    add-long/2addr v12, v5

    iget-object v2, v4, Le9/l;->h:Le9/o;

    if-eqz v2, :cond_a

    iget-object v2, v2, Le9/o;->e:Le9/p;

    iget-object v3, v2, Le9/p;->F:Lf9/c;

    iget-object v14, v2, Le9/p;->x:Le9/d;

    move-object/from16 v22, v7

    iget-boolean v7, v3, Lf9/c;->d:Z

    if-nez v7, :cond_3

    move-wide/from16 v23, v8

    const/4 v3, 0x0

    goto :goto_3

    :cond_3
    iget-boolean v7, v2, Le9/p;->H:Z

    if-eqz v7, :cond_4

    move-wide/from16 v23, v8

    const/4 v3, 0x1

    goto :goto_3

    :cond_4
    move-wide/from16 v23, v8

    iget-wide v7, v3, Lf9/c;->h:J

    iget-object v3, v2, Le9/p;->E:Ljava/util/TreeMap;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/util/TreeMap;->ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    cmp-long v7, v7, v12

    if-gez v7, :cond_7

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    iget-object v3, v14, Le9/d;->w:Le9/h;

    iget-wide v12, v3, Le9/h;->N:J

    cmp-long v9, v12, v17

    if-eqz v9, :cond_5

    cmp-long v9, v12, v7

    if-gez v9, :cond_6

    :cond_5
    iput-wide v7, v3, Le9/h;->N:J

    :cond_6
    const/4 v3, 0x1

    goto :goto_2

    :cond_7
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_9

    iget-boolean v7, v2, Le9/p;->G:Z

    if-nez v7, :cond_8

    goto :goto_3

    :cond_8
    const/4 v7, 0x1

    iput-boolean v7, v2, Le9/p;->H:Z

    const/4 v7, 0x0

    iput-boolean v7, v2, Le9/p;->G:Z

    iget-object v2, v14, Le9/d;->w:Le9/h;

    iget-object v7, v2, Le9/h;->D:Landroid/os/Handler;

    iget-object v8, v2, Le9/h;->w:Le9/c;

    invoke-virtual {v7, v8}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Le9/h;->y()V

    :cond_9
    :goto_3
    if-eqz v3, :cond_b

    :goto_4
    move-object/from16 v22, v1

    move-object/from16 v3, v16

    move-wide/from16 v23, v17

    goto/16 :goto_21

    :cond_a
    move-object/from16 v22, v7

    move-wide/from16 v23, v8

    :cond_b
    iget-wide v2, v4, Le9/l;->f:J

    invoke-static {v2, v3}, Lx8/t;->v(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Lx8/t;->J(J)J

    move-result-wide v2

    iget-object v7, v4, Le9/l;->k:Lf9/c;

    iget-wide v8, v7, Lf9/c;->a:J

    cmp-long v12, v8, v17

    if-nez v12, :cond_c

    move-wide/from16 v7, v17

    goto :goto_5

    :cond_c
    iget v12, v4, Le9/l;->l:I

    invoke-virtual {v7, v12}, Lf9/c;->a(I)Lf9/h;

    move-result-object v7

    iget-wide v12, v7, Lf9/h;->b:J

    add-long/2addr v8, v12

    invoke-static {v8, v9}, Lx8/t;->J(J)J

    move-result-wide v7

    sub-long v7, v2, v7

    :goto_5
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_d

    move-object v14, v15

    const/4 v9, 0x1

    const/16 v21, 0x0

    goto :goto_6

    :cond_d
    move-object v14, v15

    const/4 v9, 0x1

    invoke-static {v9, v14}, Ld;->i(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lm9/a;

    move-object/from16 v21, v12

    :goto_6
    iget-object v12, v4, Le9/l;->j:Lo9/s;

    invoke-interface {v12}, Lo9/s;->length()I

    move-result v12

    new-array v15, v12, [Lm9/j;

    const/4 v13, 0x0

    :goto_7
    if-ge v13, v12, :cond_11

    aget-object v9, v22, v13

    move-wide/from16 v25, v7

    iget-object v7, v9, Le9/j;->d:Le9/i;

    sget-object v8, Lm9/j;->l:Lg73/a;

    if-nez v7, :cond_e

    aput-object v8, v15, v13

    move-wide/from16 v37, v10

    goto :goto_9

    :cond_e
    invoke-virtual {v9, v2, v3}, Le9/j;->b(J)J

    move-result-wide v29

    invoke-virtual {v9, v2, v3}, Le9/j;->c(J)J

    move-result-wide v31

    if-eqz v21, :cond_f

    invoke-virtual/range {v21 .. v21}, Lm9/a;->d()J

    move-result-wide v27

    move-object/from16 v33, v8

    move-wide/from16 v37, v10

    goto :goto_8

    :cond_f
    iget-object v7, v9, Le9/j;->d:Le9/i;

    invoke-static {v7}, Lva3/g;->j(Ljava/lang/Object;)V

    move-wide/from16 v37, v10

    iget-wide v10, v9, Le9/j;->e:J

    invoke-interface {v7, v5, v6, v10, v11}, Le9/i;->u(JJ)J

    move-result-wide v10

    move-object/from16 v33, v8

    iget-wide v7, v9, Le9/j;->f:J

    add-long v27, v10, v7

    invoke-static/range {v27 .. v32}, Lx8/t;->h(JJJ)J

    move-result-wide v27

    :goto_8
    cmp-long v7, v27, v29

    if-gez v7, :cond_10

    aput-object v33, v15, v13

    goto :goto_9

    :cond_10
    move-wide/from16 v35, v31

    invoke-virtual {v4, v13}, Le9/l;->b(I)Le9/j;

    move-result-object v32

    new-instance v31, Le9/k;

    move-wide/from16 v33, v27

    invoke-direct/range {v31 .. v36}, Le9/k;-><init>(Le9/j;JJ)V

    aput-object v31, v15, v13

    :goto_9
    add-int/lit8 v13, v13, 0x1

    move-wide/from16 v7, v25

    move-wide/from16 v10, v37

    const/4 v9, 0x1

    goto :goto_7

    :cond_11
    move-wide/from16 v25, v7

    move-wide/from16 v37, v10

    iget-object v7, v4, Le9/l;->k:Lf9/c;

    iget-boolean v7, v7, Lf9/c;->d:Z

    const-wide/16 v8, 0x0

    if-eqz v7, :cond_12

    const/16 v19, 0x0

    aget-object v7, v22, v19

    invoke-virtual {v7}, Le9/j;->d()J

    move-result-wide v10

    cmp-long v7, v10, v8

    if-nez v7, :cond_13

    :cond_12
    move-wide v9, v8

    goto :goto_b

    :cond_13
    aget-object v7, v22, v19

    invoke-virtual {v7, v2, v3}, Le9/j;->c(J)J

    move-result-wide v10

    aget-object v7, v22, v19

    invoke-virtual {v7, v10, v11}, Le9/j;->e(J)J

    move-result-wide v10

    iget-object v7, v4, Le9/l;->k:Lf9/c;

    iget-wide v12, v7, Lf9/c;->a:J

    cmp-long v22, v12, v17

    if-nez v22, :cond_14

    move-wide/from16 v7, v17

    goto :goto_a

    :cond_14
    iget v8, v4, Le9/l;->l:I

    invoke-virtual {v7, v8}, Lf9/c;->a(I)Lf9/h;

    move-result-object v7

    iget-wide v7, v7, Lf9/h;->b:J

    add-long/2addr v12, v7

    invoke-static {v12, v13}, Lx8/t;->J(J)J

    move-result-wide v7

    sub-long v7, v2, v7

    :goto_a
    invoke-static {v7, v8, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    sub-long v7, v7, v23

    const-wide/16 v9, 0x0

    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    move-wide v12, v7

    goto :goto_c

    :goto_b
    move-wide/from16 v12, v17

    :goto_c
    iget-object v7, v4, Le9/l;->j:Lo9/s;

    move-object/from16 v22, v1

    move-wide/from16 v27, v9

    move-wide/from16 v8, v23

    move-wide/from16 v10, v37

    const/16 p1, 0x1

    move-wide/from16 v23, v17

    move-wide/from16 v53, v2

    move-object/from16 v3, v16

    move-wide/from16 v16, v53

    move-wide/from16 v1, v25

    invoke-interface/range {v7 .. v15}, Lo9/s;->r(JJJLjava/util/List;[Lm9/j;)V

    iget-object v7, v4, Le9/l;->j:Lo9/s;

    invoke-interface {v7}, Lo9/s;->c()I

    move-result v7

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    invoke-virtual {v4, v7}, Le9/l;->b(I)Le9/j;

    move-result-object v7

    iget-wide v11, v7, Le9/j;->e:J

    iget-wide v8, v7, Le9/j;->f:J

    iget-object v10, v7, Le9/j;->d:Le9/i;

    iget-object v13, v7, Le9/j;->c:Lf9/b;

    iget-object v15, v7, Le9/j;->a:Lm9/c;

    move-wide/from16 v25, v8

    iget-object v8, v7, Le9/j;->b:Lf9/m;

    if-eqz v15, :cond_1a

    iget-object v9, v15, Lm9/c;->I:[Lu8/p;

    if-nez v9, :cond_15

    iget-object v9, v8, Lf9/m;->E:Lf9/j;

    goto :goto_d

    :cond_15
    const/4 v9, 0x0

    :goto_d
    if-nez v10, :cond_16

    invoke-virtual {v8}, Lf9/m;->d()Lf9/j;

    move-result-object v18

    move-object/from16 v53, v18

    move-object/from16 v18, v14

    move-object/from16 v14, v53

    goto :goto_e

    :cond_16
    move-object/from16 v18, v14

    const/4 v14, 0x0

    :goto_e
    if-nez v9, :cond_17

    if-eqz v14, :cond_1b

    :cond_17
    iget-object v1, v4, Le9/l;->e:Lz8/f;

    iget-object v2, v4, Le9/l;->j:Lo9/s;

    invoke-interface {v2}, Lo9/s;->n()Lu8/p;

    move-result-object v32

    iget-object v2, v4, Le9/l;->j:Lo9/s;

    invoke-interface {v2}, Lo9/s;->o()I

    move-result v33

    iget-object v2, v4, Le9/l;->j:Lo9/s;

    invoke-interface {v2}, Lo9/s;->g()Ljava/lang/Object;

    move-result-object v34

    if-eqz v9, :cond_19

    iget-object v2, v13, Lf9/b;->a:Ljava/lang/String;

    invoke-virtual {v9, v14, v2}, Lf9/j;->a(Lf9/j;Ljava/lang/String;)Lf9/j;

    move-result-object v2

    if-nez v2, :cond_18

    goto :goto_f

    :cond_18
    move-object v9, v2

    goto :goto_f

    :cond_19
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v9, v14

    :goto_f
    iget-object v2, v13, Lf9/b;->a:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static {v8, v2, v9, v4}, Lse/a;->u(Lf9/m;Ljava/lang/String;Lf9/j;I)Lz8/g;

    move-result-object v31

    new-instance v29, Lm9/i;

    iget-object v2, v7, Le9/j;->a:Lm9/c;

    move-object/from16 v30, v1

    move-object/from16 v35, v2

    invoke-direct/range {v29 .. v35}, Lm9/i;-><init>(Lz8/f;Lz8/g;Lu8/p;ILjava/lang/Object;Lm9/c;)V

    move-object/from16 v1, v29

    iput-object v1, v3, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    goto/16 :goto_21

    :cond_1a
    move-object/from16 v18, v14

    :cond_1b
    iget-object v9, v4, Le9/l;->k:Lf9/c;

    iget-boolean v14, v9, Lf9/c;->d:Z

    if-eqz v14, :cond_1c

    iget v14, v4, Le9/l;->l:I

    iget-object v9, v9, Lf9/c;->m:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    if-ne v14, v9, :cond_1c

    move/from16 v9, p1

    goto :goto_10

    :cond_1c
    const/4 v9, 0x0

    :goto_10
    if-eqz v9, :cond_1e

    cmp-long v14, v11, v23

    if-eqz v14, :cond_1d

    goto :goto_11

    :cond_1d
    const/4 v14, 0x0

    goto :goto_12

    :cond_1e
    :goto_11
    move/from16 v14, p1

    :goto_12
    invoke-virtual {v7}, Le9/j;->d()J

    move-result-wide v29

    cmp-long v27, v29, v27

    if-nez v27, :cond_1f

    iput-boolean v14, v3, Lcom/iterable/iterableapi/g1;->w:Z

    goto/16 :goto_21

    :cond_1f
    move-wide/from16 v53, v16

    move/from16 v17, v14

    move-object/from16 v16, v15

    move-wide/from16 v14, v53

    invoke-virtual {v7, v14, v15}, Le9/j;->b(J)J

    move-result-wide v29

    invoke-virtual {v7, v14, v15}, Le9/j;->c(J)J

    move-result-wide v14

    if-eqz v9, :cond_21

    invoke-virtual {v7, v14, v15}, Le9/j;->e(J)J

    move-result-wide v27

    invoke-virtual {v7, v14, v15}, Le9/j;->f(J)J

    move-result-wide v31

    sub-long v31, v27, v31

    add-long v31, v31, v27

    cmp-long v9, v31, v11

    if-ltz v9, :cond_20

    move/from16 v9, p1

    goto :goto_13

    :cond_20
    const/4 v9, 0x0

    :goto_13
    and-int v9, v17, v9

    goto :goto_14

    :cond_21
    move/from16 v9, v17

    :goto_14
    if-eqz v21, :cond_22

    invoke-virtual/range {v21 .. v21}, Lm9/a;->d()J

    move-result-wide v27

    move-wide/from16 v31, v14

    :goto_15
    move-wide/from16 v14, v27

    goto :goto_16

    :cond_22
    invoke-static {v10}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-interface {v10, v5, v6, v11, v12}, Le9/i;->u(JJ)J

    move-result-wide v27

    add-long v27, v27, v25

    move-wide/from16 v31, v14

    invoke-static/range {v27 .. v32}, Lx8/t;->h(JJJ)J

    move-result-wide v27

    goto :goto_15

    :goto_16
    cmp-long v17, v14, v29

    if-gez v17, :cond_23

    new-instance v1, Landroidx/media3/exoplayer/source/BehindLiveWindowException;

    invoke-direct {v1}, Landroidx/media3/exoplayer/source/BehindLiveWindowException;-><init>()V

    iput-object v1, v4, Le9/l;->m:Landroidx/media3/exoplayer/source/BehindLiveWindowException;

    goto/16 :goto_21

    :cond_23
    cmp-long v17, v14, v31

    if-gtz v17, :cond_2f

    move-wide/from16 v27, v5

    iget-boolean v5, v4, Le9/l;->n:Z

    if-eqz v5, :cond_24

    if-ltz v17, :cond_24

    goto/16 :goto_20

    :cond_24
    if-eqz v9, :cond_25

    invoke-virtual {v7, v14, v15}, Le9/j;->f(J)J

    move-result-wide v5

    cmp-long v5, v5, v11

    if-ltz v5, :cond_25

    move/from16 v9, p1

    iput-boolean v9, v3, Lcom/iterable/iterableapi/g1;->w:Z

    goto/16 :goto_21

    :cond_25
    iget v5, v4, Le9/l;->g:I

    int-to-long v5, v5

    sub-long v29, v31, v14

    const-wide/16 v31, 0x1

    move-wide/from16 v33, v11

    add-long v11, v29, v31

    invoke-static {v5, v6, v11, v12}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    long-to-int v5, v5

    cmp-long v6, v33, v23

    if-eqz v6, :cond_26

    :goto_17
    const/4 v9, 0x1

    if-le v5, v9, :cond_26

    int-to-long v11, v5

    add-long/2addr v11, v14

    sub-long v11, v11, v31

    invoke-virtual {v7, v11, v12}, Le9/j;->f(J)J

    move-result-wide v11

    cmp-long v9, v11, v33

    if-ltz v9, :cond_26

    add-int/lit8 v5, v5, -0x1

    goto :goto_17

    :cond_26
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_27

    move-wide/from16 v43, v27

    goto :goto_18

    :cond_27
    move-wide/from16 v43, v23

    :goto_18
    iget-object v9, v4, Le9/l;->e:Lz8/f;

    iget v11, v4, Le9/l;->d:I

    iget-object v12, v4, Le9/l;->j:Lo9/s;

    invoke-interface {v12}, Lo9/s;->n()Lu8/p;

    move-result-object v36

    iget-object v12, v4, Le9/l;->j:Lo9/s;

    invoke-interface {v12}, Lo9/s;->o()I

    move-result v37

    iget-object v4, v4, Le9/l;->j:Lo9/s;

    invoke-interface {v4}, Lo9/s;->g()Ljava/lang/Object;

    move-result-object v38

    invoke-virtual {v7, v14, v15}, Le9/j;->f(J)J

    move-result-wide v39

    invoke-static {v10}, Lva3/g;->j(Ljava/lang/Object;)V

    move/from16 v45, v11

    sub-long v11, v14, v25

    invoke-interface {v10, v11, v12}, Le9/i;->t(J)Lf9/j;

    move-result-object v4

    if-nez v16, :cond_29

    invoke-virtual {v7, v14, v15}, Le9/j;->e(J)J

    move-result-wide v41

    invoke-virtual {v7, v14, v15, v1, v2}, Le9/j;->g(JJ)Z

    move-result v1

    if-eqz v1, :cond_28

    const/4 v11, 0x0

    goto :goto_19

    :cond_28
    const/16 v11, 0x8

    :goto_19
    iget-object v1, v13, Lf9/b;->a:Ljava/lang/String;

    invoke-static {v8, v1, v4, v11}, Lse/a;->u(Lf9/m;Ljava/lang/String;Lf9/j;I)Lz8/g;

    move-result-object v35

    new-instance v33, Lm9/k;

    move-object/from16 v46, v36

    move-object/from16 v34, v9

    move-wide/from16 v43, v14

    invoke-direct/range {v33 .. v46}, Lm9/k;-><init>(Lz8/f;Lz8/g;Lu8/p;ILjava/lang/Object;JJJILu8/p;)V

    :goto_1a
    move-object/from16 v1, v33

    goto/16 :goto_1f

    :cond_29
    move-wide/from16 v47, v14

    move-wide/from16 v14, v33

    move-object/from16 v34, v9

    move-object/from16 v9, v36

    const/4 v11, 0x1

    const/4 v12, 0x1

    :goto_1b
    if-ge v12, v5, :cond_2b

    move/from16 v18, v5

    move/from16 v17, v6

    int-to-long v5, v12

    add-long v5, v47, v5

    invoke-static {v10}, Lva3/g;->j(Ljava/lang/Object;)V

    sub-long v5, v5, v25

    invoke-interface {v10, v5, v6}, Le9/i;->t(J)Lf9/j;

    move-result-object v5

    iget-object v6, v13, Lf9/b;->a:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lf9/j;->a(Lf9/j;Ljava/lang/String;)Lf9/j;

    move-result-object v5

    if-nez v5, :cond_2a

    goto :goto_1c

    :cond_2a
    add-int/lit8 v11, v11, 0x1

    add-int/lit8 v12, v12, 0x1

    move-object v4, v5

    move/from16 v6, v17

    move/from16 v5, v18

    goto :goto_1b

    :cond_2b
    move/from16 v17, v6

    :goto_1c
    int-to-long v5, v11

    add-long v5, v47, v5

    sub-long v5, v5, v31

    invoke-virtual {v7, v5, v6}, Le9/j;->e(J)J

    move-result-wide v41

    if-eqz v17, :cond_2c

    cmp-long v10, v14, v41

    if-gtz v10, :cond_2c

    move-wide/from16 v45, v14

    goto :goto_1d

    :cond_2c
    move-wide/from16 v45, v23

    :goto_1d
    invoke-virtual {v7, v5, v6, v1, v2}, Le9/j;->g(JJ)Z

    move-result v1

    if-eqz v1, :cond_2d

    const/4 v1, 0x0

    goto :goto_1e

    :cond_2d
    const/16 v1, 0x8

    :goto_1e
    iget-object v2, v13, Lf9/b;->a:Ljava/lang/String;

    invoke-static {v8, v2, v4, v1}, Lse/a;->u(Lf9/m;Ljava/lang/String;Lf9/j;I)Lz8/g;

    move-result-object v35

    iget-wide v1, v8, Lf9/m;->y:J

    neg-long v1, v1

    iget-object v4, v9, Lu8/p;->n:Ljava/lang/String;

    invoke-static {v4}, Lu8/d0;->l(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2e

    add-long v1, v1, v39

    :cond_2e
    move-wide/from16 v50, v1

    new-instance v33, Lm9/h;

    iget-object v1, v7, Le9/j;->a:Lm9/c;

    move-object/from16 v52, v1

    move-object/from16 v36, v9

    move/from16 v49, v11

    invoke-direct/range {v33 .. v52}, Lm9/h;-><init>(Lz8/f;Lz8/g;Lu8/p;ILjava/lang/Object;JJJJJIJLm9/c;)V

    goto :goto_1a

    :goto_1f
    iput-object v1, v3, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    goto :goto_21

    :cond_2f
    :goto_20
    iput-boolean v9, v3, Lcom/iterable/iterableapi/g1;->w:Z

    :goto_21
    iget-boolean v1, v3, Lcom/iterable/iterableapi/g1;->w:Z

    iget-object v2, v3, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    check-cast v2, Lm9/d;

    const/4 v15, 0x0

    iput-object v15, v3, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    const/4 v4, 0x0

    iput-boolean v4, v3, Lcom/iterable/iterableapi/g1;->w:Z

    if-eqz v1, :cond_30

    move-wide/from16 v3, v23

    iput-wide v3, v0, Lm9/g;->S:J

    const/4 v9, 0x1

    iput-boolean v9, v0, Lm9/g;->Y:Z

    return v9

    :cond_30
    if-nez v2, :cond_31

    const/16 v19, 0x0

    goto/16 :goto_25

    :cond_31
    iput-object v2, v0, Lm9/g;->P:Lm9/d;

    instance-of v1, v2, Lm9/a;

    iget-object v3, v0, Lm9/g;->O:Lxl/a;

    if-eqz v1, :cond_36

    move-object v1, v2

    check-cast v1, Lm9/a;

    if-eqz v20, :cond_34

    iget-wide v4, v1, Lm9/d;->G:J

    iget-wide v6, v0, Lm9/g;->S:J

    cmp-long v4, v4, v6

    if-gez v4, :cond_33

    iget-object v4, v0, Lm9/g;->M:Ll9/y0;

    iput-wide v6, v4, Ll9/y0;->t:J

    iget-object v4, v0, Lm9/g;->N:[Ll9/y0;

    array-length v5, v4

    const/4 v6, 0x0

    :goto_22
    if-ge v6, v5, :cond_32

    aget-object v7, v4, v6

    iget-wide v8, v0, Lm9/g;->S:J

    iput-wide v8, v7, Ll9/y0;->t:J

    add-int/lit8 v6, v6, 0x1

    goto :goto_22

    :cond_32
    iget-boolean v4, v0, Lm9/g;->W:Z

    if-eqz v4, :cond_33

    iget-object v4, v1, Lm9/d;->z:Lu8/p;

    iget-object v5, v4, Lu8/p;->n:Ljava/lang/String;

    iget-object v4, v4, Lu8/p;->k:Ljava/lang/String;

    invoke-static {v5, v4}, Lu8/d0;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    const/4 v9, 0x1

    xor-int/2addr v4, v9

    iput-boolean v4, v0, Lm9/g;->X:Z

    :cond_33
    const/4 v4, 0x0

    iput-boolean v4, v0, Lm9/g;->W:Z

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v4, v0, Lm9/g;->S:J

    :cond_34
    iput-object v3, v1, Lm9/a;->M:Lxl/a;

    iget-object v3, v3, Lxl/a;->y:Ljava/lang/Object;

    check-cast v3, [Ll9/y0;

    array-length v4, v3

    new-array v4, v4, [I

    const/4 v5, 0x0

    :goto_23
    array-length v6, v3

    if-ge v5, v6, :cond_35

    aget-object v6, v3, v5

    iget v7, v6, Ll9/y0;->q:I

    iget v6, v6, Ll9/y0;->p:I

    add-int/2addr v7, v6

    aput v7, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_23

    :cond_35
    iput-object v4, v1, Lm9/a;->N:[I

    iget-object v3, v0, Lm9/g;->K:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_24

    :cond_36
    instance-of v1, v2, Lm9/i;

    if-eqz v1, :cond_37

    move-object v1, v2

    check-cast v1, Lm9/i;

    iput-object v3, v1, Lm9/i;->K:Lxl/a;

    :cond_37
    :goto_24
    iget-object v1, v0, Lm9/g;->H:Ljc/b;

    iget v3, v2, Lm9/d;->y:I

    invoke-virtual {v1, v3}, Ljc/b;->q(I)I

    move-result v1

    move-object/from16 v3, v22

    invoke-virtual {v3, v2, v0, v1}, Lp9/k;->d(Lp9/i;Lp9/g;I)V

    const/4 v9, 0x1

    return v9

    :cond_38
    move/from16 v19, v2

    :goto_25
    return v19
.end method

.method public final y(I)Z
    .locals 5

    iget-object v0, p0, Lm9/g;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm9/a;

    iget-object v0, p0, Lm9/g;->M:Ll9/y0;

    invoke-virtual {v0}, Ll9/y0;->l()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lm9/a;->a(I)I

    move-result v2

    const/4 v3, 0x1

    if-le v0, v2, :cond_0

    return v3

    :cond_0
    move v0, v1

    :cond_1
    iget-object v2, p0, Lm9/g;->N:[Ll9/y0;

    array-length v4, v2

    if-ge v0, v4, :cond_2

    aget-object v2, v2, v0

    invoke-virtual {v2}, Ll9/y0;->l()I

    move-result v2

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Lm9/a;->a(I)I

    move-result v4

    if-le v2, v4, :cond_1

    return v3

    :cond_2
    return v1
.end method

.method public final z()Z
    .locals 4

    iget-wide v0, p0, Lm9/g;->S:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
