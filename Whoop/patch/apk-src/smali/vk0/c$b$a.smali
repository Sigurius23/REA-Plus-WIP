.class final Lvk0/c$b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvk0/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Lvk0/e;",
        "<anonymous>",
        "(Lbc3/c0;)Lvk0/e;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.bleTaskExecutor.BleTaskExecutorImpl$submitDeferredTask$deferred$1$1"
    f = "BleTaskExecutorImpl.kt"
    l = {
        0xac
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lst0/v;

.field final synthetic F:Lvk0/i;

.field w:I

.field final synthetic x:Lkotlin/jvm/internal/f0;

.field final synthetic y:Lvk0/c;

.field final synthetic z:Lvk0/a;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/f0;Lvk0/c;Lvk0/a;Lst0/v;Lvk0/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/f0;",
            "Lvk0/c;",
            "Lvk0/a;",
            "Lst0/v;",
            "Lvk0/i;",
            "Lq83/d<",
            "-",
            "Lvk0/c$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvk0/c$b$a;->x:Lkotlin/jvm/internal/f0;

    iput-object p2, p0, Lvk0/c$b$a;->y:Lvk0/c;

    iput-object p3, p0, Lvk0/c$b$a;->z:Lvk0/a;

    iput-object p4, p0, Lvk0/c$b$a;->E:Lst0/v;

    iput-object p5, p0, Lvk0/c$b$a;->F:Lvk0/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lvk0/c$b$a;

    iget-object v1, p0, Lvk0/c$b$a;->x:Lkotlin/jvm/internal/f0;

    iget-object v2, p0, Lvk0/c$b$a;->y:Lvk0/c;

    iget-object v3, p0, Lvk0/c$b$a;->z:Lvk0/a;

    iget-object v4, p0, Lvk0/c$b$a;->E:Lst0/v;

    iget-object v5, p0, Lvk0/c$b$a;->F:Lvk0/i;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lvk0/c$b$a;-><init>(Lkotlin/jvm/internal/f0;Lvk0/c;Lvk0/a;Lst0/v;Lvk0/i;Lq83/d;)V

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
            "Lvk0/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lvk0/c$b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvk0/c$b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvk0/c$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvk0/c$b$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvk0/c$b$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvk0/c$b$a;->x:Lkotlin/jvm/internal/f0;

    iget-object v1, p0, Lvk0/c$b$a;->y:Lvk0/c;

    invoke-virtual {v1}, Lvk0/c;->f()Ljava/time/Clock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/Clock;->millis()J

    move-result-wide v3

    iput-wide v3, p1, Lkotlin/jvm/internal/f0;->w:J

    iget-object p1, p0, Lvk0/c$b$a;->y:Lvk0/c;

    invoke-static {p1}, Lvk0/c;->c(Lvk0/c;)Lvk0/h;

    move-result-object p1

    iget-object v1, p0, Lvk0/c$b$a;->z:Lvk0/a;

    check-cast v1, Lvk0/j;

    invoke-interface {v1}, Lvk0/j;->F()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lvk0/c$b$a;->E:Lst0/v;

    invoke-virtual {p1, v1, v2, v3}, Lvk0/h;->l(Ljava/lang/String;ZLst0/v;)V

    iget-object p1, p0, Lvk0/c$b$a;->z:Lvk0/a;

    check-cast p1, Lvk0/j;

    iget-object v1, p0, Lvk0/c$b$a;->F:Lvk0/i;

    iput v2, p0, Lvk0/c$b$a;->w:I

    invoke-interface {p1, v1, p0}, Lvk0/j;->x(Lvk0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
