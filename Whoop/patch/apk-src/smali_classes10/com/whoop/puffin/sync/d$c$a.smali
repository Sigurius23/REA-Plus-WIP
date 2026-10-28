.class final Lcom/whoop/puffin/sync/d$c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/puffin/sync/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "Lpu0/b;",
        "<anonymous>",
        "(Lbc3/c0;)Ljava/util/List;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.puffin.sync.BatterySyncInteractorImpl$validateAndSaveData$2$consoleLogEntities$1"
    f = "BatterySyncInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/puffin/sync/d;

.field final synthetic y:Lcom/whoop/puffin/sync/e$b;


# direct methods
.method public constructor <init>(Lcom/whoop/puffin/sync/d;Lcom/whoop/puffin/sync/e$b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/puffin/sync/d;",
            "Lcom/whoop/puffin/sync/e$b;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/puffin/sync/d$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/puffin/sync/d$c$a;->x:Lcom/whoop/puffin/sync/d;

    iput-object p2, p0, Lcom/whoop/puffin/sync/d$c$a;->y:Lcom/whoop/puffin/sync/e$b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lcom/whoop/puffin/sync/d$c$a;

    iget-object v0, p0, Lcom/whoop/puffin/sync/d$c$a;->x:Lcom/whoop/puffin/sync/d;

    iget-object v1, p0, Lcom/whoop/puffin/sync/d$c$a;->y:Lcom/whoop/puffin/sync/e$b;

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/puffin/sync/d$c$a;-><init>(Lcom/whoop/puffin/sync/d;Lcom/whoop/puffin/sync/e$b;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lpu0/b;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/puffin/sync/d$c$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/puffin/sync/d$c$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/puffin/sync/d$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/puffin/sync/d$c$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lcom/whoop/puffin/sync/d$c$a;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/puffin/sync/d$c$a;->x:Lcom/whoop/puffin/sync/d;

    invoke-static {p1}, Lcom/whoop/puffin/sync/d;->f(Lcom/whoop/puffin/sync/d;)Lcom/whoop/puffin/sync/a;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/puffin/sync/d$c$a;->y:Lcom/whoop/puffin/sync/e$b;

    invoke-virtual {p1, v0}, Lcom/whoop/puffin/sync/a;->b(Lcom/whoop/puffin/sync/e$b;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
