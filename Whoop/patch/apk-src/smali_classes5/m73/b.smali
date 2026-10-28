.class public abstract Lm73/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lm73/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    :try_start_0
    sget-object v0, Lm73/a;->a:Lm73/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    sput-object v0, Lm73/b;->a:Lm73/e;

    return-void

    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Scheduler Callable returned null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lbi/g;->P(Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    throw v0
.end method
