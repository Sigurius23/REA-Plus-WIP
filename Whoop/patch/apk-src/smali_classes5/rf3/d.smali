.class public final Lrf3/d;
.super Lrf3/b;
.source "SourceFile"


# instance fields
.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lqf3/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lrf3/b;-><init>(Lqf3/b;)V

    return-void
.end method


# virtual methods
.method public final a(La3/p;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lrf3/d;->b:Ljava/lang/Object;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Lrf3/b;->a(La3/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Single instance created couldn\'t return value"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(La3/p;)Ljava/lang/Object;
    .locals 2

    new-instance v0, La3/m0;

    const/4 v1, 0x7

    invoke-direct {v0, v1, p0, p1}, La3/m0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    monitor-enter p0

    :try_start_0
    invoke-virtual {v0}, La3/m0;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    iget-object p1, p0, Lrf3/d;->b:Ljava/lang/Object;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    const-string p1, "Single instance created couldn\'t return value"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
