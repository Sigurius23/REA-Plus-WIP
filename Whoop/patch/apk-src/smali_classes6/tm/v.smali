.class public final Ltm/v;
.super Lhn/n;
.source "SourceFile"

# interfaces
.implements Llo/l;


# instance fields
.field public final e1:Landroid/content/Context;

.field public final f1:Lq3/i;

.field public final g1:Ltm/s;

.field public h1:I

.field public i1:Z

.field public j1:Lrm/c0;

.field public k1:J

.field public l1:Z

.field public m1:Z

.field public n1:Z

.field public o1:Lrm/v;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lhn/j;Landroid/os/Handler;Lrm/r;Ltm/s;)V
    .locals 2

    const/4 v0, 0x1

    const v1, 0x472c4400    # 44100.0f

    invoke-direct {p0, v0, p2, v1}, Lhn/n;-><init>(ILhn/j;F)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ltm/v;->e1:Landroid/content/Context;

    iput-object p5, p0, Ltm/v;->g1:Ltm/s;

    new-instance p1, Lq3/i;

    invoke-direct {p1, p3, p4}, Lq3/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Ltm/v;->f1:Lq3/i;

    new-instance p1, Lq30/u0;

    const/16 p2, 0x18

    invoke-direct {p1, p0, p2}, Lq30/u0;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p5, Ltm/s;->r:Lq30/u0;

    return-void
.end method

