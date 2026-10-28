.class public final Llb3/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llb3/q0;
.implements Lob3/l;


# instance fields
.field public w:Llb3/y;

.field public final x:Ljava/util/LinkedHashSet;

.field public final y:I


# direct methods
.method public constructor <init>(Ljava/util/AbstractCollection;)V
    .locals 1

    const-string v0, "typesToIntersect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Llb3/x;->x:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result p1

    iput p1, p0, Llb3/x;->y:I

    return-void
.end method


# virtual methods
.method public final a()Llb3/c0;
    .locals 7

    sget-object v0, Llb3/k0;->x:Lwe/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Llb3/k0;->y:Llb3/k0;

    const-string v0, "member scope for intersection type"

    iget-object v2, p0, Llb3/x;->x:Ljava/util/LinkedHashSet;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/j;->y(Ljava/lang/String;Ljava/util/Collection;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v5

    new-instance v6, Ls;

    const/16 v0, 0xb

    invoke-direct {v6, p0, v0}, Ls;-><init>(Ljava/lang/Object;I)V

    sget-object v3, Lm83/y;->w:Lm83/y;

    const/4 v4, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v6}, Llb3/o;->l(Llb3/k0;Llb3/q0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Lkotlin/jvm/functions/Function1;)Llb3/c0;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lo93/h;
    .locals 2

    iget-object v0, p0, Llb3/x;->x:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/y;

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->c()Lo93/h;

    move-result-object v0

    const-string v1, "getBuiltIns(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final d()Lr93/h;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final e(Lkotlin/jvm/functions/Function1;)Ljava/lang/String;
    .locals 7

    const-string v0, "getProperTypeRelatedToStringify"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf1/u0;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Lf1/u0;-><init>(Ljava/lang/Object;I)V

    iget-object v1, p0, Llb3/x;->x:Ljava/util/LinkedHashSet;

    invoke-static {v1, v0}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Llb3/v;

    const/4 v0, 0x0

    invoke-direct {v5, p1, v0}, Llb3/v;-><init>(Lkotlin/jvm/functions/Function1;I)V

    const/16 v6, 0x18

    const-string v2, " & "

    const-string v3, "{"

    const-string v4, "}"

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Llb3/x;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Llb3/x;

    iget-object p1, p1, Llb3/x;->x:Ljava/util/LinkedHashSet;

    iget-object v0, p0, Llb3/x;->x:Ljava/util/LinkedHashSet;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getParameters()Ljava/util/List;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method

.method public final getSupertypes()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Llb3/x;->x:Ljava/util/LinkedHashSet;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Llb3/x;->y:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    sget-object v0, Llb3/w;->x:Llb3/w;

    invoke-virtual {p0, v0}, Llb3/x;->e(Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
