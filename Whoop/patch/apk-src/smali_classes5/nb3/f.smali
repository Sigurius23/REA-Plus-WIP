.class public final Lnb3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr93/n0;


# instance fields
.field public final synthetic w:Lu93/m0;


# direct methods
.method public constructor <init>()V
    .locals 14

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lnb3/l;->a:Lnb3/l;

    sget-object v1, Lnb3/l;->c:Lnb3/a;

    sget-object v2, Lr93/a0;->z:Lr93/a0;

    sget-object v3, Lr93/q;->e:Lr93/p;

    sget-object v0, Lnb3/b;->w:[Lnb3/b;

    const-string v0, "<Error property>"

    invoke-static {v0}, Lva3/h;->g(Ljava/lang/String;)Lva3/h;

    move-result-object v5

    const/4 v6, 0x1

    sget-object v7, Lr93/s0;->q:Lr93/v0;

    const/4 v4, 0x1

    invoke-static/range {v1 .. v7}, Lu93/m0;->K0(Lr93/k;Lr93/a0;Lr93/r;ZLva3/h;ILr93/s0;)Lu93/m0;

    move-result-object v8

    sget-object v9, Lnb3/l;->e:Lnb3/i;

    const/4 v11, 0x0

    const/4 v12, 0x0

    sget-object v10, Lm83/y;->w:Lm83/y;

    move-object v13, v10

    invoke-virtual/range {v8 .. v13}, Lu93/m0;->Q0(Llb3/y;Ljava/util/List;Lr93/q0;Lu93/p0;Ljava/util/List;)V

    iput-object v8, p0, Lnb3/f;->w:Lu93/m0;

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    iget-boolean v0, v0, Lu93/m0;->G:Z

    return v0
.end method

.method public final B()Lr93/q0;
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    iget-object v0, v0, Lu93/m0;->V:Lr93/q0;

    return-object v0
.end method

.method public final C()Lu93/v;
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    iget-object v0, v0, Lu93/m0;->a0:Lu93/v;

    return-object v0
.end method

.method public final L()Z
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0
.end method

.method public final S()Z
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0
.end method

.method public final T(Lr93/m;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, v0, p2}, Lr93/m;->visitPropertyDescriptor(Lr93/n0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final U()Z
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    iget-boolean v0, v0, Lu93/m0;->Q:Z

    return v0
.end method

.method public final W()Lab3/g;
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0}, Lu93/m0;->W()Lab3/g;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a()Lr93/b;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lnb3/f;->a()Lr93/n0;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a()Lr93/c;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lnb3/f;->a()Lr93/n0;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a()Lr93/k;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lnb3/f;->a()Lr93/n0;

    move-result-object v0

    return-object v0
.end method

.method public final a()Lr93/n0;
    .locals 2

    .line 1
    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0}, Lu93/m0;->a()Lr93/n0;

    move-result-object v0

    const-string v1, "getOriginal(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final a0(Lr93/e;Lr93/a0;Lr93/o;)Lr93/c;
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0, p1, p2, p3}, Lu93/m0;->J0(Lr93/k;Lr93/a0;Lr93/r;)Lu93/m0;

    move-result-object p1

    return-object p1
.end method

.method public final b0()Lu93/v;
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    iget-object v0, v0, Lu93/m0;->Z:Lu93/v;

    return-object v0
.end method

.method public final c0()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0}, Lu93/m0;->c0()Ljava/util/List;

    move-result-object v0

    const-string v1, "getContextReceiverParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final bridge synthetic d(Llb3/a1;)Lr93/l;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lnb3/f;->d(Llb3/a1;)Lr93/n0;

    move-result-object p1

    return-object p1
.end method

.method public final d(Llb3/a1;)Lr93/n0;
    .locals 1

    .line 1
    const-string v0, "substitutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0, p1}, Lu93/m0;->d(Llb3/a1;)Lr93/n0;

    move-result-object p1

    return-object p1
.end method

.method public final d0()Z
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    iget-boolean v0, v0, Lu93/m0;->O:Z

    return v0
.end method

.method public final g()Lr93/k;
    .locals 2

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0}, Lu93/o;->g()Lr93/k;

    move-result-object v0

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final g0(Ljava/util/Collection;)V
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    iput-object p1, v0, Lu93/m0;->L:Ljava/util/Collection;

    return-void
.end method

.method public final getAnnotations()Ls93/i;
    .locals 2

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v0

    const-string v1, "<get-annotations>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getGetter()Lu93/n0;
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    iget-object v0, v0, Lu93/m0;->X:Lu93/n0;

    return-object v0
.end method

.method public final getKind()I
    .locals 2

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0}, Lu93/m0;->getKind()I

    move-result v0

    const-string v1, "getKind(...)"

    invoke-static {v0, v1}, Ljh3/c;->m(ILjava/lang/String;)V

    return v0
.end method

.method public final getName()Lva3/h;
    .locals 2

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0}, Lu93/n;->getName()Lva3/h;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getReturnType()Llb3/y;
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0}, Lu93/m0;->getReturnType()Llb3/y;

    move-result-object v0

    return-object v0
.end method

.method public final getSetter()Lr93/p0;
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    iget-object v0, v0, Lu93/m0;->Y:Lr93/p0;

    return-object v0
.end method

.method public final getSource()Lr93/s0;
    .locals 2

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0}, Lu93/o;->getSource()Lr93/s0;

    move-result-object v0

    const-string v1, "getSource(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getType()Llb3/y;
    .locals 2

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0}, Lu93/x0;->getType()Llb3/y;

    move-result-object v0

    const-string v1, "getType(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0}, Lu93/m0;->getTypeParameters()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getVisibility()Lr93/r;
    .locals 2

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0}, Lu93/m0;->getVisibility()Lr93/r;

    move-result-object v0

    const-string v1, "getVisibility(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final h()Ljava/util/Collection;
    .locals 2

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0}, Lu93/m0;->h()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getOverriddenDescriptors(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final h0(Lr93/a;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final isConst()Z
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    iget-boolean v0, v0, Lu93/m0;->P:Z

    return v0
.end method

.method public final isExternal()Z
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    iget-boolean v0, v0, Lu93/m0;->R:Z

    return v0
.end method

.method public final k()Lr93/a0;
    .locals 2

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0}, Lu93/m0;->k()Lr93/a0;

    move-result-object v0

    const-string v1, "getModality(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final m()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0}, Lu93/m0;->m()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final p()Z
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    iget-boolean v0, v0, Lu93/m0;->S:Z

    return v0
.end method

.method public final v()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    invoke-virtual {v0}, Lu93/x0;->v()Ljava/util/List;

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const-string v1, "getValueParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final y()Lr93/q0;
    .locals 1

    iget-object v0, p0, Lnb3/f;->w:Lu93/m0;

    iget-object v0, v0, Lu93/m0;->U:Lr93/q0;

    return-object v0
.end method
