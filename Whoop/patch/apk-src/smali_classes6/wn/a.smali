.class public final Lwn/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwn/q;


# instance fields
.field public final synthetic w:Lwn/c;


# direct methods
.method public constructor <init>(Lwn/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwn/a;->w:Lwn/c;

    return-void
.end method


# virtual methods
.method public final l(Landroid/net/Uri;Lai/j;Z)Z
    .locals 9

    iget-object p3, p0, Lwn/a;->w:Lwn/c;

    iget-object v0, p3, Lwn/c;->z:Ljava/util/HashMap;

    iget-object v1, p3, Lwn/c;->L:Lwn/j;

    const/4 v2, 0x0

    if-nez v1, :cond_5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iget-object v1, p3, Lwn/c;->J:Lwn/m;

    sget v5, Llo/y;->a:I

    iget-object v1, v1, Lwn/m;->e:Ljava/util/List;

    move v5, v2

    move v6, v5

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7

    if-ge v5, v7, :cond_1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lwn/l;

    iget-object v7, v7, Lwn/l;->a:Landroid/net/Uri;

    invoke-virtual {v0, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lwn/b;

    if-eqz v7, :cond_0

    iget-wide v7, v7, Lwn/b;->H:J

    cmp-long v7, v3, v7

    if-gez v7, :cond_0

    add-int/lit8 v6, v6, 0x1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p3, Lwn/c;->J:Lwn/m;

    iget-object v1, v1, Lwn/m;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object p3, p3, Lwn/c;->y:Lg73/d;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p2, Lai/j;->x:Ljava/lang/Object;

    check-cast p2, Ljava/io/IOException;

    instance-of p3, p2, Lcom/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException;

    const/4 v3, 0x2

    if-nez p3, :cond_2

    goto :goto_1

    :cond_2
    check-cast p2, Lcom/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException;

    iget p2, p2, Lcom/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException;->y:I

    const/16 p3, 0x193

    if-eq p2, p3, :cond_3

    const/16 p3, 0x194

    if-eq p2, p3, :cond_3

    const/16 p3, 0x19a

    if-eq p2, p3, :cond_3

    const/16 p3, 0x1a0

    if-eq p2, p3, :cond_3

    const/16 p3, 0x1f4

    if-eq p2, p3, :cond_3

    const/16 p3, 0x1f7

    if-ne p2, p3, :cond_4

    :cond_3
    sub-int/2addr v1, v6

    const/4 p2, 0x1

    if-le v1, p2, :cond_4

    new-instance p2, Lbb/f;

    const-wide/32 v4, 0xea60

    invoke-direct {p2, v3, v4, v5, v3}, Lbb/f;-><init>(IJI)V

    goto :goto_2

    :cond_4
    :goto_1
    const/4 p2, 0x0

    :goto_2
    if-eqz p2, :cond_5

    iget p3, p2, Lbb/f;->a:I

    if-ne p3, v3, :cond_5

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwn/b;

    if-eqz p1, :cond_5

    iget-wide p2, p2, Lbb/f;->b:J

    invoke-static {p1, p2, p3}, Lwn/b;->a(Lwn/b;J)Z

    :cond_5
    return v2
.end method

.method public final o()V
    .locals 1

    iget-object v0, p0, Lwn/a;->w:Lwn/c;

    iget-object v0, v0, Lwn/c;->E:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
