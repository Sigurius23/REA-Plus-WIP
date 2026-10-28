.class public final La3/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La3/n0;

.field public final b:La3/p;

.field public c:Z

.field public d:Z

.field public final e:Lcom/google/crypto/tink/internal/l0;

.field public final f:Lr1/c;

.field public final g:J

.field public final h:Lr1/c;

.field public i:Ly3/a;


# direct methods
.method public constructor <init>(La3/n0;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/e1;->a:La3/n0;

    new-instance p1, La3/p;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, La3/p;-><init>(I)V

    iput-object p1, p0, La3/e1;->b:La3/p;

    new-instance p1, Lcom/google/crypto/tink/internal/l0;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Lcom/google/crypto/tink/internal/l0;-><init>(I)V

    iput-object p1, p0, La3/e1;->e:Lcom/google/crypto/tink/internal/l0;

    new-instance p1, Lr1/c;

    const/16 v0, 0x10

    new-array v1, v0, [La3/n0;

    invoke-direct {p1, v1}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, La3/e1;->f:Lr1/c;

    const-wide/16 v1, 0x1

    iput-wide v1, p0, La3/e1;->g:J

    new-instance p1, Lr1/c;

    new-array v0, v0, [La3/d1;

    invoke-direct {p1, v0}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, La3/e1;->h:Lr1/c;

    return-void
.end method

.method public static b(La3/n0;Ly3/a;)Z
    .locals 5

    iget-object v0, p0, La3/n0;->G:La3/n0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, La3/n0;->b0(Ly3/a;)Z

    move-result p1

    goto :goto_0

    :cond_1
    invoke-static {p0}, La3/n0;->c0(La3/n0;)Z

    move-result p1

    :goto_0
    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz p1, :cond_4

    if-eqz v0, :cond_4

    iget-object v2, v0, La3/n0;->G:La3/n0;

    const/4 v3, 0x3

    if-nez v2, :cond_2

    invoke-static {v0, v1, v3}, La3/n0;->v0(La3/n0;ZI)V

    return p1

    :cond_2
    invoke-virtual {p0}, La3/n0;->C()La3/j0;

    move-result-object v2

    sget-object v4, La3/j0;->w:La3/j0;

    if-ne v2, v4, :cond_3

    invoke-static {v0, v1, v3}, La3/n0;->t0(La3/n0;ZI)V

    return p1

    :cond_3
    invoke-virtual {p0}, La3/n0;->C()La3/j0;

    move-result-object p0

    sget-object v2, La3/j0;->x:La3/j0;

    if-ne p0, v2, :cond_4

    invoke-virtual {v0, v1}, La3/n0;->s0(Z)V

    :cond_4
    return p1
.end method

.method public static c(La3/n0;Ly3/a;)Z
    .locals 4

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, La3/n0;->n0(Ly3/a;)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p0}, La3/n0;->o0(La3/n0;)Z

    move-result p1

    :goto_0
    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz p1, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {p0}, La3/n0;->B()La3/j0;

    move-result-object v1

    sget-object v2, La3/j0;->w:La3/j0;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_1

    const/4 p0, 0x3

    invoke-static {v0, v3, p0}, La3/n0;->v0(La3/n0;ZI)V

    return p1

    :cond_1
    invoke-virtual {p0}, La3/n0;->B()La3/j0;

    move-result-object p0

    sget-object v1, La3/j0;->x:La3/j0;

    if-ne p0, v1, :cond_2

    invoke-virtual {v0, v3}, La3/n0;->u0(Z)V

    :cond_2
    return p1
.end method

.method public static h(La3/n0;)Z
    .locals 3

    invoke-virtual {p0}, La3/n0;->x()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, La3/n0;->C()La3/j0;

    move-result-object v0

    sget-object v1, La3/j0;->y:La3/j0;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, La3/n0;->t()La3/r0;

    move-result-object p0

    iget-object p0, p0, La3/r0;->q:La3/c1;

    if-eqz p0, :cond_1

    iget-object p0, p0, La3/c1;->S:La3/s0;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, La3/a;->f()Z

    move-result p0

    if-ne p0, v2, :cond_1

    :cond_0
    return v2

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static i(La3/n0;)Z
    .locals 2

    invoke-virtual {p0}, La3/n0;->A()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_0
    invoke-virtual {p0}, La3/n0;->B()La3/j0;

    move-result-object v0

    sget-object v1, La3/j0;->y:La3/j0;

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, La3/n0;->t()La3/r0;

    move-result-object v0

    iget-object v0, v0, La3/r0;->p:La3/g1;

    iget-object v0, v0, La3/g1;->Y:La3/o0;

    invoke-virtual {v0}, La3/a;->f()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, La3/n0;->v()La3/h0;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    sget-object v1, La3/h0;->w:La3/h0;

    if-ne v0, v1, :cond_4

    :cond_2
    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object p0

    if-nez p0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, La3/n0;->Y()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_4
    :goto_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(Z)V
    .locals 7

    const/4 v0, 0x1

    iget-object v1, p0, La3/e1;->e:Lcom/google/crypto/tink/internal/l0;

    if-eqz p1, :cond_0

    iget-object p1, v1, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast p1, Lr1/c;

    iget-object v2, p0, La3/e1;->a:La3/n0;

    iget v3, v2, La3/n0;->n0:I

    if-lez v3, :cond_0

    invoke-virtual {p1}, Lr1/c;->g()V

    invoke-virtual {p1, v2}, Lr1/c;->b(Ljava/lang/Object;)V

    iput-boolean v0, v2, La3/n0;->m0:Z

    :cond_0
    iget-object p1, v1, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast p1, Lr1/c;

    iget v2, p1, Lr1/c;->y:I

    if-eqz v2, :cond_6

    sget-object v3, La3/y1;->x:La3/y1;

    iget-object v4, p1, Lr1/c;->w:[Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {v4, v3, v5, v2}, Lm83/n;->P0([Ljava/lang/Object;Ljava/util/Comparator;II)V

    iget v2, p1, Lr1/c;->y:I

    iget-object v3, v1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v3, [La3/n0;

    if-eqz v3, :cond_1

    array-length v4, v3

    if-ge v4, v2, :cond_2

    :cond_1
    const/16 v3, 0x10

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v3

    new-array v3, v3, [La3/n0;

    :cond_2
    const/4 v4, 0x0

    iput-object v4, v1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    :goto_0
    if-ge v5, v2, :cond_3

    iget-object v6, p1, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v6, v6, v5

    aput-object v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lr1/c;->g()V

    sub-int/2addr v2, v0

    :goto_1
    const/4 p1, -0x1

    if-ge p1, v2, :cond_5

    aget-object p1, v3, v2

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-boolean v0, p1, La3/n0;->m0:Z

    if-eqz v0, :cond_4

    invoke-static {p1}, Lcom/google/crypto/tink/internal/l0;->J(La3/n0;)V

    :cond_4
    aput-object v4, v3, v2

    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_5
    iput-object v3, v1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    :cond_6
    return-void
.end method

.method public final d()V
    .locals 8

    iget-object v0, p0, La3/e1;->h:Lr1/c;

    iget v1, v0, Lr1/c;->y:I

    if-eqz v1, :cond_3

    iget-object v2, v0, Lr1/c;->w:[Ljava/lang/Object;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v2, v3

    check-cast v4, La3/d1;

    iget-object v5, v4, La3/d1;->a:La3/n0;

    iget-boolean v6, v4, La3/d1;->c:Z

    iget-object v7, v4, La3/d1;->a:La3/n0;

    invoke-virtual {v5}, La3/n0;->X()Z

    move-result v5

    if-eqz v5, :cond_1

    iget-boolean v4, v4, La3/d1;->b:Z

    const/4 v5, 0x2

    if-nez v4, :cond_0

    invoke-static {v7, v6, v5}, La3/n0;->v0(La3/n0;ZI)V

    goto :goto_1

    :cond_0
    invoke-static {v7, v6, v5}, La3/n0;->t0(La3/n0;ZI)V

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lr1/c;->g()V

    :cond_3
    return-void
.end method

.method public final e(La3/n0;)V
    .locals 5

    invoke-virtual {p1}, La3/n0;->M()Lr1/c;

    move-result-object p1

    iget-object v0, p1, Lr1/c;->w:[Ljava/lang/Object;

    iget p1, p1, Lr1/c;->y:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_2

    aget-object v2, v0, v1

    check-cast v2, La3/n0;

    invoke-virtual {v2}, La3/n0;->a0()Ljava/lang/Boolean;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-boolean v3, v2, La3/n0;->o0:Z

    if-nez v3, :cond_1

    iget-object v3, p0, La3/e1;->b:La3/p;

    invoke-virtual {v3, v2}, La3/p;->s(La3/n0;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, La3/n0;->d0()V

    :cond_0
    invoke-virtual {p0, v2}, La3/e1;->e(La3/n0;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final f(La3/n0;Z)V
    .locals 1

    iget-boolean v0, p0, La3/e1;->c:Z

    if-nez v0, :cond_0

    const-string v0, "forceMeasureTheSubtree should be executed during the measureAndLayout pass"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p1}, La3/n0;->x()Z

    move-result v0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, La3/n0;->A()Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_2

    const-string v0, "node not yet measured"

    invoke-static {v0}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p1, p2}, La3/e1;->g(La3/n0;Z)V

    return-void
.end method

.method public final g(La3/n0;Z)V
    .locals 8

    invoke-virtual {p1}, La3/n0;->M()Lr1/c;

    move-result-object v0

    iget-object v1, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_8

    aget-object v4, v1, v3

    check-cast v4, La3/n0;

    const/4 v5, 0x1

    if-nez p2, :cond_0

    invoke-virtual {v4}, La3/n0;->B()La3/j0;

    move-result-object v6

    sget-object v7, La3/j0;->w:La3/j0;

    if-eq v6, v7, :cond_1

    invoke-virtual {v4}, La3/n0;->t()La3/r0;

    move-result-object v6

    iget-object v6, v6, La3/r0;->p:La3/g1;

    iget-object v6, v6, La3/g1;->Y:La3/o0;

    invoke-virtual {v6}, La3/a;->f()Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_7

    invoke-virtual {v4}, La3/n0;->C()La3/j0;

    move-result-object v6

    sget-object v7, La3/j0;->w:La3/j0;

    if-eq v6, v7, :cond_1

    invoke-virtual {v4}, La3/n0;->t()La3/r0;

    move-result-object v6

    iget-object v6, v6, La3/r0;->q:La3/c1;

    if-eqz v6, :cond_7

    iget-object v6, v6, La3/c1;->S:La3/s0;

    if-eqz v6, :cond_7

    invoke-virtual {v6}, La3/a;->f()Z

    move-result v6

    if-ne v6, v5, :cond_7

    :cond_1
    :goto_1
    invoke-static {v4}, La3/g;->k(La3/n0;)Z

    move-result v6

    if-eqz v6, :cond_3

    if-nez p2, :cond_3

    invoke-virtual {v4}, La3/n0;->x()Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v6, p0, La3/e1;->b:La3/p;

    invoke-virtual {v6, v4}, La3/p;->s(La3/n0;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {p0, v4, v5, v2}, La3/e1;->m(La3/n0;ZZ)Z

    goto :goto_2

    :cond_2
    invoke-virtual {p0, v4, v5}, La3/e1;->f(La3/n0;Z)V

    :cond_3
    :goto_2
    if-eqz p2, :cond_4

    invoke-virtual {v4}, La3/n0;->x()Z

    move-result v5

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, La3/n0;->A()Z

    move-result v5

    :goto_3
    if-eqz v5, :cond_5

    invoke-virtual {p0, v4, p2, v2}, La3/e1;->m(La3/n0;ZZ)Z

    :cond_5
    if-eqz p2, :cond_6

    invoke-virtual {v4}, La3/n0;->x()Z

    move-result v5

    goto :goto_4

    :cond_6
    invoke-virtual {v4}, La3/n0;->A()Z

    move-result v5

    :goto_4
    if-nez v5, :cond_7

    invoke-virtual {p0, v4, p2}, La3/e1;->g(La3/n0;Z)V

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_8
    if-eqz p2, :cond_9

    invoke-virtual {p1}, La3/n0;->x()Z

    move-result v0

    goto :goto_5

    :cond_9
    invoke-virtual {p1}, La3/n0;->A()Z

    move-result v0

    :goto_5
    if-eqz v0, :cond_a

    invoke-virtual {p0, p1, p2, v2}, La3/e1;->m(La3/n0;ZZ)Z

    :cond_a
    return-void
.end method

.method public final j(Lb3/w;)Z
    .locals 16

    move-object/from16 v1, p0

    iget-object v0, v1, La3/e1;->b:La3/p;

    iget-object v2, v1, La3/e1;->a:La3/n0;

    invoke-virtual {v2}, La3/n0;->X()Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "performMeasureAndLayout called with unattached root"

    invoke-static {v3}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v2}, La3/n0;->Y()Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "performMeasureAndLayout called with unplaced root"

    invoke-static {v3}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_1
    iget-boolean v3, v1, La3/e1;->c:Z

    if-eqz v3, :cond_2

    const-string v3, "performMeasureAndLayout called during measure layout"

    invoke-static {v3}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_2
    iget-object v3, v1, La3/e1;->i:Ly3/a;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_d

    iput-boolean v5, v1, La3/e1;->c:Z

    iput-boolean v5, v1, La3/e1;->d:Z

    :try_start_0
    invoke-virtual {v0}, La3/p;->D()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v6, v0, La3/p;->x:Ljava/lang/Object;

    check-cast v6, Laj/c;

    if-eqz v3, :cond_b

    move v3, v4

    :cond_3
    :goto_0
    :try_start_1
    iget-object v7, v0, La3/p;->z:Ljava/lang/Object;

    check-cast v7, Laj/c;

    iget-object v8, v0, La3/p;->y:Ljava/lang/Object;

    check-cast v8, Laj/c;

    iget-object v9, v6, Laj/c;->x:Ljava/lang/Object;

    check-cast v9, La3/k2;

    invoke-virtual {v9}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_5

    iget-object v7, v6, Laj/c;->x:Ljava/lang/Object;

    check-cast v7, La3/k2;

    invoke-virtual {v7}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La3/n0;

    invoke-virtual {v6, v7}, Laj/c;->R(La3/n0;)Z

    iget-object v8, v7, La3/n0;->G:La3/n0;

    if-eqz v8, :cond_4

    move v8, v5

    goto :goto_1

    :cond_4
    move v8, v4

    :goto_1
    move v9, v4

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_5
    iget-object v9, v8, Laj/c;->x:Ljava/lang/Object;

    check-cast v9, La3/k2;

    invoke-virtual {v9}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_7

    iget-object v7, v8, Laj/c;->x:Ljava/lang/Object;

    check-cast v7, La3/k2;

    invoke-virtual {v7}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La3/n0;

    invoke-virtual {v8, v7}, Laj/c;->R(La3/n0;)Z

    iget-object v8, v7, La3/n0;->G:La3/n0;

    if-eqz v8, :cond_6

    move v8, v5

    goto :goto_2

    :cond_6
    move v8, v4

    :goto_2
    move v9, v5

    goto :goto_3

    :cond_7
    iget-object v8, v7, Laj/c;->x:Ljava/lang/Object;

    check-cast v8, La3/k2;

    invoke-virtual {v8}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_a

    iget-object v8, v7, Laj/c;->x:Ljava/lang/Object;

    check-cast v8, La3/k2;

    invoke-virtual {v8}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La3/n0;

    invoke-virtual {v7, v8}, Laj/c;->R(La3/n0;)Z

    move v9, v5

    move-object v7, v8

    move v8, v4

    :goto_3
    invoke-virtual {v1, v7, v8, v9}, La3/e1;->m(La3/n0;ZZ)Z

    move-result v8

    if-nez v9, :cond_9

    invoke-virtual {v7}, La3/n0;->w()Z

    move-result v9

    if-eqz v9, :cond_8

    sget-object v9, La3/y;->x:La3/y;

    invoke-virtual {v0, v7, v9}, La3/p;->b(La3/n0;La3/y;)V

    :cond_8
    invoke-virtual {v7}, La3/n0;->u()Z

    move-result v9

    if-eqz v9, :cond_9

    sget-object v9, La3/y;->z:La3/y;

    invoke-virtual {v0, v7, v9}, La3/p;->b(La3/n0;La3/y;)V

    :cond_9
    if-ne v7, v2, :cond_3

    if-eqz v8, :cond_3

    move v3, v5

    goto/16 :goto_0

    :cond_a
    if-eqz p1, :cond_c

    invoke-virtual/range {p1 .. p1}, Lb3/w;->invoke()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :cond_b
    move v3, v4

    :cond_c
    :goto_4
    iput-boolean v4, v1, La3/e1;->c:Z

    iput-boolean v4, v1, La3/e1;->d:Z

    goto :goto_6

    :goto_5
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    iput-boolean v4, v1, La3/e1;->c:Z

    iput-boolean v4, v1, La3/e1;->d:Z

    throw v0

    :cond_d
    move v3, v4

    :goto_6
    iget-object v0, v1, La3/e1;->f:Lr1/c;

    iget-object v2, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v6, v0, Lr1/c;->y:I

    move v7, v4

    :goto_7
    if-ge v7, v6, :cond_19

    aget-object v8, v2, v7

    check-cast v8, La3/n0;

    iget-object v8, v8, La3/n0;->e0:La3/l1;

    iget-object v9, v8, La3/l1;->d:Ljava/lang/Object;

    check-cast v9, Landroidx/compose/ui/node/a;

    const/16 v10, 0x80

    invoke-static {v10}, La3/r1;->g(I)Z

    move-result v11

    if-eqz v11, :cond_e

    iget-object v12, v9, Landroidx/compose/ui/node/a;->p0:La3/l2;

    goto :goto_8

    :cond_e
    iget-object v12, v9, Landroidx/compose/ui/node/a;->p0:La3/l2;

    iget-object v12, v12, Lb2/v;->E:Lb2/v;

    if-nez v12, :cond_f

    goto/16 :goto_f

    :cond_f
    :goto_8
    sget-object v13, Landroidx/compose/ui/node/NodeCoordinator;->k0:Li2/x0;

    invoke-virtual {v9, v11}, Landroidx/compose/ui/node/NodeCoordinator;->i1(Z)Lb2/v;

    move-result-object v9

    :goto_9
    if-eqz v9, :cond_18

    iget v11, v9, Lb2/v;->z:I

    and-int/2addr v11, v10

    if-eqz v11, :cond_18

    iget v11, v9, Lb2/v;->y:I

    and-int/2addr v11, v10

    if-eqz v11, :cond_17

    move-object v13, v9

    const/4 v14, 0x0

    :goto_a
    if-eqz v13, :cond_17

    instance-of v15, v13, La3/a0;

    if-eqz v15, :cond_10

    check-cast v13, La3/a0;

    iget-object v15, v8, La3/l1;->d:Ljava/lang/Object;

    check-cast v15, Landroidx/compose/ui/node/a;

    invoke-interface {v13, v15}, La3/a0;->N(Ly2/y;)V

    goto :goto_e

    :cond_10
    iget v15, v13, Lb2/v;->y:I

    and-int/2addr v15, v10

    if-eqz v15, :cond_16

    instance-of v15, v13, La3/o;

    if-eqz v15, :cond_16

    move-object v15, v13

    check-cast v15, La3/o;

    iget-object v15, v15, La3/o;->P:Lb2/v;

    :goto_b
    if-eqz v15, :cond_15

    iget v11, v15, Lb2/v;->y:I

    and-int/2addr v11, v10

    if-eqz v11, :cond_14

    add-int/lit8 v4, v4, 0x1

    if-ne v4, v5, :cond_11

    move-object v13, v15

    goto :goto_c

    :cond_11
    if-nez v14, :cond_12

    new-instance v14, Lr1/c;

    const/16 v11, 0x10

    new-array v11, v11, [Lb2/v;

    invoke-direct {v14, v11}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_12
    if-eqz v13, :cond_13

    invoke-virtual {v14, v13}, Lr1/c;->b(Ljava/lang/Object;)V

    const/4 v13, 0x0

    :cond_13
    invoke-virtual {v14, v15}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_14
    :goto_c
    iget-object v15, v15, Lb2/v;->F:Lb2/v;

    goto :goto_b

    :cond_15
    if-ne v4, v5, :cond_16

    :goto_d
    const/4 v4, 0x0

    goto :goto_a

    :cond_16
    :goto_e
    invoke-static {v14}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v13

    goto :goto_d

    :cond_17
    if-eq v9, v12, :cond_18

    iget-object v9, v9, Lb2/v;->F:Lb2/v;

    const/4 v4, 0x0

    goto :goto_9

    :cond_18
    :goto_f
    add-int/lit8 v7, v7, 0x1

    const/4 v4, 0x0

    goto/16 :goto_7

    :cond_19
    invoke-virtual {v0}, Lr1/c;->g()V

    return v3
.end method

.method public final k(La3/n0;J)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v2, p2

    iget-boolean v4, v0, La3/n0;->o0:Z

    if-eqz v4, :cond_0

    return-void

    :cond_0
    iget-object v4, v1, La3/e1;->a:La3/n0;

    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "measureAndLayout called on root"

    invoke-static {v5}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v4}, La3/n0;->X()Z

    move-result v5

    if-nez v5, :cond_2

    const-string v5, "performMeasureAndLayout called with unattached root"

    invoke-static {v5}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v4}, La3/n0;->Y()Z

    move-result v4

    if-nez v4, :cond_3

    const-string v4, "performMeasureAndLayout called with unplaced root"

    invoke-static {v4}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_3
    iget-boolean v4, v1, La3/e1;->c:Z

    if-eqz v4, :cond_4

    const-string v4, "performMeasureAndLayout called during measure layout"

    invoke-static {v4}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_4
    iget-object v4, v1, La3/e1;->i:Ly3/a;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_8

    iput-boolean v5, v1, La3/e1;->c:Z

    iput-boolean v6, v1, La3/e1;->d:Z

    :try_start_0
    iget-object v4, v1, La3/e1;->b:La3/p;

    iget-object v7, v4, La3/p;->x:Ljava/lang/Object;

    check-cast v7, Laj/c;

    invoke-virtual {v7, v0}, Laj/c;->R(La3/n0;)Z

    iget-object v7, v4, La3/p;->y:Ljava/lang/Object;

    check-cast v7, Laj/c;

    invoke-virtual {v7, v0}, Laj/c;->R(La3/n0;)Z

    iget-object v4, v4, La3/p;->z:Ljava/lang/Object;

    check-cast v4, Laj/c;

    invoke-virtual {v4, v0}, Laj/c;->R(La3/n0;)Z

    new-instance v4, Ly3/a;

    invoke-direct {v4, v2, v3}, Ly3/a;-><init>(J)V

    invoke-static {v0, v4}, La3/e1;->b(La3/n0;Ly3/a;)Z

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual {v0}, La3/n0;->w()Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_5
    :goto_0
    invoke-virtual {v0}, La3/n0;->a0()Ljava/lang/Boolean;

    move-result-object v4

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v0}, La3/n0;->d0()V

    :cond_6
    invoke-virtual/range {p0 .. p1}, La3/e1;->e(La3/n0;)V

    new-instance v4, Ly3/a;

    invoke-direct {v4, v2, v3}, Ly3/a;-><init>(J)V

    invoke-static {v0, v4}, La3/e1;->c(La3/n0;Ly3/a;)Z

    invoke-virtual {v0}, La3/n0;->u()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v0}, La3/n0;->Y()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v0}, La3/n0;->r0()V

    iget-object v2, v1, La3/e1;->e:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v0, La3/n0;->n0:I

    if-lez v3, :cond_7

    iget-object v2, v2, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v2, Lr1/c;

    invoke-virtual {v2, v0}, Lr1/c;->b(Ljava/lang/Object;)V

    iput-boolean v5, v0, La3/n0;->m0:Z

    :cond_7
    invoke-virtual {v1}, La3/e1;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v6, v1, La3/e1;->c:Z

    iput-boolean v6, v1, La3/e1;->d:Z

    goto :goto_2

    :goto_1
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    iput-boolean v6, v1, La3/e1;->c:Z

    iput-boolean v6, v1, La3/e1;->d:Z

    throw v0

    :cond_8
    :goto_2
    iget-object v0, v1, La3/e1;->f:Lr1/c;

    iget-object v2, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v3, v0, Lr1/c;->y:I

    move v4, v6

    :goto_3
    if-ge v4, v3, :cond_14

    aget-object v7, v2, v4

    check-cast v7, La3/n0;

    iget-object v7, v7, La3/n0;->e0:La3/l1;

    iget-object v8, v7, La3/l1;->d:Ljava/lang/Object;

    check-cast v8, Landroidx/compose/ui/node/a;

    const/16 v9, 0x80

    invoke-static {v9}, La3/r1;->g(I)Z

    move-result v10

    if-eqz v10, :cond_9

    iget-object v11, v8, Landroidx/compose/ui/node/a;->p0:La3/l2;

    goto :goto_4

    :cond_9
    iget-object v11, v8, Landroidx/compose/ui/node/a;->p0:La3/l2;

    iget-object v11, v11, Lb2/v;->E:Lb2/v;

    if-nez v11, :cond_a

    goto/16 :goto_b

    :cond_a
    :goto_4
    sget-object v12, Landroidx/compose/ui/node/NodeCoordinator;->k0:Li2/x0;

    invoke-virtual {v8, v10}, Landroidx/compose/ui/node/NodeCoordinator;->i1(Z)Lb2/v;

    move-result-object v8

    :goto_5
    if-eqz v8, :cond_13

    iget v10, v8, Lb2/v;->z:I

    and-int/2addr v10, v9

    if-eqz v10, :cond_13

    iget v10, v8, Lb2/v;->y:I

    and-int/2addr v10, v9

    if-eqz v10, :cond_12

    const/4 v10, 0x0

    move-object v12, v8

    move-object v13, v10

    :goto_6
    if-eqz v12, :cond_12

    instance-of v14, v12, La3/a0;

    if-eqz v14, :cond_b

    check-cast v12, La3/a0;

    iget-object v14, v7, La3/l1;->d:Ljava/lang/Object;

    check-cast v14, Landroidx/compose/ui/node/a;

    invoke-interface {v12, v14}, La3/a0;->N(Ly2/y;)V

    goto :goto_a

    :cond_b
    iget v14, v12, Lb2/v;->y:I

    and-int/2addr v14, v9

    if-eqz v14, :cond_11

    instance-of v14, v12, La3/o;

    if-eqz v14, :cond_11

    move-object v14, v12

    check-cast v14, La3/o;

    iget-object v14, v14, La3/o;->P:Lb2/v;

    move v15, v6

    :goto_7
    if-eqz v14, :cond_10

    iget v6, v14, Lb2/v;->y:I

    and-int/2addr v6, v9

    if-eqz v6, :cond_f

    add-int/lit8 v15, v15, 0x1

    if-ne v15, v5, :cond_c

    move-object v12, v14

    goto :goto_8

    :cond_c
    if-nez v13, :cond_d

    new-instance v13, Lr1/c;

    const/16 v6, 0x10

    new-array v6, v6, [Lb2/v;

    invoke-direct {v13, v6}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_d
    if-eqz v12, :cond_e

    invoke-virtual {v13, v12}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v12, v10

    :cond_e
    invoke-virtual {v13, v14}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_f
    :goto_8
    iget-object v14, v14, Lb2/v;->F:Lb2/v;

    const/4 v6, 0x0

    goto :goto_7

    :cond_10
    if-ne v15, v5, :cond_11

    :goto_9
    const/4 v6, 0x0

    goto :goto_6

    :cond_11
    :goto_a
    invoke-static {v13}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v12

    goto :goto_9

    :cond_12
    if-eq v8, v11, :cond_13

    iget-object v8, v8, Lb2/v;->F:Lb2/v;

    const/4 v6, 0x0

    goto :goto_5

    :cond_13
    :goto_b
    add-int/lit8 v4, v4, 0x1

    const/4 v6, 0x0

    goto/16 :goto_3

    :cond_14
    invoke-virtual {v0}, Lr1/c;->g()V

    return-void
.end method

.method public final l()V
    .locals 5

    iget-object v0, p0, La3/e1;->b:La3/p;

    invoke-virtual {v0}, La3/p;->D()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, La3/e1;->a:La3/n0;

    invoke-virtual {v1}, La3/n0;->X()Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "performMeasureAndLayout called with unattached root"

    invoke-static {v2}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v1}, La3/n0;->Y()Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "performMeasureAndLayout called with unplaced root"

    invoke-static {v2}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_1
    iget-boolean v2, p0, La3/e1;->c:Z

    if-eqz v2, :cond_2

    const-string v2, "performMeasureAndLayout called during measure layout"

    invoke-static {v2}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_2
    iget-object v2, p0, La3/e1;->i:Ly3/a;

    if-eqz v2, :cond_5

    const/4 v2, 0x1

    iput-boolean v2, p0, La3/e1;->c:Z

    const/4 v3, 0x0

    iput-boolean v3, p0, La3/e1;->d:Z

    :try_start_0
    iget-object v4, v0, La3/p;->z:Ljava/lang/Object;

    check-cast v4, Laj/c;

    iget-object v4, v4, Laj/c;->x:Ljava/lang/Object;

    check-cast v4, La3/k2;

    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_4

    iget-object v0, v0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Laj/c;

    iget-object v0, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, La3/k2;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, v1, La3/n0;->G:La3/n0;

    if-eqz v0, :cond_3

    invoke-virtual {p0, v1, v2}, La3/e1;->o(La3/n0;Z)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v1}, La3/e1;->n(La3/n0;)V

    :cond_4
    :goto_0
    invoke-virtual {p0, v1, v3}, La3/e1;->o(La3/n0;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v3, p0, La3/e1;->c:Z

    iput-boolean v3, p0, La3/e1;->d:Z

    return-void

    :goto_1
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    iput-boolean v3, p0, La3/e1;->c:Z

    iput-boolean v3, p0, La3/e1;->d:Z

    throw v0

    :cond_5
    return-void
.end method

.method public final m(La3/n0;ZZ)Z
    .locals 3

    iget-boolean v0, p1, La3/n0;->o0:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, La3/n0;->Y()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, La3/n0;->Z()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1}, La3/e1;->i(La3/n0;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, La3/n0;->a0()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1}, La3/e1;->h(La3/n0;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, La3/n0;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return v1

    :cond_2
    :goto_1
    iget-object v0, p0, La3/e1;->a:La3/n0;

    if-ne p1, v0, :cond_3

    iget-object v2, p0, La3/e1;->i:Ly3/a;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    if-eqz p2, :cond_6

    invoke-virtual {p1}, La3/n0;->x()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-static {p1, v2}, La3/e1;->b(La3/n0;Ly3/a;)Z

    move-result v1

    :cond_4
    if-eqz p3, :cond_b

    if-nez v1, :cond_5

    invoke-virtual {p1}, La3/n0;->w()Z

    move-result p2

    if-eqz p2, :cond_b

    :cond_5
    invoke-virtual {p1}, La3/n0;->a0()Ljava/lang/Boolean;

    move-result-object p2

    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-virtual {p1}, La3/n0;->d0()V

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, La3/n0;->A()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-static {p1, v2}, La3/e1;->c(La3/n0;Ly3/a;)Z

    move-result v1

    :cond_7
    if-eqz p3, :cond_b

    invoke-virtual {p1}, La3/n0;->u()Z

    move-result p2

    if-eqz p2, :cond_b

    const/4 p2, 0x1

    if-eq p1, v0, :cond_8

    invoke-virtual {p1}, La3/n0;->G()La3/n0;

    move-result-object p3

    if-eqz p3, :cond_b

    invoke-virtual {p3}, La3/n0;->Y()Z

    move-result p3

    if-ne p3, p2, :cond_b

    invoke-virtual {p1}, La3/n0;->Z()Z

    move-result p3

    if-eqz p3, :cond_b

    :cond_8
    if-ne p1, v0, :cond_9

    invoke-virtual {p1}, La3/n0;->m0()V

    goto :goto_3

    :cond_9
    invoke-virtual {p1}, La3/n0;->r0()V

    :goto_3
    iget-object p3, p0, La3/e1;->e:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p1, La3/n0;->n0:I

    if-lez v0, :cond_a

    iget-object p3, p3, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast p3, Lr1/c;

    invoke-virtual {p3, p1}, Lr1/c;->b(Ljava/lang/Object;)V

    iput-boolean p2, p1, La3/n0;->m0:Z

    :cond_a
    invoke-static {p1}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object p2

    invoke-interface {p2}, Landroidx/compose/ui/node/Owner;->getRectManager()Lj3/b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lj3/b;->e(La3/n0;)V

    :cond_b
    :goto_4
    invoke-virtual {p0}, La3/e1;->d()V

    return v1
.end method

.method public final n(La3/n0;)V
    .locals 5

    invoke-virtual {p1}, La3/n0;->M()Lr1/c;

    move-result-object p1

    iget-object v0, p1, Lr1/c;->w:[Ljava/lang/Object;

    iget p1, p1, Lr1/c;->y:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_3

    aget-object v2, v0, v1

    check-cast v2, La3/n0;

    invoke-virtual {v2}, La3/n0;->B()La3/j0;

    move-result-object v3

    sget-object v4, La3/j0;->w:La3/j0;

    if-eq v3, v4, :cond_0

    invoke-virtual {v2}, La3/n0;->t()La3/r0;

    move-result-object v3

    iget-object v3, v3, La3/r0;->p:La3/g1;

    iget-object v3, v3, La3/g1;->Y:La3/o0;

    invoke-virtual {v3}, La3/a;->f()Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_0
    invoke-static {v2}, La3/g;->k(La3/n0;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    invoke-virtual {p0, v2, v3}, La3/e1;->o(La3/n0;Z)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v2}, La3/e1;->n(La3/n0;)V

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final o(La3/n0;Z)V
    .locals 1

    iget-boolean v0, p1, La3/n0;->o0:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, La3/e1;->a:La3/n0;

    if-ne p1, v0, :cond_1

    iget-object v0, p0, La3/e1;->i:Ly3/a;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz p2, :cond_2

    invoke-static {p1, v0}, La3/e1;->b(La3/n0;Ly3/a;)Z

    return-void

    :cond_2
    invoke-static {p1, v0}, La3/e1;->c(La3/n0;Ly3/a;)Z

    return-void
.end method

.method public final p(La3/n0;Z)Z
    .locals 4

    invoke-virtual {p1}, La3/n0;->v()La3/h0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    const/4 v2, 0x1

    if-eq v0, v2, :cond_6

    const/4 v3, 0x2

    if-eq v0, v3, :cond_5

    const/4 v3, 0x3

    if-eq v0, v3, :cond_5

    const/4 v3, 0x4

    if-ne v0, v3, :cond_4

    invoke-virtual {p1}, La3/n0;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, La3/n0;->h0()V

    iget-boolean p2, p1, La3/n0;->o0:Z

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, La3/n0;->Y()Z

    move-result p2

    if-nez p2, :cond_2

    invoke-static {p1}, La3/e1;->i(La3/n0;)Z

    move-result p2

    if-eqz p2, :cond_6

    :cond_2
    invoke-virtual {p1}, La3/n0;->G()La3/n0;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p2}, La3/n0;->A()Z

    move-result p2

    if-ne p2, v2, :cond_3

    goto :goto_0

    :cond_3
    iget-object p2, p0, La3/e1;->b:La3/p;

    sget-object v0, La3/y;->y:La3/y;

    invoke-virtual {p2, p1, v0}, La3/p;->b(La3/n0;La3/y;)V

    :goto_0
    iget-boolean p1, p0, La3/e1;->d:Z

    if-nez p1, :cond_6

    return v2

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    new-instance v0, La3/d1;

    invoke-direct {v0, p1, v1, p2}, La3/d1;-><init>(La3/n0;ZZ)V

    iget-object p1, p0, La3/e1;->h:Lr1/c;

    invoke-virtual {p1, v0}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_6
    :goto_1
    return v1
.end method

.method public final q(J)V
    .locals 2

    iget-object v0, p0, La3/e1;->i:Ly3/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-wide v0, v0, Ly3/a;->a:J

    invoke-static {v0, v1, p1, p2}, Ly3/a;->c(JJ)Z

    move-result v0

    :goto_0
    if-nez v0, :cond_4

    iget-boolean v0, p0, La3/e1;->c:Z

    if-eqz v0, :cond_1

    const-string v0, "updateRootConstraints called while measuring"

    invoke-static {v0}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_1
    new-instance v0, Ly3/a;

    invoke-direct {v0, p1, p2}, Ly3/a;-><init>(J)V

    iput-object v0, p0, La3/e1;->i:Ly3/a;

    iget-object p1, p0, La3/e1;->a:La3/n0;

    iget-object p2, p1, La3/n0;->G:La3/n0;

    if-eqz p2, :cond_2

    invoke-virtual {p1}, La3/n0;->g0()V

    :cond_2
    invoke-virtual {p1}, La3/n0;->h0()V

    iget-object p2, p1, La3/n0;->G:La3/n0;

    if-eqz p2, :cond_3

    sget-object p2, La3/y;->w:La3/y;

    goto :goto_1

    :cond_3
    sget-object p2, La3/y;->y:La3/y;

    :goto_1
    iget-object v0, p0, La3/e1;->b:La3/p;

    invoke-virtual {v0, p1, p2}, La3/p;->b(La3/n0;La3/y;)V

    :cond_4
    return-void
.end method
