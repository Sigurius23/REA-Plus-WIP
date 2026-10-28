.class public final Lio/sentry/g2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/j3;


# instance fields
.field public final w:Lio/sentry/vendor/gson/stream/a;

.field public final x:Ljava/util/ArrayDeque;

.field public y:I


# direct methods
.method public constructor <init>(Ljava/io/Reader;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lio/sentry/g2;->x:Ljava/util/ArrayDeque;

    const/4 v0, 0x0

    iput v0, p0, Lio/sentry/g2;->y:I

    new-instance v0, Lio/sentry/vendor/gson/stream/a;

    invoke-direct {v0, p1}, Lio/sentry/vendor/gson/stream/a;-><init>(Ljava/io/Reader;)V

    iput-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    return-void
.end method


# virtual methods
.method public final I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v1}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    new-instance v2, Lio/sentry/f2;

    iget v3, p0, Lio/sentry/g2;->y:I

    invoke-direct {v2, v3, v1}, Lio/sentry/f2;-><init>(ILio/sentry/vendor/gson/stream/b;)V

    iget-object v1, p0, Lio/sentry/g2;->x:Ljava/util/ArrayDeque;

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0}, Lio/sentry/g2;->U0()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p0, v2}, Lio/sentry/g2;->b(Lio/sentry/f2;)V

    return-void

    :catchall_0
    move-exception p1

    move-object v0, v2

    goto :goto_2

    :catch_0
    move-exception p2

    move-object v0, v2

    goto :goto_0

    :catch_1
    move-exception p2

    :goto_0
    :try_start_2
    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Error deserializing unknown key: %s"

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p1, v1, p2, v2, p3}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v0, :cond_0

    :try_start_3
    invoke-virtual {p0, v0}, Lio/sentry/g2;->k(Lio/sentry/f2;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :catch_2
    move-exception p2

    :try_start_4
    sget-object p3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v1, "Stream unrecoverable after unknown key deserialization failure."

    invoke-interface {p1, p3, v1, p2}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_0
    :goto_1
    invoke-virtual {p0, v0}, Lio/sentry/g2;->b(Lio/sentry/f2;)V

    return-void

    :goto_2
    invoke-virtual {p0, v0}, Lio/sentry/g2;->b(Lio/sentry/f2;)V

    throw p1
.end method

.method public final K(Lio/sentry/v0;)Ljava/util/TimeZone;
    .locals 4

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lio/sentry/g2;->i()V

    return-object v2

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/g2;->nextString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Error when deserializing TimeZone"

    invoke-interface {p1, v1, v3, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v2
.end method

.method public final O0()Ljava/lang/Float;
    .locals 2

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lio/sentry/g2;->i()V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lio/sentry/g2;->nextFloat()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public final R()Ljava/lang/Double;
    .locals 2

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lio/sentry/g2;->i()V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lio/sentry/g2;->nextDouble()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public final U(Lio/sentry/v0;)Ljava/util/Date;
    .locals 4

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lio/sentry/g2;->i()V

    return-object v2

    :cond_0
    invoke-virtual {p0}, Lio/sentry/g2;->nextString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v2

    :cond_1
    :try_start_0
    invoke-static {v0}, Ljc/x;->Q(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :try_start_1
    invoke-static {v0}, Ljc/x;->R(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Error when deserializing millis timestamp format."

    invoke-interface {p1, v1, v3, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object v2
.end method

.method public final U0()Ljava/lang/Object;
    .locals 5

    new-instance v0, Lio/sentry/e2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/sentry/e2;-><init>(I)V

    :goto_0
    if-nez v1, :cond_0

    sget-object v2, Lio/sentry/x1;->a:[I

    iget-object v3, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v3}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v2, v2, v4

    iget-object v4, v0, Lio/sentry/e2;->a:Ljava/util/ArrayList;

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 v1, 0x1

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, Lio/sentry/g2;->i()V

    new-instance v1, Li5/c;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Li5/c;-><init>(I)V

    invoke-virtual {v0, v1}, Lio/sentry/e2;->e(Lio/sentry/y1;)Z

    move-result v1

    goto :goto_0

    :pswitch_2
    new-instance v1, Lio/sentry/w1;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lio/sentry/w1;-><init>(Lio/sentry/g2;I)V

    invoke-virtual {v0, v1}, Lio/sentry/e2;->e(Lio/sentry/y1;)Z

    move-result v1

    goto :goto_0

    :pswitch_3
    new-instance v1, Lbu/d;

    const/4 v2, 0x2

    invoke-direct {v1, v2, v0, p0}, Lbu/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lio/sentry/e2;->e(Lio/sentry/y1;)Z

    move-result v1

    goto :goto_0

    :pswitch_4
    new-instance v1, Lio/sentry/w1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/sentry/w1;-><init>(Lio/sentry/g2;I)V

    invoke-virtual {v0, v1}, Lio/sentry/e2;->e(Lio/sentry/y1;)Z

    move-result v1

    goto :goto_0

    :pswitch_5
    new-instance v2, Lio/sentry/c2;

    invoke-virtual {v3}, Lio/sentry/vendor/gson/stream/a;->nextName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lio/sentry/c2;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_6
    invoke-virtual {p0}, Lio/sentry/g2;->endObject()V

    invoke-virtual {v0}, Lio/sentry/e2;->d()Z

    move-result v1

    goto :goto_0

    :pswitch_7
    invoke-virtual {p0}, Lio/sentry/g2;->beginObject()V

    new-instance v2, Lio/sentry/b2;

    invoke-direct {v2}, Lio/sentry/b2;-><init>()V

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_8
    invoke-virtual {p0}, Lio/sentry/g2;->endArray()V

    invoke-virtual {v0}, Lio/sentry/e2;->d()Z

    move-result v1

    goto :goto_0

    :pswitch_9
    invoke-virtual {p0}, Lio/sentry/g2;->beginArray()V

    new-instance v2, Lio/sentry/a2;

    invoke-direct {v2}, Lio/sentry/a2;-><init>()V

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/sentry/e2;->c()Lio/sentry/z1;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lio/sentry/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final W()Ljava/lang/Boolean;
    .locals 3

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v1, v2, :cond_0

    invoke-virtual {p0}, Lio/sentry/g2;->i()V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->s()Z

    move-result v0

    invoke-virtual {p0}, Lio/sentry/g2;->h()V

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lio/sentry/g2;->i()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p2, p0, p1}, Lio/sentry/v1;->a(Lio/sentry/j3;Lio/sentry/v0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lio/sentry/f2;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/sentry/g2;->x:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, p1, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    return-void

    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final beginArray()V
    .locals 1

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->beginArray()V

    invoke-virtual {p0}, Lio/sentry/g2;->h()V

    iget v0, p0, Lio/sentry/g2;->y:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lio/sentry/g2;->y:I

    return-void
.end method

.method public final beginObject()V
    .locals 1

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->beginObject()V

    invoke-virtual {p0}, Lio/sentry/g2;->h()V

    iget v0, p0, Lio/sentry/g2;->y:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lio/sentry/g2;->y:I

    return-void
.end method

.method public final c1(Lio/sentry/v0;Lio/sentry/v1;)Ljava/util/ArrayList;
    .locals 7

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v1, v2, :cond_0

    invoke-virtual {p0}, Lio/sentry/g2;->i()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lio/sentry/g2;->beginArray()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    new-instance v3, Lio/sentry/f2;

    iget v4, p0, Lio/sentry/g2;->y:I

    invoke-direct {v3, v4, v2}, Lio/sentry/f2;-><init>(ILio/sentry/vendor/gson/stream/b;)V

    iget-object v2, p0, Lio/sentry/g2;->x:Ljava/util/ArrayDeque;

    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    :try_start_0
    invoke-interface {p2, p0, p1}, Lio/sentry/v1;->a(Lio/sentry/j3;Lio/sentry/v0;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    invoke-virtual {p0, v3}, Lio/sentry/g2;->b(Lio/sentry/f2;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception v2

    :try_start_1
    const-string v4, "Failed to deserialize object in list."

    const-string v5, "Stream unrecoverable, aborting list deserialization."

    sget-object v6, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    invoke-interface {p1, v6, v4, v2}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p0, v3}, Lio/sentry/g2;->k(Lio/sentry/f2;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v2, 0x1

    goto :goto_1

    :catch_1
    move-exception v2

    :try_start_3
    sget-object v4, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {p1, v4, v5, v2}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_1

    invoke-virtual {p0, v3}, Lio/sentry/g2;->b(Lio/sentry/f2;)V

    goto :goto_3

    :goto_2
    invoke-virtual {p0, v3}, Lio/sentry/g2;->b(Lio/sentry/f2;)V

    throw p1

    :cond_2
    :goto_3
    invoke-virtual {p0}, Lio/sentry/g2;->endArray()V

    return-object v1
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->close()V

    return-void
.end method

.method public final endArray()V
    .locals 1

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->endArray()V

    iget v0, p0, Lio/sentry/g2;->y:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lio/sentry/g2;->y:I

    return-void
.end method

.method public final endObject()V
    .locals 1

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->endObject()V

    iget v0, p0, Lio/sentry/g2;->y:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lio/sentry/g2;->y:I

    return-void
.end method

.method public final h()V
    .locals 2

    iget-object v0, p0, Lio/sentry/g2;->x:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/f2;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lio/sentry/f2;->c:Z

    :cond_0
    return-void
.end method

.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final i()V
    .locals 1

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->J()V

    invoke-virtual {p0}, Lio/sentry/g2;->h()V

    return-void
.end method

.method public final k(Lio/sentry/f2;)V
    .locals 3

    :goto_0
    iget v0, p0, Lio/sentry/g2;->y:I

    iget v1, p1, Lio/sentry/f2;->a:I

    iget-object v2, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    if-le v0, v1, :cond_2

    invoke-virtual {v2}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    sget-object v1, Lio/sentry/vendor/gson/stream/b;->END_OBJECT:Lio/sentry/vendor/gson/stream/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lio/sentry/g2;->endObject()V

    goto :goto_0

    :cond_0
    sget-object v1, Lio/sentry/vendor/gson/stream/b;->END_ARRAY:Lio/sentry/vendor/gson/stream/b;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lio/sentry/g2;->endArray()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/sentry/g2;->skipValue()V

    goto :goto_0

    :cond_2
    iget-boolean v0, p1, Lio/sentry/f2;->c:Z

    if-nez v0, :cond_3

    invoke-virtual {v2}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    iget-object p1, p1, Lio/sentry/f2;->b:Lio/sentry/vendor/gson/stream/b;

    if-ne v0, p1, :cond_3

    invoke-virtual {p0}, Lio/sentry/g2;->skipValue()V

    :cond_3
    return-void
.end method

.method public final nextDouble()D
    .locals 2

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->nextDouble()D

    move-result-wide v0

    invoke-virtual {p0}, Lio/sentry/g2;->h()V

    return-wide v0
.end method

.method public final nextFloat()F
    .locals 2

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->nextDouble()D

    move-result-wide v0

    invoke-virtual {p0}, Lio/sentry/g2;->h()V

    double-to-float v0, v0

    return v0
.end method

.method public final nextInt()I
    .locals 8

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    iget v1, v0, Lio/sentry/vendor/gson/stream/a;->H:I

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->h()I

    move-result v1

    :cond_0
    const/16 v2, 0xf

    const/4 v3, 0x0

    const-string v4, "Expected an int but was "

    if-ne v1, v2, :cond_2

    iget-wide v1, v0, Lio/sentry/vendor/gson/stream/a;->I:J

    long-to-int v5, v1

    int-to-long v6, v5

    cmp-long v1, v1, v6

    if-nez v1, :cond_1

    iput v3, v0, Lio/sentry/vendor/gson/stream/a;->H:I

    iget-object v1, v0, Lio/sentry/vendor/gson/stream/a;->O:[I

    iget v0, v0, Lio/sentry/vendor/gson/stream/a;->M:I

    add-int/lit8 v0, v0, -0x1

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/NumberFormatException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v3, v0, Lio/sentry/vendor/gson/stream/a;->I:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    const/16 v2, 0x10

    if-ne v1, v2, :cond_3

    new-instance v1, Ljava/lang/String;

    iget-object v2, v0, Lio/sentry/vendor/gson/stream/a;->y:[C

    iget v5, v0, Lio/sentry/vendor/gson/stream/a;->z:I

    iget v6, v0, Lio/sentry/vendor/gson/stream/a;->J:I

    invoke-direct {v1, v2, v5, v6}, Ljava/lang/String;-><init>([CII)V

    iput-object v1, v0, Lio/sentry/vendor/gson/stream/a;->K:Ljava/lang/String;

    iget v1, v0, Lio/sentry/vendor/gson/stream/a;->z:I

    iget v2, v0, Lio/sentry/vendor/gson/stream/a;->J:I

    add-int/2addr v1, v2

    iput v1, v0, Lio/sentry/vendor/gson/stream/a;->z:I

    goto :goto_3

    :cond_3
    const/16 v2, 0xa

    const/16 v5, 0x8

    if-eq v1, v5, :cond_5

    const/16 v6, 0x9

    if-eq v1, v6, :cond_5

    if-ne v1, v2, :cond_4

    goto :goto_0

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    :goto_0
    if-ne v1, v2, :cond_6

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->a0()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/vendor/gson/stream/a;->K:Ljava/lang/String;

    goto :goto_2

    :cond_6
    if-ne v1, v5, :cond_7

    const/16 v1, 0x27

    goto :goto_1

    :cond_7
    const/16 v1, 0x22

    :goto_1
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/a;->T(C)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/vendor/gson/stream/a;->K:Ljava/lang/String;

    :goto_2
    :try_start_0
    iget-object v1, v0, Lio/sentry/vendor/gson/stream/a;->K:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    iput v3, v0, Lio/sentry/vendor/gson/stream/a;->H:I

    iget-object v1, v0, Lio/sentry/vendor/gson/stream/a;->O:[I

    iget v2, v0, Lio/sentry/vendor/gson/stream/a;->M:I

    add-int/lit8 v2, v2, -0x1

    aget v6, v1, v2

    add-int/lit8 v6, v6, 0x1

    aput v6, v1, v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    :goto_3
    const/16 v1, 0xb

    iput v1, v0, Lio/sentry/vendor/gson/stream/a;->H:I

    iget-object v1, v0, Lio/sentry/vendor/gson/stream/a;->K:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    double-to-int v5, v1

    int-to-double v6, v5

    cmpl-double v1, v6, v1

    if-nez v1, :cond_8

    const/4 v1, 0x0

    iput-object v1, v0, Lio/sentry/vendor/gson/stream/a;->K:Ljava/lang/String;

    iput v3, v0, Lio/sentry/vendor/gson/stream/a;->H:I

    iget-object v1, v0, Lio/sentry/vendor/gson/stream/a;->O:[I

    iget v0, v0, Lio/sentry/vendor/gson/stream/a;->M:I

    add-int/lit8 v0, v0, -0x1

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    :goto_4
    invoke-virtual {p0}, Lio/sentry/g2;->h()V

    return v5

    :cond_8
    new-instance v1, Ljava/lang/NumberFormatException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v0, Lio/sentry/vendor/gson/stream/a;->K:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final nextLong()J
    .locals 9

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    iget v1, v0, Lio/sentry/vendor/gson/stream/a;->H:I

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->h()I

    move-result v1

    :cond_0
    const/16 v2, 0xf

    const/4 v3, 0x0

    if-ne v1, v2, :cond_1

    iput v3, v0, Lio/sentry/vendor/gson/stream/a;->H:I

    iget-object v1, v0, Lio/sentry/vendor/gson/stream/a;->O:[I

    iget v2, v0, Lio/sentry/vendor/gson/stream/a;->M:I

    add-int/lit8 v2, v2, -0x1

    aget v3, v1, v2

    add-int/lit8 v3, v3, 0x1

    aput v3, v1, v2

    iget-wide v0, v0, Lio/sentry/vendor/gson/stream/a;->I:J

    goto/16 :goto_4

    :cond_1
    const/16 v2, 0x10

    const-string v4, "Expected a long but was "

    if-ne v1, v2, :cond_2

    new-instance v1, Ljava/lang/String;

    iget-object v2, v0, Lio/sentry/vendor/gson/stream/a;->y:[C

    iget v5, v0, Lio/sentry/vendor/gson/stream/a;->z:I

    iget v6, v0, Lio/sentry/vendor/gson/stream/a;->J:I

    invoke-direct {v1, v2, v5, v6}, Ljava/lang/String;-><init>([CII)V

    iput-object v1, v0, Lio/sentry/vendor/gson/stream/a;->K:Ljava/lang/String;

    iget v1, v0, Lio/sentry/vendor/gson/stream/a;->z:I

    iget v2, v0, Lio/sentry/vendor/gson/stream/a;->J:I

    add-int/2addr v1, v2

    iput v1, v0, Lio/sentry/vendor/gson/stream/a;->z:I

    goto :goto_3

    :cond_2
    const/16 v2, 0xa

    const/16 v5, 0x8

    if-eq v1, v5, :cond_4

    const/16 v6, 0x9

    if-eq v1, v6, :cond_4

    if-ne v1, v2, :cond_3

    goto :goto_0

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    :goto_0
    if-ne v1, v2, :cond_5

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->a0()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/vendor/gson/stream/a;->K:Ljava/lang/String;

    goto :goto_2

    :cond_5
    if-ne v1, v5, :cond_6

    const/16 v1, 0x27

    goto :goto_1

    :cond_6
    const/16 v1, 0x22

    :goto_1
    invoke-virtual {v0, v1}, Lio/sentry/vendor/gson/stream/a;->T(C)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/vendor/gson/stream/a;->K:Ljava/lang/String;

    :goto_2
    :try_start_0
    iget-object v1, v0, Lio/sentry/vendor/gson/stream/a;->K:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    iput v3, v0, Lio/sentry/vendor/gson/stream/a;->H:I

    iget-object v5, v0, Lio/sentry/vendor/gson/stream/a;->O:[I

    iget v6, v0, Lio/sentry/vendor/gson/stream/a;->M:I

    add-int/lit8 v6, v6, -0x1

    aget v7, v5, v6

    add-int/lit8 v7, v7, 0x1

    aput v7, v5, v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-wide v0, v1

    goto :goto_4

    :catch_0
    :goto_3
    const/16 v1, 0xb

    iput v1, v0, Lio/sentry/vendor/gson/stream/a;->H:I

    iget-object v1, v0, Lio/sentry/vendor/gson/stream/a;->K:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    double-to-long v5, v1

    long-to-double v7, v5

    cmpl-double v1, v7, v1

    if-nez v1, :cond_7

    const/4 v1, 0x0

    iput-object v1, v0, Lio/sentry/vendor/gson/stream/a;->K:Ljava/lang/String;

    iput v3, v0, Lio/sentry/vendor/gson/stream/a;->H:I

    iget-object v1, v0, Lio/sentry/vendor/gson/stream/a;->O:[I

    iget v0, v0, Lio/sentry/vendor/gson/stream/a;->M:I

    add-int/lit8 v0, v0, -0x1

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    move-wide v0, v5

    :goto_4
    invoke-virtual {p0}, Lio/sentry/g2;->h()V

    return-wide v0

    :cond_7
    new-instance v1, Ljava/lang/NumberFormatException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v0, Lio/sentry/vendor/gson/stream/a;->K:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final nextName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->nextName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final nextString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->nextString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lio/sentry/g2;->h()V

    return-object v0
.end method

.method public final peek()Lio/sentry/vendor/gson/stream/b;
    .locals 1

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    return-object v0
.end method

.method public final q0()Ljava/lang/Integer;
    .locals 2

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lio/sentry/g2;->i()V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lio/sentry/g2;->nextInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final s0()Ljava/lang/Long;
    .locals 2

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lio/sentry/g2;->i()V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lio/sentry/g2;->nextLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final setLenient(Z)V
    .locals 1

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    iput-boolean p1, v0, Lio/sentry/vendor/gson/stream/a;->x:Z

    return-void
.end method

.method public final skipValue()V
    .locals 11

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    iget-object v2, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    iget v3, v2, Lio/sentry/vendor/gson/stream/a;->H:I

    if-nez v3, :cond_1

    invoke-virtual {v2}, Lio/sentry/vendor/gson/stream/a;->h()I

    move-result v3

    :cond_1
    const/4 v4, 0x3

    const/4 v5, 0x1

    if-ne v3, v4, :cond_2

    invoke-virtual {v2, v5}, Lio/sentry/vendor/gson/stream/a;->b0(I)V

    :goto_0
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_6

    :cond_2
    if-ne v3, v5, :cond_3

    invoke-virtual {v2, v4}, Lio/sentry/vendor/gson/stream/a;->b0(I)V

    goto :goto_0

    :cond_3
    const/4 v4, 0x4

    if-ne v3, v4, :cond_4

    iget v3, v2, Lio/sentry/vendor/gson/stream/a;->M:I

    sub-int/2addr v3, v5

    iput v3, v2, Lio/sentry/vendor/gson/stream/a;->M:I

    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto/16 :goto_6

    :cond_4
    const/4 v4, 0x2

    if-ne v3, v4, :cond_5

    iget v3, v2, Lio/sentry/vendor/gson/stream/a;->M:I

    sub-int/2addr v3, v5

    iput v3, v2, Lio/sentry/vendor/gson/stream/a;->M:I

    goto :goto_1

    :cond_5
    const/16 v4, 0xe

    const/16 v6, 0xd

    const/16 v7, 0x9

    const/16 v8, 0xc

    const/16 v9, 0xa

    if-eq v3, v4, :cond_b

    if-ne v3, v9, :cond_6

    goto :goto_4

    :cond_6
    const/16 v4, 0x8

    if-eq v3, v4, :cond_a

    if-ne v3, v8, :cond_7

    goto :goto_3

    :cond_7
    if-eq v3, v7, :cond_9

    if-ne v3, v6, :cond_8

    goto :goto_2

    :cond_8
    const/16 v4, 0x10

    if-ne v3, v4, :cond_f

    iget v3, v2, Lio/sentry/vendor/gson/stream/a;->z:I

    iget v4, v2, Lio/sentry/vendor/gson/stream/a;->J:I

    add-int/2addr v3, v4

    iput v3, v2, Lio/sentry/vendor/gson/stream/a;->z:I

    goto :goto_6

    :cond_9
    :goto_2
    const/16 v3, 0x22

    invoke-virtual {v2, v3}, Lio/sentry/vendor/gson/stream/a;->p0(C)V

    goto :goto_6

    :cond_a
    :goto_3
    const/16 v3, 0x27

    invoke-virtual {v2, v3}, Lio/sentry/vendor/gson/stream/a;->p0(C)V

    goto :goto_6

    :cond_b
    :goto_4
    move v3, v0

    :goto_5
    iget v4, v2, Lio/sentry/vendor/gson/stream/a;->z:I

    add-int/2addr v4, v3

    iget v10, v2, Lio/sentry/vendor/gson/stream/a;->E:I

    if-ge v4, v10, :cond_e

    iget-object v10, v2, Lio/sentry/vendor/gson/stream/a;->y:[C

    aget-char v4, v10, v4

    if-eq v4, v7, :cond_d

    if-eq v4, v9, :cond_d

    if-eq v4, v8, :cond_d

    if-eq v4, v6, :cond_d

    const/16 v10, 0x20

    if-eq v4, v10, :cond_d

    const/16 v10, 0x23

    if-eq v4, v10, :cond_c

    const/16 v10, 0x2c

    if-eq v4, v10, :cond_d

    const/16 v10, 0x2f

    if-eq v4, v10, :cond_c

    const/16 v10, 0x3d

    if-eq v4, v10, :cond_c

    const/16 v10, 0x7b

    if-eq v4, v10, :cond_d

    const/16 v10, 0x7d

    if-eq v4, v10, :cond_d

    const/16 v10, 0x3a

    if-eq v4, v10, :cond_d

    const/16 v10, 0x3b

    if-eq v4, v10, :cond_c

    packed-switch v4, :pswitch_data_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_c
    :pswitch_0
    invoke-virtual {v2}, Lio/sentry/vendor/gson/stream/a;->b()V

    :cond_d
    :pswitch_1
    iget v4, v2, Lio/sentry/vendor/gson/stream/a;->z:I

    add-int/2addr v4, v3

    iput v4, v2, Lio/sentry/vendor/gson/stream/a;->z:I

    goto :goto_6

    :cond_e
    iput v4, v2, Lio/sentry/vendor/gson/stream/a;->z:I

    invoke-virtual {v2, v5}, Lio/sentry/vendor/gson/stream/a;->i(I)Z

    move-result v3

    if-nez v3, :cond_b

    :cond_f
    :goto_6
    iput v0, v2, Lio/sentry/vendor/gson/stream/a;->H:I

    if-nez v1, :cond_0

    iget-object v0, v2, Lio/sentry/vendor/gson/stream/a;->O:[I

    iget v1, v2, Lio/sentry/vendor/gson/stream/a;->M:I

    sub-int/2addr v1, v5

    aget v3, v0, v1

    add-int/2addr v3, v5

    aput v3, v0, v1

    iget-object v0, v2, Lio/sentry/vendor/gson/stream/a;->N:[Ljava/lang/String;

    const-string v2, "null"

    aput-object v2, v0, v1

    invoke-virtual {p0}, Lio/sentry/g2;->h()V

    return-void

    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final w0()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lio/sentry/g2;->i()V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lio/sentry/g2;->nextString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final y0(Lio/sentry/v0;Lio/sentry/v1;)Ljava/util/HashMap;
    .locals 7

    iget-object v0, p0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    if-ne v1, v2, :cond_0

    invoke-virtual {p0}, Lio/sentry/g2;->i()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lio/sentry/g2;->beginObject()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_1
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->nextName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v3

    new-instance v4, Lio/sentry/f2;

    iget v5, p0, Lio/sentry/g2;->y:I

    invoke-direct {v4, v5, v3}, Lio/sentry/f2;-><init>(ILio/sentry/vendor/gson/stream/b;)V

    iget-object v3, p0, Lio/sentry/g2;->x:Ljava/util/ArrayDeque;

    invoke-virtual {v3, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    :try_start_0
    invoke-interface {p2, p0, p1}, Lio/sentry/v1;->a(Lio/sentry/j3;Lio/sentry/v0;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    invoke-virtual {p0, v4}, Lio/sentry/g2;->b(Lio/sentry/f2;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception v2

    :try_start_1
    const-string v3, "Failed to deserialize object in map."

    const-string v5, "Stream unrecoverable, aborting map deserialization."

    sget-object v6, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    invoke-interface {p1, v6, v3, v2}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p0, v4}, Lio/sentry/g2;->k(Lio/sentry/f2;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v2, 0x1

    goto :goto_0

    :catch_1
    move-exception v2

    :try_start_3
    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {p1, v3, v5, v2}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_2

    invoke-virtual {p0, v4}, Lio/sentry/g2;->b(Lio/sentry/f2;)V

    goto :goto_3

    :goto_1
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v3, Lio/sentry/vendor/gson/stream/b;->BEGIN_OBJECT:Lio/sentry/vendor/gson/stream/b;

    if-eq v2, v3, :cond_1

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v3, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-eq v2, v3, :cond_1

    goto :goto_3

    :goto_2
    invoke-virtual {p0, v4}, Lio/sentry/g2;->b(Lio/sentry/f2;)V

    throw p1

    :cond_3
    :goto_3
    invoke-virtual {p0}, Lio/sentry/g2;->endObject()V

    return-object v1
.end method
