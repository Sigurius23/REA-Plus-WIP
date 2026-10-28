.class public final Lqx/n;
.super Lqx/o;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/squareup/moshi/JsonAdapter;)V
    .locals 0

    invoke-direct {p0, p1}, Lqx/o;-><init>(Lcom/squareup/moshi/JsonAdapter;)V

    return-void
.end method


# virtual methods
.method public final fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->beginArray()V

    :goto_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lqx/o;->a:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v1, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->endArray()V

    return-object v0
.end method

.method public final toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 2

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p1}, Lqx/c0;->b()Lqx/c0;

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lqx/o;->a:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v1, p1, v0}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lqx/c0;->k()Lqx/c0;

    return-void
.end method
