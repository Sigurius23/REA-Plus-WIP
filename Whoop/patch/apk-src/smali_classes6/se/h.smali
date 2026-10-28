.class public abstract Lse/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static A(Lio/sentry/r4;Ljava/lang/String;Lio/sentry/j3;Lio/sentry/v0;)Z
    .locals 5

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x7

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "platform"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v4, 0xd

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "request"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v4, 0xc

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "release"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v4, 0xb

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "event_id"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v4, 0xa

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "extra"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v4, 0x9

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "user"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v4, 0x8

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "tags"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    move v4, v1

    goto :goto_0

    :sswitch_7
    const-string v0, "dist"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    const/4 v4, 0x6

    goto :goto_0

    :sswitch_8
    const-string v0, "sdk"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    const/4 v4, 0x5

    goto :goto_0

    :sswitch_9
    const-string v0, "breadcrumbs"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_0

    :cond_9
    const/4 v4, 0x4

    goto :goto_0

    :sswitch_a
    const-string v0, "environment"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_0

    :cond_a
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_b
    const-string v0, "contexts"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_0

    :cond_b
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_c
    const-string v0, "server_name"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto :goto_0

    :cond_c
    move v4, v3

    goto :goto_0

    :sswitch_d
    const-string v0, "debug_meta"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto :goto_0

    :cond_d
    move v4, v2

    :goto_0
    packed-switch v4, :pswitch_data_0

    return v2

    :pswitch_0
    invoke-interface {p2}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/r4;->H:Ljava/lang/String;

    return v3

    :pswitch_1
    new-instance p1, Lio/sentry/clientreport/a;

    const/16 v0, 0x11

    invoke-direct {p1, v0}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-interface {p2, p3, p1}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/protocol/q;

    iput-object p1, p0, Lio/sentry/r4;->z:Lio/sentry/protocol/q;

    return v3

    :pswitch_2
    invoke-interface {p2}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/r4;->F:Ljava/lang/String;

    return v3

    :pswitch_3
    new-instance p1, Lio/sentry/clientreport/e;

    invoke-direct {p1, v2}, Lio/sentry/clientreport/e;-><init>(Z)V

    invoke-interface {p2, p3, p1}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/protocol/v;

    iput-object p1, p0, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    return v3

    :pswitch_4
    invoke-interface {p2}, Lio/sentry/j3;->U0()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/r4;->O:Ljava/util/AbstractMap;

    return v3

    :pswitch_5
    new-instance p1, Lio/sentry/clientreport/a;

    const/16 v0, 0x1d

    invoke-direct {p1, v0}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-interface {p2, p3, p1}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/protocol/h0;

    iput-object p1, p0, Lio/sentry/r4;->I:Lio/sentry/protocol/h0;

    return v3

    :pswitch_6
    invoke-interface {p2}, Lio/sentry/j3;->U0()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/r4;->E:Ljava/util/AbstractMap;

    return v3

    :pswitch_7
    invoke-interface {p2}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/r4;->L:Ljava/lang/String;

    return v3

    :pswitch_8
    new-instance p1, Lio/sentry/clientreport/a;

    const/16 v0, 0x13

    invoke-direct {p1, v0}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-interface {p2, p3, p1}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/protocol/t;

    iput-object p1, p0, Lio/sentry/r4;->y:Lio/sentry/protocol/t;

    return v3

    :pswitch_9
    new-instance p1, Lio/sentry/d;

    invoke-direct {p1, v2}, Lio/sentry/d;-><init>(I)V

    invoke-interface {p2, p3, p1}, Lio/sentry/j3;->c1(Lio/sentry/v0;Lio/sentry/v1;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/r4;->M:Ljava/util/List;

    return v3

    :pswitch_a
    invoke-interface {p2}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/r4;->G:Ljava/lang/String;

    return v3

    :pswitch_b
    invoke-static {p2, p3}, Lio/sentry/clientreport/a;->c(Lio/sentry/j3;Lio/sentry/v0;)Lio/sentry/protocol/c;

    move-result-object p1

    iget-object p0, p0, Lio/sentry/r4;->x:Lio/sentry/protocol/c;

    invoke-virtual {p0, p1}, Lio/sentry/protocol/c;->l(Lio/sentry/protocol/c;)V

    return v3

    :pswitch_c
    invoke-interface {p2}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/r4;->K:Ljava/lang/String;

    return v3

    :pswitch_d
    new-instance p1, Lio/sentry/clientreport/a;

    invoke-direct {p1, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-interface {p2, p3, p1}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/protocol/d;

    iput-object p1, p0, Lio/sentry/r4;->N:Lio/sentry/protocol/d;

    return v3

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6db2cb8f -> :sswitch_d
        -0x2d39e9f9 -> :sswitch_c
        -0x21d07f5c -> :sswitch_b
        -0x51ecded -> :sswitch_a
        -0x3112f30 -> :sswitch_9
        0x1bc3a -> :sswitch_8
        0x2f0da6 -> :sswitch_7
        0x363419 -> :sswitch_6
        0x36ebcb -> :sswitch_5
        0x5c79410 -> :sswitch_4
        0x1093c0e0 -> :sswitch_3
        0x41012807 -> :sswitch_2
        0x414ef28f -> :sswitch_1
        0x6fbd6873 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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

.method public static final B(Ln23/e;)Ljava/lang/Throwable;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ln23/a;

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Ln23/c;

    if-eqz v0, :cond_1

    check-cast p0, Ln23/c;

    iget-object p0, p0, Ln23/c;->d:Ljava/lang/Throwable;

    return-object p0

    :cond_1
    instance-of v0, p0, Ln23/d;

    if-eqz v0, :cond_2

    check-cast p0, Ln23/d;

    iget-object p0, p0, Ln23/d;->b:Ljava/lang/Throwable;

    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final C(Lzt/q;Lx93/d0;)Ls93/b;
    .locals 7

    const-string v0, "wildcardType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lx93/d0;->c()Lx93/a0;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v0, Lia3/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lia3/c;-><init>(Lzt/q;Lma3/b;Z)V

    invoke-virtual {v0}, Lia3/c;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    move-object p1, p0

    check-cast p1, Lxb3/e;

    invoke-virtual {p1}, Lxb3/e;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lxb3/e;->next()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ls93/b;

    sget-object v2, Lfa3/r;->b:[Lva3/e;

    array-length v3, v2

    move v4, v1

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    invoke-interface {v0}, Ls93/b;->b()Lva3/e;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_1
    check-cast p1, Ls93/b;

    return-object p1

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Nullability annotations on unbounded wildcards aren\'t supported"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static D()[B
    .locals 3

    const/16 v0, 0x20

    invoke-static {v0}, Lse/b;->W(I)[B

    move-result-object v0

    const/4 v1, 0x0

    aget-byte v2, v0, v1

    or-int/lit8 v2, v2, 0x7

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    const/16 v1, 0x1f

    aget-byte v2, v0, v1

    and-int/lit8 v2, v2, 0x3f

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    return-object v0
.end method

.method public static final synthetic E()Lr7/q0;
    .locals 3

    const v0, 0xf4240

    int-to-double v0, v0

    sget-object v2, Lr7/q0;->y:Lr7/l0;

    invoke-static {v0, v1}, Lr7/l0;->a(D)Lr7/q0;

    move-result-object v0

    return-object v0
.end method

.method public static F(D)J
    .locals 3

    invoke-static {p0, p1}, Lse/h;->L(D)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0, p1}, Ljava/lang/Math;->getExponent(D)I

    move-result v0

    invoke-static {p0, p1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p0

    const-wide v1, 0xfffffffffffffL

    and-long/2addr p0, v1

    const/16 v1, -0x3ff

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    shl-long/2addr p0, v0

    return-wide p0

    :cond_0
    const-wide/high16 v0, 0x10000000000000L

    or-long/2addr p0, v0

    return-wide p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "not a normal value"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final G(Ln0/n;)I
    .locals 4

    iget-object v0, p0, Ln0/n;->o:Lh0/d2;

    sget-object v1, Lh0/d2;->w:Lh0/d2;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Ln0/n;->e()J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    :goto_0
    long-to-int p0, v0

    return p0

    :cond_0
    invoke-virtual {p0}, Ln0/n;->e()J

    move-result-wide v0

    const/16 p0, 0x20

    shr-long/2addr v0, p0

    goto :goto_0
.end method

.method public static final H(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    check-cast p0, Lp1/q;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    if-nez p1, :cond_0

    const p1, 0x7f140925

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    const p1, 0x7f1402bc

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    const p1, 0x7f1402bf

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 v0, 0x3

    if-ne p1, v0, :cond_3

    const p1, 0x7f140426

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    const/4 v0, 0x4

    if-ne p1, v0, :cond_4

    const p1, 0x7f140464

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    const/4 v0, 0x5

    if-ne p1, v0, :cond_5

    const p1, 0x7f140ae7

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    const/4 v0, 0x6

    if-ne p1, v0, :cond_6

    const p1, 0x7f140ae6

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_6
    const/4 v0, 0x7

    if-ne p1, v0, :cond_7

    const p1, 0x7f140840

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_7
    const-string p0, ""

    return-object p0
.end method

.method public static final I(Lha3/a;)Z
    .locals 1

    instance-of v0, p0, Lr93/w;

    if-eqz v0, :cond_0

    sget-object v0, Lha3/e;->h0:Lbb3/b;

    invoke-interface {p0, v0}, Lr93/b;->h0(Lr93/a;)Ljava/lang/Object;

    move-result-object p0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final J(Llf/a;[B)[B
    .locals 2

    const-string v0, "fn"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    array-length v1, p1

    invoke-interface {p0, p1, v0, v1}, Llf/a;->update([BII)V

    invoke-interface {p0}, Llf/a;->a()[B

    move-result-object p0

    return-object p0
.end method

.method public static final K([BLc93/a;)[B
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hashSupplier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llf/a;

    invoke-static {p1, p0}, Lse/h;->J(Llf/a;[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static L(D)Z
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Math;->getExponent(D)I

    move-result p0

    const/16 p1, 0x3ff

    if-gt p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final M(Lch3/h;)Z
    .locals 1

    const-string v0, "javaTypeEnhancementState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lch3/h;->z:Ljava/lang/Object;

    check-cast p0, Ldc3/s;

    sget-object v0, Lfa3/r;->a:Lva3/e;

    invoke-virtual {p0, v0}, Ldc3/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    sget-object v0, Lfa3/b0;->z:Lfa3/b0;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static N(B)Z
    .locals 1

    const/16 v0, -0x41

    if-le p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final O(Lp3/r;Lp3/r;F)Lp3/r;
    .locals 0

    iget p0, p0, Lp3/r;->w:I

    iget p1, p1, Lp3/r;->w:I

    invoke-static {p2, p0, p1}, Le93/b;->P(FII)I

    move-result p0

    const/4 p1, 0x1

    const/16 p2, 0x3e8

    invoke-static {p0, p1, p2}, Le93/b;->n(III)I

    move-result p0

    new-instance p1, Lp3/r;

    invoke-direct {p1, p0}, Lp3/r;-><init>(I)V

    return-object p1
.end method

.method public static final P(Lkotlin/jvm/functions/Function1;)Leb/x0;
    .locals 3

    new-instance v0, Leb/y0;

    invoke-direct {v0}, Leb/y0;-><init>()V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean p0, v0, Leb/y0;->b:Z

    iget-object v1, v0, Leb/y0;->a:Leb/w0;

    iput-boolean p0, v1, Leb/w0;->a:Z

    iget-boolean p0, v0, Leb/y0;->c:Z

    iput-boolean p0, v1, Leb/w0;->b:Z

    iget-object p0, v0, Leb/y0;->e:Ljava/lang/String;

    if-eqz p0, :cond_0

    iget-boolean v2, v0, Leb/y0;->f:Z

    iget-boolean v0, v0, Leb/y0;->g:Z

    iput-object p0, v1, Leb/w0;->d:Ljava/lang/String;

    const/4 p0, -0x1

    iput p0, v1, Leb/w0;->c:I

    iput-boolean v2, v1, Leb/w0;->e:Z

    iput-boolean v0, v1, Leb/w0;->f:Z

    goto :goto_0

    :cond_0
    iget p0, v0, Leb/y0;->d:I

    iget-boolean v2, v0, Leb/y0;->f:Z

    iget-boolean v0, v0, Leb/y0;->g:Z

    iput p0, v1, Leb/w0;->c:I

    const/4 p0, 0x0

    iput-object p0, v1, Leb/w0;->d:Ljava/lang/String;

    iput-boolean v2, v1, Leb/w0;->e:Z

    iput-boolean v0, v1, Leb/w0;->f:Z

    :goto_0
    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object p0

    return-object p0
.end method

.method public static final Q(Lkotlin/jvm/functions/Function1;)Lrf/o;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    sget v1, Lrf/o;->H:I

    new-instance v1, Lrf/o;

    new-instance v2, Lrf/r;

    new-instance v3, Lrf/q;

    invoke-direct {v3}, Lrf/q;-><init>()V

    invoke-interface {p0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v2, v3}, Lrf/r;-><init>(Lrf/q;)V

    invoke-direct {v1, v2, v0}, Lrf/o;-><init>(Lrf/r;Lud3/l0;)V

    return-object v1

    :cond_0
    new-instance p0, Lrf/o;

    sget-object v1, Lrf/r;->m:Lrf/r;

    invoke-direct {p0, v1, v0}, Lrf/o;-><init>(Lrf/r;Lud3/l0;)V

    return-object p0
.end method

.method public static R([B)[B
    .locals 28

    move-object/from16 v0, p0

    array-length v1, v0

    const-string v2, "Private key must have 32 bytes."

    const/16 v3, 0x20

    if-ne v1, v3, :cond_8

    new-array v1, v3, [B

    const/16 v4, 0x9

    const/4 v5, 0x0

    aput-byte v4, v1, v5

    array-length v4, v0

    if-ne v4, v3, :cond_7

    const/16 v2, 0xb

    new-array v4, v2, [J

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    aget-byte v6, v0, v5

    and-int/lit16 v6, v6, 0xf8

    int-to-byte v6, v6

    aput-byte v6, v0, v5

    const/16 v6, 0x1f

    aget-byte v7, v0, v6

    and-int/lit8 v7, v7, 0x7f

    int-to-byte v7, v7

    aput-byte v7, v0, v6

    or-int/lit8 v7, v7, 0x40

    int-to-byte v7, v7

    aput-byte v7, v0, v6

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v7

    aget-byte v8, v7, v6

    and-int/lit8 v8, v8, 0x7f

    int-to-byte v8, v8

    aput-byte v8, v7, v6

    move v6, v5

    :goto_0
    sget-object v8, Lcom/google/crypto/tink/internal/a;->a:[[B

    const/4 v9, 0x7

    if-ge v6, v9, :cond_1

    aget-object v9, v8, v6

    invoke-static {v9, v7}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result v9

    if-nez v9, :cond_0

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Banned public key: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v2, v8, v6

    invoke-static {v2}, Lse/a;->K([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v7}, Lcom/google/crypto/tink/internal/a;->f([B)[J

    move-result-object v6

    const/16 v7, 0x13

    new-array v8, v7, [J

    new-array v9, v7, [J

    const-wide/16 v10, 0x1

    aput-wide v10, v9, v5

    new-array v12, v7, [J

    aput-wide v10, v12, v5

    new-array v13, v7, [J

    new-array v14, v7, [J

    new-array v15, v7, [J

    aput-wide v10, v15, v5

    move-wide/from16 v16, v10

    new-array v10, v7, [J

    new-array v11, v7, [J

    aput-wide v16, v11, v5

    const/16 v2, 0xa

    invoke-static {v6, v5, v8, v5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_1
    if-ge v5, v3, :cond_4

    rsub-int/lit8 v18, v5, 0x1f

    aget-byte v3, v0, v18

    and-int/lit16 v3, v3, 0xff

    const/4 v7, 0x0

    :goto_2
    const/16 v2, 0x8

    if-ge v7, v2, :cond_3

    rsub-int/lit8 v2, v7, 0x7

    shr-int v2, v3, v2

    and-int/lit8 v2, v2, 0x1

    invoke-static {v12, v8, v2}, Lcom/google/crypto/tink/internal/a;->u([J[JI)V

    invoke-static {v13, v9, v2}, Lcom/google/crypto/tink/internal/a;->u([J[JI)V

    move-object/from16 v19, v0

    move-object/from16 v20, v1

    const/16 v0, 0xa

    invoke-static {v12, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v1

    move/from16 p0, v3

    const/16 v0, 0x13

    new-array v3, v0, [J

    move/from16 v21, v5

    new-array v5, v0, [J

    move/from16 v22, v7

    new-array v7, v0, [J

    move-object/from16 v23, v4

    new-array v4, v0, [J

    move/from16 v24, v2

    new-array v2, v0, [J

    move-object/from16 v25, v11

    new-array v11, v0, [J

    move-object/from16 v26, v3

    new-array v3, v0, [J

    invoke-static {v12, v12, v13}, Lcom/google/crypto/tink/internal/a;->t([J[J[J)V

    invoke-static {v13, v1, v13}, Lcom/google/crypto/tink/internal/a;->s([J[J[J)V

    const/16 v1, 0xa

    invoke-static {v8, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    invoke-static {v8, v8, v9}, Lcom/google/crypto/tink/internal/a;->t([J[J[J)V

    invoke-static {v9, v0, v9}, Lcom/google/crypto/tink/internal/a;->s([J[J[J)V

    invoke-static {v4, v8, v13}, Lcom/google/crypto/tink/internal/a;->l([J[J[J)V

    invoke-static {v2, v12, v9}, Lcom/google/crypto/tink/internal/a;->l([J[J[J)V

    invoke-static {v4}, Lcom/google/crypto/tink/internal/a;->o([J)V

    invoke-static {v4}, Lcom/google/crypto/tink/internal/a;->n([J)V

    invoke-static {v2}, Lcom/google/crypto/tink/internal/a;->o([J)V

    invoke-static {v2}, Lcom/google/crypto/tink/internal/a;->n([J)V

    move-object/from16 v27, v8

    const/4 v8, 0x0

    invoke-static {v4, v8, v0, v8, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v4, v4, v2}, Lcom/google/crypto/tink/internal/a;->t([J[J[J)V

    invoke-static {v2, v0, v2}, Lcom/google/crypto/tink/internal/a;->s([J[J[J)V

    invoke-static {v3, v4}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v11, v2}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v2, v11, v6}, Lcom/google/crypto/tink/internal/a;->l([J[J[J)V

    invoke-static {v2}, Lcom/google/crypto/tink/internal/a;->o([J)V

    invoke-static {v2}, Lcom/google/crypto/tink/internal/a;->n([J)V

    invoke-static {v3, v8, v14, v8, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v2, v8, v15, v8, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v5, v12}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v7, v13}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v10, v5, v7}, Lcom/google/crypto/tink/internal/a;->l([J[J[J)V

    invoke-static {v10}, Lcom/google/crypto/tink/internal/a;->o([J)V

    invoke-static {v10}, Lcom/google/crypto/tink/internal/a;->n([J)V

    invoke-static {v7, v5, v7}, Lcom/google/crypto/tink/internal/a;->s([J[J[J)V

    const/16 v0, 0x12

    const-wide/16 v2, 0x0

    move-object/from16 v4, v26

    invoke-static {v4, v1, v0, v2, v3}, Ljava/util/Arrays;->fill([JIIJ)V

    const/4 v8, 0x0

    :goto_3
    if-ge v8, v1, :cond_2

    aget-wide v0, v7, v8

    const-wide/32 v2, 0x1db41

    mul-long/2addr v0, v2

    aput-wide v0, v4, v8

    add-int/lit8 v8, v8, 0x1

    const/16 v1, 0xa

    goto :goto_3

    :cond_2
    invoke-static {v4}, Lcom/google/crypto/tink/internal/a;->n([J)V

    invoke-static {v4, v4, v5}, Lcom/google/crypto/tink/internal/a;->t([J[J[J)V

    move-object/from16 v11, v25

    invoke-static {v11, v7, v4}, Lcom/google/crypto/tink/internal/a;->l([J[J[J)V

    invoke-static {v11}, Lcom/google/crypto/tink/internal/a;->o([J)V

    invoke-static {v11}, Lcom/google/crypto/tink/internal/a;->n([J)V

    move/from16 v0, v24

    invoke-static {v10, v14, v0}, Lcom/google/crypto/tink/internal/a;->u([J[JI)V

    invoke-static {v11, v15, v0}, Lcom/google/crypto/tink/internal/a;->u([J[JI)V

    add-int/lit8 v7, v22, 0x1

    move-object v0, v15

    move-object v15, v9

    move-object v9, v0

    move-object v0, v12

    move-object v12, v10

    move-object v10, v0

    move-object v0, v13

    move-object v13, v11

    move-object v11, v0

    move/from16 v3, p0

    move-object v8, v14

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    move/from16 v5, v21

    move-object/from16 v4, v23

    move-object/from16 v14, v27

    goto/16 :goto_2

    :cond_3
    move-object/from16 v19, v0

    move-object/from16 v20, v1

    move-object/from16 v23, v4

    move/from16 v21, v5

    move-object/from16 v27, v8

    add-int/lit8 v5, v21, 0x1

    const/16 v2, 0xa

    const/16 v3, 0x20

    const/16 v7, 0x13

    goto/16 :goto_1

    :cond_4
    move-object/from16 v20, v1

    move v0, v2

    move-object/from16 v23, v4

    new-array v1, v0, [J

    invoke-static {v1, v13}, Lcom/google/crypto/tink/internal/a;->j([J[J)V

    move-object/from16 v2, v23

    invoke-static {v2, v12, v1}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    new-array v1, v0, [J

    new-array v3, v0, [J

    const/16 v4, 0xb

    new-array v5, v4, [J

    new-array v7, v4, [J

    new-array v4, v4, [J

    invoke-static {v1, v6, v2}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    invoke-static {v3, v6, v2}, Lcom/google/crypto/tink/internal/a;->t([J[J[J)V

    new-array v6, v0, [J

    const-wide/32 v10, 0x76d06

    const/16 v17, 0x0

    aput-wide v10, v6, v17

    invoke-static {v7, v3, v6}, Lcom/google/crypto/tink/internal/a;->t([J[J[J)V

    invoke-static {v7, v7, v9}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    invoke-static {v7, v7, v8}, Lcom/google/crypto/tink/internal/a;->t([J[J[J)V

    invoke-static {v7, v7, v1}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    invoke-static {v7, v7, v8}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    move/from16 v6, v17

    :goto_4
    if-ge v6, v0, :cond_5

    aget-wide v10, v7, v6

    const-wide/16 v12, 0x4

    mul-long/2addr v10, v12

    aput-wide v10, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_5
    invoke-static {v5}, Lcom/google/crypto/tink/internal/a;->n([J)V

    invoke-static {v7, v1, v9}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    invoke-static {v7, v7, v9}, Lcom/google/crypto/tink/internal/a;->s([J[J[J)V

    invoke-static {v4, v3, v8}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    invoke-static {v7, v7, v4}, Lcom/google/crypto/tink/internal/a;->t([J[J[J)V

    invoke-static {v7, v7}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v5}, Lcom/google/crypto/tink/internal/a;->b([J)[B

    move-result-object v0

    invoke-static {v7}, Lcom/google/crypto/tink/internal/a;->b([J)[B

    move-result-object v1

    invoke-static {v0, v1}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {v2}, Lcom/google/crypto/tink/internal/a;->b([J)[B

    move-result-object v0

    return-object v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Arithmetic error in curve multiplication with the public key: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static/range {v20 .. v20}, Lse/a;->K([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/InvalidKeyException;

    invoke-direct {v0, v2}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/InvalidKeyException;

    invoke-direct {v0, v2}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static S(Ljava/lang/String;Ltb/a;)Lob/k;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "connection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "PRAGMA table_info(`"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "`)"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_0
    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v7, 0x0

    const-string v9, "name"

    const/4 v10, 0x0

    if-nez v4, :cond_0

    :try_start_1
    sget-object v4, Lm83/z;->w:Lm83/z;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v2, v10}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v1, v0

    goto/16 :goto_c

    :cond_0
    :try_start_2
    invoke-static {v2, v9}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v11, "type"

    invoke-static {v2, v11}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "notnull"

    invoke-static {v2, v12}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "pk"

    invoke-static {v2, v13}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "dflt_value"

    invoke-static {v2, v14}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v14

    new-instance v15, Ln83/f;

    invoke-direct {v15}, Ln83/f;-><init>()V

    :cond_1
    invoke-interface {v2, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v19

    invoke-interface {v2, v11}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v20

    invoke-interface {v2, v12}, Ltb/c;->getLong(I)J

    move-result-wide v16

    cmp-long v16, v16, v7

    if-eqz v16, :cond_2

    const/16 v22, 0x1

    goto :goto_0

    :cond_2
    const/16 v22, 0x0

    :goto_0
    invoke-interface {v2, v13}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-interface {v2, v14}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_3

    move-object/from16 v21, v10

    goto :goto_1

    :cond_3
    invoke-interface {v2, v14}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v21, v6

    :goto_1
    new-instance v16, Lob/h;

    const/16 v18, 0x2

    move/from16 v17, v5

    invoke-direct/range {v16 .. v22}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v16

    move-object/from16 v5, v19

    invoke-virtual {v15, v5, v6}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v15}, Ln83/f;->b()Ln83/f;

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v2, v10}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "PRAGMA foreign_key_list(`"

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_3
    const-string v5, "id"

    invoke-static {v2, v5}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "seq"

    invoke-static {v2, v6}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v11, "table"

    invoke-static {v2, v11}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "on_delete"

    invoke-static {v2, v12}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "on_update"

    invoke-static {v2, v13}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v13

    invoke-static {v2}, Lse/g;->H(Ltb/c;)Ljava/util/List;

    move-result-object v14

    invoke-interface {v2}, Ltb/c;->reset()V

    new-instance v15, Ln83/i;

    invoke-direct {v15}, Ln83/i;-><init>()V

    :goto_3
    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v16

    if-eqz v16, :cond_8

    invoke-interface {v2, v6}, Ltb/c;->getLong(I)J

    move-result-wide v16

    cmp-long v16, v16, v7

    if-eqz v16, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v2, v5}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v19, v14

    check-cast v19, Ljava/lang/Iterable;

    move/from16 v20, v5

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface/range {v19 .. v19}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_4
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_6

    move/from16 v21, v6

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v22, v14

    move-object v14, v6

    check-cast v14, Lob/g;

    iget v14, v14, Lob/g;->w:I

    if-ne v14, v7, :cond_5

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    move/from16 v6, v21

    move-object/from16 v14, v22

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v1, v0

    goto/16 :goto_b

    :cond_6
    move/from16 v21, v6

    move-object/from16 v22, v14

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lob/g;

    iget-object v7, v6, Lob/g;->y:Ljava/lang/String;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v6, v6, Lob/g;->z:Ljava/lang/String;

    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_7
    new-instance v23, Lob/i;

    invoke-interface {v2, v11}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v24

    invoke-interface {v2, v12}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v25

    invoke-interface {v2, v13}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v27

    move-object/from16 v26, v8

    move-object/from16 v28, v10

    invoke-direct/range {v23 .. v28}, Lob/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    move-object/from16 v5, v23

    invoke-virtual {v15, v5}, Ln83/i;->add(Ljava/lang/Object;)Z

    move/from16 v5, v20

    move/from16 v6, v21

    move-object/from16 v14, v22

    const-wide/16 v7, 0x0

    const/4 v10, 0x0

    goto/16 :goto_3

    :cond_8
    invoke-static {v15}, Ldt/b;->g(Ln83/i;)Ln83/i;

    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/4 v6, 0x0

    invoke-static {v2, v6}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "PRAGMA index_list(`"

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_4
    invoke-static {v2, v9}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v6, "origin"

    invoke-static {v2, v6}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "unique"

    invoke-static {v2, v7}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const/4 v8, -0x1

    if-eq v3, v8, :cond_9

    if-eq v6, v8, :cond_9

    if-ne v7, v8, :cond_a

    :cond_9
    const/4 v6, 0x0

    goto :goto_8

    :cond_a
    new-instance v8, Ln83/i;

    invoke-direct {v8}, Ln83/i;-><init>()V

    :goto_6
    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v9

    if-eqz v9, :cond_e

    invoke-interface {v2, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    const-string v10, "c"

    invoke-virtual {v10, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_b

    goto :goto_6

    :cond_b
    invoke-interface {v2, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v2, v7}, Ltb/c;->getLong(I)J

    move-result-wide v10

    const-wide/16 v12, 0x1

    cmp-long v10, v10, v12

    if-nez v10, :cond_c

    const/4 v10, 0x1

    goto :goto_7

    :cond_c
    const/4 v10, 0x0

    :goto_7
    invoke-static {v9, v1, v10}, Lse/g;->I(Ljava/lang/String;Ltb/a;Z)Lob/j;

    move-result-object v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-nez v9, :cond_d

    const/4 v10, 0x0

    invoke-static {v2, v10}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    const/4 v10, 0x0

    goto :goto_9

    :cond_d
    :try_start_5
    invoke-virtual {v8, v9}, Ln83/i;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :catchall_2
    move-exception v0

    move-object v1, v0

    goto :goto_a

    :cond_e
    invoke-static {v8}, Ldt/b;->g(Ln83/i;)Ln83/i;

    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    const/4 v6, 0x0

    invoke-static {v2, v6}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    move-object v10, v1

    goto :goto_9

    :goto_8
    invoke-static {v2, v6}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    move-object v10, v6

    :goto_9
    new-instance v1, Lob/k;

    invoke-direct {v1, v0, v4, v5, v10}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    return-object v1

    :goto_a
    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception v0

    invoke-static {v2, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0

    :goto_b
    :try_start_7
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :catchall_4
    move-exception v0

    invoke-static {v2, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0

    :goto_c
    :try_start_8
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :catchall_5
    move-exception v0

    invoke-static {v2, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static T(Landroid/view/View;Z)V
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static final U(Lr93/m1;)Lr93/r;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lfa3/p;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr93/r;

    if-nez v0, :cond_0

    invoke-static {p0}, Lr93/q;->g(Lr93/m1;)Lr93/r;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static final V(Ljava/lang/String;Ljava/io/FileNotFoundException;)Ljava/lang/Exception;
    .locals 5

    const-class v0, Ljava/lang/String;

    const-string v1, "sys.user."

    const/4 v2, 0x0

    :try_start_0
    const-string v3, "android.os.SystemProperties"

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const-string v4, "get"

    filled-new-array {v0, v0}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const-string v3, "getMethod(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    const-string v4, "obtain(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Process;->myUserHandle()Landroid/os/UserHandle;

    move-result-object v4

    invoke-virtual {v4, v3, v2}, Landroid/os/UserHandle;->writeToParcel(Landroid/os/Parcel;I)V

    invoke-virtual {v3, v2}, Landroid/os/Parcel;->setDataPosition(I)V

    invoke-virtual {v3}, Landroid/os/Parcel;->readInt()I

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    :try_start_2
    const-string v3, "DirectBootExceptionUtil"

    const-string v4, "Error when reading current user id. Selected default user id `0`."

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move v3, v2

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ".ce_available"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "false"

    filled-new-array {v1, v3}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    const-string v1, "true"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-static {p1, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_1
    if-eqz v2, :cond_0

    goto :goto_2

    :cond_0
    if-nez p0, :cond_1

    :goto_2
    return-object p1

    :cond_1
    new-instance v0, Ljava/io/File;

    const-string v1, "siblingTestFile.txt"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_2
    :try_start_3
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    return-object p1

    :catchall_2
    move-exception p0

    goto :goto_3

    :catch_0
    :try_start_4
    new-instance p0, Landroidx/datastore/core/DirectBootUsageException;

    invoke-direct {p0, p1}, Landroidx/datastore/core/DirectBootUsageException;-><init>(Ljava/io/FileNotFoundException;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    return-object p0

    :goto_3
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    throw p0
.end method

.method public static final a(Lq00/i0;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v6, p4

    check-cast v6, Lp1/q;

    const v0, -0x26dcb45e

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p5, v0

    move-object/from16 v2, p1

    invoke-virtual {v6, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    const/16 v4, 0x10

    if-eqz v3, :cond_1

    const/16 v3, 0x20

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    or-int/2addr v0, v3

    move-object/from16 v3, p2

    invoke-virtual {v6, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x100

    goto :goto_2

    :cond_2
    const/16 v5, 0x80

    :goto_2
    or-int/2addr v0, v5

    move-object/from16 v11, p3

    invoke-virtual {v6, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x800

    goto :goto_3

    :cond_3
    const/16 v5, 0x400

    :goto_3
    or-int/2addr v0, v5

    and-int/lit16 v5, v0, 0x493

    const/16 v7, 0x492

    if-ne v5, v7, :cond_5

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v8, v6

    goto/16 :goto_7

    :cond_5
    :goto_4
    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v12, 0x0

    invoke-static {v5, v7, v6, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v14, v6, Lp1/q;->S:Z

    if-eqz v14, :cond_6

    invoke-virtual {v6, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_5
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v6, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v6, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-nez v8, :cond_7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    :cond_7
    invoke-static {v7, v6, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v6, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v5, "wallet_screen_pay_button"

    invoke-static {v13, v5}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    int-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    const/16 v19, 0x5

    const/4 v15, 0x0

    const/16 v17, 0x0

    move/from16 v16, v4

    move/from16 v18, v5

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    iget-object v5, v1, Lq00/i0;->k:Lzy/c;

    invoke-static {v5, v6}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v5

    move-object v2, v4

    invoke-virtual {v1}, Lq00/i0;->c()Lh00/o0;

    move-result-object v4

    shl-int/lit8 v7, v0, 0x6

    and-int/lit16 v7, v7, 0x1c00

    or-int/lit16 v7, v7, 0x6006

    shl-int/lit8 v8, v0, 0x9

    const/high16 v9, 0x70000

    and-int/2addr v8, v9

    or-int v9, v7, v8

    const/16 v10, 0xc0

    move-object v8, v6

    const/4 v6, 0x1

    move-object v7, v3

    move-object v3, v5

    move-object/from16 v5, p1

    invoke-static/range {v2 .. v10}, Lh00/n0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lh00/o0;Lc93/a;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    iget-object v2, v1, Lq00/i0;->l:Lzy/c;

    const v3, 0x1eca3275

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    const/4 v9, 0x1

    if-nez v2, :cond_9

    goto :goto_6

    :cond_9
    const-string v3, "wallet_screen_pay_another_way_button"

    invoke-static {v13, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v1}, Lq00/i0;->c()Lh00/o0;

    move-result-object v4

    iget-boolean v4, v4, Lh00/o0;->w:Z

    xor-int/2addr v4, v9

    invoke-static {v2, v8}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v2

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit8 v7, v0, 0x6

    move v5, v4

    move-object v4, v2

    move-object v2, v3

    move v3, v5

    move-object v6, v8

    move-object v5, v11

    invoke-static/range {v2 .. v7}, Lvp/c;->t(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_6
    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_a

    new-instance v0, Lo71/b;

    const/4 v6, 0x3

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lo71/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method public static final b(ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 28

    move/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, -0x26ad022d

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v2, 0x6

    const/4 v5, 0x2

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    and-int/lit8 v4, v4, 0x13

    const/16 v6, 0x12

    if-ne v4, v6, :cond_5

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v3}, Lp1/q;->X()V

    goto/16 :goto_5

    :cond_5
    :goto_3
    const-string v4, "wallet_add_payment_method_row"

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v7, 0x3c

    int-to-float v7, v7

    invoke-static {v7, v4}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v7, 0x0

    const/4 v8, 0x6

    invoke-static {v4, v0, v7, v1, v8}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->a:Ll0/e;

    const/16 v9, 0x30

    invoke-static {v8, v7, v3, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v8, v3, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v3, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v11, v3, Lp1/q;->S:Z

    if-eqz v11, :cond_6

    invoke-virtual {v3, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_4
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v3, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v3, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, v3, Lp1/q;->S:Z

    if-nez v9, :cond_7

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_8

    :cond_7
    invoke-static {v8, v3, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v3, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, 0x7f140f68

    invoke-static {v3, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget v7, Lg00/g;->g:F

    const/4 v8, 0x0

    invoke-static {v6, v7, v8, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const v6, -0x1a6f7841

    invoke-virtual {v3, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v3, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg00/b;

    const/4 v7, 0x0

    invoke-virtual {v3, v7}, Lp1/q;->q(Z)V

    iget-wide v8, v6, Lg00/b;->q:J

    const v6, -0x548d6062

    invoke-virtual {v3, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v3, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg00/e;

    invoke-virtual {v3, v7}, Lp1/q;->q(Z)V

    iget-object v6, v6, Lg00/e;->c:Ll3/v0;

    const/16 v26, 0x0

    const v27, 0xfff8

    move-object/from16 v24, v3

    move-object v3, v4

    move-object v4, v5

    move-object/from16 v23, v6

    move-wide v5, v8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    invoke-static/range {v3 .. v27}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v24

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_9

    new-instance v4, La41/j;

    const/16 v5, 0x8

    invoke-direct {v4, v0, v1, v2, v5}, La41/j;-><init>(ZLc93/a;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method public static final c(Lzy/c;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v2, 0x2576aaa0

    invoke-virtual {v13, v2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x20

    goto :goto_1

    :cond_1
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v2, v3

    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    invoke-virtual {v13}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v13}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v13, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    sget-object v4, Lb2/t;->w:Lb2/t;

    const-string v5, "wallet_screen_dialog_tag"

    invoke-static {v4, v5}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const v5, -0x1a6f7841

    invoke-virtual {v13, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v13, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg00/b;

    const/4 v6, 0x0

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    iget-wide v8, v5, Lg00/b;->b:J

    new-instance v5, Lb30/w2;

    const/16 v6, 0x1b

    invoke-direct {v5, v6, v1, v3}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v3, -0x30ea1ea8

    invoke-static {v3, v13, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    new-instance v5, Lg40/x0;

    const/4 v6, 0x1

    invoke-direct {v5, v0, v6}, Lg40/x0;-><init>(Lzy/c;I)V

    const v6, -0x6422402c

    invoke-static {v6, v13, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    shr-int/lit8 v2, v2, 0x3

    and-int/lit8 v2, v2, 0xe

    const v5, 0x301b0

    or-int v14, v2, v5

    const/16 v15, 0x358

    move-object v2, v3

    move-object v3, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    invoke-static/range {v1 .. v15}, Ldc/a;->a(Lc93/a;Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Lc93/m;Li2/a1;JJLc4/a0;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_4

    new-instance v3, Lpp2/o;

    const/4 v4, 0x2

    move/from16 v5, p3

    invoke-direct {v3, v0, v1, v5, v4}, Lpp2/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method public static final d(Lb30/q;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v12, p2

    const-string v0, "onBrandChoiceChanged"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p3

    check-cast v7, Lp1/q;

    const v0, 0x693088b7

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x4

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p4, v0

    move-object/from16 v13, p1

    invoke-virtual {v7, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x20

    goto :goto_1

    :cond_1
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v0, v3

    invoke-virtual {v7, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x100

    goto :goto_2

    :cond_2
    const/16 v3, 0x80

    :goto_2
    or-int/2addr v0, v3

    and-int/lit16 v3, v0, 0x93

    const/16 v4, 0x92

    if-ne v3, v4, :cond_4

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v9, v7

    move-object v14, v12

    goto/16 :goto_a

    :cond_4
    :goto_3
    const v3, -0x6bf11b62

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-ne v3, v15, :cond_5

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lp1/c1;

    const/4 v4, 0x0

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    const v5, -0x6bf10d6c

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v15, :cond_6

    new-instance v5, Lb01/m;

    const/4 v6, 0x2

    invoke-direct {v5, v6, v3}, Lb01/m;-><init>(ILp1/c1;)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v5, Lc93/a;

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    const/4 v6, 0x7

    sget-object v8, Lb2/t;->w:Lb2/t;

    const/4 v9, 0x0

    invoke-static {v8, v4, v9, v5, v6}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const v6, -0x6bf0f637

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    and-int/lit8 v6, v0, 0xe

    if-ne v6, v2, :cond_7

    const/4 v6, 0x1

    goto :goto_4

    :cond_7
    move v6, v4

    :goto_4
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v6, :cond_8

    if-ne v10, v15, :cond_9

    :cond_8
    new-instance v10, La1/b;

    const/16 v6, 0xf

    invoke-direct {v10, v1, v6}, La1/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    invoke-static {v5, v4, v10}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-string v6, "dropdown_menu_clickable"

    invoke-static {v5, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v10, v7, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v14, v7, Lp1/q;->S:Z

    if-eqz v14, :cond_a

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_a
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_5
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v7, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v7, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-nez v4, :cond_b

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    :cond_b
    invoke-static {v10, v7, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v7, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v4, 0xa

    int-to-float v4, v4

    invoke-static {v4, v8}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->K:Lb2/l;

    const/4 v10, 0x4

    int-to-float v10, v10

    invoke-static {v10}, Ll0/m;->i(F)Ll0/k;

    move-result-object v10

    const/16 v1, 0x36

    invoke-static {v10, v5, v7, v1}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v12, v7, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v12, v7, Lp1/q;->S:Z

    if-eqz v12, :cond_d

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_d
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v7, v14, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v7, Lp1/q;->S:Z

    if-nez v1, :cond_e

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    :cond_e
    invoke-static {v5, v7, v5, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v7, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lb30/q;->getLabel()Lzy/c;

    move-result-object v1

    invoke-static {v1, v7}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "selected_card_brand_dropdown_tag_"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lb30/q;->getIcon()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, v7, v2}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v1

    const/16 v10, 0x30

    const/16 v11, 0x78

    move-object v5, v3

    const/4 v3, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v8, v6

    const/4 v6, 0x0

    move-object v9, v7

    const/4 v7, 0x0

    move-object v12, v8

    const/4 v8, 0x0

    move v13, v2

    move-object v2, v1

    move v1, v13

    const/4 v13, 0x1

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    const v2, 0x7f0807c2

    invoke-static {v2, v9, v1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v2

    const/16 v8, 0x30

    move-object v7, v9

    const/16 v9, 0xc

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    invoke-static/range {v2 .. v9}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v9, v7

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    invoke-interface {v12}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const v3, 0x7f140fd4

    invoke-static {v3}, Ls4/i;->h(I)Lzy/b;

    move-result-object v3

    invoke-static {v9}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v4

    iget-wide v5, v4, Ld40/n;->e:J

    invoke-static {v9}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v4

    iget-wide v7, v4, Ld40/n;->d:J

    const v4, 0x7afa0113

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    and-int/lit16 v4, v0, 0x380

    const/16 v10, 0x100

    if-ne v4, v10, :cond_10

    move v4, v13

    goto :goto_7

    :cond_10
    move v4, v1

    :goto_7
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v4, :cond_12

    if-ne v10, v15, :cond_11

    goto :goto_8

    :cond_11
    move-object/from16 v14, p2

    goto :goto_9

    :cond_12
    :goto_8
    new-instance v10, Lb30/r;

    const/4 v4, 0x0

    move-object/from16 v14, p2

    invoke-direct {v10, v14, v12, v4}, Lb30/r;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    move-object v4, v10

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const v10, 0x7afa109f

    invoke-static {v10, v9, v1}, Lr;->h(ILp1/q;Z)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v15, :cond_13

    new-instance v10, Lb01/m;

    const/4 v11, 0x3

    invoke-direct {v10, v11, v12}, Lb01/m;-><init>(ILp1/c1;)V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v10, Lc93/a;

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    shl-int/lit8 v0, v0, 0x6

    and-int/lit16 v1, v0, 0x380

    const/high16 v11, 0xc00000

    or-int/2addr v1, v11

    and-int/lit16 v0, v0, 0x1c00

    or-int v11, v1, v0

    move-object v0, v10

    move-object v10, v9

    move-object v9, v0

    move v0, v2

    move-object v1, v3

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    invoke-static/range {v0 .. v11}, Lse/b;->s(ZLzy/b;Lg40/g3;Ljava/util/List;Lkotlin/jvm/functions/Function1;JJLc93/a;Landroidx/compose/runtime/Composer;I)V

    move-object v9, v10

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_14

    new-instance v0, La01/d;

    const/4 v5, 0x2

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    move-object v3, v14

    invoke-direct/range {v0 .. v5}, La01/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method public static final e(Ly00/c0;Lg40/m3;Lx30/e0;ZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    const-string v0, "expiryDateController"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cvcController"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p6

    check-cast v11, Lp1/q;

    const v0, -0x5c2475c

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p7, v0

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/16 v6, 0x20

    goto :goto_1

    :cond_1
    const/16 v6, 0x10

    :goto_1
    or-int/2addr v0, v6

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x100

    goto :goto_2

    :cond_2
    const/16 v6, 0x80

    :goto_2
    or-int/2addr v0, v6

    invoke-virtual {v11, v4}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x800

    goto :goto_3

    :cond_3
    const/16 v6, 0x400

    :goto_3
    or-int/2addr v0, v6

    invoke-virtual {v11, v5}, Lp1/q;->h(Z)Z

    move-result v6

    const/16 v7, 0x4000

    if-eqz v6, :cond_4

    move v6, v7

    goto :goto_4

    :cond_4
    const/16 v6, 0x2000

    :goto_4
    or-int/2addr v0, v6

    const/high16 v6, 0x30000

    or-int/2addr v0, v6

    const v6, 0x12493

    and-int/2addr v6, v0

    const v8, 0x12492

    if-ne v6, v8, :cond_6

    invoke-virtual {v11}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object/from16 v6, p5

    goto/16 :goto_7

    :cond_6
    :goto_5
    const v6, -0x4425fc74

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-nez v6, :cond_7

    if-ne v8, v9, :cond_9

    :cond_7
    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v6

    if-eqz v4, :cond_8

    new-instance v8, Lg40/c3;

    sget-object v10, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v10, "date"

    invoke-static {v10}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v10

    invoke-direct {v8, v10, v2}, Lg40/c3;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/m3;)V

    invoke-virtual {v6, v8}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_8
    new-instance v8, Lx30/f0;

    sget-object v10, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardCvc$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v10

    invoke-direct {v8, v10, v3}, Lx30/f0;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lx30/e0;)V

    invoke-virtual {v6, v8}, Ln83/c;->add(Ljava/lang/Object;)Z

    invoke-static {v6}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v6

    new-instance v8, Lg40/t2;

    invoke-virtual {v1}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v10

    new-instance v12, Lg40/s2;

    invoke-direct {v12, v6}, Lg40/s2;-><init>(Ljava/util/List;)V

    invoke-direct {v8, v10, v6, v12}, Lg40/t2;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;Lg40/s2;)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v8, Lg40/t2;

    const/4 v6, 0x0

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    const v10, -0x44259f91

    invoke-virtual {v11, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    const/4 v13, 0x0

    if-nez v10, :cond_a

    if-ne v12, v9, :cond_b

    :cond_a
    invoke-static {v8, v13}, Lg40/l0;->b(Lg40/y2;Lzy/c;)Lg40/w2;

    move-result-object v12

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v12, Lg40/w2;

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    const v14, -0x44259286

    invoke-virtual {v11, v14}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    const v15, 0xe000

    and-int/2addr v0, v15

    if-ne v0, v7, :cond_c

    const/4 v0, 0x1

    goto :goto_6

    :cond_c
    move v0, v6

    :goto_6
    or-int/2addr v0, v14

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_d

    if-ne v7, v9, :cond_e

    :cond_d
    new-instance v7, Lb30/i5;

    const/4 v0, 0x5

    invoke-direct {v7, v12, v5, v13, v0}, Lb30/i5;-><init>(Ljava/lang/Object;ZLq83/d;I)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v7, Lc93/m;

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    invoke-static {v11, v7, v10}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v0, "wallet_screen_recollection_form_fields"

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v0}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    iget-object v0, v8, Lg40/t2;->b:Ljava/util/List;

    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg40/b3;

    invoke-virtual {v0}, Lg40/b3;->a()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v9

    sget v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v0, v0, 0x9

    const/16 v6, 0x1c6

    or-int/2addr v0, v6

    const/4 v13, 0x0

    const/4 v6, 0x1

    sget-object v8, Lm83/a0;->w:Lm83/a0;

    move-object v7, v12

    move v12, v0

    invoke-static/range {v6 .. v13}, Lkotlin/jvm/internal/j;->p(ZLg40/w2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v14

    :goto_7
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_f

    new-instance v0, Lq00/b0;

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lq00/b0;-><init>(Ly00/c0;Lg40/m3;Lx30/e0;ZZLandroidx/compose/ui/Modifier;I)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method public static final f(Ly00/c0;ZLjava/lang/String;FLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 39

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, -0x40569f5d

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v3, v6, 0x30

    const/16 v7, 0x10

    if-nez v3, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    move v3, v7

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit16 v3, v6, 0x180

    if-nez v3, :cond_5

    move-object/from16 v3, p2

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v0, v8

    goto :goto_4

    :cond_5
    move-object/from16 v3, p2

    :goto_4
    and-int/lit16 v8, v6, 0xc00

    if-nez v8, :cond_7

    invoke-virtual {v12, v4}, Lp1/q;->d(F)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_5

    :cond_6
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v0, v8

    :cond_7
    and-int/lit16 v8, v6, 0x6000

    if-nez v8, :cond_9

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x4000

    goto :goto_6

    :cond_8
    const/16 v8, 0x2000

    :goto_6
    or-int/2addr v0, v8

    :cond_9
    and-int/lit16 v8, v0, 0x2493

    const/16 v9, 0x2492

    if-ne v8, v9, :cond_b

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v8

    if-nez v8, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v12}, Lp1/q;->X()V

    goto/16 :goto_9

    :cond_b
    :goto_7
    const-string v8, "collapsed_wallet_row_tag"

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v8}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v10, 0x40

    int-to-float v10, v10

    const/4 v11, 0x0

    const/4 v13, 0x1

    invoke-static {v8, v11, v10, v13}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v10, 0x0

    const/4 v14, 0x6

    invoke-static {v8, v2, v10, v5, v14}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v7, v7

    invoke-static {v8, v11, v7, v13}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget v16, Lg00/g;->g:F

    const/16 v19, 0x0

    const/16 v20, 0xe

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v10, Lb2/e;->K:Lb2/l;

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    const/16 v11, 0x36

    invoke-static {v7, v10, v12, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_c

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_8
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v12, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v12, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_d

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_e

    :cond_d
    invoke-static {v13, v12, v13, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v12, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v7, "collapsed_wallet_header_tag"

    invoke-static {v9, v7}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v4, v7}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const v7, -0x1a6f7841

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    sget-object v10, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v12, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lg00/b;

    const/4 v14, 0x0

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    move-object v15, v8

    iget-wide v7, v13, Lg00/b;->o:J

    shr-int/lit8 v13, v0, 0x6

    and-int/lit8 v29, v13, 0xe

    const/16 v30, 0x0

    const v31, 0x1fff8

    move v13, v11

    move-object/from16 v28, v12

    const-wide/16 v11, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    const/4 v14, 0x0

    move-object/from16 v20, v9

    move-wide/from16 v37, v7

    move-object v7, v10

    move-wide/from16 v9, v37

    move-object v8, v15

    const/4 v15, 0x0

    const v21, -0x1a6f7841

    const/16 v22, 0x6

    const-wide/16 v16, 0x0

    move/from16 v23, v18

    const/16 v18, 0x0

    move/from16 v24, v19

    const/16 v19, 0x0

    move-object/from16 v26, v20

    move/from16 v25, v21

    const-wide/16 v20, 0x0

    move/from16 v27, v22

    const/16 v22, 0x0

    move/from16 v32, v23

    const/16 v23, 0x0

    move/from16 v33, v24

    const/16 v24, 0x0

    move/from16 v34, v25

    const/16 v25, 0x0

    move-object/from16 v35, v26

    const/16 v26, 0x0

    move/from16 v36, v27

    const/16 v27, 0x0

    move-object/from16 v33, v7

    move-object v7, v3

    move-object/from16 v3, v33

    move/from16 v33, v32

    move/from16 v32, v0

    move-object/from16 v0, v35

    invoke-static/range {v7 .. v31}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v28

    const-string v7, "collapsed_wallet_payment_details_tag"

    invoke-static {v0, v7}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    shl-int/lit8 v8, v32, 0x6

    and-int/lit16 v8, v8, 0x380

    or-int v8, v33, v8

    invoke-static {v7, v1, v12, v8}, Lse/a;->j(Landroidx/compose/ui/Modifier;Ly00/c0;Landroidx/compose/runtime/Composer;I)V

    const v7, 0x7f08085b

    const/4 v8, 0x0

    invoke-static {v7, v12, v8}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v7

    const v8, 0x7f141114

    invoke-static {v12, v8}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0x16

    int-to-float v9, v9

    const/16 v17, 0x0

    const/16 v18, 0xb

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v13, v0

    move/from16 v16, v9

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v9, "collapsed_wallet_chevron_icon_tag"

    invoke-static {v0, v9}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const v0, -0x1a6f7841

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg00/b;

    const/4 v3, 0x0

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    iget-wide v10, v0, Lg00/b;->w:J

    const/16 v13, 0x180

    const/4 v14, 0x0

    invoke-static/range {v7 .. v14}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_f

    new-instance v0, Lq00/x;

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v6}, Lq00/x;-><init>(Ly00/c0;ZLjava/lang/String;FLc93/a;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method public static final g(Ljava/lang/String;Ljava/lang/String;FZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 38

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, -0x744bb117

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    move-object/from16 v0, p0

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v6

    goto :goto_1

    :cond_1
    move-object/from16 v0, p0

    move v2, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    const/16 v8, 0x10

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    move v9, v8

    :goto_2
    or-int/2addr v2, v9

    goto :goto_3

    :cond_3
    move-object/from16 v7, p1

    :goto_3
    and-int/lit16 v9, v6, 0x180

    if-nez v9, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->d(F)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_4

    :cond_4
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v2, v9

    :cond_5
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_7

    invoke-virtual {v12, v4}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x800

    goto :goto_5

    :cond_6
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v2, v9

    :cond_7
    and-int/lit16 v9, v6, 0x6000

    if-nez v9, :cond_9

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x4000

    goto :goto_6

    :cond_8
    const/16 v9, 0x2000

    :goto_6
    or-int/2addr v2, v9

    :cond_9
    and-int/lit16 v9, v2, 0x2493

    const/16 v10, 0x2492

    if-ne v9, v10, :cond_b

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v9

    if-nez v9, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v12}, Lp1/q;->X()V

    goto/16 :goto_a

    :cond_b
    :goto_7
    const/high16 v9, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/16 v13, 0x40

    int-to-float v13, v13

    const/4 v14, 0x0

    const/4 v15, 0x1

    invoke-static {v11, v14, v13, v15}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    int-to-float v8, v8

    const/16 v13, 0x14

    int-to-float v13, v13

    const/16 v14, 0xe

    int-to-float v9, v14

    invoke-static {v11, v13, v8, v9, v8}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v11, Lb2/e;->K:Lb2/l;

    invoke-static {v8}, Ll0/m;->i(F)Ll0/k;

    move-result-object v8

    const/16 v13, 0x36

    invoke-static {v8, v11, v12, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    move v13, v14

    iget-wide v14, v12, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v12, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    move/from16 v17, v13

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_c

    invoke-virtual {v12, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_8
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v12, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v12, v8, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-nez v11, :cond_d

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_e

    :cond_d
    invoke-static {v14, v12, v14, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v12, v8, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v10}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v12}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v9

    iget-wide v13, v9, Lg00/b;->o:J

    shr-int/lit8 v9, v2, 0x3

    and-int/lit8 v29, v9, 0xe

    const/16 v30, 0x0

    const v31, 0x1fff8

    move-object/from16 v28, v12

    const-wide/16 v11, 0x0

    move-wide/from16 v36, v13

    move-object v14, v10

    move-wide/from16 v9, v36

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v18, v15

    const/4 v15, 0x0

    move/from16 v19, v17

    const/16 v20, 0x1

    const-wide/16 v16, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v22, v19

    const/16 v19, 0x0

    move/from16 v23, v20

    move-object/from16 v24, v21

    const-wide/16 v20, 0x0

    move/from16 v25, v22

    const/16 v22, 0x0

    move/from16 v26, v23

    const/16 v23, 0x0

    move-object/from16 v27, v24

    const/16 v24, 0x0

    move/from16 v32, v25

    const/16 v25, 0x0

    move/from16 v33, v26

    const/16 v26, 0x0

    move-object/from16 v34, v27

    const/16 v27, 0x0

    move-object/from16 v35, v34

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static/range {v7 .. v31}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    invoke-static/range {v28 .. v28}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v7

    iget-wide v9, v7, Lg00/b;->m:J

    invoke-static/range {v28 .. v28}, Lce/w;->T(Landroidx/compose/runtime/Composer;)Lg00/e;

    move-result-object v7

    iget-object v7, v7, Lg00/e;->c:Ll3/v0;

    float-to-double v11, v1

    const-wide/16 v13, 0x0

    cmpl-double v8, v11, v13

    if-lez v8, :cond_f

    goto :goto_9

    :cond_f
    const-string v8, "invalid weight; must be greater than zero"

    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_9
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v11, 0x1

    invoke-direct {v8, v1, v11}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    and-int/lit8 v29, v2, 0xe

    const/16 v30, 0xc30

    const v31, 0xd7f8

    move/from16 v26, v11

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x2

    const/16 v23, 0x0

    const/16 v24, 0x1

    const/16 v25, 0x0

    move/from16 v33, v26

    const/16 v26, 0x0

    move-object/from16 v27, v7

    move-object v7, v0

    move/from16 v0, v33

    invoke-static/range {v7 .. v31}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v28

    const v1, 0x48aa6bc

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x0

    if-eqz v4, :cond_10

    const v2, 0x7f0807e4

    invoke-static {v2, v12, v1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v7

    const v2, 0x7f1410e9

    invoke-static {v12, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v12}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v2

    iget-wide v10, v2, Lg00/b;->v:J

    sget-object v2, Lt0/j;->a:Lt0/i;

    move-object/from16 v14, v35

    invoke-static {v14, v2}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v9, 0x0

    const/4 v13, 0x7

    invoke-static {v2, v1, v9, v5, v13}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v9, 0x4

    int-to-float v9, v9

    invoke-static {v9, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v14}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    :cond_10
    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_11

    new-instance v0, Lq00/x;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v6}, Lq00/x;-><init>(Ljava/lang/String;Ljava/lang/String;FZLc93/a;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method public static final h(Lzy/c;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    move-object v6, p1

    check-cast v6, Lp1/q;

    const p1, 0x7f495b62

    invoke-virtual {v6, p1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    and-int/lit8 p1, p1, 0x3

    if-ne p1, v0, :cond_2

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lp1/q;->X()V

    goto :goto_4

    :cond_2
    :goto_1
    if-eqz p0, :cond_3

    const/4 p1, 0x1

    :goto_2
    move v0, p1

    goto :goto_3

    :cond_3
    const/4 p1, 0x0

    goto :goto_2

    :goto_3
    new-instance p1, Lb30/o4;

    const/16 v1, 0xd

    invoke-direct {p1, p0, v1}, Lb30/o4;-><init>(Ljava/lang/Object;I)V

    const v1, 0x78cfe03a

    invoke-static {v1, v6, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/high16 v7, 0x30000

    const/16 v8, 0x1e

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v8}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    :goto_4
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Ll00/c;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p2, v1}, Ll00/c;-><init>(Lzy/c;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method public static final i(Lq00/i0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v15, p5

    check-cast v15, Lp1/q;

    const v0, 0x513119f2

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p6, v0

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/16 v7, 0x20

    goto :goto_1

    :cond_1
    const/16 v7, 0x10

    :goto_1
    or-int/2addr v0, v7

    invoke-virtual {v15, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x100

    goto :goto_2

    :cond_2
    const/16 v7, 0x80

    :goto_2
    or-int/2addr v0, v7

    invoke-virtual {v15, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x800

    goto :goto_3

    :cond_3
    const/16 v7, 0x400

    :goto_3
    or-int/2addr v0, v7

    invoke-virtual {v15, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x4000

    goto :goto_4

    :cond_4
    const/16 v7, 0x2000

    :goto_4
    or-int/2addr v0, v7

    and-int/lit16 v7, v0, 0x2493

    const/16 v10, 0x2492

    if-ne v7, v10, :cond_6

    invoke-virtual {v15}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v15}, Lp1/q;->X()V

    goto/16 :goto_10

    :cond_6
    :goto_5
    invoke-virtual {v1}, Lq00/i0;->c()Lh00/o0;

    move-result-object v7

    iget-object v10, v1, Lq00/i0;->m:Ljava/util/List;

    iget-object v11, v1, Lq00/i0;->a:Ljava/util/List;

    iget-boolean v7, v7, Lh00/o0;->w:Z

    const/4 v13, 0x0

    if-nez v7, :cond_7

    iget-object v7, v1, Lq00/i0;->t:Lq00/c;

    sget-object v14, Lq00/a;->a:Lq00/a;

    invoke-static {v7, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/4 v7, 0x1

    goto :goto_6

    :cond_7
    move v7, v13

    :goto_6
    const/high16 v14, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v12, v15, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move-object/from16 v18, v9

    iget-wide v8, v15, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v15, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v13, v15, Lp1/q;->S:Z

    if-eqz v13, :cond_8

    invoke-virtual {v15, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_8
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_7
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v15, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v15, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v9, v15, Lp1/q;->S:Z

    if-nez v9, :cond_9

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    :cond_9
    invoke-static {v8, v15, v8, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v15, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v6, v0, 0x9

    and-int/lit8 v6, v6, 0x70

    invoke-static {v7, v5, v15, v6}, Lse/h;->j(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    const v6, -0x655df7b6

    invoke-virtual {v15, v6}, Lp1/q;->e0(I)V

    move-object v6, v11

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v20

    const/4 v6, 0x0

    :goto_8
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_16

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v21, v6, 0x1

    const/4 v12, 0x0

    if-ltz v6, :cond_15

    check-cast v8, Ly00/c0;

    move-object v13, v10

    invoke-virtual {v1, v8}, Lq00/i0;->e(Ly00/c0;)Z

    move-result v10

    const-string v14, "wallet_screen_payment_methods_list"

    move-object/from16 v9, v18

    invoke-static {v9, v14}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    if-eqz v7, :cond_b

    if-eqz v10, :cond_b

    const/16 v18, 0x1

    goto :goto_9

    :cond_b
    const/16 v18, 0x0

    :goto_9
    invoke-virtual {v1}, Lq00/i0;->d()Ly00/c0;

    move-result-object v22

    if-eqz v22, :cond_c

    invoke-virtual/range {v22 .. v22}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v12

    :cond_c
    invoke-virtual {v8}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v12, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    iget-object v12, v1, Lq00/i0;->p:Ljava/lang/String;

    invoke-virtual {v8}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v12, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    const v1, -0x214f34f9

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    and-int/lit8 v1, v0, 0x70

    move/from16 v22, v5

    const/16 v5, 0x20

    if-ne v1, v5, :cond_d

    const/4 v1, 0x1

    goto :goto_a

    :cond_d
    const/4 v1, 0x0

    :goto_a
    invoke-virtual {v15, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    or-int v1, v1, v19

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move/from16 v23, v1

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-nez v23, :cond_f

    if-ne v5, v1, :cond_e

    goto :goto_b

    :cond_e
    move/from16 v23, v6

    goto :goto_c

    :cond_f
    :goto_b
    new-instance v5, Lq00/y;

    move/from16 v23, v6

    const/4 v6, 0x0

    invoke-direct {v5, v2, v8, v6}, Lq00/y;-><init>(Lkotlin/jvm/functions/Function1;Ly00/c0;I)V

    invoke-virtual {v15, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    check-cast v5, Lc93/a;

    const/4 v6, 0x0

    invoke-virtual {v15, v6}, Lp1/q;->q(Z)V

    const v6, -0x214f2d36

    invoke-virtual {v15, v6}, Lp1/q;->e0(I)V

    and-int/lit16 v6, v0, 0x380

    move/from16 v24, v0

    const/16 v0, 0x100

    if-ne v6, v0, :cond_10

    const/4 v6, 0x1

    goto :goto_d

    :cond_10
    const/4 v6, 0x0

    :goto_d
    invoke-virtual {v15, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v25

    or-int v6, v6, v25

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v6, :cond_11

    if-ne v0, v1, :cond_12

    :cond_11
    new-instance v0, Lq00/y;

    const/4 v1, 0x1

    invoke-direct {v0, v3, v8, v1}, Lq00/y;-><init>(Lkotlin/jvm/functions/Function1;Ly00/c0;I)V

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v0, Lc93/a;

    const/4 v6, 0x0

    invoke-virtual {v15, v6}, Lp1/q;->q(Z)V

    const/4 v1, 0x2

    const/16 v16, 0x6

    move-object/from16 p5, v13

    move-object v6, v14

    const/16 v17, 0x100

    const/16 v19, 0x20

    move-object v14, v0

    move-object v13, v5

    move-object v0, v9

    move/from16 v5, v23

    move v9, v7

    move-object v7, v8

    move/from16 v8, v18

    move-object/from16 v18, v11

    move/from16 v11, v22

    invoke-static/range {v6 .. v16}, Lse/a;->k(Landroidx/compose/ui/Modifier;Ly00/c0;ZZZZZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    const v6, -0x655d9f98

    invoke-virtual {v15, v6}, Lp1/q;->e0(I)V

    invoke-static/range {v18 .. v18}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v6

    if-ne v5, v6, :cond_14

    move-object/from16 v10, p5

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_13

    goto :goto_e

    :cond_13
    const/4 v6, 0x0

    goto :goto_f

    :cond_14
    :goto_e
    const/16 v5, 0x14

    int-to-float v5, v5

    const/4 v6, 0x0

    invoke-static {v0, v5, v6, v1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x6

    invoke-static {v5, v7, v15, v6}, Luf/c0;->n(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    :goto_f
    invoke-virtual {v15, v6}, Lp1/q;->q(Z)V

    move-object/from16 v1, p0

    move-object/from16 v5, p4

    move-object/from16 v10, p5

    move v7, v9

    move-object/from16 v11, v18

    move/from16 v6, v21

    move-object/from16 v18, v0

    move/from16 v0, v24

    goto/16 :goto_8

    :cond_15
    invoke-static {}, Lwb3/f;->d0()V

    throw v12

    :cond_16
    move/from16 v24, v0

    move v9, v7

    move-object/from16 p5, v10

    const/4 v6, 0x0

    const/4 v7, 0x6

    invoke-virtual {v15, v6}, Lp1/q;->q(Z)V

    const v0, -0x655d8218

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    move-object/from16 v10, p5

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_17

    shr-int/lit8 v0, v24, 0x6

    and-int/lit8 v0, v0, 0x70

    invoke-static {v9, v4, v15, v0}, Lse/h;->b(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    :cond_17
    invoke-virtual {v15, v6}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_18

    new-instance v0, La81/g;

    move-object/from16 v1, p0

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, La81/g;-><init>(Lq00/i0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method public static final j(ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 35

    move/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v3, 0x7384d78d

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v4, v2, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v3, v3, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_5

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v8}, Lp1/q;->X()V

    goto/16 :goto_5

    :cond_5
    :goto_3
    const-string v3, "wallet_screen_expanded_row_header"

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x6

    invoke-static {v3, v0, v5, v1, v6}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v3, 0x14

    int-to-float v12, v3

    const/16 v3, 0x16

    int-to-float v3, v3

    const/4 v13, 0x0

    const/16 v14, 0xa

    const/4 v11, 0x0

    move v10, v12

    move v12, v3

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move v12, v10

    const/16 v5, 0x8

    int-to-float v14, v5

    const/4 v15, 0x5

    move-object v10, v3

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v6, Ll0/m;->g:Ll0/h;

    const/16 v7, 0x36

    invoke-static {v6, v5, v8, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_6

    invoke-virtual {v8, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_4
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v8, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v8, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    :cond_7
    invoke-static {v6, v8, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v8, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, 0x7f141115

    invoke-static {v8, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    const v5, -0x1a6f7841

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    sget-object v6, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v8, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg00/b;

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    iget-wide v10, v7, Lg00/b;->o:J

    const/16 v26, 0x0

    const v27, 0x1fffa

    move-object v7, v4

    const/4 v4, 0x0

    move-object v12, v7

    move-object/from16 v24, v8

    const-wide/16 v7, 0x0

    move v13, v9

    const/4 v9, 0x0

    move v14, v5

    move-wide/from16 v33, v10

    move-object v11, v6

    move-wide/from16 v5, v33

    const/4 v10, 0x0

    move-object v15, v11

    const/4 v11, 0x0

    move-object/from16 v17, v12

    move/from16 v16, v13

    const-wide/16 v12, 0x0

    move/from16 v18, v14

    const/4 v14, 0x0

    move-object/from16 v19, v15

    const/4 v15, 0x0

    move/from16 v20, v16

    move-object/from16 v21, v17

    const-wide/16 v16, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move-object/from16 v23, v19

    const/16 v19, 0x0

    move/from16 v25, v20

    const/16 v20, 0x0

    move-object/from16 v28, v21

    const/16 v21, 0x0

    move/from16 v29, v22

    const/16 v22, 0x0

    move-object/from16 v30, v23

    const/16 v23, 0x0

    move/from16 v31, v25

    const/16 v25, 0x0

    move-object/from16 v32, v28

    move-object/from16 v0, v30

    move/from16 v1, v31

    invoke-static/range {v3 .. v27}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v24

    const v3, 0x7f08085b

    invoke-static {v3, v8, v1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v3

    const v4, 0x7f141114

    invoke-static {v8, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    const/high16 v5, 0x43340000    # 180.0f

    move-object/from16 v12, v32

    invoke-static {v5, v12}, Landroidx/room/c1;->L(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const v14, -0x1a6f7841

    invoke-virtual {v8, v14}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg00/b;

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    iget-wide v6, v0, Lg00/b;->w:J

    const/16 v9, 0x180

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_9

    new-instance v1, La41/j;

    const/4 v3, 0x7

    move/from16 v4, p0

    move-object/from16 v5, p1

    invoke-direct {v1, v4, v5, v2, v3}, La41/j;-><init>(ZLc93/a;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method public static final k(Lo0/b;Landroidx/compose/ui/Modifier;Lo0/y;Ll0/k1;Ll0/l;Ll0/i;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 26

    move-object/from16 v1, p0

    move/from16 v12, p12

    move-object/from16 v0, p10

    check-cast v0, Lp1/q;

    const v2, -0x7b81c7d6

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p11, v2

    and-int/lit8 v5, v12, 0x2

    if-eqz v5, :cond_1

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v7, p1

    goto :goto_2

    :cond_1
    move-object/from16 v7, p1

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_1

    :cond_2
    const/16 v8, 0x10

    :goto_1
    or-int/2addr v2, v8

    :goto_2
    and-int/lit8 v8, v12, 0x4

    if-nez v8, :cond_3

    move-object/from16 v8, p2

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_3

    :cond_3
    move-object/from16 v8, p2

    :cond_4
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v2, v9

    and-int/lit8 v9, v12, 0x8

    if-eqz v9, :cond_5

    or-int/lit16 v2, v2, 0xc00

    move-object/from16 v10, p3

    goto :goto_5

    :cond_5
    move-object/from16 v10, p3

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    const/16 v11, 0x800

    goto :goto_4

    :cond_6
    const/16 v11, 0x400

    :goto_4
    or-int/2addr v2, v11

    :goto_5
    or-int/lit16 v2, v2, 0x6000

    const/high16 v11, 0x30000

    and-int v13, p11, v11

    if-nez v13, :cond_9

    and-int/lit8 v13, v12, 0x20

    if-nez v13, :cond_7

    move-object/from16 v13, p4

    invoke-virtual {v0, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_8

    const/high16 v14, 0x20000

    goto :goto_6

    :cond_7
    move-object/from16 v13, p4

    :cond_8
    const/high16 v14, 0x10000

    :goto_6
    or-int/2addr v2, v14

    goto :goto_7

    :cond_9
    move-object/from16 v13, p4

    :goto_7
    and-int/lit8 v14, v12, 0x40

    const/high16 v15, 0x180000

    if-eqz v14, :cond_b

    or-int/2addr v2, v15

    :cond_a
    move-object/from16 v15, p5

    goto :goto_9

    :cond_b
    and-int v15, p11, v15

    if-nez v15, :cond_a

    move-object/from16 v15, p5

    invoke-virtual {v0, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_c

    const/high16 v16, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v16, 0x80000

    :goto_8
    or-int v2, v2, v16

    :goto_9
    const/high16 v16, 0x400000

    or-int v16, v2, v16

    move/from16 p10, v11

    and-int/lit16 v11, v12, 0x100

    if-eqz v11, :cond_e

    const/high16 v16, 0x6400000

    or-int v16, v2, v16

    :cond_d
    move/from16 v2, p7

    goto :goto_b

    :cond_e
    const/high16 v2, 0x6000000

    and-int v2, p11, v2

    if-nez v2, :cond_d

    move/from16 v2, p7

    invoke-virtual {v0, v2}, Lp1/q;->h(Z)Z

    move-result v17

    if-eqz v17, :cond_f

    const/high16 v17, 0x4000000

    goto :goto_a

    :cond_f
    const/high16 v17, 0x2000000

    :goto_a
    or-int v16, v16, v17

    :goto_b
    const/high16 v17, 0x10000000

    or-int v6, v16, v17

    move-object/from16 v4, p9

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_10

    const/16 v17, 0x4

    goto :goto_c

    :cond_10
    const/16 v17, 0x2

    :goto_c
    const v19, 0x12492493

    and-int v3, v6, v19

    const v2, 0x12492492

    const/16 v19, 0x1

    if-ne v3, v2, :cond_12

    and-int/lit8 v2, v17, 0x3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_11

    goto :goto_d

    :cond_11
    const/4 v2, 0x0

    goto :goto_e

    :cond_12
    :goto_d
    move/from16 v2, v19

    :goto_e
    and-int/lit8 v3, v6, 0x1

    invoke-virtual {v0, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_27

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v2, p11, 0x1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    const v20, -0x71c00001

    const v21, -0x70001

    const/4 v4, 0x3

    if-eqz v2, :cond_16

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_13

    goto :goto_10

    :cond_13
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v2, v12, 0x4

    if-eqz v2, :cond_14

    and-int/lit16 v6, v6, -0x381

    :cond_14
    and-int/lit8 v2, v12, 0x20

    if-eqz v2, :cond_15

    and-int v6, v6, v21

    :cond_15
    and-int v2, v6, v20

    move/from16 v18, p7

    move v6, v2

    move-object v14, v8

    move-object/from16 v16, v10

    move-object/from16 v20, v13

    move-object v10, v15

    move/from16 v5, v17

    move/from16 v9, v19

    const/4 v2, 0x0

    move-object/from16 v17, p6

    move-object/from16 v19, p8

    :goto_f
    const/4 v8, 0x4

    move-object v13, v7

    const/16 v7, 0x20

    goto/16 :goto_16

    :cond_16
    :goto_10
    if-eqz v5, :cond_17

    sget-object v2, Lb2/t;->w:Lb2/t;

    move-object v7, v2

    :cond_17
    and-int/lit8 v2, v12, 0x4

    if-eqz v2, :cond_18

    const/4 v2, 0x0

    invoke-static {v2, v0, v4}, Lo0/a0;->a(ILandroidx/compose/runtime/Composer;I)Lo0/y;

    move-result-object v5

    and-int/lit16 v6, v6, -0x381

    goto :goto_11

    :cond_18
    const/4 v2, 0x0

    move-object v5, v8

    :goto_11
    if-eqz v9, :cond_19

    int-to-float v8, v2

    new-instance v9, Ll0/l1;

    invoke-direct {v9, v8, v8, v8, v8}, Ll0/l1;-><init>(FFFF)V

    goto :goto_12

    :cond_19
    move-object v9, v10

    :goto_12
    and-int/lit8 v8, v12, 0x20

    if-eqz v8, :cond_1a

    sget-object v8, Ll0/m;->c:Ll0/g;

    and-int v6, v6, v21

    goto :goto_13

    :cond_1a
    move-object v8, v13

    :goto_13
    if-eqz v14, :cond_1b

    sget-object v10, Ll0/m;->a:Ll0/e;

    goto :goto_14

    :cond_1b
    move-object v10, v15

    :goto_14
    invoke-static {v0}, Lc0/t1;->a(Landroidx/compose/runtime/Composer;)Ld0/x;

    move-result-object v13

    invoke-virtual {v0, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v14, :cond_1c

    if-ne v15, v3, :cond_1d

    :cond_1c
    new-instance v15, Lh0/b0;

    invoke-direct {v15, v13}, Lh0/b0;-><init>(Ld0/x;)V

    invoke-virtual {v0, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    move-object v13, v15

    check-cast v13, Lh0/b0;

    if-eqz v11, :cond_1e

    move/from16 v11, v19

    goto :goto_15

    :cond_1e
    move/from16 v11, p7

    :goto_15
    invoke-static {v0}, Lf0/g1;->a(Landroidx/compose/runtime/Composer;)Lf0/k;

    move-result-object v14

    and-int v6, v6, v20

    move-object/from16 v20, v8

    move-object/from16 v16, v9

    move/from16 v18, v11

    move/from16 v9, v19

    move-object/from16 v19, v14

    move-object v14, v5

    move/from16 v5, v17

    move-object/from16 v17, v13

    goto :goto_f

    :goto_16
    invoke-virtual {v0}, Lp1/q;->r()V

    and-int/lit8 v11, v6, 0xe

    shr-int/lit8 v15, v6, 0xf

    and-int/lit8 v15, v15, 0x70

    or-int/2addr v11, v15

    and-int/lit8 v15, v11, 0xe

    xor-int/lit8 v15, v15, 0x6

    if-le v15, v8, :cond_1f

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_20

    :cond_1f
    and-int/lit8 v15, v11, 0x6

    if-ne v15, v8, :cond_21

    :cond_20
    move v8, v9

    goto :goto_17

    :cond_21
    move v8, v2

    :goto_17
    and-int/lit8 v15, v11, 0x70

    xor-int/lit8 v15, v15, 0x30

    if-le v15, v7, :cond_22

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_24

    :cond_22
    and-int/lit8 v11, v11, 0x30

    if-ne v11, v7, :cond_23

    goto :goto_18

    :cond_23
    move v9, v2

    :cond_24
    :goto_18
    or-int v2, v8, v9

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_25

    if-ne v7, v3, :cond_26

    :cond_25
    new-instance v7, Lo0/d;

    new-instance v2, Lj21/d;

    const/16 v3, 0x18

    invoke-direct {v2, v3, v1, v10}, Lj21/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v7, v2}, Lo0/d;-><init>(Lj21/d;)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    move-object v15, v7

    check-cast v15, Lo0/d;

    shr-int/lit8 v2, v6, 0x3

    and-int/lit8 v3, v2, 0xe

    or-int v3, v3, p10

    and-int/lit8 v7, v2, 0x70

    or-int/2addr v3, v7

    and-int/lit16 v7, v6, 0x1c00

    or-int/2addr v3, v7

    or-int/lit16 v3, v3, 0x6000

    const/high16 v7, 0x1c00000

    and-int/2addr v2, v7

    or-int/2addr v2, v3

    shl-int/lit8 v3, v6, 0xc

    const/high16 v7, 0x70000000

    and-int/2addr v3, v7

    or-int v24, v2, v3

    shr-int/lit8 v2, v6, 0x12

    and-int/lit8 v2, v2, 0xe

    shl-int/lit8 v3, v5, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int v25, v2, v3

    move-object/from16 v22, p9

    move-object/from16 v23, v0

    move-object/from16 v21, v10

    invoke-static/range {v13 .. v25}, Ltx/f;->f(Landroidx/compose/ui/Modifier;Lo0/y;Lo0/d;Ll0/k1;Lh0/o1;ZLf0/k;Ll0/l;Ll0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v13

    move-object v3, v14

    move-object/from16 v4, v16

    move-object/from16 v7, v17

    move/from16 v8, v18

    move-object/from16 v9, v19

    move-object/from16 v5, v20

    move-object/from16 v6, v21

    goto :goto_19

    :cond_27
    move-object/from16 v23, v0

    invoke-virtual/range {v23 .. v23}, Lp1/q;->X()V

    move-object/from16 v9, p8

    move-object v2, v7

    move-object v3, v8

    move-object v4, v10

    move-object v5, v13

    move-object v6, v15

    move-object/from16 v7, p6

    move/from16 v8, p7

    :goto_19
    invoke-virtual/range {v23 .. v23}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_28

    new-instance v0, Lj11/f;

    move-object/from16 v10, p9

    move/from16 v11, p11

    invoke-direct/range {v0 .. v12}, Lj11/f;-><init>(Lo0/b;Landroidx/compose/ui/Modifier;Lo0/y;Ll0/k1;Ll0/l;Ll0/i;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_28
    return-void
.end method

.method public static final l(Lzy/c;Lq00/p;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 28

    move-object/from16 v1, p0

    const-string v0, "hint"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p3

    check-cast v7, Lp1/q;

    const v0, 0x7eb49af1

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int v0, p4, v0

    and-int/lit16 v0, v0, 0x93

    const/16 v3, 0x92

    if-ne v0, v3, :cond_2

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->X()V

    goto/16 :goto_7

    :cond_2
    :goto_1
    const/high16 v0, 0x3f800000    # 1.0f

    move-object/from16 v10, p2

    invoke-static {v0, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v3, 0x69f6d51b

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    const/4 v4, 0x0

    const/4 v11, 0x1

    const v5, -0x1a6f7841

    if-eqz v3, :cond_4

    if-ne v3, v11, :cond_3

    const v3, 0x65fb370

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    sget-object v3, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v7, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg00/b;

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    iget-wide v5, v3, Lg00/b;->b:J

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_3
    const v0, 0x65fa609

    invoke-static {v0, v7, v4}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_4
    const v3, 0x65fac32

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    sget-object v3, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v7, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg00/b;

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    iget-wide v5, v3, Lg00/b;->c:J

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    :goto_2
    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    const/16 v3, 0xc

    int-to-float v3, v3

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v8

    invoke-static {v0, v5, v6, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v7}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v6, 0x4a1f1ea7    # 2607017.8f

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    invoke-static {v7}, Ldc/a;->G(Landroidx/compose/runtime/Composer;)Z

    move-result v6

    if-eqz v6, :cond_5

    iget-wide v5, v5, Lg00/b;->d:J

    goto :goto_3

    :cond_5
    iget-wide v5, v5, Lg00/b;->f:J

    :goto_3
    const v8, -0x78936b39

    invoke-static {v8, v7, v4}, Lr;->h(ILp1/q;Z)Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v8, v9, :cond_8

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    if-eqz v8, :cond_7

    if-ne v8, v11, :cond_6

    int-to-float v8, v11

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    invoke-static {v0, v8, v5, v6, v9}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto :goto_4

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_7
    :goto_4
    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v8, v0

    :cond_8
    check-cast v8, Landroidx/compose/ui/Modifier;

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/16 v5, 0x10

    if-eqz v0, :cond_a

    if-ne v0, v11, :cond_9

    int-to-float v0, v5

    goto :goto_5

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_a
    const/16 v0, 0x14

    int-to-float v0, v0

    :goto_5
    invoke-static {v8, v0, v3}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, Ll0/m;->a:Ll0/e;

    sget-object v6, Lb2/e;->J:Lb2/l;

    invoke-static {v3, v6, v7, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v12, v7, Lp1/q;->S:Z

    if-eqz v12, :cond_b

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_b
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_6
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v7, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v7, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-nez v8, :cond_c

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_d

    :cond_c
    invoke-static {v6, v7, v6, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v7, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v14, v2

    const/16 v16, 0x0

    const/16 v17, 0xd

    sget-object v12, Lb2/t;->w:Lb2/t;

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v2, v5

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v2, 0x7f0807d5

    invoke-static {v2, v7, v4}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v2

    invoke-static {v7}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v3

    iget-wide v5, v3, Lg00/b;->w:J

    const/16 v8, 0x1b0

    const/4 v9, 0x0

    const/4 v3, 0x0

    move-object v4, v0

    invoke-static/range {v2 .. v9}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/16 v0, 0x8

    int-to-float v0, v0

    const/16 v22, 0x0

    const/16 v23, 0xe

    const/16 v20, 0x0

    const/16 v21, 0x0

    move/from16 v19, v0

    move-object/from16 v18, v12

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v1, v7}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v7}, Lce/w;->T(Landroidx/compose/runtime/Composer;)Lg00/e;

    move-result-object v0

    iget-object v0, v0, Lg00/e;->d:Ll3/v0;

    invoke-static {v7}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v4

    iget-wide v4, v4, Lg00/b;->o:J

    const/16 v25, 0x0

    const v26, 0xfff8

    move-object/from16 v23, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v13, v11

    const-wide/16 v11, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const-wide/16 v15, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    const/16 v24, 0x30

    move/from16 v27, v22

    move-object/from16 v22, v0

    move/from16 v0, v27

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v23

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Ljp1/k;

    const/16 v5, 0x11

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ljp1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final m(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 34

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v12, p1

    check-cast v12, Lp1/q;

    const v2, 0x3083f7da

    invoke-virtual {v12, v2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v1

    and-int/lit8 v2, v2, 0x3

    if-ne v2, v3, :cond_2

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v12}, Lp1/q;->X()V

    goto/16 :goto_2

    :cond_2
    :goto_1
    const-string v2, "<terms>"

    const-string v3, "<a href=\"https://link.com/terms/ach-authorization\">"

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    const-string v3, "</terms>"

    const-string v5, "</a>"

    invoke-static {v2, v3, v5, v4}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    const v3, -0x1a6f7841

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    sget-object v5, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v12, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg00/b;

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    iget-wide v6, v6, Lg00/b;->o:J

    const v8, -0x548d6062

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v12, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg00/e;

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    iget-object v13, v8, Lg00/e;->f:Ll3/v0;

    const/16 v26, 0x0

    const v27, 0xff7fff

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x3

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v13 .. v27}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v8

    sget-object v9, Lb2/t;->w:Lb2/t;

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/16 v9, 0xc

    int-to-float v15, v9

    const/16 v17, 0x0

    const/16 v18, 0xd

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    new-instance v13, Ll3/m0;

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg00/b;

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    iget-wide v14, v3, Lg00/b;->q:J

    const/16 v31, 0x0

    const v32, 0xfffe

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v13 .. v32}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    const/16 v3, 0x30

    const/16 v14, 0x1a4

    const/4 v4, 0x0

    move-wide v5, v6

    move-object v7, v8

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v33, v13

    move v13, v3

    move-object v3, v9

    move-object/from16 v9, v33

    invoke-static/range {v2 .. v14}, Lup/d;->d(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLl3/v0;ZLl3/m0;ILc93/a;Landroidx/compose/runtime/Composer;II)V

    :goto_2
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_3

    new-instance v3, Lb30/z;

    const/16 v4, 0xb

    invoke-direct {v3, v0, v1, v4}, Lb30/z;-><init>(Ljava/lang/String;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method public static final n(Lq00/i0;ZLg40/m3;Lx30/e0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v7, p13

    check-cast v7, Lp1/q;

    const v0, -0x24c2f232

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    or-int v0, p14, v0

    move/from16 v3, p1

    invoke-virtual {v7, v3}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0x100

    goto :goto_1

    :cond_1
    const/16 v4, 0x80

    :goto_1
    or-int/2addr v0, v4

    move-object/from16 v15, p2

    invoke-virtual {v7, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    const/16 v8, 0x400

    if-eqz v4, :cond_2

    const/16 v4, 0x800

    goto :goto_2

    :cond_2
    move v4, v8

    :goto_2
    or-int/2addr v0, v4

    move-object/from16 v4, p3

    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    const/16 v10, 0x4000

    goto :goto_3

    :cond_3
    const/16 v10, 0x2000

    :goto_3
    or-int/2addr v0, v10

    move-object/from16 v10, p4

    invoke-virtual {v7, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    const/high16 v11, 0x20000

    goto :goto_4

    :cond_4
    const/high16 v11, 0x10000

    :goto_4
    or-int/2addr v0, v11

    move-object/from16 v11, p5

    invoke-virtual {v7, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    const/high16 v12, 0x100000

    goto :goto_5

    :cond_5
    const/high16 v12, 0x80000

    :goto_5
    or-int/2addr v0, v12

    move-object/from16 v12, p6

    invoke-virtual {v7, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    const/high16 v13, 0x800000

    goto :goto_6

    :cond_6
    const/high16 v13, 0x400000

    :goto_6
    or-int/2addr v0, v13

    move-object/from16 v13, p7

    invoke-virtual {v7, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_7

    const/high16 v16, 0x4000000

    goto :goto_7

    :cond_7
    const/high16 v16, 0x2000000

    :goto_7
    or-int v0, v0, v16

    move-object/from16 v2, p8

    invoke-virtual {v7, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_8

    const/high16 v16, 0x20000000

    goto :goto_8

    :cond_8
    const/high16 v16, 0x10000000

    :goto_8
    or-int v0, v0, v16

    move-object/from16 v5, p9

    invoke-virtual {v7, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_9

    const/16 v17, 0x4

    :goto_9
    move/from16 v18, v8

    move-object/from16 v8, p10

    goto :goto_a

    :cond_9
    const/16 v17, 0x2

    goto :goto_9

    :goto_a
    invoke-virtual {v7, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_a

    const/16 v19, 0x20

    goto :goto_b

    :cond_a
    const/16 v19, 0x10

    :goto_b
    or-int v17, v17, v19

    move-object/from16 v6, p11

    invoke-virtual {v7, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_b

    const/16 v16, 0x100

    goto :goto_c

    :cond_b
    const/16 v16, 0x80

    :goto_c
    or-int v16, v17, v16

    move-object/from16 v9, p12

    invoke-virtual {v7, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_c

    const/16 v18, 0x800

    :cond_c
    or-int v14, v16, v18

    const v16, 0x12492493

    move/from16 v17, v0

    and-int v0, v17, v16

    const v1, 0x12492492

    if-ne v0, v1, :cond_e

    and-int/lit16 v0, v14, 0x493

    const/16 v1, 0x492

    if-ne v0, v1, :cond_e

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_d

    :cond_d
    invoke-virtual {v7}, Lp1/q;->X()V

    goto/16 :goto_17

    :cond_e
    :goto_d
    sget-object v0, Ll0/m;->c:Ll0/g;

    sget-object v1, Lb2/e;->M:Lb2/k;

    move/from16 v16, v14

    const/4 v14, 0x0

    invoke-static {v0, v1, v7, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v14, v7, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-eqz v4, :cond_f

    invoke-virtual {v7, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_f
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_e
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v7, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v7, v0, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-nez v3, :cond_10

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    :cond_10
    invoke-static {v1, v7, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v7, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v17, 0x3

    and-int/lit8 v0, v0, 0x7e

    shr-int/lit8 v1, v17, 0x9

    and-int/lit16 v2, v1, 0x380

    or-int/2addr v0, v2

    and-int/lit16 v2, v1, 0x1c00

    or-int/2addr v0, v2

    const v2, 0xe000

    and-int/2addr v2, v1

    or-int/2addr v0, v2

    const/high16 v2, 0x70000

    and-int/2addr v2, v1

    or-int/2addr v0, v2

    const/high16 v2, 0x380000

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    shl-int/lit8 v1, v16, 0x15

    const/high16 v2, 0x1c00000

    and-int/2addr v2, v1

    or-int/2addr v0, v2

    const/high16 v2, 0xe000000

    and-int/2addr v2, v1

    or-int/2addr v0, v2

    const/high16 v2, 0x70000000

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    shr-int/lit8 v1, v16, 0x9

    and-int/lit8 v1, v1, 0xe

    move-object v2, v10

    move-object v3, v11

    move-object v4, v12

    move v12, v0

    move-object v11, v7

    move-object v10, v9

    move-object/from16 v0, p0

    move-object v7, v5

    move-object v9, v6

    move-object v5, v13

    move-object/from16 v6, p8

    move v13, v1

    move/from16 v1, p1

    invoke-static/range {v0 .. v13}, Lse/h;->p(Lq00/i0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v14, v0

    move-object v7, v11

    const v0, -0x2f52b8b7

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    iget-object v0, v14, Lq00/i0;->v:Lzy/c;

    if-eqz v0, :cond_12

    const/16 v0, 0xc

    int-to-float v10, v0

    const/4 v12, 0x0

    const/16 v13, 0xd

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v8, v15

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object v10, v8

    iget-object v1, v14, Lq00/i0;->v:Lzy/c;

    sget-object v2, Lq00/p;->w:Lq00/p;

    const/16 v3, 0x1b0

    invoke-static {v1, v2, v0, v7, v3}, Lse/h;->l(Lzy/c;Lq00/p;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_f
    const/4 v0, 0x0

    goto :goto_10

    :cond_12
    move-object v10, v15

    goto :goto_f

    :goto_10
    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v14}, Lq00/i0;->b()Lzy/b;

    move-result-object v0

    const/4 v11, 0x1

    if-eqz v0, :cond_13

    move v1, v11

    goto :goto_11

    :cond_13
    const/4 v1, 0x0

    :goto_11
    new-instance v0, Lb30/o4;

    const/16 v2, 0xe

    invoke-direct {v0, v14, v2}, Lb30/o4;-><init>(Ljava/lang/Object;I)V

    const v2, -0x201bbb64

    invoke-static {v2, v7, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const v8, 0x180006

    const/16 v9, 0x1e

    sget-object v0, Ll0/z;->a:Ll0/z;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v9}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    iget-object v0, v14, Lq00/i0;->q:Lzy/c;

    const/4 v1, 0x0

    invoke-static {v0, v7, v1}, Lse/h;->h(Lzy/c;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14}, Lq00/i0;->d()Ly00/c0;

    move-result-object v0

    instance-of v1, v0, Ly00/a0;

    const/4 v6, 0x0

    if-eqz v1, :cond_14

    check-cast v0, Ly00/a0;

    move-object v1, v0

    goto :goto_12

    :cond_14
    move-object v1, v6

    :goto_12
    const v0, -0x2f527881

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    if-nez v1, :cond_15

    const/4 v1, 0x0

    goto :goto_16

    :cond_15
    const v0, -0x2f52746d

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Ly00/a0;->k()Z

    move-result v0

    if-nez v0, :cond_16

    iget-object v0, v1, Ly00/a0;->M:Ly00/v0;

    invoke-virtual {v0}, Ly00/v0;->a()Z

    move-result v0

    if-eqz v0, :cond_17

    :cond_16
    const/16 v0, 0x10

    goto :goto_14

    :cond_17
    :goto_13
    const/4 v1, 0x0

    goto :goto_15

    :goto_14
    int-to-float v0, v0

    invoke-static {v0, v10}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v7, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v0, Lb1/d;

    const/4 v5, 0x5

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object v4, v14

    invoke-direct/range {v0 .. v5}, Lb1/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v1, -0x7063c6b

    invoke-static {v1, v7, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x30

    invoke-static {v6, v0, v7, v1, v11}, Lg00/a;->a(Ld40/m;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    goto :goto_13

    :goto_15
    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    :goto_16
    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v11}, Lp1/q;->q(Z)V

    :goto_17
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v15

    if-eqz v15, :cond_18

    new-instance v0, Lq00/a0;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Lq00/a0;-><init>(Lq00/i0;ZLg40/m3;Lx30/e0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    iput-object v0, v15, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method public static final o(Ljava/lang/String;Ljava/lang/String;ZFZLy00/c0;Landroidx/compose/ui/Modifier;Lc93/a;Lx1/b;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 22

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p11

    move-object/from16 v0, p10

    check-cast v0, Lp1/q;

    const v1, -0x60f466ec

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v11, 0x6

    move-object/from16 v12, p0

    if-nez v1, :cond_1

    invoke-virtual {v0, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_1
    move v1, v11

    :goto_1
    and-int/lit8 v2, v11, 0x30

    move-object/from16 v13, p1

    if-nez v2, :cond_3

    invoke-virtual {v0, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v11, 0x180

    move/from16 v15, p2

    if-nez v2, :cond_5

    invoke-virtual {v0, v15}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v11, 0xc00

    move/from16 v4, p3

    if-nez v2, :cond_7

    invoke-virtual {v0, v4}, Lp1/q;->d(F)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v1, v2

    :cond_7
    and-int/lit16 v2, v11, 0x6000

    if-nez v2, :cond_9

    invoke-virtual {v0, v5}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_8

    const/16 v2, 0x4000

    goto :goto_5

    :cond_8
    const/16 v2, 0x2000

    :goto_5
    or-int/2addr v1, v2

    :cond_9
    const/high16 v2, 0x30000

    and-int/2addr v2, v11

    if-nez v2, :cond_b

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    const/high16 v2, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v2, 0x10000

    :goto_6
    or-int/2addr v1, v2

    :cond_b
    const/high16 v2, 0x180000

    or-int/2addr v1, v2

    const/high16 v2, 0xc00000

    and-int/2addr v2, v11

    move-object/from16 v8, p7

    if-nez v2, :cond_d

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    const/high16 v2, 0x800000

    goto :goto_7

    :cond_c
    const/high16 v2, 0x400000

    :goto_7
    or-int/2addr v1, v2

    :cond_d
    const/high16 v2, 0x6000000

    and-int/2addr v2, v11

    if-nez v2, :cond_f

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    const/high16 v2, 0x4000000

    goto :goto_8

    :cond_e
    const/high16 v2, 0x2000000

    :goto_8
    or-int/2addr v1, v2

    :cond_f
    const/high16 v2, 0x30000000

    and-int/2addr v2, v11

    if-nez v2, :cond_11

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    const/high16 v2, 0x20000000

    goto :goto_9

    :cond_10
    const/high16 v2, 0x10000000

    :goto_9
    or-int/2addr v1, v2

    :cond_11
    const v2, 0x12492493

    and-int/2addr v2, v1

    const v3, 0x12492492

    if-ne v2, v3, :cond_13

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_12

    goto :goto_b

    :cond_12
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_a
    move-object/from16 v7, p6

    goto/16 :goto_f

    :cond_13
    :goto_b
    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const v7, -0x45773cff

    invoke-virtual {v0, v7}, Lp1/q;->e0(I)V

    sget-object v14, Lg00/g;->d:Lp1/u2;

    invoke-virtual {v0, v14}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v7, v16

    check-cast v7, Lg00/c;

    move/from16 p10, v1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    iget-object v7, v7, Lg00/c;->b:Lt0/i;

    invoke-static {v2, v7}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const v7, -0x1a6f7841

    invoke-virtual {v0, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v0, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg00/b;

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    move-object/from16 v16, v2

    iget-wide v1, v7, Lg00/b;->c:J

    const v7, -0x45773cff

    invoke-virtual {v0, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v14}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg00/c;

    const/4 v14, 0x0

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    iget-object v7, v7, Lg00/c;->b:Lt0/i;

    move-object/from16 v14, v16

    invoke-static {v14, v1, v2, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v14, 0x0

    invoke-static {v2, v7, v0, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    move-object/from16 p6, v3

    iget-wide v3, v0, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-eqz v14, :cond_14

    invoke-virtual {v0, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_14
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_c
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v0, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v0, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v0, Lp1/q;->S:Z

    if-nez v4, :cond_15

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    :cond_15
    invoke-static {v3, v0, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v0, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v1, p10, 0x7e

    shr-int/lit8 v2, p10, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v1, v2

    shl-int/lit8 v2, p10, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v1, v2

    shr-int/lit8 v2, p10, 0x9

    const v3, 0xe000

    and-int/2addr v2, v3

    or-int v18, v1, v2

    move/from16 v14, p3

    move-object/from16 v17, v0

    move-object/from16 v16, v8

    invoke-static/range {v12 .. v18}, Lse/h;->g(Ljava/lang/String;Ljava/lang/String;FZLc93/a;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v14, 0x0

    invoke-static {v1, v14, v0, v2}, Luf/c0;->n(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    if-nez v5, :cond_18

    if-nez v6, :cond_17

    goto :goto_d

    :cond_17
    const/4 v14, 0x0

    goto :goto_e

    :cond_18
    :goto_d
    move v14, v2

    :goto_e
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    const v1, 0x407814e5

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_19

    new-instance v1, Lpt2/k;

    const/16 v3, 0x10

    invoke-direct {v1, v3}, Lpt2/k;-><init>(I)V

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    move-object v14, v1

    check-cast v14, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    new-instance v1, Lh00/x;

    const/4 v3, 0x1

    invoke-direct {v1, v10, v9, v6, v3}, Lh00/x;-><init>(Ll83/e;Ll83/e;Ljava/lang/Object;I)V

    const v3, 0x50eff5fb

    invoke-static {v3, v0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v18

    const v20, 0x180180

    const/16 v21, 0x3a

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v19, v0

    invoke-static/range {v12 .. v21}, Landroidx/compose/animation/a;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_a

    :goto_f
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_1a

    new-instance v0, Lq00/w;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v11}, Lq00/w;-><init>(Ljava/lang/String;Ljava/lang/String;ZFZLy00/c0;Landroidx/compose/ui/Modifier;Lc93/a;Lx1/b;Lx1/b;I)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method public static final p(Lq00/i0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v11, p8

    move-object/from16 v3, p9

    move/from16 v12, p12

    move-object/from16 v13, p11

    check-cast v13, Lp1/q;

    const v0, 0xa86db9f

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v12, 0x6

    const/4 v5, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v5

    :goto_0
    or-int/2addr v0, v12

    goto :goto_1

    :cond_1
    move v0, v12

    :goto_1
    and-int/lit8 v6, v12, 0x30

    move/from16 v14, p1

    if-nez v6, :cond_3

    invoke-virtual {v13, v14}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit16 v6, v12, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v13, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v0, v8

    goto :goto_4

    :cond_5
    move-object/from16 v6, p2

    :goto_4
    and-int/lit16 v8, v12, 0xc00

    if-nez v8, :cond_7

    invoke-virtual {v13, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_5

    :cond_6
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v0, v8

    :cond_7
    and-int/lit16 v8, v12, 0x6000

    move-object/from16 v9, p4

    if-nez v8, :cond_9

    invoke-virtual {v13, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x4000

    goto :goto_6

    :cond_8
    const/16 v8, 0x2000

    :goto_6
    or-int/2addr v0, v8

    :cond_9
    const/high16 v8, 0x30000

    and-int/2addr v8, v12

    if-nez v8, :cond_b

    move-object/from16 v8, p5

    invoke-virtual {v13, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/high16 v10, 0x20000

    goto :goto_7

    :cond_a
    const/high16 v10, 0x10000

    :goto_7
    or-int/2addr v0, v10

    goto :goto_8

    :cond_b
    move-object/from16 v8, p5

    :goto_8
    const/high16 v10, 0x180000

    and-int/2addr v10, v12

    if-nez v10, :cond_d

    move-object/from16 v10, p6

    invoke-virtual {v13, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_c

    const/high16 v15, 0x100000

    goto :goto_9

    :cond_c
    const/high16 v15, 0x80000

    :goto_9
    or-int/2addr v0, v15

    goto :goto_a

    :cond_d
    move-object/from16 v10, p6

    :goto_a
    const/high16 v15, 0xc00000

    and-int/2addr v15, v12

    if-nez v15, :cond_f

    move-object/from16 v15, p7

    invoke-virtual {v13, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/high16 v16, 0x800000

    goto :goto_b

    :cond_e
    const/high16 v16, 0x400000

    :goto_b
    or-int v0, v0, v16

    goto :goto_c

    :cond_f
    move-object/from16 v15, p7

    :goto_c
    const/high16 v16, 0x6000000

    and-int v16, v12, v16

    if-nez v16, :cond_11

    invoke-virtual {v13, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x4000000

    goto :goto_d

    :cond_10
    const/high16 v16, 0x2000000

    :goto_d
    or-int v0, v0, v16

    :cond_11
    const/high16 v16, 0x30000000

    and-int v16, v12, v16

    const/16 v17, 0x20

    if-nez v16, :cond_13

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_12

    const/high16 v16, 0x20000000

    goto :goto_e

    :cond_12
    const/high16 v16, 0x10000000

    :goto_e
    or-int v0, v0, v16

    :cond_13
    move/from16 v16, v0

    and-int/lit8 v0, p13, 0x6

    if-nez v0, :cond_15

    move-object/from16 v0, p10

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_14

    const/16 v18, 0x4

    goto :goto_f

    :cond_14
    move/from16 v18, v5

    :goto_f
    or-int v18, p13, v18

    goto :goto_10

    :cond_15
    move-object/from16 v0, p10

    move/from16 v18, p13

    :goto_10
    const v19, 0x12492493

    and-int v2, v16, v19

    const v7, 0x12492492

    if-ne v2, v7, :cond_17

    and-int/lit8 v2, v18, 0x3

    if-ne v2, v5, :cond_17

    invoke-virtual {v13}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_16

    goto :goto_11

    :cond_16
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object/from16 v23, v13

    goto/16 :goto_14

    :cond_17
    :goto_11
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v2, v5, :cond_18

    invoke-static {v13}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v2

    new-instance v7, Lp1/a0;

    invoke-direct {v7, v2}, Lp1/a0;-><init>(Lbc3/c0;)V

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v7

    :cond_18
    check-cast v2, Lp1/a0;

    iget-object v2, v2, Lp1/a0;->w:Lbc3/c0;

    const v7, 0x7f140ff5

    invoke-static {v13, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    const v0, 0x7f141111

    invoke-static {v13, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v7, v0}, [Ljava/lang/String;

    move-result-object v18

    move-object/from16 v20, v2

    const v2, 0x71ed6f97

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lg1/f9;->a:Lp1/b0;

    invoke-virtual {v13, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll3/v0;

    invoke-static {v13}, Ll3/s;->g(Landroidx/compose/runtime/Composer;)Ll3/t0;

    move-result-object v6

    move-object/from16 v21, v7

    const/16 v22, 0x0

    aget-object v7, v18, v22

    const/16 v8, 0x3fc

    invoke-static {v6, v7, v2, v8}, Ll3/t0;->a(Ll3/t0;Ljava/lang/String;Ll3/v0;I)Ll3/r0;

    move-result-object v7

    iget-wide v8, v7, Ll3/r0;->c:J

    shr-long v7, v8, v17

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x1

    aget-object v9, v18, v8

    const/16 v8, 0x3fc

    invoke-static {v6, v9, v2, v8}, Ll3/t0;->a(Ll3/t0;Ljava/lang/String;Ll3/v0;I)Ll3/r0;

    move-result-object v2

    iget-wide v8, v2, Ll3/r0;->c:J

    shr-long v8, v8, v17

    long-to-int v2, v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    move-result v6

    if-gez v6, :cond_19

    move-object v7, v2

    :cond_19
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v2

    sget-object v6, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v13, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly3/c;

    invoke-interface {v6, v2}, Ly3/c;->e0(I)F

    move-result v2

    move/from16 v6, v22

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    iget-object v6, v1, Lq00/i0;->b:Ljava/lang/String;

    const/4 v7, 0x1

    invoke-virtual {v1}, Lq00/i0;->d()Ly00/c0;

    move-result-object v18

    iget-boolean v15, v1, Lq00/i0;->c:Z

    const v8, -0x5cbf9678

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    const/high16 v8, 0x70000000

    and-int v8, v16, v8

    const/high16 v9, 0x20000000

    if-ne v8, v9, :cond_1a

    move v8, v7

    goto :goto_12

    :cond_1a
    const/4 v8, 0x0

    :goto_12
    const/high16 v9, 0xe000000

    and-int v9, v16, v9

    const/high16 v7, 0x4000000

    if-ne v9, v7, :cond_1b

    const/16 v17, 0x1

    goto :goto_13

    :cond_1b
    const/16 v17, 0x0

    :goto_13
    or-int v7, v8, v17

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_1c

    if-ne v8, v5, :cond_1d

    :cond_1c
    new-instance v8, Lg32/j;

    const/16 v5, 0x8

    invoke-direct {v8, v3, v11, v5}, Lg32/j;-><init>(Lkotlin/jvm/functions/Function1;Lc93/a;I)V

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    move-object/from16 v17, v8

    check-cast v17, Lc93/a;

    const/4 v5, 0x0

    invoke-virtual {v13, v5}, Lp1/q;->q(Z)V

    new-instance v5, Lq00/c0;

    invoke-direct {v5, v1, v0, v2, v4}, Lq00/c0;-><init>(Lq00/i0;Ljava/lang/String;FLkotlin/jvm/functions/Function1;)V

    const v0, -0x2aa99263

    invoke-static {v0, v13, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v19

    new-instance v0, Ll1/a1;

    move-object/from16 v9, p4

    move-object/from16 v8, p7

    move-object/from16 v5, p10

    move-object/from16 v22, v6

    move-object v7, v10

    move-object/from16 v6, p5

    move-object v10, v4

    move-object/from16 v4, v20

    move/from16 v20, v16

    move/from16 v16, v2

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v10}, Ll1/a1;-><init>(Lq00/i0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;)V

    const v1, -0x5add0580

    invoke-static {v1, v13, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    shl-int/lit8 v1, v20, 0x9

    const v2, 0xe000

    and-int/2addr v1, v2

    const/high16 v2, 0x36000000

    or-int v24, v1, v2

    move-object/from16 v14, v21

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move-object/from16 v23, v13

    move-object/from16 v20, v17

    move-object/from16 v13, v22

    move/from16 v17, p1

    move-object/from16 v22, v0

    invoke-static/range {v13 .. v24}, Lse/h;->o(Ljava/lang/String;Ljava/lang/String;ZFZLy00/c0;Landroidx/compose/ui/Modifier;Lc93/a;Lx1/b;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_14
    invoke-virtual/range {v23 .. v23}, Lp1/q;->u()Lp1/v1;

    move-result-object v14

    if-eqz v14, :cond_1e

    new-instance v0, Lg1/b4;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    move/from16 v13, p13

    move-object v9, v11

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v13}, Lg1/b4;-><init>(Lq00/i0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v14, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method public static final q(Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "acknowledgedCallback"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "closeCallback"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p3

    check-cast v5, Lp1/q;

    const v2, 0x4509b0ac

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    move-object/from16 v8, p0

    invoke-virtual {v5, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p4, v2

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x20

    goto :goto_1

    :cond_1
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v2, v3

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x100

    goto :goto_2

    :cond_2
    const/16 v3, 0x80

    :goto_2
    or-int v11, v2, v3

    and-int/lit16 v2, v11, 0x93

    const/16 v3, 0x92

    if-ne v2, v3, :cond_4

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v5}, Lp1/q;->X()V

    goto/16 :goto_6

    :cond_4
    :goto_3
    invoke-static {v5}, Lg1/l3;->a(Landroidx/compose/runtime/Composer;)Lg1/c1;

    move-result-object v2

    invoke-virtual {v2}, Lg1/c1;->h()J

    move-result-wide v2

    sget-object v4, Li2/w0;->a:Li2/v0;

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v2, v3, v4}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v13, Ll0/m;->c:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    const/4 v15, 0x0

    invoke-static {v13, v14, v5, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v15, v5, Lp1/q;->S:Z

    if-eqz v15, :cond_5

    invoke-virtual {v5, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_4
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v5, v15, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v5, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v9, v5, Lp1/q;->S:Z

    if-nez v9, :cond_6

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    :cond_6
    invoke-static {v4, v5, v4, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v5, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "SEPA_MANDATE_CLOSE_BUTTON"

    invoke-static {v12, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb30/e0;->a:Lx1/b;

    shr-int/lit8 v10, v11, 0x6

    and-int/lit8 v10, v10, 0xe

    or-int/lit16 v10, v10, 0x6030

    move-object/from16 v18, v7

    const/16 v7, 0xc

    move-object/from16 v19, v3

    const/4 v3, 0x0

    move-object v8, v6

    move v6, v10

    move-object/from16 v10, v18

    move-object/from16 v0, v19

    invoke-static/range {v1 .. v7}, Lg1/d3;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    const/16 v1, 0x10

    int-to-float v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v12, v1, v2, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v17

    const/16 v20, 0x0

    const/16 v22, 0x7

    const/16 v18, 0x0

    const/16 v19, 0x0

    move/from16 v21, v1

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move/from16 v3, v21

    const/4 v4, 0x0

    invoke-static {v13, v14, v5, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v13, v5, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v5, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v13, v5, Lp1/q;->S:Z

    if-eqz v13, :cond_8

    invoke-virtual {v5, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v5, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v5, Lp1/q;->S:Z

    if-nez v0, :cond_9

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    :cond_9
    invoke-static {v4, v5, v4, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    invoke-static {v5, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x7f1410b5

    invoke-static {v5, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v4, 0x2

    const/4 v6, 0x0

    invoke-static {v0, v1, v5, v6, v4}, Ls/s;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const v0, 0x7f1410e4

    filled-new-array/range {p0 .. p0}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1, v5}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v1

    iget-wide v6, v1, Ld40/n;->e:J

    invoke-static {v5}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v1

    iget-object v1, v1, Lg1/h9;->i:Ll3/v0;

    const/4 v4, 0x1

    invoke-static {v12, v2, v3, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v26, 0x0

    const v27, 0xfff8

    move-object/from16 v24, v5

    move-wide v5, v6

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v3, v11

    const/4 v11, 0x0

    move-object v14, v12

    const-wide/16 v12, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const-wide/16 v16, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    const/16 v25, 0x30

    move/from16 v28, v3

    move-object v3, v0

    move/from16 v0, v28

    move-object/from16 v28, v23

    move-object/from16 v23, v1

    move v1, v4

    move-object v4, v2

    move-object/from16 v2, v28

    invoke-static/range {v3 .. v27}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v3, 0x30

    int-to-float v3, v3

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v3, "SEPA_MANDATE_CONTINUE_BUTTON"

    invoke-static {v2, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, Lb30/e0;->b:Lx1/b;

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    const v3, 0x30000030

    or-int v10, v0, v3

    const/16 v11, 0x1fc

    move v0, v1

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v12, v0

    move-object/from16 v9, v24

    move-object/from16 v0, p1

    invoke-static/range {v0 .. v11}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v9

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_b

    new-instance v0, La01/d;

    const/4 v5, 0x3

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, La01/d;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method public static final r(Lcom/amplitude/android/engagement/types/VideoBlock;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v6, p2

    check-cast v6, Lp1/q;

    const v3, 0x386a2b46

    invoke-virtual {v6, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0xe

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v5, v2, 0x70

    if-nez v5, :cond_3

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit8 v3, v3, 0x5b

    const/16 v5, 0x12

    if-ne v3, v5, :cond_5

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v6}, Lp1/q;->X()V

    goto/16 :goto_a

    :cond_5
    :goto_3
    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v6, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v5, v7, :cond_6

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v5, Lp1/c1;

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/VideoBlock;->getMeta()Lcom/amplitude/android/engagement/types/VideoMeta;

    move-result-object v8

    invoke-virtual {v8}, Lcom/amplitude/android/engagement/types/VideoMeta;->getSrc()Ljava/lang/String;

    move-result-object v8

    const-string v9, "<this>"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v9

    invoke-virtual {v9}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_7

    invoke-virtual {v9}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_7

    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v9

    invoke-virtual {v9}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v10

    const-string v11, "http"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-virtual {v9}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v8

    const-string v9, "https"

    invoke-virtual {v8, v9}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v8

    invoke-virtual {v8}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v8

    invoke-virtual {v8}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v9, "uri.buildUpon().scheme(\"https\").build().toString()"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_7
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-ne v9, v7, :cond_a

    new-instance v7, Lb9/p;

    invoke-direct {v7, v3}, Lb9/p;-><init>(Landroid/content/Context;)V

    invoke-virtual {v7}, Lb9/p;->a()Lb9/f0;

    move-result-object v12

    invoke-static {v8}, Lu8/x;->b(Ljava/lang/String;)Lu8/x;

    move-result-object v7

    invoke-static {v7}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object v7

    invoke-virtual {v12}, Lb9/f0;->L0()V

    invoke-virtual {v12, v7}, Lb9/f0;->T(Lzr/w0;)Ljava/util/ArrayList;

    move-result-object v13

    invoke-virtual {v12}, Lb9/f0;->L0()V

    const/4 v14, -0x1

    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v17, 0x1

    invoke-virtual/range {v12 .. v17}, Lb9/f0;->x0(Ljava/util/List;IJZ)V

    invoke-virtual {v12, v4}, Lb9/f0;->B0(I)V

    invoke-virtual {v12, v10}, Lb9/f0;->z0(Z)V

    new-instance v4, Lu8/d;

    const/4 v7, 0x3

    invoke-direct {v4, v7}, Lu8/d;-><init>(I)V

    iget-object v9, v12, Lb9/f0;->N:Lx8/i;

    invoke-virtual {v12}, Lb9/f0;->L0()V

    iget-boolean v13, v12, Lb9/f0;->F0:Z

    if-eqz v13, :cond_8

    goto :goto_4

    :cond_8
    iget-object v13, v12, Lb9/f0;->z0:Lu8/d;

    invoke-static {v13, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_9

    iput-object v4, v12, Lb9/f0;->z0:Lu8/d;

    invoke-virtual {v12, v11, v7, v4}, Lb9/f0;->v0(IILjava/lang/Object;)V

    new-instance v7, Lab/g0;

    const/4 v13, 0x6

    invoke-direct {v7, v4, v13}, Lab/g0;-><init>(Ljava/lang/Object;I)V

    const/16 v4, 0x14

    invoke-virtual {v9, v4, v7}, Lx8/i;->c(ILx8/f;)V

    :cond_9
    iget-object v4, v12, Lb9/f0;->M:Lb9/l0;

    iget-object v7, v12, Lb9/f0;->z0:Lu8/d;

    iget-object v4, v4, Lb9/l0;->H:Lx8/r;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lx8/r;->b()Lx8/q;

    move-result-object v13

    iget-object v4, v4, Lx8/r;->a:Landroid/os/Handler;

    const/16 v14, 0x1f

    invoke-virtual {v4, v14, v11, v10, v7}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v4

    iput-object v4, v13, Lx8/q;->a:Landroid/os/Message;

    invoke-virtual {v13}, Lx8/q;->b()V

    invoke-virtual {v9}, Lx8/i;->b()V

    :goto_4
    invoke-virtual {v12}, Lb9/f0;->q0()V

    invoke-virtual {v6, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v9, v12

    :cond_a
    const-string v4, "remember {\n            E\u2026)\n            }\n        }"

    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Landroidx/media3/exoplayer/ExoPlayer;

    new-instance v4, Lj43/a;

    const/4 v7, 0x6

    invoke-direct {v4, v9, v7}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    invoke-static {v7, v4, v6}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    sget-object v13, Lb2/t;->w:Lb2/t;

    if-eqz v12, :cond_b

    invoke-static {v4, v13}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    goto :goto_5

    :cond_b
    const/16 v12, 0xc8

    int-to-float v12, v12

    invoke-static {v12, v13}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    :goto_5
    invoke-interface {v7, v12}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_c

    int-to-float v5, v10

    goto :goto_6

    :cond_c
    const/4 v5, 0x6

    int-to-float v5, v5

    :goto_6
    invoke-static {v5}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    invoke-static {v7, v5}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const v7, -0x1896950d

    invoke-virtual {v6, v7}, Lp1/q;->f0(I)V

    sget-object v7, Luj/k;->a:Lp1/u2;

    invoke-virtual {v6, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Luj/m;

    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    iget-wide v14, v7, Luj/m;->x:J

    sget-object v7, Li2/w0;->a:Li2/v0;

    invoke-static {v5, v14, v15, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Lb2/e;->E:Lb2/m;

    invoke-static {v7, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v14, v6, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v6, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v11, v6, Lp1/q;->S:Z

    if-eqz v11, :cond_d

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_d
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_7
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v6, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v6, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v11, v6, Lp1/q;->S:Z

    if-nez v11, :cond_e

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_f

    :cond_e
    invoke-static {v12, v6, v12, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v6, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v5}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_10

    invoke-virtual {v5}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_10

    const-string v5, "."

    invoke-static {v8, v5, v8}, Lyb3/r;->G0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v7, "toLowerCase(...)"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "mp4"

    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    const v5, 0x1939c1c6

    invoke-virtual {v6, v5}, Lp1/q;->f0(I)V

    new-instance v5, Lb2/z;

    const/16 v7, 0x14

    invoke-direct {v5, v7, v3, v9}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v7, 0x30

    const/4 v8, 0x4

    move-object v3, v5

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Landroidx/compose/ui/viewinterop/a;->a(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    :goto_8
    const/4 v3, 0x1

    goto :goto_9

    :cond_10
    const v5, 0x1939c35b

    invoke-virtual {v6, v5}, Lp1/q;->f0(I)V

    new-instance v5, Lb2/z;

    const/16 v7, 0x15

    invoke-direct {v5, v7, v3, v8}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v7, 0x30

    const/4 v8, 0x4

    move-object v3, v5

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Landroidx/compose/ui/viewinterop/a;->a(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    goto :goto_8

    :goto_9
    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-nez v3, :cond_11

    return-void

    :cond_11
    new-instance v4, Lc4/i;

    const/4 v5, 0x4

    invoke-direct {v4, v0, v1, v2, v5}, Lc4/i;-><init>(Lcom/amplitude/android/engagement/types/ContentBlock;Landroidx/compose/ui/Modifier;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final s(Lq00/i0;Lg40/m3;Lx30/e0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 31

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v15, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v0, p14

    const-string v7, "state"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "expiryDateController"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "cvcController"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onItemSelected"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onExpandedChanged"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onAddPaymentMethodOptionClicked"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onPrimaryButtonClick"

    invoke-static {v15, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onDisabledButtonClick"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onPayAnotherWayClicked"

    invoke-static {v9, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onDismissAlert"

    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onSetDefaultClicked"

    invoke-static {v11, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onRemoveClicked"

    invoke-static {v12, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onUpdateClicked"

    invoke-static {v13, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onLogoutClicked"

    invoke-static {v14, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "showBottomSheetContent"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "hideBottomSheetContent"

    move-object/from16 v0, p15

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p16

    check-cast v7, Lp1/q;

    const v0, 0x3f2cee90

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/16 v16, 0x2

    const/16 v17, 0x4

    if-eqz v0, :cond_0

    move/from16 v0, v17

    goto :goto_0

    :cond_0
    move/from16 v0, v16

    :goto_0
    or-int v0, p17, v0

    invoke-virtual {v7, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    const/16 v19, 0x10

    const/16 v20, 0x20

    if-eqz v18, :cond_1

    move/from16 v18, v20

    goto :goto_1

    :cond_1
    move/from16 v18, v19

    :goto_1
    or-int v0, v0, v18

    invoke-virtual {v7, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    const/16 v21, 0x80

    const/16 v22, 0x100

    if-eqz v18, :cond_2

    move/from16 v18, v22

    goto :goto_2

    :cond_2
    move/from16 v18, v21

    :goto_2
    or-int v0, v0, v18

    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    const/16 v23, 0x400

    const/16 v24, 0x800

    if-eqz v18, :cond_3

    move/from16 v18, v24

    goto :goto_3

    :cond_3
    move/from16 v18, v23

    :goto_3
    or-int v0, v0, v18

    invoke-virtual {v7, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    const/16 v25, 0x2000

    const/16 v26, 0x4000

    if-eqz v18, :cond_4

    move/from16 v18, v26

    goto :goto_4

    :cond_4
    move/from16 v18, v25

    :goto_4
    or-int v0, v0, v18

    invoke-virtual {v7, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    const/high16 v27, 0x10000

    const/high16 v28, 0x20000

    if-eqz v18, :cond_5

    move/from16 v18, v28

    goto :goto_5

    :cond_5
    move/from16 v18, v27

    :goto_5
    or-int v0, v0, v18

    invoke-virtual {v7, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_6

    const/high16 v18, 0x100000

    goto :goto_6

    :cond_6
    const/high16 v18, 0x80000

    :goto_6
    or-int v0, v0, v18

    invoke-virtual {v7, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_7

    const/high16 v18, 0x800000

    goto :goto_7

    :cond_7
    const/high16 v18, 0x400000

    :goto_7
    or-int v0, v0, v18

    invoke-virtual {v7, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_8

    const/high16 v18, 0x4000000

    goto :goto_8

    :cond_8
    const/high16 v18, 0x2000000

    :goto_8
    or-int v0, v0, v18

    invoke-virtual {v7, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_9

    const/high16 v18, 0x20000000

    goto :goto_9

    :cond_9
    const/high16 v18, 0x10000000

    :goto_9
    or-int v0, v0, v18

    move/from16 p16, v0

    move/from16 v0, p18

    and-int/lit8 v18, v0, 0x6

    if-nez v18, :cond_b

    invoke-virtual {v7, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_a

    move/from16 v16, v17

    :cond_a
    or-int v16, v0, v16

    goto :goto_a

    :cond_b
    move/from16 v16, v0

    :goto_a
    and-int/lit8 v17, v0, 0x30

    if-nez v17, :cond_d

    invoke-virtual {v7, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_c

    move/from16 v19, v20

    :cond_c
    or-int v16, v16, v19

    :cond_d
    and-int/lit16 v2, v0, 0x180

    if-nez v2, :cond_f

    invoke-virtual {v7, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    move/from16 v21, v22

    :cond_e
    or-int v16, v16, v21

    :cond_f
    and-int/lit16 v2, v0, 0xc00

    if-nez v2, :cond_11

    invoke-virtual {v7, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    move/from16 v23, v24

    :cond_10
    or-int v16, v16, v23

    :cond_11
    and-int/lit16 v2, v0, 0x6000

    if-nez v2, :cond_13

    move-object/from16 v2, p14

    invoke-virtual {v7, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_12

    move/from16 v25, v26

    :cond_12
    or-int v16, v16, v25

    goto :goto_b

    :cond_13
    move-object/from16 v2, p14

    :goto_b
    const/high16 v17, 0x30000

    and-int v17, v0, v17

    move-object/from16 v0, p15

    if-nez v17, :cond_15

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_14

    move/from16 v27, v28

    :cond_14
    or-int v16, v16, v27

    :cond_15
    const v17, 0x12492493

    and-int v0, p16, v17

    const v2, 0x12492492

    if-ne v0, v2, :cond_17

    const v0, 0x12493

    and-int v0, v16, v0

    const v2, 0x12492

    if-ne v0, v2, :cond_17

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_c

    :cond_16
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v15, v7

    goto/16 :goto_f

    :cond_17
    :goto_c
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v0, v2, :cond_18

    invoke-static {v7}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v0

    new-instance v3, Lp1/a0;

    invoke-direct {v3, v0}, Lp1/a0;-><init>(Lbc3/c0;)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v0, v3

    :cond_18
    check-cast v0, Lp1/a0;

    iget-object v0, v0, Lp1/a0;->w:Lbc3/c0;

    iget-object v3, v1, Lq00/i0;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    move-object/from16 v16, v0

    const/4 v0, 0x0

    if-nez v3, :cond_1a

    iget-boolean v3, v1, Lq00/i0;->w:Z

    if-eqz v3, :cond_19

    goto :goto_d

    :cond_19
    move v3, v0

    goto :goto_e

    :cond_1a
    :goto_d
    const/4 v3, 0x1

    :goto_e
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v18

    const v3, -0x17409bb1

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_1b

    new-instance v3, Lpt2/k;

    const/16 v2, 0x11

    invoke-direct {v3, v2}, Lpt2/k;-><init>(I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object/from16 v19, v3

    check-cast v19, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    new-instance v0, Lq00/g0;

    move-object/from16 v3, p1

    move-object/from16 v29, v7

    move-object/from16 v17, v9

    move-object v2, v10

    move-object/from16 v9, v16

    move-object/from16 v10, p15

    move-object v7, v6

    move-object/from16 v16, v8

    move-object/from16 v8, p14

    move-object v6, v5

    move-object v5, v4

    move-object/from16 v4, p2

    invoke-direct/range {v0 .. v17}, Lq00/g0;-><init>(Lq00/i0;Lc93/a;Lg40/m3;Lx30/e0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;)V

    const v1, -0x3092dd6d

    move-object/from16 v15, v29

    invoke-static {v1, v15, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    const v16, 0x180180

    const/16 v17, 0x3a

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v8, v18

    move-object/from16 v10, v19

    invoke-static/range {v8 .. v17}, Landroidx/compose/animation/a;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V

    :goto_f
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_1c

    move-object v1, v0

    new-instance v0, Lq00/z;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v30, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v18}, Lq00/z;-><init>(Lq00/i0;Lg40/m3;Lx30/e0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    move-object/from16 v1, v30

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method public static final t(Lq00/p0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 30

    move-object/from16 v2, p0

    move-object/from16 v14, p1

    move-object/from16 v15, p2

    move-object/from16 v13, p3

    move/from16 v8, p5

    const-string v0, "viewModel"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "showBottomSheetContent"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hideBottomSheetContent"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLogoutClicked"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, -0x76e0888e

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v1, v8, 0x30

    if-nez v1, :cond_3

    invoke-virtual {v9, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, v8, 0x180

    if-nez v1, :cond_5

    invoke-virtual {v9, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v8, 0xc00

    if-nez v1, :cond_7

    invoke-virtual {v9, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0x800

    goto :goto_4

    :cond_6
    const/16 v1, 0x400

    :goto_4
    or-int/2addr v0, v1

    :cond_7
    move v10, v0

    and-int/lit16 v0, v10, 0x493

    const/16 v1, 0x492

    if-ne v0, v1, :cond_9

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object/from16 v16, v9

    goto/16 :goto_20

    :cond_9
    :goto_5
    iget-object v0, v2, Lq00/p0;->N:Lec3/r1;

    const/4 v11, 0x0

    invoke-static {v0, v9, v11}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v12

    invoke-interface {v12}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq00/i0;

    iget-object v0, v0, Lq00/i0;->m:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/16 v16, 0x0

    if-eqz v1, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq00/f;

    instance-of v3, v1, Lq00/d;

    if-eqz v3, :cond_b

    check-cast v1, Lq00/d;

    goto :goto_6

    :cond_b
    move-object/from16 v1, v16

    :goto_6
    if-eqz v1, :cond_a

    goto :goto_7

    :cond_c
    move-object/from16 v1, v16

    :goto_7
    if-eqz v1, :cond_d

    iget-object v0, v1, Lq00/d;->c:Lf20/b;

    goto :goto_8

    :cond_d
    move-object/from16 v0, v16

    :goto_8
    const v1, 0x2aecfd48

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_e

    if-ne v3, v4, :cond_f

    :cond_e
    move-object v1, v0

    goto :goto_9

    :cond_f
    move-object/from16 v19, v0

    move-object/from16 v20, v4

    goto :goto_a

    :goto_9
    new-instance v0, Lq00/h0;

    const/4 v6, 0x0

    const/4 v7, 0x5

    move-object v3, v1

    const/4 v1, 0x1

    move-object v5, v3

    const-class v3, Lq00/p0;

    move-object/from16 v17, v4

    const-string v4, "onFinancialConnectionsResult"

    move-object/from16 v18, v5

    const-string v5, "onFinancialConnectionsResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V"

    move-object/from16 v20, v17

    move-object/from16 v19, v18

    invoke-direct/range {v0 .. v7}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v0

    :goto_a
    check-cast v3, Lj93/g;

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const v0, 0x3984f0ec

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    move-object/from16 v1, v19

    if-nez v1, :cond_10

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    move-object/from16 v3, v16

    move-object/from16 v6, v20

    goto :goto_b

    :cond_10
    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v9, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const v4, 0x5d007755

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v6, v20

    if-nez v4, :cond_11

    if-ne v5, v6, :cond_12

    :cond_11
    new-instance v5, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataContract;

    invoke-static {v1, v0}, Lf20/c;->a(Lf20/b;Landroid/content/Context;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataContract;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v5, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataContract;

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    invoke-static {v5, v3, v9, v11}, Lwb3/f;->a0(Lk/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh/i;

    move-result-object v0

    const v1, 0x5d009d2e

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_13

    if-ne v3, v6, :cond_14

    :cond_13
    new-instance v3, Lkz/j;

    invoke-direct {v3, v0}, Lkz/j;-><init>(Lj/d;)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v3, Lkz/j;

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    :goto_b
    invoke-interface {v12}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq00/i0;

    iget-object v0, v0, Lq00/i0;->t:Lq00/c;

    instance-of v1, v0, Lq00/b;

    if-eqz v1, :cond_15

    check-cast v0, Lq00/b;

    goto :goto_c

    :cond_15
    move-object/from16 v0, v16

    :goto_c
    if-eqz v0, :cond_16

    iget-object v0, v0, Lq00/b;->a:Ljz/f;

    move-object v1, v0

    goto :goto_d

    :cond_16
    move-object/from16 v1, v16

    :goto_d
    const v0, 0x2aed1be9

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_17

    if-ne v4, v6, :cond_18

    :cond_17
    new-instance v0, Lay/u;

    const/16 v5, 0x13

    move-object v4, v3

    move-object v3, v2

    move-object v2, v4

    move-object/from16 v4, v16

    invoke-direct/range {v0 .. v5}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object v2, v3

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v0

    :cond_18
    check-cast v4, Lc93/m;

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    invoke-static {v9, v4, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface {v12}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lq00/i0;

    iget-object v0, v2, Lq00/p0;->O:Lg40/f3;

    iget-object v1, v2, Lq00/p0;->P:Lx30/e0;

    const v3, 0x2aed659a

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_19

    if-ne v4, v6, :cond_1a

    :cond_19
    move-object v3, v0

    goto :goto_e

    :cond_1a
    move-object/from16 v18, v0

    move-object/from16 v16, v1

    move-object/from16 v21, v6

    goto :goto_f

    :goto_e
    new-instance v0, Lq00/h0;

    move-object/from16 v17, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, v1

    const/4 v1, 0x1

    move-object v5, v3

    const-class v3, Lq00/p0;

    move-object/from16 v16, v4

    const-string v4, "onItemSelected"

    move-object/from16 v18, v5

    const-string v5, "onItemSelected(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V"

    move-object/from16 v21, v17

    invoke-direct/range {v0 .. v7}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v0

    :goto_f
    move-object/from16 v17, v4

    check-cast v17, Lj93/g;

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    const v0, 0x2aed6c7d

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1c

    move-object/from16 v0, v21

    if-ne v1, v0, :cond_1b

    move-object/from16 v20, v0

    goto :goto_10

    :cond_1b
    move-object/from16 v22, v0

    goto :goto_11

    :cond_1c
    move-object/from16 v20, v21

    :goto_10
    new-instance v0, Lq00/h0;

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v1, 0x1

    const-class v3, Lq00/p0;

    const-string v4, "onExpandedChanged"

    const-string v5, "onExpandedChanged(Z)V"

    move-object/from16 v22, v20

    invoke-direct/range {v0 .. v7}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :goto_11
    move-object/from16 v19, v1

    check-cast v19, Lj93/g;

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    const v0, 0x2aed7422

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1e

    move-object/from16 v0, v22

    if-ne v1, v0, :cond_1d

    move-object/from16 v20, v0

    goto :goto_12

    :cond_1d
    move-object/from16 v23, v0

    goto :goto_13

    :cond_1e
    move-object/from16 v20, v22

    :goto_12
    new-instance v0, Lp00/j;

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v1, 0x0

    const-class v3, Lq00/p0;

    const-string v4, "onPrimaryButtonClicked"

    const-string v5, "onPrimaryButtonClicked()V"

    move-object/from16 v23, v20

    invoke-direct/range {v0 .. v7}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :goto_13
    move-object/from16 v20, v1

    check-cast v20, Lj93/g;

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    const v0, 0x2aed7c85

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_20

    move-object/from16 v0, v23

    if-ne v1, v0, :cond_1f

    move-object/from16 v21, v0

    goto :goto_14

    :cond_1f
    move-object/from16 v24, v0

    goto :goto_15

    :cond_20
    move-object/from16 v21, v23

    :goto_14
    new-instance v0, Lp00/j;

    const/4 v6, 0x0

    const/16 v7, 0xd

    const/4 v1, 0x0

    const-class v3, Lq00/p0;

    const-string v4, "handleDisabledButtonClick"

    const-string v5, "handleDisabledButtonClick()V"

    move-object/from16 v24, v21

    invoke-direct/range {v0 .. v7}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :goto_15
    move-object/from16 v21, v1

    check-cast v21, Lj93/g;

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    const v0, 0x2aed8562

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_22

    move-object/from16 v0, v24

    if-ne v1, v0, :cond_21

    move-object v6, v0

    goto :goto_16

    :cond_21
    move-object/from16 v25, v0

    goto :goto_17

    :cond_22
    move-object/from16 v6, v24

    :goto_16
    new-instance v0, Lp00/j;

    move-object/from16 v22, v6

    const/4 v6, 0x0

    const/16 v7, 0xe

    const/4 v1, 0x0

    const-class v3, Lq00/p0;

    const-string v4, "onPayAnotherWayClicked"

    const-string v5, "onPayAnotherWayClicked()V"

    move-object/from16 v25, v22

    invoke-direct/range {v0 .. v7}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :goto_17
    move-object/from16 v22, v1

    check-cast v22, Lj93/g;

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    const v0, 0x2aed8cfb

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_24

    move-object/from16 v0, v25

    if-ne v1, v0, :cond_23

    move-object v6, v0

    goto :goto_18

    :cond_23
    move-object/from16 v26, v0

    goto :goto_19

    :cond_24
    move-object/from16 v6, v25

    :goto_18
    new-instance v0, Lq00/h0;

    move-object/from16 v23, v6

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v1, 0x1

    const-class v3, Lq00/p0;

    const-string v4, "onRemoveClicked"

    const-string v5, "onRemoveClicked(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V"

    move-object/from16 v26, v23

    invoke-direct/range {v0 .. v7}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :goto_19
    move-object/from16 v23, v1

    check-cast v23, Lj93/g;

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    const v0, 0x2aed93bb

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_26

    move-object/from16 v0, v26

    if-ne v1, v0, :cond_25

    move-object v6, v0

    goto :goto_1a

    :cond_25
    move-object/from16 v27, v0

    goto :goto_1b

    :cond_26
    move-object/from16 v6, v26

    :goto_1a
    new-instance v0, Lq00/h0;

    move-object/from16 v26, v6

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v1, 0x1

    const-class v3, Lq00/p0;

    const-string v4, "onUpdateClicked"

    const-string v5, "onUpdateClicked(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V"

    move-object/from16 v27, v26

    invoke-direct/range {v0 .. v7}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :goto_1b
    move-object/from16 v24, v1

    check-cast v24, Lj93/g;

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    const v0, 0x2aeda05f

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_28

    move-object/from16 v0, v27

    if-ne v1, v0, :cond_27

    move-object v6, v0

    goto :goto_1c

    :cond_27
    move-object/from16 v28, v0

    goto :goto_1d

    :cond_28
    move-object/from16 v6, v27

    :goto_1c
    new-instance v0, Lq00/h0;

    move-object/from16 v26, v6

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v1, 0x1

    const-class v3, Lq00/p0;

    const-string v4, "onSetDefaultClicked"

    const-string v5, "onSetDefaultClicked(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V"

    move-object/from16 v28, v26

    invoke-direct/range {v0 .. v7}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :goto_1d
    move-object/from16 v25, v1

    check-cast v25, Lj93/g;

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    const v0, 0x2aedb7eb

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_2a

    move-object/from16 v0, v28

    if-ne v1, v0, :cond_29

    move-object v6, v0

    goto :goto_1e

    :cond_29
    move-object/from16 v29, v0

    goto :goto_1f

    :cond_2a
    move-object/from16 v6, v28

    :goto_1e
    new-instance v0, Lm7/l0;

    move-object/from16 v26, v6

    const/4 v6, 0x0

    const/16 v7, 0x1d

    const/4 v1, 0x1

    const-class v3, Lq00/p0;

    const-string v4, "onAddPaymentMethodOptionClicked"

    const-string v5, "onAddPaymentMethodOptionClicked(Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;)V"

    move-object/from16 v29, v26

    invoke-direct/range {v0 .. v7}, Lm7/l0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :goto_1f
    move-object/from16 v26, v1

    check-cast v26, Lj93/g;

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    const v0, 0x2aedc07a

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_2b

    move-object/from16 v0, v29

    if-ne v1, v0, :cond_2c

    :cond_2b
    new-instance v0, Lp00/j;

    const/4 v6, 0x0

    const/16 v7, 0xb

    const/4 v1, 0x0

    const-class v3, Lq00/p0;

    const-string v4, "onDismissAlert"

    const-string v5, "onDismissAlert()V"

    invoke-direct/range {v0 .. v7}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_2c
    check-cast v1, Lj93/g;

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    move-object/from16 v3, v17

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object/from16 v4, v19

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object/from16 v5, v26

    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object/from16 v6, v20

    check-cast v6, Lc93/a;

    move-object/from16 v7, v21

    check-cast v7, Lc93/a;

    check-cast v22, Lc93/a;

    check-cast v1, Lc93/a;

    check-cast v25, Lkotlin/jvm/functions/Function1;

    move-object/from16 v11, v23

    check-cast v11, Lkotlin/jvm/functions/Function1;

    check-cast v24, Lkotlin/jvm/functions/Function1;

    and-int/lit16 v0, v10, 0x1c00

    shl-int/lit8 v2, v10, 0x9

    const v10, 0xe000

    and-int/2addr v10, v2

    or-int/2addr v0, v10

    const/high16 v10, 0x70000

    and-int/2addr v2, v10

    or-int/2addr v0, v2

    const/16 v17, 0x240

    move-object/from16 v2, v16

    move-object/from16 v8, v22

    move-object/from16 v10, v25

    move-object/from16 v16, v9

    move-object v9, v1

    move-object/from16 v1, v18

    move/from16 v18, v0

    move-object v0, v12

    move-object/from16 v12, v24

    invoke-static/range {v0 .. v18}, Lse/h;->s(Lq00/i0;Lg40/m3;Lx30/e0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    :goto_20
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_2d

    new-instance v0, Lot1/a;

    const/16 v6, 0x19

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lot1/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_2d
    return-void
.end method

.method public static final u(Llb3/f1;)Llb3/f1;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Llb3/o;->f(Llb3/f1;Z)Llb3/f1;

    move-result-object p0

    return-object p0
.end method

.method public static final v(Landroid/content/Context;Ljava/lang/Integer;)Landroid/net/Uri;
    .locals 4

    const-string v0, "android.resource://"

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    sget-object p1, Lb23/i;->a:Lb23/i;

    sget-object p1, Lb23/i;->d:Lb23/e;

    sget-object v0, Lb23/g;->F:Lb23/g;

    const-string v1, "SafeCall"

    invoke-interface {p1, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lb23/i;->c:Lb23/j;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Exception occurred: "

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v0, v1, v2, p0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final w(Lg40/s3;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proposedValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lg40/s3;->c()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-gt p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final x(Lj0/i;Landroidx/compose/runtime/Composer;I)Lp1/c1;
    .locals 4

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v0, Lp1/c1;

    and-int/lit8 v2, p2, 0xe

    xor-int/lit8 v2, v2, 0x6

    const/4 v3, 0x4

    if-le v2, v3, :cond_1

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v3, :cond_3

    :cond_2
    const/4 p2, 0x1

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p2, :cond_4

    if-ne v2, v1, :cond_5

    :cond_4
    new-instance v2, Lh20/i0;

    const/16 p2, 0xd

    const/4 v1, 0x0

    invoke-direct {v2, p0, v0, v1, p2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v2, Lc93/m;

    invoke-static {p1, v2, p0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static y(Le30/c;Lv00/c0;Lh20/f;)Ljava/util/List;
    .locals 36

    move-object/from16 v2, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    const-string v0, "viewModel"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodMetadata"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerStateHolder"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v10, v9, Lh20/f;->c:Ln53/e;

    invoke-virtual {v8}, Lv00/c0;->S()Ljava/util/List;

    move-result-object v11

    new-instance v12, Ld30/a;

    new-instance v0, La1/e;

    const/4 v6, 0x0

    const/16 v7, 0x15

    const/4 v1, 0x1

    const-class v3, Le30/c;

    const-string v4, "updateSelection"

    const-string v5, "updateSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V"

    invoke-direct/range {v0 .. v7}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v6, La33/d;

    iget-object v1, v2, Le30/c;->L:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv00/c0;

    const/4 v7, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v1, Lv00/c0;->V:Lq20/c;

    goto :goto_0

    :cond_0
    move-object v1, v7

    :goto_0
    invoke-direct {v6, v1}, La33/d;-><init>(Lq20/c;)V

    invoke-direct {v12, v0, v6}, Ld30/a;-><init>(Lkotlin/jvm/functions/Function1;La33/d;)V

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, v10, Ln53/e;->y:Ll83/e;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lr20/r;

    invoke-static {v11}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3, v2, v8, v9, v12}, Ldc/a;->n(Ljava/lang/String;Le30/c;Lv00/c0;Lh20/f;Ld30/a;)Ld30/v;

    move-result-object v2

    iget-object v3, v8, Lv00/c0;->F:Ljava/util/List;

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v1, v3

    invoke-direct {v0, v2, v1}, Lr20/r;-><init>(Ld30/v;Z)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v11

    const/16 v13, 0xc

    invoke-static {v2, v8, v13}, Lh20/t;->b(Le30/c;Lv00/c0;I)Lh20/g;

    move-result-object v16

    iget-object v0, v2, Le30/c;->M:Lr20/d;

    iget-object v0, v0, Lr20/d;->g:Ln53/e;

    new-instance v1, Ld11/h;

    const/4 v3, 0x2

    invoke-direct {v1, v3}, Ld11/h;-><init>(I)V

    invoke-static {v0, v1}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v22

    iget-object v0, v2, Le30/c;->Q:Lec3/r1;

    invoke-static {v7}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v23

    iget-object v1, v2, Le30/c;->P:Lec3/r1;

    new-instance v14, Landroidx/room/v0;

    const/16 v20, 0x0

    const/16 v21, 0x3

    const/4 v15, 0x2

    const-class v17, Lh20/g;

    const-string v18, "onFormFieldValuesChanged"

    const-string v19, "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V"

    invoke-direct/range {v14 .. v21}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object v15, v7

    move-object v7, v14

    move-object/from16 v14, v16

    move-object/from16 v16, v11

    iget-object v11, v9, Lh20/f;->d:Lec3/r1;

    iget-object v3, v2, Le30/c;->Z:Lh20/f;

    move-object v4, v12

    iget-object v12, v3, Lh20/f;->f:Ln53/e;

    move/from16 v17, v13

    invoke-virtual {v2}, Le30/c;->r()Lec3/f2;

    move-result-object v13

    iget-object v3, v3, Lh20/f;->g:Ln53/e;

    new-instance v24, La1/e;

    iget-object v5, v2, Le30/c;->x:Lk20/a;

    const/16 v30, 0x0

    const/16 v31, 0x16

    const/16 v25, 0x1

    const-class v27, Lk20/a;

    const-string v28, "onSelectPaymentMethod"

    const-string v29, "onSelectPaymentMethod(Ljava/lang/String;)V"

    move-object/from16 v26, v5

    invoke-direct/range {v24 .. v31}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v18, La1/e;

    iget-object v5, v2, Le30/c;->x:Lk20/a;

    const/16 v31, 0x0

    const/16 v32, 0x17

    const/16 v26, 0x1

    const-class v28, Lk20/a;

    const-string v29, "onPaymentMethodFormShown"

    const-string v30, "onPaymentMethodFormShown(Ljava/lang/String;)V"

    move-object/from16 v27, v5

    move-object/from16 v25, v18

    invoke-direct/range {v25 .. v32}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v19, Ld30/u;

    move-object/from16 v20, v6

    new-instance v6, Ld30/q;

    const/4 v5, 0x0

    invoke-direct {v6, v14, v5}, Ld30/q;-><init>(Lh20/g;I)V

    new-instance v5, Ld30/r;

    const/4 v15, 0x0

    invoke-direct {v5, v2, v8, v9, v15}, Ld30/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v15, v0

    new-instance v0, Lam2/s;

    move-object/from16 v25, v5

    const/16 v5, 0xe

    move-object/from16 v35, v8

    move-object v8, v1

    move-object v1, v2

    move-object/from16 v2, v35

    move-object/from16 v35, v9

    move-object v9, v3

    move-object/from16 v3, v35

    invoke-direct/range {v0 .. v5}, Lam2/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v2, v9

    move-object v9, v0

    move-object v0, v1

    move-object v1, v2

    move-object v2, v15

    new-instance v15, Lb30/h0;

    const/4 v3, 0x2

    invoke-direct {v15, v0, v3}, Lb30/h0;-><init>(Le30/c;I)V

    new-instance v3, Ld30/f;

    const/4 v5, 0x2

    invoke-direct {v3, v0, v5}, Ld30/f;-><init>(Le30/c;I)V

    new-instance v5, Ld30/q;

    move-object/from16 v26, v1

    const/4 v1, 0x1

    invoke-direct {v5, v14, v1}, Ld30/q;-><init>(Lh20/g;I)V

    new-instance v1, Lb30/h0;

    const/4 v14, 0x3

    invoke-direct {v1, v0, v14}, Lb30/h0;-><init>(Le30/c;I)V

    move-object/from16 v0, v20

    move-object/from16 v20, v5

    move-object v5, v0

    move-object/from16 v21, v1

    move-object/from16 v33, v4

    move-object v4, v8

    move-object/from16 v34, v16

    move-object/from16 v0, v19

    move-object/from16 v16, v22

    move-object/from16 v17, v24

    move-object/from16 v8, v25

    move-object/from16 v14, v26

    move-object/from16 v1, p1

    move-object/from16 v19, v3

    move-object/from16 v3, v23

    invoke-direct/range {v0 .. v21}, Ld30/u;-><init>(Lv00/c0;Lec3/r1;Lec3/r1;Lec3/r1;La33/d;Ld30/q;Landroidx/room/v0;Ld30/r;Lam2/s;Ln53/e;Lec3/r1;Ln53/e;Lec3/f2;Ln53/e;Lb30/h0;Ln53/e;La1/e;La1/e;Ld30/f;Ld30/q;Lb30/h0;)V

    move-object v8, v1

    invoke-static/range {p0 .. p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    new-instance v2, Ld30/o;

    const/4 v15, 0x0

    move-object/from16 v3, p0

    invoke-direct {v2, v0, v3, v15}, Ld30/o;-><init>(Ld30/u;Le30/c;Lq83/d;)V

    const/4 v6, 0x3

    invoke-static {v1, v15, v15, v2, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-static {v3}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v7

    move-object v3, v0

    new-instance v0, La1/h;

    const/16 v5, 0xa

    move-object/from16 v2, p0

    move-object v4, v15

    move-object/from16 v1, v16

    invoke-direct/range {v0 .. v5}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object v1, v0

    move-object v0, v3

    invoke-static {v7, v15, v15, v1, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v1, Lr20/q;

    invoke-direct {v1, v0}, Lr20/q;-><init>(Ld30/u;)V

    move-object/from16 v0, v34

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    iget-object v1, v2, Le30/c;->P:Lec3/r1;

    iget-object v1, v1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Lq20/t;

    if-eqz v3, :cond_2

    move-object v7, v1

    check-cast v7, Lq20/t;

    goto :goto_1

    :cond_2
    move-object v7, v15

    :goto_1
    if-eqz v7, :cond_3

    invoke-virtual {v7}, Lq20/t;->i()Ly00/d5;

    move-result-object v1

    iget-object v1, v1, Ly00/d5;->w:Ljava/lang/String;

    const/16 v3, 0xc

    invoke-static {v2, v8, v3}, Lh20/t;->b(Le30/c;Lv00/c0;I)Lh20/g;

    move-result-object v3

    invoke-virtual {v3, v1}, Lh20/g;->c(Ljava/lang/String;)Lh20/v;

    move-result-object v3

    sget-object v4, Lh20/t;->b:Lh20/t;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    new-instance v3, Lr20/r;

    move-object/from16 v9, p2

    move-object/from16 v4, v33

    invoke-static {v1, v2, v8, v9, v4}, Ldc/a;->n(Ljava/lang/String;Le30/c;Lv00/c0;Lh20/f;Ld30/a;)Ld30/v;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v3, v1, v2}, Lr20/r;-><init>(Ld30/v;Z)V

    invoke-virtual {v0, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v0

    return-object v0
.end method

.method public static z(Landroid/content/Context;)Lh20/x1;
    .locals 27

    const-string v0, "context"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v1, Lh20/x1;

    sget-object v5, Liy/a;->b:Lh20/i1;

    sget-object v9, Liy/a;->a:Lh20/h1;

    sget-object v11, Liy/a;->c:Lh20/l1;

    sget-object v12, Liy/a;->f:Lm83/y;

    const-string v0, "merchantDisplayName"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appearance"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingDetailsCollectionConfiguration"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preferredNetworks"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v15, Liy/a;->g:Lm83/y;

    sget-object v19, Liy/a;->k:Lm83/y;

    sget-object v14, Liy/a;->e:Lm83/y;

    sget-object v16, Liy/a;->h:Lh20/x2;

    sget-object v17, Liy/a;->i:Lh20/p1;

    sget-object v18, Liy/a;->j:Lt83/b;

    sget-object v20, Liy/a;->d:Lh20/w2;

    sget-object v21, Liy/a;->l:Lh20/q3;

    sget-object v24, Lm83/z;->w:Lm83/z;

    const/16 v25, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v1 .. v26}, Lh20/x1;-><init>(Ljava/lang/String;Lh20/c2;Lh20/h2;Lh20/i1;Li20/b;ZZLh20/h1;Ljava/lang/String;Lh20/l1;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lh20/x2;Lh20/t1;Ljava/util/List;Ljava/util/List;Lh20/w2;Lh20/q3;Lh20/g3;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;)V

    return-object v1
.end method
