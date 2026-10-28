.class public final Lio/sentry/protocol/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public E:Ljava/util/HashMap;

.field public w:Ljava/lang/String;

.field public x:Ljava/lang/String;

.field public y:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public z:Ljava/util/concurrent/CopyOnWriteArraySet;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/protocol/t;->w:Ljava/lang/String;

    iput-object p2, p0, Lio/sentry/protocol/t;->x:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/protocol/t;->w:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/protocol/t;->x:Ljava/lang/String;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-class v2, Lio/sentry/protocol/t;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lio/sentry/protocol/t;

    iget-object v2, p0, Lio/sentry/protocol/t;->w:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/protocol/t;->w:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/protocol/t;->x:Ljava/lang/String;

    iget-object p1, p1, Lio/sentry/protocol/t;->x:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lio/sentry/protocol/t;->w:Ljava/lang/String;

    iget-object v1, p0, Lio/sentry/protocol/t;->x:Ljava/lang/String;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    const-string v0, "name"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/t;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    const-string v0, "version"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/t;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/t;->y:Ljava/util/concurrent/CopyOnWriteArraySet;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/sentry/l5;->d()Lio/sentry/l5;

    move-result-object v0

    iget-object v0, v0, Lio/sentry/l5;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    :goto_0
    iget-object v1, p0, Lio/sentry/protocol/t;->z:Ljava/util/concurrent/CopyOnWriteArraySet;

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Lio/sentry/l5;->d()Lio/sentry/l5;

    move-result-object v1

    iget-object v1, v1, Lio/sentry/l5;->a:Ljava/util/concurrent/CopyOnWriteArraySet;

    :goto_1
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "packages"

    invoke-virtual {p1, v2}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_2
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "integrations"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, p2, v1}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_3
    iget-object v0, p0, Lio/sentry/protocol/t;->E:Ljava/util/HashMap;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/protocol/t;->E:Ljava/util/HashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->z(Ljava/util/HashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method
