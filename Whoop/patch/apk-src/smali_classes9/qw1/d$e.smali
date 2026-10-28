.class final Lqw1/d$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqw1/d;->interact(Lec3/l;)Lec3/l;
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
        "Lqw1/c;",
        "previousResult",
        "Lqw1/e;",
        "action",
        "<anonymous>",
        "(Lqw1/c;Lqw1/e;)Lqw1/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.membership.familyPlan.domain.interactor.inviteMember.InviteFamilyMemberInteractor$interact$2"
    f = "InviteFamilyMemberInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lqw1/d;


# direct methods
.method public constructor <init>(Lqw1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqw1/d;",
            "Lq83/d<",
            "-",
            "Lqw1/d$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqw1/d$e;->z:Lqw1/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lqw1/c;Lqw1/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqw1/c;",
            "Lqw1/e;",
            "Lq83/d<",
            "-",
            "Lqw1/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lqw1/d$e;

    iget-object v1, p0, Lqw1/d$e;->z:Lqw1/d;

    invoke-direct {v0, v1, p3}, Lqw1/d$e;-><init>(Lqw1/d;Lq83/d;)V

    iput-object p1, v0, Lqw1/d$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Lqw1/d$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lqw1/d$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lqw1/c;

    check-cast p2, Lqw1/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lqw1/d$e;->f(Lqw1/c;Lqw1/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lqw1/d$e;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lqw1/c;

    iget-object v0, p0, Lqw1/d$e;->y:Ljava/lang/Object;

    check-cast v0, Lqw1/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lqw1/d$e;->w:I

    if-nez v2, :cond_7

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lqw1/e$a;

    if-eqz p1, :cond_0

    check-cast v0, Lqw1/e$a;

    invoke-virtual {v0}, Lqw1/e$a;->a()Lqw1/c;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v0, Lqw1/e$c;

    if-eqz p1, :cond_5

    move-object p1, v0

    check-cast p1, Lqw1/e$c;

    instance-of v2, p1, Lqw1/e$e;

    if-eqz v2, :cond_1

    sget-object v2, Lqw1/a$c;->a:Lqw1/a$c;

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lqw1/c;->b(Lqw1/c;Lqw1/a;Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;)Lqw1/c;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v2, p1, Lqw1/e$f;

    if-eqz v2, :cond_2

    new-instance v2, Lqw1/a$b;

    check-cast v0, Lqw1/e$f;

    invoke-virtual {v0}, Lqw1/e$f;->a()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object p1

    invoke-direct {v2, p1}, Lqw1/a$b;-><init>(Lcom/whoop/membership/extensions/domain/models/ProgressContent;)V

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lqw1/c;->b(Lqw1/c;Lqw1/a;Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;)Lqw1/c;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v2, p1, Lqw1/e$d;

    if-eqz v2, :cond_3

    check-cast v0, Lqw1/e$d;

    invoke-virtual {v0}, Lqw1/e$d;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lqw1/c;->b(Lqw1/c;Lqw1/a;Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;)Lqw1/c;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, p1, Lqw1/e$g;

    if-eqz p1, :cond_4

    sget-object v2, Lqw1/a$d;->a:Lqw1/a$d;

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lqw1/c;->b(Lqw1/c;Lqw1/a;Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;)Lqw1/c;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    instance-of p1, v0, Lqw1/e$b;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lqw1/d$e;->z:Lqw1/d;

    check-cast v0, Lqw1/e$b;

    invoke-virtual {v0}, Lqw1/e$b;->a()Lqw1/b;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lqw1/d;->f(Lqw1/d;Lqw1/c;Lqw1/b;)Lqw1/c;

    move-result-object p1

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
