.class public abstract Luz/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# direct methods
.method public static a(Luz/p;Lq/f;)Luz/o;
    .locals 2

    sget-object v0, Luz/p;->a:Luz/p;

    sget-object v1, Luz/p;->b:Luz/o;

    if-nez v1, :cond_1

    monitor-enter v0

    :try_start_0
    sget-object v1, Luz/p;->b:Luz/o;

    if-nez v1, :cond_0

    new-instance v1, Luz/o;

    invoke-direct {v1, p0, p1}, Luz/o;-><init>(Luz/p;Lq/f;)V

    sput-object v1, Luz/p;->b:Luz/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0

    throw p0

    :cond_1
    return-object v1
.end method
