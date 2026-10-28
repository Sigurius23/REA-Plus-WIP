.class final Lcom/whoop/service/rearchitect/c$c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/service/rearchitect/c$c;->b()V
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
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.service.rearchitect.WhoopStrap$NordicGenericHrProfileController$enable$1$1"
    f = "WhoopStrap.kt"
    l = {
        0x61a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/service/rearchitect/c;

.field final synthetic y:Lcom/whoop/service/rearchitect/c$c;


# direct methods
.method public constructor <init>(Lcom/whoop/service/rearchitect/c;Lcom/whoop/service/rearchitect/c$c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/rearchitect/c;",
            "Lcom/whoop/service/rearchitect/c$c;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/service/rearchitect/c$c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/service/rearchitect/c$c$b;->x:Lcom/whoop/service/rearchitect/c;

    iput-object p2, p0, Lcom/whoop/service/rearchitect/c$c$b;->y:Lcom/whoop/service/rearchitect/c$c;

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

    new-instance p1, Lcom/whoop/service/rearchitect/c$c$b;

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$c$b;->x:Lcom/whoop/service/rearchitect/c;

    iget-object v1, p0, Lcom/whoop/service/rearchitect/c$c$b;->y:Lcom/whoop/service/rearchitect/c$c;

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/service/rearchitect/c$c$b;-><init>(Lcom/whoop/service/rearchitect/c;Lcom/whoop/service/rearchitect/c$c;Lq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/service/rearchitect/c$c$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/service/rearchitect/c$c$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/service/rearchitect/c$c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/service/rearchitect/c$c$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/service/rearchitect/c$c$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, p0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/whoop/service/rearchitect/c$c$b;->x:Lcom/whoop/service/rearchitect/c;

    iput v2, p0, Lcom/whoop/service/rearchitect/c$c$b;->w:I

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v1 .. v7}, Ljk0/d;->W0(Ljk0/d;ZJLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lzj0/d1;

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lzj0/h;->W()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object p1, v5, Lcom/whoop/service/rearchitect/c$c$b;->x:Lcom/whoop/service/rearchitect/c;

    invoke-static {p1}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object p1

    const-string v1, "Generic HR Profile enabled"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1, v1, v0}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, v5, Lcom/whoop/service/rearchitect/c$c$b;->y:Lcom/whoop/service/rearchitect/c$c;

    invoke-static {p1}, Lcom/whoop/service/rearchitect/c$c;->e(Lcom/whoop/service/rearchitect/c$c;)Lg83/b;

    move-result-object p1

    sget-object v0, Ltj0/b;->ENABLED:Ltj0/b;

    invoke-virtual {p1, v0}, Lg83/b;->onNext(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    sget-object v1, Lwj0/b;->FAILURE:Lwj0/b;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lzj0/h;->V()Lwj0/b;

    move-result-object v2

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    :goto_1
    if-ne v1, v2, :cond_5

    iget-object v1, v5, Lcom/whoop/service/rearchitect/c$c$b;->x:Lcom/whoop/service/rearchitect/c;

    invoke-static {v1}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object v1

    invoke-virtual {p1}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Lze1/b;->b(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "Generic HR Profile enable failed with data: "

    invoke-static {v2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v1, p1, v0}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    iget-object p1, v5, Lcom/whoop/service/rearchitect/c$c$b;->x:Lcom/whoop/service/rearchitect/c;

    invoke-static {p1}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object p1

    const-string v1, "Generic HR Profile enable failed. No response"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1, v1, v0}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
