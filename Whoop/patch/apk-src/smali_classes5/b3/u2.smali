.class public abstract Lb3/u2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp1/u2;

    sget-object v1, Lb3/r2;->w:Lb3/r2;

    invoke-direct {v0, v1}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v0, Lb3/u2;->a:Lp1/u2;

    return-void
.end method

.method public static final a(Ld1/k;Lb2/y;Ls83/c;)V
    .locals 4

    instance-of v0, p2, Lb3/s2;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lb3/s2;

    iget v1, v0, Lb3/s2;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb3/s2;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb3/s2;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lb3/s2;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, v0, Lb3/s2;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p2}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p0

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p0

    check-cast p2, Lb2/v;

    iget-object p2, p2, Lb2/v;->w:Lb2/v;

    iget-boolean p2, p2, Lb2/v;->N:Z

    if-eqz p2, :cond_4

    invoke-static {p0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object p2

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p0

    iget-object p0, p0, La3/n0;->a0:Lp1/z;

    check-cast p0, Lx1/g;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lb3/u2;->a:Lp1/u2;

    invoke-static {p0, v1}, Lp1/x;->D(Lp1/p1;Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_3

    iput v2, v0, Lb3/s2;->x:I

    invoke-static {p2, p1, v0}, Lb3/u2;->b(Landroidx/compose/ui/node/Owner;Lc93/m;Ls83/c;)V

    return-void

    :cond_3
    new-instance p0, Ljava/lang/ClassCastException;

    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    throw p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "establishTextInputSession called from an unattached node"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Landroidx/compose/ui/node/Owner;Lc93/m;Ls83/c;)V
    .locals 4

    instance-of v0, p2, Lb3/t2;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lb3/t2;

    iget v1, v0, Lb3/t2;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb3/t2;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb3/t2;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lb3/t2;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, v0, Lb3/t2;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    const/4 p0, 0x2

    if-eq v1, p0, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p2}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p0

    throw p0

    :cond_2
    invoke-static {p2}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p0

    throw p0

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, v0, Lb3/t2;->x:I

    check-cast p0, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {p0, p1, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->N(Lc93/m;Ls83/c;)V

    return-void
.end method
