.class public abstract Lf41/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\n\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u0017\u0010\u0006\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0004\"\u0017\u0010\t\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0002\u001a\u0004\u0008\u0008\u0010\u0004\u00a8\u0006\n"
    }
    d2 = {
        "Lf41/e;",
        "a",
        "Lf41/e;",
        "b",
        "()Lf41/e;",
        "behaviorGoalTileSample",
        "activityGoalTileSample",
        "c",
        "getBehaviorGoalTileHubAndSpokeSample",
        "behaviorGoalTileHubAndSpokeSample",
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
.field private static final a:Lf41/e;

.field private static final b:Lf41/e;

.field private static final c:Lf41/e;


# direct methods
.method static constructor <clinit>()V
    .locals 60

    new-instance v0, Lf41/e;

    const-string v1, "SLEEP A TON?"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v1, "Let\'s make this text really long so we can text out the height cutting off the trend"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v1, "Avoid sleeping a ton"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v5, Lhy0/c2;

    const-string v1, "99%"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v8, Lhy0/b2;->POSITIVE_WITH_COLOR:Lhy0/b2;

    const/16 v21, 0x7ff8

    const/16 v22, 0x0

    const/4 v7, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v5 .. v22}, Lhy0/c2;-><init>(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v7, Ly81/f;->SLEEP:Ly81/f;

    new-instance v8, Lkd1/o$a;

    sget v1, Lgy0/a;->b:I

    invoke-direct {v8, v1}, Lkd1/o$a;-><init>(I)V

    new-instance v12, Lf41/b;

    new-instance v13, Lf41/q;

    const-string v20, "1 DAY"

    invoke-static/range {v20 .. v20}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v21, "AVOID 1 DAY"

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/4 v9, 0x1

    invoke-direct {v13, v9, v1, v6}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v14, Lf41/q;

    const-string v22, "2 DAYS"

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v23, "AVOID 2 DAYS"

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/4 v10, 0x2

    invoke-direct {v14, v10, v1, v6}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v15, Lf41/q;

    const-string v24, "3 DAYS"

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v25, "AVOID 3 DAYS"

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/4 v11, 0x3

    invoke-direct {v15, v11, v1, v6}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v1, Lf41/q;

    const-string v26, "4 DAYS"

    invoke-static/range {v26 .. v26}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const-string v27, "AVOID 4 DAYS"

    invoke-static/range {v27 .. v27}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    move-object/from16 v29, v5

    const/4 v5, 0x4

    invoke-direct {v1, v5, v6, v9}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v6, Lf41/q;

    const-string v30, "5 DAYS"

    invoke-static/range {v30 .. v30}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const-string v31, "AVOID 5 DAYS"

    invoke-static/range {v31 .. v31}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/4 v10, 0x5

    invoke-direct {v6, v10, v9, v5}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v5, Lf41/q;

    const-string v33, "6 DAY"

    invoke-static/range {v33 .. v33}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const-string v34, "AVOID 6 DAYS"

    invoke-static/range {v34 .. v34}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    const/4 v11, 0x6

    invoke-direct {v5, v11, v9, v10}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v9, Lf41/q;

    const-string v35, "7 DAYS"

    invoke-static/range {v35 .. v35}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    const-string v36, "AVOID 7 DAYS"

    invoke-static/range {v36 .. v36}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    move-object/from16 v18, v5

    const/4 v5, 0x7

    invoke-direct {v9, v5, v10, v11}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    move-object/from16 v16, v1

    move-object/from16 v17, v6

    move-object/from16 v19, v9

    filled-new-array/range {v13 .. v19}, [Lf41/q;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v15, "Days per week"

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-direct {v12, v1, v6}, Lf41/b;-><init>(Ljava/util/List;Lcom/whoop/design/util/TextResource;)V

    const/4 v13, 0x1

    const/4 v14, 0x0

    const-string v1, "1"

    move v6, v5

    const/4 v5, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object/from16 v16, v15

    move-object/from16 v6, v29

    const/4 v15, 0x1

    invoke-direct/range {v0 .. v14}, Lf41/e;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lhy0/c2;Ly81/e;Lkd1/o;ZZZLf41/b;ILf41/a;)V

    sput-object v0, Lf41/d;->a:Lf41/e;

    new-instance v37, Lf41/e;

    const-string v0, "LIFTING BEARS"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v39

    const-string v0, "Get swoll"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v40

    const-string v0, "Avoid heavy stuff"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v41

    new-instance v0, Lkd1/o$a;

    sget v1, Lgy0/a;->s:I

    invoke-direct {v0, v1}, Lkd1/o$a;-><init>(I)V

    new-instance v42, Lhy0/c2;

    const-string v1, "-44%"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v43

    sget-object v45, Lhy0/b2;->NEGATIVE_WITH_COLOR:Lhy0/b2;

    const/16 v58, 0x7ff8

    const/16 v59, 0x0

    const/16 v44, 0x1

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    invoke-direct/range {v42 .. v59}, Lhy0/c2;-><init>(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v44, Ly81/f;->STRAIN:Ly81/f;

    new-instance v1, Lf41/b;

    new-instance v2, Lf41/q;

    invoke-static/range {v20 .. v20}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-direct {v2, v15, v3, v4}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v3, Lf41/q;

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/4 v9, 0x2

    invoke-direct {v3, v9, v4, v5}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v4, Lf41/q;

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/4 v10, 0x3

    invoke-direct {v4, v10, v5, v6}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v5, Lf41/q;

    invoke-static/range {v26 .. v26}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static/range {v27 .. v27}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const/4 v11, 0x4

    invoke-direct {v5, v11, v6, v7}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v6, Lf41/q;

    invoke-static/range {v30 .. v30}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static/range {v31 .. v31}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/4 v12, 0x5

    invoke-direct {v6, v12, v7, v8}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v7, Lf41/q;

    invoke-static/range {v33 .. v33}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static/range {v34 .. v34}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/4 v14, 0x6

    invoke-direct {v7, v14, v8, v13}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v8, Lf41/q;

    invoke-static/range {v35 .. v35}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-static/range {v36 .. v36}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const/4 v12, 0x7

    invoke-direct {v8, v12, v13, v14}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    filled-new-array/range {v2 .. v8}, [Lf41/q;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lf41/b;-><init>(Ljava/util/List;Lcom/whoop/design/util/TextResource;)V

    const/16 v52, 0x80

    const/16 v53, 0x0

    const-string v38, "1"

    const/16 v45, 0x0

    const/16 v46, 0x1

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v50, 0x1

    const/16 v51, 0x0

    move-object/from16 v49, v1

    move-object/from16 v43, v42

    move-object/from16 v42, v0

    invoke-direct/range {v37 .. v53}, Lf41/e;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lhy0/c2;Ly81/e;Lkd1/o;ZZZLf41/b;ILf41/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v37, Lf41/d;->b:Lf41/e;

    new-instance v38, Lf41/e;

    const-string v0, "MORNING SUNLIGHT"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v40

    const-string v0, "AVOID MORNING SUNLIGHT"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v42

    sget-object v45, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    new-instance v0, Lf41/b;

    new-instance v1, Lf41/q;

    invoke-static/range {v20 .. v20}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v1, v15, v2, v3}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v2, Lf41/q;

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-direct {v2, v9, v3, v4}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v3, Lf41/q;

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-direct {v3, v10, v4, v5}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v4, Lf41/q;

    invoke-static/range {v26 .. v26}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static/range {v27 .. v27}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-direct {v4, v11, v5, v6}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v5, Lf41/q;

    invoke-static/range {v30 .. v30}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static/range {v31 .. v31}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const/4 v8, 0x5

    invoke-direct {v5, v8, v6, v7}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v6, Lf41/q;

    invoke-static/range {v33 .. v33}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static/range {v34 .. v34}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/4 v14, 0x6

    invoke-direct {v6, v14, v7, v8}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v7, Lf41/q;

    invoke-static/range {v35 .. v35}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static/range {v36 .. v36}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-direct {v7, v12, v8, v9}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    filled-new-array/range {v1 .. v7}, [Lf41/q;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lf41/b;-><init>(Ljava/util/List;Lcom/whoop/design/util/TextResource;)V

    new-instance v3, Lf41/a;

    const-string v1, "BEHAVIOR IMPACT"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const-string v1, "Impact of Alcohol"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-string v1, "Giving up alcohol can boost Recovery."

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const-string v1, "HELPS WITH"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    new-instance v8, Lhy0/h1;

    const-string v1, "RECOVERY"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget-object v1, Lf41/d$a;->w:Lf41/d$a;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v11

    sget-object v1, Lf41/d$b;->w:Lf41/d$b;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v13

    const v31, 0x3fffea

    const/16 v32, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v8 .. v32}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-direct/range {v3 .. v8}, Lf41/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    const-string v39, "1"

    const/16 v41, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x1

    const/16 v48, 0x1

    const/16 v49, 0x1

    const/16 v51, 0x1

    move-object/from16 v50, v0

    move-object/from16 v52, v3

    invoke-direct/range {v38 .. v52}, Lf41/e;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lhy0/c2;Ly81/e;Lkd1/o;ZZZLf41/b;ILf41/a;)V

    sput-object v38, Lf41/d;->c:Lf41/e;

    return-void
.end method

.method public static final a()Lf41/e;
    .locals 1

    sget-object v0, Lf41/d;->b:Lf41/e;

    return-object v0
.end method

.method public static final b()Lf41/e;
    .locals 1

    sget-object v0, Lf41/d;->a:Lf41/e;

    return-object v0
.end method
