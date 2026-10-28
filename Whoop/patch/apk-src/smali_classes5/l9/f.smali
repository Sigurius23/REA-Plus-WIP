.class public final Ll9/f;
.super Ll9/h1;
.source "SourceFile"


# instance fields
.field public final l:J

.field public final m:Z

.field public final n:Ljava/util/ArrayList;

.field public final o:Lu8/n0;

.field public p:Ll9/e;

.field public q:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

.field public r:J

.field public s:J


# direct methods
.method public constructor <init>(Ll9/d;)V
    .locals 2

    iget-object v0, p1, Ll9/d;->a:Ll9/a;

    invoke-direct {p0, v0}, Ll9/h1;-><init>(Ll9/a;)V

    iget-wide v0, p1, Ll9/d;->b:J

    iput-wide v0, p0, Ll9/f;->l:J

    iget-boolean p1, p1, Ll9/d;->c:Z

    iput-boolean p1, p0, Ll9/f;->m:Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll9/f;->n:Ljava/util/ArrayList;

    new-instance p1, Lu8/n0;

    invoke-direct {p1}, Lu8/n0;-><init>()V

    iput-object p1, p0, Ll9/f;->o:Lu8/n0;

    return-void
.end method


# virtual methods
.method public final B(Lu8/o0;)V
    .locals 13

    const/4 v1, 0x0

    iget-object v0, p0, Ll9/f;->o:Lu8/n0;

    invoke-virtual {p1, v1, v0}, Lu8/o0;->n(ILu8/n0;)V

    iget-wide v4, v0, Lu8/n0;->p:J

    iget-object v0, p0, Ll9/f;->p:Ll9/e;

    iget-wide v6, p0, Ll9/f;->l:J

    const-wide/high16 v8, -0x8000000000000000L

    iget-object v10, p0, Ll9/f;->n:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v11, p0, Ll9/f;->r:J

    sub-long/2addr v11, v4

    cmp-long v0, v6, v8

    if-nez v0, :cond_0

    move-wide v6, v8

    goto :goto_0

    :cond_0
    iget-wide v6, p0, Ll9/f;->s:J

    sub-long/2addr v6, v4

    :goto_0
    move-wide v4, v11

    goto :goto_3

    :cond_1
    iput-wide v4, p0, Ll9/f;->r:J

    cmp-long v0, v6, v8

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    add-long v8, v4, v6

    :goto_1
    iput-wide v8, p0, Ll9/f;->s:J

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v2, v1

    :goto_2
    if-ge v2, v0, :cond_3

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll9/c;

    iget-wide v8, p0, Ll9/f;->r:J

    iget-wide v11, p0, Ll9/f;->s:J

    iput-wide v8, v4, Ll9/c;->E:J

    iput-wide v11, v4, Ll9/c;->F:J

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    const-wide/16 v11, 0x0

    goto :goto_0

    :goto_3
    :try_start_0
    new-instance v2, Ll9/e;

    move-object v3, p1

    invoke-direct/range {v2 .. v7}, Ll9/e;-><init>(Lu8/o0;JJ)V

    iput-object v2, p0, Ll9/f;->p:Ll9/e;
    :try_end_0
    .catch Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0, v2}, Ll9/a;->l(Lu8/o0;)V

    return-void

    :catch_0
    move-exception v0

    iput-object v0, p0, Ll9/f;->q:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    :goto_4
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll9/c;

    iget-object v2, p0, Ll9/f;->q:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    iput-object v2, v0, Ll9/c;->G:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_4
    return-void
.end method

.method public final a(Ll9/c0;Lko/o;J)Ll9/a0;
    .locals 7

    new-instance v0, Ll9/c;

    iget-object v1, p0, Ll9/h1;->k:Ll9/a;

    invoke-virtual {v1, p1, p2, p3, p4}, Ll9/a;->a(Ll9/c0;Lko/o;J)Ll9/a0;

    move-result-object v1

    iget-wide v3, p0, Ll9/f;->r:J

    iget-wide v5, p0, Ll9/f;->s:J

    iget-boolean v2, p0, Ll9/f;->m:Z

    invoke-direct/range {v0 .. v6}, Ll9/c;-><init>(Ll9/a0;ZJJ)V

    iget-object p1, p0, Ll9/f;->n:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final i()V
    .locals 1

    iget-object v0, p0, Ll9/f;->q:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    if-nez v0, :cond_0

    invoke-super {p0}, Ll9/j;->i()V

    return-void

    :cond_0
    throw v0
.end method

.method public final m(Ll9/a0;)V
    .locals 2

    iget-object v0, p0, Ll9/f;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Lva3/g;->i(Z)V

    check-cast p1, Ll9/c;

    iget-object p1, p1, Ll9/c;->w:Ll9/a0;

    iget-object v1, p0, Ll9/h1;->k:Ll9/a;

    invoke-virtual {v1, p1}, Ll9/a;->m(Ll9/a0;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll9/f;->p:Ll9/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Ll9/r;->b:Lu8/o0;

    invoke-virtual {p0, p1}, Ll9/f;->B(Lu8/o0;)V

    :cond_0
    return-void
.end method

.method public final o()V
    .locals 1

    invoke-super {p0}, Ll9/j;->o()V

    const/4 v0, 0x0

    iput-object v0, p0, Ll9/f;->q:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    iput-object v0, p0, Ll9/f;->p:Ll9/e;

    return-void
.end method

.method public final y(Lu8/o0;)V
    .locals 1

    iget-object v0, p0, Ll9/f;->q:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Ll9/f;->B(Lu8/o0;)V

    return-void
.end method
