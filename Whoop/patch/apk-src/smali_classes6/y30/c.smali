.class public final Ly30/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly30/e;


# instance fields
.field public final a:Lcom/google/android/libraries/places/api/net/PlacesClient;

.field public final b:Lb20/f;

.field public final c:Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;


# direct methods
.method public constructor <init>(Lcom/google/android/libraries/places/api/net/PlacesClient;Lb20/f;)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly30/c;->a:Lcom/google/android/libraries/places/api/net/PlacesClient;

    iput-object p2, p0, Ly30/c;->b:Lb20/f;

    invoke-static {}, Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;->newInstance()Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;

    move-result-object p1

    iput-object p1, p0, Ly30/c;->c:Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Ly30/a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ly30/a;

    iget v1, v0, Ly30/a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly30/a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly30/a;

    check-cast p2, Ls83/c;

    invoke-direct {v0, p0, p2}, Ly30/a;-><init>(Ly30/c;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Ly30/a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ly30/a;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Ly30/a;->w:Ly30/c;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Ly30/c;->a:Lcom/google/android/libraries/places/api/net/PlacesClient;

    sget-object v2, Lcom/google/android/libraries/places/api/model/Place$Field;->ADDRESS_COMPONENTS:Lcom/google/android/libraries/places/api/model/Place$Field;

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/google/android/libraries/places/api/net/FetchPlaceRequest;->newInstance(Ljava/lang/String;Ljava/util/List;)Lcom/google/android/libraries/places/api/net/FetchPlaceRequest;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/google/android/libraries/places/api/net/PlacesClient;->fetchPlace(Lcom/google/android/libraries/places/api/net/FetchPlaceRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string p2, "fetchPlace(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, v0, Ly30/a;->w:Ly30/c;

    iput v4, v0, Ly30/a;->z:I

    invoke-static {p1, v0}, Lcom/squareup/wire/n;->o(Lcom/google/android/gms/tasks/Task;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    :try_start_2
    check-cast p2, Lcom/google/android/libraries/places/api/net/FetchPlaceResponse;

    iget-object v0, p1, Ly30/c;->b:Lb20/f;

    sget-object v1, Lb20/d;->z:Lb20/d;

    const/4 v2, 0x6

    invoke-static {v0, v1, v3, v3, v2}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    invoke-virtual {p2}, Lcom/google/android/libraries/places/api/net/FetchPlaceResponse;->getPlace()Lcom/google/android/libraries/places/api/model/Place;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/libraries/places/api/model/Place;->getAddressComponents()Lcom/google/android/libraries/places/api/model/AddressComponents;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/google/android/libraries/places/api/model/AddressComponents;->asList()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_4

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/libraries/places/api/model/AddressComponent;

    new-instance v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;

    invoke-virtual {v1}, Lcom/google/android/libraries/places/api/model/AddressComponent;->getShortName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/google/android/libraries/places/api/model/AddressComponent;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "getName(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/google/android/libraries/places/api/model/AddressComponent;->getTypes()Ljava/util/List;

    move-result-object v1

    const-string v6, "getTypes(...)"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v4, v5, v1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    move-object v0, v3

    :cond_5
    new-instance p2, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;

    invoke-direct {p2, v0}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;-><init>(Ljava/util/List;)V

    new-instance v0, Lz30/c;

    invoke-direct {v0, p2}, Lz30/c;-><init>(Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :catch_1
    move-exception p2

    move-object p1, p0

    :goto_3
    iget-object p1, p1, Ly30/c;->b:Lb20/f;

    sget-object v0, Lb20/c;->I:Lb20/c;

    sget v1, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {p2}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {p1, v0, v1, v3, v2}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    new-instance p1, Ljava/lang/Exception;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string v0, "Could not fetch place: "

    invoke-static {v0, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p4, Ly30/b;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Ly30/b;

    iget v1, v0, Ly30/b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly30/b;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly30/b;

    check-cast p4, Ls83/c;

    invoke-direct {v0, p0, p4}, Ly30/b;-><init>(Ly30/c;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Ly30/b;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ly30/b;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget p3, v0, Ly30/b;->x:I

    iget-object p1, v0, Ly30/b;->w:Ly30/c;

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p4, p0, Ly30/c;->a:Lcom/google/android/libraries/places/api/net/PlacesClient;

    invoke-static {}, Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest;->builder()Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest$Builder;

    move-result-object v2

    iget-object v5, p0, Ly30/c;->c:Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;

    invoke-virtual {v2, v5}, Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest$Builder;->setSessionToken(Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;)Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest$Builder;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest$Builder;->setQuery(Ljava/lang/String;)Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest$Builder;

    move-result-object p1

    invoke-static {p2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest$Builder;->setCountries(Ljava/util/List;)Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest$Builder;

    move-result-object p1

    const-string p2, "address"

    invoke-static {p2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest$Builder;->setTypesFilter(Ljava/util/List;)Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest$Builder;->build()Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest;

    move-result-object p1

    invoke-interface {p4, p1}, Lcom/google/android/libraries/places/api/net/PlacesClient;->findAutocompletePredictions(Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string p2, "findAutocompletePredictions(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, v0, Ly30/b;->w:Ly30/c;

    iput p3, v0, Ly30/b;->x:I

    iput v4, v0, Ly30/b;->E:I

    invoke-static {p1, v0}, Lcom/squareup/wire/n;->o(Lcom/google/android/gms/tasks/Task;Lq83/d;)Ljava/lang/Object;

    move-result-object p4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    :try_start_2
    check-cast p4, Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsResponse;

    iget-object p2, p1, Ly30/c;->b:Lb20/f;

    sget-object v0, Lb20/d;->y:Lb20/d;

    const/4 v1, 0x6

    invoke-static {p2, v0, v3, v3, v1}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    invoke-virtual {p4}, Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsResponse;->getAutocompletePredictions()Ljava/util/List;

    move-result-object p2

    const-string p4, "getAutocompletePredictions(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    new-instance p4, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p4, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/libraries/places/api/model/AutocompletePrediction;

    new-instance v1, Lz30/b;

    new-instance v2, Landroid/text/style/StyleSpan;

    invoke-direct {v2, v4}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {v0, v2}, Lcom/google/android/libraries/places/api/model/AutocompletePrediction;->getPrimaryText(Landroid/text/style/CharacterStyle;)Landroid/text/SpannableString;

    move-result-object v2

    const-string v5, "getPrimaryText(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Landroid/text/style/StyleSpan;

    invoke-direct {v5, v4}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {v0, v5}, Lcom/google/android/libraries/places/api/model/AutocompletePrediction;->getSecondaryText(Landroid/text/style/CharacterStyle;)Landroid/text/SpannableString;

    move-result-object v5

    const-string v6, "getSecondaryText(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/libraries/places/api/model/AutocompletePrediction;->getPlaceId()Ljava/lang/String;

    move-result-object v0

    const-string v6, "getPlaceId(...)"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, v5, v0}, Lz30/b;-><init>(Landroid/text/SpannableString;Landroid/text/SpannableString;Ljava/lang/String;)V

    invoke-virtual {p4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-static {p4, p3}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p2

    new-instance p3, Lz30/d;

    invoke-direct {p3, p2}, Lz30/d;-><init>(Ljava/util/List;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p3

    :catch_1
    move-exception p2

    move-object p1, p0

    :goto_3
    iget-object p1, p1, Ly30/c;->b:Lb20/f;

    sget-object p3, Lb20/c;->H:Lb20/c;

    sget p4, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {p2}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object p4

    const/4 v0, 0x4

    invoke-static {p1, p3, p4, v3, v0}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    new-instance p1, Ljava/lang/Exception;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string p3, "Could not find autocomplete predictions: "

    invoke-static {p3, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method
