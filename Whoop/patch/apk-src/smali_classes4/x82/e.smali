.class public abstract Lx82/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx82/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Landroid/app/Service;",
        ">",
        "Ljava/lang/Object;",
        "Landroid/content/ServiceConnection;"
    }
.end annotation


# instance fields
.field private w:Lx82/e$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx82/e$a<",
            "TS;>;"
        }
    .end annotation
.end field

.field private x:Lze1/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lze1/d<",
            "TS;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lze1/d;->Y()Lze1/d;

    move-result-object v0

    iput-object v0, p0, Lx82/e;->x:Lze1/d;

    return-void
.end method


# virtual methods
.method public a()Landroid/app/Service;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TS;"
        }
    .end annotation

    iget-object v0, p0, Lx82/e;->w:Lx82/e$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx82/e$a;->a()Landroid/app/Service;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Landroid/content/Context;)V
    .locals 0

    invoke-virtual {p1, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    return-void
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    check-cast p2, Lx82/e$a;

    iput-object p2, p0, Lx82/e;->w:Lx82/e$a;

    iget-object p1, p0, Lx82/e;->x:Lze1/d;

    invoke-virtual {p0}, Lx82/e;->a()Landroid/app/Service;

    move-result-object p2

    invoke-virtual {p1, p2}, Llh3/j;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const/4 p1, 0x0

    iput-object p1, p0, Lx82/e;->w:Lx82/e$a;

    iget-object v0, p0, Lx82/e;->x:Lze1/d;

    invoke-virtual {v0, p1}, Llh3/j;->onNext(Ljava/lang/Object;)V

    return-void
.end method
