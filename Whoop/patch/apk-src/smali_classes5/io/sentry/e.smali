.class public final Lio/sentry/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;
.implements Ljava/lang/Comparable;


# instance fields
.field public E:Ljava/lang/String;

.field public F:Ljava/util/concurrent/ConcurrentHashMap;

.field public G:Ljava/lang/String;

.field public H:Ljava/lang/String;

.field public I:Lio/sentry/n5;

.field public J:Ljava/util/concurrent/ConcurrentHashMap;

.field public final w:Ljava/lang/Long;

.field public x:Ljava/util/Date;

.field public final y:Ljava/lang/Long;

.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 24
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lio/sentry/e;-><init>(J)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/e;->y:Ljava/lang/Long;

    .line 9
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/e;->w:Ljava/lang/Long;

    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Lio/sentry/e;->x:Ljava/util/Date;

    return-void
.end method

.method public constructor <init>(Lio/sentry/e;)V
    .locals 2

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/e;->y:Ljava/lang/Long;

    .line 14
    iget-object v0, p1, Lio/sentry/e;->x:Ljava/util/Date;

    iput-object v0, p0, Lio/sentry/e;->x:Ljava/util/Date;

    .line 15
    iget-object v0, p1, Lio/sentry/e;->w:Ljava/lang/Long;

    iput-object v0, p0, Lio/sentry/e;->w:Ljava/lang/Long;

    .line 16
    iget-object v0, p1, Lio/sentry/e;->z:Ljava/lang/String;

    iput-object v0, p0, Lio/sentry/e;->z:Ljava/lang/String;

    .line 17
    iget-object v0, p1, Lio/sentry/e;->E:Ljava/lang/String;

    iput-object v0, p0, Lio/sentry/e;->E:Ljava/lang/String;

    .line 18
    iget-object v0, p1, Lio/sentry/e;->G:Ljava/lang/String;

    iput-object v0, p0, Lio/sentry/e;->G:Ljava/lang/String;

    .line 19
    iget-object v0, p1, Lio/sentry/e;->H:Ljava/lang/String;

    iput-object v0, p0, Lio/sentry/e;->H:Ljava/lang/String;

    .line 20
    iget-object v0, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 21
    iput-object v0, p0, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    :cond_0
    iget-object v0, p1, Lio/sentry/e;->J:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/e;->J:Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    iget-object p1, p1, Lio/sentry/e;->I:Lio/sentry/n5;

    iput-object p1, p0, Lio/sentry/e;->I:Lio/sentry/n5;

    return-void
.end method

