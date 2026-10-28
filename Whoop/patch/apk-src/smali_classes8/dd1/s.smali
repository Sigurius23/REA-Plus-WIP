.class public abstract Ldd1/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "",
        "Lm91/u;",
        "a",
        "()Ljava/util/List;",
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
.method public static final a()Ljava/util/List;
    .locals 73
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ACTIVITY_MAP:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v0}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v0

    const-string v1, "Activity Map"

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-static {v1, v0, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ACTIVITY_RECOMMENDATION_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    const-string v4, "Activity Recommendation Tile"

    invoke-static {v4, v1, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v1

    sget-object v4, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ANNOTATED_TEXT:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v4}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v4

    sget-object v5, Ldd1/j;->a:Ldd1/j;

    invoke-virtual {v5}, Ldd1/j;->s1()Lc93/m;

    move-result-object v6

    const-string v7, "Annotated Text"

    invoke-static {v7, v4, v6}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v4

    sget-object v6, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->APPOINTMENT_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v6}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v6

    invoke-virtual {v5}, Ldd1/j;->L0()Lc93/m;

    move-result-object v7

    const-string v8, "Appointment Card"

    invoke-static {v8, v6, v7}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v6

    sget-object v7, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ADVANCED_LABS_SUBSCRIPTION_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v7}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v7

    invoke-virtual {v5}, Ldd1/j;->v1()Lc93/m;

    move-result-object v8

    const-string v9, "Advanced Labs Subscription Card"

    invoke-static {v9, v7, v8}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v7

    sget-object v8, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->BREAK_DOWN_GRAPH:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v8}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v8

    invoke-virtual {v5}, Ldd1/j;->l1()Lc93/m;

    move-result-object v9

    const-string v10, "Breakdown Graph"

    invoke-static {v10, v8, v9}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v8

    sget-object v9, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->BUTTON_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v9}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v9

    invoke-virtual {v5}, Ldd1/j;->T0()Lc93/m;

    move-result-object v10

    const-string v11, "Button Card"

    invoke-static {v11, v9, v10}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v9

    sget-object v10, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->BEHAVIORS_CALENDAR:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v10}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v10

    const-string v11, "Behaviors Calendar"

    invoke-static {v11, v10, v2, v3, v2}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v10

    sget-object v11, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->BINARY_FEEDBACK:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v11}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v11

    invoke-virtual {v5}, Ldd1/j;->y0()Lc93/m;

    move-result-object v12

    const-string v13, "Binary Feedback"

    invoke-static {v13, v11, v12}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v11

    sget-object v12, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->BIOMARKER_LIST:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v12}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v12

    invoke-virtual {v5}, Ldd1/j;->x1()Lc93/m;

    move-result-object v13

    const-string v14, "Biomarkers List"

    invoke-static {v14, v12, v13}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v12

    sget-object v13, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->COMPACT_BUTTON_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v13}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v13

    invoke-virtual {v5}, Ldd1/j;->t1()Lc93/m;

    move-result-object v14

    const-string v15, "Compact Button Card"

    invoke-static {v15, v13, v14}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v13

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v5}, Ldd1/j;->J0()Lc93/m;

    move-result-object v15

    const-string v2, "Card"

    invoke-static {v2, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v2

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->CARD_CONTAINER:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v5}, Ldd1/j;->c1()Lc93/m;

    move-result-object v15

    const-string v3, "Card Container"

    invoke-static {v3, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v3

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->CIRCULAR_PROGRESS_INDICATOR:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v5}, Ldd1/j;->m1()Lc93/m;

    move-result-object v15

    move-object/from16 v17, v0

    const-string v0, "Circular Progress Indicator"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->CONNECTIVITY_INDICATOR:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v5}, Ldd1/j;->Q0()Lc93/m;

    move-result-object v15

    move-object/from16 v18, v0

    const-string v0, "Connectivity Indicator"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->CONTENT_BLOCK_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v5}, Ldd1/j;->f1()Lc93/m;

    move-result-object v15

    move-object/from16 v19, v0

    const-string v0, "Content Block Card"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->CURRENT_PLAN_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    const-string v15, "Current Plan Tile"

    move-object/from16 v20, v0

    move-object/from16 v21, v1

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {v15, v14, v0, v1, v0}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v14

    sget-object v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->CONTRIBUTOR_GRAPH:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v0}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v0

    invoke-virtual {v5}, Ldd1/j;->A1()Lc93/m;

    move-result-object v1

    const-string v15, "Contributor Graph"

    invoke-static {v15, v0, v1}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->CONTRIBUTOR_TILE_METRIC:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    invoke-virtual {v5}, Ldd1/j;->F0()Lc93/m;

    move-result-object v15

    move-object/from16 v22, v0

    const-string v0, "Contributor Tile Metric"

    invoke-static {v0, v1, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->COMPARISON_BAR:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    invoke-virtual {v5}, Ldd1/j;->o1()Lc93/m;

    move-result-object v15

    move-object/from16 v23, v0

    const-string v0, "Comparison Bar"

    invoke-static {v0, v1, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->DATESELECTOR:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    invoke-virtual {v5}, Ldd1/j;->C0()Lc93/m;

    move-result-object v15

    move-object/from16 v24, v0

    const-string v0, "Date Selector"

    invoke-static {v0, v1, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->DIALOG:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    const-string v15, "Dialog"

    move-object/from16 v25, v0

    move-object/from16 v26, v2

    const/4 v0, 0x0

    const/4 v2, 0x4

    invoke-static {v15, v1, v0, v2, v0}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v1

    sget-object v15, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->EMPTY_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v15}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v15

    invoke-virtual {v5}, Ldd1/j;->K0()Lc93/m;

    move-result-object v0

    const-string v2, "Empty Tile"

    invoke-static {v2, v15, v0}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;->MOLECULE_GRAPHING_ELEMENTS:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    invoke-static {v2}, Ldd1/r;->f(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;

    move-result-object v2

    const-string v15, "Graphing Elements"

    move-object/from16 v27, v0

    move-object/from16 v28, v1

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {v15, v2, v0, v1, v0}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v2

    sget-object v15, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->GOAL_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v15}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v15

    move-object/from16 v29, v2

    const-string v2, "Goal Card"

    invoke-static {v2, v15, v0, v1, v0}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v2

    sget-object v15, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->GRAPH_DESCRIPTION_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v15}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v15

    invoke-virtual {v5}, Ldd1/j;->S0()Lc93/m;

    move-result-object v0

    const-string v1, "Graph Description Card"

    invoke-static {v1, v15, v0}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->HEALTH_MONITOR_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    const-string v15, "Health Monitor Card"

    move-object/from16 v30, v0

    move-object/from16 v31, v2

    const/4 v0, 0x0

    const/4 v2, 0x4

    invoke-static {v15, v1, v0, v2, v0}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v1

    sget-object v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->HEIGHT_PICKER:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v0}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v0

    invoke-virtual {v5}, Ldd1/j;->x0()Lc93/m;

    move-result-object v2

    const-string v15, "Height Picker"

    invoke-static {v15, v0, v2}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->HORIZONTAL_STAT:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->y1()Lc93/m;

    move-result-object v15

    move-object/from16 v32, v0

    const-string v0, "Horizontal Stat"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ICON_TOGGLE_GROUP:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->H0()Lc93/m;

    move-result-object v15

    move-object/from16 v33, v0

    const-string v0, "Icon Toggle Group"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->IMAGE_URL:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->b1()Lc93/m;

    move-result-object v15

    move-object/from16 v34, v0

    const-string v0, "Image Url"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->LINE_PLOT_LEGEND:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->D0()Lc93/m;

    move-result-object v15

    move-object/from16 v35, v0

    const-string v0, "Line Plot Legend"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->MAGNITUDE_DETAIL_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->r1()Lc93/m;

    move-result-object v15

    move-object/from16 v36, v0

    const-string v0, "Magnitude Detail Card"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->MEDIA_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->M0()Lc93/m;

    move-result-object v15

    move-object/from16 v37, v0

    const-string v0, "Media Card"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->MENSTRUAL_CYCLE_INSIGHTS_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->u1()Lc93/m;

    move-result-object v15

    move-object/from16 v38, v0

    const-string v0, "Menstrual Cycle Insights Card"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->MEMBERSHIP_COMPARISON_TABLE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->k1()Lc93/m;

    move-result-object v15

    move-object/from16 v39, v0

    const-string v0, "Membership Comparison Table"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->METRIC_EDUCATION:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->U0()Lc93/m;

    move-result-object v15

    move-object/from16 v40, v0

    const-string v0, "Metric Education"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->MINI_ARCH_PROGRESS_MODAL:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->d1()Lc93/m;

    move-result-object v15

    move-object/from16 v41, v0

    const-string v0, "Mini Architecture Progress Modal"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->MINI_CALLOUT:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->z0()Lc93/m;

    move-result-object v15

    move-object/from16 v42, v0

    const-string v0, "Mini Callout"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->NOTIFICATION_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->w1()Lc93/m;

    move-result-object v15

    move-object/from16 v43, v0

    const-string v0, "Notification Card"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->NUMBERED_LIST:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->Y0()Lc93/m;

    move-result-object v15

    move-object/from16 v44, v0

    const-string v0, "Numbered List"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->NUMERIC_SCALE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->a1()Lc93/m;

    move-result-object v15

    move-object/from16 v45, v0

    const-string v0, "Numeric Scale"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->NUMERIC_STEPPER:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->E0()Lc93/m;

    move-result-object v15

    move-object/from16 v46, v0

    const-string v0, "Numeric Stepper"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->NUMBER_PICKER:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->q1()Lc93/m;

    move-result-object v15

    move-object/from16 v47, v0

    const-string v0, "Number Picker"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->PROGRESS_BREAKDOWN_BAR:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->N0()Lc93/m;

    move-result-object v15

    move-object/from16 v48, v0

    const-string v0, "Progress Breakdown Bar"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->PRICING_SELECTION_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->V0()Lc93/m;

    move-result-object v15

    move-object/from16 v49, v0

    const-string v0, "Pricing Selection Card"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->PROGRESS_MODAL:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->j1()Lc93/m;

    move-result-object v15

    move-object/from16 v50, v0

    const-string v0, "Progress Modal"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->REPLAY:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->W0()Lc93/m;

    move-result-object v15

    move-object/from16 v51, v0

    const-string v0, "Replay"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SEARCH_BAR:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    const-string v15, "Search Bar"

    move-object/from16 v52, v0

    move-object/from16 v53, v1

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {v15, v2, v0, v1, v0}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v2

    sget-object v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SCORE_GAUGE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v0}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v0

    invoke-virtual {v5}, Ldd1/j;->B0()Lc93/m;

    move-result-object v1

    const-string v15, "Score Gauge"

    invoke-static {v15, v0, v1}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SECTION_HEADER:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    invoke-virtual {v5}, Ldd1/j;->g1()Lc93/m;

    move-result-object v15

    move-object/from16 v54, v0

    const-string v0, "Section Header"

    invoke-static {v0, v1, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SEGMENTED_CONTROL:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    invoke-virtual {v5}, Ldd1/j;->Z0()Lc93/m;

    move-result-object v15

    move-object/from16 v55, v0

    const-string v0, "Segmented Control"

    invoke-static {v0, v1, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SEGMENTED_CONTENT:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    invoke-virtual {v5}, Ldd1/j;->B1()Lc93/m;

    move-result-object v15

    move-object/from16 v56, v0

    const-string v0, "Segmented Content"

    invoke-static {v0, v1, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SLEEP_PLANNER_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    const-string v15, "Sleep Planner Card"

    move-object/from16 v57, v0

    move-object/from16 v58, v2

    const/4 v0, 0x0

    const/4 v2, 0x4

    invoke-static {v15, v1, v0, v2, v0}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v1

    sget-object v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SPINNER_SELECTOR:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v0}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v0

    invoke-virtual {v5}, Ldd1/j;->p1()Lc93/m;

    move-result-object v2

    const-string v15, "Spinner Selector"

    invoke-static {v15, v0, v2}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SPLIT_CONTAINER_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->O0()Lc93/m;

    move-result-object v15

    move-object/from16 v59, v0

    const-string v0, "Split Container Card"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->TAB:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->A0()Lc93/m;

    move-result-object v15

    move-object/from16 v60, v0

    const-string v0, "Tab"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->TESTIMONIALS:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->i1()Lc93/m;

    move-result-object v15

    move-object/from16 v61, v0

    const-string v0, "Testimonials"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->TEXT_INPUT:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->X0()Lc93/m;

    move-result-object v15

    move-object/from16 v62, v0

    const-string v0, "Text Input"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;->MOLECULES_TILES:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    invoke-static {v2}, Ldd1/r;->f(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;

    move-result-object v2

    const-string v15, "Tiles"

    move-object/from16 v63, v0

    move-object/from16 v64, v1

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {v15, v2, v0, v1, v0}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v2

    sget-object v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->TILE_LABEL_GROUP:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v0}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v0

    invoke-virtual {v5}, Ldd1/j;->R0()Lc93/m;

    move-result-object v1

    const-string v15, "Tile Label"

    invoke-static {v15, v0, v1}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->TIME_PICKER:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    invoke-virtual {v5}, Ldd1/j;->e1()Lc93/m;

    move-result-object v15

    move-object/from16 v65, v0

    const-string v0, "Time Picker"

    invoke-static {v0, v1, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->TIMED_CONTENT:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    const-string v15, "Timed Content"

    move-object/from16 v66, v0

    move-object/from16 v67, v2

    const/4 v0, 0x0

    const/4 v2, 0x4

    invoke-static {v15, v1, v0, v2, v0}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v1

    sget-object v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->VERTICAL_STAT:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v0}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v0

    invoke-virtual {v5}, Ldd1/j;->z1()Lc93/m;

    move-result-object v2

    const-string v15, "Vertical Stat"

    invoke-static {v15, v0, v2}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->WEIGHT_PICKER:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->G0()Lc93/m;

    move-result-object v15

    move-object/from16 v68, v0

    const-string v0, "Weight Picker"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->WEIGHTLIFTING_SET:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->n1()Lc93/m;

    move-result-object v15

    move-object/from16 v69, v0

    const-string v0, "Weightlifting Set"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->IMPACT_ACTIVITY_PROGRESS_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->P0()Lc93/m;

    move-result-object v15

    move-object/from16 v70, v0

    const-string v0, "Recovery Activity Empty State"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->WHOOP_COACH_VOW:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->I0()Lc93/m;

    move-result-object v15

    move-object/from16 v71, v0

    const-string v0, "WHOOP Coach Vow"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SWIPE_LAYOUT:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v5}, Ldd1/j;->h1()Lc93/m;

    move-result-object v5

    const-string v15, "Swipe Layout"

    invoke-static {v15, v2, v5}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v2

    sget-object v5, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ZONE_BAR:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v5}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v5

    const-string v15, "Zone Bar"

    move-object/from16 v72, v0

    move-object/from16 v16, v1

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {v15, v5, v0, v1, v0}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v0

    const/16 v5, 0x46

    new-array v5, v5, [Lm91/u;

    const/4 v15, 0x0

    aput-object v17, v5, v15

    const/4 v15, 0x1

    aput-object v21, v5, v15

    const/4 v15, 0x2

    aput-object v4, v5, v15

    const/4 v4, 0x3

    aput-object v6, v5, v4

    aput-object v7, v5, v1

    const/4 v1, 0x5

    aput-object v8, v5, v1

    const/4 v1, 0x6

    aput-object v9, v5, v1

    const/4 v1, 0x7

    aput-object v10, v5, v1

    const/16 v1, 0x8

    aput-object v11, v5, v1

    const/16 v1, 0x9

    aput-object v12, v5, v1

    const/16 v1, 0xa

    aput-object v13, v5, v1

    const/16 v1, 0xb

    aput-object v26, v5, v1

    const/16 v1, 0xc

    aput-object v3, v5, v1

    const/16 v1, 0xd

    aput-object v18, v5, v1

    const/16 v1, 0xe

    aput-object v19, v5, v1

    const/16 v1, 0xf

    aput-object v20, v5, v1

    const/16 v1, 0x10

    aput-object v14, v5, v1

    const/16 v1, 0x11

    aput-object v22, v5, v1

    const/16 v1, 0x12

    aput-object v23, v5, v1

    const/16 v1, 0x13

    aput-object v24, v5, v1

    const/16 v1, 0x14

    aput-object v25, v5, v1

    const/16 v1, 0x15

    aput-object v28, v5, v1

    const/16 v1, 0x16

    aput-object v27, v5, v1

    const/16 v1, 0x17

    aput-object v29, v5, v1

    const/16 v1, 0x18

    aput-object v31, v5, v1

    const/16 v1, 0x19

    aput-object v30, v5, v1

    const/16 v1, 0x1a

    aput-object v53, v5, v1

    const/16 v1, 0x1b

    aput-object v32, v5, v1

    const/16 v1, 0x1c

    aput-object v33, v5, v1

    const/16 v1, 0x1d

    aput-object v34, v5, v1

    const/16 v1, 0x1e

    aput-object v35, v5, v1

    const/16 v1, 0x1f

    aput-object v36, v5, v1

    const/16 v1, 0x20

    aput-object v37, v5, v1

    const/16 v1, 0x21

    aput-object v38, v5, v1

    const/16 v1, 0x22

    aput-object v39, v5, v1

    const/16 v1, 0x23

    aput-object v40, v5, v1

    const/16 v1, 0x24

    aput-object v41, v5, v1

    const/16 v1, 0x25

    aput-object v42, v5, v1

    const/16 v1, 0x26

    aput-object v43, v5, v1

    const/16 v1, 0x27

    aput-object v44, v5, v1

    const/16 v1, 0x28

    aput-object v45, v5, v1

    const/16 v1, 0x29

    aput-object v46, v5, v1

    const/16 v1, 0x2a

    aput-object v47, v5, v1

    const/16 v1, 0x2b

    aput-object v48, v5, v1

    const/16 v1, 0x2c

    aput-object v49, v5, v1

    const/16 v1, 0x2d

    aput-object v50, v5, v1

    const/16 v1, 0x2e

    aput-object v51, v5, v1

    const/16 v1, 0x2f

    aput-object v52, v5, v1

    const/16 v1, 0x30

    aput-object v58, v5, v1

    const/16 v1, 0x31

    aput-object v54, v5, v1

    const/16 v1, 0x32

    aput-object v55, v5, v1

    const/16 v1, 0x33

    aput-object v56, v5, v1

    const/16 v1, 0x34

    aput-object v57, v5, v1

    const/16 v1, 0x35

    aput-object v64, v5, v1

    const/16 v1, 0x36

    aput-object v59, v5, v1

    const/16 v1, 0x37

    aput-object v60, v5, v1

    const/16 v1, 0x38

    aput-object v61, v5, v1

    const/16 v1, 0x39

    aput-object v62, v5, v1

    const/16 v1, 0x3a

    aput-object v63, v5, v1

    const/16 v1, 0x3b

    aput-object v67, v5, v1

    const/16 v1, 0x3c

    aput-object v65, v5, v1

    const/16 v1, 0x3d

    aput-object v66, v5, v1

    const/16 v1, 0x3e

    aput-object v16, v5, v1

    const/16 v1, 0x3f

    aput-object v68, v5, v1

    const/16 v1, 0x40

    aput-object v69, v5, v1

    const/16 v1, 0x41

    aput-object v70, v5, v1

    const/16 v1, 0x42

    aput-object v71, v5, v1

    const/16 v1, 0x43

    aput-object v72, v5, v1

    const/16 v1, 0x44

    aput-object v2, v5, v1

    const/16 v1, 0x45

    aput-object v0, v5, v1

    invoke-static {v5}, Ln91/b;->b([Lm91/u;)Ln91/a;

    move-result-object v0

    invoke-interface {v0}, Ln91/a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
