.class public final Lcom/stripe/android/uicore/elements/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 7

    const-string v0, "_value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZLg40/w1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static b(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardBrand$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->getV1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardBrand$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardNumber$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->getV1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardNumber$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardCvc$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->getV1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardCvc$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCity$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->getV1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCity$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->getV1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getEmail$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->getV1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getEmail$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    return-object p0

    :cond_5
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine1$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->getV1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine1$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    return-object p0

    :cond_6
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine2$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->getV1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine2$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    return-object p0

    :cond_7
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->getV1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    return-object p0

    :cond_8
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPhone$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->getV1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPhone$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    return-object p0

    :cond_9
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPostalCode$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->getV1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPostalCode$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    return-object p0

    :cond_a
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getSaveForFutureUse$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->getV1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getSaveForFutureUse$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    return-object p0

    :cond_b
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getState$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->getV1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getState$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    return-object p0

    :cond_c
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getOneLineAddress$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->getV1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getOneLineAddress$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    return-object p0

    :cond_d
    invoke-static {p0}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final serializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;->INSTANCE:Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;

    return-object v0
.end method
