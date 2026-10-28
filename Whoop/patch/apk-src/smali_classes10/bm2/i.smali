.class public abstract Lbm2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbm2/i$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0004\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000fH\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0016\"\u0014\u0010\u001b\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0016\"\u0016\u0010\u001d\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0016\"\u0016\u0010\u001e\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0016\"\u0017\u0010#\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lbm2/h0;",
        "viewState",
        "Ll83/a0;",
        "e",
        "(Lbm2/h0;Landroidx/compose/runtime/Composer;I)V",
        "i",
        "g",
        "",
        "score",
        "k",
        "(ILandroidx/compose/runtime/Composer;I)V",
        "m",
        "(Lbm2/h0;)V",
        "Lbm2/m1;",
        "style",
        "",
        "alpha",
        "Ly81/e;",
        "n",
        "(Lbm2/m1;F)Ly81/e;",
        "Ly3/f;",
        "a",
        "F",
        "topIndicatorIconOffsetY",
        "b",
        "topIndicatorTextOffsetY",
        "c",
        "topIndicatorIconOffsetX",
        "d",
        "topIndicatorTextOffsetX",
        "topIndicatorXPercent",
        "f",
        "Lbm2/h0;",
        "getDemoMeterViewState",
        "()Lbm2/h0;",
        "demoMeterViewState",
        "trends_release"
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

.field private static d:F

.field private static e:F

