.class public final Lio/sentry/c4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b1;


# instance fields
.field public a:Lio/sentry/n1;

.field public final b:Ljava/lang/ref/WeakReference;

.field public c:Lio/sentry/protocol/h0;

.field public d:Ljava/lang/String;

.field public e:Lio/sentry/protocol/q;

.field public final f:Ljava/util/ArrayList;

.field public volatile g:Ljava/lang/Object;

.field public final h:Ljava/util/concurrent/ConcurrentHashMap;

.field public final i:Ljava/util/concurrent/ConcurrentHashMap;

.field public final j:Ljava/util/concurrent/ConcurrentHashMap;

.field public final k:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public volatile l:Lio/sentry/q6;

.field public volatile m:Lio/sentry/b7;

.field public final n:Lio/sentry/util/a;

.field public final o:Lio/sentry/util/a;

.field public final p:Lio/sentry/util/a;

.field public final q:Lio/sentry/protocol/c;

.field public final r:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public s:La3/p;

.field public t:Lio/sentry/protocol/v;

.field public u:Lio/sentry/g1;

.field public final v:Ljava/util/Map;

.field public final w:Lio/sentry/featureflags/b;


# direct methods
.method public constructor <init>(Lio/sentry/c4;)V
    .locals 7

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/sentry/c4;->b:Ljava/lang/ref/WeakReference;

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/c4;->f:Ljava/util/ArrayList;

    .line 37
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/c4;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/c4;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 39
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/c4;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/c4;->k:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 41
    new-instance v0, Lio/sentry/util/a;

    .line 42
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 43
    iput-object v0, p0, Lio/sentry/c4;->n:Lio/sentry/util/a;

    .line 44
    new-instance v0, Lio/sentry/util/a;

    .line 45
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 46
    iput-object v0, p0, Lio/sentry/c4;->o:Lio/sentry/util/a;

    .line 47
    new-instance v0, Lio/sentry/util/a;

    .line 48
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 49
    iput-object v0, p0, Lio/sentry/c4;->p:Lio/sentry/util/a;

    .line 50
    new-instance v0, Lio/sentry/protocol/c;

    invoke-direct {v0}, Lio/sentry/protocol/c;-><init>()V

    iput-object v0, p0, Lio/sentry/c4;->q:Lio/sentry/protocol/c;

    .line 51
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/c4;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 52
    sget-object v0, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    iput-object v0, p0, Lio/sentry/c4;->t:Lio/sentry/protocol/v;

    .line 53
    sget-object v0, Lio/sentry/a3;->w:Lio/sentry/a3;

    iput-object v0, p0, Lio/sentry/c4;->u:Lio/sentry/g1;

    .line 54
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 55
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/c4;->v:Ljava/util/Map;

    .line 56
    iget-object v0, p1, Lio/sentry/c4;->a:Lio/sentry/n1;

    iput-object v0, p0, Lio/sentry/c4;->a:Lio/sentry/n1;

    .line 57
    iget-object v0, p1, Lio/sentry/c4;->b:Ljava/lang/ref/WeakReference;

    iput-object v0, p0, Lio/sentry/c4;->b:Ljava/lang/ref/WeakReference;

    .line 58
    iget-object v0, p1, Lio/sentry/c4;->m:Lio/sentry/b7;

    iput-object v0, p0, Lio/sentry/c4;->m:Lio/sentry/b7;

    .line 59
    iget-object v0, p1, Lio/sentry/c4;->l:Lio/sentry/q6;

    iput-object v0, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    .line 60
    iget-object v0, p1, Lio/sentry/c4;->u:Lio/sentry/g1;

    iput-object v0, p0, Lio/sentry/c4;->u:Lio/sentry/g1;

    .line 61
    iget-object v0, p1, Lio/sentry/c4;->c:Lio/sentry/protocol/h0;

    if-eqz v0, :cond_0

    .line 62
    new-instance v2, Lio/sentry/protocol/h0;

    .line 63
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 64
    iget-object v3, v0, Lio/sentry/protocol/h0;->w:Ljava/lang/String;

    iput-object v3, v2, Lio/sentry/protocol/h0;->w:Ljava/lang/String;

    .line 65
    iget-object v3, v0, Lio/sentry/protocol/h0;->y:Ljava/lang/String;

    iput-object v3, v2, Lio/sentry/protocol/h0;->y:Ljava/lang/String;

    .line 66
    iget-object v3, v0, Lio/sentry/protocol/h0;->x:Ljava/lang/String;

    iput-object v3, v2, Lio/sentry/protocol/h0;->x:Ljava/lang/String;

    .line 67
    iget-object v3, v0, Lio/sentry/protocol/h0;->z:Ljava/lang/String;

    iput-object v3, v2, Lio/sentry/protocol/h0;->z:Ljava/lang/String;

    .line 68
    iget-object v3, v0, Lio/sentry/protocol/h0;->E:Ljava/lang/String;

    iput-object v3, v2, Lio/sentry/protocol/h0;->E:Ljava/lang/String;

    .line 69
    iget-object v3, v0, Lio/sentry/protocol/h0;->F:Lio/sentry/protocol/k;

    iput-object v3, v2, Lio/sentry/protocol/h0;->F:Lio/sentry/protocol/k;

    .line 70
    iget-object v3, v0, Lio/sentry/protocol/h0;->G:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v3}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    iput-object v3, v2, Lio/sentry/protocol/h0;->G:Ljava/util/concurrent/ConcurrentHashMap;

    .line 71
    iget-object v0, v0, Lio/sentry/protocol/h0;->H:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    iput-object v0, v2, Lio/sentry/protocol/h0;->H:Ljava/util/concurrent/ConcurrentHashMap;

    goto :goto_0

    :cond_0
    move-object v2, v1

    .line 72
    :goto_0
    iput-object v2, p0, Lio/sentry/c4;->c:Lio/sentry/protocol/h0;

    .line 73
    iget-object v0, p1, Lio/sentry/c4;->d:Ljava/lang/String;

    iput-object v0, p0, Lio/sentry/c4;->d:Ljava/lang/String;

    .line 74
    iget-object v0, p1, Lio/sentry/c4;->t:Lio/sentry/protocol/v;

    iput-object v0, p0, Lio/sentry/c4;->t:Lio/sentry/protocol/v;

    .line 75
    iget-object v0, p1, Lio/sentry/c4;->e:Lio/sentry/protocol/q;

    if-eqz v0, :cond_1

    .line 76
    new-instance v2, Lio/sentry/protocol/q;

    .line 77
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 78
    iget-object v3, v0, Lio/sentry/protocol/q;->w:Ljava/lang/String;

    iput-object v3, v2, Lio/sentry/protocol/q;->w:Ljava/lang/String;

    .line 79
    iget-object v3, v0, Lio/sentry/protocol/q;->E:Ljava/lang/String;

    iput-object v3, v2, Lio/sentry/protocol/q;->E:Ljava/lang/String;

    .line 80
    iget-object v3, v0, Lio/sentry/protocol/q;->x:Ljava/lang/String;

    iput-object v3, v2, Lio/sentry/protocol/q;->x:Ljava/lang/String;

    .line 81
    iget-object v3, v0, Lio/sentry/protocol/q;->y:Ljava/lang/String;

    iput-object v3, v2, Lio/sentry/protocol/q;->y:Ljava/lang/String;

    .line 82
    iget-object v3, v0, Lio/sentry/protocol/q;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v3}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    iput-object v3, v2, Lio/sentry/protocol/q;->F:Ljava/util/concurrent/ConcurrentHashMap;

    .line 83
    iget-object v3, v0, Lio/sentry/protocol/q;->G:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v3}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    iput-object v3, v2, Lio/sentry/protocol/q;->G:Ljava/util/concurrent/ConcurrentHashMap;

    .line 84
    iget-object v3, v0, Lio/sentry/protocol/q;->I:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v3}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    iput-object v3, v2, Lio/sentry/protocol/q;->I:Ljava/util/concurrent/ConcurrentHashMap;

    .line 85
    iget-object v3, v0, Lio/sentry/protocol/q;->L:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v3}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    iput-object v3, v2, Lio/sentry/protocol/q;->L:Ljava/util/concurrent/ConcurrentHashMap;

    .line 86
    iget-object v3, v0, Lio/sentry/protocol/q;->z:Ljava/lang/Object;

    iput-object v3, v2, Lio/sentry/protocol/q;->z:Ljava/lang/Object;

    .line 87
    iget-object v3, v0, Lio/sentry/protocol/q;->J:Ljava/lang/String;

    iput-object v3, v2, Lio/sentry/protocol/q;->J:Ljava/lang/String;

    .line 88
    iget-object v3, v0, Lio/sentry/protocol/q;->H:Ljava/lang/Long;

    iput-object v3, v2, Lio/sentry/protocol/q;->H:Ljava/lang/Long;

    .line 89
    iget-object v0, v0, Lio/sentry/protocol/q;->K:Ljava/lang/String;

    iput-object v0, v2, Lio/sentry/protocol/q;->K:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v2, v1

    .line 90
    :goto_1
    iput-object v2, p0, Lio/sentry/c4;->e:Lio/sentry/protocol/q;

    .line 91
    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p1, Lio/sentry/c4;->f:Ljava/util/ArrayList;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lio/sentry/c4;->f:Ljava/util/ArrayList;

    .line 92
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v2, p1, Lio/sentry/c4;->k:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lio/sentry/c4;->k:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 93
    iget-object v0, p1, Lio/sentry/c4;->g:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v3, v2, [Lio/sentry/e;

    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/e;

    .line 94
    iget-object v3, p1, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v3}, Lio/sentry/q6;->getMaxBreadcrumbs()I

    move-result v3

    invoke-static {v3}, Lio/sentry/c4;->g(I)Ljava/util/Queue;

    move-result-object v3

    .line 95
    array-length v4, v0

    :goto_2
    if-ge v2, v4, :cond_2

    aget-object v5, v0, v2

    .line 96
    new-instance v6, Lio/sentry/e;

    invoke-direct {v6, v5}, Lio/sentry/e;-><init>(Lio/sentry/e;)V

    .line 97
    invoke-interface {v3, v6}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 98
    :cond_2
    iput-object v3, p0, Lio/sentry/c4;->g:Ljava/lang/Object;

    .line 99
    iget-object v0, p1, Lio/sentry/c4;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 100
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 101
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    if-eqz v3, :cond_3

    .line 102
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v4, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 103
    :cond_4
    iput-object v2, p0, Lio/sentry/c4;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 104
    iget-object v0, p1, Lio/sentry/c4;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 105
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 106
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    if-eqz v3, :cond_5

    .line 107
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lr;->t(Ljava/lang/Object;)V

    invoke-virtual {v2, v4, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 108
    :cond_6
    iput-object v2, p0, Lio/sentry/c4;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 109
    iget-object v0, p1, Lio/sentry/c4;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 110
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 111
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    if-eqz v2, :cond_7

    .line 112
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 113
    :cond_8
    iput-object v1, p0, Lio/sentry/c4;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 114
    new-instance v0, Lio/sentry/protocol/c;

    iget-object v1, p1, Lio/sentry/c4;->q:Lio/sentry/protocol/c;

    invoke-direct {v0, v1}, Lio/sentry/protocol/c;-><init>(Lio/sentry/protocol/c;)V

    iput-object v0, p0, Lio/sentry/c4;->q:Lio/sentry/protocol/c;

    .line 115
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v1, p1, Lio/sentry/c4;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lio/sentry/c4;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 116
    iget-object v0, p1, Lio/sentry/c4;->w:Lio/sentry/featureflags/b;

    invoke-interface {v0}, Lio/sentry/featureflags/b;->clone()Lio/sentry/featureflags/b;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/c4;->w:Lio/sentry/featureflags/b;

    .line 117
    new-instance v0, La3/p;

    iget-object p1, p1, Lio/sentry/c4;->s:La3/p;

    invoke-direct {v0, p1}, La3/p;-><init>(La3/p;)V

    iput-object v0, p0, Lio/sentry/c4;->s:La3/p;

    return-void
.end method

.method public constructor <init>(Lio/sentry/q6;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/sentry/c4;->b:Ljava/lang/ref/WeakReference;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/c4;->f:Ljava/util/ArrayList;

    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/c4;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/c4;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/c4;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/c4;->k:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    new-instance v0, Lio/sentry/util/a;

    .line 9
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 10
    iput-object v0, p0, Lio/sentry/c4;->n:Lio/sentry/util/a;

    .line 11
    new-instance v0, Lio/sentry/util/a;

    .line 12
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 13
    iput-object v0, p0, Lio/sentry/c4;->o:Lio/sentry/util/a;

    .line 14
    new-instance v0, Lio/sentry/util/a;

    .line 15
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 16
    iput-object v0, p0, Lio/sentry/c4;->p:Lio/sentry/util/a;

    .line 17
    new-instance v0, Lio/sentry/protocol/c;

    invoke-direct {v0}, Lio/sentry/protocol/c;-><init>()V

    iput-object v0, p0, Lio/sentry/c4;->q:Lio/sentry/protocol/c;

    .line 18
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/c4;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 19
    sget-object v0, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    iput-object v0, p0, Lio/sentry/c4;->t:Lio/sentry/protocol/v;

    .line 20
    sget-object v0, Lio/sentry/a3;->w:Lio/sentry/a3;

    iput-object v0, p0, Lio/sentry/c4;->u:Lio/sentry/g1;

    .line 21
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 22
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/c4;->v:Ljava/util/Map;

    .line 23
    const-string v0, "SentryOptions is required."

    invoke-static {p1, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    .line 24
    iget-object v0, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getMaxBreadcrumbs()I

    move-result v0

    invoke-static {v0}, Lio/sentry/c4;->g(I)Ljava/util/Queue;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/c4;->g:Ljava/lang/Object;

    .line 25
    invoke-virtual {p1}, Lio/sentry/q6;->getMaxFeatureFlags()I

    move-result p1

    if-lez p1, :cond_0

    .line 26
    new-instance p1, Lio/sentry/featureflags/a;

    .line 27
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Lio/sentry/util/a;

    .line 29
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 30
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p1, Lio/sentry/featureflags/a;->w:Ljava/util/concurrent/CopyOnWriteArrayList;

    goto :goto_0

    .line 31
    :cond_0
    sget-object p1, Lio/sentry/featureflags/c;->w:Lio/sentry/featureflags/c;

    .line 32
    :goto_0
    iput-object p1, p0, Lio/sentry/c4;->w:Lio/sentry/featureflags/b;

    .line 33
    new-instance p1, La3/p;

    const/16 v0, 0x9

    invoke-direct {p1, v0}, La3/p;-><init>(I)V

    iput-object p1, p0, Lio/sentry/c4;->s:La3/p;

    return-void
.end method

.method public static g(I)Ljava/util/Queue;
    .locals 1

    if-lez p0, :cond_0

    new-instance v0, Lio/sentry/g;

    invoke-direct {v0, p0}, Lio/sentry/g;-><init>(I)V

    new-instance p0, Lio/sentry/j7;

    invoke-direct {p0, v0}, Lio/sentry/j7;-><init>(Lio/sentry/g;)V

    return-object p0

    :cond_0
    new-instance p0, Lio/sentry/x;

    invoke-direct {p0}, Lio/sentry/x;-><init>()V

    return-object p0
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final B(Lio/sentry/n1;)V
    .locals 4

    iget-object v0, p0, Lio/sentry/c4;->o:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iput-object p1, p0, Lio/sentry/c4;->a:Lio/sentry/n1;

    iget-object v1, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v1}, Lio/sentry/q6;->getScopeObservers()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/c1;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lio/sentry/n1;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lio/sentry/c1;->n(Ljava/lang/String;)V

    invoke-interface {p1}, Lio/sentry/l1;->t()Lio/sentry/e7;

    move-result-object v3

    invoke-interface {v2, v3, p0}, Lio/sentry/c1;->j(Lio/sentry/e7;Lio/sentry/c4;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    invoke-interface {v2, v3}, Lio/sentry/c1;->n(Ljava/lang/String;)V

    invoke-interface {v2, v3, p0}, Lio/sentry/c1;->j(Lio/sentry/e7;Lio/sentry/c4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final C()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->f:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final D()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->a:Lio/sentry/n1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lio/sentry/n1;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final E()V
    .locals 3

    iget-object v0, p0, Lio/sentry/c4;->o:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Lio/sentry/c4;->a:Lio/sentry/n1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    iget-object v0, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getScopeObservers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/c1;

    invoke-interface {v2, v1}, Lio/sentry/c1;->n(Ljava/lang/String;)V

    invoke-interface {v2, v1, p0}, Lio/sentry/c1;->j(Lio/sentry/e7;Lio/sentry/c4;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1
.end method

.method public final F()Lio/sentry/featureflags/b;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->w:Lio/sentry/featureflags/b;

    return-object v0
.end method

.method public final G()La3/p;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->s:La3/p;

    return-object v0
.end method

.method public final H(Ljava/lang/String;)V
    .locals 4

    iput-object p1, p0, Lio/sentry/c4;->d:Ljava/lang/String;

    iget-object v0, p0, Lio/sentry/c4;->q:Lio/sentry/protocol/c;

    invoke-virtual {v0}, Lio/sentry/protocol/c;->d()Lio/sentry/protocol/a;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Lio/sentry/protocol/a;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Lio/sentry/protocol/c;->m(Lio/sentry/protocol/a;)V

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, v1, Lio/sentry/protocol/a;->I:Ljava/util/List;

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object v2, v1, Lio/sentry/protocol/a;->I:Ljava/util/List;

    :goto_0
    iget-object p1, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {p1}, Lio/sentry/q6;->getScopeObservers()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/c1;

    invoke-interface {v1, v0}, Lio/sentry/c1;->k(Lio/sentry/protocol/c;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final I()Lio/sentry/g1;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->u:Lio/sentry/g1;

    return-object v0
.end method

.method public final J(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lio/sentry/c4;->q:Lio/sentry/protocol/c;

    invoke-virtual {v0, p1, p2}, Lio/sentry/protocol/c;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object p1, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {p1}, Lio/sentry/q6;->getScopeObservers()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/sentry/c1;

    iget-object v0, p0, Lio/sentry/c4;->q:Lio/sentry/protocol/c;

    invoke-interface {p2, v0}, Lio/sentry/c1;->k(Lio/sentry/protocol/c;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final K()Ljava/util/List;
    .locals 2

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v1, p0, Lio/sentry/c4;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final L(Lio/sentry/e5;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->isTracingEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lio/sentry/r4;->a()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/c4;->v:Ljava/util/Map;

    invoke-virtual {p1}, Lio/sentry/r4;->a()Ljava/lang/Throwable;

    move-result-object v1

    const-string v2, "throwable cannot be null"

    invoke-static {v1, v2}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eq v2, v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/util/h;

    if-eqz v0, :cond_2

    iget-object v1, v0, Lio/sentry/util/h;->a:Ljava/lang/ref/WeakReference;

    iget-object v2, p1, Lio/sentry/r4;->x:Lio/sentry/protocol/c;

    invoke-virtual {v2}, Lio/sentry/protocol/c;->i()Lio/sentry/e7;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/l1;

    if-eqz v1, :cond_1

    iget-object v2, p1, Lio/sentry/r4;->x:Lio/sentry/protocol/c;

    invoke-interface {v1}, Lio/sentry/l1;->t()Lio/sentry/e7;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/sentry/protocol/c;->v(Lio/sentry/e7;)V

    :cond_1
    iget-object v0, v0, Lio/sentry/util/h;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/e5;->V:Ljava/lang/String;

    if-nez v1, :cond_2

    if-eqz v0, :cond_2

    iput-object v0, p1, Lio/sentry/e5;->V:Ljava/lang/String;

    :cond_2
    return-void
.end method

.method public final M(Lio/sentry/z3;)La3/p;
    .locals 2

    iget-object v0, p0, Lio/sentry/c4;->p:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/c4;->s:La3/p;

    invoke-interface {p1, v1}, Lio/sentry/z3;->c(La3/p;)V

    new-instance p1, La3/p;

    iget-object v1, p0, Lio/sentry/c4;->s:La3/p;

    invoke-direct {p1, v1}, La3/p;-><init>(La3/p;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final N(Lio/sentry/b4;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/c4;->o:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/c4;->a:Lio/sentry/n1;

    invoke-interface {p1, v1}, Lio/sentry/b4;->g(Lio/sentry/n1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final O(Lio/sentry/protocol/v;)V
    .locals 0

    return-void
.end method

.method public final P()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->k:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-static {v0}, Le93/b;->j0(Ljava/util/concurrent/CopyOnWriteArrayList;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final a()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lio/sentry/c4;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getScopeObservers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/c1;

    invoke-interface {v1, p1}, Lio/sentry/c1;->b(Ljava/lang/String;)V

    iget-object v2, p0, Lio/sentry/c4;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v2}, Lio/sentry/c1;->m(Ljava/util/concurrent/ConcurrentHashMap;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p0, p1}, Lio/sentry/c4;->b(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lio/sentry/c4;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getScopeObservers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/c1;

    invoke-interface {v1, p1, p2}, Lio/sentry/c1;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lio/sentry/c4;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v2}, Lio/sentry/c1;->m(Ljava/util/concurrent/ConcurrentHashMap;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final clear()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/c4;->c:Lio/sentry/protocol/h0;

    iput-object v0, p0, Lio/sentry/c4;->e:Lio/sentry/protocol/q;

    iput-object v0, p0, Lio/sentry/c4;->d:Ljava/lang/String;

    iget-object v0, p0, Lio/sentry/c4;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lio/sentry/c4;->g:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    iget-object v0, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getScopeObservers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/c1;

    iget-object v2, p0, Lio/sentry/c4;->g:Ljava/lang/Object;

    invoke-interface {v1, v2}, Lio/sentry/c1;->i(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/sentry/c4;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Lio/sentry/c4;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Lio/sentry/c4;->j:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Lio/sentry/c4;->k:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    invoke-virtual {p0}, Lio/sentry/c4;->E()V

    iget-object v0, p0, Lio/sentry/c4;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    iget-object v0, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getScopeObservers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/c1;

    invoke-interface {v1}, Lio/sentry/c1;->l()V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final clone()Lio/sentry/b1;
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/c4;

    invoke-direct {v0, p0}, Lio/sentry/c4;-><init>(Lio/sentry/c4;)V

    return-object v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 2
    new-instance v0, Lio/sentry/c4;

    invoke-direct {v0, p0}, Lio/sentry/c4;-><init>(Lio/sentry/c4;)V

    return-object v0
.end method

.method public final d()Lio/sentry/protocol/q;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->e:Lio/sentry/protocol/q;

    return-object v0
.end method

.method public final e(Lio/sentry/protocol/h0;)V
    .locals 2

    iput-object p1, p0, Lio/sentry/c4;->c:Lio/sentry/protocol/h0;

    iget-object v0, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getScopeObservers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/c1;

    invoke-interface {v1, p1}, Lio/sentry/c1;->e(Lio/sentry/protocol/h0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final f()Lio/sentry/l1;
    .locals 2

    iget-object v0, p0, Lio/sentry/c4;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/l1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/c4;->a:Lio/sentry/n1;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lio/sentry/n1;->p()Lio/sentry/l1;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    return-object v0
.end method

.method public final getExtras()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->j:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method public final getLevel()Lio/sentry/n5;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getUser()Lio/sentry/protocol/h0;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->c:Lio/sentry/protocol/h0;

    return-object v0
.end method

.method public final i(Lio/sentry/e;Lio/sentry/g0;)V
    .locals 3

    if-eqz p1, :cond_4

    iget-object v0, p0, Lio/sentry/c4;->g:Ljava/lang/Object;

    instance-of v0, v0, Lio/sentry/x;

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    if-nez p2, :cond_1

    new-instance p2, Lio/sentry/g0;

    invoke-direct {p2}, Lio/sentry/g0;-><init>()V

    :cond_1
    iget-object v0, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getBeforeBreadcrumb()Lio/sentry/b6;

    move-result-object v0

    if-eqz v0, :cond_2

    :try_start_0
    check-cast v0, Lwe/o;

    invoke-virtual {v0, p1, p2}, Lwe/o;->D(Lio/sentry/e;Lio/sentry/g0;)Lio/sentry/e;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    iget-object v0, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb."

    invoke-interface {v0, v1, v2, p2}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v0, "sentry:message"

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v0}, Lio/sentry/e;->c(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    iget-object p2, p0, Lio/sentry/c4;->g:Ljava/lang/Object;

    invoke-interface {p2, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {p2}, Lio/sentry/q6;->getScopeObservers()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/c1;

    invoke-interface {v0, p1}, Lio/sentry/c1;->h(Lio/sentry/e;)V

    iget-object v1, p0, Lio/sentry/c4;->g:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lio/sentry/c1;->i(Ljava/util/Collection;)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Breadcrumb was dropped by beforeBreadcrumb"

    invoke-interface {p1, p2, v1, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public final l()Lio/sentry/q6;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    return-object v0
.end method

.method public final m()Lio/sentry/n1;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->a:Lio/sentry/n1;

    return-object v0
.end method

.method public final o()Lio/sentry/b7;
    .locals 4

    iget-object v0, p0, Lio/sentry/c4;->n:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/c4;->m:Lio/sentry/b7;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/sentry/c4;->m:Lio/sentry/b7;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljc/x;->O()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v1, v3}, Lio/sentry/b7;->b(Ljava/util/Date;)V

    iget-object v1, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v1}, Lio/sentry/q6;->getContinuousProfiler()Lio/sentry/q0;

    move-result-object v1

    invoke-interface {v1}, Lio/sentry/q0;->c()V

    iget-object v1, p0, Lio/sentry/c4;->m:Lio/sentry/b7;

    invoke-virtual {v1}, Lio/sentry/b7;->a()Lio/sentry/b7;

    move-result-object v1

    iput-object v2, p0, Lio/sentry/c4;->m:Lio/sentry/b7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v2, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-object v2

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
.end method

.method public final p(Ljava/lang/Throwable;Lio/sentry/d7;Ljava/lang/String;)V
    .locals 3

    const-string v0, "throwable is required"

    invoke-static {p1, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transactionName is required"

    invoke-static {p3, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/sentry/c4;->v:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Lio/sentry/util/h;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v1, v2, p3}, Lio/sentry/util/h;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final q()Lio/sentry/b7;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->m:Lio/sentry/b7;

    return-object v0
.end method

.method public final r()Lio/sentry/protocol/i;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->w:Lio/sentry/featureflags/b;

    invoke-interface {v0}, Lio/sentry/featureflags/b;->r()Lio/sentry/protocol/i;

    move-result-object v0

    return-object v0
.end method

.method public final s()Lio/sentry/protocol/v;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->t:Lio/sentry/protocol/v;

    return-object v0
.end method

.method public final t(Lio/sentry/protocol/v;)V
    .locals 2

    iput-object p1, p0, Lio/sentry/c4;->t:Lio/sentry/protocol/v;

    iget-object v0, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getScopeObservers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/c1;

    invoke-interface {v1, p1}, Lio/sentry/c1;->t(Lio/sentry/protocol/v;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final u()Lwe/o;
    .locals 20

    move-object/from16 v1, p0

    iget-object v0, v1, Lio/sentry/c4;->n:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v2

    :try_start_0
    iget-object v0, v1, Lio/sentry/c4;->m:Lio/sentry/b7;

    if-eqz v0, :cond_0

    iget-object v0, v1, Lio/sentry/c4;->m:Lio/sentry/b7;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljc/x;->O()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/sentry/b7;->b(Ljava/util/Date;)V

    iget-object v0, v1, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getContinuousProfiler()Lio/sentry/q0;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/q0;->c()V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v3, v0

    goto :goto_3

    :cond_0
    :goto_0
    iget-object v0, v1, Lio/sentry/c4;->m:Lio/sentry/b7;

    iget-object v3, v1, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v3}, Lio/sentry/q6;->getRelease()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    new-instance v5, Lio/sentry/b7;

    iget-object v3, v1, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v3}, Lio/sentry/q6;->getDistinctId()Ljava/lang/String;

    move-result-object v10

    iget-object v3, v1, Lio/sentry/c4;->c:Lio/sentry/protocol/h0;

    iget-object v6, v1, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v6}, Lio/sentry/q6;->getEnvironment()Ljava/lang/String;

    move-result-object v17

    iget-object v6, v1, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v6}, Lio/sentry/q6;->getRelease()Ljava/lang/String;

    move-result-object v18

    sget-object v6, Lio/sentry/a7;->Ok:Lio/sentry/a7;

    invoke-static {}, Ljc/x;->O()Ljava/util/Date;

    move-result-object v7

    invoke-static {}, Ljc/x;->O()Ljava/util/Date;

    move-result-object v8

    invoke-static {}, Lq83/g;->v()Ljava/lang/String;

    move-result-object v11

    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    if-eqz v3, :cond_1

    iget-object v3, v3, Lio/sentry/protocol/h0;->z:Ljava/lang/String;

    move-object v15, v3

    goto :goto_1

    :cond_1
    move-object v15, v4

    :goto_1
    const/16 v16, 0x0

    const/16 v19, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v5 .. v19}, Lio/sentry/b7;-><init>(Lio/sentry/a7;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v5, v1, Lio/sentry/c4;->m:Lio/sentry/b7;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lio/sentry/b7;->a()Lio/sentry/b7;

    move-result-object v4

    :cond_2
    new-instance v0, Lwe/o;

    iget-object v3, v1, Lio/sentry/c4;->m:Lio/sentry/b7;

    invoke-virtual {v3}, Lio/sentry/b7;->a()Lio/sentry/b7;

    move-result-object v3

    const/4 v5, 0x0

    invoke-direct {v0, v3, v4, v5}, Lwe/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    move-object v4, v0

    goto :goto_2

    :cond_3
    iget-object v0, v1, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v3, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v5, "Release is not set on SentryOptions. Session could not be started"

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-interface {v0, v3, v5, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    invoke-virtual {v2}, Lio/sentry/s;->close()V

    return-object v4

    :goto_3
    :try_start_1
    invoke-virtual {v2}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v3
.end method

.method public final v()Ljava/util/Queue;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->g:Ljava/lang/Object;

    return-object v0
.end method

.method public final w(Lio/sentry/a4;)Lio/sentry/b7;
    .locals 2

    iget-object v0, p0, Lio/sentry/c4;->n:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/c4;->m:Lio/sentry/b7;

    invoke-interface {p1, v1}, Lio/sentry/a4;->a(Lio/sentry/b7;)V

    iget-object p1, p0, Lio/sentry/c4;->m:Lio/sentry/b7;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/sentry/c4;->m:Lio/sentry/b7;

    invoke-virtual {p1}, Lio/sentry/b7;->a()Lio/sentry/b7;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-object p1

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final x(La3/p;)V
    .locals 4

    iput-object p1, p0, Lio/sentry/c4;->s:La3/p;

    new-instance v0, Lio/sentry/e7;

    iget-object v1, p1, La3/p;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/protocol/v;

    iget-object p1, p1, La3/p;->y:Ljava/lang/Object;

    check-cast p1, Lio/sentry/h7;

    const-string v2, "default"

    const/4 v3, 0x0

    invoke-direct {v0, v1, p1, v2, v3}, Lio/sentry/e7;-><init>(Lio/sentry/protocol/v;Lio/sentry/h7;Ljava/lang/String;Lio/sentry/h7;)V

    const-string p1, "auto"

    iput-object p1, v0, Lio/sentry/e7;->I:Ljava/lang/String;

    iget-object p1, p0, Lio/sentry/c4;->l:Lio/sentry/q6;

    invoke-virtual {p1}, Lio/sentry/q6;->getScopeObservers()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/c1;

    invoke-interface {v1, v0, p0}, Lio/sentry/c1;->j(Lio/sentry/e7;Lio/sentry/c4;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final y()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->k:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object v0
.end method

.method public final z()Lio/sentry/protocol/c;
    .locals 1

    iget-object v0, p0, Lio/sentry/c4;->q:Lio/sentry/protocol/c;

    return-object v0
.end method
