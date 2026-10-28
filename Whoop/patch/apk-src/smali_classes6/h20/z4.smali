.class public final Lh20/z4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lk20/a;

.field public final c:Lbc3/c0;

.field public final d:Lq83/j;

.field public final e:Lq83/j;

.field public final f:Lz20/g;

.field public final g:Lec3/f2;

.field public final h:Lkotlin/jvm/internal/i;

.field public final i:Lh20/f;

.field public final j:Ls83/i;

.field public final k:Lc93/a;

.field public final l:Lc93/o;

.field public final m:Ln53/e;

.field public final n:Ln53/e;

.field public final o:Ln53/e;

.field public final p:Lec3/h2;

.field public final q:Lec3/h2;


# direct methods
.method public constructor <init>(Lec3/f2;Lk20/a;Lbc3/c0;Lq83/j;Lq83/j;Lz20/g;Lec3/r1;Lkotlin/jvm/functions/Function1;Lh20/f;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/o;Lec3/f2;Z)V
    .locals 1

    const-string v0, "eventReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerRepository"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selection"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerStateHolder"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isLinkEnabled"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh20/z4;->a:Ljava/lang/Object;

    iput-object p2, p0, Lh20/z4;->b:Lk20/a;

    iput-object p3, p0, Lh20/z4;->c:Lbc3/c0;

    iput-object p4, p0, Lh20/z4;->d:Lq83/j;

    iput-object p5, p0, Lh20/z4;->e:Lq83/j;

    iput-object p6, p0, Lh20/z4;->f:Lz20/g;

    iput-object p7, p0, Lh20/z4;->g:Lec3/f2;

    check-cast p8, Lkotlin/jvm/internal/i;

    iput-object p8, p0, Lh20/z4;->h:Lkotlin/jvm/internal/i;

    iput-object p9, p0, Lh20/z4;->i:Lh20/f;

    check-cast p10, Ls83/i;

    iput-object p10, p0, Lh20/z4;->j:Ls83/i;

    iput-object p11, p0, Lh20/z4;->k:Lc93/a;

    iput-object p12, p0, Lh20/z4;->l:Lc93/o;

    iget-object p2, p9, Lh20/f;->b:Lec3/r1;

    new-instance p4, Lg1/w8;

    const/16 p5, 0xf

    invoke-direct {p4, p5}, Lg1/w8;-><init>(I)V

    invoke-static {p2, p1, p4}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lh20/z4;->m:Ln53/e;

    new-instance p1, Lbm2/d0;

    const/4 p2, 0x5

    invoke-direct {p1, p0, p13, p14, p2}, Lbm2/d0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le30/d;

    iget-object p2, p1, Le30/d;->b:Lec3/f2;

    iget-object p4, p1, Le30/d;->d:Lec3/f2;

    iget-object p5, p1, Le30/d;->c:Ln53/e;

    iget-object p6, p1, Le30/d;->a:Ln53/e;

    new-instance p7, Las1/j;

    const/4 p8, 0x3

    invoke-direct {p7, p1, p8}, Las1/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {p2, p4, p5, p6, p7}, Lbi/g;->q(Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Lc93/n;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lh20/z4;->n:Ln53/e;

    iget-object p2, p9, Lh20/f;->f:Ln53/e;

    new-instance p4, Lej1/h;

    const/16 p5, 0x18

    invoke-direct {p4, p0, p5}, Lej1/h;-><init>(Ljava/lang/Object;I)V

    invoke-static {p2, p1, p4}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lh20/z4;->o:Ln53/e;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lh20/z4;->p:Lec3/h2;

    iput-object p1, p0, Lh20/z4;->q:Lec3/h2;

    new-instance p1, Lh20/t4;

    const/4 p2, 0x0

    const/4 p4, 0x0

    invoke-direct {p1, p0, p4, p2}, Lh20/t4;-><init>(Lh20/z4;Lq83/d;I)V

    const/4 p2, 0x3

    invoke-static {p3, p4, p4, p1, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance p1, Lh20/t4;

    const/4 p5, 0x1

    invoke-direct {p1, p0, p4, p5}, Lh20/t4;-><init>(Lh20/z4;Lq83/d;I)V

    invoke-static {p3, p4, p4, p1, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance p1, Lh20/t4;

    const/4 p5, 0x2

    invoke-direct {p1, p0, p4, p5}, Lh20/t4;-><init>(Lh20/z4;Lq83/d;I)V

    invoke-static {p3, p4, p4, p1, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public final a(Ly00/o4;Lh20/a;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p4, Lh20/v4;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lh20/v4;

    iget v1, v0, Lh20/v4;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh20/v4;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh20/v4;

    invoke-direct {v0, p0, p4}, Lh20/v4;-><init>(Lh20/z4;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lh20/v4;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh20/v4;->G:I

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v9, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lh20/v4;->y:Ljava/lang/Object;

    iget-object p2, v0, Lh20/v4;->x:Ljava/lang/Object;

    check-cast p2, Lh20/a;

    iget-object p3, v0, Lh20/v4;->w:Lh20/z4;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p3, v0, Lh20/v4;->z:Lkotlin/jvm/functions/Function1;

    iget-object p1, v0, Lh20/v4;->y:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lh20/a;

    iget-object p1, v0, Lh20/v4;->x:Ljava/lang/Object;

    check-cast p1, Ly00/o4;

    iget-object v2, v0, Lh20/v4;->w:Lh20/z4;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p4, p4, Ll83/n;->w:Ljava/lang/Object;

    move-object v6, v2

    :goto_1
    move-object v8, p3

    goto :goto_3

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p4, p0, Lh20/z4;->a:Ljava/lang/Object;

    invoke-interface {p4}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lv00/c0;

    if-eqz p4, :cond_b

    iget-object p4, p4, Lv00/c0;->P:Lv00/p;

    if-nez p4, :cond_4

    goto/16 :goto_7

    :cond_4
    new-instance v2, Lz20/h;

    iget-object v5, p4, Lv00/p;->w:Ljava/lang/String;

    iget-object v6, p4, Lv00/p;->x:Ljava/lang/String;

    iget-object p4, p4, Lv00/p;->y:Ljava/lang/String;

    invoke-direct {v2, v5, v6, p4}, Lz20/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p4, p1, Ly00/o4;->w:Ljava/lang/String;

    iget-object v5, p2, Lh20/a;->c:Ly00/i;

    if-eqz v5, :cond_5

    new-instance v6, Ly00/w5;

    iget-object v5, v5, Ly00/i;->w:Ljava/lang/String;

    invoke-direct {v6, v5}, Ly00/w5;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    move-object v6, v9

    :goto_2
    iget-object v5, p2, Lh20/a;->d:Ly00/v3;

    iget-object v7, p2, Lh20/a;->a:Ljava/lang/Integer;

    iget-object v8, p2, Lh20/a;->b:Ljava/lang/Integer;

    const-string v10, "PaymentSheet"

    invoke-static {v10}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    invoke-static {v7, v8, v6, v5, v10}, Lt9/c0;->g(Ljava/lang/Integer;Ljava/lang/Integer;Ly00/w5;Ly00/v3;Ljava/util/Set;)Ly00/x5;

    move-result-object v5

    iput-object p0, v0, Lh20/v4;->w:Lh20/z4;

    iput-object p1, v0, Lh20/v4;->x:Ljava/lang/Object;

    iput-object p2, v0, Lh20/v4;->y:Ljava/lang/Object;

    iput-object p3, v0, Lh20/v4;->z:Lkotlin/jvm/functions/Function1;

    iput v3, v0, Lh20/v4;->G:I

    iget-object v3, p0, Lh20/z4;->f:Lz20/g;

    invoke-virtual {v3, v2, p4, v5, v0}, Lz20/g;->f(Lz20/h;Ljava/lang/String;Ly00/x5;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_6

    goto :goto_5

    :cond_6
    move-object v6, p0

    goto :goto_1

    :goto_3
    instance-of p3, p4, Ll83/m;

    if-nez p3, :cond_7

    check-cast p4, Ly00/o4;

    iget-object p3, p1, Ly00/o4;->R:Ly00/s2;

    iget-boolean p1, p1, Ly00/o4;->S:Z

    const v2, 0x9ffff

    invoke-static {p4, v9, p3, p1, v2}, Ly00/o4;->b(Ly00/o4;Ly00/v3;Ly00/s2;ZI)Ly00/o4;

    move-result-object p1

    goto :goto_4

    :cond_7
    move-object p1, p4

    :goto_4
    instance-of p3, p1, Ll83/m;

    if-nez p3, :cond_9

    move-object v7, p1

    check-cast v7, Ly00/o4;

    iget-object p3, v6, Lh20/z4;->e:Lq83/j;

    new-instance v5, Lay/u;

    const/4 v10, 0x5

    invoke-direct/range {v5 .. v10}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object v6, v0, Lh20/v4;->w:Lh20/z4;

    iput-object p2, v0, Lh20/v4;->x:Ljava/lang/Object;

    iput-object p1, v0, Lh20/v4;->y:Ljava/lang/Object;

    iput-object v9, v0, Lh20/v4;->z:Lkotlin/jvm/functions/Function1;

    iput v4, v0, Lh20/v4;->G:I

    invoke-static {p3, v5, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_8

    :goto_5
    return-object v1

    :cond_8
    move-object p3, v6

    :goto_6
    iget-object p4, p3, Lh20/z4;->b:Lk20/a;

    iget-object v0, p2, Lh20/a;->c:Ly00/i;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lk20/o;

    invoke-direct {v1, v0}, Lk20/o;-><init>(Ly00/i;)V

    invoke-static {p4, v1}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    move-object v6, p3

    :cond_9
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p3

    if-eqz p3, :cond_a

    iget-object p4, v6, Lh20/z4;->b:Lk20/a;

    iget-object p2, p2, Lh20/a;->c:Ly00/i;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lk20/n;

    invoke-direct {v0, p2, p3}, Lk20/n;-><init>(Ly00/i;Ljava/lang/Throwable;)V

    invoke-static {p4, v0}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    :cond_a
    return-object p1

    :cond_b
    :goto_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Could not update payment method because CustomerConfiguration was not found! Make sure it is provided as part of PaymentSheet.Configuration"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ly00/o4;Ls83/c;)Ljava/io/Serializable;
    .locals 6

    instance-of v0, p2, Lh20/w4;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh20/w4;

    iget v1, v0, Lh20/w4;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh20/w4;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh20/w4;

    invoke-direct {v0, p0, p2}, Lh20/w4;-><init>(Lh20/z4;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lh20/w4;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh20/w4;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lh20/w4;->x:Ljava/lang/String;

    iget-object v0, v0, Lh20/w4;->w:Lh20/z4;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p1, Ly00/o4;->w:Ljava/lang/String;

    iput-object p0, v0, Lh20/w4;->w:Lh20/z4;

    iput-object p1, v0, Lh20/w4;->x:Ljava/lang/String;

    iput v3, v0, Lh20/w4;->E:I

    invoke-virtual {p0, p1, v0}, Lh20/z4;->c(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    instance-of v1, p2, Ll83/m;

    if-nez v1, :cond_4

    iget-object v1, v0, Lh20/z4;->c:Lbc3/c0;

    iget-object v2, v0, Lh20/z4;->e:Lq83/j;

    new-instance v3, Lh20/i0;

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-direct {v3, v0, p1, v5, v4}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x2

    invoke-static {v1, v2, v5, v3, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_4
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lh20/x4;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh20/x4;

    iget v1, v0, Lh20/x4;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh20/x4;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh20/x4;

    invoke-direct {v0, p0, p2}, Lh20/x4;-><init>(Lh20/z4;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lh20/x4;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh20/x4;->G:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p1, v0, Lh20/x4;->z:Z

    iget-object v2, v0, Lh20/x4;->y:Lv00/p;

    iget-object v4, v0, Lh20/x4;->x:Ljava/lang/String;

    iget-object v6, v0, Lh20/x4;->w:Lh20/z4;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move p2, p1

    move-object p1, v4

    goto :goto_4

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lh20/z4;->a:Ljava/lang/Object;

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lv00/c0;

    if-eqz p2, :cond_a

    iget-object v2, p2, Lv00/c0;->P:Lv00/p;

    if-nez v2, :cond_4

    goto/16 :goto_6

    :cond_4
    iget-object p2, p0, Lh20/z4;->i:Lh20/f;

    iget-object p2, p2, Lh20/f;->e:Ln53/e;

    iget-object p2, p2, Ln53/e;->y:Ll83/e;

    check-cast p2, Lc93/a;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iget-object v6, p0, Lh20/z4;->g:Lec3/f2;

    invoke-interface {v6}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lq20/w;

    if-eqz v7, :cond_5

    check-cast v6, Lq20/w;

    goto :goto_1

    :cond_5
    move-object v6, v5

    :goto_1
    if-eqz v6, :cond_6

    iget-object v6, v6, Lq20/w;->x:Ly00/o4;

    goto :goto_2

    :cond_6
    move-object v6, v5

    :goto_2
    if-eqz v6, :cond_7

    iget-object v6, v6, Ly00/o4;->w:Ljava/lang/String;

    goto :goto_3

    :cond_7
    move-object v6, v5

    :goto_3
    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    new-instance v6, La13/h;

    const/16 v7, 0xd

    invoke-direct {v6, p0, v5, v7}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p0, v0, Lh20/x4;->w:Lh20/z4;

    iput-object p1, v0, Lh20/x4;->x:Ljava/lang/String;

    iput-object v2, v0, Lh20/x4;->y:Lv00/p;

    iput-boolean p2, v0, Lh20/x4;->z:Z

    iput v4, v0, Lh20/x4;->G:I

    iget-object v4, p0, Lh20/z4;->e:Lq83/j;

    invoke-static {v4, v6, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_8

    goto :goto_5

    :cond_8
    move-object v6, p0

    :goto_4
    iget-object v4, v6, Lh20/z4;->f:Lz20/g;

    new-instance v6, Lz20/h;

    iget-object v7, v2, Lv00/p;->w:Ljava/lang/String;

    iget-object v8, v2, Lv00/p;->x:Ljava/lang/String;

    iget-object v2, v2, Lv00/p;->y:Ljava/lang/String;

    invoke-direct {v6, v7, v8, v2}, Lz20/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v5, v0, Lh20/x4;->w:Lh20/z4;

    iput-object v5, v0, Lh20/x4;->x:Ljava/lang/String;

    iput-object v5, v0, Lh20/x4;->y:Lv00/p;

    iput v3, v0, Lh20/x4;->G:I

    invoke-virtual {v4, v6, p1, p2, v0}, Lz20/g;->a(Lz20/h;Ljava/lang/String;ZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_5
    return-object v1

    :cond_9
    return-object p1

    :cond_a
    :goto_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Could not remove payment method because CustomerConfiguration was not found! Make sure it is provided as part of PaymentSheet.Configuration"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ly00/o4;Lq83/d;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lh20/y4;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh20/y4;

    iget v1, v0, Lh20/y4;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh20/y4;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh20/y4;

    invoke-direct {v0, p0, p2}, Lh20/y4;-><init>(Lh20/z4;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lh20/y4;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh20/y4;->F:I

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lh20/y4;->y:Ljava/lang/Object;

    iget-object v1, v0, Lh20/y4;->x:Ly00/o4;

    iget-object v0, v0, Lh20/y4;->w:Lh20/z4;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lh20/y4;->x:Ly00/o4;

    iget-object v2, v0, Lh20/y4;->w:Lh20/z4;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    move-object v9, p2

    move-object p2, p1

    move-object p1, v9

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lh20/z4;->a:Ljava/lang/Object;

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lv00/c0;

    if-eqz p2, :cond_c

    iget-object p2, p2, Lv00/c0;->P:Lv00/p;

    if-nez p2, :cond_4

    goto/16 :goto_5

    :cond_4
    new-instance v2, Lz20/h;

    iget-object v6, p2, Lv00/p;->w:Ljava/lang/String;

    iget-object v7, p2, Lv00/p;->x:Ljava/lang/String;

    iget-object p2, p2, Lv00/p;->y:Ljava/lang/String;

    invoke-direct {v2, v6, v7, p2}, Lz20/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p1, Ly00/o4;->w:Ljava/lang/String;

    iput-object p0, v0, Lh20/y4;->w:Lh20/z4;

    iput-object p1, v0, Lh20/y4;->x:Ly00/o4;

    iput v3, v0, Lh20/y4;->F:I

    iget-object v3, p0, Lh20/z4;->f:Lz20/g;

    invoke-virtual {v3, v2, p2, v0}, Lz20/g;->e(Lz20/h;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object v2, p2

    move-object p2, p1

    move-object p1, v2

    move-object v2, p0

    :goto_1
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_7

    iget-object v6, v2, Lh20/z4;->b:Lk20/a;

    iget-object v7, p2, Ly00/o4;->E:Ly00/f4;

    if-eqz v7, :cond_6

    iget-object v7, v7, Ly00/f4;->w:Ljava/lang/String;

    goto :goto_2

    :cond_6
    move-object v7, v5

    :goto_2
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v8, Lk20/n;

    invoke-direct {v8, v7, v3}, Lk20/n;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v6, v8}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    :cond_7
    instance-of v3, p1, Ll83/m;

    if-nez v3, :cond_a

    move-object v3, p1

    check-cast v3, Ly00/q0;

    iget-object v3, v2, Lh20/z4;->e:Lq83/j;

    new-instance v6, Landroidx/room/e;

    const/16 v7, 0xd

    invoke-direct {v6, v2, p2, v5, v7}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object v2, v0, Lh20/y4;->w:Lh20/z4;

    iput-object p2, v0, Lh20/y4;->x:Ly00/o4;

    iput-object p1, v0, Lh20/y4;->y:Ljava/lang/Object;

    iput v4, v0, Lh20/y4;->F:I

    invoke-static {v3, v6, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    move-object v1, p2

    move-object v0, v2

    :goto_4
    iget-object p2, v0, Lh20/z4;->b:Lk20/a;

    iget-object v0, v1, Ly00/o4;->E:Ly00/f4;

    if-eqz v0, :cond_9

    iget-object v5, v0, Ly00/f4;->w:Ljava/lang/String;

    :cond_9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lk20/l;

    const/16 v1, 0x8

    invoke-direct {v0, v5, v1}, Lk20/l;-><init>(Ljava/lang/String;I)V

    invoke-static {p2, v0}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    :cond_a
    instance-of p2, p1, Ll83/m;

    if-nez p2, :cond_b

    check-cast p1, Ly00/q0;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :cond_b
    return-object p1

    :cond_c
    :goto_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unable to set default payment method when customer is null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final e()V
    .locals 3

    :cond_0
    iget-object v0, p0, Lh20/z4;->p:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public final f(Lh20/l;)V
    .locals 11

    const-string v0, "displayableSavedPaymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lh20/l;->b:Ly00/o4;

    iget-object v1, p0, Lh20/z4;->i:Lh20/f;

    iget-object v1, v1, Lh20/f;->f:Ln53/e;

    iget-object v1, v1, Ln53/e;->y:Ll83/e;

    check-cast v1, Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v8

    new-instance v9, La33/c;

    const/4 v1, 0x7

    const/4 v3, 0x0

    invoke-direct {v9, p0, v0, v3, v1}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    new-instance v10, Lg20/p;

    const/16 v1, 0xf

    invoke-direct {v10, p0, v0, v3, v1}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    new-instance v0, Landroidx/room/v0;

    const/4 v6, 0x0

    const/16 v7, 0x8

    const/4 v1, 0x2

    const-class v3, Lh20/z4;

    const-string v4, "setDefaultPaymentMethod"

    const-string v5, "setDefaultPaymentMethod-gIAlu-s$paymentsheet_release(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    iget-object v1, p0, Lh20/z4;->l:Lc93/o;

    move-object v5, v0

    move-object v0, v1

    move-object v2, v8

    move-object v3, v9

    move-object v4, v10

    move-object v1, p1

    invoke-interface/range {v0 .. v5}, Lc93/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
