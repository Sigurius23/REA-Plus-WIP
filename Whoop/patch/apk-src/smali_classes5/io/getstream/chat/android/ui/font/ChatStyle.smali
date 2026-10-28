.class public final Lio/getstream/chat/android/ui/font/ChatStyle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/font/ChatStyle;",
        "",
        "<init>",
        "()V",
        "defaultTextStyle",
        "Lio/getstream/chat/android/ui/font/TextStyle;",
        "getDefaultTextStyle",
        "()Lio/getstream/chat/android/ui/font/TextStyle;",
        "setDefaultTextStyle",
        "(Lio/getstream/chat/android/ui/font/TextStyle;)V",
        "hasDefaultFont",
        "",
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


# instance fields
.field private defaultTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDefaultTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/font/ChatStyle;->defaultTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final hasDefaultFont()Z
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/font/ChatStyle;->defaultTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/font/TextStyle;->hasFont()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public final setDefaultTextStyle(Lio/getstream/chat/android/ui/font/TextStyle;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/font/ChatStyle;->defaultTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-void
.end method
