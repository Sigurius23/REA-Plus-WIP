.class public final Lg40/f3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/m3;


# instance fields
.field public final a:Lg40/l3;

.field public final b:Ljava/lang/String;

.field public final c:Lkotlin/jvm/functions/Function1;

.field public final d:Lec3/f2;

.field public final e:I

.field public final f:I

.field public final g:Lec3/r1;

.field public final h:Z

.field public final i:Lec3/h2;

.field public final j:Ly3/m;

.field public final k:Lc2/n;

.field public final l:Lec3/h2;

.field public final m:Lec3/h2;

.field public final n:Lec3/r1;

.field public final o:Ln53/e;

.field public final p:Lec3/h2;

.field public final q:Lec3/r1;

.field public final r:Lec3/f2;

.field public final s:Lec3/h2;

.field public final t:Lec3/h2;

.field public final u:Ln53/e;

.field public final v:Ln53/e;

.field public final w:Ln53/e;

.field public final x:Ln53/e;


# direct methods
.method public synthetic constructor <init>(Lg40/l3;Ljava/lang/String;Ldo0/c;I)V
    .locals 2

    and-int/lit8 v0, p4, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p2, v1

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v1

    .line 1
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lg40/f3;-><init>(Lg40/l3;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public constructor <init>(Lg40/l3;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lg40/f3;->a:Lg40/l3;

    .line 4
    iput-object p2, p0, Lg40/f3;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lg40/f3;->c:Lkotlin/jvm/functions/Function1;

    .line 6
    invoke-interface {p1}, Lg40/l3;->a()Lec3/f2;

    move-result-object p3

    iput-object p3, p0, Lg40/f3;->d:Lec3/f2;

    .line 7
    invoke-interface {p1}, Lg40/l3;->h()I

    move-result p3

    iput p3, p0, Lg40/f3;->e:I

    .line 8
    invoke-interface {p1}, Lg40/l3;->n()I

    move-result p3

    iput p3, p0, Lg40/f3;->f:I

    .line 9
    invoke-interface {p1}, Lg40/l3;->d()Lq3/g0;

    move-result-object p3

    if-nez p3, :cond_0

    sget-object p3, Lq3/f0;->w:Lg40/h2;

    .line 10
    :cond_0
    invoke-static {p3}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p3

    iput-object p3, p0, Lg40/f3;->g:Lec3/r1;

    .line 11
    invoke-interface {p1}, Lg40/l3;->l()Z

    move-result p3

    iput-boolean p3, p0, Lg40/f3;->h:Z

    .line 12
    invoke-interface {p1}, Lg40/l3;->getLabel()Lzy/c;

    move-result-object p3

    invoke-static {p3}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p3

    iput-object p3, p0, Lg40/f3;->i:Lec3/h2;

    .line 13
    invoke-interface {p1}, Lg40/l3;->getLayoutDirection()Ly3/m;

    move-result-object p3

    iput-object p3, p0, Lg40/f3;->j:Ly3/m;

    .line 14
    instance-of p3, p1, Lg40/j0;

    if-eqz p3, :cond_1

    sget-object p3, Lc2/n;->J:Lc2/n;

    goto :goto_0

    .line 15
    :cond_1
    instance-of p3, p1, Lg40/r2;

    if-eqz p3, :cond_2

    sget-object p3, Lc2/n;->G:Lc2/n;

    goto :goto_0

    .line 16
    :cond_2
    instance-of p3, p1, Lg40/z0;

    if-eqz p3, :cond_3

    sget-object p3, Lc2/n;->w:Lc2/n;

    goto :goto_0

    .line 17
    :cond_3
    instance-of p3, p1, Lg40/l1;

    if-eqz p3, :cond_4

    sget-object p3, Lc2/n;->T:Lc2/n;

    goto :goto_0

    :cond_4
    const/4 p3, 0x0

    .line 18
    :goto_0
    iput-object p3, p0, Lg40/f3;->k:Lc2/n;

    .line 19
    invoke-interface {p1}, Lg40/l3;->e()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p3

    iput-object p3, p0, Lg40/f3;->l:Lec3/h2;

    .line 20
    const-string p3, ""

    invoke-static {p3}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p3

    iput-object p3, p0, Lg40/f3;->m:Lec3/h2;

    .line 21
    invoke-static {p3}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v0

    iput-object v0, p0, Lg40/f3;->n:Lec3/r1;

    .line 22
    new-instance v0, Lg40/e3;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lg40/e3;-><init>(Lg40/f3;I)V

    invoke-static {p3, v0}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v0

    .line 23
    new-instance v1, Lg40/e3;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lg40/e3;-><init>(Lg40/f3;I)V

    invoke-static {p3, v1}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p3

    iput-object p3, p0, Lg40/f3;->o:Ln53/e;

    .line 24
    invoke-interface {p1}, Lg40/l3;->l()Z

    move-result p3

    if-eqz p3, :cond_5

    .line 25
    sget-object p3, Lg40/y3;->a:Lg40/y3;

    goto :goto_1

    .line 26
    :cond_5
    sget-object p3, Lg40/t3;->b:Lg40/t3;

    .line 27
    :goto_1
    invoke-static {p3}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p3

    iput-object p3, p0, Lg40/f3;->p:Lec3/h2;

    .line 28
    invoke-static {p3}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v1

    iput-object v1, p0, Lg40/f3;->q:Lec3/r1;

    .line 29
    invoke-interface {p1}, Lg40/l3;->getLoading()Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lg40/f3;->r:Lec3/f2;

    .line 30
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, p0, Lg40/f3;->s:Lec3/h2;

    .line 31
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lg40/f3;->t:Lec3/h2;

    .line 32
    new-instance v2, Leg2/a;

    const/16 v3, 0x1a

    invoke-direct {v2, v3}, Leg2/a;-><init>(I)V

    invoke-static {p3, p1, v1, v2}, Lbi/g;->t(Lec3/f2;Lec3/f2;Lec3/f2;Lkotlin/jvm/functions/Function3;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lg40/f3;->u:Ln53/e;

    .line 33
    new-instance v1, Lg1/w8;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lg1/w8;-><init>(I)V

    .line 34
    invoke-static {p1, p3, v1}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lg40/f3;->v:Ln53/e;

    .line 35
    new-instance p1, Lg40/e3;

    const/4 v1, 0x2

    invoke-direct {p1, p0, v1}, Lg40/e3;-><init>(Lg40/f3;I)V

    invoke-static {p3, p1}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lg40/f3;->w:Ln53/e;

    .line 36
    new-instance p3, Lg1/w8;

    const/16 v1, 0x9

    invoke-direct {p3, v1}, Lg1/w8;-><init>(I)V

    invoke-static {p1, v0, p3}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lg40/f3;->x:Ln53/e;

    if-eqz p2, :cond_6

    .line 37
    invoke-virtual {p0, p2}, Lg40/f3;->s(Ljava/lang/String;)V

    :cond_6
    return-void
.end method


# virtual methods
.method public final a()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/f3;->d:Lec3/f2;

    return-object v0
.end method

.method public final b(Z)V
    .locals 2

    iget-object v0, p0, Lg40/f3;->s:Lec3/h2;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lev/n;->B(ZLec3/h2;Ljava/lang/Object;)V

    return-void
.end method

.method public final c()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/f3;->w:Ln53/e;

    return-object v0
.end method

.method public final d()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/f3;->g:Lec3/r1;

    return-object v0
.end method

.method public final e()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/f3;->l:Lec3/h2;

    return-object v0
.end method

.method public final f()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/f3;->v:Ln53/e;

    return-object v0
.end method

.method public final g(Z)V
    .locals 2

    iget-object v0, p0, Lg40/f3;->t:Lec3/h2;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lev/n;->B(ZLec3/h2;Ljava/lang/Object;)V

    return-void
.end method

.method public final getContentDescription()Ln53/e;
    .locals 1

    iget-object v0, p0, Lg40/f3;->o:Ln53/e;

    return-object v0
.end method

.method public final getLabel()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/f3;->i:Lec3/h2;

    return-object v0
.end method

.method public final getLayoutDirection()Ly3/m;
    .locals 1

    iget-object v0, p0, Lg40/f3;->j:Ly3/m;

    return-object v0
.end method

.method public final getLoading()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/f3;->r:Lec3/f2;

    return-object v0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lg40/f3;->e:I

    return v0
.end method

.method public final i(ZLg40/y2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 14

    const-string v0, "modifier"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p6

    check-cast v11, Lp1/q;

    const v0, 0x490d86a9

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-interface/range {p2 .. p2}, Lg40/y2;->a()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    move-object/from16 v1, p5

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x7

    :goto_0
    move v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x6

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lg40/f3;->a:Lg40/l3;

    invoke-interface {v0}, Lg40/l3;->p()Z

    move-result v9

    invoke-interface {v0}, Lg40/l3;->o()Z

    move-result v10

    shr-int/lit8 v0, p7, 0xf

    and-int/lit8 v0, v0, 0xe

    shl-int/lit8 v1, p7, 0x3

    and-int/lit8 v2, v1, 0x70

    or-int/2addr v0, v2

    and-int/lit16 v1, v1, 0x1c00

    or-int v12, v0, v1

    const/16 v13, 0xf0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move v2, p1

    invoke-static/range {v1 .. v13}, Lg40/j4;->c(Lg40/m3;ZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILg2/s;ZZLandroidx/compose/runtime/Composer;II)V

    const/4 p1, 0x0

    invoke-virtual {v11, p1}, Lp1/q;->q(Z)V

    return-void
.end method

.method public final j()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/f3;->x:Ln53/e;

    return-object v0
.end method

.method public final k()Lc2/n;
    .locals 1

    iget-object v0, p0, Lg40/f3;->k:Lc2/n;

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg40/f3;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, Lg40/f3;->h:Z

    return v0
.end method

.method public final n(Lg40/n3;)V
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final o()I
    .locals 1

    iget v0, p0, Lg40/f3;->f:I

    return v0
.end method

.method public final p()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/f3;->n:Lec3/r1;

    return-object v0
.end method

.method public final q(Ljava/lang/String;)Lg40/s3;
    .locals 4

    const-string v0, "displayFormatted"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg40/f3;->p:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg40/s3;

    iget-object v2, p0, Lg40/f3;->a:Lg40/l3;

    invoke-interface {v2, p1}, Lg40/l3;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, Lg40/f3;->m:Lec3/h2;

    invoke-virtual {v3, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-interface {v2, p1}, Lg40/l3;->k(Ljava/lang/String;)Lg40/s3;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg40/s3;

    return-object p1

    :cond_0
    return-object v2
.end method

.method public final r()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/f3;->q:Lec3/r1;

    return-object v0
.end method

.method public final s(Ljava/lang/String;)V
    .locals 1

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg40/f3;->a:Lg40/l3;

    invoke-interface {v0, p1}, Lg40/l3;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg40/f3;->q(Ljava/lang/String;)Lg40/s3;

    return-void
.end method

.method public final t()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/f3;->u:Ln53/e;

    return-object v0
.end method
