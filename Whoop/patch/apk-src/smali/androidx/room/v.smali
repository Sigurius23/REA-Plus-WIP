.class public final Landroidx/room/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/room/z0;

.field public final b:[Ljava/lang/String;

.field public final c:Landroidx/room/i2;

.field public final d:Ljava/util/LinkedHashMap;

.field public final e:Ljava/util/concurrent/locks/ReentrantLock;

.field public final f:Landroidx/room/r;

.field public final g:Landroidx/room/r;

.field public final h:Lcom/google/crypto/tink/internal/l0;

.field public i:Landroid/content/Intent;

.field public j:Landroidx/room/c0;

.field public final k:Ljava/lang/Object;


# direct methods
.method public varargs constructor <init>(Landroidx/room/z0;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;)V
    .locals 11

    const-string v0, "database"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/v;->a:Landroidx/room/z0;

    move-object v8, p4

    iput-object v8, p0, Landroidx/room/v;->b:[Ljava/lang/String;

    new-instance v9, Landroidx/room/i2;

    invoke-virtual {p1}, Landroidx/room/z0;->getUseTempTrackingTable$room_runtime()Z

    move-result v10

    new-instance v0, Landroidx/room/u;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x1

    const-class v3, Landroidx/room/v;

    const-string v4, "notifyInvalidatedObservers"

    const-string v5, "notifyInvalidatedObservers(Ljava/util/Set;)V"

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, v0

    move-object v4, v8

    move-object v0, v9

    move v5, v10

    invoke-direct/range {v0 .. v6}, Landroidx/room/i2;-><init>(Landroidx/room/z0;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;ZLandroidx/room/u;)V

    iput-object v0, p0, Landroidx/room/v;->c:Landroidx/room/i2;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v2, p0, Landroidx/room/v;->d:Ljava/util/LinkedHashMap;

    new-instance v2, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v2, p0, Landroidx/room/v;->e:Ljava/util/concurrent/locks/ReentrantLock;

    new-instance v2, Landroidx/room/r;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Landroidx/room/r;-><init>(Landroidx/room/v;I)V

    iput-object v2, p0, Landroidx/room/v;->f:Landroidx/room/r;

    new-instance v2, Landroidx/room/r;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Landroidx/room/r;-><init>(Landroidx/room/v;I)V

    iput-object v2, p0, Landroidx/room/v;->g:Landroidx/room/r;

    new-instance v2, Lcom/google/crypto/tink/internal/l0;

    invoke-direct {v2, p1}, Lcom/google/crypto/tink/internal/l0;-><init>(Landroidx/room/z0;)V

    iput-object v2, p0, Landroidx/room/v;->h:Lcom/google/crypto/tink/internal/l0;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Landroidx/room/v;->k:Ljava/lang/Object;

    new-instance v1, Landroidx/room/r;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Landroidx/room/r;-><init>(Landroidx/room/v;I)V

    iput-object v1, v0, Landroidx/room/i2;->k:Lc93/a;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/room/s;)Z
    .locals 6

    iget-object v0, p0, Landroidx/room/v;->d:Ljava/util/LinkedHashMap;

    iget-object v1, p1, Landroidx/room/s;->a:[Ljava/lang/String;

    iget-object v2, p0, Landroidx/room/v;->c:Landroidx/room/i2;

    invoke-virtual {v2, v1}, Landroidx/room/i2;->g([Ljava/lang/String;)Ll83/k;

    move-result-object v1

    iget-object v3, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, [Ljava/lang/String;

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, [I

    new-instance v4, Landroidx/room/i0;

    invoke-direct {v4, p1, v1, v3}, Landroidx/room/i0;-><init>(Landroidx/room/s;[I[Ljava/lang/String;)V

    iget-object v3, p0, Landroidx/room/v;->e:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {p1, v0}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/room/i0;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-interface {v0, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/room/i0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    if-nez p1, :cond_1

    iget-object p1, v2, Landroidx/room/i2;->h:Landroidx/room/g0;

    invoke-virtual {p1, v1}, Landroidx/room/g0;->a([I)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1

    :goto_1
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method

.method public final b([Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Landroidx/room/e1;
    .locals 7

    iget-object v0, p0, Landroidx/room/v;->c:Landroidx/room/i2;

    invoke-virtual {v0, p1}, Landroidx/room/i2;->g([Ljava/lang/String;)Ll83/k;

    iget-object v3, p0, Landroidx/room/v;->h:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroidx/room/e1;

    iget-object v0, v3, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/room/z0;

    move-object v5, p1

    move v4, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Landroidx/room/e1;-><init>(Landroidx/room/z0;Lcom/google/crypto/tink/internal/l0;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-object v1
.end method

.method public final c(Landroidx/room/s;)V
    .locals 2

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/v;->e:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget-object v1, p0, Landroidx/room/v;->d:Ljava/util/LinkedHashMap;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/room/i0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    if-eqz p1, :cond_0

    iget-object p1, p1, Landroidx/room/i0;->b:[I

    iget-object v0, p0, Landroidx/room/v;->c:Landroidx/room/i2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "tableIds"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Landroidx/room/i2;->h:Landroidx/room/g0;

    invoke-virtual {v0, p1}, Landroidx/room/g0;->b([I)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, La20/b;

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p1, p0, v0, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1}, Le93/b;->Z(Lc93/m;)Ljava/lang/Object;

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method

.method public final d(Ls83/i;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/room/v;->c:Landroidx/room/i2;

    invoke-virtual {v0, p1}, Landroidx/room/i2;->f(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
