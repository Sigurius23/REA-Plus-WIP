.class public final Leh/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# static fields
.field public static final Q:Lyb3/p;


# instance fields
.field public final E:Lne3/e0;

.field public final F:Ljava/util/LinkedHashMap;

.field public final G:Lhc3/d;

.field public H:J

.field public I:I

.field public J:Lne3/h0;

.field public K:Z

.field public L:Z

.field public M:Z

.field public N:Z

.field public O:Z

.field public final P:Leh/d;

.field public final w:Lne3/e0;

.field public final x:J

.field public final y:Lne3/e0;

.field public final z:Lne3/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyb3/p;

    const-string v1, "[a-z0-9_-]{1,120}"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Leh/e;->Q:Lyb3/p;

    return-void
.end method

.method public constructor <init>(JLbc3/z;Lne3/p;Lne3/e0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p5, p0, Leh/e;->w:Lne3/e0;

    iput-wide p1, p0, Leh/e;->x:J

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    const-string p1, "journal"

    invoke-virtual {p5, p1}, Lne3/e0;->e(Ljava/lang/String;)Lne3/e0;

    move-result-object p1

    iput-object p1, p0, Leh/e;->y:Lne3/e0;

    const-string p1, "journal.tmp"

    invoke-virtual {p5, p1}, Lne3/e0;->e(Ljava/lang/String;)Lne3/e0;

    move-result-object p1

    iput-object p1, p0, Leh/e;->z:Lne3/e0;

    const-string p1, "journal.bkp"

    invoke-virtual {p5, p1}, Lne3/e0;->e(Ljava/lang/String;)Lne3/e0;

    move-result-object p1

    iput-object p1, p0, Leh/e;->E:Lne3/e0;

    new-instance p1, Ljava/util/LinkedHashMap;

    const/4 p2, 0x0

    const/high16 p5, 0x3f400000    # 0.75f

    const/4 v0, 0x1

    invoke-direct {p1, p2, p5, v0}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object p1, p0, Leh/e;->F:Ljava/util/LinkedHashMap;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p1

    invoke-virtual {p3, v0}, Lbc3/z;->limitedParallelism(I)Lbc3/z;

    move-result-object p2

    invoke-static {p1, p2}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Leh/e;->G:Lhc3/d;

    new-instance p1, Leh/d;

    invoke-direct {p1, p4}, Lne3/q;-><init>(Lne3/p;)V

    iput-object p1, p0, Leh/e;->P:Leh/d;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "maxSize <= 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final b(Leh/e;Leh/a;Z)V
    .locals 9

    monitor-enter p0

    :try_start_0
    iget-object v0, p1, Leh/a;->b:Ljava/lang/Object;

    check-cast v0, Leh/b;

    iget-object v1, v0, Leh/b;->g:Leh/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz p2, :cond_5

    iget-boolean v3, v0, Leh/b;->f:Z

    if-nez v3, :cond_5

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    iget-object v4, p1, Leh/a;->c:Ljava/io/Serializable;

    check-cast v4, [Z

    aget-boolean v4, v4, v3

    if-eqz v4, :cond_0

    iget-object v4, p0, Leh/e;->P:Leh/d;

    iget-object v5, v0, Leh/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lne3/e0;

    invoke-virtual {v4, v5}, Lne3/p;->x(Lne3/e0;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {p1, v2}, Leh/a;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto/16 :goto_8

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move p1, v2

    :goto_1
    if-ge p1, v1, :cond_6

    :try_start_1
    iget-object v3, v0, Leh/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lne3/e0;

    iget-object v4, v0, Leh/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lne3/e0;

    iget-object v5, p0, Leh/e;->P:Leh/d;

    invoke-virtual {v5, v3}, Lne3/p;->x(Lne3/e0;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v5, p0, Leh/e;->P:Leh/d;

    invoke-virtual {v5, v3, v4}, Lne3/q;->h(Lne3/e0;Lne3/e0;)V

    goto :goto_2

    :cond_2
    iget-object v3, p0, Leh/e;->P:Leh/d;

    iget-object v5, v0, Leh/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lne3/e0;

    invoke-virtual {v3, v5}, Lne3/p;->x(Lne3/e0;)Z

    move-result v6

    if-nez v6, :cond_3

    invoke-virtual {v3, v5, v2}, Leh/d;->p0(Lne3/e0;Z)Lne3/n0;

    move-result-object v3

    invoke-static {v3}, Lqh/d;->a(Ljava/io/Closeable;)V

    :cond_3
    :goto_2
    iget-object v3, v0, Leh/b;->b:[J

    aget-wide v5, v3, p1

    iget-object v3, p0, Leh/e;->P:Leh/d;

    invoke-virtual {v3, v4}, Lne3/p;->T(Lne3/e0;)Ln4/f;

    move-result-object v3

    iget-object v3, v3, Ln4/f;->e:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_3

    :cond_4
    const-wide/16 v3, 0x0

    :goto_3
    iget-object v7, v0, Leh/b;->b:[J

    aput-wide v3, v7, p1

    iget-wide v7, p0, Leh/e;->H:J

    sub-long/2addr v7, v5

    add-long/2addr v7, v3

    iput-wide v7, p0, Leh/e;->H:J

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_5
    move p1, v2

    :goto_4
    if-ge p1, v1, :cond_6

    iget-object v3, p0, Leh/e;->P:Leh/d;

    iget-object v4, v0, Leh/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lne3/e0;

    invoke-virtual {v3, v4}, Lne3/p;->s(Lne3/e0;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_6
    const/4 p1, 0x0

    iput-object p1, v0, Leh/b;->g:Leh/a;

    iget-boolean p1, v0, Leh/b;->f:Z

    if-eqz p1, :cond_7

    invoke-virtual {p0, v0}, Leh/e;->T(Leh/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_7
    :try_start_2
    iget p1, p0, Leh/e;->I:I

    const/4 v1, 0x1

    add-int/2addr p1, v1

    iput p1, p0, Leh/e;->I:I

    iget-object p1, p0, Leh/e;->J:Lne3/h0;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v3, 0xa

    const/16 v4, 0x20

    if-nez p2, :cond_9

    iget-boolean p2, v0, Leh/b;->e:Z

    if-eqz p2, :cond_8

    goto :goto_5

    :cond_8
    iget-object p2, p0, Leh/e;->F:Ljava/util/LinkedHashMap;

    iget-object v5, v0, Leh/b;->a:Ljava/lang/String;

    invoke-virtual {p2, v5}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "REMOVE"

    invoke-virtual {p1, p2}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v4}, Lne3/h0;->writeByte(I)Lne3/i;

    iget-object p2, v0, Leh/b;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v3}, Lne3/h0;->writeByte(I)Lne3/i;

    goto :goto_7

    :cond_9
    :goto_5
    iput-boolean v1, v0, Leh/b;->e:Z

    const-string p2, "CLEAN"

    invoke-virtual {p1, p2}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v4}, Lne3/h0;->writeByte(I)Lne3/i;

    iget-object p2, v0, Leh/b;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    iget-object p2, v0, Leh/b;->b:[J

    array-length v0, p2

    move v5, v2

    :goto_6
    if-ge v5, v0, :cond_a

    aget-wide v6, p2, v5

    invoke-virtual {p1, v4}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-virtual {p1, v6, v7}, Lne3/h0;->h0(J)Lne3/i;

    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_a
    invoke-virtual {p1, v3}, Lne3/h0;->writeByte(I)Lne3/i;

    :goto_7
    invoke-virtual {p1}, Lne3/h0;->flush()V

    iget-wide p1, p0, Leh/e;->H:J

    iget-wide v3, p0, Leh/e;->x:J

    cmp-long p1, p1, v3

    if-gtz p1, :cond_c

    iget p1, p0, Leh/e;->I:I

    const/16 p2, 0x7d0

    if-lt p1, p2, :cond_b

    move v2, v1

    :cond_b
    if-eqz v2, :cond_d

    :cond_c
    invoke-virtual {p0}, Leh/e;->m()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_d
    monitor-exit p0

    return-void

    :cond_e
    :try_start_3
    const-string p1, "Check failed."

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :goto_8
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public static b0(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Leh/e;->Q:Lyb3/p;

    invoke-virtual {v0, p0}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "keys must match regex [a-z0-9_-]{1,120}: \""

    const/16 v1, 0x22

    invoke-static {v1, v0, p0}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final J(Ljava/lang/String;)V
    .locals 12

    const/16 v0, 0x20

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-static {p1, v0, v1, v1, v2}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v3

    const-string v4, "unexpected journal line: "

    const/4 v5, -0x1

    if-eq v3, v5, :cond_8

    add-int/lit8 v6, v3, 0x1

    const/4 v7, 0x4

    invoke-static {p1, v0, v6, v1, v7}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v8

    iget-object v9, p0, Leh/e;->F:Ljava/util/LinkedHashMap;

    const-string v10, "substring(...)"

    if-ne v8, v5, :cond_0

    invoke-virtual {p1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne v3, v2, :cond_1

    const-string v11, "REMOVE"

    invoke-static {p1, v11, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-virtual {v9, v6}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-virtual {p1, v6, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v9, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_2

    new-instance v11, Leh/b;

    invoke-direct {v11, p0, v6}, Leh/b;-><init>(Leh/e;Ljava/lang/String;)V

    invoke-interface {v9, v6, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    check-cast v11, Leh/b;

    const/4 v6, 0x5

    if-eq v8, v5, :cond_4

    if-ne v3, v6, :cond_4

    const-string v9, "CLEAN"

    invoke-static {p1, v9, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_4

    const/4 v3, 0x1

    add-int/2addr v8, v3

    invoke-virtual {p1, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v5, v3, [C

    aput-char v0, v5, v1

    invoke-static {p1, v5, v1, v2}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object p1

    iput-boolean v3, v11, Leh/b;->e:Z

    const/4 v0, 0x0

    iput-object v0, v11, Leh/b;->g:Leh/a;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_3

    :try_start_0
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    :goto_0
    if-ge v1, v0, :cond_6

    iget-object v2, v11, Leh/b;->b:[J

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    aput-wide v5, v2, v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    new-instance v0, Ljava/io/IOException;

    invoke-static {v4, p1}, Ldc/b;->q(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/io/IOException;

    invoke-static {v4, p1}, Ldc/b;->q(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    if-ne v8, v5, :cond_5

    if-ne v3, v6, :cond_5

    const-string v0, "DIRTY"

    invoke-static {p1, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance p1, Leh/a;

    invoke-direct {p1, p0, v11}, Leh/a;-><init>(Leh/e;Leh/b;)V

    iput-object p1, v11, Leh/b;->g:Leh/a;

    return-void

    :cond_5
    if-ne v8, v5, :cond_7

    if-ne v3, v7, :cond_7

    const-string v0, "READ"

    invoke-static {p1, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    return-void

    :cond_7
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {v4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {v4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final T(Leh/b;)V
    .locals 10

    iget v0, p1, Leh/b;->h:I

    iget-object v1, p1, Leh/b;->a:Ljava/lang/String;

    const/16 v2, 0xa

    const/16 v3, 0x20

    if-lez v0, :cond_0

    iget-object v0, p0, Leh/e;->J:Lne3/h0;

    if-eqz v0, :cond_0

    const-string v4, "DIRTY"

    invoke-virtual {v0, v4}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {v0, v3}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-virtual {v0, v1}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {v0, v2}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-virtual {v0}, Lne3/h0;->flush()V

    :cond_0
    iget v0, p1, Leh/b;->h:I

    const/4 v4, 0x1

    if-gtz v0, :cond_5

    iget-object v0, p1, Leh/b;->g:Leh/a;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/4 v5, 0x2

    if-ge v0, v5, :cond_2

    iget-object v5, p1, Leh/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lne3/e0;

    iget-object v6, p0, Leh/e;->P:Leh/d;

    invoke-virtual {v6, v5}, Lne3/p;->s(Lne3/e0;)V

    iget-wide v5, p0, Leh/e;->H:J

    iget-object v7, p1, Leh/b;->b:[J

    aget-wide v8, v7, v0

    sub-long/2addr v5, v8

    iput-wide v5, p0, Leh/e;->H:J

    const-wide/16 v5, 0x0

    aput-wide v5, v7, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget p1, p0, Leh/e;->I:I

    add-int/2addr p1, v4

    iput p1, p0, Leh/e;->I:I

    iget-object p1, p0, Leh/e;->J:Lne3/h0;

    if-eqz p1, :cond_3

    const-string v0, "REMOVE"

    invoke-virtual {p1, v0}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v3}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-virtual {p1, v1}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v2}, Lne3/h0;->writeByte(I)Lne3/i;

    :cond_3
    iget-object p1, p0, Leh/e;->F:Ljava/util/LinkedHashMap;

    invoke-virtual {p1, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, Leh/e;->I:I

    const/16 v0, 0x7d0

    if-lt p1, v0, :cond_4

    invoke-virtual {p0}, Leh/e;->m()V

    :cond_4
    return-void

    :cond_5
    :goto_1
    iput-boolean v4, p1, Leh/b;->f:Z

    return-void
.end method

.method public final a0()V
    .locals 4

    :goto_0
    iget-wide v0, p0, Leh/e;->H:J

    iget-wide v2, p0, Leh/e;->x:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    iget-object v0, p0, Leh/e;->F:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leh/b;

    iget-boolean v2, v1, Leh/b;->f:Z

    if-nez v2, :cond_0

    invoke-virtual {p0, v1}, Leh/e;->T(Leh/b;)V

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Leh/e;->N:Z

    return-void
.end method

.method public final declared-synchronized close()V
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Leh/e;->L:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Leh/e;->M:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Leh/e;->F:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const/4 v2, 0x0

    new-array v3, v2, [Leh/b;

    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Leh/b;

    array-length v3, v0

    :goto_0
    if-ge v2, v3, :cond_2

    aget-object v4, v0, v2

    iget-object v4, v4, Leh/b;->g:Leh/a;

    if-eqz v4, :cond_1

    iget-object v5, v4, Leh/a;->b:Ljava/lang/Object;

    check-cast v5, Leh/b;

    iget-object v6, v5, Leh/b;->g:Leh/a;

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iput-boolean v1, v5, Leh/b;->f:Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Leh/e;->a0()V

    iget-object v0, p0, Leh/e;->G:Lhc3/d;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    iget-object v0, p0, Leh/e;->J:Lne3/h0;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lne3/h0;->close()V

    iput-object v2, p0, Leh/e;->J:Lne3/h0;

    iput-boolean v1, p0, Leh/e;->M:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_3
    :goto_1
    :try_start_1
    iput-boolean v1, p0, Leh/e;->M:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final declared-synchronized flush()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Leh/e;->L:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-boolean v0, p0, Leh/e;->M:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Leh/e;->a0()V

    iget-object v0, p0, Leh/e;->J:Lne3/h0;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lne3/h0;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    :try_start_2
    const-string v0, "cache is closed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final declared-synchronized h(Ljava/lang/String;)Leh/a;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Leh/e;->M:Z

    if-nez v0, :cond_7

    invoke-static {p1}, Leh/e;->b0(Ljava/lang/String;)V

    invoke-virtual {p0}, Leh/e;->k()V

    iget-object v0, p0, Leh/e;->F:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leh/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, v0, Leh/b;->g:Leh/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_1

    monitor-exit p0

    return-object v1

    :cond_1
    if-eqz v0, :cond_2

    :try_start_1
    iget v2, v0, Leh/b;->h:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_2

    monitor-exit p0

    return-object v1

    :cond_2
    :try_start_2
    iget-boolean v2, p0, Leh/e;->N:Z

    if-nez v2, :cond_6

    iget-boolean v2, p0, Leh/e;->O:Z

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    iget-object v2, p0, Leh/e;->J:Lne3/h0;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v3, "DIRTY"

    invoke-virtual {v2, v3}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-virtual {v2, p1}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    const/16 v3, 0xa

    invoke-virtual {v2, v3}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-virtual {v2}, Lne3/h0;->flush()V

    iget-boolean v2, p0, Leh/e;->K:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v2, :cond_4

    monitor-exit p0

    return-object v1

    :cond_4
    if-nez v0, :cond_5

    :try_start_3
    new-instance v0, Leh/b;

    invoke-direct {v0, p0, p1}, Leh/b;-><init>(Leh/e;Ljava/lang/String;)V

    iget-object v1, p0, Leh/e;->F:Ljava/util/LinkedHashMap;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    new-instance p1, Leh/a;

    invoke-direct {p1, p0, v0}, Leh/a;-><init>(Leh/e;Leh/b;)V

    iput-object p1, v0, Leh/b;->g:Leh/a;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_6
    :goto_1
    :try_start_4
    invoke-virtual {p0}, Leh/e;->m()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-object v1

    :cond_7
    :try_start_5
    const-string p1, "cache is closed"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_2
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method public final declared-synchronized i(Ljava/lang/String;)Leh/c;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Leh/e;->M:Z

    if-nez v0, :cond_4

    invoke-static {p1}, Leh/e;->b0(Ljava/lang/String;)V

    invoke-virtual {p0}, Leh/e;->k()V

    iget-object v0, p0, Leh/e;->F:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leh/b;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Leh/b;->a()Leh/c;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iget v1, p0, Leh/e;->I:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Leh/e;->I:I

    iget-object v1, p0, Leh/e;->J:Lne3/h0;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v3, "READ"

    invoke-virtual {v1, v3}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    const/16 v3, 0x20

    invoke-virtual {v1, v3}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-virtual {v1, p1}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    const/16 p1, 0xa

    invoke-virtual {v1, p1}, Lne3/h0;->writeByte(I)Lne3/i;

    iget p1, p0, Leh/e;->I:I

    const/16 v1, 0x7d0

    if-lt p1, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    invoke-virtual {p0}, Leh/e;->m()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_1
    monitor-exit p0

    return-object v0

    :cond_3
    :goto_2
    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :cond_4
    :try_start_1
    const-string p1, "cache is closed"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_3
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized k()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Leh/e;->L:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Leh/e;->P:Leh/d;

    iget-object v1, p0, Leh/e;->z:Lne3/e0;

    invoke-virtual {v0, v1}, Lne3/p;->s(Lne3/e0;)V

    iget-object v0, p0, Leh/e;->P:Leh/d;

    iget-object v1, p0, Leh/e;->E:Lne3/e0;

    invoke-virtual {v0, v1}, Lne3/p;->x(Lne3/e0;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Leh/e;->P:Leh/d;

    iget-object v1, p0, Leh/e;->y:Lne3/e0;

    invoke-virtual {v0, v1}, Lne3/p;->x(Lne3/e0;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Leh/e;->P:Leh/d;

    iget-object v1, p0, Leh/e;->E:Lne3/e0;

    invoke-virtual {v0, v1}, Lne3/p;->s(Lne3/e0;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    iget-object v0, p0, Leh/e;->P:Leh/d;

    iget-object v1, p0, Leh/e;->E:Lne3/e0;

    iget-object v2, p0, Leh/e;->y:Lne3/e0;

    invoke-virtual {v0, v1, v2}, Lne3/q;->h(Lne3/e0;Lne3/e0;)V

    :cond_2
    :goto_0
    iget-object v0, p0, Leh/e;->P:Leh/d;

    iget-object v1, p0, Leh/e;->y:Lne3/e0;

    invoke-virtual {v0, v1}, Lne3/p;->x(Lne3/e0;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    :try_start_2
    invoke-virtual {p0}, Leh/e;->x()V

    invoke-virtual {p0}, Leh/e;->s()V

    iput-boolean v1, p0, Leh/e;->L:Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catch_0
    const/4 v0, 0x0

    :try_start_3
    invoke-virtual {p0}, Leh/e;->close()V

    iget-object v2, p0, Leh/e;->P:Leh/d;

    iget-object v3, p0, Leh/e;->w:Lne3/e0;

    invoke-static {v2, v3}, Lts/o;->q(Lne3/p;Lne3/e0;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    iput-boolean v0, p0, Leh/e;->M:Z

    goto :goto_1

    :catchall_1
    move-exception v1

    iput-boolean v0, p0, Leh/e;->M:Z

    throw v1

    :cond_3
    :goto_1
    invoke-virtual {p0}, Leh/e;->o0()V

    iput-boolean v1, p0, Leh/e;->L:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0
.end method

.method public final m()V
    .locals 4

    new-instance v0, La13/h;

    const/16 v1, 0xa

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x3

    iget-object v3, p0, Leh/e;->G:Lhc3/d;

    invoke-static {v3, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final declared-synchronized o0()V
    .locals 10

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Leh/e;->J:Lne3/h0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lne3/h0;->close()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_0
    :goto_0
    iget-object v0, p0, Leh/e;->P:Leh/d;

    iget-object v1, p0, Leh/e;->z:Lne3/e0;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Leh/d;->p0(Lne3/e0;Z)Lne3/n0;

    move-result-object v0

    invoke-static {v0}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    const-string v1, "libcore.io.DiskLruCache"

    invoke-virtual {v0, v1}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lne3/h0;->writeByte(I)Lne3/i;

    const-string v3, "1"

    invoke-virtual {v0, v3}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {v0, v1}, Lne3/h0;->writeByte(I)Lne3/i;

    const/4 v3, 0x1

    int-to-long v3, v3

    invoke-virtual {v0, v3, v4}, Lne3/h0;->h0(J)Lne3/i;

    invoke-virtual {v0, v1}, Lne3/h0;->writeByte(I)Lne3/i;

    const/4 v3, 0x2

    int-to-long v3, v3

    invoke-virtual {v0, v3, v4}, Lne3/h0;->h0(J)Lne3/i;

    invoke-virtual {v0, v1}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-virtual {v0, v1}, Lne3/h0;->writeByte(I)Lne3/i;

    iget-object v3, p0, Leh/e;->F:Ljava/util/LinkedHashMap;

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Leh/b;

    iget-object v5, v4, Leh/b;->g:Leh/a;

    const/16 v6, 0x20

    if-eqz v5, :cond_1

    const-string v5, "DIRTY"

    invoke-virtual {v0, v5}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {v0, v6}, Lne3/h0;->writeByte(I)Lne3/i;

    iget-object v4, v4, Leh/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {v0, v1}, Lne3/h0;->writeByte(I)Lne3/i;

    goto :goto_1

    :catchall_1
    move-exception v1

    goto :goto_3

    :cond_1
    const-string v5, "CLEAN"

    invoke-virtual {v0, v5}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {v0, v6}, Lne3/h0;->writeByte(I)Lne3/i;

    iget-object v5, v4, Leh/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v5}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    iget-object v4, v4, Leh/b;->b:[J

    array-length v5, v4

    move v7, v2

    :goto_2
    if-ge v7, v5, :cond_2

    aget-wide v8, v4, v7

    invoke-virtual {v0, v6}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-virtual {v0, v8, v9}, Lne3/h0;->h0(J)Lne3/i;

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v1}, Lne3/h0;->writeByte(I)Lne3/i;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :cond_3
    :try_start_2
    invoke-virtual {v0}, Lne3/h0;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const/4 v0, 0x0

    goto :goto_5

    :catchall_2
    move-exception v0

    goto :goto_5

    :goto_3
    :try_start_3
    invoke-virtual {v0}, Lne3/h0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v0

    :try_start_4
    invoke-static {v1, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_4
    move-object v0, v1

    :goto_5
    if-nez v0, :cond_5

    iget-object v0, p0, Leh/e;->P:Leh/d;

    iget-object v1, p0, Leh/e;->y:Lne3/e0;

    invoke-virtual {v0, v1}, Lne3/p;->x(Lne3/e0;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Leh/e;->P:Leh/d;

    iget-object v1, p0, Leh/e;->y:Lne3/e0;

    iget-object v3, p0, Leh/e;->E:Lne3/e0;

    invoke-virtual {v0, v1, v3}, Lne3/q;->h(Lne3/e0;Lne3/e0;)V

    iget-object v0, p0, Leh/e;->P:Leh/d;

    iget-object v1, p0, Leh/e;->z:Lne3/e0;

    iget-object v3, p0, Leh/e;->y:Lne3/e0;

    invoke-virtual {v0, v1, v3}, Lne3/q;->h(Lne3/e0;Lne3/e0;)V

    iget-object v0, p0, Leh/e;->P:Leh/d;

    iget-object v1, p0, Leh/e;->E:Lne3/e0;

    invoke-virtual {v0, v1}, Lne3/p;->s(Lne3/e0;)V

    goto :goto_6

    :cond_4
    iget-object v0, p0, Leh/e;->P:Leh/d;

    iget-object v1, p0, Leh/e;->z:Lne3/e0;

    iget-object v3, p0, Leh/e;->y:Lne3/e0;

    invoke-virtual {v0, v1, v3}, Lne3/q;->h(Lne3/e0;Lne3/e0;)V

    :goto_6
    iget-object v0, p0, Leh/e;->P:Leh/d;

    iget-object v1, p0, Leh/e;->y:Lne3/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "file"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lne3/q;->b(Lne3/e0;)Lne3/n0;

    move-result-object v0

    new-instance v1, Leh/f;

    new-instance v3, La6/i;

    const/16 v4, 0xa

    invoke-direct {v3, p0, v4}, La6/i;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v1, v0, v3}, Leh/f;-><init>(Lne3/n0;La6/i;)V

    invoke-static {v1}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object v0

    iput-object v0, p0, Leh/e;->J:Lne3/h0;

    iput v2, p0, Leh/e;->I:I

    iput-boolean v2, p0, Leh/e;->K:Z

    iput-boolean v2, p0, Leh/e;->O:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-void

    :cond_5
    :try_start_5
    throw v0

    :goto_7
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0
.end method

.method public final s()V
    .locals 9

    iget-object v0, p0, Leh/e;->F:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leh/b;

    iget-object v4, v3, Leh/b;->g:Leh/a;

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-nez v4, :cond_1

    :goto_1
    if-ge v6, v5, :cond_0

    iget-object v4, v3, Leh/b;->b:[J

    aget-wide v7, v4, v6

    add-long/2addr v1, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    iput-object v4, v3, Leh/b;->g:Leh/a;

    :goto_2
    if-ge v6, v5, :cond_2

    iget-object v4, v3, Leh/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lne3/e0;

    iget-object v7, p0, Leh/e;->P:Leh/d;

    invoke-virtual {v7, v4}, Lne3/p;->s(Lne3/e0;)V

    iget-object v4, v3, Leh/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lne3/e0;

    invoke-virtual {v7, v4}, Lne3/p;->s(Lne3/e0;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    iput-wide v1, p0, Leh/e;->H:J

    return-void
.end method

.method public final x()V
    .locals 13

    const-string v0, ", "

    const-string v1, "unexpected journal header: ["

    iget-object v2, p0, Leh/e;->P:Leh/d;

    iget-object v3, p0, Leh/e;->y:Lne3/e0;

    invoke-virtual {v2, v3}, Lne3/q;->x0(Lne3/e0;)Lne3/p0;

    move-result-object v4

    invoke-static {v4}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v4

    const-wide v5, 0x7fffffffffffffffL

    :try_start_0
    invoke-virtual {v4, v5, v6}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v5, v6}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v5, v6}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v5, v6}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v5, v6}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v11

    const-string v12, "libcore.io.DiskLruCache"

    invoke-virtual {v12, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    const-string v12, "1"

    invoke-virtual {v12, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    const/4 v12, 0x1

    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    const/4 v12, 0x2

    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gtz v12, :cond_1

    const/4 v0, 0x0

    :goto_0
    :try_start_1
    invoke-virtual {v4, v5, v6}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Leh/e;->J(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    :try_start_2
    iget-object v1, p0, Leh/e;->F:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Leh/e;->I:I

    invoke-virtual {v4}, Lne3/j0;->o()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Leh/e;->o0()V

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "file"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lne3/q;->b(Lne3/e0;)Lne3/n0;

    move-result-object v0

    new-instance v1, Leh/f;

    new-instance v2, La6/i;

    const/16 v3, 0xa

    invoke-direct {v2, p0, v3}, La6/i;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v1, v0, v2}, Leh/f;-><init>(Lne3/n0;La6/i;)V

    invoke-static {v1}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object v0

    iput-object v0, p0, Leh/e;->J:Lne3/h0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    :try_start_3
    invoke-virtual {v4}, Lne3/j0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/4 v0, 0x0

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_3

    :cond_1
    :try_start_4
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_2
    :try_start_5
    invoke-virtual {v4}, Lne3/j0;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v1

    invoke-static {v0, v1}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_3
    if-nez v0, :cond_2

    return-void

    :cond_2
    throw v0
.end method
