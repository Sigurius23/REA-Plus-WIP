.class final Lcom/whoop/recommendationtile/domain/h$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/recommendationtile/domain/h;->k(Lcom/whoop/whoopaction/domain/models/UpdateAction;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lcom/whoop/recommendationtile/domain/h$a;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.recommendationtile.domain.RecommendationTileInteractor$commit$1"
    f = "RecommendationTileInteractor.kt"
    l = {
        0x67,
        0x68,
        0x70,
        0x78
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Lcom/whoop/recommendationtile/domain/h;

.field final synthetic G:Lcom/whoop/whoopaction/domain/models/UpdateAction;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lcom/whoop/recommendationtile/domain/h;Lcom/whoop/whoopaction/domain/models/UpdateAction;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/recommendationtile/domain/h;",
            "Lcom/whoop/whoopaction/domain/models/UpdateAction;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/recommendationtile/domain/h$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/recommendationtile/domain/h$b;->F:Lcom/whoop/recommendationtile/domain/h;

    iput-object p2, p0, Lcom/whoop/recommendationtile/domain/h$b;->G:Lcom/whoop/whoopaction/domain/models/UpdateAction;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lcom/whoop/recommendationtile/domain/h$b;

    iget-object v1, p0, Lcom/whoop/recommendationtile/domain/h$b;->F:Lcom/whoop/recommendationtile/domain/h;

    iget-object v2, p0, Lcom/whoop/recommendationtile/domain/h$b;->G:Lcom/whoop/whoopaction/domain/models/UpdateAction;

    invoke-direct {v0, v1, v2, p2}, Lcom/whoop/recommendationtile/domain/h$b;-><init>(Lcom/whoop/recommendationtile/domain/h;Lcom/whoop/whoopaction/domain/models/UpdateAction;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/recommendationtile/domain/h$b;->E:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/recommendationtile/domain/h$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/recommendationtile/domain/h$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/recommendationtile/domain/h$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/recommendationtile/domain/h$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lcom/whoop/recommendationtile/domain/h$b;->E:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lcom/whoop/recommendationtile/domain/h$b;->z:I

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v12, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v11, :cond_1

    if-ne v0, v10, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/whoop/recommendationtile/domain/h$b;->y:Ljava/lang/Object;

    check-cast v0, Lh31/q;

    iget-object v0, p0, Lcom/whoop/recommendationtile/domain/h$b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/recommendationtile/domain/RecommendationTileCommitResponse;

    :goto_0
    iget-object v0, p0, Lcom/whoop/recommendationtile/domain/h$b;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/recommendationtile/domain/h$a$c;->a:Lcom/whoop/recommendationtile/domain/h$a$c;

    iput-object v8, p0, Lcom/whoop/recommendationtile/domain/h$b;->E:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/recommendationtile/domain/h$b;->z:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto/16 :goto_5

    :cond_5
    :goto_1
    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lcom/whoop/recommendationtile/domain/h$b;->F:Lcom/whoop/recommendationtile/domain/h;

    invoke-static {v2}, Lcom/whoop/recommendationtile/domain/h;->h(Lcom/whoop/recommendationtile/domain/h;)Ltr2/n;

    move-result-object v2

    new-instance v4, Lcom/whoop/recommendationtile/domain/h$b$a;

    iget-object v3, p0, Lcom/whoop/recommendationtile/domain/h$b;->F:Lcom/whoop/recommendationtile/domain/h;

    iget-object v6, p0, Lcom/whoop/recommendationtile/domain/h$b;->G:Lcom/whoop/whoopaction/domain/models/UpdateAction;

    invoke-direct {v4, v3, v6, v12}, Lcom/whoop/recommendationtile/domain/h$b$a;-><init>(Lcom/whoop/recommendationtile/domain/h;Lcom/whoop/whoopaction/domain/models/UpdateAction;Lq83/d;)V

    iput-object v8, p0, Lcom/whoop/recommendationtile/domain/h$b;->E:Ljava/lang/Object;

    iput v1, p0, Lcom/whoop/recommendationtile/domain/h$b;->z:I

    move-object v1, v2

    const/4 v2, 0x0

    const-string v3, "RecommendationTile commit failed"

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    goto/16 :goto_5

    :cond_6
    :goto_2
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/whoop/recommendationtile/domain/h$b;->F:Lcom/whoop/recommendationtile/domain/h;

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/whoop/recommendationtile/domain/h;->i(Lcom/whoop/recommendationtile/domain/h;Ljava/lang/String;)Lcom/whoop/recommendationtile/domain/RecommendationTileCommitResponse;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/whoop/recommendationtile/domain/RecommendationTileCommitResponse;->getItem()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    if-eqz v1, :cond_7

    iget-object v2, p0, Lcom/whoop/recommendationtile/domain/h$b;->F:Lcom/whoop/recommendationtile/domain/h;

    invoke-static {v2}, Lcom/whoop/recommendationtile/domain/h;->g(Lcom/whoop/recommendationtile/domain/h;)Ljb1/a;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    instance-of v2, v1, Lh31/q;

    if-eqz v2, :cond_7

    check-cast v1, Lh31/q;

    goto :goto_3

    :cond_7
    move-object v1, v12

    :goto_3
    iget-object v2, p0, Lcom/whoop/recommendationtile/domain/h$b;->F:Lcom/whoop/recommendationtile/domain/h;

    iget-object v3, p0, Lcom/whoop/recommendationtile/domain/h$b;->G:Lcom/whoop/whoopaction/domain/models/UpdateAction;

    invoke-static {v2, v3}, Lcom/whoop/recommendationtile/domain/h;->e(Lcom/whoop/recommendationtile/domain/h;Lcom/whoop/whoopaction/domain/models/UpdateAction;)Lcom/whoop/navigation/e;

    move-result-object v2

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/whoop/recommendationtile/domain/RecommendationTileCommitResponse;->getFollowupMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    if-eqz v1, :cond_8

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_4

    :cond_8
    move-object v0, v12

    :goto_4
    new-instance v3, Lcom/whoop/recommendationtile/domain/h$a$b;

    invoke-direct {v3, v1, v2, v0}, Lcom/whoop/recommendationtile/domain/h$a$b;-><init>(Lh31/q;Lcom/whoop/navigation/e;Ljava/lang/String;)V

    iput-object v12, p0, Lcom/whoop/recommendationtile/domain/h$b;->E:Ljava/lang/Object;

    iput-object v12, p0, Lcom/whoop/recommendationtile/domain/h$b;->w:Ljava/lang/Object;

    iput-object v12, p0, Lcom/whoop/recommendationtile/domain/h$b;->x:Ljava/lang/Object;

    iput-object v12, p0, Lcom/whoop/recommendationtile/domain/h$b;->y:Ljava/lang/Object;

    iput v11, p0, Lcom/whoop/recommendationtile/domain/h$b;->z:I

    invoke-interface {v8, v3, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_a

    goto :goto_5

    :cond_9
    instance-of v0, v0, Lu02/a$b;

    if-eqz v0, :cond_b

    sget-object v0, Lcom/whoop/recommendationtile/domain/h$a$a;->a:Lcom/whoop/recommendationtile/domain/h$a$a;

    iput-object v12, p0, Lcom/whoop/recommendationtile/domain/h$b;->E:Ljava/lang/Object;

    iput-object v12, p0, Lcom/whoop/recommendationtile/domain/h$b;->w:Ljava/lang/Object;

    iput v10, p0, Lcom/whoop/recommendationtile/domain/h$b;->z:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_a

    :goto_5
    return-object v9

    :cond_a
    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
