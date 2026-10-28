.class public final Lib/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/recyclerview/widget/c;

.field public final b:Lqg3/d;

.field public final c:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public d:Z

.field public e:Lib/n;

.field public f:Lib/n;

.field public g:I

.field public final h:Lib/a;


# direct methods
.method public constructor <init>(Lib/p;Landroidx/recyclerview/widget/u;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lib/c;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Lib/a;

    invoke-direct {v0, p0}, Lib/a;-><init>(Lib/c;)V

    iput-object v0, p0, Lib/c;->h:Lib/a;

    new-instance v0, Landroidx/recyclerview/widget/c;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/c;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lib/c;->a:Landroidx/recyclerview/widget/c;

    sget-object p1, Landroidx/recyclerview/widget/d;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    sget-object v0, Landroidx/recyclerview/widget/d;->b:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ExecutorService;

    sput-object v0, Landroidx/recyclerview/widget/d;->b:Ljava/util/concurrent/ExecutorService;

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object p1, Landroidx/recyclerview/widget/d;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Lqg3/d;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p1, p2}, Lqg3/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lib/c;->b:Lqg3/d;

    return-void

    :goto_1
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2
.end method


# virtual methods
.method public final a(Lib/n;Lib/n;)V
    .locals 2

    iget-object v0, p0, Lib/c;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lib/b;

    check-cast v1, Lib/o;

    iget-object v1, v1, Lib/o;->a:Lib/p;

    invoke-virtual {v1, p2}, Lib/p;->a(Lib/n;)V

    invoke-virtual {v1, p1, p2}, Lib/p;->b(Lib/n;Lib/n;)V

    goto :goto_0

    :cond_0
    return-void
.end method
