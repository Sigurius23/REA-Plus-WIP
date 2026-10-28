.class public Lcom/bumptech/glide/integration/okhttp3/OkHttpGlideModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(La3/l1;)V
    .locals 5

    const-class v0, Ldl/i;

    const-class v1, Ljava/io/InputStream;

    new-instance v2, Lvk/b;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lvk/b;-><init>(I)V

    iget-object p1, p1, La3/l1;->b:Ljava/lang/Object;

    check-cast p1, Lwe/o;

    monitor-enter p1

    :try_start_0
    iget-object v3, p1, Lwe/o;->w:Ljava/lang/Object;

    check-cast v3, Ldl/z;

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v3}, Ldl/z;->e()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v3, v0, v1, v2}, Ldl/z;->a(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v3

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldl/u;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lwe/o;->x:Ljava/lang/Object;

    check-cast v0, Laj/c;

    iget-object v0, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0

    :goto_1
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_1
.end method
