.class public final Lka3/f;
.super Llb3/y0;
.source "SourceFile"


# static fields
.field public static final c:Lka3/a;

.field public static final d:Lka3/a;


# instance fields
.field public final b:Lcom/google/crypto/tink/internal/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    sget-object v0, Llb3/b1;->x:Llb3/b1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x5

    invoke-static {v0, v1, v2, v3}, Lv8/b;->W(Llb3/b1;ZLja3/f0;I)Lka3/a;

    move-result-object v4

    sget-object v5, Lka3/b;->y:Lka3/b;

    const/4 v8, 0x0

    const/16 v9, 0x3d

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lka3/a;->a(Lka3/a;Lka3/b;ZLjava/util/Set;Llb3/c0;I)Lka3/a;

    move-result-object v4

    sput-object v4, Lka3/f;->c:Lka3/a;

    invoke-static {v0, v1, v2, v3}, Lv8/b;->W(Llb3/b1;ZLja3/f0;I)Lka3/a;

    move-result-object v5

    sget-object v6, Lka3/b;->x:Lka3/b;

    const/4 v9, 0x0

    const/16 v10, 0x3d

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lka3/a;->a(Lka3/a;Lka3/b;ZLjava/util/Set;Llb3/c0;I)Lka3/a;

    move-result-object v0

    sput-object v0, Lka3/f;->d:Lka3/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljc/b;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ljc/b;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/l0;

    invoke-direct {v1, v0}, Lcom/google/crypto/tink/internal/l0;-><init>(Ljc/b;)V

    iput-object v1, p0, Lka3/f;->b:Lcom/google/crypto/tink/internal/l0;

    return-void
.end method


# virtual methods
.method public final d(Llb3/y;)Llb3/u0;
    .locals 7

    new-instance v0, Llb3/v0;

    new-instance v1, Lka3/a;

    sget-object v2, Llb3/b1;->x:Llb3/b1;

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lka3/a;-><init>(Llb3/b1;ZZLjava/util/Set;I)V

    invoke-virtual {p0, p1, v1}, Lka3/f;->h(Llb3/y;Lka3/a;)Llb3/y;

    move-result-object p1

    invoke-direct {v0, p1}, Llb3/v0;-><init>(Llb3/y;)V

    return-object v0
.end method

