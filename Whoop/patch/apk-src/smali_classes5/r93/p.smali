.class public final Lr93/p;
.super Lr93/o;
.source "SourceFile"


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lr93/m1;I)V
    .locals 0

    iput p2, p0, Lr93/p;->b:I

    invoke-direct {p0, p1}, Lr93/o;-><init>(Lr93/m1;)V

    return-void
.end method


# virtual methods
.method public final a(Lfb3/d;Lr93/n;Lr93/k;)Z
    .locals 5

    iget v0, p0, Lr93/p;->b:I

    packed-switch v0, :pswitch_data_0

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const/4 p3, 0x1

    const-string v0, "from"

    aput-object v0, p1, p2

    const-string p2, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "isVisible"

    aput-object p3, p1, p2

    const-string p2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_0
    if-eqz p3, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const/4 p3, 0x1

    const-string v0, "from"

    aput-object v0, p1, p2

    const-string p2, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "isVisible"

    aput-object p3, p1, p2

    const-string p2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_1
    if-nez p3, :cond_2

    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const/4 p3, 0x1

    const-string v0, "from"

    aput-object v0, p1, p2

    const-string p2, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "isVisible"

    aput-object p3, p1, p2

    const-string p2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Visibility is unknown yet"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2
    if-nez p3, :cond_3

    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const/4 p3, 0x1

    const-string v0, "from"

    aput-object v0, p1, p2

    const-string p2, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "isVisible"

    aput-object p3, p1, p2

    const-string p2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This method shouldn\'t be invoked for LOCAL visibility"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_3
    const/4 p1, 0x1

    if-eqz p3, :cond_4

    return p1

    :cond_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const/4 p3, 0x1

    const-string v0, "from"

    aput-object v0, p1, p2

    const-string p2, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "isVisible"

    aput-object p3, p1, p2

    const-string p2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_4
    const/4 p1, 0x1

    if-eqz p3, :cond_6

    invoke-static {p2}, Lya3/f;->c(Lr93/k;)Lr93/b0;

    move-result-object p2

    invoke-static {p3}, Lya3/f;->c(Lr93/k;)Lr93/b0;

    move-result-object p3

    invoke-interface {p3, p2}, Lr93/b0;->n0(Lr93/b0;)Z

    move-result p2

    if-nez p2, :cond_5

    const/4 p1, 0x0

    goto :goto_0

    :cond_5
    sget-object p2, Lr93/q;->n:Lrb3/o;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    return p1

    :cond_6
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const/4 p3, 0x1

    const-string v0, "from"

    aput-object v0, p1, p2

    const-string p2, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "isVisible"

    aput-object p3, p1, p2

    const-string p2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_5
    const/4 v0, 0x1

    if-eqz p3, :cond_12

    const-class v1, Lr93/e;

    invoke-static {p2, v1, v0}, Lya3/f;->h(Lr93/k;Ljava/lang/Class;Z)Lr93/k;

    move-result-object v2

    check-cast v2, Lr93/e;

    const/4 v3, 0x0

    invoke-static {p3, v1, v3}, Lya3/f;->h(Lr93/k;Ljava/lang/Class;Z)Lr93/k;

    move-result-object p3

    check-cast p3, Lr93/e;

    if-nez p3, :cond_7

    goto :goto_2

    :cond_7
    if-eqz v2, :cond_8

    invoke-static {v2}, Lya3/f;->k(Lr93/k;)Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-static {v2, v1, v0}, Lya3/f;->h(Lr93/k;Ljava/lang/Class;Z)Lr93/k;

    move-result-object v2

    check-cast v2, Lr93/e;

    if-eqz v2, :cond_8

    invoke-interface {p3}, Lr93/e;->i()Llb3/c0;

    move-result-object v4

    invoke-interface {v2}, Lr93/e;->a()Lr93/e;

    move-result-object v2

    invoke-static {v4, v2}, Lya3/f;->p(Llb3/y;Lr93/k;)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    instance-of v2, p2, Lr93/c;

    if-eqz v2, :cond_9

    move-object v2, p2

    check-cast v2, Lr93/c;

    invoke-static {v2}, Lya3/f;->r(Lr93/c;)Lr93/c;

    move-result-object v2

    goto :goto_1

    :cond_9
    move-object v2, p2

    :goto_1
    invoke-static {v2, v1, v0}, Lya3/f;->h(Lr93/k;Ljava/lang/Class;Z)Lr93/k;

    move-result-object v1

    check-cast v1, Lr93/e;

    if-nez v1, :cond_a

    :goto_2
    move v0, v3

    goto :goto_4

    :cond_a
    invoke-interface {p3}, Lr93/e;->i()Llb3/c0;

    move-result-object v3

    invoke-interface {v1}, Lr93/e;->a()Lr93/e;

    move-result-object v1

    invoke-static {v3, v1}, Lya3/f;->p(Llb3/y;Lr93/k;)Z

    move-result v1

    if-eqz v1, :cond_10

    sget-object v1, Lr93/q;->m:Lr93/v0;

    if-ne p1, v1, :cond_b

    goto :goto_3

    :cond_b
    instance-of v1, v2, Lr93/c;

    if-nez v1, :cond_c

    goto :goto_4

    :cond_c
    instance-of v1, v2, Lr93/j;

    if-eqz v1, :cond_d

    goto :goto_4

    :cond_d
    sget-object v1, Lr93/q;->l:Lr93/v0;

    if-ne p1, v1, :cond_e

    goto :goto_4

    :cond_e
    sget-object v1, Lr93/q;->k:Lr93/v0;

    if-eq p1, v1, :cond_10

    if-nez p1, :cond_f

    goto :goto_3

    :cond_f
    invoke-interface {p1}, Lfb3/d;->getType()Llb3/y;

    move-result-object v1

    invoke-static {v1, p3}, Lya3/f;->p(Llb3/y;Lr93/k;)Z

    move-result v2

    if-nez v2, :cond_11

    invoke-static {v1}, Ldc/a;->F(Llb3/y;)V

    :cond_10
    :goto_3
    invoke-interface {p3}, Lr93/k;->g()Lr93/k;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lr93/p;->a(Lfb3/d;Lr93/n;Lr93/k;)Z

    move-result v0

    :cond_11
    :goto_4
    return v0

    :cond_12
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const/4 p3, 0x2

    const/4 v0, 0x1

    const-string v1, "from"

    aput-object v1, p1, p2

    const-string p2, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3"

    aput-object p2, p1, v0

    const-string p2, "isVisible"

    aput-object p2, p1, p3

    const-string p2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_6
    const/4 v0, 0x1

    if-eqz p3, :cond_16

    sget-object v1, Lr93/q;->a:Lr93/p;

    invoke-virtual {v1, p1, p2, p3}, Lr93/p;->a(Lfb3/d;Lr93/n;Lr93/k;)Z

    move-result p3

    if-eqz p3, :cond_15

    sget-object p3, Lr93/q;->l:Lr93/v0;

    if-ne p1, p3, :cond_13

    goto :goto_6

    :cond_13
    sget-object p3, Lr93/q;->k:Lr93/v0;

    if-ne p1, p3, :cond_14

    goto :goto_5

    :cond_14
    const-class p3, Lr93/e;

    invoke-static {p2, p3, v0}, Lya3/f;->h(Lr93/k;Ljava/lang/Class;Z)Lr93/k;

    move-result-object p2

    if-eqz p2, :cond_15

    instance-of p3, p1, Lfb3/c;

    if-eqz p3, :cond_15

    check-cast p1, Lfb3/c;

    iget-object p1, p1, Lfb3/c;->w:Lr93/e;

    invoke-interface {p1}, Lr93/e;->a()Lr93/e;

    move-result-object p1

    invoke-interface {p2}, Lr93/k;->a()Lr93/k;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_6

    :cond_15
    :goto_5
    const/4 v0, 0x0

    :goto_6
    return v0

    :cond_16
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const/4 p3, 0x1

    const-string v0, "from"

    aput-object v0, p1, p2

    const-string p2, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "isVisible"

    aput-object p3, p1, p2

    const-string p2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_7
    if-eqz p3, :cond_1f

    invoke-static {p2}, Lya3/f;->q(Lr93/k;)Z

    move-result p1

    if-eqz p1, :cond_17

    invoke-static {p3}, Lya3/f;->e(Lr93/k;)Lr93/t0;

    move-result-object p1

    sget-object v0, Lr93/t0;->a:Lr93/t0;

    if-eq p1, v0, :cond_17

    invoke-static {p2, p3}, Lr93/q;->d(Lr93/n;Lr93/k;)Z

    move-result p1

    goto :goto_a

    :cond_17
    instance-of p1, p2, Lr93/j;

    if-eqz p1, :cond_18

    move-object p1, p2

    check-cast p1, Lr93/j;

    invoke-interface {p1}, Lr93/j;->g()Lr93/i;

    :cond_18
    if-eqz p2, :cond_1a

    invoke-interface {p2}, Lr93/k;->g()Lr93/k;

    move-result-object p2

    instance-of p1, p2, Lr93/e;

    if-eqz p1, :cond_19

    invoke-static {p2}, Lya3/f;->k(Lr93/k;)Z

    move-result p1

    if-eqz p1, :cond_1a

    :cond_19
    instance-of p1, p2, Lr93/g0;

    if-eqz p1, :cond_18

    :cond_1a
    if-nez p2, :cond_1b

    goto :goto_9

    :cond_1b
    :goto_7
    if-eqz p3, :cond_1e

    if-ne p2, p3, :cond_1c

    goto :goto_8

    :cond_1c
    instance-of p1, p3, Lr93/g0;

    if-eqz p1, :cond_1d

    instance-of p1, p2, Lr93/g0;

    if-eqz p1, :cond_1e

    move-object p1, p2

    check-cast p1, Lr93/g0;

    check-cast p1, Lu93/g0;

    iget-object p1, p1, Lu93/g0;->F:Lva3/e;

    move-object v0, p3

    check-cast v0, Lr93/g0;

    check-cast v0, Lu93/g0;

    iget-object v0, v0, Lu93/g0;->F:Lva3/e;

    invoke-virtual {p1, v0}, Lva3/e;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1e

    invoke-static {p3}, Lya3/f;->c(Lr93/k;)Lr93/b0;

    move-result-object p1

    invoke-static {p2}, Lya3/f;->c(Lr93/k;)Lr93/b0;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1e

    :goto_8
    const/4 p1, 0x1

    goto :goto_a

    :cond_1d
    invoke-interface {p3}, Lr93/k;->g()Lr93/k;

    move-result-object p3

    goto :goto_7

    :cond_1e
    :goto_9
    const/4 p1, 0x0

    :goto_a
    return p1

    :cond_1f
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const/4 p3, 0x2

    const/4 v0, 0x1

    const-string v1, "from"

    aput-object v1, p1, p2

    const-string p2, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1"

    aput-object p2, p1, v0

    const-string p2, "isVisible"

    aput-object p2, p1, p3

    const-string p2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_data_0
    .packed-switch 0x0
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
