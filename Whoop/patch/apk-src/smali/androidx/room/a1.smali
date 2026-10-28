.class public final Landroidx/room/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:Lbc3/m;

.field public final synthetic x:Landroidx/room/z0;

.field public final synthetic y:Landroidx/room/b1;


# direct methods
.method public constructor <init>(Lbc3/m;Landroidx/room/z0;Landroidx/room/b1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/a1;->w:Lbc3/m;

    iput-object p2, p0, Landroidx/room/a1;->x:Landroidx/room/z0;

    iput-object p3, p0, Landroidx/room/a1;->y:Landroidx/room/b1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v2, p0, Landroidx/room/a1;->w:Lbc3/m;

    :try_start_0
    iget-object v0, v2, Lbc3/m;->E:Lq83/j;

    sget-object v1, Lq83/e;->w:Lq83/e;

    invoke-interface {v0, v1}, Lq83/j;->minusKey(Lq83/i;)Lq83/j;

    move-result-object v6

    new-instance v0, Landroidx/lifecycle/e1;

    iget-object v1, p0, Landroidx/room/a1;->x:Landroidx/room/z0;

    iget-object v3, p0, Landroidx/room/a1;->y:Landroidx/room/b1;

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Landroidx/lifecycle/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v6, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v2, v0}, Lbc3/m;->cancel(Ljava/lang/Throwable;)Z

    return-void
.end method
