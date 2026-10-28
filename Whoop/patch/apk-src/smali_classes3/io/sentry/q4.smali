.class public final Lio/sentry/q4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/v4;


# instance fields
.field public final a:Lio/sentry/v4;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-boolean v0, Lio/sentry/util/i;->a:Z

    if-nez v0, :cond_0

    sget-boolean v0, Lio/sentry/util/i;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Lio/sentry/k5;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/sentry/q4;->a:Lio/sentry/v4;

    return-void

    :cond_0
    new-instance v0, Lio/sentry/y5;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/sentry/q4;->a:Lio/sentry/v4;

    return-void
.end method


# virtual methods
.method public final now()Lio/sentry/u4;
    .locals 1

    iget-object v0, p0, Lio/sentry/q4;->a:Lio/sentry/v4;

    invoke-interface {v0}, Lio/sentry/v4;->now()Lio/sentry/u4;

    move-result-object v0

    return-object v0
.end method
