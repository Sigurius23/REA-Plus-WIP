.class public final Lcom/whoop/data/repositories/LanguageRepository$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/data/repositories/LanguageRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\t*\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\'\u0010\u001c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/whoop/data/repositories/LanguageRepository$Companion;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "preferenceHelper",
        "Lcom/whoop/data/repositories/DefaultLanguageDecider;",
        "defaultLanguageDecider",
        "",
        "",
        "getComputedLanguageHeader",
        "(Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)Ljava/util/List;",
        "Lor2/r1;",
        "systemResources",
        "Ljava/util/Locale;",
        "obtainAllowedLanguage",
        "(Lor2/r1;Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)Ljava/util/Locale;",
        "language",
        "country",
        "buildFormattingLocale",
        "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Locale;",
        "print",
        "(Ljava/util/Locale;)Ljava/lang/String;",
        "Ljava/util/Locale$Builder;",
        "useWesternArabicNumbers",
        "(Ljava/util/Locale$Builder;)Ljava/util/Locale$Builder;",
        "getAcceptLanguageHeaderValue",
        "(Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)Ljava/lang/String;",
        "getFormattingLocaleHeaderValue",
        "(Lor2/r1;Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)Ljava/lang/String;",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/data/repositories/LanguageRepository$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$obtainAllowedLanguage(Lcom/whoop/data/repositories/LanguageRepository$Companion;Lor2/r1;Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)Ljava/util/Locale;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/data/repositories/LanguageRepository$Companion;->obtainAllowedLanguage(Lor2/r1;Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)Ljava/util/Locale;

    move-result-object p0

    return-object p0
.end method

.method private final buildFormattingLocale(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Locale;
    .locals 2

    new-instance v0, Ljava/util/Locale$Builder;

    invoke-direct {v0}, Ljava/util/Locale$Builder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/Locale$Builder;->setLanguage(Ljava/lang/String;)Ljava/util/Locale$Builder;

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {v0, p2}, Ljava/util/Locale$Builder;->setRegion(Ljava/lang/String;)Ljava/util/Locale$Builder;

    :cond_0
    invoke-static {}, Lcom/whoop/data/repositories/LanguageRepositoryKt;->access$getARABIC$p()Ljava/util/Locale;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/LanguageRepository$Companion;->useWesternArabicNumbers(Ljava/util/Locale$Builder;)Ljava/util/Locale$Builder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Locale$Builder;->build()Ljava/util/Locale;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    invoke-virtual {v0}, Ljava/util/Locale$Builder;->build()Ljava/util/Locale;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method private final getComputedLanguageHeader(Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/prefs/PreferenceHelper;",
            "Lcom/whoop/data/repositories/DefaultLanguageDecider;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "ACCEPT_LANGUAGE_HEADER"

    invoke-static {p1, v2, v0, v1, v0}, Lcom/whoop/data/local/prefs/PreferenceHelper;->getStringValueFromLanguagePrefs$default(Lcom/whoop/data/local/prefs/PreferenceHelper;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string p2, ","

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x6

    invoke-static {p1, p2, v0}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/whoop/data/repositories/DefaultLanguageDecider;->default()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    const-string p1, "en"

    :cond_2
    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final obtainAllowedLanguage(Lor2/r1;Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)Ljava/util/Locale;
    .locals 2

    invoke-interface {p1}, Lor2/r1;->b()Lb5/g;

    move-result-object p1

    invoke-virtual {p1}, Lb5/g;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0, p2, p3}, Lcom/whoop/data/repositories/LanguageRepository$Companion;->getComputedLanguageHeader(Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    invoke-virtual {p1, v1}, Lb5/g;->b(I)Ljava/util/Locale;

    move-result-object p1

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Required value was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final print(Ljava/util/Locale;)Ljava/lang/String;
    .locals 3

    const-string v0, "nu"

    invoke-virtual {p1, v0}, Ljava/util/Locale;->getUnicodeLocaleType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "_u-nu-"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method private final useWesternArabicNumbers(Ljava/util/Locale$Builder;)Ljava/util/Locale$Builder;
    .locals 2

    const-string v0, "nu"

    const-string v1, "latn"

    invoke-virtual {p1, v0, v1}, Ljava/util/Locale$Builder;->setUnicodeLocaleKeyword(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Locale$Builder;

    move-result-object p1

    const-string v0, "setUnicodeLocaleKeyword(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final getAcceptLanguageHeaderValue(Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)Ljava/lang/String;
    .locals 6

    const-string v0, "preferenceHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/repositories/LanguageRepository$Companion;->getComputedLanguageHeader(Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const-wide v1, 0x3feccccccccccccdL    # 0.9

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_1

    if-nez v3, :cond_0

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const-string v4, ","

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ";"

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-wide v4, 0x3fb999999999999aL    # 0.1

    sub-double/2addr v1, v4

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "toString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getFormattingLocaleHeaderValue(Lor2/r1;Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)Ljava/lang/String;
    .locals 1

    const-string v0, "systemResources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preferenceHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/data/repositories/LanguageRepository$Companion;->obtainAllowedLanguage(Lor2/r1;Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)Ljava/util/Locale;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lor2/r1;->a()Lb5/g;

    move-result-object p1

    invoke-static {p1}, Lor2/t0;->a(Lb5/g;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Locale;

    invoke-virtual {p1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p3

    :cond_0
    invoke-virtual {p2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object p1

    const-string p2, "getLanguage(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p3}, Lcom/whoop/data/repositories/LanguageRepository$Companion;->buildFormattingLocale(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Locale;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/LanguageRepository$Companion;->print(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
