.class public final synthetic Ly42/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmd3/e;
.implements Lmd3/c;


# instance fields
.field public final synthetic w:Ly42/d;


# direct methods
.method public synthetic constructor <init>(Ly42/d;)V
    .locals 0

    iput-object p1, p0, Ly42/c;->w:Ly42/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    iget-object v0, p0, Ly42/c;->w:Ly42/d;

    invoke-static {v0, p1, p2}, Ly42/d$a;->m2(Ly42/d;Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public d(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    iget-object v0, p0, Ly42/c;->w:Ly42/d;

    invoke-static {v0, p1}, Ly42/d$a;->n2(Ly42/d;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method
