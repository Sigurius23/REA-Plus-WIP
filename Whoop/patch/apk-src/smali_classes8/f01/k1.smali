.class public abstract Lf01/k1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\"\u0017\u0010\u0010\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lf01/l1;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Landroidx/compose/ui/Modifier;Lf01/l1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "k",
        "(Landroidx/compose/runtime/Composer;I)V",
        "a",
        "Lf01/l1;",
        "m",
        "()Lf01/l1;",
        "mciHealthTabCard",
        "design_release"
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
.field private static final a:Lf01/l1;


# direct methods
.method static constructor <clinit>()V
    .locals 52

    sget-object v2, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    new-instance v3, Lf01/f1;

    sget-object v7, Lgz0/m0;->TINY_ELLIPSE:Lgz0/m0;

    sget-object v9, Ly81/f;->SURFACE_MCI_LUTEAL:Ly81/f;

    const/4 v10, 0x2

    const/4 v11, 0x0

    const-string v4, "LATE LUTEAL"

    const/4 v5, 0x0

    const-string v6, "Day 23"

    const-string v8, "Overdue"

    invoke-direct/range {v3 .. v11}, Lf01/f1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lf01/g1;

    sget-object v0, Lgz0/m0;->MENSTRUAL_CYCLE:Lgz0/m0;

    const-string v1, "Make sure to enter your period"

    invoke-direct {v5, v0, v1}, Lf01/g1;-><init>(Lgz0/m0;Ljava/lang/String;)V

    new-instance v7, Lcom/whoop/navigation/e;

    const/4 v14, 0x7

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v10, v7

    invoke-direct/range {v10 .. v15}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v0, "22"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    sget-object v14, Ly81/f;->BRAND_WHITE:Ly81/f;

    new-instance v10, Lf11/g;

    const v0, 0x3f19999a    # 0.6f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v17

    const/16 v18, 0x14

    const/16 v19, 0x0

    const/16 v11, 0x15

    const/16 v16, 0x1

    invoke-direct/range {v10 .. v19}, Lf11/g;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;ZLjava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v10}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v20

    new-instance v21, Lf11/h;

    sget-object v23, Ly81/f;->SURFACE_MCI_MENSTRUAL:Ly81/f;

    const/16 v25, 0x6

    const/16 v26, 0x0

    move-object/from16 v22, v23

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v21 .. v26}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v23, v22

    new-instance v22, Lf11/h;

    const/16 v26, 0x6

    const/16 v27, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v22 .. v27}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v22

    new-instance v22, Lf11/h;

    invoke-direct/range {v22 .. v27}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v22

    new-instance v22, Lf11/h;

    invoke-direct/range {v22 .. v27}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lf11/h;

    const/4 v12, 0x6

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v25, v8

    new-instance v8, Lf11/h;

    invoke-direct/range {v8 .. v13}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v26, v8

    new-instance v8, Lf11/h;

    invoke-direct/range {v8 .. v13}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v27, v8

    new-instance v8, Lf11/h;

    invoke-direct/range {v8 .. v13}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v28, v8

    new-instance v8, Lf11/h;

    invoke-direct/range {v8 .. v13}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v29, v8

    new-instance v8, Lf11/h;

    invoke-direct/range {v8 .. v13}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v30, v8

    new-instance v8, Lf11/h;

    invoke-direct/range {v8 .. v13}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v32, Lf11/h;

    sget-object v34, Ly81/f;->SURFACE_MCI_OVULATORY:Ly81/f;

    const/16 v35, 0x6

    const/16 v36, 0x0

    const/16 v33, 0x0

    move-object/from16 v31, v32

    move-object/from16 v32, v34

    const/16 v34, 0x0

    invoke-direct/range {v31 .. v36}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v33, Lf11/h;

    const/16 v37, 0x6

    const/16 v38, 0x0

    const/16 v35, 0x0

    move-object/from16 v34, v32

    invoke-direct/range {v33 .. v38}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v34, Lf11/h;

    sget-object v36, Ly81/f;->SURFACE_MCI_FOLLICULAR:Ly81/f;

    const/16 v38, 0x6

    const/16 v39, 0x0

    move-object/from16 v35, v36

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v34 .. v39}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v36, v35

    new-instance v35, Lf11/h;

    const/16 v39, 0x6

    const/16 v40, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v35 .. v40}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v35

    new-instance v35, Lf11/h;

    invoke-direct/range {v35 .. v40}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v35

    new-instance v35, Lf11/h;

    invoke-direct/range {v35 .. v40}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v9, v35

    new-instance v35, Lf11/h;

    invoke-direct/range {v35 .. v40}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v10, v35

    new-instance v35, Lf11/h;

    invoke-direct/range {v35 .. v40}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v11, v35

    new-instance v35, Lf11/h;

    invoke-direct/range {v35 .. v40}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v12, v35

    new-instance v35, Lf11/h;

    invoke-direct/range {v35 .. v40}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v42, Lf11/h;

    const/16 v17, 0x6

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v13, v42

    invoke-direct/range {v13 .. v18}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v43, Lf11/h;

    sget-object v14, Ly81/f;->WHITE_10:Ly81/f;

    move-object/from16 v13, v43

    invoke-direct/range {v13 .. v18}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v44, Lf11/h;

    move-object/from16 v13, v44

    invoke-direct/range {v13 .. v18}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lf11/h;

    invoke-direct/range {v13 .. v18}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v45, v13

    new-instance v13, Lf11/h;

    invoke-direct/range {v13 .. v18}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v46, v13

    new-instance v13, Lf11/h;

    invoke-direct/range {v13 .. v18}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v47, v13

    new-instance v48, Lf11/h;

    move-object/from16 v13, v48

    invoke-direct/range {v13 .. v18}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v49, Lf11/h;

    move-object/from16 v13, v49

    invoke-direct/range {v13 .. v18}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v50, Lf11/h;

    move-object/from16 v13, v50

    invoke-direct/range {v13 .. v18}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v51, Lf11/h;

    move-object/from16 v13, v51

    invoke-direct/range {v13 .. v18}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v23, v1

    move-object/from16 v36, v6

    move-object/from16 v37, v9

    move-object/from16 v38, v10

    move-object/from16 v39, v11

    move-object/from16 v40, v12

    move-object/from16 v24, v22

    move-object/from16 v32, v31

    move-object/from16 v41, v35

    move-object/from16 v22, v0

    move-object/from16 v35, v4

    move-object/from16 v31, v8

    filled-new-array/range {v21 .. v51}, [Lf11/h;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    new-instance v4, Lf11/e;

    const/16 v28, 0xac2

    const/16 v29, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/high16 v24, 0x41400000    # 12.0f

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object v15, v4

    invoke-direct/range {v15 .. v29}, Lf11/e;-><init>(Lf11/b;ZZLjava/util/List;Ljava/util/List;ZZFFZLf11/f;Lf11/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lf01/l1;

    const-string v1, "MENSTRUAL CYCLE INSIGHTS"

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v7}, Lf01/l1;-><init>(Ljava/lang/String;Lgz0/m0;Lf01/f1;Lf11/e;Lf01/g1;Lny0/h;Lcom/whoop/navigation/e;)V

    sput-object v0, Lf01/k1;->a:Lf01/l1;

    return-void
.end method

.method public static synthetic a(Lf01/l1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lf01/k1;->h(Lf01/l1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lf01/l1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lf01/k1;->i(Lf01/l1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lf01/l1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lf01/k1;->j(Landroidx/compose/ui/Modifier;Lf01/l1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lf01/k1;->l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lf01/l1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lf01/k1;->g(Lf01/l1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lf01/l1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lf01/l1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move/from16 v1, p4

    const-string v0, "state"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, 0x629ceae9

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v2, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v3, v1, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v1, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v2

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v1

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v1

    :goto_1
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_4
    and-int/lit16 v7, v1, 0x180

    const/16 v8, 0x100

    if-nez v7, :cond_6

    invoke-virtual {v14, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    move v7, v8

    goto :goto_3

    :cond_5
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v4, v7

    :cond_6
    and-int/lit16 v7, v4, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v7, v9, :cond_7

    move v7, v11

    goto :goto_4

    :cond_7
    move v7, v10

    :goto_4
    and-int/lit8 v9, v4, 0x1

    invoke-virtual {v14, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_c

    if-eqz v0, :cond_8

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_8
    move-object v0, v3

    :goto_5
    const/4 v3, 0x3

    int-to-float v7, v3

    int-to-float v2, v2

    mul-float/2addr v7, v2

    invoke-static {v7}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    const/16 v12, 0x24

    int-to-float v12, v12

    mul-float/2addr v12, v2

    const/4 v13, 0x0

    invoke-static {v0, v13, v12, v11}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-static {v7}, Lt0/j;->e(F)Lt0/i;

    move-result-object v7

    invoke-static {v12, v7}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    and-int/lit16 v4, v4, 0x380

    if-ne v4, v8, :cond_9

    goto :goto_6

    :cond_9
    move v11, v10

    :goto_6
    or-int v4, v12, v11

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_a

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v8, v4, :cond_b

    :cond_a
    new-instance v8, Lf01/j1;

    const/4 v4, 0x0

    invoke-direct {v8, v5, v6, v4}, Lf01/j1;-><init>(Lf01/l1;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v14, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v8, Lc93/a;

    const/4 v4, 0x0

    invoke-static {v7, v10, v4, v8, v3}, Landroidx/room/c1;->i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v3, v14, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v3

    int-to-float v8, v10

    mul-float v12, v8, v2

    new-instance v2, Lf01/f;

    const/4 v8, 0x5

    invoke-direct {v2, v8, v5, v6}, Lf01/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v8, -0x15178ef4

    invoke-static {v8, v14, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/high16 v15, 0x1b0000

    const/16 v16, 0x18

    const/4 v11, 0x0

    move-object v8, v9

    move-wide v9, v3

    invoke-static/range {v7 .. v16}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v0

    goto :goto_7

    :cond_c
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v4, v3

    :goto_7
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v0, Le11/b;

    const/16 v3, 0x1c

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Le11/b;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final g(Lf01/l1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lf01/l1;->g()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lf01/l1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 49

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    and-int/lit8 v1, p3, 0x3

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    move v1, v6

    goto :goto_0

    :cond_0
    move v1, v7

    :goto_0
    and-int/lit8 v4, p3, 0x1

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v4, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_21

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v8, v2

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float v10, v8, v9

    invoke-static {v10, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v12, v13, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v13, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v6, v13, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {v13, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v13, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v13, v11, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    invoke-static {v14, v13, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v13, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v14, Ll0/m;->g:Ll0/h;

    move-object/from16 p3, v12

    const/16 v12, 0x36

    move/from16 v16, v8

    invoke-static {v14, v5, v13, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    move/from16 v17, v9

    move/from16 v18, v10

    iget-wide v9, v13, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v13, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_4

    invoke-virtual {v13, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v13, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v11, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-nez v8, :cond_5

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    :cond_5
    invoke-static {v9, v13, v9, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v13, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lf01/l1;->i()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v7, v13, v8}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lx81/d;->a:Lx81/d;

    const/4 v9, 0x6

    invoke-virtual {v8, v13, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->L()Lb91/a;

    move-result-object v28

    invoke-virtual {v8, v13, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v20

    move-object v12, v7

    move-object/from16 v22, v8

    const/high16 v10, 0x3f800000    # 1.0f

    float-to-double v7, v10

    const-wide/16 v34, 0x0

    cmpl-double v7, v7, v34

    const-string v36, "invalid weight; must be greater than zero"

    if-lez v7, :cond_7

    :goto_3
    move v7, v9

    goto :goto_4

    :cond_7
    invoke-static/range {v36 .. v36}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_3

    :goto_4
    new-instance v9, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v37, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v8, v10, v37

    if-lez v8, :cond_8

    move/from16 v8, v37

    :goto_5
    const/4 v10, 0x1

    goto :goto_6

    :cond_8
    const/high16 v8, 0x3f800000    # 1.0f

    goto :goto_5

    :goto_6
    invoke-direct {v9, v8, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v32, 0x0

    const v33, 0x2fff8

    move-object v8, v12

    move-object/from16 v30, v13

    const-wide/16 v12, 0x0

    move-object v10, v14

    const/4 v14, 0x0

    move-object/from16 v23, v15

    const/4 v15, 0x0

    move/from16 v24, v16

    const/16 v16, 0x0

    move/from16 v25, v17

    move/from16 v26, v18

    const-wide/16 v17, 0x0

    const/16 v27, 0x36

    const/16 v19, 0x0

    move-object/from16 v29, v10

    move-wide/from16 v47, v20

    move-object/from16 v21, v11

    move-wide/from16 v10, v47

    const/16 v20, 0x0

    move-object/from16 v31, v21

    move-object/from16 v38, v22

    const-wide/16 v21, 0x0

    move-object/from16 v39, v23

    const/16 v23, 0x0

    move/from16 v40, v24

    const/16 v24, 0x0

    move/from16 v41, v25

    const/16 v25, 0x0

    move/from16 v42, v26

    const/16 v26, 0x0

    move/from16 v43, v27

    const/16 v27, 0x0

    move-object/from16 v44, v29

    const/16 v29, 0x0

    move-object/from16 v45, v31

    const/16 v31, 0x0

    move/from16 v7, v43

    move-object/from16 v43, v38

    move-object/from16 v38, v1

    move-object/from16 v1, v44

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    sget-object v15, Lny0/q$c;->f:Lny0/q$c;

    invoke-static/range {v43 .. v43}, Ldc/b;->D(Lx81/d;)I

    move-result v16

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v8, v9, :cond_9

    sget-object v8, Lf01/k1$a;->w:Lf01/k1$a;

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v8}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v17

    new-instance v14, Lny0/o;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/high16 v23, 0x3f000000    # 0.5f

    const/16 v24, 0x0

    const/16 v25, 0x2f8

    const/16 v26, 0x0

    invoke-direct/range {v14 .. v26}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v8, v10

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_a

    if-ne v10, v9, :cond_b

    :cond_a
    new-instance v10, Lf01/j1;

    const/4 v8, 0x1

    invoke-direct {v10, v0, v3, v8}, Lf01/j1;-><init>(Lf01/l1;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v12, v10

    check-cast v12, Lc93/a;

    move-object v8, v14

    const/16 v14, 0x30

    const/16 v15, 0xc

    const-string v9, ""

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v15}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v10, 0x1

    invoke-virtual {v13, v10}, Lp1/q;->q(Z)V

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v9, 0x14

    int-to-float v9, v9

    const/4 v10, 0x4

    int-to-float v10, v10

    mul-float/2addr v9, v10

    const/4 v11, 0x0

    const/4 v12, 0x2

    invoke-static {v8, v9, v11, v12}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/16 v18, 0x0

    const/16 v19, 0xd

    const/4 v15, 0x0

    const/16 v17, 0x0

    move/from16 v16, v42

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v1, v5, v13, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v13, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-eqz v9, :cond_c

    invoke-virtual {v13, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_c
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v13, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v45

    invoke-static {v13, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-nez v7, :cond_d

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_e

    :cond_d
    move-object/from16 v7, v39

    goto :goto_9

    :cond_e
    move-object/from16 v7, v39

    :goto_8
    move-object/from16 v5, v38

    goto :goto_a

    :goto_9
    invoke-static {v5, v13, v5, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_8

    :goto_a
    invoke-static {v13, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v8, 0x1c

    int-to-float v8, v8

    mul-float/2addr v8, v10

    const/4 v12, 0x2

    invoke-static {v4, v8, v11, v12}, Landroidx/compose/foundation/layout/d;->v(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/high16 v9, 0x3f800000    # 1.0f

    float-to-double v11, v9

    cmpl-double v11, v11, v34

    if-lez v11, :cond_f

    goto :goto_b

    :cond_f
    invoke-static/range {v36 .. v36}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_b
    new-instance v11, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v12, v9, v37

    if-lez v12, :cond_10

    move/from16 v9, v37

    :goto_c
    const/4 v12, 0x1

    goto :goto_d

    :cond_10
    const/high16 v9, 0x3f800000    # 1.0f

    goto :goto_c

    :goto_d
    invoke-direct {v11, v9, v12}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v8, v11}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v9, v12

    move-object/from16 v11, p3

    const/4 v12, 0x6

    invoke-static {v9, v10, v11, v13, v12}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v11

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v13, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_11

    invoke-virtual {v13, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_11
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v13, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v1, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-nez v11, :cond_12

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_13

    :cond_12
    invoke-static {v14, v13, v14, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v13, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lf01/l1;->c()Lf01/f1;

    move-result-object v8

    invoke-virtual {v8}, Lf01/f1;->h()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_14

    const v8, -0x62529d7e

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    const/4 v11, 0x0

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    move/from16 v38, v9

    move/from16 p3, v10

    move v8, v11

    move-object/from16 v3, v43

    const/4 v0, 0x6

    goto/16 :goto_f

    :cond_14
    const/4 v11, 0x0

    const v12, -0x62529d7d

    invoke-virtual {v13, v12}, Lp1/q;->e0(I)V

    move-object/from16 v12, v43

    const/4 v14, 0x6

    invoke-virtual {v12, v13, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->s()Lb91/a;

    move-result-object v28

    invoke-virtual {v0}, Lf01/l1;->c()Lf01/f1;

    move-result-object v15

    invoke-virtual {v15}, Lf01/f1;->c()Ly81/f;

    move-result-object v15

    invoke-virtual {v15, v13, v11}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v15

    const/16 v32, 0x0

    const v33, 0x2fffa

    move v11, v9

    const/4 v9, 0x0

    move-object/from16 v30, v13

    const-wide/16 v12, 0x0

    move/from16 v46, v14

    const/4 v14, 0x0

    move/from16 v17, v11

    move-wide/from16 v47, v15

    move/from16 v16, v10

    move-wide/from16 v10, v47

    const/4 v15, 0x0

    move/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v20, v17

    move/from16 v19, v18

    const-wide/16 v17, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    move/from16 v24, v22

    const-wide/16 v21, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v27, v25

    const/16 v25, 0x0

    move/from16 v29, v26

    const/16 v26, 0x0

    move/from16 v31, v27

    const/16 v27, 0x0

    move/from16 v34, v29

    const/16 v29, 0x0

    move/from16 v35, v31

    const/16 v31, 0x0

    move/from16 v38, v34

    move/from16 p3, v35

    move-object/from16 v3, v43

    move/from16 v0, v46

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    const/4 v8, 0x0

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual/range {p0 .. p0}, Lf01/l1;->c()Lf01/f1;

    move-result-object v9

    invoke-virtual {v9}, Lf01/f1;->g()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_15

    const v9, -0x624de68d

    invoke-virtual {v13, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_15
    const v8, -0x624de68c

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v13, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->s()Lb91/a;

    move-result-object v28

    invoke-virtual {v3, v13, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->b1()J

    move-result-wide v10

    const/16 v32, 0x0

    const v33, 0x2fffa

    move-object v8, v9

    const/4 v9, 0x0

    move-object/from16 v30, v13

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    const/4 v8, 0x0

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual/range {p0 .. p0}, Lf01/l1;->c()Lf01/f1;

    move-result-object v9

    invoke-virtual {v9}, Lf01/f1;->e()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_16

    const v9, -0x62496b30

    invoke-virtual {v13, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_16
    const v8, -0x62496b2f

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v13, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->Q()Lb91/a;

    move-result-object v28

    invoke-virtual {v3, v13, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v10

    const/16 v32, 0x0

    const v33, 0x2fffa

    move-object v8, v9

    const/4 v9, 0x0

    move-object/from16 v30, v13

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    const/4 v8, 0x0

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual/range {p0 .. p0}, Lf01/l1;->c()Lf01/f1;

    move-result-object v9

    invoke-virtual {v9}, Lf01/f1;->f()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_17

    const v9, -0x6244ca87

    invoke-virtual {v13, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    :goto_12
    const/4 v10, 0x1

    goto/16 :goto_13

    :cond_17
    const v8, -0x6244ca86

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v3, v13, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->X()J

    move-result-wide v11

    invoke-virtual/range {p0 .. p0}, Lf01/l1;->c()Lf01/f1;

    move-result-object v9

    invoke-virtual {v9}, Lf01/f1;->d()Lgz0/m0;

    move-result-object v9

    const/4 v14, 0x0

    if-eqz v9, :cond_18

    invoke-virtual {v9}, Lgz0/m0;->toWhoopIcon()I

    move-result v9

    new-instance v15, Ly71/g;

    const/4 v10, 0x2

    invoke-direct {v15, v9, v14, v10, v14}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v15

    :cond_18
    mul-float v18, v40, p3

    invoke-virtual {v3, v13, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->X()J

    move-result-wide v9

    const v15, 0x3e19999a    # 0.15f

    invoke-static {v15, v9, v10}, Li2/x;->c(FJ)J

    move-result-wide v9

    const/16 v36, 0x0

    const v37, 0x7ffeb4

    move-object/from16 v30, v13

    move-wide v12, v11

    const/4 v11, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    move/from16 v27, v26

    const/16 v26, 0x0

    move/from16 v28, v27

    const/16 v27, 0x0

    move/from16 v29, v28

    const/16 v28, 0x0

    move/from16 v31, v29

    const/16 v29, 0x0

    move-object/from16 v33, v30

    const/16 v30, 0x0

    move/from16 v32, v31

    const/16 v31, 0x0

    move/from16 v34, v32

    const/16 v32, 0x0

    move/from16 v35, v34

    const/high16 v34, 0x6000000

    move/from16 v39, v35

    const/16 v35, 0x0

    invoke-static/range {v8 .. v37}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v13, v33

    const/4 v8, 0x0

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    goto/16 :goto_12

    :goto_13
    invoke-virtual {v13, v10}, Lp1/q;->q(Z)V

    const/16 v8, 0x38

    int-to-float v8, v8

    mul-float v8, v8, p3

    invoke-static {v8, v4}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/16 v8, 0xa

    int-to-float v8, v8

    mul-float v15, v8, p3

    const/16 v18, 0x0

    const/16 v19, 0xe

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Lb2/e;->w:Lb2/m;

    const/4 v11, 0x0

    invoke-static {v9, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v10, v13, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v13, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_19

    invoke-virtual {v13, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_19
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_14
    invoke-static {v13, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v1, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_1a

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1b

    :cond_1a
    invoke-static {v10, v13, v10, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v13, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lf01/l1;->h()Lf11/e;

    move-result-object v8

    const/4 v11, 0x0

    const/4 v12, 0x2

    invoke-static {v8, v11, v13, v11, v12}, Lf11/d;->h(Lf11/e;ZLandroidx/compose/runtime/Composer;II)V

    const/4 v10, 0x1

    invoke-virtual {v13, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v10}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lf01/l1;->e()Lf01/g1;

    move-result-object v20

    if-nez v20, :cond_1c

    const v0, -0xc2f3b4e

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    move-object v2, v4

    move v8, v11

    goto/16 :goto_16

    :cond_1c
    const v8, -0xc2f3b4d

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    mul-float v10, p3, p3

    invoke-static {v10, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v13, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move/from16 v11, p3

    move/from16 v9, v40

    invoke-static {v8, v9, v11}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v3, v13, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->X()J

    move-result-wide v11

    const v15, 0x3e19999a    # 0.15f

    invoke-static {v15, v11, v12}, Li2/x;->c(FJ)J

    move-result-wide v11

    sget-object v9, Li2/w0;->a:Li2/v0;

    invoke-static {v8, v11, v12, v9}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const-wide/high16 v11, 0x3ff8000000000000L    # 1.5

    double-to-float v9, v11

    mul-float v9, v9, v41

    mul-float v15, v38, v41

    invoke-static {v8, v15, v9}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Ll0/m;->a:Ll0/e;

    sget-object v11, Lb2/e;->J:Lb2/l;

    const/4 v12, 0x0

    invoke-static {v9, v11, v13, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v13, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v14, v13, Lp1/q;->S:Z

    if-eqz v14, :cond_1d

    invoke-virtual {v13, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_1d
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v13, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-nez v1, :cond_1e

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    :cond_1e
    invoke-static {v11, v13, v11, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    invoke-static {v13, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v18, 0x0

    const/16 v19, 0xa

    const/16 v16, 0x0

    move/from16 v17, v15

    move-object v14, v4

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object v2, v14

    invoke-static {v10, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual/range {v20 .. v20}, Lf01/g1;->a()Lgz0/m0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    invoke-static {v1, v13, v0}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v8

    invoke-virtual {v3, v13, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->X()J

    move-result-wide v11

    const/16 v14, 0x1b0

    const/4 v15, 0x0

    const-string v9, ""

    invoke-static/range {v8 .. v15}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {v20 .. v20}, Lf01/g1;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v8, 0x0

    invoke-static {v1, v13, v8}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v13, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->b()Lb91/a;

    move-result-object v28

    invoke-virtual {v3, v13, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X()J

    move-result-wide v10

    const/16 v32, 0x0

    const v33, 0x2fffa

    const/4 v9, 0x0

    move-object/from16 v30, v13

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    move-object v8, v1

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    const/4 v10, 0x1

    invoke-virtual {v13, v10}, Lp1/q;->q(Z)V

    const/4 v8, 0x0

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    :goto_16
    invoke-virtual/range {p0 .. p0}, Lf01/l1;->f()Lny0/h;

    move-result-object v0

    if-nez v0, :cond_20

    const v0, -0xc1e7dcc

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    :goto_17
    const/4 v10, 0x1

    goto :goto_18

    :cond_20
    const v1, -0xc1e7dcb

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    move/from16 v1, v42

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v13, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object v1, v0

    new-instance v0, Lny0/d;

    invoke-direct {v0}, Lny0/d;-><init>()V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v5, 0x6

    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    move-object/from16 v3, p1

    move-object v4, v13

    invoke-virtual/range {v0 .. v5}, Lny0/d;->e(Landroidx/compose/ui/Modifier;Lny0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    goto :goto_17

    :goto_18
    invoke-virtual {v13, v10}, Lp1/q;->q(Z)V

    goto :goto_19

    :cond_21
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_19
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lf01/l1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lf01/l1;->g()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;Lf01/l1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lf01/k1;->f(Landroidx/compose/ui/Modifier;Lf01/l1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0xd84ab9d

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lf01/k1$b;

    invoke-direct {v1}, Lf01/k1$b;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lf01/c0;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-direct {v0, v2, p1, v1}, Lf01/c0;-><init>(BII)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lf01/k1;->k(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final m()Lf01/l1;
    .locals 1

    sget-object v0, Lf01/k1;->a:Lf01/l1;

    return-object v0
.end method
