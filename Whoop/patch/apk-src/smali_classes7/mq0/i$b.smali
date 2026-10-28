.class final Lmq0/i$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmq0/i;->H()V
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
    c = "com.whoop.community.presentation.datawidget.DataWidgetViewModel$getDataWidgets$1"
    f = "DataWidgetViewModel.kt"
    l = {
        0x36
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lmq0/i;


# direct methods
.method public constructor <init>(Lmq0/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmq0/i;",
            "Lq83/d<",
            "-",
            "Lmq0/i$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmq0/i$b;->x:Lmq0/i;

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

    new-instance p1, Lmq0/i$b;

    iget-object v0, p0, Lmq0/i$b;->x:Lmq0/i;

    invoke-direct {p1, v0, p2}, Lmq0/i$b;-><init>(Lmq0/i;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lmq0/i$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmq0/i$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmq0/i$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lmq0/i$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lmq0/i$b;->w:I

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

    iget-object p1, p0, Lmq0/i$b;->x:Lmq0/i;

    invoke-static {p1}, Lmq0/i;->y(Lmq0/i;)Lcq0/a;

    move-result-object p1

    iput v2, p0, Lmq0/i$b;->w:I

    const/4 v1, 0x0

    const/16 v2, 0x19

    invoke-virtual {p1, v1, v2, p0}, Lcq0/a;->f(IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/whoop/data/remote/commons/Resource;

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lmq0/i$b;->x:Lmq0/i;

    invoke-virtual {v1}, Lmq0/i;->G()Landroidx/lifecycle/p0;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getSuccess()Z

    move-result v3

    if-eqz v3, :cond_3

    if-eqz v0, :cond_3

    new-instance v3, Lmq0/j;

    iget-object v4, p0, Lmq0/i$b;->x:Lmq0/i;

    invoke-static {v4}, Lmq0/i;->B(Lmq0/i;)Li92/e;

    move-result-object v4

    invoke-interface {v4}, Li92/e;->isConnected()Z

    move-result v4

    iget-object v5, p0, Lmq0/i$b;->x:Lmq0/i;

    invoke-static {v5}, Lmq0/i;->w(Lmq0/i;)Ll83/k;

    move-result-object v5

    iget-object v6, p0, Lmq0/i$b;->x:Lmq0/i;

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-static {v6, p1}, Lmq0/i;->z(Lmq0/i;Ljava/util/List;)Lmq0/c;

    move-result-object p1

    invoke-direct {v3, v4, v0, v5, p1}, Lmq0/j;-><init>(ZLjava/util/List;Ll83/k;Lmq0/c;)V

    goto :goto_1

    :cond_3
    new-instance v6, Lmq0/j;

    iget-object p1, p0, Lmq0/i$b;->x:Lmq0/i;

    invoke-static {p1}, Lmq0/i;->B(Lmq0/i;)Li92/e;

    move-result-object p1

    invoke-interface {p1}, Li92/e;->isConnected()Z

    move-result v7

    iget-object p1, p0, Lmq0/i$b;->x:Lmq0/i;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lmq0/i;->z(Lmq0/i;Ljava/util/List;)Lmq0/c;

    move-result-object v10

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v12}, Lmq0/j;-><init>(ZLjava/util/List;Ll83/k;Lmq0/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v6

    :goto_1
    invoke-static {v1, v2, v3}, Lmq0/i;->D(Lmq0/i;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
