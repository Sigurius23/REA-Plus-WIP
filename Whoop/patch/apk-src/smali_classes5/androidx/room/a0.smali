.class public final Landroidx/room/a0;
.super Landroidx/room/s;
.source "SourceFile"


# instance fields
.field public final synthetic b:Landroidx/room/c0;


# direct methods
.method public constructor <init>(Landroidx/room/c0;[Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Landroidx/room/a0;->b:Landroidx/room/c0;

    invoke-direct {p0, p2}, Landroidx/room/s;-><init>([Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)V
    .locals 3

    const-string v0, "tables"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/a0;->b:Landroidx/room/c0;

    iget-object v1, v0, Landroidx/room/c0;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v1, v0, Landroidx/room/c0;->g:Landroidx/room/q;

    if-eqz v1, :cond_1

    iget v0, v0, Landroidx/room/c0;->f:I

    check-cast p1, Ljava/util/Collection;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {p1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-interface {v1, v0, p1}, Landroidx/room/q;->y(I[Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    :goto_1
    const-string v0, "ROOM"

    const-string v1, "Cannot broadcast invalidation"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method
