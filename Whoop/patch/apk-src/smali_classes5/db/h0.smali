.class public final Ldb/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/window/SurfaceSyncGroup;


# direct methods
.method public static synthetic a(Ldb/h0;Landroid/view/SurfaceView;Landroidx/fragment/app/m;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getRootSurfaceControl()Landroid/view/AttachedSurfaceControl;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/window/SurfaceSyncGroup;

    const-string v1, "exo-sync-b-334901521"

    invoke-direct {v0, v1}, Landroid/window/SurfaceSyncGroup;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ldb/h0;->a:Landroid/window/SurfaceSyncGroup;

    new-instance p0, Lb3/n;

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lb3/n;-><init>(I)V

    invoke-virtual {v0, p1, p0}, Landroid/window/SurfaceSyncGroup;->add(Landroid/view/AttachedSurfaceControl;Ljava/lang/Runnable;)Z

    move-result p0

    invoke-static {p0}, Lva3/g;->i(Z)V

    invoke-virtual {p2}, Landroidx/fragment/app/m;->run()V

    new-instance p0, Landroid/view/SurfaceControl$Transaction;

    invoke-direct {p0}, Landroid/view/SurfaceControl$Transaction;-><init>()V

    invoke-interface {p1, p0}, Landroid/view/AttachedSurfaceControl;->applyTransactionOnDraw(Landroid/view/SurfaceControl$Transaction;)Z

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    iget-object v0, p0, Ldb/h0;->a:Landroid/window/SurfaceSyncGroup;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/window/SurfaceSyncGroup;->markSyncReady()V

    const/4 v0, 0x0

    iput-object v0, p0, Ldb/h0;->a:Landroid/window/SurfaceSyncGroup;

    :cond_0
    return-void
.end method
