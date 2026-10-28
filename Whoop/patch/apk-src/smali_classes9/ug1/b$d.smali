.class final Lug1/b$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug1/b;->c(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lzj0/h;",
        "<anonymous>",
        "()Lzj0/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.firmwareUpdateService.strategy.DefaultUpdateStrategy$abortRealtimeStreamsAndHistorySync$2$1"
    f = "DefaultUpdateStrategy.kt"
    l = {
        0x1e8,
        0x1e9,
        0x1ea
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lvk0/i;

.field final synthetic y:Lug1/b;


# direct methods
.method public constructor <init>(Lvk0/i;Lug1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk0/i;",
            "Lug1/b;",
            "Lq83/d<",
            "-",
            "Lug1/b$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lug1/b$d;->x:Lvk0/i;

    iput-object p2, p0, Lug1/b$d;->y:Lug1/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lug1/b$d;

    iget-object v1, p0, Lug1/b$d;->x:Lvk0/i;

    iget-object v2, p0, Lug1/b$d;->y:Lug1/b;

    invoke-direct {v0, v1, v2, p1}, Lug1/b$d;-><init>(Lvk0/i;Lug1/b;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lug1/b$d;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lzj0/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lug1/b$d;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lug1/b$d;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lug1/b$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lug1/b$d;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    move-object v10, p0

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    move-object v10, p0

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move p1, v5

    iget-object v5, p0, Lug1/b$d;->x:Lvk0/i;

    new-instance v6, Lxj0/l1;

    iget-object v1, p0, Lug1/b$d;->y:Lug1/b;

    invoke-static {v1}, Lug1/b;->t(Lug1/b;)Lst0/v;

    move-result-object v1

    invoke-direct {v6, v2, v1}, Lxj0/l1;-><init>(ZLst0/v;)V

    iput p1, p0, Lug1/b$d;->w:I

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v10, p0

    invoke-static/range {v5 .. v12}, Lvk0/i;->r0(Lvk0/i;Lvk0/g;JZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    iget-object v5, v10, Lug1/b$d;->x:Lvk0/i;

    new-instance v6, Lxj0/h1;

    iget-object p1, v10, Lug1/b$d;->y:Lug1/b;

    invoke-static {p1}, Lug1/b;->t(Lug1/b;)Lst0/v;

    move-result-object p1

    invoke-direct {v6, v2, p1}, Lxj0/h1;-><init>(ZLst0/v;)V

    iput v4, v10, Lug1/b$d;->w:I

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, Lvk0/i;->r0(Lvk0/i;Lvk0/g;JZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    iget-object v5, v10, Lug1/b$d;->x:Lvk0/i;

    new-instance v6, Lxj0/s;

    iget-object p1, v10, Lug1/b$d;->y:Lug1/b;

    invoke-static {p1}, Lug1/b;->t(Lug1/b;)Lst0/v;

    move-result-object p1

    invoke-direct {v6, p1}, Lxj0/s;-><init>(Lst0/v;)V

    iput v3, v10, Lug1/b$d;->w:I

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, Lvk0/i;->r0(Lvk0/i;Lvk0/g;JZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    :goto_3
    instance-of v0, p1, Ll83/m;

    if-eqz v0, :cond_7

    const/4 p1, 0x0

    :cond_7
    return-object p1
.end method
