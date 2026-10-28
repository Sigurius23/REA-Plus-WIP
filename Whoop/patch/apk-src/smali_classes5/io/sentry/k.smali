.class public final Lio/sentry/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b1;


# instance fields
.field public final a:Lio/sentry/b1;

.field public final b:Lio/sentry/b1;

.field public final c:Lio/sentry/b1;


# direct methods
.method public constructor <init>(Lio/sentry/b1;Lio/sentry/b1;Lio/sentry/b1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    iput-object p2, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    iput-object p3, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    return-void
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->A()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->A()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->A()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final B(Lio/sentry/n1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/b1;->B(Lio/sentry/n1;)V

    return-void
.end method

.method public final C()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->C()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->C()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->C()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final D()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->D()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->D()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->D()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final E()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/b1;->E()V

    return-void
.end method

.method public final F()Lio/sentry/featureflags/b;
    .locals 8

    iget-object v0, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->l()Lio/sentry/q6;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v1}, Lio/sentry/b1;->F()Lio/sentry/featureflags/b;

    move-result-object v1

    iget-object v2, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    invoke-interface {v2}, Lio/sentry/b1;->F()Lio/sentry/featureflags/b;

    move-result-object v2

    iget-object v3, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    invoke-interface {v3}, Lio/sentry/b1;->F()Lio/sentry/featureflags/b;

    move-result-object v3

    sget-object v4, Lio/sentry/featureflags/c;->w:Lio/sentry/featureflags/c;

    invoke-virtual {v0}, Lio/sentry/q6;->getMaxFeatureFlags()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_9

    :cond_0
    instance-of v5, v1, Lio/sentry/featureflags/a;

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    check-cast v1, Lio/sentry/featureflags/a;

    goto :goto_0

    :cond_1
    move-object v1, v6

    :goto_0
    instance-of v5, v2, Lio/sentry/featureflags/a;

    if-eqz v5, :cond_2

    check-cast v2, Lio/sentry/featureflags/a;

    goto :goto_1

    :cond_2
    move-object v2, v6

    :goto_1
    instance-of v5, v3, Lio/sentry/featureflags/a;

    if-eqz v5, :cond_3

    check-cast v3, Lio/sentry/featureflags/a;

    goto :goto_2

    :cond_3
    move-object v3, v6

    :goto_2
    if-nez v1, :cond_4

    move-object v1, v6

    goto :goto_3

    :cond_4
    iget-object v1, v1, Lio/sentry/featureflags/a;->w:Ljava/util/concurrent/CopyOnWriteArrayList;

    :goto_3
    if-nez v2, :cond_5

    move-object v2, v6

    goto :goto_4

    :cond_5
    iget-object v2, v2, Lio/sentry/featureflags/a;->w:Ljava/util/concurrent/CopyOnWriteArrayList;

    :goto_4
    if-nez v3, :cond_6

    goto :goto_5

    :cond_6
    iget-object v6, v3, Lio/sentry/featureflags/a;->w:Ljava/util/concurrent/CopyOnWriteArrayList;

    :goto_5
    const/4 v3, 0x0

    if-nez v1, :cond_7

    move v5, v3

    goto :goto_6

    :cond_7
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v5

    :goto_6
    if-nez v2, :cond_8

    move v7, v3

    goto :goto_7

    :cond_8
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v7

    :goto_7
    if-nez v6, :cond_9

    goto :goto_8

    :cond_9
    invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v3

    :goto_8
    if-nez v5, :cond_a

    if-nez v7, :cond_a

    if-nez v3, :cond_a

    :goto_9
    return-object v4

    :cond_a
    add-int/lit8 v5, v5, -0x1

    add-int/lit8 v7, v7, -0x1

    add-int/lit8 v3, v3, -0x1

    if-eqz v1, :cond_c

    if-gez v5, :cond_b

    goto :goto_a

    :cond_b
    invoke-virtual {v1, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lr;->t(Ljava/lang/Object;)V

    :cond_c
    :goto_a
    if-eqz v2, :cond_e

    if-gez v7, :cond_d

    goto :goto_b

    :cond_d
    invoke-virtual {v2, v7}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lr;->t(Ljava/lang/Object;)V

    :cond_e
    :goto_b
    if-eqz v6, :cond_10

    if-gez v3, :cond_f

    goto :goto_c

    :cond_f
    invoke-virtual {v6, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lr;->t(Ljava/lang/Object;)V

    :cond_10
    :goto_c
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Map;->size()I

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    new-instance v1, Lio/sentry/featureflags/a;

    new-instance v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v2, v1, Lio/sentry/featureflags/a;->w:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object v1
.end method

.method public final G()La3/p;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/b1;->G()La3/p;

    move-result-object v0

    return-object v0
.end method

.method public final H(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/b1;->H(Ljava/lang/String;)V

    return-void
.end method

.method public final I()Lio/sentry/g1;
    .locals 2

    iget-object v0, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->I()Lio/sentry/g1;

    move-result-object v0

    instance-of v1, v0, Lio/sentry/a3;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->I()Lio/sentry/g1;

    move-result-object v0

    instance-of v1, v0, Lio/sentry/a3;

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->I()Lio/sentry/g1;

    move-result-object v0

    return-object v0
.end method

.method public final J(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/sentry/b1;->J(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final K()Ljava/util/List;
    .locals 2

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iget-object v1, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v1}, Lio/sentry/b1;->K()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    invoke-interface {v1}, Lio/sentry/b1;->K()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    invoke-interface {v1}, Lio/sentry/b1;->K()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public final L(Lio/sentry/e5;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v0, p1}, Lio/sentry/b1;->L(Lio/sentry/e5;)V

    return-void
.end method

.method public final M(Lio/sentry/z3;)La3/p;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/b1;->M(Lio/sentry/z3;)La3/p;

    move-result-object p1

    return-object p1
.end method

.method public final N(Lio/sentry/b4;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/b1;->N(Lio/sentry/b4;)V

    return-void
.end method

.method public final O(Lio/sentry/protocol/v;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v0, p1}, Lio/sentry/b1;->O(Lio/sentry/protocol/v;)V

    iget-object v0, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    invoke-interface {v0, p1}, Lio/sentry/b1;->O(Lio/sentry/protocol/v;)V

    iget-object v0, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    invoke-interface {v0, p1}, Lio/sentry/b1;->O(Lio/sentry/protocol/v;)V

    return-void
.end method

.method public final P()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Lio/sentry/k;->y()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-static {v0}, Le93/b;->j0(Ljava/util/concurrent/CopyOnWriteArrayList;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final a()Ljava/util/Map;
    .locals 2

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iget-object v1, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v1}, Lio/sentry/b1;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    iget-object v1, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    invoke-interface {v1}, Lio/sentry/b1;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    iget-object v1, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    invoke-interface {v1}, Lio/sentry/b1;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/b1;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/sentry/b1;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/b1;->clear()V

    return-void
.end method

.method public final clone()Lio/sentry/b1;
    .locals 4

    .line 2
    new-instance v0, Lio/sentry/k;

    iget-object v1, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    invoke-interface {v1}, Lio/sentry/b1;->clone()Lio/sentry/b1;

    move-result-object v1

    iget-object v2, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    invoke-interface {v2}, Lio/sentry/b1;->clone()Lio/sentry/b1;

    move-result-object v2

    iget-object v3, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/k;-><init>(Lio/sentry/b1;Lio/sentry/b1;Lio/sentry/b1;)V

    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/k;->clone()Lio/sentry/b1;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lio/sentry/protocol/q;
    .locals 1

    iget-object v0, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->d()Lio/sentry/protocol/q;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->d()Lio/sentry/protocol/q;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->d()Lio/sentry/protocol/q;

    move-result-object v0

    return-object v0
.end method

.method public final e(Lio/sentry/protocol/h0;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/b1;->e(Lio/sentry/protocol/h0;)V

    return-void
.end method

.method public final f()Lio/sentry/l1;
    .locals 1

    iget-object v0, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->f()Lio/sentry/l1;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->f()Lio/sentry/l1;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->f()Lio/sentry/l1;

    move-result-object v0

    return-object v0
.end method

.method public final g(Lio/sentry/g4;)Lio/sentry/b1;
    .locals 7

    iget-object v0, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    iget-object v4, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    iget-object v5, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    if-eqz p1, :cond_4

    sget-object v6, Lio/sentry/j;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v6, p1

    if-eq p1, v3, :cond_3

    if-eq p1, v2, :cond_2

    if-eq p1, v1, :cond_1

    const/4 v6, 0x4

    if-eq p1, v6, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    return-object v5

    :cond_2
    return-object v0

    :cond_3
    return-object v4

    :cond_4
    :goto_0
    sget-object p1, Lio/sentry/j;->a:[I

    invoke-interface {v5}, Lio/sentry/b1;->l()Lio/sentry/q6;

    move-result-object v6

    invoke-virtual {v6}, Lio/sentry/q6;->getDefaultScopeType()Lio/sentry/g4;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget p1, p1, v6

    if-eq p1, v3, :cond_7

    if-eq p1, v2, :cond_6

    if-eq p1, v1, :cond_5

    return-object v4

    :cond_5
    return-object v5

    :cond_6
    return-object v0

    :cond_7
    return-object v4
.end method

.method public final getExtras()Ljava/util/Map;
    .locals 2

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iget-object v1, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v1}, Lio/sentry/b1;->getExtras()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    iget-object v1, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    invoke-interface {v1}, Lio/sentry/b1;->getExtras()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    iget-object v1, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    invoke-interface {v1}, Lio/sentry/b1;->getExtras()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    return-object v0
.end method

.method public final getLevel()Lio/sentry/n5;
    .locals 1

    iget-object v0, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->getLevel()Lio/sentry/n5;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->getLevel()Lio/sentry/n5;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->getLevel()Lio/sentry/n5;

    move-result-object v0

    return-object v0
.end method

.method public final getUser()Lio/sentry/protocol/h0;
    .locals 1

    iget-object v0, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->getUser()Lio/sentry/protocol/h0;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->getUser()Lio/sentry/protocol/h0;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->getUser()Lio/sentry/protocol/h0;

    move-result-object v0

    return-object v0
.end method

.method public final i(Lio/sentry/e;Lio/sentry/g0;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/sentry/b1;->i(Lio/sentry/e;Lio/sentry/g0;)V

    return-void
.end method

.method public final l()Lio/sentry/q6;
    .locals 1

    iget-object v0, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->l()Lio/sentry/q6;

    move-result-object v0

    return-object v0
.end method

.method public final m()Lio/sentry/n1;
    .locals 1

    iget-object v0, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->m()Lio/sentry/n1;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->m()Lio/sentry/n1;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->m()Lio/sentry/n1;

    move-result-object v0

    return-object v0
.end method

.method public final o()Lio/sentry/b7;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/b1;->o()Lio/sentry/b7;

    move-result-object v0

    return-object v0
.end method

.method public final p(Ljava/lang/Throwable;Lio/sentry/d7;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v0, p1, p2, p3}, Lio/sentry/b1;->p(Ljava/lang/Throwable;Lio/sentry/d7;Ljava/lang/String;)V

    return-void
.end method

.method public final q()Lio/sentry/b7;
    .locals 1

    iget-object v0, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->q()Lio/sentry/b7;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->q()Lio/sentry/b7;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->q()Lio/sentry/b7;

    move-result-object v0

    return-object v0
.end method

.method public final r()Lio/sentry/protocol/i;
    .locals 1

    invoke-virtual {p0}, Lio/sentry/k;->F()Lio/sentry/featureflags/b;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/featureflags/b;->r()Lio/sentry/protocol/i;

    move-result-object v0

    return-object v0
.end method

.method public final s()Lio/sentry/protocol/v;
    .locals 3

    iget-object v0, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->s()Lio/sentry/protocol/v;

    move-result-object v0

    sget-object v1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    invoke-virtual {v1, v0}, Lio/sentry/protocol/v;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->s()Lio/sentry/protocol/v;

    move-result-object v0

    invoke-virtual {v1, v0}, Lio/sentry/protocol/v;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v0}, Lio/sentry/b1;->s()Lio/sentry/protocol/v;

    move-result-object v0

    return-object v0
.end method

.method public final t(Lio/sentry/protocol/v;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/b1;->t(Lio/sentry/protocol/v;)V

    return-void
.end method

.method public final u()Lwe/o;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/b1;->u()Lwe/o;

    move-result-object v0

    return-object v0
.end method

.method public final v()Ljava/util/Queue;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v1}, Lio/sentry/b1;->v()Ljava/util/Queue;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    invoke-interface {v1}, Lio/sentry/b1;->v()Ljava/util/Queue;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    invoke-interface {v1}, Lio/sentry/b1;->v()Ljava/util/Queue;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-interface {v1}, Lio/sentry/b1;->l()Lio/sentry/q6;

    move-result-object v1

    invoke-virtual {v1}, Lio/sentry/q6;->getMaxBreadcrumbs()I

    move-result v1

    invoke-static {v1}, Lio/sentry/c4;->g(I)Ljava/util/Queue;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    return-object v1
.end method

.method public final w(Lio/sentry/a4;)Lio/sentry/b7;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/b1;->w(Lio/sentry/a4;)Lio/sentry/b7;

    move-result-object p1

    return-object p1
.end method

.method public final x(La3/p;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/k;->g(Lio/sentry/g4;)Lio/sentry/b1;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/b1;->x(La3/p;)V

    return-void
.end method

.method public final y()Ljava/util/List;
    .locals 2

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iget-object v1, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v1}, Lio/sentry/b1;->y()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    invoke-interface {v1}, Lio/sentry/b1;->y()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    invoke-interface {v1}, Lio/sentry/b1;->y()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-object v0
.end method

.method public final z()Lio/sentry/protocol/c;
    .locals 5

    new-instance v0, Lio/sentry/i;

    iget-object v1, p0, Lio/sentry/k;->a:Lio/sentry/b1;

    invoke-interface {v1}, Lio/sentry/b1;->z()Lio/sentry/protocol/c;

    move-result-object v2

    iget-object v3, p0, Lio/sentry/k;->b:Lio/sentry/b1;

    invoke-interface {v3}, Lio/sentry/b1;->z()Lio/sentry/protocol/c;

    move-result-object v3

    iget-object v4, p0, Lio/sentry/k;->c:Lio/sentry/b1;

    invoke-interface {v4}, Lio/sentry/b1;->z()Lio/sentry/protocol/c;

    move-result-object v4

    invoke-interface {v1}, Lio/sentry/b1;->l()Lio/sentry/q6;

    move-result-object v1

    invoke-virtual {v1}, Lio/sentry/q6;->getDefaultScopeType()Lio/sentry/g4;

    move-result-object v1

    invoke-direct {v0, v2, v3, v4, v1}, Lio/sentry/i;-><init>(Lio/sentry/protocol/c;Lio/sentry/protocol/c;Lio/sentry/protocol/c;Lio/sentry/g4;)V

    return-object v0
.end method
