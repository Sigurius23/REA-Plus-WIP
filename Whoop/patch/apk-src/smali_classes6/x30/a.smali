.class public final Lx30/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lx30/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lx30/a;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/StaticTextSpec;

    const-class v1, Lcom/stripe/android/ui/core/elements/StaticTextSpec;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/ui/core/elements/StaticTextSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    return-object v0

    :pswitch_0
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;

    const-class v0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/ui/core/elements/Capitalization;->valueOf(Ljava/lang/String;)Lcom/stripe/android/ui/core/elements/Capitalization;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/ui/core/elements/KeyboardType;->valueOf(Ljava/lang/String;)Lcom/stripe/android/ui/core/elements/KeyboardType;

    move-result-object v5

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    :goto_0
    move v6, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILcom/stripe/android/ui/core/elements/Capitalization;Lcom/stripe/android/ui/core/elements/KeyboardType;Z)V

    return-object v1

    :pswitch_1
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    :goto_2
    if-eq v3, v1, :cond_1

    const-class v4, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {p1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_2

    const/4 p1, 0x0

    goto :goto_3

    :cond_2
    sget-object v1, Lcom/stripe/android/ui/core/elements/SelectorIcon;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    :goto_3
    check-cast p1, Lcom/stripe/android/ui/core/elements/SelectorIcon;

    new-instance v1, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    invoke-direct {v1, v0, v2, p1}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;-><init>(Ljava/lang/String;Ljava/util/ArrayList;Lcom/stripe/android/ui/core/elements/SelectorIcon;)V

    return-object v1

    :pswitch_2
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;

    const-class v1, Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    return-object v0

    :pswitch_3
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/SelectorIcon;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/ui/core/elements/SelectorIcon;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_4
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/PhoneSpec;

    const-class v1, Lcom/stripe/android/ui/core/elements/PhoneSpec;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-direct {v0, p1}, Lcom/stripe/android/ui/core/elements/PhoneSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    return-object v0

    :pswitch_5
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Lcom/stripe/android/ui/core/elements/OTPSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/OTPSpec;

    return-object p1

    :pswitch_6
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/NameSpec;

    const-class v1, Lcom/stripe/android/ui/core/elements/NameSpec;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/ui/core/elements/TranslationId;->valueOf(Ljava/lang/String;)Lcom/stripe/android/ui/core/elements/TranslationId;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/ui/core/elements/NameSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;)V

    return-object v0

    :pswitch_7
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/MandateTextSpec;

    const-class v1, Lcom/stripe/android/ui/core/elements/MandateTextSpec;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/ui/core/elements/MandateTextSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    return-object v0

    :pswitch_8
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/KlarnaMandateTextSpec;

    const-class v1, Lcom/stripe/android/ui/core/elements/KlarnaMandateTextSpec;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/ui/core/elements/KlarnaMandateTextSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    return-object v0

    :pswitch_9
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/KlarnaHeaderStaticTextSpec;

    const-class v1, Lcom/stripe/android/ui/core/elements/KlarnaHeaderStaticTextSpec;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-direct {v0, p1}, Lcom/stripe/android/ui/core/elements/KlarnaHeaderStaticTextSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    return-object v0

    :pswitch_a
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/IbanSpec;

    const-class v1, Lcom/stripe/android/ui/core/elements/IbanSpec;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-direct {v0, p1}, Lcom/stripe/android/ui/core/elements/IbanSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    return-object v0

    :pswitch_b
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_c
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/EmptyFormSpec;

    return-object p1

    :pswitch_d
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/EmailSpec;

    const-class v1, Lcom/stripe/android/ui/core/elements/EmailSpec;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-direct {v0, p1}, Lcom/stripe/android/ui/core/elements/EmailSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    return-object v0

    :pswitch_e
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/stripe/android/ui/core/elements/DropdownSpec;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/stripe/android/ui/core/elements/TranslationId;->valueOf(Ljava/lang/String;)Lcom/stripe/android/ui/core/elements/TranslationId;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x0

    :goto_4
    if-eq v5, v3, :cond_3

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-virtual {p1, v6}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_3
    new-instance p1, Lcom/stripe/android/ui/core/elements/DropdownSpec;

    invoke-direct {p1, v1, v2, v4}, Lcom/stripe/android/ui/core/elements/DropdownSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;Ljava/util/List;)V

    return-object p1

    :pswitch_f
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_10
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/stripe/android/ui/core/elements/CountrySpec;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashSet;-><init>(I)V

    const/4 v3, 0x0

    :goto_5
    if-eq v3, v1, :cond_4

    const/4 v4, 0x1

    invoke-static {p1, v2, v3, v4}, Lte0/d;->e(Landroid/os/Parcel;Ljava/util/LinkedHashSet;II)I

    move-result v3

    goto :goto_5

    :cond_4
    new-instance p1, Lcom/stripe/android/ui/core/elements/CountrySpec;

    invoke-direct {p1, v0, v2}, Lcom/stripe/android/ui/core/elements/CountrySpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;)V

    return-object p1

    :pswitch_11
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/CashAppPayMandateTextSpec;

    const-class v1, Lcom/stripe/android/ui/core/elements/CashAppPayMandateTextSpec;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/ui/core/elements/CashAppPayMandateTextSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    return-object v0

    :pswitch_12
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/BsbSpec;

    const-class v1, Lcom/stripe/android/ui/core/elements/BsbSpec;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-direct {v0, p1}, Lcom/stripe/android/ui/core/elements/BsbSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    return-object v0

    :pswitch_13
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    new-instance p1, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;

    invoke-direct {p1}, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;-><init>()V

    return-object p1

    :pswitch_14
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    new-instance p1, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;

    invoke-direct {p1}, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;-><init>()V

    return-object p1

    :pswitch_15
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec;

    const-class v1, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-direct {v0, p1}, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    return-object v0

    :pswitch_16
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;

    const-class v1, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-direct {v0, p1}, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    return-object v0

    :pswitch_17
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/AfterpayClearpayTextSpec;

    const-class v1, Lcom/stripe/android/ui/core/elements/AfterpayClearpayTextSpec;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-direct {v0, p1}, Lcom/stripe/android/ui/core/elements/AfterpayClearpayTextSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    return-object v0

    :pswitch_18
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/AffirmTextSpec;

    const-class v1, Lcom/stripe/android/ui/core/elements/AffirmTextSpec;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-direct {v0, p1}, Lcom/stripe/android/ui/core/elements/AffirmTextSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    return-object v0

    :pswitch_19
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/stripe/android/ui/core/elements/AddressSpec;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4, v1}, Ljava/util/LinkedHashSet;-><init>(I)V

    const/4 v2, 0x0

    move v5, v2

    :goto_6
    const/4 v6, 0x1

    if-eq v5, v1, :cond_5

    invoke-static {p1, v4, v5, v6}, Lte0/d;->e(Landroid/os/Parcel;Ljava/util/LinkedHashSet;II)I

    move-result v5

    goto :goto_6

    :cond_5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5, v1}, Ljava/util/LinkedHashSet;-><init>(I)V

    move v7, v2

    :goto_7
    if-eq v7, v1, :cond_6

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/stripe/android/ui/core/elements/DisplayField;->valueOf(Ljava/lang/String;)Lcom/stripe/android/ui/core/elements/DisplayField;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    :cond_6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_7

    move v1, v6

    goto :goto_8

    :cond_7
    move v1, v6

    move v6, v2

    :goto_8
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lg40/m;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_8

    move v8, v1

    goto :goto_9

    :cond_8
    move v8, v2

    :goto_9
    new-instance v2, Lcom/stripe/android/ui/core/elements/AddressSpec;

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/ui/core/elements/AddressSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLg40/m;Z)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
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

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lx30/a;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/StaticTextSpec;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/SimpleTextSpec;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/SelectorIcon;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/PhoneSpec;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/OTPSpec;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/NameSpec;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/MandateTextSpec;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/KlarnaMandateTextSpec;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/KlarnaHeaderStaticTextSpec;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/IbanSpec;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/EmptyFormSpec;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/EmailSpec;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/DropdownSpec;

    return-object p1

    :pswitch_f
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    return-object p1

    :pswitch_10
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/CountrySpec;

    return-object p1

    :pswitch_11
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/CashAppPayMandateTextSpec;

    return-object p1

    :pswitch_12
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/BsbSpec;

    return-object p1

    :pswitch_13
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;

    return-object p1

    :pswitch_14
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;

    return-object p1

    :pswitch_15
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec;

    return-object p1

    :pswitch_16
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;

    return-object p1

    :pswitch_17
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/AfterpayClearpayTextSpec;

    return-object p1

    :pswitch_18
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/AffirmTextSpec;

    return-object p1

    :pswitch_19
    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/AddressSpec;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
