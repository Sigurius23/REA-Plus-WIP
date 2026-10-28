.class public final Lcom/whoop/data/local/prefs/PreferenceHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00082\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u001e\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001f\u0010!\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008!\u0010\"J!\u0010%\u001a\u00020\u000c2\u0012\u0010$\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00080#\"\u00020\u0008\u00a2\u0006\u0004\u0008%\u0010&J\u001d\u0010(\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\'\u00a2\u0006\u0004\u0008(\u0010)J\u001d\u0010*\u001a\u00020\'2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\'\u00a2\u0006\u0004\u0008*\u0010+J\u0015\u0010,\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008,\u0010-J\u001d\u0010.\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008.\u0010\u000eJ\u001f\u0010/\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0004\u0008/\u0010\u0011J#\u00102\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u000800\u00a2\u0006\u0004\u00082\u00103J\u001f\u00104\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u00084\u0010\u0014J\u001f\u00105\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0004\u00085\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u00106R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u00106R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u00106\u00a8\u00067"
    }
    d2 = {
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "",
        "Lu92/d;",
        "mainPrefsStore",
        "featurePrefs",
        "languagePrefs",
        "<init>",
        "(Lu92/d;Lu92/d;Lu92/d;)V",
        "",
        "key",
        "",
        "status",
        "Ll83/a0;",
        "putBooleanValueIntoMainPrefs",
        "(Ljava/lang/String;Z)V",
        "defaultValue",
        "getBooleanValueFromMainPrefs",
        "(Ljava/lang/String;Z)Z",
        "value",
        "putStringValueIntoMainPrefs",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "getStringValueFromMainPrefs",
        "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
        "getNullableStringFromMainPrefs",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "",
        "putIntValueIntoMainPrefs",
        "(Ljava/lang/String;I)V",
        "getIntValueFromMainPrefs",
        "(Ljava/lang/String;I)I",
        "",
        "putLongValueIntoMainPrefs",
        "(Ljava/lang/String;J)V",
        "getLongValueFromMainPrefs",
        "(Ljava/lang/String;J)J",
        "",
        "keys",
        "removeFromMainPrefs",
        "([Ljava/lang/String;)V",
        "",
        "putFloatValueIntoMainPrefs",
        "(Ljava/lang/String;F)V",
        "getFloatValueFromMainPrefs",
        "(Ljava/lang/String;F)F",
        "mainPrefsContains",
        "(Ljava/lang/String;)Z",
        "putBooleanValueIntoFeaturePrefs",
        "getBooleanValueFromFeaturePrefs",
        "",
        "listValues",
        "putListOfStringsIntoFeaturePrefs",
        "(Ljava/lang/String;Ljava/util/List;)V",
        "putStringValueIntoLanguagePrefs",
        "getStringValueFromLanguagePrefs",
        "Lu92/d;",
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

.annotation runtime Ll83/c;
.end annotation


# instance fields
.field private final featurePrefs:Lu92/d;

.field private final languagePrefs:Lu92/d;

.field private final mainPrefsStore:Lu92/d;


# direct methods
.method public constructor <init>(Lu92/d;Lu92/d;Lu92/d;)V
    .locals 1

    const-string v0, "mainPrefsStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featurePrefs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "languagePrefs"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->mainPrefsStore:Lu92/d;

    iput-object p2, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->featurePrefs:Lu92/d;

    iput-object p3, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->languagePrefs:Lu92/d;

    return-void
.end method

.method public static synthetic getBooleanValueFromFeaturePrefs$default(Lcom/whoop/data/local/prefs/PreferenceHelper;Ljava/lang/String;ZILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/local/prefs/PreferenceHelper;->getBooleanValueFromFeaturePrefs(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static synthetic getBooleanValueFromMainPrefs$default(Lcom/whoop/data/local/prefs/PreferenceHelper;Ljava/lang/String;ZILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/local/prefs/PreferenceHelper;->getBooleanValueFromMainPrefs(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static synthetic getIntValueFromMainPrefs$default(Lcom/whoop/data/local/prefs/PreferenceHelper;Ljava/lang/String;IILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/local/prefs/PreferenceHelper;->getIntValueFromMainPrefs(Ljava/lang/String;I)I

    move-result p0

    return p0
.end method

.method public static synthetic getLongValueFromMainPrefs$default(Lcom/whoop/data/local/prefs/PreferenceHelper;Ljava/lang/String;JILjava/lang/Object;)J
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-wide/16 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/data/local/prefs/PreferenceHelper;->getLongValueFromMainPrefs(Ljava/lang/String;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic getStringValueFromLanguagePrefs$default(Lcom/whoop/data/local/prefs/PreferenceHelper;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, ""

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/local/prefs/PreferenceHelper;->getStringValueFromLanguagePrefs(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getStringValueFromMainPrefs$default(Lcom/whoop/data/local/prefs/PreferenceHelper;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, ""

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/local/prefs/PreferenceHelper;->getStringValueFromMainPrefs(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getBooleanValueFromFeaturePrefs(Ljava/lang/String;Z)Z
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->featurePrefs:Lu92/d;

    invoke-virtual {v0, p1, p2}, Lu92/d;->e(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public final getBooleanValueFromMainPrefs(Ljava/lang/String;Z)Z
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->mainPrefsStore:Lu92/d;

    invoke-virtual {v0, p1, p2}, Lu92/d;->e(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public final getFloatValueFromMainPrefs(Ljava/lang/String;F)F
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->mainPrefsStore:Lu92/d;

    invoke-virtual {v0, p1, p2}, Lu92/d;->g(Ljava/lang/String;F)F

    move-result p1

    return p1
.end method

.method public final getIntValueFromMainPrefs(Ljava/lang/String;I)I
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->mainPrefsStore:Lu92/d;

    invoke-virtual {v0, p1, p2}, Lu92/d;->h(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public final getLongValueFromMainPrefs(Ljava/lang/String;J)J
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->mainPrefsStore:Lu92/d;

    invoke-virtual {v0, p1, p2, p3}, Lu92/d;->i(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final getNullableStringFromMainPrefs(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->mainPrefsStore:Lu92/d;

    invoke-virtual {v0, p1}, Lu92/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getStringValueFromLanguagePrefs(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->languagePrefs:Lu92/d;

    invoke-virtual {v0, p1, p2}, Lu92/d;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    return-object p1
.end method

.method public final getStringValueFromMainPrefs(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->mainPrefsStore:Lu92/d;

    invoke-virtual {v0, p1, p2}, Lu92/d;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    return-object p1
.end method

.method public final mainPrefsContains(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->mainPrefsStore:Lu92/d;

    invoke-virtual {v0, p1}, Lu92/d;->c(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final putBooleanValueIntoFeaturePrefs(Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->featurePrefs:Lu92/d;

    invoke-virtual {v0, p1, p2}, Lu92/d;->q(Ljava/lang/String;Z)V

    return-void
.end method

.method public final putBooleanValueIntoMainPrefs(Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->mainPrefsStore:Lu92/d;

    invoke-virtual {v0, p1, p2}, Lu92/d;->q(Ljava/lang/String;Z)V

    return-void
.end method

.method public final putFloatValueIntoMainPrefs(Ljava/lang/String;F)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->mainPrefsStore:Lu92/d;

    invoke-virtual {v0, p1, p2}, Lu92/d;->s(Ljava/lang/String;F)V

    return-void
.end method

.method public final putIntValueIntoMainPrefs(Ljava/lang/String;I)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->mainPrefsStore:Lu92/d;

    invoke-virtual {v0, p1, p2}, Lu92/d;->t(Ljava/lang/String;I)V

    return-void
.end method

.method public final putListOfStringsIntoFeaturePrefs(Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listValues"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->featurePrefs:Lu92/d;

    invoke-virtual {v0, p1, p2}, Lu92/d;->w(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public final putLongValueIntoMainPrefs(Ljava/lang/String;J)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->mainPrefsStore:Lu92/d;

    invoke-virtual {v0, p1, p2, p3}, Lu92/d;->u(Ljava/lang/String;J)V

    return-void
.end method

.method public final putStringValueIntoLanguagePrefs(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->languagePrefs:Lu92/d;

    invoke-virtual {v0, p1, p2}, Lu92/d;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final putStringValueIntoMainPrefs(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->mainPrefsStore:Lu92/d;

    invoke-virtual {v0, p1, p2}, Lu92/d;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final varargs removeFromMainPrefs([Ljava/lang/String;)V
    .locals 2

    const-string v0, "keys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/local/prefs/PreferenceHelper;->mainPrefsStore:Lu92/d;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {v0, p1}, Lu92/d;->p([Ljava/lang/String;)V

    return-void
.end method
