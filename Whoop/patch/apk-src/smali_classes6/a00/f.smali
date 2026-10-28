.class public final La00/f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 1
    iput p5, p0, La00/f;->w:I

    iput-object p1, p0, La00/f;->y:Ljava/lang/Object;

    iput-object p2, p0, La00/f;->z:Ljava/lang/Object;

    iput-object p3, p0, La00/f;->E:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lt23/b4;Lio/getstream/android/video/generated/models/QueryCallsRequest;Lq83/d;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, La00/f;->w:I

    .line 2
    iput-object p1, p0, La00/f;->z:Ljava/lang/Object;

    iput-object p2, p0, La00/f;->E:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 8

    iget v0, p0, La00/f;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, La00/f;

    iget-object v0, p0, La00/f;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lx6/u;

    iget-object v0, p0, La00/f;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/glance/session/SessionWorker;

    iget-object v0, p0, La00/f;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp6/l;

    const/16 v6, 0x8

    move-object v5, p1

    invoke-direct/range {v1 .. v6}, La00/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v1

    :pswitch_0
    move-object v6, p1

    new-instance v2, La00/f;

    iget-object p1, p0, La00/f;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lwc/m0;

    iget-object p1, p0, La00/f;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lce/k;

    iget-object p1, p0, La00/f;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lgf/b;

    const/4 v7, 0x7

    invoke-direct/range {v2 .. v7}, La00/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_1
    move-object v6, p1

    new-instance p1, La00/f;

    iget-object v0, p0, La00/f;->z:Ljava/lang/Object;

    check-cast v0, Lt23/b4;

    iget-object v1, p0, La00/f;->E:Ljava/lang/Object;

    check-cast v1, Lio/getstream/android/video/generated/models/QueryCallsRequest;

    invoke-direct {p1, v0, v1, v6}, La00/f;-><init>(Lt23/b4;Lio/getstream/android/video/generated/models/QueryCallsRequest;Lq83/d;)V

    return-object p1

    :pswitch_2
    move-object v6, p1

    new-instance v2, La00/f;

    iget-object p1, p0, La00/f;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lpj/b0;

    iget-object p1, p0, La00/f;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    iget-object p1, p0, La00/f;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lp1/c1;

    const/4 v7, 0x5

    invoke-direct/range {v2 .. v7}, La00/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_3
    move-object v6, p1

    new-instance v2, La00/f;

    iget-object p1, p0, La00/f;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lm1/g;

    iget-object p1, p0, La00/f;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lc93/n;

    const/4 v7, 0x4

    iget-object v4, p0, La00/f;->z:Ljava/lang/Object;

    invoke-direct/range {v2 .. v7}, La00/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_4
    move-object v6, p1

    new-instance v2, La00/f;

    iget-object p1, p0, La00/f;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ll1/x4;

    iget-object p1, p0, La00/f;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, La6/e;

    iget-object p1, p0, La00/f;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lf0/z0;

    const/4 v7, 0x3

    invoke-direct/range {v2 .. v7}, La00/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_5
    move-object v6, p1

    new-instance v2, La00/f;

    iget-object p1, p0, La00/f;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lg1/a0;

    iget-object p1, p0, La00/f;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lc93/n;

    const/4 v7, 0x2

    iget-object v4, p0, La00/f;->z:Ljava/lang/Object;

    invoke-direct/range {v2 .. v7}, La00/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_6
    move-object v6, p1

    new-instance v2, La00/f;

    iget-object p1, p0, La00/f;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ld33/h1;

    iget-object p1, p0, La00/f;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lc43/v;

    iget-object p1, p0, La00/f;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lio/getstream/video/android/core/model/IceCandidate;

    const/4 v7, 0x1

    invoke-direct/range {v2 .. v7}, La00/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_7
    move-object v6, p1

    new-instance v2, La00/f;

    iget-object p1, p0, La00/f;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lwz/u0;

    iget-object p1, p0, La00/f;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, La00/g;

    iget-object p1, p0, La00/f;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ld00/l;

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, La00/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La00/f;->w:I

    check-cast p1, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, La00/f;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La00/f;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La00/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1}, La00/f;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La00/f;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La00/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1}, La00/f;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La00/f;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La00/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1}, La00/f;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La00/f;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La00/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p1}, La00/f;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La00/f;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La00/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0, p1}, La00/f;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La00/f;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La00/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p0, p1}, La00/f;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La00/f;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La00/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p0, p1}, La00/f;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La00/f;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La00/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-virtual {p0, p1}, La00/f;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La00/f;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La00/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v5, p0

    iget v0, v5, La00/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, v5, La00/f;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/glance/session/SessionWorker;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v1, v5, La00/f;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, La00/f;->y:Ljava/lang/Object;

    check-cast v1, Lx6/u;

    move-object v3, v1

    invoke-virtual {v0}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v4, v5, La00/f;->E:Ljava/lang/Object;

    check-cast v4, Lp6/l;

    move-object v7, v3

    iget-object v3, v0, Landroidx/glance/session/SessionWorker;->y:Lx6/t;

    move-object v8, v4

    new-instance v4, Lwr1/f;

    invoke-direct {v4, v0}, Lwr1/f;-><init>(Landroidx/glance/session/SessionWorker;)V

    iput v2, v5, La00/f;->x:I

    move-object v0, v7

    move-object v2, v8

    invoke-static/range {v0 .. v5}, Ls4/g;->c(Lx6/u;Landroid/content/Context;Lp6/l;Lx6/t;Lwr1/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object v6

    :goto_1
    return-object v6

    :pswitch_0
    iget-object v0, v5, La00/f;->y:Ljava/lang/Object;

    check-cast v0, Lwc/m0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v5, La00/f;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    if-ne v2, v3, :cond_3

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_3

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lwc/m0;->w:Ljava/lang/String;

    if-nez v2, :cond_7

    iget-object v2, v5, La00/f;->z:Ljava/lang/Object;

    check-cast v2, Lce/k;

    const/4 v4, 0x0

    if-eqz v2, :cond_5

    const-string v6, "region"

    invoke-virtual {v2, v6, v4}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_5
    move-object v2, v4

    :goto_2
    if-nez v2, :cond_7

    iget-object v2, v5, La00/f;->E:Ljava/lang/Object;

    check-cast v2, Lgf/b;

    sget-object v6, Lxd/a;->a:Lgf/a;

    invoke-interface {v2, v6}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_7

    iget-object v0, v0, Lwc/m0;->x:Lvg/n;

    iput v3, v5, La00/f;->x:I

    const/4 v2, 0x2

    invoke-static {v0, v4, v5, v2}, Lvd/f;->J(Lvg/n;Ls/m2;Ls83/i;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_3
    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    goto :goto_4

    :cond_7
    move-object v1, v2

    :goto_4
    return-object v1

    :pswitch_1
    iget-object v0, v5, La00/f;->z:Ljava/lang/Object;

    check-cast v0, Lt23/b4;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v5, La00/f;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_a

    if-eq v2, v4, :cond_9

    if-ne v2, v3, :cond_8

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_7

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    iget-object v0, v5, La00/f;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/android/video/generated/apis/ProductvideoApi;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v0

    move-object/from16 v0, p1

    goto :goto_5

    :cond_a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lt23/b4;->E:Ly33/c;

    invoke-virtual {v2}, Ly33/c;->a()Lio/getstream/android/video/generated/apis/ProductvideoApi;

    move-result-object v2

    iput-object v2, v5, La00/f;->y:Ljava/lang/Object;

    iput v4, v5, La00/f;->x:I

    invoke-static {v0, v5}, Lt23/b4;->l(Lt23/b4;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_b

    goto :goto_6

    :cond_b
    :goto_5
    check-cast v0, Ljava/lang/String;

    iget-object v4, v5, La00/f;->E:Ljava/lang/Object;

    check-cast v4, Lio/getstream/android/video/generated/models/QueryCallsRequest;

    const/4 v6, 0x0

    iput-object v6, v5, La00/f;->y:Ljava/lang/Object;

    iput v3, v5, La00/f;->x:I

    invoke-interface {v2, v0, v4, v5}, Lio/getstream/android/video/generated/apis/ProductvideoApi;->queryCalls(Ljava/lang/String;Lio/getstream/android/video/generated/models/QueryCallsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_c

    :goto_6
    move-object v0, v1

    :cond_c
    :goto_7
    return-object v0

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, La00/f;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_e

    if-ne v1, v2, :cond_d

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_8

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, La00/f;->y:Ljava/lang/Object;

    check-cast v1, Lpj/b0;

    iget-object v3, v5, La00/f;->z:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    new-instance v4, Lpj/a;

    iget-object v6, v5, La00/f;->E:Ljava/lang/Object;

    check-cast v6, Lp1/c1;

    const/4 v7, 0x0

    invoke-direct {v4, v7, v6}, Lpj/a;-><init>(ILp1/c1;)V

    new-instance v6, Lpj/b;

    const/4 v7, 0x0

    invoke-direct {v6, v2, v7}, Ls83/i;-><init>(ILq83/d;)V

    iput v2, v5, La00/f;->x:I

    invoke-interface {v1, v3, v4, v6, v5}, Lpj/b0;->a(Ljava/lang/String;Lpj/a;Lpj/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_f

    goto :goto_9

    :cond_f
    :goto_8
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_9
    return-object v0

    :pswitch_3
    iget-object v0, v5, La00/f;->y:Ljava/lang/Object;

    check-cast v0, Lm1/g;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v5, La00/f;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_11

    if-ne v2, v3, :cond_10

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_a

    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v5, La00/f;->z:Ljava/lang/Object;

    invoke-virtual {v0, v2}, Lm1/g;->h(Ljava/lang/Object;)V

    new-instance v2, Lm1/c;

    const/4 v4, 0x4

    invoke-direct {v2, v0, v4}, Lm1/c;-><init>(Lm1/g;I)V

    new-instance v4, Lg20/p;

    iget-object v6, v5, La00/f;->E:Ljava/lang/Object;

    check-cast v6, Lc93/n;

    const/4 v7, 0x0

    const/16 v8, 0x19

    invoke-direct {v4, v6, v0, v7, v8}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v3, v5, La00/f;->x:I

    invoke-static {v2, v4, v5}, Landroidx/compose/material3/internal/a;->a(Lc93/a;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_12

    goto :goto_b

    :cond_12
    :goto_a
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_b
    return-object v1

    :pswitch_4
    iget-object v0, v5, La00/f;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lf0/z0;

    iget-object v0, v5, La00/f;->z:Ljava/lang/Object;

    check-cast v0, La6/e;

    iget-object v2, v5, La00/f;->y:Ljava/lang/Object;

    check-cast v2, Ll1/x4;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v5, La00/f;->x:I

    const/4 v6, 0x2

    if-eqz v4, :cond_15

    const/4 v0, 0x1

    if-eq v4, v0, :cond_13

    if-ne v4, v6, :cond_14

    :cond_13
    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_c

    :catchall_0
    move-exception v0

    goto :goto_e

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance v4, Lkd/f;

    const/4 v7, 0x0

    const/4 v8, 0x5

    invoke-direct {v4, v0, v7, v8}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput v6, v5, La00/f;->x:I

    const-wide/16 v6, 0x5dc

    invoke-static {v6, v7, v4, v5}, Lbc3/k2;->b(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v0, v3, :cond_16

    goto :goto_d

    :cond_16
    :goto_c
    sget-object v0, Lf0/z0;->y:Lf0/z0;

    if-eq v1, v0, :cond_17

    invoke-virtual {v2}, Ll1/x4;->a()V

    :cond_17
    sget-object v3, Ll83/a0;->a:Ll83/a0;

    :goto_d
    return-object v3

    :goto_e
    sget-object v3, Lf0/z0;->y:Lf0/z0;

    if-eq v1, v3, :cond_18

    invoke-virtual {v2}, Ll1/x4;->a()V

    :cond_18
    throw v0

    :pswitch_5
    iget-object v0, v5, La00/f;->y:Ljava/lang/Object;

    check-cast v0, Lg1/a0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v5, La00/f;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1a

    if-ne v2, v3, :cond_19

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_f

    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v5, La00/f;->z:Ljava/lang/Object;

    iget-object v4, v0, Lg1/a0;->m:Lp1/k1;

    invoke-virtual {v4, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    new-instance v2, Lg1/t;

    const/4 v4, 0x4

    invoke-direct {v2, v0, v4}, Lg1/t;-><init>(Lg1/a0;I)V

    new-instance v4, La1/h;

    iget-object v6, v5, La00/f;->E:Ljava/lang/Object;

    check-cast v6, Lc93/n;

    const/4 v7, 0x0

    const/16 v8, 0x1b

    invoke-direct {v4, v6, v0, v7, v8}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v3, v5, La00/f;->x:I

    invoke-static {v2, v4, v5}, Lcom/squareup/wire/n;->j(Lc93/a;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_1b

    goto :goto_10

    :cond_1b
    :goto_f
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_10
    return-object v1

    :pswitch_6
    iget-object v0, v5, La00/f;->E:Ljava/lang/Object;

    check-cast v0, Lio/getstream/video/android/core/model/IceCandidate;

    iget-object v1, v5, La00/f;->z:Ljava/lang/Object;

    check-cast v1, Lc43/v;

    iget-object v2, v5, La00/f;->y:Ljava/lang/Object;

    check-cast v2, Ld33/h1;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v5, La00/f;->x:I

    const/4 v6, 0x0

    const/4 v7, 0x1

    const-string v8, "[sendIceCandidate] #sfu; #"

    if-eqz v4, :cond_1d

    if-ne v4, v7, :cond_1c

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_11

    :cond_1c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ld33/h1;->s()Lb23/k;

    move-result-object v4

    iget-object v9, v4, Lb23/k;->c:Lb23/e;

    iget-object v10, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->y:Lb23/g;

    invoke-interface {v9, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1e

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    invoke-static {v1}, Lx43/j;->U(Lc43/v;)Ljava/lang/String;

    move-result-object v9

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "; candidate: "

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v4, v11, v10, v9, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1e
    new-instance v12, Lstream/video/sfu/models/ICETrickle;

    invoke-static {v1}, Luf/c0;->n0(Lc43/v;)Lstream/video/sfu/models/PeerType;

    move-result-object v13

    sget-object v4, Lad3/c;->d:Lad3/b;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, Lio/getstream/video/android/core/model/IceCandidate;->Companion:Lio/getstream/video/android/core/model/a;

    invoke-virtual {v9}, Lio/getstream/video/android/core/model/a;->serializer()Lwc3/c;

    move-result-object v9

    check-cast v9, Lwc3/j;

    invoke-virtual {v4, v9, v0}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    iget-object v15, v2, Ld33/h1;->c:Ljava/lang/String;

    const/16 v17, 0x8

    const/16 v18, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v18}, Lstream/video/sfu/models/ICETrickle;-><init>(Lstream/video/sfu/models/PeerType;Ljava/lang/String;Ljava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2}, Ld33/h1;->s()Lb23/k;

    move-result-object v0

    iget-object v4, v0, Lb23/k;->c:Lb23/e;

    iget-object v9, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->x:Lb23/g;

    invoke-interface {v4, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1f

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-static {v1}, Lx43/j;->U(Lc43/v;)Ljava/lang/String;

    move-result-object v4

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "; iceTrickle: "

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v10, v9, v4, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1f
    iput v7, v5, La00/f;->x:I

    invoke-static {v2, v12, v5}, Ld33/h1;->e(Ld33/h1;Lstream/video/sfu/models/ICETrickle;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_20

    goto :goto_12

    :cond_20
    :goto_11
    check-cast v0, Ln23/h;

    invoke-virtual {v2}, Ld33/h1;->s()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v7, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_21

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-static {v1}, Lx43/j;->U(Lc43/v;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "; completed: "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v7, v4, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_21
    sget-object v3, Ll83/a0;->a:Ll83/a0;

    :goto_12
    return-object v3

    :pswitch_7
    iget-object v0, v5, La00/f;->z:Ljava/lang/Object;

    check-cast v0, La00/g;

    iget-object v0, v0, La00/g;->x:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, La00/g;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, La00/f;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_24

    if-eq v1, v3, :cond_23

    if-ne v1, v2, :cond_22

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_14

    :cond_22
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_23
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_13

    :cond_24
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, La00/f;->y:Ljava/lang/Object;

    check-cast v1, Lwz/u0;

    instance-of v4, v1, Lwz/s0;

    if-eqz v4, :cond_26

    check-cast v1, Lwz/s0;

    iget-object v8, v1, Lwz/s0;->x:Ly00/c0;

    iget-object v2, v5, La00/f;->E:Ljava/lang/Object;

    move-object v9, v2

    check-cast v9, Ld00/l;

    iget-object v10, v1, Lwz/s0;->y:Ljava/lang/String;

    iget-object v11, v1, Lwz/s0;->z:Ljava/lang/String;

    iput v3, v5, La00/f;->x:I

    new-instance v6, La00/h;

    const/4 v12, 0x1

    invoke-direct/range {v6 .. v12}, La00/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v7, v6, v5}, La00/g;->j(Lc93/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_25

    goto :goto_15

    :cond_25
    :goto_13
    move-object v0, v1

    check-cast v0, La00/o;

    goto :goto_15

    :cond_26
    instance-of v3, v1, Lwz/t0;

    if-eqz v3, :cond_28

    check-cast v1, Lwz/t0;

    iget-object v8, v1, Lwz/t0;->x:Lwz/q0;

    iget-object v3, v5, La00/f;->E:Ljava/lang/Object;

    move-object v9, v3

    check-cast v9, Ld00/l;

    iget-object v10, v1, Lwz/t0;->y:Ljava/lang/String;

    iget-object v11, v1, Lwz/t0;->z:Ljava/lang/String;

    iput v2, v5, La00/f;->x:I

    new-instance v6, La00/h;

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v12}, La00/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v7, v6, v5}, La00/g;->j(Lc93/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_27

    goto :goto_15

    :cond_27
    :goto_14
    move-object v0, v1

    check-cast v0, La00/o;

    :goto_15
    return-object v0

    :cond_28
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
