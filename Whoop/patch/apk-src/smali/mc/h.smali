.class public final Lmc/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object v0, p0, Lmc/h;->a:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lmc/h;->a:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Loc/i;)V
    .locals 12

    const-string v0, "trackers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Lnc/c;

    .line 5
    iget-object v1, p1, Loc/i;->b:Leb/o0;

    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnc/c;-><init>(Leb/o0;I)V

    .line 7
    new-instance v1, Lnc/c;

    .line 8
    iget-object v3, p1, Loc/i;->c:Loc/a;

    .line 9
    invoke-direct {v1, v3}, Lnc/c;-><init>(Loc/a;)V

    .line 10
    new-instance v3, Lnc/c;

    .line 11
    iget-object v4, p1, Loc/i;->e:Leb/o0;

    const/4 v5, 0x4

    .line 12
    invoke-direct {v3, v4, v5}, Lnc/c;-><init>(Leb/o0;I)V

    .line 13
    new-instance v4, Lnc/c;

    .line 14
    iget-object v6, p1, Loc/i;->d:Leb/o0;

    const/4 v7, 0x2

    .line 15
    invoke-direct {v4, v6, v7}, Lnc/c;-><init>(Leb/o0;I)V

    .line 16
    new-instance v8, Lnc/c;

    const/4 v9, 0x3

    invoke-direct {v8, v6, v9}, Lnc/c;-><init>(Leb/o0;I)V

    .line 17
    new-instance v10, Lnc/f;

    invoke-direct {v10, v6}, Lnc/f;-><init>(Leb/o0;)V

    .line 18
    new-instance v11, Lnc/e;

    invoke-direct {v11, v6}, Lnc/e;-><init>(Leb/o0;)V

    .line 19
    iget-object p1, p1, Loc/i;->a:Landroid/content/Context;

    .line 20
    sget-object v6, Lmc/i;->a:Ljava/lang/String;

    .line 21
    const-string v6, "context"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    const-string v6, "connectivity"

    invoke-virtual {p1, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v6, "null cannot be cast to non-null type android.net.ConnectivityManager"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/net/ConnectivityManager;

    .line 23
    new-instance v6, Lmc/d;

    invoke-direct {v6, p1}, Lmc/d;-><init>(Landroid/net/ConnectivityManager;)V

    const/16 p1, 0x8

    .line 24
    new-array p1, p1, [Lnc/d;

    aput-object v0, p1, v2

    const/4 v0, 0x1

    aput-object v1, p1, v0

    aput-object v3, p1, v7

    aput-object v4, p1, v9

    aput-object v8, p1, v5

    const/4 v0, 0x5

    aput-object v10, p1, v0

    const/4 v0, 0x6

    aput-object v11, p1, v0

    const/4 v0, 0x7

    aput-object v6, p1, v0

    .line 25
    invoke-static {p1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmc/h;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-object v0, p0, Lmc/h;->a:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyf/s;

    iget-object v2, v1, Lyf/s;->w:Lyf/r;

    monitor-enter v2

    :try_start_0
    iget-object v3, v1, Lyf/s;->w:Lyf/r;

    iget-boolean v4, v3, Lyf/r;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_0

    :goto_1
    monitor-exit v2

    goto :goto_0

    :cond_0
    :try_start_1
    iget v4, v3, Lyf/r;->a:I

    add-int/lit8 v4, v4, -0x1

    iput v4, v3, Lyf/r;->a:I

    if-lez v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x1

    iput-boolean v4, v3, Lyf/r;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    iget-object v1, v1, Lyf/s;->x:Ljava/io/Closeable;

    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_2
    return-void
.end method
