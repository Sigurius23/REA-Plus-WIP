.class public Lcom/mapbox/maps/attribution/AttributionParser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/attribution/AttributionParser$Companion;,
        Lcom/mapbox/maps/attribution/AttributionParser$Options;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\"\n\u0002\u0008\n\n\u0002\u0010#\n\u0002\u0008\u0005\u0008\u0016\u0018\u0000 ;2\u00020\u0001:\u0002;<B]\u0008\u0000\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u000c\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000eH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008#\u0010!J\u0017\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010\'\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\'\u0010!J\u0017\u0010(\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008(\u0010!J\u001f\u0010)\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008)\u0010*J\u0017\u0010+\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008+\u0010&J\u000f\u0010,\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008,\u0010\u0018J\u0013\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u000f0-\u00a2\u0006\u0004\u0008.\u0010/J\u0019\u00101\u001a\u00020\u00052\u0008\u0008\u0002\u00100\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u00081\u00102J\u000f\u00103\u001a\u00020\u0014H\u0004\u00a2\u0006\u0004\u00083\u0010\u0018R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u00104R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u00105R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u00106R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u00106R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u00106R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u00106R\u0014\u0010\u000c\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u00106R\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u00106R\u001a\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u00107R\u001a\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u000f088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:\u00a8\u0006="
    }
    d2 = {
        "Lcom/mapbox/maps/attribution/AttributionParser;",
        "",
        "Ljava/lang/ref/WeakReference;",
        "Landroid/content/Context;",
        "context",
        "",
        "attributionData",
        "",
        "withImproveMap",
        "withCopyrightSign",
        "withTelemetryAttribution",
        "withMapboxAttribution",
        "withMapboxPrivacyPolicy",
        "withMapboxGeofencingConsent",
        "",
        "Liv/a;",
        "extraAttributions",
        "<init>",
        "(Ljava/lang/ref/WeakReference;Ljava/lang/String;ZZZZZZLjava/util/List;)V",
        "stringLiteralList",
        "Ll83/a0;",
        "parseStringLiteralToAttributions",
        "(Ljava/util/List;)V",
        "parseAttributions",
        "()V",
        "Landroid/text/SpannableStringBuilder;",
        "htmlBuilder",
        "Landroid/text/style/URLSpan;",
        "urlSpan",
        "parseUrlSpan",
        "(Landroid/text/SpannableStringBuilder;Landroid/text/style/URLSpan;)V",
        "url",
        "isUrlValid",
        "(Ljava/lang/String;)Z",
        "anchor",
        "isImproveThisMapAnchor",
        "anchorString",
        "translateImproveThisMapAnchor",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "isValidForImproveThisMap",
        "isValidForMapbox",
        "parseAnchorValue",
        "(Landroid/text/SpannableStringBuilder;Landroid/text/style/URLSpan;)Ljava/lang/String;",
        "stripCopyright",
        "addAdditionalAttributions",
        "",
        "getAttributions",
        "()Ljava/util/Set;",
        "shortenedOutput",
        "createAttributionString",
        "(Z)Ljava/lang/String;",
        "parse",
        "Ljava/lang/ref/WeakReference;",
        "Ljava/lang/String;",
        "Z",
        "Ljava/util/List;",
        "",
        "attributions",
        "Ljava/util/Set;",
        "Companion",
        "Options",
        "maps-sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static final COPYRIGHT:Ljava/lang/String; = "\u00a9 "

.field public static final Companion:Lcom/mapbox/maps/attribution/AttributionParser$Companion;

.field private static final EMPTY_STRING:Ljava/lang/String; = ""

.field private static final IMPROVE_MAP_URLS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final IMPROVE_THIS_MAP:Ljava/lang/String; = "Improve this map"


# instance fields
.field private final attributionData:Ljava/lang/String;

.field private final attributions:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Liv/a;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final extraAttributions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Liv/a;",
            ">;"
        }
    .end annotation
.end field

.field private final withCopyrightSign:Z

.field private final withImproveMap:Z

.field private final withMapboxAttribution:Z

.field private final withMapboxGeofencingConsent:Z

.field private final withMapboxPrivacyPolicy:Z

.field private final withTelemetryAttribution:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/maps/attribution/AttributionParser$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/maps/attribution/AttributionParser$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/maps/attribution/AttributionParser;->Companion:Lcom/mapbox/maps/attribution/AttributionParser$Companion;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/mapbox/maps/attribution/AttributionParser;->IMPROVE_MAP_URLS:Ljava/util/List;

    const-string v1, "https://www.mapbox.com/feedback/"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v1, "https://www.mapbox.com/map-feedback/"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v1, "https://apps.mapbox.com/feedback/"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/ref/WeakReference;Ljava/lang/String;ZZZZZZLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Ljava/lang/String;",
            "ZZZZZZ",
            "Ljava/util/List<",
            "Liv/a;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributionData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraAttributions"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/attribution/AttributionParser;->context:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Lcom/mapbox/maps/attribution/AttributionParser;->attributionData:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/mapbox/maps/attribution/AttributionParser;->withImproveMap:Z

    iput-boolean p4, p0, Lcom/mapbox/maps/attribution/AttributionParser;->withCopyrightSign:Z

    iput-boolean p5, p0, Lcom/mapbox/maps/attribution/AttributionParser;->withTelemetryAttribution:Z

    iput-boolean p6, p0, Lcom/mapbox/maps/attribution/AttributionParser;->withMapboxAttribution:Z

    iput-boolean p7, p0, Lcom/mapbox/maps/attribution/AttributionParser;->withMapboxPrivacyPolicy:Z

    iput-boolean p8, p0, Lcom/mapbox/maps/attribution/AttributionParser;->withMapboxGeofencingConsent:Z

    iput-object p9, p0, Lcom/mapbox/maps/attribution/AttributionParser;->extraAttributions:Ljava/util/List;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/attribution/AttributionParser;->attributions:Ljava/util/Set;

    return-void
