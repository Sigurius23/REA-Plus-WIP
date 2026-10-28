.class public final Lio/sentry/i4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/d1;


# static fields
.field public static final a:Lio/sentry/i4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/i4;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/sentry/i4;->a:Lio/sentry/i4;

    return-void
.end method


# virtual methods
.method public final A()Lio/sentry/t0;
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/d1;->A()Lio/sentry/t0;

    move-result-object v0

    return-object v0
.end method

.method public final B(Ljava/lang/Throwable;Lio/sentry/g0;)Lio/sentry/protocol/v;
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/sentry/d1;->B(Ljava/lang/Throwable;Lio/sentry/g0;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public final C(Lio/sentry/protocol/d0;Lio/sentry/k7;Lio/sentry/g0;Lio/sentry/s3;)Lio/sentry/protocol/v;
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Lio/sentry/d1;->C(Lio/sentry/protocol/d0;Lio/sentry/k7;Lio/sentry/g0;Lio/sentry/s3;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public final D(Ljava/lang/String;)Lio/sentry/d1;
    .locals 1

    const-string p1, "getCurrentScopes"

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/d1;->D(Ljava/lang/String;)Lio/sentry/d1;

    move-result-object p1

    return-object p1
.end method

.method public final E(Lio/sentry/protocol/j;)Lio/sentry/protocol/v;
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/d1;->A()Lio/sentry/t0;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/t0;->b(Lio/sentry/protocol/j;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public final a(Z)V
    .locals 0

    invoke-static {}, Lio/sentry/o4;->a()V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lio/sentry/o4;->h(Ljava/lang/String;)V

    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1, p2}, Lio/sentry/o4;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final clone()Lio/sentry/u0;
    .locals 1

    .line 2
    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/d1;->clone()Lio/sentry/u0;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/i4;->clone()Lio/sentry/u0;

    move-result-object v0

    return-object v0
.end method

.method public final d(J)V
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/sentry/d1;->d(J)V

    return-void
.end method

.method public final e(Lio/sentry/protocol/h0;)V
    .locals 0

    invoke-static {p1}, Lio/sentry/o4;->j(Lio/sentry/protocol/h0;)V

    return-void
.end method

.method public final f()Lio/sentry/l1;
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/d1;->f()Lio/sentry/l1;

    move-result-object v0

    return-object v0
.end method

.method public final g()Z
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/d1;->g()Z

    move-result v0

    return v0
.end method

.method public final h(Lio/sentry/e;)V
    .locals 1

    new-instance v0, Lio/sentry/g0;

    invoke-direct {v0}, Lio/sentry/g0;-><init>()V

    invoke-virtual {p0, p1, v0}, Lio/sentry/i4;->i(Lio/sentry/e;Lio/sentry/g0;)V

    return-void
.end method

.method public final i(Lio/sentry/e;Lio/sentry/g0;)V
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/sentry/d1;->i(Lio/sentry/e;Lio/sentry/g0;)V

    return-void
.end method

.method public final isEnabled()Z
    .locals 1

    invoke-static {}, Lio/sentry/o4;->g()Z

    move-result v0

    return v0
.end method

.method public final j()Lio/sentry/transport/q;
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/d1;->j()Lio/sentry/transport/q;

    move-result-object v0

    return-object v0
.end method

.method public final l()Lio/sentry/q6;
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object v0

    return-object v0
.end method

.method public final m()Lio/sentry/n1;
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/d1;->m()Lio/sentry/n1;

    move-result-object v0

    return-object v0
.end method

.method public final n(Lio/sentry/p3;)Lio/sentry/protocol/v;
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/d1;->n(Lio/sentry/p3;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public final o()V
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/d1;->o()V

    return-void
.end method

.method public final p(Ljava/lang/Throwable;Lio/sentry/d7;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lio/sentry/d1;->p(Ljava/lang/Throwable;Lio/sentry/d7;Ljava/lang/String;)V

    return-void
.end method

.method public final q(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Lio/sentry/protocol/v;
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/sentry/d1;->q(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public final r(Ljava/lang/Throwable;Lio/sentry/g0;Lcom/mapbox/common/location/a;)Lio/sentry/protocol/v;
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lio/sentry/d1;->r(Ljava/lang/Throwable;Lio/sentry/g0;Lcom/mapbox/common/location/a;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public final s(Lio/sentry/e4;)V
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/d1;->s(Lio/sentry/e4;)V

    return-void
.end method

.method public final t(Lio/sentry/s6;Lio/sentry/g0;)Lio/sentry/protocol/v;
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/sentry/d1;->t(Lio/sentry/s6;Lio/sentry/g0;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public final u()V
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/d1;->u()V

    return-void
.end method

.method public final v(Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/protocol/v;
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/sentry/d1;->v(Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public final w(Lio/sentry/protocol/j;)Lio/sentry/protocol/v;
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/d1;->A()Lio/sentry/t0;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/t0;->a(Lio/sentry/protocol/j;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public final x(Lio/sentry/m7;Lio/sentry/n7;)Lio/sentry/n1;
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/sentry/d1;->x(Lio/sentry/m7;Lio/sentry/n7;)Lio/sentry/n1;

    move-result-object p1

    return-object p1
.end method

.method public final y()Ljava/lang/Boolean;
    .locals 1

    invoke-static {}, Lio/sentry/o4;->f()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final z()Lio/sentry/b1;
    .locals 1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/d1;->z()Lio/sentry/b1;

    move-result-object v0

    return-object v0
.end method
