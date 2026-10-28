.class public Lcom/whoop/service/OnReboot;
.super Li8/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object p1

    invoke-virtual {p1}, Le50/b;->d()Ltr2/n;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    const-string v0, "Reboot"

    const-string v1, "Handling boot"

    invoke-interface {p1, v0, v1, p2}, Ltr2/n;->k(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    const-class p1, Lc92/g;

    const/4 p2, 0x0

    invoke-static {p1, p2, p2}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc92/g;

    invoke-virtual {p1}, Lc92/g;->g0()V

    return-void
.end method
