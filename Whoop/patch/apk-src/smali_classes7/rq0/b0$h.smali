.class final Lrq0/b0$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrq0/b0;->X(Z)V
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
    c = "com.whoop.community.presentation.teams.TeamManageViewModel$updateTeamChatSettings$1$1"
    f = "TeamManageViewModel.kt"
    l = {
        0x11c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lrq0/b0;

.field final synthetic y:Lcom/whoop/domain/model/teams/Team;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Lrq0/b0;Lcom/whoop/domain/model/teams/Team;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrq0/b0;",
            "Lcom/whoop/domain/model/teams/Team;",
            "Z",
            "Lq83/d<",
            "-",
            "Lrq0/b0$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrq0/b0$h;->x:Lrq0/b0;

    iput-object p2, p0, Lrq0/b0$h;->y:Lcom/whoop/domain/model/teams/Team;

    iput-boolean p3, p0, Lrq0/b0$h;->z:Z

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

    new-instance p1, Lrq0/b0$h;

    iget-object v0, p0, Lrq0/b0$h;->x:Lrq0/b0;

    iget-object v1, p0, Lrq0/b0$h;->y:Lcom/whoop/domain/model/teams/Team;

    iget-boolean v2, p0, Lrq0/b0$h;->z:Z

    invoke-direct {p1, v0, v1, v2, p2}, Lrq0/b0$h;-><init>(Lrq0/b0;Lcom/whoop/domain/model/teams/Team;ZLq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lrq0/b0$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrq0/b0$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrq0/b0$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lrq0/b0$h;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrq0/b0$h;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lrq0/b0$h;->x:Lrq0/b0;

    invoke-static {v2}, Lrq0/b0;->o(Lrq0/b0;)Lcq0/g;

    move-result-object v2

    iget-object v4, v0, Lrq0/b0$h;->y:Lcom/whoop/domain/model/teams/Team;

    invoke-virtual {v4}, Lcom/whoop/domain/model/teams/Team;->getId()I

    move-result v4

    iget-boolean v5, v0, Lrq0/b0$h;->z:Z

    iput v3, v0, Lrq0/b0$h;->w:I

    invoke-virtual {v2, v4, v5, v0}, Lcq0/g;->s0(IZLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v2, v0, Lrq0/b0$h;->x:Lrq0/b0;

    invoke-static {v2}, Lrq0/b0;->q(Lrq0/b0;)Lrq0/c0;

    move-result-object v4

    if-eqz v1, :cond_3

    iget-boolean v3, v0, Lrq0/b0$h;->z:Z

    :goto_1
    move/from16 v24, v3

    goto :goto_2

    :cond_3
    iget-boolean v1, v0, Lrq0/b0$h;->z:Z

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    goto :goto_1

    :goto_2
    const v25, 0x7ffff

    const/16 v26, 0x0

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

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v4 .. v26}, Lrq0/c0;->d(Lrq0/c0;Ljava/lang/Integer;Ljava/lang/String;ZLcom/whoop/domain/model/teams/Team;ZLjava/lang/String;IIILjava/util/ArrayList;Ljava/util/ArrayList;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lrq0/a0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZILjava/lang/Object;)Lrq0/c0;

    move-result-object v1

    invoke-static {v2, v1}, Lrq0/b0;->r(Lrq0/b0;Lrq0/c0;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
