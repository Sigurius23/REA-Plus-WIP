.class public Le50/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/whoop/service/network/MembershipApi;

.field private b:Lcom/whoop/data/remote/api/FileDownloaderApi;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private f:Lrg3/a;

.field private final g:Lpg3/m;

.field private h:Lqg3/f;


# direct methods
.method public constructor <init>(Lsr2/y;Lpg3/m;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le50/a;->c:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/membership/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le50/a;->d:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/membership-service/v1/"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le50/a;->e:Ljava/lang/String;

    iput-object p2, p0, Le50/a;->g:Lpg3/m;

    return-void
.end method

.method private b()Lpg3/m;
    .locals 1

    iget-object v0, p0, Le50/a;->f:Lrg3/a;

    if-nez v0, :cond_0

    invoke-static {}, Lor2/i0;->d()Lcom/google/gson/Gson;

    move-result-object v0

    invoke-static {v0}, Lrg3/a;->a(Lcom/google/gson/Gson;)Lrg3/a;

    move-result-object v0

    iput-object v0, p0, Le50/a;->f:Lrg3/a;

    :cond_0
    iget-object v0, p0, Le50/a;->f:Lrg3/a;

    return-object v0
.end method

.method private c()Lud3/l0;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lvf3/c;

    const-string v1, "defaultOkHttpClient"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    const-class v2, Lud3/l0;

    invoke-static {v2, v0, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lud3/l0;

    return-object v0
.end method

.method private d()Lud3/l0;
    .locals 4

    invoke-direct {p0}, Le50/a;->c()Lud3/l0;

    move-result-object v0

    invoke-virtual {v0}, Lud3/l0;->a()Lud3/k0;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1e

    invoke-virtual {v0, v2, v3, v1}, Lud3/k0;->b(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v0, v2, v3, v1}, Lud3/k0;->e(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v0, v2, v3, v1}, Lud3/k0;->f(JLjava/util/concurrent/TimeUnit;)V

    new-instance v1, Lud3/l0;

    invoke-direct {v1, v0}, Lud3/l0;-><init>(Lud3/k0;)V

    return-object v1
.end method

.method private g()Lqg3/f;
    .locals 1

    iget-object v0, p0, Le50/a;->h:Lqg3/f;

    if-nez v0, :cond_0

    new-instance v0, Lqg3/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Le50/a;->h:Lqg3/f;

    :cond_0
    iget-object v0, p0, Le50/a;->h:Lqg3/f;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/whoop/data/remote/api/FileDownloaderApi;
    .locals 2

    iget-object v0, p0, Le50/a;->b:Lcom/whoop/data/remote/api/FileDownloaderApi;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lpg3/x0;

    invoke-direct {v0}, Lpg3/x0;-><init>()V

    iget-object v1, p0, Le50/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lpg3/x0;->c(Ljava/lang/String;)V

    invoke-static {}, Lu82/k;->d()Lpg3/m;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpg3/x0;->b(Lpg3/m;)V

    invoke-virtual {v0}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object v0

    const-class v1, Lcom/whoop/data/remote/api/FileDownloaderApi;

    invoke-virtual {v0, v1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/remote/api/FileDownloaderApi;

    iput-object v0, p0, Le50/a;->b:Lcom/whoop/data/remote/api/FileDownloaderApi;

    return-object v0
.end method

.method public e()Lcom/whoop/service/network/MembershipApi;
    .locals 2

    iget-object v0, p0, Le50/a;->a:Lcom/whoop/service/network/MembershipApi;

    if-nez v0, :cond_0

    new-instance v0, Lpg3/x0;

    invoke-direct {v0}, Lpg3/x0;-><init>()V

    invoke-direct {p0}, Le50/a;->c()Lud3/l0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpg3/x0;->e(Lud3/l0;)V

    iget-object v1, p0, Le50/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lpg3/x0;->c(Ljava/lang/String;)V

    invoke-direct {p0}, Le50/a;->b()Lpg3/m;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpg3/x0;->b(Lpg3/m;)V

    invoke-direct {p0}, Le50/a;->g()Lqg3/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpg3/x0;->a(Lpg3/f;)V

    invoke-virtual {v0}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object v0

    const-class v1, Lcom/whoop/service/network/MembershipApi;

    invoke-virtual {v0, v1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/network/MembershipApi;

    iput-object v0, p0, Le50/a;->a:Lcom/whoop/service/network/MembershipApi;

    :cond_0
    iget-object v0, p0, Le50/a;->a:Lcom/whoop/service/network/MembershipApi;

    return-object v0
.end method

.method public f()Lcom/whoop/service/network/MembershipV2Api;
    .locals 2

    new-instance v0, Lpg3/x0;

    invoke-direct {v0}, Lpg3/x0;-><init>()V

    invoke-direct {p0}, Le50/a;->d()Lud3/l0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpg3/x0;->e(Lud3/l0;)V

    iget-object v1, p0, Le50/a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lpg3/x0;->c(Ljava/lang/String;)V

    iget-object v1, p0, Le50/a;->g:Lpg3/m;

    invoke-virtual {v0, v1}, Lpg3/x0;->b(Lpg3/m;)V

    invoke-direct {p0}, Le50/a;->g()Lqg3/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpg3/x0;->a(Lpg3/f;)V

    invoke-virtual {v0}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object v0

    const-class v1, Lcom/whoop/service/network/MembershipV2Api;

    invoke-virtual {v0, v1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/network/MembershipV2Api;

    return-object v0
.end method
