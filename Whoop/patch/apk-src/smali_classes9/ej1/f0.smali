.class public abstract Lej1/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u0017\u0010\u000e\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcj1/v;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Lcj1/v;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "a",
        "Lcj1/v;",
        "getMciHealthTabCard",
        "()Lcj1/v;",
        "mciHealthTabCard",
        "health_release"
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
.field private static final a:Lcj1/v;


# direct methods
.method static constructor <clinit>()V
    .locals 54

    const-string v0, "MENSTRUAL CYCLE INSIGHTS"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget-object v3, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    new-instance v4, Lcj1/t;

    const-string v0, "LATE LUTEAL"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-string v0, "Day 23"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget-object v8, Lgz0/m0;->TINY_ELLIPSE:Lgz0/m0;

    const-string v0, "Overdue"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget-object v11, Ly81/f;->SURFACE_MCI_LUTEAL:Ly81/f;

    move-object v10, v11

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v4 .. v12}, Lcj1/t;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/util/TextResource;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v11, v10

    new-instance v6, Lcj1/u;

    sget-object v0, Lgz0/m0;->MENSTRUAL_CYCLE:Lgz0/m0;

    const-string v1, "Make sure to enter your period"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-direct {v6, v0, v1}, Lcj1/u;-><init>(Lgz0/m0;Lcom/whoop/design/util/TextResource;)V

    new-instance v8, Lcom/whoop/navigation/e;

    const/16 v16, 0x7

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v12, v8

    invoke-direct/range {v12 .. v17}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v0, "22"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    sget-object v16, Ly81/f;->BRAND_WHITE:Ly81/f;

    new-instance v12, Lf11/g;

    const v0, 0x3f19999a    # 0.6f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v19

    const/16 v20, 0x14

    const/16 v21, 0x0

    const/16 v13, 0x15

    const/16 v18, 0x1

    invoke-direct/range {v12 .. v21}, Lf11/g;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;ZLjava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v12}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v22

    new-instance v23, Lf11/h;

    sget-object v25, Ly81/f;->SURFACE_MCI_MENSTRUAL:Ly81/f;

    const/16 v27, 0x6

    const/16 v28, 0x0

    move-object/from16 v24, v25

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v23 .. v28}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v25, v24

    new-instance v24, Lf11/h;

    const/16 v28, 0x6

    const/16 v29, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v24 .. v29}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v24

    new-instance v24, Lf11/h;

    invoke-direct/range {v24 .. v29}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v24

    new-instance v24, Lf11/h;

    invoke-direct/range {v24 .. v29}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lf11/h;

    const/4 v14, 0x6

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v27, v10

    new-instance v10, Lf11/h;

    invoke-direct/range {v10 .. v15}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v28, v10

    new-instance v10, Lf11/h;

    invoke-direct/range {v10 .. v15}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v29, v10

    new-instance v10, Lf11/h;

    invoke-direct/range {v10 .. v15}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v30, v10

    new-instance v10, Lf11/h;

    invoke-direct/range {v10 .. v15}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v31, v10

    new-instance v32, Lf11/h;

    move-object/from16 v10, v32

    invoke-direct/range {v10 .. v15}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v33, Lf11/h;

    move-object/from16 v10, v33

    invoke-direct/range {v10 .. v15}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v34, Lf11/h;

    sget-object v10, Ly81/f;->SURFACE_MCI_OVULATORY:Ly81/f;

    const/4 v13, 0x6

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v9, v34

    invoke-direct/range {v9 .. v14}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v35, Lf11/h;

    move-object/from16 v9, v35

    invoke-direct/range {v9 .. v14}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v36, Lf11/h;

    sget-object v10, Ly81/f;->SURFACE_MCI_FOLLICULAR:Ly81/f;

    move-object/from16 v9, v36

    invoke-direct/range {v9 .. v14}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v37, Lf11/h;

    move-object/from16 v9, v37

    invoke-direct/range {v9 .. v14}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v38, Lf11/h;

    move-object/from16 v9, v38

    invoke-direct/range {v9 .. v14}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v39, Lf11/h;

    move-object/from16 v9, v39

    invoke-direct/range {v9 .. v14}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v40, Lf11/h;

    move-object/from16 v9, v40

    invoke-direct/range {v9 .. v14}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lf11/h;

    invoke-direct/range {v9 .. v14}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v41, v9

    new-instance v9, Lf11/h;

    invoke-direct/range {v9 .. v14}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v42, v9

    new-instance v9, Lf11/h;

    invoke-direct/range {v9 .. v14}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v44, Lf11/h;

    const/16 v19, 0x6

    const/16 v20, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v15, v44

    invoke-direct/range {v15 .. v20}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lf11/h;

    sget-object v12, Ly81/f;->WHITE_10:Ly81/f;

    const/4 v14, 0x6

    const/4 v15, 0x0

    move-object v11, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v12, v11

    new-instance v11, Lf11/h;

    const/4 v15, 0x6

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v46, v11

    new-instance v11, Lf11/h;

    invoke-direct/range {v11 .. v16}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v47, v11

    new-instance v48, Lf11/h;

    move-object/from16 v11, v48

    invoke-direct/range {v11 .. v16}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v49, Lf11/h;

    move-object/from16 v11, v49

    invoke-direct/range {v11 .. v16}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v50, Lf11/h;

    move-object/from16 v11, v50

    invoke-direct/range {v11 .. v16}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v51, Lf11/h;

    move-object/from16 v11, v51

    invoke-direct/range {v11 .. v16}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v52, Lf11/h;

    move-object/from16 v11, v52

    invoke-direct/range {v11 .. v16}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v53, Lf11/h;

    move-object/from16 v11, v53

    invoke-direct/range {v11 .. v16}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v25, v1

    move-object/from16 v43, v9

    move-object/from16 v45, v10

    move-object/from16 v26, v24

    move-object/from16 v24, v0

    filled-new-array/range {v23 .. v53}, [Lf11/h;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v21

    new-instance v17, Lf11/e;

    const/16 v30, 0xac2

    const/16 v31, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/high16 v26, 0x41400000    # 12.0f

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v17 .. v31}, Lf11/e;-><init>(Lf11/b;ZZLjava/util/List;Ljava/util/List;ZZFFZLf11/f;Lf11/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcj1/v;

    const/16 v10, 0x80

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v5, v17

    invoke-direct/range {v1 .. v11}, Lcj1/v;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcj1/t;Lf11/e;Lcj1/u;Lny0/h;Lcom/whoop/navigation/e;Lhy0/c2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lej1/f0;->a:Lcj1/v;

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Lcj1/v;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lej1/f0;->i(Landroidx/compose/ui/Modifier;Lcj1/v;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcj1/v;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lej1/f0;->g(Lcj1/v;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcj1/v;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lej1/f0;->h(Lcj1/v;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcj1/v;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lej1/f0;->f(Lcj1/v;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lcj1/v;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcj1/v;",
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

    const v0, -0x4b5d229

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

    const/16 v8, 0x20

    if-nez v7, :cond_5

    and-int/lit8 v7, v1, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_4

    move v7, v8

    goto :goto_3

    :cond_4
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v4, v7

    :cond_5
    and-int/lit16 v7, v1, 0x180

    const/16 v9, 0x100

    if-nez v7, :cond_7

    invoke-virtual {v14, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    move v7, v9

    goto :goto_4

    :cond_6
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v4, v7

    :cond_7
    and-int/lit16 v7, v4, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v7, v10, :cond_8

    move v7, v12

    goto :goto_5

    :cond_8
    move v7, v11

    :goto_5
    and-int/lit8 v10, v4, 0x1

    invoke-virtual {v14, v10, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_f

    if-eqz v0, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_6

    :cond_9
    move-object v0, v3

    :goto_6
    const/4 v3, 0x3

    int-to-float v7, v3

    int-to-float v2, v2

    mul-float/2addr v7, v2

    invoke-static {v7}, Lt0/j;->e(F)Lt0/i;

    move-result-object v10

    const/16 v13, 0x24

    int-to-float v13, v13

    mul-float/2addr v13, v2

    const/4 v15, 0x0

    invoke-static {v0, v15, v13, v12}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-static {v7}, Lt0/j;->e(F)Lt0/i;

    move-result-object v7

    invoke-static {v13, v7}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    and-int/lit8 v13, v4, 0x70

    if-eq v13, v8, :cond_b

    and-int/lit8 v8, v4, 0x40

    if-eqz v8, :cond_a

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    goto :goto_7

    :cond_a
    move v8, v11

    goto :goto_8

    :cond_b
    :goto_7
    move v8, v12

    :goto_8
    and-int/lit16 v4, v4, 0x380

    if-ne v4, v9, :cond_c

    goto :goto_9

    :cond_c
    move v12, v11

    :goto_9
    or-int v4, v8, v12

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_d

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v8, v4, :cond_e

    :cond_d
    new-instance v8, Lej1/e0;

    const/4 v4, 0x0

    invoke-direct {v8, v5, v6, v4}, Lej1/e0;-><init>(Lcj1/v;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v14, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v8, Lc93/a;

    const/4 v4, 0x0

    invoke-static {v7, v11, v4, v8, v3}, Landroidx/room/c1;->i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v14, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v3

    int-to-float v8, v11

    mul-float v12, v8, v2

    new-instance v2, La0;

    const/16 v8, 0x1c

    invoke-direct {v2, v8, v5, v6}, La0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v8, 0x5e3459fa

    invoke-static {v8, v14, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/high16 v15, 0x1b0000

    const/16 v16, 0x18

    const/4 v11, 0x0

    move-object v8, v10

    move-wide v9, v3

    invoke-static/range {v7 .. v16}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v0

    goto :goto_a

    :cond_f
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v4, v3

    :goto_a
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_10

    new-instance v0, Le11/b;

    const/16 v3, 0xc

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Le11/b;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final f(Lcj1/v;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lcj1/v;->e()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcj1/v;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 51

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

    if-eqz v1, :cond_22

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

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v2, v13, Lp1/q;->S:Z

    if-eqz v2, :cond_1

    invoke-virtual {v13, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_1
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v13, v2, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v13, v11, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v6, v13, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    invoke-static {v14, v13, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v13, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

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

    invoke-static {v13, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_4

    invoke-virtual {v13, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v13, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

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
    invoke-static {v13, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcj1/v;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v6, v13, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v13, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->L()Lb91/a;

    move-result-object v28

    invoke-virtual {v9, v13, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v20

    move/from16 v22, v8

    move-object/from16 v23, v9

    const/high16 v12, 0x3f800000    # 1.0f

    float-to-double v8, v12

    const-wide/16 v34, 0x0

    cmpl-double v8, v8, v34

    const-string v36, "invalid weight; must be greater than zero"

    if-lez v8, :cond_7

    goto :goto_3

    :cond_7
    invoke-static/range {v36 .. v36}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_3
    new-instance v9, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v37, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v8, v12, v37

    if-lez v8, :cond_8

    move/from16 v8, v37

    :goto_4
    const/4 v12, 0x1

    goto :goto_5

    :cond_8
    const/high16 v8, 0x3f800000    # 1.0f

    goto :goto_4

    :goto_5
    invoke-direct {v9, v8, v12}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v32, v8, 0x12

    const v33, 0x2fff8

    move-object/from16 v30, v13

    const-wide/16 v12, 0x0

    move-object v8, v14

    const/4 v14, 0x0

    move-object/from16 v24, v15

    const/4 v15, 0x0

    move/from16 v25, v16

    const/16 v16, 0x0

    move/from16 v26, v17

    move/from16 v27, v18

    const-wide/16 v17, 0x0

    const/16 v29, 0x36

    const/16 v19, 0x0

    move/from16 v31, v10

    move-wide/from16 v49, v20

    move-object/from16 v21, v11

    move-wide/from16 v10, v49

    const/16 v20, 0x0

    move-object/from16 v38, v21

    move/from16 v39, v22

    const-wide/16 v21, 0x0

    move-object/from16 v40, v23

    const/16 v23, 0x0

    move-object/from16 v41, v24

    const/16 v24, 0x0

    move/from16 v42, v25

    const/16 v25, 0x0

    move/from16 v43, v26

    const/16 v26, 0x0

    move/from16 v44, v27

    const/16 v27, 0x0

    move/from16 v45, v29

    const/16 v29, 0x0

    move/from16 v46, v31

    const/16 v31, 0x0

    move/from16 v47, v39

    move/from16 v48, v46

    move-object/from16 v39, v38

    move-object/from16 v38, v1

    move-object v1, v8

    move-object v8, v6

    move/from16 v6, v45

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    sget-object v15, Lny0/q$c;->f:Lny0/q$c;

    invoke-static/range {v40 .. v40}, Ldc/b;->D(Lx81/d;)I

    move-result v16

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v8, v9, :cond_9

    sget-object v8, Lej1/f0$a;->w:Lej1/f0$a;

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
    new-instance v10, Lej1/e0;

    const/4 v8, 0x1

    invoke-direct {v10, v0, v3, v8}, Lej1/e0;-><init>(Lcj1/v;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v12, v10

    check-cast v12, Lc93/a;

    sget v8, Lny0/o;->k:I

    or-int/lit8 v8, v8, 0x30

    const/16 v15, 0xc

    const-string v9, ""

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v49, v14

    move v14, v8

    move-object/from16 v8, v49

    invoke-static/range {v8 .. v15}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v12, 0x1

    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

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

    move/from16 v16, v44

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v1, v5, v13, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v5, v13, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v13, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-eqz v9, :cond_c

    invoke-virtual {v13, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_c
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v13, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v39

    invoke-static {v13, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v13, Lp1/q;->S:Z

    if-nez v6, :cond_d

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_e

    :cond_d
    move-object/from16 v6, v41

    goto :goto_8

    :cond_e
    move-object/from16 v6, v41

    :goto_7
    move-object/from16 v5, v38

    goto :goto_9

    :goto_8
    invoke-static {v5, v13, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_7

    :goto_9
    invoke-static {v13, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v8, 0x1c

    int-to-float v8, v8

    mul-float/2addr v8, v10

    const/4 v12, 0x2

    invoke-static {v4, v8, v11, v12}, Landroidx/compose/foundation/layout/d;->v(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/high16 v12, 0x3f800000    # 1.0f

    float-to-double v14, v12

    cmpl-double v9, v14, v34

    if-lez v9, :cond_f

    goto :goto_a

    :cond_f
    invoke-static/range {v36 .. v36}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v9, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v11, v12, v37

    if-lez v11, :cond_10

    move/from16 v11, v37

    :goto_b
    const/4 v12, 0x1

    goto :goto_c

    :cond_10
    const/high16 v11, 0x3f800000    # 1.0f

    goto :goto_b

    :goto_c
    invoke-direct {v9, v11, v12}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v8, v9}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v9, v12

    const/4 v11, 0x6

    move-object/from16 v12, p3

    invoke-static {v9, v10, v12, v13, v11}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v12

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v13, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-eqz v11, :cond_11

    invoke-virtual {v13, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_11
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v13, v2, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

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
    invoke-static {v14, v13, v14, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v13, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcj1/v;->a()Lcj1/t;

    move-result-object v8

    invoke-virtual {v8}, Lcj1/t;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    if-nez v8, :cond_14

    const v8, 0x42a8fe86

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    const/4 v11, 0x0

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    move-object/from16 v38, v5

    move-object/from16 v41, v6

    move/from16 v39, v9

    move v6, v10

    move-object/from16 v0, v40

    move/from16 v3, v47

    move/from16 v5, v48

    goto/16 :goto_e

    :cond_14
    const/4 v11, 0x0

    const v12, 0x42a8fe87

    invoke-virtual {v13, v12}, Lp1/q;->e0(I)V

    move/from16 v12, v47

    invoke-static {v8, v13, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v14, v40

    move/from16 v15, v48

    invoke-virtual {v14, v13, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->s()Lb91/a;

    move-result-object v28

    invoke-virtual {v0}, Lcj1/v;->a()Lcj1/t;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcj1/t;->a()Ly81/f;

    move-result-object v0

    invoke-virtual {v0, v13, v11}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v16

    const/16 v31, 0x0

    const v33, 0x2fffa

    move v0, v9

    const/4 v9, 0x0

    move-object/from16 v30, v13

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    move/from16 v46, v15

    const/4 v15, 0x0

    move-wide/from16 v49, v16

    move/from16 v17, v10

    move-wide/from16 v10, v49

    const/16 v16, 0x0

    move/from16 v19, v17

    const-wide/16 v17, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const-wide/16 v21, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    move/from16 v27, v26

    const/16 v26, 0x0

    move/from16 v29, v27

    const/16 v27, 0x0

    move/from16 v34, v29

    const/16 v29, 0x0

    move/from16 v39, v0

    move-object/from16 v38, v5

    move-object/from16 v41, v6

    move/from16 v6, v34

    move-object/from16 v0, v40

    move/from16 v5, v46

    move/from16 v3, v47

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    const/4 v11, 0x0

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual/range {p0 .. p0}, Lcj1/v;->a()Lcj1/t;

    move-result-object v8

    invoke-virtual {v8}, Lcj1/t;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    if-nez v8, :cond_15

    const v8, 0x42adebb7

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_15
    const v9, 0x42adebb8

    invoke-virtual {v13, v9}, Lp1/q;->e0(I)V

    invoke-static {v8, v13, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v13, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->s()Lb91/a;

    move-result-object v28

    invoke-virtual {v0, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->b1()J

    move-result-wide v10

    const/16 v31, 0x0

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

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    const/4 v11, 0x0

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual/range {p0 .. p0}, Lcj1/v;->a()Lcj1/t;

    move-result-object v8

    invoke-virtual {v8}, Lcj1/t;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    if-nez v8, :cond_16

    const v8, 0x42b29d54

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    move/from16 v40, v32

    goto :goto_10

    :cond_16
    const v9, 0x42b29d55

    invoke-virtual {v13, v9}, Lp1/q;->e0(I)V

    invoke-static {v8, v13, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v13, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->Q()Lb91/a;

    move-result-object v28

    invoke-virtual {v0, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v10

    const/16 v31, 0x0

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

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    move/from16 v40, v32

    const/4 v11, 0x0

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual/range {p0 .. p0}, Lcj1/v;->a()Lcj1/t;

    move-result-object v8

    invoke-virtual {v8}, Lcj1/t;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    if-nez v8, :cond_17

    const v8, 0x42b7707c

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    move/from16 v47, v3

    const v3, 0x3e19999a    # 0.15f

    goto/16 :goto_12

    :cond_17
    const v10, 0x42b7707d

    invoke-virtual {v13, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->X()J

    move-result-wide v10

    invoke-virtual/range {p0 .. p0}, Lcj1/v;->a()Lcj1/t;

    move-result-object v12

    invoke-virtual {v12}, Lcj1/t;->b()Lgz0/m0;

    move-result-object v12

    const/4 v14, 0x0

    if-eqz v12, :cond_18

    invoke-virtual {v12}, Lgz0/m0;->toWhoopIcon()I

    move-result v12

    new-instance v15, Ly71/g;

    const/4 v9, 0x2

    invoke-direct {v15, v12, v14, v9, v14}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v16, v15

    goto :goto_11

    :cond_18
    move-object/from16 v16, v14

    :goto_11
    mul-float v18, v42, v6

    invoke-virtual {v0, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->X()J

    move-result-wide v14

    const v9, 0x3e19999a    # 0.15f

    invoke-static {v9, v14, v15}, Li2/x;->c(FJ)J

    move-result-wide v14

    const/high16 v12, 0x6000000

    or-int/2addr v12, v3

    sget v17, Ly71/g;->c:I

    shl-int/lit8 v17, v17, 0x12

    or-int v34, v12, v17

    const/16 v36, 0x0

    const v37, 0x7ffeb4

    move-object/from16 v30, v13

    move-wide v12, v10

    const/4 v11, 0x0

    move-wide/from16 v49, v14

    move v15, v9

    move-wide/from16 v9, v49

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

    move/from16 v35, v32

    const/16 v32, 0x0

    move/from16 v45, v35

    const/16 v35, 0x0

    move/from16 v47, v3

    move/from16 v3, v45

    invoke-static/range {v8 .. v37}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v13, v33

    const/4 v11, 0x0

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    :goto_12
    invoke-virtual/range {p0 .. p0}, Lcj1/v;->h()Lhy0/c2;

    move-result-object v8

    if-nez v8, :cond_19

    const v8, 0x42be9dd7

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    :goto_13
    const/4 v12, 0x1

    goto :goto_14

    :cond_19
    const v9, 0x42be9dd8

    invoke-virtual {v13, v9}, Lp1/q;->e0(I)V

    sget v9, Lhy0/c2;->p:I

    invoke-static {v8, v13, v9}, Lhy0/z1;->c(Lhy0/c2;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    goto :goto_13

    :goto_14
    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    const/16 v8, 0x38

    int-to-float v8, v8

    mul-float/2addr v8, v6

    invoke-static {v8, v4}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/16 v8, 0xa

    int-to-float v8, v8

    mul-float v15, v8, v6

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

    if-eqz v12, :cond_1a

    invoke-virtual {v13, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_1a
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v13, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v1, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_1b

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1c

    :cond_1b
    move-object/from16 v9, v41

    goto :goto_17

    :cond_1c
    move-object/from16 v9, v41

    :goto_16
    move-object/from16 v10, v38

    goto :goto_18

    :goto_17
    invoke-static {v10, v13, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_16

    :goto_18
    invoke-static {v13, v10, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcj1/v;->f()Lf11/e;

    move-result-object v8

    sget v11, Lf11/e;->m:I

    const/4 v12, 0x0

    const/4 v14, 0x2

    invoke-static {v8, v12, v13, v11, v14}, Lf11/d;->h(Lf11/e;ZLandroidx/compose/runtime/Composer;II)V

    const/4 v8, 0x1

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lcj1/v;->b()Lcj1/u;

    move-result-object v20

    if-nez v20, :cond_1d

    const v0, 0x43ae084

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    move-object v2, v4

    move v11, v12

    const/4 v3, 0x6

    goto/16 :goto_1a

    :cond_1d
    const v8, 0x43ae085

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    mul-float v8, v6, v6

    invoke-static {v8, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v13, v11}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    move/from16 v12, v42

    invoke-static {v11, v12, v6}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v0, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->X()J

    move-result-wide v11

    invoke-static {v3, v11, v12}, Li2/x;->c(FJ)J

    move-result-wide v11

    sget-object v3, Li2/w0;->a:Li2/v0;

    invoke-static {v6, v11, v12, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-wide/high16 v11, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v11

    mul-float v6, v6, v43

    mul-float v15, v39, v43

    invoke-static {v3, v15, v6}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Ll0/m;->a:Ll0/e;

    sget-object v11, Lb2/e;->J:Lb2/l;

    const/4 v12, 0x0

    invoke-static {v6, v11, v13, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v13, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v14, v13, Lp1/q;->S:Z

    if-eqz v14, :cond_1e

    invoke-virtual {v13, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_19

    :cond_1e
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_19
    invoke-static {v13, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-nez v1, :cond_1f

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    :cond_1f
    invoke-static {v11, v13, v11, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_20
    invoke-static {v13, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v18, 0x0

    const/16 v19, 0xa

    const/16 v16, 0x0

    move/from16 v17, v15

    move-object v14, v4

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object v2, v14

    invoke-static {v8, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual/range {v20 .. v20}, Lcj1/u;->a()Lgz0/m0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    const/4 v3, 0x6

    invoke-static {v1, v13, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v8

    invoke-virtual {v0, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->X()J

    move-result-wide v11

    const/16 v14, 0x1b0

    const/4 v15, 0x0

    const-string v9, ""

    invoke-static/range {v8 .. v15}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {v20 .. v20}, Lcj1/u;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move/from16 v12, v47

    invoke-static {v1, v13, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v13, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->b()Lb91/a;

    move-result-object v28

    invoke-virtual {v0, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X()J

    move-result-wide v10

    const/16 v31, 0x0

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

    move/from16 v32, v40

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    const/4 v12, 0x1

    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    const/4 v11, 0x0

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    :goto_1a
    invoke-virtual/range {p0 .. p0}, Lcj1/v;->c()Lny0/h;

    move-result-object v0

    if-nez v0, :cond_21

    const v0, 0x44b9e06

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    :goto_1b
    const/4 v12, 0x1

    goto :goto_1c

    :cond_21
    const v1, 0x44b9e07

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    move/from16 v8, v44

    invoke-static {v8, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v13, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object v1, v0

    new-instance v0, Lny0/d;

    invoke-direct {v0}, Lny0/d;-><init>()V

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v4, Lny0/h;->z:I

    shl-int/lit8 v4, v4, 0x3

    or-int/2addr v3, v4

    sget v4, Lny0/d;->a:I

    shl-int/lit8 v4, v4, 0x9

    or-int v5, v3, v4

    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    move-object/from16 v3, p1

    move-object v4, v13

    invoke-virtual/range {v0 .. v5}, Lny0/d;->e(Landroidx/compose/ui/Modifier;Lny0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v11, 0x0

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    goto :goto_1b

    :goto_1c
    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    goto :goto_1d

    :cond_22
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_1d
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lcj1/v;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lcj1/v;->e()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lcj1/v;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lej1/f0;->e(Landroidx/compose/ui/Modifier;Lcj1/v;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
