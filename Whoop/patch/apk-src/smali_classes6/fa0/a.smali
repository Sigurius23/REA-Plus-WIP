.class public final synthetic Lfa0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/16 v0, 0x13

    iput v0, p0, Lfa0/a;->w:I

    sget-object v0, Lg1/r2;->w:Lg1/r2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p2, p0, Lfa0/a;->w:I

    iput-object p1, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lfa0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    sget-object v1, Lcz/y;->a:Lcz/y;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    sget-object v1, Lcz/o;->a:Lcz/o;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    sget-object v1, Lcz/s;->a:Lcz/s;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    sget-object v1, Lcz/y;->a:Lcz/y;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lgt1/n;->j(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lgt1/n;->g(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lgt1/l;->d(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lgt1/c;->d(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lgh0/b;->f(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lgh0/b;->a(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    sget-object v0, Lg1/r2;->w:Lg1/r2;

    new-instance v1, Lg1/q2;

    iget-object v2, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, v0, v2}, Lg1/q2;-><init>(Lg1/r2;Lkotlin/jvm/functions/Function1;)V

    return-object v1

    :pswitch_a
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lfz2/a;->a(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lfz2/a;->c(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lfz2/a;->b(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lfy2/a;->f(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lfy2/a;->b(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lfe0/e;->f(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lfe0/e;->k(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lfe0/e;->n(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lfe0/e;->l(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lfa0/c;->c(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lfa0/c;->j(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lfa0/c;->l(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lfa0/c;->t(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lfa0/c;->y(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lfa0/c;->k(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lfa0/c;->m(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lfa0/c;->e(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lfa0/c;->h(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    iget-object v0, p0, Lfa0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lfa0/c;->f(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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
