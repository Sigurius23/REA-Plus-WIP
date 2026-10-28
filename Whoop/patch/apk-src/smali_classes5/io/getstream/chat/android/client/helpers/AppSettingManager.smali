.class public final Lio/getstream/chat/android/client/helpers/AppSettingManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/helpers/AppSettingManager$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\u000c\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/chat/android/client/helpers/AppSettingManager;",
        "",
        "Lio/getstream/chat/android/client/api/ChatApi;",
        "chatApi",
        "<init>",
        "(Lio/getstream/chat/android/client/api/ChatApi;)V",
        "Ll83/a0;",
        "loadAppSettings",
        "()V",
        "Lio/getstream/chat/android/models/AppSettings;",
        "getAppSettings",
        "()Lio/getstream/chat/android/models/AppSettings;",
        "clear",
        "Lio/getstream/chat/android/client/api/ChatApi;",
        "appSettings",
        "Lio/getstream/chat/android/models/AppSettings;",
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
.field public static final Companion:Lio/getstream/chat/android/client/helpers/AppSettingManager$Companion;

.field private static final TAG:Ljava/lang/String; = "Chat:AppSettingManager"


# instance fields
.field private appSettings:Lio/getstream/chat/android/models/AppSettings;

.field private final chatApi:Lio/getstream/chat/android/client/api/ChatApi;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/helpers/AppSettingManager$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/helpers/AppSettingManager;->Companion:Lio/getstream/chat/android/client/helpers/AppSettingManager$Companion;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/api/ChatApi;)V
    .locals 1

    const-string v0, "chatApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/helpers/AppSettingManager;->chatApi:Lio/getstream/chat/android/client/api/ChatApi;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/helpers/AppSettingManager;Ln23/h;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/helpers/AppSettingManager;->loadAppSettings$lambda$2(Lio/getstream/chat/android/client/helpers/AppSettingManager;Ln23/h;)V

    return-void
.end method

.method private static final loadAppSettings$lambda$2(Lio/getstream/chat/android/client/helpers/AppSettingManager;Ln23/h;)V
    .locals 5

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ln23/g;

    if-eqz v0, :cond_0

    check-cast p1, Ln23/g;

    invoke-virtual {p1}, Ln23/g;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/AppSettings;

    iput-object p1, p0, Lio/getstream/chat/android/client/helpers/AppSettingManager;->appSettings:Lio/getstream/chat/android/models/AppSettings;

    return-void

    :cond_0
    instance-of p0, p1, Ln23/f;

    if-eqz p0, :cond_2

    check-cast p1, Ln23/f;

    invoke-virtual {p1}, Ln23/f;->e()Ln23/e;

    move-result-object p0

    invoke-static {p0}, Lse/h;->B(Ln23/e;)Ljava/lang/Throwable;

    move-result-object p0

    const-string v0, "Chat:AppSettingManager"

    const-string v1, "[loadAppSettings] failed: "

    if-nez p0, :cond_1

    sget-object p0, Lb23/i;->a:Lb23/i;

    sget-object p0, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    invoke-interface {p0, v2, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    sget-object p0, Lb23/i;->c:Lb23/j;

    invoke-virtual {p1}, Ln23/f;->e()Ln23/e;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v2, v0, p1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    invoke-interface {v2, v3, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Lb23/i;->c:Lb23/j;

    invoke-virtual {p1}, Ln23/f;->e()Ln23/e;

    move-result-object p1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, v3, v0, p1, p0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/client/helpers/AppSettingManager;->appSettings:Lio/getstream/chat/android/models/AppSettings;

    return-void
.end method

.method public final getAppSettings()Lio/getstream/chat/android/models/AppSettings;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/helpers/AppSettingManager;->appSettings:Lio/getstream/chat/android/models/AppSettings;

    if-nez v0, :cond_0

    sget-object v0, Lio/getstream/chat/android/client/helpers/AppSettingManager;->Companion:Lio/getstream/chat/android/client/helpers/AppSettingManager$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/helpers/AppSettingManager$Companion;->createDefaultAppSettings()Lio/getstream/chat/android/models/AppSettings;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final loadAppSettings()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/helpers/AppSettingManager;->appSettings:Lio/getstream/chat/android/models/AppSettings;

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/helpers/AppSettingManager;->chatApi:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0}, Lio/getstream/chat/android/client/api/ChatApi;->appSettings()Lo23/d;

    move-result-object v0

    new-instance v1, Lhn/p;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Lo23/d;->enqueue(Lo23/a;)V

    :cond_0
    return-void
.end method
