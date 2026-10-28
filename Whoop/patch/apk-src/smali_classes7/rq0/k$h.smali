.class final Lrq0/k$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrq0/k;->j0(ILjava/lang/String;Lc93/a;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.community.presentation.teams.TeamAddMembersViewModel$withdrawInvite$1"
    f = "TeamAddMembersViewModel.kt"
    l = {
        0x91,
        0x92
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:I

.field H:I

.field final synthetic I:Lrq0/k;

.field final synthetic J:I

.field final synthetic K:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic L:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lrq0/k;ILc93/a;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrq0/k;",
            "I",
            "Lc93/a;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lrq0/k$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrq0/k$h;->I:Lrq0/k;

    iput p2, p0, Lrq0/k$h;->J:I

    iput-object p3, p0, Lrq0/k$h;->K:Lc93/a;

    iput-object p4, p0, Lrq0/k$h;->L:Ljava/lang/String;

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

    new-instance v0, Lrq0/k$h;

    iget-object v1, p0, Lrq0/k$h;->I:Lrq0/k;

    iget v2, p0, Lrq0/k$h;->J:I

    iget-object v3, p0, Lrq0/k$h;->K:Lc93/a;

    iget-object v4, p0, Lrq0/k$h;->L:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lrq0/k$h;-><init>(Lrq0/k;ILc93/a;Ljava/lang/String;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lrq0/k$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrq0/k$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrq0/k$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lrq0/k$h;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrq0/k$h;->H:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lrq0/k$h;->F:Ljava/lang/Object;

    check-cast v1, Lrq0/k;

    iget-object v2, v0, Lrq0/k$h;->E:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/domain/model/teams/TeamInviteDto;

    iget-object v2, v0, Lrq0/k$h;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v0, Lrq0/k$h;->y:Ljava/lang/Object;

    check-cast v3, Lc93/a;

    iget-object v4, v0, Lrq0/k$h;->x:Ljava/lang/Object;

    check-cast v4, Lrq0/k;

    iget-object v5, v0, Lrq0/k$h;->w:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/domain/model/teams/TeamInviteDto;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget v2, v0, Lrq0/k$h;->G:I

    iget-object v4, v0, Lrq0/k$h;->F:Ljava/lang/Object;

    check-cast v4, Lrq0/k;

    iget-object v6, v0, Lrq0/k$h;->E:Ljava/lang/Object;

    check-cast v6, Lcom/whoop/domain/model/teams/TeamInviteDto;

    iget-object v6, v0, Lrq0/k$h;->z:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, v0, Lrq0/k$h;->y:Ljava/lang/Object;

    check-cast v7, Lc93/a;

    iget-object v8, v0, Lrq0/k$h;->x:Ljava/lang/Object;

    check-cast v8, Lrq0/k;

    iget-object v9, v0, Lrq0/k$h;->w:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/domain/model/teams/TeamInviteDto;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v12, v2

    move-object v2, v4

    move-object/from16 v4, p1

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lrq0/k$h;->I:Lrq0/k;

    invoke-static {v2}, Lrq0/k;->z(Lrq0/k;)Lrq0/l;

    move-result-object v2

    invoke-virtual {v2}, Lrq0/l;->e()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    iget v6, v0, Lrq0/k$h;->J:I

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/whoop/domain/model/teams/TeamInviteDto;

    invoke-virtual {v8}, Lcom/whoop/domain/model/teams/TeamInviteDto;->getRecipientId()I

    move-result v8

    if-ne v8, v6, :cond_3

    goto :goto_0

    :cond_4
    move-object v7, v5

    :goto_0
    move-object v9, v7

    check-cast v9, Lcom/whoop/domain/model/teams/TeamInviteDto;

    if-eqz v9, :cond_8

    iget-object v2, v0, Lrq0/k$h;->I:Lrq0/k;

    iget-object v6, v0, Lrq0/k$h;->K:Lc93/a;

    iget-object v7, v0, Lrq0/k$h;->L:Ljava/lang/String;

    invoke-static {v2}, Lrq0/k;->C(Lrq0/k;)Lcq0/g;

    move-result-object v8

    invoke-virtual {v9}, Lcom/whoop/domain/model/teams/TeamInviteDto;->getId()I

    move-result v10

    invoke-static {v2}, Lrq0/k;->D(Lrq0/k;)I

    move-result v11

    iput-object v9, v0, Lrq0/k$h;->w:Ljava/lang/Object;

    iput-object v2, v0, Lrq0/k$h;->x:Ljava/lang/Object;

    iput-object v6, v0, Lrq0/k$h;->y:Ljava/lang/Object;

    iput-object v7, v0, Lrq0/k$h;->z:Ljava/lang/Object;

    iput-object v5, v0, Lrq0/k$h;->E:Ljava/lang/Object;

    iput-object v2, v0, Lrq0/k$h;->F:Ljava/lang/Object;

    const/4 v12, 0x0

    iput v12, v0, Lrq0/k$h;->G:I

    iput v4, v0, Lrq0/k$h;->H:I

    invoke-virtual {v8, v10, v11, v0}, Lcq0/g;->u0(IILq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_5

    goto :goto_2

    :cond_5
    move-object v8, v7

    move-object v7, v6

    move-object v6, v8

    move-object v8, v2

    :goto_1
    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_7

    iput-object v9, v0, Lrq0/k$h;->w:Ljava/lang/Object;

    iput-object v8, v0, Lrq0/k$h;->x:Ljava/lang/Object;

    iput-object v7, v0, Lrq0/k$h;->y:Ljava/lang/Object;

    iput-object v6, v0, Lrq0/k$h;->z:Ljava/lang/Object;

    iput-object v5, v0, Lrq0/k$h;->E:Ljava/lang/Object;

    iput-object v2, v0, Lrq0/k$h;->F:Ljava/lang/Object;

    iput v12, v0, Lrq0/k$h;->G:I

    iput v3, v0, Lrq0/k$h;->H:I

    invoke-static {v8, v0}, Lrq0/k;->F(Lrq0/k;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    move-object v1, v2

    move-object v2, v6

    move-object v3, v7

    move-object v4, v8

    :goto_3
    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    invoke-static {v4}, Lrq0/k;->z(Lrq0/k;)Lrq0/l;

    move-result-object v5

    invoke-static {v4}, Lrq0/k;->B(Lrq0/k;)Lcom/whoop/data/repositories/StringsRepository;

    move-result-object v3

    sget v4, Lxp0/d0;->k1:I

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3, v4, v2}, Lcom/whoop/data/repositories/StringsRepository;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    const/16 v15, 0xff

    const/16 v16, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v5 .. v16}, Lrq0/l;->b(Lrq0/l;Lcom/whoop/domain/model/teams/Team;Ljava/lang/String;ILjava/util/HashMap;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lrq0/l;

    move-result-object v2

    move-object/from16 v17, v2

    move-object v2, v1

    move-object/from16 v1, v17

    goto :goto_4

    :cond_7
    invoke-static {v8}, Lrq0/k;->z(Lrq0/k;)Lrq0/l;

    move-result-object v3

    invoke-static {v8}, Lrq0/k;->B(Lrq0/k;)Lcom/whoop/data/repositories/StringsRepository;

    move-result-object v1

    sget v4, Lxp0/d0;->r1:I

    invoke-interface {v1, v4}, Lcom/whoop/data/repositories/StringsRepository;->getString(I)Ljava/lang/String;

    move-result-object v12

    const/16 v13, 0xff

    const/4 v14, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v3 .. v14}, Lrq0/l;->b(Lrq0/l;Lcom/whoop/domain/model/teams/Team;Ljava/lang/String;ILjava/util/HashMap;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lrq0/l;

    move-result-object v1

    :goto_4
    invoke-static {v2, v1}, Lrq0/k;->I(Lrq0/k;Lrq0/l;)V

    :cond_8
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
