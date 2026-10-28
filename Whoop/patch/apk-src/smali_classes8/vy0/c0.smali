.class public abstract Lvy0/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a7\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001aG\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n2\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a9\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u000e2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\"\u001a\u0010\u0019\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006 \u00b2\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lvy0/d0;",
        "state",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "Lvy0/y;",
        "Ll83/a0;",
        "onEvent",
        "m",
        "(Lvy0/d0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lkotlin/Function0;",
        "onDismiss",
        "z",
        "(Lvy0/d0;Landroidx/compose/ui/Modifier;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lvy0/z;",
        "w",
        "(Lvy0/z;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lt0/i;",
        "a",
        "Lt0/i;",
        "fabMenuShape",
        "b",
        "Landroidx/compose/ui/Modifier;",
        "getFabMenuBackgroundModifier",
        "()Landroidx/compose/ui/Modifier;",
        "fabMenuBackgroundModifier",
        "",
        "c",
        "Ljava/util/List;",
        "previewItems",
        "",
        "expanded",
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
.field private static final a:Lt0/i;

.field private static final b:Landroidx/compose/ui/Modifier;

.field private static final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lvy0/z;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/4 v0, 0x5

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v2, v1

    mul-float/2addr v0, v2

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    sput-object v5, Lvy0/c0;->a:Lt0/i;

    const/4 v0, 0x6

    int-to-float v0, v0

    mul-float v4, v0, v2

    sget-wide v2, Li2/x;->b:J

    const v0, 0x3e4ccccd    # 0.2f

    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v7

    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v9

    const/4 v11, 0x4

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/4 v6, 0x0

    invoke-static/range {v3 .. v11}, Le93/b;->a0(Landroidx/compose/ui/Modifier;FLi2/a1;ZJJI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {}, Lgb1/b0;->U()Li2/t;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v0, v2, v5, v3, v1}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sput-object v0, Lvy0/c0;->b:Landroidx/compose/ui/Modifier;

    new-instance v1, Lvy0/z;

    sget-object v5, Lgz0/m0;->ADD:Lgz0/m0;

    move-object v4, v5

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-string v2, "Add Period"

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Lvy0/z;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lvy0/z;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-string v3, "Add Ovulation"

    move-object v5, v4

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v7}, Lvy0/z;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v2

    move-object v4, v5

    new-instance v2, Lvy0/z;

    const-string v3, "Add Symptoms & Behaviors"

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v7}, Lvy0/z;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v1, v0, v2}, [Lvy0/z;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lvy0/c0;->c:Ljava/util/List;

    return-void
.end method

.method private static final A()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final B(Lvy0/y;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lvy0/d0;Landroidx/compose/ui/Modifier;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lvy0/c0;->z(Lvy0/d0;Landroidx/compose/ui/Modifier;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvy0/c0;->u(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lvy0/z;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lvy0/c0;->y(Lvy0/z;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/a;Lkotlin/jvm/functions/Function1;Lvy0/z;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lvy0/c0;->x(Lc93/a;Lkotlin/jvm/functions/Function1;Lvy0/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Lvy0/c0;->A()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Lvy0/y;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvy0/c0;->n(Lvy0/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lvy0/d0;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lvy0/c0;->t(Lvy0/d0;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lvy0/d0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lvy0/c0;->v(Lvy0/d0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvy0/c0;->s(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lvy0/c0;->r(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvy0/c0;->q(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lvy0/d0;Landroidx/compose/ui/Modifier;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lvy0/c0;->C(Lvy0/d0;Landroidx/compose/ui/Modifier;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lvy0/y;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvy0/c0;->B(Lvy0/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lvy0/d0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvy0/d0;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p0

    move/from16 v1, p4

    const-string v0, "state"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x6d62553c

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v10, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit16 v9, v0, 0x93

    const/16 v11, 0x92

    const/4 v15, 0x1

    const/4 v13, 0x0

    if-eq v9, v11, :cond_8

    move v9, v15

    goto :goto_6

    :cond_8
    move v9, v13

    :goto_6
    and-int/2addr v0, v15

    invoke-virtual {v10, v0, v9}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_14

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_9

    move-object v3, v0

    goto :goto_7

    :cond_9
    move-object v3, v6

    :goto_7
    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v14, :cond_a

    new-instance v6, Lvs2/d;

    const/16 v7, 0x17

    invoke-direct {v6, v7}, Lvs2/d;-><init>(I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v6, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_b
    move-object v6, v8

    :goto_8
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v14, :cond_c

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v7, Lp1/c1;

    sget-object v8, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v10, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly3/c;

    const/16 v9, 0x8

    int-to-float v9, v9

    int-to-float v2, v2

    mul-float v11, v9, v2

    int-to-float v12, v15

    mul-float/2addr v12, v9

    add-float v9, v11, v12

    invoke-interface {v8, v9}, Ly3/c;->F(F)I

    move-result v8

    sget-object v9, Lb2/e;->w:Lb2/m;

    invoke-static {v9, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    const/16 p3, 0x20

    iget-wide v4, v10, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-eqz v1, :cond_d

    invoke-virtual {v10, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_d
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_9
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v10, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v10, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v10, Lp1/q;->S:Z

    if-nez v5, :cond_e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_f

    :cond_e
    invoke-static {v4, v10, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v14, :cond_10

    new-instance v1, Lvy0/a0;

    const/4 v4, 0x0

    invoke-direct {v1, v4, v7}, Lvy0/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v1, Lc93/a;

    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v7}, Lvy0/c0;->o(Lp1/c1;)Z

    move-result v4

    const/4 v5, 0x6

    if-eqz v4, :cond_11

    const v4, -0xa3d9fcf

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v9, 0x0

    invoke-static {v4, v10, v5, v9}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v4

    goto :goto_a

    :cond_11
    const/4 v9, 0x0

    const v4, -0xa3d9bec

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-static {v4, v10, v5, v9}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v4

    :goto_a
    const/4 v9, 0x3

    int-to-float v9, v9

    invoke-static {v0, v9, v2, v4, v5}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v12, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v2, Lvy0/o;

    const/4 v4, 0x3

    invoke-direct {v2, v7, v4}, Lvy0/o;-><init>(Ljava/lang/Object;I)V

    const v4, 0x722ff666

    invoke-static {v4, v10, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const/16 v11, 0x6006

    const/16 v12, 0xc

    move v2, v8

    const/4 v8, 0x0

    move-object/from16 v17, v7

    move-object v7, v0

    move-object v0, v6

    move-object v6, v1

    move-object/from16 v1, v17

    invoke-static/range {v6 .. v12}, Lg1/d3;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v1}, Lvy0/c0;->o(Lp1/c1;)Z

    move-result v4

    if-eqz v4, :cond_13

    const v4, -0x3d6b63b6

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    sget-object v6, Lb2/e;->y:Lb2/m;

    const/4 v9, 0x0

    int-to-long v4, v9

    shl-long v4, v4, p3

    int-to-long v7, v2

    const-wide v11, 0xffffffffL

    and-long/2addr v7, v11

    or-long/2addr v7, v4

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v14, :cond_12

    new-instance v2, Lvy0/a0;

    const/4 v4, 0x1

    invoke-direct {v2, v4, v1}, Lvy0/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v2, Lc93/a;

    new-instance v4, Lc4/j0;

    const/16 v5, 0xe

    const/4 v11, 0x1

    invoke-direct {v4, v11, v5}, Lc4/j0;-><init>(ZI)V

    new-instance v5, Lvy0/b0;

    const/4 v11, 0x0

    move-object/from16 v15, p0

    invoke-direct {v5, v15, v0, v1, v11}, Lvy0/b0;-><init>(Lvy0/d0;Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    const v1, -0x6d0bede

    invoke-static {v1, v10, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    const/16 v13, 0x6d86

    const/4 v14, 0x0

    move v1, v9

    move-object v12, v10

    move-object v9, v2

    move-object v10, v4

    invoke-static/range {v6 .. v14}, Lc4/r;->b(Lb2/h;JLc93/a;Lc4/j0;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v12

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    :goto_b
    const/4 v11, 0x1

    goto :goto_c

    :cond_13
    const/4 v1, 0x0

    move-object/from16 v15, p0

    const v2, -0x3d649d68

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    goto :goto_b

    :goto_c
    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    move-object v6, v0

    move-object v4, v3

    goto :goto_d

    :cond_14
    move-object v15, v5

    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v4, v6

    move-object v6, v8

    :goto_d
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_15

    new-instance v0, Lv31/d;

    const/16 v3, 0x11

    move/from16 v1, p4

    move/from16 v2, p5

    move-object v5, v15

    invoke-direct/range {v0 .. v6}, Lv31/d;-><init>(IIILandroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final n(Lvy0/y;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lp1/c1;)Z
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

.method private static final p(Lp1/c1;Z)V
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

.method private static final q(Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lvy0/c0;->o(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p0, v0}, Lvy0/c0;->p(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p2, v2

    move-object v9, p1

    check-cast v9, Lp1/q;

    invoke-virtual {v9, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {p0}, Lvy0/c0;->o(Lp1/c1;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lx81/d;->a:Lx81/d;

    invoke-static {p1}, Lyb0/f;->a(Lx81/d;)I

    move-result p1

    goto :goto_1

    :cond_1
    sget-object p1, Lx81/d;->a:Lx81/d;

    invoke-static {p1}, Lm4/a;->A(Lx81/d;)I

    move-result p1

    :goto_1
    invoke-static {p1, v9, v3}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v4

    invoke-static {p0}, Lvy0/c0;->o(Lp1/c1;)Z

    move-result p1

    if-eqz p1, :cond_2

    const p1, 0x1b764b31

    invoke-virtual {v9, p1}, Lp1/q;->e0(I)V

    sget p1, Lgy0/f;->h1:I

    invoke-static {v9, p1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    :goto_2
    move-object v5, p1

    goto :goto_3

    :cond_2
    const p1, 0x1b7784f2

    invoke-virtual {v9, p1}, Lp1/q;->e0(I)V

    sget p1, Lgy0/f;->i1:I

    invoke-static {v9, p1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :goto_3
    invoke-static {p0}, Lvy0/c0;->o(Lp1/c1;)Z

    move-result p0

    const/4 p1, 0x6

    if-eqz p0, :cond_3

    const p0, -0x59f3d2d0

    invoke-virtual {v9, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-static {p0, v9, p1, v3}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide p0

    :goto_4
    move-wide v7, p0

    goto :goto_5

    :cond_3
    const p0, -0x59f3ce90

    invoke-virtual {v9, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-static {p0, v9, p1, v3}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide p0

    goto :goto_4

    :goto_5
    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v6, 0x0

    invoke-static/range {v4 .. v11}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    goto :goto_6

    :cond_4
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_6
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lvy0/c0;->p(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lvy0/d0;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    if-eqz p3, :cond_2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-ne p3, p4, :cond_1

    new-instance p3, Lvy0/a0;

    const/4 p4, 0x2

    invoke-direct {p3, p4, p2}, Lvy0/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v5, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v3, p3

    check-cast v3, Lc93/a;

    const/16 v6, 0x180

    const/4 v7, 0x2

    const/4 v2, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v7}, Lvy0/c0;->z(Lvy0/d0;Landroidx/compose/ui/Modifier;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_2
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lvy0/c0;->p(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lvy0/d0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lvy0/c0;->m(Lvy0/d0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lvy0/z;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvy0/z;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x4e7a463

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v5, 0x2

    const/4 v6, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v6

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    or-int/2addr v0, v4

    goto :goto_2

    :cond_2
    move v0, v4

    :goto_2
    and-int/lit8 v7, v4, 0x30

    const/16 v8, 0x20

    if-nez v7, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    move v7, v8

    goto :goto_3

    :cond_3
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v0, v7

    :cond_4
    and-int/lit16 v7, v4, 0x180

    const/16 v9, 0x100

    if-nez v7, :cond_6

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    move v7, v9

    goto :goto_4

    :cond_5
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :cond_6
    and-int/lit16 v7, v0, 0x93

    const/16 v11, 0x92

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v7, v11, :cond_7

    move v7, v13

    goto :goto_5

    :cond_7
    move v7, v12

    :goto_5
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v10, v11, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_11

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    and-int/lit8 v7, v0, 0x70

    if-ne v7, v8, :cond_8

    move v7, v13

    goto :goto_6

    :cond_8
    move v7, v12

    :goto_6
    and-int/lit16 v8, v0, 0x380

    if-ne v8, v9, :cond_9

    move v8, v13

    goto :goto_7

    :cond_9
    move v8, v12

    :goto_7
    or-int/2addr v7, v8

    and-int/lit8 v8, v0, 0xe

    const/16 v9, 0x8

    if-eq v8, v6, :cond_b

    and-int/2addr v0, v9

    if-eqz v0, :cond_a

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_8

    :cond_a
    move v0, v12

    goto :goto_9

    :cond_b
    :goto_8
    move v0, v13

    :goto_9
    or-int/2addr v0, v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_c

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v7, v0, :cond_d

    :cond_c
    new-instance v7, Lre1/k;

    const/16 v0, 0x11

    invoke-direct {v7, v2, v3, v1, v0}, Lre1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v18, v7

    check-cast v18, Lc93/a;

    const/16 v19, 0xf

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v5, v5

    int-to-float v7, v9

    mul-float/2addr v5, v7

    int-to-float v8, v13

    mul-float/2addr v8, v7

    invoke-static {v0, v5, v8}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Lb2/e;->K:Lb2/l;

    invoke-static {v8}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    const/16 v8, 0x36

    invoke-static {v7, v5, v10, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_e

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_e
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_a
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v10, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v10, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-nez v8, :cond_f

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    :cond_f
    invoke-static {v7, v10, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v10, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v0, v6

    mul-float/2addr v0, v0

    invoke-static {v0, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v1}, Lvy0/z;->a()Lgz0/m0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-static {v0, v10, v12}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v5

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v14, 0x6

    invoke-virtual {v0, v10, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v8

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1}, Lvy0/z;->c()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "toUpperCase(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v10, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->k()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v10, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v7

    const/16 v29, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v0, v13

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

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_11
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_12

    new-instance v0, Lvv2/c;

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lvv2/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final x(Lc93/a;Lkotlin/jvm/functions/Function1;Lvy0/z;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    new-instance p0, Lvy0/y$a;

    invoke-virtual {p2}, Lvy0/z;->b()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p2

    invoke-direct {p0, p2}, Lvy0/y$a;-><init>(Lcom/whoop/navigation/models/GenericInteraction;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lvy0/z;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lvy0/c0;->w(Lvy0/z;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final z(Lvy0/d0;Landroidx/compose/ui/Modifier;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvy0/d0;",
            "Landroidx/compose/ui/Modifier;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v2, 0x3e88b504

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v5, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v5

    goto :goto_1

    :cond_1
    move v2, v5

    :goto_1
    and-int/lit8 v6, p6, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_2

    move-object/from16 v7, p1

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v2, v8

    :goto_3
    and-int/lit8 v8, p6, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move-object/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v5, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v2, v10

    :goto_5
    and-int/lit8 v10, p6, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v2, v2, 0xc00

    :cond_8
    move-object/from16 v11, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v5, 0xc00

    if-nez v11, :cond_8

    move-object/from16 v11, p3

    invoke-virtual {v0, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_6

    :cond_a
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v2, v12

    :goto_7
    and-int/lit16 v12, v2, 0x493

    const/16 v13, 0x492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v12, v13, :cond_b

    move v12, v15

    goto :goto_8

    :cond_b
    move v12, v14

    :goto_8
    and-int/lit8 v13, v2, 0x1

    invoke-virtual {v0, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_17

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v6, :cond_c

    move-object v7, v12

    :cond_c
    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v8, :cond_e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v6, :cond_d

    new-instance v8, Lvw0/a;

    const/16 v9, 0x15

    invoke-direct {v8, v9}, Lvw0/a;-><init>(I)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v8, Lc93/a;

    move-object v9, v8

    :cond_e
    if-eqz v10, :cond_10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v6, :cond_f

    new-instance v8, Lvs2/d;

    const/16 v6, 0x18

    invoke-direct {v8, v6}, Lvs2/d;-><init>(I)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v6, v8

    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v11, v6

    :cond_10
    const/16 v6, 0x30

    int-to-float v6, v6

    int-to-float v4, v4

    mul-float/2addr v6, v4

    const/4 v4, 0x0

    invoke-static {v7, v6, v4, v3}, Landroidx/compose/foundation/layout/d;->v(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/a1;->x:Ll0/a1;

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lvy0/c0;->b:Landroidx/compose/ui/Modifier;

    invoke-interface {v3, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v4, v15

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v4, v6

    invoke-static {v3, v4, v4}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v8, v0, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move v8, v15

    iget-wide v14, v0, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_11

    invoke-virtual {v0, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_11
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_9
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v0, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v0, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-nez v13, :cond_12

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_13

    :cond_12
    invoke-static {v10, v0, v10, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v0, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, -0x2d2e45bb

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lvy0/d0;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v6, 0x0

    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_16

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v13, v6, 0x1

    if-ltz v6, :cond_15

    check-cast v10, Lvy0/z;

    sget v14, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    shr-int/lit8 v15, v2, 0x3

    and-int/lit8 v16, v15, 0x70

    or-int v14, v14, v16

    and-int/lit16 v15, v15, 0x380

    or-int/2addr v14, v15

    invoke-static {v10, v9, v11, v0, v14}, Lvy0/c0;->w(Lvy0/z;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1}, Lvy0/d0;->a()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    sub-int/2addr v10, v8

    if-ge v6, v10, :cond_14

    const v6, 0x37b83be4

    invoke-static {v0, v6, v12, v4, v0}, Lte0/d;->z(Lp1/q;ILb2/t;FLp1/q;)V

    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_14
    const/4 v6, 0x0

    const v10, 0x37b96473

    invoke-virtual {v0, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v6}, Lp1/q;->q(Z)V

    :goto_b
    move v6, v13

    goto :goto_a

    :cond_15
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_16
    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    :goto_c
    move-object v2, v7

    move-object v3, v9

    move-object v4, v11

    goto :goto_d

    :cond_17
    invoke-virtual {v0}, Lp1/q;->X()V

    goto :goto_c

    :goto_d
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_18

    new-instance v0, Lsl0/k2;

    const/16 v7, 0x18

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lsl0/k2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method
