.class public abstract Lw11/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "",
        "Lw11/c;",
        "a",
        "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;",
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


# direct methods
.method public static final a(Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 91
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Lw11/c;",
            ">;"
        }
    .end annotation

    new-instance v0, Lw11/c;

    const-string v1, "Meditation with the sun and moon in the sky"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v13, "2/4"

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    new-instance v4, Lhy0/u;

    const-string v27, "MON"

    invoke-static/range {v27 .. v27}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v22, Lhy0/z;->ACTIVITY_COMPLETE:Lhy0/z;

    new-instance v7, Lcom/whoop/navigation/e;

    const/4 v11, 0x7

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x1

    const/4 v5, 0x0

    move-object v8, v7

    move-object/from16 v7, v22

    invoke-direct/range {v4 .. v10}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v19, Lhy0/u;

    const-string v28, "TUE"

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    new-instance v5, Lcom/whoop/navigation/e;

    const/4 v9, 0x7

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v24, 0x1

    const/16 v25, 0x0

    const/16 v20, 0x0

    move-object/from16 v23, v5

    invoke-direct/range {v19 .. v25}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lhy0/u;

    const-string v29, "WEN"

    invoke-static/range {v29 .. v29}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget-object v33, Lhy0/z;->INCOMPLETE:Lhy0/z;

    new-instance v34, Lcom/whoop/navigation/e;

    const/16 v38, 0x7

    const/16 v39, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v34 .. v39}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object/from16 v8, v33

    move-object/from16 v9, v34

    invoke-direct/range {v5 .. v11}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lhy0/u;

    const-string v37, "THU"

    invoke-static/range {v37 .. v37}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget-object v41, Lhy0/z;->NO_DATA:Lhy0/z;

    new-instance v42, Lcom/whoop/navigation/e;

    const/16 v46, 0x7

    const/16 v47, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    invoke-direct/range {v42 .. v47}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v11, 0x1

    const/4 v7, 0x0

    move-object/from16 v9, v41

    move-object/from16 v10, v42

    invoke-direct/range {v6 .. v12}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lhy0/u;

    const-string v49, "FRI"

    invoke-static/range {v49 .. v49}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v44

    sget-object v53, Lhy0/z;->CURRENT:Lhy0/z;

    new-instance v46, Lcom/whoop/navigation/e;

    const/16 v58, 0x7

    const/16 v59, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    move-object/from16 v54, v46

    invoke-direct/range {v54 .. v59}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v47, 0x1

    const/16 v48, 0x0

    move-object/from16 v42, v8

    move-object/from16 v45, v53

    invoke-direct/range {v42 .. v48}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lhy0/u;

    const-string v57, "SAT"

    invoke-static/range {v57 .. v57}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v44

    sget-object v61, Lhy0/z;->PENDING:Lhy0/z;

    new-instance v62, Lcom/whoop/navigation/e;

    const/16 v66, 0x7

    const/16 v67, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    invoke-direct/range {v62 .. v67}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v42, v9

    move-object/from16 v45, v61

    move-object/from16 v46, v62

    invoke-direct/range {v42 .. v48}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v58, Lhy0/u;

    const-string v45, "SUN"

    invoke-static/range {v45 .. v45}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v60

    new-instance v62, Lcom/whoop/navigation/e;

    invoke-direct/range {v62 .. v67}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v63, 0x1

    invoke-direct/range {v58 .. v64}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v6

    move-object/from16 v10, v58

    move-object v6, v5

    move-object/from16 v5, v19

    filled-new-array/range {v4 .. v10}, [Lhy0/u;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const/16 v11, 0x380

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v4, v18

    invoke-direct/range {v0 .. v12}, Lw11/c;-><init>(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/e;Lf41/a;Lp01/b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lw11/c;

    const-string v1, "Meditation"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const-string v2, "4/4"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    new-instance v2, Lkd1/o$a;

    sget v3, Lgy0/a;->b:I

    invoke-direct {v2, v3}, Lkd1/o$a;-><init>(I)V

    new-instance v19, Lhy0/u;

    invoke-static/range {v27 .. v27}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    new-instance v3, Lcom/whoop/navigation/e;

    const/4 v7, 0x7

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v23, v3

    invoke-direct/range {v19 .. v25}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v19

    new-instance v19, Lhy0/u;

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    new-instance v5, Lcom/whoop/navigation/e;

    const/4 v9, 0x7

    const/4 v7, 0x0

    invoke-direct/range {v5 .. v10}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v23, v5

    invoke-direct/range {v19 .. v25}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v19

    new-instance v19, Lhy0/u;

    invoke-static/range {v29 .. v29}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    new-instance v6, Lcom/whoop/navigation/e;

    const/4 v10, 0x7

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v23, v6

    invoke-direct/range {v19 .. v25}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v19

    new-instance v19, Lhy0/u;

    invoke-static/range {v37 .. v37}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    new-instance v7, Lcom/whoop/navigation/e;

    const/4 v11, 0x7

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v23, v7

    invoke-direct/range {v19 .. v25}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v50, Lhy0/u;

    invoke-static/range {v49 .. v49}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v52

    new-instance v54, Lcom/whoop/navigation/e;

    move-object/from16 v7, v54

    invoke-direct/range {v7 .. v12}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v55, 0x1

    const/16 v51, 0x0

    invoke-direct/range {v50 .. v56}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lhy0/u;

    invoke-static/range {v57 .. v57}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v60

    new-instance v62, Lcom/whoop/navigation/e;

    const/16 v24, 0x7

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v20, v62

    invoke-direct/range {v20 .. v25}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v58, v9

    invoke-direct/range {v58 .. v64}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v58, Lhy0/u;

    invoke-static/range {v45 .. v45}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v60

    new-instance v62, Lcom/whoop/navigation/e;

    move-object/from16 v20, v62

    invoke-direct/range {v20 .. v25}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct/range {v58 .. v64}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v19

    move-object/from16 v8, v50

    move-object/from16 v10, v58

    filled-new-array/range {v4 .. v10}, [Lhy0/u;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v20

    const/16 v25, 0x380

    const/16 v26, 0x0

    const/4 v15, 0x1

    const/16 v24, 0x0

    move-object/from16 v19, v2

    invoke-direct/range {v14 .. v26}, Lw11/c;-><init>(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/e;Lf41/a;Lp01/b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v14

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    new-instance v3, Lhy0/u;

    invoke-static/range {v27 .. v27}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v9, Lhy0/z;->BEHAVIOR_COMPLETE:Lhy0/z;

    new-instance v19, Lcom/whoop/navigation/e;

    const/16 v23, 0x7

    const/16 v20, 0x0

    invoke-direct/range {v19 .. v24}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v8, 0x1

    move-object v6, v9

    const/4 v9, 0x0

    const/4 v4, 0x0

    move-object/from16 v7, v19

    invoke-direct/range {v3 .. v9}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v9, v6

    new-instance v4, Lhy0/u;

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    new-instance v19, Lcom/whoop/navigation/e;

    invoke-direct/range {v19 .. v24}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v11, 0x1

    const/4 v7, 0x0

    move-object v6, v4

    move-object/from16 v10, v19

    invoke-direct/range {v6 .. v12}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v10, v9

    new-instance v30, Lhy0/u;

    invoke-static/range {v29 .. v29}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v32

    new-instance v34, Lcom/whoop/navigation/e;

    move-object/from16 v19, v34

    invoke-direct/range {v19 .. v24}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v35, 0x1

    const/16 v31, 0x0

    invoke-direct/range {v30 .. v36}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v38, Lhy0/u;

    invoke-static/range {v37 .. v37}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v40

    new-instance v19, Lcom/whoop/navigation/e;

    invoke-direct/range {v19 .. v24}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v43, 0x1

    const/16 v44, 0x0

    move-object/from16 v42, v19

    invoke-direct/range {v38 .. v44}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v50, Lhy0/u;

    invoke-static/range {v49 .. v49}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v52

    new-instance v19, Lcom/whoop/navigation/e;

    invoke-direct/range {v19 .. v24}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v54, v19

    invoke-direct/range {v50 .. v56}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lhy0/u;

    invoke-static/range {v57 .. v57}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v60

    new-instance v62, Lcom/whoop/navigation/e;

    move-object/from16 v19, v62

    invoke-direct/range {v19 .. v24}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v58, v8

    invoke-direct/range {v58 .. v64}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lhy0/u;

    invoke-static/range {v45 .. v45}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v60

    new-instance v62, Lcom/whoop/navigation/e;

    move-object/from16 v19, v62

    invoke-direct/range {v19 .. v24}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v58, v9

    invoke-direct/range {v58 .. v64}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v30

    move-object/from16 v6, v38

    move-object/from16 v7, v50

    filled-new-array/range {v3 .. v9}, [Lhy0/u;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v20

    const-string v3, "BEHAVIOR IMPACT"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-string v46, "Impact of Alcohol"

    invoke-static/range {v46 .. v46}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const-string v47, "Lorem ipsum dolor sit amet, consetetur sadipscing elitr."

    invoke-static/range {v47 .. v47}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const-string v48, "HELPS WITH"

    invoke-static/range {v48 .. v48}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const-string v65, "RECOVERY"

    invoke-static/range {v65 .. v65}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v67

    move-object/from16 v11, p0

    check-cast v11, Lp1/q;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v4, v12, :cond_0

    sget-object v4, Lw11/d$a;->w:Lw11/d$a;

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v4}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v69

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v12, :cond_1

    sget-object v4, Lw11/d$b;->w:Lw11/d$b;

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v4}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v71

    new-instance v66, Lhy0/h1;

    const/16 v68, 0x0

    const/16 v70, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

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

    const v89, 0x3fffea

    const/16 v90, 0x0

    invoke-direct/range {v66 .. v90}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v66 .. v66}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    new-instance v4, Lf41/a;

    invoke-direct/range {v4 .. v9}, Lf41/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    new-instance v14, Lw11/c;

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x300

    const/16 v26, 0x0

    move-object/from16 v22, v4

    invoke-direct/range {v14 .. v26}, Lw11/c;-><init>(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/e;Lf41/a;Lp01/b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v14

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    new-instance v19, Lhy0/u;

    invoke-static/range {v27 .. v27}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    new-instance v20, Lcom/whoop/navigation/e;

    const/16 v24, 0x7

    const/16 v25, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v20 .. v25}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v11

    const/4 v11, 0x1

    move-object v5, v12

    const/4 v12, 0x0

    const/4 v7, 0x0

    move-object v9, v10

    move-object/from16 v6, v19

    move-object/from16 v10, v20

    invoke-direct/range {v6 .. v12}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v20, Lhy0/u;

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    new-instance v10, Lcom/whoop/navigation/e;

    const/4 v14, 0x7

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v11, 0x1

    move-object/from16 v6, v20

    invoke-direct/range {v6 .. v12}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v30, Lhy0/u;

    invoke-static/range {v29 .. v29}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v32

    new-instance v34, Lcom/whoop/navigation/e;

    const/4 v10, 0x7

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v6, v34

    invoke-direct/range {v6 .. v11}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v35, 0x1

    const/16 v36, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v30 .. v36}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v38, Lhy0/u;

    invoke-static/range {v37 .. v37}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v40

    new-instance v6, Lcom/whoop/navigation/e;

    invoke-direct/range {v6 .. v11}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v43, 0x1

    const/16 v44, 0x0

    const/16 v39, 0x0

    move-object/from16 v42, v6

    invoke-direct/range {v38 .. v44}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v50, Lhy0/u;

    invoke-static/range {v49 .. v49}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v52

    new-instance v6, Lcom/whoop/navigation/e;

    invoke-direct/range {v6 .. v11}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v55, 0x1

    const/16 v56, 0x0

    const/16 v51, 0x0

    move-object/from16 v54, v6

    invoke-direct/range {v50 .. v56}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v24, Lhy0/u;

    invoke-static/range {v57 .. v57}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v60

    new-instance v62, Lcom/whoop/navigation/e;

    move-object/from16 v6, v62

    invoke-direct/range {v6 .. v11}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v63, 0x1

    const/16 v64, 0x0

    const/16 v59, 0x0

    move-object/from16 v58, v24

    invoke-direct/range {v58 .. v64}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v25, Lhy0/u;

    invoke-static/range {v45 .. v45}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v60

    new-instance v62, Lcom/whoop/navigation/e;

    move-object/from16 v6, v62

    invoke-direct/range {v6 .. v11}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v58, v25

    invoke-direct/range {v58 .. v64}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v21, v30

    move-object/from16 v22, v38

    move-object/from16 v23, v50

    filled-new-array/range {v19 .. v25}, [Lhy0/u;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v20

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static/range {v46 .. v46}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static/range {v47 .. v47}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static/range {v48 .. v48}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-static/range {v65 .. v65}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_2

    sget-object v3, Lw11/d$c;->w:Lw11/d$c;

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v24

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_3

    sget-object v3, Lw11/d$d;->w:Lw11/d$d;

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v26

    new-instance v21, Lhy0/h1;

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const v44, 0x3fffea

    const/16 v45, 0x0

    invoke-direct/range {v21 .. v45}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v21 .. v21}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    new-instance v6, Lf41/a;

    invoke-direct/range {v6 .. v11}, Lf41/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    sget-object v41, Lp01/h;->STEPS:Lp01/h;

    new-instance v21, Lp01/b;

    const v43, 0xbfffc

    const/16 v44, 0x0

    const/16 v22, 0x5

    const/16 v23, 0x3

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const-wide/16 v39, 0x0

    invoke-direct/range {v21 .. v44}, Lp01/b;-><init>(IIFLjava/lang/String;Lb91/a;Ly81/f;Ljava/lang/Boolean;Ly81/f;Ly81/f;Ly81/f;Li2/t;Li2/t;FFFZZJLp01/h;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lw11/c;

    const/4 v15, 0x0

    const/16 v19, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x200

    move-object/from16 v22, v6

    invoke-direct/range {v14 .. v26}, Lw11/c;-><init>(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/e;Lf41/a;Lp01/b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v0, v2, v4, v14}, [Lw11/c;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
