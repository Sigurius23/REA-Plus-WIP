.class public final Lio/sentry/s2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/u0;


# static fields
.field public static final b:Lio/sentry/s2;


# instance fields
.field public final a:Lio/sentry/q6;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/s2;

    invoke-direct {v0}, Lio/sentry/s2;-><init>()V

    sput-object v0, Lio/sentry/s2;->b:Lio/sentry/s2;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lio/sentry/q6;->empty()Lio/sentry/q6;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/s2;->a:Lio/sentry/q6;

    return-void
.end method

.method public static F()Lio/sentry/s2;
    .locals 1

    sget-object v0, Lio/sentry/s2;->b:Lio/sentry/s2;

    return-object v0
.end method


# virtual methods
.method public final A()Lio/sentry/t0;
    .locals 1

    sget-object v0, Lio/sentry/r2;->w:Lio/sentry/r2;

    return-object v0
.end method

.method public final B(Ljava/lang/Throwable;Lio/sentry/g0;)Lio/sentry/protocol/v;
    .locals 0

    sget-object p1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object p1
.end method

.method public final C(Lio/sentry/protocol/d0;Lio/sentry/k7;Lio/sentry/g0;Lio/sentry/s3;)Lio/sentry/protocol/v;
    .locals 0

    sget-object p1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object p1
.end method

.method public final D(Ljava/lang/String;)Lio/sentry/d1;
    .locals 0

    sget-object p1, Lio/sentry/x2;->b:Lio/sentry/x2;

    return-object p1
.end method

.method public final E(Lio/sentry/protocol/j;)Lio/sentry/protocol/v;
    .locals 0

    sget-object p1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object p1
.end method

.method public final a(Z)V
    .locals 0

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final clone()Lio/sentry/u0;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/s2;->b:Lio/sentry/s2;

    return-object v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 2
    sget-object v0, Lio/sentry/s2;->b:Lio/sentry/s2;

    return-object v0
.end method

.method public final d(J)V
    .locals 0

    return-void
.end method

.method public final e(Lio/sentry/protocol/h0;)V
    .locals 0

    return-void
.end method

.method public final f()Lio/sentry/l1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final g()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final h(Lio/sentry/e;)V
    .locals 0

    return-void
.end method

.method public final i(Lio/sentry/e;Lio/sentry/g0;)V
    .locals 0

    return-void
.end method

.method public final isEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j()Lio/sentry/transport/q;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final l()Lio/sentry/q6;
    .locals 1

    iget-object v0, p0, Lio/sentry/s2;->a:Lio/sentry/q6;

    return-object v0
.end method

.method public final m()Lio/sentry/n1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final n(Lio/sentry/p3;)Lio/sentry/protocol/v;
    .locals 0

    sget-object p1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object p1
.end method

.method public final o()V
    .locals 0

    return-void
.end method

.method public final p(Ljava/lang/Throwable;Lio/sentry/d7;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final q(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Lio/sentry/protocol/v;
    .locals 0

    sget-object p1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object p1
.end method

.method public final r(Ljava/lang/Throwable;Lio/sentry/g0;Lcom/mapbox/common/location/a;)Lio/sentry/protocol/v;
    .locals 0

    sget-object p1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object p1
.end method

.method public final s(Lio/sentry/e4;)V
    .locals 0

    return-void
.end method

.method public final t(Lio/sentry/s6;Lio/sentry/g0;)Lio/sentry/protocol/v;
    .locals 0

    sget-object p1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object p1
.end method

.method public final u()V
    .locals 0

    return-void
.end method

.method public final v(Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/protocol/v;
    .locals 0

    sget-object p1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object p1
.end method

.method public final x(Lio/sentry/m7;Lio/sentry/n7;)Lio/sentry/n1;
    .locals 0

    sget-object p1, Lio/sentry/g3;->a:Lio/sentry/g3;

    return-object p1
.end method

.method public final y()Ljava/lang/Boolean;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final z()Lio/sentry/b1;
    .locals 1

    sget-object v0, Lio/sentry/w2;->b:Lio/sentry/w2;

    return-object v0
.end method
