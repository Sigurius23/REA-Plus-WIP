.class public final Lio/sentry/util/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/j3;


# instance fields
.field public final w:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lio/sentry/util/g;->w:Ljava/util/ArrayDeque;

    new-instance v1, Ljava/util/AbstractMap$SimpleEntry;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/util/g;->w:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v0

    :try_start_0
    invoke-virtual {p0}, Lio/sentry/util/g;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, p3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Error deserializing unknown key: %s"

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p1, v1, p2, v2, p3}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lio/sentry/util/g;->h(I)V

    return-void
.end method

.method public final K(Lio/sentry/v0;)Ljava/util/TimeZone;
    .locals 0

    invoke-virtual {p0}, Lio/sentry/util/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final O0()Ljava/lang/Float;
    .locals 2

    invoke-virtual {p0}, Lio/sentry/util/g;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final R()Ljava/lang/Double;
    .locals 2

    invoke-virtual {p0}, Lio/sentry/util/g;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final U(Lio/sentry/v0;)Ljava/util/Date;
    .locals 4

    invoke-virtual {p0}, Lio/sentry/util/g;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    invoke-static {v0}, Ljc/x;->Q(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :try_start_1
    invoke-static {v0}, Ljc/x;->R(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Error when deserializing millis timestamp format."

    invoke-interface {p1, v2, v3, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object v1
.end method

.method public final U0()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/sentry/util/g;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final W()Ljava/lang/Boolean;
    .locals 1

    invoke-virtual {p0}, Lio/sentry/util/g;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    return-object v0
.end method

.method public final Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lio/sentry/util/g;->w:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-eqz p1, :cond_1

    invoke-interface {p2, p0, p1}, Lio/sentry/v1;->a(Lio/sentry/j3;Lio/sentry/v0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    return-object v1
.end method

.method public final b()Ljava/lang/Object;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lio/sentry/util/g;->w:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final beginArray()V
    .locals 6

    iget-object v0, p0, Lio/sentry/util/g;->w:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    new-instance v2, Ljava/util/AbstractMap$SimpleEntry;

    sget-object v3, Lio/sentry/vendor/gson/stream/b;->END_ARRAY:Lio/sentry/vendor/gson/stream/b;

    const/4 v4, 0x0

    invoke-direct {v2, v4, v3}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    new-instance v5, Ljava/util/AbstractMap$SimpleEntry;

    invoke-direct {v5, v4, v3}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Current token is not an object"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "No more entries"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final beginObject()V
    .locals 5

    iget-object v0, p0, Lio/sentry/util/g;->w:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/util/Map;

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    new-instance v2, Ljava/util/AbstractMap$SimpleEntry;

    const/4 v3, 0x0

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->END_OBJECT:Lio/sentry/vendor/gson/stream/b;

    invoke-direct {v2, v3, v4}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Current token is not an object"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "No more entries"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c1(Lio/sentry/v0;Lio/sentry/v1;)Ljava/util/ArrayList;
    .locals 5

    invoke-virtual {p0}, Lio/sentry/util/g;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lio/sentry/util/g;->b()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Expected null but was "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/sentry/util/g;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/util/g;->beginArray()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-virtual {p0}, Lio/sentry/util/g;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->END_ARRAY:Lio/sentry/vendor/gson/stream/b;

    if-eq v1, v2, :cond_2

    iget-object v1, p0, Lio/sentry/util/g;->w:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-interface {p2, p0, p1}, Lio/sentry/v1;->a(Lio/sentry/j3;Lio/sentry/v0;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    :try_start_2
    sget-object v3, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v4, "Failed to deserialize object in list."

    invoke-interface {p1, v3, v4, v2}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v1}, Lio/sentry/util/g;->h(I)V

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lio/sentry/util/g;->endArray()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-object v0

    :goto_1
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lio/sentry/util/g;->w:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    return-void
.end method

.method public final endArray()V
    .locals 3

    iget-object v0, p0, Lio/sentry/util/g;->w:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final endObject()V
    .locals 3

    iget-object v0, p0, Lio/sentry/util/g;->w:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final h(I)V
    .locals 2

    :goto_0
    iget-object v0, p0, Lio/sentry/util/g;->w:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v1

    if-lt v1, p1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, Lio/sentry/util/g;->w:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final nextDouble()D
    .locals 2

    invoke-virtual {p0}, Lio/sentry/util/g;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Expected double"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final nextFloat()F
    .locals 2

    invoke-virtual {p0}, Lio/sentry/util/g;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Expected float"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final nextInt()I
    .locals 2

    invoke-virtual {p0}, Lio/sentry/util/g;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Expected int"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final nextLong()J
    .locals 2

    invoke-virtual {p0}, Lio/sentry/util/g;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Expected long"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final nextName()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/sentry/util/g;->w:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected a name but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/sentry/util/g;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final nextString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lio/sentry/util/g;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Expected string"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final peek()Lio/sentry/vendor/gson/stream/b;
    .locals 2

    iget-object v0, p0, Lio/sentry/util/g;->w:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lio/sentry/vendor/gson/stream/b;->END_DOCUMENT:Lio/sentry/vendor/gson/stream/b;

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    if-nez v0, :cond_1

    sget-object v0, Lio/sentry/vendor/gson/stream/b;->END_DOCUMENT:Lio/sentry/vendor/gson/stream/b;

    return-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    sget-object v0, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    return-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_3

    sget-object v0, Lio/sentry/vendor/gson/stream/b;->BEGIN_OBJECT:Lio/sentry/vendor/gson/stream/b;

    return-object v0

    :cond_3
    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_4

    sget-object v0, Lio/sentry/vendor/gson/stream/b;->BEGIN_ARRAY:Lio/sentry/vendor/gson/stream/b;

    return-object v0

    :cond_4
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_5

    sget-object v0, Lio/sentry/vendor/gson/stream/b;->STRING:Lio/sentry/vendor/gson/stream/b;

    return-object v0

    :cond_5
    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_6

    sget-object v0, Lio/sentry/vendor/gson/stream/b;->NUMBER:Lio/sentry/vendor/gson/stream/b;

    return-object v0

    :cond_6
    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_7

    sget-object v0, Lio/sentry/vendor/gson/stream/b;->BOOLEAN:Lio/sentry/vendor/gson/stream/b;

    return-object v0

    :cond_7
    instance-of v1, v0, Lio/sentry/vendor/gson/stream/b;

    if-eqz v1, :cond_8

    check-cast v0, Lio/sentry/vendor/gson/stream/b;

    return-object v0

    :cond_8
    sget-object v0, Lio/sentry/vendor/gson/stream/b;->END_DOCUMENT:Lio/sentry/vendor/gson/stream/b;

    return-object v0
.end method

.method public final q0()Ljava/lang/Integer;
    .locals 2

    invoke-virtual {p0}, Lio/sentry/util/g;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final s0()Ljava/lang/Long;
    .locals 2

    invoke-virtual {p0}, Lio/sentry/util/g;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final setLenient(Z)V
    .locals 0

    return-void
.end method

.method public final skipValue()V
    .locals 2

    iget-object v0, p0, Lio/sentry/util/g;->w:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final w0()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lio/sentry/util/g;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final y0(Lio/sentry/v0;Lio/sentry/v1;)Ljava/util/HashMap;
    .locals 5

    invoke-virtual {p0}, Lio/sentry/util/g;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lio/sentry/util/g;->b()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Expected null but was "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/sentry/util/g;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/util/g;->beginObject()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Lio/sentry/util/g;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v1, v2, :cond_3

    :cond_2
    invoke-virtual {p0}, Lio/sentry/util/g;->nextName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/sentry/util/g;->w:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->size()I

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-interface {p2, p0, p1}, Lio/sentry/v1;->a(Lio/sentry/j3;Lio/sentry/v0;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_2
    sget-object v3, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v4, "Failed to deserialize object in map."

    invoke-interface {p1, v3, v4, v1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v2}, Lio/sentry/util/g;->h(I)V

    :goto_0
    invoke-virtual {p0}, Lio/sentry/util/g;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->BEGIN_OBJECT:Lio/sentry/vendor/gson/stream/b;

    if-eq v1, v2, :cond_2

    invoke-virtual {p0}, Lio/sentry/util/g;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-eq v1, v2, :cond_2

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lio/sentry/util/g;->endObject()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-object v0

    :goto_2
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
