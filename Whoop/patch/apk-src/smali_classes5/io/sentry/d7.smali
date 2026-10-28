.class public final Lio/sentry/d7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/l1;


# instance fields
.field public final a:Lio/sentry/u4;

.field public b:Lio/sentry/u4;

.field public final c:Lio/sentry/e7;

.field public final d:Lio/sentry/z6;

.field public e:Ljava/io/IOException;

.field public final f:Lio/sentry/d1;

.field public g:Z

.field public final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final i:Leh/a;

.field public j:Lio/sentry/f7;

.field public final k:Ljava/util/concurrent/ConcurrentHashMap;

.field public final l:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>(Lio/sentry/m7;Lio/sentry/z6;Lio/sentry/h4;Lio/sentry/n7;)V
    .locals 2

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lio/sentry/d7;->g:Z

    .line 21
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lio/sentry/d7;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/d7;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/d7;->l:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 25
    new-instance v0, Lio/sentry/util/a;

    .line 26
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 27
    iput-object p1, p0, Lio/sentry/d7;->c:Lio/sentry/e7;

    .line 28
    iget-object v0, p4, Leh/a;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 29
    iput-object v0, p1, Lio/sentry/e7;->I:Ljava/lang/String;

    .line 30
    iput-object p2, p0, Lio/sentry/d7;->d:Lio/sentry/z6;

    .line 31
    iput-object p3, p0, Lio/sentry/d7;->f:Lio/sentry/d1;

    const/4 p1, 0x0

    .line 32
    iput-object p1, p0, Lio/sentry/d7;->j:Lio/sentry/f7;

    .line 33
    iget-object p1, p4, Leh/a;->b:Ljava/lang/Object;

    check-cast p1, Lio/sentry/u4;

    if-eqz p1, :cond_0

    .line 34
    iput-object p1, p0, Lio/sentry/d7;->a:Lio/sentry/u4;

    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p3}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getDateProvider()Lio/sentry/v4;

    move-result-object p1

    invoke-interface {p1}, Lio/sentry/v4;->now()Lio/sentry/u4;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/d7;->a:Lio/sentry/u4;

    .line 36
    :goto_0
    iput-object p4, p0, Lio/sentry/d7;->i:Leh/a;

    return-void
.end method

