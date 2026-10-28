.class public final Lh00/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc93/a;Landroidx/compose/ui/Modifier;ZLo2/e;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh00/e0;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh00/e0;->z:Ljava/lang/Object;

    iput-object p2, p0, Lh00/e0;->E:Ljava/lang/Object;

    iput-boolean p3, p0, Lh00/e0;->x:Z

    iput-object p4, p0, Lh00/e0;->F:Ljava/lang/Object;

    iput-object p5, p0, Lh00/e0;->y:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ZLeb/u0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh00/e0;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lh00/e0;->x:Z

    iput-object p2, p0, Lh00/e0;->z:Ljava/lang/Object;

    iput-object p3, p0, Lh00/e0;->y:Ljava/lang/String;

    iput-object p4, p0, Lh00/e0;->E:Ljava/lang/Object;

    iput-object p5, p0, Lh00/e0;->F:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, Lh00/e0;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v3, v4, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    and-int/2addr v2, v5

    move-object v10, v1

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Lh00/e0;->z:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lc93/a;

    iget-object v1, v0, Lh00/e0;->E:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Landroidx/compose/ui/Modifier;

    new-instance v1, Lb30/w2;

    iget-object v2, v0, Lh00/e0;->F:Ljava/lang/Object;

    check-cast v2, Lo2/e;

    iget-object v3, v0, Lh00/e0;->y:Ljava/lang/String;

    const/16 v6, 0x12

    invoke-direct {v1, v6, v2, v3}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v2, -0x4d8cfcf8

    invoke-static {v2, v10, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const/high16 v11, 0x180000

    const/16 v12, 0x38

    iget-boolean v6, v0, Lh00/e0;->x:Z

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v12}, Ll1/k3;->e(Lc93/a;Landroidx/compose/ui/Modifier;ZLl1/p1;Li2/a1;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_3

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_5

    :cond_3
    :goto_2
    move-object v14, v1

    check-cast v14, Lp1/q;

    const v1, 0x6232138a

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    iget-object v1, v0, Lh00/e0;->F:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_4

    new-instance v2, Lf1/a0;

    const/16 v4, 0x10

    invoke-direct {v2, v4, v1}, Lf1/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v2}, Landroidx/compose/ui/layout/b;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const v2, 0x62326f1b

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    iget-boolean v2, v0, Lh00/e0;->x:Z

    if-eqz v2, :cond_5

    const/4 v2, 0x0

    :goto_3
    move-object v12, v2

    goto :goto_4

    :cond_5
    const v2, 0x623278bd

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_6

    new-instance v2, Lgo1/a;

    const/16 v4, 0x1a

    invoke-direct {v2, v4}, Lgo1/a;-><init>(I)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    goto :goto_3

    :goto_4
    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    iget-object v2, v0, Lh00/e0;->z:Ljava/lang/Object;

    move-object v4, v2

    check-cast v4, Leb/u0;

    const v2, 0x62322582

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_7

    new-instance v2, Lgo1/a;

    const/16 v5, 0x1b

    invoke-direct {v2, v5}, Lgo1/a;-><init>(I)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v8, v2

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const v2, 0x62322ec2

    invoke-static {v2, v14, v1}, Lr;->h(ILp1/q;Z)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_8

    new-instance v2, Lgo1/a;

    const/16 v3, 0x1c

    invoke-direct {v2, v3}, Lgo1/a;-><init>(I)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v9, v2

    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    iget-object v1, v0, Lh00/e0;->E:Ljava/lang/Object;

    move-object v13, v1

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/high16 v15, 0x1b0000

    const/16 v16, 0x198

    iget-object v5, v0, Lh00/e0;->y:Ljava/lang/String;

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v4 .. v16}, Lhg3/i;->d(Leb/u0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
