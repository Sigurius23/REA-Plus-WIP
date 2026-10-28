.class public final Lzc1/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzc1/e;->b(Landroidx/compose/runtime/Composer;I)V
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
    .locals 26

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

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    const v0, 0x3cdc09cd

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    int-to-float v0, v3

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v0, v3

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v4, 0x3

    int-to-float v4, v4

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v6, Lb2/e;->M:Lb2/k;

    const/4 v7, 0x6

    invoke-static {v5, v6, v8, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v8, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v8, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v8, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v6, v8, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v8, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v19, 0x3fd

    const/16 v20, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v9 .. v20}, Luz0/g;->m(Ljava/lang/String;ZLkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Luz0/o;Luz0/l;ILjava/lang/Object;)Luz0/i;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v0, v11, :cond_4

    sget-object v0, Lzc1/e$b;->w:Lzc1/e$b;

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x30

    const/4 v10, 0x4

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Luz0/g;->d(Luz0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v8, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/16 v22, 0x3fd

    const/16 v23, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v12 .. v23}, Luz0/g;->m(Ljava/lang/String;ZLkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Luz0/o;Luz0/l;ILjava/lang/Object;)Luz0/i;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_5

    sget-object v0, Lzc1/e$c;->w:Lzc1/e$c;

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x30

    const/4 v10, 0x4

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Luz0/g;->d(Luz0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v8, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v20, Luz0/b;->LOW:Luz0/b;

    const/16 v24, 0xcfd

    const/16 v25, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-string v21, "Light"

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v12 .. v25}, Luz0/g;->o(Ljava/lang/String;ZLkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Luz0/b;Ljava/lang/String;Ljava/lang/String;Luz0/l;ILjava/lang/Object;)Luz0/i;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_6

    sget-object v0, Lzc1/e$d;->w:Lzc1/e$d;

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x30

    const/4 v10, 0x4

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Luz0/g;->d(Luz0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v8, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v20, Luz0/b;->MEDIUM:Luz0/b;

    const/16 v24, 0xcfd

    const/16 v25, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-string v21, "Moderate"

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v12 .. v25}, Luz0/g;->o(Ljava/lang/String;ZLkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Luz0/b;Ljava/lang/String;Ljava/lang/String;Luz0/l;ILjava/lang/Object;)Luz0/i;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_7

    sget-object v0, Lzc1/e$e;->w:Lzc1/e$e;

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x30

    const/4 v10, 0x4

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Luz0/g;->d(Luz0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v8, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v20, Luz0/b;->HIGH:Luz0/b;

    const/16 v24, 0xcfd

    const/16 v25, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-string v21, "Vigorous"

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v12 .. v25}, Luz0/g;->o(Ljava/lang/String;ZLkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Luz0/b;Ljava/lang/String;Ljava/lang/String;Luz0/l;ILjava/lang/Object;)Luz0/i;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_8

    sget-object v0, Lzc1/e$f;->w:Lzc1/e$f;

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x30

    const/4 v10, 0x4

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Luz0/g;->d(Luz0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    return-void

    :cond_9
    invoke-virtual {v8}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lzc1/e$a;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
