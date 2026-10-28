.class final Lqw2/c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqw2/c;->k(Ljava/util/List;)Lec3/l;
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
    c = "com.whoop.whoopaction.domain.ActionInteractor$dispatchSequentially$1"
    f = "ActionInteractor.kt"
    l = {
        0x97,
        0x9a,
        0x9d,
        0xa9,
        0xab
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;

.field final synthetic F:Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;

.field final synthetic G:Lqw2/c;

.field final synthetic H:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;",
            ">;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;Lqw2/c;Ljava/util/List;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;",
            "Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;",
            "Lqw2/c;",
            "Ljava/util/List<",
            "Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;",
            ">;",
            "Lq83/d<",
            "-",
            "Lqw2/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqw2/c$b;->E:Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;

    iput-object p2, p0, Lqw2/c$b;->F:Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;

    iput-object p3, p0, Lqw2/c$b;->G:Lqw2/c;

    iput-object p4, p0, Lqw2/c$b;->H:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lqw2/c$b;

    iget-object v1, p0, Lqw2/c$b;->E:Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;

    iget-object v2, p0, Lqw2/c$b;->F:Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;

    iget-object v3, p0, Lqw2/c$b;->G:Lqw2/c;

    iget-object v4, p0, Lqw2/c$b;->H:Ljava/util/List;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lqw2/c$b;-><init>(Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;Lqw2/c;Ljava/util/List;Lq83/d;)V

    iput-object p1, v0, Lqw2/c$b;->z:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lqw2/c$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lqw2/c$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lqw2/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lqw2/c$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lqw2/c$b;->z:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lqw2/c$b;->y:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lqw2/c$b;->x:Ljava/lang/Object;

    check-cast v0, Lqw2/b;

    iget-object v0, p0, Lqw2/c$b;->w:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    iget-object v2, p0, Lqw2/c$b;->w:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lqw2/c$b;->E:Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->getShowLoading()Z

    move-result p1

    if-ne p1, v7, :cond_6

    new-instance p1, Lqw2/b$c;

    iget-object v2, p0, Lqw2/c$b;->F:Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;

    invoke-virtual {v2}, Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v2

    iget-object v8, p0, Lqw2/c$b;->E:Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;

    invoke-virtual {v8}, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->getLoadingTreatment()Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    move-result-object v8

    invoke-direct {p1, v2, v8}, Lqw2/b$c;-><init>(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/whoopaction/domain/models/LoadingTreatment;)V

    iput-object v0, p0, Lqw2/c$b;->z:Ljava/lang/Object;

    iput v7, p0, Lqw2/c$b;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto/16 :goto_4

    :cond_6
    :goto_1
    iget-object p1, p0, Lqw2/c$b;->E:Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->getShowSaving()Z

    move-result p1

    if-ne p1, v7, :cond_7

    new-instance p1, Lqw2/b$i;

    iget-object v2, p0, Lqw2/c$b;->F:Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;

    invoke-virtual {v2}, Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v2

    invoke-direct {p1, v2}, Lqw2/b$i;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    iput-object v0, p0, Lqw2/c$b;->z:Ljava/lang/Object;

    iput v6, p0, Lqw2/c$b;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_4

    :cond_7
    :goto_2
    new-instance v2, Lkotlin/jvm/internal/g0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object p1, p0, Lqw2/c$b;->G:Lqw2/c;

    iget-object v6, p0, Lqw2/c$b;->F:Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;

    invoke-virtual {v6}, Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v6

    invoke-static {p1, v6}, Lqw2/c;->d(Lqw2/c;Lcom/whoop/whoopaction/domain/models/Action;)Lec3/l;

    move-result-object p1

    new-instance v6, Lqw2/c$b$a;

    iget-object v7, p0, Lqw2/c$b;->G:Lqw2/c;

    iget-object v8, p0, Lqw2/c$b;->F:Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;

    invoke-direct {v6, v2, v7, v8, v0}, Lqw2/c$b$a;-><init>(Lkotlin/jvm/internal/g0;Lqw2/c;Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;Lec3/m;)V

    iput-object v0, p0, Lqw2/c$b;->z:Ljava/lang/Object;

    iput-object v2, p0, Lqw2/c$b;->w:Ljava/lang/Object;

    iput v5, p0, Lqw2/c$b;->y:I

    invoke-interface {p1, v6, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_4

    :cond_8
    :goto_3
    iget-object p1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p1, Lqw2/b;

    const/4 v2, 0x0

    if-nez p1, :cond_9

    iget-object p1, p0, Lqw2/c$b;->G:Lqw2/c;

    iget-object v3, p0, Lqw2/c$b;->H:Ljava/util/List;

    invoke-static {p1, v3}, Lqw2/c;->c(Lqw2/c;Ljava/util/List;)Lec3/l;

    move-result-object p1

    iput-object v2, p0, Lqw2/c$b;->z:Ljava/lang/Object;

    iput-object v2, p0, Lqw2/c$b;->w:Ljava/lang/Object;

    iput-object v2, p0, Lqw2/c$b;->x:Ljava/lang/Object;

    iput v4, p0, Lqw2/c$b;->y:I

    invoke-static {v0, p1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_4

    :cond_9
    iget-object v4, p0, Lqw2/c$b;->G:Lqw2/c;

    iget-object v5, p0, Lqw2/c$b;->F:Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;

    iget-object v6, p0, Lqw2/c$b;->H:Ljava/util/List;

    invoke-static {v4, p1, v5, v6}, Lqw2/c;->j(Lqw2/c;Lqw2/b;Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;Ljava/util/List;)Lec3/l;

    move-result-object p1

    iput-object v2, p0, Lqw2/c$b;->z:Ljava/lang/Object;

    iput-object v2, p0, Lqw2/c$b;->w:Ljava/lang/Object;

    iput-object v2, p0, Lqw2/c$b;->x:Ljava/lang/Object;

    iput v3, p0, Lqw2/c$b;->y:I

    invoke-static {v0, p1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_4
    return-object v1

    :cond_a
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
