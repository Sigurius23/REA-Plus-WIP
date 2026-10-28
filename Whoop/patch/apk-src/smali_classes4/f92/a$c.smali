.class public final Lf92/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf92/a;-><init>(Ltr2/n;Landroid/content/Context;Lq92/h;ZLbc3/c0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lec3/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "f92/a$c",
        "Landroid/content/ServiceConnection;",
        "Landroid/content/ComponentName;",
        "componentName",
        "Landroid/os/IBinder;",
        "binder",
        "Ll83/a0;",
        "onServiceConnected",
        "(Landroid/content/ComponentName;Landroid/os/IBinder;)V",
        "onServiceDisconnected",
        "(Landroid/content/ComponentName;)V",
        "core_release"
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
.field final synthetic w:Lf92/a;


# direct methods
.method public constructor <init>(Lf92/a;)V
    .locals 0

    iput-object p1, p0, Lf92/a$c;->w:Lf92/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    const-string v0, "componentName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "binder"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p2, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    move-object p1, p2

    check-cast p1, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_1

    iget-object p1, p0, Lf92/a$c;->w:Lf92/a;

    invoke-static {p1}, Lf92/a;->g(Lf92/a;)Ltr2/n;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to cast binder: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " to BleWhoopStrapServiceBinder"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_1
    iget-object p2, p0, Lf92/a$c;->w:Lf92/a;

    invoke-static {p2}, Lf92/a;->h(Lf92/a;)Lec3/p1;

    move-result-object p2

    check-cast p2, Lec3/h2;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2, v0, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object p2, p0, Lf92/a$c;->w:Lf92/a;

    invoke-virtual {p1, p2}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->c(Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;)Ln73/b;

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    const-string v0, "componentName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lf92/a$c;->w:Lf92/a;

    invoke-static {p1}, Lf92/a;->g(Lf92/a;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "DefaultUpdateStrategy service disconnected"

    invoke-interface {p1, v1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lf92/a$c;->w:Lf92/a;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lf92/a;->k(Lf92/a;Ljk0/d;)V

    iget-object p1, p0, Lf92/a$c;->w:Lf92/a;

    invoke-static {p1}, Lf92/a;->h(Lf92/a;)Lec3/p1;

    move-result-object p1

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object p1, p0, Lf92/a$c;->w:Lf92/a;

    invoke-static {p1}, Lf92/a;->i(Lf92/a;)Lec3/p1;

    move-result-object p1

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object p1, p0, Lf92/a$c;->w:Lf92/a;

    invoke-static {p1, v0}, Lf92/a;->l(Lf92/a;Ljk0/d;)V

    iget-object p1, p0, Lf92/a$c;->w:Lf92/a;

    invoke-static {p1}, Lf92/a;->d(Lf92/a;)Lci2/c;

    iget-object p1, p0, Lf92/a$c;->w:Lf92/a;

    invoke-static {p1}, Lf92/a;->e(Lf92/a;)Lbc3/k1;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1, v0}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method
