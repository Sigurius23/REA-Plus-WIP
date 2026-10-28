.class public final Lio/sentry/android/core/t1;
.super Lio/sentry/hints/c;
.source "SourceFile"

# interfaces
.implements Lio/sentry/hints/b;
.implements Lio/sentry/hints/g;


# instance fields
.field public final E:Z

.field public final z:J


# direct methods
.method public constructor <init>(JLio/sentry/v0;JZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/sentry/hints/c;-><init>(JLio/sentry/v0;)V

    iput-wide p4, p0, Lio/sentry/android/core/t1;->z:J

    iput-boolean p6, p0, Lio/sentry/android/core/t1;->E:Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/t1;->E:Z

    return v0
.end method

.method public final f(Lio/sentry/protocol/v;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final g(Lio/sentry/protocol/v;)V
    .locals 0

    return-void
.end method
