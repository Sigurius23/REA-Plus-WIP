.class public final Lio/sentry/android/core/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final w:Lio/sentry/android/core/c0;

.field public final synthetic x:Lio/sentry/android/core/e0;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/d0;->x:Lio/sentry/android/core/e0;

    new-instance p1, Lio/sentry/android/core/c0;

    invoke-direct {p1, p0}, Lio/sentry/android/core/c0;-><init>(Lio/sentry/android/core/d0;)V

    iput-object p1, p0, Lio/sentry/android/core/d0;->w:Lio/sentry/android/core/c0;

    return-void
.end method


# virtual methods
.method public final onStart(Landroidx/lifecycle/g0;)V
    .locals 1

    iget-object p1, p0, Lio/sentry/android/core/d0;->x:Lio/sentry/android/core/e0;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p1, Lio/sentry/android/core/e0;->z:Ljava/lang/Boolean;

    iget-object p1, p0, Lio/sentry/android/core/d0;->w:Lio/sentry/android/core/c0;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/android/core/b0;

    invoke-interface {v0}, Lio/sentry/android/core/b0;->i()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final onStop(Landroidx/lifecycle/g0;)V
    .locals 1

    iget-object p1, p0, Lio/sentry/android/core/d0;->x:Lio/sentry/android/core/e0;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p1, Lio/sentry/android/core/e0;->z:Ljava/lang/Boolean;

    iget-object p1, p0, Lio/sentry/android/core/d0;->w:Lio/sentry/android/core/c0;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/android/core/b0;

    invoke-interface {v0}, Lio/sentry/android/core/b0;->k()V

    goto :goto_0

    :cond_0
    return-void
.end method
