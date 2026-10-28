.class public final Lbn/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwm/i;


# static fields
.field public static final b0:[B

.field public static final c0:[B

.field public static final d0:[B

.field public static final e0:[B

.field public static final f0:Ljava/util/UUID;

.field public static final g0:Ljava/util/Map;


# instance fields
.field public A:J

.field public B:J

.field public C:Llo/k;

.field public D:Llo/k;

.field public E:Z

.field public F:Z

.field public G:I

.field public H:J

.field public I:J

.field public J:I

.field public K:I

.field public L:[I

.field public M:I

.field public N:I

.field public O:I

.field public P:I

.field public Q:Z

.field public R:I

.field public S:I

.field public T:I

.field public U:Z

.field public V:Z

.field public W:Z

.field public X:I

.field public Y:B

.field public Z:Z

.field public final a:Lbn/b;

.field public a0:Lwm/k;

.field public final b:Lbn/e;

.field public final c:Landroid/util/SparseArray;

.field public final d:Z

.field public final e:Led3/a;

.field public final f:Led3/a;

.field public final g:Led3/a;

.field public final h:Led3/a;

.field public final i:Led3/a;

.field public final j:Led3/a;

.field public final k:Led3/a;

.field public final l:Led3/a;

.field public final m:Led3/a;

.field public final n:Led3/a;

.field public o:Ljava/nio/ByteBuffer;

.field public p:J

.field public q:J

.field public r:J

.field public s:J

.field public t:J

.field public u:Lbn/c;

.field public v:Z

.field public w:I

.field public x:J

.field public y:Z

.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/16 v0, 0x20

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, Lbn/d;->b0:[B

    sget v1, Llo/y;->a:I

    sget-object v1, Lyr/d;->c:Ljava/nio/charset/Charset;

    const-string v2, "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text"

    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    sput-object v1, Lbn/d;->c0:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, Lbn/d;->d0:[B

    const/16 v0, 0x26

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    sput-object v0, Lbn/d;->e0:[B

    new-instance v0, Ljava/util/UUID;

    const-wide v1, 0x100000000001000L

    const-wide v3, -0x7fffff55ffc7648fL    # -3.607411173533E-312

    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    sput-object v0, Lbn/d;->f0:Ljava/util/UUID;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "htc_video_rotA-090"

    const/16 v2, 0x5a

    const/4 v3, 0x0

    const-string v4, "htc_video_rotA-000"

    invoke-static {v3, v0, v4, v2, v1}, Lih0/d0;->x(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    const-string v1, "htc_video_rotA-270"

    const/16 v2, 0x10e

    const/16 v3, 0xb4

    const-string v4, "htc_video_rotA-180"

    invoke-static {v3, v0, v4, v2, v1}, Lih0/d0;->x(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lbn/d;->g0:Ljava/util/Map;

    return-void

    nop

    :array_0
    .array-data 1
        0x31t
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data

    :array_1
    .array-data 1
        0x44t
        0x69t
        0x61t
        0x6ct
        0x6ft
        0x67t
        0x75t
        0x65t
        0x3at
        0x20t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
    .end array-data

    :array_2
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x56t
        0x54t
        0x54t
        0xat
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data
.end method

.method public constructor <init>()V
    .locals 6

    new-instance v0, Lbn/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbn/b;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v1, -0x1

    iput-wide v1, p0, Lbn/d;->q:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v3, p0, Lbn/d;->r:J

    iput-wide v3, p0, Lbn/d;->s:J

    iput-wide v3, p0, Lbn/d;->t:J

    iput-wide v1, p0, Lbn/d;->z:J

    iput-wide v1, p0, Lbn/d;->A:J

    iput-wide v3, p0, Lbn/d;->B:J

    iput-object v0, p0, Lbn/d;->a:Lbn/b;

    new-instance v1, Lro/i;

    const/16 v2, 0xa

    invoke-direct {v1, p0, v2}, Lro/i;-><init>(Ljava/lang/Object;I)V

    iput-object v1, v0, Lbn/b;->g:Ljava/lang/Object;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lbn/d;->d:Z

    new-instance v1, Lbn/e;

    invoke-direct {v1}, Lbn/e;-><init>()V

    iput-object v1, p0, Lbn/d;->b:Lbn/e;

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iput-object v1, p0, Lbn/d;->c:Landroid/util/SparseArray;

    new-instance v1, Led3/a;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Led3/a;-><init>(I)V

    iput-object v1, p0, Lbn/d;->g:Led3/a;

    new-instance v1, Led3/a;

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    const/4 v4, -0x1

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v1, v3, v4, v5}, Led3/a;-><init>([BIB)V

    iput-object v1, p0, Lbn/d;->h:Led3/a;

    new-instance v1, Led3/a;

    invoke-direct {v1, v2}, Led3/a;-><init>(I)V

    iput-object v1, p0, Lbn/d;->i:Led3/a;

    new-instance v1, Led3/a;

    sget-object v3, Llo/a;->c:[B

    invoke-direct {v1, v3, v4, v5}, Led3/a;-><init>([BIB)V

    iput-object v1, p0, Lbn/d;->e:Led3/a;

    new-instance v1, Led3/a;

    invoke-direct {v1, v2}, Led3/a;-><init>(I)V

    iput-object v1, p0, Lbn/d;->f:Led3/a;

    new-instance v1, Led3/a;

    invoke-direct {v1}, Led3/a;-><init>()V

    iput-object v1, p0, Lbn/d;->j:Led3/a;

    new-instance v1, Led3/a;

    invoke-direct {v1}, Led3/a;-><init>()V

    iput-object v1, p0, Lbn/d;->k:Led3/a;

    new-instance v1, Led3/a;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Led3/a;-><init>(I)V

    iput-object v1, p0, Lbn/d;->l:Led3/a;

    new-instance v1, Led3/a;

    invoke-direct {v1}, Led3/a;-><init>()V

    iput-object v1, p0, Lbn/d;->m:Led3/a;

    new-instance v1, Led3/a;

    invoke-direct {v1}, Led3/a;-><init>()V

    iput-object v1, p0, Lbn/d;->n:Led3/a;

    new-array v0, v0, [I

    iput-object v0, p0, Lbn/d;->L:[I

    return-void
.end method

.method public static e(JJLjava/lang/String;)[B
    .locals 7

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p0, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Llo/a;->e(Z)V

    const-wide v0, 0xd693a400L

    div-long v0, p0, v0

    long-to-int v0, v0

    mul-int/lit16 v1, v0, 0xe10

    int-to-long v1, v1

    const-wide/32 v3, 0xf4240

    mul-long/2addr v1, v3

    sub-long/2addr p0, v1

    const-wide/32 v1, 0x3938700

    div-long v1, p0, v1

    long-to-int v1, v1

    mul-int/lit8 v2, v1, 0x3c

    int-to-long v5, v2

    mul-long/2addr v5, v3

    sub-long/2addr p0, v5

    div-long v5, p0, v3

    long-to-int v2, v5

    int-to-long v5, v2

    mul-long/2addr v5, v3

    sub-long/2addr p0, v5

    div-long/2addr p0, p2

    long-to-int p0, p0

    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p2, p3, v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p1, p4, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget p1, Llo/y;->a:I

    sget-object p1, Lyr/d;->c:Ljava/nio/charset/Charset;

    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    iget-object v0, p0, Lbn/d;->C:Llo/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbn/d;->D:Llo/k;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x25

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Element "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be in a Cues"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p1

    throw p1
.end method

.method public final b(JJ)V
    .locals 0

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lbn/d;->B:J

    const/4 p1, 0x0

    iput p1, p0, Lbn/d;->G:I

    iget-object p2, p0, Lbn/d;->a:Lbn/b;

    iput p1, p2, Lbn/b;->c:I

    iget-object p3, p2, Lbn/b;->b:Ljava/util/ArrayDeque;

    invoke-virtual {p3}, Ljava/util/ArrayDeque;->clear()V

    iget-object p2, p2, Lbn/b;->f:Ljava/lang/Object;

    check-cast p2, Lbn/e;

    iput p1, p2, Lbn/e;->b:I

    iput p1, p2, Lbn/e;->c:I

    iget-object p2, p0, Lbn/d;->b:Lbn/e;

    iput p1, p2, Lbn/e;->b:I

    iput p1, p2, Lbn/e;->c:I

    invoke-virtual {p0}, Lbn/d;->j()V

    move p2, p1

    :goto_0
    iget-object p3, p0, Lbn/d;->c:Landroid/util/SparseArray;

    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    move-result p4

    if-ge p2, p4, :cond_1

    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lbn/c;

    iget-object p3, p3, Lbn/c;->T:Lt9/l0;

    if-eqz p3, :cond_0

    iput-boolean p1, p3, Lt9/l0;->b:Z

    iput p1, p3, Lt9/l0;->c:I

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final c(I)V
    .locals 2

    iget-object v0, p0, Lbn/d;->u:Lbn/c;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x2b

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Element "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be in a TrackEntry"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p1

    throw p1
.end method

.method public final d(Lbn/c;JIII)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v1, Lbn/c;->T:Lt9/l0;

    const/4 v9, 0x1

    if-eqz v2, :cond_0

    move-object v3, v2

    iget-object v2, v1, Lbn/c;->X:Lwm/s;

    iget-object v8, v1, Lbn/c;->j:Lwm/r;

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object v1, v3

    move-wide/from16 v3, p2

    invoke-virtual/range {v1 .. v8}, Lt9/l0;->d(Lwm/s;JIIILwm/r;)V

    goto/16 :goto_7

    :cond_0
    iget-object v2, v1, Lbn/c;->b:Ljava/lang/String;

    const-string v3, "S_TEXT/UTF8"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v4, "S_TEXT/WEBVTT"

    const-string v5, "S_TEXT/ASS"

    if-nez v2, :cond_1

    iget-object v2, v1, Lbn/c;->b:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, v1, Lbn/c;->b:Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_1
    iget v2, v0, Lbn/d;->K:I

    const-string v6, "MatroskaExtractor"

    if-le v2, v9, :cond_2

    const-string v2, "Skipping subtitle sample in laced block."

    invoke-static {v6, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    iget-wide v7, v0, Lbn/d;->I:J

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v7, v10

    if-nez v2, :cond_4

    const-string v2, "Skipping subtitle sample with no duration."

    invoke-static {v6, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    :goto_0
    move/from16 v2, p5

    goto/16 :goto_5

    :cond_4
    iget-object v2, v1, Lbn/c;->b:Ljava/lang/String;

    iget-object v6, v0, Lbn/d;->k:Led3/a;

    iget-object v10, v6, Led3/a;->a:[B

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v11

    const/4 v12, 0x0

    const/4 v13, -0x1

    sparse-switch v11, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_5
    const/4 v13, 0x2

    goto :goto_1

    :sswitch_1
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_1

    :cond_6
    move v13, v9

    goto :goto_1

    :sswitch_2
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_1

    :cond_7
    move v13, v12

    :goto_1
    const-wide/16 v2, 0x3e8

    packed-switch v13, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v1

    :pswitch_0
    const-string v4, "%02d:%02d:%02d,%03d"

    invoke-static {v7, v8, v2, v3, v4}, Lbn/d;->e(JJLjava/lang/String;)[B

    move-result-object v2

    const/16 v3, 0x13

    goto :goto_2

    :pswitch_1
    const-string v4, "%02d:%02d:%02d.%03d"

    invoke-static {v7, v8, v2, v3, v4}, Lbn/d;->e(JJLjava/lang/String;)[B

    move-result-object v2

    const/16 v3, 0x19

    goto :goto_2

    :pswitch_2
    const-string v2, "%01d:%02d:%02d:%02d"

    const-wide/16 v3, 0x2710

    invoke-static {v7, v8, v3, v4, v2}, Lbn/d;->e(JJLjava/lang/String;)[B

    move-result-object v2

    const/16 v3, 0x15

    :goto_2
    array-length v4, v2

    invoke-static {v2, v12, v10, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v2, v6, Led3/a;->b:I

    :goto_3
    iget v3, v6, Led3/a;->c:I

    if-ge v2, v3, :cond_9

    iget-object v3, v6, Led3/a;->a:[B

    aget-byte v3, v3, v2

    if-nez v3, :cond_8

    invoke-virtual {v6, v2}, Led3/a;->J(I)V

    goto :goto_4

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_9
    :goto_4
    iget-object v2, v1, Lbn/c;->X:Lwm/s;

    iget v3, v6, Led3/a;->c:I

    invoke-interface {v2, v3, v6}, Lwm/s;->c(ILed3/a;)V

    iget v2, v6, Led3/a;->c:I

    add-int v2, p5, v2

    :goto_5
    const/high16 v3, 0x10000000

    and-int v3, p4, v3

    if-eqz v3, :cond_b

    iget v3, v0, Lbn/d;->K:I

    if-le v3, v9, :cond_a

    const v3, -0x10000001

    and-int v3, p4, v3

    move v14, v2

    move v13, v3

    goto :goto_6

    :cond_a
    iget-object v3, v0, Lbn/d;->n:Led3/a;

    iget v4, v3, Led3/a;->c:I

    iget-object v5, v1, Lbn/c;->X:Lwm/s;

    invoke-interface {v5, v4, v3}, Lwm/s;->c(ILed3/a;)V

    add-int/2addr v2, v4

    :cond_b
    move/from16 v13, p4

    move v14, v2

    :goto_6
    iget-object v10, v1, Lbn/c;->X:Lwm/s;

    iget-object v1, v1, Lbn/c;->j:Lwm/r;

    move-wide/from16 v11, p2

    move/from16 v15, p6

    move-object/from16 v16, v1

    invoke-interface/range {v10 .. v16}, Lwm/s;->d(JIIILwm/r;)V

    :goto_7
    iput-boolean v9, v0, Lbn/d;->F:Z

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2c0618eb -> :sswitch_2
        0x3e4ca2d8 -> :sswitch_1
        0x54c61e47 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Lwm/j;I)V
    .locals 4

    iget-object v0, p0, Lbn/d;->g:Led3/a;

    iget v1, v0, Led3/a;->c:I

    if-lt v1, p2, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Led3/a;->a:[B

    array-length v2, v1

    if-ge v2, p2, :cond_1

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {v0, v1}, Led3/a;->b(I)V

    :cond_1
    iget-object v1, v0, Led3/a;->a:[B

    iget v2, v0, Led3/a;->c:I

    sub-int v3, p2, v2

    invoke-interface {p1, v1, v2, v3}, Lwm/j;->readFully([BII)V

    invoke-virtual {v0, p2}, Led3/a;->J(I)V

    return-void
.end method

.method public final g(Lwm/j;)Z
    .locals 16

    new-instance v0, Lai/j;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lai/j;-><init>(IZ)V

    iget-object v1, v0, Lai/j;->x:Ljava/lang/Object;

    check-cast v1, Led3/a;

    move-object/from16 v2, p1

    check-cast v2, Lwm/f;

    iget-wide v3, v2, Lwm/f;->y:J

    const-wide/16 v5, -0x1

    cmp-long v5, v3, v5

    const-wide/16 v6, 0x400

    if-eqz v5, :cond_1

    cmp-long v8, v3, v6

    if-lez v8, :cond_0

    goto :goto_0

    :cond_0
    move-wide v6, v3

    :cond_1
    :goto_0
    long-to-int v6, v6

    iget-object v7, v1, Led3/a;->a:[B

    const/4 v8, 0x0

    const/4 v9, 0x4

    invoke-virtual {v2, v7, v8, v9, v8}, Lwm/f;->c([BIIZ)Z

    invoke-virtual {v1}, Led3/a;->z()J

    move-result-wide v10

    iput v9, v0, Lai/j;->w:I

    :goto_1
    const-wide/32 v12, 0x1a45dfa3

    cmp-long v7, v10, v12

    const/4 v9, 0x1

    if-eqz v7, :cond_3

    iget v7, v0, Lai/j;->w:I

    add-int/2addr v7, v9

    iput v7, v0, Lai/j;->w:I

    if-ne v7, v6, :cond_2

    goto :goto_3

    :cond_2
    iget-object v7, v1, Led3/a;->a:[B

    invoke-virtual {v2, v7, v8, v9, v8}, Lwm/f;->c([BIIZ)Z

    const/16 v7, 0x8

    shl-long v9, v10, v7

    const-wide/16 v11, -0x100

    and-long/2addr v9, v11

    iget-object v7, v1, Led3/a;->a:[B

    aget-byte v7, v7, v8

    and-int/lit16 v7, v7, 0xff

    int-to-long v11, v7

    or-long v10, v9, v11

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v2}, Lai/j;->n(Lwm/f;)J

    move-result-wide v6

    iget v1, v0, Lai/j;->w:I

    int-to-long v10, v1

    const-wide/high16 v12, -0x8000000000000000L

    cmp-long v1, v6, v12

    if-eqz v1, :cond_8

    if-eqz v5, :cond_4

    add-long v14, v10, v6

    cmp-long v1, v14, v3

    if-ltz v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    iget v1, v0, Lai/j;->w:I

    int-to-long v3, v1

    add-long v14, v10, v6

    cmp-long v1, v3, v14

    if-gez v1, :cond_7

    invoke-virtual {v0, v2}, Lai/j;->n(Lwm/f;)J

    move-result-wide v3

    cmp-long v1, v3, v12

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v0, v2}, Lai/j;->n(Lwm/f;)J

    move-result-wide v3

    const-wide/16 v14, 0x0

    cmp-long v1, v3, v14

    if-ltz v1, :cond_8

    const-wide/32 v14, 0x7fffffff

    cmp-long v5, v3, v14

    if-lez v5, :cond_6

    goto :goto_3

    :cond_6
    if-eqz v1, :cond_4

    long-to-int v1, v3

    invoke-virtual {v2, v1, v8}, Lwm/f;->a(IZ)Z

    iget v3, v0, Lai/j;->w:I

    add-int/2addr v3, v1

    iput v3, v0, Lai/j;->w:I

    goto :goto_2

    :cond_7
    if-nez v1, :cond_8

    return v9

    :cond_8
    :goto_3
    return v8
.end method

.method public final h(Lwm/k;)V
    .locals 0

    iput-object p1, p0, Lbn/d;->a0:Lwm/k;

    return-void
.end method

.method public final i(Lwm/j;Lt9/s;)I
    .locals 36

    move-object/from16 v0, p0

    const/4 v3, 0x0

    iput-boolean v3, v0, Lbn/d;->F:Z

    const/4 v5, 0x1

    :goto_0
    if-eqz v5, :cond_b2

    iget-boolean v7, v0, Lbn/d;->F:Z

    if-nez v7, :cond_b2

    iget-object v7, v0, Lbn/d;->a:Lbn/b;

    iget-object v8, v7, Lbn/b;->b:Ljava/util/ArrayDeque;

    iget-object v5, v7, Lbn/b;->f:Ljava/lang/Object;

    move-object v9, v5

    check-cast v9, Lbn/e;

    iget-object v5, v7, Lbn/b;->g:Ljava/lang/Object;

    check-cast v5, Lro/i;

    invoke-static {v5}, Llo/a;->j(Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbn/a;

    const/16 v16, 0x16

    const-wide/16 v18, 0x0

    const-wide/16 v22, -0x1

    const v15, 0x1654ae6b

    const v11, 0x1549a966

    const/16 v14, 0x4dbb

    const/16 v12, 0xae

    const/16 v24, 0x8

    const/16 v10, 0xa0

    const/high16 v26, -0x40800000    # -1.0f

    if-eqz v5, :cond_84

    move-object/from16 v6, p1

    check-cast v6, Lwm/f;

    iget-wide v3, v6, Lwm/f;->z:J

    iget-wide v5, v5, Lbn/a;->b:J

    cmp-long v3, v3, v5

    if-ltz v3, :cond_84

    iget-object v3, v7, Lbn/b;->g:Ljava/lang/Object;

    check-cast v3, Lro/i;

    invoke-virtual {v8}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbn/a;

    iget v4, v4, Lbn/a;->a:I

    iget-object v3, v3, Lro/i;->x:Ljava/lang/Object;

    check-cast v3, Lbn/d;

    iget-object v5, v3, Lbn/d;->c:Landroid/util/SparseArray;

    iget-object v6, v3, Lbn/d;->a0:Lwm/k;

    invoke-static {v6}, Llo/a;->j(Ljava/lang/Object;)V

    if-eq v4, v10, :cond_7f

    const-string v6, "MatroskaExtractor"

    if-eq v4, v12, :cond_12

    if-eq v4, v14, :cond_10

    const/16 v7, 0x6240

    if-eq v4, v7, :cond_e

    const/16 v7, 0x6d80

    if-eq v4, v7, :cond_c

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    if-eq v4, v11, :cond_a

    if-eq v4, v15, :cond_8

    const v9, 0x1c53bb6b

    if-eq v4, v9, :cond_0

    goto/16 :goto_32

    :cond_0
    iget-boolean v4, v3, Lbn/d;->v:Z

    if-nez v4, :cond_6

    iget-object v4, v3, Lbn/d;->a0:Lwm/k;

    iget-object v5, v3, Lbn/d;->C:Llo/k;

    iget-object v9, v3, Lbn/d;->D:Llo/k;

    iget-wide v10, v3, Lbn/d;->q:J

    cmp-long v10, v10, v22

    if-eqz v10, :cond_5

    iget-wide v10, v3, Lbn/d;->t:J

    cmp-long v7, v10, v7

    if-eqz v7, :cond_5

    if-eqz v5, :cond_5

    iget v7, v5, Llo/k;->b:I

    if-eqz v7, :cond_5

    if-eqz v9, :cond_5

    iget v8, v9, Llo/k;->b:I

    if-eq v8, v7, :cond_1

    goto/16 :goto_4

    :cond_1
    new-array v8, v7, [I

    new-array v10, v7, [J

    new-array v11, v7, [J

    new-array v12, v7, [J

    const/4 v14, 0x0

    :goto_2
    if-ge v14, v7, :cond_2

    invoke-virtual {v5, v14}, Llo/k;->e(I)J

    move-result-wide v15

    aput-wide v15, v12, v14

    iget-wide v0, v3, Lbn/d;->q:J

    invoke-virtual {v9, v14}, Llo/k;->e(I)J

    move-result-wide v15

    add-long/2addr v15, v0

    aput-wide v15, v10, v14

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, p0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_3
    add-int/lit8 v1, v7, -0x1

    if-ge v0, v1, :cond_3

    add-int/lit8 v1, v0, 0x1

    aget-wide v14, v10, v1

    aget-wide v16, v10, v0

    sub-long v14, v14, v16

    long-to-int v5, v14

    aput v5, v8, v0

    aget-wide v14, v12, v1

    aget-wide v16, v12, v0

    sub-long v14, v14, v16

    aput-wide v14, v11, v0

    move v0, v1

    goto :goto_3

    :cond_3
    iget-wide v14, v3, Lbn/d;->q:J

    move-wide/from16 v16, v14

    iget-wide v13, v3, Lbn/d;->p:J

    add-long v14, v16, v13

    aget-wide v16, v10, v1

    sub-long v14, v14, v16

    long-to-int v5, v14

    aput v5, v8, v1

    iget-wide v13, v3, Lbn/d;->t:J

    aget-wide v15, v12, v1

    sub-long/2addr v13, v15

    aput-wide v13, v11, v1

    cmp-long v5, v13, v18

    if-gtz v5, :cond_4

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v7, 0x48

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v7, "Discarding last cue point with unexpected duration: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v8, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v8

    invoke-static {v10, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v10

    invoke-static {v11, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v11

    invoke-static {v12, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v12

    :cond_4
    new-instance v1, Lwm/e;

    invoke-direct {v1, v8, v10, v11, v12}, Lwm/e;-><init>([I[J[J[J)V

    goto :goto_5

    :cond_5
    :goto_4
    new-instance v1, Lwm/l;

    iget-wide v5, v3, Lbn/d;->t:J

    invoke-direct {v1, v5, v6}, Lwm/l;-><init>(J)V

    :goto_5
    invoke-interface {v4, v1}, Lwm/k;->x(Lwm/p;)V

    const/4 v1, 0x1

    iput-boolean v1, v3, Lbn/d;->v:Z

    :cond_6
    const/4 v0, 0x0

    iput-object v0, v3, Lbn/d;->C:Llo/k;

    iput-object v0, v3, Lbn/d;->D:Llo/k;

    :cond_7
    :goto_6
    const/4 v4, 0x0

    goto/16 :goto_35

    :cond_8
    const/4 v0, 0x0

    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-eqz v1, :cond_9

    iget-object v0, v3, Lbn/d;->a0:Lwm/k;

    invoke-interface {v0}, Lwm/k;->l()V

    goto :goto_6

    :cond_9
    const-string v1, "No valid tracks were found"

    invoke-static {v0, v1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :cond_a
    iget-wide v0, v3, Lbn/d;->r:J

    cmp-long v0, v0, v7

    if-nez v0, :cond_b

    const-wide/32 v0, 0xf4240

    iput-wide v0, v3, Lbn/d;->r:J

    :cond_b
    iget-wide v0, v3, Lbn/d;->s:J

    cmp-long v4, v0, v7

    if-eqz v4, :cond_7

    invoke-virtual {v3, v0, v1}, Lbn/d;->k(J)J

    move-result-wide v0

    iput-wide v0, v3, Lbn/d;->t:J

    goto :goto_6

    :cond_c
    invoke-virtual {v3, v4}, Lbn/d;->c(I)V

    iget-object v1, v3, Lbn/d;->u:Lbn/c;

    iget-boolean v3, v1, Lbn/c;->h:Z

    if-eqz v3, :cond_7

    iget-object v1, v1, Lbn/c;->i:[B

    if-nez v1, :cond_d

    goto/16 :goto_32

    :cond_d
    const-string v1, "Combining encryption and compression is not supported"

    const/4 v0, 0x0

    invoke-static {v0, v1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :cond_e
    invoke-virtual {v3, v4}, Lbn/d;->c(I)V

    iget-object v1, v3, Lbn/d;->u:Lbn/c;

    iget-boolean v3, v1, Lbn/c;->h:Z

    if-eqz v3, :cond_7

    iget-object v3, v1, Lbn/c;->j:Lwm/r;

    if-eqz v3, :cond_f

    new-instance v4, Lvm/c;

    new-instance v5, Lvm/b;

    sget-object v6, Lrm/g;->a:Ljava/util/UUID;

    const-string v7, "video/webm"

    iget-object v3, v3, Lwm/r;->b:[B

    const/4 v0, 0x0

    invoke-direct {v5, v6, v0, v7, v3}, Lvm/b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    filled-new-array {v5}, [Lvm/b;

    move-result-object v3

    const/4 v5, 0x1

    invoke-direct {v4, v0, v5, v3}, Lvm/c;-><init>(Ljava/lang/String;Z[Lvm/b;)V

    iput-object v4, v1, Lbn/c;->l:Lvm/c;

    goto :goto_6

    :cond_f
    const/4 v0, 0x0

    const-string v1, "Encrypted Track found but ContentEncKeyID was not found"

    invoke-static {v0, v1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :cond_10
    iget v1, v3, Lbn/d;->w:I

    const/4 v4, -0x1

    if-eq v1, v4, :cond_11

    iget-wide v4, v3, Lbn/d;->x:J

    cmp-long v6, v4, v22

    if-eqz v6, :cond_11

    const v9, 0x1c53bb6b

    if-ne v1, v9, :cond_7

    iput-wide v4, v3, Lbn/d;->z:J

    goto/16 :goto_6

    :cond_11
    const-string v1, "Mandatory element SeekID or SeekPosition not found"

    const/4 v0, 0x0

    invoke-static {v0, v1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :cond_12
    iget-object v1, v3, Lbn/d;->u:Lbn/c;

    invoke-static {v1}, Llo/a;->j(Ljava/lang/Object;)V

    iget-object v4, v1, Lbn/c;->b:Ljava/lang/String;

    if-eqz v4, :cond_7e

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v7

    const-string v8, "A_MPEG/L3"

    const-string v9, "A_MPEG/L2"

    const-string v10, "A_VORBIS"

    const-string v11, "A_TRUEHD"

    const-string v12, "A_MS/ACM"

    const-string v13, "V_MPEG4/ISO/SP"

    const-string v14, "V_MPEG4/ISO/AP"

    const/16 v19, 0x14

    sparse-switch v7, :sswitch_data_0

    :goto_7
    const/4 v7, -0x1

    goto/16 :goto_8

    :sswitch_0
    const-string v7, "A_OPUS"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_13

    goto :goto_7

    :cond_13
    const/16 v7, 0x20

    goto/16 :goto_8

    :sswitch_1
    const-string v7, "A_FLAC"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_14

    goto :goto_7

    :cond_14
    const/16 v7, 0x1f

    goto/16 :goto_8

    :sswitch_2
    const-string v7, "A_EAC3"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_15

    goto :goto_7

    :cond_15
    const/16 v7, 0x1e

    goto/16 :goto_8

    :sswitch_3
    const-string v7, "V_MPEG2"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_16

    goto :goto_7

    :cond_16
    const/16 v7, 0x1d

    goto/16 :goto_8

    :sswitch_4
    const-string v7, "S_TEXT/UTF8"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_17

    goto :goto_7

    :cond_17
    const/16 v7, 0x1c

    goto/16 :goto_8

    :sswitch_5
    const-string v7, "S_TEXT/WEBVTT"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_18

    goto :goto_7

    :cond_18
    const/16 v7, 0x1b

    goto/16 :goto_8

    :sswitch_6
    const-string v7, "V_MPEGH/ISO/HEVC"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_19

    goto :goto_7

    :cond_19
    const/16 v7, 0x1a

    goto/16 :goto_8

    :sswitch_7
    const-string v7, "S_TEXT/ASS"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1a

    goto :goto_7

    :cond_1a
    const/16 v7, 0x19

    goto/16 :goto_8

    :sswitch_8
    const-string v7, "A_PCM/INT/LIT"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1b

    goto :goto_7

    :cond_1b
    const/16 v7, 0x18

    goto/16 :goto_8

    :sswitch_9
    const-string v7, "A_PCM/INT/BIG"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1c

    goto/16 :goto_7

    :cond_1c
    const/16 v7, 0x17

    goto/16 :goto_8

    :sswitch_a
    const-string v7, "A_PCM/FLOAT/IEEE"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1d

    goto/16 :goto_7

    :cond_1d
    move/from16 v7, v16

    goto/16 :goto_8

    :sswitch_b
    const-string v7, "A_DTS/EXPRESS"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1e

    goto/16 :goto_7

    :cond_1e
    const/16 v7, 0x15

    goto/16 :goto_8

    :sswitch_c
    const-string v7, "V_THEORA"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1f

    goto/16 :goto_7

    :cond_1f
    move/from16 v7, v19

    goto/16 :goto_8

    :sswitch_d
    const-string v7, "S_HDMV/PGS"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_20

    goto/16 :goto_7

    :cond_20
    const/16 v7, 0x13

    goto/16 :goto_8

    :sswitch_e
    const-string v7, "V_VP9"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_21

    goto/16 :goto_7

    :cond_21
    const/16 v7, 0x12

    goto/16 :goto_8

    :sswitch_f
    const-string v7, "V_VP8"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_22

    goto/16 :goto_7

    :cond_22
    const/16 v7, 0x11

    goto/16 :goto_8

    :sswitch_10
    const-string v7, "V_AV1"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_23

    goto/16 :goto_7

    :cond_23
    const/16 v7, 0x10

    goto/16 :goto_8

    :sswitch_11
    const-string v7, "A_DTS"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_24

    goto/16 :goto_7

    :cond_24
    const/16 v7, 0xf

    goto/16 :goto_8

    :sswitch_12
    const-string v7, "A_AC3"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_25

    goto/16 :goto_7

    :cond_25
    const/16 v7, 0xe

    goto/16 :goto_8

    :sswitch_13
    const-string v7, "A_AAC"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_26

    goto/16 :goto_7

    :cond_26
    const/16 v7, 0xd

    goto/16 :goto_8

    :sswitch_14
    const-string v7, "A_DTS/LOSSLESS"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_27

    goto/16 :goto_7

    :cond_27
    const/16 v7, 0xc

    goto/16 :goto_8

    :sswitch_15
    const-string v7, "S_VOBSUB"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    goto/16 :goto_7

    :cond_28
    const/16 v7, 0xb

    goto/16 :goto_8

    :sswitch_16
    const-string v7, "V_MPEG4/ISO/AVC"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_29

    goto/16 :goto_7

    :cond_29
    const/16 v7, 0xa

    goto/16 :goto_8

    :sswitch_17
    const-string v7, "V_MPEG4/ISO/ASP"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2a

    goto/16 :goto_7

    :cond_2a
    const/16 v7, 0x9

    goto/16 :goto_8

    :sswitch_18
    const-string v7, "S_DVBSUB"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2b

    goto/16 :goto_7

    :cond_2b
    move/from16 v7, v24

    goto :goto_8

    :sswitch_19
    const-string v7, "V_MS/VFW/FOURCC"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2c

    goto/16 :goto_7

    :cond_2c
    const/4 v7, 0x7

    goto :goto_8

    :sswitch_1a
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2d

    goto/16 :goto_7

    :cond_2d
    const/4 v7, 0x6

    goto :goto_8

    :sswitch_1b
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2e

    goto/16 :goto_7

    :cond_2e
    const/4 v7, 0x5

    goto :goto_8

    :sswitch_1c
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2f

    goto/16 :goto_7

    :cond_2f
    const/4 v7, 0x4

    goto :goto_8

    :sswitch_1d
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_30

    goto/16 :goto_7

    :cond_30
    const/4 v7, 0x3

    goto :goto_8

    :sswitch_1e
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_31

    goto/16 :goto_7

    :cond_31
    const/4 v7, 0x2

    goto :goto_8

    :sswitch_1f
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_32

    goto/16 :goto_7

    :cond_32
    const/4 v7, 0x1

    goto :goto_8

    :sswitch_20
    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_33

    goto/16 :goto_7

    :cond_33
    const/4 v7, 0x0

    :goto_8
    packed-switch v7, :pswitch_data_0

    :goto_9
    const/4 v0, 0x0

    goto/16 :goto_31

    :pswitch_0
    iget-object v7, v3, Lbn/d;->a0:Lwm/k;

    iget v0, v1, Lbn/c;->c:I

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v30

    sparse-switch v30, :sswitch_data_1

    :goto_a
    const/4 v10, -0x1

    goto/16 :goto_b

    :sswitch_21
    const-string v8, "A_OPUS"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_34

    goto :goto_a

    :cond_34
    const/16 v10, 0x20

    goto/16 :goto_b

    :sswitch_22
    const-string v8, "A_FLAC"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_35

    goto :goto_a

    :cond_35
    const/16 v10, 0x1f

    goto/16 :goto_b

    :sswitch_23
    const-string v8, "A_EAC3"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_36

    goto :goto_a

    :cond_36
    const/16 v10, 0x1e

    goto/16 :goto_b

    :sswitch_24
    const-string v8, "V_MPEG2"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_37

    goto :goto_a

    :cond_37
    const/16 v10, 0x1d

    goto/16 :goto_b

    :sswitch_25
    const-string v8, "S_TEXT/UTF8"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_38

    goto :goto_a

    :cond_38
    const/16 v10, 0x1c

    goto/16 :goto_b

    :sswitch_26
    const-string v8, "S_TEXT/WEBVTT"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_39

    goto :goto_a

    :cond_39
    const/16 v10, 0x1b

    goto/16 :goto_b

    :sswitch_27
    const-string v8, "V_MPEGH/ISO/HEVC"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3a

    goto :goto_a

    :cond_3a
    const/16 v10, 0x1a

    goto/16 :goto_b

    :sswitch_28
    const-string v8, "S_TEXT/ASS"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3b

    goto :goto_a

    :cond_3b
    const/16 v10, 0x19

    goto/16 :goto_b

    :sswitch_29
    const-string v8, "A_PCM/INT/LIT"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3c

    goto :goto_a

    :cond_3c
    const/16 v10, 0x18

    goto/16 :goto_b

    :sswitch_2a
    const-string v8, "A_PCM/INT/BIG"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3d

    goto/16 :goto_a

    :cond_3d
    const/16 v10, 0x17

    goto/16 :goto_b

    :sswitch_2b
    const-string v8, "A_PCM/FLOAT/IEEE"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3e

    goto/16 :goto_a

    :cond_3e
    move/from16 v10, v16

    goto/16 :goto_b

    :sswitch_2c
    const-string v8, "A_DTS/EXPRESS"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3f

    goto/16 :goto_a

    :cond_3f
    const/16 v10, 0x15

    goto/16 :goto_b

    :sswitch_2d
    const-string v8, "V_THEORA"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_40

    goto/16 :goto_a

    :cond_40
    move/from16 v10, v19

    goto/16 :goto_b

    :sswitch_2e
    const-string v8, "S_HDMV/PGS"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_41

    goto/16 :goto_a

    :cond_41
    const/16 v10, 0x13

    goto/16 :goto_b

    :sswitch_2f
    const-string v8, "V_VP9"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_42

    goto/16 :goto_a

    :cond_42
    const/16 v10, 0x12

    goto/16 :goto_b

    :sswitch_30
    const-string v8, "V_VP8"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_43

    goto/16 :goto_a

    :cond_43
    const/16 v10, 0x11

    goto/16 :goto_b

    :sswitch_31
    const-string v8, "V_AV1"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_44

    goto/16 :goto_a

    :cond_44
    const/16 v10, 0x10

    goto/16 :goto_b

    :sswitch_32
    const-string v8, "A_DTS"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_45

    goto/16 :goto_a

    :cond_45
    const/16 v10, 0xf

    goto/16 :goto_b

    :sswitch_33
    const-string v8, "A_AC3"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_46

    goto/16 :goto_a

    :cond_46
    const/16 v10, 0xe

    goto/16 :goto_b

    :sswitch_34
    const-string v8, "A_AAC"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_47

    goto/16 :goto_a

    :cond_47
    const/16 v10, 0xd

    goto/16 :goto_b

    :sswitch_35
    const-string v8, "A_DTS/LOSSLESS"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_48

    goto/16 :goto_a

    :cond_48
    const/16 v10, 0xc

    goto/16 :goto_b

    :sswitch_36
    const-string v8, "S_VOBSUB"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_49

    goto/16 :goto_a

    :cond_49
    const/16 v10, 0xb

    goto/16 :goto_b

    :sswitch_37
    const-string v8, "V_MPEG4/ISO/AVC"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4a

    goto/16 :goto_a

    :cond_4a
    const/16 v10, 0xa

    goto/16 :goto_b

    :sswitch_38
    const-string v8, "V_MPEG4/ISO/ASP"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4b

    goto/16 :goto_a

    :cond_4b
    const/16 v10, 0x9

    goto/16 :goto_b

    :sswitch_39
    const-string v8, "S_DVBSUB"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4c

    goto/16 :goto_a

    :cond_4c
    move/from16 v10, v24

    goto :goto_b

    :sswitch_3a
    const-string v8, "V_MS/VFW/FOURCC"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4d

    goto/16 :goto_a

    :cond_4d
    const/4 v10, 0x7

    goto :goto_b

    :sswitch_3b
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4e

    goto/16 :goto_a

    :cond_4e
    const/4 v10, 0x6

    goto :goto_b

    :sswitch_3c
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4f

    goto/16 :goto_a

    :cond_4f
    const/4 v10, 0x5

    goto :goto_b

    :sswitch_3d
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_50

    goto/16 :goto_a

    :cond_50
    const/4 v10, 0x4

    goto :goto_b

    :sswitch_3e
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_51

    goto/16 :goto_a

    :cond_51
    const/4 v10, 0x3

    goto :goto_b

    :sswitch_3f
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_52

    goto/16 :goto_a

    :cond_52
    const/4 v10, 0x2

    goto :goto_b

    :sswitch_40
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_53

    goto/16 :goto_a

    :cond_53
    const/4 v10, 0x1

    goto :goto_b

    :sswitch_41
    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_54

    goto/16 :goto_a

    :cond_54
    const/4 v10, 0x0

    :goto_b
    const-string v11, "application/dvbsubs"

    const-string v12, "application/vobsub"

    const-string v13, "application/pgs"

    const-string v14, "video/x-unknown"

    const-string v9, "text/x-ssa"

    const-string v8, "text/vtt"

    const-string v15, "application/x-subrip"

    move/from16 v32, v0

    const-string v0, ". Setting mimeType to audio/x-unknown"

    const-string v33, "audio/raw"

    move/from16 v34, v10

    const-string v10, "audio/x-unknown"

    packed-switch v34, :pswitch_data_1

    const-string v0, "Unrecognized codec identifier."

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :pswitch_1
    new-instance v0, Ljava/util/ArrayList;

    const/4 v4, 0x3

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v4, v1, Lbn/c;->b:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lbn/c;->a(Ljava/lang/String;)[B

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static/range {v24 .. v24}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v4, v6}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v4

    move-object/from16 v34, v3

    iget-wide v2, v1, Lbn/c;->R:J

    invoke-virtual {v4, v2, v3}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static/range {v24 .. v24}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iget-wide v3, v1, Lbn/c;->S:J

    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v14, "audio/opus"

    const/16 v2, 0x1680

    move v4, v2

    const/4 v3, -0x1

    const/16 v18, 0x0

    const/16 v30, 0x5a

    :goto_c
    move-object v2, v0

    goto/16 :goto_24

    :pswitch_2
    move-object/from16 v34, v3

    invoke-virtual {v1, v4}, Lbn/c;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v14, "audio/flac"

    move-object v2, v0

    :goto_d
    const/4 v3, -0x1

    :goto_e
    const/4 v4, -0x1

    const/16 v18, 0x0

    :goto_f
    const/16 v30, 0x5a

    goto/16 :goto_24

    :pswitch_3
    move-object/from16 v34, v3

    const-string v14, "audio/eac3"

    :goto_10
    const/4 v2, 0x0

    goto :goto_d

    :pswitch_4
    move-object/from16 v34, v3

    const-string v14, "video/mpeg2"

    goto :goto_10

    :pswitch_5
    move-object/from16 v34, v3

    move-object v14, v15

    goto :goto_10

    :pswitch_6
    move-object/from16 v34, v3

    move-object v14, v8

    goto :goto_10

    :pswitch_7
    move-object/from16 v34, v3

    new-instance v0, Led3/a;

    invoke-virtual {v1, v4}, Lbn/c;->a(Ljava/lang/String;)[B

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v2, v4, v3}, Led3/a;-><init>([BIB)V

    invoke-static {v0}, Lmo/g;->a(Led3/a;)Lmo/g;

    move-result-object v0

    iget-object v2, v0, Lmo/g;->a:Ljava/util/List;

    iget v3, v0, Lmo/g;->b:I

    iput v3, v1, Lbn/c;->Y:I

    iget-object v0, v0, Lmo/g;->d:Ljava/lang/String;

    const-string v14, "video/hevc"

    move-object/from16 v18, v0

    const/4 v3, -0x1

    const/4 v4, -0x1

    goto :goto_f

    :pswitch_8
    move-object/from16 v34, v3

    sget-object v0, Lbn/d;->c0:[B

    invoke-virtual {v1, v4}, Lbn/c;->a(Ljava/lang/String;)[B

    move-result-object v2

    invoke-static {v0, v2}, Lzr/g0;->t(Ljava/lang/Object;Ljava/lang/Object;)Lzr/w0;

    move-result-object v0

    move-object v2, v0

    move-object v14, v9

    goto :goto_d

    :pswitch_9
    move-object/from16 v34, v3

    iget v2, v1, Lbn/c;->P:I

    invoke-static {v2}, Llo/y;->q(I)I

    move-result v2

    if-nez v2, :cond_55

    iget v2, v1, Lbn/c;->P:I

    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v4, 0x59

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Unsupported little endian PCM bit depth: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_11
    move-object v14, v10

    goto :goto_10

    :cond_55
    move v3, v2

    :goto_12
    move-object/from16 v14, v33

    const/4 v2, 0x0

    goto :goto_e

    :pswitch_a
    move-object/from16 v34, v3

    iget v2, v1, Lbn/c;->P:I

    move/from16 v3, v24

    if-ne v2, v3, :cond_56

    move-object/from16 v14, v33

    const/4 v2, 0x0

    const/4 v3, 0x3

    goto/16 :goto_e

    :cond_56
    const/16 v3, 0x10

    if-ne v2, v3, :cond_57

    const/high16 v0, 0x10000000

    move v3, v0

    goto :goto_12

    :cond_57
    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v4, 0x56

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Unsupported big endian PCM bit depth: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_11

    :pswitch_b
    move-object/from16 v34, v3

    iget v2, v1, Lbn/c;->P:I

    const/16 v3, 0x20

    if-ne v2, v3, :cond_58

    move-object/from16 v14, v33

    const/4 v2, 0x0

    const/4 v3, 0x4

    goto/16 :goto_e

    :cond_58
    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v4, 0x5a

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v14, "Unsupported floating point PCM bit depth: "

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move/from16 v30, v4

    :goto_13
    move-object v14, v10

    :goto_14
    const/4 v2, 0x0

    :goto_15
    const/4 v3, -0x1

    :goto_16
    const/4 v4, -0x1

    :goto_17
    const/16 v18, 0x0

    goto/16 :goto_24

    :pswitch_c
    move-object/from16 v34, v3

    goto/16 :goto_10

    :pswitch_d
    move-object/from16 v34, v3

    move-object v14, v13

    goto/16 :goto_10

    :pswitch_e
    move-object/from16 v34, v3

    const/16 v4, 0x5a

    const-string v14, "video/x-vnd.on2.vp9"

    :goto_18
    move/from16 v30, v4

    goto :goto_14

    :pswitch_f
    move-object/from16 v34, v3

    const/16 v4, 0x5a

    const-string v14, "video/x-vnd.on2.vp8"

    goto :goto_18

    :pswitch_10
    move-object/from16 v34, v3

    const/16 v4, 0x5a

    const-string v14, "video/av01"

    goto :goto_18

    :pswitch_11
    move-object/from16 v34, v3

    const/16 v4, 0x5a

    const-string v14, "audio/vnd.dts"

    goto :goto_18

    :pswitch_12
    move-object/from16 v34, v3

    const/16 v4, 0x5a

    const-string v14, "audio/ac3"

    goto :goto_18

    :pswitch_13
    move-object/from16 v34, v3

    const/16 v30, 0x5a

    invoke-virtual {v1, v4}, Lbn/c;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v2, v1, Lbn/c;->k:[B

    new-instance v3, Llo/s;

    array-length v4, v2

    const/4 v6, 0x0

    invoke-direct {v3, v2, v4, v6, v6}, Llo/s;-><init>([BIIB)V

    invoke-static {v3, v6}, Ltm/a;->f(Llo/s;Z)Lcom/iterable/iterableapi/q;

    move-result-object v2

    iget v3, v2, Lcom/iterable/iterableapi/q;->b:I

    iput v3, v1, Lbn/c;->Q:I

    iget v3, v2, Lcom/iterable/iterableapi/q;->c:I

    iput v3, v1, Lbn/c;->O:I

    iget-object v2, v2, Lcom/iterable/iterableapi/q;->a:Ljava/lang/String;

    const-string v14, "audio/mp4a-latm"

    move-object/from16 v18, v2

    const/4 v3, -0x1

    const/4 v4, -0x1

    goto/16 :goto_c

    :pswitch_14
    move-object/from16 v34, v3

    const/16 v30, 0x5a

    const-string v14, "audio/vnd.dts.hd"

    goto :goto_14

    :pswitch_15
    move-object/from16 v34, v3

    const/16 v30, 0x5a

    invoke-virtual {v1, v4}, Lbn/c;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object v0

    move-object v2, v0

    move-object v14, v12

    goto :goto_15

    :pswitch_16
    move-object/from16 v34, v3

    const/16 v30, 0x5a

    new-instance v0, Led3/a;

    invoke-virtual {v1, v4}, Lbn/c;->a(Ljava/lang/String;)[B

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v2, v4, v3}, Led3/a;-><init>([BIB)V

    invoke-static {v0}, Lmo/a;->a(Led3/a;)Lmo/a;

    move-result-object v0

    iget-object v2, v0, Lmo/a;->a:Ljava/util/ArrayList;

    iget v4, v0, Lmo/a;->b:I

    iput v4, v1, Lbn/c;->Y:I

    iget-object v0, v0, Lmo/a;->f:Ljava/lang/String;

    const-string v14, "video/avc"

    move-object/from16 v18, v0

    :goto_19
    const/4 v3, -0x1

    const/4 v4, -0x1

    goto/16 :goto_24

    :pswitch_17
    move-object/from16 v34, v3

    const/4 v0, 0x4

    const/4 v3, 0x0

    const/16 v30, 0x5a

    new-array v2, v0, [B

    invoke-virtual {v1, v4}, Lbn/c;->a(Ljava/lang/String;)[B

    move-result-object v4

    invoke-static {v4, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v2}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object v0

    move-object v2, v0

    move-object v14, v11

    goto/16 :goto_15

    :pswitch_18
    move-object/from16 v34, v3

    const/4 v3, 0x0

    const/16 v30, 0x5a

    new-instance v0, Led3/a;

    invoke-virtual {v1, v4}, Lbn/c;->a(Ljava/lang/String;)[B

    move-result-object v2

    const/4 v4, 0x1

    invoke-direct {v0, v2, v4, v3}, Led3/a;-><init>([BIB)V

    const/16 v3, 0x10

    :try_start_0
    invoke-virtual {v0, v3}, Led3/a;->L(I)V

    invoke-virtual {v0}, Led3/a;->m()J

    move-result-wide v2

    const-wide/32 v20, 0x58564944

    cmp-long v4, v2, v20

    if-nez v4, :cond_59

    new-instance v0, Landroid/util/Pair;

    const-string v2, "video/divx"
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v3, 0x0

    :try_start_1
    invoke-direct {v0, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1a
    const/4 v3, 0x0

    goto :goto_1c

    :catch_0
    const/4 v3, 0x0

    goto/16 :goto_1d

    :cond_59
    const-wide/32 v20, 0x33363248

    cmp-long v4, v2, v20

    if-nez v4, :cond_5a

    :try_start_2
    new-instance v0, Landroid/util/Pair;

    const-string v2, "video/3gpp"
    :try_end_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_0

    const/4 v3, 0x0

    :try_start_3
    invoke-direct {v0, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1a

    :cond_5a
    const-wide/32 v20, 0x31435657

    cmp-long v2, v2, v20

    if-nez v2, :cond_5e

    :try_start_4
    iget v2, v0, Led3/a;->b:I

    add-int/lit8 v2, v2, 0x14

    iget-object v0, v0, Led3/a;->a:[B

    :goto_1b
    array-length v3, v0

    const/16 v17, 0x4

    add-int/lit8 v3, v3, -0x4

    if-ge v2, v3, :cond_5d

    aget-byte v3, v0, v2

    if-nez v3, :cond_5b

    add-int/lit8 v3, v2, 0x1

    aget-byte v3, v0, v3

    if-nez v3, :cond_5b

    add-int/lit8 v3, v2, 0x2

    aget-byte v3, v0, v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_5b

    add-int/lit8 v3, v2, 0x3

    aget-byte v3, v0, v3

    const/16 v4, 0xf

    if-ne v3, v4, :cond_5c

    array-length v3, v0

    invoke-static {v0, v2, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    new-instance v2, Landroid/util/Pair;

    const-string v3, "video/wvc1"

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v0, v2

    goto :goto_1a

    :cond_5b
    const/16 v4, 0xf

    :cond_5c
    add-int/lit8 v2, v2, 0x1

    goto :goto_1b

    :cond_5d
    const-string v0, "Failed to find FourCC VC1 initialization data"
    :try_end_4
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_0

    const/4 v3, 0x0

    :try_start_5
    invoke-static {v3, v0}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_1

    :try_start_6
    throw v0
    :try_end_6
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_0

    :cond_5e
    const-string v0, "Unknown FourCC. Setting mimeType to video/x-unknown"

    invoke-static {v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Landroid/util/Pair;

    const/4 v3, 0x0

    invoke-direct {v0, v14, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1c
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object v14, v2

    check-cast v14, Ljava/lang/String;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object v2, v0

    move-object/from16 v18, v3

    goto/16 :goto_19

    :catch_1
    :goto_1d
    const-string v0, "Error parsing FourCC private data"

    invoke-static {v3, v0}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :pswitch_19
    move-object/from16 v34, v3

    const/16 v30, 0x5a

    const-string v14, "audio/mpeg"

    :goto_1e
    const/4 v2, 0x0

    const/4 v3, -0x1

    const/16 v4, 0x1000

    goto/16 :goto_17

    :pswitch_1a
    move-object/from16 v34, v3

    const/16 v30, 0x5a

    const-string v14, "audio/mpeg-L2"

    goto :goto_1e

    :pswitch_1b
    move-object/from16 v34, v3

    const/16 v30, 0x5a

    invoke-virtual {v1, v4}, Lbn/c;->a(Ljava/lang/String;)[B

    move-result-object v2

    const-string v3, "Error parsing vorbis codec private"

    const/16 v25, 0x0

    :try_start_7
    aget-byte v4, v2, v25

    const/4 v6, 0x2

    if-ne v4, v6, :cond_64

    const/4 v4, 0x0

    const/4 v6, 0x1

    :goto_1f
    aget-byte v10, v2, v6

    const/16 v14, 0xff

    and-int/2addr v10, v14

    if-ne v10, v14, :cond_5f

    add-int/lit16 v4, v4, 0xff

    add-int/lit8 v6, v6, 0x1

    goto :goto_1f

    :cond_5f
    add-int/lit8 v6, v6, 0x1

    add-int/2addr v4, v10

    const/4 v10, 0x0

    :goto_20
    aget-byte v0, v2, v6

    and-int/2addr v0, v14

    if-ne v0, v14, :cond_60

    add-int/lit16 v10, v10, 0xff

    add-int/lit8 v6, v6, 0x1

    goto :goto_20

    :cond_60
    add-int/lit8 v6, v6, 0x1

    add-int/2addr v10, v0

    aget-byte v0, v2, v6

    const/4 v14, 0x1

    if-ne v0, v14, :cond_63

    new-array v0, v4, [B

    const/4 v14, 0x0

    invoke-static {v2, v6, v0, v14, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v6, v4

    aget-byte v4, v2, v6

    const/4 v14, 0x3

    if-ne v4, v14, :cond_62

    add-int/2addr v6, v10

    aget-byte v4, v2, v6

    const/4 v10, 0x5

    if-ne v4, v10, :cond_61

    array-length v4, v2

    sub-int/2addr v4, v6

    new-array v4, v4, [B

    array-length v10, v2

    sub-int/2addr v10, v6

    const/4 v14, 0x0

    invoke-static {v2, v6, v4, v14, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v2, Ljava/util/ArrayList;

    const/4 v6, 0x2

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_2

    const-string v14, "audio/vorbis"

    const/16 v0, 0x2000

    move v4, v0

    const/4 v3, -0x1

    goto/16 :goto_17

    :catch_2
    const/4 v0, 0x0

    goto :goto_21

    :cond_61
    const/4 v0, 0x0

    :try_start_8
    invoke-static {v0, v3}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v1

    throw v1

    :cond_62
    const/4 v0, 0x0

    invoke-static {v0, v3}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v1

    throw v1

    :cond_63
    const/4 v0, 0x0

    invoke-static {v0, v3}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v1

    throw v1

    :cond_64
    const/4 v0, 0x0

    invoke-static {v0, v3}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v1

    throw v1
    :try_end_8
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_3

    :catch_3
    :goto_21
    invoke-static {v0, v3}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :pswitch_1c
    move-object/from16 v34, v3

    const/16 v30, 0x5a

    new-instance v0, Lt9/l0;

    const/4 v14, 0x1

    invoke-direct {v0, v14}, Lt9/l0;-><init>(I)V

    iput-object v0, v1, Lbn/c;->T:Lt9/l0;

    const-string v0, "audio/true-hd"

    move-object v14, v0

    goto/16 :goto_14

    :pswitch_1d
    move-object/from16 v34, v3

    const/4 v14, 0x1

    const/16 v30, 0x5a

    new-instance v2, Led3/a;

    invoke-virtual {v1, v4}, Lbn/c;->a(Ljava/lang/String;)[B

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v2, v3, v14, v4}, Led3/a;-><init>([BIB)V

    :try_start_9
    invoke-virtual {v2}, Led3/a;->o()I

    move-result v3

    if-ne v3, v14, :cond_65

    goto :goto_22

    :cond_65
    const v4, 0xfffe

    if-ne v3, v4, :cond_67

    const/16 v3, 0x18

    invoke-virtual {v2, v3}, Led3/a;->K(I)V

    invoke-virtual {v2}, Led3/a;->p()J

    move-result-wide v3

    sget-object v14, Lbn/d;->f0:Ljava/util/UUID;

    invoke-virtual {v14}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v16

    cmp-long v3, v3, v16

    if-nez v3, :cond_67

    invoke-virtual {v2}, Led3/a;->p()J

    move-result-wide v2

    invoke-virtual {v14}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v16
    :try_end_9
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_9 .. :try_end_9} :catch_4

    cmp-long v2, v2, v16

    if-nez v2, :cond_67

    :goto_22
    iget v2, v1, Lbn/c;->P:I

    invoke-static {v2}, Llo/y;->q(I)I

    move-result v2

    if-nez v2, :cond_66

    iget v2, v1, Lbn/c;->P:I

    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v4, 0x4b

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Unsupported PCM bit depth: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_13

    :cond_66
    move v3, v2

    move-object/from16 v14, v33

    const/4 v2, 0x0

    goto/16 :goto_16

    :cond_67
    const-string v0, "Non-PCM MS/ACM is unsupported. Setting mimeType to "

    invoke-virtual {v0, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_13

    :catch_4
    const-string v0, "Error parsing MS/ACM codec private"

    const/4 v3, 0x0

    invoke-static {v3, v0}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :pswitch_1e
    move-object/from16 v34, v3

    const/16 v30, 0x5a

    iget-object v2, v1, Lbn/c;->k:[B

    if-nez v2, :cond_68

    const/4 v2, 0x0

    goto :goto_23

    :cond_68
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    :goto_23
    const-string v14, "video/mp4v-es"

    goto/16 :goto_15

    :goto_24
    iget-object v6, v1, Lbn/c;->N:[B

    if-eqz v6, :cond_69

    new-instance v10, Led3/a;

    move-object/from16 v17, v14

    const/4 v0, 0x0

    const/4 v14, 0x1

    invoke-direct {v10, v6, v14, v0}, Led3/a;-><init>([BIB)V

    invoke-static {v10}, Ldb/j0;->k(Led3/a;)Ldb/j0;

    move-result-object v0

    if-eqz v0, :cond_6a

    iget-object v0, v0, Ldb/j0;->x:Ljava/lang/String;

    const-string v14, "video/dolby-vision"

    goto :goto_25

    :cond_69
    move-object/from16 v17, v14

    :cond_6a
    move-object/from16 v14, v17

    move-object/from16 v0, v18

    :goto_25
    iget-boolean v6, v1, Lbn/c;->V:Z

    iget-boolean v10, v1, Lbn/c;->U:Z

    if-eqz v10, :cond_6b

    const/4 v10, 0x2

    goto :goto_26

    :cond_6b
    const/4 v10, 0x0

    :goto_26
    or-int/2addr v6, v10

    new-instance v10, Lrm/b0;

    invoke-direct {v10}, Lrm/b0;-><init>()V

    invoke-static {v14}, Llo/m;->h(Ljava/lang/String;)Z

    move-result v17

    move-object/from16 v20, v5

    sget-object v5, Lbn/d;->g0:Ljava/util/Map;

    if-eqz v17, :cond_6c

    iget v8, v1, Lbn/c;->O:I

    iput v8, v10, Lrm/b0;->x:I

    iget v8, v1, Lbn/c;->Q:I

    iput v8, v10, Lrm/b0;->y:I

    iput v3, v10, Lrm/b0;->z:I

    const/4 v12, 0x1

    goto/16 :goto_30

    :cond_6c
    invoke-static {v14}, Llo/m;->j(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7a

    iget v3, v1, Lbn/c;->q:I

    if-nez v3, :cond_6f

    iget v3, v1, Lbn/c;->o:I

    const/4 v8, -0x1

    if-ne v3, v8, :cond_6d

    iget v3, v1, Lbn/c;->m:I

    :cond_6d
    iput v3, v1, Lbn/c;->o:I

    iget v3, v1, Lbn/c;->p:I

    if-ne v3, v8, :cond_6e

    iget v3, v1, Lbn/c;->n:I

    :cond_6e
    iput v3, v1, Lbn/c;->p:I

    goto :goto_27

    :cond_6f
    const/4 v8, -0x1

    :goto_27
    iget v3, v1, Lbn/c;->o:I

    if-eq v3, v8, :cond_70

    iget v9, v1, Lbn/c;->p:I

    if-eq v9, v8, :cond_70

    iget v8, v1, Lbn/c;->n:I

    mul-int/2addr v8, v3

    int-to-float v3, v8

    iget v8, v1, Lbn/c;->m:I

    mul-int/2addr v8, v9

    int-to-float v8, v8

    div-float/2addr v3, v8

    goto :goto_28

    :cond_70
    move/from16 v3, v26

    :goto_28
    iget-boolean v8, v1, Lbn/c;->x:Z

    if-eqz v8, :cond_73

    iget v8, v1, Lbn/c;->D:F

    cmpl-float v8, v8, v26

    if-eqz v8, :cond_72

    iget v8, v1, Lbn/c;->E:F

    cmpl-float v8, v8, v26

    if-eqz v8, :cond_72

    iget v8, v1, Lbn/c;->F:F

    cmpl-float v8, v8, v26

    if-eqz v8, :cond_72

    iget v8, v1, Lbn/c;->G:F

    cmpl-float v8, v8, v26

    if-eqz v8, :cond_72

    iget v8, v1, Lbn/c;->H:F

    cmpl-float v8, v8, v26

    if-eqz v8, :cond_72

    iget v8, v1, Lbn/c;->I:F

    cmpl-float v8, v8, v26

    if-eqz v8, :cond_72

    iget v8, v1, Lbn/c;->J:F

    cmpl-float v8, v8, v26

    if-eqz v8, :cond_72

    iget v8, v1, Lbn/c;->K:F

    cmpl-float v8, v8, v26

    if-eqz v8, :cond_72

    iget v8, v1, Lbn/c;->L:F

    cmpl-float v8, v8, v26

    if-eqz v8, :cond_72

    iget v8, v1, Lbn/c;->M:F

    cmpl-float v8, v8, v26

    if-nez v8, :cond_71

    goto/16 :goto_29

    :cond_71
    const/16 v8, 0x19

    new-array v8, v8, [B

    invoke-static {v8}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v9

    sget-object v11, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v9

    const/4 v11, 0x0

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    iget v11, v1, Lbn/c;->D:F

    const v12, 0x47435000    # 50000.0f

    mul-float/2addr v11, v12

    const/high16 v13, 0x3f000000    # 0.5f

    add-float/2addr v11, v13

    float-to-int v11, v11

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v1, Lbn/c;->E:F

    mul-float/2addr v11, v12

    add-float/2addr v11, v13

    float-to-int v11, v11

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v1, Lbn/c;->F:F

    mul-float/2addr v11, v12

    add-float/2addr v11, v13

    float-to-int v11, v11

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v1, Lbn/c;->G:F

    mul-float/2addr v11, v12

    add-float/2addr v11, v13

    float-to-int v11, v11

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v1, Lbn/c;->H:F

    mul-float/2addr v11, v12

    add-float/2addr v11, v13

    float-to-int v11, v11

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v1, Lbn/c;->I:F

    mul-float/2addr v11, v12

    add-float/2addr v11, v13

    float-to-int v11, v11

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v1, Lbn/c;->J:F

    mul-float/2addr v11, v12

    add-float/2addr v11, v13

    float-to-int v11, v11

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v1, Lbn/c;->K:F

    mul-float/2addr v11, v12

    add-float/2addr v11, v13

    float-to-int v11, v11

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v1, Lbn/c;->L:F

    add-float/2addr v11, v13

    float-to-int v11, v11

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v1, Lbn/c;->M:F

    add-float/2addr v11, v13

    float-to-int v11, v11

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v1, Lbn/c;->B:I

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v1, Lbn/c;->C:I

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    goto :goto_2a

    :cond_72
    :goto_29
    const/4 v8, 0x0

    :goto_2a
    new-instance v9, Lmo/b;

    iget v11, v1, Lbn/c;->y:I

    iget v12, v1, Lbn/c;->A:I

    iget v13, v1, Lbn/c;->z:I

    invoke-direct {v9, v11, v12, v13, v8}, Lmo/b;-><init>(III[B)V

    goto :goto_2b

    :cond_73
    const/4 v9, 0x0

    :goto_2b
    iget-object v8, v1, Lbn/c;->a:Ljava/lang/String;

    if-eqz v8, :cond_74

    invoke-interface {v5, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_74

    iget-object v8, v1, Lbn/c;->a:Ljava/lang/String;

    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    move/from16 v27, v8

    goto :goto_2c

    :cond_74
    const/16 v27, -0x1

    :goto_2c
    iget v8, v1, Lbn/c;->r:I

    if-nez v8, :cond_79

    iget v8, v1, Lbn/c;->s:F

    const/4 v11, 0x0

    invoke-static {v8, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-nez v8, :cond_79

    iget v8, v1, Lbn/c;->t:F

    invoke-static {v8, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-nez v8, :cond_79

    iget v8, v1, Lbn/c;->u:F

    invoke-static {v8, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-nez v8, :cond_75

    const/4 v8, 0x0

    goto :goto_2e

    :cond_75
    iget v8, v1, Lbn/c;->t:F

    const/high16 v11, 0x42b40000    # 90.0f

    invoke-static {v8, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-nez v8, :cond_76

    move/from16 v8, v30

    goto :goto_2e

    :cond_76
    iget v8, v1, Lbn/c;->t:F

    const/high16 v11, -0x3ccc0000    # -180.0f

    invoke-static {v8, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-eqz v8, :cond_78

    iget v8, v1, Lbn/c;->t:F

    const/high16 v11, 0x43340000    # 180.0f

    invoke-static {v8, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-nez v8, :cond_77

    goto :goto_2d

    :cond_77
    iget v8, v1, Lbn/c;->t:F

    const/high16 v11, -0x3d4c0000    # -90.0f

    invoke-static {v8, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-nez v8, :cond_79

    const/16 v8, 0x10e

    goto :goto_2e

    :cond_78
    :goto_2d
    const/16 v8, 0xb4

    goto :goto_2e

    :cond_79
    move/from16 v8, v27

    :goto_2e
    iget v11, v1, Lbn/c;->m:I

    iput v11, v10, Lrm/b0;->p:I

    iget v11, v1, Lbn/c;->n:I

    iput v11, v10, Lrm/b0;->q:I

    iput v3, v10, Lrm/b0;->t:F

    iput v8, v10, Lrm/b0;->s:I

    iget-object v3, v1, Lbn/c;->v:[B

    iput-object v3, v10, Lrm/b0;->u:[B

    iget v3, v1, Lbn/c;->w:I

    iput v3, v10, Lrm/b0;->v:I

    iput-object v9, v10, Lrm/b0;->w:Lmo/b;

    const/4 v12, 0x2

    goto :goto_30

    :cond_7a
    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7c

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7c

    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7c

    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7c

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7c

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7b

    goto :goto_2f

    :cond_7b
    const-string v0, "Unexpected MIME type."

    const/4 v3, 0x0

    invoke-static {v3, v0}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :cond_7c
    :goto_2f
    const/4 v12, 0x3

    :goto_30
    iget-object v3, v1, Lbn/c;->a:Ljava/lang/String;

    if-eqz v3, :cond_7d

    invoke-interface {v5, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7d

    iget-object v3, v1, Lbn/c;->a:Ljava/lang/String;

    iput-object v3, v10, Lrm/b0;->b:Ljava/lang/String;

    :cond_7d
    invoke-static/range {v32 .. v32}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v10, Lrm/b0;->a:Ljava/lang/String;

    iput-object v14, v10, Lrm/b0;->k:Ljava/lang/String;

    iput v4, v10, Lrm/b0;->l:I

    iget-object v3, v1, Lbn/c;->W:Ljava/lang/String;

    iput-object v3, v10, Lrm/b0;->c:Ljava/lang/String;

    iput v6, v10, Lrm/b0;->d:I

    iput-object v2, v10, Lrm/b0;->m:Ljava/util/List;

    iput-object v0, v10, Lrm/b0;->h:Ljava/lang/String;

    iget-object v0, v1, Lbn/c;->l:Lvm/c;

    iput-object v0, v10, Lrm/b0;->n:Lvm/c;

    new-instance v0, Lrm/c0;

    invoke-direct {v0, v10}, Lrm/c0;-><init>(Lrm/b0;)V

    iget v2, v1, Lbn/c;->c:I

    invoke-interface {v7, v2, v12}, Lwm/k;->o(II)Lwm/s;

    move-result-object v2

    iput-object v2, v1, Lbn/c;->X:Lwm/s;

    invoke-interface {v2, v0}, Lwm/s;->a(Lrm/c0;)V

    iget v0, v1, Lbn/c;->c:I

    move-object/from16 v2, v20

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v3, v34

    goto/16 :goto_9

    :goto_31
    iput-object v0, v3, Lbn/d;->u:Lbn/c;

    goto/16 :goto_6

    :cond_7e
    const/4 v0, 0x0

    const-string v1, "CodecId is missing in TrackEntry element"

    invoke-static {v0, v1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :cond_7f
    move-object v2, v5

    iget v0, v3, Lbn/d;->G:I

    const/4 v6, 0x2

    if-eq v0, v6, :cond_80

    :goto_32
    goto/16 :goto_6

    :cond_80
    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_33
    iget v4, v3, Lbn/d;->K:I

    if-ge v0, v4, :cond_81

    iget-object v4, v3, Lbn/d;->L:[I

    aget v4, v4, v0

    add-int/2addr v1, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_33

    :cond_81
    iget v0, v3, Lbn/d;->M:I

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbn/c;

    iget-object v2, v0, Lbn/c;->X:Lwm/s;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    :goto_34
    iget v4, v3, Lbn/d;->K:I

    if-ge v2, v4, :cond_83

    iget-wide v4, v3, Lbn/d;->H:J

    iget v6, v0, Lbn/c;->e:I

    mul-int/2addr v6, v2

    const/16 v7, 0x3e8

    div-int/2addr v6, v7

    int-to-long v6, v6

    add-long v31, v4, v6

    iget v4, v3, Lbn/d;->O:I

    if-nez v2, :cond_82

    iget-boolean v5, v3, Lbn/d;->Q:Z

    if-nez v5, :cond_82

    or-int/lit8 v4, v4, 0x1

    :cond_82
    move/from16 v33, v4

    iget-object v4, v3, Lbn/d;->L:[I

    aget v34, v4, v2

    sub-int v35, v1, v34

    move-object/from16 v30, v0

    move-object/from16 v29, v3

    invoke-virtual/range {v29 .. v35}, Lbn/d;->d(Lbn/c;JIII)V

    add-int/lit8 v2, v2, 0x1

    move/from16 v1, v35

    goto :goto_34

    :cond_83
    const/4 v4, 0x0

    iput v4, v3, Lbn/d;->G:I

    :goto_35
    move-object/from16 v1, p1

    move v14, v4

    :goto_36
    const/4 v5, 0x1

    goto/16 :goto_4d

    :cond_84
    const/4 v4, 0x0

    iget v1, v7, Lbn/b;->c:I

    const v2, 0x1f43b675

    if-nez v1, :cond_8b

    move-object/from16 v1, p1

    const/4 v3, 0x4

    const/4 v5, 0x1

    invoke-virtual {v9, v1, v5, v4, v3}, Lbn/e;->b(Lwm/j;ZZI)J

    move-result-wide v29

    const-wide/16 v5, -0x2

    cmp-long v5, v29, v5

    if-nez v5, :cond_89

    iget-object v5, v7, Lbn/b;->a:[B

    move-object v6, v1

    check-cast v6, Lwm/f;

    iput v4, v6, Lwm/f;->F:I

    :goto_37
    move-object v6, v1

    check-cast v6, Lwm/f;

    invoke-virtual {v6, v5, v4, v3, v4}, Lwm/f;->c([BIIZ)Z

    aget-byte v3, v5, v4

    const/4 v4, 0x0

    :goto_38
    const/16 v13, 0x8

    if-ge v4, v13, :cond_86

    sget-object v13, Lbn/e;->d:[J

    aget-wide v29, v13, v4

    int-to-long v12, v3

    and-long v12, v29, v12

    cmp-long v12, v12, v18

    if-eqz v12, :cond_85

    add-int/lit8 v3, v4, 0x1

    :goto_39
    const/4 v4, -0x1

    goto :goto_3a

    :cond_85
    add-int/lit8 v4, v4, 0x1

    const/16 v12, 0xae

    goto :goto_38

    :cond_86
    const/4 v3, -0x1

    goto :goto_39

    :goto_3a
    if-eq v3, v4, :cond_87

    const/4 v4, 0x4

    if-gt v3, v4, :cond_87

    const/4 v4, 0x0

    invoke-static {v3, v4, v5}, Lbn/e;->a(IZ[B)J

    move-result-wide v12

    long-to-int v4, v12

    iget-object v12, v7, Lbn/b;->g:Ljava/lang/Object;

    check-cast v12, Lro/i;

    iget-object v12, v12, Lro/i;->x:Ljava/lang/Object;

    if-eq v4, v11, :cond_88

    if-eq v4, v2, :cond_88

    const v12, 0x1c53bb6b

    if-eq v4, v12, :cond_88

    if-ne v4, v15, :cond_87

    goto :goto_3b

    :cond_87
    const/4 v4, 0x1

    goto :goto_3d

    :cond_88
    :goto_3b
    invoke-virtual {v6, v3}, Lwm/f;->n(I)V

    int-to-long v3, v4

    move-wide v5, v3

    :goto_3c
    const/4 v4, 0x1

    goto :goto_3e

    :goto_3d
    invoke-virtual {v6, v4}, Lwm/f;->n(I)V

    const/4 v3, 0x4

    const/4 v4, 0x0

    const/16 v12, 0xae

    goto :goto_37

    :cond_89
    move-wide/from16 v5, v29

    goto :goto_3c

    :goto_3e
    cmp-long v3, v5, v22

    if-nez v3, :cond_8a

    const/4 v5, 0x0

    const/4 v14, 0x0

    goto/16 :goto_4d

    :cond_8a
    long-to-int v3, v5

    iput v3, v7, Lbn/b;->d:I

    iput v4, v7, Lbn/b;->c:I

    goto :goto_3f

    :cond_8b
    move-object/from16 v1, p1

    const/4 v4, 0x1

    :goto_3f
    iget v3, v7, Lbn/b;->c:I

    if-ne v3, v4, :cond_8c

    const/4 v3, 0x0

    const/16 v13, 0x8

    invoke-virtual {v9, v1, v3, v4, v13}, Lbn/e;->b(Lwm/j;ZZI)J

    move-result-wide v5

    iput-wide v5, v7, Lbn/b;->e:J

    const/4 v6, 0x2

    iput v6, v7, Lbn/b;->c:I

    :cond_8c
    iget-object v3, v7, Lbn/b;->g:Ljava/lang/Object;

    check-cast v3, Lro/i;

    iget v4, v7, Lbn/b;->d:I

    iget-object v5, v3, Lro/i;->x:Ljava/lang/Object;

    sparse-switch v4, :sswitch_data_2

    const/4 v5, 0x0

    goto :goto_40

    :sswitch_42
    const/4 v5, 0x5

    goto :goto_40

    :sswitch_43
    const/4 v5, 0x4

    goto :goto_40

    :sswitch_44
    const/4 v5, 0x1

    goto :goto_40

    :sswitch_45
    const/4 v5, 0x3

    goto :goto_40

    :sswitch_46
    const/4 v5, 0x2

    :goto_40
    if-eqz v5, :cond_b1

    const/4 v6, 0x1

    if-eq v5, v6, :cond_a0

    const-wide/16 v8, 0x8

    const/4 v6, 0x2

    if-eq v5, v6, :cond_9e

    const/4 v14, 0x3

    if-eq v5, v14, :cond_94

    const/4 v2, 0x4

    if-eq v5, v2, :cond_93

    const/4 v10, 0x5

    if-ne v5, v10, :cond_92

    iget-wide v5, v7, Lbn/b;->e:J

    const-wide/16 v10, 0x4

    cmp-long v2, v5, v10

    if-eqz v2, :cond_8e

    cmp-long v2, v5, v8

    if-nez v2, :cond_8d

    goto :goto_41

    :cond_8d
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x28

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Invalid float size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v0, 0x0

    invoke-static {v0, v1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :cond_8e
    :goto_41
    long-to-int v0, v5

    invoke-virtual {v7, v1, v0}, Lbn/b;->b(Lwm/j;I)J

    move-result-wide v5

    const/4 v2, 0x4

    if-ne v0, v2, :cond_8f

    long-to-int v0, v5

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    float-to-double v5, v0

    goto :goto_42

    :cond_8f
    invoke-static {v5, v6}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v5

    :goto_42
    iget-object v0, v3, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, Lbn/d;

    const/16 v2, 0xb5

    if-eq v4, v2, :cond_91

    const/16 v2, 0x4489

    if-eq v4, v2, :cond_90

    packed-switch v4, :pswitch_data_2

    packed-switch v4, :pswitch_data_3

    :goto_43
    const/4 v3, 0x0

    goto/16 :goto_44

    :pswitch_1f
    invoke-virtual {v0, v4}, Lbn/d;->c(I)V

    iget-object v0, v0, Lbn/d;->u:Lbn/c;

    double-to-float v2, v5

    iput v2, v0, Lbn/c;->u:F

    goto :goto_43

    :pswitch_20
    invoke-virtual {v0, v4}, Lbn/d;->c(I)V

    iget-object v0, v0, Lbn/d;->u:Lbn/c;

    double-to-float v2, v5

    iput v2, v0, Lbn/c;->t:F

    goto :goto_43

    :pswitch_21
    invoke-virtual {v0, v4}, Lbn/d;->c(I)V

    iget-object v0, v0, Lbn/d;->u:Lbn/c;

    double-to-float v2, v5

    iput v2, v0, Lbn/c;->s:F

    goto :goto_43

    :pswitch_22
    invoke-virtual {v0, v4}, Lbn/d;->c(I)V

    iget-object v0, v0, Lbn/d;->u:Lbn/c;

    double-to-float v2, v5

    iput v2, v0, Lbn/c;->M:F

    goto :goto_43

    :pswitch_23
    invoke-virtual {v0, v4}, Lbn/d;->c(I)V

    iget-object v0, v0, Lbn/d;->u:Lbn/c;

    double-to-float v2, v5

    iput v2, v0, Lbn/c;->L:F

    goto :goto_43

    :pswitch_24
    invoke-virtual {v0, v4}, Lbn/d;->c(I)V

    iget-object v0, v0, Lbn/d;->u:Lbn/c;

    double-to-float v2, v5

    iput v2, v0, Lbn/c;->K:F

    goto :goto_43

    :pswitch_25
    invoke-virtual {v0, v4}, Lbn/d;->c(I)V

    iget-object v0, v0, Lbn/d;->u:Lbn/c;

    double-to-float v2, v5

    iput v2, v0, Lbn/c;->J:F

    goto :goto_43

    :pswitch_26
    invoke-virtual {v0, v4}, Lbn/d;->c(I)V

    iget-object v0, v0, Lbn/d;->u:Lbn/c;

    double-to-float v2, v5

    iput v2, v0, Lbn/c;->I:F

    goto :goto_43

    :pswitch_27
    invoke-virtual {v0, v4}, Lbn/d;->c(I)V

    iget-object v0, v0, Lbn/d;->u:Lbn/c;

    double-to-float v2, v5

    iput v2, v0, Lbn/c;->H:F

    goto :goto_43

    :pswitch_28
    invoke-virtual {v0, v4}, Lbn/d;->c(I)V

    iget-object v0, v0, Lbn/d;->u:Lbn/c;

    double-to-float v2, v5

    iput v2, v0, Lbn/c;->G:F

    goto :goto_43

    :pswitch_29
    invoke-virtual {v0, v4}, Lbn/d;->c(I)V

    iget-object v0, v0, Lbn/d;->u:Lbn/c;

    double-to-float v2, v5

    iput v2, v0, Lbn/c;->F:F

    goto :goto_43

    :pswitch_2a
    invoke-virtual {v0, v4}, Lbn/d;->c(I)V

    iget-object v0, v0, Lbn/d;->u:Lbn/c;

    double-to-float v2, v5

    iput v2, v0, Lbn/c;->E:F

    goto :goto_43

    :pswitch_2b
    invoke-virtual {v0, v4}, Lbn/d;->c(I)V

    iget-object v0, v0, Lbn/d;->u:Lbn/c;

    double-to-float v2, v5

    iput v2, v0, Lbn/c;->D:F

    goto :goto_43

    :cond_90
    double-to-long v2, v5

    iput-wide v2, v0, Lbn/d;->s:J

    goto :goto_43

    :cond_91
    invoke-virtual {v0, v4}, Lbn/d;->c(I)V

    iget-object v0, v0, Lbn/d;->u:Lbn/c;

    double-to-int v2, v5

    iput v2, v0, Lbn/c;->Q:I

    goto/16 :goto_43

    :goto_44
    iput v3, v7, Lbn/b;->c:I

    :goto_45
    move v14, v3

    goto/16 :goto_36

    :cond_92
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Invalid element type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v0, 0x0

    invoke-static {v0, v1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :cond_93
    iget-wide v5, v7, Lbn/b;->e:J

    long-to-int v0, v5

    invoke-virtual {v3, v4, v0, v1}, Lro/i;->o(IILwm/j;)V

    const/4 v3, 0x0

    iput v3, v7, Lbn/b;->c:I

    goto :goto_45

    :cond_94
    iget-wide v5, v7, Lbn/b;->e:J

    const-wide/32 v8, 0x7fffffff

    cmp-long v2, v5, v8

    if-gtz v2, :cond_9d

    long-to-int v2, v5

    if-nez v2, :cond_95

    const-string v2, ""

    goto :goto_47

    :cond_95
    new-array v5, v2, [B

    move-object v6, v1

    check-cast v6, Lwm/f;

    const/4 v14, 0x0

    invoke-virtual {v6, v5, v14, v2, v14}, Lwm/f;->f([BIIZ)Z

    :goto_46
    if-lez v2, :cond_96

    add-int/lit8 v6, v2, -0x1

    aget-byte v6, v5, v6

    if-nez v6, :cond_96

    add-int/lit8 v2, v2, -0x1

    goto :goto_46

    :cond_96
    new-instance v6, Ljava/lang/String;

    const/4 v14, 0x0

    invoke-direct {v6, v5, v14, v2}, Ljava/lang/String;-><init>([BII)V

    move-object v2, v6

    :goto_47
    iget-object v3, v3, Lro/i;->x:Ljava/lang/Object;

    check-cast v3, Lbn/d;

    const/16 v5, 0x86

    if-eq v4, v5, :cond_9c

    const/16 v5, 0x4282

    if-eq v4, v5, :cond_9a

    const/16 v0, 0x536e

    if-eq v4, v0, :cond_99

    const v0, 0x22b59c

    if-eq v4, v0, :cond_97

    goto :goto_48

    :cond_97
    invoke-virtual {v3, v4}, Lbn/d;->c(I)V

    iget-object v0, v3, Lbn/d;->u:Lbn/c;

    iput-object v2, v0, Lbn/c;->W:Ljava/lang/String;

    :cond_98
    :goto_48
    const/4 v3, 0x0

    goto :goto_49

    :cond_99
    invoke-virtual {v3, v4}, Lbn/d;->c(I)V

    iget-object v0, v3, Lbn/d;->u:Lbn/c;

    iput-object v2, v0, Lbn/c;->a:Ljava/lang/String;

    goto :goto_48

    :cond_9a
    const-string v3, "webm"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_98

    const-string v3, "matroska"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9b

    goto :goto_48

    :cond_9b
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x16

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "DocType "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " not supported"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v0, 0x0

    invoke-static {v0, v1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :cond_9c
    invoke-virtual {v3, v4}, Lbn/d;->c(I)V

    iget-object v0, v3, Lbn/d;->u:Lbn/c;

    iput-object v2, v0, Lbn/c;->b:Ljava/lang/String;

    goto :goto_48

    :goto_49
    iput v3, v7, Lbn/b;->c:I

    goto/16 :goto_45

    :cond_9d
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x29

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "String element size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v0, 0x0

    invoke-static {v0, v1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :cond_9e
    iget-wide v5, v7, Lbn/b;->e:J

    cmp-long v2, v5, v8

    if-gtz v2, :cond_9f

    long-to-int v0, v5

    invoke-virtual {v7, v1, v0}, Lbn/b;->b(Lwm/j;I)J

    move-result-wide v5

    invoke-virtual {v3, v4, v5, v6}, Lro/i;->v(IJ)V

    const/4 v3, 0x0

    iput v3, v7, Lbn/b;->c:I

    goto/16 :goto_45

    :cond_9f
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x2a

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Invalid integer size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v0, 0x0

    invoke-static {v0, v1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :cond_a0
    move-object v3, v1

    check-cast v3, Lwm/f;

    iget-wide v5, v3, Lwm/f;->z:J

    iget-wide v11, v7, Lbn/b;->e:J

    add-long/2addr v11, v5

    new-instance v3, Lbn/a;

    invoke-direct {v3, v4, v11, v12}, Lbn/a;-><init>(IJ)V

    invoke-virtual {v8, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    iget-object v3, v7, Lbn/b;->g:Ljava/lang/Object;

    check-cast v3, Lro/i;

    iget v4, v7, Lbn/b;->d:I

    iget-wide v8, v7, Lbn/b;->e:J

    iget-object v3, v3, Lro/i;->x:Ljava/lang/Object;

    check-cast v3, Lbn/d;

    iget-object v11, v3, Lbn/d;->a0:Lwm/k;

    invoke-static {v11}, Llo/a;->j(Ljava/lang/Object;)V

    if-eq v4, v10, :cond_ad

    const/16 v10, 0xae

    if-eq v4, v10, :cond_ac

    const/16 v10, 0xbb

    if-eq v4, v10, :cond_ab

    if-eq v4, v14, :cond_aa

    const/16 v10, 0x5035

    if-eq v4, v10, :cond_a9

    const/16 v10, 0x55d0

    if-eq v4, v10, :cond_a8

    const v10, 0x18538067

    if-eq v4, v10, :cond_a5

    const v12, 0x1c53bb6b

    if-eq v4, v12, :cond_a4

    if-eq v4, v2, :cond_a1

    goto :goto_4a

    :cond_a1
    iget-boolean v0, v3, Lbn/d;->v:Z

    if-nez v0, :cond_a2

    iget-boolean v0, v3, Lbn/d;->d:Z

    if-eqz v0, :cond_a3

    iget-wide v4, v3, Lbn/d;->z:J

    cmp-long v0, v4, v22

    if-eqz v0, :cond_a3

    const/4 v4, 0x1

    iput-boolean v4, v3, Lbn/d;->y:Z

    :cond_a2
    :goto_4a
    const/4 v14, 0x0

    goto/16 :goto_4c

    :cond_a3
    const/4 v4, 0x1

    iget-object v0, v3, Lbn/d;->a0:Lwm/k;

    new-instance v2, Lwm/l;

    iget-wide v5, v3, Lbn/d;->t:J

    invoke-direct {v2, v5, v6}, Lwm/l;-><init>(J)V

    invoke-interface {v0, v2}, Lwm/k;->x(Lwm/p;)V

    iput-boolean v4, v3, Lbn/d;->v:Z

    goto :goto_4a

    :cond_a4
    new-instance v0, Llo/k;

    const/4 v14, 0x0

    invoke-direct {v0, v14, v14}, Llo/k;-><init>(IB)V

    iput-object v0, v3, Lbn/d;->C:Llo/k;

    new-instance v0, Llo/k;

    invoke-direct {v0, v14, v14}, Llo/k;-><init>(IB)V

    iput-object v0, v3, Lbn/d;->D:Llo/k;

    goto :goto_4a

    :cond_a5
    iget-wide v10, v3, Lbn/d;->q:J

    cmp-long v2, v10, v22

    if-eqz v2, :cond_a7

    cmp-long v2, v10, v5

    if-nez v2, :cond_a6

    goto :goto_4b

    :cond_a6
    const-string v1, "Multiple Segment elements not supported"

    const/4 v0, 0x0

    invoke-static {v0, v1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :cond_a7
    :goto_4b
    iput-wide v5, v3, Lbn/d;->q:J

    iput-wide v8, v3, Lbn/d;->p:J

    goto :goto_4a

    :cond_a8
    invoke-virtual {v3, v4}, Lbn/d;->c(I)V

    iget-object v0, v3, Lbn/d;->u:Lbn/c;

    const/4 v14, 0x1

    iput-boolean v14, v0, Lbn/c;->x:Z

    goto :goto_4a

    :cond_a9
    const/4 v14, 0x1

    invoke-virtual {v3, v4}, Lbn/d;->c(I)V

    iget-object v0, v3, Lbn/d;->u:Lbn/c;

    iput-boolean v14, v0, Lbn/c;->h:Z

    goto :goto_4a

    :cond_aa
    const/4 v4, -0x1

    iput v4, v3, Lbn/d;->w:I

    move-wide/from16 v4, v22

    iput-wide v4, v3, Lbn/d;->x:J

    goto :goto_4a

    :cond_ab
    const/4 v14, 0x0

    iput-boolean v14, v3, Lbn/d;->E:Z

    goto :goto_4c

    :cond_ac
    const/4 v4, -0x1

    const/4 v14, 0x0

    new-instance v2, Lbn/c;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput v4, v2, Lbn/c;->m:I

    iput v4, v2, Lbn/c;->n:I

    iput v4, v2, Lbn/c;->o:I

    iput v4, v2, Lbn/c;->p:I

    iput v14, v2, Lbn/c;->q:I

    iput v4, v2, Lbn/c;->r:I

    const/4 v11, 0x0

    iput v11, v2, Lbn/c;->s:F

    iput v11, v2, Lbn/c;->t:F

    iput v11, v2, Lbn/c;->u:F

    const/4 v0, 0x0

    iput-object v0, v2, Lbn/c;->v:[B

    iput v4, v2, Lbn/c;->w:I

    iput-boolean v14, v2, Lbn/c;->x:Z

    iput v4, v2, Lbn/c;->y:I

    iput v4, v2, Lbn/c;->z:I

    iput v4, v2, Lbn/c;->A:I

    const/16 v0, 0x3e8

    iput v0, v2, Lbn/c;->B:I

    const/16 v0, 0xc8

    iput v0, v2, Lbn/c;->C:I

    move/from16 v0, v26

    iput v0, v2, Lbn/c;->D:F

    iput v0, v2, Lbn/c;->E:F

    iput v0, v2, Lbn/c;->F:F

    iput v0, v2, Lbn/c;->G:F

    iput v0, v2, Lbn/c;->H:F

    iput v0, v2, Lbn/c;->I:F

    iput v0, v2, Lbn/c;->J:F

    iput v0, v2, Lbn/c;->K:F

    iput v0, v2, Lbn/c;->L:F

    iput v0, v2, Lbn/c;->M:F

    const/4 v4, 0x1

    iput v4, v2, Lbn/c;->O:I

    const/4 v8, -0x1

    iput v8, v2, Lbn/c;->P:I

    const/16 v0, 0x1f40

    iput v0, v2, Lbn/c;->Q:I

    move-wide/from16 v5, v18

    iput-wide v5, v2, Lbn/c;->R:J

    iput-wide v5, v2, Lbn/c;->S:J

    iput-boolean v4, v2, Lbn/c;->V:Z

    const-string v0, "eng"

    iput-object v0, v2, Lbn/c;->W:Ljava/lang/String;

    iput-object v2, v3, Lbn/d;->u:Lbn/c;

    goto/16 :goto_4a

    :cond_ad
    const/4 v14, 0x0

    iput-boolean v14, v3, Lbn/d;->Q:Z

    :goto_4c
    iput v14, v7, Lbn/b;->c:I

    goto/16 :goto_36

    :goto_4d
    if-eqz v5, :cond_af

    move-object v0, v1

    check-cast v0, Lwm/f;

    iget-wide v2, v0, Lwm/f;->z:J

    move-object/from16 v0, p0

    iget-boolean v4, v0, Lbn/d;->y:Z

    if-eqz v4, :cond_ae

    iput-wide v2, v0, Lbn/d;->A:J

    iget-wide v1, v0, Lbn/d;->z:J

    move-object/from16 v3, p2

    iput-wide v1, v3, Lt9/s;->a:J

    iput-boolean v14, v0, Lbn/d;->y:Z

    const/16 v28, 0x1

    return v28

    :cond_ae
    move-object/from16 v3, p2

    const/16 v28, 0x1

    iget-boolean v2, v0, Lbn/d;->v:Z

    if-eqz v2, :cond_b0

    iget-wide v6, v0, Lbn/d;->A:J

    const-wide/16 v8, -0x1

    cmp-long v2, v6, v8

    if-eqz v2, :cond_b0

    iput-wide v6, v3, Lt9/s;->a:J

    iput-wide v8, v0, Lbn/d;->A:J

    return v28

    :cond_af
    const/16 v28, 0x1

    move-object/from16 v0, p0

    move-object/from16 v3, p2

    :cond_b0
    const/4 v3, 0x0

    goto/16 :goto_0

    :cond_b1
    move-object/from16 v0, p0

    move-object/from16 v3, p2

    const/16 v28, 0x1

    iget-wide v4, v7, Lbn/b;->e:J

    long-to-int v2, v4

    move-object v4, v1

    check-cast v4, Lwm/f;

    invoke-virtual {v4, v2}, Lwm/f;->n(I)V

    const/4 v14, 0x0

    iput v14, v7, Lbn/b;->c:I

    move v3, v14

    goto/16 :goto_1

    :cond_b2
    if-nez v5, :cond_b5

    const/4 v3, 0x0

    :goto_4e
    iget-object v1, v0, Lbn/d;->c:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v3, v2, :cond_b4

    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbn/c;

    iget-object v2, v1, Lbn/c;->X:Lwm/s;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Lbn/c;->T:Lt9/l0;

    if-eqz v2, :cond_b3

    iget-object v4, v1, Lbn/c;->X:Lwm/s;

    iget-object v1, v1, Lbn/c;->j:Lwm/r;

    invoke-virtual {v2, v4, v1}, Lt9/l0;->b(Lwm/s;Lwm/r;)V

    :cond_b3
    add-int/lit8 v3, v3, 0x1

    goto :goto_4e

    :cond_b4
    const/16 v27, -0x1

    return v27

    :cond_b5
    const/16 v25, 0x0

    return v25

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ce7f5de -> :sswitch_20
        -0x7ce7f3b0 -> :sswitch_1f
        -0x76567dc0 -> :sswitch_1e
        -0x6a615338 -> :sswitch_1d
        -0x672350af -> :sswitch_1c
        -0x585f4fce -> :sswitch_1b
        -0x585f4fcd -> :sswitch_1a
        -0x51dc40b2 -> :sswitch_19
        -0x37a9c464 -> :sswitch_18
        -0x2016c535 -> :sswitch_17
        -0x2016c4e5 -> :sswitch_16
        -0x19552dbd -> :sswitch_15
        -0x1538b2ba -> :sswitch_14
        0x3c02325 -> :sswitch_13
        0x3c02353 -> :sswitch_12
        0x3c030c5 -> :sswitch_11
        0x4e81333 -> :sswitch_10
        0x4e86155 -> :sswitch_f
        0x4e86156 -> :sswitch_e
        0x5e8da3e -> :sswitch_d
        0x1a8350d6 -> :sswitch_c
        0x2056f406 -> :sswitch_b
        0x25e26ee2 -> :sswitch_a
        0x2b45174d -> :sswitch_9
        0x2b453ce4 -> :sswitch_8
        0x2c0618eb -> :sswitch_7
        0x32fdf009 -> :sswitch_6
        0x3e4ca2d8 -> :sswitch_5
        0x54c61e47 -> :sswitch_4
        0x6bd6c624 -> :sswitch_3
        0x7446132a -> :sswitch_2
        0x7446b0a6 -> :sswitch_1
        0x744ad97d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x7ce7f5de -> :sswitch_41
        -0x7ce7f3b0 -> :sswitch_40
        -0x76567dc0 -> :sswitch_3f
        -0x6a615338 -> :sswitch_3e
        -0x672350af -> :sswitch_3d
        -0x585f4fce -> :sswitch_3c
        -0x585f4fcd -> :sswitch_3b
        -0x51dc40b2 -> :sswitch_3a
        -0x37a9c464 -> :sswitch_39
        -0x2016c535 -> :sswitch_38
        -0x2016c4e5 -> :sswitch_37
        -0x19552dbd -> :sswitch_36
        -0x1538b2ba -> :sswitch_35
        0x3c02325 -> :sswitch_34
        0x3c02353 -> :sswitch_33
        0x3c030c5 -> :sswitch_32
        0x4e81333 -> :sswitch_31
        0x4e86155 -> :sswitch_30
        0x4e86156 -> :sswitch_2f
        0x5e8da3e -> :sswitch_2e
        0x1a8350d6 -> :sswitch_2d
        0x2056f406 -> :sswitch_2c
        0x25e26ee2 -> :sswitch_2b
        0x2b45174d -> :sswitch_2a
        0x2b453ce4 -> :sswitch_29
        0x2c0618eb -> :sswitch_28
        0x32fdf009 -> :sswitch_27
        0x3e4ca2d8 -> :sswitch_26
        0x54c61e47 -> :sswitch_25
        0x6bd6c624 -> :sswitch_24
        0x7446132a -> :sswitch_23
        0x7446b0a6 -> :sswitch_22
        0x744ad97d -> :sswitch_21
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1e
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_1e
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_11
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        0x83 -> :sswitch_46
        0x86 -> :sswitch_45
        0x88 -> :sswitch_46
        0x9b -> :sswitch_46
        0x9f -> :sswitch_46
        0xa0 -> :sswitch_44
        0xa1 -> :sswitch_43
        0xa3 -> :sswitch_43
        0xa5 -> :sswitch_43
        0xa6 -> :sswitch_44
        0xae -> :sswitch_44
        0xb0 -> :sswitch_46
        0xb3 -> :sswitch_46
        0xb5 -> :sswitch_42
        0xb7 -> :sswitch_44
        0xba -> :sswitch_46
        0xbb -> :sswitch_44
        0xd7 -> :sswitch_46
        0xe0 -> :sswitch_44
        0xe1 -> :sswitch_44
        0xe7 -> :sswitch_46
        0xee -> :sswitch_46
        0xf1 -> :sswitch_46
        0xfb -> :sswitch_46
        0x41e4 -> :sswitch_44
        0x41e7 -> :sswitch_46
        0x41ed -> :sswitch_43
        0x4254 -> :sswitch_46
        0x4255 -> :sswitch_43
        0x4282 -> :sswitch_45
        0x4285 -> :sswitch_46
        0x42f7 -> :sswitch_46
        0x4489 -> :sswitch_42
        0x47e1 -> :sswitch_46
        0x47e2 -> :sswitch_43
        0x47e7 -> :sswitch_44
        0x47e8 -> :sswitch_46
        0x4dbb -> :sswitch_44
        0x5031 -> :sswitch_46
        0x5032 -> :sswitch_46
        0x5034 -> :sswitch_44
        0x5035 -> :sswitch_44
        0x536e -> :sswitch_45
        0x53ab -> :sswitch_43
        0x53ac -> :sswitch_46
        0x53b8 -> :sswitch_46
        0x54b0 -> :sswitch_46
        0x54b2 -> :sswitch_46
        0x54ba -> :sswitch_46
        0x55aa -> :sswitch_46
        0x55b0 -> :sswitch_44
        0x55b9 -> :sswitch_46
        0x55ba -> :sswitch_46
        0x55bb -> :sswitch_46
        0x55bc -> :sswitch_46
        0x55bd -> :sswitch_46
        0x55d0 -> :sswitch_44
        0x55d1 -> :sswitch_42
        0x55d2 -> :sswitch_42
        0x55d3 -> :sswitch_42
        0x55d4 -> :sswitch_42
        0x55d5 -> :sswitch_42
        0x55d6 -> :sswitch_42
        0x55d7 -> :sswitch_42
        0x55d8 -> :sswitch_42
        0x55d9 -> :sswitch_42
        0x55da -> :sswitch_42
        0x55ee -> :sswitch_46
        0x56aa -> :sswitch_46
        0x56bb -> :sswitch_46
        0x6240 -> :sswitch_44
        0x6264 -> :sswitch_46
        0x63a2 -> :sswitch_43
        0x6d80 -> :sswitch_44
        0x75a1 -> :sswitch_44
        0x7670 -> :sswitch_44
        0x7671 -> :sswitch_46
        0x7672 -> :sswitch_43
        0x7673 -> :sswitch_42
        0x7674 -> :sswitch_42
        0x7675 -> :sswitch_42
        0x22b59c -> :sswitch_45
        0x23e383 -> :sswitch_46
        0x2ad7b1 -> :sswitch_46
        0x114d9b74 -> :sswitch_44
        0x1549a966 -> :sswitch_44
        0x1654ae6b -> :sswitch_44
        0x18538067 -> :sswitch_44
        0x1a45dfa3 -> :sswitch_44
        0x1c53bb6b -> :sswitch_44
        0x1f43b675 -> :sswitch_44
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x55d1
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x7673
        :pswitch_21
        :pswitch_20
        :pswitch_1f
    .end packed-switch
.end method

.method public final j()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lbn/d;->R:I

    iput v0, p0, Lbn/d;->S:I

    iput v0, p0, Lbn/d;->T:I

    iput-boolean v0, p0, Lbn/d;->U:Z

    iput-boolean v0, p0, Lbn/d;->V:Z

    iput-boolean v0, p0, Lbn/d;->W:Z

    iput v0, p0, Lbn/d;->X:I

    iput-byte v0, p0, Lbn/d;->Y:B

    iput-boolean v0, p0, Lbn/d;->Z:Z

    iget-object v1, p0, Lbn/d;->j:Led3/a;

    invoke-virtual {v1, v0}, Led3/a;->H(I)V

    return-void
.end method

.method public final k(J)J
    .locals 6

    iget-wide v2, p0, Lbn/d;->r:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    const-wide/16 v4, 0x3e8

    move-wide v0, p1

    invoke-static/range {v0 .. v5}, Llo/y;->D(JJJ)J

    move-result-wide p1

    return-wide p1

    :cond_0
    const-string p1, "Can\'t scale timecode prior to timecodeScale being set."

    const/4 p2, 0x0

    invoke-static {p2, p1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p1

    throw p1
.end method

.method public final l(Lwm/j;Lbn/c;I)I
    .locals 12

    const-string v0, "S_TEXT/UTF8"

    iget-object v1, p2, Lbn/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lbn/d;->b0:[B

    invoke-virtual {p0, p1, p2, p3}, Lbn/d;->m(Lwm/j;[BI)V

    iget p1, p0, Lbn/d;->S:I

    invoke-virtual {p0}, Lbn/d;->j()V

    return p1

    :cond_0
    const-string v0, "S_TEXT/ASS"

    iget-object v1, p2, Lbn/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p2, Lbn/d;->d0:[B

    invoke-virtual {p0, p1, p2, p3}, Lbn/d;->m(Lwm/j;[BI)V

    iget p1, p0, Lbn/d;->S:I

    invoke-virtual {p0}, Lbn/d;->j()V

    return p1

    :cond_1
    const-string v0, "S_TEXT/WEBVTT"

    iget-object v1, p2, Lbn/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p2, Lbn/d;->e0:[B

    invoke-virtual {p0, p1, p2, p3}, Lbn/d;->m(Lwm/j;[BI)V

    iget p1, p0, Lbn/d;->S:I

    invoke-virtual {p0}, Lbn/d;->j()V

    return p1

    :cond_2
    iget-object v0, p2, Lbn/c;->X:Lwm/s;

    iget-boolean v1, p0, Lbn/d;->U:Z

    iget-object v2, p0, Lbn/d;->j:Led3/a;

    const/4 v3, 0x4

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez v1, :cond_11

    iget-boolean v1, p2, Lbn/c;->h:Z

    iget-object v7, p0, Lbn/d;->g:Led3/a;

    if-eqz v1, :cond_e

    iget v1, p0, Lbn/d;->O:I

    const v8, -0x40000001    # -1.9999999f

    and-int/2addr v1, v8

    iput v1, p0, Lbn/d;->O:I

    iget-boolean v1, p0, Lbn/d;->V:Z

    const/16 v8, 0x80

    if-nez v1, :cond_4

    iget-object v1, v7, Led3/a;->a:[B

    invoke-interface {p1, v1, v6, v5}, Lwm/j;->readFully([BII)V

    iget v1, p0, Lbn/d;->R:I

    add-int/2addr v1, v5

    iput v1, p0, Lbn/d;->R:I

    iget-object v1, v7, Led3/a;->a:[B

    aget-byte v1, v1, v6

    and-int/lit16 v9, v1, 0x80

    if-eq v9, v8, :cond_3

    iput-byte v1, p0, Lbn/d;->Y:B

    iput-boolean v5, p0, Lbn/d;->V:Z

    goto :goto_0

    :cond_3
    const-string p1, "Extension bit is set in signal byte"

    const/4 p2, 0x0

    invoke-static {p2, p1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p1

    throw p1

    :cond_4
    :goto_0
    iget-byte v1, p0, Lbn/d;->Y:B

    and-int/lit8 v9, v1, 0x1

    if-ne v9, v5, :cond_f

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_5

    move v1, v5

    goto :goto_1

    :cond_5
    move v1, v6

    :goto_1
    iget v9, p0, Lbn/d;->O:I

    const/high16 v10, 0x40000000    # 2.0f

    or-int/2addr v9, v10

    iput v9, p0, Lbn/d;->O:I

    iget-boolean v9, p0, Lbn/d;->Z:Z

    if-nez v9, :cond_7

    iget-object v9, p0, Lbn/d;->l:Led3/a;

    iget-object v10, v9, Led3/a;->a:[B

    const/16 v11, 0x8

    invoke-interface {p1, v10, v6, v11}, Lwm/j;->readFully([BII)V

    iget v10, p0, Lbn/d;->R:I

    add-int/2addr v10, v11

    iput v10, p0, Lbn/d;->R:I

    iput-boolean v5, p0, Lbn/d;->Z:Z

    iget-object v10, v7, Led3/a;->a:[B

    if-eqz v1, :cond_6

    goto :goto_2

    :cond_6
    move v8, v6

    :goto_2
    or-int/2addr v8, v11

    int-to-byte v8, v8

    aput-byte v8, v10, v6

    invoke-virtual {v7, v6}, Led3/a;->K(I)V

    invoke-interface {v0, v5, v7}, Lwm/s;->c(ILed3/a;)V

    iget v8, p0, Lbn/d;->S:I

    add-int/2addr v8, v5

    iput v8, p0, Lbn/d;->S:I

    invoke-virtual {v9, v6}, Led3/a;->K(I)V

    invoke-interface {v0, v11, v9}, Lwm/s;->c(ILed3/a;)V

    iget v8, p0, Lbn/d;->S:I

    add-int/2addr v8, v11

    iput v8, p0, Lbn/d;->S:I

    :cond_7
    if-eqz v1, :cond_f

    iget-boolean v1, p0, Lbn/d;->W:Z

    if-nez v1, :cond_8

    iget-object v1, v7, Led3/a;->a:[B

    invoke-interface {p1, v1, v6, v5}, Lwm/j;->readFully([BII)V

    iget v1, p0, Lbn/d;->R:I

    add-int/2addr v1, v5

    iput v1, p0, Lbn/d;->R:I

    invoke-virtual {v7, v6}, Led3/a;->K(I)V

    invoke-virtual {v7}, Led3/a;->y()I

    move-result v1

    iput v1, p0, Lbn/d;->X:I

    iput-boolean v5, p0, Lbn/d;->W:Z

    :cond_8
    iget v1, p0, Lbn/d;->X:I

    mul-int/2addr v1, v3

    invoke-virtual {v7, v1}, Led3/a;->H(I)V

    iget-object v8, v7, Led3/a;->a:[B

    invoke-interface {p1, v8, v6, v1}, Lwm/j;->readFully([BII)V

    iget v8, p0, Lbn/d;->R:I

    add-int/2addr v8, v1

    iput v8, p0, Lbn/d;->R:I

    iget v1, p0, Lbn/d;->X:I

    div-int/2addr v1, v4

    add-int/2addr v1, v5

    int-to-short v1, v1

    mul-int/lit8 v8, v1, 0x6

    add-int/2addr v8, v4

    iget-object v9, p0, Lbn/d;->o:Ljava/nio/ByteBuffer;

    if-eqz v9, :cond_9

    invoke-virtual {v9}, Ljava/nio/Buffer;->capacity()I

    move-result v9

    if-ge v9, v8, :cond_a

    :cond_9
    invoke-static {v8}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v9

    iput-object v9, p0, Lbn/d;->o:Ljava/nio/ByteBuffer;

    :cond_a
    iget-object v9, p0, Lbn/d;->o:Ljava/nio/ByteBuffer;

    invoke-virtual {v9, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v9, p0, Lbn/d;->o:Ljava/nio/ByteBuffer;

    invoke-virtual {v9, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move v1, v6

    move v9, v1

    :goto_3
    iget v10, p0, Lbn/d;->X:I

    if-ge v1, v10, :cond_c

    invoke-virtual {v7}, Led3/a;->B()I

    move-result v10

    rem-int/lit8 v11, v1, 0x2

    if-nez v11, :cond_b

    iget-object v11, p0, Lbn/d;->o:Ljava/nio/ByteBuffer;

    sub-int v9, v10, v9

    int-to-short v9, v9

    invoke-virtual {v11, v9}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    goto :goto_4

    :cond_b
    iget-object v11, p0, Lbn/d;->o:Ljava/nio/ByteBuffer;

    sub-int v9, v10, v9

    invoke-virtual {v11, v9}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    :goto_4
    add-int/lit8 v1, v1, 0x1

    move v9, v10

    goto :goto_3

    :cond_c
    iget v1, p0, Lbn/d;->R:I

    sub-int v1, p3, v1

    sub-int/2addr v1, v9

    rem-int/2addr v10, v4

    if-ne v10, v5, :cond_d

    iget-object v9, p0, Lbn/d;->o:Ljava/nio/ByteBuffer;

    invoke-virtual {v9, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    goto :goto_5

    :cond_d
    iget-object v9, p0, Lbn/d;->o:Ljava/nio/ByteBuffer;

    int-to-short v1, v1

    invoke-virtual {v9, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget-object v1, p0, Lbn/d;->o:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v6}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    :goto_5
    iget-object v1, p0, Lbn/d;->o:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    iget-object v9, p0, Lbn/d;->m:Led3/a;

    invoke-virtual {v9, v8, v1}, Led3/a;->I(I[B)V

    invoke-interface {v0, v8, v9}, Lwm/s;->c(ILed3/a;)V

    iget v1, p0, Lbn/d;->S:I

    add-int/2addr v1, v8

    iput v1, p0, Lbn/d;->S:I

    goto :goto_6

    :cond_e
    iget-object v1, p2, Lbn/c;->i:[B

    if-eqz v1, :cond_f

    array-length v8, v1

    invoke-virtual {v2, v8, v1}, Led3/a;->I(I[B)V

    :cond_f
    :goto_6
    iget v1, p2, Lbn/c;->f:I

    if-lez v1, :cond_10

    iget v1, p0, Lbn/d;->O:I

    const/high16 v8, 0x10000000

    or-int/2addr v1, v8

    iput v1, p0, Lbn/d;->O:I

    iget-object v1, p0, Lbn/d;->n:Led3/a;

    invoke-virtual {v1, v6}, Led3/a;->H(I)V

    invoke-virtual {v7, v3}, Led3/a;->H(I)V

    iget-object v1, v7, Led3/a;->a:[B

    shr-int/lit8 v8, p3, 0x18

    and-int/lit16 v8, v8, 0xff

    int-to-byte v8, v8

    aput-byte v8, v1, v6

    shr-int/lit8 v8, p3, 0x10

    and-int/lit16 v8, v8, 0xff

    int-to-byte v8, v8

    aput-byte v8, v1, v5

    shr-int/lit8 v8, p3, 0x8

    and-int/lit16 v8, v8, 0xff

    int-to-byte v8, v8

    aput-byte v8, v1, v4

    and-int/lit16 v8, p3, 0xff

    int-to-byte v8, v8

    const/4 v9, 0x3

    aput-byte v8, v1, v9

    invoke-interface {v0, v3, v7}, Lwm/s;->c(ILed3/a;)V

    iget v1, p0, Lbn/d;->S:I

    add-int/2addr v1, v3

    iput v1, p0, Lbn/d;->S:I

    :cond_10
    iput-boolean v5, p0, Lbn/d;->U:Z

    :cond_11
    iget v1, v2, Led3/a;->c:I

    add-int/2addr p3, v1

    const-string v1, "V_MPEG4/ISO/AVC"

    iget-object v7, p2, Lbn/c;->b:Ljava/lang/String;

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    const-string v1, "V_MPEGH/ISO/HEVC"

    iget-object v7, p2, Lbn/c;->b:Ljava/lang/String;

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_a

    :cond_12
    iget-object v1, p2, Lbn/c;->T:Lt9/l0;

    if-eqz v1, :cond_14

    iget v1, v2, Led3/a;->c:I

    if-nez v1, :cond_13

    goto :goto_7

    :cond_13
    move v5, v6

    :goto_7
    invoke-static {v5}, Llo/a;->i(Z)V

    iget-object v1, p2, Lbn/c;->T:Lt9/l0;

    invoke-virtual {v1, p1}, Lt9/l0;->f(Lwm/j;)V

    :cond_14
    :goto_8
    iget v1, p0, Lbn/d;->R:I

    if-ge v1, p3, :cond_1a

    sub-int v1, p3, v1

    invoke-virtual {v2}, Led3/a;->a()I

    move-result v4

    if-lez v4, :cond_15

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-interface {v0, v1, v2}, Lwm/s;->c(ILed3/a;)V

    goto :goto_9

    :cond_15
    invoke-interface {v0, p1, v1, v6}, Lwm/s;->b(Lko/i;IZ)I

    move-result v1

    :goto_9
    iget v4, p0, Lbn/d;->R:I

    add-int/2addr v4, v1

    iput v4, p0, Lbn/d;->R:I

    iget v4, p0, Lbn/d;->S:I

    add-int/2addr v4, v1

    iput v4, p0, Lbn/d;->S:I

    goto :goto_8

    :cond_16
    :goto_a
    iget-object v1, p0, Lbn/d;->f:Led3/a;

    iget-object v7, v1, Led3/a;->a:[B

    aput-byte v6, v7, v6

    aput-byte v6, v7, v5

    aput-byte v6, v7, v4

    iget v4, p2, Lbn/c;->Y:I

    rsub-int/lit8 v5, v4, 0x4

    :goto_b
    iget v8, p0, Lbn/d;->R:I

    if-ge v8, p3, :cond_1a

    iget v8, p0, Lbn/d;->T:I

    if-nez v8, :cond_18

    invoke-virtual {v2}, Led3/a;->a()I

    move-result v8

    invoke-static {v4, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    add-int v9, v5, v8

    sub-int v10, v4, v8

    invoke-interface {p1, v7, v9, v10}, Lwm/j;->readFully([BII)V

    if-lez v8, :cond_17

    invoke-virtual {v2, v7, v5, v8}, Led3/a;->g([BII)V

    :cond_17
    iget v8, p0, Lbn/d;->R:I

    add-int/2addr v8, v4

    iput v8, p0, Lbn/d;->R:I

    invoke-virtual {v1, v6}, Led3/a;->K(I)V

    invoke-virtual {v1}, Led3/a;->B()I

    move-result v8

    iput v8, p0, Lbn/d;->T:I

    iget-object v8, p0, Lbn/d;->e:Led3/a;

    invoke-virtual {v8, v6}, Led3/a;->K(I)V

    invoke-interface {v0, v3, v8}, Lwm/s;->c(ILed3/a;)V

    iget v8, p0, Lbn/d;->S:I

    add-int/2addr v8, v3

    iput v8, p0, Lbn/d;->S:I

    goto :goto_b

    :cond_18
    invoke-virtual {v2}, Led3/a;->a()I

    move-result v9

    if-lez v9, :cond_19

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v8

    invoke-interface {v0, v8, v2}, Lwm/s;->c(ILed3/a;)V

    goto :goto_c

    :cond_19
    invoke-interface {v0, p1, v8, v6}, Lwm/s;->b(Lko/i;IZ)I

    move-result v8

    :goto_c
    iget v9, p0, Lbn/d;->R:I

    add-int/2addr v9, v8

    iput v9, p0, Lbn/d;->R:I

    iget v9, p0, Lbn/d;->S:I

    add-int/2addr v9, v8

    iput v9, p0, Lbn/d;->S:I

    iget v9, p0, Lbn/d;->T:I

    sub-int/2addr v9, v8

    iput v9, p0, Lbn/d;->T:I

    goto :goto_b

    :cond_1a
    const-string p1, "A_VORBIS"

    iget-object p2, p2, Lbn/c;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1b

    iget-object p1, p0, Lbn/d;->h:Led3/a;

    invoke-virtual {p1, v6}, Led3/a;->K(I)V

    invoke-interface {v0, v3, p1}, Lwm/s;->c(ILed3/a;)V

    iget p1, p0, Lbn/d;->S:I

    add-int/2addr p1, v3

    iput p1, p0, Lbn/d;->S:I

    :cond_1b
    iget p1, p0, Lbn/d;->S:I

    invoke-virtual {p0}, Lbn/d;->j()V

    return p1
.end method

.method public final m(Lwm/j;[BI)V
    .locals 5

    array-length v0, p2

    add-int/2addr v0, p3

    iget-object v1, p0, Lbn/d;->k:Led3/a;

    iget-object v2, v1, Led3/a;->a:[B

    array-length v3, v2

    const/4 v4, 0x0

    if-ge v3, v0, :cond_0

    add-int v2, v0, p3

    invoke-static {p2, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v3, v2

    invoke-virtual {v1, v3, v2}, Led3/a;->I(I[B)V

    goto :goto_0

    :cond_0
    array-length v3, p2

    invoke-static {p2, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    iget-object v2, v1, Led3/a;->a:[B

    array-length p2, p2

    invoke-interface {p1, v2, p2, p3}, Lwm/j;->readFully([BII)V

    invoke-virtual {v1, v4}, Led3/a;->K(I)V

    invoke-virtual {v1, v0}, Led3/a;->J(I)V

    return-void
.end method

.method public final release()V
    .locals 0

    return-void
.end method
