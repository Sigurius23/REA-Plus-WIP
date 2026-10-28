.class final Lpw1/d$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpw1/d;->interact(Lec3/l;)Lec3/l;
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
        "Lpw1/b;",
        "previousResult",
        "Lpw1/e;",
        "action",
        "<anonymous>",
        "(Lpw1/b;Lpw1/e;)Lpw1/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.membership.familyPlan.domain.interactor.familyPlan.FamilyPlanInteractor$interact$2"
    f = "FamilyPlanInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lpw1/d;


# direct methods
.method public constructor <init>(Lpw1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpw1/d;",
            "Lq83/d<",
            "-",
            "Lpw1/d$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpw1/d$i;->z:Lpw1/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lpw1/b;Lpw1/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpw1/b;",
            "Lpw1/e;",
            "Lq83/d<",
            "-",
            "Lpw1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lpw1/d$i;

    iget-object v1, p0, Lpw1/d$i;->z:Lpw1/d;

    invoke-direct {v0, v1, p3}, Lpw1/d$i;-><init>(Lpw1/d;Lq83/d;)V

    iput-object p1, v0, Lpw1/d$i;->x:Ljava/lang/Object;

    iput-object p2, v0, Lpw1/d$i;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lpw1/d$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpw1/b;

    check-cast p2, Lpw1/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lpw1/d$i;->f(Lpw1/b;Lpw1/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lpw1/d$i;->x:Ljava/lang/Object;

    check-cast v0, Lpw1/b;

    iget-object v1, p0, Lpw1/d$i;->y:Ljava/lang/Object;

    check-cast v1, Lpw1/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lpw1/d$i;->w:I

    if-nez v2, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lpw1/e$c;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lpw1/d$i;->z:Lpw1/d;

    check-cast v1, Lpw1/e$c;

    invoke-virtual {v1}, Lpw1/e$c;->a()Lpw1/a;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lpw1/d;->h(Lpw1/d;Lpw1/b;Lpw1/a;)Lpw1/b;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v1, Lpw1/e$a;

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    new-instance p1, Lpw1/b;

    check-cast v1, Lpw1/e$a;

    invoke-virtual {v1}, Lpw1/e$a;->a()Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p1, v2, v0, v1, v2}, Lpw1/b;-><init>(Lpw1/c;Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_1
    instance-of p1, v1, Lpw1/e$b;

    const/4 v3, 0x2

    if-eqz p1, :cond_2

    new-instance p1, Lpw1/c$a;

    check-cast v1, Lpw1/e$b;

    invoke-virtual {v1}, Lpw1/e$b;->a()Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;

    move-result-object v4

    invoke-virtual {v1}, Lpw1/e$b;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lpw1/e$b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v4, v5, v1}, Lpw1/c$a;-><init>(Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, p1, v2, v3, v2}, Lpw1/b;->b(Lpw1/b;Lpw1/c;Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;ILjava/lang/Object;)Lpw1/b;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object p1, Lpw1/e$d;->a:Lpw1/e$d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lpw1/c$c;->a:Lpw1/c$c;

    invoke-static {v0, p1, v2, v3, v2}, Lpw1/b;->b(Lpw1/b;Lpw1/c;Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;ILjava/lang/Object;)Lpw1/b;

    move-result-object p1

    return-object p1

    :cond_3
    sget-object p1, Lpw1/e$e;->a:Lpw1/e$e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lpw1/c$d;->a:Lpw1/c$d;

    invoke-static {v0, p1, v2, v3, v2}, Lpw1/b;->b(Lpw1/b;Lpw1/c;Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;ILjava/lang/Object;)Lpw1/b;

    move-result-object p1

    return-object p1

    :cond_4
    sget-object p1, Lpw1/e$f;->a:Lpw1/e$f;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Lpw1/c$f;->a:Lpw1/c$f;

    invoke-static {v0, p1, v2, v3, v2}, Lpw1/b;->b(Lpw1/b;Lpw1/c;Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;ILjava/lang/Object;)Lpw1/b;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
