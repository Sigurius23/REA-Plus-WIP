.class public final synthetic Ls92/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmd3/b;


# instance fields
.field public final synthetic a:Lys0/a$b;

.field public final synthetic b:Ls92/e;


# direct methods
.method public synthetic constructor <init>(Lys0/a$b;Ls92/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls92/c;->a:Lys0/a$b;

    iput-object p2, p0, Ls92/c;->b:Ls92/e;

    return-void
.end method


# virtual methods
.method public final a(Landroid/bluetooth/BluetoothDevice;Lnd3/a;)V
    .locals 2

    iget-object v0, p0, Ls92/c;->a:Lys0/a$b;

    iget-object v1, p0, Ls92/c;->b:Ls92/e;

    invoke-static {v0, v1, p1, p2}, Ls92/e;->f0(Lys0/a$b;Ls92/e;Landroid/bluetooth/BluetoothDevice;Lnd3/a;)V

    return-void
.end method