.end method

.method public static final synthetic access$getIMPROVE_MAP_URLS$cp()Ljava/util/List;
    .locals 1

    sget-object v0, Lcom/mapbox/maps/attribution/AttributionParser;->IMPROVE_MAP_URLS:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$parseStringLiteralToAttributions(Lcom/mapbox/maps/attribution/AttributionParser;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/mapbox/maps/attribution/AttributionParser;->parseStringLiteralToAttributions(Ljava/util/List;)V

    return-void
.end method

.method private final addAdditionalAttributions()V
    .locals 5

    iget-object v0, p0, Lcom/mapbox/maps/attribution/AttributionParser;->context:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-boolean v1, p0, Lcom/mapbox/maps/attribution/AttributionParser;->withTelemetryAttribution:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/mapbox/maps/attribution/AttributionParser;->attributions:Ljava/util/Set;

    new-instance v2, Liv/a;

    if-eqz v0, :cond_0

    sget v3, Lcom/mapbox/maps/R$string;->mapbox_telemetrySettings:I

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    :cond_0
    const-string v3, "Mapbox Telemetry"

    :cond_1
    const-string v4, "https://www.mapbox.com/telemetry/"

    invoke-direct {v2, v3, v4}, Liv/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-boolean v1, p0, Lcom/mapbox/maps/attribution/AttributionParser;->withMapboxGeofencingConsent:Z

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/mapbox/maps/attribution/AttributionParser;->attributions:Ljava/util/Set;

    new-instance v2, Liv/a;

    if-eqz v0, :cond_3

    sget v3, Lcom/mapbox/maps/R$string;->mapbox_geofencing_consent:I

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_4

    :cond_3
    const-string v3, "Mapbox Geofencing"

    :cond_4
    const-string v4, "geofencing_url_marker"

    invoke-direct {v2, v3, v4}, Liv/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_5
    iget-boolean v1, p0, Lcom/mapbox/maps/attribution/AttributionParser;->withMapboxPrivacyPolicy:Z

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/mapbox/maps/attribution/AttributionParser;->attributions:Ljava/util/Set;

    new-instance v2, Liv/a;

    if-eqz v0, :cond_6

    sget v3, Lcom/mapbox/maps/R$string;->mapbox_privacy_policy:I

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    :cond_6
    const-string v0, "Mapbox Privacy Policy"

    :cond_7
    const-string v3, "https://www.mapbox.com/legal/privacy#product-privacy-policy/"

    invoke-direct {v2, v0, v3}, Liv/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_8
    iget-object v0, p0, Lcom/mapbox/maps/attribution/AttributionParser;->attributions:Ljava/util/Set;

    iget-object v1, p0, Lcom/mapbox/maps/attribution/AttributionParser;->extraAttributions:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public static synthetic createAttributionString$default(Lcom/mapbox/maps/attribution/AttributionParser;ZILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/mapbox/maps/attribution/AttributionParser;->createAttributionString(Z)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: createAttributionString"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final isImproveThisMapAnchor(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Improve this map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final isUrlValid(Ljava/lang/String;)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/mapbox/maps/attribution/AttributionParser;->isValidForImproveThisMap(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/mapbox/maps/attribution/AttributionParser;->isValidForMapbox(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final isValidForImproveThisMap(Ljava/lang/String;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/mapbox/maps/attribution/AttributionParser;->withImproveMap:Z

    if-nez v0, :cond_1

    sget-object v0, Lcom/mapbox/maps/attribution/AttributionParser;->IMPROVE_MAP_URLS:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private final isValidForMapbox(Ljava/lang/String;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/mapbox/maps/attribution/AttributionParser;->withMapboxAttribution:Z

    if-nez v0, :cond_1

    const-string v0, "https://www.mapbox.com/about/maps/"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private final parseAnchorValue(Landroid/text/SpannableStringBuilder;Landroid/text/style/URLSpan;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p1, p2}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p1, p2}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    move-result p2

    sub-int v1, p2, v0

    new-array v1, v1, [C

    const/4 v2, 0x0

    invoke-virtual {p1, v0, p2, v1, v2}, Landroid/text/SpannableStringBuilder;->getChars(II[CI)V

    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/lang/String;-><init>([C)V

    invoke-direct {p0, p1}, Lcom/mapbox/maps/attribution/AttributionParser;->stripCopyright(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final parseAttributions()V
    .locals 6

    sget-object v0, Lcom/mapbox/maps/attribution/AttributionParser;->Companion:Lcom/mapbox/maps/attribution/AttributionParser$Companion;

    iget-object v1, p0, Lcom/mapbox/maps/attribution/AttributionParser;->attributionData:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/mapbox/maps/attribution/AttributionParser$Companion;->access$fromHtml(Lcom/mapbox/maps/attribution/AttributionParser$Companion;Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.text.SpannableStringBuilder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/text/SpannableStringBuilder;

    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    const-class v2, Landroid/text/style/URLSpan;

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1, v2}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/text/style/URLSpan;

    const-string v2, "urlSpans"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v1

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    const-string v5, "urlSpan"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, v4}, Lcom/mapbox/maps/attribution/AttributionParser;->parseUrlSpan(Landroid/text/SpannableStringBuilder;Landroid/text/style/URLSpan;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final parseStringLiteralToAttributions(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v1, Lcom/mapbox/maps/attribution/AttributionParser;->Companion:Lcom/mapbox/maps/attribution/AttributionParser$Companion;

    invoke-static {v1, v0}, Lcom/mapbox/maps/attribution/AttributionParser$Companion;->access$fromHtml(Lcom/mapbox/maps/attribution/AttributionParser$Companion;Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lcom/mapbox/maps/attribution/AttributionParser;->withCopyrightSign:Z

    if-nez v1, :cond_0

    invoke-direct {p0, v0}, Lcom/mapbox/maps/attribution/AttributionParser;->stripCopyright(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    iget-object v1, p0, Lcom/mapbox/maps/attribution/AttributionParser;->attributions:Ljava/util/Set;

    new-instance v2, Liv/a;

    const-string v3, ""

    invoke-direct {v2, v0, v3}, Liv/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final parseUrlSpan(Landroid/text/SpannableStringBuilder;Landroid/text/style/URLSpan;)V
    .locals 2

    invoke-virtual {p2}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v0

    const-string v1, "url"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/mapbox/maps/attribution/AttributionParser;->isUrlValid(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-direct {p0, p1, p2}, Lcom/mapbox/maps/attribution/AttributionParser;->parseAnchorValue(Landroid/text/SpannableStringBuilder;Landroid/text/style/URLSpan;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/mapbox/maps/attribution/AttributionParser;->isImproveThisMapAnchor(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-boolean p2, p0, Lcom/mapbox/maps/attribution/AttributionParser;->withImproveMap:Z

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/mapbox/maps/attribution/AttributionParser;->translateImproveThisMapAnchor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_1
    iget-object p2, p0, Lcom/mapbox/maps/attribution/AttributionParser;->attributions:Ljava/util/Set;

    new-instance v1, Liv/a;

    invoke-direct {v1, p1, v0}, Liv/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method private final stripCopyright(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    iget-boolean v0, p0, Lcom/mapbox/maps/attribution/AttributionParser;->withCopyrightSign:Z

    if-nez v0, :cond_0

    const-string v0, "\u00a9 "

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string v0, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method private final translateImproveThisMapAnchor(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/attribution/AttributionParser;->context:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_0

    sget p1, Lcom/mapbox/maps/R$string;->mapbox_telemetryImproveMap:I

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "context.getString(R.stri\u2026pbox_telemetryImproveMap)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method


# virtual methods
.method public final createAttributionString()Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Lcom/mapbox/maps/attribution/AttributionParser;->createAttributionString$default(Lcom/mapbox/maps/attribution/AttributionParser;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final createAttributionString(Z)Ljava/lang/String;
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/attribution/AttributionParser;->attributions:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    return-object v1

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/mapbox/maps/attribution/AttributionParser;->withCopyrightSign:Z

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "\u00a9 "

    :goto_0
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/mapbox/maps/attribution/AttributionParser;->attributions:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Liv/a;

    add-int/lit8 v2, v2, 0x1

    if-nez p1, :cond_3

    .line 5
    iget-object v3, v3, Liv/a;->a:Ljava/lang/String;

    goto :goto_2

    .line 6
    :cond_3
    iget-object v3, v3, Liv/a;->a:Ljava/lang/String;

    .line 7
    const-string v4, "OpenStreetMap"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const-string v3, "OSM"

    .line 8
    :cond_4
    :goto_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    iget-object v3, p0, Lcom/mapbox/maps/attribution/AttributionParser;->attributions:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    if-eq v2, v3, :cond_2

    .line 10
    const-string v3, " / "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 11
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "stringBuilder.toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getAttributions()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Liv/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/attribution/AttributionParser;->attributions:Ljava/util/Set;

    return-object v0
.end method

.method public final parse()V
    .locals 0

    invoke-direct {p0}, Lcom/mapbox/maps/attribution/AttributionParser;->parseAttributions()V

    invoke-direct {p0}, Lcom/mapbox/maps/attribution/AttributionParser;->addAdditionalAttributions()V

    return-void
.end method
