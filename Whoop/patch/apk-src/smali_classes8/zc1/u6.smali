.class public abstract Lzc1/u6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "d",
        "(Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/u6;->g(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/u6;->f(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/u6;->e(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move/from16 v0, p1

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, -0x2ead8428

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    and-int/lit8 v4, v0, 0x1

    invoke-virtual {v1, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_8

    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v1, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Lb2/e;->N:Lb2/k;

    sget-object v7, Ll0/m;->c:Ll0/g;

    const/16 v8, 0x30

    invoke-static {v7, v6, v1, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v1, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v1, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v10, v1, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v1, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v1, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v1, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v1, Lp1/q;->S:Z

    if-nez v8, :cond_2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    :cond_2
    invoke-static {v7, v1, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v1, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v4, "Expanded"

    const/4 v6, 0x6

    invoke-static {v4, v1, v6}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v4, "REPLAY"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget-object v9, Lgz0/m0;->UNDO:Lgz0/m0;

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-nez v7, :cond_4

    if-ne v10, v15, :cond_5

    :cond_4
    new-instance v10, Lzc1/m4;

    const/16 v7, 0x8

    invoke-direct {v10, v3, v7}, Lzc1/m4;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v12, v10

    check-cast v12, Lkotlin/jvm/functions/Function1;

    new-instance v7, Lk31/d;

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/16 v13, 0x8

    const/4 v14, 0x0

    invoke-direct/range {v7 .. v14}, Lk31/d;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;ZZLkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v8, Lk31/d;->f:I

    invoke-static {v7, v1, v8}, Lk31/c;->b(Lk31/d;Landroidx/compose/runtime/Composer;I)V

    const/4 v7, 0x4

    int-to-float v7, v7

    invoke-static {v7, v7, v5, v1}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const-string v5, "Not Expanded"

    invoke-static {v5, v1, v6}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_6

    if-ne v5, v15, :cond_7

    :cond_6
    new-instance v5, Lzc1/m4;

    const/16 v4, 0x9

    invoke-direct {v5, v3, v4}, Lzc1/m4;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v14, v5

    check-cast v14, Lkotlin/jvm/functions/Function1;

    move-object v11, v9

    new-instance v9, Lk31/d;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v15, 0x8

    const/16 v16, 0x0

    invoke-direct/range {v9 .. v16}, Lk31/d;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;ZZLkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v9, v1, v8}, Lk31/c;->b(Lk31/d;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_8
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_9

    new-instance v2, Lzc1/g6;

    const/16 v3, 0x9

    invoke-direct {v2, v0, v3}, Lzc1/g6;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final e(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Replay Action Clicked: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Replay Action Clicked: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/u6;->d(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
