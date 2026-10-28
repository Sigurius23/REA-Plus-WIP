.class public final Ll53/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/List;

.field public c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll53/m;->a:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    const-string v0, "synchronizedList(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ll53/m;->b:Ljava/util/List;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ll53/m;->c:Z

    return-void
.end method


# virtual methods
.method public final a()Ll53/l;
    .locals 4

    iget-object v0, p0, Ll53/m;->b:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll53/m;->b:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Ll53/m;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    new-instance v0, Ll53/l;

    new-instance v2, La3/z0;

    const/16 v3, 0x11

    invoke-direct {v2, v3, p0, v1}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v0, v1, v2}, Ll53/l;-><init>(Ljava/util/List;La3/z0;)V

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 8

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Ll53/m;->b:Ljava/util/List;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Ll53/m;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll53/m;->b:Ljava/util/List;

    new-instance v2, Ll53/k;

    iget-object v4, p0, Ll53/m;->a:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    move-object v5, p1

    move-object v3, p2

    invoke-direct/range {v2 .. v7}, Ll53/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1

    throw p1
.end method
