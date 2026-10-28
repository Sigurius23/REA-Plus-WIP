.class public abstract Ly00/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)Ly00/d2;
    .locals 5

    const-string v0, "input"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isDigit(C)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v2}, Lva3/d;->i(C)Z

    move-result v3

    if-nez v3, :cond_1

    const/16 v3, 0x2f

    if-ne v2, v3, :cond_0

    goto :goto_1

    :cond_0
    sget-object p0, Ly00/d2;->f:Ly00/d2;

    return-object p0

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    :goto_2
    if-ge v0, v2, :cond_4

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ly00/d2;

    const/4 v1, 0x2

    invoke-static {v1, p0}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, p0}, Lyb3/r;->W(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v2, p0}, Ly00/d2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic b(Ljava/lang/String;)Ly00/i;
    .locals 1

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "Discover"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Ly00/i;->R:Ly00/i;

    return-object p0

    :sswitch_1
    const-string v0, "Visa"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    sget-object p0, Ly00/i;->O:Ly00/i;

    return-object p0

    :sswitch_2
    const-string v0, "JCB"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    sget-object p0, Ly00/i;->S:Ly00/i;

    return-object p0

    :sswitch_3
    const-string v0, "MasterCard"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    sget-object p0, Ly00/i;->P:Ly00/i;

    return-object p0

    :sswitch_4
    const-string v0, "UnionPay"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    sget-object p0, Ly00/i;->U:Ly00/i;

    return-object p0

    :sswitch_5
    const-string v0, "American Express"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    sget-object p0, Ly00/i;->Q:Ly00/i;

    return-object p0

    :sswitch_6
    const-string v0, "Diners Club"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    sget-object p0, Ly00/i;->T:Ly00/i;

    return-object p0

    :cond_7
    :goto_0
    sget-object p0, Ly00/i;->X:Ly00/i;

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3b3bfd47 -> :sswitch_6
        -0x11ceb490 -> :sswitch_5
        -0xdd26087 -> :sswitch_4
        -0x2c10b4e -> :sswitch_3
        0x11e29 -> :sswitch_2
        0x28b061 -> :sswitch_1
        0x1422dc09 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final c(Ljava/util/Map;)Ll83/k;
    .locals 11

    const-string v0, "cardPaymentMethodCreateParams"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billing_details"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Ljava/util/Map;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Ljava/util/Map;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    const-string v0, "address"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    instance-of v2, v0, Ljava/util/Map;

    if-eqz v2, :cond_2

    move-object v1, v0

    check-cast v1, Ljava/util/Map;

    :cond_2
    const-string v0, "country_code"

    const-string v2, "billing_address"

    if-eqz v1, :cond_5

    const-string v3, "country"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "postal_code"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    new-instance v5, Ll83/k;

    invoke-direct {v5, v0, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "line1"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    new-instance v6, Ll83/k;

    const-string v3, "line_1"

    invoke-direct {v6, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "line2"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    new-instance v7, Ll83/k;

    const-string v3, "line_2"

    invoke-direct {v7, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "city"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    new-instance v8, Ll83/k;

    const-string v3, "locality"

    invoke-direct {v8, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "state"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    new-instance v9, Ll83/k;

    const-string v1, "administrative_area"

    invoke-direct {v9, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "name"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    new-instance v10, Ll83/k;

    invoke-direct {v10, v0, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v4 .. v10}, [Ll83/k;

    move-result-object p0

    invoke-static {p0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p0

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    new-instance p0, Ll83/k;

    invoke-direct {p0, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_5
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final d(Ly00/u5;)Ly00/o;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ly00/k5;

    if-eqz v0, :cond_0

    check-cast p0, Ly00/k5;

    iget-object p0, p0, Ly00/k5;->y:Ly00/o;

    return-object p0

    :cond_0
    instance-of v0, p0, Ly00/l5;

    if-eqz v0, :cond_1

    check-cast p0, Ly00/l5;

    iget-object p0, p0, Ly00/l5;->z:Ly00/o;

    return-object p0

    :cond_1
    instance-of v0, p0, Ly00/o5;

    if-eqz v0, :cond_2

    check-cast p0, Ly00/o5;

    iget-object p0, p0, Ly00/o5;->x:Ly00/o;

    return-object p0

    :cond_2
    instance-of v0, p0, Ly00/m5;

    if-eqz v0, :cond_3

    check-cast p0, Ly00/m5;

    iget-object p0, p0, Ly00/m5;->y:Ly00/o;

    return-object p0

    :cond_3
    instance-of v0, p0, Ly00/n5;

    if-eqz v0, :cond_4

    check-cast p0, Ly00/n5;

    iget-object p0, p0, Ly00/n5;->x:Ly00/o;

    return-object p0

    :cond_4
    instance-of v0, p0, Ly00/q5;

    if-eqz v0, :cond_5

    check-cast p0, Ly00/q5;

    iget-object p0, p0, Ly00/q5;->x:Ly00/o;

    return-object p0

    :cond_5
    instance-of v0, p0, Ly00/s5;

    if-eqz v0, :cond_6

    check-cast p0, Ly00/s5;

    iget-object p0, p0, Ly00/s5;->y:Ly00/o;

    return-object p0

    :cond_6
    instance-of v0, p0, Ly00/t5;

    if-eqz v0, :cond_7

    check-cast p0, Ly00/t5;

    iget-object p0, p0, Ly00/t5;->x:Ly00/o;

    return-object p0

    :cond_7
    instance-of v0, p0, Ly00/p5;

    if-eqz v0, :cond_8

    check-cast p0, Ly00/p5;

    iget-object p0, p0, Ly00/p5;->y:Ly00/o;

    return-object p0

    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
