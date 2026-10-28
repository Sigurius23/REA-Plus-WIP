.class final Ly42/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmd3/a;


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


# direct methods
.method public constructor <init>(Ly42/d;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    iput-object p1, p0, Ly42/d$c;->w:Ly42/d;

    iput-object p2, p0, Ly42/d$c;->x:Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ly42/d$c;->w:Ly42/d;

    invoke-static {p1}, Ly42/d;->g0(Ly42/d;)Ltr2/n;

    move-result-object p1

    iget-object v0, p0, Ly42/d$c;->w:Ly42/d;

    iget-object v1, p0, Ly42/d$c;->x:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, v1}, Ly42/d;->i0(Ly42/d;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Attempting connection to "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method
