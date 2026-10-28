.class public final Lnf3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwf3/a;

.field public final b:Ls/m2;

.field public c:Lq83/g;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lwf3/a;

    invoke-direct {v0, p0}, Lwf3/a;-><init>(Lnf3/a;)V

    iput-object v0, p0, Lnf3/a;->a:Lwf3/a;

    new-instance v0, Ls/m2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p0, v0, Ls/m2;->w:Ljava/lang/Object;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Ls/m2;->x:Ljava/lang/Object;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, v0, Ls/m2;->y:Ljava/lang/Object;

    iput-object v0, p0, Lnf3/a;->b:Ls/m2;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    new-instance v0, Lhf3/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lhf3/a;-><init>(I)V

    iput-object v0, p0, Lnf3/a;->c:Lq83/g;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Z)V
    .locals 12

    iget-object v0, p0, Lnf3/a;->b:Ls/m2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltf3/a;

    iget-object v3, v2, Ltf3/a;->b:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lrf3/b;

    iget-object v6, v0, Ls/m2;->w:Ljava/lang/Object;

    check-cast v6, Lnf3/a;

    const-string v7, "mapping"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "factory"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v4, Lrf3/b;->a:Lqf3/b;

    iget-object v8, v0, Ls/m2;->x:Ljava/lang/Object;

    check-cast v8, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v8, v5}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    if-eqz p2, :cond_0

    iget-object v9, v6, Lnf3/a;->c:Lq83/g;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Override Mapping \'"

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "\' with "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lq83/g;->C(Ljava/lang/String;)V

    goto :goto_2

    :cond_0
    invoke-static {v4, v5}, Ljc/x;->g0(Lrf3/b;Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_2
    iget-object v9, v6, Lnf3/a;->c:Lq83/g;

    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Lq83/g;->D(I)Z

    move-result v9

    if-eqz v9, :cond_2

    iget-object v6, v6, Lnf3/a;->c:Lq83/g;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "add mapping \'"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "\' for "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lq83/g;->r(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v8, v5, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    iget-object v3, v0, Ls/m2;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashSet;

    iget-object v2, v2, Ltf3/a;->a:Ljava/util/HashSet;

    invoke-virtual {v3, v2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_0

    :cond_4
    iget-object p2, p0, Lnf3/a;->a:Lwf3/a;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltf3/a;

    iget-object v1, p2, Lwf3/a;->b:Ljava/util/HashSet;

    iget-object v0, v0, Ltf3/a;->c:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    goto :goto_3

    :cond_5
    return-void
.end method
