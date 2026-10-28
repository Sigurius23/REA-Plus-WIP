.class public final Lj00/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lg40/z1;

.field public final synthetic F:Lg2/s;

.field public final synthetic G:Lg40/m3;

.field public final synthetic H:Lg2/s;

.field public final synthetic I:Ljava/lang/String;

.field public final synthetic J:Z

.field public final synthetic K:Lc93/a;

.field public final synthetic L:Z

.field public final synthetic M:Lg40/m3;

.field public final synthetic N:Lg2/s;

.field public final synthetic w:Z

.field public final synthetic x:Ln00/d;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(ZLn00/d;ZZLg40/z1;Lg2/s;Lg40/m3;Lg2/s;Ljava/lang/String;ZLc93/a;ZLg40/m3;Lg2/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lj00/p;->w:Z

    iput-object p2, p0, Lj00/p;->x:Ln00/d;

    iput-boolean p3, p0, Lj00/p;->y:Z

    iput-boolean p4, p0, Lj00/p;->z:Z

    iput-object p5, p0, Lj00/p;->E:Lg40/z1;

    iput-object p6, p0, Lj00/p;->F:Lg2/s;

    iput-object p7, p0, Lj00/p;->G:Lg40/m3;

    iput-object p8, p0, Lj00/p;->H:Lg2/s;

    iput-object p9, p0, Lj00/p;->I:Ljava/lang/String;

    iput-boolean p10, p0, Lj00/p;->J:Z

    iput-object p11, p0, Lj00/p;->K:Lc93/a;

    iput-boolean p12, p0, Lj00/p;->L:Z

    iput-object p13, p0, Lj00/p;->M:Lg40/m3;

    iput-object p14, p0, Lj00/p;->N:Lg2/s;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    move-object v1, v7

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_7

    :cond_1
    :goto_0
    iget-boolean v1, v0, Lj00/p;->w:Z

    iget-boolean v2, v0, Lj00/p;->y:Z

    const/4 v3, 0x7

    const/4 v4, 0x6

    const/4 v5, 0x0

    iget-object v10, v0, Lj00/p;->x:Ln00/d;

    const/4 v11, 0x0

    if-eqz v1, :cond_4

    move-object v1, v7

    check-cast v1, Lp1/q;

    const v6, 0x65099ee0

    invoke-virtual {v1, v6}, Lp1/q;->e0(I)V

    sget-object v6, Ln00/d;->y:Ln00/d;

    if-ne v10, v6, :cond_2

    move/from16 v20, v4

    goto :goto_1

    :cond_2
    move/from16 v20, v3

    :goto_1
    if-nez v2, :cond_3

    sget-object v5, Lj00/b;->a:Lx1/b;

    :cond_3
    move-object/from16 v19, v5

    const v22, 0x30040

    const/16 v23, 0x1c

    iget-boolean v12, v0, Lj00/p;->z:Z

    iget-object v13, v0, Lj00/p;->E:Lg40/z1;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1

    iget-object v2, v0, Lj00/p;->F:Lg2/s;

    move-object/from16 v21, v1

    move-object/from16 v18, v2

    invoke-static/range {v12 .. v23}, Ldp/d;->g(ZLg40/z1;Landroidx/compose/ui/Modifier;Lc93/m;ZZLg2/s;Lc93/m;ILandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1, v11}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_4
    move-object v1, v7

    check-cast v1, Lp1/q;

    const v6, 0x6513ebef

    invoke-virtual {v1, v6}, Lp1/q;->e0(I)V

    sget-object v6, Ln00/d;->y:Ln00/d;

    iget-object v14, v0, Lj00/p;->x:Ln00/d;

    if-ne v14, v6, :cond_5

    move v15, v4

    goto :goto_2

    :cond_5
    move v15, v3

    :goto_2
    if-nez v2, :cond_6

    sget-object v5, Lj00/b;->b:Lx1/b;

    :cond_6
    move-object/from16 v17, v5

    const/16 v19, 0x0

    const/16 v20, 0x20

    iget-boolean v12, v0, Lj00/p;->z:Z

    iget-object v13, v0, Lj00/p;->G:Lg40/m3;

    iget-object v2, v0, Lj00/p;->H:Lg2/s;

    move-object/from16 v18, v1

    move-object/from16 v16, v2

    invoke-static/range {v12 .. v20}, Lug/m;->a(ZLg40/m3;Ln00/d;ILg2/s;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1, v11}, Lp1/q;->q(Z)V

    :goto_3
    sget-object v12, Ln00/d;->y:Ln00/d;

    iget-object v1, v0, Lj00/p;->I:Ljava/lang/String;

    const/4 v13, 0x1

    if-eq v10, v12, :cond_7

    if-eqz v1, :cond_7

    move v2, v13

    goto :goto_4

    :cond_7
    move v2, v11

    :goto_4
    new-instance v3, Lg1/q6;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4}, Lg1/q6;-><init>(Ljava/lang/String;I)V

    const v1, 0x6422878e

    invoke-static {v1, v7, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const/high16 v8, 0x30000

    const/16 v9, 0x1e

    move v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v9}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    iget-boolean v1, v0, Lj00/p;->J:Z

    if-nez v1, :cond_9

    if-ne v10, v12, :cond_8

    goto :goto_5

    :cond_8
    move v1, v11

    goto :goto_6

    :cond_9
    :goto_5
    move v1, v13

    :goto_6
    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v8, Lj00/o;

    iget-object v3, v0, Lj00/p;->N:Lg2/s;

    iget-object v4, v0, Lj00/p;->I:Ljava/lang/String;

    iget-object v9, v0, Lj00/p;->K:Lc93/a;

    iget-boolean v10, v0, Lj00/p;->w:Z

    iget-boolean v11, v0, Lj00/p;->z:Z

    iget-object v12, v0, Lj00/p;->G:Lg40/m3;

    iget-object v13, v0, Lj00/p;->x:Ln00/d;

    iget-boolean v14, v0, Lj00/p;->L:Z

    iget-object v15, v0, Lj00/p;->H:Lg2/s;

    iget-boolean v5, v0, Lj00/p;->y:Z

    iget-object v6, v0, Lj00/p;->E:Lg40/z1;

    move/from16 p1, v1

    iget-object v1, v0, Lj00/p;->F:Lg2/s;

    move-object/from16 v18, v1

    iget-object v1, v0, Lj00/p;->M:Lg40/m3;

    move-object/from16 v19, v1

    move-object/from16 v20, v3

    move-object/from16 v21, v4

    move/from16 v16, v5

    move-object/from16 v17, v6

    invoke-direct/range {v8 .. v21}, Lj00/o;-><init>(Lc93/a;ZZLg40/m3;Ln00/d;ZLg2/s;ZLg40/z1;Lg2/s;Lg40/m3;Lg2/s;Ljava/lang/String;)V

    const v1, -0x3c4bd13b

    invoke-static {v1, v7, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const v8, 0x30030

    const/16 v9, 0x1c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move/from16 v1, p1

    invoke-static/range {v1 .. v9}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    :goto_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
