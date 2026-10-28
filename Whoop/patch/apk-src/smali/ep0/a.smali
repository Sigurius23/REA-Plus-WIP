.class public final synthetic Lep0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lep0/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 30

    move-object/from16 v0, p0

    iget v1, v0, Lep0/a;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    invoke-static {}, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->a()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_0
    invoke-static {}, Lcom/whoop/design/models/items/graph/LayoutDirection;->a()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_1
    invoke-static {}, Lcom/whoop/design/models/items/graph/GraphingCardModel;->b()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_2
    invoke-static {}, Lcom/whoop/design/models/items/graph/GraphingCardModel;->e()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_3
    invoke-static {}, Lcom/whoop/design/models/items/graph/GraphingCardModel;->c()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_4
    invoke-static {}, Lcom/whoop/design/models/items/graph/GraphingCardModel;->d()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_5
    invoke-static {}, Lcom/whoop/design/models/items/graph/GraphingCardModel;->a()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_6
    invoke-static {}, Lcom/whoop/design/models/items/graph/GraphModel;->b()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_7
    invoke-static {}, Lcom/whoop/design/models/items/graph/GraphModel;->a()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_8
    new-instance v2, Lg1/h9;

    sget-object v4, Lg1/i9;->a:Ll3/v0;

    sget-object v9, Lp3/r;->E:Lp3/r;

    const/16 v1, 0x60

    invoke-static {v1}, Lv63/c;->h(I)J

    move-result-wide v7

    const/16 v1, 0x70

    invoke-static {v1}, Lv63/c;->h(I)J

    move-result-wide v14

    const-wide/high16 v5, -0x4008000000000000L    # -1.5

    invoke-static {v5, v6}, Lv63/c;->g(D)J

    move-result-wide v11

    const/16 v17, 0x0

    const v18, 0xfdff79

    const-wide/16 v5, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    invoke-static/range {v4 .. v18}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v1

    const/16 v5, 0x3c

    invoke-static {v5}, Lv63/c;->h(I)J

    move-result-wide v7

    const/16 v5, 0x48

    invoke-static {v5}, Lv63/c;->h(I)J

    move-result-wide v14

    const-wide/high16 v5, -0x4020000000000000L    # -0.5

    invoke-static {v5, v6}, Lv63/c;->g(D)J

    move-result-wide v11

    const-wide/16 v5, 0x0

    invoke-static/range {v4 .. v18}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v5

    sget-object v9, Lp3/r;->F:Lp3/r;

    const/16 v6, 0x30

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v7

    const/16 v6, 0x38

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v14

    invoke-static {v3}, Lv63/c;->h(I)J

    move-result-wide v11

    move-object v10, v5

    const-wide/16 v5, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v20, v3

    move-object/from16 v3, v19

    invoke-static/range {v4 .. v18}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v5

    const/16 v6, 0x22

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v7

    const/16 v6, 0x24

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v14

    const-wide/high16 v10, 0x3fd0000000000000L    # 0.25

    invoke-static {v10, v11}, Lv63/c;->g(D)J

    move-result-wide v11

    move-object v10, v5

    const-wide/16 v5, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v0, v19

    invoke-static/range {v4 .. v18}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v5

    const/16 v6, 0x18

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v7

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v14

    invoke-static/range {v20 .. v20}, Lv63/c;->h(I)J

    move-result-wide v11

    move-object v10, v5

    const-wide/16 v5, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v20, v2

    move-object/from16 v2, v19

    invoke-static/range {v4 .. v18}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v5

    move-object/from16 v19, v9

    sget-object v9, Lp3/r;->G:Lp3/r;

    const/16 v6, 0x14

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v7

    const/16 v6, 0x18

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v14

    const-wide v10, 0x3fc3333333333333L    # 0.15

    invoke-static {v10, v11}, Lv63/c;->g(D)J

    move-result-wide v11

    move-object v10, v5

    const-wide/16 v5, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v21, v16

    const/16 v16, 0x0

    move-object/from16 v22, v21

    invoke-static/range {v4 .. v18}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v5

    move-object/from16 v21, v9

    const/16 v6, 0x10

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v7

    const/16 v6, 0x18

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v14

    const-wide v9, 0x3fc3333333333333L    # 0.15

    invoke-static {v9, v10}, Lv63/c;->g(D)J

    move-result-wide v11

    move-object v9, v5

    const-wide/16 v5, 0x0

    const/4 v10, 0x0

    move-object/from16 v23, v9

    move-object/from16 v9, v19

    invoke-static/range {v4 .. v18}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v5

    const/16 v6, 0xe

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v7

    const/16 v6, 0x18

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v14

    const-wide v9, 0x3fb999999999999aL    # 0.1

    invoke-static {v9, v10}, Lv63/c;->g(D)J

    move-result-wide v11

    move-object v9, v5

    const-wide/16 v5, 0x0

    const/4 v10, 0x0

    move-object/from16 v24, v9

    move-object/from16 v9, v21

    invoke-static/range {v4 .. v18}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v5

    const/16 v6, 0x10

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v7

    const/16 v6, 0x18

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v14

    const-wide/high16 v9, 0x3fe0000000000000L    # 0.5

    invoke-static {v9, v10}, Lv63/c;->g(D)J

    move-result-wide v11

    move-object v9, v5

    const-wide/16 v5, 0x0

    const/4 v10, 0x0

    move-object/from16 v25, v9

    move-object/from16 v9, v19

    invoke-static/range {v4 .. v18}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v5

    const/16 v6, 0xe

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v7

    const/16 v6, 0x14

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v14

    const-wide/high16 v10, 0x3fd0000000000000L    # 0.25

    invoke-static {v10, v11}, Lv63/c;->g(D)J

    move-result-wide v11

    move-object v10, v5

    const-wide/16 v5, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v26, v19

    invoke-static/range {v4 .. v18}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v5

    move-object/from16 v19, v9

    const/16 v6, 0xe

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v7

    const/16 v6, 0x10

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v14

    const-wide/high16 v9, 0x3ff4000000000000L    # 1.25

    invoke-static {v9, v10}, Lv63/c;->g(D)J

    move-result-wide v11

    move-object v9, v5

    const-wide/16 v5, 0x0

    const/4 v10, 0x0

    move-object/from16 v27, v9

    move-object/from16 v9, v21

    invoke-static/range {v4 .. v18}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v5

    const/16 v6, 0xc

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v7

    const/16 v6, 0x10

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v14

    const-wide v9, 0x3fd999999999999aL    # 0.4

    invoke-static {v9, v10}, Lv63/c;->g(D)J

    move-result-wide v11

    move-object v9, v5

    const-wide/16 v5, 0x0

    const/4 v10, 0x0

    move-object/from16 v28, v9

    move-object/from16 v9, v19

    invoke-static/range {v4 .. v18}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v5

    const/16 v6, 0xa

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v7

    const/16 v6, 0x10

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v14

    const-wide/high16 v10, 0x3ff8000000000000L    # 1.5

    invoke-static {v10, v11}, Lv63/c;->g(D)J

    move-result-wide v11

    move-object v10, v5

    const-wide/16 v5, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v29, v19

    invoke-static/range {v4 .. v18}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v4

    sget-object v5, Lp3/i;->w:Lp3/f;

    invoke-static {v1, v5}, Lg1/i9;->a(Ll3/v0;Lp3/i;)Ll3/v0;

    move-result-object v1

    invoke-static {v3, v5}, Lg1/i9;->a(Ll3/v0;Lp3/i;)Ll3/v0;

    move-result-object v3

    invoke-static {v0, v5}, Lg1/i9;->a(Ll3/v0;Lp3/i;)Ll3/v0;

    move-result-object v0

    invoke-static {v2, v5}, Lg1/i9;->a(Ll3/v0;Lp3/i;)Ll3/v0;

    move-result-object v6

    move-object/from16 v10, v22

    invoke-static {v10, v5}, Lg1/i9;->a(Ll3/v0;Lp3/i;)Ll3/v0;

    move-result-object v7

    move-object/from16 v9, v23

    invoke-static {v9, v5}, Lg1/i9;->a(Ll3/v0;Lp3/i;)Ll3/v0;

    move-result-object v8

    move-object/from16 v9, v24

    invoke-static {v9, v5}, Lg1/i9;->a(Ll3/v0;Lp3/i;)Ll3/v0;

    move-result-object v9

    move-object/from16 v2, v25

    invoke-static {v2, v5}, Lg1/i9;->a(Ll3/v0;Lp3/i;)Ll3/v0;

    move-result-object v10

    move-object/from16 v13, v26

    invoke-static {v13, v5}, Lg1/i9;->a(Ll3/v0;Lp3/i;)Ll3/v0;

    move-result-object v11

    move-object/from16 v2, v27

    invoke-static {v2, v5}, Lg1/i9;->a(Ll3/v0;Lp3/i;)Ll3/v0;

    move-result-object v12

    move-object/from16 v2, v28

    invoke-static {v2, v5}, Lg1/i9;->a(Ll3/v0;Lp3/i;)Ll3/v0;

    move-result-object v13

    move-object/from16 v2, v29

    invoke-static {v2, v5}, Lg1/i9;->a(Ll3/v0;Lp3/i;)Ll3/v0;

    move-result-object v14

    invoke-static {v4, v5}, Lg1/i9;->a(Ll3/v0;Lp3/i;)Ll3/v0;

    move-result-object v15

    move-object v5, v0

    move-object v4, v3

    move-object/from16 v2, v20

    move-object v3, v1

    invoke-direct/range {v2 .. v15}, Lg1/h9;-><init>(Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;)V

    return-object v2

    :pswitch_9
    sget-object v0, Lg1/i9;->a:Ll3/v0;

    return-object v0

    :pswitch_a
    new-instance v0, Lg1/y4;

    sget-wide v3, Li2/x;->n:J

    invoke-direct {v0, v3, v4, v2}, Lg1/y4;-><init>(JLk1/b;)V

    return-object v0

    :pswitch_b
    sget-object v0, Lg1/h3;->a:Lp1/u2;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_c
    move v0, v3

    int-to-float v0, v0

    new-instance v1, Ly3/f;

    invoke-direct {v1, v0}, Ly3/f;-><init>(F)V

    return-object v1

    :pswitch_d
    sget-object v0, Lg1/u2;->a:Lp1/u2;

    sget-object v0, Lg1/s1;->a:Lg1/s1;

    return-object v0

    :pswitch_e
    sget-object v0, Lg1/j1;->a:Lp1/b0;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_f
    const-wide/16 v7, 0x0

    const/16 v9, 0xfff

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    invoke-static/range {v1 .. v9}, Lg1/d1;->d(JJJJI)Lg1/c1;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lfy1/m;->a()Lfy1/l;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/hrZones/network/ZoneID;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/hrZones/network/Zone;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lcom/whoop/hrZones/network/HrZones;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lfq0/b;->c()Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lcom/whoop/cdm/WhoopCompanionDeviceService;->a()Ltr2/n;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lcom/whoop/analytics/AnalyticEventModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_17
    sget-object v0, Lf1/c1;->a:Lp1/b0;

    return-object v2

    :pswitch_18
    new-instance v0, Lf0/e1;

    invoke-direct {v0}, Lf0/e1;-><init>()V

    return-object v0

    :pswitch_19
    sget-object v0, Landroidx/compose/foundation/d;->a:Lp1/b0;

    sget-object v0, Lf0/e0;->a:Lf0/e0;

    return-object v0

    :pswitch_1a
    invoke-static {}, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
