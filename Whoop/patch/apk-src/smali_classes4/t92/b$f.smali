.class public final Lt92/b$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lys0/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt92/b;-><init>(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Class;Lq92/h;Landroid/os/HandlerThread;Lin2/d;Lbc3/c0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "t92/b$f",
        "Lys0/a$b;",
        "",
        "data",
        "Ll83/a0;",
        "a",
        "([B)V",
        "",
        "Ljava/lang/String;",
        "getName",
        "()Ljava/lang/String;",
        "name",
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
.field private final a:Ljava/lang/String;

.field final synthetic b:Lt92/b;


# direct methods
.method public constructor <init>(Lt92/b;)V
    .locals 0

    iput-object p1, p0, Lt92/b$f;->b:Lt92/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "dataFromStrapCharacteristicNotifCallback"

    iput-object p1, p0, Lt92/b$f;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a([B)V
    .locals 3

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt92/b$f;->b:Lt92/b;

    invoke-static {v0, p1}, Lt92/b;->t1(Lt92/b;[B)Llt0/m;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Llt0/k;->b()Llt0/c;

    move-result-object v0

    instance-of v1, v0, Ldk0/i;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lt92/b$f;->b:Lt92/b;

    invoke-interface {v0, p1}, Lnk0/a$b;->l(Llt0/m;)V

    return-void

    :cond_0
    instance-of v1, v0, Ldk0/k;

    if-eqz v1, :cond_1

    iget-object v0, p0, Lt92/b$f;->b:Lt92/b;

    invoke-virtual {p1}, Llt0/k;->b()Llt0/c;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type com.whoop.ble.packets.datapacket.RealTimeDataPacket"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ldk0/k;

    invoke-interface {v0, p1}, Lnk0/a$b;->T0(Ldk0/k;)V

    return-void

    :cond_1
    instance-of v1, v0, Ldk0/h;

    if-eqz v1, :cond_2

    iget-object v0, p0, Lt92/b$f;->b:Lt92/b;

    invoke-virtual {p1}, Llt0/k;->b()Llt0/c;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type com.whoop.ble.packets.datapacket.ImuStreamDataPacket"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ldk0/h;

    invoke-interface {v0, p1}, Lnk0/a$b;->s(Ldk0/h;)V

    return-void

    :cond_2
    instance-of v1, v0, Ldk0/j;

    if-eqz v1, :cond_3

    iget-object v0, p0, Lt92/b$f;->b:Lt92/b;

    invoke-virtual {p1}, Llt0/k;->b()Llt0/c;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type com.whoop.ble.packets.datapacket.R17LabradorFilteredDataPacket"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ldk0/j;

    invoke-interface {v0, p1}, Lnk0/a$b;->R0(Ldk0/j;)V

    return-void

    :cond_3
    instance-of v0, v0, Llt0/b;

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Llt0/k;->b()Llt0/c;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.whoop.connectivityCore.packets.BleDataPacket"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Llt0/b;

    invoke-virtual {v0}, Llt0/b;->U()S

    move-result v1

    const/16 v2, 0x15

    if-ne v1, v2, :cond_5

    invoke-virtual {v0}, Llt0/b;->Z()I

    move-result v1

    const/16 v2, 0x2b

    if-ne v1, v2, :cond_5

    sget-object v1, Lnt0/h;->u:Lnt0/h$a;

    iget-object v2, p0, Lt92/b$f;->b:Lt92/b;

    invoke-virtual {v2}, Lt92/b;->W1()Lst0/v;

    move-result-object v2

    invoke-virtual {v1, v2, p1, v0}, Lnt0/h$a;->a(Lst0/v;Llt0/m;Llt0/b;)Lnt0/h;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.whoop.connectivityCore.packets.datapacket.rawdata.R21MaverickDatapacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lnt0/e;

    iget-object v0, p0, Lt92/b$f;->b:Lt92/b;

    invoke-static {p1}, Lvj0/b;->a(Lnt0/e;)Lvj0/a;

    move-result-object p1

    invoke-interface {v0, p1}, Lnk0/a$b;->a0(Lrt0/b$b;)V

    return-void

    :cond_4
    iget-object v0, p0, Lt92/b$f;->b:Lt92/b;

    invoke-interface {v0, p1}, Lnk0/a$b;->Z(Llt0/m;)V

    :cond_5
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lt92/b$f;->a:Ljava/lang/String;

    return-object v0
.end method
