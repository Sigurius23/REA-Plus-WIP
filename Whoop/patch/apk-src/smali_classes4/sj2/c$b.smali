.class final Lsj2/c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsj2/c;->c(Ljava/lang/String;Lsj2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lbc3/i0;
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
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0000*\u00020\u0001H\n"
    }
    d2 = {
        "R",
        "Lbc3/c0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.taskexecutor.PriorityInterruptibleExecutionServiceImpl$submit$internalTaskDeferred$1"
    f = "PriorityInterruptibleExecutionService.kt"
    l = {
        0x8a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lsj2/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsj2/e<",
            "TR;>;"
        }
    .end annotation
.end field

.field final synthetic y:Lsj2/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsj2/c<",
            "TR;>;"
        }
    .end annotation
.end field

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lsj2/e;Lsj2/c;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsj2/e<",
            "TR;>;",
            "Lsj2/c<",
            "TR;>;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lsj2/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsj2/c$b;->x:Lsj2/e;

    iput-object p2, p0, Lsj2/c$b;->y:Lsj2/c;

    iput-object p3, p0, Lsj2/c$b;->z:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lsj2/c$b;

    iget-object v0, p0, Lsj2/c$b;->x:Lsj2/e;

    iget-object v1, p0, Lsj2/c$b;->y:Lsj2/c;

    iget-object v2, p0, Lsj2/c$b;->z:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lsj2/c$b;-><init>(Lsj2/e;Lsj2/c;Ljava/lang/String;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lsj2/c$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsj2/c$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsj2/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsj2/c$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsj2/c$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsj2/c$b;->x:Lsj2/e;

    invoke-virtual {p1}, Lsj2/e;->a()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    iput v2, p0, Lsj2/c$b;->w:I

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object v0, p0, Lsj2/c$b;->y:Lsj2/c;

    invoke-static {v0}, Lsj2/c;->e(Lsj2/c;)Ltr2/n;

    move-result-object v0

    iget-object v1, p0, Lsj2/c$b;->z:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " - Received response "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-object p1
.end method
