.class final Lrq0/b0$l;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrq0/b0;->Z()V
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
    c = "com.whoop.community.presentation.teams.TeamManageViewModel$uploadLogo$2"
    f = "TeamManageViewModel.kt"
    l = {
        0xeb
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field final synthetic F:Lrq0/b0;

.field final synthetic G:Lrq0/p;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lrq0/b0;Lrq0/p;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrq0/b0;",
            "Lrq0/p;",
            "Lq83/d<",
            "-",
            "Lrq0/b0$l;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrq0/b0$l;->F:Lrq0/b0;

    iput-object p2, p0, Lrq0/b0$l;->G:Lrq0/p;

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

    new-instance p1, Lrq0/b0$l;

    iget-object v0, p0, Lrq0/b0$l;->F:Lrq0/b0;

    iget-object v1, p0, Lrq0/b0$l;->G:Lrq0/p;

    invoke-direct {p1, v0, v1, p2}, Lrq0/b0$l;-><init>(Lrq0/b0;Lrq0/p;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lrq0/b0$l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrq0/b0$l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrq0/b0$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lrq0/b0$l;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrq0/b0$l;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lrq0/b0$l;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/teams/Team;

    iget-object v2, v0, Lrq0/b0$l;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/domain/model/teams/Team;

    iget-object v2, v0, Lrq0/b0$l;->w:Ljava/lang/Object;

    check-cast v2, Lrq0/b0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lrq0/b0$l;->F:Lrq0/b0;

    invoke-static {v2}, Lrq0/b0;->q(Lrq0/b0;)Lrq0/c0;

    move-result-object v2

    invoke-virtual {v2}, Lrq0/c0;->m()Lcom/whoop/domain/model/teams/Team;

    move-result-object v4

    if-eqz v4, :cond_3

    iget-object v2, v0, Lrq0/b0$l;->G:Lrq0/p;

    iget-object v5, v0, Lrq0/b0$l;->F:Lrq0/b0;

    check-cast v2, Lrq0/r;

    invoke-virtual {v2}, Lrq0/r;->c()Ljava/lang/String;

    move-result-object v8

    const/16 v20, 0x7ff7

    const/16 v21, 0x0

    move-object v2, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

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

    invoke-static/range {v4 .. v21}, Lcom/whoop/domain/model/teams/Team;->copy$default(Lcom/whoop/domain/model/teams/Team;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZIILjava/lang/Object;)Lcom/whoop/domain/model/teams/Team;

    move-result-object v4

    invoke-static {v2}, Lrq0/b0;->o(Lrq0/b0;)Lcq0/g;

    move-result-object v5

    invoke-static {v2}, Lrq0/b0;->p(Lrq0/b0;)Lod1/u;

    move-result-object v6

    invoke-virtual {v6}, Lod1/u;->g()I

    move-result v6

    iput-object v2, v0, Lrq0/b0$l;->w:Ljava/lang/Object;

    iput-object v7, v0, Lrq0/b0$l;->x:Ljava/lang/Object;

    iput-object v4, v0, Lrq0/b0$l;->y:Ljava/lang/Object;

    const/4 v7, 0x0

    iput v7, v0, Lrq0/b0$l;->z:I

    iput v3, v0, Lrq0/b0$l;->E:I

    invoke-virtual {v5, v4, v6, v0}, Lcq0/g;->r0(Lcom/whoop/domain/model/teams/Team;ILq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_2

    return-object v1

    :cond_2
    move-object v9, v4

    :goto_0
    invoke-static {v2}, Lrq0/b0;->q(Lrq0/b0;)Lrq0/c0;

    move-result-object v5

    const v26, 0xffff7

    const/16 v27, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

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

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v5 .. v27}, Lrq0/c0;->d(Lrq0/c0;Ljava/lang/Integer;Ljava/lang/String;ZLcom/whoop/domain/model/teams/Team;ZLjava/lang/String;IIILjava/util/ArrayList;Ljava/util/ArrayList;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lrq0/a0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZILjava/lang/Object;)Lrq0/c0;

    move-result-object v1

    invoke-static {v2, v1}, Lrq0/b0;->r(Lrq0/b0;Lrq0/c0;)V

    :cond_3
    iget-object v1, v0, Lrq0/b0$l;->F:Lrq0/b0;

    invoke-static {v1}, Lrq0/b0;->q(Lrq0/b0;)Lrq0/c0;

    move-result-object v2

    sget-object v16, Lrq0/a0;->MAIN:Lrq0/a0;

    const v23, 0xfdffb

    const/16 v24, 0x0

    const/4 v3, 0x0

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

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v2 .. v24}, Lrq0/c0;->d(Lrq0/c0;Ljava/lang/Integer;Ljava/lang/String;ZLcom/whoop/domain/model/teams/Team;ZLjava/lang/String;IIILjava/util/ArrayList;Ljava/util/ArrayList;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lrq0/a0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZILjava/lang/Object;)Lrq0/c0;

    move-result-object v2

    invoke-static {v1, v2}, Lrq0/b0;->r(Lrq0/b0;Lrq0/c0;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
