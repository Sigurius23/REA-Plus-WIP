.class final Lwx1/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwx1/d;->f(Lud3/a1;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ljava/io/File;",
        "<anonymous>",
        "(Lbc3/c0;)Ljava/io/File;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.membership.returns.domain.ReturnsPdfHandler$savePdf$2"
    f = "ReturnsPdfHandler.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lud3/a1;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lwx1/d;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lwx1/d;Ljava/lang/String;Lud3/a1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwx1/d;",
            "Ljava/lang/String;",
            "Lud3/a1;",
            "Lq83/d<",
            "-",
            "Lwx1/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwx1/d$c;->y:Lwx1/d;

    iput-object p2, p0, Lwx1/d$c;->z:Ljava/lang/String;

    iput-object p3, p0, Lwx1/d$c;->E:Lud3/a1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lwx1/d$c;

    iget-object v1, p0, Lwx1/d$c;->y:Lwx1/d;

    iget-object v2, p0, Lwx1/d$c;->z:Ljava/lang/String;

    iget-object v3, p0, Lwx1/d$c;->E:Lud3/a1;

    invoke-direct {v0, v1, v2, v3, p2}, Lwx1/d$c;-><init>(Lwx1/d;Ljava/lang/String;Lud3/a1;Lq83/d;)V

    iput-object p1, v0, Lwx1/d$c;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ljava/io/File;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lwx1/d$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lwx1/d$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lwx1/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lwx1/d$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lwx1/d$c;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lwx1/d$c;->w:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_0
    iget-object p1, p0, Lwx1/d$c;->y:Lwx1/d;

    invoke-static {p1}, Lwx1/d;->b(Lwx1/d;)Lor2/a0;

    move-result-object p1

    iget-object v1, p0, Lwx1/d$c;->z:Ljava/lang/String;

    iget-object v2, p0, Lwx1/d$c;->E:Lud3/a1;

    invoke-virtual {p1, v1, v2}, Lor2/a0;->h(Ljava/lang/String;Lud3/a1;)Ljava/io/File;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->o(Lq83/j;)V

    iget-object v0, p0, Lwx1/d$c;->y:Lwx1/d;

    invoke-static {v0}, Lwx1/d;->c(Lwx1/d;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Failed to save pdf file"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
