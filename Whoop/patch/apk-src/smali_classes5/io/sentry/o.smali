.class public final Lio/sentry/o;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lio/sentry/o;->w:I

    iput-object p1, p0, Lio/sentry/o;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lio/sentry/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/o;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/sentry/o;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/u0;

    iget-object v1, v0, Lio/sentry/android/core/u0;->F:Lio/sentry/i4;

    iget-boolean v0, v0, Lio/sentry/android/core/u0;->G:Z

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lio/sentry/i4;->o()V

    :cond_0
    invoke-virtual {v1}, Lio/sentry/i4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getReplayController()Lio/sentry/v3;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/v3;->stop()V

    invoke-virtual {v1}, Lio/sentry/i4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getContinuousProfiler()Lio/sentry/q0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lio/sentry/q0;->a(Z)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/sentry/o;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/r;

    iget-object v0, v0, Lio/sentry/r;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/z0;

    invoke-interface {v1}, Lio/sentry/z0;->a()V

    goto :goto_0

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
