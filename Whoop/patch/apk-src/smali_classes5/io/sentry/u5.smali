.class public final Lio/sentry/u5;
.super Lio/sentry/u4;
.source "SourceFile"


# instance fields
.field public final w:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lio/sentry/u5;->w:J

    return-void
.end method


# virtual methods
.method public final d()J
    .locals 2

    iget-wide v0, p0, Lio/sentry/u5;->w:J

    return-wide v0
.end method
