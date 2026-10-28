.class public final Lab/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lab/j;
.implements Lfn/h;


# instance fields
.field public final synthetic a:I

.field public final b:Z

.field public final c:Z

.field public d:J

.field public final e:[Z

.field public f:Ljava/lang/String;

.field public g:Z

.field public h:J

.field public i:Z

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;

.field public final l:Ljava/lang/Object;

.field public final m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public final p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La33/d;ZZ)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lab/r;->a:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lab/r;->j:Ljava/lang/Object;

    .line 13
    iput-boolean p2, p0, Lab/r;->b:Z

    .line 14
    iput-boolean p3, p0, Lab/r;->c:Z

    const/4 p1, 0x3

    .line 15
    new-array p1, p1, [Z

    iput-object p1, p0, Lab/r;->e:[Z

    .line 16
    new-instance p1, Lab/y;

    const/4 p2, 0x7

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, Lab/y;-><init>(II)V

    iput-object p1, p0, Lab/r;->k:Ljava/lang/Object;

    .line 17
    new-instance p1, Lab/y;

    const/16 p2, 0x8

    invoke-direct {p1, p2, p3}, Lab/y;-><init>(II)V

    iput-object p1, p0, Lab/r;->l:Ljava/lang/Object;

    .line 18
    new-instance p1, Lab/y;

    const/4 p2, 0x6

    invoke-direct {p1, p2, p3}, Lab/y;-><init>(II)V

    iput-object p1, p0, Lab/r;->m:Ljava/lang/Object;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    iput-wide p1, p0, Lab/r;->h:J

    .line 20
    new-instance p1, Lx8/n;

    invoke-direct {p1}, Lx8/n;-><init>()V

    iput-object p1, p0, Lab/r;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/internal/debugmeta/c;ZZ)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lab/r;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lab/r;->j:Ljava/lang/Object;

    .line 3
    iput-boolean p2, p0, Lab/r;->b:Z

    .line 4
    iput-boolean p3, p0, Lab/r;->c:Z

    const/4 p1, 0x3

    .line 5
    new-array p1, p1, [Z

    iput-object p1, p0, Lab/r;->e:[Z

    .line 6
    new-instance p1, Lab/y;

    const/4 p2, 0x7

    const/4 p3, 0x1

    invoke-direct {p1, p2, p3}, Lab/y;-><init>(II)V

    iput-object p1, p0, Lab/r;->k:Ljava/lang/Object;

    .line 7
    new-instance p1, Lab/y;

    const/16 p2, 0x8

    invoke-direct {p1, p2, p3}, Lab/y;-><init>(II)V

    iput-object p1, p0, Lab/r;->l:Ljava/lang/Object;

    .line 8
    new-instance p1, Lab/y;

    const/4 p2, 0x6

    invoke-direct {p1, p2, p3}, Lab/y;-><init>(II)V

    iput-object p1, p0, Lab/r;->m:Ljava/lang/Object;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    iput-wide p1, p0, Lab/r;->h:J

    .line 10
    new-instance p1, Led3/a;

    invoke-direct {p1}, Led3/a;-><init>()V

    iput-object p1, p0, Lab/r;->p:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget v0, p0, Lab/r;->a:I

    packed-switch v0, :pswitch_data_0

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lab/r;->d:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lab/r;->i:Z

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lab/r;->h:J

    iget-object v1, p0, Lab/r;->e:[Z

    invoke-static {v1}, Llo/a;->l([Z)V

    iget-object v1, p0, Lab/r;->k:Ljava/lang/Object;

    check-cast v1, Lab/y;

    invoke-virtual {v1}, Lab/y;->d()V

    iget-object v1, p0, Lab/r;->l:Ljava/lang/Object;

    check-cast v1, Lab/y;

    invoke-virtual {v1}, Lab/y;->d()V

    iget-object v1, p0, Lab/r;->m:Ljava/lang/Object;

    check-cast v1, Lab/y;

    invoke-virtual {v1}, Lab/y;->d()V

    iget-object v1, p0, Lab/r;->o:Ljava/lang/Object;

    check-cast v1, Lfn/m;

    if-eqz v1, :cond_0

    iput-boolean v0, v1, Lfn/m;->k:Z

    iput-boolean v0, v1, Lfn/m;->o:Z

    iget-object v1, v1, Lfn/m;->n:Lab/p;

    iput-boolean v0, v1, Lab/p;->b:Z

    iput-boolean v0, v1, Lab/p;->a:Z

    :cond_0
    return-void

    :pswitch_0
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lab/r;->d:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lab/r;->i:Z

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lab/r;->h:J

    iget-object v1, p0, Lab/r;->e:[Z

    invoke-static {v1}, Ly8/n;->b([Z)V

    iget-object v1, p0, Lab/r;->k:Ljava/lang/Object;

    check-cast v1, Lab/y;

    invoke-virtual {v1}, Lab/y;->d()V

    iget-object v1, p0, Lab/r;->l:Ljava/lang/Object;

    check-cast v1, Lab/y;

    invoke-virtual {v1}, Lab/y;->d()V

    iget-object v1, p0, Lab/r;->m:Ljava/lang/Object;

    check-cast v1, Lab/y;

    invoke-virtual {v1}, Lab/y;->d()V

    iget-object v1, p0, Lab/r;->j:Ljava/lang/Object;

    check-cast v1, La33/d;

    iget-object v1, v1, La33/d;->z:Ljava/lang/Object;

    check-cast v1, Lre/g;

    invoke-virtual {v1, v0}, Lre/g;->b(I)V

    iget-object v1, p0, Lab/r;->o:Ljava/lang/Object;

    check-cast v1, Lab/q;

    if-eqz v1, :cond_1

    iput-boolean v0, v1, Lab/q;->k:Z

    iput-boolean v0, v1, Lab/q;->o:Z

    iget-object v1, v1, Lab/q;->n:Lab/p;

    iput-boolean v0, v1, Lab/p;->b:Z

    iput-boolean v0, v1, Lab/p;->a:Z

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(IIJJ)V
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p2

    iget-object v2, v0, Lab/r;->p:Ljava/lang/Object;

    check-cast v2, Lx8/n;

    iget-object v3, v0, Lab/r;->m:Ljava/lang/Object;

    check-cast v3, Lab/y;

    iget-object v4, v0, Lab/r;->j:Ljava/lang/Object;

    check-cast v4, La33/d;

    iget-object v4, v4, La33/d;->z:Ljava/lang/Object;

    check-cast v4, Lre/g;

    iget-object v5, v0, Lab/r;->l:Ljava/lang/Object;

    check-cast v5, Lab/y;

    iget-object v6, v0, Lab/r;->k:Ljava/lang/Object;

    check-cast v6, Lab/y;

    iget-boolean v7, v0, Lab/r;->g:Z

    const/4 v8, 0x4

    if-eqz v7, :cond_0

    iget-object v7, v0, Lab/r;->o:Ljava/lang/Object;

    check-cast v7, Lab/q;

    iget-boolean v7, v7, Lab/q;->c:Z

    if-eqz v7, :cond_5

    :cond_0
    invoke-virtual {v6, v1}, Lab/y;->b(I)Z

    invoke-virtual {v5, v1}, Lab/y;->b(I)Z

    iget-boolean v7, v0, Lab/r;->g:Z

    const/4 v11, 0x6

    const/4 v12, 0x3

    if-nez v7, :cond_2

    iget-boolean v7, v6, Lab/y;->d:Z

    if-eqz v7, :cond_5

    iget-boolean v7, v5, Lab/y;->d:Z

    if-eqz v7, :cond_5

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iget-object v13, v6, Lab/y;->e:Ljava/lang/Object;

    check-cast v13, [B

    iget v14, v6, Lab/y;->f:I

    invoke-static {v13, v14}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v13

    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v13, v5, Lab/y;->e:Ljava/lang/Object;

    check-cast v13, [B

    iget v14, v5, Lab/y;->f:I

    invoke-static {v13, v14}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v13

    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v13, v6, Lab/y;->e:Ljava/lang/Object;

    check-cast v13, [B

    iget v14, v6, Lab/y;->f:I

    invoke-static {v13, v12, v14}, Ly8/n;->k([BII)Ly8/m;

    move-result-object v12

    iget v13, v12, Ly8/m;->s:I

    iget-object v14, v5, Lab/y;->e:Ljava/lang/Object;

    check-cast v14, [B

    iget v15, v5, Lab/y;->f:I

    new-instance v9, Llo/s;

    invoke-direct {v9, v8, v15, v11, v14}, Llo/s;-><init>(III[B)V

    invoke-virtual {v9}, Llo/s;->m()I

    move-result v11

    invoke-virtual {v9}, Llo/s;->m()I

    move-result v14

    invoke-virtual {v9}, Llo/s;->s()V

    invoke-virtual {v9}, Llo/s;->h()Z

    move-result v9

    new-instance v15, Ly8/l;

    invoke-direct {v15, v11, v14, v9}, Ly8/l;-><init>(IIZ)V

    iget v9, v12, Ly8/m;->a:I

    iget v14, v12, Ly8/m;->b:I

    iget v8, v12, Ly8/m;->c:I

    sget-object v16, Lx8/b;->a:[B

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v9, v14, v8}, [Ljava/lang/Object;

    move-result-object v8

    const-string v9, "avc1.%02X%02X%02X"

    invoke-static {v9, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    iget-object v9, v0, Lab/r;->n:Ljava/lang/Object;

    check-cast v9, Lt9/k0;

    new-instance v14, Lu8/o;

    invoke-direct {v14}, Lu8/o;-><init>()V

    iget-object v10, v0, Lab/r;->f:Ljava/lang/String;

    iput-object v10, v14, Lu8/o;->a:Ljava/lang/String;

    const-string v10, "video/mp2t"

    invoke-static {v10}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    iput-object v10, v14, Lu8/o;->l:Ljava/lang/String;

    const-string v10, "video/avc"

    invoke-static {v10}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    iput-object v10, v14, Lu8/o;->m:Ljava/lang/String;

    iput-object v8, v14, Lu8/o;->j:Ljava/lang/String;

    iget v8, v12, Ly8/m;->e:I

    iput v8, v14, Lu8/o;->t:I

    iget v8, v12, Ly8/m;->f:I

    iput v8, v14, Lu8/o;->u:I

    iget v8, v12, Ly8/m;->p:I

    iget v10, v12, Ly8/m;->q:I

    move/from16 v18, v8

    iget v8, v12, Ly8/m;->r:I

    move/from16 v20, v8

    iget v8, v12, Ly8/m;->h:I

    add-int/lit8 v21, v8, 0x8

    iget v8, v12, Ly8/m;->i:I

    add-int/lit8 v22, v8, 0x8

    new-instance v17, Lu8/g;

    const/16 v23, 0x0

    move/from16 v19, v10

    invoke-direct/range {v17 .. v23}, Lu8/g;-><init>(IIIII[B)V

    move-object/from16 v8, v17

    iput-object v8, v14, Lu8/o;->A:Lu8/g;

    iget v8, v12, Ly8/m;->g:F

    iput v8, v14, Lu8/o;->x:F

    iput-object v7, v14, Lu8/o;->p:Ljava/util/List;

    iput v13, v14, Lu8/o;->o:I

    invoke-static {v14, v9}, Ljh3/c;->w(Lu8/o;Lt9/k0;)V

    const/4 v7, 0x1

    iput-boolean v7, v0, Lab/r;->g:Z

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz v13, :cond_1

    const/4 v7, 0x1

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    :goto_0
    invoke-static {v7}, Lva3/g;->i(Z)V

    iput v13, v4, Lre/g;->a:I

    invoke-virtual {v4, v13}, Lre/g;->b(I)V

    iget-object v7, v0, Lab/r;->o:Ljava/lang/Object;

    check-cast v7, Lab/q;

    iget-object v7, v7, Lab/q;->d:Landroid/util/SparseArray;

    iget v8, v12, Ly8/m;->d:I

    invoke-virtual {v7, v8, v12}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    iget-object v7, v0, Lab/r;->o:Ljava/lang/Object;

    check-cast v7, Lab/q;

    iget-object v7, v7, Lab/q;->e:Landroid/util/SparseArray;

    invoke-virtual {v7, v11, v15}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    invoke-virtual {v6}, Lab/y;->d()V

    invoke-virtual {v5}, Lab/y;->d()V

    goto :goto_2

    :cond_2
    iget-boolean v7, v6, Lab/y;->d:Z

    if-eqz v7, :cond_4

    iget-object v5, v6, Lab/y;->e:Ljava/lang/Object;

    check-cast v5, [B

    iget v7, v6, Lab/y;->f:I

    invoke-static {v5, v12, v7}, Ly8/n;->k([BII)Ly8/m;

    move-result-object v5

    iget v7, v5, Ly8/m;->s:I

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz v7, :cond_3

    const/4 v8, 0x1

    goto :goto_1

    :cond_3
    const/4 v8, 0x0

    :goto_1
    invoke-static {v8}, Lva3/g;->i(Z)V

    iput v7, v4, Lre/g;->a:I

    invoke-virtual {v4, v7}, Lre/g;->b(I)V

    iget-object v7, v0, Lab/r;->o:Ljava/lang/Object;

    check-cast v7, Lab/q;

    iget-object v7, v7, Lab/q;->d:Landroid/util/SparseArray;

    iget v8, v5, Ly8/m;->d:I

    invoke-virtual {v7, v8, v5}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    invoke-virtual {v6}, Lab/y;->d()V

    goto :goto_2

    :cond_4
    iget-boolean v6, v5, Lab/y;->d:Z

    if-eqz v6, :cond_5

    iget-object v6, v5, Lab/y;->e:Ljava/lang/Object;

    check-cast v6, [B

    iget v7, v5, Lab/y;->f:I

    new-instance v8, Llo/s;

    const/4 v9, 0x4

    invoke-direct {v8, v9, v7, v11, v6}, Llo/s;-><init>(III[B)V

    invoke-virtual {v8}, Llo/s;->m()I

    move-result v6

    invoke-virtual {v8}, Llo/s;->m()I

    move-result v7

    invoke-virtual {v8}, Llo/s;->s()V

    invoke-virtual {v8}, Llo/s;->h()Z

    move-result v8

    new-instance v9, Ly8/l;

    invoke-direct {v9, v6, v7, v8}, Ly8/l;-><init>(IIZ)V

    iget-object v7, v0, Lab/r;->o:Ljava/lang/Object;

    check-cast v7, Lab/q;

    iget-object v7, v7, Lab/q;->e:Landroid/util/SparseArray;

    invoke-virtual {v7, v6, v9}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    invoke-virtual {v5}, Lab/y;->d()V

    :cond_5
    :goto_2
    invoke-virtual {v3, v1}, Lab/y;->b(I)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, v3, Lab/y;->e:Ljava/lang/Object;

    check-cast v1, [B

    iget v5, v3, Lab/y;->f:I

    invoke-static {v5, v1}, Ly8/n;->n(I[B)I

    move-result v1

    iget-object v3, v3, Lab/y;->e:Ljava/lang/Object;

    check-cast v3, [B

    invoke-virtual {v2, v1, v3}, Lx8/n;->D(I[B)V

    const/4 v9, 0x4

    invoke-virtual {v2, v9}, Lx8/n;->F(I)V

    move-wide/from16 v5, p5

    invoke-virtual {v4, v5, v6, v2}, Lre/g;->a(JLx8/n;)V

    :cond_6
    iget-object v1, v0, Lab/r;->o:Ljava/lang/Object;

    check-cast v1, Lab/q;

    iget-boolean v2, v0, Lab/r;->g:Z

    iget v3, v1, Lab/q;->i:I

    const/16 v4, 0x9

    if-eq v3, v4, :cond_d

    iget-boolean v3, v1, Lab/q;->c:Z

    if-eqz v3, :cond_10

    iget-object v3, v1, Lab/q;->n:Lab/p;

    iget-object v4, v1, Lab/q;->m:Lab/p;

    iget-boolean v5, v3, Lab/p;->a:Z

    if-nez v5, :cond_7

    goto/16 :goto_5

    :cond_7
    iget-boolean v5, v4, Lab/p;->a:Z

    if-nez v5, :cond_8

    goto/16 :goto_3

    :cond_8
    iget-object v5, v3, Lab/p;->p:Ljava/lang/Object;

    check-cast v5, Ly8/m;

    invoke-static {v5}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v6, v4, Lab/p;->p:Ljava/lang/Object;

    check-cast v6, Ly8/m;

    invoke-static {v6}, Lva3/g;->j(Ljava/lang/Object;)V

    iget v6, v6, Ly8/m;->m:I

    iget v7, v3, Lab/p;->e:I

    iget v8, v4, Lab/p;->e:I

    if-ne v7, v8, :cond_d

    iget v7, v3, Lab/p;->f:I

    iget v8, v4, Lab/p;->f:I

    if-ne v7, v8, :cond_d

    iget-boolean v7, v3, Lab/p;->g:Z

    iget-boolean v8, v4, Lab/p;->g:Z

    if-ne v7, v8, :cond_d

    iget-boolean v7, v3, Lab/p;->h:Z

    if-eqz v7, :cond_9

    iget-boolean v7, v4, Lab/p;->h:Z

    if-eqz v7, :cond_9

    iget-boolean v7, v3, Lab/p;->i:Z

    iget-boolean v8, v4, Lab/p;->i:Z

    if-ne v7, v8, :cond_d

    :cond_9
    iget v7, v3, Lab/p;->c:I

    iget v8, v4, Lab/p;->c:I

    if-eq v7, v8, :cond_a

    if-eqz v7, :cond_d

    if-eqz v8, :cond_d

    :cond_a
    iget v5, v5, Ly8/m;->m:I

    if-nez v5, :cond_b

    if-nez v6, :cond_b

    iget v7, v3, Lab/p;->l:I

    iget v8, v4, Lab/p;->l:I

    if-ne v7, v8, :cond_d

    iget v7, v3, Lab/p;->m:I

    iget v8, v4, Lab/p;->m:I

    if-ne v7, v8, :cond_d

    :cond_b
    const/4 v7, 0x1

    if-ne v5, v7, :cond_c

    if-ne v6, v7, :cond_c

    iget v5, v3, Lab/p;->n:I

    iget v6, v4, Lab/p;->n:I

    if-ne v5, v6, :cond_d

    iget v5, v3, Lab/p;->o:I

    iget v6, v4, Lab/p;->o:I

    if-ne v5, v6, :cond_d

    :cond_c
    iget-boolean v5, v3, Lab/p;->j:Z

    iget-boolean v6, v4, Lab/p;->j:Z

    if-ne v5, v6, :cond_d

    if-eqz v5, :cond_10

    iget v3, v3, Lab/p;->k:I

    iget v4, v4, Lab/p;->k:I

    if-eq v3, v4, :cond_10

    :cond_d
    :goto_3
    if-eqz v2, :cond_f

    iget-boolean v2, v1, Lab/q;->o:Z

    if-eqz v2, :cond_f

    iget-wide v2, v1, Lab/q;->j:J

    sub-long v4, p3, v2

    long-to-int v4, v4

    add-int v10, p1, v4

    iget-wide v6, v1, Lab/q;->q:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v6, v4

    if-eqz v4, :cond_f

    iget-wide v4, v1, Lab/q;->p:J

    cmp-long v8, v2, v4

    if-nez v8, :cond_e

    goto :goto_4

    :cond_e
    iget-boolean v8, v1, Lab/q;->r:Z

    sub-long/2addr v2, v4

    long-to-int v9, v2

    iget-object v5, v1, Lab/q;->a:Lt9/k0;

    const/4 v11, 0x0

    invoke-interface/range {v5 .. v11}, Lt9/k0;->b(JIIILt9/j0;)V

    :cond_f
    :goto_4
    iget-wide v2, v1, Lab/q;->j:J

    iput-wide v2, v1, Lab/q;->p:J

    iget-wide v2, v1, Lab/q;->l:J

    iput-wide v2, v1, Lab/q;->q:J

    const/4 v2, 0x0

    iput-boolean v2, v1, Lab/q;->r:Z

    const/4 v7, 0x1

    iput-boolean v7, v1, Lab/q;->o:Z

    :cond_10
    :goto_5
    iget-boolean v2, v1, Lab/q;->b:Z

    if-eqz v2, :cond_13

    iget-object v2, v1, Lab/q;->n:Lab/p;

    iget-boolean v3, v2, Lab/p;->b:Z

    if-eqz v3, :cond_12

    iget v2, v2, Lab/p;->d:I

    const/4 v3, 0x7

    if-eq v2, v3, :cond_11

    const/4 v3, 0x2

    if-ne v2, v3, :cond_12

    :cond_11
    const/4 v7, 0x1

    goto :goto_6

    :cond_12
    const/4 v7, 0x0

    goto :goto_6

    :cond_13
    iget-boolean v7, v1, Lab/q;->s:Z

    :goto_6
    iget-boolean v2, v1, Lab/q;->r:Z

    iget v3, v1, Lab/q;->i:I

    const/4 v4, 0x5

    if-eq v3, v4, :cond_15

    if-eqz v7, :cond_14

    const/4 v7, 0x1

    if-ne v3, v7, :cond_14

    goto :goto_7

    :cond_14
    const/4 v10, 0x0

    goto :goto_8

    :cond_15
    const/4 v7, 0x1

    :goto_7
    move v10, v7

    :goto_8
    or-int/2addr v2, v10

    iput-boolean v2, v1, Lab/q;->r:Z

    const/16 v3, 0x18

    iput v3, v1, Lab/q;->i:I

    if-eqz v2, :cond_16

    const/4 v2, 0x0

    iput-boolean v2, v0, Lab/r;->i:Z

    :cond_16
    return-void
.end method

.method public c(Lx8/n;)V
    .locals 13

    iget-object v2, p0, Lab/r;->n:Ljava/lang/Object;

    check-cast v2, Lt9/k0;

    invoke-static {v2}, Lva3/g;->j(Ljava/lang/Object;)V

    sget v2, Lx8/t;->a:I

    iget v2, p1, Lx8/n;->b:I

    iget v7, p1, Lx8/n;->c:I

    iget-object v8, p1, Lx8/n;->a:[B

    iget-wide v3, p0, Lab/r;->d:J

    invoke-virtual {p1}, Lx8/n;->a()I

    move-result v5

    int-to-long v5, v5

    add-long/2addr v3, v5

    iput-wide v3, p0, Lab/r;->d:J

    iget-object v3, p0, Lab/r;->n:Ljava/lang/Object;

    check-cast v3, Lt9/k0;

    invoke-virtual {p1}, Lx8/n;->a()I

    move-result v4

    const/4 v9, 0x0

    invoke-interface {v3, p1, v4, v9}, Lt9/k0;->d(Lx8/n;II)V

    :goto_0
    iget-object v1, p0, Lab/r;->e:[Z

    invoke-static {v8, v2, v7, v1}, Ly8/n;->c([BII[Z)I

    move-result v1

    if-ne v1, v7, :cond_0

    invoke-virtual {p0, v8, v2, v7}, Lab/r;->j([BII)V

    return-void

    :cond_0
    add-int/lit8 v3, v1, 0x3

    aget-byte v3, v8, v3

    and-int/lit8 v10, v3, 0x1f

    if-lez v1, :cond_1

    add-int/lit8 v3, v1, -0x1

    aget-byte v3, v8, v3

    if-nez v3, :cond_1

    add-int/lit8 v1, v1, -0x1

    const/4 v3, 0x4

    :goto_1
    move v11, v1

    move v12, v3

    goto :goto_2

    :cond_1
    const/4 v3, 0x3

    goto :goto_1

    :goto_2
    sub-int v1, v11, v2

    if-lez v1, :cond_2

    invoke-virtual {p0, v8, v2, v11}, Lab/r;->j([BII)V

    :cond_2
    sub-int v2, v7, v11

    iget-wide v3, p0, Lab/r;->d:J

    int-to-long v5, v2

    sub-long/2addr v3, v5

    if-gez v1, :cond_3

    neg-int v1, v1

    goto :goto_3

    :cond_3
    move v1, v9

    :goto_3
    iget-wide v5, p0, Lab/r;->h:J

    move v0, v2

    move v2, v1

    move v1, v0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lab/r;->b(IIJJ)V

    move-wide v2, v3

    iget-wide v4, p0, Lab/r;->h:J

    move v1, v10

    invoke-virtual/range {v0 .. v5}, Lab/r;->k(IJJ)V

    add-int v2, v11, v12

    goto :goto_0
.end method

.method public final d(IJ)V
    .locals 2

    iget v0, p0, Lab/r;->a:I

    packed-switch v0, :pswitch_data_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p2, v0

    if-eqz v0, :cond_0

    iput-wide p2, p0, Lab/r;->h:J

    :cond_0
    iget-boolean p2, p0, Lab/r;->i:Z

    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    or-int/2addr p1, p2

    iput-boolean p1, p0, Lab/r;->i:Z

    return-void

    :pswitch_0
    iput-wide p2, p0, Lab/r;->h:J

    iget-boolean p2, p0, Lab/r;->i:Z

    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    or-int/2addr p1, p2

    iput-boolean p1, p0, Lab/r;->i:Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e(Z)V
    .locals 7

    iget-object v1, p0, Lab/r;->n:Ljava/lang/Object;

    check-cast v1, Lt9/k0;

    invoke-static {v1}, Lva3/g;->j(Ljava/lang/Object;)V

    sget v1, Lx8/t;->a:I

    if-eqz p1, :cond_0

    iget-object v1, p0, Lab/r;->j:Ljava/lang/Object;

    check-cast v1, La33/d;

    iget-object v1, v1, La33/d;->z:Ljava/lang/Object;

    check-cast v1, Lre/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lre/g;->b(I)V

    iget-wide v3, p0, Lab/r;->d:J

    iget-wide v5, p0, Lab/r;->h:J

    const/4 v1, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lab/r;->b(IIJJ)V

    iget-wide v2, p0, Lab/r;->d:J

    const/16 v1, 0x9

    iget-wide v4, p0, Lab/r;->h:J

    invoke-virtual/range {v0 .. v5}, Lab/r;->k(IJJ)V

    iget-wide v3, p0, Lab/r;->d:J

    const/4 v2, 0x0

    iget-wide v5, p0, Lab/r;->h:J

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v6}, Lab/r;->b(IIJJ)V

    :cond_0
    return-void
.end method

.method public f(Led3/a;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lab/r;->k:Ljava/lang/Object;

    check-cast v2, Lab/y;

    iget-object v3, v0, Lab/r;->l:Ljava/lang/Object;

    check-cast v3, Lab/y;

    iget-object v4, v0, Lab/r;->m:Ljava/lang/Object;

    check-cast v4, Lab/y;

    iget-object v5, v0, Lab/r;->n:Ljava/lang/Object;

    check-cast v5, Lwm/s;

    invoke-static {v5}, Llo/a;->j(Ljava/lang/Object;)V

    sget v5, Llo/y;->a:I

    iget v5, v1, Led3/a;->b:I

    iget v6, v1, Led3/a;->c:I

    iget-object v7, v1, Led3/a;->a:[B

    iget-wide v8, v0, Lab/r;->d:J

    invoke-virtual {v1}, Led3/a;->a()I

    move-result v10

    int-to-long v10, v10

    add-long/2addr v8, v10

    iput-wide v8, v0, Lab/r;->d:J

    iget-object v8, v0, Lab/r;->n:Ljava/lang/Object;

    check-cast v8, Lwm/s;

    invoke-virtual {v1}, Led3/a;->a()I

    move-result v9

    invoke-interface {v8, v9, v1}, Lwm/s;->c(ILed3/a;)V

    :goto_0
    iget-object v1, v0, Lab/r;->e:[Z

    invoke-static {v7, v5, v6, v1}, Llo/a;->p([BII[Z)I

    move-result v1

    if-ne v1, v6, :cond_0

    invoke-virtual {v0, v7, v5, v6}, Lab/r;->j([BII)V

    return-void

    :cond_0
    add-int/lit8 v8, v1, 0x3

    aget-byte v9, v7, v8

    and-int/lit8 v9, v9, 0x1f

    sub-int v10, v1, v5

    if-lez v10, :cond_1

    invoke-virtual {v0, v7, v5, v1}, Lab/r;->j([BII)V

    :cond_1
    sub-int v1, v6, v1

    iget-wide v11, v0, Lab/r;->d:J

    int-to-long v13, v1

    sub-long/2addr v11, v13

    if-gez v10, :cond_2

    neg-int v10, v10

    goto :goto_1

    :cond_2
    const/4 v10, 0x0

    :goto_1
    iget-wide v13, v0, Lab/r;->h:J

    iget-object v15, v0, Lab/r;->p:Ljava/lang/Object;

    check-cast v15, Led3/a;

    iget-boolean v5, v0, Lab/r;->g:Z

    move/from16 v16, v1

    if-eqz v5, :cond_4

    iget-object v5, v0, Lab/r;->o:Ljava/lang/Object;

    check-cast v5, Lfn/m;

    iget-boolean v5, v5, Lfn/m;->c:Z

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    move/from16 v17, v6

    move-object/from16 v18, v7

    move/from16 v19, v8

    move/from16 v22, v9

    move-wide/from16 v20, v11

    goto/16 :goto_3

    :cond_4
    :goto_2
    invoke-virtual {v2, v10}, Lab/y;->b(I)Z

    invoke-virtual {v3, v10}, Lab/y;->b(I)Z

    iget-boolean v5, v0, Lab/r;->g:Z

    if-nez v5, :cond_5

    iget-boolean v5, v2, Lab/y;->d:Z

    if-eqz v5, :cond_3

    iget-boolean v5, v3, Lab/y;->d:Z

    if-eqz v5, :cond_3

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, v2, Lab/y;->e:Ljava/lang/Object;

    check-cast v1, [B

    move/from16 v17, v6

    iget v6, v2, Lab/y;->f:I

    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v3, Lab/y;->e:Ljava/lang/Object;

    check-cast v1, [B

    iget v6, v3, Lab/y;->f:I

    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v2, Lab/y;->e:Ljava/lang/Object;

    check-cast v1, [B

    iget v6, v2, Lab/y;->f:I

    move-object/from16 v18, v7

    const/4 v7, 0x3

    invoke-static {v1, v7, v6}, Llo/a;->z([BII)Llo/p;

    move-result-object v1

    iget-object v6, v3, Lab/y;->e:Ljava/lang/Object;

    check-cast v6, [B

    iget v7, v3, Lab/y;->f:I

    move/from16 v19, v8

    new-instance v8, Llo/s;

    move-wide/from16 v20, v11

    const/4 v11, 0x4

    const/4 v12, 0x1

    invoke-direct {v8, v11, v7, v12, v6}, Llo/s;-><init>(III[B)V

    invoke-virtual {v8}, Llo/s;->m()I

    move-result v6

    invoke-virtual {v8}, Llo/s;->m()I

    move-result v7

    invoke-virtual {v8}, Llo/s;->s()V

    invoke-virtual {v8}, Llo/s;->h()Z

    move-result v8

    new-instance v11, Llo/o;

    invoke-direct {v11, v6, v7, v8}, Llo/o;-><init>(IIZ)V

    iget v7, v1, Llo/p;->a:I

    iget v8, v1, Llo/p;->b:I

    iget v12, v1, Llo/p;->c:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    filled-new-array {v7, v8, v12}, [Ljava/lang/Object;

    move-result-object v7

    const-string v8, "avc1.%02X%02X%02X"

    invoke-static {v8, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    iget-object v8, v0, Lab/r;->n:Ljava/lang/Object;

    check-cast v8, Lwm/s;

    new-instance v12, Lrm/b0;

    invoke-direct {v12}, Lrm/b0;-><init>()V

    move/from16 v22, v9

    iget-object v9, v0, Lab/r;->f:Ljava/lang/String;

    iput-object v9, v12, Lrm/b0;->a:Ljava/lang/String;

    const-string v9, "video/avc"

    iput-object v9, v12, Lrm/b0;->k:Ljava/lang/String;

    iput-object v7, v12, Lrm/b0;->h:Ljava/lang/String;

    iget v7, v1, Llo/p;->e:I

    iput v7, v12, Lrm/b0;->p:I

    iget v7, v1, Llo/p;->f:I

    iput v7, v12, Lrm/b0;->q:I

    iget v7, v1, Llo/p;->g:F

    iput v7, v12, Lrm/b0;->t:F

    iput-object v5, v12, Lrm/b0;->m:Ljava/util/List;

    new-instance v5, Lrm/c0;

    invoke-direct {v5, v12}, Lrm/c0;-><init>(Lrm/b0;)V

    invoke-interface {v8, v5}, Lwm/s;->a(Lrm/c0;)V

    const/4 v12, 0x1

    iput-boolean v12, v0, Lab/r;->g:Z

    iget-object v5, v0, Lab/r;->o:Ljava/lang/Object;

    check-cast v5, Lfn/m;

    iget-object v5, v5, Lfn/m;->d:Landroid/util/SparseArray;

    iget v7, v1, Llo/p;->d:I

    invoke-virtual {v5, v7, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    iget-object v1, v0, Lab/r;->o:Ljava/lang/Object;

    check-cast v1, Lfn/m;

    iget-object v1, v1, Lfn/m;->e:Landroid/util/SparseArray;

    invoke-virtual {v1, v6, v11}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    invoke-virtual {v2}, Lab/y;->d()V

    invoke-virtual {v3}, Lab/y;->d()V

    goto :goto_3

    :cond_5
    move/from16 v17, v6

    move-object/from16 v18, v7

    move/from16 v19, v8

    move/from16 v22, v9

    move-wide/from16 v20, v11

    iget-boolean v1, v2, Lab/y;->d:Z

    if-eqz v1, :cond_6

    iget-object v1, v2, Lab/y;->e:Ljava/lang/Object;

    check-cast v1, [B

    iget v5, v2, Lab/y;->f:I

    const/4 v7, 0x3

    invoke-static {v1, v7, v5}, Llo/a;->z([BII)Llo/p;

    move-result-object v1

    iget-object v5, v0, Lab/r;->o:Ljava/lang/Object;

    check-cast v5, Lfn/m;

    iget-object v5, v5, Lfn/m;->d:Landroid/util/SparseArray;

    iget v6, v1, Llo/p;->d:I

    invoke-virtual {v5, v6, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    invoke-virtual {v2}, Lab/y;->d()V

    goto :goto_3

    :cond_6
    iget-boolean v1, v3, Lab/y;->d:Z

    if-eqz v1, :cond_7

    iget-object v1, v3, Lab/y;->e:Ljava/lang/Object;

    check-cast v1, [B

    iget v5, v3, Lab/y;->f:I

    new-instance v6, Llo/s;

    const/4 v11, 0x4

    const/4 v12, 0x1

    invoke-direct {v6, v11, v5, v12, v1}, Llo/s;-><init>(III[B)V

    invoke-virtual {v6}, Llo/s;->m()I

    move-result v1

    invoke-virtual {v6}, Llo/s;->m()I

    move-result v5

    invoke-virtual {v6}, Llo/s;->s()V

    invoke-virtual {v6}, Llo/s;->h()Z

    move-result v6

    new-instance v7, Llo/o;

    invoke-direct {v7, v1, v5, v6}, Llo/o;-><init>(IIZ)V

    iget-object v5, v0, Lab/r;->o:Ljava/lang/Object;

    check-cast v5, Lfn/m;

    iget-object v5, v5, Lfn/m;->e:Landroid/util/SparseArray;

    invoke-virtual {v5, v1, v7}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    invoke-virtual {v3}, Lab/y;->d()V

    :cond_7
    :goto_3
    invoke-virtual {v4, v10}, Lab/y;->b(I)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, v4, Lab/y;->e:Ljava/lang/Object;

    check-cast v1, [B

    iget v5, v4, Lab/y;->f:I

    invoke-static {v5, v1}, Llo/a;->E(I[B)I

    move-result v1

    iget-object v5, v4, Lab/y;->e:Ljava/lang/Object;

    check-cast v5, [B

    invoke-virtual {v15, v1, v5}, Led3/a;->I(I[B)V

    const/4 v11, 0x4

    invoke-virtual {v15, v11}, Led3/a;->K(I)V

    iget-object v1, v0, Lab/r;->j:Ljava/lang/Object;

    check-cast v1, Lio/sentry/internal/debugmeta/c;

    iget-object v1, v1, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v1, [Lwm/s;

    invoke-static {v13, v14, v15, v1}, Ls4/d;->b(JLed3/a;[Lwm/s;)V

    :cond_8
    iget-object v1, v0, Lab/r;->o:Ljava/lang/Object;

    check-cast v1, Lfn/m;

    iget-boolean v5, v0, Lab/r;->g:Z

    iget-boolean v6, v0, Lab/r;->i:Z

    iget v7, v1, Lfn/m;->i:I

    const/16 v8, 0x9

    if-eq v7, v8, :cond_10

    iget-boolean v7, v1, Lfn/m;->c:Z

    if-eqz v7, :cond_f

    iget-object v7, v1, Lfn/m;->n:Lab/p;

    iget-object v8, v1, Lfn/m;->m:Lab/p;

    iget-boolean v9, v7, Lab/p;->a:Z

    if-nez v9, :cond_9

    goto/16 :goto_4

    :cond_9
    iget-boolean v9, v8, Lab/p;->a:Z

    if-nez v9, :cond_a

    goto/16 :goto_5

    :cond_a
    iget-object v9, v7, Lab/p;->p:Ljava/lang/Object;

    check-cast v9, Llo/p;

    invoke-static {v9}, Llo/a;->j(Ljava/lang/Object;)V

    iget-object v10, v8, Lab/p;->p:Ljava/lang/Object;

    check-cast v10, Llo/p;

    invoke-static {v10}, Llo/a;->j(Ljava/lang/Object;)V

    iget v10, v10, Llo/p;->k:I

    iget v11, v7, Lab/p;->e:I

    iget v12, v8, Lab/p;->e:I

    if-ne v11, v12, :cond_10

    iget v11, v7, Lab/p;->f:I

    iget v12, v8, Lab/p;->f:I

    if-ne v11, v12, :cond_10

    iget-boolean v11, v7, Lab/p;->g:Z

    iget-boolean v12, v8, Lab/p;->g:Z

    if-ne v11, v12, :cond_10

    iget-boolean v11, v7, Lab/p;->h:Z

    if-eqz v11, :cond_b

    iget-boolean v11, v8, Lab/p;->h:Z

    if-eqz v11, :cond_b

    iget-boolean v11, v7, Lab/p;->i:Z

    iget-boolean v12, v8, Lab/p;->i:Z

    if-ne v11, v12, :cond_10

    :cond_b
    iget v11, v7, Lab/p;->c:I

    iget v12, v8, Lab/p;->c:I

    if-eq v11, v12, :cond_c

    if-eqz v11, :cond_10

    if-eqz v12, :cond_10

    :cond_c
    iget v9, v9, Llo/p;->k:I

    if-nez v9, :cond_d

    if-nez v10, :cond_d

    iget v11, v7, Lab/p;->l:I

    iget v12, v8, Lab/p;->l:I

    if-ne v11, v12, :cond_10

    iget v11, v7, Lab/p;->m:I

    iget v12, v8, Lab/p;->m:I

    if-ne v11, v12, :cond_10

    :cond_d
    const/4 v12, 0x1

    if-ne v9, v12, :cond_e

    if-ne v10, v12, :cond_e

    iget v9, v7, Lab/p;->n:I

    iget v10, v8, Lab/p;->n:I

    if-ne v9, v10, :cond_10

    iget v9, v7, Lab/p;->o:I

    iget v10, v8, Lab/p;->o:I

    if-ne v9, v10, :cond_10

    :cond_e
    iget-boolean v9, v7, Lab/p;->j:Z

    iget-boolean v10, v8, Lab/p;->j:Z

    if-ne v9, v10, :cond_10

    if-eqz v9, :cond_f

    iget v7, v7, Lab/p;->k:I

    iget v8, v8, Lab/p;->k:I

    if-eq v7, v8, :cond_f

    goto :goto_5

    :cond_f
    :goto_4
    move/from16 v16, v6

    goto :goto_8

    :cond_10
    :goto_5
    if-eqz v5, :cond_12

    iget-boolean v5, v1, Lfn/m;->o:Z

    if-eqz v5, :cond_12

    iget-wide v7, v1, Lfn/m;->j:J

    sub-long v11, v20, v7

    long-to-int v5, v11

    add-int v14, v16, v5

    iget-wide v10, v1, Lfn/m;->q:J

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v10, v12

    if-nez v5, :cond_11

    goto :goto_6

    :cond_11
    iget-boolean v12, v1, Lfn/m;->r:Z

    move/from16 v16, v6

    iget-wide v5, v1, Lfn/m;->p:J

    sub-long/2addr v7, v5

    long-to-int v13, v7

    iget-object v9, v1, Lfn/m;->a:Lwm/s;

    const/4 v15, 0x0

    invoke-interface/range {v9 .. v15}, Lwm/s;->d(JIIILwm/r;)V

    goto :goto_7

    :cond_12
    :goto_6
    move/from16 v16, v6

    :goto_7
    iget-wide v5, v1, Lfn/m;->j:J

    iput-wide v5, v1, Lfn/m;->p:J

    iget-wide v5, v1, Lfn/m;->l:J

    iput-wide v5, v1, Lfn/m;->q:J

    const/4 v5, 0x0

    iput-boolean v5, v1, Lfn/m;->r:Z

    const/4 v12, 0x1

    iput-boolean v12, v1, Lfn/m;->o:Z

    :goto_8
    iget-boolean v5, v1, Lfn/m;->b:Z

    const/4 v6, 0x2

    if-eqz v5, :cond_15

    iget-object v5, v1, Lfn/m;->n:Lab/p;

    iget-boolean v7, v5, Lab/p;->b:Z

    if-eqz v7, :cond_14

    iget v5, v5, Lab/p;->d:I

    const/4 v7, 0x7

    if-eq v5, v7, :cond_13

    if-ne v5, v6, :cond_14

    :cond_13
    const/4 v5, 0x1

    goto :goto_9

    :cond_14
    const/4 v5, 0x0

    :goto_9
    move/from16 v16, v5

    :cond_15
    iget-boolean v5, v1, Lfn/m;->r:Z

    iget v7, v1, Lfn/m;->i:I

    const/4 v8, 0x5

    if-eq v7, v8, :cond_17

    if-eqz v16, :cond_16

    const/4 v12, 0x1

    if-ne v7, v12, :cond_16

    goto :goto_a

    :cond_16
    const/4 v7, 0x0

    goto :goto_b

    :cond_17
    :goto_a
    const/4 v7, 0x1

    :goto_b
    or-int/2addr v5, v7

    iput-boolean v5, v1, Lfn/m;->r:Z

    if-eqz v5, :cond_18

    const/4 v5, 0x0

    iput-boolean v5, v0, Lab/r;->i:Z

    :cond_18
    iget-wide v9, v0, Lab/r;->h:J

    iget-boolean v1, v0, Lab/r;->g:Z

    if-eqz v1, :cond_19

    iget-object v1, v0, Lab/r;->o:Ljava/lang/Object;

    check-cast v1, Lfn/m;

    iget-boolean v1, v1, Lfn/m;->c:Z

    if-eqz v1, :cond_1a

    :cond_19
    move/from16 v1, v22

    goto :goto_c

    :cond_1a
    move/from16 v1, v22

    goto :goto_d

    :goto_c
    invoke-virtual {v2, v1}, Lab/y;->e(I)V

    invoke-virtual {v3, v1}, Lab/y;->e(I)V

    :goto_d
    invoke-virtual {v4, v1}, Lab/y;->e(I)V

    iget-object v5, v0, Lab/r;->o:Ljava/lang/Object;

    check-cast v5, Lfn/m;

    iput v1, v5, Lfn/m;->i:I

    iput-wide v9, v5, Lfn/m;->l:J

    move-wide/from16 v11, v20

    iput-wide v11, v5, Lfn/m;->j:J

    iget-boolean v7, v5, Lfn/m;->b:Z

    const/4 v12, 0x1

    if-eqz v7, :cond_1b

    if-eq v1, v12, :cond_1c

    :cond_1b
    iget-boolean v7, v5, Lfn/m;->c:Z

    if-eqz v7, :cond_1d

    if-eq v1, v8, :cond_1c

    if-eq v1, v12, :cond_1c

    if-ne v1, v6, :cond_1d

    :cond_1c
    iget-object v1, v5, Lfn/m;->m:Lab/p;

    iget-object v6, v5, Lfn/m;->n:Lab/p;

    iput-object v6, v5, Lfn/m;->m:Lab/p;

    iput-object v1, v5, Lfn/m;->n:Lab/p;

    const/4 v6, 0x0

    iput-boolean v6, v1, Lab/p;->b:Z

    iput-boolean v6, v1, Lab/p;->a:Z

    iput v6, v5, Lfn/m;->h:I

    const/4 v12, 0x1

    iput-boolean v12, v5, Lfn/m;->k:Z

    :cond_1d
    move/from16 v6, v17

    move-object/from16 v7, v18

    move/from16 v5, v19

    goto/16 :goto_0
.end method

.method public g(Lwm/k;Lab/l0;)V
    .locals 4

    invoke-virtual {p2}, Lab/l0;->c()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget-object v0, p2, Lab/l0;->f:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lab/r;->f:Ljava/lang/String;

    invoke-virtual {p2}, Lab/l0;->h()V

    iget v0, p2, Lab/l0;->e:I

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Lwm/k;->o(II)Lwm/s;

    move-result-object v0

    iput-object v0, p0, Lab/r;->n:Ljava/lang/Object;

    new-instance v1, Lfn/m;

    iget-boolean v2, p0, Lab/r;->b:Z

    iget-boolean v3, p0, Lab/r;->c:Z

    invoke-direct {v1, v0, v2, v3}, Lfn/m;-><init>(Lwm/s;ZZ)V

    iput-object v1, p0, Lab/r;->o:Ljava/lang/Object;

    iget-object v0, p0, Lab/r;->j:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0, p1, p2}, Lio/sentry/internal/debugmeta/c;->o(Lwm/k;Lab/l0;)V

    return-void
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public i(Lt9/q;Lab/l0;)V
    .locals 4

    invoke-virtual {p2}, Lab/l0;->c()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget-object v0, p2, Lab/l0;->f:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lab/r;->f:Ljava/lang/String;

    invoke-virtual {p2}, Lab/l0;->h()V

    iget v0, p2, Lab/l0;->e:I

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Lt9/q;->o(II)Lt9/k0;

    move-result-object v0

    iput-object v0, p0, Lab/r;->n:Ljava/lang/Object;

    new-instance v1, Lab/q;

    iget-boolean v2, p0, Lab/r;->b:Z

    iget-boolean v3, p0, Lab/r;->c:Z

    invoke-direct {v1, v0, v2, v3}, Lab/q;-><init>(Lt9/k0;ZZ)V

    iput-object v1, p0, Lab/r;->o:Ljava/lang/Object;

    iget-object v0, p0, Lab/r;->j:Ljava/lang/Object;

    check-cast v0, La33/d;

    invoke-virtual {v0, p1, p2}, La33/d;->h(Lt9/q;Lab/l0;)V

    return-void
.end method

.method public final j([BII)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    iget v4, v0, Lab/r;->a:I

    packed-switch v4, :pswitch_data_0

    iget-boolean v4, v0, Lab/r;->g:Z

    if-eqz v4, :cond_0

    iget-object v4, v0, Lab/r;->o:Ljava/lang/Object;

    check-cast v4, Lfn/m;

    iget-boolean v4, v4, Lfn/m;->c:Z

    if-eqz v4, :cond_1

    :cond_0
    iget-object v4, v0, Lab/r;->k:Ljava/lang/Object;

    check-cast v4, Lab/y;

    invoke-virtual {v4, v1, v2, v3}, Lab/y;->a([BII)V

    iget-object v4, v0, Lab/r;->l:Ljava/lang/Object;

    check-cast v4, Lab/y;

    invoke-virtual {v4, v1, v2, v3}, Lab/y;->a([BII)V

    :cond_1
    iget-object v4, v0, Lab/r;->m:Ljava/lang/Object;

    check-cast v4, Lab/y;

    invoke-virtual {v4, v1, v2, v3}, Lab/y;->a([BII)V

    iget-object v4, v0, Lab/r;->o:Ljava/lang/Object;

    check-cast v4, Lfn/m;

    iget-object v5, v4, Lfn/m;->e:Landroid/util/SparseArray;

    iget-object v6, v4, Lfn/m;->f:Llo/s;

    iget-boolean v7, v4, Lfn/m;->k:Z

    if-nez v7, :cond_2

    goto/16 :goto_8

    :cond_2
    sub-int/2addr v3, v2

    iget-object v7, v4, Lfn/m;->g:[B

    array-length v8, v7

    iget v9, v4, Lfn/m;->h:I

    add-int/2addr v9, v3

    const/4 v10, 0x2

    if-ge v8, v9, :cond_3

    mul-int/2addr v9, v10

    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v7

    iput-object v7, v4, Lfn/m;->g:[B

    :cond_3
    iget-object v7, v4, Lfn/m;->g:[B

    iget v8, v4, Lfn/m;->h:I

    invoke-static {v1, v2, v7, v8, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v1, v4, Lfn/m;->h:I

    add-int/2addr v1, v3

    iput v1, v4, Lfn/m;->h:I

    iget-object v2, v4, Lfn/m;->g:[B

    iput-object v2, v6, Llo/s;->b:[B

    const/4 v2, 0x0

    iput v2, v6, Llo/s;->d:I

    iput v1, v6, Llo/s;->c:I

    iput v2, v6, Llo/s;->e:I

    invoke-virtual {v6}, Llo/s;->a()V

    const/16 v1, 0x8

    invoke-virtual {v6, v1}, Llo/s;->d(I)Z

    move-result v1

    if-nez v1, :cond_4

    goto/16 :goto_8

    :cond_4
    invoke-virtual {v6}, Llo/s;->s()V

    invoke-virtual {v6, v10}, Llo/s;->i(I)I

    move-result v1

    const/4 v3, 0x5

    invoke-virtual {v6, v3}, Llo/s;->t(I)V

    invoke-virtual {v6}, Llo/s;->e()Z

    move-result v7

    if-nez v7, :cond_5

    goto/16 :goto_8

    :cond_5
    invoke-virtual {v6}, Llo/s;->m()I

    invoke-virtual {v6}, Llo/s;->e()Z

    move-result v7

    if-nez v7, :cond_6

    goto/16 :goto_8

    :cond_6
    invoke-virtual {v6}, Llo/s;->m()I

    move-result v7

    iget-boolean v8, v4, Lfn/m;->c:Z

    const/4 v9, 0x1

    if-nez v8, :cond_7

    iput-boolean v2, v4, Lfn/m;->k:Z

    iget-object v1, v4, Lfn/m;->n:Lab/p;

    iput v7, v1, Lab/p;->d:I

    iput-boolean v9, v1, Lab/p;->b:Z

    goto/16 :goto_8

    :cond_7
    invoke-virtual {v6}, Llo/s;->e()Z

    move-result v8

    if-nez v8, :cond_8

    goto/16 :goto_8

    :cond_8
    invoke-virtual {v6}, Llo/s;->m()I

    move-result v8

    invoke-virtual {v5, v8}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v11

    if-gez v11, :cond_9

    iput-boolean v2, v4, Lfn/m;->k:Z

    goto/16 :goto_8

    :cond_9
    invoke-virtual {v5, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llo/o;

    iget-object v11, v4, Lfn/m;->d:Landroid/util/SparseArray;

    iget v12, v5, Llo/o;->a:I

    iget-boolean v5, v5, Llo/o;->b:Z

    invoke-virtual {v11, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Llo/p;

    iget-boolean v12, v11, Llo/p;->h:Z

    iget v13, v11, Llo/p;->l:I

    iget v14, v11, Llo/p;->j:I

    if-eqz v12, :cond_b

    invoke-virtual {v6, v10}, Llo/s;->d(I)Z

    move-result v12

    if-nez v12, :cond_a

    goto/16 :goto_8

    :cond_a
    invoke-virtual {v6, v10}, Llo/s;->t(I)V

    :cond_b
    invoke-virtual {v6, v14}, Llo/s;->d(I)Z

    move-result v10

    if-nez v10, :cond_c

    goto/16 :goto_8

    :cond_c
    invoke-virtual {v6, v14}, Llo/s;->i(I)I

    move-result v10

    iget-boolean v12, v11, Llo/p;->i:Z

    if-nez v12, :cond_10

    invoke-virtual {v6, v9}, Llo/s;->d(I)Z

    move-result v12

    if-nez v12, :cond_d

    goto/16 :goto_8

    :cond_d
    invoke-virtual {v6}, Llo/s;->h()Z

    move-result v12

    if-eqz v12, :cond_f

    invoke-virtual {v6, v9}, Llo/s;->d(I)Z

    move-result v14

    if-nez v14, :cond_e

    goto/16 :goto_8

    :cond_e
    invoke-virtual {v6}, Llo/s;->h()Z

    move-result v14

    move v15, v9

    goto :goto_1

    :cond_f
    move v14, v2

    :goto_0
    move v15, v14

    goto :goto_1

    :cond_10
    move v12, v2

    move v14, v12

    goto :goto_0

    :goto_1
    iget v2, v4, Lfn/m;->i:I

    if-ne v2, v3, :cond_11

    move v2, v9

    goto :goto_2

    :cond_11
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_13

    invoke-virtual {v6}, Llo/s;->e()Z

    move-result v3

    if-nez v3, :cond_12

    goto/16 :goto_8

    :cond_12
    invoke-virtual {v6}, Llo/s;->m()I

    move-result v3

    goto :goto_3

    :cond_13
    const/4 v3, 0x0

    :goto_3
    iget v9, v11, Llo/p;->k:I

    if-nez v9, :cond_17

    invoke-virtual {v6, v13}, Llo/s;->d(I)Z

    move-result v9

    if-nez v9, :cond_14

    goto/16 :goto_8

    :cond_14
    invoke-virtual {v6, v13}, Llo/s;->i(I)I

    move-result v9

    if-eqz v5, :cond_16

    if-nez v12, :cond_16

    invoke-virtual {v6}, Llo/s;->e()Z

    move-result v5

    if-nez v5, :cond_15

    goto :goto_8

    :cond_15
    invoke-virtual {v6}, Llo/s;->n()I

    move-result v5

    :goto_4
    const/4 v6, 0x0

    :goto_5
    const/4 v13, 0x0

    goto :goto_7

    :cond_16
    const/4 v5, 0x0

    goto :goto_4

    :cond_17
    const/4 v13, 0x1

    if-ne v9, v13, :cond_1b

    iget-boolean v9, v11, Llo/p;->m:Z

    if-nez v9, :cond_1b

    invoke-virtual {v6}, Llo/s;->e()Z

    move-result v9

    if-nez v9, :cond_18

    goto :goto_8

    :cond_18
    invoke-virtual {v6}, Llo/s;->n()I

    move-result v9

    if-eqz v5, :cond_1a

    if-nez v12, :cond_1a

    invoke-virtual {v6}, Llo/s;->e()Z

    move-result v5

    if-nez v5, :cond_19

    goto :goto_8

    :cond_19
    invoke-virtual {v6}, Llo/s;->n()I

    move-result v5

    move v6, v5

    move v13, v9

    const/4 v5, 0x0

    :goto_6
    const/4 v9, 0x0

    goto :goto_7

    :cond_1a
    move v13, v9

    const/4 v5, 0x0

    const/4 v6, 0x0

    goto :goto_6

    :cond_1b
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    goto :goto_5

    :goto_7
    iget-object v0, v4, Lfn/m;->n:Lab/p;

    iput-object v11, v0, Lab/p;->p:Ljava/lang/Object;

    iput v1, v0, Lab/p;->c:I

    iput v7, v0, Lab/p;->d:I

    iput v10, v0, Lab/p;->e:I

    iput v8, v0, Lab/p;->f:I

    iput-boolean v12, v0, Lab/p;->g:Z

    iput-boolean v15, v0, Lab/p;->h:Z

    iput-boolean v14, v0, Lab/p;->i:Z

    iput-boolean v2, v0, Lab/p;->j:Z

    iput v3, v0, Lab/p;->k:I

    iput v9, v0, Lab/p;->l:I

    iput v5, v0, Lab/p;->m:I

    iput v13, v0, Lab/p;->n:I

    iput v6, v0, Lab/p;->o:I

    const/4 v13, 0x1

    iput-boolean v13, v0, Lab/p;->a:Z

    iput-boolean v13, v0, Lab/p;->b:Z

    const/4 v0, 0x0

    iput-boolean v0, v4, Lfn/m;->k:Z

    :goto_8
    return-void

    :pswitch_0
    iget-boolean v4, v0, Lab/r;->g:Z

    if-eqz v4, :cond_1c

    iget-object v4, v0, Lab/r;->o:Ljava/lang/Object;

    check-cast v4, Lab/q;

    iget-boolean v4, v4, Lab/q;->c:Z

    if-eqz v4, :cond_1d

    :cond_1c
    iget-object v4, v0, Lab/r;->k:Ljava/lang/Object;

    check-cast v4, Lab/y;

    invoke-virtual {v4, v1, v2, v3}, Lab/y;->a([BII)V

    iget-object v4, v0, Lab/r;->l:Ljava/lang/Object;

    check-cast v4, Lab/y;

    invoke-virtual {v4, v1, v2, v3}, Lab/y;->a([BII)V

    :cond_1d
    iget-object v4, v0, Lab/r;->m:Ljava/lang/Object;

    check-cast v4, Lab/y;

    invoke-virtual {v4, v1, v2, v3}, Lab/y;->a([BII)V

    iget-object v4, v0, Lab/r;->o:Ljava/lang/Object;

    check-cast v4, Lab/q;

    iget-object v5, v4, Lab/q;->e:Landroid/util/SparseArray;

    iget-object v6, v4, Lab/q;->f:Llo/s;

    iget-boolean v7, v4, Lab/q;->k:Z

    if-nez v7, :cond_1e

    goto/16 :goto_11

    :cond_1e
    sub-int/2addr v3, v2

    iget-object v7, v4, Lab/q;->g:[B

    array-length v8, v7

    iget v9, v4, Lab/q;->h:I

    add-int/2addr v9, v3

    const/4 v10, 0x2

    if-ge v8, v9, :cond_1f

    mul-int/2addr v9, v10

    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v7

    iput-object v7, v4, Lab/q;->g:[B

    :cond_1f
    iget-object v7, v4, Lab/q;->g:[B

    iget v8, v4, Lab/q;->h:I

    invoke-static {v1, v2, v7, v8, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v1, v4, Lab/q;->h:I

    add-int/2addr v1, v3

    iput v1, v4, Lab/q;->h:I

    iget-object v2, v4, Lab/q;->g:[B

    iput-object v2, v6, Llo/s;->b:[B

    const/4 v2, 0x0

    iput v2, v6, Llo/s;->d:I

    iput v1, v6, Llo/s;->c:I

    iput v2, v6, Llo/s;->e:I

    invoke-virtual {v6}, Llo/s;->a()V

    const/16 v1, 0x8

    invoke-virtual {v6, v1}, Llo/s;->d(I)Z

    move-result v1

    if-nez v1, :cond_20

    goto/16 :goto_11

    :cond_20
    invoke-virtual {v6}, Llo/s;->s()V

    invoke-virtual {v6, v10}, Llo/s;->i(I)I

    move-result v1

    const/4 v3, 0x5

    invoke-virtual {v6, v3}, Llo/s;->t(I)V

    invoke-virtual {v6}, Llo/s;->e()Z

    move-result v7

    if-nez v7, :cond_21

    goto/16 :goto_11

    :cond_21
    invoke-virtual {v6}, Llo/s;->m()I

    invoke-virtual {v6}, Llo/s;->e()Z

    move-result v7

    if-nez v7, :cond_22

    goto/16 :goto_11

    :cond_22
    invoke-virtual {v6}, Llo/s;->m()I

    move-result v7

    iget-boolean v8, v4, Lab/q;->c:Z

    const/4 v9, 0x1

    if-nez v8, :cond_23

    iput-boolean v2, v4, Lab/q;->k:Z

    iget-object v1, v4, Lab/q;->n:Lab/p;

    iput v7, v1, Lab/p;->d:I

    iput-boolean v9, v1, Lab/p;->b:Z

    goto/16 :goto_11

    :cond_23
    invoke-virtual {v6}, Llo/s;->e()Z

    move-result v8

    if-nez v8, :cond_24

    goto/16 :goto_11

    :cond_24
    invoke-virtual {v6}, Llo/s;->m()I

    move-result v8

    invoke-virtual {v5, v8}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v11

    if-gez v11, :cond_25

    iput-boolean v2, v4, Lab/q;->k:Z

    goto/16 :goto_11

    :cond_25
    invoke-virtual {v5, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly8/l;

    iget-object v11, v4, Lab/q;->d:Landroid/util/SparseArray;

    iget v12, v5, Ly8/l;->a:I

    iget-boolean v5, v5, Ly8/l;->b:Z

    invoke-virtual {v11, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ly8/m;

    iget-boolean v12, v11, Ly8/m;->j:Z

    iget v13, v11, Ly8/m;->n:I

    iget v14, v11, Ly8/m;->l:I

    if-eqz v12, :cond_27

    invoke-virtual {v6, v10}, Llo/s;->d(I)Z

    move-result v12

    if-nez v12, :cond_26

    goto/16 :goto_11

    :cond_26
    invoke-virtual {v6, v10}, Llo/s;->t(I)V

    :cond_27
    invoke-virtual {v6, v14}, Llo/s;->d(I)Z

    move-result v10

    if-nez v10, :cond_28

    goto/16 :goto_11

    :cond_28
    invoke-virtual {v6, v14}, Llo/s;->i(I)I

    move-result v10

    iget-boolean v12, v11, Ly8/m;->k:Z

    if-nez v12, :cond_2c

    invoke-virtual {v6, v9}, Llo/s;->d(I)Z

    move-result v12

    if-nez v12, :cond_29

    goto/16 :goto_11

    :cond_29
    invoke-virtual {v6}, Llo/s;->h()Z

    move-result v12

    if-eqz v12, :cond_2b

    invoke-virtual {v6, v9}, Llo/s;->d(I)Z

    move-result v14

    if-nez v14, :cond_2a

    goto/16 :goto_11

    :cond_2a
    invoke-virtual {v6}, Llo/s;->h()Z

    move-result v14

    move v15, v9

    goto :goto_a

    :cond_2b
    move v14, v2

    :goto_9
    move v15, v14

    goto :goto_a

    :cond_2c
    move v12, v2

    move v14, v12

    goto :goto_9

    :goto_a
    iget v2, v4, Lab/q;->i:I

    if-ne v2, v3, :cond_2d

    move v2, v9

    goto :goto_b

    :cond_2d
    const/4 v2, 0x0

    :goto_b
    if-eqz v2, :cond_2f

    invoke-virtual {v6}, Llo/s;->e()Z

    move-result v3

    if-nez v3, :cond_2e

    goto/16 :goto_11

    :cond_2e
    invoke-virtual {v6}, Llo/s;->m()I

    move-result v3

    goto :goto_c

    :cond_2f
    const/4 v3, 0x0

    :goto_c
    iget v9, v11, Ly8/m;->m:I

    if-nez v9, :cond_33

    invoke-virtual {v6, v13}, Llo/s;->d(I)Z

    move-result v9

    if-nez v9, :cond_30

    goto/16 :goto_11

    :cond_30
    invoke-virtual {v6, v13}, Llo/s;->i(I)I

    move-result v9

    if-eqz v5, :cond_32

    if-nez v12, :cond_32

    invoke-virtual {v6}, Llo/s;->e()Z

    move-result v5

    if-nez v5, :cond_31

    goto :goto_11

    :cond_31
    invoke-virtual {v6}, Llo/s;->n()I

    move-result v5

    :goto_d
    const/4 v6, 0x0

    :goto_e
    const/4 v13, 0x0

    goto :goto_10

    :cond_32
    const/4 v5, 0x0

    goto :goto_d

    :cond_33
    const/4 v13, 0x1

    if-ne v9, v13, :cond_37

    iget-boolean v9, v11, Ly8/m;->o:Z

    if-nez v9, :cond_37

    invoke-virtual {v6}, Llo/s;->e()Z

    move-result v9

    if-nez v9, :cond_34

    goto :goto_11

    :cond_34
    invoke-virtual {v6}, Llo/s;->n()I

    move-result v9

    if-eqz v5, :cond_36

    if-nez v12, :cond_36

    invoke-virtual {v6}, Llo/s;->e()Z

    move-result v5

    if-nez v5, :cond_35

    goto :goto_11

    :cond_35
    invoke-virtual {v6}, Llo/s;->n()I

    move-result v5

    move v6, v5

    move v13, v9

    const/4 v5, 0x0

    :goto_f
    const/4 v9, 0x0

    goto :goto_10

    :cond_36
    move v13, v9

    const/4 v5, 0x0

    const/4 v6, 0x0

    goto :goto_f

    :cond_37
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    goto :goto_e

    :goto_10
    iget-object v0, v4, Lab/q;->n:Lab/p;

    iput-object v11, v0, Lab/p;->p:Ljava/lang/Object;

    iput v1, v0, Lab/p;->c:I

    iput v7, v0, Lab/p;->d:I

    iput v10, v0, Lab/p;->e:I

    iput v8, v0, Lab/p;->f:I

    iput-boolean v12, v0, Lab/p;->g:Z

    iput-boolean v15, v0, Lab/p;->h:Z

    iput-boolean v14, v0, Lab/p;->i:Z

    iput-boolean v2, v0, Lab/p;->j:Z

    iput v3, v0, Lab/p;->k:I

    iput v9, v0, Lab/p;->l:I

    iput v5, v0, Lab/p;->m:I

    iput v13, v0, Lab/p;->n:I

    iput v6, v0, Lab/p;->o:I

    const/4 v13, 0x1

    iput-boolean v13, v0, Lab/p;->a:Z

    iput-boolean v13, v0, Lab/p;->b:Z

    const/4 v0, 0x0

    iput-boolean v0, v4, Lab/q;->k:Z

    :goto_11
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public k(IJJ)V
    .locals 2

    iget-boolean v0, p0, Lab/r;->g:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lab/r;->o:Ljava/lang/Object;

    check-cast v0, Lab/q;

    iget-boolean v0, v0, Lab/q;->c:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lab/r;->k:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0, p1}, Lab/y;->e(I)V

    iget-object v0, p0, Lab/r;->l:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0, p1}, Lab/y;->e(I)V

    :cond_1
    iget-object v0, p0, Lab/r;->m:Ljava/lang/Object;

    check-cast v0, Lab/y;

    invoke-virtual {v0, p1}, Lab/y;->e(I)V

    iget-object v0, p0, Lab/r;->o:Ljava/lang/Object;

    check-cast v0, Lab/q;

    iget-boolean v1, p0, Lab/r;->i:Z

    iput p1, v0, Lab/q;->i:I

    iput-wide p4, v0, Lab/q;->l:J

    iput-wide p2, v0, Lab/q;->j:J

    iput-boolean v1, v0, Lab/q;->s:Z

    iget-boolean p2, v0, Lab/q;->b:Z

    const/4 p3, 0x1

    if-eqz p2, :cond_2

    if-eq p1, p3, :cond_3

    :cond_2
    iget-boolean p2, v0, Lab/q;->c:Z

    if-eqz p2, :cond_4

    const/4 p2, 0x5

    if-eq p1, p2, :cond_3

    if-eq p1, p3, :cond_3

    const/4 p2, 0x2

    if-ne p1, p2, :cond_4

    :cond_3
    iget-object p1, v0, Lab/q;->m:Lab/p;

    iget-object p2, v0, Lab/q;->n:Lab/p;

    iput-object p2, v0, Lab/q;->m:Lab/p;

    iput-object p1, v0, Lab/q;->n:Lab/p;

    const/4 p2, 0x0

    iput-boolean p2, p1, Lab/p;->b:Z

    iput-boolean p2, p1, Lab/p;->a:Z

    iput p2, v0, Lab/q;->h:I

    iput-boolean p3, v0, Lab/q;->k:Z

    :cond_4
    return-void
.end method
