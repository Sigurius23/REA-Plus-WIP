.class public final Lf70/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lf70/l;",
        "",
        "Lod1/p;",
        "sessionMgr",
        "Lcom/whoop/data/remote/NewWhoopLoginInterceptor;",
        "newWhoopLoginInterceptor",
        "Lod1/a0;",
        "userSessionManager",
        "Lpd1/a;",
        "bootstrapUserSignIn",
        "Lod1/j;",
        "pendingUserSession",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lod1/p;Lcom/whoop/data/remote/NewWhoopLoginInterceptor;Lod1/a0;Lpd1/a;Lod1/j;Ltr2/n;)V",
        "Lcom/whoop/domain/model/AuthMaterial;",
        "authMaterial",
        "Lcom/whoop/service/network/model/LoginResult;",
        "a",
        "(Lcom/whoop/domain/model/AuthMaterial;Lq83/d;)Ljava/lang/Object;",
        "Lf70/k;",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lod1/p;",
        "Lcom/whoop/data/remote/NewWhoopLoginInterceptor;",
        "c",
        "Lod1/a0;",
        "d",
        "Lpd1/a;",
        "e",
        "Lod1/j;",
        "f",
        "Ltr2/n;",
        "activation_release"
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
.field private final a:Lod1/p;

.field private final b:Lcom/whoop/data/remote/NewWhoopLoginInterceptor;

.field private final c:Lod1/a0;

.field private final d:Lpd1/a;

.field private final e:Lod1/j;

.field private final f:Ltr2/n;


# direct methods
.method public constructor <init>(Lod1/p;Lcom/whoop/data/remote/NewWhoopLoginInterceptor;Lod1/a0;Lpd1/a;Lod1/j;Ltr2/n;)V
    .locals 1

    const-string v0, "sessionMgr"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newWhoopLoginInterceptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userSessionManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bootstrapUserSignIn"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pendingUserSession"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf70/l;->a:Lod1/p;

    .line 3
    iput-object p2, p0, Lf70/l;->b:Lcom/whoop/data/remote/NewWhoopLoginInterceptor;

    .line 4
    iput-object p3, p0, Lf70/l;->c:Lod1/a0;

    .line 5
    iput-object p4, p0, Lf70/l;->d:Lpd1/a;

    .line 6
    iput-object p5, p0, Lf70/l;->e:Lod1/j;

    .line 7
    iput-object p6, p0, Lf70/l;->f:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lod1/p;Lcom/whoop/data/remote/NewWhoopLoginInterceptor;Lod1/a0;Lpd1/a;Lod1/j;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 8
    sget-object p6, Ltr2/n;->a:Ltr2/n$a;

    const-string p7, "ActivationUserSessionCreator"

    invoke-virtual {p6, p7}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p6

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, Lf70/l;-><init>(Lod1/p;Lcom/whoop/data/remote/NewWhoopLoginInterceptor;Lod1/a0;Lpd1/a;Lod1/j;Ltr2/n;)V

    return-void
.end method

.method private final a(Lcom/whoop/domain/model/AuthMaterial;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/AuthMaterial;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/service/network/model/LoginResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lf70/l;->d:Lpd1/a;

    invoke-virtual {v0, p1, p2}, Lpd1/a;->j(Lcom/whoop/domain/model/AuthMaterial;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final b(Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lf70/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lf70/l$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lf70/l$a;

    iget v1, v0, Lf70/l$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf70/l$a;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lf70/l$a;

    invoke-direct {v0, p0, p1}, Lf70/l$a;-><init>(Lf70/l;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lf70/l$a;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lf70/l$a;->E:I

    const/4 v7, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object v0, v6, Lf70/l$a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/service/network/model/LoginResult;

    iget-object v0, v6, Lf70/l$a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/domain/model/AuthMaterial;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v1, v6, Lf70/l$a;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/AuthMaterial;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    move-object p1, v0

    goto :goto_6

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lf70/l;->e:Lod1/j;

    invoke-virtual {p1}, Lod1/j;->b()Lcom/whoop/domain/model/AuthMaterial;

    move-result-object p1

    if-nez p1, :cond_4

    new-instance p1, Lf70/k$a;

    sget-object v0, Lf70/j;->IMPORTANT_APP_INFO_MISSING:Lf70/j;

    invoke-direct {p1, v0}, Lf70/k$a;-><init>(Lf70/j;)V

    return-object p1

    :cond_4
    :try_start_2
    iput-object v4, v6, Lf70/l$a;->w:Ljava/lang/Object;

    iput v3, v6, Lf70/l$a;->E:I

    invoke-direct {p0, p1, v6}, Lf70/l;->a(Lcom/whoop/domain/model/AuthMaterial;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    check-cast p1, Lcom/whoop/service/network/model/LoginResult;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    iget-object v1, p0, Lf70/l;->b:Lcom/whoop/data/remote/NewWhoopLoginInterceptor;

    invoke-virtual {p1}, Lcom/whoop/service/network/model/LoginResult;->getSession()Lcom/whoop/domain/model/Session;

    move-result-object p1

    iget-object v3, p0, Lf70/l;->a:Lod1/p;

    move-object v5, v4

    iget-object v4, p0, Lf70/l;->c:Lod1/a0;

    iput-object v5, v6, Lf70/l$a;->w:Ljava/lang/Object;

    iput-object v5, v6, Lf70/l$a;->x:Ljava/lang/Object;

    iput v2, v6, Lf70/l$a;->E:I

    const/4 v5, 0x1

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lcom/whoop/data/remote/NewWhoopLoginInterceptor;->interceptSuspend(Lcom/whoop/domain/model/Session;Lod1/p;Lod1/a0;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_3
    return-object v0

    :cond_6
    :goto_4
    sget-object p1, Lf70/k$b;->a:Lf70/k$b;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    return-object p1

    :goto_5
    iget-object v0, p0, Lf70/l;->f:Ltr2/n;

    const-string v1, "Error fetching mission critical information: "

    invoke-static {p1, v1}, Lb9/y;->j(Ljava/lang/Exception;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v7, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lf70/k$a;

    sget-object v0, Lf70/j;->IMPORTANT_APP_INFO_MISSING:Lf70/j;

    invoke-direct {p1, v0}, Lf70/k$a;-><init>(Lf70/j;)V

    return-object p1

    :goto_6
    iget-object v0, p0, Lf70/l;->f:Ltr2/n;

    const-string v1, "Error creating login result: "

    invoke-static {p1, v1}, Lb9/y;->j(Ljava/lang/Exception;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v7, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lf70/k$a;

    sget-object v0, Lf70/j;->BOOTSTRAP_ERROR:Lf70/j;

    invoke-direct {p1, v0}, Lf70/k$a;-><init>(Lf70/j;)V

    return-object p1
.end method
