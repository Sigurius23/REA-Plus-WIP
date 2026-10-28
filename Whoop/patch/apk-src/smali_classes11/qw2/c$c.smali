.class final Lqw2/c$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqw2/c;->p(Lqw2/b;Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;Ljava/util/List;)Lec3/l;
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
    c = "com.whoop.whoopaction.domain.ActionInteractor$handleSubActionResult$1"
    f = "ActionInteractor.kt"
    l = {
        0xd8,
        0xd9
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;",
            ">;"
        }
    .end annotation
.end field

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;

.field final synthetic z:Lqw2/c;


# direct methods
.method public constructor <init>(Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;Lqw2/c;Ljava/util/List;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;",
            "Lqw2/c;",
            "Ljava/util/List<",
            "Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;",
            ">;",
            "Lq83/d<",
            "-",
            "Lqw2/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqw2/c$c;->y:Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;

    iput-object p2, p0, Lqw2/c$c;->z:Lqw2/c;

    iput-object p3, p0, Lqw2/c$c;->E:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lqw2/c$c;

    iget-object v1, p0, Lqw2/c$c;->y:Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;

    iget-object v2, p0, Lqw2/c$c;->z:Lqw2/c;

    iget-object v3, p0, Lqw2/c$c;->E:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3, p2}, Lqw2/c$c;-><init>(Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;Lqw2/c;Ljava/util/List;Lq83/d;)V

    iput-object p1, v0, Lqw2/c$c;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lqw2/c$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lqw2/c$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lqw2/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lqw2/c$c;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lqw2/c$c;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lqw2/c$c;->w:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

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

    new-instance p1, Lqw2/b$n;

    iget-object v2, p0, Lqw2/c$c;->y:Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;

    invoke-virtual {v2}, Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v2

    invoke-direct {p1, v2}, Lqw2/b$n;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    iput-object v0, p0, Lqw2/c$c;->x:Ljava/lang/Object;

    iput v4, p0, Lqw2/c$c;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lqw2/c$c;->z:Lqw2/c;

    iget-object v2, p0, Lqw2/c$c;->E:Ljava/util/List;

    invoke-static {p1, v2}, Lqw2/c;->c(Lqw2/c;Ljava/util/List;)Lec3/l;

    move-result-object p1

    const/4 v2, 0x0

    iput-object v2, p0, Lqw2/c$c;->x:Ljava/lang/Object;

    iput v3, p0, Lqw2/c$c;->w:I

    invoke-static {v0, p1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
