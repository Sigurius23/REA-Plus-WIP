.class public final Lsc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsc/a;


# instance fields
.field public final a:Landroidx/room/u1;

.field public final b:Lbc3/z;

.field public final c:Landroid/os/Handler;

.field public final d:Lcq/s;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lsc/b;->c:Landroid/os/Handler;

    new-instance v0, Lcq/s;

    invoke-direct {v0, p0}, Lcq/s;-><init>(Lsc/b;)V

    iput-object v0, p0, Lsc/b;->d:Lcq/s;

    new-instance v0, Landroidx/room/u1;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Landroidx/room/u1;-><init>(Ljava/util/concurrent/Executor;I)V

    iput-object v0, p0, Lsc/b;->a:Landroidx/room/u1;

    invoke-static {v0}, Lbc3/f0;->q(Ljava/util/concurrent/Executor;)Lbc3/z;

    move-result-object p1

    iput-object p1, p0, Lsc/b;->b:Lbc3/z;

    return-void
.end method
