.class public final Lp33/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/AddIceObserver;
.implements Lorg/webrtc/SdpObserver;
.implements Lmd3/d;
.implements Lmd3/c;
.implements Lmd3/e;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lq83/l;


# direct methods
.method public constructor <init>(Lno/nordicsemi/android/ble/k0;Lq83/l;)V
    .locals 0

    const/4 p1, 0x4

    iput p1, p0, Lp33/b;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lp33/b;->x:Lq83/l;

    return-void
.end method

.method public synthetic constructor <init>(Lq83/l;I)V
    .locals 0

    .line 2
    iput p2, p0, Lp33/b;->w:I

    iput-object p1, p0, Lp33/b;->x:Lq83/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lq83/l;Lno/nordicsemi/android/ble/k0;)V
    .locals 0

    const/4 p2, 0x3

    iput p2, p0, Lp33/b;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp33/b;->x:Lq83/l;

    return-void
.end method

.method private final a(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method private final e(Lorg/webrtc/SessionDescription;)V
    .locals 0

    return-void
.end method

.method private final f(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method private final g()V
    .locals 0

    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    new-instance v0, Lno/nordicsemi/android/ble/exception/InvalidRequestException;

    invoke-direct {v0}, Lno/nordicsemi/android/ble/exception/InvalidRequestException;-><init>()V

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    iget-object v1, p0, Lp33/b;->x:Lq83/l;

    invoke-virtual {v1, v0}, Lq83/l;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public c(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p1, -0x64

    if-eq p2, p1, :cond_1

    const/4 p1, -0x1

    if-eq p2, p1, :cond_0

    new-instance p1, Lno/nordicsemi/android/ble/exception/RequestFailedException;

    invoke-direct {p1, p2}, Lno/nordicsemi/android/ble/exception/RequestFailedException;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance p1, Lno/nordicsemi/android/ble/exception/DeviceDisconnectedException;

    invoke-direct {p1}, Lno/nordicsemi/android/ble/exception/DeviceDisconnectedException;-><init>()V

    goto :goto_0

    :cond_1
    new-instance p1, Lno/nordicsemi/android/ble/exception/BluetoothDisabledException;

    invoke-direct {p1}, Lno/nordicsemi/android/ble/exception/BluetoothDisabledException;-><init>()V

    :goto_0
    iget-object p2, p0, Lp33/b;->x:Lq83/l;

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-virtual {p2, p1}, Lq83/l;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public d(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lp33/b;->x:Lq83/l;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lq83/l;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public onAddFailure(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ln23/f;

    new-instance v1, Ln23/a;

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-direct {v1, p1}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ln23/f;-><init>(Ln23/e;)V

    iget-object p1, p0, Lp33/b;->x:Lq83/l;

    invoke-virtual {p1, v0}, Lq83/l;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public onAddSuccess()V
    .locals 2

    new-instance v0, Ln23/g;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-direct {v0, v1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lp33/b;->x:Lq83/l;

    invoke-virtual {v1, v0}, Lq83/l;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public onCreateFailure(Ljava/lang/String;)V
    .locals 2

    iget v0, p0, Lp33/b;->w:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    new-instance v0, Ln23/f;

    new-instance v1, Ln23/a;

    if-nez p1, :cond_0

    const-string p1, "Couldn\'t create a SDP message."

    :cond_0
    invoke-direct {v1, p1}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ln23/f;-><init>(Ln23/e;)V

    iget-object p1, p0, Lp33/b;->x:Lq83/l;

    invoke-virtual {p1, v0}, Lq83/l;->resumeWith(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onCreateSuccess(Lorg/webrtc/SessionDescription;)V
    .locals 1

    iget v0, p0, Lp33/b;->w:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    if-eqz p1, :cond_0

    new-instance v0, Ln23/g;

    invoke-direct {v0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    iget-object p1, p0, Lp33/b;->x:Lq83/l;

    invoke-virtual {p1, v0}, Lq83/l;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onSetFailure(Ljava/lang/String;)V
    .locals 2

    iget v0, p0, Lp33/b;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ln23/f;

    new-instance v1, Ln23/a;

    if-nez p1, :cond_0

    const-string p1, "Couldn\'t create a SDP message."

    :cond_0
    invoke-direct {v1, p1}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ln23/f;-><init>(Ln23/e;)V

    iget-object p1, p0, Lp33/b;->x:Lq83/l;

    invoke-virtual {p1, v0}, Lq83/l;->resumeWith(Ljava/lang/Object;)V

    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onSetSuccess()V
    .locals 2

    iget v0, p0, Lp33/b;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ln23/g;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-direct {v0, v1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lp33/b;->x:Lq83/l;

    invoke-virtual {v1, v0}, Lq83/l;->resumeWith(Ljava/lang/Object;)V

    :pswitch_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
