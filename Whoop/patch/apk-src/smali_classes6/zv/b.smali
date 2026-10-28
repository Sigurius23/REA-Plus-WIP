.class public final Lzv/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lev/j;


# instance fields
.field public E:Lzv/c;

.field public final F:Law/a;

.field public final w:Landroid/os/Handler;

.field public final x:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public y:Lfv/a;

.field public final z:Lzv/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lzv/b;->w:Landroid/os/Handler;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lzv/b;->x:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v0, Lzv/a;

    invoke-direct {v0, p0}, Lzv/a;-><init>(Lzv/b;)V

    iput-object v0, p0, Lzv/b;->z:Lzv/a;

    sget-object v0, Lzv/c;->a:Lzv/c;

    iput-object v0, p0, Lzv/b;->E:Lzv/c;

    new-instance v0, Law/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lzv/b;->F:Law/a;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lzv/b;->y:Lfv/a;

    if-eqz v0, :cond_0

    check-cast v0, Lfv/h;

    const-string v1, "listener"

    iget-object v2, p0, Lzv/b;->z:Lzv/a;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lfv/h;->J:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    return-void

    :cond_0
    const-string v0, "cameraPlugin"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final f(Lev/i;)V
    .locals 5

    iget-object p1, p1, Lev/i;->i:Ljava/lang/Object;

    check-cast p1, Lcom/mapbox/maps/MapController;

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "MAPBOX_CAMERA_PLUGIN_ID"

    invoke-interface {p1, v1}, Lmv/f;->getPlugin(Ljava/lang/String;)Lev/j;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v2, Lfv/a;

    iput-object v2, p0, Lzv/b;->y:Lfv/a;

    check-cast v2, Lfv/h;

    const-string v3, "listener"

    iget-object v4, p0, Lzv/b;->z:Lzv/a;

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v2, Lfv/h;->J:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v2, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    new-instance v2, Lbw/a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v1}, Lmv/f;->getPlugin(Ljava/lang/String;)Lev/j;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v2, Lfv/a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v1}, Lmv/f;->getPlugin(Ljava/lang/String;)Lev/j;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Lfv/a;

    return-void
.end method

.method public final initialize()V
    .locals 0

    return-void
.end method
