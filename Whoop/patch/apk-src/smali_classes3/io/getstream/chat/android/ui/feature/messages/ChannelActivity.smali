.class public Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u0019\u0010\u0008\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014\u00a2\u0006\u0004\u0008\u0008\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\nH\u0014\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;",
        "Lm/m;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "setupEdgeToEdge",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "",
        "cid",
        "messageId",
        "Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;",
        "createChannelFragment",
        "(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;

.field private static final EXTRA_CID:Ljava/lang/String; = "extra_cid"

.field private static final EXTRA_MESSAGE_ID:Ljava/lang/String; = "extra_message_id"


# instance fields
.field private binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;->Companion:Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lm/m;-><init>()V

    return-void
.end method

.method private static final createChannelFragment$lambda$1(Ljava/lang/String;Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;)Ll83/a0;
    .locals 1

    const-string v0, "$this$newInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;-><init>()V

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;->setFragment(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;->showHeader(Z)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;

    invoke-virtual {p1, p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;->messageId(Ljava/lang/String;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final createIntent(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1

    .line 1
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;->Companion:Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;

    invoke-virtual {v0, p0, p1}, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;->createIntent(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static final createIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1

    .line 2
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;->Companion:Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;->createIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static final createIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Landroid/content/Intent;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;",
            ">;)",
            "Landroid/content/Intent;"
        }
    .end annotation

    .line 3
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;->Companion:Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;

    invoke-virtual {v0, p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;->createIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Ljava/lang/String;Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;->createChannelFragment$lambda$1(Ljava/lang/String;Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;)Ll83/a0;

    return-void
.end method

.method private final setupEdgeToEdge()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0xf

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/ViewKt;->applyEdgeToEdgePadding(Landroid/view/View;I)V

    return-void

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method


# virtual methods
.method public final createChannelFragment(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;
    .locals 3

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Companion;

    new-instance v1, Lht2/d;

    const/16 v2, 0xa

    invoke-direct {v1, p2, v2}, Lht2/d;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Companion;->newInstance(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    move-result-object p1

    return-object p1
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {p0, v0}, Lm/m;->setContentView(Landroid/view/View;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;->setupEdgeToEdge()V

    if-nez p1, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "extra_cid"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "extra_message_id"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v1

    invoke-static {v1, v1}, Lr;->g(Landroidx/fragment/app/o1;Landroidx/fragment/app/o1;)Landroidx/fragment/app/a;

    move-result-object v1

    sget v3, Lio/getstream/chat/android/ui/R$id;->container:I

    invoke-virtual {p0, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;->createChannelFragment(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    move-result-object p1

    invoke-virtual {v1, v3, p1, v2}, Landroidx/fragment/app/c2;->e(ILandroidx/fragment/app/m0;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroidx/fragment/app/a;->j()I

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Channel cid must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method
