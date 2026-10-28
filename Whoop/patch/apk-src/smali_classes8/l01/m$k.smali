.class public final Ll01/m$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll01/m;->i0(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
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


# instance fields
.field final synthetic w:Landroidx/compose/ui/Modifier;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/Modifier;)V
    .locals 0

    iput-object p1, p0, Ll01/m$k;->w:Landroidx/compose/ui/Modifier;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 34

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    and-int/lit8 v5, p2, 0x1

    move-object/from16 v9, p1

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    const v1, -0x177afd53

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v1}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    int-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v4, v5

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v6, 0x6

    invoke-static {v4, v5, v9, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {v9, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v9, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v9, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v5, v9, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v9, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v6, v0, Ll01/m$k;->w:Landroidx/compose/ui/Modifier;

    sget-object v1, Ll01/o;->a:Ll01/o;

    invoke-virtual {v1}, Ll01/o;->f()Ll01/n;

    move-result-object v10

    const v32, 0x1fefff

    const/16 v33, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v10 .. v33}, Ll01/n;->b(Ll01/n;Ljava/lang/String;Lgz0/m0;Lkd1/o;Ljava/lang/String;Lb91/c;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll01/t;Lny0/h;Lny0/h;Ll01/d;Ll01/b;Ljava/util/List;FFFLi91/a;ZLhy0/h1;ILjava/lang/Object;)Ll01/n;

    move-result-object v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_4

    sget-object v4, Ll01/m$l;->w:Ll01/m$l;

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v8, v4

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/16 v10, 0x180

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Ll01/m;->k0(Landroidx/compose/ui/Modifier;Ll01/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    iget-object v6, v0, Ll01/m$k;->w:Landroidx/compose/ui/Modifier;

    invoke-virtual {v1}, Ll01/o;->g()Ll01/n;

    move-result-object v10

    const v32, 0x1fefff

    const/16 v33, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v10 .. v33}, Ll01/n;->b(Ll01/n;Ljava/lang/String;Lgz0/m0;Lkd1/o;Ljava/lang/String;Lb91/c;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll01/t;Lny0/h;Lny0/h;Ll01/d;Ll01/b;Ljava/util/List;FFFLi91/a;ZLhy0/h1;ILjava/lang/Object;)Ll01/n;

    move-result-object v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_5

    sget-object v4, Ll01/m$m;->w:Ll01/m$m;

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v8, v4

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/16 v10, 0x180

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Ll01/m;->k0(Landroidx/compose/ui/Modifier;Ll01/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    iget-object v6, v0, Ll01/m$k;->w:Landroidx/compose/ui/Modifier;

    invoke-virtual {v1}, Ll01/o;->e()Ll01/n;

    move-result-object v10

    const v32, 0x1fefff

    const/16 v33, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v10 .. v33}, Ll01/n;->b(Ll01/n;Ljava/lang/String;Lgz0/m0;Lkd1/o;Ljava/lang/String;Lb91/c;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll01/t;Lny0/h;Lny0/h;Ll01/d;Ll01/b;Ljava/util/List;FFFLi91/a;ZLhy0/h1;ILjava/lang/Object;)Ll01/n;

    move-result-object v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_6

    sget-object v4, Ll01/m$n;->w:Ll01/m$n;

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v8, v4

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/16 v10, 0x180

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Ll01/m;->k0(Landroidx/compose/ui/Modifier;Ll01/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    iget-object v6, v0, Ll01/m$k;->w:Landroidx/compose/ui/Modifier;

    invoke-virtual {v1}, Ll01/o;->d()Ll01/n;

    move-result-object v10

    const v32, 0x1fefff

    const/16 v33, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v10 .. v33}, Ll01/n;->b(Ll01/n;Ljava/lang/String;Lgz0/m0;Lkd1/o;Ljava/lang/String;Lb91/c;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll01/t;Lny0/h;Lny0/h;Ll01/d;Ll01/b;Ljava/util/List;FFFLi91/a;ZLhy0/h1;ILjava/lang/Object;)Ll01/n;

    move-result-object v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_7

    sget-object v1, Ll01/m$o;->w:Ll01/m$o;

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/16 v10, 0x180

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Ll01/m;->k0(Landroidx/compose/ui/Modifier;Ll01/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    return-void

    :cond_8
    invoke-virtual {v9}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ll01/m$k;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
