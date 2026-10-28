.class public final Lzc1/l4$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzc1/l4;->b(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/m;"
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 23

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v15, p1

    check-cast v15, Lp1/q;

    invoke-virtual {v15, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    const v0, -0x45343ddc

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->N:Lb2/k;

    int-to-float v4, v3

    const/4 v5, 0x4

    int-to-float v5, v5

    const/16 v6, 0x36

    invoke-static {v4, v5, v1, v15, v6}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v1

    iget-wide v4, v15, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v15, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v7, v15, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v15, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v15, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v15, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v15, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, v15, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v15, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v0, "Two Legend Elements"

    const/4 v1, 0x6

    invoke-static {v0, v15, v1}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v0, v4, :cond_4

    sget-object v0, Lzc1/l4$b;->w:Lzc1/l4$b;

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    const-string v18, "HOURS OF SLEEP"

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_5

    sget-object v6, Lzc1/l4$c;->w:Lzc1/l4$c;

    invoke-virtual {v15, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v8

    const-string v19, "SLEEP NEEDED"

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget-object v6, Ln21/i;->SQUARE:Ln21/i;

    sget v7, Li91/a;->a:I

    const/high16 v10, 0x180000

    or-int/2addr v10, v7

    sget v11, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v20, v11, 0x3

    or-int v10, v10, v20

    shl-int/lit8 v12, v7, 0xc

    or-int/2addr v10, v12

    shl-int/lit8 v11, v11, 0xf

    or-int v16, v10, v11

    const/16 v17, 0x38c

    move-object v10, v6

    const/4 v6, 0x0

    move v11, v7

    const/4 v7, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v14, v12

    const-wide/16 v12, 0x0

    move/from16 v21, v14

    const/4 v14, 0x0

    move-object v2, v4

    move-object v4, v0

    move/from16 v0, v21

    invoke-static/range {v4 .. v17}, Ln21/h;->u(Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v22, v10

    const-string v4, "One Legend Elements"

    invoke-static {v4, v15, v1}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_6

    sget-object v1, Lzc1/l4$d;->w:Lzc1/l4$d;

    invoke-virtual {v15, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v4

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    or-int v16, v0, v20

    const/16 v17, 0x3fc

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    invoke-static/range {v4 .. v17}, Ln21/h;->u(Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_7

    sget-object v1, Lzc1/l4$e;->w:Lzc1/l4$e;

    invoke-virtual {v15, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v4

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    or-int/lit16 v0, v0, 0x180

    or-int v16, v0, v20

    const/16 v17, 0x3f8

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    move-object/from16 v6, v22

    invoke-static/range {v4 .. v17}, Ln21/h;->u(Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_8

    sget-object v0, Lzc1/l4$f;->w:Lzc1/l4$f;

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v4

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v15, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->Y0()J

    move-result-wide v12

    const-string v0, "EXPECTED TREND"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v6, Ln21/i;->RECTANGLE:Ln21/i;

    const/4 v14, 0x0

    const/16 v17, 0x2f8

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v4 .. v17}, Ln21/h;->u(Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v3}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    return-void

    :cond_9
    invoke-virtual {v15}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lzc1/l4$a;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
