.class final Lpq0/f$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpq0/f;->D(Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.whoop.community.presentation.share.GlobalShareDialogViewModel$fetchWidgets$1"
    f = "GlobalShareDialogViewModel.kt"
    l = {
        0x32
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lpq0/f;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lpq0/f;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpq0/f;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpq0/f$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpq0/f$b;->x:Lpq0/f;

    iput-object p2, p0, Lpq0/f$b;->y:Ljava/lang/String;

    iput-object p3, p0, Lpq0/f$b;->z:Ljava/lang/String;

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

    new-instance p1, Lpq0/f$b;

    iget-object v0, p0, Lpq0/f$b;->x:Lpq0/f;

    iget-object v1, p0, Lpq0/f$b;->y:Ljava/lang/String;

    iget-object v2, p0, Lpq0/f$b;->z:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lpq0/f$b;-><init>(Lpq0/f;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lpq0/f$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpq0/f$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpq0/f$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lpq0/f$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lpq0/f$b;->w:I

    const/4 v7, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v7, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, p0, Lpq0/f$b;->x:Lpq0/f;

    invoke-static {v0}, Lpq0/f;->A(Lpq0/f;)Lcq0/h;

    move-result-object v0

    iget-object v1, p0, Lpq0/f$b;->y:Ljava/lang/String;

    iget-object v2, p0, Lpq0/f$b;->z:Ljava/lang/String;

    iput v7, p0, Lpq0/f$b;->w:I

    const/4 v3, 0x0

    const/16 v4, 0x19

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lcq0/h;->f(Ljava/lang/String;Ljava/lang/String;IILq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_2

    return-object v6

    :cond_2
    :goto_0
    check-cast v0, Lcom/whoop/data/remote/commons/Resource;

    invoke-virtual {v0}, Lcom/whoop/data/remote/commons/Resource;->getSuccess()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lcom/whoop/data/remote/commons/Resource;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;

    if-eqz v0, :cond_7

    iget-object v1, p0, Lpq0/f$b;->x:Lpq0/f;

    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->getRecords()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->getHasData()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_1
    move-object v13, v3

    goto :goto_3

    :cond_4
    :goto_2
    sget-object v3, Lpq0/g;->g:Lpq0/g$a;

    invoke-virtual {v3}, Lpq0/g$a;->a()Lpq0/g;

    move-result-object v3

    goto :goto_1

    :goto_3
    invoke-virtual {v1}, Lpq0/f;->G()Landroidx/lifecycle/p0;

    move-result-object v3

    new-instance v8, Lpq0/i;

    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->getRecords()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v1}, Lpq0/f;->E()Ll83/k;

    move-result-object v10

    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->getRecords()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v7, :cond_5

    if-nez v13, :cond_5

    move v11, v7

    goto :goto_4

    :cond_5
    move v11, v2

    :goto_4
    invoke-static {v1}, Lpq0/f;->z(Lpq0/f;)Li92/e;

    move-result-object v0

    invoke-interface {v0}, Li92/e;->isConnected()Z

    move-result v12

    invoke-direct/range {v8 .. v13}, Lpq0/i;-><init>(Ljava/util/List;Ll83/k;ZZLpq0/g;)V

    invoke-static {v1, v3, v8}, Lpq0/f;->B(Lpq0/f;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    goto :goto_5

    :cond_6
    iget-object v0, p0, Lpq0/f$b;->x:Lpq0/f;

    invoke-static {v0}, Lpq0/f;->y(Lpq0/f;)Ltr2/n;

    move-result-object v0

    const-string v1, "fetch widgets api call failed"

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lpq0/f$b;->x:Lpq0/f;

    invoke-virtual {v0}, Lpq0/f;->G()Landroidx/lifecycle/p0;

    move-result-object v1

    new-instance v6, Lpq0/i;

    iget-object v2, p0, Lpq0/f$b;->x:Lpq0/f;

    invoke-static {v2}, Lpq0/f;->z(Lpq0/f;)Li92/e;

    move-result-object v2

    invoke-interface {v2}, Li92/e;->isConnected()Z

    move-result v10

    sget-object v2, Lpq0/g;->g:Lpq0/g$a;

    invoke-virtual {v2}, Lpq0/g$a;->c()Lpq0/g;

    move-result-object v11

    const/4 v12, 0x7

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v13}, Lpq0/i;-><init>(Ljava/util/List;Ll83/k;ZZLpq0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v1, v6}, Lpq0/f;->C(Lpq0/f;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    :cond_7
    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
