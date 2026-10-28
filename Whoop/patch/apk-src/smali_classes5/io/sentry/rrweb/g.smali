.class public final Lio/sentry/rrweb/g;
.super Lio/sentry/rrweb/e;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public E:I

.field public F:F

.field public G:F

.field public H:I

.field public I:I

.field public J:Ljava/util/HashMap;

.field public K:Ljava/util/HashMap;

.field public z:Lio/sentry/rrweb/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lio/sentry/rrweb/d;->MouseInteraction:Lio/sentry/rrweb/d;

    invoke-direct {p0, v0}, Lio/sentry/rrweb/e;-><init>(Lio/sentry/rrweb/d;)V

    const/4 v0, 0x2

    iput v0, p0, Lio/sentry/rrweb/g;->H:I

    return-void
.end method


# virtual methods
.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    invoke-static {p0, p1, p2}, Ldc/a;->N(Lio/sentry/rrweb/b;Lwe/o;Lio/sentry/v0;)V

    const-string v0, "data"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    invoke-static {p0, p1, p2}, Lds/p;->Q(Lio/sentry/rrweb/e;Lwe/o;Lio/sentry/v0;)V

    const-string v0, "type"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/rrweb/g;->z:Lio/sentry/rrweb/f;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget v0, p0, Lio/sentry/rrweb/g;->E:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lwe/o;->X(J)Lwe/o;

    const-string v0, "x"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget v0, p0, Lio/sentry/rrweb/g;->F:F

    float-to-double v0, v0

    invoke-virtual {p1, v0, v1}, Lwe/o;->W(D)Lwe/o;

    const-string v0, "y"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget v0, p0, Lio/sentry/rrweb/g;->G:F

    float-to-double v0, v0

    invoke-virtual {p1, v0, v1}, Lwe/o;->W(D)Lwe/o;

    const-string v0, "pointerType"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget v0, p0, Lio/sentry/rrweb/g;->H:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lwe/o;->X(J)Lwe/o;

    const-string v0, "pointerId"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget v0, p0, Lio/sentry/rrweb/g;->I:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lwe/o;->X(J)Lwe/o;

    iget-object v0, p0, Lio/sentry/rrweb/g;->K:Ljava/util/HashMap;

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

    iget-object v2, p0, Lio/sentry/rrweb/g;->K:Ljava/util/HashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->z(Ljava/util/HashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    iget-object v0, p0, Lio/sentry/rrweb/g;->J:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/rrweb/g;->J:Ljava/util/HashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->z(Ljava/util/HashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method
