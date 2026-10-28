.class Lcom/whoop/realtime/service/b$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/realtime/service/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/whoop/realtime/service/b;


# direct methods
.method public constructor <init>(Lcom/whoop/realtime/service/b;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/realtime/service/b$a;->a:Lcom/whoop/realtime/service/b;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/service/b$a;->a:Lcom/whoop/realtime/service/b;

    invoke-static {v0}, Lcom/whoop/realtime/service/b;->h(Lcom/whoop/realtime/service/b;)Lcom/whoop/realtime/service/b$c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Lcom/whoop/realtime/service/c;->h(Landroid/content/Context;Landroid/content/Intent;)Lcom/whoop/realtime/service/c$a;

    move-result-object p1

    iget-object p2, p0, Lcom/whoop/realtime/service/b$a;->a:Lcom/whoop/realtime/service/b;

    invoke-static {p2}, Lcom/whoop/realtime/service/b;->h(Lcom/whoop/realtime/service/b;)Lcom/whoop/realtime/service/b$c;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/realtime/service/c$a;->t()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/realtime/service/c$a;->s()Ljava/lang/Long;

    move-result-object p1

    check-cast p2, Lo52/y;

    invoke-virtual {p2, v0, p1}, Lo52/y;->a(Ljava/lang/Long;Ljava/lang/Long;)V

    :cond_0
    return-void
.end method
