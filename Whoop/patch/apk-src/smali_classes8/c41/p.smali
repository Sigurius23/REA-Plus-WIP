.class public abstract Lc41/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0002\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "",
        "Lc41/w;",
        "a",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "activityTileStates",
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
            "Lc41/w;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 46

    new-instance v0, Lc41/w;

    const-string v17, "TITLE"

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v3, Lc41/o;

    new-instance v6, Lkd1/o$a;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/c0;->j()I

    move-result v1

    invoke-direct {v6, v1}, Lkd1/o$a;-><init>(I)V

    const/16 v9, 0x1a

    const/4 v10, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Lc41/o;-><init>(ZLy81/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lc41/x$a;

    const-string v18, "PROCESS"

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v7, Lc41/i;->PROCESS_NOW:Lc41/i;

    const/16 v10, 0x1a

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Lc41/x$a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Object;Lc41/i;ZLi91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v19, v7

    sget-object v25, Lcom/whoop/navigation/ActivityDetailType;->SLEEP:Lcom/whoop/navigation/ActivityDetailType;

    const/16 v15, 0x3fe1

    const/16 v16, 0x0

    const/4 v1, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v5, v25

    invoke-direct/range {v0 .. v16}, Lc41/w;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lc41/o;Lc41/x;Lcom/whoop/navigation/ActivityDetailType;Lcom/whoop/service/network/model/cycles/Period;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Activity;Lc41/n1;ZLc41/g2;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lc41/w;

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    new-instance v2, Lc41/o;

    new-instance v5, Lkd1/o$a;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/c0;->j()I

    move-result v3

    invoke-direct {v5, v3}, Lkd1/o$a;-><init>(I)V

    const/16 v8, 0x1a

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v9}, Lc41/o;-><init>(ZLy81/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {}, Lc41/n;->r()Li91/a;

    move-result-object v11

    new-instance v6, Lc41/x$a;

    const/16 v12, 0xa

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object/from16 v9, v19

    invoke-direct/range {v6 .. v13}, Lc41/x$a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Object;Lc41/i;ZLi91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v33, Lc41/g2;->SHOW_ONBOARDING:Lc41/g2;

    const/16 v35, 0x2fe1

    const/16 v36, 0x0

    const/16 v21, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    move-object/from16 v20, v1

    move-object/from16 v23, v2

    move-object/from16 v24, v6

    invoke-direct/range {v20 .. v36}, Lc41/w;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lc41/o;Lc41/x;Lcom/whoop/navigation/ActivityDetailType;Lcom/whoop/service/network/model/cycles/Period;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Activity;Lc41/n1;ZLc41/g2;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lc41/w;

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    new-instance v3, Lc41/o;

    new-instance v6, Lkd1/o$a;

    invoke-static {}, Lc13/a;->a()I

    move-result v4

    invoke-direct {v6, v4}, Lkd1/o$a;-><init>(I)V

    const/16 v9, 0x1a

    const/4 v10, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v10}, Lc41/o;-><init>(ZLy81/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lc41/x$b;

    const-string v5, "Pending"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/4 v6, 0x2

    const/4 v8, 0x0

    invoke-direct {v4, v5, v8, v6, v7}, Lc41/x$b;-><init>(Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v35, 0x3fe1

    const/16 v33, 0x0

    move-object/from16 v20, v2

    move-object/from16 v23, v3

    move-object/from16 v24, v4

    invoke-direct/range {v20 .. v36}, Lc41/w;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lc41/o;Lc41/x;Lcom/whoop/navigation/ActivityDetailType;Lcom/whoop/service/network/model/cycles/Period;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Activity;Lc41/n1;ZLc41/g2;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lc41/w;

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v28

    new-instance v4, Lc41/o;

    sget-object v6, Ly81/f;->STRAIN:Ly81/f;

    new-instance v7, Lkd1/o$a;

    invoke-static {}, Lc13/a;->a()I

    move-result v5

    invoke-direct {v7, v5}, Lkd1/o$a;-><init>(I)V

    const-string v12, "12.1"

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/16 v10, 0x11

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Lc41/o;-><init>(ZLy81/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lc41/x$c;

    const-string v13, "8:00am"

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const-string v14, "9:00am"

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-direct {v5, v7, v8, v6}, Lc41/x$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    sget-object v34, Lcom/whoop/navigation/ActivityDetailType;->CARDIO:Lcom/whoop/navigation/ActivityDetailType;

    const/16 v41, 0x3fe1

    const/16 v42, 0x0

    const/16 v32, 0x0

    move-object/from16 v31, v34

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    move-object/from16 v26, v3

    move-object/from16 v29, v4

    move-object/from16 v30, v5

    invoke-direct/range {v26 .. v42}, Lc41/w;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lc41/o;Lc41/x;Lcom/whoop/navigation/ActivityDetailType;Lcom/whoop/service/network/model/cycles/Period;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Activity;Lc41/n1;ZLc41/g2;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lc41/w;

    move-object/from16 v34, v31

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v31

    new-instance v32, Lc41/o;

    new-instance v8, Lkd1/o$a;

    invoke-static {}, Lc13/a;->a()I

    move-result v5

    invoke-direct {v8, v5}, Lkd1/o$a;-><init>(I)V

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const/16 v11, 0x11

    const/4 v12, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    const/4 v10, 0x0

    move-object/from16 v5, v32

    invoke-direct/range {v5 .. v12}, Lc41/o;-><init>(ZLy81/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v7

    new-instance v5, Lc41/x$c;

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-direct {v5, v7, v8, v6}, Lc41/x$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    const/16 v44, 0x37e1

    const/16 v45, 0x0

    const/16 v30, 0x0

    const/16 v38, 0x0

    const/16 v41, 0x1

    const/16 v43, 0x0

    move-object/from16 v29, v4

    move-object/from16 v33, v5

    invoke-direct/range {v29 .. v45}, Lc41/w;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lc41/o;Lc41/x;Lcom/whoop/navigation/ActivityDetailType;Lcom/whoop/service/network/model/cycles/Period;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Activity;Lc41/n1;ZLc41/g2;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v20, Lc41/w;

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    new-instance v5, Lc41/o;

    sget-object v8, Ly81/f;->SLEEP:Ly81/f;

    move-object v7, v8

    new-instance v8, Lkd1/o$a;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/c0;->i()I

    move-result v6

    invoke-direct {v8, v6}, Lkd1/o$a;-><init>(I)V

    sget-object v11, Lgz0/m0;->NO_INTERNET:Lgz0/m0;

    move-object v10, v11

    const/16 v11, 0x9

    const/4 v6, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v12}, Lc41/o;-><init>(ZLy81/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lc41/x$c;

    const-string v14, "Start"

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const-string v15, "End"

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-direct {v6, v8, v9, v7}, Lc41/x$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    const/16 v35, 0x3fe1

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    move-object/from16 v23, v5

    move-object/from16 v24, v6

    invoke-direct/range {v20 .. v36}, Lc41/w;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lc41/o;Lc41/x;Lcom/whoop/navigation/ActivityDetailType;Lcom/whoop/service/network/model/cycles/Period;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Activity;Lc41/n1;ZLc41/g2;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v20

    new-instance v20, Lc41/w;

    const-string v6, "DIFF COLOR"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    new-instance v6, Lc41/o;

    new-instance v9, Lkd1/o$a;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v8

    invoke-virtual {v8}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v8

    invoke-virtual {v8}, Lgz0/c0;->i()I

    move-result v8

    invoke-direct {v9, v8}, Lkd1/o$a;-><init>(I)V

    const/16 v12, 0x9

    const/4 v13, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v13}, Lc41/o;-><init>(ZLy81/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v8

    move-object v10, v11

    new-instance v8, Lc41/x$c;

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-direct {v8, v9, v11, v7}, Lc41/x$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    sget-object v27, Ly81/f;->ACCENT_ALERT_TREND_15:Ly81/f;

    const/16 v35, 0x3fa1

    move-object/from16 v23, v6

    move-object/from16 v24, v8

    invoke-direct/range {v20 .. v36}, Lc41/w;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lc41/o;Lc41/x;Lcom/whoop/navigation/ActivityDetailType;Lcom/whoop/service/network/model/cycles/Period;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Activity;Lc41/n1;ZLc41/g2;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v16, v20

    new-instance v20, Lc41/w;

    const-string v6, "EXTREMELY LONG TITLE LET\'S SEE WHAT\'S GOING TO HAPPEN WISH ME LUCK"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    new-instance v6, Lc41/o;

    new-instance v9, Lkd1/o$a;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v8

    invoke-virtual {v8}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v8

    invoke-virtual {v8}, Lgz0/c0;->i()I

    move-result v8

    invoke-direct {v9, v8}, Lkd1/o$a;-><init>(I)V

    move-object v8, v7

    const/4 v7, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v13}, Lc41/o;-><init>(ZLy81/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v8

    new-instance v8, Lc41/x$c;

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-direct {v8, v9, v10, v7}, Lc41/x$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    const/16 v35, 0x3fe1

    const/16 v27, 0x0

    move-object/from16 v23, v6

    move-object/from16 v24, v8

    invoke-direct/range {v20 .. v36}, Lc41/w;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lc41/o;Lc41/x;Lcom/whoop/navigation/ActivityDetailType;Lcom/whoop/service/network/model/cycles/Period;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Activity;Lc41/n1;ZLc41/g2;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v16

    move-object/from16 v7, v20

    filled-new-array/range {v0 .. v7}, [Lc41/w;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lc41/p;->a:Ljava/util/List;

    return-void
.end method

.method public static final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc41/w;",
            ">;"
        }
    .end annotation

    sget-object v0, Lc41/p;->a:Ljava/util/List;

    return-object v0
.end method