.method public constructor <init>(Ljava/util/Date;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/e;->y:Ljava/lang/Long;

    .line 4
    iput-object p1, p0, Lio/sentry/e;->x:Ljava/util/Date;

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lio/sentry/e;->w:Ljava/lang/Long;

    return-void
.end method

.method public static a(Lio/sentry/e;Lio/sentry/e;)Z
    .locals 4

    invoke-virtual {p0}, Lio/sentry/e;->b()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p1}, Lio/sentry/e;->b()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/sentry/e;->z:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/e;->z:Ljava/lang/String;

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/sentry/e;->E:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/e;->E:Ljava/lang/String;

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/sentry/e;->G:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/e;->G:Ljava/lang/String;

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/sentry/e;->H:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/e;->H:Ljava/lang/String;

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lio/sentry/e;->I:Lio/sentry/n5;

    iget-object p1, p1, Lio/sentry/e;->I:Lio/sentry/n5;

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/sentry/e;
    .locals 2

    new-instance v0, Lio/sentry/e;

    invoke-direct {v0}, Lio/sentry/e;-><init>()V

    const-string v1, "user"

    iput-object v1, v0, Lio/sentry/e;->E:Ljava/lang/String;

    const-string v1, "ui."

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lio/sentry/e;->G:Ljava/lang/String;

    if-eqz p1, :cond_0

    const-string p0, "view.id"

    invoke-virtual {v0, p1, p0}, Lio/sentry/e;->c(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_1

    const-string p0, "view.class"

    invoke-virtual {v0, p2, p0}, Lio/sentry/e;->c(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    if-eqz p3, :cond_2

    const-string p0, "view.tag"

    invoke-virtual {v0, p3, p0}, Lio/sentry/e;->c(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    invoke-interface {p4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    iget-object p2, v0, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    sget-object p0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    iput-object p0, v0, Lio/sentry/e;->I:Lio/sentry/n5;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/util/Date;
    .locals 2

    iget-object v0, p0, Lio/sentry/e;->x:Ljava/util/Date;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/Date;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/e;->w:Ljava/lang/Long;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljc/x;->P(J)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/e;->x:Ljava/util/Date;

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No timestamp set for breadcrumb"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    if-nez p2, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    iget-object p1, p0, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    iget-object v0, p0, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lio/sentry/e;

    iget-object v0, p0, Lio/sentry/e;->y:Ljava/lang/Long;

    iget-object p1, p1, Lio/sentry/e;->y:Ljava/lang/Long;

    invoke-virtual {v0, p1}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    goto/16 :goto_0

    :cond_0
    if-eqz p1, :cond_3

    const-class v0, Lio/sentry/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto/16 :goto_1

    :cond_1
    check-cast p1, Lio/sentry/e;

    const-string v0, "http"

    iget-object v1, p0, Lio/sentry/e;->E:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0, p1}, Lio/sentry/e;->a(Lio/sentry/e;Lio/sentry/e;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v1, "status_code"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v1, "url"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v1, "method"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v1, "http.fragment"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v1, "http.query"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object p1, p1, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    invoke-static {p0, p1}, Lio/sentry/e;->a(Lio/sentry/e;Lio/sentry/e;)Z

    move-result p1

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 13

    const-string v0, "http"

    iget-object v1, p0, Lio/sentry/e;->E:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/e;->b()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-object v3, p0, Lio/sentry/e;->z:Ljava/lang/String;

    iget-object v4, p0, Lio/sentry/e;->E:Ljava/lang/String;

    iget-object v5, p0, Lio/sentry/e;->G:Ljava/lang/String;

    iget-object v6, p0, Lio/sentry/e;->H:Ljava/lang/String;

    iget-object v7, p0, Lio/sentry/e;->I:Lio/sentry/n5;

    const-string v0, "status_code"

    iget-object v1, p0, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    const-string v0, "url"

    iget-object v1, p0, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    const-string v0, "method"

    iget-object v1, p0, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    const-string v0, "http.fragment"

    iget-object v1, p0, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    const-string v0, "http.query"

    iget-object v1, p0, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    filled-new-array/range {v2 .. v12}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0}, Lio/sentry/e;->b()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-object v3, p0, Lio/sentry/e;->z:Ljava/lang/String;

    iget-object v4, p0, Lio/sentry/e;->E:Ljava/lang/String;

    iget-object v5, p0, Lio/sentry/e;->G:Ljava/lang/String;

    iget-object v6, p0, Lio/sentry/e;->H:Ljava/lang/String;

    iget-object v7, p0, Lio/sentry/e;->I:Lio/sentry/n5;

    filled-new-array/range {v2 .. v7}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    const-string v0, "timestamp"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p0}, Lio/sentry/e;->b()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e;->z:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "message"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e;->z:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_0
    iget-object v0, p0, Lio/sentry/e;->E:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, "type"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e;->E:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_1
    const-string v0, "data"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e;->G:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v0, "category"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e;->G:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_2
    iget-object v0, p0, Lio/sentry/e;->H:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v0, "origin"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e;->H:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_3
    iget-object v0, p0, Lio/sentry/e;->I:Lio/sentry/n5;

    if-eqz v0, :cond_4

    const-string v0, "level"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/e;->I:Lio/sentry/n5;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_4
    iget-object v0, p0, Lio/sentry/e;->J:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/e;->J:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method
