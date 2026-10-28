.class public final Lio/sentry/x6;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/sentry/z6;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/z6;I)V
    .locals 0

    iput p2, p0, Lio/sentry/x6;->w:I

    iput-object p1, p0, Lio/sentry/x6;->x:Lio/sentry/z6;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Lio/sentry/x6;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/x6;->x:Lio/sentry/z6;

    invoke-virtual {v0}, Lio/sentry/z6;->c()Lio/sentry/i7;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lio/sentry/i7;->DEADLINE_EXCEEDED:Lio/sentry/i7;

    :goto_0
    iget-object v2, v0, Lio/sentry/z6;->r:Lio/sentry/n7;

    iget-object v2, v2, Lio/sentry/n7;->g:Ljava/lang/Long;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v4}, Lio/sentry/z6;->f(Lio/sentry/i7;ZLio/sentry/g0;)V

    iget-object v0, v0, Lio/sentry/z6;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/sentry/x6;->x:Lio/sentry/z6;

    invoke-virtual {v0}, Lio/sentry/z6;->c()Lio/sentry/i7;

    move-result-object v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    sget-object v1, Lio/sentry/i7;->OK:Lio/sentry/i7;

    :goto_2
    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lio/sentry/z6;->v(Lio/sentry/i7;Lio/sentry/u4;)V

    iget-object v0, v0, Lio/sentry/z6;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
