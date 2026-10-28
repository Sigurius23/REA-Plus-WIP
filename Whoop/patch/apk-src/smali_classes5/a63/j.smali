.class public final La63/j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILq83/d;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, La63/j;->w:I

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p3, p0, La63/j;->w:I

    iput-object p1, p0, La63/j;->E:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLq83/d;I)V
    .locals 0

    .line 3
    iput p4, p0, La63/j;->w:I

    iput-object p1, p0, La63/j;->z:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function3;Lq83/d;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, La63/j;->w:I

    .line 4
    iput-object p1, p0, La63/j;->y:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Lq83/d;Ll83/e;I)V
    .locals 0

    .line 5
    iput p3, p0, La63/j;->w:I

    iput-object p2, p0, La63/j;->y:Ljava/lang/Object;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, La63/j;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lr63/e;

    check-cast p3, Lq83/d;

    new-instance v0, La63/j;

    iget-object v1, p0, La63/j;->z:Ljava/lang/Object;

    check-cast v1, Lv53/c;

    const/16 v2, 0x9

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, p3, v2}, La63/j;-><init>(Ljava/lang/Object;ZLq83/d;I)V

    iput-object p1, v0, La63/j;->E:Ljava/lang/Object;

    iput-object p2, v0, La63/j;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lec3/m;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Lq83/d;

    new-instance v0, La63/j;

    iget-object v1, p0, La63/j;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function3;

    invoke-direct {v0, v1, p3}, La63/j;-><init>(Lkotlin/jvm/functions/Function3;Lq83/d;)V

    iput-object p1, v0, La63/j;->z:Ljava/lang/Object;

    iput-object p2, v0, La63/j;->E:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lec3/m;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Lq83/d;

    new-instance v0, La63/j;

    iget-object v1, p0, La63/j;->y:Ljava/lang/Object;

    check-cast v1, Lc93/p;

    const/4 v2, 0x7

    invoke-direct {v0, p3, v1, v2}, La63/j;-><init>(Lq83/d;Ll83/e;I)V

    iput-object p1, v0, La63/j;->z:Ljava/lang/Object;

    iput-object p2, v0, La63/j;->E:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lec3/m;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Lq83/d;

    new-instance v0, La63/j;

    iget-object v1, p0, La63/j;->y:Ljava/lang/Object;

    check-cast v1, Lc93/n;

    const/4 v2, 0x6

    invoke-direct {v0, p3, v1, v2}, La63/j;-><init>(Lq83/d;Ll83/e;I)V

    iput-object p1, v0, La63/j;->z:Ljava/lang/Object;

    iput-object p2, v0, La63/j;->E:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    new-instance v0, La63/j;

    iget-object v1, p0, La63/j;->E:Ljava/lang/Object;

    const/4 v2, 0x5

    invoke-direct {v0, v1, p3, v2}, La63/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La63/j;->z:Ljava/lang/Object;

    iput-object p2, v0, La63/j;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lr63/e;

    check-cast p2, Lf63/d;

    check-cast p3, Lq83/d;

    new-instance v0, La63/j;

    iget-object v1, p0, La63/j;->z:Ljava/lang/Object;

    check-cast v1, Lb63/f;

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, p3, v2}, La63/j;-><init>(Ljava/lang/Object;ZLq83/d;I)V

    iput-object p1, v0, La63/j;->E:Ljava/lang/Object;

    iput-object p2, v0, La63/j;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, La63/i0;

    check-cast p2, Le63/d;

    check-cast p3, Lq83/d;

    new-instance v0, La63/j;

    iget-object v1, p0, La63/j;->E:Ljava/lang/Object;

    check-cast v1, La63/o;

    const/4 v2, 0x3

    invoke-direct {v0, v1, p3, v2}, La63/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La63/j;->y:Ljava/lang/Object;

    iput-object p2, v0, La63/j;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lr63/e;

    check-cast p2, Lf63/d;

    check-cast p3, Lq83/d;

    new-instance v0, La63/j;

    iget-object v1, p0, La63/j;->E:Ljava/lang/Object;

    check-cast v1, La63/o;

    const/4 v2, 0x2

    invoke-direct {v0, v1, p3, v2}, La63/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La63/j;->y:Ljava/lang/Object;

    iput-object p2, v0, La63/j;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lr63/e;

    check-cast p3, Lq83/d;

    new-instance v0, La63/j;

    iget-object v1, p0, La63/j;->E:Ljava/lang/Object;

    check-cast v1, La63/o;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p3, v2}, La63/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La63/j;->y:Ljava/lang/Object;

    iput-object p2, v0, La63/j;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lr63/e;

    check-cast p2, Lf63/d;

    check-cast p3, Lq83/d;

    new-instance v0, La63/j;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p3}, La63/j;-><init>(ILq83/d;)V

    iput-object p1, v0, La63/j;->E:Ljava/lang/Object;

    iput-object p2, v0, La63/j;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
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
    .locals 29

    move-object/from16 v6, p0

    iget v0, v6, La63/j;->w:I

    const-string v1, "<this>"

    const/4 v2, 0x3

    const/4 v3, 0x4

    const/4 v4, 0x0

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    const/4 v8, 0x0

    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v9, 0x1

    const/4 v10, 0x2

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, La63/j;->x:I

    if-eqz v1, :cond_2

    if-eq v1, v9, :cond_1

    if-ne v1, v10, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v1, v6, La63/j;->y:Ljava/lang/Object;

    iget-object v2, v6, La63/j;->E:Ljava/lang/Object;

    check-cast v2, Lr63/e;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, La63/j;->E:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lr63/e;

    iget-object v1, v6, La63/j;->y:Ljava/lang/Object;

    instance-of v3, v1, Lw53/b;

    if-eqz v3, :cond_5

    iget-object v3, v6, La63/j;->z:Ljava/lang/Object;

    check-cast v3, Lv53/c;

    iget-object v3, v3, Lv53/c;->H:Lf63/b;

    move-object v4, v1

    check-cast v4, Lw53/b;

    invoke-virtual {v4}, Lw53/b;->d()Lf63/c;

    move-result-object v4

    iput-object v2, v6, La63/j;->E:Ljava/lang/Object;

    iput-object v1, v6, La63/j;->y:Ljava/lang/Object;

    iput v9, v6, La63/j;->x:I

    invoke-virtual {v3, v7, v4, v6}, Lr63/d;->a(Ljava/lang/Object;Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast v3, Lf63/c;

    move-object v4, v1

    check-cast v4, Lw53/b;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "response"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, v4, Lw53/b;->y:Lf63/c;

    iput-object v8, v6, La63/j;->E:Ljava/lang/Object;

    iput-object v8, v6, La63/j;->y:Ljava/lang/Object;

    iput v10, v6, La63/j;->x:I

    invoke-virtual {v2, v1, v6}, Lr63/e;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    :goto_1
    move-object v7, v0

    :cond_4
    :goto_2
    return-object v7

    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Error: HttpClientCall expected, but found "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x28

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, La63/j;->x:I

    if-eqz v1, :cond_8

    if-eq v1, v9, :cond_7

    if-ne v1, v10, :cond_6

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    iget-object v1, v6, La63/j;->z:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_3

    :cond_8
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, La63/j;->z:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v2, v6, La63/j;->E:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Object;

    iget-object v3, v6, La63/j;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function3;

    aget-object v4, v2, v4

    aget-object v2, v2, v9

    iput-object v1, v6, La63/j;->z:Ljava/lang/Object;

    iput v9, v6, La63/j;->x:I

    invoke-interface {v3, v4, v2, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_9

    goto :goto_4

    :cond_9
    :goto_3
    iput-object v8, v6, La63/j;->z:Ljava/lang/Object;

    iput v10, v6, La63/j;->x:I

    invoke-interface {v1, v2, v6}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_a

    :goto_4
    move-object v7, v0

    :cond_a
    :goto_5
    return-object v7

    :pswitch_1
    sget-object v11, Lr83/a;->w:Lr83/a;

    iget v0, v6, La63/j;->x:I

    if-eqz v0, :cond_d

    if-eq v0, v9, :cond_c

    if-ne v0, v10, :cond_b

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_8

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    iget-object v0, v6, La63/j;->z:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v0

    move-object/from16 v0, p1

    goto :goto_6

    :cond_d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v6, La63/j;->z:Ljava/lang/Object;

    move-object v12, v0

    check-cast v12, Lec3/m;

    iget-object v0, v6, La63/j;->E:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    iget-object v1, v6, La63/j;->y:Ljava/lang/Object;

    check-cast v1, Lc93/p;

    move-object v5, v0

    move-object v0, v1

    aget-object v1, v5, v4

    move v13, v2

    aget-object v2, v5, v9

    move v14, v3

    aget-object v3, v5, v10

    aget-object v4, v5, v13

    aget-object v5, v5, v14

    iput-object v12, v6, La63/j;->z:Ljava/lang/Object;

    iput v9, v6, La63/j;->x:I

    invoke-interface/range {v0 .. v6}, Lc93/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_e

    goto :goto_7

    :cond_e
    :goto_6
    iput-object v8, v6, La63/j;->z:Ljava/lang/Object;

    iput v10, v6, La63/j;->x:I

    invoke-interface {v12, v0, v6}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_f

    :goto_7
    move-object v7, v11

    :cond_f
    :goto_8
    return-object v7

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, La63/j;->x:I

    if-eqz v1, :cond_12

    if-eq v1, v9, :cond_11

    if-ne v1, v10, :cond_10

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_b

    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    iget-object v1, v6, La63/j;->z:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_9

    :cond_12
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, La63/j;->z:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v2, v6, La63/j;->E:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Object;

    iget-object v3, v6, La63/j;->y:Ljava/lang/Object;

    check-cast v3, Lc93/n;

    aget-object v4, v2, v4

    aget-object v5, v2, v9

    aget-object v2, v2, v10

    iput-object v1, v6, La63/j;->z:Ljava/lang/Object;

    iput v9, v6, La63/j;->x:I

    invoke-interface {v3, v4, v5, v2, v6}, Lc93/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_13

    goto :goto_a

    :cond_13
    :goto_9
    iput-object v8, v6, La63/j;->z:Ljava/lang/Object;

    iput v10, v6, La63/j;->x:I

    invoke-interface {v1, v2, v6}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_14

    :goto_a
    move-object v7, v0

    :cond_14
    :goto_b
    return-object v7

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, La63/j;->x:I

    if-eqz v1, :cond_17

    if-eq v1, v9, :cond_16

    if-ne v1, v10, :cond_15

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_e

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    iget-object v1, v6, La63/j;->z:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_c

    :cond_17
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, La63/j;->z:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v2, v6, La63/j;->y:Ljava/lang/Object;

    iget-object v3, v6, La63/j;->E:Ljava/lang/Object;

    iput-object v1, v6, La63/j;->z:Ljava/lang/Object;

    iput v9, v6, La63/j;->x:I

    invoke-interface {v3, v2, v6}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_18

    goto :goto_d

    :cond_18
    :goto_c
    iput-object v8, v6, La63/j;->z:Ljava/lang/Object;

    iput v10, v6, La63/j;->x:I

    invoke-interface {v1, v2, v6}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_19

    :goto_d
    move-object v7, v0

    :cond_19
    :goto_e
    return-object v7

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v6, La63/j;->x:I

    if-eqz v2, :cond_1c

    if-eq v2, v9, :cond_1b

    if-ne v2, v10, :cond_1a

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1a

    :cond_1a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    iget-object v1, v6, La63/j;->y:Ljava/lang/Object;

    check-cast v1, Ls63/a;

    iget-object v2, v6, La63/j;->E:Ljava/lang/Object;

    check-cast v2, Lr63/e;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v4, v1

    move-object/from16 v1, p1

    goto/16 :goto_18

    :cond_1c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v6, La63/j;->E:Ljava/lang/Object;

    check-cast v2, Lr63/e;

    iget-object v3, v6, La63/j;->y:Ljava/lang/Object;

    check-cast v3, Lf63/d;

    iget-object v4, v3, Lf63/d;->a:Ls63/a;

    iget-object v3, v3, Lf63/d;->b:Ljava/lang/Object;

    iget-object v5, v2, Lr63/e;->w:Ljava/lang/Object;

    check-cast v5, Lw53/b;

    invoke-virtual {v5}, Lw53/b;->d()Lf63/c;

    move-result-object v5

    invoke-interface {v5}, Li63/s;->getHeaders()Li63/m;

    move-result-object v5

    sget-object v11, Li63/r;->a:Ljava/util/List;

    const-string v11, "Content-Type"

    invoke-interface {v5, v11}, Lo63/m;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1d

    sget-object v11, Li63/d;->f:Li63/d;

    invoke-static {v5}, Ljc/x;->h0(Ljava/lang/String;)Li63/d;

    move-result-object v5

    goto :goto_f

    :cond_1d
    move-object v5, v8

    :goto_f
    if-nez v5, :cond_1e

    goto/16 :goto_1a

    :cond_1e
    iget-object v11, v2, Lr63/e;->w:Ljava/lang/Object;

    check-cast v11, Lw53/b;

    invoke-virtual {v11}, Lw53/b;->c()Le63/b;

    move-result-object v11

    invoke-interface {v11}, Li63/s;->getHeaders()Li63/m;

    move-result-object v11

    sget-object v12, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "defaultCharset"

    invoke-static {v12, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "Accept-Charset"

    invoke-interface {v11, v1}, Lo63/m;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lq83/g;->P(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v11, Li63/p;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    invoke-static {v1, v11}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_21

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Li63/h;

    iget-object v11, v11, Li63/h;->a:Ljava/lang/String;

    const-string v13, "*"

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_20

    move-object v1, v12

    goto :goto_10

    :cond_20
    invoke-static {v11}, Ljava/nio/charset/Charset;->isSupported(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_1f

    invoke-static {v11}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    goto :goto_10

    :cond_21
    move-object v1, v8

    :goto_10
    if-nez v1, :cond_22

    goto :goto_11

    :cond_22
    move-object v12, v1

    :goto_11
    iget-object v1, v6, La63/j;->z:Ljava/lang/Object;

    check-cast v1, Lb63/f;

    iput-object v2, v6, La63/j;->E:Ljava/lang/Object;

    iput-object v4, v6, La63/j;->y:Ljava/lang/Object;

    iput v9, v6, La63/j;->x:I

    instance-of v9, v3, Lio/ktor/utils/io/q;

    if-nez v9, :cond_23

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_12
    move-object v1, v8

    goto :goto_17

    :cond_23
    iget-object v9, v1, Lb63/f;->b:Ljava/util/Set;

    iget-object v11, v4, Ls63/a;->a:Lj93/d;

    invoke-interface {v9, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_24

    :goto_13
    goto :goto_12

    :cond_24
    iget-object v1, v1, Lb63/f;->a:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_25
    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_26

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v13, v11

    check-cast v13, Lb63/a;

    iget-object v13, v13, Lb63/a;->c:Li63/e;

    invoke-interface {v13, v5}, Li63/e;->a(Li63/d;)Z

    move-result v13

    if-eqz v13, :cond_25

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_26
    new-instance v1, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v9, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_15
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_27

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lb63/a;

    iget-object v9, v9, Lb63/a;->a:Lk63/b;

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_15

    :cond_27
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_28

    goto :goto_16

    :cond_28
    move-object v1, v8

    :goto_16
    if-nez v1, :cond_29

    goto :goto_13

    :cond_29
    check-cast v3, Lio/ktor/utils/io/q;

    invoke-static {v1, v3, v4, v12, v6}, Lhg3/i;->F(Ljava/util/ArrayList;Lio/ktor/utils/io/q;Ls63/a;Ljava/nio/charset/Charset;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    :goto_17
    if-ne v1, v0, :cond_2a

    goto :goto_19

    :cond_2a
    :goto_18
    if-nez v1, :cond_2b

    goto :goto_1a

    :cond_2b
    new-instance v3, Lf63/d;

    invoke-direct {v3, v4, v1}, Lf63/d;-><init>(Ls63/a;Ljava/lang/Object;)V

    iput-object v8, v6, La63/j;->E:Ljava/lang/Object;

    iput-object v8, v6, La63/j;->y:Ljava/lang/Object;

    iput v10, v6, La63/j;->x:I

    invoke-virtual {v2, v3, v6}, Lr63/e;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2c

    :goto_19
    move-object v7, v0

    :cond_2c
    :goto_1a
    return-object v7

    :pswitch_5
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, La63/j;->x:I

    if-eqz v1, :cond_2f

    if-eq v1, v9, :cond_2e

    if-ne v1, v10, :cond_2d

    iget-object v0, v6, La63/j;->y:Ljava/lang/Object;

    check-cast v0, Lw53/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1c

    :cond_2d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_1b

    :cond_2f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, La63/j;->y:Ljava/lang/Object;

    check-cast v1, La63/i0;

    iget-object v2, v6, La63/j;->z:Ljava/lang/Object;

    check-cast v2, Le63/d;

    iput-object v8, v6, La63/j;->y:Ljava/lang/Object;

    iput v9, v6, La63/j;->x:I

    invoke-interface {v1, v2, v6}, La63/i0;->a(Le63/d;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_30

    goto :goto_1c

    :cond_30
    :goto_1b
    check-cast v1, Lw53/b;

    iget-object v2, v6, La63/j;->E:Ljava/lang/Object;

    check-cast v2, La63/o;

    invoke-virtual {v1}, Lw53/b;->d()Lf63/c;

    move-result-object v3

    iput-object v1, v6, La63/j;->y:Ljava/lang/Object;

    iput v10, v6, La63/j;->x:I

    invoke-static {v2, v3, v6}, La63/o;->b(La63/o;Lf63/c;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_31

    goto :goto_1c

    :cond_31
    move-object v0, v1

    :goto_1c
    return-object v0

    :pswitch_6
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v0, v6, La63/j;->x:I

    if-eqz v0, :cond_34

    if-eq v0, v9, :cond_33

    if-eq v0, v10, :cond_32

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_32
    iget-object v0, v6, La63/j;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_20

    :cond_33
    iget-object v0, v6, La63/j;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lr63/e;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1f

    :catchall_0
    move-exception v0

    goto :goto_1d

    :cond_34
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v6, La63/j;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lr63/e;

    iget-object v0, v6, La63/j;->z:Ljava/lang/Object;

    check-cast v0, Lf63/d;

    :try_start_1
    iput-object v2, v6, La63/j;->y:Ljava/lang/Object;

    iput v9, v6, La63/j;->x:I

    invoke-virtual {v2, v0, v6}, Lr63/e;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v0, v1, :cond_35

    goto :goto_1e

    :goto_1d
    invoke-static {v0}, Lg63/b;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    iget-object v3, v6, La63/j;->E:Ljava/lang/Object;

    check-cast v3, La63/o;

    iget-object v2, v2, Lr63/e;->w:Ljava/lang/Object;

    check-cast v2, Lw53/b;

    invoke-virtual {v2}, Lw53/b;->c()Le63/b;

    iput-object v0, v6, La63/j;->y:Ljava/lang/Object;

    iput v10, v6, La63/j;->x:I

    invoke-static {v3, v6}, La63/o;->a(La63/o;Ls83/c;)V

    if-ne v7, v1, :cond_36

    :goto_1e
    move-object v7, v1

    :cond_35
    :goto_1f
    return-object v7

    :cond_36
    :goto_20
    throw v0

    :pswitch_7
    iget-object v0, v6, La63/j;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, La63/o;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v0, v6, La63/j;->x:I

    if-eqz v0, :cond_39

    if-eq v0, v9, :cond_38

    if-eq v0, v10, :cond_37

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_37
    iget-object v0, v6, La63/j;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_24

    :cond_38
    iget-object v0, v6, La63/j;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lr63/e;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_23

    :catchall_1
    move-exception v0

    goto :goto_21

    :cond_39
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v6, La63/j;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lr63/e;

    iget-object v0, v6, La63/j;->z:Ljava/lang/Object;

    :try_start_3
    iget-object v4, v3, Lr63/e;->w:Ljava/lang/Object;

    check-cast v4, Le63/d;

    iget-object v4, v4, Le63/d;->f:Lo63/f;

    sget-object v5, La63/p;->a:Lo63/a;

    new-instance v8, La3/l0;

    invoke-direct {v8, v1, v10}, La3/l0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v5, v8}, Lo63/f;->a(Lo63/a;Lc93/a;)Ljava/lang/Object;

    iput-object v3, v6, La63/j;->y:Ljava/lang/Object;

    iput v9, v6, La63/j;->x:I

    invoke-virtual {v3, v0, v6}, Lr63/e;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne v0, v2, :cond_3a

    goto :goto_22

    :goto_21
    invoke-static {v0}, Lg63/b;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    iget-object v3, v3, Lr63/e;->w:Ljava/lang/Object;

    check-cast v3, Le63/d;

    sget-object v4, La63/p;->a:Lo63/a;

    iget-object v4, v3, Le63/d;->b:Li63/t;

    iget-object v4, v3, Le63/d;->a:Li63/z;

    invoke-virtual {v4}, Li63/z;->b()Li63/e0;

    iget-object v3, v3, Le63/d;->c:Li63/n;

    new-instance v4, Li63/o;

    iget-object v3, v3, Lal/a;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    const-string v5, "values"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v3}, Lo63/o;-><init>(Ljava/util/Map;)V

    iput-object v0, v6, La63/j;->y:Ljava/lang/Object;

    iput v10, v6, La63/j;->x:I

    invoke-static {v1, v6}, La63/o;->a(La63/o;Ls83/c;)V

    if-ne v7, v2, :cond_3b

    :goto_22
    move-object v7, v2

    :cond_3a
    :goto_23
    return-object v7

    :cond_3b
    :goto_24
    throw v0

    :pswitch_8
    move v13, v2

    move v14, v3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v6, La63/j;->x:I

    packed-switch v2, :pswitch_data_1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_9
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5e

    :pswitch_a
    iget-object v2, v6, La63/j;->z:Ljava/lang/Object;

    check-cast v2, Lf63/c;

    iget-object v3, v6, La63/j;->y:Ljava/lang/Object;

    check-cast v3, Ls63/a;

    iget-object v5, v6, La63/j;->E:Ljava/lang/Object;

    check-cast v5, Lr63/e;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v23, v7

    move/from16 v22, v9

    const-wide/16 v17, 0x0

    move-object v9, v0

    move-object/from16 v0, p1

    goto/16 :goto_58

    :pswitch_b
    iget-object v1, v6, La63/j;->y:Ljava/lang/Object;

    check-cast v1, Ls63/a;

    iget-object v2, v6, La63/j;->E:Ljava/lang/Object;

    check-cast v2, Lr63/e;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v0

    move-object/from16 v23, v7

    move-object/from16 v0, p1

    goto/16 :goto_57

    :pswitch_c
    iget-object v1, v6, La63/j;->y:Ljava/lang/Object;

    check-cast v1, Ls63/a;

    iget-object v2, v6, La63/j;->E:Ljava/lang/Object;

    check-cast v2, Lr63/e;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v15, v1

    const-wide/16 v17, 0x0

    move-object/from16 v1, p1

    goto/16 :goto_26

    :pswitch_d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v6, La63/j;->E:Ljava/lang/Object;

    move-object v5, v2

    check-cast v5, Lr63/e;

    iget-object v2, v6, La63/j;->y:Ljava/lang/Object;

    check-cast v2, Lf63/d;

    const-wide/16 v17, 0x0

    iget-object v15, v2, Lf63/d;->a:Ls63/a;

    iget-object v2, v2, Lf63/d;->b:Ljava/lang/Object;

    instance-of v3, v2, Lio/ktor/utils/io/q;

    if-nez v3, :cond_3d

    :cond_3c
    move-object/from16 v23, v7

    goto/16 :goto_5d

    :cond_3d
    iget-object v3, v5, Lr63/e;->w:Ljava/lang/Object;

    check-cast v3, Lw53/b;

    invoke-virtual {v3}, Lw53/b;->d()Lf63/c;

    move-result-object v3

    iget-object v14, v15, Ls63/a;->a:Lj93/d;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v13, Ll83/a0;

    invoke-virtual {v4, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    invoke-static {v14, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    const-string v11, "Channel has been cancelled"

    if-eqz v13, :cond_3e

    check-cast v2, Lio/ktor/utils/io/q;

    check-cast v2, Lio/ktor/utils/io/m;

    new-instance v1, Ljava/util/concurrent/CancellationException;

    invoke-direct {v1, v11}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lio/ktor/utils/io/m;->i(Ljava/lang/Throwable;)Z

    new-instance v1, Lf63/d;

    invoke-direct {v1, v15, v7}, Lf63/d;-><init>(Ls63/a;Ljava/lang/Object;)V

    iput-object v8, v6, La63/j;->E:Ljava/lang/Object;

    iput v9, v6, La63/j;->x:I

    invoke-virtual {v5, v1, v6}, Lr63/e;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3c

    :goto_25
    move-object v9, v0

    goto/16 :goto_5c

    :cond_3e
    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    invoke-static {v14, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_85

    check-cast v2, Lio/ktor/utils/io/q;

    iput-object v5, v6, La63/j;->E:Ljava/lang/Object;

    iput-object v15, v6, La63/j;->y:Ljava/lang/Object;

    iput v10, v6, La63/j;->x:I

    check-cast v2, Lio/ktor/utils/io/m;

    invoke-virtual {v2, v6}, Lio/ktor/utils/io/m;->v(Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3f

    goto :goto_25

    :cond_3f
    move-object v2, v5

    :goto_26
    check-cast v1, Lv63/g;

    invoke-virtual {v1}, Lv63/g;->k()Z

    move-result v3

    if-eqz v3, :cond_40

    goto :goto_27

    :cond_40
    invoke-virtual {v1}, Lv63/g;->s()J

    move-result-wide v3

    cmp-long v5, v3, v17

    const v10, 0x7fffffff

    if-lez v5, :cond_5b

    int-to-long v13, v10

    cmp-long v5, v13, v3

    if-ltz v5, :cond_5b

    long-to-int v3, v3

    sget-object v4, Lyb3/a;->a:Ljava/nio/charset/Charset;

    const-string v5, "charset"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v4

    const-string v5, "charset.newDecoder()"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lu63/a;->a:Ljava/nio/CharBuffer;

    if-nez v3, :cond_41

    :goto_27
    const-string v1, ""

    :goto_28
    move-object/from16 v28, v0

    move-object/from16 v23, v7

    move-object/from16 v21, v8

    goto/16 :goto_54

    :cond_41
    iget v5, v1, Lv63/g;->E:I

    iget v10, v1, Lv63/g;->z:I

    sub-int/2addr v5, v10

    const-string v10, "cb.toString()"

    if-lt v5, v3, :cond_45

    iget-object v5, v1, Lv63/g;->y:Ljava/nio/ByteBuffer;

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v5

    if-eqz v5, :cond_42

    iget-object v5, v1, Lv63/g;->y:Ljava/nio/ByteBuffer;

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v9

    const-string v10, "bb.array()"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v10

    invoke-virtual {v5}, Ljava/nio/Buffer;->position()I

    move-result v5

    add-int/2addr v5, v10

    invoke-virtual {v1}, Lv63/g;->m()Lw63/a;

    move-result-object v10

    iget v10, v10, Lio/seon/androidsdk/service/e1;->b:I

    add-int/2addr v5, v10

    invoke-virtual {v4}, Ljava/nio/charset/CharsetDecoder;->charset()Ljava/nio/charset/Charset;

    move-result-object v4

    const-string v10, "charset()"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Ljava/lang/String;

    invoke-direct {v10, v9, v5, v3, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v1, v3}, Lv63/g;->b(I)V

    move-object/from16 v28, v0

    move-object/from16 v23, v7

    move-object/from16 v21, v8

    move-object v1, v10

    goto/16 :goto_54

    :cond_42
    invoke-static {v3}, Ljava/nio/CharBuffer;->allocate(I)Ljava/nio/CharBuffer;

    move-result-object v5

    iget-object v11, v1, Lv63/g;->y:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Lv63/g;->m()Lw63/a;

    move-result-object v12

    iget v12, v12, Lio/seon/androidsdk/service/e1;->b:I

    sget-object v13, Lt63/b;->a:Ljava/nio/ByteBuffer;

    invoke-static {v11, v12, v3}, Le93/b;->b0(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v4, v3, v5, v9}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;

    move-result-object v4

    invoke-virtual {v4}, Ljava/nio/charset/CoderResult;->isMalformed()Z

    move-result v9

    if-nez v9, :cond_43

    invoke-virtual {v4}, Ljava/nio/charset/CoderResult;->isUnmappable()Z

    move-result v9

    if-eqz v9, :cond_44

    :cond_43
    invoke-static {v4}, Lu63/a;->d(Ljava/nio/charset/CoderResult;)V

    :cond_44
    invoke-virtual {v5}, Ljava/nio/CharBuffer;->flip()Ljava/nio/Buffer;

    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    move-result v3

    invoke-virtual {v1, v3}, Lv63/g;->b(I)V

    invoke-virtual {v5}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_28

    :cond_45
    invoke-static {v3}, Ljava/nio/CharBuffer;->allocate(I)Ljava/nio/CharBuffer;

    move-result-object v5

    invoke-static {v1, v9}, Lw63/b;->b(Lv63/g;I)Lw63/a;

    move-result-object v11

    if-nez v11, :cond_46

    move-object/from16 v23, v7

    move-object/from16 v21, v8

    const/16 v20, 0x0

    move v8, v3

    goto/16 :goto_34

    :cond_46
    move-object/from16 v21, v8

    move v14, v9

    move/from16 v16, v14

    const/4 v13, 0x0

    move v8, v3

    :goto_29
    :try_start_4
    iget v9, v11, Lio/seon/androidsdk/service/e1;->c:I

    iget v12, v11, Lio/seon/androidsdk/service/e1;->b:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    sub-int/2addr v9, v12

    if-lt v9, v14, :cond_4f

    :try_start_5
    invoke-virtual {v5}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v9

    if-eqz v9, :cond_47

    if-nez v8, :cond_48

    :cond_47
    move-object/from16 v23, v7

    move/from16 p1, v8

    goto/16 :goto_2d

    :cond_48
    iget-object v9, v11, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v9, Ljava/nio/ByteBuffer;

    iget v12, v11, Lio/seon/androidsdk/service/e1;->b:I

    iget v13, v11, Lio/seon/androidsdk/service/e1;->c:I

    sub-int/2addr v13, v12

    sget-object v14, Lt63/b;->a:Ljava/nio/ByteBuffer;

    invoke-static {v9, v12, v13}, Le93/b;->b0(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v9

    invoke-virtual {v9}, Ljava/nio/Buffer;->limit()I

    move-result v12

    invoke-virtual {v9}, Ljava/nio/Buffer;->position()I

    move-result v14

    move-object/from16 v23, v7

    sub-int v7, v12, v14

    if-lt v7, v8, :cond_49

    const/4 v7, 0x1

    goto :goto_2a

    :cond_49
    const/4 v7, 0x0

    :goto_2a
    if-eqz v7, :cond_4a

    move/from16 p1, v8

    add-int v8, v14, p1

    invoke-virtual {v9, v8}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    goto :goto_2b

    :catchall_2
    move-exception v0

    goto :goto_2f

    :cond_4a
    move/from16 p1, v8

    :goto_2b
    invoke-virtual {v4, v9, v5, v7}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;

    move-result-object v8

    invoke-virtual {v8}, Ljava/nio/charset/CoderResult;->isMalformed()Z

    move-result v17

    if-nez v17, :cond_4b

    invoke-virtual {v8}, Ljava/nio/charset/CoderResult;->isUnmappable()Z

    move-result v17

    if-eqz v17, :cond_4c

    :cond_4b
    invoke-static {v8}, Lu63/a;->d(Ljava/nio/charset/CoderResult;)V

    :cond_4c
    invoke-virtual {v8}, Ljava/nio/charset/CoderResult;->isUnderflow()Z

    move-result v8

    if-eqz v8, :cond_4d

    invoke-virtual {v9}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v8

    if-eqz v8, :cond_4d

    add-int/lit8 v16, v16, 0x1

    goto :goto_2c

    :cond_4d
    const/16 v16, 0x1

    :goto_2c
    invoke-virtual {v9, v12}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {v9}, Ljava/nio/Buffer;->position()I

    move-result v8

    sub-int/2addr v8, v14

    sub-int v8, p1, v8

    invoke-virtual {v9}, Ljava/nio/Buffer;->limit()I

    move-result v12

    if-ne v12, v13, :cond_4e

    invoke-virtual {v9}, Ljava/nio/Buffer;->position()I

    move-result v9

    invoke-virtual {v11, v9}, Lio/seon/androidsdk/service/e1;->d(I)V

    move v13, v7

    move/from16 v7, v16

    goto :goto_2e

    :cond_4e
    const-string v0, "Buffer\'s limit change is not allowed"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :goto_2d
    move/from16 v8, p1

    const/4 v7, 0x0

    :goto_2e
    :try_start_6
    iget v9, v11, Lio/seon/androidsdk/service/e1;->c:I

    iget v12, v11, Lio/seon/androidsdk/service/e1;->b:I

    sub-int/2addr v9, v12

    move v14, v7

    goto :goto_30

    :catchall_3
    move-exception v0

    const/4 v4, 0x1

    goto/16 :goto_35

    :goto_2f
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :cond_4f
    move-object/from16 v23, v7

    move/from16 p1, v8

    :goto_30
    if-nez v9, :cond_50

    :try_start_7
    invoke-static {v1, v11}, Lw63/b;->c(Lv63/g;Lw63/a;)Lw63/a;

    move-result-object v7

    goto :goto_32

    :catchall_4
    move-exception v0

    const/4 v4, 0x0

    goto/16 :goto_35

    :cond_50
    if-lt v9, v14, :cond_52

    iget v7, v11, Lio/seon/androidsdk/service/e1;->f:I

    iget v9, v11, Lio/seon/androidsdk/service/e1;->e:I

    sub-int/2addr v7, v9

    const/16 v9, 0x8

    if-ge v7, v9, :cond_51

    goto :goto_31

    :cond_51
    move-object v7, v11

    goto :goto_32

    :cond_52
    :goto_31
    invoke-static {v1, v11}, Lw63/b;->a(Lv63/g;Lw63/a;)V

    invoke-static {v1, v14}, Lw63/b;->b(Lv63/g;I)Lw63/a;

    move-result-object v7
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :goto_32
    if-nez v7, :cond_53

    const/16 v20, 0x0

    goto :goto_33

    :cond_53
    move-object v11, v7

    if-gtz v14, :cond_59

    const/16 v20, 0x1

    :goto_33
    if-eqz v20, :cond_54

    invoke-static {v1, v11}, Lw63/b;->a(Lv63/g;Lw63/a;)V

    :cond_54
    move/from16 v20, v13

    :goto_34
    invoke-virtual {v5}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-eqz v1, :cond_56

    if-nez v20, :cond_56

    sget-object v1, Lu63/a;->b:Ljava/nio/ByteBuffer;

    const/4 v7, 0x1

    invoke-virtual {v4, v1, v5, v7}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/charset/CoderResult;->isMalformed()Z

    move-result v4

    if-nez v4, :cond_55

    invoke-virtual {v1}, Ljava/nio/charset/CoderResult;->isUnmappable()Z

    move-result v4

    if-eqz v4, :cond_56

    :cond_55
    invoke-static {v1}, Lu63/a;->d(Ljava/nio/charset/CoderResult;)V

    :cond_56
    if-gtz v8, :cond_58

    if-ltz v8, :cond_57

    invoke-virtual {v5}, Ljava/nio/CharBuffer;->flip()Ljava/nio/Buffer;

    invoke-virtual {v5}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v28, v0

    goto/16 :goto_54

    :cond_57
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "remainingInputBytes < 0"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_58
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Not enough bytes available: had only "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sub-int v2, v3, v8

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " instead of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_59
    move-object/from16 v7, v23

    goto/16 :goto_29

    :goto_35
    if-eqz v4, :cond_5a

    invoke-static {v1, v11}, Lw63/b;->a(Lv63/g;Lw63/a;)V

    :cond_5a
    throw v0

    :cond_5b
    move-object/from16 v23, v7

    move-object/from16 v21, v8

    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v4, 0x10

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v1}, Lv63/g;->k()Z

    move-result v4

    if-eqz v4, :cond_5c

    move-object/from16 v28, v0

    goto/16 :goto_53

    :cond_5c
    const/4 v7, 0x1

    invoke-static {v1, v7}, Lw63/b;->b(Lv63/g;I)Lw63/a;

    move-result-object v4

    const/16 v5, 0x80

    if-nez v4, :cond_5d

    const/4 v7, 0x0

    const/4 v8, 0x0

    goto :goto_3d

    :cond_5d
    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_36
    :try_start_8
    iget-object v9, v4, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v9, Ljava/nio/ByteBuffer;

    iget v11, v4, Lio/seon/androidsdk/service/e1;->b:I

    iget v12, v4, Lio/seon/androidsdk/service/e1;->c:I

    move v13, v11

    :goto_37
    if-ge v13, v12, :cond_61

    invoke-virtual {v9, v13}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v14

    and-int/lit16 v10, v14, 0xff

    and-int/2addr v14, v5

    if-eq v14, v5, :cond_60

    int-to-char v10, v10

    const v14, 0x7fffffff

    if-ne v7, v14, :cond_5e

    const/4 v10, 0x0

    goto :goto_38

    :cond_5e
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    add-int/lit8 v7, v7, 0x1

    const/4 v10, 0x1

    :goto_38
    if-nez v10, :cond_5f

    goto :goto_39

    :cond_5f
    add-int/lit8 v13, v13, 0x1

    const v10, 0x7fffffff

    goto :goto_37

    :catchall_5
    move-exception v0

    const/16 v22, 0x1

    goto/16 :goto_55

    :cond_60
    :goto_39
    sub-int/2addr v13, v11

    invoke-virtual {v4, v13}, Lio/seon/androidsdk/service/e1;->d(I)V

    const/4 v9, 0x0

    goto :goto_3a

    :cond_61
    sub-int/2addr v12, v11

    invoke-virtual {v4, v12}, Lio/seon/androidsdk/service/e1;->d(I)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    const/4 v9, 0x1

    :goto_3a
    if-eqz v9, :cond_62

    const/4 v9, 0x1

    goto :goto_3c

    :cond_62
    const v14, 0x7fffffff

    if-ne v7, v14, :cond_63

    :goto_3b
    const/4 v9, 0x0

    goto :goto_3c

    :cond_63
    const/4 v8, 0x1

    goto :goto_3b

    :goto_3c
    if-nez v9, :cond_64

    invoke-static {v1, v4}, Lw63/b;->a(Lv63/g;Lw63/a;)V

    goto :goto_3d

    :cond_64
    :try_start_9
    invoke-static {v1, v4}, Lw63/b;->c(Lv63/g;Lw63/a;)Lw63/a;

    move-result-object v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_b

    if-nez v4, :cond_83

    :goto_3d
    const-string v4, " chars but had only "

    const-string v9, "Premature end of stream: expected at least "

    if-eqz v8, :cond_81

    rsub-int/lit8 v8, v7, 0x0

    const v14, 0x7fffffff

    sub-int v10, v14, v7

    const/4 v7, 0x1

    invoke-static {v1, v7}, Lw63/b;->b(Lv63/g;I)Lw63/a;

    move-result-object v11

    if-nez v11, :cond_65

    move-object/from16 v28, v0

    const/4 v12, 0x0

    goto/16 :goto_51

    :cond_65
    const/4 v7, 0x1

    const/4 v12, 0x0

    :goto_3e
    :try_start_a
    iget v13, v11, Lio/seon/androidsdk/service/e1;->c:I

    iget v14, v11, Lio/seon/androidsdk/service/e1;->b:I
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    sub-int v5, v13, v14

    if-lt v5, v7, :cond_78

    :try_start_b
    iget-object v7, v11, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v7, Ljava/nio/ByteBuffer;

    move/from16 v19, v14

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    :goto_3f
    if-ge v14, v13, :cond_75

    move/from16 v24, v13

    invoke-virtual {v7, v14}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v13

    move-object/from16 v25, v7

    and-int/lit16 v7, v13, 0xff

    move/from16 v26, v14

    and-int/lit16 v14, v13, 0x80

    const/16 v27, -0x1

    if-nez v14, :cond_69

    if-nez v16, :cond_68

    int-to-char v7, v7

    if-ne v12, v10, :cond_66

    const/4 v7, 0x0

    goto :goto_40

    :cond_66
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    add-int/lit8 v12, v12, 0x1

    const/4 v7, 0x1

    :goto_40
    if-nez v7, :cond_67

    sub-int v14, v26, v19

    invoke-virtual {v11, v14}, Lio/seon/androidsdk/service/e1;->d(I)V

    move-object/from16 v28, v0

    :goto_41
    const/16 v22, 0x1

    goto/16 :goto_49

    :catchall_6
    move-exception v0

    const/16 v22, 0x1

    goto/16 :goto_4c

    :cond_67
    move-object/from16 v28, v0

    :goto_42
    const/16 v22, 0x1

    goto/16 :goto_48

    :cond_68
    invoke-static/range {v16 .. v16}, Ls7/a;->n(I)V

    throw v21

    :cond_69
    if-nez v16, :cond_6c

    move-object/from16 v28, v0

    move/from16 v13, v16

    const/4 v14, 0x1

    move/from16 v16, v7

    const/16 v7, 0x80

    :goto_43
    const/4 v0, 0x7

    if-ge v14, v0, :cond_6a

    and-int v0, v16, v7

    if-eqz v0, :cond_6a

    not-int v0, v7

    and-int v16, v16, v0

    shr-int/lit8 v7, v7, 0x1

    add-int/lit8 v13, v13, 0x1

    add-int/lit8 v14, v14, 0x1

    goto :goto_43

    :cond_6a
    add-int/lit8 v0, v13, -0x1

    sub-int v7, v24, v26

    if-le v13, v7, :cond_6b

    sub-int v14, v26, v19

    invoke-virtual {v11, v14}, Lio/seon/androidsdk/service/e1;->d(I)V

    move/from16 v27, v13

    goto :goto_41

    :cond_6b
    move/from16 v18, v13

    move/from16 v17, v16

    const/16 v22, 0x1

    move/from16 v16, v0

    goto/16 :goto_48

    :cond_6c
    move-object/from16 v28, v0

    shl-int/lit8 v0, v17, 0x6

    and-int/lit8 v7, v13, 0x7f

    or-int/2addr v0, v7

    add-int/lit8 v16, v16, -0x1

    if-nez v16, :cond_74

    invoke-static {v0}, Ls7/a;->i(I)Z

    move-result v7

    if-eqz v7, :cond_6e

    int-to-char v0, v0

    if-ne v12, v10, :cond_6d

    const/4 v0, 0x0

    goto :goto_44

    :cond_6d
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    add-int/lit8 v12, v12, 0x1

    const/4 v0, 0x1

    :goto_44
    if-nez v0, :cond_71

    sub-int v14, v26, v19

    sub-int v14, v14, v18

    const/16 v22, 0x1

    add-int/lit8 v14, v14, 0x1

    invoke-virtual {v11, v14}, Lio/seon/androidsdk/service/e1;->d(I)V

    goto :goto_41

    :cond_6e
    invoke-static {v0}, Ls7/a;->j(I)Z

    move-result v7

    if-eqz v7, :cond_73

    invoke-static {v0}, Ls7/a;->h(I)I

    move-result v7

    int-to-char v7, v7

    if-ne v12, v10, :cond_6f

    const/4 v7, 0x0

    goto :goto_45

    :cond_6f
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    add-int/lit8 v12, v12, 0x1

    const/4 v7, 0x1

    :goto_45
    if-eqz v7, :cond_72

    invoke-static {v0}, Ls7/a;->l(I)I

    move-result v0

    int-to-char v0, v0

    if-ne v12, v10, :cond_70

    const/4 v0, 0x0

    goto :goto_46

    :cond_70
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    add-int/lit8 v12, v12, 0x1

    const/4 v0, 0x1

    :goto_46
    if-nez v0, :cond_71

    goto :goto_47

    :cond_71
    const/16 v17, 0x0

    goto/16 :goto_42

    :cond_72
    :goto_47
    sub-int v14, v26, v19

    sub-int v14, v14, v18

    const/16 v22, 0x1

    add-int/lit8 v14, v14, 0x1

    :try_start_c
    invoke-virtual {v11, v14}, Lio/seon/androidsdk/service/e1;->d(I)V

    goto :goto_49

    :catchall_7
    move-exception v0

    goto :goto_4c

    :cond_73
    const/16 v22, 0x1

    invoke-static {v0}, Ls7/a;->o(I)V

    throw v21

    :cond_74
    const/16 v22, 0x1

    move/from16 v17, v0

    :goto_48
    add-int/lit8 v14, v26, 0x1

    move/from16 v13, v24

    move-object/from16 v7, v25

    move-object/from16 v0, v28

    goto/16 :goto_3f

    :cond_75
    move-object/from16 v28, v0

    const/16 v22, 0x1

    invoke-virtual {v11, v5}, Lio/seon/androidsdk/service/e1;->d(I)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    const/16 v27, 0x0

    :goto_49
    if-nez v27, :cond_76

    move/from16 v27, v22

    goto :goto_4a

    :cond_76
    if-lez v27, :cond_77

    goto :goto_4a

    :cond_77
    const/16 v27, 0x0

    :goto_4a
    :try_start_d
    iget v0, v11, Lio/seon/androidsdk/service/e1;->c:I

    iget v5, v11, Lio/seon/androidsdk/service/e1;->b:I

    sub-int v5, v0, v5

    move/from16 v7, v27

    goto :goto_4d

    :catchall_8
    move-exception v0

    :goto_4b
    move/from16 v4, v22

    goto :goto_52

    :goto_4c
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    :cond_78
    move-object/from16 v28, v0

    const/16 v22, 0x1

    :goto_4d
    if-nez v5, :cond_79

    :try_start_e
    invoke-static {v1, v11}, Lw63/b;->c(Lv63/g;Lw63/a;)Lw63/a;

    move-result-object v0

    goto :goto_4f

    :catchall_9
    move-exception v0

    const/4 v4, 0x0

    goto :goto_52

    :cond_79
    if-lt v5, v7, :cond_7b

    iget v0, v11, Lio/seon/androidsdk/service/e1;->f:I

    iget v5, v11, Lio/seon/androidsdk/service/e1;->e:I

    sub-int/2addr v0, v5

    const/16 v5, 0x8

    if-ge v0, v5, :cond_7a

    goto :goto_4e

    :cond_7a
    move-object v0, v11

    goto :goto_4f

    :cond_7b
    :goto_4e
    invoke-static {v1, v11}, Lw63/b;->a(Lv63/g;Lw63/a;)V

    invoke-static {v1, v7}, Lw63/b;->b(Lv63/g;I)Lw63/a;

    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    :goto_4f
    if-nez v0, :cond_7c

    const/16 v20, 0x0

    goto :goto_50

    :cond_7c
    move-object v11, v0

    if-gtz v7, :cond_7f

    move/from16 v20, v22

    :goto_50
    if-eqz v20, :cond_7d

    invoke-static {v1, v11}, Lw63/b;->a(Lv63/g;Lw63/a;)V

    :cond_7d
    :goto_51
    if-lt v12, v8, :cond_7e

    goto :goto_53

    :cond_7e
    new-instance v0, Lio/ktor/utils/io/core/internal/MalformedUTF8InputException;

    invoke-static {v8, v12, v9, v4}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/ktor/utils/io/core/internal/MalformedUTF8InputException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7f
    move-object/from16 v0, v28

    const/16 v5, 0x80

    goto/16 :goto_3e

    :catchall_a
    move-exception v0

    const/16 v22, 0x1

    goto :goto_4b

    :goto_52
    if-eqz v4, :cond_80

    invoke-static {v1, v11}, Lw63/b;->a(Lv63/g;Lw63/a;)V

    :cond_80
    throw v0

    :cond_81
    move-object/from16 v28, v0

    if-ltz v7, :cond_82

    :goto_53
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v0, "StringBuilder(capacity).\u2026builderAction).toString()"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_54
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    new-instance v1, Ljava/lang/Integer;

    invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(I)V

    new-instance v0, Lf63/d;

    invoke-direct {v0, v15, v1}, Lf63/d;-><init>(Ls63/a;Ljava/lang/Object;)V

    move-object/from16 v1, v21

    iput-object v1, v6, La63/j;->E:Ljava/lang/Object;

    iput-object v1, v6, La63/j;->y:Ljava/lang/Object;

    const/4 v13, 0x3

    iput v13, v6, La63/j;->x:I

    invoke-virtual {v2, v0, v6}, Lr63/e;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v9, v28

    if-ne v0, v9, :cond_90

    goto/16 :goto_5c

    :cond_82
    new-instance v0, Lio/ktor/utils/io/core/internal/MalformedUTF8InputException;

    const/4 v1, 0x0

    invoke-static {v1, v7, v9, v4}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/ktor/utils/io/core/internal/MalformedUTF8InputException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_83
    const/16 v22, 0x1

    const v10, 0x7fffffff

    const/16 v21, 0x0

    goto/16 :goto_36

    :catchall_b
    move-exception v0

    const/16 v22, 0x0

    :goto_55
    if-eqz v22, :cond_84

    invoke-static {v1, v4}, Lw63/b;->a(Lv63/g;Lw63/a;)V

    :cond_84
    throw v0

    :cond_85
    move-object/from16 v23, v7

    move/from16 v22, v9

    move-object v9, v0

    const-class v0, Lv63/e;

    invoke-virtual {v4, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_86

    move/from16 v7, v22

    goto :goto_56

    :cond_86
    const-class v0, Lv63/g;

    invoke-virtual {v4, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    :goto_56
    if-eqz v7, :cond_88

    check-cast v2, Lio/ktor/utils/io/q;

    iput-object v5, v6, La63/j;->E:Ljava/lang/Object;

    iput-object v15, v6, La63/j;->y:Ljava/lang/Object;

    const/4 v14, 0x4

    iput v14, v6, La63/j;->x:I

    check-cast v2, Lio/ktor/utils/io/m;

    invoke-virtual {v2, v6}, Lio/ktor/utils/io/m;->v(Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_87

    goto/16 :goto_5c

    :cond_87
    move-object v2, v5

    move-object v1, v15

    :goto_57
    new-instance v3, Lf63/d;

    invoke-direct {v3, v1, v0}, Lf63/d;-><init>(Ls63/a;Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, v6, La63/j;->E:Ljava/lang/Object;

    iput-object v1, v6, La63/j;->y:Ljava/lang/Object;

    const/4 v0, 0x5

    iput v0, v6, La63/j;->x:I

    invoke-virtual {v2, v3, v6}, Lr63/e;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_90

    goto/16 :goto_5c

    :cond_88
    const-class v0, [B

    invoke-virtual {v4, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8e

    check-cast v2, Lio/ktor/utils/io/q;

    iput-object v5, v6, La63/j;->E:Ljava/lang/Object;

    iput-object v15, v6, La63/j;->y:Ljava/lang/Object;

    iput-object v3, v6, La63/j;->z:Ljava/lang/Object;

    const/4 v0, 0x6

    iput v0, v6, La63/j;->x:I

    invoke-static {v2, v6}, Lts/o;->J(Lio/ktor/utils/io/q;Ls83/c;)Ljava/io/Serializable;

    move-result-object v0

    if-ne v0, v9, :cond_89

    goto/16 :goto_5c

    :cond_89
    move-object v2, v3

    move-object v3, v15

    :goto_58
    check-cast v0, [B

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Li63/s;->getHeaders()Li63/m;

    move-result-object v1

    sget-object v4, Li63/r;->a:Ljava/util/List;

    const-string v4, "Content-Length"

    invoke-interface {v1, v4}, Lo63/m;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8a

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_59

    :cond_8a
    const/4 v1, 0x0

    :goto_59
    invoke-interface {v2}, Li63/s;->getHeaders()Li63/m;

    move-result-object v2

    const-string v4, "Content-Encoding"

    invoke-interface {v2, v4}, Lo63/m;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_8d

    if-eqz v1, :cond_8d

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    cmp-long v2, v7, v17

    if-lez v2, :cond_8d

    array-length v2, v0

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    long-to-int v4, v7

    if-ne v2, v4, :cond_8b

    move/from16 v4, v22

    goto :goto_5a

    :cond_8b
    const/4 v4, 0x0

    :goto_5a
    if-eqz v4, :cond_8c

    goto :goto_5b

    :cond_8c
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", actual "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v0, v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8d
    :goto_5b
    new-instance v1, Lf63/d;

    invoke-direct {v1, v3, v0}, Lf63/d;-><init>(Ls63/a;Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, v6, La63/j;->E:Ljava/lang/Object;

    iput-object v0, v6, La63/j;->y:Ljava/lang/Object;

    iput-object v0, v6, La63/j;->z:Ljava/lang/Object;

    const/4 v0, 0x7

    iput v0, v6, La63/j;->x:I

    invoke-virtual {v5, v1, v6}, Lr63/e;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_90

    goto/16 :goto_5c

    :cond_8e
    const-class v0, Lio/ktor/utils/io/q;

    invoke-virtual {v4, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8f

    invoke-interface {v3}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    sget-object v1, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    check-cast v0, Lbc3/k1;

    new-instance v1, Lbc3/l1;

    invoke-direct {v1, v0}, Lbc3/l1;-><init>(Lbc3/k1;)V

    invoke-interface {v3}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    new-instance v4, La1/h;

    const/4 v7, 0x5

    const/4 v8, 0x0

    invoke-direct {v4, v2, v3, v8, v7}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x0

    invoke-static {v5, v0, v2, v4}, Lhg3/i;->s0(Lbc3/c0;Lq83/j;ZLc93/m;)Lio/ktor/utils/io/t;

    move-result-object v0

    new-instance v2, La0/a1;

    const/4 v14, 0x4

    invoke-direct {v2, v1, v14}, La0/a1;-><init>(Ljava/lang/Object;I)V

    iget-object v1, v0, Lio/ktor/utils/io/t;->w:Lbc3/c2;

    invoke-virtual {v1, v2}, Lbc3/t1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    iget-object v0, v0, Lio/ktor/utils/io/t;->x:Lio/ktor/utils/io/m;

    new-instance v1, Lf63/d;

    invoke-direct {v1, v15, v0}, Lf63/d;-><init>(Ls63/a;Ljava/lang/Object;)V

    iput-object v8, v6, La63/j;->E:Ljava/lang/Object;

    const/16 v0, 0x8

    iput v0, v6, La63/j;->x:I

    invoke-virtual {v5, v1, v6}, Lr63/e;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_90

    goto :goto_5c

    :cond_8f
    const-class v0, Li63/v;

    invoke-virtual {v4, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_90

    check-cast v2, Lio/ktor/utils/io/q;

    check-cast v2, Lio/ktor/utils/io/m;

    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0, v11}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lio/ktor/utils/io/m;->i(Ljava/lang/Throwable;)Z

    new-instance v0, Lf63/d;

    invoke-virtual {v3}, Lf63/c;->e()Li63/v;

    move-result-object v1

    invoke-direct {v0, v15, v1}, Lf63/d;-><init>(Ls63/a;Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, v6, La63/j;->E:Ljava/lang/Object;

    const/16 v1, 0x9

    iput v1, v6, La63/j;->x:I

    invoke-virtual {v5, v0, v6}, Lr63/e;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_90

    :goto_5c
    move-object v7, v9

    goto :goto_5e

    :cond_90
    :goto_5d
    move-object/from16 v7, v23

    :goto_5e
    return-object v7

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_d
        :pswitch_9
        :pswitch_c
        :pswitch_9
        :pswitch_b
        :pswitch_9
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_9
    .end packed-switch
.end method
