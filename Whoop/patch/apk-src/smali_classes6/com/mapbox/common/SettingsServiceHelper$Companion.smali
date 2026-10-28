.class public final Lcom/mapbox/common/SettingsServiceHelper$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mapbox/common/SettingsServiceHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J3\u0010\u000c\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b0\n2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R#\u0010\u001b\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/mapbox/common/SettingsServiceHelper$Companion;",
        "",
        "<init>",
        "()V",
        "Ll83/a0;",
        "clear$common_release",
        "clear",
        "",
        "key",
        "value",
        "Lcom/mapbox/bindgen/Expected;",
        "",
        "set",
        "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;",
        "get",
        "(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/bindgen/None;",
        "erase",
        "",
        "has",
        "(Ljava/lang/String;)Z",
        "Landroid/content/SharedPreferences;",
        "kotlin.jvm.PlatformType",
        "preferences$delegate",
        "Ll83/h;",
        "getPreferences",
        "()Landroid/content/SharedPreferences;",
        "preferences",
        "MAPBOX_PREFERENCES_NAME",
        "Ljava/lang/String;",
        "common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
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
    invoke-direct {p0}, Lcom/mapbox/common/SettingsServiceHelper$Companion;-><init>()V

    return-void
.end method

.method private final getPreferences()Landroid/content/SharedPreferences;
    .locals 1

    invoke-static {}, Lcom/mapbox/common/SettingsServiceHelper;->access$getPreferences$delegate$cp()Ll83/h;

    move-result-object v0

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/SharedPreferences;

    return-object v0
.end method


# virtual methods
.method public final clear$common_release()V
    .locals 1

    invoke-direct {p0}, Lcom/mapbox/common/SettingsServiceHelper$Companion;->getPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final erase(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0}, Lcom/mapbox/common/SettingsServiceHelper$Companion;->getPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-static {}, Lcom/mapbox/bindgen/ExpectedFactory;->createNone()Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "createNone()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "Unknown error"

    :cond_0
    invoke-static {p1}, Lcom/mapbox/bindgen/ExpectedFactory;->createError(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "createError(exception.message ?: \"Unknown error\")"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final get(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0}, Lcom/mapbox/common/SettingsServiceHelper$Companion;->getPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/mapbox/bindgen/ExpectedFactory;->createValue(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object v1

    :cond_0
    if-nez v1, :cond_1

    const-string p1, "Key is not found"

    invoke-static {p1}, Lcom/mapbox/bindgen/ExpectedFactory;->createError(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "createError(\"Key is not found\")"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_1
    return-object v1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, "Unknown error"

    :cond_2
    invoke-static {p1}, Lcom/mapbox/bindgen/ExpectedFactory;->createError(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "createError(exception.message ?: \"Unknown error\")"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :goto_1
    const-string v1, "Unable to get a value for "

    const-string v2, ": "

    invoke-static {v1, p1, v2}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "settings"

    invoke-static {p1, v0}, Lcom/mapbox/common/Log;->error(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/mapbox/bindgen/ExpectedFactory;->createError(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "createError(errorMessage)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final has(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0}, Lcom/mapbox/common/SettingsServiceHelper$Companion;->getPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public final set(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/mapbox/common/SettingsServiceHelper$Companion;->get(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Key is not found"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/mapbox/bindgen/ExpectedFactory;->createError(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "createError(existingValue.error!!)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->isValue()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/mapbox/bindgen/ExpectedFactory;->createValue(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "createValue(listOf(value))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_1
    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->isValue()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    :try_start_0
    invoke-direct {p0}, Lcom/mapbox/common/SettingsServiceHelper$Companion;->getPreferences()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/mapbox/bindgen/ExpectedFactory;->createValue(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "createValue(listOf(oldValue))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    const-string p1, "Unknown error"

    :cond_3
    invoke-static {p1}, Lcom/mapbox/bindgen/ExpectedFactory;->createError(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "createError(exception.message ?: \"Unknown error\")"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
