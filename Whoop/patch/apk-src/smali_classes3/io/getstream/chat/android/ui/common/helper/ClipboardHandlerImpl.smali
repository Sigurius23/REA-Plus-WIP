.class public final Lio/getstream/chat/android/ui/common/helper/ClipboardHandlerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/helper/ClipboardHandler;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0011R\u001c\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/helper/ClipboardHandlerImpl;",
        "Lio/getstream/chat/android/ui/common/helper/ClipboardHandler;",
        "Landroid/content/ClipboardManager;",
        "clipboardManager",
        "",
        "autoTranslationEnabled",
        "Lkotlin/Function0;",
        "Lio/getstream/chat/android/models/User;",
        "getCurrentUser",
        "<init>",
        "(Landroid/content/ClipboardManager;ZLc93/a;)V",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "Ll83/a0;",
        "copyMessage",
        "(Lio/getstream/chat/android/models/Message;)V",
        "Landroid/content/ClipboardManager;",
        "Z",
        "Lc93/a;",
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
.field private final autoTranslationEnabled:Z

.field private final clipboardManager:Landroid/content/ClipboardManager;

.field private final getCurrentUser:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/ClipboardManager;ZLc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/ClipboardManager;",
            "Z",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "clipboardManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getCurrentUser"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/helper/ClipboardHandlerImpl;->clipboardManager:Landroid/content/ClipboardManager;

    .line 3
    iput-boolean p2, p0, Lio/getstream/chat/android/ui/common/helper/ClipboardHandlerImpl;->autoTranslationEnabled:Z

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/ui/common/helper/ClipboardHandlerImpl;->getCurrentUser:Lc93/a;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/ClipboardManager;ZLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x1

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 5
    sget-object p3, Lio/getstream/chat/android/ui/common/helper/ClipboardHandlerImpl$1;->INSTANCE:Lio/getstream/chat/android/ui/common/helper/ClipboardHandlerImpl$1;

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/helper/ClipboardHandlerImpl;-><init>(Landroid/content/ClipboardManager;ZLc93/a;)V

    return-void
.end method


# virtual methods
.method public final copyMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 3

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/helper/ClipboardHandlerImpl;->autoTranslationEnabled:Z

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/helper/ClipboardHandlerImpl;->getCurrentUser:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/User;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getLanguage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/models/Message;->getTranslation(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v1

    :cond_0
    if-nez v1, :cond_3

    :cond_1
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v1

    :cond_3
    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/common/helper/ClipboardHandlerImpl;->clipboardManager:Landroid/content/ClipboardManager;

    invoke-static {v0, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    return-void
.end method
