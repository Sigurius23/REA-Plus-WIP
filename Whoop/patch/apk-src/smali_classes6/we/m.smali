.class public abstract Lwe/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;

.field public static final b:Lyb3/p;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    const-string v12, "transfer-encoding"

    const-string v13, "upgrade"

    const-string v0, "expect"

    const-string v1, "sec-websocket-key"

    const-string v2, "sec-websocket-protocol"

    const-string v3, "sec-websocket-version"

    const-string v4, "user-agent"

    const-string v5, "x-amzn-trace-id"

    const-string v6, "connection"

    const-string v7, "keep-alive"

    const-string v8, "proxy-authenticate"

    const-string v9, "proxy-authorization"

    const-string v10, "te"

    const-string v11, "trailers"

    filled-new-array/range {v0 .. v13}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lwe/m;->a:Ljava/util/Set;

    new-instance v0, Lyb3/p;

    const-string v1, " +"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwe/m;->b:Lyb3/p;

    return-void
.end method

.method public static final a(Lcg/j;Lwe/g;)Ljava/lang/String;
    .locals 14

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcg/j;->z:Lbd3/k;

    iget-object v0, p0, Lbd3/k;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    iget-boolean v1, p1, Lwe/g;->h:Z

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    new-instance v1, Lwd3/b;

    const/4 v3, 0x2

    invoke-direct {v1, v3}, Lwd3/b;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance v1, Lwd3/b;

    const/4 v3, 0x3

    invoke-direct {v1, v3}, Lwd3/b;-><init>(I)V

    :goto_0
    sget v3, Lcg/x;->c:I

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    sget-object v4, Lcg/u;->w:Lcg/u;

    new-instance v5, Landroidx/room/u;

    sget-object v7, Ltg/g;->i:Ltg/g;

    const/4 v11, 0x0

    const/4 v12, 0x6

    const/4 v6, 0x1

    const-class v8, Ltg/e;

    const-string v9, "encodableFromDecoded"

    const-string v10, "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;"

    invoke-direct/range {v5 .. v12}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-static {v3, v4, v5}, Lhg3/i;->s(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lhf/f;

    sget-object v4, Lcg/v;->w:Lcg/v;

    new-instance v6, Landroidx/room/u;

    const/4 v12, 0x0

    const/4 v13, 0x7

    move-object v8, v7

    const/4 v7, 0x1

    const-class v9, Ltg/e;

    const-string v10, "encodableFromEncoded"

    const-string v11, "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;"

    invoke-direct/range {v6 .. v13}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-static {v3, v4, v6}, Lhg3/i;->s(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lhf/f;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-boolean p0, p0, Lbd3/k;->b:Z

    iget-boolean p1, p1, Lwe/g;->i:Z

    if-eqz p1, :cond_b

    invoke-virtual {v3}, Ljava/util/ArrayList;->listIterator()Ljava/util/ListIterator;

    move-result-object p1

    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltg/b;

    iget-object v0, v0, Ltg/b;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    if-eqz v1, :cond_7

    const/16 v4, 0x2e

    if-eq v1, v4, :cond_6

    const/16 v4, 0x5c0

    if-eq v1, v4, :cond_3

    goto :goto_2

    :cond_3
    const-string v1, ".."

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {p1}, Ljava/util/ListIterator;->remove()V

    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/ListIterator;->remove()V

    goto :goto_2

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Cannot normalize because \"..\" has no parent"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_3

    :cond_7
    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_2

    :cond_8
    :goto_3
    invoke-interface {p1}, Ljava/util/ListIterator;->remove()V

    goto :goto_2

    :cond_9
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_a

    goto :goto_4

    :cond_a
    move v2, p0

    :goto_4
    move p0, v2

    :cond_b
    new-instance p1, Lcg/x;

    invoke-static {v3}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p1, v0, p0}, Lcg/x;-><init>(Ljava/util/List;Z)V

    invoke-virtual {p1}, Lcg/x;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcg/j;)Ljava/lang/String;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lcg/i;->y:I

    new-instance v0, Lcg/g;

    invoke-direct {v0}, Lcg/g;-><init>()V

    iget-object p0, p0, Lcg/j;->E:Lcg/g;

    iget-object p0, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    const/16 v3, 0x10

    if-ge v2, v3, :cond_0

    move v2, v3

    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ltg/b;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v5, Ltg/g;->n:Ltg/g;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "newEncoding"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v4, Ltg/b;->a:Ljava/lang/String;

    invoke-interface {v5, v4}, Ltg/e;->c(Ljava/lang/String;)Ltg/b;

    move-result-object v4

    check-cast v2, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ltg/b;

    sget-object v8, Ltg/g;->n:Ltg/g;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v7, Ltg/b;->a:Ljava/lang/String;

    invoke-interface {v8, v7}, Ltg/e;->c(Ljava/lang/String;)Ltg/b;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Lqx/d0;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lqx/d0;-><init>(I)V

    invoke-static {p0, v1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltg/b;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Lqx/d0;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, Lqx/d0;-><init>(I)V

    invoke-static {v1, v3}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcg/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Lcg/g;->b()Lcg/i;

    move-result-object p0

    invoke-virtual {p0}, Lcg/i;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "?"

    invoke-static {p0, v0}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
