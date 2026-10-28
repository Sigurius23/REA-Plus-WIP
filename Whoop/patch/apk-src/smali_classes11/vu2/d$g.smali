.class final Lvu2/d$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvu2/d;->q(Lcom/whoop/whoopaction/domain/models/Action;)Lec3/l;
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
        "Lvu2/f;",
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
    c = "com.whoop.weightlifting.feature.builder.details.domain.ExerciseDetailsV2Interactor$perform1RMInternalActions$1"
    f = "ExerciseDetailsV2Interactor.kt"
    l = {
        0x5e,
        0x5f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lvu2/d;

.field final synthetic z:Lcom/whoop/whoopaction/domain/models/Action;


# direct methods
.method public constructor <init>(Lvu2/d;Lcom/whoop/whoopaction/domain/models/Action;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvu2/d;",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Lq83/d<",
            "-",
            "Lvu2/d$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvu2/d$g;->y:Lvu2/d;

    iput-object p2, p0, Lvu2/d$g;->z:Lcom/whoop/whoopaction/domain/models/Action;

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

    new-instance v0, Lvu2/d$g;

    iget-object v1, p0, Lvu2/d$g;->y:Lvu2/d;

    iget-object v2, p0, Lvu2/d$g;->z:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-direct {v0, v1, v2, p2}, Lvu2/d$g;-><init>(Lvu2/d;Lcom/whoop/whoopaction/domain/models/Action;Lq83/d;)V

    iput-object p1, v0, Lvu2/d$g;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lvu2/d$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvu2/d$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvu2/d$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvu2/d$g;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lvu2/d$g;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lvu2/d$g;->w:I

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

    sget-object p1, Lvu2/f$h;->a:Lvu2/f$h;

    iput-object v0, p0, Lvu2/d$g;->x:Ljava/lang/Object;

    iput v4, p0, Lvu2/d$g;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lvu2/d$g;->y:Lvu2/d;

    invoke-static {p1}, Lvu2/d;->e(Lvu2/d;)Lqw2/c;

    move-result-object p1

    new-instance v2, Lqw2/f;

    iget-object v4, p0, Lvu2/d$g;->z:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-direct {v2, v4}, Lqw2/f;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    new-instance v4, La6/u;

    const/4 v5, 0x1

    invoke-direct {v4, v2, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v4}, Lqw2/c;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v2, Lvu2/d$g$a;

    iget-object v4, p0, Lvu2/d$g;->y:Lvu2/d;

    invoke-direct {v2, v4, v0}, Lvu2/d$g$a;-><init>(Lvu2/d;Lec3/m;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lvu2/d$g;->x:Ljava/lang/Object;

    iput v3, p0, Lvu2/d$g;->w:I

    invoke-interface {p1, v2, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
