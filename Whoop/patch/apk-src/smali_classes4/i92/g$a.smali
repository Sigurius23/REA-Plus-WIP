.class final Li92/g$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li92/g;-><init>(Landroid/net/ConnectivityManager;Lbc3/c0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ldc3/u;",
        "Li92/h;",
        "Ll83/a0;",
        "<anonymous>",
        "(Ldc3/u;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.service.network.NetworkMonitorImpl$networkStateSource$1"
    f = "NetworkMonitor.kt"
    l = {
        0x3b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Li92/g;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li92/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li92/g;",
            "Lq83/d<",
            "-",
            "Li92/g$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Li92/g$a;->E:Li92/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Li92/g;Li92/g$a$a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Li92/g$a;->h(Li92/g;Li92/g$a$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Li92/g;Li92/g$a$a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Li92/g;->f(Li92/g;)Landroid/net/ConnectivityManager;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Li92/g$a;

    iget-object v1, p0, Li92/g$a;->E:Li92/g;

    invoke-direct {v0, v1, p2}, Li92/g$a;-><init>(Li92/g;Lq83/d;)V

    iput-object p1, v0, Li92/g$a;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc3/u;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Li92/g$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Li92/g$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Li92/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Li92/g$a;->invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Li92/g$a;->z:Ljava/lang/Object;

    check-cast v0, Ldc3/u;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Li92/g$a;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Li92/g$a;->x:Ljava/lang/Object;

    check-cast v0, Li92/h;

    iget-object v0, p0, Li92/g$a;->w:Ljava/lang/Object;

    check-cast v0, Li92/g$a$a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Li92/g$a$a;

    iget-object v2, p0, Li92/g$a;->E:Li92/g;

    invoke-direct {p1, v0, v2}, Li92/g$a$a;-><init>(Ldc3/u;Li92/g;)V

    iget-object v2, p0, Li92/g$a;->E:Li92/g;

    invoke-static {v2}, Li92/g;->e(Li92/g;)Landroid/net/NetworkCapabilities;

    move-result-object v4

    invoke-static {v2, v4}, Li92/g;->d(Li92/g;Landroid/net/NetworkCapabilities;)Li92/h;

    move-result-object v2

    move-object v4, v0

    check-cast v4, Ldc3/t;

    invoke-virtual {v4, v2}, Ldc3/t;->s(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Li92/g$a;->E:Li92/g;

    invoke-static {v2}, Li92/g;->f(Li92/g;)Landroid/net/ConnectivityManager;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    iget-object v2, p0, Li92/g$a;->E:Li92/g;

    new-instance v4, Li92/f;

    invoke-direct {v4, v2, p1}, Li92/f;-><init>(Li92/g;Li92/g$a$a;)V

    const/4 p1, 0x0

    iput-object p1, p0, Li92/g$a;->z:Ljava/lang/Object;

    iput-object p1, p0, Li92/g$a;->w:Ljava/lang/Object;

    iput-object p1, p0, Li92/g$a;->x:Ljava/lang/Object;

    iput v3, p0, Li92/g$a;->y:I

    invoke-static {v0, v4, p0}, Lwb3/f;->h(Ldc3/u;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
