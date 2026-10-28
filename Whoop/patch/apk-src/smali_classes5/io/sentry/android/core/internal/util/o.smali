.class public final Lio/sentry/android/core/internal/util/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final w:J

.field public final x:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lio/sentry/android/core/internal/util/o;->w:J

    iput-wide p3, p0, Lio/sentry/android/core/internal/util/o;->x:J

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Lio/sentry/android/core/internal/util/o;

    iget-wide v0, p0, Lio/sentry/android/core/internal/util/o;->x:J

    iget-wide v2, p1, Lio/sentry/android/core/internal/util/o;->x:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    iget-wide v0, p0, Lio/sentry/android/core/internal/util/o;->w:J

    iget-wide v2, p1, Lio/sentry/android/core/internal/util/o;->w:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    return p1
.end method
