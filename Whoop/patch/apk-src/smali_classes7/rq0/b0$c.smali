.class final Lrq0/b0$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrq0/b0;->I(ILcom/whoop/domain/model/teams/TeamType;)V
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
    c = "com.whoop.community.presentation.teams.TeamManageViewModel$loadTeam$1"
    f = "TeamManageViewModel.kt"
    l = {
        0x37
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/domain/model/teams/TeamType;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lrq0/b0;

.field final synthetic z:I


# direct methods
.method public constructor <init>(Lrq0/b0;ILcom/whoop/domain/model/teams/TeamType;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrq0/b0;",
            "I",
            "Lcom/whoop/domain/model/teams/TeamType;",
            "Lq83/d<",
            "-",
            "Lrq0/b0$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrq0/b0$c;->y:Lrq0/b0;

    iput p2, p0, Lrq0/b0$c;->z:I

    iput-object p3, p0, Lrq0/b0$c;->E:Lcom/whoop/domain/model/teams/TeamType;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lrq0/b0$c;

    iget-object v1, p0, Lrq0/b0$c;->y:Lrq0/b0;

    iget v2, p0, Lrq0/b0$c;->z:I

    iget-object v3, p0, Lrq0/b0$c;->E:Lcom/whoop/domain/model/teams/TeamType;

    invoke-direct {v0, v1, v2, v3, p2}, Lrq0/b0$c;-><init>(Lrq0/b0;ILcom/whoop/domain/model/teams/TeamType;Lq83/d;)V

    iput-object p1, v0, Lrq0/b0$c;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lrq0/b0$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrq0/b0$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrq0/b0$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lrq0/b0$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v1, p0

    iget-object v0, v1, Lrq0/b0$c;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lrq0/b0$c;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v3, p1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object v3, v1, Lrq0/b0$c;->y:Lrq0/b0;

    invoke-static {v3}, Lrq0/b0;->o(Lrq0/b0;)Lcq0/g;

    move-result-object v3

    iget v5, v1, Lrq0/b0$c;->z:I

    iget-object v6, v1, Lrq0/b0$c;->y:Lrq0/b0;

    invoke-static {v6}, Lrq0/b0;->p(Lrq0/b0;)Lod1/u;

    move-result-object v6

    invoke-virtual {v6}, Lod1/u;->g()I

    move-result v6

    iget-object v7, v1, Lrq0/b0$c;->E:Lcom/whoop/domain/model/teams/TeamType;

    iput-object v0, v1, Lrq0/b0$c;->x:Ljava/lang/Object;

    iput v4, v1, Lrq0/b0$c;->w:I

    invoke-virtual {v3, v5, v6, v7, v1}, Lcq0/g;->w(IILcom/whoop/domain/model/teams/TeamType;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    move-object v8, v3

    check-cast v8, Lcom/whoop/domain/model/teams/Team;

    if-eqz v8, :cond_4

    iget-object v2, v1, Lrq0/b0$c;->y:Lrq0/b0;

    invoke-static {v2}, Lrq0/b0;->q(Lrq0/b0;)Lrq0/c0;

    move-result-object v4

    invoke-virtual {v8}, Lcom/whoop/domain/model/teams/Team;->getId()I

    move-result v3

    new-instance v5, Ljava/lang/Integer;

    invoke-direct {v5, v3}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v8}, Lcom/whoop/domain/model/teams/Team;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8}, Lcom/whoop/domain/model/teams/Team;->getDescription()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    const-string v3, ""

    :cond_3
    move-object v10, v3

    invoke-virtual {v8}, Lcom/whoop/domain/model/teams/Team;->getBannerUrl()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v8}, Lcom/whoop/domain/model/teams/Team;->getIconUrl()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v8}, Lcom/whoop/domain/model/teams/Team;->getChatEnabled()Z

    move-result v24

    const v25, 0x73fd4

    const/16 v26, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v4 .. v26}, Lrq0/c0;->d(Lrq0/c0;Ljava/lang/Integer;Ljava/lang/String;ZLcom/whoop/domain/model/teams/Team;ZLjava/lang/String;IIILjava/util/ArrayList;Ljava/util/ArrayList;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lrq0/a0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZILjava/lang/Object;)Lrq0/c0;

    move-result-object v3

    invoke-static {v2, v3}, Lrq0/b0;->r(Lrq0/b0;Lrq0/c0;)V

    new-instance v2, Lrq0/b0$c$a;

    iget-object v3, v1, Lrq0/b0$c;->y:Lrq0/b0;

    iget v4, v1, Lrq0/b0$c;->z:I

    iget-object v5, v1, Lrq0/b0$c;->E:Lcom/whoop/domain/model/teams/TeamType;

    const/4 v6, 0x0

    invoke-direct {v2, v3, v4, v5, v6}, Lrq0/b0$c$a;-><init>(Lrq0/b0;ILcom/whoop/domain/model/teams/TeamType;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v6, v6, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object v0, v1, Lrq0/b0$c;->y:Lrq0/b0;

    invoke-virtual {v0, v8}, Lrq0/b0;->Q(Lcom/whoop/domain/model/teams/Team;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    iget-object v2, v1, Lrq0/b0$c;->y:Lrq0/b0;

    invoke-static {v2}, Lrq0/b0;->j(Lrq0/b0;)Ltr2/n;

    move-result-object v2

    const-string v3, "Error getting community: "

    const/4 v4, 0x0

    new-array v5, v4, [Lqr2/a$a;

    invoke-interface {v2, v3, v0, v5}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object v0, v1, Lrq0/b0$c;->y:Lrq0/b0;

    invoke-static {v0, v4}, Lrq0/b0;->t(Lrq0/b0;Z)V

    :cond_4
    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
