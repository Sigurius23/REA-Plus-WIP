.class public final Lcom/whoop/data/repositories/LanguageRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/data/repositories/LanguageChecker;
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/repositories/LanguageRepository$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0013\n\u0002\u0010\u001e\n\u0002\u0008\u0017\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0001eB\u008b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H\u0086@\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010%\u001a\u00020!2\u0006\u0010$\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u000f\u0010(\u001a\u00020\'H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\r\u0010*\u001a\u00020\n\u00a2\u0006\u0004\u0008*\u0010+J\u0016\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\n0,H\u0086@\u00a2\u0006\u0004\u0008-\u0010#J\u000f\u0010.\u001a\u00020!H\u0002\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020!H\u0082@\u00a2\u0006\u0004\u00080\u0010#J\u0010\u00101\u001a\u00020!H\u0082@\u00a2\u0006\u0004\u00081\u0010#J\u0016\u00102\u001a\u0008\u0012\u0004\u0012\u00020\n0,H\u0082@\u00a2\u0006\u0004\u00082\u0010#J\u001e\u00104\u001a\u0008\u0012\u0004\u0012\u00020\n0,2\u0006\u00103\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u00084\u00105J%\u00108\u001a\u00020!2\u000c\u00106\u001a\u0008\u0012\u0004\u0012\u00020\n0,2\u0006\u00107\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u00088\u00109J\u0017\u0010<\u001a\u00020;2\u0006\u0010:\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008<\u0010=J\u0010\u0010>\u001a\u00020;H\u0082@\u00a2\u0006\u0004\u0008>\u0010#J\u0018\u0010?\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010,H\u0082@\u00a2\u0006\u0004\u0008?\u0010#J#\u0010A\u001a\u0008\u0012\u0004\u0012\u00020\n0,2\u000c\u0010@\u001a\u0008\u0012\u0004\u0012\u00020\n0,H\u0002\u00a2\u0006\u0004\u0008A\u0010BJ\u0017\u0010D\u001a\u00020;2\u0006\u0010C\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008D\u0010=J\u001d\u0010E\u001a\u00020!2\u000c\u00106\u001a\u0008\u0012\u0004\u0012\u00020\n0,H\u0002\u00a2\u0006\u0004\u0008E\u0010FJ\u000f\u0010G\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008G\u0010+J\u001d\u0010H\u001a\u00020!2\u000c\u00106\u001a\u0008\u0012\u0004\u0012\u00020\n0,H\u0002\u00a2\u0006\u0004\u0008H\u0010FJ\u0016\u0010I\u001a\u0008\u0012\u0004\u0012\u00020\n0,H\u0082@\u00a2\u0006\u0004\u0008I\u0010#J\u0016\u0010J\u001a\u0008\u0012\u0004\u0012\u00020\n0,H\u0082@\u00a2\u0006\u0004\u0008J\u0010#J\u0016\u0010K\u001a\u0008\u0012\u0004\u0012\u00020\n0,H\u0082@\u00a2\u0006\u0004\u0008K\u0010#J$\u0010M\u001a\u0008\u0012\u0004\u0012\u00020\n0,2\u000c\u0010L\u001a\u0008\u0012\u0004\u0012\u00020\n0,H\u0082@\u00a2\u0006\u0004\u0008M\u0010NJ\'\u0010P\u001a\u0004\u0018\u00010\n2\u0006\u0010C\u001a\u00020\n2\u000c\u0010L\u001a\u0008\u0012\u0004\u0012\u00020\n0OH\u0002\u00a2\u0006\u0004\u0008P\u0010QJ\u0017\u0010S\u001a\u00020;2\u0006\u0010R\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008S\u0010=J\u0017\u0010T\u001a\u00020;2\u0006\u0010R\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008T\u0010=J%\u0010U\u001a\u00020;2\u0006\u0010R\u001a\u00020\n2\u000c\u0010L\u001a\u0008\u0012\u0004\u0012\u00020\n0OH\u0002\u00a2\u0006\u0004\u0008U\u0010VJ\u0017\u0010W\u001a\u00020;2\u0006\u0010R\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008W\u0010=J\u0010\u0010X\u001a\u00020!H\u0082@\u00a2\u0006\u0004\u0008X\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010YR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010ZR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010[R\u001a\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\\R\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\\R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010]R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010^R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010_R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010`R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010aR\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010bR\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010d\u00a8\u0006f"
    }
    d2 = {
        "Lcom/whoop/data/repositories/LanguageRepository;",
        "Lcom/whoop/data/repositories/LanguageChecker;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Lcom/whoop/service/network/LanguageApi;",
        "languageApi",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "preferenceHelper",
        "Lod1/u;",
        "userContext",
        "",
        "",
        "appSupportedLanguages",
        "onForAllLanguages",
        "Lor2/r1;",
        "systemResources",
        "Lor2/g;",
        "buildConfigProvider",
        "Lbc3/c0;",
        "coroutineScope",
        "Landroidx/lifecycle/g0;",
        "processLifecycleOwner",
        "Lcom/whoop/data/repositories/DefaultLanguageDecider;",
        "defaultLanguageDecider",
        "Ll83/h;",
        "Lcom/whoop/data/repositories/CachedDataLanguageRefresher;",
        "languageRefresher",
        "La6/g;",
        "Lf6/f;",
        "prefsDataStore",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/service/network/LanguageApi;Lcom/whoop/data/local/prefs/PreferenceHelper;Lod1/u;Ljava/util/Set;Ljava/util/Set;Lor2/r1;Lor2/g;Lbc3/c0;Landroidx/lifecycle/g0;Lcom/whoop/data/repositories/DefaultLanguageDecider;Ll83/h;La6/g;Ltr2/n;)V",
        "Ll83/a0;",
        "onLanguageChanged",
        "(Lq83/d;)Ljava/lang/Object;",
        "owner",
        "onStart",
        "(Landroidx/lifecycle/g0;)V",
        "Ljava/util/Locale;",
        "getAllowedLanguage",
        "()Ljava/util/Locale;",
        "getHeader",
        "()Ljava/lang/String;",
        "",
        "fetchAllowedLanguagesForUi",
        "removeCachedLanguageData",
        "()V",
        "cacheAllowedLanguageListAndHeader",
        "updatedAllowedLanguageList",
        "localesToUse",
        "previouslyCachedAllowedLanguagesString",
        "computeAllowedLanguageListFromPreviouslyCachedList",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "allowedLanguagesList",
        "oldLanguage",
        "setAppLocaleList",
        "(Ljava/util/List;Ljava/lang/String;)V",
        "language",
        "",
        "isNotEnglish",
        "(Ljava/lang/String;)Z",
        "isFirstPreferredLanguageOnForAll",
        "fetchAllowedLanguages",
        "allowedLanguagesFromBackend",
        "sanitizeAllowedLanguagesFromBackendForRegion",
        "(Ljava/util/List;)Ljava/util/List;",
        "locale",
        "displayForUi",
        "cacheComputedAllowedLanguageList",
        "(Ljava/util/List;)V",
        "getComputedAllowedLanguageList",
        "cacheComputedLanguageHeader",
        "getAllowedLanguagesAuthed",
        "getEnabledLanguages",
        "getAllowedLanguagesOnboarding",
        "acceptedLanguages",
        "filterSystemLocalePreferences",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "",
        "shouldInclude",
        "(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;",
        "localeString",
        "thisAppVersionHasStringsFor",
        "isOnForAll",
        "regionMatch",
        "(Ljava/lang/String;Ljava/util/Collection;)Z",
        "pseudoLocale",
        "updateBackendLanguagePreference",
        "Lcom/whoop/service/network/LanguageApi;",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "Lod1/u;",
        "Ljava/util/Set;",
        "Lor2/r1;",
        "Lor2/g;",
        "Lbc3/c0;",
        "Landroidx/lifecycle/g0;",
        "Lcom/whoop/data/repositories/DefaultLanguageDecider;",
        "Ll83/h;",
        "La6/g;",
        "Ltr2/n;",
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
.field public static final Companion:Lcom/whoop/data/repositories/LanguageRepository$Companion;


