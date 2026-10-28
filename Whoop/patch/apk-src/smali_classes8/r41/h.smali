.class public abstract Lr41/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a7\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0011\u0010\u000c\u001a\u00020\u000b*\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\n\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\"\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u001a\u0010\u0019\u001a\u00020\u00118\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0013\u001a\u0004\u0008\u0018\u0010\u0015\"\u001a\u0010\u001c\u001a\u00020\u00118\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0013\u001a\u0004\u0008\u001b\u0010\u0015\"\u001a\u0010\u001f\u001a\u00020\u00118\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0013\u001a\u0004\u0008\u001e\u0010\u0015\"\u001a\u0010\"\u001a\u00020\u00118\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0013\u001a\u0004\u0008!\u0010\u0015\"\u001a\u0010%\u001a\u00020\u00118\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u0013\u001a\u0004\u0008$\u0010\u0015\"\u001a\u0010(\u001a\u00020\u00118\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008&\u0010\u0013\u001a\u0004\u0008\'\u0010\u0015\u00a8\u0006+\u00b2\u0006\u0010\u0010*\u001a\u0004\u0018\u00010)8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lr41/i;",
        "itemState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "o",
        "(Lr41/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "",
        "G",
        "(Ljava/lang/CharSequence;)Ljava/lang/String;",
        "Lq3/r;",
        "O",
        "(Ljava/lang/CharSequence;)Lq3/r;",
        "Ly3/f;",
        "a",
        "F",
        "J",
        "()F",
        "weightliftingSetIconStartPadding",
        "b",
        "H",
        "weightliftingSetIconEndPadding",
        "c",
        "I",
        "weightliftingSetIconSize",
        "d",
        "N",
        "weightliftingSetTextFieldSpacerSize",
        "e",
        "M",
        "weightliftingSetNumberStartPadding",
        "f",
        "K",
        "weightliftingSetNumberEndPadding",
        "g",
        "L",
        "weightliftingSetNumberSize",
        "Lg2/v;",
        "focusState",
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
.field private static final a:F

.field private static final b:F

.field private static final c:F

.field private static final d:F

.field private static final e:F

.field private static final f:F

.field private static final g:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-wide/high16 v0, 0x4004000000000000L    # 2.5

    double-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lr41/h;->a:F

    const/4 v2, 0x2

    int-to-float v2, v2

    mul-float/2addr v2, v1

    sput v2, Lr41/h;->b:F

    sget-object v1, Lny0/q$c;->f:Lny0/q$c;

    invoke-virtual {v1}, Lny0/q;->d()F

    move-result v1

    sput v1, Lr41/h;->c:F

    const/4 v1, 0x3

    int-to-float v1, v1

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v1, v3

    sput v1, Lr41/h;->d:F

    sput v2, Lr41/h;->e:F

    sput v0, Lr41/h;->f:F

    sput v1, Lr41/h;->g:F

    return-void
.end method

