.class public abstract Lio/getstream/chat/android/client/header/VersionPrefixHeader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/header/VersionPrefixHeader$Compose;,
        Lio/getstream/chat/android/client/header/VersionPrefixHeader$Default;,
        Lio/getstream/chat/android/client/header/VersionPrefixHeader$UiComponents;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0003\u0008\t\nB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0003\u000b\u000c\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/getstream/chat/android/client/header/VersionPrefixHeader;",
        "",
        "<init>",
        "()V",
        "prefix",
        "",
        "getPrefix",
        "()Ljava/lang/String;",
        "Default",
        "UiComponents",
        "Compose",
        "Lio/getstream/chat/android/client/header/VersionPrefixHeader$Compose;",
        "Lio/getstream/chat/android/client/header/VersionPrefixHeader$Default;",
        "Lio/getstream/chat/android/client/header/VersionPrefixHeader$UiComponents;",
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
.method public abstract getPrefix()Ljava/lang/String;
.end method
