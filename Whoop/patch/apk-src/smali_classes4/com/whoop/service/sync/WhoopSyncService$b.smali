.class public Lcom/whoop/service/sync/WhoopSyncService$b;
.super Lx82/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/service/sync/WhoopSyncService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx82/e<",
        "Lcom/whoop/service/sync/WhoopSyncService;",
        ">;"
    }
.end annotation


# instance fields
.field private y:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Lx82/e;-><init>()V

    iput-object p1, p0, Lcom/whoop/service/sync/WhoopSyncService$b;->y:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)Z
    .locals 6

    const-string v0, "Failed to perform action: "

    const-string v1, "WhoopSyncService"

    invoke-virtual {p0}, Lx82/e;->a()Landroid/app/Service;

    move-result-object v2

    check-cast v2, Lcom/whoop/service/sync/WhoopSyncService;

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    const-string v4, "background"

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {v2}, Lcom/whoop/service/sync/WhoopSyncService;->a(Lcom/whoop/service/sync/WhoopSyncService;)Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_0
    invoke-virtual {v2, p1}, Lcom/whoop/service/sync/WhoopSyncService;->g(Ljava/lang/String;)I

    return v3

    :cond_1
    const/4 v2, 0x0

    :try_start_0
    new-instance v4, Lcom/whoop/service/sync/WhoopSyncService$a;

    iget-object v5, p0, Lcom/whoop/service/sync/WhoopSyncService$b;->y:Landroid/content/Context;

    invoke-direct {v4, v5, v2}, Lcom/whoop/service/sync/WhoopSyncService$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, p1}, Lcom/whoop/service/sync/WhoopSyncService$a;->q(Ljava/lang/String;)Lcom/whoop/service/sync/WhoopSyncService$a;

    move-result-object v4

    const-string v5, "btForeground"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v4}, Lcom/whoop/service/sync/WhoopSyncService$a;->r()V

    return v3

    :catch_0
    move-exception v3

    goto :goto_0

    :catch_1
    move-exception v3

    goto :goto_1

    :cond_2
    invoke-virtual {v4}, Lcom/whoop/service/sync/WhoopSyncService$a;->s()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v3

    :goto_0
    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v4

    invoke-virtual {v4}, Le50/b;->d()Ltr2/n;

    move-result-object v4

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v2, [Lqr2/a$a;

    invoke-interface {v4, v1, p1, v3, v0}, Ltr2/n;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return v2

    :goto_1
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Not allowed to start service"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v0

    invoke-virtual {v0}, Le50/b;->d()Ltr2/n;

    move-result-object v0

    const-string v3, "Can\'t start service from background for action: "

    invoke-static {v3, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v3, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v3}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_2

    :cond_3
    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v4

    invoke-virtual {v4}, Le50/b;->d()Ltr2/n;

    move-result-object v4

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v2, [Lqr2/a$a;

    invoke-interface {v4, v1, p1, v3, v0}, Ltr2/n;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_2
    return v2
.end method

.method public d()Z
    .locals 1

    const-string v0, "background"

    invoke-virtual {p0, v0}, Lcom/whoop/service/sync/WhoopSyncService$b;->c(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 1

    const-string v0, "btForeground"

    invoke-virtual {p0, v0}, Lcom/whoop/service/sync/WhoopSyncService$b;->c(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public f()Z
    .locals 1

    const-string v0, "stopBackground"

    invoke-virtual {p0, v0}, Lcom/whoop/service/sync/WhoopSyncService$b;->c(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public g()Z
    .locals 1

    const-string v0, "btStopForeground"

    invoke-virtual {p0, v0}, Lcom/whoop/service/sync/WhoopSyncService$b;->c(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
