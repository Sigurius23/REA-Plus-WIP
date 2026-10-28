.class public final Lvt0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005JJ\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lvt0/a;",
        "",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ltr2/n;)V",
        "Ljava/io/File;",
        "outputFile",
        "",
        "Llu0/a;",
        "dataPacketList",
        "",
        "revision",
        "",
        "maxFileSize",
        "Lq83/j;",
        "ioDispatcher",
        "Lvt0/b;",
        "a",
        "(Ljava/io/File;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Long;Lq83/j;Lq83/d;)Ljava/lang/Object;",
        "Ltr2/n;",
        "connectivity-data-packets_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ltr2/n;


# direct methods
.method public constructor <init>(Ltr2/n;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvt0/a;->a:Ltr2/n;

    return-void
.end method

.method public static b(Lvt0/a;Ljava/io/File;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Long;Lq83/j;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    and-int/lit8 p8, p7, 0x4

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_2

    sget-object p5, Lbc3/q0;->a:Lkc3/e;

    sget-object p5, Lkc3/d;->w:Lkc3/d;

    :cond_2
    invoke-virtual/range {p0 .. p6}, Lvt0/a;->a(Ljava/io/File;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Long;Lq83/j;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/io/File;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Long;Lq83/j;Lq83/d;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/util/List<",
            "+",
            "Llu0/a;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            "Lq83/j;",
            "Lq83/d<",
            "-",
            "Lvt0/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p6

    instance-of v3, v2, Lvt0/a$a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lvt0/a$a;

    iget v4, v3, Lvt0/a$a;->M:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lvt0/a$a;->M:I

    goto :goto_0

    :cond_0
    new-instance v3, Lvt0/a$a;

    invoke-direct {v3, v1, v2}, Lvt0/a$a;-><init>(Lvt0/a;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lvt0/a$a;->K:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lvt0/a$a;->M:I

    const/4 v6, 0x1

    const/4 v8, 0x0

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v0, v3, Lvt0/a$a;->J:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/f0;

    iget-object v4, v3, Lvt0/a$a;->I:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/f0;

    iget-object v5, v3, Lvt0/a$a;->H:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/internal/f0;

    iget-object v9, v3, Lvt0/a$a;->G:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/internal/f0;

    iget-object v10, v3, Lvt0/a$a;->F:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/internal/e0;

    iget-object v11, v3, Lvt0/a$a;->E:Ljava/lang/Object;

    check-cast v11, Lq83/j;

    iget-object v11, v3, Lvt0/a$a;->z:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Long;

    iget-object v12, v3, Lvt0/a$a;->y:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Integer;

    iget-object v13, v3, Lvt0/a$a;->x:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    iget-object v14, v3, Lvt0/a$a;->w:Ljava/lang/Object;

    check-cast v14, Ljava/io/File;

    :try_start_0
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v20, v14

    goto/16 :goto_3

    :catch_0
    move-exception v0

    goto/16 :goto_8

    :catch_1
    move-exception v0

    move-object v6, v8

    :goto_1
    const/4 v7, 0x0

    goto/16 :goto_9

    :catch_2
    move-exception v0

    move-object v6, v8

    :goto_2
    const/4 v7, 0x0

    goto/16 :goto_a

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v10, Lkotlin/jvm/internal/e0;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    const/4 v2, -0x1

    iput v2, v10, Lkotlin/jvm/internal/e0;->w:I

    new-instance v9, Lkotlin/jvm/internal/f0;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkotlin/jvm/internal/f0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    const-wide v11, 0x7fffffffffffffffL

    iput-wide v11, v5, Lkotlin/jvm/internal/f0;->w:J

    new-instance v2, Lkotlin/jvm/internal/f0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v11, Lkotlin/jvm/internal/f0;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    :try_start_1
    new-instance v12, Lvt0/a$b;
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    invoke-direct {v12, v0, v8}, Lvt0/a$b;-><init>(Ljava/io/File;Lq83/d;)V

    iput-object v0, v3, Lvt0/a$a;->w:Ljava/lang/Object;

    move-object/from16 v13, p2

    iput-object v13, v3, Lvt0/a$a;->x:Ljava/lang/Object;

    move-object/from16 v14, p3

    iput-object v14, v3, Lvt0/a$a;->y:Ljava/lang/Object;

    move-object/from16 v15, p4

    iput-object v15, v3, Lvt0/a$a;->z:Ljava/lang/Object;

    iput-object v8, v3, Lvt0/a$a;->E:Ljava/lang/Object;

    iput-object v10, v3, Lvt0/a$a;->F:Ljava/lang/Object;

    iput-object v9, v3, Lvt0/a$a;->G:Ljava/lang/Object;

    iput-object v5, v3, Lvt0/a$a;->H:Ljava/lang/Object;

    iput-object v2, v3, Lvt0/a$a;->I:Ljava/lang/Object;

    iput-object v11, v3, Lvt0/a$a;->J:Ljava/lang/Object;

    iput v6, v3, Lvt0/a$a;->M:I

    move-object/from16 v6, p5

    invoke-static {v6, v12, v3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_3

    return-object v4

    :cond_3
    move-object/from16 v20, v0

    move-object v4, v2

    move-object v2, v6

    move-object v0, v11

    move-object v12, v14

    move-object v11, v15

    :goto_3
    check-cast v2, Ljava/io/Closeable;
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    move-object v6, v2

    check-cast v6, Ljava/io/BufferedOutputStream;

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    const/4 v14, 0x1

    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_a

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Llu0/a;

    invoke-interface {v15}, Llu0/a;->a()Ljava/nio/ByteBuffer;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v8

    if-eqz v11, :cond_4

    move-object/from16 p1, v13

    move/from16 p2, v14

    iget-wide v13, v0, Lkotlin/jvm/internal/f0;->w:J

    array-length v7, v8

    move-wide/from16 v17, v13

    int-to-long v13, v7

    add-long v13, v17, v13

    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    cmp-long v7, v13, v17

    if-lez v7, :cond_5

    goto/16 :goto_6

    :catchall_0
    move-exception v0

    move-object v4, v0

    goto/16 :goto_7

    :cond_4
    move-object/from16 p1, v13

    move/from16 p2, v14

    :cond_5
    if-eqz p2, :cond_6

    invoke-interface {v15}, Llu0/a;->b()I

    move-result v7

    iput v7, v10, Lkotlin/jvm/internal/e0;->w:I

    const/16 p2, 0x0

    goto :goto_5

    :cond_6
    iget v7, v10, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {v15}, Llu0/a;->b()I

    move-result v13

    if-eq v7, v13, :cond_7

    iget-object v0, v1, Lvt0/a;->a:Ltr2/n;

    iget v6, v10, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {v15}, Llu0/a;->b()I

    move-result v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Change in version detected for the R"

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, " packets. First version is "

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " and current version is "

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ". Breaking out"

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    new-array v8, v7, [Lqr2/a$a;

    invoke-interface {v0, v6, v8}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_6

    :cond_7
    :goto_5
    invoke-interface {v15}, Llu0/a;->getTimestamp()J

    move-result-wide v13

    invoke-virtual {v6, v8}, Ljava/io/OutputStream;->write([B)V

    move-object/from16 p3, v6

    iget-wide v6, v4, Lkotlin/jvm/internal/f0;->w:J

    const-wide/16 v17, 0x1

    add-long v6, v6, v17

    iput-wide v6, v4, Lkotlin/jvm/internal/f0;->w:J

    iget-wide v6, v0, Lkotlin/jvm/internal/f0;->w:J

    array-length v8, v8

    move-wide/from16 v17, v6

    int-to-long v6, v8

    add-long v6, v17, v6

    iput-wide v6, v0, Lkotlin/jvm/internal/f0;->w:J

    iget-wide v6, v9, Lkotlin/jvm/internal/f0;->w:J

    cmp-long v6, v13, v6

    if-lez v6, :cond_8

    iput-wide v13, v9, Lkotlin/jvm/internal/f0;->w:J

    :cond_8
    iget-wide v6, v5, Lkotlin/jvm/internal/f0;->w:J

    cmp-long v6, v13, v6

    if-gez v6, :cond_9

    iput-wide v13, v5, Lkotlin/jvm/internal/f0;->w:J

    :cond_9
    move-object/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v6, p3

    const/4 v8, 0x0

    goto/16 :goto_4

    :cond_a
    :goto_6
    iget-object v0, v1, Lvt0/a;->a:Ltr2/n;

    iget-wide v6, v4, Lkotlin/jvm/internal/f0;->w:J

    iget-wide v13, v5, Lkotlin/jvm/internal/f0;->w:J

    invoke-static {v13, v14}, Lor2/v1;->b(J)Ljava/lang/String;

    move-result-object v8

    iget-wide v13, v9, Lkotlin/jvm/internal/f0;->w:J

    invoke-static {v13, v14}, Lor2/v1;->b(J)Ljava/lang/String;

    move-result-object v11

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Exported "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " of R"

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " data packets for range "

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " - "

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    new-array v8, v7, [Lqr2/a$a;

    invoke-interface {v0, v6, v8}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 v6, 0x0

    :try_start_4
    invoke-static {v2, v6}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    new-instance v12, Lvt0/b;

    iget v13, v10, Lkotlin/jvm/internal/e0;->w:I

    iget-wide v14, v9, Lkotlin/jvm/internal/f0;->w:J

    iget-wide v2, v5, Lkotlin/jvm/internal/f0;->w:J

    iget-wide v4, v4, Lkotlin/jvm/internal/f0;->w:J

    move-wide/from16 v16, v2

    move-wide/from16 v18, v4

    invoke-direct/range {v12 .. v20}, Lvt0/b;-><init>(IJJJLjava/io/File;)V

    return-object v12

    :catch_3
    move-exception v0

    const/4 v6, 0x0

    goto/16 :goto_1

    :catch_4
    move-exception v0

    const/4 v6, 0x0

    goto/16 :goto_2

    :goto_7
    :try_start_5
    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_6
    invoke-static {v2, v4}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :goto_8
    iget-object v2, v1, Lvt0/a;->a:Ltr2/n;

    const-string v4, "Caught an exception when trying to export data"

    const/4 v7, 0x0

    new-array v5, v7, [Lqr2/a$a;

    invoke-interface {v2, v4, v0, v5}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    invoke-interface {v3}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->o(Lq83/j;)V

    const/4 v6, 0x0

    return-object v6

    :goto_9
    iget-object v2, v1, Lvt0/a;->a:Ltr2/n;

    const-string v3, "Failed to write to the export file"

    new-array v4, v7, [Lqr2/a$a;

    invoke-interface {v2, v3, v0, v4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-object v6

    :goto_a
    iget-object v2, v1, Lvt0/a;->a:Ltr2/n;

    const-string v3, "Failed to create export file from Room db"

    new-array v4, v7, [Lqr2/a$a;

    invoke-interface {v2, v3, v0, v4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-object v6
.end method
