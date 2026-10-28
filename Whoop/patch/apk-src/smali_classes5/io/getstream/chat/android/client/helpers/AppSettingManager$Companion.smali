.class public final Lio/getstream/chat/android/client/helpers/AppSettingManager$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/helpers/AppSettingManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/getstream/chat/android/client/helpers/AppSettingManager$Companion;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "createDefaultAppSettings",
        "Lio/getstream/chat/android/models/AppSettings;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createDefaultAppSettings()Lio/getstream/chat/android/models/AppSettings;
    .locals 16

    new-instance v0, Lio/getstream/chat/android/models/AppSettings;

    new-instance v1, Lio/getstream/chat/android/models/App;

    new-instance v2, Lio/getstream/chat/android/models/FileUploadConfig;

    const-wide/32 v7, 0x6400000

    sget-object v3, Lm83/y;->w:Lm83/y;

    move-object v4, v3

    move-object v5, v3

    move-object v6, v3

    invoke-direct/range {v2 .. v8}, Lio/getstream/chat/android/models/FileUploadConfig;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;J)V

    new-instance v9, Lio/getstream/chat/android/models/FileUploadConfig;

    const-wide/32 v14, 0x6400000

    move-object v11, v3

    move-object v12, v3

    move-object v13, v3

    move-object v10, v3

    invoke-direct/range {v9 .. v15}, Lio/getstream/chat/android/models/FileUploadConfig;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;J)V

    const-string v3, ""

    invoke-direct {v1, v3, v2, v9}, Lio/getstream/chat/android/models/App;-><init>(Ljava/lang/String;Lio/getstream/chat/android/models/FileUploadConfig;Lio/getstream/chat/android/models/FileUploadConfig;)V

    invoke-direct {v0, v1}, Lio/getstream/chat/android/models/AppSettings;-><init>(Lio/getstream/chat/android/models/App;)V

    return-object v0
.end method
