.class final Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0082\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$Companion;",
        "",
        "<init>",
        "()V",
        "Landroid/widget/FrameLayout$LayoutParams;",
        "defaultChildLayoutParams$delegate",
        "Ll83/h;",
        "getDefaultChildLayoutParams",
        "()Landroid/widget/FrameLayout$LayoutParams;",
        "defaultChildLayoutParams",
        "",
        "KEY_SUPER_STATE",
        "Ljava/lang/String;",
        "KEY_SCROLL_STATE",
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

.method public static final synthetic access$getDefaultChildLayoutParams(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$Companion;)Landroid/widget/FrameLayout$LayoutParams;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$Companion;->getDefaultChildLayoutParams()Landroid/widget/FrameLayout$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method private final getDefaultChildLayoutParams()Landroid/widget/FrameLayout$LayoutParams;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->access$getDefaultChildLayoutParams$delegate$cp()Ll83/h;

    move-result-object v0

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    return-object v0
.end method
