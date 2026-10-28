.class public abstract Lfo2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001aS\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001aA\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0017H\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u001a\'\u0010\u001b\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0017H\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\"\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00000 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lfo2/d;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "h",
        "(Lfo2/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "",
        "quantity",
        "minQuantity",
        "maxQuantity",
        "",
        "isUpdating",
        "",
        "lineItemId",
        "productLabel",
        "k",
        "(IIIZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "enabled",
        "event",
        "Lkotlin/Function0;",
        "content",
        "n",
        "(ZLjava/lang/Object;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V",
        "q",
        "(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V",
        "a",
        "Lfo2/d;",
        "previewViewState",
        "",
        "b",
        "Ljava/util/List;",
        "quantityStatePreviewItems",
        "universal-checkout_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lfo2/d;

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lfo2/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 25

    new-instance v1, Lfo2/d;

    const-string v0, "MG SportFlex Band"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    const-string v2, "CR7 Away"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v3, "$59"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/16 v15, 0x36a8

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/16 v9, 0xa

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v12, "line-1"

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v24, v1

    move-object v1, v0

    move-object/from16 v0, v24

    invoke-direct/range {v0 .. v16}, Lfo2/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIZZLjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v0

    sput-object v1, Lfo2/c;->a:Lfo2/d;

    const-string v0, "Editable \u00b7 min 0 / max 10"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/16 v16, 0x3e3d

    const/16 v17, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/16 v10, 0xa

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v1 .. v17}, Lfo2/d;->b(Lfo2/d;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIZZLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lfo2/d;

    move-result-object v18

    const-string v0, "At max quantity \u00b7 min 0 / max 5"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/4 v8, 0x5

    const/4 v10, 0x5

    invoke-static/range {v1 .. v17}, Lfo2/d;->b(Lfo2/d;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIZZLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lfo2/d;

    move-result-object v19

    const-string v0, "Min quantity 1 \u00b7 min 1 / max 3"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/4 v8, 0x1

    const/4 v9, 0x1

    const/4 v10, 0x3

    invoke-static/range {v1 .. v17}, Lfo2/d;->b(Lfo2/d;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIZZLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lfo2/d;

    move-result-object v20

    const-string v0, "Min quantity above 1 \u00b7 min 2 / max 5"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/4 v8, 0x2

    const/4 v9, 0x2

    const/4 v10, 0x5

    invoke-static/range {v1 .. v17}, Lfo2/d;->b(Lfo2/d;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIZZLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lfo2/d;

    move-result-object v21

    const-string v0, "Not editable \u00b7 min 1 / max 1"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/16 v16, 0x3c3d

    const/4 v8, 0x1

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x1

    invoke-static/range {v1 .. v17}, Lfo2/d;->b(Lfo2/d;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIZZLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lfo2/d;

    move-result-object v22

    const-string v0, "Hidden quantity"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/16 v16, 0x3bfd

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    invoke-static/range {v1 .. v17}, Lfo2/d;->b(Lfo2/d;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIZZLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lfo2/d;

    move-result-object v23

    filled-new-array/range {v18 .. v23}, [Lfo2/d;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lfo2/c;->b:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lfo2/c;->r(Landroidx/compose/ui/Modifier;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(IIIZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lfo2/c;->m(IIIZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lfo2/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lfo2/c;->j(Lfo2/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lfo2/c;->l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ZLjava/lang/Object;Lkotlin/jvm/functions/Function1;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lfo2/c;->p(ZLjava/lang/Object;Lkotlin/jvm/functions/Function1;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lfo2/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lfo2/c;->i(Lfo2/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lfo2/c;->o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lfo2/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfo2/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move-object/from16 v11, p1

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, 0x32d98255

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    const/4 v3, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v5, v1, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v12, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v6, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v6, v1, 0x180

    if-nez v6, :cond_4

    move-object/from16 v6, p2

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_3

    :cond_6
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    :goto_4
    and-int/lit16 v7, v0, 0x93

    const/16 v8, 0x92

    if-eq v7, v8, :cond_7

    const/4 v7, 0x1

    goto :goto_5

    :cond_7
    const/4 v7, 0x0

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v12, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_19

    sget-object v7, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_8

    move-object v5, v7

    goto :goto_6

    :cond_8
    move-object v5, v6

    :goto_6
    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v3, v3

    const/16 v13, 0x8

    int-to-float v13, v13

    mul-float/2addr v3, v13

    const/high16 v14, 0x3fc00000    # 1.5f

    mul-float/2addr v14, v13

    invoke-static {v8, v3, v14}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, Lb2/e;->J:Lb2/l;

    invoke-static {v14}, Ll0/m;->i(F)Ll0/k;

    move-result-object v14

    const/16 v15, 0x36

    invoke-static {v14, v8, v12, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_9

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_7
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v12, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v12, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-nez v6, :cond_a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :cond_a
    invoke-static {v9, v12, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v12, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v3, 0x14

    int-to-float v3, v3

    const/4 v6, 0x4

    int-to-float v6, v6

    mul-float/2addr v3, v6

    invoke-static {v3, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move/from16 v38, v0

    const/4 v0, 0x1

    int-to-float v1, v0

    invoke-static {v9, v1, v6}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v6, v12, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    move-object/from16 v39, v5

    invoke-virtual/range {v16 .. v16}, Ly81/i;->y()J

    move-result-wide v4

    sget-object v11, Li2/w0;->a:Li2/v0;

    invoke-static {v0, v4, v5, v11}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lb2/e;->E:Lb2/m;

    const/4 v5, 0x0

    invoke-static {v4, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    move-object v11, v6

    iget-wide v5, v12, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v12}, Lp1/q;->i0()V

    move-object/from16 v21, v11

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_c

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v12, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v12, Lp1/q;->S:Z

    if-nez v4, :cond_d

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    :cond_d
    invoke-static {v5, v12, v5, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v12, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move v0, v13

    invoke-virtual/range {p0 .. p0}, Lfo2/d;->f()Lkd1/o;

    move-result-object v13

    move-object v4, v14

    invoke-virtual/range {p0 .. p0}, Lfo2/d;->l()Ljava/util/List;

    move-result-object v14

    invoke-static {v3, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v5, Lkd1/o;->a:I

    shl-int/lit8 v5, v5, 0x3

    const/16 v6, 0xc06

    or-int v18, v6, v5

    const/16 v19, 0x8

    move-object/from16 v34, v12

    sget-object v12, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    const/16 v16, 0x0

    move-object v5, v15

    move-object v15, v3

    move-object v3, v5

    move-object/from16 v17, v34

    const/16 v5, 0x36

    invoke-static/range {v12 .. v19}, Lnn2/a;->b(Ll0/u;Lkd1/o;Ljava/util/List;Landroidx/compose/ui/Modifier;Ly2/k;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v12, v17

    const/4 v6, 0x1

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    const/high16 v11, 0x3f800000    # 1.0f

    float-to-double v13, v11

    const-wide/16 v15, 0x0

    cmpl-double v13, v13, v15

    if-lez v13, :cond_f

    goto :goto_9

    :cond_f
    const-string v13, "invalid weight; must be greater than zero"

    invoke-static {v13}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_9
    new-instance v13, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v13, v11, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/high16 v6, 0x3f000000    # 0.5f

    mul-float/2addr v6, v0

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v11, Lb2/e;->M:Lb2/k;

    const/4 v14, 0x6

    invoke-static {v6, v11, v12, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v14, v12, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_10

    invoke-virtual {v12, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_10
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v12, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-nez v6, :cond_11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v6, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_12

    :cond_11
    invoke-static {v11, v12, v11, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v12, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lfo2/d;->n()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v11, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v6, v12, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v13, v21

    invoke-virtual {v13, v12, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->s()Lb91/a;

    move-result-object v32

    invoke-virtual {v13, v12, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->y()J

    move-result-wide v14

    sget v16, Lb91/a;->d:I

    shl-int/lit8 v36, v16, 0x12

    const v37, 0x2fffa

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const-wide/16 v21, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v25, v24

    const/16 v24, 0x0

    move-object/from16 v27, v25

    const-wide/16 v25, 0x0

    move-object/from16 v28, v27

    const/16 v27, 0x0

    move-object/from16 v29, v28

    const/16 v28, 0x0

    move-object/from16 v30, v29

    const/16 v29, 0x0

    move-object/from16 v31, v30

    const/16 v30, 0x0

    move-object/from16 v33, v31

    const/16 v31, 0x0

    move-object/from16 v34, v33

    const/16 v33, 0x0

    const/16 v35, 0x0

    move-object/from16 v40, v12

    move-object v12, v6

    move-object/from16 v6, v34

    move-object/from16 v34, v40

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v34

    invoke-virtual/range {p0 .. p0}, Lfo2/d;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-static {v13, v12, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6, v12, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->d()Lb91/a;

    move-result-object v32

    invoke-virtual {v6, v12, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->b1()J

    move-result-wide v14

    move-object v12, v13

    const/4 v13, 0x0

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v34

    const/4 v13, 0x1

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    sget-object v13, Lb2/e;->O:Lb2/k;

    invoke-static {v1, v0, v13, v12, v5}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v0

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_13

    invoke-virtual {v12, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_13
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v12, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    :cond_14
    invoke-static {v1, v12, v1, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v12, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lfo2/d;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v12, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v12, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->s()Lb91/a;

    move-result-object v32

    invoke-virtual {v6, v12, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v14

    const/16 v35, 0x0

    const v37, 0x2fffa

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    move-object/from16 v34, v12

    move-object v12, v0

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v34

    invoke-virtual/range {p0 .. p0}, Lfo2/d;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_16

    const v0, -0x74cb5c1b

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_16
    const v1, -0x74cb5c1a

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-static {v0, v12, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v12, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->d()Lb91/a;

    move-result-object v32

    invoke-virtual {v6, v12, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->b1()J

    move-result-wide v14

    const/high16 v35, 0x6000000

    const v37, 0x2fefa

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    sget-object v23, Lw3/l;->d:Lw3/l;

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    move-object/from16 v34, v12

    move-object v12, v0

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v34

    const/4 v5, 0x0

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual/range {p0 .. p0}, Lfo2/d;->e()Z

    move-result v0

    if-nez v0, :cond_18

    const v0, -0x74c5c298

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lfo2/d;->o()Z

    move-result v0

    if-eqz v0, :cond_17

    const v0, -0x74c54fad

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    new-instance v0, Lej1/h;

    const/16 v1, 0xf

    move-object/from16 v4, p0

    invoke-direct {v0, v4, v1}, Lej1/h;-><init>(Ljava/lang/Object;I)V

    const v1, 0x342fa7a3

    invoke-static {v1, v12, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x30

    const/4 v13, 0x1

    invoke-static {v1, v0, v12, v2, v13}, Lfo2/c;->q(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x0

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    move v0, v5

    move v1, v13

    goto :goto_d

    :cond_17
    const/4 v5, 0x0

    const/4 v13, 0x1

    move-object/from16 v4, p0

    const v0, -0x74c02a4c

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    move v0, v5

    invoke-virtual {v4}, Lfo2/d;->k()I

    move-result v5

    invoke-virtual {v4}, Lfo2/d;->i()I

    move-result v6

    invoke-virtual {v4}, Lfo2/d;->h()I

    move-result v7

    invoke-virtual {v4}, Lfo2/d;->p()Z

    move-result v8

    invoke-virtual {v4}, Lfo2/d;->g()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4}, Lfo2/d;->c()Ljava/lang/String;

    move-result-object v10

    shl-int/lit8 v1, v38, 0xf

    const/high16 v2, 0x380000

    and-int/2addr v1, v2

    move v11, v13

    move v13, v1

    move v1, v11

    move-object/from16 v11, p1

    invoke-static/range {v5 .. v13}, Lfo2/c;->k(IIIZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_18
    const/4 v0, 0x0

    const/4 v1, 0x1

    move-object/from16 v4, p0

    const v2, -0x74b8cc24

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    move-object/from16 v5, v39

    goto :goto_f

    :cond_19
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v5, v6

    :goto_f
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1a

    new-instance v0, Lf02/c;

    const/4 v3, 0x7

    move-object/from16 v6, p1

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lf02/c;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final i(Lfo2/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 28

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Lfo2/d;->k()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v1, v2, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->r()Lb91/a;

    move-result-object v22

    invoke-virtual {v1, v2, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v4

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v26, v1, 0x12

    const v27, 0x2fffa

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, v2

    move-object v2, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v24, v2

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(Lfo2/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lfo2/c;->h(Lfo2/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(IIIZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v8, p8

    move-object/from16 v13, p7

    check-cast v13, Lp1/q;

    const v0, 0x5da7d2bf

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v7, v8, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v13, v2}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :cond_3
    and-int/lit16 v7, v8, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v13, v3}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    :cond_5
    and-int/lit16 v7, v8, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v13, v4}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v0, v7

    :cond_7
    and-int/lit16 v7, v8, 0x6000

    if-nez v7, :cond_9

    invoke-virtual {v13, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x4000

    goto :goto_5

    :cond_8
    const/16 v7, 0x2000

    :goto_5
    or-int/2addr v0, v7

    :cond_9
    const/high16 v7, 0x30000

    and-int/2addr v7, v8

    if-nez v7, :cond_b

    invoke-virtual {v13, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/high16 v7, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v7, 0x10000

    :goto_6
    or-int/2addr v0, v7

    :cond_b
    const/high16 v7, 0x180000

    and-int/2addr v7, v8

    move-object/from16 v11, p6

    if-nez v7, :cond_d

    invoke-virtual {v13, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    const/high16 v7, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v7, 0x80000

    :goto_7
    or-int/2addr v0, v7

    :cond_d
    const v7, 0x92493

    and-int/2addr v7, v0

    const v9, 0x92492

    const/4 v15, 0x0

    if-eq v7, v9, :cond_e

    const/4 v7, 0x1

    goto :goto_8

    :cond_e
    move v7, v15

    :goto_8
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v13, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_15

    sget-object v7, Lb2/e;->J:Lb2/l;

    const/16 v9, 0x8

    int-to-float v9, v9

    const/high16 v12, 0x3f000000    # 0.5f

    mul-float/2addr v9, v12

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v9

    const/16 v12, 0x36

    invoke-static {v9, v7, v13, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v10, v13, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v13, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v14, v13, Lp1/q;->S:Z

    if-eqz v14, :cond_f

    invoke-virtual {v13, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_9
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v13, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v13, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-nez v10, :cond_10

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_11

    :cond_10
    invoke-static {v9, v13, v9, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v13, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez v4, :cond_12

    if-le v1, v2, :cond_12

    const/4 v9, 0x1

    goto :goto_a

    :cond_12
    move v9, v15

    :goto_a
    const/4 v7, 0x1

    if-ne v1, v7, :cond_13

    const v10, -0x1fa7c9ce

    invoke-virtual {v13, v10}, Lp1/q;->e0(I)V

    new-instance v10, Leo2/c$f;

    invoke-direct {v10, v5, v6}, Leo2/c$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v11, Lfo2/e;->a:Lfo2/e;

    invoke-virtual {v11}, Lfo2/e;->f()Lc93/m;

    move-result-object v12

    shr-int/lit8 v11, v0, 0xc

    and-int/lit16 v11, v11, 0x380

    or-int/lit16 v14, v11, 0xc00

    move-object/from16 v11, p6

    invoke-static/range {v9 .. v14}, Lfo2/c;->n(ZLjava/lang/Object;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v13, v15}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_13
    const v10, -0x1f9f3dc3

    invoke-virtual {v13, v10}, Lp1/q;->e0(I)V

    new-instance v10, Leo2/c$g;

    add-int/lit8 v11, v1, -0x1

    sget-object v12, Leo2/i;->DECREMENT:Leo2/i;

    invoke-direct {v10, v5, v11, v12, v6}, Leo2/c$g;-><init>(Ljava/lang/String;ILeo2/i;Ljava/lang/String;)V

    sget-object v11, Lfo2/e;->a:Lfo2/e;

    invoke-virtual {v11}, Lfo2/e;->d()Lc93/m;

    move-result-object v12

    shr-int/lit8 v11, v0, 0xc

    and-int/lit16 v11, v11, 0x380

    or-int/lit16 v14, v11, 0xc00

    move-object/from16 v11, p6

    invoke-static/range {v9 .. v14}, Lfo2/c;->n(ZLjava/lang/Object;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v13, v15}, Lp1/q;->q(Z)V

    :goto_b
    new-instance v9, Lf01/c0;

    const/16 v10, 0x9

    const/4 v11, 0x0

    invoke-direct {v9, v11, v1, v10}, Lf01/c0;-><init>(BII)V

    const v10, -0x30ae01d6

    invoke-static {v10, v13, v9}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const/4 v10, 0x0

    const/16 v11, 0x30

    invoke-static {v10, v9, v13, v11, v7}, Lfo2/c;->q(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    if-nez v4, :cond_14

    if-ge v1, v3, :cond_14

    move v9, v7

    goto :goto_c

    :cond_14
    move v9, v15

    :goto_c
    new-instance v10, Leo2/c$g;

    add-int/lit8 v11, v1, 0x1

    sget-object v12, Leo2/i;->INCREMENT:Leo2/i;

    invoke-direct {v10, v5, v11, v12, v6}, Leo2/c$g;-><init>(Ljava/lang/String;ILeo2/i;Ljava/lang/String;)V

    sget-object v11, Lfo2/e;->a:Lfo2/e;

    invoke-virtual {v11}, Lfo2/e;->e()Lc93/m;

    move-result-object v12

    shr-int/lit8 v0, v0, 0xc

    and-int/lit16 v0, v0, 0x380

    or-int/lit16 v14, v0, 0xc00

    move-object/from16 v11, p6

    invoke-static/range {v9 .. v14}, Lfo2/c;->n(ZLjava/lang/Object;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v13, v7}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_15
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_16

    new-instance v0, La31/d;

    move-object/from16 v7, p6

    invoke-direct/range {v0 .. v8}, La31/d;-><init>(IIIZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 28

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static/range {p0 .. p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v1, v2, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->r()Lb91/a;

    move-result-object v22

    invoke-virtual {v1, v2, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v4

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v26, v1, 0x12

    const v27, 0x2fffa

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, v2

    move-object v2, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v24, v2

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m(IIIZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v9

    move v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p8

    invoke-static/range {v1 .. v9}, Lfo2/c;->k(IIIZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(ZLjava/lang/Object;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object v6, p3

    move/from16 v7, p5

    move-object v8, p4

    check-cast v8, Lp1/q;

    const v0, -0x7106388e

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v8, p0}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    and-int/lit8 v2, v7, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v8, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit16 v2, v7, 0x180

    const/16 v3, 0x100

    if-nez v2, :cond_5

    invoke-virtual {v8, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v3

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v0, v2

    :cond_5
    and-int/lit16 v2, v7, 0xc00

    if-nez v2, :cond_7

    invoke-virtual {v8, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v0, v2

    :cond_7
    move v9, v0

    and-int/lit16 v0, v9, 0x493

    const/16 v2, 0x492

    const/4 v10, 0x0

    const/4 v4, 0x1

    if-eq v0, v2, :cond_8

    move v0, v4

    goto :goto_5

    :cond_8
    move v0, v10

    :goto_5
    and-int/lit8 v2, v9, 0x1

    invoke-virtual {v8, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_d

    if-eqz p0, :cond_9

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_6

    :cond_9
    const v0, 0x3ecccccd    # 0.4f

    :goto_6
    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v2}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    and-int/lit16 v2, v9, 0x380

    if-ne v2, v3, :cond_a

    goto :goto_7

    :cond_a
    move v4, v10

    :goto_7
    invoke-virtual {v8, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_b

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_c

    :cond_b
    new-instance v3, Ld01/d;

    const/4 v2, 0x3

    invoke-direct {v3, p2, p1, v2}, Ld01/d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v4, v3

    check-cast v4, Lc93/a;

    const/16 v5, 0xe

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v1, p0

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    shr-int/lit8 v1, v9, 0x6

    and-int/lit8 v1, v1, 0x70

    invoke-static {v0, p3, v8, v1, v10}, Lfo2/c;->q(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_8

    :cond_d
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_e

    new-instance v0, Lar2/a;

    move v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, v6

    move v5, v7

    invoke-direct/range {v0 .. v5}, Lar2/a;-><init>(ZLjava/lang/Object;Lkotlin/jvm/functions/Function1;Lc93/m;I)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(ZLjava/lang/Object;Lkotlin/jvm/functions/Function1;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lfo2/c;->n(ZLjava/lang/Object;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object v0, p2

    check-cast v0, Lp1/q;

    const v1, 0x209c8a8a

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x1

    const/4 v3, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v4, p3, 0x6

    move v5, v4

    goto :goto_1

    :cond_0
    and-int/lit8 v4, p3, 0x6

    if-nez v4, :cond_2

    invoke-virtual {v0, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v3

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, p3

    goto :goto_1

    :cond_2
    move v5, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v0, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit8 v6, v5, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_5

    move v6, v9

    goto :goto_3

    :cond_5
    move v6, v8

    :goto_3
    and-int/lit8 v7, v5, 0x1

    invoke-virtual {v0, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_a

    sget-object v6, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_6

    move-object v4, v6

    goto :goto_4

    :cond_6
    move-object v4, p0

    :goto_4
    const/16 v1, 0xa

    int-to-float v1, v1

    int-to-float v3, v3

    mul-float/2addr v1, v3

    invoke-static {v1, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    int-to-float v6, v9

    invoke-static {v1, v6, v3}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v3, v0, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v6

    sget-object v3, Li2/w0;->a:Li2/v0;

    invoke-static {v1, v6, v7, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface {v1, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->E:Lb2/m;

    invoke-static {v3, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v6, v0, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-eqz v10, :cond_7

    invoke-virtual {v0, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_5
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v0, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v0, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-nez v7, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    :cond_8
    invoke-static {v6, v0, v6, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v0, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v1, v5, 0x3

    and-int/lit8 v1, v1, 0xe

    invoke-static {v1, p1, v0, v9}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    move-object v1, v4

    goto :goto_6

    :cond_a
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v1, p0

    :goto_6
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_b

    new-instance v0, Lfo2/b;

    const/4 v5, 0x0

    move-object v2, p1

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lfo2/b;-><init>(Landroidx/compose/ui/Modifier;Lc93/m;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final r(Landroidx/compose/ui/Modifier;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lfo2/c;->q(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
