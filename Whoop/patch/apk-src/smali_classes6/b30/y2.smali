.class public final Lb30/y2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb30/y2;->w:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    check-cast p1, Lc0/o;

    check-cast p2, La30/k1;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    const-string v0, "$this$AnimatedContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p3

    check-cast v6, Lp1/q;

    const p1, -0x1973272b

    invoke-virtual {v6, p1}, Lp1/q;->e0(I)V

    iget-boolean p1, p0, Lb30/y2;->w:Z

    const/4 p3, 0x0

    if-nez p1, :cond_0

    invoke-static {v6, p3}, Lds/p;->l(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, p3}, Lp1/q;->q(Z)V

    goto/16 :goto_2

    :cond_0
    invoke-virtual {v6, p3}, Lp1/q;->q(Z)V

    instance-of p1, p2, La30/j1;

    if-eqz p1, :cond_1

    const p1, -0x14eed823

    invoke-virtual {v6, p1}, Lp1/q;->e0(I)V

    invoke-static {v6, p3}, Lds/p;->l(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, p3}, Lp1/q;->q(Z)V

    goto/16 :goto_2

    :cond_1
    instance-of p1, p2, La30/h1;

    if-eqz p1, :cond_7

    const p1, -0x14ecf328

    invoke-virtual {v6, p1}, Lp1/q;->e0(I)V

    const p1, -0x1972fada

    invoke-virtual {v6, p1}, Lp1/q;->e0(I)V

    and-int/lit8 p1, p4, 0x70

    const/16 v0, 0x30

    xor-int/2addr p1, v0

    const/16 v1, 0x20

    if-le p1, v1, :cond_2

    invoke-virtual {v6, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    and-int/lit8 p1, p4, 0x30

    if-ne p1, v1, :cond_4

    :cond_3
    const/4 p1, 0x1

    goto :goto_0

    :cond_4
    move p1, p3

    :goto_0
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    if-nez p1, :cond_5

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p4, p1, :cond_6

    :cond_5
    new-instance p4, La20/b;

    const/4 p1, 0x0

    const/16 v1, 0x8

    invoke-direct {p4, p2, p1, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v6, p4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast p4, Lc93/m;

    invoke-virtual {v6, p3}, Lp1/q;->q(Z)V

    invoke-static {v6, p4, p2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const p1, 0x7f08080b

    invoke-static {p1, v6, p3}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v1

    sget-object p1, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v6, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg1/c1;

    invoke-virtual {p1}, Lg1/c1;->e()J

    move-result-wide v4

    sget-object p1, Lb2/t;->w:Lb2/t;

    int-to-float p2, v0

    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/d;->l(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v7, 0x1b0

    const/4 v8, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v8}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, p3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_7
    if-eqz p2, :cond_9

    instance-of p1, p2, La30/i1;

    if-eqz p1, :cond_8

    goto :goto_1

    :cond_8
    const p1, -0x1973160b

    invoke-static {p1, v6, p3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p1

    throw p1

    :cond_9
    :goto_1
    const p1, -0x1972b972

    invoke-virtual {v6, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v6, p3}, Lp1/q;->q(Z)V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
