.class public abstract Lfa3/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:Ljava/util/LinkedHashMap;

.field public static final c:Ljava/util/Set;

.field public static final d:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    sget-object v0, Lo93/m;->j:Lva3/f;

    const-string v1, "name"

    invoke-static {v1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lva3/f;->a(Lva3/h;)Lva3/f;

    move-result-object v1

    invoke-virtual {v1}, Lva3/f;->i()Lva3/e;

    move-result-object v1

    sget-object v2, Lo93/n;->d:Lva3/h;

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "ordinal"

    invoke-static {v1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v2

    invoke-virtual {v0, v2}, Lva3/f;->a(Lva3/h;)Lva3/f;

    move-result-object v0

    invoke-virtual {v0}, Lva3/f;->i()Lva3/e;

    move-result-object v0

    invoke-static {v1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v1

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lo93/m;->C:Lva3/e;

    const-string v1, "size"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/j;->t(Ljava/lang/String;Lva3/e;)Lva3/e;

    move-result-object v0

    invoke-static {v1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v2

    new-instance v5, Ll83/k;

    invoke-direct {v5, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lo93/m;->G:Lva3/e;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/j;->t(Ljava/lang/String;Lva3/e;)Lva3/e;

    move-result-object v2

    invoke-static {v1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v6

    move-object v7, v6

    new-instance v6, Ll83/k;

    invoke-direct {v6, v2, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lo93/m;->e:Lva3/f;

    const-string v7, "length"

    invoke-static {v7}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v8

    invoke-virtual {v2, v8}, Lva3/f;->a(Lva3/h;)Lva3/f;

    move-result-object v2

    invoke-virtual {v2}, Lva3/f;->i()Lva3/e;

    move-result-object v2

    invoke-static {v7}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v8

    move-object v9, v7

    new-instance v7, Ll83/k;

    invoke-direct {v7, v2, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "keys"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/j;->t(Ljava/lang/String;Lva3/e;)Lva3/e;

    move-result-object v2

    const-string v8, "keySet"

    invoke-static {v8}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v8

    move-object v10, v8

    new-instance v8, Ll83/k;

    invoke-direct {v8, v2, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "values"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/j;->t(Ljava/lang/String;Lva3/e;)Lva3/e;

    move-result-object v10

    invoke-static {v2}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v2

    move-object v11, v9

    new-instance v9, Ll83/k;

    invoke-direct {v9, v10, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "entries"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/j;->t(Ljava/lang/String;Lva3/e;)Lva3/e;

    move-result-object v0

    const-string v2, "entrySet"

    invoke-static {v2}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v2

    new-instance v10, Ll83/k;

    invoke-direct {v10, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lo93/m;->a0:Lva3/e;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/j;->t(Ljava/lang/String;Lva3/e;)Lva3/e;

    move-result-object v0

    invoke-static {v11}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v2

    move-object v12, v11

    new-instance v11, Ll83/k;

    invoke-direct {v11, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lo93/m;->b0:Lva3/e;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/j;->t(Ljava/lang/String;Lva3/e;)Lva3/e;

    move-result-object v0

    invoke-static {v12}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v2

    move-object v13, v12

    new-instance v12, Ll83/k;

    invoke-direct {v12, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lo93/m;->c0:Lva3/e;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/j;->t(Ljava/lang/String;Lva3/e;)Lva3/e;

    move-result-object v0

    invoke-static {v13}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v1

    new-instance v13, Ll83/k;

    invoke-direct {v13, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v3 .. v13}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lfa3/f;->a:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    new-instance v4, Ll83/k;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lva3/e;

    iget-object v5, v5, Lva3/e;->a:Lva3/f;

    invoke-virtual {v5}, Lva3/f;->g()Lva3/h;

    move-result-object v5

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll83/k;

    iget-object v4, v3, Ll83/k;->x:Ljava/lang/Object;

    check-cast v4, Lva3/h;

    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    check-cast v5, Ljava/util/List;

    iget-object v3, v3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Lva3/h;

    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v3

    invoke-static {v3}, Lm83/g0;->W(I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lm83/s;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    sput-object v1, Lfa3/f;->b:Ljava/util/LinkedHashMap;

    sget-object v0, Lfa3/f;->a:Ljava/lang/Object;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    sget-object v4, Lq93/d;->a:Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lva3/e;

    invoke-virtual {v4}, Lva3/e;->b()Lva3/e;

    move-result-object v4

    iget-object v4, v4, Lva3/e;->a:Lva3/f;

    invoke-static {v4}, Lq93/d;->g(Lva3/f;)Lva3/c;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lva3/c;->a()Lva3/e;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lva3/h;

    invoke-virtual {v4, v3}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    sget-object v0, Lfa3/f;->a:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lfa3/f;->c:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lva3/e;

    iget-object v2, v2, Lva3/e;->a:Lva3/f;

    invoke-virtual {v2}, Lva3/f;->g()Lva3/h;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lfa3/f;->d:Ljava/util/Set;

    return-void
.end method
