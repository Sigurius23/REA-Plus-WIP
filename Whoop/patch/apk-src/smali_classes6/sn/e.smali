.class public final Lsn/e;
.super Lsn/h;
.source "SourceFile"


# instance fields
.field public final k:Lsn/a;

.field public final l:J

.field public final m:J

.field public final n:Z

.field public final o:Z

.field public final p:Z

.field public final q:Ljava/util/ArrayList;

.field public final r:Lrm/n1;

.field public s:Lsn/d;

.field public t:Lcom/google/android/exoplayer2/source/ClippingMediaSource$IllegalClippingException;

.field public u:J

.field public v:J


# direct methods
.method public constructor <init>(Lsn/a;JJZZZ)V
    .locals 2

    invoke-direct {p0}, Lsn/h;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Llo/a;->e(Z)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lsn/e;->k:Lsn/a;

    iput-wide p2, p0, Lsn/e;->l:J

    iput-wide p4, p0, Lsn/e;->m:J

    iput-boolean p6, p0, Lsn/e;->n:Z

    iput-boolean p7, p0, Lsn/e;->o:Z

    iput-boolean p8, p0, Lsn/e;->p:Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lsn/e;->q:Ljava/util/ArrayList;

    new-instance p1, Lrm/n1;

    invoke-direct {p1}, Lrm/n1;-><init>()V

    iput-object p1, p0, Lsn/e;->r:Lrm/n1;

    return-void
.end method


# virtual methods
.method public final a(Lsn/v;Lko/o;J)Lsn/s;
    .locals 7

    new-instance v0, Lsn/c;

    iget-object v1, p0, Lsn/e;->k:Lsn/a;

    invoke-virtual {v1, p1, p2, p3, p4}, Lsn/a;->a(Lsn/v;Lko/o;J)Lsn/s;

    move-result-object v1

    iget-wide v3, p0, Lsn/e;->u:J

    iget-wide v5, p0, Lsn/e;->v:J

    iget-boolean v2, p0, Lsn/e;->n:Z

    invoke-direct/range {v0 .. v6}, Lsn/c;-><init>(Lsn/s;ZJJ)V

    iget-object p1, p0, Lsn/e;->q:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final f()Lrm/k0;
    .locals 1

    iget-object v0, p0, Lsn/e;->k:Lsn/a;

    invoke-virtual {v0}, Lsn/a;->f()Lrm/k0;

    move-result-object v0

    return-object v0
.end method

.method public final g()V
    .locals 1

    iget-object v0, p0, Lsn/e;->t:Lcom/google/android/exoplayer2/source/ClippingMediaSource$IllegalClippingException;

    if-nez v0, :cond_0

    invoke-super {p0}, Lsn/h;->g()V

    return-void

    :cond_0
    throw v0
.end method

.method public final i(Lko/j0;)V
    .locals 1

    iput-object p1, p0, Lsn/h;->j:Lko/j0;

    const/4 p1, 0x0

    invoke-static {p1}, Llo/y;->k(Lmo/h;)Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, Lsn/h;->i:Landroid/os/Handler;

    iget-object v0, p0, Lsn/e;->k:Lsn/a;

    invoke-virtual {p0, p1, v0}, Lsn/h;->r(Ljava/lang/Object;Lsn/a;)V

    return-void
.end method

