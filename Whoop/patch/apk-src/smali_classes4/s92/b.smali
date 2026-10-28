.class public final synthetic Ls92/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmd3/a;
.implements Lmd3/c;


# instance fields
.field public final synthetic w:Ls92/e;

.field public final synthetic x:J


# direct methods
.method public synthetic constructor <init>(Ls92/e;J)V
    .locals 0

    iput-object p1, p0, Ls92/b;->w:Ls92/e;

    iput-wide p2, p0, Ls92/b;->x:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3

    iget-object v0, p0, Ls92/b;->w:Ls92/e;

    iget-wide v1, p0, Ls92/b;->x:J

    invoke-static {v0, v1, v2, p1}, Ls92/e;->g0(Ls92/e;JLandroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public c(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 3

    iget-object v0, p0, Ls92/b;->w:Ls92/e;

    iget-wide v1, p0, Ls92/b;->x:J

    invoke-static {v0, v1, v2, p1, p2}, Ls92/e;->e0(Ls92/e;JLandroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method
