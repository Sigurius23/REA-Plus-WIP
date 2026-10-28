.class public final Lb3/b1;
.super Lbc3/z;
.source "SourceFile"


# static fields
.field public static final K:Ll83/p;

.field public static final L:Lae3/d;


# instance fields
.field public E:Ljava/util/ArrayList;

.field public F:Ljava/util/ArrayList;

.field public G:Z

.field public H:Z

.field public final I:Lb3/a1;

.field public final J:Lb3/d1;

.field public final w:Landroid/view/Choreographer;

.field public final x:Landroid/os/Handler;

.field public final y:Ljava/lang/Object;

.field public final z:Lm83/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lb3/p0;->G:Lb3/p0;

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lb3/b1;->K:Ll83/p;

    new-instance v0, Lae3/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lae3/d;-><init>(I)V

    sput-object v0, Lb3/b1;->L:Lae3/d;

    return-void
.end method

.method public constructor <init>(Landroid/view/Choreographer;Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0}, Lbc3/z;-><init>()V

    iput-object p1, p0, Lb3/b1;->w:Landroid/view/Choreographer;

    iput-object p2, p0, Lb3/b1;->x:Landroid/os/Handler;

    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb3/b1;->y:Ljava/lang/Object;

    new-instance p2, Lm83/m;

    invoke-direct {p2}, Lm83/m;-><init>()V

    iput-object p2, p0, Lb3/b1;->z:Lm83/m;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lb3/b1;->E:Ljava/util/ArrayList;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lb3/b1;->F:Ljava/util/ArrayList;

    new-instance p2, Lb3/a1;

    invoke-direct {p2, p0}, Lb3/a1;-><init>(Lb3/b1;)V

    iput-object p2, p0, Lb3/b1;->I:Lb3/a1;

    new-instance p2, Lb3/d1;

    invoke-direct {p2, p1, p0}, Lb3/d1;-><init>(Landroid/view/Choreographer;Lb3/b1;)V

    iput-object p2, p0, Lb3/b1;->J:Lb3/d1;

    return-void
.end method

.method public static final s(Lb3/b1;)V
    .locals 2

    :cond_0
    iget-object v0, p0, Lb3/b1;->y:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lb3/b1;->z:Lm83/m;

    invoke-virtual {v1}, Lm83/m;->q()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    :goto_0
    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    iget-object v0, p0, Lb3/b1;->y:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    iget-object v1, p0, Lb3/b1;->z:Lm83/m;

    invoke-virtual {v1}, Lm83/m;->q()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0

    :cond_1
    iget-object v0, p0, Lb3/b1;->y:Ljava/lang/Object;

    monitor-enter v0

    :try_start_2
    iget-object v1, p0, Lb3/b1;->z:Lm83/m;

    invoke-virtual {v1}, Lm83/m;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    iput-boolean v1, p0, Lb3/b1;->G:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    goto :goto_2

    :cond_2
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    if-nez v1, :cond_0

    return-void

    :goto_2
    monitor-exit v0

    throw p0

    :catchall_2
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final dispatch(Lq83/j;Ljava/lang/Runnable;)V
    .locals 2

    iget-object p1, p0, Lb3/b1;->y:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lb3/b1;->z:Lm83/m;

    invoke-virtual {v0, p2}, Lm83/m;->addLast(Ljava/lang/Object;)V

    iget-boolean p2, p0, Lb3/b1;->G:Z

    if-nez p2, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p0, Lb3/b1;->G:Z

    iget-object v0, p0, Lb3/b1;->x:Landroid/os/Handler;

    iget-object v1, p0, Lb3/b1;->I:Lb3/a1;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-boolean v0, p0, Lb3/b1;->H:Z

    if-nez v0, :cond_0

    iput-boolean p2, p0, Lb3/b1;->H:Z

    iget-object p2, p0, Lb3/b1;->w:Landroid/view/Choreographer;

    iget-object v0, p0, Lb3/b1;->I:Lb3/a1;

    invoke-virtual {p2, v0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1

    throw p2
.end method
