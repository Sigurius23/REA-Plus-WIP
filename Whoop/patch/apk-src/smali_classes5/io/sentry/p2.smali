.class public final Lio/sentry/p2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/r0;
.implements Lio/sentry/v3;
.implements Lio/sentry/o1;
.implements Lio/sentry/p1;


# static fields
.field public static final w:Lio/sentry/p2;

.field public static final x:Lio/sentry/p2;

.field public static final y:Lio/sentry/p2;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/p2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/sentry/p2;->w:Lio/sentry/p2;

    new-instance v0, Lio/sentry/p2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/sentry/p2;->x:Lio/sentry/p2;

    new-instance v0, Lio/sentry/p2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/sentry/p2;->y:Lio/sentry/p2;

    return-void
.end method


# virtual methods
.method public J()Lio/sentry/u3;
    .locals 1

    sget-object v0, Lio/sentry/v2;->a:Lio/sentry/v2;

    return-object v0
.end method

.method public a(Lio/sentry/n1;)V
    .locals 0

    return-void
.end method

.method public b(Lio/sentry/q6;Lcom/google/crypto/tink/internal/l0;)Lio/sentry/transport/g;
    .locals 3

    new-instance v0, Lio/sentry/transport/c;

    new-instance v1, Lio/sentry/transport/q;

    invoke-direct {v1, p1}, Lio/sentry/transport/q;-><init>(Lio/sentry/q6;)V

    invoke-virtual {p1}, Lio/sentry/q6;->getTransportGate()Lio/sentry/transport/h;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2, p2}, Lio/sentry/transport/c;-><init>(Lio/sentry/q6;Lio/sentry/transport/q;Lio/sentry/transport/h;Lcom/google/crypto/tink/internal/l0;)V

    return-object v0
.end method

.method public c(Lio/sentry/z6;Ljava/util/List;Lio/sentry/q6;)Lio/sentry/s3;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public close()V
    .locals 0

    return-void
.end method

.method public h(Lio/sentry/android/replay/d;)V
    .locals 0

    return-void
.end method

.method public i(Ljava/lang/Boolean;)V
    .locals 0

    return-void
.end method

.method public isRunning()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public pause()V
    .locals 0

    return-void
.end method

.method public resume()V
    .locals 0

    return-void
.end method

.method public s()Lio/sentry/protocol/v;
    .locals 1

    sget-object v0, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    return-object v0
.end method

.method public start()V
    .locals 0

    return-void
.end method

.method public stop()V
    .locals 0

    return-void
.end method

.method public x()V
    .locals 0

    return-void
.end method
