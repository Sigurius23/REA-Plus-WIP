.class public final Lio/getstream/chat/android/client/user/storage/SharedPreferencesCredentialStorage;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/user/storage/UserCredentialStorage;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/user/storage/SharedPreferencesCredentialStorage$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/client/user/storage/SharedPreferencesCredentialStorage;",
        "Lio/getstream/chat/android/client/user/storage/UserCredentialStorage;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Lio/getstream/chat/android/client/user/CredentialConfig;",
        "get",
        "()Lio/getstream/chat/android/client/user/CredentialConfig;",
        "Ll83/a0;",
        "clear",
        "()V",
        "credentialConfig",
        "put",
        "(Lio/getstream/chat/android/client/user/CredentialConfig;)V",
        "Landroid/content/SharedPreferences;",
        "prefs",
        "Landroid/content/SharedPreferences;",
        "Companion",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lio/getstream/chat/android/client/user/storage/SharedPreferencesCredentialStorage$Companion;

.field private static final KEY_IS_ANONYMOUS:Ljava/lang/String; = "is_anonymous"

.field private static final KEY_USER_ID:Ljava/lang/String; = "user_id"

.field private static final KEY_USER_NAME:Ljava/lang/String; = "user_name"

.field private static final KEY_USER_TOKEN:Ljava/lang/String; = "user_token"

.field private static final SYNC_CONFIG_PREFS_NAME:Ljava/lang/String; = "stream_credential_config_store"


# instance fields
.field private final prefs:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/user/storage/SharedPreferencesCredentialStorage$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/user/storage/SharedPreferencesCredentialStorage;->Companion:Lio/getstream/chat/android/client/user/storage/SharedPreferencesCredentialStorage$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "stream_credential_config_store"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "getSharedPreferences(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/user/storage/SharedPreferencesCredentialStorage;->prefs:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/user/storage/SharedPreferencesCredentialStorage;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final get()Lio/getstream/chat/android/client/user/CredentialConfig;
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/client/user/storage/SharedPreferencesCredentialStorage;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "user_id"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    move-object v1, v2

    :cond_0
    const-string v3, "user_token"

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    move-object v3, v2

    :cond_1
    const-string v4, "user_name"

    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    move-object v2, v4

    :goto_0
    const-string v4, "is_anonymous"

    const/4 v5, 0x0

    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    new-instance v4, Lio/getstream/chat/android/client/user/CredentialConfig;

    invoke-direct {v4, v1, v3, v2, v0}, Lio/getstream/chat/android/client/user/CredentialConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v4}, Lio/getstream/chat/android/client/user/CredentialConfig;->isValid$stream_chat_android_client_release()Z

    move-result v0

    if-eqz v0, :cond_3

    return-object v4

    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public final put(Lio/getstream/chat/android/client/user/CredentialConfig;)V
    .locals 3

    const-string v0, "credentialConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/user/storage/SharedPreferencesCredentialStorage;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "user_id"

    invoke-virtual {p1}, Lio/getstream/chat/android/client/user/CredentialConfig;->getUserId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v1, "user_token"

    invoke-virtual {p1}, Lio/getstream/chat/android/client/user/CredentialConfig;->getUserToken()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v1, "user_name"

    invoke-virtual {p1}, Lio/getstream/chat/android/client/user/CredentialConfig;->getUserName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v1, "is_anonymous"

    invoke-virtual {p1}, Lio/getstream/chat/android/client/user/CredentialConfig;->isAnonymous()Z

    move-result p1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
