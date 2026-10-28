.class final Lcq0/g$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcq0/g;->q(Ljava/lang/String;Ljava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Lcom/whoop/domain/model/teams/CommunityDto;",
        "<anonymous>",
        "(Lbc3/c0;)Lcom/whoop/domain/model/teams/CommunityDto;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.community.data.repository.TeamsRepository$createCommunity$2"
    f = "TeamsRepository.kt"
    l = {
        0xce
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Landroid/graphics/Bitmap;

.field final synthetic F:Lcq0/g;

.field final synthetic G:Ljava/lang/String;

.field final synthetic H:Ljava/lang/String;

.field final synthetic I:Ljava/lang/String;

.field final synthetic J:Ljava/lang/String;

.field final synthetic K:Z

.field final synthetic L:Z

.field final synthetic M:Z

.field final synthetic N:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcq0/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            "Lcq0/g;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZZI",
            "Lq83/d<",
            "-",
            "Lcq0/g$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcq0/g$d;->z:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lcq0/g$d;->E:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lcq0/g$d;->F:Lcq0/g;

    iput-object p4, p0, Lcq0/g$d;->G:Ljava/lang/String;

    iput-object p5, p0, Lcq0/g$d;->H:Ljava/lang/String;

    iput-object p6, p0, Lcq0/g$d;->I:Ljava/lang/String;

    iput-object p7, p0, Lcq0/g$d;->J:Ljava/lang/String;

    iput-boolean p8, p0, Lcq0/g$d;->K:Z

    iput-boolean p9, p0, Lcq0/g$d;->L:Z

    iput-boolean p10, p0, Lcq0/g$d;->M:Z

    iput p11, p0, Lcq0/g$d;->N:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p12}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 13
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

    new-instance v0, Lcq0/g$d;

    iget-object v1, p0, Lcq0/g$d;->z:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcq0/g$d;->E:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lcq0/g$d;->F:Lcq0/g;

    iget-object v4, p0, Lcq0/g$d;->G:Ljava/lang/String;

    iget-object v5, p0, Lcq0/g$d;->H:Ljava/lang/String;

    iget-object v6, p0, Lcq0/g$d;->I:Ljava/lang/String;

    iget-object v7, p0, Lcq0/g$d;->J:Ljava/lang/String;

    iget-boolean v8, p0, Lcq0/g$d;->K:Z

    iget-boolean v9, p0, Lcq0/g$d;->L:Z

    iget-boolean v10, p0, Lcq0/g$d;->M:Z

    iget v11, p0, Lcq0/g$d;->N:I

    move-object v12, p2

    invoke-direct/range {v0 .. v12}, Lcq0/g$d;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcq0/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZILq83/d;)V

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
            "Lcom/whoop/domain/model/teams/CommunityDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcq0/g$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcq0/g$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcq0/g$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcq0/g$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v11, p0

    sget-object v12, Lr83/a;->w:Lr83/a;

    iget v0, v11, Lcq0/g$d;->y:I

    const/4 v13, 0x0

    const/4 v1, 0x1

    const/4 v14, 0x0

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    iget-object v0, v11, Lcq0/g$d;->x:Ljava/lang/Object;

    check-cast v0, Lud3/i0;

    iget-object v0, v11, Lcq0/g$d;->w:Ljava/lang/Object;

    check-cast v0, Lud3/i0;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v0, p1

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v11, Lcq0/g$d;->z:Landroid/graphics/Bitmap;

    const-string v2, "image/*"

    if-eqz v0, :cond_2

    iget-object v3, v11, Lcq0/g$d;->F:Lcq0/g;

    invoke-static {v3, v0}, Lcq0/g;->n(Lcq0/g;Landroid/graphics/Bitmap;)[B

    move-result-object v0

    sget-object v3, Lud3/v0;->Companion:Lud3/u0;

    sget-object v4, Lud3/h0;->e:Lyb3/p;

    invoke-static {v2}, Landroidx/room/c1;->J(Ljava/lang/String;)Lud3/h0;

    move-result-object v4

    array-length v5, v0

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v0, v13, v5}, Lud3/u0;->c(Lud3/h0;[BII)Lud3/t0;

    move-result-object v0

    const-string v3, "banner"

    const-string v4, "banner.png"

    invoke-static {v3, v4, v0}, Lrj/o;->o(Ljava/lang/String;Ljava/lang/String;Lud3/v0;)Lud3/i0;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v14

    :goto_0
    iget-object v3, v11, Lcq0/g$d;->E:Landroid/graphics/Bitmap;

    if-eqz v3, :cond_3

    iget-object v4, v11, Lcq0/g$d;->F:Lcq0/g;

    invoke-static {v4, v3}, Lcq0/g;->n(Lcq0/g;Landroid/graphics/Bitmap;)[B

    move-result-object v3

    sget-object v4, Lud3/v0;->Companion:Lud3/u0;

    sget-object v5, Lud3/h0;->e:Lyb3/p;

    invoke-static {v2}, Landroidx/room/c1;->J(Ljava/lang/String;)Lud3/h0;

    move-result-object v2

    array-length v5, v3

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v3, v13, v5}, Lud3/u0;->c(Lud3/h0;[BII)Lud3/t0;

    move-result-object v2

    const-string v3, "avatar"

    const-string v4, "logo.png"

    invoke-static {v3, v4, v2}, Lrj/o;->o(Ljava/lang/String;Ljava/lang/String;Lud3/v0;)Lud3/i0;

    move-result-object v2

    goto :goto_1

    :cond_3
    move-object v2, v14

    :goto_1
    :try_start_1
    iget-object v3, v11, Lcq0/g$d;->F:Lcq0/g;

    invoke-virtual {v3}, Lcq0/g;->y()Lcom/whoop/service/network/CommunityApi;

    move-result-object v3

    iget-object v4, v11, Lcq0/g$d;->G:Ljava/lang/String;

    if-eqz v4, :cond_4

    sget-object v5, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v14}, Lud3/u0;->b(Ljava/lang/String;Lud3/h0;)Lud3/t0;

    move-result-object v4

    goto :goto_2

    :cond_4
    move-object v4, v14

    :goto_2
    iget-object v5, v11, Lcq0/g$d;->H:Ljava/lang/String;

    if-eqz v5, :cond_5

    sget-object v6, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v14}, Lud3/u0;->b(Ljava/lang/String;Lud3/h0;)Lud3/t0;

    move-result-object v5

    goto :goto_3

    :cond_5
    move-object v5, v14

    :goto_3
    sget-object v6, Lud3/v0;->Companion:Lud3/u0;

    iget-object v7, v11, Lcq0/g$d;->I:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7, v14}, Lud3/u0;->b(Ljava/lang/String;Lud3/h0;)Lud3/t0;

    move-result-object v6

    iget-object v7, v11, Lcq0/g$d;->J:Ljava/lang/String;

    invoke-static {v7, v14}, Lud3/u0;->b(Ljava/lang/String;Lud3/h0;)Lud3/t0;

    move-result-object v7

    move-object v8, v0

    move-object v0, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    iget-boolean v7, v11, Lcq0/g$d;->K:Z

    move-object v9, v8

    iget-boolean v8, v11, Lcq0/g$d;->L:Z

    move-object v10, v9

    iget-boolean v9, v11, Lcq0/g$d;->M:Z

    move-object v15, v10

    iget v10, v11, Lcq0/g$d;->N:I

    iput-object v14, v11, Lcq0/g$d;->w:Ljava/lang/Object;

    iput-object v14, v11, Lcq0/g$d;->x:Ljava/lang/Object;

    iput v1, v11, Lcq0/g$d;->y:I

    move-object v1, v15

    invoke-interface/range {v0 .. v11}, Lcom/whoop/service/network/CommunityApi;->createCommunity(Lud3/i0;Lud3/i0;Lud3/v0;Lud3/v0;Lud3/v0;Lud3/v0;ZZZILq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_6

    return-object v12

    :cond_6
    :goto_4
    check-cast v0, Lpg3/v0;

    iget-object v0, v0, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/domain/model/teams/CommunityDto;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v0

    :goto_5
    iget-object v1, v11, Lcq0/g$d;->F:Lcq0/g;

    invoke-virtual {v1}, Lcq0/g;->F()Ltr2/n;

    move-result-object v1

    const-string v2, "Error in createCommunity: "

    new-array v3, v13, [Lqr2/a$a;

    invoke-interface {v1, v2, v0, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-object v14
.end method
