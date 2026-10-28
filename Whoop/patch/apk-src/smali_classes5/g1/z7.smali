.class public final Lg1/z7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:F

.field public final synthetic x:Lx1/b;

.field public final synthetic y:Lc93/m;

.field public final synthetic z:Lx1/b;


# direct methods
.method public constructor <init>(FLx1/b;Lc93/m;Lx1/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg1/z7;->w:F

    iput-object p2, p0, Lg1/z7;->x:Lx1/b;

    iput-object p3, p0, Lg1/z7;->y:Lc93/m;

    iput-object p4, p0, Lg1/z7;->z:Lx1/b;

    iput p5, p0, Lg1/z7;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x2

    if-eq v3, v6, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    and-int/2addr v2, v4

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-static {v5, v1, v4}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v3, v7, :cond_1

    invoke-static {v1}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v3, Lbc3/c0;

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_2

    if-ne v9, v7, :cond_3

    :cond_2
    new-instance v9, Lg1/k5;

    invoke-direct {v9, v3, v2}, Lg1/k5;-><init>(Lbc3/c0;Lf0/r1;)V

    invoke-virtual {v1, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v14, v9

    check-cast v14, Lg1/k5;

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, Lb2/e;->z:Lb2/m;

    invoke-static {v3, v8, v5, v6}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3, v2, v4, v5}, Lq83/g;->V(Landroidx/compose/ui/Modifier;Lf0/r1;ZZ)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v3, Lqc1/a;

    const/16 v4, 0xc

    invoke-direct {v3, v4}, Lqc1/a;-><init>(I)V

    invoke-static {v2, v5, v3}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->s(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    iget v3, v0, Lg1/z7;->w:F

    invoke-virtual {v1, v3}, Lp1/q;->d(F)Z

    move-result v3

    iget-object v12, v0, Lg1/z7;->x:Lx1/b;

    invoke-virtual {v1, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Lg1/z7;->y:Lc93/m;

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Lg1/z7;->z:Lx1/b;

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v3, v6

    invoke-virtual {v1, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v3, v6

    iget v6, v0, Lg1/z7;->E:I

    invoke-virtual {v1, v6}, Lp1/q;->e(I)Z

    move-result v6

    or-int/2addr v3, v6

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_4

    if-ne v6, v7, :cond_5

    :cond_4
    new-instance v10, Lci0/c;

    iget v11, v0, Lg1/z7;->w:F

    iget-object v13, v0, Lg1/z7;->y:Lc93/m;

    iget v15, v0, Lg1/z7;->E:I

    move-object/from16 v16, v4

    invoke-direct/range {v10 .. v16}, Lci0/c;-><init>(FLx1/b;Lc93/m;Lg1/k5;ILx1/b;)V

    invoke-virtual {v1, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v10

    :cond_5
    check-cast v6, Lc93/m;

    invoke-static {v2, v6, v1, v5, v5}, Ly2/q1;->b(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_6
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
