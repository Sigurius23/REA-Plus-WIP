.class public abstract Ldd1/t;
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
    .locals 53
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ANCHOR_SELECTOR:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v0}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v0

    sget-object v1, Ldd1/l;->a:Ldd1/l;

    invoke-virtual {v1}, Ldd1/l;->Y()Lc93/m;

    move-result-object v2

    const-string v3, "Anchor Selector"

    invoke-static {v3, v0, v2}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->BIOMARKER_PIE_CHART_SECTION:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v1}, Ldd1/l;->p0()Lc93/m;

    move-result-object v3

    const-string v4, "Biomarker Pie Chart Section"

    invoke-static {v4, v2, v3}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v2

    sget-object v3, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->BLOOD_PRESSURE_IMPACTS:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v3}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v3

    const-string v4, "Blood Pressure Impacts"

    const/4 v5, 0x0

    const/4 v6, 0x4

    invoke-static {v4, v3, v5, v6, v5}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v3

    sget-object v4, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->BOTTOM_SHEET:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v4}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v4

    const-string v7, "Bottom Sheet"

    invoke-static {v7, v4, v5, v6, v5}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v4

    sget-object v7, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->BOTTOM_SHEET_M3:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v7}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v7

    const-string v8, "Bottom Sheet M3"

    invoke-static {v8, v7, v5, v6, v5}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v7

    sget-object v8, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->BOTTOM_SHEET_NO_GESTURE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v8}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v8

    const-string v9, "Bottom Sheet No Gesture"

    invoke-static {v9, v8, v5, v6, v5}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v8

    sget-object v9, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->COACHING_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v9}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v9

    invoke-virtual {v1}, Ldd1/l;->F0()Lc93/m;

    move-result-object v10

    const-string v11, "Coaching Card"

    invoke-static {v11, v9, v10}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v9

    sget-object v10, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->COLUMN:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v10}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v10

    const-string v11, "Column"

    invoke-static {v11, v10, v5, v6, v5}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v10

    sget-object v11, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->COMPACT_TREND:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v11}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v11

    invoke-virtual {v1}, Ldd1/l;->z0()Lc93/m;

    move-result-object v12

    const-string v13, "Compact Trend"

    invoke-static {v13, v11, v12}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v11

    sget-object v12, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->COLLAPSABLE_HEADER_AND_ANCHOR_SELECT:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v12}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v12

    invoke-virtual {v1}, Ldd1/l;->d0()Lc93/m;

    move-result-object v13

    const-string v14, "Collapsable Header + AnchorSelect (Scroll Demo)"

    invoke-static {v14, v12, v13}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v12

    sget-object v13, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->CONTRIBUTOR_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v13}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v13

    invoke-virtual {v1}, Ldd1/l;->y0()Lc93/m;

    move-result-object v14

    const-string v15, "Contributor Tile"

    invoke-static {v15, v13, v14}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v13

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->EXPANDABLE_CONTENT:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/l;->e0()Lc93/m;

    move-result-object v15

    const-string v5, "Expandable Content"

    invoke-static {v5, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v5

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->EXPANDABLE_LIST:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/l;->t0()Lc93/m;

    move-result-object v15

    const-string v6, "Expanding List"

    invoke-static {v6, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v6

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->GRAPHING_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/l;->j0()Lc93/m;

    move-result-object v15

    move-object/from16 v18, v0

    const-string v0, "Graphing Card"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->CHART_THEME:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/l;->n0()Lc93/m;

    move-result-object v15

    move-object/from16 v19, v0

    const-string v0, "Chart Theme"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->GRAPH_PLANE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/l;->W()Lc93/m;

    move-result-object v15

    move-object/from16 v20, v0

    const-string v0, "Graph Plane"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->GOAL_PROGRESS_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/l;->B0()Lc93/m;

    move-result-object v15

    move-object/from16 v21, v0

    const-string v0, "Goal Progress Card"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->HEART_RATE_MONITOR:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/l;->b0()Lc93/m;

    move-result-object v15

    move-object/from16 v22, v0

    const-string v0, "Heart Rate Monitor"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->HERO_IMAGE_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/l;->g0()Lc93/m;

    move-result-object v15

    move-object/from16 v23, v0

    const-string v0, "Hero Image Card"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->HORIZONTAL_SCROLL_CONTAINER:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/l;->u0()Lc93/m;

    move-result-object v15

    move-object/from16 v24, v0

    const-string v0, "Horizontal Scroll Container"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->IMAGE_CARD_PICKER:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/l;->v0()Lc93/m;

    move-result-object v15

    move-object/from16 v25, v0

    const-string v0, " Image Card Picker"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ITEMS_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    const-string v15, "Items Card"

    move-object/from16 v27, v1

    const/4 v1, 0x4

    move-object/from16 v26, v0

    const/4 v0, 0x0

    invoke-static {v15, v14, v0, v1, v0}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v14

    sget-object v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->JOURNAL_QUESTION:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v0}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v0

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->f0()Lc93/m;

    move-result-object v1

    const-string v15, "Journal Questions"

    invoke-static {v15, v0, v1}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->KEY_METRIC_CAROUSEL:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->s0()Lc93/m;

    move-result-object v15

    move-object/from16 v28, v0

    const-string v0, "Key Metric Carousel"

    invoke-static {v0, v1, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->LINE_GRAPH:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->k0()Lc93/m;

    move-result-object v15

    move-object/from16 v29, v0

    const-string v0, "Line Graph"

    invoke-static {v0, v1, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->LIVE_HEART_RATE_MONITOR:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->G0()Lc93/m;

    move-result-object v15

    move-object/from16 v30, v0

    const-string v0, "Live Heart Rate Monitor"

    invoke-static {v0, v1, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->LOTTIE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->X()Lc93/m;

    move-result-object v15

    move-object/from16 v31, v0

    const-string v0, "Lottie"

    invoke-static {v0, v1, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->MENU_ITEM:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->A0()Lc93/m;

    move-result-object v15

    move-object/from16 v32, v0

    const-string v0, "Menu Item"

    invoke-static {v0, v1, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->METER:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->c0()Lc93/m;

    move-result-object v15

    move-object/from16 v33, v0

    const-string v0, "Meter"

    invoke-static {v0, v1, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->NAVIGATION_BAR:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->m0()Lc93/m;

    move-result-object v15

    move-object/from16 v34, v0

    const-string v0, "Navigation Bar"

    invoke-static {v0, v1, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->OVERVIEW_GAUGE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->Z()Lc93/m;

    move-result-object v15

    move-object/from16 v35, v0

    const-string v0, "Overview Gauge"

    invoke-static {v0, v1, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->PACE_OF_AGING_METER:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->o0()Lc93/m;

    move-result-object v15

    move-object/from16 v36, v0

    const-string v0, "Pace of Aging Meter"

    invoke-static {v0, v1, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->PIE_CHART_DIAL:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->x0()Lc93/m;

    move-result-object v15

    move-object/from16 v37, v0

    const-string v0, "Pie Chart Dial"

    invoke-static {v0, v1, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->PILLAR_GAUGE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->h0()Lc93/m;

    move-result-object v15

    move-object/from16 v38, v0

    const-string v0, "Pillar Gauge"

    invoke-static {v0, v1, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->PERKS_LIST:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->r0()Lc93/m;

    move-result-object v15

    move-object/from16 v39, v0

    const-string v0, "Perks List"

    invoke-static {v0, v1, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->RECOMMENDATION_TILE_GROUP:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->l0()Lc93/m;

    move-result-object v15

    move-object/from16 v40, v0

    const-string v0, "Recommendation Tile Group"

    invoke-static {v0, v1, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SCROLLABLE_LINE_GRAPH:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v1}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v1

    const-string v15, "Scrollable Line Graph"

    move-object/from16 v41, v0

    move-object/from16 v42, v2

    const/4 v0, 0x0

    const/4 v2, 0x4

    invoke-static {v15, v1, v0, v2, v0}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v1

    sget-object v15, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SHARE_SHEET:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v15}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v15

    move-object/from16 v43, v1

    const-string v1, "Share Sheet"

    invoke-static {v1, v15, v0, v2, v0}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v1

    sget-object v15, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SPLIT_COLUMN_SCROLLABLE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v15}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v15

    move-object/from16 v44, v1

    const-string v1, "Split Column - Scrollable"

    invoke-static {v1, v15, v0, v2, v0}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v1

    sget-object v15, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SPLIT_COLUMN_SPACE_BETWEEN:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v15}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v15

    move-object/from16 v45, v1

    const-string v1, "Split Column - Space Between"

    invoke-static {v1, v15, v0, v2, v0}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v1

    sget-object v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->STRESS_GRAPHING_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v0}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v0

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->C0()Lc93/m;

    move-result-object v2

    const-string v15, "Stress Graphing Card"

    invoke-static {v15, v0, v2}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->TAG_SELECTOR:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->a0()Lc93/m;

    move-result-object v15

    move-object/from16 v46, v0

    const-string v0, "Tag Selector"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->TILE_CAROUSEL:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->D0()Lc93/m;

    move-result-object v15

    move-object/from16 v47, v0

    const-string v0, "Tile Carousel"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->TREND_PLOT_GRAPH:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->w0()Lc93/m;

    move-result-object v15

    move-object/from16 v48, v0

    const-string v0, "Trend Plot Graph"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->UPSELL_CARDS:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->i0()Lc93/m;

    move-result-object v15

    move-object/from16 v49, v0

    const-string v0, "Upsell Cards"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->VERTICAL_BAR_GRAPH:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->q0()Lc93/m;

    move-result-object v15

    move-object/from16 v50, v0

    const-string v0, "Vertical Bar Graph"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->WEIGHTLIFTING_TIMER:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->V()Lc93/m;

    move-result-object v15

    move-object/from16 v51, v0

    const-string v0, "Weightlifting Timer"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->WHOOP_PRO_BANNER:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual/range {v27 .. v27}, Ldd1/l;->E0()Lc93/m;

    move-result-object v15

    move-object/from16 v27, v0

    const-string v0, "Whoop Pro Banner"

    invoke-static {v0, v2, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->WHOOP_ROW:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    const-string v15, "Whoop Row"

    move-object/from16 v52, v0

    move-object/from16 v16, v1

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {v15, v2, v0, v1, v0}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v2

    sget-object v15, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ZOOMABLE_GRAPH:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v15}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v15

    move-object/from16 v17, v2

    const-string v2, "Zoomable Graph"

    invoke-static {v2, v15, v0, v1, v0}, Ldd1/r;->b(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;ILjava/lang/Object;)Led1/b;

    move-result-object v0

    const/16 v2, 0x32

    new-array v2, v2, [Lm91/u;

    const/4 v15, 0x0

    aput-object v18, v2, v15

    const/4 v15, 0x1

    aput-object v42, v2, v15

    const/4 v15, 0x2

    aput-object v3, v2, v15

    const/4 v3, 0x3

    aput-object v4, v2, v3

    aput-object v7, v2, v1

    const/4 v1, 0x5

    aput-object v8, v2, v1

    const/4 v1, 0x6

    aput-object v9, v2, v1

    const/4 v1, 0x7

    aput-object v10, v2, v1

    const/16 v1, 0x8

    aput-object v11, v2, v1

    const/16 v1, 0x9

    aput-object v12, v2, v1

    const/16 v1, 0xa

    aput-object v13, v2, v1

    const/16 v1, 0xb

    aput-object v5, v2, v1

    const/16 v1, 0xc

    aput-object v6, v2, v1

    const/16 v1, 0xd

    aput-object v19, v2, v1

    const/16 v1, 0xe

    aput-object v20, v2, v1

    const/16 v1, 0xf

    aput-object v21, v2, v1

    const/16 v1, 0x10

    aput-object v22, v2, v1

    const/16 v1, 0x11

    aput-object v23, v2, v1

    const/16 v1, 0x12

    aput-object v24, v2, v1

    const/16 v1, 0x13

    aput-object v25, v2, v1

    const/16 v1, 0x14

    aput-object v26, v2, v1

    const/16 v1, 0x15

    aput-object v14, v2, v1

    const/16 v1, 0x16

    aput-object v28, v2, v1

    const/16 v1, 0x17

    aput-object v29, v2, v1

    const/16 v1, 0x18

    aput-object v30, v2, v1

    const/16 v1, 0x19

    aput-object v31, v2, v1

    const/16 v1, 0x1a

    aput-object v32, v2, v1

    const/16 v1, 0x1b

    aput-object v33, v2, v1

    const/16 v1, 0x1c

    aput-object v34, v2, v1

    const/16 v1, 0x1d

    aput-object v35, v2, v1

    const/16 v1, 0x1e

    aput-object v36, v2, v1

    const/16 v1, 0x1f

    aput-object v37, v2, v1

    const/16 v1, 0x20

    aput-object v38, v2, v1

    const/16 v1, 0x21

    aput-object v39, v2, v1

    const/16 v1, 0x22

    aput-object v40, v2, v1

    const/16 v1, 0x23

    aput-object v41, v2, v1

    const/16 v1, 0x24

    aput-object v43, v2, v1

    const/16 v1, 0x25

    aput-object v44, v2, v1

    const/16 v1, 0x26

    aput-object v45, v2, v1

    const/16 v1, 0x27

    aput-object v16, v2, v1

    const/16 v1, 0x28

    aput-object v46, v2, v1

    const/16 v1, 0x29

    aput-object v47, v2, v1

    const/16 v1, 0x2a

    aput-object v48, v2, v1

    const/16 v1, 0x2b

    aput-object v49, v2, v1

    const/16 v1, 0x2c

    aput-object v50, v2, v1

    const/16 v1, 0x2d

    aput-object v51, v2, v1

    const/16 v1, 0x2e

    aput-object v27, v2, v1

    const/16 v1, 0x2f

    aput-object v52, v2, v1

    const/16 v1, 0x30

    aput-object v17, v2, v1

    const/16 v1, 0x31

    aput-object v0, v2, v1

    invoke-static {v2}, Ln91/b;->b([Lm91/u;)Ln91/a;

    move-result-object v0

    invoke-interface {v0}, Ln91/a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