.method public constructor <init>(Lio/sentry/z6;Lio/sentry/h4;Lio/sentry/e7;Leh/a;Lcom/whoop/data/repositories/c;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lio/sentry/d7;->g:Z

    .line 3
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lio/sentry/d7;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/d7;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/d7;->l:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    new-instance v0, Lio/sentry/util/a;

    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 9
    iput-object p3, p0, Lio/sentry/d7;->c:Lio/sentry/e7;

    .line 10
    iget-object v0, p4, Leh/a;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 11
    iput-object v0, p3, Lio/sentry/e7;->I:Ljava/lang/String;

    .line 12
    iput-object p1, p0, Lio/sentry/d7;->d:Lio/sentry/z6;

    .line 13
    const-string p1, "Scopes are required"

    invoke-static {p2, p1}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lio/sentry/d7;->f:Lio/sentry/d1;

    .line 14
    iput-object p4, p0, Lio/sentry/d7;->i:Leh/a;

    .line 15
    iput-object p5, p0, Lio/sentry/d7;->j:Lio/sentry/f7;

    .line 16
    iget-object p1, p4, Leh/a;->b:Ljava/lang/Object;

    check-cast p1, Lio/sentry/u4;

    if-eqz p1, :cond_0

    .line 17
    iput-object p1, p0, Lio/sentry/d7;->a:Lio/sentry/u4;

    return-void

    .line 18
    :cond_0
    invoke-virtual {p2}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getDateProvider()Lio/sentry/v4;

    move-result-object p1

    invoke-interface {p1}, Lio/sentry/v4;->now()Lio/sentry/u4;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/d7;->a:Lio/sentry/u4;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/i7;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/d7;->c:Lio/sentry/e7;

    iput-object p1, v0, Lio/sentry/e7;->G:Lio/sentry/i7;

    return-void
.end method

.method public final b()Lio/sentry/w6;
    .locals 4

    new-instance v0, Lio/sentry/w6;

    iget-object v1, p0, Lio/sentry/d7;->c:Lio/sentry/e7;

    iget-object v2, v1, Lio/sentry/e7;->w:Lio/sentry/protocol/v;

    iget-object v3, v1, Lio/sentry/e7;->x:Lio/sentry/h7;

    iget-object v1, v1, Lio/sentry/e7;->z:Laa3/i1;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, v1, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    :goto_0
    invoke-direct {v0, v2, v3, v1}, Lio/sentry/w6;-><init>(Lio/sentry/protocol/v;Lio/sentry/h7;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public final c()Lio/sentry/i7;
    .locals 1

    iget-object v0, p0, Lio/sentry/d7;->c:Lio/sentry/e7;

    iget-object v0, v0, Lio/sentry/e7;->G:Lio/sentry/i7;

    return-object v0
.end method

.method public final d(Ljava/lang/String;Lio/sentry/u4;Lio/sentry/s1;)Lio/sentry/l1;
    .locals 6

    new-instance v5, Leh/a;

    const/4 v0, 0x1

    invoke-direct {v5, v0}, Leh/a;-><init>(I)V

    const-string v1, "activity.load"

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Lio/sentry/d7;->q(Ljava/lang/String;Ljava/lang/String;Lio/sentry/u4;Lio/sentry/s1;Leh/a;)Lio/sentry/l1;

    move-result-object p1

    return-object p1
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/d7;->g:Z

    return v0
.end method

.method public final g()V
    .locals 1

    iget-object v0, p0, Lio/sentry/d7;->c:Lio/sentry/e7;

    iget-object v0, v0, Lio/sentry/e7;->G:Lio/sentry/i7;

    invoke-virtual {p0, v0}, Lio/sentry/d7;->l(Lio/sentry/i7;)V

    return-void
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/d7;->c:Lio/sentry/e7;

    iget-object v0, v0, Lio/sentry/e7;->F:Ljava/lang/String;

    return-object v0
.end method

.method public final i(Ljava/lang/String;Ljava/lang/Number;)V
    .locals 2

    iget-boolean v0, p0, Lio/sentry/d7;->g:Z

    if-eqz v0, :cond_0

    iget-object p2, p0, Lio/sentry/d7;->f:Lio/sentry/d1;

    invoke-interface {p2}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object p2

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v1, "The span is already finished. Measurement %s cannot be set"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, v0, v1, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance v0, Lio/sentry/protocol/m;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p2}, Lio/sentry/protocol/m;-><init>(Ljava/lang/String;Ljava/lang/Number;)V

    iget-object v1, p0, Lio/sentry/d7;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/sentry/d7;->d:Lio/sentry/z6;

    iget-object v1, v0, Lio/sentry/z6;->b:Lio/sentry/d7;

    if-eq v1, p0, :cond_1

    iget-object v1, v1, Lio/sentry/d7;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0, p1, p2}, Lio/sentry/z6;->i(Ljava/lang/String;Ljava/lang/Number;)V

    :cond_1
    return-void
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final l(Lio/sentry/i7;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/d7;->f:Lio/sentry/d1;

    invoke-interface {v0}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getDateProvider()Lio/sentry/v4;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/v4;->now()Lio/sentry/u4;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/sentry/d7;->v(Lio/sentry/i7;Lio/sentry/u4;)V

    return-void
.end method

.method public final m(Ljava/io/IOException;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/d7;->e:Ljava/io/IOException;

    return-void
.end method

.method public final n(Ljava/util/List;)Lhc3/x;
    .locals 1

    iget-object v0, p0, Lio/sentry/d7;->d:Lio/sentry/z6;

    invoke-virtual {v0, p1}, Lio/sentry/z6;->n(Ljava/util/List;)Lhc3/x;

    move-result-object p1

    return-object p1
.end method

.method public final o(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/d7;->k:Ljava/util/concurrent/ConcurrentHashMap;

    if-nez p1, :cond_0

    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-virtual {v0, p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final q(Ljava/lang/String;Ljava/lang/String;Lio/sentry/u4;Lio/sentry/s1;Leh/a;)Lio/sentry/l1;
    .locals 10

    iget-boolean v0, p0, Lio/sentry/d7;->g:Z

    if-eqz v0, :cond_0

    sget-object p1, Lio/sentry/e3;->a:Lio/sentry/e3;

    return-object p1

    :cond_0
    iget-object v0, p0, Lio/sentry/d7;->c:Lio/sentry/e7;

    iget-object v4, v0, Lio/sentry/e7;->x:Lio/sentry/h7;

    iget-object v0, p0, Lio/sentry/d7;->d:Lio/sentry/z6;

    iget-object v1, v0, Lio/sentry/z6;->b:Lio/sentry/d7;

    iget-object v1, v1, Lio/sentry/d7;->c:Lio/sentry/e7;

    move-object v2, v1

    new-instance v1, Lio/sentry/e7;

    move-object v3, v2

    iget-object v2, v3, Lio/sentry/e7;->w:Lio/sentry/protocol/v;

    move-object v5, v3

    new-instance v3, Lio/sentry/h7;

    invoke-direct {v3}, Lio/sentry/h7;-><init>()V

    iget-object v7, v5, Lio/sentry/e7;->z:Laa3/i1;

    const/4 v8, 0x0

    const-string v9, "manual"

    const/4 v6, 0x0

    move-object v5, p1

    invoke-direct/range {v1 .. v9}, Lio/sentry/e7;-><init>(Lio/sentry/protocol/v;Lio/sentry/h7;Lio/sentry/h7;Ljava/lang/String;Ljava/lang/String;Laa3/i1;Lio/sentry/i7;Ljava/lang/String;)V

    iput-object p2, v1, Lio/sentry/e7;->F:Ljava/lang/String;

    iput-object p4, v1, Lio/sentry/e7;->L:Lio/sentry/s1;

    iput-object p3, p5, Leh/a;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1, p5}, Lio/sentry/z6;->A(Lio/sentry/e7;Leh/a;)Lio/sentry/l1;

    move-result-object p1

    return-object p1
.end method

.method public final s(Ljava/lang/String;Ljava/lang/Long;Lio/sentry/l2;)V
    .locals 2

    iget-boolean v0, p0, Lio/sentry/d7;->g:Z

    if-eqz v0, :cond_0

    iget-object p2, p0, Lio/sentry/d7;->f:Lio/sentry/d1;

    invoke-interface {p2}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object p2

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object p3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v0, "The span is already finished. Measurement %s cannot be set"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p3, v0, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance v0, Lio/sentry/protocol/m;

    invoke-interface {p3}, Lio/sentry/l2;->apiName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Lio/sentry/protocol/m;-><init>(Ljava/lang/String;Ljava/lang/Number;)V

    iget-object v1, p0, Lio/sentry/d7;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/sentry/d7;->d:Lio/sentry/z6;

    iget-object v1, v0, Lio/sentry/z6;->b:Lio/sentry/d7;

    if-eq v1, p0, :cond_1

    iget-object v1, v1, Lio/sentry/d7;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0, p1, p2, p3}, Lio/sentry/z6;->s(Ljava/lang/String;Ljava/lang/Long;Lio/sentry/l2;)V

    :cond_1
    return-void
.end method

.method public final setDescription(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/d7;->c:Lio/sentry/e7;

    iput-object p1, v0, Lio/sentry/e7;->F:Ljava/lang/String;

    return-void
.end method

.method public final t()Lio/sentry/e7;
    .locals 1

    iget-object v0, p0, Lio/sentry/d7;->c:Lio/sentry/e7;

    return-object v0
.end method

.method public final u()Lio/sentry/u4;
    .locals 1

    iget-object v0, p0, Lio/sentry/d7;->b:Lio/sentry/u4;

    return-object v0
.end method

.method public final v(Lio/sentry/i7;Lio/sentry/u4;)V
    .locals 10

    iget-boolean v0, p0, Lio/sentry/d7;->g:Z

    if-nez v0, :cond_e

    iget-object v0, p0, Lio/sentry/d7;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, Lio/sentry/d7;->c:Lio/sentry/e7;

    iput-object p1, v0, Lio/sentry/e7;->G:Lio/sentry/i7;

    iget-object p1, v0, Lio/sentry/e7;->x:Lio/sentry/h7;

    iget-object v0, p0, Lio/sentry/d7;->f:Lio/sentry/d1;

    if-nez p2, :cond_1

    invoke-interface {v0}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object p2

    invoke-virtual {p2}, Lio/sentry/q6;->getDateProvider()Lio/sentry/v4;

    move-result-object p2

    invoke-interface {p2}, Lio/sentry/v4;->now()Lio/sentry/u4;

    move-result-object p2

    :cond_1
    iput-object p2, p0, Lio/sentry/d7;->b:Lio/sentry/u4;

    iget-object p2, p0, Lio/sentry/d7;->i:Leh/a;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v1, p2, Leh/a;->a:Z

    iget-object v3, p0, Lio/sentry/d7;->d:Lio/sentry/z6;

    if-eqz v1, :cond_b

    iget-object v1, v3, Lio/sentry/z6;->b:Lio/sentry/d7;

    iget-object v4, v3, Lio/sentry/z6;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v1, v1, Lio/sentry/d7;->c:Lio/sentry/e7;

    iget-object v1, v1, Lio/sentry/e7;->x:Lio/sentry/h7;

    invoke-virtual {v1, p1}, Lio/sentry/h7;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/d7;

    iget-object v6, v5, Lio/sentry/d7;->c:Lio/sentry/e7;

    iget-object v6, v6, Lio/sentry/e7;->y:Lio/sentry/h7;

    if-eqz v6, :cond_3

    invoke-virtual {v6, p1}, Lio/sentry/h7;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    move-object v4, v1

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move-object v4, v1

    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-wide/16 v6, 0x0

    if-eqz v5, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/d7;

    if-eqz v1, :cond_6

    iget-object v8, v5, Lio/sentry/d7;->a:Lio/sentry/u4;

    invoke-virtual {v8, v1}, Lio/sentry/u4;->b(Lio/sentry/u4;)J

    move-result-wide v8

    cmp-long v8, v8, v6

    if-gez v8, :cond_7

    :cond_6
    iget-object v1, v5, Lio/sentry/d7;->a:Lio/sentry/u4;

    :cond_7
    if-eqz v4, :cond_8

    iget-object v8, v5, Lio/sentry/d7;->b:Lio/sentry/u4;

    if-eqz v8, :cond_5

    invoke-virtual {v8, v4}, Lio/sentry/u4;->b(Lio/sentry/u4;)J

    move-result-wide v8

    cmp-long v6, v8, v6

    if-lez v6, :cond_5

    :cond_8
    iget-object v4, v5, Lio/sentry/d7;->b:Lio/sentry/u4;

    goto :goto_2

    :cond_9
    iget-boolean p1, p2, Leh/a;->a:Z

    if-eqz p1, :cond_b

    if-eqz v4, :cond_b

    iget-object p1, p0, Lio/sentry/d7;->b:Lio/sentry/u4;

    if-eqz p1, :cond_a

    invoke-virtual {p1, v4}, Lio/sentry/u4;->b(Lio/sentry/u4;)J

    move-result-wide p1

    cmp-long p1, p1, v6

    if-lez p1, :cond_b

    :cond_a
    iget-object p1, p0, Lio/sentry/d7;->b:Lio/sentry/u4;

    if-eqz p1, :cond_b

    iput-object v4, p0, Lio/sentry/d7;->b:Lio/sentry/u4;

    :cond_b
    iget-object p1, p0, Lio/sentry/d7;->e:Ljava/io/IOException;

    if-eqz p1, :cond_c

    iget-object p2, v3, Lio/sentry/z6;->e:Ljava/lang/String;

    invoke-interface {v0, p1, p0, p2}, Lio/sentry/d1;->p(Ljava/lang/Throwable;Lio/sentry/d7;Ljava/lang/String;)V

    :cond_c
    iget-object p1, p0, Lio/sentry/d7;->j:Lio/sentry/f7;

    if-eqz p1, :cond_d

    invoke-interface {p1, p0}, Lio/sentry/f7;->c(Lio/sentry/d7;)V

    :cond_d
    iput-boolean v2, p0, Lio/sentry/d7;->g:Z

    :cond_e
    :goto_3
    return-void
.end method

.method public final w(Ljava/lang/String;Ljava/lang/String;)Lio/sentry/l1;
    .locals 11

    iget-boolean v0, p0, Lio/sentry/d7;->g:Z

    if-eqz v0, :cond_0

    sget-object p1, Lio/sentry/e3;->a:Lio/sentry/e3;

    return-object p1

    :cond_0
    iget-object v0, p0, Lio/sentry/d7;->c:Lio/sentry/e7;

    iget-object v4, v0, Lio/sentry/e7;->x:Lio/sentry/h7;

    iget-object v0, p0, Lio/sentry/d7;->d:Lio/sentry/z6;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v10, Leh/a;

    const/4 v1, 0x1

    invoke-direct {v10, v1}, Leh/a;-><init>(I)V

    iget-object v1, v0, Lio/sentry/z6;->b:Lio/sentry/d7;

    iget-object v1, v1, Lio/sentry/d7;->c:Lio/sentry/e7;

    move-object v2, v1

    new-instance v1, Lio/sentry/e7;

    move-object v3, v2

    iget-object v2, v3, Lio/sentry/e7;->w:Lio/sentry/protocol/v;

    move-object v5, v3

    new-instance v3, Lio/sentry/h7;

    invoke-direct {v3}, Lio/sentry/h7;-><init>()V

    iget-object v7, v5, Lio/sentry/e7;->z:Laa3/i1;

    const/4 v8, 0x0

    const-string v9, "manual"

    const/4 v6, 0x0

    move-object v5, p1

    invoke-direct/range {v1 .. v9}, Lio/sentry/e7;-><init>(Lio/sentry/protocol/v;Lio/sentry/h7;Lio/sentry/h7;Ljava/lang/String;Ljava/lang/String;Laa3/i1;Lio/sentry/i7;Ljava/lang/String;)V

    iput-object p2, v1, Lio/sentry/e7;->F:Ljava/lang/String;

    sget-object p1, Lio/sentry/s1;->SENTRY:Lio/sentry/s1;

    iput-object p1, v1, Lio/sentry/e7;->L:Lio/sentry/s1;

    invoke-virtual {v0, v1, v10}, Lio/sentry/z6;->A(Lio/sentry/e7;Leh/a;)Lio/sentry/l1;

    move-result-object p1

    return-object p1
.end method

.method public final x()Lio/sentry/u4;
    .locals 1

    iget-object v0, p0, Lio/sentry/d7;->a:Lio/sentry/u4;

    return-object v0
.end method
