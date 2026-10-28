.class public final Lio/sentry/exception/ExceptionMechanismException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public final w:Lio/sentry/protocol/n;

.field public final x:Ljava/lang/Throwable;

.field public final y:Ljava/lang/Thread;

.field public final z:Z


# direct methods
.method public constructor <init>(Lio/sentry/protocol/n;Ljava/lang/Throwable;Ljava/lang/Thread;)V
    .locals 1

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, p2, p3, v0}, Lio/sentry/exception/ExceptionMechanismException;-><init>(Lio/sentry/protocol/n;Ljava/lang/Throwable;Ljava/lang/Thread;Z)V

    return-void
.end method

.method public constructor <init>(Lio/sentry/protocol/n;Ljava/lang/Throwable;Ljava/lang/Thread;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 2
    iput-object p1, p0, Lio/sentry/exception/ExceptionMechanismException;->w:Lio/sentry/protocol/n;

    .line 3
    const-string p1, "Throwable is required."

    invoke-static {p2, p1}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lio/sentry/exception/ExceptionMechanismException;->x:Ljava/lang/Throwable;

    .line 4
    iput-object p3, p0, Lio/sentry/exception/ExceptionMechanismException;->y:Ljava/lang/Thread;

    .line 5
    iput-boolean p4, p0, Lio/sentry/exception/ExceptionMechanismException;->z:Z

    return-void
.end method


# virtual methods
.method public final a()Lio/sentry/protocol/n;
    .locals 1

    iget-object v0, p0, Lio/sentry/exception/ExceptionMechanismException;->w:Lio/sentry/protocol/n;

    return-object v0
.end method

.method public final b()Ljava/lang/Thread;
    .locals 1

    iget-object v0, p0, Lio/sentry/exception/ExceptionMechanismException;->y:Ljava/lang/Thread;

    return-object v0
.end method

.method public final c()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lio/sentry/exception/ExceptionMechanismException;->x:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/exception/ExceptionMechanismException;->z:Z

    return v0
.end method
