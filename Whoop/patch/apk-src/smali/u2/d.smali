.class public final Lu2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ly2/y;

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Z

.field public final f:La0/q0;

.field public final g:Lu2/j;

.field public final h:La0/k0;


# direct methods
.method public constructor <init>(Ly2/y;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/d;->a:Ly2/y;

    new-instance p1, La0/q0;

    invoke-direct {p1}, La0/q0;-><init>()V

    iput-object p1, p0, Lu2/d;->f:La0/q0;

    new-instance p1, Lu2/j;

    invoke-direct {p1}, Lu2/j;-><init>()V

    iput-object p1, p0, Lu2/d;->g:Lu2/j;

    new-instance p1, La0/k0;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, La0/k0;-><init>(I)V

    iput-object p1, p0, Lu2/d;->h:La0/k0;

    return-void
.end method


# virtual methods
.method public final a(JLjava/util/List;Z)V
    .locals 17

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p3

    iget-object v4, v0, Lu2/d;->h:La0/k0;

    invoke-virtual {v4}, La0/k0;->a()V

    move-object v5, v3

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    iget-object v6, v0, Lu2/d;->g:Lu2/j;

    const/4 v7, 0x1

    move-object v11, v6

    move v10, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v5, :cond_7

    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lb2/v;

    iget-boolean v13, v12, Lb2/v;->N:Z

    if-eqz v13, :cond_6

    new-instance v13, Lr5/c;

    const/16 v14, 0x9

    invoke-direct {v13, v14, v0, v12}, Lr5/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v13, v12, Lb2/v;->M:Lr5/c;

    if-eqz v10, :cond_4

    iget-object v13, v11, Lu2/j;->a:Lr1/c;

    iget-object v14, v13, Lr1/c;->w:[Ljava/lang/Object;

    iget v13, v13, Lr1/c;->y:I

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v13, :cond_1

    aget-object v16, v14, v15

    move-object/from16 v8, v16

    check-cast v8, Lu2/i;

    iget-object v8, v8, Lu2/i;->c:Lb2/v;

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    :cond_1
    const/16 v16, 0x0

    :goto_2
    move-object/from16 v8, v16

    check-cast v8, Lu2/i;

    if-eqz v8, :cond_3

    iput-boolean v7, v8, Lu2/i;->i:Z

    iget-object v11, v8, Lu2/i;->d:Llo/k;

    invoke-virtual {v11, v1, v2}, Llo/k;->a(J)V

    invoke-virtual {v4, v1, v2}, La0/k0;->e(J)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_2

    new-instance v11, La0/q0;

    invoke-direct {v11}, La0/q0;-><init>()V

    invoke-virtual {v4, v1, v2, v11}, La0/k0;->h(JLjava/lang/Object;)V

    :cond_2
    check-cast v11, La0/q0;

    invoke-virtual {v11, v8}, La0/q0;->a(Ljava/lang/Object;)V

    :goto_3
    move-object v11, v8

    goto :goto_4

    :cond_3
    const/4 v10, 0x0

    :cond_4
    new-instance v8, Lu2/i;

    invoke-direct {v8, v12}, Lu2/i;-><init>(Lb2/v;)V

    iget-object v12, v8, Lu2/i;->d:Llo/k;

    invoke-virtual {v12, v1, v2}, Llo/k;->a(J)V

    invoke-virtual {v4, v1, v2}, La0/k0;->e(J)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_5

    new-instance v12, La0/q0;

    invoke-direct {v12}, La0/q0;-><init>()V

    invoke-virtual {v4, v1, v2, v12}, La0/k0;->h(JLjava/lang/Object;)V

    :cond_5
    check-cast v12, La0/q0;

    invoke-virtual {v12, v8}, La0/q0;->a(Ljava/lang/Object;)V

    iget-object v11, v11, Lu2/j;->a:Lr1/c;

    invoke-virtual {v11, v8}, Lr1/c;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_6
    :goto_4
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_7
    if-eqz p4, :cond_c

    iget-object v1, v4, La0/k0;->b:[J

    iget-object v2, v4, La0/k0;->c:[Ljava/lang/Object;

    iget-object v3, v4, La0/k0;->a:[J

    array-length v4, v3

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_c

    const/4 v5, 0x0

    :goto_5
    aget-wide v7, v3, v5

    not-long v9, v7

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v7

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v11

    cmp-long v9, v9, v11

    if-eqz v9, :cond_b

    sub-int v9, v5, v4

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    const/4 v11, 0x0

    :goto_6
    if-ge v11, v9, :cond_a

    const-wide/16 v12, 0xff

    and-long/2addr v12, v7

    const-wide/16 v14, 0x80

    cmp-long v12, v12, v14

    if-gez v12, :cond_8

    shl-int/lit8 v12, v5, 0x3

    add-int/2addr v12, v11

    aget-wide v13, v1, v12

    aget-object v12, v2, v12

    check-cast v12, La0/q0;

    iget-object v15, v6, Lu2/j;->a:Lr1/c;

    move/from16 p1, v10

    iget-object v10, v15, Lr1/c;->w:[Ljava/lang/Object;

    iget v15, v15, Lr1/c;->y:I

    const/4 v0, 0x0

    :goto_7
    if-ge v0, v15, :cond_9

    aget-object v16, v10, v0

    move/from16 p2, v0

    move-object/from16 v0, v16

    check-cast v0, Lu2/i;

    invoke-virtual {v0, v13, v14, v12}, Lu2/i;->f(JLa0/q0;)V

    add-int/lit8 v0, p2, 0x1

    goto :goto_7

    :cond_8
    move/from16 p1, v10

    :cond_9
    shr-long v7, v7, p1

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, p0

    move/from16 v10, p1

    goto :goto_6

    :cond_a
    move v0, v10

    if-ne v9, v0, :cond_c

    :cond_b
    if-eq v5, v4, :cond_c

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v0, p0

    goto :goto_5

    :cond_c
    return-void
.end method

.method public final b(Lf1/p1;Z)Z
    .locals 9

    invoke-virtual {p1}, Lf1/p1;->k()La0/y;

    move-result-object v0

    iget-object v1, p0, Lu2/d;->a:Ly2/y;

    iget-object v2, p0, Lu2/d;->g:Lu2/j;

    invoke-virtual {v2, v0, v1, p1, p2}, Lu2/j;->a(La0/y;Ly2/y;Lf1/p1;Z)Z

    move-result v0

    iget-object v1, v2, Lu2/j;->a:Lr1/c;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    return v3

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lu2/d;->b:Z

    iget-object v4, v1, Lr1/c;->w:[Ljava/lang/Object;

    iget v5, v1, Lr1/c;->y:I

    move v6, v3

    move v7, v6

    :goto_0
    if-ge v6, v5, :cond_3

    aget-object v8, v4, v6

    check-cast v8, Lu2/i;

    invoke-virtual {v8, p1, p2}, Lu2/i;->e(Lf1/p1;Z)Z

    move-result v8

    if-nez v8, :cond_2

    if-eqz v7, :cond_1

    goto :goto_1

    :cond_1
    move v7, v3

    goto :goto_2

    :cond_2
    :goto_1
    move v7, v0

    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    iget-object p2, v1, Lr1/c;->w:[Ljava/lang/Object;

    iget v1, v1, Lr1/c;->y:I

    move v4, v3

    move v5, v4

    :goto_3
    if-ge v4, v1, :cond_6

    aget-object v6, p2, v4

    check-cast v6, Lu2/i;

    invoke-virtual {v6, p1}, Lu2/i;->d(Lf1/p1;)Z

    move-result v6

    if-nez v6, :cond_5

    if-eqz v5, :cond_4

    goto :goto_4

    :cond_4
    move v5, v3

    goto :goto_5

    :cond_5
    :goto_4
    move v5, v0

    :goto_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_6
    invoke-virtual {v2, p1}, Lu2/j;->b(Lf1/p1;)V

    if-nez v5, :cond_8

    if-eqz v7, :cond_7

    goto :goto_6

    :cond_7
    move v0, v3

    :cond_8
    :goto_6
    iput-boolean v3, p0, Lu2/d;->b:Z

    iget-boolean p1, p0, Lu2/d;->e:Z

    if-eqz p1, :cond_a

    iput-boolean v3, p0, Lu2/d;->e:Z

    iget-object p1, p0, Lu2/d;->f:La0/q0;

    iget p2, p1, La0/q0;->b:I

    move v1, v3

    :goto_7
    if-ge v1, p2, :cond_9

    invoke-virtual {p1, v1}, La0/q0;->e(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb2/v;

    invoke-virtual {p0, v4}, Lu2/d;->d(Lb2/v;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_9
    invoke-virtual {p1}, La0/q0;->c()V

    :cond_a
    iget-boolean p1, p0, Lu2/d;->c:Z

    if-eqz p1, :cond_b

    iput-boolean v3, p0, Lu2/d;->c:Z

    invoke-virtual {p0}, Lu2/d;->c()V

    :cond_b
    iget-boolean p1, p0, Lu2/d;->d:Z

    if-eqz p1, :cond_c

    iput-boolean v3, p0, Lu2/d;->d:Z

    iget-object p1, v2, Lu2/j;->a:Lr1/c;

    invoke-virtual {p1}, Lr1/c;->g()V

    :cond_c
    return v0
.end method

.method public final c()V
    .locals 6

    iget-boolean v0, p0, Lu2/d;->b:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lu2/d;->c:Z

    return-void

    :cond_0
    iget-object v0, p0, Lu2/d;->g:Lu2/j;

    iget-object v2, v0, Lu2/j;->a:Lr1/c;

    iget-object v3, v2, Lr1/c;->w:[Ljava/lang/Object;

    iget v2, v2, Lr1/c;->y:I

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, v3, v4

    check-cast v5, Lu2/i;

    invoke-virtual {v5}, Lu2/i;->c()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-boolean v2, p0, Lu2/d;->d:Z

    if-eqz v2, :cond_2

    iput-boolean v1, p0, Lu2/d;->d:Z

    return-void

    :cond_2
    iget-object v0, v0, Lu2/j;->a:Lr1/c;

    invoke-virtual {v0}, Lr1/c;->g()V

    return-void
.end method

.method public final d(Lb2/v;)V
    .locals 6

    iget-boolean v0, p0, Lu2/d;->b:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lu2/d;->e:Z

    iget-object v0, p0, Lu2/d;->f:La0/q0;

    invoke-virtual {v0, p1}, La0/q0;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lu2/d;->g:Lu2/j;

    iget-object v2, v0, Lu2/j;->b:La0/q0;

    invoke-virtual {v2}, La0/q0;->c()V

    invoke-virtual {v2, v0}, La0/q0;->a(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v2}, La0/q0;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    iget v0, v2, La0/q0;->b:I

    sub-int/2addr v0, v1

    invoke-virtual {v2, v0}, La0/q0;->j(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/j;

    const/4 v3, 0x0

    :goto_0
    iget-object v4, v0, Lu2/j;->a:Lr1/c;

    iget v5, v4, Lr1/c;->y:I

    if-ge v3, v5, :cond_1

    iget-object v4, v4, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v4, v4, v3

    check-cast v4, Lu2/i;

    iget-object v5, v4, Lu2/i;->c:Lb2/v;

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v5, v0, Lu2/j;->a:Lr1/c;

    invoke-virtual {v5, v4}, Lr1/c;->k(Ljava/lang/Object;)Z

    invoke-virtual {v4}, Lu2/i;->c()V

    goto :goto_0

    :cond_2
    invoke-virtual {v2, v4}, La0/q0;->a(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