.field private static final f:Lbm2/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v0, -0xc

    int-to-float v0, v0

    sput v0, Lbm2/i;->a:F

    const/16 v0, -0x20

    int-to-float v0, v0

    sput v0, Lbm2/i;->b:F

    const/4 v0, -0x8

    int-to-float v0, v0

    sput v0, Lbm2/i;->c:F

    sput v0, Lbm2/i;->d:F

    new-instance v0, Lbm2/h0;

    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lbm2/s0;

    sget-object v3, Lbm2/m1;->VO2_MAX_1:Lbm2/m1;

    const-string v4, "15"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const v4, 0x3ec28f5c    # 0.38f

    const/16 v5, 0xf

    const/16 v6, 0x22

    invoke-direct/range {v2 .. v7}, Lbm2/s0;-><init>(Lbm2/m1;FIILcom/whoop/design/util/TextResource;)V

    new-instance v3, Lbm2/s0;

    sget-object v4, Lbm2/m1;->VO2_MAX_2:Lbm2/m1;

    const-string v5, "35"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const v5, 0x3e3851ec    # 0.18f

    const/16 v6, 0x23

    const/16 v7, 0x27

    invoke-direct/range {v3 .. v8}, Lbm2/s0;-><init>(Lbm2/m1;FIILcom/whoop/design/util/TextResource;)V

    new-instance v4, Lbm2/s0;

    sget-object v5, Lbm2/m1;->VO2_MAX_3:Lbm2/m1;

    const-string v6, "40"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const v6, 0x3e3851ec    # 0.18f

    const/16 v7, 0x28

    const/16 v8, 0x2c

    invoke-direct/range {v4 .. v9}, Lbm2/s0;-><init>(Lbm2/m1;FIILcom/whoop/design/util/TextResource;)V

    new-instance v5, Lbm2/s0;

    sget-object v6, Lbm2/m1;->VO2_MAX_4:Lbm2/m1;

    const-string v7, "45"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    const v7, 0x3e3851ec    # 0.18f

    const/16 v8, 0x2d

    const/16 v9, 0x31

    invoke-direct/range {v5 .. v10}, Lbm2/s0;-><init>(Lbm2/m1;FIILcom/whoop/design/util/TextResource;)V

    new-instance v6, Lbm2/s0;

    sget-object v7, Lbm2/m1;->VO2_MAX_5:Lbm2/m1;

    const-string v8, "50+"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const v8, 0x3da3d70a    # 0.08f

    const/16 v9, 0x32

    const/16 v10, 0x37

    invoke-direct/range {v6 .. v11}, Lbm2/s0;-><init>(Lbm2/m1;FIILcom/whoop/design/util/TextResource;)V

    filled-new-array {v2, v3, v4, v5, v6}, [Lbm2/s0;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lbm2/h0;-><init>(Ljava/lang/Integer;Ljava/util/List;)V

    sput-object v0, Lbm2/i;->f:Lbm2/h0;

    return-void
.end method

.method public static synthetic a(Lbm2/h0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbm2/i;->h(Lbm2/h0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lbm2/h0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbm2/i;->j(Lbm2/h0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lbm2/h0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbm2/i;->f(Lbm2/h0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbm2/i;->l(IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lbm2/h0;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "viewState"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, -0x463e9e9f

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v5, v3, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v5, v4, :cond_2

    move v5, v7

    goto :goto_2

    :cond_2
    move v5, v6

    :goto_2
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v2, v8, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_e

    const/4 v5, 0x3

    int-to-float v5, v5

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v5, v8

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v9}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v2, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v10, v2, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v10, v2, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v2, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v14, v2, Lp1/q;->S:Z

    if-eqz v14, :cond_3

    invoke-virtual {v2, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v2, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v2, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v15, v2, Lp1/q;->S:Z

    if-nez v15, :cond_4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v15, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    :cond_4
    invoke-static {v10, v2, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v2, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    int-to-float v12, v4

    mul-float/2addr v12, v8

    const/4 v8, 0x0

    invoke-static {v9, v12, v8, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, Lb2/e;->J:Lb2/l;

    sget-object v9, Ll0/m;->a:Ll0/e;

    const/16 v12, 0x30

    invoke-static {v9, v8, v2, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    move-object v9, v11

    iget-wide v10, v2, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v2, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v15, v2, Lp1/q;->S:Z

    if-eqz v15, :cond_6

    invoke-virtual {v2, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v2, v14, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v2, Lp1/q;->S:Z

    if-nez v8, :cond_7

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    :cond_7
    invoke-static {v10, v2, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v2, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v12, 0x3f800000    # 1.0f

    float-to-double v10, v12

    const-wide/16 v15, 0x0

    cmpl-double v4, v10, v15

    if-lez v4, :cond_9

    goto :goto_5

    :cond_9
    const-string v4, "invalid weight; must be greater than zero"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    invoke-static {v12, v12, v7}, Ly00/t7;->d(FFZ)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, Lb2/e;->w:Lb2/m;

    const/4 v10, 0x0

    invoke-static {v8, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v10, v2, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v2, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v12, v2, Lp1/q;->S:Z

    if-eqz v12, :cond_a

    invoke-virtual {v2, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v2, v14, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v2, Lp1/q;->S:Z

    if-nez v5, :cond_b

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c

    :cond_b
    invoke-static {v10, v2, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v2, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v3, v3, 0xe

    invoke-static {v0, v2, v3}, Lbm2/i;->i(Lbm2/h0;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0}, Lbm2/h0;->a()Ljava/lang/Integer;

    move-result-object v4

    if-nez v4, :cond_d

    const v4, 0x78d3067b

    invoke-virtual {v2, v4}, Lp1/q;->e0(I)V

    const/4 v10, 0x0

    invoke-virtual {v2, v10}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_d
    const/4 v10, 0x0

    const v5, 0x78d3067c

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v0}, Lbm2/i;->m(Lbm2/h0;)V

    invoke-static {v4, v2, v10}, Lbm2/i;->k(ILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v2, v10}, Lp1/q;->q(Z)V

    :goto_7
    invoke-static {v0, v2, v3}, Lbm2/i;->g(Lbm2/h0;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v2, v7}, Lp1/q;->q(Z)V

    invoke-virtual {v2, v7}, Lp1/q;->q(Z)V

    invoke-virtual {v2, v7}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_e
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_f

    new-instance v3, Lbm2/g;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v4}, Lbm2/g;-><init>(Lbm2/h0;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final f(Lbm2/h0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lbm2/i;->e(Lbm2/h0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Lbm2/h0;Landroidx/compose/runtime/Composer;I)V
    .locals 37

    move-object/from16 v0, p0

    const-string v2, "viewState"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x16153788

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p2, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int v3, p2, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v6, v3, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v6, v5, :cond_2

    move v6, v8

    goto :goto_2

    :cond_2
    move v6, v7

    :goto_2
    and-int/2addr v3, v8

    invoke-virtual {v2, v3, v6}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_e

    int-to-float v3, v4

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/4 v6, 0x0

    invoke-static {v4, v6, v3, v8}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v10, 0x3

    invoke-static {v6, v6, v3, v3, v10}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object v3

    invoke-static {v9, v3}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, Ll0/m;->a:Ll0/e;

    sget-object v10, Lb2/e;->J:Lb2/l;

    invoke-static {v9, v10, v2, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v10, v2, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v13, v2, Lp1/q;->S:Z

    if-eqz v13, :cond_3

    invoke-virtual {v2, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v2, v12, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v2, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v11, v2, Lp1/q;->S:Z

    if-nez v11, :cond_4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5

    :cond_4
    invoke-static {v10, v2, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v2, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, 0x424a3d01

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lbm2/h0;->b()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v29

    move v3, v7

    :goto_4
    invoke-interface/range {v29 .. v29}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-interface/range {v29 .. v29}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v30, v3, 0x1

    const/4 v10, 0x0

    if-ltz v3, :cond_c

    check-cast v9, Lbm2/s0;

    invoke-virtual {v9}, Lbm2/s0;->e()F

    move-result v11

    float-to-double v12, v11

    const-wide/16 v14, 0x0

    cmpl-double v12, v12, v14

    if-lez v12, :cond_6

    goto :goto_5

    :cond_6
    const-string v12, "invalid weight; must be greater than zero"

    invoke-static {v12}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v12, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v13, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v14, v11, v13

    if-lez v14, :cond_7

    move v11, v13

    :cond_7
    invoke-direct {v12, v11, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual {v9}, Lbm2/s0;->c()Lbm2/m1;

    move-result-object v11

    const v13, 0x3ecccccd    # 0.4f

    invoke-static {v11, v13}, Lbm2/i;->n(Lbm2/m1;F)Ly81/e;

    move-result-object v11

    invoke-static {v11}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v11

    invoke-static {v12, v11}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, Lb2/e;->w:Lb2/m;

    invoke-static {v12, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    iget-wide v13, v2, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v2, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v7, v2, Lp1/q;->S:Z

    if-eqz v7, :cond_8

    invoke-virtual {v2, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_6
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v2, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v2, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v12, v2, Lp1/q;->S:Z

    if-nez v12, :cond_9

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_a

    :cond_9
    invoke-static {v13, v2, v13, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v2, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v7, v5

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float/2addr v7, v11

    invoke-static {v7, v4}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    int-to-float v7, v8

    mul-float v13, v7, v11

    const/16 v16, 0x0

    const/16 v17, 0xe

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v9}, Lbm2/s0;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    sget v13, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v12, v2, v13}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    const/16 v13, 0xb

    invoke-static {v13}, Lv63/c;->h(I)J

    move-result-wide v13

    invoke-static {v13, v14}, Ly3/o;->c(J)F

    move-result v13

    sget-object v14, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v2, v14}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ly3/c;

    move-object/from16 v16, v9

    const-wide v8, 0x100000000L

    invoke-static {v13, v8, v9, v14}, Lr80/c;->b(FJLy3/c;)J

    move-result-wide v8

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v13, v2, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->F()Lb91/a;

    move-result-object v23

    invoke-virtual/range {v16 .. v16}, Lbm2/s0;->c()Lbm2/m1;

    move-result-object v13

    invoke-static {v13, v6, v5, v10}, Lbm2/i;->o(Lbm2/m1;FILjava/lang/Object;)Ly81/e;

    move-result-object v10

    const/4 v13, 0x0

    invoke-interface {v10, v2, v13}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v16

    const/4 v10, 0x1

    new-instance v15, Lw3/k;

    const/4 v14, 0x5

    invoke-direct {v15, v14}, Lw3/k;-><init>(I)V

    sget v14, Lb91/a;->d:I

    shl-int/lit8 v27, v14, 0x12

    const v28, 0x2fdf0

    move v14, v7

    move-wide v7, v8

    const/4 v9, 0x0

    move/from16 v18, v10

    const/4 v10, 0x0

    move-object/from16 v19, v4

    move-object v4, v11

    const/4 v11, 0x0

    move/from16 v20, v3

    move-object v3, v12

    move/from16 v21, v13

    const-wide/16 v12, 0x0

    move/from16 v22, v14

    const/4 v14, 0x0

    move/from16 v25, v5

    move/from16 v24, v6

    move-wide/from16 v5, v16

    const-wide/16 v16, 0x0

    move/from16 v26, v18

    const/16 v18, 0x0

    move-object/from16 v31, v19

    const/16 v19, 0x0

    move/from16 v32, v20

    const/16 v20, 0x0

    move/from16 v33, v21

    const/16 v21, 0x0

    move/from16 v34, v22

    const/16 v22, 0x0

    move/from16 v35, v24

    const/16 v24, 0x0

    move/from16 v36, v26

    const/16 v26, 0x30

    move-object/from16 v1, v31

    move/from16 v0, v36

    move/from16 v31, v25

    move-object/from16 v25, v2

    move/from16 v2, v32

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lbm2/h0;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v0

    if-ge v2, v4, :cond_b

    const v2, 0x24fe2194

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    move/from16 v14, v34

    invoke-static {v14, v1}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v3, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v13, 0x0

    invoke-virtual {v3, v13}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_b
    const/4 v13, 0x0

    const v2, 0x24ff2c1b

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v13}, Lp1/q;->q(Z)V

    :goto_7
    move v8, v0

    move-object v4, v1

    move-object v2, v3

    move v7, v13

    move/from16 v3, v30

    move/from16 v5, v31

    move/from16 v6, v35

    move-object/from16 v0, p0

    goto/16 :goto_4

    :cond_c
    invoke-static {}, Lwb3/f;->d0()V

    throw v10

    :cond_d
    move-object v3, v2

    move v13, v7

    move v0, v8

    invoke-virtual {v3, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_e
    move-object v3, v2

    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_f

    new-instance v1, Lbm2/g;

    const/4 v2, 0x2

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lbm2/g;-><init>(Lbm2/h0;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final h(Lbm2/h0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lbm2/i;->g(Lbm2/h0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(Lbm2/h0;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "viewState"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x2e8638b4

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v6, v3, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v6, v5, :cond_2

    move v6, v8

    goto :goto_2

    :cond_2
    move v6, v7

    :goto_2
    and-int/2addr v3, v8

    invoke-virtual {v2, v3, v6}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_b

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v4, v4

    const/16 v9, 0xc

    const/4 v10, 0x0

    invoke-static {v4, v4, v10, v10, v9}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object v9

    invoke-static {v3, v9}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, Ll0/m;->a:Ll0/e;

    sget-object v11, Lb2/e;->J:Lb2/l;

    invoke-static {v9, v11, v2, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v11, v2, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v14, v2, Lp1/q;->S:Z

    if-eqz v14, :cond_3

    invoke-virtual {v2, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v2, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v2, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v12, v2, Lp1/q;->S:Z

    if-nez v12, :cond_4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_5

    :cond_4
    invoke-static {v11, v2, v11, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v2, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, -0x6e4f64fa

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lbm2/h0;->b()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v9, v7

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v12, v9, 0x1

    const/4 v13, 0x0

    if-ltz v9, :cond_9

    check-cast v11, Lbm2/s0;

    invoke-virtual {v11}, Lbm2/s0;->e()F

    move-result v14

    move-object v15, v6

    float-to-double v5, v14

    const-wide/16 v16, 0x0

    cmpl-double v5, v5, v16

    if-lez v5, :cond_6

    goto :goto_5

    :cond_6
    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v6, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v16, v14, v6

    if-lez v16, :cond_7

    move v14, v6

    :cond_7
    invoke-direct {v5, v14, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v11}, Lbm2/s0;->c()Lbm2/m1;

    move-result-object v6

    const/4 v11, 0x2

    invoke-static {v6, v10, v11, v13}, Lbm2/i;->o(Lbm2/m1;FILjava/lang/Object;)Ly81/e;

    move-result-object v6

    invoke-static {v6}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v6

    invoke-static {v5, v6}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5, v2, v7}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0}, Lbm2/h0;->b()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    sub-int/2addr v5, v8

    if-ge v9, v5, :cond_8

    const v5, 0x4c8bc426    # 7.327774E7f

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    int-to-float v5, v8

    invoke-static {v5, v15}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v2, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v2, v7}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_8
    const v5, 0x4c8ccead    # 7.382359E7f

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v7}, Lp1/q;->q(Z)V

    :goto_6
    move v5, v11

    move v9, v12

    move-object v6, v15

    goto :goto_4

    :cond_9
    invoke-static {}, Lwb3/f;->d0()V

    throw v13

    :cond_a
    invoke-virtual {v2, v7}, Lp1/q;->q(Z)V

    invoke-virtual {v2, v8}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_b
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_c

    new-instance v3, Lbm2/g;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v1, v4}, Lbm2/g;-><init>(Lbm2/h0;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final j(Lbm2/h0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lbm2/i;->i(Lbm2/h0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(ILandroidx/compose/runtime/Composer;I)V
    .locals 40

    move/from16 v0, p0

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v2, -0x234e2dea

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->e(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v4, v2, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v4, v3, :cond_2

    move v3, v6

    goto :goto_2

    :cond_2
    move v3, v5

    :goto_2
    and-int/2addr v2, v6

    invoke-virtual {v7, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_9

    sget v9, Lbm2/i;->e:F

    const/4 v12, 0x4

    const/4 v13, 0x0

    sget-object v14, Lb2/t;->w:Lb2/t;

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v8, v14

    invoke-static/range {v8 .. v13}, Lp91/e;->k(Landroidx/compose/ui/Modifier;FFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v28, v8

    sget v3, Lbm2/i;->b:F

    sget v4, Lbm2/i;->d:F

    invoke-static {v2, v4, v3}, Landroidx/compose/foundation/layout/a;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v4, v7, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-eqz v10, :cond_3

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_3
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v7, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v7, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v11, v7, Lp1/q;->S:Z

    if-nez v11, :cond_4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5

    :cond_4
    invoke-static {v4, v7, v4, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v7, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7, v5}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v11, v7, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->C()Lb91/a;

    move-result-object v22

    const/16 v13, 0x11

    invoke-static {v13}, Lv63/c;->h(I)J

    move-result-wide v13

    invoke-static {v13, v14}, Ly3/o;->c(J)F

    move-result v13

    sget-object v14, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v7, v14}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ly3/c;

    const-wide v5, 0x100000000L

    invoke-static {v13, v5, v6, v14}, Lr80/c;->b(FJLy3/c;)J

    move-result-wide v5

    invoke-virtual {v11, v7, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v12

    sget v14, Lb91/a;->d:I

    shl-int/lit8 v26, v14, 0x12

    const v27, 0x2fff2

    move-object v14, v3

    const/4 v3, 0x0

    move-object/from16 v16, v8

    const/4 v8, 0x0

    move-object/from16 v17, v9

    const/4 v9, 0x0

    move-object/from16 v18, v10

    const/4 v10, 0x0

    move-wide/from16 v19, v5

    move-object v6, v4

    move-wide v4, v12

    move-object v13, v11

    const-wide/16 v11, 0x0

    move-object/from16 v21, v13

    const/4 v13, 0x0

    move-object/from16 v23, v14

    const/4 v14, 0x0

    move-object/from16 v24, v16

    const/16 v25, 0x1

    const-wide/16 v15, 0x0

    move-object/from16 v29, v17

    const/16 v17, 0x0

    move-object/from16 v30, v18

    const/16 v18, 0x0

    move-object/from16 v31, v6

    move-object/from16 v39, v24

    move-object/from16 v24, v7

    move-wide/from16 v6, v19

    move-object/from16 v20, v39

    const/16 v19, 0x0

    move-object/from16 v32, v20

    const/16 v20, 0x0

    move-object/from16 v33, v21

    const/16 v21, 0x0

    move-object/from16 v34, v23

    const/16 v23, 0x0

    move/from16 v35, v25

    const/16 v25, 0x0

    move-object/from16 v0, v29

    move-object/from16 v38, v31

    move-object/from16 v37, v32

    move-object/from16 v36, v34

    move/from16 v1, v35

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    sget v15, Lbm2/i;->e:F

    const/16 v18, 0x4

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v14, v28

    invoke-static/range {v14 .. v19}, Lp91/e;->k(Landroidx/compose/ui/Modifier;FFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v3, Lbm2/i;->a:F

    sget v4, Lbm2/i;->c:F

    invoke-static {v2, v4, v3}, Landroidx/compose/foundation/layout/a;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v3, 0x10

    int-to-float v3, v3

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->E:Lb2/m;

    const/4 v4, 0x0

    invoke-static {v3, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v7, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-eqz v6, :cond_6

    invoke-virtual {v7, v0}, Lp1/q;->l(Lc93/a;)V

    :goto_4
    move-object/from16 v0, v30

    goto :goto_5

    :cond_6
    invoke-virtual {v7}, Lp1/q;->s0()V

    goto :goto_4

    :goto_5
    invoke-static {v7, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v14, v36

    invoke-static {v7, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v7, Lp1/q;->S:Z

    if-nez v0, :cond_7

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    :cond_7
    move-object/from16 v0, v37

    goto :goto_7

    :cond_8
    :goto_6
    move-object/from16 v6, v38

    goto :goto_8

    :goto_7
    invoke-static {v4, v7, v4, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_6

    :goto_8
    invoke-static {v7, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v33 .. v33}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->f()Lgz0/q;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/q;->h()I

    move-result v0

    const/4 v2, 0x6

    invoke-static {v0, v7, v2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    sget-wide v5, Li2/x;->n:J

    const/16 v8, 0xc30

    const/4 v9, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_9
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_a

    new-instance v1, Lbm2/h;

    const/4 v2, 0x0

    move/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lbm2/h;-><init>(III)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final l(IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lbm2/i;->k(ILandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final m(Lbm2/h0;)V
    .locals 9

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lbm2/h0;->a()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x63

    if-le v0, v1, :cond_0

    const/16 v1, -0xe

    int-to-float v1, v1

    sput v1, Lbm2/i;->d:F

    :cond_0
    invoke-virtual {p0}, Lbm2/h0;->b()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v3, v1

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v2, 0x1

    if-ltz v2, :cond_9

    check-cast v4, Lbm2/s0;

    invoke-virtual {v4}, Lbm2/s0;->b()I

    move-result v2

    invoke-virtual {v4}, Lbm2/s0;->d()I

    move-result v6

    if-gt v0, v6, :cond_7

    if-gt v2, v0, :cond_7

    invoke-virtual {v4}, Lbm2/s0;->d()I

    move-result v2

    invoke-virtual {v4}, Lbm2/s0;->b()I

    move-result v6

    sub-int/2addr v2, v6

    invoke-virtual {v4}, Lbm2/s0;->b()I

    move-result v6

    sub-int v6, v0, v6

    invoke-virtual {v4}, Lbm2/s0;->e()F

    move-result v7

    int-to-float v8, v2

    div-float/2addr v7, v8

    sub-int/2addr v2, v6

    int-to-float v2, v2

    mul-float/2addr v2, v7

    cmpg-float v6, v2, v1

    if-nez v6, :cond_1

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float v2, v7, v2

    :cond_1
    invoke-virtual {v4}, Lbm2/s0;->b()I

    move-result v6

    if-ne v0, v6, :cond_2

    move v2, v1

    :cond_2
    cmpl-float v6, v3, v1

    if-lez v6, :cond_5

    invoke-virtual {v4}, Lbm2/s0;->b()I

    move-result v6

    if-ne v0, v6, :cond_3

    sub-float v2, v3, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v4}, Lbm2/s0;->d()I

    move-result v6

    if-ne v0, v6, :cond_4

    invoke-virtual {v4}, Lbm2/s0;->e()F

    move-result v6

    :goto_1
    add-float/2addr v6, v3

    :goto_2
    sub-float v2, v6, v2

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Lbm2/s0;->e()F

    move-result v6

    goto :goto_1

    :cond_5
    invoke-virtual {v4}, Lbm2/s0;->b()I

    move-result v6

    if-ne v0, v6, :cond_6

    move v2, v1

    goto :goto_3

    :cond_6
    invoke-virtual {v4}, Lbm2/s0;->e()F

    move-result v6

    goto :goto_2

    :goto_3
    sput v2, Lbm2/i;->e:F

    :cond_7
    invoke-virtual {v4}, Lbm2/s0;->e()F

    move-result v2

    add-float/2addr v3, v2

    invoke-virtual {v4}, Lbm2/s0;->d()I

    move-result v2

    if-lt v0, v2, :cond_8

    sget v2, Lbm2/i;->e:F

    cmpg-float v2, v2, v1

    if-nez v2, :cond_8

    const/high16 v2, 0x3f800000    # 1.0f

    sput v2, Lbm2/i;->e:F

    :cond_8
    move v2, v5

    goto/16 :goto_0

    :cond_9
    invoke-static {}, Lwb3/f;->d0()V

    const/4 p0, 0x0

    throw p0

    :cond_a
    return-void
.end method

.method public static final n(Lbm2/m1;F)Ly81/e;
    .locals 1

    const-string v0, "style"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lbm2/i$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    new-instance p0, Lbm2/i$f;

    invoke-direct {p0, p1}, Lbm2/i$f;-><init>(F)V

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance p0, Lbm2/i$e;

    invoke-direct {p0, p1}, Lbm2/i$e;-><init>(F)V

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Lbm2/i$d;

    invoke-direct {p0, p1}, Lbm2/i$d;-><init>(F)V

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Lbm2/i$c;

    invoke-direct {p0, p1}, Lbm2/i$c;-><init>(F)V

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_4
    new-instance p0, Lbm2/i$b;

    invoke-direct {p0, p1}, Lbm2/i$b;-><init>(F)V

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lbm2/m1;FILjava/lang/Object;)Ly81/e;
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    :cond_0
    invoke-static {p0, p1}, Lbm2/i;->n(Lbm2/m1;F)Ly81/e;

    move-result-object p0

    return-object p0
.end method
