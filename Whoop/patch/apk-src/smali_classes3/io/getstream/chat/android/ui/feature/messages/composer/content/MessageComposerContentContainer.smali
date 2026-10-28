.class public interface abstract Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ld93/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
        ">;",
        "Ld93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008f\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0008\u0010\u0010\u001a\u00020\u0011H&J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0014H&R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0002X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0005R\u0014\u0010\u0008\u001a\u0004\u0018\u00010\u0002X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0005R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0002X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0005R\u0014\u0010\u000c\u001a\u0004\u0018\u00010\u0002X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u0005R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0002X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0005\u00a8\u0006\u0015\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainer;",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
        "center",
        "getCenter",
        "()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
        "centerOverlap",
        "getCenterOverlap",
        "leading",
        "getLeading",
        "trailing",
        "getTrailing",
        "header",
        "getHeader",
        "footer",
        "getFooter",
        "asView",
        "Landroid/view/View;",
        "findViewByKey",
        "key",
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


# virtual methods
.method public abstract asView()Landroid/view/View;
.end method

.method public abstract findViewByKey(Ljava/lang/String;)Landroid/view/View;
.end method

.method public abstract getCenter()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;
.end method

.method public abstract getCenterOverlap()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;
.end method

.method public abstract getFooter()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;
.end method

.method public abstract getHeader()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;
.end method

.method public abstract getLeading()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;
.end method

.method public abstract getTrailing()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;
.end method
