.class public final Lio/sentry/android/core/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final E:Z

.field public final F:Z

.field public final G:J

.field public final w:J

.field public final x:J

.field public final y:J

.field public final z:J


# direct methods
.method public constructor <init>(J)V
    .locals 13

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    move-wide v3, p1

    move-object v0, p0

    move-wide v1, p1

    .line 1
    invoke-direct/range {v0 .. v12}, Lio/sentry/android/core/p1;-><init>(JJJJZZJ)V

    return-void
.end method

.method public constructor <init>(JJJJZZJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lio/sentry/android/core/p1;->w:J

    .line 4
    iput-wide p3, p0, Lio/sentry/android/core/p1;->x:J

    .line 5
    iput-wide p5, p0, Lio/sentry/android/core/p1;->y:J

    .line 6
    iput-wide p7, p0, Lio/sentry/android/core/p1;->z:J

    .line 7
    iput-boolean p9, p0, Lio/sentry/android/core/p1;->E:Z

    .line 8
    iput-boolean p10, p0, Lio/sentry/android/core/p1;->F:Z

    .line 9
    iput-wide p11, p0, Lio/sentry/android/core/p1;->G:J

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Lio/sentry/android/core/p1;

    iget-wide v0, p0, Lio/sentry/android/core/p1;->x:J

    iget-wide v2, p1, Lio/sentry/android/core/p1;->x:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    return p1
.end method
