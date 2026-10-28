.class final Lzh1/d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzh1/d;->start()Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ldc3/u;",
        "Lfv1/b;",
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
    c = "com.whoop.gps.foreground.ForegroundGpsCollectorImpl$start$1"
    f = "foregroundGpsCollector.kt"
    l = {
        0x24,
        0x39
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lzh1/d;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lzh1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzh1/d;",
            "Lq83/d<",
            "-",
            "Lzh1/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzh1/d$a;->E:Lzh1/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Lzh1/d$a;->i()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(Lzh1/d;Lzh1/d$a$b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzh1/d$a;->j(Lzh1/d;Lzh1/d$a$b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final i()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(Lzh1/d;Lzh1/d$a$b;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lzh1/d;->a(Lzh1/d;)Lcom/google/android/gms/location/FusedLocationProviderClient;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/location/FusedLocationProviderClient;->removeLocationUpdates(Ltp/g;)Lcom/google/android/gms/tasks/Task;

    invoke-static {p0}, Lzh1/d;->c(Lzh1/d;)Ltp/g;

    move-result-object v0

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lzh1/d;->e(Lzh1/d;Ltp/g;)V

    :cond_0
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

    new-instance v0, Lzh1/d$a;

    iget-object v1, p0, Lzh1/d$a;->E:Lzh1/d;

    invoke-direct {v0, v1, p2}, Lzh1/d$a;-><init>(Lzh1/d;Lq83/d;)V

    iput-object p1, v0, Lzh1/d$a;->z:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lzh1/d$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lzh1/d$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lzh1/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lzh1/d$a;->invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lzh1/d$a;->z:Ljava/lang/Object;

    check-cast v0, Ldc3/u;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lzh1/d$a;->y:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v0, p0, Lzh1/d$a;->x:Ljava/lang/Object;

    check-cast v0, Lzh1/d$a$b;

    iget-object v0, p0, Lzh1/d$a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/location/LocationRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lzh1/d$a;->E:Lzh1/d;

    invoke-static {p1}, Lzh1/d;->b(Lzh1/d;)Lgi1/b;

    move-result-object p1

    invoke-virtual {p1}, Lgi1/b;->b()Z

    move-result p1

    const/4 v2, 0x0

    if-nez p1, :cond_3

    new-instance p1, Lzh1/b;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Lzh1/d$a;->z:Ljava/lang/Object;

    iput v5, p0, Lzh1/d$a;->y:I

    invoke-static {v0, p1, p0}, Lwb3/f;->h(Ldc3/u;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_0

    :cond_3
    new-instance p1, Lzh1/d$a$a;

    iget-object v5, p0, Lzh1/d$a;->E:Lzh1/d;

    invoke-direct {p1, v5, v0, v2}, Lzh1/d$a$a;-><init>(Lzh1/d;Ldc3/u;Lq83/d;)V

    const/4 v5, 0x3

    invoke-static {v0, v2, v2, p1, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance p1, Lcom/google/android/gms/location/LocationRequest;

    invoke-direct {p1}, Lcom/google/android/gms/location/LocationRequest;-><init>()V

    const/16 v5, 0x64

    iput v5, p1, Lcom/google/android/gms/location/LocationRequest;->w:I

    const-wide/16 v5, 0xbb8

    invoke-virtual {p1, v5, v6}, Lcom/google/android/gms/location/LocationRequest;->i(J)V

    const-wide/16 v5, 0x7d0

    invoke-virtual {p1, v5, v6}, Lcom/google/android/gms/location/LocationRequest;->h(J)V

    new-instance v5, Lzh1/d$a$b;

    invoke-direct {v5, v0}, Lzh1/d$a$b;-><init>(Ldc3/u;)V

    iget-object v6, p0, Lzh1/d$a;->E:Lzh1/d;

    invoke-static {v6, v5}, Lzh1/d;->e(Lzh1/d;Ltp/g;)V

    iget-object v6, p0, Lzh1/d$a;->E:Lzh1/d;

    invoke-static {v6}, Lzh1/d;->a(Lzh1/d;)Lcom/google/android/gms/location/FusedLocationProviderClient;

    move-result-object v6

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v7

    invoke-virtual {v6, p1, v5, v7}, Lcom/google/android/gms/location/FusedLocationProviderClient;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Ltp/g;Landroid/os/Looper;)Lcom/google/android/gms/tasks/Task;

    iget-object p1, p0, Lzh1/d$a;->E:Lzh1/d;

    new-instance v6, Lzh1/c;

    invoke-direct {v6, p1, v5}, Lzh1/c;-><init>(Lzh1/d;Lzh1/d$a$b;)V

    iput-object v2, p0, Lzh1/d$a;->z:Ljava/lang/Object;

    iput-object v2, p0, Lzh1/d$a;->w:Ljava/lang/Object;

    iput-object v2, p0, Lzh1/d$a;->x:Ljava/lang/Object;

    iput v4, p0, Lzh1/d$a;->y:I

    invoke-static {v0, v6, p0}, Lwb3/f;->h(Ldc3/u;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_0
    return-object v1

    :cond_4
    return-object v3
.end method
