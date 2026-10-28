.class public final Lio/sentry/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/u0;


# instance fields
.field public final a:Lio/sentry/h4;


# direct methods
.method public constructor <init>(Lio/sentry/h4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    return-void
.end method


# virtual methods
.method public final A()Lio/sentry/t0;
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    iget-object v0, v0, Lio/sentry/h4;->f:Lad3/z;

    return-object v0
.end method

.method public final B(Ljava/lang/Throwable;Lio/sentry/g0;)Lio/sentry/protocol/v;
    .locals 2

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lio/sentry/h4;->F(Ljava/lang/Throwable;Lio/sentry/g0;Lcom/mapbox/common/location/a;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public final C(Lio/sentry/protocol/d0;Lio/sentry/k7;Lio/sentry/g0;Lio/sentry/s3;)Lio/sentry/protocol/v;
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0, p1, p2, p3, p4}, Lio/sentry/h4;->C(Lio/sentry/protocol/d0;Lio/sentry/k7;Lio/sentry/g0;Lio/sentry/s3;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public final D(Ljava/lang/String;)Lio/sentry/d1;
    .locals 1

    const-string p1, "getCurrentScopes"

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0, p1}, Lio/sentry/h4;->D(Ljava/lang/String;)Lio/sentry/d1;

    move-result-object p1

    return-object p1
.end method

.method public final E(Lio/sentry/protocol/j;)Lio/sentry/protocol/v;
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0, p1}, Lio/sentry/h4;->E(Lio/sentry/protocol/j;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public final a(Z)V
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0, p1}, Lio/sentry/h4;->a(Z)V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0, p1}, Lio/sentry/h4;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0, p1, p2}, Lio/sentry/h4;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final clone()Lio/sentry/u0;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0}, Lio/sentry/h4;->clone()Lio/sentry/u0;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0}, Lio/sentry/h4;->clone()Lio/sentry/u0;

    move-result-object v0

    return-object v0
.end method

.method public final d(J)V
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0, p1, p2}, Lio/sentry/h4;->d(J)V

    return-void
.end method

.method public final e(Lio/sentry/protocol/h0;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0, p1}, Lio/sentry/h4;->e(Lio/sentry/protocol/h0;)V

    return-void
.end method

.method public final f()Lio/sentry/l1;
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0}, Lio/sentry/h4;->f()Lio/sentry/l1;

    move-result-object v0

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0}, Lio/sentry/h4;->g()Z

    move-result v0

    return v0
.end method

.method public final h(Lio/sentry/e;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0, p1}, Lio/sentry/h4;->h(Lio/sentry/e;)V

    return-void
.end method

.method public final i(Lio/sentry/e;Lio/sentry/g0;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0, p1, p2}, Lio/sentry/h4;->i(Lio/sentry/e;Lio/sentry/g0;)V

    return-void
.end method

.method public final isEnabled()Z
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0}, Lio/sentry/h4;->isEnabled()Z

    move-result v0

    return v0
.end method

.method public final j()Lio/sentry/transport/q;
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0}, Lio/sentry/h4;->j()Lio/sentry/transport/q;

    move-result-object v0

    return-object v0
.end method

.method public final l()Lio/sentry/q6;
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    return-object v0
.end method

.method public final m()Lio/sentry/n1;
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0}, Lio/sentry/h4;->m()Lio/sentry/n1;

    move-result-object v0

    return-object v0
.end method

.method public final n(Lio/sentry/p3;)Lio/sentry/protocol/v;
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0, p1}, Lio/sentry/h4;->n(Lio/sentry/p3;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public final o()V
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0}, Lio/sentry/h4;->o()V

    return-void
.end method

.method public final p(Ljava/lang/Throwable;Lio/sentry/d7;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0, p1, p2, p3}, Lio/sentry/h4;->p(Ljava/lang/Throwable;Lio/sentry/d7;Ljava/lang/String;)V

    return-void
.end method

.method public final q(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Lio/sentry/protocol/v;
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0, p1, p2}, Lio/sentry/h4;->q(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public final r(Ljava/lang/Throwable;Lio/sentry/g0;Lcom/mapbox/common/location/a;)Lio/sentry/protocol/v;
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0, p1, p2, p3}, Lio/sentry/h4;->F(Ljava/lang/Throwable;Lio/sentry/g0;Lcom/mapbox/common/location/a;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public final s(Lio/sentry/e4;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0, p1}, Lio/sentry/h4;->s(Lio/sentry/e4;)V

    return-void
.end method

.method public final t(Lio/sentry/s6;Lio/sentry/g0;)Lio/sentry/protocol/v;
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0, p1, p2}, Lio/sentry/h4;->t(Lio/sentry/s6;Lio/sentry/g0;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public final u()V
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0}, Lio/sentry/h4;->u()V

    return-void
.end method

.method public final v(Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/protocol/v;
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0, p1, p2}, Lio/sentry/h4;->v(Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public final x(Lio/sentry/m7;Lio/sentry/n7;)Lio/sentry/n1;
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0, p1, p2}, Lio/sentry/h4;->x(Lio/sentry/m7;Lio/sentry/n7;)Lio/sentry/n1;

    move-result-object p1

    return-object p1
.end method

.method public final y()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    invoke-virtual {v0}, Lio/sentry/h4;->y()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final z()Lio/sentry/b1;
    .locals 1

    iget-object v0, p0, Lio/sentry/m0;->a:Lio/sentry/h4;

    iget-object v0, v0, Lio/sentry/h4;->a:Lio/sentry/b1;

    return-object v0
.end method
