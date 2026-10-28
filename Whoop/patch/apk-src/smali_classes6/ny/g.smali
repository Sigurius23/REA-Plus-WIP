.class public final Lny/g;
.super Lx30/g1;
.source "SourceFile"


# instance fields
.field public final c:Lb30/m;

.field public final d:Ljava/util/List;


# direct methods
.method public constructor <init>(Lb30/m;Ln83/c;)V
    .locals 2

    const-string v0, "tapToAddHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "elements"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lny/f;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lx30/g1;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Z)V

    iput-object p1, p0, Lny/g;->c:Lb30/m;

    iput-object p2, p0, Lny/g;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final e()Lec3/f2;
    .locals 3

    iget-object v0, p0, Lny/g;->c:Lb30/m;

    iget-object v0, v0, Lb30/m;->F:Ljava/lang/Object;

    check-cast v0, Lec3/r1;

    new-instance v1, Lno0/e0;

    const/4 v2, 0x7

    invoke-direct {v1, p0, v2}, Lno0/e0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v1}, Lbi/g;->y(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v0

    return-object v0
.end method

.method public final g(ZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    const-string v0, "hiddenIdentifiers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p4

    check-cast v6, Lp1/q;

    const v0, 0x6d179e0b

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    iget-object v0, p0, Lny/g;->c:Lb30/m;

    iget-object v0, v0, Lb30/m;->F:Ljava/lang/Object;

    check-cast v0, Lec3/r1;

    const/4 v11, 0x0

    invoke-static {v0, v6, v11}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lh20/l;

    const v0, -0xef81ad8

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    if-nez v1, :cond_0

    const/4 v0, 0x0

    move-object v8, v6

    goto :goto_0

    :cond_0
    const/16 v9, 0x1b0

    const/16 v10, 0x78

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v8, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v10}, Lse/a;->n(Lh20/l;ZZLandroidx/compose/ui/Modifier;Lh20/g1;Lc93/a;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_0
    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    if-nez v0, :cond_3

    const v0, -0x2eb6f771

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_2

    :cond_1
    new-instance v1, Lnr0/e;

    const/4 v0, 0x5

    invoke-direct {v1, p0, v0}, Lnr0/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lc93/a;

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    and-int/lit8 v0, p5, 0xe

    invoke-static {p1, v1, v8, v0}, Lse/g;->i(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    const/16 v0, 0x18

    int-to-float v0, v0

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->k(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v8, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v2, 0x7f14104b

    invoke-static {v8, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v8, v11}, Lug/m;->i(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->k(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v8, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    shr-int/lit8 v0, p5, 0x3

    and-int/lit8 v0, v0, 0xe

    shl-int/lit8 v1, p5, 0x3

    and-int/lit8 v2, v1, 0x70

    or-int/2addr v0, v2

    sget v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v2, v2, 0x9

    or-int/2addr v0, v2

    and-int/lit16 v1, v1, 0x1c00

    or-int v7, v0, v1

    move-object v6, v8

    const/16 v8, 0x10

    iget-object v3, p0, Lny/g;->d:Ljava/util/List;

    const/4 v5, 0x0

    move v2, p1

    move-object v1, p2

    move-object v4, p3

    invoke-static/range {v1 .. v8}, Ls4/l;->b(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v6

    :cond_3
    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    return-void
.end method
