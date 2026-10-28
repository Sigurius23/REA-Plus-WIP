.class public abstract Ls93/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# direct methods
.method public static final a(Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string v0, "url"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClose"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const v0, -0x74dfc5c1

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    invoke-virtual {p3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    invoke-virtual {p3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x100

    goto :goto_2

    :cond_2
    const/16 v1, 0x80

    :goto_2
    or-int/2addr v0, v1

    and-int/lit16 v0, v0, 0x93

    const/16 v1, 0x92

    if-ne v0, v1, :cond_4

    invoke-virtual {p3}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p3}, Lp1/q;->X()V

    move-object v4, p0

    move-object v3, p1

    move-object v6, p2

    goto :goto_4

    :cond_4
    :goto_3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    const/4 v0, 0x0

    invoke-static {v2, p3, v0}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    new-instance v5, Lkotlin/jvm/internal/g0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v1, La81/n;

    const/16 v7, 0x11

    move-object v4, p0

    move-object v3, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v7}, La81/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-static {p1, p0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const-string p1, "qr_code_web_view"

    invoke-static {p0, p1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    new-instance p1, Lum0/b;

    const/16 p2, 0x1d

    invoke-direct {p1, p2, v5, v0}, Lum0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/16 p2, 0x30

    invoke-static {v1, p0, p1, p3, p2}, Lb4/n;->a(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    :goto_4
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance p1, Lu11/g;

    invoke-direct {p1, v4, v3, v6, p4}, Lu11/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lc93/a;I)V

    iput-object p1, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public static final b(Ljava/util/logging/Logger;Lyd3/a;Lyd3/c;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p2, p2, Lyd3/c;->b:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x20

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 p2, 0x1

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    const-string p3, "%-22s"

    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lyd3/a;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    return-void
.end method

.method public static final c(Ly00/c;)Ljava/util/Map;
    .locals 8

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine1$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    iget-object v1, p0, Ly00/c;->y:Ljava/lang/String;

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine2$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    iget-object v1, p0, Ly00/c;->z:Ljava/lang/String;

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCity$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    iget-object v1, p0, Ly00/c;->w:Ljava/lang/String;

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getState$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    iget-object v1, p0, Ly00/c;->F:Ljava/lang/String;

    new-instance v5, Ll83/k;

    invoke-direct {v5, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    iget-object v1, p0, Ly00/c;->x:Ljava/lang/String;

    new-instance v6, Ll83/k;

    invoke-direct {v6, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPostalCode$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    iget-object p0, p0, Ly00/c;->E:Ljava/lang/String;

    new-instance v7, Ll83/k;

    invoke-direct {v7, v0, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v2 .. v7}, [Ll83/k;

    move-result-object p0

    invoke-static {p0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/lang/reflect/Constructor;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p0

    const-string v1, "getParameterTypes(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v3}, Lx93/c;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const-string p0, ")V"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "toString(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final e(Lmf/l;Lyf/k;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lvf/c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lvf/c;

    iget v1, v0, Lvf/c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvf/c;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lvf/c;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lvf/c;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lvf/c;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lvf/c;->x:Lyf/k;

    iget-object p0, v0, Lvf/c;->w:Lmf/l;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lvf/c;->w:Lmf/l;

    iput-object p1, v0, Lvf/c;->x:Lyf/k;

    iput v3, v0, Lvf/c;->z:I

    invoke-static {p0, v0}, Lx30/s0;->B(Lmf/l;Ls83/c;)Ljava/io/Serializable;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, [B

    if-nez p2, :cond_4

    sget-object p0, Lmf/j;->a:Lmf/j;

    return-object p0

    :cond_4
    const/4 v0, 0x0

    array-length v1, p2

    invoke-virtual {p1, p2, v0, v1}, Lyf/k;->write([BII)V

    new-instance p1, Lvf/d;

    invoke-direct {p1, p0, p2}, Lvf/d;-><init>(Lmf/l;[B)V

    return-object p1
.end method

.method public static f(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;Lty/c;)Ljava/util/ArrayList;
    .locals 2

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getType()Ljava/lang/String;

    move-result-object p1

    const-string v1, "paymentMethodCode"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lv00/d0;->b:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv00/b0;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lv00/b0;->getType()Ly00/f4;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, Lv00/c0;->Z:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh20/i3;

    if-nez p1, :cond_1

    sget-object p1, Lh20/i3;->w:Lh20/i3;

    :cond_1
    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-virtual {p2, p0, v0, v1, p1}, Lty/c;->v(Lv00/c0;Ljava/util/ArrayList;Ljava/util/List;Lh20/i3;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lug/b;Ljava/lang/String;Ljava/lang/String;)Lve/e;
    .locals 7

    const-string v0, "accessKeyId"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "secretAccessKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p4, :cond_1

    if-eqz p5, :cond_0

    goto :goto_0

    :cond_0
    sget-object p4, Lgf/i;->w:Lgf/i;

    move-object v5, p4

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, Lgf/c;

    invoke-direct {v0}, Lgf/c;-><init>()V

    sget-object v1, Lxf/b;->a:Lgf/a;

    invoke-static {v0, v1, p4}, Ljc/x;->s0(Lgf/l;Lgf/a;Ljava/lang/Object;)V

    sget-object p4, Lxd/a;->b:Lgf/a;

    invoke-static {v0, p4, p5}, Ljc/x;->s0(Lgf/l;Lgf/a;Ljava/lang/Object;)V

    move-object v5, v0

    :goto_1
    const/16 v6, 0x10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v6}, Lve/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lug/b;Lgf/b;I)Lve/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lve/e;
    .locals 6

    and-int/lit8 p5, p5, 0x10

    if-eqz p5, :cond_0

    const/4 p3, 0x0

    :cond_0
    move-object v4, p3

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Ls93/h;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lug/b;Ljava/lang/String;Ljava/lang/String;)Lve/e;

    move-result-object p0

    return-object p0
.end method

.method public static i(Ljava/util/Collection;Lub3/a;Ls9/f;)Ljava/lang/Object;
    .locals 2

    new-instance v0, La8/d;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, La8/d;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1, v0, p2}, Ls93/h;->j(Ljava/lang/Object;Lub3/a;La8/d;Ls9/f;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ls9/f;->y()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static j(Ljava/lang/Object;Lub3/a;La8/d;Ls9/f;)V
    .locals 2

    if-eqz p0, :cond_3

    iget-object v0, p2, La8/d;->a:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p3, p0}, Ls9/f;->q(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-interface {p1, p0}, Lub3/a;->r(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1, p2, p3}, Ls93/h;->j(Ljava/lang/Object;Lub3/a;La8/d;Ls9/f;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p3, p0}, Ls9/f;->p(Ljava/lang/Object;)V

    return-void

    :cond_3
    const/4 p0, 0x3

    new-array p0, p0, [Ljava/lang/Object;

    const/16 p1, 0x16

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    const-string p3, "nodes"

    aput-object p3, p0, p2

    goto :goto_2

    :pswitch_1
    const-string p3, "current"

    aput-object p3, p0, p2

    goto :goto_2

    :pswitch_2
    const-string p3, "node"

    aput-object p3, p0, p2

    goto :goto_2

    :pswitch_3
    const-string p3, "predicate"

    aput-object p3, p0, p2

    goto :goto_2

    :pswitch_4
    const-string p3, "handler"

    aput-object p3, p0, p2

    goto :goto_2

    :pswitch_5
    const-string p3, "visited"

    aput-object p3, p0, p2

    goto :goto_2

    :pswitch_6
    const-string p3, "neighbors"

    aput-object p3, p0, p2

    :goto_2
    const/4 p2, 0x1

    const-string p3, "kotlin/reflect/jvm/internal/impl/utils/DFS"

    aput-object p3, p0, p2

    const/4 p2, 0x2

    packed-switch p1, :pswitch_data_1

    const-string p1, "dfs"

    aput-object p1, p0, p2

    goto :goto_3

    :pswitch_7
    const-string p1, "doDfs"

    aput-object p1, p0, p2

    goto :goto_3

    :pswitch_8
    const-string p1, "topologicalOrder"

    aput-object p1, p0, p2

    goto :goto_3

    :pswitch_9
    const-string p1, "dfsFromNode"

    aput-object p1, p0, p2

    goto :goto_3

    :pswitch_a
    const-string p1, "ifAny"

    aput-object p1, p0, p2

    :goto_3
    const-string p1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_6
        :pswitch_4
        :pswitch_0
        :pswitch_6
        :pswitch_3
        :pswitch_2
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_2
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_6
        :pswitch_1
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
    .end packed-switch
.end method

.method public static final k(Lvf/b;ZLs83/c;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lvf/e;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lvf/e;

    iget v3, v2, Lvf/e;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lvf/e;->z:I

    goto :goto_0

    :cond_0
    new-instance v2, Lvf/e;

    invoke-direct {v2, v1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lvf/e;->y:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lvf/e;->z:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v0, v2, Lvf/e;->x:Lvf/b;

    iget-object v2, v2, Lvf/e;->w:Lyf/k;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Lyf/k;

    invoke-direct {v1}, Lyf/k;-><init>()V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v0, Lvf/b;->w:Lmf/r;

    iget-object v7, v0, Lvf/b;->y:Lmf/c;

    iget-object v8, v0, Lvf/b;->x:Lcg/j;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v6, 0x20

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v8, Lcg/j;->z:Lbd3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v10, Lcg/x;->c:I

    iget-object v10, v9, Lbd3/k;->c:Ljava/lang/Object;

    check-cast v10, Ljava/util/ArrayList;

    iget-boolean v9, v9, Lbd3/k;->b:Z

    invoke-static {v10, v9}, Lio/sentry/hints/j;->i(Ljava/util/List;Z)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, v8, Lcg/j;->E:Lcg/g;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v10, Lcg/i;->y:I

    iget-object v10, v9, Lcg/g;->w:Lgf/m;

    invoke-interface {v10}, Lgf/m;->f()Lxb3/i;

    move-result-object v10

    iget-boolean v9, v9, Lcg/g;->x:Z

    invoke-static {v10, v9}, Lqt/e;->c(Lxb3/i;Z)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, v8, Lcg/j;->G:Ltg/b;

    if-eqz v9, :cond_3

    const/16 v10, 0x23

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v9, v9, Ltg/b;->b:Ljava/lang/String;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v9, "<this>"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x0

    const-string v10, "/"

    invoke-static {v6, v10, v9}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v10, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :goto_1
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\r\n"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v9, "Host: "

    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v8, v8, Lcg/j;->x:Lbg/e;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    const-string v4, "Content-Length"

    invoke-virtual {v7, v4}, La2/a;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    const-wide/16 v9, 0x0

    if-eqz v8, :cond_5

    invoke-static {v8}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v8

    if-eqz v8, :cond_5

    :goto_2
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    goto :goto_3

    :cond_5
    iget-object v8, v0, Lvf/b;->z:Lmf/l;

    invoke-virtual {v8}, Lmf/l;->a()Ljava/lang/Long;

    move-result-object v8

    if-eqz v8, :cond_6

    goto :goto_2

    :cond_6
    move-wide v11, v9

    :goto_3
    cmp-long v8, v11, v9

    if-lez v8, :cond_7

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Content-Length: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v1, v8}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    :cond_7
    const-string v8, "Host"

    filled-new-array {v8, v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    iget-object v7, v7, La2/a;->x:Ljava/lang/Object;

    check-cast v7, Ljava/util/Map;

    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_8
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ljava/util/Map$Entry;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v4, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_8

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    move-object v9, v7

    check-cast v9, Ljava/lang/Iterable;

    const-string v7, ": "

    invoke-static {v8, v7}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const/4 v13, 0x0

    const/16 v14, 0x38

    const-string v10, ";"

    const-string v12, "\r\n"

    invoke-static/range {v9 .. v14}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    goto :goto_5

    :cond_a
    const/4 v4, 0x2

    invoke-virtual {v1, v4, v6}, Lyf/k;->z(ILjava/lang/String;)V

    if-eqz p1, :cond_10

    iget-object v4, v0, Lvf/b;->z:Lmf/l;

    instance-of v6, v4, Lof/a;

    if-eqz v6, :cond_b

    check-cast v4, Lof/a;

    iget-object v0, v4, Lof/a;->a:[B

    invoke-static {v1, v0}, Lyf/l;->X(Lyf/k;[B)V

    goto :goto_8

    :cond_b
    instance-of v6, v4, Lmf/n;

    if-nez v6, :cond_e

    instance-of v6, v4, Lmf/k;

    if-eqz v6, :cond_c

    goto :goto_6

    :cond_c
    instance-of v0, v4, Lmf/j;

    if-eqz v0, :cond_d

    goto :goto_8

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_e
    :goto_6
    iput-object v1, v2, Lvf/e;->w:Lyf/k;

    iput-object v0, v2, Lvf/e;->x:Lvf/b;

    iput v5, v2, Lvf/e;->z:I

    invoke-static {v4, v1, v2}, Ls93/h;->e(Lmf/l;Lyf/k;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_f

    return-object v3

    :cond_f
    move-object v15, v2

    move-object v2, v1

    move-object v1, v15

    :goto_7
    check-cast v1, Lmf/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "<set-?>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lvf/b;->z:Lmf/l;

    move-object v1, v2

    :cond_10
    :goto_8
    invoke-virtual {v1}, Lyf/k;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static l(Ljava/lang/reflect/Field;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p0

    const-string v0, "getType(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lx93/c;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static n(Ls93/i;Lva3/e;)Ls93/b;
    .locals 2

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ls93/b;

    invoke-interface {v1}, Ls93/b;->b()Lva3/e;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Ls93/b;

    return-object v0
.end method

.method public static final o(J)Ljava/lang/String;
    .locals 12

    const-wide/32 v0, -0x3b9328e0

    cmp-long v0, p0, v0

    const-string v1, " s "

    const v2, 0x3b9aca00

    const v3, 0x1dcd6500

    if-gtz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v3, v3

    sub-long/2addr p0, v3

    int-to-long v2, v2

    div-long/2addr p0, v2

    invoke-static {p0, p1, v1, v0}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-wide/32 v4, -0xf404c

    cmp-long v0, p0, v4

    const-string v4, " ms"

    const v5, 0xf4240

    const v6, 0x7a120

    if-gtz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v6

    sub-long/2addr p0, v1

    int-to-long v1, v5

    div-long/2addr p0, v1

    invoke-static {p0, p1, v4, v0}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    const-wide/16 v7, 0x0

    cmp-long v0, p0, v7

    const-string v7, " \u00b5s"

    const/16 v8, 0x3e8

    const/16 v9, 0x1f4

    if-gtz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v9

    sub-long/2addr p0, v1

    int-to-long v1, v8

    div-long/2addr p0, v1

    invoke-static {p0, p1, v7, v0}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    const-wide/32 v10, 0xf404c

    cmp-long v0, p0, v10

    if-gez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v9

    add-long/2addr p0, v1

    int-to-long v1, v8

    div-long/2addr p0, v1

    invoke-static {p0, p1, v7, v0}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_3
    const-wide/32 v7, 0x3b9328e0

    cmp-long v0, p0, v7

    if-gez v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v6

    add-long/2addr p0, v1

    int-to-long v1, v5

    div-long/2addr p0, v1

    invoke-static {p0, p1, v4, v0}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v3, v3

    add-long/2addr p0, v3

    int-to-long v2, v2

    div-long/2addr p0, v2

    invoke-static {p0, p1, v1, v0}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    const/4 p1, 0x1

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%6s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static p(Ls93/i;Lva3/e;)Z
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ls93/i;->T(Lva3/e;)Ls93/b;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final q(Lvf/b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lvf/b;->y:Lmf/c;

    invoke-virtual {p0, p2, p1}, La2/a;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static r(Ljava/util/Collection;Lub3/a;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Z

    new-instance v1, Lcb3/d;

    const/4 v2, 0x2

    invoke-direct {v1, p2, v0, v2}, Lcb3/d;-><init>(Ljava/lang/Object;Ljava/io/Serializable;I)V

    invoke-static {p0, p1, v1}, Ls93/h;->i(Ljava/util/Collection;Lub3/a;Ls9/f;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public static s(Lvf/b;)Lvf/g;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvf/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lvf/g;-><init>(Lvf/b;Z)V

    return-object v0
.end method

.method public static t(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getParameterTypes(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v4}, Lx93/c;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p0

    const-string v1, "getReturnType(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lx93/c;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "toString(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
