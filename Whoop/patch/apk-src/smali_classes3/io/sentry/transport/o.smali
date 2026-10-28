.class public final Lio/sentry/transport/o;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field public final synthetic w:Lio/sentry/transport/q;


# direct methods
.method public constructor <init>(Lio/sentry/transport/q;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/transport/o;->w:Lio/sentry/transport/q;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lio/sentry/transport/o;->w:Lio/sentry/transport/q;

    iget-object v1, v0, Lio/sentry/transport/q;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/transport/p;

    invoke-interface {v2, v0}, Lio/sentry/transport/p;->k(Lio/sentry/transport/q;)V

    goto :goto_0

    :cond_0
    return-void
.end method
