.class public final synthetic Lb30/u2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Le30/c;Lzy/c;La30/n1;La30/k1;Lzy/c;Lr20/s;Lq20/b;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lb30/u2;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/u2;->y:Ljava/lang/Object;

    iput-object p2, p0, Lb30/u2;->z:Ljava/lang/Object;

    iput-object p3, p0, Lb30/u2;->F:Ljava/lang/Object;

    iput-object p4, p0, Lb30/u2;->G:Ljava/lang/Object;

    iput-object p5, p0, Lb30/u2;->E:Ljava/lang/Object;

    iput-object p6, p0, Lb30/u2;->H:Ljava/lang/Object;

    iput-object p7, p0, Lb30/u2;->I:Ljava/lang/Object;

    iput p8, p0, Lb30/u2;->x:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p9, p0, Lb30/u2;->w:I

    iput-object p1, p0, Lb30/u2;->y:Ljava/lang/Object;

    iput-object p2, p0, Lb30/u2;->z:Ljava/lang/Object;

    iput-object p3, p0, Lb30/u2;->E:Ljava/lang/Object;

    iput-object p4, p0, Lb30/u2;->F:Ljava/lang/Object;

    iput-object p5, p0, Lb30/u2;->G:Ljava/lang/Object;

    iput-object p6, p0, Lb30/u2;->H:Ljava/lang/Object;

    iput-object p7, p0, Lb30/u2;->I:Ljava/lang/Object;

    iput p8, p0, Lb30/u2;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lx1/b;Lx1/b;Lc93/m;ILl0/b2;Lg1/f5;Lc93/m;Lx1/b;)V
    .locals 1

    .line 3
    const/4 v0, 0x5

    iput v0, p0, Lb30/u2;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/u2;->y:Ljava/lang/Object;

    iput-object p2, p0, Lb30/u2;->z:Ljava/lang/Object;

    iput-object p3, p0, Lb30/u2;->E:Ljava/lang/Object;

    iput p4, p0, Lb30/u2;->x:I

    iput-object p5, p0, Lb30/u2;->F:Ljava/lang/Object;

    iput-object p6, p0, Lb30/u2;->G:Ljava/lang/Object;

    iput-object p7, p0, Lb30/u2;->H:Ljava/lang/Object;

    iput-object p8, p0, Lb30/u2;->I:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    move-object/from16 v0, p0

    iget v1, v0, Lb30/u2;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lb30/u2;->y:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lx1/b;

    move-object/from16 v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    iget v1, v0, Lb30/u2;->x:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v1

    or-int/lit8 v10, v1, 0x1

    iget-object v3, v0, Lb30/u2;->z:Ljava/lang/Object;

    iget-object v4, v0, Lb30/u2;->E:Ljava/lang/Object;

    iget-object v5, v0, Lb30/u2;->F:Ljava/lang/Object;

    iget-object v6, v0, Lb30/u2;->G:Ljava/lang/Object;

    iget-object v7, v0, Lb30/u2;->H:Ljava/lang/Object;

    iget-object v8, v0, Lb30/u2;->I:Ljava/lang/Object;

    invoke-virtual/range {v2 .. v10}, Lx1/b;->h(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    iget-object v1, v0, Lb30/u2;->y:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lcom/whoop/settings/journalv2/h;

    iget-object v1, v0, Lb30/u2;->z:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lc93/a;

    iget-object v1, v0, Lb30/u2;->E:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lb30/u2;->F:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lc93/a;

    iget-object v1, v0, Lb30/u2;->G:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lc93/m;

    iget-object v1, v0, Lb30/u2;->H:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lb30/u2;->I:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lc93/a;

    move-object/from16 v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v9, v0, Lb30/u2;->x:I

    invoke-static/range {v2 .. v11}, Lcom/whoop/settings/journalv2/e;->a(Lcom/whoop/settings/journalv2/h;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1
    iget-object v1, v0, Lb30/u2;->y:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lp00/q;

    iget-object v1, v0, Lb30/u2;->z:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lg2/i;

    iget-object v1, v0, Lb30/u2;->E:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lb3/x2;

    iget-object v1, v0, Lb30/u2;->F:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lg2/s;

    iget-object v1, v0, Lb30/u2;->G:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lc93/a;

    iget-object v1, v0, Lb30/u2;->H:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Landroid/content/Context;

    iget-object v1, v0, Lb30/u2;->I:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lc93/a;

    move-object/from16 v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lb30/u2;->x:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v10

    invoke-static/range {v2 .. v10}, Lp00/h;->c(Lp00/q;Lg2/i;Lb3/x2;Lg2/s;Lc93/a;Landroid/content/Context;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_2
    iget-object v1, v0, Lb30/u2;->y:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lmw0/i$c;

    iget-object v1, v0, Lb30/u2;->z:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lb30/u2;->E:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lb30/u2;->F:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lzr2/a;

    iget-object v1, v0, Lb30/u2;->G:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lor2/u0;

    iget-object v1, v0, Lb30/u2;->H:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lmw0/c;

    iget-object v1, v0, Lb30/u2;->I:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object/from16 v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v9, v0, Lb30/u2;->x:I

    invoke-static/range {v2 .. v11}, Lnw0/o;->a(Lmw0/i$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lzr2/a;Lor2/u0;Lmw0/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_3
    iget-object v1, v0, Lb30/u2;->y:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lmw0/i$a;

    iget-object v1, v0, Lb30/u2;->z:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lb30/u2;->E:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lb30/u2;->F:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lzr2/a;

    iget-object v1, v0, Lb30/u2;->G:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lor2/u0;

    iget-object v1, v0, Lb30/u2;->H:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lmw0/c;

    iget-object v1, v0, Lb30/u2;->I:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object/from16 v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v9, v0, Lb30/u2;->x:I

    invoke-static/range {v2 .. v11}, Lnw0/o;->c(Lmw0/i$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lzr2/a;Lor2/u0;Lmw0/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_4
    iget-object v1, v0, Lb30/u2;->y:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Leq2/b;

    iget-object v1, v0, Lb30/u2;->z:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Leq2/a;

    iget-object v1, v0, Lb30/u2;->E:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lc93/a;

    iget-object v1, v0, Lb30/u2;->F:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lb30/u2;->G:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lc93/a;

    iget-object v1, v0, Lb30/u2;->H:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lb30/u2;->I:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lc93/a;

    move-object/from16 v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v9, v0, Lb30/u2;->x:I

    invoke-static/range {v2 .. v11}, Llq2/r;->C(Leq2/b;Leq2/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_5
    iget-object v1, v0, Lb30/u2;->y:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lm91/u;

    iget-object v1, v0, Lb30/u2;->z:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    iget-object v1, v0, Lb30/u2;->E:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    iget-object v1, v0, Lb30/u2;->F:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    iget-object v1, v0, Lb30/u2;->G:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lm91/u;

    iget-object v1, v0, Lb30/u2;->H:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lb30/u2;->I:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object/from16 v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v9, v0, Lb30/u2;->x:I

    invoke-static/range {v2 .. v11}, Ljr1/f;->f(Lm91/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_6
    iget-object v1, v0, Lb30/u2;->y:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lah0/c;

    iget-object v1, v0, Lb30/u2;->z:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Ljava/util/Set;

    iget-object v1, v0, Lb30/u2;->E:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lq3/y;

    iget-object v1, v0, Lb30/u2;->F:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lb30/u2;->G:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Ljava/util/Map;

    iget-object v1, v0, Lb30/u2;->H:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lc93/m;

    iget-object v1, v0, Lb30/u2;->I:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object/from16 v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v9, v0, Lb30/u2;->x:I

    invoke-static/range {v2 .. v11}, Lih0/e0;->u(Lah0/c;Ljava/util/Set;Lq3/y;Lkotlin/jvm/functions/Function1;Ljava/util/Map;Lc93/m;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_7
    iget-object v1, v0, Lb30/u2;->y:Ljava/lang/Object;

    check-cast v1, Lx1/b;

    iget-object v2, v0, Lb30/u2;->z:Ljava/lang/Object;

    check-cast v2, Lx1/b;

    iget-object v3, v0, Lb30/u2;->E:Ljava/lang/Object;

    check-cast v3, Lc93/m;

    iget-object v4, v0, Lb30/u2;->F:Ljava/lang/Object;

    check-cast v4, Ll0/b2;

    iget-object v5, v0, Lb30/u2;->G:Ljava/lang/Object;

    check-cast v5, Lg1/f5;

    iget-object v6, v0, Lb30/u2;->H:Ljava/lang/Object;

    check-cast v6, Lc93/m;

    iget-object v7, v0, Lb30/u2;->I:Ljava/lang/Object;

    check-cast v7, Lx1/b;

    move-object/from16 v8, p1

    check-cast v8, Ly2/v1;

    move-object/from16 v9, p2

    check-cast v9, Ly3/a;

    sget v10, Lg1/g5;->b:F

    iget-wide v11, v9, Ly3/a;->a:J

    invoke-static {v11, v12}, Ly3/a;->i(J)I

    move-result v11

    iget-wide v12, v9, Ly3/a;->a:J

    invoke-static {v12, v13}, Ly3/a;->h(J)I

    move-result v21

    iget-wide v12, v9, Ly3/a;->a:J

    const/16 v17, 0x0

    const/16 v18, 0xa

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v12 .. v18}, Ly3/a;->b(JIIIII)J

    move-result-wide v12

    sget-object v9, Lg1/h5;->w:Lg1/h5;

    invoke-interface {v8, v9, v1}, Ly2/v1;->s0(Ljava/lang/Object;Lc93/m;)Ljava/util/List;

    move-result-object v1

    new-instance v9, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v14

    invoke-direct {v9, v14}, Ljava/util/ArrayList;-><init>(I)V

    move-object v14, v1

    check-cast v14, Ljava/util/Collection;

    invoke-interface {v14}, Ljava/util/Collection;->size()I

    move-result v14

    const/4 v15, 0x0

    :goto_0
    if-ge v15, v14, :cond_0

    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 p2, v1

    move-object/from16 v1, v16

    check-cast v1, Ly2/q0;

    invoke-interface {v1, v12, v13}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v1

    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v1, p2

    goto :goto_0

    :cond_0
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v15, 0x1

    if-eqz v1, :cond_1

    move-object/from16 v19, v9

    const/16 v16, 0x0

    goto :goto_2

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v1, v16

    check-cast v1, Ly2/j1;

    iget v1, v1, Ly2/j1;->x:I

    invoke-static {v9}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v14

    if-gt v15, v14, :cond_3

    :goto_1
    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v19, v9

    move-object/from16 v9, v18

    check-cast v9, Ly2/j1;

    iget v9, v9, Ly2/j1;->x:I

    if-ge v1, v9, :cond_2

    move v1, v9

    move-object/from16 v16, v18

    :cond_2
    if-eq v15, v14, :cond_4

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v9, v19

    goto :goto_1

    :cond_3
    move-object/from16 v19, v9

    :cond_4
    :goto_2
    move-object/from16 v1, v16

    check-cast v1, Ly2/j1;

    if-eqz v1, :cond_5

    iget v1, v1, Ly2/j1;->x:I

    move/from16 v20, v1

    goto :goto_3

    :cond_5
    const/16 v20, 0x0

    :goto_3
    sget-object v1, Lg1/h5;->y:Lg1/h5;

    invoke-interface {v8, v1, v2}, Ly2/v1;->s0(Ljava/lang/Object;Lc93/m;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v9

    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(I)V

    move-object v9, v1

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    const/4 v14, 0x0

    :goto_4
    if-ge v14, v9, :cond_6

    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ly2/q0;

    move-object/from16 v16, v1

    invoke-interface {v8}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v1

    invoke-interface {v4, v8, v1}, Ll0/b2;->a(Ly3/c;Ly3/m;)I

    move-result v1

    move/from16 v18, v9

    invoke-interface {v8}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v9

    invoke-interface {v4, v8, v9}, Ll0/b2;->b(Ly3/c;Ly3/m;)I

    move-result v9

    move/from16 v22, v9

    invoke-interface {v4, v8}, Ll0/b2;->c(Ly3/c;)I

    move-result v9

    neg-int v1, v1

    sub-int v1, v1, v22

    neg-int v9, v9

    move-object/from16 v22, v5

    move-object/from16 v23, v6

    invoke-static {v1, v12, v13, v9}, Ly3/b;->i(IJI)J

    move-result-wide v5

    invoke-interface {v15, v5, v6}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v1, v16

    move/from16 v9, v18

    move-object/from16 v5, v22

    move-object/from16 v6, v23

    goto :goto_4

    :cond_6
    move-object/from16 v22, v5

    move-object/from16 v23, v6

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v5, 0x0

    goto :goto_6

    :cond_7
    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v1, v5

    check-cast v1, Ly2/j1;

    iget v1, v1, Ly2/j1;->x:I

    invoke-static {v2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v6

    const/4 v9, 0x1

    if-gt v9, v6, :cond_9

    const/4 v9, 0x1

    :goto_5
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Ly2/j1;

    iget v15, v15, Ly2/j1;->x:I

    if-ge v1, v15, :cond_8

    move-object v5, v14

    move v1, v15

    :cond_8
    if-eq v9, v6, :cond_9

    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_9
    :goto_6
    check-cast v5, Ly2/j1;

    if-eqz v5, :cond_a

    iget v1, v5, Ly2/j1;->x:I

    goto :goto_7

    :cond_a
    const/4 v1, 0x0

    :goto_7
    sget-object v5, Lg1/h5;->z:Lg1/h5;

    invoke-interface {v8, v5, v3}, Ly2/v1;->s0(Ljava/lang/Object;Lc93/m;)Ljava/util/List;

    move-result-object v3

    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    move-object v6, v3

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    const/4 v9, 0x0

    :goto_8
    if-ge v9, v6, :cond_b

    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ly2/q0;

    invoke-interface {v8}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v15

    invoke-interface {v4, v8, v15}, Ll0/b2;->a(Ly3/c;Ly3/m;)I

    move-result v15

    move/from16 v16, v1

    invoke-interface {v8}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v1

    invoke-interface {v4, v8, v1}, Ll0/b2;->b(Ly3/c;Ly3/m;)I

    move-result v1

    move/from16 v18, v1

    invoke-interface {v4, v8}, Ll0/b2;->c(Ly3/c;)I

    move-result v1

    neg-int v15, v15

    sub-int v15, v15, v18

    neg-int v1, v1

    move-object/from16 v18, v2

    invoke-static {v15, v12, v13, v1}, Ly3/b;->i(IJI)J

    move-result-wide v1

    invoke-interface {v14, v1, v2}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    move/from16 v1, v16

    move-object/from16 v2, v18

    goto :goto_8

    :cond_b
    move/from16 v16, v1

    move-object/from16 v18, v2

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_18

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_c

    const/4 v2, 0x0

    goto :goto_a

    :cond_c
    const/4 v1, 0x0

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v1, v2

    check-cast v1, Ly2/j1;

    iget v1, v1, Ly2/j1;->w:I

    invoke-static {v5}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v3

    const/4 v9, 0x1

    if-gt v9, v3, :cond_e

    const/4 v6, 0x1

    :goto_9
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v14, v9

    check-cast v14, Ly2/j1;

    iget v14, v14, Ly2/j1;->w:I

    if-ge v1, v14, :cond_d

    move-object v2, v9

    move v1, v14

    :cond_d
    if-eq v6, v3, :cond_e

    add-int/lit8 v6, v6, 0x1

    goto :goto_9

    :cond_e
    :goto_a
    check-cast v2, Ly2/j1;

    if-eqz v2, :cond_f

    iget v1, v2, Ly2/j1;->w:I

    goto :goto_b

    :cond_f
    const/4 v1, 0x0

    :goto_b
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_10

    const/4 v3, 0x0

    goto :goto_d

    :cond_10
    const/4 v2, 0x0

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v2, v3

    check-cast v2, Ly2/j1;

    iget v2, v2, Ly2/j1;->x:I

    invoke-static {v5}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v6

    const/4 v9, 0x1

    if-gt v9, v6, :cond_12

    const/4 v9, 0x1

    :goto_c
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Ly2/j1;

    iget v15, v15, Ly2/j1;->x:I

    if-ge v2, v15, :cond_11

    move-object v3, v14

    move v2, v15

    :cond_11
    if-eq v9, v6, :cond_12

    add-int/lit8 v9, v9, 0x1

    goto :goto_c

    :cond_12
    :goto_d
    check-cast v3, Ly2/j1;

    if-eqz v3, :cond_13

    iget v2, v3, Ly2/j1;->x:I

    goto :goto_e

    :cond_13
    const/4 v2, 0x0

    :goto_e
    if-eqz v1, :cond_18

    if-eqz v2, :cond_18

    iget v3, v0, Lb30/u2;->x:I

    if-nez v3, :cond_15

    invoke-interface {v8}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v3

    sget-object v6, Ly3/m;->w:Ly3/m;

    if-ne v3, v6, :cond_14

    invoke-interface {v8, v10}, Ly3/c;->F(F)I

    move-result v1

    goto :goto_10

    :cond_14
    invoke-interface {v8, v10}, Ly3/c;->F(F)I

    move-result v3

    :goto_f
    sub-int v3, v11, v3

    sub-int v1, v3, v1

    goto :goto_10

    :cond_15
    const/4 v6, 0x2

    if-ne v3, v6, :cond_17

    invoke-interface {v8}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v3

    sget-object v6, Ly3/m;->w:Ly3/m;

    if-ne v3, v6, :cond_16

    invoke-interface {v8, v10}, Ly3/c;->F(F)I

    move-result v3

    goto :goto_f

    :cond_16
    invoke-interface {v8, v10}, Ly3/c;->F(F)I

    move-result v1

    goto :goto_10

    :cond_17
    sub-int v1, v11, v1

    div-int/2addr v1, v6

    :goto_10
    new-instance v3, Lc9/k;

    const/4 v6, 0x5

    invoke-direct {v3, v1, v2, v6}, Lc9/k;-><init>(III)V

    goto :goto_11

    :cond_18
    const/4 v3, 0x0

    :goto_11
    sget-object v1, Lg1/h5;->E:Lg1/h5;

    new-instance v2, Lb30/w2;

    const/16 v6, 0xa

    move-object/from16 v9, v23

    invoke-direct {v2, v6, v3, v9}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Lx1/b;

    const v9, -0x1df5ddbb

    const/4 v14, 0x1

    invoke-direct {v6, v2, v14, v9}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-interface {v8, v1, v6}, Ly2/v1;->s0(Ljava/lang/Object;Lc93/m;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    move-object v6, v1

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    const/4 v9, 0x0

    :goto_12
    if-ge v9, v6, :cond_19

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ly2/q0;

    invoke-interface {v14, v12, v13}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v14

    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    goto :goto_12

    :cond_19
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1a

    move-object/from16 v29, v2

    const/4 v6, 0x0

    goto :goto_14

    :cond_1a
    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v1, v6

    check-cast v1, Ly2/j1;

    iget v1, v1, Ly2/j1;->x:I

    invoke-static {v2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v9

    const/4 v14, 0x1

    if-gt v14, v9, :cond_1c

    const/4 v14, 0x1

    :goto_13
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v29, v2

    move-object v2, v15

    check-cast v2, Ly2/j1;

    iget v2, v2, Ly2/j1;->x:I

    if-ge v1, v2, :cond_1b

    move v1, v2

    move-object v6, v15

    :cond_1b
    if-eq v14, v9, :cond_1d

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v2, v29

    goto :goto_13

    :cond_1c
    move-object/from16 v29, v2

    :cond_1d
    :goto_14
    check-cast v6, Ly2/j1;

    if-eqz v6, :cond_1e

    iget v1, v6, Ly2/j1;->x:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_15

    :cond_1e
    const/4 v1, 0x0

    :goto_15
    if-eqz v3, :cond_20

    iget v2, v3, Lc9/k;->y:I

    if-nez v1, :cond_1f

    invoke-interface {v8, v10}, Ly3/c;->F(F)I

    move-result v6

    add-int/2addr v6, v2

    invoke-interface {v4, v8}, Ll0/b2;->c(Ly3/c;)I

    move-result v2

    :goto_16
    add-int/2addr v2, v6

    goto :goto_17

    :cond_1f
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    add-int/2addr v6, v2

    invoke-interface {v8, v10}, Ly3/c;->F(F)I

    move-result v2

    goto :goto_16

    :goto_17
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    goto :goto_18

    :cond_20
    const/4 v14, 0x0

    :goto_18
    if-eqz v16, :cond_23

    if-eqz v14, :cond_21

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_19

    :cond_21
    if-eqz v1, :cond_22

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_19

    :cond_22
    invoke-interface {v4, v8}, Ll0/b2;->c(Ly3/c;)I

    move-result v2

    :goto_19
    add-int v2, v16, v2

    goto :goto_1a

    :cond_23
    const/4 v2, 0x0

    :goto_1a
    new-instance v6, Ll0/x0;

    invoke-direct {v6, v4, v8}, Ll0/x0;-><init>(Ll0/b2;Ly3/c;)V

    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_24

    invoke-virtual {v6}, Ll0/x0;->d()F

    move-result v4

    move v9, v4

    const/4 v4, 0x0

    goto :goto_1b

    :cond_24
    const/4 v4, 0x0

    int-to-float v9, v4

    :goto_1b
    invoke-virtual/range {v29 .. v29}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_26

    if-nez v1, :cond_25

    goto :goto_1c

    :cond_25
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-interface {v8, v10}, Ly3/c;->e0(I)F

    move-result v10

    goto :goto_1d

    :cond_26
    :goto_1c
    invoke-virtual {v6}, Ll0/x0;->a()F

    move-result v10

    :goto_1d
    invoke-interface {v8}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v15

    invoke-static {v6, v15}, Landroidx/compose/foundation/layout/a;->i(Ll0/k1;Ly3/m;)F

    move-result v15

    invoke-interface {v8}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v4

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/a;->h(Ll0/k1;Ly3/m;)F

    move-result v4

    new-instance v6, Ll0/l1;

    invoke-direct {v6, v15, v9, v4, v10}, Ll0/l1;-><init>(FFFF)V

    move-object/from16 v4, v22

    iget-object v9, v4, Lg1/f5;->a:Lp1/k1;

    invoke-virtual {v9, v6}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    sub-int v27, v21, v20

    sget-object v6, Lg1/h5;->x:Lg1/h5;

    new-instance v9, Lb30/w2;

    const/16 v10, 0x9

    invoke-direct {v9, v10, v7, v4}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Lx1/b;

    const v7, -0x223ea6ea

    const/4 v10, 0x1

    invoke-direct {v4, v9, v10, v7}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-interface {v8, v6, v4}, Ly2/v1;->s0(Ljava/lang/Object;Lc93/m;)Ljava/util/List;

    move-result-object v4

    new-instance v15, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v15, v6}, Ljava/util/ArrayList;-><init>(I)V

    move-object v6, v4

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_1e
    if-ge v7, v6, :cond_27

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ly2/q0;

    const/16 v26, 0x0

    const/16 v28, 0x7

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-wide/from16 v22, v12

    invoke-static/range {v22 .. v28}, Ly3/a;->b(JIIIII)J

    move-result-wide v12

    invoke-interface {v9, v12, v13}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v9

    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    move-wide/from16 v12, v22

    goto :goto_1e

    :cond_27
    new-instance v4, Lg1/d5;

    move-object/from16 v23, v1

    move/from16 v22, v2

    move-object/from16 v24, v3

    move-object/from16 v25, v14

    move-object/from16 v17, v18

    move-object/from16 v16, v19

    move-object/from16 v18, v29

    move-object v14, v4

    move-object/from16 v19, v5

    invoke-direct/range {v14 .. v25}, Lg1/d5;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;IIILjava/lang/Integer;Lc9/k;Ljava/lang/Integer;)V

    move/from16 v1, v21

    sget-object v2, Lm83/z;->w:Lm83/z;

    invoke-interface {v8, v11, v1, v2, v14}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v1

    return-object v1

    :pswitch_8
    iget-object v1, v0, Lb30/u2;->y:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lg22/d;

    iget-object v1, v0, Lb30/u2;->z:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Leb/u0;

    iget-object v1, v0, Lb30/u2;->E:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lcom/whoop/pairing/membershipAdjustment/navigation/MembershipAdjustmentNavHostDestination;

    iget-object v1, v0, Lb30/u2;->F:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lb30/u2;->G:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Landroidx/fragment/app/o1;

    iget-object v1, v0, Lb30/u2;->H:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    iget-object v1, v0, Lb30/u2;->I:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Ljava/lang/String;

    move-object/from16 v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v9, v0, Lb30/u2;->x:I

    invoke-static/range {v2 .. v11}, Lf22/c;->j(Lg22/d;Leb/u0;Lcom/whoop/pairing/membershipAdjustment/navigation/MembershipAdjustmentNavHostDestination;Lkotlin/jvm/functions/Function1;Landroidx/fragment/app/o1;Ljava/lang/String;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_9
    iget-object v1, v0, Lb30/u2;->y:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lal1/d;

    iget-object v1, v0, Lb30/u2;->z:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lc93/m;

    iget-object v1, v0, Lb30/u2;->E:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lc93/a;

    iget-object v1, v0, Lb30/u2;->F:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lb30/u2;->G:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lb30/u2;->H:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lc93/a;

    iget-object v1, v0, Lb30/u2;->I:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object/from16 v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v9, v0, Lb30/u2;->x:I

    invoke-static/range {v2 .. v11}, Ldl1/a;->a(Lal1/d;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_a
    iget-object v1, v0, Lb30/u2;->y:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lc42/r;

    iget-object v1, v0, Lb30/u2;->z:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lc93/a;

    iget-object v1, v0, Lb30/u2;->E:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lc93/a;

    iget-object v1, v0, Lb30/u2;->F:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lb30/u2;->G:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lb30/u2;->H:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lb30/u2;->I:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object/from16 v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v9, v0, Lb30/u2;->x:I

    invoke-static/range {v2 .. v11}, Ld42/p;->a(Lc42/r;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_b
    iget-object v1, v0, Lb30/u2;->y:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lds1/a;

    iget-object v1, v0, Lb30/u2;->z:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lc93/m;

    iget-object v1, v0, Lb30/u2;->E:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lb30/u2;->F:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lv41/f$a;

    iget-object v1, v0, Lb30/u2;->G:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lbc3/c0;

    iget-object v1, v0, Lb30/u2;->H:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lb30/u2;->I:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object/from16 v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v9, v0, Lb30/u2;->x:I

    invoke-static/range {v2 .. v11}, Lbs1/c0;->x(Lds1/a;Lc93/m;Lkotlin/jvm/functions/Function1;Lv41/f$a;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_c
    iget-object v1, v0, Lb30/u2;->y:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Le30/c;

    iget-object v1, v0, Lb30/u2;->z:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lzy/c;

    iget-object v1, v0, Lb30/u2;->F:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, La30/n1;

    iget-object v1, v0, Lb30/u2;->G:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, La30/k1;

    iget-object v1, v0, Lb30/u2;->E:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lzy/c;

    iget-object v1, v0, Lb30/u2;->H:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lr20/s;

    iget-object v1, v0, Lb30/u2;->I:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lq20/b;

    move-object/from16 v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    iget v1, v0, Lb30/u2;->x:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v10

    invoke-static/range {v2 .. v10}, Lds/p;->c(Le30/c;Lzy/c;La30/n1;La30/k1;Lzy/c;Lr20/s;Lq20/b;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
