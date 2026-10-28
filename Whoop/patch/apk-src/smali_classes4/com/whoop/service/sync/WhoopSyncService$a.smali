.class Lcom/whoop/service/sync/WhoopSyncService$a;
.super Lhj0/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/service/sync/WhoopSyncService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 2
    const-class v0, Lcom/whoop/service/sync/WhoopSyncService;

    invoke-direct {p0, p1, v0}, Lhj0/q;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/whoop/service/sync/WhoopSyncService$a;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public q(Ljava/lang/String;)Lcom/whoop/service/sync/WhoopSyncService$a;
    .locals 1

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    return-object p0
.end method

.method public r()V
    .locals 2

    invoke-virtual {p0}, Lhj0/q;->h()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lhj0/q;->f()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method public s()V
    .locals 2

    invoke-virtual {p0}, Lhj0/q;->h()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lhj0/q;->f()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method
