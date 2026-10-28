.class final Lcom/whoop/service/rearchitect/c$a$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/service/rearchitect/c$a;->b(Lfk2/a;Lq83/d;)Ljava/lang/Object;
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
        "Lzj0/h;",
        "<anonymous>",
        "(Lbc3/c0;)Lzj0/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.service.rearchitect.WhoopStrap$ClockSynchronizer$synchronizeClocks$setClockResponse$1"
    f = "WhoopStrap.kt"
    l = {
        0x667
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/service/rearchitect/c;


# direct methods
.method public constructor <init>(Lcom/whoop/service/rearchitect/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/rearchitect/c;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/service/rearchitect/c$a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/service/rearchitect/c$a$c;->x:Lcom/whoop/service/rearchitect/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lcom/whoop/service/rearchitect/c$a$c;

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$a$c;->x:Lcom/whoop/service/rearchitect/c;

    invoke-direct {p1, v0, p2}, Lcom/whoop/service/rearchitect/c$a$c;-><init>(Lcom/whoop/service/rearchitect/c;Lq83/d;)V

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
            "Lzj0/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/service/rearchitect/c$a$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/service/rearchitect/c$a$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/service/rearchitect/c$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/service/rearchitect/c$a$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/service/rearchitect/c$a$c;->w:I

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

    iget-object v1, p0, Lcom/whoop/service/rearchitect/c$a$c;->x:Lcom/whoop/service/rearchitect/c;

    move p1, v2

    new-instance v2, Lxj0/v0;

    new-instance v3, Lfk2/a;

    invoke-direct {v3}, Lfk2/a;-><init>()V

    iget-object v4, p0, Lcom/whoop/service/rearchitect/c$a$c;->x:Lcom/whoop/service/rearchitect/c;

    invoke-virtual {v4}, Lcom/whoop/service/rearchitect/c;->w0()Lst0/v;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lxj0/v0;-><init>(Lfk2/a;Lst0/v;)V

    iput p1, p0, Lcom/whoop/service/rearchitect/c$a$c;->w:I

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v6, p0

    invoke-static/range {v1 .. v8}, Lnk0/a;->T(Lnk0/a;Lxj0/b;JZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
