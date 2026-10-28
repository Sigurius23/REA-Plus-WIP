.class public final Lio/sentry/rrweb/j;
.super Lio/sentry/rrweb/b;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public E:I

.field public F:Ljava/util/HashMap;

.field public y:Ljava/lang/String;

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lio/sentry/rrweb/c;->Meta:Lio/sentry/rrweb/c;

    invoke-direct {p0, v0}, Lio/sentry/rrweb/b;-><init>(Lio/sentry/rrweb/c;)V

    const-string v0, ""

    iput-object v0, p0, Lio/sentry/rrweb/j;->y:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lio/sentry/rrweb/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Lio/sentry/rrweb/b;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    check-cast p1, Lio/sentry/rrweb/j;

    iget v2, p0, Lio/sentry/rrweb/j;->z:I

    iget v3, p1, Lio/sentry/rrweb/j;->z:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lio/sentry/rrweb/j;->E:I

    iget v3, p1, Lio/sentry/rrweb/j;->E:I

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Lio/sentry/rrweb/j;->y:Ljava/lang/String;

    iget-object p1, p1, Lio/sentry/rrweb/j;->y:Ljava/lang/String;

    invoke-static {v2, p1}, Lpf/c;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 4

    invoke-super {p0}, Lio/sentry/rrweb/b;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/rrweb/j;->y:Ljava/lang/String;

    iget v2, p0, Lio/sentry/rrweb/j;->z:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Lio/sentry/rrweb/j;->E:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    invoke-static {p0, p1, p2}, Ldc/a;->N(Lio/sentry/rrweb/b;Lwe/o;Lio/sentry/v0;)V

    const-string v0, "data"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    const-string v0, "href"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/rrweb/j;->y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    const-string v0, "height"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget v0, p0, Lio/sentry/rrweb/j;->z:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lwe/o;->X(J)Lwe/o;

    const-string v0, "width"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget v0, p0, Lio/sentry/rrweb/j;->E:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lwe/o;->X(J)Lwe/o;

    iget-object v0, p0, Lio/sentry/rrweb/j;->F:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/rrweb/j;->F:Ljava/util/HashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->z(Ljava/util/HashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method
