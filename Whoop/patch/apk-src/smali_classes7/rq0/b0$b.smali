.class final Lrq0/b0$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrq0/b0;->y()V
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
    c = "com.whoop.community.presentation.teams.TeamManageViewModel$deleteTeam$1"
    f = "TeamManageViewModel.kt"
    l = {
        0xf8
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lrq0/b0;


# direct methods
.method public constructor <init>(Lrq0/b0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrq0/b0;",
            "Lq83/d<",
            "-",
            "Lrq0/b0$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrq0/b0$b;->x:Lrq0/b0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lrq0/b0$b;

    iget-object v0, p0, Lrq0/b0$b;->x:Lrq0/b0;

    invoke-direct {p1, v0, p2}, Lrq0/b0$b;-><init>(Lrq0/b0;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lrq0/b0$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrq0/b0$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrq0/b0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lrq0/b0$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrq0/b0$b;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lrq0/b0$b;->x:Lrq0/b0;

    invoke-static {v2}, Lrq0/b0;->o(Lrq0/b0;)Lcq0/g;

    move-result-object v2

    iget-object v4, v0, Lrq0/b0$b;->x:Lrq0/b0;

    invoke-static {v4}, Lrq0/b0;->q(Lrq0/b0;)Lrq0/c0;

    move-result-object v4

    invoke-virtual {v4}, Lrq0/c0;->l()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    iget-object v5, v0, Lrq0/b0$b;->x:Lrq0/b0;

    invoke-static {v5}, Lrq0/b0;->p(Lrq0/b0;)Lod1/u;

    move-result-object v5

    invoke-virtual {v5}, Lod1/u;->g()I

    move-result v5

    iput v3, v0, Lrq0/b0$b;->w:I

    invoke-virtual {v2, v4, v5, v0}, Lcq0/g;->T(IILq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v2, v0, Lrq0/b0$b;->x:Lrq0/b0;

    invoke-static {v2}, Lrq0/b0;->q(Lrq0/b0;)Lrq0/c0;

    move-result-object v3

    if-eqz v1, :cond_4

    const/16 v4, 0xc9

    :goto_2
    move/from16 v22, v4

    goto :goto_3

    :cond_4
    const/16 v4, 0xca

    goto :goto_2

    :goto_3
    iget-object v4, v0, Lrq0/b0$b;->x:Lrq0/b0;

    invoke-static {v4}, Lrq0/b0;->n(Lrq0/b0;)Lcom/whoop/data/repositories/StringsRepository;

    move-result-object v4

    if-eqz v1, :cond_5

    sget v1, Lxp0/d0;->F0:I

    goto :goto_4

    :cond_5
    sget v1, Lxp0/d0;->E0:I

    :goto_4
    iget-object v5, v0, Lrq0/b0$b;->x:Lrq0/b0;

    invoke-static {v5}, Lrq0/b0;->q(Lrq0/b0;)Lrq0/c0;

    move-result-object v5

    invoke-virtual {v5}, Lrq0/c0;->u()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v1, v5}, Lcom/whoop/data/repositories/StringsRepository;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v21

    const v24, 0x9ffff

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

    const/16 v20, 0x0

    const/16 v23, 0x0

    invoke-static/range {v3 .. v25}, Lrq0/c0;->d(Lrq0/c0;Ljava/lang/Integer;Ljava/lang/String;ZLcom/whoop/domain/model/teams/Team;ZLjava/lang/String;IIILjava/util/ArrayList;Ljava/util/ArrayList;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lrq0/a0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZILjava/lang/Object;)Lrq0/c0;

    move-result-object v1

    invoke-static {v2, v1}, Lrq0/b0;->r(Lrq0/b0;Lrq0/c0;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
