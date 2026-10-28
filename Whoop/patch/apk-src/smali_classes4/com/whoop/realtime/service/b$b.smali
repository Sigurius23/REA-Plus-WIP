.class Lcom/whoop/realtime/service/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/realtime/service/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic w:Lcom/whoop/realtime/service/b;


# direct methods
.method public constructor <init>(Lcom/whoop/realtime/service/b;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/realtime/service/b$b;->w:Lcom/whoop/realtime/service/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    iget-object p1, p0, Lcom/whoop/realtime/service/b$b;->w:Lcom/whoop/realtime/service/b;

    invoke-static {p1}, Lcom/whoop/realtime/service/b;->i(Lcom/whoop/realtime/service/b;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "RealTimeActivityController RealTimeActivityController onServiceConnected"

    invoke-interface {p1, v1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/realtime/service/b$b;->w:Lcom/whoop/realtime/service/b;

    check-cast p2, Lcom/whoop/realtime/service/RealTimeActivityService$a;

    invoke-virtual {p2}, Lcom/whoop/realtime/service/RealTimeActivityService$a;->a()Lcom/whoop/realtime/service/RealTimeActivityService;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/whoop/realtime/service/b;->j(Lcom/whoop/realtime/service/b;Lcom/whoop/realtime/service/RealTimeActivityService;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    iget-object p1, p0, Lcom/whoop/realtime/service/b$b;->w:Lcom/whoop/realtime/service/b;

    invoke-static {p1}, Lcom/whoop/realtime/service/b;->k(Lcom/whoop/realtime/service/b;)V

    return-void
.end method
