.class public final synthetic Ly42/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmd3/b;


# instance fields
.field public final synthetic a:Lys0/a$b;

.field public final synthetic b:Ly42/d;


# direct methods
.method public synthetic constructor <init>(Lys0/a$b;Ly42/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly42/b;->a:Lys0/a$b;

    iput-object p2, p0, Ly42/b;->b:Ly42/d;

    return-void
.end method


# virtual methods
.method public final a(Landroid/bluetooth/BluetoothDevice;Lnd3/a;)V
    .locals 2

    iget-object v0, p0, Ly42/b;->a:Lys0/a$b;

    iget-object v1, p0, Ly42/b;->b:Ly42/d;

    invoke-static {v0, v1, p1, p2}, Ly42/d;->e0(Lys0/a$b;Ly42/d;Landroid/bluetooth/BluetoothDevice;Lnd3/a;)V

    return-void
.end method
