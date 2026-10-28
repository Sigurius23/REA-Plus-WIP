.class public final Ld20/p;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:I


# direct methods
.method public constructor <init>(La30/w0;Ly00/g7;ILd20/r;Lyy/f;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ld20/p;->w:I

    .line 1
    iput-object p1, p0, Ld20/p;->y:Ljava/lang/Object;

    iput-object p2, p0, Ld20/p;->F:Ljava/lang/Object;

    iput p3, p0, Ld20/p;->z:I

    iput-object p4, p0, Ld20/p;->E:Ljava/lang/Object;

    iput-object p5, p0, Ld20/p;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Lp6/s0;Landroid/content/Context;ILjava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p6, p0, Ld20/p;->w:I

    iput-object p1, p0, Ld20/p;->F:Ljava/lang/Object;

    iput-object p2, p0, Ld20/p;->E:Ljava/lang/Object;

    iput p3, p0, Ld20/p;->z:I

    iput-object p4, p0, Ld20/p;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ly00/a7;La30/w0;ILd20/r;Ljava/lang/String;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ld20/p;->w:I

    .line 3
    iput-object p1, p0, Ld20/p;->F:Ljava/lang/Object;

    iput-object p2, p0, Ld20/p;->y:Ljava/lang/Object;

    iput p3, p0, Ld20/p;->z:I

    iput-object p4, p0, Ld20/p;->E:Ljava/lang/Object;

    iput-object p5, p0, Ld20/p;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9

    iget v0, p0, Ld20/p;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Ld20/p;

    iget-object v0, p0, Ld20/p;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lp6/s0;

    iget-object v0, p0, Ld20/p;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroid/content/Context;

    iget-object v0, p0, Ld20/p;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    const/4 v7, 0x3

    iget v4, p0, Ld20/p;->z:I

    move-object v6, p2

    invoke-direct/range {v1 .. v7}, Ld20/p;-><init>(Lp6/s0;Landroid/content/Context;ILjava/lang/Object;Lq83/d;I)V

    iput-object p1, v1, Ld20/p;->y:Ljava/lang/Object;

    return-object v1

    :pswitch_0
    move-object v8, p2

    new-instance v2, Ld20/p;

    iget-object p2, p0, Ld20/p;->F:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Lp6/s0;

    iget-object p2, p0, Ld20/p;->E:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Landroid/content/Context;

    iget-object p2, p0, Ld20/p;->G:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Landroid/os/Bundle;

    move-object v7, v8

    const/4 v8, 0x2

    iget v5, p0, Ld20/p;->z:I

    invoke-direct/range {v2 .. v8}, Ld20/p;-><init>(Lp6/s0;Landroid/content/Context;ILjava/lang/Object;Lq83/d;I)V

    iput-object p1, v2, Ld20/p;->y:Ljava/lang/Object;

    return-object v2

    :pswitch_1
    move-object v8, p2

    new-instance v2, Ld20/p;

    iget-object p1, p0, Ld20/p;->F:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ly00/a7;

    iget-object p1, p0, Ld20/p;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, La30/w0;

    iget-object p1, p0, Ld20/p;->E:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ld20/r;

    iget-object p1, p0, Ld20/p;->G:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Ljava/lang/String;

    iget v5, p0, Ld20/p;->z:I

    invoke-direct/range {v2 .. v8}, Ld20/p;-><init>(Ly00/a7;La30/w0;ILd20/r;Ljava/lang/String;Lq83/d;)V

    return-object v2

    :pswitch_2
    move-object v8, p2

    new-instance v2, Ld20/p;

    iget-object p1, p0, Ld20/p;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, La30/w0;

    iget-object p1, p0, Ld20/p;->F:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ly00/g7;

    iget-object p1, p0, Ld20/p;->E:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ld20/r;

    iget-object p1, p0, Ld20/p;->G:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lyy/f;

    iget v5, p0, Ld20/p;->z:I

    invoke-direct/range {v2 .. v8}, Ld20/p;-><init>(La30/w0;Ly00/g7;ILd20/r;Lyy/f;Lq83/d;)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ld20/p;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Ld20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ld20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Ld20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Ld20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v5, p0

    iget v0, v5, Ld20/p;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, v5, Ld20/p;->x:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Ld20/p;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v2, v5, Ld20/p;->F:Ljava/lang/Object;

    check-cast v2, Lp6/s0;

    iget-object v3, v5, Ld20/p;->E:Ljava/lang/Object;

    check-cast v3, Landroid/content/Context;

    iget-object v4, v5, Ld20/p;->G:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iput v1, v5, Ld20/p;->x:I

    move-object v1, v0

    move-object v0, v2

    move-object v2, v3

    iget v3, v5, Ld20/p;->z:I

    invoke-virtual/range {v0 .. v5}, Lp6/s0;->b(Lbc3/c0;Landroid/content/Context;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v6, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v6

    :pswitch_0
    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, v5, Ld20/p;->x:I

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    if-ne v0, v1, :cond_3

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Ld20/p;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v2, v5, Ld20/p;->F:Ljava/lang/Object;

    check-cast v2, Lp6/s0;

    iget-object v3, v5, Ld20/p;->E:Ljava/lang/Object;

    check-cast v3, Landroid/content/Context;

    iget-object v4, v5, Ld20/p;->G:Ljava/lang/Object;

    check-cast v4, Landroid/os/Bundle;

    iput v1, v5, Ld20/p;->x:I

    move-object v1, v0

    move-object v0, v2

    move-object v2, v3

    iget v3, v5, Ld20/p;->z:I

    invoke-virtual/range {v0 .. v5}, Lp6/s0;->c(Lbc3/c0;Landroid/content/Context;ILandroid/os/Bundle;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    sget-object v6, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v6

    :pswitch_1
    iget-object v0, v5, Ld20/p;->E:Ljava/lang/Object;

    check-cast v0, Ld20/r;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v5, Ld20/p;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_7

    if-ne v2, v3, :cond_6

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-wide v6, Lux/s0;->m:J

    iput v3, v5, Ld20/p;->x:I

    invoke-static {v6, v7, v5}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    goto :goto_6

    :cond_8
    :goto_4
    iget-object v1, v5, Ld20/p;->F:Ljava/lang/Object;

    check-cast v1, Ly00/a7;

    iget-object v10, v1, Ly00/a7;->y:Ljava/lang/String;

    iget-object v7, v1, Ly00/a7;->w:Ljava/lang/String;

    iget-object v8, v1, Ly00/a7;->z:Ljava/lang/String;

    new-instance v14, Lq30/l;

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v6, v14

    invoke-direct/range {v6 .. v11}, Lq30/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ld20/f;

    iget-object v2, v5, Ld20/p;->y:Ljava/lang/Object;

    check-cast v2, La30/w0;

    new-instance v3, Lq30/n0;

    iget-object v4, v0, Ld20/r;->x:Ld20/l;

    iget-object v4, v4, Ld20/l;->y:Ly00/c8;

    invoke-interface {v4}, Ly00/c8;->getClientSecret()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_9

    const-string v4, ""

    :cond_9
    iget-object v6, v5, Ld20/p;->G:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v0, v0, Ld20/r;->N:Lyy/f;

    iget-object v7, v0, Lyy/f;->w:Ljava/lang/String;

    iget-object v0, v0, Lyy/f;->x:Ljava/lang/String;

    invoke-direct {v3, v4, v6, v7, v0}, Lq30/n0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v11, Lq30/i0;

    iget-object v0, v2, La30/w0;->G:Ljava/lang/Object;

    move-object v13, v0

    check-cast v13, Ljava/security/KeyPair;

    iget v0, v5, Ld20/p;->z:I

    const/4 v2, 0x5

    if-ge v0, v2, :cond_a

    move v15, v2

    goto :goto_5

    :cond_a
    move v15, v0

    :goto_5
    const-string v12, "3DS_LOA_SDK_STIN_020200_00960"

    move-object/from16 v16, v3

    invoke-direct/range {v11 .. v16}, Lq30/i0;-><init>(Ljava/lang/String;Ljava/security/KeyPair;Lq30/l;ILq30/n0;)V

    invoke-direct {v1, v11}, Ld20/f;-><init>(Lq30/i0;)V

    :goto_6
    return-object v1

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ld20/p;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_d

    if-eq v1, v3, :cond_c

    if-ne v1, v2, :cond_b

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    goto/16 :goto_8

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_7

    :cond_d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Ld20/p;->y:Ljava/lang/Object;

    check-cast v1, La30/w0;

    iput v3, v5, Ld20/p;->x:I

    iget-object v3, v1, La30/w0;->x:Ljava/lang/Object;

    move-object v8, v3

    check-cast v8, Lev/i;

    iget-object v3, v1, La30/w0;->z:Ljava/lang/Object;

    move-object v11, v3

    check-cast v11, Ljava/lang/String;

    iget-object v3, v1, La30/w0;->y:Ljava/lang/Object;

    move-object v12, v3

    check-cast v12, Ljava/security/PublicKey;

    iget-object v3, v1, La30/w0;->E:Ljava/lang/Object;

    move-object v10, v3

    check-cast v10, Ljava/lang/String;

    iget-object v3, v1, La30/w0;->F:Ljava/lang/Object;

    move-object v7, v3

    check-cast v7, Lq30/q0;

    iget-object v1, v1, La30/w0;->G:Ljava/lang/Object;

    check-cast v1, Ljava/security/KeyPair;

    invoke-virtual {v1}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v9

    const-string v1, "getPublic(...)"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v8, Lev/i;->i:Ljava/lang/Object;

    check-cast v1, Lq83/j;

    new-instance v6, Lq30/b0;

    const/4 v13, 0x0

    invoke-direct/range {v6 .. v13}, Lq30/b0;-><init>(Lq30/q0;Lev/i;Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;Ljava/security/PublicKey;Lq83/d;)V

    invoke-static {v1, v6, v5}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_e

    goto :goto_9

    :cond_e
    :goto_7
    check-cast v1, Lq30/b;

    new-instance v6, Ly00/z6;

    iget-object v3, v5, Ld20/p;->F:Ljava/lang/Object;

    check-cast v3, Ly00/g7;

    iget-object v7, v3, Ly00/g7;->w:Ljava/lang/String;

    iget-object v8, v1, Lq30/b;->y:Ljava/lang/String;

    iget-object v9, v1, Lq30/b;->z:Ljava/lang/String;

    iget-object v3, v1, Lq30/b;->x:Lq30/q0;

    iget-object v10, v3, Lq30/q0;->w:Ljava/lang/String;

    iget-object v11, v1, Lq30/b;->w:Ljava/lang/String;

    iget-object v12, v1, Lq30/b;->E:Ljava/lang/String;

    iget-object v13, v1, Lq30/b;->F:Ljava/lang/String;

    iget v14, v5, Ld20/p;->z:I

    const/4 v15, 0x0

    invoke-direct/range {v6 .. v15}, Ly00/z6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    iget-object v1, v5, Ld20/p;->E:Ljava/lang/Object;

    check-cast v1, Ld20/r;

    iget-object v1, v1, Ld20/r;->y:Lb10/z0;

    iget-object v3, v5, Ld20/p;->G:Ljava/lang/Object;

    check-cast v3, Lyy/f;

    iput v2, v5, Ld20/p;->x:I

    invoke-virtual {v1, v6, v3, v5}, Lb10/z0;->V(Ly00/z6;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_f

    goto :goto_9

    :cond_f
    move-object v0, v1

    :goto_8
    new-instance v1, Ll83/n;

    invoke-direct {v1, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    move-object v0, v1

    :goto_9
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
