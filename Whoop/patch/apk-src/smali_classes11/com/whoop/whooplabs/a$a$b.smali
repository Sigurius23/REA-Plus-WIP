.class public final Lcom/whoop/whooplabs/a$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/whooplabs/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\t\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "com/whoop/whooplabs/a$a$b",
        "Landroid/content/ServiceConnection;",
        "Landroid/content/ComponentName;",
        "name",
        "Landroid/os/IBinder;",
        "iBinder",
        "Ll83/a0;",
        "onServiceConnected",
        "(Landroid/content/ComponentName;Landroid/os/IBinder;)V",
        "onServiceDisconnected",
        "(Landroid/content/ComponentName;)V",
        "whooplabs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lcom/whoop/whooplabs/a;

.field final synthetic x:Lbc3/c0;

.field final synthetic y:Lbc3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/k;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/whooplabs/a;Lbc3/c0;Lbc3/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/a;",
            "Lbc3/c0;",
            "Lbc3/k;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/whooplabs/a$a$b;->w:Lcom/whoop/whooplabs/a;

    iput-object p2, p0, Lcom/whoop/whooplabs/a$a$b;->x:Lbc3/c0;

    iput-object p3, p0, Lcom/whoop/whooplabs/a$a$b;->y:Lbc3/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 4

    instance-of p1, p2, Lcom/whoop/whooplabs/WhoopLabsService$a;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    check-cast p2, Lcom/whoop/whooplabs/WhoopLabsService$a;

    goto :goto_0

    :cond_0
    move-object p2, v0

    :goto_0
    if-nez p2, :cond_1

    iget-object p1, p0, Lcom/whoop/whooplabs/a$a$b;->y:Lbc3/k;

    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "WhoopLabsService binder type mismatch"

    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lbc3/k;->cancel(Ljava/lang/Throwable;)Z

    return-void

    :cond_1
    :try_start_0
    iget-object p1, p0, Lcom/whoop/whooplabs/a$a$b;->w:Lcom/whoop/whooplabs/a;

    invoke-static {p1}, Lcom/whoop/whooplabs/a;->a(Lcom/whoop/whooplabs/a;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object v1, p0, Lcom/whoop/whooplabs/a$a$b;->w:Lcom/whoop/whooplabs/a;

    invoke-static {v1}, Lcom/whoop/whooplabs/a;->b(Lcom/whoop/whooplabs/a;)Ltr2/n;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "Already unbound"

    invoke-interface {v1, v3, p1, v2}, Ltr2/n;->a(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_1
    invoke-virtual {p2}, Lcom/whoop/whooplabs/WhoopLabsService$a;->a()Lcom/whoop/whooplabs/WhoopLabsService;

    move-result-object p1

    iget-object p2, p0, Lcom/whoop/whooplabs/a$a$b;->x:Lbc3/c0;

    new-instance v1, Lcom/whoop/whooplabs/a$a$b$a;

    iget-object v2, p0, Lcom/whoop/whooplabs/a$a$b;->y:Lbc3/k;

    invoke-direct {v1, p1, v2, v0}, Lcom/whoop/whooplabs/a$a$b$a;-><init>(Lcom/whoop/whooplabs/WhoopLabsService;Lbc3/k;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p2, v0, v0, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    return-void
.end method
