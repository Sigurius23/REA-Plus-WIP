.class public final Ln0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/s0;


# instance fields
.field public final a:Ln0/o;

.field public final b:I

.field public final c:Z

.field public final d:F

.field public final e:Ly2/s0;

.field public final f:F

.field public final g:Z

.field public final h:Lbc3/c0;

.field public final i:Ly3/c;

.field public final j:J

.field public final k:Ljava/lang/Object;

.field public final l:I

.field public final m:I

.field public final n:I

.field public final o:Lh0/d2;

.field public final p:I

.field public final q:I


# direct methods
.method public constructor <init>(Ln0/o;IZFLy2/s0;FZLbc3/c0;Ly3/c;JLjava/util/List;IIILh0/d2;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/n;->a:Ln0/o;

    iput p2, p0, Ln0/n;->b:I

    iput-boolean p3, p0, Ln0/n;->c:Z

    iput p4, p0, Ln0/n;->d:F

    iput-object p5, p0, Ln0/n;->e:Ly2/s0;

    iput p6, p0, Ln0/n;->f:F

    iput-boolean p7, p0, Ln0/n;->g:Z

    iput-object p8, p0, Ln0/n;->h:Lbc3/c0;

    iput-object p9, p0, Ln0/n;->i:Ly3/c;

    iput-wide p10, p0, Ln0/n;->j:J

    iput-object p12, p0, Ln0/n;->k:Ljava/lang/Object;

    iput p13, p0, Ln0/n;->l:I

    iput p14, p0, Ln0/n;->m:I

    iput p15, p0, Ln0/n;->n:I

    move-object/from16 p1, p16

    iput-object p1, p0, Ln0/n;->o:Lh0/d2;

    move/from16 p1, p17

    iput p1, p0, Ln0/n;->p:I

    move/from16 p1, p18

    iput p1, p0, Ln0/n;->q:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Ln0/n;->e:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Ln0/n;->e:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->b()V

    return-void
.end method

.method public final c()Lkotlin/jvm/functions/Function1;
    .locals 1

    iget-object v0, p0, Ln0/n;->e:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->c()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public final d(IZ)Ln0/n;
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p1

    iget-boolean v2, v0, Ln0/n;->g:Z

    if-nez v2, :cond_5

    iget-object v15, v0, Ln0/n;->k:Ljava/lang/Object;

    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, v0, Ln0/n;->a:Ln0/o;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ln0/o;->g()I

    move-result v2

    iget v3, v0, Ln0/n;->b:I

    sub-int v5, v3, v1

    if-ltz v5, :cond_5

    if-ge v5, v2, :cond_5

    invoke-static {v15}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/o;

    invoke-static {v15}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln0/o;

    invoke-virtual {v2}, Ln0/o;->c()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual {v3}, Ln0/o;->c()Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_5

    :cond_0
    iget v4, v0, Ln0/n;->m:I

    iget v6, v0, Ln0/n;->l:I

    if-gez v1, :cond_1

    invoke-virtual {v2}, Ln0/o;->n()I

    move-result v7

    invoke-virtual {v2}, Ln0/o;->g()I

    move-result v2

    add-int/2addr v2, v7

    sub-int/2addr v2, v6

    invoke-virtual {v3}, Ln0/o;->n()I

    move-result v6

    invoke-virtual {v3}, Ln0/o;->g()I

    move-result v3

    add-int/2addr v3, v6

    sub-int/2addr v3, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    neg-int v3, v1

    if-le v2, v3, :cond_5

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ln0/o;->n()I

    move-result v2

    sub-int/2addr v6, v2

    invoke-virtual {v3}, Ln0/o;->n()I

    move-result v2

    sub-int/2addr v4, v2

    invoke-static {v6, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-le v2, v1, :cond_5

    :goto_0
    move-object v2, v15

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    if-ge v4, v2, :cond_2

    invoke-interface {v15, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ln0/o;

    move/from16 v7, p2

    invoke-virtual {v6, v1, v7}, Ln0/o;->l(IZ)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    new-instance v2, Ln0/n;

    iget-boolean v4, v0, Ln0/n;->c:Z

    if-nez v4, :cond_4

    if-lez v1, :cond_3

    goto :goto_3

    :cond_3
    :goto_2
    move v6, v3

    goto :goto_4

    :cond_4
    :goto_3
    const/4 v3, 0x1

    goto :goto_2

    :goto_4
    int-to-float v7, v1

    iget v1, v0, Ln0/n;->p:I

    iget v3, v0, Ln0/n;->q:I

    iget-object v4, v0, Ln0/n;->a:Ln0/o;

    iget-object v8, v0, Ln0/n;->e:Ly2/s0;

    iget v9, v0, Ln0/n;->f:F

    iget-boolean v10, v0, Ln0/n;->g:Z

    iget-object v11, v0, Ln0/n;->h:Lbc3/c0;

    iget-object v12, v0, Ln0/n;->i:Ly3/c;

    iget-wide v13, v0, Ln0/n;->j:J

    move/from16 v20, v1

    iget v1, v0, Ln0/n;->l:I

    move/from16 v16, v1

    iget v1, v0, Ln0/n;->m:I

    move/from16 v17, v1

    iget v1, v0, Ln0/n;->n:I

    move/from16 v18, v1

    iget-object v1, v0, Ln0/n;->o:Lh0/d2;

    move-object/from16 v19, v1

    move/from16 v21, v3

    move-object v3, v2

    invoke-direct/range {v3 .. v21}, Ln0/n;-><init>(Ln0/o;IZFLy2/s0;FZLbc3/c0;Ly3/c;JLjava/util/List;IIILh0/d2;II)V

    return-object v3

    :cond_5
    :goto_5
    const/4 v1, 0x0

    return-object v1
.end method

.method public final e()J
    .locals 7

    iget-object v0, p0, Ln0/n;->e:Ly2/s0;

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

    iget-object v0, p0, Ln0/n;->e:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->getHeight()I

    move-result v0

    return v0
.end method

.method public final getWidth()I
    .locals 1

    iget-object v0, p0, Ln0/n;->e:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->getWidth()I

    move-result v0

    return v0
.end method
