.class public abstract Lio/sentry/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lio/sentry/d1;

.field public final b:Lio/sentry/v0;

.field public final c:J

.field public final d:Lio/sentry/j7;


# direct methods
.method public constructor <init>(Lio/sentry/d1;Lio/sentry/v0;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/v;->a:Lio/sentry/d1;

    iput-object p2, p0, Lio/sentry/v;->b:Lio/sentry/v0;

    iput-wide p3, p0, Lio/sentry/v;->c:J

    new-instance p1, Lio/sentry/g;

    invoke-direct {p1, p5}, Lio/sentry/g;-><init>(I)V

    new-instance p2, Lio/sentry/j7;

    invoke-direct {p2, p1}, Lio/sentry/j7;-><init>(Lio/sentry/g;)V

    iput-object p2, p0, Lio/sentry/v;->d:Lio/sentry/j7;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Z
.end method

.method public abstract b(Ljava/io/File;Lio/sentry/g0;)V
.end method
