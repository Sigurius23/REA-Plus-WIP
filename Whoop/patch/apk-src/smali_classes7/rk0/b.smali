.class public final synthetic Lrk0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmd3/b;


# instance fields
.field public final synthetic a:Ldc3/l;

.field public final synthetic b:Lrk0/c;

.field public final synthetic c:Ljava/util/UUID;


# direct methods
.method public synthetic constructor <init>(Ldc3/l;Lrk0/c;Ljava/util/UUID;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrk0/b;->a:Ldc3/l;

    iput-object p2, p0, Lrk0/b;->b:Lrk0/c;

    iput-object p3, p0, Lrk0/b;->c:Ljava/util/UUID;

    return-void
.end method


# virtual methods
.method public final a(Landroid/bluetooth/BluetoothDevice;Lnd3/a;)V
    .locals 3

    iget-object v0, p0, Lrk0/b;->b:Lrk0/c;

    iget-object v1, p0, Lrk0/b;->c:Ljava/util/UUID;

    iget-object v2, p0, Lrk0/b;->a:Ldc3/l;

    invoke-static {v2, v0, v1, p1, p2}, Lrk0/c;->e0(Ldc3/l;Lrk0/c;Ljava/util/UUID;Landroid/bluetooth/BluetoothDevice;Lnd3/a;)V

    return-void
.end method
