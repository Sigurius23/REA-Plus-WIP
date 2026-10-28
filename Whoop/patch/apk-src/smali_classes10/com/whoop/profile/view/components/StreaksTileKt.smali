.class public final Lcom/whoop/profile/view/components/StreaksTileKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u000b\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\"\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0017\u0010\u0011\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u0017\u0010\u0015\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0012\u001a\u0004\u0008\u0016\u0010\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/profile/view/components/StreaksTileViewState;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "StreaksTile",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/components/StreaksTileViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "PreviewStreaksTile",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "sampleStreaksTileStates",
        "Ljava/util/List;",
        "getSampleStreaksTileStates",
        "()Ljava/util/List;",
        "sampleStreaksTileWithStreak",
        "Lcom/whoop/profile/view/components/StreaksTileViewState;",
        "getSampleStreaksTileWithStreak",
        "()Lcom/whoop/profile/view/components/StreaksTileViewState;",
        "sampleStreaksTileNoStreak",
        "getSampleStreaksTileNoStreak",
        "profile_release"
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
.field private static final sampleStreaksTileNoStreak:Lcom/whoop/profile/view/components/StreaksTileViewState;

.field private static final sampleStreaksTileStates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/profile/view/components/StreaksTileViewState;",
            ">;"
        }
    .end annotation
.end field

