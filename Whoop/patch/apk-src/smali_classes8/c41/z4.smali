.class public abstract Lc41/z4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "Lc41/a5;",
        "a",
        "Ljava/util/List;",
        "k",
        "()Ljava/util/List;",
        "scheduleTileState",
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
            "Lc41/a5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 48

    new-instance v0, Lc41/a5;

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    const-string v14, "Day"

    invoke-direct {v1, v14}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v3, Lcom/whoop/design/util/TextResource$e;

    const-string v15, "7:00am"

    invoke-direct {v3, v15}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v7, Lcom/whoop/design/util/TextResource$e;

    const-string v1, "Edit"

    invoke-direct {v7, v1}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v8, Lcom/whoop/design/util/TextResource$e;

    const-string v4, "Delete"

    invoke-direct {v8, v4}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v10, Lbo2/a;

    const/16 v5, 0x13

    invoke-direct {v10, v5}, Lbo2/a;-><init>(I)V

    new-instance v11, Lbo2/a;

    const/16 v5, 0x14

    invoke-direct {v11, v5}, Lbo2/a;-><init>(I)V

    const/16 v12, 0x121

    const/4 v13, 0x0

    move-object v5, v1

    const/4 v1, 0x0

    move-object v6, v4

    const/4 v4, 0x1

    move-object v9, v5

    const/4 v5, 0x0

    move-object/from16 v16, v6

    const/4 v6, 0x0

    move-object/from16 v17, v9

    const/4 v9, 0x0

    move-object/from16 v18, v14

    move-object/from16 v19, v16

    move-object/from16 v14, v17

    invoke-direct/range {v0 .. v13}, Lc41/a5;-><init>(Ly81/f;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZZLhy0/h1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v20, Lc41/a5;

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    const-string v2, "Mon"

    invoke-direct {v1, v2}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v2, Lcom/whoop/design/util/TextResource$e;

    const-string v3, "Tue"

    invoke-direct {v2, v3}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v3, Lcom/whoop/design/util/TextResource$e;

    const-string v4, "Wed"

    invoke-direct {v3, v4}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v4, Lcom/whoop/design/util/TextResource$e;

    const-string v5, "Thu"

    invoke-direct {v4, v5}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v5, Lcom/whoop/design/util/TextResource$e;

    const-string v6, "Fri"

    invoke-direct {v5, v6}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v6, Lcom/whoop/design/util/TextResource$e;

    const-string v7, "Sat"

    invoke-direct {v6, v7}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v7, Lcom/whoop/design/util/TextResource$e;

    const-string v8, "Sun"

    invoke-direct {v7, v8}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    filled-new-array/range {v1 .. v7}, [Lcom/whoop/design/util/TextResource$e;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v22

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v1, v15}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v2, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v2, v14}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v3, Lcom/whoop/design/util/TextResource$e;

    move-object/from16 v6, v19

    invoke-direct {v3, v6}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v4, Lbo2/a;

    const/16 v5, 0x15

    invoke-direct {v4, v5}, Lbo2/a;-><init>(I)V

    new-instance v5, Lbo2/a;

    const/16 v7, 0x16

    invoke-direct {v5, v7}, Lbo2/a;-><init>(I)V

    const/16 v32, 0x131

    const/16 v33, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x1

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    move-object/from16 v23, v1

    move-object/from16 v27, v2

    move-object/from16 v28, v3

    move-object/from16 v30, v4

    move-object/from16 v31, v5

    invoke-direct/range {v20 .. v33}, Lc41/a5;-><init>(Ly81/f;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZZLhy0/h1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v20

    new-instance v19, Lc41/a5;

    new-instance v2, Lcom/whoop/design/util/TextResource$e;

    move-object/from16 v3, v18

    invoke-direct {v2, v3}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v21

    new-instance v2, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v2, v15}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v22, Lhy0/h1;

    new-instance v4, Lcom/whoop/design/util/TextResource$e;

    const-string v5, "Alarm On"

    invoke-direct {v4, v5}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v7, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v8

    invoke-virtual {v8}, Lgz0/o0;->n()Lgz0/g0;

    move-result-object v8

    invoke-virtual {v8}, Lgz0/g0;->d()I

    move-result v8

    const/4 v10, 0x2

    invoke-direct {v7, v8, v9, v10, v9}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v25, Ly81/f;->RECOVERY_HIGH_RECOVERY:Ly81/f;

    sget-object v27, Ly81/f;->BLACK_50:Ly81/f;

    const v45, 0x3fffe8

    const/16 v46, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

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

    move-object/from16 v23, v4

    move-object/from16 v24, v7

    invoke-direct/range {v22 .. v46}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v25

    move-object/from16 v7, v27

    new-instance v8, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v8, v14}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v11, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v11, v6}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v12, Lbo2/a;

    const/16 v13, 0x17

    invoke-direct {v12, v13}, Lbo2/a;-><init>(I)V

    new-instance v13, Lbo2/a;

    const/16 v9, 0x18

    invoke-direct {v13, v9}, Lbo2/a;-><init>(I)V

    const/16 v31, 0x101

    const/16 v20, 0x0

    const/16 v23, 0x1

    const/16 v24, 0x1

    move-object/from16 v26, v8

    move-object/from16 v27, v11

    move-object/from16 v29, v12

    move-object/from16 v30, v13

    move-object/from16 v25, v22

    move-object/from16 v22, v2

    invoke-direct/range {v19 .. v32}, Lc41/a5;-><init>(Ly81/f;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZZLhy0/h1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v19

    new-instance v17, Lc41/a5;

    new-instance v8, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v8, v3}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    new-instance v3, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v3, v15}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v23, Lhy0/h1;

    new-instance v8, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v8, v5}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v5, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v9

    invoke-virtual {v9}, Lgz0/o0;->n()Lgz0/g0;

    move-result-object v9

    invoke-virtual {v9}, Lgz0/g0;->d()I

    move-result v9

    const/4 v11, 0x0

    invoke-direct {v5, v9, v11, v10, v11}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v46, 0x3fffe8

    const/16 v47, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v45, 0x0

    move-object/from16 v26, v4

    move-object/from16 v25, v5

    move-object/from16 v28, v7

    move-object/from16 v24, v8

    invoke-direct/range {v23 .. v47}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v4, v14}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v5, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v5, v6}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v7, Lbo2/a;

    const/16 v8, 0x19

    invoke-direct {v7, v8}, Lbo2/a;-><init>(I)V

    new-instance v8, Lbo2/a;

    const/16 v9, 0x1a

    invoke-direct {v8, v9}, Lbo2/a;-><init>(I)V

    const/16 v29, 0x101

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v26, 0x0

    move-object/from16 v20, v3

    move-object/from16 v24, v4

    move-object/from16 v25, v5

    move-object/from16 v27, v7

    move-object/from16 v28, v8

    invoke-direct/range {v17 .. v30}, Lc41/a5;-><init>(Ly81/f;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZZLhy0/h1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v17

    new-instance v16, Lc41/a5;

    new-instance v4, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v4, v15}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v5, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v5, v14}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v7, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v7, v6}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v6, Lbo2/a;

    const/16 v8, 0x1b

    invoke-direct {v6, v8}, Lbo2/a;-><init>(I)V

    new-instance v8, Lbo2/a;

    const/16 v9, 0x1c

    invoke-direct {v8, v9}, Lbo2/a;-><init>(I)V

    const/16 v28, 0x131

    const/16 v29, 0x0

    const/16 v17, 0x0

    sget-object v18, Lm83/y;->w:Lm83/y;

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    move-object/from16 v19, v4

    move-object/from16 v23, v5

    move-object/from16 v26, v6

    move-object/from16 v24, v7

    move-object/from16 v27, v8

    invoke-direct/range {v16 .. v29}, Lc41/a5;-><init>(Ly81/f;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZZLhy0/h1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v16

    filled-new-array {v0, v1, v2, v3, v4}, [Lc41/a5;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lc41/z4;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lc41/z4;->s()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lc41/z4;->r()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lc41/z4;->p()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Lc41/z4;->t()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Ll83/a0;
    .locals 1

    invoke-static {}, Lc41/z4;->q()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Lc41/z4;->u()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g()Ll83/a0;
    .locals 1

    invoke-static {}, Lc41/z4;->o()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h()Ll83/a0;
    .locals 1

    invoke-static {}, Lc41/z4;->m()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i()Ll83/a0;
    .locals 1

    invoke-static {}, Lc41/z4;->n()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic j()Ll83/a0;
    .locals 1

    invoke-static {}, Lc41/z4;->l()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc41/a5;",
            ">;"
        }
    .end annotation

    sget-object v0, Lc41/z4;->a:Ljava/util/List;

    return-object v0
.end method

.method private static final l()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final o()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final p()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final q()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final r()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final s()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final t()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final u()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
