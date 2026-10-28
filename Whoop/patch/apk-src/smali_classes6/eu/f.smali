.class public final Leu/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm5/g;
.implements Lcq/d;
.implements Lmd3/d;
.implements Lmd3/c;
.implements Lmd3/e;
.implements Lud3/k;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbc3/m;


# direct methods
.method public synthetic constructor <init>(Lbc3/m;I)V
    .locals 0

    .line 1
    iput p2, p0, Leu/f;->w:I

    iput-object p1, p0, Leu/f;->x:Lbc3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lbc3/m;Lno/nordicsemi/android/ble/m0;)V
    .locals 0

    const/4 p2, 0x4

    iput p2, p0, Leu/f;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leu/f;->x:Lbc3/m;

    return-void
.end method

.method public constructor <init>(Lno/nordicsemi/android/ble/m0;Lbc3/m;)V
    .locals 0

    const/4 p1, 0x5

    iput p1, p0, Leu/f;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Leu/f;->x:Lbc3/m;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Leu/f;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/credentials/exceptions/GetCredentialException;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Leu/f;->x:Lbc3/m;

    invoke-virtual {v0}, Lbc3/m;->isActive()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void

    :pswitch_0
    check-cast p1, Landroidx/credentials/exceptions/CreateCredentialException;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Leu/f;->x:Lbc3/m;

    invoke-virtual {v0}, Lbc3/m;->isActive()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public b()V
    .locals 2

    new-instance v0, Lno/nordicsemi/android/ble/exception/InvalidRequestException;

    invoke-direct {v0}, Lno/nordicsemi/android/ble/exception/InvalidRequestException;-><init>()V

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    iget-object v1, p0, Leu/f;->x:Lbc3/m;

    invoke-virtual {v1, v0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public c(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p1, -0x64

    if-eq p2, p1, :cond_2

    const/4 p1, -0x7

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
    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string p2, "Request cancelled."

    invoke-direct {p1, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    new-instance p1, Lno/nordicsemi/android/ble/exception/BluetoothDisabledException;

    invoke-direct {p1}, Lno/nordicsemi/android/ble/exception/BluetoothDisabledException;-><init>()V

    :goto_0
    iget-object p2, p0, Leu/f;->x:Lbc3/m;

    invoke-virtual {p2}, Lbc3/m;->isActive()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-virtual {p2, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public d(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Leu/f;->x:Lbc3/m;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public onFailure(Lud3/j;Ljava/io/IOException;)V
    .locals 0

    iget p1, p0, Leu/f;->w:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Leu/f;->x:Lbc3/m;

    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    invoke-virtual {p1, p2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Leu/f;->x:Lbc3/m;

    invoke-virtual {p1, p2}, Lbc3/m;->F(Ljava/lang/Throwable;)Lhc3/x;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Lbc3/m;->n(Ljava/lang/Object;)V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public onResponse(Lud3/j;Lud3/x0;)V
    .locals 2

    iget v0, p0, Leu/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p0, Leu/f;->x:Lbc3/m;

    sget-object v0, Lvd3/a;->w:Lvd3/a;

    invoke-virtual {p1, p2, v0}, Lbc3/m;->g(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V

    return-void

    :pswitch_0
    new-instance v0, Lj43/a;

    const/16 v1, 0xc

    invoke-direct {v0, p1, v1}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    iget-object p1, p0, Leu/f;->x:Lbc3/m;

    invoke-virtual {p1, p2, v0}, Lbc3/m;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public onResult(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Leu/f;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lm5/o;

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Leu/f;->x:Lbc3/m;

    invoke-virtual {v0}, Lbc3/m;->isActive()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void

    :pswitch_0
    check-cast p1, Lm5/c;

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Leu/f;->x:Lbc3/m;

    invoke-virtual {v0}, Lbc3/m;->isActive()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public q(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget v0, p0, Leu/f;->w:I

    sparse-switch v0, :sswitch_data_0

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Leu/f;->x:Lbc3/m;

    invoke-virtual {v0, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void

    :sswitch_0
    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Leu/f;->x:Lbc3/m;

    invoke-virtual {v0, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void

    :sswitch_1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v0

    iget-object v1, p0, Leu/f;->x:Lbc3/m;

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Lbc3/m;->cancel(Ljava/lang/Throwable;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-virtual {v1, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_1
        0x7 -> :sswitch_0
    .end sparse-switch
.end method
