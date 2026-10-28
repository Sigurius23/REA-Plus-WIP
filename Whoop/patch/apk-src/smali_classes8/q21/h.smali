.class public abstract Lq21/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0002\u001a\u000f\u0010\u0005\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0002\"\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\"\u0017\u0010\u0012\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0008\u001a\u0004\u0008\u0011\u0010\n\u00a8\u0006\u0013"
    }
    d2 = {
        "Ll83/a0;",
        "k",
        "(Landroidx/compose/runtime/Composer;I)V",
        "i",
        "g",
        "e",
        "Lq21/i;",
        "a",
        "Lq21/i;",
        "m",
        "()Lq21/i;",
        "fakeMembershipComparisonTableLifeVsPeakDowngrade",
        "Lq21/d$c;",
        "b",
        "Lq21/d$c;",
        "fakeCrossIcon",
        "c",
        "getFakeMembershipComparisonTableAdvancedLabs",
        "fakeMembershipComparisonTableAdvancedLabs",
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
.field private static final a:Lq21/i;

.field private static final b:Lq21/d$c;

.field private static final c:Lq21/i;


# direct methods
.method static constructor <clinit>()V
    .locals 54

    sget-object v0, Lq21/d$a;->a:Lq21/d$a;

    new-instance v1, Lq21/d$g;

    const-string v2, "YOUR PLAN"

    invoke-direct {v1, v2}, Lq21/d$g;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x3

    new-array v3, v2, [Lq21/d;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v5, 0x1

    aput-object v0, v3, v5

    const/4 v6, 0x2

    aput-object v1, v3, v6

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v3, Lq21/d$d;

    new-instance v7, Lkd1/o$a;

    sget v8, Luv0/b;->a:I

    invoke-direct {v7, v8}, Lkd1/o$a;-><init>(I)V

    invoke-direct {v3, v7}, Lq21/d$d;-><init>(Lkd1/o;)V

    new-instance v7, Lq21/d$d;

    new-instance v8, Lkd1/o$a;

    sget v9, Luv0/b;->a:I

    invoke-direct {v8, v9}, Lkd1/o$a;-><init>(I)V

    invoke-direct {v7, v8}, Lq21/d$d;-><init>(Lkd1/o;)V

    new-array v8, v2, [Lq21/d;

    aput-object v0, v8, v4

    aput-object v3, v8, v5

    aput-object v7, v8, v6

    invoke-static {v8}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance v7, Lq21/d$f;

    const-string v8, "Annual Cost"

    invoke-direct {v7, v8}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v9, Lq21/d$e;

    sget-object v10, Lq21/e;->h:Lq21/e$c;

    const-string v11, "DOWNGRADE"

    invoke-virtual {v10, v11}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v12

    const-string v13, "$239"

    invoke-direct {v9, v13, v12}, Lq21/d$e;-><init>(Ljava/lang/String;Lq21/e;)V

    new-instance v12, Lq21/d$e;

    const-string v13, "LIFE"

    invoke-virtual {v10, v13}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v14

    const-string v15, "$359"

    invoke-direct {v12, v15, v14}, Lq21/d$e;-><init>(Ljava/lang/String;Lq21/e;)V

    new-array v14, v2, [Lq21/d;

    aput-object v7, v14, v4

    aput-object v9, v14, v5

    aput-object v12, v14, v6

    invoke-static {v14}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    new-instance v9, Lq21/d$f;

    const-string v12, "All Peak Features"

    invoke-direct {v9, v12}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v14, Lq21/d$c;

    sget-object v15, Lgz0/m0;->TINY_CHECKMARK:Lgz0/m0;

    move/from16 v16, v4

    invoke-virtual {v10, v11}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v4

    invoke-direct {v14, v15, v4}, Lq21/d$c;-><init>(Lgz0/m0;Lq21/e;)V

    new-instance v4, Lq21/d$c;

    move/from16 v17, v5

    invoke-virtual {v10, v13}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v5

    invoke-direct {v4, v15, v5}, Lq21/d$c;-><init>(Lgz0/m0;Lq21/e;)V

    new-array v5, v2, [Lq21/d;

    aput-object v9, v5, v16

    aput-object v14, v5, v17

    aput-object v4, v5, v6

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    new-instance v5, Lq21/d$f;

    const-string v9, "AFib / Irregular Rythms"

    invoke-direct {v5, v9}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v14, Lq21/d$f;

    move/from16 v18, v6

    const-string v6, "-"

    invoke-direct {v14, v6}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v2, Lq21/d$c;

    move-object/from16 v19, v0

    invoke-virtual {v10, v13}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v0

    invoke-direct {v2, v15, v0}, Lq21/d$c;-><init>(Lgz0/m0;Lq21/e;)V

    move-object/from16 v20, v1

    const/4 v0, 0x3

    new-array v1, v0, [Lq21/d;

    aput-object v5, v1, v16

    aput-object v14, v1, v17

    aput-object v2, v1, v18

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lq21/d$f;

    const-string v2, "ECG Heart Screener"

    invoke-direct {v1, v2}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v5, Lq21/d$f;

    invoke-direct {v5, v6}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v14, Lq21/d$c;

    move-object/from16 v21, v0

    invoke-virtual {v10, v13}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v0

    invoke-direct {v14, v15, v0}, Lq21/d$c;-><init>(Lgz0/m0;Lq21/e;)V

    move-object/from16 v22, v1

    const/4 v0, 0x3

    new-array v1, v0, [Lq21/d;

    aput-object v22, v1, v16

    aput-object v5, v1, v17

    aput-object v14, v1, v18

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lq21/d$f;

    const-string v5, "Relative Blood Pressure"

    invoke-direct {v1, v5}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v14, Lq21/d$f;

    invoke-direct {v14, v6}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v6, Lq21/d$c;

    invoke-virtual {v10, v13}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v13

    invoke-direct {v6, v15, v13}, Lq21/d$c;-><init>(Lgz0/m0;Lq21/e;)V

    move-object/from16 v22, v0

    const/4 v13, 0x3

    new-array v0, v13, [Lq21/d;

    aput-object v1, v0, v16

    aput-object v14, v0, v17

    aput-object v6, v0, v18

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x7

    new-array v6, v1, [Ljava/util/List;

    aput-object v20, v6, v16

    aput-object v3, v6, v17

    aput-object v7, v6, v18

    aput-object v4, v6, v13

    const/4 v3, 0x4

    aput-object v21, v6, v3

    const/4 v4, 0x5

    aput-object v22, v6, v4

    const/4 v7, 0x6

    aput-object v0, v6, v7

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v22

    invoke-virtual {v10, v11}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v0

    invoke-virtual {v0}, Lq21/e;->c()Li2/t;

    move-result-object v23

    new-instance v20, Lq21/i;

    const/16 v27, 0x20

    const/16 v28, 0x0

    const/16 v21, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v20 .. v28}, Lq21/i;-><init>(ILjava/util/List;Li2/t;Lny0/h;Lny0/p0;Lq21/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v20, Lq21/h;->a:Lq21/i;

    new-instance v0, Lq21/d$c;

    sget-object v6, Lgz0/m0;->CROSS:Lgz0/m0;

    const-string v11, "ADVANCED_LABS"

    invoke-virtual {v10, v11}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v20

    sget-object v13, Lq21/h$e;->w:Lq21/h$e;

    invoke-static {v13}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v21

    sget-object v13, Lq21/h$f;->w:Lq21/h$f;

    invoke-static {v13}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v26

    const/16 v28, 0x5e

    const/16 v29, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v27, 0x0

    invoke-static/range {v20 .. v29}, Lq21/e;->b(Lq21/e;Ly81/e;Li2/t;Li2/t;Lq21/f;Lt0/i;Ly81/e;Ly81/e;ILjava/lang/Object;)Lq21/e;

    move-result-object v13

    invoke-direct {v0, v6, v13}, Lq21/d$c;-><init>(Lgz0/m0;Lq21/e;)V

    sput-object v0, Lq21/h;->b:Lq21/d$c;

    new-instance v6, Lq21/d$g;

    const-string v13, ""

    invoke-direct {v6, v13}, Lq21/d$g;-><init>(Ljava/lang/String;)V

    const/4 v13, 0x3

    new-array v14, v13, [Lq21/d;

    aput-object v19, v14, v16

    aput-object v6, v14, v17

    aput-object v19, v14, v18

    invoke-static {v14}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    new-instance v13, Lq21/d$b;

    const-string v14, "OTHERS"

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-direct {v13, v14}, Lq21/d$b;-><init>(Lcom/whoop/design/util/TextResource;)V

    new-instance v14, Lq21/d$d;

    move/from16 v20, v3

    new-instance v3, Lkd1/o$a;

    move/from16 v21, v4

    sget v4, Lgy0/a;->Q4:I

    invoke-direct {v3, v4}, Lkd1/o$a;-><init>(I)V

    invoke-direct {v14, v3}, Lq21/d$d;-><init>(Lkd1/o;)V

    const/4 v3, 0x3

    new-array v4, v3, [Lq21/d;

    aput-object v19, v4, v16

    aput-object v13, v4, v17

    aput-object v14, v4, v18

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance v4, Lq21/d$f;

    invoke-direct {v4, v8}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v8, Lq21/d$e;

    const-string v13, "$239/test"

    invoke-virtual {v10, v11}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v14

    invoke-direct {v8, v13, v14}, Lq21/d$e;-><init>(Ljava/lang/String;Lq21/e;)V

    new-instance v13, Lq21/d$e;

    const-string v14, "$359/test"

    move/from16 v19, v7

    invoke-virtual {v10, v11}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v7

    invoke-direct {v13, v14, v7}, Lq21/d$e;-><init>(Ljava/lang/String;Lq21/e;)V

    const/4 v7, 0x3

    new-array v14, v7, [Lq21/d;

    aput-object v4, v14, v16

    aput-object v8, v14, v17

    aput-object v13, v14, v18

    invoke-static {v14}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    new-instance v7, Lq21/d$f;

    invoke-direct {v7, v12}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v8, Lq21/d$c;

    invoke-virtual {v10, v11}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v22

    sget-object v12, Lq21/h$g;->w:Lq21/h$g;

    invoke-static {v12}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v28

    sget-object v12, Lq21/h$h;->w:Lq21/h$h;

    invoke-static {v12}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v23

    const/16 v30, 0x5e

    const/16 v31, 0x0

    const/16 v26, 0x0

    invoke-static/range {v22 .. v31}, Lq21/e;->b(Lq21/e;Ly81/e;Li2/t;Li2/t;Lq21/f;Lt0/i;Ly81/e;Ly81/e;ILjava/lang/Object;)Lq21/e;

    move-result-object v12

    invoke-direct {v8, v15, v12}, Lq21/d$c;-><init>(Lgz0/m0;Lq21/e;)V

    new-instance v12, Lq21/d$c;

    invoke-virtual {v10, v11}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v13

    invoke-direct {v12, v15, v13}, Lq21/d$c;-><init>(Lgz0/m0;Lq21/e;)V

    const/4 v13, 0x3

    new-array v14, v13, [Lq21/d;

    aput-object v7, v14, v16

    aput-object v8, v14, v17

    aput-object v12, v14, v18

    invoke-static {v14}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    new-instance v8, Lq21/d$f;

    invoke-direct {v8, v9}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v9, Lq21/d$c;

    invoke-virtual {v10, v11}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v12

    invoke-direct {v9, v15, v12}, Lq21/d$c;-><init>(Lgz0/m0;Lq21/e;)V

    new-array v12, v13, [Lq21/d;

    aput-object v8, v12, v16

    aput-object v0, v12, v17

    aput-object v9, v12, v18

    invoke-static {v12}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    new-instance v9, Lq21/d$f;

    invoke-direct {v9, v2}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v2, Lq21/d$c;

    invoke-virtual {v10, v11}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v12

    invoke-direct {v2, v15, v12}, Lq21/d$c;-><init>(Lgz0/m0;Lq21/e;)V

    new-array v12, v13, [Lq21/d;

    aput-object v9, v12, v16

    aput-object v0, v12, v17

    aput-object v2, v12, v18

    invoke-static {v12}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v9, Lq21/d$f;

    invoke-direct {v9, v5}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v5, Lq21/d$c;

    invoke-virtual {v10, v11}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v12

    invoke-direct {v5, v15, v12}, Lq21/d$c;-><init>(Lgz0/m0;Lq21/e;)V

    new-array v12, v13, [Lq21/d;

    aput-object v9, v12, v16

    aput-object v0, v12, v17

    aput-object v5, v12, v18

    invoke-static {v12}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-array v1, v1, [Ljava/util/List;

    aput-object v6, v1, v16

    aput-object v3, v1, v17

    aput-object v4, v1, v18

    aput-object v7, v1, v13

    aput-object v8, v1, v20

    aput-object v2, v1, v21

    aput-object v0, v1, v19

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v24

    invoke-virtual {v10, v11}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v0

    invoke-virtual {v0}, Lq21/e;->c()Li2/t;

    move-result-object v25

    new-instance v0, Lny0/p0;

    const-string v1, "LEARN MORE"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v2, Lcom/whoop/navigation/e;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v15, 0x3ffc

    const/16 v16, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v0 .. v16}, Lny0/p0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly71/g;Ly71/g;Ly81/e;Lj91/b;ZLjava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lj02/s;Lk81/a;ZLny0/m0;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v26, Lny0/h;

    const-string v1, "Start Testing"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v27

    sget-object v33, Lny0/p;->HIGHLIGHT:Lny0/p;

    const v52, 0x1ffffbe

    const/16 v53, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

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

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    invoke-direct/range {v26 .. v53}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v22, Lq21/i;

    const/16 v29, 0x20

    const/16 v23, 0x2

    move-object/from16 v27, v0

    invoke-direct/range {v22 .. v30}, Lq21/i;-><init>(ILjava/util/List;Li2/t;Lny0/h;Lny0/p0;Lq21/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v22, Lq21/h;->c:Lq21/i;

    return-void
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lq21/h;->f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lq21/h;->l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lq21/h;->j(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lq21/h;->h(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x21b45099

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lq21/h$a;

    invoke-direct {v1}, Lq21/h$a;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lm22/t;

    const/16 v1, 0x18

    invoke-direct {v0, p1, v1}, Lm22/t;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lq21/h;->e(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x3dabb9c5

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lq21/h$b;

    invoke-direct {v1}, Lq21/h$b;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lm22/t;

    const/16 v1, 0x1a

    invoke-direct {v0, p1, v1}, Lm22/t;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final h(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lq21/h;->g(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x12914ad8

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lq21/h$c;

    invoke-direct {v1}, Lq21/h$c;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lm22/t;

    const/16 v1, 0x19

    invoke-direct {v0, p1, v1}, Lm22/t;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final j(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lq21/h;->i(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x3860ebe0    # -81448.25f

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lq21/h$d;

    invoke-direct {v1}, Lq21/h$d;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lm22/t;

    const/16 v1, 0x17

    invoke-direct {v0, p1, v1}, Lm22/t;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lq21/h;->k(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final m()Lq21/i;
    .locals 1

    sget-object v0, Lq21/h;->a:Lq21/i;

    return-object v0
.end method
