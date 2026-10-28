.class public final Lio/getstream/chat/android/ui/initializer/ChatUIInitializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyb/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lyb/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0008\u0001\u0012\u0006\u0012\u0002\u0008\u00030\u00010\n0\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/initializer/ChatUIInitializer;",
        "Lyb/b;",
        "Ll83/a0;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "create",
        "(Landroid/content/Context;)V",
        "",
        "Ljava/lang/Class;",
        "dependencies",
        "()Ljava/util/List;",
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic create(Landroid/content/Context;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/initializer/ChatUIInitializer;->create(Landroid/content/Context;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final create(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    sget-object v1, Lio/getstream/chat/android/client/header/VersionPrefixHeader$UiComponents;->INSTANCE:Lio/getstream/chat/android/client/header/VersionPrefixHeader$UiComponents;

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/ChatClient$Companion;->setVERSION_PREFIX_HEADER(Lio/getstream/chat/android/client/header/VersionPrefixHeader;)V

    .line 3
    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    sput-object p1, Lio/getstream/chat/android/ui/ChatUI;->appContext:Landroid/content/Context;

    return-void
.end method

.method public final dependencies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Lyb/b;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method
