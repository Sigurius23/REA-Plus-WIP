.class public final Lf6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La6/y0;


# static fields
.field public static final a:Lf6/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lf6/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lf6/c;->a:Lf6/c;

    return-void
.end method

.method public static d(Ljava/util/List;Lhc3/d;Lc93/a;I)Lf6/b;
    .locals 4

    and-int/lit8 v0, p3, 0x2

    if-eqz v0, :cond_0

    sget-object p0, Lm83/y;->w:Lm83/y;

    :cond_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    sget-object p1, Lkc3/d;->w:Lkc3/d;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p3

    invoke-virtual {p1, p3}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    :cond_1
    const-string p3, "migrations"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, La6/m0;

    new-instance v0, Le61/e;

    const/4 v1, 0x3

    invoke-direct {v0, p2, v1}, Le61/e;-><init>(Lc93/a;I)V

    sget-object p2, Lf6/c;->a:Lf6/c;

    invoke-direct {p3, p2, v0}, La6/m0;-><init>(La6/y0;Lc93/a;)V

    new-instance p2, Lf6/b;

    new-instance v0, Lio/sentry/hints/j;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lio/sentry/hints/j;-><init>(I)V

    new-instance v1, La6/c;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    new-instance v1, La6/i0;

    invoke-direct {v1, p3, p0, v0, p1}, La6/i0;-><init>(La6/f1;Ljava/util/List;Lio/sentry/hints/j;Lbc3/c0;)V

    invoke-direct {p2, v1}, Lf6/b;-><init>(La6/g;)V

    new-instance p0, Lf6/b;

    invoke-direct {p0, p2}, Lf6/b;-><init>(La6/g;)V

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lf6/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lf6/a;-><init>(Z)V

    return-object v0
.end method

