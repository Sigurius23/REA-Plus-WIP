.class public final Lio/sentry/android/core/performance/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/MessageQueue$IdleHandler;


# instance fields
.field public final synthetic a:Lio/sentry/android/core/performance/g;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/performance/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/performance/e;->a:Lio/sentry/android/core/performance/g;

    return-void
.end method


# virtual methods
.method public final queueIdle()Z
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/performance/e;->a:Lio/sentry/android/core/performance/g;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lio/sentry/android/core/performance/g;->y:J

    iget-object v0, p0, Lio/sentry/android/core/performance/e;->a:Lio/sentry/android/core/performance/g;

    invoke-static {v0}, Lio/sentry/android/core/performance/g;->a(Lio/sentry/android/core/performance/g;)V

    const/4 v0, 0x0

    return v0
.end method
