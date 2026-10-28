.class public final Llh3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:Llh3/n;


# direct methods
.method public constructor <init>(Llh3/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llh3/a;->w:Llh3/n;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 8

    check-cast p1, Llh3/m;

    iget-object v0, p0, Llh3/a;->w:Llh3/n;

    iget-object v0, v0, Llh3/n;->w:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-boolean v1, p1, Llh3/m;->x:Z

    if-eqz v1, :cond_8

    iget-boolean v1, p1, Llh3/m;->y:Z

    if-eqz v1, :cond_0

    goto/16 :goto_7

    :cond_0
    const/4 v1, 0x0

    iput-boolean v1, p1, Llh3/m;->x:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    move v3, v2

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_0
    iput-boolean v3, p1, Llh3/m;->y:Z

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    if-eqz v0, :cond_7

    const/4 v3, 0x0

    move v5, v2

    move-object v4, v3

    :goto_1
    if-eqz v4, :cond_3

    :try_start_1
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_2

    iget-object v7, p1, Llh3/m;->w:Lxg3/s;

    invoke-static {v7, v6}, Lch3/d;->a(Lxg3/h;Ljava/lang/Object;)Z

    goto :goto_2

    :goto_3
    move v2, v1

    goto :goto_5

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_3
    if-eqz v5, :cond_4

    iget-object v4, p1, Llh3/m;->w:Lxg3/s;

    invoke-static {v4, v0}, Lch3/d;->a(Lxg3/h;Ljava/lang/Object;)Z

    move v5, v1

    :cond_4
    monitor-enter p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v4, p1, Llh3/m;->z:Ljava/util/ArrayList;

    iput-object v3, p1, Llh3/m;->z:Ljava/util/ArrayList;

    if-nez v4, :cond_5

    iput-boolean v1, p1, Llh3/m;->y:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return-void

    :catchall_1
    move-exception v0

    goto :goto_4

    :catchall_2
    move-exception v0

    move v2, v1

    goto :goto_4

    :cond_5
    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_1

    :goto_4
    :try_start_5
    monitor-exit p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception v0

    :goto_5
    if-nez v2, :cond_6

    monitor-enter p1

    :try_start_7
    iput-boolean v1, p1, Llh3/m;->y:Z

    monitor-exit p1

    goto :goto_6

    :catchall_4
    move-exception v0

    monitor-exit p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    throw v0

    :cond_6
    :goto_6
    throw v0

    :cond_7
    return-void

    :catchall_5
    move-exception v0

    goto :goto_8

    :cond_8
    :goto_7
    :try_start_8
    monitor-exit p1

    return-void

    :goto_8
    monitor-exit p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    throw v0
.end method
