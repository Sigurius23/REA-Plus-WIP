.class public abstract Lt71/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\" \u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lt71/j;",
        "state",
        "Ll83/a0;",
        "e",
        "(Landroidx/compose/ui/Modifier;Lt71/j;Landroidx/compose/runtime/Composer;II)V",
        "",
        "Li21/j;",
        "a",
        "Ljava/util/List;",
        "j",
        "()Ljava/util/List;",
        "emptyImpactCardStateList",
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
            "Li21/j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 18

    new-instance v0, Li21/j;

    const-string v1, "I tried so hard but not so far"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v2, Ly11/r;

    const/16 v10, 0x7f

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Ly11/r;-><init>(FLy81/f;FFLy81/f;Lcom/whoop/design/util/TextResource;Ly11/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Li21/l$a;

    const-string v4, "24%"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const/16 v14, 0x3fc

    const/4 v15, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v3 .. v15}, Li21/l$a;-><init>(Lcom/whoop/design/util/TextResource;ZLy81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li21/u;Lhy0/h1;Ljava/util/List;Ly81/f;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x2

    move-object v4, v3

    move-object v3, v2

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v6}, Li21/j;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;Li21/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Li21/j;

    const-string v2, "In the end"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v3, Ly11/r;

    sget-object v7, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    const/16 v11, 0x63

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, 0x3ecccccd    # 0.4f

    move-object v8, v7

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v3 .. v12}, Ly11/r;-><init>(FLy81/f;FFLy81/f;Lcom/whoop/design/util/TextResource;Ly11/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v8

    const-string v4, "-6%"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v4, Li21/l$a;

    const/16 v15, 0x3f8

    const/16 v16, 0x0

    const/4 v6, 0x1

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v4 .. v16}, Li21/l$a;-><init>(Lcom/whoop/design/util/TextResource;ZLy81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li21/u;Lhy0/h1;Ljava/util/List;Ly81/f;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v7

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v5, v4

    move-object v4, v3

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v7}, Li21/j;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;Li21/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Li21/j;

    const-string v3, "It doesn\'t even matter!"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v4, Ly11/r;

    const/16 v12, 0x63

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, 0x3e4ccccd    # 0.2f

    move-object v9, v8

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-direct/range {v4 .. v13}, Ly11/r;-><init>(FLy81/f;FFLy81/f;Lcom/whoop/design/util/TextResource;Ly11/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v17, v4

    move-object v7, v9

    const-string v4, "-13%"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v4, Li21/l$a;

    const/4 v6, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v4 .. v16}, Li21/l$a;-><init>(Lcom/whoop/design/util/TextResource;ZLy81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li21/u;Lhy0/h1;Ljava/util/List;Ly81/f;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v14, 0x2

    const/4 v15, 0x0

    move-object v9, v2

    move-object v10, v3

    move-object v13, v4

    move-object/from16 v12, v17

    invoke-direct/range {v9 .. v15}, Li21/j;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;Li21/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v0, v1, v9}, [Li21/j;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lt71/a;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(JLk2/i;Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lt71/a;->f(JLk2/i;Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/List;Lf2/d;)Lf2/g;
    .locals 0

    invoke-static {p0, p1}, Lt71/a;->g(Ljava/util/List;Lf2/d;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Li2/k0;Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lt71/a;->h(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lt71/j;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lt71/a;->i(Landroidx/compose/ui/Modifier;Lt71/j;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lt71/j;Landroidx/compose/runtime/Composer;II)V
    .locals 36

    move-object/from16 v2, p1

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v0, 0x69c3c259

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v3, p3, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    move v4, v1

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_4
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v5, v6, :cond_5

    move v5, v15

    goto :goto_3

    :cond_5
    move v5, v14

    :goto_3
    and-int/2addr v4, v15

    invoke-virtual {v11, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_19

    sget-object v4, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_6

    move-object v0, v4

    goto :goto_4

    :cond_6
    move-object v0, v3

    :goto_4
    new-instance v16, Lk2/i;

    new-array v3, v1, [F

    fill-array-data v3, :array_0

    new-instance v5, Li2/k;

    new-instance v6, Landroid/graphics/DashPathEffect;

    const/4 v7, 0x0

    invoke-direct {v6, v3, v7}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v5, v6}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/16 v22, 0xe

    const/high16 v17, 0x40000000    # 2.0f

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v21, v5

    invoke-direct/range {v16 .. v22}, Lk2/i;-><init>(FFIILi2/t0;I)V

    move-object/from16 v3, v16

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v5, v11, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->X0()J

    move-result-wide v7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v9, v10, :cond_7

    sget-object v9, Lt71/a$a;->w:Lt71/a$a;

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v9}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v9

    invoke-interface {v9, v11, v14}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v1

    new-instance v9, Li2/x;

    invoke-direct {v9, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_8

    sget-object v1, Lt71/a$b;->w:Lt71/a$b;

    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    invoke-interface {v1, v11, v14}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v1

    new-instance v12, Li2/x;

    invoke-direct {v12, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v9, v12}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v11, v7, v8}, Lp1/q;->f(J)Z

    move-result v2

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v2, v9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v2, :cond_9

    if-ne v9, v10, :cond_a

    :cond_9
    new-instance v9, Lg1/d4;

    const/4 v2, 0x3

    invoke-direct {v9, v7, v8, v3, v2}, Lg1/d4;-><init>(JLjava/lang/Object;I)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v4, v9}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5, v11, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->a1()J

    move-result-wide v7

    int-to-float v3, v15

    const/16 v9, 0x8

    int-to-float v9, v9

    invoke-static {v2, v3, v9, v7, v8}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_b

    if-ne v7, v10, :cond_c

    :cond_b
    new-instance v7, Lej1/s;

    const/4 v3, 0x5

    invoke-direct {v7, v1, v3}, Lej1/s;-><init>(Ljava/util/List;I)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v7}, Landroidx/compose/ui/draw/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/4 v1, 0x2

    int-to-float v1, v1

    mul-float v17, v1, v9

    const/16 v20, 0x0

    const/16 v21, 0x8

    move/from16 v18, v17

    move/from16 v19, v17

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/a1;->x:Ll0/a1;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_d

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_d
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_5
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v11, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v11, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-nez v12, :cond_e

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v12, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_f

    :cond_e
    invoke-static {v7, v11, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v11, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v7, v11, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v13, v11, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v11, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_10

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_10
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v11, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v3, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-nez v2, :cond_11

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v2, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    :cond_11
    invoke-static {v7, v11, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v11, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, Lb2/e;->L:Lb2/l;

    sget-object v12, Ll0/m;->g:Ll0/h;

    const/16 v13, 0x36

    invoke-static {v12, v7, v11, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v11, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_13

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_13
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v11, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-nez v3, :cond_14

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    :cond_14
    invoke-static {v12, v11, v12, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v11, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lt71/j;->h()Lt71/b;

    move-result-object v2

    invoke-virtual {v2}, Lt71/b;->b()I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Lt71/j;->h()Lt71/b;

    move-result-object v2

    invoke-virtual {v2}, Lt71/b;->c()Ly81/e;

    move-result-object v2

    const/4 v13, 0x0

    invoke-interface {v2, v11, v13}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    invoke-virtual/range {p1 .. p1}, Lt71/j;->h()Lt71/b;

    move-result-object v2

    invoke-virtual {v2}, Lt71/b;->a()Ly81/e;

    move-result-object v2

    invoke-interface {v2, v11, v13}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    invoke-virtual/range {p1 .. p1}, Lt71/j;->h()Lt71/b;

    move-result-object v2

    invoke-virtual {v2}, Lt71/b;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lt71/j;->h()Lt71/b;

    move-result-object v8

    invoke-virtual {v8}, Lt71/b;->e()Ly81/e;

    move-result-object v8

    invoke-interface {v8, v11, v13}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v18

    const/4 v12, 0x0

    move-object v14, v4

    const/4 v15, 0x6

    move-wide/from16 v34, v6

    move-object v6, v2

    move-object v2, v5

    move-wide/from16 v4, v34

    move-wide/from16 v7, v18

    invoke-static/range {v3 .. v12}, Lt71/m;->o(IJLcom/whoop/design/util/TextResource;JJLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v2, v11, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v5

    invoke-virtual/range {p1 .. p1}, Lt71/j;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v11, v13}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v11, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->s()Lb91/a;

    move-result-object v23

    const/16 v27, 0x0

    const v28, 0x2fffa

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v25, v11

    const/4 v11, 0x0

    move v2, v13

    const-wide/16 v12, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v18, v15

    const/4 v15, 0x0

    move/from16 v19, v17

    const/16 v20, 0x1

    const-wide/16 v16, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v22, v19

    const/16 v19, 0x0

    move/from16 v24, v20

    const/16 v20, 0x0

    move-object/from16 v26, v21

    const/16 v21, 0x0

    move/from16 v29, v22

    const/16 v22, 0x0

    move/from16 v30, v24

    const/16 v24, 0x0

    move-object/from16 v31, v26

    const/16 v26, 0x0

    move/from16 v32, v29

    move-object/from16 v33, v31

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v25

    invoke-virtual/range {p1 .. p1}, Lt71/j;->j()Lt71/b;

    move-result-object v3

    invoke-virtual {v3}, Lt71/b;->b()I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Lt71/j;->j()Lt71/b;

    move-result-object v4

    invoke-virtual {v4}, Lt71/b;->c()Ly81/e;

    move-result-object v4

    invoke-interface {v4, v11, v2}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    invoke-virtual/range {p1 .. p1}, Lt71/j;->j()Lt71/b;

    move-result-object v6

    invoke-virtual {v6}, Lt71/b;->a()Ly81/e;

    move-result-object v6

    invoke-interface {v6, v11, v2}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    invoke-virtual/range {p1 .. p1}, Lt71/j;->j()Lt71/b;

    move-result-object v6

    invoke-virtual {v6}, Lt71/b;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lt71/j;->j()Lt71/b;

    move-result-object v7

    invoke-virtual {v7}, Lt71/b;->e()Ly81/e;

    move-result-object v7

    invoke-interface {v7, v11, v2}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    const/4 v12, 0x0

    invoke-static/range {v3 .. v12}, Lt71/m;->q(IJLcom/whoop/design/util/TextResource;JJLandroidx/compose/runtime/Composer;I)V

    const/4 v9, 0x1

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v1, v3

    move-object/from16 v14, v33

    invoke-static {v1, v14}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v11, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v1, 0x4d522843    # 2.2036587E8f

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lt71/j;->g()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v10, v2

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_18

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v12, v10, 0x1

    if-ltz v10, :cond_17

    move-object v4, v3

    check-cast v4, Li21/j;

    const/4 v7, 0x0

    const/4 v8, 0x5

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v6, v11

    invoke-static/range {v3 .. v8}, Li21/i;->i(Landroidx/compose/ui/Modifier;Li21/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p1 .. p1}, Lt71/j;->g()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-le v3, v9, :cond_16

    invoke-virtual/range {p1 .. p1}, Lt71/j;->g()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v3

    if-eq v3, v10, :cond_16

    const v3, 0x52bdf5ec

    move/from16 v4, v32

    invoke-static {v11, v3, v14, v4, v11}, Lr80/c;->C(Lp1/q;ILb2/t;FLp1/q;)V

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_16
    move/from16 v4, v32

    const v3, 0x52bf3501

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    :goto_9
    move/from16 v32, v4

    move v10, v12

    goto :goto_8

    :cond_17
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_18
    invoke-static {v11, v2, v9, v9}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object v1, v0

    goto :goto_a

    :cond_19
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v1, v3

    :goto_a
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1a

    new-instance v0, Lqk2/i;

    const/16 v5, 0x1d

    move-object/from16 v2, p1

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lqk2/i;-><init>(Landroidx/compose/ui/Modifier;Lm91/u;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void

    nop

    :array_0
    .array-data 4
        0x41200000    # 10.0f
        0x41200000    # 10.0f
    .end array-data
.end method

.method private static final f(JLk2/i;Lk2/e;)Ll83/a0;
    .locals 12

    const-string v1, "$this$drawBehind"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-interface {p3, v1}, Ly3/c;->q0(F)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v4, v1

    const/16 v1, 0x20

    shl-long v1, v2, v1

    const-wide v6, 0xffffffffL

    and-long v3, v4, v6

    or-long v7, v1, v3

    const/4 v10, 0x0

    const/16 v11, 0xe6

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    move-wide v1, p0

    move-object v9, p2

    move-object v0, p3

    invoke-static/range {v0 .. v11}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Ljava/util/List;Lf2/d;)Lf2/g;
    .locals 5

    const-string v0, "$this$drawWithCache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    iget-object v1, p1, Lf2/d;->w:Lf2/b;

    invoke-interface {v1}, Lf2/b;->d()J

    move-result-wide v1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const/4 v2, 0x2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    const/4 v2, 0x3

    int-to-float v2, v2

    div-float/2addr v1, v2

    const/4 v2, 0x0

    const/16 v3, 0xc

    invoke-static {v0, p0, v1, v2, v3}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    new-instance v0, Lnq2/c;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Lnq2/c;-><init>(Li2/k0;I)V

    invoke-virtual {p1, v0}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Li2/t;Lk2/c;)Ll83/a0;
    .locals 14

    const-string v1, "$this$onDrawWithContent"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, La3/p0;

    invoke-virtual {v1}, La3/p0;->a()V

    iget-object v2, v1, La3/p0;->w:Lk2/b;

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v3

    const/16 v5, 0x20

    shr-long/2addr v3, v5

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    const v4, 0x3a83126f    # 0.001f

    mul-float/2addr v3, v4

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v6

    const-wide v8, 0xffffffffL

    and-long/2addr v6, v8

    long-to-int v4, v6

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    const/4 v6, 0x2

    int-to-float v6, v6

    mul-float/2addr v4, v6

    const/4 v6, 0x3

    int-to-float v6, v6

    div-float/2addr v4, v6

    const v7, 0x3f7fbe77    # 0.999f

    mul-float/2addr v4, v7

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v10, v3

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    shl-long/2addr v10, v5

    and-long/2addr v3, v8

    or-long/2addr v3, v10

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v10

    shr-long/2addr v10, v5

    long-to-int v7, v10

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    const v10, 0x3f7d70a4    # 0.99f

    mul-float/2addr v7, v10

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v10

    and-long/2addr v10, v8

    long-to-int v2, v10

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    div-float/2addr v2, v6

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v6, v6

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v10, v2

    shl-long/2addr v6, v5

    and-long/2addr v10, v8

    or-long/2addr v6, v10

    const/4 v2, 0x1

    int-to-float v2, v2

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v2, v10

    invoke-virtual {v1, v2}, La3/p0;->q0(F)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v10, v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    shl-long/2addr v10, v5

    and-long/2addr v1, v8

    or-long/2addr v1, v10

    const/4 v9, 0x0

    const/16 v10, 0xf0

    const/4 v8, 0x0

    move-wide v12, v6

    move-wide v6, v1

    move-wide v2, v3

    move-wide v4, v12

    move-object v1, p0

    move-object v0, p1

    invoke-static/range {v0 .. v10}, Lk2/e;->J0(Lk2/e;Li2/t;JJJFLk2/f;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lt71/j;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lt71/a;->e(Landroidx/compose/ui/Modifier;Lt71/j;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Li21/j;",
            ">;"
        }
    .end annotation

    sget-object v0, Lt71/a;->a:Ljava/util/List;

    return-object v0
.end method
