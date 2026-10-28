.class public abstract Lzc1/z6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "h",
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
.method public static synthetic a(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/z6;->l(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/z6;->k(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/z6;->o(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/z6;->j(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/z6;->m(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/z6;->i(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/z6;->n(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Landroidx/compose/runtime/Composer;I)V
    .locals 13

    check-cast p0, Lp1/q;

    const v0, 0x29239bc

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {p0, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_10

    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {p0, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    sget-object v3, Lb2/e;->N:Lb2/k;

    sget-object v4, Ll0/m;->c:Ll0/g;

    const/16 v5, 0x30

    invoke-static {v4, v3, p0, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, p0, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {p0}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {p0, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {p0}, Lp1/q;->i0()V

    iget-boolean v9, p0, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {p0, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {p0, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {p0, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, p0, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, p0, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {p0, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v3, "Text"

    const/4 v4, 0x6

    invoke-static {v3, p0, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v3, "Small"

    invoke-static {v3, p0, v4}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_4

    if-ne v7, v8, :cond_5

    :cond_4
    new-instance v7, Lzc1/l1;

    const/16 v5, 0x18

    invoke-direct {v7, v2, v5}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v7, Lc93/a;

    invoke-static {v7, p0, v1, v1}, Lpy0/b;->t0(Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float v7, v5, v5

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {p0, v9}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v9, "Medium"

    invoke-static {v9, p0, v4}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_6

    if-ne v11, v8, :cond_7

    :cond_6
    new-instance v11, Lzc1/l1;

    const/16 v10, 0x19

    invoke-direct {v11, v2, v10}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v11, Lc93/a;

    invoke-static {v11, p0, v1, v1}, Lpy0/b;->m0(Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {p0, v10}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v10, "Large"

    invoke-static {v10, p0, v4}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_8

    if-ne v12, v8, :cond_9

    :cond_8
    new-instance v12, Lzc1/l1;

    const/16 v11, 0x1a

    invoke-direct {v12, v2, v11}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v12, Lc93/a;

    invoke-static {v12, p0, v1, v1}, Lpy0/b;->f0(Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/16 v11, 0x8

    int-to-float v11, v11

    invoke-static {v11, v5, v6, p0}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const-string v5, "Numbers"

    invoke-static {v5, p0, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v3, p0, v4}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_a

    if-ne v5, v8, :cond_b

    :cond_a
    new-instance v5, Lzc1/l1;

    const/16 v3, 0x1b

    invoke-direct {v5, v2, v3}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v5, Lc93/a;

    invoke-static {v5, p0, v1, v1}, Lpy0/b;->Y(Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {p0, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {v9, p0, v4}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_c

    if-ne v5, v8, :cond_d

    :cond_c
    new-instance v5, Lzc1/l1;

    const/16 v3, 0x1c

    invoke-direct {v5, v2, v3}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v5, Lc93/a;

    invoke-static {v5, p0, v1, v1}, Lpy0/b;->R(Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {p0, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {v10, p0, v4}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_e

    if-ne v4, v8, :cond_f

    :cond_e
    new-instance v4, Lzc1/l1;

    const/16 v3, 0x1d

    invoke-direct {v4, v2, v3}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v4, Lc93/a;

    invoke-static {v4, p0, v1, v1}, Lpy0/b;->K(Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v6, v7, p0, v0}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    goto :goto_2

    :cond_10
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_11

    new-instance v0, Lzc1/g6;

    const/16 v1, 0xe

    invoke-direct {v0, p1, v1}, Lzc1/g6;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final i(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Text - Small Clicked"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Text - Medium Clicked"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Text - Large Clicked"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Number - Small Clicked"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Number - Medium Clicked"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Number - Large Clicked"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/z6;->h(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
