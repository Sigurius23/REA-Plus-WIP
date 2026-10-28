.class public final Lg40/z1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/k1;
.implements Lg40/x2;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Z

.field public final d:Lec3/r1;

.field public final e:Lec3/h2;

.field public final f:Lec3/r1;

.field public final g:Lec3/h2;

.field public final h:Lec3/h2;

.field public final i:Lm63/d;

.field public final j:Lg40/r0;

.field public final k:Ln53/e;

.field public final l:Ln53/e;

.field public final m:Ln53/e;

.field public final n:Ln53/e;

.field public final o:Ln53/e;

.field public final p:Ln53/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZ)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/z1;->a:Ljava/lang/String;

    iput-boolean p4, p0, Lg40/z1;->b:Z

    iput-boolean p5, p0, Lg40/z1;->c:Z

    const/4 p4, 0x0

    new-array p4, p4, [Ljava/lang/Object;

    sget-object p5, Lm83/y;->w:Lm83/y;

    const v0, 0x7f140f8b

    invoke-static {v0, p4, p5}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p4

    invoke-static {p4}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p4

    iput-object p4, p0, Lg40/z1;->d:Lec3/r1;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lg40/z1;->e:Lec3/h2;

    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lg40/z1;->f:Lec3/r1;

    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p4}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p5

    iput-object p5, p0, Lg40/z1;->g:Lec3/h2;

    invoke-static {p4}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p4

    iput-object p4, p0, Lg40/z1;->h:Lec3/h2;

    new-instance v0, Lm63/d;

    new-instance v1, Lg1/u4;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Lg1/u4;-><init>(I)V

    new-instance v2, Lg1/u4;

    const/16 v3, 0x1d

    invoke-direct {v2, v3}, Lg1/u4;-><init>(I)V

    const/16 v3, 0xa

    invoke-direct {v0, p3, v1, v2, v3}, Lm63/d;-><init>(Ljava/util/Set;Lg1/u4;Lg1/u4;I)V

    iput-object v0, p0, Lg40/z1;->i:Lm63/d;

    new-instance p3, Lg40/r0;

    invoke-direct {p3, v0, p2}, Lg40/r0;-><init>(Lg40/p0;Ljava/lang/String;)V

    iput-object p3, p0, Lg40/z1;->j:Lg40/r0;

    new-instance p2, Lg40/x1;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lg40/x1;-><init>(Lg40/z1;I)V

    iget-object p3, p3, Lg40/r0;->g:Lec3/h2;

    invoke-static {p3, p2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p2

    iput-object p2, p0, Lg40/z1;->k:Ln53/e;

    new-instance v0, Lg40/x1;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lg40/x1;-><init>(Lg40/z1;I)V

    invoke-static {p3, v0}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p3

    new-instance v0, Lej1/h;

    const/16 v1, 0x11

    invoke-direct {v0, p0, v1}, Lej1/h;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, p3, v0}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object p3

    new-instance v0, Lg1/w8;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lg1/w8;-><init>(I)V

    invoke-static {p1, p2, v0}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object p1

    new-instance v0, Lg40/y1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg40/y1;-><init>(I)V

    invoke-static {p3, v0}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v0

    iput-object v0, p0, Lg40/z1;->l:Ln53/e;

    new-instance v1, Lg1/w8;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Lg1/w8;-><init>(I)V

    invoke-static {p1, v0, v1}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lg40/z1;->m:Ln53/e;

    new-instance p1, Leg2/a;

    const/16 v0, 0x19

    invoke-direct {p1, v0}, Leg2/a;-><init>(I)V

    invoke-static {p3, p4, p5, p1}, Lbi/g;->t(Lec3/f2;Lec3/f2;Lec3/f2;Lkotlin/jvm/functions/Function3;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lg40/z1;->n:Ln53/e;

    new-instance p1, Lg1/u4;

    const/16 p3, 0x1b

    invoke-direct {p1, p3}, Lg1/u4;-><init>(I)V

    invoke-static {p2, p1}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lg40/z1;->o:Ln53/e;

    new-instance p1, Lg1/u4;

    const/16 p3, 0x1c

    invoke-direct {p1, p3}, Lg1/u4;-><init>(I)V

    invoke-static {p2, p1}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lg40/z1;->p:Ln53/e;

    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 2

    iget-object v0, p0, Lg40/z1;->g:Lec3/h2;

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

    iget-object v0, p0, Lg40/z1;->n:Ln53/e;

    return-object v0
.end method

.method public final i(ZLg40/y2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 14

    move/from16 v0, p7

    const-string v1, "modifier"

    move-object/from16 v4, p3

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p6

    check-cast v11, Lp1/q;

    const v1, 0x50125283

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-interface/range {p2 .. p2}, Lg40/y2;->a()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    move-object/from16 v2, p5

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x6

    :goto_0
    move v10, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x7

    goto :goto_0

    :goto_1
    and-int/lit8 v1, v0, 0xe

    shr-int/lit8 v2, v0, 0xc

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    and-int/lit16 v0, v0, 0x380

    or-int v12, v1, v0

    const/16 v13, 0xf8

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v3, p0

    move v2, p1

    invoke-static/range {v2 .. v13}, Ldp/d;->g(ZLg40/z1;Landroidx/compose/ui/Modifier;Lc93/m;ZZLg2/s;Lc93/m;ILandroidx/compose/runtime/Composer;II)V

    const/4 p1, 0x0

    invoke-virtual {v11, p1}, Lp1/q;->q(Z)V

    return-void
.end method

.method public final j()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/z1;->m:Ln53/e;

    return-object v0
.end method

.method public final s(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lg40/z1;->v(Ljava/lang/String;)V

    return-void
.end method

.method public final u()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg40/z1;->k:Ln53/e;

    iget-object v0, v0, Ln53/e;->y:Ll83/e;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg40/k2;

    invoke-virtual {v0}, Lg40/k2;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v(Ljava/lang/String;)V
    .locals 2

    const-string v0, "displayFormatted"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg40/z1;->k:Ln53/e;

    iget-object v0, v0, Ln53/e;->y:Ll83/e;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg40/k2;

    invoke-virtual {v0, p1}, Lg40/k2;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lg40/z1;->e:Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method
