.class final Lbd1/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbd1/e;->b(Ljava/util/List;Li2/x;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/o;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lbd1/e$a;->w:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(JLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbd1/e$a;->f(JLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(JLkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p2, p0, p1}, Lbd1/e$a;->e(Lkotlin/jvm/functions/Function1;J)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;J)Ll83/a0;
    .locals 1

    new-instance v0, Li2/x;

    invoke-direct {v0, p1, p2}, Li2/x;-><init>(J)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(JLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p3, v3

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p3, 0x4

    int-to-float p3, p3

    const/high16 v0, 0x41200000    # 10.0f

    mul-float/2addr p3, v0

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {p3, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p3, v2, v0}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object p3

    int-to-float v0, v3

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0, p3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    sget-object v0, Lt0/j;->a:Lt0/i;

    invoke-static {p3, p0, p1, v0}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-static {p0, p2, v2}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final d(Landroidx/compose/foundation/lazy/a;JLf31/a;Landroidx/compose/runtime/Composer;I)V
    .locals 20

    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    move-object/from16 v3, p4

    move/from16 v4, p6

    const-string v5, "$this$RadioGroup"

    move-object/from16 v6, p1

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "state"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v5, v4, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_1

    move-object/from16 v5, p5

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v1, v2}, Lp1/q;->f(J)Z

    move-result v5

    if-eqz v5, :cond_0

    move v5, v6

    goto :goto_0

    :cond_0
    const/16 v5, 0x10

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_4

    and-int/lit16 v4, v4, 0x200

    if-nez v4, :cond_2

    move-object/from16 v4, p5

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_2

    :cond_2
    move-object/from16 v4, p5

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_3

    const/16 v4, 0x100

    goto :goto_3

    :cond_3
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v5, v4

    :cond_4
    and-int/lit16 v4, v5, 0x491

    const/16 v7, 0x490

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v4, v7, :cond_5

    move v4, v9

    goto :goto_4

    :cond_5
    move v4, v8

    :goto_4
    and-int/lit8 v7, v5, 0x1

    move-object/from16 v10, p5

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v7, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v3}, Lf31/a;->c()Z

    move-result v3

    if-eqz v3, :cond_6

    const v3, -0x66d048a0

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v8}, Lp1/q;->q(Z)V

    sget-wide v3, Li2/x;->i:J

    :goto_5
    move-wide v12, v3

    goto :goto_6

    :cond_6
    const v3, -0x66cfabcf

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-static {v3, v10, v4, v8}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v3

    goto :goto_5

    :goto_6
    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x2

    int-to-float v4, v4

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v4, v7

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    iget-object v3, v0, Lbd1/e$a;->w:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit8 v4, v5, 0x70

    if-ne v4, v6, :cond_7

    move v8, v9

    :cond_7
    or-int/2addr v3, v8

    iget-object v4, v0, Lbd1/e$a;->w:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_8

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v5, v3, :cond_9

    :cond_8
    new-instance v5, Lbd1/c;

    invoke-direct {v5, v1, v2, v4}, Lbd1/c;-><init>(JLkotlin/jvm/functions/Function1;)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object/from16 v18, v5

    check-cast v18, Lc93/a;

    const/16 v19, 0xf

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v4, v9

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v11

    new-instance v4, Lbd1/d;

    invoke-direct {v4, v1, v2}, Lbd1/d;-><init>(J)V

    const v1, -0x4fafae83

    invoke-static {v1, v10, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v16

    const/high16 v18, 0x180000

    const/16 v19, 0x38

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v17, v10

    move-object v10, v3

    invoke-static/range {v10 .. v19}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    return-void

    :cond_a
    move-object/from16 v17, v10

    invoke-virtual/range {v17 .. v17}, Lp1/q;->X()V

    return-void
.end method

.method public synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v1, p1

    check-cast v1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Li2/x;

    iget-wide v2, p2, Li2/x;->a:J

    move-object v4, p3

    check-cast v4, Lf31/a;

    move-object v5, p4

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p5, Ljava/lang/Number;

    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    move-result v6

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lbd1/e$a;->d(Landroidx/compose/foundation/lazy/a;JLf31/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
