.class public final synthetic Lio/sentry/android/core/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/sentry/android/core/d;

.field public final synthetic y:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/d;Landroid/app/Activity;I)V
    .locals 0

    iput p3, p0, Lio/sentry/android/core/b;->w:I

    iput-object p1, p0, Lio/sentry/android/core/b;->x:Lio/sentry/android/core/d;

    iput-object p2, p0, Lio/sentry/android/core/b;->y:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lio/sentry/android/core/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/android/core/b;->x:Lio/sentry/android/core/d;

    iget-object v0, v0, Lio/sentry/android/core/d;->a:Ljava/lang/Object;

    check-cast v0, Lio/sentry/util/f;

    invoke-virtual {v0}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/app/FrameMetricsAggregator;

    iget-object v1, p0, Lio/sentry/android/core/b;->y:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Landroidx/core/app/FrameMetricsAggregator;->remove(Landroid/app/Activity;)[Landroid/util/SparseIntArray;

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/core/b;->x:Lio/sentry/android/core/d;

    iget-object v0, v0, Lio/sentry/android/core/d;->a:Ljava/lang/Object;

    check-cast v0, Lio/sentry/util/f;

    invoke-virtual {v0}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/app/FrameMetricsAggregator;

    iget-object v1, p0, Lio/sentry/android/core/b;->y:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Landroidx/core/app/FrameMetricsAggregator;->add(Landroid/app/Activity;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
