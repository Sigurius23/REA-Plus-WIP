.class public final Lg40/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/z2;
.implements Lg40/x2;


# instance fields
.field public final a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field public final b:Lg40/r0;

.field public final c:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

.field public final d:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

.field public final e:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

.field public final f:Lg40/v2;

.field public final g:Ljava/util/Map;

.field public final h:Z

.field public final i:Lg40/a0;

.field public final j:Lf1/p1;

.field public k:Z

.field public final l:Lec3/h2;

.field public final m:Lg40/i0;

.field public final n:Lec3/h2;

.field public final o:Ln53/e;

.field public final p:Ln53/e;

.field public final q:Ln53/e;

.field public final r:Ln53/e;

.field public final s:Ln53/e;


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lg40/z;Ljava/util/Set;Lg40/r0;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lg40/v2;Ljava/util/Map;Z)V
    .locals 0

    const-string p4, "identifier"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "interactorFactory"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/t;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput-object p5, p0, Lg40/t;->b:Lg40/r0;

    iput-object p6, p0, Lg40/t;->c:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iput-object p7, p0, Lg40/t;->d:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iput-object p8, p0, Lg40/t;->e:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iput-object p9, p0, Lg40/t;->f:Lg40/v2;

    iput-object p10, p0, Lg40/t;->g:Ljava/util/Map;

    iput-boolean p11, p0, Lg40/t;->h:Z

    invoke-interface {p3}, Lg40/z;->create()Lg40/a0;

    move-result-object p1

    iput-object p1, p0, Lg40/t;->i:Lg40/a0;

    invoke-interface {p1}, Lg40/a0;->f()Lf1/p1;

    move-result-object p3

    iput-object p3, p0, Lg40/t;->j:Lf1/p1;

    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p3}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p3

    iput-object p3, p0, Lg40/t;->l:Lec3/h2;

    new-instance p4, Lg40/i0;

    sget-object p6, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p6

    invoke-direct {p4, p6, p5}, Lg40/i0;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/r0;)V

    iput-object p4, p0, Lg40/t;->m:Lg40/i0;

    iget-boolean p4, p0, Lg40/t;->k:Z

    invoke-virtual {p0, p4, p2}, Lg40/t;->v(ZLjava/util/Map;)Lg40/m;

    move-result-object p4

    invoke-virtual {p0, p2, p4}, Lg40/t;->u(Ljava/util/Map;Lg40/m;)Lg40/f;

    move-result-object p2

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lg40/t;->n:Lec3/h2;

    new-instance p4, Lg1/w8;

    const/4 p5, 0x3

    invoke-direct {p4, p5}, Lg1/w8;-><init>(I)V

    invoke-static {p2, p3, p4}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object p2

    iput-object p2, p0, Lg40/t;->o:Ln53/e;

    new-instance p3, Lg1/u4;

    const/16 p4, 0x10

    invoke-direct {p3, p4}, Lg1/u4;-><init>(I)V

    invoke-static {p2, p3}, Lbi/g;->y(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p3

    iput-object p3, p0, Lg40/t;->p:Ln53/e;

    new-instance p3, Lg1/u4;

    const/16 p4, 0x11

    invoke-direct {p3, p4}, Lg1/u4;-><init>(I)V

    invoke-static {p2, p3}, Lbi/g;->y(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p3

    iput-object p3, p0, Lg40/t;->q:Ln53/e;

    new-instance p3, Lg1/u4;

    const/16 p4, 0x12

    invoke-direct {p3, p4}, Lg1/u4;-><init>(I)V

    invoke-static {p2, p3}, Lbi/g;->y(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p2

    iput-object p2, p0, Lg40/t;->r:Ln53/e;

    new-instance p3, Lg1/u4;

    const/16 p4, 0x13

    invoke-direct {p3, p4}, Lg1/u4;-><init>(I)V

    invoke-static {p2, p3}, Lbi/g;->y(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p2

    iput-object p2, p0, Lg40/t;->s:Ln53/e;

    new-instance p2, Leg/j;

    const/16 p3, 0x12

    invoke-direct {p2, p0, p3}, Leg/j;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, p2}, Lg40/a0;->d(Leg/j;)V

    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 2

    iget-object v0, p0, Lg40/t;->l:Lec3/h2;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lev/n;->B(ZLec3/h2;Ljava/lang/Object;)V

    return-void
.end method

.method public final f()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/t;->s:Ln53/e;

    return-object v0
.end method

.method public final i(ZLg40/y2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string p2, "modifier"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p6

    check-cast v5, Lp1/q;

    const p2, 0x6480b3d9

    invoke-virtual {v5, p2}, Lp1/q;->e0(I)V

    iget-object p2, p0, Lg40/t;->r:Ln53/e;

    const/4 p6, 0x0

    invoke-static {p2, v5, p6}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object p2

    invoke-interface {p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Lg40/e;

    and-int/lit8 p2, p7, 0xe

    shr-int/lit8 v0, p7, 0x3

    and-int/lit16 v2, v0, 0x380

    or-int/2addr p2, v2

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr p2, v0

    shl-int/lit8 p7, p7, 0x6

    const v0, 0xe000

    and-int/2addr p7, v0

    or-int v6, p2, p7

    const/4 v7, 0x0

    move v0, p1

    move-object v4, p3

    move-object v2, p4

    move-object v3, p5

    invoke-static/range {v0 .. v7}, Lv8/b;->b(ZLg40/e;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, p6}, Lp1/q;->q(Z)V

    return-void
.end method

.method public final u(Ljava/util/Map;Lg40/m;)Lg40/f;
    .locals 11

    new-instance v0, Lg40/f;

    iget-object v1, p0, Lg40/t;->j:Lf1/p1;

    iget-boolean v8, v1, Lf1/p1;->x:Z

    iget-boolean v9, p0, Lg40/t;->h:Z

    const/16 v10, 0x8

    iget-object v1, p0, Lg40/t;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const/4 v4, 0x0

    iget-object v5, p0, Lg40/t;->m:Lg40/i0;

    iget-object v6, p0, Lg40/t;->f:Lg40/v2;

    iget-object v7, p0, Lg40/t;->g:Ljava/util/Map;

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v10}, Lg40/f;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lg40/m;Ljava/util/Set;Lg40/i0;Lg40/v2;Ljava/util/Map;ZZI)V

    return-object v0
.end method

.method public final v(ZLjava/util/Map;)Lg40/m;
    .locals 9

    iget-object v0, p0, Lg40/t;->j:Lf1/p1;

    iget-object v1, v0, Lf1/p1;->y:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    iget-object v7, p0, Lg40/t;->e:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iget-object v6, p0, Lg40/t;->d:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iget-object v5, p0, Lg40/t;->c:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    if-nez v3, :cond_0

    new-instance p1, Lg40/l;

    invoke-direct {p1, v5, v6, v7}, Lg40/l;-><init>(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;)V

    return-object p1

    :cond_0
    if-nez p1, :cond_2

    sget-object p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine1$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v2, Lg40/j;

    iget-object p1, v0, Lf1/p1;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/util/Set;

    new-instance v8, Lg40/s;

    const/4 p1, 0x1

    invoke-direct {v8, p0, p1}, Lg40/s;-><init>(Lg40/t;I)V

    invoke-direct/range {v2 .. v8}, Lg40/j;-><init>(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lc93/a;)V

    return-object v2

    :cond_2
    :goto_0
    new-instance v2, Lg40/k;

    iget-object p1, v0, Lf1/p1;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/util/Set;

    new-instance v8, Lg40/s;

    const/4 p1, 0x0

    invoke-direct {v8, p0, p1}, Lg40/s;-><init>(Lg40/t;I)V

    invoke-direct/range {v2 .. v8}, Lg40/k;-><init>(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lc93/a;)V

    return-object v2
.end method
