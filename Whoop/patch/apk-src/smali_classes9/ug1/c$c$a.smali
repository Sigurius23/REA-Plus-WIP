.class public final Lug1/c$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/dfu/DfuProgressListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug1/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0015*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J?\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0008J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0008J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0008J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0008J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0008J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0008J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0008J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u0008J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u0008J1\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "ug1/c$c$a",
        "Lno/nordicsemi/android/dfu/DfuProgressListener;",
        "Ll83/a0;",
        "a",
        "()V",
        "",
        "deviceAddress",
        "onDeviceConnecting",
        "(Ljava/lang/String;)V",
        "",
        "percent",
        "",
        "speed",
        "avgSpeed",
        "currentPart",
        "totalParts",
        "onProgressChanged",
        "(Ljava/lang/String;IFFII)V",
        "onDeviceDisconnecting",
        "onDeviceDisconnected",
        "onDeviceConnected",
        "onDfuProcessStarting",
        "onDfuAborted",
        "onEnablingDfuMode",
        "onDfuCompleted",
        "onFirmwareValidating",
        "onDfuProcessStarted",
        "error",
        "errorType",
        "message",
        "onError",
        "(Ljava/lang/String;IILjava/lang/String;)V",
        "firmware-update-service_release"
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
.field final synthetic a:Ldc3/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc3/u;"
        }
    .end annotation
.end field

.field final synthetic b:Lug1/c;


# direct methods
.method public constructor <init>(Ldc3/u;Lug1/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc3/u;",
            "Lug1/c;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lug1/c$c$a;->a:Ldc3/u;

    iput-object p2, p0, Lug1/c$c$a;->b:Lug1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 3

    iget-object v0, p0, Lug1/c$c$a;->b:Lug1/c;

    invoke-static {v0}, Lug1/c;->i(Lug1/c;)Lpg1/a;

    move-result-object v0

    iget-object v1, p0, Lug1/c$c$a;->b:Lug1/c;

    invoke-static {v1}, Lug1/c;->g(Lug1/c;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lpg1/a;->f(Landroid/content/Context;Lno/nordicsemi/android/dfu/DfuProgressListener;)V

    iget-object v0, p0, Lug1/c$c$a;->b:Lug1/c;

    invoke-static {v0}, Lug1/c;->i(Lug1/c;)Lpg1/a;

    move-result-object v0

    iget-object v1, p0, Lug1/c$c$a;->b:Lug1/c;

    invoke-static {v1}, Lug1/c;->g(Lug1/c;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lug1/c$c$a;->b:Lug1/c;

    invoke-static {v2}, Lug1/c;->j(Lug1/c;)Lpg1/c;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lpg1/a;->e(Landroid/content/Context;Lpg1/c;)V

    return-void
.end method


# virtual methods
.method public onDeviceConnected(Ljava/lang/String;)V
    .locals 1

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onDeviceConnecting(Ljava/lang/String;)V
    .locals 1

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onDeviceDisconnected(Ljava/lang/String;)V
    .locals 1

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onDeviceDisconnecting(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onDfuAborted(Ljava/lang/String;)V
    .locals 1

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lug1/c$c$a;->a()V

    return-void
.end method

.method public onDfuCompleted(Ljava/lang/String;)V
    .locals 1

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lug1/c$c$a;->a()V

    iget-object p1, p0, Lug1/c$c$a;->a:Ldc3/u;

    sget-object v0, Lgt0/h$e;->b:Lgt0/h$e;

    check-cast p1, Ldc3/t;

    invoke-virtual {p1, v0}, Ldc3/t;->s(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onDfuProcessStarted(Ljava/lang/String;)V
    .locals 1

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onDfuProcessStarting(Ljava/lang/String;)V
    .locals 1

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onEnablingDfuMode(Ljava/lang/String;)V
    .locals 1

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onError(Ljava/lang/String;IILjava/lang/String;)V
    .locals 3

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/Exception;

    invoke-static {p3}, Lpg1/b;->a(I)Ljava/lang/String;

    move-result-object p3

    const-string v0, ", error is "

    const-string v1, ", errorType "

    const-string v2, "DFU service error: "

    invoke-static {p2, v2, p4, v0, v1}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iget-object p2, p0, Lug1/c$c$a;->b:Lug1/c;

    invoke-virtual {p2}, Lug1/c;->h()Ltr2/n;

    move-result-object p2

    const/4 p3, 0x0

    new-array p4, p3, [Lqr2/a$a;

    const-string v0, "Error while performing DFU"

    invoke-interface {p2, v0, p1, p4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    invoke-direct {p0}, Lug1/c$c$a;->a()V

    iget-object p1, p0, Lug1/c$c$a;->a:Ldc3/u;

    new-instance p2, Lgt0/h$b;

    sget-object p4, Lgt0/f$a;->b:Lgt0/f$a;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p2, p4, p3, v0, v1}, Lgt0/h$b;-><init>(Lgt0/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Ldc3/t;

    invoke-virtual {p1, p2}, Ldc3/t;->s(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onFirmwareValidating(Ljava/lang/String;)V
    .locals 1

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onProgressChanged(Ljava/lang/String;IFFII)V
    .locals 0

    const-string p3, "deviceAddress"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lug1/c$c$a;->a:Ldc3/u;

    new-instance p3, Lgt0/h$g;

    invoke-static {p2}, Lbt0/c;->a(I)I

    move-result p2

    const/4 p4, 0x2

    const/4 p5, 0x0

    const/4 p6, 0x0

    invoke-direct {p3, p2, p6, p4, p5}, Lgt0/h$g;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Ldc3/t;

    invoke-virtual {p1, p3}, Ldc3/t;->s(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
