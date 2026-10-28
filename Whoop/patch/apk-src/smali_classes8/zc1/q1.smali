.class public abstract Lzc1/q1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/q1;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 104

    move-object/from16 v5, p0

    check-cast v5, Lp1/q;

    const v1, -0x31290510

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    and-int/lit8 v4, p1, 0x1

    invoke-virtual {v5, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_3

    new-instance v6, Lc11/k;

    sget-object v3, Lc11/m;->OLDER_1:Lc11/m;

    invoke-direct {v6, v3}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v7, Lc11/k;

    sget-object v4, Lc11/m;->OLDER_2:Lc11/m;

    invoke-direct {v7, v4}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v8, Lc11/k;

    sget-object v9, Lc11/m;->OLDER_3:Lc11/m;

    invoke-direct {v8, v9}, Lc11/k;-><init>(Lc11/m;)V

    move-object v10, v9

    new-instance v9, Lc11/k;

    sget-object v11, Lc11/m;->OLDER_4:Lc11/m;

    invoke-direct {v9, v11}, Lc11/k;-><init>(Lc11/m;)V

    move-object v12, v10

    new-instance v10, Lc11/k;

    sget-object v13, Lc11/m;->NEUTRAL:Lc11/m;

    invoke-direct {v10, v13}, Lc11/k;-><init>(Lc11/m;)V

    move-object v14, v11

    new-instance v11, Lc11/k;

    invoke-direct {v11, v13}, Lc11/k;-><init>(Lc11/m;)V

    move-object v15, v12

    new-instance v12, Lc11/k;

    const/16 p0, 0x0

    sget-object v1, Lc11/m;->YOUNGER_4:Lc11/m;

    invoke-direct {v12, v1}, Lc11/k;-><init>(Lc11/m;)V

    move-object/from16 v16, v13

    new-instance v13, Lc11/k;

    sget-object v2, Lc11/m;->YOUNGER_3:Lc11/m;

    invoke-direct {v13, v2}, Lc11/k;-><init>(Lc11/m;)V

    move-object/from16 v17, v14

    new-instance v14, Lc11/k;

    move-object/from16 v18, v3

    sget-object v3, Lc11/m;->YOUNGER_2:Lc11/m;

    invoke-direct {v14, v3}, Lc11/k;-><init>(Lc11/m;)V

    move-object/from16 v19, v15

    new-instance v15, Lc11/k;

    sget-object v0, Lc11/m;->YOUNGER_1:Lc11/m;

    invoke-direct {v15, v0}, Lc11/k;-><init>(Lc11/m;)V

    move-object/from16 v21, v0

    move-object/from16 v22, v1

    move-object/from16 v1, v16

    move-object/from16 v23, v17

    move-object/from16 v0, v19

    filled-new-array/range {v6 .. v15}, [Lc11/k;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const-string v6, "0h"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const-string v6, "2h"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    new-instance v24, Lc11/l;

    const-string v6, "0:49"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    const-string v6, "h"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    sget-object v32, Lc11/o;->ENABLED:Lc11/o;

    const-string v34, "6 Month avg."

    invoke-static/range {v34 .. v34}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v30

    const-wide v27, 0x3fe4cccccccccccdL    # 0.65

    move-object/from16 v29, v32

    invoke-direct/range {v24 .. v30}, Lc11/l;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLc11/o;Lcom/whoop/design/util/TextResource;)V

    const-string v7, "0.0"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const-string v25, "years"

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    sget-object v16, Lc11/n;->NEUTRAL:Lc11/n;

    new-instance v17, Lc11/l;

    const-string v26, "0.39"

    invoke-static/range {v26 .. v26}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v28

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v29

    const-wide v30, 0x3fdccccccccccccdL    # 0.45

    const-string v35, "30 Day avg."

    invoke-static/range {v35 .. v35}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v33

    move-object/from16 v27, v17

    invoke-direct/range {v27 .. v33}, Lc11/l;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLc11/o;Lcom/whoop/design/util/TextResource;)V

    const-string v7, "Meeting Recommendation"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v40

    new-instance v7, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v10

    invoke-virtual {v10}, Lgz0/o0;->b()Lgz0/c;

    move-result-object v10

    invoke-virtual {v10}, Lgz0/c;->f()I

    move-result v10

    const/4 v12, 0x0

    const/4 v13, 0x2

    invoke-direct {v7, v10, v12, v13, v12}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v10, "You\u2019re right on track with your HR Zone 4-5 Time. Your average is falling slightly, but is still within a healthy range."

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v41

    new-instance v52, Ld11/b;

    const-string v68, "VIEW TREND"

    invoke-static/range {v68 .. v68}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v43

    sget-object v46, Ly81/f;->RECOVERY:Ly81/f;

    new-instance v10, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v19

    move-object/from16 v69, v6

    invoke-virtual/range {v19 .. v19}, Lgz0/w;->b()I

    move-result v6

    invoke-direct {v10, v6, v12, v13, v12}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v47, 0x8

    const/16 v48, 0x0

    move-object/from16 v44, v46

    const/16 v46, 0x0

    move-object/from16 v45, v10

    move-object/from16 v42, v52

    invoke-direct/range {v42 .. v48}, Ld11/b;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Lj91/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v44

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v10, v12, :cond_1

    sget-object v10, Lzc1/q1$b;->w:Lzc1/q1$b;

    invoke-virtual {v5, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v10}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v56

    new-instance v36, Ld11/i;

    const v66, 0x1ff57f27

    const/16 v67, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    move-object/from16 v43, v7

    invoke-direct/range {v36 .. v67}, Ld11/i;-><init>(Ljava/lang/Object;Lkd1/l;Ll3/v0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll3/v0;Ly71/g;Lkd1/o;Lkd1/o;Lkd1/o;Lkotlin/jvm/functions/Function1;ZZLd11/a;Lk91/a;Ld11/b;ZZLd11/c;Li91/a;Lj91/b;Li2/t;FFFFFLjava/lang/Object;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v36 .. v36}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const/4 v10, 0x1

    const/4 v13, 0x0

    invoke-static {v13, v10, v13}, Lm91/m;->h(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lm91/p;

    move-result-object v27

    new-instance v40, Lc11/i;

    move-object/from16 v44, v6

    move-object/from16 v70, v12

    move-object v6, v13

    move-object/from16 v10, v18

    move-object/from16 v12, v21

    move-object/from16 v13, v24

    move-object/from16 v19, v27

    move-object/from16 v18, v7

    move-object/from16 v7, v40

    invoke-direct/range {v7 .. v19}, Lc11/i;-><init>(Ljava/util/List;Lcom/whoop/design/util/TextResource;Lc11/m;Lcom/whoop/design/util/TextResource;Lc11/m;Lc11/l;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc11/n;Lc11/l;Ljava/util/List;Lm91/p;)V

    new-instance v36, Lc11/p;

    const-string v8, "TIME IN HR ZONE 1-3"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v38

    const/16 v42, 0x10

    const/16 v43, 0x0

    const/16 v39, 0x1

    const/16 v41, 0x0

    const-string v37, "TIME_IN_HR_ZONE_1-3"

    invoke-direct/range {v36 .. v43}, Lc11/p;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLc11/i;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v49, Lc11/i;

    new-instance v7, Lc11/k;

    invoke-direct {v7, v10}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v8, Lc11/k;

    invoke-direct {v8, v1}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v9, Lc11/k;

    invoke-direct {v9, v2}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v11, Lc11/k;

    invoke-direct {v11, v2}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v13, Lc11/k;

    invoke-direct {v13, v3}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v14, Lc11/k;

    invoke-direct {v14, v12}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v15, Lc11/k;

    invoke-direct {v15, v12}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v6, Lc11/k;

    invoke-direct {v6, v12}, Lc11/k;-><init>(Lc11/m;)V

    move-object/from16 v57, v6

    new-instance v6, Lc11/k;

    invoke-direct {v6, v12}, Lc11/k;-><init>(Lc11/m;)V

    move-object/from16 v58, v6

    new-instance v6, Lc11/k;

    invoke-direct {v6, v12}, Lc11/k;-><init>(Lc11/m;)V

    move-object/from16 v59, v6

    move-object/from16 v50, v7

    move-object/from16 v51, v8

    move-object/from16 v52, v9

    move-object/from16 v53, v11

    move-object/from16 v54, v13

    move-object/from16 v55, v14

    move-object/from16 v56, v15

    filled-new-array/range {v50 .. v59}, [Lc11/k;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const-string v6, "0 Minutes"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const-string v6, "240 Minutes"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    new-instance v27, Lc11/l;

    const-string v6, "20"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v28

    const-string v6, "Minutes"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v29

    const-wide v30, 0x3fd3333333333333L    # 0.3

    invoke-static/range {v34 .. v34}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v33

    invoke-direct/range {v27 .. v33}, Lc11/l;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLc11/o;Lcom/whoop/design/util/TextResource;)V

    move-object/from16 v13, v27

    const-string v7, "+2.6"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    sget-object v16, Lc11/n;->OLDER:Lc11/n;

    new-instance v17, Lc11/l;

    const-string v7, "15"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v28

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v29

    const-wide v30, 0x3fc999999999999aL    # 0.2

    invoke-static/range {v35 .. v35}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v33

    move-object/from16 v27, v17

    invoke-direct/range {v27 .. v33}, Lc11/l;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLc11/o;Lcom/whoop/design/util/TextResource;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v7, v6, v7}, Lm91/m;->h(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lm91/p;

    move-result-object v19

    sget-object v18, Lm83/y;->w:Lm83/y;

    move-object/from16 v7, v49

    invoke-direct/range {v7 .. v19}, Lc11/i;-><init>(Ljava/util/List;Lcom/whoop/design/util/TextResource;Lc11/m;Lcom/whoop/design/util/TextResource;Lc11/m;Lc11/l;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc11/n;Lc11/l;Ljava/util/List;Lm91/p;)V

    new-instance v45, Lc11/p;

    const-string v6, "STRENGTH TRAINING"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v47

    const/16 v51, 0x10

    const/16 v52, 0x0

    const/16 v50, 0x0

    const-string v46, "STRENGTH_TRAINING"

    invoke-direct/range {v45 .. v52}, Lc11/p;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLc11/i;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v37, v45

    new-instance v49, Lc11/i;

    new-instance v6, Lc11/k;

    invoke-direct {v6, v10}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v7, Lc11/k;

    invoke-direct {v7, v4}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v4, Lc11/k;

    invoke-direct {v4, v0}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v0, Lc11/k;

    move-object/from16 v14, v23

    invoke-direct {v0, v14}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v8, Lc11/k;

    invoke-direct {v8, v1}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v9, Lc11/k;

    invoke-direct {v9, v1}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v1, Lc11/k;

    move-object/from16 v11, v22

    invoke-direct {v1, v11}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v11, Lc11/k;

    invoke-direct {v11, v2}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v2, Lc11/k;

    invoke-direct {v2, v3}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v3, Lc11/k;

    invoke-direct {v3, v12}, Lc11/k;-><init>(Lc11/m;)V

    move-object/from16 v53, v0

    move-object/from16 v56, v1

    move-object/from16 v58, v2

    move-object/from16 v59, v3

    move-object/from16 v52, v4

    move-object/from16 v50, v6

    move-object/from16 v51, v7

    move-object/from16 v54, v8

    move-object/from16 v55, v9

    move-object/from16 v57, v11

    filled-new-array/range {v50 .. v59}, [Lc11/k;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const-string v0, "15 ml/kg/min"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const-string v0, "70 ml/kg/min"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    new-instance v27, Lc11/l;

    const-string v0, "58"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v28

    const-string v0, "ml/kg/min"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v29

    const-wide v30, 0x3fe4cccccccccccdL    # 0.65

    invoke-static/range {v34 .. v34}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v33

    invoke-direct/range {v27 .. v33}, Lc11/l;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLc11/o;Lcom/whoop/design/util/TextResource;)V

    move-object/from16 v13, v27

    const-string v0, "-5.3"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    sget-object v16, Lc11/n;->YOUNGER:Lc11/n;

    new-instance v17, Lc11/l;

    invoke-static/range {v26 .. v26}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v28

    invoke-static/range {v69 .. v69}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v29

    const-wide v30, 0x3fdccccccccccccdL    # 0.45

    invoke-static/range {v35 .. v35}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v33

    move-object/from16 v27, v17

    invoke-direct/range {v27 .. v33}, Lc11/l;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLc11/o;Lcom/whoop/design/util/TextResource;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v7, v6, v7}, Lm91/m;->h(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lm91/p;

    move-result-object v19

    move-object/from16 v7, v49

    invoke-direct/range {v7 .. v19}, Lc11/i;-><init>(Ljava/util/List;Lcom/whoop/design/util/TextResource;Lc11/m;Lcom/whoop/design/util/TextResource;Lc11/m;Lc11/l;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc11/n;Lc11/l;Ljava/util/List;Lm91/p;)V

    new-instance v1, Lc11/p;

    const-string v0, "VO2 MAX"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v47

    const/16 v51, 0x10

    const/16 v52, 0x0

    const/16 v50, 0x0

    const-string v46, "VO2_MAX"

    move-object/from16 v45, v1

    invoke-direct/range {v45 .. v52}, Lc11/p;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLc11/i;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v45

    new-instance v6, Lc11/k;

    sget-object v1, Lc11/m;->DISABLED_1:Lc11/m;

    invoke-direct {v6, v1}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v7, Lc11/k;

    sget-object v2, Lc11/m;->DISABLED_2:Lc11/m;

    invoke-direct {v7, v2}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v8, Lc11/k;

    sget-object v3, Lc11/m;->DISABLED_3:Lc11/m;

    invoke-direct {v8, v3}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v9, Lc11/k;

    sget-object v4, Lc11/m;->DISABLED_4:Lc11/m;

    invoke-direct {v9, v4}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v10, Lc11/k;

    sget-object v11, Lc11/m;->DISABLED_0:Lc11/m;

    invoke-direct {v10, v11}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v12, Lc11/k;

    invoke-direct {v12, v11}, Lc11/k;-><init>(Lc11/m;)V

    move-object v11, v12

    new-instance v12, Lc11/k;

    invoke-direct {v12, v4}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v13, Lc11/k;

    invoke-direct {v13, v3}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v14, Lc11/k;

    invoke-direct {v14, v2}, Lc11/k;-><init>(Lc11/m;)V

    new-instance v15, Lc11/k;

    invoke-direct {v15, v1}, Lc11/k;-><init>(Lc11/m;)V

    filled-new-array/range {v6 .. v15}, [Lc11/k;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const-string v2, "0%"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const-string v2, "95%"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    new-instance v12, Lc11/l;

    const-string v2, "--"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const-string v3, "xx"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    sget-object v31, Lc11/o;->DISABLED:Lc11/o;

    const-string v4, "6 Month Average."

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    const-wide/high16 v15, 0x3fe0000000000000L    # 0.5

    move-object/from16 v17, v31

    invoke-direct/range {v12 .. v18}, Lc11/l;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLc11/o;Lcom/whoop/design/util/TextResource;)V

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    sget-object v16, Lc11/n;->DISABLED:Lc11/n;

    new-instance v17, Lc11/l;

    const-string v2, "00"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v27

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v28

    const-string v2, "30 Day Average."

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v32

    const-wide/high16 v29, 0x3fe0000000000000L    # 0.5

    move-object/from16 v26, v17

    invoke-direct/range {v26 .. v32}, Lc11/l;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLc11/o;Lcom/whoop/design/util/TextResource;)V

    new-instance v71, Lny0/h;

    const-string v2, "UPDATE DATA"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v72

    sget-object v73, Lgz0/m0;->ADD:Lgz0/m0;

    const v97, 0x1fffffc

    const/16 v98, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    const/16 v78, 0x0

    const/16 v79, 0x0

    const/16 v80, 0x0

    const/16 v81, 0x0

    const/16 v82, 0x0

    const/16 v83, 0x0

    const/16 v84, 0x0

    const/16 v85, 0x0

    const/16 v86, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    const/16 v89, 0x0

    const/16 v90, 0x0

    const/16 v91, 0x0

    const/16 v92, 0x0

    const/16 v93, 0x0

    const/16 v94, 0x0

    const/16 v95, 0x0

    const/16 v96, 0x0

    invoke-direct/range {v71 .. v98}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "There is currently no Data"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v76

    new-instance v2, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/i0;->k()I

    move-result v3

    const/4 v4, 0x2

    const/4 v7, 0x0

    invoke-direct {v2, v3, v7, v4, v7}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v3, "This value cannot be displayed at the moment because there is not enough data. One option is to add the data manually."

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v77

    new-instance v88, Ld11/b;

    invoke-static/range {v68 .. v68}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v45

    new-instance v3, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/w;->b()I

    move-result v6

    invoke-direct {v3, v6, v7, v4, v7}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v49, 0x8

    const/16 v50, 0x0

    const/16 v48, 0x0

    move-object/from16 v47, v3

    move-object/from16 v46, v44

    move-object/from16 v44, v88

    invoke-direct/range {v44 .. v50}, Ld11/b;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Lj91/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v4, v70

    if-ne v3, v4, :cond_2

    sget-object v3, Lzc1/q1$a;->w:Lzc1/q1$a;

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v3}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v92

    new-instance v72, Ld11/i;

    const v102, 0x1ff57f27

    const/16 v103, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v78, 0x0

    const/16 v80, 0x0

    const/16 v81, 0x0

    const/16 v82, 0x0

    const/16 v83, 0x0

    const/16 v84, 0x0

    const/16 v85, 0x0

    const/16 v86, 0x0

    const/16 v87, 0x0

    const/16 v89, 0x0

    const/16 v90, 0x0

    const/16 v91, 0x0

    const/16 v93, 0x0

    const/16 v94, 0x0

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v97, 0x0

    const/16 v98, 0x0

    const/16 v99, 0x0

    const/16 v100, 0x0

    const/16 v101, 0x0

    move-object/from16 v79, v2

    invoke-direct/range {v72 .. v103}, Ld11/i;-><init>(Ljava/lang/Object;Lkd1/l;Ll3/v0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll3/v0;Ly71/g;Lkd1/o;Lkd1/o;Lkd1/o;Lkotlin/jvm/functions/Function1;ZZLd11/a;Lk91/a;Ld11/b;ZZLd11/c;Li91/a;Lj91/b;Li2/t;FFFFFLjava/lang/Object;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x2

    new-array v2, v4, [Lm91/u;

    aput-object v71, v2, p0

    const/4 v6, 0x1

    aput-object v72, v2, v6

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    const/4 v7, 0x0

    invoke-static {v7, v6, v7}, Lm91/m;->h(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lm91/p;

    move-result-object v19

    new-instance v7, Lc11/i;

    move-object v13, v12

    move-object v12, v1

    move-object v10, v1

    invoke-direct/range {v7 .. v19}, Lc11/i;-><init>(Ljava/util/List;Lcom/whoop/design/util/TextResource;Lc11/m;Lcom/whoop/design/util/TextResource;Lc11/m;Lc11/l;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc11/n;Lc11/l;Ljava/util/List;Lm91/p;)V

    new-instance v1, Lc11/p;

    const-string v2, "LEAN BODY MASS"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    const/16 v26, 0x10

    const/16 v27, 0x0

    const-string v21, "LEAN_BODY_MASS"

    const/16 v23, 0x1

    const/16 v25, 0x0

    move-object/from16 v20, v1

    move-object/from16 v24, v7

    invoke-direct/range {v20 .. v27}, Lc11/p;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLc11/i;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v6, Lc11/p;->f:I

    const/16 v7, 0xe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, v36

    invoke-static/range {v1 .. v7}, Lc11/h;->v(Lc11/p;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v1, v37

    invoke-static/range {v1 .. v7}, Lc11/h;->v(Lc11/p;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v0

    invoke-static/range {v1 .. v7}, Lc11/h;->v(Lc11/p;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v1, v20

    invoke-static/range {v1 .. v7}, Lc11/h;->v(Lc11/p;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v1, Lzc1/w0;

    const/4 v2, 0x5

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/w0;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/q1;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
