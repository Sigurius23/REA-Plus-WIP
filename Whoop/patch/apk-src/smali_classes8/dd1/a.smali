.class public abstract Ldd1/a;
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
    .locals 50
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ACTIVITY_BUTTON:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v0}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v0

    sget-object v1, Ldd1/e;->a:Ldd1/e;

    invoke-virtual {v1}, Ldd1/e;->o0()Lc93/m;

    move-result-object v2

    const-string v3, "Activity Button"

    invoke-static {v3, v0, v2}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ACTIVITY_PILL:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v1}, Ldd1/e;->u0()Lc93/m;

    move-result-object v3

    const-string v4, "Activity Pill"

    invoke-static {v4, v2, v3}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v2

    sget-object v3, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ARROW_STAT:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v3}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v3

    invoke-virtual {v1}, Ldd1/e;->H0()Lc93/m;

    move-result-object v4

    const-string v5, "Arrow Stat"

    invoke-static {v5, v3, v4}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v3

    sget-object v4, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ACTIVITY_TIME_RANGE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v4}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v4

    invoke-virtual {v1}, Ldd1/e;->q0()Lc93/m;

    move-result-object v5

    const-string v6, "Activity Time Range"

    invoke-static {v6, v4, v5}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v4

    sget-object v5, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->BAR_GRAPH_AVERAGE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v5}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v5

    invoke-virtual {v1}, Ldd1/e;->x0()Lc93/m;

    move-result-object v6

    const-string v7, "Bar Graph Average"

    invoke-static {v7, v5, v6}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v5

    sget-object v6, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->BAR_GRAPH_FILL:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v6}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v6

    invoke-virtual {v1}, Ldd1/e;->d1()Lc93/m;

    move-result-object v7

    const-string v8, "Bar Graph Fill"

    invoke-static {v8, v6, v7}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v6

    sget-object v7, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->BAR_GRAPH_TRACK:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v7}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v7

    invoke-virtual {v1}, Ldd1/e;->S0()Lc93/m;

    move-result-object v8

    const-string v9, "Bar Graph Track"

    invoke-static {v9, v7, v8}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v7

    sget-object v8, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;->ATOM_BUTTONS:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    invoke-static {v8}, Ldd1/r;->f(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;

    move-result-object v8

    invoke-virtual {v1}, Ldd1/e;->C0()Lc93/m;

    move-result-object v9

    const-string v10, "Buttons"

    invoke-static {v10, v8, v9}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v8

    sget-object v9, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SELECTABLE_CELL:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v9}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v9

    invoke-virtual {v1}, Ldd1/e;->Y0()Lc93/m;

    move-result-object v10

    const-string v11, "Selectable Cell"

    invoke-static {v11, v9, v10}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v9

    sget-object v10, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SELECTABLE_CELL_LIST:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v10}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v10

    invoke-virtual {v1}, Ldd1/e;->M0()Lc93/m;

    move-result-object v11

    const-string v12, "Selectable Cell List"

    invoke-static {v12, v10, v11}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v10

    sget-object v11, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->CHECKBOX:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v11}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v11

    invoke-virtual {v1}, Ldd1/e;->G0()Lc93/m;

    move-result-object v12

    const-string v13, "Checkbox"

    invoke-static {v13, v11, v12}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v11

    sget-object v12, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->DIVIDER:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v12}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v12

    invoke-virtual {v1}, Ldd1/e;->r0()Lc93/m;

    move-result-object v13

    const-string v14, "Divider"

    invoke-static {v14, v12, v13}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v12

    sget-object v13, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->EMOJI:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v13}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v13

    invoke-virtual {v1}, Ldd1/e;->y0()Lc93/m;

    move-result-object v14

    const-string v15, "Emoji"

    invoke-static {v15, v13, v14}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v13

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->FAB:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->c1()Lc93/m;

    move-result-object v15

    move-object/from16 v16, v0

    const-string v0, "FAB"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->FLOW_ROW:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->R0()Lc93/m;

    move-result-object v15

    move-object/from16 v17, v0

    const-string v0, "FLOW ROW"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->FEATURES_LIST:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->D0()Lc93/m;

    move-result-object v15

    move-object/from16 v18, v0

    const-string v0, "FEATURES_LIST"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->FEEDBACK_SURVEY:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->X0()Lc93/m;

    move-result-object v15

    move-object/from16 v19, v0

    const-string v0, "Feedback Survey"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->GAUGE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->L0()Lc93/m;

    move-result-object v15

    move-object/from16 v20, v0

    const-string v0, "Gauge"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->GRAPH_AXES:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->m0()Lc93/m;

    move-result-object v15

    move-object/from16 v21, v0

    const-string v0, "Graph Axes"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->GRAPH_DATA_SCRUBBER:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->O0()Lc93/m;

    move-result-object v15

    move-object/from16 v22, v0

    const-string v0, "Graph Data Scrubber"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->GRAPH_LINE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->v0()Lc93/m;

    move-result-object v15

    move-object/from16 v23, v0

    const-string v0, "Graph Line"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->GRAPH_SELECTION_INDICATOR:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->f1()Lc93/m;

    move-result-object v15

    move-object/from16 v24, v0

    const-string v0, "Graph Selection Indicator"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->HOME_CALENDAR_DATE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->t0()Lc93/m;

    move-result-object v15

    move-object/from16 v25, v0

    const-string v0, "Home Calendar Date"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->HR_ZONE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->A0()Lc93/m;

    move-result-object v15

    move-object/from16 v26, v0

    const-string v0, "HR Zone"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->HR_ZONE_ROW:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->a1()Lc93/m;

    move-result-object v15

    move-object/from16 v27, v0

    const-string v0, "HR Zone Row"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->HR_ZONE_VIEW:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->P0()Lc93/m;

    move-result-object v15

    move-object/from16 v28, v0

    const-string v0, "HR Zone View"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;->ATOM_ICONS:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    invoke-static {v14}, Ldd1/r;->f(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->F0()Lc93/m;

    move-result-object v15

    move-object/from16 v29, v0

    const-string v0, "Icons"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->MARKDOWN:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->V0()Lc93/m;

    move-result-object v15

    move-object/from16 v30, v0

    const-string v0, "Markdown"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->OPTIMAL_RANGE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->J0()Lc93/m;

    move-result-object v15

    move-object/from16 v31, v0

    const-string v0, "Optimal Range"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->PAGINATION_CONTROL:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->n0()Lc93/m;

    move-result-object v15

    move-object/from16 v32, v0

    const-string v0, "Pagination Control"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;->ATOM_PROGRESS_BAR:Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;

    invoke-static {v14}, Ldd1/r;->f(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->p0()Lc93/m;

    move-result-object v15

    move-object/from16 v33, v0

    const-string v0, "Progress Bar"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->RATING_PICKER:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->w0()Lc93/m;

    move-result-object v15

    move-object/from16 v34, v0

    const-string v0, "Rating Picker"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SEARCH_FIELD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->e1()Lc93/m;

    move-result-object v15

    move-object/from16 v35, v0

    const-string v0, "Search Field"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SEGMENTED_ITEM:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->T0()Lc93/m;

    move-result-object v15

    move-object/from16 v36, v0

    const-string v0, "Segmented Items"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SLEEP_BRACKET:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->B0()Lc93/m;

    move-result-object v15

    move-object/from16 v37, v0

    const-string v0, "Sleep Brackets"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SLEEP_INFORMATION:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->Z0()Lc93/m;

    move-result-object v15

    move-object/from16 v38, v0

    const-string v0, "Sleep Information"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SLIDER:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->N0()Lc93/m;

    move-result-object v15

    move-object/from16 v39, v0

    const-string v0, "Slider"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;->ATOM_SWITCH:Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;

    invoke-static {v14}, Ldd1/r;->d(Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->l0()Lc93/m;

    move-result-object v15

    move-object/from16 v40, v0

    const-string v0, "Switch"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->TAG:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->U0()Lc93/m;

    move-result-object v15

    move-object/from16 v41, v0

    const-string v0, "Tag"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->TEXT_AREA:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->I0()Lc93/m;

    move-result-object v15

    move-object/from16 v42, v0

    const-string v0, "Text Area"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->TEXT_FIELD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->g1()Lc93/m;

    move-result-object v15

    move-object/from16 v43, v0

    const-string v0, "Text Field"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->NUMERIC_TEXT_FIELD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->s0()Lc93/m;

    move-result-object v15

    move-object/from16 v44, v0

    const-string v0, "Numeric Text Field"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->TILE_BACKGROUND:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->z0()Lc93/m;

    move-result-object v15

    move-object/from16 v45, v0

    const-string v0, "Tile Background"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->TIME_MARKER:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->b1()Lc93/m;

    move-result-object v15

    move-object/from16 v46, v0

    const-string v0, "Time Marker"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->TOOLTIP:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->Q0()Lc93/m;

    move-result-object v15

    move-object/from16 v47, v0

    const-string v0, "Tooltip"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->TREND:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->E0()Lc93/m;

    move-result-object v15

    move-object/from16 v48, v0

    const-string v0, "Trend"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->URL_IMAGE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->W0()Lc93/m;

    move-result-object v15

    move-object/from16 v49, v0

    const-string v0, "URL Image"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->VERTICAL_BAR_GRAPH_FILL:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/e;->K0()Lc93/m;

    move-result-object v1

    const-string v15, "Vertical Bar Graph Fill"

    invoke-static {v15, v14, v1}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v1

    const/16 v14, 0x30

    new-array v14, v14, [Lm91/u;

    const/4 v15, 0x0

    aput-object v16, v14, v15

    const/4 v15, 0x1

    aput-object v2, v14, v15

    const/4 v2, 0x2

    aput-object v3, v14, v2

    const/4 v2, 0x3

    aput-object v4, v14, v2

    const/4 v2, 0x4

    aput-object v5, v14, v2

    const/4 v2, 0x5

    aput-object v6, v14, v2

    const/4 v2, 0x6

    aput-object v7, v14, v2

    const/4 v2, 0x7

    aput-object v8, v14, v2

    const/16 v2, 0x8

    aput-object v9, v14, v2

    const/16 v2, 0x9

    aput-object v10, v14, v2

    const/16 v2, 0xa

    aput-object v11, v14, v2

    const/16 v2, 0xb

    aput-object v12, v14, v2

    const/16 v2, 0xc

    aput-object v13, v14, v2

    const/16 v2, 0xd

    aput-object v17, v14, v2

    const/16 v2, 0xe

    aput-object v18, v14, v2

    const/16 v2, 0xf

    aput-object v19, v14, v2

    const/16 v2, 0x10

    aput-object v20, v14, v2

    const/16 v2, 0x11

    aput-object v21, v14, v2

    const/16 v2, 0x12

    aput-object v22, v14, v2

    const/16 v2, 0x13

    aput-object v23, v14, v2

    const/16 v2, 0x14

    aput-object v24, v14, v2

    const/16 v2, 0x15

    aput-object v25, v14, v2

    const/16 v2, 0x16

    aput-object v26, v14, v2

    const/16 v2, 0x17

    aput-object v27, v14, v2

    const/16 v2, 0x18

    aput-object v28, v14, v2

    const/16 v2, 0x19

    aput-object v29, v14, v2

    const/16 v2, 0x1a

    aput-object v30, v14, v2

    const/16 v2, 0x1b

    aput-object v31, v14, v2

    const/16 v2, 0x1c

    aput-object v32, v14, v2

    const/16 v2, 0x1d

    aput-object v33, v14, v2

    const/16 v2, 0x1e

    aput-object v34, v14, v2

    const/16 v2, 0x1f

    aput-object v35, v14, v2

    const/16 v2, 0x20

    aput-object v36, v14, v2

    const/16 v2, 0x21

    aput-object v37, v14, v2

    const/16 v2, 0x22

    aput-object v38, v14, v2

    const/16 v2, 0x23

    aput-object v39, v14, v2

    const/16 v2, 0x24

    aput-object v40, v14, v2

    const/16 v2, 0x25

    aput-object v41, v14, v2

    const/16 v2, 0x26

    aput-object v42, v14, v2

    const/16 v2, 0x27

    aput-object v43, v14, v2

    const/16 v2, 0x28

    aput-object v44, v14, v2

    const/16 v2, 0x29

    aput-object v45, v14, v2

    const/16 v2, 0x2a

    aput-object v46, v14, v2

    const/16 v2, 0x2b

    aput-object v47, v14, v2

    const/16 v2, 0x2c

    aput-object v48, v14, v2

    const/16 v2, 0x2d

    aput-object v49, v14, v2

    const/16 v2, 0x2e

    aput-object v0, v14, v2

    const/16 v0, 0x2f

    aput-object v1, v14, v0

    invoke-static {v14}, Ln91/b;->b([Lm91/u;)Ln91/a;

    move-result-object v0

    invoke-interface {v0}, Ln91/a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
