.class public abstract Lzi0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzi0/c$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a+\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\u0007\"\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000b\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lti0/g;",
        "viewState",
        "Lkotlin/Function1;",
        "Lri0/b;",
        "Ll83/a0;",
        "onEvent",
        "e",
        "(Lti0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "g",
        "Ly3/f;",
        "a",
        "F",
        "STATUS_ICON_SIZE",
        "b",
        "STATUS_ICON_GAP",
        "Lcom/whoop/navigation/models/ApiRequest;",
        "c",
        "Lcom/whoop/navigation/models/ApiRequest;",
        "previewRequest",
        "arch-v2_release"
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

.field private static final c:Lcom/whoop/navigation/models/ApiRequest;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x6

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lzi0/c;->a:F

    const/4 v0, 0x3

    int-to-float v0, v0

    mul-float/2addr v0, v1

    sput v0, Lzi0/c;->b:F

    new-instance v1, Lcom/whoop/navigation/models/ApiRequest;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v2, "/v1/items?page=2"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/navigation/models/ApiRequest;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Lkotlinx/serialization/json/JsonElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lzi0/c;->c:Lcom/whoop/navigation/models/ApiRequest;

    return-void
.end method

.method public static synthetic a(Lti0/g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzi0/c;->j(Lti0/g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lti0/g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzi0/c;->f(Lti0/g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lti0/g;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzi0/c;->i(Lkotlin/jvm/functions/Function1;Lti0/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lti0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzi0/c;->h(Lti0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lti0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lti0/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v3, -0x69893895

    invoke-virtual {v12, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v3, :cond_2

    and-int/lit8 v3, v2, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    move v3, v5

    :goto_1
    or-int/2addr v3, v2

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    and-int/lit8 v6, v2, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_4

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    move v6, v7

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v3, v6

    :cond_4
    and-int/lit8 v6, v3, 0x13

    const/16 v8, 0x12

    const/4 v15, 0x0

    const/4 v9, 0x1

    if-eq v6, v8, :cond_5

    move v6, v9

    goto :goto_4

    :cond_5
    move v6, v15

    :goto_4
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v12, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-virtual {v0}, Lti0/g;->b()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v6

    and-int/lit8 v8, v3, 0xe

    if-eq v8, v4, :cond_7

    and-int/lit8 v4, v3, 0x8

    if-eqz v4, :cond_6

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_5

    :cond_6
    move v4, v15

    goto :goto_6

    :cond_7
    :goto_5
    move v4, v9

    :goto_6
    and-int/lit8 v3, v3, 0x70

    if-ne v3, v7, :cond_8

    move v7, v9

    goto :goto_7

    :cond_8
    move v7, v15

    :goto_7
    or-int/2addr v4, v7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_9

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v7, v4, :cond_a

    :cond_9
    new-instance v7, Lzi0/c$a;

    const/4 v4, 0x0

    invoke-direct {v7, v0, v1, v4}, Lzi0/c$a;-><init>(Lti0/g;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lc93/m;

    sget v4, Lcom/whoop/navigation/models/ApiRequest;->$stable:I

    invoke-static {v12, v7, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v10, Lb2/e;->E:Lb2/m;

    invoke-static {v10, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_b

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_8
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v12, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v12, v10, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-nez v13, :cond_c

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_d

    :cond_c
    invoke-static {v11, v12, v11, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v12, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lti0/g;->d()Lcom/whoop/archv2/feature/domain/o;

    move-result-object v6

    sget-object v10, Lzi0/c$b;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v10, v6

    if-eq v6, v9, :cond_f

    if-eq v6, v5, :cond_f

    const/4 v5, 0x3

    if-ne v6, v5, :cond_e

    const v5, 0x41bc6034

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    or-int/2addr v4, v8

    or-int/2addr v3, v4

    invoke-static {v0, v1, v12, v3}, Lzi0/c;->g(Lti0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v3, 0x0

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    move v3, v9

    goto :goto_9

    :cond_e
    const/4 v3, 0x0

    const v0, 0x7dfda546

    invoke-static {v0, v12, v3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_f
    const v3, 0x41b86d6f

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    const/16 v3, 0x18

    int-to-float v3, v3

    invoke-static {v3, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v3, v12, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v6

    int-to-float v3, v5

    const/16 v13, 0x186

    const/16 v14, 0x38

    move v5, v9

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-wide/from16 v16, v6

    move v7, v3

    move v3, v5

    move-wide/from16 v5, v16

    invoke-static/range {v4 .. v14}, Ll1/i3;->a(Landroidx/compose/ui/Modifier;JFJIFLandroidx/compose/runtime/Composer;II)V

    const/4 v4, 0x0

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_10
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_11

    new-instance v4, Lzi0/b;

    const/4 v5, 0x1

    invoke-direct {v4, v0, v1, v2, v5}, Lzi0/b;-><init>(Lti0/g;Lkotlin/jvm/functions/Function1;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final f(Lti0/g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lzi0/c;->e(Lti0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lti0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lti0/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object v9, p2

    check-cast v9, Lp1/q;

    const p2, -0x5fbc86a

    invoke-virtual {v9, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_2

    and-int/lit8 p2, p3, 0x8

    if-nez p2, :cond_0

    invoke-virtual {v9, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {v9, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    :goto_0
    if-eqz p2, :cond_1

    const/4 p2, 0x4

    goto :goto_1

    :cond_1
    const/4 p2, 0x2

    :goto_1
    or-int/2addr p2, p3

    goto :goto_2

    :cond_2
    move p2, p3

    :goto_2
    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_4

    invoke-virtual {v9, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x20

    goto :goto_3

    :cond_3
    const/16 v0, 0x10

    :goto_3
    or-int/2addr p2, v0

    :cond_4
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    const/4 v2, 0x1

    if-eq v0, v1, :cond_5

    move v0, v2

    goto :goto_4

    :cond_5
    const/4 v0, 0x0

    :goto_4
    and-int/2addr p2, v2

    invoke-virtual {v9, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_6

    sget-object p2, Lb2/t;->w:Lb2/t;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object p2, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {p2, v9, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p2

    invoke-virtual {p2}, Ly81/i;->g()J

    move-result-wide v2

    new-instance p2, Lx30/f1;

    const/16 v1, 0xe

    invoke-direct {p2, v1, p0, p1}, Lx30/f1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v1, -0x49c758da

    invoke-static {v1, v9, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const v10, 0xc00006

    const/16 v11, 0x7a

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v11}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_6
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v0, Lzi0/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Lzi0/b;-><init>(Lti0/g;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final h(Lti0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 44

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    and-int/lit8 v2, p3, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-eq v2, v5, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v6, p3, 0x1

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v6, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_e

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v5, v5

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v9, v5, v8

    const-wide/high16 v10, 0x3ff8000000000000L    # 1.5

    double-to-float v10, v10

    mul-float/2addr v10, v8

    invoke-static {v7, v9, v10}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v10}, Ll0/m;->i(F)Ll0/k;

    move-result-object v9

    sget-object v10, Lb2/e;->M:Lb2/k;

    const/4 v15, 0x6

    invoke-static {v9, v10, v12, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_1

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_1
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v12, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v12, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v3, v12, Lp1/q;->S:Z

    if-nez v3, :cond_2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    invoke-static {v10, v12, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v12, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lb2/e;->K:Lb2/l;

    sget-object v7, Ll0/m;->a:Ll0/e;

    const/16 v10, 0x30

    invoke-static {v7, v3, v12, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    move-object/from16 p3, v11

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v12}, Lp1/q;->i0()V

    move/from16 v33, v5

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-eqz v5, :cond_4

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v12, v14, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v12, Lp1/q;->S:Z

    if-nez v4, :cond_5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    move-object/from16 v4, p3

    goto :goto_3

    :cond_6
    move-object/from16 v4, p3

    goto :goto_4

    :goto_3
    invoke-static {v10, v12, v10, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_4
    invoke-static {v12, v2, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v5, Lgy0/a;->I4:I

    const/4 v15, 0x6

    invoke-static {v5, v12, v15}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    const/4 v10, 0x1

    int-to-float v11, v10

    mul-float/2addr v8, v11

    const/4 v10, 0x0

    const/16 v11, 0xd

    move-object/from16 v17, v7

    const/4 v7, 0x0

    move-object/from16 v18, v9

    const/4 v9, 0x0

    move-object/from16 v34, v4

    move-object/from16 v35, v17

    move-object/from16 v4, v18

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget v8, Lzi0/c;->a:F

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v7, v12, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->f()J

    move-result-wide v16

    move-object v11, v13

    const/16 v13, 0x1b0

    move-object/from16 v18, v14

    const/4 v14, 0x0

    move/from16 v19, v8

    const/4 v8, 0x0

    move-object/from16 p3, v2

    move-object v15, v7

    move v2, v10

    move-object/from16 v36, v18

    move/from16 v37, v19

    move-object v7, v5

    move-object v5, v11

    move-wide/from16 v10, v16

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    sget v7, Lzi0/c;->b:F

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v12, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move v8, v7

    invoke-virtual {v0}, Lti0/g;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v15, v12, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->b()Lb91/a;

    move-result-object v27

    invoke-virtual {v15, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->f()J

    move-result-wide v9

    const/high16 v11, 0x3f800000    # 1.0f

    float-to-double v13, v11

    const-wide/16 v18, 0x0

    cmpl-double v13, v13, v18

    if-lez v13, :cond_7

    :goto_5
    move v13, v8

    goto :goto_6

    :cond_7
    const-string v13, "invalid weight; must be greater than zero"

    invoke-static {v13}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_5

    :goto_6
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v14, 0x1

    invoke-direct {v8, v11, v14}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v31, v11, 0x12

    const v32, 0x2fff8

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    move v14, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v18, v15

    const/4 v15, 0x0

    move/from16 v19, v16

    const/16 v20, 0x6

    const-wide/16 v16, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v22, v19

    const/16 v19, 0x0

    move/from16 v24, v20

    move-object/from16 v23, v21

    const-wide/16 v20, 0x0

    move/from16 v25, v22

    const/16 v22, 0x0

    move-object/from16 v26, v23

    const/16 v23, 0x0

    move/from16 v28, v24

    const/16 v24, 0x0

    move/from16 v30, v25

    const/16 v25, 0x0

    move-object/from16 v38, v26

    const/16 v26, 0x0

    move/from16 v39, v28

    const/16 v28, 0x0

    move/from16 v40, v30

    const/16 v30, 0x0

    move-object/from16 v41, v38

    move/from16 v38, v2

    move/from16 v2, v39

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    const/4 v14, 0x1

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v0}, Lti0/g;->c()Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_8

    const v0, 0x7bd9fd8e

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    const/4 v14, 0x1

    goto/16 :goto_c

    :cond_8
    const v7, 0x7bd9fd8f

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    add-float v7, v37, v40

    const/4 v10, 0x0

    const/16 v11, 0xe

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v8, v2

    const/4 v9, 0x4

    int-to-float v9, v9

    mul-float/2addr v8, v9

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    new-instance v7, Li3/i;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Li3/i;-><init>(I)V

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v8, v10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_9

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v10, v8, :cond_a

    :cond_9
    new-instance v10, Lyo1/b;

    const/16 v8, 0x10

    invoke-direct {v10, v8, v1, v0}, Lyo1/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v18, v10

    check-cast v18, Lc93/a;

    const/16 v19, 0xb

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v7

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v1, v35

    const/16 v7, 0x30

    invoke-static {v1, v3, v12, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v7, v12, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_b

    invoke-virtual {v12, v5}, Lp1/q;->l(Lc93/a;)V

    :goto_7
    move-object/from16 v5, v36

    goto :goto_8

    :cond_b
    invoke-virtual {v12}, Lp1/q;->s0()V

    goto :goto_7

    :goto_8
    invoke-static {v12, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-nez v1, :cond_c

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    :cond_c
    move-object/from16 v4, v34

    goto :goto_a

    :cond_d
    :goto_9
    move-object/from16 v1, p3

    goto :goto_b

    :goto_a
    invoke-static {v3, v12, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_9

    :goto_b
    invoke-static {v12, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move/from16 v1, v38

    move-object/from16 v0, v41

    invoke-virtual {v0, v12, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->k()Lb91/a;

    move-result-object v27

    invoke-virtual {v0, v12, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v3

    const/16 v30, 0x0

    const v32, 0x2fffa

    const/4 v8, 0x0

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    move-object v7, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-wide/from16 v42, v3

    move v3, v9

    move-wide/from16 v9, v42

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    mul-float v5, v33, v3

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v12, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/w;->b()I

    move-result v4

    invoke-static {v4, v12, v2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v7

    mul-float v9, v3, v3

    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v0, v12, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v10

    const/16 v13, 0x1b0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v14, 0x1

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_e
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_d
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Lti0/g;)Ll83/a0;
    .locals 1

    new-instance v0, Lri0/b$k;

    invoke-virtual {p1}, Lti0/g;->b()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object p1

    invoke-direct {v0, p1}, Lri0/b$k;-><init>(Lcom/whoop/navigation/models/ApiRequest;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lti0/g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lzi0/c;->g(Lti0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
