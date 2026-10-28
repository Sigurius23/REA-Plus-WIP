.class public final Lce3/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final z:Ljava/util/logging/Logger;


# instance fields
.field public final w:Lne3/j;

.field public final x:Lce3/t;

.field public final y:Lce3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lce3/g;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    const-string v1, "getLogger(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lce3/u;->z:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lne3/j0;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce3/u;->w:Lne3/j;

    new-instance v0, Lce3/t;

    invoke-direct {v0, p1}, Lce3/t;-><init>(Lne3/j;)V

    iput-object v0, p0, Lce3/u;->x:Lce3/t;

    new-instance p1, Lce3/d;

    invoke-direct {p1, v0}, Lce3/d;-><init>(Lce3/t;)V

    iput-object p1, p0, Lce3/u;->y:Lce3/d;

    return-void
.end method


# virtual methods
.method public final b(ZLce3/p;)Z
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, v1, Lce3/u;->w:Lne3/j;

    const-wide/16 v4, 0x9

    invoke-interface {v3, v4, v5}, Lne3/j;->g0(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_1

    iget-object v3, v1, Lce3/u;->w:Lne3/j;

    invoke-static {v3}, Lwd3/f;->o(Lne3/j;)I

    move-result v3

    const/16 v4, 0x4000

    if-gt v3, v4, :cond_2f

    iget-object v5, v1, Lce3/u;->w:Lne3/j;

    invoke-interface {v5}, Lne3/j;->readByte()B

    move-result v5

    and-int/lit16 v5, v5, 0xff

    iget-object v6, v1, Lce3/u;->w:Lne3/j;

    invoke-interface {v6}, Lne3/j;->readByte()B

    move-result v6

    and-int/lit16 v7, v6, 0xff

    iget-object v8, v1, Lce3/u;->w:Lne3/j;

    invoke-interface {v8}, Lne3/j;->readInt()I

    move-result v8

    const v9, 0x7fffffff

    and-int/2addr v9, v8

    const/16 v10, 0x8

    const/4 v11, 0x1

    if-eq v5, v10, :cond_0

    sget-object v12, Lce3/u;->z:Ljava/util/logging/Logger;

    sget-object v13, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v12, v13}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v13

    if-eqz v13, :cond_0

    invoke-static {v9, v3, v5, v7, v11}, Lce3/g;->b(IIIIZ)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_0
    const/4 v12, 0x4

    if-eqz p1, :cond_2

    if-ne v5, v12, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected a SETTINGS frame but was "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Lce3/g;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    const/4 v13, 0x0

    const/4 v14, 0x5

    const/4 v15, 0x2

    packed-switch v5, :pswitch_data_0

    iget-object v0, v1, Lce3/u;->w:Lne3/j;

    int-to-long v2, v3

    invoke-interface {v0, v2, v3}, Lne3/j;->skip(J)V

    return v11

    :pswitch_0
    const-string v2, "TYPE_WINDOW_UPDATE length !=4: "

    if-ne v3, v12, :cond_7

    :try_start_1
    iget-object v2, v1, Lce3/u;->w:Lne3/j;

    invoke-interface {v2}, Lne3/j;->readInt()I

    move-result v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-wide/32 v4, 0x7fffffff

    int-to-long v12, v2

    and-long/2addr v4, v12

    const-wide/16 v12, 0x0

    cmp-long v2, v4, v12

    if-eqz v2, :cond_6

    sget-object v6, Lce3/u;->z:Ljava/util/logging/Logger;

    sget-object v7, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v6, v7}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-static {v9, v3, v4, v5, v11}, Lce3/g;->c(IIJZ)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_3
    if-nez v9, :cond_4

    iget-object v0, v0, Lce3/p;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lce3/q;

    monitor-enter v2

    :try_start_2
    iget-wide v6, v2, Lce3/q;->V:J

    add-long/2addr v6, v4

    iput-wide v6, v2, Lce3/q;->V:J

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v2

    return v11

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_4
    iget-object v0, v0, Lce3/p;->y:Ljava/lang/Object;

    check-cast v0, Lce3/q;

    invoke-virtual {v0, v9}, Lce3/q;->h(I)Lce3/y;

    move-result-object v3

    if-eqz v3, :cond_29

    monitor-enter v3

    :try_start_3
    iget-wide v6, v3, Lce3/y;->E:J

    add-long/2addr v6, v4

    iput-wide v6, v3, Lce3/y;->E:J

    if-lez v2, :cond_5

    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_5
    monitor-exit v3

    return v11

    :catchall_1
    move-exception v0

    monitor-exit v3

    throw v0

    :cond_6
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    const-string v2, "windowSizeIncrement was 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_7
    new-instance v0, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :goto_1
    sget-object v2, Lce3/u;->z:Ljava/util/logging/Logger;

    invoke-static {v9, v3, v10, v7, v11}, Lce3/g;->b(IIIIZ)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    if-lt v3, v10, :cond_f

    if-nez v9, :cond_e

    iget-object v4, v1, Lce3/u;->w:Lne3/j;

    invoke-interface {v4}, Lne3/j;->readInt()I

    move-result v4

    iget-object v5, v1, Lce3/u;->w:Lne3/j;

    invoke-interface {v5}, Lne3/j;->readInt()I

    move-result v5

    sub-int/2addr v3, v10

    sget-object v6, Lce3/a;->x:Lce3/c0;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lce3/a;->values()[Lce3/a;

    move-result-object v6

    array-length v7, v6

    move v8, v2

    :goto_2
    if-ge v8, v7, :cond_9

    aget-object v9, v6, v8

    iget v10, v9, Lce3/a;->w:I

    if-ne v10, v5, :cond_8

    move-object v13, v9

    goto :goto_3

    :cond_8
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_9
    :goto_3
    if-eqz v13, :cond_d

    sget-object v5, Lne3/l;->E:Lne3/l;

    if-lez v3, :cond_a

    iget-object v5, v1, Lce3/u;->w:Lne3/j;

    int-to-long v6, v3

    invoke-interface {v5, v6, v7}, Lne3/j;->m0(J)Lne3/l;

    move-result-object v5

    :cond_a
    const-string v3, "debugData"

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Lne3/l;->d()I

    iget-object v3, v0, Lce3/p;->y:Ljava/lang/Object;

    check-cast v3, Lce3/q;

    monitor-enter v3

    :try_start_5
    iget-object v5, v3, Lce3/q;->x:Ljava/util/LinkedHashMap;

    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v5

    new-array v6, v2, [Lce3/y;

    invoke-interface {v5, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    iput-boolean v11, v3, Lce3/q;->F:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    monitor-exit v3

    check-cast v5, [Lce3/y;

    array-length v3, v5

    :goto_4
    if-ge v2, v3, :cond_29

    aget-object v6, v5, v2

    iget v7, v6, Lce3/y;->w:I

    if-le v7, v4, :cond_c

    invoke-virtual {v6}, Lce3/y;->h()Z

    move-result v7

    if-eqz v7, :cond_c

    sget-object v7, Lce3/a;->G:Lce3/a;

    monitor-enter v6

    :try_start_6
    invoke-virtual {v6}, Lce3/y;->g()Lce3/a;

    move-result-object v8

    if-nez v8, :cond_b

    iput-object v7, v6, Lce3/y;->L:Lce3/a;

    invoke-virtual {v6}, Ljava/lang/Object;->notifyAll()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception v0

    goto :goto_6

    :cond_b
    :goto_5
    monitor-exit v6

    iget-object v7, v0, Lce3/p;->y:Ljava/lang/Object;

    check-cast v7, Lce3/q;

    iget v6, v6, Lce3/y;->w:I

    invoke-virtual {v7, v6}, Lce3/q;->i(I)Lce3/y;

    goto :goto_7

    :goto_6
    monitor-exit v6

    throw v0

    :cond_c
    :goto_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :catchall_3
    move-exception v0

    monitor-exit v3

    throw v0

    :cond_d
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_GOAWAY unexpected error code: "

    invoke-static {v5, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_GOAWAY streamId != 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_GOAWAY length < 8: "

    invoke-static {v3, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_2
    if-ne v3, v10, :cond_16

    if-nez v9, :cond_15

    iget-object v3, v1, Lce3/u;->w:Lne3/j;

    invoke-interface {v3}, Lne3/j;->readInt()I

    move-result v3

    iget-object v4, v1, Lce3/u;->w:Lne3/j;

    invoke-interface {v4}, Lne3/j;->readInt()I

    move-result v4

    and-int/lit8 v5, v6, 0x1

    if-eqz v5, :cond_10

    move v2, v11

    :cond_10
    if-eqz v2, :cond_14

    iget-object v0, v0, Lce3/p;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lce3/q;

    monitor-enter v2

    const-wide/16 v4, 0x1

    if-eq v3, v11, :cond_13

    if-eq v3, v15, :cond_12

    const/4 v0, 0x3

    if-eq v3, v0, :cond_11

    goto :goto_8

    :cond_11
    :try_start_7
    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    goto :goto_8

    :catchall_4
    move-exception v0

    goto :goto_9

    :cond_12
    iget-wide v6, v2, Lce3/q;->O:J

    add-long/2addr v6, v4

    iput-wide v6, v2, Lce3/q;->O:J

    goto :goto_8

    :cond_13
    iget-wide v6, v2, Lce3/q;->M:J

    add-long/2addr v6, v4

    iput-wide v6, v2, Lce3/q;->M:J
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :goto_8
    monitor-exit v2

    return v11

    :goto_9
    monitor-exit v2

    throw v0

    :cond_14
    iget-object v2, v0, Lce3/p;->y:Ljava/lang/Object;

    check-cast v2, Lce3/q;

    iget-object v5, v2, Lce3/q;->H:Lyd3/c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v0, Lce3/p;->y:Ljava/lang/Object;

    check-cast v6, Lce3/q;

    iget-object v6, v6, Lce3/q;->y:Ljava/lang/String;

    const-string v7, " ping"

    invoke-static {v6, v7, v2}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v6

    iget-object v0, v0, Lce3/p;->y:Ljava/lang/Object;

    check-cast v0, Lce3/q;

    new-instance v9, Lce3/o;

    invoke-direct {v9, v0, v3, v4}, Lce3/o;-><init>(Lce3/q;II)V

    const/4 v10, 0x6

    const-wide/16 v7, 0x0

    invoke-static/range {v5 .. v10}, Lyd3/c;->c(Lyd3/c;Ljava/lang/String;JLc93/a;I)V

    return v11

    :cond_15
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_PING streamId != 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_PING length != 8: "

    invoke-static {v3, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_3
    invoke-virtual {v1, v0, v3, v7, v9}, Lce3/u;->m(Lce3/p;III)V

    return v11

    :pswitch_4
    iget-object v5, v1, Lce3/u;->w:Lne3/j;

    if-nez v9, :cond_24

    and-int/2addr v6, v11

    if-eqz v6, :cond_18

    if-nez v3, :cond_17

    goto/16 :goto_10

    :cond_17
    new-instance v0, Ljava/io/IOException;

    const-string v2, "FRAME_SIZE_ERROR ack frame should be empty!"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    rem-int/lit8 v6, v3, 0x6

    if-nez v6, :cond_23

    new-instance v6, Lce3/d0;

    invoke-direct {v6}, Lce3/d0;-><init>()V

    invoke-static {v2, v3}, Le93/b;->i0(II)Li93/j;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v3, v2}, Le93/b;->d0(ILi93/j;)Li93/h;

    move-result-object v2

    iget v3, v2, Li93/h;->w:I

    iget v7, v2, Li93/h;->x:I

    iget v2, v2, Li93/h;->y:I

    if-lez v2, :cond_19

    if-le v3, v7, :cond_1a

    :cond_19
    if-gez v2, :cond_22

    if-gt v7, v3, :cond_22

    :cond_1a
    :goto_a
    invoke-interface {v5}, Lne3/j;->readShort()S

    move-result v8

    sget-object v9, Lwd3/f;->a:[B

    const v9, 0xffff

    and-int/2addr v8, v9

    invoke-interface {v5}, Lne3/j;->readInt()I

    move-result v9

    if-eq v8, v15, :cond_1f

    if-eq v8, v12, :cond_1d

    if-eq v8, v14, :cond_1b

    goto :goto_b

    :cond_1b
    if-lt v9, v4, :cond_1c

    const v10, 0xffffff

    if-gt v9, v10, :cond_1c

    goto :goto_b

    :cond_1c
    new-instance v0, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "

    invoke-static {v9, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1d
    if-ltz v9, :cond_1e

    goto :goto_b

    :cond_1e
    new-instance v0, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1f
    if-eqz v9, :cond_21

    if-ne v9, v11, :cond_20

    goto :goto_b

    :cond_20
    new-instance v0, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_21
    :goto_b
    invoke-virtual {v6, v8, v9}, Lce3/d0;->c(II)V

    if-eq v3, v7, :cond_22

    add-int/2addr v3, v2

    goto :goto_a

    :cond_22
    iget-object v2, v0, Lce3/p;->y:Ljava/lang/Object;

    check-cast v2, Lce3/q;

    iget-object v12, v2, Lce3/q;->H:Lyd3/c;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lce3/q;->y:Ljava/lang/String;

    const-string v4, " applyAndAckSettings"

    invoke-static {v2, v4, v3}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v13

    new-instance v2, La11/l;

    const/16 v3, 0xc

    invoke-direct {v2, v3, v0, v6}, La11/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/16 v17, 0x6

    const-wide/16 v14, 0x0

    move-object/from16 v16, v2

    invoke-static/range {v12 .. v17}, Lyd3/c;->c(Lyd3/c;Ljava/lang/String;JLc93/a;I)V

    return v11

    :cond_23
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_SETTINGS length % 6 != 0: "

    invoke-static {v3, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_24
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_SETTINGS streamId != 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_5
    if-ne v3, v12, :cond_2c

    if-eqz v9, :cond_2b

    iget-object v3, v1, Lce3/u;->w:Lne3/j;

    invoke-interface {v3}, Lne3/j;->readInt()I

    move-result v3

    sget-object v4, Lce3/a;->x:Lce3/c0;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lce3/a;->values()[Lce3/a;

    move-result-object v4

    array-length v5, v4

    :goto_c
    if-ge v2, v5, :cond_26

    aget-object v6, v4, v2

    iget v7, v6, Lce3/a;->w:I

    if-ne v7, v3, :cond_25

    move-object v13, v6

    goto :goto_d

    :cond_25
    add-int/lit8 v2, v2, 0x1

    goto :goto_c

    :cond_26
    :goto_d
    if-eqz v13, :cond_2a

    iget-object v0, v0, Lce3/p;->y:Ljava/lang/Object;

    check-cast v0, Lce3/q;

    if-eqz v9, :cond_27

    and-int/lit8 v2, v8, 0x1

    if-nez v2, :cond_27

    iget-object v3, v0, Lce3/q;->I:Lyd3/c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v0, Lce3/q;->y:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x5b

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "] onReset"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v7, Lce3/l;

    invoke-direct {v7, v0, v9, v13, v11}, Lce3/l;-><init>(Lce3/q;ILjava/lang/Object;I)V

    const/4 v8, 0x6

    const-wide/16 v5, 0x0

    invoke-static/range {v3 .. v8}, Lyd3/c;->c(Lyd3/c;Ljava/lang/String;JLc93/a;I)V

    return v11

    :cond_27
    invoke-virtual {v0, v9}, Lce3/q;->i(I)Lce3/y;

    move-result-object v2

    if-eqz v2, :cond_29

    monitor-enter v2

    :try_start_8
    invoke-virtual {v2}, Lce3/y;->g()Lce3/a;

    move-result-object v0

    if-nez v0, :cond_28

    iput-object v13, v2, Lce3/y;->L:Lce3/a;

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    goto :goto_e

    :catchall_5
    move-exception v0

    goto :goto_f

    :cond_28
    :goto_e
    monitor-exit v2

    return v11

    :goto_f
    monitor-exit v2

    throw v0

    :cond_29
    :goto_10
    return v11

    :cond_2a
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_RST_STREAM unexpected error code: "

    invoke-static {v3, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2b
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_RST_STREAM streamId == 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2c
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_RST_STREAM length: "

    const-string v4, " != 4"

    invoke-static {v3, v2, v4}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_6
    if-ne v3, v14, :cond_2e

    if-eqz v9, :cond_2d

    iget-object v0, v1, Lce3/u;->w:Lne3/j;

    invoke-interface {v0}, Lne3/j;->readInt()I

    invoke-interface {v0}, Lne3/j;->readByte()B

    return v11

    :cond_2d
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_PRIORITY streamId == 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2e
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_PRIORITY length: "

    const-string v4, " != 5"

    invoke-static {v3, v2, v4}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_7
    invoke-virtual {v1, v0, v3, v7, v9}, Lce3/u;->k(Lce3/p;III)V

    return v11

    :pswitch_8
    invoke-virtual {v1, v0, v3, v7, v9}, Lce3/u;->h(Lce3/p;III)V

    return v11

    :cond_2f
    new-instance v0, Ljava/io/IOException;

    const-string v2, "FRAME_SIZE_ERROR: "

    invoke-static {v3, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_1
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lce3/u;->w:Lne3/j;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final h(Lce3/p;III)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p3

    move/from16 v4, p4

    if-eqz v4, :cond_e

    and-int/lit8 v3, v2, 0x1

    if-eqz v3, :cond_0

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    and-int/lit8 v3, v2, 0x20

    if-nez v3, :cond_d

    and-int/lit8 v3, v2, 0x8

    if-eqz v3, :cond_1

    iget-object v3, v1, Lce3/u;->w:Lne3/j;

    invoke-interface {v3}, Lne3/j;->readByte()B

    move-result v3

    sget-object v8, Lwd3/f;->a:[B

    and-int/lit16 v3, v3, 0xff

    move v8, v3

    :goto_1
    move/from16 v3, p2

    goto :goto_2

    :cond_1
    const/4 v8, 0x0

    goto :goto_1

    :goto_2
    invoke-static {v3, v2, v8}, Lce3/s;->a(III)I

    move-result v2

    iget-object v3, v1, Lce3/u;->w:Lne3/j;

    const-string v9, "source"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v0, Lce3/p;->y:Ljava/lang/Object;

    check-cast v9, Lce3/q;

    if-eqz v4, :cond_2

    and-int/lit8 v10, v4, 0x1

    if-nez v10, :cond_2

    new-instance v5, Lne3/h;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    int-to-long v10, v2

    invoke-interface {v3, v10, v11}, Lne3/j;->g0(J)V

    invoke-interface {v3, v5, v10, v11}, Lne3/p0;->h1(Lne3/h;J)J

    iget-object v12, v9, Lce3/q;->I:Lyd3/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v9, Lce3/q;->y:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5b

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "] onData"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    new-instance v16, Lce3/k;

    move v6, v2

    move-object v3, v9

    move-object/from16 v2, v16

    invoke-direct/range {v2 .. v7}, Lce3/k;-><init>(Lce3/q;ILne3/h;IZ)V

    const/16 v17, 0x6

    const-wide/16 v14, 0x0

    invoke-static/range {v12 .. v17}, Lyd3/c;->c(Lyd3/c;Ljava/lang/String;JLc93/a;I)V

    goto/16 :goto_9

    :cond_2
    invoke-virtual {v9, v4}, Lce3/q;->h(I)Lce3/y;

    move-result-object v9

    if-nez v9, :cond_3

    iget-object v5, v0, Lce3/p;->y:Ljava/lang/Object;

    check-cast v5, Lce3/q;

    sget-object v6, Lce3/a;->z:Lce3/a;

    invoke-virtual {v5, v4, v6}, Lce3/q;->x(ILce3/a;)V

    iget-object v0, v0, Lce3/p;->y:Ljava/lang/Object;

    check-cast v0, Lce3/q;

    int-to-long v4, v2

    invoke-virtual {v0, v4, v5}, Lce3/q;->m(J)V

    invoke-interface {v3, v4, v5}, Lne3/j;->skip(J)V

    goto/16 :goto_9

    :cond_3
    sget-object v0, Lwd3/h;->a:Ljava/util/TimeZone;

    iget-object v0, v9, Lce3/y;->H:Lce3/w;

    int-to-long v10, v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide v12, v10

    :goto_3
    const-wide/16 v14, 0x0

    cmp-long v2, v12, v14

    if-lez v2, :cond_b

    iget-object v2, v0, Lce3/w;->F:Lce3/y;

    monitor-enter v2

    :try_start_0
    iget-boolean v4, v0, Lce3/w;->x:Z

    iget-object v5, v0, Lce3/w;->z:Lne3/h;

    move-wide/from16 p1, v14

    iget-wide v14, v5, Lne3/h;->x:J

    add-long/2addr v14, v12

    move/from16 p3, v7

    iget-wide v6, v0, Lce3/w;->w:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    cmp-long v6, v14, v6

    if-lez v6, :cond_4

    const/4 v6, 0x1

    goto :goto_4

    :cond_4
    const/4 v6, 0x0

    :goto_4
    monitor-exit v2

    if-eqz v6, :cond_5

    invoke-interface {v3, v12, v13}, Lne3/j;->skip(J)V

    iget-object v0, v0, Lce3/w;->F:Lce3/y;

    sget-object v2, Lce3/a;->F:Lce3/a;

    invoke-virtual {v0, v2}, Lce3/y;->f(Lce3/a;)V

    goto :goto_8

    :cond_5
    if-eqz v4, :cond_6

    invoke-interface {v3, v12, v13}, Lne3/j;->skip(J)V

    goto :goto_8

    :cond_6
    iget-object v2, v0, Lce3/w;->y:Lne3/h;

    invoke-interface {v3, v2, v12, v13}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide v6

    const-wide/16 v14, -0x1

    cmp-long v2, v6, v14

    if-eqz v2, :cond_a

    sub-long/2addr v12, v6

    iget-object v2, v0, Lce3/w;->F:Lce3/y;

    monitor-enter v2

    :try_start_1
    iget-boolean v4, v0, Lce3/w;->E:Z

    if-eqz v4, :cond_7

    iget-object v4, v0, Lce3/w;->y:Lne3/h;

    invoke-virtual {v4}, Lne3/h;->b()V

    goto :goto_6

    :catchall_0
    move-exception v0

    goto :goto_7

    :cond_7
    iget-object v4, v0, Lce3/w;->z:Lne3/h;

    iget-wide v6, v4, Lne3/h;->x:J

    cmp-long v6, v6, p1

    if-nez v6, :cond_8

    const/4 v6, 0x1

    goto :goto_5

    :cond_8
    const/4 v6, 0x0

    :goto_5
    iget-object v7, v0, Lce3/w;->y:Lne3/h;

    invoke-virtual {v4, v7}, Lne3/h;->N0(Lne3/p0;)J

    if-eqz v6, :cond_9

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_9
    :goto_6
    monitor-exit v2

    move/from16 v7, p3

    goto :goto_3

    :goto_7
    monitor-exit v2

    throw v0

    :cond_a
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_b
    move/from16 p3, v7

    iget-object v2, v0, Lce3/w;->F:Lce3/y;

    sget-object v3, Lwd3/h;->a:Ljava/util/TimeZone;

    iget-object v2, v2, Lce3/y;->x:Lce3/q;

    invoke-virtual {v2, v10, v11}, Lce3/q;->m(J)V

    iget-object v0, v0, Lce3/w;->F:Lce3/y;

    iget-object v0, v0, Lce3/y;->x:Lce3/q;

    iget-object v0, v0, Lce3/q;->Q:Lce3/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_8
    if-eqz p3, :cond_c

    sget-object v0, Lud3/d0;->x:Lud3/d0;

    const/4 v5, 0x1

    invoke-virtual {v9, v0, v5}, Lce3/y;->j(Lud3/d0;Z)V

    :cond_c
    :goto_9
    iget-object v0, v1, Lce3/u;->w:Lne3/j;

    int-to-long v2, v8

    invoke-interface {v0, v2, v3}, Lne3/j;->skip(J)V

    return-void

    :cond_d
    new-instance v0, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR: TYPE_DATA streamId == 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i(IIII)Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lce3/u;->x:Lce3/t;

    iput p1, v0, Lce3/t;->E:I

    iput p1, v0, Lce3/t;->x:I

    iput p2, v0, Lce3/t;->F:I

    iput p3, v0, Lce3/t;->y:I

    iput p4, v0, Lce3/t;->z:I

    iget-object p1, p0, Lce3/u;->y:Lce3/d;

    iget-object p2, p1, Lce3/d;->c:Lne3/j0;

    iget-object p3, p1, Lce3/d;->b:Ljava/util/ArrayList;

    :cond_0
    :goto_0
    invoke-virtual {p2}, Lne3/j0;->o()Z

    move-result p4

    if-nez p4, :cond_c

    invoke-virtual {p2}, Lne3/j0;->readByte()B

    move-result p4

    sget-object v0, Lwd3/f;->a:[B

    and-int/lit16 v0, p4, 0xff

    const/16 v1, 0x80

    if-eq v0, v1, :cond_b

    and-int/lit16 v2, p4, 0x80

    if-ne v2, v1, :cond_3

    const/16 p4, 0x7f

    invoke-virtual {p1, v0, p4}, Lce3/d;->e(II)I

    move-result p4

    add-int/lit8 v0, p4, -0x1

    if-ltz v0, :cond_1

    sget-object v1, Lce3/f;->a:[Lce3/c;

    array-length v2, v1

    add-int/lit8 v2, v2, -0x1

    if-gt v0, v2, :cond_1

    aget-object p4, v1, v0

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object v1, Lce3/f;->a:[Lce3/c;

    array-length v1, v1

    sub-int/2addr v0, v1

    iget v1, p1, Lce3/d;->e:I

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v1, v0

    if-ltz v1, :cond_2

    iget-object v0, p1, Lce3/d;->d:[Lce3/c;

    array-length v2, v0

    if-ge v1, v2, :cond_2

    aget-object p4, v0, v1

    invoke-static {p4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Header index too large "

    invoke-static {p4, p2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const/16 v1, 0x40

    if-ne v0, v1, :cond_4

    sget-object p4, Lce3/f;->a:[Lce3/c;

    invoke-virtual {p1}, Lce3/d;->d()Lne3/l;

    move-result-object p4

    invoke-static {p4}, Lce3/f;->a(Lne3/l;)V

    invoke-virtual {p1}, Lce3/d;->d()Lne3/l;

    move-result-object v0

    new-instance v1, Lce3/c;

    invoke-direct {v1, p4, v0}, Lce3/c;-><init>(Lne3/l;Lne3/l;)V

    invoke-virtual {p1, v1}, Lce3/d;->c(Lce3/c;)V

    goto :goto_0

    :cond_4
    and-int/lit8 v2, p4, 0x40

    if-ne v2, v1, :cond_5

    const/16 p4, 0x3f

    invoke-virtual {p1, v0, p4}, Lce3/d;->e(II)I

    move-result p4

    add-int/lit8 p4, p4, -0x1

    invoke-virtual {p1, p4}, Lce3/d;->b(I)Lne3/l;

    move-result-object p4

    invoke-virtual {p1}, Lce3/d;->d()Lne3/l;

    move-result-object v0

    new-instance v1, Lce3/c;

    invoke-direct {v1, p4, v0}, Lce3/c;-><init>(Lne3/l;Lne3/l;)V

    invoke-virtual {p1, v1}, Lce3/d;->c(Lce3/c;)V

    goto/16 :goto_0

    :cond_5
    and-int/lit8 p4, p4, 0x20

    const/16 v1, 0x20

    if-ne p4, v1, :cond_8

    const/16 p4, 0x1f

    invoke-virtual {p1, v0, p4}, Lce3/d;->e(II)I

    move-result p4

    iput p4, p1, Lce3/d;->a:I

    if-ltz p4, :cond_7

    const/16 v0, 0x1000

    if-gt p4, v0, :cond_7

    iget v0, p1, Lce3/d;->g:I

    if-ge p4, v0, :cond_0

    if-nez p4, :cond_6

    iget-object p4, p1, Lce3/d;->d:[Lce3/c;

    const/4 v0, 0x0

    invoke-static {p4, v0}, Lm83/n;->q0([Ljava/lang/Object;Lhc3/x;)V

    iget-object p4, p1, Lce3/d;->d:[Lce3/c;

    array-length p4, p4

    add-int/lit8 p4, p4, -0x1

    iput p4, p1, Lce3/d;->e:I

    const/4 p4, 0x0

    iput p4, p1, Lce3/d;->f:I

    iput p4, p1, Lce3/d;->g:I

    goto/16 :goto_0

    :cond_6
    sub-int/2addr v0, p4

    invoke-virtual {p1, v0}, Lce3/d;->a(I)I

    goto/16 :goto_0

    :cond_7
    new-instance p2, Ljava/io/IOException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Invalid dynamic table size update "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p1, p1, Lce3/d;->a:I

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_8
    const/16 p4, 0x10

    if-eq v0, p4, :cond_a

    if-nez v0, :cond_9

    goto :goto_1

    :cond_9
    const/16 p4, 0xf

    invoke-virtual {p1, v0, p4}, Lce3/d;->e(II)I

    move-result p4

    add-int/lit8 p4, p4, -0x1

    invoke-virtual {p1, p4}, Lce3/d;->b(I)Lne3/l;

    move-result-object p4

    invoke-virtual {p1}, Lce3/d;->d()Lne3/l;

    move-result-object v0

    new-instance v1, Lce3/c;

    invoke-direct {v1, p4, v0}, Lce3/c;-><init>(Lne3/l;Lne3/l;)V

    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_a
    :goto_1
    sget-object p4, Lce3/f;->a:[Lce3/c;

    invoke-virtual {p1}, Lce3/d;->d()Lne3/l;

    move-result-object p4

    invoke-static {p4}, Lce3/f;->a(Lne3/l;)V

    invoke-virtual {p1}, Lce3/d;->d()Lne3/l;

    move-result-object v0

    new-instance v1, Lce3/c;

    invoke-direct {v1, p4, v0}, Lce3/c;-><init>(Lne3/l;Lne3/l;)V

    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_b
    new-instance p1, Ljava/io/IOException;

    const-string p2, "index == 0"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    invoke-static {p3}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p3}, Ljava/util/ArrayList;->clear()V

    return-object p1
.end method

.method public final k(Lce3/p;III)V
    .locals 11

    if-eqz p4, :cond_8

    and-int/lit8 v2, p3, 0x1

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    and-int/lit8 v2, p3, 0x8

    if-eqz v2, :cond_1

    iget-object v2, p0, Lce3/u;->w:Lne3/j;

    invoke-interface {v2}, Lne3/j;->readByte()B

    move-result v2

    sget-object v3, Lwd3/f;->a:[B

    and-int/lit16 v3, v2, 0xff

    :cond_1
    and-int/lit8 v2, p3, 0x20

    if-eqz v2, :cond_2

    iget-object v2, p0, Lce3/u;->w:Lne3/j;

    invoke-interface {v2}, Lne3/j;->readInt()I

    invoke-interface {v2}, Lne3/j;->readByte()B

    sget-object v2, Lwd3/f;->a:[B

    add-int/lit8 v2, p2, -0x5

    goto :goto_1

    :cond_2
    move v2, p2

    :goto_1
    invoke-static {v2, p3, v3}, Lce3/s;->a(III)I

    move-result v2

    invoke-virtual {p0, v2, v3, p3, p4}, Lce3/u;->i(IIII)Ljava/util/List;

    move-result-object v0

    iget-object p1, p1, Lce3/p;->y:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lce3/q;

    const/16 p1, 0x5b

    if-eqz p4, :cond_3

    and-int/lit8 v3, p4, 0x1

    if-nez v3, :cond_3

    iget-object v5, v2, Lce3/q;->I:Lyd3/c;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v2, Lce3/q;->y:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "] onHeaders"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v9, Lce3/l;

    invoke-direct {v9, v2, p4, v0, v4}, Lce3/l;-><init>(Lce3/q;ILjava/util/List;Z)V

    const/4 v10, 0x6

    const-wide/16 v7, 0x0

    invoke-static/range {v5 .. v10}, Lyd3/c;->c(Lyd3/c;Ljava/lang/String;JLc93/a;I)V

    return-void

    :cond_3
    monitor-enter v2

    :try_start_0
    invoke-virtual {v2, p4}, Lce3/q;->h(I)Lce3/y;

    move-result-object v3

    if-nez v3, :cond_7

    iget-boolean v3, v2, Lce3/q;->F:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_4

    monitor-exit v2

    return-void

    :cond_4
    :try_start_1
    iget v3, v2, Lce3/q;->z:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gt p4, v3, :cond_5

    monitor-exit v2

    return-void

    :cond_5
    :try_start_2
    rem-int/lit8 v3, p4, 0x2

    iget v5, v2, Lce3/q;->E:I

    rem-int/lit8 v5, v5, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v3, v5, :cond_6

    monitor-exit v2

    return-void

    :cond_6
    :try_start_3
    invoke-static {v0}, Lwd3/h;->h(Ljava/util/List;)Lud3/d0;

    move-result-object v5

    new-instance v0, Lce3/y;

    const/4 v3, 0x0

    move v1, p4

    invoke-direct/range {v0 .. v5}, Lce3/y;-><init>(ILce3/q;ZZLud3/d0;)V

    iput p4, v2, Lce3/q;->z:I

    iget-object v3, v2, Lce3/q;->x:Ljava/util/LinkedHashMap;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v2, Lce3/q;->G:Lyd3/d;

    invoke-virtual {v3}, Lyd3/d;->d()Lyd3/c;

    move-result-object v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v2, Lce3/q;->y:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "] onStream"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v8, La11/l;

    const/16 p1, 0xb

    invoke-direct {v8, p1, v2, v0}, La11/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v9, 0x6

    const-wide/16 v6, 0x0

    invoke-static/range {v4 .. v9}, Lyd3/c;->c(Lyd3/c;Ljava/lang/String;JLc93/a;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_7
    monitor-exit v2

    invoke-static {v0}, Lwd3/h;->h(Ljava/util/List;)Lud3/d0;

    move-result-object p1

    invoke-virtual {v3, p1, v4}, Lce3/y;->j(Lud3/d0;Z)V

    return-void

    :goto_2
    monitor-exit v2

    throw p1

    :cond_8
    new-instance p1, Ljava/io/IOException;

    const-string v0, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m(Lce3/p;III)V
    .locals 9

    if-eqz p4, :cond_2

    and-int/lit8 v0, p3, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lce3/u;->w:Lne3/j;

    invoke-interface {v0}, Lne3/j;->readByte()B

    move-result v0

    sget-object v2, Lwd3/f;->a:[B

    and-int/lit16 v0, v0, 0xff

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Lce3/u;->w:Lne3/j;

    invoke-interface {v2}, Lne3/j;->readInt()I

    move-result v2

    const v3, 0x7fffffff

    and-int/2addr v2, v3

    add-int/lit8 p2, p2, -0x4

    invoke-static {p2, p3, v0}, Lce3/s;->a(III)I

    move-result p2

    invoke-virtual {p0, p2, v0, p3, p4}, Lce3/u;->i(IIII)Ljava/util/List;

    move-result-object p2

    iget-object p1, p1, Lce3/p;->y:Ljava/lang/Object;

    check-cast p1, Lce3/q;

    monitor-enter p1

    :try_start_0
    iget-object p3, p1, Lce3/q;->Z:Ljava/util/LinkedHashSet;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    sget-object p2, Lce3/a;->z:Lce3/a;

    invoke-virtual {p1, v2, p2}, Lce3/q;->x(ILce3/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    move-object p2, v0

    goto :goto_1

    :cond_1
    :try_start_1
    iget-object p3, p1, Lce3/q;->Z:Ljava/util/LinkedHashSet;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p1

    iget-object v3, p1, Lce3/q;->I:Lyd3/c;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p4, p1, Lce3/q;->y:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p4, 0x5b

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, "] onRequest"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v7, Lce3/l;

    invoke-direct {v7, p1, v2, p2, v1}, Lce3/l;-><init>(Lce3/q;ILjava/lang/Object;I)V

    const/4 v8, 0x6

    const-wide/16 v5, 0x0

    invoke-static/range {v3 .. v8}, Lyd3/c;->c(Lyd3/c;Ljava/lang/String;JLc93/a;I)V

    return-void

    :goto_1
    monitor-exit p1

    throw p2

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
