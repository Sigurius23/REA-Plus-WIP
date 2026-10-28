.class public abstract Lds/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lo2/e;


# direct methods
.method public static final A(Ljava/util/Map;)Ljava/util/LinkedHashMap;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static B(Landroidx/glance/appwidget/protobuf/i;)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/i;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/i;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    invoke-virtual {p0, v1}, Landroidx/glance/appwidget/protobuf/i;->a(I)B

    move-result v2

    const/16 v3, 0x22

    if-eq v2, v3, :cond_3

    const/16 v3, 0x27

    if-eq v2, v3, :cond_2

    const/16 v3, 0x5c

    if-eq v2, v3, :cond_1

    packed-switch v2, :pswitch_data_0

    const/16 v4, 0x20

    if-lt v2, v4, :cond_0

    const/16 v4, 0x7e

    if-gt v2, v4, :cond_0

    int-to-char v2, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    ushr-int/lit8 v3, v2, 0x6

    and-int/lit8 v3, v3, 0x3

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    ushr-int/lit8 v3, v2, 0x3

    and-int/lit8 v3, v3, 0x7

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v2, v2, 0x7

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_0
    const-string v2, "\\r"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_1
    const-string v2, "\\f"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_2
    const-string v2, "\\v"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_3
    const-string v2, "\\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_4
    const-string v2, "\\t"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_5
    const-string v2, "\\b"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_6
    const-string v2, "\\a"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v2, "\\\\"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v2, "\\\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    const-string v2, "\\\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final C(Lhg/n;Lhg/i;Ljava/lang/Object;Lc93/m;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhg/k;

    invoke-direct {v0, p2, p3}, Lhg/k;-><init>(Ljava/lang/Object;Lc93/m;)V

    invoke-interface {p0, p1, v0}, Lhg/n;->l(Lhg/i;Lhg/k;)V

    return-void
.end method

.method public static final D(Laj/d;Lva3/c;Lsa3/e;)Lw93/b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadataVersion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Laj/d;->h(Lva3/c;Lsa3/e;)Lbu/c;

    move-result-object p0

    if-eqz p0, :cond_0

    iget-object p0, p0, Lbu/c;->w:Ljava/lang/Object;

    check-cast p0, Lw93/b;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static E(Ljava/lang/String;)Lg40/k2;
    .locals 3

    const-string v0, "countryCode"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg40/k2;->b:Ljava/lang/Object;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toUpperCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg40/g2;

    if-eqz v0, :cond_0

    new-instance p0, Lg40/j2;

    invoke-direct {p0, v0}, Lg40/j2;-><init>(Lg40/g2;)V

    return-object p0

    :cond_0
    new-instance v0, Lg40/i2;

    invoke-direct {v0, p0}, Lg40/i2;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static F(Lorg/json/JSONObject;)Ljk/d;
    .locals 5

    const-string v0, "branch"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "source"

    invoke-virtual {p0, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "version"

    invoke-virtual {p0, v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "versionId"

    invoke-virtual {p0, v4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljk/d;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v0, v1, Ljk/d;->a:Ljava/lang/String;

    iput-object v2, v1, Ljk/d;->b:Ljava/lang/String;

    iput-object v3, v1, Ljk/d;->c:Ljava/lang/String;

    iput-object p0, v1, Ljk/d;->d:Ljava/lang/String;

    return-object v1
.end method

.method public static G(Landroidx/compose/runtime/Composer;)F
    .locals 3

    sget-object v0, Lg1/l1;->a:Lp1/b0;

    check-cast p0, Lp1/q;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    sget-object v2, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {p0, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg1/c1;

    invoke-virtual {p0}, Lg1/c1;->i()Z

    move-result p0

    const v2, 0x3ec28f5c    # 0.38f

    if-eqz p0, :cond_0

    invoke-static {v0, v1}, Li2/w0;->x(J)F

    return v2

    :cond_0
    invoke-static {v0, v1}, Li2/w0;->x(J)F

    return v2
.end method

.method public static final H(J)F
    .locals 1

    const/16 v0, 0x20

    shr-long/2addr p0, v0

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    return p0
.end method

.method public static final I(Lq0/q;)I
    .locals 4

    iget-object v0, p0, Lq0/q;->e:Lh0/d2;

    sget-object v1, Lh0/d2;->w:Lh0/d2;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lq0/q;->e()J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    :goto_0
    long-to-int p0, v0

    return p0

    :cond_0
    invoke-virtual {p0}, Lq0/q;->e()J

    move-result-wide v0

    const/16 p0, 0x20

    shr-long/2addr v0, p0

    goto :goto_0
.end method

.method public static final J(Llb3/y;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llb3/y;->p0()Llb3/f1;

    move-result-object p0

    instance-of p0, p0, Llb3/r;

    return p0
.end method

.method public static final K(J)Z
    .locals 2

    const-wide/16 v0, 0x2

    and-long/2addr p0, v0

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final L(J)Z
    .locals 2

    const-wide/16 v0, 0x1

    and-long/2addr p0, v0

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final M(Llb3/y;)Llb3/c0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llb3/y;->p0()Llb3/f1;

    move-result-object p0

    instance-of v0, p0, Llb3/r;

    if-eqz v0, :cond_0

    check-cast p0, Llb3/r;

    iget-object p0, p0, Llb3/r;->x:Llb3/c0;

    return-object p0

    :cond_0
    instance-of v0, p0, Llb3/c0;

    if-eqz v0, :cond_1

    check-cast p0, Llb3/c0;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final N(Lr53/c;I)I
    .locals 3

    iget-object v0, p0, Lr53/c;->x:[Lr53/f;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lr53/c;->y:Landroid/graphics/Rect;

    iget v0, v0, Lr53/f;->a:I

    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v1, v1, Landroid/graphics/Rect;->top:I

    invoke-virtual {p0, p1, v0, v2, v1}, Lr53/c;->b(IIII)I

    move-result p0

    return p0
.end method

.method public static final O(Lqc3/o;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lqc3/b;

    if-eqz v0, :cond_0

    check-cast p0, Lqc3/b;

    const/4 v0, 0x1

    invoke-static {v0, p2}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {p0}, Lqc3/b;->c()Laa3/u0;

    move-result-object v0

    invoke-interface {p0}, Lqc3/b;->f()Lqc3/b;

    move-result-object p0

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Lqc3/b;->c()Laa3/u0;

    move-result-object p0

    new-instance p2, Lsc3/f;

    iget-object p0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-direct {p2, p0}, Lsc3/f;-><init>(Ljava/util/List;)V

    new-instance p0, Lsc3/p;

    invoke-direct {p0, p1, p2}, Lsc3/p;-><init>(Ljava/lang/String;Lsc3/f;)V

    invoke-virtual {v0, p0}, Laa3/u0;->f(Lsc3/k;)V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "impossible"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final P(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 9

    const-string v0, "authSchemePreference"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lue/b;

    iget-object v1, v1, Lue/b;->a:Ljava/lang/String;

    const/16 v2, 0x23

    invoke-static {v2, v1, v1}, Lyb3/r;->D0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object v3, p1

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, v4

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lue/a;

    iget-object v8, v8, Lue/a;->a:Ljava/lang/String;

    invoke-static {v2, v8, v8}, Lyb3/r;->D0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_2
    const/4 v5, 0x1

    move-object v6, v7

    goto :goto_1

    :cond_3
    if-nez v5, :cond_4

    goto :goto_2

    :cond_4
    move-object v4, v6

    :goto_2
    check-cast v4, Lue/a;

    if-eqz v4, :cond_0

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    check-cast p1, Ljava/lang/Iterable;

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lue/a;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    invoke-static {v0, p0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static Q(Lio/sentry/rrweb/e;Lwe/o;Lio/sentry/v0;)V
    .locals 1

    const-string v0, "source"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object p0, p0, Lio/sentry/rrweb/e;->y:Lio/sentry/rrweb/d;

    invoke-virtual {p1, p2, p0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    return-void
.end method

.method public static final R(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x40

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string v0, "%07x"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final S(Lorg/webrtc/RTCStats;)Ln33/b;
    .locals 13

    new-instance v0, Ln33/b;

    invoke-virtual {p0}, Lorg/webrtc/RTCStats;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lorg/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const-string v4, "sdpFmtpLine"

    invoke-virtual {p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "RtcParser"

    const/4 v6, 0x0

    if-nez v4, :cond_1

    :cond_0
    :goto_0
    move-object v4, v6

    goto :goto_1

    :cond_1
    instance-of v7, v4, Ljava/lang/String;

    if-nez v7, :cond_2

    sget-object v7, Lb23/i;->a:Lb23/i;

    sget-object v7, Lb23/i;->d:Lb23/e;

    sget-object v8, Lb23/g;->E:Lb23/g;

    invoke-interface {v7, v8, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    sget-object v7, Lb23/i;->c:Lb23/j;

    const-string v9, "[toRtcStats] \'sdpFmtpLine\' => expected String but found "

    invoke-static {v4, v9}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v7, v8, v5, v4, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    :goto_1
    check-cast v4, Ljava/lang/String;

    const-string v7, "payloadType"

    invoke-virtual {p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_4

    :cond_3
    :goto_2
    move-object v7, v6

    goto :goto_3

    :cond_4
    instance-of v8, v7, Ljava/lang/Long;

    if-nez v8, :cond_5

    sget-object v8, Lb23/i;->a:Lb23/i;

    sget-object v8, Lb23/i;->d:Lb23/e;

    sget-object v9, Lb23/g;->E:Lb23/g;

    invoke-interface {v8, v9, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    sget-object v8, Lb23/i;->c:Lb23/j;

    const-string v10, "[toRtcStats] \'payloadType\' => expected Long but found "

    invoke-static {v7, v10}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v9, v5, v7, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_5
    :goto_3
    check-cast v7, Ljava/lang/Long;

    const-string v8, "transportId"

    invoke-virtual {p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_7

    :cond_6
    :goto_4
    move-object v8, v6

    goto :goto_5

    :cond_7
    instance-of v9, v8, Ljava/lang/String;

    if-nez v9, :cond_8

    sget-object v9, Lb23/i;->a:Lb23/i;

    sget-object v9, Lb23/i;->d:Lb23/e;

    sget-object v10, Lb23/g;->E:Lb23/g;

    invoke-interface {v9, v10, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    sget-object v9, Lb23/i;->c:Lb23/j;

    const-string v11, "[toRtcStats] \'transportId\' => expected String but found "

    invoke-static {v8, v11}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v9, v10, v5, v8, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_8
    :goto_5
    check-cast v8, Ljava/lang/String;

    const-string v9, "mimeType"

    invoke-virtual {p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_a

    :cond_9
    :goto_6
    move-object v9, v6

    goto :goto_7

    :cond_a
    instance-of v10, v9, Ljava/lang/String;

    if-nez v10, :cond_b

    sget-object v10, Lb23/i;->a:Lb23/i;

    sget-object v10, Lb23/i;->d:Lb23/e;

    sget-object v11, Lb23/g;->E:Lb23/g;

    invoke-interface {v10, v11, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    sget-object v10, Lb23/i;->c:Lb23/j;

    const-string v12, "[toRtcStats] \'mimeType\' => expected String but found "

    invoke-static {v9, v12}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v10, v11, v5, v9, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_b
    :goto_7
    check-cast v9, Ljava/lang/String;

    const-string v10, "clockRate"

    invoke-virtual {p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_c

    goto :goto_8

    :cond_c
    instance-of v10, p0, Ljava/lang/Long;

    if-nez v10, :cond_d

    sget-object v10, Lb23/i;->a:Lb23/i;

    sget-object v10, Lb23/i;->d:Lb23/e;

    sget-object v11, Lb23/g;->E:Lb23/g;

    invoke-interface {v10, v11, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_e

    sget-object v10, Lb23/i;->c:Lb23/j;

    const-string v12, "[toRtcStats] \'clockRate\' => expected Long but found "

    invoke-static {p0, v12}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {v10, v11, v5, p0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_8

    :cond_d
    move-object v6, p0

    :cond_e
    :goto_8
    check-cast v6, Ljava/lang/Long;

    move-object v5, v8

    move-object v8, v6

    move-object v6, v5

    move-object v5, v7

    move-object v7, v9

    invoke-direct/range {v0 .. v8}, Ln33/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    return-object v0
.end method

.method public static final T(Lorg/webrtc/RTCStats;)Ln33/c;
    .locals 28

    new-instance v0, Ln33/c;

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const-string v4, "transportId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "RtcParser"

    const/4 v6, 0x0

    if-nez v4, :cond_1

    :cond_0
    :goto_0
    move-object v4, v6

    goto :goto_1

    :cond_1
    instance-of v7, v4, Ljava/lang/String;

    if-nez v7, :cond_2

    sget-object v7, Lb23/i;->a:Lb23/i;

    sget-object v7, Lb23/i;->d:Lb23/e;

    sget-object v8, Lb23/g;->E:Lb23/g;

    invoke-interface {v7, v8, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    sget-object v7, Lb23/i;->c:Lb23/j;

    const-string v9, "[toRtcStats] \'transportId\' => expected String but found "

    invoke-static {v4, v9}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v7, v8, v5, v4, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    :goto_1
    check-cast v4, Ljava/lang/String;

    const-string v7, "requestsSent"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_4

    :cond_3
    :goto_2
    move-object v7, v6

    goto :goto_3

    :cond_4
    instance-of v8, v7, Ljava/math/BigInteger;

    if-nez v8, :cond_5

    sget-object v8, Lb23/i;->a:Lb23/i;

    sget-object v8, Lb23/i;->d:Lb23/e;

    sget-object v9, Lb23/g;->E:Lb23/g;

    invoke-interface {v8, v9, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    sget-object v8, Lb23/i;->c:Lb23/j;

    const-string v10, "[toRtcStats] \'requestsSent\' => expected BigInteger but found "

    invoke-static {v7, v10}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v9, v5, v7, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_5
    :goto_3
    check-cast v7, Ljava/math/BigInteger;

    const-string v8, "localCandidateId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_7

    :cond_6
    :goto_4
    move-object v8, v6

    goto :goto_5

    :cond_7
    instance-of v9, v8, Ljava/lang/String;

    if-nez v9, :cond_8

    sget-object v9, Lb23/i;->a:Lb23/i;

    sget-object v9, Lb23/i;->d:Lb23/e;

    sget-object v10, Lb23/g;->E:Lb23/g;

    invoke-interface {v9, v10, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    sget-object v9, Lb23/i;->c:Lb23/j;

    const-string v11, "[toRtcStats] \'localCandidateId\' => expected String but found "

    invoke-static {v8, v11}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v9, v10, v5, v8, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_8
    :goto_5
    check-cast v8, Ljava/lang/String;

    const-string v9, "bytesSent"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_a

    :cond_9
    :goto_6
    move-object v9, v6

    goto :goto_7

    :cond_a
    instance-of v10, v9, Ljava/math/BigInteger;

    if-nez v10, :cond_b

    sget-object v10, Lb23/i;->a:Lb23/i;

    sget-object v10, Lb23/i;->d:Lb23/e;

    sget-object v11, Lb23/g;->E:Lb23/g;

    invoke-interface {v10, v11, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    sget-object v10, Lb23/i;->c:Lb23/j;

    const-string v12, "[toRtcStats] \'bytesSent\' => expected BigInteger but found "

    invoke-static {v9, v12}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v10, v11, v5, v9, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_b
    :goto_7
    check-cast v9, Ljava/math/BigInteger;

    const-string v10, "bytesDiscardedOnSend"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_d

    :cond_c
    :goto_8
    move-object v10, v6

    goto :goto_9

    :cond_d
    instance-of v11, v10, Ljava/math/BigInteger;

    if-nez v11, :cond_e

    sget-object v11, Lb23/i;->a:Lb23/i;

    sget-object v11, Lb23/i;->d:Lb23/e;

    sget-object v12, Lb23/g;->E:Lb23/g;

    invoke-interface {v11, v12, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_c

    sget-object v11, Lb23/i;->c:Lb23/j;

    const-string v13, "[toRtcStats] \'bytesDiscardedOnSend\' => expected BigInteger but found "

    invoke-static {v10, v13}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v11, v12, v5, v10, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_8

    :cond_e
    :goto_9
    check-cast v10, Ljava/math/BigInteger;

    const-string v11, "priority"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_10

    :cond_f
    :goto_a
    move-object v11, v6

    goto :goto_b

    :cond_10
    instance-of v12, v11, Ljava/math/BigInteger;

    if-nez v12, :cond_11

    sget-object v12, Lb23/i;->a:Lb23/i;

    sget-object v12, Lb23/i;->d:Lb23/e;

    sget-object v13, Lb23/g;->E:Lb23/g;

    invoke-interface {v12, v13, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_f

    sget-object v12, Lb23/i;->c:Lb23/j;

    const-string v14, "[toRtcStats] \'priority\' => expected BigInteger but found "

    invoke-static {v11, v14}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v12, v13, v5, v11, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_a

    :cond_11
    :goto_b
    check-cast v11, Ljava/math/BigInteger;

    const-string v12, "requestsReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_13

    :cond_12
    :goto_c
    move-object v12, v6

    goto :goto_d

    :cond_13
    instance-of v13, v12, Ljava/math/BigInteger;

    if-nez v13, :cond_14

    sget-object v13, Lb23/i;->a:Lb23/i;

    sget-object v13, Lb23/i;->d:Lb23/e;

    sget-object v14, Lb23/g;->E:Lb23/g;

    invoke-interface {v13, v14, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_12

    sget-object v13, Lb23/i;->c:Lb23/j;

    const-string v15, "[toRtcStats] \'requestsReceived\' => expected BigInteger but found "

    invoke-static {v12, v15}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v13, v14, v5, v12, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_c

    :cond_14
    :goto_d
    check-cast v12, Ljava/math/BigInteger;

    const-string v13, "writable"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_16

    :cond_15
    move-object/from16 v16, v0

    :goto_e
    move-object v13, v6

    goto :goto_f

    :cond_16
    instance-of v14, v13, Ljava/lang/Boolean;

    if-nez v14, :cond_17

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_15

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v16, v0

    const-string v0, "[toRtcStats] \'writable\' => expected Boolean but found "

    invoke-static {v13, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_e

    :cond_17
    move-object/from16 v16, v0

    :goto_f
    check-cast v13, Ljava/lang/Boolean;

    const-string v0, "remoteCandidateId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_19

    :cond_18
    move-object/from16 v17, v1

    :goto_10
    move-object v0, v6

    goto :goto_11

    :cond_19
    instance-of v14, v0, Ljava/lang/String;

    if-nez v14, :cond_1a

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_18

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v17, v1

    const-string v1, "[toRtcStats] \'remoteCandidateId\' => expected String but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_10

    :cond_1a
    move-object/from16 v17, v1

    :goto_11
    check-cast v0, Ljava/lang/String;

    const-string v1, "bytesReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1c

    :cond_1b
    move-object/from16 v18, v0

    :goto_12
    move-object v1, v6

    goto :goto_13

    :cond_1c
    instance-of v14, v1, Ljava/math/BigInteger;

    if-nez v14, :cond_1d

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1b

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v18, v0

    const-string v0, "[toRtcStats] \'bytesReceived\' => expected BigInteger but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_12

    :cond_1d
    move-object/from16 v18, v0

    :goto_13
    check-cast v1, Ljava/math/BigInteger;

    const-string v0, "packetsReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1f

    :cond_1e
    move-object/from16 v19, v1

    :goto_14
    move-object v0, v6

    goto :goto_15

    :cond_1f
    instance-of v14, v0, Ljava/math/BigInteger;

    if-nez v14, :cond_20

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1e

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v19, v1

    const-string v1, "[toRtcStats] \'packetsReceived\' => expected BigInteger but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_14

    :cond_20
    move-object/from16 v19, v1

    :goto_15
    move-object v14, v0

    check-cast v14, Ljava/math/BigInteger;

    const-string v0, "responsesSent"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_22

    :cond_21
    move-object/from16 v20, v2

    :goto_16
    move-object v0, v6

    goto :goto_17

    :cond_22
    instance-of v1, v0, Ljava/math/BigInteger;

    if-nez v1, :cond_23

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_21

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v20, v2

    const-string v2, "[toRtcStats] \'responsesSent\' => expected BigInteger but found "

    invoke-static {v0, v2}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_16

    :cond_23
    move-object/from16 v20, v2

    :goto_17
    move-object v15, v0

    check-cast v15, Ljava/math/BigInteger;

    const-string v0, "packetsDiscardedOnSend"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_25

    :cond_24
    move-object/from16 v21, v3

    :goto_18
    move-object v0, v6

    goto :goto_19

    :cond_25
    instance-of v1, v0, Ljava/math/BigInteger;

    if-nez v1, :cond_26

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_24

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v21, v3

    const-string v3, "[toRtcStats] \'packetsDiscardedOnSend\' => expected BigInteger but found "

    invoke-static {v0, v3}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_18

    :cond_26
    move-object/from16 v21, v3

    :goto_19
    check-cast v0, Ljava/math/BigInteger;

    const-string v1, "nominated"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_28

    :cond_27
    move-object/from16 v22, v0

    :goto_1a
    move-object v1, v6

    goto :goto_1b

    :cond_28
    instance-of v2, v1, Ljava/lang/Boolean;

    if-nez v2, :cond_29

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_27

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v22, v0

    const-string v0, "[toRtcStats] \'nominated\' => expected Boolean but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1a

    :cond_29
    move-object/from16 v22, v0

    :goto_1b
    check-cast v1, Ljava/lang/Boolean;

    const-string v0, "packetsSent"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2b

    :cond_2a
    move-object/from16 v23, v1

    :goto_1c
    move-object v0, v6

    goto :goto_1d

    :cond_2b
    instance-of v2, v0, Ljava/math/BigInteger;

    if-nez v2, :cond_2c

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2a

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v23, v1

    const-string v1, "[toRtcStats] \'packetsSent\' => expected BigInteger but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1c

    :cond_2c
    move-object/from16 v23, v1

    :goto_1d
    check-cast v0, Ljava/math/BigInteger;

    const-string v1, "totalRoundTripTime"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2e

    :cond_2d
    move-object/from16 v24, v0

    :goto_1e
    move-object v1, v6

    goto :goto_1f

    :cond_2e
    instance-of v2, v1, Ljava/lang/Double;

    if-nez v2, :cond_2f

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2d

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v24, v0

    const-string v0, "[toRtcStats] \'totalRoundTripTime\' => expected Double but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1e

    :cond_2f
    move-object/from16 v24, v0

    :goto_1f
    check-cast v1, Ljava/lang/Double;

    const-string v0, "responsesReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_31

    :cond_30
    move-object/from16 v25, v1

    :goto_20
    move-object v0, v6

    goto :goto_21

    :cond_31
    instance-of v2, v0, Ljava/math/BigInteger;

    if-nez v2, :cond_32

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_30

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v25, v1

    const-string v1, "[toRtcStats] \'responsesReceived\' => expected BigInteger but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_20

    :cond_32
    move-object/from16 v25, v1

    :goto_21
    check-cast v0, Ljava/math/BigInteger;

    const-string v1, "state"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_34

    :cond_33
    move-object/from16 v26, v0

    :goto_22
    move-object v1, v6

    goto :goto_23

    :cond_34
    instance-of v2, v1, Ljava/lang/String;

    if-nez v2, :cond_35

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_33

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v26, v0

    const-string v0, "[toRtcStats] \'state\' => expected String but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_22

    :cond_35
    move-object/from16 v26, v0

    :goto_23
    check-cast v1, Ljava/lang/String;

    const-string v0, "consentRequestsSent"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_37

    :cond_36
    move-object/from16 v27, v1

    goto :goto_24

    :cond_37
    instance-of v2, v0, Ljava/math/BigInteger;

    if-nez v2, :cond_38

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_36

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v27, v1

    const-string v1, "[toRtcStats] \'consentRequestsSent\' => expected BigInteger but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_24

    :cond_38
    move-object/from16 v27, v1

    move-object v6, v0

    :goto_24
    check-cast v6, Ljava/math/BigInteger;

    move-object v5, v7

    move-object v7, v9

    move-object v9, v11

    move-object v11, v13

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    move-object/from16 v13, v19

    move-object/from16 v2, v20

    move-object/from16 v3, v21

    move-object/from16 v16, v22

    move-object/from16 v17, v23

    move-object/from16 v19, v25

    move-object/from16 v20, v26

    move-object/from16 v21, v27

    move-object/from16 v22, v6

    move-object v6, v8

    move-object v8, v10

    move-object v10, v12

    move-object/from16 v12, v18

    move-object/from16 v18, v24

    invoke-direct/range {v0 .. v22}, Ln33/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/math/BigInteger;Ljava/lang/String;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/Boolean;Ljava/lang/String;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/Boolean;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/lang/String;Ljava/math/BigInteger;)V

    return-object v0
.end method

.method public static final U(Lorg/webrtc/RTCStats;)Ln33/d;
    .locals 22

    new-instance v0, Ln33/d;

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const-string v4, "transportId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "RtcParser"

    const/4 v6, 0x0

    if-nez v4, :cond_1

    :cond_0
    :goto_0
    move-object v4, v6

    goto :goto_1

    :cond_1
    instance-of v7, v4, Ljava/lang/String;

    if-nez v7, :cond_2

    sget-object v7, Lb23/i;->a:Lb23/i;

    sget-object v7, Lb23/i;->d:Lb23/e;

    sget-object v8, Lb23/g;->E:Lb23/g;

    invoke-interface {v7, v8, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    sget-object v7, Lb23/i;->c:Lb23/j;

    const-string v9, "[toRtcStats] \'transportId\' => expected String but found "

    invoke-static {v4, v9}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v7, v8, v5, v4, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    :goto_1
    check-cast v4, Ljava/lang/String;

    const-string v7, "candidateType"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_4

    :cond_3
    :goto_2
    move-object v7, v6

    goto :goto_3

    :cond_4
    instance-of v8, v7, Ljava/lang/String;

    if-nez v8, :cond_5

    sget-object v8, Lb23/i;->a:Lb23/i;

    sget-object v8, Lb23/i;->d:Lb23/e;

    sget-object v9, Lb23/g;->E:Lb23/g;

    invoke-interface {v8, v9, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    sget-object v8, Lb23/i;->c:Lb23/j;

    const-string v10, "[toRtcStats] \'candidateType\' => expected String but found "

    invoke-static {v7, v10}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v9, v5, v7, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_5
    :goto_3
    check-cast v7, Ljava/lang/String;

    const-string v8, "protocol"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_7

    :cond_6
    :goto_4
    move-object v8, v6

    goto :goto_5

    :cond_7
    instance-of v9, v8, Ljava/lang/String;

    if-nez v9, :cond_8

    sget-object v9, Lb23/i;->a:Lb23/i;

    sget-object v9, Lb23/i;->d:Lb23/e;

    sget-object v10, Lb23/g;->E:Lb23/g;

    invoke-interface {v9, v10, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    sget-object v9, Lb23/i;->c:Lb23/j;

    const-string v11, "[toRtcStats] \'protocol\' => expected String but found "

    invoke-static {v8, v11}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v9, v10, v5, v8, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_8
    :goto_5
    check-cast v8, Ljava/lang/String;

    const-string v9, "address"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_a

    :cond_9
    :goto_6
    move-object v9, v6

    goto :goto_7

    :cond_a
    instance-of v10, v9, Ljava/lang/String;

    if-nez v10, :cond_b

    sget-object v10, Lb23/i;->a:Lb23/i;

    sget-object v10, Lb23/i;->d:Lb23/e;

    sget-object v11, Lb23/g;->E:Lb23/g;

    invoke-interface {v10, v11, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    sget-object v10, Lb23/i;->c:Lb23/j;

    const-string v12, "[toRtcStats] \'address\' => expected String but found "

    invoke-static {v9, v12}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v10, v11, v5, v9, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_b
    :goto_7
    check-cast v9, Ljava/lang/String;

    const-string v10, "port"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_d

    :cond_c
    :goto_8
    move-object v10, v6

    goto :goto_9

    :cond_d
    instance-of v11, v10, Ljava/lang/Integer;

    if-nez v11, :cond_e

    sget-object v11, Lb23/i;->a:Lb23/i;

    sget-object v11, Lb23/i;->d:Lb23/e;

    sget-object v12, Lb23/g;->E:Lb23/g;

    invoke-interface {v11, v12, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_c

    sget-object v11, Lb23/i;->c:Lb23/j;

    const-string v13, "[toRtcStats] \'port\' => expected Integer but found "

    invoke-static {v10, v13}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v11, v12, v5, v10, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_8

    :cond_e
    :goto_9
    check-cast v10, Ljava/lang/Integer;

    const-string v11, "vpn"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_10

    :cond_f
    :goto_a
    move-object v11, v6

    goto :goto_b

    :cond_10
    instance-of v12, v11, Ljava/lang/Boolean;

    if-nez v12, :cond_11

    sget-object v12, Lb23/i;->a:Lb23/i;

    sget-object v12, Lb23/i;->d:Lb23/e;

    sget-object v13, Lb23/g;->E:Lb23/g;

    invoke-interface {v12, v13, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_f

    sget-object v12, Lb23/i;->c:Lb23/j;

    const-string v14, "[toRtcStats] \'vpn\' => expected Boolean but found "

    invoke-static {v11, v14}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v12, v13, v5, v11, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_a

    :cond_11
    :goto_b
    check-cast v11, Ljava/lang/Boolean;

    const-string v12, "isRemote"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_13

    :cond_12
    :goto_c
    move-object v12, v6

    goto :goto_d

    :cond_13
    instance-of v13, v12, Ljava/lang/Boolean;

    if-nez v13, :cond_14

    sget-object v13, Lb23/i;->a:Lb23/i;

    sget-object v13, Lb23/i;->d:Lb23/e;

    sget-object v14, Lb23/g;->E:Lb23/g;

    invoke-interface {v13, v14, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_12

    sget-object v13, Lb23/i;->c:Lb23/j;

    const-string v15, "[toRtcStats] \'isRemote\' => expected Boolean but found "

    invoke-static {v12, v15}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v13, v14, v5, v12, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_c

    :cond_14
    :goto_d
    check-cast v12, Ljava/lang/Boolean;

    const-string v13, "ip"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_16

    :cond_15
    move-object/from16 v16, v0

    :goto_e
    move-object v13, v6

    goto :goto_f

    :cond_16
    instance-of v14, v13, Ljava/lang/String;

    if-nez v14, :cond_17

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_15

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v16, v0

    const-string v0, "[toRtcStats] \'ip\' => expected String but found "

    invoke-static {v13, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_e

    :cond_17
    move-object/from16 v16, v0

    :goto_f
    check-cast v13, Ljava/lang/String;

    const-string v0, "networkAdapterType"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_19

    :cond_18
    move-object/from16 v17, v1

    :goto_10
    move-object v0, v6

    goto :goto_11

    :cond_19
    instance-of v14, v0, Ljava/lang/String;

    if-nez v14, :cond_1a

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_18

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v17, v1

    const-string v1, "[toRtcStats] \'networkAdapterType\' => expected String but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_10

    :cond_1a
    move-object/from16 v17, v1

    :goto_11
    check-cast v0, Ljava/lang/String;

    const-string v1, "networkType"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1c

    :cond_1b
    move-object/from16 v18, v0

    :goto_12
    move-object v1, v6

    goto :goto_13

    :cond_1c
    instance-of v14, v1, Ljava/lang/String;

    if-nez v14, :cond_1d

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1b

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v18, v0

    const-string v0, "[toRtcStats] \'networkType\' => expected String but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_12

    :cond_1d
    move-object/from16 v18, v0

    :goto_13
    check-cast v1, Ljava/lang/String;

    const-string v0, "priority"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1f

    :cond_1e
    move-object/from16 v19, v1

    :goto_14
    move-object v0, v6

    goto :goto_15

    :cond_1f
    instance-of v14, v0, Ljava/lang/Integer;

    if-nez v14, :cond_20

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1e

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v19, v1

    const-string v1, "[toRtcStats] \'priority\' => expected Integer but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_14

    :cond_20
    move-object/from16 v19, v1

    :goto_15
    move-object v14, v0

    check-cast v14, Ljava/lang/Integer;

    const-string v0, "url"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_22

    :cond_21
    move-object/from16 v20, v2

    :goto_16
    move-object v0, v6

    goto :goto_17

    :cond_22
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_23

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_21

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v20, v2

    const-string v2, "[toRtcStats] \'url\' => expected String but found "

    invoke-static {v0, v2}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_16

    :cond_23
    move-object/from16 v20, v2

    :goto_17
    move-object v15, v0

    check-cast v15, Ljava/lang/String;

    const-string v0, "relayProtocol"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_25

    :cond_24
    move-object/from16 v21, v3

    goto :goto_18

    :cond_25
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_26

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_24

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v21, v3

    const-string v3, "[toRtcStats] \'relayProtocol\' => expected String but found "

    invoke-static {v0, v3}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_18

    :cond_26
    move-object/from16 v21, v3

    move-object v6, v0

    :goto_18
    check-cast v6, Ljava/lang/String;

    move-object v5, v7

    move-object v7, v9

    move-object v9, v11

    move-object v11, v13

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    move-object/from16 v13, v19

    move-object/from16 v2, v20

    move-object/from16 v3, v21

    move-object/from16 v16, v6

    move-object v6, v8

    move-object v8, v10

    move-object v10, v12

    move-object/from16 v12, v18

    invoke-direct/range {v0 .. v16}, Ln33/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final V(Lorg/webrtc/RTCStats;)Ln33/e;
    .locals 49

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v3

    const-string v0, "ssrc"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v5, "RtcParser"

    const/4 v6, 0x0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    move-object v0, v6

    goto :goto_1

    :cond_1
    instance-of v7, v0, Ljava/lang/Long;

    if-nez v7, :cond_2

    sget-object v7, Lb23/i;->a:Lb23/i;

    sget-object v7, Lb23/i;->d:Lb23/e;

    sget-object v8, Lb23/g;->E:Lb23/g;

    invoke-interface {v7, v8, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    sget-object v7, Lb23/i;->c:Lb23/j;

    const-string v9, "[toRtcStats] \'ssrc\' => expected Long but found "

    invoke-static {v0, v9}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v8, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    :goto_1
    check-cast v0, Ljava/lang/Long;

    const-string v7, "kind"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_4

    :cond_3
    :goto_2
    move-object v7, v6

    goto :goto_3

    :cond_4
    instance-of v8, v7, Ljava/lang/String;

    if-nez v8, :cond_5

    sget-object v8, Lb23/i;->a:Lb23/i;

    sget-object v8, Lb23/i;->d:Lb23/e;

    sget-object v9, Lb23/g;->E:Lb23/g;

    invoke-interface {v8, v9, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    sget-object v8, Lb23/i;->c:Lb23/j;

    const-string v10, "[toRtcStats] \'kind\' => expected String but found "

    invoke-static {v7, v10}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v9, v5, v7, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_5
    :goto_3
    check-cast v7, Ljava/lang/String;

    const-string v8, "transportId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_7

    :cond_6
    :goto_4
    move-object v8, v6

    goto :goto_5

    :cond_7
    instance-of v9, v8, Ljava/lang/String;

    if-nez v9, :cond_8

    sget-object v9, Lb23/i;->a:Lb23/i;

    sget-object v9, Lb23/i;->d:Lb23/e;

    sget-object v10, Lb23/g;->E:Lb23/g;

    invoke-interface {v9, v10, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    sget-object v9, Lb23/i;->c:Lb23/j;

    const-string v11, "[toRtcStats] \'transportId\' => expected String but found "

    invoke-static {v8, v11}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v9, v10, v5, v8, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_8
    :goto_5
    check-cast v8, Ljava/lang/String;

    const-string v9, "codecId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_a

    :cond_9
    :goto_6
    move-object v9, v6

    goto :goto_7

    :cond_a
    instance-of v10, v9, Ljava/lang/String;

    if-nez v10, :cond_b

    sget-object v10, Lb23/i;->a:Lb23/i;

    sget-object v10, Lb23/i;->d:Lb23/e;

    sget-object v11, Lb23/g;->E:Lb23/g;

    invoke-interface {v10, v11, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    sget-object v10, Lb23/i;->c:Lb23/j;

    const-string v12, "[toRtcStats] \'codecId\' => expected String but found "

    invoke-static {v9, v12}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v10, v11, v5, v9, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_b
    :goto_7
    check-cast v9, Ljava/lang/String;

    const-string v10, "packetsReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_d

    :cond_c
    :goto_8
    move-object v10, v6

    goto :goto_9

    :cond_d
    instance-of v11, v10, Ljava/lang/Long;

    if-nez v11, :cond_e

    sget-object v11, Lb23/i;->a:Lb23/i;

    sget-object v11, Lb23/i;->d:Lb23/e;

    sget-object v12, Lb23/g;->E:Lb23/g;

    invoke-interface {v11, v12, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_c

    sget-object v11, Lb23/i;->c:Lb23/j;

    const-string v13, "[toRtcStats] \'packetsReceived\' => expected Long but found "

    invoke-static {v10, v13}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v11, v12, v5, v10, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_8

    :cond_e
    :goto_9
    check-cast v10, Ljava/lang/Long;

    const-string v11, "packetsLost"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_10

    :cond_f
    :goto_a
    move-object v11, v6

    goto :goto_b

    :cond_10
    instance-of v12, v11, Ljava/lang/Integer;

    if-nez v12, :cond_11

    sget-object v12, Lb23/i;->a:Lb23/i;

    sget-object v12, Lb23/i;->d:Lb23/e;

    sget-object v13, Lb23/g;->E:Lb23/g;

    invoke-interface {v12, v13, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_f

    sget-object v12, Lb23/i;->c:Lb23/j;

    const-string v14, "[toRtcStats] \'packetsLost\' => expected Integer but found "

    invoke-static {v11, v14}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v12, v13, v5, v11, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_a

    :cond_11
    :goto_b
    check-cast v11, Ljava/lang/Integer;

    const-string v12, "jitter"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_13

    :cond_12
    :goto_c
    move-object v12, v6

    goto :goto_d

    :cond_13
    instance-of v13, v12, Ljava/lang/Double;

    if-nez v13, :cond_14

    sget-object v13, Lb23/i;->a:Lb23/i;

    sget-object v13, Lb23/i;->d:Lb23/e;

    sget-object v14, Lb23/g;->E:Lb23/g;

    invoke-interface {v13, v14, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_12

    sget-object v13, Lb23/i;->c:Lb23/j;

    const-string v15, "[toRtcStats] \'jitter\' => expected Double but found "

    invoke-static {v12, v15}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v13, v14, v5, v12, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_c

    :cond_14
    :goto_d
    check-cast v12, Ljava/lang/Double;

    const-string v13, "trackIdentifier"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_16

    :cond_15
    move-object/from16 v16, v0

    :goto_e
    move-object v13, v6

    goto :goto_f

    :cond_16
    instance-of v14, v13, Ljava/lang/String;

    if-nez v14, :cond_17

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_15

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v16, v0

    const-string v0, "[toRtcStats] \'trackIdentifier\' => expected String but found "

    invoke-static {v13, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_e

    :cond_17
    move-object/from16 v16, v0

    :goto_f
    check-cast v13, Ljava/lang/String;

    const-string v0, "mid"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_19

    :cond_18
    move-object/from16 v17, v1

    :goto_10
    move-object v0, v6

    goto :goto_11

    :cond_19
    instance-of v14, v0, Ljava/lang/String;

    if-nez v14, :cond_1a

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_18

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v17, v1

    const-string v1, "[toRtcStats] \'mid\' => expected String but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_10

    :cond_1a
    move-object/from16 v17, v1

    :goto_11
    check-cast v0, Ljava/lang/String;

    const-string v1, "remoteId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1c

    :cond_1b
    move-object/from16 v18, v0

    :goto_12
    move-object v1, v6

    goto :goto_13

    :cond_1c
    instance-of v14, v1, Ljava/lang/String;

    if-nez v14, :cond_1d

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1b

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v18, v0

    const-string v0, "[toRtcStats] \'remoteId\' => expected String but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_12

    :cond_1d
    move-object/from16 v18, v0

    :goto_13
    check-cast v1, Ljava/lang/String;

    const-string v0, "lastPacketReceivedTimestamp"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1f

    :cond_1e
    move-object/from16 v19, v1

    :goto_14
    move-object v0, v6

    goto :goto_15

    :cond_1f
    instance-of v14, v0, Ljava/lang/Double;

    if-nez v14, :cond_20

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1e

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v19, v1

    const-string v1, "[toRtcStats] \'lastPacketReceivedTimestamp\' => expected Double but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_14

    :cond_20
    move-object/from16 v19, v1

    :goto_15
    move-object v14, v0

    check-cast v14, Ljava/lang/Double;

    const-string v0, "headerBytesReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_22

    :cond_21
    move-object/from16 v20, v2

    :goto_16
    move-object v0, v6

    goto :goto_17

    :cond_22
    instance-of v1, v0, Ljava/math/BigInteger;

    if-nez v1, :cond_23

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_21

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v20, v2

    const-string v2, "[toRtcStats] \'headerBytesReceived\' => expected BigInteger but found "

    invoke-static {v0, v2}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_16

    :cond_23
    move-object/from16 v20, v2

    :goto_17
    move-object v15, v0

    check-cast v15, Ljava/math/BigInteger;

    const-string v0, "packetsDiscarded"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_25

    :cond_24
    move-wide/from16 v21, v3

    :goto_18
    move-object v0, v6

    goto :goto_19

    :cond_25
    instance-of v1, v0, Ljava/math/BigInteger;

    if-nez v1, :cond_26

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_24

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-wide/from16 v21, v3

    const-string v3, "[toRtcStats] \'packetsDiscarded\' => expected BigInteger but found "

    invoke-static {v0, v3}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_18

    :cond_26
    move-wide/from16 v21, v3

    :goto_19
    check-cast v0, Ljava/math/BigInteger;

    const-string v1, "fecBytesReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_28

    :cond_27
    :goto_1a
    move-object v1, v6

    goto :goto_1b

    :cond_28
    instance-of v2, v1, Ljava/math/BigInteger;

    if-nez v2, :cond_29

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_27

    sget-object v2, Lb23/i;->c:Lb23/j;

    const-string v4, "[toRtcStats] \'fecBytesReceived\' => expected BigInteger but found "

    invoke-static {v1, v4}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v3, v5, v1, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1a

    :cond_29
    :goto_1b
    check-cast v1, Ljava/math/BigInteger;

    const-string v2, "fecPacketsReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2b

    :cond_2a
    move-object/from16 v23, v0

    :goto_1c
    move-object v2, v6

    goto :goto_1d

    :cond_2b
    instance-of v3, v2, Ljava/math/BigInteger;

    if-nez v3, :cond_2c

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2a

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v23, v0

    const-string v0, "[toRtcStats] \'fecPacketsReceived\' => expected BigInteger but found "

    invoke-static {v2, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1c

    :cond_2c
    move-object/from16 v23, v0

    :goto_1d
    check-cast v2, Ljava/math/BigInteger;

    const-string v0, "fecPacketsDiscarded"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2e

    :cond_2d
    move-object/from16 v24, v1

    :goto_1e
    move-object v0, v6

    goto :goto_1f

    :cond_2e
    instance-of v3, v0, Ljava/math/BigInteger;

    if-nez v3, :cond_2f

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2d

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v24, v1

    const-string v1, "[toRtcStats] \'fecPacketsDiscarded\' => expected BigInteger but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1e

    :cond_2f
    move-object/from16 v24, v1

    :goto_1f
    check-cast v0, Ljava/math/BigInteger;

    const-string v1, "bytesReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_31

    :cond_30
    move-object/from16 v25, v0

    :goto_20
    move-object v1, v6

    goto :goto_21

    :cond_31
    instance-of v3, v1, Ljava/math/BigInteger;

    if-nez v3, :cond_32

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_30

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v25, v0

    const-string v0, "[toRtcStats] \'bytesReceived\' => expected BigInteger but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_20

    :cond_32
    move-object/from16 v25, v0

    :goto_21
    check-cast v1, Ljava/math/BigInteger;

    const-string v0, "nackCount"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_34

    :cond_33
    move-object/from16 v26, v1

    :goto_22
    move-object v0, v6

    goto :goto_23

    :cond_34
    instance-of v3, v0, Ljava/lang/Long;

    if-nez v3, :cond_35

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_33

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v26, v1

    const-string v1, "[toRtcStats] \'nackCount\' => expected Long but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_22

    :cond_35
    move-object/from16 v26, v1

    :goto_23
    check-cast v0, Ljava/lang/Long;

    const-string v1, "totalProcessingDelay"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_37

    :cond_36
    move-object/from16 v27, v0

    :goto_24
    move-object v1, v6

    goto :goto_25

    :cond_37
    instance-of v3, v1, Ljava/lang/Double;

    if-nez v3, :cond_38

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_36

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v27, v0

    const-string v0, "[toRtcStats] \'totalProcessingDelay\' => expected Double but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_24

    :cond_38
    move-object/from16 v27, v0

    :goto_25
    check-cast v1, Ljava/lang/Double;

    const-string v0, "estimatedPlayoutTimestamp"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3a

    :cond_39
    move-object/from16 v28, v1

    :goto_26
    move-object v0, v6

    goto :goto_27

    :cond_3a
    instance-of v3, v0, Ljava/lang/Double;

    if-nez v3, :cond_3b

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_39

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v28, v1

    const-string v1, "[toRtcStats] \'estimatedPlayoutTimestamp\' => expected Double but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_26

    :cond_3b
    move-object/from16 v28, v1

    :goto_27
    check-cast v0, Ljava/lang/Double;

    const-string v1, "jitterBufferDelay"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3d

    :cond_3c
    move-object/from16 v29, v0

    :goto_28
    move-object v1, v6

    goto :goto_29

    :cond_3d
    instance-of v3, v1, Ljava/lang/Double;

    if-nez v3, :cond_3e

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3c

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v29, v0

    const-string v0, "[toRtcStats] \'jitterBufferDelay\' => expected Double but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_28

    :cond_3e
    move-object/from16 v29, v0

    :goto_29
    check-cast v1, Ljava/lang/Double;

    const-string v0, "jitterBufferTargetDelay"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_40

    :cond_3f
    move-object/from16 v30, v1

    :goto_2a
    move-object v0, v6

    goto :goto_2b

    :cond_40
    instance-of v3, v0, Ljava/lang/Double;

    if-nez v3, :cond_41

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3f

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v30, v1

    const-string v1, "[toRtcStats] \'jitterBufferTargetDelay\' => expected Double but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2a

    :cond_41
    move-object/from16 v30, v1

    :goto_2b
    check-cast v0, Ljava/lang/Double;

    const-string v1, "jitterBufferEmittedCount"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_43

    :cond_42
    move-object/from16 v31, v0

    :goto_2c
    move-object v1, v6

    goto :goto_2d

    :cond_43
    instance-of v3, v1, Ljava/math/BigInteger;

    if-nez v3, :cond_44

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_42

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v31, v0

    const-string v0, "[toRtcStats] \'jitterBufferEmittedCount\' => expected BigInteger but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2c

    :cond_44
    move-object/from16 v31, v0

    :goto_2d
    check-cast v1, Ljava/math/BigInteger;

    const-string v0, "jitterBufferMinimumDelay"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_46

    :cond_45
    move-object/from16 v32, v1

    :goto_2e
    move-object v0, v6

    goto :goto_2f

    :cond_46
    instance-of v3, v0, Ljava/lang/Double;

    if-nez v3, :cond_47

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_45

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v32, v1

    const-string v1, "[toRtcStats] \'jitterBufferMinimumDelay\' => expected Double but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2e

    :cond_47
    move-object/from16 v32, v1

    :goto_2f
    check-cast v0, Ljava/lang/Double;

    const-string v1, "decoderImplementation"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_49

    :cond_48
    move-object/from16 v33, v0

    :goto_30
    move-object v1, v6

    goto :goto_31

    :cond_49
    instance-of v3, v1, Ljava/lang/String;

    if-nez v3, :cond_4a

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_48

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v33, v0

    const-string v0, "[toRtcStats] \'decoderImplementation\' => expected String but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_30

    :cond_4a
    move-object/from16 v33, v0

    :goto_31
    check-cast v1, Ljava/lang/String;

    const-string v0, "playoutId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4c

    :cond_4b
    move-object/from16 v34, v1

    :goto_32
    move-object v0, v6

    goto :goto_33

    :cond_4c
    instance-of v3, v0, Ljava/lang/String;

    if-nez v3, :cond_4d

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4b

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v34, v1

    const-string v1, "[toRtcStats] \'playoutId\' => expected String but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_32

    :cond_4d
    move-object/from16 v34, v1

    :goto_33
    check-cast v0, Ljava/lang/String;

    const-string v1, "powerEfficientDecoder"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_4f

    :cond_4e
    move-object/from16 v35, v0

    :goto_34
    move-object v1, v6

    goto :goto_35

    :cond_4f
    instance-of v3, v1, Ljava/lang/Boolean;

    if-nez v3, :cond_50

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4e

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v35, v0

    const-string v0, "[toRtcStats] \'powerEfficientDecoder\' => expected Boolean but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_34

    :cond_50
    move-object/from16 v35, v0

    :goto_35
    check-cast v1, Ljava/lang/Boolean;

    const-string v0, "retransmittedPacketsReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_52

    :cond_51
    move-object/from16 v36, v1

    :goto_36
    move-object v0, v6

    goto :goto_37

    :cond_52
    instance-of v3, v0, Ljava/math/BigInteger;

    if-nez v3, :cond_53

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_51

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v36, v1

    const-string v1, "[toRtcStats] \'retransmittedPacketsReceived\' => expected BigInteger but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_36

    :cond_53
    move-object/from16 v36, v1

    :goto_37
    check-cast v0, Ljava/math/BigInteger;

    const-string v1, "retransmittedBytesReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_55

    :cond_54
    move-object/from16 v37, v0

    :goto_38
    move-object v1, v6

    goto :goto_39

    :cond_55
    instance-of v3, v1, Ljava/math/BigInteger;

    if-nez v3, :cond_56

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_54

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v37, v0

    const-string v0, "[toRtcStats] \'retransmittedBytesReceived\' => expected BigInteger but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_38

    :cond_56
    move-object/from16 v37, v0

    :goto_39
    check-cast v1, Ljava/math/BigInteger;

    const-string v0, "rtxSsrc"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_58

    :cond_57
    move-object/from16 v38, v1

    :goto_3a
    move-object v0, v6

    goto :goto_3b

    :cond_58
    instance-of v3, v0, Ljava/lang/Long;

    if-nez v3, :cond_59

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_57

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v38, v1

    const-string v1, "[toRtcStats] \'rtxSsrc\' => expected Long but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3a

    :cond_59
    move-object/from16 v38, v1

    :goto_3b
    check-cast v0, Ljava/lang/Long;

    const-string v1, "fecSsrc"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_5b

    :cond_5a
    move-object/from16 v39, v0

    :goto_3c
    move-object v1, v6

    goto :goto_3d

    :cond_5b
    instance-of v3, v1, Ljava/lang/Long;

    if-nez v3, :cond_5c

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5a

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v39, v0

    const-string v0, "[toRtcStats] \'fecSsrc\' => expected Long but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3c

    :cond_5c
    move-object/from16 v39, v0

    :goto_3d
    check-cast v1, Ljava/lang/Long;

    const-string v0, "audioLevel"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_5e

    :cond_5d
    move-object/from16 v40, v1

    :goto_3e
    move-object v0, v6

    goto :goto_3f

    :cond_5e
    instance-of v3, v0, Ljava/lang/Double;

    if-nez v3, :cond_5f

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5d

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v40, v1

    const-string v1, "[toRtcStats] \'audioLevel\' => expected Double but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3e

    :cond_5f
    move-object/from16 v40, v1

    :goto_3f
    check-cast v0, Ljava/lang/Double;

    const-string v1, "totalAudioEnergy"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_61

    :cond_60
    move-object/from16 v41, v0

    :goto_40
    move-object v1, v6

    goto :goto_41

    :cond_61
    instance-of v3, v1, Ljava/lang/Double;

    if-nez v3, :cond_62

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_60

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v41, v0

    const-string v0, "[toRtcStats] \'totalAudioEnergy\' => expected Double but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_40

    :cond_62
    move-object/from16 v41, v0

    :goto_41
    check-cast v1, Ljava/lang/Double;

    const-string v0, "totalSamplesReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_64

    :cond_63
    move-object/from16 v42, v1

    :goto_42
    move-object v0, v6

    goto :goto_43

    :cond_64
    instance-of v3, v0, Ljava/math/BigInteger;

    if-nez v3, :cond_65

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_63

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v42, v1

    const-string v1, "[toRtcStats] \'totalSamplesReceived\' => expected BigInteger but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_42

    :cond_65
    move-object/from16 v42, v1

    :goto_43
    check-cast v0, Ljava/math/BigInteger;

    const-string v1, "totalSamplesDuration"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_67

    :cond_66
    move-object/from16 v43, v0

    :goto_44
    move-object v1, v6

    goto :goto_45

    :cond_67
    instance-of v3, v1, Ljava/lang/Double;

    if-nez v3, :cond_68

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_66

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v43, v0

    const-string v0, "[toRtcStats] \'totalSamplesDuration\' => expected Double but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_44

    :cond_68
    move-object/from16 v43, v0

    :goto_45
    check-cast v1, Ljava/lang/Double;

    const-string v0, "concealedSamples"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_6a

    :cond_69
    move-object/from16 v44, v1

    :goto_46
    move-object v0, v6

    goto :goto_47

    :cond_6a
    instance-of v3, v0, Ljava/math/BigInteger;

    if-nez v3, :cond_6b

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_69

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v44, v1

    const-string v1, "[toRtcStats] \'concealedSamples\' => expected BigInteger but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_46

    :cond_6b
    move-object/from16 v44, v1

    :goto_47
    check-cast v0, Ljava/math/BigInteger;

    const-string v1, "silentConcealedSamples"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_6d

    :cond_6c
    move-object/from16 v45, v0

    :goto_48
    move-object v1, v6

    goto :goto_49

    :cond_6d
    instance-of v3, v1, Ljava/math/BigInteger;

    if-nez v3, :cond_6e

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6c

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v45, v0

    const-string v0, "[toRtcStats] \'silentConcealedSamples\' => expected BigInteger but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_48

    :cond_6e
    move-object/from16 v45, v0

    :goto_49
    check-cast v1, Ljava/math/BigInteger;

    const-string v0, "concealmentEvents"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_70

    :cond_6f
    move-object/from16 v46, v1

    :goto_4a
    move-object v0, v6

    goto :goto_4b

    :cond_70
    instance-of v3, v0, Ljava/math/BigInteger;

    if-nez v3, :cond_71

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6f

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v46, v1

    const-string v1, "[toRtcStats] \'concealmentEvents\' => expected BigInteger but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4a

    :cond_71
    move-object/from16 v46, v1

    :goto_4b
    check-cast v0, Ljava/math/BigInteger;

    const-string v1, "insertedSamplesForDeceleration"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_73

    :cond_72
    move-object/from16 v47, v0

    :goto_4c
    move-object v1, v6

    goto :goto_4d

    :cond_73
    instance-of v3, v1, Ljava/math/BigInteger;

    if-nez v3, :cond_74

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_72

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v47, v0

    const-string v0, "[toRtcStats] \'insertedSamplesForDeceleration\' => expected BigInteger but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4c

    :cond_74
    move-object/from16 v47, v0

    :goto_4d
    check-cast v1, Ljava/math/BigInteger;

    const-string v0, "removedSamplesForAcceleration"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_76

    :cond_75
    move-object/from16 v48, v1

    goto :goto_4e

    :cond_76
    instance-of v3, v0, Ljava/math/BigInteger;

    if-nez v3, :cond_77

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_75

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v48, v1

    const-string v1, "[toRtcStats] \'removedSamplesForAcceleration\' => expected BigInteger but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4e

    :cond_77
    move-object/from16 v48, v1

    move-object v6, v0

    :goto_4e
    check-cast v6, Ljava/math/BigInteger;

    new-instance v0, Ln33/e;

    invoke-static/range {v21 .. v22}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    move-object v5, v7

    move-object v7, v9

    move-object v9, v11

    move-object v11, v13

    move-object/from16 v4, v16

    move-object/from16 v1, v17

    move-object/from16 v13, v19

    move-object/from16 v17, v23

    move-object/from16 v16, v26

    move-object/from16 v26, v28

    move-object/from16 v21, v30

    move-object/from16 v22, v31

    move-object/from16 v23, v32

    move-object/from16 v28, v34

    move-object/from16 v30, v36

    move-object/from16 v31, v37

    move-object/from16 v32, v38

    move-object/from16 v34, v40

    move-object/from16 v36, v42

    move-object/from16 v37, v43

    move-object/from16 v38, v44

    move-object/from16 v40, v46

    move-object/from16 v42, v48

    move-object/from16 v19, v2

    move-object/from16 v43, v6

    move-object v6, v8

    move-object v8, v10

    move-object v10, v12

    move-object/from16 v12, v18

    move-object/from16 v2, v20

    move-object/from16 v18, v24

    move-object/from16 v20, v25

    move-object/from16 v25, v27

    move-object/from16 v27, v29

    move-object/from16 v24, v33

    move-object/from16 v29, v35

    move-object/from16 v33, v39

    move-object/from16 v35, v41

    move-object/from16 v39, v45

    move-object/from16 v41, v47

    invoke-direct/range {v0 .. v43}, Ln33/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object v0
.end method

.method public static final W(Lorg/webrtc/RTCStats;)Ln33/f;
    .locals 60

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ln33/f;

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    const-string v0, "ssrc"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v5, "RtcParser"

    const/4 v6, 0x0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    move-object v0, v6

    goto :goto_1

    :cond_1
    instance-of v7, v0, Ljava/lang/Long;

    if-nez v7, :cond_2

    sget-object v7, Lb23/i;->a:Lb23/i;

    sget-object v7, Lb23/i;->d:Lb23/e;

    sget-object v8, Lb23/g;->E:Lb23/g;

    invoke-interface {v7, v8, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    sget-object v7, Lb23/i;->c:Lb23/j;

    const-string v9, "[toRtcStats] \'ssrc\' => expected Long but found "

    invoke-static {v0, v9}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v8, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    :goto_1
    check-cast v0, Ljava/lang/Long;

    const-string v7, "kind"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_4

    :cond_3
    :goto_2
    move-object v7, v6

    goto :goto_3

    :cond_4
    instance-of v8, v7, Ljava/lang/String;

    if-nez v8, :cond_5

    sget-object v8, Lb23/i;->a:Lb23/i;

    sget-object v8, Lb23/i;->d:Lb23/e;

    sget-object v9, Lb23/g;->E:Lb23/g;

    invoke-interface {v8, v9, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    sget-object v8, Lb23/i;->c:Lb23/j;

    const-string v10, "[toRtcStats] \'kind\' => expected String but found "

    invoke-static {v7, v10}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v9, v5, v7, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_5
    :goto_3
    check-cast v7, Ljava/lang/String;

    const-string v8, "transportId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_7

    :cond_6
    :goto_4
    move-object v8, v6

    goto :goto_5

    :cond_7
    instance-of v9, v8, Ljava/lang/String;

    if-nez v9, :cond_8

    sget-object v9, Lb23/i;->a:Lb23/i;

    sget-object v9, Lb23/i;->d:Lb23/e;

    sget-object v10, Lb23/g;->E:Lb23/g;

    invoke-interface {v9, v10, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    sget-object v9, Lb23/i;->c:Lb23/j;

    const-string v11, "[toRtcStats] \'transportId\' => expected String but found "

    invoke-static {v8, v11}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v9, v10, v5, v8, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_8
    :goto_5
    check-cast v8, Ljava/lang/String;

    const-string v9, "codecId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_a

    :cond_9
    :goto_6
    move-object v9, v6

    goto :goto_7

    :cond_a
    instance-of v10, v9, Ljava/lang/String;

    if-nez v10, :cond_b

    sget-object v10, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v10

    sget-object v11, Lb23/g;->E:Lb23/g;

    invoke-interface {v10, v11, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v10

    const-string v12, "[toRtcStats] \'codecId\' => expected String but found "

    invoke-static {v9, v12, v10, v11, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_6

    :cond_b
    :goto_7
    check-cast v9, Ljava/lang/String;

    const-string v10, "packetsReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_d

    :cond_c
    :goto_8
    move-object v10, v6

    goto :goto_9

    :cond_d
    instance-of v11, v10, Ljava/lang/Long;

    if-nez v11, :cond_e

    sget-object v11, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v11

    sget-object v12, Lb23/g;->E:Lb23/g;

    invoke-interface {v11, v12, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v11

    const-string v13, "[toRtcStats] \'packetsReceived\' => expected Long but found "

    invoke-static {v10, v13, v11, v12, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_8

    :cond_e
    :goto_9
    check-cast v10, Ljava/lang/Long;

    const-string v11, "packetsLost"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_10

    :cond_f
    :goto_a
    move-object v11, v6

    goto :goto_b

    :cond_10
    instance-of v12, v11, Ljava/lang/Integer;

    if-nez v12, :cond_11

    sget-object v12, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v12

    sget-object v13, Lb23/g;->E:Lb23/g;

    invoke-interface {v12, v13, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_f

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v12

    const-string v14, "[toRtcStats] \'packetsLost\' => expected Integer but found "

    invoke-static {v11, v14, v12, v13, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_a

    :cond_11
    :goto_b
    check-cast v11, Ljava/lang/Integer;

    const-string v12, "jitter"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_13

    :cond_12
    :goto_c
    move-object v12, v6

    goto :goto_d

    :cond_13
    instance-of v13, v12, Ljava/lang/Double;

    if-nez v13, :cond_14

    sget-object v13, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v13

    sget-object v14, Lb23/g;->E:Lb23/g;

    invoke-interface {v13, v14, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_12

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v13

    const-string v15, "[toRtcStats] \'jitter\' => expected Double but found "

    invoke-static {v12, v15, v13, v14, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_c

    :cond_14
    :goto_d
    check-cast v12, Ljava/lang/Double;

    const-string v13, "trackIdentifier"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_15

    move-object v13, v6

    goto :goto_e

    :cond_15
    instance-of v14, v13, Ljava/lang/String;

    if-nez v14, :cond_17

    sget-object v14, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v14

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_16

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v14

    const-string v6, "[toRtcStats] \'trackIdentifier\' => expected String but found "

    invoke-static {v13, v6, v14, v15, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    :cond_16
    const/4 v13, 0x0

    :cond_17
    :goto_e
    check-cast v13, Ljava/lang/String;

    const-string v6, "mid"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_19

    :cond_18
    move-object/from16 v17, v0

    :goto_f
    const/4 v6, 0x0

    goto :goto_10

    :cond_19
    instance-of v14, v6, Ljava/lang/String;

    if-nez v14, :cond_1a

    sget-object v14, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v14

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_18

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v14

    move-object/from16 v17, v0

    const-string v0, "[toRtcStats] \'mid\' => expected String but found "

    invoke-static {v6, v0, v14, v15, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_f

    :cond_1a
    move-object/from16 v17, v0

    :goto_10
    check-cast v6, Ljava/lang/String;

    const-string v0, "remoteId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1c

    :cond_1b
    move-object/from16 v18, v1

    :goto_11
    const/4 v0, 0x0

    goto :goto_12

    :cond_1c
    instance-of v14, v0, Ljava/lang/String;

    if-nez v14, :cond_1d

    sget-object v14, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v14

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1b

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v14

    move-object/from16 v18, v1

    const-string v1, "[toRtcStats] \'remoteId\' => expected String but found "

    invoke-static {v0, v1, v14, v15, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_11

    :cond_1d
    move-object/from16 v18, v1

    :goto_12
    move-object v14, v0

    check-cast v14, Ljava/lang/String;

    const-string v0, "lastPacketReceivedTimestamp"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1f

    :cond_1e
    move-object/from16 v19, v2

    :goto_13
    const/4 v0, 0x0

    goto :goto_14

    :cond_1f
    instance-of v1, v0, Ljava/lang/Double;

    if-nez v1, :cond_20

    sget-object v1, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v1

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1e

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v1

    move-object/from16 v19, v2

    const-string v2, "[toRtcStats] \'lastPacketReceivedTimestamp\' => expected Double but found "

    invoke-static {v0, v2, v1, v15, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_13

    :cond_20
    move-object/from16 v19, v2

    :goto_14
    move-object v15, v0

    check-cast v15, Ljava/lang/Double;

    const-string v0, "headerBytesReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_22

    :cond_21
    move-object/from16 v20, v3

    :goto_15
    const/4 v0, 0x0

    goto :goto_16

    :cond_22
    instance-of v1, v0, Ljava/math/BigInteger;

    if-nez v1, :cond_23

    sget-object v1, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v1

    move-object/from16 v20, v3

    const-string v3, "[toRtcStats] \'headerBytesReceived\' => expected BigInteger but found "

    invoke-static {v0, v3, v1, v2, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_15

    :cond_23
    move-object/from16 v20, v3

    :goto_16
    check-cast v0, Ljava/math/BigInteger;

    const-string v1, "packetsDiscarded"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_25

    :cond_24
    move-object/from16 v21, v0

    :goto_17
    const/4 v1, 0x0

    goto :goto_18

    :cond_25
    instance-of v2, v1, Ljava/math/BigInteger;

    if-nez v2, :cond_26

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v21, v0

    const-string v0, "[toRtcStats] \'packetsDiscarded\' => expected BigInteger but found "

    invoke-static {v1, v0, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_17

    :cond_26
    move-object/from16 v21, v0

    :goto_18
    check-cast v1, Ljava/math/BigInteger;

    const-string v0, "fecBytesReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_28

    :cond_27
    move-object/from16 v22, v1

    :goto_19
    const/4 v0, 0x0

    goto :goto_1a

    :cond_28
    instance-of v2, v0, Ljava/math/BigInteger;

    if-nez v2, :cond_29

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_27

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v22, v1

    const-string v1, "[toRtcStats] \'fecBytesReceived\' => expected BigInteger but found "

    invoke-static {v0, v1, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_19

    :cond_29
    move-object/from16 v22, v1

    :goto_1a
    check-cast v0, Ljava/math/BigInteger;

    const-string v1, "fecPacketsReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2b

    :cond_2a
    move-object/from16 v23, v0

    :goto_1b
    const/4 v1, 0x0

    goto :goto_1c

    :cond_2b
    instance-of v2, v1, Ljava/math/BigInteger;

    if-nez v2, :cond_2c

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2a

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v23, v0

    const-string v0, "[toRtcStats] \'fecPacketsReceived\' => expected BigInteger but found "

    invoke-static {v1, v0, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_1b

    :cond_2c
    move-object/from16 v23, v0

    :goto_1c
    check-cast v1, Ljava/math/BigInteger;

    const-string v0, "fecPacketsDiscarded"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2e

    :cond_2d
    move-object/from16 v24, v1

    :goto_1d
    const/4 v0, 0x0

    goto :goto_1e

    :cond_2e
    instance-of v2, v0, Ljava/math/BigInteger;

    if-nez v2, :cond_2f

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2d

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v24, v1

    const-string v1, "[toRtcStats] \'fecPacketsDiscarded\' => expected BigInteger but found "

    invoke-static {v0, v1, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_1d

    :cond_2f
    move-object/from16 v24, v1

    :goto_1e
    check-cast v0, Ljava/math/BigInteger;

    const-string v1, "bytesReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_31

    :cond_30
    move-object/from16 v25, v0

    :goto_1f
    const/4 v1, 0x0

    goto :goto_20

    :cond_31
    instance-of v2, v1, Ljava/math/BigInteger;

    if-nez v2, :cond_32

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_30

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v25, v0

    const-string v0, "[toRtcStats] \'bytesReceived\' => expected BigInteger but found "

    invoke-static {v1, v0, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_1f

    :cond_32
    move-object/from16 v25, v0

    :goto_20
    check-cast v1, Ljava/math/BigInteger;

    const-string v0, "nackCount"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_34

    :cond_33
    move-object/from16 v26, v1

    :goto_21
    const/4 v0, 0x0

    goto :goto_22

    :cond_34
    instance-of v2, v0, Ljava/lang/Long;

    if-nez v2, :cond_35

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_33

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v26, v1

    const-string v1, "[toRtcStats] \'nackCount\' => expected Long but found "

    invoke-static {v0, v1, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_21

    :cond_35
    move-object/from16 v26, v1

    :goto_22
    check-cast v0, Ljava/lang/Long;

    const-string v1, "totalProcessingDelay"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_37

    :cond_36
    move-object/from16 v27, v0

    :goto_23
    const/4 v1, 0x0

    goto :goto_24

    :cond_37
    instance-of v2, v1, Ljava/lang/Double;

    if-nez v2, :cond_38

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_36

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v27, v0

    const-string v0, "[toRtcStats] \'totalProcessingDelay\' => expected Double but found "

    invoke-static {v1, v0, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_23

    :cond_38
    move-object/from16 v27, v0

    :goto_24
    check-cast v1, Ljava/lang/Double;

    const-string v0, "estimatedPlayoutTimestamp"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3a

    :cond_39
    move-object/from16 v28, v1

    :goto_25
    const/4 v0, 0x0

    goto :goto_26

    :cond_3a
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_3b

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_39

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v28, v1

    const-string v1, "[toRtcStats] \'estimatedPlayoutTimestamp\' => expected Double but found "

    invoke-static {v0, v1, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_25

    :cond_3b
    move-object/from16 v28, v1

    :goto_26
    check-cast v0, Ljava/lang/Double;

    const-string v1, "jitterBufferDelay"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3d

    :cond_3c
    move-object/from16 v29, v0

    :goto_27
    const/4 v1, 0x0

    goto :goto_28

    :cond_3d
    instance-of v2, v1, Ljava/lang/Double;

    if-nez v2, :cond_3e

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3c

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v29, v0

    const-string v0, "[toRtcStats] \'jitterBufferDelay\' => expected Double but found "

    invoke-static {v1, v0, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_27

    :cond_3e
    move-object/from16 v29, v0

    :goto_28
    check-cast v1, Ljava/lang/Double;

    const-string v0, "jitterBufferTargetDelay"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_40

    :cond_3f
    move-object/from16 v30, v1

    :goto_29
    const/4 v0, 0x0

    goto :goto_2a

    :cond_40
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_41

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3f

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v30, v1

    const-string v1, "[toRtcStats] \'jitterBufferTargetDelay\' => expected Double but found "

    invoke-static {v0, v1, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_29

    :cond_41
    move-object/from16 v30, v1

    :goto_2a
    check-cast v0, Ljava/lang/Double;

    const-string v1, "jitterBufferEmittedCount"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_43

    :cond_42
    move-object/from16 v31, v0

    :goto_2b
    const/4 v1, 0x0

    goto :goto_2c

    :cond_43
    instance-of v2, v1, Ljava/math/BigInteger;

    if-nez v2, :cond_44

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_42

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v31, v0

    const-string v0, "[toRtcStats] \'jitterBufferEmittedCount\' => expected BigInteger but found "

    invoke-static {v1, v0, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_2b

    :cond_44
    move-object/from16 v31, v0

    :goto_2c
    check-cast v1, Ljava/math/BigInteger;

    const-string v0, "jitterBufferMinimumDelay"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_46

    :cond_45
    move-object/from16 v32, v1

    :goto_2d
    const/4 v0, 0x0

    goto :goto_2e

    :cond_46
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_47

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_45

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v32, v1

    const-string v1, "[toRtcStats] \'jitterBufferMinimumDelay\' => expected Double but found "

    invoke-static {v0, v1, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_2d

    :cond_47
    move-object/from16 v32, v1

    :goto_2e
    check-cast v0, Ljava/lang/Double;

    const-string v1, "decoderImplementation"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_49

    :cond_48
    move-object/from16 v33, v0

    :goto_2f
    const/4 v1, 0x0

    goto :goto_30

    :cond_49
    instance-of v2, v1, Ljava/lang/String;

    if-nez v2, :cond_4a

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_48

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v33, v0

    const-string v0, "[toRtcStats] \'decoderImplementation\' => expected String but found "

    invoke-static {v1, v0, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_2f

    :cond_4a
    move-object/from16 v33, v0

    :goto_30
    check-cast v1, Ljava/lang/String;

    const-string v0, "playoutId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4c

    :cond_4b
    move-object/from16 v34, v1

    :goto_31
    const/4 v0, 0x0

    goto :goto_32

    :cond_4c
    instance-of v2, v0, Ljava/lang/String;

    if-nez v2, :cond_4d

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4b

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v34, v1

    const-string v1, "[toRtcStats] \'playoutId\' => expected String but found "

    invoke-static {v0, v1, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_31

    :cond_4d
    move-object/from16 v34, v1

    :goto_32
    check-cast v0, Ljava/lang/String;

    const-string v1, "powerEfficientDecoder"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_4f

    :cond_4e
    move-object/from16 v35, v0

    :goto_33
    const/4 v1, 0x0

    goto :goto_34

    :cond_4f
    instance-of v2, v1, Ljava/lang/Boolean;

    if-nez v2, :cond_50

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4e

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v35, v0

    const-string v0, "[toRtcStats] \'powerEfficientDecoder\' => expected Boolean but found "

    invoke-static {v1, v0, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_33

    :cond_50
    move-object/from16 v35, v0

    :goto_34
    check-cast v1, Ljava/lang/Boolean;

    const-string v0, "retransmittedPacketsReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_52

    :cond_51
    move-object/from16 v36, v1

    :goto_35
    const/4 v0, 0x0

    goto :goto_36

    :cond_52
    instance-of v2, v0, Ljava/math/BigInteger;

    if-nez v2, :cond_53

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_51

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v36, v1

    const-string v1, "[toRtcStats] \'retransmittedPacketsReceived\' => expected BigInteger but found "

    invoke-static {v0, v1, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_35

    :cond_53
    move-object/from16 v36, v1

    :goto_36
    check-cast v0, Ljava/math/BigInteger;

    const-string v1, "retransmittedBytesReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_55

    :cond_54
    move-object/from16 v37, v0

    :goto_37
    const/4 v1, 0x0

    goto :goto_38

    :cond_55
    instance-of v2, v1, Ljava/math/BigInteger;

    if-nez v2, :cond_56

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_54

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v37, v0

    const-string v0, "[toRtcStats] \'retransmittedBytesReceived\' => expected BigInteger but found "

    invoke-static {v1, v0, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_37

    :cond_56
    move-object/from16 v37, v0

    :goto_38
    check-cast v1, Ljava/math/BigInteger;

    const-string v0, "rtxSsrc"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_58

    :cond_57
    move-object/from16 v38, v1

    :goto_39
    const/4 v0, 0x0

    goto :goto_3a

    :cond_58
    instance-of v2, v0, Ljava/lang/Long;

    if-nez v2, :cond_59

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_57

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v38, v1

    const-string v1, "[toRtcStats] \'rtxSsrc\' => expected Long but found "

    invoke-static {v0, v1, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_39

    :cond_59
    move-object/from16 v38, v1

    :goto_3a
    check-cast v0, Ljava/lang/Long;

    const-string v1, "fecSsrc"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_5b

    :cond_5a
    move-object/from16 v39, v0

    :goto_3b
    const/4 v1, 0x0

    goto :goto_3c

    :cond_5b
    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_5c

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5a

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v39, v0

    const-string v0, "[toRtcStats] \'fecSsrc\' => expected Long but found "

    invoke-static {v1, v0, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_3b

    :cond_5c
    move-object/from16 v39, v0

    :goto_3c
    check-cast v1, Ljava/lang/Long;

    const-string v0, "framesDecoded"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_5e

    :cond_5d
    move-object/from16 v40, v1

    :goto_3d
    const/4 v0, 0x0

    goto :goto_3e

    :cond_5e
    instance-of v2, v0, Ljava/lang/Long;

    if-nez v2, :cond_5f

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5d

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v40, v1

    const-string v1, "[toRtcStats] \'framesDecoded\' => expected Long but found "

    invoke-static {v0, v1, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_3d

    :cond_5f
    move-object/from16 v40, v1

    :goto_3e
    check-cast v0, Ljava/lang/Long;

    const-string v1, "keyFramesDecoded"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_61

    :cond_60
    move-object/from16 v41, v0

    :goto_3f
    const/4 v1, 0x0

    goto :goto_40

    :cond_61
    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_62

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_60

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v41, v0

    const-string v0, "[toRtcStats] \'keyFramesDecoded\' => expected Long but found "

    invoke-static {v1, v0, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_3f

    :cond_62
    move-object/from16 v41, v0

    :goto_40
    check-cast v1, Ljava/lang/Long;

    const-string v0, "framesRendered"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_64

    :cond_63
    move-object/from16 v42, v1

    :goto_41
    const/4 v0, 0x0

    goto :goto_42

    :cond_64
    instance-of v2, v0, Ljava/lang/Long;

    if-nez v2, :cond_65

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_63

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v42, v1

    const-string v1, "[toRtcStats] \'framesRendered\' => expected Long but found "

    invoke-static {v0, v1, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_41

    :cond_65
    move-object/from16 v42, v1

    :goto_42
    check-cast v0, Ljava/lang/Long;

    const-string v1, "framesDropped"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_67

    :cond_66
    move-object/from16 v43, v0

    :goto_43
    const/4 v1, 0x0

    goto :goto_44

    :cond_67
    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_68

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_66

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v43, v0

    const-string v0, "[toRtcStats] \'framesDropped\' => expected Long but found "

    invoke-static {v1, v0, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_43

    :cond_68
    move-object/from16 v43, v0

    :goto_44
    check-cast v1, Ljava/lang/Long;

    const-string v0, "frameWidth"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_6a

    :cond_69
    move-object/from16 v44, v1

    :goto_45
    const/4 v0, 0x0

    goto :goto_46

    :cond_6a
    instance-of v2, v0, Ljava/lang/Long;

    if-nez v2, :cond_6b

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_69

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v44, v1

    const-string v1, "[toRtcStats] \'frameWidth\' => expected Long but found "

    invoke-static {v0, v1, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_45

    :cond_6b
    move-object/from16 v44, v1

    :goto_46
    check-cast v0, Ljava/lang/Long;

    const-string v1, "frameHeight"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_6d

    :cond_6c
    move-object/from16 v45, v0

    :goto_47
    const/4 v1, 0x0

    goto :goto_48

    :cond_6d
    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_6e

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6c

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v45, v0

    const-string v0, "[toRtcStats] \'frameHeight\' => expected Long but found "

    invoke-static {v1, v0, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_47

    :cond_6e
    move-object/from16 v45, v0

    :goto_48
    check-cast v1, Ljava/lang/Long;

    const-string v0, "framesPerSecond"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_70

    :cond_6f
    move-object/from16 v46, v1

    :goto_49
    const/4 v0, 0x0

    goto :goto_4a

    :cond_70
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_71

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6f

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v46, v1

    const-string v1, "[toRtcStats] \'framesPerSecond\' => expected Double but found "

    invoke-static {v0, v1, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_49

    :cond_71
    move-object/from16 v46, v1

    :goto_4a
    check-cast v0, Ljava/lang/Double;

    const-string v1, "qpSum"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_73

    :cond_72
    move-object/from16 v47, v0

    :goto_4b
    const/4 v1, 0x0

    goto :goto_4c

    :cond_73
    instance-of v2, v1, Ljava/math/BigInteger;

    if-nez v2, :cond_74

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_72

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v47, v0

    const-string v0, "[toRtcStats] \'qpSum\' => expected BigInteger but found "

    invoke-static {v1, v0, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_4b

    :cond_74
    move-object/from16 v47, v0

    :goto_4c
    check-cast v1, Ljava/math/BigInteger;

    const-string v0, "totalDecodeTime"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_76

    :cond_75
    move-object/from16 v48, v1

    :goto_4d
    const/4 v0, 0x0

    goto :goto_4e

    :cond_76
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_77

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_75

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v48, v1

    const-string v1, "[toRtcStats] \'totalDecodeTime\' => expected Double but found "

    invoke-static {v0, v1, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_4d

    :cond_77
    move-object/from16 v48, v1

    :goto_4e
    check-cast v0, Ljava/lang/Double;

    const-string v1, "totalInterFrameDelay"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_79

    :cond_78
    move-object/from16 v49, v0

    :goto_4f
    const/4 v1, 0x0

    goto :goto_50

    :cond_79
    instance-of v2, v1, Ljava/lang/Double;

    if-nez v2, :cond_7a

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_78

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v49, v0

    const-string v0, "[toRtcStats] \'totalInterFrameDelay\' => expected Double but found "

    invoke-static {v1, v0, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_4f

    :cond_7a
    move-object/from16 v49, v0

    :goto_50
    check-cast v1, Ljava/lang/Double;

    const-string v0, "totalSquaredInterFrameDelay"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_7c

    :cond_7b
    move-object/from16 v50, v1

    :goto_51
    const/4 v0, 0x0

    goto :goto_52

    :cond_7c
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_7d

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7b

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v50, v1

    const-string v1, "[toRtcStats] \'totalSquaredInterFrameDelay\' => expected Double but found "

    invoke-static {v0, v1, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_51

    :cond_7d
    move-object/from16 v50, v1

    :goto_52
    check-cast v0, Ljava/lang/Double;

    const-string v1, "pauseCount"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_7f

    :cond_7e
    move-object/from16 v51, v0

    :goto_53
    const/4 v1, 0x0

    goto :goto_54

    :cond_7f
    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_80

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7e

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v51, v0

    const-string v0, "[toRtcStats] \'pauseCount\' => expected Long but found "

    invoke-static {v1, v0, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_53

    :cond_80
    move-object/from16 v51, v0

    :goto_54
    check-cast v1, Ljava/lang/Long;

    const-string v0, "totalPausesDuration"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_82

    :cond_81
    move-object/from16 v52, v1

    :goto_55
    const/4 v0, 0x0

    goto :goto_56

    :cond_82
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_83

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_81

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v52, v1

    const-string v1, "[toRtcStats] \'totalPausesDuration\' => expected Double but found "

    invoke-static {v0, v1, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_55

    :cond_83
    move-object/from16 v52, v1

    :goto_56
    check-cast v0, Ljava/lang/Double;

    const-string v1, "freezeCount"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_85

    :cond_84
    move-object/from16 v53, v0

    :goto_57
    const/4 v1, 0x0

    goto :goto_58

    :cond_85
    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_86

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_84

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v53, v0

    const-string v0, "[toRtcStats] \'freezeCount\' => expected Long but found "

    invoke-static {v1, v0, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_57

    :cond_86
    move-object/from16 v53, v0

    :goto_58
    check-cast v1, Ljava/lang/Long;

    const-string v0, "totalFreezesDuration"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_88

    :cond_87
    move-object/from16 v54, v1

    :goto_59
    const/4 v0, 0x0

    goto :goto_5a

    :cond_88
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_89

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_87

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v54, v1

    const-string v1, "[toRtcStats] \'totalFreezesDuration\' => expected Double but found "

    invoke-static {v0, v1, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_59

    :cond_89
    move-object/from16 v54, v1

    :goto_5a
    check-cast v0, Ljava/lang/Double;

    const-string v1, "firCount"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_8b

    :cond_8a
    move-object/from16 v55, v0

    :goto_5b
    const/4 v1, 0x0

    goto :goto_5c

    :cond_8b
    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_8c

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8a

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v55, v0

    const-string v0, "[toRtcStats] \'firCount\' => expected Long but found "

    invoke-static {v1, v0, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_5b

    :cond_8c
    move-object/from16 v55, v0

    :goto_5c
    check-cast v1, Ljava/lang/Long;

    const-string v0, "pliCount"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_8e

    :cond_8d
    move-object/from16 v56, v1

    :goto_5d
    const/4 v0, 0x0

    goto :goto_5e

    :cond_8e
    instance-of v2, v0, Ljava/lang/Long;

    if-nez v2, :cond_8f

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8d

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v56, v1

    const-string v1, "[toRtcStats] \'pliCount\' => expected Long but found "

    invoke-static {v0, v1, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_5d

    :cond_8f
    move-object/from16 v56, v1

    :goto_5e
    check-cast v0, Ljava/lang/Long;

    const-string v1, "framesReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_91

    :cond_90
    move-object/from16 v57, v0

    :goto_5f
    const/4 v1, 0x0

    goto :goto_60

    :cond_91
    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_92

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_90

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v57, v0

    const-string v0, "[toRtcStats] \'framesReceived\' => expected Long but found "

    invoke-static {v1, v0, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_5f

    :cond_92
    move-object/from16 v57, v0

    :goto_60
    check-cast v1, Ljava/lang/Long;

    const-string v0, "framesAssembledFromMultiplePackets"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_94

    :cond_93
    move-object/from16 v58, v1

    :goto_61
    const/4 v0, 0x0

    goto :goto_62

    :cond_94
    instance-of v2, v0, Ljava/lang/Long;

    if-nez v2, :cond_95

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_93

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v58, v1

    const-string v1, "[toRtcStats] \'framesAssembledFromMultiplePackets\' => expected Long but found "

    invoke-static {v0, v1, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_61

    :cond_95
    move-object/from16 v58, v1

    :goto_62
    check-cast v0, Ljava/lang/Long;

    const-string v1, "totalAssemblyTime"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_97

    :cond_96
    move-object/from16 v59, v0

    :goto_63
    const/16 v16, 0x0

    goto :goto_64

    :cond_97
    instance-of v2, v1, Ljava/lang/Double;

    if-nez v2, :cond_98

    sget-object v2, Lb23/i;->a:Lb23/i;

    invoke-static {}, Lb23/i;->b()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_96

    invoke-static {}, Lb23/i;->a()Lb23/j;

    move-result-object v2

    move-object/from16 v59, v0

    const-string v0, "[toRtcStats] \'totalAssemblyTime\' => expected Double but found "

    invoke-static {v1, v0, v2, v3, v5}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_63

    :cond_98
    move-object/from16 v59, v0

    move-object/from16 v16, v1

    :goto_64
    check-cast v16, Ljava/lang/Double;

    move-object v1, v13

    move-object v13, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v1

    move-object/from16 v5, v17

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    move-object/from16 v3, v20

    move-object/from16 v17, v22

    move-object/from16 v18, v23

    move-object/from16 v19, v24

    move-object/from16 v20, v25

    move-object/from16 v22, v27

    move-object/from16 v23, v28

    move-object/from16 v24, v29

    move-object/from16 v25, v30

    move-object/from16 v27, v32

    move-object/from16 v28, v33

    move-object/from16 v29, v34

    move-object/from16 v30, v35

    move-object/from16 v32, v37

    move-object/from16 v33, v38

    move-object/from16 v34, v39

    move-object/from16 v35, v40

    move-object/from16 v37, v42

    move-object/from16 v38, v43

    move-object/from16 v39, v44

    move-object/from16 v40, v45

    move-object/from16 v42, v47

    move-object/from16 v43, v48

    move-object/from16 v44, v49

    move-object/from16 v45, v50

    move-object/from16 v47, v52

    move-object/from16 v48, v53

    move-object/from16 v49, v54

    move-object/from16 v50, v55

    move-object/from16 v52, v57

    move-object/from16 v53, v58

    move-object/from16 v54, v59

    move-object/from16 v55, v16

    move-object/from16 v16, v21

    move-object/from16 v21, v26

    move-object/from16 v26, v31

    move-object/from16 v31, v36

    move-object/from16 v36, v41

    move-object/from16 v41, v46

    move-object/from16 v46, v51

    move-object/from16 v51, v56

    invoke-direct/range {v1 .. v55}, Ln33/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;)V

    return-object v1
.end method

.method public static final X(Lorg/webrtc/RTCStats;)Ln33/g;
    .locals 33

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v3

    const-string v0, "trackIdentifier"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v5, "RtcParser"

    const/4 v6, 0x0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    move-object v0, v6

    goto :goto_1

    :cond_1
    instance-of v7, v0, Ljava/lang/String;

    if-nez v7, :cond_2

    sget-object v7, Lb23/i;->a:Lb23/i;

    sget-object v7, Lb23/i;->d:Lb23/e;

    sget-object v8, Lb23/g;->E:Lb23/g;

    invoke-interface {v7, v8, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    sget-object v7, Lb23/i;->c:Lb23/j;

    const-string v9, "[toRtcStats] \'trackIdentifier\' => expected String but found "

    invoke-static {v0, v9}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v8, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    :goto_1
    check-cast v0, Ljava/lang/String;

    const-string v7, "ended"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_4

    :cond_3
    :goto_2
    move-object v7, v6

    goto :goto_3

    :cond_4
    instance-of v8, v7, Ljava/lang/Boolean;

    if-nez v8, :cond_5

    sget-object v8, Lb23/i;->a:Lb23/i;

    sget-object v8, Lb23/i;->d:Lb23/e;

    sget-object v9, Lb23/g;->E:Lb23/g;

    invoke-interface {v8, v9, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    sget-object v8, Lb23/i;->c:Lb23/j;

    const-string v10, "[toRtcStats] \'ended\' => expected Boolean but found "

    invoke-static {v7, v10}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v9, v5, v7, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_5
    :goto_3
    check-cast v7, Ljava/lang/Boolean;

    const-string v8, "kind"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_7

    :cond_6
    :goto_4
    move-object v8, v6

    goto :goto_5

    :cond_7
    instance-of v9, v8, Ljava/lang/String;

    if-nez v9, :cond_8

    sget-object v9, Lb23/i;->a:Lb23/i;

    sget-object v9, Lb23/i;->d:Lb23/e;

    sget-object v10, Lb23/g;->E:Lb23/g;

    invoke-interface {v9, v10, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    sget-object v9, Lb23/i;->c:Lb23/j;

    const-string v11, "[toRtcStats] \'kind\' => expected String but found "

    invoke-static {v8, v11}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v9, v10, v5, v8, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_8
    :goto_5
    check-cast v8, Ljava/lang/String;

    const-string v9, "priority"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_a

    :cond_9
    :goto_6
    move-object v9, v6

    goto :goto_7

    :cond_a
    instance-of v10, v9, Ljava/lang/String;

    if-nez v10, :cond_b

    sget-object v10, Lb23/i;->a:Lb23/i;

    sget-object v10, Lb23/i;->d:Lb23/e;

    sget-object v11, Lb23/g;->E:Lb23/g;

    invoke-interface {v10, v11, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    sget-object v10, Lb23/i;->c:Lb23/j;

    const-string v12, "[toRtcStats] \'priority\' => expected String but found "

    invoke-static {v9, v12}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v10, v11, v5, v9, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_b
    :goto_7
    check-cast v9, Ljava/lang/String;

    const-string v10, "remoteSource"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_d

    :cond_c
    :goto_8
    move-object v10, v6

    goto :goto_9

    :cond_d
    instance-of v11, v10, Ljava/lang/Boolean;

    if-nez v11, :cond_e

    sget-object v11, Lb23/i;->a:Lb23/i;

    sget-object v11, Lb23/i;->d:Lb23/e;

    sget-object v12, Lb23/g;->E:Lb23/g;

    invoke-interface {v11, v12, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_c

    sget-object v11, Lb23/i;->c:Lb23/j;

    const-string v13, "[toRtcStats] \'remoteSource\' => expected Boolean but found "

    invoke-static {v10, v13}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v11, v12, v5, v10, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_8

    :cond_e
    :goto_9
    check-cast v10, Ljava/lang/Boolean;

    const-string v11, "detached"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_10

    :cond_f
    :goto_a
    move-object v11, v6

    goto :goto_b

    :cond_10
    instance-of v12, v11, Ljava/lang/Boolean;

    if-nez v12, :cond_11

    sget-object v12, Lb23/i;->a:Lb23/i;

    sget-object v12, Lb23/i;->d:Lb23/e;

    sget-object v13, Lb23/g;->E:Lb23/g;

    invoke-interface {v12, v13, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_f

    sget-object v12, Lb23/i;->c:Lb23/j;

    const-string v14, "[toRtcStats] \'detached\' => expected Boolean but found "

    invoke-static {v11, v14}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v12, v13, v5, v11, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_a

    :cond_11
    :goto_b
    check-cast v11, Ljava/lang/Boolean;

    const-string v12, "estimatedPlayoutTimestamp"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_13

    :cond_12
    :goto_c
    move-object v12, v6

    goto :goto_d

    :cond_13
    instance-of v13, v12, Ljava/lang/Double;

    if-nez v13, :cond_14

    sget-object v13, Lb23/i;->a:Lb23/i;

    sget-object v13, Lb23/i;->d:Lb23/e;

    sget-object v14, Lb23/g;->E:Lb23/g;

    invoke-interface {v13, v14, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_12

    sget-object v13, Lb23/i;->c:Lb23/j;

    const-string v15, "[toRtcStats] \'estimatedPlayoutTimestamp\' => expected Double but found "

    invoke-static {v12, v15}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v13, v14, v5, v12, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_c

    :cond_14
    :goto_d
    check-cast v12, Ljava/lang/Double;

    const-string v13, "jitterBufferDelay"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_16

    :cond_15
    move-object/from16 v16, v0

    :goto_e
    move-object v13, v6

    goto :goto_f

    :cond_16
    instance-of v14, v13, Ljava/lang/Double;

    if-nez v14, :cond_17

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_15

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v16, v0

    const-string v0, "[toRtcStats] \'jitterBufferDelay\' => expected Double but found "

    invoke-static {v13, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_e

    :cond_17
    move-object/from16 v16, v0

    :goto_f
    check-cast v13, Ljava/lang/Double;

    const-string v0, "jitterBufferEmittedCount"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_19

    :cond_18
    move-object/from16 v17, v1

    :goto_10
    move-object v0, v6

    goto :goto_11

    :cond_19
    instance-of v14, v0, Ljava/lang/Long;

    if-nez v14, :cond_1a

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_18

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v17, v1

    const-string v1, "[toRtcStats] \'jitterBufferEmittedCount\' => expected Long but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_10

    :cond_1a
    move-object/from16 v17, v1

    :goto_11
    check-cast v0, Ljava/lang/Long;

    const-string v1, "totalAudioEnergy"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1c

    :cond_1b
    move-object/from16 v18, v0

    :goto_12
    move-object v1, v6

    goto :goto_13

    :cond_1c
    instance-of v14, v1, Ljava/lang/Double;

    if-nez v14, :cond_1d

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1b

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v18, v0

    const-string v0, "[toRtcStats] \'totalAudioEnergy\' => expected Double but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_12

    :cond_1d
    move-object/from16 v18, v0

    :goto_13
    move-object v14, v1

    check-cast v14, Ljava/lang/Double;

    const-string v0, "totalInterruptionDuration"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1f

    :cond_1e
    move-object/from16 v19, v2

    :goto_14
    move-object v0, v6

    goto :goto_15

    :cond_1f
    instance-of v1, v0, Ljava/lang/Double;

    if-nez v1, :cond_20

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1e

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v19, v2

    const-string v2, "[toRtcStats] \'totalInterruptionDuration\' => expected Double but found "

    invoke-static {v0, v2}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_14

    :cond_20
    move-object/from16 v19, v2

    :goto_15
    check-cast v0, Ljava/lang/Double;

    const-string v1, "removedSamplesForAcceleration"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_22

    :cond_21
    move-object/from16 v20, v0

    :goto_16
    move-object v1, v6

    goto :goto_17

    :cond_22
    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_23

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_21

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v20, v0

    const-string v0, "[toRtcStats] \'removedSamplesForAcceleration\' => expected Long but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_16

    :cond_23
    move-object/from16 v20, v0

    :goto_17
    check-cast v1, Ljava/lang/Long;

    const-string v0, "audioLevel"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_25

    :cond_24
    move-object/from16 v21, v1

    :goto_18
    move-object v0, v6

    goto :goto_19

    :cond_25
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_26

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_24

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v21, v1

    const-string v1, "[toRtcStats] \'audioLevel\' => expected Double but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_18

    :cond_26
    move-object/from16 v21, v1

    :goto_19
    check-cast v0, Ljava/lang/Double;

    const-string v1, "interruptionCount"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_28

    :cond_27
    move-object/from16 v22, v0

    :goto_1a
    move-object v1, v6

    goto :goto_1b

    :cond_28
    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_29

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_27

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v22, v0

    const-string v0, "[toRtcStats] \'interruptionCount\' => expected Long but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1a

    :cond_29
    move-object/from16 v22, v0

    :goto_1b
    check-cast v1, Ljava/lang/Long;

    const-string v0, "relativePacketArrivalDelay"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2b

    :cond_2a
    move-object/from16 v23, v1

    :goto_1c
    move-object v0, v6

    goto :goto_1d

    :cond_2b
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_2c

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2a

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v23, v1

    const-string v1, "[toRtcStats] \'relativePacketArrivalDelay\' => expected Double but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1c

    :cond_2c
    move-object/from16 v23, v1

    :goto_1d
    check-cast v0, Ljava/lang/Double;

    const-string v1, "jitterBufferFlushes"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2e

    :cond_2d
    move-object/from16 v24, v0

    :goto_1e
    move-object v1, v6

    goto :goto_1f

    :cond_2e
    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_2f

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2d

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v24, v0

    const-string v0, "[toRtcStats] \'jitterBufferFlushes\' => expected Long but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1e

    :cond_2f
    move-object/from16 v24, v0

    :goto_1f
    check-cast v1, Ljava/lang/Long;

    const-string v0, "concealedSamples"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_31

    :cond_30
    move-object/from16 v25, v1

    :goto_20
    move-object v0, v6

    goto :goto_21

    :cond_31
    instance-of v2, v0, Ljava/lang/Long;

    if-nez v2, :cond_32

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_30

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v25, v1

    const-string v1, "[toRtcStats] \'concealedSamples\' => expected Long but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_20

    :cond_32
    move-object/from16 v25, v1

    :goto_21
    check-cast v0, Ljava/lang/Long;

    const-string v1, "jitterBufferTargetDelay"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_34

    :cond_33
    move-object/from16 v26, v0

    :goto_22
    move-object v1, v6

    goto :goto_23

    :cond_34
    instance-of v2, v1, Ljava/lang/Double;

    if-nez v2, :cond_35

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_33

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v26, v0

    const-string v0, "[toRtcStats] \'jitterBufferTargetDelay\' => expected Double but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_22

    :cond_35
    move-object/from16 v26, v0

    :goto_23
    check-cast v1, Ljava/lang/Double;

    const-string v0, "totalSamplesDuration"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_37

    :cond_36
    move-object/from16 v27, v1

    :goto_24
    move-object v0, v6

    goto :goto_25

    :cond_37
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_38

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_36

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v27, v1

    const-string v1, "[toRtcStats] \'totalSamplesDuration\' => expected Double but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_24

    :cond_38
    move-object/from16 v27, v1

    :goto_25
    move-object v15, v0

    check-cast v15, Ljava/lang/Double;

    const-string v0, "insertedSamplesForDeceleration"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3a

    :cond_39
    move-wide/from16 v28, v3

    :goto_26
    move-object v0, v6

    goto :goto_27

    :cond_3a
    instance-of v1, v0, Ljava/lang/Long;

    if-nez v1, :cond_3b

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_39

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-wide/from16 v28, v3

    const-string v3, "[toRtcStats] \'insertedSamplesForDeceleration\' => expected Long but found "

    invoke-static {v0, v3}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_26

    :cond_3b
    move-wide/from16 v28, v3

    :goto_27
    check-cast v0, Ljava/lang/Long;

    const-string v1, "delayedPacketOutageSamples"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3d

    :cond_3c
    :goto_28
    move-object v1, v6

    goto :goto_29

    :cond_3d
    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_3e

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3c

    sget-object v2, Lb23/i;->c:Lb23/j;

    const-string v4, "[toRtcStats] \'delayedPacketOutageSamples\' => expected Long but found "

    invoke-static {v1, v4}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v3, v5, v1, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_28

    :cond_3e
    :goto_29
    check-cast v1, Ljava/lang/Long;

    const-string v2, "totalSamplesReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_40

    :cond_3f
    move-object/from16 v30, v0

    :goto_2a
    move-object v2, v6

    goto :goto_2b

    :cond_40
    instance-of v3, v2, Ljava/lang/Long;

    if-nez v3, :cond_41

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3f

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v30, v0

    const-string v0, "[toRtcStats] \'totalSamplesReceived\' => expected Long but found "

    invoke-static {v2, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2a

    :cond_41
    move-object/from16 v30, v0

    :goto_2b
    check-cast v2, Ljava/lang/Long;

    const-string v0, "concealmentEvents"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_43

    :cond_42
    move-object/from16 v31, v1

    :goto_2c
    move-object v0, v6

    goto :goto_2d

    :cond_43
    instance-of v3, v0, Ljava/lang/Long;

    if-nez v3, :cond_44

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_42

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v31, v1

    const-string v1, "[toRtcStats] \'concealmentEvents\' => expected Long but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2c

    :cond_44
    move-object/from16 v31, v1

    :goto_2d
    check-cast v0, Ljava/lang/Long;

    const-string v1, "silentConcealedSamples"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_46

    :cond_45
    move-object/from16 v32, v0

    goto :goto_2e

    :cond_46
    instance-of v3, v1, Ljava/lang/Long;

    if-nez v3, :cond_47

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_45

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v32, v0

    const-string v0, "[toRtcStats] \'silentConcealedSamples\' => expected Long but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2e

    :cond_47
    move-object/from16 v32, v0

    move-object v6, v1

    :goto_2e
    check-cast v6, Ljava/lang/Long;

    new-instance v0, Ln33/g;

    invoke-static/range {v28 .. v29}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    move-object v5, v7

    move-object v7, v9

    move-object v9, v11

    move-object v11, v13

    move-object/from16 v4, v16

    move-object/from16 v1, v17

    move-object/from16 v16, v20

    move-object/from16 v17, v21

    move-object/from16 v13, v22

    move-object/from16 v20, v25

    move-object/from16 v21, v26

    move-object/from16 v22, v27

    move-object/from16 v26, v32

    move-object/from16 v25, v2

    move-object/from16 v27, v6

    move-object v6, v8

    move-object v8, v10

    move-object v10, v12

    move-object/from16 v12, v18

    move-object/from16 v2, v19

    move-object/from16 v18, v23

    move-object/from16 v19, v24

    move-object/from16 v23, v30

    move-object/from16 v24, v31

    invoke-direct/range {v0 .. v27}, Ln33/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V

    return-object v0
.end method

.method public static final Y(Lorg/webrtc/RTCStats;)Ln33/k;
    .locals 27

    new-instance v0, Ln33/k;

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const-string v4, "ssrc"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "RtcParser"

    const/4 v6, 0x0

    if-nez v4, :cond_1

    :cond_0
    :goto_0
    move-object v4, v6

    goto :goto_1

    :cond_1
    instance-of v7, v4, Ljava/lang/Long;

    if-nez v7, :cond_2

    sget-object v7, Lb23/i;->a:Lb23/i;

    sget-object v7, Lb23/i;->d:Lb23/e;

    sget-object v8, Lb23/g;->E:Lb23/g;

    invoke-interface {v7, v8, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    sget-object v7, Lb23/i;->c:Lb23/j;

    const-string v9, "[toRtcStats] \'ssrc\' => expected Long but found "

    invoke-static {v4, v9}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v7, v8, v5, v4, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    :goto_1
    check-cast v4, Ljava/lang/Long;

    const-string v7, "kind"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_4

    :cond_3
    :goto_2
    move-object v7, v6

    goto :goto_3

    :cond_4
    instance-of v8, v7, Ljava/lang/String;

    if-nez v8, :cond_5

    sget-object v8, Lb23/i;->a:Lb23/i;

    sget-object v8, Lb23/i;->d:Lb23/e;

    sget-object v9, Lb23/g;->E:Lb23/g;

    invoke-interface {v8, v9, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    sget-object v8, Lb23/i;->c:Lb23/j;

    const-string v10, "[toRtcStats] \'kind\' => expected String but found "

    invoke-static {v7, v10}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v9, v5, v7, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_5
    :goto_3
    check-cast v7, Ljava/lang/String;

    const-string v8, "transportId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_7

    :cond_6
    :goto_4
    move-object v8, v6

    goto :goto_5

    :cond_7
    instance-of v9, v8, Ljava/lang/String;

    if-nez v9, :cond_8

    sget-object v9, Lb23/i;->a:Lb23/i;

    sget-object v9, Lb23/i;->d:Lb23/e;

    sget-object v10, Lb23/g;->E:Lb23/g;

    invoke-interface {v9, v10, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    sget-object v9, Lb23/i;->c:Lb23/j;

    const-string v11, "[toRtcStats] \'transportId\' => expected String but found "

    invoke-static {v8, v11}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v9, v10, v5, v8, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_8
    :goto_5
    check-cast v8, Ljava/lang/String;

    const-string v9, "codecId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_a

    :cond_9
    :goto_6
    move-object v9, v6

    goto :goto_7

    :cond_a
    instance-of v10, v9, Ljava/lang/String;

    if-nez v10, :cond_b

    sget-object v10, Lb23/i;->a:Lb23/i;

    sget-object v10, Lb23/i;->d:Lb23/e;

    sget-object v11, Lb23/g;->E:Lb23/g;

    invoke-interface {v10, v11, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    sget-object v10, Lb23/i;->c:Lb23/j;

    const-string v12, "[toRtcStats] \'codecId\' => expected String but found "

    invoke-static {v9, v12}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v10, v11, v5, v9, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_b
    :goto_7
    check-cast v9, Ljava/lang/String;

    const-string v10, "packetsSent"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_d

    :cond_c
    :goto_8
    move-object v10, v6

    goto :goto_9

    :cond_d
    instance-of v11, v10, Ljava/math/BigInteger;

    if-nez v11, :cond_e

    sget-object v11, Lb23/i;->a:Lb23/i;

    sget-object v11, Lb23/i;->d:Lb23/e;

    sget-object v12, Lb23/g;->E:Lb23/g;

    invoke-interface {v11, v12, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_c

    sget-object v11, Lb23/i;->c:Lb23/j;

    const-string v13, "[toRtcStats] \'packetsSent\' => expected BigInteger but found "

    invoke-static {v10, v13}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v11, v12, v5, v10, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_8

    :cond_e
    :goto_9
    check-cast v10, Ljava/math/BigInteger;

    const-string v11, "packetsLost"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_10

    :cond_f
    :goto_a
    move-object v11, v6

    goto :goto_b

    :cond_10
    instance-of v12, v11, Ljava/math/BigInteger;

    if-nez v12, :cond_11

    sget-object v12, Lb23/i;->a:Lb23/i;

    sget-object v12, Lb23/i;->d:Lb23/e;

    sget-object v13, Lb23/g;->E:Lb23/g;

    invoke-interface {v12, v13, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_f

    sget-object v12, Lb23/i;->c:Lb23/j;

    const-string v14, "[toRtcStats] \'packetsLost\' => expected BigInteger but found "

    invoke-static {v11, v14}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v12, v13, v5, v11, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_a

    :cond_11
    :goto_b
    check-cast v11, Ljava/math/BigInteger;

    const-string v12, "mid"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_13

    :cond_12
    :goto_c
    move-object v12, v6

    goto :goto_d

    :cond_13
    instance-of v13, v12, Ljava/lang/String;

    if-nez v13, :cond_14

    sget-object v13, Lb23/i;->a:Lb23/i;

    sget-object v13, Lb23/i;->d:Lb23/e;

    sget-object v14, Lb23/g;->E:Lb23/g;

    invoke-interface {v13, v14, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_12

    sget-object v13, Lb23/i;->c:Lb23/j;

    const-string v15, "[toRtcStats] \'mid\' => expected String but found "

    invoke-static {v12, v15}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v13, v14, v5, v12, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_c

    :cond_14
    :goto_d
    check-cast v12, Ljava/lang/String;

    const-string v13, "mediaSourceId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_16

    :cond_15
    move-object/from16 v16, v0

    :goto_e
    move-object v13, v6

    goto :goto_f

    :cond_16
    instance-of v14, v13, Ljava/lang/String;

    if-nez v14, :cond_17

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_15

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v16, v0

    const-string v0, "[toRtcStats] \'mediaSourceId\' => expected String but found "

    invoke-static {v13, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_e

    :cond_17
    move-object/from16 v16, v0

    :goto_f
    check-cast v13, Ljava/lang/String;

    const-string v0, "remoteId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_19

    :cond_18
    move-object/from16 v17, v1

    :goto_10
    move-object v0, v6

    goto :goto_11

    :cond_19
    instance-of v14, v0, Ljava/lang/String;

    if-nez v14, :cond_1a

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_18

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v17, v1

    const-string v1, "[toRtcStats] \'remoteId\' => expected String but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_10

    :cond_1a
    move-object/from16 v17, v1

    :goto_11
    check-cast v0, Ljava/lang/String;

    const-string v1, "headerBytesSent"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1c

    :cond_1b
    move-object/from16 v18, v0

    :goto_12
    move-object v1, v6

    goto :goto_13

    :cond_1c
    instance-of v14, v1, Ljava/math/BigInteger;

    if-nez v14, :cond_1d

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1b

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v18, v0

    const-string v0, "[toRtcStats] \'headerBytesSent\' => expected BigInteger but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_12

    :cond_1d
    move-object/from16 v18, v0

    :goto_13
    check-cast v1, Ljava/math/BigInteger;

    const-string v0, "retransmittedPacketsSent"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1f

    :cond_1e
    move-object/from16 v19, v1

    :goto_14
    move-object v0, v6

    goto :goto_15

    :cond_1f
    instance-of v14, v0, Ljava/math/BigInteger;

    if-nez v14, :cond_20

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1e

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v19, v1

    const-string v1, "[toRtcStats] \'retransmittedPacketsSent\' => expected BigInteger but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_14

    :cond_20
    move-object/from16 v19, v1

    :goto_15
    move-object v14, v0

    check-cast v14, Ljava/math/BigInteger;

    const-string v0, "retransmittedBytesSent"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_22

    :cond_21
    move-object/from16 v20, v2

    :goto_16
    move-object v0, v6

    goto :goto_17

    :cond_22
    instance-of v1, v0, Ljava/math/BigInteger;

    if-nez v1, :cond_23

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_21

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v20, v2

    const-string v2, "[toRtcStats] \'retransmittedBytesSent\' => expected BigInteger but found "

    invoke-static {v0, v2}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_16

    :cond_23
    move-object/from16 v20, v2

    :goto_17
    move-object v15, v0

    check-cast v15, Ljava/math/BigInteger;

    const-string v0, "rtxSsrc"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_25

    :cond_24
    move-object/from16 v21, v3

    :goto_18
    move-object v0, v6

    goto :goto_19

    :cond_25
    instance-of v1, v0, Ljava/lang/Long;

    if-nez v1, :cond_26

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_24

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v21, v3

    const-string v3, "[toRtcStats] \'rtxSsrc\' => expected Long but found "

    invoke-static {v0, v3}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_18

    :cond_26
    move-object/from16 v21, v3

    :goto_19
    check-cast v0, Ljava/lang/Long;

    const-string v1, "targetBitrate"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_28

    :cond_27
    move-object/from16 v22, v0

    :goto_1a
    move-object v1, v6

    goto :goto_1b

    :cond_28
    instance-of v2, v1, Ljava/lang/Double;

    if-nez v2, :cond_29

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_27

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v22, v0

    const-string v0, "[toRtcStats] \'targetBitrate\' => expected Double but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1a

    :cond_29
    move-object/from16 v22, v0

    :goto_1b
    check-cast v1, Ljava/lang/Double;

    const-string v0, "totalEncodedBytesTarget"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2b

    :cond_2a
    move-object/from16 v23, v1

    :goto_1c
    move-object v0, v6

    goto :goto_1d

    :cond_2b
    instance-of v2, v0, Ljava/math/BigInteger;

    if-nez v2, :cond_2c

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2a

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v23, v1

    const-string v1, "[toRtcStats] \'totalEncodedBytesTarget\' => expected BigInteger but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1c

    :cond_2c
    move-object/from16 v23, v1

    :goto_1d
    check-cast v0, Ljava/math/BigInteger;

    const-string v1, "totalEncodeTime"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2e

    :cond_2d
    move-object/from16 v24, v0

    :goto_1e
    move-object v1, v6

    goto :goto_1f

    :cond_2e
    instance-of v2, v1, Ljava/lang/Double;

    if-nez v2, :cond_2f

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2d

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v24, v0

    const-string v0, "[toRtcStats] \'totalEncodeTime\' => expected Double but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1e

    :cond_2f
    move-object/from16 v24, v0

    :goto_1f
    check-cast v1, Ljava/lang/Double;

    const-string v0, "totalPacketSendDelay"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_31

    :cond_30
    move-object/from16 v25, v1

    :goto_20
    move-object v0, v6

    goto :goto_21

    :cond_31
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_32

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_30

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v25, v1

    const-string v1, "[toRtcStats] \'totalPacketSendDelay\' => expected Double but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_20

    :cond_32
    move-object/from16 v25, v1

    :goto_21
    check-cast v0, Ljava/lang/Double;

    const-string v1, "active"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_34

    :cond_33
    move-object/from16 v26, v0

    goto :goto_22

    :cond_34
    instance-of v2, v1, Ljava/lang/Boolean;

    if-nez v2, :cond_35

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_33

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v26, v0

    const-string v0, "[toRtcStats] \'active\' => expected Boolean but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_22

    :cond_35
    move-object/from16 v26, v0

    move-object v6, v1

    :goto_22
    check-cast v6, Ljava/lang/Boolean;

    move-object v5, v7

    move-object v7, v9

    move-object v9, v11

    move-object v11, v13

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    move-object/from16 v13, v19

    move-object/from16 v2, v20

    move-object/from16 v3, v21

    move-object/from16 v16, v22

    move-object/from16 v17, v23

    move-object/from16 v19, v25

    move-object/from16 v20, v26

    move-object/from16 v21, v6

    move-object v6, v8

    move-object v8, v10

    move-object v10, v12

    move-object/from16 v12, v18

    move-object/from16 v18, v24

    invoke-direct/range {v0 .. v21}, Ln33/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/Long;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public static final Z(Lorg/webrtc/RTCStats;)Ln33/l;
    .locals 44

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lorg/webrtc/RTCStats;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lorg/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    const-string v0, "ssrc"

    invoke-virtual {v1}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v5, "RtcParser"

    const/4 v6, 0x0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    move-object v0, v6

    goto :goto_1

    :cond_1
    instance-of v7, v0, Ljava/lang/Long;

    if-nez v7, :cond_2

    sget-object v7, Lb23/i;->a:Lb23/i;

    sget-object v7, Lb23/i;->d:Lb23/e;

    sget-object v8, Lb23/g;->E:Lb23/g;

    invoke-interface {v7, v8, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    sget-object v7, Lb23/i;->c:Lb23/j;

    const-string v9, "[toRtcStats] \'ssrc\' => expected Long but found "

    invoke-static {v0, v9}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v8, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    :goto_1
    check-cast v0, Ljava/lang/Long;

    const-string v7, "kind"

    invoke-virtual {v1}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_4

    :cond_3
    :goto_2
    move-object v7, v6

    goto :goto_3

    :cond_4
    instance-of v8, v7, Ljava/lang/String;

    if-nez v8, :cond_5

    sget-object v8, Lb23/i;->a:Lb23/i;

    sget-object v8, Lb23/i;->d:Lb23/e;

    sget-object v9, Lb23/g;->E:Lb23/g;

    invoke-interface {v8, v9, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    sget-object v8, Lb23/i;->c:Lb23/j;

    const-string v10, "[toRtcStats] \'kind\' => expected String but found "

    invoke-static {v7, v10}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v9, v5, v7, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_5
    :goto_3
    check-cast v7, Ljava/lang/String;

    const-string v8, "transportId"

    invoke-virtual {v1}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_7

    :cond_6
    :goto_4
    move-object v8, v6

    goto :goto_5

    :cond_7
    instance-of v9, v8, Ljava/lang/String;

    if-nez v9, :cond_8

    sget-object v9, Lb23/i;->a:Lb23/i;

    sget-object v9, Lb23/i;->d:Lb23/e;

    sget-object v10, Lb23/g;->E:Lb23/g;

    invoke-interface {v9, v10, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    sget-object v9, Lb23/i;->c:Lb23/j;

    const-string v11, "[toRtcStats] \'transportId\' => expected String but found "

    invoke-static {v8, v11}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v9, v10, v5, v8, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_8
    :goto_5
    check-cast v8, Ljava/lang/String;

    const-string v9, "codecId"

    invoke-virtual {v1}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_a

    :cond_9
    :goto_6
    move-object v9, v6

    goto :goto_7

    :cond_a
    instance-of v10, v9, Ljava/lang/String;

    if-nez v10, :cond_b

    sget-object v10, Lb23/i;->a:Lb23/i;

    sget-object v10, Lb23/i;->d:Lb23/e;

    sget-object v11, Lb23/g;->E:Lb23/g;

    invoke-interface {v10, v11, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    sget-object v10, Lb23/i;->c:Lb23/j;

    const-string v12, "[toRtcStats] \'codecId\' => expected String but found "

    invoke-static {v9, v12}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v10, v11, v5, v9, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_b
    :goto_7
    check-cast v9, Ljava/lang/String;

    const-string v10, "packetsSent"

    invoke-virtual {v1}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_d

    :cond_c
    :goto_8
    move-object v10, v6

    goto :goto_9

    :cond_d
    instance-of v11, v10, Ljava/math/BigInteger;

    if-nez v11, :cond_e

    sget-object v11, Lb23/i;->a:Lb23/i;

    sget-object v11, Lb23/i;->d:Lb23/e;

    sget-object v12, Lb23/g;->E:Lb23/g;

    invoke-interface {v11, v12, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_c

    sget-object v11, Lb23/i;->c:Lb23/j;

    const-string v13, "[toRtcStats] \'packetsSent\' => expected BigInteger but found "

    invoke-static {v10, v13}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v11, v12, v5, v10, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_8

    :cond_e
    :goto_9
    check-cast v10, Ljava/math/BigInteger;

    const-string v11, "packetsLost"

    invoke-virtual {v1}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_10

    :cond_f
    :goto_a
    move-object v11, v6

    goto :goto_b

    :cond_10
    instance-of v12, v11, Ljava/math/BigInteger;

    if-nez v12, :cond_11

    sget-object v12, Lb23/i;->a:Lb23/i;

    sget-object v12, Lb23/i;->d:Lb23/e;

    sget-object v13, Lb23/g;->E:Lb23/g;

    invoke-interface {v12, v13, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_f

    sget-object v12, Lb23/i;->c:Lb23/j;

    const-string v14, "[toRtcStats] \'packetsLost\' => expected BigInteger but found "

    invoke-static {v11, v14}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v12, v13, v5, v11, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_a

    :cond_11
    :goto_b
    check-cast v11, Ljava/math/BigInteger;

    const-string v12, "mid"

    invoke-virtual {v1}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_13

    :cond_12
    :goto_c
    move-object v12, v6

    goto :goto_d

    :cond_13
    instance-of v13, v12, Ljava/lang/String;

    if-nez v13, :cond_14

    sget-object v13, Lb23/i;->a:Lb23/i;

    sget-object v13, Lb23/i;->d:Lb23/e;

    sget-object v14, Lb23/g;->E:Lb23/g;

    invoke-interface {v13, v14, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_12

    sget-object v13, Lb23/i;->c:Lb23/j;

    const-string v15, "[toRtcStats] \'mid\' => expected String but found "

    invoke-static {v12, v15}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v13, v14, v5, v12, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_c

    :cond_14
    :goto_d
    check-cast v12, Ljava/lang/String;

    const-string v13, "mediaSourceId"

    invoke-virtual {v1}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_16

    :cond_15
    move-object/from16 v16, v0

    :goto_e
    move-object v13, v6

    goto :goto_f

    :cond_16
    instance-of v14, v13, Ljava/lang/String;

    if-nez v14, :cond_17

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_15

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v16, v0

    const-string v0, "[toRtcStats] \'mediaSourceId\' => expected String but found "

    invoke-static {v13, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_e

    :cond_17
    move-object/from16 v16, v0

    :goto_f
    check-cast v13, Ljava/lang/String;

    const-string v0, "remoteId"

    invoke-virtual {v1}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_19

    :cond_18
    :goto_10
    move-object v0, v6

    goto :goto_11

    :cond_19
    instance-of v14, v0, Ljava/lang/String;

    if-nez v14, :cond_1a

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_18

    sget-object v14, Lb23/i;->c:Lb23/j;

    const-string v1, "[toRtcStats] \'remoteId\' => expected String but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_10

    :cond_1a
    :goto_11
    check-cast v0, Ljava/lang/String;

    const-string v1, "headerBytesSent"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1c

    :cond_1b
    move-object/from16 v17, v0

    :goto_12
    move-object v1, v6

    goto :goto_13

    :cond_1c
    instance-of v14, v1, Ljava/math/BigInteger;

    if-nez v14, :cond_1d

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1b

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v17, v0

    const-string v0, "[toRtcStats] \'headerBytesSent\' => expected BigInteger but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_12

    :cond_1d
    move-object/from16 v17, v0

    :goto_13
    move-object v14, v1

    check-cast v14, Ljava/math/BigInteger;

    const-string v0, "retransmittedPacketsSent"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1f

    :cond_1e
    move-object/from16 v18, v2

    :goto_14
    move-object v0, v6

    goto :goto_15

    :cond_1f
    instance-of v1, v0, Ljava/math/BigInteger;

    if-nez v1, :cond_20

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1e

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v18, v2

    const-string v2, "[toRtcStats] \'retransmittedPacketsSent\' => expected BigInteger but found "

    invoke-static {v0, v2}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_14

    :cond_20
    move-object/from16 v18, v2

    :goto_15
    move-object v15, v0

    check-cast v15, Ljava/math/BigInteger;

    const-string v0, "retransmittedBytesSent"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_22

    :cond_21
    move-object/from16 v19, v3

    :goto_16
    move-object v0, v6

    goto :goto_17

    :cond_22
    instance-of v1, v0, Ljava/math/BigInteger;

    if-nez v1, :cond_23

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_21

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v19, v3

    const-string v3, "[toRtcStats] \'retransmittedBytesSent\' => expected BigInteger but found "

    invoke-static {v0, v3}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_16

    :cond_23
    move-object/from16 v19, v3

    :goto_17
    check-cast v0, Ljava/math/BigInteger;

    const-string v1, "rtxSsrc"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_25

    :cond_24
    move-object/from16 v20, v0

    :goto_18
    move-object v1, v6

    goto :goto_19

    :cond_25
    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_26

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_24

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v20, v0

    const-string v0, "[toRtcStats] \'rtxSsrc\' => expected Long but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_18

    :cond_26
    move-object/from16 v20, v0

    :goto_19
    check-cast v1, Ljava/lang/Long;

    const-string v0, "targetBitrate"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_28

    :cond_27
    move-object/from16 v21, v1

    :goto_1a
    move-object v0, v6

    goto :goto_1b

    :cond_28
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_29

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_27

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v21, v1

    const-string v1, "[toRtcStats] \'targetBitrate\' => expected Double but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1a

    :cond_29
    move-object/from16 v21, v1

    :goto_1b
    check-cast v0, Ljava/lang/Double;

    const-string v1, "totalEncodedBytesTarget"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2b

    :cond_2a
    move-object/from16 v22, v0

    :goto_1c
    move-object v1, v6

    goto :goto_1d

    :cond_2b
    instance-of v2, v1, Ljava/math/BigInteger;

    if-nez v2, :cond_2c

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2a

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v22, v0

    const-string v0, "[toRtcStats] \'totalEncodedBytesTarget\' => expected BigInteger but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1c

    :cond_2c
    move-object/from16 v22, v0

    :goto_1d
    check-cast v1, Ljava/math/BigInteger;

    const-string v0, "totalEncodeTime"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2e

    :cond_2d
    move-object/from16 v23, v1

    :goto_1e
    move-object v0, v6

    goto :goto_1f

    :cond_2e
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_2f

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2d

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v23, v1

    const-string v1, "[toRtcStats] \'totalEncodeTime\' => expected Double but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1e

    :cond_2f
    move-object/from16 v23, v1

    :goto_1f
    check-cast v0, Ljava/lang/Double;

    const-string v1, "totalPacketSendDelay"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_31

    :cond_30
    move-object/from16 v24, v0

    :goto_20
    move-object v1, v6

    goto :goto_21

    :cond_31
    instance-of v2, v1, Ljava/lang/Double;

    if-nez v2, :cond_32

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_30

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v24, v0

    const-string v0, "[toRtcStats] \'totalPacketSendDelay\' => expected Double but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_20

    :cond_32
    move-object/from16 v24, v0

    :goto_21
    check-cast v1, Ljava/lang/Double;

    const-string v0, "active"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_34

    :cond_33
    move-object/from16 v25, v1

    :goto_22
    move-object v0, v6

    goto :goto_23

    :cond_34
    instance-of v2, v0, Ljava/lang/Boolean;

    if-nez v2, :cond_35

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_33

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v25, v1

    const-string v1, "[toRtcStats] \'active\' => expected Boolean but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_22

    :cond_35
    move-object/from16 v25, v1

    :goto_23
    check-cast v0, Ljava/lang/Boolean;

    const-string v1, "rid"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_37

    :cond_36
    move-object/from16 v26, v0

    :goto_24
    move-object v1, v6

    goto :goto_25

    :cond_37
    instance-of v2, v1, Ljava/lang/String;

    if-nez v2, :cond_38

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_36

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v26, v0

    const-string v0, "[toRtcStats] \'rid\' => expected String but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_24

    :cond_38
    move-object/from16 v26, v0

    :goto_25
    check-cast v1, Ljava/lang/String;

    const-string v0, "frameWidth"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3a

    :cond_39
    move-object/from16 v27, v1

    :goto_26
    move-object v0, v6

    goto :goto_27

    :cond_3a
    instance-of v2, v0, Ljava/lang/Long;

    if-nez v2, :cond_3b

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_39

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v27, v1

    const-string v1, "[toRtcStats] \'frameWidth\' => expected Long but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_26

    :cond_3b
    move-object/from16 v27, v1

    :goto_27
    check-cast v0, Ljava/lang/Long;

    const-string v1, "frameHeight"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3d

    :cond_3c
    move-object/from16 v28, v0

    :goto_28
    move-object v1, v6

    goto :goto_29

    :cond_3d
    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_3e

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3c

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v28, v0

    const-string v0, "[toRtcStats] \'frameHeight\' => expected Long but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_28

    :cond_3e
    move-object/from16 v28, v0

    :goto_29
    check-cast v1, Ljava/lang/Long;

    const-string v0, "framesPerSecond"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_40

    :cond_3f
    move-object/from16 v29, v1

    :goto_2a
    move-object v0, v6

    goto :goto_2b

    :cond_40
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_41

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3f

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v29, v1

    const-string v1, "[toRtcStats] \'framesPerSecond\' => expected Double but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2a

    :cond_41
    move-object/from16 v29, v1

    :goto_2b
    check-cast v0, Ljava/lang/Double;

    const-string v1, "framesSent"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_43

    :cond_42
    move-object/from16 v30, v0

    :goto_2c
    move-object v1, v6

    goto :goto_2d

    :cond_43
    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_44

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_42

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v30, v0

    const-string v0, "[toRtcStats] \'framesSent\' => expected Long but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2c

    :cond_44
    move-object/from16 v30, v0

    :goto_2d
    check-cast v1, Ljava/lang/Long;

    const-string v0, "hugeFramesSent"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_46

    :cond_45
    move-object/from16 v31, v1

    :goto_2e
    move-object v0, v6

    goto :goto_2f

    :cond_46
    instance-of v2, v0, Ljava/lang/Long;

    if-nez v2, :cond_47

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_45

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v31, v1

    const-string v1, "[toRtcStats] \'hugeFramesSent\' => expected Long but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2e

    :cond_47
    move-object/from16 v31, v1

    :goto_2f
    check-cast v0, Ljava/lang/Long;

    const-string v1, "framesEncoded"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_49

    :cond_48
    move-object/from16 v32, v0

    :goto_30
    move-object v1, v6

    goto :goto_31

    :cond_49
    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_4a

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_48

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v32, v0

    const-string v0, "[toRtcStats] \'framesEncoded\' => expected Long but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_30

    :cond_4a
    move-object/from16 v32, v0

    :goto_31
    check-cast v1, Ljava/lang/Long;

    const-string v0, "keyFramesEncoded"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4c

    :cond_4b
    move-object/from16 v33, v1

    :goto_32
    move-object v0, v6

    goto :goto_33

    :cond_4c
    instance-of v2, v0, Ljava/lang/Long;

    if-nez v2, :cond_4d

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4b

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v33, v1

    const-string v1, "[toRtcStats] \'keyFramesEncoded\' => expected Long but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_32

    :cond_4d
    move-object/from16 v33, v1

    :goto_33
    check-cast v0, Ljava/lang/Long;

    const-string v1, "qpSum"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_4f

    :cond_4e
    move-object/from16 v34, v0

    :goto_34
    move-object v1, v6

    goto :goto_35

    :cond_4f
    instance-of v2, v1, Ljava/math/BigInteger;

    if-nez v2, :cond_50

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4e

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v34, v0

    const-string v0, "[toRtcStats] \'qpSum\' => expected BigInteger but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_34

    :cond_50
    move-object/from16 v34, v0

    :goto_35
    check-cast v1, Ljava/math/BigInteger;

    const-string v0, "qualityLimitationReason"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_52

    :cond_51
    move-object/from16 v35, v1

    :goto_36
    move-object v0, v6

    goto :goto_37

    :cond_52
    instance-of v2, v0, Ljava/lang/String;

    if-nez v2, :cond_53

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_51

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v35, v1

    const-string v1, "[toRtcStats] \'qualityLimitationReason\' => expected String but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_36

    :cond_53
    move-object/from16 v35, v1

    :goto_37
    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_54

    sget-object v1, Lo33/b;->x:Lng3/o;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lng3/o;->n(Ljava/lang/String;)Lo33/b;

    move-result-object v0

    goto :goto_38

    :cond_54
    move-object v0, v6

    :goto_38
    const-string v1, "qualityLimitationDurations"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_56

    :cond_55
    move-object/from16 v36, v0

    :goto_39
    move-object v1, v6

    goto :goto_3a

    :cond_56
    instance-of v2, v1, Ljava/util/Map;

    if-nez v2, :cond_57

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_55

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v36, v0

    const-string v0, "[toRtcStats] \'qualityLimitationDurations\' => expected Map but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_39

    :cond_57
    move-object/from16 v36, v0

    :goto_3a
    check-cast v1, Ljava/util/Map;

    if-eqz v1, :cond_59

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_58

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    sget-object v3, Lo33/b;->x:Lng3/o;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v37

    check-cast v37, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static/range {v37 .. v37}, Lng3/o;->n(Ljava/lang/String;)Lo33/b;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    new-instance v6, Ll83/k;

    invoke-direct {v6, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v6, 0x0

    goto :goto_3b

    :cond_58
    invoke-static {v0}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    goto :goto_3c

    :cond_59
    const/4 v0, 0x0

    :goto_3c
    const-string v1, "qualityLimitationResolutionChanges"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_5b

    :cond_5a
    :goto_3d
    const/4 v1, 0x0

    goto :goto_3e

    :cond_5b
    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_5c

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5a

    sget-object v2, Lb23/i;->c:Lb23/j;

    const-string v6, "[toRtcStats] \'qualityLimitationResolutionChanges\' => expected Long but found "

    invoke-static {v1, v6}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x0

    invoke-interface {v2, v3, v5, v1, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3d

    :cond_5c
    :goto_3e
    check-cast v1, Ljava/lang/Long;

    const-string v2, "nackCount"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_5e

    :cond_5d
    move-object/from16 v38, v0

    :goto_3f
    const/4 v2, 0x0

    goto :goto_40

    :cond_5e
    instance-of v3, v2, Ljava/lang/Long;

    if-nez v3, :cond_5f

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v6, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5d

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v38, v0

    const-string v0, "[toRtcStats] \'nackCount\' => expected Long but found "

    invoke-static {v2, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v3, v6, v5, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3f

    :cond_5f
    move-object/from16 v38, v0

    :goto_40
    check-cast v2, Ljava/lang/Long;

    const-string v0, "firCount"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_61

    :cond_60
    move-object/from16 v39, v1

    :goto_41
    const/4 v0, 0x0

    goto :goto_42

    :cond_61
    instance-of v3, v0, Ljava/lang/Long;

    if-nez v3, :cond_62

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v6, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_60

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v39, v1

    const-string v1, "[toRtcStats] \'firCount\' => expected Long but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v3, v6, v5, v0, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_41

    :cond_62
    move-object/from16 v39, v1

    :goto_42
    check-cast v0, Ljava/lang/Long;

    const-string v1, "pliCount"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_64

    :cond_63
    move-object/from16 v40, v0

    :goto_43
    const/4 v1, 0x0

    goto :goto_44

    :cond_64
    instance-of v3, v1, Ljava/lang/Long;

    if-nez v3, :cond_65

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v6, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_63

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v40, v0

    const-string v0, "[toRtcStats] \'pliCount\' => expected Long but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v3, v6, v5, v0, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_43

    :cond_65
    move-object/from16 v40, v0

    :goto_44
    check-cast v1, Ljava/lang/Long;

    const-string v0, "encoderImplementation"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_67

    :cond_66
    move-object/from16 v41, v1

    :goto_45
    const/4 v0, 0x0

    goto :goto_46

    :cond_67
    instance-of v3, v0, Ljava/lang/String;

    if-nez v3, :cond_68

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v6, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_66

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v41, v1

    const-string v1, "[toRtcStats] \'encoderImplementation\' => expected String but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v3, v6, v5, v0, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_45

    :cond_68
    move-object/from16 v41, v1

    :goto_46
    check-cast v0, Ljava/lang/String;

    const-string v1, "powerEfficientEncoder"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_6a

    :cond_69
    move-object/from16 v42, v0

    :goto_47
    const/4 v6, 0x0

    goto :goto_48

    :cond_6a
    instance-of v1, v6, Ljava/lang/Boolean;

    if-nez v1, :cond_6b

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_69

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v42, v0

    const-string v0, "[toRtcStats] \'powerEfficientEncoder\' => expected Boolean but found "

    invoke-static {v6, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x0

    invoke-interface {v1, v3, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_47

    :cond_6b
    move-object/from16 v42, v0

    :goto_48
    check-cast v6, Ljava/lang/Boolean;

    const-string v0, "scalabilityMode"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_6c

    move-object/from16 v43, v2

    const/4 v0, 0x0

    goto :goto_4a

    :cond_6c
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_6e

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6d

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v43, v2

    const-string v2, "[toRtcStats] \'scalabilityMode\' => expected String but found "

    invoke-static {v0, v2}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v1, v3, v5, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_49

    :cond_6d
    move-object/from16 v43, v2

    const/4 v2, 0x0

    :goto_49
    move-object v0, v2

    goto :goto_4a

    :cond_6e
    move-object/from16 v43, v2

    :goto_4a
    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln33/l;

    move-object/from16 v5, v16

    move-object/from16 v2, v18

    move-object/from16 v3, v19

    move-object/from16 v16, v20

    move-object/from16 v18, v22

    move-object/from16 v19, v23

    move-object/from16 v20, v24

    move-object/from16 v22, v26

    move-object/from16 v23, v27

    move-object/from16 v24, v28

    move-object/from16 v26, v30

    move-object/from16 v27, v31

    move-object/from16 v28, v32

    move-object/from16 v30, v34

    move-object/from16 v31, v35

    move-object/from16 v32, v36

    move-object/from16 v34, v39

    move-object/from16 v36, v40

    move-object/from16 v37, v41

    move-object/from16 v35, v43

    move-object/from16 v40, v0

    move-object/from16 v39, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object/from16 v13, v17

    move-object/from16 v17, v21

    move-object/from16 v21, v25

    move-object/from16 v25, v29

    move-object/from16 v29, v33

    move-object/from16 v33, v38

    move-object/from16 v38, v42

    invoke-direct/range {v1 .. v40}, Ln33/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/Long;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigInteger;Lo33/b;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    return-object v1
.end method

.method public static final a(ZLandroidx/compose/runtime/Composer;I)V
    .locals 4

    check-cast p1, Lp1/q;

    const v0, -0x615be61

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p1, p0}, Lp1/q;->h(Z)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    and-int/lit8 v0, v0, 0x3

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_2

    :cond_2
    :goto_1
    sget-object v0, Lb3/v1;->p:Lp1/u2;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb3/x2;

    if-eqz p0, :cond_5

    const v1, -0x24ed3bca

    invoke-virtual {p1, v1}, Lp1/q;->e0(I)V

    invoke-virtual {p1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_3

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_4

    :cond_3
    new-instance v2, La13/h;

    const/4 v1, 0x0

    const/4 v3, 0x5

    invoke-direct {v2, v0, v1, v3}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lc93/m;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-static {p1, v2, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    :cond_5
    :goto_2
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, Lc30/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, v1}, Lc30/b;-><init>(ZII)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final a0(Lorg/webrtc/RTCStats;)Ln33/m;
    .locals 21

    new-instance v0, Ln33/m;

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const-string v4, "ssrc"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "RtcParser"

    const/4 v6, 0x0

    if-nez v4, :cond_1

    :cond_0
    :goto_0
    move-object v4, v6

    goto :goto_1

    :cond_1
    instance-of v7, v4, Ljava/lang/Long;

    if-nez v7, :cond_2

    sget-object v7, Lb23/i;->a:Lb23/i;

    sget-object v7, Lb23/i;->d:Lb23/e;

    sget-object v8, Lb23/g;->E:Lb23/g;

    invoke-interface {v7, v8, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    sget-object v7, Lb23/i;->c:Lb23/j;

    const-string v9, "[toRtcStats] \'ssrc\' => expected Long but found "

    invoke-static {v4, v9}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v7, v8, v5, v4, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    :goto_1
    check-cast v4, Ljava/lang/Long;

    const-string v7, "kind"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_4

    :cond_3
    :goto_2
    move-object v7, v6

    goto :goto_3

    :cond_4
    instance-of v8, v7, Ljava/lang/String;

    if-nez v8, :cond_5

    sget-object v8, Lb23/i;->a:Lb23/i;

    sget-object v8, Lb23/i;->d:Lb23/e;

    sget-object v9, Lb23/g;->E:Lb23/g;

    invoke-interface {v8, v9, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    sget-object v8, Lb23/i;->c:Lb23/j;

    const-string v10, "[toRtcStats] \'kind\' => expected String but found "

    invoke-static {v7, v10}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v9, v5, v7, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_5
    :goto_3
    check-cast v7, Ljava/lang/String;

    const-string v8, "transportId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_7

    :cond_6
    :goto_4
    move-object v8, v6

    goto :goto_5

    :cond_7
    instance-of v9, v8, Ljava/lang/String;

    if-nez v9, :cond_8

    sget-object v9, Lb23/i;->a:Lb23/i;

    sget-object v9, Lb23/i;->d:Lb23/e;

    sget-object v10, Lb23/g;->E:Lb23/g;

    invoke-interface {v9, v10, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    sget-object v9, Lb23/i;->c:Lb23/j;

    const-string v11, "[toRtcStats] \'transportId\' => expected String but found "

    invoke-static {v8, v11}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v9, v10, v5, v8, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_8
    :goto_5
    check-cast v8, Ljava/lang/String;

    const-string v9, "codecId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_a

    :cond_9
    :goto_6
    move-object v9, v6

    goto :goto_7

    :cond_a
    instance-of v10, v9, Ljava/lang/String;

    if-nez v10, :cond_b

    sget-object v10, Lb23/i;->a:Lb23/i;

    sget-object v10, Lb23/i;->d:Lb23/e;

    sget-object v11, Lb23/g;->E:Lb23/g;

    invoke-interface {v10, v11, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    sget-object v10, Lb23/i;->c:Lb23/j;

    const-string v12, "[toRtcStats] \'codecId\' => expected String but found "

    invoke-static {v9, v12}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v10, v11, v5, v9, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_b
    :goto_7
    check-cast v9, Ljava/lang/String;

    const-string v10, "packetsReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_d

    :cond_c
    :goto_8
    move-object v10, v6

    goto :goto_9

    :cond_d
    instance-of v11, v10, Ljava/lang/Long;

    if-nez v11, :cond_e

    sget-object v11, Lb23/i;->a:Lb23/i;

    sget-object v11, Lb23/i;->d:Lb23/e;

    sget-object v12, Lb23/g;->E:Lb23/g;

    invoke-interface {v11, v12, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_c

    sget-object v11, Lb23/i;->c:Lb23/j;

    const-string v13, "[toRtcStats] \'packetsReceived\' => expected Long but found "

    invoke-static {v10, v13}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v11, v12, v5, v10, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_8

    :cond_e
    :goto_9
    check-cast v10, Ljava/lang/Long;

    const-string v11, "packetsLost"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_10

    :cond_f
    :goto_a
    move-object v11, v6

    goto :goto_b

    :cond_10
    instance-of v12, v11, Ljava/lang/Integer;

    if-nez v12, :cond_11

    sget-object v12, Lb23/i;->a:Lb23/i;

    sget-object v12, Lb23/i;->d:Lb23/e;

    sget-object v13, Lb23/g;->E:Lb23/g;

    invoke-interface {v12, v13, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_f

    sget-object v12, Lb23/i;->c:Lb23/j;

    const-string v14, "[toRtcStats] \'packetsLost\' => expected Integer but found "

    invoke-static {v11, v14}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v12, v13, v5, v11, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_a

    :cond_11
    :goto_b
    check-cast v11, Ljava/lang/Integer;

    const-string v12, "jitter"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_13

    :cond_12
    :goto_c
    move-object v12, v6

    goto :goto_d

    :cond_13
    instance-of v13, v12, Ljava/lang/Double;

    if-nez v13, :cond_14

    sget-object v13, Lb23/i;->a:Lb23/i;

    sget-object v13, Lb23/i;->d:Lb23/e;

    sget-object v14, Lb23/g;->E:Lb23/g;

    invoke-interface {v13, v14, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_12

    sget-object v13, Lb23/i;->c:Lb23/j;

    const-string v15, "[toRtcStats] \'jitter\' => expected Double but found "

    invoke-static {v12, v15}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v13, v14, v5, v12, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_c

    :cond_14
    :goto_d
    check-cast v12, Ljava/lang/Double;

    const-string v13, "localId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_16

    :cond_15
    move-object/from16 v16, v0

    :goto_e
    move-object v13, v6

    goto :goto_f

    :cond_16
    instance-of v14, v13, Ljava/lang/String;

    if-nez v14, :cond_17

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_15

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v16, v0

    const-string v0, "[toRtcStats] \'localId\' => expected String but found "

    invoke-static {v13, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_e

    :cond_17
    move-object/from16 v16, v0

    :goto_f
    check-cast v13, Ljava/lang/String;

    const-string v0, "roundTripTime"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_19

    :cond_18
    move-object/from16 v17, v1

    :goto_10
    move-object v0, v6

    goto :goto_11

    :cond_19
    instance-of v14, v0, Ljava/lang/Double;

    if-nez v14, :cond_1a

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_18

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v17, v1

    const-string v1, "[toRtcStats] \'roundTripTime\' => expected Double but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_10

    :cond_1a
    move-object/from16 v17, v1

    :goto_11
    check-cast v0, Ljava/lang/Double;

    const-string v1, "totalRoundTripTime"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1c

    :cond_1b
    move-object/from16 v18, v0

    :goto_12
    move-object v1, v6

    goto :goto_13

    :cond_1c
    instance-of v14, v1, Ljava/lang/Double;

    if-nez v14, :cond_1d

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1b

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v18, v0

    const-string v0, "[toRtcStats] \'totalRoundTripTime\' => expected Double but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_12

    :cond_1d
    move-object/from16 v18, v0

    :goto_13
    check-cast v1, Ljava/lang/Double;

    const-string v0, "fractionLost"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1f

    :cond_1e
    move-object/from16 v19, v1

    :goto_14
    move-object v0, v6

    goto :goto_15

    :cond_1f
    instance-of v14, v0, Ljava/lang/Double;

    if-nez v14, :cond_20

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1e

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v19, v1

    const-string v1, "[toRtcStats] \'fractionLost\' => expected Double but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_14

    :cond_20
    move-object/from16 v19, v1

    :goto_15
    move-object v14, v0

    check-cast v14, Ljava/lang/Double;

    const-string v0, "roundTripTimeMeasurements"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_22

    :cond_21
    move-object/from16 v20, v2

    goto :goto_16

    :cond_22
    instance-of v1, v0, Ljava/lang/Integer;

    if-nez v1, :cond_23

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_21

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v20, v2

    const-string v2, "[toRtcStats] \'roundTripTimeMeasurements\' => expected Integer but found "

    invoke-static {v0, v2}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_16

    :cond_23
    move-object/from16 v20, v2

    move-object v6, v0

    :goto_16
    move-object v15, v6

    check-cast v15, Ljava/lang/Integer;

    move-object v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, v10

    move-object v9, v11

    move-object v10, v12

    move-object v11, v13

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    move-object/from16 v12, v18

    move-object/from16 v13, v19

    move-object/from16 v2, v20

    invoke-direct/range {v0 .. v15}, Ln33/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public static final b(Lh40/k;Landroidx/compose/ui/Modifier;FLc93/a;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v3, p3

    move/from16 v7, p6

    const-string v1, "state"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onDismissed"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v1, 0x21893052

    invoke-virtual {v12, v1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x4

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v7

    or-int/lit8 v1, v1, 0x30

    and-int/lit16 v4, v7, 0x180

    if-nez v4, :cond_3

    and-int/lit8 v4, p7, 0x4

    if-nez v4, :cond_1

    move/from16 v4, p2

    invoke-virtual {v12, v4}, Lp1/q;->d(F)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x100

    goto :goto_1

    :cond_1
    move/from16 v4, p2

    :cond_2
    const/16 v5, 0x80

    :goto_1
    or-int/2addr v1, v5

    goto :goto_2

    :cond_3
    move/from16 v4, p2

    :goto_2
    and-int/lit16 v5, v7, 0xc00

    if-nez v5, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x800

    goto :goto_3

    :cond_4
    const/16 v5, 0x400

    :goto_3
    or-int/2addr v1, v5

    :cond_5
    and-int/lit16 v5, v1, 0x2493

    const/16 v6, 0x2492

    if-ne v5, v6, :cond_7

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object/from16 v2, p1

    move v3, v4

    goto/16 :goto_11

    :cond_7
    :goto_4
    invoke-virtual {v12}, Lp1/q;->Z()V

    and-int/lit8 v5, v7, 0x1

    if-eqz v5, :cond_b

    invoke-virtual {v12}, Lp1/q;->C()Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {v12}, Lp1/q;->X()V

    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_9

    and-int/lit16 v1, v1, -0x381

    :cond_9
    move-object/from16 v6, p1

    :cond_a
    :goto_5
    move v15, v4

    goto :goto_7

    :cond_b
    :goto_6
    and-int/lit8 v5, p7, 0x4

    sget-object v6, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_a

    invoke-static {v12}, Ld40/r;->l(Landroidx/compose/runtime/Composer;)Ld40/o;

    move-result-object v4

    iget v4, v4, Ld40/o;->b:F

    and-int/lit16 v1, v1, -0x381

    goto :goto_5

    :goto_7
    invoke-virtual {v12}, Lp1/q;->r()V

    sget-object v4, Lcm/d;->b:Lcm/c;

    const v4, -0x2aa96a8d

    invoke-virtual {v12, v4}, Lp1/q;->f0(I)V

    const v4, 0x3c2868d5

    invoke-virtual {v12, v4}, Lp1/q;->f0(I)V

    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    invoke-virtual {v12, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    instance-of v8, v5, Lc4/b0;

    const/4 v9, 0x0

    if-eqz v8, :cond_c

    check-cast v5, Lc4/b0;

    goto :goto_8

    :cond_c
    move-object v5, v9

    :goto_8
    if-eqz v5, :cond_d

    invoke-interface {v5}, Lc4/b0;->getWindow()Landroid/view/Window;

    move-result-object v5

    goto :goto_9

    :cond_d
    move-object v5, v9

    :goto_9
    if-nez v5, :cond_10

    invoke-virtual {v12, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "getContext(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_a
    instance-of v5, v4, Landroid/app/Activity;

    if-eqz v5, :cond_e

    check-cast v4, Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v4

    move-object v5, v4

    goto :goto_b

    :cond_e
    instance-of v5, v4, Landroid/content/ContextWrapper;

    if-eqz v5, :cond_f

    check-cast v4, Landroid/content/ContextWrapper;

    invoke-virtual {v4}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "getBaseContext(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_a

    :cond_f
    move-object v5, v9

    :cond_10
    :goto_b
    const/4 v4, 0x0

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    sget-object v8, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    invoke-virtual {v12, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/View;

    const v10, -0x3e472f0b

    invoke-virtual {v12, v10}, Lp1/q;->f0(I)V

    invoke-virtual {v12, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-nez v10, :cond_11

    if-ne v11, v13, :cond_12

    :cond_11
    new-instance v11, Lcm/a;

    invoke-direct {v11, v8, v5}, Lcm/a;-><init>(Landroid/view/View;Landroid/view/Window;)V

    invoke-virtual {v12, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v5, v11

    check-cast v5, Lcm/a;

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    sget-wide v10, Li2/x;->b:J

    const v8, 0x3ea3d70a    # 0.32f

    invoke-static {v8, v10, v11}, Li2/x;->c(FJ)J

    move-result-wide v20

    const v8, 0x2ddc52fb

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v12, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg1/c1;

    invoke-virtual {v8}, Lg1/c1;->h()J

    move-result-wide v18

    const v8, -0x1762ec07

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    const/4 v10, 0x0

    if-ne v8, v13, :cond_13

    new-instance v16, Lh40/e;

    const/16 v8, 0xc

    invoke-static {v15, v15, v10, v10, v8}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object v17

    invoke-direct/range {v16 .. v21}, Lh40/e;-><init>(Lt0/i;JJ)V

    move-object/from16 v8, v16

    invoke-virtual {v12, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v8, Lh40/e;

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    const v11, -0x4e1cf848

    invoke-virtual {v12, v11}, Lp1/q;->e0(I)V

    and-int/lit8 v11, v1, 0xe

    if-eq v11, v2, :cond_15

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_c

    :cond_14
    move v2, v4

    goto :goto_d

    :cond_15
    :goto_c
    const/4 v2, 0x1

    :goto_d
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v2, :cond_16

    if-ne v14, v13, :cond_17

    :cond_16
    new-instance v14, La13/h;

    const/16 v2, 0x10

    invoke-direct {v14, v0, v9, v2}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v14, Lc93/m;

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    invoke-static {v12, v14, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v2, v0, Lh40/k;->a:Lg1/y3;

    invoke-virtual {v2}, Lg1/y3;->c()Lg1/z3;

    move-result-object v2

    sget-object v14, Lg1/z3;->x:Lg1/z3;

    if-ne v2, v14, :cond_18

    move-object/from16 v17, v5

    iget-wide v4, v8, Lh40/e;->c:J

    invoke-static {v4, v5}, Li2/x;->e(J)F

    move-result v10

    goto :goto_e

    :cond_18
    move-object/from16 v17, v5

    :goto_e
    const/4 v2, 0x7

    const/4 v4, 0x0

    invoke-static {v4, v4, v9, v2}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v2

    move-object v4, v13

    const/16 v13, 0xc30

    const/16 v14, 0x14

    move-object/from16 v18, v8

    move v8, v10

    const-string v10, "StatusBarColorAlpha"

    move v5, v11

    const/4 v11, 0x0

    move-object/from16 v20, v9

    move-object v9, v2

    move-object/from16 v2, v18

    invoke-static/range {v8 .. v14}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v8

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    const v10, -0x4e1cc5c0

    invoke-virtual {v12, v10}, Lp1/q;->e0(I)V

    move-object/from16 v11, v17

    invoke-virtual {v12, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v10, v13

    invoke-virtual {v12, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v10, v13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v10, :cond_1a

    if-ne v13, v4, :cond_19

    goto :goto_f

    :cond_19
    move-object/from16 v18, v2

    move-object/from16 v2, v20

    goto :goto_10

    :cond_1a
    :goto_f
    new-instance v16, Lay/u;

    const/16 v21, 0xf

    move-object/from16 v18, v2

    move-object/from16 v19, v8

    move-object/from16 v17, v11

    invoke-direct/range {v16 .. v21}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object/from16 v13, v16

    move-object/from16 v2, v20

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    check-cast v13, Lc93/m;

    const/4 v8, 0x0

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    invoke-static {v11, v9, v13, v12}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    const v8, -0x4e1cac5a

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_1b

    if-ne v9, v4, :cond_1c

    :cond_1b
    new-instance v9, La13/h;

    const/16 v4, 0x11

    invoke-direct {v9, v11, v2, v4}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v9, Lc93/m;

    const/4 v8, 0x0

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    invoke-static {v12, v9, v11}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    or-int/lit16 v2, v5, 0x188

    and-int/lit16 v1, v1, 0x1c00

    or-int/2addr v1, v2

    or-int/lit16 v1, v1, 0x6000

    move-object/from16 v4, p4

    move-object v2, v6

    move-object v5, v12

    move v6, v1

    move-object/from16 v1, v18

    invoke-static/range {v0 .. v6}, Lv8/b;->f(Lh40/k;Lh40/e;Landroidx/compose/ui/Modifier;Lc93/a;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    move v3, v15

    :goto_11
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_1d

    new-instance v0, Lc51/b;

    const/4 v8, 0x5

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move v6, v7

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lc51/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;FLl83/e;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method public static final b0(Lorg/webrtc/RTCStats;)Ln33/n;
    .locals 21

    new-instance v0, Ln33/n;

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const-string v4, "ssrc"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "RtcParser"

    const/4 v6, 0x0

    if-nez v4, :cond_1

    :cond_0
    :goto_0
    move-object v4, v6

    goto :goto_1

    :cond_1
    instance-of v7, v4, Ljava/lang/Long;

    if-nez v7, :cond_2

    sget-object v7, Lb23/i;->a:Lb23/i;

    sget-object v7, Lb23/i;->d:Lb23/e;

    sget-object v8, Lb23/g;->E:Lb23/g;

    invoke-interface {v7, v8, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    sget-object v7, Lb23/i;->c:Lb23/j;

    const-string v9, "[toRtcStats] \'ssrc\' => expected Long but found "

    invoke-static {v4, v9}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v7, v8, v5, v4, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    :goto_1
    check-cast v4, Ljava/lang/Long;

    const-string v7, "kind"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_4

    :cond_3
    :goto_2
    move-object v7, v6

    goto :goto_3

    :cond_4
    instance-of v8, v7, Ljava/lang/String;

    if-nez v8, :cond_5

    sget-object v8, Lb23/i;->a:Lb23/i;

    sget-object v8, Lb23/i;->d:Lb23/e;

    sget-object v9, Lb23/g;->E:Lb23/g;

    invoke-interface {v8, v9, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    sget-object v8, Lb23/i;->c:Lb23/j;

    const-string v10, "[toRtcStats] \'kind\' => expected String but found "

    invoke-static {v7, v10}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v9, v5, v7, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_5
    :goto_3
    check-cast v7, Ljava/lang/String;

    const-string v8, "transportId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_7

    :cond_6
    :goto_4
    move-object v8, v6

    goto :goto_5

    :cond_7
    instance-of v9, v8, Ljava/lang/String;

    if-nez v9, :cond_8

    sget-object v9, Lb23/i;->a:Lb23/i;

    sget-object v9, Lb23/i;->d:Lb23/e;

    sget-object v10, Lb23/g;->E:Lb23/g;

    invoke-interface {v9, v10, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    sget-object v9, Lb23/i;->c:Lb23/j;

    const-string v11, "[toRtcStats] \'transportId\' => expected String but found "

    invoke-static {v8, v11}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v9, v10, v5, v8, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_8
    :goto_5
    check-cast v8, Ljava/lang/String;

    const-string v9, "codecId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_a

    :cond_9
    :goto_6
    move-object v9, v6

    goto :goto_7

    :cond_a
    instance-of v10, v9, Ljava/lang/String;

    if-nez v10, :cond_b

    sget-object v10, Lb23/i;->a:Lb23/i;

    sget-object v10, Lb23/i;->d:Lb23/e;

    sget-object v11, Lb23/g;->E:Lb23/g;

    invoke-interface {v10, v11, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    sget-object v10, Lb23/i;->c:Lb23/j;

    const-string v12, "[toRtcStats] \'codecId\' => expected String but found "

    invoke-static {v9, v12}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v10, v11, v5, v9, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_b
    :goto_7
    check-cast v9, Ljava/lang/String;

    const-string v10, "packetsReceived"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_d

    :cond_c
    :goto_8
    move-object v10, v6

    goto :goto_9

    :cond_d
    instance-of v11, v10, Ljava/lang/Long;

    if-nez v11, :cond_e

    sget-object v11, Lb23/i;->a:Lb23/i;

    sget-object v11, Lb23/i;->d:Lb23/e;

    sget-object v12, Lb23/g;->E:Lb23/g;

    invoke-interface {v11, v12, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_c

    sget-object v11, Lb23/i;->c:Lb23/j;

    const-string v13, "[toRtcStats] \'packetsReceived\' => expected Long but found "

    invoke-static {v10, v13}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v11, v12, v5, v10, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_8

    :cond_e
    :goto_9
    check-cast v10, Ljava/lang/Long;

    const-string v11, "packetsLost"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_10

    :cond_f
    :goto_a
    move-object v11, v6

    goto :goto_b

    :cond_10
    instance-of v12, v11, Ljava/lang/Integer;

    if-nez v12, :cond_11

    sget-object v12, Lb23/i;->a:Lb23/i;

    sget-object v12, Lb23/i;->d:Lb23/e;

    sget-object v13, Lb23/g;->E:Lb23/g;

    invoke-interface {v12, v13, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_f

    sget-object v12, Lb23/i;->c:Lb23/j;

    const-string v14, "[toRtcStats] \'packetsLost\' => expected Integer but found "

    invoke-static {v11, v14}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v12, v13, v5, v11, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_a

    :cond_11
    :goto_b
    check-cast v11, Ljava/lang/Integer;

    const-string v12, "jitter"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_13

    :cond_12
    :goto_c
    move-object v12, v6

    goto :goto_d

    :cond_13
    instance-of v13, v12, Ljava/lang/Double;

    if-nez v13, :cond_14

    sget-object v13, Lb23/i;->a:Lb23/i;

    sget-object v13, Lb23/i;->d:Lb23/e;

    sget-object v14, Lb23/g;->E:Lb23/g;

    invoke-interface {v13, v14, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_12

    sget-object v13, Lb23/i;->c:Lb23/j;

    const-string v15, "[toRtcStats] \'jitter\' => expected Double but found "

    invoke-static {v12, v15}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v13, v14, v5, v12, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_c

    :cond_14
    :goto_d
    check-cast v12, Ljava/lang/Double;

    const-string v13, "localId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_16

    :cond_15
    move-object/from16 v16, v0

    :goto_e
    move-object v13, v6

    goto :goto_f

    :cond_16
    instance-of v14, v13, Ljava/lang/String;

    if-nez v14, :cond_17

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_15

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v16, v0

    const-string v0, "[toRtcStats] \'localId\' => expected String but found "

    invoke-static {v13, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_e

    :cond_17
    move-object/from16 v16, v0

    :goto_f
    check-cast v13, Ljava/lang/String;

    const-string v0, "roundTripTime"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_19

    :cond_18
    move-object/from16 v17, v1

    :goto_10
    move-object v0, v6

    goto :goto_11

    :cond_19
    instance-of v14, v0, Ljava/lang/Double;

    if-nez v14, :cond_1a

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_18

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v17, v1

    const-string v1, "[toRtcStats] \'roundTripTime\' => expected Double but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_10

    :cond_1a
    move-object/from16 v17, v1

    :goto_11
    check-cast v0, Ljava/lang/Double;

    const-string v1, "totalRoundTripTime"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1c

    :cond_1b
    move-object/from16 v18, v0

    :goto_12
    move-object v1, v6

    goto :goto_13

    :cond_1c
    instance-of v14, v1, Ljava/lang/Double;

    if-nez v14, :cond_1d

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1b

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v18, v0

    const-string v0, "[toRtcStats] \'totalRoundTripTime\' => expected Double but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_12

    :cond_1d
    move-object/from16 v18, v0

    :goto_13
    check-cast v1, Ljava/lang/Double;

    const-string v0, "fractionLost"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1f

    :cond_1e
    move-object/from16 v19, v1

    :goto_14
    move-object v0, v6

    goto :goto_15

    :cond_1f
    instance-of v14, v0, Ljava/lang/Double;

    if-nez v14, :cond_20

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1e

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v19, v1

    const-string v1, "[toRtcStats] \'fractionLost\' => expected Double but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_14

    :cond_20
    move-object/from16 v19, v1

    :goto_15
    move-object v14, v0

    check-cast v14, Ljava/lang/Double;

    const-string v0, "roundTripTimeMeasurements"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_22

    :cond_21
    move-object/from16 v20, v2

    goto :goto_16

    :cond_22
    instance-of v1, v0, Ljava/lang/Integer;

    if-nez v1, :cond_23

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_21

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v20, v2

    const-string v2, "[toRtcStats] \'roundTripTimeMeasurements\' => expected Integer but found "

    invoke-static {v0, v2}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_16

    :cond_23
    move-object/from16 v20, v2

    move-object v6, v0

    :goto_16
    move-object v15, v6

    check-cast v15, Ljava/lang/Integer;

    move-object v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, v10

    move-object v9, v11

    move-object v10, v12

    move-object v11, v13

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    move-object/from16 v12, v18

    move-object/from16 v13, v19

    move-object/from16 v2, v20

    invoke-direct/range {v0 .. v15}, Ln33/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public static final c(Le30/c;Lzy/c;La30/n1;La30/k1;Lzy/c;Lr20/s;Lq20/b;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v10, p8

    move-object/from16 v8, p7

    check-cast v8, Lp1/q;

    const v1, -0x7d0b444

    invoke-virtual {v8, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v10, 0x6

    if-nez v1, :cond_2

    and-int/lit8 v1, v10, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v8, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, v10

    goto :goto_2

    :cond_2
    move v1, v10

    :goto_2
    and-int/lit8 v2, v10, 0x30

    if-nez v2, :cond_4

    move-object/from16 v2, p1

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v1, v4

    goto :goto_4

    :cond_4
    move-object/from16 v2, p1

    :goto_4
    and-int/lit16 v4, v10, 0x180

    if-nez v4, :cond_6

    move-object/from16 v4, p2

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_5

    :cond_5
    const/16 v7, 0x80

    :goto_5
    or-int/2addr v1, v7

    goto :goto_6

    :cond_6
    move-object/from16 v4, p2

    :goto_6
    and-int/lit16 v7, v10, 0xc00

    if-nez v7, :cond_9

    and-int/lit16 v7, v10, 0x1000

    if-nez v7, :cond_7

    invoke-virtual {v8, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_7

    :cond_7
    invoke-virtual {v8, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_7
    if-eqz v7, :cond_8

    const/16 v7, 0x800

    goto :goto_8

    :cond_8
    const/16 v7, 0x400

    :goto_8
    or-int/2addr v1, v7

    :cond_9
    and-int/lit16 v7, v10, 0x6000

    if-nez v7, :cond_b

    move-object/from16 v7, p4

    invoke-virtual {v8, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x4000

    goto :goto_9

    :cond_a
    const/16 v9, 0x2000

    :goto_9
    or-int/2addr v1, v9

    goto :goto_a

    :cond_b
    move-object/from16 v7, p4

    :goto_a
    const/high16 v9, 0x30000

    and-int/2addr v9, v10

    if-nez v9, :cond_e

    const/high16 v9, 0x40000

    and-int/2addr v9, v10

    if-nez v9, :cond_c

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_b

    :cond_c
    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_b
    if-eqz v9, :cond_d

    const/high16 v9, 0x20000

    goto :goto_c

    :cond_d
    const/high16 v9, 0x10000

    :goto_c
    or-int/2addr v1, v9

    :cond_e
    const/high16 v9, 0x180000

    and-int/2addr v9, v10

    if-nez v9, :cond_11

    const/high16 v9, 0x200000

    and-int/2addr v9, v10

    if-nez v9, :cond_f

    invoke-virtual {v8, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_d

    :cond_f
    invoke-virtual {v8, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_d
    if-eqz v9, :cond_10

    const/high16 v9, 0x100000

    goto :goto_e

    :cond_10
    const/high16 v9, 0x80000

    :goto_e
    or-int/2addr v1, v9

    :cond_11
    const v9, 0x92493

    and-int/2addr v1, v9

    const v9, 0x92492

    if-ne v1, v9, :cond_13

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_12

    goto :goto_f

    :cond_12
    invoke-virtual {v8}, Lp1/q;->X()V

    goto/16 :goto_11

    :cond_13
    :goto_f
    invoke-interface {v5}, Lr20/s;->h()Lr20/h;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const v9, -0x1ca9c1ce

    sget-object v7, Lb2/t;->w:Lb2/t;

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v13, 0x0

    if-eqz v1, :cond_18

    const/4 v14, 0x1

    if-ne v1, v14, :cond_17

    const v1, -0x316961ab

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-static {v7, v13, v11}, Landroidx/compose/animation/c;->a(Landroidx/compose/ui/Modifier;Ld0/e2;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v13, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v13, v8, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v12, v8, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v8, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v14, v8, Lp1/q;->S:Z

    if-eqz v14, :cond_14

    invoke-virtual {v8, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_14
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_10
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v8, v14, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v8, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v13, v8, Lp1/q;->S:Z

    if-nez v13, :cond_15

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_16

    :cond_15
    invoke-static {v12, v8, v12, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v8, v11, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    const v9, 0xe00008

    move-object v1, v2

    move-object v2, v4

    move-object/from16 v4, p4

    invoke-static/range {v0 .. v9}, Lds/p;->d(Le30/c;Lzy/c;La30/n1;La30/k1;Lzy/c;Lr20/s;Lq20/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    const/4 v12, 0x0

    invoke-static {v8, v12, v0, v12}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_11

    :cond_17
    const v0, 0x69c2af1c

    invoke-static {v0, v8, v12}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_18
    const v0, -0x316b58ef

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-static {v7, v13, v11}, Landroidx/compose/animation/c;->a(Landroidx/compose/ui/Modifier;Ld0/e2;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    const v9, 0x200008

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    invoke-static/range {v0 .. v9}, Lds/p;->d(Le30/c;Lzy/c;La30/n1;La30/k1;Lzy/c;Lr20/s;Lq20/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_19

    new-instance v0, Lb30/u2;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move v8, v10

    invoke-direct/range {v0 .. v8}, Lb30/u2;-><init>(Le30/c;Lzy/c;La30/n1;La30/k1;Lzy/c;Lr20/s;Lq20/b;I)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method public static final c0(Lorg/webrtc/RTCStats;)Ln33/o;
    .locals 21

    new-instance v0, Ln33/o;

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const-string v4, "ssrc"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "RtcParser"

    const/4 v6, 0x0

    if-nez v4, :cond_1

    :cond_0
    :goto_0
    move-object v4, v6

    goto :goto_1

    :cond_1
    instance-of v7, v4, Ljava/lang/Long;

    if-nez v7, :cond_2

    sget-object v7, Lb23/i;->a:Lb23/i;

    sget-object v7, Lb23/i;->d:Lb23/e;

    sget-object v8, Lb23/g;->E:Lb23/g;

    invoke-interface {v7, v8, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    sget-object v7, Lb23/i;->c:Lb23/j;

    const-string v9, "[toRtcStats] \'ssrc\' => expected Long but found "

    invoke-static {v4, v9}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v7, v8, v5, v4, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    :goto_1
    check-cast v4, Ljava/lang/Long;

    const-string v7, "kind"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_4

    :cond_3
    :goto_2
    move-object v7, v6

    goto :goto_3

    :cond_4
    instance-of v8, v7, Ljava/lang/String;

    if-nez v8, :cond_5

    sget-object v8, Lb23/i;->a:Lb23/i;

    sget-object v8, Lb23/i;->d:Lb23/e;

    sget-object v9, Lb23/g;->E:Lb23/g;

    invoke-interface {v8, v9, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    sget-object v8, Lb23/i;->c:Lb23/j;

    const-string v10, "[toRtcStats] \'kind\' => expected String but found "

    invoke-static {v7, v10}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v9, v5, v7, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_5
    :goto_3
    check-cast v7, Ljava/lang/String;

    const-string v8, "transportId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_7

    :cond_6
    :goto_4
    move-object v8, v6

    goto :goto_5

    :cond_7
    instance-of v9, v8, Ljava/lang/String;

    if-nez v9, :cond_8

    sget-object v9, Lb23/i;->a:Lb23/i;

    sget-object v9, Lb23/i;->d:Lb23/e;

    sget-object v10, Lb23/g;->E:Lb23/g;

    invoke-interface {v9, v10, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    sget-object v9, Lb23/i;->c:Lb23/j;

    const-string v11, "[toRtcStats] \'transportId\' => expected String but found "

    invoke-static {v8, v11}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v9, v10, v5, v8, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_8
    :goto_5
    check-cast v8, Ljava/lang/String;

    const-string v9, "codecId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_a

    :cond_9
    :goto_6
    move-object v9, v6

    goto :goto_7

    :cond_a
    instance-of v10, v9, Ljava/lang/String;

    if-nez v10, :cond_b

    sget-object v10, Lb23/i;->a:Lb23/i;

    sget-object v10, Lb23/i;->d:Lb23/e;

    sget-object v11, Lb23/g;->E:Lb23/g;

    invoke-interface {v10, v11, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    sget-object v10, Lb23/i;->c:Lb23/j;

    const-string v12, "[toRtcStats] \'codecId\' => expected String but found "

    invoke-static {v9, v12}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v10, v11, v5, v9, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_b
    :goto_7
    check-cast v9, Ljava/lang/String;

    const-string v10, "packetsSent"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_d

    :cond_c
    :goto_8
    move-object v10, v6

    goto :goto_9

    :cond_d
    instance-of v11, v10, Ljava/math/BigInteger;

    if-nez v11, :cond_e

    sget-object v11, Lb23/i;->a:Lb23/i;

    sget-object v11, Lb23/i;->d:Lb23/e;

    sget-object v12, Lb23/g;->E:Lb23/g;

    invoke-interface {v11, v12, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_c

    sget-object v11, Lb23/i;->c:Lb23/j;

    const-string v13, "[toRtcStats] \'packetsSent\' => expected BigInteger but found "

    invoke-static {v10, v13}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v11, v12, v5, v10, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_8

    :cond_e
    :goto_9
    check-cast v10, Ljava/math/BigInteger;

    const-string v11, "packetsLost"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_10

    :cond_f
    :goto_a
    move-object v11, v6

    goto :goto_b

    :cond_10
    instance-of v12, v11, Ljava/math/BigInteger;

    if-nez v12, :cond_11

    sget-object v12, Lb23/i;->a:Lb23/i;

    sget-object v12, Lb23/i;->d:Lb23/e;

    sget-object v13, Lb23/g;->E:Lb23/g;

    invoke-interface {v12, v13, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_f

    sget-object v12, Lb23/i;->c:Lb23/j;

    const-string v14, "[toRtcStats] \'packetsLost\' => expected BigInteger but found "

    invoke-static {v11, v14}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v12, v13, v5, v11, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_a

    :cond_11
    :goto_b
    check-cast v11, Ljava/math/BigInteger;

    const-string v12, "localId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_13

    :cond_12
    :goto_c
    move-object v12, v6

    goto :goto_d

    :cond_13
    instance-of v13, v12, Ljava/lang/String;

    if-nez v13, :cond_14

    sget-object v13, Lb23/i;->a:Lb23/i;

    sget-object v13, Lb23/i;->d:Lb23/e;

    sget-object v14, Lb23/g;->E:Lb23/g;

    invoke-interface {v13, v14, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_12

    sget-object v13, Lb23/i;->c:Lb23/j;

    const-string v15, "[toRtcStats] \'localId\' => expected String but found "

    invoke-static {v12, v15}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v13, v14, v5, v12, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_c

    :cond_14
    :goto_d
    check-cast v12, Ljava/lang/String;

    const-string v13, "remoteTimestamp"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_16

    :cond_15
    move-object/from16 v16, v0

    :goto_e
    move-object v13, v6

    goto :goto_f

    :cond_16
    instance-of v14, v13, Ljava/lang/Double;

    if-nez v14, :cond_17

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_15

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v16, v0

    const-string v0, "[toRtcStats] \'remoteTimestamp\' => expected Double but found "

    invoke-static {v13, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_e

    :cond_17
    move-object/from16 v16, v0

    :goto_f
    check-cast v13, Ljava/lang/Double;

    const-string v0, "reportsSent"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_19

    :cond_18
    move-object/from16 v17, v1

    :goto_10
    move-object v0, v6

    goto :goto_11

    :cond_19
    instance-of v14, v0, Ljava/math/BigInteger;

    if-nez v14, :cond_1a

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_18

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v17, v1

    const-string v1, "[toRtcStats] \'reportsSent\' => expected BigInteger but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_10

    :cond_1a
    move-object/from16 v17, v1

    :goto_11
    check-cast v0, Ljava/math/BigInteger;

    const-string v1, "roundTripTime"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1c

    :cond_1b
    move-object/from16 v18, v0

    :goto_12
    move-object v1, v6

    goto :goto_13

    :cond_1c
    instance-of v14, v1, Ljava/lang/Double;

    if-nez v14, :cond_1d

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1b

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v18, v0

    const-string v0, "[toRtcStats] \'roundTripTime\' => expected Double but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_12

    :cond_1d
    move-object/from16 v18, v0

    :goto_13
    check-cast v1, Ljava/lang/Double;

    const-string v0, "totalRoundTripTime"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1f

    :cond_1e
    move-object/from16 v19, v1

    :goto_14
    move-object v0, v6

    goto :goto_15

    :cond_1f
    instance-of v14, v0, Ljava/lang/Double;

    if-nez v14, :cond_20

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1e

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v19, v1

    const-string v1, "[toRtcStats] \'totalRoundTripTime\' => expected Double but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_14

    :cond_20
    move-object/from16 v19, v1

    :goto_15
    move-object v14, v0

    check-cast v14, Ljava/lang/Double;

    const-string v0, "roundTripTimeMeasurements"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_22

    :cond_21
    move-object/from16 v20, v2

    goto :goto_16

    :cond_22
    instance-of v1, v0, Ljava/math/BigInteger;

    if-nez v1, :cond_23

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_21

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v20, v2

    const-string v2, "[toRtcStats] \'roundTripTimeMeasurements\' => expected BigInteger but found "

    invoke-static {v0, v2}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_16

    :cond_23
    move-object/from16 v20, v2

    move-object v6, v0

    :goto_16
    move-object v15, v6

    check-cast v15, Ljava/math/BigInteger;

    move-object v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, v10

    move-object v9, v11

    move-object v10, v12

    move-object v11, v13

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    move-object/from16 v12, v18

    move-object/from16 v13, v19

    move-object/from16 v2, v20

    invoke-direct/range {v0 .. v15}, Ln33/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/String;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;)V

    return-object v0
.end method

.method public static final d(Le30/c;Lzy/c;La30/n1;La30/k1;Lzy/c;Lr20/s;Lq20/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 36

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v0, p4

    move-object/from16 v13, p5

    move-object/from16 v14, p6

    move-object/from16 v8, p7

    move/from16 v15, p9

    move-object/from16 v11, p8

    check-cast v11, Lp1/q;

    const v5, 0x472057cf

    invoke-virtual {v11, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v15, 0x6

    if-nez v5, :cond_2

    and-int/lit8 v5, v15, 0x8

    if-nez v5, :cond_0

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_0
    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_1

    :cond_1
    const/4 v5, 0x2

    :goto_1
    or-int/2addr v5, v15

    goto :goto_2

    :cond_2
    move v5, v15

    :goto_2
    and-int/lit8 v6, v15, 0x30

    const/16 v7, 0x10

    if-nez v6, :cond_4

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    move v6, v7

    :goto_3
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v15, 0x180

    if-nez v6, :cond_6

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v5, v6

    :cond_6
    and-int/lit16 v6, v15, 0xc00

    if-nez v6, :cond_9

    and-int/lit16 v6, v15, 0x1000

    if-nez v6, :cond_7

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_5

    :cond_7
    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_5
    if-eqz v6, :cond_8

    const/16 v6, 0x800

    goto :goto_6

    :cond_8
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v5, v6

    :cond_9
    and-int/lit16 v6, v15, 0x6000

    if-nez v6, :cond_b

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    const/16 v6, 0x4000

    goto :goto_7

    :cond_a
    const/16 v6, 0x2000

    :goto_7
    or-int/2addr v5, v6

    :cond_b
    const/high16 v6, 0x30000

    and-int/2addr v6, v15

    if-nez v6, :cond_e

    const/high16 v6, 0x40000

    and-int/2addr v6, v15

    if-nez v6, :cond_c

    invoke-virtual {v11, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_8

    :cond_c
    invoke-virtual {v11, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_8
    if-eqz v6, :cond_d

    const/high16 v6, 0x20000

    goto :goto_9

    :cond_d
    const/high16 v6, 0x10000

    :goto_9
    or-int/2addr v5, v6

    :cond_e
    const/high16 v6, 0x180000

    and-int/2addr v6, v15

    if-nez v6, :cond_11

    const/high16 v6, 0x200000

    and-int/2addr v6, v15

    if-nez v6, :cond_f

    invoke-virtual {v11, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_a

    :cond_f
    invoke-virtual {v11, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_a
    if-eqz v6, :cond_10

    const/high16 v6, 0x100000

    goto :goto_b

    :cond_10
    const/high16 v6, 0x80000

    :goto_b
    or-int/2addr v5, v6

    :cond_11
    const/high16 v6, 0xc00000

    and-int/2addr v6, v15

    if-nez v6, :cond_13

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_12

    const/high16 v6, 0x800000

    goto :goto_c

    :cond_12
    const/high16 v6, 0x400000

    :goto_c
    or-int/2addr v5, v6

    :cond_13
    move/from16 v16, v5

    const v5, 0x492493

    and-int v5, v16, v5

    const v6, 0x492492

    if-ne v5, v6, :cond_15

    invoke-virtual {v11}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_14

    goto :goto_d

    :cond_14
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v8, v11

    goto/16 :goto_23

    :cond_15
    :goto_d
    sget-object v5, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v5

    invoke-interface {v13}, Lr20/s;->i()F

    move-result v9

    const/4 v10, 0x7

    const/4 v6, 0x0

    move/from16 v17, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v15, v5

    move/from16 v12, v17

    move-object/from16 v5, p7

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v8, 0x0

    invoke-static {v5, v7, v11, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-eqz v8, :cond_16

    invoke-virtual {v11, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_16
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_e
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v11, v8, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v11, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v4, v11, Lp1/q;->S:Z

    if-nez v4, :cond_17

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v19, v5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_18

    goto :goto_f

    :cond_17
    move-object/from16 v19, v5

    :goto_f
    invoke-static {v10, v11, v10, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v11, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v5, 0x3b4ba189

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    sget-object v20, Lb2/t;->w:Lb2/t;

    if-nez v2, :cond_19

    const/4 v10, 0x0

    goto :goto_10

    :cond_19
    invoke-static {v2, v11}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x10

    int-to-float v6, v6

    const/16 v25, 0x7

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move/from16 v24, v6

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v15, v6}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v10, 0x0

    invoke-static {v5, v6, v11, v10, v10}, Ls/s;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    :goto_10
    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    const v5, 0x3b4bc287

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    if-nez v3, :cond_1a

    move-object/from16 v31, v4

    move-object/from16 v27, v7

    move-object/from16 v28, v8

    move-object/from16 v29, v9

    move v0, v10

    move-object/from16 v30, v12

    move-object/from16 v26, v19

    move-object/from16 v2, v20

    :goto_11
    move-object v8, v11

    goto :goto_12

    :cond_1a
    invoke-interface/range {p5 .. p5}, Lr20/s;->x()F

    move-result v5

    invoke-interface/range {p5 .. p5}, Lr20/s;->m()F

    move-result v6

    sub-float v24, v5, v6

    iget-object v5, v3, La30/n1;->h:Lc93/a;

    iget-object v6, v3, La30/n1;->i:Lc93/a;

    move-object/from16 v17, v7

    invoke-interface/range {p5 .. p5}, Lr20/s;->x()F

    move-result v7

    const/16 v23, 0x0

    const/16 v25, 0x7

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v18

    move-object/from16 v2, v20

    move-object/from16 v20, v9

    new-instance v9, Lv00/j0;

    iget-object v10, v1, Le30/c;->w:Lh20/x1;

    iget-object v10, v10, Lh20/x1;->P:Lh20/t1;

    invoke-direct {v9, v10}, Lv00/j0;-><init>(Lh20/t1;)V

    iget-object v10, v3, La30/n1;->f:Lux/b;

    shr-int/lit8 v22, v16, 0x6

    and-int/lit8 v22, v22, 0x70

    move-object/from16 v31, v4

    move-object/from16 v28, v8

    move-object/from16 v30, v12

    move-object/from16 v27, v17

    move-object/from16 v8, v18

    move-object/from16 v26, v19

    move-object/from16 v29, v20

    move/from16 v12, v22

    const/4 v0, 0x0

    move-object/from16 v4, p3

    invoke-static/range {v3 .. v12}, Lds/p;->p(La30/n1;La30/k1;Lc93/a;Lc93/a;FLandroidx/compose/ui/Modifier;Lv00/j0;Lux/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_11

    :goto_12
    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v4, v26

    move-object/from16 v5, v27

    invoke-static {v4, v5, v8, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v8, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_1b

    invoke-virtual {v8, v13}, Lp1/q;->l(Lc93/a;)V

    :goto_13
    move-object/from16 v11, v28

    goto :goto_14

    :cond_1b
    invoke-virtual {v8}, Lp1/q;->s0()V

    goto :goto_13

    :goto_14
    invoke-static {v8, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v12, v29

    invoke-static {v8, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-nez v4, :cond_1c

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1d

    :cond_1c
    move-object/from16 v4, v30

    goto :goto_16

    :cond_1d
    move-object/from16 v4, v30

    :goto_15
    move-object/from16 v5, v31

    goto :goto_17

    :goto_16
    invoke-static {v5, v8, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_15

    :goto_17
    invoke-static {v8, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v3, v1, Le30/c;->x:Lk20/a;

    new-instance v6, Lay/n;

    move-object/from16 v7, p5

    const/4 v9, 0x2

    invoke-direct {v6, v7, v9}, Lay/n;-><init>(Ljava/lang/Object;I)V

    const v10, -0x807df65

    invoke-static {v10, v8, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const/16 v10, 0x30

    invoke-static {v3, v6, v8, v10}, Lio/sentry/config/a;->e(Lk20/a;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    const/4 v3, 0x1

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    const v6, 0x3b4c3736

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    if-eqz v14, :cond_1e

    iget-boolean v6, v14, Lq20/b;->b:Z

    if-ne v6, v3, :cond_1e

    move v6, v3

    goto :goto_18

    :cond_1e
    move v6, v0

    :goto_18
    const-string v10, "PAYMENT_SHEET_MANDATE_TEXT_TEST_TAG"

    move-object/from16 v31, v5

    const/16 v5, 0x8

    const/16 v17, 0x0

    if-eqz v6, :cond_20

    invoke-interface {v7}, Lr20/s;->s()Z

    move-result v6

    if-eqz v6, :cond_20

    iget-object v6, v14, Lq20/b;->a:Lzy/c;

    const v3, 0x3b4c4af0

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    if-nez v6, :cond_1f

    move-object/from16 v3, v17

    goto :goto_19

    :cond_1f
    invoke-static {v6, v8}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v3

    :goto_19
    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    invoke-static {v15, v2}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    int-to-float v6, v5

    const/16 v23, 0x7

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move/from16 v22, v6

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6, v10}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move/from16 v32, v9

    const/4 v9, 0x0

    move-object/from16 v18, v10

    const/16 v10, 0x1c

    move/from16 v19, v5

    const/4 v5, 0x0

    move-object/from16 v30, v4

    move-object v4, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v35, v18

    move-object/from16 v33, v30

    move-object/from16 v34, v31

    invoke-static/range {v3 .. v10}, Ls2/a;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILjava/util/Map;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1a

    :cond_20
    move-object/from16 v33, v4

    move-object/from16 v35, v10

    move-object/from16 v34, v31

    :goto_1a
    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    const v3, 0x3b4c6ad1

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    if-nez p4, :cond_21

    move-object/from16 v3, p4

    const/16 v6, 0x8

    goto :goto_1b

    :cond_21
    move-object/from16 v3, p4

    invoke-static {v3, v8}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v15, v2}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    const/4 v9, 0x2

    int-to-float v5, v9

    const/16 v6, 0x8

    int-to-float v7, v6

    const/16 v23, 0x5

    const/16 v19, 0x0

    const/16 v21, 0x0

    move/from16 v20, v5

    move/from16 v22, v7

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-string v7, "PAYMENT_SHEET_ERROR"

    invoke-static {v5, v7}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v4, v5, v8, v0}, Lvd/f;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_1b
    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    const/4 v4, 0x1

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    and-int/lit8 v5, v16, 0xe

    or-int/2addr v5, v6

    invoke-static {v1, v8, v5}, Lds/p;->j(Le30/c;Landroidx/compose/runtime/Composer;I)V

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    move-object/from16 v10, p7

    invoke-static {v8, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-eqz v6, :cond_22

    invoke-virtual {v8, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1c

    :cond_22
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1c
    invoke-static {v8, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v12, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-nez v5, :cond_23

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_24

    :cond_23
    move-object/from16 v5, v33

    goto :goto_1e

    :cond_24
    :goto_1d
    move-object/from16 v5, v34

    goto :goto_1f

    :goto_1e
    invoke-static {v7, v8, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_1d

    :goto_1f
    invoke-static {v8, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, 0x3b4c9a14

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    if-eqz v14, :cond_25

    iget-boolean v4, v14, Lq20/b;->b:Z

    if-nez v4, :cond_25

    const/4 v4, 0x1

    goto :goto_20

    :cond_25
    move v4, v0

    :goto_20
    if-eqz v4, :cond_27

    invoke-interface/range {p5 .. p5}, Lr20/s;->s()Z

    move-result v4

    if-eqz v4, :cond_27

    iget-object v4, v14, Lq20/b;->a:Lzy/c;

    const v5, 0x3b4cadf0

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    if-nez v4, :cond_26

    goto :goto_21

    :cond_26
    invoke-static {v4, v8}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v17

    :goto_21
    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    const/16 v6, 0x8

    int-to-float v4, v6

    const/16 v24, 0x0

    const/16 v25, 0xd

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v20, v2

    move/from16 v22, v4

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v15, v2}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v4, v35

    invoke-static {v2, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v9, 0x0

    const/16 v10, 0x1c

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v3, v17

    const/4 v2, 0x1

    invoke-static/range {v3 .. v10}, Ls2/a;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILjava/util/Map;Landroidx/compose/runtime/Composer;II)V

    goto :goto_22

    :cond_27
    const/4 v2, 0x1

    :goto_22
    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    :goto_23
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_28

    new-instance v0, Lb30/u;

    const/4 v10, 0x1

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v9, p9

    move-object v7, v14

    invoke-direct/range {v0 .. v10}, Lb30/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_28
    return-void
.end method

.method public static final d0(Lorg/webrtc/RTCStats;)Ln33/p;
    .locals 21

    new-instance v0, Ln33/p;

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const-string v4, "ssrc"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "RtcParser"

    const/4 v6, 0x0

    if-nez v4, :cond_1

    :cond_0
    :goto_0
    move-object v4, v6

    goto :goto_1

    :cond_1
    instance-of v7, v4, Ljava/lang/Long;

    if-nez v7, :cond_2

    sget-object v7, Lb23/i;->a:Lb23/i;

    sget-object v7, Lb23/i;->d:Lb23/e;

    sget-object v8, Lb23/g;->E:Lb23/g;

    invoke-interface {v7, v8, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    sget-object v7, Lb23/i;->c:Lb23/j;

    const-string v9, "[toRtcStats] \'ssrc\' => expected Long but found "

    invoke-static {v4, v9}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v7, v8, v5, v4, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    :goto_1
    check-cast v4, Ljava/lang/Long;

    const-string v7, "kind"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_4

    :cond_3
    :goto_2
    move-object v7, v6

    goto :goto_3

    :cond_4
    instance-of v8, v7, Ljava/lang/String;

    if-nez v8, :cond_5

    sget-object v8, Lb23/i;->a:Lb23/i;

    sget-object v8, Lb23/i;->d:Lb23/e;

    sget-object v9, Lb23/g;->E:Lb23/g;

    invoke-interface {v8, v9, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    sget-object v8, Lb23/i;->c:Lb23/j;

    const-string v10, "[toRtcStats] \'kind\' => expected String but found "

    invoke-static {v7, v10}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v9, v5, v7, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_5
    :goto_3
    check-cast v7, Ljava/lang/String;

    const-string v8, "transportId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_7

    :cond_6
    :goto_4
    move-object v8, v6

    goto :goto_5

    :cond_7
    instance-of v9, v8, Ljava/lang/String;

    if-nez v9, :cond_8

    sget-object v9, Lb23/i;->a:Lb23/i;

    sget-object v9, Lb23/i;->d:Lb23/e;

    sget-object v10, Lb23/g;->E:Lb23/g;

    invoke-interface {v9, v10, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    sget-object v9, Lb23/i;->c:Lb23/j;

    const-string v11, "[toRtcStats] \'transportId\' => expected String but found "

    invoke-static {v8, v11}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v9, v10, v5, v8, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_8
    :goto_5
    check-cast v8, Ljava/lang/String;

    const-string v9, "codecId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_a

    :cond_9
    :goto_6
    move-object v9, v6

    goto :goto_7

    :cond_a
    instance-of v10, v9, Ljava/lang/String;

    if-nez v10, :cond_b

    sget-object v10, Lb23/i;->a:Lb23/i;

    sget-object v10, Lb23/i;->d:Lb23/e;

    sget-object v11, Lb23/g;->E:Lb23/g;

    invoke-interface {v10, v11, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    sget-object v10, Lb23/i;->c:Lb23/j;

    const-string v12, "[toRtcStats] \'codecId\' => expected String but found "

    invoke-static {v9, v12}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v10, v11, v5, v9, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_b
    :goto_7
    check-cast v9, Ljava/lang/String;

    const-string v10, "packetsSent"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_d

    :cond_c
    :goto_8
    move-object v10, v6

    goto :goto_9

    :cond_d
    instance-of v11, v10, Ljava/math/BigInteger;

    if-nez v11, :cond_e

    sget-object v11, Lb23/i;->a:Lb23/i;

    sget-object v11, Lb23/i;->d:Lb23/e;

    sget-object v12, Lb23/g;->E:Lb23/g;

    invoke-interface {v11, v12, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_c

    sget-object v11, Lb23/i;->c:Lb23/j;

    const-string v13, "[toRtcStats] \'packetsSent\' => expected BigInteger but found "

    invoke-static {v10, v13}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v11, v12, v5, v10, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_8

    :cond_e
    :goto_9
    check-cast v10, Ljava/math/BigInteger;

    const-string v11, "packetsLost"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_10

    :cond_f
    :goto_a
    move-object v11, v6

    goto :goto_b

    :cond_10
    instance-of v12, v11, Ljava/math/BigInteger;

    if-nez v12, :cond_11

    sget-object v12, Lb23/i;->a:Lb23/i;

    sget-object v12, Lb23/i;->d:Lb23/e;

    sget-object v13, Lb23/g;->E:Lb23/g;

    invoke-interface {v12, v13, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_f

    sget-object v12, Lb23/i;->c:Lb23/j;

    const-string v14, "[toRtcStats] \'packetsLost\' => expected BigInteger but found "

    invoke-static {v11, v14}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v12, v13, v5, v11, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_a

    :cond_11
    :goto_b
    check-cast v11, Ljava/math/BigInteger;

    const-string v12, "localId"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_13

    :cond_12
    :goto_c
    move-object v12, v6

    goto :goto_d

    :cond_13
    instance-of v13, v12, Ljava/lang/String;

    if-nez v13, :cond_14

    sget-object v13, Lb23/i;->a:Lb23/i;

    sget-object v13, Lb23/i;->d:Lb23/e;

    sget-object v14, Lb23/g;->E:Lb23/g;

    invoke-interface {v13, v14, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_12

    sget-object v13, Lb23/i;->c:Lb23/j;

    const-string v15, "[toRtcStats] \'localId\' => expected String but found "

    invoke-static {v12, v15}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v13, v14, v5, v12, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_c

    :cond_14
    :goto_d
    check-cast v12, Ljava/lang/String;

    const-string v13, "remoteTimestamp"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_16

    :cond_15
    move-object/from16 v16, v0

    :goto_e
    move-object v13, v6

    goto :goto_f

    :cond_16
    instance-of v14, v13, Ljava/lang/Double;

    if-nez v14, :cond_17

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_15

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v16, v0

    const-string v0, "[toRtcStats] \'remoteTimestamp\' => expected Double but found "

    invoke-static {v13, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_e

    :cond_17
    move-object/from16 v16, v0

    :goto_f
    check-cast v13, Ljava/lang/Double;

    const-string v0, "reportsSent"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_19

    :cond_18
    move-object/from16 v17, v1

    :goto_10
    move-object v0, v6

    goto :goto_11

    :cond_19
    instance-of v14, v0, Ljava/math/BigInteger;

    if-nez v14, :cond_1a

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_18

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v17, v1

    const-string v1, "[toRtcStats] \'reportsSent\' => expected BigInteger but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_10

    :cond_1a
    move-object/from16 v17, v1

    :goto_11
    check-cast v0, Ljava/math/BigInteger;

    const-string v1, "roundTripTime"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1c

    :cond_1b
    move-object/from16 v18, v0

    :goto_12
    move-object v1, v6

    goto :goto_13

    :cond_1c
    instance-of v14, v1, Ljava/lang/Double;

    if-nez v14, :cond_1d

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1b

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v18, v0

    const-string v0, "[toRtcStats] \'roundTripTime\' => expected Double but found "

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_12

    :cond_1d
    move-object/from16 v18, v0

    :goto_13
    check-cast v1, Ljava/lang/Double;

    const-string v0, "totalRoundTripTime"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1f

    :cond_1e
    move-object/from16 v19, v1

    :goto_14
    move-object v0, v6

    goto :goto_15

    :cond_1f
    instance-of v14, v0, Ljava/lang/Double;

    if-nez v14, :cond_20

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1e

    sget-object v14, Lb23/i;->c:Lb23/j;

    move-object/from16 v19, v1

    const-string v1, "[toRtcStats] \'totalRoundTripTime\' => expected Double but found "

    invoke-static {v0, v1}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v14, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_14

    :cond_20
    move-object/from16 v19, v1

    :goto_15
    move-object v14, v0

    check-cast v14, Ljava/lang/Double;

    const-string v0, "roundTripTimeMeasurements"

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_22

    :cond_21
    move-object/from16 v20, v2

    goto :goto_16

    :cond_22
    instance-of v1, v0, Ljava/math/BigInteger;

    if-nez v1, :cond_23

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v15, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_21

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v20, v2

    const-string v2, "[toRtcStats] \'roundTripTimeMeasurements\' => expected BigInteger but found "

    invoke-static {v0, v2}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v15, v5, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_16

    :cond_23
    move-object/from16 v20, v2

    move-object v6, v0

    :goto_16
    move-object v15, v6

    check-cast v15, Ljava/math/BigInteger;

    move-object v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, v10

    move-object v9, v11

    move-object v10, v12

    move-object v11, v13

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    move-object/from16 v12, v18

    move-object/from16 v13, v19

    move-object/from16 v2, v20

    invoke-direct/range {v0 .. v15}, Ln33/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/String;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;)V

    return-object v0
.end method

.method public static final e(FILandroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p2, Lp1/q;

    const v0, 0x57928e3f

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v2, p1, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p1, 0x6

    if-nez v2, :cond_2

    invoke-virtual {p2, p0}, Lp1/q;->d(F)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    or-int/2addr v2, p1

    goto :goto_1

    :cond_2
    move v2, p1

    :goto_1
    and-int/lit8 v2, v2, 0x3

    if-ne v2, v1, :cond_4

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v1, 0x0

    if-eqz v0, :cond_5

    int-to-float p0, v1

    :cond_5
    sget-object v0, Ld40/p;->f:Ld40/g;

    iget v0, v0, Ld40/g;->d:F

    sub-float/2addr v0, p0

    int-to-float v1, v1

    cmpg-float v2, v0, v1

    if-gez v2, :cond_6

    move v0, v1

    :cond_6
    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->k(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {p2, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    :goto_3
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v0, Lc30/a;

    invoke-direct {v0, p0, p1, p3}, Lc30/a;-><init>(FII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final e0(Lorg/webrtc/RTCStatsReport;)Ljava/util/HashMap;
    .locals 52

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lorg/webrtc/RTCStatsReport;->getStatsMap()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/webrtc/RTCStats;

    sget-object v3, Lo33/c;->x:Lng3/n;

    invoke-virtual {v2}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lo33/c;->values()[Lo33/c;

    move-result-object v3

    array-length v5, v3

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_1

    aget-object v8, v3, v6

    iget-object v9, v8, Lo33/c;->w:Ljava/lang/String;

    invoke-virtual {v9, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_2
    if-nez v8, :cond_2

    sget-object v8, Lo33/c;->y:Lo33/c;

    :cond_2
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    const-string v4, "[toRtcStats] \'totalSamplesDuration\' => expected Double but found "

    const-string v5, "totalSamplesDuration"

    const-string v6, "[toRtcStats] \'totalAudioEnergy\' => expected Double but found "

    const-string v9, "totalAudioEnergy"

    const-string v10, "[toRtcStats] \'audioLevel\' => expected Double but found "

    const-string v11, "audioLevel"

    const-string v12, "kind"

    const-string v13, "[toRtcStats] \'kind\' => expected String but found "

    const-string v14, "trackIdentifier"

    const-string v15, "[toRtcStats] \'trackIdentifier\' => expected String but found "

    const-string v7, "RtcParser"

    move-object/from16 v16, v1

    const/16 v18, -0x1

    packed-switch v3, :pswitch_data_0

    move-object/from16 v21, v0

    :goto_3
    move-object/from16 v22, v8

    :cond_3
    :goto_4
    const/4 v7, 0x0

    goto/16 :goto_99

    :pswitch_0
    invoke-virtual {v2}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_4

    move-object/from16 v21, v0

    move-object/from16 v20, v2

    :goto_5
    const/4 v3, 0x0

    goto :goto_6

    :cond_4
    instance-of v1, v3, Ljava/lang/String;

    if-nez v1, :cond_6

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    move-object/from16 v20, v2

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-static {v3, v13}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v21, v0

    const/4 v0, 0x0

    invoke-interface {v1, v2, v7, v3, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_5

    :cond_5
    move-object/from16 v21, v0

    goto :goto_5

    :cond_6
    move-object/from16 v21, v0

    move-object/from16 v20, v2

    :goto_6
    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_7

    sget-object v0, Lo33/a;->x:Lng3/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Lng3/n;->i(Ljava/lang/String;)Lo33/a;

    move-result-object v0

    goto :goto_7

    :cond_7
    const/4 v0, 0x0

    :goto_7
    if-nez v0, :cond_8

    :goto_8
    move/from16 v0, v18

    const/4 v1, 0x1

    goto :goto_9

    :cond_8
    sget-object v1, Lm33/a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v18, v1, v0

    goto :goto_8

    :goto_9
    if-eq v0, v1, :cond_a

    const/4 v1, 0x2

    if-eq v0, v1, :cond_9

    goto :goto_3

    :cond_9
    invoke-static/range {v20 .. v20}, Lds/p;->f0(Lorg/webrtc/RTCStats;)Ln33/r;

    move-result-object v7

    :goto_a
    move-object/from16 v22, v8

    goto/16 :goto_99

    :cond_a
    new-instance v22, Ln33/a;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getId()Ljava/lang/String;

    move-result-object v23

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v25

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_c

    :cond_b
    :goto_b
    const/4 v0, 0x0

    goto :goto_c

    :cond_c
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_d

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-static {v0, v13}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v7, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_b

    :cond_d
    :goto_c
    move-object/from16 v26, v0

    check-cast v26, Ljava/lang/String;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_f

    :cond_e
    :goto_d
    const/4 v0, 0x0

    goto :goto_e

    :cond_f
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_10

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-static {v0, v15}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v7, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_d

    :cond_10
    :goto_e
    move-object/from16 v27, v0

    check-cast v27, Ljava/lang/String;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_12

    :cond_11
    :goto_f
    const/4 v0, 0x0

    goto :goto_10

    :cond_12
    instance-of v1, v0, Ljava/lang/Double;

    if-nez v1, :cond_13

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-static {v0, v10}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v7, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_f

    :cond_13
    :goto_10
    move-object/from16 v28, v0

    check-cast v28, Ljava/lang/Double;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_15

    :cond_14
    :goto_11
    const/4 v0, 0x0

    goto :goto_12

    :cond_15
    instance-of v1, v0, Ljava/lang/Double;

    if-nez v1, :cond_16

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_14

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-static {v0, v6}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v7, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_11

    :cond_16
    :goto_12
    move-object/from16 v29, v0

    check-cast v29, Ljava/lang/Double;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_18

    :cond_17
    :goto_13
    const/4 v0, 0x0

    goto :goto_14

    :cond_18
    instance-of v1, v0, Ljava/lang/Double;

    if-nez v1, :cond_19

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_17

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-static {v0, v4}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v7, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_13

    :cond_19
    :goto_14
    move-object/from16 v30, v0

    check-cast v30, Ljava/lang/Double;

    const-string v0, "echoReturnLoss"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1b

    :cond_1a
    :goto_15
    const/4 v0, 0x0

    goto :goto_16

    :cond_1b
    instance-of v1, v0, Ljava/lang/Double;

    if-nez v1, :cond_1c

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1a

    sget-object v1, Lb23/i;->c:Lb23/j;

    const-string v3, "[toRtcStats] \'echoReturnLoss\' => expected Double but found "

    invoke-static {v0, v3}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v7, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_15

    :cond_1c
    :goto_16
    move-object/from16 v31, v0

    check-cast v31, Ljava/lang/Double;

    const-string v0, "echoReturnLossEnhancement"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1e

    :cond_1d
    :goto_17
    const/4 v0, 0x0

    goto :goto_18

    :cond_1e
    instance-of v1, v0, Ljava/lang/Double;

    if-nez v1, :cond_1f

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1d

    sget-object v1, Lb23/i;->c:Lb23/j;

    const-string v3, "[toRtcStats] \'echoReturnLossEnhancement\' => expected Double but found "

    invoke-static {v0, v3}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v7, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_17

    :cond_1f
    :goto_18
    move-object/from16 v32, v0

    check-cast v32, Ljava/lang/Double;

    const-string v0, "droppedSamplesDuration"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_21

    :cond_20
    :goto_19
    const/4 v0, 0x0

    goto :goto_1a

    :cond_21
    instance-of v1, v0, Ljava/lang/Double;

    if-nez v1, :cond_22

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_20

    sget-object v1, Lb23/i;->c:Lb23/j;

    const-string v3, "[toRtcStats] \'droppedSamplesDuration\' => expected Double but found "

    invoke-static {v0, v3}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v7, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_19

    :cond_22
    :goto_1a
    move-object/from16 v33, v0

    check-cast v33, Ljava/lang/Double;

    const-string v0, "droppedSamplesEvents"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_24

    :cond_23
    :goto_1b
    const/4 v0, 0x0

    goto :goto_1c

    :cond_24
    instance-of v1, v0, Ljava/lang/Long;

    if-nez v1, :cond_25

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_23

    sget-object v1, Lb23/i;->c:Lb23/j;

    const-string v3, "[toRtcStats] \'droppedSamplesEvents\' => expected Long but found "

    invoke-static {v0, v3}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v7, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1b

    :cond_25
    :goto_1c
    move-object/from16 v34, v0

    check-cast v34, Ljava/lang/Long;

    const-string v0, "totalCaptureDelay"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_27

    :cond_26
    :goto_1d
    const/4 v0, 0x0

    goto :goto_1e

    :cond_27
    instance-of v1, v0, Ljava/lang/Double;

    if-nez v1, :cond_28

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_26

    sget-object v1, Lb23/i;->c:Lb23/j;

    const-string v3, "[toRtcStats] \'totalCaptureDelay\' => expected Double but found "

    invoke-static {v0, v3}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v7, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1d

    :cond_28
    :goto_1e
    move-object/from16 v35, v0

    check-cast v35, Ljava/lang/Double;

    const-string v0, "totalSamplesCaptured"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2a

    :cond_29
    :goto_1f
    const/4 v7, 0x0

    goto :goto_20

    :cond_2a
    instance-of v1, v0, Ljava/lang/Long;

    if-nez v1, :cond_2b

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_29

    sget-object v1, Lb23/i;->c:Lb23/j;

    const-string v3, "[toRtcStats] \'totalSamplesCaptured\' => expected Long but found "

    invoke-static {v0, v3}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v7, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1f

    :cond_2b
    move-object v7, v0

    :goto_20
    move-object/from16 v36, v7

    check-cast v36, Ljava/lang/Long;

    invoke-direct/range {v22 .. v36}, Ln33/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;)V

    move-object/from16 v7, v22

    goto/16 :goto_a

    :pswitch_1
    move-object/from16 v21, v0

    move-object/from16 v20, v2

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2d

    :cond_2c
    :goto_21
    const/4 v0, 0x0

    goto :goto_22

    :cond_2d
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_2e

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2c

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-static {v0, v13}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v7, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_21

    :cond_2e
    :goto_22
    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_2f

    sget-object v1, Lo33/a;->x:Lng3/n;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lng3/n;->i(Ljava/lang/String;)Lo33/a;

    move-result-object v0

    goto :goto_23

    :cond_2f
    const/4 v0, 0x0

    :goto_23
    if-nez v0, :cond_30

    :goto_24
    move/from16 v0, v18

    goto :goto_25

    :cond_30
    sget-object v1, Lm33/a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v18, v1, v0

    goto :goto_24

    :goto_25
    const-string v1, "[toRtcStats] \'mediaSourceId\' => expected String but found "

    const-string v2, "mediaSourceId"

    const-string v3, "remoteSource"

    move-object/from16 v22, v8

    const-string v8, "[toRtcStats] \'remoteSource\' => expected Boolean but found "

    move-object/from16 v23, v4

    const-string v4, "ended"

    move-object/from16 v24, v5

    const-string v5, "[toRtcStats] \'ended\' => expected Boolean but found "

    move-object/from16 v25, v6

    const-string v6, "priority"

    move-object/from16 v26, v9

    const-string v9, "[toRtcStats] \'priority\' => expected String but found "

    move-object/from16 v27, v10

    const-string v10, "detached"

    move-object/from16 v28, v11

    const-string v11, "[toRtcStats] \'detached\' => expected Boolean but found "

    move-object/from16 v18, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_a0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_31

    :goto_26
    goto/16 :goto_4

    :cond_31
    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_33

    move-object/from16 v17, v2

    :cond_32
    move-object/from16 v19, v11

    :goto_27
    const/4 v0, 0x0

    goto :goto_28

    :cond_33
    instance-of v1, v0, Ljava/lang/Boolean;

    if-nez v1, :cond_34

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    move-object/from16 v17, v2

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_32

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-static {v0, v8}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v19, v11

    const/4 v11, 0x0

    invoke-interface {v1, v2, v7, v0, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_27

    :cond_34
    move-object/from16 v17, v2

    move-object/from16 v19, v11

    :goto_28
    check-cast v0, Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "[toRtcStats] \'framesPerSecond\' => expected Double but found "

    const-string v11, "framesPerSecond"

    move/from16 v23, v1

    const-string v1, "[toRtcStats] \'frameWidth\' => expected Long but found "

    move-object/from16 v24, v0

    const-string v0, "frameWidth"

    move-object/from16 v25, v2

    const-string v2, "[toRtcStats] \'frameHeight\' => expected Long but found "

    move-object/from16 v26, v11

    const-string v11, "frameHeight"

    if-eqz v23, :cond_74

    new-instance v27, Ln33/i;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getId()Ljava/lang/String;

    move-result-object v28

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v29

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v30

    move-object/from16 v23, v1

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_36

    move-object/from16 v31, v0

    :cond_35
    :goto_29
    const/4 v1, 0x0

    goto :goto_2a

    :cond_36
    instance-of v14, v1, Ljava/lang/String;

    if-nez v14, :cond_37

    sget-object v14, Lb23/i;->a:Lb23/i;

    sget-object v14, Lb23/i;->d:Lb23/e;

    move-object/from16 v31, v0

    sget-object v0, Lb23/g;->E:Lb23/g;

    invoke-interface {v14, v0, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_35

    sget-object v14, Lb23/i;->c:Lb23/j;

    invoke-static {v1, v15, v14, v0, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_29

    :cond_37
    move-object/from16 v31, v0

    :goto_2a
    check-cast v1, Ljava/lang/String;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_39

    :cond_38
    :goto_2b
    const/4 v0, 0x0

    goto :goto_2c

    :cond_39
    instance-of v4, v0, Ljava/lang/Boolean;

    if-nez v4, :cond_3a

    sget-object v4, Lb23/i;->a:Lb23/i;

    sget-object v4, Lb23/i;->d:Lb23/e;

    sget-object v14, Lb23/g;->E:Lb23/g;

    invoke-interface {v4, v14, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_38

    sget-object v4, Lb23/i;->c:Lb23/j;

    invoke-static {v0, v5, v4, v14, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_2b

    :cond_3a
    :goto_2c
    move-object/from16 v32, v0

    check-cast v32, Ljava/lang/Boolean;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3c

    :cond_3b
    :goto_2d
    const/4 v0, 0x0

    goto :goto_2e

    :cond_3c
    instance-of v4, v0, Ljava/lang/String;

    if-nez v4, :cond_3d

    sget-object v4, Lb23/i;->a:Lb23/i;

    sget-object v4, Lb23/i;->d:Lb23/e;

    sget-object v5, Lb23/g;->E:Lb23/g;

    invoke-interface {v4, v5, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3b

    sget-object v4, Lb23/i;->c:Lb23/j;

    invoke-static {v0, v13, v4, v5, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_2d

    :cond_3d
    :goto_2e
    move-object/from16 v33, v0

    check-cast v33, Ljava/lang/String;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3f

    :cond_3e
    :goto_2f
    const/4 v0, 0x0

    goto :goto_30

    :cond_3f
    instance-of v4, v0, Ljava/lang/String;

    if-nez v4, :cond_40

    sget-object v4, Lb23/i;->a:Lb23/i;

    sget-object v4, Lb23/i;->d:Lb23/e;

    sget-object v5, Lb23/g;->E:Lb23/g;

    invoke-interface {v4, v5, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3e

    sget-object v4, Lb23/i;->c:Lb23/j;

    invoke-static {v0, v9, v4, v5, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_2f

    :cond_40
    :goto_30
    move-object/from16 v34, v0

    check-cast v34, Ljava/lang/String;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_42

    :cond_41
    :goto_31
    const/4 v0, 0x0

    goto :goto_32

    :cond_42
    instance-of v3, v0, Ljava/lang/Boolean;

    if-nez v3, :cond_43

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_41

    sget-object v3, Lb23/i;->c:Lb23/j;

    invoke-static {v0, v8, v3, v4, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_31

    :cond_43
    :goto_32
    move-object/from16 v35, v0

    check-cast v35, Ljava/lang/Boolean;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_45

    :cond_44
    :goto_33
    const/4 v0, 0x0

    goto :goto_34

    :cond_45
    instance-of v3, v0, Ljava/lang/Boolean;

    if-nez v3, :cond_46

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_44

    sget-object v3, Lb23/i;->c:Lb23/j;

    move-object/from16 v5, v19

    invoke-static {v0, v5, v3, v4, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_33

    :cond_46
    :goto_34
    move-object/from16 v36, v0

    check-cast v36, Ljava/lang/Boolean;

    const-string v0, "estimatedPlayoutTimestamp"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_48

    :cond_47
    :goto_35
    const/4 v0, 0x0

    goto :goto_36

    :cond_48
    instance-of v3, v0, Ljava/lang/Double;

    if-nez v3, :cond_49

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_47

    sget-object v3, Lb23/i;->c:Lb23/j;

    const-string v5, "[toRtcStats] \'estimatedPlayoutTimestamp\' => expected Double but found "

    invoke-static {v0, v5, v3, v4, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_35

    :cond_49
    :goto_36
    move-object/from16 v37, v0

    check-cast v37, Ljava/lang/Double;

    const-string v0, "jitterBufferDelay"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4b

    :cond_4a
    :goto_37
    const/4 v0, 0x0

    goto :goto_38

    :cond_4b
    instance-of v3, v0, Ljava/lang/Double;

    if-nez v3, :cond_4c

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4a

    sget-object v3, Lb23/i;->c:Lb23/j;

    const-string v5, "[toRtcStats] \'jitterBufferDelay\' => expected Double but found "

    invoke-static {v0, v5, v3, v4, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_37

    :cond_4c
    :goto_38
    move-object/from16 v38, v0

    check-cast v38, Ljava/lang/Double;

    const-string v0, "jitterBufferEmittedCount"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4e

    :cond_4d
    :goto_39
    const/4 v0, 0x0

    goto :goto_3a

    :cond_4e
    instance-of v3, v0, Ljava/lang/Long;

    if-nez v3, :cond_4f

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4d

    sget-object v3, Lb23/i;->c:Lb23/j;

    const-string v5, "[toRtcStats] \'jitterBufferEmittedCount\' => expected Long but found "

    invoke-static {v0, v5, v3, v4, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_39

    :cond_4f
    :goto_3a
    move-object/from16 v39, v0

    check-cast v39, Ljava/lang/Long;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_51

    :cond_50
    :goto_3b
    const/4 v0, 0x0

    goto :goto_3c

    :cond_51
    instance-of v3, v0, Ljava/lang/Long;

    if-nez v3, :cond_52

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v4, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_50

    sget-object v3, Lb23/i;->c:Lb23/j;

    invoke-static {v0, v2, v3, v4, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_3b

    :cond_52
    :goto_3c
    move-object/from16 v40, v0

    check-cast v40, Ljava/lang/Long;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    move-object/from16 v2, v31

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_54

    :cond_53
    :goto_3d
    const/4 v0, 0x0

    goto :goto_3e

    :cond_54
    instance-of v2, v0, Ljava/lang/Long;

    if-nez v2, :cond_55

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_53

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v4, v23

    invoke-static {v0, v4, v2, v3, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_3d

    :cond_55
    :goto_3e
    move-object/from16 v41, v0

    check-cast v41, Ljava/lang/Long;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    move-object/from16 v2, v26

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_57

    :cond_56
    :goto_3f
    const/4 v0, 0x0

    goto :goto_40

    :cond_57
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_58

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_56

    sget-object v2, Lb23/i;->c:Lb23/j;

    move-object/from16 v4, v25

    invoke-static {v0, v4, v2, v3, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_3f

    :cond_58
    :goto_40
    move-object/from16 v42, v0

    check-cast v42, Ljava/lang/Double;

    const-string v0, "framesReceived"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_5a

    :cond_59
    :goto_41
    const/4 v0, 0x0

    goto :goto_42

    :cond_5a
    instance-of v2, v0, Ljava/lang/Long;

    if-nez v2, :cond_5b

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_59

    sget-object v2, Lb23/i;->c:Lb23/j;

    const-string v4, "[toRtcStats] \'framesReceived\' => expected Long but found "

    invoke-static {v0, v4, v2, v3, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_41

    :cond_5b
    :goto_42
    move-object/from16 v43, v0

    check-cast v43, Ljava/lang/Long;

    const-string v0, "framesDecoded"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_5d

    :cond_5c
    :goto_43
    const/4 v0, 0x0

    goto :goto_44

    :cond_5d
    instance-of v2, v0, Ljava/lang/Long;

    if-nez v2, :cond_5e

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5c

    sget-object v2, Lb23/i;->c:Lb23/j;

    const-string v4, "[toRtcStats] \'framesDecoded\' => expected Long but found "

    invoke-static {v0, v4, v2, v3, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_43

    :cond_5e
    :goto_44
    move-object/from16 v44, v0

    check-cast v44, Ljava/lang/Long;

    const-string v0, "framesDropped"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_60

    :cond_5f
    :goto_45
    const/4 v0, 0x0

    goto :goto_46

    :cond_60
    instance-of v2, v0, Ljava/lang/Long;

    if-nez v2, :cond_61

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5f

    sget-object v2, Lb23/i;->c:Lb23/j;

    const-string v4, "[toRtcStats] \'framesDropped\' => expected Long but found "

    invoke-static {v0, v4, v2, v3, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_45

    :cond_61
    :goto_46
    move-object/from16 v45, v0

    check-cast v45, Ljava/lang/Long;

    const-string v0, "totalFramesDuration"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_63

    :cond_62
    :goto_47
    const/4 v0, 0x0

    goto :goto_48

    :cond_63
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_64

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_62

    sget-object v2, Lb23/i;->c:Lb23/j;

    const-string v4, "[toRtcStats] \'totalFramesDuration\' => expected Double but found "

    invoke-static {v0, v4, v2, v3, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_47

    :cond_64
    :goto_48
    move-object/from16 v46, v0

    check-cast v46, Ljava/lang/Double;

    const-string v0, "totalFreezesDuration"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_66

    :cond_65
    :goto_49
    const/4 v0, 0x0

    goto :goto_4a

    :cond_66
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_67

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_65

    sget-object v2, Lb23/i;->c:Lb23/j;

    const-string v4, "[toRtcStats] \'totalFreezesDuration\' => expected Double but found "

    invoke-static {v0, v4, v2, v3, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_49

    :cond_67
    :goto_4a
    move-object/from16 v47, v0

    check-cast v47, Ljava/lang/Double;

    const-string v0, "freezeCount"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_69

    :cond_68
    :goto_4b
    const/4 v0, 0x0

    goto :goto_4c

    :cond_69
    instance-of v2, v0, Ljava/lang/Long;

    if-nez v2, :cond_6a

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_68

    sget-object v2, Lb23/i;->c:Lb23/j;

    const-string v4, "[toRtcStats] \'freezeCount\' => expected Long but found "

    invoke-static {v0, v4, v2, v3, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_4b

    :cond_6a
    :goto_4c
    move-object/from16 v48, v0

    check-cast v48, Ljava/lang/Long;

    const-string v0, "pauseCount"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_6c

    :cond_6b
    :goto_4d
    const/4 v0, 0x0

    goto :goto_4e

    :cond_6c
    instance-of v2, v0, Ljava/lang/Long;

    if-nez v2, :cond_6d

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6b

    sget-object v2, Lb23/i;->c:Lb23/j;

    const-string v4, "[toRtcStats] \'pauseCount\' => expected Long but found "

    invoke-static {v0, v4, v2, v3, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_4d

    :cond_6d
    :goto_4e
    move-object/from16 v49, v0

    check-cast v49, Ljava/lang/Long;

    const-string v0, "totalPausesDuration"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_6f

    :cond_6e
    :goto_4f
    const/4 v0, 0x0

    goto :goto_50

    :cond_6f
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_70

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6e

    sget-object v2, Lb23/i;->c:Lb23/j;

    const-string v4, "[toRtcStats] \'totalPausesDuration\' => expected Double but found "

    invoke-static {v0, v4, v2, v3, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_4f

    :cond_70
    :goto_50
    move-object/from16 v50, v0

    check-cast v50, Ljava/lang/Double;

    const-string v0, "sumOfSquaredFramesDuration"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_72

    :cond_71
    :goto_51
    const/4 v7, 0x0

    goto :goto_52

    :cond_72
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_73

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_71

    sget-object v2, Lb23/i;->c:Lb23/j;

    const-string v4, "[toRtcStats] \'sumOfSquaredFramesDuration\' => expected Double but found "

    invoke-static {v0, v4, v2, v3, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_51

    :cond_73
    move-object v7, v0

    :goto_52
    move-object/from16 v51, v7

    check-cast v51, Ljava/lang/Double;

    move-object/from16 v31, v1

    invoke-direct/range {v27 .. v51}, Ln33/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;)V

    move-object/from16 v7, v27

    goto/16 :goto_99

    :cond_74
    move-object/from16 v31, v0

    move-object/from16 v23, v1

    move-object/from16 v0, v19

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object/from16 v19, v2

    move-object/from16 v2, v24

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9f

    new-instance v32, Ln33/j;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getId()Ljava/lang/String;

    move-result-object v33

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v34

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v35

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_76

    :cond_75
    :goto_53
    const/4 v1, 0x0

    goto :goto_54

    :cond_76
    instance-of v2, v1, Ljava/lang/String;

    if-nez v2, :cond_77

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v14, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v14, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_75

    sget-object v2, Lb23/i;->c:Lb23/j;

    invoke-static {v1, v15}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v15, 0x0

    invoke-interface {v2, v14, v7, v1, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_53

    :cond_77
    :goto_54
    move-object/from16 v36, v1

    check-cast v36, Ljava/lang/String;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_79

    :cond_78
    :goto_55
    const/4 v1, 0x0

    goto :goto_56

    :cond_79
    instance-of v2, v1, Ljava/lang/Boolean;

    if-nez v2, :cond_7a

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v4, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_78

    sget-object v2, Lb23/i;->c:Lb23/j;

    invoke-static {v1, v5}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v15, 0x0

    invoke-interface {v2, v4, v7, v1, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_55

    :cond_7a
    :goto_56
    move-object/from16 v37, v1

    check-cast v37, Ljava/lang/Boolean;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_7c

    :cond_7b
    :goto_57
    const/4 v1, 0x0

    goto :goto_58

    :cond_7c
    instance-of v2, v1, Ljava/lang/String;

    if-nez v2, :cond_7d

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v4, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7b

    sget-object v2, Lb23/i;->c:Lb23/j;

    invoke-static {v1, v13}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v15, 0x0

    invoke-interface {v2, v4, v7, v1, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_57

    :cond_7d
    :goto_58
    move-object/from16 v38, v1

    check-cast v38, Ljava/lang/String;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_7f

    :cond_7e
    :goto_59
    const/4 v1, 0x0

    goto :goto_5a

    :cond_7f
    instance-of v2, v1, Ljava/lang/String;

    if-nez v2, :cond_80

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v4, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7e

    sget-object v2, Lb23/i;->c:Lb23/j;

    invoke-static {v1, v9}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v15, 0x0

    invoke-interface {v2, v4, v7, v1, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_59

    :cond_80
    :goto_5a
    move-object/from16 v39, v1

    check-cast v39, Ljava/lang/String;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_82

    :cond_81
    :goto_5b
    const/4 v1, 0x0

    goto :goto_5c

    :cond_82
    instance-of v2, v1, Ljava/lang/Boolean;

    if-nez v2, :cond_83

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_81

    sget-object v2, Lb23/i;->c:Lb23/j;

    invoke-static {v1, v8}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v15, 0x0

    invoke-interface {v2, v3, v7, v1, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_5b

    :cond_83
    :goto_5c
    move-object/from16 v40, v1

    check-cast v40, Ljava/lang/Boolean;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_85

    :cond_84
    :goto_5d
    const/4 v1, 0x0

    goto :goto_5e

    :cond_85
    instance-of v2, v1, Ljava/lang/Boolean;

    if-nez v2, :cond_86

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_84

    sget-object v2, Lb23/i;->c:Lb23/j;

    invoke-static {v1, v0}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v15, 0x0

    invoke-interface {v2, v3, v7, v0, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_5d

    :cond_86
    :goto_5e
    move-object/from16 v41, v1

    check-cast v41, Ljava/lang/Boolean;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_88

    :cond_87
    :goto_5f
    const/4 v0, 0x0

    goto :goto_60

    :cond_88
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_89

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_87

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v3, v18

    invoke-static {v0, v3}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v7, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_5f

    :cond_89
    :goto_60
    move-object/from16 v42, v0

    check-cast v42, Ljava/lang/String;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_8b

    :cond_8a
    :goto_61
    const/4 v0, 0x0

    goto :goto_62

    :cond_8b
    instance-of v1, v0, Ljava/lang/Long;

    if-nez v1, :cond_8c

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8a

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v3, v19

    invoke-static {v0, v3}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v7, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_61

    :cond_8c
    :goto_62
    move-object/from16 v43, v0

    check-cast v43, Ljava/lang/Long;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    move-object/from16 v2, v31

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_8e

    :cond_8d
    :goto_63
    const/4 v0, 0x0

    goto :goto_64

    :cond_8e
    instance-of v1, v0, Ljava/lang/Long;

    if-nez v1, :cond_8f

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8d

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v4, v23

    invoke-static {v0, v4}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v7, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_63

    :cond_8f
    :goto_64
    move-object/from16 v44, v0

    check-cast v44, Ljava/lang/Long;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    move-object/from16 v2, v26

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_91

    :cond_90
    :goto_65
    const/4 v0, 0x0

    goto :goto_66

    :cond_91
    instance-of v1, v0, Ljava/lang/Double;

    if-nez v1, :cond_92

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_90

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v4, v25

    invoke-static {v0, v4}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v7, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_65

    :cond_92
    :goto_66
    move-object/from16 v45, v0

    check-cast v45, Ljava/lang/Double;

    const-string v0, "keyFramesSent"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_94

    :cond_93
    :goto_67
    const/4 v0, 0x0

    goto :goto_68

    :cond_94
    instance-of v1, v0, Ljava/lang/Long;

    if-nez v1, :cond_95

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_93

    sget-object v1, Lb23/i;->c:Lb23/j;

    const-string v3, "[toRtcStats] \'keyFramesSent\' => expected Long but found "

    invoke-static {v0, v3}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v7, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_67

    :cond_95
    :goto_68
    move-object/from16 v46, v0

    check-cast v46, Ljava/lang/Long;

    const-string v0, "framesCaptured"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_97

    :cond_96
    :goto_69
    const/4 v0, 0x0

    goto :goto_6a

    :cond_97
    instance-of v1, v0, Ljava/lang/Long;

    if-nez v1, :cond_98

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_96

    sget-object v1, Lb23/i;->c:Lb23/j;

    const-string v3, "[toRtcStats] \'framesCaptured\' => expected Long but found "

    invoke-static {v0, v3}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v7, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_69

    :cond_98
    :goto_6a
    move-object/from16 v47, v0

    check-cast v47, Ljava/lang/Long;

    const-string v0, "framesSent"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_9a

    :cond_99
    :goto_6b
    const/4 v0, 0x0

    goto :goto_6c

    :cond_9a
    instance-of v1, v0, Ljava/lang/Long;

    if-nez v1, :cond_9b

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_99

    sget-object v1, Lb23/i;->c:Lb23/j;

    const-string v3, "[toRtcStats] \'framesSent\' => expected Long but found "

    invoke-static {v0, v3}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v7, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6b

    :cond_9b
    :goto_6c
    move-object/from16 v48, v0

    check-cast v48, Ljava/lang/Long;

    const-string v0, "hugeFramesSent"

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_9c

    const/4 v7, 0x0

    goto :goto_6e

    :cond_9c
    instance-of v1, v0, Ljava/lang/Long;

    if-nez v1, :cond_9e

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9d

    sget-object v1, Lb23/i;->c:Lb23/j;

    const-string v3, "[toRtcStats] \'hugeFramesSent\' => expected Long but found "

    invoke-static {v0, v3}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    invoke-interface {v1, v2, v7, v0, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6d

    :cond_9d
    const/4 v11, 0x0

    :goto_6d
    move-object v7, v11

    goto :goto_6e

    :cond_9e
    move-object v7, v0

    :goto_6e
    move-object/from16 v49, v7

    check-cast v49, Ljava/lang/Long;

    invoke-direct/range {v32 .. v49}, Ln33/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V

    move-object/from16 v7, v32

    goto/16 :goto_99

    :cond_9f
    const/4 v11, 0x0

    move-object v7, v11

    goto/16 :goto_99

    :cond_a0
    move-object v1, v2

    move-object v0, v11

    move-object/from16 v2, v18

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_a2

    move-object/from16 v17, v1

    move-object/from16 v18, v2

    :cond_a1
    :goto_6f
    const/4 v11, 0x0

    goto :goto_70

    :cond_a2
    move-object/from16 v18, v2

    instance-of v2, v11, Ljava/lang/Boolean;

    if-nez v2, :cond_a3

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    move-object/from16 v17, v1

    sget-object v1, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v1, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a1

    sget-object v2, Lb23/i;->c:Lb23/j;

    invoke-static {v11, v8, v2, v1, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_6f

    :cond_a3
    move-object/from16 v17, v1

    :goto_70
    check-cast v11, Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a4

    invoke-static/range {v20 .. v20}, Lds/p;->X(Lorg/webrtc/RTCStats;)Ln33/g;

    move-result-object v7

    goto/16 :goto_99

    :cond_a4
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v29, Ln33/h;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getId()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v31

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v32

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_a6

    :cond_a5
    :goto_71
    const/4 v1, 0x0

    goto :goto_72

    :cond_a6
    instance-of v2, v1, Ljava/lang/String;

    if-nez v2, :cond_a7

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v11, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v11, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a5

    sget-object v2, Lb23/i;->c:Lb23/j;

    invoke-static {v1, v15, v2, v11, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_71

    :cond_a7
    :goto_72
    move-object/from16 v33, v1

    check-cast v33, Ljava/lang/String;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_a9

    :cond_a8
    :goto_73
    const/4 v1, 0x0

    goto :goto_74

    :cond_a9
    instance-of v2, v1, Ljava/lang/Boolean;

    if-nez v2, :cond_aa

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v4, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a8

    sget-object v2, Lb23/i;->c:Lb23/j;

    invoke-static {v1, v5, v2, v4, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_73

    :cond_aa
    :goto_74
    move-object/from16 v34, v1

    check-cast v34, Ljava/lang/Boolean;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_ac

    :cond_ab
    :goto_75
    const/4 v1, 0x0

    goto :goto_76

    :cond_ac
    instance-of v2, v1, Ljava/lang/String;

    if-nez v2, :cond_ad

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v4, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_ab

    sget-object v2, Lb23/i;->c:Lb23/j;

    invoke-static {v1, v13, v2, v4, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_75

    :cond_ad
    :goto_76
    move-object/from16 v35, v1

    check-cast v35, Ljava/lang/String;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_af

    :cond_ae
    :goto_77
    const/4 v1, 0x0

    goto :goto_78

    :cond_af
    instance-of v2, v1, Ljava/lang/String;

    if-nez v2, :cond_b0

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v4, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_ae

    sget-object v2, Lb23/i;->c:Lb23/j;

    invoke-static {v1, v9, v2, v4, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_77

    :cond_b0
    :goto_78
    move-object/from16 v36, v1

    check-cast v36, Ljava/lang/String;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_b2

    :cond_b1
    :goto_79
    const/4 v1, 0x0

    goto :goto_7a

    :cond_b2
    instance-of v2, v1, Ljava/lang/Boolean;

    if-nez v2, :cond_b3

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b1

    sget-object v2, Lb23/i;->c:Lb23/j;

    invoke-static {v1, v8, v2, v3, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_79

    :cond_b3
    :goto_7a
    move-object/from16 v37, v1

    check-cast v37, Ljava/lang/Boolean;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_b5

    :cond_b4
    :goto_7b
    const/4 v0, 0x0

    goto :goto_7c

    :cond_b5
    instance-of v2, v1, Ljava/lang/Boolean;

    if-nez v2, :cond_b6

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v3, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b4

    sget-object v2, Lb23/i;->c:Lb23/j;

    invoke-static {v1, v0, v2, v3, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_7b

    :cond_b6
    move-object v0, v1

    :goto_7c
    move-object/from16 v38, v0

    check-cast v38, Ljava/lang/Boolean;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_b8

    :cond_b7
    :goto_7d
    const/4 v0, 0x0

    goto :goto_7e

    :cond_b8
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_b9

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b7

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v3, v18

    invoke-static {v0, v3, v1, v2, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_7d

    :cond_b9
    :goto_7e
    move-object/from16 v39, v0

    check-cast v39, Ljava/lang/String;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, v28

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_bb

    :cond_ba
    :goto_7f
    const/4 v0, 0x0

    goto :goto_80

    :cond_bb
    instance-of v1, v0, Ljava/lang/Double;

    if-nez v1, :cond_bc

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_ba

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v3, v27

    invoke-static {v0, v3, v1, v2, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_7f

    :cond_bc
    :goto_80
    move-object/from16 v40, v0

    check-cast v40, Ljava/lang/Double;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, v26

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_be

    :cond_bd
    :goto_81
    const/4 v0, 0x0

    goto :goto_82

    :cond_be
    instance-of v1, v0, Ljava/lang/Double;

    if-nez v1, :cond_bf

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_bd

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v3, v25

    invoke-static {v0, v3, v1, v2, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_81

    :cond_bf
    :goto_82
    move-object/from16 v41, v0

    check-cast v41, Ljava/lang/Double;

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_c1

    :cond_c0
    :goto_83
    const/4 v7, 0x0

    goto :goto_84

    :cond_c1
    instance-of v1, v0, Ljava/lang/Double;

    if-nez v1, :cond_c2

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c0

    sget-object v1, Lb23/i;->c:Lb23/j;

    move-object/from16 v3, v23

    invoke-static {v0, v3, v1, v2, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_83

    :cond_c2
    move-object v7, v0

    :goto_84
    move-object/from16 v42, v7

    check-cast v42, Ljava/lang/Double;

    invoke-direct/range {v29 .. v42}, Ln33/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V

    move-object/from16 v7, v29

    goto/16 :goto_99

    :pswitch_2
    move-object/from16 v21, v0

    move-object/from16 v20, v2

    move-object/from16 v22, v8

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_c4

    :cond_c3
    :goto_85
    const/4 v0, 0x0

    goto :goto_86

    :cond_c4
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_c5

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c3

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-static {v0, v13, v1, v2, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_85

    :cond_c5
    :goto_86
    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_c6

    sget-object v1, Lo33/a;->x:Lng3/n;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lng3/n;->i(Ljava/lang/String;)Lo33/a;

    move-result-object v0

    goto :goto_87

    :cond_c6
    const/4 v0, 0x0

    :goto_87
    if-nez v0, :cond_c7

    :goto_88
    move/from16 v0, v18

    const/4 v1, 0x1

    goto :goto_89

    :cond_c7
    sget-object v1, Lm33/a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v18, v1, v0

    goto :goto_88

    :goto_89
    if-eq v0, v1, :cond_c9

    const/4 v1, 0x2

    if-eq v0, v1, :cond_c8

    goto/16 :goto_26

    :cond_c8
    invoke-static/range {v20 .. v20}, Lds/p;->Z(Lorg/webrtc/RTCStats;)Ln33/l;

    move-result-object v7

    goto/16 :goto_99

    :cond_c9
    invoke-static/range {v20 .. v20}, Lds/p;->Y(Lorg/webrtc/RTCStats;)Ln33/k;

    move-result-object v7

    goto/16 :goto_99

    :pswitch_3
    move-object/from16 v21, v0

    move-object/from16 v20, v2

    move-object/from16 v22, v8

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_cb

    :cond_ca
    :goto_8a
    const/4 v0, 0x0

    goto :goto_8b

    :cond_cb
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_cc

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_ca

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-static {v0, v13, v1, v2, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_8a

    :cond_cc
    :goto_8b
    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_cd

    sget-object v1, Lo33/a;->x:Lng3/n;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lng3/n;->i(Ljava/lang/String;)Lo33/a;

    move-result-object v0

    goto :goto_8c

    :cond_cd
    const/4 v0, 0x0

    :goto_8c
    if-nez v0, :cond_ce

    :goto_8d
    move/from16 v0, v18

    const/4 v1, 0x1

    goto :goto_8e

    :cond_ce
    sget-object v1, Lm33/a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v18, v1, v0

    goto :goto_8d

    :goto_8e
    if-eq v0, v1, :cond_d0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_cf

    goto/16 :goto_26

    :cond_cf
    invoke-static/range {v20 .. v20}, Lds/p;->W(Lorg/webrtc/RTCStats;)Ln33/f;

    move-result-object v7

    goto/16 :goto_99

    :cond_d0
    invoke-static/range {v20 .. v20}, Lds/p;->V(Lorg/webrtc/RTCStats;)Ln33/e;

    move-result-object v7

    goto/16 :goto_99

    :pswitch_4
    move-object/from16 v21, v0

    move-object/from16 v20, v2

    move-object/from16 v22, v8

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_d2

    :cond_d1
    :goto_8f
    const/4 v0, 0x0

    goto :goto_90

    :cond_d2
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_d3

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d1

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-static {v0, v13, v1, v2, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_8f

    :cond_d3
    :goto_90
    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_d4

    sget-object v1, Lo33/a;->x:Lng3/n;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lng3/n;->i(Ljava/lang/String;)Lo33/a;

    move-result-object v0

    goto :goto_91

    :cond_d4
    const/4 v0, 0x0

    :goto_91
    if-nez v0, :cond_d5

    :goto_92
    move/from16 v0, v18

    const/4 v1, 0x1

    goto :goto_93

    :cond_d5
    sget-object v1, Lm33/a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v18, v1, v0

    goto :goto_92

    :goto_93
    if-eq v0, v1, :cond_d7

    const/4 v1, 0x2

    if-eq v0, v1, :cond_d6

    goto/16 :goto_26

    :cond_d6
    invoke-static/range {v20 .. v20}, Lds/p;->d0(Lorg/webrtc/RTCStats;)Ln33/p;

    move-result-object v7

    goto/16 :goto_99

    :cond_d7
    invoke-static/range {v20 .. v20}, Lds/p;->c0(Lorg/webrtc/RTCStats;)Ln33/o;

    move-result-object v7

    goto/16 :goto_99

    :pswitch_5
    move-object/from16 v21, v0

    move-object/from16 v20, v2

    move-object/from16 v22, v8

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_d9

    :cond_d8
    :goto_94
    const/4 v0, 0x0

    goto :goto_95

    :cond_d9
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_da

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d8

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-static {v0, v13, v1, v2, v7}, Ljh3/c;->p(Ljava/lang/Object;Ljava/lang/String;Lb23/j;Lb23/g;Ljava/lang/String;)V

    goto :goto_94

    :cond_da
    :goto_95
    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_db

    sget-object v1, Lo33/a;->x:Lng3/n;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lng3/n;->i(Ljava/lang/String;)Lo33/a;

    move-result-object v0

    goto :goto_96

    :cond_db
    const/4 v0, 0x0

    :goto_96
    if-nez v0, :cond_dc

    :goto_97
    move/from16 v0, v18

    const/4 v1, 0x1

    goto :goto_98

    :cond_dc
    sget-object v1, Lm33/a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v18, v1, v0

    goto :goto_97

    :goto_98
    if-eq v0, v1, :cond_de

    const/4 v1, 0x2

    if-eq v0, v1, :cond_dd

    goto/16 :goto_26

    :cond_dd
    invoke-static/range {v20 .. v20}, Lds/p;->b0(Lorg/webrtc/RTCStats;)Ln33/n;

    move-result-object v7

    goto :goto_99

    :cond_de
    invoke-static/range {v20 .. v20}, Lds/p;->a0(Lorg/webrtc/RTCStats;)Ln33/m;

    move-result-object v7

    goto :goto_99

    :pswitch_6
    move-object/from16 v21, v0

    move-object/from16 v20, v2

    move-object/from16 v22, v8

    invoke-static/range {v20 .. v20}, Lds/p;->U(Lorg/webrtc/RTCStats;)Ln33/d;

    move-result-object v7

    goto :goto_99

    :pswitch_7
    move-object/from16 v21, v0

    move-object/from16 v20, v2

    move-object/from16 v22, v8

    invoke-static/range {v20 .. v20}, Lds/p;->U(Lorg/webrtc/RTCStats;)Ln33/d;

    move-result-object v7

    goto :goto_99

    :pswitch_8
    move-object/from16 v21, v0

    move-object/from16 v20, v2

    move-object/from16 v22, v8

    invoke-static/range {v20 .. v20}, Lds/p;->T(Lorg/webrtc/RTCStats;)Ln33/c;

    move-result-object v7

    goto :goto_99

    :pswitch_9
    move-object/from16 v21, v0

    move-object/from16 v20, v2

    move-object/from16 v22, v8

    invoke-static/range {v20 .. v20}, Lds/p;->S(Lorg/webrtc/RTCStats;)Ln33/b;

    move-result-object v7

    :goto_99
    if-nez v7, :cond_df

    move-object/from16 v1, v16

    move-object/from16 v0, v21

    goto/16 :goto_0

    :cond_df
    move-object/from16 v0, v21

    move-object/from16 v8, v22

    invoke-virtual {v0, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_e0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v0, v8, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e0
    check-cast v1, Ljava/util/Set;

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v16

    goto/16 :goto_0

    :cond_e1
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final f(Le30/c;Lf0/r1;ZLx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v6, p4

    check-cast v6, Lp1/q;

    const v0, 0x29389f99

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int v0, p5, v0

    move-object/from16 v5, p1

    invoke-virtual {v6, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x20

    goto :goto_1

    :cond_1
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v0, v3

    and-int/lit8 v3, p6, 0x4

    if-eqz v3, :cond_2

    or-int/lit16 v0, v0, 0x180

    move/from16 v4, p2

    goto :goto_3

    :cond_2
    move/from16 v4, p2

    invoke-virtual {v6, v4}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x100

    goto :goto_2

    :cond_3
    const/16 v7, 0x80

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit16 v7, v0, 0x493

    const/16 v8, 0x492

    if-ne v7, v8, :cond_5

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object/from16 v14, p3

    move v3, v4

    goto/16 :goto_8

    :cond_5
    :goto_4
    const/4 v9, 0x1

    if-eqz v3, :cond_6

    move v11, v9

    goto :goto_5

    :cond_6
    move v11, v4

    :goto_5
    iget-object v3, v1, Le30/c;->Q:Lec3/r1;

    const/4 v10, 0x0

    invoke-static {v3, v6, v10}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v3

    invoke-virtual {v1}, Le30/c;->q()Lec3/f2;

    move-result-object v4

    invoke-static {v4, v6, v10}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v12

    sget-object v4, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v6, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly3/c;

    const v7, -0x355c84c2    # -5356959.0f

    invoke-virtual {v6, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v7, v8, :cond_7

    int-to-float v7, v10

    new-instance v13, Ly3/f;

    invoke-direct {v13, v7}, Ly3/f;-><init>(F)V

    invoke-static {v13}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v6, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v13, v7

    check-cast v13, Lp1/c1;

    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    sget v7, Lb30/g3;->a:F

    sget-object v14, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v6}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v14

    iget-object v14, v14, Ll0/c2;->e:Ll0/b;

    invoke-static {v14, v6}, Ll0/f;->e(Ll0/b2;Landroidx/compose/runtime/Composer;)Ll0/x0;

    move-result-object v14

    invoke-virtual {v14}, Ll0/x0;->a()F

    move-result v14

    add-float/2addr v14, v7

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    invoke-static {v7, v6, v10}, Lds/p;->a(ZLandroidx/compose/runtime/Composer;I)V

    const v7, -0x355c5f0c    # -5361786.0f

    invoke-virtual {v6, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v7, :cond_8

    if-ne v15, v8, :cond_9

    :cond_8
    new-instance v15, Lb30/s2;

    invoke-direct {v15, v4, v13, v10}, Lb30/s2;-><init>(Ly3/c;Lp1/c1;I)V

    invoke-virtual {v6, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v15, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v15}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v7, 0x0

    invoke-static {v4, v14, v7, v2}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v7, Lb30/w2;

    invoke-direct {v7, v2, v1, v3}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v2, -0x1847e466

    invoke-static {v2, v6, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    new-instance v3, Lb30/x2;

    move-object/from16 v14, p3

    invoke-direct {v3, v11, v14, v10}, Lb30/x2;-><init>(ZLjava/lang/Object;I)V

    const v7, -0x3099d6a5

    invoke-static {v7, v6, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    shl-int/lit8 v0, v0, 0x6

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit8 v7, v0, 0x36

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Ldp/d;->a(Lx1/b;Lx1/b;Landroidx/compose/ui/Modifier;Lf0/r1;Landroidx/compose/runtime/Composer;II)V

    if-eqz v11, :cond_b

    invoke-interface {v12}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La30/k1;

    if-eqz v0, :cond_a

    invoke-interface {v12}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La30/k1;

    instance-of v0, v0, La30/i1;

    if-nez v0, :cond_a

    goto :goto_6

    :cond_a
    move v2, v10

    goto :goto_7

    :cond_b
    :goto_6
    move v2, v9

    :goto_7
    const/4 v0, 0x0

    const/4 v3, 0x3

    invoke-static {v0, v3}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v4

    invoke-static {v0, v3}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v5

    new-instance v0, Lb30/v2;

    invoke-direct {v0, v13, v11, v12, v10}, Lb30/v2;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    const v3, 0x798387c1

    invoke-static {v3, v6, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const v9, 0x30d80

    const/16 v10, 0x12

    const/4 v3, 0x0

    move-object v8, v6

    const/4 v6, 0x0

    invoke-static/range {v2 .. v10}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v8

    move v3, v11

    :goto_8
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_c

    new-instance v0, Lar2/a;

    move-object/from16 v2, p1

    move/from16 v5, p5

    move/from16 v6, p6

    move-object v4, v14

    invoke-direct/range {v0 .. v6}, Lar2/a;-><init>(Le30/c;Lf0/r1;ZLx1/b;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static final f0(Lorg/webrtc/RTCStats;)Ln33/r;
    .locals 14

    new-instance v0, Ln33/r;

    invoke-virtual {p0}, Lorg/webrtc/RTCStats;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lorg/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const-string v4, "kind"

    invoke-virtual {p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "RtcParser"

    const/4 v6, 0x0

    if-nez v4, :cond_1

    :cond_0
    :goto_0
    move-object v4, v6

    goto :goto_1

    :cond_1
    instance-of v7, v4, Ljava/lang/String;

    if-nez v7, :cond_2

    sget-object v7, Lb23/i;->a:Lb23/i;

    sget-object v7, Lb23/i;->d:Lb23/e;

    sget-object v8, Lb23/g;->E:Lb23/g;

    invoke-interface {v7, v8, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    sget-object v7, Lb23/i;->c:Lb23/j;

    const-string v9, "[toRtcStats] \'kind\' => expected String but found "

    invoke-static {v4, v9}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v7, v8, v5, v4, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    :goto_1
    check-cast v4, Ljava/lang/String;

    const-string v7, "trackIdentifier"

    invoke-virtual {p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_4

    :cond_3
    :goto_2
    move-object v7, v6

    goto :goto_3

    :cond_4
    instance-of v8, v7, Ljava/lang/String;

    if-nez v8, :cond_5

    sget-object v8, Lb23/i;->a:Lb23/i;

    sget-object v8, Lb23/i;->d:Lb23/e;

    sget-object v9, Lb23/g;->E:Lb23/g;

    invoke-interface {v8, v9, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    sget-object v8, Lb23/i;->c:Lb23/j;

    const-string v10, "[toRtcStats] \'trackIdentifier\' => expected String but found "

    invoke-static {v7, v10}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v9, v5, v7, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_5
    :goto_3
    check-cast v7, Ljava/lang/String;

    const-string v8, "width"

    invoke-virtual {p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_7

    :cond_6
    :goto_4
    move-object v8, v6

    goto :goto_5

    :cond_7
    instance-of v9, v8, Ljava/lang/Long;

    if-nez v9, :cond_8

    sget-object v9, Lb23/i;->a:Lb23/i;

    sget-object v9, Lb23/i;->d:Lb23/e;

    sget-object v10, Lb23/g;->E:Lb23/g;

    invoke-interface {v9, v10, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    sget-object v9, Lb23/i;->c:Lb23/j;

    const-string v11, "[toRtcStats] \'width\' => expected Long but found "

    invoke-static {v8, v11}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v9, v10, v5, v8, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_8
    :goto_5
    check-cast v8, Ljava/lang/Long;

    const-string v9, "height"

    invoke-virtual {p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_a

    :cond_9
    :goto_6
    move-object v9, v6

    goto :goto_7

    :cond_a
    instance-of v10, v9, Ljava/lang/Long;

    if-nez v10, :cond_b

    sget-object v10, Lb23/i;->a:Lb23/i;

    sget-object v10, Lb23/i;->d:Lb23/e;

    sget-object v11, Lb23/g;->E:Lb23/g;

    invoke-interface {v10, v11, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    sget-object v10, Lb23/i;->c:Lb23/j;

    const-string v12, "[toRtcStats] \'height\' => expected Long but found "

    invoke-static {v9, v12}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v10, v11, v5, v9, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_b
    :goto_7
    check-cast v9, Ljava/lang/Long;

    const-string v10, "framesPerSecond"

    invoke-virtual {p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_d

    :cond_c
    :goto_8
    move-object v10, v6

    goto :goto_9

    :cond_d
    instance-of v11, v10, Ljava/lang/Double;

    if-nez v11, :cond_e

    sget-object v11, Lb23/i;->a:Lb23/i;

    sget-object v11, Lb23/i;->d:Lb23/e;

    sget-object v12, Lb23/g;->E:Lb23/g;

    invoke-interface {v11, v12, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_c

    sget-object v11, Lb23/i;->c:Lb23/j;

    const-string v13, "[toRtcStats] \'framesPerSecond\' => expected Double but found "

    invoke-static {v10, v13}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v11, v12, v5, v10, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_8

    :cond_e
    :goto_9
    check-cast v10, Ljava/lang/Double;

    const-string v11, "frames"

    invoke-virtual {p0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_f

    goto :goto_a

    :cond_f
    instance-of v11, p0, Ljava/lang/Long;

    if-nez v11, :cond_10

    sget-object v11, Lb23/i;->a:Lb23/i;

    sget-object v11, Lb23/i;->d:Lb23/e;

    sget-object v12, Lb23/g;->E:Lb23/g;

    invoke-interface {v11, v12, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_11

    sget-object v11, Lb23/i;->c:Lb23/j;

    const-string v13, "[toRtcStats] \'frames\' => expected Long but found "

    invoke-static {p0, v13}, Ljh3/c;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {v11, v12, v5, p0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_a

    :cond_10
    move-object v6, p0

    :cond_11
    :goto_a
    check-cast v6, Ljava/lang/Long;

    move-object v5, v7

    move-object v7, v9

    move-object v9, v6

    move-object v6, v8

    move-object v8, v10

    invoke-direct/range {v0 .. v9}, Ln33/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;)V

    return-object v0
.end method

.method public static final g(Lh20/w0;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string v0, "viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p1

    check-cast v5, Lp1/q;

    const p1, 0x3ee83d00

    invoke-virtual {v5, p1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    and-int/lit8 v1, p1, 0x3

    if-ne v1, v0, :cond_2

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v1, p0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v5, v1}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v2

    new-instance v0, Lb30/w2;

    invoke-direct {v0, v1, p0, v2}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x79f24f95

    invoke-static {v1, v5, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    and-int/lit8 p1, p1, 0xe

    or-int/lit16 v6, p1, 0xc00

    const/4 v7, 0x4

    const/4 v3, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lds/p;->f(Le30/c;Lf0/r1;ZLx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_2
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_3

    new-instance p1, La80/c;

    const/16 v0, 0x8

    invoke-direct {p1, v1, p2, v0}, La80/c;-><init>(Le30/c;II)V

    iput-object p1, p0, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method public static final g0(Llb3/y;)Llb3/c0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llb3/y;->p0()Llb3/f1;

    move-result-object p0

    instance-of v0, p0, Llb3/r;

    if-eqz v0, :cond_0

    check-cast p0, Llb3/r;

    iget-object p0, p0, Llb3/r;->y:Llb3/c0;

    return-object p0

    :cond_0
    instance-of v0, p0, Llb3/c0;

    if-eqz v0, :cond_1

    check-cast p0, Llb3/c0;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final h(Lh20/k4;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string v0, "viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p1

    check-cast v5, Lp1/q;

    const p1, -0x156d9e7f

    invoke-virtual {v5, p1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    and-int/lit8 v1, p1, 0x3

    if-ne v1, v0, :cond_2

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v1, p0

    goto :goto_2

    :cond_2
    :goto_1
    iget-object v0, p0, Lh20/k4;->t0:Ln53/e;

    const/4 v1, 0x0

    invoke-static {v0, v5, v1}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v1, v5, v2}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v2

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    new-instance v0, Lb30/w2;

    invoke-direct {v0, v1, p0, v2}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x10ba1556

    invoke-static {v1, v5, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    and-int/lit8 p1, p1, 0xe

    or-int/lit16 v6, p1, 0xc00

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lds/p;->f(Le30/c;Lf0/r1;ZLx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_2
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_3

    new-instance p1, La80/c;

    const/16 v0, 0x9

    invoke-direct {p1, v1, p2, v0}, La80/c;-><init>(Le30/c;II)V

    iput-object p1, p0, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method public static final h0(Lad3/c;Ljava/lang/Object;Lwc3/j;)Lkotlinx/serialization/json/JsonElement;
    .locals 4

    const-string v0, "json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lbd3/t;

    new-instance v2, Lbd3/k0;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lbd3/k0;-><init>(Lkotlin/jvm/internal/g0;I)V

    const/4 v3, 0x1

    invoke-direct {v1, p0, v2, v3}, Lbd3/t;-><init>(Lad3/c;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v1, p2, p1}, Lbd3/t;->encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    iget-object p0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz p0, :cond_0

    check-cast p0, Lkotlinx/serialization/json/JsonElement;

    return-object p0

    :cond_0
    const-string p0, "result"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final i(Le30/c;Lb30/p2;Landroidx/compose/ui/Modifier;Lf0/r1;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    move-object/from16 v10, p3

    const-string v1, "viewModel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "scrollState"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p4

    check-cast v7, Lp1/q;

    const v1, 0x2f6de811

    invoke-virtual {v7, v1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p5, v1

    or-int/lit16 v1, v1, 0x180

    invoke-virtual {v7, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0x800

    goto :goto_1

    :cond_1
    const/16 v2, 0x400

    :goto_1
    or-int/2addr v1, v2

    and-int/lit16 v2, v1, 0x493

    const/16 v3, 0x492

    if-ne v2, v3, :cond_3

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object/from16 v3, p2

    goto/16 :goto_9

    :cond_3
    :goto_2
    invoke-virtual {v0}, Le30/c;->r()Lec3/f2;

    move-result-object v2

    const/4 v11, 0x0

    invoke-static {v2, v7, v11}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v2

    invoke-virtual {v0}, Le30/c;->q()Lec3/f2;

    move-result-object v3

    invoke-static {v3, v7, v11}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v3

    invoke-virtual {v0}, Le30/c;->j()Lec3/f2;

    move-result-object v4

    invoke-static {v4, v7, v11}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v4

    iget-object v5, v0, Le30/c;->T:Lh20/z;

    iget-object v5, v5, Lh20/z;->f:Lec3/h2;

    invoke-static {v5, v7, v11}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v5

    iget-object v6, v0, Le30/c;->M:Lr20/d;

    iget-object v6, v6, Lr20/d;->g:Ln53/e;

    invoke-static {v6, v7, v11}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v6

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lr20/s;

    shr-int/lit8 v12, v1, 0x9

    and-int/lit8 v12, v12, 0xe

    invoke-static {v10, v8, v7, v12}, Lds/p;->m(Lf0/r1;Lr20/s;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lr20/s;

    const v12, 0x959c1cd

    invoke-virtual {v7, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-nez v8, :cond_4

    if-ne v12, v13, :cond_6

    :cond_4
    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lr20/s;

    sget-object v12, Lb30/p2;->w:Lb30/p2;

    if-ne v9, v12, :cond_5

    const/4 v12, 0x1

    goto :goto_3

    :cond_5
    move v12, v11

    :goto_3
    invoke-interface {v8, v12}, Lr20/s;->b0(Z)Lec3/f2;

    move-result-object v12

    invoke-virtual {v7, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v12, Lec3/f2;

    invoke-virtual {v7, v11}, Lp1/q;->q(Z)V

    invoke-static {v12, v7, v11}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v8

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La30/n1;

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_7

    goto :goto_4

    :cond_7
    const/4 v2, 0x0

    :goto_4
    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lr20/s;

    if-eqz v2, :cond_8

    const/4 v12, 0x1

    goto :goto_5

    :cond_8
    move v12, v11

    :goto_5
    const v15, 0x959de6a

    invoke-virtual {v7, v15}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v7, v12}, Lp1/q;->h(Z)Z

    move-result v12

    or-int/2addr v8, v12

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v8, :cond_9

    if-ne v12, v13, :cond_c

    :cond_9
    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lr20/s;

    sget-object v12, Lb30/p2;->w:Lb30/p2;

    if-ne v9, v12, :cond_a

    const/4 v12, 0x1

    goto :goto_6

    :cond_a
    move v12, v11

    :goto_6
    if-eqz v2, :cond_b

    const/4 v13, 0x1

    goto :goto_7

    :cond_b
    move v13, v11

    :goto_7
    invoke-interface {v8, v12, v13}, Lr20/s;->a0(ZZ)Lec3/f2;

    move-result-object v12

    invoke-virtual {v7, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v12, Lec3/f2;

    invoke-virtual {v7, v11}, Lp1/q;->q(Z)V

    invoke-static {v12, v7, v11}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v8

    sget-object v12, Ll0/m;->c:Ll0/g;

    sget-object v13, Lb2/e;->M:Lb2/k;

    invoke-static {v12, v13, v7, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v12

    iget-wide v14, v7, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    move/from16 v16, v1

    iget-boolean v1, v7, Lp1/q;->S:Z

    if-eqz v1, :cond_d

    invoke-virtual {v7, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_8
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v7, v0, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v7, v0, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v1, v7, Lp1/q;->S:Z

    if-nez v1, :cond_e

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    :cond_e
    invoke-static {v13, v7, v13, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v7, v0, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lzy/c;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, La30/k1;

    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lzy/c;

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr20/s;

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lq20/b;

    and-int/lit8 v5, v16, 0xe

    const v8, 0x200008

    or-int/2addr v8, v5

    move-object v5, v0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v8}, Lds/p;->c(Le30/c;Lzy/c;La30/n1;La30/k1;Lzy/c;Lr20/s;Lq20/b;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v7, v2}, Lds/p;->e(FILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move-object v3, v15

    :goto_9
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_10

    new-instance v0, Lat2/u;

    const/4 v6, 0x1

    move-object/from16 v1, p0

    move/from16 v5, p5

    move-object v2, v9

    move-object v4, v10

    invoke-direct/range {v0 .. v6}, Lat2/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method public static final j(Le30/c;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, -0x5b6e9e81

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, v1, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v5

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    or-int/2addr v3, v1

    goto :goto_2

    :cond_2
    move v3, v1

    :goto_2
    and-int/lit8 v6, v3, 0x3

    if-ne v6, v4, :cond_4

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_d

    :cond_4
    :goto_3
    invoke-virtual {v0}, Le30/c;->p()Ln53/e;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v6, v2, v7}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v6

    sget-object v8, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v8

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const-string v10, "PRIMARY_BUTTON"

    invoke-static {v8, v10}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const v10, -0x6576c124

    invoke-virtual {v2, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Lp1/l;->a:Lp1/v0;

    const/4 v13, 0x1

    if-nez v10, :cond_5

    if-ne v11, v12, :cond_6

    :cond_5
    new-instance v11, Lb;

    invoke-direct {v11, v6, v13}, Lb;-><init>(Lp1/t2;I)V

    invoke-virtual {v2, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v2, v7}, Lp1/q;->q(Z)V

    invoke-static {v8, v7, v11}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const v10, -0x6576aee7

    invoke-virtual {v2, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    const/4 v11, 0x0

    if-ne v10, v12, :cond_7

    invoke-static {v11}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v10

    invoke-virtual {v2, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v10, Lp1/c1;

    invoke-virtual {v2, v7}, Lp1/q;->q(Z)V

    sget-object v14, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v2, v14}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/content/Context;

    sget-object v15, Lb2/e;->w:Lb2/m;

    invoke-static {v15, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v15

    move-object/from16 v16, v8

    iget-wide v7, v2, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v2, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v4, v2, Lp1/q;->S:Z

    if-eqz v4, :cond_8

    invoke-virtual {v2, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_8
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_4
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v2, v4, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v2, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v8, v2, Lp1/q;->S:Z

    if-nez v8, :cond_9

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v8, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    :cond_9
    invoke-static {v7, v2, v7, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v2, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, 0x2f8630b9

    invoke-virtual {v2, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit8 v7, v3, 0xe

    if-eq v7, v5, :cond_c

    and-int/lit8 v8, v3, 0x8

    if-eqz v8, :cond_b

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    goto :goto_5

    :cond_b
    const/4 v8, 0x0

    goto :goto_6

    :cond_c
    :goto_5
    const/4 v8, 0x1

    :goto_6
    or-int/2addr v4, v8

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_d

    if-ne v8, v12, :cond_e

    :cond_d
    new-instance v8, La80/f;

    const/4 v4, 0x2

    invoke-direct {v8, v14, v0, v10, v4}, La80/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v2, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v8, Lkotlin/jvm/functions/Function3;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Lp1/q;->q(Z)V

    const v4, 0x2f86a019

    invoke-virtual {v2, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v4, :cond_f

    if-ne v11, v12, :cond_10

    :cond_f
    new-instance v11, Lb30/r2;

    invoke-direct {v11, v10, v6}, Lb30/r2;-><init>(Lp1/c1;Lp1/c1;)V

    invoke-virtual {v2, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v11, Lkotlin/jvm/functions/Function1;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Lp1/q;->q(Z)V

    move-object/from16 v13, v16

    invoke-static {v8, v13, v11, v2, v4}, Lb4/n;->a(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const v4, 0x2f86aff3

    invoke-virtual {v2, v4}, Lp1/q;->e0(I)V

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb30/p3;

    if-eqz v4, :cond_12

    iget-boolean v4, v4, Lb30/p3;->b:Z

    const/4 v8, 0x1

    if-ne v4, v8, :cond_11

    move v4, v8

    goto :goto_8

    :cond_11
    :goto_7
    const/4 v4, 0x0

    goto :goto_8

    :cond_12
    const/4 v8, 0x1

    goto :goto_7

    :goto_8
    if-eqz v4, :cond_16

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb30/p3;

    if-eqz v4, :cond_13

    iget-boolean v4, v4, Lb30/p3;->e:Z

    if-ne v4, v8, :cond_13

    const/4 v4, 0x1

    goto :goto_9

    :cond_13
    const/4 v4, 0x0

    :goto_9
    if-nez v4, :cond_16

    const-string v4, "PRIMARY_BUTTON_DISABLED_OVERLAY"

    invoke-static {v9, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v8, v4}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const v8, 0x2f86d1c3

    invoke-virtual {v2, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_14

    if-ne v9, v12, :cond_15

    :cond_14
    new-instance v9, Le;

    const/16 v8, 0x13

    const/4 v11, 0x0

    invoke-direct {v9, v6, v11, v8}, Le;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v2, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v9, Lc93/m;

    const/4 v6, 0x0

    invoke-virtual {v2, v6}, Lp1/q;->q(Z)V

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    invoke-static {v4, v8, v9}, Lu2/c0;->c(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lc93/m;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4, v2, v6}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_a

    :cond_16
    const/4 v6, 0x0

    :goto_a
    invoke-virtual {v2, v6}, Lp1/q;->q(Z)V

    const/4 v8, 0x1

    invoke-virtual {v2, v8}, Lp1/q;->q(Z)V

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

    const v6, -0x6575e04f

    invoke-virtual {v2, v6}, Lp1/q;->e0(I)V

    if-eq v7, v5, :cond_18

    and-int/lit8 v3, v3, 0x8

    if-eqz v3, :cond_17

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_17

    goto :goto_b

    :cond_17
    const/4 v13, 0x0

    goto :goto_c

    :cond_18
    :goto_b
    move v13, v8

    :goto_c
    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v13, :cond_19

    if-ne v3, v12, :cond_1a

    :cond_19
    new-instance v3, Le;

    const/16 v5, 0x14

    const/4 v11, 0x0

    invoke-direct {v3, v0, v10, v11, v5}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v2, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v3, Lc93/m;

    const/4 v6, 0x0

    invoke-virtual {v2, v6}, Lp1/q;->q(Z)V

    sget v5, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->O:I

    invoke-static {v0, v4, v3, v2}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    :goto_d
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_1b

    new-instance v3, La41/i;

    const/4 v4, 0x6

    invoke-direct {v3, v0, v1, v4}, La41/i;-><init>(Ljava/lang/Object;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method public static final k(ZLa30/k1;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    move-object v7, p2

    check-cast v7, Lp1/q;

    const p2, 0x7ed9f6d3

    invoke-virtual {v7, p2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v7, p0}, Lp1/q;->h(Z)Z

    move-result p2

    if-eqz p2, :cond_0

    const/16 p2, 0x20

    goto :goto_0

    :cond_0
    const/16 p2, 0x10

    :goto_0
    or-int/2addr p2, p3

    invoke-virtual {v7, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x100

    goto :goto_1

    :cond_1
    const/16 v0, 0x80

    :goto_1
    or-int/2addr p2, v0

    and-int/lit16 v0, p2, 0x91

    const/16 v1, 0x90

    if-ne v0, v1, :cond_3

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v0, p1

    goto :goto_3

    :cond_3
    :goto_2
    new-instance v0, Lb30/y2;

    invoke-direct {v0, p0}, Lb30/y2;-><init>(Z)V

    const v1, -0x43e4b42a

    invoke-static {v1, v7, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    shr-int/lit8 p2, p2, 0x6

    and-int/lit8 p2, p2, 0xe

    const v0, 0x186000

    or-int v8, p2, v0

    const/16 v9, 0x2e

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "AnimatedProcessingState"

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v9}, Landroidx/compose/animation/a;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance p2, Lb30/t2;

    const/4 v1, 0x0

    invoke-direct {p2, p0, v0, p3, v1}, Lb30/t2;-><init>(ZLjava/lang/Object;II)V

    iput-object p2, p1, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method public static final l(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v6, p0

    check-cast v6, Lp1/q;

    const p0, -0xf66409

    invoke-virtual {v6, p0}, Lp1/q;->g0(I)Lp1/q;

    if-nez p1, :cond_1

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v6}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p0, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v6, p0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg1/c1;

    invoke-virtual {p0}, Lg1/c1;->e()J

    move-result-wide v2

    const p0, 0x7f07056f

    invoke-static {v6, p0}, Lup/d;->u(Landroidx/compose/runtime/Composer;I)F

    move-result v0

    const/16 p0, 0x30

    int-to-float p0, p0

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {p0, v1}, Landroidx/compose/foundation/layout/d;->l(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const-wide/16 v4, 0x0

    const/4 v1, 0x6

    invoke-static/range {v0 .. v7}, Ls4/g;->a(FIJJLandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    :goto_1
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Ln;

    const/16 v1, 0xc

    invoke-direct {v0, p1, v1}, Ln;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method public static final m(Lf0/r1;Lr20/s;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    move-object v3, p2

    check-cast v3, Lp1/q;

    const p2, 0x56d56c90

    invoke-virtual {v3, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    const/4 v6, 0x4

    if-nez p2, :cond_1

    invoke-virtual {v3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v6

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_4

    and-int/lit8 v0, p3, 0x40

    if-nez v0, :cond_2

    invoke-virtual {v3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_2

    :cond_2
    invoke-virtual {v3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_2
    if-eqz v0, :cond_3

    const/16 v0, 0x20

    goto :goto_3

    :cond_3
    const/16 v0, 0x10

    :goto_3
    or-int/2addr p2, v0

    :cond_4
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_6

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v3}, Lp1/q;->X()V

    goto :goto_6

    :cond_6
    :goto_4
    const/4 v7, 0x0

    new-array v0, v7, [Ljava/lang/Object;

    const v1, 0x18362f26

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v1, v8, :cond_7

    new-instance v1, Lb1/h;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lb1/h;-><init>(I)V

    invoke-virtual {v3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v2, v1

    check-cast v2, Lc93/a;

    invoke-virtual {v3, v7}, Lp1/q;->q(Z)V

    const/16 v4, 0xc00

    const/4 v5, 0x6

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp1/c1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    invoke-interface {v0, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    const v0, 0x18364dd3

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    and-int/lit8 p2, p2, 0xe

    if-ne p2, v6, :cond_8

    const/4 p2, 0x1

    goto :goto_5

    :cond_8
    move p2, v7

    :goto_5
    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_9

    if-ne v0, v8, :cond_a

    :cond_9
    new-instance v0, La20/b;

    const/4 p2, 0x0

    const/16 v1, 0x9

    invoke-direct {v0, p0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v0, Lc93/m;

    invoke-virtual {v3, v7}, Lp1/q;->q(Z)V

    invoke-static {v3, v0, p1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    :cond_b
    :goto_6
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_c

    new-instance v0, Lk;

    const/16 v1, 0xb

    invoke-direct {v0, p0, p1, p3, v1}, Lk;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static final n(Lch/l;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lb2/h;Ly2/k;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v0, p7

    move-object/from16 v13, p8

    check-cast v13, Lp1/q;

    const v3, -0x24195045

    invoke-virtual {v13, v3}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-eqz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int v3, p9, v3

    move-object/from16 v8, p1

    invoke-virtual {v13, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    const/16 v10, 0x10

    const/16 v11, 0x20

    if-eqz v9, :cond_1

    move v9, v11

    goto :goto_1

    :cond_1
    move v9, v10

    :goto_1
    or-int/2addr v3, v9

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x100

    goto :goto_2

    :cond_2
    const/16 v9, 0x80

    :goto_2
    or-int/2addr v3, v9

    move-object/from16 v9, p3

    invoke-virtual {v13, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    const/16 v12, 0x800

    goto :goto_3

    :cond_3
    const/16 v12, 0x400

    :goto_3
    or-int/2addr v3, v12

    move-object/from16 v12, p4

    invoke-virtual {v13, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    const/16 v14, 0x4000

    goto :goto_4

    :cond_4
    const/16 v14, 0x2000

    :goto_4
    or-int/2addr v3, v14

    invoke-virtual {v13, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    const/high16 v14, 0x20000

    goto :goto_5

    :cond_5
    const/high16 v14, 0x10000

    :goto_5
    or-int/2addr v3, v14

    invoke-virtual {v13, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_6

    const/high16 v14, 0x100000

    goto :goto_6

    :cond_6
    const/high16 v14, 0x80000

    :goto_6
    or-int/2addr v3, v14

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-virtual {v13, v14}, Lp1/q;->d(F)Z

    move-result v14

    if-eqz v14, :cond_7

    const/high16 v14, 0x800000

    goto :goto_7

    :cond_7
    const/high16 v14, 0x400000

    :goto_7
    or-int/2addr v3, v14

    const/4 v14, 0x0

    invoke-virtual {v13, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_8

    const/high16 v14, 0x4000000

    goto :goto_8

    :cond_8
    const/high16 v14, 0x2000000

    :goto_8
    or-int/2addr v3, v14

    const/4 v14, 0x1

    invoke-virtual {v13, v14}, Lp1/q;->e(I)Z

    move-result v15

    if-eqz v15, :cond_9

    const/high16 v15, 0x20000000

    goto :goto_9

    :cond_9
    const/high16 v15, 0x10000000

    :goto_9
    or-int/2addr v3, v15

    and-int/lit8 v15, p10, 0xe

    if-nez v15, :cond_b

    invoke-virtual {v13, v14}, Lp1/q;->h(Z)Z

    move-result v15

    if-eqz v15, :cond_a

    move v4, v5

    :cond_a
    or-int v4, p10, v4

    goto :goto_a

    :cond_b
    move/from16 v4, p10

    :goto_a
    and-int/lit8 v5, p10, 0x70

    if-nez v5, :cond_d

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    move v10, v11

    :cond_c
    or-int/2addr v4, v10

    :cond_d
    move/from16 v16, v4

    const v4, 0x5b6db6db

    and-int/2addr v4, v3

    const v5, 0x12492492

    if-ne v4, v5, :cond_f

    and-int/lit8 v4, v16, 0x5b

    const/16 v5, 0x12

    if-ne v4, v5, :cond_f

    invoke-virtual {v13}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_e

    goto :goto_b

    :cond_e
    invoke-virtual {v13}, Lp1/q;->X()V

    goto/16 :goto_d

    :cond_f
    :goto_b
    iget-object v4, v1, Lch/l;->a:Ljava/lang/Object;

    invoke-static {v4, v7, v13}, Lch/v;->c(Ljava/lang/Object;Ly2/k;Landroidx/compose/runtime/Composer;)Lmh/j;

    move-result-object v4

    iget-object v8, v1, Lch/l;->c:Lbh/e;

    shr-int/lit8 v5, v3, 0x3

    and-int/lit16 v10, v5, 0x380

    or-int/lit8 v10, v10, 0x48

    and-int/lit16 v5, v5, 0x1c00

    or-int/2addr v5, v10

    shr-int/lit8 v17, v3, 0x6

    const v10, 0xe000

    and-int v10, v17, v10

    or-int/2addr v5, v10

    shr-int/lit8 v18, v3, 0xc

    const/high16 v3, 0x70000

    and-int v3, v18, v3

    or-int/2addr v3, v5

    const/16 v15, 0x40

    const/4 v12, 0x0

    move v10, v14

    move v14, v3

    move v3, v10

    move-object/from16 v10, p4

    move-object v11, v7

    move-object v7, v4

    invoke-static/range {v7 .. v15}, Lch/k;->a(Lmh/j;Lbh/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly2/k;Lqt/e;Landroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;

    move-result-object v5

    iget-object v4, v7, Lmh/j;->y:Lnh/i;

    instance-of v7, v4, Lch/p;

    const/4 v11, 0x0

    if-nez v7, :cond_13

    const v4, -0x7bfa8e6f

    invoke-virtual {v13, v4}, Lp1/q;->f0(I)V

    and-int/lit8 v4, v17, 0xe

    or-int/lit16 v4, v4, 0x180

    and-int/lit8 v7, v18, 0x70

    or-int/2addr v4, v7

    const v7, 0x2bb5b5d7

    invoke-virtual {v13, v7}, Lp1/q;->f0(I)V

    shr-int/lit8 v4, v4, 0x3

    and-int/lit8 v4, v4, 0xe

    or-int/lit8 v4, v4, 0x30

    invoke-static {v6, v3, v13, v4}, Ll0/q;->e(Lb2/h;ZLandroidx/compose/runtime/Composer;I)Ll0/t;

    move-result-object v4

    const v7, -0x4ee9b9da

    invoke-virtual {v13, v7}, Lp1/q;->f0(I)V

    iget-wide v7, v13, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    new-instance v10, Ly2/b0;

    const/4 v12, 0x0

    invoke-direct {v10, v12, v2}, Ly2/b0;-><init>(ILandroidx/compose/ui/Modifier;)V

    new-instance v12, Lx1/b;

    const v14, -0x1e7bef81

    invoke-direct {v12, v10, v3, v14}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-eqz v10, :cond_10

    invoke-virtual {v13, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_10
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_c
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v13, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v13, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-nez v8, :cond_11

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_12

    :cond_11
    invoke-static {v7, v13, v7, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    new-instance v4, Lp1/d2;

    invoke-direct {v4, v13}, Lp1/d2;-><init>(Landroidx/compose/runtime/Composer;)V

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v12, v4, v13, v7}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v4, 0x7ab4aae9

    invoke-virtual {v13, v4}, Lp1/q;->f0(I)V

    move v4, v3

    new-instance v3, Lch/r;

    move v7, v4

    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    move-object/from16 v8, p6

    move v9, v7

    move-object v7, v6

    move-object/from16 v6, p1

    invoke-direct/range {v3 .. v8}, Lch/r;-><init>(Ll0/u;Lcoil/compose/AsyncImagePainter;Ljava/lang/String;Lb2/h;Ly2/k;)V

    and-int/lit8 v4, v16, 0x70

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v3, v13, v4}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    invoke-static {v13, v9, v11, v11, v11}, Lb9/y;->B(Lp1/q;ZZZZ)V

    goto :goto_d

    :cond_13
    const v3, -0x7bf00c18

    invoke-virtual {v13, v3}, Lp1/q;->f0(I)V

    new-instance v3, Lch/s;

    const/4 v10, 0x0

    move-object/from16 v7, p1

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object v6, v5

    move-object v5, v0

    invoke-direct/range {v3 .. v10}, Lch/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v0, -0x34f0b6ff    # -9390337.0f

    invoke-static {v0, v13, v3}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    and-int/lit8 v0, v17, 0xe

    or-int/lit16 v0, v0, 0xd80

    and-int/lit8 v3, v18, 0x70

    or-int v7, v0, v3

    const/4 v8, 0x0

    const/4 v4, 0x1

    move-object/from16 v3, p5

    move-object v6, v13

    invoke-static/range {v2 .. v8}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_14

    new-instance v0, Lb30/u;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lb30/u;-><init>(Lch/l;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lb2/h;Ly2/k;Lx1/b;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method public static final o(Lch/r;Landroidx/compose/ui/Modifier;Ln2/a;Ljava/lang/String;Lb2/h;Ly2/k;FZLandroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v1, p0

    move/from16 v9, p9

    move-object/from16 v0, p8

    check-cast v0, Lp1/q;

    const v2, 0x347d7a3b

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v9, 0xe

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v9

    goto :goto_1

    :cond_1
    move v2, v9

    :goto_1
    or-int/lit16 v3, v2, 0xb0

    and-int/lit16 v4, v9, 0x1c00

    if-nez v4, :cond_2

    or-int/lit16 v3, v2, 0x4b0

    :cond_2
    const v2, 0xe000

    and-int/2addr v2, v9

    if-nez v2, :cond_3

    or-int/lit16 v3, v3, 0x2000

    :cond_3
    const/high16 v2, 0x70000

    and-int/2addr v2, v9

    if-nez v2, :cond_4

    const/high16 v2, 0x10000

    or-int/2addr v3, v2

    :cond_4
    const/high16 v2, 0x380000

    and-int/2addr v2, v9

    if-nez v2, :cond_5

    const/high16 v2, 0x80000

    or-int/2addr v3, v2

    :cond_5
    const/high16 v2, 0x1c00000

    and-int/2addr v2, v9

    if-nez v2, :cond_6

    const/high16 v2, 0x400000

    or-int/2addr v3, v2

    :cond_6
    const/high16 v2, 0xe000000

    and-int/2addr v2, v9

    if-nez v2, :cond_7

    const/high16 v2, 0x2000000

    or-int/2addr v3, v2

    :cond_7
    const v2, 0xb6db6db

    and-int/2addr v2, v3

    const v3, 0x2492492

    if-ne v2, v3, :cond_9

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_2

    :cond_8
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    goto/16 :goto_a

    :cond_9
    :goto_2
    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v2, v9, 0x1

    if-eqz v2, :cond_b

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_3

    :cond_a
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v7, p1

    move-object/from16 v2, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v8, p6

    move/from16 v10, p7

    goto :goto_4

    :cond_b
    :goto_3
    iget-object v2, v1, Lch/r;->b:Lcoil/compose/AsyncImagePainter;

    iget-object v4, v1, Lch/r;->c:Ljava/lang/String;

    iget-object v5, v1, Lch/r;->d:Lb2/h;

    iget-object v6, v1, Lch/r;->e:Ly2/k;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, Lb2/t;->w:Lb2/t;

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v10, 0x1

    :goto_4
    invoke-virtual {v0}, Lp1/q;->r()V

    sget-object v11, Lch/v;->b:Lnh/e;

    const/4 v11, 0x0

    if-eqz v4, :cond_c

    new-instance v12, Lb30/y4;

    const/4 v13, 0x3

    invoke-direct {v12, v4, v13}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    invoke-static {v7, v11, v12}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    goto :goto_5

    :cond_c
    move-object v12, v7

    :goto_5
    if-eqz v10, :cond_d

    invoke-static {v12}, Lwb3/f;->s(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    :cond_d
    new-instance v13, Lcoil/compose/ContentPainterElement;

    invoke-direct {v13, v2, v5, v6, v8}, Lcoil/compose/ContentPainterElement;-><init>(Ln2/a;Lb2/h;Ly2/k;F)V

    invoke-interface {v12, v13}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, Lch/d;->c:Lch/d;

    const v14, 0x207baf9a

    invoke-virtual {v0, v14}, Lp1/q;->f0(I)V

    iget-wide v14, v0, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-static {v0, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    const v3, 0x53ca7ea5

    invoke-virtual {v0, v3}, Lp1/q;->f0(I)V

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v3, v0, Lp1/q;->S:Z

    if-eqz v3, :cond_e

    new-instance v3, Lch/c;

    const/4 v1, 0x1

    invoke-direct {v3, v11, v1}, Lch/c;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_e
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_6
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v0, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v0, v1, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v0, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v0, Lp1/q;->S:Z

    if-nez v3, :cond_10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v3, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    goto :goto_8

    :cond_f
    :goto_7
    const/4 v1, 0x0

    const/4 v3, 0x1

    goto :goto_9

    :cond_10
    :goto_8
    invoke-static {v14, v0, v14, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_7

    :goto_9
    invoke-static {v0, v3, v1, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object v3, v2

    move-object v2, v7

    move v7, v8

    move v8, v10

    :goto_a
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_11

    new-instance v0, Lb30/p1;

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v9}, Lb30/p1;-><init>(Lch/r;Landroidx/compose/ui/Modifier;Ln2/a;Ljava/lang/String;Lb2/h;Ly2/k;FZI)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method public static final p(La30/n1;La30/k1;Lc93/a;Lc93/a;FLandroidx/compose/ui/Modifier;Lv00/j0;Lux/b;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v0, p9

    const-string v3, "state"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "cardFundingFilter"

    invoke-static {v8, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p8

    check-cast v12, Lp1/q;

    const v3, 0x4a1b08c0    # 2540080.0f

    invoke-virtual {v12, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v0

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    and-int/lit8 v4, v0, 0x30

    if-nez v4, :cond_4

    and-int/lit8 v4, v0, 0x40

    if-nez v4, :cond_2

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_2

    :cond_2
    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit16 v4, v0, 0x180

    move-object/from16 v11, p2

    if-nez v4, :cond_6

    invoke-virtual {v12, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x100

    goto :goto_4

    :cond_5
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v3, v4

    :cond_6
    and-int/lit16 v4, v0, 0xc00

    if-nez v4, :cond_8

    move-object/from16 v4, p3

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x800

    goto :goto_5

    :cond_7
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v3, v7

    goto :goto_6

    :cond_8
    move-object/from16 v4, p3

    :goto_6
    and-int/lit16 v7, v0, 0x6000

    if-nez v7, :cond_a

    invoke-virtual {v12, v5}, Lp1/q;->d(F)Z

    move-result v7

    if-eqz v7, :cond_9

    const/16 v7, 0x4000

    goto :goto_7

    :cond_9
    const/16 v7, 0x2000

    :goto_7
    or-int/2addr v3, v7

    :cond_a
    const/high16 v7, 0x30000

    and-int/2addr v7, v0

    if-nez v7, :cond_c

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    const/high16 v7, 0x20000

    goto :goto_8

    :cond_b
    const/high16 v7, 0x10000

    :goto_8
    or-int/2addr v3, v7

    :cond_c
    const/high16 v7, 0x180000

    and-int/2addr v7, v0

    if-nez v7, :cond_e

    move-object/from16 v7, p6

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    const/high16 v9, 0x100000

    goto :goto_9

    :cond_d
    const/high16 v9, 0x80000

    :goto_9
    or-int/2addr v3, v9

    goto :goto_a

    :cond_e
    move-object/from16 v7, p6

    :goto_a
    const/high16 v9, 0xc00000

    and-int/2addr v9, v0

    if-nez v9, :cond_10

    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_f

    const/high16 v9, 0x800000

    goto :goto_b

    :cond_f
    const/high16 v9, 0x400000

    :goto_b
    or-int/2addr v3, v9

    :cond_10
    const v9, 0x492493

    and-int/2addr v9, v3

    const v10, 0x492492

    if-ne v9, v10, :cond_12

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v9

    if-nez v9, :cond_11

    goto :goto_c

    :cond_11
    invoke-virtual {v12}, Lp1/q;->X()V

    goto/16 :goto_13

    :cond_12
    :goto_c
    sget-object v9, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v9

    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, Ll0/m;->c:Ll0/g;

    sget-object v13, Lb2/e;->M:Lb2/k;

    const/4 v14, 0x0

    invoke-static {v10, v13, v12, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v14, v12, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-eqz v0, :cond_13

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_13
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_d
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v12, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v12, v0, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_15

    :cond_14
    invoke-static {v13, v12, v13, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v12, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La30/g1;->w:La30/g1;

    invoke-virtual {v1, v0}, La30/n1;->a(La30/g1;)La30/l1;

    move-result-object v9

    const v10, 0x4e62bf87    # 9.510507E8f

    invoke-virtual {v12, v10}, Lp1/q;->e0(I)V

    if-nez v9, :cond_16

    move/from16 v18, v3

    const/4 v3, 0x0

    goto :goto_e

    :cond_16
    iget-boolean v7, v9, La30/l1;->b:Z

    iget-object v8, v9, La30/l1;->a:Lq20/a;

    iget-object v10, v9, La30/l1;->c:Lux/j;

    move-object v13, v10

    iget-boolean v10, v1, La30/n1;->d:Z

    iget-object v15, v9, La30/l1;->d:Ljava/util/List;

    shl-int/lit8 v9, v3, 0x9

    const/high16 v14, 0x70000

    and-int/2addr v9, v14

    const/16 v14, 0x1006

    or-int/2addr v9, v14

    shl-int/lit8 v14, v3, 0x3

    const/high16 v16, 0x1c00000

    and-int v16, v14, v16

    or-int v9, v9, v16

    const/high16 v16, 0xe000000

    and-int v14, v14, v16

    or-int v17, v9, v14

    move-object/from16 v16, v12

    const/4 v12, 0x0

    move-object/from16 v14, p7

    move/from16 v18, v3

    move-object v9, v13

    const/4 v3, 0x0

    move-object/from16 v13, p6

    invoke-static/range {v7 .. v17}, Lx30/s0;->d(ZLq20/a;Lux/j;ZLc93/a;Landroidx/compose/ui/Modifier;Lv00/j0;Lux/b;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v12, v16

    :goto_e
    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v1, v0}, La30/n1;->b(La30/g1;)La30/m1;

    move-result-object v7

    const v8, 0x4e6314d1    # 9.5244806E8f

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    sget-object v14, Lb2/t;->w:Lb2/t;

    const/4 v15, 0x3

    if-nez v7, :cond_17

    goto :goto_f

    :cond_17
    const v8, 0x4e631654    # 9.524728E8f

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v0}, La30/n1;->a(La30/g1;)La30/l1;

    move-result-object v8

    if-eqz v8, :cond_18

    const/16 v8, 0x8

    int-to-float v8, v8

    invoke-static {v8, v14}, Landroidx/compose/foundation/layout/d;->k(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v12, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    :cond_18
    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    iget-object v7, v7, La30/m1;->a:Lse/h;

    iget-boolean v8, v1, La30/n1;->d:Z

    shr-int/lit8 v9, v18, 0x3

    and-int/lit16 v13, v9, 0x380

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v9, v4

    invoke-static/range {v7 .. v13}, Lh00/o;->a(Lse/h;ZLc93/a;Landroidx/compose/ui/Modifier;Lh20/n1;Landroidx/compose/runtime/Composer;I)V

    :goto_f
    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    const v4, 0x4e633e3f    # 9.5312685E8f

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    instance-of v4, v2, La30/i1;

    const/4 v7, 0x1

    if-eqz v4, :cond_1a

    move-object v4, v2

    check-cast v4, La30/i1;

    iget-object v4, v4, La30/i1;->a:Lzy/c;

    if-nez v4, :cond_19

    goto :goto_10

    :cond_19
    invoke-static {v4, v12}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v4

    int-to-float v8, v15

    int-to-float v9, v7

    invoke-static {v14, v9, v8}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v4, v8, v12, v3}, Lvd/f;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :cond_1a
    :goto_10
    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    const v4, 0x4e6368e0    # 9.538253E8f

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v0}, La30/n1;->b(La30/g1;)La30/m1;

    move-result-object v4

    if-nez v4, :cond_1c

    invoke-virtual {v1, v0}, La30/n1;->a(La30/g1;)La30/l1;

    move-result-object v0

    if-eqz v0, :cond_1b

    goto :goto_11

    :cond_1b
    move v0, v3

    goto :goto_12

    :cond_1c
    :goto_11
    move v0, v7

    :goto_12
    if-eqz v0, :cond_1d

    invoke-static {v5, v14}, Landroidx/compose/foundation/layout/d;->k(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v12, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    iget v0, v1, La30/n1;->e:I

    invoke-static {v12, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v12, v3}, Lug/m;->i(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    :cond_1d
    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_13
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_1e

    new-instance v0, Lb30/q2;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lb30/q2;-><init>(La30/n1;La30/k1;Lc93/a;Lc93/a;FLandroidx/compose/ui/Modifier;Lv00/j0;Lux/b;I)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method public static final q(Lqc3/o;[Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lqc3/b;

    if-eqz v0, :cond_1

    check-cast p0, Lqc3/b;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x1

    invoke-static {v0, p2}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    const-string v0, "otherFormats"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    invoke-interface {p0}, Lqc3/b;->f()Lqc3/b;

    move-result-object v4

    invoke-interface {v3, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v4}, Lqc3/b;->c()Laa3/u0;

    move-result-object v3

    new-instance v4, Lsc3/f;

    iget-object v3, v3, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Lsc3/f;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lqc3/b;->f()Lqc3/b;

    move-result-object p1

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lqc3/b;->c()Laa3/u0;

    move-result-object p1

    new-instance p2, Lsc3/f;

    iget-object p1, p1, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-direct {p2, p1}, Lsc3/f;-><init>(Ljava/util/List;)V

    invoke-interface {p0}, Lqc3/b;->c()Laa3/u0;

    move-result-object p0

    new-instance p1, Lsc3/b;

    invoke-direct {p1, p2, v0}, Lsc3/b;-><init>(Lsc3/f;Ljava/util/ArrayList;)V

    invoke-virtual {p0, p1}, Laa3/u0;->f(Lsc3/k;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "impossible"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final r(Llb3/y;)Llb3/r;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llb3/y;->p0()Llb3/f1;

    move-result-object p0

    check-cast p0, Llb3/r;

    return-object p0
.end method

.method public static final s(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 3

    const/4 v0, 0x0

    int-to-float v1, v0

    invoke-static {p0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v2

    if-lez v2, :cond_0

    invoke-static {p0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    :cond_0
    new-instance v1, Lf2/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p0, v0, v2}, Lf2/a;-><init>(FFIZ)V

    invoke-static {p1, v1}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static t(Lv00/c0;)V
    .locals 1

    const-string v0, "paymentMethodMetadata"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static u(Le10/l;Le10/k;)V
    .locals 1

    const-string v0, "confirmationOption"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "confirmationArgs"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static final v(Lqc3/o;C)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lqc3/o;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static w(Lko/l;)V
    .locals 0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-interface {p0}, Lko/l;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static final x(JJ)I
    .locals 5

    invoke-static {p0, p1}, Lds/p;->L(J)Z

    move-result v0

    invoke-static {p2, p3}, Lds/p;->L(J)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-eq v0, v1, :cond_1

    if-eqz v0, :cond_0

    return v3

    :cond_0
    return v2

    :cond_1
    invoke-static {p0, p1}, Lds/p;->H(J)F

    move-result v0

    invoke-static {p2, p3}, Lds/p;->H(J)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    float-to-int v0, v0

    invoke-static {p0, p1}, Lds/p;->H(J)F

    move-result v1

    invoke-static {p2, p3}, Lds/p;->H(J)F

    move-result v4

    invoke-static {v1, v4}, Ljava/lang/Math;->min(FF)F

    move-result v1

    const/4 v4, 0x0

    cmpg-float v1, v1, v4

    if-gez v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {p0, p1}, Lds/p;->K(J)Z

    move-result v1

    invoke-static {p2, p3}, Lds/p;->K(J)Z

    move-result p2

    if-eq v1, p2, :cond_4

    invoke-static {p0, p1}, Lds/p;->K(J)Z

    move-result p0

    if-eqz p0, :cond_3

    return v3

    :cond_3
    return v2

    :cond_4
    :goto_0
    return v0
.end method

.method public static final y(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p4, "<this>"

    invoke-static {p0, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const p4, -0x79b9aaba

    invoke-virtual {p3, p4}, Lp1/q;->f0(I)V

    if-eqz p1, :cond_0

    const/4 p1, 0x6

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    sget-object p4, Lb2/t;->w:Lb2/t;

    invoke-interface {p2, p4, p3, p1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-interface {p0, p1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p3, p1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method public static z(Lp93/c;Z)Lp93/f;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "functionClass"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lp93/c;->K:Ljava/util/List;

    new-instance v2, Lp93/f;

    const/4 v3, 0x0

    const/4 v14, 0x1

    move/from16 v4, p1

    invoke-direct {v2, v0, v3, v14, v4}, Lp93/f;-><init>(Lr93/k;Lp93/f;IZ)V

    invoke-virtual {v0}, Lu93/b;->q0()Lr93/q0;

    move-result-object v0

    move-object v3, v1

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lr93/x0;

    invoke-interface {v6}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object v6

    sget-object v7, Llb3/g1;->z:Llb3/g1;

    if-ne v6, v7, :cond_0

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v4}, Lm83/s;->J1(Ljava/lang/Iterable;)Lm83/q;

    move-result-object v3

    new-instance v15, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v15, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Lm83/q;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_1
    move-object/from16 v3, v16

    check-cast v3, Lm83/d0;

    iget-object v4, v3, Lm83/d0;->x:Ljava/util/Iterator;

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v3}, Lm83/d0;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm83/c0;

    iget v5, v3, Lm83/c0;->a:I

    iget-object v3, v3, Lm83/c0;->b:Ljava/lang/Object;

    check-cast v3, Lr93/x0;

    invoke-interface {v3}, Lr93/k;->getName()Lva3/h;

    move-result-object v4

    invoke-virtual {v4}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v4

    const-string v6, "asString(...)"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "T"

    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v4, "instance"

    :goto_2
    move-object v6, v3

    move-object v3, v2

    goto :goto_3

    :cond_1
    const-string v6, "E"

    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const-string v4, "receiver"

    goto :goto_2

    :cond_2
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "toLowerCase(...)"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :goto_3
    new-instance v2, Lu93/w0;

    invoke-static {v4}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v7

    invoke-interface {v6}, Lr93/h;->i()Llb3/c0;

    move-result-object v8

    const-string v4, "getDefaultType(...)"

    invoke-static {v8, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v12, 0x0

    sget-object v13, Lr93/s0;->q:Lr93/v0;

    const/4 v4, 0x0

    sget-object v6, Ls93/g;->a:Ls93/f;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v2 .. v13}, Lu93/w0;-><init>(Lr93/b;Lr93/a1;ILs93/i;Lva3/h;Llb3/y;ZZZLlb3/y;Lr93/s0;)V

    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v2, v3

    goto :goto_1

    :cond_3
    move-object v3, v2

    invoke-static {v1}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr93/x0;

    invoke-interface {v1}, Lr93/h;->i()Llb3/c0;

    move-result-object v8

    sget-object v9, Lr93/a0;->E:Lr93/a0;

    sget-object v10, Lr93/q;->e:Lr93/p;

    const/4 v3, 0x0

    sget-object v5, Lm83/y;->w:Lm83/y;

    move-object v6, v5

    move-object v4, v0

    move-object v7, v15

    invoke-virtual/range {v2 .. v10}, Lu93/q0;->W0(Lr93/q0;Lr93/q0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Llb3/y;Lr93/a0;Lr93/r;)Lu93/q0;

    move-object v3, v2

    iput-boolean v14, v3, Lu93/x;->X:Z

    return-object v3
.end method
