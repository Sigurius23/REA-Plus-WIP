.class final Ly42/d$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmd3/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly42/d;->o0(Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Ly42/d;

.field final synthetic x:Landroid/bluetooth/BluetoothDevice;

.field final synthetic y:Lbc3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/k;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ly42/d;Landroid/bluetooth/BluetoothDevice;Lbc3/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly42/d;",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lbc3/k;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Ly42/d$e;->w:Ly42/d;

    iput-object p2, p0, Ly42/d$e;->x:Landroid/bluetooth/BluetoothDevice;

    iput-object p3, p0, Ly42/d$e;->y:Lbc3/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 3

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ly42/d$e;->w:Ly42/d;

    invoke-static {p1}, Ly42/d;->g0(Ly42/d;)Ltr2/n;

    move-result-object p1

    iget-object v0, p0, Ly42/d$e;->w:Ly42/d;

    iget-object v1, p0, Ly42/d$e;->x:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, v1}, Ly42/d;->i0(Ly42/d;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Connection failed to "

    const-string v2, " with status "

    invoke-static {p2, v1, v0, v2}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Ly42/d$e;->y:Lbc3/k;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, p2}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