.method public static p0(Lhn/o;Lrm/c0;ZLtm/s;)Lzr/g0;
    .locals 3

    iget-object v0, p1, Lrm/c0;->L:Ljava/lang/String;

    if-nez v0, :cond_0

    sget-object p0, Lzr/g0;->x:Lzr/e0;

    sget-object p0, Lzr/w0;->E:Lzr/w0;

    return-object p0

    :cond_0
    invoke-virtual {p3, p1}, Ltm/s;->g(Lrm/c0;)I

    move-result p3

    const/4 v1, 0x0

    if-eqz p3, :cond_2

    const-string p3, "audio/raw"

    invoke-static {p3, v1, v1}, Lhn/u;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 p3, 0x0

    goto :goto_0

    :cond_1
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lhn/l;

    :goto_0
    if-eqz p3, :cond_2

    invoke-static {p3}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, p2, v1}, Lhn/u;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p0

    invoke-static {p1}, Lhn/u;->b(Lrm/c0;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    invoke-static {p0}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-static {p1, p2, v1}, Lhn/u;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p1

    invoke-static {}, Lzr/g0;->l()Lzr/d0;

    move-result-object p2

    invoke-virtual {p2, p0}, Lzr/a0;->c(Ljava/lang/Iterable;)V

    invoke-virtual {p2, p1}, Lzr/a0;->c(Ljava/lang/Iterable;)V

    invoke-virtual {p2}, Lzr/d0;->f()Lzr/w0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A(Lhn/l;Lrm/c0;Lrm/c0;)Lum/d;
    .locals 8

    invoke-virtual {p1, p2, p3}, Lhn/l;->b(Lrm/c0;Lrm/c0;)Lum/d;

    move-result-object v0

    iget v1, v0, Lum/d;->e:I

    invoke-virtual {p0, p1, p3}, Ltm/v;->o0(Lhn/l;Lrm/c0;)I

    move-result v2

    iget v3, p0, Ltm/v;->h1:I

    if-le v2, v3, :cond_0

    or-int/lit8 v1, v1, 0x40

    :cond_0
    move v7, v1

    new-instance v2, Lum/d;

    iget-object v3, p1, Lhn/l;->a:Ljava/lang/String;

    if-eqz v7, :cond_1

    const/4 p1, 0x0

    :goto_0
    move v6, p1

    move-object v4, p2

    move-object v5, p3

    goto :goto_1

    :cond_1
    iget p1, v0, Lum/d;->d:I

    goto :goto_0

    :goto_1
    invoke-direct/range {v2 .. v7}, Lum/d;-><init>(Ljava/lang/String;Lrm/c0;Lrm/c0;II)V

    return-object v2
.end method

.method public final K(F[Lrm/c0;)F
    .locals 5

    array-length v0, p2

    const/4 v1, -0x1

    const/4 v2, 0x0

    move v3, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v4, p2, v2

    iget v4, v4, Lrm/c0;->Z:I

    if-eq v4, v1, :cond_0

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-ne v3, v1, :cond_2

    const/high16 p1, -0x40800000    # -1.0f

    return p1

    :cond_2
    int-to-float p2, v3

    mul-float/2addr p2, p1

    return p2
.end method

.method public final L(Lhn/o;Lrm/c0;Z)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Ltm/v;->g1:Ltm/s;

    invoke-static {p1, p2, p3, v0}, Ltm/v;->p0(Lhn/o;Lrm/c0;ZLtm/s;)Lzr/g0;

    move-result-object p1

    sget-object p3, Lhn/u;->a:Ljava/util/regex/Pattern;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance p1, Lhn/p;

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lea2/l;

    const/4 v0, 0x2

    invoke-direct {p2, p1, v0}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    invoke-static {p3, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object p3
.end method

.method public final N(Lhn/l;Lrm/c0;Landroid/media/MediaCrypto;F)Lhn/i;
    .locals 12

    move/from16 v0, p4

    iget-object v2, p0, Lrm/d;->H:[Lrm/c0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p0 .. p2}, Ltm/v;->o0(Lhn/l;Lrm/c0;)I

    move-result v4

    array-length v5, v2

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-ne v5, v7, :cond_0

    goto :goto_1

    :cond_0
    array-length v5, v2

    move v8, v6

    :goto_0
    if-ge v8, v5, :cond_2

    aget-object v9, v2, v8

    invoke-virtual {p1, p2, v9}, Lhn/l;->b(Lrm/c0;Lrm/c0;)Lum/d;

    move-result-object v10

    iget v10, v10, Lum/d;->d:I

    if-eqz v10, :cond_1

    invoke-virtual {p0, p1, v9}, Ltm/v;->o0(Lhn/l;Lrm/c0;)I

    move-result v9

    invoke-static {v4, v9}, Ljava/lang/Math;->max(II)I

    move-result v4

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    iput v4, p0, Ltm/v;->h1:I

    iget-object v2, p1, Lhn/l;->a:Ljava/lang/String;

    sget v4, Llo/y;->a:I

    const/16 v5, 0x18

    if-ge v4, v5, :cond_4

    const-string v8, "OMX.SEC.aac.dec"

    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, "samsung"

    sget-object v8, Llo/y;->c:Ljava/lang/String;

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Llo/y;->b:Ljava/lang/String;

    const-string v8, "zeroflte"

    invoke-virtual {v2, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_3

    const-string v8, "herolte"

    invoke-virtual {v2, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_3

    const-string v8, "heroqlte"

    invoke-virtual {v2, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_3
    move v2, v7

    goto :goto_2

    :cond_4
    move v2, v6

    :goto_2
    iput-boolean v2, p0, Ltm/v;->i1:Z

    iget-object v2, p1, Lhn/l;->c:Ljava/lang/String;

    iget v8, p0, Ltm/v;->h1:I

    new-instance v9, Landroid/media/MediaFormat;

    invoke-direct {v9}, Landroid/media/MediaFormat;-><init>()V

    const-string v10, "mime"

    invoke-virtual {v9, v10, v2}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    iget v2, p2, Lrm/c0;->Y:I

    iget-object v10, p2, Lrm/c0;->L:Ljava/lang/String;

    const-string v11, "channel-count"

    invoke-virtual {v9, v11, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget v2, p2, Lrm/c0;->Z:I

    const-string v11, "sample-rate"

    invoke-virtual {v9, v11, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget-object v11, p2, Lrm/c0;->N:Ljava/util/List;

    invoke-static {v9, v11}, Llo/a;->D(Landroid/media/MediaFormat;Ljava/util/List;)V

    const-string v11, "max-input-size"

    invoke-static {v9, v11, v8}, Llo/a;->x(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    const/16 v8, 0x17

    if-lt v4, v8, :cond_6

    const-string v11, "priority"

    invoke-virtual {v9, v11, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const/high16 v6, -0x40800000    # -1.0f

    cmpl-float v6, v0, v6

    if-eqz v6, :cond_6

    if-ne v4, v8, :cond_5

    sget-object v6, Llo/y;->d:Ljava/lang/String;

    const-string v8, "ZTE B2017G"

    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    const-string v8, "AXON 7 mini"

    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_3

    :cond_5
    const-string v6, "operating-rate"

    invoke-virtual {v9, v6, v0}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    :cond_6
    :goto_3
    const/16 v0, 0x1c

    if-gt v4, v0, :cond_7

    const-string v0, "audio/ac4"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "ac4-is-sync"

    invoke-virtual {v9, v0, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_7
    const-string v0, "audio/raw"

    if-lt v4, v5, :cond_8

    iget v5, p2, Lrm/c0;->Y:I

    new-instance v6, Lrm/b0;

    invoke-direct {v6}, Lrm/b0;-><init>()V

    iput-object v0, v6, Lrm/b0;->k:Ljava/lang/String;

    iput v5, v6, Lrm/b0;->x:I

    iput v2, v6, Lrm/b0;->y:I

    const/4 v2, 0x4

    iput v2, v6, Lrm/b0;->z:I

    new-instance v5, Lrm/c0;

    invoke-direct {v5, v6}, Lrm/c0;-><init>(Lrm/b0;)V

    iget-object v6, p0, Ltm/v;->g1:Ltm/s;

    invoke-virtual {v6, v5}, Ltm/s;->g(Lrm/c0;)I

    move-result v5

    const/4 v6, 0x2

    if-ne v5, v6, :cond_8

    const-string v5, "pcm-encoding"

    invoke-virtual {v9, v5, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_8
    const/16 v2, 0x20

    if-lt v4, v2, :cond_9

    const-string v2, "max-output-channel-count"

    const/16 v4, 0x63

    invoke-virtual {v9, v2, v4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_9
    iget-object v2, p1, Lhn/l;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    move-object v0, p2

    goto :goto_4

    :cond_a
    const/4 v0, 0x0

    :goto_4
    iput-object v0, p0, Ltm/v;->j1:Lrm/c0;

    new-instance v0, Lhn/i;

    const/4 v4, 0x0

    move-object v1, p1

    move-object v3, p2

    move-object v5, p3

    move-object v2, v9

    invoke-direct/range {v0 .. v5}, Lhn/i;-><init>(Lhn/l;Landroid/media/MediaFormat;Lrm/c0;Landroid/view/Surface;Landroid/media/MediaCrypto;)V

    return-object v0
.end method

.method public final S(Ljava/lang/Exception;)V
    .locals 4

    const-string v0, "MediaCodecAudioRenderer"

    const-string v1, "Audio codec error"

    invoke-static {v0, v1, p1}, Llo/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Ltm/v;->f1:Lq3/i;

    iget-object v1, v0, Lq3/i;->w:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    if-eqz v1, :cond_0

    new-instance v2, Ltm/i;

    const/4 v3, 0x3

    invoke-direct {v2, v0, p1, v3}, Ltm/i;-><init>(Lq3/i;Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final T(JJLjava/lang/String;)V
    .locals 8

    iget-object v1, p0, Ltm/v;->f1:Lq3/i;

    iget-object v0, v1, Lq3/i;->w:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Landroid/os/Handler;

    if-eqz v7, :cond_0

    new-instance v0, Ltm/i;

    move-wide v3, p1

    move-wide v5, p3

    move-object v2, p5

    invoke-direct/range {v0 .. v6}, Ltm/i;-><init>(Lq3/i;Ljava/lang/String;JJ)V

    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final U(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Ltm/v;->f1:Lq3/i;

    iget-object v1, v0, Lq3/i;->w:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    if-eqz v1, :cond_0

    new-instance v2, Ltm/i;

    const/4 v3, 0x0

    invoke-direct {v2, v0, p1, v3}, Ltm/i;-><init>(Lq3/i;Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final V(Lxl/a;)Lum/d;
    .locals 4

    invoke-super {p0, p1}, Lhn/n;->V(Lxl/a;)Lum/d;

    move-result-object v0

    iget-object p1, p1, Lxl/a;->y:Ljava/lang/Object;

    check-cast p1, Lrm/c0;

    iget-object v1, p0, Ltm/v;->f1:Lq3/i;

    iget-object v2, v1, Lq3/i;->w:Ljava/lang/Object;

    check-cast v2, Landroid/os/Handler;

    if-eqz v2, :cond_0

    new-instance v3, Ltm/i;

    invoke-direct {v3, v1, p1, v0}, Ltm/i;-><init>(Lq3/i;Lrm/c0;Lum/d;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-object v0
.end method

.method public final W(Lrm/c0;Landroid/media/MediaFormat;)V
    .locals 6

    iget-object v0, p0, Ltm/v;->j1:Lrm/c0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move-object p1, v0

    goto/16 :goto_2

    :cond_0
    iget-object v0, p0, Lhn/n;->i0:Lhn/k;

    if-nez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    iget-object v0, p1, Lrm/c0;->L:Ljava/lang/String;

    iget v3, p1, Lrm/c0;->Y:I

    const-string v4, "audio/raw"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p1, Lrm/c0;->a0:I

    goto :goto_0

    :cond_2
    sget v0, Llo/y;->a:I

    const/16 v5, 0x18

    if-lt v0, v5, :cond_3

    const-string v0, "pcm-encoding"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "v-bits-per-sample"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Llo/y;->q(I)I

    move-result v0

    goto :goto_0

    :cond_4
    const/4 v0, 0x2

    :goto_0
    new-instance v5, Lrm/b0;

    invoke-direct {v5}, Lrm/b0;-><init>()V

    iput-object v4, v5, Lrm/b0;->k:Ljava/lang/String;

    iput v0, v5, Lrm/b0;->z:I

    iget v0, p1, Lrm/c0;->b0:I

    iput v0, v5, Lrm/b0;->A:I

    iget p1, p1, Lrm/c0;->c0:I

    iput p1, v5, Lrm/b0;->B:I

    const-string p1, "channel-count"

    invoke-virtual {p2, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p1

    iput p1, v5, Lrm/b0;->x:I

    const-string p1, "sample-rate"

    invoke-virtual {p2, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p1

    iput p1, v5, Lrm/b0;->y:I

    new-instance p1, Lrm/c0;

    invoke-direct {p1, v5}, Lrm/c0;-><init>(Lrm/b0;)V

    iget-boolean p2, p0, Ltm/v;->i1:Z

    if-eqz p2, :cond_5

    iget p2, p1, Lrm/c0;->Y:I

    const/4 v0, 0x6

    if-ne p2, v0, :cond_5

    if-ge v3, v0, :cond_5

    new-array v2, v3, [I

    move p2, v1

    :goto_1
    if-ge p2, v3, :cond_5

    aput p2, v2, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    :try_start_0
    iget-object p2, p0, Ltm/v;->g1:Ltm/s;

    invoke-virtual {p2, p1, v2}, Ltm/s;->b(Lrm/c0;[I)V
    :try_end_0
    .catch Lcom/google/android/exoplayer2/audio/AudioSink$ConfigurationException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p1, Lcom/google/android/exoplayer2/audio/AudioSink$ConfigurationException;->w:Lrm/c0;

    const/16 v0, 0x1389

    invoke-virtual {p0, p1, p2, v1, v0}, Lrm/d;->e(Ljava/lang/Exception;Lrm/c0;ZI)Lcom/google/android/exoplayer2/ExoPlaybackException;

    move-result-object p1

    throw p1
.end method

.method public final Y()V
    .locals 2

    iget-object v0, p0, Ltm/v;->g1:Ltm/s;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ltm/s;->G:Z

    return-void
.end method

.method public final Z(Lum/c;)V
    .locals 4

    iget-boolean v0, p0, Ltm/v;->l1:Z

    if-eqz v0, :cond_1

    const/high16 v0, -0x80000000

    invoke-virtual {p1, v0}, La9/a;->f(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v0, p1, Lum/c;->F:J

    iget-wide v2, p0, Ltm/v;->k1:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v2, 0x7a120

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p1, Lum/c;->F:J

    iput-wide v0, p0, Ltm/v;->k1:J

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Ltm/v;->l1:Z

    :cond_1
    return-void
.end method

.method public final a(ILjava/lang/Object;)V
    .locals 2

    const/4 v0, 0x2

    iget-object v1, p0, Ltm/v;->g1:Ltm/s;

    if-eq p1, v0, :cond_7

    const/4 v0, 0x3

    if-eq p1, v0, :cond_4

    const/4 v0, 0x6

    if-eq p1, v0, :cond_1

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    check-cast p2, Lrm/v;

    iput-object p2, p0, Ltm/v;->o1:Lrm/v;

    return-void

    :pswitch_1
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget p2, v1, Ltm/s;->W:I

    if-eq p2, p1, :cond_a

    iput p1, v1, Ltm/s;->W:I

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v1, Ltm/s;->V:Z

    invoke-virtual {v1}, Ltm/s;->d()V

    return-void

    :pswitch_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v1}, Ltm/s;->h()Ltm/r;

    move-result-object p2

    iget-object p2, p2, Ltm/r;->a:Lrm/w0;

    invoke-virtual {v1, p2, p1}, Ltm/s;->s(Lrm/w0;Z)V

    return-void

    :cond_1
    check-cast p2, Ltm/l;

    iget-object p1, v1, Ltm/s;->X:Ltm/l;

    invoke-virtual {p1, p2}, Ltm/l;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, v1, Ltm/s;->u:Landroid/media/AudioTrack;

    if-eqz p1, :cond_3

    iget-object p1, v1, Ltm/s;->X:Ltm/l;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_3
    iput-object p2, v1, Ltm/s;->X:Ltm/l;

    return-void

    :cond_4
    check-cast p2, Ltm/d;

    iget-object p1, v1, Ltm/s;->v:Ltm/d;

    invoke-virtual {p1, p2}, Ltm/d;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_5
    iput-object p2, v1, Ltm/s;->v:Ltm/d;

    iget-boolean p1, v1, Ltm/s;->Y:Z

    if-eqz p1, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {v1}, Ltm/s;->d()V

    return-void

    :cond_7
    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget p2, v1, Ltm/s;->J:F

    cmpl-float p2, p2, p1

    if-eqz p2, :cond_a

    iput p1, v1, Ltm/s;->J:F

    invoke-virtual {v1}, Ltm/s;->n()Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_1

    :cond_8
    sget p1, Llo/y;->a:I

    const/16 p2, 0x15

    if-lt p1, p2, :cond_9

    iget-object p1, v1, Ltm/s;->u:Landroid/media/AudioTrack;

    iget p2, v1, Ltm/s;->J:F

    invoke-virtual {p1, p2}, Landroid/media/AudioTrack;->setVolume(F)I

    return-void

    :cond_9
    iget-object p1, v1, Ltm/s;->u:Landroid/media/AudioTrack;

    iget p2, v1, Ltm/s;->J:F

    invoke-virtual {p1, p2, p2}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    :cond_a
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Lrm/w0;
    .locals 2

    iget-object v0, p0, Ltm/v;->g1:Ltm/s;

    iget-boolean v1, v0, Ltm/s;->k:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Ltm/s;->y:Lrm/w0;

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ltm/s;->h()Ltm/r;

    move-result-object v0

    iget-object v0, v0, Ltm/r;->a:Lrm/w0;

    return-object v0
.end method

.method public final b0(JJLhn/k;Ljava/nio/ByteBuffer;IIIJZZLrm/c0;)Z
    .locals 0

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Ltm/v;->j1:Lrm/c0;

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_0

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p5, p7, p3}, Lhn/k;->releaseOutputBuffer(IZ)V

    return p2

    :cond_0
    iget-object p1, p0, Ltm/v;->g1:Ltm/s;

    if-eqz p12, :cond_2

    if-eqz p5, :cond_1

    invoke-interface {p5, p7, p3}, Lhn/k;->releaseOutputBuffer(IZ)V

    :cond_1
    iget-object p3, p0, Lhn/n;->Z0:Lb9/g;

    iget p4, p3, Lb9/g;->g:I

    add-int/2addr p4, p9

    iput p4, p3, Lb9/g;->g:I

    iput-boolean p2, p1, Ltm/s;->G:Z

    return p2

    :cond_2
    :try_start_0
    invoke-virtual {p1, p6, p10, p11, p9}, Ltm/s;->k(Ljava/nio/ByteBuffer;JI)Z

    move-result p1
    :try_end_0
    .catch Lcom/google/android/exoplayer2/audio/AudioSink$InitializationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/exoplayer2/audio/AudioSink$WriteException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_4

    if-eqz p5, :cond_3

    invoke-interface {p5, p7, p3}, Lhn/k;->releaseOutputBuffer(IZ)V

    :cond_3
    iget-object p1, p0, Lhn/n;->Z0:Lb9/g;

    iget p3, p1, Lb9/g;->f:I

    add-int/2addr p3, p9

    iput p3, p1, Lb9/g;->f:I

    return p2

    :cond_4
    return p3

    :catch_0
    move-exception p1

    iget-boolean p2, p1, Lcom/google/android/exoplayer2/audio/AudioSink$WriteException;->w:Z

    const/16 p3, 0x138a

    invoke-virtual {p0, p1, p14, p2, p3}, Lrm/d;->e(Ljava/lang/Exception;Lrm/c0;ZI)Lcom/google/android/exoplayer2/ExoPlaybackException;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    iget-boolean p2, p1, Lcom/google/android/exoplayer2/audio/AudioSink$InitializationException;->w:Z

    const/16 p3, 0x1389

    iget-object p4, p1, Lcom/google/android/exoplayer2/audio/AudioSink$InitializationException;->x:Lrm/c0;

    invoke-virtual {p0, p1, p4, p2, p3}, Lrm/d;->e(Ljava/lang/Exception;Lrm/c0;ZI)Lcom/google/android/exoplayer2/ExoPlaybackException;

    move-result-object p1

    throw p1
.end method

.method public final c()J
    .locals 2

    iget v0, p0, Lrm/d;->F:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Ltm/v;->q0()V

    :cond_0
    iget-wide v0, p0, Ltm/v;->k1:J

    return-wide v0
.end method

.method public final e0()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Ltm/v;->g1:Ltm/s;

    iget-boolean v1, v0, Ltm/s;->S:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ltm/s;->n()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ltm/s;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ltm/s;->p()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Ltm/s;->S:Z
    :try_end_0
    .catch Lcom/google/android/exoplayer2/audio/AudioSink$WriteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/audio/AudioSink$WriteException;->w:Z

    const/16 v2, 0x138a

    iget-object v3, v0, Lcom/google/android/exoplayer2/audio/AudioSink$WriteException;->x:Lrm/c0;

    invoke-virtual {p0, v0, v3, v1, v2}, Lrm/d;->e(Ljava/lang/Exception;Lrm/c0;ZI)Lcom/google/android/exoplayer2/ExoPlaybackException;

    move-result-object v0

    throw v0
.end method

.method public final f(Lrm/w0;)V
    .locals 5

    iget-object v0, p0, Ltm/v;->g1:Ltm/s;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lrm/w0;

    iget v2, p1, Lrm/w0;->w:F

    const v3, 0x3dcccccd    # 0.1f

    const/high16 v4, 0x41000000    # 8.0f

    invoke-static {v2, v3, v4}, Llo/y;->g(FFF)F

    move-result v2

    iget p1, p1, Lrm/w0;->x:F

    invoke-static {p1, v3, v4}, Llo/y;->g(FFF)F

    move-result p1

    invoke-direct {v1, v2, p1}, Lrm/w0;-><init>(FF)V

    iget-boolean p1, v0, Ltm/s;->k:Z

    if-eqz p1, :cond_0

    sget p1, Llo/y;->a:I

    const/16 v2, 0x17

    if-lt p1, v2, :cond_0

    invoke-virtual {v0, v1}, Ltm/s;->t(Lrm/w0;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Ltm/s;->h()Ltm/r;

    move-result-object p1

    iget-boolean p1, p1, Ltm/r;->b:Z

    invoke-virtual {v0, v1, p1}, Ltm/s;->s(Lrm/w0;Z)V

    return-void
.end method

.method public final g()Llo/l;
    .locals 0

    return-object p0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    const-string v0, "MediaCodecAudioRenderer"

    return-object v0
.end method

.method public final j()Z
    .locals 2

    iget-boolean v0, p0, Lhn/n;->V0:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ltm/v;->g1:Ltm/s;

    invoke-virtual {v0}, Ltm/s;->n()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, v0, Ltm/s;->S:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ltm/s;->l()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final j0(Lrm/c0;)Z
    .locals 1

    iget-object v0, p0, Ltm/v;->g1:Ltm/s;

    invoke-virtual {v0, p1}, Ltm/s;->g(Lrm/c0;)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, Ltm/v;->g1:Ltm/s;

    invoke-virtual {v0}, Ltm/s;->l()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0}, Lhn/n;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final k0(Lhn/o;Lrm/c0;)I
    .locals 13

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lrm/d;->d(III)I

    move-result v2

    iget-object v3, p2, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {v3}, Llo/m;->h(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v1, v1, v1}, Lrm/d;->d(III)I

    move-result p1

    return p1

    :cond_0
    sget v3, Llo/y;->a:I

    const/16 v4, 0x15

    if-lt v3, v4, :cond_1

    const/16 v3, 0x20

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_0
    iget v4, p2, Lrm/c0;->e0:I

    if-eqz v4, :cond_2

    move v5, v0

    goto :goto_1

    :cond_2
    move v5, v1

    :goto_1
    const/4 v6, 0x2

    if-eqz v4, :cond_4

    if-ne v4, v6, :cond_3

    goto :goto_2

    :cond_3
    move v4, v1

    goto :goto_3

    :cond_4
    :goto_2
    move v4, v0

    :goto_3
    const-string v7, "audio/raw"

    const/16 v8, 0x8

    const/4 v9, 0x4

    iget-object v10, p0, Ltm/v;->g1:Ltm/s;

    if-eqz v4, :cond_7

    invoke-virtual {v10, p2}, Ltm/s;->g(Lrm/c0;)I

    move-result v11

    if-eqz v11, :cond_7

    if-eqz v5, :cond_6

    invoke-static {v7, v1, v1}, Lhn/u;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_5

    const/4 v5, 0x0

    goto :goto_4

    :cond_5
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lhn/l;

    :goto_4
    if-eqz v5, :cond_7

    :cond_6
    invoke-static {v9, v8, v3}, Lrm/d;->d(III)I

    move-result p1

    return p1

    :cond_7
    iget-object v5, p2, Lrm/c0;->L:Ljava/lang/String;

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-virtual {v10, p2}, Ltm/s;->g(Lrm/c0;)I

    move-result v5

    if-eqz v5, :cond_11

    :cond_8
    iget v5, p2, Lrm/c0;->Y:I

    iget v11, p2, Lrm/c0;->Z:I

    new-instance v12, Lrm/b0;

    invoke-direct {v12}, Lrm/b0;-><init>()V

    iput-object v7, v12, Lrm/b0;->k:Ljava/lang/String;

    iput v5, v12, Lrm/b0;->x:I

    iput v11, v12, Lrm/b0;->y:I

    iput v6, v12, Lrm/b0;->z:I

    new-instance v5, Lrm/c0;

    invoke-direct {v5, v12}, Lrm/c0;-><init>(Lrm/b0;)V

    invoke-virtual {v10, v5}, Ltm/s;->g(Lrm/c0;)I

    move-result v5

    if-eqz v5, :cond_11

    invoke-static {p1, p2, v1, v10}, Ltm/v;->p0(Lhn/o;Lrm/c0;ZLtm/s;)Lzr/g0;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_9

    goto :goto_9

    :cond_9
    if-nez v4, :cond_a

    invoke-static {v6, v1, v1}, Lrm/d;->d(III)I

    move-result p1

    return p1

    :cond_a
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhn/l;

    invoke-virtual {v2, p2}, Lhn/l;->c(Lrm/c0;)Z

    move-result v4

    if-nez v4, :cond_c

    move v5, v0

    :goto_5
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_c

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lhn/l;

    invoke-virtual {v6, p2}, Lhn/l;->c(Lrm/c0;)Z

    move-result v7

    if-eqz v7, :cond_b

    move p1, v1

    move-object v2, v6

    goto :goto_6

    :cond_b
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_c
    move p1, v0

    move v0, v4

    :goto_6
    if-eqz v0, :cond_d

    goto :goto_7

    :cond_d
    const/4 v9, 0x3

    :goto_7
    if-eqz v0, :cond_e

    invoke-virtual {v2, p2}, Lhn/l;->d(Lrm/c0;)Z

    move-result p2

    if-eqz p2, :cond_e

    const/16 v8, 0x10

    :cond_e
    iget-boolean p2, v2, Lhn/l;->g:Z

    if-eqz p2, :cond_f

    const/16 p2, 0x40

    goto :goto_8

    :cond_f
    move p2, v1

    :goto_8
    if-eqz p1, :cond_10

    const/16 v1, 0x80

    :cond_10
    or-int p1, v9, v8

    or-int/2addr p1, v3

    or-int/2addr p1, p2

    or-int/2addr p1, v1

    return p1

    :cond_11
    :goto_9
    return v2
.end method

.method public final l()V
    .locals 6

    iget-object v0, p0, Ltm/v;->f1:Lq3/i;

    const/4 v1, 0x1

    iput-boolean v1, p0, Ltm/v;->n1:Z

    const/4 v1, 0x0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, 0x0

    :try_start_0
    iget-object v5, p0, Ltm/v;->g1:Ltm/s;

    invoke-virtual {v5}, Ltm/s;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iput-object v4, p0, Lhn/n;->Z:Lrm/c0;

    iput-wide v2, p0, Lhn/n;->a1:J

    iput-wide v2, p0, Lhn/n;->b1:J

    iput v1, p0, Lhn/n;->c1:I

    invoke-virtual {p0}, Lhn/n;->H()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v1, p0, Lhn/n;->Z0:Lb9/g;

    invoke-virtual {v0, v1}, Lq3/i;->g(Lb9/g;)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lhn/n;->Z0:Lb9/g;

    invoke-virtual {v0, v2}, Lq3/i;->g(Lb9/g;)V

    throw v1

    :catchall_1
    move-exception v5

    :try_start_2
    iput-object v4, p0, Lhn/n;->Z:Lrm/c0;

    iput-wide v2, p0, Lhn/n;->a1:J

    iput-wide v2, p0, Lhn/n;->b1:J

    iput v1, p0, Lhn/n;->c1:I

    invoke-virtual {p0}, Lhn/n;->H()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    iget-object v1, p0, Lhn/n;->Z0:Lb9/g;

    invoke-virtual {v0, v1}, Lq3/i;->g(Lb9/g;)V

    throw v5

    :catchall_2
    move-exception v1

    iget-object v2, p0, Lhn/n;->Z0:Lb9/g;

    invoke-virtual {v0, v2}, Lq3/i;->g(Lb9/g;)V

    throw v1
.end method

.method public final m(ZZ)V
    .locals 3

    new-instance p1, Lb9/g;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lb9/g;-><init>(I)V

    iput-object p1, p0, Lhn/n;->Z0:Lb9/g;

    iget-object p2, p0, Ltm/v;->f1:Lq3/i;

    iget-object v0, p2, Lq3/i;->w:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Ltm/i;

    const/4 v2, 0x5

    invoke-direct {v1, p2, p1, v2}, Ltm/i;-><init>(Lq3/i;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p0, Lrm/d;->y:Lrm/g1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean p1, p1, Lrm/g1;->a:Z

    const/4 p2, 0x0

    iget-object v0, p0, Ltm/v;->g1:Ltm/s;

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p1, Llo/y;->a:I

    const/16 v1, 0x15

    const/4 v2, 0x1

    if-lt p1, v1, :cond_1

    move p2, v2

    :cond_1
    invoke-static {p2}, Llo/a;->i(Z)V

    iget-boolean p1, v0, Ltm/s;->V:Z

    invoke-static {p1}, Llo/a;->i(Z)V

    iget-boolean p1, v0, Ltm/s;->Y:Z

    if-nez p1, :cond_3

    iput-boolean v2, v0, Ltm/s;->Y:Z

    invoke-virtual {v0}, Ltm/s;->d()V

    goto :goto_0

    :cond_2
    iget-boolean p1, v0, Ltm/s;->Y:Z

    if-eqz p1, :cond_3

    iput-boolean p2, v0, Ltm/s;->Y:Z

    invoke-virtual {v0}, Ltm/s;->d()V

    :cond_3
    :goto_0
    iget-object p1, p0, Lrm/d;->E:Lsm/f;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, Ltm/s;->q:Lsm/f;

    return-void
.end method

.method public final n(JZ)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lhn/n;->n(JZ)V

    iget-object p3, p0, Ltm/v;->g1:Ltm/s;

    invoke-virtual {p3}, Ltm/s;->d()V

    iput-wide p1, p0, Ltm/v;->k1:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Ltm/v;->l1:Z

    iput-boolean p1, p0, Ltm/v;->m1:Z

    return-void
.end method

.method public final o()V
    .locals 5

    iget-object v0, p0, Ltm/v;->g1:Ltm/s;

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0}, Lhn/n;->C()V

    invoke-virtual {p0}, Lhn/n;->d0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v3, p0, Lhn/n;->c0:Lty/c;

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v2}, Lty/c;->u(Lsn/z;)V

    :goto_0
    iput-object v2, p0, Lhn/n;->c0:Lty/c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-boolean v2, p0, Ltm/v;->n1:Z

    if-eqz v2, :cond_1

    iput-boolean v1, p0, Ltm/v;->n1:Z

    invoke-virtual {v0}, Ltm/s;->r()V

    :cond_1
    return-void

    :catchall_0
    move-exception v2

    goto :goto_1

    :catchall_1
    move-exception v3

    :try_start_2
    iget-object v4, p0, Lhn/n;->c0:Lty/c;

    if-eqz v4, :cond_2

    invoke-virtual {v4, v2}, Lty/c;->u(Lsn/z;)V

    :cond_2
    iput-object v2, p0, Lhn/n;->c0:Lty/c;

    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    iget-boolean v3, p0, Ltm/v;->n1:Z

    if-eqz v3, :cond_3

    iput-boolean v1, p0, Ltm/v;->n1:Z

    invoke-virtual {v0}, Ltm/s;->r()V

    :cond_3
    throw v2
.end method

.method public final o0(Lhn/l;Lrm/c0;)I
    .locals 1

    const-string v0, "OMX.google.raw.decoder"

    iget-object p1, p1, Lhn/l;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget p1, Llo/y;->a:I

    const/16 v0, 0x18

    if-ge p1, v0, :cond_1

    const/16 v0, 0x17

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ltm/v;->e1:Landroid/content/Context;

    invoke-static {p1}, Llo/y;->y(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    const/4 p1, -0x1

    return p1

    :cond_1
    iget p1, p2, Lrm/c0;->M:I

    return p1
.end method

.method public final p()V
    .locals 2

    const/4 v0, 0x1

    iget-object v1, p0, Ltm/v;->g1:Ltm/s;

    iput-boolean v0, v1, Ltm/s;->U:Z

    invoke-virtual {v1}, Ltm/s;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v1, Ltm/s;->i:Ltm/k;

    iget-object v0, v0, Ltm/k;->f:Ld9/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ld9/l;->a()V

    iget-object v0, v1, Ltm/s;->u:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    :cond_0
    return-void
.end method

.method public final q()V
    .locals 7

    invoke-virtual {p0}, Ltm/v;->q0()V

    iget-object v0, p0, Ltm/v;->g1:Ltm/s;

    const/4 v1, 0x0

    iput-boolean v1, v0, Ltm/s;->U:Z

    invoke-virtual {v0}, Ltm/s;->n()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Ltm/s;->i:Ltm/k;

    const-wide/16 v3, 0x0

    iput-wide v3, v2, Ltm/k;->l:J

    iput v1, v2, Ltm/k;->w:I

    iput v1, v2, Ltm/k;->v:I

    iput-wide v3, v2, Ltm/k;->m:J

    iput-wide v3, v2, Ltm/k;->C:J

    iput-wide v3, v2, Ltm/k;->F:J

    iput-boolean v1, v2, Ltm/k;->k:Z

    iget-wide v3, v2, Ltm/k;->x:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v3, v5

    if-nez v1, :cond_0

    iget-object v1, v2, Ltm/k;->f:Ld9/l;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ld9/l;->a()V

    iget-object v0, v0, Ltm/s;->u:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    :cond_0
    return-void
.end method

.method public final q0()V
    .locals 39

    move-object/from16 v0, p0

    invoke-virtual {v0}, Ltm/v;->j()Z

    move-result v1

    iget-object v2, v0, Ltm/v;->g1:Ltm/s;

    iget-object v3, v2, Ltm/s;->b:Lq30/w0;

    invoke-virtual {v2}, Ltm/s;->n()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-boolean v4, v2, Ltm/s;->H:Z

    if-eqz v4, :cond_1

    :cond_0
    const-wide/high16 v18, -0x8000000000000000L

    goto/16 :goto_11

    :cond_1
    iget-object v4, v2, Ltm/s;->i:Ltm/k;

    iget-object v8, v4, Ltm/k;->a:Lq30/u0;

    iget-object v8, v8, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v8, Ltm/s;

    iget-object v9, v4, Ltm/k;->c:Landroid/media/AudioTrack;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v9}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v9

    const-wide/32 v16, 0xf4240

    const-wide/high16 v18, -0x8000000000000000L

    const-wide/16 v10, 0x0

    const/4 v6, 0x1

    const/4 v12, 0x3

    if-ne v9, v12, :cond_1a

    iget-object v9, v4, Ltm/k;->b:[J

    invoke-virtual {v4}, Ltm/k;->a()J

    move-result-wide v20

    mul-long v20, v20, v16

    iget v13, v4, Ltm/k;->g:I

    const-wide/16 v22, 0x3e8

    int-to-long v14, v13

    div-long v13, v20, v14

    cmp-long v15, v13, v10

    if-nez v15, :cond_2

    move/from16 v36, v1

    move-object/from16 v26, v2

    move-object/from16 v25, v3

    move-object/from16 v24, v8

    goto/16 :goto_8

    :cond_2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v20

    move-object/from16 v24, v8

    div-long v7, v20, v22

    move-wide/from16 v25, v13

    iget-wide v12, v4, Ltm/k;->m:J

    sub-long v12, v7, v12

    const-wide/16 v27, 0x7530

    cmp-long v12, v12, v27

    if-ltz v12, :cond_4

    iget v12, v4, Ltm/k;->v:I

    sub-long v13, v25, v7

    aput-wide v13, v9, v12

    add-int/2addr v12, v6

    const/16 v13, 0xa

    rem-int/2addr v12, v13

    iput v12, v4, Ltm/k;->v:I

    iget v12, v4, Ltm/k;->w:I

    if-ge v12, v13, :cond_3

    add-int/2addr v12, v6

    iput v12, v4, Ltm/k;->w:I

    :cond_3
    iput-wide v7, v4, Ltm/k;->m:J

    iput-wide v10, v4, Ltm/k;->l:J

    const/4 v12, 0x0

    :goto_0
    iget v13, v4, Ltm/k;->w:I

    if-ge v12, v13, :cond_4

    iget-wide v10, v4, Ltm/k;->l:J

    aget-wide v29, v9, v12

    int-to-long v13, v13

    div-long v29, v29, v13

    add-long v10, v29, v10

    iput-wide v10, v4, Ltm/k;->l:J

    add-int/lit8 v12, v12, 0x1

    const-wide/16 v10, 0x0

    goto :goto_0

    :cond_4
    iget-boolean v9, v4, Ltm/k;->h:Z

    if-eqz v9, :cond_5

    move/from16 v36, v1

    move-object/from16 v26, v2

    move-object/from16 v25, v3

    goto/16 :goto_8

    :cond_5
    iget-object v9, v4, Ltm/k;->f:Ld9/l;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v10, v9, Ld9/l;->g:Ljava/lang/Object;

    check-cast v10, Ltm/j;

    if-eqz v10, :cond_11

    iget-object v14, v10, Ltm/j;->b:Landroid/media/AudioTimestamp;

    const-wide/32 v29, 0x7a120

    iget-wide v11, v9, Ld9/l;->e:J

    sub-long v11, v7, v11

    iget-wide v5, v9, Ld9/l;->d:J

    cmp-long v5, v11, v5

    if-gez v5, :cond_6

    goto/16 :goto_2

    :cond_6
    iput-wide v7, v9, Ld9/l;->e:J

    iget-object v5, v10, Ltm/j;->a:Landroid/media/AudioTrack;

    invoke-virtual {v5, v14}, Landroid/media/AudioTrack;->getTimestamp(Landroid/media/AudioTimestamp;)Z

    move-result v5

    if-eqz v5, :cond_8

    iget-wide v11, v14, Landroid/media/AudioTimestamp;->framePosition:J

    move-object/from16 v31, v14

    iget-wide v13, v10, Ltm/j;->d:J

    cmp-long v13, v13, v11

    if-lez v13, :cond_7

    iget-wide v13, v10, Ltm/j;->c:J

    const-wide/16 v32, 0x1

    add-long v13, v13, v32

    iput-wide v13, v10, Ltm/j;->c:J

    :cond_7
    iput-wide v11, v10, Ltm/j;->d:J

    iget-wide v13, v10, Ltm/j;->c:J

    const/16 v32, 0x20

    shl-long v13, v13, v32

    add-long/2addr v11, v13

    iput-wide v11, v10, Ltm/j;->e:J

    goto :goto_1

    :cond_8
    move-object/from16 v31, v14

    :goto_1
    iget v11, v9, Ld9/l;->b:I

    if-eqz v11, :cond_e

    const/4 v12, 0x1

    if-eq v11, v12, :cond_c

    const/4 v12, 0x2

    if-eq v11, v12, :cond_b

    const/4 v12, 0x3

    if-eq v11, v12, :cond_a

    const/4 v6, 0x4

    if-ne v11, v6, :cond_9

    goto :goto_3

    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_a
    if-eqz v5, :cond_12

    invoke-virtual {v9}, Ld9/l;->a()V

    goto :goto_3

    :cond_b
    if-nez v5, :cond_12

    invoke-virtual {v9}, Ld9/l;->a()V

    goto :goto_3

    :cond_c
    if-eqz v5, :cond_d

    iget-wide v11, v10, Ltm/j;->e:J

    iget-wide v13, v9, Ld9/l;->f:J

    cmp-long v11, v11, v13

    if-lez v11, :cond_12

    const/4 v12, 0x2

    invoke-virtual {v9, v12}, Ld9/l;->b(I)V

    goto :goto_3

    :cond_d
    invoke-virtual {v9}, Ld9/l;->a()V

    goto :goto_3

    :cond_e
    if-eqz v5, :cond_10

    move-object/from16 v11, v31

    iget-wide v11, v11, Landroid/media/AudioTimestamp;->nanoTime:J

    div-long v11, v11, v22

    iget-wide v13, v9, Ld9/l;->c:J

    cmp-long v11, v11, v13

    if-ltz v11, :cond_f

    iget-wide v11, v10, Ltm/j;->e:J

    iput-wide v11, v9, Ld9/l;->f:J

    const/4 v12, 0x1

    invoke-virtual {v9, v12}, Ld9/l;->b(I)V

    goto :goto_3

    :cond_f
    :goto_2
    const/4 v5, 0x0

    goto :goto_3

    :cond_10
    iget-wide v11, v9, Ld9/l;->c:J

    sub-long v11, v7, v11

    cmp-long v11, v11, v29

    if-lez v11, :cond_12

    const/4 v12, 0x3

    invoke-virtual {v9, v12}, Ld9/l;->b(I)V

    goto :goto_3

    :cond_11
    const-wide/32 v29, 0x7a120

    goto :goto_2

    :cond_12
    :goto_3
    const-string v13, "DefaultAudioSink"

    if-nez v5, :cond_13

    move/from16 v36, v1

    move-object/from16 v26, v2

    move-object/from16 v25, v3

    move-wide v14, v7

    const-wide/32 v31, 0x4c4b40

    goto/16 :goto_6

    :cond_13
    if-eqz v10, :cond_14

    iget-object v5, v10, Ltm/j;->b:Landroid/media/AudioTimestamp;

    const-wide/32 v31, 0x4c4b40

    iget-wide v11, v5, Landroid/media/AudioTimestamp;->nanoTime:J

    div-long v11, v11, v22

    goto :goto_4

    :cond_14
    const-wide/32 v31, 0x4c4b40

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    :goto_4
    move-wide/from16 v33, v7

    if-eqz v10, :cond_15

    iget-wide v6, v10, Ltm/j;->e:J

    move-wide v7, v6

    goto :goto_5

    :cond_15
    const-wide/16 v7, -0x1

    :goto_5
    sub-long v35, v11, v33

    invoke-static/range {v35 .. v36}, Ljava/lang/Math;->abs(J)J

    move-result-wide v35

    cmp-long v6, v35, v31

    const-string v10, ", "

    if-lez v6, :cond_16

    invoke-virtual/range {v24 .. v24}, Ltm/s;->i()J

    move-result-wide v5

    invoke-virtual/range {v24 .. v24}, Ltm/s;->j()J

    move-result-wide v14

    move/from16 v36, v1

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v0, 0xb4

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Spurious audio timestamp (system clock mismatch): "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-wide/from16 v7, v33

    invoke-static {v1, v10, v7, v8, v10}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    move-wide/from16 v11, v25

    invoke-virtual {v1, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-static {v1, v10, v5, v6, v10}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    invoke-virtual {v1, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v13, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v6, 0x4

    invoke-virtual {v9, v6}, Ld9/l;->b(I)V

    move-object/from16 v26, v2

    move-object/from16 v25, v3

    move-wide v14, v7

    goto :goto_6

    :cond_16
    move/from16 v36, v1

    move-wide/from16 v0, v25

    move-wide/from16 v14, v33

    mul-long v25, v7, v16

    iget v5, v4, Ltm/k;->g:I

    move-wide/from16 v33, v7

    int-to-long v6, v5

    div-long v25, v25, v6

    sub-long v25, v25, v0

    invoke-static/range {v25 .. v26}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    cmp-long v5, v5, v31

    if-lez v5, :cond_17

    invoke-virtual/range {v24 .. v24}, Ltm/s;->i()J

    move-result-wide v5

    invoke-virtual/range {v24 .. v24}, Ltm/s;->j()J

    move-result-wide v7

    move-object/from16 v25, v3

    new-instance v3, Ljava/lang/StringBuilder;

    move-object/from16 v26, v2

    const/16 v2, 0xb6

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Spurious audio timestamp (frame position mismatch): "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v37, v7

    move-wide/from16 v7, v33

    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-static {v3, v10, v14, v15, v10}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-static {v3, v10, v5, v6, v10}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    move-wide/from16 v0, v37

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v13, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v6, 0x4

    invoke-virtual {v9, v6}, Ld9/l;->b(I)V

    goto :goto_6

    :cond_17
    move-object/from16 v26, v2

    move-object/from16 v25, v3

    const/4 v6, 0x4

    iget v0, v9, Ld9/l;->b:I

    if-ne v0, v6, :cond_18

    invoke-virtual {v9}, Ld9/l;->a()V

    :cond_18
    :goto_6
    iget-boolean v0, v4, Ltm/k;->q:Z

    if-eqz v0, :cond_1b

    iget-object v0, v4, Ltm/k;->n:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_1b

    iget-wide v1, v4, Ltm/k;->r:J

    sub-long v7, v14, v1

    cmp-long v1, v7, v29

    if-ltz v1, :cond_1b

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, v4, Ltm/k;->c:Landroid/media/AudioTrack;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    sget v2, Llo/y;->a:I

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    mul-long v2, v2, v22

    iget-wide v5, v4, Ltm/k;->i:J

    sub-long/2addr v2, v5

    iput-wide v2, v4, Ltm/k;->o:J

    const-wide/16 v5, 0x0

    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, v4, Ltm/k;->o:J

    cmp-long v0, v2, v31

    if-lez v0, :cond_19

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v5, 0x3d

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Ignoring impossibly large audio latency: "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v13, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v5, 0x0

    iput-wide v5, v4, Ltm/k;->o:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_7

    :catch_0
    iput-object v1, v4, Ltm/k;->n:Ljava/lang/reflect/Method;

    :cond_19
    :goto_7
    iput-wide v14, v4, Ltm/k;->r:J

    goto :goto_8

    :cond_1a
    move/from16 v36, v1

    move-object/from16 v26, v2

    move-object/from16 v25, v3

    move-object/from16 v24, v8

    const-wide/16 v22, 0x3e8

    :cond_1b
    :goto_8
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    div-long v0, v0, v22

    iget-object v2, v4, Ltm/k;->f:Ld9/l;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v2, Ld9/l;->b:I

    const/4 v12, 0x2

    if-ne v3, v12, :cond_1c

    const/4 v12, 0x1

    goto :goto_9

    :cond_1c
    const/4 v12, 0x0

    :goto_9
    if-eqz v12, :cond_1f

    iget-object v2, v2, Ld9/l;->g:Ljava/lang/Object;

    check-cast v2, Ltm/j;

    if-eqz v2, :cond_1d

    iget-wide v10, v2, Ltm/j;->e:J

    goto :goto_a

    :cond_1d
    const-wide/16 v10, -0x1

    :goto_a
    mul-long v10, v10, v16

    iget v3, v4, Ltm/k;->g:I

    int-to-long v5, v3

    div-long/2addr v10, v5

    if-eqz v2, :cond_1e

    iget-object v2, v2, Ltm/j;->b:Landroid/media/AudioTimestamp;

    iget-wide v2, v2, Landroid/media/AudioTimestamp;->nanoTime:J

    div-long v2, v2, v22

    goto :goto_b

    :cond_1e
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    :goto_b
    sub-long v2, v0, v2

    iget v5, v4, Ltm/k;->j:F

    invoke-static {v5, v2, v3}, Llo/y;->p(FJ)J

    move-result-wide v2

    add-long/2addr v2, v10

    goto :goto_d

    :cond_1f
    iget v2, v4, Ltm/k;->w:I

    if-nez v2, :cond_20

    invoke-virtual {v4}, Ltm/k;->a()J

    move-result-wide v2

    mul-long v2, v2, v16

    iget v5, v4, Ltm/k;->g:I

    int-to-long v5, v5

    div-long/2addr v2, v5

    goto :goto_c

    :cond_20
    iget-wide v2, v4, Ltm/k;->l:J

    add-long/2addr v2, v0

    :goto_c
    if-nez v36, :cond_21

    iget-wide v5, v4, Ltm/k;->o:J

    sub-long/2addr v2, v5

    const-wide/16 v5, 0x0

    invoke-static {v5, v6, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    :cond_21
    :goto_d
    iget-boolean v5, v4, Ltm/k;->D:Z

    if-eq v5, v12, :cond_22

    iget-wide v5, v4, Ltm/k;->C:J

    iput-wide v5, v4, Ltm/k;->F:J

    iget-wide v5, v4, Ltm/k;->B:J

    iput-wide v5, v4, Ltm/k;->E:J

    :cond_22
    iget-wide v5, v4, Ltm/k;->F:J

    sub-long v5, v0, v5

    cmp-long v7, v5, v16

    if-gez v7, :cond_23

    iget-wide v7, v4, Ltm/k;->E:J

    iget v9, v4, Ltm/k;->j:F

    invoke-static {v9, v5, v6}, Llo/y;->p(FJ)J

    move-result-wide v9

    add-long/2addr v9, v7

    mul-long v5, v5, v22

    div-long v5, v5, v16

    mul-long/2addr v2, v5

    sub-long v14, v22, v5

    mul-long/2addr v14, v9

    add-long/2addr v14, v2

    div-long v2, v14, v22

    :cond_23
    iget-boolean v5, v4, Ltm/k;->k:Z

    if-nez v5, :cond_24

    iget-wide v5, v4, Ltm/k;->B:J

    cmp-long v7, v2, v5

    if-lez v7, :cond_24

    const/4 v7, 0x1

    iput-boolean v7, v4, Ltm/k;->k:Z

    sub-long v5, v2, v5

    invoke-static {v5, v6}, Llo/y;->G(J)J

    move-result-wide v5

    iget v7, v4, Ltm/k;->j:F

    invoke-static {v7, v5, v6}, Llo/y;->s(FJ)J

    move-result-wide v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-static {v5, v6}, Llo/y;->G(J)J

    move-result-wide v5

    sub-long/2addr v7, v5

    move-object/from16 v5, v24

    iget-object v5, v5, Ltm/s;->r:Lq30/u0;

    if-eqz v5, :cond_24

    iget-object v5, v5, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v5, Ltm/v;

    iget-object v5, v5, Ltm/v;->f1:Lq3/i;

    iget-object v6, v5, Lq3/i;->w:Ljava/lang/Object;

    check-cast v6, Landroid/os/Handler;

    if-eqz v6, :cond_24

    new-instance v9, Ltm/i;

    invoke-direct {v9, v5, v7, v8}, Ltm/i;-><init>(Lq3/i;J)V

    invoke-virtual {v6, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_24
    iput-wide v0, v4, Ltm/k;->C:J

    iput-wide v2, v4, Ltm/k;->B:J

    iput-boolean v12, v4, Ltm/k;->D:Z

    move-object/from16 v0, v26

    iget-object v1, v0, Ltm/s;->t:Ltm/q;

    invoke-virtual {v0}, Ltm/s;->j()J

    move-result-wide v4

    mul-long v4, v4, v16

    iget v1, v1, Ltm/q;->e:I

    int-to-long v6, v1

    div-long/2addr v4, v6

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    iget-object v3, v0, Ltm/s;->j:Ljava/util/ArrayDeque;

    :goto_e
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_25

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ltm/r;

    iget-wide v4, v4, Ltm/r;->d:J

    cmp-long v4, v1, v4

    if-ltz v4, :cond_25

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ltm/r;

    iput-object v4, v0, Ltm/s;->x:Ltm/r;

    goto :goto_e

    :cond_25
    iget-object v4, v0, Ltm/s;->x:Ltm/r;

    iget-wide v5, v4, Ltm/r;->d:J

    sub-long v7, v1, v5

    iget-object v4, v4, Ltm/r;->a:Lrm/w0;

    sget-object v5, Lrm/w0;->z:Lrm/w0;

    invoke-virtual {v4, v5}, Lrm/w0;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_26

    iget-object v1, v0, Ltm/s;->x:Ltm/r;

    iget-wide v1, v1, Ltm/r;->c:J

    add-long/2addr v1, v7

    move-object/from16 v4, v25

    goto :goto_10

    :cond_26
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_29

    move-object/from16 v4, v25

    iget-object v1, v4, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v1, Ltm/z;

    iget-wide v2, v1, Ltm/z;->o:J

    const-wide/16 v5, 0x400

    cmp-long v2, v2, v5

    if-ltz v2, :cond_28

    iget-wide v2, v1, Ltm/z;->n:J

    iget-object v5, v1, Ltm/z;->j:Ltm/y;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v6, v5, Ltm/y;->k:I

    iget v5, v5, Ltm/y;->b:I

    mul-int/2addr v6, v5

    const/16 v21, 0x2

    mul-int/lit8 v6, v6, 0x2

    int-to-long v5, v6

    sub-long v9, v2, v5

    iget-object v2, v1, Ltm/z;->h:Ltm/g;

    iget v2, v2, Ltm/g;->a:I

    iget-object v3, v1, Ltm/z;->g:Ltm/g;

    iget v3, v3, Ltm/g;->a:I

    if-ne v2, v3, :cond_27

    iget-wide v11, v1, Ltm/z;->o:J

    invoke-static/range {v7 .. v12}, Llo/y;->D(JJJ)J

    move-result-wide v1

    goto :goto_f

    :cond_27
    int-to-long v5, v2

    mul-long/2addr v9, v5

    iget-wide v1, v1, Ltm/z;->o:J

    int-to-long v5, v3

    mul-long v11, v1, v5

    invoke-static/range {v7 .. v12}, Llo/y;->D(JJJ)J

    move-result-wide v1

    goto :goto_f

    :cond_28
    iget v1, v1, Ltm/z;->c:F

    float-to-double v1, v1

    long-to-double v5, v7

    mul-double/2addr v1, v5

    double-to-long v1, v1

    :goto_f
    iget-object v3, v0, Ltm/s;->x:Ltm/r;

    iget-wide v5, v3, Ltm/r;->c:J

    add-long/2addr v1, v5

    goto :goto_10

    :cond_29
    move-object/from16 v4, v25

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ltm/r;

    iget-wide v5, v3, Ltm/r;->d:J

    sub-long/2addr v5, v1

    iget-object v1, v0, Ltm/s;->x:Ltm/r;

    iget-object v1, v1, Ltm/r;->a:Lrm/w0;

    iget v1, v1, Lrm/w0;->w:F

    invoke-static {v1, v5, v6}, Llo/y;->p(FJ)J

    move-result-wide v1

    iget-wide v5, v3, Ltm/r;->c:J

    sub-long v1, v5, v1

    :goto_10
    iget-object v0, v0, Ltm/s;->t:Ltm/q;

    iget-object v3, v4, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v3, Ltm/x;

    iget-wide v3, v3, Ltm/x;->t:J

    mul-long v3, v3, v16

    iget v0, v0, Ltm/q;->e:I

    int-to-long v5, v0

    div-long/2addr v3, v5

    add-long/2addr v3, v1

    goto :goto_12

    :goto_11
    move-wide/from16 v3, v18

    :goto_12
    cmp-long v0, v3, v18

    if-eqz v0, :cond_2b

    move-object/from16 v0, p0

    iget-boolean v1, v0, Ltm/v;->m1:Z

    if-eqz v1, :cond_2a

    goto :goto_13

    :cond_2a
    iget-wide v1, v0, Ltm/v;->k1:J

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    :goto_13
    iput-wide v3, v0, Ltm/v;->k1:J

    const/4 v15, 0x0

    iput-boolean v15, v0, Ltm/v;->m1:Z

    goto :goto_14

    :cond_2b
    move-object/from16 v0, p0

    :goto_14
    return-void
.end method
