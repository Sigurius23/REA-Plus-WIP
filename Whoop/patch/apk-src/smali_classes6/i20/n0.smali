.class public final Li20/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Integer;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:Z

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Lg40/m3;

.field public final synthetic z:Lp1/t2;


# direct methods
.method public constructor <init>(ZLjava/util/List;Lg40/m3;Lp1/c1;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Li20/n0;->w:Z

    iput-object p2, p0, Li20/n0;->x:Ljava/util/List;

    iput-object p3, p0, Li20/n0;->y:Lg40/m3;

    iput-object p4, p0, Li20/n0;->z:Lp1/t2;

    iput-object p5, p0, Li20/n0;->E:Ljava/lang/Integer;

    iput-object p6, p0, Li20/n0;->F:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    check-cast p1, Ll0/k1;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    const-string v0, "paddingValues"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    move-object v0, p2

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 p3, p3, 0x13

    const/16 v0, 0x12

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-ne p3, v0, :cond_3

    move-object p3, p2

    check-cast p3, Lp1/q;

    invoke-virtual {p3}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p3}, Lp1/q;->X()V

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lp1/q;

    const p3, -0x5f3d3998

    invoke-virtual {p2, p3}, Lp1/q;->e0(I)V

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p3, v0, :cond_4

    invoke-static {p2}, Lte0/d;->h(Lp1/q;)Lg2/s;

    move-result-object p3

    :cond_4
    move-object v6, p3

    check-cast v6, Lg2/s;

    const p3, -0x5f3d3199

    const/4 v2, 0x0

    invoke-static {p3, p2, v2}, Lr;->h(ILp1/q;Z)Ljava/lang/Object;

    move-result-object p3

    const/4 v10, 0x0

    if-ne p3, v0, :cond_5

    new-instance p3, Li20/m0;

    const/4 v0, 0x0

    invoke-direct {p3, v6, v10, v0}, Li20/m0;-><init>(Lg2/s;Lq83/d;I)V

    invoke-virtual {p2, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast p3, Lc93/m;

    invoke-virtual {p2, v2}, Lp1/q;->q(Z)V

    invoke-static {p2, p3, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p3, Lb2/t;->w:Lb2/t;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    invoke-static {v0, p3}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    invoke-static {p3}, Ll0/f;->n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    invoke-static {p1, p3}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    new-instance v2, Lg1/g4;

    iget-object v8, p0, Li20/n0;->E:Ljava/lang/Integer;

    iget-object v9, p0, Li20/n0;->F:Lkotlin/jvm/functions/Function1;

    iget-boolean v3, p0, Li20/n0;->w:Z

    iget-object v4, p0, Li20/n0;->x:Ljava/util/List;

    iget-object v5, p0, Li20/n0;->y:Lg40/m3;

    iget-object v7, p0, Li20/n0;->z:Lp1/t2;

    invoke-direct/range {v2 .. v9}, Lg1/g4;-><init>(ZLjava/util/List;Lg40/m3;Lg2/s;Lp1/t2;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V

    const p3, 0x2ee68615

    invoke-static {p3, p2, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p3

    const/16 v0, 0x180

    invoke-static {p1, v10, p3, p2, v0}, Li20/l1;->j(Landroidx/compose/ui/Modifier;Lb2/f;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    return-object v1
.end method
