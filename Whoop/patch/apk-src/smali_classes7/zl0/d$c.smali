.class final Lzl0/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzl0/d;->interact(Lec3/l;)Lec3/l;
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
        "Lzl0/c;",
        "state",
        "Lzl0/d$a;",
        "action",
        "<anonymous>",
        "(Lzl0/c;Lzl0/d$a;)Lzl0/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.bot.view.selectionwidget.SelectionWidgetInteractor$interact$2"
    f = "SelectionWidgetInteractor.kt"
    l = {
        0x34
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lzl0/d;


# direct methods
.method public constructor <init>(Lzl0/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzl0/d;",
            "Lq83/d<",
            "-",
            "Lzl0/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzl0/d$c;->z:Lzl0/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lzl0/c;Lzl0/d$a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzl0/c;",
            "Lzl0/d$a;",
            "Lq83/d<",
            "-",
            "Lzl0/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lzl0/d$c;

    iget-object v1, p0, Lzl0/d$c;->z:Lzl0/d;

    invoke-direct {v0, v1, p3}, Lzl0/d$c;-><init>(Lzl0/d;Lq83/d;)V

    iput-object p1, v0, Lzl0/d$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lzl0/d$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lzl0/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzl0/c;

    check-cast p2, Lzl0/d$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lzl0/d$c;->f(Lzl0/c;Lzl0/d$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lzl0/d$c;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lzl0/c;

    iget-object v0, p0, Lzl0/d$c;->y:Ljava/lang/Object;

    check-cast v0, Lzl0/d$a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lzl0/d$c;->w:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p0

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lzl0/d$a$d;

    if-eqz p1, :cond_3

    check-cast v0, Lzl0/d$a$d;

    invoke-virtual {v0}, Lzl0/d$a$d;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Lzl0/c;->g()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0}, Lzl0/d$a$d;->b()I

    move-result v0

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v0}, Ljava/lang/Integer;-><init>(I)V

    invoke-static {v2, p1}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    :goto_0
    move-object v2, p1

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lzl0/c;->g()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {v0}, Lzl0/d$a$d;->b()I

    move-result v0

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v0}, Ljava/lang/Integer;-><init>(I)V

    invoke-static {p1, v2}, Lm83/s;->b1(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    goto :goto_0

    :goto_1
    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lzl0/c;->b(Lzl0/c;Ljava/util/List;Ljava/util/List;Lzl0/a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lzl0/c;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, v0, Lzl0/d$a$c;

    if-eqz p1, :cond_5

    invoke-virtual {v1}, Lzl0/c;->g()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v1}, Lzl0/c;->c()Ljava/util/List;

    move-result-object p1

    :cond_4
    move-object v2, p1

    check-cast v2, Ljava/util/List;

    sget-object v4, Lzl0/a$c;->a:Lzl0/a$c;

    const/16 v7, 0x1a

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lzl0/c;->b(Lzl0/c;Ljava/util/List;Ljava/util/List;Lzl0/a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lzl0/c;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of p1, v0, Lzl0/d$a$b;

    if-eqz p1, :cond_a

    sget-object v6, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Lzl0/d$c;->z:Lzl0/d;

    invoke-static {p1}, Lzl0/d;->d(Lzl0/d;)Ltr2/n;

    move-result-object v7

    new-instance v10, Lzl0/d$c$a;

    iget-object p1, p0, Lzl0/d$c;->z:Lzl0/d;

    invoke-direct {v10, p1, v1, v5}, Lzl0/d$c$a;-><init>(Lzl0/d;Lzl0/c;Lq83/d;)V

    iput-object v1, p0, Lzl0/d$c;->x:Ljava/lang/Object;

    iput-object v5, p0, Lzl0/d$c;->y:Ljava/lang/Object;

    iput v4, p0, Lzl0/d$c;->w:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x6

    const/4 v13, 0x0

    move-object v11, p0

    invoke-static/range {v6 .. v13}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_6

    return-object v2

    :cond_6
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_8

    sget-object v4, Lzl0/a$d;->a:Lzl0/a$d;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpg3/v0;

    iget-object p1, p1, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/bot/domain/chatminiarchwidget/CommitSelectionResponse;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/whoop/bot/domain/chatminiarchwidget/CommitSelectionResponse;->getFollowupMessage()Ljava/lang/String;

    move-result-object v5

    :cond_7
    const/16 v7, 0x13

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lzl0/c;->b(Lzl0/c;Ljava/util/List;Ljava/util/List;Lzl0/a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lzl0/c;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of v0, p1, Lu02/a$b;

    if-eqz v0, :cond_9

    iget-object v0, v11, Lzl0/d$c;->z:Lzl0/d;

    invoke-static {v0}, Lzl0/d;->d(Lzl0/d;)Ltr2/n;

    move-result-object v0

    invoke-virtual {v1}, Lzl0/c;->g()Ljava/util/List;

    move-result-object v2

    check-cast p1, Lu02/a$b;

    invoke-virtual {p1}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Commit failed. SelectionIds: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ". "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "CMAW"

    invoke-interface {v0, v3, p1, v2}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v4, Lzl0/a$a;->a:Lzl0/a$a;

    const/16 v7, 0x1b

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lzl0/c;->b(Lzl0/c;Ljava/util/List;Ljava/util/List;Lzl0/a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lzl0/c;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_a
    move-object v11, p0

    instance-of p1, v0, Lzl0/d$a$a;

    if-eqz p1, :cond_b

    const/16 v7, 0x17

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lzl0/c;->b(Lzl0/c;Ljava/util/List;Ljava/util/List;Lzl0/a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lzl0/c;

    move-result-object p1

    return-object p1

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
