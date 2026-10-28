.class public final Lio/sentry/android/core/performance/i;
.super Lio/sentry/android/core/internal/gestures/j;
.source "SourceFile"


# instance fields
.field public final x:Lij/a;


# direct methods
.method public constructor <init>(Landroid/view/Window$Callback;Lij/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/sentry/android/core/internal/gestures/j;-><init>(Landroid/view/Window$Callback;)V

    iput-object p2, p0, Lio/sentry/android/core/performance/i;->x:Lij/a;

    return-void
.end method


# virtual methods
.method public final onContentChanged()V
    .locals 1

    invoke-super {p0}, Lio/sentry/android/core/internal/gestures/j;->onContentChanged()V

    iget-object v0, p0, Lio/sentry/android/core/performance/i;->x:Lij/a;

    invoke-virtual {v0}, Lij/a;->run()V

    return-void
.end method
