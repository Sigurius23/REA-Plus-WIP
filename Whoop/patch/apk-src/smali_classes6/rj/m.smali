.class public final Lrj/m;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Z

.field public final synthetic x:Luj/i;


# direct methods
.method public constructor <init>(ZLuj/i;)V
    .locals 0

    iput-boolean p1, p0, Lrj/m;->w:Z

    iput-object p2, p0, Lrj/m;->x:Luj/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0xb

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    move-object v1, v6

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_5

    :cond_1
    :goto_0
    const/4 v1, 0x5

    const v7, 0x41130a3d    # 9.19f

    const v8, -0x3f19eb85    # -7.19f

    const/high16 v9, 0x41b00000    # 22.0f

    const v10, -0x3f1f0a3d    # -7.03f

    const v11, 0x419170a4    # 18.18f

    const v12, 0x418a28f6    # 17.27f

    const/high16 v13, 0x41400000    # 12.0f

    const/high16 v14, 0x41a80000    # 21.0f

    const v15, 0x4113d70a    # 9.24f

    const/high16 v2, 0x40000000    # 2.0f

    iget-boolean v3, v0, Lrj/m;->w:Z

    if-eqz v3, :cond_3

    sget-object v16, Lds/q;->b:Lo2/e;

    if-eqz v16, :cond_2

    move-object/from16 v17, v6

    goto :goto_1

    :cond_2
    new-instance v17, Lo2/d;

    const/16 v25, 0x0

    const/16 v27, 0x60

    const-string v18, "Filled.Star"

    const/high16 v19, 0x41c00000    # 24.0f

    const/high16 v20, 0x41c00000    # 24.0f

    const/high16 v21, 0x41c00000    # 24.0f

    const/high16 v22, 0x41c00000    # 24.0f

    const-wide/16 v23, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v17 .. v27}, Lo2/d;-><init>(Ljava/lang/String;FFFFJIZI)V

    move-object/from16 v28, v17

    sget v16, Lo2/f0;->a:I

    new-instance v4, Li2/c1;

    move-object/from16 v17, v6

    sget-wide v5, Li2/x;->b:J

    invoke-direct {v4, v5, v6}, Li2/c1;-><init>(J)V

    new-instance v5, Laa3/u0;

    invoke-direct {v5, v1}, Laa3/u0;-><init>(I)V

    invoke-virtual {v5, v13, v12}, Laa3/u0;->t(FF)V

    invoke-virtual {v5, v11, v14}, Laa3/u0;->r(FF)V

    const v1, -0x402e147b    # -1.64f

    invoke-virtual {v5, v1, v10}, Laa3/u0;->s(FF)V

    invoke-virtual {v5, v9, v15}, Laa3/u0;->r(FF)V

    const v1, -0x40e3d70a    # -0.61f

    invoke-virtual {v5, v8, v1}, Laa3/u0;->s(FF)V

    invoke-virtual {v5, v13, v2}, Laa3/u0;->r(FF)V

    const v1, 0x410a147b    # 8.63f

    invoke-virtual {v5, v7, v1}, Laa3/u0;->r(FF)V

    invoke-virtual {v5, v2, v15}, Laa3/u0;->r(FF)V

    const v1, 0x40975c29    # 4.73f

    const v2, 0x40aeb852    # 5.46f

    invoke-virtual {v5, v2, v1}, Laa3/u0;->s(FF)V

    const v1, 0x40ba3d71    # 5.82f

    invoke-virtual {v5, v1, v14}, Laa3/u0;->r(FF)V

    invoke-virtual {v5}, Laa3/u0;->i()V

    iget-object v1, v5, Laa3/u0;->a:Ljava/util/ArrayList;

    move-object/from16 v2, v28

    invoke-static {v2, v1, v4}, Lo2/d;->a(Lo2/d;Ljava/util/ArrayList;Li2/c1;)V

    invoke-virtual {v2}, Lo2/d;->b()Lo2/e;

    move-result-object v16

    sput-object v16, Lds/q;->b:Lo2/e;

    :goto_1
    move-object/from16 v1, v16

    goto/16 :goto_2

    :cond_3
    move-object/from16 v17, v6

    sget-object v4, Lds/p;->a:Lo2/e;

    if-eqz v4, :cond_4

    move-object/from16 v16, v4

    goto :goto_1

    :cond_4
    new-instance v19, Lo2/d;

    const/16 v27, 0x0

    const/16 v29, 0x60

    const-string v20, "Filled.StarBorder"

    const/high16 v21, 0x41c00000    # 24.0f

    const/high16 v22, 0x41c00000    # 24.0f

    const/high16 v23, 0x41c00000    # 24.0f

    const/high16 v24, 0x41c00000    # 24.0f

    const-wide/16 v25, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v19 .. v29}, Lo2/d;-><init>(Ljava/lang/String;FFFFJIZI)V

    move-object/from16 v4, v19

    sget v5, Lo2/f0;->a:I

    new-instance v5, Li2/c1;

    sget-wide v10, Li2/x;->b:J

    invoke-direct {v5, v10, v11}, Li2/c1;-><init>(J)V

    new-instance v10, Laa3/u0;

    invoke-direct {v10, v1}, Laa3/u0;-><init>(I)V

    invoke-virtual {v10, v9, v15}, Laa3/u0;->t(FF)V

    const v1, -0x40e147ae    # -0.62f

    invoke-virtual {v10, v8, v1}, Laa3/u0;->s(FF)V

    invoke-virtual {v10, v13, v2}, Laa3/u0;->r(FF)V

    const v1, 0x410a147b    # 8.63f

    invoke-virtual {v10, v7, v1}, Laa3/u0;->r(FF)V

    invoke-virtual {v10, v2, v15}, Laa3/u0;->r(FF)V

    const v1, 0x40975c29    # 4.73f

    const v2, 0x40aeb852    # 5.46f

    invoke-virtual {v10, v2, v1}, Laa3/u0;->s(FF)V

    const v1, 0x40ba3d71    # 5.82f

    invoke-virtual {v10, v1, v14}, Laa3/u0;->r(FF)V

    invoke-virtual {v10, v13, v12}, Laa3/u0;->r(FF)V

    const v6, 0x419170a4    # 18.18f

    invoke-virtual {v10, v6, v14}, Laa3/u0;->r(FF)V

    const v1, -0x402f5c29    # -1.63f

    const v2, -0x3f1f0a3d    # -7.03f

    invoke-virtual {v10, v1, v2}, Laa3/u0;->s(FF)V

    invoke-virtual {v10, v9, v15}, Laa3/u0;->r(FF)V

    invoke-virtual {v10}, Laa3/u0;->i()V

    const v1, 0x41766666    # 15.4f

    invoke-virtual {v10, v13, v1}, Laa3/u0;->t(FF)V

    const v2, -0x3f8f5c29    # -3.76f

    const v6, 0x401147ae    # 2.27f

    invoke-virtual {v10, v2, v6}, Laa3/u0;->s(FF)V

    const v2, -0x3f770a3d    # -4.28f

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-virtual {v10, v6, v2}, Laa3/u0;->s(FF)V

    const v2, -0x3fc7ae14    # -2.88f

    const v7, -0x3fab851f    # -3.32f

    invoke-virtual {v10, v7, v2}, Laa3/u0;->s(FF)V

    const v2, -0x413d70a4    # -0.38f

    const v8, 0x408c28f6    # 4.38f

    invoke-virtual {v10, v8, v2}, Laa3/u0;->s(FF)V

    const v2, 0x40c33333    # 6.1f

    invoke-virtual {v10, v13, v2}, Laa3/u0;->r(FF)V

    const v2, 0x3fdae148    # 1.71f

    const v9, 0x408147ae    # 4.04f

    invoke-virtual {v10, v2, v9}, Laa3/u0;->s(FF)V

    const v2, 0x3ec28f5c    # 0.38f

    invoke-virtual {v10, v8, v2}, Laa3/u0;->s(FF)V

    const v2, 0x403851ec    # 2.88f

    invoke-virtual {v10, v7, v2}, Laa3/u0;->s(FF)V

    const v2, 0x4088f5c3    # 4.28f

    invoke-virtual {v10, v6, v2}, Laa3/u0;->s(FF)V

    invoke-virtual {v10, v13, v1}, Laa3/u0;->r(FF)V

    invoke-virtual {v10}, Laa3/u0;->i()V

    iget-object v1, v10, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-static {v4, v1, v5}, Lo2/d;->a(Lo2/d;Ljava/util/ArrayList;Li2/c1;)V

    invoke-virtual {v4}, Lo2/d;->b()Lo2/e;

    move-result-object v1

    sput-object v1, Lds/p;->a:Lo2/e;

    move-object/from16 v16, v1

    goto/16 :goto_1

    :goto_2
    iget-object v2, v0, Lrj/m;->x:Luj/i;

    if-eqz v3, :cond_6

    iget-object v2, v2, Luj/i;->o:Li2/x;

    if-eqz v2, :cond_5

    iget-wide v2, v2, Li2/x;->a:J

    :goto_3
    move-wide v4, v2

    goto :goto_4

    :cond_5
    sget-wide v2, Luj/f;->z:J

    goto :goto_3

    :cond_6
    iget-object v2, v2, Luj/i;->n:Li2/x;

    if-eqz v2, :cond_7

    iget-wide v2, v2, Li2/x;->a:J

    goto :goto_3

    :cond_7
    sget-wide v2, Luj/f;->z:J

    goto :goto_3

    :goto_4
    const/16 v2, 0x18

    int-to-float v2, v2

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v7, 0x1b0

    const/4 v8, 0x0

    const-string v2, "Star rating"

    move-object/from16 v6, v17

    invoke-static/range {v1 .. v8}, Ll1/r1;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
