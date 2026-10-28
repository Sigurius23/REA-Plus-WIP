.class public abstract Ldd1/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
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
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ACCORDION_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v0}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v0

    sget-object v1, Ldd1/n;->a:Ldd1/n;

    invoke-virtual {v1}, Ldd1/n;->j0()Lc93/m;

    move-result-object v2

    const-string v3, "Accordion Tile"

    invoke-static {v3, v0, v2}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ACTIVITY_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v2}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v2

    invoke-virtual {v1}, Ldd1/n;->i0()Lc93/m;

    move-result-object v3

    const-string v4, "Activity Tile"

    invoke-static {v4, v2, v3}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v2

    sget-object v3, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ACTIVITY_TILE_SELECTION:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v3}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v3

    invoke-virtual {v1}, Ldd1/n;->L()Lc93/m;

    move-result-object v4

    const-string v5, "Activity Tile Selection"

    invoke-static {v5, v3, v4}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v3

    sget-object v4, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ADD_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v4}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v4

    invoke-virtual {v1}, Ldd1/n;->K()Lc93/m;

    move-result-object v5

    const-string v6, "Add Tile"

    invoke-static {v6, v4, v5}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v4

    sget-object v5, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ALERT_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v5}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v5

    invoke-virtual {v1}, Ldd1/n;->f0()Lc93/m;

    move-result-object v6

    const-string v7, "Alert Tile"

    invoke-static {v7, v5, v6}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v5

    sget-object v6, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ARTICLE_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v6}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v6

    invoke-virtual {v1}, Ldd1/n;->Q()Lc93/m;

    move-result-object v7

    const-string v8, "Article Tile"

    invoke-static {v8, v6, v7}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v6

    sget-object v7, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->COACHING_CTA_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v7}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v7

    invoke-virtual {v1}, Ldd1/n;->X()Lc93/m;

    move-result-object v8

    const-string v9, "Coaching CTA Tile"

    invoke-static {v9, v7, v8}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v7

    sget-object v8, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->COMPACT_TREND:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v8}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v8

    invoke-virtual {v1}, Ldd1/n;->q0()Lc93/m;

    move-result-object v9

    const-string v10, "Compact Trend"

    invoke-static {v10, v8, v9}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v8

    sget-object v9, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->COUNT_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v9}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v9

    invoke-virtual {v1}, Ldd1/n;->T()Lc93/m;

    move-result-object v10

    const-string v11, "Count Tile"

    invoke-static {v11, v9, v10}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v9

    sget-object v10, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->CTA_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v10}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v10

    invoke-virtual {v1}, Ldd1/n;->a0()Lc93/m;

    move-result-object v11

    const-string v12, "CTA Tile"

    invoke-static {v12, v10, v11}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v10

    sget-object v11, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->DRAGGABLE_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v11}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v11

    invoke-virtual {v1}, Ldd1/n;->M()Lc93/m;

    move-result-object v12

    const-string v13, "Draggable Tile"

    invoke-static {v13, v11, v12}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v11

    sget-object v12, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->EXERCISE_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v12}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v12

    invoke-virtual {v1}, Ldd1/n;->O()Lc93/m;

    move-result-object v13

    const-string v14, "Exercise Tile"

    invoke-static {v14, v12, v13}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v12

    sget-object v13, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->GLASS_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v13}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v13

    invoke-virtual {v1}, Ldd1/n;->e0()Lc93/m;

    move-result-object v14

    const-string v15, "Glass Tile"

    invoke-static {v15, v13, v14}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v13

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->GOAL_SETTINGS_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->R()Lc93/m;

    move-result-object v15

    move-object/from16 v16, v0

    const-string v0, "Goal Settings Tile"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->HEALTH_MONITOR_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->Y()Lc93/m;

    move-result-object v15

    move-object/from16 v17, v0

    const-string v0, "Health Monitor Tile"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->HORIZONTAL_METRIC_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->p0()Lc93/m;

    move-result-object v15

    move-object/from16 v18, v0

    const-string v0, "Horizontal Metric Tile"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->IMPACT_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->U()Lc93/m;

    move-result-object v15

    move-object/from16 v19, v0

    const-string v0, "Impact Card"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->IMPACT_MAGNITUDE_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->b0()Lc93/m;

    move-result-object v15

    move-object/from16 v20, v0

    const-string v0, "Impact Magnitude Tile"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->IMPACT_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->n0()Lc93/m;

    move-result-object v15

    move-object/from16 v21, v0

    const-string v0, "Impact Tile"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->INFO_CALLOUT_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->k0()Lc93/m;

    move-result-object v15

    move-object/from16 v22, v0

    const-string v0, "Info Callout Tile"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->INFO_ROW_LIST:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->h0()Lc93/m;

    move-result-object v15

    move-object/from16 v23, v0

    const-string v0, "Info Row List"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->KEY_METRIC_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->N()Lc93/m;

    move-result-object v15

    move-object/from16 v24, v0

    const-string v0, "Key Metric Tile"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->LIST_ITEM_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->V()Lc93/m;

    move-result-object v15

    move-object/from16 v25, v0

    const-string v0, "List Item Tile"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->MONITOR_SQUARE_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->d0()Lc93/m;

    move-result-object v15

    move-object/from16 v26, v0

    const-string v0, "Monitor Square Tile"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->MINI_MONITOR_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->S()Lc93/m;

    move-result-object v15

    move-object/from16 v27, v0

    const-string v0, "Mini Monitor Tile"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->ONBOARDING_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->Z()Lc93/m;

    move-result-object v15

    move-object/from16 v28, v0

    const-string v0, "Onboarding Tile"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->RECOMMENDATION_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->o0()Lc93/m;

    move-result-object v15

    move-object/from16 v29, v0

    const-string v0, "Recommendation Tile"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SCHEDULE_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->l0()Lc93/m;

    move-result-object v15

    move-object/from16 v30, v0

    const-string v0, "Schedule Tile"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->STATUS_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->c0()Lc93/m;

    move-result-object v15

    move-object/from16 v31, v0

    const-string v0, "Status Tile"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->METRIC_STATUS_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->m0()Lc93/m;

    move-result-object v15

    move-object/from16 v32, v0

    const-string v0, "Metric Status Tile"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->SHOPPING_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->J()Lc93/m;

    move-result-object v15

    move-object/from16 v33, v0

    const-string v0, "Shopping Tile"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->TITLE_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->g0()Lc93/m;

    move-result-object v15

    move-object/from16 v34, v0

    const-string v0, "Title Tile"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->TITLE_SUBTITLE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->P()Lc93/m;

    move-result-object v15

    move-object/from16 v35, v0

    const-string v0, "Title Subtitle"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->TREND_TILE:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->W()Lc93/m;

    move-result-object v15

    move-object/from16 v36, v0

    const-string v0, "Trend Tile"

    invoke-static {v0, v14, v15}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v0

    sget-object v14, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;->IMPACT_ACTIVITY_CARD:Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    invoke-static {v14}, Ldd1/r;->c(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;

    move-result-object v14

    invoke-virtual {v1}, Ldd1/n;->r0()Lc93/m;

    move-result-object v1

    const-string v15, "Recovery Impact Activity Tile"

    invoke-static {v15, v14, v1}, Ldd1/r;->a(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;

    move-result-object v1

    const/16 v14, 0x23

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

    aput-object v0, v14, v2

    const/16 v0, 0x22

    aput-object v1, v14, v0

    invoke-static {v14}, Ln91/b;->b([Lm91/u;)Ln91/a;

    move-result-object v0

    invoke-interface {v0}, Ln91/a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
