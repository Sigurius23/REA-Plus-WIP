.class final Lqw2/c$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqw2/c;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lqw2/a;",
        "domainAction",
        "Lec3/l;",
        "Lqw2/b;",
        "<anonymous>",
        "(Lqw2/a;)Lec3/l;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whoopaction.domain.ActionInteractor$interact$sequenceResults$2"
    f = "ActionInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lqw2/c;


# direct methods
.method public constructor <init>(Lqw2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqw2/c;",
            "Lq83/d<",
            "-",
            "Lqw2/c$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqw2/c$f;->y:Lqw2/c;

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

    new-instance v0, Lqw2/c$f;

    iget-object v1, p0, Lqw2/c$f;->y:Lqw2/c;

    invoke-direct {v0, v1, p2}, Lqw2/c$f;-><init>(Lqw2/c;Lq83/d;)V

    iput-object p1, v0, Lqw2/c$f;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lqw2/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqw2/a;",
            "Lq83/d<",
            "-",
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lqw2/c$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lqw2/c$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lqw2/c$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lqw2/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lqw2/c$f;->f(Lqw2/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lqw2/c$f;->x:Ljava/lang/Object;

    check-cast v0, Lqw2/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lqw2/c$f;->w:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lqw2/c$f;->y:Lqw2/c;

    invoke-static {p1}, Lqw2/c;->i(Lqw2/c;)Lfy1/g;

    move-result-object p1

    invoke-interface {p1}, Lfy1/g;->a()J

    move-result-wide v1

    iget-object p1, p0, Lqw2/c$f;->y:Lqw2/c;

    invoke-interface {v0}, Lqw2/a;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    const-string v3, "null cannot be cast to non-null type com.whoop.whoopaction.domain.models.ActionSequenceAction"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/whoop/whoopaction/domain/models/ActionSequenceAction;

    invoke-virtual {v0}, Lcom/whoop/whoopaction/domain/models/ActionSequenceAction;->getActions()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Lqw2/c;->c(Lqw2/c;Ljava/util/List;)Lec3/l;

    move-result-object p1

    new-instance v0, Lqw2/c$f$a;

    iget-object v3, p0, Lqw2/c$f;->y:Lqw2/c;

    const/4 v4, 0x0

    invoke-direct {v0, v3, v1, v2, v4}, Lqw2/c$f$a;-><init>(Lqw2/c;JLq83/d;)V

    new-instance v1, Lec3/y;

    invoke-direct {v1, p1, v0}, Lec3/y;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
