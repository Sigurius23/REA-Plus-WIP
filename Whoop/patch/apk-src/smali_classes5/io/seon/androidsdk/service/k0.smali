.class public final Lio/seon/androidsdk/service/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lio/seon/androidsdk/service/b0;

.field public final b:Lio/seon/androidsdk/service/s0;

.field public final c:Lio/seon/androidsdk/service/j1;

.field public final d:Lio/seon/androidsdk/service/n;

.field public final e:Lio/seon/androidsdk/service/w;

.field public final f:Lio/seon/androidsdk/service/h0;

.field public final g:Lio/seon/androidsdk/service/r;

.field public final h:Lio/seon/androidsdk/service/p0;

.field public final i:Lio/seon/androidsdk/service/u0;

.field public final j:Lio/seon/androidsdk/service/z0;

.field public final k:Lio/seon/androidsdk/service/u;

.field public final l:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lio/seon/androidsdk/service/f;)V
    .locals 12

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/seon/androidsdk/service/b0;

    invoke-direct {v0}, Lio/seon/androidsdk/service/g;-><init>()V

    const/4 v1, 0x0

    iput-object v1, v0, Lio/seon/androidsdk/service/b0;->e:Lio/seon/androidsdk/service/SeonNT;

    iput-object v0, p0, Lio/seon/androidsdk/service/k0;->a:Lio/seon/androidsdk/service/b0;

    new-instance v2, Lio/seon/androidsdk/service/s0;

    invoke-direct {v2}, Lio/seon/androidsdk/service/g;-><init>()V

    iput-object v1, v2, Lio/seon/androidsdk/service/s0;->e:Landroid/os/PowerManager;

    iput-object v2, p0, Lio/seon/androidsdk/service/k0;->b:Lio/seon/androidsdk/service/s0;

    new-instance v3, Lio/seon/androidsdk/service/j1;

    invoke-direct {v3}, Lio/seon/androidsdk/service/g;-><init>()V

    iput-object v3, p0, Lio/seon/androidsdk/service/k0;->c:Lio/seon/androidsdk/service/j1;

    new-instance v4, Lio/seon/androidsdk/service/n;

    invoke-direct {v4}, Lio/seon/androidsdk/service/g;-><init>()V

    iput-object v4, p0, Lio/seon/androidsdk/service/k0;->d:Lio/seon/androidsdk/service/n;

    new-instance v5, Lio/seon/androidsdk/service/w;

    invoke-direct {v5}, Lio/seon/androidsdk/service/g;-><init>()V

    iput-object v5, p0, Lio/seon/androidsdk/service/k0;->e:Lio/seon/androidsdk/service/w;

    new-instance v6, Lio/seon/androidsdk/service/h0;

    invoke-direct {v6}, Lio/seon/androidsdk/service/g;-><init>()V

    const/4 v7, 0x0

    iput-boolean v7, v6, Lio/seon/androidsdk/service/h0;->h:Z

    iput-object v1, v6, Lio/seon/androidsdk/service/h0;->i:Landroid/content/pm/PackageManager;

    iput-object v6, p0, Lio/seon/androidsdk/service/k0;->f:Lio/seon/androidsdk/service/h0;

    new-instance v7, Lio/seon/androidsdk/service/r;

    invoke-direct {v7}, Lio/seon/androidsdk/service/g;-><init>()V

    iput-object v7, p0, Lio/seon/androidsdk/service/k0;->g:Lio/seon/androidsdk/service/r;

    new-instance v8, Lio/seon/androidsdk/service/p0;

    invoke-direct {v8}, Lio/seon/androidsdk/service/p0;-><init>()V

    iput-object v8, p0, Lio/seon/androidsdk/service/k0;->h:Lio/seon/androidsdk/service/p0;

    new-instance v9, Lio/seon/androidsdk/service/u0;

    invoke-direct {v9}, Lio/seon/androidsdk/service/g;-><init>()V

    iput-object v9, p0, Lio/seon/androidsdk/service/k0;->i:Lio/seon/androidsdk/service/u0;

    new-instance v10, Lio/seon/androidsdk/service/z0;

    invoke-direct {v10}, Lio/seon/androidsdk/service/g;-><init>()V

    iput-object v1, v10, Lio/seon/androidsdk/service/z0;->f:Lio/seon/androidsdk/service/SeonNT;

    iput-object v1, v10, Lio/seon/androidsdk/service/z0;->g:Lio/seon/androidsdk/service/d1;

    iput-object v10, p0, Lio/seon/androidsdk/service/k0;->j:Lio/seon/androidsdk/service/z0;

    new-instance v11, Lio/seon/androidsdk/service/u;

    invoke-direct {v11}, Lio/seon/androidsdk/service/g;-><init>()V

    iput-object v1, v11, Lio/seon/androidsdk/service/u;->f:Ljava/lang/Integer;

    iput-object v1, v11, Lio/seon/androidsdk/service/u;->g:Ljava/util/LinkedHashMap;

    iput-object v11, p0, Lio/seon/androidsdk/service/k0;->k:Lio/seon/androidsdk/service/u;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lio/seon/androidsdk/service/k0;->l:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lio/seon/androidsdk/service/f1;

    iget-object p1, p1, Lio/seon/androidsdk/service/f;->b:Landroid/content/Context;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Lio/seon/androidsdk/service/f1;->a:Landroid/content/Context;

    iput-object p0, v0, Lio/seon/androidsdk/service/f1;->b:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :catchall_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/seon/androidsdk/service/g;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v1, v0}, Lio/seon/androidsdk/service/i;->c(Lio/seon/androidsdk/service/f1;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v2

    :try_start_0
    iget-object v2, v1, Lio/seon/androidsdk/service/g;->a:Ljava/util/HashMap;

    iget-object v1, v1, Lio/seon/androidsdk/service/g;->c:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    const-string v2, "bootstrap"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lio/seon/androidsdk/service/k0;->l:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final b()Lio/seon/androidsdk/service/u0;
    .locals 1

    iget-object v0, p0, Lio/seon/androidsdk/service/k0;->i:Lio/seon/androidsdk/service/u0;

    return-object v0
.end method

.method public final c()Lio/seon/androidsdk/service/u;
    .locals 1

    iget-object v0, p0, Lio/seon/androidsdk/service/k0;->k:Lio/seon/androidsdk/service/u;

    return-object v0
.end method
