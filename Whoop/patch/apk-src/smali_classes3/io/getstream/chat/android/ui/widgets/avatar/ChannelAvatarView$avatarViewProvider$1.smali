.class public final Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$avatarViewProvider$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarViewProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016J\u0016\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "io/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$avatarViewProvider$1",
        "Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarViewProvider;",
        "regular",
        "Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;",
        "singleUser",
        "Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;",
        "userGroup",
        "",
        "userCount",
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
.field final synthetic this$0:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$avatarViewProvider$1;->this$0:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final regular()Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$avatarViewProvider$1;->this$0:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->access$createImageViews(Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;I)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;

    return-object v0
.end method

.method public final singleUser()Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$avatarViewProvider$1;->this$0:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;

    invoke-static {v0}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->access$createUserView(Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;)Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    move-result-object v0

    return-object v0
.end method

.method public final userGroup(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$avatarViewProvider$1;->this$0:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->access$createImageViews(Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
