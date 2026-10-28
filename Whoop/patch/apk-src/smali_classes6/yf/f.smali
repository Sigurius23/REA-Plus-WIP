.class public final Lyf/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyf/t;


# instance fields
.field public final w:Lyf/t;

.field public final x:Lne3/f;

.field public final y:Llf/a;


# direct methods
.method public constructor <init>(Llf/a;)V
    .locals 2

    new-instance v0, Lne3/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lzf/e;

    invoke-direct {v1, v0}, Lzf/e;-><init>(Lne3/n0;)V

    const-string v0, "hash"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sink"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lyf/f;->w:Lyf/t;

    new-instance v0, Lne3/f;

    invoke-direct {v0}, Lne3/f;-><init>()V

    iput-object v0, p0, Lyf/f;->x:Lne3/f;

    iput-object p1, p0, Lyf/f;->y:Llf/a;

    return-void
.end method


# virtual methods
.method public final Y(Lyf/k;J)V
    .locals 9

    iget-object v0, p1, Lyf/k;->w:Lne3/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "unsafeCursor"

    iget-object v2, p0, Lyf/f;->x:Lne3/f;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Loe3/a;->a:[B

    sget-object v1, Lne3/b;->a:Lne3/f;

    if-ne v2, v1, :cond_0

    new-instance v1, Lne3/f;

    invoke-direct {v1}, Lne3/f;-><init>()V

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    iget-object v3, v1, Lne3/f;->w:Lne3/h;

    if-nez v3, :cond_3

    iput-object v0, v1, Lne3/f;->w:Lne3/h;

    const/4 v0, 0x0

    iput-boolean v0, v1, Lne3/f;->x:Z

    const-wide/16 v0, 0x0

    :try_start_0
    invoke-virtual {v2, v0, v1}, Lne3/f;->i(J)I

    move-result v3

    move-wide v4, p2

    :goto_1
    if-lez v3, :cond_2

    cmp-long v6, v4, v0

    if-lez v6, :cond_2

    long-to-int v6, v4

    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v3

    iget-object v6, v2, Lne3/f;->E:[B

    if-eqz v6, :cond_1

    iget v7, v2, Lne3/f;->F:I

    iget-object v8, p0, Lyf/f;->y:Llf/a;

    invoke-interface {v8, v6, v7, v3}, Llf/a;->update([BII)V

    int-to-long v6, v3

    sub-long/2addr v4, v6

    invoke-virtual {v2}, Lne3/f;->b()I

    move-result v3

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    const-string p1, "Required value was null."

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    invoke-virtual {v2}, Lne3/f;->close()V

    iget-object v0, p0, Lyf/f;->w:Lyf/t;

    invoke-interface {v0, p1, p2, p3}, Lyf/t;->Y(Lyf/k;J)V

    return-void

    :goto_2
    invoke-virtual {v2}, Lne3/f;->close()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "already attached to a buffer"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lyf/f;->w:Lyf/t;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, Lyf/f;->w:Lyf/t;

    invoke-interface {v0}, Lyf/t;->flush()V

    return-void
.end method
