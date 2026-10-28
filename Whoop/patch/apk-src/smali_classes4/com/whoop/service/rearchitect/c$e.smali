.class public final Lcom/whoop/service/rearchitect/c$e;
.super Llk0/a;
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
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "com/whoop/service/rearchitect/c$e",
        "Llk0/a;",
        "Lak0/c;",
        "getAdvertisingNameHarvardResponsePacket",
        "Ll83/a0;",
        "h",
        "(Lak0/c;)V",
        "Lzj0/l;",
        "getAdvertisingNameResponsePacket",
        "g",
        "(Lzj0/l;)V",
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
.field final synthetic E:Lcom/whoop/service/rearchitect/c;


# direct methods
.method public constructor <init>(Lcom/whoop/service/rearchitect/c;)V
    .locals 1

    iput-object p1, p0, Lcom/whoop/service/rearchitect/c$e;->E:Lcom/whoop/service/rearchitect/c;

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p1}, Llk0/a;-><init>(Landroid/os/Handler;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public g(Lzj0/l;)V
    .locals 1

    const-string v0, "getAdvertisingNameResponsePacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$e;->E:Lcom/whoop/service/rearchitect/c;

    invoke-virtual {p1}, Lzj0/l;->X()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/whoop/service/rearchitect/c;->V2(Lcom/whoop/service/rearchitect/c;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$e;->E:Lcom/whoop/service/rearchitect/c;

    invoke-virtual {p1}, Lcom/whoop/service/rearchitect/c;->M0()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$e;->E:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->M2(Lcom/whoop/service/rearchitect/c;)Lq92/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lq92/h;->j(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public h(Lak0/c;)V
    .locals 1

    const-string v0, "getAdvertisingNameHarvardResponsePacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$e;->E:Lcom/whoop/service/rearchitect/c;

    invoke-virtual {p1}, Lak0/c;->X()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/whoop/service/rearchitect/c;->V2(Lcom/whoop/service/rearchitect/c;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$e;->E:Lcom/whoop/service/rearchitect/c;

    invoke-virtual {p1}, Lcom/whoop/service/rearchitect/c;->M0()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$e;->E:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->M2(Lcom/whoop/service/rearchitect/c;)Lq92/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lq92/h;->j(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
