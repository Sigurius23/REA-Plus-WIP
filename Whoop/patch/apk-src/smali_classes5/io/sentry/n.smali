.class public final Lio/sentry/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b0;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/util/Map;

.field public final y:Lio/sentry/q6;


# direct methods
.method public constructor <init>(Lio/sentry/q6;I)V
    .locals 0

    iput p2, p0, Lio/sentry/n;->w:I

    packed-switch p2, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    invoke-static {p2}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Lio/sentry/n;->x:Ljava/util/Map;

    iput-object p1, p0, Lio/sentry/n;->y:Lio/sentry/q6;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Ljava/util/WeakHashMap;

    invoke-direct {p2}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {p2}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Lio/sentry/n;->x:Ljava/util/Map;

    iput-object p1, p0, Lio/sentry/n;->y:Lio/sentry/q6;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final h(Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/e5;
    .locals 6

    iget v0, p0, Lio/sentry/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object p2, p0, Lio/sentry/n;->y:Lio/sentry/q6;

    invoke-virtual {p2}, Lio/sentry/q6;->isEnableDeduplication()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lio/sentry/r4;->a()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v1, p0, Lio/sentry/n;->x:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_3

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move-object v4, v0

    :goto_0
    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_2
    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    iget-object p1, p1, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Duplicate Exception detected. Event %s will be discarded."

    invoke-interface {p2, v0, v1, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object p1, v3

    goto :goto_2

    :cond_4
    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Event deduplication is disabled."

    invoke-interface {p2, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_5
    :goto_2
    return-object p1

    :pswitch_0
    const-string v0, "sentry:typeCheckHint"

    invoke-virtual {p2, v0}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-class v1, Lio/sentry/o7;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p1}, Lio/sentry/e5;->f()Lio/sentry/protocol/u;

    move-result-object v0

    if-nez v0, :cond_7

    goto :goto_3

    :cond_7
    iget-object v1, v0, Lio/sentry/protocol/u;->w:Ljava/lang/String;

    if-nez v1, :cond_8

    goto :goto_3

    :cond_8
    iget-object v0, v0, Lio/sentry/protocol/u;->z:Ljava/lang/Long;

    if-nez v0, :cond_9

    goto :goto_3

    :cond_9
    iget-object v2, p0, Lio/sentry/n;->x:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    if-eqz v3, :cond_a

    invoke-virtual {v3, v0}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    iget-object v0, p0, Lio/sentry/n;->y:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    iget-object p1, p1, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Event %s has been dropped due to multi-threaded deduplication"

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lio/sentry/hints/e;->MULTITHREADED_DEDUPLICATION:Lio/sentry/hints/e;

    const-string v0, "sentry:eventDropReason"

    invoke-virtual {p2, p1, v0}, Lio/sentry/g0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    goto :goto_3

    :cond_a
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
