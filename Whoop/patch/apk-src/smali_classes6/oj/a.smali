.class public final Loj/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final x:Loj/a;

.field public static final y:Loj/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Loj/a;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Loj/a;-><init>(II)V

    sput-object v0, Loj/a;->x:Loj/a;

    new-instance v0, Loj/a;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Loj/a;-><init>(II)V

    sput-object v0, Loj/a;->y:Loj/a;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Loj/a;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    iget v1, v0, Loj/a;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x2

    packed-switch v1, :pswitch_data_0

    move-object/from16 v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0xb

    if-ne v1, v3, :cond_1

    move-object v1, v9

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, Lcom/squareup/wire/n;->H()Lo2/e;

    move-result-object v4

    sget-wide v7, Luj/g;->i:J

    const/16 v1, 0x10

    int-to-float v1, v1

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v10, 0xdb0

    const/4 v11, 0x0

    const-string v5, "Info"

    invoke-static/range {v4 .. v11}, Ll1/r1;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    :goto_1
    return-object v2

    :pswitch_0
    move-object/from16 v17, p1

    check-cast v17, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0xb

    if-ne v1, v3, :cond_3

    move-object/from16 v1, v17

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_5

    :cond_3
    :goto_2
    sget-object v1, Lbi/g;->a:Lo2/e;

    if-eqz v1, :cond_4

    :goto_3
    move-object v12, v1

    goto/16 :goto_4

    :cond_4
    new-instance v3, Lo2/d;

    const/4 v11, 0x0

    const/16 v13, 0x60

    const-string v4, "Filled.ContentCopy"

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const/high16 v7, 0x41c00000    # 24.0f

    const/high16 v8, 0x41c00000    # 24.0f

    const-wide/16 v9, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v3 .. v13}, Lo2/d;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Lo2/f0;->a:I

    new-instance v1, Li2/c1;

    sget-wide v4, Li2/x;->b:J

    invoke-direct {v1, v4, v5}, Li2/c1;-><init>(J)V

    new-instance v6, Laa3/u0;

    const/4 v4, 0x5

    invoke-direct {v6, v4}, Laa3/u0;-><init>(I)V

    const/high16 v4, 0x41800000    # 16.0f

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v6, v4, v5}, Laa3/u0;->t(FF)V

    const/high16 v13, 0x40800000    # 4.0f

    invoke-virtual {v6, v13, v5}, Laa3/u0;->r(FF)V

    const/high16 v11, -0x40000000    # -2.0f

    const/high16 v12, 0x40000000    # 2.0f

    const v7, -0x40733333    # -1.1f

    const/4 v8, 0x0

    const/high16 v9, -0x40000000    # -2.0f

    const v10, 0x3f666666    # 0.9f

    invoke-virtual/range {v6 .. v12}, Laa3/u0;->k(FFFFFF)V

    const/high16 v14, 0x41600000    # 14.0f

    invoke-virtual {v6, v14}, Laa3/u0;->v(F)V

    const/high16 v7, 0x40000000    # 2.0f

    invoke-virtual {v6, v7}, Laa3/u0;->q(F)V

    const/high16 v7, 0x40400000    # 3.0f

    invoke-virtual {v6, v13, v7}, Laa3/u0;->r(FF)V

    const/high16 v7, 0x41400000    # 12.0f

    invoke-virtual {v6, v7}, Laa3/u0;->q(F)V

    invoke-virtual {v6, v4, v5}, Laa3/u0;->r(FF)V

    invoke-virtual {v6}, Laa3/u0;->i()V

    const/high16 v4, 0x41980000    # 19.0f

    const/high16 v5, 0x40a00000    # 5.0f

    invoke-virtual {v6, v4, v5}, Laa3/u0;->t(FF)V

    const/high16 v13, 0x41000000    # 8.0f

    invoke-virtual {v6, v13, v5}, Laa3/u0;->r(FF)V

    const v7, -0x40733333    # -1.1f

    invoke-virtual/range {v6 .. v12}, Laa3/u0;->k(FFFFFF)V

    invoke-virtual {v6, v14}, Laa3/u0;->v(F)V

    const/high16 v11, 0x40000000    # 2.0f

    const/4 v7, 0x0

    const v8, 0x3f8ccccd    # 1.1f

    const v9, 0x3f666666    # 0.9f

    const/high16 v10, 0x40000000    # 2.0f

    invoke-virtual/range {v6 .. v12}, Laa3/u0;->k(FFFFFF)V

    const/high16 v5, 0x41300000    # 11.0f

    invoke-virtual {v6, v5}, Laa3/u0;->q(F)V

    const/high16 v12, -0x40000000    # -2.0f

    const v7, 0x3f8ccccd    # 1.1f

    const/4 v8, 0x0

    const/high16 v9, 0x40000000    # 2.0f

    const v10, -0x4099999a    # -0.9f

    invoke-virtual/range {v6 .. v12}, Laa3/u0;->k(FFFFFF)V

    const/high16 v15, 0x41a80000    # 21.0f

    const/high16 v7, 0x40e00000    # 7.0f

    invoke-virtual {v6, v15, v7}, Laa3/u0;->r(FF)V

    const/high16 v11, -0x40000000    # -2.0f

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const v8, -0x40733333    # -1.1f

    move v10, v9

    const v9, -0x4099999a    # -0.9f

    move/from16 v16, v10

    const/high16 v10, -0x40000000    # -2.0f

    move/from16 v14, v16

    invoke-virtual/range {v6 .. v12}, Laa3/u0;->k(FFFFFF)V

    invoke-virtual {v6}, Laa3/u0;->i()V

    invoke-virtual {v6, v4, v15}, Laa3/u0;->t(FF)V

    invoke-virtual {v6, v13, v15}, Laa3/u0;->r(FF)V

    invoke-virtual {v6, v13, v14}, Laa3/u0;->r(FF)V

    invoke-virtual {v6, v5}, Laa3/u0;->q(F)V

    const/high16 v4, 0x41600000    # 14.0f

    invoke-virtual {v6, v4}, Laa3/u0;->v(F)V

    invoke-virtual {v6}, Laa3/u0;->i()V

    iget-object v4, v6, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-static {v3, v4, v1}, Lo2/d;->a(Lo2/d;Ljava/util/ArrayList;Li2/c1;)V

    invoke-virtual {v3}, Lo2/d;->b()Lo2/e;

    move-result-object v1

    sput-object v1, Lbi/g;->a:Lo2/e;

    goto/16 :goto_3

    :goto_4
    sget-wide v15, Luj/g;->u:J

    const/16 v18, 0xc30

    const/16 v19, 0x4

    const-string v13, "Copy to clipboard"

    const/4 v14, 0x0

    invoke-static/range {v12 .. v19}, Ll1/r1;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    :goto_5
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
