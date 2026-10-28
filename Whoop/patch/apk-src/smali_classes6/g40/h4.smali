.class public final Lg40/h4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Lg40/r3;

.field public final synthetic G:Z

.field public final synthetic H:Lg40/h1;

.field public final synthetic I:Lq3/g0;

.field public final synthetic J:Lu0/r0;

.field public final synthetic K:Lu0/q0;

.field public final synthetic L:Lg1/y1;

.field public final synthetic M:Ld40/g;

.field public final synthetic N:Z

.field public final synthetic O:Ljava/lang/String;

.field public final synthetic P:Z

.field public final synthetic Q:Z

.field public final synthetic R:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:Lq3/y;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lg40/r3;ZLg40/h1;Lq3/g0;Lu0/r0;Lu0/q0;Lg1/y1;Ld40/g;ZLjava/lang/String;ZZLkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/h4;->w:Lq3/y;

    iput-object p2, p0, Lg40/h4;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lg40/h4;->y:Landroidx/compose/ui/Modifier;

    iput-boolean p4, p0, Lg40/h4;->z:Z

    iput-object p5, p0, Lg40/h4;->E:Ljava/lang/String;

    iput-object p6, p0, Lg40/h4;->F:Lg40/r3;

    iput-boolean p7, p0, Lg40/h4;->G:Z

    iput-object p8, p0, Lg40/h4;->H:Lg40/h1;

    iput-object p9, p0, Lg40/h4;->I:Lq3/g0;

    iput-object p10, p0, Lg40/h4;->J:Lu0/r0;

    iput-object p11, p0, Lg40/h4;->K:Lu0/q0;

    iput-object p12, p0, Lg40/h4;->L:Lg1/y1;

    iput-object p13, p0, Lg40/h4;->M:Ld40/g;

    iput-boolean p14, p0, Lg40/h4;->N:Z

    iput-object p15, p0, Lg40/h4;->O:Ljava/lang/String;

    move/from16 p1, p16

    iput-boolean p1, p0, Lg40/h4;->P:Z

    move/from16 p1, p17

    iput-boolean p1, p0, Lg40/h4;->Q:Z

    move-object/from16 p1, p18

    iput-object p1, p0, Lg40/h4;->R:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_6

    :cond_1
    :goto_0
    iget-object v2, v0, Lg40/h4;->y:Landroidx/compose/ui/Modifier;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    new-instance v2, Lg40/g4;

    iget-object v3, v0, Lg40/h4;->O:Ljava/lang/String;

    iget-boolean v4, v0, Lg40/h4;->P:Z

    iget-boolean v5, v0, Lg40/h4;->N:Z

    invoke-direct {v2, v3, v5, v4}, Lg40/g4;-><init>(Ljava/lang/String;ZZ)V

    const v3, 0x443a57f7

    invoke-static {v3, v1, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    check-cast v1, Lp1/q;

    const v2, 0x171c2533

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    iget-object v3, v0, Lg40/h4;->E:Ljava/lang/String;

    if-nez v3, :cond_2

    move-object v10, v2

    goto :goto_1

    :cond_2
    new-instance v4, Lb30/b0;

    const/4 v5, 0x2

    invoke-direct {v4, v3, v5}, Lb30/b0;-><init>(Ljava/lang/String;I)V

    const v3, 0x1fcb0181

    invoke-static {v3, v1, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    move-object v10, v3

    :goto_1
    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    const v4, 0x171c36f4

    invoke-virtual {v1, v4}, Lp1/q;->e0(I)V

    iget-object v4, v0, Lg40/h4;->F:Lg40/r3;

    if-nez v4, :cond_3

    move-object v11, v2

    goto :goto_2

    :cond_3
    new-instance v5, Lb30/j5;

    const/4 v7, 0x1

    iget-boolean v8, v0, Lg40/h4;->Q:Z

    iget-object v11, v0, Lg40/h4;->R:Lkotlin/jvm/functions/Function1;

    invoke-direct {v5, v4, v8, v11, v7}, Lb30/j5;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    const v4, -0xf9e96dc

    invoke-static {v4, v1, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    move-object v11, v4

    :goto_2
    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    iget-object v4, v0, Lg40/h4;->H:Lg40/h1;

    if-eqz v4, :cond_4

    invoke-interface {v4}, Lg40/h1;->b()Lzy/b;

    move-result-object v4

    goto :goto_3

    :cond_4
    move-object v4, v2

    :goto_3
    const v5, 0x171c54ba

    invoke-virtual {v1, v5}, Lp1/q;->e0(I)V

    if-nez v4, :cond_5

    :goto_4
    move-object v13, v2

    goto :goto_5

    :cond_5
    invoke-static {v4, v1}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :goto_5
    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    iget-object v2, v0, Lg40/h4;->M:Ld40/g;

    invoke-virtual {v2}, Ld40/g;->a()Ll0/l1;

    move-result-object v23

    const/high16 v26, 0x30000

    const v27, 0xf0130

    iget-object v4, v0, Lg40/h4;->w:Lq3/y;

    iget-object v5, v0, Lg40/h4;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v7, v0, Lg40/h4;->z:Z

    const/4 v8, 0x0

    iget-boolean v12, v0, Lg40/h4;->G:Z

    iget-object v14, v0, Lg40/h4;->I:Lq3/g0;

    iget-object v15, v0, Lg40/h4;->J:Lu0/r0;

    iget-object v2, v0, Lg40/h4;->K:Lu0/q0;

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    iget-object v3, v0, Lg40/h4;->L:Lg1/y1;

    const/high16 v25, 0x180000

    move-object/from16 v24, v1

    move-object/from16 v16, v2

    move-object/from16 v22, v3

    invoke-static/range {v4 .. v27}, Lvp/c;->h(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lc93/m;ZLjava/lang/String;Lq3/g0;Lu0/r0;Lu0/q0;ZIILj0/i;Li2/a1;Lg1/y1;Ll0/l1;Landroidx/compose/runtime/Composer;III)V

    :goto_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
