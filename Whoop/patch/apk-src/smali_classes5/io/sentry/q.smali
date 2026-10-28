.class public final Lio/sentry/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Lio/sentry/n1;

.field public final c:J

.field public final synthetic d:Lio/sentry/r;


# direct methods
.method public constructor <init>(Lio/sentry/r;Lio/sentry/z6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/q;->d:Lio/sentry/r;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/q;->a:Ljava/util/ArrayList;

    iput-object p2, p0, Lio/sentry/q;->b:Lio/sentry/n1;

    iget-object p1, p1, Lio/sentry/r;->g:Lio/sentry/q6;

    invoke-virtual {p1}, Lio/sentry/q6;->getDateProvider()Lio/sentry/v4;

    move-result-object p1

    invoke-interface {p1}, Lio/sentry/v4;->now()Lio/sentry/u4;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/u4;->d()J

    move-result-wide p1

    iput-wide p1, p0, Lio/sentry/q;->c:J

    return-void
.end method
