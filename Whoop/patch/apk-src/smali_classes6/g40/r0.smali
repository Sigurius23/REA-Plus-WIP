.class public final Lg40/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/k1;
.implements Lg40/z2;
.implements Lg40/x2;


# instance fields
.field public final a:Lg40/p0;

.field public final b:Ljava/util/List;

.field public final c:Z

.field public final d:Ljava/lang/Integer;

.field public final e:Lec3/h2;

.field public final f:Lec3/h2;

.field public final g:Lec3/h2;

.field public final h:Lec3/h2;

.field public final i:Ln53/e;

.field public final j:Ln53/e;

.field public final k:Ln53/e;

.field public final l:Z


# direct methods
.method public constructor <init>(Lg40/p0;Ljava/lang/String;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/r0;->a:Lg40/p0;

    invoke-interface {p1}, Lg40/p0;->M()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lg40/r0;->b:Ljava/util/List;

    invoke-interface {p1}, Lg40/p0;->H()Z

    move-result v0

    iput-boolean v0, p0, Lg40/r0;->c:Z

    invoke-interface {p1}, Lg40/p0;->g()Lg40/o0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    instance-of v2, v0, Lg40/n0;

    if-eqz v2, :cond_1

    check-cast v0, Lg40/n0;

    iget-boolean v0, v0, Lg40/n0;->a:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    iput-object v1, p0, Lg40/r0;->d:Ljava/lang/Integer;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lg40/r0;->e:Lec3/h2;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, p0, Lg40/r0;->f:Lec3/h2;

    iput-object v1, p0, Lg40/r0;->g:Lec3/h2;

    invoke-interface {p1}, Lg40/p0;->getLabel()Lzy/c;

    move-result-object v2

    invoke-static {v2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, p0, Lg40/r0;->h:Lec3/h2;

    new-instance v2, Lg40/q0;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lg40/q0;-><init>(Lg40/r0;I)V

    invoke-static {v1, v2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    new-instance v2, Lg40/q0;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lg40/q0;-><init>(Lg40/r0;I)V

    invoke-static {v1, v2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v2

    iput-object v2, p0, Lg40/r0;->i:Ln53/e;

    new-instance v3, Lg1/w8;

    const/4 v4, 0x4

    invoke-direct {v3, v4}, Lg1/w8;-><init>(I)V

    invoke-static {v0, v1, v3}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object v0

    iput-object v0, p0, Lg40/r0;->j:Ln53/e;

    new-instance v0, Lg1/u4;

    const/16 v3, 0x16

    invoke-direct {v0, v3}, Lg1/u4;-><init>(I)V

    invoke-static {v1, v0}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v0

    new-instance v1, Lg1/w8;

    const/4 v3, 0x5

    invoke-direct {v1, v3}, Lg1/w8;-><init>(I)V

    invoke-static {v0, v2, v1}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object v0

    iput-object v0, p0, Lg40/r0;->k:Ln53/e;

    invoke-interface {p1}, Lg40/p0;->g()Lg40/o0;

    move-result-object p1

    instance-of p1, p1, Lg40/m0;

    iput-boolean p1, p0, Lg40/r0;->l:Z

    if-eqz p2, :cond_2

    invoke-virtual {p0, p2}, Lg40/r0;->s(Ljava/lang/String;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 2

    iget-object v0, p0, Lg40/r0;->e:Lec3/h2;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lev/n;->B(ZLec3/h2;Ljava/lang/Object;)V

    return-void
.end method

.method public final c()Lec3/f2;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final f()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/r0;->j:Ln53/e;

    return-object v0
.end method

.method public final i(ZLg40/y2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    const-string p2, "modifier"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p6

    check-cast v4, Lp1/q;

    const p2, -0x6ffb8c21

    invoke-virtual {v4, p2}, Lp1/q;->e0(I)V

    shr-int/lit8 p2, p7, 0xf

    and-int/lit8 p2, p2, 0xe

    shl-int/lit8 p4, p7, 0x3

    and-int/lit8 p4, p4, 0x70

    or-int/2addr p2, p4

    and-int/lit16 p4, p7, 0x380

    or-int v5, p2, p4

    const/4 v3, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p3

    invoke-static/range {v0 .. v5}, Lg40/y0;->a(Lg40/r0;ZLandroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;I)V

    const/4 p1, 0x0

    invoke-virtual {v4, p1}, Lp1/q;->q(Z)V

    return-void
.end method

.method public final j()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/r0;->k:Ln53/e;

    return-object v0
.end method

.method public final s(Ljava/lang/String;)V
    .locals 2

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg40/r0;->a:Lg40/p0;

    invoke-interface {v0, p1}, Lg40/p0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lg40/r0;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, -0x1

    if-ne p1, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lg40/r0;->d:Ljava/lang/Integer;

    :cond_1
    invoke-virtual {p0, v0}, Lg40/r0;->u(Ljava/lang/Integer;)V

    return-void
.end method

.method public final u(Ljava/lang/Integer;)V
    .locals 2

    iget-object v0, p0, Lg40/r0;->f:Lec3/h2;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v1, p0, Lg40/r0;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void

    :cond_1
    iget-object p1, p0, Lg40/r0;->d:Ljava/lang/Integer;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void
.end method
