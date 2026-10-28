.class public final Lh0/k;
.super Lh0/f1;
.source "SourceFile"


# instance fields
.field public Z:Lh0/p;

.field public a0:Lh0/d2;

.field public b0:Lh0/o1;

.field public c0:Lh0/o1;

.field public d0:Ly3/c;


# direct methods
.method public constructor <init>(Lh0/p;ZLj0/i;Lh0/o1;)V
    .locals 2

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    sget-object v1, Landroidx/compose/foundation/gestures/a;->a:Lgm1/b;

    invoke-direct {p0, v1, p2, p3, v0}, Lh0/f1;-><init>(Lkotlin/jvm/functions/Function1;ZLj0/i;Lh0/d2;)V

    iput-object p1, p0, Lh0/k;->Z:Lh0/p;

    iput-object v0, p0, Lh0/k;->a0:Lh0/d2;

    iput-object p4, p0, Lh0/k;->b0:Lh0/o1;

    return-void
.end method

.method public static final j1(Lh0/k;FLs83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lh0/h;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh0/h;

    iget v1, v0, Lh0/h;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/h;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/h;

    invoke-direct {v0, p0, p2}, Lh0/h;-><init>(Lh0/k;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lh0/h;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/h;->z:I

    const/4 v3, 0x2

    if-eqz v2, :cond_3

    const/4 p0, 0x1

    if-eq v2, p0, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lh0/h;->w:Lkotlin/jvm/internal/d0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lh0/k;->Z:Lh0/p;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Lkotlin/jvm/internal/d0;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput p1, p2, Lkotlin/jvm/internal/d0;->w:F

    iget-object v2, p0, Lh0/k;->Z:Lh0/p;

    new-instance v4, Lh0/j;

    const/4 v5, 0x0

    invoke-direct {v4, p0, p2, p1, v5}, Lh0/j;-><init>(Lh0/k;Lkotlin/jvm/internal/d0;FLq83/d;)V

    iput-object p2, v0, Lh0/h;->w:Lkotlin/jvm/internal/d0;

    iput v3, v0, Lh0/h;->z:I

    invoke-static {v2, v4, v0}, Lh0/p;->b(Lh0/p;Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_4

    return-object v1

    :cond_4
    move-object p0, p2

    :goto_1
    iget p0, p0, Lkotlin/jvm/internal/d0;->w:F

    new-instance p1, Ljava/lang/Float;

    invoke-direct {p1, p0}, Ljava/lang/Float;-><init>(F)V

    return-object p1
.end method


# virtual methods
.method public final P0()V
    .locals 1

    iget-object v0, p0, Lh0/k;->b0:Lh0/o1;

    invoke-virtual {p0, v0}, Lh0/k;->m1(Lh0/o1;)V

    return-void
.end method

.method public final c()V
    .locals 2

    invoke-virtual {p0}, Lh0/f1;->b0()V

    iget-boolean v0, p0, Lb2/v;->N:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    iget-object v0, v0, La3/n0;->X:Ly3/c;

    iget-object v1, p0, Lh0/k;->d0:Ly3/c;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    iput-object v0, p0, Lh0/k;->d0:Ly3/c;

    iget-object v0, p0, Lh0/k;->b0:Lh0/o1;

    invoke-virtual {p0, v0}, Lh0/k;->m1(Lh0/o1;)V

    :cond_1
    return-void
.end method

.method public final e1(Lh0/e1;Lh0/e1;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lh0/k;->Z:Lh0/p;

    new-instance v1, Lbe/d;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lbe/d;-><init>(Lh0/e1;Lh0/k;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lh0/p;->b(Lh0/p;Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final f1(J)V
    .locals 0

    return-void
.end method

.method public final g1(J)V
    .locals 7

    iget-boolean v0, p0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v0

    new-instance v1, Lb4/i;

    const/4 v6, 0x2

    const/4 v5, 0x0

    move-object v2, p0

    move-wide v3, p1

    invoke-direct/range {v1 .. v6}, Lb4/i;-><init>(Ljava/lang/Object;JLq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v0, v5, v5, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final h1()Z
    .locals 1

    iget-object v0, p0, Lh0/k;->Z:Lh0/p;

    iget-object v0, v0, Lh0/p;->h:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final k1()Z
    .locals 2

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    iget-object v0, v0, La3/n0;->Y:Ly3/m;

    sget-object v1, Ly3/m;->x:Ly3/m;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lh0/k;->a0:Lh0/d2;

    sget-object v1, Lh0/d2;->x:Lh0/d2;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final l1(Lh0/p;ZLj0/i;Lh0/o1;)V
    .locals 6

    sget-object v4, Lh0/d2;->w:Lh0/d2;

    iput-object p4, p0, Lh0/k;->b0:Lh0/o1;

    iget-object v0, p0, Lh0/k;->Z:Lh0/p;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-object p1, p0, Lh0/k;->Z:Lh0/p;

    invoke-virtual {p0, p4}, Lh0/k;->m1(Lh0/o1;)V

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object p4, p0, Lh0/k;->a0:Lh0/d2;

    if-eq p4, v4, :cond_1

    iput-object v4, p0, Lh0/k;->a0:Lh0/d2;

    move v5, v1

    goto :goto_1

    :cond_1
    move v5, p1

    :goto_1
    iget-object v1, p0, Lh0/f1;->R:Lkotlin/jvm/functions/Function1;

    move-object v0, p0

    move v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lh0/f1;->i1(Lkotlin/jvm/functions/Function1;ZLj0/i;Lh0/d2;Z)V

    return-void
.end method

.method public final m1(Lh0/o1;)V
    .locals 5

    if-nez p1, :cond_0

    sget-object p1, Lh0/b;->a:Ld0/e2;

    sget-object v0, Lh0/b;->b:Lgo1/a;

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v1

    iget-object v1, v1, La3/n0;->X:Ly3/c;

    iput-object v1, p0, Lh0/k;->d0:Ly3/c;

    iget-object v2, p0, Lh0/k;->Z:Lh0/p;

    new-instance v3, Lg1/r0;

    const/4 v4, 0x2

    invoke-direct {v3, v4, v1}, Lg1/r0;-><init>(ILy3/c;)V

    new-instance v1, Lh0/c;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v0, v3, v4}, Lh0/c;-><init>(Ljava/lang/Object;Ll83/e;Ljava/lang/Object;I)V

    invoke-static {v1, p1}, Li0/k;->e(Lh0/c;Ld0/l;)Li0/g;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lh0/k;->c0:Lh0/o1;

    return-void
.end method
