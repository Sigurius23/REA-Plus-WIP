.class public final Lne3/s0;
.super Lne3/p;
.source "SourceFile"


# static fields
.field public static final F:Lne3/e0;


# instance fields
.field public final E:Ljava/util/LinkedHashMap;

.field public final y:Lne3/e0;

.field public final z:Lne3/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lne3/e0;->x:Ljava/lang/String;

    const-string v0, "/"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljc/b;->o(Ljava/lang/String;Z)Lne3/e0;

    move-result-object v0

    sput-object v0, Lne3/s0;->F:Lne3/e0;

    return-void
.end method

.method public constructor <init>(Lne3/e0;Lne3/p;Ljava/util/LinkedHashMap;)V
    .locals 1

    const-string v0, "fileSystem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lne3/s0;->y:Lne3/e0;

    iput-object p2, p0, Lne3/s0;->z:Lne3/p;

    iput-object p3, p0, Lne3/s0;->E:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final J(Lne3/e0;)Ljava/util/List;
    .locals 3

    sget-object v0, Lne3/s0;->F:Lne3/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Loe3/c;->b(Lne3/e0;Lne3/e0;Z)Lne3/e0;

    move-result-object v0

    iget-object v1, p0, Lne3/s0;->E:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loe3/i;

    if-eqz v0, :cond_0

    iget-object p1, v0, Loe3/i;->q:Ljava/util/ArrayList;

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "not a directory: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a0(Lne3/e0;)Ln4/f;
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "path"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lne3/s0;->F:Lne3/e0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x1

    invoke-static {v2, v0, v3}, Loe3/c;->b(Lne3/e0;Lne3/e0;Z)Lne3/e0;

    move-result-object v0

    iget-object v2, v1, Lne3/s0;->E:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loe3/i;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return-object v2

    :cond_0
    iget-wide v4, v0, Loe3/i;->h:J

    const-wide/16 v6, -0x1

    cmp-long v6, v4, v6

    if-eqz v6, :cond_4

    iget-object v6, v1, Lne3/s0;->z:Lne3/p;

    iget-object v7, v1, Lne3/s0;->y:Lne3/e0;

    invoke-virtual {v6, v7}, Lne3/p;->b0(Lne3/e0;)Lne3/z;

    move-result-object v6

    :try_start_0
    invoke-virtual {v6, v4, v5}, Lne3/z;->i(J)Lne3/o;

    move-result-object v4

    invoke-static {v4}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    invoke-static {v4, v0}, Lv8/b;->Q(Lne3/j0;Loe3/i;)Loe3/i;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v4}, Lne3/j0;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v0, v2

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v5, v0

    :try_start_3
    invoke-virtual {v4}, Lne3/j0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v0

    :try_start_4
    invoke-static {v5, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :goto_0
    move-object v0, v5

    move-object v5, v2

    :goto_1
    if-nez v0, :cond_1

    :try_start_5
    invoke-virtual {v6}, Lne3/z;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    move-object v0, v2

    goto :goto_2

    :catchall_3
    move-exception v0

    :goto_2
    move-object v4, v0

    move-object v0, v5

    goto :goto_4

    :cond_1
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :catchall_4
    move-exception v0

    move-object v4, v0

    if-eqz v6, :cond_2

    :try_start_7
    invoke-virtual {v6}, Lne3/z;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    goto :goto_3

    :catchall_5
    move-exception v0

    invoke-static {v4, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_2
    :goto_3
    move-object v0, v2

    :goto_4
    if-nez v4, :cond_3

    goto :goto_5

    :cond_3
    throw v4

    :cond_4
    :goto_5
    new-instance v4, Ln4/f;

    iget-boolean v6, v0, Loe3/i;->b:Z

    xor-int/lit8 v5, v6, 0x1

    if-eqz v6, :cond_5

    move-object v8, v2

    goto :goto_6

    :cond_5
    iget-wide v7, v0, Loe3/i;->f:J

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    move-object v8, v7

    :goto_6
    iget-object v7, v0, Loe3/i;->m:Ljava/lang/Long;

    const-wide v9, 0xa9730b66800L

    const/16 v11, 0x2710

    const-wide/16 v12, 0x3e8

    if-eqz v7, :cond_6

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    move v7, v3

    int-to-long v2, v11

    div-long/2addr v14, v2

    sub-long/2addr v14, v9

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    goto :goto_7

    :cond_6
    move v7, v3

    iget-object v2, v0, Loe3/i;->p:Ljava/lang/Integer;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    mul-long/2addr v2, v12

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    goto :goto_7

    :cond_7
    const/4 v2, 0x0

    :goto_7
    iget-object v3, v0, Loe3/i;->k:Ljava/lang/Long;

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    move-wide/from16 v16, v9

    int-to-long v9, v11

    div-long/2addr v14, v9

    sub-long v14, v14, v16

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :goto_8
    move-object v10, v3

    goto :goto_9

    :cond_8
    move-wide/from16 v16, v9

    iget-object v3, v0, Loe3/i;->n:Ljava/lang/Integer;

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-long v9, v3

    mul-long/2addr v9, v12

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_8

    :cond_9
    iget v3, v0, Loe3/i;->j:I

    const/4 v9, -0x1

    if-eq v3, v9, :cond_a

    iget v10, v0, Loe3/i;->i:I

    if-ne v3, v9, :cond_b

    :cond_a
    const/4 v10, 0x0

    goto :goto_9

    :cond_b
    shr-int/lit8 v9, v10, 0x9

    and-int/lit8 v9, v9, 0x7f

    add-int/lit16 v9, v9, 0x7bc

    shr-int/lit8 v14, v10, 0x5

    and-int/lit8 v14, v14, 0xf

    and-int/lit8 v21, v10, 0x1f

    shr-int/lit8 v10, v3, 0xb

    and-int/lit8 v22, v10, 0x1f

    shr-int/lit8 v10, v3, 0x5

    and-int/lit8 v23, v10, 0x3f

    and-int/lit8 v3, v3, 0x1f

    shl-int/lit8 v24, v3, 0x1

    new-instance v3, Ljava/util/GregorianCalendar;

    invoke-direct {v3}, Ljava/util/GregorianCalendar;-><init>()V

    const/16 v10, 0xe

    const/4 v15, 0x0

    invoke-virtual {v3, v10, v15}, Ljava/util/Calendar;->set(II)V

    add-int/lit8 v20, v14, -0x1

    move-object/from16 v18, v3

    move/from16 v19, v9

    invoke-virtual/range {v18 .. v24}, Ljava/util/Calendar;->set(IIIIII)V

    invoke-virtual/range {v18 .. v18}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_8

    :goto_9
    iget-object v3, v0, Loe3/i;->l:Ljava/lang/Long;

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    int-to-long v14, v11

    div-long/2addr v12, v14

    sub-long v12, v12, v16

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_a
    move-object v11, v0

    goto :goto_b

    :cond_c
    iget-object v0, v0, Loe3/i;->o:Ljava/lang/Integer;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v14, v0

    mul-long/2addr v14, v12

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_a

    :cond_d
    const/4 v11, 0x0

    :goto_b
    const/4 v7, 0x0

    move-object v9, v2

    invoke-direct/range {v4 .. v11}, Ln4/f;-><init>(ZZLne3/e0;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V

    return-object v4
.end method

.method public final b(Lne3/e0;)Lne3/n0;
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/io/IOException;

    const-string v0, "zip file systems are read-only"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b0(Lne3/e0;)Lne3/z;
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "not implemented yet!"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h(Lne3/e0;Lne3/e0;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "target"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/io/IOException;

    const-string p2, "zip file systems are read-only"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final k(Lne3/e0;)V
    .locals 1

    const-string v0, "dir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/io/IOException;

    const-string v0, "zip file systems are read-only"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m(Lne3/e0;)V
    .locals 1

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/io/IOException;

    const-string v0, "zip file systems are read-only"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final o0(Lne3/e0;)Lne3/z;
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/io/IOException;

    const-string v0, "zip entries are not writable"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final p0(Lne3/e0;Z)Lne3/n0;
    .locals 0

    const-string p2, "file"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/io/IOException;

    const-string p2, "zip file systems are read-only"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final x0(Lne3/e0;)Lne3/p0;
    .locals 8

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lne3/s0;->F:Lne3/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Loe3/c;->b(Lne3/e0;Lne3/e0;Z)Lne3/e0;

    move-result-object v0

    iget-object v2, p0, Lne3/s0;->E:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loe3/i;

    if-eqz v0, :cond_3

    iget-wide v2, v0, Loe3/i;->f:J

    iget-object p1, p0, Lne3/s0;->z:Lne3/p;

    iget-object v4, p0, Lne3/s0;->y:Lne3/e0;

    invoke-virtual {p1, v4}, Lne3/p;->b0(Lne3/e0;)Lne3/z;

    move-result-object p1

    const/4 v4, 0x0

    :try_start_0
    iget-wide v5, v0, Loe3/i;->h:J

    invoke-virtual {p1, v5, v6}, Lne3/z;->i(J)Lne3/o;

    move-result-object v5

    invoke-static {v5}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p1}, Lne3/z;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object p1, v4

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception v5

    if-eqz p1, :cond_0

    :try_start_2
    invoke-virtual {p1}, Lne3/z;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception p1

    invoke-static {v5, p1}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    move-object p1, v5

    move-object v5, v4

    :goto_1
    if-nez p1, :cond_2

    const-string p1, "<this>"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v4}, Lv8/b;->Q(Lne3/j0;Loe3/i;)Loe3/i;

    iget p1, v0, Loe3/i;->g:I

    if-nez p1, :cond_1

    new-instance p1, Loe3/f;

    invoke-direct {p1, v5, v2, v3, v1}, Loe3/f;-><init>(Lne3/p0;JZ)V

    goto :goto_2

    :cond_1
    new-instance p1, Lne3/x;

    new-instance v4, Loe3/f;

    iget-wide v6, v0, Loe3/i;->e:J

    invoke-direct {v4, v5, v6, v7, v1}, Loe3/f;-><init>(Lne3/p0;JZ)V

    new-instance v0, Ljava/util/zip/Inflater;

    invoke-direct {v0, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    invoke-static {v4}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v1

    invoke-direct {p1, v1, v0}, Lne3/x;-><init>(Lne3/j0;Ljava/util/zip/Inflater;)V

    new-instance v0, Loe3/f;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v2, v3, v1}, Loe3/f;-><init>(Lne3/p0;JZ)V

    move-object p1, v0

    :goto_2
    return-object p1

    :cond_2
    throw p1

    :cond_3
    new-instance v0, Ljava/io/FileNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "no such file: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
