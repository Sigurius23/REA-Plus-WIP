.class public final Lx30/w0;
.super Lad3/j;
.source "SourceFile"


# static fields
.field public static final c:Lx30/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lx30/w0;

    const-class v1, Lcom/stripe/android/ui/core/elements/FormItemSpec;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lad3/j;-><init>(Lj93/d;)V

    sput-object v0, Lx30/w0;->c:Lx30/w0;

    return-void
.end method


# virtual methods
.method public final a(Lkotlinx/serialization/json/JsonElement;)Lwc3/b;
    .locals 1

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lad3/m;->i(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    move-result-object p1

    const-string v0, "type"

    invoke-virtual {p1, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    invoke-virtual {p1}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_13

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v0, "au_becs_mandate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_1

    :cond_1
    sget-object p1, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/e;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/e;->serializer()Lwc3/c;

    move-result-object p1

    check-cast p1, Lwc3/b;

    return-object p1

    :sswitch_1
    const-string v0, "selector"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_1

    :cond_2
    sget-object p1, Lcom/stripe/android/ui/core/elements/DropdownSpec;->Companion:Lcom/stripe/android/ui/core/elements/l;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/l;->serializer()Lwc3/c;

    move-result-object p1

    check-cast p1, Lwc3/b;

    return-object p1

    :sswitch_2
    const-string v0, "country"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_1

    :cond_3
    sget-object p1, Lcom/stripe/android/ui/core/elements/CountrySpec;->Companion:Lcom/stripe/android/ui/core/elements/j;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/j;->serializer()Lwc3/c;

    move-result-object p1

    check-cast p1, Lwc3/b;

    return-object p1

    :sswitch_3
    const-string v0, "static_text"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_1

    :cond_4
    sget-object p1, Lcom/stripe/android/ui/core/elements/StaticTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/b0;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/b0;->serializer()Lwc3/c;

    move-result-object p1

    check-cast p1, Lwc3/b;

    return-object p1

    :sswitch_4
    const-string v0, "mandate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_1

    :cond_5
    sget-object p1, Lcom/stripe/android/ui/core/elements/MandateTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/r;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/r;->serializer()Lwc3/c;

    move-result-object p1

    check-cast p1, Lwc3/b;

    return-object p1

    :sswitch_5
    const-string v0, "klarna_country"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_1

    :cond_6
    sget-object p1, Lcom/stripe/android/ui/core/elements/CountrySpec;->Companion:Lcom/stripe/android/ui/core/elements/j;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/j;->serializer()Lwc3/c;

    move-result-object p1

    check-cast p1, Lwc3/b;

    return-object p1

    :sswitch_6
    const-string v0, "placeholder"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_1

    :cond_7
    sget-object p1, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;->Companion:Lcom/stripe/android/ui/core/elements/u;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/u;->serializer()Lwc3/c;

    move-result-object p1

    check-cast p1, Lwc3/b;

    return-object p1

    :sswitch_7
    const-string v0, "email"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto/16 :goto_1

    :cond_8
    sget-object p1, Lcom/stripe/android/ui/core/elements/EmailSpec;->Companion:Lcom/stripe/android/ui/core/elements/m;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/m;->serializer()Lwc3/c;

    move-result-object p1

    check-cast p1, Lwc3/b;

    return-object p1

    :sswitch_8
    const-string v0, "au_becs_account_number"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto/16 :goto_1

    :cond_9
    sget-object p1, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;->Companion:Lcom/stripe/android/ui/core/elements/d;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/d;->serializer()Lwc3/c;

    move-result-object p1

    check-cast p1, Lwc3/b;

    return-object p1

    :sswitch_9
    const-string v0, "text"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto/16 :goto_1

    :cond_a
    sget-object p1, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/a0;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/a0;->serializer()Lwc3/c;

    move-result-object p1

    check-cast p1, Lwc3/b;

    return-object p1

    :sswitch_a
    const-string v0, "name"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto/16 :goto_1

    :cond_b
    sget-object p1, Lcom/stripe/android/ui/core/elements/NameSpec;->Companion:Lcom/stripe/android/ui/core/elements/s;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/s;->serializer()Lwc3/c;

    move-result-object p1

    check-cast p1, Lwc3/b;

    return-object p1

    :sswitch_b
    const-string v0, "iban"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto/16 :goto_1

    :cond_c
    sget-object p1, Lcom/stripe/android/ui/core/elements/IbanSpec;->Companion:Lcom/stripe/android/ui/core/elements/o;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/o;->serializer()Lwc3/c;

    move-result-object p1

    check-cast p1, Lwc3/b;

    return-object p1

    :sswitch_c
    const-string v0, "sepa_mandate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto :goto_1

    :cond_d
    sget-object p1, Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/y;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/y;->serializer()Lwc3/c;

    move-result-object p1

    check-cast p1, Lwc3/b;

    return-object p1

    :sswitch_d
    const-string v0, "afterpay_header"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto :goto_1

    :cond_e
    sget-object p1, Lcom/stripe/android/ui/core/elements/AfterpayClearpayTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/c;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/c;->serializer()Lwc3/c;

    move-result-object p1

    check-cast p1, Lwc3/b;

    return-object p1

    :sswitch_e
    const-string v0, "billing_address"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    goto :goto_1

    :cond_f
    sget-object p1, Lcom/stripe/android/ui/core/elements/AddressSpec;->Companion:Lcom/stripe/android/ui/core/elements/a;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/a;->serializer()Lwc3/c;

    move-result-object p1

    check-cast p1, Lwc3/b;

    return-object p1

    :sswitch_f
    const-string v0, "au_becs_bsb_number"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    goto :goto_1

    :cond_10
    sget-object p1, Lcom/stripe/android/ui/core/elements/BsbSpec;->Companion:Lcom/stripe/android/ui/core/elements/h;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/h;->serializer()Lwc3/c;

    move-result-object p1

    check-cast p1, Lwc3/b;

    return-object p1

    :sswitch_10
    const-string v0, "affirm_header"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    goto :goto_1

    :cond_11
    sget-object p1, Lcom/stripe/android/ui/core/elements/AffirmTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/b;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/b;->serializer()Lwc3/c;

    move-result-object p1

    check-cast p1, Lwc3/b;

    return-object p1

    :sswitch_11
    const-string v0, "klarna_header"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    goto :goto_1

    :cond_12
    sget-object p1, Lcom/stripe/android/ui/core/elements/KlarnaHeaderStaticTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/p;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/p;->serializer()Lwc3/c;

    move-result-object p1

    check-cast p1, Lwc3/b;

    return-object p1

    :cond_13
    :goto_1
    sget-object p1, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/EmptyFormSpec;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->serializer()Lwc3/c;

    move-result-object p1

    check-cast p1, Lwc3/b;

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x728fd679 -> :sswitch_11
        -0x70559d97 -> :sswitch_10
        -0x3647f928 -> :sswitch_f
        -0x1ec545d0 -> :sswitch_e
        -0xb0efb20 -> :sswitch_d
        -0x8ea474 -> :sswitch_c
        0x313706 -> :sswitch_b
        0x337a8b -> :sswitch_a
        0x36452d -> :sswitch_9
        0x268fedc -> :sswitch_8
        0x5c24b9c -> :sswitch_7
        0x23a88573 -> :sswitch_6
        0x2a44efdc -> :sswitch_5
        0x31ca5808 -> :sswitch_4
        0x34c9045e -> :sswitch_3
        0x39175796 -> :sswitch_2
        0x4705f3df -> :sswitch_1
        0x4ada41e7 -> :sswitch_0
    .end sparse-switch
.end method
