.class final Lrq0/y$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrq0/y;->E()V
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
    c = "com.whoop.community.presentation.teams.TeamCreateViewModel$createTeam$1"
    f = "TeamCreateViewModel.kt"
    l = {
        0xbf,
        0xbc
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lrq0/y;

.field final synthetic F:Ljava/lang/String;

.field final synthetic G:Ljava/lang/String;

.field final synthetic H:Landroid/graphics/Bitmap;

.field final synthetic I:Landroid/graphics/Bitmap;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lrq0/y;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrq0/y;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            "Lq83/d<",
            "-",
            "Lrq0/y$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrq0/y$b;->E:Lrq0/y;

    iput-object p2, p0, Lrq0/y$b;->F:Ljava/lang/String;

    iput-object p3, p0, Lrq0/y$b;->G:Ljava/lang/String;

    iput-object p4, p0, Lrq0/y$b;->H:Landroid/graphics/Bitmap;

    iput-object p5, p0, Lrq0/y$b;->I:Landroid/graphics/Bitmap;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lrq0/y$b;

    iget-object v1, p0, Lrq0/y$b;->E:Lrq0/y;

    iget-object v2, p0, Lrq0/y$b;->F:Ljava/lang/String;

    iget-object v3, p0, Lrq0/y$b;->G:Ljava/lang/String;

    iget-object v4, p0, Lrq0/y$b;->H:Landroid/graphics/Bitmap;

    iget-object v5, p0, Lrq0/y$b;->I:Landroid/graphics/Bitmap;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lrq0/y$b;-><init>(Lrq0/y;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lrq0/y$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrq0/y$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrq0/y$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lrq0/y$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    move-object/from16 v11, p0

    sget-object v12, Lr83/a;->w:Lr83/a;

    iget v0, v11, Lrq0/y$b;->z:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v11, Lrq0/y$b;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v2, v11, Lrq0/y$b;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v11, Lrq0/y$b;->w:Ljava/lang/Object;

    check-cast v3, Lcq0/g;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v4, v3

    move-object v3, v2

    move-object/from16 v2, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v11, Lrq0/y$b;->E:Lrq0/y;

    invoke-static {v0}, Lrq0/y;->z(Lrq0/y;)Lcq0/g;

    move-result-object v3

    iget-object v0, v11, Lrq0/y$b;->E:Lrq0/y;

    invoke-static {v0}, Lrq0/y;->A(Lrq0/y;)Lrq0/z;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/z;->p()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v4, v11, Lrq0/y$b;->E:Lrq0/y;

    iput-object v3, v11, Lrq0/y$b;->w:Ljava/lang/Object;

    iput-object v0, v11, Lrq0/y$b;->x:Ljava/lang/Object;

    const-string v5, ""

    iput-object v5, v11, Lrq0/y$b;->y:Ljava/lang/Object;

    iput v2, v11, Lrq0/y$b;->z:I

    invoke-static {v4, v11}, Lrq0/y;->D(Lrq0/y;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v12, :cond_3

    goto :goto_1

    :cond_3
    move-object v4, v3

    move-object v3, v0

    move-object v0, v5

    :goto_0
    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object v5, v11, Lrq0/y$b;->E:Lrq0/y;

    invoke-static {v5}, Lrq0/y;->A(Lrq0/y;)Lrq0/z;

    move-result-object v5

    invoke-virtual {v5}, Lrq0/z;->s()Z

    move-result v5

    iget-object v6, v11, Lrq0/y$b;->E:Lrq0/y;

    invoke-static {v6}, Lrq0/y;->A(Lrq0/y;)Lrq0/z;

    move-result-object v6

    invoke-virtual {v6}, Lrq0/z;->q()Z

    move-result v6

    iget-object v7, v11, Lrq0/y$b;->E:Lrq0/y;

    invoke-static {v7}, Lrq0/y;->A(Lrq0/y;)Lrq0/z;

    move-result-object v7

    invoke-virtual {v7}, Lrq0/z;->r()Z

    move-result v7

    move-object v8, v3

    move v3, v2

    move-object v2, v0

    move-object v0, v4

    move v4, v5

    move v5, v6

    move v6, v7

    iget-object v7, v11, Lrq0/y$b;->F:Ljava/lang/String;

    move-object v9, v8

    iget-object v8, v11, Lrq0/y$b;->G:Ljava/lang/String;

    move-object v10, v9

    iget-object v9, v11, Lrq0/y$b;->H:Landroid/graphics/Bitmap;

    move-object v13, v10

    iget-object v10, v11, Lrq0/y$b;->I:Landroid/graphics/Bitmap;

    const/4 v14, 0x0

    iput-object v14, v11, Lrq0/y$b;->w:Ljava/lang/Object;

    iput-object v14, v11, Lrq0/y$b;->x:Ljava/lang/Object;

    iput-object v14, v11, Lrq0/y$b;->y:Ljava/lang/Object;

    iput v1, v11, Lrq0/y$b;->z:I

    move-object v1, v13

    invoke-virtual/range {v0 .. v11}, Lcq0/g;->q(Ljava/lang/String;Ljava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_4

    :goto_1
    return-object v12

    :cond_4
    :goto_2
    check-cast v0, Lcom/whoop/domain/model/teams/CommunityDto;

    iget-object v1, v11, Lrq0/y$b;->E:Lrq0/y;

    if-eqz v0, :cond_5

    invoke-static {v1}, Lrq0/y;->A(Lrq0/y;)Lrq0/z;

    move-result-object v12

    iget-object v2, v11, Lrq0/y$b;->E:Lrq0/y;

    invoke-static {v2}, Lrq0/y;->y(Lrq0/y;)Lcom/whoop/data/repositories/StringsRepository;

    move-result-object v2

    sget v3, Lxp0/d0;->C0:I

    iget-object v4, v11, Lrq0/y$b;->E:Lrq0/y;

    invoke-static {v4}, Lrq0/y;->A(Lrq0/y;)Lrq0/z;

    move-result-object v4

    invoke-virtual {v4}, Lrq0/z;->p()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lcom/whoop/data/repositories/StringsRepository;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v26

    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/CommunityDto;->toTeam()Lcom/whoop/domain/model/teams/Team;

    move-result-object v28

    const/16 v29, 0x1fff

    const/16 v30, 0x0

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

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x12d

    invoke-static/range {v12 .. v30}, Lrq0/z;->d(Lrq0/z;Lrq0/w;Ljava/lang/String;IIILjava/util/ArrayList;Ljava/util/ArrayList;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;ZZZZLjava/lang/String;ILcom/whoop/domain/model/teams/Team;ILjava/lang/Object;)Lrq0/z;

    move-result-object v0

    goto :goto_3

    :cond_5
    invoke-static {v1}, Lrq0/y;->A(Lrq0/y;)Lrq0/z;

    move-result-object v12

    iget-object v0, v11, Lrq0/y$b;->E:Lrq0/y;

    invoke-static {v0}, Lrq0/y;->y(Lrq0/y;)Lcom/whoop/data/repositories/StringsRepository;

    move-result-object v0

    sget v2, Lxp0/d0;->B0:I

    invoke-interface {v0, v2}, Lcom/whoop/data/repositories/StringsRepository;->getString(I)Ljava/lang/String;

    move-result-object v26

    const/16 v29, 0x1fff

    const/16 v30, 0x0

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

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x12e

    const/16 v28, 0x0

    invoke-static/range {v12 .. v30}, Lrq0/z;->d(Lrq0/z;Lrq0/w;Ljava/lang/String;IIILjava/util/ArrayList;Ljava/util/ArrayList;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;ZZZZLjava/lang/String;ILcom/whoop/domain/model/teams/Team;ILjava/lang/Object;)Lrq0/z;

    move-result-object v0

    :goto_3
    invoke-static {v1, v0}, Lrq0/y;->C(Lrq0/y;Lrq0/z;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
