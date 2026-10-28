.class public abstract Lwr0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwr0/m$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a7\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a%\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\nH\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a%\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\nH\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\r\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0011\"\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0011\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001d\u00b2\u0006\u000e\u0010\u001c\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lwr0/n;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "p",
        "(Lwr0/n;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lkotlin/Function0;",
        "onClick",
        "A",
        "(Lwr0/n;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "m",
        "Ly3/f;",
        "a",
        "F",
        "MenuAnchorSize",
        "b",
        "MenuAnchorPopupGap",
        "c",
        "MenuAnchorBorderWidth",
        "Lvy0/d0;",
        "d",
        "Lvy0/d0;",
        "previewMenu",
        "",
        "expanded",
        "community-moments_release"
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
.field private static final a:F

.field private static final b:F

.field private static final c:F

.field private static final d:Lvy0/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v0, 0xc

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lwr0/m;->a:F

    const/4 v0, 0x1

    int-to-float v0, v0

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v0, v2

    sput v0, Lwr0/m;->b:F

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    double-to-float v0, v2

    mul-float/2addr v0, v1

    sput v0, Lwr0/m;->c:F

    new-instance v0, Lvy0/d0;

    new-instance v1, Lvy0/z;

    sget-object v4, Lgz0/m0;->CAMERA:Lgz0/m0;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-string v2, "Take Photo"

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Lvy0/z;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lvy0/z;

    sget-object v5, Lgz0/m0;->PICTURE:Lgz0/m0;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-string v3, "Select Photo"

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v7}, Lvy0/z;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lvy0/z;

    new-instance v4, Lcom/whoop/navigation/models/GenericInteraction;

    const/16 v10, 0x1f

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Lcom/whoop/navigation/models/GenericInteraction;-><init>(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v5, Lgz0/m0;->DELETE:Lgz0/m0;

    const-string v6, "Remove Photo"

    invoke-direct {v3, v6, v4, v5}, Lvy0/z;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lgz0/m0;)V

    filled-new-array {v1, v2, v3}, [Lvy0/z;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lvy0/d0;-><init>(Ljava/util/List;)V

    sput-object v0, Lwr0/m;->d:Lvy0/d0;

    return-void
.end method

.method private static final A(Lwr0/n;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwr0/n;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v5, p1

    move/from16 v7, p3

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v1, 0x2551af45

    invoke-virtual {v13, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v7, 0x6

    const/4 v8, 0x4

    if-nez v1, :cond_2

    and-int/lit8 v1, v7, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    move v1, v8

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, v7

    goto :goto_2

    :cond_2
    move v1, v7

    :goto_2
    and-int/lit8 v2, v7, 0x30

    if-nez v2, :cond_4

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v1, v2

    :cond_4
    move v9, v1

    and-int/lit8 v1, v9, 0x13

    const/16 v2, 0x12

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v1, v2, :cond_5

    move v1, v11

    goto :goto_4

    :cond_5
    move v1, v10

    :goto_4
    and-int/lit8 v2, v9, 0x1

    invoke-virtual {v13, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_d

    sget v1, Lwr0/m;->a:F

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v4, 0x0

    const/16 v6, 0xf

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    and-int/lit8 v2, v9, 0xe

    if-eq v2, v8, :cond_7

    and-int/lit8 v2, v9, 0x8

    if-eqz v2, :cond_6

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_5

    :cond_6
    move v2, v10

    goto :goto_6

    :cond_7
    :goto_5
    move v2, v11

    :goto_6
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_8

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_9

    :cond_8
    new-instance v3, Lwr0/j;

    const/4 v2, 0x1

    invoke-direct {v3, v0, v2}, Lwr0/j;-><init>(Lwr0/n;I)V

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v10, v3}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->E:Lb2/m;

    invoke-static {v2, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v3, v13, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v13, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-eqz v9, :cond_a

    invoke-virtual {v13, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_7
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v13, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v13, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v13, Lp1/q;->S:Z

    if-nez v4, :cond_b

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    :cond_b
    invoke-static {v3, v13, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v13, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lwr0/n;->b()Lgz0/m0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    invoke-static {v1, v13, v10}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v1

    const/4 v2, 0x6

    int-to-float v2, v2

    int-to-float v3, v8

    mul-float/2addr v2, v3

    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v13, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v2

    const/16 v14, 0x1b0

    const/4 v15, 0x0

    const/4 v9, 0x0

    move-object v8, v1

    move v1, v11

    move-wide v11, v2

    invoke-static/range {v8 .. v15}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_e

    new-instance v2, Lwr0/k;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v5, v7, v3}, Lwr0/k;-><init>(Lwr0/n;Lc93/a;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final B(Lwr0/n;Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwr0/n;->a()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lwr0/n;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lwr0/m;->A(Lwr0/n;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lwr0/n;Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lwr0/m;->n(Lwr0/n;Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lvy0/y;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lwr0/m;->y(Lkotlin/jvm/functions/Function1;Lvy0/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwr0/m;->t(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwr0/m;->x(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lwr0/n;Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lwr0/m;->B(Lwr0/n;Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwr0/m;->q(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lwr0/n;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lwr0/m;->w(Lwr0/n;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwr0/m;->u(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lwr0/n;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lwr0/m;->o(Lwr0/n;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lwr0/n;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lwr0/m;->z(Lwr0/n;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lwr0/n;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lwr0/m;->C(Lwr0/n;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwr0/m;->v(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Lwr0/n;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwr0/n;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v5, p1

    move/from16 v7, p3

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v1, 0x6ace63ee

    invoke-virtual {v13, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v7, 0x6

    const/4 v8, 0x4

    if-nez v1, :cond_2

    and-int/lit8 v1, v7, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    move v1, v8

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, v7

    goto :goto_2

    :cond_2
    move v1, v7

    :goto_2
    and-int/lit8 v2, v7, 0x30

    if-nez v2, :cond_4

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v1, v2

    :cond_4
    move v9, v1

    and-int/lit8 v1, v9, 0x13

    const/16 v2, 0x12

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eq v1, v2, :cond_5

    move v1, v10

    goto :goto_4

    :cond_5
    move v1, v11

    :goto_4
    and-int/lit8 v2, v9, 0x1

    invoke-virtual {v13, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_f

    int-to-float v1, v8

    mul-float v12, v1, v1

    invoke-static {v12}, Lt0/j;->e(F)Lt0/i;

    move-result-object v1

    invoke-virtual {v0}, Lwr0/n;->c()Lkd1/o;

    move-result-object v14

    sget v2, Lwr0/m;->a:F

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v1}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    if-eqz v14, :cond_6

    const v3, -0xf3aad02

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    sget v3, Lwr0/m;->c:F

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v4, v13, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    move/from16 v16, v9

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v8

    invoke-static {v3, v8, v9}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v3

    iget v4, v3, Lf0/t;->a:F

    iget-object v3, v3, Lf0/t;->b:Li2/t;

    invoke-static {v4, v15, v3, v1}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_6
    move/from16 v16, v9

    const v1, -0xf3aa28a

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    move-object v1, v15

    :goto_5
    invoke-interface {v2, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v13, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->W0()J

    move-result-wide v2

    sget-object v4, Li2/w0;->a:Li2/v0;

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v4, 0x0

    const/16 v6, 0xf

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    and-int/lit8 v2, v16, 0xe

    const/4 v3, 0x4

    if-eq v2, v3, :cond_8

    and-int/lit8 v2, v16, 0x8

    if-eqz v2, :cond_7

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_6

    :cond_7
    move v2, v11

    goto :goto_7

    :cond_8
    :goto_6
    move v2, v10

    :goto_7
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_9

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_a

    :cond_9
    new-instance v3, Lwr0/j;

    const/4 v2, 0x0

    invoke-direct {v3, v0, v2}, Lwr0/j;-><init>(Lwr0/n;I)V

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v11, v3}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->E:Lb2/m;

    invoke-static {v2, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v3, v13, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v13, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v6, v13, Lp1/q;->S:Z

    if-eqz v6, :cond_b

    invoke-virtual {v13, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_8
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v13, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v13, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v13, Lp1/q;->S:Z

    if-nez v4, :cond_c

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    :cond_c
    invoke-static {v3, v13, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v13, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v14, :cond_e

    const v1, 0x4a1310b3    # 2409516.8f

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    sget v5, Lkd1/o;->a:I

    const/4 v6, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, v13

    move-object v1, v14

    invoke-static/range {v1 .. v6}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v8

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v15}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v16, 0x61b0

    const/16 v17, 0x68

    const/4 v9, 0x0

    move v2, v11

    const/4 v11, 0x0

    sget-object v12, Ly2/j;->a:Ly2/b1;

    move-object v15, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    move v5, v10

    move-object v10, v1

    move v1, v5

    move-object/from16 v5, p1

    invoke-static/range {v8 .. v17}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v13, v15

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_e
    move-object/from16 v5, p1

    move v1, v10

    move v2, v11

    const v3, 0x4a16a542    # 2468176.5f

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lwr0/n;->b()Lgz0/m0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    invoke-static {v3, v13, v2}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v3

    invoke-static {v12, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v8, v13, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v11

    const/16 v14, 0x1b0

    const/4 v15, 0x0

    const/4 v9, 0x0

    move-object v8, v3

    invoke-static/range {v8 .. v15}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_f
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_10

    new-instance v2, Lwr0/k;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v5, v7, v3}, Lwr0/k;-><init>(Lwr0/n;Lc93/a;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final n(Lwr0/n;Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwr0/n;->a()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lwr0/n;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lwr0/m;->m(Lwr0/n;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final p(Lwr0/n;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwr0/n;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v6, p0

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x917c322

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v1, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v11, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v1

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v4, v1, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_3

    :cond_5
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :goto_4
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v7, v1, 0x180

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-virtual {v11, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_5

    :cond_8
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v0, v8

    :goto_6
    and-int/lit16 v8, v0, 0x93

    const/16 v9, 0x92

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v8, v9, :cond_9

    move v8, v14

    goto :goto_7

    :cond_9
    move v8, v15

    :goto_7
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v11, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_19

    if-eqz v3, :cond_a

    sget-object v3, Lb2/t;->w:Lb2/t;

    goto :goto_8

    :cond_a
    move-object v3, v4

    :goto_8
    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_c

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_b

    new-instance v5, Lwo1/e0;

    const/16 v7, 0xd

    invoke-direct {v5, v7}, Lwo1/e0;-><init>(I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_c
    move-object v5, v7

    :goto_9
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_d

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v7, Lp1/c1;

    sget-object v8, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v11, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly3/c;

    sget-object v9, Lb2/e;->w:Lb2/m;

    invoke-static {v9, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v11, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-eqz v2, :cond_e

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_e
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_a
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v11, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v11, v2, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-nez v9, :cond_f

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_10

    :cond_f
    invoke-static {v10, v11, v10, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v11, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v6}, Lwr0/n;->f()Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    move-result-object v2

    sget-object v9, Lwr0/m$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v9, v2

    const/16 v9, 0xe

    if-eq v2, v14, :cond_13

    const/4 v10, 0x2

    if-ne v2, v10, :cond_12

    const v2, -0x514edc9

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_11

    new-instance v2, Lwr0/l;

    const/4 v10, 0x1

    invoke-direct {v2, v10, v7}, Lwr0/l;-><init>(ILp1/c1;)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v2, Lc93/a;

    sget v10, Lkd1/o;->a:I

    sget v12, Lvy0/d0;->b:I

    or-int/2addr v10, v12

    or-int/lit8 v10, v10, 0x30

    and-int/2addr v0, v9

    or-int/2addr v0, v10

    invoke-static {v6, v2, v11, v0}, Lwr0/m;->m(Lwr0/n;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_12
    const/4 v0, 0x0

    const v1, -0x515017c

    invoke-static {v1, v11, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_13
    const v2, -0x514f9ad

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_14

    new-instance v2, Lwr0/l;

    const/4 v10, 0x0

    invoke-direct {v2, v10, v7}, Lwr0/l;-><init>(ILp1/c1;)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v2, Lc93/a;

    sget v10, Lkd1/o;->a:I

    sget v12, Lvy0/d0;->b:I

    or-int/2addr v10, v12

    or-int/lit8 v10, v10, 0x30

    and-int/2addr v0, v9

    or-int/2addr v0, v10

    invoke-static {v6, v2, v11, v0}, Lwr0/m;->A(Lwr0/n;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_b
    invoke-static {v7}, Lwr0/m;->r(Lp1/c1;)Z

    move-result v0

    if-eqz v0, :cond_18

    const v0, 0x6278ce16

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    sget v0, Lwr0/m;->b:F

    invoke-interface {v8, v0}, Ly3/c;->F(F)I

    move-result v0

    invoke-virtual {v11, v0}, Lp1/q;->e(I)Z

    move-result v2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v2, :cond_15

    if-ne v8, v4, :cond_16

    :cond_15
    new-instance v8, Lwr0/o;

    invoke-direct {v8, v0}, Lwr0/o;-><init>(I)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v8, Lwr0/o;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_17

    new-instance v0, Lwr0/l;

    const/4 v2, 0x2

    invoke-direct {v0, v2, v7}, Lwr0/l;-><init>(ILp1/c1;)V

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v0, Lc93/a;

    new-instance v2, Lc4/j0;

    invoke-direct {v2, v14, v9}, Lc4/j0;-><init>(ZI)V

    new-instance v4, Lvl0/c;

    const/4 v9, 0x7

    invoke-direct {v4, v6, v5, v7, v9}, Lvl0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v7, -0x5eba92a3

    invoke-static {v7, v11, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const/16 v12, 0xdb0

    const/4 v13, 0x0

    move-object v9, v2

    move-object v7, v8

    move-object v8, v0

    invoke-static/range {v7 .. v13}, Lc4/r;->a(Lc4/i0;Lc93/a;Lc4/j0;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_18
    const/4 v0, 0x0

    const v2, 0x62833ede

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    move-object v4, v3

    goto :goto_d

    :cond_19
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v5, v7

    :goto_d
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1a

    new-instance v0, Lwr0/f;

    const/4 v3, 0x1

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lwr0/f;-><init>(IIILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lm91/u;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final q(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final s(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final t(Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lwr0/m;->r(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p0, v0}, Lwr0/m;->s(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lwr0/m;->r(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p0, v0}, Lwr0/m;->s(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lwr0/m;->s(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lwr0/n;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p4, v2

    move-object v5, p3

    check-cast v5, Lp1/q;

    invoke-virtual {v5, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-virtual {p0}, Lwr0/n;->e()Lvy0/d0;

    move-result-object v1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p0, p3, :cond_1

    new-instance p0, Lwr0/l;

    const/4 p4, 0x3

    invoke-direct {p0, p4, p2}, Lwr0/l;-><init>(ILp1/c1;)V

    invoke-virtual {v5, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v3, p0

    check-cast v3, Lc93/a;

    invoke-virtual {v5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p0, :cond_2

    if-ne p2, p3, :cond_3

    :cond_2
    new-instance p2, Lwr0/v0;

    const/4 p0, 0x1

    invoke-direct {p2, p1, p0}, Lwr0/v0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v5, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v4, p2

    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget p0, Lvy0/d0;->b:I

    or-int/lit16 v6, p0, 0x180

    const/4 v7, 0x2

    const/4 v2, 0x0

    invoke-static/range {v1 .. v7}, Lvy0/c0;->z(Lvy0/d0;Landroidx/compose/ui/Modifier;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_4
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lwr0/m;->s(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lkotlin/jvm/functions/Function1;Lvy0/y;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lvy0/y$a;

    if-eqz v0, :cond_0

    check-cast p1, Lvy0/y$a;

    invoke-virtual {p1}, Lvy0/y$a;->a()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final z(Lwr0/n;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lwr0/m;->p(Lwr0/n;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
