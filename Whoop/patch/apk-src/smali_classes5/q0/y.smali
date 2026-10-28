.class public abstract Lq0/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/x2;


# instance fields
.field public final A:Lo0/w;

.field public B:J

.field public final C:Lp0/h0;

.field public final D:Lp1/c1;

.field public final E:Lp1/c1;

.field public final F:Lp1/k1;

.field public final G:Lp1/k1;

.field public final H:Lp1/k1;

.field public final I:Lp1/k1;

.field public a:Z

.field public b:Lq0/q;

.field public final c:Lp1/k1;

.field public final d:Ll9/o;

.field public e:I

.field public f:I

.field public g:J

.field public h:J

.field public i:F

.field public j:F

.field public final k:Lh0/d0;

.field public final l:Z

.field public m:I

.field public n:Lp0/j0;

.field public o:Z

.field public final p:Lp1/k1;

.field public q:Ly3/c;

.field public final r:Lj0/j;

.field public final s:Lp1/h1;

.field public final t:Lp1/h1;

.field public final u:Lp1/f0;

.field public final v:Lp1/f0;

.field public final w:Lp0/l0;

.field public final x:Laj/d;

.field public final y:Lp0/d;

.field public final z:Lp1/k1;


# direct methods
.method public constructor <init>(IF)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    float-to-double v0, p2

    const-wide/high16 v2, -0x4020000000000000L    # -0.5

    cmpg-double v2, v2, v0

    if-gtz v2, :cond_0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "currentPageOffsetFraction "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " is not within the range -0.5 to 0.5"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_0
    new-instance v0, Lh2/b;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lh2/b;-><init>(J)V

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lq0/y;->c:Lp1/k1;

    new-instance v0, Ll9/o;

    invoke-direct {v0, p1, p2, p0}, Ll9/o;-><init>(IFLq0/y;)V

    iput-object v0, p0, Lq0/y;->d:Ll9/o;

    iput p1, p0, Lq0/y;->e:I

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lq0/y;->g:J

    new-instance p2, Lq0/u;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lq0/u;-><init>(Lq0/y;I)V

    new-instance v0, Lh0/d0;

    invoke-direct {v0, p2}, Lh0/d0;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lq0/y;->k:Lh0/d0;

    const/4 p2, 0x1

    iput-boolean p2, p0, Lq0/y;->l:Z

    const/4 p2, -0x1

    iput p2, p0, Lq0/y;->m:I

    sget-object v0, Lq0/c0;->b:Lq0/q;

    sget-object v1, Lp1/v0;->y:Lp1/v0;

    new-instance v2, Lp1/k1;

    invoke-direct {v2, v0, v1}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    iput-object v2, p0, Lq0/y;->p:Lp1/k1;

    sget-object v0, Lq0/c0;->c:Lq0/b0;

    iput-object v0, p0, Lq0/y;->q:Ly3/c;

    new-instance v0, Lj0/j;

    invoke-direct {v0}, Lj0/j;-><init>()V

    iput-object v0, p0, Lq0/y;->r:Lj0/j;

    new-instance v0, Lp1/h1;

    invoke-direct {v0, p2}, Lp1/h1;-><init>(I)V

    iput-object v0, p0, Lq0/y;->s:Lp1/h1;

    new-instance p2, Lp1/h1;

    invoke-direct {p2, p1}, Lp1/h1;-><init>(I)V

    iput-object p2, p0, Lq0/y;->t:Lp1/h1;

    sget-object p1, Lp1/v0;->F:Lp1/v0;

    new-instance p2, Lq0/c;

    const/4 v0, 0x2

    invoke-direct {p2, p0, v0}, Lq0/c;-><init>(Lq0/y;I)V

    invoke-static {p2, p1}, Lp1/x;->s(Lc93/a;Lp1/o2;)Lp1/f0;

    move-result-object p2

    iput-object p2, p0, Lq0/y;->u:Lp1/f0;

    new-instance p2, Lq0/c;

    const/4 v0, 0x3

    invoke-direct {p2, p0, v0}, Lq0/c;-><init>(Lq0/y;I)V

    invoke-static {p2, p1}, Lp1/x;->s(Lc93/a;Lp1/o2;)Lp1/f0;

    move-result-object p1

    iput-object p1, p0, Lq0/y;->v:Lp1/f0;

    new-instance p1, Lp0/l0;

    new-instance p2, Lq0/u;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Lq0/u;-><init>(Lq0/y;I)V

    invoke-direct {p1, p2}, Lp0/l0;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Lq0/y;->w:Lp0/l0;

    new-instance p1, Laj/d;

    const/16 p2, 0x16

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Laj/d;-><init>(IZ)V

    iput-object p1, p0, Lq0/y;->x:Laj/d;

    new-instance p1, Lp0/d;

    invoke-direct {p1}, Lp0/d;-><init>()V

    iput-object p1, p0, Lq0/y;->y:Lp0/d;

    const/4 p1, 0x0

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lq0/y;->z:Lp1/k1;

    new-instance p1, Lo0/w;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lo0/w;-><init>(Lh0/x2;I)V

    iput-object p1, p0, Lq0/y;->A:Lo0/w;

    const/16 p1, 0xf

    const/4 p2, 0x0

    invoke-static {p2, p2, p1}, Ly3/b;->b(III)J

    move-result-wide p1

    iput-wide p1, p0, Lq0/y;->B:J

    new-instance p1, Lp0/h0;

    invoke-direct {p1}, Lp0/h0;-><init>()V

    iput-object p1, p0, Lq0/y;->C:Lp0/h0;

    invoke-static {}, Ldt/b;->j()Lp1/c1;

    move-result-object p1

    iput-object p1, p0, Lq0/y;->D:Lp1/c1;

    invoke-static {}, Ldt/b;->j()Lp1/c1;

    move-result-object p1

    iput-object p1, p0, Lq0/y;->E:Lp1/c1;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Lq0/y;->F:Lp1/k1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Lq0/y;->G:Lp1/k1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Lq0/y;->H:Lp1/k1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lq0/y;->I:Lp1/k1;

    return-void
