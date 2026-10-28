.class public final Lio/sentry/android/core/performance/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final w:Lio/sentry/android/core/performance/h;

.field public final x:Lio/sentry/android/core/performance/h;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/android/core/performance/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/performance/c;->w:Lio/sentry/android/core/performance/h;

    new-instance v0, Lio/sentry/android/core/performance/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/performance/c;->x:Lio/sentry/android/core/performance/h;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Lio/sentry/android/core/performance/c;

    iget-object v0, p0, Lio/sentry/android/core/performance/c;->w:Lio/sentry/android/core/performance/h;

    iget-wide v0, v0, Lio/sentry/android/core/performance/h;->y:J

    iget-object v2, p1, Lio/sentry/android/core/performance/c;->w:Lio/sentry/android/core/performance/h;

    iget-wide v2, v2, Lio/sentry/android/core/performance/h;->y:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/sentry/android/core/performance/c;->x:Lio/sentry/android/core/performance/h;

    iget-wide v0, v0, Lio/sentry/android/core/performance/h;->y:J

    iget-object p1, p1, Lio/sentry/android/core/performance/c;->x:Lio/sentry/android/core/performance/h;

    iget-wide v2, p1, Lio/sentry/android/core/performance/h;->y:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    return p1

    :cond_0
    return v0
.end method
