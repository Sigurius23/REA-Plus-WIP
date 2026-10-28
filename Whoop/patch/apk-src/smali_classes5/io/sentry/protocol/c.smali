.class public Lio/sentry/protocol/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public final w:Ljava/util/concurrent/ConcurrentHashMap;

.field public final x:Lio/sentry/util/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/protocol/c;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    new-instance v0, Lio/sentry/util/a;

    .line 4
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 5
    iput-object v0, p0, Lio/sentry/protocol/c;->x:Lio/sentry/util/a;

    return-void
.end method

.method public constructor <init>(Lio/sentry/protocol/c;)V
    .locals 5

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/protocol/c;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    new-instance v0, Lio/sentry/util/a;

    .line 9
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 10
    iput-object v0, p0, Lio/sentry/protocol/c;->x:Lio/sentry/util/a;

    .line 11
    invoke-virtual {p1}, Lio/sentry/protocol/c;->b()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    .line 12
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 13
    const-string v2, "app"

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    instance-of v2, v1, Lio/sentry/protocol/a;

    if-eqz v2, :cond_2

    .line 14
    new-instance v0, Lio/sentry/protocol/a;

    check-cast v1, Lio/sentry/protocol/a;

    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    iget-object v2, v1, Lio/sentry/protocol/a;->G:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/a;->G:Ljava/lang/String;

    .line 17
    iget-object v2, v1, Lio/sentry/protocol/a;->w:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/a;->w:Ljava/lang/String;

    .line 18
    iget-object v2, v1, Lio/sentry/protocol/a;->E:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/a;->E:Ljava/lang/String;

    .line 19
    iget-object v2, v1, Lio/sentry/protocol/a;->x:Ljava/util/Date;

    iput-object v2, v0, Lio/sentry/protocol/a;->x:Ljava/util/Date;

    .line 20
    iget-object v2, v1, Lio/sentry/protocol/a;->F:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/a;->F:Ljava/lang/String;

    .line 21
    iget-object v2, v1, Lio/sentry/protocol/a;->z:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/a;->z:Ljava/lang/String;

    .line 22
    iget-object v2, v1, Lio/sentry/protocol/a;->y:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/a;->y:Ljava/lang/String;

    .line 23
    iget-object v2, v1, Lio/sentry/protocol/a;->H:Ljava/util/AbstractMap;

    invoke-static {v2}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/a;->H:Ljava/util/AbstractMap;

    .line 24
    iget-object v2, v1, Lio/sentry/protocol/a;->K:Ljava/lang/Boolean;

    iput-object v2, v0, Lio/sentry/protocol/a;->K:Ljava/lang/Boolean;

    .line 25
    iget-object v2, v1, Lio/sentry/protocol/a;->I:Ljava/util/List;

    if-eqz v2, :cond_1

    .line 26
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 27
    :cond_1
    iput-object v3, v0, Lio/sentry/protocol/a;->I:Ljava/util/List;

    .line 28
    iget-object v2, v1, Lio/sentry/protocol/a;->J:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/a;->J:Ljava/lang/String;

    .line 29
    iget-object v2, v1, Lio/sentry/protocol/a;->L:Ljava/lang/Boolean;

    iput-object v2, v0, Lio/sentry/protocol/a;->L:Ljava/lang/Boolean;

    .line 30
    iget-object v2, v1, Lio/sentry/protocol/a;->M:Ljava/util/List;

    iput-object v2, v0, Lio/sentry/protocol/a;->M:Ljava/util/List;

    .line 31
    iget-object v1, v1, Lio/sentry/protocol/a;->N:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/a;->N:Ljava/util/concurrent/ConcurrentHashMap;

    .line 32
    invoke-virtual {p0, v0}, Lio/sentry/protocol/c;->m(Lio/sentry/protocol/a;)V

    goto :goto_0

    .line 33
    :cond_2
    const-string v2, "browser"

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    instance-of v2, v1, Lio/sentry/protocol/b;

    if-eqz v2, :cond_3

    .line 34
    new-instance v0, Lio/sentry/protocol/b;

    check-cast v1, Lio/sentry/protocol/b;

    .line 35
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 36
    iget-object v2, v1, Lio/sentry/protocol/b;->w:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/b;->w:Ljava/lang/String;

    .line 37
    iget-object v2, v1, Lio/sentry/protocol/b;->x:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/b;->x:Ljava/lang/String;

    .line 38
    iget-object v1, v1, Lio/sentry/protocol/b;->y:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/b;->y:Ljava/util/concurrent/ConcurrentHashMap;

    .line 39
    invoke-virtual {p0, v0}, Lio/sentry/protocol/c;->n(Lio/sentry/protocol/b;)V

    goto/16 :goto_0

    .line 40
    :cond_3
    const-string v2, "device"

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    instance-of v2, v1, Lio/sentry/protocol/f;

    if-eqz v2, :cond_6

    .line 41
    new-instance v0, Lio/sentry/protocol/f;

    check-cast v1, Lio/sentry/protocol/f;

    .line 42
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 43
    iget-object v2, v1, Lio/sentry/protocol/f;->w:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->w:Ljava/lang/String;

    .line 44
    iget-object v2, v1, Lio/sentry/protocol/f;->x:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->x:Ljava/lang/String;

    .line 45
    iget-object v2, v1, Lio/sentry/protocol/f;->y:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->y:Ljava/lang/String;

    .line 46
    iget-object v2, v1, Lio/sentry/protocol/f;->z:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->z:Ljava/lang/String;

    .line 47
    iget-object v2, v1, Lio/sentry/protocol/f;->E:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->E:Ljava/lang/String;

    .line 48
    iget-object v2, v1, Lio/sentry/protocol/f;->F:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->F:Ljava/lang/String;

    .line 49
    iget-object v2, v1, Lio/sentry/protocol/f;->I:Ljava/lang/Boolean;

    iput-object v2, v0, Lio/sentry/protocol/f;->I:Ljava/lang/Boolean;

    .line 50
    iget-object v2, v1, Lio/sentry/protocol/f;->J:Ljava/lang/Boolean;

    iput-object v2, v0, Lio/sentry/protocol/f;->J:Ljava/lang/Boolean;

    .line 51
    iget-object v2, v1, Lio/sentry/protocol/f;->K:Lio/sentry/protocol/e;

    iput-object v2, v0, Lio/sentry/protocol/f;->K:Lio/sentry/protocol/e;

    .line 52
    iget-object v2, v1, Lio/sentry/protocol/f;->L:Ljava/lang/Boolean;

    iput-object v2, v0, Lio/sentry/protocol/f;->L:Ljava/lang/Boolean;

    .line 53
    iget-object v2, v1, Lio/sentry/protocol/f;->M:Ljava/lang/Long;

    iput-object v2, v0, Lio/sentry/protocol/f;->M:Ljava/lang/Long;

    .line 54
    iget-object v2, v1, Lio/sentry/protocol/f;->N:Ljava/lang/Long;

    iput-object v2, v0, Lio/sentry/protocol/f;->N:Ljava/lang/Long;

    .line 55
    iget-object v2, v1, Lio/sentry/protocol/f;->O:Ljava/lang/Long;

    iput-object v2, v0, Lio/sentry/protocol/f;->O:Ljava/lang/Long;

    .line 56
    iget-object v2, v1, Lio/sentry/protocol/f;->P:Ljava/lang/Boolean;

    iput-object v2, v0, Lio/sentry/protocol/f;->P:Ljava/lang/Boolean;

    .line 57
    iget-object v2, v1, Lio/sentry/protocol/f;->Q:Ljava/lang/Long;

    iput-object v2, v0, Lio/sentry/protocol/f;->Q:Ljava/lang/Long;

    .line 58
    iget-object v2, v1, Lio/sentry/protocol/f;->R:Ljava/lang/Long;

    iput-object v2, v0, Lio/sentry/protocol/f;->R:Ljava/lang/Long;

    .line 59
    iget-object v2, v1, Lio/sentry/protocol/f;->S:Ljava/lang/Long;

    iput-object v2, v0, Lio/sentry/protocol/f;->S:Ljava/lang/Long;

    .line 60
    iget-object v2, v1, Lio/sentry/protocol/f;->T:Ljava/lang/Long;

    iput-object v2, v0, Lio/sentry/protocol/f;->T:Ljava/lang/Long;

    .line 61
    iget-object v2, v1, Lio/sentry/protocol/f;->U:Ljava/lang/Integer;

    iput-object v2, v0, Lio/sentry/protocol/f;->U:Ljava/lang/Integer;

    .line 62
    iget-object v2, v1, Lio/sentry/protocol/f;->V:Ljava/lang/Integer;

    iput-object v2, v0, Lio/sentry/protocol/f;->V:Ljava/lang/Integer;

    .line 63
    iget-object v2, v1, Lio/sentry/protocol/f;->W:Ljava/lang/Float;

    iput-object v2, v0, Lio/sentry/protocol/f;->W:Ljava/lang/Float;

    .line 64
    iget-object v2, v1, Lio/sentry/protocol/f;->X:Ljava/lang/Integer;

    iput-object v2, v0, Lio/sentry/protocol/f;->X:Ljava/lang/Integer;

    .line 65
    iget-object v2, v1, Lio/sentry/protocol/f;->Y:Ljava/util/Date;

    iput-object v2, v0, Lio/sentry/protocol/f;->Y:Ljava/util/Date;

    .line 66
    iget-object v2, v1, Lio/sentry/protocol/f;->a0:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->a0:Ljava/lang/String;

    .line 67
    iget-object v2, v1, Lio/sentry/protocol/f;->c0:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->c0:Ljava/lang/String;

    .line 68
    iget-object v2, v1, Lio/sentry/protocol/f;->d0:Ljava/lang/Float;

    iput-object v2, v0, Lio/sentry/protocol/f;->d0:Ljava/lang/Float;

    .line 69
    iget-object v2, v1, Lio/sentry/protocol/f;->H:Ljava/lang/Float;

    iput-object v2, v0, Lio/sentry/protocol/f;->H:Ljava/lang/Float;

    .line 70
    iget-object v2, v1, Lio/sentry/protocol/f;->G:[Ljava/lang/String;

    if-eqz v2, :cond_4

    .line 71
    invoke-virtual {v2}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    goto :goto_1

    :cond_4
    move-object v2, v3

    :goto_1
    iput-object v2, v0, Lio/sentry/protocol/f;->G:[Ljava/lang/String;

    .line 72
    iget-object v2, v1, Lio/sentry/protocol/f;->b0:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->b0:Ljava/lang/String;

    .line 73
    iget-object v2, v1, Lio/sentry/protocol/f;->Z:Ljava/util/TimeZone;

    if-eqz v2, :cond_5

    .line 74
    invoke-virtual {v2}, Ljava/util/TimeZone;->clone()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/TimeZone;

    :cond_5
    iput-object v3, v0, Lio/sentry/protocol/f;->Z:Ljava/util/TimeZone;

    .line 75
    iget-object v2, v1, Lio/sentry/protocol/f;->e0:Ljava/lang/Integer;

    iput-object v2, v0, Lio/sentry/protocol/f;->e0:Ljava/lang/Integer;

    .line 76
    iget-object v2, v1, Lio/sentry/protocol/f;->f0:Ljava/lang/Double;

    iput-object v2, v0, Lio/sentry/protocol/f;->f0:Ljava/lang/Double;

    .line 77
    iget-object v2, v1, Lio/sentry/protocol/f;->g0:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->g0:Ljava/lang/String;

    .line 78
    iget-object v2, v1, Lio/sentry/protocol/f;->h0:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->h0:Ljava/lang/String;

    .line 79
    iget-object v1, v1, Lio/sentry/protocol/f;->i0:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/f;->i0:Ljava/util/concurrent/ConcurrentHashMap;

    .line 80
    invoke-virtual {p0, v0}, Lio/sentry/protocol/c;->o(Lio/sentry/protocol/f;)V

    goto/16 :goto_0

    .line 81
    :cond_6
    const-string v2, "os"

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    instance-of v2, v1, Lio/sentry/protocol/p;

    if-eqz v2, :cond_7

    .line 82
    new-instance v0, Lio/sentry/protocol/p;

    check-cast v1, Lio/sentry/protocol/p;

    .line 83
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 84
    iget-object v2, v1, Lio/sentry/protocol/p;->w:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/p;->w:Ljava/lang/String;

    .line 85
    iget-object v2, v1, Lio/sentry/protocol/p;->x:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/p;->x:Ljava/lang/String;

    .line 86
    iget-object v2, v1, Lio/sentry/protocol/p;->y:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/p;->y:Ljava/lang/String;

    .line 87
    iget-object v2, v1, Lio/sentry/protocol/p;->z:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/p;->z:Ljava/lang/String;

    .line 88
    iget-object v2, v1, Lio/sentry/protocol/p;->E:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/p;->E:Ljava/lang/String;

    .line 89
    iget-object v2, v1, Lio/sentry/protocol/p;->F:Ljava/lang/Boolean;

    iput-object v2, v0, Lio/sentry/protocol/p;->F:Ljava/lang/Boolean;

    .line 90
    iget-object v1, v1, Lio/sentry/protocol/p;->G:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/p;->G:Ljava/util/concurrent/ConcurrentHashMap;

    .line 91
    invoke-virtual {p0, v0}, Lio/sentry/protocol/c;->r(Lio/sentry/protocol/p;)V

    goto/16 :goto_0

    .line 92
    :cond_7
    const-string v2, "runtime"

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    instance-of v2, v1, Lio/sentry/protocol/x;

    if-eqz v2, :cond_8

    .line 93
    new-instance v0, Lio/sentry/protocol/x;

    check-cast v1, Lio/sentry/protocol/x;

    .line 94
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 95
    iget-object v2, v1, Lio/sentry/protocol/x;->w:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/x;->w:Ljava/lang/String;

    .line 96
    iget-object v2, v1, Lio/sentry/protocol/x;->x:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/x;->x:Ljava/lang/String;

    .line 97
    iget-object v2, v1, Lio/sentry/protocol/x;->y:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/x;->y:Ljava/lang/String;

    .line 98
    iget-object v1, v1, Lio/sentry/protocol/x;->z:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/x;->z:Ljava/util/concurrent/ConcurrentHashMap;

    .line 99
    invoke-virtual {p0, v0}, Lio/sentry/protocol/c;->t(Lio/sentry/protocol/x;)V

    goto/16 :goto_0

    .line 100
    :cond_8
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "feedback"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    instance-of v2, v1, Lio/sentry/protocol/j;

    if-eqz v2, :cond_9

    .line 101
    new-instance v0, Lio/sentry/protocol/j;

    check-cast v1, Lio/sentry/protocol/j;

    .line 102
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 103
    iget-object v2, v1, Lio/sentry/protocol/j;->w:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/j;->w:Ljava/lang/String;

    .line 104
    iget-object v2, v1, Lio/sentry/protocol/j;->x:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/j;->x:Ljava/lang/String;

    .line 105
    iget-object v2, v1, Lio/sentry/protocol/j;->y:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/j;->y:Ljava/lang/String;

    .line 106
    iget-object v2, v1, Lio/sentry/protocol/j;->z:Lio/sentry/protocol/v;

    iput-object v2, v0, Lio/sentry/protocol/j;->z:Lio/sentry/protocol/v;

    .line 107
    iget-object v2, v1, Lio/sentry/protocol/j;->E:Lio/sentry/protocol/v;

    iput-object v2, v0, Lio/sentry/protocol/j;->E:Lio/sentry/protocol/v;

    .line 108
    iget-object v2, v1, Lio/sentry/protocol/j;->F:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/j;->F:Ljava/lang/String;

    .line 109
    iget-object v1, v1, Lio/sentry/protocol/j;->G:Ljava/util/AbstractMap;

    invoke-static {v1}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/j;->G:Ljava/util/AbstractMap;

    .line 110
    invoke-virtual {p0, v0, v3}, Lio/sentry/protocol/c;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 111
    :cond_9
    const-string v2, "gpu"

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    instance-of v2, v1, Lio/sentry/protocol/l;

    if-eqz v2, :cond_a

    .line 112
    new-instance v0, Lio/sentry/protocol/l;

    check-cast v1, Lio/sentry/protocol/l;

    .line 113
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 114
    iget-object v2, v1, Lio/sentry/protocol/l;->w:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/l;->w:Ljava/lang/String;

    .line 115
    iget-object v2, v1, Lio/sentry/protocol/l;->x:Ljava/lang/Integer;

    iput-object v2, v0, Lio/sentry/protocol/l;->x:Ljava/lang/Integer;

    .line 116
    iget-object v2, v1, Lio/sentry/protocol/l;->y:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/l;->y:Ljava/lang/String;

    .line 117
    iget-object v2, v1, Lio/sentry/protocol/l;->z:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/l;->z:Ljava/lang/String;

    .line 118
    iget-object v2, v1, Lio/sentry/protocol/l;->E:Ljava/lang/Integer;

    iput-object v2, v0, Lio/sentry/protocol/l;->E:Ljava/lang/Integer;

    .line 119
    iget-object v2, v1, Lio/sentry/protocol/l;->F:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/l;->F:Ljava/lang/String;

    .line 120
    iget-object v2, v1, Lio/sentry/protocol/l;->G:Ljava/lang/Boolean;

    iput-object v2, v0, Lio/sentry/protocol/l;->G:Ljava/lang/Boolean;

    .line 121
    iget-object v2, v1, Lio/sentry/protocol/l;->H:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/l;->H:Ljava/lang/String;

    .line 122
    iget-object v2, v1, Lio/sentry/protocol/l;->I:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/l;->I:Ljava/lang/String;

    .line 123
    iget-object v1, v1, Lio/sentry/protocol/l;->J:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/l;->J:Ljava/util/concurrent/ConcurrentHashMap;

    .line 124
    invoke-virtual {p0, v0}, Lio/sentry/protocol/c;->q(Lio/sentry/protocol/l;)V

    goto/16 :goto_0

    .line 125
    :cond_a
    const-string v2, "trace"

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    instance-of v2, v1, Lio/sentry/e7;

    if-eqz v2, :cond_b

    .line 126
    new-instance v0, Lio/sentry/e7;

    check-cast v1, Lio/sentry/e7;

    invoke-direct {v0, v1}, Lio/sentry/e7;-><init>(Lio/sentry/e7;)V

    invoke-virtual {p0, v0}, Lio/sentry/protocol/c;->v(Lio/sentry/e7;)V

    goto/16 :goto_0

    .line 127
    :cond_b
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "profile"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    instance-of v2, v1, Lio/sentry/q3;

    if-eqz v2, :cond_d

    .line 128
    new-instance v0, Lio/sentry/q3;

    check-cast v1, Lio/sentry/q3;

    .line 129
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 130
    iget-object v2, v1, Lio/sentry/q3;->w:Lio/sentry/protocol/v;

    iput-object v2, v0, Lio/sentry/q3;->w:Lio/sentry/protocol/v;

    .line 131
    iget-object v1, v1, Lio/sentry/q3;->x:Ljava/util/concurrent/ConcurrentHashMap;

    .line 132
    invoke-static {v1}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    if-eqz v1, :cond_c

    .line 133
    iput-object v1, v0, Lio/sentry/q3;->x:Ljava/util/concurrent/ConcurrentHashMap;

    .line 134
    :cond_c
    invoke-virtual {p0, v0, v3}, Lio/sentry/protocol/c;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 135
    :cond_d
    const-string v2, "response"

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    instance-of v2, v1, Lio/sentry/protocol/r;

    if-eqz v2, :cond_e

    .line 136
    new-instance v0, Lio/sentry/protocol/r;

    check-cast v1, Lio/sentry/protocol/r;

    invoke-direct {v0, v1}, Lio/sentry/protocol/r;-><init>(Lio/sentry/protocol/r;)V

    invoke-virtual {p0, v0}, Lio/sentry/protocol/c;->s(Lio/sentry/protocol/r;)V

    goto/16 :goto_0

    .line 137
    :cond_e
    const-string v2, "spring"

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    instance-of v2, v1, Lio/sentry/protocol/e0;

    if-eqz v2, :cond_f

    .line 138
    new-instance v0, Lio/sentry/protocol/e0;

    check-cast v1, Lio/sentry/protocol/e0;

    invoke-direct {v0, v1}, Lio/sentry/protocol/e0;-><init>(Lio/sentry/protocol/e0;)V

    invoke-virtual {p0, v0}, Lio/sentry/protocol/c;->u(Lio/sentry/protocol/e0;)V

    goto/16 :goto_0

    .line 139
    :cond_f
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v1, v0}, Lio/sentry/protocol/c;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_10
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/c;->w:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public b()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lio/sentry/protocol/c;->w:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/c;->w:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d()Lio/sentry/protocol/a;
    .locals 2

    const-string v0, "app"

    const-class v1, Lio/sentry/protocol/a;

    invoke-virtual {p0, v1, v0}, Lio/sentry/protocol/c;->w(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/protocol/a;

    return-object v0
.end method

.method public e()Lio/sentry/protocol/f;
    .locals 2

    const-string v0, "device"

    const-class v1, Lio/sentry/protocol/f;

    invoke-virtual {p0, v1, v0}, Lio/sentry/protocol/c;->w(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/protocol/f;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_0

    instance-of v0, p1, Lio/sentry/protocol/c;

    if-eqz v0, :cond_0

    check-cast p1, Lio/sentry/protocol/c;

    iget-object v0, p0, Lio/sentry/protocol/c;->w:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object p1, p1, Lio/sentry/protocol/c;->w:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public f()Lio/sentry/protocol/i;
    .locals 2

    const-string v0, "flags"

    const-class v1, Lio/sentry/protocol/i;

    invoke-virtual {p0, v1, v0}, Lio/sentry/protocol/c;->w(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/protocol/i;

    return-object v0
.end method

.method public g()Lio/sentry/protocol/p;
    .locals 2

    const-string v0, "os"

    const-class v1, Lio/sentry/protocol/p;

    invoke-virtual {p0, v1, v0}, Lio/sentry/protocol/c;->w(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/protocol/p;

    return-object v0
.end method

.method public h()Lio/sentry/protocol/x;
    .locals 2

    const-string v0, "runtime"

    const-class v1, Lio/sentry/protocol/x;

    invoke-virtual {p0, v1, v0}, Lio/sentry/protocol/c;->w(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/protocol/x;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lio/sentry/protocol/c;->w:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Lio/sentry/e7;
    .locals 2

    const-string v0, "trace"

    const-class v1, Lio/sentry/e7;

    invoke-virtual {p0, v1, v0}, Lio/sentry/protocol/c;->w(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/e7;

    return-object v0
.end method

.method public j()Ljava/util/Enumeration;
    .locals 1

    iget-object v0, p0, Lio/sentry/protocol/c;->w:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keys()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

.method public k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/c;->w:Ljava/util/concurrent/ConcurrentHashMap;

    if-nez p1, :cond_1

    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v0, p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public l(Lio/sentry/protocol/c;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/c;->w:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object p1, p1, Lio/sentry/protocol/c;->w:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public m(Lio/sentry/protocol/a;)V
    .locals 1

    const-string v0, "app"

    invoke-virtual {p0, p1, v0}, Lio/sentry/protocol/c;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-void
.end method

.method public n(Lio/sentry/protocol/b;)V
    .locals 1

    const-string v0, "browser"

    invoke-virtual {p0, p1, v0}, Lio/sentry/protocol/c;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-void
.end method

.method public o(Lio/sentry/protocol/f;)V
    .locals 1

    const-string v0, "device"

    invoke-virtual {p0, p1, v0}, Lio/sentry/protocol/c;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-void
.end method

.method public p(Lio/sentry/protocol/i;)V
    .locals 1

    const-string v0, "flags"

    invoke-virtual {p0, p1, v0}, Lio/sentry/protocol/c;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-void
.end method

.method public q(Lio/sentry/protocol/l;)V
    .locals 1

    const-string v0, "gpu"

    invoke-virtual {p0, p1, v0}, Lio/sentry/protocol/c;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-void
.end method

.method public r(Lio/sentry/protocol/p;)V
    .locals 1

    const-string v0, "os"

    invoke-virtual {p0, p1, v0}, Lio/sentry/protocol/c;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-void
.end method

.method public s(Lio/sentry/protocol/r;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/protocol/c;->x:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    const-string v1, "response"

    invoke-virtual {p0, p1, v1}, Lio/sentry/protocol/c;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
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

.method public serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    invoke-virtual {p0}, Lio/sentry/protocol/c;->j()Ljava/util/Enumeration;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Lio/sentry/protocol/c;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, p2, v2}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method

.method public t(Lio/sentry/protocol/x;)V
    .locals 1

    const-string v0, "runtime"

    invoke-virtual {p0, p1, v0}, Lio/sentry/protocol/c;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-void
.end method

.method public u(Lio/sentry/protocol/e0;)V
    .locals 1

    const-string v0, "spring"

    invoke-virtual {p0, p1, v0}, Lio/sentry/protocol/c;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-void
.end method

.method public v(Lio/sentry/e7;)V
    .locals 1

    const-string v0, "traceContext is required"

    invoke-static {p1, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trace"

    invoke-virtual {p0, p1, v0}, Lio/sentry/protocol/c;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-void
.end method

.method public final w(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p2}, Lio/sentry/protocol/c;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
