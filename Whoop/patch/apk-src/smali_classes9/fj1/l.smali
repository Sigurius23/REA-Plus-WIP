.class public abstract Lfj1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfj1/l$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0002\u0008\u0006\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a#\u0010\u000c\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\"\u001a\u0010\u0012\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\" \u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00138\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lfj1/m;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "g",
        "(Landroidx/compose/ui/Modifier;Lfj1/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Ly81/f;",
        "color",
        "e",
        "(Landroidx/compose/ui/Modifier;Ly81/f;Landroidx/compose/runtime/Composer;II)V",
        "a",
        "Lfj1/m;",
        "getFakePregnancyCardState",
        "()Lfj1/m;",
        "fakePregnancyCardState",
        "",
        "b",
        "Ljava/util/List;",
        "getPostpartumStates",
        "()Ljava/util/List;",
        "postpartumStates",
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
.field private static final a:Lfj1/m;

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lfj1/m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, Lfj1/m;

    const-string v1, "Pregnancy Insights"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget-object v4, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    new-instance v3, Lfj1/i;

    const-string v2, "3RD Trimester"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v5, "Week 32"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v7, Ly81/f;->STRAIN_ZONE_3:Ly81/f;

    invoke-direct {v3, v2, v5, v7}, Lfj1/i;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    new-instance v6, Llz0/a;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x0

    const v9, 0x3ea8f5c3    # 0.33f

    invoke-direct/range {v6 .. v11}, Llz0/a;-><init>(Ly81/f;FFLjava/lang/Float;Z)V

    move-object v2, v6

    new-instance v6, Llz0/a;

    const v8, 0x3eae147b    # 0.34f

    const v9, 0x3f2b851f    # 0.67f

    invoke-direct/range {v6 .. v11}, Llz0/a;-><init>(Ly81/f;FFLjava/lang/Float;Z)V

    move-object v5, v6

    new-instance v6, Llz0/a;

    const v8, 0x3f59999a    # 0.85f

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    const/4 v11, 0x1

    const v8, 0x3f2e147b    # 0.68f

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-direct/range {v6 .. v11}, Llz0/a;-><init>(Ly81/f;FFLjava/lang/Float;Z)V

    filled-new-array {v2, v5, v6}, [Llz0/a;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v2, Llz0/b;

    const-string v6, "32"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const v8, 0x3f547ae1    # 0.83f

    const/4 v10, 0x1

    invoke-direct {v2, v8, v6, v7, v10}, Llz0/b;-><init>(FLcom/whoop/design/util/TextResource;Ly81/f;Z)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const/16 v8, 0x48

    const/4 v9, 0x0

    move-object v2, v4

    const/4 v4, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lfj1/m;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lfj1/i;Ls21/i;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfj1/l;->a:Lfj1/m;

    move-object v4, v2

    new-instance v2, Lfj1/m;

    const-string v0, "Postpartum"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v5, Lfj1/i;

    const-string v0, "4th trimester"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    const-string v1, "Week 6"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget-object v12, Ly81/f;->RECOVERY:Ly81/f;

    invoke-direct {v5, v0, v1, v12}, Lfj1/i;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    sget-object v6, Ls21/i;->PROGRESS_BAR:Ls21/i;

    new-instance v11, Llz0/a;

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct/range {v11 .. v16}, Llz0/a;-><init>(Ly81/f;FFLjava/lang/Float;Z)V

    invoke-static {v11}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    new-instance v1, Llz0/b;

    const-string v8, "6"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget-object v14, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-direct {v1, v0, v8, v14, v10}, Llz0/b;-><init>(FLcom/whoop/design/util/TextResource;Ly81/f;Z)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/16 v10, 0x40

    const/4 v11, 0x0

    invoke-direct/range {v2 .. v11}, Lfj1/m;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lfj1/i;Ls21/i;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v2

    move-object v2, v4

    new-instance v1, Lfj1/m;

    const-string v3, "Hormonal Insights"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v5, Lfj1/i;

    const-string v4, "NO DATA"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    const/4 v15, 0x2

    const/16 v16, 0x0

    const/4 v13, 0x0

    move-object v11, v5

    invoke-direct/range {v11 .. v16}, Lfj1/i;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v10, 0x78

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, v2

    move-object v2, v1

    invoke-direct/range {v2 .. v11}, Lfj1/m;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lfj1/i;Ls21/i;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v0, v2}, [Lfj1/m;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lfj1/l;->b:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Lfj1/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lfj1/l;->j(Landroidx/compose/ui/Modifier;Lfj1/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Ly81/f;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lfj1/l;->f(Landroidx/compose/ui/Modifier;Ly81/f;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lfj1/m;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfj1/l;->h(Lfj1/m;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lfj1/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lfj1/l;->i(Lfj1/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Ly81/f;Landroidx/compose/runtime/Composer;II)V
    .locals 20

    move/from16 v0, p3

    move/from16 v1, p4

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    const v3, 0x36849902

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x1

    const/4 v4, 0x4

    if-eqz v3, :cond_0

    or-int/lit8 v5, v0, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v2, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v0

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v0

    :goto_1
    and-int/lit8 v7, v1, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v8, v0, 0x30

    if-nez v8, :cond_6

    if-nez p1, :cond_4

    const/4 v8, -0x1

    goto :goto_2

    :cond_4
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    :goto_2
    invoke-virtual {v2, v8}, Lp1/q;->e(I)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_3

    :cond_5
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v6, v8

    :cond_6
    :goto_4
    and-int/lit8 v8, v6, 0x13

    const/16 v9, 0x12

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v8, v9, :cond_7

    move v8, v11

    goto :goto_5

    :cond_7
    move v8, v10

    :goto_5
    and-int/lit8 v9, v6, 0x1

    invoke-virtual {v2, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_d

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_8

    move-object v5, v12

    :cond_8
    if-eqz v7, :cond_9

    sget-object v3, Ly81/f;->WHITE_10:Ly81/f;

    goto :goto_6

    :cond_9
    move-object/from16 v3, p1

    :goto_6
    const/4 v7, 0x3

    int-to-float v8, v7

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v8, v9

    const/4 v9, 0x0

    invoke-static {v5, v9, v8, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v13, Lb2/e;->w:Lb2/m;

    invoke-static {v13, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    iget-wide v14, v2, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v2, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 p0, v7

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v10, v2, Lp1/q;->S:Z

    if-eqz v10, :cond_a

    invoke-virtual {v2, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_7
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v2, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v2, v7, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v2, Lp1/q;->S:Z

    if-nez v10, :cond_b

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    :cond_b
    invoke-static {v14, v2, v14, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v2, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v13, Lp91/a;

    const/16 v18, 0xc

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v13 .. v19}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v7, 0x0

    const/high16 v15, 0x3f800000    # 1.0f

    const v16, 0x3eb33333    # 0.35f

    move-object/from16 v17, v13

    move v13, v7

    invoke-static/range {v12 .. v17}, Lp91/e;->e(Landroidx/compose/ui/Modifier;FFFFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v8, v11

    int-to-float v4, v4

    invoke-static {v7, v8, v4}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, Li2/t;->b:Li2/s;

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v8, v2, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->V0()J

    move-result-wide v12

    new-instance v8, Li2/x;

    invoke-direct {v8, v12, v13}, Li2/x;-><init>(J)V

    shr-int/lit8 v6, v6, 0x3

    const/16 v10, 0xe

    and-int/2addr v6, v10

    invoke-virtual {v3, v2, v6}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    new-instance v14, Li2/x;

    invoke-direct {v14, v12, v13}, Li2/x;-><init>(J)V

    invoke-virtual {v3, v2, v6}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    new-instance v15, Li2/x;

    invoke-direct {v15, v12, v13}, Li2/x;-><init>(J)V

    invoke-virtual {v3, v2, v6}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    new-instance v6, Li2/x;

    invoke-direct {v6, v12, v13}, Li2/x;-><init>(J)V

    filled-new-array {v8, v14, v15, v6}, [Li2/x;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-static {v7, v6, v9, v9, v10}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x6

    invoke-static {v4, v6, v7, v9, v8}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v6, 0x0

    invoke-static {v4, v2, v6}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v2, v11}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    invoke-virtual {v2}, Lp1/q;->X()V

    move-object/from16 v3, p1

    :goto_8
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_e

    new-instance v4, Lfj1/k;

    invoke-direct {v4, v5, v3, v0, v1}, Lfj1/k;-><init>(Landroidx/compose/ui/Modifier;Ly81/f;II)V

    iput-object v4, v2, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final f(Landroidx/compose/ui/Modifier;Ly81/f;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lfj1/l;->e(Landroidx/compose/ui/Modifier;Ly81/f;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Lfj1/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lfj1/m;",
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

    const v2, -0x6ddbf61b

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

    if-eqz v7, :cond_c

    if-eqz v2, :cond_8

    sget-object v2, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_8
    move-object v2, v3

    :goto_5
    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit16 v4, v4, 0x380

    if-ne v4, v8, :cond_9

    goto :goto_6

    :cond_9
    move v11, v10

    :goto_6
    or-int/2addr v3, v11

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_a

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v4, v3, :cond_b

    :cond_a
    new-instance v4, Lf1/w1;

    const/4 v3, 0x7

    invoke-direct {v4, v3, v6, v5}, Lf1/w1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v4, Lc93/a;

    const/4 v3, 0x3

    const/4 v7, 0x0

    invoke-static {v2, v10, v7, v4, v3}, Landroidx/room/c1;->i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v3, Lej1/h;

    const/16 v4, 0xe

    invoke-direct {v3, v6, v4}, Lej1/h;-><init>(Ljava/lang/Object;I)V

    const v4, 0x5bda2975

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

    :cond_c
    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    move-object v4, v3

    :goto_7
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v0, Lf02/c;

    const/4 v3, 0x6

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lf02/c;-><init>(IIILandroidx/compose/ui/Modifier;Ll83/e;Lm91/u;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final h(Lfj1/m;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lfj1/m;->b()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lfj1/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 50

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v4, p2, 0x1

    move-object/from16 v9, p1

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_13

    int-to-float v0, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float v14, v0, v4

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v7, v9, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v12, v9, Lp1/q;->S:Z

    if-eqz v12, :cond_1

    invoke-virtual {v9, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v9, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v9, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v13, v9, Lp1/q;->S:Z

    if-nez v13, :cond_2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    :cond_2
    invoke-static {v8, v9, v8, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v9, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v13, 0x0

    const/4 v15, 0x7

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v17, v12

    const/4 v12, 0x0

    move-object v1, v10

    move-object/from16 v3, v17

    move-object v10, v5

    move-object/from16 v5, v16

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    move/from16 v31, v14

    sget-object v11, Ll0/f;->c:Ll0/e;

    sget-object v12, Lb2/e;->K:Lb2/l;

    const/16 v13, 0x36

    invoke-static {v11, v12, v9, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v11

    iget-wide v13, v9, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v9, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v15, v9, Lp1/q;->S:Z

    if-eqz v15, :cond_4

    invoke-virtual {v9, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v9, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-nez v11, :cond_5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_6

    :cond_5
    invoke-static {v13, v9, v13, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v9, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lfj1/m;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget v11, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v10, v9, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v13, v9, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->r()Lb91/a;

    move-result-object v25

    invoke-virtual {v13, v9, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->y()J

    move-result-wide v15

    sget v17, Lb91/a;->d:I

    shl-int/lit8 v29, v17, 0x12

    const v30, 0x2fffa

    move-object/from16 v17, v6

    const/4 v6, 0x0

    move-object/from16 v18, v5

    move-object/from16 v27, v9

    move-object v5, v10

    const-wide/16 v9, 0x0

    move/from16 v19, v11

    const/4 v11, 0x0

    move-object/from16 v20, v12

    const/4 v12, 0x0

    move-object/from16 v21, v13

    const/4 v13, 0x0

    move-object/from16 v22, v7

    move-object/from16 v23, v8

    move-wide v7, v15

    move/from16 v16, v14

    const-wide/16 v14, 0x0

    move/from16 v24, v16

    const/16 v16, 0x0

    move-object/from16 v26, v17

    const/16 v17, 0x0

    move-object/from16 v28, v18

    move/from16 v32, v19

    const-wide/16 v18, 0x0

    move-object/from16 v33, v20

    const/16 v20, 0x0

    move-object/from16 v34, v21

    const/16 v21, 0x0

    move-object/from16 v35, v22

    const/16 v22, 0x0

    move-object/from16 v36, v23

    const/16 v23, 0x0

    move/from16 v37, v24

    const/16 v24, 0x0

    move-object/from16 v38, v26

    const/16 v26, 0x0

    move-object/from16 v39, v28

    const/16 v28, 0x0

    move/from16 v45, v32

    move-object/from16 v44, v33

    move-object/from16 v46, v34

    move-object/from16 v40, v35

    move-object/from16 v43, v36

    move/from16 v47, v37

    move-object/from16 v42, v38

    move-object/from16 v41, v39

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v27

    invoke-virtual/range {p0 .. p0}, Lfj1/m;->c()Lgz0/m0;

    move-result-object v5

    const/4 v13, 0x6

    if-nez v5, :cond_7

    const v5, 0x54d8928f

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    move-object/from16 v14, v46

    move/from16 v15, v47

    :goto_3
    const/4 v5, 0x1

    goto :goto_4

    :cond_7
    const v6, 0x54d89290

    invoke-static {v9, v6, v5, v9, v13}, Lih0/d0;->s(Lp1/q;ILgz0/m0;Lp1/q;I)Lo2/e;

    move-result-object v5

    move-object/from16 v14, v46

    move/from16 v15, v47

    invoke-virtual {v14, v9, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b1()J

    move-result-wide v6

    const/4 v8, 0x4

    int-to-float v8, v8

    mul-float/2addr v8, v8

    invoke-static {v8, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    move-object/from16 v27, v9

    move-wide/from16 v48, v6

    move-object v7, v8

    move-wide/from16 v8, v48

    const/4 v6, 0x0

    move-object/from16 v10, v27

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v9, v10

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto :goto_3

    :goto_4
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lfj1/m;->a()Lfj1/i;

    move-result-object v32

    if-nez v32, :cond_8

    const v0, 0x211147df

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    const/4 v5, 0x1

    goto/16 :goto_f

    :cond_8
    const v5, 0x211147e0

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lfj1/m;->h()Ls21/i;

    move-result-object v5

    sget-object v6, Lfj1/l$a;->a:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v6, v5

    const/4 v6, 0x1

    if-eq v5, v6, :cond_a

    const/4 v7, 0x2

    if-ne v5, v7, :cond_9

    int-to-float v5, v6

    mul-float/2addr v4, v5

    goto :goto_5

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_a
    move/from16 v4, v31

    :goto_5
    const/4 v5, 0x0

    invoke-static {v0, v5, v4, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Ll0/m;->a:Ll0/e;

    const/16 v6, 0x30

    move-object/from16 v7, v44

    invoke-static {v5, v7, v9, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v9, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v9, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-eqz v8, :cond_b

    move-object/from16 v8, v41

    invoke-virtual {v9, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_b
    move-object/from16 v8, v41

    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v9, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v5, v42

    invoke-static {v9, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-nez v7, :cond_d

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c

    goto :goto_8

    :cond_c
    :goto_7
    move-object/from16 v6, v43

    goto :goto_9

    :cond_d
    :goto_8
    invoke-static {v6, v9, v6, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_7

    :goto_9
    invoke-static {v9, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, 0x3ecccccd    # 0.4f

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Ll0/m;->e:Ll0/h;

    move-object/from16 v7, v40

    invoke-static {v4, v7, v9, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_e

    invoke-virtual {v9, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_e
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v9, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-nez v3, :cond_f

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    :cond_f
    invoke-static {v7, v9, v7, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    invoke-static {v9, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v32 .. v32}, Lfj1/i;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move/from16 v1, v45

    invoke-static {v0, v9, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v14, v9, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->s()Lb91/a;

    move-result-object v25

    invoke-virtual/range {v32 .. v32}, Lfj1/i;->a()Ly81/f;

    move-result-object v0

    invoke-virtual {v0, v9, v2}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    const/16 v28, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v9

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v46, v14

    move/from16 v16, v15

    const-wide/16 v14, 0x0

    move/from16 v47, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v0, v46

    move/from16 v3, v47

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v27

    invoke-virtual/range {v32 .. v32}, Lfj1/i;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    if-nez v4, :cond_11

    const v0, 0x2b99b9de

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_b
    const/4 v5, 0x1

    goto :goto_c

    :cond_11
    const v5, 0x2b99b9df

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-static {v4, v9, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->Q()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v7

    const/16 v28, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v9

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

    move-object/from16 v9, v27

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto :goto_b

    :goto_c
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lfj1/m;->f()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_12

    const v0, 0x4d4cf619    # 2.1491752E8f

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lfj1/m;->h()Ls21/i;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lfj1/m;->f()Ljava/util/List;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lfj1/m;->e()Ljava/util/List;

    move-result-object v8

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v5, 0x0

    invoke-static/range {v5 .. v11}, Llz0/c;->d(Landroidx/compose/ui/Modifier;Ls21/i;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_d
    const/4 v5, 0x1

    goto :goto_e

    :cond_12
    const v0, 0x4d50d676    # 2.1898224E8f

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {v0, v0, v9, v2, v1}, Lfj1/l;->e(Landroidx/compose/ui/Modifier;Ly81/f;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto :goto_d

    :goto_e
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_13
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_10
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;Lfj1/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lfj1/l;->g(Landroidx/compose/ui/Modifier;Lfj1/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
