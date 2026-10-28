.class public final Lxd3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# static fields
.field public static final T:Lyb3/p;

.field public static final U:Ljava/lang/String;

.field public static final V:Ljava/lang/String;

.field public static final W:Ljava/lang/String;

.field public static final X:Ljava/lang/String;


# instance fields
.field public final E:Lne3/e0;

.field public final F:Lne3/e0;

.field public G:J

.field public H:Lne3/h0;

.field public final I:Ljava/util/LinkedHashMap;

.field public J:I

.field public K:Z

.field public L:Z

.field public M:Z

.field public N:Z

.field public O:Z

.field public P:Z

.field public Q:J

.field public final R:Lyd3/c;

.field public final S:Lle3/f;

.field public final w:Lne3/e0;

.field public final x:Lxd3/e;

.field public final y:J

.field public final z:Lne3/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyb3/p;

    const-string v1, "[a-z0-9_-]{1,120}"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lxd3/f;->T:Lyb3/p;

    const-string v0, "CLEAN"

    sput-object v0, Lxd3/f;->U:Ljava/lang/String;

    const-string v0, "DIRTY"

    sput-object v0, Lxd3/f;->V:Ljava/lang/String;

    const-string v0, "REMOVE"

    sput-object v0, Lxd3/f;->W:Ljava/lang/String;

    const-string v0, "READ"

    sput-object v0, Lxd3/f;->X:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lne3/p;Lne3/e0;Lyd3/d;)V
    .locals 3

    const-string v0, "fileSystem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "taskRunner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lxd3/f;->w:Lne3/e0;

    new-instance v0, Lxd3/e;

    invoke-direct {v0, p1}, Lne3/q;-><init>(Lne3/p;)V

    iput-object v0, p0, Lxd3/f;->x:Lxd3/e;

    const-wide/32 v0, 0xa00000

    iput-wide v0, p0, Lxd3/f;->y:J

    new-instance p1, Ljava/util/LinkedHashMap;

    const/high16 v0, 0x3f400000    # 0.75f

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p1, v2, v0, v1}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object p1, p0, Lxd3/f;->I:Ljava/util/LinkedHashMap;

    invoke-virtual {p3}, Lyd3/d;->d()Lyd3/c;

    move-result-object p1

    iput-object p1, p0, Lxd3/f;->R:Lyd3/c;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object p3, Lwd3/h;->b:Ljava/lang/String;

    const-string v0, " Cache"

    invoke-static {p3, v0, p1}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    new-instance p3, Lle3/f;

    invoke-direct {p3, p0, p1}, Lle3/f;-><init>(Lxd3/f;Ljava/lang/String;)V

    iput-object p3, p0, Lxd3/f;->S:Lle3/f;

    const-string p1, "journal"

    invoke-virtual {p2, p1}, Lne3/e0;->e(Ljava/lang/String;)Lne3/e0;

    move-result-object p1

    iput-object p1, p0, Lxd3/f;->z:Lne3/e0;

    const-string p1, "journal.tmp"

    invoke-virtual {p2, p1}, Lne3/e0;->e(Ljava/lang/String;)Lne3/e0;

    move-result-object p1

    iput-object p1, p0, Lxd3/f;->E:Lne3/e0;

    const-string p1, "journal.bkp"

    invoke-virtual {p2, p1}, Lne3/e0;->e(Ljava/lang/String;)Lne3/e0;

    move-result-object p1

    iput-object p1, p0, Lxd3/f;->F:Lne3/e0;

    return-void
.end method

