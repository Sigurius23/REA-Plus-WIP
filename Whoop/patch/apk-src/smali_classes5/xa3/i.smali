.class public final Lxa3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxa3/k;


# static fields
.field public static final c:Lxa3/i;

.field public static final d:Lxa3/i;

.field public static final e:Lxa3/i;


# instance fields
.field public final a:Lxa3/l;

.field public final b:Ll83/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lxa3/d;->x:Lxa3/d;

    invoke-static {v0}, Lvo/c;->d(Lkotlin/jvm/functions/Function1;)Lxa3/i;

    sget-object v0, Lxa3/d;->z:Lxa3/d;

    invoke-static {v0}, Lvo/c;->d(Lkotlin/jvm/functions/Function1;)Lxa3/i;

    sget-object v0, Lxa3/d;->E:Lxa3/d;

    invoke-static {v0}, Lvo/c;->d(Lkotlin/jvm/functions/Function1;)Lxa3/i;

    sget-object v0, Lxa3/d;->F:Lxa3/d;

    invoke-static {v0}, Lvo/c;->d(Lkotlin/jvm/functions/Function1;)Lxa3/i;

    sget-object v0, Lxa3/d;->G:Lxa3/d;

    invoke-static {v0}, Lvo/c;->d(Lkotlin/jvm/functions/Function1;)Lxa3/i;

    sget-object v0, Lxa3/d;->H:Lxa3/d;

    invoke-static {v0}, Lvo/c;->d(Lkotlin/jvm/functions/Function1;)Lxa3/i;

    sget-object v0, Lxa3/d;->I:Lxa3/d;

    invoke-static {v0}, Lvo/c;->d(Lkotlin/jvm/functions/Function1;)Lxa3/i;

    move-result-object v0

    sput-object v0, Lxa3/i;->c:Lxa3/i;

    sget-object v0, Lxa3/d;->J:Lxa3/d;

    invoke-static {v0}, Lvo/c;->d(Lkotlin/jvm/functions/Function1;)Lxa3/i;

    sget-object v0, Lxa3/d;->K:Lxa3/d;

    invoke-static {v0}, Lvo/c;->d(Lkotlin/jvm/functions/Function1;)Lxa3/i;

    move-result-object v0

    sput-object v0, Lxa3/i;->d:Lxa3/i;

    sget-object v0, Lxa3/d;->L:Lxa3/d;

    invoke-static {v0}, Lvo/c;->d(Lkotlin/jvm/functions/Function1;)Lxa3/i;

    move-result-object v0

    sput-object v0, Lxa3/i;->e:Lxa3/i;

    sget-object v0, Lxa3/d;->y:Lxa3/d;

    invoke-static {v0}, Lvo/c;->d(Lkotlin/jvm/functions/Function1;)Lxa3/i;

    return-void
.end method

