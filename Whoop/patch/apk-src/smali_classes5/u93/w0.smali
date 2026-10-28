.class public Lu93/w0;
.super Lu93/x0;
.source "SourceFile"

# interfaces
.implements Lr93/a1;


# instance fields
.field public final G:I

.field public final H:Z

.field public final I:Z

.field public final J:Z

.field public final K:Llb3/y;

.field public final L:Lr93/a1;


# direct methods
.method public constructor <init>(Lr93/b;Lr93/a1;ILs93/i;Lva3/h;Llb3/y;ZZZLlb3/y;Lr93/s0;)V
    .locals 6

    const-string v0, "containingDeclaration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    move-object/from16 v5, p11

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p4

    move-object v3, p5

    move-object v4, p6

    invoke-direct/range {v0 .. v5}, Lu93/x0;-><init>(Lr93/k;Ls93/i;Lva3/h;Llb3/y;Lr93/s0;)V

    iput p3, p0, Lu93/w0;->G:I

    iput-boolean p7, p0, Lu93/w0;->H:Z

    iput-boolean p8, p0, Lu93/w0;->I:Z

    iput-boolean p9, p0, Lu93/w0;->J:Z

    move-object/from16 v1, p10

    iput-object v1, p0, Lu93/w0;->K:Llb3/y;

    if-nez p2, :cond_0

    move-object v1, p0

    goto :goto_0

    :cond_0
    move-object v1, p2

    :goto_0
    iput-object v1, p0, Lu93/w0;->L:Lr93/a1;

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final bridge synthetic I0()Lr93/l;
    .locals 1

    invoke-virtual {p0}, Lu93/w0;->L0()Lr93/a1;

    move-result-object v0

    return-object v0
.end method

.method public final J0()Z
    .locals 1

    iget-boolean v0, p0, Lu93/w0;->H:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lu93/w0;->K0()Lr93/b;

    move-result-object v0

    check-cast v0, Lr93/c;

    invoke-interface {v0}, Lr93/c;->getKind()I

    move-result v0

    invoke-static {v0}, Lq63/c;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final K0()Lr93/b;
    .locals 2

    invoke-super {p0}, Lu93/o;->g()Lr93/k;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lr93/b;

    return-object v0
.end method

.method public final L0()Lr93/a1;
    .locals 1

    iget-object v0, p0, Lu93/w0;->L:Lr93/a1;

    if-ne v0, p0, :cond_0

    return-object p0

    :cond_0
    check-cast v0, Lu93/w0;

    invoke-virtual {v0}, Lu93/w0;->L0()Lr93/a1;

    move-result-object v0

    return-object v0
.end method

.method public final T(Lr93/m;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, Lr93/m;->visitValueParameterDescriptor(Lr93/a1;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic W()Lab3/g;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final bridge synthetic a()Lr93/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lu93/w0;->L0()Lr93/a1;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a()Lr93/k;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lu93/w0;->L0()Lr93/a1;

    move-result-object v0

    return-object v0
.end method

.method public final d(Llb3/a1;)Lr93/l;
    .locals 1

    const-string v0, "substitutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Llb3/a1;->a:Llb3/y0;

    invoke-virtual {p1}, Llb3/y0;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final bridge synthetic g()Lr93/k;
    .locals 1

    invoke-virtual {p0}, Lu93/w0;->K0()Lr93/b;

    move-result-object v0

    return-object v0
.end method

.method public final getVisibility()Lr93/r;
    .locals 2

    sget-object v0, Lr93/q;->f:Lr93/p;

    const-string v1, "LOCAL"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final h()Ljava/util/Collection;
    .locals 4

    invoke-virtual {p0}, Lu93/w0;->K0()Lr93/b;

    move-result-object v0

    invoke-interface {v0}, Lr93/b;->h()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getOverriddenDescriptors(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr93/b;

    invoke-interface {v2}, Lr93/b;->v()Ljava/util/List;

    move-result-object v2

    iget v3, p0, Lu93/w0;->G:I

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr93/a1;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public o(Lp93/f;Lva3/h;I)Lr93/a1;
    .locals 12

    new-instance v0, Lu93/w0;

    invoke-virtual {p0}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v4

    const-string v1, "<get-annotations>(...)"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lu93/x0;->getType()Llb3/y;

    move-result-object v6

    const-string v1, "getType(...)"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lu93/w0;->J0()Z

    move-result v7

    iget-object v10, p0, Lu93/w0;->K:Llb3/y;

    sget-object v11, Lr93/s0;->q:Lr93/v0;

    const/4 v2, 0x0

    iget-boolean v8, p0, Lu93/w0;->I:Z

    iget-boolean v9, p0, Lu93/w0;->J:Z

    move-object v1, p1

    move-object v5, p2

    move v3, p3

    invoke-direct/range {v0 .. v11}, Lu93/w0;-><init>(Lr93/b;Lr93/a1;ILs93/i;Lva3/h;Llb3/y;ZZZLlb3/y;Lr93/s0;)V

    return-object v0
.end method
