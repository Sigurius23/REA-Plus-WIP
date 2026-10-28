.class final Lrq0/b0$c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrq0/b0$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.whoop.community.presentation.teams.TeamManageViewModel$loadTeam$1$1"
    f = "TeamManageViewModel.kt"
    l = {
        0x44
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lrq0/b0;

.field final synthetic y:I

.field final synthetic z:Lcom/whoop/domain/model/teams/TeamType;


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
            "Lrq0/b0$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrq0/b0$c$a;->x:Lrq0/b0;

    iput p2, p0, Lrq0/b0$c$a;->y:I

    iput-object p3, p0, Lrq0/b0$c$a;->z:Lcom/whoop/domain/model/teams/TeamType;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lrq0/b0$c$a;

    iget-object v0, p0, Lrq0/b0$c$a;->x:Lrq0/b0;

    iget v1, p0, Lrq0/b0$c$a;->y:I

    iget-object v2, p0, Lrq0/b0$c$a;->z:Lcom/whoop/domain/model/teams/TeamType;

    invoke-direct {p1, v0, v1, v2, p2}, Lrq0/b0$c$a;-><init>(Lrq0/b0;ILcom/whoop/domain/model/teams/TeamType;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lrq0/b0$c$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrq0/b0$c$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrq0/b0$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lrq0/b0$c$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v1, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lrq0/b0$c$a;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v2, p1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object v2, v1, Lrq0/b0$c$a;->x:Lrq0/b0;

    invoke-static {v2}, Lrq0/b0;->o(Lrq0/b0;)Lcq0/g;

    move-result-object v2

    iget v4, v1, Lrq0/b0$c$a;->y:I

    iget-object v5, v1, Lrq0/b0$c$a;->x:Lrq0/b0;

    invoke-static {v5}, Lrq0/b0;->p(Lrq0/b0;)Lod1/u;

    move-result-object v5

    invoke-virtual {v5}, Lod1/u;->g()I

    move-result v5

    iget-object v6, v1, Lrq0/b0$c$a;->z:Lcom/whoop/domain/model/teams/TeamType;

    iput v3, v1, Lrq0/b0$c$a;->w:I

    invoke-virtual {v2, v4, v5, v6, v1}, Lcq0/g;->z(IILcom/whoop/domain/model/teams/TeamType;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v20

    iget-object v0, v1, Lrq0/b0$c$a;->x:Lrq0/b0;

    invoke-static {v0}, Lrq0/b0;->q(Lrq0/b0;)Lrq0/c0;

    move-result-object v3

    const v24, 0xeffff

    const/16 v25, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v3 .. v25}, Lrq0/c0;->d(Lrq0/c0;Ljava/lang/Integer;Ljava/lang/String;ZLcom/whoop/domain/model/teams/Team;ZLjava/lang/String;IIILjava/util/ArrayList;Ljava/util/ArrayList;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lrq0/a0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZILjava/lang/Object;)Lrq0/c0;

    move-result-object v2

    invoke-static {v0, v2}, Lrq0/b0;->r(Lrq0/b0;Lrq0/c0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    iget-object v2, v1, Lrq0/b0$c$a;->x:Lrq0/b0;

    invoke-static {v2}, Lrq0/b0;->j(Lrq0/b0;)Ltr2/n;

    move-result-object v2

    const-string v3, "Error getting community members: "

    const/4 v4, 0x0

    new-array v5, v4, [Lqr2/a$a;

    invoke-interface {v2, v3, v0, v5}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object v0, v1, Lrq0/b0$c$a;->x:Lrq0/b0;

    invoke-static {v0, v4}, Lrq0/b0;->t(Lrq0/b0;Z)V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
