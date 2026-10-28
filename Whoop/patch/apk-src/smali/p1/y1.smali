.class public final Lp1/y1;
.super Lp1/t;
.source "SourceFile"


# static fields
.field public static final A:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final z:Lec3/h2;


# instance fields
.field public a:J

.field public final b:Lp1/e;

.field public final c:Ljava/lang/Object;

.field public d:Lbc3/k1;

.field public e:Ljava/lang/Throwable;

.field public final f:Ljava/util/ArrayList;

.field public g:Ljava/lang/Object;

.field public h:La0/w0;

.field public final i:Lr1/c;

.field public final j:Ljava/util/ArrayList;

.field public final k:Ljava/util/ArrayList;

.field public final l:La0/v0;

.field public final m:Lcom/google/crypto/tink/internal/l0;

.field public final n:La0/v0;

.field public final o:La0/v0;

.field public p:Ljava/util/ArrayList;

.field public q:Ljava/util/LinkedHashSet;

.field public r:Lbc3/m;

.field public s:Lad3/z;

.field public t:Z

.field public final u:Lec3/h2;

.field public final v:Ls/m2;

.field public final w:Lbc3/l1;

.field public final x:Lq83/j;

.field public final y:Lp1/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lv1/b;->z:Lv1/b;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    sput-object v0, Lp1/y1;->z:Lec3/h2;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lp1/y1;->A:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>(Lq83/j;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp1/e;

    new-instance v1, Lm83/p;

    const/16 v2, 0x8

    invoke-direct {v1, p0, v2}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v1}, Lp1/e;-><init>(Lc93/a;)V

    iput-object v0, p0, Lp1/y1;->b:Lp1/e;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lp1/y1;->c:Ljava/lang/Object;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lp1/y1;->f:Ljava/util/ArrayList;

    new-instance v1, La0/w0;

    invoke-direct {v1}, La0/w0;-><init>()V

    iput-object v1, p0, Lp1/y1;->h:La0/w0;

    new-instance v1, Lr1/c;

    const/16 v2, 0x10

    new-array v2, v2, [Lp1/w;

    invoke-direct {v1, v2}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object v1, p0, Lp1/y1;->i:Lr1/c;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lp1/y1;->j:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lp1/y1;->k:Ljava/util/ArrayList;

    new-instance v1, La0/v0;

    invoke-direct {v1}, La0/v0;-><init>()V

    iput-object v1, p0, Lp1/y1;->l:La0/v0;

    new-instance v1, Lcom/google/crypto/tink/internal/l0;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, Lcom/google/crypto/tink/internal/l0;-><init>(I)V

    iput-object v1, p0, Lp1/y1;->m:Lcom/google/crypto/tink/internal/l0;

    new-instance v1, La0/v0;

    invoke-direct {v1}, La0/v0;-><init>()V

    iput-object v1, p0, Lp1/y1;->n:La0/v0;

    new-instance v1, La0/v0;

    invoke-direct {v1}, La0/v0;-><init>()V

    iput-object v1, p0, Lp1/y1;->o:La0/v0;

    sget-object v1, Lp1/w1;->y:Lp1/w1;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, p0, Lp1/y1;->u:Lec3/h2;

    new-instance v1, Ls/m2;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Ls/m2;-><init>(I)V

    iput-object v1, p0, Lp1/y1;->v:Ls/m2;

    sget-object v1, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p1, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v1

    check-cast v1, Lbc3/k1;

    new-instance v2, Lbc3/l1;

    invoke-direct {v2, v1}, Lbc3/l1;-><init>(Lbc3/k1;)V

    new-instance v1, La6/i;

    const/16 v3, 0x1a

    invoke-direct {v1, p0, v3}, La6/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v1}, Lbc3/t1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    iput-object v2, p0, Lp1/y1;->w:Lbc3/l1;

    invoke-interface {p1, v0}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    invoke-interface {p1, v2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    iput-object p1, p0, Lp1/y1;->x:Lq83/j;

    new-instance p1, Lp1/v0;

    const/16 v0, 0x8

    invoke-direct {p1, v0}, Lp1/v0;-><init>(I)V

    iput-object p1, p0, Lp1/y1;->y:Lp1/v0;

    return-void
.end method

.method public static final B(Ljava/util/ArrayList;Lp1/y1;Lp1/w;)V
    .locals 3

    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p1, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object p1, p1, Lp1/y1;->k:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp1/y0;

    invoke-virtual {v1}, Lp1/y0;->b()Lp1/w;

    move-result-object v2

    invoke-static {v2, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p0
.end method

.method public static u(Lz1/b;)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lz1/b;->w()Lz1/q;

    move-result-object v0

    instance-of v0, v0, Lz1/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lz1/b;->c()V

    return-void

    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lz1/b;->c()V

    throw v0
.end method


# virtual methods
.method public final A(Lp1/w;)V
    .locals 5

    iget-object v0, p0, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lp1/y1;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp1/y0;

    invoke-virtual {v4}, Lp1/y0;->b()Lp1/w;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_1

    monitor-exit v0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, p0, p1}, Lp1/y1;->B(Ljava/util/ArrayList;Lp1/y1;Lp1/w;)V

    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lp1/y1;->C(Ljava/util/List;La0/w0;)Ljava/util/List;

    invoke-static {v0, p0, p1}, Lp1/y1;->B(Ljava/util/ArrayList;Lp1/y1;Lp1/w;)V

    goto :goto_1

    :cond_0
    return-void

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw p1
.end method

.method public final C(Ljava/util/List;La0/w0;)Ljava/util/List;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    new-instance v2, Ljava/util/HashMap;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(I)V

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lp1/y0;

    invoke-virtual {v7}, Lp1/y0;->b()Lp1/w;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_0

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v8, Ljava/util/ArrayList;

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp1/w;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    iget-object v6, v5, Lp1/w;->V:Lp1/q;

    iget-boolean v6, v6, Lp1/q;->F:Z

    if-eqz v6, :cond_2

    const-string v6, "Check failed"

    invoke-static {v6}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_2
    new-instance v6, La6/i;

    const/16 v7, 0x19

    invoke-direct {v6, v5, v7}, La6/i;-><init>(Ljava/lang/Object;I)V

    new-instance v7, Lbp0/n;

    const/16 v8, 0x1c

    move-object/from16 v9, p2

    invoke-direct {v7, v8, v5, v9}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v8

    instance-of v10, v8, Lz1/b;

    const/4 v11, 0x0

    if-eqz v10, :cond_3

    check-cast v8, Lz1/b;

    goto :goto_2

    :cond_3
    move-object v8, v11

    :goto_2
    if-eqz v8, :cond_10

    invoke-virtual {v8, v6, v7}, Lz1/b;->C(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lz1/b;

    move-result-object v6

    if-eqz v6, :cond_10

    :try_start_0
    invoke-virtual {v6}, Lz1/f;->j()Lz1/f;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    iget-object v8, v1, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    new-instance v10, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v12

    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    move-object v12, v3

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12}, Ljava/util/Collection;->size()I

    move-result v12

    const/4 v13, 0x0

    :goto_3
    if-ge v13, v12, :cond_4

    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lp1/y0;

    iget-object v15, v1, Lp1/y1;->l:La0/v0;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v15}, Lr1/a;->b(La0/v0;)Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v16, v15

    check-cast v16, Lp1/y0;

    new-instance v4, Ll83/k;

    invoke-direct {v4, v14, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_d

    :cond_4
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_4
    if-ge v4, v3, :cond_8

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll83/k;

    iget-object v13, v12, Ll83/k;->x:Ljava/lang/Object;

    if-nez v13, :cond_7

    iget-object v13, v1, Lp1/y1;->m:Lcom/google/crypto/tink/internal/l0;

    iget-object v12, v12, Ll83/k;->w:Ljava/lang/Object;

    check-cast v12, Lp1/y0;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v12, v13, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v12, La0/v0;

    invoke-virtual {v12, v11}, La0/v0;->b(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v10, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll83/k;

    iget-object v11, v10, Ll83/k;->x:Ljava/lang/Object;

    if-nez v11, :cond_5

    iget-object v11, v1, Lp1/y1;->m:Lcom/google/crypto/tink/internal/l0;

    iget-object v12, v10, Ll83/k;->w:Ljava/lang/Object;

    check-cast v12, Lp1/y0;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v12, v11, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v12, La0/v0;

    invoke-static {v12}, Lr1/a;->b(La0/v0;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lp1/d1;

    invoke-virtual {v12}, La0/v0;->i()Z

    move-result v12

    if-eqz v12, :cond_5

    iget-object v11, v11, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v11, La0/v0;

    invoke-virtual {v11}, La0/v0;->a()V

    :cond_5
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_5

    :cond_6
    move-object v10, v3

    goto :goto_6

    :cond_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_8
    :goto_6
    :try_start_3
    monitor-exit v8

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_7
    if-ge v4, v3, :cond_f

    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll83/k;

    iget-object v8, v8, Ll83/k;->x:Ljava/lang/Object;

    if-nez v8, :cond_9

    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :cond_9
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_8
    if-ge v4, v3, :cond_f

    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll83/k;

    iget-object v8, v8, Ll83/k;->x:Ljava/lang/Object;

    if-eqz v8, :cond_a

    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    :cond_a
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v8, 0x0

    :goto_9
    if-ge v8, v4, :cond_c

    invoke-interface {v10, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll83/k;

    iget-object v12, v11, Ll83/k;->x:Ljava/lang/Object;

    if-nez v12, :cond_b

    iget-object v11, v11, Ll83/k;->w:Ljava/lang/Object;

    check-cast v11, Lp1/y0;

    goto :goto_a

    :catchall_1
    move-exception v0

    goto :goto_e

    :cond_b
    :goto_a
    add-int/lit8 v8, v8, 0x1

    goto :goto_9

    :cond_c
    iget-object v4, v1, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    iget-object v8, v1, Lp1/y1;->k:Ljava/util/ArrayList;

    invoke-static {v8, v3}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    monitor-exit v4

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v8, 0x0

    :goto_b
    if-ge v8, v4, :cond_e

    invoke-interface {v10, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Ll83/k;

    iget-object v12, v12, Ll83/k;->x:Ljava/lang/Object;

    if-eqz v12, :cond_d

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_d
    add-int/lit8 v8, v8, 0x1

    goto :goto_b

    :cond_e
    move-object v10, v3

    goto :goto_c

    :catchall_2
    move-exception v0

    monitor-exit v4

    throw v0

    :cond_f
    :goto_c
    invoke-virtual {v5, v10}, Lp1/w;->q(Ljava/util/ArrayList;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    invoke-static {v7}, Lz1/f;->q(Lz1/f;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    invoke-static {v6}, Lp1/y1;->u(Lz1/b;)V

    goto/16 :goto_1

    :catchall_3
    move-exception v0

    goto :goto_f

    :goto_d
    :try_start_7
    monitor-exit v8

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :goto_e
    :try_start_8
    invoke-static {v7}, Lz1/f;->q(Lz1/f;)V

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :goto_f
    invoke-static {v6}, Lp1/y1;->u(Lz1/b;)V

    throw v0

    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Cannot create a mutable snapshot of an read-only snapshot"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final D(Lp1/w;La0/w0;)Lp1/w;
    .locals 6

    iget-object v0, p1, Lp1/w;->V:Lp1/q;

    iget-boolean v0, v0, Lp1/q;->F:Z

    const/4 v1, 0x0

    if-nez v0, :cond_6

    iget v0, p1, Lp1/w;->W:I

    const/4 v2, 0x3

    if-ne v0, v2, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lp1/y1;->q:Ljava/util/LinkedHashSet;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-ne v0, v2, :cond_1

    goto/16 :goto_4

    :cond_1
    new-instance v0, La6/i;

    const/16 v3, 0x19

    invoke-direct {v0, p1, v3}, La6/i;-><init>(Ljava/lang/Object;I)V

    new-instance v3, Lbp0/n;

    const/16 v4, 0x1c

    invoke-direct {v3, v4, p1, p2}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v4

    instance-of v5, v4, Lz1/b;

    if-eqz v5, :cond_2

    check-cast v4, Lz1/b;

    goto :goto_0

    :cond_2
    move-object v4, v1

    :goto_0
    if-eqz v4, :cond_5

    invoke-virtual {v4, v0, v3}, Lz1/b;->C(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lz1/b;

    move-result-object v0

    if-eqz v0, :cond_5

    :try_start_0
    invoke-virtual {v0}, Lz1/f;->j()Lz1/f;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz p2, :cond_4

    :try_start_1
    invoke-virtual {p2}, La0/w0;->h()Z

    move-result v4

    if-ne v4, v2, :cond_4

    new-instance v4, Lk80/d;

    const/4 v5, 0x7

    invoke-direct {v4, v5, p2, p1}, Lk80/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, p1, Lp1/w;->V:Lp1/q;

    iget-boolean v5, p2, Lp1/q;->F:Z

    if-eqz v5, :cond_3

    const-string v5, "Preparing a composition while composing is not supported"

    invoke-static {v5}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_3
    iput-boolean v2, p2, Lp1/q;->F:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v2, 0x0

    :try_start_2
    invoke-virtual {v4}, Lk80/d;->invoke()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iput-boolean v2, p2, Lp1/q;->F:Z

    goto :goto_1

    :catchall_0
    move-exception p1

    iput-boolean v2, p2, Lp1/q;->F:Z

    throw p1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_4
    :goto_1
    invoke-virtual {p1}, Lp1/w;->w()Z

    move-result p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-static {v3}, Lz1/f;->q(Lz1/f;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    invoke-static {v0}, Lp1/y1;->u(Lz1/b;)V

    if-eqz p2, :cond_6

    return-object p1

    :catchall_2
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_5
    invoke-static {v3}, Lz1/f;->q(Lz1/f;)V

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :goto_3
    invoke-static {v0}, Lp1/y1;->u(Lz1/b;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot create a mutable snapshot of an read-only snapshot"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_4
    return-object v1
.end method

.method public final E(Ljava/lang/Throwable;Lp1/w;)V
    .locals 3

    sget-object v0, Lp1/y1;->A:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p1, Landroidx/compose/runtime/ComposeRuntimeError;

    if-nez v0, :cond_1

    iget-object v0, p0, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "Error was captured in composition while live edit was enabled."

    invoke-static {v1, p1}, Ls7/a;->k(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v1, p0, Lp1/y1;->j:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, Lp1/y1;->i:Lr1/c;

    invoke-virtual {v1}, Lr1/c;->g()V

    new-instance v1, La0/w0;

    invoke-direct {v1}, La0/w0;-><init>()V

    iput-object v1, p0, Lp1/y1;->h:La0/w0;

    iget-object v1, p0, Lp1/y1;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, Lp1/y1;->l:La0/v0;

    invoke-virtual {v1}, La0/v0;->a()V

    iget-object v1, p0, Lp1/y1;->n:La0/v0;

    invoke-virtual {v1}, La0/v0;->a()V

    new-instance v1, Lad3/z;

    const/16 v2, 0x19

    invoke-direct {v1, p1, v2}, Lad3/z;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Lp1/y1;->s:Lad3/z;

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Lp1/y1;->G(Lp1/w;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lp1/y1;->w()Lbc3/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1

    :cond_1
    iget-object p2, p0, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter p2

    :try_start_1
    iget-object v0, p0, Lp1/y1;->s:Lad3/z;

    if-nez v0, :cond_2

    new-instance v0, Lad3/z;

    const/16 v1, 0x19

    invoke-direct {v0, p1, v1}, Lad3/z;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lp1/y1;->s:Lad3/z;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p2

    throw p1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_2
    :try_start_2
    iget-object p1, v0, Lad3/z;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_2
    monitor-exit p2

    throw p1
.end method

.method public final F()Z
    .locals 8

    iget-object v0, p0, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lp1/y1;->h:La0/w0;

    invoke-virtual {v1}, La0/w0;->g()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    iget-object v1, p0, Lp1/y1;->i:Lr1/c;

    iget v1, v1, Lr1/c;->y:I

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lp1/y1;->x()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lp1/y1;->l:La0/v0;

    invoke-virtual {v1}, La0/v0;->j()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v2, v3

    :cond_2
    :goto_0
    monitor-exit v0

    return v2

    :cond_3
    :try_start_1
    invoke-virtual {p0}, Lp1/y1;->z()Ljava/util/List;

    move-result-object v1

    iget-object v4, p0, Lp1/y1;->h:La0/w0;

    new-instance v5, Lr1/e;

    invoke-direct {v5, v4}, Lr1/e;-><init>(La0/w0;)V

    new-instance v4, La0/w0;

    invoke-direct {v4}, La0/w0;-><init>()V

    iput-object v4, p0, Lp1/y1;->h:La0/w0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    monitor-exit v0

    :try_start_2
    move-object v0, v1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    move v4, v3

    :goto_1
    if-ge v4, v0, :cond_4

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lp1/w;

    invoke-virtual {v6, v5}, Lp1/w;->x(Lr1/e;)V

    iget-object v6, p0, Lp1/y1;->u:Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lp1/w1;

    sget-object v7, Lp1/w1;->x:Lp1/w1;

    invoke-virtual {v6, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-lez v6, :cond_4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-virtual {p0}, Lp1/y1;->w()Lbc3/k;

    move-result-object v1

    if-nez v1, :cond_8

    iget-object v1, p0, Lp1/y1;->i:Lr1/c;

    iget v1, v1, Lr1/c;->y:I

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lp1/y1;->x()Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, Lp1/y1;->l:La0/v0;

    invoke-virtual {v1}, La0/v0;->j()Z

    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v1, :cond_6

    goto :goto_2

    :cond_6
    move v2, v3

    :cond_7
    :goto_2
    monitor-exit v0

    return v2

    :cond_8
    :try_start_4
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "called outside of runRecomposeAndApplyChanges"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1

    :goto_3
    iget-object v1, p0, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_5
    iget-object v2, p0, Lp1/y1;->h:La0/w0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, La0/w0;->k(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_4

    :cond_9
    monitor-exit v1

    throw v0

    :catchall_2
    move-exception v0

    monitor-exit v1

    throw v0

    :catchall_3
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final G(Lp1/w;)V
    .locals 2

    iget-object v0, p0, Lp1/y1;->p:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lp1/y1;->p:Ljava/util/ArrayList;

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v0, p0, Lp1/y1;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    iput-object p1, p0, Lp1/y1;->g:Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public final H(Ls83/i;)Ljava/lang/Object;
    .locals 4

    new-instance v0, Lp1/x1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lp1/x1;-><init>(Lp1/y1;Lq83/d;)V

    invoke-interface {p1}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    invoke-static {v2}, Lp1/x;->v(Lq83/j;)Lp1/w0;

    move-result-object v2

    new-instance v3, Lbh/h;

    invoke-direct {v3, p0, v0, v2, v1}, Lbh/h;-><init>(Lp1/y1;Lp1/x1;Lp1/w0;Lq83/d;)V

    iget-object v0, p0, Lp1/y1;->b:Lp1/e;

    invoke-static {v0, v3, p1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    return-object v1
.end method

.method public final a(Lp1/w;Lc93/m;)V
    .locals 8

    iget-object v0, p1, Lp1/w;->V:Lp1/q;

    iget-boolean v0, v0, Lp1/q;->F:Z

    iget-object v1, p0, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lp1/y1;->u:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp1/w1;

    sget-object v3, Lp1/w1;->x:Lp1/w1;

    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    const/4 v4, 0x1

    if-lez v2, :cond_0

    invoke-virtual {p0}, Lp1/y1;->z()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    xor-int/2addr v4, v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_0
    :goto_0
    monitor-exit v1

    :try_start_1
    new-instance v1, La6/i;

    const/16 v2, 0x19

    invoke-direct {v1, p1, v2}, La6/i;-><init>(Ljava/lang/Object;I)V

    new-instance v2, Lbp0/n;

    const/16 v5, 0x1c

    const/4 v6, 0x0

    invoke-direct {v2, v5, p1, v6}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v5

    instance-of v7, v5, Lz1/b;

    if-eqz v7, :cond_1

    check-cast v5, Lz1/b;

    goto :goto_1

    :cond_1
    move-object v5, v6

    :goto_1
    if-eqz v5, :cond_5

    invoke-virtual {v5, v1, v2}, Lz1/b;->C(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lz1/b;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    if-eqz v1, :cond_5

    :try_start_2
    invoke-virtual {v1}, Lz1/f;->j()Lz1/f;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    :try_start_3
    invoke-virtual {p1, p2}, Lp1/w;->j(Lc93/m;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    :try_start_4
    invoke-static {v2}, Lz1/f;->q(Lz1/f;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    :try_start_5
    invoke-static {v1}, Lp1/y1;->u(Lz1/b;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    iget-object p2, p0, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter p2

    :try_start_6
    iget-object v1, p0, Lp1/y1;->u:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp1/w1;

    invoke-virtual {v1, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {p0}, Lp1/y1;->z()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lp1/y1;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object v6, p0, Lp1/y1;->g:Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_2
    monitor-exit p2

    if-nez v0, :cond_3

    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object p2

    invoke-virtual {p2}, Lz1/f;->m()V

    :cond_3
    :try_start_7
    invoke-virtual {p0, p1}, Lp1/y1;->A(Lp1/w;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :try_start_8
    invoke-virtual {p1}, Lp1/w;->d()V

    invoke-virtual {p1}, Lp1/w;->f()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    if-nez v0, :cond_4

    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object p1

    invoke-virtual {p1}, Lz1/f;->m()V

    :cond_4
    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {p0, p1, v6}, Lp1/y1;->E(Ljava/lang/Throwable;Lp1/w;)V

    return-void

    :catchall_3
    move-exception p2

    invoke-virtual {p0, p2, p1}, Lp1/y1;->E(Ljava/lang/Throwable;Lp1/w;)V

    return-void

    :goto_3
    monitor-exit p2

    throw p1

    :catchall_4
    move-exception p2

    goto :goto_5

    :catchall_5
    move-exception p2

    goto :goto_4

    :catchall_6
    move-exception p2

    :try_start_9
    invoke-static {v2}, Lz1/f;->q(Lz1/f;)V

    throw p2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    :goto_4
    :try_start_a
    invoke-static {v1}, Lp1/y1;->u(Lz1/b;)V

    throw p2

    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot create a mutable snapshot of an read-only snapshot"

    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :goto_5
    if-eqz v4, :cond_6

    iget-object v0, p0, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v0

    monitor-exit v0

    :cond_6
    invoke-virtual {p0, p2, p1}, Lp1/y1;->E(Ljava/lang/Throwable;Lp1/w;)V

    return-void

    :goto_6
    monitor-exit v1

    throw p1
.end method

.method public final b(Lp1/w;Lux/f0;Lc93/m;)La0/w0;
    .locals 3

    iget-object v0, p0, Lp1/y1;->v:Ls/m2;

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p1, Lp1/w;->P:Lux/f0;

    iput-object p2, p1, Lp1/w;->P:Lux/f0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p0, p1, p3}, Lp1/y1;->a(Lp1/w;Lc93/m;)V

    invoke-virtual {v0}, Ls/m2;->f()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, La0/w0;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, La0/e1;->a:La0/w0;

    const-string p3, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_0
    :try_start_2
    iput-object v2, p1, Lp1/w;->P:Lux/f0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v0, v1}, Ls/m2;->s(Ljava/lang/Object;)V

    return-object p2

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception p2

    :try_start_3
    iput-object v2, p1, Lp1/w;->P:Lux/f0;

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    invoke-virtual {v0, v1}, Ls/m2;->s(Ljava/lang/Object;)V

    throw p1
.end method

.method public final d()Z
    .locals 1

    sget-object v0, Lp1/y1;->A:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final g()J
    .locals 2

    const/16 v0, 0x3e8

    int-to-long v0, v0

    return-wide v0
.end method

.method public final h()Lp1/s;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final j()Lq83/j;
    .locals 1

    iget-object v0, p0, Lp1/y1;->x:Lq83/j;

    return-object v0
.end method

.method public final k(Lp1/w;)V
    .locals 2

    iget-object v0, p0, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lp1/y1;->i:Lr1/c;

    invoke-virtual {v1, p1}, Lr1/c;->h(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lp1/y1;->i:Lr1/c;

    invoke-virtual {v1, p1}, Lr1/c;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lp1/y1;->w()Lbc3/k;

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
    monitor-exit v0

    if-eqz p1, :cond_1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    check-cast p1, Lbc3/m;

    invoke-virtual {p1, v0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final l(Lp1/y0;)Lp1/x0;
    .locals 2

    iget-object v0, p0, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lp1/y1;->n:La0/v0;

    invoke-virtual {v1, p1}, La0/v0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/x0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final m(Lp1/w;Lux/f0;La0/w0;)La0/w0;
    .locals 3

    iget-object v0, p0, Lp1/y1;->v:Ls/m2;

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Lp1/y1;->F()Z

    new-instance v2, Lr1/e;

    invoke-direct {v2, p3}, Lr1/e;-><init>(La0/w0;)V

    invoke-virtual {p1, v2}, Lp1/w;->x(Lr1/e;)V

    iget-object p3, p1, Lp1/w;->P:Lux/f0;

    iput-object p2, p1, Lp1/w;->P:Lux/f0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0, p1, v1}, Lp1/y1;->D(Lp1/w;La0/w0;)Lp1/w;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lp1/y1;->A(Lp1/w;)V

    invoke-virtual {p2}, Lp1/w;->d()V

    invoke-virtual {p2}, Lp1/w;->f()V

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_0
    :goto_0
    invoke-virtual {v0}, Ls/m2;->f()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, La0/w0;

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    sget-object p2, La0/e1;->a:La0/w0;

    const-string v2, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    :try_start_2
    iput-object p3, p1, Lp1/w;->P:Lux/f0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v0, v1}, Ls/m2;->s(Ljava/lang/Object;)V

    return-object p2

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_3
    iput-object p3, p1, Lp1/w;->P:Lux/f0;

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_3
    invoke-virtual {v0, v1}, Ls/m2;->s(Ljava/lang/Object;)V

    throw p1
.end method

.method public final n(Ljava/util/Set;)V
    .locals 0

    return-void
.end method

.method public final p(Lp1/v1;)V
    .locals 2

    iget-object v0, p0, Lp1/y1;->v:Ls/m2;

    invoke-virtual {v0}, Ls/m2;->f()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La0/w0;

    if-nez v1, :cond_0

    sget-object v1, La0/e1;->a:La0/w0;

    new-instance v1, La0/w0;

    invoke-direct {v1}, La0/w0;-><init>()V

    invoke-virtual {v0, v1}, Ls/m2;->s(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {v1, p1}, La0/w0;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method public final q(Lp1/w;)V
    .locals 2

    iget-object v0, p0, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lp1/y1;->q:Ljava/util/LinkedHashSet;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v1, p0, Lp1/y1;->q:Ljava/util/LinkedHashSet;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final t(Lp1/w;)V
    .locals 2

    iget-object v0, p0, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lp1/y1;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lp1/y1;->g:Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Lp1/y1;->i:Lr1/c;

    invoke-virtual {v1, p1}, Lr1/c;->k(Ljava/lang/Object;)Z

    iget-object v1, p0, Lp1/y1;->j:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final v()V
    .locals 4

    iget-object v0, p0, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lp1/y1;->u:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp1/w1;

    sget-object v2, Lp1/w1;->E:Lp1/w1;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    const/4 v2, 0x0

    if-ltz v1, :cond_0

    iget-object v1, p0, Lp1/y1;->u:Lec3/h2;

    sget-object v3, Lp1/w1;->x:Lp1/w1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    iget-object v0, p0, Lp1/y1;->w:Lbc3/l1;

    invoke-virtual {v0, v2}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final w()Lbc3/k;
    .locals 6

    iget-object v0, p0, Lp1/y1;->u:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp1/w1;

    sget-object v2, Lp1/w1;->x:Lp1/w1;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    iget-object v2, p0, Lp1/y1;->k:Ljava/util/ArrayList;

    iget-object v3, p0, Lp1/y1;->j:Ljava/util/ArrayList;

    iget-object v4, p0, Lp1/y1;->i:Lr1/c;

    const/4 v5, 0x0

    if-gtz v1, :cond_2

    invoke-virtual {p0}, Lp1/y1;->z()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp1/w;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp1/y1;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-object v0, Lm83/y;->w:Lm83/y;

    iput-object v0, p0, Lp1/y1;->g:Ljava/lang/Object;

    new-instance v0, La0/w0;

    invoke-direct {v0}, La0/w0;-><init>()V

    iput-object v0, p0, Lp1/y1;->h:La0/w0;

    invoke-virtual {v4}, Lr1/c;->g()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    iput-object v5, p0, Lp1/y1;->p:Ljava/util/ArrayList;

    iget-object v0, p0, Lp1/y1;->r:Lbc3/m;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v5}, Lbc3/m;->cancel(Ljava/lang/Throwable;)Z

    :cond_1
    iput-object v5, p0, Lp1/y1;->r:Lbc3/m;

    iput-object v5, p0, Lp1/y1;->s:Lad3/z;

    return-object v5

    :cond_2
    iget-object v1, p0, Lp1/y1;->s:Lad3/z;

    if-eqz v1, :cond_3

    sget-object v1, Lp1/w1;->y:Lp1/w1;

    goto :goto_2

    :cond_3
    iget-object v1, p0, Lp1/y1;->d:Lbc3/k1;

    if-nez v1, :cond_5

    new-instance v1, La0/w0;

    invoke-direct {v1}, La0/w0;-><init>()V

    iput-object v1, p0, Lp1/y1;->h:La0/w0;

    invoke-virtual {v4}, Lr1/c;->g()V

    invoke-virtual {p0}, Lp1/y1;->x()Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v1, Lp1/w1;->z:Lp1/w1;

    goto :goto_2

    :cond_4
    sget-object v1, Lp1/w1;->y:Lp1/w1;

    goto :goto_2

    :cond_5
    iget v1, v4, Lr1/c;->y:I

    if-eqz v1, :cond_6

    goto :goto_1

    :cond_6
    iget-object v1, p0, Lp1/y1;->h:La0/w0;

    invoke-virtual {v1}, La0/w0;->h()Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {p0}, Lp1/y1;->x()Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v1, p0, Lp1/y1;->l:La0/v0;

    invoke-virtual {v1}, La0/v0;->j()Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_1

    :cond_7
    sget-object v1, Lp1/w1;->E:Lp1/w1;

    goto :goto_2

    :cond_8
    :goto_1
    sget-object v1, Lp1/w1;->F:Lp1/w1;

    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v5, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object v0, Lp1/w1;->F:Lp1/w1;

    if-ne v1, v0, :cond_9

    iget-object v0, p0, Lp1/y1;->r:Lbc3/m;

    iput-object v5, p0, Lp1/y1;->r:Lbc3/m;

    return-object v0

    :cond_9
    return-object v5
.end method

.method public final x()Z
    .locals 2

    iget-boolean v0, p0, Lp1/y1;->t:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lp1/y1;->b:Lp1/e;

    iget-object v0, v0, Lp1/e;->z:Lx1/a;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const v1, 0x7ffffff

    and-int/2addr v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final y()Z
    .locals 2

    iget-object v0, p0, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lp1/y1;->h:La0/w0;

    invoke-virtual {v1}, La0/w0;->h()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lp1/y1;->i:Lr1/c;

    iget v1, v1, Lr1/c;->y:I

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lp1/y1;->x()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_2
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :goto_2
    monitor-exit v0

    throw v1
.end method

.method public final z()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lp1/y1;->g:Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lp1/y1;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Lm83/y;->w:Lm83/y;

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object v0, v1

    :goto_0
    iput-object v0, p0, Lp1/y1;->g:Ljava/lang/Object;

    return-object v0
.end method
