.class public final Lzc1/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lzc1/e1;

.field private static b:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lzc1/e1;

    invoke-direct {v0}, Lzc1/e1;-><init>()V

    sput-object v0, Lzc1/e1;->a:Lzc1/e1;

    new-instance v0, Lzc1/y0;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lzc1/y0;-><init>(I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, 0x13b73553

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lzc1/e1;->b:Lkotlin/jvm/functions/Function3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/e1;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 34

    move/from16 v0, p0

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-nez v1, :cond_1

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->e(I)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int v1, p2, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p2

    :goto_1
    and-int/lit8 v4, v1, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v4, v5, :cond_2

    move v4, v7

    goto :goto_2

    :cond_2
    move v4, v6

    :goto_2
    and-int/2addr v1, v7

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v1, v4}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Lg93/e;

    shr-int/lit8 v4, v0, 0x1f

    invoke-direct {v1, v0, v4}, Lg93/e;-><init>(II)V

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v9, 0x1e

    int-to-float v9, v9

    int-to-float v3, v3

    mul-float/2addr v9, v3

    invoke-static {v9, v4}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float v10, v3, v9

    int-to-float v11, v7

    mul-float/2addr v11, v9

    invoke-static {v4, v10, v11}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v9, 0x100

    invoke-virtual {v1, v6, v9}, Lg93/d;->h(II)I

    move-result v10

    invoke-virtual {v1, v6, v9}, Lg93/d;->h(II)I

    move-result v11

    invoke-virtual {v1, v6, v9}, Lg93/d;->h(II)I

    move-result v1

    const/16 v9, 0xff

    invoke-static {v10, v11, v1, v9}, Li2/w0;->d(IIII)J

    move-result-wide v9

    int-to-float v1, v2

    invoke-static {v4, v1, v3, v9, v10}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->E:Lb2/m;

    invoke-static {v2, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v3, v8, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v8, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_3

    invoke-virtual {v8, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_3
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v8, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v8, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-nez v4, :cond_4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    :cond_4
    invoke-static {v3, v8, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v8, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    add-int/2addr v0, v7

    const-string v1, "Item "

    invoke-static {v0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v8, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v1, v8, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->o()Lb91/a;

    move-result-object v28

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v32, v1, 0x12

    const v33, 0x2fffa

    const/4 v9, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    move-object/from16 v30, v8

    move-object v8, v0

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v30

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    move-object v0, v8

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method


# virtual methods
.method public final b()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation

    sget-object v0, Lzc1/e1;->b:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method
