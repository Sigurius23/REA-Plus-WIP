.class Lc92/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc92/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic w:Lc92/g;


# direct methods
.method public constructor <init>(Lc92/g;)V
    .locals 0

    iput-object p1, p0, Lc92/g$b;->w:Lc92/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    iget-object p1, p0, Lc92/g$b;->w:Lc92/g;

    check-cast p2, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;

    invoke-static {p1, p2}, Lc92/g;->t(Lc92/g;Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;)V

    iget-object p1, p0, Lc92/g$b;->w:Lc92/g;

    invoke-static {p1}, Lc92/g;->o(Lc92/g;)Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;

    move-result-object p1

    iget-object p2, p0, Lc92/g$b;->w:Lc92/g;

    invoke-virtual {p1, p2}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->c(Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;)Ln73/b;

    iget-object p1, p0, Lc92/g$b;->w:Lc92/g;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lc92/g;->p(Lc92/g;Z)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    iget-object p1, p0, Lc92/g$b;->w:Lc92/g;

    invoke-static {p1}, Lc92/g;->l(Lc92/g;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v1, v0, [Lqr2/a$a;

    const-string v2, "nordic ble device lost"

    invoke-interface {p1, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lc92/g$b;->w:Lc92/g;

    invoke-static {p1}, Lc92/g;->r(Lc92/g;)V

    iget-object p1, p0, Lc92/g$b;->w:Lc92/g;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lc92/g;->t(Lc92/g;Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;)V

    iget-object p1, p0, Lc92/g$b;->w:Lc92/g;

    invoke-static {p1, v0}, Lc92/g;->p(Lc92/g;Z)V

    return-void
.end method
