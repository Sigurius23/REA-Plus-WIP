.class public final Lq03/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxu0/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lq03/a;",
        "Lxu0/a;",
        "Lic/p0;",
        "workManager",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Lic/p0;Landroid/content/Context;)V",
        "",
        "delayMinutes",
        "batteryLevel",
        "Ll83/a0;",
        "b",
        "(II)V",
        "c",
        "()V",
        "a",
        "Lic/a0;",
        "d",
        "(II)Lic/a0;",
        "Lic/p0;",
        "Landroid/content/Context;",
        "app_prodStandardRelease"
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
.field private final a:Lic/p0;

.field private final b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lic/p0;Landroid/content/Context;)V
    .locals 1

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq03/a;->a:Lic/p0;

    iput-object p2, p0, Lq03/a;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lq03/a;->b:Landroid/content/Context;

    const-string v1, "notification"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/NotificationManager;

    const/16 v1, 0x73

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    return-void
.end method

.method public b(II)V
    .locals 2

    iget-object v0, p0, Lq03/a;->a:Lic/p0;

    sget-object v1, Lic/l;->w:Lic/l;

    invoke-virtual {p0, p1, p2}, Lq03/a;->d(II)Lic/a0;

    move-result-object p1

    const-string p2, "DeadBatteryConfirmationWork"

    invoke-virtual {v0, p2, v1, p1}, Lic/p0;->e(Ljava/lang/String;Lic/l;Lic/a0;)Lic/e0;

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lq03/a;->a:Lic/p0;

    const-string v1, "DeadBatteryConfirmationWork"

    invoke-virtual {v0, v1}, Lic/p0;->b(Ljava/lang/String;)Lic/f0;

    return-void
.end method

.method public final d(II)Lic/a0;
    .locals 3

    new-instance v0, Lic/z;

    const-class v1, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker;

    invoke-direct {v0, v1}, Lic/q0;-><init>(Ljava/lang/Class;)V

    int-to-long v1, p1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, p1}, Lic/q0;->g(JLjava/util/concurrent/TimeUnit;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-instance v0, Ll83/k;

    const-string v1, "batteryLevel"

    invoke-direct {v0, v1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0}, [Ll83/k;

    move-result-object p2

    new-instance v0, Lb0/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lb0/b;-><init>(I)V

    const/4 v1, 0x0

    aget-object p2, p2, v1

    iget-object v1, p2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object p2, p2, Ll83/k;->x:Ljava/lang/Object;

    invoke-virtual {v0, p2, v1}, Lb0/b;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lb0/b;->b()Lic/g;

    move-result-object p2

    invoke-virtual {p1, p2}, Lic/q0;->h(Lic/g;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    const-string p2, "DeadBatteryConfirmationWork"

    invoke-virtual {p1, p2}, Lic/q0;->a(Ljava/lang/String;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    invoke-virtual {p1}, Lic/q0;->b()Lic/r0;

    move-result-object p1

    check-cast p1, Lic/a0;

    return-object p1
.end method
