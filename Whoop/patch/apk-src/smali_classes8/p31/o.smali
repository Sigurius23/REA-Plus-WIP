.class public abstract Lp31/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0002\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "",
        "Lp31/l;",
        "a",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "homeSectionHeaderStates",
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
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lp31/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 61

    new-instance v1, Lp31/l;

    new-instance v2, Lp31/p$a;

    const-string v0, "STRAIN STATISTICS"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/16 v13, 0x3fe

    const/4 v14, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v2 .. v14}, Lp31/p$a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lp31/r;Lb91/c;Lb91/c;Lp31/i;ZZLjava/util/List;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lp31/l;

    new-instance v5, Lp31/p$a;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v16, Lp31/r;->SMALL:Lp31/r;

    move-object/from16 v8, v16

    const/16 v16, 0x3fa

    const/16 v17, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v5 .. v17}, Lp31/p$a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lp31/r;Lb91/c;Lb91/c;Lp31/i;ZZLjava/util/List;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v2, v5, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lp31/l;

    new-instance v9, Lp31/p$a;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget-object v20, Lp31/r;->LARGE:Lp31/r;

    move-object/from16 v16, v20

    const/16 v20, 0x3fa

    const/16 v21, 0x0

    const/4 v13, 0x0

    move-object/from16 v12, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v9 .. v21}, Lp31/p$a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lp31/r;Lb91/c;Lb91/c;Lp31/i;ZZLjava/util/List;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v16, v12

    invoke-direct {v5, v9, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lp31/l;

    new-instance v17, Lp31/p$a;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    sget-object v21, Lb91/c;->T1:Lb91/c;

    const/16 v28, 0x3f6

    const/16 v29, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v17 .. v29}, Lp31/p$a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lp31/r;Lb91/c;Lb91/c;Lp31/i;ZZLjava/util/List;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v17

    move-object/from16 v29, v21

    invoke-direct {v6, v7, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v34, v5

    new-instance v5, Lp31/l;

    new-instance v17, Lp31/p$b;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    sget-object v35, Lx81/d;->a:Lx81/d;

    invoke-virtual/range {v35 .. v35}, Lx81/d;->d()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/k0;->q()I

    move-result v19

    const/16 v24, 0x3c

    const/16 v25, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v17 .. v25}, Lp31/p$b;-><init>(Lcom/whoop/design/util/TextResource;IILp31/r;Lb91/c;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v17

    invoke-direct {v5, v7, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v36, v6

    new-instance v6, Lp31/l;

    new-instance v17, Lp31/p$b;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-virtual/range {v35 .. v35}, Lx81/d;->d()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/k0;->q()I

    move-result v19

    sget-object v41, Lb91/c;->T3:Lb91/c;

    const/16 v24, 0x2c

    move-object/from16 v22, v41

    invoke-direct/range {v17 .. v25}, Lp31/p$b;-><init>(Lcom/whoop/design/util/TextResource;IILp31/r;Lb91/c;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v17

    invoke-direct {v6, v7, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lp31/l;

    move-object v9, v7

    new-instance v7, Lp31/p$b;

    move-object v11, v8

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual/range {v35 .. v35}, Lx81/d;->d()Lgz0/o0;

    move-result-object v10

    invoke-virtual {v10}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v10

    invoke-virtual {v10}, Lgz0/k0;->q()I

    move-result v10

    const/16 v14, 0x34

    move-object v12, v9

    move v9, v10

    const/4 v10, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    move-object/from16 v18, v0

    move-object/from16 v0, v17

    invoke-direct/range {v7 .. v15}, Lp31/p$b;-><init>(Lcom/whoop/design/util/TextResource;IILp31/r;Lb91/c;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v11

    invoke-direct {v0, v7, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lp31/l;

    new-instance v11, Lp31/p$b;

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual/range {v35 .. v35}, Lx81/d;->d()Lgz0/o0;

    move-result-object v9

    invoke-virtual {v9}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v9

    invoke-virtual {v9}, Lgz0/k0;->q()I

    move-result v13

    const/16 v18, 0x34

    const/16 v19, 0x0

    const/4 v14, 0x0

    move-object/from16 v20, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v15, v20

    invoke-direct/range {v11 .. v19}, Lp31/p$b;-><init>(Lcom/whoop/design/util/TextResource;IILp31/r;Lb91/c;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v16, v15

    invoke-direct {v7, v11, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lp31/l;

    new-instance v10, Lp31/p$d;

    const-string v11, "KEY STATISTICS"

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const-string v12, "VS. PREVIOUS 30 DAYS"

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lp31/p$d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lp31/r;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v9, v10, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lp31/l;

    new-instance v42, Lp31/p$e;

    const-string v11, "TODAY\'S ACTIVITIES"

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v43

    const-string v11, "START ACTIVITY"

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v44

    invoke-virtual/range {v35 .. v35}, Lx81/d;->d()Lgz0/o0;

    move-result-object v11

    invoke-virtual {v11}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v11

    invoke-virtual {v11}, Lgz0/a;->a()I

    move-result v45

    sget-object v50, Lkd1/l;->START_ACTIVITY:Lkd1/l;

    const/16 v55, 0xff0

    const/16 v56, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    move-object/from16 v46, v50

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    invoke-direct/range {v42 .. v56}, Lp31/p$e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkd1/l;ZZIZLp31/r;Lb91/c;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v11, v42

    invoke-direct {v10, v11, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lp31/l;

    move-object/from16 v50, v46

    new-instance v46, Lp31/p$e;

    const-string v12, "STATISTICS VS. LAST 30 DAYS"

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v47

    const-string v12, "CUSTOMIZE"

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v48

    invoke-static/range {v35 .. v35}, Lm4/a;->A(Lx81/d;)I

    move-result v49

    const/16 v59, 0xfe0

    const/16 v60, 0x0

    const/16 v51, 0x1

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    invoke-direct/range {v46 .. v60}, Lp31/p$e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkd1/l;ZZIZLp31/r;Lb91/c;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v13, v46

    invoke-direct {v11, v13, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lp31/l;

    move-object v14, v11

    new-instance v11, Lp31/p$e;

    const-string v15, "My Dashboard"

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    move-object/from16 v17, v14

    invoke-static/range {v35 .. v35}, Lm4/a;->A(Lx81/d;)I

    move-result v14

    move-object/from16 v18, v13

    move-object v13, v12

    move-object v12, v15

    sget-object v15, Lkd1/l;->CUSTOMIZE_MY_DASHBOARD:Lkd1/l;

    const/16 v24, 0xed0

    move-object/from16 v20, v16

    const/16 v16, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x1

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move-object/from16 v22, v19

    const/16 v19, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v26, v22

    const/16 v22, 0x0

    move-object/from16 v27, v23

    const/16 v23, 0x0

    move-object/from16 v53, v0

    move-object/from16 v52, v26

    move-object/from16 v0, v27

    invoke-direct/range {v11 .. v25}, Lp31/p$e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkd1/l;ZZIZLp31/r;Lb91/c;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v22, v20

    invoke-direct {v0, v11, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lp31/l;

    move-object v11, v7

    new-instance v7, Lp31/p$e;

    const-string v26, "Keep Learning, Extending"

    move-object/from16 v16, v8

    invoke-static/range {v26 .. v26}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const-string v50, "VIEW ALL"

    move-object v12, v9

    invoke-static/range {v50 .. v50}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    move-object v14, v10

    invoke-static/range {v35 .. v35}, Lih0/d0;->E(Lx81/d;)I

    move-result v10

    sget-object v23, Lkd1/l;->ONBOARDING_TASK_LIST:Lkd1/l;

    const/16 v20, 0xef0

    move-object v15, v12

    const/4 v12, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    move-object/from16 v18, v14

    const/4 v14, 0x0

    move-object/from16 v19, v15

    const/4 v15, 0x0

    move-object/from16 v24, v17

    const/16 v17, 0x0

    move-object/from16 v25, v18

    const/16 v18, 0x0

    move-object/from16 v27, v19

    const/16 v19, 0x0

    move-object/from16 v57, v0

    move-object/from16 v54, v11

    move-object/from16 v11, v23

    move-object/from16 v0, v24

    move-object/from16 v56, v25

    move-object/from16 v55, v27

    invoke-direct/range {v7 .. v21}, Lp31/p$e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkd1/l;ZZIZLp31/r;Lb91/c;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v7, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lp31/l;

    new-instance v11, Lp31/p$e;

    invoke-static/range {v26 .. v26}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static/range {v50 .. v50}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-static/range {v35 .. v35}, Lih0/d0;->E(Lx81/d;)I

    move-result v14

    const/16 v24, 0xef0

    const/16 v25, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v20, v22

    const/16 v22, 0x0

    move-object/from16 v15, v23

    const/16 v23, 0x0

    invoke-direct/range {v11 .. v25}, Lp31/p$e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkd1/l;ZZIZLp31/r;Lb91/c;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v23, v15

    move-object/from16 v16, v20

    invoke-direct {v7, v11, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lp31/l;

    new-instance v19, Lp31/p$e;

    invoke-static/range {v26 .. v26}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    invoke-static/range {v50 .. v50}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    invoke-static/range {v35 .. v35}, Lih0/d0;->E(Lx81/d;)I

    move-result v22

    const/16 v32, 0xdf0    # 5.0E-42f

    const/16 v33, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v19 .. v33}, Lp31/p$e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkd1/l;ZZIZLp31/r;Lb91/c;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v9, v19

    invoke-direct {v8, v9, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lp31/l;

    new-instance v11, Lp31/p$c;

    const-string v10, "Trend Views"

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const-string v10, "Today"

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const-string v10, "vs. last 7 days"

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    const-string v12, ""

    move-object/from16 v17, v41

    invoke-direct/range {v11 .. v17}, Lp31/p$c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lp31/r;Lb91/c;)V

    invoke-direct {v9, v11, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lp31/l;

    const-string v11, "ACHIEVEMENTS"

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v38

    const-string v12, "(12)"

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v47

    new-instance v37, Lp31/p$a;

    const/16 v48, 0x1f6

    const/16 v49, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    invoke-direct/range {v37 .. v49}, Lp31/p$a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lp31/r;Lb91/c;Lb91/c;Lp31/i;ZZLjava/util/List;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v13, v37

    invoke-direct {v10, v13, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lp31/l;

    new-instance v14, Lp31/p$a;

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    const/16 v25, 0x1fe

    const/16 v26, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v14 .. v26}, Lp31/p$a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lp31/r;Lb91/c;Lb91/c;Lp31/i;ZZLjava/util/List;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v13, v14, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lp31/l;

    new-instance v37, Lp31/p$a;

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v38

    const/16 v48, 0x3f6

    const/16 v47, 0x0

    invoke-direct/range {v37 .. v49}, Lp31/p$a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lp31/r;Lb91/c;Lb91/c;Lp31/i;ZZLjava/util/List;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v15, v37

    invoke-direct {v14, v15, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lp31/l;

    new-instance v16, Lp31/p$a;

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    const/16 v27, 0x1fe

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v16 .. v28}, Lp31/p$a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lp31/r;Lb91/c;Lb91/c;Lp31/i;ZZLjava/util/List;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v17, v0

    move-object/from16 v0, v16

    invoke-direct {v15, v0, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lp31/l;

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v38

    invoke-static/range {v50 .. v50}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v39

    invoke-static/range {v35 .. v35}, Lih0/d0;->E(Lx81/d;)I

    move-result v40

    move-object/from16 v22, v41

    sget-object v41, Lkd1/l;->NONE:Lkd1/l;

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v49

    new-instance v37, Lp31/p$e;

    const/16 v50, 0x5f0

    const/16 v51, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v48, 0x0

    move-object/from16 v47, v22

    invoke-direct/range {v37 .. v51}, Lp31/p$e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkd1/l;ZZIZLp31/r;Lb91/c;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v11, v37

    invoke-direct {v0, v11, v3, v4, v3}, Lp31/l;-><init>(Lp31/p;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v21, v0

    move-object/from16 v16, v9

    move-object/from16 v18, v13

    move-object/from16 v19, v14

    move-object/from16 v20, v15

    move-object/from16 v13, v17

    move-object/from16 v3, v34

    move-object/from16 v4, v36

    move-object/from16 v11, v52

    move-object/from16 v9, v55

    move-object/from16 v12, v57

    move-object v14, v7

    move-object v15, v8

    move-object/from16 v17, v10

    move-object/from16 v7, v53

    move-object/from16 v8, v54

    move-object/from16 v10, v56

    filled-new-array/range {v1 .. v21}, [Lp31/l;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lp31/o;->a:Ljava/util/List;

    return-void
.end method

.method public static final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lp31/l;",
            ">;"
        }
    .end annotation

    sget-object v0, Lp31/o;->a:Ljava/util/List;

    return-object v0
.end method
