.class public final Ltd1/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltd1/d;-><init>(Lq92/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "td1/d$d",
        "Landroid/content/ServiceConnection;",
        "Landroid/content/ComponentName;",
        "className",
        "Landroid/os/IBinder;",
        "service",
        "Ll83/a0;",
        "onServiceConnected",
        "(Landroid/content/ComponentName;Landroid/os/IBinder;)V",
        "name",
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
.field final synthetic w:Ltd1/d;


# direct methods
.method public constructor <init>(Ltd1/d;)V
    .locals 0

    iput-object p1, p0, Ltd1/d$d;->w:Ltd1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 4

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "service"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ltd1/d$d;->w:Ltd1/d;

    invoke-static {p1}, Ltd1/d;->O(Ltd1/d;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v1, v0, [Lqr2/a$a;

    const-string v2, "onServiceConnected"

    invoke-interface {p1, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :try_start_0
    iget-object p1, p0, Ltd1/d$d;->w:Ltd1/d;

    move-object v1, p2

    check-cast v1, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;

    invoke-static {p1, v1}, Ltd1/d;->P(Ltd1/d;Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;)V

    iget-object p1, p0, Ltd1/d$d;->w:Ltd1/d;

    invoke-static {p1}, Ltd1/d;->N(Ltd1/d;)Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v1, p0, Ltd1/d$d;->w:Ltd1/d;

    invoke-virtual {p1, v1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->c(Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;)Ln73/b;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    iget-object v1, p0, Ltd1/d$d;->w:Ltd1/d;

    invoke-static {v1}, Ltd1/d;->O(Ltd1/d;)Ltr2/n;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to cast service binder: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " to BleWhoopStrapServiceBinder"

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {v1, p2, p1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ltd1/d$d;->w:Ltd1/d;

    invoke-static {p1}, Ltd1/d;->O(Ltd1/d;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "onServiceDisconnected"

    invoke-interface {p1, v1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Ltd1/d$d;->w:Ltd1/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ltd1/d;->Z(Ljk0/d;)V

    return-void
.end method
