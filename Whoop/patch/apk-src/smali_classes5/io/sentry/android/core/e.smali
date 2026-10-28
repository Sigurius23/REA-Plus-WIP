.class public final synthetic Lio/sentry/android/core/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/sentry/android/core/ActivityLifecycleIntegration;

.field public final synthetic y:Lio/sentry/l1;

.field public final synthetic z:Lio/sentry/l1;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Lio/sentry/l1;Lio/sentry/l1;I)V
    .locals 0

    iput p4, p0, Lio/sentry/android/core/e;->w:I

    iput-object p1, p0, Lio/sentry/android/core/e;->x:Lio/sentry/android/core/ActivityLifecycleIntegration;

    iput-object p2, p0, Lio/sentry/android/core/e;->y:Lio/sentry/l1;

    iput-object p3, p0, Lio/sentry/android/core/e;->z:Lio/sentry/l1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lio/sentry/android/core/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/android/core/e;->y:Lio/sentry/l1;

    iget-object v1, p0, Lio/sentry/android/core/e;->z:Lio/sentry/l1;

    iget-object v2, p0, Lio/sentry/android/core/e;->x:Lio/sentry/android/core/ActivityLifecycleIntegration;

    invoke-virtual {v2, v0, v1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->s(Lio/sentry/l1;Lio/sentry/l1;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/core/e;->y:Lio/sentry/l1;

    iget-object v1, p0, Lio/sentry/android/core/e;->z:Lio/sentry/l1;

    iget-object v2, p0, Lio/sentry/android/core/e;->x:Lio/sentry/android/core/ActivityLifecycleIntegration;

    invoke-virtual {v2, v0, v1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->s(Lio/sentry/l1;Lio/sentry/l1;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
