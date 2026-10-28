.class public final synthetic Lkm2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lkm2/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lkm2/e;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;

    invoke-static {p1}, Lkx1/c;->c(Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;)Ljx1/s;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/whoop/membership/management/domain/models/items/MembershipAdjustmentCheckoutHeaderModel;

    invoke-static {p1}, Lkx1/c;->b(Lcom/whoop/membership/management/domain/models/items/MembershipAdjustmentCheckoutHeaderModel;)Ljx1/m;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;

    invoke-static {p1}, Lkx1/c;->a(Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;)Ljx1/q;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lkx1/c;->g(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/whoop/membership/extensions/domain/models/CtaAction;

    invoke-static {p1}, Lkw1/v;->c(Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lhw1/a;

    invoke-static {p1}, Lkw1/t;->i(Lhw1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Liw1/j;

    invoke-static {p1}, Lkw1/t;->k(Liw1/j;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lcom/whoop/membership/extensions/domain/models/CtaAction;

    invoke-static {p1}, Lkw1/r;->b(Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lcom/whoop/membership/extensions/domain/models/CtaAction;

    invoke-static {p1}, Lkw1/n;->b(Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lcom/whoop/membership/extensions/domain/models/CtaAction;

    invoke-static {p1}, Lkw1/m;->a(Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lhw1/a;

    invoke-static {p1}, Lkw1/j;->o(Lhw1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Llw1/i;

    invoke-static {p1}, Lkw1/j;->p(Llw1/i;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Llw1/i;

    invoke-static {p1}, Lkw1/j;->j(Llw1/i;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Llw1/i;

    invoke-static {p1}, Lkw1/j;->e(Llw1/i;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Liw1/c;

    invoke-static {p1}, Lkw1/j;->n(Liw1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Liw1/e;

    invoke-static {p1}, Lkw1/g;->d(Liw1/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lcom/whoop/payments/domain/models/Card;

    invoke-static {p1}, Lkw1/d;->a(Lcom/whoop/payments/domain/models/Card;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lkw1/d;->s(Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Liw1/a;

    invoke-static {p1}, Lkw1/d;->d(Liw1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lk2/c;

    invoke-static {p1}, Lkv2/b;->a(Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Li2/g0;

    invoke-static {p1}, Lkv2/b;->h(Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-static {p1}, Lkotlin/time/InstantKt;->d(C)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-static {p1}, Lkotlin/time/InstantKt;->f(C)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-static {p1}, Lkotlin/time/InstantKt;->a(C)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-static {p1}, Lkotlin/time/InstantKt;->c(C)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-static {p1}, Lkotlin/time/InstantKt;->e(C)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-static {p1}, Lkotlin/time/InstantKt;->b(C)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lad3/g;

    invoke-static {p1}, Lko2/d;->c(Lad3/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    invoke-static {p1}, Lkm2/f;->c(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lim2/a;

    invoke-static {p1}, Lkm2/f;->b(Lim2/a;)Ll83/a0;

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
