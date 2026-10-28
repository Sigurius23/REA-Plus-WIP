.class public abstract Lqz1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/design/models/items/CountrySelectorModel;",
        "Lr51/f;",
        "b",
        "(Lcom/whoop/design/models/items/CountrySelectorModel;)Lr51/f;",
        "Lcom/whoop/design/models/items/CountryModel;",
        "Lr51/g;",
        "c",
        "(Lcom/whoop/design/models/items/CountryModel;)Lr51/g;",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "Lny0/h;",
        "a",
        "(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;",
        "native-store_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private static final a(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Llb1/d4;->l(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;ILjava/lang/Object;)Lny0/h;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/whoop/design/models/items/CountrySelectorModel;)Lr51/f;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountrySelectorModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountrySelectorModel;->getSelectedCountry()Lcom/whoop/design/models/items/CountryModel;

    move-result-object v0

    invoke-static {v0}, Lqz1/a;->c(Lcom/whoop/design/models/items/CountryModel;)Lr51/g;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountrySelectorModel;->getHeaderText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountrySelectorModel;->getSearchPlaceholderText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountrySelectorModel;->getConfirmButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v0

    invoke-static {v0}, Lqz1/a;->a(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountrySelectorModel;->getCancelButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v0

    invoke-static {v0}, Lqz1/a;->a(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountrySelectorModel;->getCountries()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v8, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/items/CountryModel;

    invoke-static {v0}, Lqz1/a;->c(Lcom/whoop/design/models/items/CountryModel;)Lr51/g;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Lr51/f;

    invoke-direct/range {v1 .. v8}, Lr51/f;-><init>(Lny0/h;Lny0/h;Lr51/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    return-object v1
.end method

.method private static final c(Lcom/whoop/design/models/items/CountryModel;)Lr51/g;
    .locals 7

    new-instance v0, Lr51/g;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountryModel;->getAlpha2()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountryModel;->getAlpha3()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountryModel;->getRegion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountryModel;->getPhoneCountryCode()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountryModel;->getCountryFlag()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountryModel;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lr51/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method
