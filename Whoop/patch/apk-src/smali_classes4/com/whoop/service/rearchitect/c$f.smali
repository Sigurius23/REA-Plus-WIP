.class public final Lcom/whoop/service/rearchitect/c$f;
.super Lq92/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/service/rearchitect/c;-><init>(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Class;Lin2/d;Lz82/b;Lq92/h;Landroid/os/HandlerThread;Lmc3/a;Lbc3/c0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0004\u00a8\u0006\u0007"
    }
    d2 = {
        "com/whoop/service/rearchitect/c$f",
        "Lq92/g;",
        "Ll83/a0;",
        "l",
        "()V",
        "n",
        "p",
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
.field final synthetic E:Lbc3/c0;

.field final synthetic z:Lcom/whoop/service/rearchitect/c;


# direct methods
.method public constructor <init>(Lcom/whoop/service/rearchitect/c;Lbc3/c0;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/service/rearchitect/c$f;->z:Lcom/whoop/service/rearchitect/c;

    iput-object p2, p0, Lcom/whoop/service/rearchitect/c$f;->E:Lbc3/c0;

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2, p1}, Lq92/g;-><init>(Landroid/os/Handler;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public l()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$f;->z:Lcom/whoop/service/rearchitect/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/whoop/service/rearchitect/c;->Z2(Lcom/whoop/service/rearchitect/c;Lcom/whoop/domain/model/WhoopStrapInfo;)V

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$f;->E:Lbc3/c0;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->l(Lq83/j;)V

    return-void
.end method

.method public n()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$f;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "on exchanging hello"

    invoke-virtual {v0, v2, v1}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public p()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$f;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "on setting rtc"

    invoke-virtual {v0, v2, v1}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
