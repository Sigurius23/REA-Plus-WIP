.class public final Lio/getstream/chat/android/ui/common/helper/CopyToClipboardHandlerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/helper/CopyToClipboardHandler;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000eR\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/helper/CopyToClipboardHandlerImpl;",
        "Lio/getstream/chat/android/ui/common/helper/CopyToClipboardHandler;",
        "Landroid/content/Context;",
        "context",
        "Lkotlin/Function0;",
        "Landroid/content/ClipboardManager;",
        "clipboardManagerProvider",
        "<init>",
        "(Landroid/content/Context;Lc93/a;)V",
        "",
        "text",
        "Ll83/a0;",
        "copy",
        "(Ljava/lang/String;)V",
        "Landroid/content/Context;",
        "Lc93/a;",
        "getClipboardManager",
        "()Landroid/content/ClipboardManager;",
        "clipboardManager",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final clipboardManagerProvider:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clipboardManagerProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/helper/CopyToClipboardHandlerImpl;->context:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/helper/CopyToClipboardHandlerImpl;->clipboardManagerProvider:Lc93/a;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    new-instance p2, Lio/getstream/chat/android/ui/common/helper/b;

    const/4 p3, 0x1

    invoke-direct {p2, p1, p3}, Lio/getstream/chat/android/ui/common/helper/b;-><init>(Ljava/lang/Object;I)V

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/helper/CopyToClipboardHandlerImpl;-><init>(Landroid/content/Context;Lc93/a;)V

    return-void
.end method

.method private static final _init_$lambda$0(Landroid/content/Context;)Landroid/content/ClipboardManager;
    .locals 1

    const-class v0, Landroid/content/ClipboardManager;

    invoke-static {p0, v0}, Ls4/c;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    check-cast p0, Landroid/content/ClipboardManager;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic a(Landroid/content/Context;)Landroid/content/ClipboardManager;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/helper/CopyToClipboardHandlerImpl;->_init_$lambda$0(Landroid/content/Context;)Landroid/content/ClipboardManager;

    move-result-object p0

    return-object p0
.end method

.method private final getClipboardManager()Landroid/content/ClipboardManager;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/CopyToClipboardHandlerImpl;->clipboardManagerProvider:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    return-object v0
.end method


# virtual methods
.method public final copy(Ljava/lang/String;)V
    .locals 2

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/helper/CopyToClipboardHandlerImpl;->getClipboardManager()Landroid/content/ClipboardManager;

    move-result-object v0

    const-string v1, "plain text"

    invoke-static {v1, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    return-void
.end method