.method public b(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 7

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p1}, Le6/d;->o(Ljava/io/InputStream;)Le6/d;

    move-result-object p1
    :try_end_0
    .catch Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x0

    new-array v1, v0, [Lf6/e;

    new-instance v2, Lf6/a;

    invoke-direct {v2, v0}, Lf6/a;-><init>(Z)V

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lf6/e;

    const-string v3, "pairs"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lf6/a;->e()V

    array-length v3, v1

    const/4 v4, 0x0

    if-gtz v3, :cond_3

    invoke-virtual {p1}, Le6/d;->m()Ljava/util/Map;

    move-result-object p1

    const-string v0, "getPreferencesMap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le6/h;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Le6/h;->C()I

    move-result v3

    if-nez v3, :cond_0

    const/4 v3, -0x1

    goto :goto_1

    :cond_0
    sget-object v5, Lf6/g;->a:[I

    invoke-static {v3}, Le4/p;->e(I)I

    move-result v3

    aget v3, v5, v3

    :goto_1
    packed-switch v3, :pswitch_data_0

    :pswitch_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_1
    new-instance p1, Landroidx/datastore/core/CorruptionException;

    const-string v0, "Value not set."

    invoke-direct {p1, v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :pswitch_2
    new-instance v3, Lf6/d;

    invoke-direct {v3, v1}, Lf6/d;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Le6/h;->u()Landroidx/datastore/preferences/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/h;->size()I

    move-result v1

    if-nez v1, :cond_1

    sget-object v0, Landroidx/datastore/preferences/protobuf/c0;->b:[B

    goto :goto_2

    :cond_1
    new-array v5, v1, [B

    invoke-virtual {v0, v1, v5}, Landroidx/datastore/preferences/protobuf/h;->e(I[B)V

    move-object v0, v5

    :goto_2
    invoke-virtual {v2, v3, v0}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_3
    invoke-static {v1}, Lge3/g;->V(Ljava/lang/String;)Lf6/d;

    move-result-object v1

    invoke-virtual {v0}, Le6/h;->B()Le6/f;

    move-result-object v0

    invoke-virtual {v0}, Le6/f;->o()Landroidx/datastore/preferences/protobuf/b0;

    move-result-object v0

    const-string v3, "getStringsList(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_4
    invoke-static {v1}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v1

    invoke-virtual {v0}, Le6/h;->A()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_5
    invoke-static {v1}, Lge3/g;->I(Ljava/lang/String;)Lf6/d;

    move-result-object v1

    invoke-virtual {v0}, Le6/h;->z()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    goto/16 :goto_0

    :pswitch_6
    invoke-static {v1}, Lge3/g;->C(Ljava/lang/String;)Lf6/d;

    move-result-object v1

    invoke-virtual {v0}, Le6/h;->y()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    goto/16 :goto_0

    :pswitch_7
    new-instance v3, Lf6/d;

    invoke-direct {v3, v1}, Lf6/d;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Le6/h;->w()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    goto/16 :goto_0

    :pswitch_8
    invoke-static {v1}, Lge3/g;->x(Ljava/lang/String;)Lf6/d;

    move-result-object v1

    invoke-virtual {v0}, Le6/h;->x()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    goto/16 :goto_0

    :pswitch_9
    invoke-static {v1}, Lge3/g;->f(Ljava/lang/String;)Lf6/d;

    move-result-object v1

    invoke-virtual {v0}, Le6/h;->t()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    goto/16 :goto_0

    :pswitch_a
    new-instance p1, Landroidx/datastore/core/CorruptionException;

    const-string v0, "Value case is null."

    invoke-direct {p1, v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_2
    invoke-virtual {v2}, Lf6/f;->d()Lf6/a;

    move-result-object p1

    return-object p1

    :cond_3
    aget-object p1, v1, v0

    throw v4

    :catch_0
    move-exception p1

    new-instance v0, Landroidx/datastore/core/CorruptionException;

    const-string v1, "Unable to parse preferences proto."

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_a
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public c(Ljava/io/OutputStream;Ljava/lang/Object;)V
    .locals 6

    check-cast p2, Lf6/f;

    invoke-virtual {p2}, Lf6/f;->a()Ljava/util/Map;

    move-result-object p2

    invoke-static {}, Le6/d;->n()Le6/b;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf6/d;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, v2, Lf6/d;->a:Ljava/lang/String;

    instance-of v3, v1, Ljava/lang/Boolean;

    if-eqz v3, :cond_0

    invoke-static {}, Le6/h;->D()Le6/g;

    move-result-object v3

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/x;->c()V

    iget-object v4, v3, Landroidx/datastore/preferences/protobuf/x;->x:Landroidx/datastore/preferences/protobuf/z;

    check-cast v4, Le6/h;

    invoke-static {v4, v1}, Le6/h;->q(Le6/h;Z)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/x;->a()Landroidx/datastore/preferences/protobuf/z;

    move-result-object v1

    check-cast v1, Le6/h;

    goto/16 :goto_1

    :cond_0
    instance-of v3, v1, Ljava/lang/Float;

    if-eqz v3, :cond_1

    invoke-static {}, Le6/h;->D()Le6/g;

    move-result-object v3

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/x;->c()V

    iget-object v4, v3, Landroidx/datastore/preferences/protobuf/x;->x:Landroidx/datastore/preferences/protobuf/z;

    check-cast v4, Le6/h;

    invoke-static {v4, v1}, Le6/h;->r(Le6/h;F)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/x;->a()Landroidx/datastore/preferences/protobuf/z;

    move-result-object v1

    check-cast v1, Le6/h;

    goto/16 :goto_1

    :cond_1
    instance-of v3, v1, Ljava/lang/Double;

    if-eqz v3, :cond_2

    invoke-static {}, Le6/h;->D()Le6/g;

    move-result-object v3

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/x;->c()V

    iget-object v1, v3, Landroidx/datastore/preferences/protobuf/x;->x:Landroidx/datastore/preferences/protobuf/z;

    check-cast v1, Le6/h;

    invoke-static {v1, v4, v5}, Le6/h;->o(Le6/h;D)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/x;->a()Landroidx/datastore/preferences/protobuf/z;

    move-result-object v1

    check-cast v1, Le6/h;

    goto/16 :goto_1

    :cond_2
    instance-of v3, v1, Ljava/lang/Integer;

    if-eqz v3, :cond_3

    invoke-static {}, Le6/h;->D()Le6/g;

    move-result-object v3

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/x;->c()V

    iget-object v4, v3, Landroidx/datastore/preferences/protobuf/x;->x:Landroidx/datastore/preferences/protobuf/z;

    check-cast v4, Le6/h;

    invoke-static {v4, v1}, Le6/h;->s(Le6/h;I)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/x;->a()Landroidx/datastore/preferences/protobuf/z;

    move-result-object v1

    check-cast v1, Le6/h;

    goto/16 :goto_1

    :cond_3
    instance-of v3, v1, Ljava/lang/Long;

    if-eqz v3, :cond_4

    invoke-static {}, Le6/h;->D()Le6/g;

    move-result-object v3

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/x;->c()V

    iget-object v1, v3, Landroidx/datastore/preferences/protobuf/x;->x:Landroidx/datastore/preferences/protobuf/z;

    check-cast v1, Le6/h;

    invoke-static {v1, v4, v5}, Le6/h;->l(Le6/h;J)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/x;->a()Landroidx/datastore/preferences/protobuf/z;

    move-result-object v1

    check-cast v1, Le6/h;

    goto :goto_1

    :cond_4
    instance-of v3, v1, Ljava/lang/String;

    if-eqz v3, :cond_5

    invoke-static {}, Le6/h;->D()Le6/g;

    move-result-object v3

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/x;->c()V

    iget-object v4, v3, Landroidx/datastore/preferences/protobuf/x;->x:Landroidx/datastore/preferences/protobuf/z;

    check-cast v4, Le6/h;

    invoke-static {v4, v1}, Le6/h;->m(Le6/h;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/x;->a()Landroidx/datastore/preferences/protobuf/z;

    move-result-object v1

    check-cast v1, Le6/h;

    goto :goto_1

    :cond_5
    instance-of v3, v1, Ljava/util/Set;

    if-eqz v3, :cond_6

    invoke-static {}, Le6/h;->D()Le6/g;

    move-result-object v3

    invoke-static {}, Le6/f;->p()Le6/e;

    move-result-object v4

    check-cast v1, Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    invoke-virtual {v4, v1}, Le6/e;->d(Ljava/lang/Iterable;)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/x;->c()V

    iget-object v1, v3, Landroidx/datastore/preferences/protobuf/x;->x:Landroidx/datastore/preferences/protobuf/z;

    check-cast v1, Le6/h;

    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/x;->a()Landroidx/datastore/preferences/protobuf/z;

    move-result-object v4

    check-cast v4, Le6/f;

    invoke-static {v1, v4}, Le6/h;->n(Le6/h;Le6/f;)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/x;->a()Landroidx/datastore/preferences/protobuf/z;

    move-result-object v1

    check-cast v1, Le6/h;

    goto :goto_1

    :cond_6
    instance-of v3, v1, [B

    if-eqz v3, :cond_7

    invoke-static {}, Le6/h;->D()Le6/g;

    move-result-object v3

    check-cast v1, [B

    const/4 v4, 0x0

    array-length v5, v1

    invoke-static {v1, v4, v5}, Landroidx/datastore/preferences/protobuf/h;->d([BII)Landroidx/datastore/preferences/protobuf/h;

    move-result-object v1

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/x;->c()V

    iget-object v4, v3, Landroidx/datastore/preferences/protobuf/x;->x:Landroidx/datastore/preferences/protobuf/z;

    check-cast v4, Le6/h;

    invoke-static {v4, v1}, Le6/h;->p(Le6/h;Landroidx/datastore/preferences/protobuf/h;)V

    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/x;->a()Landroidx/datastore/preferences/protobuf/z;

    move-result-object v1

    check-cast v1, Le6/h;

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/x;->c()V

    iget-object v3, v0, Landroidx/datastore/preferences/protobuf/x;->x:Landroidx/datastore/preferences/protobuf/z;

    check-cast v3, Le6/d;

    invoke-static {v3}, Le6/d;->l(Le6/d;)Landroidx/datastore/preferences/protobuf/l0;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Landroidx/datastore/preferences/protobuf/l0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    const-string v0, "PreferencesSerializer does not support type: "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/x;->a()Landroidx/datastore/preferences/protobuf/z;

    move-result-object p2

    check-cast p2, Le6/d;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/z;->a(Landroidx/datastore/preferences/protobuf/z0;)I

    move-result v0

    sget-object v1, Landroidx/datastore/preferences/protobuf/n;->i:Ljava/util/logging/Logger;

    const/16 v1, 0x1000

    if-le v0, v1, :cond_9

    move v0, v1

    :cond_9
    new-instance v1, Landroidx/datastore/preferences/protobuf/n;

    invoke-direct {v1, p1, v0}, Landroidx/datastore/preferences/protobuf/n;-><init>(Ljava/io/OutputStream;I)V

    invoke-virtual {p2, v1}, Landroidx/datastore/preferences/protobuf/z;->b(Landroidx/datastore/preferences/protobuf/n;)V

    iget p1, v1, Landroidx/datastore/preferences/protobuf/n;->g:I

    if-lez p1, :cond_a

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/n;->v0()V

    :cond_a
    return-void
.end method
