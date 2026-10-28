.class public final Lm4/f;
.super Lm4/e;
.source "SourceFile"


# instance fields
.field public A0:I

.field public B0:I

.field public C0:[Lm4/c;

.field public D0:[Lm4/c;

.field public E0:I

.field public F0:Z

.field public G0:Z

.field public H0:Ljava/lang/ref/WeakReference;

.field public I0:Ljava/lang/ref/WeakReference;

.field public J0:Ljava/lang/ref/WeakReference;

.field public K0:Ljava/lang/ref/WeakReference;

.field public L0:Ljava/util/HashSet;

.field public M0:Ln4/b;

.field public r0:Ljava/util/ArrayList;

.field public s0:La3/p;

.field public t0:Ln4/f;

.field public u0:I

.field public v0:Ln4/c;

.field public w0:Z

.field public x0:Lf4/c;

.field public y0:I

.field public z0:I


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lm4/e;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lm4/f;->r0:Ljava/util/ArrayList;

    new-instance v0, La3/p;

    invoke-direct {v0, p0}, La3/p;-><init>(Lm4/f;)V

    iput-object v0, p0, Lm4/f;->s0:La3/p;

    new-instance v0, Ln4/f;

    invoke-direct {v0, p0}, Ln4/f;-><init>(Lm4/f;)V

    iput-object v0, p0, Lm4/f;->t0:Ln4/f;

    const/4 v0, 0x0

    iput-object v0, p0, Lm4/f;->v0:Ln4/c;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lm4/f;->w0:Z

    new-instance v2, Lf4/c;

    invoke-direct {v2}, Lf4/c;-><init>()V

    iput-object v2, p0, Lm4/f;->x0:Lf4/c;

    iput v1, p0, Lm4/f;->A0:I

    iput v1, p0, Lm4/f;->B0:I

    const/4 v2, 0x4

    new-array v3, v2, [Lm4/c;

    iput-object v3, p0, Lm4/f;->C0:[Lm4/c;

    new-array v2, v2, [Lm4/c;

    iput-object v2, p0, Lm4/f;->D0:[Lm4/c;

    const/16 v2, 0x101

    iput v2, p0, Lm4/f;->E0:I

    iput-boolean v1, p0, Lm4/f;->F0:Z

    iput-boolean v1, p0, Lm4/f;->G0:Z

    iput-object v0, p0, Lm4/f;->H0:Ljava/lang/ref/WeakReference;

    iput-object v0, p0, Lm4/f;->I0:Ljava/lang/ref/WeakReference;

    iput-object v0, p0, Lm4/f;->J0:Ljava/lang/ref/WeakReference;

    iput-object v0, p0, Lm4/f;->K0:Ljava/lang/ref/WeakReference;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lm4/f;->L0:Ljava/util/HashSet;

    new-instance v0, Ln4/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lm4/f;->M0:Ln4/b;

    return-void
.end method

.method public static b0(Lm4/e;Ln4/c;Ln4/b;)V
    .locals 9

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lm4/e;->h0:I

    iget-object v1, p0, Lm4/e;->u:[I

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eq v0, v2, :cond_13

    instance-of v0, p0, Lm4/i;

    if-nez v0, :cond_13

    instance-of v0, p0, Lm4/b;

    if-eqz v0, :cond_1

    goto/16 :goto_8

    :cond_1
    iget-object v0, p0, Lm4/e;->q0:[I

    aget v2, v0, v3

    iput v2, p2, Ln4/b;->a:I

    const/4 v2, 0x1

    aget v0, v0, v2

    iput v0, p2, Ln4/b;->b:I

    invoke-virtual {p0}, Lm4/e;->r()I

    move-result v0

    iput v0, p2, Ln4/b;->c:I

    invoke-virtual {p0}, Lm4/e;->l()I

    move-result v0

    iput v0, p2, Ln4/b;->d:I

    iput-boolean v3, p2, Ln4/b;->i:Z

    iput v3, p2, Ln4/b;->j:I

    iget v0, p2, Ln4/b;->a:I

    const/4 v4, 0x3

    if-ne v0, v4, :cond_2

    move v0, v2

    goto :goto_0

    :cond_2
    move v0, v3

    :goto_0
    iget v5, p2, Ln4/b;->b:I

    if-ne v5, v4, :cond_3

    move v4, v2

    goto :goto_1

    :cond_3
    move v4, v3

    :goto_1
    const/4 v5, 0x0

    if-eqz v0, :cond_4

    iget v6, p0, Lm4/e;->X:F

    cmpl-float v6, v6, v5

    if-lez v6, :cond_4

    move v6, v2

    goto :goto_2

    :cond_4
    move v6, v3

    :goto_2
    if-eqz v4, :cond_5

    iget v7, p0, Lm4/e;->X:F

    cmpl-float v5, v7, v5

    if-lez v5, :cond_5

    move v5, v2

    goto :goto_3

    :cond_5
    move v5, v3

    :goto_3
    const/4 v7, 0x2

    if-eqz v0, :cond_7

    invoke-virtual {p0, v3}, Lm4/e;->u(I)Z

    move-result v8

    if-eqz v8, :cond_7

    iget v8, p0, Lm4/e;->s:I

    if-nez v8, :cond_7

    if-nez v6, :cond_7

    iput v7, p2, Ln4/b;->a:I

    if-eqz v4, :cond_6

    iget v0, p0, Lm4/e;->t:I

    if-nez v0, :cond_6

    iput v2, p2, Ln4/b;->a:I

    :cond_6
    move v0, v3

    :cond_7
    if-eqz v4, :cond_9

    invoke-virtual {p0, v2}, Lm4/e;->u(I)Z

    move-result v8

    if-eqz v8, :cond_9

    iget v8, p0, Lm4/e;->t:I

    if-nez v8, :cond_9

    if-nez v5, :cond_9

    iput v7, p2, Ln4/b;->b:I

    if-eqz v0, :cond_8

    iget v4, p0, Lm4/e;->s:I

    if-nez v4, :cond_8

    iput v2, p2, Ln4/b;->b:I

    :cond_8
    move v4, v3

    :cond_9
    invoke-virtual {p0}, Lm4/e;->B()Z

    move-result v8

    if-eqz v8, :cond_a

    iput v2, p2, Ln4/b;->a:I

    move v0, v3

    :cond_a
    invoke-virtual {p0}, Lm4/e;->C()Z

    move-result v8

    if-eqz v8, :cond_b

    iput v2, p2, Ln4/b;->b:I

    move v4, v3

    :cond_b
    const/4 v8, 0x4

    if-eqz v6, :cond_e

    aget v6, v1, v3

    if-ne v6, v8, :cond_c

    iput v2, p2, Ln4/b;->a:I

    goto :goto_5

    :cond_c
    if-nez v4, :cond_e

    iget v4, p2, Ln4/b;->b:I

    if-ne v4, v2, :cond_d

    iget v4, p2, Ln4/b;->d:I

    goto :goto_4

    :cond_d
    iput v7, p2, Ln4/b;->a:I

    invoke-interface {p1, p0, p2}, Ln4/c;->a(Lm4/e;Ln4/b;)V

    iget v4, p2, Ln4/b;->f:I

    :goto_4
    iput v2, p2, Ln4/b;->a:I

    iget v6, p0, Lm4/e;->X:F

    int-to-float v4, v4

    mul-float/2addr v6, v4

    float-to-int v4, v6

    iput v4, p2, Ln4/b;->c:I

    :cond_e
    :goto_5
    if-eqz v5, :cond_12

    aget v1, v1, v2

    if-ne v1, v8, :cond_f

    iput v2, p2, Ln4/b;->b:I

    goto :goto_7

    :cond_f
    if-nez v0, :cond_12

    iget v0, p2, Ln4/b;->a:I

    if-ne v0, v2, :cond_10

    iget v0, p2, Ln4/b;->c:I

    goto :goto_6

    :cond_10
    iput v7, p2, Ln4/b;->b:I

    invoke-interface {p1, p0, p2}, Ln4/c;->a(Lm4/e;Ln4/b;)V

    iget v0, p2, Ln4/b;->e:I

    :goto_6
    iput v2, p2, Ln4/b;->b:I

    iget v1, p0, Lm4/e;->Y:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_11

    int-to-float v0, v0

    iget v1, p0, Lm4/e;->X:F

    div-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p2, Ln4/b;->d:I

    goto :goto_7

    :cond_11
    iget v1, p0, Lm4/e;->X:F

    int-to-float v0, v0

    mul-float/2addr v1, v0

    float-to-int v0, v1

    iput v0, p2, Ln4/b;->d:I

    :cond_12
    :goto_7
    invoke-interface {p1, p0, p2}, Ln4/c;->a(Lm4/e;Ln4/b;)V

    iget p1, p2, Ln4/b;->e:I

    invoke-virtual {p0, p1}, Lm4/e;->S(I)V

    iget p1, p2, Ln4/b;->f:I

    invoke-virtual {p0, p1}, Lm4/e;->N(I)V

    iget-boolean p1, p2, Ln4/b;->h:Z

    iput-boolean p1, p0, Lm4/e;->F:Z

    iget p1, p2, Ln4/b;->g:I

    invoke-virtual {p0, p1}, Lm4/e;->J(I)V

    iput v3, p2, Ln4/b;->j:I

    return-void

    :cond_13
    :goto_8
    iput v3, p2, Ln4/b;->e:I

    iput v3, p2, Ln4/b;->f:I

    return-void
.end method


# virtual methods
.method public final D()V
    .locals 1

    iget-object v0, p0, Lm4/f;->x0:Lf4/c;

    invoke-virtual {v0}, Lf4/c;->t()V

    const/4 v0, 0x0

    iput v0, p0, Lm4/f;->y0:I

    iput v0, p0, Lm4/f;->z0:I

    iget-object v0, p0, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-super {p0}, Lm4/e;->D()V

    return-void
.end method

.method public final G(La3/p;)V
    .locals 3

    invoke-super {p0, p1}, Lm4/e;->G(La3/p;)V

    iget-object v0, p0, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm4/e;

    invoke-virtual {v2, p1}, Lm4/e;->G(La3/p;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final T(ZZ)V
    .locals 3

    invoke-super {p0, p1, p2}, Lm4/e;->T(ZZ)V

    iget-object v0, p0, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm4/e;

    invoke-virtual {v2, p1, p2}, Lm4/e;->T(ZZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final V(Lm4/e;)V
    .locals 1

    iget-object v0, p0, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, Lm4/e;->U:Lm4/f;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lm4/e;->D()V

    :cond_0
    iput-object p0, p1, Lm4/e;->U:Lm4/f;

    return-void
.end method

.method public final W(Lm4/e;I)V
    .locals 5

    const/4 v0, 0x1

    if-nez p2, :cond_1

    iget p2, p0, Lm4/f;->A0:I

    add-int/2addr p2, v0

    iget-object v1, p0, Lm4/f;->D0:[Lm4/c;

    array-length v2, v1

    if-lt p2, v2, :cond_0

    array-length p2, v1

    mul-int/lit8 p2, p2, 0x2

    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lm4/c;

    iput-object p2, p0, Lm4/f;->D0:[Lm4/c;

    :cond_0
    iget-object p2, p0, Lm4/f;->D0:[Lm4/c;

    iget v1, p0, Lm4/f;->A0:I

    new-instance v2, Lm4/c;

    const/4 v3, 0x0

    iget-boolean v4, p0, Lm4/f;->w0:Z

    invoke-direct {v2, p1, v3, v4}, Lm4/c;-><init>(Lm4/e;IZ)V

    aput-object v2, p2, v1

    add-int/2addr v1, v0

    iput v1, p0, Lm4/f;->A0:I

    return-void

    :cond_1
    if-ne p2, v0, :cond_3

    iget p2, p0, Lm4/f;->B0:I

    add-int/2addr p2, v0

    iget-object v1, p0, Lm4/f;->C0:[Lm4/c;

    array-length v2, v1

    if-lt p2, v2, :cond_2

    array-length p2, v1

    mul-int/lit8 p2, p2, 0x2

    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lm4/c;

    iput-object p2, p0, Lm4/f;->C0:[Lm4/c;

    :cond_2
    iget-object p2, p0, Lm4/f;->C0:[Lm4/c;

    iget v1, p0, Lm4/f;->B0:I

    new-instance v2, Lm4/c;

    iget-boolean v3, p0, Lm4/f;->w0:Z

    invoke-direct {v2, p1, v0, v3}, Lm4/c;-><init>(Lm4/e;IZ)V

    aput-object v2, p2, v1

    add-int/2addr v1, v0

    iput v1, p0, Lm4/f;->B0:I

    :cond_3
    return-void
.end method

.method public final X(Lf4/c;)V
    .locals 13

    iget-object v0, p0, Lm4/f;->L0:Ljava/util/HashSet;

    const/16 v1, 0x40

    invoke-virtual {p0, v1}, Lm4/f;->c0(I)Z

    move-result v1

    invoke-virtual {p0, p1, v1}, Lm4/e;->c(Lf4/c;Z)V

    iget-object v2, p0, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    const/4 v6, 0x1

    if-ge v4, v2, :cond_1

    iget-object v7, p0, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm4/e;

    iget-object v8, v7, Lm4/e;->T:[Z

    aput-boolean v3, v8, v3

    aput-boolean v3, v8, v6

    instance-of v7, v7, Lm4/b;

    if-eqz v7, :cond_0

    move v5, v6

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    if-eqz v5, :cond_8

    move v5, v3

    :goto_1
    if-ge v5, v2, :cond_8

    iget-object v7, p0, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm4/e;

    instance-of v8, v7, Lm4/b;

    if-eqz v8, :cond_7

    check-cast v7, Lm4/b;

    move v8, v3

    :goto_2
    iget v9, v7, Lm4/j;->s0:I

    if-ge v8, v9, :cond_7

    iget-object v9, v7, Lm4/j;->r0:[Lm4/e;

    aget-object v9, v9, v8

    iget-boolean v10, v7, Lm4/b;->u0:Z

    if-nez v10, :cond_2

    invoke-virtual {v9}, Lm4/e;->d()Z

    move-result v10

    if-nez v10, :cond_2

    goto :goto_4

    :cond_2
    iget v10, v7, Lm4/b;->t0:I

    if-eqz v10, :cond_5

    if-ne v10, v6, :cond_3

    goto :goto_3

    :cond_3
    if-eq v10, v4, :cond_4

    const/4 v11, 0x3

    if-ne v10, v11, :cond_6

    :cond_4
    iget-object v9, v9, Lm4/e;->T:[Z

    aput-boolean v6, v9, v6

    goto :goto_4

    :cond_5
    :goto_3
    iget-object v9, v9, Lm4/e;->T:[Z

    aput-boolean v6, v9, v3

    :cond_6
    :goto_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_8
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    move v5, v3

    :goto_5
    if-ge v5, v2, :cond_c

    iget-object v7, p0, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm4/e;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v8, v7, Lm4/l;

    if-nez v8, :cond_9

    instance-of v9, v7, Lm4/i;

    if-eqz v9, :cond_b

    :cond_9
    if-eqz v8, :cond_a

    invoke-virtual {v0, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_a
    invoke-virtual {v7, p1, v1}, Lm4/e;->c(Lf4/c;Z)V

    :cond_b
    :goto_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_c
    :goto_7
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v5

    if-lez v5, :cond_11

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v5

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm4/e;

    check-cast v8, Lm4/l;

    move v9, v3

    :goto_8
    iget v10, v8, Lm4/j;->s0:I

    if-ge v9, v10, :cond_d

    iget-object v10, v8, Lm4/j;->r0:[Lm4/e;

    aget-object v10, v10, v9

    invoke-virtual {v0, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_e

    invoke-virtual {v8, p1, v1}, Lm4/e;->c(Lf4/c;Z)V

    invoke-virtual {v0, v8}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_e
    add-int/lit8 v9, v9, 0x1

    goto :goto_8

    :cond_f
    :goto_9
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v7

    if-ne v5, v7, :cond_c

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm4/e;

    invoke-virtual {v7, p1, v1}, Lm4/e;->c(Lf4/c;Z)V

    goto :goto_a

    :cond_10
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    goto :goto_7

    :cond_11
    sget-boolean v0, Lf4/c;->q:Z

    if-eqz v0, :cond_16

    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10}, Ljava/util/HashSet;-><init>()V

    move v0, v3

    :goto_b
    if-ge v0, v2, :cond_14

    iget-object v5, p0, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm4/e;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v7, v5, Lm4/l;

    if-nez v7, :cond_13

    instance-of v7, v5, Lm4/i;

    if-eqz v7, :cond_12

    goto :goto_c

    :cond_12
    invoke-virtual {v10, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_13
    :goto_c
    add-int/lit8 v0, v0, 0x1

    goto :goto_b

    :cond_14
    iget-object v0, p0, Lm4/e;->q0:[I

    aget v0, v0, v3

    if-ne v0, v4, :cond_15

    move v11, v3

    goto :goto_d

    :cond_15
    move v11, v6

    :goto_d
    const/4 v12, 0x0

    move-object v8, p0

    move-object v7, p0

    move-object v9, p1

    invoke-virtual/range {v7 .. v12}, Lm4/e;->b(Lm4/f;Lf4/c;Ljava/util/HashSet;IZ)V

    invoke-virtual {v10}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm4/e;

    invoke-static {p0, v9, v0}, Lm4/k;->b(Lm4/f;Lf4/c;Lm4/e;)V

    invoke-virtual {v0, v9, v1}, Lm4/e;->c(Lf4/c;Z)V

    goto :goto_e

    :cond_16
    move-object v7, p0

    move-object v9, p1

    move p1, v3

    :goto_f
    if-ge p1, v2, :cond_1d

    iget-object v0, v7, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm4/e;

    instance-of v5, v0, Lm4/f;

    if-eqz v5, :cond_1a

    iget-object v5, v0, Lm4/e;->q0:[I

    aget v8, v5, v3

    aget v5, v5, v6

    if-ne v8, v4, :cond_17

    invoke-virtual {v0, v6}, Lm4/e;->O(I)V

    :cond_17
    if-ne v5, v4, :cond_18

    invoke-virtual {v0, v6}, Lm4/e;->Q(I)V

    :cond_18
    invoke-virtual {v0, v9, v1}, Lm4/e;->c(Lf4/c;Z)V

    if-ne v8, v4, :cond_19

    invoke-virtual {v0, v8}, Lm4/e;->O(I)V

    :cond_19
    if-ne v5, v4, :cond_1c

    invoke-virtual {v0, v5}, Lm4/e;->Q(I)V

    goto :goto_10

    :cond_1a
    invoke-static {p0, v9, v0}, Lm4/k;->b(Lm4/f;Lf4/c;Lm4/e;)V

    instance-of v5, v0, Lm4/l;

    if-nez v5, :cond_1c

    instance-of v5, v0, Lm4/i;

    if-eqz v5, :cond_1b

    goto :goto_10

    :cond_1b
    invoke-virtual {v0, v9, v1}, Lm4/e;->c(Lf4/c;Z)V

    :cond_1c
    :goto_10
    add-int/lit8 p1, p1, 0x1

    goto :goto_f

    :cond_1d
    iget p1, v7, Lm4/f;->A0:I

    const/4 v0, 0x0

    if-lez p1, :cond_1e

    invoke-static {p0, v9, v0, v3}, Lm4/k;->a(Lm4/f;Lf4/c;Ljava/util/ArrayList;I)V

    :cond_1e
    iget p1, v7, Lm4/f;->B0:I

    if-lez p1, :cond_1f

    invoke-static {p0, v9, v0, v6}, Lm4/k;->a(Lm4/f;Lf4/c;Ljava/util/ArrayList;I)V

    :cond_1f
    return-void
.end method

.method public final Y(IZ)Z
    .locals 16

    move/from16 v0, p1

    move-object/from16 v1, p0

    iget-object v2, v1, Lm4/f;->t0:Ln4/f;

    iget-object v3, v2, Ln4/f;->f:Ljava/io/Serializable;

    check-cast v3, Ljava/util/ArrayList;

    iget-object v4, v2, Ln4/f;->d:Ljava/lang/Object;

    check-cast v4, Lm4/f;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lm4/e;->k(I)I

    move-result v6

    iget-object v7, v4, Lm4/e;->q0:[I

    const/4 v8, 0x1

    invoke-virtual {v4, v8}, Lm4/e;->k(I)I

    move-result v9

    invoke-virtual {v4}, Lm4/e;->s()I

    move-result v10

    invoke-virtual {v4}, Lm4/e;->t()I

    move-result v11

    if-eqz p2, :cond_4

    const/4 v12, 0x2

    if-eq v6, v12, :cond_0

    if-ne v9, v12, :cond_4

    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_2

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ln4/p;

    iget v15, v14, Ln4/p;->f:I

    if-ne v15, v0, :cond_1

    invoke-virtual {v14}, Ln4/p;->k()Z

    move-result v14

    if-nez v14, :cond_1

    move v13, v5

    goto :goto_0

    :cond_2
    move/from16 v13, p2

    :goto_0
    if-nez v0, :cond_3

    if-eqz v13, :cond_4

    if-ne v6, v12, :cond_4

    invoke-virtual {v4, v8}, Lm4/e;->O(I)V

    invoke-virtual {v2, v4, v5}, Ln4/f;->d(Lm4/f;I)I

    move-result v12

    invoke-virtual {v4, v12}, Lm4/e;->S(I)V

    iget-object v12, v4, Lm4/e;->d:Ln4/l;

    iget-object v12, v12, Ln4/p;->e:Ln4/h;

    invoke-virtual {v4}, Lm4/e;->r()I

    move-result v13

    invoke-virtual {v12, v13}, Ln4/h;->d(I)V

    goto :goto_1

    :cond_3
    if-eqz v13, :cond_4

    if-ne v9, v12, :cond_4

    invoke-virtual {v4, v8}, Lm4/e;->Q(I)V

    invoke-virtual {v2, v4, v8}, Ln4/f;->d(Lm4/f;I)I

    move-result v12

    invoke-virtual {v4, v12}, Lm4/e;->N(I)V

    iget-object v12, v4, Lm4/e;->e:Ln4/n;

    iget-object v12, v12, Ln4/p;->e:Ln4/h;

    invoke-virtual {v4}, Lm4/e;->l()I

    move-result v13

    invoke-virtual {v12, v13}, Ln4/h;->d(I)V

    :cond_4
    :goto_1
    const/4 v12, 0x4

    if-nez v0, :cond_6

    aget v7, v7, v5

    if-eq v7, v8, :cond_5

    if-ne v7, v12, :cond_7

    :cond_5
    invoke-virtual {v4}, Lm4/e;->r()I

    move-result v7

    add-int/2addr v7, v10

    iget-object v11, v4, Lm4/e;->d:Ln4/l;

    iget-object v11, v11, Ln4/p;->i:Ln4/g;

    invoke-virtual {v11, v7}, Ln4/g;->d(I)V

    iget-object v11, v4, Lm4/e;->d:Ln4/l;

    iget-object v11, v11, Ln4/p;->e:Ln4/h;

    sub-int/2addr v7, v10

    invoke-virtual {v11, v7}, Ln4/h;->d(I)V

    :goto_2
    move v7, v8

    goto :goto_4

    :cond_6
    aget v7, v7, v8

    if-eq v7, v8, :cond_8

    if-ne v7, v12, :cond_7

    goto :goto_3

    :cond_7
    move v7, v5

    goto :goto_4

    :cond_8
    :goto_3
    invoke-virtual {v4}, Lm4/e;->l()I

    move-result v7

    add-int/2addr v7, v11

    iget-object v10, v4, Lm4/e;->e:Ln4/n;

    iget-object v10, v10, Ln4/p;->i:Ln4/g;

    invoke-virtual {v10, v7}, Ln4/g;->d(I)V

    iget-object v10, v4, Lm4/e;->e:Ln4/n;

    iget-object v10, v10, Ln4/p;->e:Ln4/h;

    sub-int/2addr v7, v11

    invoke-virtual {v10, v7}, Ln4/h;->d(I)V

    goto :goto_2

    :goto_4
    invoke-virtual {v2}, Ln4/f;->g()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ln4/p;

    iget v11, v10, Ln4/p;->f:I

    if-eq v11, v0, :cond_9

    goto :goto_5

    :cond_9
    iget-object v11, v10, Ln4/p;->b:Lm4/e;

    if-ne v11, v4, :cond_a

    iget-boolean v11, v10, Ln4/p;->g:Z

    if-nez v11, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {v10}, Ln4/p;->e()V

    goto :goto_5

    :cond_b
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_c
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln4/p;

    iget v10, v3, Ln4/p;->f:I

    if-eq v10, v0, :cond_d

    goto :goto_6

    :cond_d
    if-nez v7, :cond_e

    iget-object v10, v3, Ln4/p;->b:Lm4/e;

    if-ne v10, v4, :cond_e

    goto :goto_6

    :cond_e
    iget-object v10, v3, Ln4/p;->h:Ln4/g;

    iget-boolean v10, v10, Ln4/g;->j:Z

    if-nez v10, :cond_f

    goto :goto_7

    :cond_f
    iget-object v10, v3, Ln4/p;->i:Ln4/g;

    iget-boolean v10, v10, Ln4/g;->j:Z

    if-nez v10, :cond_10

    goto :goto_7

    :cond_10
    instance-of v10, v3, Ln4/d;

    if-nez v10, :cond_c

    iget-object v3, v3, Ln4/p;->e:Ln4/h;

    iget-boolean v3, v3, Ln4/g;->j:Z

    if-nez v3, :cond_c

    goto :goto_7

    :cond_11
    move v5, v8

    :goto_7
    invoke-virtual {v4, v6}, Lm4/e;->O(I)V

    invoke-virtual {v4, v9}, Lm4/e;->Q(I)V

    return v5
.end method

.method public final Z()V
    .locals 26

    move-object/from16 v1, p0

    iget-object v2, v1, Lm4/f;->x0:Lf4/c;

    const/4 v3, 0x0

    iput v3, v1, Lm4/e;->Z:I

    iput v3, v1, Lm4/e;->a0:I

    iput-boolean v3, v1, Lm4/f;->F0:Z

    iput-boolean v3, v1, Lm4/f;->G0:Z

    iget-object v0, v1, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v1}, Lm4/e;->r()I

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {v1}, Lm4/e;->l()I

    move-result v5

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    iget-object v6, v1, Lm4/e;->q0:[I

    const/4 v7, 0x1

    aget v8, v6, v7

    aget v9, v6, v3

    iget v10, v1, Lm4/f;->u0:I

    iget-object v11, v1, Lm4/e;->K:Lm4/d;

    iget-object v12, v1, Lm4/e;->J:Lm4/d;

    if-nez v10, :cond_1e

    iget v10, v1, Lm4/f;->E0:I

    invoke-static {v10, v7}, Lm4/k;->c(II)Z

    move-result v10

    if-eqz v10, :cond_1e

    iget-object v10, v1, Lm4/f;->v0:Ln4/c;

    aget v14, v6, v3

    aget v15, v6, v7

    invoke-virtual {v1}, Lm4/e;->F()V

    iget-object v13, v1, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v3, :cond_0

    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lm4/e;

    invoke-virtual/range {v18 .. v18}, Lm4/e;->F()V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    iget-boolean v7, v1, Lm4/f;->w0:Z

    move-object/from16 v18, v6

    const/4 v6, 0x1

    if-ne v14, v6, :cond_1

    invoke-virtual {v1}, Lm4/e;->r()I

    move-result v6

    const/4 v14, 0x0

    invoke-virtual {v1, v14, v6}, Lm4/e;->L(II)V

    goto :goto_1

    :cond_1
    const/4 v14, 0x0

    invoke-virtual {v12, v14}, Lm4/d;->l(I)V

    iput v14, v1, Lm4/e;->Z:I

    :goto_1
    const/4 v6, 0x0

    const/4 v14, 0x0

    const/16 v19, 0x0

    :goto_2
    const/high16 v20, 0x3f000000    # 0.5f

    if-ge v6, v3, :cond_7

    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v21

    move/from16 v22, v6

    move-object/from16 v6, v21

    check-cast v6, Lm4/e;

    move/from16 v21, v14

    instance-of v14, v6, Lm4/i;

    if-eqz v14, :cond_6

    check-cast v6, Lm4/i;

    iget v14, v6, Lm4/i;->v0:I

    move-object/from16 v23, v12

    const/4 v12, 0x1

    if-ne v14, v12, :cond_5

    iget v12, v6, Lm4/i;->s0:I

    const/4 v14, -0x1

    if-eq v12, v14, :cond_2

    invoke-virtual {v6, v12}, Lm4/i;->V(I)V

    goto :goto_3

    :cond_2
    iget v12, v6, Lm4/i;->t0:I

    if-eq v12, v14, :cond_3

    invoke-virtual {v1}, Lm4/e;->B()Z

    move-result v12

    if-eqz v12, :cond_3

    invoke-virtual {v1}, Lm4/e;->r()I

    move-result v12

    iget v14, v6, Lm4/i;->t0:I

    sub-int/2addr v12, v14

    invoke-virtual {v6, v12}, Lm4/i;->V(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lm4/e;->B()Z

    move-result v12

    if-eqz v12, :cond_4

    iget v12, v6, Lm4/i;->r0:F

    invoke-virtual {v1}, Lm4/e;->r()I

    move-result v14

    int-to-float v14, v14

    mul-float/2addr v12, v14

    add-float v12, v12, v20

    float-to-int v12, v12

    invoke-virtual {v6, v12}, Lm4/i;->V(I)V

    :cond_4
    :goto_3
    const/16 v21, 0x1

    :cond_5
    move/from16 v14, v21

    goto :goto_4

    :cond_6
    move-object/from16 v23, v12

    instance-of v12, v6, Lm4/b;

    if-eqz v12, :cond_5

    check-cast v6, Lm4/b;

    invoke-virtual {v6}, Lm4/b;->Z()I

    move-result v6

    if-nez v6, :cond_5

    move/from16 v14, v21

    const/16 v19, 0x1

    :goto_4
    add-int/lit8 v6, v22, 0x1

    move-object/from16 v12, v23

    goto :goto_2

    :cond_7
    move-object/from16 v23, v12

    move/from16 v21, v14

    if-eqz v21, :cond_a

    const/4 v6, 0x0

    :goto_5
    if-ge v6, v3, :cond_a

    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lm4/e;

    instance-of v14, v12, Lm4/i;

    if-eqz v14, :cond_9

    check-cast v12, Lm4/i;

    iget v14, v12, Lm4/i;->v0:I

    move/from16 v21, v6

    const/4 v6, 0x1

    if-ne v14, v6, :cond_8

    const/4 v14, 0x0

    invoke-static {v14, v12, v10, v7}, Ln4/i;->b(ILm4/e;Ln4/c;Z)V

    goto :goto_7

    :cond_8
    :goto_6
    const/4 v14, 0x0

    goto :goto_7

    :cond_9
    move/from16 v21, v6

    goto :goto_6

    :goto_7
    add-int/lit8 v6, v21, 0x1

    goto :goto_5

    :cond_a
    const/4 v14, 0x0

    invoke-static {v14, v1, v10, v7}, Ln4/i;->b(ILm4/e;Ln4/c;Z)V

    if-eqz v19, :cond_c

    const/4 v6, 0x0

    :goto_8
    if-ge v6, v3, :cond_c

    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lm4/e;

    instance-of v14, v12, Lm4/b;

    if-eqz v14, :cond_b

    check-cast v12, Lm4/b;

    invoke-virtual {v12}, Lm4/b;->Z()I

    move-result v14

    if-nez v14, :cond_b

    invoke-virtual {v12}, Lm4/b;->Y()Z

    move-result v14

    if-eqz v14, :cond_b

    const/4 v14, 0x1

    invoke-static {v14, v12, v10, v7}, Ln4/i;->b(ILm4/e;Ln4/c;Z)V

    goto :goto_9

    :cond_b
    const/4 v14, 0x1

    :goto_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_8

    :cond_c
    const/4 v14, 0x1

    if-ne v15, v14, :cond_d

    invoke-virtual {v1}, Lm4/e;->l()I

    move-result v6

    const/4 v14, 0x0

    invoke-virtual {v1, v14, v6}, Lm4/e;->M(II)V

    goto :goto_a

    :cond_d
    const/4 v14, 0x0

    invoke-virtual {v11, v14}, Lm4/d;->l(I)V

    iput v14, v1, Lm4/e;->a0:I

    :goto_a
    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    :goto_b
    if-ge v6, v3, :cond_13

    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lm4/e;

    move/from16 v19, v6

    instance-of v6, v15, Lm4/i;

    if-eqz v6, :cond_11

    check-cast v15, Lm4/i;

    iget v6, v15, Lm4/i;->v0:I

    if-nez v6, :cond_12

    iget v6, v15, Lm4/i;->s0:I

    const/4 v12, -0x1

    if-eq v6, v12, :cond_e

    invoke-virtual {v15, v6}, Lm4/i;->V(I)V

    goto :goto_c

    :cond_e
    iget v6, v15, Lm4/i;->t0:I

    if-eq v6, v12, :cond_f

    invoke-virtual {v1}, Lm4/e;->C()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-virtual {v1}, Lm4/e;->l()I

    move-result v6

    iget v12, v15, Lm4/i;->t0:I

    sub-int/2addr v6, v12

    invoke-virtual {v15, v6}, Lm4/i;->V(I)V

    goto :goto_c

    :cond_f
    invoke-virtual {v1}, Lm4/e;->C()Z

    move-result v6

    if-eqz v6, :cond_10

    iget v6, v15, Lm4/i;->r0:F

    invoke-virtual {v1}, Lm4/e;->l()I

    move-result v12

    int-to-float v12, v12

    mul-float/2addr v6, v12

    add-float v6, v6, v20

    float-to-int v6, v6

    invoke-virtual {v15, v6}, Lm4/i;->V(I)V

    :cond_10
    :goto_c
    const/4 v12, 0x1

    goto :goto_d

    :cond_11
    instance-of v6, v15, Lm4/b;

    if-eqz v6, :cond_12

    check-cast v15, Lm4/b;

    invoke-virtual {v15}, Lm4/b;->Z()I

    move-result v6

    const/4 v15, 0x1

    if-ne v6, v15, :cond_12

    const/4 v14, 0x1

    :cond_12
    :goto_d
    add-int/lit8 v6, v19, 0x1

    goto :goto_b

    :cond_13
    if-eqz v12, :cond_15

    const/4 v6, 0x0

    :goto_e
    if-ge v6, v3, :cond_15

    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lm4/e;

    instance-of v15, v12, Lm4/i;

    if-eqz v15, :cond_14

    check-cast v12, Lm4/i;

    iget v15, v12, Lm4/i;->v0:I

    if-nez v15, :cond_14

    const/4 v15, 0x1

    invoke-static {v15, v12, v10}, Ln4/i;->g(ILm4/e;Ln4/c;)V

    :cond_14
    add-int/lit8 v6, v6, 0x1

    goto :goto_e

    :cond_15
    const/4 v6, 0x0

    invoke-static {v6, v1, v10}, Ln4/i;->g(ILm4/e;Ln4/c;)V

    if-eqz v14, :cond_17

    const/4 v6, 0x0

    :goto_f
    if-ge v6, v3, :cond_17

    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lm4/e;

    instance-of v14, v12, Lm4/b;

    if-eqz v14, :cond_16

    check-cast v12, Lm4/b;

    invoke-virtual {v12}, Lm4/b;->Z()I

    move-result v14

    const/4 v15, 0x1

    if-ne v14, v15, :cond_16

    invoke-virtual {v12}, Lm4/b;->Y()Z

    move-result v14

    if-eqz v14, :cond_16

    invoke-static {v15, v12, v10}, Ln4/i;->g(ILm4/e;Ln4/c;)V

    :cond_16
    add-int/lit8 v6, v6, 0x1

    goto :goto_f

    :cond_17
    const/4 v6, 0x0

    :goto_10
    if-ge v6, v3, :cond_1b

    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lm4/e;

    invoke-virtual {v12}, Lm4/e;->A()Z

    move-result v14

    if-eqz v14, :cond_1a

    invoke-static {v12}, Ln4/i;->a(Lm4/e;)Z

    move-result v14

    if-eqz v14, :cond_1a

    sget-object v14, Ln4/i;->a:Ln4/b;

    invoke-static {v12, v10, v14}, Lm4/f;->b0(Lm4/e;Ln4/c;Ln4/b;)V

    instance-of v14, v12, Lm4/i;

    if-eqz v14, :cond_19

    move-object v14, v12

    check-cast v14, Lm4/i;

    iget v14, v14, Lm4/i;->v0:I

    if-nez v14, :cond_18

    const/4 v14, 0x0

    invoke-static {v14, v12, v10}, Ln4/i;->g(ILm4/e;Ln4/c;)V

    goto :goto_11

    :cond_18
    const/4 v14, 0x0

    invoke-static {v14, v12, v10, v7}, Ln4/i;->b(ILm4/e;Ln4/c;Z)V

    goto :goto_11

    :cond_19
    const/4 v14, 0x0

    invoke-static {v14, v12, v10, v7}, Ln4/i;->b(ILm4/e;Ln4/c;Z)V

    invoke-static {v14, v12, v10}, Ln4/i;->g(ILm4/e;Ln4/c;)V

    :cond_1a
    :goto_11
    add-int/lit8 v6, v6, 0x1

    goto :goto_10

    :cond_1b
    const/4 v3, 0x0

    :goto_12
    if-ge v3, v4, :cond_1f

    iget-object v6, v1, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm4/e;

    invoke-virtual {v6}, Lm4/e;->A()Z

    move-result v7

    if-eqz v7, :cond_1d

    instance-of v7, v6, Lm4/i;

    if-nez v7, :cond_1d

    instance-of v7, v6, Lm4/b;

    if-nez v7, :cond_1d

    instance-of v7, v6, Lm4/l;

    if-nez v7, :cond_1d

    iget-boolean v7, v6, Lm4/e;->G:Z

    if-nez v7, :cond_1d

    const/4 v14, 0x0

    invoke-virtual {v6, v14}, Lm4/e;->k(I)I

    move-result v7

    const/4 v15, 0x1

    invoke-virtual {v6, v15}, Lm4/e;->k(I)I

    move-result v10

    const/4 v12, 0x3

    if-ne v7, v12, :cond_1c

    iget v7, v6, Lm4/e;->s:I

    if-eq v7, v15, :cond_1c

    if-ne v10, v12, :cond_1c

    iget v7, v6, Lm4/e;->t:I

    if-eq v7, v15, :cond_1c

    goto :goto_13

    :cond_1c
    new-instance v7, Ln4/b;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    iget-object v10, v1, Lm4/f;->v0:Ln4/c;

    invoke-static {v6, v10, v7}, Lm4/f;->b0(Lm4/e;Ln4/c;Ln4/b;)V

    :cond_1d
    :goto_13
    add-int/lit8 v3, v3, 0x1

    goto :goto_12

    :cond_1e
    move-object/from16 v18, v6

    move-object/from16 v23, v12

    :cond_1f
    const/4 v3, 0x2

    if-le v4, v3, :cond_25

    if-eq v9, v3, :cond_20

    if-ne v8, v3, :cond_25

    :cond_20
    iget v6, v1, Lm4/f;->E0:I

    const/16 v7, 0x400

    invoke-static {v6, v7}, Lm4/k;->c(II)Z

    move-result v6

    if-eqz v6, :cond_25

    iget-object v6, v1, Lm4/f;->v0:Ln4/c;

    invoke-static {v1, v6}, Lv8/b;->V(Lm4/f;Ln4/c;)Z

    move-result v6

    if-eqz v6, :cond_25

    if-ne v9, v3, :cond_22

    invoke-virtual {v1}, Lm4/e;->r()I

    move-result v6

    if-ge v0, v6, :cond_21

    if-lez v0, :cond_21

    invoke-virtual {v1, v0}, Lm4/e;->S(I)V

    const/4 v15, 0x1

    iput-boolean v15, v1, Lm4/f;->F0:Z

    goto :goto_14

    :cond_21
    invoke-virtual {v1}, Lm4/e;->r()I

    move-result v0

    :cond_22
    :goto_14
    if-ne v8, v3, :cond_24

    invoke-virtual {v1}, Lm4/e;->l()I

    move-result v6

    if-ge v5, v6, :cond_23

    if-lez v5, :cond_23

    invoke-virtual {v1, v5}, Lm4/e;->N(I)V

    const/4 v15, 0x1

    iput-boolean v15, v1, Lm4/f;->G0:Z

    goto :goto_15

    :cond_23
    invoke-virtual {v1}, Lm4/e;->l()I

    move-result v5

    :cond_24
    :goto_15
    move v6, v5

    move v5, v0

    const/4 v0, 0x1

    goto :goto_16

    :cond_25
    move v6, v5

    move v5, v0

    const/4 v0, 0x0

    :goto_16
    const/16 v7, 0x40

    invoke-virtual {v1, v7}, Lm4/f;->c0(I)Z

    move-result v10

    if-nez v10, :cond_27

    const/16 v10, 0x80

    invoke-virtual {v1, v10}, Lm4/f;->c0(I)Z

    move-result v10

    if-eqz v10, :cond_26

    goto :goto_17

    :cond_26
    const/4 v10, 0x0

    goto :goto_18

    :cond_27
    :goto_17
    const/4 v10, 0x1

    :goto_18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v14, 0x0

    iput-boolean v14, v2, Lf4/c;->h:Z

    iget v12, v1, Lm4/f;->E0:I

    if-eqz v12, :cond_28

    if-eqz v10, :cond_28

    const/4 v15, 0x1

    iput-boolean v15, v2, Lf4/c;->h:Z

    goto :goto_19

    :cond_28
    const/4 v15, 0x1

    :goto_19
    iget-object v10, v1, Lm4/f;->r0:Ljava/util/ArrayList;

    aget v12, v18, v14

    if-eq v12, v3, :cond_2a

    aget v12, v18, v15

    if-ne v12, v3, :cond_29

    goto :goto_1a

    :cond_29
    move v12, v14

    goto :goto_1b

    :cond_2a
    :goto_1a
    const/4 v12, 0x1

    :goto_1b
    iput v14, v1, Lm4/f;->A0:I

    iput v14, v1, Lm4/f;->B0:I

    const/4 v13, 0x0

    :goto_1c
    if-ge v13, v4, :cond_2c

    iget-object v14, v1, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lm4/e;

    instance-of v15, v14, Lm4/f;

    if-eqz v15, :cond_2b

    check-cast v14, Lm4/f;

    invoke-virtual {v14}, Lm4/f;->Z()V

    :cond_2b
    add-int/lit8 v13, v13, 0x1

    goto :goto_1c

    :cond_2c
    invoke-virtual {v1, v7}, Lm4/f;->c0(I)Z

    move-result v13

    move v14, v0

    const/4 v0, 0x0

    const/4 v15, 0x1

    :goto_1d
    if-eqz v15, :cond_40

    move/from16 v19, v3

    const/16 v17, 0x1

    add-int/lit8 v3, v0, 0x1

    :try_start_0
    invoke-virtual {v2}, Lf4/c;->t()V

    const/4 v7, 0x0

    iput v7, v1, Lm4/f;->A0:I

    iput v7, v1, Lm4/f;->B0:I

    invoke-virtual {v1, v2}, Lm4/e;->h(Lf4/c;)V

    const/4 v0, 0x0

    :goto_1e
    if-ge v0, v4, :cond_2d

    iget-object v7, v1, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm4/e;

    invoke-virtual {v7, v2}, Lm4/e;->h(Lf4/c;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1e

    :catch_0
    move-exception v0

    move-object/from16 v22, v11

    goto/16 :goto_22

    :cond_2d
    invoke-virtual {v1, v2}, Lm4/f;->X(Lf4/c;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, v1, Lm4/f;->H0:Ljava/lang/ref/WeakReference;

    const/4 v7, 0x5

    if-eqz v0, :cond_2e

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2e

    iget-object v0, v1, Lm4/f;->H0:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm4/d;

    invoke-virtual {v2, v11}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v15

    invoke-virtual {v2, v0}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-object/from16 v22, v11

    const/4 v11, 0x0

    :try_start_2
    invoke-virtual {v2, v0, v15, v11, v7}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    const/4 v0, 0x0

    iput-object v0, v1, Lm4/f;->H0:Ljava/lang/ref/WeakReference;

    goto :goto_20

    :catch_1
    move-exception v0

    :goto_1f
    const/4 v15, 0x1

    goto/16 :goto_22

    :catch_2
    move-exception v0

    move-object/from16 v22, v11

    goto :goto_1f

    :cond_2e
    move-object/from16 v22, v11

    :goto_20
    iget-object v0, v1, Lm4/f;->J0:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2f

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2f

    iget-object v0, v1, Lm4/f;->J0:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm4/d;

    iget-object v11, v1, Lm4/e;->M:Lm4/d;

    invoke-virtual {v2, v11}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v11

    invoke-virtual {v2, v0}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v0

    const/4 v15, 0x0

    invoke-virtual {v2, v11, v0, v15, v7}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    const/4 v0, 0x0

    iput-object v0, v1, Lm4/f;->J0:Ljava/lang/ref/WeakReference;

    :cond_2f
    iget-object v0, v1, Lm4/f;->I0:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_30

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_30

    iget-object v0, v1, Lm4/f;->I0:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm4/d;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-object/from16 v11, v23

    :try_start_3
    invoke-virtual {v2, v11}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v15

    invoke-virtual {v2, v0}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    move-object/from16 v23, v11

    const/4 v11, 0x0

    :try_start_4
    invoke-virtual {v2, v0, v15, v11, v7}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    const/4 v0, 0x0

    iput-object v0, v1, Lm4/f;->I0:Ljava/lang/ref/WeakReference;

    goto :goto_21

    :catch_3
    move-exception v0

    move-object/from16 v23, v11

    goto :goto_1f

    :cond_30
    :goto_21
    iget-object v0, v1, Lm4/f;->K0:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_31

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_31

    iget-object v0, v1, Lm4/f;->K0:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm4/d;

    iget-object v11, v1, Lm4/e;->L:Lm4/d;

    invoke-virtual {v2, v11}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v11

    invoke-virtual {v2, v0}, Lf4/c;->k(Ljava/lang/Object;)Lf4/f;

    move-result-object v0

    const/4 v15, 0x0

    invoke-virtual {v2, v11, v0, v15, v7}, Lf4/c;->f(Lf4/f;Lf4/f;II)V

    const/4 v0, 0x0

    iput-object v0, v1, Lm4/f;->K0:Ljava/lang/ref/WeakReference;

    :cond_31
    invoke-virtual {v2}, Lf4/c;->p()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    move/from16 v21, v12

    const/4 v15, 0x1

    goto :goto_23

    :goto_22
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v7, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v11, Ljava/lang/StringBuilder;

    move/from16 v21, v12

    const-string v12, "EXCEPTION : "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_23
    sget-object v0, Lm4/k;->a:[Z

    if-eqz v15, :cond_35

    const/16 v16, 0x0

    aput-boolean v16, v0, v19

    const/16 v7, 0x40

    invoke-virtual {v1, v7}, Lm4/f;->c0(I)Z

    move-result v11

    invoke-virtual {v1, v2, v11}, Lm4/e;->U(Lf4/c;Z)V

    iget-object v12, v1, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v12

    const/4 v15, 0x0

    const/16 v20, 0x0

    :goto_24
    if-ge v15, v12, :cond_34

    iget-object v7, v1, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v7, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm4/e;

    invoke-virtual {v7, v2, v11}, Lm4/e;->U(Lf4/c;Z)V

    move-object/from16 v24, v0

    iget v0, v7, Lm4/e;->h:I

    move/from16 v25, v11

    const/4 v11, -0x1

    if-ne v0, v11, :cond_32

    iget v0, v7, Lm4/e;->i:I

    if-eq v0, v11, :cond_33

    :cond_32
    const/16 v20, 0x1

    :cond_33
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, v24

    move/from16 v11, v25

    const/16 v7, 0x40

    goto :goto_24

    :cond_34
    move-object/from16 v24, v0

    const/4 v11, -0x1

    goto :goto_26

    :cond_35
    move-object/from16 v24, v0

    const/4 v11, -0x1

    invoke-virtual {v1, v2, v13}, Lm4/e;->U(Lf4/c;Z)V

    const/4 v0, 0x0

    :goto_25
    if-ge v0, v4, :cond_36

    iget-object v7, v1, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm4/e;

    invoke-virtual {v7, v2, v13}, Lm4/e;->U(Lf4/c;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_25

    :cond_36
    const/16 v20, 0x0

    :goto_26
    const/16 v0, 0x8

    if-eqz v21, :cond_39

    if-ge v3, v0, :cond_39

    aget-boolean v7, v24, v19

    if-eqz v7, :cond_39

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    :goto_27
    if-ge v7, v4, :cond_37

    iget-object v11, v1, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lm4/e;

    iget v0, v11, Lm4/e;->Z:I

    invoke-virtual {v11}, Lm4/e;->r()I

    move-result v25

    add-int v0, v25, v0

    invoke-static {v12, v0}, Ljava/lang/Math;->max(II)I

    move-result v12

    iget v0, v11, Lm4/e;->a0:I

    invoke-virtual {v11}, Lm4/e;->l()I

    move-result v11

    add-int/2addr v11, v0

    invoke-static {v15, v11}, Ljava/lang/Math;->max(II)I

    move-result v15

    add-int/lit8 v7, v7, 0x1

    const/16 v0, 0x8

    const/4 v11, -0x1

    goto :goto_27

    :cond_37
    iget v0, v1, Lm4/e;->c0:I

    invoke-static {v0, v12}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v7, v1, Lm4/e;->d0:I

    invoke-static {v7, v15}, Ljava/lang/Math;->max(II)I

    move-result v7

    move/from16 v11, v19

    if-ne v9, v11, :cond_38

    invoke-virtual {v1}, Lm4/e;->r()I

    move-result v12

    if-ge v12, v0, :cond_38

    invoke-virtual {v1, v0}, Lm4/e;->S(I)V

    const/16 v16, 0x0

    aput v11, v18, v16

    const/4 v14, 0x1

    const/16 v20, 0x1

    :cond_38
    if-ne v8, v11, :cond_39

    invoke-virtual {v1}, Lm4/e;->l()I

    move-result v0

    if-ge v0, v7, :cond_39

    invoke-virtual {v1, v7}, Lm4/e;->N(I)V

    const/16 v17, 0x1

    aput v11, v18, v17

    const/4 v14, 0x1

    const/16 v20, 0x1

    :cond_39
    iget v0, v1, Lm4/e;->c0:I

    invoke-virtual {v1}, Lm4/e;->r()I

    move-result v7

    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {v1}, Lm4/e;->r()I

    move-result v7

    if-le v0, v7, :cond_3a

    invoke-virtual {v1, v0}, Lm4/e;->S(I)V

    const/4 v15, 0x1

    const/16 v16, 0x0

    aput v15, v18, v16

    move/from16 v17, v15

    move/from16 v20, v17

    goto :goto_28

    :cond_3a
    const/4 v15, 0x1

    move/from16 v17, v14

    :goto_28
    iget v0, v1, Lm4/e;->d0:I

    invoke-virtual {v1}, Lm4/e;->l()I

    move-result v7

    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {v1}, Lm4/e;->l()I

    move-result v7

    if-le v0, v7, :cond_3b

    invoke-virtual {v1, v0}, Lm4/e;->N(I)V

    aput v15, v18, v15

    move v0, v15

    move/from16 v20, v0

    goto :goto_29

    :cond_3b
    move/from16 v0, v17

    :goto_29
    if-nez v0, :cond_3e

    const/16 v16, 0x0

    aget v7, v18, v16

    const/4 v11, 0x2

    if-ne v7, v11, :cond_3c

    if-lez v5, :cond_3c

    invoke-virtual {v1}, Lm4/e;->r()I

    move-result v7

    if-le v7, v5, :cond_3c

    iput-boolean v15, v1, Lm4/f;->F0:Z

    aput v15, v18, v16

    invoke-virtual {v1, v5}, Lm4/e;->S(I)V

    move v0, v15

    move/from16 v20, v0

    :cond_3c
    aget v7, v18, v15

    const/4 v11, 0x2

    if-ne v7, v11, :cond_3d

    if-lez v6, :cond_3d

    invoke-virtual {v1}, Lm4/e;->l()I

    move-result v7

    if-le v7, v6, :cond_3d

    iput-boolean v15, v1, Lm4/f;->G0:Z

    aput v15, v18, v15

    invoke-virtual {v1, v6}, Lm4/e;->N(I)V

    const/16 v0, 0x8

    const/4 v14, 0x1

    const/16 v20, 0x1

    goto :goto_2b

    :cond_3d
    :goto_2a
    move v14, v0

    const/16 v0, 0x8

    goto :goto_2b

    :cond_3e
    const/4 v11, 0x2

    goto :goto_2a

    :goto_2b
    if-le v3, v0, :cond_3f

    const/4 v15, 0x0

    goto :goto_2c

    :cond_3f
    move/from16 v15, v20

    :goto_2c
    move v0, v3

    move v3, v11

    move/from16 v12, v21

    move-object/from16 v11, v22

    const/16 v7, 0x40

    goto/16 :goto_1d

    :cond_40
    iput-object v10, v1, Lm4/f;->r0:Ljava/util/ArrayList;

    if-eqz v14, :cond_41

    const/16 v16, 0x0

    aput v9, v18, v16

    const/16 v17, 0x1

    aput v8, v18, v17

    :cond_41
    iget-object v0, v2, Lf4/c;->m:La3/p;

    invoke-virtual {v1, v0}, Lm4/f;->G(La3/p;)V

    return-void
.end method

.method public final a0(IIIIIII)V
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p4

    move/from16 v4, p6

    iput v4, v0, Lm4/f;->y0:I

    move/from16 v4, p7

    iput v4, v0, Lm4/f;->z0:I

    iget-object v4, v0, Lm4/f;->s0:La3/p;

    iget-object v5, v4, La3/p;->z:Ljava/lang/Object;

    check-cast v5, Lm4/f;

    iget-object v6, v4, La3/p;->x:Ljava/lang/Object;

    check-cast v6, Ljava/util/ArrayList;

    iget-object v7, v0, Lm4/f;->v0:Ln4/c;

    iget-object v8, v0, Lm4/f;->t0:Ln4/f;

    iget-object v9, v0, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    invoke-virtual {v0}, Lm4/e;->r()I

    move-result v10

    invoke-virtual {v0}, Lm4/e;->l()I

    move-result v11

    const/16 v12, 0x80

    invoke-static {v1, v12}, Lm4/k;->c(II)Z

    move-result v12

    const/16 v13, 0x40

    if-nez v12, :cond_1

    invoke-static {v1, v13}, Lm4/k;->c(II)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    const/16 v16, 0x0

    const/4 v13, 0x3

    const/16 p7, 0x0

    if-eqz v1, :cond_a

    const/4 v14, 0x0

    :goto_2
    if-ge v14, v9, :cond_a

    const/16 v17, 0x1

    iget-object v15, v0, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v15, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lm4/e;

    move/from16 p1, v1

    iget-object v1, v15, Lm4/e;->q0:[I

    move-object/from16 v18, v1

    aget v1, v18, p7

    if-ne v1, v13, :cond_2

    move/from16 v19, v17

    goto :goto_3

    :cond_2
    move/from16 v19, p7

    :goto_3
    aget v1, v18, v17

    if-ne v1, v13, :cond_3

    move/from16 v1, v17

    goto :goto_4

    :cond_3
    move/from16 v1, p7

    :goto_4
    if-eqz v19, :cond_4

    if-eqz v1, :cond_4

    iget v1, v15, Lm4/e;->X:F

    cmpl-float v1, v1, v16

    if-lez v1, :cond_4

    move/from16 v1, v17

    goto :goto_5

    :cond_4
    move/from16 v1, p7

    :goto_5
    invoke-virtual {v15}, Lm4/e;->y()Z

    move-result v18

    if-eqz v18, :cond_6

    if-eqz v1, :cond_6

    :cond_5
    :goto_6
    move/from16 v1, p7

    goto :goto_7

    :cond_6
    invoke-virtual {v15}, Lm4/e;->z()Z

    move-result v18

    if-eqz v18, :cond_7

    if-eqz v1, :cond_7

    goto :goto_6

    :cond_7
    instance-of v1, v15, Lm4/l;

    if-eqz v1, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {v15}, Lm4/e;->y()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v15}, Lm4/e;->z()Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_6

    :cond_9
    add-int/lit8 v14, v14, 0x1

    move/from16 v1, p1

    goto :goto_2

    :cond_a
    move/from16 p1, v1

    const/16 v17, 0x1

    move/from16 v1, p1

    :goto_7
    const/high16 v14, 0x40000000    # 2.0f

    if-ne v2, v14, :cond_b

    if-eq v3, v14, :cond_c

    :cond_b
    if-eqz v12, :cond_d

    :cond_c
    move/from16 v15, v17

    goto :goto_8

    :cond_d
    move/from16 v15, p7

    :goto_8
    and-int/2addr v1, v15

    if-eqz v1, :cond_2e

    iget-object v15, v0, Lm4/e;->D:[I

    aget v13, v15, p7

    move/from16 v14, p3

    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    move-result v13

    aget v14, v15, v17

    move/from16 v15, p5

    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    move-result v14

    const/high16 v15, 0x40000000    # 2.0f

    if-ne v2, v15, :cond_f

    invoke-virtual {v0}, Lm4/e;->r()I

    move-result v15

    if-eq v15, v13, :cond_e

    invoke-virtual {v0, v13}, Lm4/e;->S(I)V

    move/from16 v13, v17

    iput-boolean v13, v8, Ln4/f;->b:Z

    :goto_9
    const/high16 v15, 0x40000000    # 2.0f

    goto :goto_a

    :cond_e
    move/from16 v13, v17

    goto :goto_9

    :cond_f
    move/from16 v13, v17

    :goto_a
    if-ne v3, v15, :cond_11

    invoke-virtual {v0}, Lm4/e;->l()I

    move-result v15

    if-eq v15, v14, :cond_10

    invoke-virtual {v0, v14}, Lm4/e;->N(I)V

    iput-boolean v13, v8, Ln4/f;->b:Z

    :cond_10
    const/high16 v15, 0x40000000    # 2.0f

    :cond_11
    if-ne v2, v15, :cond_27

    if-ne v3, v15, :cond_27

    iget-object v13, v8, Ln4/f;->f:Ljava/io/Serializable;

    check-cast v13, Ljava/util/ArrayList;

    iget-object v14, v8, Ln4/f;->d:Ljava/lang/Object;

    check-cast v14, Lm4/f;

    iget-boolean v15, v8, Ln4/f;->b:Z

    if-nez v15, :cond_13

    iget-boolean v15, v8, Ln4/f;->c:Z

    if-eqz v15, :cond_12

    goto :goto_b

    :cond_12
    move/from16 v21, v1

    move/from16 v20, v9

    move/from16 v9, p7

    goto :goto_d

    :cond_13
    :goto_b
    iget-object v15, v14, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_c
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_14

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move/from16 v21, v1

    move-object/from16 v1, v20

    check-cast v1, Lm4/e;

    invoke-virtual {v1}, Lm4/e;->i()V

    move/from16 v20, v9

    move/from16 v9, p7

    iput-boolean v9, v1, Lm4/e;->a:Z

    iget-object v9, v1, Lm4/e;->d:Ln4/l;

    invoke-virtual {v9}, Ln4/l;->n()V

    iget-object v1, v1, Lm4/e;->e:Ln4/n;

    invoke-virtual {v1}, Ln4/n;->m()V

    move/from16 v9, v20

    move/from16 v1, v21

    const/16 p7, 0x0

    goto :goto_c

    :cond_14
    move/from16 v21, v1

    move/from16 v20, v9

    invoke-virtual {v14}, Lm4/e;->i()V

    const/4 v9, 0x0

    iput-boolean v9, v14, Lm4/e;->a:Z

    iget-object v1, v14, Lm4/e;->d:Ln4/l;

    invoke-virtual {v1}, Ln4/l;->n()V

    iget-object v1, v14, Lm4/e;->e:Ln4/n;

    invoke-virtual {v1}, Ln4/n;->m()V

    iput-boolean v9, v8, Ln4/f;->c:Z

    :goto_d
    iget-object v1, v8, Ln4/f;->e:Ljava/lang/Object;

    check-cast v1, Lm4/f;

    invoke-virtual {v8, v1}, Ln4/f;->b(Lm4/f;)V

    iput v9, v14, Lm4/e;->Z:I

    iget-object v1, v14, Lm4/e;->q0:[I

    iput v9, v14, Lm4/e;->a0:I

    invoke-virtual {v14, v9}, Lm4/e;->k(I)I

    move-result v15

    move-object/from16 p3, v1

    const/4 v9, 0x1

    invoke-virtual {v14, v9}, Lm4/e;->k(I)I

    move-result v1

    iget-boolean v9, v8, Ln4/f;->b:Z

    if-eqz v9, :cond_15

    invoke-virtual {v8}, Ln4/f;->c()V

    :cond_15
    invoke-virtual {v14}, Lm4/e;->s()I

    move-result v9

    move-object/from16 p5, v13

    invoke-virtual {v14}, Lm4/e;->t()I

    move-result v13

    move-object/from16 v22, v7

    iget-object v7, v14, Lm4/e;->d:Ln4/l;

    iget-object v7, v7, Ln4/p;->h:Ln4/g;

    invoke-virtual {v7, v9}, Ln4/g;->d(I)V

    iget-object v7, v14, Lm4/e;->e:Ln4/n;

    iget-object v7, v7, Ln4/p;->h:Ln4/g;

    invoke-virtual {v7, v13}, Ln4/g;->d(I)V

    invoke-virtual {v8}, Ln4/f;->g()V

    const/4 v7, 0x2

    if-eq v15, v7, :cond_17

    if-ne v1, v7, :cond_16

    goto :goto_e

    :cond_16
    move/from16 v23, v9

    const/4 v7, 0x0

    const/4 v9, 0x1

    goto :goto_11

    :cond_17
    :goto_e
    if-eqz v12, :cond_19

    invoke-virtual/range {p5 .. p5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_18
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v23

    if-eqz v23, :cond_19

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Ln4/p;

    invoke-virtual/range {v23 .. v23}, Ln4/p;->k()Z

    move-result v23

    if-nez v23, :cond_18

    const/4 v12, 0x0

    :cond_19
    if-eqz v12, :cond_1a

    const/4 v7, 0x2

    if-ne v15, v7, :cond_1a

    const/4 v7, 0x1

    invoke-virtual {v14, v7}, Lm4/e;->O(I)V

    move/from16 v23, v9

    const/4 v7, 0x0

    invoke-virtual {v8, v14, v7}, Ln4/f;->d(Lm4/f;I)I

    move-result v9

    invoke-virtual {v14, v9}, Lm4/e;->S(I)V

    iget-object v7, v14, Lm4/e;->d:Ln4/l;

    iget-object v7, v7, Ln4/p;->e:Ln4/h;

    invoke-virtual {v14}, Lm4/e;->r()I

    move-result v9

    invoke-virtual {v7, v9}, Ln4/h;->d(I)V

    goto :goto_f

    :cond_1a
    move/from16 v23, v9

    :goto_f
    if-eqz v12, :cond_1b

    const/4 v7, 0x2

    if-ne v1, v7, :cond_1b

    const/4 v9, 0x1

    invoke-virtual {v14, v9}, Lm4/e;->Q(I)V

    invoke-virtual {v8, v14, v9}, Ln4/f;->d(Lm4/f;I)I

    move-result v7

    invoke-virtual {v14, v7}, Lm4/e;->N(I)V

    iget-object v7, v14, Lm4/e;->e:Ln4/n;

    iget-object v7, v7, Ln4/p;->e:Ln4/h;

    invoke-virtual {v14}, Lm4/e;->l()I

    move-result v12

    invoke-virtual {v7, v12}, Ln4/h;->d(I)V

    :goto_10
    const/4 v7, 0x0

    goto :goto_11

    :cond_1b
    const/4 v9, 0x1

    goto :goto_10

    :goto_11
    aget v12, p3, v7

    if-eq v12, v9, :cond_1d

    const/4 v7, 0x4

    if-ne v12, v7, :cond_1c

    goto :goto_12

    :cond_1c
    const/4 v7, 0x0

    goto :goto_13

    :cond_1d
    :goto_12
    invoke-virtual {v14}, Lm4/e;->r()I

    move-result v7

    add-int v7, v7, v23

    iget-object v9, v14, Lm4/e;->d:Ln4/l;

    iget-object v9, v9, Ln4/p;->i:Ln4/g;

    invoke-virtual {v9, v7}, Ln4/g;->d(I)V

    iget-object v9, v14, Lm4/e;->d:Ln4/l;

    iget-object v9, v9, Ln4/p;->e:Ln4/h;

    sub-int v7, v7, v23

    invoke-virtual {v9, v7}, Ln4/h;->d(I)V

    invoke-virtual {v8}, Ln4/f;->g()V

    const/4 v9, 0x1

    aget v7, p3, v9

    if-eq v7, v9, :cond_1e

    const/4 v9, 0x4

    if-ne v7, v9, :cond_1f

    :cond_1e
    invoke-virtual {v14}, Lm4/e;->l()I

    move-result v7

    add-int/2addr v7, v13

    iget-object v9, v14, Lm4/e;->e:Ln4/n;

    iget-object v9, v9, Ln4/p;->i:Ln4/g;

    invoke-virtual {v9, v7}, Ln4/g;->d(I)V

    iget-object v9, v14, Lm4/e;->e:Ln4/n;

    iget-object v9, v9, Ln4/p;->e:Ln4/h;

    sub-int/2addr v7, v13

    invoke-virtual {v9, v7}, Ln4/h;->d(I)V

    :cond_1f
    invoke-virtual {v8}, Ln4/f;->g()V

    const/4 v7, 0x1

    :goto_13
    invoke-virtual/range {p5 .. p5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_14
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_21

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ln4/p;

    iget-object v12, v9, Ln4/p;->b:Lm4/e;

    if-ne v12, v14, :cond_20

    iget-boolean v12, v9, Ln4/p;->g:Z

    if-nez v12, :cond_20

    goto :goto_14

    :cond_20
    invoke-virtual {v9}, Ln4/p;->e()V

    goto :goto_14

    :cond_21
    invoke-virtual/range {p5 .. p5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_22
    :goto_15
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_26

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ln4/p;

    if-nez v7, :cond_23

    iget-object v12, v9, Ln4/p;->b:Lm4/e;

    if-ne v12, v14, :cond_23

    goto :goto_15

    :cond_23
    iget-object v12, v9, Ln4/p;->h:Ln4/g;

    iget-boolean v12, v12, Ln4/g;->j:Z

    if-nez v12, :cond_24

    :goto_16
    const/4 v7, 0x0

    goto :goto_17

    :cond_24
    iget-object v12, v9, Ln4/p;->i:Ln4/g;

    iget-boolean v12, v12, Ln4/g;->j:Z

    if-nez v12, :cond_25

    instance-of v12, v9, Ln4/j;

    if-nez v12, :cond_25

    goto :goto_16

    :cond_25
    iget-object v12, v9, Ln4/p;->e:Ln4/h;

    iget-boolean v12, v12, Ln4/g;->j:Z

    if-nez v12, :cond_22

    instance-of v12, v9, Ln4/d;

    if-nez v12, :cond_22

    instance-of v9, v9, Ln4/j;

    if-nez v9, :cond_22

    goto :goto_16

    :cond_26
    const/4 v7, 0x1

    :goto_17
    invoke-virtual {v14, v15}, Lm4/e;->O(I)V

    invoke-virtual {v14, v1}, Lm4/e;->Q(I)V

    const/4 v1, 0x2

    const/high16 v15, 0x40000000    # 2.0f

    goto/16 :goto_1b

    :cond_27
    move/from16 v21, v1

    move-object/from16 v22, v7

    move/from16 v20, v9

    iget-object v1, v8, Ln4/f;->d:Ljava/lang/Object;

    check-cast v1, Lm4/f;

    iget-boolean v7, v8, Ln4/f;->b:Z

    if-eqz v7, :cond_29

    iget-object v7, v1, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_18
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_28

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lm4/e;

    invoke-virtual {v9}, Lm4/e;->i()V

    const/4 v13, 0x0

    iput-boolean v13, v9, Lm4/e;->a:Z

    iget-object v14, v9, Lm4/e;->d:Ln4/l;

    iget-object v15, v14, Ln4/p;->e:Ln4/h;

    iput-boolean v13, v15, Ln4/g;->j:Z

    iput-boolean v13, v14, Ln4/p;->g:Z

    invoke-virtual {v14}, Ln4/l;->n()V

    iget-object v9, v9, Lm4/e;->e:Ln4/n;

    iget-object v14, v9, Ln4/p;->e:Ln4/h;

    iput-boolean v13, v14, Ln4/g;->j:Z

    iput-boolean v13, v9, Ln4/p;->g:Z

    invoke-virtual {v9}, Ln4/n;->m()V

    goto :goto_18

    :cond_28
    const/4 v13, 0x0

    invoke-virtual {v1}, Lm4/e;->i()V

    iput-boolean v13, v1, Lm4/e;->a:Z

    iget-object v7, v1, Lm4/e;->d:Ln4/l;

    iget-object v9, v7, Ln4/p;->e:Ln4/h;

    iput-boolean v13, v9, Ln4/g;->j:Z

    iput-boolean v13, v7, Ln4/p;->g:Z

    invoke-virtual {v7}, Ln4/l;->n()V

    iget-object v7, v1, Lm4/e;->e:Ln4/n;

    iget-object v9, v7, Ln4/p;->e:Ln4/h;

    iput-boolean v13, v9, Ln4/g;->j:Z

    iput-boolean v13, v7, Ln4/p;->g:Z

    invoke-virtual {v7}, Ln4/n;->m()V

    invoke-virtual {v8}, Ln4/f;->c()V

    goto :goto_19

    :cond_29
    const/4 v13, 0x0

    :goto_19
    iget-object v7, v8, Ln4/f;->e:Ljava/lang/Object;

    check-cast v7, Lm4/f;

    invoke-virtual {v8, v7}, Ln4/f;->b(Lm4/f;)V

    iput v13, v1, Lm4/e;->Z:I

    iput v13, v1, Lm4/e;->a0:I

    iget-object v7, v1, Lm4/e;->d:Ln4/l;

    iget-object v7, v7, Ln4/p;->h:Ln4/g;

    invoke-virtual {v7, v13}, Ln4/g;->d(I)V

    iget-object v1, v1, Lm4/e;->e:Ln4/n;

    iget-object v1, v1, Ln4/p;->h:Ln4/g;

    invoke-virtual {v1, v13}, Ln4/g;->d(I)V

    const/high16 v15, 0x40000000    # 2.0f

    if-ne v2, v15, :cond_2a

    invoke-virtual {v0, v13, v12}, Lm4/f;->Y(IZ)Z

    move-result v1

    move v7, v1

    const/4 v1, 0x1

    goto :goto_1a

    :cond_2a
    const/4 v1, 0x0

    const/4 v7, 0x1

    :goto_1a
    if-ne v3, v15, :cond_2b

    const/4 v9, 0x1

    invoke-virtual {v0, v9, v12}, Lm4/f;->Y(IZ)Z

    move-result v8

    and-int/2addr v7, v8

    add-int/lit8 v1, v1, 0x1

    :cond_2b
    :goto_1b
    if-eqz v7, :cond_2f

    if-ne v2, v15, :cond_2c

    const/4 v2, 0x1

    goto :goto_1c

    :cond_2c
    const/4 v2, 0x0

    :goto_1c
    if-ne v3, v15, :cond_2d

    const/4 v3, 0x1

    goto :goto_1d

    :cond_2d
    const/4 v3, 0x0

    :goto_1d
    invoke-virtual {v0, v2, v3}, Lm4/f;->T(ZZ)V

    goto :goto_1e

    :cond_2e
    move/from16 v21, v1

    move-object/from16 v22, v7

    move/from16 v20, v9

    const/4 v1, 0x0

    const/4 v7, 0x0

    :cond_2f
    :goto_1e
    if-eqz v7, :cond_30

    const/4 v7, 0x2

    if-eq v1, v7, :cond_55

    :cond_30
    iget v1, v0, Lm4/f;->E0:I

    if-lez v20, :cond_3d

    iget-object v2, v0, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v3, 0x40

    invoke-virtual {v0, v3}, Lm4/f;->c0(I)Z

    move-result v3

    iget-object v7, v0, Lm4/f;->v0:Ln4/c;

    const/4 v9, 0x0

    :goto_1f
    if-ge v9, v2, :cond_3c

    iget-object v8, v0, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm4/e;

    instance-of v12, v8, Lm4/i;

    if-eqz v12, :cond_31

    :goto_20
    move/from16 p2, v2

    const/4 v13, 0x0

    const/4 v15, 0x3

    goto/16 :goto_23

    :cond_31
    instance-of v12, v8, Lm4/b;

    if-eqz v12, :cond_32

    goto :goto_20

    :cond_32
    iget-boolean v12, v8, Lm4/e;->G:Z

    if-eqz v12, :cond_33

    goto :goto_20

    :cond_33
    if-eqz v3, :cond_34

    iget-object v12, v8, Lm4/e;->d:Ln4/l;

    if-eqz v12, :cond_34

    iget-object v13, v8, Lm4/e;->e:Ln4/n;

    if-eqz v13, :cond_34

    iget-object v12, v12, Ln4/p;->e:Ln4/h;

    iget-boolean v12, v12, Ln4/g;->j:Z

    if-eqz v12, :cond_34

    iget-object v12, v13, Ln4/p;->e:Ln4/h;

    iget-boolean v12, v12, Ln4/g;->j:Z

    if-eqz v12, :cond_34

    goto :goto_20

    :cond_34
    const/4 v13, 0x0

    invoke-virtual {v8, v13}, Lm4/e;->k(I)I

    move-result v12

    const/4 v13, 0x1

    invoke-virtual {v8, v13}, Lm4/e;->k(I)I

    move-result v14

    const/4 v15, 0x3

    move/from16 p2, v2

    if-ne v12, v15, :cond_35

    iget v2, v8, Lm4/e;->s:I

    if-eq v2, v13, :cond_35

    if-ne v14, v15, :cond_35

    iget v2, v8, Lm4/e;->t:I

    if-eq v2, v13, :cond_35

    move v2, v13

    goto :goto_21

    :cond_35
    const/4 v2, 0x0

    :goto_21
    if-nez v2, :cond_39

    invoke-virtual {v0, v13}, Lm4/f;->c0(I)Z

    move-result v15

    if-eqz v15, :cond_39

    instance-of v13, v8, Lm4/l;

    if-nez v13, :cond_39

    const/4 v15, 0x3

    if-ne v12, v15, :cond_36

    iget v13, v8, Lm4/e;->s:I

    if-nez v13, :cond_36

    if-eq v14, v15, :cond_36

    invoke-virtual {v8}, Lm4/e;->y()Z

    move-result v13

    if-nez v13, :cond_36

    const/4 v2, 0x1

    :cond_36
    if-ne v14, v15, :cond_37

    iget v13, v8, Lm4/e;->t:I

    if-nez v13, :cond_37

    if-eq v12, v15, :cond_37

    invoke-virtual {v8}, Lm4/e;->y()Z

    move-result v13

    if-nez v13, :cond_37

    const/4 v2, 0x1

    :cond_37
    if-eq v12, v15, :cond_38

    if-ne v14, v15, :cond_3a

    :cond_38
    iget v12, v8, Lm4/e;->X:F

    cmpl-float v12, v12, v16

    if-lez v12, :cond_3a

    const/4 v2, 0x1

    goto :goto_22

    :cond_39
    const/4 v15, 0x3

    :cond_3a
    :goto_22
    if-eqz v2, :cond_3b

    const/4 v13, 0x0

    goto :goto_23

    :cond_3b
    const/4 v13, 0x0

    invoke-virtual {v4, v13, v8, v7}, La3/p;->F(ILm4/e;Ln4/c;)Z

    :goto_23
    add-int/lit8 v9, v9, 0x1

    move/from16 v2, p2

    goto/16 :goto_1f

    :cond_3c
    const/4 v13, 0x0

    invoke-interface {v7}, Ln4/c;->b()V

    goto :goto_24

    :cond_3d
    const/4 v13, 0x0

    :goto_24
    invoke-virtual {v4, v0}, La3/p;->a0(Lm4/f;)V

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v20, :cond_3e

    invoke-virtual {v4, v0, v13, v10, v11}, La3/p;->X(Lm4/f;III)V

    :cond_3e
    if-lez v2, :cond_54

    iget-object v3, v0, Lm4/e;->q0:[I

    aget v7, v3, v13

    const/4 v8, 0x2

    if-ne v7, v8, :cond_3f

    const/4 v7, 0x1

    :goto_25
    const/16 v17, 0x1

    goto :goto_26

    :cond_3f
    move v7, v13

    goto :goto_25

    :goto_26
    aget v3, v3, v17

    if-ne v3, v8, :cond_40

    const/4 v3, 0x1

    goto :goto_27

    :cond_40
    move v3, v13

    :goto_27
    invoke-virtual {v0}, Lm4/e;->r()I

    move-result v8

    iget v9, v5, Lm4/e;->c0:I

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v8

    invoke-virtual {v0}, Lm4/e;->l()I

    move-result v9

    iget v5, v5, Lm4/e;->d0:I

    invoke-static {v9, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    move v9, v13

    move v12, v9

    :goto_28
    if-ge v9, v2, :cond_46

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lm4/e;

    instance-of v13, v15, Lm4/l;

    if-nez v13, :cond_41

    move/from16 p2, v3

    move/from16 p3, v7

    move-object/from16 v3, v22

    goto/16 :goto_2a

    :cond_41
    invoke-virtual {v15}, Lm4/e;->r()I

    move-result v13

    invoke-virtual {v15}, Lm4/e;->l()I

    move-result v14

    move/from16 p2, v3

    move/from16 p3, v7

    move-object/from16 v3, v22

    const/4 v7, 0x1

    invoke-virtual {v4, v7, v15, v3}, La3/p;->F(ILm4/e;Ln4/c;)Z

    move-result v16

    or-int v7, v12, v16

    invoke-virtual {v15}, Lm4/e;->r()I

    move-result v12

    move/from16 p4, v7

    invoke-virtual {v15}, Lm4/e;->l()I

    move-result v7

    if-eq v12, v13, :cond_43

    invoke-virtual {v15, v12}, Lm4/e;->S(I)V

    if-eqz p3, :cond_42

    invoke-virtual {v15}, Lm4/e;->s()I

    move-result v12

    iget v13, v15, Lm4/e;->V:I

    add-int/2addr v12, v13

    if-le v12, v8, :cond_42

    invoke-virtual {v15}, Lm4/e;->s()I

    move-result v12

    iget v13, v15, Lm4/e;->V:I

    add-int/2addr v12, v13

    const/4 v13, 0x4

    invoke-virtual {v15, v13}, Lm4/e;->j(I)Lm4/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lm4/d;->e()I

    move-result v13

    add-int/2addr v13, v12

    invoke-static {v8, v13}, Ljava/lang/Math;->max(II)I

    move-result v8

    :cond_42
    const/4 v13, 0x1

    goto :goto_29

    :cond_43
    move/from16 v13, p4

    :goto_29
    if-eq v7, v14, :cond_45

    invoke-virtual {v15, v7}, Lm4/e;->N(I)V

    if-eqz p2, :cond_44

    invoke-virtual {v15}, Lm4/e;->t()I

    move-result v7

    iget v12, v15, Lm4/e;->W:I

    add-int/2addr v7, v12

    if-le v7, v5, :cond_44

    invoke-virtual {v15}, Lm4/e;->t()I

    move-result v7

    iget v12, v15, Lm4/e;->W:I

    add-int/2addr v7, v12

    const/4 v12, 0x5

    invoke-virtual {v15, v12}, Lm4/e;->j(I)Lm4/d;

    move-result-object v12

    invoke-virtual {v12}, Lm4/d;->e()I

    move-result v12

    add-int/2addr v12, v7

    invoke-static {v5, v12}, Ljava/lang/Math;->max(II)I

    move-result v5

    :cond_44
    const/4 v13, 0x1

    :cond_45
    check-cast v15, Lm4/l;

    iget-boolean v7, v15, Lm4/l;->z0:Z

    or-int/2addr v7, v13

    move v12, v7

    :goto_2a
    add-int/lit8 v9, v9, 0x1

    move/from16 v7, p3

    move-object/from16 v22, v3

    const/4 v13, 0x0

    move/from16 v3, p2

    goto/16 :goto_28

    :cond_46
    move/from16 p2, v3

    move/from16 p3, v7

    const/4 v9, 0x0

    :goto_2b
    move-object/from16 v3, v22

    const/4 v7, 0x2

    if-ge v9, v7, :cond_54

    move v13, v12

    const/4 v12, 0x0

    :goto_2c
    if-ge v12, v2, :cond_53

    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lm4/e;

    instance-of v15, v14, Lm4/j;

    if-eqz v15, :cond_47

    instance-of v15, v14, Lm4/l;

    if-eqz v15, :cond_4b

    :cond_47
    instance-of v15, v14, Lm4/i;

    if-eqz v15, :cond_48

    goto :goto_2d

    :cond_48
    iget v15, v14, Lm4/e;->h0:I

    const/16 v7, 0x8

    if-ne v15, v7, :cond_49

    goto :goto_2d

    :cond_49
    if-eqz v21, :cond_4a

    iget-object v7, v14, Lm4/e;->d:Ln4/l;

    iget-object v7, v7, Ln4/p;->e:Ln4/h;

    iget-boolean v7, v7, Ln4/g;->j:Z

    if-eqz v7, :cond_4a

    iget-object v7, v14, Lm4/e;->e:Ln4/n;

    iget-object v7, v7, Ln4/p;->e:Ln4/h;

    iget-boolean v7, v7, Ln4/g;->j:Z

    if-eqz v7, :cond_4a

    goto :goto_2d

    :cond_4a
    instance-of v7, v14, Lm4/l;

    if-eqz v7, :cond_4c

    :cond_4b
    :goto_2d
    move/from16 p4, v2

    move-object/from16 v22, v3

    move-object/from16 p6, v6

    const/4 v6, 0x5

    const/4 v7, 0x4

    goto/16 :goto_32

    :cond_4c
    invoke-virtual {v14}, Lm4/e;->r()I

    move-result v7

    invoke-virtual {v14}, Lm4/e;->l()I

    move-result v15

    move/from16 p4, v2

    iget v2, v14, Lm4/e;->b0:I

    move-object/from16 p6, v6

    const/4 v6, 0x1

    if-ne v9, v6, :cond_4d

    const/4 v6, 0x2

    :cond_4d
    invoke-virtual {v4, v6, v14, v3}, La3/p;->F(ILm4/e;Ln4/c;)Z

    move-result v6

    or-int/2addr v13, v6

    invoke-virtual {v14}, Lm4/e;->r()I

    move-result v6

    move-object/from16 v22, v3

    invoke-virtual {v14}, Lm4/e;->l()I

    move-result v3

    if-eq v6, v7, :cond_4f

    invoke-virtual {v14, v6}, Lm4/e;->S(I)V

    if-eqz p3, :cond_4e

    invoke-virtual {v14}, Lm4/e;->s()I

    move-result v6

    iget v7, v14, Lm4/e;->V:I

    add-int/2addr v6, v7

    if-le v6, v8, :cond_4e

    invoke-virtual {v14}, Lm4/e;->s()I

    move-result v6

    iget v7, v14, Lm4/e;->V:I

    add-int/2addr v6, v7

    const/4 v7, 0x4

    invoke-virtual {v14, v7}, Lm4/e;->j(I)Lm4/d;

    move-result-object v13

    invoke-virtual {v13}, Lm4/d;->e()I

    move-result v13

    add-int/2addr v13, v6

    invoke-static {v8, v13}, Ljava/lang/Math;->max(II)I

    move-result v8

    goto :goto_2e

    :cond_4e
    const/4 v7, 0x4

    :goto_2e
    const/4 v13, 0x1

    goto :goto_2f

    :cond_4f
    const/4 v7, 0x4

    :goto_2f
    if-eq v3, v15, :cond_51

    invoke-virtual {v14, v3}, Lm4/e;->N(I)V

    if-eqz p2, :cond_50

    invoke-virtual {v14}, Lm4/e;->t()I

    move-result v3

    iget v6, v14, Lm4/e;->W:I

    add-int/2addr v3, v6

    if-le v3, v5, :cond_50

    invoke-virtual {v14}, Lm4/e;->t()I

    move-result v3

    iget v6, v14, Lm4/e;->W:I

    add-int/2addr v3, v6

    const/4 v6, 0x5

    invoke-virtual {v14, v6}, Lm4/e;->j(I)Lm4/d;

    move-result-object v13

    invoke-virtual {v13}, Lm4/d;->e()I

    move-result v13

    add-int/2addr v13, v3

    invoke-static {v5, v13}, Ljava/lang/Math;->max(II)I

    move-result v5

    goto :goto_30

    :cond_50
    const/4 v6, 0x5

    :goto_30
    const/4 v13, 0x1

    goto :goto_31

    :cond_51
    const/4 v6, 0x5

    :goto_31
    iget-boolean v3, v14, Lm4/e;->F:Z

    if-eqz v3, :cond_52

    iget v3, v14, Lm4/e;->b0:I

    if-eq v2, v3, :cond_52

    const/4 v13, 0x1

    :cond_52
    :goto_32
    add-int/lit8 v12, v12, 0x1

    move/from16 v2, p4

    move-object/from16 v6, p6

    move-object/from16 v3, v22

    const/4 v7, 0x2

    goto/16 :goto_2c

    :cond_53
    move/from16 p4, v2

    move-object/from16 v22, v3

    move-object/from16 p6, v6

    const/4 v6, 0x5

    const/4 v7, 0x4

    if-eqz v13, :cond_54

    add-int/lit8 v9, v9, 0x1

    invoke-virtual {v4, v0, v9, v10, v11}, La3/p;->X(Lm4/f;III)V

    move/from16 v2, p4

    move-object/from16 v6, p6

    const/4 v12, 0x0

    goto/16 :goto_2b

    :cond_54
    iput v1, v0, Lm4/f;->E0:I

    const/16 v1, 0x200

    invoke-virtual {v0, v1}, Lm4/f;->c0(I)Z

    move-result v1

    sput-boolean v1, Lf4/c;->q:Z

    :cond_55
    return-void
.end method

.method public final c0(I)Z
    .locals 1

    iget v0, p0, Lm4/f;->E0:I

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final o(Ljava/lang/StringBuilder;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lm4/e;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":{\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "  actualWidth:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lm4/e;->V:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "  actualHeight:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lm4/e;->W:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm4/e;

    invoke-virtual {v1, p1}, Lm4/e;->o(Ljava/lang/StringBuilder;)V

    const-string v1, ",\n"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v0, "}"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method