.method public final k(Lsn/s;)V
    .locals 2

    iget-object v0, p0, Lsn/e;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Llo/a;->i(Z)V

    check-cast p1, Lsn/c;

    iget-object p1, p1, Lsn/c;->w:Lsn/s;

    iget-object v1, p0, Lsn/e;->k:Lsn/a;

    invoke-virtual {v1, p1}, Lsn/a;->k(Lsn/s;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lsn/e;->o:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lsn/e;->s:Lsn/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lsn/k;->x:Lrm/o1;

    invoke-virtual {p0, p1}, Lsn/e;->s(Lrm/o1;)V

    :cond_0
    return-void
.end method

.method public final m()V
    .locals 1

    invoke-super {p0}, Lsn/h;->m()V

    const/4 v0, 0x0

    iput-object v0, p0, Lsn/e;->t:Lcom/google/android/exoplayer2/source/ClippingMediaSource$IllegalClippingException;

    iput-object v0, p0, Lsn/e;->s:Lsn/d;

    return-void
.end method

.method public final q(Ljava/lang/Object;Lsn/a;Lrm/o1;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    iget-object p1, p0, Lsn/e;->t:Lcom/google/android/exoplayer2/source/ClippingMediaSource$IllegalClippingException;

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p3}, Lsn/e;->s(Lrm/o1;)V

    return-void
.end method

.method public final s(Lrm/o1;)V
    .locals 16

    move-object/from16 v1, p0

    const/4 v2, 0x0

    iget-object v0, v1, Lsn/e;->r:Lrm/n1;

    move-object/from16 v4, p1

    invoke-virtual {v4, v2, v0}, Lrm/o1;->n(ILrm/n1;)V

    iget-wide v5, v0, Lrm/n1;->Q:J

    iget-object v3, v1, Lsn/e;->s:Lsn/d;

    iget-wide v7, v1, Lsn/e;->m:J

    const-wide/high16 v9, -0x8000000000000000L

    iget-object v11, v1, Lsn/e;->q:Ljava/util/ArrayList;

    if-eqz v3, :cond_2

    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    iget-boolean v3, v1, Lsn/e;->o:Z

    if-eqz v3, :cond_0

    goto :goto_2

    :cond_0
    iget-wide v12, v1, Lsn/e;->u:J

    sub-long/2addr v12, v5

    cmp-long v0, v7, v9

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-wide v7, v1, Lsn/e;->v:J

    sub-long v9, v7, v5

    :goto_0
    move-wide v7, v9

    :goto_1
    move-wide v5, v12

    goto :goto_6

    :cond_2
    :goto_2
    iget-boolean v3, v1, Lsn/e;->p:Z

    iget-wide v12, v1, Lsn/e;->l:J

    if-eqz v3, :cond_3

    iget-wide v14, v0, Lrm/n1;->M:J

    add-long/2addr v12, v14

    add-long/2addr v14, v7

    goto :goto_3

    :cond_3
    move-wide v14, v7

    :goto_3
    add-long v2, v5, v12

    iput-wide v2, v1, Lsn/e;->u:J

    cmp-long v0, v7, v9

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    add-long v9, v5, v14

    :goto_4
    iput-wide v9, v1, Lsn/e;->v:J

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_5
    if-ge v2, v0, :cond_5

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsn/c;

    iget-wide v5, v1, Lsn/e;->u:J

    iget-wide v7, v1, Lsn/e;->v:J

    iput-wide v5, v3, Lsn/c;->E:J

    iput-wide v7, v3, Lsn/c;->F:J

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    move-wide v7, v14

    goto :goto_1

    :goto_6
    :try_start_0
    new-instance v3, Lsn/d;

    invoke-direct/range {v3 .. v8}, Lsn/d;-><init>(Lrm/o1;JJ)V

    iput-object v3, v1, Lsn/e;->s:Lsn/d;
    :try_end_0
    .catch Lcom/google/android/exoplayer2/source/ClippingMediaSource$IllegalClippingException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v1, v3}, Lsn/a;->j(Lrm/o1;)V

    return-void

    :catch_0
    move-exception v0

    iput-object v0, v1, Lsn/e;->t:Lcom/google/android/exoplayer2/source/ClippingMediaSource$IllegalClippingException;

    const/4 v2, 0x0

    :goto_7
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_6

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsn/c;

    iget-object v3, v1, Lsn/e;->t:Lcom/google/android/exoplayer2/source/ClippingMediaSource$IllegalClippingException;

    iput-object v3, v0, Lsn/c;->G:Lcom/google/android/exoplayer2/source/ClippingMediaSource$IllegalClippingException;

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_6
    return-void
.end method
