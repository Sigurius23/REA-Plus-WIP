.class public final Lka3/h;
.super Llb3/r;
.source "SourceFile"


# direct methods
.method public constructor <init>(Llb3/c0;Llb3/c0;)V
    .locals 1

    const-string v0, "lowerBound"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upperBound"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Llb3/r;-><init>(Llb3/c0;Llb3/c0;)V

    sget-object v0, Lmb3/d;->a:Lmb3/l;

    invoke-virtual {v0, p1, p2}, Lmb3/l;->b(Llb3/y;Llb3/y;)Z

    return-void
.end method

.method public static final w0(Lxa3/i;Llb3/y;)Ljava/util/ArrayList;
    .locals 10

    invoke-virtual {p1}, Llb3/y;->X()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llb3/u0;

    const-string v2, "typeProjection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/Iterable;

    new-instance v8, Lxa3/h;

    const/4 v1, 0x0

    invoke-direct {v8, p0, v1}, Lxa3/h;-><init>(Lxa3/i;I)V

    const/16 v9, 0x3c

    const-string v5, ", "

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lm83/s;->M0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final x0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    const/16 v1, 0x3c

    invoke-static {p0, v1, v0}, Lyb3/r;->T(Ljava/lang/CharSequence;CZ)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, v1}, Lyb3/r;->H0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x3e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p1, p0, p0}, Lyb3/r;->F0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final m0(Lmb3/f;)Llb3/y;
    .locals 3

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lka3/h;

    iget-object v0, p0, Llb3/r;->x:Llb3/c0;

    const-string v1, "type"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Llb3/r;->y:Llb3/c0;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v0, v2}, Llb3/r;-><init>(Llb3/c0;Llb3/c0;)V

    return-object p1
.end method

.method public final r0(Z)Llb3/f1;
    .locals 3

    new-instance v0, Lka3/h;

    iget-object v1, p0, Llb3/r;->x:Llb3/c0;

    invoke-virtual {v1, p1}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object v1

    iget-object v2, p0, Llb3/r;->y:Llb3/c0;

    invoke-virtual {v2, p1}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lka3/h;-><init>(Llb3/c0;Llb3/c0;)V

    return-object v0
.end method

.method public final s0(Lmb3/f;)Llb3/f1;
    .locals 3

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lka3/h;

    iget-object v0, p0, Llb3/r;->x:Llb3/c0;

    const-string v1, "type"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Llb3/r;->y:Llb3/c0;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v0, v2}, Llb3/r;-><init>(Llb3/c0;Llb3/c0;)V

    return-object p1
.end method

.method public final t0(Llb3/k0;)Llb3/f1;
    .locals 3

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lka3/h;

    iget-object v1, p0, Llb3/r;->x:Llb3/c0;

    invoke-virtual {v1, p1}, Llb3/c0;->v0(Llb3/k0;)Llb3/c0;

    move-result-object v1

    iget-object v2, p0, Llb3/r;->y:Llb3/c0;

    invoke-virtual {v2, p1}, Llb3/c0;->v0(Llb3/k0;)Llb3/c0;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lka3/h;-><init>(Llb3/c0;Llb3/c0;)V

    return-object v0
.end method

.method public final u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 3

    invoke-virtual {p0}, Llb3/r;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    instance-of v1, v0, Lr93/e;

    if-eqz v1, :cond_0

    check-cast v0, Lr93/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v1, Lka3/f;

    invoke-direct {v1}, Lka3/f;-><init>()V

    invoke-interface {v0, v1}, Lr93/e;->n(Llb3/y0;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    const-string v1, "getMemberScope(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Incorrect classifier: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Llb3/r;->i0()Llb3/q0;

    move-result-object v2

    invoke-interface {v2}, Llb3/q0;->d()Lr93/h;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final u0()Llb3/c0;
    .locals 1

    iget-object v0, p0, Llb3/r;->x:Llb3/c0;

    return-object v0
.end method

.method public final v0(Lxa3/i;Lxa3/i;)Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Llb3/r;->x:Llb3/c0;

    invoke-virtual {p1, v0}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Llb3/r;->y:Llb3/c0;

    invoke-virtual {p1, v2}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object v3

    iget-object p2, p2, Lxa3/i;->a:Lxa3/l;

    invoke-virtual {p2}, Lxa3/l;->o()Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "raw ("

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ".."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x29

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v2}, Llb3/y;->X()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p0}, Lio/sentry/config/a;->z(Llb3/y;)Lo93/h;

    move-result-object p2

    invoke-virtual {p1, v1, v3, p2}, Lxa3/i;->F(Ljava/lang/String;Ljava/lang/String;Lo93/h;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1, v0}, Lka3/h;->w0(Lxa3/i;Llb3/y;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-static {p1, v2}, Lka3/h;->w0(Lxa3/i;Llb3/y;)Ljava/util/ArrayList;

    move-result-object p2

    sget-object v8, Lka3/g;->w:Lka3/g;

    const/16 v9, 0x1e

    const-string v5, ", "

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, p2}, Lm83/s;->K1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll83/k;

    iget-object v4, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v5, "out "

    invoke-static {v2, v5}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    const-string v4, "*"

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_0

    :cond_4
    :goto_1
    invoke-static {v3, v0}, Lka3/h;->x0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_5
    invoke-static {v1, v0}, Lka3/h;->x0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    return-object p2

    :cond_6
    invoke-static {p0}, Lio/sentry/config/a;->z(Llb3/y;)Lo93/h;

    move-result-object v0

    invoke-virtual {p1, p2, v3, v0}, Lxa3/i;->F(Ljava/lang/String;Ljava/lang/String;Lo93/h;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
