.class public abstract Lio/sentry/protocol/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/v1;


# direct methods
.method public static b(Lio/sentry/j3;Lio/sentry/v0;)Lio/sentry/protocol/i;
    .locals 4

    invoke-interface {p0}, Lio/sentry/j3;->beginObject()V

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    invoke-interface {p0}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v3, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v2, v3, :cond_2

    invoke-interface {p0}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "values"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_0
    invoke-interface {p0, p1, v1, v2}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lio/sentry/clientreport/e;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, Lio/sentry/clientreport/e;-><init>(I)V

    invoke-interface {p0, p1, v0}, Lio/sentry/j3;->c1(Lio/sentry/v0;Lio/sentry/v1;)Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-nez v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_3
    new-instance p1, Lio/sentry/protocol/i;

    invoke-direct {p1, v0}, Lio/sentry/protocol/i;-><init>(Ljava/util/List;)V

    iput-object v1, p1, Lio/sentry/protocol/i;->x:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p0}, Lio/sentry/j3;->endObject()V

    return-object p1
.end method

.method public static c(Lio/sentry/j3;Lio/sentry/v0;)Lio/sentry/protocol/r;
    .locals 5

    invoke-interface {p0}, Lio/sentry/j3;->beginObject()V

    new-instance v0, Lio/sentry/protocol/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v3, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v2, v3, :cond_7

    invoke-interface {p0}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, -0x1

    sparse-switch v3, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v3, "body_size"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x4

    goto :goto_1

    :sswitch_1
    const-string v3, "cookies"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v4, 0x3

    goto :goto_1

    :sswitch_2
    const-string v3, "headers"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    const/4 v4, 0x2

    goto :goto_1

    :sswitch_3
    const-string v3, "data"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_1

    :cond_4
    const/4 v4, 0x1

    goto :goto_1

    :sswitch_4
    const-string v3, "status_code"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_1

    :cond_5
    const/4 v4, 0x0

    :goto_1
    packed-switch v4, :pswitch_data_0

    if-nez v1, :cond_6

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_6
    invoke-interface {p0, p1, v1, v2}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_0
    invoke-interface {p0}, Lio/sentry/j3;->s0()Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/r;->z:Ljava/lang/Long;

    goto :goto_0

    :pswitch_1
    invoke-interface {p0}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/r;->w:Ljava/lang/String;

    goto :goto_0

    :pswitch_2
    invoke-interface {p0}, Lio/sentry/j3;->U0()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    if-eqz v2, :cond_0

    invoke-static {v2}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/r;->x:Ljava/util/concurrent/ConcurrentHashMap;

    goto :goto_0

    :pswitch_3
    invoke-interface {p0}, Lio/sentry/j3;->U0()Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/r;->E:Ljava/lang/Object;

    goto :goto_0

    :pswitch_4
    invoke-interface {p0}, Lio/sentry/j3;->q0()Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/r;->y:Ljava/lang/Integer;

    goto/16 :goto_0

    :cond_7
    iput-object v1, v0, Lio/sentry/protocol/r;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p0}, Lio/sentry/j3;->endObject()V

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x352641e6 -> :sswitch_4
        0x2eefaa -> :sswitch_3
        0x2f676f86 -> :sswitch_2
        0x38c1428f -> :sswitch_1
        0x4aaf147e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static d(Lio/sentry/j3;Lio/sentry/v0;)Lio/sentry/protocol/e0;
    .locals 4

    invoke-interface {p0}, Lio/sentry/j3;->beginObject()V

    new-instance v0, Lio/sentry/protocol/e0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v3, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v2, v3, :cond_3

    invoke-interface {p0}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "active_profiles"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    if-nez v1, :cond_1

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_1
    invoke-interface {p0, p1, v1, v2}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-interface {p0}, Lio/sentry/j3;->U0()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    iput-object v3, v0, Lio/sentry/protocol/e0;->w:[Ljava/lang/String;

    goto :goto_0

    :cond_3
    iput-object v1, v0, Lio/sentry/protocol/e0;->x:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p0}, Lio/sentry/j3;->endObject()V

    return-object v0
.end method

.method public static e(Lio/sentry/j3;Lio/sentry/v0;)Lio/sentry/protocol/f0;
    .locals 4

    invoke-interface {p0}, Lio/sentry/j3;->beginObject()V

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    invoke-interface {p0}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v3, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v2, v3, :cond_2

    invoke-interface {p0}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "source"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_0
    invoke-interface {p0, p1, v1, v2}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance p1, Lio/sentry/protocol/f0;

    invoke-direct {p1, v0}, Lio/sentry/protocol/f0;-><init>(Ljava/lang/String;)V

    iput-object v1, p1, Lio/sentry/protocol/f0;->x:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p0}, Lio/sentry/j3;->endObject()V

    return-object p1
.end method
