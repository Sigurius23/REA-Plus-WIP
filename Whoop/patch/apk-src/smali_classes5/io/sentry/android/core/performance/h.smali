.class public final Lio/sentry/android/core/performance/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public w:Ljava/lang/String;

.field public x:J

.field public y:J

.field public z:J


# virtual methods
.method public final a()J
    .locals 5

    iget-wide v0, p0, Lio/sentry/android/core/performance/h;->z:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-wide v2, p0, Lio/sentry/android/core/performance/h;->y:J

    sub-long/2addr v0, v2

    return-wide v0

    :cond_0
    return-wide v2
.end method

.method public final b()Z
    .locals 4

    iget-wide v0, p0, Lio/sentry/android/core/performance/h;->y:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c(J)V
    .locals 2

    iput-wide p1, p0, Lio/sentry/android/core/performance/h;->y:J

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide p1

    iget-wide v0, p0, Lio/sentry/android/core/performance/h;->y:J

    sub-long/2addr p1, v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p1

    iput-wide v0, p0, Lio/sentry/android/core/performance/h;->x:J

    return-void
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Lio/sentry/android/core/performance/h;

    iget-wide v0, p0, Lio/sentry/android/core/performance/h;->x:J

    iget-wide v2, p1, Lio/sentry/android/core/performance/h;->x:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    return p1
.end method
