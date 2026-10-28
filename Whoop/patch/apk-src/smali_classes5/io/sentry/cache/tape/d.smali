.class public final Lio/sentry/cache/tape/d;
.super Lio/sentry/cache/tape/f;
.source "SourceFile"


# instance fields
.field public final w:Lio/sentry/cache/tape/i;

.field public final x:Lio/sentry/cache/tape/c;

.field public final y:Lio/sentry/cache/tape/e;


# direct methods
.method public constructor <init>(Lio/sentry/cache/tape/i;Lio/sentry/cache/tape/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/cache/tape/c;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lio/sentry/cache/tape/d;->x:Lio/sentry/cache/tape/c;

    iput-object p1, p0, Lio/sentry/cache/tape/d;->w:Lio/sentry/cache/tape/i;

    iput-object p2, p0, Lio/sentry/cache/tape/d;->y:Lio/sentry/cache/tape/e;

    return-void
.end method


# virtual methods
.method public final R0(I)V
    .locals 1

    iget-object v0, p0, Lio/sentry/cache/tape/d;->w:Lio/sentry/cache/tape/i;

    invoke-virtual {v0, p1}, Lio/sentry/cache/tape/i;->l1(I)V

    return-void
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, Lio/sentry/cache/tape/d;->w:Lio/sentry/cache/tape/i;

    invoke-virtual {v0}, Lio/sentry/cache/tape/i;->clear()V

    return-void
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lio/sentry/cache/tape/d;->w:Lio/sentry/cache/tape/i;

    invoke-virtual {v0}, Lio/sentry/cache/tape/i;->close()V

    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, Laf3/u;

    iget-object v1, p0, Lio/sentry/cache/tape/d;->w:Lio/sentry/cache/tape/i;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lio/sentry/cache/tape/h;

    invoke-direct {v2, v1}, Lio/sentry/cache/tape/h;-><init>(Lio/sentry/cache/tape/i;)V

    invoke-direct {v0, p0, v2}, Laf3/u;-><init>(Lio/sentry/cache/tape/d;Lio/sentry/cache/tape/h;)V

    return-object v0
.end method

.method public final m(Ljava/lang/Object;)V
    .locals 27

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/sentry/cache/tape/d;->x:Lio/sentry/cache/tape/c;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V

    iget-object v2, v0, Lio/sentry/cache/tape/d;->y:Lio/sentry/cache/tape/e;

    move-object/from16 v3, p1

    invoke-interface {v2, v1, v3}, Lio/sentry/cache/tape/e;->m(Ljava/io/OutputStream;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/sentry/cache/tape/c;->b()[B

    move-result-object v2

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v1

    iget-object v3, v0, Lio/sentry/cache/tape/d;->w:Lio/sentry/cache/tape/i;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v11, v3, Lio/sentry/cache/tape/i;->G:[B

    if-eqz v2, :cond_f

    if-ltz v1, :cond_e

    array-length v4, v2

    if-gt v1, v4, :cond_e

    iget-boolean v4, v3, Lio/sentry/cache/tape/i;->J:Z

    if-nez v4, :cond_d

    iget v4, v3, Lio/sentry/cache/tape/i;->I:I

    const/4 v5, -0x1

    const/4 v12, 0x1

    if-ne v4, v5, :cond_0

    goto :goto_0

    :cond_0
    iget v5, v3, Lio/sentry/cache/tape/i;->z:I

    if-ne v5, v4, :cond_1

    invoke-virtual {v3, v12}, Lio/sentry/cache/tape/i;->l1(I)V

    :cond_1
    :goto_0
    int-to-long v4, v1

    const-wide/16 v13, 0x4

    add-long/2addr v4, v13

    iget-wide v6, v3, Lio/sentry/cache/tape/i;->y:J

    iget v8, v3, Lio/sentry/cache/tape/i;->z:I

    const-wide/16 v15, 0x20

    if-nez v8, :cond_2

    move/from16 p1, v12

    move-wide/from16 v17, v13

    move-wide v9, v15

    goto :goto_1

    :cond_2
    iget-object v8, v3, Lio/sentry/cache/tape/i;->F:Lio/sentry/cache/tape/g;

    iget-wide v9, v8, Lio/sentry/cache/tape/g;->a:J

    iget v8, v8, Lio/sentry/cache/tape/g;->b:I

    move-wide/from16 v17, v13

    iget-object v13, v3, Lio/sentry/cache/tape/i;->E:Lio/sentry/cache/tape/g;

    iget-wide v13, v13, Lio/sentry/cache/tape/g;->a:J

    cmp-long v19, v9, v13

    if-ltz v19, :cond_3

    sub-long/2addr v9, v13

    add-long v9, v9, v17

    int-to-long v13, v8

    add-long/2addr v9, v13

    add-long/2addr v9, v15

    move/from16 p1, v12

    goto :goto_1

    :cond_3
    add-long v9, v9, v17

    move/from16 p1, v12

    move-wide/from16 v19, v13

    int-to-long v12, v8

    add-long/2addr v9, v12

    add-long/2addr v9, v6

    sub-long v9, v9, v19

    :goto_1
    sub-long v8, v6, v9

    cmp-long v10, v8, v4

    if-ltz v10, :cond_4

    goto/16 :goto_6

    :cond_4
    add-long/2addr v8, v6

    shl-long v6, v6, p1

    cmp-long v10, v8, v4

    if-ltz v10, :cond_4

    iget-object v4, v3, Lio/sentry/cache/tape/i;->w:Ljava/io/RandomAccessFile;

    invoke-virtual {v4, v6, v7}, Ljava/io/RandomAccessFile;->setLength(J)V

    iget-object v4, v3, Lio/sentry/cache/tape/i;->w:Ljava/io/RandomAccessFile;

    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v4

    move/from16 v5, p1

    invoke-virtual {v4, v5}, Ljava/nio/channels/FileChannel;->force(Z)V

    iget-object v4, v3, Lio/sentry/cache/tape/i;->F:Lio/sentry/cache/tape/g;

    iget-wide v8, v4, Lio/sentry/cache/tape/g;->a:J

    add-long v8, v8, v17

    iget v4, v4, Lio/sentry/cache/tape/g;->b:I

    int-to-long v4, v4

    add-long/2addr v8, v4

    invoke-virtual {v3, v8, v9}, Lio/sentry/cache/tape/i;->p1(J)J

    move-result-wide v4

    iget-object v8, v3, Lio/sentry/cache/tape/i;->E:Lio/sentry/cache/tape/g;

    iget-wide v8, v8, Lio/sentry/cache/tape/g;->a:J

    cmp-long v8, v4, v8

    if-gtz v8, :cond_6

    iget-object v8, v3, Lio/sentry/cache/tape/i;->w:Ljava/io/RandomAccessFile;

    invoke-virtual {v8}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v8

    iget-wide v9, v3, Lio/sentry/cache/tape/i;->y:J

    invoke-virtual {v8, v9, v10}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    sub-long v22, v4, v15

    const-wide/16 v20, 0x20

    move-object/from16 v24, v8

    move-object/from16 v19, v8

    invoke-virtual/range {v19 .. v24}, Ljava/nio/channels/FileChannel;->transferTo(JJLjava/nio/channels/WritableByteChannel;)J

    move-result-wide v4

    cmp-long v4, v4, v22

    if-nez v4, :cond_5

    goto :goto_2

    :cond_5
    new-instance v1, Ljava/lang/AssertionError;

    const-string v2, "Copied insufficient number of bytes!"

    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :cond_6
    const-wide/16 v22, 0x0

    :goto_2
    iget-object v4, v3, Lio/sentry/cache/tape/i;->F:Lio/sentry/cache/tape/g;

    iget-wide v9, v4, Lio/sentry/cache/tape/g;->a:J

    iget-object v4, v3, Lio/sentry/cache/tape/i;->E:Lio/sentry/cache/tape/g;

    iget-wide v4, v4, Lio/sentry/cache/tape/g;->a:J

    cmp-long v8, v9, v4

    if-gez v8, :cond_7

    const-wide/16 v19, 0x0

    iget-wide v12, v3, Lio/sentry/cache/tape/i;->y:J

    add-long/2addr v12, v9

    sub-long v9, v12, v15

    move-wide/from16 v25, v6

    move-wide v7, v4

    move-wide/from16 v4, v25

    iget v6, v3, Lio/sentry/cache/tape/i;->z:I

    invoke-virtual/range {v3 .. v10}, Lio/sentry/cache/tape/i;->q1(JIJJ)V

    new-instance v6, Lio/sentry/cache/tape/g;

    iget-object v7, v3, Lio/sentry/cache/tape/i;->F:Lio/sentry/cache/tape/g;

    iget v7, v7, Lio/sentry/cache/tape/g;->b:I

    invoke-direct {v6, v9, v10, v7}, Lio/sentry/cache/tape/g;-><init>(JI)V

    iput-object v6, v3, Lio/sentry/cache/tape/i;->F:Lio/sentry/cache/tape/g;

    :goto_3
    move-wide v6, v4

    goto :goto_4

    :cond_7
    move-wide/from16 v19, v6

    move-wide v7, v4

    move-wide/from16 v4, v19

    const-wide/16 v19, 0x0

    iget v6, v3, Lio/sentry/cache/tape/i;->z:I

    invoke-virtual/range {v3 .. v10}, Lio/sentry/cache/tape/i;->q1(JIJJ)V

    goto :goto_3

    :goto_4
    iput-wide v6, v3, Lio/sentry/cache/tape/i;->y:J

    move-wide v6, v15

    move-wide/from16 v4, v22

    :goto_5
    cmp-long v8, v4, v19

    if-lez v8, :cond_8

    const/16 v8, 0x1000

    int-to-long v8, v8

    invoke-static {v4, v5, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    long-to-int v8, v8

    sget-object v9, Lio/sentry/cache/tape/i;->K:[B

    invoke-virtual {v3, v8, v6, v7, v9}, Lio/sentry/cache/tape/i;->o1(IJ[B)V

    int-to-long v8, v8

    sub-long/2addr v4, v8

    add-long/2addr v6, v8

    goto :goto_5

    :cond_8
    :goto_6
    iget v4, v3, Lio/sentry/cache/tape/i;->z:I

    const/4 v5, 0x0

    if-nez v4, :cond_9

    const/4 v12, 0x1

    goto :goto_7

    :cond_9
    move v12, v5

    :goto_7
    if-eqz v12, :cond_a

    :goto_8
    move-wide v9, v15

    goto :goto_9

    :cond_a
    iget-object v4, v3, Lio/sentry/cache/tape/i;->F:Lio/sentry/cache/tape/g;

    iget-wide v6, v4, Lio/sentry/cache/tape/g;->a:J

    add-long v6, v6, v17

    iget v4, v4, Lio/sentry/cache/tape/g;->b:I

    int-to-long v8, v4

    add-long/2addr v6, v8

    invoke-virtual {v3, v6, v7}, Lio/sentry/cache/tape/i;->p1(J)J

    move-result-wide v15

    goto :goto_8

    :goto_9
    new-instance v13, Lio/sentry/cache/tape/g;

    invoke-direct {v13, v9, v10, v1}, Lio/sentry/cache/tape/g;-><init>(JI)V

    invoke-static {v11, v5, v1}, Lio/sentry/cache/tape/i;->r1([BII)V

    const/4 v4, 0x4

    invoke-virtual {v3, v4, v9, v10, v11}, Lio/sentry/cache/tape/i;->o1(IJ[B)V

    add-long v4, v9, v17

    invoke-virtual {v3, v1, v4, v5, v2}, Lio/sentry/cache/tape/i;->o1(IJ[B)V

    if-eqz v12, :cond_b

    move-wide v7, v9

    goto :goto_a

    :cond_b
    iget-object v1, v3, Lio/sentry/cache/tape/i;->E:Lio/sentry/cache/tape/g;

    iget-wide v1, v1, Lio/sentry/cache/tape/g;->a:J

    move-wide v7, v1

    :goto_a
    iget-wide v4, v3, Lio/sentry/cache/tape/i;->y:J

    iget v1, v3, Lio/sentry/cache/tape/i;->z:I

    const/4 v14, 0x1

    add-int/lit8 v6, v1, 0x1

    invoke-virtual/range {v3 .. v10}, Lio/sentry/cache/tape/i;->q1(JIJJ)V

    iput-object v13, v3, Lio/sentry/cache/tape/i;->F:Lio/sentry/cache/tape/g;

    iget v1, v3, Lio/sentry/cache/tape/i;->z:I

    add-int/2addr v1, v14

    iput v1, v3, Lio/sentry/cache/tape/i;->z:I

    iget v1, v3, Lio/sentry/cache/tape/i;->H:I

    add-int/2addr v1, v14

    iput v1, v3, Lio/sentry/cache/tape/i;->H:I

    if-eqz v12, :cond_c

    iput-object v13, v3, Lio/sentry/cache/tape/i;->E:Lio/sentry/cache/tape/g;

    :cond_c
    return-void

    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v1

    :cond_f
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "data == null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lio/sentry/cache/tape/d;->w:Lio/sentry/cache/tape/i;

    iget v0, v0, Lio/sentry/cache/tape/i;->z:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FileObjectQueue{queueFile="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/sentry/cache/tape/d;->w:Lio/sentry/cache/tape/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
