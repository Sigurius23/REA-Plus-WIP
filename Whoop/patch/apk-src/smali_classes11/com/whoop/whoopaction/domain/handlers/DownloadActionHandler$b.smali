.class final Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->b(Lec3/l;)Lec3/l;
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lqw2/a;",
        "domainAction",
        "Lec3/l;",
        "Lqw2/b;",
        "<anonymous>",
        "(Lqw2/a;)Lec3/l;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whoopaction.domain.handlers.DownloadActionHandler$handleActions$1"
    f = "DownloadActionHandler.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;


# direct methods
.method public constructor <init>(Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$b;->y:Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
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

    new-instance v0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$b;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$b;->y:Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;

    invoke-direct {v0, v1, p2}, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$b;-><init>(Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$b;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lqw2/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqw2/a;",
            "Lq83/d<",
            "-",
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lqw2/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$b;->f(Lqw2/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$b;->x:Ljava/lang/Object;

    check-cast v0, Lqw2/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$b;->w:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v0}, Lqw2/a;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.whoop.whoopaction.domain.models.DownloadAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/whoop/whoopaction/domain/models/DownloadAction;

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$b;->y:Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;

    invoke-static {v0}, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->d(Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;)Ltr2/n;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/DownloadAction;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/DownloadAction;->getFilename()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/DownloadAction;->getTimeoutMillis()Ljava/lang/Long;

    move-result-object v3

    const-string v4, "\', filename: \'"

    const-string v5, "\', timeoutMillis: "

    const-string v6, "DownloadAction received \u2014 path: \'"

    invoke-static {v6, v1, v4, v2, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$b$a;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$b;->y:Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$b$a;-><init>(Lcom/whoop/whoopaction/domain/models/DownloadAction;Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
