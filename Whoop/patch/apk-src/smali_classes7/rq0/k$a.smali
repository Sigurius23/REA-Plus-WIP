.class final Lrq0/k$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrq0/k;->K(ILjava/lang/String;Lc93/a;)V
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
    c = "com.whoop.community.presentation.teams.TeamAddMembersViewModel$actuallySendInviteTo$1"
    f = "TeamAddMembersViewModel.kt"
    l = {
        0x73,
        0x76
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:I

.field final synthetic F:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic G:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Lrq0/k;


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
            "Lrq0/k$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrq0/k$a;->z:Lrq0/k;

    iput p2, p0, Lrq0/k$a;->E:I

    iput-object p3, p0, Lrq0/k$a;->F:Lc93/a;

    iput-object p4, p0, Lrq0/k$a;->G:Ljava/lang/String;

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

    new-instance v0, Lrq0/k$a;

    iget-object v1, p0, Lrq0/k$a;->z:Lrq0/k;

    iget v2, p0, Lrq0/k$a;->E:I

    iget-object v3, p0, Lrq0/k$a;->F:Lc93/a;

    iget-object v4, p0, Lrq0/k$a;->G:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lrq0/k$a;-><init>(Lrq0/k;ILc93/a;Ljava/lang/String;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lrq0/k$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrq0/k$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrq0/k$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lrq0/k$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrq0/k$a;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lrq0/k$a;->x:Ljava/lang/Object;

    check-cast v1, Lrq0/k;

    iget-object v2, v0, Lrq0/k$a;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/domain/model/teams/TeamInviteDto;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lrq0/k$a;->z:Lrq0/k;

    invoke-static {v2}, Lrq0/k;->C(Lrq0/k;)Lcq0/g;

    move-result-object v2

    iget-object v5, v0, Lrq0/k$a;->z:Lrq0/k;

    invoke-static {v5}, Lrq0/k;->z(Lrq0/k;)Lrq0/l;

    move-result-object v5

    invoke-virtual {v5}, Lrq0/l;->j()Lcom/whoop/domain/model/teams/Team;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lcom/whoop/domain/model/teams/Team;->getId()I

    move-result v5

    goto :goto_0

    :cond_3
    const/4 v5, 0x0

    :goto_0
    iget v6, v0, Lrq0/k$a;->E:I

    iget-object v7, v0, Lrq0/k$a;->z:Lrq0/k;

    invoke-static {v7}, Lrq0/k;->D(Lrq0/k;)I

    move-result v7

    iput v4, v0, Lrq0/k$a;->y:I

    invoke-virtual {v2, v5, v6, v7, v0}, Lcq0/g;->j0(IIILq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast v2, Lcom/whoop/domain/model/teams/TeamInviteDto;

    iget-object v4, v0, Lrq0/k$a;->z:Lrq0/k;

    invoke-static {v4}, Lrq0/k;->z(Lrq0/k;)Lrq0/l;

    move-result-object v5

    iget v6, v0, Lrq0/k$a;->E:I

    invoke-virtual {v5, v6}, Lrq0/l;->n(I)Lrq0/l;

    move-result-object v7

    const/16 v17, 0x1ff

    const/16 v18, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v7 .. v18}, Lrq0/l;->b(Lrq0/l;Lcom/whoop/domain/model/teams/Team;Ljava/lang/String;ILjava/util/HashMap;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lrq0/l;

    move-result-object v5

    invoke-static {v4, v5}, Lrq0/k;->I(Lrq0/k;Lrq0/l;)V

    iget-object v4, v0, Lrq0/k$a;->z:Lrq0/k;

    if-eqz v2, :cond_9

    const/4 v2, 0x0

    iput-object v2, v0, Lrq0/k$a;->w:Ljava/lang/Object;

    iput-object v4, v0, Lrq0/k$a;->x:Ljava/lang/Object;

    iput v3, v0, Lrq0/k$a;->y:I

    invoke-static {v4, v0}, Lrq0/k;->F(Lrq0/k;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v1, v4

    :goto_3
    iget-object v2, v0, Lrq0/k$a;->F:Lc93/a;

    if-eqz v2, :cond_6

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_6
    iget-object v2, v0, Lrq0/k$a;->z:Lrq0/k;

    invoke-static {v2}, Lrq0/k;->z(Lrq0/k;)Lrq0/l;

    move-result-object v3

    iget-object v2, v0, Lrq0/k$a;->z:Lrq0/k;

    invoke-static {v2}, Lrq0/k;->B(Lrq0/k;)Lcom/whoop/data/repositories/StringsRepository;

    move-result-object v2

    sget v4, Lxp0/d0;->j1:I

    iget-object v5, v0, Lrq0/k$a;->G:Ljava/lang/String;

    iget-object v6, v0, Lrq0/k$a;->z:Lrq0/k;

    invoke-static {v6}, Lrq0/k;->z(Lrq0/k;)Lrq0/l;

    move-result-object v6

    invoke-virtual {v6}, Lrq0/l;->j()Lcom/whoop/domain/model/teams/Team;

    move-result-object v6

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Lcom/whoop/domain/model/teams/Team;->getName()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_8

    :cond_7
    const-string v6, ""

    :cond_8
    filled-new-array {v5, v6}, [Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Lcom/whoop/data/repositories/StringsRepository;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

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

    move-result-object v2

    move-object v4, v1

    goto :goto_4

    :cond_9
    invoke-static {v4}, Lrq0/k;->z(Lrq0/k;)Lrq0/l;

    move-result-object v5

    iget-object v1, v0, Lrq0/k$a;->z:Lrq0/k;

    invoke-static {v1}, Lrq0/k;->B(Lrq0/k;)Lcom/whoop/data/repositories/StringsRepository;

    move-result-object v1

    sget v2, Lxp0/d0;->h1:I

    invoke-interface {v1, v2}, Lcom/whoop/data/repositories/StringsRepository;->getString(I)Ljava/lang/String;

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

    :goto_4
    invoke-static {v4, v2}, Lrq0/k;->I(Lrq0/k;Lrq0/l;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
