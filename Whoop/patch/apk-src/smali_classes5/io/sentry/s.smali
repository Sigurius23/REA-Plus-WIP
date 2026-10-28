.class public final Lio/sentry/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/i1;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lio/sentry/s;->w:I

    iput-object p1, p0, Lio/sentry/s;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    iget v0, p0, Lio/sentry/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/s;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/util/a;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :pswitch_0
    sget-object v0, Lio/sentry/t;->a:Ljava/lang/ThreadLocal;

    iget-object v1, p0, Lio/sentry/s;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/d1;

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
