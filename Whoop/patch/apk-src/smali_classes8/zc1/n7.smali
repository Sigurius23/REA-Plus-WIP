.class public abstract Lzc1/n7;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "b",
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

    invoke-static {p0, p1, p2}, Lzc1/n7;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move/from16 v0, p1

    move-object/from16 v8, p0

    check-cast v8, Lp1/q;

    const v1, 0x6e9d63b4

    invoke-virtual {v8, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v8, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v12, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v12, v8, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->W0()J

    move-result-wide v2

    sget-object v4, Li2/w0;->a:Li2/v0;

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->N:Lb2/k;

    sget-object v3, Ll0/m;->c:Ll0/g;

    const/16 v4, 0x30

    invoke-static {v3, v2, v8, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, v8, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v8, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {v8, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v8, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v8, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v3, v8, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v8, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "With Text"

    const/4 v14, 0x6

    invoke-static {v1, v8, v14}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v2, Lnz0/b;

    new-instance v1, Lnz0/a$b;

    const-string v3, "8:18"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v1, v3}, Lnz0/a$b;-><init>(Lcom/whoop/design/util/TextResource;)V

    invoke-direct {v2, v1}, Lnz0/b;-><init>(Lnz0/a;)V

    const-string v1, "HOURS OF SLEEP"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v12, v8, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->f0()J

    move-result-wide v4

    sget v1, Lnz0/b;->b:I

    shl-int/lit8 v1, v1, 0x3

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/2addr v6, v14

    or-int v9, v1, v6

    const/16 v10, 0x31

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v10}, Lnz0/c;->e(Landroidx/compose/ui/Modifier;Lnz0/b;Lcom/whoop/design/util/TextResource;JLc93/a;ZLandroidx/compose/runtime/Composer;II)V

    new-instance v2, Lnz0/b;

    new-instance v1, Lnz0/a$b;

    const-string v3, "--:--"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v1, v3}, Lnz0/a$b;-><init>(Lcom/whoop/design/util/TextResource;)V

    invoke-direct {v2, v1}, Lnz0/b;-><init>(Lnz0/a;)V

    const-string v15, "SLEEP NEEDED"

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v12, v8, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->a()J

    move-result-wide v4

    const/4 v1, 0x0

    invoke-static/range {v1 .. v10}, Lnz0/c;->e(Landroidx/compose/ui/Modifier;Lnz0/b;Lcom/whoop/design/util/TextResource;JLc93/a;ZLandroidx/compose/runtime/Composer;II)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    filled-new-array {v1, v1}, [Ll83/a0;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    const-string v2, "With Icon"

    invoke-static {v2, v8, v14}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v2, Lnz0/b;

    new-instance v3, Lnz0/a$a;

    new-instance v4, Ly71/g;

    invoke-virtual {v12}, Lx81/d;->d()Lgz0/o0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/k0;->P()I

    move-result v5

    const/4 v14, 0x0

    const/4 v6, 0x2

    invoke-direct {v4, v5, v14, v6, v14}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v4}, Lnz0/a$a;-><init>(Ly71/g;)V

    invoke-direct {v2, v3}, Lnz0/b;-><init>(Lnz0/a;)V

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v12, v8, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->a()J

    move-result-wide v4

    move-object/from16 v16, v1

    const/4 v1, 0x0

    move/from16 v17, v6

    const/4 v6, 0x0

    move-object/from16 v18, v16

    move/from16 v11, v17

    invoke-static/range {v1 .. v10}, Lnz0/c;->e(Landroidx/compose/ui/Modifier;Lnz0/b;Lcom/whoop/design/util/TextResource;JLc93/a;ZLandroidx/compose/runtime/Composer;II)V

    new-instance v2, Lnz0/b;

    new-instance v1, Lnz0/a$a;

    new-instance v3, Ly71/g;

    invoke-static {v12}, Lm4/a;->b(Lx81/d;)I

    move-result v4

    invoke-direct {v3, v4, v14, v11, v14}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v3}, Lnz0/a$a;-><init>(Ly71/g;)V

    invoke-direct {v2, v1}, Lnz0/b;-><init>(Lnz0/a;)V

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v12, v8, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->a()J

    move-result-wide v4

    const/4 v1, 0x0

    invoke-static/range {v1 .. v10}, Lnz0/c;->e(Landroidx/compose/ui/Modifier;Lnz0/b;Lcom/whoop/design/util/TextResource;JLc93/a;ZLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v1, v18

    filled-new-array {v1, v1}, [Ll83/a0;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    const/4 v1, 0x1

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_5

    new-instance v2, Lzc1/g6;

    const/16 v3, 0x19

    invoke-direct {v2, v0, v3}, Lzc1/g6;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/n7;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
