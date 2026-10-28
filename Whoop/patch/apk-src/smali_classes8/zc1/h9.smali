.class public abstract Lzc1/h9;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\",\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00038\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Ll83/a0;",
        "d",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "Ll83/k;",
        "",
        "Lr81/c;",
        "a",
        "Ljava/util/List;",
        "getWhoopProBannerStates",
        "()Ljava/util/List;",
        "whoopProBannerStates",
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


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ll83/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 41

    new-instance v0, Lr81/c;

    const-string v1, "MORE SAVINGS, MORE BENEFITS"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v3, Lr81/d;

    const-string v4, "$144"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const-string v5, "/year"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-string v6, "ADD TO MEMBERSHIP"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lr81/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o0;->e()Lgz0/o;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o;->m()I

    move-result v5

    const-string v6, "A free item every 3 months, including items like a band or battery pack"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v7, Lr81/e;

    invoke-direct {v7, v6, v5}, Lr81/e;-><init>(Lcom/whoop/design/util/TextResource;I)V

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o0;->e()Lgz0/o;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o;->j()I

    move-result v5

    const-string v6, "20% off accessories & apparel"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v8, Lr81/e;

    invoke-direct {v8, v6, v5}, Lr81/e;-><init>(Lcom/whoop/design/util/TextResource;I)V

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o0;->e()Lgz0/o;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o;->A()I

    move-result v5

    const-string v6, "Free shipping on every order"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v9, Lr81/e;

    invoke-direct {v9, v6, v5}, Lr81/e;-><init>(Lcom/whoop/design/util/TextResource;I)V

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o0;->e()Lgz0/o;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o;->p()I

    move-result v5

    const-string v6, "First access to new features and accessories"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v10, Lr81/e;

    invoke-direct {v10, v6, v5}, Lr81/e;-><init>(Lcom/whoop/design/util/TextResource;I)V

    filled-new-array {v7, v8, v9, v10}, [Lr81/e;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    invoke-direct {v0, v2, v6, v3, v5}, Lr81/c;-><init>(Lcom/whoop/design/util/TextResource;Lm91/u;Lr81/d;Ljava/util/List;)V

    new-instance v2, Ll83/k;

    const-string v3, "Member: False"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lr81/c;

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v5, "Your free item is available"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const-string v5, "Pro members get a free item every 3 months"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    new-instance v14, Ly71/g;

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o0;->e()Lgz0/o;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o;->t()I

    move-result v5

    const/4 v7, 0x2

    invoke-direct {v14, v5, v6, v7, v6}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Ld11/k;

    sget-object v8, Ly81/f;->BRAND_WHOOP_PRO:Ly81/f;

    const/4 v9, 0x0

    invoke-direct {v5, v8, v9, v7, v6}, Ld11/k;-><init>(Ly81/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lzc1/h7;

    const/16 v13, 0xb

    invoke-direct {v10, v13}, Lzc1/h7;-><init>(I)V

    invoke-static {v10}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v27

    move v10, v7

    new-instance v7, Ld11/i;

    const v37, 0x1bf6df27

    const/16 v38, 0x0

    move-object v13, v8

    const/4 v8, 0x0

    move v15, v9

    const/4 v9, 0x0

    move/from16 v16, v10

    const/4 v10, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    move/from16 v18, v15

    const/4 v15, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v22, v19

    const/16 v19, 0x0

    move-object/from16 v23, v20

    const/16 v20, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move-object/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move-object/from16 v28, v25

    const/16 v25, 0x0

    move/from16 v29, v26

    const/16 v26, 0x0

    move-object/from16 v30, v28

    const/16 v28, 0x0

    move/from16 v31, v29

    const/16 v29, 0x0

    move-object/from16 v32, v30

    const/16 v30, 0x0

    move/from16 v33, v31

    const/16 v31, 0x0

    move-object/from16 v34, v32

    const/16 v32, 0x0

    move/from16 v35, v33

    const/16 v33, 0x0

    move-object/from16 v36, v34

    const/high16 v34, 0x7fc00000    # Float.NaN

    move/from16 v39, v35

    const/16 v35, 0x0

    move-object/from16 v40, v36

    const/16 v36, 0x0

    move-object/from16 v21, v5

    move-object/from16 v5, v40

    invoke-direct/range {v7 .. v38}, Ld11/i;-><init>(Ljava/lang/Object;Lkd1/l;Ll3/v0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll3/v0;Ly71/g;Lkd1/o;Lkd1/o;Lkd1/o;Lkotlin/jvm/functions/Function1;ZZLd11/a;Lk91/a;Ld11/b;ZZLd11/c;Li91/a;Lj91/b;Li2/t;FFFFFLjava/lang/Object;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v8, Lm83/y;->w:Lm83/y;

    invoke-direct {v0, v3, v7, v6, v8}, Lr81/c;-><init>(Lcom/whoop/design/util/TextResource;Lm91/u;Lr81/d;Ljava/util/List;)V

    new-instance v3, Ll83/k;

    const-string v7, "Member: True & CtaTitle.showGradient: true"

    invoke-direct {v3, v7, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lr81/c;

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v7, "$150 saved with WHOOP Pro"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const-string v7, "Next free item is available on April 12th, 2024"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    new-instance v7, Ly71/g;

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->e()Lgz0/o;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o;->h()I

    move-result v4

    const/4 v10, 0x2

    invoke-direct {v7, v4, v6, v10, v6}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Ld11/k;

    const/4 v15, 0x0

    invoke-direct {v4, v5, v15, v10, v6}, Ld11/k;-><init>(Ly81/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v5, Lzc1/h9$a;->w:Lzc1/h9$a;

    invoke-static {v5}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v29

    new-instance v9, Ld11/i;

    const v39, 0x1bf6df27

    const/16 v40, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/high16 v36, 0x7fc00000    # Float.NaN

    const/16 v37, 0x0

    move-object/from16 v23, v4

    move-object/from16 v16, v7

    invoke-direct/range {v9 .. v40}, Ld11/i;-><init>(Ljava/lang/Object;Lkd1/l;Ll3/v0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll3/v0;Ly71/g;Lkd1/o;Lkd1/o;Lkd1/o;Lkotlin/jvm/functions/Function1;ZZLd11/a;Lk91/a;Ld11/b;ZZLd11/c;Li91/a;Lj91/b;Li2/t;FFFFFLjava/lang/Object;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v1, v9, v6, v8}, Lr81/c;-><init>(Lcom/whoop/design/util/TextResource;Lm91/u;Lr81/d;Ljava/util/List;)V

    new-instance v1, Ll83/k;

    const-string v4, "Member: True & CtaTitle.showGradient: false"

    invoke-direct {v1, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v1}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lzc1/h9;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/h9;->f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lzc1/h9;->g(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/h9;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/runtime/Composer;I)V
    .locals 10

    check-cast p0, Lp1/q;

    const v0, 0x2bed4fbe

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {p0, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_6

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v5, p0, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, p0, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {p0}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {p0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {p0}, Lp1/q;->i0()V

    iget-boolean v8, p0, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {p0, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {p0, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {p0, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, p0, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v5, p0, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {p0, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, 0x63cc2e58

    invoke-virtual {p0, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lzc1/h9;->a:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll83/k;

    iget-object v5, v4, Ll83/k;->w:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-static {v5, p0, v0}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v5, 0x2

    int-to-float v5, v5

    const/4 v6, 0x4

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {p0, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v5, Lr81/a;

    invoke-direct {v5}, Lr81/a;-><init>()V

    iget-object v4, v4, Ll83/k;->x:Ljava/lang/Object;

    check-cast v4, Lm91/u;

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v7, v8, :cond_4

    new-instance v7, Lzc1/h7;

    const/16 v8, 0xa

    invoke-direct {v7, v8}, Lzc1/h7;-><init>(I)V

    invoke-virtual {p0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v7, Lkotlin/jvm/functions/Function1;

    sget v8, Lr81/c;->e:I

    or-int/lit8 v8, v8, 0x30

    sget v9, Lr81/a;->a:I

    shl-int/lit8 v9, v9, 0x6

    or-int/2addr v8, v9

    invoke-virtual {v5, v4, v7, p0, v8}, Lr81/a;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v6, v6, v3, p0}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    goto :goto_2

    :cond_5
    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_7

    new-instance v0, Lzc1/w8;

    const/16 v1, 0xa

    invoke-direct {v0, p1, v1}, Lzc1/w8;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final e(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/h9;->d(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Ly81/i;)Li2/t;
    .locals 1

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lgb1/b0;->N0()Li2/t;

    move-result-object p0

    return-object p0
.end method