.method private static final A()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;Lr41/i;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "newText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr41/e;

    invoke-virtual {p1}, Lr41/i;->o()I

    move-result p1

    invoke-direct {v0, p2, p1}, Lr41/e;-><init>(Ljava/lang/String;I)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lg2/i;Lkotlin/jvm/functions/Function1;Lr41/i;Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p3}, Lr41/h;->q(Lp1/c1;)Lg2/v;

    move-result-object p3

    if-eqz p3, :cond_0

    check-cast p3, Lg2/w;

    invoke-virtual {p3}, Lg2/w;->a()Z

    move-result p3

    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    invoke-static {p0}, Lg2/i;->a(Lg2/i;)V

    :cond_0
    invoke-virtual {p2}, Lr41/i;->l()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    new-instance v0, Lp90/h;

    const/16 v1, 0x13

    invoke-direct {v0, p1, v1}, Lp90/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-static {p0, v0}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final E(Lkotlin/jvm/functions/Function1;Lg2/v;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lg2/w;

    invoke-virtual {p1}, Lg2/w;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lr41/c;->a:Lr41/c;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lr41/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lr41/h;->o(Lr41/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final G(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    rsub-int/lit8 v1, v1, 0x3

    const/4 v2, 0x0

    if-gez v1, :cond_0

    move v1, v2

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move v4, v2

    :goto_0
    if-ge v4, v1, :cond_1

    const-string v5, "0"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v3, 0x2

    sub-int/2addr v1, v3

    invoke-static {v2, v1}, Le93/b;->i0(II)Li93/j;

    move-result-object v1

    invoke-static {p0, v1}, Lyb3/r;->C0(Ljava/lang/String;Li93/j;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, p0}, Lyb3/r;->M0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final H()F
    .locals 1

    sget v0, Lr41/h;->b:F

    return v0
.end method

.method public static final I()F
    .locals 1

    sget v0, Lr41/h;->c:F

    return v0
.end method

.method public static final J()F
    .locals 1

    sget v0, Lr41/h;->a:F

    return v0
.end method

.method public static final K()F
    .locals 1

    sget v0, Lr41/h;->f:F

    return v0
.end method

.method public static final L()F
    .locals 1

    sget v0, Lr41/h;->g:F

    return v0
.end method

.method public static final M()F
    .locals 1

    sget v0, Lr41/h;->e:F

    return v0
.end method

.method public static final N()F
    .locals 1

    sget v0, Lr41/h;->d:F

    return v0
.end method

.method public static final O(Ljava/lang/CharSequence;)Lq3/r;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr41/h$c;

    invoke-direct {v0, p0}, Lr41/h$c;-><init>(Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method public static synthetic a(Ll3/g;)Lq3/e0;
    .locals 0

    invoke-static {p0}, Lr41/h;->t(Ll3/g;)Lq3/e0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lr41/i;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lr41/h;->v(Lkotlin/jvm/functions/Function1;Lr41/i;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lr41/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lr41/h;->F(Lr41/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lr41/i;Ltr2/n;Lu0/p0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lr41/h;->z(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lr41/i;Ltr2/n;Lu0/p0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lr41/i;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lr41/h;->B(Lkotlin/jvm/functions/Function1;Lr41/i;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Lr41/h;->w()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Lg2/v;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lr41/h;->E(Lkotlin/jvm/functions/Function1;Lg2/v;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Lr41/i;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lr41/h;->x(Lkotlin/jvm/functions/Function1;Lr41/i;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lr41/h;->y(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lr41/h;->s(Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k()Ll83/a0;
    .locals 1

    invoke-static {}, Lr41/h;->A()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic l(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lr41/h;->p(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m()Ll83/a0;
    .locals 1

    invoke-static {}, Lr41/h;->u()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic n(Lg2/i;Lkotlin/jvm/functions/Function1;Lr41/i;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lr41/h;->C(Lg2/i;Lkotlin/jvm/functions/Function1;Lr41/i;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Lr41/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 60
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr41/i;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v3, p0

    move/from16 v6, p4

    const-string v0, "itemState"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, -0x202c904e

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v4, p5, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    move-object/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v6, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v0, v10

    :goto_5
    and-int/lit16 v10, v0, 0x93

    const/16 v11, 0x92

    const/4 v14, 0x0

    if-eq v10, v11, :cond_8

    const/4 v10, 0x1

    goto :goto_6

    :cond_8
    move v10, v14

    :goto_6
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v12, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_33

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_9

    move-object v4, v15

    goto :goto_7

    :cond_9
    move-object v4, v5

    :goto_7
    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_b

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v5, :cond_a

    new-instance v7, Lqt2/w;

    const/16 v9, 0x17

    invoke-direct {v7, v9}, Lqt2/w;-><init>(I)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_b
    move-object v7, v9

    :goto_8
    sget-object v9, Lx81/d;->a:Lx81/d;

    const/4 v10, 0x6

    invoke-virtual {v9, v12, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->D()Lb91/a;

    move-result-object v11

    invoke-virtual {v9, v12, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->D()Lb91/a;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/a;->d()Ll3/v0;

    move-result-object v17

    invoke-virtual {v3}, Lr41/i;->m()Ly81/f;

    move-result-object v8

    invoke-virtual {v8, v12, v14}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v18

    const/16 v30, 0x0

    const v31, 0xfffffe

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v17 .. v31}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v8

    const/4 v14, 0x0

    invoke-static {v11, v8, v14, v2, v14}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v2

    sget-object v8, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v12, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg2/i;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v5, :cond_c

    invoke-static {v14}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v12, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v11, Lp1/c1;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v5, :cond_d

    invoke-static {v12}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v14

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v14, Lbc3/c0;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v5, :cond_e

    sget-object v10, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "WeightliftingSet"

    invoke-virtual {v10, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v10

    invoke-virtual {v12, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v1, v10

    check-cast v1, Ltr2/n;

    move-object/from16 v22, v14

    const-wide/high16 v13, 0x3ff4000000000000L    # 1.25

    double-to-float v13, v13

    const/16 v14, 0x8

    int-to-float v14, v14

    mul-float/2addr v13, v14

    sget-object v17, Lqz0/l;->a:Lqz0/l;

    invoke-virtual/range {v17 .. v17}, Lqz0/l;->f()F

    move-result v10

    move/from16 v17, v14

    new-instance v14, Ll0/l1;

    invoke-direct {v14, v10, v13, v10, v13}, Ll0/l1;-><init>(FFFF)V

    const/4 v10, 0x1

    int-to-float v13, v10

    const/4 v10, 0x4

    int-to-float v10, v10

    mul-float/2addr v10, v13

    invoke-static {v10}, Lt0/j;->e(F)Lt0/i;

    move-result-object v10

    invoke-virtual {v3}, Lr41/i;->r()Z

    move-result v16

    if-eqz v16, :cond_f

    move-object/from16 v33, v2

    const v2, 0x7ee7bcb2

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x6

    invoke-virtual {v9, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    move-object v2, v7

    invoke-virtual/range {v16 .. v16}, Ly81/i;->a()J

    move-result-wide v6

    invoke-static {v15, v13, v6, v7, v10}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_f
    move-object/from16 v33, v2

    move-object v2, v7

    const/4 v7, 0x0

    const v6, 0x7ee964c4

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    move-object v6, v15

    :goto_9
    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v35, v14

    const-wide/high16 v13, 0x3fd0000000000000L    # 0.25

    double-to-float v13, v13

    mul-float v13, v13, v17

    const/4 v14, 0x0

    move-object/from16 v24, v2

    const/4 v2, 0x1

    invoke-static {v7, v14, v13, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-interface {v7, v6}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v3}, Lr41/i;->b()Ly81/e;

    move-result-object v7

    const/4 v13, 0x0

    invoke-interface {v7, v12, v13}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v2

    invoke-static {v6, v2, v3, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v6

    mul-float v3, v3, v17

    const/4 v10, 0x1

    invoke-static {v2, v14, v3, v10}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_10

    new-instance v3, Lq12/c;

    const/4 v6, 0x4

    invoke-direct {v3, v6, v11}, Lq12/c;-><init>(ILp1/c1;)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->K:Lb2/l;

    sget-object v6, Ll0/m;->a:Ll0/e;

    const/16 v7, 0x30

    invoke-static {v6, v3, v12, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v6, v12, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_11

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_11
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_a
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v12, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v12, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_12

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v47, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v10, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    goto :goto_b

    :cond_12
    move-object/from16 v47, v3

    :goto_b
    invoke-static {v6, v12, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v12, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lr41/i;->q()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v12, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget v16, Lr41/h;->e:F

    sget v18, Lr41/h;->f:F

    const/16 v19, 0x0

    const/16 v20, 0xa

    const/16 v17, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v3, 0x6

    invoke-virtual {v9, v12, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->C()Lb91/a;

    move-result-object v27

    invoke-virtual/range {p0 .. p0}, Lr41/i;->p()Ly81/f;

    move-result-object v3

    move-object/from16 v16, v2

    const/4 v2, 0x0

    invoke-virtual {v3, v12, v2}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v17

    const/16 v31, 0x0

    const v32, 0x2fff8

    move-object v3, v11

    move-object/from16 v40, v12

    const-wide/16 v11, 0x0

    move-object/from16 v19, v13

    const/4 v13, 0x0

    move-object/from16 v20, v14

    const/4 v14, 0x0

    move-object/from16 v21, v15

    const/4 v15, 0x0

    move-object/from16 v28, v8

    move-object/from16 v26, v9

    move-object v8, v10

    move-wide/from16 v9, v17

    move-object/from16 v18, v7

    move-object/from16 v7, v16

    const-wide/16 v16, 0x0

    move-object/from16 v29, v18

    const/16 v18, 0x0

    move-object/from16 v30, v19

    const/16 v19, 0x0

    move-object/from16 v34, v20

    move-object/from16 v36, v21

    const-wide/16 v20, 0x0

    move-object/from16 v37, v22

    const/16 v22, 0x0

    const/high16 v38, 0x3f800000    # 1.0f

    const/16 v23, 0x0

    move-object/from16 v39, v24

    const/16 v24, 0x0

    const/16 v41, 0x1

    const/16 v25, 0x0

    move-object/from16 v42, v26

    const/16 v26, 0x0

    move-object/from16 v43, v28

    const/16 v28, 0x0

    move-object/from16 v44, v30

    const/16 v30, 0x30

    move-object/from16 v50, v3

    move-object/from16 p1, v6

    move-object/from16 v54, v29

    move-object/from16 v53, v34

    move-object/from16 v6, v36

    move-object/from16 v51, v37

    move/from16 v55, v38

    move-object/from16 v3, v39

    move-object/from16 v29, v40

    move/from16 v2, v41

    move-object/from16 v48, v42

    move-object/from16 v49, v43

    move-object/from16 v52, v44

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    invoke-virtual/range {p0 .. p0}, Lr41/i;->u()Z

    move-result v7

    const v8, 0x3ecccccd    # 0.4f

    sget-object v9, Ll0/t1;->a:Ll0/t1;

    if-eqz v7, :cond_19

    const v7, -0x2730f151

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lr41/i;->t()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v5, :cond_14

    new-instance v10, Lg40/h2;

    const/4 v11, 0x2

    invoke-direct {v10, v11}, Lg40/h2;-><init>(I)V

    invoke-virtual {v12, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object/from16 v26, v10

    check-cast v26, Lq3/g0;

    invoke-virtual {v9, v6, v2, v8}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8, v3}, Lr41/h;->D(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v5, :cond_15

    new-instance v10, Lqv1/e;

    const/4 v11, 0x6

    invoke-direct {v10, v11}, Lqv1/e;-><init>(I)V

    invoke-virtual {v12, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object/from16 v38, v10

    check-cast v38, Lc93/a;

    and-int/lit16 v10, v0, 0x380

    const/16 v11, 0x100

    if-ne v10, v11, :cond_16

    move v13, v2

    :goto_c
    move-object/from16 v10, p0

    goto :goto_d

    :cond_16
    const/4 v13, 0x0

    goto :goto_c

    :goto_d
    invoke-virtual {v12, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_17

    if-ne v14, v5, :cond_18

    :cond_17
    new-instance v14, Lr41/g;

    const/4 v13, 0x1

    invoke-direct {v14, v3, v10, v13}, Lr41/g;-><init>(Lkotlin/jvm/functions/Function1;Lr41/i;I)V

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object/from16 v39, v14

    check-cast v39, Lkotlin/jvm/functions/Function1;

    const v45, 0x37fabef8

    const/16 v46, 0x0

    const/4 v10, 0x0

    move/from16 v56, v11

    const/4 v11, 0x0

    move-object/from16 v40, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x3

    const/16 v23, 0x0

    const/16 v24, 0x6

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    move-object/from16 v34, v9

    move-object/from16 v9, v33

    const/16 v33, 0x0

    move-object/from16 v36, v34

    const/16 v34, 0x0

    move-object/from16 v37, v36

    const/16 v36, 0x0

    move-object/from16 v41, v37

    const/16 v37, 0x0

    move-object/from16 v42, v41

    const/16 v41, 0x0

    move-object/from16 v43, v42

    const v42, 0x6186000

    move-object/from16 v44, v43

    const/16 v43, 0x0

    move-object/from16 v58, v44

    const/16 v44, 0x6

    move-object/from16 v56, v8

    move-object v8, v7

    move-object/from16 v7, v56

    move-object/from16 v56, v4

    move-object/from16 v4, v58

    invoke-static/range {v7 .. v46}, Lqz0/k;->l(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lb91/a;Lc93/m;Lc93/m;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZLb91/a;JZIIIZLq3/g0;ZZIZLj0/i;Ljava/lang/String;Li2/a1;Lg1/e8;Ll0/k1;Ll0/k1;Lu0/q0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIIIII)V

    move-object/from16 v12, v40

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    move-object/from16 v2, p0

    move-object/from16 v58, v3

    move v3, v7

    goto/16 :goto_10

    :cond_19
    move-object/from16 v56, v4

    move-object v4, v9

    move-object/from16 v9, v33

    const/4 v7, 0x0

    const v10, -0x2722ea86

    invoke-virtual {v12, v10}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lr41/i;->n()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v4, v6, v2, v8}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8, v3}, Lr41/h;->D(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v5, :cond_1a

    new-instance v11, Lqv1/e;

    const/4 v13, 0x7

    invoke-direct {v11, v13}, Lqv1/e;-><init>(I)V

    invoke-virtual {v12, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object/from16 v38, v11

    check-cast v38, Lc93/a;

    and-int/lit16 v11, v0, 0x380

    const/16 v13, 0x100

    if-ne v11, v13, :cond_1b

    move v11, v2

    :goto_e
    move-object/from16 v14, p0

    goto :goto_f

    :cond_1b
    move v11, v7

    goto :goto_e

    :goto_f
    invoke-virtual {v12, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    or-int v11, v11, v16

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v11, :cond_1c

    if-ne v2, v5, :cond_1d

    :cond_1c
    new-instance v2, Lr41/g;

    const/4 v11, 0x2

    invoke-direct {v2, v3, v14, v11}, Lr41/g;-><init>(Lkotlin/jvm/functions/Function1;Lr41/i;I)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    move-object/from16 v39, v2

    check-cast v39, Lkotlin/jvm/functions/Function1;

    const v45, 0x37f6bef8

    const/16 v46, 0x0

    move/from16 v21, v7

    move-object v7, v8

    move-object v8, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v40, v12

    const/4 v12, 0x0

    move/from16 v59, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    move/from16 v2, v21

    const/16 v21, 0x0

    const/16 v22, 0x3

    const/16 v23, 0x0

    const/16 v24, 0x6

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x1

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v41, 0x0

    const v42, 0x30186000

    const/16 v43, 0x0

    const/16 v44, 0x6

    move-object/from16 v58, v3

    move v3, v2

    move-object/from16 v2, p0

    invoke-static/range {v7 .. v46}, Lqz0/k;->l(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lb91/a;Lc93/m;Lc93/m;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZLb91/a;JZIIIZLq3/g0;ZZIZLj0/i;Ljava/lang/String;Li2/a1;Lg1/e8;Ll0/k1;Ll0/k1;Lu0/q0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIIIII)V

    move-object/from16 v12, v40

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    :goto_10
    sget v7, Lr41/h;->d:F

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v12, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v2}, Lr41/i;->w()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v2}, Lr41/i;->v()I

    move-result v24

    move-object/from16 v7, v49

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_1e

    if-ne v11, v5, :cond_1f

    :cond_1e
    new-instance v11, Lb30/l1;

    const/16 v10, 0x12

    invoke-direct {v11, v7, v10}, Lb30/l1;-><init>(Lg2/i;I)V

    invoke-virtual {v12, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    move-object/from16 v17, v11

    check-cast v17, Lkotlin/jvm/functions/Function1;

    move-object/from16 v14, v51

    invoke-virtual {v12, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    and-int/lit16 v11, v0, 0x380

    const/16 v13, 0x100

    if-ne v11, v13, :cond_20

    const/4 v0, 0x1

    goto :goto_11

    :cond_20
    move v0, v3

    :goto_11
    or-int/2addr v0, v10

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v0, v10

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v0, v10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v0, :cond_22

    if-ne v10, v5, :cond_21

    goto :goto_12

    :cond_21
    move-object v3, v2

    move-object v13, v4

    move-object v0, v10

    move-object/from16 v2, v58

    const/4 v14, 0x1

    move-object v10, v5

    goto :goto_13

    :cond_22
    :goto_12
    new-instance v0, Ljp2/l;

    move-object v10, v5

    const/16 v5, 0x1b

    move-object v3, v2

    move-object v13, v4

    move-object/from16 v2, v58

    move-object v4, v1

    move-object v1, v14

    const/4 v14, 0x1

    invoke-direct/range {v0 .. v5}, Ljp2/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_13
    move-object/from16 v18, v0

    check-cast v18, Lkotlin/jvm/functions/Function1;

    new-instance v16, Lu0/q0;

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x3a

    invoke-direct/range {v16 .. v21}, Lu0/q0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    const v0, 0x3f19999a    # 0.6f

    invoke-virtual {v13, v6, v14, v0}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v2}, Lr41/h;->D(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_23

    new-instance v1, Lqv1/e;

    const/4 v4, 0x5

    invoke-direct {v1, v4}, Lqv1/e;-><init>(I)V

    invoke-virtual {v12, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    move-object/from16 v38, v1

    check-cast v38, Lc93/a;

    const/16 v13, 0x100

    if-ne v11, v13, :cond_24

    move v1, v14

    goto :goto_14

    :cond_24
    const/4 v1, 0x0

    :goto_14
    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_25

    if-ne v4, v10, :cond_26

    :cond_25
    new-instance v4, Lr41/g;

    const/4 v1, 0x0

    invoke-direct {v4, v2, v3, v1}, Lr41/g;-><init>(Lkotlin/jvm/functions/Function1;Lr41/i;I)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    move-object/from16 v39, v4

    check-cast v39, Lkotlin/jvm/functions/Function1;

    const v45, 0x17f6bef8

    const/16 v46, 0x0

    move-object v1, v10

    const/4 v10, 0x0

    move v4, v11

    const/4 v11, 0x0

    move-object/from16 v40, v12

    const/4 v12, 0x0

    move/from16 v59, v13

    const/4 v13, 0x0

    move/from16 v18, v14

    const/4 v14, 0x0

    move-object/from16 v37, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v25, v18

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x9

    const/16 v23, 0x0

    move/from16 v57, v25

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x1

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v41, 0x0

    const v42, 0x30006000

    const/16 v43, 0x0

    const/16 v44, 0x6

    move-object v5, v1

    move-object/from16 v58, v2

    move-object v1, v7

    move/from16 v2, v59

    move-object v7, v0

    move-object/from16 v0, v47

    invoke-static/range {v7 .. v46}, Lqz0/k;->l(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lb91/a;Lc93/m;Lc93/m;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZLb91/a;JZIIIZLq3/g0;ZZIZLj0/i;Ljava/lang/String;Li2/a1;Lg1/e8;Ll0/k1;Ll0/k1;Lu0/q0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIIIII)V

    move-object/from16 v12, v40

    sget v16, Lr41/h;->a:F

    sget v18, Lr41/h;->b:F

    const/16 v19, 0x0

    const/16 v20, 0xa

    const/16 v17, 0x0

    move-object v15, v6

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->w:Lb2/m;

    const/4 v8, 0x0

    invoke-static {v7, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_27

    move-object/from16 v11, v52

    invoke-virtual {v12, v11}, Lp1/q;->l(Lc93/a;)V

    :goto_15
    move-object/from16 v11, v53

    goto :goto_16

    :cond_27
    invoke-virtual {v12}, Lp1/q;->s0()V

    goto :goto_15

    :goto_16
    invoke-static {v12, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_28

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_29

    :cond_28
    move-object/from16 v0, v54

    goto :goto_18

    :cond_29
    :goto_17
    move-object/from16 v0, p1

    goto :goto_19

    :goto_18
    invoke-static {v9, v12, v9, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_17

    :goto_19
    invoke-static {v12, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v3}, Lr41/i;->s()Z

    move-result v0

    if-eqz v0, :cond_2a

    const v0, 0x5d70631b

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    move-object/from16 v0, v48

    const/4 v2, 0x6

    invoke-virtual {v0, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->a()J

    move-result-wide v0

    const/4 v2, 0x3

    int-to-float v10, v2

    sget v2, Lr41/h;->c:F

    invoke-static {v2, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v15, 0x186

    const/16 v16, 0x18

    move-object/from16 v40, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    move v6, v8

    move-object/from16 v14, v40

    move-wide v8, v0

    invoke-static/range {v7 .. v16}, Lg1/v4;->b(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V

    move-object v12, v14

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    move-object/from16 v2, v58

    :goto_1a
    const/4 v10, 0x1

    goto/16 :goto_1f

    :cond_2a
    move v6, v8

    const v0, 0x5d74f998

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_2b

    invoke-static/range {v55 .. v55}, Ld0/f;->a(F)Ld0/e;

    move-result-object v0

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v0, Ld0/e;

    invoke-virtual {v3}, Lr41/i;->a()Z

    move-result v7

    if-eqz v7, :cond_2f

    const v7, 0x5d75f6cd

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v5, :cond_2c

    invoke-virtual {v3}, Lr41/i;->j()Z

    move-result v7

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    check-cast v7, Lp1/c1;

    invoke-virtual {v3}, Lr41/i;->j()Z

    move-result v8

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_2d

    if-ne v10, v5, :cond_2e

    :cond_2d
    new-instance v10, Lr41/h$a;

    const/4 v9, 0x0

    invoke-direct {v10, v3, v7, v0, v9}, Lr41/h$a;-><init>(Lr41/i;Lp1/c1;Ld0/e;Lq83/d;)V

    invoke-virtual {v12, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2e
    check-cast v10, Lc93/m;

    invoke-static {v12, v10, v8}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    goto :goto_1b

    :cond_2f
    const v7, 0x5d876632

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    :goto_1b
    invoke-virtual {v3}, Lr41/i;->e()Lny0/q;

    move-result-object v17

    invoke-virtual {v3}, Lr41/i;->c()I

    move-result v18

    invoke-virtual {v3}, Lr41/i;->g()Ly81/f;

    move-result-object v19

    invoke-virtual {v3}, Lr41/i;->f()Ly81/f;

    move-result-object v20

    invoke-virtual {v3}, Lr41/i;->k()Z

    move-result v23

    invoke-virtual {v3}, Lr41/i;->i()Z

    move-result v22

    invoke-virtual {v3}, Lr41/i;->j()Z

    move-result v26

    new-instance v16, Lny0/o;

    const/16 v27, 0x190

    const/16 v28, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v16 .. v28}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v16

    invoke-virtual {v3}, Lr41/i;->h()I

    move-result v8

    invoke-static {v12, v8}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    move-result v16

    invoke-virtual {v0}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v17

    const v25, 0x7fffc

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v15 .. v25}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-ne v4, v2, :cond_30

    const/4 v13, 0x1

    goto :goto_1c

    :cond_30
    move v13, v6

    :goto_1c
    or-int/2addr v0, v13

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_32

    if-ne v2, v5, :cond_31

    goto :goto_1d

    :cond_31
    move-object v0, v2

    move-object/from16 v2, v58

    goto :goto_1e

    :cond_32
    :goto_1d
    new-instance v0, Lnw0/e;

    const/16 v5, 0x9

    move-object/from16 v4, v50

    move-object/from16 v2, v58

    invoke-direct/range {v0 .. v5}, Lnw0/e;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1e
    move-object v11, v0

    check-cast v11, Lc93/a;

    const/4 v13, 0x0

    const/16 v14, 0x8

    const/4 v10, 0x0

    invoke-static/range {v7 .. v14}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    goto/16 :goto_1a

    :goto_1f
    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    move-object v6, v2

    move-object/from16 v5, v56

    goto :goto_20

    :cond_33
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v6, v9

    :goto_20
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_34

    new-instance v0, Lqb0/a;

    const/16 v3, 0x14

    move-object/from16 v4, p0

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lqb0/a;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_34
    return-void
.end method

.method private static final p(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lp1/c1;)Lg2/v;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lg2/v;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg2/v;

    return-object p0
.end method

.method private static final r(Lp1/c1;Lg2/v;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lg2/v;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final s(Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lr41/h;->r(Lp1/c1;Lg2/v;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Ll3/g;)Lq3/e0;
    .locals 3

    const-string v0, "inputText"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq3/e0;

    new-instance v1, Ll3/g;

    invoke-static {p0}, Lr41/h;->G(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ll3/g;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lr41/h;->O(Ljava/lang/CharSequence;)Lq3/r;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lq3/e0;-><init>(Ll3/g;Lq3/r;)V

    return-object v0
.end method

.method private static final u()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final v(Lkotlin/jvm/functions/Function1;Lr41/i;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "newText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr41/d;

    invoke-virtual {p1}, Lr41/i;->o()I

    move-result p1

    invoke-direct {v0, p2, p1}, Lr41/d;-><init>(Ljava/lang/String;I)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final x(Lkotlin/jvm/functions/Function1;Lr41/i;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "newText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr41/b;

    invoke-virtual {p1}, Lr41/i;->o()I

    move-result p1

    invoke-direct {v0, p2, p1}, Lr41/b;-><init>(Ljava/lang/String;I)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$KeyboardActions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lg2/i;->a(Lg2/i;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lr41/i;Ltr2/n;Lu0/p0;)Ll83/a0;
    .locals 7

    const-string v0, "$this$KeyboardActions"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lr41/h$b;

    const/4 v6, 0x0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    move-object v4, p4

    invoke-direct/range {v1 .. v6}, Lr41/h$b;-><init>(Lkotlin/jvm/functions/Function1;Lr41/i;Lu0/p0;Ltr2/n;Lq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {p0, p2, p2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