.field private static final sampleStreaksTileWithStreak:Lcom/whoop/profile/view/components/StreaksTileViewState;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lcom/whoop/profile/view/components/StreaksTileViewState;

    sget v1, Lgy0/e;->d:I

    invoke-static {v1}, Lv41/r0$d;->b(I)I

    move-result v1

    invoke-static {v1}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v4

    sget-object v11, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    const/4 v7, 0x0

    const-string v1, "data_streak"

    const-string v2, "DATA STREAK"

    const-string v3, "280 Days"

    const/4 v5, 0x0

    move-object v6, v11

    invoke-direct/range {v0 .. v7}, Lcom/whoop/profile/view/components/StreaksTileViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/r0;Lkd1/o;Lgz0/m0;Lcom/whoop/navigation/e;)V

    new-instance v5, Lcom/whoop/profile/view/components/StreaksTileViewState;

    const/4 v10, 0x0

    const/4 v12, 0x0

    const-string v6, "data_streak_zero"

    const-string v7, "DATA STREAK"

    const-string v8, "0 Days"

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v12}, Lcom/whoop/profile/view/components/StreaksTileViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/r0;Lkd1/o;Lgz0/m0;Lcom/whoop/navigation/e;)V

    move-object v1, v5

    new-instance v2, Lcom/whoop/profile/view/components/StreaksTileViewState;

    const-string v3, "https://app-cdn.dev.whoop.com/alwayson/streaks/red_flame_stop_v2.json"

    invoke-static {v3}, Lv41/r0$e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lv41/r0$e;->a(Ljava/lang/String;)Lv41/r0$e;

    move-result-object v6

    const/4 v8, 0x0

    const-string v3, "data_streak_no_icon"

    const-string v4, "DATA STREAK"

    const-string v5, "150 Days"

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lcom/whoop/profile/view/components/StreaksTileViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/r0;Lkd1/o;Lgz0/m0;Lcom/whoop/navigation/e;)V

    new-instance v5, Lcom/whoop/profile/view/components/StreaksTileViewState;

    new-instance v10, Lkd1/o$a;

    sget v3, Lgy0/a;->Q4:I

    invoke-direct {v10, v3}, Lkd1/o$a;-><init>(I)V

    const-string v6, "data_streak_with_image"

    const-string v7, "DATA STREAK"

    const-string v8, "42 Days"

    invoke-direct/range {v5 .. v12}, Lcom/whoop/profile/view/components/StreaksTileViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/r0;Lkd1/o;Lgz0/m0;Lcom/whoop/navigation/e;)V

    filled-new-array {v0, v1, v2, v5}, [Lcom/whoop/profile/view/components/StreaksTileViewState;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/whoop/profile/view/components/StreaksTileKt;->sampleStreaksTileStates:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/profile/view/components/StreaksTileViewState;

    sput-object v1, Lcom/whoop/profile/view/components/StreaksTileKt;->sampleStreaksTileWithStreak:Lcom/whoop/profile/view/components/StreaksTileViewState;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/profile/view/components/StreaksTileViewState;

    sput-object v0, Lcom/whoop/profile/view/components/StreaksTileKt;->sampleStreaksTileNoStreak:Lcom/whoop/profile/view/components/StreaksTileViewState;

    return-void
.end method

.method public static final PreviewStreaksTile(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x69b3fcee

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

    new-instance v1, Lcom/whoop/profile/view/components/StreaksTileKt$PreviewStreaksTile$$inlined$WhoopPreviewTheme$1;

    invoke-direct {v1}, Lcom/whoop/profile/view/components/StreaksTileKt$PreviewStreaksTile$$inlined$WhoopPreviewTheme$1;-><init>()V

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

    new-instance v0, Lv41/c;

    const/4 v1, 0x4

    invoke-direct {v0, p1, v1}, Lv41/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final PreviewStreaksTile$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/whoop/profile/view/components/StreaksTileKt;->PreviewStreaksTile(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final StreaksTile(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/components/StreaksTileViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 47
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/whoop/profile/view/components/StreaksTileViewState;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x15af6f67

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x2

    const/4 v3, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v3

    goto :goto_0

    :cond_1
    move v6, v1

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    :cond_5
    move-object/from16 v9, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v9, v4, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_3

    :cond_7
    const/16 v11, 0x80

    :goto_3
    or-int/2addr v6, v11

    :goto_4
    and-int/lit16 v11, v6, 0x93

    const/16 v12, 0x92

    if-eq v11, v12, :cond_8

    const/4 v11, 0x1

    goto :goto_5

    :cond_8
    const/4 v11, 0x0

    :goto_5
    and-int/lit8 v12, v6, 0x1

    invoke-virtual {v10, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_1e

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v0, v11

    goto :goto_6

    :cond_9
    move-object v0, v5

    :goto_6
    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v5, :cond_a

    new-instance v7, Lv01/k;

    const/16 v9, 0xe

    invoke-direct {v7, v9}, Lv01/k;-><init>(I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_b
    move-object v7, v9

    :goto_7
    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v15, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v15, v10, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    move/from16 p0, v14

    invoke-virtual/range {v16 .. v16}, Ly81/i;->W0()J

    move-result-wide v13

    const/4 v9, 0x3

    int-to-float v8, v9

    int-to-float v3, v3

    invoke-static {v12, v8, v3, v13, v14}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v12, v1

    const/16 v13, 0x8

    int-to-float v13, v13

    mul-float/2addr v12, v13

    invoke-static {v12, v8}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    and-int/lit16 v6, v6, 0x380

    const/16 v14, 0x100

    if-ne v6, v14, :cond_c

    const/4 v6, 0x1

    goto :goto_8

    :cond_c
    const/4 v6, 0x0

    :goto_8
    or-int/2addr v6, v12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v6, :cond_d

    if-ne v12, v5, :cond_e

    :cond_d
    new-instance v12, Lui0/q;

    const/16 v5, 0xa

    invoke-direct {v12, v2, v7, v5}, Lui0/q;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v12, Lc93/a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v8, v6, v5, v12, v9}, Landroidx/room/c1;->i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Lb2/e;->w:Lb2/m;

    invoke-static {v9, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_f

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_9
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v10, v12, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v10, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_10

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v31, v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_a

    :cond_10
    move-object/from16 v31, v0

    :goto_a
    invoke-static {v5, v10, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v10, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v5, 0x6

    int-to-float v8, v5

    mul-float/2addr v8, v3

    const/4 v5, 0x0

    const/4 v2, 0x2

    invoke-static {v1, v8, v5, v2}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/m;->g:Ll0/h;

    sget-object v5, Lb2/e;->K:Lb2/l;

    move-object/from16 v18, v11

    const/16 v11, 0x36

    invoke-static {v2, v5, v10, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    move-object/from16 v19, v12

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v10}, Lp1/q;->i0()V

    move/from16 v32, v3

    iget-boolean v3, v10, Lp1/q;->S:Z

    if-eqz v3, :cond_12

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    :goto_b
    move-object/from16 v3, v19

    goto :goto_c

    :cond_12
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_b

    :goto_c
    invoke-static {v10, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-nez v2, :cond_13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v2, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    :cond_13
    invoke-static {v11, v10, v11, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v10, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v1, v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/components/StreaksTileViewState;->getTitle()Ljava/lang/String;

    move-result-object v5

    move/from16 v2, p0

    invoke-virtual {v15, v10, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->s()Lb91/a;

    move-result-object v25

    invoke-virtual {v15, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v11

    sget v19, Lb91/a;->d:I

    shl-int/lit8 v29, v19, 0x12

    const v30, 0x2fffa

    move-object/from16 v19, v6

    const/4 v6, 0x0

    move-object/from16 v21, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move/from16 v22, v8

    move-wide/from16 v45, v11

    move-object v12, v7

    move-wide/from16 v7, v45

    const/4 v11, 0x0

    move-object/from16 v23, v12

    const/4 v12, 0x0

    move/from16 v24, v13

    const/4 v13, 0x0

    move-object/from16 v28, v14

    move-object/from16 v26, v15

    const-wide/16 v14, 0x0

    const/16 v33, 0x0

    const/16 v16, 0x0

    const/16 v34, 0x0

    const/16 v17, 0x0

    move-object/from16 v36, v18

    move-object/from16 v35, v19

    const-wide/16 v18, 0x0

    const/16 v37, 0x36

    const/16 v20, 0x0

    move-object/from16 v38, v21

    const/16 v21, 0x0

    move/from16 v39, v22

    const/16 v22, 0x0

    move-object/from16 v40, v23

    const/16 v23, 0x0

    move/from16 v41, v24

    const/16 v24, 0x0

    move-object/from16 v42, v26

    const/16 v26, 0x0

    move-object/from16 v43, v28

    const/16 v28, 0x0

    move-object/from16 p2, v0

    move-object v0, v1

    move-object/from16 v34, v3

    move-object/from16 v2, v36

    move/from16 v1, v37

    move/from16 v44, v39

    move/from16 v3, v41

    move-object/from16 v4, v43

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    double-to-float v5, v5

    invoke-static {v5, v3, v0, v10, v1}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v0

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v10, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_15

    invoke-virtual {v10, v4}, Lp1/q;->l(Lc93/a;)V

    :goto_d
    move-object/from16 v4, v34

    goto :goto_e

    :cond_15
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_d

    :goto_e
    invoke-static {v10, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v38

    invoke-static {v10, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_16

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    :cond_16
    move-object/from16 v0, v35

    goto :goto_10

    :cond_17
    :goto_f
    move-object/from16 v0, p2

    goto :goto_11

    :goto_10
    invoke-static {v1, v10, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_f

    :goto_11
    invoke-static {v10, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/components/StreaksTileViewState;->getLottieUrl()Lv41/r0;

    move-result-object v6

    if-nez v6, :cond_18

    const v0, 0x61d48701

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    move-object/from16 v5, v33

    move/from16 v1, v44

    goto :goto_12

    :cond_18
    const/4 v0, 0x0

    const v1, 0x61d48702

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    move/from16 v1, v44

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v15, 0x6

    const/16 v16, 0x1fc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v27, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v14, v27

    invoke-static/range {v5 .. v16}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v14

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    :goto_12
    if-nez v5, :cond_1a

    const v4, 0x61d80812

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/components/StreaksTileViewState;->getImage()Lkd1/o;

    move-result-object v5

    if-nez v5, :cond_19

    const v1, 0x61d80811

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_19
    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    sget v9, Lkd1/o;->a:I

    move-object/from16 v27, v10

    const/4 v10, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v8, v27

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v13, 0x1b0

    const/16 v14, 0x78

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v12, v27

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v12

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_13
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_1a
    const v1, 0x5dfe9807

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/components/StreaksTileViewState;->getSubtitle()Ljava/lang/String;

    move-result-object v5

    move/from16 v4, p0

    move-object/from16 v1, v42

    invoke-virtual {v1, v10, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->b()Lb91/a;

    move-result-object v25

    invoke-virtual {v1, v10, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v7

    const/16 v28, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/components/StreaksTileViewState;->getEndIcon()Lgz0/m0;

    move-result-object v5

    if-eqz v5, :cond_1b

    invoke-virtual {v5}, Lgz0/m0;->toWhoopIcon()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_15

    :cond_1b
    move-object/from16 v5, v33

    :goto_15
    if-nez v5, :cond_1c

    const v5, 0x61dfa170

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    move-object/from16 v5, v33

    goto :goto_16

    :cond_1c
    const v6, 0x61dfa171

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    const/4 v6, 0x6

    invoke-static {v5, v10, v6}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_16
    if-nez v5, :cond_1d

    const v1, 0x61e06466

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    const/4 v13, 0x1

    goto :goto_17

    :cond_1d
    const v6, 0x61e06467

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    const/4 v13, 0x1

    int-to-float v6, v13

    mul-float v16, v6, v3

    const/16 v19, 0x0

    const/16 v20, 0xe

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v15, v2

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    mul-float v3, v32, v32

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v1, v10, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->b1()J

    move-result-wide v8

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_17
    invoke-static {v10, v13, v13, v13}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object/from16 v1, v31

    move-object/from16 v3, v40

    goto :goto_18

    :cond_1e
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v5

    move-object v3, v9

    :goto_18
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1f

    new-instance v0, Lv31/d;

    const/4 v6, 0x4

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lv31/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method private static final StreaksTile$lambda$0$0(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final StreaksTile$lambda$1$0(Lcom/whoop/profile/view/components/StreaksTileViewState;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lcom/whoop/profile/view/components/StreaksTileViewState;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final StreaksTile$lambda$3(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/components/StreaksTileViewState;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lcom/whoop/profile/view/components/StreaksTileKt;->StreaksTile(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/components/StreaksTileViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/components/StreaksTileKt;->StreaksTile$lambda$0$0(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/components/StreaksTileViewState;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/whoop/profile/view/components/StreaksTileKt;->StreaksTile$lambda$3(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/components/StreaksTileViewState;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/profile/view/components/StreaksTileViewState;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/components/StreaksTileKt;->StreaksTile$lambda$1$0(Lcom/whoop/profile/view/components/StreaksTileViewState;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/components/StreaksTileKt;->PreviewStreaksTile$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final getSampleStreaksTileNoStreak()Lcom/whoop/profile/view/components/StreaksTileViewState;
    .locals 1

    sget-object v0, Lcom/whoop/profile/view/components/StreaksTileKt;->sampleStreaksTileNoStreak:Lcom/whoop/profile/view/components/StreaksTileViewState;

    return-object v0
.end method

.method public static final getSampleStreaksTileStates()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/profile/view/components/StreaksTileViewState;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/profile/view/components/StreaksTileKt;->sampleStreaksTileStates:Ljava/util/List;

    return-object v0
.end method

.method public static final getSampleStreaksTileWithStreak()Lcom/whoop/profile/view/components/StreaksTileViewState;
    .locals 1

    sget-object v0, Lcom/whoop/profile/view/components/StreaksTileKt;->sampleStreaksTileWithStreak:Lcom/whoop/profile/view/components/StreaksTileViewState;

    return-object v0
.end method
