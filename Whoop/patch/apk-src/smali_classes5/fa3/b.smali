.class public final Lfa3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/util/LinkedHashMap;


# instance fields
.field public final a:Lch3/h;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {}, Lfa3/a;->values()[Lfa3/a;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    iget-object v5, v4, Lfa3/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_0

    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sput-object v0, Lfa3/b;->c:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public constructor <init>(Lch3/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfa3/b;->a:Lch3/h;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lfa3/b;->b:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static a(Ljava/lang/Object;Z)Ljava/util/ArrayList;
    .locals 4

    check-cast p0, Ls93/b;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ls93/b;->a()Ljava/util/Map;

    move-result-object p0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lva3/h;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lab3/g;

    if-eqz p1, :cond_1

    sget-object v3, Lfa3/x;->b:Lva3/h;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    sget-object v1, Lm83/y;->w:Lm83/y;

    goto :goto_2

    :cond_1
    :goto_1
    invoke-static {v1}, Lfa3/b;->j(Lab3/g;)Ljava/util/List;

    move-result-object v1

    :goto_2
    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static b(Lfa3/b;Lfa3/t;Ls93/i;)Lfa3/t;
    .locals 12

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "annotations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfa3/b;->a:Lch3/h;

    iget-boolean v1, v0, Lch3/h;->y:Z

    if-eqz v1, :cond_0

    goto/16 :goto_13

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_1e

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    const/4 v6, 0x0

    if-eqz v1, :cond_3

    :cond_2
    :goto_1
    move-object v7, v6

    goto :goto_5

    :cond_3
    invoke-static {}, Lfa3/n;->a()Ljava/util/LinkedHashMap;

    move-result-object v7

    invoke-static {v3}, Lfa3/b;->d(Ljava/lang/Object;)Lva3/e;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lfa3/m;

    if-eqz v7, :cond_2

    invoke-static {v3}, Lfa3/b;->d(Ljava/lang/Object;)Lva3/e;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-static {}, Lfa3/n;->b()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    iget-object v9, v0, Lch3/h;->z:Ljava/lang/Object;

    check-cast v9, Ldc3/s;

    invoke-virtual {v9, v8}, Ldc3/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lfa3/b0;

    goto :goto_2

    :cond_4
    invoke-virtual {p0, v3}, Lfa3/b;->h(Ljava/lang/Object;)Lfa3/b0;

    move-result-object v8

    if-eqz v8, :cond_5

    goto :goto_2

    :cond_5
    iget-object v8, v0, Lch3/h;->x:Ljava/lang/Object;

    check-cast v8, Lfa3/v;

    iget-object v8, v8, Lfa3/v;->a:Lfa3/b0;

    :goto_2
    sget-object v9, Lfa3/b0;->x:Lfa3/b0;

    if-eq v8, v9, :cond_6

    goto :goto_3

    :cond_6
    move-object v8, v6

    :goto_3
    if-nez v8, :cond_7

    goto :goto_1

    :cond_7
    invoke-virtual {v7}, Lfa3/m;->b()Lna3/h;

    move-result-object v9

    sget-object v10, Lfa3/b0;->y:Lfa3/b0;

    if-ne v8, v10, :cond_8

    move v8, v5

    goto :goto_4

    :cond_8
    move v8, v4

    :goto_4
    invoke-static {v9, v6, v8, v5}, Lna3/h;->a(Lna3/h;Lna3/g;ZI)Lna3/h;

    move-result-object v8

    invoke-static {v7, v8}, Lfa3/m;->a(Lfa3/m;Lna3/h;)Lfa3/m;

    move-result-object v7

    :goto_5
    if-eqz v7, :cond_9

    move-object v6, v7

    goto/16 :goto_f

    :cond_9
    iget-object v7, v0, Lch3/h;->x:Ljava/lang/Object;

    check-cast v7, Lfa3/v;

    iget-boolean v7, v7, Lfa3/v;->d:Z

    if-eqz v7, :cond_a

    :goto_6
    move-object v7, v6

    goto/16 :goto_9

    :cond_a
    invoke-static {}, Lfa3/y;->e()Lva3/e;

    move-result-object v7

    invoke-static {v3, v7}, Lfa3/b;->c(Ljava/lang/Object;Lva3/e;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_b

    goto :goto_6

    :cond_b
    invoke-static {v3}, Lfa3/b;->e(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object v8

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {p0, v9}, Lfa3/b;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_c

    goto :goto_7

    :cond_d
    move-object v9, v6

    :goto_7
    if-nez v9, :cond_e

    goto :goto_6

    :cond_e
    invoke-static {v7, v5}, Lfa3/b;->a(Ljava/lang/Object;Z)Ljava/util/ArrayList;

    move-result-object v7

    new-instance v8, Ljava/util/LinkedHashSet;

    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_f
    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_10

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    sget-object v11, Lfa3/b;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v11, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lfa3/a;

    if-eqz v10, :cond_f

    invoke-interface {v8, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_10
    new-instance v7, Ll83/k;

    sget-object v10, Lfa3/a;->E:Lfa3/a;

    invoke-interface {v8, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_11

    invoke-static {}, Lfa3/a;->values()[Lfa3/a;

    move-result-object v10

    invoke-static {v10}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    sget-object v11, Lfa3/a;->F:Lfa3/a;

    invoke-static {v11, v10}, Ldt/b;->y(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v10

    invoke-static {v10, v8}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v8

    :cond_11
    invoke-direct {v7, v9, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_9
    if-nez v7, :cond_12

    goto/16 :goto_f

    :cond_12
    iget-object v8, v7, Ll83/k;->w:Ljava/lang/Object;

    iget-object v7, v7, Ll83/k;->x:Ljava/lang/Object;

    check-cast v7, Ljava/util/Set;

    invoke-virtual {p0, v3}, Lfa3/b;->h(Ljava/lang/Object;)Lfa3/b0;

    move-result-object v3

    if-nez v3, :cond_14

    invoke-virtual {p0, v8}, Lfa3/b;->h(Ljava/lang/Object;)Lfa3/b0;

    move-result-object v3

    if-eqz v3, :cond_13

    goto :goto_a

    :cond_13
    iget-object v3, v0, Lch3/h;->x:Ljava/lang/Object;

    check-cast v3, Lfa3/v;

    iget-object v3, v3, Lfa3/v;->a:Lfa3/b0;

    :cond_14
    :goto_a
    sget-object v9, Lfa3/b0;->x:Lfa3/b0;

    if-ne v3, v9, :cond_15

    goto :goto_f

    :cond_15
    const-string v10, "$this$extractNullability"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v8, v4}, Lfa3/b;->g(Ljava/lang/Object;Z)Lna3/h;

    move-result-object v10

    if-eqz v10, :cond_16

    goto :goto_e

    :cond_16
    invoke-virtual {p0, v8}, Lfa3/b;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_18

    :cond_17
    :goto_b
    move-object v10, v6

    goto :goto_e

    :cond_18
    invoke-virtual {p0, v8}, Lfa3/b;->h(Ljava/lang/Object;)Lfa3/b0;

    move-result-object v8

    if-eqz v8, :cond_19

    goto :goto_c

    :cond_19
    iget-object v8, v0, Lch3/h;->x:Ljava/lang/Object;

    check-cast v8, Lfa3/v;

    iget-object v8, v8, Lfa3/v;->a:Lfa3/b0;

    :goto_c
    if-ne v8, v9, :cond_1a

    goto :goto_b

    :cond_1a
    invoke-virtual {p0, v10, v4}, Lfa3/b;->g(Ljava/lang/Object;Z)Lna3/h;

    move-result-object v9

    if-eqz v9, :cond_17

    sget-object v10, Lfa3/b0;->y:Lfa3/b0;

    if-ne v8, v10, :cond_1b

    move v8, v5

    goto :goto_d

    :cond_1b
    move v8, v4

    :goto_d
    invoke-static {v9, v6, v8, v5}, Lna3/h;->a(Lna3/h;Lna3/g;ZI)Lna3/h;

    move-result-object v10

    :goto_e
    if-nez v10, :cond_1c

    goto :goto_f

    :cond_1c
    new-instance v8, Lfa3/m;

    sget-object v9, Lfa3/b0;->y:Lfa3/b0;

    if-ne v3, v9, :cond_1d

    move v4, v5

    :cond_1d
    invoke-static {v10, v6, v4, v5}, Lna3/h;->a(Lna3/h;Lna3/g;ZI)Lna3/h;

    move-result-object v3

    check-cast v7, Ljava/util/Collection;

    const/16 v4, 0x1c

    invoke-direct {v8, v3, v7, v4}, Lfa3/m;-><init>(Lna3/h;Ljava/util/Collection;I)V

    move-object v6, v8

    :goto_f
    if-eqz v6, :cond_1

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_1e
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_1f

    goto/16 :goto_13

    :cond_1f
    new-instance p0, Ljava/util/EnumMap;

    const-class p2, Lfa3/a;

    invoke-direct {p0, p2}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfa3/m;

    invoke-virtual {v1}, Lfa3/m;->c()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_20

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfa3/a;

    invoke-virtual {p0, v3}, Ljava/util/EnumMap;->containsKey(Ljava/lang/Object;)Z

    invoke-virtual {p0, v3, v1}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_10

    :cond_21
    if-eqz p1, :cond_22

    invoke-virtual {p1}, Lfa3/t;->a()Ljava/util/EnumMap;

    move-result-object v0

    if-eqz v0, :cond_22

    new-instance p2, Ljava/util/EnumMap;

    invoke-direct {p2, v0}, Ljava/util/EnumMap;-><init>(Ljava/util/EnumMap;)V

    goto :goto_11

    :cond_22
    new-instance v0, Ljava/util/EnumMap;

    invoke-direct {v0, p2}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    move-object p2, v0

    :goto_11
    invoke-virtual {p0}, Ljava/util/EnumMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_23
    :goto_12
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_24

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfa3/a;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfa3/m;

    if-eqz v0, :cond_23

    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v4, v5

    goto :goto_12

    :cond_24
    if-nez v4, :cond_25

    :goto_13
    return-object p1

    :cond_25
    new-instance p0, Lfa3/t;

    invoke-direct {p0, p2}, Lfa3/t;-><init>(Ljava/util/EnumMap;)V

    return-object p0
.end method

.method public static c(Ljava/lang/Object;Lva3/e;)Ljava/lang/Object;
    .locals 2

    invoke-static {p0}, Lfa3/b;->e(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lfa3/b;->d(Ljava/lang/Object;)Lva3/e;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static d(Ljava/lang/Object;)Lva3/e;
    .locals 1

    check-cast p0, Ls93/b;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ls93/b;->b()Lva3/e;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 1

    check-cast p0, Ls93/b;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcb3/e;->d(Ls93/b;)Lr93/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ls93/a;->getAnnotations()Ls93/i;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0
.end method

.method public static f(Ljava/lang/Object;Lva3/e;)Z
    .locals 1

    invoke-static {p0}, Lfa3/b;->e(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p0

    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lfa3/b;->d(Ljava/lang/Object;)Lva3/e;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static j(Lab3/g;)Ljava/util/List;
    .locals 2

    instance-of v0, p0, Lab3/b;

    if-eqz v0, :cond_1

    check-cast p0, Lab3/b;

    invoke-virtual {p0}, Lab3/g;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lab3/g;

    invoke-static {v1}, Lfa3/b;->j(Lab3/g;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    instance-of v0, p0, Lab3/i;

    if-eqz v0, :cond_2

    check-cast p0, Lab3/i;

    invoke-virtual {p0}, Lab3/i;->c()Lva3/h;

    move-result-object p0

    invoke-virtual {p0}, Lva3/h;->c()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Z)Lna3/h;
    .locals 5

    invoke-static {p1}, Lfa3/b;->d(Ljava/lang/Object;)Lva3/e;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v2, p0, Lfa3/b;->a:Lch3/h;

    iget-object v2, v2, Lch3/h;->z:Ljava/lang/Object;

    check-cast v2, Ldc3/s;

    invoke-virtual {v2, v0}, Ldc3/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfa3/b0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lfa3/b0;->x:Lfa3/b0;

    if-ne v2, v3, :cond_1

    return-object v1

    :cond_1
    invoke-static {}, Lfa3/y;->g()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    sget-object p1, Lna3/g;->y:Lna3/g;

    goto/16 :goto_1

    :cond_2
    invoke-static {}, Lfa3/y;->h()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object p1, Lna3/g;->x:Lna3/g;

    goto :goto_1

    :cond_3
    invoke-static {}, Lfa3/y;->b()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object p1, Lna3/g;->w:Lna3/g;

    goto :goto_1

    :cond_4
    invoke-static {}, Lfa3/y;->c()Lva3/e;

    move-result-object v3

    invoke-virtual {v0, v3}, Lva3/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {p1, v4}, Lfa3/b;->a(Ljava/lang/Object;Z)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->G0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_3

    :sswitch_0
    const-string v0, "ALWAYS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    goto :goto_0

    :sswitch_1
    const-string v0, "UNKNOWN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    sget-object p1, Lna3/g;->w:Lna3/g;

    goto :goto_1

    :sswitch_2
    const-string v0, "NEVER"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_3

    :sswitch_3
    const-string v0, "MAYBE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_3

    :cond_6
    sget-object p1, Lna3/g;->x:Lna3/g;

    goto :goto_1

    :cond_7
    :goto_0
    sget-object p1, Lna3/g;->y:Lna3/g;

    :goto_1
    new-instance v0, Lna3/h;

    sget-object v1, Lfa3/b0;->y:Lfa3/b0;

    if-ne v2, v1, :cond_8

    goto :goto_2

    :cond_8
    if-eqz p2, :cond_9

    :goto_2
    const/4 v4, 0x1

    :cond_9
    invoke-direct {v0, p1, v4}, Lna3/h;-><init>(Lna3/g;Z)V

    return-object v0

    :cond_a
    :goto_3
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x45bf448 -> :sswitch_3
        0x46bd26c -> :sswitch_2
        0x19d1382a -> :sswitch_1
        0x7342860f -> :sswitch_0
    .end sparse-switch
.end method

.method public final h(Ljava/lang/Object;)Lfa3/b0;
    .locals 3

    iget-object v0, p0, Lfa3/b;->a:Lch3/h;

    iget-object v0, v0, Lch3/h;->x:Ljava/lang/Object;

    check-cast v0, Lfa3/v;

    iget-object v1, v0, Lfa3/v;->c:Ljava/util/Map;

    invoke-static {p1}, Lfa3/b;->d(Ljava/lang/Object;)Lva3/e;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfa3/b0;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, Lfa3/y;->i()Lva3/e;

    move-result-object v1

    invoke-static {p1, v1}, Lfa3/b;->c(Ljava/lang/Object;Lva3/e;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_9

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lfa3/b;->a(Ljava/lang/Object;Z)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->G0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lfa3/v;->b:Lfa3/b0;

    if-nez v0, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x7f610e2e

    if-eq v0, v1, :cond_6

    const v1, -0x6d97ad37

    if-eq v0, v1, :cond_4

    const v1, 0x288a86

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    const-string v0, "WARN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    sget-object p1, Lfa3/b0;->y:Lfa3/b0;

    return-object p1

    :cond_4
    const-string v0, "STRICT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    sget-object p1, Lfa3/b0;->z:Lfa3/b0;

    return-object p1

    :cond_6
    const-string v0, "IGNORE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    sget-object p1, Lfa3/b0;->x:Lfa3/b0;

    return-object p1

    :cond_8
    return-object v0

    :cond_9
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const-string v0, "annotation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfa3/b;->a:Lch3/h;

    iget-object v0, v0, Lch3/h;->x:Ljava/lang/Object;

    check-cast v0, Lfa3/v;

    iget-boolean v0, v0, Lfa3/v;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, Lfa3/y;->a()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p1}, Lfa3/b;->d(Ljava/lang/Object;)Lva3/e;

    move-result-object v2

    invoke-static {v0, v2}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-static {}, Lfa3/y;->d()Lva3/e;

    move-result-object v0

    invoke-static {p1, v0}, Lfa3/b;->f(Ljava/lang/Object;Lva3/e;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {}, Lfa3/y;->f()Lva3/e;

    move-result-object v0

    invoke-static {p1, v0}, Lfa3/b;->f(Ljava/lang/Object;Lva3/e;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    move-object v0, p1

    check-cast v0, Ls93/b;

    invoke-static {v0}, Lcb3/e;->d(Ls93/b;)Lr93/e;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, p0, Lfa3/b;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_7

    invoke-static {p1}, Lfa3/b;->e(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v3}, Lfa3/b;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_4
    move-object v3, v1

    :goto_0
    if-nez v3, :cond_5

    :goto_1
    return-object v1

    :cond_5
    invoke-virtual {v2, v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_6

    return-object v3

    :cond_6
    return-object p1

    :cond_7
    return-object v3

    :cond_8
    :goto_2
    return-object p1
.end method
