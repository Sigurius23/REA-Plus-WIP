.class public final Li92/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li92/e;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\n0\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00128\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0013R \u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00128\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0013\u001a\u0004\u0008\u0010\u0010\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00088CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Li92/g;",
        "Li92/e;",
        "Landroid/net/ConnectivityManager;",
        "connectivityManager",
        "Lbc3/c0;",
        "applicationScope",
        "<init>",
        "(Landroid/net/ConnectivityManager;Lbc3/c0;)V",
        "Landroid/net/NetworkCapabilities;",
        "networkCapabilities",
        "Li92/h;",
        "g",
        "(Landroid/net/NetworkCapabilities;)Li92/h;",
        "Ll73/c;",
        "b",
        "()Ll73/c;",
        "a",
        "Landroid/net/ConnectivityManager;",
        "Lec3/l;",
        "Lec3/l;",
        "networkStateSource",
        "c",
        "()Lec3/l;",
        "networkFlow",
        "h",
        "()Landroid/net/NetworkCapabilities;",
        "activeNetworkCapabilities",
        "",
        "isConnected",
        "()Z",
        "",
        "()Ljava/lang/String;",
        "currentNetworkDebugString",
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
.field private final a:Landroid/net/ConnectivityManager;

.field private final b:Lec3/l;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final c:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/net/ConnectivityManager;Lbc3/c0;)V
    .locals 3

    const-string v0, "connectivityManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li92/g;->a:Landroid/net/ConnectivityManager;

    new-instance p1, Li92/g$a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Li92/g$a;-><init>(Li92/g;Lq83/d;)V

    invoke-static {p1}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p1

    iput-object p1, p0, Li92/g;->b:Lec3/l;

    const-wide/16 v0, 0x1388

    const/4 v2, 0x2

    invoke-static {v2, v0, v1}, Lec3/z1;->a(IJ)Lec3/e2;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {p1, p2, v0, v1}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Li92/g;->c:Lec3/l;

    return-void
.end method

.method public static final synthetic d(Li92/g;Landroid/net/NetworkCapabilities;)Li92/h;
    .locals 0

    invoke-direct {p0, p1}, Li92/g;->g(Landroid/net/NetworkCapabilities;)Li92/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Li92/g;)Landroid/net/NetworkCapabilities;
    .locals 0

    invoke-direct {p0}, Li92/g;->h()Landroid/net/NetworkCapabilities;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Li92/g;)Landroid/net/ConnectivityManager;
    .locals 0

    iget-object p0, p0, Li92/g;->a:Landroid/net/ConnectivityManager;

    return-object p0
.end method

.method private final g(Landroid/net/NetworkCapabilities;)Li92/h;
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Li92/h$b;->a:Li92/h$b;

    return-object p1

    :cond_0
    const/16 v0, 0x10

    invoke-virtual {p1, v0}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0xb

    invoke-virtual {p1, v0}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    new-instance v0, Li92/h$a;

    invoke-direct {v0, p1}, Li92/h$a;-><init>(Z)V

    return-object v0

    :cond_1
    sget-object p1, Li92/h$b;->a:Li92/h$b;

    return-object p1
.end method

.method private final h()Landroid/net/NetworkCapabilities;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    iget-object v0, p0, Li92/g;->a:Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Li92/g;->c:Lec3/l;

    return-object v0
.end method

.method public b()Ll73/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll73/c;"
        }
    .end annotation

    invoke-virtual {p0}, Li92/g;->a()Lec3/l;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->g(Lec3/l;)Lw73/f;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 3

    invoke-direct {p0}, Li92/g;->h()Landroid/net/NetworkCapabilities;

    move-result-object v0

    if-eqz v0, :cond_1

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "metered"

    goto :goto_0

    :cond_0
    const-string v0, "unmetered"

    :goto_0
    const-string v1, "Connected and "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, "Disconnected"

    return-object v0
.end method

.method public isConnected()Z
    .locals 3

    invoke-direct {p0}, Li92/g;->h()Landroid/net/NetworkCapabilities;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/16 v2, 0x10

    invoke-virtual {v0, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1
.end method
