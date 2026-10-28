.class public final synthetic Ls92/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmd3/e;
.implements Lmd3/c;


# instance fields
.field public final synthetic w:Ls92/e;


# direct methods
.method public synthetic constructor <init>(Ls92/e;)V
    .locals 0

    iput-object p1, p0, Ls92/d;->w:Ls92/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    iget-object v0, p0, Ls92/d;->w:Ls92/e;

    invoke-static {v0, p1, p2}, Ls92/e$a;->m2(Ls92/e;Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public d(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    iget-object v0, p0, Ls92/d;->w:Ls92/e;

    invoke-static {v0, p1}, Ls92/e$a;->n2(Ls92/e;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method
