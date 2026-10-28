.class public final synthetic Lio/sentry/android/core/internal/util/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field public final synthetic w:Lio/sentry/v0;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/v0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/internal/util/m;->w:Lio/sentry/v0;

    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 2

    sget-object p1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v0, "Error during frames measurements."

    iget-object v1, p0, Lio/sentry/android/core/internal/util/m;->w:Lio/sentry/v0;

    invoke-interface {v1, p1, v0, p2}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
