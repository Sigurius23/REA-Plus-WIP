.class public abstract Lmm1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\r\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\"\u0010\u0015\u001a\u00020\u00008\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lmm1/c;",
        "mciTileState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Lmm1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "Lf11/h;",
        "a",
        "Ljava/util/List;",
        "getSampleStateTickMarksDefaults",
        "()Ljava/util/List;",
        "sampleStateTickMarksDefaults",
        "b",
        "Lmm1/c;",
        "getSampleMciHomeTile",
        "()Lmm1/c;",
        "setSampleMciHomeTile",
        "(Lmm1/c;)V",
        "sampleMciHomeTile",
        "home_release"
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
            "Lf11/h;",
            ">;"
        }
    .end annotation
.end field

.field private static b:Lmm1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 52

    new-instance v0, Lf11/h;

    sget-object v2, Ly81/f;->MCI_RED:Ly81/f;

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v1

    new-instance v1, Lf11/h;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v1

    new-instance v1, Lf11/h;

    invoke-direct/range {v1 .. v6}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v1

    new-instance v1, Lf11/h;

    invoke-direct/range {v1 .. v6}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v9, v1

    new-instance v1, Lf11/h;

    invoke-direct/range {v1 .. v6}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lf11/h;

    sget-object v11, Ly81/f;->SLEEP_LIGHT_SLEEP:Ly81/f;

    const/4 v14, 0x6

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v10, v6

    invoke-direct/range {v10 .. v15}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lf11/h;

    invoke-direct/range {v10 .. v15}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v7

    move-object v7, v10

    new-instance v10, Lf11/h;

    invoke-direct/range {v10 .. v15}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v8

    move-object v8, v10

    new-instance v10, Lf11/h;

    invoke-direct/range {v10 .. v15}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v9

    move-object v9, v10

    new-instance v10, Lf11/h;

    invoke-direct/range {v10 .. v15}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v10

    new-instance v10, Lf11/h;

    invoke-direct/range {v10 .. v15}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v16, v10

    new-instance v10, Lf11/h;

    invoke-direct/range {v10 .. v15}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v17, Lf11/h;

    sget-object v18, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    const/16 v21, 0x6

    const/16 v22, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v17 .. v22}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lf11/h;

    const/16 v22, 0x6

    const/16 v23, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v19, v18

    move-object/from16 v18, v14

    invoke-direct/range {v18 .. v23}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v19, Lf11/h;

    sget-object v21, Ly81/f;->SLEEP_REM_SLEEP:Ly81/f;

    const/16 v23, 0x6

    const/16 v24, 0x0

    move-object/from16 v20, v21

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v19 .. v24}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v21, v20

    new-instance v20, Lf11/h;

    const/16 v24, 0x6

    const/16 v25, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v11, v16

    move-object/from16 v16, v20

    new-instance v20, Lf11/h;

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v13, v17

    move-object/from16 v17, v20

    new-instance v20, Lf11/h;

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v20

    new-instance v20, Lf11/h;

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v15, v19

    move-object/from16 v19, v20

    new-instance v20, Lf11/h;

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v12, v20

    new-instance v20, Lf11/h;

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v26, v20

    new-instance v20, Lf11/h;

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v27, v20

    new-instance v20, Lf11/h;

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v28, v20

    new-instance v20, Lf11/h;

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v29, v20

    new-instance v20, Lf11/h;

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v30, v20

    new-instance v20, Lf11/h;

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v31, v26

    move-object/from16 v26, v20

    new-instance v20, Lf11/h;

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v32, v27

    move-object/from16 v27, v20

    new-instance v20, Lf11/h;

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v33, v28

    move-object/from16 v28, v20

    new-instance v20, Lf11/h;

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v34, v29

    move-object/from16 v29, v20

    new-instance v20, Lf11/h;

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v35, v30

    move-object/from16 v30, v20

    new-instance v20, Lf11/h;

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v36, v31

    move-object/from16 v31, v20

    new-instance v20, Lf11/h;

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v37, v32

    move-object/from16 v32, v20

    new-instance v20, Lf11/h;

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v38, v33

    move-object/from16 v33, v20

    new-instance v20, Lf11/h;

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v39, v34

    move-object/from16 v34, v20

    new-instance v20, Lf11/h;

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v40, v35

    move-object/from16 v35, v20

    new-instance v20, Lf11/h;

    invoke-direct/range {v20 .. v25}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v41, Lf11/h;

    sget-object v42, Ly81/f;->BRAND_WHITE:Ly81/f;

    const/16 v45, 0x6

    const/16 v46, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    invoke-direct/range {v41 .. v46}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v43, Lf11/h;

    sget-object v44, Ly81/f;->WHITE_10:Ly81/f;

    const/16 v47, 0x6

    const/16 v48, 0x0

    const/16 v45, 0x0

    invoke-direct/range {v43 .. v48}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v45, Lf11/h;

    sget-object v46, Ly81/f;->MCI_RED_50:Ly81/f;

    const/16 v49, 0x6

    const/16 v50, 0x0

    const/16 v47, 0x0

    invoke-direct/range {v45 .. v50}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v21, v45

    move-object/from16 v45, v44

    new-instance v44, Lf11/h;

    const/16 v48, 0x6

    const/16 v49, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    invoke-direct/range {v44 .. v49}, Lf11/h;-><init>(Ly81/f;ZLy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v22, v37

    move-object/from16 v23, v38

    move-object/from16 v24, v39

    move-object/from16 v25, v40

    move-object/from16 v37, v41

    move-object/from16 v38, v43

    move-object/from16 v40, v44

    move-object/from16 v39, v21

    move-object/from16 v21, v36

    move-object/from16 v36, v20

    move-object/from16 v20, v12

    move-object v12, v10

    move-object v10, v5

    move-object v5, v1

    move-object v1, v0

    filled-new-array/range {v1 .. v40}, [Lf11/h;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    sput-object v5, Lmm1/b;->a:Ljava/util/List;

    new-instance v0, Lmm1/c;

    const-string v1, "MENSTRUAL CYCLE INSIGHTS"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    new-instance v6, Lcom/whoop/navigation/e;

    const/4 v10, 0x7

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v17, v6

    sget-object v18, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    new-instance v2, Lf11/b;

    const-string v1, "Day 37"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const-string v1, "OVERDUE"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const-string v1, "Make sure to log your period"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget-object v11, Ly81/f;->RECOVERY:Ly81/f;

    const/16 v14, 0x62

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v6, v2

    invoke-direct/range {v6 .. v15}, Lf11/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "1"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget-object v23, Ly81/f;->WHITE_20:Ly81/f;

    new-instance v6, Lf11/g;

    const/16 v14, 0x54

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    move-object/from16 v10, v23

    invoke-direct/range {v6 .. v15}, Lf11/g;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;ZLjava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "7"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    new-instance v19, Lf11/g;

    const/16 v27, 0x54

    const/16 v28, 0x0

    const/16 v20, 0x6

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x1

    const/16 v26, 0x0

    invoke-direct/range {v19 .. v28}, Lf11/g;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;ZLjava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v19

    const-string v3, "14"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    new-instance v19, Lf11/g;

    const/16 v20, 0xd

    invoke-direct/range {v19 .. v28}, Lf11/g;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;ZLjava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v19

    const-string v4, "21"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    new-instance v19, Lf11/g;

    const/16 v20, 0x14

    invoke-direct/range {v19 .. v28}, Lf11/g;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;ZLjava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v19

    const-string v7, "28"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    new-instance v19, Lf11/g;

    const/16 v20, 0x1b

    invoke-direct/range {v19 .. v28}, Lf11/g;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;ZLjava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v19

    const-string v8, "35"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    new-instance v19, Lf11/g;

    const/16 v20, 0x22

    invoke-direct/range {v19 .. v28}, Lf11/g;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;ZLjava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v29, v19

    const-string v8, "37"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v44

    new-instance v30, Lf11/g;

    const/16 v50, 0x54

    const/16 v51, 0x0

    const/16 v43, 0x24

    const/16 v45, 0x0

    const/16 v48, 0x1

    move-object/from16 v46, v42

    move-object/from16 v42, v30

    invoke-direct/range {v42 .. v51}, Lf11/g;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;ZLjava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v8, "40"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    new-instance v19, Lf11/g;

    const/16 v20, 0x27

    invoke-direct/range {v19 .. v28}, Lf11/g;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;ZLjava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v25, v1

    move-object/from16 v26, v3

    move-object/from16 v27, v4

    move-object/from16 v24, v6

    move-object/from16 v28, v7

    move-object/from16 v31, v19

    filled-new-array/range {v24 .. v31}, [Lf11/g;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    new-instance v12, Lf11/f;

    const/16 v1, 0x26

    const-string v3, "Mar. 5-7 (expected period start)"

    invoke-direct {v12, v1, v3}, Lf11/f;-><init>(ILjava/lang/String;)V

    new-instance v1, Lf11/e;

    const/16 v14, 0xbc0

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v15}, Lf11/e;-><init>(Lf11/b;ZZLjava/util/List;Ljava/util/List;ZZFFZLf11/f;Lf11/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v11, 0x0

    move-object v6, v0

    move-object v10, v1

    move-object/from16 v7, v16

    move-object/from16 v8, v17

    move-object/from16 v9, v18

    invoke-direct/range {v6 .. v11}, Lmm1/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lgz0/m0;Lf11/e;Lny0/h;)V

    sput-object v6, Lmm1/b;->b:Lmm1/c;

    return-void
.end method

.method public static synthetic a(Lmm1/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lmm1/b;->k(Lmm1/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmm1/b;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lmm1/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmm1/b;->h(Lkotlin/jvm/functions/Function1;Lmm1/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lmm1/c;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lmm1/b;->j(Lkotlin/jvm/functions/Function1;Lmm1/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lmm1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lmm1/b;->i(Lmm1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lmm1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmm1/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "mciTileState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    const v0, -0x33c693c4    # -4.860747E7f

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v3, p4, 0x2

    const/16 v4, 0x20

    if-eqz v3, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    move v6, v4

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit8 v6, v0, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v10, 0x1

    if-eq v6, v7, :cond_6

    move v6, v10

    goto :goto_5

    :cond_6
    move v6, v8

    :goto_5
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v9, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_e

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v6, :cond_7

    new-instance v3, Lm01/c;

    const/16 v5, 0x1c

    invoke-direct {v3, v5}, Lm01/c;-><init>(I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v12, v3

    goto :goto_6

    :cond_8
    move-object v12, v5

    :goto_6
    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v7, 0x3

    invoke-static {v3, v5, v7}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v13

    and-int/lit8 v3, v0, 0x70

    if-ne v3, v4, :cond_9

    move v3, v10

    goto :goto_7

    :cond_9
    move v3, v8

    :goto_7
    and-int/lit8 v4, v0, 0xe

    if-eq v4, v2, :cond_b

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_a

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_8

    :cond_a
    move v10, v8

    :cond_b
    :goto_8
    or-int v0, v3, v10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_c

    if-ne v3, v6, :cond_d

    :cond_c
    new-instance v3, Lmi2/o;

    const/4 v0, 0x1

    invoke-direct {v3, v0, v12, v1}, Lmi2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v17, v3

    check-cast v17, Lc93/a;

    const/16 v18, 0xf

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v9, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v4

    int-to-float v3, v7

    int-to-float v2, v2

    mul-float/2addr v3, v2

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    int-to-float v6, v8

    mul-float v7, v6, v2

    new-instance v2, Lj21/d;

    const/16 v6, 0x11

    invoke-direct {v2, v6, v1, v12}, Lj21/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v6, -0x2c528247

    invoke-static {v6, v9, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const/high16 v10, 0x1b0000

    const/16 v11, 0x18

    const/4 v6, 0x0

    move-object v2, v0

    invoke-static/range {v2 .. v11}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v12

    goto :goto_9

    :cond_e
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v3, v5

    :goto_9
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, Llq2/c;

    const/16 v5, 0xe

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Llq2/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final g(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lmm1/c;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lmm1/c;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lmm1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    and-int/lit8 v2, p3, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-eq v2, v5, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    and-int/lit8 v6, p3, 0x1

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v6, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x3

    invoke-static {v7, v8, v9}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v8, v5

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v8, v10

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    invoke-static {v10, v11, v12, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_1

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_1
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v12, v15, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v12, v10, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    invoke-static {v11, v12, v11, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v12, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Lb2/e;->K:Lb2/l;

    sget-object v11, Ll0/m;->g:Ll0/h;

    const/16 v2, 0x36

    invoke-static {v11, v9, v12, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v4, v12, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-eqz v9, :cond_4

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v12, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    invoke-static {v4, v12, v4, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v12, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lmm1/c;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v12, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v12, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->L()Lb91/a;

    move-result-object v27

    invoke-virtual {v2, v12, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v9

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v31, v4, 0x12

    const v32, 0x2fffa

    move v4, v8

    const/4 v8, 0x0

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/4 v5, 0x3

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    invoke-virtual {v0}, Lmm1/c;->c()Lgz0/m0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/m0;->toWhoopIcon()I

    move-result v7

    const/4 v15, 0x6

    invoke-static {v7, v12, v15}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v7

    const/4 v8, 0x4

    int-to-float v8, v8

    mul-float/2addr v8, v8

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v2, v12, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->Y0()J

    move-result-wide v10

    const/16 v13, 0x1b0

    const/4 v14, 0x0

    move v2, v8

    const/4 v8, 0x0

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x1

    invoke-static {v12, v3, v6, v2, v12}, Lhc3/i;->r(Lp1/q;ZLb2/t;FLp1/q;)V

    invoke-virtual {v0}, Lmm1/c;->a()Lf11/e;

    move-result-object v2

    sget v3, Lf11/e;->m:I

    const/4 v7, 0x0

    const/4 v8, 0x2

    invoke-static {v2, v7, v12, v3, v8}, Lf11/d;->h(Lf11/e;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0}, Lmm1/c;->e()Lny0/h;

    move-result-object v9

    if-nez v9, :cond_7

    const v0, 0xc13326b

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_3
    const/4 v3, 0x1

    goto :goto_4

    :cond_7
    const v2, 0xc13326c

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v12, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v7, Lny0/d;

    invoke-direct {v7}, Lny0/d;-><init>()V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_8

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_9

    :cond_8
    new-instance v3, Llq0/d;

    const/16 v2, 0xd

    invoke-direct {v3, v2, v1, v0}, Llq0/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v10, v3

    check-cast v10, Lkotlin/jvm/functions/Function1;

    sget v0, Lny0/h;->z:I

    shl-int/2addr v0, v5

    or-int/2addr v0, v15

    sget v1, Lny0/d;->a:I

    shl-int/lit8 v1, v1, 0x9

    or-int/2addr v0, v1

    move-object v11, v12

    move v12, v0

    invoke-virtual/range {v7 .. v12}, Lny0/d;->e(Landroidx/compose/ui/Modifier;Lny0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object v12, v11

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_3

    :goto_4
    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_a
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Lmm1/c;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lmm1/c;->e()Lny0/h;

    move-result-object p1

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lmm1/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lmm1/b;->f(Lmm1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
