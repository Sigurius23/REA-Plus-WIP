.class public abstract Lz30/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    const-string v11, "RU"

    const-string v12, "SE"

    const-string v0, "BE"

    const-string v1, "BR"

    const-string v2, "CH"

    const-string v3, "DE"

    const-string v4, "ES"

    const-string v5, "ID"

    const-string v6, "IT"

    const-string v7, "MX"

    const-string v8, "NL"

    const-string v9, "NO"

    const-string v10, "PL"

    filled-new-array/range {v0 .. v12}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lz30/f;->a:Ljava/util/Set;

    return-void
.end method

.method public static final a(Lz30/a;)Lz30/a;
    .locals 8

    iget-object v1, p0, Lz30/a;->a:Ljava/lang/String;

    iget-object v2, p0, Lz30/a;->b:Ljava/lang/String;

    iget-object v3, p0, Lz30/a;->c:Ljava/lang/String;

    iget-object v4, p0, Lz30/a;->d:Ljava/lang/String;

    iget-object v5, p0, Lz30/a;->e:Ljava/lang/String;

    iget-object v6, p0, Lz30/a;->f:Ljava/lang/String;

    iget-object v7, p0, Lz30/a;->g:Ljava/lang/String;

    new-instance v0, Lz30/a;

    invoke-direct/range {v0 .. v7}, Lz30/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lz30/a;->f:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object p0, p0, Lz30/a;->d:Ljava/lang/String;

    if-eqz p0, :cond_0

    const-string v2, ", "

    invoke-static {p0, v2, v1}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_0
    iput-object v1, v0, Lz30/a;->d:Ljava/lang/String;

    :cond_1
    return-object v0
.end method

.method public static final b(Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;Lz30/e;)Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;
    .locals 4

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;->getAddressComponents()Ljava/util/List;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getTypes()Ljava/util/List;

    move-result-object v2

    iget-object v3, p1, Lz30/e;->w:Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    :cond_1
    check-cast v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;

    :cond_2
    return-object v0
.end method
