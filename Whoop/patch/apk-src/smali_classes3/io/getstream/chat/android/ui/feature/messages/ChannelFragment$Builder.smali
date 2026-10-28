.class public final Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00002\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\tJ\u001d\u0010\u000f\u001a\u00020\u0000\"\u0008\u0008\u0000\u0010\u0010*\u00020\u000c2\u0006\u0010\u000b\u001a\u0002H\u0010\u00a2\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u000cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;",
        "",
        "cid",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "themeResId",
        "",
        "showHeader",
        "",
        "messageId",
        "fragment",
        "Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;",
        "threadLoadOlderToNewer",
        "customTheme",
        "setFragment",
        "T",
        "(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;",
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
.field private final cid:Ljava/lang/String;

.field private fragment:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

.field private messageId:Ljava/lang/String;

.field private showHeader:Z

.field private themeResId:I

.field private threadLoadOlderToNewer:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;->cid:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final build()Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;
    .locals 8

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;->fragment:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    if-nez v0, :cond_0

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;-><init>()V

    :cond_0
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;->themeResId:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v3, "theme_res_id"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;->cid:Ljava/lang/String;

    new-instance v3, Ll83/k;

    const-string v4, "cid"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;->messageId:Ljava/lang/String;

    new-instance v4, Ll83/k;

    const-string v5, "message_id"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;->showHeader:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    new-instance v5, Ll83/k;

    const-string v6, "show_header"

    invoke-direct {v5, v6, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;->threadLoadOlderToNewer:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    new-instance v6, Ll83/k;

    const-string v7, "thread_load_older_to_newer"

    invoke-direct {v6, v7, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v4, v5, v6}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/m0;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public final customTheme(I)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;->themeResId:I

    return-object p0
.end method

.method public final messageId(Ljava/lang/String;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;->messageId:Ljava/lang/String;

    return-object p0
.end method

.method public final setFragment(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;",
            ">(TT;)",
            "Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;"
        }
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;->fragment:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    return-object p0
.end method

.method public final showHeader(Z)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;->showHeader:Z

    return-object p0
.end method

.method public final threadLoadOlderToNewer(Z)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;->threadLoadOlderToNewer:Z

    return-object p0
.end method