# instance fields
.field private final appSupportedLanguages:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final buildConfigProvider:Lor2/g;

.field private final coroutineScope:Lbc3/c0;

.field private final defaultLanguageDecider:Lcom/whoop/data/repositories/DefaultLanguageDecider;

.field private final languageApi:Lcom/whoop/service/network/LanguageApi;

.field private final languageRefresher:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private final logger:Ltr2/n;

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

.field private final prefsDataStore:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field

.field private final processLifecycleOwner:Landroidx/lifecycle/g0;

.field private final systemResources:Lor2/r1;

.field private final userContext:Lod1/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/repositories/LanguageRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/repositories/LanguageRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/repositories/LanguageRepository;->Companion:Lcom/whoop/data/repositories/LanguageRepository$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/service/network/LanguageApi;Lcom/whoop/data/local/prefs/PreferenceHelper;Lod1/u;Ljava/util/Set;Ljava/util/Set;Lor2/r1;Lor2/g;Lbc3/c0;Landroidx/lifecycle/g0;Lcom/whoop/data/repositories/DefaultLanguageDecider;Ll83/h;La6/g;Ltr2/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/network/LanguageApi;",
            "Lcom/whoop/data/local/prefs/PreferenceHelper;",
            "Lod1/u;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lor2/r1;",
            "Lor2/g;",
            "Lbc3/c0;",
            "Landroidx/lifecycle/g0;",
            "Lcom/whoop/data/repositories/DefaultLanguageDecider;",
            "Ll83/h;",
            "La6/g;",
            "Ltr2/n;",
            ")V"
        }
    .end annotation

    const-string v0, "languageApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preferenceHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appSupportedLanguages"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onForAllLanguages"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "systemResources"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buildConfigProvider"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processLifecycleOwner"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultLanguageDecider"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "languageRefresher"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefsDataStore"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/data/repositories/LanguageRepository;->languageApi:Lcom/whoop/service/network/LanguageApi;

    .line 3
    iput-object p2, p0, Lcom/whoop/data/repositories/LanguageRepository;->preferenceHelper:Lcom/whoop/data/local/prefs/PreferenceHelper;

    .line 4
    iput-object p3, p0, Lcom/whoop/data/repositories/LanguageRepository;->userContext:Lod1/u;

    .line 5
    iput-object p4, p0, Lcom/whoop/data/repositories/LanguageRepository;->appSupportedLanguages:Ljava/util/Set;

    .line 6
    iput-object p5, p0, Lcom/whoop/data/repositories/LanguageRepository;->onForAllLanguages:Ljava/util/Set;

    .line 7
    iput-object p6, p0, Lcom/whoop/data/repositories/LanguageRepository;->systemResources:Lor2/r1;

    .line 8
    iput-object p7, p0, Lcom/whoop/data/repositories/LanguageRepository;->buildConfigProvider:Lor2/g;

    .line 9
    iput-object p8, p0, Lcom/whoop/data/repositories/LanguageRepository;->coroutineScope:Lbc3/c0;

    .line 10
    iput-object p9, p0, Lcom/whoop/data/repositories/LanguageRepository;->processLifecycleOwner:Landroidx/lifecycle/g0;

    .line 11
    iput-object p10, p0, Lcom/whoop/data/repositories/LanguageRepository;->defaultLanguageDecider:Lcom/whoop/data/repositories/DefaultLanguageDecider;

    .line 12
    iput-object p11, p0, Lcom/whoop/data/repositories/LanguageRepository;->languageRefresher:Ll83/h;

    .line 13
    iput-object p12, p0, Lcom/whoop/data/repositories/LanguageRepository;->prefsDataStore:La6/g;

    .line 14
    iput-object p13, p0, Lcom/whoop/data/repositories/LanguageRepository;->logger:Ltr2/n;

    .line 15
    check-cast p5, Ljava/util/Collection;

    invoke-interface {p4, p5}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "onForAllLanguages must be a subset of appSupportedLanguages"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lcom/whoop/service/network/LanguageApi;Lcom/whoop/data/local/prefs/PreferenceHelper;Lod1/u;Ljava/util/Set;Ljava/util/Set;Lor2/r1;Lor2/g;Lbc3/c0;Landroidx/lifecycle/g0;Lcom/whoop/data/repositories/DefaultLanguageDecider;Ll83/h;La6/g;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p14

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_0

    .line 16
    sget-object v1, Lbc3/q0;->a:Lkc3/e;

    .line 17
    sget-object v1, Lhc3/o;->a:Lbc3/w1;

    .line 18
    invoke-virtual {v1}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v1

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v2

    invoke-virtual {v1, v2}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object v1

    invoke-static {v1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v1

    move-object v10, v1

    goto :goto_0

    :cond_0
    move-object/from16 v10, p8

    :goto_0
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_1

    .line 19
    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "LanguageRepository"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    move-object v15, v0

    :goto_1
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    goto :goto_2

    :cond_1
    move-object/from16 v15, p13

    goto :goto_1

    .line 20
    :goto_2
    invoke-direct/range {v2 .. v15}, Lcom/whoop/data/repositories/LanguageRepository;-><init>(Lcom/whoop/service/network/LanguageApi;Lcom/whoop/data/local/prefs/PreferenceHelper;Lod1/u;Ljava/util/Set;Ljava/util/Set;Lor2/r1;Lor2/g;Lbc3/c0;Landroidx/lifecycle/g0;Lcom/whoop/data/repositories/DefaultLanguageDecider;Ll83/h;La6/g;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic access$cacheAllowedLanguageListAndHeader(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/LanguageRepository;->cacheAllowedLanguageListAndHeader(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$computeAllowedLanguageListFromPreviouslyCachedList(Lcom/whoop/data/repositories/LanguageRepository;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/repositories/LanguageRepository;->computeAllowedLanguageListFromPreviouslyCachedList(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$fetchAllowedLanguages(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/LanguageRepository;->fetchAllowedLanguages(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$filterSystemLocalePreferences(Lcom/whoop/data/repositories/LanguageRepository;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/repositories/LanguageRepository;->filterSystemLocalePreferences(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAllowedLanguagesAuthed(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/LanguageRepository;->getAllowedLanguagesAuthed(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAllowedLanguagesOnboarding(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/LanguageRepository;->getAllowedLanguagesOnboarding(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getEnabledLanguages(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/LanguageRepository;->getEnabledLanguages(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getLanguageApi$p(Lcom/whoop/data/repositories/LanguageRepository;)Lcom/whoop/service/network/LanguageApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/LanguageRepository;->languageApi:Lcom/whoop/service/network/LanguageApi;

    return-object p0
.end method

.method public static final synthetic access$getLanguageRefresher$p(Lcom/whoop/data/repositories/LanguageRepository;)Ll83/h;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/LanguageRepository;->languageRefresher:Ll83/h;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/whoop/data/repositories/LanguageRepository;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/LanguageRepository;->logger:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic access$getPrefsDataStore$p(Lcom/whoop/data/repositories/LanguageRepository;)La6/g;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/LanguageRepository;->prefsDataStore:La6/g;

    return-object p0
.end method

.method public static final synthetic access$getProcessLifecycleOwner$p(Lcom/whoop/data/repositories/LanguageRepository;)Landroidx/lifecycle/g0;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/LanguageRepository;->processLifecycleOwner:Landroidx/lifecycle/g0;

    return-object p0
.end method

.method public static final synthetic access$getSystemResources$p(Lcom/whoop/data/repositories/LanguageRepository;)Lor2/r1;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/LanguageRepository;->systemResources:Lor2/r1;

    return-object p0
.end method

.method public static final synthetic access$isFirstPreferredLanguageOnForAll(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/LanguageRepository;->isFirstPreferredLanguageOnForAll(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isNotEnglish(Lcom/whoop/data/repositories/LanguageRepository;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/LanguageRepository;->isNotEnglish(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$localesToUse(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/LanguageRepository;->localesToUse(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateBackendLanguagePreference(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/LanguageRepository;->updateBackendLanguagePreference(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updatedAllowedLanguageList(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/LanguageRepository;->updatedAllowedLanguageList(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final cacheAllowedLanguageListAndHeader(Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;

    iget v1, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->label:I

    const/4 v3, 0x6

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v1, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v0, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_1
    iget v2, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->I$0:I

    iget-object v5, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->L$0:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_2
    iget v2, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->I$0:I

    iget-object v5, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->L$0:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_3
    iget v2, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->I$0:I

    iget-object v5, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->L$0:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_4
    iget v2, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->I$0:I

    iget-object v5, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->L$0:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_5
    iget v2, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->I$0:I

    iget-object v5, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->L$0:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/whoop/data/repositories/LanguageRepository;->getComputedAllowedLanguageList()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v2, 0x1

    xor-int/2addr p1, v2

    iput-object v5, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->L$0:Ljava/lang/Object;

    iput p1, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->I$0:I

    iput v2, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/LanguageRepository;->isFirstPreferredLanguageOnForAll(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_1

    goto/16 :goto_7

    :cond_1
    move-object v6, v2

    move v2, p1

    move-object p1, v6

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    if-eqz v2, :cond_3

    iput-object v4, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->L$0:Ljava/lang/Object;

    iput v2, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->I$0:I

    const/4 p1, 0x2

    iput p1, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->label:I

    invoke-direct {p0, v5, v0}, Lcom/whoop/data/repositories/LanguageRepository;->computeAllowedLanguageListFromPreviouslyCachedList(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto/16 :goto_7

    :cond_2
    :goto_2
    check-cast p1, Ljava/util/List;

    goto :goto_6

    :cond_3
    iput-object v4, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->L$0:Ljava/lang/Object;

    iput v2, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->I$0:I

    const/4 p1, 0x3

    iput p1, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/LanguageRepository;->localesToUse(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_7

    :cond_4
    :goto_3
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    const-string v5, "-"

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {p1, v5, v3}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    const/4 v5, 0x0

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_6

    :cond_5
    if-eqz v2, :cond_7

    iput-object v4, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->L$0:Ljava/lang/Object;

    iput v2, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->I$0:I

    const/4 p1, 0x4

    iput p1, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->label:I

    invoke-direct {p0, v5, v0}, Lcom/whoop/data/repositories/LanguageRepository;->computeAllowedLanguageListFromPreviouslyCachedList(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_7

    :cond_6
    :goto_4
    check-cast p1, Ljava/util/List;

    goto :goto_6

    :cond_7
    iput-object v4, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->L$0:Ljava/lang/Object;

    iput v2, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->I$0:I

    const/4 p1, 0x5

    iput p1, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/LanguageRepository;->fetchAllowedLanguages(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_7

    :cond_8
    :goto_5
    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_9

    iget-object p1, p0, Lcom/whoop/data/repositories/LanguageRepository;->onForAllLanguages:Ljava/util/Set;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    :cond_9
    :goto_6
    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/LanguageRepository;->cacheComputedAllowedLanguageList(Ljava/util/List;)V

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/LanguageRepository;->cacheComputedLanguageHeader(Ljava/util/List;)V

    iput-object v4, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->L$1:Ljava/lang/Object;

    iput v2, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->I$0:I

    iput v3, v0, Lcom/whoop/data/repositories/LanguageRepository$cacheAllowedLanguageListAndHeader$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/LanguageRepository;->updateBackendLanguagePreference(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_7
    return-object v1

    :cond_a
    :goto_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final cacheComputedAllowedLanguageList(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    const/4 v4, 0x0

    const/16 v5, 0x3e

    const-string v1, ","

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository;->preferenceHelper:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-string v1, "ALLOWED_LANGUAGES"

    invoke-virtual {v0, v1, p1}, Lcom/whoop/data/local/prefs/PreferenceHelper;->putStringValueIntoLanguagePrefs(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final cacheComputedLanguageHeader(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    const/4 v4, 0x0

    const/16 v5, 0x3e

    const-string v1, ","

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/data/repositories/LanguageRepository;->preferenceHelper:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const/4 v3, 0x2

    const-string v4, "ACCEPT_LANGUAGE_HEADER"

    invoke-static {v1, v4, v2, v3, v2}, Lcom/whoop/data/local/prefs/PreferenceHelper;->getStringValueFromLanguagePrefs$default(Lcom/whoop/data/local/prefs/PreferenceHelper;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ","

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v1, v2, v3}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/data/repositories/LanguageRepository;->preferenceHelper:Lcom/whoop/data/local/prefs/PreferenceHelper;

    invoke-virtual {v3, v4, v0}, Lcom/whoop/data/local/prefs/PreferenceHelper;->putStringValueIntoLanguagePrefs(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/whoop/data/repositories/LanguageRepository;->logger:Ltr2/n;

    const-string v4, "Cached accept language header: "

    invoke-static {v4, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v3, v0, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0, p1, v1}, Lcom/whoop/data/repositories/LanguageRepository;->setAppLocaleList(Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method private final computeAllowedLanguageListFromPreviouslyCachedList(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, ","

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {p1, v0, v1}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/repositories/LanguageRepository;->filterSystemLocalePreferences(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final displayForUi(Ljava/lang/String;)Z
    .locals 2

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/LanguageRepository;->thisAppVersionHasStringsFor(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "-"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {p1, v0, v1}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/LanguageRepository;->thisAppVersionHasStringsFor(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "pt-PT"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private final fetchAllowedLanguages(Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguages$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguages$1;

    iget v1, v0, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguages$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguages$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguages$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguages$1;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguages$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguages$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguages$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v0, v0, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguages$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/data/repositories/LanguageRepository;->userContext:Lod1/u;

    invoke-virtual {p1}, Lod1/u;->i()Z

    move-result p1

    if-eqz p1, :cond_6

    iput v5, v0, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguages$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/LanguageRepository;->getAllowedLanguagesAuthed(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_4

    :cond_5
    :goto_1
    check-cast p1, Ljava/util/List;

    goto :goto_3

    :cond_6
    iput v4, v0, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguages$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/LanguageRepository;->getAllowedLanguagesOnboarding(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_4

    :cond_7
    :goto_2
    check-cast p1, Ljava/util/List;

    :goto_3
    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/LanguageRepository;->sanitizeAllowedLanguagesFromBackendForRegion(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_9

    iput-object v4, v0, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguages$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguages$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguages$1;->label:I

    invoke-direct {p0, p1, v0}, Lcom/whoop/data/repositories/LanguageRepository;->filterSystemLocalePreferences(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_8

    :goto_4
    return-object v1

    :cond_8
    move-object v1, p1

    move-object p1, v0

    :goto_5
    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository;->logger:Ltr2/n;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "fetchAllowedLanguages filtered "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object p1

    :cond_9
    return-object v4
.end method

.method private final filterSystemLocalePreferences(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/data/repositories/LanguageRepository$filterSystemLocalePreferences$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/data/repositories/LanguageRepository$filterSystemLocalePreferences$1;

    iget v1, v0, Lcom/whoop/data/repositories/LanguageRepository$filterSystemLocalePreferences$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/LanguageRepository$filterSystemLocalePreferences$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/LanguageRepository$filterSystemLocalePreferences$1;

    invoke-direct {v0, p0, p2}, Lcom/whoop/data/repositories/LanguageRepository$filterSystemLocalePreferences$1;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/data/repositories/LanguageRepository$filterSystemLocalePreferences$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/LanguageRepository$filterSystemLocalePreferences$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/data/repositories/LanguageRepository$filterSystemLocalePreferences$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Lcom/whoop/data/repositories/LanguageRepository$filterSystemLocalePreferences$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/data/repositories/LanguageRepository$filterSystemLocalePreferences$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/LanguageRepository;->localesToUse(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-direct {p0, v1, v2}, Lcom/whoop/data/repositories/LanguageRepository;->shouldInclude(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/whoop/data/repositories/LanguageRepository;->onForAllLanguages:Ljava/util/Set;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_6
    return-object v0
.end method

.method private final getAllowedLanguagesAuthed(Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesAuthed$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesAuthed$1;

    iget v1, v0, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesAuthed$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesAuthed$1;->label:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesAuthed$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesAuthed$1;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesAuthed$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesAuthed$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object v0, v6, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesAuthed$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v6, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesAuthed$1;->label:I

    invoke-direct {p0, v6}, Lcom/whoop/data/repositories/LanguageRepository;->localesToUse(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    const-string p1, "en-US"

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :cond_5
    move-object v7, p1

    check-cast v7, Ljava/lang/Iterable;

    const/4 v11, 0x0

    const/16 v12, 0x3e

    const-string v8, ","

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move v3, v2

    iget-object v2, p0, Lcom/whoop/data/repositories/LanguageRepository;->logger:Ltr2/n;

    new-instance v5, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesAuthed$2;

    const/4 v4, 0x0

    invoke-direct {v5, p0, p1, v4}, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesAuthed$2;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Ljava/lang/String;Lq83/d;)V

    iput-object v4, v6, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesAuthed$1;->L$0:Ljava/lang/Object;

    iput v3, v6, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesAuthed$1;->label:I

    const/4 v3, 0x0

    const-string v4, "Unable to retrieve allowed languages from Authed endpoint, returning empty list"

    invoke-virtual/range {v1 .. v6}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_3
    return-object v0

    :cond_6
    :goto_4
    check-cast p1, Lu02/a;

    invoke-static {p1}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_7

    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_7
    return-object p1
.end method

.method private final getAllowedLanguagesOnboarding(Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesOnboarding$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesOnboarding$1;

    iget v1, v0, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesOnboarding$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesOnboarding$1;->label:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesOnboarding$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesOnboarding$1;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesOnboarding$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesOnboarding$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object v0, v6, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesOnboarding$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v6, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesOnboarding$1;->label:I

    invoke-direct {p0, v6}, Lcom/whoop/data/repositories/LanguageRepository;->localesToUse(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    const-string p1, "en-US"

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :cond_5
    move-object v7, p1

    check-cast v7, Ljava/lang/Iterable;

    const/4 v11, 0x0

    const/16 v12, 0x3e

    const-string v8, ","

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move v3, v2

    iget-object v2, p0, Lcom/whoop/data/repositories/LanguageRepository;->logger:Ltr2/n;

    new-instance v5, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesOnboarding$2;

    const/4 v4, 0x0

    invoke-direct {v5, p0, p1, v4}, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesOnboarding$2;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Ljava/lang/String;Lq83/d;)V

    iput-object v4, v6, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesOnboarding$1;->L$0:Ljava/lang/Object;

    iput v3, v6, Lcom/whoop/data/repositories/LanguageRepository$getAllowedLanguagesOnboarding$1;->label:I

    const/4 v3, 0x0

    const-string v4, "Unable to retrieve allowed languages from Onboarding endpoint, returning empty list"

    invoke-virtual/range {v1 .. v6}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_3
    return-object v0

    :cond_6
    :goto_4
    check-cast p1, Lu02/a;

    invoke-static {p1}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_7

    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_7
    return-object p1
.end method

.method private final getComputedAllowedLanguageList()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository;->preferenceHelper:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v3, "ALLOWED_LANGUAGES"

    invoke-static {v0, v3, v1, v2, v1}, Lcom/whoop/data/local/prefs/PreferenceHelper;->getStringValueFromLanguagePrefs$default(Lcom/whoop/data/local/prefs/PreferenceHelper;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final getEnabledLanguages(Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/LanguageRepository$getEnabledLanguages$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/LanguageRepository$getEnabledLanguages$1;

    iget v1, v0, Lcom/whoop/data/repositories/LanguageRepository$getEnabledLanguages$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/LanguageRepository$getEnabledLanguages$1;->label:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/LanguageRepository$getEnabledLanguages$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/LanguageRepository$getEnabledLanguages$1;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lcom/whoop/data/repositories/LanguageRepository$getEnabledLanguages$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lcom/whoop/data/repositories/LanguageRepository$getEnabledLanguages$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p1, v2

    iget-object v2, p0, Lcom/whoop/data/repositories/LanguageRepository;->logger:Ltr2/n;

    new-instance v5, Lcom/whoop/data/repositories/LanguageRepository$getEnabledLanguages$2;

    const/4 v3, 0x0

    invoke-direct {v5, p0, v3}, Lcom/whoop/data/repositories/LanguageRepository$getEnabledLanguages$2;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)V

    iput p1, v6, Lcom/whoop/data/repositories/LanguageRepository$getEnabledLanguages$1;->label:I

    const-string v4, "Unable to retrieve enabled languages, returning empty list"

    invoke-virtual/range {v1 .. v6}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    invoke-static {p1}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_4

    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_4
    return-object p1
.end method

.method private final isFirstPreferredLanguageOnForAll(Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/LanguageRepository$isFirstPreferredLanguageOnForAll$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/LanguageRepository$isFirstPreferredLanguageOnForAll$1;

    iget v1, v0, Lcom/whoop/data/repositories/LanguageRepository$isFirstPreferredLanguageOnForAll$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/LanguageRepository$isFirstPreferredLanguageOnForAll$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/LanguageRepository$isFirstPreferredLanguageOnForAll$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/LanguageRepository$isFirstPreferredLanguageOnForAll$1;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/LanguageRepository$isFirstPreferredLanguageOnForAll$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/LanguageRepository$isFirstPreferredLanguageOnForAll$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lcom/whoop/data/repositories/LanguageRepository$isFirstPreferredLanguageOnForAll$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/LanguageRepository;->localesToUse(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository;->onForAllLanguages:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_4
    move v3, v2

    goto :goto_2

    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/util/Locale;

    invoke-direct {v5, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v1, Lcom/whoop/data/repositories/DefaultLanguageDecider;->Companion:Lcom/whoop/data/repositories/DefaultLanguageDecider$Companion;

    invoke-virtual {v1, p1}, Lcom/whoop/data/repositories/DefaultLanguageDecider$Companion;->allowedByRegion(Ljava/util/Locale;)Z

    move-result v1

    if-eqz v1, :cond_6

    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private final isNotEnglish(Ljava/lang/String;)Z
    .locals 1

    invoke-static {p1}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method private final isOnForAll(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository;->onForAllLanguages:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final localesToUse(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/LanguageRepository$localesToUse$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/LanguageRepository$localesToUse$1;

    iget v1, v0, Lcom/whoop/data/repositories/LanguageRepository$localesToUse$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/LanguageRepository$localesToUse$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/LanguageRepository$localesToUse$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/LanguageRepository$localesToUse$1;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/LanguageRepository$localesToUse$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/LanguageRepository$localesToUse$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/data/repositories/LanguageRepository;->prefsDataStore:La6/g;

    invoke-interface {p1}, La6/g;->getData()Lec3/l;

    move-result-object p1

    iput v3, v0, Lcom/whoop/data/repositories/LanguageRepository$localesToUse$1;->label:I

    invoke-static {p1, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lf6/f;

    invoke-static {}, Lcom/whoop/data/repositories/LanguageRepositoryKt;->getKEY_USER_LANGUAGE_OVERRIDE()Lf6/d;

    move-result-object v0

    invoke-virtual {p1, v0}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x6

    const-string v1, ","

    const-string v2, "toLanguageTags(...)"

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/whoop/data/repositories/LanguageRepository;->systemResources:Lor2/r1;

    invoke-interface {p1}, Lor2/r1;->b()Lb5/g;

    move-result-object p1

    invoke-virtual {p1}, Lb5/g;->e()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, v0}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_4
    iget-object p1, p0, Lcom/whoop/data/repositories/LanguageRepository;->systemResources:Lor2/r1;

    invoke-interface {p1}, Lor2/r1;->a()Lb5/g;

    move-result-object p1

    invoke-virtual {p1}, Lb5/g;->e()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, v0}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final pseudoLocale(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "en-XA"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/whoop/data/repositories/LanguageRepository;->buildConfigProvider:Lor2/g;

    invoke-virtual {p1}, Lor2/g;->g()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final regionMatch(Ljava/lang/String;Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "pt-PT"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final removeCachedLanguageData()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository;->preferenceHelper:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-string v1, "ACCEPT_LANGUAGE_HEADER"

    const-string v2, "en"

    invoke-virtual {v0, v1, v2}, Lcom/whoop/data/local/prefs/PreferenceHelper;->putStringValueIntoLanguagePrefs(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository;->preferenceHelper:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-string v1, "ALLOWED_LANGUAGES"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/whoop/data/local/prefs/PreferenceHelper;->putStringValueIntoLanguagePrefs(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final sanitizeAllowedLanguagesFromBackendForRegion(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "pt"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v1, "pt-PT"

    :cond_0
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private final setAppLocaleList(Ljava/util/List;Ljava/lang/String;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository;->systemResources:Lor2/r1;

    invoke-interface {v0}, Lor2/r1;->a()Lb5/g;

    move-result-object v0

    invoke-static {v0}, Lor2/t0;->a(Lb5/g;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Locale;

    iget-object v2, p0, Lcom/whoop/data/repositories/LanguageRepository;->logger:Ltr2/n;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "setAppLocaleList setAppLocaleList="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " newLanguage="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " oldLanguage="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    new-array v6, v6, [Lqr2/a$a;

    invoke-interface {v2, v4, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 v6, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v6

    :goto_0
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Lcom/whoop/data/repositories/DefaultLanguageDecider;->Companion:Lcom/whoop/data/repositories/DefaultLanguageDecider$Companion;

    invoke-virtual {v2, v0}, Lcom/whoop/data/repositories/DefaultLanguageDecider$Companion;->allowedByRegion(Ljava/util/Locale;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lb5/g;->b:Lb5/g;

    :goto_1
    move-object v2, v0

    goto :goto_2

    :cond_1
    move-object v7, p1

    check-cast v7, Ljava/lang/Iterable;

    const/4 v11, 0x0

    const/16 v12, 0x3e

    const-string v8, ","

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lb5/g;->a(Ljava/lang/String;)Lb5/g;

    move-result-object v0

    goto :goto_1

    :goto_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository;->processLifecycleOwner:Landroidx/lifecycle/g0;

    invoke-interface {v0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    invoke-static {v0}, Landroidx/lifecycle/o1;->i(Landroidx/lifecycle/x;)Landroidx/lifecycle/b0;

    move-result-object v7

    new-instance v0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Lb5/g;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {v7, v6, v6, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final shouldInclude(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/LanguageRepository;->pseudoLocale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/LanguageRepository;->thisAppVersionHasStringsFor(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    :cond_1
    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/LanguageRepository;->isOnForAll(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const-string v0, "-"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {p1, v0, v1}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v1, Lcom/whoop/data/repositories/DefaultLanguageDecider;->Companion:Lcom/whoop/data/repositories/DefaultLanguageDecider$Companion;

    invoke-static {p1}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v2

    const-string v3, "forLanguageTag(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/whoop/data/repositories/DefaultLanguageDecider$Companion;->allowedByRegion(Ljava/util/Locale;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/LanguageRepository;->thisAppVersionHasStringsFor(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    :cond_3
    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/LanguageRepository;->isOnForAll(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_4
    return-object v0

    :cond_5
    invoke-direct {p0, p1, p2}, Lcom/whoop/data/repositories/LanguageRepository;->regionMatch(Ljava/lang/String;Ljava/util/Collection;)Z

    move-result p2

    if-eqz p2, :cond_7

    :cond_6
    :goto_0
    return-object p1

    :cond_7
    const/4 p1, 0x0

    return-object p1
.end method

.method private final thisAppVersionHasStringsFor(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository;->appSupportedLanguages:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final updateBackendLanguagePreference(Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, p0, Lcom/whoop/data/repositories/LanguageRepository;->logger:Ltr2/n;

    new-instance v4, Lcom/whoop/data/repositories/LanguageRepository$updateBackendLanguagePreference$2;

    const/4 v2, 0x0

    invoke-direct {v4, p0, v2}, Lcom/whoop/data/repositories/LanguageRepository$updateBackendLanguagePreference$2;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)V

    const-string v3, "Unable to report app locale to backend"

    move-object v5, p1

    invoke-virtual/range {v0 .. v5}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final updatedAllowedLanguageList(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/LanguageRepository$updatedAllowedLanguageList$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/LanguageRepository$updatedAllowedLanguageList$1;

    iget v1, v0, Lcom/whoop/data/repositories/LanguageRepository$updatedAllowedLanguageList$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/LanguageRepository$updatedAllowedLanguageList$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/LanguageRepository$updatedAllowedLanguageList$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/LanguageRepository$updatedAllowedLanguageList$1;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/LanguageRepository$updatedAllowedLanguageList$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/LanguageRepository$updatedAllowedLanguageList$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lcom/whoop/data/repositories/LanguageRepository$updatedAllowedLanguageList$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/LanguageRepository;->fetchAllowedLanguages(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_4

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/LanguageRepository;->cacheComputedAllowedLanguageList(Ljava/util/List;)V

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public final fetchAllowedLanguagesForUi(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguagesForUi$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguagesForUi$1;

    iget v1, v0, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguagesForUi$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguagesForUi$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguagesForUi$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguagesForUi$1;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguagesForUi$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguagesForUi$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lcom/whoop/data/repositories/LanguageRepository$fetchAllowedLanguagesForUi$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/LanguageRepository;->getEnabledLanguages(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    invoke-direct {p0, v2}, Lcom/whoop/data/repositories/LanguageRepository;->displayForUi(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/whoop/data/repositories/LanguageRepository;->onForAllLanguages:Ljava/util/Set;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_6
    return-object v0
.end method

.method public getAllowedLanguage()Ljava/util/Locale;
    .locals 4

    sget-object v0, Lcom/whoop/data/repositories/LanguageRepository;->Companion:Lcom/whoop/data/repositories/LanguageRepository$Companion;

    iget-object v1, p0, Lcom/whoop/data/repositories/LanguageRepository;->systemResources:Lor2/r1;

    iget-object v2, p0, Lcom/whoop/data/repositories/LanguageRepository;->preferenceHelper:Lcom/whoop/data/local/prefs/PreferenceHelper;

    iget-object v3, p0, Lcom/whoop/data/repositories/LanguageRepository;->defaultLanguageDecider:Lcom/whoop/data/repositories/DefaultLanguageDecider;

    invoke-static {v0, v1, v2, v3}, Lcom/whoop/data/repositories/LanguageRepository$Companion;->access$obtainAllowedLanguage(Lcom/whoop/data/repositories/LanguageRepository$Companion;Lor2/r1;Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method

.method public final getHeader()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository;->preferenceHelper:Lcom/whoop/data/local/prefs/PreferenceHelper;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v3, "ACCEPT_LANGUAGE_HEADER"

    invoke-static {v0, v3, v1, v2, v1}, Lcom/whoop/data/local/prefs/PreferenceHelper;->getStringValueFromLanguagePrefs$default(Lcom/whoop/data/local/prefs/PreferenceHelper;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge onCreate(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onCreate(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onDestroy(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public final onLanguageChanged(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/LanguageRepository$onLanguageChanged$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/LanguageRepository$onLanguageChanged$1;

    iget v1, v0, Lcom/whoop/data/repositories/LanguageRepository$onLanguageChanged$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/LanguageRepository$onLanguageChanged$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/LanguageRepository$onLanguageChanged$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/LanguageRepository$onLanguageChanged$1;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/LanguageRepository$onLanguageChanged$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/LanguageRepository$onLanguageChanged$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/whoop/data/repositories/LanguageRepository;->removeCachedLanguageData()V

    iput v4, v0, Lcom/whoop/data/repositories/LanguageRepository$onLanguageChanged$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/LanguageRepository;->cacheAllowedLanguageListAndHeader(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iput v3, v0, Lcom/whoop/data/repositories/LanguageRepository$onLanguageChanged$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/LanguageRepository;->updatedAllowedLanguageList(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge onPause(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public onStart(Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/whoop/data/repositories/LanguageRepository;->coroutineScope:Lbc3/c0;

    new-instance v0, Lcom/whoop/data/repositories/LanguageRepository$onStart$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whoop/data/repositories/LanguageRepository$onStart$1;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    return-void
.end method
