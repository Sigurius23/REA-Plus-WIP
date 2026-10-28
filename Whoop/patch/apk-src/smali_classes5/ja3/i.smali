.class public final Lja3/i;
.super Lu93/k;
.source "SourceFile"

# interfaces
.implements Lha3/c;


# instance fields
.field public final G:Lzt/q;

.field public final H:Lx93/n;

.field public final I:Lr93/e;

.field public final J:Lzt/q;

.field public final K:Ll83/p;

.field public final L:Lr93/f;

.field public final M:Lr93/a0;

.field public final N:Lr93/m1;

.field public final O:Z

.field public final P:Lja3/h;

.field public final Q:Lja3/o;

.field public final R:Lr93/r0;

.field public final S:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/j;

.field public final T:Lja3/d0;

.field public final U:Lia3/c;

.field public final V:Lkb3/i;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const-string v5, "notifyAll"

    const-string v6, "toString"

    const-string v0, "equals"

    const-string v1, "hashCode"

    const-string v2, "getClass"

    const-string v3, "wait"

    const-string v4, "notify"

    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lzt/q;Lr93/k;Lx93/n;Lr93/e;)V
    .locals 8

    const-string v0, "outerContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jClass"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v1, v0, Lia3/a;->a:Lkb3/n;

    invoke-virtual {p3}, Lx93/n;->e()Lva3/h;

    move-result-object v2

    iget-object v0, v0, Lia3/a;->j:Lw93/d;

    invoke-virtual {v0, p3}, Lw93/d;->c(Lma3/d;)Lw93/f;

    move-result-object v0

    invoke-direct {p0, v1, p2, v2, v0}, Lu93/k;-><init>(Lkb3/n;Lr93/k;Lva3/h;Lr93/s0;)V

    iput-object p1, p0, Lja3/i;->G:Lzt/q;

    iput-object p3, p0, Lja3/i;->H:Lx93/n;

    iput-object p4, p0, Lja3/i;->I:Lr93/e;

    const/4 p2, 0x4

    invoke-static {p1, p0, p3, p2}, Lge3/g;->l(Lzt/q;Lr93/g;Lx93/n;I)Lzt/q;

    move-result-object v1

    iput-object v1, p0, Lja3/i;->J:Lzt/q;

    iget-object p1, v1, Lzt/q;->x:Ljava/lang/Object;

    check-cast p1, Lia3/a;

    iget-object p2, p1, Lia3/a;->a:Lkb3/n;

    iget-object v0, p1, Lia3/a;->g:Lga3/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lja3/g;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lja3/g;-><init>(Lja3/i;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lja3/i;->K:Ll83/p;

    iget-object v0, p3, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isAnnotation()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lr93/f;->E:Lr93/f;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Lr93/f;->x:Lr93/f;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Lr93/f;->y:Lr93/f;

    goto :goto_0

    :cond_2
    sget-object v2, Lr93/f;->w:Lr93/f;

    :goto_0
    iput-object v2, p0, Lja3/i;->L:Lr93/f;

    invoke-virtual {v0}, Ljava/lang/Class;->isAnnotation()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_b

    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_5

    :cond_3
    sget-object v2, Lr93/a0;->w:Lr93/v0;

    invoke-static {v0}, Lvo/b;->s(Ljava/lang/Class;)Ljava/lang/Boolean;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    goto :goto_1

    :cond_4
    move v5, v3

    :goto_1
    invoke-static {v0}, Lvo/b;->s(Ljava/lang/Class;)Ljava/lang/Boolean;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto :goto_2

    :cond_5
    move v6, v3

    :goto_2
    if-nez v6, :cond_7

    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    move-result v6

    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v6

    if-nez v6, :cond_7

    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_3

    :cond_6
    move v6, v3

    goto :goto_4

    :cond_7
    :goto_3
    move v6, v4

    :goto_4
    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    move-result v7

    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result v7

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v5, :cond_8

    sget-object v2, Lr93/a0;->y:Lr93/a0;

    goto :goto_6

    :cond_8
    if-eqz v6, :cond_9

    sget-object v2, Lr93/a0;->E:Lr93/a0;

    goto :goto_6

    :cond_9
    if-nez v7, :cond_a

    sget-object v2, Lr93/a0;->z:Lr93/a0;

    goto :goto_6

    :cond_a
    sget-object v2, Lr93/a0;->x:Lr93/a0;

    goto :goto_6

    :cond_b
    :goto_5
    sget-object v2, Lr93/a0;->x:Lr93/a0;

    :goto_6
    iput-object v2, p0, Lja3/i;->M:Lr93/a0;

    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    move-result v2

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v5

    if-eqz v5, :cond_c

    sget-object v2, Lr93/j1;->c:Lr93/j1;

    goto :goto_7

    :cond_c
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    move-result v5

    if-eqz v5, :cond_d

    sget-object v2, Lr93/g1;->c:Lr93/g1;

    goto :goto_7

    :cond_d
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isProtected(I)Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v2

    if-eqz v2, :cond_e

    sget-object v2, Lv93/c;->c:Lv93/c;

    goto :goto_7

    :cond_e
    sget-object v2, Lv93/b;->c:Lv93/b;

    goto :goto_7

    :cond_f
    sget-object v2, Lv93/a;->c:Lv93/a;

    :goto_7
    iput-object v2, p0, Lja3/i;->N:Lr93/m1;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v2

    if-eqz v2, :cond_10

    new-instance v5, Lx93/n;

    invoke-direct {v5, v2}, Lx93/n;-><init>(Ljava/lang/Class;)V

    goto :goto_8

    :cond_10
    const/4 v5, 0x0

    :goto_8
    if-eqz v5, :cond_11

    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-nez v0, :cond_11

    move v0, v4

    goto :goto_9

    :cond_11
    move v0, v3

    :goto_9
    iput-boolean v0, p0, Lja3/i;->O:Z

    new-instance v0, Lja3/h;

    invoke-direct {v0, p0}, Lja3/h;-><init>(Lja3/i;)V

    iput-object v0, p0, Lja3/i;->P:Lja3/h;

    new-instance v0, Lja3/o;

    if-eqz p4, :cond_12

    goto :goto_a

    :cond_12
    move v4, v3

    :goto_a
    const/4 v5, 0x0

    move-object v2, p0

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lja3/o;-><init>(Lzt/q;Lr93/e;Lx93/n;ZLja3/o;)V

    iput-object v0, v2, Lja3/i;->Q:Lja3/o;

    sget-object p3, Lr93/r0;->d:Lr93/v0;

    iget-object p1, p1, Lia3/a;->u:Lmb3/k;

    check-cast p1, Lmb3/l;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ldc3/s;

    const/4 p4, 0x7

    invoke-direct {p1, p0, p4}, Ldc3/s;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p3, "storageManager"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lr93/r0;

    invoke-direct {p3, p0, p2, p1}, Lr93/r0;-><init>(Lu93/b;Lkb3/n;Lkotlin/jvm/functions/Function1;)V

    iput-object p3, v2, Lja3/i;->R:Lr93/r0;

    new-instance p1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/j;

    invoke-direct {p1, v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/j;-><init>(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;)V

    iput-object p1, v2, Lja3/i;->S:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/j;

    new-instance p1, Lja3/d0;

    invoke-direct {p1, v1, v3, p0}, Lja3/d0;-><init>(Lzt/q;Lx93/n;Lja3/i;)V

    iput-object p1, v2, Lja3/i;->T:Lja3/d0;

    invoke-static {v1, v3}, Lhg3/i;->j0(Lzt/q;Lma3/b;)Lia3/c;

    move-result-object p1

    iput-object p1, v2, Lja3/i;->U:Lia3/c;

    new-instance p1, Lja3/g;

    const/4 p3, 0x1

    invoke-direct {p1, p0, p3}, Lja3/g;-><init>(Lja3/i;I)V

    check-cast p2, Lkb3/k;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p3, Lkb3/i;

    invoke-direct {p3, p2, p1}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p3, v2, Lja3/i;->V:Lkb3/i;

    return-void
.end method


# virtual methods
.method public final H()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    iget-object v0, p0, Lja3/i;->S:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/j;

    return-object v0
.end method

.method public final I()Lr93/y0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final K()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    invoke-super {p0}, Lu93/b;->K()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    check-cast v0, Lja3/o;

    return-object v0
.end method

.method public final L()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final N()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final Q()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final U()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final V()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    iget-object v0, p0, Lja3/i;->T:Lja3/d0;

    return-object v0
.end method

.method public final X()Lja3/o;
    .locals 1

    invoke-super {p0}, Lu93/b;->K()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    check-cast v0, Lja3/o;

    return-object v0
.end method

.method public final e()Llb3/q0;
    .locals 1

    iget-object v0, p0, Lja3/i;->P:Lja3/h;

    return-object v0
.end method

.method public final getAnnotations()Ls93/i;
    .locals 1

    iget-object v0, p0, Lja3/i;->U:Lia3/c;

    return-object v0
.end method

.method public final getConstructors()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lja3/i;->Q:Lja3/o;

    iget-object v0, v0, Lja3/o;->q:Lkb3/i;

    invoke-virtual {v0}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public final getKind()Lr93/f;
    .locals 1

    iget-object v0, p0, Lja3/i;->L:Lr93/f;

    return-object v0
.end method

.method public final getVisibility()Lr93/r;
    .locals 3

    sget-object v0, Lr93/q;->a:Lr93/p;

    iget-object v1, p0, Lja3/i;->N:Lr93/m1;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lja3/i;->H:Lx93/n;

    iget-object v0, v0, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v2, Lx93/n;

    invoke-direct {v2, v0}, Lx93/n;-><init>(Ljava/lang/Class;)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_1

    sget-object v0, Lfa3/p;->a:Lfa3/o;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    invoke-static {v1}, Lse/h;->U(Lr93/m1;)Lr93/r;

    move-result-object v0

    return-object v0
.end method

.method public final isInline()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isInner()Z
    .locals 1

    iget-boolean v0, p0, Lja3/i;->O:Z

    return v0
.end method

.method public final isValue()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lja3/i;->V:Lkb3/i;

    invoke-virtual {v0}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final k()Lr93/a0;
    .locals 1

    iget-object v0, p0, Lja3/i;->M:Lr93/a0;

    return-object v0
.end method

.method public final l(Lmb3/f;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 2

    iget-object p1, p0, Lja3/i;->R:Lr93/r0;

    iget-object v0, p1, Lr93/r0;->a:Lu93/b;

    invoke-static {v0}, Lcb3/e;->j(Lr93/k;)Lr93/b0;

    iget-object p1, p1, Lr93/r0;->c:Lkb3/i;

    sget-object v0, Lr93/r0;->e:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {p1, v0}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    check-cast p1, Lja3/o;

    return-object p1
.end method

.method public final o0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final s()Lu93/j;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Lazy Java class "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lcb3/e;->h(Lr93/k;)Lva3/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
