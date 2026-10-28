.class public Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AlarmManagerSchedulerBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10

    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    const-string v1, "backendName"

    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    const-string v2, "extras"

    invoke-virtual {v1, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    const-string v3, "priority"

    invoke-virtual {v2, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    const-string v3, "attemptNumber"

    invoke-virtual {p2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v7

    invoke-static {p1}, Lgm/q;->b(Landroid/content/Context;)V

    invoke-static {}, Lgm/i;->a()La33/d;

    move-result-object p1

    invoke-virtual {p1, v0}, La33/d;->Q(Ljava/lang/String;)V

    invoke-static {v2}, Lqm/a;->b(I)Ldm/d;

    move-result-object p2

    iput-object p2, p1, La33/d;->z:Ljava/lang/Object;

    if-eqz v1, :cond_0

    const/4 p2, 0x0

    invoke-static {v1, p2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p2

    iput-object p2, p1, La33/d;->y:Ljava/lang/Object;

    :cond_0
    invoke-static {}, Lgm/q;->a()Lgm/q;

    move-result-object p2

    iget-object v5, p2, Lgm/q;->d:Lev/i;

    invoke-virtual {p1}, La33/d;->d()Lgm/i;

    move-result-object v6

    new-instance v8, Lcom/iterable/iterableapi/k1;

    const/4 p1, 0x2

    invoke-direct {v8, p1}, Lcom/iterable/iterableapi/k1;-><init>(I)V

    iget-object p1, v5, Lev/i;->e:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/Executor;

    new-instance v4, Ljj/c;

    const/4 v9, 0x1

    invoke-direct/range {v4 .. v9}, Ljj/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)V

    invoke-interface {p1, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