.method public constructor <init>(Lxa3/l;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxa3/i;->a:Lxa3/l;

    new-instance p1, Lfa3/u;

    const/16 v0, 0xe

    invoke-direct {p1, p0, v0}, Lfa3/u;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lxa3/i;->b:Ll83/p;

    return-void
.end method

.method public static W(Ljava/lang/StringBuilder;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/16 v1, 0x20

    if-eqz v0, :cond_1

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v0

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static i0(Llb3/y;)Z
    .locals 1

    invoke-static {p0}, Lcom/squareup/wire/n;->P(Llb3/y;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/u0;

    invoke-virtual {v0}, Llb3/u0;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final o(Lxa3/i;Lr93/n0;Ljava/lang/StringBuilder;)V
    .locals 7

    invoke-virtual {p0}, Lxa3/i;->r()Z

    move-result v0

    iget-object v1, p0, Lxa3/i;->a:Lxa3/l;

    const-string v2, "getTypeParameters(...)"

    const/4 v3, 0x1

    if-nez v0, :cond_8

    iget-object v0, v1, Lxa3/l;->g:Le4/c;

    sget-object v4, Lxa3/l;->Y:[Lj93/z;

    const/4 v5, 0x5

    aget-object v5, v4, v5

    invoke-interface {v0, v1, v5}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v5, 0x0

    if-nez v0, :cond_7

    invoke-interface {p1}, Lr93/b;->c0()Ljava/util/List;

    move-result-object v0

    const-string v6, "getContextReceiverParameters(...)"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, v0}, Lxa3/i;->C(Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {p0}, Lxa3/i;->q()Ljava/util/Set;

    move-result-object v0

    sget-object v6, Lxa3/j;->G:Lxa3/j;

    invoke-interface {v0, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, p2, p1, v0}, Lxa3/i;->y(Ljava/lang/StringBuilder;Ls93/a;Ls93/d;)V

    invoke-interface {p1}, Lr93/n0;->b0()Lu93/v;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v6, Ls93/d;->x:Ls93/d;

    invoke-virtual {p0, p2, v0, v6}, Lxa3/i;->y(Ljava/lang/StringBuilder;Ls93/a;Ls93/d;)V

    :cond_1
    invoke-interface {p1}, Lr93/n0;->C()Lu93/v;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v6, Ls93/d;->J:Ls93/d;

    invoke-virtual {p0, p2, v0, v6}, Lxa3/i;->y(Ljava/lang/StringBuilder;Ls93/a;Ls93/d;)V

    :cond_2
    iget-object v0, v1, Lxa3/l;->H:Le4/c;

    const/16 v6, 0x20

    aget-object v4, v4, v6

    invoke-interface {v0, v1, v4}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxa3/q;

    sget-object v1, Lxa3/q;->x:Lxa3/q;

    if-ne v0, v1, :cond_4

    invoke-interface {p1}, Lr93/n0;->getGetter()Lu93/n0;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object v1, Ls93/d;->E:Ls93/d;

    invoke-virtual {p0, p2, v0, v1}, Lxa3/i;->y(Ljava/lang/StringBuilder;Ls93/a;Ls93/d;)V

    :cond_3
    invoke-interface {p1}, Lr93/n0;->getSetter()Lr93/p0;

    move-result-object v0

    if-eqz v0, :cond_4

    sget-object v1, Ls93/d;->F:Ls93/d;

    invoke-virtual {p0, p2, v0, v1}, Lxa3/i;->y(Ljava/lang/StringBuilder;Ls93/a;Ls93/d;)V

    check-cast v0, Lu93/o0;

    invoke-virtual {v0}, Lu93/o0;->v()Ljava/util/List;

    move-result-object v0

    const-string v1, "getValueParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr93/a1;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v1, Ls93/d;->I:Ls93/d;

    invoke-virtual {p0, p2, v0, v1}, Lxa3/i;->y(Ljava/lang/StringBuilder;Ls93/a;Ls93/d;)V

    :cond_4
    :goto_0
    invoke-interface {p1}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object v0

    const-string v1, "getVisibility(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p2}, Lxa3/i;->g0(Lr93/r;Ljava/lang/StringBuilder;)Z

    invoke-virtual {p0}, Lxa3/i;->q()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lxa3/j;->N:Lxa3/j;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Lr93/b1;->isConst()Z

    move-result v0

    if-eqz v0, :cond_5

    move v0, v3

    goto :goto_1

    :cond_5
    move v0, v5

    :goto_1
    const-string v1, "const"

    invoke-virtual {p0, p2, v0, v1}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lxa3/i;->K(Lr93/z;Ljava/lang/StringBuilder;)V

    invoke-virtual {p0, p1, p2}, Lxa3/i;->M(Lr93/c;Ljava/lang/StringBuilder;)V

    invoke-virtual {p0, p1, p2}, Lxa3/i;->S(Lr93/c;Ljava/lang/StringBuilder;)V

    invoke-virtual {p0}, Lxa3/i;->q()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lxa3/j;->O:Lxa3/j;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Lr93/b1;->d0()Z

    move-result v0

    if-eqz v0, :cond_6

    move v0, v3

    goto :goto_2

    :cond_6
    move v0, v5

    :goto_2
    const-string v1, "lateinit"

    invoke-virtual {p0, p2, v0, v1}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lxa3/i;->J(Lr93/c;Ljava/lang/StringBuilder;)V

    :cond_7
    invoke-virtual {p0, p1, p2, v5}, Lxa3/i;->d0(Lr93/b1;Ljava/lang/StringBuilder;Z)V

    invoke-interface {p1}, Lr93/b;->getTypeParameters()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p2, v3}, Lxa3/i;->c0(Ljava/util/List;Ljava/lang/StringBuilder;Z)V

    invoke-virtual {p0, p1, p2}, Lxa3/i;->U(Lr93/c;Ljava/lang/StringBuilder;)V

    :cond_8
    invoke-virtual {p0, p1, p2, v3}, Lxa3/i;->P(Lr93/k;Ljava/lang/StringBuilder;Z)V

    const-string v0, ": "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lr93/z0;->getType()Llb3/y;

    move-result-object v0

    const-string v1, "getType(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lxa3/i;->V(Lr93/c;Ljava/lang/StringBuilder;)V

    invoke-virtual {p0, p1, p2}, Lxa3/i;->H(Lr93/b1;Ljava/lang/StringBuilder;)V

    invoke-interface {p1}, Lr93/b;->getTypeParameters()Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p1}, Lxa3/i;->h0(Ljava/lang/StringBuilder;Ljava/util/List;)V

    return-void
.end method

.method public static v(Lr93/z;)Lr93/a0;
    .locals 3

    instance-of v0, p0, Lr93/e;

    if-eqz v0, :cond_1

    check-cast p0, Lr93/e;

    invoke-interface {p0}, Lr93/e;->getKind()Lr93/f;

    move-result-object p0

    sget-object v0, Lr93/f;->x:Lr93/f;

    if-ne p0, v0, :cond_0

    sget-object p0, Lr93/a0;->E:Lr93/a0;

    return-object p0

    :cond_0
    sget-object p0, Lr93/a0;->x:Lr93/a0;

    return-object p0

    :cond_1
    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    instance-of v1, v0, Lr93/e;

    if-eqz v1, :cond_2

    check-cast v0, Lr93/e;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_3

    sget-object p0, Lr93/a0;->x:Lr93/a0;

    return-object p0

    :cond_3
    instance-of v1, p0, Lr93/c;

    if-nez v1, :cond_4

    sget-object p0, Lr93/a0;->x:Lr93/a0;

    return-object p0

    :cond_4
    check-cast p0, Lr93/c;

    invoke-interface {p0}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object v1

    const-string v2, "getOverriddenDescriptors(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-interface {v0}, Lr93/e;->k()Lr93/a0;

    move-result-object v1

    sget-object v2, Lr93/a0;->x:Lr93/a0;

    if-eq v1, v2, :cond_5

    sget-object p0, Lr93/a0;->z:Lr93/a0;

    return-object p0

    :cond_5
    invoke-interface {v0}, Lr93/e;->getKind()Lr93/f;

    move-result-object v0

    sget-object v1, Lr93/f;->x:Lr93/f;

    if-ne v0, v1, :cond_7

    invoke-interface {p0}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object v0

    sget-object v1, Lr93/q;->a:Lr93/p;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-interface {p0}, Lr93/z;->k()Lr93/a0;

    move-result-object p0

    sget-object v0, Lr93/a0;->E:Lr93/a0;

    if-ne p0, v0, :cond_6

    return-object v0

    :cond_6
    sget-object p0, Lr93/a0;->z:Lr93/a0;

    return-object p0

    :cond_7
    sget-object p0, Lr93/a0;->x:Lr93/a0;

    return-object p0
.end method

.method public static synthetic z(Lxa3/i;Ljava/lang/StringBuilder;Ls93/a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lxa3/i;->y(Ljava/lang/StringBuilder;Ls93/a;Ls93/d;)V

    return-void
.end method


# virtual methods
.method public final A(Lr93/i;Ljava/lang/StringBuilder;)V
    .locals 3

    invoke-interface {p1}, Lr93/i;->j()Ljava/util/List;

    move-result-object v0

    const-string v1, "getDeclaredTypeParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/h;->e()Llb3/q0;

    move-result-object v1

    invoke-interface {v1}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v1

    const-string v2, "getParameters(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lxa3/i;->u()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Lr93/i;->isInner()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-le p1, v2, :cond_0

    const-string p1, " /*captured type parameters: "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v1, p1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lxa3/i;->b0(Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string p1, "*/"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method public final B(Lab3/g;)Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v1, v0, Lxa3/l;->v:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/16 v3, 0x14

    aget-object v2, v2, v3

    invoke-interface {v1, v0, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    instance-of v0, p1, Lab3/b;

    if-eqz v0, :cond_3

    check-cast p1, Lab3/b;

    invoke-virtual {p1}, Lab3/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lab3/g;

    invoke-virtual {p0, v1}, Lxa3/i;->B(Lab3/g;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    const/16 v5, 0x38

    const-string v1, ", "

    const-string v2, "{"

    const-string v3, "}"

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of v0, p1, Lab3/a;

    if-eqz v0, :cond_4

    check-cast p1, Lab3/a;

    invoke-virtual {p1}, Lab3/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls93/b;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lxa3/i;->x(Ls93/b;Ls93/d;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "@"

    invoke-static {p1, v0}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of v0, p1, Lab3/t;

    if-eqz v0, :cond_8

    check-cast p1, Lab3/t;

    invoke-virtual {p1}, Lab3/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lab3/s;

    instance-of v0, p1, Lab3/q;

    const-string v1, "::class"

    if-eqz v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast p1, Lab3/q;

    invoke-virtual {p1}, Lab3/q;->a()Llb3/y;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of v0, p1, Lab3/r;

    if-eqz v0, :cond_7

    check-cast p1, Lab3/r;

    invoke-virtual {p1}, Lab3/r;->b()Lva3/c;

    move-result-object v0

    invoke-virtual {v0}, Lva3/c;->a()Lva3/e;

    move-result-object v0

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    iget-object v0, v0, Lva3/f;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lab3/r;->a()I

    move-result p1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p1, :cond_6

    const-string v3, "kotlin.Array<"

    const/16 v4, 0x3e

    invoke-static {v4, v3, v0}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    invoke-static {v0, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    invoke-virtual {p1}, Lab3/g;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final C(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 5

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "context("

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v0, p2

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v2, v1, 0x1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr93/q0;

    check-cast v3, Lu93/d;

    invoke-virtual {v3}, Lu93/d;->getType()Llb3/y;

    move-result-object v3

    const-string v4, "getType(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x1

    invoke-virtual {p0, v3, v4}, Lxa3/i;->G(Llb3/y;Z)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v3

    if-ne v1, v3, :cond_0

    const-string v1, ") "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const-string v1, ", "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    move v1, v2

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final D(Ljava/lang/StringBuilder;Llb3/c0;)V
    .locals 5

    invoke-static {p0, p1, p2}, Lxa3/i;->z(Lxa3/i;Ljava/lang/StringBuilder;Ls93/a;)V

    invoke-static {p2}, Llb3/o;->e(Llb3/y;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-static {p2}, Lio/sentry/config/a;->N(Llb3/c0;)Z

    move-result v0

    iget-object v2, p0, Lxa3/i;->a:Lxa3/l;

    if-eqz v0, :cond_0

    iget-object v0, v2, Lxa3/l;->V:Le4/c;

    sget-object v3, Lxa3/l;->Y:[Lj93/z;

    const/16 v4, 0x2f

    aget-object v3, v3, v4

    invoke-interface {v0, v2, v3}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lnb3/l;->a:Lnb3/l;

    invoke-static {p2}, Lio/sentry/config/a;->N(Llb3/c0;)Z

    invoke-virtual {p2}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lnb3/j;

    iget-object v0, v0, Lnb3/j;->x:[Ljava/lang/String;

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lxa3/i;->E(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_0
    instance-of v0, p2, Lnb3/i;

    if-eqz v0, :cond_1

    iget-object v0, v2, Lxa3/l;->X:Le4/c;

    sget-object v1, Lxa3/l;->Y:[Lj93/z;

    const/16 v3, 0x31

    aget-object v1, v1, v3

    invoke-interface {v0, v2, v1}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p2

    check-cast v0, Lnb3/i;

    iget-object v0, v0, Lnb3/i;->H:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {p2}, Llb3/y;->X()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lxa3/i;->Y(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-virtual {p2}, Llb3/y;->i0()Llb3/q0;

    move-result-object v2

    invoke-interface {v2}, Llb3/q0;->d()Lr93/h;

    move-result-object v2

    instance-of v3, v2, Lr93/i;

    if-eqz v3, :cond_3

    check-cast v2, Lr93/i;

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    invoke-static {p2, v2, v1}, Ljc/x;->k(Llb3/c0;Lr93/i;I)Lq30/w0;

    move-result-object v1

    if-nez v1, :cond_4

    invoke-virtual {p0, v0}, Lxa3/i;->Z(Llb3/q0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Llb3/y;->X()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lxa3/i;->Y(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    invoke-virtual {p0, p1, v1}, Lxa3/i;->T(Ljava/lang/StringBuilder;Lq30/w0;)V

    :goto_2
    invoke-virtual {p2}, Llb3/y;->k0()Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "?"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    instance-of p2, p2, Llb3/l;

    if-eqz p2, :cond_6

    const-string p2, " & Any"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    return-void
.end method

.method public final E(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lxa3/i;->s()Lxa3/t;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const-string v0, "<font color=red><b>"

    const-string v1, "</b></font>"

    invoke-static {v0, p1, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    return-object p1
.end method

.method public final F(Ljava/lang/String;Ljava/lang/String;Lo93/h;)Ljava/lang/String;
    .locals 4

    const-string v0, "lowerRendered"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upperRendered"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lv63/b;->m(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    const-string v1, "("

    if-eqz v0, :cond_1

    const/4 p3, 0x0

    invoke-static {p2, v1, p3}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, ")!"

    invoke-static {v1, p1, p2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p2, "!"

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Lxa3/f;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p3, v2}, Lxa3/f;-><init>(Lxa3/i;Lo93/h;I)V

    new-instance v2, Lxa3/f;

    const/4 v3, 0x1

    invoke-direct {v2, p0, p3, v3}, Lxa3/f;-><init>(Lxa3/i;Lo93/h;I)V

    new-instance p3, Lv20/g;

    invoke-direct {p3, p0}, Lv20/g;-><init>(Lxa3/i;)V

    invoke-static {p1, p2, v0, v2, p3}, Lv63/b;->i(Ljava/lang/String;Ljava/lang/String;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".."

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    return-object p3
.end method

.method public final G(Llb3/y;Z)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0, p1}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lxa3/i;->i0(Llb3/y;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Llb3/d1;->e(Llb3/y;)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_0
    instance-of v1, p1, Llb3/l;

    if-nez v1, :cond_2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object p1

    invoke-interface {p1}, Ls93/i;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :goto_0
    const-string p1, "("

    const/16 p2, 0x29

    invoke-static {p2, p1, v0}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final H(Lr93/b1;Ljava/lang/StringBuilder;)V
    .locals 4

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v1, v0, Lxa3/l;->u:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/16 v3, 0x13

    aget-object v2, v2, v3

    invoke-interface {v1, v0, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lr93/b1;->W()Lab3/g;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lxa3/i;->B(Lab3/g;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, " = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lxa3/i;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method public final I(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lxa3/i;->s()Lxa3/t;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v1, v0, Lxa3/l;->W:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/16 v3, 0x30

    aget-object v2, v2, v3

    invoke-interface {v1, v0, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "<b>"

    const-string v1, "</b>"

    invoke-static {v0, p1, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    return-object p1
.end method

.method public final J(Lr93/c;Ljava/lang/StringBuilder;)V
    .locals 2

    invoke-virtual {p0}, Lxa3/i;->q()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lxa3/j;->I:Lxa3/j;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lxa3/i;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lr93/c;->getKind()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const-string v0, "/*"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lr93/c;->getKind()I

    move-result p1

    invoke-static {p1}, Lq63/c;->C(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lsb3/a;->u(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "*/ "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    :goto_0
    return-void
.end method

.method public final K(Lr93/z;Ljava/lang/StringBuilder;)V
    .locals 4

    invoke-interface {p1}, Lr93/z;->isExternal()Z

    move-result v0

    const-string v1, "external"

    invoke-virtual {p0, p2, v0, v1}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-virtual {p0}, Lxa3/i;->q()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lxa3/j;->L:Lxa3/j;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lr93/z;->U()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v3, "expect"

    invoke-virtual {p0, p2, v0, v3}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-virtual {p0}, Lxa3/i;->q()Ljava/util/Set;

    move-result-object v0

    sget-object v3, Lxa3/j;->M:Lxa3/j;

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lr93/z;->L()Z

    move-result p1

    if-eqz p1, :cond_1

    move v1, v2

    :cond_1
    const-string p1, "actual"

    invoke-virtual {p0, p2, v1, p1}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    return-void
.end method

.method public final L(Lr93/a0;Ljava/lang/StringBuilder;Lr93/a0;)V
    .locals 4

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v1, v0, Lxa3/l;->p:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/16 v3, 0xe

    aget-object v2, v2, v3

    invoke-interface {v1, v0, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    if-ne p1, p3, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lxa3/i;->q()Ljava/util/Set;

    move-result-object p3

    sget-object v0, Lxa3/j;->E:Lxa3/j;

    invoke-interface {p3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lsb3/a;->u(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2, p3, p1}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    return-void
.end method

.method public final M(Lr93/c;Ljava/lang/StringBuilder;)V
    .locals 4

    invoke-static {p1}, Lya3/f;->q(Lr93/k;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lr93/z;->k()Lr93/a0;

    move-result-object v0

    sget-object v1, Lr93/a0;->x:Lr93/a0;

    if-eq v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v1, v0, Lxa3/l;->B:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/16 v3, 0x1a

    aget-object v2, v2, v3

    invoke-interface {v1, v0, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxa3/o;

    sget-object v1, Lxa3/o;->w:Lxa3/o;

    if-ne v0, v1, :cond_2

    invoke-interface {p1}, Lr93/z;->k()Lr93/a0;

    move-result-object v0

    sget-object v1, Lr93/a0;->z:Lr93/a0;

    if-ne v0, v1, :cond_2

    invoke-interface {p1}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    return-void

    :cond_2
    invoke-interface {p1}, Lr93/z;->k()Lr93/a0;

    move-result-object v0

    const-string v1, "getModality(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lxa3/i;->v(Lr93/z;)Lr93/a0;

    move-result-object p1

    invoke-virtual {p0, v0, p2, p1}, Lxa3/i;->L(Lr93/a0;Ljava/lang/StringBuilder;Lr93/a0;)V

    return-void
.end method

.method public final N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p0, p3}, Lxa3/i;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method public final O(Lva3/h;Z)Ljava/lang/String;
    .locals 4

    invoke-static {p1}, Lv63/b;->h(Lva3/h;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lxa3/i;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v1, v0, Lxa3/l;->W:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/16 v3, 0x30

    aget-object v2, v2, v3

    invoke-interface {v1, v0, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lxa3/i;->s()Lxa3/t;

    move-result-object v0

    sget-object v1, Lxa3/t;->x:Lxa3/r;

    if-ne v0, v1, :cond_0

    if-eqz p2, :cond_0

    const-string p2, "<b>"

    const-string v0, "</b>"

    invoke-static {p2, p1, v0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public final P(Lr93/k;Ljava/lang/StringBuilder;Z)V
    .locals 1

    invoke-interface {p1}, Lr93/k;->getName()Lva3/h;

    move-result-object p1

    const-string v0, "getName(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p3}, Lxa3/i;->O(Lva3/h;Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final Q(Ljava/lang/StringBuilder;Llb3/y;)V
    .locals 8

    invoke-virtual {p2}, Llb3/y;->p0()Llb3/f1;

    move-result-object v0

    instance-of v1, v0, Llb3/a;

    if-eqz v1, :cond_0

    check-cast v0, Llb3/a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_5

    iget-object p2, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v1, p2, Lxa3/l;->R:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/16 v3, 0x2a

    aget-object v3, v2, v3

    invoke-interface {v1, p2, v3}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const-string v3, "</i></font>"

    const-string v4, " */"

    const-string v5, " /* "

    const-string v6, "<font color=\"808080\"><i>"

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Llb3/a;->A0()Llb3/c0;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lxa3/i;->R(Ljava/lang/StringBuilder;Llb3/y;)V

    iget-object v1, p2, Lxa3/l;->S:Le4/c;

    const/16 v7, 0x2b

    aget-object v2, v2, v7

    invoke-interface {v1, p2, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lxa3/i;->s()Lxa3/t;

    move-result-object p2

    sget-object v1, Lxa3/t;->x:Lxa3/r;

    if-ne p2, v1, :cond_1

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "from: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Llb3/a;->z0()Llb3/c0;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lxa3/i;->R(Ljava/lang/StringBuilder;Llb3/y;)V

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lxa3/i;->s()Lxa3/t;

    move-result-object p2

    if-ne p2, v1, :cond_4

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_2
    invoke-virtual {v0}, Llb3/a;->z0()Llb3/c0;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lxa3/i;->R(Ljava/lang/StringBuilder;Llb3/y;)V

    iget-object v1, p2, Lxa3/l;->Q:Le4/c;

    const/16 v7, 0x29

    aget-object v2, v2, v7

    invoke-interface {v1, p2, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lxa3/i;->s()Lxa3/t;

    move-result-object p2

    sget-object v1, Lxa3/t;->x:Lxa3/r;

    if-ne p2, v1, :cond_3

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "= "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Llb3/a;->A0()Llb3/c0;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lxa3/i;->R(Ljava/lang/StringBuilder;Llb3/y;)V

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lxa3/i;->s()Lxa3/t;

    move-result-object p2

    if-ne p2, v1, :cond_4

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    return-void

    :cond_5
    invoke-virtual {p0, p1, p2}, Lxa3/i;->R(Ljava/lang/StringBuilder;Llb3/y;)V

    return-void
.end method

.method public final R(Ljava/lang/StringBuilder;Llb3/y;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, Lxa3/i;->a:Lxa3/l;

    instance-of v4, v2, Llb3/z;

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Lxa3/l;->o()Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v4, v2

    check-cast v4, Llb3/z;

    iget-object v4, v4, Llb3/z;->z:Lkb3/i;

    iget-object v5, v4, Lkb3/h;->y:Ljava/lang/Object;

    sget-object v6, Lkb3/j;->w:Lkb3/j;

    if-eq v5, v6, :cond_0

    iget-object v4, v4, Lkb3/h;->y:Ljava/lang/Object;

    sget-object v5, Lkb3/j;->x:Lkb3/j;

    if-eq v4, v5, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "<Not computed yet>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_1
    :goto_0
    invoke-virtual {v2}, Llb3/y;->p0()Llb3/f1;

    move-result-object v2

    instance-of v4, v2, Llb3/r;

    if-eqz v4, :cond_2

    check-cast v2, Llb3/r;

    invoke-virtual {v2, v0, v0}, Llb3/r;->v0(Lxa3/i;Lxa3/i;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_2
    instance-of v4, v2, Llb3/c0;

    if-eqz v4, :cond_21

    check-cast v2, Llb3/c0;

    sget-object v4, Llb3/d1;->b:Lnb3/i;

    invoke-virtual {v2, v4}, Llb3/y;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v5, "???"

    if-nez v4, :cond_20

    invoke-virtual {v2}, Llb3/y;->i0()Llb3/q0;

    move-result-object v4

    sget-object v6, Llb3/d1;->a:Lnb3/i;

    iget-object v6, v6, Lnb3/i;->x:Llb3/q0;

    if-ne v4, v6, :cond_3

    goto/16 :goto_c

    :cond_3
    invoke-virtual {v2}, Llb3/y;->i0()Llb3/q0;

    move-result-object v4

    instance-of v6, v4, Lnb3/j;

    const/4 v7, 0x0

    if-eqz v6, :cond_5

    check-cast v4, Lnb3/j;

    iget-object v4, v4, Lnb3/j;->w:Lnb3/k;

    sget-object v6, Lnb3/k;->J:Lnb3/k;

    if-ne v4, v6, :cond_5

    iget-object v4, v3, Lxa3/l;->t:Le4/c;

    sget-object v6, Lxa3/l;->Y:[Lj93/z;

    const/16 v8, 0x12

    aget-object v6, v6, v8

    invoke-interface {v4, v3, v6}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Llb3/y;->i0()Llb3/q0;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lnb3/j;

    iget-object v2, v2, Lnb3/j;->x:[Ljava/lang/String;

    aget-object v2, v2, v7

    invoke-virtual {v0, v2}, Lxa3/i;->E(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_4
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_5
    invoke-static {v2}, Llb3/o;->e(Llb3/y;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v0, v1, v2}, Lxa3/i;->D(Ljava/lang/StringBuilder;Llb3/c0;)V

    return-void

    :cond_6
    invoke-static {v2}, Lxa3/i;->i0(Llb3/y;)Z

    move-result v4

    if-eqz v4, :cond_1f

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    iget-object v6, v0, Lxa3/i;->b:Ll83/p;

    invoke-virtual {v6}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lxa3/i;

    invoke-static {v6, v1, v2}, Lxa3/i;->z(Lxa3/i;Ljava/lang/StringBuilder;Ls93/a;)V

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    const/4 v8, 0x1

    if-eq v6, v4, :cond_7

    move v6, v8

    goto :goto_1

    :cond_7
    move v6, v7

    :goto_1
    invoke-static {v2}, Lcom/squareup/wire/n;->L(Llb3/y;)Llb3/y;

    move-result-object v9

    invoke-static {v2}, Lcom/squareup/wire/n;->E(Llb3/y;)Ljava/util/List;

    move-result-object v10

    invoke-static {v2}, Lcom/squareup/wire/n;->R(Llb3/y;)Z

    move-result v11

    invoke-virtual {v2}, Llb3/y;->k0()Z

    move-result v12

    if-nez v12, :cond_9

    if-eqz v6, :cond_8

    if-eqz v9, :cond_8

    goto :goto_2

    :cond_8
    move v13, v7

    goto :goto_3

    :cond_9
    :goto_2
    move v13, v8

    :goto_3
    const-string v14, "("

    if-eqz v13, :cond_c

    if-eqz v11, :cond_a

    const/16 v6, 0x28

    invoke-virtual {v1, v4, v6}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_a
    if-eqz v6, :cond_b

    invoke-static {v1}, Lyb3/r;->j0(Ljava/lang/CharSequence;)C

    move-result v4

    invoke-static {v4}, Lva3/d;->i(C)Z

    invoke-static {v1}, Lyb3/r;->c0(Ljava/lang/CharSequence;)I

    move-result v4

    sub-int/2addr v4, v8

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v4

    const/16 v6, 0x29

    if-eq v4, v6, :cond_b

    invoke-static {v1}, Lyb3/r;->c0(Ljava/lang/CharSequence;)I

    move-result v4

    const-string v6, "()"

    invoke-virtual {v1, v4, v6}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    :cond_b
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_c
    :goto_4
    const-string v4, "suspend"

    invoke-virtual {v0, v1, v11, v4}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    move-object v4, v10

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    const-string v6, ") "

    const-string v11, ", "

    if-nez v4, :cond_e

    const-string v4, "context("

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v4

    invoke-interface {v10, v7, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Llb3/y;

    invoke-virtual {v0, v1, v15}, Lxa3/i;->Q(Ljava/lang/StringBuilder;Llb3/y;)V

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_d
    invoke-static {v10}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llb3/y;

    invoke-virtual {v0, v1, v4}, Lxa3/i;->Q(Ljava/lang/StringBuilder;Llb3/y;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_e
    const-string v4, ")"

    if-eqz v9, :cond_15

    invoke-static {v9}, Lxa3/i;->i0(Llb3/y;)Z

    move-result v10

    if-eqz v10, :cond_f

    invoke-virtual {v9}, Llb3/y;->k0()Z

    move-result v10

    if-eqz v10, :cond_12

    :cond_f
    invoke-static {v9}, Lcom/squareup/wire/n;->R(Llb3/y;)Z

    move-result v10

    if-nez v10, :cond_12

    invoke-virtual {v9}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object v10

    invoke-interface {v10}, Ls93/i;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_10

    goto :goto_6

    :cond_10
    instance-of v10, v9, Llb3/l;

    if-eqz v10, :cond_11

    goto :goto_6

    :cond_11
    move v10, v7

    goto :goto_7

    :cond_12
    :goto_6
    move v10, v8

    :goto_7
    if-eqz v10, :cond_13

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_13
    invoke-virtual {v0, v1, v9}, Lxa3/i;->Q(Ljava/lang/StringBuilder;Llb3/y;)V

    if-eqz v10, :cond_14

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_14
    const-string v9, "."

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_15
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lcom/squareup/wire/n;->O(Llb3/y;)Z

    move-result v9

    if-eqz v9, :cond_16

    invoke-virtual {v2}, Llb3/y;->X()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    if-gt v9, v8, :cond_16

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_a

    :cond_16
    invoke-static {v2}, Lcom/squareup/wire/n;->N(Llb3/y;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v9, v7

    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1a

    add-int/lit8 v10, v9, 0x1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Llb3/u0;

    if-lez v9, :cond_17

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_17
    iget-object v9, v3, Lxa3/l;->U:Le4/c;

    sget-object v15, Lxa3/l;->Y:[Lj93/z;

    const/16 v16, 0x2d

    aget-object v15, v15, v16

    invoke-interface {v9, v3, v15}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_18

    invoke-virtual {v14}, Llb3/u0;->b()Llb3/y;

    move-result-object v9

    const-string v15, "getType(...)"

    invoke-static {v9, v15}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, Lcom/squareup/wire/n;->w(Llb3/y;)Lva3/h;

    move-result-object v9

    goto :goto_9

    :cond_18
    const/4 v9, 0x0

    :goto_9
    if-eqz v9, :cond_19

    invoke-virtual {v0, v9, v7}, Lxa3/i;->O(Lva3/h;Z)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ": "

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_19
    const-string v9, "typeProjection"

    invoke-static {v14, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v16, Ljava/lang/StringBuilder;

    invoke-direct/range {v16 .. v16}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v14}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    move-object v15, v9

    check-cast v15, Ljava/lang/Iterable;

    new-instance v9, Lxa3/h;

    const/4 v14, 0x0

    invoke-direct {v9, v0, v14}, Lxa3/h;-><init>(Lxa3/i;I)V

    const/16 v21, 0x3c

    const-string v17, ", "

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v20, v9

    invoke-static/range {v15 .. v21}, Lm83/s;->M0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v9, v10

    goto :goto_8

    :cond_1a
    :goto_a
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lxa3/i;->s()Lxa3/t;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    if-eqz v3, :cond_1c

    if-ne v3, v8, :cond_1b

    const-string v3, "&rarr;"

    goto :goto_b

    :cond_1b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_1c
    const-string v3, "->"

    invoke-virtual {v0, v3}, Lxa3/i;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :goto_b
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lcom/squareup/wire/n;->M(Llb3/y;)Llb3/y;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lxa3/i;->Q(Ljava/lang/StringBuilder;Llb3/y;)V

    if-eqz v13, :cond_1d

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1d
    if-eqz v12, :cond_1e

    const-string v2, "?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1e
    return-void

    :cond_1f
    invoke-virtual {v0, v1, v2}, Lxa3/i;->D(Ljava/lang/StringBuilder;Llb3/c0;)V

    return-void

    :cond_20
    :goto_c
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_21
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public final S(Lr93/c;Ljava/lang/StringBuilder;)V
    .locals 4

    invoke-virtual {p0}, Lxa3/i;->q()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lxa3/j;->F:Lxa3/j;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v1, v0, Lxa3/l;->B:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/16 v3, 0x1a

    aget-object v2, v2, v3

    invoke-interface {v1, v0, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxa3/o;

    sget-object v1, Lxa3/o;->x:Lxa3/o;

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    const-string v1, "override"

    invoke-virtual {p0, p2, v0, v1}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-virtual {p0}, Lxa3/i;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "/*"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "*/ "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    :goto_0
    return-void
.end method

.method public final T(Ljava/lang/StringBuilder;Lq30/w0;)V
    .locals 2

    invoke-virtual {p2}, Lq30/w0;->u()Lq30/w0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, v0}, Lxa3/i;->T(Ljava/lang/StringBuilder;Lq30/w0;)V

    const/16 v0, 0x2e

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lq30/w0;->s()Lr93/i;

    move-result-object v0

    invoke-interface {v0}, Lr93/k;->getName()Lva3/h;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lxa3/i;->O(Lva3/h;Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lq30/w0;->s()Lr93/i;

    move-result-object v0

    invoke-interface {v0}, Lr93/h;->e()Llb3/q0;

    move-result-object v0

    const-string v1, "getTypeConstructor(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lxa3/i;->Z(Llb3/q0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {p2}, Lq30/w0;->r()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p2}, Lxa3/i;->Y(Ljava/util/List;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final U(Lr93/c;Ljava/lang/StringBuilder;)V
    .locals 1

    invoke-interface {p1}, Lr93/b;->B()Lr93/q0;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, Ls93/d;->G:Ls93/d;

    invoke-virtual {p0, p2, p1, v0}, Lxa3/i;->y(Ljava/lang/StringBuilder;Ls93/a;Ls93/d;)V

    check-cast p1, Lu93/d;

    invoke-virtual {p1}, Lu93/d;->getType()Llb3/y;

    move-result-object p1

    const-string v0, "getType(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lxa3/i;->G(Llb3/y;Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method public final V(Lr93/c;Ljava/lang/StringBuilder;)V
    .locals 4

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v1, v0, Lxa3/l;->F:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/16 v3, 0x1e

    aget-object v2, v2, v3

    invoke-interface {v1, v0, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lr93/b;->B()Lr93/q0;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, " on "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast p1, Lu93/d;

    invoke-virtual {p1}, Lu93/d;->getType()Llb3/y;

    move-result-object p1

    const-string v0, "getType(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    :goto_0
    return-void
.end method

.method public final X(Llb3/y;)Ljava/lang/String;
    .locals 5

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v2, v1, Lxa3/l;->y:Le4/c;

    sget-object v3, Lxa3/l;->Y:[Lj93/z;

    const/16 v4, 0x17

    aget-object v3, v3, v4

    invoke-interface {v2, v1, v3}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llb3/y;

    invoke-virtual {p0, v0, p1}, Lxa3/i;->Q(Ljava/lang/StringBuilder;Llb3/y;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final Y(Ljava/util/List;)Ljava/lang/String;
    .locals 7

    const-string v0, "typeArguments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "<"

    invoke-virtual {p0, v0}, Lxa3/i;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Lxa3/h;

    const/4 p1, 0x0

    invoke-direct {v5, p0, p1}, Lxa3/h;-><init>(Lxa3/i;I)V

    const/16 v6, 0x3c

    const-string v2, ", "

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lm83/s;->M0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    const-string p1, ">"

    invoke-virtual {p0, p1}, Lxa3/i;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final Z(Llb3/q0;)Ljava/lang/String;
    .locals 4

    const-string v0, "typeConstructor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    instance-of v1, v0, Lr93/x0;

    if-nez v1, :cond_3

    instance-of v1, v0, Lr93/e;

    if-nez v1, :cond_3

    instance-of v1, v0, Lr93/w0;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    if-nez v0, :cond_2

    instance-of v0, p1, Llb3/x;

    if-eqz v0, :cond_1

    check-cast p1, Llb3/x;

    sget-object v0, Lxa3/g;->x:Lxa3/g;

    invoke-virtual {p1, v0}, Llb3/x;->e(Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected classifier: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    const-string p1, "klass"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lnb3/l;->f(Lr93/k;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {v0}, Lr93/h;->e()Llb3/q0;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    iget-object p1, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v1, p1, Lxa3/l;->b:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-interface {v1, p1, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxa3/c;

    invoke-interface {p1, v0, p0}, Lxa3/c;->a(Lr93/h;Lxa3/i;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a()V
    .locals 1

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    invoke-virtual {v0}, Lxa3/l;->a()V

    return-void
.end method

.method public final a0(Lr93/x0;Ljava/lang/StringBuilder;Z)V
    .locals 7

    if-eqz p3, :cond_0

    const-string v0, "<"

    invoke-virtual {p0, v0}, Lxa3/i;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0}, Lxa3/i;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "/*"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lr93/x0;->getIndex()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "*/ "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-interface {p1}, Lr93/x0;->isReified()Z

    move-result v0

    const-string v1, "reified"

    invoke-virtual {p0, p2, v0, v1}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-interface {p1}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object v0

    iget-object v0, v0, Llb3/g1;->w:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lez v1, :cond_2

    move v1, v3

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    invoke-virtual {p0, p2, v1, v0}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p2, p1, v0}, Lxa3/i;->y(Ljava/lang/StringBuilder;Ls93/a;Ls93/d;)V

    invoke-virtual {p0, p1, p2, p3}, Lxa3/i;->P(Lr93/k;Ljava/lang/StringBuilder;Z)V

    invoke-interface {p1}, Lr93/x0;->getUpperBounds()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/16 v4, 0x8d

    const-string v5, " : "

    if-le v1, v3, :cond_3

    if-eqz p3, :cond_4

    :cond_3
    if-ne v1, v3, :cond_7

    :cond_4
    invoke-interface {p1}, Lr93/x0;->getUpperBounds()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llb3/y;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lo93/h;->y(Llb3/y;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Llb3/y;->k0()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_6
    invoke-static {v4}, Lo93/h;->a(I)V

    throw v0

    :cond_7
    if-eqz p3, :cond_b

    invoke-interface {p1}, Lr93/x0;->getUpperBounds()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llb3/y;

    if-eqz v1, :cond_a

    invoke-static {v1}, Lo93/h;->y(Llb3/y;)Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-virtual {v1}, Llb3/y;->k0()Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_1

    :cond_8
    if-eqz v3, :cond_9

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_9
    const-string v3, " & "

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    invoke-virtual {p0, v1}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v3, v2

    goto :goto_1

    :cond_a
    invoke-static {v4}, Lo93/h;->a(I)V

    throw v0

    :cond_b
    :goto_3
    if-eqz p3, :cond_c

    const-string p1, ">"

    invoke-virtual {p0, p1}, Lxa3/i;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_c
    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    invoke-virtual {v0}, Lxa3/l;->b()V

    return-void
.end method

.method public final b0(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr93/x0;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lxa3/i;->a0(Lr93/x0;Ljava/lang/StringBuilder;Z)V

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ", "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final c(Lxa3/c;)V
    .locals 1

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    invoke-virtual {v0, p1}, Lxa3/l;->c(Lxa3/c;)V

    return-void
.end method

.method public final c0(Ljava/util/List;Ljava/lang/StringBuilder;Z)V
    .locals 4

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v1, v0, Lxa3/l;->w:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/16 v3, 0x15

    aget-object v2, v2, v3

    invoke-interface {v1, v0, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "<"

    invoke-virtual {p0, v0}, Lxa3/i;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2, p1}, Lxa3/i;->b0(Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string p1, ">"

    invoke-virtual {p0, p1}, Lxa3/i;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_1

    const-string p1, " "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    :goto_0
    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    invoke-virtual {v0}, Lxa3/l;->d()V

    return-void
.end method

.method public final d0(Lr93/b1;Ljava/lang/StringBuilder;Z)V
    .locals 0

    if-nez p3, :cond_1

    instance-of p3, p1, Lr93/a1;

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-interface {p1}, Lr93/b1;->A()Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "var"

    goto :goto_1

    :cond_2
    const-string p1, "val"

    :goto_1
    invoke-virtual {p0, p1}, Lxa3/i;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    invoke-virtual {v0}, Lxa3/l;->e()V

    return-void
.end method

.method public final e0(Lr93/a1;ZLjava/lang/StringBuilder;Z)V
    .locals 11

    if-eqz p4, :cond_0

    const-string v0, "value-parameter"

    invoke-virtual {p0, v0}, Lxa3/i;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0}, Lxa3/i;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "/*"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v0, p1

    check-cast v0, Lu93/w0;

    iget v0, v0, Lu93/w0;->G:I

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "*/ "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, p3, p1, v0}, Lxa3/i;->y(Ljava/lang/StringBuilder;Ls93/a;Ls93/d;)V

    move-object v1, p1

    check-cast v1, Lu93/w0;

    iget-boolean v2, v1, Lu93/w0;->I:Z

    const-string v3, "crossinline"

    invoke-virtual {p0, p3, v2, v3}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    iget-boolean v2, v1, Lu93/w0;->J:Z

    const-string v3, "noinline"

    invoke-virtual {p0, p3, v2, v3}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    iget-object v2, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v3, v2, Lxa3/l;->r:Le4/c;

    sget-object v4, Lxa3/l;->Y:[Lj93/z;

    const/16 v5, 0x10

    aget-object v5, v4, v5

    invoke-interface {v3, v2, v5}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v3, :cond_3

    invoke-virtual {v1}, Lu93/w0;->K0()Lr93/b;

    move-result-object v3

    instance-of v7, v3, Lu93/j;

    if-eqz v7, :cond_2

    move-object v0, v3

    check-cast v0, Lu93/j;

    :cond_2
    if-eqz v0, :cond_3

    iget-boolean v0, v0, Lu93/j;->e0:Z

    if-ne v0, v6, :cond_3

    move v0, v6

    goto :goto_0

    :cond_3
    move v0, v5

    :goto_0
    if-eqz v0, :cond_4

    iget-object v3, v2, Lxa3/l;->s:Le4/c;

    const/16 v7, 0x11

    aget-object v7, v4, v7

    invoke-interface {v3, v2, v7}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const-string v7, "actual"

    invoke-virtual {p0, p3, v3, v7}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    :cond_4
    move-object v3, p1

    check-cast v3, Lu93/x0;

    invoke-virtual {v3}, Lu93/x0;->getType()Llb3/y;

    move-result-object v3

    const-string v7, "getType(...)"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v1, Lu93/w0;->K:Llb3/y;

    if-nez v7, :cond_5

    move-object v8, v3

    goto :goto_1

    :cond_5
    move-object v8, v7

    :goto_1
    if-eqz v7, :cond_6

    move v9, v6

    goto :goto_2

    :cond_6
    move v9, v5

    :goto_2
    const-string v10, "vararg"

    invoke-virtual {p0, p3, v9, v10}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    if-nez v0, :cond_7

    if-eqz p4, :cond_8

    invoke-virtual {p0}, Lxa3/i;->r()Z

    move-result v9

    if-nez v9, :cond_8

    :cond_7
    invoke-virtual {p0, p1, p3, v0}, Lxa3/i;->d0(Lr93/b1;Ljava/lang/StringBuilder;Z)V

    :cond_8
    if-eqz p2, :cond_9

    invoke-virtual {p0, p1, p3, p4}, Lxa3/i;->P(Lr93/k;Ljava/lang/StringBuilder;Z)V

    const-string p2, ": "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    invoke-virtual {p0, v8}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p3}, Lxa3/i;->H(Lr93/b1;Ljava/lang/StringBuilder;)V

    invoke-virtual {p0}, Lxa3/i;->u()Z

    move-result p2

    if-eqz p2, :cond_a

    if-eqz v7, :cond_a

    const-string p2, " /*"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "*/"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_a
    iget-object p2, v2, Lxa3/l;->z:Le4/c;

    const/16 p4, 0x18

    aget-object v0, v4, p4

    invoke-interface {p2, v2, v0}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlin/jvm/functions/Function1;

    if-eqz p2, :cond_c

    invoke-virtual {v2}, Lxa3/l;->o()Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-virtual {v1}, Lu93/w0;->J0()Z

    move-result p2

    goto :goto_3

    :cond_b
    invoke-static {p1}, Lcb3/e;->a(Lr93/a1;)Z

    move-result p2

    :goto_3
    if-eqz p2, :cond_c

    move v5, v6

    :cond_c
    if-eqz v5, :cond_d

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, " = "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v2, Lxa3/l;->z:Le4/c;

    aget-object p4, v4, p4

    invoke-interface {v0, v2, p4}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lkotlin/jvm/functions/Function1;

    invoke-static {p4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_d
    return-void
.end method

.method public final f()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    invoke-virtual {v0}, Lxa3/l;->f()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final f0(Ljava/util/Collection;ZLjava/lang/StringBuilder;)V
    .locals 7

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v1, v0, Lxa3/l;->E:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/16 v3, 0x1d

    aget-object v2, v2, v3

    invoke-interface {v1, v0, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxa3/p;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v2, :cond_2

    const/4 p2, 0x2

    if-ne v0, p2, :cond_1

    :cond_0
    move p2, v1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    if-nez p2, :cond_0

    :cond_3
    move p2, v2

    :goto_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-virtual {p0}, Lxa3/i;->t()Lxa3/e;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "builder"

    invoke-static {p3, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "("

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move v3, v1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    add-int/lit8 v4, v3, 0x1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr93/a1;

    invoke-virtual {p0}, Lxa3/i;->t()Lxa3/e;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "parameter"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v5, p2, p3, v1}, Lxa3/i;->e0(Lr93/a1;ZLjava/lang/StringBuilder;Z)V

    invoke-virtual {p0}, Lxa3/i;->t()Lxa3/e;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v5, v0, -0x1

    if-eq v3, v5, :cond_4

    const-string v3, ", "

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    move v3, v4

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Lxa3/i;->t()Lxa3/e;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, ")"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final g()Lxa3/a;
    .locals 1

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    invoke-virtual {v0}, Lxa3/l;->g()Lxa3/a;

    move-result-object v0

    return-object v0
.end method

.method public final g0(Lr93/r;Ljava/lang/StringBuilder;)Z
    .locals 4

    invoke-virtual {p0}, Lxa3/i;->q()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lxa3/j;->z:Lxa3/j;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v1, v0, Lxa3/l;->n:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/16 v3, 0xc

    aget-object v3, v2, v3

    invoke-interface {v1, v0, v3}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    check-cast p1, Lr93/o;

    iget-object p1, p1, Lr93/o;->a:Lr93/m1;

    invoke-virtual {p1}, Lr93/m1;->c()Lr93/m1;

    move-result-object p1

    invoke-static {p1}, Lr93/q;->g(Lr93/m1;)Lr93/r;

    move-result-object p1

    :cond_1
    iget-object v1, v0, Lxa3/l;->o:Le4/c;

    const/16 v3, 0xd

    aget-object v2, v2, v3

    invoke-interface {v1, v0, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lr93/q;->j:Lr93/p;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_2
    check-cast p1, Lr93/o;

    iget-object p1, p1, Lr93/o;->a:Lr93/m1;

    invoke-virtual {p1}, Lr93/m1;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lxa3/i;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, 0x1

    return p1
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    invoke-virtual {v0}, Lxa3/l;->h()V

    return-void
.end method

.method public final h0(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 8

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v1, v0, Lxa3/l;->w:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/16 v3, 0x15

    aget-object v2, v2, v3

    invoke-interface {v1, v0, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr93/x0;

    invoke-interface {v2}, Lr93/x0;->getUpperBounds()Ljava/util/List;

    move-result-object v3

    const-string v4, "getUpperBounds(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    const/4 v4, 0x1

    invoke-static {v3, v4}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llb3/y;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v2}, Lr93/k;->getName()Lva3/h;

    move-result-object v6

    const-string v7, "getName(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v6, v0}, Lxa3/i;->O(Lva3/h;Z)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " : "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0, v4}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_3

    const-string p2, " "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "where"

    invoke-virtual {p0, v0}, Lxa3/i;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v6, 0x0

    const/16 v7, 0x7c

    const-string v3, ", "

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lm83/s;->M0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final i(Lxa3/p;)V
    .locals 1

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    invoke-virtual {v0, p1}, Lxa3/l;->i(Lxa3/p;)V

    return-void
.end method

.method public final j()V
    .locals 1

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    invoke-virtual {v0}, Lxa3/l;->j()V

    return-void
.end method

.method public final k(Ljava/util/Set;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    invoke-virtual {v0, p1}, Lxa3/l;->k(Ljava/util/Set;)V

    return-void
.end method

.method public final l(Ljava/util/LinkedHashSet;)V
    .locals 1

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    invoke-virtual {v0, p1}, Lxa3/l;->l(Ljava/util/LinkedHashSet;)V

    return-void
.end method

.method public final m()V
    .locals 1

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    invoke-virtual {v0}, Lxa3/l;->m()V

    return-void
.end method

.method public final n()V
    .locals 1

    sget-object v0, Lxa3/t;->w:Lxa3/s;

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    invoke-virtual {v0}, Lxa3/l;->n()V

    return-void
.end method

.method public final p(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lxa3/i;->s()Lxa3/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Lxa3/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final q()Ljava/util/Set;
    .locals 4

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v1, v0, Lxa3/l;->e:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-interface {v1, v0, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public final r()Z
    .locals 4

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v1, v0, Lxa3/l;->f:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-interface {v1, v0, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final s()Lxa3/t;
    .locals 4

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v1, v0, Lxa3/l;->D:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/16 v3, 0x1c

    aget-object v2, v2, v3

    invoke-interface {v1, v0, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxa3/t;

    return-object v0
.end method

.method public final t()Lxa3/e;
    .locals 4

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v1, v0, Lxa3/l;->C:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/16 v3, 0x1b

    aget-object v2, v2, v3

    invoke-interface {v1, v0, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxa3/e;

    return-object v0
.end method

.method public final u()Z
    .locals 4

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v1, v0, Lxa3/l;->j:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    invoke-interface {v1, v0, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final w(Lr93/k;)Ljava/lang/String;
    .locals 7

    const-string v0, "declarationDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Laj/d;

    invoke-direct {v1, p0}, Laj/d;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v1, v0}, Lr93/k;->T(Lr93/m;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lxa3/i;->a:Lxa3/l;

    iget-object v2, v1, Lxa3/l;->c:Le4/c;

    sget-object v3, Lxa3/l;->Y:[Lj93/z;

    const/4 v4, 0x1

    aget-object v5, v3, v4

    invoke-interface {v2, v1, v5}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_4

    instance-of v2, p1, Lr93/g0;

    if-nez v2, :cond_4

    instance-of v2, p1, Lr93/k0;

    if-eqz v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object v2

    if-eqz v2, :cond_4

    instance-of v5, v2, Lr93/b0;

    if-nez v5, :cond_4

    const-string v5, " "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lxa3/i;->s()Lxa3/t;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eqz v6, :cond_2

    if-ne v6, v4, :cond_1

    const-string v4, "<i>defined in</i>"

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    const-string v4, "defined in"

    :goto_0
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lya3/f;->f(Lr93/k;)Lva3/f;

    move-result-object v4

    const-string v5, "getFqName(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Lva3/f;->c()Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v4, "root package"

    goto :goto_1

    :cond_3
    invoke-static {v4}, Lva3/f;->f(Lva3/f;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lv63/b;->j(Ljava/util/List;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Lxa3/i;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lxa3/l;->d:Le4/c;

    const/4 v5, 0x2

    aget-object v3, v3, v5

    invoke-interface {v4, v1, v3}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_4

    instance-of v1, v2, Lr93/g0;

    if-eqz v1, :cond_4

    instance-of v1, p1, Lr93/l;

    if-eqz v1, :cond_4

    check-cast p1, Lr93/l;

    invoke-interface {p1}, Lr93/l;->getSource()Lr93/s0;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_4
    :goto_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ls93/b;Ls93/d;)Ljava/lang/String;
    .locals 9

    const-string v0, "annotation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v0, 0x40

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-eqz p2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Ls93/d;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x3a

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-interface {p1}, Ls93/b;->getType()Llb3/y;

    move-result-object p2

    invoke-virtual {p0, p2}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lxa3/i;->a:Lxa3/l;

    invoke-static {v0}, Ls9/f;->u(Lxa3/k;)Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {p1}, Ls93/b;->a()Ljava/util/Map;

    move-result-object v1

    iget-object v3, v0, Lxa3/l;->I:Le4/c;

    sget-object v4, Lxa3/l;->Y:[Lj93/z;

    const/16 v5, 0x21

    aget-object v4, v4, v5

    invoke-interface {v3, v0, v4}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-static {p1}, Lcb3/e;->d(Ls93/b;)Lr93/e;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v4

    :goto_0
    const/16 v3, 0xa

    if-eqz p1, :cond_5

    invoke-interface {p1}, Lr93/e;->s()Lu93/j;

    move-result-object p1

    if-eqz p1, :cond_5

    check-cast p1, Lu93/x;

    invoke-virtual {p1}, Lu93/x;->v()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_5

    check-cast p1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lr93/a1;

    check-cast v6, Lu93/w0;

    invoke-virtual {v6}, Lu93/w0;->J0()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    invoke-static {v4, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {p1, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr93/a1;

    check-cast v5, Lu93/n;

    invoke-virtual {v5}, Lu93/n;->getName()Lva3/h;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    move-object v4, p1

    :cond_5
    if-nez v4, :cond_6

    sget-object v4, Lm83/y;->w:Lm83/y;

    :cond_6
    move-object p1, v4

    check-cast p1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lva3/h;

    invoke-interface {v1, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_7

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    new-instance p1, Ljava/util/ArrayList;

    invoke-static {v5, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {p1, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lva3/h;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " = ..."

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lva3/h;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lab3/g;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v4, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    invoke-virtual {p0, v3}, Lxa3/i;->B(Lab3/g;)Ljava/lang/String;

    move-result-object v3

    goto :goto_6

    :cond_a
    const-string v3, "..."

    :goto_6
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_b
    invoke-static {p1, v5}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->t1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-static {v0}, Ls9/f;->v(Lxa3/k;)Z

    move-result v0

    if-nez v0, :cond_c

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    :cond_c
    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    const/4 v6, 0x0

    const/16 v7, 0x70

    const-string v3, ", "

    const-string v4, "("

    const-string v5, ")"

    invoke-static/range {v1 .. v7}, Lm83/s;->M0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    :cond_d
    invoke-virtual {p0}, Lxa3/i;->u()Z

    move-result p1

    if-eqz p1, :cond_f

    invoke-static {p2}, Llb3/o;->e(Llb3/y;)Z

    move-result p1

    if-nez p1, :cond_e

    invoke-virtual {p2}, Llb3/y;->i0()Llb3/q0;

    move-result-object p1

    invoke-interface {p1}, Llb3/q0;->d()Lr93/h;

    move-result-object p1

    instance-of p1, p1, Lr93/f0;

    if-eqz p1, :cond_f

    :cond_e
    const-string p1, " /* annotation class not found */"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_f
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final y(Ljava/lang/StringBuilder;Ls93/a;Ls93/d;)V
    .locals 6

    invoke-virtual {p0}, Lxa3/i;->q()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lxa3/j;->G:Lxa3/j;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    instance-of v0, p2, Llb3/y;

    iget-object v1, p0, Lxa3/i;->a:Lxa3/l;

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lxa3/l;->f()Ljava/util/Set;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, v1, Lxa3/l;->K:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/16 v3, 0x23

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    :goto_0
    iget-object v2, v1, Lxa3/l;->M:Le4/c;

    sget-object v3, Lxa3/l;->Y:[Lj93/z;

    const/16 v4, 0x25

    aget-object v3, v3, v4

    invoke-interface {v2, v1, v3}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-interface {p2}, Ls93/a;->getAnnotations()Ls93/i;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls93/b;

    move-object v4, v0

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v3}, Ls93/b;->b()Lva3/e;

    move-result-object v5

    invoke-static {v4, v5}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-interface {v3}, Ls93/b;->b()Lva3/e;

    move-result-object v4

    sget-object v5, Lo93/m;->r:Lva3/e;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    if-eqz v2, :cond_3

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_2

    :cond_3
    invoke-virtual {p0, v3, p3}, Lxa3/i;->x(Ls93/b;Ls93/d;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Lxa3/l;->J:Le4/c;

    sget-object v4, Lxa3/l;->Y:[Lj93/z;

    const/16 v5, 0x22

    aget-object v4, v4, v5

    invoke-interface {v3, v1, v4}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0xa

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    const-string v3, " "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_5
    :goto_2
    return-void
.end method
