.class final Lcom/whoop/archv2/feature/domain/g$n0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/archv2/feature/domain/g;->F(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/ApiRequest;ZLc93/m;)Lec3/l;
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
        "Lcom/whoop/archv2/feature/domain/i;",
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
    c = "com.whoop.archv2.feature.domain.GenericInteractor$performActionCore$1$5"
    f = "GenericInteractor.kt"
    l = {
        0x1a4,
        0x1a7
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lqw2/b;


# direct methods
.method public constructor <init>(Lqw2/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqw2/b;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/archv2/feature/domain/g$n0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/g$n0;->y:Lqw2/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Lcom/whoop/archv2/feature/domain/g$n0;

    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/g$n0;->y:Lqw2/b;

    invoke-direct {v0, v1, p2}, Lcom/whoop/archv2/feature/domain/g$n0;-><init>(Lqw2/b;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/archv2/feature/domain/g$n0;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/archv2/feature/domain/g$n0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/archv2/feature/domain/g$n0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/archv2/feature/domain/g$n0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/archv2/feature/domain/g$n0;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/g$n0;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/archv2/feature/domain/g$n0;->w:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

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

    new-instance p1, Lcom/whoop/archv2/feature/domain/i$i;

    iget-object v2, p0, Lcom/whoop/archv2/feature/domain/g$n0;->y:Lqw2/b;

    check-cast v2, Lqw2/b$l;

    invoke-virtual {v2}, Lqw2/b$l;->b()Ljava/util/Set;

    move-result-object v2

    invoke-direct {p1, v2}, Lcom/whoop/archv2/feature/domain/i$i;-><init>(Ljava/util/Set;)V

    iput-object v0, p0, Lcom/whoop/archv2/feature/domain/g$n0;->x:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/archv2/feature/domain/g$n0;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/whoop/archv2/feature/domain/g$n0;->y:Lqw2/b;

    check-cast p1, Lqw2/b$l;

    invoke-virtual {p1}, Lqw2/b$l;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    instance-of v2, p1, Lcom/whoop/whoopaction/domain/models/StateClearAction;

    const/4 v5, 0x0

    if-eqz v2, :cond_4

    check-cast p1, Lcom/whoop/whoopaction/domain/models/StateClearAction;

    goto :goto_1

    :cond_4
    move-object p1, v5

    :goto_1
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/StateClearAction;->getDismissModal()Z

    move-result p1

    if-ne p1, v4, :cond_5

    new-instance p1, Lcom/whoop/archv2/feature/domain/i$c;

    sget-object v2, Lcom/whoop/archv2/feature/domain/c$c;->a:Lcom/whoop/archv2/feature/domain/c$c;

    invoke-direct {p1, v2}, Lcom/whoop/archv2/feature/domain/i$c;-><init>(Lcom/whoop/archv2/feature/domain/c;)V

    iput-object v5, p0, Lcom/whoop/archv2/feature/domain/g$n0;->x:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/archv2/feature/domain/g$n0;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
