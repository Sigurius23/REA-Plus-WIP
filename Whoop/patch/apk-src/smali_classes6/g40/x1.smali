.class public final synthetic Lg40/x1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg40/z1;


# direct methods
.method public synthetic constructor <init>(Lg40/z1;I)V
    .locals 0

    iput p2, p0, Lg40/x1;->w:I

    iput-object p1, p0, Lg40/x1;->x:Lg40/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lg40/x1;->w:I

    const/4 v1, 0x0

    iget-object v2, p0, Lg40/x1;->x:Lg40/z1;

    check-cast p1, Ljava/lang/Integer;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lg40/k2;->a:Li93/c;

    iget-object v0, v2, Lg40/z1;->i:Lm63/d;

    iget-object v0, v0, Lm63/d;->F:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/model/Country;

    invoke-virtual {p1}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object p1

    const-string v0, "countryCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg40/k2;->b:Ljava/lang/Object;

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "toUpperCase(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg40/g2;

    if-eqz p1, :cond_3

    iget-object p1, p1, Lg40/g2;->c:Ljava/lang/String;

    if-eqz p1, :cond_3

    move v0, v1

    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x23

    if-ne v2, v3, :cond_1

    add-int/lit8 v0, v0, 0x1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    :goto_2
    return-object p1

    :pswitch_0
    sget-object v0, Lg40/k2;->a:Li93/c;

    iget-object v0, v2, Lg40/z1;->i:Lm63/d;

    iget-object v0, v0, Lm63/d;->F:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :cond_4
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/model/Country;

    invoke-virtual {p1}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lds/p;->E(Ljava/lang/String;)Lg40/k2;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
