.class public final Lcom/whoop/data/repositories/LanguageRepositoryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\"\u0014\u0010\u0001\u001a\u00020\u00008\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00008\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0002\"\u0014\u0010\u0008\u001a\u00020\u00008\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0002\"\u001c\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\"\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u001d\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0010\u001a\u0004\u0008\u0014\u0010\u0012\u00a8\u0006\u0015"
    }
    d2 = {
        "",
        "ALLOWED_LANGUAGES",
        "Ljava/lang/String;",
        "ACCEPT_LANGUAGE_HEADER",
        "DEFAULT_LANGUAGE",
        "ENGLISH_LANGUAGE_WITH_LOCALE",
        "ENGLISH_PSEUDOLOCALE",
        "LANGUAGE_PREFS_NAME",
        "EURO_PORTUGUESE",
        "Ljava/util/Locale;",
        "kotlin.jvm.PlatformType",
        "ARABIC",
        "Ljava/util/Locale;",
        "Lf6/d;",
        "",
        "KEY_SHOW_LANGUAGE_MODAL",
        "Lf6/d;",
        "getKEY_SHOW_LANGUAGE_MODAL",
        "()Lf6/d;",
        "KEY_USER_LANGUAGE_OVERRIDE",
        "getKEY_USER_LANGUAGE_OVERRIDE",
        "core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final ACCEPT_LANGUAGE_HEADER:Ljava/lang/String; = "ACCEPT_LANGUAGE_HEADER"

.field public static final ALLOWED_LANGUAGES:Ljava/lang/String; = "ALLOWED_LANGUAGES"

.field private static final ARABIC:Ljava/util/Locale;

.field public static final DEFAULT_LANGUAGE:Ljava/lang/String; = "en"

.field public static final ENGLISH_LANGUAGE_WITH_LOCALE:Ljava/lang/String; = "en-us"

.field private static final ENGLISH_PSEUDOLOCALE:Ljava/lang/String; = "en-XA"

.field public static final EURO_PORTUGUESE:Ljava/lang/String; = "pt-PT"

.field private static final KEY_SHOW_LANGUAGE_MODAL:Lf6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/d;"
        }
    .end annotation
.end field

.field private static final KEY_USER_LANGUAGE_OVERRIDE:Lf6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/d;"
        }
    .end annotation
.end field

.field public static final LANGUAGE_PREFS_NAME:Ljava/lang/String; = "LanguagePrefs"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "ar"

    invoke-static {v0}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v0

    sput-object v0, Lcom/whoop/data/repositories/LanguageRepositoryKt;->ARABIC:Ljava/util/Locale;

    const-string v0, "ShowLanguageModal"

    invoke-static {v0}, Lge3/g;->f(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Lcom/whoop/data/repositories/LanguageRepositoryKt;->KEY_SHOW_LANGUAGE_MODAL:Lf6/d;

    const-string v0, "user-did-in-app-language-picker-override"

    invoke-static {v0}, Lge3/g;->f(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Lcom/whoop/data/repositories/LanguageRepositoryKt;->KEY_USER_LANGUAGE_OVERRIDE:Lf6/d;

    return-void
.end method

.method public static final synthetic access$getARABIC$p()Ljava/util/Locale;
    .locals 1

    sget-object v0, Lcom/whoop/data/repositories/LanguageRepositoryKt;->ARABIC:Ljava/util/Locale;

    return-object v0
.end method

.method public static final getKEY_SHOW_LANGUAGE_MODAL()Lf6/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lf6/d;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/data/repositories/LanguageRepositoryKt;->KEY_SHOW_LANGUAGE_MODAL:Lf6/d;

    return-object v0
.end method

.method public static final getKEY_USER_LANGUAGE_OVERRIDE()Lf6/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lf6/d;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/data/repositories/LanguageRepositoryKt;->KEY_USER_LANGUAGE_OVERRIDE:Lf6/d;

    return-object v0
.end method
