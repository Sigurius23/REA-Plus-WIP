.class public final Lr93/f0;
.super Lu93/k;
.source "SourceFile"


# instance fields
.field public final G:Z

.field public final H:Ljava/util/ArrayList;

.field public final I:Llb3/i;


# direct methods
.method public constructor <init>(Lkb3/k;Lr93/g;Lva3/h;ZI)V
    .locals 2

    const-string v0, "container"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lr93/s0;->q:Lr93/v0;

    invoke-direct {p0, p1, p2, p3, v0}, Lu93/k;-><init>(Lkb3/n;Lr93/k;Lva3/h;Lr93/s0;)V

    iput-boolean p4, p0, Lr93/f0;->G:Z

    const/4 p2, 0x0

    invoke-static {p2, p5}, Le93/b;->i0(II)Li93/j;

    move-result-object p2

    new-instance p3, Ljava/util/ArrayList;

    const/16 p4, 0xa

    invoke-static {p2, p4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p2}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    move-object p4, p2

    check-cast p4, Li93/i;

    iget-boolean p4, p4, Li93/i;->y:Z

    if-eqz p4, :cond_0

    move-object p4, p2

    check-cast p4, Lm83/e0;

    invoke-virtual {p4}, Lm83/e0;->nextInt()I

    move-result p4

    sget-object p5, Llb3/g1;->y:Llb3/g1;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "T"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    invoke-static {p0, p5, v0, p4, p1}, Lu93/u0;->N0(Lu93/b;Llb3/g1;Lva3/h;ILkb3/n;)Lu93/u0;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iput-object p3, p0, Lr93/f0;->H:Ljava/util/ArrayList;

    new-instance p2, Llb3/i;

    invoke-static {p0}, Ljc/x;->u(Lr93/i;)Ljava/util/List;

    move-result-object p3

    invoke-static {p0}, Lcb3/e;->j(Lr93/k;)Lr93/b0;

    move-result-object p4

    invoke-interface {p4}, Lr93/b0;->c()Lo93/h;

    move-result-object p4

    invoke-virtual {p4}, Lo93/h;->e()Llb3/c0;

    move-result-object p4

    invoke-static {p4}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p4

    check-cast p4, Ljava/util/Collection;

    invoke-direct {p2, p0, p3, p4, p1}, Llb3/i;-><init>(Lu93/c0;Ljava/util/List;Ljava/util/Collection;Lkb3/n;)V

    iput-object p2, p0, Lr93/f0;->I:Llb3/i;

    return-void
.end method


# virtual methods
.method public final I()Lr93/y0;
    .locals 1

    const/4 v0, 0x0

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

.method public final bridge synthetic V()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;

    return-object v0
.end method

.method public final e()Llb3/q0;
    .locals 1

    iget-object v0, p0, Lr93/f0;->I:Llb3/i;

    return-object v0
.end method

.method public final getAnnotations()Ls93/i;
    .locals 1

    sget-object v0, Ls93/g;->a:Ls93/f;

    return-object v0
.end method

.method public final getConstructors()Ljava/util/Collection;
    .locals 1

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    return-object v0
.end method

.method public final getKind()Lr93/f;
    .locals 1

    sget-object v0, Lr93/f;->w:Lr93/f;

    return-object v0
.end method

.method public final getVisibility()Lr93/r;
    .locals 2

    sget-object v0, Lr93/q;->e:Lr93/p;

    const-string v1, "PUBLIC"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final isExternal()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isInline()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isInner()Z
    .locals 1

    iget-boolean v0, p0, Lr93/f0;->G:Z

    return v0
.end method

.method public final isValue()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lr93/f0;->H:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final k()Lr93/a0;
    .locals 1

    sget-object v0, Lr93/a0;->x:Lr93/a0;

    return-object v0
.end method

.method public final l(Lmb3/f;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 0

    sget-object p1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;

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

    const-string v1, "class "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lu93/b;->getName()Lva3/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " (not found)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
