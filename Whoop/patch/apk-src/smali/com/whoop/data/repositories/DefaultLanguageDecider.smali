.class public final Lcom/whoop/data/repositories/DefaultLanguageDecider;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/repositories/DefaultLanguageDecider$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\n\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u000eR\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/whoop/data/repositories/DefaultLanguageDecider;",
        "",
        "Lor2/r1;",
        "systemResources",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "preferenceHelper",
        "",
        "",
        "onForAllLanguages",
        "<init>",
        "(Lor2/r1;Lcom/whoop/data/local/prefs/PreferenceHelper;Ljava/util/Set;)V",
        "default",
        "()Ljava/lang/String;",
        "Lor2/r1;",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "Ljava/util/Set;",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/whoop/data/repositories/DefaultLanguageDecider$Companion;


# instance fields
.field private final onForAllLanguages:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final preferenceHelper:Lcom/whoop/data/local/prefs/PreferenceHelper;

.field private final systemResources:Lor2/r1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/repositories/DefaultLanguageDecider$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/repositories/DefaultLanguageDecider$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/repositories/DefaultLanguageDecider;->Companion:Lcom/whoop/data/repositories/DefaultLanguageDecider$Companion;

    return-void
.end method

.method public constructor <init>(Lor2/r1;Lcom/whoop/data/local/prefs/PreferenceHelper;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lor2/r1;",
            "Lcom/whoop/data/local/prefs/PreferenceHelper;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "systemResources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preferenceHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onForAllLanguages"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/repositories/DefaultLanguageDecider;->systemResources:Lor2/r1;

    iput-object p2, p0, Lcom/whoop/data/repositories/DefaultLanguageDecider;->preferenceHelper:Lcom/whoop/data/local/prefs/PreferenceHelper;

    iput-object p3, p0, Lcom/whoop/data/repositories/DefaultLanguageDecider;->onForAllLanguages:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final default()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/data/repositories/DefaultLanguageDecider;->systemResources:Lor2/r1;

    invoke-interface {v0}, Lor2/r1;->c()Lb5/g;

    move-result-object v0

    invoke-static {v0}, Lor2/t0;->a(Lb5/g;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/data/repositories/DefaultLanguageDecider;->preferenceHelper:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const/4 v2, 0x2

    const-string v3, "ALLOWED_LANGUAGES"

    const/4 v4, 0x0

    invoke-static {v1, v3, v4, v2, v4}, Lcom/whoop/data/local/prefs/PreferenceHelper;->getStringValueFromLanguagePrefs$default(Lcom/whoop/data/local/prefs/PreferenceHelper;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ","

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v1, v2, v3}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/util/Locale;

    iget-object v3, p0, Lcom/whoop/data/repositories/DefaultLanguageDecider;->onForAllLanguages:Ljava/util/Set;

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Lcom/whoop/data/repositories/DefaultLanguageDecider;->Companion:Lcom/whoop/data/repositories/DefaultLanguageDecider$Companion;

    invoke-virtual {v3, v2}, Lcom/whoop/data/repositories/DefaultLanguageDecider$Companion;->allowedByRegion(Ljava/util/Locale;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v4, v1

    :cond_1
    check-cast v4, Ljava/util/Locale;

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    return-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Locale;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    sget-object v4, Lcom/whoop/data/repositories/DefaultLanguageDecider;->Companion:Lcom/whoop/data/repositories/DefaultLanguageDecider$Companion;

    invoke-virtual {v4, v2}, Lcom/whoop/data/repositories/DefaultLanguageDecider$Companion;->allowedByRegion(Ljava/util/Locale;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getLanguage(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_6
    :goto_0
    const-string v0, "en"

    return-object v0
.end method
