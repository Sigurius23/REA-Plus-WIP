.class public final synthetic Ldk2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/16 v0, 0x1c

    iput v0, p0, Ldk2/i;->w:I

    sget-object v0, Lg1/d7;->a:Ld0/i1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldk2/i;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p2, p0, Ldk2/i;->w:I

    iput-object p1, p0, Ldk2/i;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ldk2/i;->w:I

    iget-object v1, p0, Ldk2/i;->x:Lkotlin/jvm/functions/Function1;

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, v1}, Lg51/b;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    sget-object v0, Lg1/d7;->a:Ld0/i1;

    new-instance v0, Lg1/n7;

    invoke-direct {v0, p1, v1}, Lg1/n7;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-object v0

    :pswitch_1
    check-cast p1, Lg1/r2;

    new-instance v0, Lg1/q2;

    invoke-direct {v0, p1, v1}, Lg1/q2;-><init>(Lg1/r2;Lkotlin/jvm/functions/Function1;)V

    return-object v0

    :pswitch_2
    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    invoke-static {v1, p1}, Lfu2/d;->a(Lkotlin/jvm/functions/Function1;Lcom/whoop/weightlifting/data/domain/WorkoutGroup;)Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p1, v1}, Lfe0/e;->r(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lorg/joda/time/LocalDateTime;

    invoke-static {v1, p1}, Lfa0/c;->u(Lkotlin/jvm/functions/Function1;Lorg/joda/time/LocalDateTime;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lorg/joda/time/LocalDateTime;

    invoke-static {v1, p1}, Lfa0/c;->a(Lkotlin/jvm/functions/Function1;Lorg/joda/time/LocalDateTime;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lsp0/j;

    invoke-static {v1, p1}, Lfa0/c;->p(Lkotlin/jvm/functions/Function1;Lsp0/j;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v1, p1}, Lfa0/c;->s(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ltp0/c;

    invoke-static {v1, p1}, Lfa0/c;->z(Lkotlin/jvm/functions/Function1;Ltp0/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v1}, Lfa0/c;->n(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Ln82/b;

    invoke-static {v1, p1}, Lfa0/c;->w(Lkotlin/jvm/functions/Function1;Ln82/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v1}, Lf90/b;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-static {p1, v1}, Lf01/o1;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-static {p1, v1}, Lf01/w0;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-static {p1, v1}, Lf01/t0;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-static {p1, v1}, Lf01/n;->g(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-static {p1, v1}, Lf01/n;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    invoke-static {p1, v1}, Lep1/m;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    invoke-static {p1, v1}, Leo0/g;->u(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v1}, Leo0/g;->w(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    invoke-static {p1, v1}, Lek2/a;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v1, p1}, Lej1/o;->a(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v1}, Leg2/i;->p(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v1}, Leg2/i;->l(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    invoke-static {p1, v1}, Le50/c;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v1, p1}, Le41/g;->k(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v1}, Ldo0/f;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lvy0/y;

    invoke-static {v1, p1}, Ldn0/p;->f(Lkotlin/jvm/functions/Function1;Lvy0/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v1, p1}, Ldk2/j;->l(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

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
