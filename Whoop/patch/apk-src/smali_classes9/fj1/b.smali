.class public abstract Lfj1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0002\u0008\u0006\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u0017\u0010\u000f\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0017\u0010\u0015\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u0017\u0010\u0018\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u000c\u001a\u0004\u0008\u0017\u0010\u000e\"\u001d\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lfj1/c;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Lfj1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lkd1/o$a;",
        "a",
        "Lkd1/o$a;",
        "getSampleTitleImage",
        "()Lkd1/o$a;",
        "sampleTitleImage",
        "Lgz0/m0;",
        "b",
        "Lgz0/m0;",
        "getSampleEndIcon",
        "()Lgz0/m0;",
        "sampleEndIcon",
        "c",
        "getSampleBackgroundImage",
        "sampleBackgroundImage",
        "",
        "d",
        "Ljava/util/List;",
        "getSampleEntryPointLockedCardStates",
        "()Ljava/util/List;",
        "sampleEntryPointLockedCardStates",
        "health_release"
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
.field private static final a:Lkd1/o$a;

.field private static final b:Lgz0/m0;

.field private static final c:Lkd1/o$a;

.field private static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lfj1/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 34

    new-instance v3, Lkd1/o$a;

    sget v0, Lgy0/a;->c2:I

    invoke-direct {v3, v0}, Lkd1/o$a;-><init>(I)V

    sput-object v3, Lfj1/b;->a:Lkd1/o$a;

    sget-object v5, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    sput-object v5, Lfj1/b;->b:Lgz0/m0;

    new-instance v6, Lkd1/o$a;

    sget v0, Lgy0/a;->Q4:I

    invoke-direct {v6, v0}, Lkd1/o$a;-><init>(I)V

    sput-object v6, Lfj1/b;->c:Lkd1/o$a;

    new-instance v0, Lfj1/c;

    const-string v18, "HealthSpan"

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v19, "Unlock your WHOOP Age and Pace of Aging"

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const-string v1, "Last updated on June 25"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    new-instance v8, Lcom/whoop/navigation/e;

    const/4 v12, 0x7

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v10, 0x100

    const-string v1, "ENTITLEMENT_HEALTHSPAN"

    invoke-direct/range {v0 .. v11}, Lfj1/c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v20, v0

    new-instance v0, Lfj1/c;

    const-string v1, "Stress Monitor"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v1, "Measure and track your stress and get guided breathwork exercises. "

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v7, Lcom/whoop/navigation/e;

    const/4 v11, 0x7

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v10, 0x140

    const/4 v11, 0x0

    const-string v1, "ENTITLEMENT_HEALTH_MONITOR"

    move-object v8, v7

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v11}, Lfj1/c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v21, v0

    new-instance v9, Lfj1/c;

    const-string v0, "Blood pressure monitor"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const-string v0, "Track your blood pressure trends over time and get coaching to improve. "

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    new-instance v11, Lcom/whoop/navigation/e;

    const/4 v15, 0x7

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v16, 0x154

    const/16 v17, 0x0

    const-string v7, "ENTITLEMENT_BLOOD_PRESSURE"

    move-object v12, v6

    move-object v6, v9

    const/4 v9, 0x0

    move-object v14, v11

    const/4 v11, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v6 .. v17}, Lfj1/c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v12, v6

    new-instance v0, Lfj1/c;

    const-string v1, "Health Monitor"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v1, "Get alerts when your metrics are out of range. "

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v6, Lcom/whoop/navigation/e;

    const/4 v10, 0x7

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v10, 0x160

    const-string v1, "ENTITLEMENT_HEART_SCREENER"

    move-object v8, v6

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v11}, Lfj1/c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v13, v0

    new-instance v22, Lfj1/c;

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    const/16 v32, 0x1f4

    const/16 v33, 0x0

    const-string v23, "ENTITLEMENT_HEALTH_SPAN"

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v22 .. v33}, Lfj1/c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lfj1/c;

    const-string v1, "Lorem Ipsum Dolor Sit Amet, Lorem Ipsum Dolor Sit Amet. Lorem."

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v1, "Lorem! Ipsum Dolor Sit Amet, Lorem! Ipsum Dolor Sit Amet, Lorem? Ipsum Dolor. Sit Amet! Lorem."

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v6, Lcom/whoop/navigation/e;

    const/4 v10, 0x7

    const/4 v8, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v10, 0x160

    const-string v1, "ENTITLEMENT_HEART_SCREENER"

    move-object v8, v6

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v11}, Lfj1/c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v9, v12

    move-object v10, v13

    move-object/from16 v7, v20

    move-object/from16 v8, v21

    move-object/from16 v11, v22

    move-object v12, v0

    filled-new-array/range {v7 .. v12}, [Lfj1/c;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lfj1/b;->d:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Lfj1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lfj1/b;->f(Lfj1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lfj1/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lfj1/b;->i(Landroidx/compose/ui/Modifier;Lfj1/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lfj1/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfj1/b;->g(Lfj1/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lfj1/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lfj1/b;->h(Landroidx/compose/ui/Modifier;Lfj1/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lfj1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lfj1/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v6, p1

    move-object/from16 v5, p2

    move/from16 v1, p4

    const-string v0, "state"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, -0x5ac228e2

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p5, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v1, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v1, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v1

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v1

    :goto_1
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_4
    and-int/lit16 v7, v1, 0x180

    const/16 v8, 0x100

    if-nez v7, :cond_6

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    move v7, v8

    goto :goto_3

    :cond_5
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v4, v7

    :cond_6
    and-int/lit16 v7, v4, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v7, v9, :cond_7

    move v7, v11

    goto :goto_4

    :cond_7
    move v7, v10

    :goto_4
    and-int/lit8 v9, v4, 0x1

    invoke-virtual {v0, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_d

    if-eqz v2, :cond_8

    sget-object v2, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_8
    move-object v2, v3

    :goto_5
    invoke-virtual {v6}, Lfj1/c;->c()Lcom/whoop/navigation/e;

    move-result-object v3

    if-eqz v3, :cond_9

    move v3, v11

    goto :goto_6

    :cond_9
    move v3, v10

    :goto_6
    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    and-int/lit16 v4, v4, 0x380

    if-ne v4, v8, :cond_a

    move v10, v11

    :cond_a
    or-int v4, v7, v10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_b

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v7, v4, :cond_c

    :cond_b
    new-instance v7, Lfd3/a;

    const/4 v4, 0x2

    invoke-direct {v7, v4, v6, v5}, Lfd3/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3, v7}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-string v4, "EntryPointLockedCard"

    invoke-static {v3, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v3, Lf01/f;

    const/16 v4, 0x8

    invoke-direct {v3, v4, v2, v6}, Lf01/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v4, 0x61a118e

    invoke-static {v4, v0, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    const/high16 v17, 0xc00000

    const/16 v18, 0x7e

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v0

    invoke-static/range {v7 .. v18}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v2

    goto :goto_7

    :cond_d
    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    move-object v4, v3

    :goto_7
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_e

    new-instance v0, Lf02/c;

    const/4 v3, 0x4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lf02/c;-><init>(IIILandroidx/compose/ui/Modifier;Ll83/e;Lm91/u;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final f(Lfj1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string v0, "$this$applyIf"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf1/w1;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p0, p1}, Lf1/w1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p0, 0x3

    const/4 p1, 0x0

    const/4 v1, 0x0

    invoke-static {p2, p1, v1, v0, p0}, Landroidx/room/c1;->i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lfj1/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lfj1/c;->c()Lcom/whoop/navigation/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lfj1/c;->c()Lcom/whoop/navigation/e;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Landroidx/compose/ui/Modifier;Lfj1/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 50

    sget-object v0, Lb2/e;->w:Lb2/m;

    and-int/lit8 v1, p3, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    and-int/lit8 v5, p3, 0x1

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1d

    int-to-float v1, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v1, v5

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v12}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v14, Ll0/m;->c:Ll0/g;

    sget-object v15, Lb2/e;->M:Lb2/k;

    invoke-static {v14, v15, v13, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v13, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v13, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-eqz v11, :cond_1

    invoke-virtual {v13, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_1
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v13, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v13, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v4, v13, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    invoke-static {v8, v13, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v13, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v4, 0x3f800000    # 1.0f

    move-object/from16 v6, p0

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Ll0/m;->a:Ll0/e;

    sget-object v4, Lb2/e;->J:Lb2/l;

    invoke-static {v8, v4, v13, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    move-object/from16 p0, v4

    iget-wide v3, v13, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v13, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v13}, Lp1/q;->i0()V

    move/from16 p3, v1

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-eqz v1, :cond_4

    invoke-virtual {v13, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v13, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-nez v1, :cond_5

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    :cond_5
    invoke-static {v3, v13, v3, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v13, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lfj1/c;->i()Lkd1/o;

    move-result-object v6

    const/4 v1, 0x4

    if-nez v6, :cond_7

    const v3, 0x44fff364

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    move-object/from16 v34, v0

    move-object/from16 v35, v2

    move v6, v3

    move/from16 v33, v5

    move-object v0, v7

    move-object/from16 v36, v9

    move-object v4, v10

    move-object v5, v11

    move-object v2, v12

    move-object v3, v14

    move-object v1, v15

    goto/16 :goto_3

    :cond_7
    const v3, 0x44fff365

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    const/16 v3, 0xc

    int-to-float v3, v3

    int-to-float v4, v1

    mul-float/2addr v3, v4

    invoke-static {v3, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/4 v3, 0x1

    int-to-float v4, v3

    mul-float v19, v4, v5

    const/16 v20, 0x0

    const/16 v21, 0xb

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object v4, v10

    sget v10, Lkd1/o;->a:I

    move-object v8, v11

    const/4 v11, 0x3

    move-object/from16 v16, v7

    const/4 v7, 0x0

    move-object/from16 v17, v8

    const/4 v8, 0x0

    move-object/from16 v49, v13

    move-object v13, v9

    move-object/from16 v9, v49

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    move-object/from16 v28, v9

    move-object v7, v14

    const/16 v14, 0x1b0

    move-object v8, v15

    const/16 v15, 0x78

    move-object v9, v7

    const/4 v7, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move-object/from16 v19, v12

    const/4 v12, 0x0

    move-object/from16 v34, v0

    move-object/from16 v35, v2

    move/from16 v33, v5

    move-object v1, v8

    move-object/from16 v36, v13

    move-object/from16 v0, v16

    move-object/from16 v5, v17

    move-object/from16 v2, v19

    move-object/from16 v13, v28

    move-object v8, v3

    move-object/from16 v3, v18

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    const/4 v6, 0x0

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    :goto_3
    invoke-static {v3, v1, v13, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v6, v13, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v13, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-eqz v8, :cond_8

    invoke-virtual {v13, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_8
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v13, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-nez v1, :cond_9

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    :cond_9
    move-object/from16 v1, v36

    goto :goto_6

    :cond_a
    move-object/from16 v1, v36

    :goto_5
    move-object/from16 v3, v35

    goto :goto_7

    :goto_6
    invoke-static {v3, v13, v3, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_5

    :goto_7
    invoke-static {v13, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v6, Ll0/f;->c:Ll0/e;

    const/4 v8, 0x6

    move-object/from16 v9, p0

    invoke-static {v6, v9, v13, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v9, v13, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v13, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-eqz v11, :cond_b

    invoke-virtual {v13, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v13, v5, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v13, Lp1/q;->S:Z

    if-nez v6, :cond_c

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_d

    :cond_c
    invoke-static {v9, v13, v9, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v13, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lfj1/c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v6, v13, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v13, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->r()Lb91/a;

    move-result-object v26

    invoke-virtual {v9, v13, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v11

    const v14, 0x3f666666    # 0.9f

    move-object v15, v9

    float-to-double v8, v14

    const-wide/16 v35, 0x0

    cmpl-double v8, v8, v35

    const-string v37, "invalid weight; must be greater than zero"

    if-lez v8, :cond_e

    :goto_9
    move v8, v7

    goto :goto_a

    :cond_e
    invoke-static/range {v37 .. v37}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_9

    :goto_a
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v38, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v9, v14, v38

    if-lez v9, :cond_f

    move/from16 v14, v38

    :cond_f
    const/4 v9, 0x1

    invoke-direct {v7, v14, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v9, v9, 0x12

    or-int/lit16 v14, v9, 0xc30

    const v31, 0x2d7f8

    move/from16 v16, v8

    move/from16 v30, v9

    move-wide v8, v11

    move v12, v10

    const-wide/16 v10, 0x0

    move/from16 v17, v12

    const/4 v12, 0x0

    move-object/from16 v28, v13

    const/4 v13, 0x0

    move/from16 v18, v30

    move/from16 v30, v14

    const/4 v14, 0x0

    move-object/from16 v20, v15

    move/from16 v19, v16

    const-wide/16 v15, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    move-object/from16 v24, v20

    const-wide/16 v19, 0x0

    move/from16 v25, v21

    const/16 v21, 0x2

    move/from16 v27, v22

    const/16 v22, 0x0

    move/from16 v29, v23

    const/16 v23, 0x2

    move-object/from16 v39, v24

    const/16 v24, 0x0

    move/from16 v40, v25

    const/16 v25, 0x0

    move/from16 v41, v27

    const/16 v27, 0x0

    move/from16 v42, v29

    const/16 v29, 0x0

    move-object/from16 v44, v39

    move/from16 v45, v40

    move/from16 v43, v42

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v28

    invoke-virtual/range {p1 .. p1}, Lfj1/c;->g()Lm91/u;

    move-result-object v6

    const/4 v14, 0x0

    if-nez v6, :cond_10

    const v6, 0x3a2363df

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    const/4 v7, 0x0

    invoke-virtual {v13, v7}, Lp1/q;->q(Z)V

    move v6, v7

    move-object/from16 v15, v34

    goto :goto_c

    :cond_10
    const/4 v7, 0x0

    const v8, 0x3a2363e0

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    const/16 v8, 0x50

    int-to-float v8, v8

    invoke-static {v8, v2}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v9, 0x3

    int-to-float v9, v9

    const/4 v10, 0x2

    invoke-static {v8, v9, v14, v10}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object/from16 v15, v34

    invoke-static {v15, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v10, v13, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v13, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-eqz v11, :cond_11

    invoke-virtual {v13, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_11
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v13, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_12

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_13

    :cond_12
    invoke-static {v7, v13, v7, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v13, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v11, 0x0

    const/16 v12, 0xe

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v10, v13

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v9, 0x1

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    const/4 v6, 0x0

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual/range {p1 .. p1}, Lfj1/c;->e()Lgz0/m0;

    move-result-object v7

    if-nez v7, :cond_14

    const v7, 0x3a290676

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    move-object/from16 v34, v15

    move-object/from16 v14, v44

    move/from16 v46, v45

    const/4 v15, 0x1

    goto :goto_e

    :cond_14
    const v6, 0x3a290677

    const/4 v8, 0x6

    invoke-static {v13, v6, v7, v13, v8}, Lih0/d0;->s(Lp1/q;ILgz0/m0;Lp1/q;I)Lo2/e;

    move-result-object v6

    move-object/from16 v7, v44

    move/from16 v8, v45

    invoke-virtual {v7, v13, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->b1()J

    move-result-wide v9

    const/4 v11, 0x4

    int-to-float v12, v11

    mul-float/2addr v12, v12

    invoke-static {v12, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const v12, 0x3dcccccd    # 0.1f

    move-object/from16 v34, v15

    float-to-double v14, v12

    cmpl-double v14, v14, v35

    if-lez v14, :cond_15

    goto :goto_d

    :cond_15
    invoke-static/range {v37 .. v37}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_d
    new-instance v14, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v15, v12, v38

    if-lez v15, :cond_16

    move/from16 v12, v38

    :cond_16
    const/4 v15, 0x1

    invoke-direct {v14, v12, v15}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v11, v14}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/16 v12, 0x30

    move-object/from16 v28, v13

    const/4 v13, 0x0

    move-object/from16 v44, v7

    const/4 v7, 0x0

    move/from16 v46, v8

    move-object v8, v11

    move-object/from16 v11, v28

    move-object/from16 v14, v44

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v13, v11

    const/4 v6, 0x0

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v13, v15}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Lfj1/c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    if-nez v7, :cond_17

    const v7, 0x2bf26fae

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    move/from16 v32, p3

    move-object/from16 v35, v3

    move-object/from16 v48, v14

    move/from16 v30, v41

    move/from16 v47, v43

    move/from16 v40, v46

    move-object v3, v2

    move-object/from16 v2, v34

    :goto_f
    const/4 v9, 0x1

    goto/16 :goto_10

    :cond_17
    const v6, 0x2bf26faf

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    move/from16 v12, v43

    invoke-static {v7, v13, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v15

    move/from16 v6, v46

    invoke-virtual {v14, v13, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->b()Lb91/a;

    move-result-object v26

    invoke-virtual {v14, v13, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v16

    const/4 v10, 0x0

    const/16 v11, 0xb

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v9, v6

    move-object v6, v2

    move v2, v9

    move/from16 v9, p3

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v19, v6

    move/from16 v32, v9

    const/16 v29, 0x30

    const v31, 0x2fff8

    const-wide/16 v10, 0x0

    move/from16 v42, v12

    const/4 v12, 0x0

    move-object/from16 v28, v13

    const/4 v13, 0x0

    move-object/from16 v44, v14

    const/4 v14, 0x0

    move-object v6, v15

    move-wide/from16 v8, v16

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v21, v19

    const-wide/16 v19, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v25, v24

    const/16 v24, 0x0

    move-object/from16 v27, v25

    const/16 v25, 0x0

    move-object/from16 v30, v27

    const/16 v27, 0x0

    move/from16 v40, v2

    move-object/from16 v35, v3

    move-object/from16 v3, v30

    move-object/from16 v2, v34

    move/from16 v30, v41

    move/from16 v47, v42

    move-object/from16 v48, v44

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v28

    const/4 v6, 0x0

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    invoke-static {v2, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v6, v13, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v13, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-eqz v9, :cond_18

    invoke-virtual {v13, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_18
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v13, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v13, Lp1/q;->S:Z

    if-nez v0, :cond_1a

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto :goto_13

    :cond_19
    :goto_12
    move-object/from16 v0, v35

    goto :goto_14

    :cond_1a
    :goto_13
    invoke-static {v6, v13, v6, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_12

    :goto_14
    invoke-static {v13, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lfj1/c;->a()Lkd1/o;

    move-result-object v0

    if-nez v0, :cond_1b

    const v0, 0x4c63fce4    # 5.976565E7f

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    goto :goto_15

    :cond_1b
    const v1, 0x4c63fce5    # 5.9765652E7f

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v10, 0x0

    const/16 v11, 0xd

    const/4 v7, 0x0

    const/4 v9, 0x0

    move/from16 v8, v32

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v2, 0x23

    int-to-float v2, v2

    const/4 v11, 0x4

    int-to-float v4, v11

    mul-float/2addr v2, v4

    const/4 v4, 0x0

    const/4 v9, 0x1

    invoke-static {v1, v4, v2, v9}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v10, Lkd1/o;->a:I

    const/4 v11, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, v0

    move-object v9, v13

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    move-object/from16 v28, v9

    const/16 v14, 0x1b0

    const/16 v15, 0x78

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v8, v1

    move-object/from16 v13, v28

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    const/4 v6, 0x0

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    :goto_15
    invoke-virtual/range {p1 .. p1}, Lfj1/c;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_1c

    const v0, 0x4c6a8703    # 6.1479948E7f

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    :goto_16
    const/4 v9, 0x1

    goto :goto_17

    :cond_1c
    const v1, 0x4c6a8704    # 6.147995E7f

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    move/from16 v12, v47

    invoke-static {v0, v13, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    move/from16 v12, v40

    move-object/from16 v14, v48

    invoke-virtual {v14, v13, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->c()Lb91/a;

    move-result-object v26

    invoke-virtual {v14, v13, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v8

    sget-object v0, Lb2/e;->I:Lb2/m;

    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v1, v3, v0}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    double-to-float v1, v1

    mul-float v1, v1, v33

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v29, 0x0

    const v31, 0x2fff8

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v28, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v28

    const/4 v6, 0x0

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    goto :goto_16

    :goto_17
    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_1d
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_18
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lfj1/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lfj1/b;->e(Landroidx/compose/ui/Modifier;Lfj1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
