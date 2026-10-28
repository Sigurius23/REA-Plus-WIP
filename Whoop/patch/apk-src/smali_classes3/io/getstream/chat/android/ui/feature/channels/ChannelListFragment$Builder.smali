.class public final Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u0007J\u0010\u0010\t\u001a\u00020\u00002\u0008\u0010\t\u001a\u0004\u0018\u00010\nJ\u001d\u0010\u000e\u001a\u00020\u0000\"\u0008\u0008\u0000\u0010\u000f*\u00020\u000c2\u0006\u0010\u000b\u001a\u0002H\u000f\u00a2\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u000cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;",
        "",
        "<init>",
        "()V",
        "themeResId",
        "",
        "showHeader",
        "",
        "showSearch",
        "headerTitle",
        "",
        "fragment",
        "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;",
        "customTheme",
        "setFragment",
        "T",
        "(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;",
        "build",
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
.field private fragment:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;

.field private headerTitle:Ljava/lang/String;

.field private showHeader:Z

.field private showSearch:Z

.field private themeResId:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;->showHeader:Z

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;->showSearch:Z

    return-void
.end method


# virtual methods
.method public final build()Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;->fragment:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;

    if-nez v0, :cond_0

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;-><init>()V

    :cond_0
    iget v1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;->themeResId:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v3, "theme_res_id"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;->showHeader:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    new-instance v3, Ll83/k;

    const-string v4, "show_header"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;->showSearch:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    new-instance v4, Ll83/k;

    const-string v5, "show_search"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;->headerTitle:Ljava/lang/String;

    new-instance v5, Ll83/k;

    const-string v6, "header_title"

    invoke-direct {v5, v6, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v4, v5}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/m0;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public final customTheme(I)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;->themeResId:I

    return-object p0
.end method

.method public final headerTitle(Ljava/lang/String;)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;->headerTitle:Ljava/lang/String;

    return-object p0
.end method

.method public final setFragment(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;",
            ">(TT;)",
            "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;"
        }
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;->fragment:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;

    return-object p0
.end method

.method public final showHeader(Z)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;->showHeader:Z

    return-object p0
.end method

.method public final showSearch(Z)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;->showSearch:Z

    return-object p0
.end method
