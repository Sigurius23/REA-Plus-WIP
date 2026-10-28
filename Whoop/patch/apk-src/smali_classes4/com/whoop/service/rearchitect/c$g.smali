.class final Lcom/whoop/service/rearchitect/c$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/service/rearchitect/c;->F1(I)V
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
    c = "com.whoop.service.rearchitect.WhoopStrap$doInitializeWhenReady$1"
    f = "WhoopStrap.kt"
    l = {
        0x4f7,
        0x532,
        0x533,
        0x536,
        0x53a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:I

.field H:I

.field I:I

.field J:I

.field K:I

.field final synthetic L:Lcom/whoop/service/rearchitect/c;

.field final synthetic M:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/service/rearchitect/c;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/rearchitect/c;",
            "I",
            "Lq83/d<",
            "-",
            "Lcom/whoop/service/rearchitect/c$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    iput p2, p0, Lcom/whoop/service/rearchitect/c$g;->M:I

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

    new-instance p1, Lcom/whoop/service/rearchitect/c$g;

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    iget v1, p0, Lcom/whoop/service/rearchitect/c$g;->M:I

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/service/rearchitect/c$g;-><init>(Lcom/whoop/service/rearchitect/c;ILq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/service/rearchitect/c$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/service/rearchitect/c$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/service/rearchitect/c$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/service/rearchitect/c$g;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v1, p0

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v0, v1, Lcom/whoop/service/rearchitect/c$g;->K:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x5

    const-string v8, "Connection Step: "

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v0, :cond_5

    if-eq v0, v9, :cond_4

    if-eq v0, v5, :cond_3

    if-eq v0, v4, :cond_2

    if-eq v0, v3, :cond_1

    if-ne v0, v7, :cond_0

    iget-object v0, v1, Lcom/whoop/service/rearchitect/c$g;->E:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/service/rearchitect/c$a;

    iget-object v0, v1, Lcom/whoop/service/rearchitect/c$g;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/service/rearchitect/c$a;

    iget-object v0, v1, Lcom/whoop/service/rearchitect/c$g;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/domain/model/WhoopStrapInfo;

    iget-object v0, v1, Lcom/whoop/service/rearchitect/c$g;->x:Ljava/lang/Object;

    check-cast v0, Lzj0/t;

    iget-object v0, v1, Lcom/whoop/service/rearchitect/c$g;->w:Ljava/lang/Object;

    check-cast v0, Lzj0/t;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, v1, Lcom/whoop/service/rearchitect/c$g;->J:I

    iget v3, v1, Lcom/whoop/service/rearchitect/c$g;->I:I

    iget v4, v1, Lcom/whoop/service/rearchitect/c$g;->H:I

    iget v5, v1, Lcom/whoop/service/rearchitect/c$g;->G:I

    iget-object v12, v1, Lcom/whoop/service/rearchitect/c$g;->F:Ljava/lang/Object;

    check-cast v12, Lcom/whoop/service/rearchitect/c$a;

    iget-object v12, v1, Lcom/whoop/service/rearchitect/c$g;->E:Ljava/lang/Object;

    check-cast v12, Lcom/whoop/service/rearchitect/c$a;

    iget-object v13, v1, Lcom/whoop/service/rearchitect/c$g;->z:Ljava/lang/Object;

    check-cast v13, Lcom/whoop/domain/model/WhoopStrapInfo;

    iget-object v13, v1, Lcom/whoop/service/rearchitect/c$g;->y:Ljava/lang/Object;

    check-cast v13, Lzj0/t;

    iget-object v14, v1, Lcom/whoop/service/rearchitect/c$g;->x:Ljava/lang/Object;

    check-cast v14, Lcom/whoop/service/rearchitect/c;

    iget-object v15, v1, Lcom/whoop/service/rearchitect/c$g;->w:Ljava/lang/Object;

    check-cast v15, Lzj0/t;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v11, v5

    move v5, v9

    goto/16 :goto_8

    :cond_2
    iget v0, v1, Lcom/whoop/service/rearchitect/c$g;->J:I

    iget v4, v1, Lcom/whoop/service/rearchitect/c$g;->I:I

    iget v5, v1, Lcom/whoop/service/rearchitect/c$g;->H:I

    iget v12, v1, Lcom/whoop/service/rearchitect/c$g;->G:I

    iget-object v13, v1, Lcom/whoop/service/rearchitect/c$g;->F:Ljava/lang/Object;

    check-cast v13, Lcom/whoop/service/rearchitect/c$a;

    iget-object v13, v1, Lcom/whoop/service/rearchitect/c$g;->E:Ljava/lang/Object;

    check-cast v13, Lcom/whoop/service/rearchitect/c$a;

    iget-object v14, v1, Lcom/whoop/service/rearchitect/c$g;->z:Ljava/lang/Object;

    check-cast v14, Lcom/whoop/domain/model/WhoopStrapInfo;

    iget-object v15, v1, Lcom/whoop/service/rearchitect/c$g;->y:Ljava/lang/Object;

    check-cast v15, Lzj0/t;

    iget-object v3, v1, Lcom/whoop/service/rearchitect/c$g;->x:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/service/rearchitect/c;

    iget-object v11, v1, Lcom/whoop/service/rearchitect/c$g;->w:Ljava/lang/Object;

    check-cast v11, Lzj0/t;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, v14

    move-object v14, v3

    move v3, v4

    move v4, v5

    move v5, v9

    move-object v9, v11

    move v11, v12

    move-object v12, v13

    move-object v13, v15

    goto/16 :goto_7

    :cond_3
    iget v0, v1, Lcom/whoop/service/rearchitect/c$g;->J:I

    iget v3, v1, Lcom/whoop/service/rearchitect/c$g;->I:I

    iget v5, v1, Lcom/whoop/service/rearchitect/c$g;->H:I

    iget v11, v1, Lcom/whoop/service/rearchitect/c$g;->G:I

    iget-object v12, v1, Lcom/whoop/service/rearchitect/c$g;->F:Ljava/lang/Object;

    check-cast v12, Lcom/whoop/service/rearchitect/c$a;

    iget-object v12, v1, Lcom/whoop/service/rearchitect/c$g;->E:Ljava/lang/Object;

    check-cast v12, Lcom/whoop/service/rearchitect/c$a;

    iget-object v13, v1, Lcom/whoop/service/rearchitect/c$g;->z:Ljava/lang/Object;

    check-cast v13, Lcom/whoop/domain/model/WhoopStrapInfo;

    iget-object v14, v1, Lcom/whoop/service/rearchitect/c$g;->y:Ljava/lang/Object;

    check-cast v14, Lzj0/t;

    iget-object v15, v1, Lcom/whoop/service/rearchitect/c$g;->x:Ljava/lang/Object;

    check-cast v15, Lcom/whoop/service/rearchitect/c;

    iget-object v4, v1, Lcom/whoop/service/rearchitect/c$g;->w:Ljava/lang/Object;

    check-cast v4, Lzj0/t;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v4, v5

    move-object/from16 v5, p1

    goto/16 :goto_6

    :cond_4
    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v0, p1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    invoke-virtual {v0}, Lt92/b;->U1()Lq92/a;

    move-result-object v0

    sget-object v3, Lst0/j;->a:Lst0/j;

    invoke-virtual {v0, v3}, Lq92/a;->r(Lst0/f;)V

    iget-object v0, v1, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object v0

    iget v3, v1, Lcom/whoop/service/rearchitect/c$g;->M:I

    const-string v4, " BLE Synchronously sending Get Hello Command Packet Request Starting..."

    invoke-static {v3, v8, v4}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-array v4, v10, [Ljava/lang/Object;

    invoke-virtual {v0, v3, v4}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_1
    iget-object v0, v1, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    iput v9, v1, Lcom/whoop/service/rearchitect/c$g;->K:I

    invoke-static {v0, v1}, Lcom/whoop/service/rearchitect/c;->T2(Lcom/whoop/service/rearchitect/c;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_6

    goto/16 :goto_9

    :cond_6
    :goto_0
    check-cast v0, Lzj0/t;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :goto_1
    iget-object v3, v1, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    invoke-static {v3}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object v3

    const-string v4, "Failed to send hello response packet"

    new-array v11, v10, [Ljava/lang/Object;

    invoke-virtual {v3, v0, v4, v11}, Loh3/d;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->z2(Lcom/whoop/service/rearchitect/c;)Lus0/e;

    move-result-object v0

    new-instance v17, Lus0/d$d;

    iget-object v3, v1, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    invoke-virtual {v3}, Lcom/whoop/service/rearchitect/c;->w0()Lst0/v;

    move-result-object v18

    sget-object v19, Lus0/d$b;->FAIL:Lus0/d$b;

    const/16 v21, 0x4

    const/16 v22, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v17 .. v22}, Lus0/d$d;-><init>(Lst0/v;Lus0/d$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v17

    invoke-interface {v0, v3}, Lus0/e;->a(Lus0/d;)V

    const/4 v0, 0x0

    :goto_2
    if-nez v0, :cond_8

    iget-object v0, v1, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->z2(Lcom/whoop/service/rearchitect/c;)Lus0/e;

    move-result-object v0

    new-instance v11, Lus0/d$d;

    iget-object v2, v1, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    invoke-virtual {v2}, Lcom/whoop/service/rearchitect/c;->w0()Lst0/v;

    move-result-object v12

    sget-object v13, Lus0/d$b;->FAIL:Lus0/d$b;

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Lus0/d$d;-><init>(Lst0/v;Lus0/d$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v11}, Lus0/e;->a(Lus0/d;)V

    iget-object v0, v1, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    sget-object v2, Lmk0/a;->HELLO_PACKET_EXCHANGE_FAILED:Lmk0/a;

    invoke-static {v0, v2}, Lcom/whoop/service/rearchitect/c;->X2(Lcom/whoop/service/rearchitect/c;Lmk0/a;)V

    iget-object v0, v1, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->D2(Lcom/whoop/service/rearchitect/c;)Lor2/x;

    move-result-object v0

    invoke-virtual {v0}, Lor2/x;->b()V

    iget-object v0, v1, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object v0

    iget-object v2, v1, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    invoke-static {v2}, Lcom/whoop/service/rearchitect/c;->D2(Lcom/whoop/service/rearchitect/c;)Lor2/x;

    move-result-object v2

    invoke-virtual {v2}, Lor2/x;->a()I

    move-result v2

    const-string v3, "After incrementing failure counter for hello packet, current count now at "

    invoke-static {v2, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v3, v10, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Loh3/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->C2(Lcom/whoop/service/rearchitect/c;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v0

    const-string v2, "droid-remove-bond-on-hello-packet-failure"

    invoke-interface {v0, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, v1, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->D2(Lcom/whoop/service/rearchitect/c;)Lor2/x;

    move-result-object v0

    invoke-virtual {v0}, Lor2/x;->a()I

    move-result v0

    if-lt v0, v7, :cond_7

    iget-object v0, v1, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object v0

    const-string v2, "Threshold reached for the failure count, deleting bond information"

    new-array v3, v10, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Loh3/d;->n(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->D2(Lcom/whoop/service/rearchitect/c;)Lor2/x;

    move-result-object v0

    invoke-virtual {v0}, Lor2/x;->c()V

    iget-object v0, v1, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    invoke-virtual {v0}, Lcom/whoop/service/rearchitect/c;->c3()Z

    goto/16 :goto_a

    :cond_7
    iget-object v0, v1, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    invoke-virtual {v0}, Lcom/whoop/service/rearchitect/c;->C3()V

    goto/16 :goto_a

    :cond_8
    iget-object v15, v1, Lcom/whoop/service/rearchitect/c$g;->L:Lcom/whoop/service/rearchitect/c;

    iget v11, v1, Lcom/whoop/service/rearchitect/c$g;->M:I

    invoke-static {v15}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object v3

    invoke-interface {v0}, Lzj0/t;->G()Ljava/lang/String;

    move-result-object v4

    const-string v12, " BLE Synchronous send got Hello Command Response Packet Successfully: "

    invoke-static {v11, v8, v12, v4}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-array v12, v10, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v12}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v15}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object v3

    add-int/lit8 v4, v11, 0x1

    const-string v12, " BLE Synchronous Clock Synchronization Starting..."

    invoke-static {v4, v8, v12}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-array v12, v10, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v12}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v15}, Lt92/b;->A()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_9

    invoke-static {v15}, Lcom/whoop/service/rearchitect/c;->z2(Lcom/whoop/service/rearchitect/c;)Lus0/e;

    move-result-object v0

    new-instance v7, Lus0/d$d;

    invoke-virtual {v15}, Lcom/whoop/service/rearchitect/c;->w0()Lst0/v;

    move-result-object v8

    sget-object v9, Lus0/d$b;->FAIL:Lus0/d$b;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lus0/d$d;-><init>(Lst0/v;Lus0/d$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v7}, Lus0/e;->a(Lus0/d;)V

    invoke-static {v15}, Lcom/whoop/service/rearchitect/c;->A2(Lcom/whoop/service/rearchitect/c;)Lrr2/c;

    move-result-object v0

    new-instance v2, Lcom/whoop/domain/exception/BluetoothDeviceNameMissingException;

    invoke-direct {v2}, Lcom/whoop/domain/exception/BluetoothDeviceNameMissingException;-><init>()V

    const-string v3, "Disconnecting due to missing bluetooth device name"

    invoke-interface {v0, v2, v3}, Lrr2/c;->g(Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-virtual {v15}, Lt92/b;->D1()V

    return-object v6

    :cond_9
    instance-of v3, v0, Lzj0/t$b;

    if-eqz v3, :cond_a

    move-object v3, v0

    check-cast v3, Lzj0/t$b;

    invoke-interface {v3}, Lzj0/t$b;->c()Lst0/v;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-static {v15, v3}, Lcom/whoop/service/rearchitect/c;->Y2(Lcom/whoop/service/rearchitect/c;Lst0/v;)V

    :cond_a
    sget-object v3, Lcom/whoop/service/rearchitect/c;->r1:Lcom/whoop/service/rearchitect/c$b;

    invoke-virtual {v3}, Lcom/whoop/service/rearchitect/c$b;->c()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v3

    invoke-interface {v0}, Lzj0/t;->C()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {v15}, Lcom/whoop/service/rearchitect/c;->n3()Ljk0/g;

    move-result-object v3

    invoke-interface {v0}, Lzj0/t;->C()Z

    move-result v4

    if-eqz v4, :cond_b

    sget-object v4, Ljk0/a;->STRAP_ON_BODY:Ljk0/a;

    goto :goto_3

    :cond_b
    sget-object v4, Ljk0/a;->STRAP_OFF_BODY:Ljk0/a;

    :goto_3
    invoke-virtual {v3, v4}, Ljk0/g;->b(Ljk0/a;)V

    invoke-virtual {v15}, Lt92/b;->A()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getName(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v15}, Lcom/whoop/service/rearchitect/c;->w0()Lst0/v;

    move-result-object v4

    invoke-static {v15, v3, v0, v4}, Lcom/whoop/service/rearchitect/c;->x2(Lcom/whoop/service/rearchitect/c;Ljava/lang/String;Lzj0/t;Lst0/v;)Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v3

    invoke-static {v15, v3}, Lcom/whoop/service/rearchitect/c;->Z2(Lcom/whoop/service/rearchitect/c;Lcom/whoop/domain/model/WhoopStrapInfo;)V

    invoke-virtual {v15}, Lcom/whoop/service/rearchitect/c;->b()Lkk0/a;

    move-result-object v3

    invoke-interface {v0}, Lzj0/t;->b()Lkk0/a;

    move-result-object v4

    invoke-virtual {v3, v4}, Lkk0/a;->c(Lkk0/a;)V

    invoke-interface {v0}, Lzj0/t;->k()Lws0/a;

    move-result-object v3

    invoke-static {v15, v3}, Lcom/whoop/service/rearchitect/c;->a3(Lcom/whoop/service/rearchitect/c;Lws0/a;)V

    invoke-virtual {v15}, Lcom/whoop/service/rearchitect/c;->n()Lkk0/b;

    move-result-object v3

    invoke-interface {v0}, Lzj0/t;->r()Lkk0/b;

    move-result-object v4

    invoke-virtual {v3, v4}, Lkk0/b;->c(Lkk0/b;)V

    invoke-static {v15}, Lcom/whoop/service/rearchitect/c;->N2(Lcom/whoop/service/rearchitect/c;)Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object v4

    move v12, v10

    :goto_4
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v13

    if-ge v12, v13, :cond_d

    invoke-interface {v4, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v13

    int-to-char v13, v13

    const/16 v14, 0x30

    if-ne v13, v14, :cond_c

    add-int/lit8 v12, v12, 0x1

    goto :goto_4

    :cond_c
    move v4, v10

    goto :goto_5

    :cond_d
    move v4, v9

    :goto_5
    if-eqz v4, :cond_e

    invoke-virtual {v15}, Lcom/whoop/service/rearchitect/c;->y3()V

    invoke-static {v15}, Lcom/whoop/service/rearchitect/c;->z2(Lcom/whoop/service/rearchitect/c;)Lus0/e;

    move-result-object v12

    new-instance v17, Lus0/d$d;

    invoke-virtual {v15}, Lcom/whoop/service/rearchitect/c;->w0()Lst0/v;

    move-result-object v18

    sget-object v19, Lus0/d$b;->FAIL:Lus0/d$b;

    const/16 v21, 0x4

    const/16 v22, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v17 .. v22}, Lus0/d$d;-><init>(Lst0/v;Lus0/d$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v13, v17

    invoke-interface {v12, v13}, Lus0/e;->a(Lus0/d;)V

    :cond_e
    invoke-virtual {v3}, Lcom/whoop/domain/model/WhoopStrapInfo;->areCpuIdAndSerialValid()Z

    move-result v12

    if-nez v12, :cond_f

    invoke-static {v15, v3}, Lcom/whoop/service/rearchitect/c;->K2(Lcom/whoop/service/rearchitect/c;Lcom/whoop/domain/model/WhoopStrapInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v15}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object v2

    invoke-static {v15}, Lcom/whoop/service/rearchitect/c;->N2(Lcom/whoop/service/rearchitect/c;)Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Invalid strap: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v10, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v4}, Loh3/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v15}, Lt92/b;->U1()Lq92/a;

    move-result-object v2

    new-instance v3, Lst0/i;

    const/16 v4, 0x43

    invoke-direct {v3, v4, v0}, Lst0/i;-><init>(ILjava/lang/String;)V

    invoke-virtual {v2, v3}, Lq92/a;->r(Lst0/f;)V

    invoke-static {v15}, Lcom/whoop/service/rearchitect/c;->z2(Lcom/whoop/service/rearchitect/c;)Lus0/e;

    move-result-object v0

    new-instance v7, Lus0/d$d;

    invoke-virtual {v15}, Lcom/whoop/service/rearchitect/c;->w0()Lst0/v;

    move-result-object v8

    sget-object v9, Lus0/d$b;->FAIL:Lus0/d$b;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lus0/d$d;-><init>(Lst0/v;Lus0/d$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v7}, Lus0/e;->a(Lus0/d;)V

    invoke-virtual {v15}, Lt92/b;->D1()V

    return-object v6

    :cond_f
    invoke-virtual {v15}, Lcom/whoop/service/rearchitect/c;->j3()Lcom/whoop/service/rearchitect/c$c;

    move-result-object v12

    invoke-virtual {v12, v0}, Lcom/whoop/service/rearchitect/c$c;->g(Lzj0/t;)V

    invoke-virtual {v15}, Lt92/b;->U1()Lq92/a;

    move-result-object v12

    sget-object v13, Lst0/o;->a:Lst0/o;

    invoke-virtual {v12, v13}, Lq92/a;->r(Lst0/f;)V

    invoke-static {v15}, Lcom/whoop/service/rearchitect/c;->y2(Lcom/whoop/service/rearchitect/c;)Lcom/whoop/service/rearchitect/c$a;

    move-result-object v12

    if-eqz v12, :cond_14

    invoke-interface {v0}, Lzj0/t;->getTime()Lfk2/a;

    move-result-object v13

    const/4 v14, 0x0

    iput-object v14, v1, Lcom/whoop/service/rearchitect/c$g;->w:Ljava/lang/Object;

    iput-object v15, v1, Lcom/whoop/service/rearchitect/c$g;->x:Ljava/lang/Object;

    iput-object v0, v1, Lcom/whoop/service/rearchitect/c$g;->y:Ljava/lang/Object;

    iput-object v3, v1, Lcom/whoop/service/rearchitect/c$g;->z:Ljava/lang/Object;

    iput-object v12, v1, Lcom/whoop/service/rearchitect/c$g;->E:Ljava/lang/Object;

    iput-object v14, v1, Lcom/whoop/service/rearchitect/c$g;->F:Ljava/lang/Object;

    iput v11, v1, Lcom/whoop/service/rearchitect/c$g;->G:I

    iput v10, v1, Lcom/whoop/service/rearchitect/c$g;->H:I

    iput v4, v1, Lcom/whoop/service/rearchitect/c$g;->I:I

    iput v10, v1, Lcom/whoop/service/rearchitect/c$g;->J:I

    iput v5, v1, Lcom/whoop/service/rearchitect/c$g;->K:I

    invoke-virtual {v12, v13, v1}, Lcom/whoop/service/rearchitect/c$a;->b(Lfk2/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_10

    goto/16 :goto_9

    :cond_10
    move-object v14, v0

    move-object v13, v3

    move v3, v4

    move v0, v10

    move v4, v0

    :goto_6
    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_13

    const/4 v5, 0x0

    iput-object v5, v1, Lcom/whoop/service/rearchitect/c$g;->w:Ljava/lang/Object;

    iput-object v15, v1, Lcom/whoop/service/rearchitect/c$g;->x:Ljava/lang/Object;

    iput-object v14, v1, Lcom/whoop/service/rearchitect/c$g;->y:Ljava/lang/Object;

    iput-object v13, v1, Lcom/whoop/service/rearchitect/c$g;->z:Ljava/lang/Object;

    iput-object v12, v1, Lcom/whoop/service/rearchitect/c$g;->E:Ljava/lang/Object;

    iput-object v5, v1, Lcom/whoop/service/rearchitect/c$g;->F:Ljava/lang/Object;

    iput v11, v1, Lcom/whoop/service/rearchitect/c$g;->G:I

    iput v4, v1, Lcom/whoop/service/rearchitect/c$g;->H:I

    iput v3, v1, Lcom/whoop/service/rearchitect/c$g;->I:I

    iput v0, v1, Lcom/whoop/service/rearchitect/c$g;->J:I

    const/4 v5, 0x3

    iput v5, v1, Lcom/whoop/service/rearchitect/c$g;->K:I

    move v5, v9

    const-wide/16 v9, 0x1388

    invoke-virtual {v15, v9, v10, v1}, Lcom/whoop/service/rearchitect/c;->a1(JLq83/d;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v2, :cond_11

    goto/16 :goto_9

    :cond_11
    move-object v9, v13

    move-object v13, v14

    move-object v14, v15

    :goto_7
    invoke-static {v14}, Lcom/whoop/service/rearchitect/c;->z2(Lcom/whoop/service/rearchitect/c;)Lus0/e;

    move-result-object v10

    new-instance v17, Lus0/d$d;

    invoke-virtual {v14}, Lcom/whoop/service/rearchitect/c;->w0()Lst0/v;

    move-result-object v18

    sget-object v19, Lus0/d$b;->SUCCESS:Lus0/d$b;

    const/16 v21, 0x4

    const/16 v22, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v17 .. v22}, Lus0/d$d;-><init>(Lst0/v;Lus0/d$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v15, v17

    invoke-interface {v10, v15}, Lus0/e;->a(Lus0/d;)V

    invoke-static {v14}, Lcom/whoop/service/rearchitect/c;->M2(Lcom/whoop/service/rearchitect/c;)Lq92/h;

    move-result-object v17

    invoke-virtual {v14}, Lt92/b;->A()Landroid/bluetooth/BluetoothDevice;

    move-result-object v18

    invoke-virtual {v9}, Lcom/whoop/domain/model/WhoopStrapInfo;->getWhoopDeviceType()Lst0/v;

    move-result-object v19

    invoke-virtual {v14}, Lcom/whoop/service/rearchitect/c;->M0()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v9}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object v21

    invoke-virtual {v9}, Lcom/whoop/domain/model/WhoopStrapInfo;->getMaximVersion()Loh2/b;

    move-result-object v10

    invoke-interface {v10}, Loh2/b;->a()Ljava/lang/String;

    move-result-object v22

    invoke-virtual {v9}, Lcom/whoop/domain/model/WhoopStrapInfo;->getBluetoothVersion()Loh2/b;

    move-result-object v10

    invoke-interface {v10}, Loh2/b;->a()Ljava/lang/String;

    move-result-object v23

    invoke-virtual/range {v17 .. v23}, Lq92/h;->i(Landroid/bluetooth/BluetoothDevice;Lst0/v;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v14}, Lcom/whoop/service/rearchitect/c;->L2(Lcom/whoop/service/rearchitect/c;)Lq92/e;

    move-result-object v10

    invoke-virtual {v9}, Lcom/whoop/domain/model/WhoopStrapInfo;->getStrapSignature()Ljava/lang/String;

    move-result-object v9

    const/4 v15, 0x0

    iput-object v15, v1, Lcom/whoop/service/rearchitect/c$g;->w:Ljava/lang/Object;

    iput-object v14, v1, Lcom/whoop/service/rearchitect/c$g;->x:Ljava/lang/Object;

    iput-object v13, v1, Lcom/whoop/service/rearchitect/c$g;->y:Ljava/lang/Object;

    iput-object v15, v1, Lcom/whoop/service/rearchitect/c$g;->z:Ljava/lang/Object;

    iput-object v12, v1, Lcom/whoop/service/rearchitect/c$g;->E:Ljava/lang/Object;

    iput-object v15, v1, Lcom/whoop/service/rearchitect/c$g;->F:Ljava/lang/Object;

    iput v11, v1, Lcom/whoop/service/rearchitect/c$g;->G:I

    iput v4, v1, Lcom/whoop/service/rearchitect/c$g;->H:I

    iput v3, v1, Lcom/whoop/service/rearchitect/c$g;->I:I

    iput v0, v1, Lcom/whoop/service/rearchitect/c$g;->J:I

    const/4 v15, 0x4

    iput v15, v1, Lcom/whoop/service/rearchitect/c$g;->K:I

    invoke-virtual {v10, v9, v1}, Lq92/e;->d(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v2, :cond_12

    goto :goto_9

    :cond_12
    :goto_8
    invoke-static {v14}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object v9

    add-int/2addr v11, v5

    const-string v5, " BLE Synchronous Clock Synchronization Completed Successfully"

    invoke-static {v11, v8, v5}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x0

    new-array v8, v8, [Ljava/lang/Object;

    invoke-virtual {v9, v5, v8}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v14}, Lcom/whoop/service/rearchitect/c;->D2(Lcom/whoop/service/rearchitect/c;)Lor2/x;

    move-result-object v5

    invoke-virtual {v5}, Lor2/x;->c()V

    const/4 v15, 0x0

    invoke-static {v14, v15}, Lcom/whoop/service/rearchitect/c;->X2(Lcom/whoop/service/rearchitect/c;Lmk0/a;)V

    iput-object v15, v1, Lcom/whoop/service/rearchitect/c$g;->w:Ljava/lang/Object;

    iput-object v15, v1, Lcom/whoop/service/rearchitect/c$g;->x:Ljava/lang/Object;

    iput-object v15, v1, Lcom/whoop/service/rearchitect/c$g;->y:Ljava/lang/Object;

    iput-object v12, v1, Lcom/whoop/service/rearchitect/c$g;->z:Ljava/lang/Object;

    iput-object v15, v1, Lcom/whoop/service/rearchitect/c$g;->E:Ljava/lang/Object;

    iput-object v15, v1, Lcom/whoop/service/rearchitect/c$g;->F:Ljava/lang/Object;

    iput v4, v1, Lcom/whoop/service/rearchitect/c$g;->G:I

    iput v3, v1, Lcom/whoop/service/rearchitect/c$g;->H:I

    iput v0, v1, Lcom/whoop/service/rearchitect/c$g;->I:I

    iput v7, v1, Lcom/whoop/service/rearchitect/c$g;->K:I

    invoke-static {v14, v13, v1}, Lcom/whoop/service/rearchitect/c;->O2(Lcom/whoop/service/rearchitect/c;Lzj0/t;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_14

    :goto_9
    return-object v2

    :cond_13
    invoke-static {v15}, Lcom/whoop/service/rearchitect/c;->z2(Lcom/whoop/service/rearchitect/c;)Lus0/e;

    move-result-object v0

    new-instance v7, Lus0/d$d;

    invoke-virtual {v15}, Lcom/whoop/service/rearchitect/c;->w0()Lst0/v;

    move-result-object v8

    sget-object v9, Lus0/d$b;->FAIL:Lus0/d$b;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lus0/d$d;-><init>(Lst0/v;Lus0/d$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v7}, Lus0/e;->a(Lus0/d;)V

    sget-object v0, Lmk0/a;->SET_RTC_FAILED:Lmk0/a;

    invoke-static {v15, v0}, Lcom/whoop/service/rearchitect/c;->X2(Lcom/whoop/service/rearchitect/c;Lmk0/a;)V

    invoke-virtual {v15}, Lt92/b;->D1()V

    :cond_14
    :goto_a
    return-object v6
.end method
