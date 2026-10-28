.class final Lrq0/e1$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrq0/e1;->N(Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)V
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
    c = "com.whoop.community.presentation.teams.TeamsShowInviteViewModel$loadInviteByInviteCode$1"
    f = "TeamsShowInviteViewModel.kt"
    l = {
        0x67
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lrq0/e1;

.field final synthetic y:Lcom/whoop/domain/model/teams/DrawerDisplayInvite;


# direct methods
.method public constructor <init>(Lrq0/e1;Lcom/whoop/domain/model/teams/DrawerDisplayInvite;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrq0/e1;",
            "Lcom/whoop/domain/model/teams/DrawerDisplayInvite;",
            "Lq83/d<",
            "-",
            "Lrq0/e1$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrq0/e1$d;->x:Lrq0/e1;

    iput-object p2, p0, Lrq0/e1$d;->y:Lcom/whoop/domain/model/teams/DrawerDisplayInvite;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lrq0/e1$d;

    iget-object v0, p0, Lrq0/e1$d;->x:Lrq0/e1;

    iget-object v1, p0, Lrq0/e1$d;->y:Lcom/whoop/domain/model/teams/DrawerDisplayInvite;

    invoke-direct {p1, v0, v1, p2}, Lrq0/e1$d;-><init>(Lrq0/e1;Lcom/whoop/domain/model/teams/DrawerDisplayInvite;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lrq0/e1$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrq0/e1$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrq0/e1$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lrq0/e1$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lrq0/e1$d;->w:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lretrofit2/HttpException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v2, p1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_4

    :catch_2
    move-exception v0

    goto/16 :goto_5

    :catch_3
    move-exception v0

    goto/16 :goto_6

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object v2, v1, Lrq0/e1$d;->x:Lrq0/e1;

    invoke-static {v2}, Lrq0/e1;->B(Lrq0/e1;)Lcq0/g;

    move-result-object v2

    iget-object v6, v1, Lrq0/e1$d;->y:Lcom/whoop/domain/model/teams/DrawerDisplayInvite;

    invoke-virtual {v6}, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->getInviteCode()Ljava/lang/String;

    move-result-object v6

    const-string v7, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput v4, v1, Lrq0/e1$d;->w:I

    invoke-virtual {v2, v6, v1}, Lcq0/g;->x(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast v2, Lcom/whoop/data/remote/commons/Resource;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/whoop/data/remote/commons/Resource;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/domain/model/teams/Team;

    :goto_1
    move-object v8, v0

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    goto :goto_1

    :goto_2
    iget-object v0, v1, Lrq0/e1$d;->x:Lrq0/e1;

    invoke-static {v0}, Lrq0/e1;->C(Lrq0/e1;)Lrq0/f1;

    move-result-object v6

    const/16 v14, 0x75

    const/4 v15, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v6 .. v15}, Lrq0/f1;->h(Lrq0/f1;Lcom/whoop/domain/model/teams/DrawerDisplayInvite;Lcom/whoop/domain/model/teams/Team;ZZZIZILjava/lang/Object;)Lrq0/f1;

    move-result-object v2

    invoke-static {v0, v2}, Lrq0/e1;->D(Lrq0/e1;Lrq0/f1;)V

    invoke-static {v0}, Lrq0/e1;->z(Lrq0/e1;)V
    :try_end_1
    .catch Lretrofit2/HttpException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_7

    :goto_3
    iget-object v2, v1, Lrq0/e1$d;->x:Lrq0/e1;

    invoke-static {v2}, Lrq0/e1;->A(Lrq0/e1;)Ltr2/n;

    move-result-object v2

    new-array v4, v5, [Lqr2/a$a;

    const-string v5, "Error occurred while fetching the community by invite code - Reason: Unknown Error"

    invoke-interface {v2, v5, v0, v4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_7

    :goto_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Error occurred while fetching the community by invite code - Reason: network IO error "

    invoke-static {v2, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, v1, Lrq0/e1$d;->x:Lrq0/e1;

    invoke-static {v2}, Lrq0/e1;->A(Lrq0/e1;)Ltr2/n;

    move-result-object v2

    new-array v4, v5, [Lqr2/a$a;

    invoke-interface {v2, v0, v4}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_7

    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Error occurred while fetching the community by invite code - Reason: Parsing Error "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, v1, Lrq0/e1$d;->x:Lrq0/e1;

    invoke-static {v2}, Lrq0/e1;->A(Lrq0/e1;)Ltr2/n;

    move-result-object v2

    new-array v4, v5, [Lqr2/a$a;

    invoke-interface {v2, v0, v4}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_7

    :goto_6
    iget v0, v0, Lretrofit2/HttpException;->w:I

    const-string v2, "Error occurred while fetching the community by invite code - Reason: Server Error "

    invoke-static {v0, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, v1, Lrq0/e1$d;->x:Lrq0/e1;

    invoke-static {v2}, Lrq0/e1;->A(Lrq0/e1;)Ltr2/n;

    move-result-object v2

    new-array v4, v5, [Lqr2/a$a;

    invoke-interface {v2, v0, v4}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_7
    return-object v3
.end method
