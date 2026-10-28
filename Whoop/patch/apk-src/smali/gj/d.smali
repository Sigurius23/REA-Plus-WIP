.class public final Lgj/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lgj/g;

.field public final b:La3/p;

.field public final c:Lbc3/c0;

.field public final d:Lbc3/z;

.field public final e:Lbc3/z;

.field public final f:Lbc3/z;

.field public final g:Lgj/m;

.field public h:Lik/b;

.field public i:Lik/b;

.field public j:Lp0/n0;

.field public final k:Lfk/a;

.field public l:Lqk/c;

.field public final m:Lbc3/j0;

.field public final n:Lwe/o;

.field public o:Lgj/b;

.field public p:Lcom/iterable/iterableapi/e;


# direct methods
.method public constructor <init>(Lgj/g;La3/p;Lbc3/c0;Lbc3/z;Lbc3/z;Lbc3/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgj/d;->a:Lgj/g;

    iput-object p2, p0, Lgj/d;->b:La3/p;

    iput-object p3, p0, Lgj/d;->c:Lbc3/c0;

    iput-object p4, p0, Lgj/d;->d:Lbc3/z;

    iput-object p5, p0, Lgj/d;->e:Lbc3/z;

    iput-object p6, p0, Lgj/d;->f:Lbc3/z;

    new-instance p2, Lwe/o;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    new-instance p3, Ljava/util/LinkedHashSet;

    invoke-direct {p3}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {p3}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p3

    const-string p4, "synchronizedSet(mutableSetOf())"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p2, Lwe/o;->x:Ljava/lang/Object;

    iput-object p2, p0, Lgj/d;->n:Lwe/o;

    iget-object p2, p1, Lgj/g;->a:Ljava/lang/String;

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    iget p2, p1, Lgj/g;->c:I

    if-lez p2, :cond_0

    iget p2, p1, Lgj/g;->d:I

    if-lez p2, :cond_0

    new-instance p2, Lgj/m;

    invoke-direct {p2}, Lgj/m;-><init>()V

    iput-object p0, p2, Lwe/o;->x:Ljava/lang/Object;

    iput-object p2, p0, Lgj/d;->g:Lgj/m;

    iget-object p1, p1, Lgj/g;->g:Lbu/c;

    invoke-virtual {p1, p0}, Lbu/c;->E(Lgj/d;)Lfk/a;

    move-result-object p1

    iput-object p1, p0, Lgj/d;->k:Lfk/a;

    new-instance p1, Lcom/iterable/iterableapi/e;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lcom/iterable/iterableapi/e;-><init>(I)V

    iput-object p1, p0, Lgj/d;->p:Lcom/iterable/iterableapi/e;

    iget-object p1, p0, Lgj/d;->c:Lbc3/c0;

    iget-object p2, p0, Lgj/d;->d:Lbc3/z;

    sget-object p3, Lbc3/d0;->x:Lbc3/d0;

    new-instance p4, La6/c;

    const/4 p5, 0x0

    const/16 p6, 0x12

    invoke-direct {p4, p0, p0, p5, p6}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1, p2}, Lbc3/f0;->A(Lbc3/c0;Lq83/j;)Lq83/j;

    move-result-object p1

    new-instance p2, Lbc3/u1;

    invoke-direct {p2, p1, p4}, Lbc3/u1;-><init>(Lq83/j;Lc93/m;)V

    invoke-virtual {p2, p3, p2, p4}, Lbc3/a;->b0(Lbc3/d0;Lbc3/a;Lc93/m;)V

    iput-object p2, p0, Lgj/d;->m:Lbc3/j0;

    invoke-virtual {p2}, Lbc3/t1;->start()Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid configuration"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static b(Lgj/d;Lqk/b;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lgj/a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lgj/a;

    iget v1, v0, Lgj/a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lgj/a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lgj/a;

    invoke-direct {v0, p0, p2}, Lgj/a;-><init>(Lgj/d;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lgj/a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lgj/a;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lgj/a;->x:Lqk/b;

    iget-object p0, v0, Lgj/a;->w:Lgj/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lso/o;

    invoke-direct {p2, p0}, Lso/o;-><init>(Lgj/d;)V

    iput-object p0, v0, Lgj/a;->w:Lgj/d;

    iput-object p1, v0, Lgj/a;->x:Lqk/b;

    iput v3, v0, Lgj/a;->E:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget v4, p2, Lso/o;->a:I

    const/4 v5, 0x3

    if-ge v4, v5, :cond_3

    iget-object v4, p2, Lso/o;->d:Ljava/lang/Object;

    check-cast v4, Lfk/a;

    const-string v5, "Migrating storage to version 3"

    invoke-interface {v4, v5}, Lfk/a;->debug(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lso/o;->a(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    move-object v2, p2

    goto :goto_1

    :cond_3
    iget-object p2, p0, Lgj/d;->k:Lfk/a;

    const-string v0, "Storage already at version 3"

    invoke-interface {p2, v0}, Lfk/a;->debug(Ljava/lang/String;)V

    :cond_4
    :goto_1
    if-ne v2, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p2, "identityConfiguration"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lqk/c;->b:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    sget-object v0, Lqk/c;->c:Ljava/util/LinkedHashMap;

    iget-object v1, p1, Lqk/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_6

    new-instance v2, Lqk/c;

    invoke-direct {v2, p1}, Lqk/c;-><init>(Lqk/b;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :catchall_0
    move-exception p0

    goto/16 :goto_4

    :cond_6
    :goto_3
    check-cast v2, Lqk/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    iput-object v2, p0, Lgj/d;->l:Lqk/c;

    new-instance p1, Lnk/a;

    iget-object p2, p0, Lgj/d;->b:La3/p;

    invoke-direct {p1, p2}, Lnk/a;-><init>(La3/p;)V

    invoke-virtual {p0}, Lgj/d;->c()Lqk/c;

    move-result-object v0

    iget-object v0, v0, Lqk/c;->a:Lcd3/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lcd3/g;->E:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    iget-object v0, v0, Lcd3/g;->F:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v1

    invoke-virtual {p0}, Lgj/d;->c()Lqk/c;

    move-result-object p1

    iget-object p1, p1, Lqk/c;->a:Lcd3/g;

    iget-boolean p1, p1, Lcd3/g;->w:Z

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Lgj/d;->c()Lqk/c;

    move-result-object p1

    iget-object p1, p1, Lqk/c;->a:Lcd3/g;

    invoke-virtual {p1}, Lcd3/g;->y()Lqk/a;

    move-result-object p1

    const-string v0, "identity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateType"

    invoke-static {v3, v0}, Lih0/d0;->w(ILjava/lang/String;)V

    iget-object v0, p1, Lqk/a;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, La3/p;->W(Ljava/lang/String;)V

    iget-object p1, p1, Lqk/a;->b:Ljava/lang/String;

    invoke-virtual {p2, p1}, La3/p;->R(Ljava/lang/String;)V

    :cond_7
    iget-object p1, p0, Lgj/d;->a:Lgj/g;

    iget-object p1, p1, Lgj/g;->p:Ljava/lang/Boolean;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    new-instance p1, Lck/f;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Lgj/d;->a(Lkk/e;)V

    :cond_8
    new-instance p1, Lgj/b;

    invoke-direct {p1, p0}, Lgj/b;-><init>(Lgj/d;)V

    iput-object p1, p0, Lgj/d;->o:Lgj/b;

    invoke-virtual {p0, p1}, Lgj/d;->a(Lkk/e;)V

    new-instance p1, Lmk/b;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Lgj/d;->a(Lkk/e;)V

    new-instance p1, Lck/e;

    iget-object v0, p0, Lgj/d;->p:Lcom/iterable/iterableapi/e;

    if-eqz v0, :cond_9

    invoke-direct {p1, v0}, Lck/e;-><init>(Lcom/iterable/iterableapi/e;)V

    invoke-virtual {p0, p1}, Lgj/d;->a(Lkk/e;)V

    new-instance p1, Lck/a;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Lgj/d;->a(Lkk/e;)V

    new-instance p1, Lck/c;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lck/c;-><init>(I)V

    invoke-virtual {p0, p1}, Lgj/d;->a(Lkk/e;)V

    new-instance p1, Lmk/a;

    invoke-direct {p1}, Lmk/a;-><init>()V

    invoke-virtual {p0, p1}, Lgj/d;->a(Lkk/e;)V

    iget-object p0, p0, Lgj/d;->g:Lgj/m;

    const-string p1, "null cannot be cast to non-null type com.amplitude.android.Timeline"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwe/o;->G()Lgj/d;

    move-result-object p1

    iget-object p1, p1, Lgj/d;->c:Lbc3/c0;

    invoke-virtual {p0}, Lwe/o;->G()Lgj/d;

    move-result-object v0

    iget-object v0, v0, Lgj/d;->f:Lbc3/z;

    new-instance v1, La6/c;

    const/16 v2, 0x11

    invoke-direct {v1, p0, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 p0, 0x2

    invoke-static {p1, v0, p2, v1, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_9
    const-string p0, "activityLifecycleCallbacks"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw p2

    :catchall_1
    move-exception p0

    monitor-exit v1

    throw p0

    :goto_4
    monitor-exit p2

    throw p0
.end method

.method public static g(Lgj/d;Ljava/util/Map;)V
    .locals 7

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/google/crypto/tink/internal/l0;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/internal/l0;-><init>(I)V

    if-eqz p1, :cond_5

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v3, " in previous operation, ignoring operation $set"

    const-string v4, "property"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "Already used property "

    monitor-enter v0

    :try_start_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_1

    sget-object v1, Lhk/a;->a:Lhk/a;

    const-string v2, "Attempting to perform operation $set with a null or empty string property, ignoring"

    invoke-virtual {v1, v2}, Lhk/a;->warn(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :try_start_1
    iget-object v5, v0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v5, Ljava/util/LinkedHashMap;

    const-string v6, "$clearAll"

    invoke-interface {v5, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    sget-object v1, Lhk/a;->a:Lhk/a;

    const-string v2, "This Identify already contains a $clearAll operation, ignoring operation %s"

    invoke-virtual {v1, v2}, Lhk/a;->warn(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    goto :goto_0

    :cond_2
    :try_start_2
    iget-object v5, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v5, Ljava/util/LinkedHashSet;

    invoke-interface {v5, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    sget-object v2, Lhk/a;->a:Lhk/a;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lhk/a;->warn(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    goto :goto_0

    :cond_3
    :try_start_3
    iget-object v3, v0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/LinkedHashMap;

    const-string v4, "$set"

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, v0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/LinkedHashMap;

    const-string v4, "$set"

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget-object v3, v0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/LinkedHashMap;

    const-string v4, "$set"

    invoke-virtual {v3, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lkotlin/jvm/internal/m0;->c(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/LinkedHashSet;

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    goto/16 :goto_0

    :goto_1
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p0

    :cond_5
    new-instance p1, Ljk/b;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    monitor-enter v0

    :try_start_5
    iget-object v1, v0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashMap;

    invoke-static {v1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/util/Map;

    if-eqz v5, :cond_6

    check-cast v3, Ljava/util/Map;

    invoke-static {v3}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p0

    goto :goto_3

    :cond_7
    monitor-exit v0

    iput-object v1, p1, Ljk/a;->O:Ljava/util/LinkedHashMap;

    invoke-virtual {p0, p1}, Lgj/d;->h(Ljk/a;)V

    return-void

    :goto_3
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p0
.end method

.method public static j(Lgj/d;Ljava/lang/String;Ljava/util/Map;I)V
    .locals 1

    and-int/lit8 p3, p3, 0x2

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    move-object p2, v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p3, "eventType"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Ljk/a;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p1, p3, Ljk/a;->M:Ljava/lang/String;

    if-eqz p2, :cond_1

    invoke-static {p2}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    :cond_1
    iput-object v0, p3, Ljk/a;->N:Ljava/util/LinkedHashMap;

    invoke-virtual {p0, p3}, Lgj/d;->h(Ljk/a;)V

    return-void
.end method


# virtual methods
.method public final a(Lkk/e;)V
    .locals 2

    instance-of v0, p1, Lck/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lgj/d;->b:La3/p;

    check-cast p1, Lck/a;

    iget-object v1, v0, La3/p;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p1, p0}, Lck/a;->b(Lgj/d;)V

    iget-object v0, v0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_0
    iget-object v0, p0, Lgj/d;->g:Lgj/m;

    invoke-virtual {v0, p1}, Lwe/o;->f(Lkk/e;)V

    return-void
.end method

.method public final c()Lqk/c;
    .locals 1

    iget-object v0, p0, Lgj/d;->l:Lqk/c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "idContainer"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final d()Lik/b;
    .locals 1

    iget-object v0, p0, Lgj/d;->i:Lik/b;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "identifyInterceptStorage"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final e()Lp0/n0;
    .locals 1

    iget-object v0, p0, Lgj/d;->j:Lp0/n0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "identityStorage"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final f()Lik/b;
    .locals 1

    iget-object v0, p0, Lgj/d;->h:Lik/b;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "storage"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final h(Ljk/a;)V
    .locals 2

    iget-object v0, p1, Ljk/a;->c:Ljava/lang/Long;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p1, Ljk/a;->c:Ljava/lang/Long;

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Logged event with type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljk/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lgj/d;->k:Lfk/a;

    invoke-interface {v1, v0}, Lfk/a;->debug(Ljava/lang/String;)V

    iget-object v0, p0, Lgj/d;->g:Lgj/m;

    invoke-virtual {v0, p1}, Lgj/m;->N(Ljk/a;)V

    return-void
.end method

.method public final i(Ljava/lang/String;)V
    .locals 4

    new-instance v0, La6/c;

    const/16 v1, 0x13

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x2

    iget-object v1, p0, Lgj/d;->c:Lbc3/c0;

    iget-object v3, p0, Lgj/d;->d:Lbc3/z;

    invoke-static {v1, v3, v2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
