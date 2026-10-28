.class public final Lt23/u3;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    iput p6, p0, Lt23/u3;->w:I

    iput-object p1, p0, Lt23/u3;->z:Ljava/lang/Object;

    iput-object p2, p0, Lt23/u3;->E:Ljava/lang/Object;

    iput-object p3, p0, Lt23/u3;->F:Ljava/lang/Object;

    iput-object p4, p0, Lt23/u3;->G:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 9

    iget v0, p0, Lt23/u3;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Lt23/u3;

    iget-object v0, p0, Lt23/u3;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/internal/e0;

    iget-object v0, p0, Lt23/u3;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ltf/d;

    iget-object v0, p0, Lt23/u3;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Luf/u;

    iget-object v0, p0, Lt23/u3;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lyf/e;

    const/4 v7, 0x1

    move-object v6, p1

    invoke-direct/range {v1 .. v7}, Lt23/u3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v1

    :pswitch_0
    move-object v6, p1

    new-instance v2, Lt23/u3;

    iget-object p1, p0, Lt23/u3;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lt23/b4;

    iget-object p1, p0, Lt23/u3;->E:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    iget-object p1, p0, Lt23/u3;->F:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    iget-object p1, p0, Lt23/u3;->G:Ljava/lang/Object;

    check-cast p1, Lio/getstream/android/video/generated/models/JoinCallRequest;

    const/4 v8, 0x0

    move-object v7, v6

    move-object v6, p1

    invoke-direct/range {v2 .. v8}, Lt23/u3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lt23/u3;->w:I

    check-cast p1, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, Lt23/u3;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/u3;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lt23/u3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1}, Lt23/u3;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/u3;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lt23/u3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v5, p0

    iget v0, v5, Lt23/u3;->w:I

    iget-object v1, v5, Lt23/u3;->G:Ljava/lang/Object;

    iget-object v2, v5, Lt23/u3;->F:Ljava/lang/Object;

    iget-object v3, v5, Lt23/u3;->E:Ljava/lang/Object;

    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v6, 0x0

    const/4 v7, 0x1

    iget-object v8, v5, Lt23/u3;->z:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    move-object v14, v8

    check-cast v14, Lkotlin/jvm/internal/e0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v8, v5, Lt23/u3;->x:I

    if-eqz v8, :cond_1

    if-ne v8, v7, :cond_0

    iget-object v0, v5, Lt23/u3;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lrg/f;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v10, v1

    move-object/from16 v1, p1

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :catch_0
    move-exception v0

    goto/16 :goto_4

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v8, "Attempt-"

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v8, v14, Lkotlin/jvm/internal/e0;->w:I

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v12, v3

    check-cast v12, Ltf/d;

    move-object v13, v2

    check-cast v13, Luf/u;

    move-object v15, v1

    check-cast v15, Lyf/e;

    sget-object v1, Lrg/d;->w:Lrg/d;

    const-class v1, Ltf/d;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-interface {v5}, Lq83/d;->getContext()Lq83/j;

    move-result-object v1

    invoke-static {v1}, Lbp/b;->w(Lq83/j;)Lmg/h;

    move-result-object v1

    invoke-interface {v1}, Lmg/h;->d()Lrg/n;

    move-result-object v1

    check-cast v1, Lrg/l;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v5}, Lq83/d;->getContext()Lq83/j;

    move-result-object v1

    invoke-static {v1}, Lds/q;->z(Lq83/j;)Lng/f;

    const-string v1, "name"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lrg/h;->s:Lrg/g;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, Lrg/g;->b:Lrg/f;

    :try_start_1
    invoke-interface {v5}, Lq83/d;->getContext()Lq83/j;

    move-result-object v1

    sget-object v2, Lmg/i;->x:Lg73/d;

    invoke-interface {v1, v2}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v1

    check-cast v1, Lmg/i;

    if-eqz v1, :cond_2

    iget-object v1, v1, Lmg/i;->w:Lmg/h;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Lmg/h;->b()Lng/d;

    move-result-object v1

    if-eqz v1, :cond_2

    sget-object v6, Lng/a;->a:Lng/f;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v1, v10

    goto :goto_6

    :catch_1
    move-exception v0

    move-object v1, v10

    goto :goto_4

    :cond_2
    :goto_0
    sget-object v1, Lq83/k;->w:Lq83/k;

    if-eqz v6, :cond_3

    :try_start_2
    new-instance v2, Lng/h;

    invoke-direct {v2, v6}, Lng/h;-><init>(Lng/f;)V

    goto :goto_1

    :cond_3
    invoke-interface {v5}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    sget-object v3, Lng/h;->x:Lng/f;

    invoke-interface {v2, v3}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v2

    check-cast v2, Lng/h;

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    move-object v2, v1

    :goto_1
    new-instance v3, Lrg/i;

    invoke-direct {v3, v10}, Lrg/i;-><init>(Lrg/h;)V

    invoke-interface {v3, v2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v2

    invoke-interface {v2, v1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v1

    new-instance v9, Ltf/a;

    const/4 v11, 0x0

    invoke-direct/range {v9 .. v15}, Ltf/a;-><init>(Lrg/h;Lq83/d;Ltf/d;Luf/u;Lkotlin/jvm/internal/e0;Lyf/e;)V

    iput-object v10, v5, Lt23/u3;->y:Ljava/lang/Object;

    iput v7, v5, Lt23/u3;->x:I

    invoke-static {v1, v9, v5}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v0, v1

    :goto_3
    return-object v0

    :goto_4
    :try_start_3
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v2, :cond_6

    const-string v2, "cancelled"

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2, v3}, Lrg/j;->n(Lrg/h;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_5

    :cond_6
    sget-object v2, Lrg/e;->w:[Lrg/e;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v0}, Lrg/j;->m(Lrg/h;Ljava/lang/Exception;)V

    :goto_5
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "withSpan<T> cannot be used on an anonymous object"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    check-cast v8, Lt23/b4;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lt23/u3;->x:I

    const/4 v10, 0x2

    if-eqz v0, :cond_a

    if-eq v0, v7, :cond_9

    if-ne v0, v10, :cond_8

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_9

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    iget-object v0, v5, Lt23/u3;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/android/video/generated/apis/ProductvideoApi;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    goto :goto_7

    :cond_a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v8, Lt23/b4;->E:Ly33/c;

    invoke-virtual {v0}, Ly33/c;->a()Lio/getstream/android/video/generated/apis/ProductvideoApi;

    move-result-object v0

    iput-object v0, v5, Lt23/u3;->y:Ljava/lang/Object;

    iput v7, v5, Lt23/u3;->x:I

    invoke-static {v8, v5}, Lt23/b4;->l(Lt23/b4;Ls83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v9, :cond_b

    goto :goto_8

    :cond_b
    :goto_7
    check-cast v4, Ljava/lang/String;

    check-cast v3, Ljava/lang/String;

    check-cast v2, Ljava/lang/String;

    check-cast v1, Lio/getstream/android/video/generated/models/JoinCallRequest;

    iput-object v6, v5, Lt23/u3;->y:Ljava/lang/Object;

    iput v10, v5, Lt23/u3;->x:I

    move-object/from16 v16, v4

    move-object v4, v1

    move-object v1, v3

    move-object/from16 v3, v16

    invoke-interface/range {v0 .. v5}, Lio/getstream/android/video/generated/apis/ProductvideoApi;->joinCall(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/JoinCallRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_c

    :goto_8
    move-object v0, v9

    :cond_c
    :goto_9
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
