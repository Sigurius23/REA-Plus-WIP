.class final Lrw2/e$a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrw2/e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lqw2/b;",
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
    c = "com.whoop.whoopaction.domain.handlers.RefreshScopeActionHandler$handleActions$1$1"
    f = "RefreshScopeActionHandler.kt"
    l = {
        0x1e,
        0x20
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:I

.field H:I

.field I:I

.field private synthetic J:Ljava/lang/Object;

.field final synthetic K:Lqw2/a;

.field final synthetic L:Lrw2/e;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lqw2/a;Lrw2/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqw2/a;",
            "Lrw2/e;",
            "Lq83/d<",
            "-",
            "Lrw2/e$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrw2/e$a$a;->K:Lqw2/a;

    iput-object p2, p0, Lrw2/e$a$a;->L:Lrw2/e;

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

    new-instance v0, Lrw2/e$a$a;

    iget-object v1, p0, Lrw2/e$a$a;->K:Lqw2/a;

    iget-object v2, p0, Lrw2/e$a$a;->L:Lrw2/e;

    invoke-direct {v0, v1, v2, p2}, Lrw2/e$a$a;-><init>(Lqw2/a;Lrw2/e;Lq83/d;)V

    iput-object p1, v0, Lrw2/e$a$a;->J:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lrw2/e$a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrw2/e$a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrw2/e$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lrw2/e$a$a;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lrw2/e$a$a;->J:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lrw2/e$a$a;->I:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v0, p0, Lrw2/e$a$a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whoopaction/domain/models/RefreshScopeAction;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v2, p0, Lrw2/e$a$a;->G:I

    iget-object v6, p0, Lrw2/e$a$a;->F:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v6, p0, Lrw2/e$a$a;->z:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, p0, Lrw2/e$a$a;->y:Ljava/lang/Object;

    check-cast v7, Lrw2/e;

    iget-object v8, p0, Lrw2/e$a$a;->x:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v8, p0, Lrw2/e$a$a;->w:Ljava/lang/Object;

    check-cast v8, Lcom/whoop/whoopaction/domain/models/RefreshScopeAction;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lrw2/e$a$a;->K:Lqw2/a;

    invoke-interface {p1}, Lqw2/a;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    const-string v2, "null cannot be cast to non-null type com.whoop.whoopaction.domain.models.RefreshScopeAction"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/whoop/whoopaction/domain/models/RefreshScopeAction;

    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/RefreshScopeAction;->getScopes()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    invoke-static {v8}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_3

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    iget-object v2, p0, Lrw2/e$a$a;->L:Lrw2/e;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move-object v8, p1

    move-object v7, v2

    move v2, v3

    :cond_5
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    const/4 v9, 0x0

    if-eqz p1, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {v7}, Lrw2/e;->c(Lrw2/e;)Lwm0/a;

    move-result-object v10

    iput-object v0, p0, Lrw2/e$a$a;->J:Ljava/lang/Object;

    iput-object v8, p0, Lrw2/e$a$a;->w:Ljava/lang/Object;

    iput-object v9, p0, Lrw2/e$a$a;->x:Ljava/lang/Object;

    iput-object v7, p0, Lrw2/e$a$a;->y:Ljava/lang/Object;

    iput-object v6, p0, Lrw2/e$a$a;->z:Ljava/lang/Object;

    iput-object v9, p0, Lrw2/e$a$a;->E:Ljava/lang/Object;

    iput-object v9, p0, Lrw2/e$a$a;->F:Ljava/lang/Object;

    iput v2, p0, Lrw2/e$a$a;->G:I

    iput v3, p0, Lrw2/e$a$a;->H:I

    iput v5, p0, Lrw2/e$a$a;->I:I

    invoke-virtual {v10, p1, p0}, Lwm0/a;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_6
    new-instance p1, Lqw2/b$n;

    invoke-direct {p1, v8}, Lqw2/b$n;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    iput-object v9, p0, Lrw2/e$a$a;->J:Ljava/lang/Object;

    iput-object v9, p0, Lrw2/e$a$a;->w:Ljava/lang/Object;

    iput-object v9, p0, Lrw2/e$a$a;->x:Ljava/lang/Object;

    iput-object v9, p0, Lrw2/e$a$a;->y:Ljava/lang/Object;

    iput-object v9, p0, Lrw2/e$a$a;->z:Ljava/lang/Object;

    iput-object v9, p0, Lrw2/e$a$a;->E:Ljava/lang/Object;

    iput-object v9, p0, Lrw2/e$a$a;->F:Ljava/lang/Object;

    iput v4, p0, Lrw2/e$a$a;->I:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
