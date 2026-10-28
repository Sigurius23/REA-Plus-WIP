.class final Lcom/whoop/recommendationtile/domain/h$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/recommendationtile/domain/h;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lcom/whoop/recommendationtile/domain/c;",
        "state",
        "Lcom/whoop/recommendationtile/domain/h$a;",
        "result",
        "<anonymous>",
        "(Lcom/whoop/recommendationtile/domain/c;Lcom/whoop/recommendationtile/domain/h$a;)Lcom/whoop/recommendationtile/domain/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.recommendationtile.domain.RecommendationTileInteractor$interact$2"
    f = "RecommendationTileInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/recommendationtile/domain/h;


# direct methods
.method public constructor <init>(Lcom/whoop/recommendationtile/domain/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/recommendationtile/domain/h;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/recommendationtile/domain/h$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/recommendationtile/domain/h$d;->z:Lcom/whoop/recommendationtile/domain/h;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lcom/whoop/recommendationtile/domain/c;Lcom/whoop/recommendationtile/domain/h$a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/recommendationtile/domain/c;",
            "Lcom/whoop/recommendationtile/domain/h$a;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/recommendationtile/domain/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/recommendationtile/domain/h$d;

    iget-object v1, p0, Lcom/whoop/recommendationtile/domain/h$d;->z:Lcom/whoop/recommendationtile/domain/h;

    invoke-direct {v0, v1, p3}, Lcom/whoop/recommendationtile/domain/h$d;-><init>(Lcom/whoop/recommendationtile/domain/h;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/recommendationtile/domain/h$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/recommendationtile/domain/h$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/recommendationtile/domain/h$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/recommendationtile/domain/c;

    check-cast p2, Lcom/whoop/recommendationtile/domain/h$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/recommendationtile/domain/h$d;->f(Lcom/whoop/recommendationtile/domain/c;Lcom/whoop/recommendationtile/domain/h$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/recommendationtile/domain/h$d;->x:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lcom/whoop/recommendationtile/domain/c;

    iget-object v1, v0, Lcom/whoop/recommendationtile/domain/h$d;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/recommendationtile/domain/h$a;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lcom/whoop/recommendationtile/domain/h$d;->w:I

    if-nez v3, :cond_a

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v3, v1, Lcom/whoop/recommendationtile/domain/h$a$g;

    if-eqz v3, :cond_1

    check-cast v1, Lcom/whoop/recommendationtile/domain/h$a$g;

    invoke-virtual {v1}, Lcom/whoop/recommendationtile/domain/h$a$g;->a()Lh31/q;

    move-result-object v3

    invoke-virtual {v3}, Lh31/q;->f()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_0

    invoke-virtual {v1}, Lcom/whoop/recommendationtile/domain/h$a$g;->a()Lh31/q;

    move-result-object v3

    invoke-virtual {v3}, Lh31/q;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/whoop/recommendationtile/domain/c;->i()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v15, 0xffb

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v2 .. v16}, Lcom/whoop/recommendationtile/domain/c;->b(Lcom/whoop/recommendationtile/domain/c;Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;ZZLm91/u;Ljava/util/List;Lh31/g;ZZLh31/b;Lcom/whoop/navigation/e;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/recommendationtile/domain/c;

    move-result-object v1

    return-object v1

    :cond_0
    iget-object v3, v0, Lcom/whoop/recommendationtile/domain/h$d;->z:Lcom/whoop/recommendationtile/domain/h;

    invoke-virtual {v1}, Lcom/whoop/recommendationtile/domain/h$a$g;->a()Lh31/q;

    move-result-object v1

    invoke-static {v3, v2, v1}, Lcom/whoop/recommendationtile/domain/h;->c(Lcom/whoop/recommendationtile/domain/h;Lcom/whoop/recommendationtile/domain/c;Lh31/q;)Lcom/whoop/recommendationtile/domain/c;

    move-result-object v4

    const/16 v17, 0x7ff

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v4 .. v18}, Lcom/whoop/recommendationtile/domain/c;->b(Lcom/whoop/recommendationtile/domain/c;Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;ZZLm91/u;Ljava/util/List;Lh31/g;ZZLh31/b;Lcom/whoop/navigation/e;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/recommendationtile/domain/c;

    move-result-object v1

    return-object v1

    :cond_1
    instance-of v3, v1, Lcom/whoop/recommendationtile/domain/h$a$c;

    if-eqz v3, :cond_2

    const/16 v15, 0xff3

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v2 .. v16}, Lcom/whoop/recommendationtile/domain/c;->b(Lcom/whoop/recommendationtile/domain/c;Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;ZZLm91/u;Ljava/util/List;Lh31/g;ZZLh31/b;Lcom/whoop/navigation/e;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/recommendationtile/domain/c;

    move-result-object v1

    return-object v1

    :cond_2
    instance-of v3, v1, Lcom/whoop/recommendationtile/domain/h$a$b;

    if-eqz v3, :cond_5

    check-cast v1, Lcom/whoop/recommendationtile/domain/h$a$b;

    invoke-virtual {v1}, Lcom/whoop/recommendationtile/domain/h$a$b;->c()Lh31/q;

    move-result-object v3

    if-eqz v3, :cond_4

    iget-object v4, v0, Lcom/whoop/recommendationtile/domain/h$d;->z:Lcom/whoop/recommendationtile/domain/h;

    invoke-static {v4, v2, v3}, Lcom/whoop/recommendationtile/domain/h;->c(Lcom/whoop/recommendationtile/domain/h;Lcom/whoop/recommendationtile/domain/c;Lh31/q;)Lcom/whoop/recommendationtile/domain/c;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    move-object v4, v3

    goto :goto_2

    :cond_4
    :goto_1
    const/16 v15, 0xff3

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v2 .. v16}, Lcom/whoop/recommendationtile/domain/c;->b(Lcom/whoop/recommendationtile/domain/c;Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;ZZLm91/u;Ljava/util/List;Lh31/g;ZZLh31/b;Lcom/whoop/navigation/e;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/recommendationtile/domain/c;

    move-result-object v3

    goto :goto_0

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/recommendationtile/domain/h$a$b;->a()Lcom/whoop/navigation/e;

    move-result-object v15

    invoke-virtual {v1}, Lcom/whoop/recommendationtile/domain/h$a$b;->b()Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x3ff

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v4 .. v18}, Lcom/whoop/recommendationtile/domain/c;->b(Lcom/whoop/recommendationtile/domain/c;Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;ZZLm91/u;Ljava/util/List;Lh31/g;ZZLh31/b;Lcom/whoop/navigation/e;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/recommendationtile/domain/c;

    move-result-object v1

    return-object v1

    :cond_5
    instance-of v3, v1, Lcom/whoop/recommendationtile/domain/h$a$a;

    if-eqz v3, :cond_6

    const/16 v15, 0xff3

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v2 .. v16}, Lcom/whoop/recommendationtile/domain/c;->b(Lcom/whoop/recommendationtile/domain/c;Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;ZZLm91/u;Ljava/util/List;Lh31/g;ZZLh31/b;Lcom/whoop/navigation/e;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/recommendationtile/domain/c;

    move-result-object v1

    return-object v1

    :cond_6
    instance-of v3, v1, Lcom/whoop/recommendationtile/domain/h$a$e;

    if-eqz v3, :cond_7

    const/16 v15, 0xff7

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v2 .. v16}, Lcom/whoop/recommendationtile/domain/c;->b(Lcom/whoop/recommendationtile/domain/c;Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;ZZLm91/u;Ljava/util/List;Lh31/g;ZZLh31/b;Lcom/whoop/navigation/e;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/recommendationtile/domain/c;

    move-result-object v1

    return-object v1

    :cond_7
    instance-of v3, v1, Lcom/whoop/recommendationtile/domain/h$a$d;

    if-eqz v3, :cond_8

    const/16 v15, 0xbff

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v2 .. v16}, Lcom/whoop/recommendationtile/domain/c;->b(Lcom/whoop/recommendationtile/domain/c;Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;ZZLm91/u;Ljava/util/List;Lh31/g;ZZLh31/b;Lcom/whoop/navigation/e;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/recommendationtile/domain/c;

    move-result-object v1

    return-object v1

    :cond_8
    instance-of v1, v1, Lcom/whoop/recommendationtile/domain/h$a$f;

    if-eqz v1, :cond_9

    const/16 v15, 0x7ff

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v2 .. v16}, Lcom/whoop/recommendationtile/domain/c;->b(Lcom/whoop/recommendationtile/domain/c;Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;ZZLm91/u;Ljava/util/List;Lh31/g;ZZLh31/b;Lcom/whoop/navigation/e;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/recommendationtile/domain/c;

    move-result-object v1

    return-object v1

    :cond_9
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_a
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
