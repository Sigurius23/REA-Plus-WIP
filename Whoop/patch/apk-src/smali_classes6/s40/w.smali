.class public final Ls40/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/view/CardNumberEditText;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/view/CardNumberEditText;I)V
    .locals 0

    iput p2, p0, Ls40/w;->w:I

    iput-object p1, p0, Ls40/w;->x:Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Ls40/w;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Ls40/w;->x:Lcom/stripe/android/view/CardNumberEditText;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v2, Lcom/stripe/android/view/CardNumberEditText;->l0:Z

    invoke-virtual {v2}, Lcom/stripe/android/view/CardNumberEditText;->getAccountRangeService$payments_core_release()Lzx/s;

    move-result-object p2

    iget-object p2, p2, Lzx/s;->m:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lzx/e;

    invoke-interface {p2}, Lzx/e;->a()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly00/b;

    iget-object v3, v3, Ly00/b;->y:Ly00/a;

    iget-object v3, v3, Ly00/a;->x:Ly00/i;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lm83/s;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-static {p2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly00/i;

    if-nez p1, :cond_1

    sget-object p1, Ly00/i;->X:Ly00/i;

    :cond_1
    invoke-virtual {v2, p1}, Lcom/stripe/android/view/CardNumberEditText;->setImplicitCardBrandForCbc$payments_core_release(Ly00/i;)V

    invoke-virtual {v2, p2}, Lcom/stripe/android/view/CardNumberEditText;->setPossibleCardBrands$payments_core_release(Ljava/util/List;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lm83/s;->r1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly00/i;

    if-nez p1, :cond_3

    sget-object p1, Ly00/i;->X:Ly00/i;

    :cond_3
    invoke-virtual {v2, p1}, Lcom/stripe/android/view/CardNumberEditText;->setCardBrand$payments_core_release(Ly00/i;)V

    :goto_1
    return-object v1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    new-instance v3, Lb30/i5;

    const/4 v4, 0x0

    const/4 v5, 0x6

    invoke-direct {v3, v2, p1, v4, v5}, Lb30/i5;-><init>(Ljava/lang/Object;ZLq83/d;I)V

    invoke-static {v0, v3, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_4

    move-object v1, p1

    :cond_4
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
