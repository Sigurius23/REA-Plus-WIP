.class public final Ld9/a0;
.super Li9/o;
.source "SourceFile"

# interfaces
.implements Lb9/p0;


# instance fields
.field public final c1:Landroid/content/Context;

.field public final d1:Lio/sentry/internal/debugmeta/c;

.field public final e1:Ld9/x;

.field public final f1:Li9/i;

.field public g1:I

.field public h1:Z

.field public i1:Z

.field public j1:Lu8/p;

.field public k1:Lu8/p;

.field public l1:J

.field public m1:Z

.field public n1:Z

.field public o1:Z

.field public p1:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Li9/j;Landroid/os/Handler;Lb9/c0;Ld9/x;)V
    .locals 3

    sget v0, Lx8/t;->a:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_0

    new-instance v0, Li9/i;

    invoke-direct {v0}, Li9/i;-><init>()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    const v2, 0x472c4400    # 44100.0f

    invoke-direct {p0, v1, p2, v2}, Li9/o;-><init>(ILi9/j;F)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ld9/a0;->c1:Landroid/content/Context;

    iput-object p5, p0, Ld9/a0;->e1:Ld9/x;

    iput-object v0, p0, Ld9/a0;->f1:Li9/i;

    const/16 p1, -0x3e8

    iput p1, p0, Ld9/a0;->p1:I

    new-instance p1, Lio/sentry/internal/debugmeta/c;

    const/16 p2, 0xa

    invoke-direct {p1, p2, p3, p4}, Lio/sentry/internal/debugmeta/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Ld9/a0;->d1:Lio/sentry/internal/debugmeta/c;

    new-instance p1, Lro/i;

    const/16 p2, 0x1a

    invoke-direct {p1, p0, p2}, Lro/i;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p5, Ld9/x;->r:Lro/i;

    return-void
.end method


# virtual methods
.method public final D(Li9/m;Lu8/p;Lu8/p;)Lb9/h;
    .locals 8

    invoke-virtual {p1, p2, p3}, Li9/m;->b(Lu8/p;Lu8/p;)Lb9/h;

    move-result-object v0

    iget v1, v0, Lb9/h;->e:I

    iget-object v2, p0, Li9/o;->e0:Le10/k0;

    if-nez v2, :cond_0

    invoke-virtual {p0, p3}, Ld9/a0;->r0(Lu8/p;)Z

    move-result v2

    if-eqz v2, :cond_0

    const v2, 0x8000

    or-int/2addr v1, v2

    :cond_0
    invoke-virtual {p0, p1, p3}, Ld9/a0;->x0(Li9/m;Lu8/p;)I

    move-result v2

    iget v3, p0, Ld9/a0;->g1:I

    if-le v2, v3, :cond_1

    or-int/lit8 v1, v1, 0x40

    :cond_1
    move v7, v1

    new-instance v2, Lb9/h;

    iget-object v3, p1, Li9/m;->a:Ljava/lang/String;

    if-eqz v7, :cond_2

    const/4 p1, 0x0

    :goto_0
    move v6, p1

    move-object v4, p2

    move-object v5, p3

    goto :goto_1

    :cond_2
    iget p1, v0, Lb9/h;->d:I

    goto :goto_0

    :goto_1
    invoke-direct/range {v2 .. v7}, Lb9/h;-><init>(Ljava/lang/String;Lu8/p;Lu8/p;II)V

    return-object v2
.end method

