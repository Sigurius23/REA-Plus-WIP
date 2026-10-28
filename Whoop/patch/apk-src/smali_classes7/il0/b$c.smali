.class final Lil0/b$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lil0/b;->interact(Lec3/l;)Lec3/l;
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
        "Lil0/c;",
        "prevResult",
        "Lil0/d;",
        "action",
        "<anonymous>",
        "(Lil0/c;Lil0/d;)Lil0/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.bot.domain.history.AiConversationHistoryInteractor$interact$2"
    f = "AiConversationHistoryInteractor.kt"
    l = {
        0x28
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lil0/b;


# direct methods
.method public constructor <init>(Lil0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lil0/b;",
            "Lq83/d<",
            "-",
            "Lil0/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lil0/b$c;->z:Lil0/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lil0/c;Lil0/d;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lil0/c;",
            "Lil0/d;",
            "Lq83/d<",
            "-",
            "Lil0/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lil0/b$c;

    iget-object v1, p0, Lil0/b$c;->z:Lil0/b;

    invoke-direct {v0, v1, p3}, Lil0/b$c;-><init>(Lil0/b;Lq83/d;)V

    iput-object p1, v0, Lil0/b$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lil0/b$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lil0/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lil0/c;

    check-cast p2, Lil0/d;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lil0/b$c;->f(Lil0/c;Lil0/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lil0/b$c;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lil0/c;

    iget-object v0, p0, Lil0/b$c;->y:Ljava/lang/Object;

    check-cast v0, Lil0/d;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lil0/b$c;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lil0/d$b;->a:Lil0/d$b;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lil0/c;->b(Lil0/c;ZZLcom/whoop/bot/models/history/ConversationHistory;ILjava/lang/Object;)Lil0/c;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object p1, Lil0/d$d;->a:Lil0/d$d;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lil0/c;->b(Lil0/c;ZZLcom/whoop/bot/models/history/ConversationHistory;ILjava/lang/Object;)Lil0/c;

    move-result-object p1

    return-object p1

    :cond_3
    sget-object p1, Lil0/d$c;->a:Lil0/d$c;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object v5, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Lil0/b$c;->z:Lil0/b;

    invoke-static {p1}, Lil0/b;->e(Lil0/b;)Ltr2/n;

    move-result-object v6

    new-instance v9, Lil0/b$c$a;

    iget-object p1, p0, Lil0/b$c;->z:Lil0/b;

    const/4 v0, 0x0

    invoke-direct {v9, p1, v0}, Lil0/b$c$a;-><init>(Lil0/b;Lq83/d;)V

    iput-object v0, p0, Lil0/b$c;->x:Ljava/lang/Object;

    iput-object v0, p0, Lil0/b$c;->y:Ljava/lang/Object;

    iput v4, p0, Lil0/b$c;->w:I

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v10, p0

    invoke-static/range {v5 .. v12}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    return-object v2

    :cond_4
    :goto_0
    iget-object v0, v10, Lil0/b$c;->z:Lil0/b;

    check-cast p1, Lu02/a;

    instance-of v1, p1, Lu02/a$b;

    if-eqz v1, :cond_5

    invoke-static {v0}, Lil0/b;->c(Lil0/b;)Lxk0/a;

    move-result-object v0

    check-cast p1, Lu02/a$b;

    const-string v1, "get_history"

    invoke-virtual {v0, p1, v1}, Lxk0/a;->L(Lu02/a$b;Ljava/lang/String;)V

    new-instance v2, Lil0/c;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lil0/c;-><init>(ZZLcom/whoop/bot/models/history/ConversationHistory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_5
    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_6

    new-instance v1, Lil0/c;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/whoop/bot/models/history/ConversationHistory;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Lil0/c;-><init>(ZZLcom/whoop/bot/models/history/ConversationHistory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    move-object v10, p0

    instance-of p1, v0, Lil0/d$a;

    if-eqz p1, :cond_8

    new-instance v0, Lil0/c;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lil0/c;-><init>(ZZLcom/whoop/bot/models/history/ConversationHistory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
