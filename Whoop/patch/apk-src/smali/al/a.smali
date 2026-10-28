.class public abstract Lal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo63/n;
.implements Loa3/o;
.implements Ls93/a;
.implements Lxi/f;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Lal/a;->w:I

    packed-switch p1, :pswitch_data_0

    .line 2
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object p1, Ltl/l;->a:[C

    .line 4
    new-instance p1, Ljava/util/ArrayDeque;

    const/16 v0, 0x14

    invoke-direct {p1, v0}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 5
    iput-object p1, p0, Lal/a;->x:Ljava/lang/Object;

    return-void

    .line 6
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lal/a;->x:Ljava/lang/Object;

    return-void

    .line 8
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance p1, Lo63/d;

    invoke-direct {p1}, Lo63/d;-><init>()V

    .line 10
    iput-object p1, p0, Lal/a;->x:Ljava/lang/Object;

    return-void

    .line 11
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 12
    :pswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lal/a;->x:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lal/a;->w:I

    iput-object p1, p0, Lal/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ls93/i;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lal/a;->w:I

    if-eqz p1, :cond_0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lal/a;->x:Ljava/lang/Object;

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 16
    invoke-static {p1}, Lal/a;->r0(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public static synthetic r0(I)V
    .locals 7

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const-string v1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v1, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v2, 0x2

    if-eq p0, v0, :cond_1

    const/4 v3, 0x3

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl"

    const/4 v5, 0x0

    if-eq p0, v0, :cond_2

    const-string v6, "annotations"

    aput-object v6, v3, v5

    goto :goto_2

    :cond_2
    aput-object v4, v3, v5

    :goto_2
    if-eq p0, v0, :cond_3

    aput-object v4, v3, v0

    goto :goto_3

    :cond_3
    const-string v4, "getAnnotations"

    aput-object v4, v3, v0

    :goto_3
    if-eq p0, v0, :cond_4

    const-string v4, "<init>"

    aput-object v4, v3, v2

    :cond_4
    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eq p0, v0, :cond_5

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_4
    throw p0
.end method


# virtual methods
.method public A0(Lal/i;)V
    .locals 3

    iget-object v0, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v1

    const/16 v2, 0x14

    if-ge v1, v2, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public abstract B0(Ljava/lang/Object;)V
.end method

.method public abstract C0(Ld0/z1;)V
.end method

.method public abstract D0()V
.end method

.method public E(Ljava/lang/String;Ljava/lang/Iterable;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "values"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lal/a;->v0(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lal/a;->F0(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public E0(Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public F0(Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public G(Lva3/c;Lva3/h;)V
    .locals 0

    return-void
.end method

.method public abstract G0([Ljava/lang/String;)V
.end method

.method public X(Lab3/f;)V
    .locals 0

    return-void
.end method

.method public Y(Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public b()Ljava/util/Set;
    .locals 2

    iget-object v0, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    const-string v1, "unmodifiableSet(this)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getAnnotations()Ls93/i;
    .locals 1

    iget-object v0, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v0, Ls93/i;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Lal/a;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public i0(Lva3/c;)Loa3/n;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public l()V
    .locals 2

    iget-object v0, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p0, v0}, Lal/a;->G0([Ljava/lang/String;)V

    return-void
.end method

.method public m0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public p0()Z
    .locals 4

    iget-object v0, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lej/a;

    invoke-virtual {v0}, Lej/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v3

    :cond_1
    :goto_0
    return v2
.end method

.method public s0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lal/a;->F0(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lal/a;->v0(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public t0()Landroid/graphics/RenderEffect;
    .locals 1

    iget-object v0, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/RenderEffect;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lal/a;->u0()Landroid/graphics/RenderEffect;

    move-result-object v0

    iput-object v0, p0, Lal/a;->x:Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lal/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "values="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method

.method public abstract u0()Landroid/graphics/RenderEffect;
.end method

.method public v0(Ljava/lang/String;)Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1}, Lal/a;->E0(Ljava/lang/String;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1
.end method

.method public w0(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lal/a;->x0(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public x0(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public abstract y0()Ljava/lang/Object;
.end method

.method public abstract z0()Ljava/lang/Object;
.end method
