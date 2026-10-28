.class public final Lt92/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lys0/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt92/b;-><init>(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Class;Lq92/h;Landroid/os/HandlerThread;Lin2/d;Lbc3/c0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "t92/b$d",
        "Lys0/a$b;",
        "",
        "data",
        "Ll83/a0;",
        "a",
        "([B)V",
        "",
        "Ljava/lang/String;",
        "getName",
        "()Ljava/lang/String;",
        "name",
        "core_release"
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
.field private final a:Ljava/lang/String;

.field final synthetic b:Lt92/b;


# direct methods
.method public constructor <init>(Lt92/b;)V
    .locals 0

    iput-object p1, p0, Lt92/b$d;->b:Lt92/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "cmdFromStrapCharacteristicNotifCallback"

    iput-object p1, p0, Lt92/b$d;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a([B)V
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt92/b$d;->b:Lt92/b;

    invoke-static {v0, p1}, Lt92/b;->s1(Lt92/b;[B)Llt0/c;

    move-result-object p1

    instance-of v0, p1, Lzj0/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt92/b$d;->b:Lt92/b;

    check-cast p1, Lzj0/h;

    invoke-virtual {v0, p1}, Lt92/b;->a2(Lzj0/h;)V

    :cond_0
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lt92/b$d;->a:Ljava/lang/String;

    return-object v0
.end method
