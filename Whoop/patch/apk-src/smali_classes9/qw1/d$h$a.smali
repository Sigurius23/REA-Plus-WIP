.class final Lqw1/d$h$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqw1/d$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.membership.familyPlan.domain.interactor.inviteMember.InviteFamilyMemberInteractor$loadInviteScreen$1$response$1"
    f = "InviteFamilyMemberInteractor.kt"
    l = {
        0x49
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lqw1/d;

.field final synthetic y:Z


# direct methods
.method public constructor <init>(Lqw1/d;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqw1/d;",
            "Z",
            "Lq83/d<",
            "-",
            "Lqw1/d$h$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqw1/d$h$a;->x:Lqw1/d;

    iput-boolean p2, p0, Lqw1/d$h$a;->y:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lqw1/d$h$a;

    iget-object v1, p0, Lqw1/d$h$a;->x:Lqw1/d;

    iget-boolean v2, p0, Lqw1/d$h$a;->y:Z

    invoke-direct {v0, v1, v2, p1}, Lqw1/d$h$a;-><init>(Lqw1/d;ZLq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lqw1/d$h$a;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lqw1/d$h$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lqw1/d$h$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lqw1/d$h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lqw1/d$h$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lqw1/d$h$a;->x:Lqw1/d;

    invoke-static {p1}, Lqw1/d;->c(Lqw1/d;)Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;

    move-result-object p1

    iget-boolean v1, p0, Lqw1/d$h$a;->y:Z

    iput v2, p0, Lqw1/d$h$a;->w:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;->familyPlanInvite(ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
