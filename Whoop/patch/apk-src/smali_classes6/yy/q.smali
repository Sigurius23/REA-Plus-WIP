.class public abstract Lyy/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lyy/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lyy/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lyy/q;->a:Lyy/r;

    return-void
.end method

.method public static final a(Lwy/a;Lyy/n0;)Lcom/stripe/android/core/exception/APIException;
    .locals 7

    new-instance v0, Lcom/stripe/android/core/exception/APIException;

    invoke-static {p1}, Lyy/q;->i(Lyy/n0;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lwy/a;->b(Lorg/json/JSONObject;)Lqy/f;

    move-result-object v6

    iget-object p0, p1, Lyy/n0;->f:Lyy/f0;

    if-eqz p0, :cond_0

    iget-object p0, p0, Lyy/f0;->a:Ljava/lang/String;

    :goto_0
    move-object v3, p0

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    goto :goto_0

    :goto_1
    iget v1, p1, Lyy/n0;->a:I

    const/4 v5, 0x0

    const/16 v2, 0x18

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/core/exception/APIException;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V

    return-object v0
.end method

.method public static b(Ljava/util/Map;)Ljava/util/HashMap;
    .locals 4

    const-string v0, "params"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance p0, Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-direct {p0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const-string v1, "iterator(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/util/Map;

    if-eqz v3, :cond_1

    check-cast v2, Ljava/util/Map;

    invoke-static {v2}, Lyy/q;->b(Ljava/util/Map;)Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static final c(Lyy/m0;Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/APIConnectionException;
    .locals 3

    new-instance v0, Lcom/stripe/android/core/exception/APIConnectionException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to execute "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/core/exception/APIConnectionException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static final d(Lab/i0;Lwy/a;Lyy/g;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lyy/x;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lyy/x;

    iget v1, v0, Lyy/x;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lyy/x;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lyy/x;

    invoke-direct {v0, p3}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lyy/x;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lyy/x;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p2, v0, Lyy/x;->x:Lyy/g;

    iget-object p1, v0, Lyy/x;->w:Lwy/a;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iput-object p1, v0, Lyy/x;->w:Lwy/a;

    iput-object p2, v0, Lyy/x;->x:Lyy/g;

    iput v3, v0, Lyy/x;->z:I

    invoke-virtual {p0, p2, v0}, Lab/i0;->r(Lyy/m0;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Lyy/n0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :goto_2
    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p3

    :goto_3
    invoke-static {p3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-nez p0, :cond_5

    check-cast p3, Lyy/n0;

    iget-boolean p0, p3, Lyy/n0;->e:Z

    if-eqz p0, :cond_4

    invoke-static {p1, p3}, Lyy/q;->a(Lwy/a;Lyy/n0;)Lcom/stripe/android/core/exception/APIException;

    move-result-object p0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    goto :goto_4

    :cond_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    goto :goto_4

    :cond_5
    invoke-static {p2, p0}, Lyy/q;->c(Lyy/m0;Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/APIConnectionException;

    move-result-object p0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :goto_4
    return-object p0
.end method

.method public static final e(Lab/i0;Lwy/a;Lyy/g;Lwy/b;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p4, Lyy/y;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lyy/y;

    iget v1, v0, Lyy/y;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lyy/y;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lyy/y;

    invoke-direct {v0, p4}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lyy/y;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lyy/y;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p3, v0, Lyy/y;->y:Lwy/b;

    iget-object p2, v0, Lyy/y;->x:Lyy/g;

    iget-object p1, v0, Lyy/y;->w:Lwy/a;

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iput-object p1, v0, Lyy/y;->w:Lwy/a;

    iput-object p2, v0, Lyy/y;->x:Lyy/g;

    iput-object p3, v0, Lyy/y;->y:Lwy/b;

    iput v3, v0, Lyy/y;->E:I

    invoke-virtual {p0, p2, v0}, Lab/i0;->r(Lyy/m0;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Lyy/n0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :goto_2
    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p4

    :goto_3
    invoke-static {p4}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-nez p0, :cond_6

    check-cast p4, Lyy/n0;

    iget-boolean p0, p4, Lyy/n0;->e:Z

    if-nez p0, :cond_5

    invoke-static {p4}, Lyy/q;->i(Lyy/n0;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-interface {p3, p0}, Lwy/b;->m(Lorg/json/JSONObject;)Lvy/b;

    move-result-object p0

    if-eqz p0, :cond_4

    return-object p0

    :cond_4
    new-instance v0, Lcom/stripe/android/core/exception/APIException;

    invoke-static {p4}, Lyy/q;->i(Lyy/n0;)Lorg/json/JSONObject;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " returns null for "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v2, 0x17

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/core/exception/APIException;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V

    throw v0

    :cond_5
    invoke-static {p1, p4}, Lyy/q;->a(Lwy/a;Lyy/n0;)Lcom/stripe/android/core/exception/APIException;

    move-result-object p0

    throw p0

    :cond_6
    invoke-static {p2, p0}, Lyy/q;->c(Lyy/m0;Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/APIConnectionException;

    move-result-object p0

    throw p0
.end method

.method public static final f(Lab/i0;Lwy/a;Lyy/g;Lwy/b;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p4, Lyy/z;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lyy/z;

    iget v1, v0, Lyy/z;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lyy/z;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lyy/z;

    invoke-direct {v0, p4}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lyy/z;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lyy/z;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p3, v0, Lyy/z;->y:Lwy/b;

    iget-object p2, v0, Lyy/z;->x:Lyy/g;

    iget-object p1, v0, Lyy/z;->w:Lwy/a;

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iput-object p1, v0, Lyy/z;->w:Lwy/a;

    iput-object p2, v0, Lyy/z;->x:Lyy/g;

    iput-object p3, v0, Lyy/z;->y:Lwy/b;

    iput v3, v0, Lyy/z;->E:I

    invoke-virtual {p0, p2, v0}, Lab/i0;->r(Lyy/m0;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Lyy/n0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :goto_2
    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p4

    :goto_3
    invoke-static {p4}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-nez p0, :cond_7

    check-cast p4, Lyy/n0;

    iget-boolean p0, p4, Lyy/n0;->e:Z

    if-eqz p0, :cond_4

    invoke-static {p1, p4}, Lyy/q;->a(Lwy/a;Lyy/n0;)Lcom/stripe/android/core/exception/APIException;

    move-result-object p0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    goto :goto_5

    :cond_4
    :try_start_2
    invoke-static {p4}, Lyy/q;->i(Lyy/n0;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-interface {p3, p0}, Lwy/b;->m(Lorg/json/JSONObject;)Lvy/b;

    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p0, v0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :goto_4
    instance-of p1, p0, Ll83/m;

    if-eqz p1, :cond_5

    const/4 p0, 0x0

    :cond_5
    check-cast p0, Lvy/b;

    if-eqz p0, :cond_6

    goto :goto_5

    :cond_6
    new-instance v0, Lcom/stripe/android/core/exception/APIException;

    invoke-static {p4}, Lyy/q;->i(Lyy/n0;)Lorg/json/JSONObject;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " returns null for "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v2, 0x17

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/core/exception/APIException;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    goto :goto_5

    :cond_7
    invoke-static {p2, p0}, Lyy/q;->c(Lyy/m0;Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/APIConnectionException;

    move-result-object p0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :goto_5
    return-object p0
.end method

.method public static g(Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;
    .locals 5

    if-eqz p1, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-eqz p0, :cond_1

    const-string v3, "["

    const-string v4, "]"

    invoke-static {p0, v3, v2, v4}, Ldc/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    move-object v2, v3

    :cond_1
    :goto_1
    invoke-static {v1, v2}, Lyy/q;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_2
    return-object v0

    :cond_3
    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0
.end method

.method public static h(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/List;
    .locals 6

    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/util/Map;

    invoke-static {p1, p0}, Lyy/q;->g(Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/util/List;

    const-string v1, ""

    if-eqz v0, :cond_9

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p0, Lyy/w;

    invoke-direct {p0, p1, v1}, Lyy/w;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    if-nez v2, :cond_3

    instance-of v2, v1, Ljava/lang/Number;

    if-nez v2, :cond_3

    instance-of v2, v1, Ljava/lang/Boolean;

    if-nez v2, :cond_3

    instance-of v1, v1, Ljava/lang/Character;

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-ltz v1, :cond_5

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lyy/q;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    move v1, v3

    goto :goto_1

    :cond_5
    invoke-static {}, Lwb3/f;->d0()V

    const/4 p0, 0x0

    throw p0

    :cond_6
    return-object v0

    :cond_7
    :goto_2
    const-string v0, "[]"

    invoke-static {p1, v0}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, Lyy/q;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_3

    :cond_8
    return-object v0

    :cond_9
    if-nez p0, :cond_a

    new-instance p0, Lyy/w;

    invoke-direct {p0, p1, v1}, Lyy/w;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_a
    new-instance v0, Lyy/w;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p1, p0}, Lyy/w;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lyy/n0;)Lorg/json/JSONObject;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyy/n0;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    move-object v7, v0

    new-instance v2, Lcom/stripe/android/core/exception/APIException;

    iget v0, p0, Lyy/n0;->a:I

    iget-object v3, p0, Lyy/n0;->f:Lyy/f0;

    const-string v4, "Content-Type"

    invoke-virtual {p0, v4}, Lyy/n0;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "\n                    Exception while parsing response body.\n                      Status code: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\n                      Request-Id: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\n                      Content-Type: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\n                      Body: \""

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\"\n                "

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lyb3/s;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v4, 0x7

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/core/exception/APIException;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V

    throw v2

    :cond_1
    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    return-object p0
.end method

.method public static final j(Ljava/util/List;)Lkotlinx/serialization/json/JsonArray;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->D0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/util/Map;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/util/Map;

    invoke-static {v1}, Lyy/q;->k(Ljava/util/Map;)Lkotlinx/serialization/json/JsonObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_1

    check-cast v1, Ljava/util/List;

    invoke-static {v1}, Lyy/q;->j(Ljava/util/List;)Lkotlinx/serialization/json/JsonArray;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p0, Lkotlinx/serialization/json/JsonArray;

    invoke-direct {p0, v0}, Lkotlinx/serialization/json/JsonArray;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method public static final k(Ljava/util/Map;)Lkotlinx/serialization/json/JsonObject;
    .locals 4

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_0

    check-cast v2, Ljava/lang/String;

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    instance-of v3, v1, Ljava/util/Map;

    if-eqz v3, :cond_3

    check-cast v1, Ljava/util/Map;

    invoke-static {v1}, Lyy/q;->k(Ljava/util/Map;)Lkotlinx/serialization/json/JsonObject;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    instance-of v3, v1, Ljava/util/List;

    if-eqz v3, :cond_4

    check-cast v1, Ljava/util/List;

    invoke-static {v1}, Lyy/q;->j(Ljava/util/List;)Lkotlinx/serialization/json/JsonArray;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_5
    new-instance p0, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {p0, v0}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    return-object p0
.end method

.method public static final l(Lkotlinx/serialization/json/JsonElement;)Ljava/util/Map;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lkotlinx/serialization/json/JsonObject;

    if-eqz v0, :cond_0

    check-cast p0, Lkotlinx/serialization/json/JsonObject;

    invoke-static {p0}, Lyy/q;->m(Lkotlinx/serialization/json/JsonObject;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lcom/stripe/android/core/exception/InvalidSerializationException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const-string v1, "Serialization result "

    const-string v2, " is not supported"

    invoke-static {v1, p0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final m(Lkotlinx/serialization/json/JsonObject;)Ljava/util/Map;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    invoke-static {v1}, Lyy/q;->n(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v1

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Lkotlinx/serialization/json/JsonArray;

    if-eqz v0, :cond_2

    check-cast p0, Lkotlinx/serialization/json/JsonArray;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    invoke-static {v1}, Lyy/q;->n(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    instance-of v0, p0, Lkotlinx/serialization/json/JsonObject;

    if-eqz v0, :cond_3

    check-cast p0, Lkotlinx/serialization/json/JsonObject;

    invoke-static {p0}, Lyy/q;->m(Lkotlinx/serialization/json/JsonObject;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_3
    instance-of v0, p0, Lkotlinx/serialization/json/JsonPrimitive;

    if-eqz v0, :cond_4

    check-cast p0, Lkotlinx/serialization/json/JsonPrimitive;

    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object p0

    const-string v0, "^\"|\"$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v1, "compile(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "input"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    const-string v0, ""

    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "replaceAll(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
