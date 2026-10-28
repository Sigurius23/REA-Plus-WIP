.class public abstract Lj50/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u001a5\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\'\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\"\u0017\u0010\u001a\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\"\u0017\u0010\u001d\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0017\u001a\u0004\u0008\u001c\u0010\u0019\u00a8\u0006\u001e"
    }
    d2 = {
        "Lj50/d;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "g",
        "(Lj50/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "k",
        "(Lj50/d;Landroidx/compose/runtime/Composer;I)V",
        "Lgz0/m0;",
        "icon",
        "m",
        "(Lgz0/m0;Landroidx/compose/runtime/Composer;I)V",
        "Ly3/f;",
        "size",
        "Li2/x;",
        "tint",
        "o",
        "(Lgz0/m0;FJLandroidx/compose/runtime/Composer;I)V",
        "a",
        "Lj50/d;",
        "getSampleCareUpdateEntrypointTileViewState",
        "()Lj50/d;",
        "sampleCareUpdateEntrypointTileViewState",
        "b",
        "getSampleCareUpdateEntrypointTileNoPreviewViewState",
        "sampleCareUpdateEntrypointTileNoPreviewViewState",
        "access_release"
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
.field private static final a:Lj50/d;

.field private static final b:Lj50/d;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lj50/d;

    sget-object v4, Lgz0/m0;->NOTES_EDIT:Lgz0/m0;

    sget-object v5, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    const/4 v6, 0x0

    const-string v1, "Care Initiation Summary"

    const-string v2, "April 4, 2026"

    const-string v3, "The patient has agreed to **regular walking** to lower their blood pressure by 5\u20138 points \u2014 nearly half the gap to their goal."

    invoke-direct/range {v0 .. v6}, Lj50/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Lcom/whoop/navigation/e;)V

    sput-object v0, Lj50/c;->a:Lj50/d;

    new-instance v1, Lj50/d;

    move-object v6, v5

    move-object v5, v4

    const/4 v4, 0x0

    const/4 v7, 0x0

    const-string v2, "Care Initiation Summary"

    const-string v3, "April 4, 2026"

    invoke-direct/range {v1 .. v7}, Lj50/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Lcom/whoop/navigation/e;)V

    sput-object v1, Lj50/c;->b:Lj50/d;

    return-void
.end method