.method public final O(F[Lu8/p;)F
    .locals 5

    array-length v0, p2

    const/4 v1, -0x1

    const/4 v2, 0x0

    move v3, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v4, p2, v2

    iget v4, v4, Lu8/p;->E:I

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

.method public final P(Li9/h;Lu8/p;Z)Ljava/util/ArrayList;
    .locals 3

    iget-object v0, p2, Lu8/p;->n:Ljava/lang/String;

    if-nez v0, :cond_0

    sget-object p1, Lzr/w0;->E:Lzr/w0;

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ld9/a0;->e1:Ld9/x;

    invoke-virtual {v0, p2}, Ld9/x;->i(Lu8/p;)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const-string v0, "audio/raw"

    invoke-static {v0, v1, v1}, Li9/s;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li9/m;

    :goto_0
    if-eqz v0, :cond_2

    invoke-static {v0}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-static {p1, p2, p3, v1}, Li9/s;->g(Li9/h;Lu8/p;ZZ)Lzr/w0;

    move-result-object p1

    :goto_1
    sget-object p3, Li9/s;->a:Ljava/util/HashMap;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance p1, Lhn/p;

    const/4 v0, 0x2

    invoke-direct {p1, p2, v0}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lea2/l;

    const/4 v0, 0x4

    invoke-direct {p2, p1, v0}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    invoke-static {p3, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object p3
.end method

.method public final Q(Li9/m;Lu8/p;Landroid/media/MediaCrypto;F)La30/w0;
    .locals 12

    move/from16 v0, p4

    iget-object v2, p0, Lb9/f;->J:[Lu8/p;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p0 .. p2}, Ld9/a0;->x0(Li9/m;Lu8/p;)I

    move-result v4

    iget-object v5, p1, Li9/m;->a:Ljava/lang/String;

    array-length v6, v2

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-ne v6, v8, :cond_0

    goto :goto_1

    :cond_0
    array-length v6, v2

    move v9, v7

    :goto_0
    if-ge v9, v6, :cond_2

    aget-object v10, v2, v9

    invoke-virtual {p1, p2, v10}, Li9/m;->b(Lu8/p;Lu8/p;)Lb9/h;

    move-result-object v11

    iget v11, v11, Lb9/h;->d:I

    if-eqz v11, :cond_1

    invoke-virtual {p0, p1, v10}, Ld9/a0;->x0(Li9/m;Lu8/p;)I

    move-result v10

    invoke-static {v4, v10}, Ljava/lang/Math;->max(II)I

    move-result v4

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    iput v4, p0, Ld9/a0;->g1:I

    sget v2, Lx8/t;->a:I

    const/16 v4, 0x18

    if-ge v2, v4, :cond_4

    const-string v6, "OMX.SEC.aac.dec"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const-string v6, "samsung"

    sget-object v9, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    sget-object v6, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v9, "zeroflte"

    invoke-virtual {v6, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_3

    const-string v9, "herolte"

    invoke-virtual {v6, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_3

    const-string v9, "heroqlte"

    invoke-virtual {v6, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    :cond_3
    move v6, v8

    goto :goto_2

    :cond_4
    move v6, v7

    :goto_2
    iput-boolean v6, p0, Ld9/a0;->h1:Z

    const-string v6, "OMX.google.opus.decoder"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    const-string v6, "c2.android.opus.decoder"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    const-string v6, "OMX.google.vorbis.decoder"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    const-string v6, "c2.android.vorbis.decoder"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_3

    :cond_5
    move v5, v7

    goto :goto_4

    :cond_6
    :goto_3
    move v5, v8

    :goto_4
    iput-boolean v5, p0, Ld9/a0;->i1:Z

    iget-object v5, p1, Li9/m;->c:Ljava/lang/String;

    iget v6, p0, Ld9/a0;->g1:I

    new-instance v9, Landroid/media/MediaFormat;

    invoke-direct {v9}, Landroid/media/MediaFormat;-><init>()V

    const-string v10, "mime"

    invoke-virtual {v9, v10, v5}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    iget v5, p2, Lu8/p;->D:I

    iget-object v10, p2, Lu8/p;->n:Ljava/lang/String;

    const-string v11, "channel-count"

    invoke-virtual {v9, v11, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget v5, p2, Lu8/p;->E:I

    const-string v11, "sample-rate"

    invoke-virtual {v9, v11, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget-object v11, p2, Lu8/p;->q:Ljava/util/List;

    invoke-static {v9, v11}, Lx8/a;->t(Landroid/media/MediaFormat;Ljava/util/List;)V

    const-string v11, "max-input-size"

    invoke-static {v9, v11, v6}, Lx8/a;->p(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    const/16 v6, 0x17

    if-lt v2, v6, :cond_8

    const-string v11, "priority"

    invoke-virtual {v9, v11, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const/high16 v11, -0x40800000    # -1.0f

    cmpl-float v11, v0, v11

    if-eqz v11, :cond_8

    if-ne v2, v6, :cond_7

    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v11, "ZTE B2017G"

    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_8

    const-string v11, "AXON 7 mini"

    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    goto :goto_5

    :cond_7
    const-string v6, "operating-rate"

    invoke-virtual {v9, v6, v0}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    :cond_8
    :goto_5
    const/16 v0, 0x1c

    if-gt v2, v0, :cond_9

    const-string v0, "audio/ac4"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "ac4-is-sync"

    invoke-virtual {v9, v0, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_9
    const-string v0, "audio/raw"

    if-lt v2, v4, :cond_a

    iget v4, p2, Lu8/p;->D:I

    new-instance v6, Lu8/o;

    invoke-direct {v6}, Lu8/o;-><init>()V

    invoke-static {v0}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v6, Lu8/o;->m:Ljava/lang/String;

    iput v4, v6, Lu8/o;->C:I

    iput v5, v6, Lu8/o;->D:I

    const/4 v4, 0x4

    iput v4, v6, Lu8/o;->E:I

    new-instance v5, Lu8/p;

    invoke-direct {v5, v6}, Lu8/p;-><init>(Lu8/o;)V

    iget-object v6, p0, Ld9/a0;->e1:Ld9/x;

    invoke-virtual {v6, v5}, Ld9/x;->i(Lu8/p;)I

    move-result v5

    const/4 v6, 0x2

    if-ne v5, v6, :cond_a

    const-string v5, "pcm-encoding"

    invoke-virtual {v9, v5, v4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_a
    const/16 v4, 0x20

    if-lt v2, v4, :cond_b

    const-string v4, "max-output-channel-count"

    const/16 v5, 0x63

    invoke-virtual {v9, v4, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_b
    const/16 v4, 0x23

    if-lt v2, v4, :cond_c

    iget v2, p0, Ld9/a0;->p1:I

    neg-int v2, v2

    invoke-static {v7, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    const-string v4, "importance"

    invoke-virtual {v9, v4, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_c
    iget-object v2, p1, Li9/m;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    move-object v0, p2

    goto :goto_6

    :cond_d
    const/4 v0, 0x0

    :goto_6
    iput-object v0, p0, Ld9/a0;->k1:Lu8/p;

    new-instance v0, La30/w0;

    const/4 v4, 0x0

    const/4 v7, 0x6

    iget-object v6, p0, Ld9/a0;->f1:Li9/i;

    move-object v1, p1

    move-object v3, p2

    move-object v5, p3

    move-object v2, v9

    invoke-direct/range {v0 .. v7}, La30/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object v0
.end method

.method public final R(La9/e;)V
    .locals 4

    sget v0, Lx8/t;->a:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    iget-object v0, p1, La9/e;->y:Lu8/p;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lu8/p;->n:Ljava/lang/String;

    const-string v1, "audio/opus"

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Li9/o;->G0:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, La9/e;->H:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, La9/e;->y:Lu8/p;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p1, Lu8/p;->G:I

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v0

    const-wide/32 v2, 0xbb80

    mul-long/2addr v0, v2

    const-wide/32 v2, 0x3b9aca00

    div-long/2addr v0, v2

    long-to-int v0, v0

    iget-object v1, p0, Ld9/a0;->e1:Ld9/x;

    invoke-virtual {v1, p1, v0}, Ld9/x;->w(II)V

    :cond_0
    return-void
.end method

.method public final X(Ljava/lang/Exception;)V
    .locals 4

    const-string v0, "MediaCodecAudioRenderer"

    const-string v1, "Audio codec error"

    invoke-static {v0, v1, p1}, Lx8/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Ld9/a0;->d1:Lio/sentry/internal/debugmeta/c;

    iget-object v1, v0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    if-eqz v1, :cond_0

    new-instance v2, Ld9/h;

    const/4 v3, 0x0

    invoke-direct {v2, v0, p1, v3}, Ld9/h;-><init>(Lio/sentry/internal/debugmeta/c;Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final Y(JJLjava/lang/String;)V
    .locals 8

    iget-object v1, p0, Ld9/a0;->d1:Lio/sentry/internal/debugmeta/c;

    iget-object v0, v1, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Landroid/os/Handler;

    if-eqz v7, :cond_0

    new-instance v0, Ld9/h;

    move-wide v3, p1

    move-wide v5, p3

    move-object v2, p5

    invoke-direct/range {v0 .. v6}, Ld9/h;-><init>(Lio/sentry/internal/debugmeta/c;Ljava/lang/String;JJ)V

    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final Z(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Ld9/a0;->d1:Lio/sentry/internal/debugmeta/c;

    iget-object v1, v0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    if-eqz v1, :cond_0

    new-instance v2, Ld9/h;

    const/4 v3, 0x4

    invoke-direct {v2, v0, p1, v3}, Ld9/h;-><init>(Lio/sentry/internal/debugmeta/c;Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final a(ILjava/lang/Object;)V
    .locals 8

    const/4 v0, 0x2

    iget-object v1, p0, Ld9/a0;->e1:Ld9/x;

    if-eq p1, v0, :cond_13

    const/4 v0, 0x3

    if-eq p1, v0, :cond_f

    const/4 v0, 0x6

    if-eq p1, v0, :cond_c

    const/16 v0, 0xc

    if-eq p1, v0, :cond_8

    const/16 v0, 0x10

    const/4 v2, 0x0

    const/16 v3, 0x23

    if-eq p1, v0, :cond_6

    const/16 v0, 0x9

    if-eq p1, v0, :cond_3

    const/16 v0, 0xa

    if-eq p1, v0, :cond_0

    const/16 v0, 0xb

    if-ne p1, v0, :cond_14

    check-cast p2, Lb9/h0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p2, p0, Li9/o;->f0:Lb9/h0;

    return-void

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget p2, v1, Ld9/x;->X:I

    if-eq p2, p1, :cond_2

    iput p1, v1, Ld9/x;->X:I

    if-eqz p1, :cond_1

    const/4 v2, 0x1

    :cond_1
    iput-boolean v2, v1, Ld9/x;->W:Z

    invoke-virtual {v1}, Ld9/x;->g()V

    :cond_2
    sget p2, Lx8/t;->a:I

    if-lt p2, v3, :cond_14

    iget-object p2, p0, Ld9/a0;->f1:Li9/i;

    if-eqz p2, :cond_14

    invoke-virtual {p2, p1}, Li9/i;->d(I)V

    return-void

    :cond_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v1, Ld9/x;->D:Z

    invoke-virtual {v1}, Ld9/x;->y()Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lu8/e0;->d:Lu8/e0;

    :goto_0
    move-object v3, p1

    goto :goto_1

    :cond_4
    iget-object p1, v1, Ld9/x;->C:Lu8/e0;

    goto :goto_0

    :goto_1
    new-instance v2, Ld9/r;

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct/range {v2 .. v7}, Ld9/r;-><init>(Lu8/e0;JJ)V

    invoke-virtual {v1}, Ld9/x;->o()Z

    move-result p1

    if-eqz p1, :cond_5

    iput-object v2, v1, Ld9/x;->A:Ld9/r;

    return-void

    :cond_5
    iput-object v2, v1, Ld9/x;->B:Ld9/r;

    return-void

    :cond_6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Ld9/a0;->p1:I

    iget-object p1, p0, Li9/o;->k0:Li9/k;

    if-nez p1, :cond_7

    goto/16 :goto_4

    :cond_7
    sget p2, Lx8/t;->a:I

    if-lt p2, v3, :cond_14

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    iget v0, p0, Ld9/a0;->p1:I

    neg-int v0, v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const-string v1, "importance"

    invoke-virtual {p2, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-interface {p1, p2}, Li9/k;->setParameters(Landroid/os/Bundle;)V

    return-void

    :cond_8
    sget p1, Lx8/t;->a:I

    const/16 v0, 0x17

    if-lt p1, v0, :cond_14

    check-cast p2, Landroid/media/AudioDeviceInfo;

    const/4 p1, 0x0

    if-nez p2, :cond_9

    move-object v0, p1

    goto :goto_2

    :cond_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lro/i;

    const/16 v2, 0x18

    invoke-direct {v0, p2, v2}, Lro/i;-><init>(Ljava/lang/Object;I)V

    :goto_2
    iput-object v0, v1, Ld9/x;->Z:Lro/i;

    iget-object v0, v1, Ld9/x;->x:Ld30/h;

    if-eqz v0, :cond_a

    invoke-virtual {v0, p2}, Ld30/h;->c(Landroid/media/AudioDeviceInfo;)V

    :cond_a
    iget-object p2, v1, Ld9/x;->v:Landroid/media/AudioTrack;

    if-eqz p2, :cond_14

    iget-object v0, v1, Ld9/x;->Z:Lro/i;

    if-nez v0, :cond_b

    goto :goto_3

    :cond_b
    iget-object p1, v0, Lro/i;->x:Ljava/lang/Object;

    check-cast p1, Landroid/media/AudioDeviceInfo;

    :goto_3
    invoke-virtual {p2, p1}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    return-void

    :cond_c
    check-cast p2, Lu8/e;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, v1, Ld9/x;->Y:Lu8/e;

    invoke-virtual {p1, p2}, Lu8/e;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    goto :goto_4

    :cond_d
    iget-object p1, v1, Ld9/x;->v:Landroid/media/AudioTrack;

    if-eqz p1, :cond_e

    iget-object p1, v1, Ld9/x;->Y:Lu8/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_e
    iput-object p2, v1, Ld9/x;->Y:Lu8/e;

    return-void

    :cond_f
    check-cast p2, Lu8/d;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, v1, Ld9/x;->z:Lu8/d;

    invoke-virtual {p1, p2}, Lu8/d;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_10

    goto :goto_4

    :cond_10
    iput-object p2, v1, Ld9/x;->z:Lu8/d;

    iget-boolean p1, v1, Ld9/x;->a0:Z

    if-eqz p1, :cond_11

    goto :goto_4

    :cond_11
    iget-object p1, v1, Ld9/x;->x:Ld30/h;

    if-eqz p1, :cond_12

    iput-object p2, p1, Ld30/h;->j:Ljava/lang/Object;

    iget-object v0, p1, Ld30/h;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v2, p1, Ld30/h;->i:Ljava/lang/Object;

    check-cast v2, Lro/i;

    invoke-static {v0, p2, v2}, Ld9/b;->c(Landroid/content/Context;Lu8/d;Lro/i;)Ld9/b;

    move-result-object p2

    invoke-virtual {p1, p2}, Ld30/h;->b(Ld9/b;)V

    :cond_12
    invoke-virtual {v1}, Ld9/x;->g()V

    return-void

    :cond_13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget p2, v1, Ld9/x;->O:F

    cmpl-float p2, p2, p1

    if-eqz p2, :cond_14

    iput p1, v1, Ld9/x;->O:F

    invoke-virtual {v1}, Ld9/x;->o()Z

    move-result p1

    if-eqz p1, :cond_14

    iget-object p1, v1, Ld9/x;->v:Landroid/media/AudioTrack;

    iget p2, v1, Ld9/x;->O:F

    invoke-virtual {p1, p2}, Landroid/media/AudioTrack;->setVolume(F)I

    :cond_14
    :goto_4
    return-void
.end method

.method public final a0(Lqg3/d;)Lb9/h;
    .locals 4

    iget-object v0, p1, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v0, Lu8/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v0, p0, Ld9/a0;->j1:Lu8/p;

    invoke-super {p0, p1}, Li9/o;->a0(Lqg3/d;)Lb9/h;

    move-result-object p1

    iget-object v1, p0, Ld9/a0;->d1:Lio/sentry/internal/debugmeta/c;

    iget-object v2, v1, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v2, Landroid/os/Handler;

    if-eqz v2, :cond_0

    new-instance v3, Ld9/h;

    invoke-direct {v3, v1, v0, p1}, Ld9/h;-><init>(Lio/sentry/internal/debugmeta/c;Lu8/p;Lb9/h;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-object p1
.end method

.method public final b()Lu8/e0;
    .locals 1

    iget-object v0, p0, Ld9/a0;->e1:Ld9/x;

    iget-object v0, v0, Ld9/x;->C:Lu8/e0;

    return-object v0
.end method

.method public final b0(Lu8/p;Landroid/media/MediaFormat;)V
    .locals 8

    iget-object v0, p0, Ld9/a0;->k1:Lu8/p;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    move-object p1, v0

    goto/16 :goto_2

    :cond_0
    iget-object v0, p0, Li9/o;->k0:Li9/k;

    if-nez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p1, Lu8/p;->n:Ljava/lang/String;

    iget v4, p1, Lu8/p;->D:I

    const-string v5, "audio/raw"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v6, 0x2

    if-eqz v0, :cond_2

    iget v0, p1, Lu8/p;->F:I

    goto :goto_0

    :cond_2
    sget v0, Lx8/t;->a:I

    const/16 v7, 0x18

    if-lt v0, v7, :cond_3

    const-string v0, "pcm-encoding"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "v-bits-per-sample"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lx8/t;->w(I)I

    move-result v0

    goto :goto_0

    :cond_4
    move v0, v6

    :goto_0
    new-instance v7, Lu8/o;

    invoke-direct {v7}, Lu8/o;-><init>()V

    invoke-static {v5}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v7, Lu8/o;->m:Ljava/lang/String;

    iput v0, v7, Lu8/o;->E:I

    iget v0, p1, Lu8/p;->G:I

    iput v0, v7, Lu8/o;->F:I

    iget v0, p1, Lu8/p;->H:I

    iput v0, v7, Lu8/o;->G:I

    iget-object v0, p1, Lu8/p;->l:Lu8/c0;

    iput-object v0, v7, Lu8/o;->k:Lu8/c0;

    iget-object v0, p1, Lu8/p;->a:Ljava/lang/String;

    iput-object v0, v7, Lu8/o;->a:Ljava/lang/String;

    iget-object v0, p1, Lu8/p;->b:Ljava/lang/String;

    iput-object v0, v7, Lu8/o;->b:Ljava/lang/String;

    iget-object v0, p1, Lu8/p;->c:Lzr/g0;

    invoke-static {v0}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object v0

    iput-object v0, v7, Lu8/o;->c:Lzr/g0;

    iget-object v0, p1, Lu8/p;->d:Ljava/lang/String;

    iput-object v0, v7, Lu8/o;->d:Ljava/lang/String;

    iget v0, p1, Lu8/p;->e:I

    iput v0, v7, Lu8/o;->e:I

    iget p1, p1, Lu8/p;->f:I

    iput p1, v7, Lu8/o;->f:I

    const-string p1, "channel-count"

    invoke-virtual {p2, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p1

    iput p1, v7, Lu8/o;->C:I

    const-string p1, "sample-rate"

    invoke-virtual {p2, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p1

    iput p1, v7, Lu8/o;->D:I

    new-instance p1, Lu8/p;

    invoke-direct {p1, v7}, Lu8/p;-><init>(Lu8/o;)V

    iget-boolean p2, p0, Ld9/a0;->h1:Z

    const/4 v0, 0x6

    iget v5, p1, Lu8/p;->D:I

    if-eqz p2, :cond_5

    if-ne v5, v0, :cond_5

    if-ge v4, v0, :cond_5

    new-array v3, v4, [I

    move p2, v2

    :goto_1
    if-ge p2, v4, :cond_b

    aput p2, v3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_5
    iget-boolean p2, p0, Ld9/a0;->i1:Z

    if-eqz p2, :cond_b

    const/4 p2, 0x3

    if-eq v5, p2, :cond_a

    const/4 v4, 0x5

    if-eq v5, v4, :cond_9

    if-eq v5, v0, :cond_8

    const/4 p2, 0x7

    if-eq v5, p2, :cond_7

    const/16 p2, 0x8

    if-eq v5, p2, :cond_6

    goto :goto_2

    :cond_6
    new-array v3, p2, [I

    fill-array-data v3, :array_0

    goto :goto_2

    :cond_7
    new-array v3, p2, [I

    fill-array-data v3, :array_1

    goto :goto_2

    :cond_8
    new-array v3, v0, [I

    fill-array-data v3, :array_2

    goto :goto_2

    :cond_9
    const/4 v0, 0x4

    filled-new-array {v2, v6, v1, p2, v0}, [I

    move-result-object v3

    goto :goto_2

    :cond_a
    filled-new-array {v2, v6, v1}, [I

    move-result-object v3

    :cond_b
    :goto_2
    :try_start_0
    sget p2, Lx8/t;->a:I
    :try_end_0
    .catch Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v0, 0x1d

    iget-object v4, p0, Ld9/a0;->e1:Ld9/x;

    if-lt p2, v0, :cond_f

    :try_start_1
    iget-boolean v5, p0, Li9/o;->G0:Z

    if-eqz v5, :cond_d

    iget-object v5, p0, Lb9/f;->z:Lb9/i1;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v5, v5, Lb9/i1;->a:I

    if-eqz v5, :cond_d

    iget-object v5, p0, Lb9/f;->z:Lb9/i1;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v5, v5, Lb9/i1;->a:I

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-lt p2, v0, :cond_c

    goto :goto_3

    :cond_c
    move v1, v2

    :goto_3
    invoke-static {v1}, Lva3/g;->i(Z)V

    iput v5, v4, Ld9/x;->j:I

    goto :goto_5

    :catch_0
    move-exception p1

    goto :goto_6

    :cond_d
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-lt p2, v0, :cond_e

    goto :goto_4

    :cond_e
    move v1, v2

    :goto_4
    invoke-static {v1}, Lva3/g;->i(Z)V

    iput v2, v4, Ld9/x;->j:I

    :cond_f
    :goto_5
    invoke-virtual {v4, p1, v3}, Ld9/x;->d(Lu8/p;[I)V
    :try_end_1
    .catch Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :goto_6
    iget-object p2, p1, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;->w:Lu8/p;

    const/16 v0, 0x1389

    invoke-virtual {p0, p1, p2, v2, v0}, Lb9/f;->g(Ljava/lang/Exception;Lu8/p;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    move-result-object p1

    throw p1

    nop

    :array_0
    .array-data 4
        0x0
        0x2
        0x1
        0x7
        0x5
        0x6
        0x3
        0x4
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x2
        0x1
        0x6
        0x5
        0x3
        0x4
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x2
        0x1
        0x5
        0x3
        0x4
    .end array-data
.end method

.method public final c()J
    .locals 2

    iget v0, p0, Lb9/f;->H:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Ld9/a0;->y0()V

    :cond_0
    iget-wide v0, p0, Ld9/a0;->l1:J

    return-wide v0
.end method

.method public final c0()V
    .locals 1

    iget-object v0, p0, Ld9/a0;->e1:Ld9/x;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final d(Lu8/e0;)V
    .locals 8

    iget-object v0, p0, Ld9/a0;->e1:Ld9/x;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lu8/e0;

    iget v2, p1, Lu8/e0;->a:F

    const v3, 0x3dcccccd    # 0.1f

    const/high16 v4, 0x41000000    # 8.0f

    invoke-static {v2, v3, v4}, Lx8/t;->f(FFF)F

    move-result v2

    iget v5, p1, Lu8/e0;->b:F

    invoke-static {v5, v3, v4}, Lx8/t;->f(FFF)F

    move-result v3

    invoke-direct {v1, v2, v3}, Lu8/e0;-><init>(FF)V

    iput-object v1, v0, Ld9/x;->C:Lu8/e0;

    invoke-virtual {v0}, Ld9/x;->y()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ld9/x;->v()V

    return-void

    :cond_0
    new-instance v2, Ld9/r;

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-object v3, p1

    invoke-direct/range {v2 .. v7}, Ld9/r;-><init>(Lu8/e0;JJ)V

    invoke-virtual {v0}, Ld9/x;->o()Z

    move-result p1

    if-eqz p1, :cond_1

    iput-object v2, v0, Ld9/x;->A:Ld9/r;

    return-void

    :cond_1
    iput-object v2, v0, Ld9/x;->B:Ld9/r;

    return-void
.end method

.method public final e()Z
    .locals 2

    iget-boolean v0, p0, Ld9/a0;->o1:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Ld9/a0;->o1:Z

    return v0
.end method

.method public final e0()V
    .locals 2

    iget-object v0, p0, Ld9/a0;->e1:Ld9/x;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ld9/x;->L:Z

    return-void
.end method

.method public final h0(JJLi9/k;Ljava/nio/ByteBuffer;IIIJZZLu8/p;)Z
    .locals 0

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Ld9/a0;->k1:Lu8/p;

    const/4 p2, 0x1

    if-eqz p1, :cond_0

    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_0

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p5, p7}, Li9/k;->i(I)V

    return p2

    :cond_0
    iget-object p1, p0, Ld9/a0;->e1:Ld9/x;

    if-eqz p12, :cond_2

    if-eqz p5, :cond_1

    invoke-interface {p5, p7}, Li9/k;->i(I)V

    :cond_1
    iget-object p3, p0, Li9/o;->X0:Lb9/g;

    iget p4, p3, Lb9/g;->g:I

    add-int/2addr p4, p9

    iput p4, p3, Lb9/g;->g:I

    iput-boolean p2, p1, Ld9/x;->L:Z

    return p2

    :cond_2
    :try_start_0
    invoke-virtual {p1, p6, p10, p11, p9}, Ld9/x;->l(Ljava/nio/ByteBuffer;JI)Z

    move-result p1
    :try_end_0
    .catch Landroidx/media3/exoplayer/audio/AudioSink$InitializationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroidx/media3/exoplayer/audio/AudioSink$WriteException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_4

    if-eqz p5, :cond_3

    invoke-interface {p5, p7}, Li9/k;->i(I)V

    :cond_3
    iget-object p1, p0, Li9/o;->X0:Lb9/g;

    iget p3, p1, Lb9/g;->f:I

    add-int/2addr p3, p9

    iput p3, p1, Lb9/g;->f:I

    return p2

    :cond_4
    const/4 p1, 0x0

    return p1

    :catch_0
    move-exception p1

    iget-boolean p2, p0, Li9/o;->G0:Z

    if-eqz p2, :cond_5

    iget-object p2, p0, Lb9/f;->z:Lb9/i1;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p2, Lb9/i1;->a:I

    if-eqz p2, :cond_5

    const/16 p2, 0x138b

    goto :goto_0

    :cond_5
    const/16 p2, 0x138a

    :goto_0
    iget-boolean p3, p1, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->x:Z

    invoke-virtual {p0, p1, p14, p3, p2}, Lb9/f;->g(Ljava/lang/Exception;Lu8/p;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    iget-object p2, p0, Ld9/a0;->j1:Lu8/p;

    iget-boolean p3, p0, Li9/o;->G0:Z

    if-eqz p3, :cond_6

    iget-object p3, p0, Lb9/f;->z:Lb9/i1;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p3, p3, Lb9/i1;->a:I

    if-eqz p3, :cond_6

    const/16 p3, 0x138c

    goto :goto_1

    :cond_6
    const/16 p3, 0x1389

    :goto_1
    iget-boolean p4, p1, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;->x:Z

    invoke-virtual {p0, p1, p2, p4, p3}, Lb9/f;->g(Ljava/lang/Exception;Lu8/p;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    move-result-object p1

    throw p1
.end method

.method public final i()Lb9/p0;
    .locals 0

    return-object p0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    const-string v0, "MediaCodecAudioRenderer"

    return-object v0
.end method

.method public final k0()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Ld9/a0;->e1:Ld9/x;

    iget-boolean v1, v0, Ld9/x;->S:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ld9/x;->o()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ld9/x;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ld9/x;->s()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Ld9/x;->S:Z
    :try_end_0
    .catch Landroidx/media3/exoplayer/audio/AudioSink$WriteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    iget-boolean v1, p0, Li9/o;->G0:Z

    if-eqz v1, :cond_1

    const/16 v1, 0x138b

    goto :goto_0

    :cond_1
    const/16 v1, 0x138a

    :goto_0
    iget-object v2, v0, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->y:Lu8/p;

    iget-boolean v3, v0, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->x:Z

    invoke-virtual {p0, v0, v2, v3, v1}, Lb9/f;->g(Ljava/lang/Exception;Lu8/p;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    move-result-object v0

    throw v0
.end method

.method public final l()Z
    .locals 2

    iget-boolean v0, p0, Li9/o;->T0:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ld9/a0;->e1:Ld9/x;

    invoke-virtual {v0}, Ld9/x;->o()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, v0, Ld9/x;->S:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ld9/x;->m()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final n()Z
    .locals 1

    iget-object v0, p0, Ld9/a0;->e1:Ld9/x;

    invoke-virtual {v0}, Ld9/x;->m()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0}, Li9/o;->n()Z

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

.method public final o()V
    .locals 3

    iget-object v0, p0, Ld9/a0;->d1:Lio/sentry/internal/debugmeta/c;

    const/4 v1, 0x1

    iput-boolean v1, p0, Ld9/a0;->n1:Z

    const/4 v1, 0x0

    iput-object v1, p0, Ld9/a0;->j1:Lu8/p;

    :try_start_0
    iget-object v1, p0, Ld9/a0;->e1:Ld9/x;

    invoke-virtual {v1}, Ld9/x;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-super {p0}, Li9/o;->o()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v1, p0, Li9/o;->X0:Lb9/g;

    invoke-virtual {v0, v1}, Lio/sentry/internal/debugmeta/c;->p(Lb9/g;)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Li9/o;->X0:Lb9/g;

    invoke-virtual {v0, v2}, Lio/sentry/internal/debugmeta/c;->p(Lb9/g;)V

    throw v1

    :catchall_1
    move-exception v1

    :try_start_2
    invoke-super {p0}, Li9/o;->o()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    iget-object v2, p0, Li9/o;->X0:Lb9/g;

    invoke-virtual {v0, v2}, Lio/sentry/internal/debugmeta/c;->p(Lb9/g;)V

    throw v1

    :catchall_2
    move-exception v1

    iget-object v2, p0, Li9/o;->X0:Lb9/g;

    invoke-virtual {v0, v2}, Lio/sentry/internal/debugmeta/c;->p(Lb9/g;)V

    throw v1
.end method

.method public final p(ZZ)V
    .locals 3

    new-instance p1, Lb9/g;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lb9/g;-><init>(I)V

    iput-object p1, p0, Li9/o;->X0:Lb9/g;

    iget-object p2, p0, Ld9/a0;->d1:Lio/sentry/internal/debugmeta/c;

    iget-object v0, p2, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Ld9/h;

    const/4 v2, 0x5

    invoke-direct {v1, p2, p1, v2}, Ld9/h;-><init>(Lio/sentry/internal/debugmeta/c;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p0, Lb9/f;->z:Lb9/i1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean p1, p1, Lb9/i1;->b:Z

    iget-object p2, p0, Ld9/a0;->e1:Ld9/x;

    if-eqz p1, :cond_1

    iget-boolean p1, p2, Ld9/x;->W:Z

    invoke-static {p1}, Lva3/g;->i(Z)V

    iget-boolean p1, p2, Ld9/x;->a0:Z

    if-nez p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p2, Ld9/x;->a0:Z

    invoke-virtual {p2}, Ld9/x;->g()V

    goto :goto_0

    :cond_1
    iget-boolean p1, p2, Ld9/x;->a0:Z

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    iput-boolean p1, p2, Ld9/x;->a0:Z

    invoke-virtual {p2}, Ld9/x;->g()V

    :cond_2
    :goto_0
    iget-object p1, p0, Lb9/f;->F:Lc9/n;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p2, Ld9/x;->q:Lc9/n;

    iget-object p1, p0, Lb9/f;->G:Lx8/p;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p2, Ld9/x;->g:Ld9/m;

    iput-object p1, p2, Ld9/m;->I:Lx8/p;

    return-void
.end method

.method public final q(JZ)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Li9/o;->q(JZ)V

    iget-object p3, p0, Ld9/a0;->e1:Ld9/x;

    invoke-virtual {p3}, Ld9/x;->g()V

    iput-wide p1, p0, Ld9/a0;->l1:J

    const/4 p1, 0x0

    iput-boolean p1, p0, Ld9/a0;->o1:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Ld9/a0;->m1:Z

    return-void
.end method

.method public final r()V
    .locals 4

    iget-object v0, p0, Ld9/a0;->e1:Ld9/x;

    iget-object v0, v0, Ld9/x;->x:Ld30/h;

    if-eqz v0, :cond_3

    iget-object v1, v0, Ld30/h;->b:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    iget-boolean v2, v0, Ld30/h;->a:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    iput-object v2, v0, Ld30/h;->h:Ljava/lang/Object;

    sget v2, Lx8/t;->a:I

    const/16 v3, 0x17

    if-lt v2, v3, :cond_1

    iget-object v2, v0, Ld30/h;->e:Ljava/lang/Object;

    check-cast v2, Ld9/c;

    if-eqz v2, :cond_1

    invoke-static {v1}, Lv8/b;->r(Landroid/content/Context;)Landroid/media/AudioManager;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/media/AudioManager;->unregisterAudioDeviceCallback(Landroid/media/AudioDeviceCallback;)V

    :cond_1
    iget-object v2, v0, Ld30/h;->f:Ljava/lang/Object;

    check-cast v2, Ld9/e;

    invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iget-object v1, v0, Ld30/h;->g:Ljava/lang/Object;

    check-cast v1, Ld9/d;

    if-eqz v1, :cond_2

    iget-object v2, v1, Ld9/d;->a:Landroid/content/ContentResolver;

    invoke-virtual {v2, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    :cond_2
    const/4 v1, 0x0

    iput-boolean v1, v0, Ld30/h;->a:Z

    :cond_3
    :goto_0
    sget v0, Lx8/t;->a:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_4

    iget-object v0, p0, Ld9/a0;->f1:Li9/i;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Li9/i;->b()V

    :cond_4
    return-void
.end method

.method public final r0(Lu8/p;)Z
    .locals 4

    iget-object v0, p0, Lb9/f;->z:Lb9/i1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, v0, Lb9/i1;->a:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Ld9/a0;->w0(Lu8/p;)I

    move-result v0

    and-int/lit16 v2, v0, 0x200

    if-eqz v2, :cond_1

    iget-object v2, p0, Lb9/f;->z:Lb9/i1;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, v2, Lb9/i1;->a:I

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    and-int/lit16 v0, v0, 0x400

    if-nez v0, :cond_0

    iget v0, p1, Lu8/p;->G:I

    if-nez v0, :cond_1

    iget v0, p1, Lu8/p;->H:I

    if-nez v0, :cond_1

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, Ld9/a0;->e1:Ld9/x;

    invoke-virtual {v0, p1}, Ld9/x;->i(Lu8/p;)I

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final s()V
    .locals 5

    iget-object v0, p0, Ld9/a0;->e1:Ld9/x;

    const/4 v1, 0x0

    iput-boolean v1, p0, Ld9/a0;->o1:Z

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0}, Li9/o;->F()V

    invoke-virtual {p0}, Li9/o;->j0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v3, p0, Li9/o;->e0:Le10/k0;

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v2}, Le10/k0;->K(Lg9/d;)V

    :goto_0
    iput-object v2, p0, Li9/o;->e0:Le10/k0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-boolean v2, p0, Ld9/a0;->n1:Z

    if-eqz v2, :cond_1

    iput-boolean v1, p0, Ld9/a0;->n1:Z

    invoke-virtual {v0}, Ld9/x;->u()V

    :cond_1
    return-void

    :catchall_0
    move-exception v2

    goto :goto_1

    :catchall_1
    move-exception v3

    :try_start_2
    iget-object v4, p0, Li9/o;->e0:Le10/k0;

    if-eqz v4, :cond_2

    invoke-virtual {v4, v2}, Le10/k0;->K(Lg9/d;)V

    :cond_2
    iput-object v2, p0, Li9/o;->e0:Le10/k0;

    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    iget-boolean v3, p0, Ld9/a0;->n1:Z

    if-eqz v3, :cond_3

    iput-boolean v1, p0, Ld9/a0;->n1:Z

    invoke-virtual {v0}, Ld9/x;->u()V

    :cond_3
    throw v2
.end method

.method public final s0(Li9/h;Lu8/p;)I
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v2, v3, v3, v3}, Lb9/f;->f(IIII)I

    move-result v4

    iget-object v5, v1, Lu8/p;->n:Ljava/lang/String;

    iget-object v6, v1, Lu8/p;->n:Ljava/lang/String;

    invoke-static {v5}, Lu8/d0;->k(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-static {v3, v3, v3, v3}, Lb9/f;->f(IIII)I

    move-result v1

    return v1

    :cond_0
    iget v5, v1, Lu8/p;->M:I

    if-eqz v5, :cond_1

    move v7, v2

    goto :goto_0

    :cond_1
    move v7, v3

    :goto_0
    const/4 v8, 0x2

    if-eqz v5, :cond_3

    if-ne v5, v8, :cond_2

    goto :goto_1

    :cond_2
    move v5, v3

    goto :goto_2

    :cond_3
    :goto_1
    move v5, v2

    :goto_2
    const/16 v9, 0x20

    const-string v11, "audio/raw"

    const/16 v12, 0x8

    const/4 v13, 0x4

    iget-object v14, v0, Ld9/a0;->e1:Ld9/x;

    if-eqz v5, :cond_6

    if-eqz v7, :cond_5

    invoke-static {v11, v3, v3}, Li9/s;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_4

    const/4 v7, 0x0

    goto :goto_3

    :cond_4
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li9/m;

    :goto_3
    if-eqz v7, :cond_6

    :cond_5
    invoke-virtual {v0, v1}, Ld9/a0;->w0(Lu8/p;)I

    move-result v7

    invoke-virtual {v14, v1}, Ld9/x;->i(Lu8/p;)I

    move-result v15

    if-eqz v15, :cond_7

    invoke-static {v13, v12, v9, v7}, Lb9/f;->f(IIII)I

    move-result v1

    return v1

    :cond_6
    move v7, v3

    :cond_7
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_9

    invoke-virtual {v14, v1}, Ld9/x;->i(Lu8/p;)I

    move-result v15

    if-eqz v15, :cond_8

    goto :goto_4

    :cond_8
    return v4

    :cond_9
    :goto_4
    iget v15, v1, Lu8/p;->D:I

    iget v2, v1, Lu8/p;->E:I

    move/from16 v17, v9

    new-instance v9, Lu8/o;

    invoke-direct {v9}, Lu8/o;-><init>()V

    invoke-static {v11}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    iput-object v10, v9, Lu8/o;->m:Ljava/lang/String;

    iput v15, v9, Lu8/o;->C:I

    iput v2, v9, Lu8/o;->D:I

    iput v8, v9, Lu8/o;->E:I

    new-instance v2, Lu8/p;

    invoke-direct {v2, v9}, Lu8/p;-><init>(Lu8/o;)V

    invoke-virtual {v14, v2}, Ld9/x;->i(Lu8/p;)I

    move-result v2

    if-eqz v2, :cond_15

    if-nez v6, :cond_a

    sget-object v2, Lzr/w0;->E:Lzr/w0;

    goto :goto_6

    :cond_a
    invoke-virtual {v14, v1}, Ld9/x;->i(Lu8/p;)I

    move-result v2

    if-eqz v2, :cond_c

    invoke-static {v11, v3, v3}, Li9/s;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_b

    const/4 v10, 0x0

    goto :goto_5

    :cond_b
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Li9/m;

    :goto_5
    if-eqz v10, :cond_c

    invoke-static {v10}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object v2

    goto :goto_6

    :cond_c
    move-object/from16 v2, p1

    invoke-static {v2, v1, v3, v3}, Li9/s;->g(Li9/h;Lu8/p;ZZ)Lzr/w0;

    move-result-object v2

    :goto_6
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_d

    return v4

    :cond_d
    if-nez v5, :cond_e

    invoke-static {v8, v3, v3, v3}, Lb9/f;->f(IIII)I

    move-result v1

    return v1

    :cond_e
    invoke-virtual {v2, v3}, Lzr/w0;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li9/m;

    invoke-virtual {v4, v1}, Li9/m;->e(Lu8/p;)Z

    move-result v5

    if-nez v5, :cond_10

    const/4 v6, 0x1

    :goto_7
    iget v8, v2, Lzr/w0;->z:I

    if-ge v6, v8, :cond_10

    invoke-virtual {v2, v6}, Lzr/w0;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Li9/m;

    invoke-virtual {v8, v1}, Li9/m;->e(Lu8/p;)Z

    move-result v9

    if-eqz v9, :cond_f

    move/from16 v16, v3

    move-object v4, v8

    const/4 v2, 0x1

    goto :goto_8

    :cond_f
    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_10
    move v2, v5

    const/16 v16, 0x1

    :goto_8
    if-eqz v2, :cond_11

    goto :goto_9

    :cond_11
    const/4 v13, 0x3

    :goto_9
    if-eqz v2, :cond_12

    invoke-virtual {v4, v1}, Li9/m;->f(Lu8/p;)Z

    move-result v1

    if-eqz v1, :cond_12

    const/16 v12, 0x10

    :cond_12
    iget-boolean v1, v4, Li9/m;->g:Z

    if-eqz v1, :cond_13

    const/16 v1, 0x40

    goto :goto_a

    :cond_13
    move v1, v3

    :goto_a
    if-eqz v16, :cond_14

    const/16 v3, 0x80

    :cond_14
    or-int v2, v13, v12

    or-int/lit8 v2, v2, 0x20

    or-int/2addr v1, v2

    or-int/2addr v1, v3

    or-int/2addr v1, v7

    return v1

    :cond_15
    return v4
.end method

.method public final t()V
    .locals 1

    iget-object v0, p0, Ld9/a0;->e1:Ld9/x;

    invoke-virtual {v0}, Ld9/x;->r()V

    return-void
.end method

.method public final u()V
    .locals 6

    invoke-virtual {p0}, Ld9/a0;->y0()V

    iget-object v0, p0, Ld9/a0;->e1:Ld9/x;

    const/4 v1, 0x0

    iput-boolean v1, v0, Ld9/x;->V:Z

    invoke-virtual {v0}, Ld9/x;->o()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Ld9/x;->g:Ld9/m;

    invoke-virtual {v1}, Ld9/m;->e()V

    iget-wide v2, v1, Ld9/m;->x:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-object v1, v1, Ld9/m;->e:Ld9/l;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ld9/l;->a()V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ld9/m;->b()J

    move-result-wide v2

    iput-wide v2, v1, Ld9/m;->z:J

    iget-object v1, v0, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-static {v1}, Ld9/x;->p(Landroid/media/AudioTrack;)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    iget-object v0, v0, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    :cond_1
    return-void
.end method

.method public final w0(Lu8/p;)I
    .locals 1

    iget-object v0, p0, Ld9/a0;->e1:Ld9/x;

    invoke-virtual {v0, p1}, Ld9/x;->h(Lu8/p;)Ld9/g;

    move-result-object p1

    iget-boolean v0, p1, Ld9/g;->a:Z

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p1, Ld9/g;->b:Z

    if-eqz v0, :cond_1

    const/16 v0, 0x600

    goto :goto_0

    :cond_1
    const/16 v0, 0x200

    :goto_0
    iget-boolean p1, p1, Ld9/g;->c:Z

    if-eqz p1, :cond_2

    or-int/lit16 p1, v0, 0x800

    return p1

    :cond_2
    return v0
.end method

.method public final x0(Li9/m;Lu8/p;)I
    .locals 1

    const-string v0, "OMX.google.raw.decoder"

    iget-object p1, p1, Li9/m;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget p1, Lx8/t;->a:I

    const/16 v0, 0x18

    if-ge p1, v0, :cond_1

    const/16 v0, 0x17

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ld9/a0;->c1:Landroid/content/Context;

    invoke-static {p1}, Lx8/t;->I(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    const/4 p1, -0x1

    return p1

    :cond_1
    iget p1, p2, Lu8/p;->o:I

    return p1
.end method

.method public final y0()V
    .locals 20

    move-object/from16 v0, p0

    invoke-virtual {v0}, Ld9/a0;->l()Z

    iget-object v1, v0, Ld9/a0;->e1:Ld9/x;

    iget-object v2, v1, Ld9/x;->b:La33/d;

    invoke-virtual {v1}, Ld9/x;->o()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-boolean v3, v1, Ld9/x;->M:Z

    if-eqz v3, :cond_1

    :cond_0
    const-wide/high16 v18, -0x8000000000000000L

    goto/16 :goto_3

    :cond_1
    iget-object v3, v1, Ld9/x;->g:Ld9/m;

    invoke-virtual {v3}, Ld9/m;->a()J

    move-result-wide v6

    iget-object v3, v1, Ld9/x;->t:Ld9/q;

    invoke-virtual {v1}, Ld9/x;->k()J

    move-result-wide v8

    iget v3, v3, Ld9/q;->e:I

    invoke-static {v3, v8, v9}, Lx8/t;->O(IJ)J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    iget-object v3, v1, Ld9/x;->h:Ljava/util/ArrayDeque;

    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_2

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ld9/r;

    iget-wide v8, v8, Ld9/r;->c:J

    cmp-long v8, v6, v8

    if-ltz v8, :cond_2

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ld9/r;

    iput-object v8, v1, Ld9/x;->B:Ld9/r;

    goto :goto_0

    :cond_2
    iget-object v8, v1, Ld9/x;->B:Ld9/r;

    iget-wide v9, v8, Ld9/r;->c:J

    sub-long v11, v6, v9

    iget-object v6, v8, Ld9/r;->a:Lu8/e0;

    iget v6, v6, Lu8/e0;->a:F

    invoke-static {v6, v11, v12}, Lx8/t;->u(FJ)J

    move-result-wide v6

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, v2, La33/d;->z:Ljava/lang/Object;

    check-cast v3, Lv8/h;

    invoke-virtual {v3}, Lv8/h;->isActive()Z

    move-result v8

    if-eqz v8, :cond_3

    iget-wide v8, v3, Lv8/h;->o:J

    const-wide/16 v13, 0x400

    cmp-long v8, v8, v13

    if-ltz v8, :cond_5

    iget-wide v8, v3, Lv8/h;->n:J

    iget-object v10, v3, Lv8/h;->j:Lv8/g;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v13, v10, Lv8/g;->k:I

    iget v10, v10, Lv8/g;->b:I

    mul-int/2addr v13, v10

    mul-int/lit8 v13, v13, 0x2

    int-to-long v13, v13

    sub-long v13, v8, v13

    iget-object v8, v3, Lv8/h;->h:Lv8/d;

    iget v8, v8, Lv8/d;->a:I

    iget-object v9, v3, Lv8/h;->g:Lv8/d;

    iget v9, v9, Lv8/d;->a:I

    if-ne v8, v9, :cond_4

    iget-wide v8, v3, Lv8/h;->o:J

    sget-object v17, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    move-wide v15, v8

    invoke-static/range {v11 .. v17}, Lx8/t;->Q(JJJLjava/math/RoundingMode;)J

    move-result-wide v11

    :cond_3
    const-wide/high16 v18, -0x8000000000000000L

    goto :goto_1

    :cond_4
    const-wide/high16 v18, -0x8000000000000000L

    int-to-long v4, v8

    mul-long/2addr v13, v4

    iget-wide v3, v3, Lv8/h;->o:J

    int-to-long v8, v9

    mul-long v15, v3, v8

    sget-object v17, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    invoke-static/range {v11 .. v17}, Lx8/t;->Q(JJJLjava/math/RoundingMode;)J

    move-result-wide v11

    goto :goto_1

    :cond_5
    const-wide/high16 v18, -0x8000000000000000L

    iget v3, v3, Lv8/h;->c:F

    float-to-double v3, v3

    long-to-double v8, v11

    mul-double/2addr v3, v8

    double-to-long v11, v3

    :goto_1
    iget-object v3, v1, Ld9/x;->B:Ld9/r;

    iget-wide v4, v3, Ld9/r;->b:J

    add-long/2addr v4, v11

    sub-long/2addr v11, v6

    iput-wide v11, v3, Ld9/r;->d:J

    goto :goto_2

    :cond_6
    const-wide/high16 v18, -0x8000000000000000L

    iget-object v3, v1, Ld9/x;->B:Ld9/r;

    iget-wide v4, v3, Ld9/r;->b:J

    add-long/2addr v4, v6

    iget-wide v6, v3, Ld9/r;->d:J

    add-long/2addr v4, v6

    :goto_2
    iget-object v2, v2, La33/d;->y:Ljava/lang/Object;

    check-cast v2, Ld9/c0;

    iget-wide v2, v2, Ld9/c0;->q:J

    iget-object v6, v1, Ld9/x;->t:Ld9/q;

    iget v6, v6, Ld9/q;->e:I

    invoke-static {v6, v2, v3}, Lx8/t;->O(IJ)J

    move-result-wide v6

    add-long/2addr v6, v4

    iget-wide v4, v1, Ld9/x;->g0:J

    cmp-long v8, v2, v4

    if-lez v8, :cond_8

    iget-object v8, v1, Ld9/x;->t:Ld9/q;

    sub-long v4, v2, v4

    iget v8, v8, Ld9/q;->e:I

    invoke-static {v8, v4, v5}, Lx8/t;->O(IJ)J

    move-result-wide v4

    iput-wide v2, v1, Ld9/x;->g0:J

    iget-wide v2, v1, Ld9/x;->h0:J

    add-long/2addr v2, v4

    iput-wide v2, v1, Ld9/x;->h0:J

    iget-object v2, v1, Ld9/x;->i0:Landroid/os/Handler;

    if-nez v2, :cond_7

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v2, v1, Ld9/x;->i0:Landroid/os/Handler;

    :cond_7
    iget-object v2, v1, Ld9/x;->i0:Landroid/os/Handler;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v2, v1, Ld9/x;->i0:Landroid/os/Handler;

    new-instance v3, Landroidx/fragment/app/m;

    const/16 v4, 0x13

    invoke-direct {v3, v1, v4}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    const-wide/16 v4, 0x64

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_4

    :goto_3
    move-wide/from16 v6, v18

    :cond_8
    :goto_4
    cmp-long v1, v6, v18

    if-eqz v1, :cond_a

    iget-boolean v1, v0, Ld9/a0;->m1:Z

    if-eqz v1, :cond_9

    goto :goto_5

    :cond_9
    iget-wide v1, v0, Ld9/a0;->l1:J

    invoke-static {v1, v2, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    :goto_5
    iput-wide v6, v0, Ld9/a0;->l1:J

    const/4 v1, 0x0

    iput-boolean v1, v0, Ld9/a0;->m1:Z

    :cond_a
    return-void
.end method