.end method

.method public static synthetic g(Lq0/y;ILd0/e2;Lq83/d;I)Ljava/lang/Object;
    .locals 1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p2, 0x7

    const/4 p4, 0x0

    const/4 v0, 0x0

    invoke-static {p4, p4, p2, v0}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lq0/y;->f(ILd0/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static i(ZLq0/q;)I
    .locals 1

    iget-object v0, p1, Lq0/q;->a:Ljava/util/List;

    iget p1, p1, Lq0/q;->h:I

    if-eqz p0, :cond_1

    add-int/lit8 p1, p1, 0x1

    if-gez p1, :cond_0

    const p0, 0x7fffffff

    return p0

    :cond_0
    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lq0/d;

    iget p0, p0, Lq0/d;->a:I

    add-int/2addr p0, p1

    return p0

    :cond_1
    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lq0/d;

    iget p0, p0, Lq0/d;->a:I

    sub-int/2addr p0, p1

    add-int/lit8 p0, p0, -0x1

    return p0
.end method

.method public static u(Lq0/y;Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lq0/x;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lq0/x;

    iget v1, v0, Lq0/x;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lq0/x;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lq0/x;

    invoke-direct {v0, p0, p3}, Lq0/x;-><init>(Lq0/y;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lq0/x;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lq0/x;->F:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, Lq0/x;->w:Lq0/y;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lq0/x;->y:Ls83/i;

    move-object p2, p0

    check-cast p2, Lc93/m;

    iget-object p1, v0, Lq0/x;->x:Lf0/z0;

    iget-object p0, v0, Lq0/x;->w:Lq0/y;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lq0/x;->w:Lq0/y;

    iput-object p1, v0, Lq0/x;->x:Lf0/z0;

    move-object p3, p2

    check-cast p3, Ls83/i;

    iput-object p3, v0, Lq0/x;->y:Ls83/i;

    iput v5, v0, Lq0/x;->F:I

    iget-object p3, p0, Lq0/y;->y:Lp0/d;

    invoke-virtual {p3, v0}, Lp0/d;->j(Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_1

    :cond_4
    move-object p3, v3

    :goto_1
    if-ne p3, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    iget-object p3, p0, Lq0/y;->k:Lh0/d0;

    invoke-virtual {p3}, Lh0/d0;->b()Z

    move-result p3

    if-nez p3, :cond_6

    invoke-virtual {p0}, Lq0/y;->k()I

    move-result p3

    iget-object v2, p0, Lq0/y;->t:Lp1/h1;

    invoke-virtual {v2, p3}, Lp1/h1;->y(I)V

    :cond_6
    iget-object p3, p0, Lq0/y;->k:Lh0/d0;

    iput-object p0, v0, Lq0/x;->w:Lq0/y;

    const/4 v2, 0x0

    iput-object v2, v0, Lq0/x;->x:Lf0/z0;

    iput-object v2, v0, Lq0/x;->y:Ls83/i;

    iput v4, v0, Lq0/x;->F:I

    invoke-virtual {p3, p1, p2, v0}, Lh0/d0;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    const/4 p1, -0x1

    iget-object p0, p0, Lq0/y;->s:Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-object v3
.end method

.method public static v(Lq0/y;ILs83/i;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lg1/j5;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, p1, v1, v2}, Lg1/j5;-><init>(Ljava/lang/Object;ILq83/d;I)V

    sget-object p1, Lf0/z0;->w:Lf0/z0;

    invoke-virtual {p0, p1, v0, p2}, Lq0/y;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lq0/y;->u(Lq0/y;Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lq0/y;->k:Lh0/d0;

    invoke-virtual {v0}, Lh0/d0;->b()Z

    move-result v0

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, Lq0/y;->G:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lq0/y;->F:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final e(F)F
    .locals 1

    iget-object v0, p0, Lq0/y;->k:Lh0/d0;

    invoke-virtual {v0, p1}, Lh0/d0;->e(F)F

    move-result p1

    return p1
.end method

.method public final f(ILd0/l;Lq83/d;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p3, Lq0/v;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lq0/v;

    iget v1, v0, Lq0/v;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lq0/v;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lq0/v;

    invoke-direct {v0, p0, p3}, Lq0/v;-><init>(Lq0/y;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lq0/v;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lq0/v;->E:I

    const/4 v3, 0x0

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lq0/v;->w:I

    iget-object p2, v0, Lq0/v;->x:Ld0/l;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_3
    move-object v10, p2

    goto :goto_3

    :cond_4
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lq0/y;->k()I

    move-result p3

    if-ne p1, p3, :cond_5

    iget-object p3, p0, Lq0/y;->d:Ll9/o;

    iget-object p3, p3, Ll9/o;->d:Ljava/lang/Object;

    check-cast p3, Lp1/g1;

    invoke-virtual {p3}, Lp1/g1;->x()F

    move-result p3

    cmpg-float p3, p3, v3

    if-nez p3, :cond_5

    :goto_1
    move-object v7, p0

    goto :goto_6

    :cond_5
    invoke-virtual {p0}, Lq0/y;->m()I

    move-result p3

    if-nez p3, :cond_6

    goto :goto_1

    :cond_6
    iput-object p2, v0, Lq0/v;->x:Ld0/l;

    iput p1, v0, Lq0/v;->w:I

    iput v6, v0, Lq0/v;->E:I

    iget-object p3, p0, Lq0/y;->y:Lp0/d;

    invoke-virtual {p3, v0}, Lp0/d;->j(Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_7

    goto :goto_2

    :cond_7
    move-object p3, v4

    :goto_2
    if-ne p3, v1, :cond_3

    move-object v7, p0

    goto :goto_5

    :goto_3
    float-to-double p2, v3

    const-wide/high16 v6, -0x4020000000000000L    # -0.5

    cmpg-double v2, v6, p2

    if-gtz v2, :cond_8

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    cmpg-double p2, p2, v6

    if-gtz p2, :cond_8

    goto :goto_4

    :cond_8
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "pageOffsetFraction "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p3, " is not within the range -0.5 to 0.5"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_4
    invoke-virtual {p0, p1}, Lq0/y;->j(I)I

    move-result v8

    invoke-virtual {p0}, Lq0/y;->o()I

    move-result p1

    int-to-float p1, p1

    mul-float v9, v3, p1

    new-instance v6, Lq0/w;

    const/4 v11, 0x0

    move-object v7, p0

    invoke-direct/range {v6 .. v11}, Lq0/w;-><init>(Lq0/y;IFLd0/l;Lq83/d;)V

    const/4 p1, 0x0

    iput-object p1, v0, Lq0/v;->x:Ld0/l;

    iput v5, v0, Lq0/v;->E:I

    sget-object p1, Lf0/z0;->w:Lf0/z0;

    invoke-virtual {p0, p1, v6, v0}, Lq0/y;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_5
    return-object v1

    :cond_9
    :goto_6
    return-object v4
.end method

.method public final h(Lq0/q;ZZ)V
    .locals 10

    iget-object v0, p1, Lq0/q;->a:Ljava/util/List;

    iget v1, p1, Lq0/q;->l:I

    iget-object v2, p1, Lq0/q;->i:Lq0/d;

    iget-object v3, p1, Lq0/q;->j:Lq0/d;

    iget v4, p1, Lq0/q;->k:F

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    iget-object v6, p0, Lq0/y;->w:Lp0/l0;

    iput v5, v6, Lp0/l0;->e:I

    if-nez p2, :cond_0

    iget-boolean v5, p0, Lq0/y;->a:Z

    if-eqz v5, :cond_0

    iput-object p1, p0, Lq0/y;->b:Lq0/q;

    return-void

    :cond_0
    const/4 v5, 0x1

    if-eqz p2, :cond_1

    iput-boolean v5, p0, Lq0/y;->a:Z

    :cond_1
    iget-object p2, p0, Lq0/y;->d:Ll9/o;

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz p3, :cond_2

    iget-object p2, p2, Ll9/o;->d:Ljava/lang/Object;

    check-cast p2, Lp1/g1;

    invoke-virtual {p2, v4}, Lp1/g1;->y(F)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v3, :cond_3

    iget-object p3, v3, Lq0/d;->d:Ljava/lang/Object;

    goto :goto_0

    :cond_3
    move-object p3, v6

    :goto_0
    iput-object p3, p2, Ll9/o;->e:Ljava/lang/Object;

    iget-boolean p3, p2, Ll9/o;->a:Z

    if-nez p3, :cond_4

    move-object p3, v0

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_6

    :cond_4
    iput-boolean v5, p2, Ll9/o;->a:Z

    if-eqz v3, :cond_5

    iget p3, v3, Lq0/d;->a:I

    goto :goto_1

    :cond_5
    move p3, v7

    :goto_1
    iget-object v3, p2, Ll9/o;->c:Ljava/lang/Object;

    check-cast v3, Lp1/h1;

    invoke-virtual {v3, p3}, Lp1/h1;->y(I)V

    iget-object v3, p2, Ll9/o;->f:Ljava/lang/Object;

    check-cast v3, Lp0/f0;

    invoke-virtual {v3, p3}, Lp0/f0;->a(I)V

    iget-object p2, p2, Ll9/o;->d:Ljava/lang/Object;

    check-cast p2, Lp1/g1;

    invoke-virtual {p2, v4}, Lp1/g1;->y(F)V

    :cond_6
    iget p2, p0, Lq0/y;->m:I

    const/4 p3, -0x1

    if-eq p2, p3, :cond_8

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_8

    iget-boolean p2, p0, Lq0/y;->o:Z

    invoke-static {p2, p1}, Lq0/y;->i(ZLq0/q;)I

    move-result p2

    iget v0, p0, Lq0/y;->m:I

    if-eq v0, p2, :cond_8

    iput p3, p0, Lq0/y;->m:I

    iget-object p2, p0, Lq0/y;->n:Lp0/j0;

    if-eqz p2, :cond_7

    invoke-interface {p2}, Lp0/j0;->cancel()V

    :cond_7
    iput-object v6, p0, Lq0/y;->n:Lp0/j0;

    :cond_8
    :goto_2
    iget-object p2, p0, Lq0/y;->p:Lp1/k1;

    invoke-virtual {p2, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-boolean p2, p1, Lq0/q;->m:Z

    iget-object p3, p0, Lq0/y;->F:Lp1/k1;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p3, p2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    if-eqz v2, :cond_9

    iget p2, v2, Lq0/d;->a:I

    goto :goto_3

    :cond_9
    move p2, v7

    :goto_3
    if-nez p2, :cond_b

    if-eqz v1, :cond_a

    goto :goto_4

    :cond_a
    move p2, v7

    goto :goto_5

    :cond_b
    :goto_4
    move p2, v5

    :goto_5
    iget-object p3, p0, Lq0/y;->G:Lp1/k1;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p3, p2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    if-eqz v2, :cond_c

    iget p2, v2, Lq0/d;->a:I

    iput p2, p0, Lq0/y;->e:I

    :cond_c
    iput v1, p0, Lq0/y;->f:I

    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object p2

    if-eqz p2, :cond_d

    invoke-virtual {p2}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v6

    :cond_d
    invoke-static {p2}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object p3

    :try_start_0
    iget-boolean v0, p0, Lq0/y;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v1, 0x20

    const-wide v2, 0xffffffffL

    if-nez v0, :cond_e

    :goto_6
    invoke-static {p2, p3, v6}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    :cond_e
    :try_start_1
    iget v0, p1, Lq0/q;->h:I

    invoke-virtual {p0}, Lq0/y;->m()I

    move-result v4

    if-lt v0, v4, :cond_f

    goto :goto_6

    :cond_f
    iget v0, p0, Lq0/y;->j:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v4, 0x3f000000    # 0.5f

    cmpg-float v0, v0, v4

    if-gtz v0, :cond_10

    goto :goto_6

    :cond_10
    iget v0, p0, Lq0/y;->j:F

    invoke-virtual {p0}, Lq0/y;->l()Lq0/q;

    move-result-object v4

    iget-object v4, v4, Lq0/q;->e:Lh0/d2;

    sget-object v8, Lh0/d2;->w:Lh0/d2;

    if-ne v4, v8, :cond_11

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    invoke-virtual {p0}, Lq0/y;->r()J

    move-result-wide v8

    and-long/2addr v8, v2

    long-to-int v4, v8

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    neg-float v4, v4

    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    move-result v4

    cmpg-float v0, v0, v4

    if-nez v0, :cond_12

    goto :goto_7

    :cond_11
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    invoke-virtual {p0}, Lq0/y;->r()J

    move-result-wide v8

    shr-long/2addr v8, v1

    long-to-int v4, v8

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    neg-float v4, v4

    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    move-result v4

    cmpg-float v0, v0, v4

    if-nez v0, :cond_12

    goto :goto_7

    :cond_12
    invoke-virtual {p0}, Lq0/y;->s()Z

    move-result v0

    if-eqz v0, :cond_13

    goto :goto_7

    :cond_13
    move v5, v7

    :goto_7
    if-nez v5, :cond_14

    goto :goto_6

    :cond_14
    iget v0, p0, Lq0/y;->j:F

    invoke-virtual {p0, v0, p1}, Lq0/y;->t(FLq0/q;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_6

    :goto_8
    invoke-virtual {p0}, Lq0/y;->m()I

    move-result p2

    invoke-static {p1, p2}, Lq0/c0;->a(Lq0/q;I)J

    move-result-wide p2

    iput-wide p2, p0, Lq0/y;->g:J

    invoke-virtual {p0}, Lq0/y;->m()I

    iget-object p2, p1, Lq0/q;->e:Lh0/d2;

    sget-object p3, Lh0/d2;->x:Lh0/d2;

    if-ne p2, p3, :cond_15

    invoke-virtual {p1}, Lq0/q;->e()J

    move-result-wide p2

    shr-long/2addr p2, v1

    :goto_9
    long-to-int p2, p2

    goto :goto_a

    :cond_15
    invoke-virtual {p1}, Lq0/q;->e()J

    move-result-wide p2

    and-long/2addr p2, v2

    goto :goto_9

    :goto_a
    iget-object p3, p1, Lq0/q;->n:Li0/n;

    iget v0, p1, Lq0/q;->b:I

    iget v1, p1, Lq0/q;->f:I

    neg-int v1, v1

    iget p1, p1, Lq0/q;->d:I

    invoke-interface {p3, p2, v0, v1, p1}, Li0/n;->a(IIII)I

    move-result p1

    invoke-static {p1, v7, p2}, Le93/b;->n(III)I

    move-result p1

    int-to-long p1, p1

    iput-wide p1, p0, Lq0/y;->h:J

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p2, p3, v6}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw p1
.end method

.method public final j(I)I
    .locals 2

    invoke-virtual {p0}, Lq0/y;->m()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lq0/y;->m()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v1, v0}, Le93/b;->n(III)I

    move-result p1

    return p1

    :cond_0
    return v1
.end method

.method public final k()I
    .locals 1

    iget-object v0, p0, Lq0/y;->d:Ll9/o;

    iget-object v0, v0, Ll9/o;->c:Ljava/lang/Object;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    return v0
.end method

.method public final l()Lq0/q;
    .locals 1

    iget-object v0, p0, Lq0/y;->p:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq0/q;

    return-object v0
.end method

.method public abstract m()I
.end method

.method public final n()I
    .locals 1

    iget-object v0, p0, Lq0/y;->p:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq0/q;

    iget v0, v0, Lq0/q;->b:I

    return v0
.end method

.method public final o()I
    .locals 2

    invoke-virtual {p0}, Lq0/y;->n()I

    move-result v0

    iget-object v1, p0, Lq0/y;->p:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq0/q;

    iget v1, v1, Lq0/q;->c:I

    add-int/2addr v1, v0

    return v1
.end method

.method public final p()I
    .locals 1

    iget-object v0, p0, Lq0/y;->u:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final q()I
    .locals 1

    iget-object v0, p0, Lq0/y;->v:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final r()J
    .locals 2

    iget-object v0, p0, Lq0/y;->c:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/b;

    iget-wide v0, v0, Lh2/b;->a:J

    return-wide v0
.end method

.method public final s()Z
    .locals 4

    invoke-virtual {p0}, Lq0/y;->r()J

    move-result-wide v0

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    float-to-int v0, v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lq0/y;->r()J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    float-to-int v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final t(FLq0/q;)V
    .locals 9

    iget-object v0, p2, Lq0/q;->a:Ljava/util/List;

    iget-boolean v1, p0, Lq0/y;->l:Z

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    const/4 v1, 0x0

    cmpl-float v1, p1, v1

    if-lez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1, p2}, Lq0/y;->i(ZLq0/q;)I

    move-result v3

    if-ltz v3, :cond_6

    invoke-virtual {p0}, Lq0/y;->m()I

    move-result v2

    if-ge v3, v2, :cond_6

    iget v2, p0, Lq0/y;->m:I

    if-eq v3, v2, :cond_4

    iget-boolean v2, p0, Lq0/y;->o:Z

    if-eq v2, v1, :cond_2

    iget-object v2, p0, Lq0/y;->n:Lp0/j0;

    if-eqz v2, :cond_2

    invoke-interface {v2}, Lp0/j0;->cancel()V

    :cond_2
    iput-boolean v1, p0, Lq0/y;->o:Z

    iput v3, p0, Lq0/y;->m:I

    iget-wide v4, p0, Lq0/y;->B:J

    iget-object v2, p0, Lq0/y;->w:Lp0/l0;

    move-object v6, v2

    iget-object v2, v6, Lp0/l0;->c:Lb9/b;

    if-eqz v2, :cond_3

    iget-object v6, v6, Lp0/l0;->b:La3/p;

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-virtual/range {v2 .. v8}, Lb9/b;->y(IJLa3/p;ZLkotlin/jvm/functions/Function1;)Lp0/y0;

    move-result-object v2

    goto :goto_1

    :cond_3
    sget-object v2, Lp0/g;->a:Lp0/g;

    :goto_1
    iput-object v2, p0, Lq0/y;->n:Lp0/j0;

    :cond_4
    if-eqz v1, :cond_5

    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq0/d;

    iget v1, p2, Lq0/q;->b:I

    iget v2, p2, Lq0/q;->c:I

    add-int/2addr v1, v2

    iget v0, v0, Lq0/d;->k:I

    add-int/2addr v0, v1

    iget p2, p2, Lq0/q;->g:I

    sub-int/2addr v0, p2

    int-to-float p2, v0

    cmpg-float p1, p2, p1

    if-gez p1, :cond_6

    iget-object p1, p0, Lq0/y;->n:Lp0/j0;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Lp0/j0;->a()V

    return-void

    :cond_5
    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq0/d;

    iget p2, p2, Lq0/q;->f:I

    iget v0, v0, Lq0/d;->k:I

    sub-int/2addr p2, v0

    int-to-float p2, p2

    neg-float p1, p1

    cmpg-float p1, p2, p1

    if-gez p1, :cond_6

    iget-object p1, p0, Lq0/y;->n:Lp0/j0;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Lp0/j0;->a()V

    :cond_6
    :goto_2
    return-void
.end method

.method public final w(FIZ)V
    .locals 2

    iget-object v0, p0, Lq0/y;->d:Ll9/o;

    iget-object v1, v0, Ll9/o;->c:Ljava/lang/Object;

    check-cast v1, Lp1/h1;

    invoke-virtual {v1, p2}, Lp1/h1;->y(I)V

    iget-object v1, v0, Ll9/o;->f:Ljava/lang/Object;

    check-cast v1, Lp0/f0;

    invoke-virtual {v1, p2}, Lp0/f0;->a(I)V

    iget-object p2, v0, Ll9/o;->d:Ljava/lang/Object;

    check-cast p2, Lp1/g1;

    invoke-virtual {p2, p1}, Lp1/g1;->y(F)V

    const/4 p1, 0x0

    iput-object p1, v0, Ll9/o;->e:Ljava/lang/Object;

    if-eqz p3, :cond_1

    iget-object p1, p0, Lq0/y;->z:Lp1/k1;

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La3/n0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, La3/n0;->m()V

    :cond_0
    return-void

    :cond_1
    iget-object p1, p0, Lq0/y;->E:Lp1/c1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-interface {p1, p2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