.method public final g(Llb3/c0;Lr93/e;Lka3/a;)Ll83/k;
    .locals 8

    invoke-virtual {p1}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance p3, Ll83/k;

    invoke-direct {p3, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p3

    :cond_0
    invoke-static {p1}, Lo93/h;->z(Llb3/y;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Llb3/y;->X()Ljava/util/List;

    move-result-object p2

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Llb3/u0;

    new-instance v0, Llb3/v0;

    invoke-virtual {p2}, Llb3/u0;->a()Llb3/g1;

    move-result-object v1

    invoke-virtual {p2}, Llb3/u0;->b()Llb3/y;

    move-result-object p2

    const-string v2, "getType(...)"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p3}, Lka3/f;->h(Llb3/y;Lka3/a;)Llb3/y;

    move-result-object p2

    invoke-direct {v0, p2, v1}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1}, Llb3/y;->Y()Llb3/k0;

    move-result-object p3

    invoke-virtual {p1}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-virtual {p1}, Llb3/y;->k0()Z

    move-result p1

    invoke-static {p2, p3, v0, p1}, Llb3/o;->i(Ljava/util/List;Llb3/k0;Llb3/q0;Z)Llb3/c0;

    move-result-object p1

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance p3, Ll83/k;

    invoke-direct {p3, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p3

    :cond_1
    invoke-static {p1}, Llb3/o;->e(Llb3/y;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p2, Lnb3/k;->N:Lnb3/k;

    invoke-virtual {p1}, Llb3/y;->i0()Llb3/q0;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object p1

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance p3, Ll83/k;

    invoke-direct {p3, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p3

    :cond_2
    invoke-interface {p2, p0}, Lr93/e;->n(Llb3/y0;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v4

    const-string v0, "getMemberScope(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llb3/y;->Y()Llb3/k0;

    move-result-object v0

    invoke-interface {p2}, Lr93/h;->e()Llb3/q0;

    move-result-object v1

    const-string v2, "getTypeConstructor(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lr93/h;->e()Llb3/q0;

    move-result-object v2

    invoke-interface {v2}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v2

    const-string v3, "getParameters(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    move-object v3, v2

    new-instance v2, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr93/x0;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v6, p0, Lka3/f;->b:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v6, v5, p3}, Lcom/google/crypto/tink/internal/l0;->P(Lr93/x0;Lka3/a;)Llb3/y;

    move-result-object v7

    invoke-static {v5, p3, v6, v7}, Ljc/b;->k(Lr93/x0;Lka3/a;Lcom/google/crypto/tink/internal/l0;Llb3/y;)Llb3/u0;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Llb3/y;->k0()Z

    move-result v3

    new-instance v5, Lka3/e;

    invoke-direct {v5, p2, p0, p1, p3}, Lka3/e;-><init>(Lr93/e;Lka3/f;Llb3/c0;Lka3/a;)V

    invoke-static/range {v0 .. v5}, Llb3/o;->l(Llb3/k0;Llb3/q0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Lkotlin/jvm/functions/Function1;)Llb3/c0;

    move-result-object p1

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance p3, Ll83/k;

    invoke-direct {p3, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p3
.end method

.method public final h(Llb3/y;Lka3/a;)Llb3/y;
    .locals 3

    invoke-virtual {p1}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    instance-of v1, v0, Lr93/x0;

    if-eqz v1, :cond_0

    check-cast v0, Lr93/x0;

    const/4 p1, 0x1

    invoke-virtual {p2, p1}, Lka3/a;->h(Z)Lka3/a;

    move-result-object p1

    iget-object v1, p0, Lka3/f;->b:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v1, v0, p1}, Lcom/google/crypto/tink/internal/l0;->P(Lr93/x0;Lka3/a;)Llb3/y;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lka3/f;->h(Llb3/y;Lka3/a;)Llb3/y;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p2, v0, Lr93/e;

    if-eqz p2, :cond_4

    invoke-static {p1}, Lds/p;->g0(Llb3/y;)Llb3/c0;

    move-result-object p2

    invoke-virtual {p2}, Llb3/y;->i0()Llb3/q0;

    move-result-object p2

    invoke-interface {p2}, Llb3/q0;->d()Lr93/h;

    move-result-object p2

    instance-of v1, p2, Lr93/e;

    if-eqz v1, :cond_3

    invoke-static {p1}, Lds/p;->M(Llb3/y;)Llb3/c0;

    move-result-object v1

    check-cast v0, Lr93/e;

    sget-object v2, Lka3/f;->c:Lka3/a;

    invoke-virtual {p0, v1, v0, v2}, Lka3/f;->g(Llb3/c0;Lr93/e;Lka3/a;)Ll83/k;

    move-result-object v0

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Llb3/c0;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {p1}, Lds/p;->g0(Llb3/y;)Llb3/c0;

    move-result-object p1

    check-cast p2, Lr93/e;

    sget-object v2, Lka3/f;->d:Lka3/a;

    invoke-virtual {p0, p1, p2, v2}, Lka3/f;->g(Llb3/c0;Lr93/e;Lka3/a;)Ll83/k;

    move-result-object p1

    iget-object p2, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast p2, Llb3/c0;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez v0, :cond_2

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v1, p2}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    new-instance p1, Lka3/h;

    invoke-direct {p1, v1, p2}, Lka3/h;-><init>(Llb3/c0;Llb3/c0;)V

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "For some reason declaration for upper bound is not a class but \""

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\" while for lower it\'s \""

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0x22

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected declaration kind: "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
