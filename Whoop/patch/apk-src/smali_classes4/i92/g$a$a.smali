.class public final Li92/g$a$a;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li92/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0006J\u001f\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "i92/g$a$a",
        "Landroid/net/ConnectivityManager$NetworkCallback;",
        "Landroid/net/Network;",
        "network",
        "Ll83/a0;",
        "onAvailable",
        "(Landroid/net/Network;)V",
        "onUnavailable",
        "()V",
        "onLost",
        "Landroid/net/NetworkCapabilities;",
        "networkCapabilities",
        "onCapabilitiesChanged",
        "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V",
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
.field final synthetic a:Ldc3/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc3/u;"
        }
    .end annotation
.end field

.field final synthetic b:Li92/g;


# direct methods
.method public constructor <init>(Ldc3/u;Li92/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc3/u;",
            "Li92/g;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Li92/g$a$a;->a:Ldc3/u;

    iput-object p2, p0, Li92/g$a$a;->b:Li92/g;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 1

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 1

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "networkCapabilities"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Li92/g$a$a;->b:Li92/g;

    invoke-static {p1, p2}, Li92/g;->d(Li92/g;Landroid/net/NetworkCapabilities;)Li92/h;

    move-result-object p1

    iget-object p2, p0, Li92/g$a$a;->a:Ldc3/u;

    check-cast p2, Ldc3/t;

    invoke-virtual {p2, p1}, Ldc3/t;->s(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 1

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Li92/g$a$a;->a:Ldc3/u;

    sget-object v0, Li92/h$b;->a:Li92/h$b;

    check-cast p1, Ldc3/t;

    invoke-virtual {p1, v0}, Ldc3/t;->s(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onUnavailable()V
    .locals 2

    iget-object v0, p0, Li92/g$a$a;->a:Ldc3/u;

    sget-object v1, Li92/h$b;->a:Li92/h$b;

    check-cast v0, Ldc3/t;

    invoke-virtual {v0, v1}, Ldc3/t;->s(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
