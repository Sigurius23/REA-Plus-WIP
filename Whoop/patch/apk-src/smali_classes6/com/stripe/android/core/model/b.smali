.class public final Lcom/stripe/android/core/model/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)Lcom/stripe/android/core/model/CountryCode;
    .locals 2

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/core/model/CountryCode;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "toUpperCase(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Lcom/stripe/android/core/model/CountryCode;-><init>(Ljava/lang/String;)V

    return-object v0
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

    sget-object v0, Lcom/stripe/android/core/model/CountryCode$$serializer;->INSTANCE:Lcom/stripe/android/core/model/CountryCode$$serializer;

    return-object v0
.end method
