.class public interface abstract Lio/getstream/chat/android/ui/helper/CurrentUserProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/helper/CurrentUserProvider$Companion;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00e7\u0080\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&\u00a8\u0006\u0005\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/helper/CurrentUserProvider;",
        "",
        "getCurrentUser",
        "Lio/getstream/chat/android/models/User;",
        "Companion",
        "stream-chat-android-ui-components_release"
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
.field public static final Companion:Lio/getstream/chat/android/ui/helper/CurrentUserProvider$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/helper/CurrentUserProvider$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/helper/CurrentUserProvider$Companion;

    sput-object v0, Lio/getstream/chat/android/ui/helper/CurrentUserProvider;->Companion:Lio/getstream/chat/android/ui/helper/CurrentUserProvider$Companion;

    return-void
.end method


# virtual methods
.method public abstract getCurrentUser()Lio/getstream/chat/android/models/User;
.end method