.method public static synthetic a(Lj50/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lj50/c;->h(Lj50/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lj50/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lj50/c;->i(Lj50/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lj50/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lj50/c;->j(Lj50/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lgz0/m0;FJILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lj50/c;->p(Lgz0/m0;FJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lgz0/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lj50/c;->n(Lgz0/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lj50/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lj50/c;->l(Lj50/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lj50/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj50/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move-object/from16 v6, p1

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, -0x1e379cca

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x4

    if-nez v2, :cond_2

    and-int/lit8 v2, v1, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    const/4 v2, 0x2

    :goto_1
    or-int/2addr v2, v1

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    and-int/lit8 v5, v1, 0x30

    const/16 v7, 0x20

    if-nez v5, :cond_4

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v7

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v2, v5

    :cond_4
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v2, v9

    :goto_5
    and-int/lit16 v9, v2, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v9, v10, :cond_8

    move v9, v12

    goto :goto_6

    :cond_8
    move v9, v11

    :goto_6
    and-int/lit8 v10, v2, 0x1

    invoke-virtual {v0, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_f

    if-eqz v5, :cond_9

    sget-object v5, Lb2/t;->w:Lb2/t;

    goto :goto_7

    :cond_9
    move-object v5, v8

    :goto_7
    const-string v8, "CareUpdateEntrypointTile"

    invoke-static {v5, v8}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    and-int/lit8 v8, v2, 0xe

    if-eq v8, v3, :cond_b

    and-int/lit8 v8, v2, 0x8

    if-eqz v8, :cond_a

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    goto :goto_8

    :cond_a
    move v8, v11

    goto :goto_9

    :cond_b
    :goto_8
    move v8, v12

    :goto_9
    and-int/lit8 v2, v2, 0x70

    if-ne v2, v7, :cond_c

    move v11, v12

    :cond_c
    or-int v2, v8, v11

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_d

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v7, v2, :cond_e

    :cond_d
    new-instance v7, Lj11/q;

    const/4 v2, 0x2

    invoke-direct {v7, v4, v6, v2}, Lj11/q;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v17, v7

    check-cast v17, Lc93/a;

    const/16 v18, 0xf

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v2, 0x3

    int-to-float v2, v2

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2}, Lt0/j;->e(F)Lt0/i;

    move-result-object v11

    new-instance v2, Lhb2/f;

    const/16 v3, 0x12

    invoke-direct {v2, v4, v3}, Lhb2/f;-><init>(Ljava/lang/Object;I)V

    const v3, 0x25ea01a6

    invoke-static {v3, v0, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    const/high16 v17, 0xc00000

    const/16 v18, 0x76

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v0

    invoke-static/range {v7 .. v18}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_a

    :cond_f
    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    move-object v5, v8

    :goto_a
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_10

    new-instance v0, Lhy0/v;

    const/16 v3, 0x1b

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lhy0/v;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final h(Lj50/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lj50/d;->a()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lj50/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 31

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v4, p2, 0x1

    move-object/from16 v14, p1

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v6, 0x8

    int-to-float v6, v6

    const/high16 v7, 0x40200000    # 2.5f

    mul-float/2addr v7, v6

    int-to-float v3, v3

    mul-float/2addr v3, v6

    invoke-static {v5, v3, v7}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v5, 0x3fc00000    # 1.5f

    mul-float/2addr v6, v5

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v6, Lb2/e;->M:Lb2/k;

    const/4 v7, 0x6

    invoke-static {v5, v6, v14, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v14, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v14, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v9, v14, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v14, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v14, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v14, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v14, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v6, v14, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v14, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v3, Lcom/whoop/navigation/e;->d:I

    move-object/from16 v5, p0

    invoke-static {v5, v14, v3}, Lj50/c;->k(Lj50/d;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5}, Lj50/d;->c()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_4

    const v0, -0x58b69440

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    const v5, -0x58b6943f

    invoke-virtual {v14, v5}, Lp1/q;->e0(I)V

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Liz0/l;->a:Liz0/l;

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-static {v4, v14, v6}, Lih0/d0;->r(Lx81/d;Lp1/q;I)Ll3/v0;

    move-result-object v7

    invoke-virtual {v4, v14, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v8

    sget v4, Liz0/l;->b:I

    shl-int/lit8 v29, v4, 0xf

    const/16 v30, 0x7ffc

    move-object v6, v7

    move-wide v7, v8

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    move-object/from16 v27, v14

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-virtual/range {v5 .. v30}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v8

    sget v4, Liz0/m;->p:I

    shl-int/lit8 v4, v4, 0x9

    or-int/lit16 v15, v4, 0x1b0

    const/16 v16, 0x1f0

    const/4 v7, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v6, v0

    move-object v5, v3

    move-object/from16 v14, v27

    invoke-static/range {v5 .. v16}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    :goto_2
    invoke-virtual {v14, v2}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_5
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(Lj50/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lj50/c;->g(Lj50/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lj50/d;Landroidx/compose/runtime/Composer;I)V
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    check-cast v6, Lp1/q;

    const v2, -0x714f95c3

    invoke-virtual {v6, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-nez v2, :cond_2

    and-int/lit8 v2, p2, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    or-int v2, p2, v2

    goto :goto_2

    :cond_2
    move/from16 v2, p2

    :goto_2
    and-int/lit8 v5, v2, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v5, v4, :cond_3

    move v4, v7

    goto :goto_3

    :cond_3
    move v4, v8

    :goto_3
    and-int/2addr v2, v7

    invoke-virtual {v6, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_e

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Lb2/e;->K:Lb2/l;

    const/16 v9, 0x8

    int-to-float v9, v9

    const/16 v10, 0x36

    const/high16 v11, 0x3fc00000    # 1.5f

    invoke-static {v9, v11, v5, v6, v10}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v5

    iget-wide v10, v6, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v13, v6, Lp1/q;->S:Z

    if-eqz v13, :cond_4

    invoke-virtual {v6, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_4
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v6, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v6, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v14, v6, Lp1/q;->S:Z

    if-nez v14, :cond_5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_6

    :cond_5
    invoke-static {v10, v6, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v6, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lj50/d;->b()Lgz0/m0;

    move-result-object v2

    invoke-static {v2, v6, v8}, Lj50/c;->m(Lgz0/m0;Landroidx/compose/runtime/Composer;I)V

    float-to-double v14, v4

    const-wide/16 v16, 0x0

    cmpl-double v2, v14, v16

    if-lez v2, :cond_7

    move v2, v7

    goto :goto_5

    :cond_7
    move v2, v8

    :goto_5
    if-nez v2, :cond_8

    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_8
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v2, v4, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float/2addr v9, v4

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v14, 0x6

    invoke-static {v4, v9, v6, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v14, v6, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v15, v6, Lp1/q;->S:Z

    if-eqz v15, :cond_9

    invoke-virtual {v6, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v6, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v5, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v6, Lp1/q;->S:Z

    if-nez v4, :cond_a

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    invoke-static {v9, v6, v9, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v6, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lj50/d;->g()Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v6, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v4, v6, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v26, v11, 0x12

    const v27, 0x2fffa

    move v11, v3

    const/4 v3, 0x0

    move-object/from16 v24, v6

    move v12, v7

    const-wide/16 v6, 0x0

    move v13, v8

    const/4 v8, 0x0

    move v14, v5

    move-wide/from16 v34, v9

    move-object v10, v4

    move-wide/from16 v4, v34

    const/4 v9, 0x0

    move-object v15, v10

    const/4 v10, 0x0

    move/from16 v16, v11

    move/from16 v17, v12

    const-wide/16 v11, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    const/4 v14, 0x0

    move-object/from16 v20, v15

    move/from16 v21, v16

    const-wide/16 v15, 0x0

    move/from16 v23, v17

    const/16 v17, 0x0

    move/from16 v25, v18

    const/16 v18, 0x0

    move/from16 v28, v19

    const/16 v19, 0x0

    move-object/from16 v29, v20

    const/16 v20, 0x0

    move/from16 v30, v21

    const/16 v21, 0x0

    move/from16 v31, v23

    const/16 v23, 0x0

    move/from16 v32, v25

    const/16 v25, 0x0

    move/from16 v1, v28

    move/from16 v0, v32

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v24

    invoke-virtual/range {p0 .. p0}, Lj50/d;->f()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_c

    const v2, 0x261d9481

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    move-object/from16 v33, v29

    :goto_7
    const/4 v12, 0x1

    goto :goto_8

    :cond_c
    const v3, 0x261d9482

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    move-object/from16 v3, v29

    invoke-virtual {v3, v6, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->c()Lb91/a;

    move-result-object v22

    invoke-virtual {v3, v6, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b1()J

    move-result-wide v4

    const/16 v25, 0x0

    const v27, 0x2fffa

    const/4 v3, 0x0

    move-object/from16 v24, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v33, v29

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v24

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :goto_8
    invoke-virtual {v6, v12}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lj50/d;->e()Lgz0/m0;

    move-result-object v2

    if-nez v2, :cond_d

    const v1, -0x1ce57fe4

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_d
    const v3, -0x1ce57fe3

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    const/4 v11, 0x4

    int-to-float v3, v11

    mul-float/2addr v3, v3

    move-object/from16 v15, v33

    invoke-virtual {v15, v6, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->b1()J

    move-result-wide v4

    const/16 v7, 0x30

    invoke-static/range {v2 .. v7}, Lj50/c;->o(Lgz0/m0;FJLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v6, v12}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_e
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_f

    new-instance v1, Ld71/c;

    const/16 v2, 0x1b

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Ld71/c;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final l(Lj50/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lj50/c;->k(Lj50/d;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lgz0/m0;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v4, p1

    check-cast v4, Lp1/q;

    const p1, 0x6b26bc96

    invoke-virtual {v4, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x4

    const/4 v1, 0x2

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-virtual {v4, p1}, Lp1/q;->e(I)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 v2, p1, 0x3

    const/4 v3, 0x0

    const/4 v6, 0x1

    if-eq v2, v1, :cond_2

    move v2, v6

    goto :goto_2

    :cond_2
    move v2, v3

    :goto_2
    and-int/lit8 v5, p1, 0x1

    invoke-virtual {v4, v5, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x8

    int-to-float v2, v2

    int-to-float v0, v0

    mul-float/2addr v2, v0

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v1, v1

    invoke-static {v2, v1, v0}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v2, v4, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->W0()J

    move-result-wide v7

    sget-object v9, Li2/w0;->a:Li2/v0;

    invoke-static {v1, v7, v8, v9}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, Lb2/e;->E:Lb2/m;

    invoke-static {v7, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v7, v4, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-eqz v10, :cond_3

    invoke-virtual {v4, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_3
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v4, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v4, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-nez v8, :cond_4

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    :cond_4
    invoke-static {v7, v4, v7, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v4, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x5

    int-to-float v1, v1

    mul-float/2addr v1, v0

    invoke-virtual {v2, v4, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v2

    and-int/lit8 p1, p1, 0xe

    or-int/lit8 v5, p1, 0x30

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lj50/c;->o(Lgz0/m0;FJLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    move-object v0, p0

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_7

    new-instance p1, Lj50/b;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lj50/b;-><init>(Lgz0/m0;II)V

    iput-object p1, p0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final n(Lgz0/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lj50/c;->m(Lgz0/m0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lgz0/m0;FJLandroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v5, p4

    check-cast v5, Lp1/q;

    const p4, -0x2009c68f

    invoke-virtual {v5, p4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p4, p5, 0x6

    if-nez p4, :cond_1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    invoke-virtual {v5, p4}, Lp1/q;->e(I)Z

    move-result p4

    if-eqz p4, :cond_0

    const/4 p4, 0x4

    goto :goto_0

    :cond_0
    const/4 p4, 0x2

    :goto_0
    or-int/2addr p4, p5

    goto :goto_1

    :cond_1
    move p4, p5

    :goto_1
    and-int/lit8 v0, p5, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v5, p1}, Lp1/q;->d(F)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p4, v0

    :cond_3
    and-int/lit16 v0, p5, 0x180

    if-nez v0, :cond_5

    invoke-virtual {v5, p2, p3}, Lp1/q;->f(J)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0x100

    goto :goto_3

    :cond_4
    const/16 v0, 0x80

    :goto_3
    or-int/2addr p4, v0

    :cond_5
    and-int/lit16 v0, p4, 0x93

    const/16 v1, 0x92

    if-eq v0, v1, :cond_6

    const/4 v0, 0x1

    goto :goto_4

    :cond_6
    const/4 v0, 0x0

    :goto_4
    and-int/lit8 v1, p4, 0x1

    invoke-virtual {v5, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {p0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v0, v5, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    shl-int/lit8 p4, p4, 0x3

    and-int/lit16 p4, p4, 0x1c00

    or-int/lit8 v6, p4, 0x30

    const/4 v7, 0x0

    const/4 v1, 0x0

    move-wide v3, p2

    invoke-static/range {v0 .. v7}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-wide p3, v3

    goto :goto_5

    :cond_7
    move-wide p3, p2

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_8

    move p2, p1

    move-object p1, p0

    new-instance p0, Lhy0/x;

    invoke-direct/range {p0 .. p5}, Lhy0/x;-><init>(Lgz0/m0;FJI)V

    iput-object p0, v0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final p(Lgz0/m0;FJILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move-wide v2, p2

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lj50/c;->o(Lgz0/m0;FJLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
