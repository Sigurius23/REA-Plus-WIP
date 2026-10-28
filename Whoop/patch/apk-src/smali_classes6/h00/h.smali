.class public final Lh00/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lh00/j;

.field public final synthetic G:Lc93/a;

.field public final synthetic H:Lc93/a;

.field public final synthetic I:Lc93/a;

.field public final synthetic J:Lc93/m;

.field public final synthetic K:Lkotlin/jvm/functions/Function1;

.field public final synthetic L:Lc93/a;

.field public final synthetic M:Lwz/e1;

.field public final synthetic N:Ljava/lang/Object;

.field public final synthetic O:Ljava/lang/Object;

.field public final synthetic P:Ll83/e;

.field public final synthetic Q:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Leb/u0;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lbc3/c0;Lkotlin/jvm/functions/Function1;Leb/u0;Lkotlin/jvm/functions/Function1;Lh00/j;Lc93/a;Lc93/a;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lwz/e1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh00/h;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh00/h;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lh00/h;->N:Ljava/lang/Object;

    iput-object p3, p0, Lh00/h;->O:Ljava/lang/Object;

    iput-object p4, p0, Lh00/h;->y:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lh00/h;->z:Leb/u0;

    iput-object p6, p0, Lh00/h;->E:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lh00/h;->F:Lh00/j;

    iput-object p8, p0, Lh00/h;->G:Lc93/a;

    iput-object p9, p0, Lh00/h;->H:Lc93/a;

    iput-object p10, p0, Lh00/h;->I:Lc93/a;

    iput-object p11, p0, Lh00/h;->J:Lc93/m;

    iput-object p12, p0, Lh00/h;->K:Lkotlin/jvm/functions/Function1;

    iput-object p13, p0, Lh00/h;->P:Ll83/e;

    iput-object p14, p0, Lh00/h;->Q:Ljava/lang/Object;

    move-object/from16 p1, p15

    iput-object p1, p0, Lh00/h;->L:Lc93/a;

    move-object/from16 p1, p16

    iput-object p1, p0, Lh00/h;->M:Lwz/e1;

    return-void
.end method

