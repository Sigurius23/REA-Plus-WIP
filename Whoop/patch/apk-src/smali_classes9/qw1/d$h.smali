.class final Lqw1/d$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqw1/d;->k(Z)Lec3/l;
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
        "Lqw1/c;",
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
    c = "com.whoop.membership.familyPlan.domain.interactor.inviteMember.InviteFamilyMemberInteractor$loadInviteScreen$1"
    f = "InviteFamilyMemberInteractor.kt"
    l = {
        0x47,
        0x48,
        0x4c,
        0x4d,
        0x4e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lqw1/d;


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
            "Lqw1/d$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqw1/d$h;->z:Lqw1/d;

    iput-boolean p2, p0, Lqw1/d$h;->E:Z

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

    new-instance v0, Lqw1/d$h;

    iget-object v1, p0, Lqw1/d$h;->z:Lqw1/d;

    iget-boolean v2, p0, Lqw1/d$h;->E:Z

    invoke-direct {v0, v1, v2, p2}, Lqw1/d$h;-><init>(Lqw1/d;ZLq83/d;)V

    iput-object p1, v0, Lqw1/d$h;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lqw1/d$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lqw1/d$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lqw1/d$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lqw1/d$h;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v5, p0

    iget-object v0, v5, Lqw1/d$h;->y:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lqw1/d$h;->x:I

    const/4 v10, 0x5

    const/4 v11, 0x4

    const/4 v12, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v13, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v12, :cond_1

    if-eq v0, v11, :cond_1

    if-ne v0, v10, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, v5, Lqw1/d$h;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_2

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v14, Lqw1/c;

    sget-object v15, Lqw1/a$c;->a:Lqw1/a$c;

    const/16 v20, 0x1e

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v14 .. v21}, Lqw1/c;-><init>(Lqw1/a;Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, v5, Lqw1/d$h;->y:Ljava/lang/Object;

    iput v2, v5, Lqw1/d$h;->x:I

    invoke-interface {v8, v14, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto/16 :goto_3

    :cond_5
    :goto_1
    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v2, v5, Lqw1/d$h;->z:Lqw1/d;

    invoke-static {v2}, Lqw1/d;->d(Lqw1/d;)Ltr2/n;

    move-result-object v2

    new-instance v4, Lqw1/d$h$a;

    iget-object v3, v5, Lqw1/d$h;->z:Lqw1/d;

    iget-boolean v6, v5, Lqw1/d$h;->E:Z

    invoke-direct {v4, v3, v6, v13}, Lqw1/d$h$a;-><init>(Lqw1/d;ZLq83/d;)V

    iput-object v8, v5, Lqw1/d$h;->y:Ljava/lang/Object;

    iput v1, v5, Lqw1/d$h;->x:I

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    goto/16 :goto_3

    :cond_6
    :goto_2
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_7

    new-instance v14, Lqw1/c;

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;

    iget-boolean v0, v5, Lqw1/d$h;->E:Z

    const/16 v20, 0x15

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, v0

    invoke-direct/range {v14 .. v21}, Lqw1/c;-><init>(Lqw1/a;Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v13, v5, Lqw1/d$h;->y:Ljava/lang/Object;

    iput-object v13, v5, Lqw1/d$h;->w:Ljava/lang/Object;

    iput v12, v5, Lqw1/d$h;->x:I

    invoke-interface {v8, v14, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_9

    goto :goto_3

    :cond_7
    instance-of v0, v0, Lu02/a$b$a;

    if-eqz v0, :cond_8

    new-instance v14, Lqw1/c;

    sget-object v15, Lqw1/a$f;->a:Lqw1/a$f;

    iget-boolean v0, v5, Lqw1/d$h;->E:Z

    const/16 v20, 0x16

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, v0

    invoke-direct/range {v14 .. v21}, Lqw1/c;-><init>(Lqw1/a;Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v13, v5, Lqw1/d$h;->y:Ljava/lang/Object;

    iput-object v13, v5, Lqw1/d$h;->w:Ljava/lang/Object;

    iput v11, v5, Lqw1/d$h;->x:I

    invoke-interface {v8, v14, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_9

    goto :goto_3

    :cond_8
    new-instance v14, Lqw1/c;

    sget-object v15, Lqw1/a$d;->a:Lqw1/a$d;

    iget-boolean v0, v5, Lqw1/d$h;->E:Z

    const/16 v20, 0x16

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, v0

    invoke-direct/range {v14 .. v21}, Lqw1/c;-><init>(Lqw1/a;Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v13, v5, Lqw1/d$h;->y:Ljava/lang/Object;

    iput-object v13, v5, Lqw1/d$h;->w:Ljava/lang/Object;

    iput v10, v5, Lqw1/d$h;->x:I

    invoke-interface {v8, v14, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_9

    :goto_3
    return-object v9

    :cond_9
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
