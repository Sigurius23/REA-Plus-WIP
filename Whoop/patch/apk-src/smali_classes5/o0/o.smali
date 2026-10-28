.class public final Lo0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/s0;


# instance fields
.field public final a:Lo0/q;

.field public final b:I

.field public final c:Z

.field public final d:F

.field public final e:Ly2/s0;

.field public final f:F

.field public final g:Z

.field public final h:Lbc3/c0;

.field public final i:Ly3/c;

.field public final j:I

.field public final k:Lkotlin/jvm/functions/Function1;

.field public final l:Lkotlin/jvm/functions/Function1;

.field public final m:Ljava/lang/Object;

.field public final n:I

.field public final o:I

.field public final p:I

.field public final q:Lh0/d2;

.field public final r:I

.field public final s:I


# direct methods
.method public constructor <init>(Lo0/q;IZFLy2/s0;FZLbc3/c0;Ly3/c;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/util/List;IIILh0/d2;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/o;->a:Lo0/q;

    iput p2, p0, Lo0/o;->b:I

    iput-boolean p3, p0, Lo0/o;->c:Z

    iput p4, p0, Lo0/o;->d:F

    iput-object p5, p0, Lo0/o;->e:Ly2/s0;

    iput p6, p0, Lo0/o;->f:F

    iput-boolean p7, p0, Lo0/o;->g:Z

    iput-object p8, p0, Lo0/o;->h:Lbc3/c0;

    iput-object p9, p0, Lo0/o;->i:Ly3/c;

    iput p10, p0, Lo0/o;->j:I

    iput-object p11, p0, Lo0/o;->k:Lkotlin/jvm/functions/Function1;

    iput-object p12, p0, Lo0/o;->l:Lkotlin/jvm/functions/Function1;

    iput-object p13, p0, Lo0/o;->m:Ljava/lang/Object;

    iput p14, p0, Lo0/o;->n:I

    iput p15, p0, Lo0/o;->o:I

    move/from16 p1, p16

    iput p1, p0, Lo0/o;->p:I

    move-object/from16 p1, p17

    iput-object p1, p0, Lo0/o;->q:Lh0/d2;

    move/from16 p1, p18

    iput p1, p0, Lo0/o;->r:I

    move/from16 p1, p19

    iput p1, p0, Lo0/o;->s:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lo0/o;->e:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lo0/o;->e:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->b()V

    return-void
.end method

.method public final c()Lkotlin/jvm/functions/Function1;
    .locals 1

    iget-object v0, p0, Lo0/o;->e:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->c()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public final d(IZ)Lo0/o;
    .locals 23

    move-object/from16 v0, p0

    move/from16 v1, p1

    iget-boolean v2, v0, Lo0/o;->g:Z

    if-nez v2, :cond_8

    iget-object v2, v0, Lo0/o;->m:Ljava/lang/Object;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_8

    iget-object v3, v0, Lo0/o;->a:Lo0/q;

    if-eqz v3, :cond_8

    iget v3, v3, Lo0/q;->g:I

    iget v4, v0, Lo0/o;->b:I

    sub-int v5, v4, v1

    if-ltz v5, :cond_8

    if-ge v5, v3, :cond_8

    invoke-static {v2}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo0/p;

    invoke-static {v2}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo0/p;

    iget-boolean v6, v3, Lo0/p;->w:Z

    if-nez v6, :cond_8

    iget-boolean v6, v4, Lo0/p;->w:Z

    if-eqz v6, :cond_0

    goto/16 :goto_7

    :cond_0
    iget v6, v0, Lo0/o;->o:I

    iget v7, v0, Lo0/o;->n:I

    iget-object v8, v0, Lo0/o;->q:Lh0/d2;

    if-gez v1, :cond_1

    invoke-static {v3, v8}, Lse/g;->G(Lo0/p;Lh0/d2;)I

    move-result v9

    iget v3, v3, Lo0/p;->o:I

    add-int/2addr v9, v3

    sub-int/2addr v9, v7

    invoke-static {v4, v8}, Lse/g;->G(Lo0/p;Lh0/d2;)I

    move-result v3

    iget v4, v4, Lo0/p;->o:I

    add-int/2addr v3, v4

    sub-int/2addr v3, v6

    invoke-static {v9, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    neg-int v4, v1

    if-le v3, v4, :cond_8

    goto :goto_0

    :cond_1
    invoke-static {v3, v8}, Lse/g;->G(Lo0/p;Lh0/d2;)I

    move-result v3

    sub-int/2addr v7, v3

    invoke-static {v4, v8}, Lse/g;->G(Lo0/p;Lh0/d2;)I

    move-result v3

    sub-int/2addr v6, v3

    invoke-static {v7, v6}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-le v3, v1, :cond_8

    :goto_0
    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v3, :cond_5

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo0/p;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v9, v7, Lo0/p;->w:Z

    if-eqz v9, :cond_2

    move-object v14, v2

    move/from16 v19, v3

    move v10, v5

    goto :goto_4

    :cond_2
    iget-wide v9, v7, Lo0/p;->t:J

    const/16 v11, 0x20

    shr-long v12, v9, v11

    long-to-int v12, v12

    const-wide v13, 0xffffffffL

    and-long/2addr v9, v13

    long-to-int v9, v9

    add-int/2addr v9, v1

    move v10, v5

    int-to-long v4, v12

    shl-long/2addr v4, v11

    move/from16 v16, v11

    int-to-long v11, v9

    and-long/2addr v11, v13

    or-long/2addr v4, v11

    iput-wide v4, v7, Lo0/p;->t:J

    if-eqz p2, :cond_4

    iget-object v4, v7, Lo0/p;->g:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v4, :cond_4

    iget-object v9, v7, Lo0/p;->j:Landroidx/compose/foundation/lazy/layout/b;

    iget-object v11, v7, Lo0/p;->b:Ljava/lang/Object;

    invoke-virtual {v9, v5, v11}, Landroidx/compose/foundation/lazy/layout/b;->a(ILjava/lang/Object;)Lp0/t;

    move-result-object v9

    if-eqz v9, :cond_3

    iget-wide v11, v9, Lp0/t;->l:J

    move-wide/from16 v17, v13

    shr-long v13, v11, v16

    long-to-int v13, v13

    and-long v11, v11, v17

    long-to-int v11, v11

    add-int/2addr v11, v1

    int-to-long v12, v13

    shl-long v12, v12, v16

    move-object v14, v2

    move/from16 v19, v3

    int-to-long v2, v11

    and-long v2, v2, v17

    or-long/2addr v2, v12

    iput-wide v2, v9, Lp0/t;->l:J

    goto :goto_3

    :cond_3
    move/from16 v19, v3

    move-wide/from16 v17, v13

    move-object v14, v2

    :goto_3
    add-int/lit8 v5, v5, 0x1

    move-object v2, v14

    move-wide/from16 v13, v17

    move/from16 v3, v19

    goto :goto_2

    :cond_4
    move-object v14, v2

    move/from16 v19, v3

    :goto_4
    add-int/lit8 v6, v6, 0x1

    move v5, v10

    move-object v2, v14

    move/from16 v3, v19

    goto :goto_1

    :cond_5
    move-object v14, v2

    move v10, v5

    iget-boolean v2, v0, Lo0/o;->c:Z

    if-nez v2, :cond_7

    if-lez v1, :cond_6

    goto :goto_5

    :cond_6
    const/4 v6, 0x0

    goto :goto_6

    :cond_7
    :goto_5
    const/4 v4, 0x1

    move v6, v4

    :goto_6
    int-to-float v7, v1

    new-instance v3, Lo0/o;

    iget-object v4, v0, Lo0/o;->a:Lo0/q;

    move-object/from16 v20, v8

    iget-object v8, v0, Lo0/o;->e:Ly2/s0;

    iget v9, v0, Lo0/o;->f:F

    move v5, v10

    iget-boolean v10, v0, Lo0/o;->g:Z

    iget-object v11, v0, Lo0/o;->h:Lbc3/c0;

    iget-object v12, v0, Lo0/o;->i:Ly3/c;

    iget v13, v0, Lo0/o;->j:I

    move-object/from16 v16, v14

    iget-object v14, v0, Lo0/o;->k:Lkotlin/jvm/functions/Function1;

    iget-object v15, v0, Lo0/o;->l:Lkotlin/jvm/functions/Function1;

    iget v1, v0, Lo0/o;->n:I

    iget v2, v0, Lo0/o;->o:I

    move/from16 v17, v1

    iget v1, v0, Lo0/o;->p:I

    move/from16 v19, v1

    iget v1, v0, Lo0/o;->r:I

    move/from16 v21, v1

    iget v1, v0, Lo0/o;->s:I

    move/from16 v22, v1

    move/from16 v18, v2

    invoke-direct/range {v3 .. v22}, Lo0/o;-><init>(Lo0/q;IZFLy2/s0;FZLbc3/c0;Ly3/c;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/util/List;IIILh0/d2;II)V

    return-object v3

    :cond_8
    :goto_7
    const/4 v1, 0x0

    return-object v1
.end method

.method public final e()J
    .locals 7

    iget-object v0, p0, Lo0/o;->e:Ly2/s0;

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

    iget-object v0, p0, Lo0/o;->e:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->getHeight()I

    move-result v0

    return v0
.end method

.method public final getWidth()I
    .locals 1

    iget-object v0, p0, Lo0/o;->e:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->getWidth()I

    move-result v0

    return v0
.end method