.method public constructor <init>(Lh40/k;Lc93/a;Landroidx/compose/ui/Modifier;Leb/u0;Lh00/j;Lh40/k;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lwz/e1;Lp1/c1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh00/h;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh00/h;->N:Ljava/lang/Object;

    iput-object p2, p0, Lh00/h;->G:Lc93/a;

    iput-object p3, p0, Lh00/h;->x:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lh00/h;->z:Leb/u0;

    iput-object p5, p0, Lh00/h;->F:Lh00/j;

    iput-object p6, p0, Lh00/h;->O:Ljava/lang/Object;

    iput-object p7, p0, Lh00/h;->y:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lh00/h;->J:Lc93/m;

    iput-object p9, p0, Lh00/h;->E:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, Lh00/h;->H:Lc93/a;

    iput-object p11, p0, Lh00/h;->I:Lc93/a;

    iput-object p12, p0, Lh00/h;->K:Lkotlin/jvm/functions/Function1;

    iput-object p13, p0, Lh00/h;->L:Lc93/a;

    iput-object p14, p0, Lh00/h;->P:Ll83/e;

    move-object/from16 p1, p15

    iput-object p1, p0, Lh00/h;->M:Lwz/e1;

    move-object/from16 p1, p16

    iput-object p1, p0, Lh00/h;->Q:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v0, p0

    iget v1, v0, Lh00/h;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    move-object v1, v11

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    move-object v1, v11

    check-cast v1, Lp1/q;

    const v2, -0x1a6f7841

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v1, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg00/b;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    iget-wide v4, v2, Lg00/b;->b:J

    new-instance v12, Lh00/w;

    iget-object v1, v0, Lh00/h;->N:Ljava/lang/Object;

    move-object v13, v1

    check-cast v13, Lkotlin/jvm/functions/Function3;

    iget-object v1, v0, Lh00/h;->O:Ljava/lang/Object;

    move-object v14, v1

    check-cast v14, Lbc3/c0;

    iget-object v1, v0, Lh00/h;->P:Ll83/e;

    move-object/from16 v24, v1

    check-cast v24, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lh00/h;->Q:Ljava/lang/Object;

    move-object/from16 v25, v1

    check-cast v25, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lh00/h;->L:Lc93/a;

    iget-object v2, v0, Lh00/h;->M:Lwz/e1;

    iget-object v15, v0, Lh00/h;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Lh00/h;->z:Leb/u0;

    iget-object v6, v0, Lh00/h;->E:Lkotlin/jvm/functions/Function1;

    iget-object v7, v0, Lh00/h;->F:Lh00/j;

    iget-object v8, v0, Lh00/h;->G:Lc93/a;

    iget-object v9, v0, Lh00/h;->H:Lc93/a;

    iget-object v10, v0, Lh00/h;->I:Lc93/a;

    move-object/from16 v26, v1

    iget-object v1, v0, Lh00/h;->J:Lc93/m;

    move-object/from16 v22, v1

    iget-object v1, v0, Lh00/h;->K:Lkotlin/jvm/functions/Function1;

    move-object/from16 v23, v1

    move-object/from16 v27, v2

    move-object/from16 v16, v3

    move-object/from16 v17, v6

    move-object/from16 v18, v7

    move-object/from16 v19, v8

    move-object/from16 v20, v9

    move-object/from16 v21, v10

    invoke-direct/range {v12 .. v27}, Lh00/w;-><init>(Lkotlin/jvm/functions/Function3;Lbc3/c0;Lkotlin/jvm/functions/Function1;Leb/u0;Lkotlin/jvm/functions/Function1;Lh00/j;Lc93/a;Lc93/a;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lwz/e1;)V

    const v1, 0x71c69b8e

    invoke-static {v1, v11, v12}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const/high16 v12, 0x180000

    const/16 v13, 0x3a

    iget-object v2, v0, Lh00/h;->x:Landroidx/compose/ui/Modifier;

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v13}, Lhg3/i;->k(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v2, v0, Lh00/h;->Q:Ljava/lang/Object;

    move-object/from16 v22, v2

    check-cast v22, Lp1/c1;

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    move-object v1, v7

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    iget-object v1, v0, Lh00/h;->N:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lh40/k;

    const/16 v1, 0x18

    int-to-float v4, v1

    new-instance v8, Lh00/g;

    iget-object v1, v0, Lh00/h;->O:Ljava/lang/Object;

    move-object v12, v1

    check-cast v12, Lh40/k;

    iget-object v1, v0, Lh00/h;->P:Ll83/e;

    move-object/from16 v20, v1

    check-cast v20, Lc93/a;

    iget-object v1, v0, Lh00/h;->M:Lwz/e1;

    iget-object v9, v0, Lh00/h;->x:Landroidx/compose/ui/Modifier;

    iget-object v10, v0, Lh00/h;->z:Leb/u0;

    iget-object v11, v0, Lh00/h;->F:Lh00/j;

    iget-object v13, v0, Lh00/h;->y:Lkotlin/jvm/functions/Function1;

    iget-object v14, v0, Lh00/h;->J:Lc93/m;

    iget-object v15, v0, Lh00/h;->E:Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Lh00/h;->H:Lc93/a;

    iget-object v5, v0, Lh00/h;->I:Lc93/a;

    iget-object v6, v0, Lh00/h;->K:Lkotlin/jvm/functions/Function1;

    move-object/from16 v21, v1

    iget-object v1, v0, Lh00/h;->L:Lc93/a;

    move-object/from16 v19, v1

    move-object/from16 v16, v3

    move-object/from16 v17, v5

    move-object/from16 v18, v6

    invoke-direct/range {v8 .. v22}, Lh00/g;-><init>(Landroidx/compose/ui/Modifier;Leb/u0;Lh00/j;Lh40/k;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lwz/e1;Lp1/c1;)V

    move-object/from16 v1, v22

    const v3, -0x22df459f

    invoke-static {v3, v7, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const/16 v8, 0x6188

    const/4 v9, 0x2

    const/4 v3, 0x0

    iget-object v5, v0, Lh00/h;->G:Lc93/a;

    invoke-static/range {v2 .. v9}, Lds/p;->b(Lh40/k;Landroidx/compose/ui/Modifier;FLc93/a;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/jvm/functions/Function3;

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    iget-object v3, v0, Lh00/h;->O:Ljava/lang/Object;

    move-object v8, v3

    check-cast v8, Lh40/k;

    move-object v13, v7

    check-cast v13, Lp1/q;

    const v3, -0x26753ab5

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v3, v5, :cond_5

    new-instance v3, Lg11/b;

    const/16 v5, 0xf

    invoke-direct {v3, v5, v1}, Lg11/b;-><init>(ILp1/c1;)V

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v11, v3

    check-cast v11, Lc93/a;

    const/4 v1, 0x0

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    new-instance v1, Lg1/m0;

    const/4 v3, 0x4

    invoke-direct {v1, v3, v2}, Lg1/m0;-><init>(ILkotlin/jvm/functions/Function3;)V

    const v2, 0x5ec9c89a

    invoke-static {v2, v13, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    const/16 v14, 0x6d88

    const/4 v15, 0x2

    const/4 v9, 0x0

    move v10, v4

    invoke-static/range {v8 .. v15}, Lds/p;->b(Lh40/k;Landroidx/compose/ui/Modifier;FLc93/a;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
