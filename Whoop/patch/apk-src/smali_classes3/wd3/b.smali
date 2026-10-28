.class public final synthetic Lwd3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lwd3/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lwd3/b;->w:I

    const-string v1, "it"

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lro1/g;

    invoke-static {p1}, Lwo1/f0;->f(Lro1/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lwo1/f0;->g(Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lwo1/f0;->b(Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lvy0/y;

    invoke-static {p1}, Lwo1/t;->k(Lvy0/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/time/LocalDate;

    invoke-static {p1}, Lwo1/t;->i(Ljava/time/LocalDate;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lwo1/t;->d(Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lyn1/a;

    invoke-static {p1}, Lwo1/o;->d(Lyn1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lso1/r;

    invoke-static {p1}, Lwo1/o;->f(Lso1/r;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lyn1/a;

    invoke-static {p1}, Lwo1/k;->f(Lyn1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {p1}, Lwo1/k;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lwn2/f;->a(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;

    invoke-static {p1}, Lwn2/d;->a(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;)Lio2/h;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;

    invoke-static {p1}, Lwn2/d;->b(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;)Lxn2/c;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;

    invoke-static {p1}, Lwn2/d;->e(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;)Lxn2/g;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lwn2/d;->d(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lwn2/d;->c(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lwi0/e;->b(Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lwh0/a;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lwe1/k;->c(Ltb/a;)Lwe1/l;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lwe1/k;->e(Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lwe1/d;->f(Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Ll83/k;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lwe/m;->a:Ljava/util/Set;

    iget-object v0, p1, Ll83/k;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Lwd3/b;

    const/4 v0, 0x4

    invoke-direct {v5, v0}, Lwd3/b;-><init>(I)V

    const/16 v6, 0x1e

    const-string v2, ","

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x3a

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Ll83/k;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/CharSequence;

    return-object p1

    :pswitch_16
    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :pswitch_17
    check-cast p1, Ljava/lang/String;

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lwe/m;->b:Lyb3/p;

    const-string v1, " "

    invoke-virtual {v0, p1, v1}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ltg/b;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_1a
    check-cast p1, Ltg/b;

    const-string v0, "existing"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ltg/g;->n:Ltg/g;

    iget-object p1, p1, Ltg/b;->b:Ljava/lang/String;

    invoke-interface {v0, p1}, Ltg/e;->c(Ljava/lang/String;)Ltg/b;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Ljava/lang/String;

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_1c
    check-cast p1, Lwd3/c;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p1, Lwd3/c;->a:Lj93/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lwd3/c;->b:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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
