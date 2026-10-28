.class public final Lna3/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Ljava/util/LinkedHashMap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lna3/q;->a:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final a()Lna3/q;
    .locals 8

    new-instance v0, Ljava/util/LinkedHashMap;

    iget-object v1, p0, Lna3/q;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lna3/d;

    iget-object v4, v2, Lna3/d;->a:Lna3/g;

    iget-object v5, v2, Lna3/d;->b:Lna3/e;

    iget-boolean v2, v2, Lna3/d;->c:Z

    new-instance v6, Lna3/d;

    const/4 v7, 0x1

    invoke-direct {v6, v4, v5, v2, v7}, Lna3/d;-><init>(Lna3/g;Lna3/e;ZZ)V

    invoke-interface {v0, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v1, Lna3/q;

    invoke-direct {v1, v0}, Lna3/q;-><init>(Ljava/util/LinkedHashMap;)V

    return-object v1
.end method
