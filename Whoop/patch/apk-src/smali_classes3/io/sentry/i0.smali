.class public final synthetic Lio/sentry/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lio/sentry/i0;->w:I

    iput-object p1, p0, Lio/sentry/i0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lio/sentry/i0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/i0;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/AssetFileDescriptor;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/i0;->x:Ljava/lang/Object;

    check-cast v0, Lu92/e;

    invoke-virtual {v0}, Lu92/e;->c()Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lio/sentry/i0;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/k0;

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, v0, Lio/sentry/k0;->e:Lio/sentry/h0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/net/InetAddress;->getLocalHost()Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/InetAddress;->getCanonicalHostName()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/k0;->b:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, v0, Lio/sentry/k0;->a:J

    add-long/2addr v2, v4

    iput-wide v2, v0, Lio/sentry/k0;->c:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, v0, Lio/sentry/k0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v2

    iget-object v0, v0, Lio/sentry/k0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    throw v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
