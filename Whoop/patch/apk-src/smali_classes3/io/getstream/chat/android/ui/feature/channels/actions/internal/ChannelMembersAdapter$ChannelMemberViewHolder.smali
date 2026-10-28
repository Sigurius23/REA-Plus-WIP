.class public final Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ChannelMemberViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\rR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000eR\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u000c\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;",
        "Landroidx/recyclerview/widget/o2;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemChannelMemberBinding;",
        "binding",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/Member;",
        "Ll83/a0;",
        "onMemberClicked",
        "<init>",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiItemChannelMemberBinding;Lkotlin/jvm/functions/Function1;)V",
        "member",
        "bind",
        "(Lio/getstream/chat/android/models/Member;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemChannelMemberBinding;",
        "Lkotlin/jvm/functions/Function1;",
        "Lio/getstream/chat/android/models/Member;",
        "getMember",
        "()Lio/getstream/chat/android/models/Member;",
        "setMember",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemChannelMemberBinding;

.field public member:Lio/getstream/chat/android/models/Member;

.field private final onMemberClicked:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemChannelMemberBinding;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemChannelMemberBinding;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onMemberClicked"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemChannelMemberBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemChannelMemberBinding;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;->onMemberClicked:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemChannelMemberBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object p1

    new-instance p2, Lb30/k3;

    const/16 v0, 0x8

    invoke-direct {p2, p0, v0}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;->onMemberClicked:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static a(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;->onMemberClicked:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/models/Member;)V
    .locals 5

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;->member:Lio/getstream/chat/android/models/Member;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemChannelMemberBinding;

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemChannelMemberBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, p1, v4, v2, v3}, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;->setUser$default(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/models/User;ZILjava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemChannelMemberBinding;->userNameTextView:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final getMember()Lio/getstream/chat/android/models/Member;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;->member:Lio/getstream/chat/android/models/Member;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "member"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final setMember(Lio/getstream/chat/android/models/Member;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;->member:Lio/getstream/chat/android/models/Member;

    return-void
.end method