.method public static p0(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lxd3/f;->T:Lyb3/p;

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
.method public final J()V
    .locals 13

    const-string v0, ", "

    const-string v1, "unexpected journal header: ["

    iget-object v2, p0, Lxd3/f;->x:Lxd3/e;

    iget-object v3, p0, Lxd3/f;->z:Lne3/e0;

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

    if-eqz v12, :cond_2

    const-string v12, "1"

    invoke-virtual {v12, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2

    const v12, 0x31191

    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/4 v9, 0x2

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gtz v9, :cond_2

    const/4 v0, 0x0

    :goto_0
    :try_start_1
    invoke-virtual {v4, v5, v6}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lxd3/f;->T(Ljava/lang/String;)V
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
    iget-object v1, p0, Lxd3/f;->I:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lxd3/f;->J:I

    invoke-virtual {v4}, Lne3/j0;->o()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lxd3/f;->a0()V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lxd3/f;->H:Lne3/h0;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lwd3/f;->b(Ljava/io/Closeable;)V

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "file"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lne3/q;->b(Lne3/e0;)Lne3/n0;

    move-result-object v0

    new-instance v1, Lxd3/g;

    new-instance v2, Lx30/h1;

    const/4 v3, 0x7

    invoke-direct {v2, p0, v3}, Lx30/h1;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v1, v0, v2}, Lxd3/g;-><init>(Lne3/n0;Lkotlin/jvm/functions/Function1;)V

    invoke-static {v1}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object v0

    iput-object v0, p0, Lxd3/f;->H:Lne3/h0;
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

    :cond_2
    :try_start_4
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
    if-nez v0, :cond_3

    return-void

    :cond_3
    throw v0
.end method

.method public final T(Ljava/lang/String;)V
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

    move-result v7

    iget-object v8, p0, Lxd3/f;->I:Ljava/util/LinkedHashMap;

    const-string v9, "substring(...)"

    if-ne v7, v5, :cond_0

    invoke-virtual {p1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v10, Lxd3/f;->W:Ljava/lang/String;

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v11

    if-ne v3, v11, :cond_1

    invoke-static {p1, v10, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-virtual {v8, v6}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-virtual {p1, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v8, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lxd3/c;

    if-nez v10, :cond_2

    new-instance v10, Lxd3/c;

    invoke-direct {v10, p0, v6}, Lxd3/c;-><init>(Lxd3/f;Ljava/lang/String;)V

    invoke-interface {v8, v6, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-eq v7, v5, :cond_4

    sget-object v6, Lxd3/f;->U:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    if-ne v3, v8, :cond_4

    invoke-static {p1, v6, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_4

    const/4 v3, 0x1

    add-int/2addr v7, v3

    invoke-virtual {p1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v5, v3, [C

    aput-char v0, v5, v1

    invoke-static {p1, v5, v1, v2}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object p1

    iput-boolean v3, v10, Lxd3/c;->e:Z

    const/4 v0, 0x0

    iput-object v0, v10, Lxd3/c;->g:Lb9/b;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iget-object v2, v10, Lxd3/c;->j:Lxd3/f;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x2

    if-ne v0, v2, :cond_3

    :try_start_0
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    :goto_0
    if-ge v1, v0, :cond_6

    iget-object v2, v10, Lxd3/c;->b:[J

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
    if-ne v7, v5, :cond_5

    sget-object v0, Lxd3/f;->V:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-ne v3, v2, :cond_5

    invoke-static {p1, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance p1, Lb9/b;

    invoke-direct {p1, p0, v10}, Lb9/b;-><init>(Lxd3/f;Lxd3/c;)V

    iput-object p1, v10, Lxd3/c;->g:Lb9/b;

    return-void

    :cond_5
    if-ne v7, v5, :cond_7

    sget-object v0, Lxd3/f;->X:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-ne v3, v2, :cond_7

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

.method public final declared-synchronized a0()V
    .locals 10

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lxd3/f;->H:Lne3/h0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lne3/h0;->close()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_0
    :goto_0
    iget-object v0, p0, Lxd3/f;->x:Lxd3/e;

    iget-object v1, p0, Lxd3/f;->E:Lne3/e0;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lxd3/e;->p0(Lne3/e0;Z)Lne3/n0;

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

    const v3, 0x31191

    int-to-long v3, v3

    invoke-virtual {v0, v3, v4}, Lne3/h0;->h0(J)Lne3/i;

    invoke-virtual {v0, v1}, Lne3/h0;->writeByte(I)Lne3/i;

    const/4 v3, 0x2

    int-to-long v3, v3

    invoke-virtual {v0, v3, v4}, Lne3/h0;->h0(J)Lne3/i;

    invoke-virtual {v0, v1}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-virtual {v0, v1}, Lne3/h0;->writeByte(I)Lne3/i;

    iget-object v3, p0, Lxd3/f;->I:Ljava/util/LinkedHashMap;

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

    const-string v5, "next(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lxd3/c;

    iget-object v5, v4, Lxd3/c;->g:Lb9/b;

    const/16 v6, 0x20

    if-eqz v5, :cond_1

    sget-object v5, Lxd3/f;->V:Ljava/lang/String;

    invoke-virtual {v0, v5}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {v0, v6}, Lne3/h0;->writeByte(I)Lne3/i;

    iget-object v4, v4, Lxd3/c;->a:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {v0, v1}, Lne3/h0;->writeByte(I)Lne3/i;

    goto :goto_1

    :catchall_1
    move-exception v1

    goto :goto_3

    :cond_1
    sget-object v5, Lxd3/f;->U:Ljava/lang/String;

    invoke-virtual {v0, v5}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {v0, v6}, Lne3/h0;->writeByte(I)Lne3/i;

    iget-object v5, v4, Lxd3/c;->a:Ljava/lang/String;

    invoke-virtual {v0, v5}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    iget-object v4, v4, Lxd3/c;->b:[J

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
    if-nez v0, :cond_6

    iget-object v0, p0, Lxd3/f;->x:Lxd3/e;

    iget-object v1, p0, Lxd3/f;->z:Lne3/e0;

    invoke-virtual {v0, v1}, Lne3/p;->x(Lne3/e0;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lxd3/f;->x:Lxd3/e;

    iget-object v1, p0, Lxd3/f;->z:Lne3/e0;

    iget-object v3, p0, Lxd3/f;->F:Lne3/e0;

    invoke-virtual {v0, v1, v3}, Lne3/q;->h(Lne3/e0;Lne3/e0;)V

    iget-object v0, p0, Lxd3/f;->x:Lxd3/e;

    iget-object v1, p0, Lxd3/f;->E:Lne3/e0;

    iget-object v3, p0, Lxd3/f;->z:Lne3/e0;

    invoke-virtual {v0, v1, v3}, Lne3/q;->h(Lne3/e0;Lne3/e0;)V

    iget-object v0, p0, Lxd3/f;->x:Lxd3/e;

    iget-object v1, p0, Lxd3/f;->F:Lne3/e0;

    invoke-static {v0, v1}, Lwd3/f;->d(Lxd3/e;Lne3/e0;)V

    goto :goto_6

    :cond_4
    iget-object v0, p0, Lxd3/f;->x:Lxd3/e;

    iget-object v1, p0, Lxd3/f;->E:Lne3/e0;

    iget-object v3, p0, Lxd3/f;->z:Lne3/e0;

    invoke-virtual {v0, v1, v3}, Lne3/q;->h(Lne3/e0;Lne3/e0;)V

    :goto_6
    iget-object v0, p0, Lxd3/f;->H:Lne3/h0;

    if-eqz v0, :cond_5

    invoke-static {v0}, Lwd3/f;->b(Ljava/io/Closeable;)V

    :cond_5
    iget-object v0, p0, Lxd3/f;->x:Lxd3/e;

    iget-object v1, p0, Lxd3/f;->z:Lne3/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "file"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lne3/q;->b(Lne3/e0;)Lne3/n0;

    move-result-object v0

    new-instance v1, Lxd3/g;

    new-instance v3, Lx30/h1;

    const/4 v4, 0x7

    invoke-direct {v3, p0, v4}, Lx30/h1;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v1, v0, v3}, Lxd3/g;-><init>(Lne3/n0;Lkotlin/jvm/functions/Function1;)V

    invoke-static {v1}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object v0

    iput-object v0, p0, Lxd3/f;->H:Lne3/h0;

    iput-boolean v2, p0, Lxd3/f;->K:Z

    iput-boolean v2, p0, Lxd3/f;->P:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-void

    :cond_6
    :try_start_5
    throw v0

    :goto_7
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0
.end method

.method public final declared-synchronized b()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lxd3/f;->N:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    const-string v0, "cache is closed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final b0(Lxd3/c;)V
    .locals 10

    iget-object v0, p1, Lxd3/c;->a:Ljava/lang/String;

    iget-boolean v1, p0, Lxd3/f;->L:Z

    const/16 v2, 0xa

    const/16 v3, 0x20

    const/4 v4, 0x1

    if-nez v1, :cond_2

    iget v1, p1, Lxd3/c;->h:I

    if-lez v1, :cond_0

    iget-object v1, p0, Lxd3/f;->H:Lne3/h0;

    if-eqz v1, :cond_0

    sget-object v5, Lxd3/f;->V:Ljava/lang/String;

    invoke-virtual {v1, v5}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {v1, v3}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-virtual {v1, v0}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {v1, v2}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-virtual {v1}, Lne3/h0;->flush()V

    :cond_0
    iget v1, p1, Lxd3/c;->h:I

    if-gtz v1, :cond_1

    iget-object v1, p1, Lxd3/c;->g:Lb9/b;

    if-eqz v1, :cond_2

    :cond_1
    iput-boolean v4, p1, Lxd3/c;->f:Z

    return-void

    :cond_2
    iget-object v1, p1, Lxd3/c;->g:Lb9/b;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lb9/b;->i()V

    :cond_3
    const/4 v1, 0x0

    :goto_0
    const/4 v5, 0x2

    if-ge v1, v5, :cond_4

    iget-object v5, p1, Lxd3/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lne3/e0;

    iget-object v6, p0, Lxd3/f;->x:Lxd3/e;

    invoke-static {v6, v5}, Lwd3/f;->d(Lxd3/e;Lne3/e0;)V

    iget-wide v5, p0, Lxd3/f;->G:J

    iget-object v7, p1, Lxd3/c;->b:[J

    aget-wide v8, v7, v1

    sub-long/2addr v5, v8

    iput-wide v5, p0, Lxd3/f;->G:J

    const-wide/16 v5, 0x0

    aput-wide v5, v7, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    iget p1, p0, Lxd3/f;->J:I

    add-int/2addr p1, v4

    iput p1, p0, Lxd3/f;->J:I

    iget-object p1, p0, Lxd3/f;->H:Lne3/h0;

    if-eqz p1, :cond_5

    sget-object v1, Lxd3/f;->W:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v3}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-virtual {p1, v0}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v2}, Lne3/h0;->writeByte(I)Lne3/i;

    :cond_5
    iget-object p1, p0, Lxd3/f;->I:Ljava/util/LinkedHashMap;

    invoke-virtual {p1, v0}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lxd3/f;->s()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lxd3/f;->R:Lyd3/c;

    iget-object v0, p0, Lxd3/f;->S:Lle3/f;

    invoke-static {p1, v0}, Lyd3/c;->e(Lyd3/c;Lyd3/a;)V

    :cond_6
    return-void
.end method

.method public final declared-synchronized close()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lxd3/f;->M:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lxd3/f;->N:Z

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lxd3/f;->I:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v2, "<get-values>(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    new-array v3, v2, [Lxd3/c;

    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxd3/c;

    array-length v3, v0

    :goto_0
    if-ge v2, v3, :cond_2

    aget-object v4, v0, v2

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v4, v4, Lxd3/c;->g:Lb9/b;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lb9/b;->i()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lxd3/f;->o0()V

    iget-object v0, p0, Lxd3/f;->H:Lne3/h0;

    if-eqz v0, :cond_3

    invoke-static {v0}, Lwd3/f;->b(Ljava/io/Closeable;)V

    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lxd3/f;->H:Lne3/h0;

    iput-boolean v1, p0, Lxd3/f;->N:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_4
    :goto_2
    :try_start_1
    iput-boolean v1, p0, Lxd3/f;->N:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final declared-synchronized flush()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lxd3/f;->M:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lxd3/f;->b()V

    invoke-virtual {p0}, Lxd3/f;->o0()V

    iget-object v0, p0, Lxd3/f;->H:Lne3/h0;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lne3/h0;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final declared-synchronized h(Lb9/b;Z)V
    .locals 9

    monitor-enter p0

    :try_start_0
    iget-object v0, p1, Lb9/b;->y:Ljava/lang/Object;

    check-cast v0, Lxd3/c;

    iget-object v1, v0, Lxd3/c;->g:Lb9/b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz p2, :cond_2

    iget-boolean v3, v0, Lxd3/c;->e:Z

    if-nez v3, :cond_2

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    iget-object v4, p1, Lb9/b;->z:Ljava/lang/Object;

    check-cast v4, [Z

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    aget-boolean v4, v4, v3

    if-eqz v4, :cond_1

    iget-object v4, p0, Lxd3/f;->x:Lxd3/e;

    iget-object v5, v0, Lxd3/c;->d:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lne3/e0;

    invoke-virtual {v4, v5}, Lne3/p;->x(Lne3/e0;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {p1}, Lb9/b;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :try_start_1
    invoke-virtual {p1}, Lb9/b;->a()V

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Newly created entry didn\'t create value for index "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    move p1, v2

    :goto_1
    if-ge p1, v1, :cond_6

    iget-object v3, v0, Lxd3/c;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lne3/e0;

    if-eqz p2, :cond_4

    iget-boolean v4, v0, Lxd3/c;->f:Z

    if-nez v4, :cond_4

    iget-object v4, p0, Lxd3/f;->x:Lxd3/e;

    invoke-virtual {v4, v3}, Lne3/p;->x(Lne3/e0;)Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v4, v0, Lxd3/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lne3/e0;

    iget-object v5, p0, Lxd3/f;->x:Lxd3/e;

    invoke-virtual {v5, v3, v4}, Lne3/q;->h(Lne3/e0;Lne3/e0;)V

    iget-object v3, v0, Lxd3/c;->b:[J

    aget-wide v5, v3, p1

    iget-object v3, p0, Lxd3/f;->x:Lxd3/e;

    invoke-virtual {v3, v4}, Lne3/p;->T(Lne3/e0;)Ln4/f;

    move-result-object v3

    iget-object v3, v3, Ln4/f;->e:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_2

    :cond_3
    const-wide/16 v3, 0x0

    :goto_2
    iget-object v7, v0, Lxd3/c;->b:[J

    aput-wide v3, v7, p1

    iget-wide v7, p0, Lxd3/f;->G:J

    sub-long/2addr v7, v5

    add-long/2addr v7, v3

    iput-wide v7, p0, Lxd3/f;->G:J

    goto :goto_3

    :cond_4
    iget-object v4, p0, Lxd3/f;->x:Lxd3/e;

    invoke-static {v4, v3}, Lwd3/f;->d(Lxd3/e;Lne3/e0;)V

    :cond_5
    :goto_3
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_6
    const/4 p1, 0x0

    iput-object p1, v0, Lxd3/c;->g:Lb9/b;

    iget-boolean p1, v0, Lxd3/c;->f:Z

    if-eqz p1, :cond_7

    invoke-virtual {p0, v0}, Lxd3/f;->b0(Lxd3/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_7
    :try_start_2
    iget p1, p0, Lxd3/f;->J:I

    const/4 v1, 0x1

    add-int/2addr p1, v1

    iput p1, p0, Lxd3/f;->J:I

    iget-object p1, p0, Lxd3/f;->H:Lne3/h0;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-boolean v3, v0, Lxd3/c;->e:Z

    const/16 v4, 0xa

    const/16 v5, 0x20

    if-nez v3, :cond_9

    if-eqz p2, :cond_8

    goto :goto_4

    :cond_8
    iget-object p2, p0, Lxd3/f;->I:Ljava/util/LinkedHashMap;

    iget-object v1, v0, Lxd3/c;->a:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p2, Lxd3/f;->W:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v5}, Lne3/h0;->writeByte(I)Lne3/i;

    iget-object p2, v0, Lxd3/c;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v4}, Lne3/h0;->writeByte(I)Lne3/i;

    goto :goto_6

    :cond_9
    :goto_4
    iput-boolean v1, v0, Lxd3/c;->e:Z

    sget-object v1, Lxd3/f;->U:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v5}, Lne3/h0;->writeByte(I)Lne3/i;

    iget-object v1, v0, Lxd3/c;->a:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    iget-object v1, v0, Lxd3/c;->b:[J

    array-length v3, v1

    :goto_5
    if-ge v2, v3, :cond_a

    aget-wide v6, v1, v2

    invoke-virtual {p1, v5}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-virtual {p1, v6, v7}, Lne3/h0;->h0(J)Lne3/i;

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_a
    invoke-virtual {p1, v4}, Lne3/h0;->writeByte(I)Lne3/i;

    if-eqz p2, :cond_b

    iget-wide v1, p0, Lxd3/f;->Q:J

    const-wide/16 v3, 0x1

    add-long/2addr v3, v1

    iput-wide v3, p0, Lxd3/f;->Q:J

    iput-wide v1, v0, Lxd3/c;->i:J

    :cond_b
    :goto_6
    invoke-virtual {p1}, Lne3/h0;->flush()V

    iget-wide p1, p0, Lxd3/f;->G:J

    iget-wide v0, p0, Lxd3/f;->y:J

    cmp-long p1, p1, v0

    if-gtz p1, :cond_c

    invoke-virtual {p0}, Lxd3/f;->s()Z

    move-result p1

    if-eqz p1, :cond_d

    :cond_c
    iget-object p1, p0, Lxd3/f;->R:Lyd3/c;

    iget-object p2, p0, Lxd3/f;->S:Lle3/f;

    invoke-static {p1, p2}, Lyd3/c;->e(Lyd3/c;Lyd3/a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_d
    monitor-exit p0

    return-void

    :cond_e
    :try_start_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_7
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final declared-synchronized i(JLjava/lang/String;)Lb9/b;
    .locals 5

    monitor-enter p0

    :try_start_0
    const-string v0, "key"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lxd3/f;->m()V

    invoke-virtual {p0}, Lxd3/f;->b()V

    invoke-static {p3}, Lxd3/f;->p0(Ljava/lang/String;)V

    iget-object v0, p0, Lxd3/f;->I:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxd3/c;

    const-wide/16 v1, -0x1

    cmp-long v1, p1, v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    iget-wide v3, v0, Lxd3/c;->i:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long p1, v3, p1

    if-eqz p1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    :goto_0
    monitor-exit p0

    return-object v2

    :cond_1
    if-eqz v0, :cond_2

    :try_start_1
    iget-object p1, v0, Lxd3/c;->g:Lb9/b;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_2
    move-object p1, v2

    :goto_1
    if-eqz p1, :cond_3

    monitor-exit p0

    return-object v2

    :cond_3
    if-eqz v0, :cond_4

    :try_start_2
    iget p1, v0, Lxd3/c;->h:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_4

    monitor-exit p0

    return-object v2

    :cond_4
    :try_start_3
    iget-boolean p1, p0, Lxd3/f;->O:Z

    if-nez p1, :cond_8

    iget-boolean p1, p0, Lxd3/f;->P:Z

    if-eqz p1, :cond_5

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lxd3/f;->H:Lne3/h0;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object p2, Lxd3/f;->V:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    const/16 p2, 0x20

    invoke-virtual {p1, p2}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-interface {p1, p3}, Lne3/i;->S(Ljava/lang/String;)Lne3/i;

    const/16 p2, 0xa

    invoke-interface {p1, p2}, Lne3/i;->writeByte(I)Lne3/i;

    invoke-virtual {p1}, Lne3/h0;->flush()V

    iget-boolean p1, p0, Lxd3/f;->K:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz p1, :cond_6

    monitor-exit p0

    return-object v2

    :cond_6
    if-nez v0, :cond_7

    :try_start_4
    new-instance v0, Lxd3/c;

    invoke-direct {v0, p0, p3}, Lxd3/c;-><init>(Lxd3/f;Ljava/lang/String;)V

    iget-object p1, p0, Lxd3/f;->I:Ljava/util/LinkedHashMap;

    invoke-interface {p1, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    new-instance p1, Lb9/b;

    invoke-direct {p1, p0, v0}, Lb9/b;-><init>(Lxd3/f;Lxd3/c;)V

    iput-object p1, v0, Lxd3/c;->g:Lb9/b;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_8
    :goto_2
    :try_start_5
    iget-object p1, p0, Lxd3/f;->R:Lyd3/c;

    iget-object p2, p0, Lxd3/f;->S:Lle3/f;

    invoke-static {p1, p2}, Lyd3/c;->e(Lyd3/c;Lyd3/a;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p0

    return-object v2

    :goto_3
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1
.end method

.method public final declared-synchronized k(Ljava/lang/String;)Lxd3/d;
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lxd3/f;->m()V

    invoke-virtual {p0}, Lxd3/f;->b()V

    invoke-static {p1}, Lxd3/f;->p0(Ljava/lang/String;)V

    iget-object v0, p0, Lxd3/f;->I:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxd3/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    monitor-exit p0

    return-object v1

    :cond_0
    :try_start_1
    invoke-virtual {v0}, Lxd3/c;->a()Lxd3/d;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    monitor-exit p0

    return-object v1

    :cond_1
    :try_start_2
    iget v1, p0, Lxd3/f;->J:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lxd3/f;->J:I

    iget-object v1, p0, Lxd3/f;->H:Lne3/h0;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v2, Lxd3/f;->X:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-interface {v1, p1}, Lne3/i;->S(Ljava/lang/String;)Lne3/i;

    const/16 p1, 0xa

    invoke-interface {v1, p1}, Lne3/i;->writeByte(I)Lne3/i;

    invoke-virtual {p0}, Lxd3/f;->s()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lxd3/f;->R:Lyd3/c;

    iget-object v1, p0, Lxd3/f;->S:Lle3/f;

    invoke-static {p1, v1}, Lyd3/c;->e(Lyd3/c;Lyd3/a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    :goto_0
    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final declared-synchronized m()V
    .locals 7

    const-string v0, "DiskLruCache "

    monitor-enter p0

    :try_start_0
    sget-object v1, Lwd3/h;->a:Ljava/util/TimeZone;

    iget-boolean v1, p0, Lxd3/f;->M:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v1, p0, Lxd3/f;->x:Lxd3/e;

    iget-object v2, p0, Lxd3/f;->F:Lne3/e0;

    invoke-virtual {v1, v2}, Lne3/p;->x(Lne3/e0;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lxd3/f;->x:Lxd3/e;

    iget-object v2, p0, Lxd3/f;->z:Lne3/e0;

    invoke-virtual {v1, v2}, Lne3/p;->x(Lne3/e0;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lxd3/f;->x:Lxd3/e;

    iget-object v2, p0, Lxd3/f;->F:Lne3/e0;

    invoke-virtual {v1, v2}, Lne3/p;->s(Lne3/e0;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_1
    iget-object v1, p0, Lxd3/f;->x:Lxd3/e;

    iget-object v2, p0, Lxd3/f;->F:Lne3/e0;

    iget-object v3, p0, Lxd3/f;->z:Lne3/e0;

    invoke-virtual {v1, v2, v3}, Lne3/q;->h(Lne3/e0;Lne3/e0;)V

    :cond_2
    :goto_0
    iget-object v1, p0, Lxd3/f;->x:Lxd3/e;

    iget-object v2, p0, Lxd3/f;->F:Lne3/e0;

    sget-object v3, Lwd3/f;->a:[B

    const-string v3, "<this>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "file"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lxd3/e;->p0(Lne3/e0;Z)Lne3/n0;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v5, 0x1

    :try_start_2
    invoke-virtual {v1, v2}, Lne3/q;->m(Lne3/e0;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v4, :cond_3

    :try_start_3
    invoke-interface {v4}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    :cond_3
    move v1, v5

    goto :goto_4

    :catchall_2
    move-exception v6

    if-eqz v4, :cond_5

    :try_start_4
    invoke-interface {v4}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v4

    :try_start_5
    invoke-static {v6, v4}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_3

    :catch_0
    if-eqz v4, :cond_4

    :try_start_6
    invoke-interface {v4}, Ljava/io/Closeable;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_2

    :catchall_4
    move-exception v4

    :goto_1
    move-object v6, v4

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v4, 0x0

    goto :goto_1

    :cond_5
    :goto_3
    if-nez v6, :cond_7

    :try_start_7
    invoke-virtual {v1, v2}, Lne3/q;->m(Lne3/e0;)V

    move v1, v3

    :goto_4
    iput-boolean v1, p0, Lxd3/f;->L:Z

    iget-object v1, p0, Lxd3/f;->x:Lxd3/e;

    iget-object v2, p0, Lxd3/f;->z:Lne3/e0;

    invoke-virtual {v1, v2}, Lne3/p;->x(Lne3/e0;)Z

    move-result v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-eqz v1, :cond_6

    :try_start_8
    invoke-virtual {p0}, Lxd3/f;->J()V

    invoke-virtual {p0}, Lxd3/f;->x()V

    iput-boolean v5, p0, Lxd3/f;->M:Z
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    monitor-exit p0

    return-void

    :catch_1
    move-exception v1

    :try_start_9
    sget-object v2, Lfe3/e;->a:Lfe3/e;

    sget-object v2, Lfe3/e;->a:Lfe3/e;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lxd3/f;->w:Lne3/e0;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " is corrupt: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", removing"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x5

    invoke-virtual {v2, v0, v4, v1}, Lfe3/e;->j(Ljava/lang/String;ILjava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :try_start_a
    invoke-virtual {p0}, Lxd3/f;->close()V

    iget-object v0, p0, Lxd3/f;->x:Lxd3/e;

    iget-object v1, p0, Lxd3/f;->w:Lne3/e0;

    invoke-static {v0, v1}, Lwd3/f;->c(Lne3/p;Lne3/e0;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    :try_start_b
    iput-boolean v3, p0, Lxd3/f;->N:Z

    goto :goto_5

    :catchall_5
    move-exception v0

    iput-boolean v3, p0, Lxd3/f;->N:Z

    throw v0

    :cond_6
    :goto_5
    invoke-virtual {p0}, Lxd3/f;->a0()V

    iput-boolean v5, p0, Lxd3/f;->M:Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    monitor-exit p0

    return-void

    :cond_7
    :try_start_c
    throw v6

    :goto_6
    monitor-exit p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    throw v0
.end method

.method public final o0()V
    .locals 4

    :goto_0
    iget-wide v0, p0, Lxd3/f;->G:J

    iget-wide v2, p0, Lxd3/f;->y:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    iget-object v0, p0, Lxd3/f;->I:Ljava/util/LinkedHashMap;

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

    const-string v2, "next(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lxd3/c;

    iget-boolean v2, v1, Lxd3/c;->f:Z

    if-nez v2, :cond_0

    invoke-virtual {p0, v1}, Lxd3/f;->b0(Lxd3/c;)V

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lxd3/f;->O:Z

    return-void
.end method

.method public final s()Z
    .locals 2

    iget v0, p0, Lxd3/f;->J:I

    const/16 v1, 0x7d0

    if-lt v0, v1, :cond_0

    iget-object v1, p0, Lxd3/f;->I:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final x()V
    .locals 10

    iget-object v0, p0, Lxd3/f;->E:Lne3/e0;

    iget-object v1, p0, Lxd3/f;->x:Lxd3/e;

    invoke-static {v1, v0}, Lwd3/f;->d(Lxd3/e;Lne3/e0;)V

    iget-object v0, p0, Lxd3/f;->I:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "next(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lxd3/c;

    iget-object v3, v2, Lxd3/c;->g:Lb9/b;

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-nez v3, :cond_1

    :goto_1
    if-ge v5, v4, :cond_0

    iget-wide v6, p0, Lxd3/f;->G:J

    iget-object v3, v2, Lxd3/c;->b:[J

    aget-wide v8, v3, v5

    add-long/2addr v6, v8

    iput-wide v6, p0, Lxd3/f;->G:J

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    iput-object v3, v2, Lxd3/c;->g:Lb9/b;

    :goto_2
    if-ge v5, v4, :cond_2

    iget-object v3, v2, Lxd3/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lne3/e0;

    invoke-static {v1, v3}, Lwd3/f;->d(Lxd3/e;Lne3/e0;)V

    iget-object v3, v2, Lxd3/c;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lne3/e0;

    invoke-static {v1, v3}, Lwd3/f;->d(Lxd3/e;Lne3/e0;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    return-void
.end method
