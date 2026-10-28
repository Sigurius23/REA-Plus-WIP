.class final Lgl0/a$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgl0/a;->interact(Lec3/l;)Lec3/l;
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
        "Lgl0/d;",
        "previousResult",
        "Lgl0/c;",
        "action",
        "<anonymous>",
        "(Lgl0/d;Lgl0/c;)Lgl0/d;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.bot.domain.educationhub.AiEducationHubInteractor$interact$2"
    f = "AiEducationHubInteractor.kt"
    l = {
        0x33,
        0x3c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lgl0/a;

.field w:Z

.field x:I

.field synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgl0/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgl0/a;",
            "Lq83/d<",
            "-",
            "Lgl0/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lgl0/a$c;->E:Lgl0/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lgl0/d;Lgl0/c;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgl0/d;",
            "Lgl0/c;",
            "Lq83/d<",
            "-",
            "Lgl0/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lgl0/a$c;

    iget-object v1, p0, Lgl0/a$c;->E:Lgl0/a;

    invoke-direct {v0, v1, p3}, Lgl0/a$c;-><init>(Lgl0/a;Lq83/d;)V

    iput-object p1, v0, Lgl0/a$c;->y:Ljava/lang/Object;

    iput-object p2, v0, Lgl0/a$c;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lgl0/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgl0/d;

    check-cast p2, Lgl0/c;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lgl0/a$c;->f(Lgl0/d;Lgl0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lgl0/a$c;->y:Ljava/lang/Object;

    check-cast v0, Lgl0/d;

    iget-object v1, p0, Lgl0/a$c;->z:Ljava/lang/Object;

    check-cast v1, Lgl0/c;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lgl0/a$c;->x:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lgl0/a$c;->E:Lgl0/a;

    invoke-static {p1}, Lgl0/a;->d(Lgl0/a;)Lq83/j;

    move-result-object p1

    new-instance v3, Lgl0/a$c$b;

    iget-object v7, p0, Lgl0/a$c;->E:Lgl0/a;

    invoke-direct {v3, v7, v6}, Lgl0/a$c$b;-><init>(Lgl0/a;Lq83/d;)V

    iput-object v0, p0, Lgl0/a$c;->y:Ljava/lang/Object;

    iput-object v1, p0, Lgl0/a$c;->z:Ljava/lang/Object;

    iput v5, p0, Lgl0/a$c;->x:I

    invoke-static {p1, v3, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    instance-of v3, v1, Lgl0/c$a;

    if-eqz v3, :cond_4

    new-instance v0, Lgl0/d;

    check-cast v1, Lgl0/c$a;

    invoke-virtual {v1}, Lgl0/c$a;->a()Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lgl0/d;-><init>(Lcom/whoop/design/models/items/ArticleTileCarouselModel;Z)V

    return-object v0

    :cond_4
    sget-object v3, Lgl0/c$b;->a:Lgl0/c$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    return-object v0

    :cond_5
    instance-of v1, v1, Lgl0/c$c;

    if-eqz v1, :cond_7

    iget-object v1, p0, Lgl0/a$c;->E:Lgl0/a;

    invoke-static {v1}, Lgl0/a;->d(Lgl0/a;)Lq83/j;

    move-result-object v1

    new-instance v3, Lgl0/a$c$a;

    iget-object v7, p0, Lgl0/a$c;->E:Lgl0/a;

    invoke-direct {v3, v7, v0, v6}, Lgl0/a$c$a;-><init>(Lgl0/a;Lgl0/d;Lq83/d;)V

    iput-object v0, p0, Lgl0/a$c;->y:Ljava/lang/Object;

    iput-object v6, p0, Lgl0/a$c;->z:Ljava/lang/Object;

    iput-boolean p1, p0, Lgl0/a$c;->w:Z

    iput v4, p0, Lgl0/a$c;->x:I

    invoke-static {v1, v3, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_6

    :goto_1
    return-object v2

    :cond_6
    :goto_2
    invoke-virtual {v0}, Lgl0/d;->d()Z

    move-result p1

    xor-int/2addr p1, v5

    invoke-static {v0, v6, p1, v5, v6}, Lgl0/d;->b(Lgl0/d;Lcom/whoop/design/models/items/ArticleTileCarouselModel;ZILjava/lang/Object;)Lgl0/d;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
