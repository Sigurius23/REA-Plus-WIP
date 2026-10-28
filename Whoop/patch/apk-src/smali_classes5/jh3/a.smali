.class public abstract Ljh3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:Lgh3/d;

.field public static volatile b:Ljc/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgh3/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lgh3/d;-><init>(I)V

    sput-object v0, Ljh3/a;->a:Lgh3/d;

    new-instance v0, Ljc/b;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljc/b;-><init>(I)V

    sput-object v0, Ljh3/a;->b:Ljc/b;

    return-void
.end method

.method public static a(Ljava/lang/Throwable;)V
    .locals 4

    sget-object v0, Ljh3/a;->a:Lgh3/d;

    :try_start_0
    invoke-virtual {v0, p0}, Lgh3/d;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "The onError handler threw an Exception. It shouldn\'t. => "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v2

    invoke-interface {v2, v1, v0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v1

    invoke-interface {v1, v0, p0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static b(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 1

    sget-object v0, Ljh3/a;->b:Ljc/b;

    invoke-virtual {v0, p0}, Ljc/b;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Throwable;

    return-object p0
.end method
