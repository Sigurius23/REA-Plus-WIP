.class public final Lq0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/s0;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:Lh0/d2;

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:Lq0/d;

.field public final j:Lq0/d;

.field public final k:F

.field public final l:I

.field public final m:Z

.field public final n:Li0/n;

.field public final o:Ly2/s0;

.field public final p:Z

.field public final q:Ljava/util/List;

.field public final r:Ljava/util/List;

.field public final s:Lbc3/c0;


# direct methods
.method public synthetic constructor <init>(IIILh0/d2;IIILi0/n;Ly2/s0;Lbc3/c0;)V
    .locals 20

    const/4 v13, 0x0

    const/16 v16, 0x0

    .line 1
    sget-object v1, Lm83/y;->w:Lm83/y;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v17, v1

    move-object/from16 v18, v1

    move-object/from16 v0, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v14, p8

    move-object/from16 v15, p9

    move-object/from16 v19, p10

    invoke-direct/range {v0 .. v19}, Lq0/q;-><init>(Ljava/util/List;IIILh0/d2;IIILq0/d;Lq0/d;FIZLi0/n;Ly2/s0;ZLjava/util/List;Ljava/util/List;Lbc3/c0;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;IIILh0/d2;IIILq0/d;Lq0/d;FIZLi0/n;Ly2/s0;ZLjava/util/List;Ljava/util/List;Lbc3/c0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lq0/q;->a:Ljava/util/List;

    .line 4
    iput p2, p0, Lq0/q;->b:I

    .line 5
    iput p3, p0, Lq0/q;->c:I

    .line 6
    iput p4, p0, Lq0/q;->d:I

    .line 7
    iput-object p5, p0, Lq0/q;->e:Lh0/d2;

    .line 8
    iput p6, p0, Lq0/q;->f:I

    .line 9
    iput p7, p0, Lq0/q;->g:I

    .line 10
    iput p8, p0, Lq0/q;->h:I

    .line 11
    iput-object p9, p0, Lq0/q;->i:Lq0/d;

    .line 12
    iput-object p10, p0, Lq0/q;->j:Lq0/d;

    .line 13
    iput p11, p0, Lq0/q;->k:F

    .line 14
    iput p12, p0, Lq0/q;->l:I

    .line 15
    iput-boolean p13, p0, Lq0/q;->m:Z

    .line 16
    iput-object p14, p0, Lq0/q;->n:Li0/n;

    .line 17
    iput-object p15, p0, Lq0/q;->o:Ly2/s0;

    move/from16 p1, p16

    .line 18
    iput-boolean p1, p0, Lq0/q;->p:Z

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lq0/q;->q:Ljava/util/List;

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lq0/q;->r:Ljava/util/List;

    move-object/from16 p1, p19

    .line 21
    iput-object p1, p0, Lq0/q;->s:Lbc3/c0;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lq0/q;->o:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lq0/q;->o:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->b()V

    return-void
.end method

.method public final c()Lkotlin/jvm/functions/Function1;
    .locals 1

    iget-object v0, p0, Lq0/q;->o:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->c()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public final d(I)Lq0/q;
    .locals 25

    move-object/from16 v0, p0

    move/from16 v1, p1

    iget v2, v0, Lq0/q;->b:I

    iget v3, v0, Lq0/q;->c:I

    add-int/2addr v2, v3

    iget-boolean v3, v0, Lq0/q;->p:Z

    if-nez v3, :cond_8

    iget-object v3, v0, Lq0/q;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_8

    iget-object v4, v0, Lq0/q;->i:Lq0/d;

    if-eqz v4, :cond_8

    iget v4, v0, Lq0/q;->l:I

    sub-int/2addr v4, v1

    if-ltz v4, :cond_8

    if-ge v4, v2, :cond_8

    if-eqz v2, :cond_0

    int-to-float v5, v1

    int-to-float v6, v2

    div-float/2addr v5, v6

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    iget v6, v0, Lq0/q;->k:F

    sub-float v16, v6, v5

    iget-object v5, v0, Lq0/q;->j:Lq0/d;

    if-eqz v5, :cond_8

    const/high16 v5, 0x3f000000    # 0.5f

    cmpl-float v5, v16, v5

    if-gez v5, :cond_8

    const/high16 v5, -0x41000000    # -0.5f

    cmpg-float v5, v16, v5

    if-gtz v5, :cond_1

    goto/16 :goto_8

    :cond_1
    invoke-static {v3}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq0/d;

    invoke-static {v3}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lq0/d;

    iget v7, v0, Lq0/q;->g:I

    iget v8, v0, Lq0/q;->f:I

    if-gez v1, :cond_2

    iget v5, v5, Lq0/d;->k:I

    add-int/2addr v5, v2

    sub-int/2addr v5, v8

    iget v6, v6, Lq0/d;->k:I

    add-int/2addr v6, v2

    sub-int/2addr v6, v7

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v2

    neg-int v5, v1

    if-le v2, v5, :cond_8

    goto :goto_1

    :cond_2
    iget v2, v5, Lq0/d;->k:I

    sub-int/2addr v8, v2

    iget v2, v6, Lq0/d;->k:I

    sub-int/2addr v7, v2

    invoke-static {v8, v7}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-le v2, v1, :cond_8

    :goto_1
    move-object v2, v3

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v5, 0x0

    move v6, v5

    :goto_2
    if-ge v6, v2, :cond_3

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lq0/d;

    invoke-virtual {v7, v1}, Lq0/d;->a(I)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_3
    iget-object v2, v0, Lq0/q;->q:Ljava/util/List;

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    move v6, v5

    :goto_3
    if-ge v6, v3, :cond_4

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lq0/d;

    invoke-virtual {v7, v1}, Lq0/d;->a(I)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_4
    iget-object v2, v0, Lq0/q;->r:Ljava/util/List;

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    move v6, v5

    :goto_4
    if-ge v6, v3, :cond_5

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lq0/d;

    invoke-virtual {v7, v1}, Lq0/d;->a(I)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_5
    new-instance v2, Lq0/q;

    iget-boolean v3, v0, Lq0/q;->m:Z

    if-nez v3, :cond_7

    if-lez v1, :cond_6

    goto :goto_6

    :cond_6
    :goto_5
    move/from16 v18, v5

    goto :goto_7

    :cond_7
    :goto_6
    const/4 v5, 0x1

    goto :goto_5

    :goto_7
    iget-object v1, v0, Lq0/q;->r:Ljava/util/List;

    iget-object v3, v0, Lq0/q;->s:Lbc3/c0;

    iget-object v6, v0, Lq0/q;->a:Ljava/util/List;

    iget v7, v0, Lq0/q;->b:I

    iget v8, v0, Lq0/q;->c:I

    iget v9, v0, Lq0/q;->d:I

    iget-object v10, v0, Lq0/q;->e:Lh0/d2;

    iget v11, v0, Lq0/q;->f:I

    iget v12, v0, Lq0/q;->g:I

    iget v13, v0, Lq0/q;->h:I

    iget-object v14, v0, Lq0/q;->i:Lq0/d;

    iget-object v15, v0, Lq0/q;->j:Lq0/d;

    iget-object v5, v0, Lq0/q;->n:Li0/n;

    move-object/from16 v23, v1

    iget-object v1, v0, Lq0/q;->o:Ly2/s0;

    move-object/from16 v20, v1

    iget-boolean v1, v0, Lq0/q;->p:Z

    move/from16 v21, v1

    iget-object v1, v0, Lq0/q;->q:Ljava/util/List;

    move-object/from16 v22, v1

    move-object/from16 v24, v3

    move/from16 v17, v4

    move-object/from16 v19, v5

    move-object v5, v2

    invoke-direct/range {v5 .. v24}, Lq0/q;-><init>(Ljava/util/List;IIILh0/d2;IIILq0/d;Lq0/d;FIZLi0/n;Ly2/s0;ZLjava/util/List;Ljava/util/List;Lbc3/c0;)V

    return-object v5

    :cond_8
    :goto_8
    const/4 v1, 0x0

    return-object v1
.end method

.method public final e()J
    .locals 7

    iget-object v0, p0, Lq0/q;->o:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->getWidth()I

    move-result v1

    invoke-interface {v0}, Ly2/s0;->getHeight()I

    move-result v0

    int-to-long v1, v1

    const/16 v3, 0x20

    shl-long/2addr v1, v3

    int-to-long v3, v0

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    or-long v0, v1, v3

    return-wide v0
.end method

.method public final getHeight()I
    .locals 1

    iget-object v0, p0, Lq0/q;->o:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->getHeight()I

    move-result v0

    return v0
.end method

.method public final getWidth()I
    .locals 1

    iget-object v0, p0, Lq0/q;->o:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->getWidth()I

    move-result v0

    return v0
.end method
